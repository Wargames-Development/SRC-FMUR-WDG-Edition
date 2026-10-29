package com.flansmod.client;

import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.relauncher.ReflectionHelper;
import java.lang.reflect.Field;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.WorldRenderer;
import org.lwjgl.opengl.GL11;

/** Direct display-list submission; no primary culling/occlusion state is changed. */
final class VanillaCameraTerrain implements CameraTerrain {
    private static final Field RENDERERS = find(RenderGlobal.class, "sortedWorldRenderers", "field_72768_k");
    private static final Field LIST = find(WorldRenderer.class, "glRenderList", "field_78942_y");
    private WorldRenderer[] renderers;
    private CameraView view;

    @Override public boolean begin(CameraView view) {
        try {
            this.view = view;
            renderers = (WorldRenderer[])RENDERERS.get(Minecraft.getMinecraft().renderGlobal);
            return renderers != null;
        } catch (IllegalAccessException failure) { throw new IllegalStateException(failure); }
    }

    @Override public void draw(int pass) {
        // The primary array is sorted for this same camera origin. Reverse alpha geometry.
        for (int n = 0; n < renderers.length; n++) {
            WorldRenderer renderer = renderers[pass == 0 ? n : renderers.length - 1 - n];
            if (renderer == null || renderer.skipRenderPass[pass]
                    || !view.visible(renderer.posX, renderer.posY, renderer.posZ,
                    renderer.posX + 16, renderer.posY + 16, renderer.posZ + 16)) continue;
            try {
                int list = LIST.getInt(renderer);
                if (list < 0) continue;
                GL11.glPushMatrix();
                GL11.glTranslated(renderer.posXMinus - view.x, renderer.posYMinus - view.y, renderer.posZMinus - view.z);
                GL11.glCallList(list + pass);
                GL11.glPopMatrix();
            } catch (IllegalAccessException failure) { throw new IllegalStateException(failure); }
        }
    }

    @Override public void close() { renderers = null; view = null; }

    private static Field find(Class<?> owner, String... names) {
        return ReflectionHelper.findField(owner, ObfuscationReflectionHelper.remapFieldNames(owner.getName(), names));
    }
}
