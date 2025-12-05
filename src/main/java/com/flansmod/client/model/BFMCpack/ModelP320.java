package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelP320 extends ModelGun {
    int textureX = 128;

    int textureY = 128;

    public ModelP320() {

        gunModel = new ModelRendererTurbo[1];
        gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        gunModel[0].addObj("/BFMCpack/P320/P320_gun.obj");
        gunModel[0].setRotationPoint(0F, 0F, 0F);

        slideModel = new ModelRendererTurbo[1];
        slideModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        slideModel[0].addObj("/BFMCpack/P320/P320_slide.obj");
        slideModel[0].setRotationPoint(0F, 0F, 0F);

        ammoModel = new ModelRendererTurbo[1];
        ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        ammoModel[0].addObj("/BFMCpack/P320/P320_ammo.obj");
        ammoModel[0].setRotationPoint(0F, 0F, 0F);

        gunSlideDistance = 1F;
        animationType = EnumAnimationType.PISTOL_CLIP;
        translateAll(0.0F, 0.0F, 0.0F);
        hasArms = true;
        leftArmPos = new Vector3f(-0.2F, -0.65F, -0.16F);
        leftArmRot = new Vector3f(80.0F, 35.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.27F, -0.57F, -0.15F);
        leftArmReloadRot = new Vector3f(70.0F, 40.0F, 0.0F);
        leftArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        rightArmPos = new Vector3f(0.13F, -0.56F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(0.13F, -0.56F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        rightHandAmmo = false;
        leftHandAmmo = true;
        slideLockOnEmpty = true;
        flashScale = 0.3F;
        muzzleFlashPoint = new Vector3f(1.6F, 1.2F, 0.0F);
        casingAttachPoint = new Vector3f(0.4F, 1.2F, 0.0F);
        casingAnimDistance = new Vector3f(0.0F, 4.0F, 4.75F);
        casingAnimSpread = new Vector3f(3.0F, 2.0F, 3.0F);
        casingAnimTime = 4;
        casingRotateVector = new Vector3f(0.1F, 0.0F, 0.1F);
        caseScale = 0.3F;
        casingDelay = 2;
        fancyStance = true;
        stanceTranslate = new Vector3f(0.4D, -0.1D, 0.2D);
        stanceRotate = new Vector3f(0.0F, 0.0F, 45.0F);
        crouchZoom = -0.1F;
        thirdPersonOffset = new Vector3f(-0.1F, -0.16F, 0.0F);

        zoomOffsetY = -0.01F;
        zoomOffset = 0.1F;
        gunOffset = -1F;
        gunOffsetX = -1F;
    }
}
