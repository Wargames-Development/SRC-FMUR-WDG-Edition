//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AK74MStock
// Model Creator: 
// Created on: -
// Last changed on: -

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelAK74MStock extends ModelAttachment //Same as Filename
{
    int textureX = 256;
    int textureY = 256;

    public ModelAK74MStock() //Same as Filename
    {
        attachmentModel = new ModelRendererTurbo[9];
        attachmentModel[0] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Import Import
        attachmentModel[1] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Import Import
        attachmentModel[2] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import Import
        attachmentModel[3] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Import Import
        attachmentModel[4] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Import Import
        attachmentModel[5] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Import
        attachmentModel[6] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Import Import
        attachmentModel[7] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Import Import
        attachmentModel[8] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Import Import

        attachmentModel[0].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.4F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, 0.4F, -0.6F, -0.15F, 0.0F, 1.9F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 1.9F, -0.15F); // Import Import
        attachmentModel[0].setRotationPoint(-6F, -0.5F, -0.5F);

        attachmentModel[1].addShapeBox(0F, -2F, 0F, 4, 1, 1, 0F, 0.05F, -0.7F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.05F, -0.7F, -0.3F, 0.0F, 0.1F, -0.15F, 0.5F, -0.4F, -0.15F, 0.5F, -0.4F, -0.15F, 0.0F, 0.1F, -0.15F); // Import Import
        attachmentModel[1].setRotationPoint(-6.4F, 1F, -0.5F);

        attachmentModel[2].addShapeBox(0F, -2F, 0F, 4, 1, 1, 0F, 0.05F, -0.3F, -0.25F, 0.0F, 0.1F, -0.25F, 0.0F, 0.0F, -0.65F, -0.05F, -0.4F, -0.65F, 0.0F, -0.3F, -0.4F, 0.5F, -0.8F, -0.4F, 0.5F, -0.7F, -0.5F, -0.1F, -0.2F, -0.5F); // Import Import
        attachmentModel[2].setRotationPoint(-6.4F, 1.4F, -0.05F);

        attachmentModel[3].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.4F, -0.6F, -0.4F, -0.2F, 0.1F, -0.4F, -0.1F, 0.0F, -0.5F, 0.3F, -0.7F, -0.5F, 0.0F, 1.9F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.1F, -0.5F, -0.1F, 1.7F, -0.5F); // Import Import
        attachmentModel[3].setRotationPoint(-6F, -0.5F, -0.05F);

        attachmentModel[4].addShapeBox(0F, -2F, 0F, 4, 1, 1, 0F, -0.05F, -0.4F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.1F, -0.25F, 0.05F, -0.3F, -0.25F, -0.1F, -0.2F, -0.5F, 0.5F, -0.7F, -0.5F, 0.5F, -0.8F, -0.4F, 0.0F, -0.3F, -0.4F); // Import Import
        attachmentModel[4].setRotationPoint(-6.4F, 1.4F, -0.95F);

        attachmentModel[5].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.3F, -0.7F, -0.5F, -0.1F, 0.0F, -0.5F, -0.2F, 0.1F, -0.4F, 0.4F, -0.6F, -0.4F, -0.1F, 1.7F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, 0.0F, -0.4F, 0.0F, 1.9F, -0.4F); // Import Import
        attachmentModel[5].setRotationPoint(-6F, -0.5F, -0.95F);

        attachmentModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F); // Import Import
        attachmentModel[6].setRotationPoint(-6.9F, 0.2F, -0.5F);
        attachmentModel[6].rotateAngleZ = 0.17453293F;

        attachmentModel[7].addShapeBox(0F, 1.6F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.15F, -0.4F, -0.4F, -0.15F, -0.4F, -0.4F, -0.15F, -0.4F, -0.4F, -0.15F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F); // Import Import
        attachmentModel[7].setRotationPoint(-6.9F, 0.2F, -0.5F);
        attachmentModel[7].rotateAngleZ = 0.17453293F;

        attachmentModel[8].addShapeBox(0F, -0.6F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.15F, -0.4F, -0.4F, -0.15F, -0.4F, -0.4F, -0.15F, -0.4F, -0.4F, -0.15F); // Import Import
        attachmentModel[8].setRotationPoint(-6.9F, 0.2F, -0.5F);
        attachmentModel[8].rotateAngleZ = 0.17453293F;
        flipAll();
    }
}