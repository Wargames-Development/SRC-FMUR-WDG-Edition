//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Defibrillator
// Model Creator: 
// Created on: 20.03.2022 - 21:44:27
// Last changed on: 20.03.2022 - 21:44:27

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelDefibrillator extends ModelGun //Same as Filename
{
    int textureX = 128;
    int textureY = 128;

    public ModelDefibrillator() //Same as Filename
    {
        ammoModel = new ModelRendererTurbo[50];
        ammoModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 467
        ammoModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 467
        ammoModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 467
        ammoModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 467
        ammoModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 467
        ammoModel[5] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 467
        ammoModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 467
        ammoModel[7] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 467
        ammoModel[8] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 467
        ammoModel[9] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 467
        ammoModel[10] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 467
        ammoModel[11] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 467
        ammoModel[12] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 467
        ammoModel[13] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 467
        ammoModel[14] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 467
        ammoModel[15] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 467
        ammoModel[16] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 467
        ammoModel[17] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 467
        ammoModel[18] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 487
        ammoModel[19] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 467
        ammoModel[20] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 487
        ammoModel[21] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 487
        ammoModel[22] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 487
        ammoModel[23] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 487
        ammoModel[24] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 487
        ammoModel[25] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 467
        ammoModel[26] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 467
        ammoModel[27] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 467
        ammoModel[28] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 467
        ammoModel[29] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 467
        ammoModel[30] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 467
        ammoModel[31] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 467
        ammoModel[32] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 467
        ammoModel[33] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 467
        ammoModel[34] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 467
        ammoModel[35] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 467
        ammoModel[36] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 467
        ammoModel[37] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 467
        ammoModel[38] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 467
        ammoModel[39] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 467
        ammoModel[40] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 467
        ammoModel[41] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 467
        ammoModel[42] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 467
        ammoModel[43] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 487
        ammoModel[44] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 467
        ammoModel[45] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 487
        ammoModel[46] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 487
        ammoModel[47] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 487
        ammoModel[48] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 487
        ammoModel[49] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 487

        ammoModel[0].addShapeBox(4F, -8F, -6F, 1, 12, 11, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 467
        ammoModel[0].setRotationPoint(0F, 0F, 1F);
        ammoModel[0].rotateAngleX = 0.12217305F;
        ammoModel[0].rotateAngleZ = -0.17453293F;

        ammoModel[1].addShapeBox(4F, -10F, -6F, 1, 2, 11, 0F, 0F, 0.2F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 467
        ammoModel[1].setRotationPoint(0F, 0F, 1F);
        ammoModel[1].rotateAngleX = 0.12217305F;
        ammoModel[1].rotateAngleZ = -0.17453293F;

        ammoModel[2].addShapeBox(1F, -8F, -6F, 3, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
        ammoModel[2].setRotationPoint(0F, 0F, 1F);
        ammoModel[2].rotateAngleX = 0.12217305F;
        ammoModel[2].rotateAngleZ = -0.17453293F;

        ammoModel[3].addShapeBox(1F, -8F, 4F, 3, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
        ammoModel[3].setRotationPoint(0F, 0F, 1F);
        ammoModel[3].rotateAngleX = 0.12217305F;
        ammoModel[3].rotateAngleZ = -0.17453293F;

        ammoModel[4].addShapeBox(1F, 4F, 4F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 467
        ammoModel[4].setRotationPoint(0F, 0F, 1F);
        ammoModel[4].rotateAngleX = 0.12217305F;
        ammoModel[4].rotateAngleZ = -0.17453293F;

        ammoModel[5].addShapeBox(1F, 4F, -6F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 467
        ammoModel[5].setRotationPoint(0F, 0F, 1F);
        ammoModel[5].rotateAngleX = 0.12217305F;
        ammoModel[5].rotateAngleZ = -0.17453293F;

        ammoModel[6].addShapeBox(1F, 5F, -4F, 3, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
        ammoModel[6].setRotationPoint(0F, 0F, 1F);
        ammoModel[6].rotateAngleX = 0.12217305F;
        ammoModel[6].rotateAngleZ = -0.17453293F;

        ammoModel[7].addShapeBox(1F, -10F, 4F, 3, 2, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
        ammoModel[7].setRotationPoint(0F, 0F, 1F);
        ammoModel[7].rotateAngleX = 0.12217305F;
        ammoModel[7].rotateAngleZ = -0.17453293F;

        ammoModel[8].addShapeBox(1F, -10F, -6F, 3, 2, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
        ammoModel[8].setRotationPoint(0F, 0F, 1F);
        ammoModel[8].rotateAngleX = 0.12217305F;
        ammoModel[8].rotateAngleZ = -0.17453293F;

        ammoModel[9].addShapeBox(2F, -10F, -4F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
        ammoModel[9].setRotationPoint(0F, 0F, 1F);
        ammoModel[9].rotateAngleX = 0.12217305F;
        ammoModel[9].rotateAngleZ = -0.17453293F;

        ammoModel[10].addShapeBox(4F, 4F, -6F, 1, 2, 11, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0.2F, -1.8F); // Box 467
        ammoModel[10].setRotationPoint(0F, 0F, 1F);
        ammoModel[10].rotateAngleX = 0.12217305F;
        ammoModel[10].rotateAngleZ = -0.17453293F;

        ammoModel[11].addShapeBox(0F, -10F, 4F, 1, 2, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
        ammoModel[11].setRotationPoint(0F, 0F, 1F);
        ammoModel[11].rotateAngleX = 0.12217305F;
        ammoModel[11].rotateAngleZ = -0.17453293F;

        ammoModel[12].addShapeBox(0F, -10F, -6F, 1, 2, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 467
        ammoModel[12].setRotationPoint(0F, 0F, 1F);
        ammoModel[12].rotateAngleX = 0.12217305F;
        ammoModel[12].rotateAngleZ = -0.17453293F;

        ammoModel[13].addShapeBox(0F, -8F, -6F, 1, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 467
        ammoModel[13].setRotationPoint(0F, 0F, 1F);
        ammoModel[13].rotateAngleX = 0.12217305F;
        ammoModel[13].rotateAngleZ = -0.17453293F;

        ammoModel[14].addShapeBox(0F, -5.5F, -0.5F, 1, 11, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 467
        ammoModel[14].setRotationPoint(0F, 0F, 1F);
        ammoModel[14].rotateAngleX = 0.12217305F;
        ammoModel[14].rotateAngleZ = -0.17453293F;

        ammoModel[15].addShapeBox(0.5F, 5F, -0.5F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 467
        ammoModel[15].setRotationPoint(0F, 0F, 1F);
        ammoModel[15].rotateAngleX = 0.12217305F;
        ammoModel[15].rotateAngleZ = -0.17453293F;

        ammoModel[16].addShapeBox(0F, -10F, -4F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
        ammoModel[16].setRotationPoint(0F, 0F, 1F);
        ammoModel[16].rotateAngleX = 0.12217305F;
        ammoModel[16].rotateAngleZ = -0.17453293F;

        ammoModel[17].addShapeBox(0F, -10F, 2F, 2, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
        ammoModel[17].setRotationPoint(0F, 0F, 1F);
        ammoModel[17].rotateAngleX = 0.12217305F;
        ammoModel[17].rotateAngleZ = -0.17453293F;

        ammoModel[18].addShapeBox(-0.2F, -8F, 2.5F, 1, 1, 2, 0F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 487
        ammoModel[18].setRotationPoint(0F, 0F, 1F);
        ammoModel[18].rotateAngleX = 0.12217305F;
        ammoModel[18].rotateAngleZ = -0.17453293F;

        ammoModel[19].addShapeBox(1F, -8F, -3F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
        ammoModel[19].setRotationPoint(0F, 0F, 1F);
        ammoModel[19].rotateAngleX = 0.12217305F;
        ammoModel[19].rotateAngleZ = -0.17453293F;

        ammoModel[20].addShapeBox(-0.2F, -7.4F, 2.5F, 1, 1, 2, 0F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.65F, 0F, -0.2F, -0.65F, 0F, -0.2F, -0.65F, 0F, -0.2F, -0.65F); // Box 487
        ammoModel[20].setRotationPoint(0F, 0F, 1F);
        ammoModel[20].rotateAngleX = 0.12217305F;
        ammoModel[20].rotateAngleZ = -0.17453293F;

        ammoModel[21].addShapeBox(-0.2F, -8.6F, 2.5F, 1, 1, 2, 0F, 0F, -0.2F, -0.65F, 0F, -0.2F, -0.65F, 0F, -0.2F, -0.65F, 0F, -0.2F, -0.65F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 487
        ammoModel[21].setRotationPoint(0F, 0F, 1F);
        ammoModel[21].rotateAngleX = 0.12217305F;
        ammoModel[21].rotateAngleZ = -0.17453293F;

        ammoModel[22].addShapeBox(0.600000000000001F, -9F, -1.5F, 1, 1, 2, 0F, -0.1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.1F, 0F, 0F); // Box 487
        ammoModel[22].setRotationPoint(0F, 0F, 1F);
        ammoModel[22].rotateAngleX = 0.12217305F;
        ammoModel[22].rotateAngleZ = -0.17453293F;

        ammoModel[23].addShapeBox(-0.0999999999999996F, -9F, -1.5F, 1, 1, 2, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F); // Box 487
        ammoModel[23].setRotationPoint(0F, 0F, 1F);
        ammoModel[23].rotateAngleX = 0.12217305F;
        ammoModel[23].rotateAngleZ = -0.17453293F;

        ammoModel[24].addShapeBox(1.2F, -9F, -1.5F, 1, 1, 2, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F); // Box 487
        ammoModel[24].setRotationPoint(0F, 0F, 1F);
        ammoModel[24].rotateAngleX = 0.12217305F;
        ammoModel[24].rotateAngleZ = -0.17453293F;

        ammoModel[25].addShapeBox(4F, -8F, -6F, 1, 12, 11, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 467
        ammoModel[25].setRotationPoint(0F, 0F, 30F);
        ammoModel[25].rotateAngleX = -0.12217305F;
        ammoModel[25].rotateAngleZ = -0.17453293F;

        ammoModel[26].addShapeBox(4F, -10F, -6F, 1, 2, 11, 0F, 0F, 0.2F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 467
        ammoModel[26].setRotationPoint(0F, 0F, 30F);
        ammoModel[26].rotateAngleX = -0.12217305F;
        ammoModel[26].rotateAngleZ = -0.17453293F;

        ammoModel[27].addShapeBox(1F, -8F, -6F, 3, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
        ammoModel[27].setRotationPoint(0F, 0F, 30F);
        ammoModel[27].rotateAngleX = -0.12217305F;
        ammoModel[27].rotateAngleZ = -0.17453293F;

        ammoModel[28].addShapeBox(1F, -8F, 4F, 3, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
        ammoModel[28].setRotationPoint(0F, 0F, 30F);
        ammoModel[28].rotateAngleX = -0.12217305F;
        ammoModel[28].rotateAngleZ = -0.17453293F;

        ammoModel[29].addShapeBox(1F, 4F, 4F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 467
        ammoModel[29].setRotationPoint(0F, 0F, 30F);
        ammoModel[29].rotateAngleX = -0.12217305F;
        ammoModel[29].rotateAngleZ = -0.17453293F;

        ammoModel[30].addShapeBox(1F, 4F, -6F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 467
        ammoModel[30].setRotationPoint(0F, 0F, 30F);
        ammoModel[30].rotateAngleX = -0.12217305F;
        ammoModel[30].rotateAngleZ = -0.17453293F;

        ammoModel[31].addShapeBox(1F, 5F, -4F, 3, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
        ammoModel[31].setRotationPoint(0F, 0F, 30F);
        ammoModel[31].rotateAngleX = -0.12217305F;
        ammoModel[31].rotateAngleZ = -0.17453293F;

        ammoModel[32].addShapeBox(1F, -10F, 4F, 3, 2, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
        ammoModel[32].setRotationPoint(0F, 0F, 30F);
        ammoModel[32].rotateAngleX = -0.12217305F;
        ammoModel[32].rotateAngleZ = -0.17453293F;

        ammoModel[33].addShapeBox(1F, -10F, -6F, 3, 2, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
        ammoModel[33].setRotationPoint(0F, 0F, 30F);
        ammoModel[33].rotateAngleX = -0.12217305F;
        ammoModel[33].rotateAngleZ = -0.17453293F;

        ammoModel[34].addShapeBox(2F, -10F, -4F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
        ammoModel[34].setRotationPoint(0F, 0F, 30F);
        ammoModel[34].rotateAngleX = -0.12217305F;
        ammoModel[34].rotateAngleZ = -0.17453293F;

        ammoModel[35].addShapeBox(4F, 4F, -6F, 1, 2, 11, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0.2F, -1.8F); // Box 467
        ammoModel[35].setRotationPoint(0F, 0F, 30F);
        ammoModel[35].rotateAngleX = -0.12217305F;
        ammoModel[35].rotateAngleZ = -0.17453293F;

        ammoModel[36].addShapeBox(0F, -10F, 4F, 1, 2, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
        ammoModel[36].setRotationPoint(0F, 0F, 30F);
        ammoModel[36].rotateAngleX = -0.12217305F;
        ammoModel[36].rotateAngleZ = -0.17453293F;

        ammoModel[37].addShapeBox(0F, -10F, -6F, 1, 2, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 467
        ammoModel[37].setRotationPoint(0F, 0F, 30F);
        ammoModel[37].rotateAngleX = -0.12217305F;
        ammoModel[37].rotateAngleZ = -0.17453293F;

        ammoModel[38].addShapeBox(0F, -8F, -6F, 1, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 467
        ammoModel[38].setRotationPoint(0F, 0F, 30F);
        ammoModel[38].rotateAngleX = -0.12217305F;
        ammoModel[38].rotateAngleZ = -0.17453293F;

        ammoModel[39].addShapeBox(0F, -5.5F, -0.5F, 1, 11, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 467
        ammoModel[39].setRotationPoint(0F, 0F, 30F);
        ammoModel[39].rotateAngleX = -0.12217305F;
        ammoModel[39].rotateAngleZ = -0.17453293F;

        ammoModel[40].addShapeBox(0.5F, 5F, -0.5F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 467
        ammoModel[40].setRotationPoint(0F, 0F, 30F);
        ammoModel[40].rotateAngleX = -0.12217305F;
        ammoModel[40].rotateAngleZ = -0.17453293F;

        ammoModel[41].addShapeBox(0F, -10F, -4F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
        ammoModel[41].setRotationPoint(0F, 0F, 30F);
        ammoModel[41].rotateAngleX = -0.12217305F;
        ammoModel[41].rotateAngleZ = -0.17453293F;

        ammoModel[42].addShapeBox(0F, -10F, 2F, 2, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
        ammoModel[42].setRotationPoint(0F, 0F, 30F);
        ammoModel[42].rotateAngleX = -0.12217305F;
        ammoModel[42].rotateAngleZ = -0.17453293F;

        ammoModel[43].addShapeBox(-0.2F, -8F, 2.5F, 1, 1, 2, 0F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 487
        ammoModel[43].setRotationPoint(0F, 0F, 30F);
        ammoModel[43].rotateAngleX = -0.12217305F;
        ammoModel[43].rotateAngleZ = -0.17453293F;

        ammoModel[44].addShapeBox(1F, -8F, -3F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
        ammoModel[44].setRotationPoint(0F, 0F, 30F);
        ammoModel[44].rotateAngleX = -0.12217305F;
        ammoModel[44].rotateAngleZ = -0.17453293F;

        ammoModel[45].addShapeBox(-0.2F, -7.4F, 2.5F, 1, 1, 2, 0F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.65F, 0F, -0.2F, -0.65F, 0F, -0.2F, -0.65F, 0F, -0.2F, -0.65F); // Box 487
        ammoModel[45].setRotationPoint(0F, 0F, 30F);
        ammoModel[45].rotateAngleX = -0.12217305F;
        ammoModel[45].rotateAngleZ = -0.17453293F;

        ammoModel[46].addShapeBox(-0.2F, -8.6F, 2.5F, 1, 1, 2, 0F, 0F, -0.2F, -0.65F, 0F, -0.2F, -0.65F, 0F, -0.2F, -0.65F, 0F, -0.2F, -0.65F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 487
        ammoModel[46].setRotationPoint(0F, 0F, 30F);
        ammoModel[46].rotateAngleX = -0.12217305F;
        ammoModel[46].rotateAngleZ = -0.17453293F;

        ammoModel[47].addShapeBox(0.600000000000001F, -9F, -1.5F, 1, 1, 2, 0F, -0.1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.1F, 0F, 0F); // Box 487
        ammoModel[47].setRotationPoint(0F, 0F, 30F);
        ammoModel[47].rotateAngleX = -0.12217305F;
        ammoModel[47].rotateAngleZ = -0.17453293F;

        ammoModel[48].addShapeBox(-0.0999999999999996F, -9F, -1.5F, 1, 1, 2, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F); // Box 487
        ammoModel[48].setRotationPoint(0F, 0F, 30F);
        ammoModel[48].rotateAngleX = -0.12217305F;
        ammoModel[48].rotateAngleZ = -0.17453293F;

        ammoModel[49].addShapeBox(1.2F, -9F, -1.5F, 1, 1, 2, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F); // Box 487
        ammoModel[49].setRotationPoint(0F, 0F, 30F);
        ammoModel[49].rotateAngleX = -0.12217305F;
        ammoModel[49].rotateAngleZ = -0.17453293F;
        animationType = EnumAnimationType.CUSTOM;
        translateClip = new Vector3f(0.0F, -2F, 0.0F);

        translateAll(0F, 0F, -7F);

        flipAll();
    }
}