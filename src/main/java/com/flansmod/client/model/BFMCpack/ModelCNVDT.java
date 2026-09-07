package com.flansmod.client.model.BFMCpack;

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
        GL11.glPopMatrix();
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
