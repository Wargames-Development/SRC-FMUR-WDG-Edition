package com.flansmod.client;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.entity.EntityLivingBase;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL12;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GLContext;

/** Non-emissive world reference for NVG bloom; projectiles and particles are never replayed. */
@SideOnly(Side.CLIENT)
public final class NightVisionBlockLightMask {
    private static Framebuffer blocks;
    private static boolean valid;

    private NightVisionBlockLightMask() {
    }

    public static void beginFrame() {
        valid = false;
    }

    public static boolean isValid() {
        return valid;
    }

    public static void bind() {
        GL13.glActiveTexture(GL13.GL_TEXTURE2);
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, blocks == null ? 0 : blocks.framebufferTexture);
        GL13.glActiveTexture(GL13.GL_TEXTURE0);
    }

    public static void capture(float partialTicks) {
        Minecraft mc = Minecraft.getMinecraft();
        if (mc.renderViewEntity == null || mc.theWorld == null
                || NightVisionGogglesEffect.getIntensity(mc, partialTicks) < 0.999F
                || !GLContext.getCapabilities().OpenGL20
                || !OpenGlHelper.isFramebufferEnabled()
                || mc.displayWidth <= 0 || mc.displayHeight <= 0) {
            return;
        }

        int previousFramebuffer = GL11.glGetInteger(EXTFramebufferObject.GL_FRAMEBUFFER_BINDING_EXT);
        int previousProgram = GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
        boolean advancedOpenGl = mc.gameSettings.advancedOpengl;
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glPushMatrix();
        try {
            GL20.glUseProgram(0);
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            if (blocks == null) {
                blocks = new Framebuffer(mc.displayWidth, mc.displayHeight, true);
                blocks.setFramebufferColor(0F, 0F, 0F, 0F);
                blocks.setFramebufferFilter(GL11.GL_LINEAR);
            } else if (blocks.framebufferWidth != mc.displayWidth
                    || blocks.framebufferHeight != mc.displayHeight) {
                blocks.createBindFramebuffer(mc.displayWidth, mc.displayHeight);
                blocks.setFramebufferFilter(GL11.GL_LINEAR);
            }
            // Keep the real background at terrain edges so linear filtering does not
            // mistake a block/sky boundary for an effect drawn over the block.
            OpenGlHelper.func_153171_g(OpenGlHelper.field_153198_e, previousFramebuffer);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, blocks.framebufferTexture);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
            GL11.glCopyTexSubImage2D(GL11.GL_TEXTURE_2D, 0, 0, 0,
                    0, 0, mc.displayWidth, mc.displayHeight);
            blocks.bindFramebuffer(true);
            GL11.glDepthMask(true);
            GL11.glColorMask(false, false, false, true);
            GL11.glClearColor(0F, 0F, 0F, 0F);
            GL11.glClearDepth(1D);
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
            GL11.glColorMask(true, true, true, true);
            GL11.glColor4f(1F, 1F, 1F, 1F);
            GL11.glEnable(GL11.GL_DEPTH_TEST);
            GL11.glDepthFunc(GL11.GL_LEQUAL);
            GL11.glDepthMask(true);
            GL11.glEnable(GL11.GL_ALPHA_TEST);
            GL11.glAlphaFunc(GL11.GL_GREATER, 0.1F);
            GL11.glEnable(GL11.GL_CULL_FACE);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glEnable(GL11.GL_FOG);
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glDisable(GL11.GL_BLEND);
            GL11.glShadeModel(mc.gameSettings.ambientOcclusion == 0 ? GL11.GL_FLAT : GL11.GL_SMOOTH);
            mc.getTextureManager().bindTexture(TextureMap.locationBlocksTexture);

            // Reuse compiled terrain with the current camera and lightmap. Do not issue
            // occlusion queries against this private depth buffer or render entities twice.
            mc.gameSettings.advancedOpengl = false;
            mc.renderGlobal.sortAndRender(mc.renderViewEntity, 0, partialTicks);
            GL11.glEnable(GL11.GL_BLEND);
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
            GL11.glDepthMask(false);
            mc.renderGlobal.sortAndRender(mc.renderViewEntity, 1, partialTicks);
            GL11.glDepthMask(true);
            GL11.glDisable(GL11.GL_BLEND);
            renderLivingEntities(mc, partialTicks);
            valid = true;
        } finally {
            mc.gameSettings.advancedOpengl = advancedOpenGl;
            OpenGlHelper.func_153171_g(OpenGlHelper.field_153198_e, previousFramebuffer);
            GL11.glMatrixMode(GL11.GL_MODELVIEW);
            GL11.glPopMatrix();
            GL20.glUseProgram(previousProgram);
            GL11.glPopAttrib();
        }
    }

    private static void renderLivingEntities(Minecraft mc, float partialTicks) {
        RenderHelper.enableStandardItemLighting();
        try {
            for (Object object : mc.theWorld.loadedEntityList) {
                if (!(object instanceof EntityLivingBase)) {
                    continue;
                }
                EntityLivingBase entity = (EntityLivingBase)object;
                if (entity == mc.renderViewEntity && mc.gameSettings.thirdPersonView == 0) {
                    continue;
                }
                RenderManager.instance.renderEntitySimple(entity, partialTicks);
            }
        } finally {
            RenderHelper.disableStandardItemLighting();
        }
    }
}
