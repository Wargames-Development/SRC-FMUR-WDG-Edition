package com.flansmod.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BulletHoleDecalRenderer {
    private static final int POINT_COUNT = 9;
    private static final int MAX_AGE = 120;
    private static final int MAX_DECALS = 180;
    private static final List<BulletHoleDecal> DECALS = new ArrayList<BulletHoleDecal>();

    public static void addBulletHole(double x, double y, double z, double nx, double ny, double nz) {
        if (DECALS.size() >= MAX_DECALS) {
            DECALS.remove(0);
        }
        DECALS.add(new BulletHoleDecal(x, y, z, nx, ny, nz));
    }

    public static void tick() {
        Iterator<BulletHoleDecal> iterator = DECALS.iterator();
        while (iterator.hasNext()) {
            BulletHoleDecal decal = iterator.next();
            if (++decal.age >= MAX_AGE) {
                iterator.remove();
            }
        }
    }

    public static void render(RenderWorldLastEvent event) {
        if (DECALS.isEmpty()) {
            return;
        }

        Minecraft mc = Minecraft.getMinecraft();
        if (mc.thePlayer == null || mc.theWorld == null || mc.renderViewEntity == null) {
            return;
        }

        EntityLivingBase camera = mc.renderViewEntity;
        double cameraX = camera.lastTickPosX + (camera.posX - camera.lastTickPosX) * event.partialTicks;
        double cameraY = camera.lastTickPosY + (camera.posY - camera.lastTickPosY) * event.partialTicks;
        double cameraZ = camera.lastTickPosZ + (camera.posZ - camera.lastTickPosZ) * event.partialTicks;

        GL11.glPushAttrib(GL11.GL_ENABLE_BIT | GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT | GL11.GL_POLYGON_BIT);
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glDisable(GL11.GL_CULL_FACE);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glEnable(GL11.GL_POLYGON_OFFSET_FILL);
        GL11.glPolygonOffset(-1.0F, -4.0F);
        GL11.glDepthMask(false);

        Tessellator tessellator = Tessellator.instance;
        for (BulletHoleDecal decal : DECALS) {
            float life = (float) decal.age / (float) MAX_AGE;
            float alpha = life < 0.72F ? 0.82F : Math.max(0F, 0.82F * (1F - life) / 0.28F);
            float x = (float) (decal.x - cameraX);
            float y = (float) (decal.y - cameraY);
            float z = (float) (decal.z - cameraZ);

            tessellator.startDrawing(GL11.GL_TRIANGLE_FAN);
            tessellator.setBrightness(15728880);
            tessellator.setColorRGBA_F(0.018F, 0.016F, 0.014F, alpha);
            decal.addVertex(tessellator, x, y, z, 0F, 0F);
            for (int i = 0; i <= POINT_COUNT; i++) {
                int point = i % POINT_COUNT;
                float theta = (float) (Math.PI * 2D * point / POINT_COUNT) + decal.rotation;
                float u = (float) Math.cos(theta) * decal.scale * decal.radius[point];
                float v = (float) Math.sin(theta) * decal.scale * decal.radius[point];
                decal.addVertex(tessellator, x, y, z, u, v);
            }
            tessellator.draw();
        }

        GL11.glDepthMask(true);
        GL11.glDisable(GL11.GL_POLYGON_OFFSET_FILL);
        GL11.glPopAttrib();
        GL11.glColor4f(1F, 1F, 1F, 1F);
    }

    private static class BulletHoleDecal {
        private final int face;
        private final double x;
        private final double y;
        private final double z;
        private final float rotation;
        private final float scale;
        private final float[] radius = new float[POINT_COUNT];
        private int age;

        private BulletHoleDecal(double x, double y, double z, double nx, double ny, double nz) {
            face = getFace(nx, ny, nz);
            double offset = 0.010D;
            this.x = x + nx * offset;
            this.y = y + ny * offset;
            this.z = z + nz * offset;
            rotation = (float) (Math.random() * Math.PI * 2D);
            scale = 0.048F + (float) Math.random() * 0.018F;
            for (int i = 0; i < POINT_COUNT; i++) {
                radius[i] = 0.55F + (float) Math.random() * 0.62F;
            }
        }

        private void addVertex(Tessellator tessellator, float x, float y, float z, float u, float v) {
            switch (face) {
                case 0:
                case 1:
                    tessellator.addVertex(x + u, y, z + v);
                    break;
                case 2:
                case 3:
                    tessellator.addVertex(x + u, y + v, z);
                    break;
                case 4:
                case 5:
                    tessellator.addVertex(x, y + v, z + u);
                    break;
                default:
                    tessellator.addVertex(x + u, y, z + v);
                    break;
            }
        }

        private static int getFace(double nx, double ny, double nz) {
            double ax = Math.abs(nx);
            double ay = Math.abs(ny);
            double az = Math.abs(nz);
            if (ay >= ax && ay >= az) {
                return ny < 0D ? 0 : 1;
            }
            if (az >= ax) {
                return nz < 0D ? 2 : 3;
            }
            return nx < 0D ? 4 : 5;
        }
    }
}
