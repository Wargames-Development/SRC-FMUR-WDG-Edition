package com.flansmod.client.model;

import com.flansmod.common.guns.type.BulletType;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.util.Locale;
import java.util.Random;

/** Draws a model-anchored muzzle burst from soft particle-atlas puffs and sparks. */
public final class MuzzleFlashRenderer {
    private static final ResourceLocation PARTICLE_TEXTURE =
            new ResourceLocation("textures/particle/particles.png");
    private static final int PUFF_TEXTURE_INDEX = 7;
    private static final int SPARK_TEXTURE_INDEX = 65;
    private static final float BASE_556_SIZE = 1F / 3F;

    private MuzzleFlashRenderer() {
    }

    public static void render(int pattern, int remainingTicks, float inverseModelFlashScale,
                              BulletType loadedAmmo, boolean showFireball,
                              float sizeMultiplier) {
        float downwardOnlyVariation = Math.max(0.80F, Math.min(1F, sizeMultiplier));
        float unit = Math.max(0.001F, inverseModelFlashScale)
                * BASE_556_SIZE * getCaliberScale(loadedAmmo) * downwardOnlyVariation;
        float phase = remainingTicks >= 2 ? 0F : 1F;
        Random random = new Random(0x4D555A5AL + pattern * 0x9E3779B9L);
        Tessellator tessellator = Tessellator.instance;

        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        try {
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glDepthMask(false);
            Minecraft.getMinecraft().renderEngine.bindTexture(PARTICLE_TEXTURE);

            // White-hot core, pale yellow middle, and a light gold outer cloud.
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);
            if (showFireball) {
                tessellator.startDrawingQuads();
                tessellator.setBrightness(15728880);
                for (int i = 0; i < 18; i++) {
                    double angle = random.nextDouble() * Math.PI * 2D;
                    boolean core = i < 6;
                    boolean middle = i >= 6 && i < 14;
                    float axial = (0.10F + random.nextFloat() * (core ? 0.52F : 1.05F)
                            + phase * 0.16F) * unit;
                    float radial = random.nextFloat() * (core ? 0.12F : 0.31F) * unit;
                    float y = (float) Math.cos(angle) * radial;
                    float z = (float) Math.sin(angle) * radial;
                    float size = (core ? 0.36F + random.nextFloat() * 0.18F
                            : 0.32F + random.nextFloat() * 0.24F) * unit;
                    float red = 1F;
                    float green = core ? 1F : (middle ? 0.92F : 0.79F);
                    float blue = core ? 0.86F : (middle ? 0.46F : 0.22F);
                    float alpha = core ? 0.96F : (middle ? 0.84F : 0.68F);
                    addCrossedParticle(tessellator, axial, y, z, size,
                            red, green, blue, alpha, PUFF_TEXTURE_INDEX);
                }
                tessellator.draw();
            }

            // Thin pale-yellow spark streaks embedded in the flame cloud.
            tessellator.startDrawingQuads();
            tessellator.setBrightness(15728880);
            for (int i = 0; i < 7; i++) {
                double angle = random.nextDouble() * Math.PI * 2D;
                float radial = (0.04F + random.nextFloat() * 0.24F) * unit;
                float y = (float) Math.cos(angle) * radial;
                float z = (float) Math.sin(angle) * radial;
                float start = (0.18F + random.nextFloat() * 0.32F) * unit;
                float end = start + (0.46F + random.nextFloat() * 0.72F) * unit;
                float width = (0.028F + random.nextFloat() * 0.022F) * unit;
                addSpark(tessellator, start, end, y, z, width,
                        1F, 0.94F, 0.52F, 0.9F);
            }
            tessellator.draw();

            // Smoke expands through the barrel-local up, down, left, and right axes.
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            tessellator.startDrawingQuads();
            tessellator.setBrightness(15728880);
            int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
            for (int direction = 0; direction < directions.length; direction++) {
                for (int i = 0; i < 2; i++) {
                    float distance = (0.16F + phase * 0.25F + i * 0.08F) * unit;
                    float jitter = (random.nextFloat() - 0.5F) * 0.08F * unit;
                    float y = directions[direction][0] * distance
                            + directions[direction][1] * jitter;
                    float z = directions[direction][1] * distance
                            + directions[direction][0] * jitter;
                    float x = (0.08F + phase * 0.14F + random.nextFloat() * 0.12F) * unit;
                    float size = (0.34F + phase * 0.14F + random.nextFloat() * 0.12F) * unit;
                    addCrossedParticle(tessellator, x, y, z, size,
                            0.68F, 0.66F, 0.60F, phase == 0F ? 0.32F : 0.19F,
                            PUFF_TEXTURE_INDEX);
                }
            }
            tessellator.draw();
        } finally {
            GL11.glPopAttrib();
            GL11.glColor4f(1F, 1F, 1F, 1F);
        }
    }

    /** Cartridge-energy tiers relative to a 5.56x45mm muzzle flash. */
    private static float getCaliberScale(BulletType ammo) {
        if (ammo == null || ammo.shortName == null) {
            return 1F;
        }

        String name = ammo.shortName.toLowerCase(Locale.ROOT);
        if (name.startsWith("46x30")) return 0.62F;
        if (name.startsWith("47x33") || name.startsWith("57x28")) return 0.68F;
        if (name.startsWith("58x21")) return 0.72F;
        if (name.startsWith("65x25")) return 0.76F;
        if (name.startsWith("762x25")) return 0.78F;
        if (name.startsWith("9x18")) return 0.70F;
        if (name.startsWith("9x19")) return 0.75F;
        if (name.startsWith("9x21")) return 0.82F;
        if (name.startsWith("40sw")) return 0.82F;
        if (name.startsWith("45acp")) return 0.86F;
        if (name.startsWith("357magnum")) return 0.92F;
        if (name.startsWith("44magnum")) return 1.08F;
        if (name.startsWith("50magnum")) return 1.25F;

        if (name.startsWith("545x39")) return 0.96F;
        if (name.startsWith("556x45") || name.startsWith("xm214")) return 1F;
        if (name.startsWith("58x42")) return 1.02F;
        if (name.startsWith("300blk")) return 1.08F;
        if (name.startsWith("65x39")) return 1.12F;
        if (name.startsWith("9x39")) return 1.14F;
        if (name.startsWith("762x39")) return 1.18F;
        if (name.startsWith("68x51")) return 1.30F;

        if (name.startsWith("762x51")) return 1.38F;
        if (name.startsWith("303")) return 1.40F;
        if (name.startsWith("3006")) return 1.45F;
        if (name.startsWith("762x54") || name.startsWith("mosin")) return 1.45F;
        if (name.startsWith("127x42")) return 1.48F;
        if (name.startsWith("127x55")) return 1.58F;
        if (name.startsWith("338magnum")) return 1.70F;
        if (name.startsWith("408cheytac")) return 1.92F;

        if (name.startsWith("20gauge")) return 1.32F;
        if (name.startsWith("12gauge") || name.startsWith("184")) return 1.55F;
        if (name.startsWith("40mm")) return 1.75F;
        if (name.startsWith("50cal")) return 2.20F;
        if (name.startsWith("20x82")) return 2.85F;
        if (name.startsWith("atbullet") || name.startsWith("snipex145x114")) return 2.55F;
        return 1F;
    }

    private static void addCrossedParticle(Tessellator tessellator,
                                           float x, float y, float z, float size,
                                           float red, float green, float blue, float alpha,
                                           int textureIndex) {
        float u0 = (textureIndex % 16) / 16F;
        float u1 = u0 + 0.0624375F;
        float v0 = (textureIndex / 16) / 16F;
        float v1 = v0 + 0.0624375F;
        tessellator.setColorRGBA_F(red, green, blue, alpha);

        // Muzzle-facing quad.
        tessellator.addVertexWithUV(x, y - size, z - size, u1, v1);
        tessellator.addVertexWithUV(x, y + size, z - size, u1, v0);
        tessellator.addVertexWithUV(x, y + size, z + size, u0, v0);
        tessellator.addVertexWithUV(x, y - size, z + size, u0, v1);

        // Crossed side quads keep the burst volumetric in third person.
        tessellator.addVertexWithUV(x - size, y - size, z, u1, v1);
        tessellator.addVertexWithUV(x - size, y + size, z, u1, v0);
        tessellator.addVertexWithUV(x + size, y + size, z, u0, v0);
        tessellator.addVertexWithUV(x + size, y - size, z, u0, v1);

        tessellator.addVertexWithUV(x - size, y, z - size, u1, v1);
        tessellator.addVertexWithUV(x - size, y, z + size, u1, v0);
        tessellator.addVertexWithUV(x + size, y, z + size, u0, v0);
        tessellator.addVertexWithUV(x + size, y, z - size, u0, v1);
    }

    private static void addSpark(Tessellator tessellator,
                                 float start, float end, float y, float z, float width,
                                 float red, float green, float blue, float alpha) {
        float u0 = (SPARK_TEXTURE_INDEX % 16) / 16F;
        float u1 = u0 + 0.0624375F;
        float v0 = (SPARK_TEXTURE_INDEX / 16) / 16F;
        float v1 = v0 + 0.0624375F;
        tessellator.setColorRGBA_F(red, green, blue, alpha);

        tessellator.addVertexWithUV(start, y - width, z, u1, v1);
        tessellator.addVertexWithUV(end, y - width, z, u1, v0);
        tessellator.addVertexWithUV(end, y + width, z, u0, v0);
        tessellator.addVertexWithUV(start, y + width, z, u0, v1);

        tessellator.addVertexWithUV(start, y, z - width, u1, v1);
        tessellator.addVertexWithUV(end, y, z - width, u1, v0);
        tessellator.addVertexWithUV(end, y, z + width, u0, v0);
        tessellator.addVertexWithUV(start, y, z + width, u0, v1);
    }
}
