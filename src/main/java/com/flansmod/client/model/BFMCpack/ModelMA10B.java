package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelMA10B extends ModelGun {
    public ModelMA10B() {

        int textureX = 512;
        int textureY = 512;

        gunModel = new ModelRendererTurbo[1];
        gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        gunModel[0].addObj("/BFMCpack/MA10B/MA10B_Gun.obj");
        gunModel[0].setRotationPoint(0F, 0F, 0F);


        ammoModel = new ModelRendererTurbo[1];
        ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        ammoModel[0].addObj("/BFMCpack/MA10B/MA10B_Ammo.obj");
        ammoModel[0].setRotationPoint(0F, 0F, 0F);

        pumpModel = new ModelRendererTurbo[1];
        pumpModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        pumpModel[0].addObj("/BFMCpack/MA10B/MA10B_Pump.obj");
        pumpModel[0].setRotationPoint(0F, 0F, 0F);

        slideModel = new ModelRendererTurbo[1];
        slideModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        slideModel[0].addObj("/BFMCpack/MA10B/MA10B_Slide.obj");
        slideModel[0].setRotationPoint(0F, 0F, 0F);

        scopeAttachPoint = new Vector3f(38F / 16F, 66.1F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(181F / 16F, 50.8F / 16F, -8.22F / 16F);
        barrelAttachPoint = new Vector3f(194.51F / 16F, 54.52F / 16F, 0F / 16F);

        rightHandAmmo = true;
        leftHandAmmo = false;
        leftArmPos = new Vector3f(0.5F, -0.03F, -0.45F);
        leftArmRot = new Vector3f(80.0F, 50.0F, 10.0F);
        leftArmReloadPos = new Vector3f(-0.15F, -0.6F, -0.04F);
        leftArmReloadRot = new Vector3f(80.0F, 50.0F, 0.0F);
        rightArmPos = new Vector3f(0.2F, -0.35F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -87.0F);
        rightArmReloadPos = new Vector3f(0.21F, -0.37F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -87.0F);
        rightArmScale = new Vector3f(0.75D, 0.6D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.5D, 0.75D);
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
        pumpDelayAfterReload = 80;
        pumpDelay = 5;
        pumpTime = 5;
        pumpHandleDistance = 1.5F;
        lefthandPump = true;
        rotateGunVertical = 45.0F;
        tiltGun = 20.0F;
        translateGun = new Vector3f(-0.125F, -0.125F, -0.125F);
        tiltClip = -5.0F;
        translateClip = new Vector3f(0.0F, 0.625F, 0.0F);

        zoomOffsetY = -0.02F;
        zoomOffset = 0.3F;
        gunOffset = -0.85F;
        gunOffsetX = -2.5F;
        translateAll(0F, -5F, 0F);

    }
}
