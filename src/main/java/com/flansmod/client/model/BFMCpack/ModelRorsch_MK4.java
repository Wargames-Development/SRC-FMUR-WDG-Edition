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

public class ModelRorsch_MK4 extends ModelGun {

    public ModelRorsch_MK4() {

        int textureX = 512;
        int textureY = 512;

        gunModel = new ModelRendererTurbo[1];
        gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        gunModel[0].addObj("/BFMCpack/RorschMK4/RorschMK4_Gun.obj");
        gunModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);

        ammoModel = new ModelRendererTurbo[1];
        ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        ammoModel[0].addObj("/BFMCpack/RorschMK4/RorschMK4_Ammo.obj");
        ammoModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);

        scopeAttachPoint = new Vector3f(90F / 16F, 85.28F / 16F, 0F / 16F);

        rightHandAmmo = true;
        leftHandAmmo = false;
        leftArmPos = new Vector3f(0.05F, -0.4F, -0.1F);
        leftArmRot = new Vector3f(83F, 56F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.12F, -0.55F, -0.05F);
        leftArmReloadRot = new Vector3f(80F, 48F, 0.0F);
        rightArmPos = new Vector3f(0.2F, -0.52F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmReloadPos = new Vector3f(0.2F, -0.52F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);
        hasArms = true;
        hasFlash = true;

        animationType = EnumAnimationType.CUSTOM;
        tiltGun = 5.0F;
        rotateGunVertical = 40.0F;
        rotateGunHorizontal = 0.0F;
        translateGun = new Vector3f(0.5F, 0.0F, 0.0F);
        rotateClipVertical = 5.0F;
        translateClip = new Vector3f(-5.0F, -22.0F, 0.0F);

        //开镜y轴位移
        zoomOffsetY = -0.09F;

        //开镜X轴位移
        zoomOffset = 0.4F;

        //下蹲X轴位移
        crouchZoom = -0.05F;

        //装倍镜配件之后y轴额外位移
        gunOffset = -0.35F;
        gunOffsetX = -4.5F;

        translateAll(0.0F, 0.0F, 0.0F);
    }
}
