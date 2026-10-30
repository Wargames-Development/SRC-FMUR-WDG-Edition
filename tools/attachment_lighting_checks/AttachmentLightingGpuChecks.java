package com.flansmod.client;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;
import net.minecraft.util.Vec3;
import net.minecraft.util.AxisAlignedBB;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.Pbuffer;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector4f;

/** Actual off-screen GLSL/depth checks, including a discontinuity that broke the old mesh. */
public final class AttachmentLightingGpuChecks {
    private static final int SIZE = 128;
    public static void main(String[] args) throws Exception {
        Pbuffer context = new Pbuffer(SIZE, SIZE, new PixelFormat().withDepthBits(24), null, null);
        try {
            context.makeCurrent();
            net.minecraft.client.renderer.OpenGlHelper.defaultTexUnit = GL13.GL_TEXTURE0;
            net.minecraft.client.renderer.OpenGlHelper.lightmapTexUnit = GL13.GL_TEXTURE1;
            checkSurface(128);
            checkSurface(64);
            checkHandBeam();
            System.out.println("PASS: GPU depth reconstruction, continuous light over depth steps, circular cutoff,"
                    + " shadow rejection, entity laser surface/bounds, resize, hand beam start and GL state restoration");
        } finally { context.destroy(); }
    }

    private static void checkSurface(int size) {
        GL11.glViewport(0, 0, size, size);
        GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glLoadIdentity();
        GLU.gluPerspective(70F, 1F, 0.05F, 64F);
        FloatBuffer buffer = BufferUtils.createFloatBuffer(16);
        GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, buffer);
        Matrix4f clip = new Matrix4f(); clip.load(buffer);
        GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glLoadIdentity();
        GL11.glDisable(GL11.GL_LIGHTING); GL11.glDisable(GL11.GL_FOG);
        GL11.glDisable(GL11.GL_TEXTURE_2D); GL11.glDisable(GL11.GL_CULL_FACE);
        GL11.glEnable(GL11.GL_DEPTH_TEST); GL11.glDepthMask(true);
        GL11.glClearColor(0F, 0F, 0F, 1F);
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
        GL11.glColor3f(0F, 0F, 0F);
        // Two visible planes with a sharp depth step through the beam's center.
        GL11.glBegin(GL11.GL_QUADS);
        GL11.glVertex3f(-10F, -10F, -5F); GL11.glVertex3f(0F, -10F, -5F);
        GL11.glVertex3f(0F, 10F, -5F); GL11.glVertex3f(-10F, 10F, -5F);
        GL11.glVertex3f(0F, -10F, -3F); GL11.glVertex3f(10F, -10F, -3F);
        GL11.glVertex3f(10F, 10F, -3F); GL11.glVertex3f(0F, 10F, -3F);
        GL11.glEnd();
        GL13.glActiveTexture(GL13.GL_TEXTURE3);
        FlashlightProjection.begin(clip);
        float[] shadows = new float[81]; Arrays.fill(shadows, 1F);
        check(draw(shadows, false), "Depth projection unexpectedly fell back to the old mesh");
        check(GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE) == GL13.GL_TEXTURE3, "Active texture changed");
        check(GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM) == 0, "Shader program leaked");
        check(GL11.glIsEnabled(GL11.GL_DEPTH_TEST), "Depth testing leaked");
        ByteBuffer pixels = read(size);
        int tested = 0;
        double spread = Math.tan(Math.toRadians(34D));
        for (int y = 0; y < size; y++) for (int x = 0; x < size; x++) {
            double u = ((x + 0.5D) * 2D / size - 1D) / (clip.m00 * spread);
            double v = ((y + 0.5D) * 2D / size - 1D) / (clip.m11 * spread);
            if (u * u + v * v < 0.45D) {
                check((pixels.get((y * size + x) * 4) & 255) > 40,
                        "Missing flashlight pixels at a depth transition: " + x + "," + y);
                tested++;
            }
        }
        check(tested > 500, "Coverage fixture did not test enough pixels");
        check((pixels.get(0) & 255) < 5, "Circular cutoff lit the screen corner");
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
        check(FlashlightProjection.drawLaserSpot(Vec3.createVectorHelper(0D, 0D, 0D),
                Vec3.createVectorHelper(0D, 0D, -1D), AxisAlignedBB.getBoundingBox(-0.5D, -1D, -5.5D,
                        0.5D, 1D, -4.5D), clip, 0.25F, 2F, 1F, 0F, 0F), "Entity spot shader unavailable");
        pixels = read(size);
        check((pixels.get((size / 2 * size + size / 2 - 1) * 4) & 255) > 40,
                "Laser did not project onto visible depth inside the entity bounds");
        check((pixels.get((size / 2 * size + size / 2) * 4) & 255) < 5,
                "Entity laser leaked onto foreground outside its bounds");
        check((pixels.get(0) & 255) < 5, "Entity laser leaked beyond its scissor region");
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
        Arrays.fill(shadows, 1F / 32F);
        check(draw(shadows, true), "Shadow projection unavailable");
        pixels = read(size);
        check((pixels.get((size / 2 * size + size / 2) * 4) & 255) < 5, "Remote beam lit through cover");
        check(GL11.glGetError() == GL11.GL_NO_ERROR, "GPU operation produced an OpenGL error");
    }

    private static boolean draw(float[] depths, boolean shadow) {
        return FlashlightProjection.draw(Vec3.createVectorHelper(0D, 0D, 0D),
                Vec3.createVectorHelper(0D, 0D, -1D), Vec3.createVectorHelper(1D, 0D, 0D),
                Vec3.createVectorHelper(0D, 1D, 0D), (float) Math.tan(Math.toRadians(34D)),
                32F, 1F, depths, shadow);
    }

    private static void checkHandBeam() {
        GL11.glViewport(0, 0, SIZE, SIZE);
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glLoadIdentity(); GL11.glTranslatef(0.2F, -0.1F, -0.5F);
        FloatBuffer before = BufferUtils.createFloatBuffer(16), after = BufferUtils.createFloatBuffer(16);
        GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, before);
        AttachmentLightRenderer.drawHandBeam(new Vector4f(0.4F, -0.35F, -0.5F, 1F),
                new Vector4f(0F, 0F, 0.5F, 1F), 0.65F, 1F, 0.65F);
        GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, after);
        for (int i = 0; i < 16; i++) check(before.get(i) == after.get(i), "Hand pose matrix leaked");
        ByteBuffer pixels = read(SIZE);
        int hits = 0;
        // Start is the projected socket at pixel (89.6,41.6), not a fixed screen corner.
        for (int y = 40; y <= 44; y++) for (int x = 87; x <= 91; x++)
            if ((pixels.get((y * SIZE + x) * 4 + 1) & 255) > 40) hits++;
        check(hits > 0, "Hand beam did not start at the projected emitter socket");
        check((pixels.get((10 * SIZE + 10) * 4 + 1) & 255) == 0, "Hand beam leaked into screen corner");
        check(GL11.glGetError() == GL11.GL_NO_ERROR, "Hand beam produced a GL error");
    }

    private static ByteBuffer read(int size) {
        ByteBuffer result = BufferUtils.createByteBuffer(size * size * 4);
        GL11.glReadPixels(0, 0, size, size, GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, result);
        return result;
    }

    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }
}
