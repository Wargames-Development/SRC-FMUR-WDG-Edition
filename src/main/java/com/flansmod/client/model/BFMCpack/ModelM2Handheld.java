package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelM2Handheld extends ModelGun {
    public ModelM2Handheld() {

        int textureX = 512;
        int textureY = 512;

        gunModel = new ModelRendererTurbo[1];
        gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        gunModel[0].addObj("/BFMCpack/M2_HandHeld.obj");
        gunModel[0].setRotationPoint(0F, 0F, 0F);
        ammoModel = new ModelRendererTurbo[1];
        ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        ammoModel[0].addObj("/BFMCpack/M2_HandHeld_Ammo.obj");
        ammoModel[0].setRotationPoint(0F, 0F, 0F);


        hasFlash = true;
        hasArms = true;

        leftArmPos = new Vector3f(0.25F, -0.4F, -0.1F);
        leftArmRot = new Vector3f(60.0F, 55.0F, 0.0F);
        leftArmReloadPos = new Vector3f(0.05F, -0.4F, -0.05F);
        leftArmReloadRot = new Vector3f(80.0F, 50.0F, 0.0F);
        rightArmPos = new Vector3f(0.22F, -0.55F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmReloadPos = new Vector3f(0.22F, -0.55F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.7D, 1.4D, 0.7D);

        rightHandAmmo = false;
        leftHandAmmo = true;


        fancyStance = true;
        stanceTranslate = new Vector3f(0.5D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(55F, 0.0F, 1.0F);

        hasArms = true;
        hasFlash = true;
        animationType = EnumAnimationType.CUSTOM;
        rotateGunHorizontal = 15F;
        tiltGun = 30F;
        translateGun = new Vector3f(0.0F, -0.0625F, -0.1875F);
        translateClip = new Vector3f(0.0F, -0.625F, 0.0F);

        zoomOffsetY = -0.12F;
        zoomOffset = 0.1F;
        crouchZoom = -0.05F;

        hasFlash = true;
        flashScale = 20F;
        muzzleFlashPoint = new Vector3f(
                358.03F / 16F / flashScale,
                44.89F / 16F / flashScale,
                0F / flashScale
        );

        translateAll(5F, 20F, 0F);

    }
}
