package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelSTRSG extends ModelGun {
    public ModelSTRSG() {

        int textureX = 512;
        int textureY = 512;

        gunModel = new ModelRendererTurbo[1];
        gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        gunModel[0].addObj("/BFMCpack/STR-SG/STR-SG.obj");
        gunModel[0].setRotationPoint(0F, 0F, 0F);


        ammoModel = new ModelRendererTurbo[1];
        ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        ammoModel[0].addObj("/BFMCpack/STR-SG/STR-SG_Ammo.obj");
        ammoModel[0].setRotationPoint(0F, 0F, 0F);


        scopeAttachPoint = new Vector3f(41F / 16F, 72.72F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(125F / 16F, 50.25F / 16F, -8.04F / 16F);
        gripAttachPoint = new Vector3f(125F / 16F, 44.25F / 16F, 0F / 16F);
        barrelAttachPoint = new Vector3f(185F / 16F, 58.75F / 16F, 0F / 16F);

        rightHandAmmo = true;
        leftHandAmmo = false;
        leftArmPos = new Vector3f(0.05F, -0.4F, -0.1F);
        leftArmRot = new Vector3f(75.0F, 50.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.1F, -0.55F, 0.05F);
        leftArmReloadRot = new Vector3f(80.0F, 54.0F, 0.0F);
        rightArmPos = new Vector3f(0.15F, -0.4F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -87.0F);
        rightArmReloadPos = new Vector3f(0.21F, -0.37F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -87.0F);
        rightArmScale = new Vector3f(0.75D, 0.6D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);
        hasArms = true;
        hasFlash = true;

        animationType = EnumAnimationType.RIFLE;
        tiltGunTime = 0.15F;
        unloadClipTime = 0.0F;
        loadClipTime = 0.7F;
        untiltGunTime = 0.15F;
        numBulletsInReloadAnimation = 5.0F;
        pumpDelayAfterReload = 90;
        pumpDelay = 2;
        pumpTime = 14;
        pumpHandleDistance = 1.4F;
        rotateGunVertical = 45.0F;
        tiltGun = 20.0F;
        translateGun = new Vector3f(-0.125F, -0.125F, -0.125F);
        tiltClip = -5.0F;
        translateClip = new Vector3f(0.0F, 0.625F, 0.0F);

        zoomOffsetY = -0.075F;
        zoomOffset = 0.25F;
        gunOffset = -0.6F;
        gunOffsetX = -3F;

        translateAll(0F, 0F, 0F);

    }
}
