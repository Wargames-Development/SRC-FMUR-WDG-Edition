package com.flansmod.client.model;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.EntityChemLight;
import com.flansmod.common.guns.item.ItemChemLight;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

/** Shared OBJ renderer for thrown, dropped, and held chemlights. */
public class RenderChemLight extends Render implements IItemRenderer {
    private static final ResourceLocation MODEL = new ResourceLocation(
            FlansMod.MODID, "models/chemlight/CHEMLIGHT_runtime.obj");
    private final IModelCustom model;

    public RenderChemLight() {
        shadowSize = 0.08F;
        model = AdvancedModelLoader.loadModel(MODEL);
    }

    @Override
    public void doRender(Entity entity, double x, double y, double z,
                         float yaw, float partialTicks) {
        EntityChemLight chemLight = (EntityChemLight)entity;
        bindEntityTexture(entity);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)x, (float)y + 0.04F, (float)z);
        GL11.glRotatef(chemLight.prevRotationYaw
                + (chemLight.rotationYaw - chemLight.prevRotationYaw) * partialTicks,
                0F, 1F, 0F);
        GL11.glRotatef(chemLight.prevRotationPitch
                + (chemLight.rotationPitch - chemLight.prevRotationPitch) * partialTicks,
                0F, 0F, 1F);
        GL11.glTranslatef(0F, -0.20F, 0F);
        model.renderAll();
        GL11.glPopMatrix();
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return textureFor(((EntityChemLight)entity).getChemLightColor());
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return item != null && item.getItem() instanceof ItemChemLight
                && (type == ItemRenderType.EQUIPPED
                || type == ItemRenderType.EQUIPPED_FIRST_PERSON
                || type == ItemRenderType.ENTITY);
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
                                         ItemRendererHelper helper) {
        return type == ItemRenderType.ENTITY
                && helper == ItemRendererHelper.ENTITY_BOBBING;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        ItemChemLight chemLight = (ItemChemLight)item.getItem();
        Minecraft.getMinecraft().renderEngine.bindTexture(
                textureFor(chemLight.getChemLightColor()));

        GL11.glPushMatrix();
        switch (type) {
            case EQUIPPED_FIRST_PERSON:
                GL11.glTranslatef(0.72F, 0.10F, 0.35F);
                GL11.glRotatef(-25F, 0F, 0F, 1F);
                GL11.glScalef(1.7F, 1.7F, 1.7F);
                break;
            case EQUIPPED:
                GL11.glTranslatef(0.72F, 0.25F, 0.18F);
                GL11.glRotatef(-20F, 0F, 0F, 1F);
                GL11.glScalef(1.45F, 1.45F, 1.45F);
                break;
            case ENTITY:
                GL11.glRotatef(90F, 0F, 0F, 1F);
                GL11.glTranslatef(0F, -0.20F, 0F);
                GL11.glScalef(1.35F, 1.35F, 1.35F);
                break;
            default:
                break;
        }
        model.renderAll();
        GL11.glPopMatrix();
    }

    private static ResourceLocation textureFor(ItemChemLight.Color color) {
        return new ResourceLocation(FlansMod.MODID,
                "textures/models/chemlight/chemlight_"
                        + color.getResourceName() + ".png");
    }
}
