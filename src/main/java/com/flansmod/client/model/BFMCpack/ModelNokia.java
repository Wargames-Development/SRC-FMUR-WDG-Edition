package com.flansmod.client.model.BFMCpack;

import com.flansmod.common.FlansMod;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class ModelNokia extends ModelBase {
    public static final int CALL_KEY = 10;
    private static final String[] KEYS = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "call"
    };
    private IModelCustom model;
    private boolean loadAttempted;

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float age,
                       float yaw, float pitch, float scale) {
        renderKeyPress(-1, 0F, scale * 4.16F);
    }

    public void renderKeyPress(int key, float press, float size) {
        if (!loadAttempted) {
            loadAttempted = true;
            try {
                model = AdvancedModelLoader.loadModel(new ResourceLocation("flansmod", "models/demolition/nokia_runtime.obj"));
            } catch (RuntimeException failure) {
                FlansMod.logger.error("Unable to load Nokia model", failure);
            }
        }
        if (model == null) return;
        GL11.glPushAttrib(GL11.GL_ENABLE_BIT);
        GL11.glPushMatrix();
        try {
            GL11.glScalef(size, size, size);
            GL11.glEnable(GL11.GL_NORMALIZE);
            GL11.glDisable(GL11.GL_CULL_FACE);
            if (key < 0 || press <= 0F) {
                model.renderAll();
            } else {
                String pressed = KEYS[key];
                model.renderAllExcept(pressed);
                // The keypad faces -X in the export, so a press moves into the handset along +X.
                GL11.glTranslatef(0.022F * press, 0F, 0F);
                model.renderPart(pressed);
            }
        } finally { GL11.glPopMatrix(); GL11.glPopAttrib(); }
    }
}
