package com.flansmod.client;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.*;
import org.lwjgl.util.glu.GLU;

/** Native offscreen depth/composite check. Does not claim a Minecraft gameplay test. */
public final class PlayerLodGpuChecks {
    private static final int SIZE = 128;
    private static final PlayerLodDepthLayer layer = new PlayerLodDepthLayer();
    private static final FloatBuffer modelview = BufferUtils.createFloatBuffer(16);
    private static final FloatBuffer projection = BufferUtils.createFloatBuffer(16);
    public static void main(String[] args) throws Exception {
        Pbuffer context = new Pbuffer(SIZE, SIZE, new PixelFormat().withDepthBits(24), null, null);
        try {
            context.makeCurrent();
            check(GLContext.getCapabilities().OpenGL30, "GL 3.0");
            for (float fov : new float[] {70, 10, 3.5F}) for (double distance : new double[] {112.01, 113, 114, 128, 256, 512, 1024}) {
                verify(fov, distance, false, 112);
                verify(fov, distance, true, 112);
            }
            for (boolean cover : new boolean[] {false, true}) {
                verify(10, 512, cover, 496);
                verify(10, 1024, cover, 496);
            }
            check(GL11.glGetError() == GL11.GL_NO_ERROR, "GL error state");
            System.out.println("PASS: 46 native offscreen transition-boundary, normal/scoped projection, partial-cover, self-depth, large client-distance and GL restoration scenarios.");
        } finally { context.destroy(); }
    }

    private static void verify(float fov, double distance, boolean cover, double start) {
        GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER, 0);
        GL11.glViewport(0, 0, SIZE, SIZE);
        GL11.glDisable(GL11.GL_SCISSOR_TEST); GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glDisable(GL11.GL_TEXTURE_2D); GL11.glDisable(GL11.GL_BLEND);
        GL11.glEnable(GL11.GL_DEPTH_TEST); GL11.glDepthMask(true);
        GL11.glDepthRange(0, 1); GL11.glClearColor(0, 0, 0, 0); GL11.glClearDepth(1);
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
        GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glLoadIdentity(); GLU.gluPerspective(fov, 1, 0.05F, (float)Math.max(256, start * 2 + 32));
        GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glLoadIdentity();
        modelview.clear(); projection.clear();
        GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, modelview); GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, projection);
        double scale = PlayerLodProjection.projected(distance, start) / distance;
        double low = distance - 8, high = distance + 8;
        double slope = (mapped(high, start) - mapped(low, start)) / (depth(-high * scale) - depth(-low * scale));
        double near = mapped(low, start) - slope * depth(-low * scale), far = near + slope;
        check(Double.isFinite(near) && Double.isFinite(far) && near >= 0 && far <= 1 && near < far,
                "renderer accepts transition depth range at " + distance);
        if (cover) {
            // Known terrain occupies the lower half of the player's screen footprint.
            GL11.glDepthRange(0, 1);
            GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glPushMatrix(); GL11.glLoadIdentity();
            GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glPushMatrix(); GL11.glLoadIdentity();
            GL11.glColor4f(1, 0, 0, 1);
            double z = 2 * mapped(distance - 10, start) - 1;
            GL11.glBegin(GL11.GL_QUADS);
            GL11.glVertex3d(-1, -1, z); GL11.glVertex3d(1, -1, z);
            GL11.glVertex3d(1, 0, z); GL11.glVertex3d(-1, 0, z); GL11.glEnd();
            GL11.glPopMatrix(); GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glPopMatrix();
            GL11.glMatrixMode(GL11.GL_MODELVIEW);
        }
        check(layer.begin(0, 0, -distance, 0, 0, 0, start, modelview, projection), "precision layer begins");
        GL11.glDisable(GL11.GL_TEXTURE_2D); GL11.glDisable(GL11.GL_LIGHTING); GL11.glDisable(GL11.GL_BLEND);
        GL11.glPushMatrix(); GL11.glTranslated(0, 0, -distance * scale); GL11.glScaled(scale, scale, scale);
        // Large test envelope ensures pixel coverage even at 1024 blocks / wide FOV.
        GL11.glColor4f(0, 1, 0, 1); quad(8, 0.2);
        GL11.glColor4f(0, 0, 1, 1); quad(8, 0); // Rear surface must not overwrite front armour.
        GL11.glPopMatrix();
        layer.finish(true, near, far, projection.get(10), projection.get(14));
        check(GL11.glGetInteger(GL30.GL_DRAW_FRAMEBUFFER_BINDING) == 0, "framebuffer restored");
        check(GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM) == 0, "program restored");
        ByteBuffer upper = pixel(64, 64), lower = pixel(64, 63);
        check((upper.get(1) & 255) > 240 && (upper.get(2) & 255) < 10, "head visible and front self-depth preserved");
        check((lower.get(cover ? 0 : 1) & 255) > 240, "partial terrain masks body only");
        FloatBuffer restored = BufferUtils.createFloatBuffer(16);
        GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, restored);
        for (int i = 0; i < 16; i++) check(restored.get(i) == projection.get(i), "projection restored");
    }
    private static void quad(double size, double z) {
        GL11.glBegin(GL11.GL_QUADS);
        GL11.glVertex3d(-size, -size, z); GL11.glVertex3d(size, -size, z);
        GL11.glVertex3d(size, size, z); GL11.glVertex3d(-size, size, z); GL11.glEnd();
    }
    private static ByteBuffer pixel(int x, int y) {
        ByteBuffer result = BufferUtils.createByteBuffer(4);
        GL11.glReadPixels(x, y, 1, 1, GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, result); return result;
    }
    private static double depth(double z) {
        return ((projection.get(10) * z + projection.get(14)) / (projection.get(11) * z + projection.get(15)) + 1) * 0.5;
    }
    private static double mapped(double distance, double start) {
        double base = depth(-start);
        return distance <= start ? depth(-distance) : base + (1 - base) * PlayerLodProjection.depthFraction(distance, start);
    }
    private static void check(boolean condition, String name) { if (!condition) throw new AssertionError(name); }
}
