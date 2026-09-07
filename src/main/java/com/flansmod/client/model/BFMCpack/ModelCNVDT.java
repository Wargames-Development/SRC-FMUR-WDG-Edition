package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.ThermalScopeEffect;
import com.flansmod.client.model.ModelAttachment;
import com.flansmod.common.FlansMod;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class ModelCNVDT extends ModelAttachment {
    private static final ResourceLocation MODEL = new ResourceLocation(
            "flansmod", "models/BFMCpack/CNVDTSCOPE_runtime.obj");

    private IModelCustom scopeModel;
    private boolean modelLoadAttempted;

    public ModelCNVDT() {
        renderOffset = 0.12F;
    }

    @Override
    public void renderAttachment(float scale) {
        if (!loadModel()) {
            return;
        }

        GL11.glPushMatrix();
        GL11.glRotatef(90F, 0F, 1F, 0F);
        GL11.glScalef(0.25F, 0.25F, 0.25F);
        scopeModel.renderAll();
        renderThermalLens();
        GL11.glPopMatrix();
    }

    private void renderThermalLens() {
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        try {
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            GL11.glEnable(GL11.GL_POLYGON_OFFSET_FILL);
            GL11.glPolygonOffset(-2F, -2F);

            int lensTexture = ThermalScopeEffect.getModelLensTexture();
            if (lensTexture >= 0 && ThermalScopeEffect.isModelLensActive()) {
                GL11.glEnable(GL11.GL_TEXTURE_2D);
                GL11.glBindTexture(GL11.GL_TEXTURE_2D, lensTexture);
                GL11.glColor4f(1F, 1F, 1F, 1F);
            } else {
                GL11.glDisable(GL11.GL_TEXTURE_2D);
                GL11.glColor4f(0.04F, 0.07F, 0.06F, 1F);
            }

            final float centerY = 0.25F;
            final float radius = 0.15F;
            final float lensZ = -0.535F;
            GL11.glBegin(GL11.GL_TRIANGLE_FAN);
            GL11.glTexCoord2f(0.5F, 0.5F);
            GL11.glVertex3f(0F, centerY, lensZ);
            for (int index = 0; index <= 32; index++) {
                double angle = Math.PI * 2D * index / 32D;
                float x = (float)Math.cos(angle);
                float y = (float)Math.sin(angle);
                GL11.glTexCoord2f(0.5F - x * 0.5F, 0.5F + y * 0.5F);
                GL11.glVertex3f(x * radius, centerY + y * radius, lensZ);
            }
            GL11.glEnd();
        } finally {
            GL11.glPopAttrib();
        }
    }

    private boolean loadModel() {
        if (!modelLoadAttempted) {
            modelLoadAttempted = true;
            try {
                scopeModel = AdvancedModelLoader.loadModel(MODEL);
            } catch (RuntimeException exception) {
                FlansMod.logger.error("Failed to load the CNVD-T OBJ model", exception);
            }
        }
        return scopeModel != null;
    }
}
