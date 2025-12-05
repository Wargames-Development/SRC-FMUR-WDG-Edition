package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelRFB extends ModelGun {
    int textureX = 128;

    int textureY = 128;

    public ModelRFB() {

        gunModel = new ModelRendererTurbo[1];
        gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        gunModel[0].addObj("/BFMCpack/RFB/RFB_gun.obj");
        gunModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        ammoModel = new ModelRendererTurbo[1];
        ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        ammoModel[0].addObj("/BFMCpack/RFB/RFB_ammo.obj");
        ammoModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        slideModel = new ModelRendererTurbo[1];
        slideModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        slideModel[0].addObj("/BFMCpack/RFB/RFB_slide.obj");
        slideModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        defaultBarrelModel = new ModelRendererTurbo[1];
        defaultBarrelModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        defaultBarrelModel[0].addObj("/BFMCpack/RFB/RFB_default_barrel.obj");
        defaultBarrelModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        defaultScopeModel = new ModelRendererTurbo[1];
        defaultScopeModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        defaultScopeModel[0].addObj("/BFMCpack/RFB/RFB_default_sight.obj");
        defaultScopeModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);

        barrelAttachPoint = new Vector3f(134.82F / 16F, 54.45F / 16F, 0F / 16F);
        scopeAttachPoint = new Vector3f(41.6F / 16F, 69.24F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(72F / 16F, 45F / 16F, -7.5F / 16F);
        gripAttachPoint = new Vector3f(71.89 / 16F, 35.21F / 16F, 0F / 16F);

        gunSlideDistance = 3F;
        hasFlash = true;
        hasArms = true;
        leftArmPos = new Vector3f(0.05F, -0.525F, 0.0F);
        leftArmRot = new Vector3f(80.0F, 50.0F, 20.0F);
        leftArmReloadPos = new Vector3f(-0.45F, -0.95F, 0.0F);
        leftArmReloadRot = new Vector3f(80.0F, 50.0F, 0.0F);
        rightArmPos = new Vector3f(0.21F, -0.53F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmReloadPos = new Vector3f(0.21F, -0.53F, 0.08F);
        rightArmReloadRot = new Vector3f(0.0F, 30.0F, -85.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
        rightHandAmmo = false;
        leftHandAmmo = true;
        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);
        casingAttachPoint = new Vector3f(-0.5F, 1.2F, 0.0F);
        casingAnimDistance = new Vector3f(0.0F, 3.0F, 7.75F);
        casingAnimSpread = new Vector3f(3.0F, 5.0F, 3.0F);
        casingAnimTime = 6;
        casingRotateVector = new Vector3f(0.1F, 0.0F, 0.1F);
        caseScale = 1.8F;
        casingDelay = 0;
        thirdPersonOffset = new Vector3f(-0.12F, -0.1F, 0.0F);
        animationType = EnumAnimationType.PISTOL_CLIP;
        rotateGunHorizontal = 15.0F;
        tiltGun = 30.0F;
        translateGun = new Vector3f(0.0F, -0.0625F, -0.1875F);
        translateClip = new Vector3f(0.0F, -0.625F, 0.0F);

        gunOffset = 0.3F;
        gunOffsetX = 0.7F;
        zoomOffset = 0.45F;
        zoomOffsetY = -0.1125F;

        hasFlash = true;
        flashScale = 5F;
        muzzleFlashPoint = new Vector3f(
                barrelAttachPoint.x / flashScale,
                barrelAttachPoint.y / flashScale,
                barrelAttachPoint.z / flashScale
        );
    }
}
