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

public class ModelMG101Mag extends ModelGun {

    public ModelMG101Mag() {

        int textureX = 512;
        int textureY = 512;

        gunModel = new ModelRendererTurbo[1];
        gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        gunModel[0].addObj("/BFMCpack/MG101/MG101_Gun.obj");
        gunModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        ammoModel = new ModelRendererTurbo[1];
        ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        ammoModel[0].addObj("/BFMCpack/MG101/MG101_Ammo_32rd.obj");
        ammoModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        defaultBarrelModel = new ModelRendererTurbo[1];
        defaultBarrelModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        defaultBarrelModel[0].addObj("/BFMCpack/MG101/MG101_DefaultBarrel.obj");
        defaultBarrelModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);

        barrelAttachPoint = new Vector3f(232.83F / 16F, 39.07F / 16F, 0F / 16F);
        scopeAttachPoint = new Vector3f(34F / 16F, 56.83F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(85F / 16F, 39.14F / 16F, -10.25F / 16F);
        gripAttachPoint = new Vector3f(91.27F / 16F, 27.81F / 16F, 0F / 16F);

        rightHandAmmo = false;
        leftHandAmmo = true;
        leftArmPos = new Vector3f(0.05F, -0.5F, -0.05F);
        leftArmRot = new Vector3f(80.0F, 50.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.15F, -0.8F, 0.05F);
        leftArmReloadRot = new Vector3f(80.0F, 50.0F, 0.0F);
        rightArmPos = new Vector3f(0.2F, -0.65F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmReloadPos = new Vector3f(0.2F, -0.65F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);
        hasArms = true;
        hasFlash = true;

        animationType = EnumAnimationType.CUSTOM;
        rotateGunHorizontal = 15.0F;
        tiltGun = 30.0F;
        translateGun = new Vector3f(0.0F, -0.0625F, -0.1875F);
        translateClip = new Vector3f(0.0625F, -0.625F, 0.0F);

        zoomOffsetY = -0.055F;
        zoomOffset = 0.25F;
        crouchZoom = -0.05F;
        gunOffset = -0.475F;
        gunOffsetX = -3.2F;
    }
}
