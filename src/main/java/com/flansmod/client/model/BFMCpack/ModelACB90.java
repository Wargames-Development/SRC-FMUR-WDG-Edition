//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 06.01.2022 - 21:23:10
// Last changed on: 06.01.2022 - 21:23:10

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelACB90 extends ModelGun //Same as Filename
{
    int textureX = 64;
    int textureY = 128;

    public ModelACB90() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[14];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 0
        gunModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 0
        gunModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 0
        gunModel[4] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 0
        gunModel[5] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 0
        gunModel[6] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 0
        gunModel[7] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 0
        gunModel[8] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 9
        gunModel[9] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 9
        gunModel[10] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 9
        gunModel[11] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 9
        gunModel[12] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 9
        gunModel[13] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 9

        gunModel[0].addShapeBox(0F, 0F, 0F, 4, 18, 4, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[0].setRotationPoint(0F, -13F, 0F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 1, 24, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 0
        gunModel[1].setRotationPoint(-1F, -17F, 0F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 2, 18, 4, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 0
        gunModel[2].setRotationPoint(4F, -13F, 0F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[3].setRotationPoint(0F, 5F, 0F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 0
        gunModel[4].setRotationPoint(0F, 7F, 0F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[5].setRotationPoint(0F, -17F, 0F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F); // Box 0
        gunModel[6].setRotationPoint(4F, -14F, 0F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 3F, 0F, 2F, 2F, -1F, 2F, 2F, -1F, 0F, 3F, 0F); // Box 0
        gunModel[7].setRotationPoint(4F, -17F, 0F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
        gunModel[8].setRotationPoint(0F, -19F, 1F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 2, 35, 1, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 9
        gunModel[9].setRotationPoint(5F, -54F, 1.5F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F, 0F, -8F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -8F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 9
        gunModel[10].setRotationPoint(0F, -54F, 1.5F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 4, 23, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
        gunModel[11].setRotationPoint(1F, -42F, 1.5F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
        gunModel[12].setRotationPoint(0F, -42F, 1.5F);

        gunModel[13].addBox(0F, 0F, 0F, 1, 20, 1, 0F); // Box 9
        gunModel[13].setRotationPoint(0F, -39F, 1.5F);


        translateAll(0F, 0F, 0F);


        flipAll();
    }
}