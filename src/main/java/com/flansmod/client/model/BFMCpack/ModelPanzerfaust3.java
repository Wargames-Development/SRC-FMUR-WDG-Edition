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

//Panzerfaust3
public class ModelPanzerfaust3 extends ModelGun {

    public ModelPanzerfaust3() {

        int textureX = 512;
        int textureY = 512;

        gunModel = new ModelRendererTurbo[1];
        gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        gunModel[0].addObj("/BFMCpack/Panzerfaust3/Panzerfaust3_gun.obj");
        gunModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        ammoModel = new ModelRendererTurbo[1];
        ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        ammoModel[0].addObj("/BFMCpack/Panzerfaust3/Panzerfaust3_Ammo.obj");
        ammoModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);

        thirdPersonOffset = new Vector3f(0 / 16F, 1.5F / 16F, 0F / 16F);
        hasFlash = false;
        hasArms = true;

        enableNewArm = true;
        leftArmPos = new Vector3f(6F, 0.1F, -9.5F);
        leftArmRot = new Vector3f(-80F, -45F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.4F, -0.45F, -0.1F);
        leftArmReloadRot = new Vector3f(60.0F, 20.0F, 0.0F);
        rightArmPos = new Vector3f(0.2F, -0.78F, 0.05F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(0.2F, -0.78F, 0.05F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmScale = new Vector3f(0.8F, 1.0F, 0.8F);
        leftArmScale = new Vector3f(0.75F, 1.25F, 0.75F);
        rightHandAmmo = false;
        leftHandAmmo = false;
        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);
        animationType = EnumAnimationType.BACK_LOADED;
        translateAll(-30F, 25F, 0F);

        zoomOffsetY = -0.143F;
        zoomOffsetZ = 0.162F;
        zoomOffset = 0.5F;
    }
}
