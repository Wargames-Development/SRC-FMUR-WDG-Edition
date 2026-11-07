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
            checkLaserModes();
            checkSightTransparency();
            checkReticleSway();
            checkCorpseArmourPose();
            checkCloseSightDepth();
            checkHandheldModel();
            System.out.println("PASS: GPU depth reconstruction, continuous light over depth steps, circular cutoff,"
                    + " shadow rejection, gun occlusion, close-sight depth, translucent sight transmission, visible/IR laser modes, entity laser surface/bounds, resize, hand beam start, reticle sway, corpse armor pose, coplanar gun sleeve layers, handheld OBJ/texture and GL state restoration");
        } finally { context.destroy(); }
    }

    private static void checkSurface(int size) {
        GL11.glViewport(0, 0, size, size);
        GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glLoadIdentity();
        GLU.gluPerspective(110F, 1F, 0.05F, 64F);
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
        double spread = Math.tan(Math.toRadians(50D));
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
                        0.5D, 1D, -4.5D), clip, 0.5F, 2F, 1F, 0F, 0F), "Entity spot shader unavailable");
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
        // World depth was captured before drawing this stand-in for the first-person gun.
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
        GL11.glDepthMask(true); GL11.glDepthFunc(GL11.GL_LESS);
        GL11.glColor3f(0.25F, 0F, 0F);
        GL11.glBegin(GL11.GL_QUADS);
        GL11.glVertex3f(-0.5F, -0.5F, -1F); GL11.glVertex3f(0.5F, -0.5F, -1F);
        GL11.glVertex3f(0.5F, 0.5F, -1F); GL11.glVertex3f(-0.5F, 0.5F, -1F);
        GL11.glEnd();
        int center = (size / 2 * size + size / 2 - 1) * 4;
        int gunRed = read(size).get(center) & 255;
        check(draw(shadows, false), "Gun occlusion projection unavailable");
        pixels = read(size);
        check((pixels.get(center) & 255) == gunRed && (pixels.get(center + 1) & 255) == 0,
                "Flashlight painted over the first-person gun");
        check((pixels.get((size / 2 * size + size * 3 / 4) * 4) & 255) > 20,
                "Gun occlusion suppressed the illuminated world");
        check(GL11.glGetInteger(GL11.GL_DEPTH_FUNC) == GL11.GL_LESS, "Projection leaked its depth function");
        check(GL11.glGetError() == GL11.GL_NO_ERROR, "GPU operation produced an OpenGL error");
    }

    private static boolean draw(float[] depths, boolean shadow) {
        return FlashlightProjection.draw(Vec3.createVectorHelper(0D, 0D, 0D),
                Vec3.createVectorHelper(0D, 0D, -1D), Vec3.createVectorHelper(1D, 0D, 0D),
                Vec3.createVectorHelper(0D, 1D, 0D), (float) Math.tan(Math.toRadians(50D)),
                32F, 1F, depths, shadow);
    }

    private static void checkHandBeam() throws Exception {
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
        java.lang.reflect.Field nv = AttachmentLightRenderer.class.getDeclaredField("nightVisionActive");
        nv.setAccessible(true);
        java.lang.reflect.Field allocatorField = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        allocatorField.setAccessible(true);
        Object visibleLaser = ((sun.misc.Unsafe) allocatorField.get(null)).allocateInstance(
                com.flansmod.common.guns.type.AttachmentType.class);
        java.lang.reflect.Method draw = AttachmentLightRenderer.class.getDeclaredMethod("drawHandLaser",
                Vector4f.class, Vector4f.class, float.class, float.class, float.class,
                com.flansmod.common.guns.type.AttachmentType.class, net.minecraft.util.MovingObjectPosition.class,
                Vec3.class, Vec3.class);
        draw.setAccessible(true);
        for (boolean nightVision : new boolean[] {false, true}) {
            nv.setBoolean(null, nightVision);
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
            draw.invoke(null, new Vector4f(0.4F, -0.35F, -0.5F, 1F), new Vector4f(0F, 0F, 0.5F, 1F),
                    0.65F, 1F, 0.65F, visibleLaser, null, null, null);
            pixels = read(SIZE);
            boolean lit = (pixels.get((42 * SIZE + 89) * 4 + 1) & 255) > 40;
            check(lit == nightVision, "Visible laser beam must appear only under night vision");
        }
        nv.setBoolean(null, false);
    }

    private static void checkLaserModes() throws Exception {
        java.lang.reflect.Field allocatorField = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        allocatorField.setAccessible(true);
        com.flansmod.common.guns.type.AttachmentType laser = (com.flansmod.common.guns.type.AttachmentType)
                ((sun.misc.Unsafe) allocatorField.get(null)).allocateInstance(com.flansmod.common.guns.type.AttachmentType.class);
        laser.isLaserPointer = true; laser.laserBrightness = 5F; laser.laserDotScale = 1F;
        java.lang.reflect.Field nv = AttachmentLightRenderer.class.getDeclaredField("nightVisionActive");
        nv.setAccessible(true);
        java.lang.reflect.Field worldClip = AttachmentLightRenderer.class.getDeclaredField("WORLD_CLIP");
        worldClip.setAccessible(true); ((Matrix4f) worldClip.get(null)).setIdentity();
        java.lang.reflect.Field camera = AttachmentLightRenderer.class.getDeclaredField("cameraPosition");
        camera.setAccessible(true); camera.set(null, Vec3.createVectorHelper(0D, 0D, 0D));
        java.lang.reflect.Method draw = AttachmentLightRenderer.class.getDeclaredMethod("drawHandLaser",
                Vector4f.class, Vector4f.class, float.class, float.class, float.class,
                laser.getClass(), net.minecraft.util.MovingObjectPosition.class, Vec3.class, Vec3.class);
        draw.setAccessible(true);
        net.minecraft.util.MovingObjectPosition hit = new net.minecraft.util.MovingObjectPosition(
                0, 0, 0, 3, Vec3.createVectorHelper(0D, 0D, 0D));
        GL11.glViewport(0, 0, SIZE, SIZE);
        GL11.glDepthMask(true); GL11.glClear(GL11.GL_DEPTH_BUFFER_BIT);
        for (boolean infrared : new boolean[] {false, true}) for (boolean nightVision : new boolean[] {false, true}) {
            laser.infrared = infrared; nv.setBoolean(null, nightVision);
            GL11.glShadeModel(GL11.GL_FLAT); // Vanilla's item pass can leave flat shading enabled.
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
            draw.invoke(null, new Vector4f(0.4F, -0.35F, -0.5F, 1F), new Vector4f(0F, 0F, 0.5F, 1F),
                    0F, 1F, 0F, laser, hit, Vec3.createVectorHelper(0D, 0D, -0.5D),
                    Vec3.createVectorHelper(0D, 0D, 1D));
            ByteBuffer pixels = read(SIZE);
            boolean dot = (pixels.get((63 * SIZE + 63) * 4 + 1) & 255) > 5;
            boolean beam = (pixels.get((42 * SIZE + 89) * 4 + 1) & 255) > 40;
            check(dot == (!infrared || nightVision), "Incorrect surface-dot visibility for visible/IR laser");
            check(beam == nightVision, "Incorrect beam visibility for visible/IR laser");
            check(GL11.glGetInteger(GL11.GL_SHADE_MODEL) == GL11.GL_FLAT, "Laser changed the caller's shading mode");
        }
        GL11.glShadeModel(GL11.GL_SMOOTH);
        nv.setBoolean(null, false);
    }

    private static void checkSightTransparency() throws Exception {
        GL11.glViewport(0, 0, SIZE, SIZE);
        GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glLoadIdentity();
        GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glLoadIdentity();
        GL11.glDisable(GL11.GL_TEXTURE_2D); GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glDisable(GL11.GL_ALPHA_TEST); GL11.glDisable(GL11.GL_CULL_FACE);
        GL11.glDisable(GL11.GL_BLEND); GL11.glEnable(GL11.GL_DEPTH_TEST);
        GL11.glDepthFunc(GL11.GL_LESS); GL11.glDepthMask(true);
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
        GL11.glColor3f(0F, 0F, 0F);
        quad(-1F, -1F, 1F, 1F, 0.5F);
        Matrix4f clip = new Matrix4f();
        FlashlightProjection.begin(clip);
        GL11.glColor3f(0.25F, 0F, 0F);
        quad(-0.8F, -0.4F, -0.4F, 0.4F, -0.5F);
        GL11.glEnable(GL11.GL_BLEND); GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        com.flansmod.client.model.ModelAttachment lens = new com.flansmod.client.model.ModelAttachment() {
            @Override public void renderZDepthModel(float scale) {
                GL11.glColor4f(0F, 0F, 0F, 0F);
                quad(-0.3F, -0.3F, 0.3F, 0.3F, -0.6F);
            }
        };
        lens.zDepthModel = new com.flansmod.client.tmt.ModelRendererTurbo[1];
        java.lang.reflect.Method render = com.flansmod.client.model.RenderGun.class.getDeclaredMethod("renderZDepthModel",
                com.flansmod.client.model.ModelAttachment.class, float.class, net.minecraftforge.client.IItemRenderer.ItemRenderType.class);
        render.setAccessible(true);
        render.invoke(new com.flansmod.client.model.RenderGun(), lens, 0.0625F,
                net.minecraftforge.client.IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON);
        check(GL11.glGetBoolean(GL11.GL_DEPTH_WRITEMASK), "Sight pass leaked its depth-write mask");
        float[] shadows = new float[81]; Arrays.fill(shadows, 1F);
        Vec3 origin = Vec3.createVectorHelper(0D, 0D, 1D), forward = Vec3.createVectorHelper(0D, 0D, -1D);
        check(FlashlightProjection.draw(origin, forward, Vec3.createVectorHelper(1D, 0D, 0D),
                Vec3.createVectorHelper(0D, 1D, 0D), 1F, 32F, 0.25F, shadows, false), "Sight flashlight unavailable");
        ByteBuffer pixels = read(SIZE);
        check((pixels.get((63 * SIZE + 63) * 4) & 255) > 20, "Sight glass blocked the flashlight");
        int gun = (64 * SIZE + 25) * 4;
        check((pixels.get(gun) & 255) == 64 && (pixels.get(gun + 1) & 255) == 0,
                "Sight transparency exposed the solid gun to flashlight projection");
        int dot = (63 * SIZE + 63) * 4 + 1;
        int before = pixels.get(dot) & 255;
        check(FlashlightProjection.drawLaserSpot(origin, forward,
                AxisAlignedBB.getBoundingBox(-0.3D, -0.3D, 0.45D, 0.3D, 0.3D, 0.55D),
                clip, 0.2F, 2F, 0F, 1F, 0F), "Sight laser spot unavailable");
        check((read(SIZE).get(dot) & 255) > before + 20, "Sight glass blocked the laser dot");
        int line = (76 * SIZE + 63) * 4 + 1;
        before = read(SIZE).get(line) & 255;
        AttachmentLightRenderer.drawHandBeam(new Vector4f(-0.25F, 0.2F, 0.1F, 1F),
                new Vector4f(0.25F, 0.2F, 0.1F, 1F), 0F, 1F, 0F);
        check((read(SIZE).get(line) & 255) > before + 20, "Sight glass blocked the laser beam");
        check(GL11.glGetError() == GL11.GL_NO_ERROR, "Sight transmission produced an OpenGL error");
    }

    private static void checkCloseSightDepth() throws Exception {
        java.lang.reflect.Field world = AttachmentLightRenderer.class.getDeclaredField("WORLD_PROJECTION");
        java.lang.reflect.Field clipField = AttachmentLightRenderer.class.getDeclaredField("WORLD_CLIP");
        world.setAccessible(true); clipField.setAccessible(true);
        Matrix4f worldProjection = (Matrix4f) world.get(null), worldClip = (Matrix4f) clipField.get(null);
        Matrix4f savedProjection = new Matrix4f(worldProjection), savedClip = new Matrix4f(worldClip);
        GL11.glViewport(0, 0, SIZE, SIZE);
        GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glLoadIdentity();
        GLU.gluPerspective(70F, 1F, 0.05F, 64F);
        FloatBuffer buffer = BufferUtils.createFloatBuffer(16);
        GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, buffer); worldProjection.load(buffer); worldClip.load(worldProjection);
        GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glLoadIdentity();
        GL11.glDisable(GL11.GL_TEXTURE_2D); GL11.glDisable(GL11.GL_ALPHA_TEST);
        GL11.glDisable(GL11.GL_BLEND); GL11.glEnable(GL11.GL_DEPTH_TEST);
        GL11.glDepthMask(true); GL11.glDepthFunc(GL11.GL_LESS);
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
        GL11.glColor3f(0F, 0F, 0F); quad(-5F, -5F, 5F, 5F, -0.5F);
        FlashlightProjection.begin(worldClip);
        GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glLoadIdentity();
        GLU.gluPerspective(70F, 1F, 0.01F, 64F);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        // Minecraft clears world depth before the hand, whose near plane differs.
        GL11.glClear(GL11.GL_DEPTH_BUFFER_BIT);
        GL11.glColor3f(0.25F, 0F, 0F); quad(-0.05F, -0.1F, 0F, 0.1F, -0.25F);
        int solid = (64 * SIZE + 56) * 4, aperture = (64 * SIZE + 76) * 4;
        int solidRed = read(SIZE).get(solid) & 255;
        java.lang.reflect.Method depth = AttachmentLightRenderer.class.getDeclaredMethod("beginHandDepthProjection");
        depth.setAccessible(true); depth.invoke(null);
        float[] shadows = new float[81]; Arrays.fill(shadows, 1F);
        check(FlashlightProjection.draw(Vec3.createVectorHelper(0D, 0D, 0D), Vec3.createVectorHelper(0D, 0D, -1D),
                Vec3.createVectorHelper(1D, 0D, 0D), Vec3.createVectorHelper(0D, 1D, 0D), 1F,
                32F, 0.1F, shadows, false), "Close-sight flashlight unavailable");
        ByteBuffer pixels = read(SIZE);
        check((pixels.get(solid) & 255) == solidRed && (pixels.get(solid + 1) & 255) == 0,
                "Depth mismatch painted the solid optic with flashlight light");
        check((pixels.get(aperture) & 255) > 10, "Depth conversion hid the illuminated world through the aperture");
        Vector4f target = Matrix4f.transform(worldClip, new Vector4f(0F, 0F, -0.5F, 1F), null);
        float worldDepth = target.z / target.w;
        AttachmentLightRenderer.drawHandBeam(new Vector4f(-0.3F, 0F, worldDepth, 1F),
                new Vector4f(0.3F, 0F, worldDepth, 1F), 0F, 1F, 0F);
        pixels = read(SIZE);
        check((pixels.get(solid + 1) & 255) == 0, "Laser beam appeared through the solid optic with a close near plane");
        check((pixels.get(aperture + 1) & 255) > 40, "Laser beam vanished through the open aperture");
        check(FlashlightProjection.transformDepth(0.3F) == 0.3F, "Hand depth conversion leaked into world rendering");
        worldProjection.load(savedProjection); worldClip.load(savedClip);
        check(GL11.glGetError() == GL11.GL_NO_ERROR, "Close-sight depth produced an OpenGL error");
    }

    private static void checkHandheldModel() throws Exception {
        ClassLoader resources = AttachmentLightingGpuChecks.class.getClassLoader();
        net.minecraftforge.client.model.obj.WavefrontObject model;
        try (java.io.InputStream source = resources.getResourceAsStream("assets/flansmod/models/flashlight/flashlight_runtime.obj")) {
            check(source != null, "Missing handheld flashlight model");
            model = new net.minecraftforge.client.model.obj.WavefrontObject("flashlight_runtime.obj", source);
        }
        check(model.groupObjects.size() == 3 && model.vertices.size() == 48, "Flashlight geometry changed during OBJ conversion");
        int faces = 0;
        for (net.minecraftforge.client.model.obj.GroupObject group : model.groupObjects) {
            check(group.glDrawingMode == GL11.GL_TRIANGLES, "Forge requires one face mode per OBJ group");
            faces += group.faces.size();
        }
        check(faces == 84, "Flashlight triangulation lost faces");
        java.awt.image.BufferedImage texture;
        try (java.io.InputStream source = resources.getResourceAsStream("assets/flansmod/models/flashlight/flashlight.png")) {
            texture = javax.imageio.ImageIO.read(source);
        }
        check(texture.getWidth() == 32 && texture.getHeight() == 32, "Flashlight atlas dimensions differ from the source UVs");
        ByteBuffer texels = BufferUtils.createByteBuffer(32 * 32 * 4);
        for (int y = 0; y < 32; y++) for (int x = 0; x < 32; x++) {
            int argb = texture.getRGB(x, y);
            texels.put((byte)(argb >> 16)).put((byte)(argb >> 8)).put((byte)argb).put((byte)(argb >> 24));
        }
        texels.flip();
        int textureId = GL11.glGenTextures();
        GL13.glActiveTexture(GL13.GL_TEXTURE0); GL11.glBindTexture(GL11.GL_TEXTURE_2D, textureId);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_NEAREST);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_NEAREST);
        GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GL11.GL_RGBA, 32, 32, 0, GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, texels);
        java.lang.reflect.Field unsafeField = sun.misc.Unsafe.class.getDeclaredField("theUnsafe"); unsafeField.setAccessible(true);
        sun.misc.Unsafe allocator = (sun.misc.Unsafe) unsafeField.get(null);
        net.minecraft.client.Minecraft mc = (net.minecraft.client.Minecraft) allocator.allocateInstance(net.minecraft.client.Minecraft.class);
        ModelTextures textures = (ModelTextures) allocator.allocateInstance(ModelTextures.class);
        textures.texture = textureId; mc.renderEngine = textures;
        textures.skin = GL11.glGenTextures();
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, textures.skin);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_NEAREST);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_NEAREST);
        ByteBuffer skin = BufferUtils.createByteBuffer(64 * 32 * 4);
        // Distinguish the sleeve from the hand: a uniform skin hid reversed grips.
        for (int y = 0; y < 32; y++) for (int x = 0; x < 64; x++) {
            boolean sleeve = x >= 40 && x < 56 && y >= 20 && y < 26
                    || x >= 44 && x < 48 && y >= 16 && y < 20;
            boolean front = x >= 44 && x < 48 && y >= 20 && y < 26;
            skin.put((byte)(sleeve ? 20 : 200)).put((byte)(front ? 180 : sleeve ? 100 : 144))
                    .put((byte)(front ? 100 : sleeve ? 180 : 104)).put((byte)255);
        }
        skin.flip();
        GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GL11.GL_RGBA, 64, 32, 0, GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, skin);
        textures.grenade = GL11.glGenTextures(); GL11.glBindTexture(GL11.GL_TEXTURE_2D, textures.grenade);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_NEAREST);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_NEAREST);
        ByteBuffer olive = BufferUtils.createByteBuffer(4); olive.put((byte)70).put((byte)90).put((byte)30).put((byte)255).flip();
        GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GL11.GL_RGBA, 1, 1, 0, GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, olive);
        mc.thePlayer = (net.minecraft.client.entity.EntityClientPlayerMP) allocator.allocateInstance(net.minecraft.client.entity.EntityClientPlayerMP.class);
        java.lang.reflect.Field data = net.minecraft.entity.Entity.class.getDeclaredField("dataWatcher"); data.setAccessible(true);
        net.minecraft.entity.DataWatcher watcher = new net.minecraft.entity.DataWatcher(mc.thePlayer);
        watcher.addObject(0, (byte)0); watcher.addObject(6, 20F); data.set(mc.thePlayer, watcher);
        mc.thePlayer.inventory = new net.minecraft.entity.player.InventoryPlayer(mc.thePlayer);
        mc.gameSettings = (net.minecraft.client.settings.GameSettings) allocator.allocateInstance(net.minecraft.client.settings.GameSettings.class);
        mc.displayWidth = mc.displayHeight = SIZE;
        java.lang.reflect.Field singleton = net.minecraft.client.Minecraft.class.getDeclaredField("theMinecraft");
        singleton.setAccessible(true); Object previous = singleton.get(null); singleton.set(null, mc);
        try {
            checkGunArmourLayers(mc, allocator);
            checkWristAnchor(mc);
            com.flansmod.client.model.RenderHandheldFlashlight renderer = new com.flansmod.client.model.RenderHandheldFlashlight();
            java.lang.reflect.Field mesh = renderer.getClass().getDeclaredField("model"); mesh.setAccessible(true); mesh.set(renderer, model);
            java.lang.reflect.Field loaded = renderer.getClass().getDeclaredField("loadAttempted"); loaded.setAccessible(true); loaded.setBoolean(renderer, true);
            for (net.minecraftforge.client.IItemRenderer.ItemRenderType type : new net.minecraftforge.client.IItemRenderer.ItemRenderType[] {
                    net.minecraftforge.client.IItemRenderer.ItemRenderType.INVENTORY,
                    net.minecraftforge.client.IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON}) {
                GL11.glViewport(0, 0, SIZE, SIZE);
                GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glLoadIdentity();
                if (type == net.minecraftforge.client.IItemRenderer.ItemRenderType.INVENTORY) GL11.glOrtho(0D, 16D, 16D, 0D, -100D, 100D);
                else GLU.gluPerspective(70F, 1F, 0.05F, 64F);
                GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glLoadIdentity();
                GL11.glDisable(GL11.GL_LIGHTING); GL11.glEnable(GL11.GL_TEXTURE_2D);
                GL11.glEnable(GL11.GL_DEPTH_TEST); GL11.glDepthMask(true);
                GL11.glEnable(GL11.GL_ALPHA_TEST); GL11.glAlphaFunc(GL11.GL_GREATER, 0.1F);
                GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
                renderer.renderItem(type, null);
                ByteBuffer pixels = read(SIZE); int visible = 0;
                java.awt.image.BufferedImage preview = new java.awt.image.BufferedImage(SIZE, SIZE, java.awt.image.BufferedImage.TYPE_INT_RGB);
                for (int y = 0; y < SIZE; y++) for (int x = 0; x < SIZE; x++) {
                    int index = (y * SIZE + x) * 4;
                    int rgb = (pixels.get(index) & 255) << 16 | (pixels.get(index + 1) & 255) << 8 | pixels.get(index + 2) & 255;
                    if ((rgb & 0xFFFFFF) != 0) visible++;
                    preview.setRGB(x, SIZE - 1 - y, rgb);
                }
                check(visible > 40, "Handheld model invisible in " + type);
                if (type == net.minecraftforge.client.IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON)
                    check(countSkin(pixels) > 20, "Flashlight has no skin-textured gripping hand");
                javax.imageio.ImageIO.write(preview, "png", new java.io.File("build/flashlight-" + type.name().toLowerCase(java.util.Locale.ROOT) + ".png"));
            }
            checkThirdPersonFlashlight(mc, renderer);
            checkUtilityBobbing(mc, renderer, null);
            checkVisibleLaserPose(mc, allocator);
            checkGrenadeHands(mc, allocator);
        } finally {
            singleton.set(null, previous); GL11.glDeleteTextures(textureId);
            GL11.glDeleteTextures(textures.skin); GL11.glDeleteTextures(textures.grenade);
        }
        check(GL11.glGetError() == GL11.GL_NO_ERROR, "Handheld flashlight rendering produced a GL error");
    }

    private static void checkUtilityBobbing(net.minecraft.client.Minecraft mc,
            net.minecraftforge.client.IItemRenderer renderer, net.minecraft.item.ItemStack stack) {
        mc.thePlayer.distanceWalkedModified = mc.thePlayer.prevDistanceWalkedModified = 0.25F;
        mc.thePlayer.cameraYaw = mc.thePlayer.prevCameraYaw = 0.12F;
        mc.gameSettings.viewBobbing = false;
        GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glLoadIdentity();
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
        renderer.renderItem(net.minecraftforge.client.IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON, stack);
        ByteBuffer stationary = read(SIZE);
        mc.gameSettings.viewBobbing = true;
        GL11.glLoadIdentity(); GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
        renderer.renderItem(net.minecraftforge.client.IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON, stack);
        ByteBuffer bobbing = read(SIZE); int changed = 0;
        for (int i = 0; i < SIZE * SIZE * 4; i += 4)
            if (stationary.get(i) != bobbing.get(i) || stationary.get(i + 1) != bobbing.get(i + 1)) changed++;
        check(changed > 50, renderer.getClass().getSimpleName() + " ignored the view-bobbing setting");
        mc.gameSettings.viewBobbing = false;
        mc.thePlayer.cameraYaw = mc.thePlayer.prevCameraYaw = 0F;
    }

    private static void checkVisibleLaserPose(net.minecraft.client.Minecraft mc, sun.misc.Unsafe allocator) throws Exception {
        com.flansmod.common.guns.type.AttachmentType laser = (com.flansmod.common.guns.type.AttachmentType)
                allocator.allocateInstance(com.flansmod.common.guns.type.AttachmentType.class);
        laser.isLaserPointer = true;
        laser.model = new com.flansmod.client.model.ModelAttachment();
        PoseGunType type = (PoseGunType) allocator.allocateInstance(PoseGunType.class);
        type.attachments = new java.util.ArrayList<>(); type.attachments.add(laser);
        com.flansmod.common.guns.item.ItemGun item = (com.flansmod.common.guns.item.ItemGun)
                allocator.allocateInstance(com.flansmod.common.guns.item.ItemGun.class);
        item.type = type;
        net.minecraft.item.ItemStack stack = new net.minecraft.item.ItemStack(item);
        java.lang.reflect.Field delegate = stack.getClass().getDeclaredField("delegate"); delegate.setAccessible(true);
        delegate.set(stack, new cpw.mods.fml.common.registry.RegistryDelegate.Delegate<net.minecraft.item.Item>(item, net.minecraft.item.Item.class));
        mc.thePlayer.inventory.mainInventory[mc.thePlayer.inventory.currentItem] = stack;
        java.lang.reflect.Field nv = AttachmentLightRenderer.class.getDeclaredField("nightVisionActive"); nv.setAccessible(true);
        java.lang.reflect.Field captured = AttachmentLightRenderer.class.getDeclaredField("EMITTERS"); captured.setAccessible(true);
        java.util.Map emitters = (java.util.Map) captured.get(null);
        try {
            nv.setBoolean(null, false); emitters.clear();
            GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glLoadIdentity();
            GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glLoadIdentity(); GL11.glRotatef(60F, 0F, 1F, 0F);
            AttachmentLightRenderer.renderEmitter(laser, laser.model, stack, mc.thePlayer, 1F, false, 1F, 0F);
            check(emitters.containsKey(mc.thePlayer), "Visible lasers must capture the gun pose without night vision");
            Object emitter = ((java.util.Map) emitters.get(mc.thePlayer)).get(laser);
            java.lang.reflect.Field clip = emitter.getClass().getDeclaredField("clip"); clip.setAccessible(true);
            java.lang.reflect.Field forward = emitter.getClass().getDeclaredField("forwardClip"); forward.setAccessible(true);
            Vector4f start = (Vector4f) clip.get(emitter), tip = (Vector4f) forward.get(emitter);
            check(Math.abs(tip.x - start.x - 0.5F) < 0.001F && tip.z - start.z < -0.86F,
                    "Laser emitter must rotate sideways with the sprint/reload model matrix");
            emitters.clear(); laser.infrared = true;
            AttachmentLightRenderer.renderEmitter(laser, laser.model, stack, mc.thePlayer, 1F, false, 1F, 0F);
            check(emitters.isEmpty(), "IR laser pose must remain hidden without night vision");
        } finally { emitters.clear(); mc.thePlayer.inventory.mainInventory[mc.thePlayer.inventory.currentItem] = null; }
    }

    private static final class PoseGunType extends com.flansmod.common.guns.type.GunType {
        java.util.ArrayList<com.flansmod.common.guns.type.AttachmentType> attachments;
        private PoseGunType() { super(null); }
        @Override public java.util.ArrayList<com.flansmod.common.guns.type.AttachmentType> getCurrentAttachments(net.minecraft.item.ItemStack stack) {
            return attachments;
        }
    }

    private static void checkWristAnchor(net.minecraft.client.Minecraft mc) {
        GL11.glViewport(0, 0, SIZE, SIZE);
        GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glLoadIdentity();
        GL11.glOrtho(-1D, 1D, -1D, 1D, -2D, 2D);
        GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glLoadIdentity();
        GL11.glDisable(GL11.GL_LIGHTING); GL11.glDisable(GL11.GL_BLEND);
        GL11.glEnable(GL11.GL_DEPTH_TEST); GL11.glDepthMask(true);
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
        com.flansmod.client.model.FirstPersonHands.render(mc.thePlayer, true, 0F, 0F, 0F, 0F, 0F);
        ByteBuffer pixels = read(SIZE);
        int wrist = (61 * SIZE + 64) * 4, shoulder = (29 * SIZE + 64) * 4;
        check((pixels.get(wrist) & 255) == 200 && (pixels.get(wrist + 1) & 255) == 144,
                "Grip must anchor the bare wrist, not the shirt/shoulder");
        check((pixels.get(shoulder) & 255) == 20 && (pixels.get(shoulder + 1) & 255) == 180
                && (pixels.get(shoulder + 2) & 255) == 100,
                "Sleeve must extend away from the wrist and show the corrected side of the arm");
    }

    private static void checkThirdPersonFlashlight(net.minecraft.client.Minecraft mc,
            com.flansmod.client.model.RenderHandheldFlashlight renderer) throws Exception {
        net.minecraftforge.client.IItemRenderer.ItemRenderType equipped = net.minecraftforge.client.IItemRenderer.ItemRenderType.EQUIPPED;
        check(renderer.shouldUseRenderHelper(equipped, null, net.minecraftforge.client.IItemRenderer.ItemRendererHelper.BLOCK_3D)
                && renderer.shouldUseRenderHelper(equipped, null, net.minecraftforge.client.IItemRenderer.ItemRendererHelper.EQUIPPED_BLOCK),
                "Third-person flashlight requires the block transforms it compensates for");
        GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glLoadIdentity(); GLU.gluPerspective(55F, 1F, 0.05F, 10F);
        GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glLoadIdentity();
        GL11.glTranslatef(0F, 0.25F, -2F); GL11.glRotatef(20F, 1F, 0F, 0F);
        GL11.glRotatef(-35F, 0F, 1F, 0F); GL11.glScalef(1F, -1F, 1F);
        FloatBuffer capturedMatrix = BufferUtils.createFloatBuffer(16);
        GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, capturedMatrix);
        Matrix4f camera = new Matrix4f(); camera.load(capturedMatrix);
        capturedMatrix.clear(); GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, capturedMatrix);
        Matrix4f projection = new Matrix4f(); projection.load(capturedMatrix);
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
        com.flansmod.client.model.FirstPersonHands.render(mc.thePlayer, true, 0F, 0.625F, 0F, 0F, 0F);
        // Actual RenderPlayer hand offset, BLOCK_3D pose, then Forge's EQUIPPED_BLOCK helper.
        GL11.glTranslatef(0F, 0.4375F, 0.0625F);
        GL11.glTranslatef(0F, 0.1875F, -0.3125F);
        GL11.glRotatef(20F, 1F, 0F, 0F); GL11.glRotatef(45F, 0F, 1F, 0F);
        GL11.glScalef(-0.375F, -0.375F, 0.375F); GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
        java.lang.reflect.Field unsafe = sun.misc.Unsafe.class.getDeclaredField("theUnsafe"); unsafe.setAccessible(true);
        net.minecraft.item.Item flashlight = (net.minecraft.item.Item) ((sun.misc.Unsafe) unsafe.get(null)).allocateInstance(
                com.flansmod.common.tools.ItemHandheldFlashlight.class);
        net.minecraft.item.ItemStack stack = new net.minecraft.item.ItemStack(flashlight);
        java.lang.reflect.Field delegate = stack.getClass().getDeclaredField("delegate"); delegate.setAccessible(true);
        delegate.set(stack, new cpw.mods.fml.common.registry.RegistryDelegate.Delegate<net.minecraft.item.Item>(flashlight, net.minecraft.item.Item.class));
        mc.thePlayer.inventory.mainInventory[mc.thePlayer.inventory.currentItem] = stack;
        renderer.renderItem(equipped, stack, null, mc.thePlayer);
        java.lang.reflect.Field emitters = AttachmentLightRenderer.class.getDeclaredField("EMITTERS"); emitters.setAccessible(true);
        Object emitter = ((java.util.Map) ((java.util.Map) emitters.get(null)).get(mc.thePlayer)).get(null);
        java.lang.reflect.Field clip = emitter.getClass().getDeclaredField("clip"); clip.setAccessible(true);
        Vector4f actual = (Vector4f) clip.get(emitter);
        // Native arm-space lens: hand centre Y=.53125, lens .875 model units forward of the grip.
        Vector4f expected = Matrix4f.transform(projection,
                Matrix4f.transform(camera, new Vector4f(0F, 0.53125F, -0.39375F, 1F), null), null);
        check(Math.abs(actual.x / actual.w - expected.x / expected.w) < 0.001F
                && Math.abs(actual.y / actual.w - expected.y / expected.w) < 0.001F,
                "Handheld light emitter must originate at the rendered lens, not a gun attachment offset");
        mc.thePlayer.inventory.mainInventory[mc.thePlayer.inventory.currentItem] = null;
        savePreview("flashlight-third-person-grip");
    }

    private static final class ModelTextures extends net.minecraft.client.renderer.texture.TextureManager {
        int texture, skin, grenade;
        private ModelTextures() { super(null); }
        @Override public void bindTexture(net.minecraft.util.ResourceLocation location) {
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, net.minecraft.client.entity.AbstractClientPlayer.locationStevePng.equals(location)
                    ? skin : location != null && "skins/test.png".equals(location.getResourcePath()) ? grenade : texture);
        }
    }

    private static void checkGunArmourLayers(net.minecraft.client.Minecraft mc, sun.misc.Unsafe allocator) throws Exception {
        // These checks render armor without registering a running mod or its event handlers.
        java.util.Map<String, Object> previousBlackboard = net.minecraft.launchwrapper.Launch.blackboard;
        net.minecraft.launchwrapper.Launch.blackboard = new java.util.HashMap<>();
        net.minecraft.launchwrapper.Launch.blackboard.put("fml.deobfuscatedEnvironment", true);
        java.lang.reflect.Field loaderInstance = cpw.mods.fml.common.Loader.class.getDeclaredField("instance");
        loaderInstance.setAccessible(true); Object previousLoader = loaderInstance.get(null);
        loaderInstance.set(null, allocator.allocateInstance(cpw.mods.fml.common.Loader.class));
        java.lang.reflect.Field forgeBus = net.minecraftforge.common.MinecraftForge.class.getDeclaredField("EVENT_BUS");
        Object previousForgeBus = net.minecraftforge.common.MinecraftForge.EVENT_BUS;
        Object busBase = allocator.staticFieldBase(forgeBus); long busOffset = allocator.staticFieldOffset(forgeBus);
        allocator.putObject(busBase, busOffset, new RenderOnlyEventBus());
        java.lang.reflect.Field fmlBus = cpw.mods.fml.common.FMLCommonHandler.class.getDeclaredField("eventBus");
        fmlBus.setAccessible(true); Object previousFmlBus = fmlBus.get(cpw.mods.fml.common.FMLCommonHandler.instance());
        fmlBus.set(cpw.mods.fml.common.FMLCommonHandler.instance(), new RenderOnlyEventBus());
        com.flansmod.client.model.RenderGun renderer = new com.flansmod.client.model.RenderGun();
        java.lang.reflect.Field textures = renderer.getClass().getDeclaredField("renderEngine");
        textures.setAccessible(true); Object previousTextures = textures.get(null); textures.set(null, mc.renderEngine);
        java.lang.reflect.Method render = renderer.getClass().getDeclaredMethod("renderFirstPersonArmour",
                net.minecraft.entity.player.EntityPlayer.class, boolean.class);
        render.setAccessible(true);
        net.minecraft.item.ItemStack[] inventory = mc.thePlayer.inventory.armorInventory;
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        try {
            GL11.glViewport(0, 0, SIZE, SIZE);
            GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glLoadIdentity();
            GL11.glOrtho(-1D, 1D, -1D, 1D, 0.1D, 10D);
            GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glLoadIdentity();
            GL11.glDisable(GL11.GL_LIGHTING); GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL11.glDisable(GL11.GL_ALPHA_TEST); GL11.glDisable(GL11.GL_BLEND);
            GL11.glEnable(GL11.GL_DEPTH_TEST); GL11.glDepthFunc(GL11.GL_LESS); GL11.glDepthMask(true);
            // Coplanar shoulder/sleeve fixtures must render the outer layer on either arm.
            inventory[2] = sleeveStack(allocator, false);
            inventory[1] = sleeveStack(allocator, true);
            for (boolean right : new boolean[] {true, false}) {
                for (boolean offsetAlreadyEnabled : new boolean[] {false, true}) {
                    GL11.glPolygonOffset(0.25F, 0.5F);
                    if (offsetAlreadyEnabled) GL11.glEnable(GL11.GL_POLYGON_OFFSET_FILL);
                    else GL11.glDisable(GL11.GL_POLYGON_OFFSET_FILL);
                    GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
                    render.invoke(renderer, mc.thePlayer, right);
                    ByteBuffer pixels = read(SIZE);
                    int middle = (SIZE / 2 * SIZE + SIZE / 2) * 4;
                    check((pixels.get(middle + 1) & 255) > 240 && (pixels.get(middle) & 255) < 10,
                            "Coplanar vest shoulder lost to the uniform sleeve");
                    check(GL11.glIsEnabled(GL11.GL_POLYGON_OFFSET_FILL) == offsetAlreadyEnabled,
                            "Sleeve rendering leaked polygon-offset enable state");
                    check(GL11.glGetFloat(GL11.GL_POLYGON_OFFSET_FACTOR) == 0.25F
                                    && GL11.glGetFloat(GL11.GL_POLYGON_OFFSET_UNITS) == 0.5F,
                            "Sleeve rendering leaked polygon-offset values");
                    check(GL11.glGetInteger(GL11.GL_DEPTH_FUNC) == GL11.GL_LESS
                                    && GL11.glIsEnabled(GL11.GL_DEPTH_TEST),
                            "Sleeve rendering changed gun depth testing");
                }
            }
            inventory[1] = null;
            GL11.glDisable(GL11.GL_POLYGON_OFFSET_FILL);
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
            render.invoke(renderer, mc.thePlayer, true);
            check((read(SIZE).get((SIZE / 2 * SIZE + SIZE / 2) * 4) & 255) > 240,
                    "Uniform sleeve disappeared without a vest");
            inventory[2] = null; inventory[1] = sleeveStack(allocator, true);
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
            render.invoke(renderer, mc.thePlayer, false);
            check((read(SIZE).get((SIZE / 2 * SIZE + SIZE / 2) * 4 + 1) & 255) > 240,
                    "Vest shoulder disappeared without a uniform");
            check(GL11.glGetError() == GL11.GL_NO_ERROR, "Gun sleeve layers produced a GL error");
        } finally {
            inventory[1] = inventory[2] = null;
            textures.set(null, previousTextures);
            allocator.putObject(busBase, busOffset, previousForgeBus);
            fmlBus.set(cpw.mods.fml.common.FMLCommonHandler.instance(), previousFmlBus);
            net.minecraft.launchwrapper.Launch.blackboard = previousBlackboard;
            loaderInstance.set(null, previousLoader);
            GL11.glPopAttrib();
        }
    }

    private static final class RenderOnlyEventBus extends cpw.mods.fml.common.eventhandler.EventBus {
        @Override public void register(Object target) { }
    }

    private static net.minecraft.item.ItemStack sleeveStack(sun.misc.Unsafe allocator, boolean vest) throws Exception {
        com.flansmod.common.teams.ArmourType type = (com.flansmod.common.teams.ArmourType)
                allocator.allocateInstance(com.flansmod.common.teams.ArmourType.class);
        type.modelScale = 1.05F;
        type.model = new SleeveLayer(vest);
        com.flansmod.common.teams.ItemTeamArmour item = (com.flansmod.common.teams.ItemTeamArmour)
                allocator.allocateInstance(com.flansmod.common.teams.ItemTeamArmour.class);
        item.type = type;
        net.minecraft.item.ItemStack stack = new net.minecraft.item.ItemStack(item);
        java.lang.reflect.Field delegate = stack.getClass().getDeclaredField("delegate"); delegate.setAccessible(true);
        delegate.set(stack, new cpw.mods.fml.common.registry.RegistryDelegate.Delegate<net.minecraft.item.Item>(item, net.minecraft.item.Item.class));
        return stack;
    }

    private static final class SleeveLayer extends com.flansmod.client.model.ModelCustomArmour {
        private final boolean vest;
        private SleeveLayer(boolean vest) {
            this.vest = vest;
            leftArmModel = rightArmModel = new com.flansmod.client.tmt.ModelRendererTurbo[1];
        }
        @Override public void render(com.flansmod.client.tmt.ModelRendererTurbo[] models,
                net.minecraft.client.model.ModelRenderer arm, float scale, float modelScale) {
            GL11.glColor3f(vest ? 0F : 1F, vest ? 1F : 0F, 0F);
            GL11.glBegin(GL11.GL_QUADS);
            GL11.glVertex3f(-0.5F, -0.5F, -2F); GL11.glVertex3f(0.5F, -0.5F, -2F);
            GL11.glVertex3f(0.5F, 0.5F, -2F); GL11.glVertex3f(-0.5F, 0.5F, -2F);
            GL11.glEnd();
        }
    }

    private static void checkGrenadeHands(net.minecraft.client.Minecraft mc, sun.misc.Unsafe allocator) throws Exception {
        com.flansmod.common.guns.type.GrenadeType type = (com.flansmod.common.guns.type.GrenadeType)
                allocator.allocateInstance(com.flansmod.common.guns.type.GrenadeType.class);
        type.texture = "test"; type.model = new com.flansmod.client.model.BFMCpack.ModelRGD5();
        com.flansmod.common.guns.item.ItemGrenade grenade = (com.flansmod.common.guns.item.ItemGrenade)
                allocator.allocateInstance(com.flansmod.common.guns.item.ItemGrenade.class);
        grenade.type = type;
        net.minecraft.item.ItemStack stack = new net.minecraft.item.ItemStack(grenade);
        java.lang.reflect.Field delegate = stack.getClass().getDeclaredField("delegate"); delegate.setAccessible(true);
        delegate.set(stack, new cpw.mods.fml.common.registry.RegistryDelegate.Delegate<net.minecraft.item.Item>(grenade, net.minecraft.item.Item.class));
        java.lang.reflect.Field itemDelegate = net.minecraft.item.Item.class.getDeclaredField("delegate"); itemDelegate.setAccessible(true);
        itemDelegate.set(grenade, delegate.get(stack));
        com.flansmod.client.model.RenderGrenade renderer = new com.flansmod.client.model.RenderGrenade();
        GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glLoadIdentity(); GLU.gluPerspective(70F, 1F, 0.05F, 10F);
        GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glLoadIdentity();
        // Vanilla's full-equipped first-person item transform before Forge's item renderer.
        GL11.glTranslatef(0.56F, -0.52F, -0.72F); GL11.glRotatef(45F, 0F, 1F, 0F);
        GL11.glColor4f(1F, 1F, 1F, 1F);
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
        renderer.renderItem(net.minecraftforge.client.IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON, stack);
        check(countSkin(read(SIZE)) > 20, "Held grenade has no skin-textured hands");
        ByteBuffer resting = read(SIZE); int support = 0;
        for (int y = 0; y < SIZE; y++) for (int x = 0; x < SIZE / 2; x++) {
            int i = (y * SIZE + x) * 4;
            if ((resting.get(i) & 255) == 200 && (resting.get(i + 1) & 255) == 144) support++;
        }
        check(support > 20, "Grenade support hand must be visible before throwing");
        ByteBuffer holding = read(SIZE); int body = 0;
        for (int i = 0; i < SIZE * SIZE * 4; i += 4)
            if ((holding.get(i) & 255) == 70 && (holding.get(i + 1) & 255) == 90 && (holding.get(i + 2) & 255) == 30) body++;
        check(body > 10, "Gripping hands completely obscured the grenade");
        savePreview("grenade-holding");
        checkUtilityBobbing(mc, renderer, stack);
        GL11.glLoadIdentity(); GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
        renderer.renderItem(net.minecraftforge.client.IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON, stack);
        ByteBuffer idle = read(SIZE);
        mc.gameSettings.fovSetting = 110F; // World FOV must not change the hand projection at throw startup.
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
        renderer.startThrow(mc.thePlayer, stack);
        check(renderer.renderThrowHands(mc), "Throw must begin from the equipped pose");
        ByteBuffer opening = read(SIZE); int jumped = 0;
        for (int i = 0; i < SIZE * SIZE * 4; i += 4)
            if (idle.get(i) != opening.get(i) || idle.get(i + 1) != opening.get(i + 1)) jumped++;
        check(jumped < 30, "Grenade/hands jumped between idle and throw: " + jumped + " pixels changed");
        java.lang.reflect.Method pose = renderer.getClass().getDeclaredMethod("renderThrowPose", net.minecraft.entity.player.EntityPlayer.class, float.class, net.minecraft.item.ItemStack.class);
        pose.setAccessible(true);
        for (float progress : new float[] {0F, 0.1F, 0.25F, 0.43F, 0.5F, 0.55F, 0.9F}) {
            GL11.glLoadIdentity(); GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
            pose.invoke(null, mc.thePlayer, progress, stack);
            check(countSkin(read(SIZE)) > 20, "Throwing hand disappeared at progress " + progress);
            savePreview("grenade-throw-" + progress);
        }
        renderer.startThrow(mc.thePlayer, stack);
        check(renderer.renderThrowHands(mc), "The last grenade needs an empty-hand follow-through");
        mc.thePlayer.inventory.currentItem++;
        check(!renderer.renderThrowHands(mc), "Switching slots must cancel the throw animation");
        renderer.startThrow(mc.thePlayer, stack);
        java.lang.reflect.Field started = renderer.getClass().getDeclaredField("throwStarted"); started.setAccessible(true);
        started.setLong(renderer, System.nanoTime() - 1500000000L);
        check(renderer.renderThrowHands(mc), "Throw recovery must still be active after 1.5 seconds");
        started.setLong(renderer, System.nanoTime() - 2100000000L);
        check(!renderer.renderThrowHands(mc), "Throw animation must finish");
        renderer.startThrow(mc.thePlayer, stack);
        Object player = mc.thePlayer; mc.thePlayer = null;
        renderer.tick(mc);
        check(started.getLong(renderer) == 0L, "Leaving a world must clear the throw animation");
        mc.thePlayer = (net.minecraft.client.entity.EntityClientPlayerMP) player;
    }

    private static int countSkin(ByteBuffer pixels) {
        int result = 0;
        for (int i = 0; i < SIZE * SIZE * 4; i += 4)
            if ((pixels.get(i) & 255) == 200 && (pixels.get(i + 1) & 255) == 144 && (pixels.get(i + 2) & 255) == 104) result++;
        return result;
    }

    private static void savePreview(String name) throws Exception {
        ByteBuffer pixels = read(SIZE);
        java.awt.image.BufferedImage preview = new java.awt.image.BufferedImage(SIZE, SIZE, java.awt.image.BufferedImage.TYPE_INT_RGB);
        for (int y = 0; y < SIZE; y++) for (int x = 0; x < SIZE; x++) {
            int i = (y * SIZE + x) * 4;
            preview.setRGB(x, SIZE - 1 - y, (pixels.get(i) & 255) << 16 | (pixels.get(i + 1) & 255) << 8 | pixels.get(i + 2) & 255);
        }
        javax.imageio.ImageIO.write(preview, "png", new java.io.File("build/" + name + ".png"));
    }

    private static void quad(float left, float bottom, float right, float top, float depth) {
        GL11.glBegin(GL11.GL_QUADS);
        GL11.glVertex3f(left, bottom, depth); GL11.glVertex3f(right, bottom, depth);
        GL11.glVertex3f(right, top, depth); GL11.glVertex3f(left, top, depth);
        GL11.glEnd();
    }

    private static void checkReticleSway() throws Exception {
        // Exercise the renderer's actual capture with a neutral optic on the eye axis.
        java.lang.reflect.Field unsafeField = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        unsafeField.setAccessible(true);
        sun.misc.Unsafe unsafe = (sun.misc.Unsafe) unsafeField.get(null);
        com.flansmod.common.guns.type.GunType gun = (com.flansmod.common.guns.type.GunType)
                unsafe.allocateInstance(com.flansmod.common.guns.type.GunType.class);
        gun.modelScale = 1F;
        com.flansmod.client.model.ModelGun model = new com.flansmod.client.model.ModelGun();
        com.flansmod.client.model.RenderGun renderer = new com.flansmod.client.model.RenderGun();
        java.lang.reflect.Field deltaField = renderer.getClass().getDeclaredField("dotSwayDelta");
        deltaField.setAccessible(true);
        java.lang.reflect.Method capture = renderer.getClass().getDeclaredMethod("captureDotReticle",
                gun.getClass(), model.getClass(), com.flansmod.common.guns.IScope.class);
        capture.setAccessible(true);
        for (float aspect : new float[] {1F, 16F / 9F}) {
            GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glLoadIdentity();
            GLU.gluPerspective(70F, aspect, 0.01F, 64F);
            FloatBuffer buffer = BufferUtils.createFloatBuffer(16);
            GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, buffer);
            Matrix4f projection = new Matrix4f(); projection.load(buffer);
            for (float angle : new float[] {0F, -0.1F, 0.1F}) {
                GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glLoadIdentity();
                GL11.glRotatef(angle, 0F, 1F, 0F);
                buffer.clear(); GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, buffer);
                Matrix4f delta = new Matrix4f(); delta.load(buffer);
                deltaField.set(renderer, delta);
                GL11.glTranslatef(0F, 0F, -0.25F);
                com.flansmod.client.model.RenderGun.beginReticleFrame();
                capture.invoke(renderer, gun, model, gun);
                Vector4f housing = Matrix4f.transform(delta, new Vector4f(0F, 0F, -0.25F, 1F), null);
                Matrix4f.transform(projection, housing, housing);
                check(com.flansmod.client.model.RenderGun.hasModelReticle(gun), "Reticle capture missing");
                check(Math.abs(com.flansmod.client.model.RenderGun.dotReticleX - housing.x / housing.w) < 0.00001F,
                        "Reticle separated from the housing under sway");
                check(Math.abs(com.flansmod.client.model.RenderGun.dotReticleY) < 0.00001F, "Reticle drifted vertically");
            }
        }
        com.flansmod.client.model.RenderGun.beginReticleFrame();
        check(!com.flansmod.client.model.RenderGun.hasModelReticle(gun), "Previous frame reticle leaked");
    }

    private static void checkCorpseArmourPose() throws Exception {
        java.lang.reflect.Field allocatorField = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        allocatorField.setAccessible(true);
        sun.misc.Unsafe allocator = (sun.misc.Unsafe) allocatorField.get(null);
        com.flansmod.common.mob.EntityCorpse corpse = (com.flansmod.common.mob.EntityCorpse)
                allocator.allocateInstance(com.flansmod.common.mob.EntityCorpse.class);
        java.lang.reflect.Field data = net.minecraft.entity.Entity.class.getDeclaredField("dataWatcher");
        data.setAccessible(true);
        net.minecraft.entity.DataWatcher watcher = new net.minecraft.entity.DataWatcher(corpse);
        watcher.addObject(0, (byte) 0); data.set(corpse, watcher);
        java.lang.reflect.Field arm = corpse.getClass().getDeclaredField("leftArmRotationX");
        arm.setAccessible(true); arm.setFloat(corpse, 42F);
        java.lang.reflect.Field leg = corpse.getClass().getDeclaredField("rightLegRotationZ");
        leg.setAccessible(true); leg.setFloat(corpse, -25F);
        com.flansmod.common.teams.ArmourType type = (com.flansmod.common.teams.ArmourType)
                ((sun.misc.Unsafe) allocatorField.get(null)).allocateInstance(com.flansmod.common.teams.ArmourType.class);
        type.modelScale = 1F;
        for (com.flansmod.client.model.ModelCustomArmour model : new com.flansmod.client.model.ModelCustomArmour[] {
                new com.flansmod.client.model.ModelCustomArmour(),
                new com.flansmod.client.model.NewTapArmor.ModelGhillieBase(1)}) {
            model.type = type;
            model.render(corpse, 0F, 0F, 0F, 0F, 0F, 0.0625F);
            check(Math.abs(model.bipedLeftArm.rotateAngleX - Math.toRadians(42D)) < 0.00001D,
                    "Corpse armor arm did not follow the corpse pose");
            check(Math.abs(model.bipedRightLeg.rotateAngleZ - Math.toRadians(-25D)) < 0.00001D,
                    "Corpse armor leg did not follow the corpse pose");
        }
        check(GL11.glGetError() == GL11.GL_NO_ERROR, "Corpse armor produced a GL error");
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
