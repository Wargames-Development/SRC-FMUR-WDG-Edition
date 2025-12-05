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

public class ModelM72A7 extends ModelGun {

    public ModelM72A7() {

        int textureX = 512;
        int textureY = 512;

        gunModel = new ModelRendererTurbo[1];
        gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        gunModel[0].addObj("/BFMCpack/M72A7/m72_gun.obj");
        gunModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);

        ammoModel = new ModelRendererTurbo[1];
        ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        ammoModel[0].addObj("/BFMCpack/M72A7/m72_ammo.obj");
        ammoModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);

        thirdPersonOffset = new Vector3f(0 / 16F, 1.5F / 16F, 0F / 16F);
        hasFlash = true;
        hasArms = true;

        enableNewArm = true;
        leftArmPos = new Vector3f(6.5F, -2.6F, -10.5F);
        leftArmRot = new Vector3f(-62.5F, -45F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.15F, -0.55F, 0.05F);
        leftArmReloadRot = new Vector3f(80.0F, 50.0F, 0.0F);
        rightArmPos = new Vector3f(10F, -2.8F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -60.0F);
        rightArmReloadPos = new Vector3f(0.17F, -0.52F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);

        rightHandAmmo = false;
        leftHandAmmo = false;
        fancyStance = true;
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);
        stanceTranslate = new Vector3f(0.0F, 0.0F, 0.0F);
        animationType = EnumAnimationType.CUSTOM;

        translateAll(0F, 0F, 0F);
        zoomOffsetY = -0.1F;
        zoomOffset = 0.2F;
    }
}
