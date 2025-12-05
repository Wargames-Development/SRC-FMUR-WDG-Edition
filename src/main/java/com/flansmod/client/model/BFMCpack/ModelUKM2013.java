package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelUKM2013 extends ModelGun {
    public ModelUKM2013() {
        int textureX = 256;
        int textureY = 128;
        gunModel = new ModelRendererTurbo[1];
        ammoModel = new ModelRendererTurbo[1];
        defaultBarrelModel = new ModelRendererTurbo[1];

        gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        gunModel[0].addObj("/BFMCpack/UKM2013/UKM2013_Gun.obj");
        gunModel[0].setRotationPoint(0F, 0F, 0.0F);
        ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        ammoModel[0].addObj("/BFMCpack/UKM2013/UKM2013_Ammo.obj");
        ammoModel[0].setRotationPoint(0F, 0F, 0.0F);
        defaultBarrelModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        defaultBarrelModel[0].addObj("/BFMCpack/UKM2013/UKM2013_DefaultBarrel.obj");
        defaultBarrelModel[0].setRotationPoint(0F, 0F, 0.0F);

        scopeAttachPoint = new Vector3f(40.41F / 16F, 65.1F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(147F / 16F, 38.61F / 16F, -8.12F / 16F);
        barrelAttachPoint = new Vector3f(233.33F / 16F, 49.835F / 16F, 0F / 16F);
        gripAttachPoint = new Vector3f(150.82F / 16F, 30.97F / 16F, 0F / 16F);

        gunSlideDistance = 0.1F;
        animationType = EnumAnimationType.BOTTOM_CLIP;

        rightHandAmmo = false;
        leftHandAmmo = true;
        leftArmPos = new Vector3f(0.17F, -0.5F, 0.0F);
        leftArmRot = new Vector3f(80F, 55F, 10F);
        leftArmReloadPos = new Vector3f(-0.13F, -0.6F, 0.05F);
        leftArmReloadRot = new Vector3f(80F, 60F, 0.0F);
        rightArmPos = new Vector3f(0.255F, -0.56F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85F);
        rightArmReloadPos = new Vector3f(0.255F, -0.56F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.5D, 0.75D);
        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);
        hasArms = true;
        hasFlash = true;
        gunSlideDistance = 0.15F;
        animationType = EnumAnimationType.CUSTOM;
        rotateGunHorizontal = 15F;
        tiltGun = 30F;
        translateGun = new Vector3f(0.0F, -0.0625F, -0.1875F);
        translateClip = new Vector3f(0.0F, -0.625F, 0.0F);

        zoomOffsetY = -0.018F;
        zoomOffset = 0.12F;
        ShakeDistance = 0.6F;
        crouchZoom = -0.1F;
        gunOffset = -0.8F;
        gunOffsetX = -3.5F;

    }
}
