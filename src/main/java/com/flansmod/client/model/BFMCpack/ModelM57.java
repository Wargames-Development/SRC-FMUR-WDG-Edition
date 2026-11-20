package com.flansmod.client.model.BFMCpack;

import com.flansmod.common.FlansMod;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class ModelM57 extends ModelBase {
    private IModelCustom model;
    private boolean loadAttempted;

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float squeeze,
                       float yaw, float pitch, float scale) {
        if (!loadAttempted) {
            loadAttempted = true;
            try {
                model = AdvancedModelLoader.loadModel(new ResourceLocation(
                        "flansmod", "models/demolition/m57_runtime.obj"));
            } catch (RuntimeException failure) {
                FlansMod.logger.error("Unable to load M57 model", failure);
            }
        }
        if (model == null) return;
        GL11.glPushAttrib(GL11.GL_ENABLE_BIT);
        GL11.glPushMatrix();
        try {
            float size = scale * 3.2F;
            GL11.glScalef(size, size, size);
            GL11.glTranslatef(0F, -0.35F, 0F);
            GL11.glEnable(GL11.GL_NORMALIZE);
            GL11.glDisable(GL11.GL_CULL_FACE);
            model.renderPart("body");
            // The export is nearly closed: open the handle at rest, then squeeze
            // toward the body around its upper hinge when the player fires.
            GL11.glTranslatef(0F, 1.14375F, -0.5F);
            GL11.glRotatef(30F - 34F * Math.max(0F, Math.min(1F, squeeze)), 1F, 0F, 0F);
            GL11.glTranslatef(0F, -1.14375F, 0.5F);
            model.renderPart("handle");
        } finally { GL11.glPopMatrix(); GL11.glPopAttrib(); }
    }
}
