package com.flansmod.client.model.BFMCpack;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.EntityGrenade;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class ModelIed extends ModelBase {
    private IModelCustom model;
    private boolean loadAttempted;

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float age,
                       float yaw, float pitch, float scale) {
        if (!loadAttempted) {
            loadAttempted = true;
            try {
                model = AdvancedModelLoader.loadModel(new ResourceLocation("flansmod", "models/demolition/ied_runtime.obj"));
            } catch (RuntimeException failure) {
                FlansMod.logger.error("Unable to load IED model", failure);
            }
        }
        if (model == null) return;
        GL11.glPushAttrib(GL11.GL_ENABLE_BIT);
        GL11.glPushMatrix();
        try {
            float size = scale * 5.2F;
            GL11.glScalef(size, size, size);
            if (entity instanceof EntityGrenade) {
                // Center the OBJ's long axis for the tumble. Once stuck, local +Y points out of the surface.
                GL11.glTranslatef(-0.78125F, ((EntityGrenade) entity).stuck ? 0.25F : 0F, 0F);
                GL11.glRotatef(-90F, 0F, 0F, 1F);
            }
            GL11.glEnable(GL11.GL_NORMALIZE);
            GL11.glDisable(GL11.GL_CULL_FACE);
            model.renderAll();
        } finally { GL11.glPopMatrix(); GL11.glPopAttrib(); }
    }
}
