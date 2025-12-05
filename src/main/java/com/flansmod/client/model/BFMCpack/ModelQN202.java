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

public class ModelQN202 extends ModelGun {

    public ModelQN202() {

        int textureX = 512;
        int textureY = 512;

        gunModel = new ModelRendererTurbo[1];
        gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        gunModel[0].addObj("/BFMCpack/QN202/QN202_Gun.obj");
        gunModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        ammoModel = new ModelRendererTurbo[1];
        ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        ammoModel[0].addObj("/BFMCpack/QN202/QN202_Ammo.obj");
        ammoModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);

        animationType = EnumAnimationType.CUSTOMEND_LOADED;
        rotateGunVertical = 35.0F;
        rotateGunHorizontal = 1.0F;
        translateGun = new Vector3f(-0.625F, 0.125F, -0.0625F);

        rightHandAmmo = false;
        leftHandAmmo = true;

        hasFlash = true;
        hasArms = true;

        leftArmPos = new Vector3f(0F, -0.4F, -0.05F);
        leftArmRot = new Vector3f(80F, 50F, 0.0F);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
        rightArmPos = new Vector3f(0.25F, -0.52F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);

        leftArmReloadPos = new Vector3f(-0.1F, -0.55F, -0.05F);
        leftArmReloadRot = new Vector3f(80.0F, 50.0F, 0.0F);
        rightArmReloadPos = new Vector3f(0.24F, -0.6F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85F);

        fancyStance = true;
        stanceTranslate = new Vector3f(0.5D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(45.0F, 0.0F, 1.0F);
    }
}
