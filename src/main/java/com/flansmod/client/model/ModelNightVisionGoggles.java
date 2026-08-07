package com.flansmod.client.model;

import com.flansmod.client.NightVisionGogglesAnimation;
import com.flansmod.common.FlansMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

/** Renders the static mount and animated flip assembly from the supplied OBJs. */
@SideOnly(Side.CLIENT)
public class ModelNightVisionGoggles extends ModelBiped {
    private static final float PIVOT_X = 5.5F / 16F;
    private static final float PIVOT_Y = 4.88F / 16F;
    private static final float PIVOT_Z = 0F;
    private static final float MODEL_SCALE = 1.5F;
    private static final float MODEL_OFFSET_Y = -1F / 16F;
    private static final float RAISED_ANGLE = 110F;

    private final IModelCustom mountModel;
    private final IModelCustom flipModel;

    public ModelNightVisionGoggles() {
        super(0F);
        mountModel = AdvancedModelLoader.loadModel(new ResourceLocation(
                FlansMod.MODID, "models/gpnvg/GPNVG_Mount_runtime.obj"));
        flipModel = AdvancedModelLoader.loadModel(new ResourceLocation(
                FlansMod.MODID, "models/gpnvg/GPNVG_Flip_runtime.obj"));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
                       float netHeadYaw, float headPitch, float scale) {
        setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);

        GL11.glPushMatrix();
        applyHeadTransform(scale);
        GL11.glTranslatef(0F, MODEL_OFFSET_Y, 0F);

        // The Blockbench file faces +X, uses +Y as up and +Z as its hinge axis.
        // These rotations map it to Minecraft head space while preserving winding:
        // +X -> -Z (forward), +Y -> -Y, +Z -> -X.
        GL11.glRotatef(180F, 0F, 0F, 1F);
        GL11.glRotatef(90F, 0F, 1F, 0F);

        // Scale both pieces around the hinge so increasing their size does not
        // move the flip point away from its helmet mount.
        GL11.glTranslatef(PIVOT_X, PIVOT_Y, PIVOT_Z);
        GL11.glScalef(MODEL_SCALE, MODEL_SCALE, MODEL_SCALE);
        GL11.glTranslatef(-PIVOT_X, -PIVOT_Y, -PIVOT_Z);

        mountModel.renderAll();

        float loweredProgress = NightVisionGogglesAnimation.getLoweredProgress(
                (EntityLivingBase) entity, RenderGun.smoothing);
        float angle = RAISED_ANGLE * (1F - loweredProgress);

        GL11.glPushMatrix();
        GL11.glTranslatef(PIVOT_X, PIVOT_Y, PIVOT_Z);
        GL11.glRotatef(angle, 0F, 0F, 1F);
        GL11.glTranslatef(-PIVOT_X, -PIVOT_Y, -PIVOT_Z);
        flipModel.renderAll();
        GL11.glPopMatrix();

        GL11.glPopMatrix();
    }

    private void applyHeadTransform(float scale) {
        GL11.glTranslatef(bipedHead.rotationPointX * scale,
                bipedHead.rotationPointY * scale,
                bipedHead.rotationPointZ * scale);
        if (bipedHead.rotateAngleZ != 0F) {
            GL11.glRotatef(bipedHead.rotateAngleZ * 180F / (float) Math.PI, 0F, 0F, 1F);
        }
        if (bipedHead.rotateAngleY != 0F) {
            GL11.glRotatef(bipedHead.rotateAngleY * 180F / (float) Math.PI, 0F, 1F, 0F);
        }
        if (bipedHead.rotateAngleX != 0F) {
            GL11.glRotatef(bipedHead.rotateAngleX * 180F / (float) Math.PI, 1F, 0F, 0F);
        }
    }
}
