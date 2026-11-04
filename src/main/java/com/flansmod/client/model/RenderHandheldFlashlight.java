package com.flansmod.client.model;

import com.flansmod.common.FlansMod;
import com.flansmod.client.AttachmentLightRenderer;
import com.flansmod.common.tools.ItemHandheldFlashlight;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class RenderHandheldFlashlight implements IItemRenderer {
    public static final float HAND_X = 0.32F, HAND_Y = -0.50F, HAND_Z = -1.10F, MODEL_SCALE = 0.45F;
    public static final float EMITTER_FORWARD = -HAND_Z + 0.625F * MODEL_SCALE;
    public static final float EMITTER_UP = HAND_Y + 0.125F * MODEL_SCALE;
    private static final ResourceLocation MODEL = new ResourceLocation("flansmod", "models/flashlight/flashlight_runtime.obj");
    private static final ResourceLocation TEXTURE = new ResourceLocation("flansmod", "models/flashlight/flashlight.png");
    private IModelCustom model;
    private boolean loadAttempted;

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return item != null && item.getItem() instanceof ItemHandheldFlashlight;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        if (type == ItemRenderType.EQUIPPED)
            return helper == ItemRendererHelper.BLOCK_3D || helper == ItemRendererHelper.EQUIPPED_BLOCK;
        return type == ItemRenderType.ENTITY && (helper == ItemRendererHelper.ENTITY_BOBBING
                || helper == ItemRendererHelper.ENTITY_ROTATION);
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        if (!loadAttempted) {
            loadAttempted = true;
            try { model = AdvancedModelLoader.loadModel(MODEL); }
            catch (RuntimeException failure) { FlansMod.logger.error("Unable to load handheld flashlight model", failure); }
        }
        if (model == null) return;
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glPushMatrix();
        try {
            Minecraft.getMinecraft().getTextureManager().bindTexture(TEXTURE);
            GL11.glColor4f(1F, 1F, 1F, 1F);
            GL11.glDisable(GL11.GL_CULL_FACE);
            if (type == ItemRenderType.INVENTORY) {
                GL11.glTranslatef(8F, 8F, 0F);
                GL11.glScalef(12F, -12F, 12F);
                GL11.glRotatef(25F, 1F, 0F, 0F);
                GL11.glRotatef(135F, 0F, 1F, 0F);
                GL11.glTranslatef(0F, -0.125F, 0.0625F);
            } else if (type == ItemRenderType.EQUIPPED_FIRST_PERSON) {
                // The supplied OBJ points down -Z. Keep its nose aligned with the
                // camera-space light origin instead of vanilla's flat-item tilt.
                GL11.glLoadIdentity();
                FirstPersonHands.applyViewBobbing(Minecraft.getMinecraft().thePlayer, RenderGun.smoothing);
                GL11.glTranslatef(HAND_X, HAND_Y, HAND_Z);
                FirstPersonHands.render(Minecraft.getMinecraft().thePlayer, true,
                        0F, 0.10F, 0.25F * MODEL_SCALE, -55F, 15F);
                Minecraft.getMinecraft().getTextureManager().bindTexture(TEXTURE);
                GL11.glScalef(MODEL_SCALE, MODEL_SCALE, MODEL_SCALE);
            } else if (type == ItemRenderType.EQUIPPED) {
                // Undo Forge's block helper and RenderPlayer's block-item pose,
                // preserving the animated right-arm matrix and its hand offset.
                GL11.glTranslatef(0.5F, 0.5F, 0.5F);
                GL11.glScalef(-1F / 0.375F, -1F / 0.375F, 1F / 0.375F);
                GL11.glRotatef(-45F, 0F, 1F, 0F);
                GL11.glRotatef(-20F, 1F, 0F, 0F);
                GL11.glTranslatef(0F, -0.1875F, 0.3125F);
                GL11.glTranslatef(0F, 0.09375F, -0.0625F);
                GL11.glScalef(MODEL_SCALE, -MODEL_SCALE, MODEL_SCALE);
                GL11.glTranslatef(0F, -0.125F, -0.25F);
            } else {
                GL11.glScalef(MODEL_SCALE, MODEL_SCALE, MODEL_SCALE);
            }
            if (type == ItemRenderType.EQUIPPED_FIRST_PERSON)
                AttachmentLightRenderer.renderHandheldEmitter(Minecraft.getMinecraft().thePlayer, true);
            else if (type == ItemRenderType.EQUIPPED && data.length > 1 && data[1] instanceof EntityPlayer)
                AttachmentLightRenderer.renderHandheldEmitter((EntityPlayer) data[1], false);
            model.renderAll();
        } finally { GL11.glPopMatrix(); GL11.glPopAttrib(); }
    }
}
