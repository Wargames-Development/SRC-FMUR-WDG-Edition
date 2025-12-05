//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HAWK12G
// Model Creator: Dunkle Doug
// Created on: 21.04.2019 - 19:26:19
// Last changed on: 21.04.2019 - 19:26:19

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelHAWK12G extends ModelGun //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public ModelHAWK12G() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[127];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // riot shotgun Stock
        gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // riot shotgun Stock
        gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // riot shotgun Stock
        gunModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // riot shotgun Stock
        gunModel[4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // riot shotgun Stock
        gunModel[5] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // riot shotgun Stock
        gunModel[6] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // riot shotgun Stock
        gunModel[7] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // riot shotgun Stock
        gunModel[8] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // riot shotgun Stock
        gunModel[9] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // riot shotgun Stock
        gunModel[10] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // riot shotgun Stock
        gunModel[11] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // riot shotgun Stock
        gunModel[12] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // riot shotgun Stock
        gunModel[13] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // riot shotgun Stock
        gunModel[14] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // riot shotgun Stock
        gunModel[15] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // riot shotgun Stock
        gunModel[16] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // riot shotgun Stock
        gunModel[17] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // riot shotgun Stock
        gunModel[18] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // riot shotgun Stock
        gunModel[19] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // riot shotgun Stock
        gunModel[20] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // riot shotgun Stock
        gunModel[21] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // riot shotgun Stock
        gunModel[22] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // riot shotgun Stock
        gunModel[23] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // riot shotgun Stock
        gunModel[24] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // riot shotgun Stock
        gunModel[25] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // riot shotgun Stock
        gunModel[26] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // riot shotgun Stock
        gunModel[27] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // riot shotgun Stock
        gunModel[28] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // riot shotgun Stock
        gunModel[29] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // riot shotgun Stock
        gunModel[30] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // riot shotgun Stock
        gunModel[31] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // riot shotgun Stock
        gunModel[32] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // riot shotgun Stock
        gunModel[33] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // riot shotgun Stock
        gunModel[34] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // riot shotgun Stock
        gunModel[35] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // riot shotgun Stock
        gunModel[36] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 37
        gunModel[37] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 37
        gunModel[38] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 37
        gunModel[39] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 37
        gunModel[40] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 37
        gunModel[41] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 37
        gunModel[42] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 37
        gunModel[43] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 37
        gunModel[44] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 37
        gunModel[45] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 37
        gunModel[46] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 37
        gunModel[47] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 37
        gunModel[48] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 37
        gunModel[49] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 37
        gunModel[50] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 37
        gunModel[51] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 37
        gunModel[52] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 37
        gunModel[53] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 37
        gunModel[54] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 37
        gunModel[55] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 37
        gunModel[56] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 37
        gunModel[57] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 61
        gunModel[58] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 61
        gunModel[59] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 67
        gunModel[60] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 67
        gunModel[61] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 67
        gunModel[62] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 61
        gunModel[63] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // riot shotgun Stock
        gunModel[64] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // riot shotgun Stock
        gunModel[65] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // riot shotgun Stock
        gunModel[66] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // riot shotgun Stock
        gunModel[67] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // riot shotgun Stock
        gunModel[68] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // riot shotgun Stock
        gunModel[69] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // riot shotgun Stock
        gunModel[70] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 61
        gunModel[71] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 61
        gunModel[72] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 61
        gunModel[73] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 61
        gunModel[74] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 61
        gunModel[75] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 61
        gunModel[76] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 61
        gunModel[77] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 61
        gunModel[78] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 61
        gunModel[79] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 61
        gunModel[80] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 61
        gunModel[81] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 61
        gunModel[82] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 61
        gunModel[83] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 61
        gunModel[84] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 61
        gunModel[85] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 61
        gunModel[86] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 61
        gunModel[87] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 61
        gunModel[88] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 61
        gunModel[89] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 61
        gunModel[90] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 61
        gunModel[91] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 61
        gunModel[92] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 61
        gunModel[93] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 61
        gunModel[94] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Box 61
        gunModel[95] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // riot shotgun Stock
        gunModel[96] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // riot shotgun Stock
        gunModel[97] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // riot shotgun Stock
        gunModel[98] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // riot shotgun Stock
        gunModel[99] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 61
        gunModel[100] = new ModelRendererTurbo(this, 457, 233, textureX, textureY); // riot shotgun Stock
        gunModel[101] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // riot shotgun Stock
        gunModel[102] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // riot shotgun Stock
        gunModel[103] = new ModelRendererTurbo(this, 41, 193, textureX, textureY); // riot shotgun Stock
        gunModel[104] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // riot shotgun Stock
        gunModel[105] = new ModelRendererTurbo(this, 105, 201, textureX, textureY); // riot shotgun Stock
        gunModel[106] = new ModelRendererTurbo(this, 465, 241, textureX, textureY); // riot shotgun Stock
        gunModel[107] = new ModelRendererTurbo(this, 49, 241, textureX, textureY); // riot shotgun Stock
        gunModel[108] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 250
        gunModel[109] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 250
        gunModel[110] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 250
        gunModel[111] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 250
        gunModel[112] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 250
        gunModel[113] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 250
        gunModel[114] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 250
        gunModel[115] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 250
        gunModel[116] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 250
        gunModel[117] = new ModelRendererTurbo(this, 433, 209, textureX, textureY); // Box 61
        gunModel[118] = new ModelRendererTurbo(this, 25, 217, textureX, textureY); // Box 61
        gunModel[119] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Box 61
        gunModel[120] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 278
        gunModel[121] = new ModelRendererTurbo(this, 217, 317, textureX, textureY); // riot shotgun Stock
        gunModel[122] = new ModelRendererTurbo(this, 217, 337, textureX, textureY); // riot shotgun Stock
        gunModel[123] = new ModelRendererTurbo(this, 217, 357, textureX, textureY); // riot shotgun Stock
        gunModel[124] = new ModelRendererTurbo(this, 217, 377, textureX, textureY); // riot shotgun Stock
        gunModel[125] = new ModelRendererTurbo(this, 217, 397, textureX, textureY); // riot shotgun Stock
        gunModel[126] = new ModelRendererTurbo(this, 217, 417, textureX, textureY); // riot shotgun Stock

        gunModel[0].addShapeBox(0F, 0F, 0F, 9, 15, 1, 0F, 0F, -2.25F, 6F, -2F, 0F, 6F, -2F, 0F, 6F, 0F, -2.25F, 6F, 0F, -0.25F, 6F, 2F, 0F, 6F, 2F, 0F, 6F, 0F, -0.25F, 6F); // riot shotgun Stock
        gunModel[0].setRotationPoint(5F, -55F, -0.5F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F, 0F, -0.75F, -0.75F, -0.75F, 1.75F, -0.75F, -0.75F, 1.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 1.25F, 2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 1.25F, 2F); // riot shotgun Stock
        gunModel[1].setRotationPoint(5F, -58F, -3.5F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 8, 12, 1, 0F, 0F, -3F, 6F, 0F, 0.75F, 6F, 0F, 0.75F, 6F, 0F, -3F, 6F, 0F, -0.25F, 6F, 0F, -0.25F, 6F, 0F, -0.25F, 6F, 0F, -0.25F, 6F); // riot shotgun Stock
        gunModel[2].setRotationPoint(-3F, -52F, -0.5F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 9, 2, 7, 0F, 1.5F, -5.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 1.5F, -5.75F, -0.75F, -1F, 5F, 2F, 0F, 1.25F, 2F, 0F, 1.25F, 2F, -1F, 5F, 2F); // riot shotgun Stock
        gunModel[3].setRotationPoint(-4F, -58F, -3.5F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 9, 9, 7, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.25F, 3F, 0F, -0.25F, 3F, 0F, -0.25F, 3F, 0F, -0.25F, 3F); // riot shotgun Stock
        gunModel[4].setRotationPoint(-12F, -49F, -3.5F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F, 0.75F, -1.75F, -0.75F, 0F, -1.75F, 3F, 0F, -1.75F, 3F, 0.75F, -1.75F, -0.75F, -0.75F, 0F, -0.75F, 0F, -1.25F, 3F, 0F, -1.25F, 3F, -0.75F, 0F, -0.75F); // riot shotgun Stock
        gunModel[5].setRotationPoint(-8F, -42F, -3.5F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F, -0.75F, -1F, -0.75F, 0F, 0.25F, 3F, 0F, 0.25F, 3F, -0.75F, -1F, -0.75F, -4.25F, 0F, -0.75F, 4F, 0F, 3F, 4F, 0F, 3F, -4.25F, 0F, -0.75F); // riot shotgun Stock
        gunModel[6].setRotationPoint(-8F, -40F, -3.5F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F, -0.25F, 0F, -0.75F, 0F, 0F, 3F, 0F, 0F, 3F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, 3F, 0F, 0F, 3F, -0.5F, 0F, -0.75F); // riot shotgun Stock
        gunModel[7].setRotationPoint(-4F, -36F, -3.5F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F, -0.5F, 0F, -0.75F, 0F, 0F, 3F, 0F, 0F, 3F, -0.5F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.5F, 0F, 3F, -0.5F, 0F, 3F, 0.25F, 0F, -0.75F); // riot shotgun Stock
        gunModel[8].setRotationPoint(-4F, -33F, -3.5F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 5, 15, 7, 0F, -0.75F, 0F, -0.75F, 0.5F, 0F, 3F, 0.5F, 0F, 3F, -0.75F, 0F, -0.75F, 8.75F, 0F, -0.75F, -8.75F, 0F, 3F, -8.75F, 0F, 3F, 8.75F, 0F, -0.75F); // riot shotgun Stock
        gunModel[9].setRotationPoint(-5F, -30F, -3.5F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 5, 7, 7, 0F, -0.25F, 0F, -0.75F, 0.25F, 0F, 3F, 0.25F, 0F, 3F, -0.25F, 0F, -0.75F, 3.5F, 0F, -0.75F, -3.5F, 1.5F, 3F, -3.5F, 1.5F, 3F, 3.5F, 0F, -0.75F); // riot shotgun Stock
        gunModel[10].setRotationPoint(-14F, -15F, -3.5F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 5, 22, 7, 0F, -8.75F, 0F, 3F, 8.75F, 0F, -0.75F, 8.75F, 0F, -0.75F, -8.75F, 0F, 3F, 1F, 0F, 3F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 1F, 0F, 3F); // riot shotgun Stock
        gunModel[11].setRotationPoint(-1F, -26F, -3.5F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F, -2.5F, 0F, 3F, 2.5F, 0F, -0.75F, 2.5F, 0F, -0.75F, -2.5F, 0F, 3F, 0.25F, 0F, 3F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0.25F, 0F, 3F); // riot shotgun Stock
        gunModel[12].setRotationPoint(8F, -28F, -3.5F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F, -1.25F, 0F, 3F, 1.25F, 0F, -0.75F, 1.25F, 0F, -0.75F, -1.25F, 0F, 3F, 0.5F, 0F, 3F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0.5F, 0F, 3F); // riot shotgun Stock
        gunModel[13].setRotationPoint(11F, -29F, -3.5F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F, -0.75F, 0F, 3F, 0.75F, 0F, -0.75F, 0.75F, 0F, -0.75F, -0.75F, 0F, 3F, -0.25F, 0F, 3F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.25F, 0F, 3F); // riot shotgun Stock
        gunModel[14].setRotationPoint(12F, -30F, -3.5F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F, 0.75F, 0F, 3F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0.75F, 0F, 3F, -0.75F, 0F, 3F, 0.75F, 0F, -0.75F, 0.75F, 0F, -0.75F, -0.75F, 0F, 3F); // riot shotgun Stock
        gunModel[15].setRotationPoint(12F, -33F, -3.5F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F, 0F, 0F, 3F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, 3F, -0.25F, 0F, 3F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.25F, 0F, 3F); // riot shotgun Stock
        gunModel[16].setRotationPoint(11F, -37F, -3.5F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F, 0F, -0.75F, 3F, -2F, -0.75F, -0.75F, -2F, -0.75F, -0.75F, 0F, -0.75F, 3F, 0F, 0F, 3F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, 3F); // riot shotgun Stock
        gunModel[17].setRotationPoint(11F, -41F, -3.5F);

        gunModel[18].addShapeBox(0F, 0F, 0F, 5, 5, 7, 0F, 0F, 0F, 3F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 3F, 0F, -2.75F, 3F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0F, -2.75F, 3F); // riot shotgun Stock
        gunModel[18].setRotationPoint(-2F, -4F, -3.5F);

        gunModel[19].addShapeBox(0F, 0F, 0F, 5, 5, 7, 0F, 0F, -0.25F, 3F, 0.5F, -2.25F, -0.75F, 0.5F, -2.25F, -0.75F, 0F, -0.25F, 3F, 0F, -1F, -0.75F, -1F, -0.5F, -0.75F, -1F, -0.5F, -0.75F, 0F, -1F, -0.75F); // riot shotgun Stock
        gunModel[19].setRotationPoint(-2F, -2F, -3.5F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 11, 4, 13, 0F, 3F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 3F, 0.25F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // riot shotgun Stock
        gunModel[20].setRotationPoint(0F, -40F, -6.5F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 10, 3, 13, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // riot shotgun Stock
        gunModel[21].setRotationPoint(1F, -36F, -6.5F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 4, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.5F, -1F, 0F); // riot shotgun Stock
        gunModel[22].setRotationPoint(1F, -33F, -6.5F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 4, 15, 13, 0F, 0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.5F, 0F, 0F, 9.75F, 0F, 0F, -9.75F, 6.5F, 0F, -9.75F, 6.5F, 0F, 9.75F, 0F, 0F); // riot shotgun Stock
        gunModel[23].setRotationPoint(1F, -30F, -6.5F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 7, 3, 13, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F); // riot shotgun Stock
        gunModel[24].setRotationPoint(5F, -33F, -6.5F);

        gunModel[25].addShapeBox(0F, 0F, 0F, 7, 1, 13, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // riot shotgun Stock
        gunModel[25].setRotationPoint(5F, -30F, -6.5F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 6, 1, 13, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // riot shotgun Stock
        gunModel[26].setRotationPoint(5F, -29F, -6.5F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 6, 2, 13, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 0F, -1F, 0F); // riot shotgun Stock
        gunModel[27].setRotationPoint(5F, -28F, -6.5F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 4, 20, 13, 0F, -4F, 1F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, -4F, 1F, 0F, 5.75F, -2.5F, 0F, -7F, 2F, 0F, -7F, 2F, 0F, 5.75F, -2.5F, 0F); // riot shotgun Stock
        gunModel[28].setRotationPoint(1F, -26F, -6.5F);

        gunModel[29].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F, 0.5F, 0F, -0.75F, -0.5F, -1.5F, 3F, -0.5F, -1.5F, 3F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 2.25F, -0.75F, -0.5F, 2.25F, -0.75F, 0F, 0F, -0.75F); // riot shotgun Stock
        gunModel[29].setRotationPoint(-17F, -8F, -3.5F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 10, 4, 7, 0F, 0.5F, 0.5F, 3F, 0F, -4.25F, 3F, 0F, -4.25F, 3F, 0.5F, 0.5F, 3F, 0.5F, 0.25F, -0.75F, 0F, 4F, -0.75F, 0F, 4F, -0.75F, 0.5F, 0.25F, -0.75F); // riot shotgun Stock
        gunModel[30].setRotationPoint(-12F, -6F, -3.5F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 10, 10, 13, 0F, -3.25F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, -3.25F, 0F, 0F, 0.5F, -1.5F, 0F, 0F, 3.25F, 0F, 0F, 3.25F, 0F, 0.5F, -1.5F, 0F); // riot shotgun Stock
        gunModel[31].setRotationPoint(-12F, -15F, -6.5F);

        gunModel[32].addShapeBox(0F, 0F, 0F, 37, 13, 13, 0F, 4F, 2F, 0F, 0F, 0.215F, 0F, 0F, 0.215F, 0F, 4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // riot shotgun Stock
        gunModel[32].setRotationPoint(16F, -53F, -6.5F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 46, 6, 13, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // riot shotgun Stock
        gunModel[33].setRotationPoint(12F, -59F, -6.5F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 12, 2, 13, 0F, 0.75F, -3.25F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0.75F, -3.25F, -3.75F, 0F, 4F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 4F, -1F); // riot shotgun Stock
        gunModel[34].setRotationPoint(12F, -63F, -6.5F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 62, 2, 13, 0F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // riot shotgun Stock
        gunModel[35].setRotationPoint(24F, -63F, -6.5F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 31, 9, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Box 37
        gunModel[36].setRotationPoint(53F, -39F, -6F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 5, 10, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
        gunModel[37].setRotationPoint(48F, -34.5F, -3F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 37
        gunModel[38].setRotationPoint(17F, -37F, -2F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 31, 3, 4, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
        gunModel[39].setRotationPoint(16F, -40F, -2F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 37
        gunModel[40].setRotationPoint(18F, -33F, -2F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0.75F, 0F, 0F, 3.25F, 0F, 0F, 3.25F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 37
        gunModel[41].setRotationPoint(18F, -35F, -2F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -1F, 0F, 0F); // Box 37
        gunModel[42].setRotationPoint(19F, -32F, -2F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 20, 2, 4, 0F, -4.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 37
        gunModel[43].setRotationPoint(19F, -27F, -2F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F); // Box 37
        gunModel[44].setRotationPoint(35F, -29F, -2F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 2, 10, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 37
        gunModel[45].setRotationPoint(37F, -37F, -2F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 37
        gunModel[46].setRotationPoint(35F, -37F, -2F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 37
        gunModel[47].setRotationPoint(39F, -37F, -2F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
        gunModel[48].setRotationPoint(48F, -36.5F, -3F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
        gunModel[49].setRotationPoint(51F, -24.5F, -1.5F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
        gunModel[50].setRotationPoint(47F, -40F, -2F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 37
        gunModel[51].setRotationPoint(47F, -39F, -2F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
        gunModel[52].setRotationPoint(39F, -34F, -2F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 37
        gunModel[53].setRotationPoint(39F, -31F, -2F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -1.75F, 0F, 0F); // Box 37
        gunModel[54].setRotationPoint(39F, -29F, -2F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 37
        gunModel[55].setRotationPoint(51F, -20.5F, -1.5F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, -1.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F); // Box 37
        gunModel[56].setRotationPoint(20F, -29F, -2F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 92, 3, 9, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 61
        gunModel[57].setRotationPoint(89F, -58.5F, -4.5F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 92, 3, 9, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -2.75F, 0F, -0.5F, -3.25F, 0F, -0.5F, -3.25F, 0F, 0.5F, -2.75F); // Box 61
        gunModel[58].setRotationPoint(89F, -55.5F, -4.5F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 67
        gunModel[59].setRotationPoint(25F, -37F, -0.5F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 67
        gunModel[60].setRotationPoint(25F, -34F, -0.5F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 67
        gunModel[61].setRotationPoint(25F, -30.5F, -0.5F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 92, 3, 9, 0F, 0F, 0.5F, -2.75F, 0F, -0.5F, -3.25F, 0F, -0.5F, -3.25F, 0F, 0.5F, -2.75F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 61
        gunModel[62].setRotationPoint(89F, -61.5F, -4.5F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 25, 12, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // riot shotgun Stock
        gunModel[63].setRotationPoint(58F, -51F, -6.5F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 3, 9, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // riot shotgun Stock
        gunModel[64].setRotationPoint(83F, -59F, -6.5F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 25, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // riot shotgun Stock
        gunModel[65].setRotationPoint(58F, -59F, 2.5F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // riot shotgun Stock
        gunModel[66].setRotationPoint(81F, -59F, -6.5F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // riot shotgun Stock
        gunModel[67].setRotationPoint(81F, -53F, -6.5F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // riot shotgun Stock
        gunModel[68].setRotationPoint(58F, -59F, -6.5F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // riot shotgun Stock
        gunModel[69].setRotationPoint(58F, -53F, -6.5F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
        gunModel[70].setRotationPoint(181F, -58.5F, -4.5F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
        gunModel[71].setRotationPoint(181F, -61.5F, -4.5F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 61
        gunModel[72].setRotationPoint(181F, -55.5F, -4.5F);

        gunModel[73].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 61
        gunModel[73].setRotationPoint(181F, -47F, -6F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 61
        gunModel[74].setRotationPoint(181F, -51F, -6F);

        gunModel[75].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, -4F); // Box 61
        gunModel[75].setRotationPoint(181F, -43F, -6F);

        gunModel[76].addShapeBox(0F, 0F, 0F, 95, 3, 12, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 61
        gunModel[76].setRotationPoint(86F, -46.5F, -6F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 95, 3, 12, 0F, 0F, -1F, -4.5F, 0F, -1F, -4.5F, 0F, -1F, -4.5F, 0F, -1F, -4.5F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F); // Box 61
        gunModel[77].setRotationPoint(86F, -50F, -6F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 95, 3, 12, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -1F, -4.5F, 0F, -1F, -4.5F, 0F, -1F, -4.5F, 0F, -1F, -4.5F); // Box 61
        gunModel[78].setRotationPoint(86F, -43F, -6F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 80, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
        gunModel[79].setRotationPoint(86F, -51F, -1.5F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 61
        gunModel[80].setRotationPoint(181F, -52F, -1.5F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
        gunModel[81].setRotationPoint(185F, -46.5F, -4.5F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
        gunModel[82].setRotationPoint(185F, -49.5F, -4.5F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 61
        gunModel[83].setRotationPoint(185F, -43.5F, -4.5F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, -1.5F, -0.5F, 0F, -1.5F, -0.5F); // Box 61
        gunModel[84].setRotationPoint(190F, -46.5F, -4.5F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, -1.5F, -0.5F, 1F, -1.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 1F, -1.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 61
        gunModel[85].setRotationPoint(190F, -46.5F, -0.5F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F, 0F, -0.5F, -1.5F, 1F, -0.5F, -1.5F, 1F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 61
        gunModel[86].setRotationPoint(190F, -45.5F, -1.5F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 1F, -0.5F, -1.5F, 1F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 61
        gunModel[87].setRotationPoint(190F, -49.5F, -1.5F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, -4.5F, -0.5F, 1F, -4.5F, -0.5F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 1.5F, -0.5F, 1F, 1.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 61
        gunModel[88].setRotationPoint(190F, -49.5F, -0.5F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, 1.5F, -0.5F, 1F, 1.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 1F, -4.5F, -0.5F, -0.5F, 0F, -3F, 0F, 0F, -3F); // Box 61
        gunModel[89].setRotationPoint(190F, -43.5F, -0.5F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, 1F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 1.5F, -0.5F, 0F, 1.5F, -0.5F); // Box 61
        gunModel[90].setRotationPoint(190F, -49.5F, -4.5F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0F, -3F, -0.5F, 0F, -3F, 1F, -4.5F, -0.5F, 0F, -4.5F, -0.5F); // Box 61
        gunModel[91].setRotationPoint(190F, -43.5F, -4.5F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 28, 3, 9, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 61
        gunModel[92].setRotationPoint(186F, -58.5F, -4.5F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 28, 3, 9, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 61
        gunModel[93].setRotationPoint(186F, -61.5F, -4.5F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 28, 3, 9, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F); // Box 61
        gunModel[94].setRotationPoint(186F, -55.5F, -4.5F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 3, 10, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // riot shotgun Stock
        gunModel[95].setRotationPoint(83F, -50F, -6.5F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 5, 14, 13, 0F, 0F, 0.215F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.215F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // riot shotgun Stock
        gunModel[96].setRotationPoint(53F, -53F, -6.5F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // riot shotgun Stock
        gunModel[97].setRotationPoint(83F, -40F, -6.5F);

        gunModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // riot shotgun Stock
        gunModel[98].setRotationPoint(52F, -40F, -6.5F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 80, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
        gunModel[99].setRotationPoint(86F, -51F, 0.5F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 3, 13, 7, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.25F, 3F, 0F, -0.25F, 3F, 0F, -0.25F, 3F, 0F, -0.25F, 3F); // riot shotgun Stock
        gunModel[100].setRotationPoint(-15F, -52F, -3.5F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F, 0F, 0F, -0.75F, -2.5F, 0.25F, -0.75F, -2.5F, 0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // riot shotgun Stock
        gunModel[101].setRotationPoint(-8F, -52F, -3.5F);

        gunModel[102].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F, -1F, 3F, -0.75F, -2F, 0F, -0.75F, -2F, 0F, -0.75F, -1F, 3F, -0.75F, -0.667F, -3F, 0.5F, -2F, 0F, 2F, -2F, 0F, 2F, -0.667F, -3F, 0.5F); // riot shotgun Stock
        gunModel[102].setRotationPoint(-12F, -52F, -3.5F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F, 0F, 0F, 3F, -4F, 0F, 3F, -4F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // riot shotgun Stock
        gunModel[103].setRotationPoint(-12F, -52F, -3.5F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F, 0F, 0F, 3F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // riot shotgun Stock
        gunModel[104].setRotationPoint(-13F, -55F, -3.5F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 2, 3, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // riot shotgun Stock
        gunModel[105].setRotationPoint(-15F, -55F, -6.5F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 3, 15, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F); // riot shotgun Stock
        gunModel[106].setRotationPoint(-18F, -55F, -6.5F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 1, 15, 13, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // riot shotgun Stock
        gunModel[107].setRotationPoint(-19F, -55F, -6.5F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 250
        gunModel[108].setRotationPoint(182.5F, -68F, 2.5F);

        gunModel[109].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 250
        gunModel[109].setRotationPoint(182.5F, -65F, -1F);

        gunModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F); // Box 250
        gunModel[110].setRotationPoint(182.5F, -65F, 1.5F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
        gunModel[111].setRotationPoint(182.5F, -70.5F, -1F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 250
        gunModel[112].setRotationPoint(183F, -67F, -0.5F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
        gunModel[113].setRotationPoint(182.5F, -68F, -3.5F);

        gunModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 250
        gunModel[114].setRotationPoint(182.5F, -65F, -3.5F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 250
        gunModel[115].setRotationPoint(182.5F, -70F, 1.5F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 250
        gunModel[116].setRotationPoint(182.5F, -70F, -3.5F);

        gunModel[117].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 61
        gunModel[117].setRotationPoint(86F, -59F, -6F);

        gunModel[118].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 61
        gunModel[118].setRotationPoint(86F, -63F, -6F);

        gunModel[119].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F); // Box 61
        gunModel[119].setRotationPoint(86F, -55F, -6F);

        gunModel[120].addShapeBox(0F, 0F, 0F, 100, 100, 1, 0F, -30F, -30F, 0F, -30F, -30F, 0F, -30F, -30F, -0.8F, -30F, -30F, -0.8F, -30F, -30F, 0F, -30F, -30F, 0F, -30F, -30F, -0.8F, -30F, -30F, -0.8F); // Box 278
        gunModel[120].setRotationPoint(-20F, -102F, 6.5F);

        gunModel[121].addShapeBox(0F, 0F, 0F, 62, 2, 13, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // riot shotgun Stock
        gunModel[121].setRotationPoint(24F, -61F, -6.5F);

        gunModel[122].addShapeBox(0F, 0F, 0F, 12, 2, 13, 0F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // riot shotgun Stock
        gunModel[122].setRotationPoint(12F, -61F, -6.5F);

        gunModel[123].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F, 0F, -1.25F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, -1.25F, 2F, 0F, 1.25F, 3F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 1.25F, 3F); // riot shotgun Stock
        gunModel[123].setRotationPoint(5F, -56F, -3.5F);

        gunModel[124].addShapeBox(0F, 0F, 0F, 9, 2, 7, 0F, -1F, -5F, 2F, 0F, -1.25F, 2F, 0F, -1.25F, 2F, -1F, -5F, 2F, -1F, 5F, 3F, 0F, 1.25F, 3F, 0F, 1.25F, 3F, -1F, 5F, 3F); // riot shotgun Stock
        gunModel[124].setRotationPoint(-4F, -56F, -3.5F);

        gunModel[125].addShapeBox(0F, 0F, 0F, 5, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // riot shotgun Stock
        gunModel[125].setRotationPoint(-8F, -51F, -5.5F);

        gunModel[126].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F, -0.667F, 4F, 0.5F, -2F, 1F, 2F, -2F, 1F, 2F, -0.667F, 4F, 0.5F, 0F, -3F, 3F, -2F, 0F, 3F, -2F, 0F, 3F, 0F, -3F, 3F); // riot shotgun Stock
        gunModel[126].setRotationPoint(-12F, -50F, -3.5F);


        defaultScopeModel = new ModelRendererTurbo[23];
        defaultScopeModel[0] = new ModelRendererTurbo(this, 65, 281, textureX, textureY); // Box 234
        defaultScopeModel[1] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 234
        defaultScopeModel[2] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 234
        defaultScopeModel[3] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 234
        defaultScopeModel[4] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 234
        defaultScopeModel[5] = new ModelRendererTurbo(this, 113, 281, textureX, textureY); // Box 234
        defaultScopeModel[6] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 234
        defaultScopeModel[7] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 234
        defaultScopeModel[8] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 234
        defaultScopeModel[9] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 234
        defaultScopeModel[10] = new ModelRendererTurbo(this, 393, 209, textureX, textureY); // Box 244
        defaultScopeModel[11] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 244
        defaultScopeModel[12] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 244
        defaultScopeModel[13] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 244
        defaultScopeModel[14] = new ModelRendererTurbo(this, 161, 281, textureX, textureY); // Box 244
        defaultScopeModel[15] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 250
        defaultScopeModel[16] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 250
        defaultScopeModel[17] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 250
        defaultScopeModel[18] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 250
        defaultScopeModel[19] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 250
        defaultScopeModel[20] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 250
        defaultScopeModel[21] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 250
        defaultScopeModel[22] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 250

        defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 20, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 234
        defaultScopeModel[0].setRotationPoint(33F, -67F, 2.25F);

        defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, -0.5F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.5F, 0F, 0F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F); // Box 234
        defaultScopeModel[1].setRotationPoint(47F, -70F, 2.25F);

        defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 2F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 2F, -0.5F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F); // Box 234
        defaultScopeModel[2].setRotationPoint(36F, -70F, 2.25F);

        defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
        defaultScopeModel[3].setRotationPoint(34F, -70.5F, 2.25F);

        defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F); // Box 234
        defaultScopeModel[4].setRotationPoint(47.5F, -71F, 2.25F);

        defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 20, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 234
        defaultScopeModel[5].setRotationPoint(33F, -67F, -3.25F);

        defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, -0.5F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.5F, 0F, 0F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F); // Box 234
        defaultScopeModel[6].setRotationPoint(47F, -70F, -3.25F);

        defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 2F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 2F, -0.5F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F); // Box 234
        defaultScopeModel[7].setRotationPoint(36F, -70F, -3.25F);

        defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
        defaultScopeModel[8].setRotationPoint(34F, -70.5F, -3.25F);

        defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F); // Box 234
        defaultScopeModel[9].setRotationPoint(47.5F, -71F, -3.25F);

        defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
        defaultScopeModel[10].setRotationPoint(37F, -64.3F, -3F);

        defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
        defaultScopeModel[11].setRotationPoint(38F, -64.8F, -3F);

        defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
        defaultScopeModel[12].setRotationPoint(39F, -65F, -3F);

        defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 244
        defaultScopeModel[13].setRotationPoint(38F, -65.2F, -1F);

        defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 20, 1, 5, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
        defaultScopeModel[14].setRotationPoint(33F, -64F, -2.25F);

        defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
        defaultScopeModel[15].setRotationPoint(41F, -68F, -2.5F);

        defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 250
        defaultScopeModel[16].setRotationPoint(41F, -68F, 1.5F);

        defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 250
        defaultScopeModel[17].setRotationPoint(41F, -66F, -1.5F);

        defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 250
        defaultScopeModel[18].setRotationPoint(41F, -69F, -1.5F);

        defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 250
        defaultScopeModel[19].setRotationPoint(41F, -69F, 0.5F);

        defaultScopeModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 250
        defaultScopeModel[20].setRotationPoint(41F, -69F, -2.5F);

        defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 250
        defaultScopeModel[21].setRotationPoint(41F, -66F, 0.5F);

        defaultScopeModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 250
        defaultScopeModel[22].setRotationPoint(41F, -66F, -2.5F);


        defaultStockModel = new ModelRendererTurbo[29];
        defaultStockModel[0] = new ModelRendererTurbo(this, 81, 249, textureX, textureY); // riot shotgun Stock
        defaultStockModel[1] = new ModelRendererTurbo(this, 49, 273, textureX, textureY); // Box 204
        defaultStockModel[2] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 205
        defaultStockModel[3] = new ModelRendererTurbo(this, 113, 257, textureX, textureY); // Box 204
        defaultStockModel[4] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 204
        defaultStockModel[5] = new ModelRendererTurbo(this, 233, 209, textureX, textureY); // Box 208
        defaultStockModel[6] = new ModelRendererTurbo(this, 217, 257, textureX, textureY); // Box 208
        defaultStockModel[7] = new ModelRendererTurbo(this, 249, 257, textureX, textureY); // Box 208
        defaultStockModel[8] = new ModelRendererTurbo(this, 273, 209, textureX, textureY); // Box 208
        defaultStockModel[9] = new ModelRendererTurbo(this, 313, 209, textureX, textureY); // Box 208
        defaultStockModel[10] = new ModelRendererTurbo(this, 353, 209, textureX, textureY); // Box 208
        defaultStockModel[11] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 204
        defaultStockModel[12] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 204
        defaultStockModel[13] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 204
        defaultStockModel[14] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 204
        defaultStockModel[15] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 218
        defaultStockModel[16] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Box 218
        defaultStockModel[17] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 218
        defaultStockModel[18] = new ModelRendererTurbo(this, 113, 265, textureX, textureY); // Box 205
        defaultStockModel[19] = new ModelRendererTurbo(this, 457, 273, textureX, textureY); // Box 205
        defaultStockModel[20] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 205
        defaultStockModel[21] = new ModelRendererTurbo(this, 49, 281, textureX, textureY); // Box 205
        defaultStockModel[22] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 205
        defaultStockModel[23] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 205
        defaultStockModel[24] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 205
        defaultStockModel[25] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 205
        defaultStockModel[26] = new ModelRendererTurbo(this, 169, 209, textureX, textureY); // Box 204
        defaultStockModel[27] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 204
        defaultStockModel[28] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 204

        defaultStockModel[0].addShapeBox(0F, 0F, 0F, 5, 13, 9, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // riot shotgun Stock
        defaultStockModel[0].setRotationPoint(-24F, -53F, -4.5F);

        defaultStockModel[1].addShapeBox(0F, 0F, 0F, 75, 1, 6, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5F, 0F); // Box 204
        defaultStockModel[1].setRotationPoint(-99F, -50F, -3F);

        defaultStockModel[2].addShapeBox(0F, 0F, 0F, 40, 1, 3, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 6F, 0F); // Box 205
        defaultStockModel[2].setRotationPoint(-64F, -46F, -1.5F);

        defaultStockModel[3].addShapeBox(0F, 0F, 0F, 40, 1, 6, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, 0F); // Box 204
        defaultStockModel[3].setRotationPoint(-64F, -42F, -3F);

        defaultStockModel[4].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, 0F); // Box 204
        defaultStockModel[4].setRotationPoint(-73F, -39F, -3F);

        defaultStockModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
        defaultStockModel[5].setRotationPoint(-100F, -47F, -4F);

        defaultStockModel[6].addShapeBox(0F, 0F, 0F, 7, 42, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
        defaultStockModel[6].setRotationPoint(-107F, -45F, -4F);

        defaultStockModel[7].addShapeBox(0F, 0F, 0F, 1, 42, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
        defaultStockModel[7].setRotationPoint(-100F, -45F, -4F);

        defaultStockModel[8].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
        defaultStockModel[8].setRotationPoint(-107F, -47F, -4F);

        defaultStockModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 208
        defaultStockModel[9].setRotationPoint(-100F, -3F, -4F);

        defaultStockModel[10].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 208
        defaultStockModel[10].setRotationPoint(-107F, -3F, -4F);

        defaultStockModel[11].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, 0F); // Box 204
        defaultStockModel[11].setRotationPoint(54F, -36F, -3F);

        defaultStockModel[12].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 7F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 7F, 0F); // Box 204
        defaultStockModel[12].setRotationPoint(-81F, -36F, -3F);

        defaultStockModel[13].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 13F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 13F, 0F); // Box 204
        defaultStockModel[13].setRotationPoint(-91F, -30F, -3F);

        defaultStockModel[14].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 15.5F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 15.5F, -1F); // Box 204
        defaultStockModel[14].setRotationPoint(-99F, -18F, -3F);

        defaultStockModel[15].addShapeBox(0F, 0F, 0F, 1, 13, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 218
        defaultStockModel[15].setRotationPoint(-19F, -53.5F, -7.5F);

        defaultStockModel[16].addShapeBox(0F, 0F, 0F, 1, 13, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
        defaultStockModel[16].setRotationPoint(-20F, -53.5F, -7.5F);

        defaultStockModel[17].addShapeBox(0F, 0F, 0F, 1, 13, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 218
        defaultStockModel[17].setRotationPoint(-21F, -53.5F, -7.5F);

        defaultStockModel[18].addShapeBox(0F, 0F, 0F, 35, 1, 3, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F); // Box 205
        defaultStockModel[18].setRotationPoint(-99F, -44F, -1.5F);

        defaultStockModel[19].addShapeBox(0F, 0F, 0F, 24, 1, 3, 0F, 0F, 1F, 0F, 11F, 4F, 0F, 11F, 4F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 4F, 0F); // Box 205
        defaultStockModel[19].setRotationPoint(-99F, -35F, -1.5F);

        defaultStockModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, 1F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 205
        defaultStockModel[20].setRotationPoint(-99F, -41F, -1.5F);

        defaultStockModel[21].addShapeBox(0F, 0F, 0F, 4, 17, 3, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 10F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 10F, 0F); // Box 205
        defaultStockModel[21].setRotationPoint(-99F, -29F, -1.5F);

        defaultStockModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F); // Box 205
        defaultStockModel[22].setRotationPoint(-66F, -41F, -1.5F);

        defaultStockModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F); // Box 205
        defaultStockModel[23].setRotationPoint(-66F, -44.5F, -1.5F);

        defaultStockModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F); // Box 205
        defaultStockModel[24].setRotationPoint(-97F, -38F, -1.5F);

        defaultStockModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F); // Box 205
        defaultStockModel[25].setRotationPoint(-97F, -42F, -1.5F);

        defaultStockModel[26].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F, 0F, -12F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -12F, 0F, 0F, 13F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 13F, 0F); // Box 204
        defaultStockModel[26].setRotationPoint(-91F, -33F, -1.5F);

        defaultStockModel[27].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 204
        defaultStockModel[27].setRotationPoint(-81F, -33F, -1.5F);

        defaultStockModel[28].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F, 0F, -8F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -8F, 0F, 0F, 10F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 10F, 0F); // Box 204
        defaultStockModel[28].setRotationPoint(-95F, -22F, -1.5F);


        ammoModel = new ModelRendererTurbo[15];
        ammoModel[0] = new ModelRendererTurbo(this, 273, 233, textureX, textureY); // Box 170
        ammoModel[1] = new ModelRendererTurbo(this, 345, 233, textureX, textureY); // Box 170
        ammoModel[2] = new ModelRendererTurbo(this, 361, 233, textureX, textureY); // Box 170
        ammoModel[3] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Box 170
        ammoModel[4] = new ModelRendererTurbo(this, 401, 233, textureX, textureY); // Box 170
        ammoModel[5] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 170
        ammoModel[6] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 170
        ammoModel[7] = new ModelRendererTurbo(this, 249, 185, textureX, textureY); // Box 170
        ammoModel[8] = new ModelRendererTurbo(this, 425, 233, textureX, textureY); // Box 170
        ammoModel[9] = new ModelRendererTurbo(this, 441, 233, textureX, textureY); // Box 170
        ammoModel[10] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 170
        ammoModel[11] = new ModelRendererTurbo(this, 25, 241, textureX, textureY); // Box 170
        ammoModel[12] = new ModelRendererTurbo(this, 265, 185, textureX, textureY); // Box 170
        ammoModel[13] = new ModelRendererTurbo(this, 305, 185, textureX, textureY); // Box 170
        ammoModel[14] = new ModelRendererTurbo(this, 321, 185, textureX, textureY); // Box 170

        ammoModel[0].addShapeBox(-14F, 0F, -3F, 28, 59, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
        ammoModel[0].setRotationPoint(67.5F, -41F, 0F);
        ammoModel[0].rotateAngleZ = 0.06981317F;

        ammoModel[1].addShapeBox(-14F, 0F, 3F, 4, 59, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
        ammoModel[1].setRotationPoint(67.5F, -41F, 0F);
        ammoModel[1].rotateAngleZ = 0.06981317F;

        ammoModel[2].addShapeBox(10F, 0F, 3F, 4, 59, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
        ammoModel[2].setRotationPoint(67.5F, -41F, 0F);
        ammoModel[2].rotateAngleZ = 0.06981317F;

        ammoModel[3].addShapeBox(-8F, 0F, 3F, 6, 59, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 170
        ammoModel[3].setRotationPoint(67.5F, -41F, 0F);
        ammoModel[3].rotateAngleZ = 0.06981317F;

        ammoModel[4].addShapeBox(2F, 0F, 3F, 6, 59, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        ammoModel[4].setRotationPoint(67.5F, -41F, 0F);
        ammoModel[4].rotateAngleZ = 0.06981317F;

        ammoModel[5].addShapeBox(-10F, 52F, 3F, 3, 8, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        ammoModel[5].setRotationPoint(67.5F, -42F, 0F);
        ammoModel[5].rotateAngleZ = 0.06981317F;

        ammoModel[6].addShapeBox(7.5F, 52F, 3F, 3, 8, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        ammoModel[6].setRotationPoint(67.5F, -42F, 0F);
        ammoModel[6].rotateAngleZ = 0.06981317F;

        ammoModel[7].addShapeBox(-2F, 52F, 3F, 4, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
        ammoModel[7].setRotationPoint(67.5F, -42F, 0F);
        ammoModel[7].rotateAngleZ = 0.06981317F;

        ammoModel[8].addShapeBox(-14F, 0F, -5F, 4, 59, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
        ammoModel[8].setRotationPoint(67.5F, -41F, 0F);
        ammoModel[8].rotateAngleZ = 0.06981317F;

        ammoModel[9].addShapeBox(10F, 0F, -5F, 4, 59, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
        ammoModel[9].setRotationPoint(67.5F, -41F, 0F);
        ammoModel[9].rotateAngleZ = 0.06981317F;

        ammoModel[10].addShapeBox(-8F, 0F, -5F, 6, 59, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 170
        ammoModel[10].setRotationPoint(67.5F, -41F, 0F);
        ammoModel[10].rotateAngleZ = 0.06981317F;

        ammoModel[11].addShapeBox(2F, 0F, -5F, 6, 59, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        ammoModel[11].setRotationPoint(67.5F, -41F, 0F);
        ammoModel[11].rotateAngleZ = 0.06981317F;

        ammoModel[12].addShapeBox(-10F, 52F, -5F, 3, 8, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        ammoModel[12].setRotationPoint(67.5F, -42F, 0F);
        ammoModel[12].rotateAngleZ = 0.06981317F;

        ammoModel[13].addShapeBox(7.5F, 52F, -5F, 3, 8, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        ammoModel[13].setRotationPoint(67.5F, -42F, 0F);
        ammoModel[13].rotateAngleZ = 0.06981317F;

        ammoModel[14].addShapeBox(-2F, 52F, -5F, 4, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
        ammoModel[14].setRotationPoint(67.5F, -42F, 0F);
        ammoModel[14].rotateAngleZ = 0.06981317F;


        slideModel = new ModelRendererTurbo[2];
        slideModel[0] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // riot shotgun Stock
        slideModel[1] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // riot shotgun Stock

        slideModel[0].addShapeBox(0F, 0F, 0F, 25, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // riot shotgun Stock
        slideModel[0].setRotationPoint(58F, -56F, -5.5F);

        slideModel[1].addShapeBox(0F, 0F, 0F, 25, 3, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // riot shotgun Stock
        slideModel[1].setRotationPoint(58F, -59F, -5.5F);


        pumpModel = new ModelRendererTurbo[64];
        pumpModel[0] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 61
        pumpModel[1] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 61
        pumpModel[2] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 61
        pumpModel[3] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 61
        pumpModel[4] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 61
        pumpModel[5] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 61
        pumpModel[6] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 61
        pumpModel[7] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Box 61
        pumpModel[8] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 61
        pumpModel[9] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 61
        pumpModel[10] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 61
        pumpModel[11] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 61
        pumpModel[12] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Box 61
        pumpModel[13] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 61
        pumpModel[14] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 61
        pumpModel[15] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Box 61
        pumpModel[16] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 61
        pumpModel[17] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 61
        pumpModel[18] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Box 61
        pumpModel[19] = new ModelRendererTurbo(this, 393, 169, textureX, textureY); // Box 61
        pumpModel[20] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 61
        pumpModel[21] = new ModelRendererTurbo(this, 441, 169, textureX, textureY); // Box 61
        pumpModel[22] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 61
        pumpModel[23] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 61
        pumpModel[24] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 61
        pumpModel[25] = new ModelRendererTurbo(this, 33, 177, textureX, textureY); // Box 61
        pumpModel[26] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Box 61
        pumpModel[27] = new ModelRendererTurbo(this, 81, 177, textureX, textureY); // Box 61
        pumpModel[28] = new ModelRendererTurbo(this, 113, 177, textureX, textureY); // Box 61
        pumpModel[29] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 61
        pumpModel[30] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Box 61
        pumpModel[31] = new ModelRendererTurbo(this, 129, 185, textureX, textureY); // Box 61
        pumpModel[32] = new ModelRendererTurbo(this, 153, 185, textureX, textureY); // Box 61
        pumpModel[33] = new ModelRendererTurbo(this, 201, 185, textureX, textureY); // Box 61
        pumpModel[34] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Box 61
        pumpModel[35] = new ModelRendererTurbo(this, 265, 185, textureX, textureY); // Box 61
        pumpModel[36] = new ModelRendererTurbo(this, 321, 185, textureX, textureY); // Box 61
        pumpModel[37] = new ModelRendererTurbo(this, 377, 185, textureX, textureY); // Box 61
        pumpModel[38] = new ModelRendererTurbo(this, 433, 185, textureX, textureY); // Box 61
        pumpModel[39] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 61
        pumpModel[40] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Box 61
        pumpModel[41] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Box 61
        pumpModel[42] = new ModelRendererTurbo(this, 57, 193, textureX, textureY); // Box 61
        pumpModel[43] = new ModelRendererTurbo(this, 473, 193, textureX, textureY); // Box 61
        pumpModel[44] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Box 61
        pumpModel[45] = new ModelRendererTurbo(this, 121, 201, textureX, textureY); // Box 61
        pumpModel[46] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Box 61
        pumpModel[47] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 61
        pumpModel[48] = new ModelRendererTurbo(this, 209, 209, textureX, textureY); // Box 61
        pumpModel[49] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Box 61
        pumpModel[50] = new ModelRendererTurbo(this, 289, 209, textureX, textureY); // Box 61
        pumpModel[51] = new ModelRendererTurbo(this, 329, 209, textureX, textureY); // Box 61
        pumpModel[52] = new ModelRendererTurbo(this, 369, 209, textureX, textureY); // Box 61
        pumpModel[53] = new ModelRendererTurbo(this, 409, 209, textureX, textureY); // Box 61
        pumpModel[54] = new ModelRendererTurbo(this, 449, 209, textureX, textureY); // Box 61
        pumpModel[55] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 61
        pumpModel[56] = new ModelRendererTurbo(this, 41, 217, textureX, textureY); // Box 61
        pumpModel[57] = new ModelRendererTurbo(this, 473, 217, textureX, textureY); // Box 61
        pumpModel[58] = new ModelRendererTurbo(this, 65, 225, textureX, textureY); // Box 61
        pumpModel[59] = new ModelRendererTurbo(this, 105, 225, textureX, textureY); // Box 61
        pumpModel[60] = new ModelRendererTurbo(this, 169, 225, textureX, textureY); // Box 61
        pumpModel[61] = new ModelRendererTurbo(this, 129, 233, textureX, textureY); // Box 61
        pumpModel[62] = new ModelRendererTurbo(this, 193, 233, textureX, textureY); // Box 61
        pumpModel[63] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Box 61

        pumpModel[0].addShapeBox(0F, 0F, 0F, 25, 5, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 61
        pumpModel[0].setRotationPoint(138F, -47.5F, 2F);

        pumpModel[1].addShapeBox(0F, 0F, 0F, 25, 5, 6, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 61
        pumpModel[1].setRotationPoint(138F, -52.5F, 2F);

        pumpModel[2].addShapeBox(0F, 0F, 0F, 25, 5, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, -6F, 0F, -0.5F, -6F); // Box 61
        pumpModel[2].setRotationPoint(138F, -42.5F, 2F);

        pumpModel[3].addShapeBox(0F, 0F, 0F, 25, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F); // Box 61
        pumpModel[3].setRotationPoint(138F, -40.5F, -4F);

        pumpModel[4].addShapeBox(0F, 0F, 0F, 25, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F); // Box 61
        pumpModel[4].setRotationPoint(138F, -52F, -4F);

        pumpModel[5].addShapeBox(0F, 0F, 0F, 25, 5, 6, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 61
        pumpModel[5].setRotationPoint(138F, -47.5F, -8F);

        pumpModel[6].addShapeBox(0F, 0F, 0F, 25, 5, 6, 0F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 61
        pumpModel[6].setRotationPoint(138F, -52.5F, -8F);

        pumpModel[7].addShapeBox(0F, 0F, 0F, 25, 5, 6, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 61
        pumpModel[7].setRotationPoint(138F, -42.5F, -8F);

        pumpModel[8].addShapeBox(0F, 0F, 0F, 4, 5, 6, 0F, 0F, -1F, -1.5F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -1F, -2.5F, 0F, -1F, -1.5F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -1F, -2.5F); // Box 61
        pumpModel[8].setRotationPoint(125F, -47.5F, 2F);

        pumpModel[9].addShapeBox(0F, 0F, 0F, 4, 5, 6, 0F, 0F, -3.5F, 0.5F, 0F, -3F, 0F, 0F, 0F, -6F, 0F, -1.5F, -6.5F, 0F, 1F, -1.5F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 1F, -2.5F); // Box 61
        pumpModel[9].setRotationPoint(125F, -52.5F, 2F);

        pumpModel[10].addShapeBox(0F, 0F, 0F, 4, 5, 6, 0F, 0F, -1F, -2.5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, -1.5F, 0F, -1F, -2.5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, -1.5F); // Box 61
        pumpModel[10].setRotationPoint(125F, -47.5F, -8F);

        pumpModel[11].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F, 0F, -0.5F, -2.5F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, -2.5F); // Box 61
        pumpModel[11].setRotationPoint(125F, -51.5F, -4F);

        pumpModel[12].addShapeBox(0F, 0F, 0F, 4, 5, 6, 0F, 0F, -1.5F, -6.5F, 0F, 0F, -6F, 0F, -3F, 0F, 0F, -3.5F, 0.5F, 0F, 1F, -2.5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 1F, -1.5F); // Box 61
        pumpModel[12].setRotationPoint(125F, -52.5F, -8F);

        pumpModel[13].addShapeBox(0F, 0F, 0F, 4, 5, 6, 0F, 0F, 1F, -1.5F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 1F, -2.5F, 0F, -3.5F, 0.5F, 0F, -3F, 0F, 0F, 0F, -6F, 0F, -2F, -6.5F); // Box 61
        pumpModel[13].setRotationPoint(125F, -42.5F, 2F);

        pumpModel[14].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F, 0F, 0.5F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, -2.5F, 0F, -1F, -2.5F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -1F, -2.5F); // Box 61
        pumpModel[14].setRotationPoint(125F, -40.5F, -4F);

        pumpModel[15].addShapeBox(0F, 0F, 0F, 4, 5, 6, 0F, 0F, 1F, -2.5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 1F, -1.5F, 0F, -2F, -6.5F, 0F, 0F, -6F, 0F, -3F, 0F, 0F, -3.5F, 0.5F); // Box 61
        pumpModel[15].setRotationPoint(125F, -42.5F, -8F);

        pumpModel[16].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 61
        pumpModel[16].setRotationPoint(121F, -42.5F, -1.5F);

        pumpModel[17].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1F, -5.5F, 0F, 1F, -5.5F); // Box 61
        pumpModel[17].setRotationPoint(121F, -43.5F, 2F);

        pumpModel[18].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 61
        pumpModel[18].setRotationPoint(121F, -46.5F, 2F);

        pumpModel[19].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -5.5F, 0F, 1F, -5.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 61
        pumpModel[19].setRotationPoint(121F, -43.5F, -7F);

        pumpModel[20].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F, 0F, -1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 61
        pumpModel[20].setRotationPoint(121F, -46.5F, -7F);

        pumpModel[21].addShapeBox(0F, 0F, 0F, 4, 5, 6, 0F, 0F, 0F, -2F, 0F, -1F, -1.5F, 0F, -1F, -2.5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, -1.5F, 0F, -1F, -2.5F, 0F, 0F, -1F); // Box 61
        pumpModel[21].setRotationPoint(172F, -47.5F, 2F);

        pumpModel[22].addShapeBox(0F, 0F, 0F, 4, 5, 6, 0F, 0F, -3F, 0F, 0F, -3.5F, 0.5F, 0F, -1.5F, -6.5F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 1F, -1.5F, 0F, 1F, -2.5F, 0F, 0F, -1F); // Box 61
        pumpModel[22].setRotationPoint(172F, -52.5F, 2F);

        pumpModel[23].addShapeBox(0F, 0F, 0F, 4, 5, 6, 0F, 0F, 0F, -1F, 0F, -1F, -2.5F, 0F, -1F, -1.5F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -1F, -2.5F, 0F, -1F, -1.5F, 0F, 0F, -2F); // Box 61
        pumpModel[23].setRotationPoint(172F, -47.5F, -8F);

        pumpModel[24].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F, 0F, 1F, -2F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, -2F); // Box 61
        pumpModel[24].setRotationPoint(172F, -51.5F, -4F);

        pumpModel[25].addShapeBox(0F, 0F, 0F, 4, 5, 6, 0F, 0F, 0F, -6F, 0F, -1.5F, -6.5F, 0F, -3.5F, 0.5F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 1F, -2.5F, 0F, 1F, -1.5F, 0F, 0F, -2F); // Box 61
        pumpModel[25].setRotationPoint(172F, -52.5F, -8F);

        pumpModel[26].addShapeBox(0F, 0F, 0F, 4, 5, 6, 0F, 0F, 0F, -2F, 0F, 1F, -1.5F, 0F, 1F, -2.5F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -3.5F, 0.5F, 0F, -2F, -6.5F, 0F, 0F, -6F); // Box 61
        pumpModel[26].setRotationPoint(172F, -42.5F, 2F);

        pumpModel[27].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F, 0F, 0F, -2F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, -1F, -2.5F, 0F, -1F, -2.5F, 0F, 1F, -2F); // Box 61
        pumpModel[27].setRotationPoint(172F, -40.5F, -4F);

        pumpModel[28].addShapeBox(0F, 0F, 0F, 4, 5, 6, 0F, 0F, 0F, -1F, 0F, 1F, -2.5F, 0F, 1F, -1.5F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, -2F, -6.5F, 0F, -3.5F, 0.5F, 0F, -3F, 0F); // Box 61
        pumpModel[28].setRotationPoint(172F, -42.5F, -8F);

        pumpModel[29].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 61
        pumpModel[29].setRotationPoint(176F, -42.5F, -1.5F);

        pumpModel[30].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1F, -5.5F, 0F, 1F, -5.5F); // Box 61
        pumpModel[30].setRotationPoint(176F, -43.5F, 2F);

        pumpModel[31].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 61
        pumpModel[31].setRotationPoint(176F, -46.5F, 2F);

        pumpModel[32].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -5.5F, 0F, 1F, -5.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 61
        pumpModel[32].setRotationPoint(176F, -43.5F, -7F);

        pumpModel[33].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 61
        pumpModel[33].setRotationPoint(176F, -46.5F, -7F);

        pumpModel[34].addShapeBox(0F, 0F, 0F, 9, 5, 17, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 61
        pumpModel[34].setRotationPoint(129F, -47.5F, -9F);

        pumpModel[35].addShapeBox(0F, 0F, 0F, 9, 5, 17, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 61
        pumpModel[35].setRotationPoint(129F, -52.5F, -9F);

        pumpModel[36].addShapeBox(0F, 0F, 0F, 9, 5, 17, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 61
        pumpModel[36].setRotationPoint(129F, -42.5F, -9F);

        pumpModel[37].addShapeBox(0F, 0F, 0F, 9, 5, 17, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 61
        pumpModel[37].setRotationPoint(163F, -47.5F, -9F);

        pumpModel[38].addShapeBox(0F, 0F, 0F, 9, 5, 17, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 61
        pumpModel[38].setRotationPoint(163F, -52.5F, -9F);

        pumpModel[39].addShapeBox(0F, 0F, 0F, 9, 5, 17, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 61
        pumpModel[39].setRotationPoint(163F, -42.5F, -9F);

        pumpModel[40].addShapeBox(0F, 0F, 0F, 2, 5, 17, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 61
        pumpModel[40].setRotationPoint(160F, -47.5F, -9F);

        pumpModel[41].addShapeBox(0F, 0F, 0F, 2, 5, 17, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 61
        pumpModel[41].setRotationPoint(160F, -52.5F, -9F);

        pumpModel[42].addShapeBox(0F, 0F, 0F, 2, 5, 17, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 61
        pumpModel[42].setRotationPoint(160F, -42.5F, -9F);

        pumpModel[43].addShapeBox(0F, 0F, 0F, 2, 5, 17, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 61
        pumpModel[43].setRotationPoint(157F, -47.5F, -9F);

        pumpModel[44].addShapeBox(0F, 0F, 0F, 2, 5, 17, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 61
        pumpModel[44].setRotationPoint(157F, -52.5F, -9F);

        pumpModel[45].addShapeBox(0F, 0F, 0F, 2, 5, 17, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 61
        pumpModel[45].setRotationPoint(157F, -42.5F, -9F);

        pumpModel[46].addShapeBox(0F, 0F, 0F, 2, 5, 17, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 61
        pumpModel[46].setRotationPoint(154F, -47.5F, -9F);

        pumpModel[47].addShapeBox(0F, 0F, 0F, 2, 5, 17, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 61
        pumpModel[47].setRotationPoint(154F, -52.5F, -9F);

        pumpModel[48].addShapeBox(0F, 0F, 0F, 2, 5, 17, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 61
        pumpModel[48].setRotationPoint(154F, -42.5F, -9F);

        pumpModel[49].addShapeBox(0F, 0F, 0F, 2, 5, 17, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 61
        pumpModel[49].setRotationPoint(151F, -47.5F, -9F);

        pumpModel[50].addShapeBox(0F, 0F, 0F, 2, 5, 17, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 61
        pumpModel[50].setRotationPoint(151F, -52.5F, -9F);

        pumpModel[51].addShapeBox(0F, 0F, 0F, 2, 5, 17, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 61
        pumpModel[51].setRotationPoint(151F, -42.5F, -9F);

        pumpModel[52].addShapeBox(0F, 0F, 0F, 2, 5, 17, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 61
        pumpModel[52].setRotationPoint(148F, -47.5F, -9F);

        pumpModel[53].addShapeBox(0F, 0F, 0F, 2, 5, 17, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 61
        pumpModel[53].setRotationPoint(148F, -52.5F, -9F);

        pumpModel[54].addShapeBox(0F, 0F, 0F, 2, 5, 17, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 61
        pumpModel[54].setRotationPoint(148F, -42.5F, -9F);

        pumpModel[55].addShapeBox(0F, 0F, 0F, 2, 5, 17, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 61
        pumpModel[55].setRotationPoint(145F, -47.5F, -9F);

        pumpModel[56].addShapeBox(0F, 0F, 0F, 2, 5, 17, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 61
        pumpModel[56].setRotationPoint(145F, -52.5F, -9F);

        pumpModel[57].addShapeBox(0F, 0F, 0F, 2, 5, 17, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 61
        pumpModel[57].setRotationPoint(145F, -42.5F, -9F);

        pumpModel[58].addShapeBox(0F, 0F, 0F, 2, 5, 17, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 61
        pumpModel[58].setRotationPoint(142F, -47.5F, -9F);

        pumpModel[59].addShapeBox(0F, 0F, 0F, 2, 5, 17, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 61
        pumpModel[59].setRotationPoint(142F, -52.5F, -9F);

        pumpModel[60].addShapeBox(0F, 0F, 0F, 2, 5, 17, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 61
        pumpModel[60].setRotationPoint(142F, -42.5F, -9F);

        pumpModel[61].addShapeBox(0F, 0F, 0F, 2, 5, 17, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 61
        pumpModel[61].setRotationPoint(139F, -47.5F, -9F);

        pumpModel[62].addShapeBox(0F, 0F, 0F, 2, 5, 17, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 61
        pumpModel[62].setRotationPoint(139F, -52.5F, -9F);

        pumpModel[63].addShapeBox(0F, 0F, 0F, 2, 5, 17, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 61
        pumpModel[63].setRotationPoint(139F, -42.5F, -9F);


        attachmentScopeModel = new ModelRendererTurbo[9];
        attachmentScopeModel[0] = new ModelRendererTurbo(this, 301, 361, textureX, textureY); // Box 260
        attachmentScopeModel[1] = new ModelRendererTurbo(this, 365, 361, textureX, textureY); // Box 260
        attachmentScopeModel[2] = new ModelRendererTurbo(this, 429, 361, textureX, textureY); // Box 260
        attachmentScopeModel[3] = new ModelRendererTurbo(this, 445, 361, textureX, textureY); // Box 260
        attachmentScopeModel[4] = new ModelRendererTurbo(this, 461, 361, textureX, textureY); // Box 260
        attachmentScopeModel[5] = new ModelRendererTurbo(this, 477, 361, textureX, textureY); // Box 260
        attachmentScopeModel[6] = new ModelRendererTurbo(this, 493, 361, textureX, textureY); // Box 260
        attachmentScopeModel[7] = new ModelRendererTurbo(this, 301, 369, textureX, textureY); // Box 260
        attachmentScopeModel[8] = new ModelRendererTurbo(this, 317, 369, textureX, textureY); // Box 260

        attachmentScopeModel[0].addShapeBox(0F, 0F, 0F, 26, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        attachmentScopeModel[0].setRotationPoint(35F, -64F, -2F);

        attachmentScopeModel[1].addShapeBox(0F, 0F, 0F, 26, 1, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        attachmentScopeModel[1].setRotationPoint(35F, -65F, -2F);

        attachmentScopeModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 260
        attachmentScopeModel[2].setRotationPoint(35F, -66F, -2F);

        attachmentScopeModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 260
        attachmentScopeModel[3].setRotationPoint(39F, -66F, -2F);

        attachmentScopeModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 260
        attachmentScopeModel[4].setRotationPoint(43F, -66F, -2F);

        attachmentScopeModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 260
        attachmentScopeModel[5].setRotationPoint(47F, -66F, -2F);

        attachmentScopeModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 260
        attachmentScopeModel[6].setRotationPoint(51F, -66F, -2F);

        attachmentScopeModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 260
        attachmentScopeModel[7].setRotationPoint(55F, -66F, -2F);

        attachmentScopeModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 260
        attachmentScopeModel[8].setRotationPoint(59F, -66F, -2F);

        scopeAttachPoint = new Vector3f(46F / 16F, 69F / 16F, 0F / 16F);
        barrelAttachPoint = new Vector3f(212F / 16F, 61F / 16F, 0F / 16F);
        stockAttachPoint = new Vector3f(-21F / 16F, 51F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(74F / 16F, 57F / 16F, -6.5F / 16F);
        gripAttachPoint = new Vector3f(148 / 16F, 41.5F / 16F, 0F / 16F);

        animationType = EnumAnimationType.SHOTGUN;
        rotateGunHorizontal = 15F;
        tiltGun = 30F;
        translateGun = new Vector3f(0.0F, 0.0F, -0.1875F);
        translateClip = new Vector3f(0.0F, -0.63F, 0.0F);
        rightHandAmmo = false;
        leftHandAmmo = true;
        lefthandPump = true;
        hasFlash = true;
        hasArms = true;
        leftArmPos = new Vector3f(0.5F, -0.03F, -0.45F);
        leftArmRot = new Vector3f(80.0F, 50.0F, 10.0F);
        leftArmReloadPos = new Vector3f(-0.15F, -0.6F, -0.04F);
        leftArmReloadRot = new Vector3f(80.0F, 50.0F, 0.0F);
        rightArmPos = new Vector3f(0.15F, -0.52F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmReloadPos = new Vector3f(0.15F, -0.52F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.5D, 0.75D);
        rightHandAmmo = false;
        leftHandAmmo = true;
        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);
        casingAttachPoint = new Vector3f(1.4F, 1.45F, 0.0F);
        casingAnimDistance = new Vector3f(0.0F, 3.0F, 7.75F);
        casingAnimSpread = new Vector3f(3.0F, 5.0F, 3.0F);
        casingAnimTime = 6;
        casingRotateVector = new Vector3f(0.1F, 0.0F, 0.1F);
        caseScale = 0.25F;
        casingDelay = 0;
        flashScale = 0.6F;
        muzzleFlashPoint = new Vector3f(2.1F, 0.6F, 0.0F);
        pumpDelayAfterReload = 80;
        pumpDelay = 7;
        pumpTime = 12;
        pumpHandleDistance = 2F;
        pumpModifier = 5F;

        gripIsOnPump = true;
        crouchZoom = -0.075F;
        zoomOffset = 0.35F;
        gunOffset = -0.7F;
        gunOffsetX = -2F;
        ShakeDistance = 1.0F;
        translateAll(-2F, -4F, 0F);
        flipAll();

        zoomOffsetY = -0.09F;

        hasFlash = true;
        flashScale = 5F;
        muzzleFlashPoint = new Vector3f(
                barrelAttachPoint.x / flashScale,
                barrelAttachPoint.y / flashScale,
                barrelAttachPoint.z / flashScale
        );
    }
}