//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 22.10.2023 - 21:23:55
// Last changed on: 22.10.2023 - 21:23:55

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.ModelAAGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelSG36 extends ModelAAGun //Same as Filename
{
    int textureX = 128;
    int textureY = 128;

    public ModelSG36() //Same as Filename
    {
        baseModel = new ModelRendererTurbo[31];
        baseModel[0] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Import
        baseModel[1] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Import
        baseModel[2] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import
        baseModel[3] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Import
        baseModel[4] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Import
        baseModel[5] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Import
        baseModel[6] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Import
        baseModel[7] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Import
        baseModel[8] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import
        baseModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import
        baseModel[10] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Import
        baseModel[11] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Import
        baseModel[12] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Import
        baseModel[13] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Import
        baseModel[14] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Import
        baseModel[15] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Import
        baseModel[16] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Import
        baseModel[17] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import
        baseModel[18] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Import
        baseModel[19] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Import
        baseModel[20] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Import
        baseModel[21] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Import
        baseModel[22] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import
        baseModel[23] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Import
        baseModel[24] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Import
        baseModel[25] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import
        baseModel[26] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Import
        baseModel[27] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Import
        baseModel[28] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Import
        baseModel[29] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import
        baseModel[30] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 127

        baseModel[0].addShapeBox(-2F, -0.6F, -2F, 4, 1, 1, 0F, -1.0F, -0.6F, 0.0F, -1.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        baseModel[0].setRotationPoint(0F, -10.5F, 0F);

        baseModel[1].addShapeBox(-2F, -0.6F, -1F, 4, 1, 2, 0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        baseModel[1].setRotationPoint(0F, -10.5F, 0F);

        baseModel[2].addShapeBox(-2F, -0.6F, 1F, 4, 1, 1, 0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -1.0F, -0.6F, 0.0F, -1.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        baseModel[2].setRotationPoint(0F, -10.5F, 0F);

        baseModel[3].addShapeBox(13.5F, 10.5F, 0.5F, 3, 2, 1, 0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -1.0F, -0.6F, 0.0F, -1.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        baseModel[3].setRotationPoint(3F, -12.5F, 0F);

        baseModel[4].addShapeBox(13.5F, 10.5F, -0.5F, 3, 2, 1, 0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        baseModel[4].setRotationPoint(3F, -12.5F, 0F);

        baseModel[5].addShapeBox(13.5F, 10.5F, -1.5F, 3, 2, 1, 0F, -1.0F, -0.6F, 0.0F, -1.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        baseModel[5].setRotationPoint(3F, -12.5F, 0F);

        baseModel[6].addShapeBox(4F, -2.8F, -1F, 11, 2, 2, 0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F); // Import
        baseModel[6].setRotationPoint(0F, -7.5F, 0F);
        baseModel[6].rotateAngleZ = -0.40142573F;

        baseModel[7].addShapeBox(2F, -2.8F, -1F, 2, 2, 2, 0F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 1.0F, 0.0F, -0.5F); // Import
        baseModel[7].setRotationPoint(0F, -7.5F, 0F);
        baseModel[7].rotateAngleZ = -0.40142573F;

        baseModel[8].addShapeBox(15F, -2.8F, -1F, 3, 2, 2, 0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F); // Import
        baseModel[8].setRotationPoint(0F, -7.5F, 0F);
        baseModel[8].rotateAngleZ = -0.40142573F;

        baseModel[9].addShapeBox(18F, -2.3F, -0.5F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 1F, -0.6F, 0.0F, 1F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, 0.0F, 0F, 0.4F, 0.0F, 0F, 0.0F, 0.0F); // Import
        baseModel[9].setRotationPoint(0F, -7.5F, 0F);
        baseModel[9].rotateAngleZ = -0.40142574F;

        baseModel[10].addShapeBox(-2F, -0.6F, -2F, 4, 3, 1, 0F, -1.0F, -0.6F, 0.0F, -1.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        baseModel[10].setRotationPoint(0F, -9F, 0F);

        baseModel[11].addShapeBox(-2F, -0.6F, -1F, 4, 3, 2, 0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        baseModel[11].setRotationPoint(0F, -9F, 0F);

        baseModel[12].addShapeBox(-2F, -0.6F, 1F, 4, 3, 1, 0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -1.0F, -0.6F, 0.0F, -1.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        baseModel[12].setRotationPoint(0F, -9F, 0F);

        baseModel[13].addShapeBox(-2F, -0.6F, -2F, 4, 2, 1, 0F, -1.0F, -0.6F, 0.0F, -1.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, 1F, -0.5F, -0.25F, 1F, -0.5F, -0.25F); // Import
        baseModel[13].setRotationPoint(0F, -8.6F, 0F);

        baseModel[14].addShapeBox(-2F, -0.6F, -1F, 4, 2, 2, 0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 1F, -0.5F, 0.25F, 1F, -0.5F, 0.25F, 1F, -0.5F, 0.25F, 1F, -0.5F, 0.25F); // Import
        baseModel[14].setRotationPoint(0F, -8.6F, 0F);

        baseModel[15].addShapeBox(-2F, -0.6F, 1F, 4, 2, 1, 0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -1.0F, -0.6F, 0.0F, -1.0F, -0.6F, 0.0F, 1F, -0.5F, -0.25F, 1F, -0.5F, -0.25F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F); // Import
        baseModel[15].setRotationPoint(0F, -8.6F, 0F);

        baseModel[16].addShapeBox(13.5F, 10.5F, 0.5F, 3, 2, 1, 0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -1.0F, -0.6F, 0.0F, -1.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        baseModel[16].setRotationPoint(-2F, -12.5F, 1.75F);
        baseModel[16].rotateAngleY = 2.53072742F;

        baseModel[17].addShapeBox(13.5F, 10.5F, -0.5F, 3, 2, 1, 0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        baseModel[17].setRotationPoint(-2F, -12.5F, 1.75F);
        baseModel[17].rotateAngleY = 2.53072742F;

        baseModel[18].addShapeBox(13.5F, 10.5F, -1.5F, 3, 2, 1, 0F, -1.0F, -0.6F, 0.0F, -1.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        baseModel[18].setRotationPoint(-2F, -12.5F, 1.75F);
        baseModel[18].rotateAngleY = 2.53072742F;

        baseModel[19].addShapeBox(4F, -2.8F, -1F, 11, 2, 2, 0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F); // Import
        baseModel[19].setRotationPoint(1F, -7.5F, -0.25F);
        baseModel[19].rotateAngleY = 2.53072742F;
        baseModel[19].rotateAngleZ = -0.40142573F;

        baseModel[20].addShapeBox(2F, -2.8F, -1F, 2, 2, 2, 0F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 1.0F, 0.0F, -0.5F); // Import
        baseModel[20].setRotationPoint(1F, -7.5F, -0.25F);
        baseModel[20].rotateAngleY = 2.53072742F;
        baseModel[20].rotateAngleZ = -0.40142573F;

        baseModel[21].addShapeBox(15F, -2.8F, -1F, 3, 2, 2, 0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F); // Import
        baseModel[21].setRotationPoint(1F, -7.5F, -0.25F);
        baseModel[21].rotateAngleY = 2.53072742F;
        baseModel[21].rotateAngleZ = -0.40142573F;

        baseModel[22].addShapeBox(18F, -2.3F, -0.5F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 1F, -0.6F, 0.0F, 1F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, 0.0F, 0F, 0.4F, 0.0F, 0F, 0.0F, 0.0F); // Import
        baseModel[22].setRotationPoint(1F, -7.5F, -0.25F);
        baseModel[22].rotateAngleY = 2.53072742F;
        baseModel[22].rotateAngleZ = -0.40142574F;

        baseModel[23].addShapeBox(13.5F, 10.5F, 0.5F, 3, 2, 1, 0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -1.0F, -0.6F, 0.0F, -1.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        baseModel[23].setRotationPoint(-2F, -12.5F, -2F);
        baseModel[23].rotateAngleY = -2.53072742F;

        baseModel[24].addShapeBox(13.5F, 10.5F, -0.5F, 3, 2, 1, 0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        baseModel[24].setRotationPoint(-2F, -12.5F, -2F);
        baseModel[24].rotateAngleY = -2.53072742F;

        baseModel[25].addShapeBox(13.5F, 10.5F, -1.5F, 3, 2, 1, 0F, -1.0F, -0.6F, 0.0F, -1.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        baseModel[25].setRotationPoint(-2F, -12.5F, -2F);
        baseModel[25].rotateAngleY = -2.53072742F;

        baseModel[26].addShapeBox(4F, -2.8F, -1F, 11, 2, 2, 0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F); // Import
        baseModel[26].setRotationPoint(1F, -7.5F, 0.25F);
        baseModel[26].rotateAngleY = -2.53072742F;
        baseModel[26].rotateAngleZ = -0.40142573F;

        baseModel[27].addShapeBox(2F, -2.8F, -1F, 2, 2, 2, 0F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 1.0F, 0.0F, -0.5F); // Import
        baseModel[27].setRotationPoint(1F, -7.5F, 0.25F);
        baseModel[27].rotateAngleY = -2.53072742F;
        baseModel[27].rotateAngleZ = -0.40142573F;

        baseModel[28].addShapeBox(15F, -2.8F, -1F, 3, 2, 2, 0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F); // Import
        baseModel[28].setRotationPoint(1F, -7.5F, 0.25F);
        baseModel[28].rotateAngleY = -2.53072742F;
        baseModel[28].rotateAngleZ = -0.40142573F;

        baseModel[29].addShapeBox(18F, -2.3F, -0.5F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 1F, -0.6F, 0.0F, 1F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, 0.0F, 0F, 0.4F, 0.0F, 0F, 0.0F, 0.0F); // Import
        baseModel[29].setRotationPoint(1F, -7.5F, 0.25F);
        baseModel[29].rotateAngleY = -2.53072742F;
        baseModel[29].rotateAngleZ = -0.40142574F;

        baseModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 127
        baseModel[30].setRotationPoint(-10F, -3.3F, -7.1F);
        baseModel[30].rotateAngleX = -0.01745329F;
        baseModel[30].rotateAngleZ = 2.0943951F;


        seatModel = new ModelRendererTurbo[62];
        seatModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import
        seatModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import
        seatModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import
        seatModel[3] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import
        seatModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import
        seatModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import
        seatModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import
        seatModel[7] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import
        seatModel[8] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Import
        seatModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import
        seatModel[10] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import
        seatModel[11] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import
        seatModel[12] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Import
        seatModel[13] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import
        seatModel[14] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Import
        seatModel[15] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import
        seatModel[16] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Import
        seatModel[17] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Import
        seatModel[18] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Import
        seatModel[19] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Import
        seatModel[20] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import
        seatModel[21] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Import
        seatModel[22] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Import
        seatModel[23] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import
        seatModel[24] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Import
        seatModel[25] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Import
        seatModel[26] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Import
        seatModel[27] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Import
        seatModel[28] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Import
        seatModel[29] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import
        seatModel[30] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Import
        seatModel[31] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Import
        seatModel[32] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Import
        seatModel[33] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Import
        seatModel[34] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Import
        seatModel[35] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Import
        seatModel[36] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Import
        seatModel[37] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Import
        seatModel[38] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Import
        seatModel[39] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import
        seatModel[40] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Import
        seatModel[41] = new ModelRendererTurbo(this, 4, 105, textureX, textureY); // Import
        seatModel[42] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Import
        seatModel[43] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Import
        seatModel[44] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Import
        seatModel[45] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Import
        seatModel[46] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import
        seatModel[47] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Import
        seatModel[48] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Import
        seatModel[49] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Import
        seatModel[50] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Import
        seatModel[51] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Import
        seatModel[52] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Import
        seatModel[53] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Import
        seatModel[54] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import
        seatModel[55] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Import
        seatModel[56] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Import
        seatModel[57] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Import
        seatModel[58] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Import
        seatModel[59] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import
        seatModel[60] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Import
        seatModel[61] = new ModelRendererTurbo(this, 30, 105, textureX, textureY); // Box 128

        seatModel[0].addShapeBox(-0.5F, -1.5F, 2F, 1, 3, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        seatModel[0].setRotationPoint(0F, -15F, -1.5F);

        seatModel[1].addShapeBox(-1.5F, -1.5F, 2F, 1, 3, 7, 0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        seatModel[1].setRotationPoint(0F, -15F, -1.5F);

        seatModel[2].addShapeBox(0.5F, -1.5F, 2F, 1, 3, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        seatModel[2].setRotationPoint(0F, -15F, -1.5F);

        seatModel[3].addShapeBox(2.5F, 1.25F, -3F, 3, 1, 1, 0F, -0.5F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F); // Import
        seatModel[3].setRotationPoint(-6F, -12F, -1F);

        seatModel[4].addShapeBox(2.5F, 0.25F, -3F, 3, 2, 1, 0F, 1.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 1.0F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F); // Import
        seatModel[4].setRotationPoint(-6F, -13F, -1F);

        seatModel[5].addShapeBox(1.5F, -1.75F, -3F, 4, 3, 1, 0F, 0.75F, 0.25F, -0.2F, -2.0F, 0.25F, -0.2F, -2.0F, 0.25F, -0.2F, 0.75F, 0.25F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F); // Import
        seatModel[5].setRotationPoint(-6F, -14F, -1F);

        seatModel[6].addShapeBox(1F, -2F, -2.25F, 1, 1, 2, 0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F); // Import
        seatModel[6].setRotationPoint(-6F, -14F, -1F);

        seatModel[7].addShapeBox(0F, -5F, -8F, 4, 6, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        seatModel[7].setRotationPoint(-2.5F, -9F, -4.5F);
        seatModel[7].rotateAngleX = -0.26179939F;

        seatModel[8].addShapeBox(0F, -5F, -8F, 5, 1, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        seatModel[8].setRotationPoint(-3F, -9.5F, -5F);
        seatModel[8].rotateAngleX = -0.26179939F;

        seatModel[9].addShapeBox(2.25F, -1.75F, -6.5F, 1, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        seatModel[9].setRotationPoint(-6F, -12F, -3F);

        seatModel[10].addShapeBox(-0.5F, -2.5F, -0.5F, 15, 3, 3, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        seatModel[10].setRotationPoint(-8F, -14F, -1.5F);

        seatModel[11].addShapeBox(3.5F, -3.5F, -0.5F, 5, 1, 2, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        seatModel[11].setRotationPoint(-6F, -14F, -1F);

        seatModel[12].addShapeBox(8.5F, -3.5F, -0.5F, 1, 1, 2, 0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        seatModel[12].setRotationPoint(-6F, -14F, -1F);

        seatModel[13].addShapeBox(32.5F, -3.5F, -1F, 6, 3, 3, 0F, -1.0F, -1.0F, -1.0F, -0.75F, -1.0F, -1.0F, -0.75F, -1.0F, -1.0F, -1.0F, -1.0F, -1.0F, -1.0F, -1.0F, -1.0F, -0.75F, -1.0F, -1.0F, -0.75F, -1.0F, -1.0F, -1.0F, -1.0F, -1.0F); // Import
        seatModel[13].setRotationPoint(-27F, -12.5F, -1F);

        seatModel[14].addShapeBox(4.5F, -3.5F, -3.5F, 2, 1, 2, 0F, 0.0F, -0.15F, -0.25F, 0.0F, -0.15F, -0.25F, 0.0F, -0.15F, -0.25F, 0.0F, -0.15F, -0.25F, 0.0F, -0.15F, -0.25F, 0.0F, -0.15F, -0.25F, 0.0F, -0.15F, -0.25F, 0.0F, -0.15F, -0.25F); // Import
        seatModel[14].setRotationPoint(-5F, -14F, 1F);

        seatModel[15].addShapeBox(4.5F, -2.85F, -3.5F, 2, 1, 2, 0F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F); // Import
        seatModel[15].setRotationPoint(-5F, -14F, 1F);

        seatModel[16].addShapeBox(-0.5F, -0.5F, -1F, 4, 1, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        seatModel[16].setRotationPoint(-1.5F, -11F, -1.5F);

        seatModel[17].addShapeBox(32.5F, -3.5F, -1F, 6, 3, 3, 0F, -1.0F, -1.25F, -1.25F, -0.75F, -1.25F, -1.25F, -0.75F, -1.25F, -1.25F, -1.0F, -1.25F, -1.25F, -1.0F, -1.25F, -1.25F, -0.75F, -1.25F, -1.25F, -0.75F, -1.25F, -1.25F, -1.0F, -1.25F, -1.25F); // Import
        seatModel[17].setRotationPoint(-25F, -12.5F, -1F);

        seatModel[18].addShapeBox(32.5F, -3.5F, -1F, 8, 3, 3, 0F, -1.0F, -1.0F, -1.0F, -0.75F, -1.0F, -1.0F, -0.75F, -1.0F, -1.0F, -1.0F, -1.0F, -1.0F, -1.0F, -1.0F, -1.0F, -0.75F, -1.0F, -1.0F, -0.75F, -1.0F, -1.0F, -1.0F, -1.0F, -1.0F); // Import
        seatModel[18].setRotationPoint(-27F, -13.75F, -1F);

        seatModel[19].addShapeBox(32.5F, -3.5F, -1F, 3, 3, 3, 0F, -1.0F, -1.1F, -1.1F, -0.75F, -1.1F, -1.1F, -0.75F, -1.1F, -1.1F, -1.0F, -1.1F, -1.1F, -1.0F, -1.1F, -1.1F, -0.75F, -1.1F, -1.1F, -0.75F, -1.1F, -1.1F, -1.0F, -1.1F, -1.1F); // Import
        seatModel[19].setRotationPoint(-20.75F, -13.75F, -1F);

        seatModel[20].addShapeBox(32.5F, -3.5F, -1F, 13, 3, 3, 0F, -1.0F, -1.25F, -1.25F, -1.4F, -1.25F, -1.25F, -1.4F, -1.25F, -1.25F, -1.0F, -1.25F, -1.25F, -1.0F, -1.25F, -1.25F, -1.4F, -1.25F, -1.25F, -1.4F, -1.25F, -1.25F, -1.0F, -1.25F, -1.25F); // Import
        seatModel[20].setRotationPoint(-21.5F, -13.75F, -1F);

        seatModel[21].addShapeBox(32.5F, -3.5F, -1F, 4, 3, 3, 0F, -1.5F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1.5F, -1F, -1F, -1.5F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1.5F, -1F, -1F); // Import
        seatModel[21].setRotationPoint(-13F, -13.75F, -1F);

        seatModel[22].addShapeBox(32.5F, -3.5F, -1F, 7, 1, 3, 0F, -1.25F, -0.25F, -0.9F, -1F, -0.25F, -0.9F, -1F, -0.25F, -0.9F, -1.25F, -0.25F, -0.9F, -0.75F, -0.5F, -0.9F, -0.75F, -0.5F, -0.9F, -0.75F, -0.5F, -0.9F, -0.75F, -0.5F, -0.9F); // Import
        seatModel[22].setRotationPoint(-26F, -14.85F, -1F);

        seatModel[23].addShapeBox(32.5F, -3.5F, -1F, 1, 3, 3, 0F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F); // Import
        seatModel[23].setRotationPoint(-20.75F, -13F, -1F);

        seatModel[24].addShapeBox(32.5F, -3.5F, -1F, 8, 1, 3, 0F, -1.0F, -0.25F, -0.9F, -0.75F, -0.25F, -0.9F, -0.75F, -0.25F, -0.9F, -1.0F, -0.25F, -0.9F, -1.0F, -0.5F, -0.9F, -0.75F, -0.5F, -0.9F, -0.75F, -0.5F, -0.9F, -1.0F, -0.5F, -0.9F); // Import
        seatModel[24].setRotationPoint(-27F, -13.35F, -1F);

        seatModel[25].addShapeBox(32.5F, -3.5F, -1F, 1, 3, 3, 0F, -0.3F, -0.9F, -0.9F, -0.3F, -0.9F, -0.9F, -0.3F, -0.9F, -0.9F, -0.3F, -0.9F, -0.9F, -0.3F, -0.9F, -0.9F, -0.3F, -0.9F, -0.9F, -0.3F, -0.9F, -0.9F, -0.3F, -0.9F, -0.9F); // Import
        seatModel[25].setRotationPoint(-23.5F, -13.75F, -1F);

        seatModel[26].addShapeBox(32.5F, -3.5F, -1F, 1, 3, 3, 0F, -0.3F, -0.9F, -0.9F, -0.3F, -0.9F, -0.9F, -0.3F, -0.9F, -0.9F, -0.3F, -0.9F, -0.9F, -0.3F, -0.9F, -0.9F, -0.3F, -0.9F, -0.9F, -0.3F, -0.9F, -0.9F, -0.3F, -0.9F, -0.9F); // Import
        seatModel[26].setRotationPoint(-25.5F, -13.75F, -1F);

        seatModel[27].addShapeBox(32.5F, -3.5F, -1F, 1, 1, 3, 0F, -1.0F, 0.5F, -0.9F, -0.75F, 0.5F, -0.9F, -0.75F, 0.5F, -0.9F, -1.0F, 0.5F, -0.9F, -1.0F, -0.25F, -0.9F, -0.75F, -0.25F, -0.9F, -0.75F, -0.25F, -0.9F, -1.0F, -0.25F, -0.9F); // Import
        seatModel[27].setRotationPoint(-20.75F, -13.85F, -1F);

        seatModel[28].addShapeBox(32.5F, -3.5F, -1F, 1, 1, 3, 0F, -1.0F, 0.5F, -0.9F, -0.75F, 0.5F, -0.9F, -0.75F, 0.5F, -0.9F, -1.0F, 0.5F, -0.9F, -1.0F, -0.25F, -0.9F, -1.5F, -0.25F, -0.9F, -1.5F, -0.25F, -0.9F, -1F, -0.25F, -0.9F); // Import
        seatModel[28].setRotationPoint(-25.5F, -13.85F, -1F);

        seatModel[29].addShapeBox(-0.5F, -1.5F, 2F, 1, 3, 3, 0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F); // Import
        seatModel[29].setRotationPoint(0F, -15F, -0.5F);

        seatModel[30].addShapeBox(0.5F, -1.5F, 2F, 1, 3, 3, 0F, -0.25F, 0.5F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, -0.25F, 0.5F, 0.0F); // Import
        seatModel[30].setRotationPoint(0F, -15F, -0.5F);

        seatModel[31].addShapeBox(0.5F, -1.5F, 2F, 1, 3, 3, 0F, 0.5F, -0.75F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0.5F, -0.75F, 0F); // Import
        seatModel[31].setRotationPoint(-2F, -15F, -0.5F);

        seatModel[32].addShapeBox(-0.5F, -0.5F, -1F, 4, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1F, -2F, 0.0F, 1F, -2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0F, -2F, -1F, 0.0F, -2F, -1F); // Import
        seatModel[32].setRotationPoint(-1.5F, -11F, 3.5F);

        seatModel[33].addShapeBox(-0.5F, -0.5F, -1F, 4, 2, 3, 0F, -0.1F, 0.0F, 1F, -0.1F, 0.0F, 1F, -0.1F, 0.0F, -2F, -0.1F, 0.0F, -2F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, -2F); // Import
        seatModel[33].setRotationPoint(-1.5F, -14F, 4.5F);

        seatModel[34].addShapeBox(-0.5F, -1.5F, 2F, 1, 2, 5, 0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.35F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.35F, 0.5F, 0.0F); // Import
        seatModel[34].setRotationPoint(-4.9F, -21.5F, -5.3F);

        seatModel[35].addShapeBox(32.5F, -3.5F, -1F, 1, 3, 3, 0F, -0.3F, -0.9F, -0.9F, -0.3F, -0.9F, -0.9F, -0.3F, -0.9F, -0.9F, -0.3F, -0.9F, -0.9F, -0.3F, -0.9F, -0.9F, -0.3F, -0.9F, -0.9F, -0.3F, -0.9F, -0.9F, -0.3F, -0.9F, -0.9F); // Import
        seatModel[35].setRotationPoint(-38.4F, -18F, -1.3F);

        seatModel[36].addShapeBox(-0.5F, -1.5F, 2F, 1, 2, 5, 0F, -0.2F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.2F, 0.25F, -0.25F, 0.3F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.3F, 0.25F, -0.25F); // Import
        seatModel[36].setRotationPoint(-5F, -21.5F, -5.3F);

        seatModel[37].addShapeBox(-0.5F, -2.5F, -0.5F, 3, 2, 3, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F); // Import
        seatModel[37].setRotationPoint(-5.75F, -13.5F, 0.5F);

        seatModel[38].addShapeBox(-0.5F, -2.5F, -0.5F, 1, 3, 3, 0F, 0.0F, -0.8F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.8F, -0.5F, 0.0F, -0.8F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.8F, -0.5F); // Import
        seatModel[38].setRotationPoint(-9F, -14F, -1.5F);

        seatModel[39].addShapeBox(4.5F, -3.5F, -3.5F, 2, 1, 3, 0F, 0.0F, -2.65F, 0.75F, 0.0F, -2.65F, 0.75F, 0.0F, -0.15F, -0.25F, 0.0F, -0.15F, -0.25F, 0.0F, 1.85F, -0.25F, 0.0F, 1.85F, -0.25F, 0.0F, -0.15F, -0.25F, 0.0F, -0.15F, -0.25F); // Import
        seatModel[39].setRotationPoint(-5F, -14F, -1.5F);

        seatModel[40].addShapeBox(4.5F, -2.85F, -3.5F, 2, 1, 3, 0F, 0.1F, -2.15F, -0.15F, 0.1F, -2.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, 1.85F, -0.15F, 0.1F, 1.85F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F); // Import
        seatModel[40].setRotationPoint(-5F, -14F, -1.7F);

        seatModel[41].addShapeBox(3.5F, -3.5F, -0.5F, 4, 3, 6, 0F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.15F, 0F, -0.25F, -3.15F, 0.0F, -0.25F, -3.15F, 0.0F, -2F, -0.15F, 0.0F, -2F, -0.15F, 0.0F, -2F, -3.15F, 0.0F, -2F, -3.15F); // Import
        seatModel[41].setRotationPoint(5F, -15.65F, -1F);

        seatModel[42].addShapeBox(32.5F, -3.5F, -1F, 4, 3, 2, 0F, -1.5F, -1F, 0F, -1F, -1F, 0F, -1.5F, -1F, -0.5F, -1F, -1F, -0.5F, -1.5F, -1F, 0F, -1F, -1F, 0F, -1.5F, -1F, -0.5F, -1F, -1F, -0.5F); // Import
        seatModel[42].setRotationPoint(-13F, -13.75F, 1F);

        seatModel[43].addShapeBox(32.5F, -3.5F, -1F, 4, 3, 2, 0F, -1F, -1F, -0.5F, -1.5F, -1F, -0.5F, -1F, -1F, 0F, -1.5F, -1F, 0F, -1F, -1F, -0.5F, -1.5F, -1F, -0.5F, -1F, -1F, 0F, -1.5F, -1F, 0F); // Import
        seatModel[43].setRotationPoint(-13F, -13.75F, -2F);

        seatModel[44].addShapeBox(32.5F, -3.5F, -1F, 5, 3, 3, 0F, -1.0F, -1.25F, -1.25F, -1.4F, -1.25F, -1.25F, -1.4F, -1.25F, -1.25F, -1.0F, -1.25F, -1.25F, -1.0F, -1.25F, -1.25F, -1.4F, -1.25F, -1.25F, -1.4F, -1.25F, -1.25F, -1.0F, -1.25F, -1.25F); // Import
        seatModel[44].setRotationPoint(-27.5F, -16.5F, -1F);

        seatModel[45].addShapeBox(32.5F, -3.5F, -1F, 5, 3, 3, 0F, -1.5F, -0.25F, -1.25F, -1.4F, -1.25F, -1.25F, -1.4F, -1.25F, -1.25F, -1.5F, -0.25F, -1.25F, -1.5F, -2.25F, -1.25F, -1.4F, -1.25F, -1.25F, -1.4F, -1.25F, -1.25F, -1.5F, -2.25F, -1.25F); // Import
        seatModel[45].setRotationPoint(-30.1F, -16.5F, -1F);

        seatModel[46].addShapeBox(32.5F, -3.5F, -1F, 4, 3, 3, 0F, -1.0F, -1.25F, -1.25F, -1.4F, -1.25F, -1.25F, -1.4F, -1.25F, -1.25F, -1.0F, -1.25F, -1.25F, -1.0F, -1.25F, -1.25F, -1.4F, -1.25F, -1.25F, -1.4F, -1.25F, -1.25F, -1.0F, -1.25F, -1.25F); // Import
        seatModel[46].setRotationPoint(-31.2F, -17.5F, -1F);

        seatModel[47].addShapeBox(32.5F, -3.5F, -1F, 5, 3, 3, 0F, -2.4F, -1.25F, -1.25F, -1.5F, -0.25F, -1.25F, -1.5F, -0.25F, -1.25F, -2.4F, -1.25F, -1.25F, -2.9F, -1.75F, -1.25F, -1.5F, -2.25F, -1.25F, -1.5F, -2.25F, -1.25F, -2.9F, -1.75F, -1.25F); // Import
        seatModel[47].setRotationPoint(-33.7F, -16.5F, -1F);

        seatModel[48].addShapeBox(32.5F, -3.5F, -1F, 3, 4, 3, 0F, -1.25F, -1.4F, -1.25F, -1.25F, -1.4F, -1.25F, -1.25F, -1.4F, -1.25F, -1.25F, -1.4F, -1.25F, -1.25F, -1F, -1.25F, -1.25F, -1F, -1.25F, -1.25F, -1F, -1.25F, -1.25F, -1F, -1.25F); // Import
        seatModel[48].setRotationPoint(-32.55F, -16.65F, -1F);

        seatModel[49].addShapeBox(-0.5F, -2.5F, -0.5F, 1, 2, 6, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F); // Import
        seatModel[49].setRotationPoint(-5.25F, -16.5F, 0.5F);

        seatModel[50].addShapeBox(-0.5F, -2.5F, -0.5F, 1, 3, 6, 0F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F); // Import
        seatModel[50].setRotationPoint(-4.25F, -18F, 1.5F);

        seatModel[51].addShapeBox(-0.5F, -3.5F, -0.5F, 1, 2, 3, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.1F); // Import
        seatModel[51].setRotationPoint(-4.75F, -14F, 1.75F);

        seatModel[52].addShapeBox(-0.5F, -2.5F, -0.5F, 5, 2, 3, 0F, 0.0F, 0.5F, -0.4F, 0.75F, 0.5F, -0.4F, 0.75F, 0.5F, -0.6F, 0.0F, 0.5F, -0.6F, 0.0F, 0.0F, -0.4F, 0.75F, 0.0F, -0.4F, 0.75F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F); // Import
        seatModel[52].setRotationPoint(-6.75F, -16.5F, -1.75F);

        seatModel[53].addShapeBox(-0.5F, -2.5F, -0.5F, 1, 1, 6, 0F, 0.0F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -0.6F, 0.0F, -0.5F, -0.6F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F); // Import
        seatModel[53].setRotationPoint(-4.25F, -18.5F, 1.5F);

        seatModel[54].addShapeBox(-0.5F, -2.5F, -0.5F, 1, 1, 6, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -0.6F, 0F, -0.5F, -0.6F); // Import
        seatModel[54].setRotationPoint(-4.25F, -15F, 1.5F);

        seatModel[55].addShapeBox(-0.5F, -2.5F, -0.5F, 4, 2, 2, 0F, 0.0F, 0F, -0.5F, 0.0F, 0F, -0.5F, 0.0F, 0.5F, -0.6F, 0.0F, 0.5F, -0.6F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F); // Import
        seatModel[55].setRotationPoint(-5.75F, -16.5F, -2.75F);

        seatModel[56].addShapeBox(2.5F, 1.25F, -3F, 5, 2, 1, 0F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F); // Import
        seatModel[56].setRotationPoint(-10F, -17.5F, 0.75F);

        seatModel[57].addShapeBox(2.5F, 1.25F, -3F, 5, 1, 1, 0F, -1.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, -0.6F, -1.25F, -0.25F, -0.6F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F); // Import
        seatModel[57].setRotationPoint(-10F, -18.5F, 0.75F);

        seatModel[58].addShapeBox(-1.5F, 3.7F, 0.5F, 3, 4, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        seatModel[58].setRotationPoint(0F, -16F, 0F);

        seatModel[59].addShapeBox(-1.5F, 3.7F, -0.5F, 3, 4, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        seatModel[59].setRotationPoint(0F, -16F, 0F);

        seatModel[60].addShapeBox(-1.5F, 3.7F, -1.5F, 3, 4, 1, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        seatModel[60].setRotationPoint(0F, -16F, 0F);

        seatModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.8F, -0.1F, -0.1F, -0.8F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.8F, -0.1F, -0.1F); // Box 128
        seatModel[61].setRotationPoint(-2.3F, -19.4F, -1.5F);


        barrelX = 0;
        barrelY = 0;
        barrelZ = 0;


        flipAll();
    }
}