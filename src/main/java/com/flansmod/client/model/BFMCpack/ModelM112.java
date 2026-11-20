package com.flansmod.client.model.BFMCpack;

import com.flansmod.common.FlansMod;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class ModelM112 extends ModelBase {
    private IModelCustom model;
    private boolean loadAttempted;

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float age,
                       float yaw, float pitch, float scale) {
        if (!loadAttempted) {
            loadAttempted = true;
            try {
                model = AdvancedModelLoader.loadModel(new ResourceLocation(
                        "flansmod", "models/demolition/m112_runtime.obj"));
            } catch (RuntimeException failure) {
                FlansMod.logger.error("Unable to load M112 model", failure);
            }
        }
        if (model == null) return;
        GL11.glPushAttrib(GL11.GL_ENABLE_BIT);
        GL11.glPushMatrix();
        try {
            // The two-unit-wide export becomes a handheld 0.65-block charge.
            float size = scale * 5.2F;
            GL11.glScalef(size, size, size);
            GL11.glEnable(GL11.GL_NORMALIZE);
            GL11.glDisable(GL11.GL_CULL_FACE);
            model.renderAll();
        } finally { GL11.glPopMatrix(); GL11.glPopAttrib(); }
    }
}
