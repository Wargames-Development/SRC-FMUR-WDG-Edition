package com.flansmod.client.model;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.mob.EntitySoldier;
import com.flansmod.common.teams.ArmourType;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class ModelCustomArmour extends ModelBiped {
    public ArmourType type;

    private final ModelRendererTurbo.RenderBatchCache renderBatchCache = new ModelRendererTurbo.RenderBatchCache();

    public ModelRendererTurbo[] headModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] bodyModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] leftArmModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] rightArmModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] leftLegModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] rightLegModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] skirtFrontModel = new ModelRendererTurbo[0]; //Acts like a leg piece, but its pitch is set to the maximum of the two legs
    public ModelRendererTurbo[] skirtRearModel = new ModelRendererTurbo[0]; //Acts like a leg piece, but its pitch is set to the minimum of the two legs

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GL11.glPushMatrix();
        ModelRendererTurbo.beginRenderBatch();
        try {
            GL11.glScalef(type.modelScale, type.modelScale, type.modelScale);
            isSneak = entity.isSneaking();
            ItemStack itemstack = ((EntityLivingBase) entity).getEquipmentInSlot(0);
            heldItemRight = itemstack != null ? 1 : 0;

            aimedBow = false;
            if (itemstack != null && entity instanceof EntityPlayer && ((EntityPlayer) entity).getItemInUseCount() > 0) {
                EnumAction enumaction = itemstack.getItemUseAction();
                if (enumaction == EnumAction.block) {
                    heldItemRight = 3;
                } else if (enumaction == EnumAction.bow) {
                    aimedBow = true;
                }
            } else if (itemstack != null && entity instanceof EntitySoldier) {
                EnumAction enumaction = itemstack.getItemUseAction();
                if (enumaction == EnumAction.block) {
                    heldItemRight = 3;
                } else if (enumaction == EnumAction.bow) {
                    aimedBow = true;
                }
            }
            setRotationAngles(f, f1, f2, f3, f4, f5, entity);
            render(headModel, bipedHead, f5, type.modelScale);
            render(bodyModel, bipedBody, f5, type.modelScale);
            render(leftArmModel, bipedLeftArm, f5, type.modelScale);
            render(rightArmModel, bipedRightArm, f5, type.modelScale);
            render(leftLegModel, bipedLeftLeg, f5, type.modelScale);
            render(rightLegModel, bipedRightLeg, f5, type.modelScale);

            float skirtX = (bipedLeftLeg.rotationPointX + bipedRightLeg.rotationPointX) / 2F;
            float skirtY = (bipedLeftLeg.rotationPointY + bipedRightLeg.rotationPointY) / 2F;
            float skirtZ = (bipedLeftLeg.rotationPointZ + bipedRightLeg.rotationPointZ) / 2F;
            render(skirtFrontModel, skirtX, skirtY, skirtZ,
                    Math.min(bipedLeftLeg.rotateAngleX, bipedRightLeg.rotateAngleX),
                    bipedLeftLeg.rotateAngleY, bipedLeftLeg.rotateAngleZ, f5, type.modelScale);
            render(skirtRearModel, skirtX, skirtY, skirtZ,
                    Math.max(bipedLeftLeg.rotateAngleX, bipedRightLeg.rotateAngleX),
                    bipedLeftLeg.rotateAngleY, bipedLeftLeg.rotateAngleZ, f5, type.modelScale);
        } finally {
            ModelRendererTurbo.endRenderBatch();
            GL11.glPopMatrix();
        }
    }

    public void render(ModelRendererTurbo[] models, ModelRenderer bodyPart, float f5, float scale) {
        render(models, bodyPart.rotationPointX, bodyPart.rotationPointY, bodyPart.rotationPointZ,
                bodyPart.rotateAngleX, bodyPart.rotateAngleY, bodyPart.rotateAngleZ, f5, scale);
    }

    private void render(ModelRendererTurbo[] models, float rotationPointX, float rotationPointY,
                        float rotationPointZ, float rotateAngleX, float rotateAngleY,
                        float rotateAngleZ, float worldScale, float modelScale) {
        if (models == null || models.length == 0) {
            return;
        }

        // Animate the whole body group outside the cached geometry. Putting the pose on every
        // part would invalidate and rebuild the batch whenever a player moves.
        clearPerPartTransforms(models);
        GL11.glPushMatrix();
        try {
            GL11.glTranslatef(rotationPointX / modelScale * worldScale,
                    rotationPointY / modelScale * worldScale,
                    rotationPointZ / modelScale * worldScale);
            if (rotateAngleY != 0F) {
                GL11.glRotatef(rotateAngleY * 57.29578F, 0F, 1F, 0F);
            }
            if (rotateAngleZ != 0F) {
                GL11.glRotatef(rotateAngleZ * 57.29578F, 0F, 0F, 1F);
            }
            if (rotateAngleX != 0F) {
                GL11.glRotatef(rotateAngleX * 57.29578F, 1F, 0F, 0F);
            }
            renderBatchCache.render(models, worldScale);
        } finally {
            GL11.glPopMatrix();
        }
    }

    private void clearPerPartTransforms(ModelRendererTurbo[] models) {
        for (ModelRendererTurbo model : models) {
            if (model != null) {
                model.rotationPointX = 0F;
                model.rotationPointY = 0F;
                model.rotationPointZ = 0F;
                model.rotateAngleX = 0F;
                model.rotateAngleY = 0F;
                model.rotateAngleZ = 0F;
            }
        }
    }

    public void setBodyPart(ModelRendererTurbo[] models, ModelRenderer bodyPart, float scale) {
        for (ModelRendererTurbo mod : models) {
            mod.rotationPointX = bodyPart.rotationPointX / scale;
            mod.rotationPointY = bodyPart.rotationPointY / scale;
            mod.rotationPointZ = bodyPart.rotationPointZ / scale;
        }
    }
}
