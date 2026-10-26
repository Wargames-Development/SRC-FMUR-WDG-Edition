package com.flansmod.client.model.NewTapArmor;

import com.flansmod.client.model.ModelCustomArmour;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class ModelGhillieBase extends ModelCustomArmour {
    private final int part;
    private final ModelRenderer hood;
    private final ModelRenderer head_r1;
    private final ModelRenderer head_r2;
    private final ModelRenderer head_r3;
    private final ModelRenderer head_r4;
    private final ModelRenderer head_r5;
    private final ModelRenderer head_r6;
    private final ModelRenderer head_r7;
    private final ModelRenderer head_r8;
    private final ModelRenderer head_r9;
    private final ModelRenderer head_r10;
    private final ModelRenderer head_r11;
    private final ModelRenderer torso;
    private final ModelRenderer body_r1;
    private final ModelRenderer body_r2;
    private final ModelRenderer body_r3;
    private final ModelRenderer leftarm_ghillie;
    private final ModelRenderer leftarm_r1;
    private final ModelRenderer leftarm_r2;
    private final ModelRenderer rightarm_ghillie;
    private final ModelRenderer leftarm_r3;
    private final ModelRenderer leftarm_r4;
    private final ModelRenderer leftleg_ghillie;
    private final ModelRenderer leftleg_r1;
    private final ModelRenderer leftleg_r2;
    private final ModelRenderer leftleg_r3;
    private final ModelRenderer rightleg_ghillie;
    private final ModelRenderer leftleg_r4;
    private final ModelRenderer leftleg_r5;
    private final ModelRenderer leftleg_r6;

    public ModelGhillieBase(int part) {
        super();
        this.part = part;
        textureWidth = 115;
        textureHeight = 115;

        hood = new ModelRenderer(this);
        hood.setRotationPoint(0.0F, 0.0F, 0.0F);
        hood.setTextureOffset(0, 0);
        hood.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);

        head_r1 = new ModelRenderer(this);
        head_r1.setRotationPoint(5.4F, -3.8F, -3.6F);
        hood.addChild(head_r1);
        setRotationAngle(head_r1, 0.0162F, -0.05F, 0.0861F);
        head_r1.setTextureOffset(46, 0);
        head_r1.addBox(-1.0F, 0.0F, 0.0F, 1, 4, 8, 0.0F);

        head_r2 = new ModelRenderer(this);
        head_r2.setRotationPoint(-5.4F, -3.8F, -3.6F);
        hood.addChild(head_r2);
        setRotationAngle(head_r2, 0.0162F, 0.05F, -0.0861F);
        head_r2.setTextureOffset(46, 15);
        head_r2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 8, 0.0F);

        head_r3 = new ModelRenderer(this);
        head_r3.setRotationPoint(4.0F, -3.5F, 6.3F);
        hood.addChild(head_r3);
        setRotationAngle(head_r3, -1.8675F, 0.0F, 0.0F);
        head_r3.setTextureOffset(24, 0);
        head_r3.addBox(-8.0F, 0.0F, 0.0F, 8, 3, 5, 0.0F);

        head_r4 = new ModelRenderer(this);
        head_r4.setRotationPoint(4.0F, -9.2F, 3.9F);
        hood.addChild(head_r4);
        setRotationAngle(head_r4, -1.1694F, 0.0F, 0.0F);
        head_r4.setTextureOffset(24, 26);
        head_r4.addBox(-8.0F, 0.0F, 0.0F, 8, 3, 6, 0.1F);

        head_r5 = new ModelRenderer(this);
        head_r5.setRotationPoint(4.0F, -8.1F, -5.2F);
        hood.addChild(head_r5);
        setRotationAngle(head_r5, 0.1571F, 0.0F, 0.0F);
        head_r5.setTextureOffset(0, 16);
        head_r5.addBox(-8.0F, 0.0F, 0.0F, 8, 1, 9, 0.0F);

        head_r6 = new ModelRenderer(this);
        head_r6.setRotationPoint(4.7F, -7.9F, 1.2F);
        hood.addChild(head_r6);
        setRotationAngle(head_r6, 0.4528F, -1.3252F, -0.7897F);
        head_r6.setTextureOffset(22, 65);
        head_r6.addBox(-5.0F, 0.0F, 0.0F, 5, 7, 0, 0.0F);

        head_r7 = new ModelRenderer(this);
        head_r7.setRotationPoint(-4.9F, -8.0F, 2.1F);
        hood.addChild(head_r7);
        setRotationAngle(head_r7, 0.3563F, 1.261F, 0.6894F);
        head_r7.setTextureOffset(64, 21);
        head_r7.addBox(0.0F, 0.0F, 0.0F, 5, 6, 0, 0.0F);

        head_r8 = new ModelRenderer(this);
        head_r8.setRotationPoint(-4.9F, -8.0F, -3.9F);
        hood.addChild(head_r8);
        setRotationAngle(head_r8, 0.1436F, 0.7331F, 0.4452F);
        head_r8.setTextureOffset(45, 0);
        head_r8.addBox(0.0F, 0.0F, 0.0F, 3, 5, 0, 0.0F);

        head_r9 = new ModelRenderer(this);
        head_r9.setRotationPoint(4.9F, -8.0F, -4.1F);
        hood.addChild(head_r9);
        setRotationAngle(head_r9, -0.0769F, -0.4091F, -0.125F);
        head_r9.setTextureOffset(50, 65);
        head_r9.addBox(-5.0F, 0.0F, 0.0F, 5, 5, 0, 0.0F);

        head_r10 = new ModelRenderer(this);
        head_r10.setRotationPoint(-4.2F, -8.0F, -4.9F);
        hood.addChild(head_r10);
        setRotationAngle(head_r10, 0.0847F, 0.0196F, 0.2641F);
        head_r10.setTextureOffset(15, 35);
        head_r10.addBox(0.0F, 0.0F, 0.0F, 1, 5, 9, 0.0F);

        head_r11 = new ModelRenderer(this);
        head_r11.setRotationPoint(4.2F, -8.0F, -4.9F);
        hood.addChild(head_r11);
        setRotationAngle(head_r11, 0.0847F, -0.0196F, -0.2641F);
        head_r11.setTextureOffset(35, 35);
        head_r11.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 9, 0.0F);

        torso = new ModelRenderer(this);
        torso.setRotationPoint(0.0F, 0.0F, 0.0F);
        torso.setTextureOffset(0, 26);
        torso.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.14F);
        torso.setTextureOffset(26, 10);
        torso.addBox(-3.5F, 2.0F, -1.0F, 7, 7, 4, 0.0F);
        torso.setTextureOffset(46, 27);
        torso.addBox(-4.0F, 9.25F, -2.0F, 8, 1, 4, 0.3F);

        body_r1 = new ModelRenderer(this);
        body_r1.setRotationPoint(3.7F, 2.1F, 3.3F);
        torso.addChild(body_r1);
        setRotationAngle(body_r1, 0.0119F, -0.2267F, 0.155F);
        body_r1.setTextureOffset(0, 61);
        body_r1.addBox(-7.0F, -2.0F, 0.0F, 7, 13, 0, 0.0F);

        body_r2 = new ModelRenderer(this);
        body_r2.setRotationPoint(4.0F, 2.0F, 1.8F);
        torso.addChild(body_r2);
        setRotationAngle(body_r2, 0.1222F, 0.1222F, 0.0F);
        body_r2.setTextureOffset(64, 45);
        body_r2.addBox(-7.0F, -2.0F, 0.0F, 7, 13, 0, 0.0F);

        body_r3 = new ModelRenderer(this);
        body_r3.setRotationPoint(-3.5F, 2.0F, -3.0F);
        torso.addChild(body_r3);
        setRotationAngle(body_r3, -0.2443F, 0.0F, 0.0F);
        body_r3.setTextureOffset(34, 23);
        body_r3.addBox(0.0F, -2.0F, 1.0F, 2, 2, 0, -0.01F);
        body_r3.setTextureOffset(40, 23);
        body_r3.addBox(5.0F, -2.0F, 1.0F, 2, 2, 0, -0.01F);

        leftarm_ghillie = new ModelRenderer(this);
        leftarm_ghillie.setRotationPoint(0.0F, 0.0F, 0.0F);
        leftarm_ghillie.setTextureOffset(48, 49);
        leftarm_ghillie.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.15F);
        leftarm_ghillie.setTextureOffset(60, 8);
        leftarm_ghillie.addBox(-1.0F, -2.0F, -2.0F, 4, 9, 4, 0.25F);

        leftarm_r1 = new ModelRenderer(this);
        leftarm_r1.setRotationPoint(4.6F, 6.4F, 0.1F);
        leftarm_ghillie.addChild(leftarm_r1);
        setRotationAngle(leftarm_r1, -0.3629F, -0.2914F, 1.3906F);
        leftarm_r1.setTextureOffset(22, 39);
        leftarm_r1.addBox(-7.0F, 0.0F, 0.0F, 7, 0, 4, 0.0F);

        leftarm_r2 = new ModelRenderer(this);
        leftarm_r2.setRotationPoint(3.3F, 1.6F, -4.0F);
        leftarm_ghillie.addChild(leftarm_r2);
        setRotationAngle(leftarm_r2, 0.2429F, 0.2435F, 1.1165F);
        leftarm_r2.setTextureOffset(52, 0);
        leftarm_r2.addBox(-5.0F, 0.0F, 0.0F, 5, 0, 4, 0.0F);

        rightarm_ghillie = new ModelRenderer(this);
        rightarm_ghillie.setRotationPoint(0.0F, 0.0F, 0.0F);
        rightarm_ghillie.setTextureOffset(0, 45);
        rightarm_ghillie.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.15F);
        rightarm_ghillie.setTextureOffset(55, 32);
        rightarm_ghillie.addBox(-3.0F, -2.0F, -2.0F, 4, 9, 4, 0.25F);

        leftarm_r3 = new ModelRenderer(this);
        leftarm_r3.setRotationPoint(-4.6F, 6.4F, 0.1F);
        rightarm_ghillie.addChild(leftarm_r3);
        setRotationAngle(leftarm_r3, -0.3629F, 0.2914F, -1.3906F);
        leftarm_r3.setTextureOffset(22, 35);
        leftarm_r3.addBox(0.0F, 0.0F, 0.0F, 7, 0, 4, 0.0F);

        leftarm_r4 = new ModelRenderer(this);
        leftarm_r4.setRotationPoint(-3.4F, 1.9F, -3.5F);
        rightarm_ghillie.addChild(leftarm_r4);
        setRotationAngle(leftarm_r4, 0.2079F, -0.2435F, -1.1165F);
        leftarm_r4.setTextureOffset(16, 26);
        leftarm_r4.addBox(0.0F, 0.0F, 0.0F, 5, 0, 4, 0.0F);

        leftleg_ghillie = new ModelRenderer(this);
        leftleg_ghillie.setRotationPoint(0.0F, 0.0F, 0.0F);
        leftleg_ghillie.setTextureOffset(32, 49);
        leftleg_ghillie.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F);

        leftleg_r1 = new ModelRenderer(this);
        leftleg_r1.setRotationPoint(-1.8F, 15.3F, 0.1F);
        leftleg_ghillie.addChild(leftleg_r1);
        setRotationAngle(leftleg_r1, 0.0302F, -0.244F, -0.0263F);
        leftleg_r1.setTextureOffset(64, 58);
        leftleg_r1.addBox(0.0F, -14.0F, 2.0F, 4, 10, 0, 0.0F);

        leftleg_r2 = new ModelRenderer(this);
        leftleg_r2.setRotationPoint(2.7F, 14.3F, 1.9F);
        leftleg_ghillie.addChild(leftleg_r2);
        setRotationAngle(leftleg_r2, -3.1345F, 1.2979F, 2.9536F);
        leftleg_r2.setTextureOffset(42, 65);
        leftleg_r2.addBox(0.0F, -12.0F, 2.0F, 4, 8, 0, 0.0F);

        leftleg_r3 = new ModelRenderer(this);
        leftleg_r3.setRotationPoint(0.0F, 12.0F, 2.7F);
        leftleg_ghillie.addChild(leftleg_r3);
        setRotationAngle(leftleg_r3, 0.1745F, 0.576F, 0.0F);
        leftleg_r3.setTextureOffset(46, 35);
        leftleg_r3.addBox(0.0F, -12.0F, 2.0F, 4, 9, 0, 0.0F);

        rightleg_ghillie = new ModelRenderer(this);
        rightleg_ghillie.setRotationPoint(0.0F, 0.0F, 0.0F);
        rightleg_ghillie.setTextureOffset(16, 49);
        rightleg_ghillie.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F);

        leftleg_r4 = new ModelRenderer(this);
        leftleg_r4.setRotationPoint(1.8F, 15.3F, 0.1F);
        rightleg_ghillie.addChild(leftleg_r4);
        setRotationAngle(leftleg_r4, 0.0302F, 0.244F, 0.0263F);
        leftleg_r4.setTextureOffset(14, 65);
        leftleg_r4.addBox(-4.0F, -14.0F, 2.0F, 4, 10, 0, 0.0F);

        leftleg_r5 = new ModelRenderer(this);
        leftleg_r5.setRotationPoint(-2.7F, 14.3F, 1.9F);
        rightleg_ghillie.addChild(leftleg_r5);
        setRotationAngle(leftleg_r5, -3.1345F, -1.2979F, -2.9536F);
        leftleg_r5.setTextureOffset(0, 0);
        leftleg_r5.addBox(-4.0F, -12.0F, 2.0F, 4, 8, 0, 0.0F);

        leftleg_r6 = new ModelRenderer(this);
        leftleg_r6.setRotationPoint(0.0F, 12.0F, 2.7F);
        rightleg_ghillie.addChild(leftleg_r6);
        setRotationAngle(leftleg_r6, 0.1745F, -0.576F, 0.0F);
        leftleg_r6.setTextureOffset(0, 16);
        leftleg_r6.addBox(-4.0F, -12.0F, 2.0F, 4, 9, 0, 0.0F);

        bipedRightArm = new ModelRenderer(this);
        bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        bipedRightArm.setTextureOffset(99, 0);
        bipedRightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);

        bipedLeftArm = new ModelRenderer(this);
        bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        bipedLeftArm.setTextureOffset(99, 24);
        bipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        bipedRightLeg = new ModelRenderer(this);
        bipedRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
        bipedRightLeg.setTextureOffset(99, 53);
        bipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);

        bipedLeftLeg = new ModelRenderer(this);
        bipedLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
        bipedLeftLeg.setTextureOffset(99, 70);
        bipedLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);

        this.bipedHead = new ModelRenderer(this);
        this.bipedBody = new ModelRenderer(this);
        this.bipedHead.addChild(hood);
        this.bipedBody.addChild(torso);
        this.bipedLeftArm.addChild(leftarm_ghillie);
        this.bipedRightArm.addChild(rightarm_ghillie);
        this.bipedLeftLeg.addChild(leftleg_ghillie);
        this.bipedRightLeg.addChild(rightleg_ghillie);

        this.bipedHeadwear.isHidden = true;
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        isSneak = entity.isSneaking();
        isRiding = entity.isRiding();
        ItemStack held = entity instanceof EntityLivingBase
                ? ((EntityLivingBase) entity).getEquipmentInSlot(0) : null;
        heldItemRight = held == null ? 0 : 1;
        aimedBow = false;
        if (held != null && entity instanceof EntityPlayer
                && ((EntityPlayer) entity).getItemInUseCount() > 0) {
            EnumAction action = held.getItemUseAction();
            if (action == EnumAction.block) heldItemRight = 3;
            if (action == EnumAction.bow) aimedBow = true;
        }
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        if (entity instanceof EntityPlayer) {
            Render renderer = RenderManager.instance.getEntityRenderObject(entity);
            if (renderer instanceof RenderPlayer) {
                ModelBiped playerModel = ((RenderPlayer) renderer).modelBipedMain;
                copyPose(playerModel.bipedHead, bipedHead);
                copyPose(playerModel.bipedBody, bipedBody);
                copyPose(playerModel.bipedLeftArm, bipedLeftArm);
                copyPose(playerModel.bipedRightArm, bipedRightArm);
                copyPose(playerModel.bipedLeftLeg, bipedLeftLeg);
                copyPose(playerModel.bipedRightLeg, bipedRightLeg);
            }
        }
        GL11.glPushMatrix();
        try {
            GL11.glScalef(type.modelScale, type.modelScale, type.modelScale);
            if (part == 0) {
                bipedHead.showModel = true;
                bipedHead.isHidden = false;
                bipedHead.render(f5);
            }
            if (part == 1) {
                bipedBody.showModel = true;
                bipedLeftArm.showModel = true;
                bipedRightArm.showModel = true;
                bipedLeftLeg.showModel = true;
                bipedRightLeg.showModel = true;
                bipedBody.isHidden = false;
                bipedLeftArm.isHidden = false;
                bipedRightArm.isHidden = false;
                bipedLeftLeg.isHidden = false;
                bipedRightLeg.isHidden = false;
                bipedBody.render(f5);
                bipedLeftArm.render(f5);
                bipedRightArm.render(f5);
                bipedLeftLeg.render(f5);
                bipedRightLeg.render(f5);
            }
        } finally {
            GL11.glPopMatrix();
        }
    }

    private void copyPose(ModelRenderer from, ModelRenderer to) {
        to.rotationPointX = from.rotationPointX;
        to.rotationPointY = from.rotationPointY;
        to.rotationPointZ = from.rotationPointZ;
        to.rotateAngleX = from.rotateAngleX;
        to.rotateAngleY = from.rotateAngleY;
        to.rotateAngleZ = from.rotateAngleZ;
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
