//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Kobra_Red_Dot_Sight
// Model Creator: 
// Created on: 23.02.2022 - 18:03:07
// Last changed on: 23.02.2022 - 18:03:07

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelP320_Sight extends ModelAttachment //Same as Filename
{
    int textureX = 128;
    int textureY = 128;

    public ModelP320_Sight() //Same as Filename
    {
        attachmentModel = new ModelRendererTurbo[1];
        attachmentModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        attachmentModel[0].addObj("/BFMCpack/P320/P320_scope.obj");
        attachmentModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);

        renderOffset = 0F;
    }
}