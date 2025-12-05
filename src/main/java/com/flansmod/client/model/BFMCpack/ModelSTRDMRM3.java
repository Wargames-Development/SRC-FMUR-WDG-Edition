package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelSTRDMRM3 extends ModelGun {
    public ModelSTRDMRM3() {

        int textureX = 512;
        int textureY = 512;

        gunModel = new ModelRendererTurbo[1];
        gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        gunModel[0].addObj("/BFMCpack/STR-DMR/STR-DMRM3_Gun.obj");
        gunModel[0].setRotationPoint(0F, 0F, 0F);

        ammoModel = new ModelRendererTurbo[1];
        ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        ammoModel[0].addObj("/BFMCpack/STR-DMR/STR-DMRM3_Ammo.obj");
        ammoModel[0].setRotationPoint(0F, 0F, 0F);

        scopeAttachPoint = new Vector3f(57F / 16F, 68.59F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(95F / 16F, 54.66F / 16F, -12.95F / 16F);
        gripAttachPoint = new Vector3f(165F / 16F, 38.55F / 16F, 0F / 16F);
        barrelAttachPoint = new Vector3f(-200F / 16F, -1000F / 16F, 0F / 16F);

        rightHandAmmo = false;
        leftHandAmmo = true;
        leftArmPos = new Vector3f(0.17F, -0.5F, 0.0F);
        leftArmRot = new Vector3f(80F, 55F, 10F);
        leftArmReloadPos = new Vector3f(-0.13F, -0.6F, 0.05F);
        leftArmReloadRot = new Vector3f(80F, 60F, 0.0F);
        rightArmPos = new Vector3f(0.17F, -0.52F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmReloadPos = new Vector3f(0.17F, -0.52F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.5D, 0.75D);
        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);
        hasArms = true;
        hasFlash = true;
        animationType = EnumAnimationType.CUSTOM;
        rotateGunHorizontal = 15F;
        tiltGun = 30F;
        translateGun = new Vector3f(0.0F, -0.0625F, -0.1875F);
        translateClip = new Vector3f(0.0F, -0.625F, 0.0F);

        zoomOffsetY = -0.05F;
        zoomOffset = 0.45F;
        gunOffset = -0.5F;

        translateAll(0F, 0F, 0F);

    }
}
