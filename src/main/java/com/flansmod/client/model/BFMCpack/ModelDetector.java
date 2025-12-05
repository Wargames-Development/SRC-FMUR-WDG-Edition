//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Detector
// Model Creator: 
// Created on: 14.03.2022 - 13:17:19
// Last changed on: 14.03.2022 - 13:17:19

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelDetector extends ModelAttachment //Same as Filename
{
    int textureX = 64;
    int textureY = 128;

    public ModelDetector() //Same as Filename
    {
        attachmentModel = new ModelRendererTurbo[14];
        attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import
        attachmentModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import
        attachmentModel[2] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import
        attachmentModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 0
        attachmentModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 0
        attachmentModel[5] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 0
        attachmentModel[6] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 0
        attachmentModel[7] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 0
        attachmentModel[8] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 0
        attachmentModel[9] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 0
        attachmentModel[10] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 7
        attachmentModel[11] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 7
        attachmentModel[12] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 7
        attachmentModel[13] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 0

        attachmentModel[0].addShapeBox(0F, -1F, -3F, 12, 8, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F); // Import
        attachmentModel[0].setRotationPoint(-6F, -3F, 3F);

        attachmentModel[1].addShapeBox(0F, -1F, -2F, 12, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        attachmentModel[1].setRotationPoint(-6F, -3F, 0F);

        attachmentModel[2].addShapeBox(0F, 6F, -2F, 12, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        attachmentModel[2].setRotationPoint(-6F, -3F, 0F);

        attachmentModel[3].addShapeBox(-1F, -1F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        attachmentModel[3].setRotationPoint(0F, 0F, 1F);
        attachmentModel[3].rotateAngleZ = 1.30899694F;

        attachmentModel[4].addShapeBox(-6F, -1F, 2F, 12, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        attachmentModel[4].setRotationPoint(0F, 0F, 1F);
        attachmentModel[4].rotateAngleZ = 1.30899694F;

        attachmentModel[5].addShapeBox(5F, -2F, 2F, 1, 1, 16, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        attachmentModel[5].setRotationPoint(0F, 0F, 1F);
        attachmentModel[5].rotateAngleZ = 1.30899694F;

        attachmentModel[6].addShapeBox(-6F, -2F, 2F, 1, 1, 16, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        attachmentModel[6].setRotationPoint(0F, 0F, 1F);
        attachmentModel[6].rotateAngleZ = 1.30899694F;

        attachmentModel[7].addShapeBox(-5F, -2F, 2F, 10, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        attachmentModel[7].setRotationPoint(0F, 0F, 1F);
        attachmentModel[7].rotateAngleZ = 1.30899694F;

        attachmentModel[8].addShapeBox(-5F, -2F, 17F, 10, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        attachmentModel[8].setRotationPoint(0F, 0F, 1F);
        attachmentModel[8].rotateAngleZ = 1.30899694F;

        attachmentModel[9].addShapeBox(-6F, 1F, 2F, 12, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 0
        attachmentModel[9].setRotationPoint(0F, 0F, 1F);
        attachmentModel[9].rotateAngleZ = 1.30899694F;

        attachmentModel[10].addShapeBox(-0.5F, -1F, 18F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 7
        attachmentModel[10].setRotationPoint(0F, 0F, 1F);
        attachmentModel[10].rotateAngleZ = 1.30899694F;

        attachmentModel[11].addShapeBox(-0.5F, 0F, 18F, 1, 1, 1, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
        attachmentModel[11].setRotationPoint(0F, 0F, 1F);
        attachmentModel[11].rotateAngleZ = 1.30899694F;

        attachmentModel[12].addShapeBox(-0.5F, 0F, 18F, 1, 1, 1, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 7
        attachmentModel[12].setRotationPoint(0F, 0F, 1F);
        attachmentModel[12].rotateAngleZ = 1.30899694F;

        attachmentModel[13].addShapeBox(-6F, -1.1F, 2F, 12, 1, 16, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, -0.9F, -1F, -1F, -0.9F, -1F, -1F, -0.9F, -1F, -1F, -0.9F, -1F); // Box 0
        attachmentModel[13].setRotationPoint(0F, 0F, 1F);
        attachmentModel[13].rotateAngleZ = 1.30899694F;
        flipAll();
    }
}