package com.flansmod.client.model.BFMCpack;

import com.flansmod.common.FlansMod;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class ModelMolotov extends ModelBase {
    private static final ResourceLocation MODEL = new ResourceLocation(
            "flansmod", "models/molotov/molotov_runtime.obj");
    private IModelCustom model;
    private boolean loadAttempted;

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float age,
                       float yaw, float pitch, float scale) {
        if (!loadAttempted) {
            loadAttempted = true;
            try {
                model = AdvancedModelLoader.loadModel(MODEL);
            } catch (RuntimeException failure) {
                FlansMod.logger.error("Unable to load Molotov model", failure);
            }
        }
        if (model == null) return;

        GL11.glPushAttrib(GL11.GL_ENABLE_BIT);
        GL11.glPushMatrix();
        try {
            // The export is four units tall. At the grenade renderer's 1/16 scale,
            // this makes a 0.6-block bottle with the grip above its base.
            float modelScale = scale * 2.4F;
            GL11.glScalef(modelScale, modelScale, modelScale);
            GL11.glTranslatef(0F, -1F, 0F);
            GL11.glEnable(GL11.GL_NORMALIZE);
            GL11.glDisable(GL11.GL_CULL_FACE);
            model.renderAll();
        } finally {
            GL11.glPopMatrix();
            GL11.glPopAttrib();
        }
    }
}
