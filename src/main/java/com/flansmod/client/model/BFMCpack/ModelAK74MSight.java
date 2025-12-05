//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Coyote
// Model Creator: 
// Created on: 11.07.2022 - 11:27:42
// Last changed on: 11.07.2022 - 11:27:42

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelAK74MSight extends ModelAttachment //Same as Filename
{
    int textureX = 2048;
    int textureY = 2048;

    public ModelAK74MSight() //Same as Filename
    {
        attachmentModel = new ModelRendererTurbo[1];
        attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0

        attachmentModel[0].addShapeBox(0F, 0F, 0F, 1, 1024, 574, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -549.3359F, 0F, 0F, -549.3359F, 0F, -980F, 0F, 0F, -980F, 0F, 0F, -980F, -549.3359F, 0F, -980F, -549.33594F); // Box 0
        attachmentModel[0].setRotationPoint(-4F, -24.9F, -14.65F);
        flipAll();
    }
}