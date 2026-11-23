package com.flansmod.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

/** Lighting setup for loaded geometry replayed by the colour scope. */
final class ScopeLighting {
    private ScopeLighting() { }

    static void prepareTerrain(Minecraft mc, float partialTicks) {
        mc.entityRenderer.enableLightmap(partialTicks);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        mc.getTextureManager().bindTexture(TextureMap.locationBlocksTexture);
    }

    static void prepareEntity(Entity entity, float partialTicks) {
        // The scope calls the positioned renderer directly, bypassing RenderManager.renderEntityStatic.
        int brightness = entity.isBurning() ? 0xF000F0 : entity.getBrightnessForRender(partialTicks);
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, brightness & 0xffff, brightness >>> 16);
        GL11.glColor4f(1, 1, 1, 1);
    }
}
