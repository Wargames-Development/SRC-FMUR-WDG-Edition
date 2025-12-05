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

public class ModelSCAR11 extends ModelGun {

    public ModelSCAR11() {

        int textureX = 512;
        int textureY = 512;

        gunModel = new ModelRendererTurbo[1];
        gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        gunModel[0].addObj("/BFMCpack/SCAR11/SCAR11_GUN.obj");
        gunModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        ammoModel = new ModelRendererTurbo[1];
        ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        ammoModel[0].addObj("/BFMCpack/SCAR11/SCAR11_Ammo.obj");
        ammoModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        slideModel = new ModelRendererTurbo[1];
        slideModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        slideModel[0].addObj("/BFMCpack/SCAR11/SCAR11_Slide.obj");
        slideModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);



        barrelAttachPoint = new Vector3f(250.59F / 16F, 54.45F / 16F, 0F / 16F);
        scopeAttachPoint = new Vector3f(47F / 16F, 70.13F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(149F / 16F, 52.11F / 16F, -5.64F / 16F);
        gripAttachPoint = new Vector3f(147 / 16F, 42.34F / 16F, 0F / 16F);

        rightHandAmmo = false;
        leftHandAmmo = true;
        leftArmPos = new Vector3f(0.17F, -0.5F, 0.0F);
        leftArmRot = new Vector3f(80F, 55F, 10F);
        leftArmReloadPos = new Vector3f(-0.2F, -0.9F, 0.05F);
        leftArmReloadRot = new Vector3f(80F, 60F, 0.0F);
        rightArmPos = new Vector3f(0.18F, -0.8F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmReloadPos = new Vector3f(0.18F, -0.8F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.5D, 0.75D);
        fancyStance = true;
//        stanceTranslate = new Vector3f(0.5D, 0.0D, 0.2D);
//        stanceRotate = new Vector3f(45F, 0.0F, 1.0F);
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);
        hasArms = true;
        hasFlash = true;

        animationType = EnumAnimationType.CUSTOM;
        rotateGunHorizontal = 15F;
        tiltGun = 30F;
        translateGun = new Vector3f(0.0F, 0.0F, -0.1875F);
        translateClip = new Vector3f(0.0F, -0.63F, 0.0F);

        //开镜y轴位移
        zoomOffsetY = 0.0F;

        //开镜X轴位移
        zoomOffset = 0.0F;

        //下蹲X轴位移
        crouchZoom = -0.05F;

        //装倍镜配件之后y轴额外位移
        gunOffset = -0.6F;

        //修正模型位移
        Vector3f vec3 = new Vector3f(-20F, 2F, 0F);
        translateAll(vec3.x, vec3.y, vec3.z);
        Vector3f attVec = new Vector3f(vec3.x / 16F, vec3.y / 16F, vec3.z / 16F);
        barrelAttachPoint = Vector3f.add(barrelAttachPoint, attVec, null);
        gadgetAttachPoint = Vector3f.add(gadgetAttachPoint, attVec, null);
        scopeAttachPoint = Vector3f.add(scopeAttachPoint, attVec, null);
        gripAttachPoint = Vector3f.add(gripAttachPoint, attVec, null);
        stockAttachPoint = Vector3f.add(stockAttachPoint, attVec, null);

        hasFlash = true;
        flashScale = 4F;
        muzzleFlashPoint = new Vector3f(
                260F / 16F / flashScale,
                46.78F / 16F / flashScale,
                0F / flashScale
        );
        translateAll(-30.0F, -5.0F, 0.0F);
    }
}
