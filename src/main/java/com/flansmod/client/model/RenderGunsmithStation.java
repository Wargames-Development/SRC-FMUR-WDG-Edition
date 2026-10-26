package com.flansmod.client.model;

import com.flansmod.common.FlansMod;
import com.flansmod.common.TileEntityGunsmithStation;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class RenderGunsmithStation extends TileEntitySpecialRenderer implements IItemRenderer {
    private static final ResourceLocation MODEL = new ResourceLocation(
            FlansMod.MODID, "models/GunsmithStation.obj");
    private static final ResourceLocation TEXTURE = new ResourceLocation(
            FlansMod.MODID, "textures/models/GunsmithStation.png");

    private IModelCustom model;
    private boolean modelLoadAttempted;
    private int displayList;

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float partialTicks) {
        if (!(tileEntity instanceof TileEntityGunsmithStation) || !loadModel()) {
            return;
        }

        GL11.glPushMatrix();
        GL11.glTranslated(x, y, z);
        bindTexture(TEXTURE);
        drawModel(tileEntity.getBlockMetadata() >> 2);
        GL11.glPopMatrix();
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return item != null && item.getItemDamage() == 1;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return helper == ItemRendererHelper.ENTITY_BOBBING
                || helper == ItemRendererHelper.ENTITY_ROTATION
                || helper == ItemRendererHelper.INVENTORY_BLOCK
                || helper == ItemRendererHelper.EQUIPPED_BLOCK
                || helper == ItemRendererHelper.BLOCK_3D;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        if (!loadModel()) {
            return;
        }

        GL11.glPushMatrix();
        // Forge's inventory block helper expects geometry centered within a unit cube.
        GL11.glTranslatef(0.08F, 0.12F, 0.29F);
        GL11.glScalef(0.42F, 0.42F, 0.42F);
        Minecraft.getMinecraft().getTextureManager().bindTexture(TEXTURE);
        drawModel(0);
        GL11.glPopMatrix();
    }

    private void drawModel(int facing) {
        GL11.glPushAttrib(GL11.GL_ENABLE_BIT | GL11.GL_CURRENT_BIT);
        GL11.glPushMatrix();
        GL11.glDisable(GL11.GL_CULL_FACE);
        GL11.glColor4f(1F, 1F, 1F, 1F);
        // Center the two-unit-wide OBJ over the root and its adjacent part.
        GL11.glTranslatef(0.5F, 0F, 0.5F);
        GL11.glRotatef(-(facing & 3) * 90F, 0F, 1F, 0F);
        GL11.glTranslatef(0.99F, 0F, 0.050875F);
        GL11.glScalef(0.98F, 0.98F, 0.88F);
        GL11.glCallList(displayList);
        GL11.glPopMatrix();
        GL11.glPopAttrib();
    }

    private boolean loadModel() {
        if (!modelLoadAttempted) {
            modelLoadAttempted = true;
            try {
                model = AdvancedModelLoader.loadModel(MODEL);
                displayList = GLAllocation.generateDisplayLists(1);
                GL11.glNewList(displayList, GL11.GL_COMPILE);
                try {
                    model.renderAll();
                } finally {
                    GL11.glEndList();
                }
            } catch (RuntimeException exception) {
                FlansMod.logger.error("Failed to load the gunsmith station OBJ model", exception);
            }
        }
        return model != null && displayList != 0;
    }
}
