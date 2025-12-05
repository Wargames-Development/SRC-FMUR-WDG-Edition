package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelUSAS12 extends ModelGun {
    int textureX = 128;

    int textureY = 128;

    public ModelUSAS12() {

        gunModel = new ModelRendererTurbo[1];
        gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        gunModel[0].addObj("/BFMCpack/USAS12/USAS12_gun.obj");
        gunModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        ammoModel = new ModelRendererTurbo[1];
        ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        ammoModel[0].addObj("/BFMCpack/USAS12/USAS12_ammo.obj");
        ammoModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        slideModel = new ModelRendererTurbo[1];
        slideModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        slideModel[0].addObj("/BFMCpack/USAS12/USAS12_slide.obj");
        slideModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);

        barrelAttachPoint = new Vector3f(273.74F / 16F, 51.62F / 16F, 0F / 16F);
        scopeAttachPoint = new Vector3f(45F / 16F, 63.57F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(171.76F / 16F, 51.13F / 16F, -10.01F / 16F);
        gripAttachPoint = new Vector3f(160 / 16F, 38.18F / 16F, 0F / 16F);

        gunSlideDistance = 3F;
        animationType = EnumAnimationType.CUSTOM;
        rotateGunHorizontal = 15.0F;
        tiltGun = 30.0F;
        translateGun = new Vector3f(0.0F, -0.0625F, -0.1875F);
        translateClip = new Vector3f(0.0F, -0.625F, 0.0F);
        translateAll(0.0F, 0.0F, 0.0F);

        hasFlash = true;
        hasArms = true;
        rightHandAmmo = false;
        leftHandAmmo = false;

        leftArmPos = new Vector3f(2F, 0.1F, -8.5F);
        leftArmRot = new Vector3f(-80F, -55F, 0.0F);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
        rightArmPos = new Vector3f(0.24F, -0.6F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        enableNewArm = true;

        leftArmReloadPos = new Vector3f(-0.15F, -0.55F, 0.05F);
        leftArmReloadRot = new Vector3f(80F, 50F, 0.0F);
        rightArmReloadPos = new Vector3f(0.24F, -0.6F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85F);

        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);

        thirdPersonOffset = new Vector3f(-0.1F, -0.05F, 0.0F);

        gunOffset = 0.6F;
        gunOffsetX = -2F;
        zoomOffset = 0.4F;
        zoomOffsetY = -0.096F;

        translateAll(0, 0, 0);

        hasFlash = true;
        flashScale = 8F;
        muzzleFlashPoint = new Vector3f(
                barrelAttachPoint.x / flashScale,
                barrelAttachPoint.y / flashScale,
                barrelAttachPoint.z / flashScale
        );
    }
}
