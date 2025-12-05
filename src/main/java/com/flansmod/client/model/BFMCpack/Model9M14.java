//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: QJZ89
// Model Creator: 
// Created on: 20.06.2022 - 18:53:56
// Last changed on: 20.06.2022 - 18:53:56

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class Model9M14 extends ModelVehicle //Same as Filename
{
    int textureX = 256;
    int textureY = 256;

    public Model9M14() //Same as Filename
    {
        turretModel = new ModelRendererTurbo[1];
        turretModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        turretModel[0].addObj("/BFMCpack/9M14.obj");
        turretModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);

        translateAll(0F, 0F, 0F);
    }
}