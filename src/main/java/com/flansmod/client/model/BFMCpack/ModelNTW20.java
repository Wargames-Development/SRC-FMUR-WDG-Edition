package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelNTW20 extends ModelGun {
    public ModelNTW20() {

        int textureX = 512;
        int textureY = 512;

        gunModel = new ModelRendererTurbo[1];
        gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        gunModel[0].addObj("/BFMCpack/NTW-20.obj");
        gunModel[0].setRotationPoint(0F, 0F, 0F);

        ammoModel = new ModelRendererTurbo[1];
        ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        ammoModel[0].addObj("/BFMCpack/NTW-20_Ammo.obj");
        ammoModel[0].setRotationPoint(0F, 0F, 0F);

        pumpDelayAfterReload = 60;
        pumpDelay = 15;
        pumpTime = 25;
        pumpHandleDistance = 0.5F;
        rightHandAmmo = false;
        leftHandAmmo = false;

        leftArmPos = new Vector3f(0.17F, -0.5F, 0.0F);
        leftArmRot = new Vector3f(80F, 55F, 10F);
        leftArmReloadPos = new Vector3f(0.1F, -0.55F, 0.1F);
        leftArmReloadRot = new Vector3f(55F, 70F, 25F);
        leftArmScale = new Vector3f(0.75D, 1.5D, 0.75D);

        rightArmPos = new Vector3f(0.17F, -0.52F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmReloadPos = new Vector3f(0.17F, -0.52F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);

        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);
        hasArms = true;
        hasFlash = true;
        animationType = EnumAnimationType.CUSTOM;
        rotateGunVertical = 20.0F;
        tiltGun = -60.0F;
        translateGun = new Vector3f(0.0F, -0.0625F, -0.1875F);
        translateClip = new Vector3f(0.0F, -0.625F, 0.0F);
        chargeHandleDistance = 0.5F;
        chargeDelay = 10;
        chargeDelayAfterReload = 80;
        chargeTime = 20;
        rightArmChargePos = new Vector3f(-0F, -0.5F, 0.13F);
        rightArmChargeRot = new Vector3f(-0F, 0.0F, -70F);
        chargeModifier = new Vector3f(16F, 8F, 4F);
        rightHandBolt = true;

        translateAll(5F, 5F, 0F);
        zoomOffsetY = -0.1F;
    }
}
