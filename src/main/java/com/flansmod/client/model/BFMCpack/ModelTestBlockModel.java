//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: tt33
// Model Creator: 
// Created on: 31.05.2017 - 17:57:56
// Last changed on: 31.05.2017 - 17:57:56

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelTestBlockModel extends ModelGun {

    public ModelTestBlockModel() {

        int textureX = 128;
        int textureY = 128;

        gunModel = new ModelRendererTurbo[1];
        gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        gunModel[0].addObj("/BFMCpack/TestBlockModel.obj");
        gunModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);

        translateAll(0.0F, 0.0F, 0.0F);
    }
}
