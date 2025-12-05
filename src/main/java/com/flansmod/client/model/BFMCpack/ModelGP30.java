//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GP30
// Model Creator: 
// Created on: 29.03.2022 - 11:31:51
// Last changed on: 29.03.2022 - 11:31:51

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelGP30 extends ModelGun //Same as Filename
{
    int textureX = 256;
    int textureY = 256;

    public ModelGP30() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[127];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 265
        gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 265
        gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 265
        gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 265
        gunModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 265
        gunModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 265
        gunModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 265
        gunModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 265
        gunModel[8] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 265
        gunModel[9] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 265
        gunModel[10] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 265
        gunModel[11] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 265
        gunModel[12] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 265
        gunModel[13] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 265
        gunModel[14] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 265
        gunModel[15] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 265
        gunModel[16] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 265
        gunModel[17] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 265
        gunModel[18] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 265
        gunModel[19] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 265
        gunModel[20] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 265
        gunModel[21] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 265
        gunModel[22] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 265
        gunModel[23] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 265
        gunModel[24] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 265
        gunModel[25] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 265
        gunModel[26] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 265
        gunModel[27] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 265
        gunModel[28] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 265
        gunModel[29] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 265
        gunModel[30] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 265
        gunModel[31] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 265
        gunModel[32] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 265
        gunModel[33] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 265
        gunModel[34] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 265
        gunModel[35] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 301
        gunModel[36] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 301
        gunModel[37] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 301
        gunModel[38] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 301
        gunModel[39] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 301
        gunModel[40] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 301
        gunModel[41] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 301
        gunModel[42] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 301
        gunModel[43] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 301
        gunModel[44] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 301
        gunModel[45] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 301
        gunModel[46] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 301
        gunModel[47] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 301
        gunModel[48] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 301
        gunModel[49] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 301
        gunModel[50] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 301
        gunModel[51] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 301
        gunModel[52] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 301
        gunModel[53] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 301
        gunModel[54] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 301
        gunModel[55] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 322
        gunModel[56] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 322
        gunModel[57] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 322
        gunModel[58] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 322
        gunModel[59] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 326
        gunModel[60] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 326
        gunModel[61] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 326
        gunModel[62] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 326
        gunModel[63] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 326
        gunModel[64] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 326
        gunModel[65] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 326
        gunModel[66] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 326
        gunModel[67] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 326
        gunModel[68] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 301
        gunModel[69] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 326
        gunModel[70] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 326
        gunModel[71] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 326
        gunModel[72] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 339
        gunModel[73] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 339
        gunModel[74] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 339
        gunModel[75] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 339
        gunModel[76] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 339
        gunModel[77] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 339
        gunModel[78] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 339
        gunModel[79] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 339
        gunModel[80] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 339
        gunModel[81] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 339
        gunModel[82] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 339
        gunModel[83] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 339
        gunModel[84] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 339
        gunModel[85] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 339
        gunModel[86] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 326
        gunModel[87] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 326
        gunModel[88] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 326
        gunModel[89] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 301
        gunModel[90] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 367
        gunModel[91] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 326
        gunModel[92] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 326
        gunModel[93] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 326
        gunModel[94] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 326
        gunModel[95] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 326
        gunModel[96] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 326
        gunModel[97] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 339
        gunModel[98] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 367
        gunModel[99] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 367
        gunModel[100] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 367
        gunModel[101] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 367
        gunModel[102] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 367
        gunModel[103] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 367
        gunModel[104] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 367
        gunModel[105] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 367
        gunModel[106] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 367
        gunModel[107] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 367
        gunModel[108] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 367
        gunModel[109] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 367
        gunModel[110] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 367
        gunModel[111] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 367
        gunModel[112] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 367
        gunModel[113] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 367
        gunModel[114] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 367
        gunModel[115] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 125
        gunModel[116] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 125
        gunModel[117] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 125
        gunModel[118] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 125
        gunModel[119] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 125
        gunModel[120] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 125
        gunModel[121] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 125
        gunModel[122] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 125
        gunModel[123] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 125
        gunModel[124] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 125
        gunModel[125] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 367
        gunModel[126] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 367

        gunModel[0].addShapeBox(0F, -5F, -1.5F, 8, 1, 3, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 265
        gunModel[0].setRotationPoint(45F, -16F, -6F);

        gunModel[1].addShapeBox(0F, -5F, -1.5F, 8, 1, 3, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 265
        gunModel[1].setRotationPoint(45F, -16F, -6F);
        gunModel[1].rotateAngleX = 0.62831853F;

        gunModel[2].addShapeBox(0F, -5F, -1.5F, 8, 1, 3, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 265
        gunModel[2].setRotationPoint(45F, -16F, -6F);
        gunModel[2].rotateAngleX = -0.62831853F;

        gunModel[3].addShapeBox(0F, -5F, -1.5F, 8, 1, 3, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 265
        gunModel[3].setRotationPoint(45F, -16F, -6F);
        gunModel[3].rotateAngleX = 1.25663706F;

        gunModel[4].addShapeBox(0F, -5F, -1.5F, 8, 1, 3, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 265
        gunModel[4].setRotationPoint(45F, -16F, -6F);
        gunModel[4].rotateAngleX = -1.25663706F;

        gunModel[5].addShapeBox(0F, -5F, -1.5F, 8, 1, 3, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 265
        gunModel[5].setRotationPoint(45F, -16F, -6F);
        gunModel[5].rotateAngleX = 2.51327412F;

        gunModel[6].addShapeBox(0F, -5F, -1.5F, 8, 1, 3, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 265
        gunModel[6].setRotationPoint(45F, -16F, -6F);
        gunModel[6].rotateAngleX = 3.14159265F;

        gunModel[7].addShapeBox(0F, -5F, -1.5F, 8, 1, 3, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 265
        gunModel[7].setRotationPoint(45F, -16F, -6F);
        gunModel[7].rotateAngleX = 1.88495559F;

        gunModel[8].addShapeBox(0F, -5F, -1.5F, 8, 1, 3, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 265
        gunModel[8].setRotationPoint(45F, -16F, -6F);
        gunModel[8].rotateAngleX = 3.76991118F;

        gunModel[9].addShapeBox(0F, -5F, -1.5F, 8, 1, 3, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 265
        gunModel[9].setRotationPoint(45F, -16F, -6F);
        gunModel[9].rotateAngleX = 4.39822972F;

        gunModel[10].addShapeBox(0F, -5F, -1.5F, 15, 1, 3, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 265
        gunModel[10].setRotationPoint(20F, -16F, -6F);

        gunModel[11].addShapeBox(0F, -5F, -1.5F, 15, 1, 3, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 265
        gunModel[11].setRotationPoint(20F, -16F, -6F);
        gunModel[11].rotateAngleX = 0.62831853F;

        gunModel[12].addShapeBox(0F, -5F, -1.5F, 15, 1, 3, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 265
        gunModel[12].setRotationPoint(20F, -16F, -6F);
        gunModel[12].rotateAngleX = -0.62831853F;

        gunModel[13].addShapeBox(0F, -5F, -1.5F, 15, 1, 3, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 265
        gunModel[13].setRotationPoint(20F, -16F, -6F);
        gunModel[13].rotateAngleX = 1.25663706F;

        gunModel[14].addShapeBox(0F, -5F, -1.5F, 15, 1, 3, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 265
        gunModel[14].setRotationPoint(20F, -16F, -6F);
        gunModel[14].rotateAngleX = -1.25663706F;

        gunModel[15].addShapeBox(0F, -5F, -1.5F, 15, 1, 3, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 265
        gunModel[15].setRotationPoint(20F, -16F, -6F);
        gunModel[15].rotateAngleX = 2.51327412F;

        gunModel[16].addShapeBox(0F, -5F, -1.5F, 15, 1, 3, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 265
        gunModel[16].setRotationPoint(20F, -16F, -6F);
        gunModel[16].rotateAngleX = 3.14159265F;

        gunModel[17].addShapeBox(0F, -5F, -1.5F, 15, 1, 3, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 265
        gunModel[17].setRotationPoint(20F, -16F, -6F);
        gunModel[17].rotateAngleX = 1.88495559F;

        gunModel[18].addShapeBox(0F, -5F, -1.5F, 15, 1, 3, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 265
        gunModel[18].setRotationPoint(20F, -16F, -6F);
        gunModel[18].rotateAngleX = 3.76991118F;

        gunModel[19].addShapeBox(0F, -5F, -1.5F, 15, 1, 3, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 265
        gunModel[19].setRotationPoint(20F, -16F, -6F);
        gunModel[19].rotateAngleX = 4.39822972F;

        gunModel[20].addShapeBox(0F, -4F, -1F, 10, 1, 2, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 265
        gunModel[20].setRotationPoint(35F, -16F, -6F);
        gunModel[20].rotateAngleX = -1.25663706F;

        gunModel[21].addShapeBox(0F, -4F, -1F, 10, 1, 2, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 265
        gunModel[21].setRotationPoint(35F, -16F, -6F);
        gunModel[21].rotateAngleX = 0.62831853F;

        gunModel[22].addShapeBox(0F, -4F, -1F, 10, 1, 2, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 265
        gunModel[22].setRotationPoint(35F, -16F, -6F);
        gunModel[22].rotateAngleX = 1.25663706F;

        gunModel[23].addShapeBox(0F, -4F, -1F, 10, 1, 2, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 265
        gunModel[23].setRotationPoint(35F, -16F, -6F);
        gunModel[23].rotateAngleX = -0.62831853F;

        gunModel[24].addShapeBox(0F, -4F, -1F, 10, 1, 2, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 265
        gunModel[24].setRotationPoint(35F, -16F, -6F);

        gunModel[25].addShapeBox(0F, -4F, -1F, 10, 1, 2, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 265
        gunModel[25].setRotationPoint(35F, -16F, -6F);
        gunModel[25].rotateAngleX = 1.88495559F;

        gunModel[26].addShapeBox(0F, -4F, -1F, 10, 1, 2, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 265
        gunModel[26].setRotationPoint(35F, -16F, -6F);
        gunModel[26].rotateAngleX = 3.76991118F;

        gunModel[27].addShapeBox(0F, -4F, -1F, 10, 1, 2, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 265
        gunModel[27].setRotationPoint(35F, -16F, -6F);
        gunModel[27].rotateAngleX = 4.39822972F;

        gunModel[28].addShapeBox(0F, -4F, -1F, 10, 1, 2, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 265
        gunModel[28].setRotationPoint(35F, -16F, -6F);
        gunModel[28].rotateAngleX = 2.51327412F;

        gunModel[29].addShapeBox(0F, -4F, -1F, 10, 1, 2, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 265
        gunModel[29].setRotationPoint(35F, -16F, -6F);
        gunModel[29].rotateAngleX = 3.14159265F;

        gunModel[30].addShapeBox(0F, -5F, -1.5F, 1, 10, 3, 0F, 0F, -1F, -0.2F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -1F, -0.2F); // Box 265
        gunModel[30].setRotationPoint(19F, -16F, -6F);

        gunModel[31].addShapeBox(0F, -5F, -1.5F, 1, 10, 3, 0F, 0F, -1F, -0.2F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -1F, -0.2F); // Box 265
        gunModel[31].setRotationPoint(19F, -16F, -6F);
        gunModel[31].rotateAngleX = 0.62831853F;

        gunModel[32].addShapeBox(0F, -5F, -1.5F, 1, 10, 3, 0F, 0F, -1F, -0.2F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -1F, -0.2F); // Box 265
        gunModel[32].setRotationPoint(19F, -16F, -6F);
        gunModel[32].rotateAngleX = 1.88495559F;

        gunModel[33].addShapeBox(0F, -5F, -1.5F, 1, 10, 3, 0F, 0F, -1F, -0.2F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -1F, -0.2F); // Box 265
        gunModel[33].setRotationPoint(19F, -16F, -6F);
        gunModel[33].rotateAngleX = 2.51327412F;

        gunModel[34].addShapeBox(0F, -5F, -1.5F, 1, 10, 3, 0F, 0F, -1F, -0.2F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -1F, -0.2F); // Box 265
        gunModel[34].setRotationPoint(19F, -16F, -6F);
        gunModel[34].rotateAngleX = 1.25663706F;

        gunModel[35].addShapeBox(0F, 0F, 0F, 6, 10, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
        gunModel[35].setRotationPoint(13F, -21F, -8F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
        gunModel[36].setRotationPoint(0F, -21F, -8F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 301
        gunModel[37].setRotationPoint(11F, -20F, -8F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
        gunModel[38].setRotationPoint(7F, -13F, -8F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
        gunModel[39].setRotationPoint(11F, -15F, -8F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 301
        gunModel[40].setRotationPoint(2F, -13F, -8F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 301
        gunModel[41].setRotationPoint(0F, -13F, -8F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 301
        gunModel[42].setRotationPoint(0F, -20F, -8F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
        gunModel[43].setRotationPoint(0F, -15F, -8F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
        gunModel[44].setRotationPoint(-11F, -22F, -10F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
        gunModel[45].setRotationPoint(-3F, -17F, -10F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 7, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
        gunModel[46].setRotationPoint(-10F, -17F, -10F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 7, 10, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, -1F, 0F); // Box 301
        gunModel[47].setRotationPoint(-10F, -12F, -10F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 2, 10, 8, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, 3F, 0F, 0F); // Box 301
        gunModel[48].setRotationPoint(-3F, -12F, -10F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 2, 9, 8, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1.5F, -1F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, -1F, -2F); // Box 301
        gunModel[49].setRotationPoint(-12F, -12F, -10F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 2, 5, 8, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 301
        gunModel[50].setRotationPoint(-12F, -17F, -10F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 301
        gunModel[51].setRotationPoint(-3F, -14F, -10F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 15, 1, 8, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
        gunModel[52].setRotationPoint(-16F, -23F, -10F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F, 5F, 0F, -0.5F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 301
        gunModel[53].setRotationPoint(-12F, -22F, -10F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, -0.5F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 301
        gunModel[54].setRotationPoint(-17F, -23F, -10F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
        gunModel[55].setRotationPoint(0F, -17F, -6F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
        gunModel[56].setRotationPoint(7F, -18F, -6.5F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
        gunModel[57].setRotationPoint(7F, -19F, -6.5F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F); // Box 322
        gunModel[58].setRotationPoint(7F, -15F, -6.5F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
        gunModel[59].setRotationPoint(15F, -13F, -9F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
        gunModel[60].setRotationPoint(15F, -14F, -9F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 326
        gunModel[61].setRotationPoint(15F, -12F, -9F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
        gunModel[62].setRotationPoint(15F, -19F, -9F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
        gunModel[63].setRotationPoint(15F, -20F, -9F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 326
        gunModel[64].setRotationPoint(15F, -18F, -9F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 326
        gunModel[65].setRotationPoint(8F, -12F, -8.5F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 326
        gunModel[66].setRotationPoint(8F, -11.5F, -8.5F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 326
        gunModel[67].setRotationPoint(8F, -12F, -8.5F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
        gunModel[68].setRotationPoint(-1F, -21F, -8F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 326
        gunModel[69].setRotationPoint(-0.5F, -20.5F, -8.5F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 326
        gunModel[70].setRotationPoint(-0.5F, -20F, -8.5F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 326
        gunModel[71].setRotationPoint(-0.5F, -20.5F, -8.5F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 26, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
        gunModel[72].setRotationPoint(24F, -22F, -8.5F);

        gunModel[73].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 339
        gunModel[73].setRotationPoint(24F, -22F, -3.5F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
        gunModel[74].setRotationPoint(24F, -22F, -9.5F);

        gunModel[75].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
        gunModel[75].setRotationPoint(35F, -21F, -8F);

        gunModel[76].addShapeBox(0F, 0F, 0F, 28, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 339
        gunModel[76].setRotationPoint(22F, -25F, -9F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
        gunModel[77].setRotationPoint(22F, -28F, -9F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
        gunModel[78].setRotationPoint(42F, -28F, -9F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
        gunModel[79].setRotationPoint(30F, -27F, -9F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 28, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 339
        gunModel[80].setRotationPoint(22F, -25F, -4F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
        gunModel[81].setRotationPoint(22F, -28F, -4F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
        gunModel[82].setRotationPoint(42F, -28F, -4F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
        gunModel[83].setRotationPoint(30F, -27F, -4F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
        gunModel[84].setRotationPoint(41F, -26F, -4F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
        gunModel[85].setRotationPoint(41F, -26F, -9F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 326
        gunModel[86].setRotationPoint(45F, -24.5F, -3.5F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 326
        gunModel[87].setRotationPoint(45F, -24F, -3.5F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 326
        gunModel[88].setRotationPoint(45F, -24.5F, -3.5F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 301
        gunModel[89].setRotationPoint(13F, -11F, -8F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
        gunModel[90].setRotationPoint(38F, -31F, -2F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 326
        gunModel[91].setRotationPoint(25F, -24F, -3.5F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 326
        gunModel[92].setRotationPoint(25F, -23.5F, -3.5F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 326
        gunModel[93].setRotationPoint(25F, -24F, -3.5F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 326
        gunModel[94].setRotationPoint(41F, -24.5F, -3.5F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 326
        gunModel[95].setRotationPoint(41F, -24F, -3.5F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 326
        gunModel[96].setRotationPoint(41F, -24.5F, -3.5F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 26, 1, 5, 0F, 0.65F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.65F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 339
        gunModel[97].setRotationPoint(24F, -23F, -8.5F);

        gunModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
        gunModel[98].setRotationPoint(38F, -32F, -2F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
        gunModel[99].setRotationPoint(38F, -32F, 1F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 367
        gunModel[100].setRotationPoint(38F, -32F, -1F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
        gunModel[101].setRotationPoint(38F, -32F, 0F);

        gunModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
        gunModel[102].setRotationPoint(48F, -32F, -0.5F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 367
        gunModel[103].setRotationPoint(49F, -30F, -1.5F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 367
        gunModel[104].setRotationPoint(47F, -30F, -1.5F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
        gunModel[105].setRotationPoint(47F, -29F, -2F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
        gunModel[106].setRotationPoint(48F, -26F, -2F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
        gunModel[107].setRotationPoint(38F, -27F, -0.5F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 367
        gunModel[108].setRotationPoint(38F, -27F, 1F);

        gunModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
        gunModel[109].setRotationPoint(38F, -27F, -2F);

        gunModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
        gunModel[110].setRotationPoint(38F, -25.5F, -1.5F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 367
        gunModel[111].setRotationPoint(42F, -25F, 0.5F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, -0.85F, -0.5F, 0F, -0.85F, 0.5F, 0F, -1F, 0.5F); // Box 367
        gunModel[112].setRotationPoint(42F, -25F, -1.5F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 367
        gunModel[113].setRotationPoint(42F, -25F, -2F);

        gunModel[114].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F); // Box 367
        gunModel[114].setRotationPoint(39F, -25.5F, -1.5F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 125
        gunModel[115].setRotationPoint(48F, -36F, -3F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 125
        gunModel[116].setRotationPoint(39F, -27F, -3F);

        gunModel[117].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F, -2F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, -2F, -0.25F, -3.5F, -2.5F, -0.25F, 0F, -4F, -0.25F, 0F, -4F, -0.25F, -3.5F, -2.5F, -0.25F); // Box 125
        gunModel[117].setRotationPoint(40F, -35F, -3F);

        gunModel[118].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F, -2F, -2F, -0.25F, -2.5F, -3.5F, -0.25F, -2.5F, -3.5F, -0.25F, -2F, -2F, -0.25F, 0F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 125
        gunModel[118].setRotationPoint(40F, -35F, -3F);

        gunModel[119].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 125
        gunModel[119].setRotationPoint(39F, -29F, -3F);

        gunModel[120].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -1F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F); // Box 125
        gunModel[120].setRotationPoint(46F, -36F, -3F);

        gunModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 125
        gunModel[121].setRotationPoint(47F, -31F, -3F);

        gunModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 125
        gunModel[122].setRotationPoint(44.5F, -28F, -3F);

        gunModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, -1F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 125
        gunModel[123].setRotationPoint(46F, -30.5F, -3F);

        gunModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1F, 0.5F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 125
        gunModel[124].setRotationPoint(44.5F, -29F, -3F);

        gunModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
        gunModel[125].setRotationPoint(48F, -30F, -1.5F);

        gunModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
        gunModel[126].setRotationPoint(47.5F, -27.5F, -3F);


        ammoModel = new ModelRendererTurbo[9];
        ammoModel[0] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 354
        ammoModel[1] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 354
        ammoModel[2] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 354
        ammoModel[3] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 354
        ammoModel[4] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 354
        ammoModel[5] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 354
        ammoModel[6] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 354
        ammoModel[7] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 354
        ammoModel[8] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 354

        ammoModel[0].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
        ammoModel[0].setRotationPoint(39F, -17F, -9F);

        ammoModel[1].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
        ammoModel[1].setRotationPoint(39F, -19F, -9F);

        ammoModel[2].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 354
        ammoModel[2].setRotationPoint(39F, -15F, -9F);

        ammoModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
        ammoModel[3].setRotationPoint(38F, -17F, -9.5F);

        ammoModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
        ammoModel[4].setRotationPoint(38F, -19F, -9.5F);

        ammoModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F); // Box 354
        ammoModel[5].setRotationPoint(38F, -15F, -9.5F);

        ammoModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 354
        ammoModel[6].setRotationPoint(50F, -17F, -9F);

        ammoModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 354
        ammoModel[7].setRotationPoint(50F, -19F, -9F);

        ammoModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 354
        ammoModel[8].setRotationPoint(50F, -15F, -9F);


        animationType = EnumAnimationType.END_LOADED;
        translateAll(11F, -14F, 5F);
        hasArms = true;
        leftArmPos = new Vector3f(100F, 80F, 100F);
        leftArmRot = new Vector3f(80.0F, 50.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.1F, -0.55F, -0.05F);
        leftArmReloadRot = new Vector3f(80.0F, 50.0F, 0.0F);
        rightArmPos = new Vector3f(0.19F, -0.53F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(0.19F, -0.53F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
        rightHandAmmo = false;
        leftHandAmmo = true;

        fancyStance = true;
        stanceTranslate = new Vector3f(0.4D, -0.1D, 0.2D);
        stanceRotate = new Vector3f(0.0F, 0.0F, 45.0F);

        crouchZoom = -0.6F;
        zoomOffsetY = -0.025F;
        zoomOffsetZ = 0.05F;

        flipAll();
    }
}