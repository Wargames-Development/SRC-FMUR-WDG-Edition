package com.flansmod.client.gui;

import com.flansmod.client.ClientProxy;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.guns.type.GunType;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

import java.util.Map;
import java.util.WeakHashMap;

/** Renders the actual gun and its installed attachments in a bounded preview. */
public final class GunPreviewRenderer {
    private static final Map<ModelGun, float[]> BOUNDS = new WeakHashMap<>();

    private GunPreviewRenderer() {}

    public static void render(ItemStack stack, GunType type, float x, float y,
                              float width, float height, float yaw, float pitch, float zoom) {
        float[] bounds = bounds(type.model);
        float length = Math.max(1F, bounds[1] - bounds[0]);
        float heightSpan = Math.max(1F, Math.max(bounds[3] - bounds[2], bounds[5] - bounds[4]));
        float fitScale = Math.min(width * 16F / (length * type.modelScale),
                height * 16F / (heightSpan * type.modelScale));
        float scale = Math.min(fitScale, 200F) * zoom;

        GL11.glPushAttrib(GL11.GL_ENABLE_BIT | GL11.GL_DEPTH_BUFFER_BIT);
        GL11.glPushMatrix();
        GL11.glEnable(GL11.GL_DEPTH_TEST);
        RenderHelper.enableStandardItemLighting();
        GL11.glColor4f(1F, 1F, 1F, 1F);
        GL11.glTranslatef(x, y, 100F);
        GL11.glRotatef(pitch, 1F, 0F, 0F);
        GL11.glRotatef(yaw, 0F, 1F, 0F);
        GL11.glScalef(-scale, scale, scale);
        GL11.glTranslatef(-((bounds[0] + bounds[1]) / 2F) * type.modelScale / 16F, 0F, 0F);
        ClientProxy.gunRenderer.renderGun(stack, type, 1F / 16F, type.model,
                GunAnimations.defaults, 0F, IItemRenderer.ItemRenderType.ENTITY);
        RenderHelper.disableStandardItemLighting();
        GL11.glPopMatrix();
        GL11.glPopAttrib();
    }

    private static float[] bounds(ModelGun model) {
        float[] result = BOUNDS.get(model);
        if (result != null) return result;
        result = new float[]{Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY,
                Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY,
                Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY};
        for (ModelRendererTurbo part : model.gunModel) {
            if (part != null) part.includeVertexBounds(result);
        }
        if (result[0] == Float.POSITIVE_INFINITY) {
            result = new float[]{-8F, 8F, -8F, 8F, -8F, 8F};
        }
        BOUNDS.put(model, result);
        return result;
    }
}
