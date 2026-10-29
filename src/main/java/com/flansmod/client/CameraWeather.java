package com.flansmod.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.BiomeGenBase;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;

/** Local precipitation geometry only; never enters the main renderer or shader-pack weather hooks. */
final class CameraWeather {
    private static final ResourceLocation RAIN = new ResourceLocation("textures/environment/rain.png");
    private static final ResourceLocation SNOW = new ResourceLocation("textures/environment/snow.png");

    private CameraWeather() { }

    static void render(Minecraft mc, CameraView view) {
        float strength = mc.theWorld.getRainStrength(view.partialTicks);
        if (strength <= 0 || mc.theWorld.provider.hasNoSky) return;
        int radius = mc.gameSettings.fancyGraphics ? 10 : 5;
        int cx = MathHelper.floor_double(view.x), cy = MathHelper.floor_double(view.y), cz = MathHelper.floor_double(view.z);
        double time = (mc.theWorld.getTotalWorldTime() & 65535L) + view.partialTicks;
        int program = GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        Tessellator vertices = Tessellator.instance;
        int batch = -1;
        try {
            GL20.glUseProgram(0);
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, GL11.GL_TEXTURE_ENV_MODE, GL11.GL_MODULATE);
            GL11.glDisable(GL11.GL_LIGHTING); GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glEnable(GL11.GL_DEPTH_TEST); GL11.glDepthFunc(GL11.GL_LEQUAL); GL11.glDepthMask(false);
            GL11.glEnable(GL11.GL_BLEND); GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            GL11.glEnable(GL11.GL_ALPHA_TEST); GL11.glAlphaFunc(GL11.GL_GREATER, 0.01F);
            GL11.glColor4f(1, 1, 1, 1);
            for (int z = cz - radius; z <= cz + radius; z++) for (int x = cx - radius; x <= cx + radius; x++) {
                // Precipitation must not request chunks outside the primary world's loaded area.
                if (!mc.theWorld.blockExists(x, 0, z)) continue;
                BiomeGenBase biome = mc.theWorld.getBiomeGenForCoords(x, z);
                if (!biome.canSpawnLightningBolt() && !biome.getEnableSnow()) continue;
                int surface = mc.theWorld.getPrecipitationHeight(x, z);
                int bottom = Math.max(cy - radius, surface), top = Math.max(cy + radius, surface);
                if (bottom == top || !view.visible(x, bottom, z, x + 1, top, z + 1)) continue;
                double dx = x + 0.5 - view.x, dz = z + 0.5 - view.z;
                double distance = Math.sqrt(dx * dx + dz * dz);
                if (distance < 0.0001) continue;
                double acrossX = dz / distance * 0.5, acrossZ = -dx / distance * 0.5;
                int kind = biome.getFloatTemperature(x, bottom, z) < 0.15F ? 1 : 0;
                if (kind != batch) {
                    if (batch >= 0) { batch = -1; vertices.draw(); }
                    mc.getTextureManager().bindTexture(kind == 0 ? RAIN : SNOW);
                    vertices.startDrawingQuads(); batch = kind;
                }
                int seed = x * x * 3121 + x * 45238971 ^ z * z * 418711 + z * 13761;
                double phase = (seed & 255) / 256.0;
                double scroll = kind == 0 ? (time * (3 + phase) / 32.0 + phase) % 1.0 : time / 512.0 % 1.0;
                double drift = kind == 0 ? 0 : Math.sin(time * 0.01 + phase * 6.28) * 0.25;
                float fade = (float)Math.max(0, 1 - distance * distance / (radius * radius));
                vertices.setColorRGBA_F(1, 1, 1, (kind == 0 ? 0.5F + fade * 0.5F : 0.5F + fade * 0.3F) * strength);
                int brightness = mc.theWorld.getLightBrightnessForSkyBlocks(x, Math.max(surface, cy), z, 0);
                if (kind == 1) brightness = (brightness * 3 + 15728880) / 4;
                vertices.setBrightness(brightness);
                double lowV = bottom / 4.0 + scroll, highV = top / 4.0 + scroll;
                vertices.addVertexWithUV(dx - acrossX, bottom - view.y, dz - acrossZ, drift, lowV);
                vertices.addVertexWithUV(dx + acrossX, bottom - view.y, dz + acrossZ, 1 + drift, lowV);
                vertices.addVertexWithUV(dx + acrossX, top - view.y, dz + acrossZ, 1 + drift, highV);
                vertices.addVertexWithUV(dx - acrossX, top - view.y, dz - acrossZ, drift, highV);
            }
            if (batch >= 0) { batch = -1; vertices.draw(); }
        } finally {
            // Also close a partially filled batch if a resource/provider rejects a column.
            try { if (batch >= 0) vertices.draw(); }
            finally {
                GL20.glUseProgram(program);
                GL11.glPopAttrib();
            }
        }
    }
}
