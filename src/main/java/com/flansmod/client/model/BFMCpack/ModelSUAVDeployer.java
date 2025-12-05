//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 26.06.2023 - 10:30:11
// Last changed on: 26.06.2023 - 10:30:11

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelSUAVDeployer extends ModelGun //Same as Filename
{
    int textureX = 64;
    int textureY = 64;

    public ModelSUAVDeployer() //Same as Filename
    {
        ammoModel = new ModelRendererTurbo[18];
        ammoModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        ammoModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 9
        ammoModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 10
        ammoModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 11
        ammoModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 4
        ammoModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 5
        ammoModel[6] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 6
        ammoModel[7] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 7
        ammoModel[8] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 8
        ammoModel[9] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 9
        ammoModel[10] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 11
        ammoModel[11] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 11
        ammoModel[12] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 13
        ammoModel[13] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 13
        ammoModel[14] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 13
        ammoModel[15] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 6
        ammoModel[16] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 6
        ammoModel[17] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 6

        ammoModel[0].addShapeBox(-3F, -10F, 0F, 14, 1, 1, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F); // Box 0
        ammoModel[0].setRotationPoint(0F, 8F, 1F);
        ammoModel[0].rotateAngleX = -0.2443461F;
        ammoModel[0].rotateAngleY = -3.14159265F;
        ammoModel[0].rotateAngleZ = -0.2268928F;

        ammoModel[1].addShapeBox(9F, -11F, 0F, 1, 1, 1, 0F, -0.2F, 2.8F, -0.4F, 1.4F, 2.8F, -0.4F, 1.4F, 2.8F, -0.4F, -0.2F, 2.8F, -0.4F, 1.5F, 0F, -0.25F, 1.4F, 0F, -0.25F, 1.4F, 0F, -0.25F, 1.5F, 0F, -0.25F); // Box 9
        ammoModel[1].setRotationPoint(0F, 8F, 1F);
        ammoModel[1].rotateAngleX = -0.2443461F;
        ammoModel[1].rotateAngleY = -3.14159265F;
        ammoModel[1].rotateAngleZ = -0.2268928F;

        ammoModel[2].addShapeBox(11F, -10F, 0F, 1, 1, 1, 0F, 0F, -0.3F, 7F, 1F, -0.3F, 7F, 1F, -0.3F, 7F, 0F, -0.3F, 7F, 0F, -0.3F, 7F, 1F, -0.3F, 7F, 1F, -0.3F, 7F, 0F, -0.3F, 7F); // Box 10
        ammoModel[2].setRotationPoint(0F, 8F, 1F);
        ammoModel[2].rotateAngleX = -0.2443461F;
        ammoModel[2].rotateAngleY = -3.14159265F;
        ammoModel[2].rotateAngleZ = -0.2268928F;

        ammoModel[3].addShapeBox(13F, -10F, 0F, 1, 1, 1, 0F, 0F, -0.3F, 7F, 0.3F, -0.3F, -0.5F, 0.3F, -0.3F, -0.5F, 0F, -0.3F, 7F, 0F, -0.3F, 7F, 0.3F, -0.3F, -0.5F, 0.3F, -0.3F, -0.5F, 0F, -0.3F, 7F); // Box 11
        ammoModel[3].setRotationPoint(0F, 8F, 1F);
        ammoModel[3].rotateAngleX = -0.2443461F;
        ammoModel[3].rotateAngleY = -3.14159265F;
        ammoModel[3].rotateAngleZ = -0.2268928F;

        ammoModel[4].addShapeBox(-6.8F, -13F, 0F, 4, 4, 1, 0F, 0F, 0F, 0.7F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.7F); // Box 4
        ammoModel[4].setRotationPoint(0F, 8F, 1F);
        ammoModel[4].rotateAngleX = -0.2443461F;
        ammoModel[4].rotateAngleY = -3.14159265F;
        ammoModel[4].rotateAngleZ = -0.2268928F;

        ammoModel[5].addShapeBox(-7.8F, -12F, 0F, 1, 3, 1, 0F, 0F, 0.1F, 0.85F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0.1F, 0.85F, 0F, 0F, 0.85F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.85F); // Box 5
        ammoModel[5].setRotationPoint(0F, 8F, 1F);
        ammoModel[5].rotateAngleX = -0.2443461F;
        ammoModel[5].rotateAngleY = -3.14159265F;
        ammoModel[5].rotateAngleZ = -0.2268928F;

        ammoModel[6].addShapeBox(-10.8F, -12F, 0F, 3, 3, 1, 0F, 0F, 0.1F, 0.85F, 0F, 0.1F, 0.85F, 0F, 0.1F, 0.85F, 0F, 0.1F, 0.85F, 0F, 0F, 0.85F, 0F, 0F, 0.85F, 0F, 0F, 0.85F, 0F, 0F, 0.85F); // Box 6
        ammoModel[6].setRotationPoint(0F, 8F, 1F);
        ammoModel[6].rotateAngleX = -0.2443461F;
        ammoModel[6].rotateAngleY = -3.14159265F;
        ammoModel[6].rotateAngleZ = -0.2268928F;

        ammoModel[7].addShapeBox(-4F, -13F, 0F, 1, 2, 1, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.7F, 0F, 0F, -0.7F, 0.5F, 0F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, -0.7F, 0.5F, 0F); // Box 7
        ammoModel[7].setRotationPoint(0F, 8F, 1F);
        ammoModel[7].rotateAngleX = -0.2443461F;
        ammoModel[7].rotateAngleY = -3.14159265F;
        ammoModel[7].rotateAngleZ = -0.2268928F;

        ammoModel[8].addShapeBox(-4F, -10.5F, 0F, 1, 1, 1, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.7F, 0F, 0F, -0.7F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, -0.7F, -0.5F, 0F); // Box 8
        ammoModel[8].setRotationPoint(0F, 8F, 1F);
        ammoModel[8].rotateAngleX = -0.2443461F;
        ammoModel[8].rotateAngleY = -3.14159265F;
        ammoModel[8].rotateAngleZ = -0.2268928F;

        ammoModel[9].addShapeBox(-7F, -13F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 8F, 0F, -0.5F, 8F, 0F, -0.5F, 8F, 0F, -0.5F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F); // Box 9
        ammoModel[9].setRotationPoint(0F, 7F, 1F);
        ammoModel[9].rotateAngleX = -0.2443461F;
        ammoModel[9].rotateAngleY = -3.14159265F;
        ammoModel[9].rotateAngleZ = -0.2268928F;

        ammoModel[10].addShapeBox(-7F, -14F, 9F, 4, 1, 13, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2.7F, 0F, 0F, -2.7F, 0F); // Box 11
        ammoModel[10].setRotationPoint(0F, 8F, 1F);
        ammoModel[10].rotateAngleX = -0.2443461F;
        ammoModel[10].rotateAngleY = -3.14159265F;
        ammoModel[10].rotateAngleZ = -0.2268928F;

        ammoModel[11].addShapeBox(-7F, -14F, -21F, 4, 1, 13, 0F, 0F, 2F, 0F, -1.5F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.7F, 0F, -1.5F, -2.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
        ammoModel[11].setRotationPoint(0F, 8F, 1F);
        ammoModel[11].rotateAngleX = -0.2443461F;
        ammoModel[11].rotateAngleY = -3.14159265F;
        ammoModel[11].rotateAngleZ = -0.2268928F;

        ammoModel[12].addShapeBox(-10F, -9F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 13
        ammoModel[12].setRotationPoint(0F, 8F, 1F);
        ammoModel[12].rotateAngleX = -0.2443461F;
        ammoModel[12].rotateAngleY = -3.14159265F;
        ammoModel[12].rotateAngleZ = -0.2268928F;

        ammoModel[13].addShapeBox(-8F, -9F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 1.7F, 0F, -0.3F, 1.7F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.2F, 1.7F, -1F, -0.2F, 1.7F, -1F, -0.2F, 0F, 0F, -0.2F); // Box 13
        ammoModel[13].setRotationPoint(0F, 8F, 1F);
        ammoModel[13].rotateAngleX = -0.2443461F;
        ammoModel[13].rotateAngleY = -3.14159265F;
        ammoModel[13].rotateAngleZ = -0.2268928F;

        ammoModel[14].addShapeBox(-11F, -9F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F); // Box 13
        ammoModel[14].setRotationPoint(0F, 8F, 1F);
        ammoModel[14].rotateAngleX = -0.2443461F;
        ammoModel[14].rotateAngleY = -3.14159265F;
        ammoModel[14].rotateAngleZ = -0.2268928F;

        ammoModel[15].addShapeBox(-11.8F, -12F, 0F, 1, 3, 1, 0F, 0F, -0.1F, 0.75F, 0F, 0.1F, 0.85F, 0F, 0.1F, 0.85F, 0F, -0.1F, 0.75F, 0F, -0.1F, 0.75F, 0F, 0F, 0.85F, 0F, 0F, 0.85F, 0F, -0.1F, 0.75F); // Box 6
        ammoModel[15].setRotationPoint(0F, 8F, 1F);
        ammoModel[15].rotateAngleX = -0.2443461F;
        ammoModel[15].rotateAngleY = -3.14159265F;
        ammoModel[15].rotateAngleZ = -0.2268928F;

        ammoModel[16].addShapeBox(-12.8F, -12F, 0F, 1, 3, 1, 0F, 0F, -0.6F, 0.5F, 0F, -0.1F, 0.75F, 0F, -0.1F, 0.75F, 0F, -0.6F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.1F, 0.75F, 0F, -0.1F, 0.75F, 0F, -0.3F, 0.5F); // Box 6
        ammoModel[16].setRotationPoint(0F, 8F, 1F);
        ammoModel[16].rotateAngleX = -0.2443461F;
        ammoModel[16].rotateAngleY = -3.14159265F;
        ammoModel[16].rotateAngleZ = -0.2268928F;

        ammoModel[17].addShapeBox(-13.8F, -12F, 0F, 1, 3, 1, 0F, 0F, -1.5F, 0F, 0F, -0.6F, 0.5F, 0F, -0.6F, 0.5F, 0F, -1.5F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.7F, 0F); // Box 6
        ammoModel[17].setRotationPoint(0F, 8F, 1F);
        ammoModel[17].rotateAngleX = -0.2443461F;
        ammoModel[17].rotateAngleY = -3.14159265F;
        ammoModel[17].rotateAngleZ = -0.2268928F;


        translateAll(0F, 0F, 0F);

        fancyStance = true;
        stanceRotate = new Vector3f(20F, 0.0F, -40.0F);
        stanceTranslate = new Vector3f(0.2F, 0F, 0F);
        animationType = EnumAnimationType.END_LOADED;
        flipAll();
    }
}