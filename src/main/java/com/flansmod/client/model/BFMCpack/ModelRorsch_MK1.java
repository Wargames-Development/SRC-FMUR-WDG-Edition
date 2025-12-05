//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: tt33
// Model Creator: 
// Created on: 31.05.2017 - 17:57:56
// Last changed on: 31.05.2017 - 17:57:56

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelRorsch_MK1 extends ModelGun {

    public ModelRorsch_MK1() {

        int textureX = 512;
        int textureY = 512;

        gunModel = new ModelRendererTurbo[1];
        gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        gunModel[0].addObj("/BFMCpack/Rorsch-MK1.obj");
        gunModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);

        breakActionModel = new ModelRendererTurbo[1];
        breakActionModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        breakActionModel[0].addObj("/BFMCpack/Rorsch-MK1-Break-Action.obj");
        breakActionModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);

        rightHandAmmo = true;
        leftHandAmmo = false;
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
        stanceTranslate = new Vector3f(0.5D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(55F, 0.0F, 1.0F);
        hasArms = true;
        hasFlash = true;
        animationType = EnumAnimationType.BREAK_ACTION;
        rotateGunHorizontal = 15F;
        tiltGun = 30F;
        translateGun = new Vector3f(0.0F, -0.0625F, -0.1875F);
        translateClip = new Vector3f(0.0F, -0.625F, 0.0F);

        barrelBreakPoint = new Vector3f(77.41 / 16F, 56.77 / 16F, 0F);
        breakActionAmmoDistance = 5F;
        breakAngle = 45F;

        hasFlash = true;
        flashScale = 20F;
        muzzleFlashPoint = new Vector3f(
                327F / 16F / flashScale,
                46.78F / 16F / flashScale,
                0F / flashScale
        );

        translateAll(0.0F, 5.0F, 0.0F);
    }
}
