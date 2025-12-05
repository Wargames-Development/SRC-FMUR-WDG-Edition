//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: XM25
// Model Creator: 
// Created on: 05.06.2021 - 20:04:02
// Last changed on: 05.06.2021 - 20:04:02

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelXM25 extends ModelGun //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public ModelXM25() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[182];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import
        gunModel[1] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import
        gunModel[2] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import
        gunModel[3] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import
        gunModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import
        gunModel[5] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Import
        gunModel[6] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Import
        gunModel[7] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Import
        gunModel[8] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Import
        gunModel[9] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Import
        gunModel[10] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Import
        gunModel[11] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Import
        gunModel[12] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import
        gunModel[13] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 184
        gunModel[14] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 184
        gunModel[15] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 184
        gunModel[16] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 184
        gunModel[17] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 96
        gunModel[18] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 97
        gunModel[19] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 98
        gunModel[20] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 99
        gunModel[21] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 100
        gunModel[22] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 101
        gunModel[23] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 102
        gunModel[24] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 103
        gunModel[25] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 104
        gunModel[26] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 354
        gunModel[27] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 405
        gunModel[28] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 406
        gunModel[29] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 651
        gunModel[30] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 651
        gunModel[31] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 651
        gunModel[32] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 651
        gunModel[33] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 651
        gunModel[34] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 651
        gunModel[35] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 651
        gunModel[36] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 651
        gunModel[37] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 651
        gunModel[38] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 99
        gunModel[39] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 651
        gunModel[40] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 651
        gunModel[41] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 651
        gunModel[42] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Import
        gunModel[43] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 651
        gunModel[44] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 651
        gunModel[45] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Import
        gunModel[46] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 651
        gunModel[47] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 651
        gunModel[48] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 651
        gunModel[49] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 651
        gunModel[50] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 651
        gunModel[51] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 651
        gunModel[52] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 651
        gunModel[53] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 651
        gunModel[54] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 651
        gunModel[55] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Import
        gunModel[56] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 651
        gunModel[57] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 651
        gunModel[58] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 651
        gunModel[59] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 651
        gunModel[60] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 651
        gunModel[61] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 651
        gunModel[62] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 651
        gunModel[63] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 651
        gunModel[64] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 651
        gunModel[65] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 651
        gunModel[66] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 651
        gunModel[67] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 651
        gunModel[68] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 651
        gunModel[69] = new ModelRendererTurbo(this, 337, 137, textureX, textureY); // Box 651
        gunModel[70] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Box 651
        gunModel[71] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Box 651
        gunModel[72] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 651
        gunModel[73] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 651
        gunModel[74] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 651
        gunModel[75] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 651
        gunModel[76] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 651
        gunModel[77] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 651
        gunModel[78] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 651
        gunModel[79] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 651
        gunModel[80] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 651
        gunModel[81] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 651
        gunModel[82] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 651
        gunModel[83] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 651
        gunModel[84] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 651
        gunModel[85] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Box 651
        gunModel[86] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 651
        gunModel[87] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 651
        gunModel[88] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 651
        gunModel[89] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 651
        gunModel[90] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 651
        gunModel[91] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 651
        gunModel[92] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 651
        gunModel[93] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 651
        gunModel[94] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 651
        gunModel[95] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 651
        gunModel[96] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 651
        gunModel[97] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 651
        gunModel[98] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 651
        gunModel[99] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 651
        gunModel[100] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 651
        gunModel[101] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 651
        gunModel[102] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 651
        gunModel[103] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 651
        gunModel[104] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 651
        gunModel[105] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 651
        gunModel[106] = new ModelRendererTurbo(this, 393, 161, textureX, textureY); // Box 651
        gunModel[107] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Box 651
        gunModel[108] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Box 651
        gunModel[109] = new ModelRendererTurbo(this, 177, 169, textureX, textureY); // Box 651
        gunModel[110] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 651
        gunModel[111] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 651
        gunModel[112] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Box 651
        gunModel[113] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 651
        gunModel[114] = new ModelRendererTurbo(this, 33, 193, textureX, textureY); // Box 651
        gunModel[115] = new ModelRendererTurbo(this, 257, 193, textureX, textureY); // Box 651
        gunModel[116] = new ModelRendererTurbo(this, 241, 217, textureX, textureY); // Box 651
        gunModel[117] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 651
        gunModel[118] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 651
        gunModel[119] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 651
        gunModel[120] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 651
        gunModel[121] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 651
        gunModel[122] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 651
        gunModel[123] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 651
        gunModel[124] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 651
        gunModel[125] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 651
        gunModel[126] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 651
        gunModel[127] = new ModelRendererTurbo(this, 425, 185, textureX, textureY); // Box 651
        gunModel[128] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // Box 651
        gunModel[129] = new ModelRendererTurbo(this, 361, 217, textureX, textureY); // Box 651
        gunModel[130] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 651
        gunModel[131] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 651
        gunModel[132] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 651
        gunModel[133] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 651
        gunModel[134] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 651
        gunModel[135] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 651
        gunModel[136] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 651
        gunModel[137] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 651
        gunModel[138] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 651
        gunModel[139] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box 651
        gunModel[140] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Box 651
        gunModel[141] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 651
        gunModel[142] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 651
        gunModel[143] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 651
        gunModel[144] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 651
        gunModel[145] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 651
        gunModel[146] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 651
        gunModel[147] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 651
        gunModel[148] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 651
        gunModel[149] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 651
        gunModel[150] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 651
        gunModel[151] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 651
        gunModel[152] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 651
        gunModel[153] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 651
        gunModel[154] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 651
        gunModel[155] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 651
        gunModel[156] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 651
        gunModel[157] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 651
        gunModel[158] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 651
        gunModel[159] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 651
        gunModel[160] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 651
        gunModel[161] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 208
        gunModel[162] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Box 208
        gunModel[163] = new ModelRendererTurbo(this, 417, 217, textureX, textureY); // Box 208
        gunModel[164] = new ModelRendererTurbo(this, 441, 225, textureX, textureY); // Box 208
        gunModel[165] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 651
        gunModel[166] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 651
        gunModel[167] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 651
        gunModel[168] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 651
        gunModel[169] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 651
        gunModel[170] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 651
        gunModel[171] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 651
        gunModel[172] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 651
        gunModel[173] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 651
        gunModel[174] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 651
        gunModel[175] = new ModelRendererTurbo(this, 169, 265, textureX, textureY); // Box 651
        gunModel[176] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 651
        gunModel[177] = new ModelRendererTurbo(this, 169, 289, textureX, textureY); // Box 651
        gunModel[178] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 651
        gunModel[179] = new ModelRendererTurbo(this, 169, 313, textureX, textureY); // Box 651
        gunModel[180] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 651
        gunModel[181] = new ModelRendererTurbo(this, 169, 337, textureX, textureY); // Box 651

        gunModel[0].addShapeBox(0F, 0F, 0F, 50, 6, 14, 0F, 0.0F, 0.0F, 0F, 3F, 0.0F, 0F, 3F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[0].setRotationPoint(-69F, -24F, -7F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 55, 12, 14, 0F, 0.0F, 0.0F, 0.0F, 3F, 0.0F, 0.0F, 3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[1].setRotationPoint(-69F, -36F, -7F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 60, 6, 14, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[2].setRotationPoint(-69F, -42F, -7F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 23, 2, 14, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2F, -1.0F, 0.0F, 0F, -1.0F, 0.0F, 0F, -1.0F, 0.0F, 2F, -1.0F); // Import
        gunModel[3].setRotationPoint(-69F, -18F, -7F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 4, 7, 14, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import
        gunModel[4].setRotationPoint(-73F, -43F, -7F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 4, 18, 14, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import
        gunModel[5].setRotationPoint(-73F, -36F, -7F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 4, 4, 14, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.2F, -1F); // Import
        gunModel[6].setRotationPoint(-73F, -18F, -7F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 1, 10, 12, 0F, 0.0F, 0.0F, 0F, 0.0F, 2F, 1F, 0.0F, 2F, 1F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0F); // Import
        gunModel[7].setRotationPoint(-47F, -16F, -6F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 27, 9, 1, 0F, 0.0F, 0.0F, 0F, 0.3F, 0.0F, 0F, 0.3F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0.0F, 0.0F, 0F); // Import
        gunModel[8].setRotationPoint(-46F, -18F, 6F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 12, 11, 8, 0F, 0.0F, 0.0F, 0F, 0F, 0.0F, 0F, 0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 5F, 0.0F, 0.0F, 0.0F, -3F, 0.0F, 0F, -3F, 0.0F, 5F, 0.0F, 0F); // Import
        gunModel[9].setRotationPoint(-16F, -24F, -4F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 27, 9, 1, 0F, 0.0F, 0.0F, 0F, 0.3F, 0.0F, 0F, 0.3F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0.0F, 0.0F, 0F); // Import
        gunModel[10].setRotationPoint(-46F, -18F, -7F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 12, 11, 3, 0F, 0.0F, 0.0F, 0F, 0F, 0.0F, 0F, 0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 5F, 0.0F, 0.0F, 0.0F, -3F, 0.0F, 0F, -3F, -3F, 5F, 0.0F, 0F); // Import
        gunModel[11].setRotationPoint(-16F, -24F, 4F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 12, 11, 3, 0F, 0.0F, 0.0F, 0F, 0F, 0.0F, 0F, 0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 5F, 0.0F, 0.0F, 0.0F, -3F, -3F, 0F, -3F, 0.0F, 5F, 0.0F, 0F); // Import
        gunModel[12].setRotationPoint(-16F, -24F, -7F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 1, 8, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 184
        gunModel[13].setRotationPoint(-4F, -24F, -7F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 3, 8, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0F, -3F); // Box 184
        gunModel[14].setRotationPoint(-3F, -24F, -7F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 3, 8, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -3F, 0F, 1.5F, -3F, 0F, 1.5F, -3F, 0F, 0.5F, -3F); // Box 184
        gunModel[15].setRotationPoint(0F, -24F, -7F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 3, 8, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -3F, 0F, 4F, -3F, 0F, 4F, -3F, 0F, 1.5F, -3F); // Box 184
        gunModel[16].setRotationPoint(3F, -24F, -7F);

        gunModel[17].addShapeBox(0F, 0F, -1F, 4, 6, 8, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 96
        gunModel[17].setRotationPoint(11F, -10F, -3F);

        gunModel[18].addShapeBox(0F, 0F, -1F, 8, 10, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F); // Box 97
        gunModel[18].setRotationPoint(7F, -4F, -3F);

        gunModel[19].addShapeBox(0F, 0F, -1F, 10, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F); // Box 98
        gunModel[19].setRotationPoint(0F, 16F, -3F);

        gunModel[20].addShapeBox(0F, 0F, -1F, 3, 10, 4, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 3F, 0F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 2F); // Box 99
        gunModel[20].setRotationPoint(15F, -4F, -1F);

        gunModel[21].addShapeBox(0F, 0F, -1F, 3, 10, 4, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 4F, -2F, 0F, -4F, 0F, 2F, -4F, 0F, 2F, 4F, -2F, 0F); // Box 100
        gunModel[21].setRotationPoint(4F, -4F, -1F);

        gunModel[22].addShapeBox(0F, 0F, -1F, 3, 10, 4, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 5F, 0F, 0F, -3F, 0F, 2F, -3F, 0F, 2F, 5F, 0F, 0F); // Box 101
        gunModel[22].setRotationPoint(0F, 6F, -1F);

        gunModel[23].addShapeBox(0F, 0F, -1F, 2, 6, 4, 0F, 1F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 1F, 0F, 2F, 4F, 0F, 0F, -3F, 0F, 2F, -3F, 0F, 2F, 4F, 0F, 0F); // Box 102
        gunModel[23].setRotationPoint(8F, -10F, -1F);

        gunModel[24].addShapeBox(0F, 0F, -1F, 4, 3, 4, 0F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, 0F, 1F, -2F, 0F, -1F, -1F, 2F, -1F, -1F, 2F, 1F, -2F, 0F); // Box 103
        gunModel[24].setRotationPoint(-4F, 16F, -1F);

        gunModel[25].addShapeBox(0F, 0F, -1F, 3, 2, 4, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 104
        gunModel[25].setRotationPoint(10F, 16F, -1F);

        gunModel[26].addBox(0F, 0F, -1F, 30, 1, 8, 0F); // Box 354
        gunModel[26].setRotationPoint(10F, 18F, -3F);

        gunModel[27].addShapeBox(0F, 0F, -1F, 9, 10, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 405
        gunModel[27].setRotationPoint(3F, 6F, -3F);

        gunModel[28].addShapeBox(0F, 0F, -1F, 3, 10, 4, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 2F); // Box 406
        gunModel[28].setRotationPoint(12F, 6F, -1F);

        gunModel[29].addShapeBox(0F, 0F, -1F, 21, 2, 8, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[29].setRotationPoint(7F, -12F, -3F);

        gunModel[30].addShapeBox(0F, 0F, -1F, 30, 8, 8, 0F, 0F, 0F, 3F, 2F, 0F, 3F, 2F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[30].setRotationPoint(19F, -20F, -3F);

        gunModel[31].addShapeBox(0F, 0F, -1F, 5, 8, 8, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[31].setRotationPoint(14F, -20F, -3F);

        gunModel[32].addShapeBox(0F, 0F, -1F, 8, 12, 8, 0F, 0F, 0F, 3F, 0F, -4F, 3F, 0F, -4F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[32].setRotationPoint(6F, -24F, -3F);

        gunModel[33].addShapeBox(0F, 0F, -1F, 4, 25, 8, 0F, 1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 651
        gunModel[33].setRotationPoint(36F, -10F, -3F);

        gunModel[34].addShapeBox(0F, 0F, -1F, 4, 8, 8, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, 0F, 0F, 0F); // Box 651
        gunModel[34].setRotationPoint(44F, -12F, -3F);

        gunModel[35].addShapeBox(0F, 0F, -1F, 4, 31, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[35].setRotationPoint(40F, -12F, -3F);

        gunModel[36].addShapeBox(0F, 0F, -1F, 2, 17, 8, 0F, 0F, 0F, 0F, 1.7F, 0F, -1F, 1.7F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 651
        gunModel[36].setRotationPoint(44F, -4F, -3F);

        gunModel[37].addShapeBox(0F, 0F, -1F, 2, 6, 8, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -2F, -3F, -0.6F, -2F, -3F, 0F, 0F, 0F); // Box 651
        gunModel[37].setRotationPoint(44F, 13F, -3F);

        gunModel[38].addShapeBox(0F, 0F, -1F, 4, 6, 4, 0F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, 0F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F); // Box 99
        gunModel[38].setRotationPoint(15F, -10F, -1F);

        gunModel[39].addShapeBox(0F, 0F, -1F, 7, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 651
        gunModel[39].setRotationPoint(28F, -12F, -3F);

        gunModel[40].addShapeBox(0F, 0F, -1F, 4, 2, 8, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F); // Box 651
        gunModel[40].setRotationPoint(36F, -12F, -3F);

        gunModel[41].addShapeBox(0F, 0F, -1F, 4, 3, 8, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 651
        gunModel[41].setRotationPoint(36F, 15F, -3F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 12, 12, 14, 0F, 0.0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 5F, 0.0F, 0.0F); // Import
        gunModel[42].setRotationPoint(-11F, -36F, -7F);

        gunModel[43].addShapeBox(0F, 0F, -1F, 43, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[43].setRotationPoint(14F, -24F, -6F);

        gunModel[44].addShapeBox(0F, 0F, -1F, 8, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 651
        gunModel[44].setRotationPoint(6F, -24F, -6F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 10, 6, 14, 0F, 0.0F, 0.0F, -2.0F, 0F, 0.0F, -2F, 0F, 0.0F, -2F, 0.0F, 0.0F, -2F, 2F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 2F, 0.0F, 0.0F); // Import
        gunModel[45].setRotationPoint(-9F, -42F, -7F);

        gunModel[46].addShapeBox(0F, 0F, -1F, 26, 20, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[46].setRotationPoint(1F, -44F, -7F);

        gunModel[47].addShapeBox(1F, 1.43F, -8F, 75, 1, 16, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 651
        gunModel[47].setRotationPoint(26F, -31F, 0F);

        gunModel[48].addShapeBox(0F, 0F, -1F, 40, 2, 12, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 651
        gunModel[48].setRotationPoint(57F, -24F, -5F);

        gunModel[49].addShapeBox(0F, 0F, -1F, 25, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[49].setRotationPoint(-49F, -33F, 8F);

        gunModel[50].addShapeBox(0F, 0F, -1F, 10, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[50].setRotationPoint(-41F, -28F, 9F);

        gunModel[51].addShapeBox(0F, 0F, -1F, 10, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[51].setRotationPoint(-41F, -26F, 8F);

        gunModel[52].addShapeBox(0F, 0F, -1F, 25, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[52].setRotationPoint(-49F, -25F, 8F);

        gunModel[53].addShapeBox(0F, 0F, -1F, 25, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 651
        gunModel[53].setRotationPoint(-49F, -27F, 8F);

        gunModel[54].addShapeBox(0F, 0F, -1F, 25, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[54].setRotationPoint(-49F, -34F, 8F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 1, 6, 12, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import
        gunModel[55].setRotationPoint(-46F, -12F, -6F);

        gunModel[56].addShapeBox(0F, 0F, -1F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[56].setRotationPoint(-46.5F, -6F, -1F);

        gunModel[57].addShapeBox(0F, 0F, -1F, 26, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, -1F); // Box 651
        gunModel[57].setRotationPoint(1F, -24F, -7F);

        gunModel[58].addShapeBox(0F, 0F, -1F, 2, 20, 16, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 651
        gunModel[58].setRotationPoint(-1F, -44F, -7F);

        gunModel[59].addShapeBox(0F, 0F, -1F, 2, 18, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[59].setRotationPoint(-75F, -36F, -7F);

        gunModel[60].addShapeBox(0F, 0F, -1F, 2, 7, 16, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[60].setRotationPoint(-75F, -43F, -7F);

        gunModel[61].addShapeBox(0F, 0F, -1F, 2, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 651
        gunModel[61].setRotationPoint(-75F, -18F, -7F);

        gunModel[62].addShapeBox(0F, 0F, -1F, 2, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[62].setRotationPoint(27F, -44F, -7F);

        gunModel[63].addShapeBox(0F, 0F, -1F, 6, 7, 1, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[63].setRotationPoint(17F, -10F, 0.5F);

        gunModel[64].addShapeBox(0F, 0.31F, -2F, 75, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[64].setRotationPoint(27F, -42.75F, 1.5F);

        gunModel[65].addShapeBox(0F, 0F, -1F, 3, 17, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[65].setRotationPoint(102F, -40F, -2F);

        gunModel[66].addShapeBox(0F, 0F, -1F, 3, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[66].setRotationPoint(102F, -43F, 0F);

        gunModel[67].addShapeBox(0F, 0F, -1F, 3, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[67].setRotationPoint(102F, -43F, 2F);

        gunModel[68].addShapeBox(0F, 0F, -1F, 3, 3, 2, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[68].setRotationPoint(102F, -43F, -2F);

        gunModel[69].addShapeBox(0F, 0F, -1F, 4, 1, 16, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 651
        gunModel[69].setRotationPoint(102F, -21F, -7F);

        gunModel[70].addShapeBox(0F, 0F, -1F, 4, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 651
        gunModel[70].setRotationPoint(102F, -19.7F, -7F);

        gunModel[71].addShapeBox(0F, 0F, -1F, 4, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 0.3F, 0F, -1.1F, 0.3F, 0F, -1.1F, 0.3F, 0F, -1.1F, 0.3F, 0F); // Box 651
        gunModel[71].setRotationPoint(102F, -18.4F, -7F);

        gunModel[72].addShapeBox(0F, 0F, -1F, 2, 4, 12, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[72].setRotationPoint(105F, -38F, -5F);

        gunModel[73].addShapeBox(0F, 0F, -1F, 2, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[73].setRotationPoint(105F, -34F, -5F);

        gunModel[74].addShapeBox(0F, 0F, -1F, 2, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 651
        gunModel[74].setRotationPoint(105F, -30F, -5F);

        gunModel[75].addShapeBox(0F, 0F, -1F, 2, 3, 9, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 651
        gunModel[75].setRotationPoint(107F, -33.5F, -3.5F);

        gunModel[76].addShapeBox(0F, 0F, -1F, 2, 3, 9, 0F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 651
        gunModel[76].setRotationPoint(107F, -36.5F, -3.5F);

        gunModel[77].addShapeBox(0F, 0F, -1F, 2, 3, 9, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F); // Box 651
        gunModel[77].setRotationPoint(107F, -30.5F, -3.5F);

        gunModel[78].addShapeBox(0F, 0F, -1F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[78].setRotationPoint(109F, -33.5F, -3.5F);

        gunModel[79].addShapeBox(0F, 0F, -1F, 2, 3, 9, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 651
        gunModel[79].setRotationPoint(109F, -30.5F, -3.5F);

        gunModel[80].addShapeBox(0F, 0F, -1F, 3, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 651
        gunModel[80].setRotationPoint(102F, -27F, -6F);

        gunModel[81].addShapeBox(0F, 0F, -1F, 3, 6, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 651
        gunModel[81].setRotationPoint(102F, -27F, 5F);

        gunModel[82].addShapeBox(0F, 0F, -1F, 40, 2, 6, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[82].setRotationPoint(57F, -22F, -2F);

        gunModel[83].addShapeBox(0F, 0F, -1F, 45, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[83].setRotationPoint(57F, -18.5F, -2F);

        gunModel[84].addShapeBox(0F, 0F, -1F, 4, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 651
        gunModel[84].setRotationPoint(57F, -17.5F, -2F);

        gunModel[85].addShapeBox(0F, 0F, -1F, 45, 1, 6, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[85].setRotationPoint(57F, -19.5F, -2F);

        gunModel[86].addShapeBox(0F, 0F, -1F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[86].setRotationPoint(63F, -17.5F, -2F);

        gunModel[87].addShapeBox(0F, 0F, -1F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[87].setRotationPoint(67F, -17.5F, -2F);

        gunModel[88].addShapeBox(0F, 0F, -1F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[88].setRotationPoint(71F, -17.5F, -2F);

        gunModel[89].addShapeBox(0F, 0F, -1F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[89].setRotationPoint(75F, -17.5F, -2F);

        gunModel[90].addShapeBox(0F, 0F, -1F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[90].setRotationPoint(79F, -17.5F, -2F);

        gunModel[91].addShapeBox(0F, 0F, -1F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[91].setRotationPoint(83F, -17.5F, -2F);

        gunModel[92].addShapeBox(0F, 0F, -1F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[92].setRotationPoint(87F, -17.5F, -2F);

        gunModel[93].addShapeBox(0F, 0F, -1F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[93].setRotationPoint(91F, -17.5F, -2F);

        gunModel[94].addShapeBox(0F, 0F, -1F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[94].setRotationPoint(95F, -17.5F, -2F);

        gunModel[95].addShapeBox(0F, 0F, -1F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[95].setRotationPoint(99F, -17.5F, -2F);

        gunModel[96].addShapeBox(0F, 0F, -1F, 3, 17, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 651
        gunModel[96].setRotationPoint(102F, -40F, 4F);

        gunModel[97].addShapeBox(0F, 0F, -1F, 3, 17, 5, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[97].setRotationPoint(102F, -40F, -7F);

        gunModel[98].addShapeBox(0F, 0F, -1F, 3, 1, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 1F, 2F, 0F, 1F, 2F); // Box 651
        gunModel[98].setRotationPoint(102F, -41F, -7F);

        gunModel[99].addShapeBox(0F, 0F, -1F, 3, 3, 2, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[99].setRotationPoint(102F, -43F, -4F);

        gunModel[100].addShapeBox(0F, 0F, -1F, 3, 3, 2, 0F, 0F, -4.4F, 0F, 0F, -4.4F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 651
        gunModel[100].setRotationPoint(102F, -40F, -8F);

        gunModel[101].addShapeBox(0F, 0F, -1F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 3F, -2F, 0F, 3F, -2F); // Box 651
        gunModel[101].setRotationPoint(102F, -41F, 7F);

        gunModel[102].addShapeBox(0F, 0F, -1F, 3, 3, 2, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 651
        gunModel[102].setRotationPoint(102F, -43F, 4F);

        gunModel[103].addShapeBox(0F, 0F, -1F, 3, 3, 2, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -4.4F, 0F, 0F, -4.4F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 2F, -1F, 0F, 2F, -1F); // Box 651
        gunModel[103].setRotationPoint(102F, -40F, 8F);

        gunModel[104].addShapeBox(0F, 0F, -1F, 3, 1, 2, 0F, 0F, -1.4F, 1F, 0F, -1.4F, 1F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 3F, -4F, 0F, 3F, -4F); // Box 651
        gunModel[104].setRotationPoint(102F, -37F, 11F);

        gunModel[105].addShapeBox(0F, 0F, -1F, 3, 1, 2, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -1.4F, 1F, 0F, -1.4F, 1F, 0F, 3F, -4F, 0F, 3F, -4F, 0F, 1F, 2F, 0F, 1F, 2F); // Box 651
        gunModel[105].setRotationPoint(102F, -37F, -11F);

        gunModel[106].addShapeBox(0F, 0F, -1F, 6, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 4F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 2F, 4F, -3F); // Box 651
        gunModel[106].setRotationPoint(51F, -20F, -6F);

        gunModel[107].addShapeBox(0F, 0F, -1F, 26, 2, 16, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[107].setRotationPoint(1F, -46F, -7F);

        gunModel[108].addShapeBox(0F, 0F, -1F, 2, 2, 16, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 651
        gunModel[108].setRotationPoint(-1F, -46F, -7F);

        gunModel[109].addShapeBox(0F, 0F, -1F, 2, 2, 16, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[109].setRotationPoint(27F, -46F, -7F);

        gunModel[110].addShapeBox(0F, 0F, -1F, 41, 5, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[110].setRotationPoint(-1F, -51F, -6F);

        gunModel[111].addShapeBox(0F, 0F, -1F, 10, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[111].setRotationPoint(-11F, -51F, -6F);

        gunModel[112].addShapeBox(0F, 0F, -1F, 2, 5, 14, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 651
        gunModel[112].setRotationPoint(-13F, -51F, -6F);

        gunModel[113].addShapeBox(0F, 0F, -1F, 10, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 651
        gunModel[113].setRotationPoint(-11F, -47F, -6F);

        gunModel[114].addShapeBox(0F, 0F, -1F, 91, 8, 18, 0F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[114].setRotationPoint(-20F, -63F, -8F);

        gunModel[115].addShapeBox(0F, 0F, -1F, 92, 4, 18, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[115].setRotationPoint(-21F, -55F, -8F);

        gunModel[116].addShapeBox(0F, 0F, -1F, 31, 5, 16, 0F, 5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[116].setRotationPoint(40F, -51F, -7F);

        gunModel[117].addShapeBox(0F, 0F, -1F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[117].setRotationPoint(109F, -33.5F, 4.5F);

        gunModel[118].addShapeBox(0F, 0F, -1F, 2, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -6F, 0F, -1F, -6F); // Box 651
        gunModel[118].setRotationPoint(109F, -30.5F, -3.5F);

        gunModel[119].addShapeBox(0F, 0F, -1F, 2, 3, 9, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 651
        gunModel[119].setRotationPoint(109F, -36.5F, -3.5F);

        gunModel[120].addShapeBox(0F, 0F, -1F, 2, 3, 9, 0F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[120].setRotationPoint(109F, -36.5F, -3.5F);

        gunModel[121].addShapeBox(0F, 0F, -1F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[121].setRotationPoint(109F, -36.5F, -0.5F);

        gunModel[122].addShapeBox(0F, 0F, -1F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[122].setRotationPoint(109F, -28.5F, -0.5F);

        gunModel[123].addShapeBox(0F, 0F, -1F, 25, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[123].setRotationPoint(-49F, -33F, -7F);

        gunModel[124].addShapeBox(0F, 0F, -1F, 10, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[124].setRotationPoint(-41F, -28F, -8F);

        gunModel[125].addShapeBox(0F, 0F, -1F, 10, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[125].setRotationPoint(-41F, -26F, -8F);

        gunModel[126].addShapeBox(0F, 0F, -1F, 25, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[126].setRotationPoint(-49F, -25F, -7F);

        gunModel[127].addShapeBox(0F, 0F, -1F, 25, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 651
        gunModel[127].setRotationPoint(-49F, -27F, -7F);

        gunModel[128].addShapeBox(0F, 0F, -1F, 25, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[128].setRotationPoint(-49F, -34F, -7F);

        gunModel[129].addShapeBox(0F, 0F, -1F, 8, 5, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F); // Box 651
        gunModel[129].setRotationPoint(-21F, -51F, -8F);

        gunModel[130].addShapeBox(0F, 0F, -1F, 85, 4, 16, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 651
        gunModel[130].setRotationPoint(-17F, -59F, -7F);

        gunModel[131].addShapeBox(0F, 0F, -1F, 85, 1, 16, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 651
        gunModel[131].setRotationPoint(-17F, -60F, -7F);

        gunModel[132].addShapeBox(0F, 0F, -1F, 6, 7, 2, 0F, 0F, -4F, 1F, -1F, -4F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 651
        gunModel[132].setRotationPoint(22F, -56F, -9F);

        gunModel[133].addShapeBox(0F, 0F, -1F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[133].setRotationPoint(-23F, -60.5F, -1F);

        gunModel[134].addShapeBox(0F, 0F, -1F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, -1F); // Box 651
        gunModel[134].setRotationPoint(-23F, -60.5F, 3F);

        gunModel[135].addShapeBox(0F, 0F, -1F, 4, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[135].setRotationPoint(-23F, -56.5F, 6F);

        gunModel[136].addShapeBox(0F, 0F, -1F, 4, 1, 4, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[136].setRotationPoint(-23F, -49.5F, -5F);

        gunModel[137].addShapeBox(0F, 0F, -1F, 4, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[137].setRotationPoint(-23F, -56.5F, -5F);

        gunModel[138].addShapeBox(0F, 0F, -1F, 4, 1, 4, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[138].setRotationPoint(-23F, -60.5F, -5F);

        gunModel[139].addShapeBox(0F, 0F, -1F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[139].setRotationPoint(-23F, -49.5F, -1F);

        gunModel[140].addShapeBox(0F, 0F, -1F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 651
        gunModel[140].setRotationPoint(-23F, -49.5F, 3F);

        gunModel[141].addShapeBox(0F, 0F, -1F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[141].setRotationPoint(71F, -53.5F, 3.5F);

        gunModel[142].addShapeBox(0F, 0F, -1F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[142].setRotationPoint(71F, -51.5F, 1.5F);

        gunModel[143].addShapeBox(0F, 0F, -1F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F); // Box 651
        gunModel[143].setRotationPoint(71F, -48.5F, 5.5F);

        gunModel[144].addShapeBox(0F, 0F, -1F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[144].setRotationPoint(71F, -48.5F, 3.5F);

        gunModel[145].addShapeBox(0F, 0F, -1F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[145].setRotationPoint(71F, -51.5F, 6.5F);

        gunModel[146].addShapeBox(0F, 0F, -1F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[146].setRotationPoint(71F, -54.3F, -5F);

        gunModel[147].addShapeBox(0F, 0F, -1F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[147].setRotationPoint(71F, -48.3F, -5F);

        gunModel[148].addShapeBox(0F, 0F, -1F, 1, 7, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[148].setRotationPoint(71F, -54.3F, -6F);

        gunModel[149].addShapeBox(0F, 0F, -1F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 651
        gunModel[149].setRotationPoint(71F, -54.3F, -3F);

        gunModel[150].addShapeBox(0F, 0F, -1F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[150].setRotationPoint(71F, -62.5F, -0.5F);

        gunModel[151].addShapeBox(0F, 0F, -1F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 651
        gunModel[151].setRotationPoint(71F, -54.5F, 2.5F);

        gunModel[152].addShapeBox(0F, 0F, -1F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[152].setRotationPoint(71F, -59.5F, -3.5F);

        gunModel[153].addShapeBox(0F, 0F, -1F, 1, 1, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[153].setRotationPoint(71F, -62.5F, -3.5F);

        gunModel[154].addShapeBox(0F, 0F, -1F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[154].setRotationPoint(71F, -54.5F, -0.5F);

        gunModel[155].addShapeBox(0F, 0F, -1F, 1, 1, 3, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[155].setRotationPoint(71F, -54.5F, -3.5F);

        gunModel[156].addShapeBox(0F, 0F, -1F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[156].setRotationPoint(71F, -59.5F, 4.5F);

        gunModel[157].addShapeBox(0F, 0F, -1F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F); // Box 651
        gunModel[157].setRotationPoint(71F, -62.5F, 2.5F);

        gunModel[158].addShapeBox(0F, 0F, -1F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F); // Box 651
        gunModel[158].setRotationPoint(71F, -53.5F, 5.5F);

        gunModel[159].addShapeBox(0F, 0F, -1F, 1, 1, 3, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[159].setRotationPoint(71F, -48.5F, 0.5F);

        gunModel[160].addShapeBox(0F, 0F, -1F, 1, 1, 3, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[160].setRotationPoint(71F, -53.5F, 0.5F);

        gunModel[161].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 208
        gunModel[161].setRotationPoint(0F, -48.5F, -8F);
        gunModel[161].rotateAngleZ = 0.78539816F;

        gunModel[162].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 208
        gunModel[162].setRotationPoint(9F, -48.5F, -8F);
        gunModel[162].rotateAngleZ = 0.78539816F;

        gunModel[163].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 208
        gunModel[163].setRotationPoint(18F, -48.5F, -8F);
        gunModel[163].rotateAngleZ = 0.78539816F;

        gunModel[164].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 208
        gunModel[164].setRotationPoint(32F, -48.5F, -8F);
        gunModel[164].rotateAngleZ = 0.78539816F;

        gunModel[165].addShapeBox(0F, 0F, -1F, 0, 4, 2, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[165].setRotationPoint(71F, -52.5F, 3.5F);

        gunModel[166].addShapeBox(0F, 0F, -1F, 0, 2, 1, 0F, 0F, 1F, 0F, 0.2F, 1F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.2F, 1F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[166].setRotationPoint(71F, -51.5F, 5.5F);

        gunModel[167].addShapeBox(0F, 0F, -1F, 0, 2, 1, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 1F, 0F, 0F, 1F, 0F); // Box 651
        gunModel[167].setRotationPoint(71F, -51.5F, 2.5F);

        gunModel[168].addShapeBox(0F, 0F, -1F, 0, 7, 3, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[168].setRotationPoint(71F, -61.5F, -0.5F);

        gunModel[169].addShapeBox(0F, 0F, -1F, 0, 7, 2, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -2F, 0F, 0F, -2F, 0F); // Box 651
        gunModel[169].setRotationPoint(71F, -61.5F, 2.5F);

        gunModel[170].addShapeBox(0F, 0F, -1F, 0, 7, 2, 0F, 0F, -2F, 0F, 0.2F, -2F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0.2F, -2F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[170].setRotationPoint(71F, -61.5F, -2.5F);

        gunModel[171].addShapeBox(0F, 0F, -1F, 0, 10, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[171].setRotationPoint(-22F, -59.5F, -1F);

        gunModel[172].addShapeBox(0F, 0F, -1F, 0, 10, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 651
        gunModel[172].setRotationPoint(-22F, -59.5F, 3F);

        gunModel[173].addShapeBox(0F, 0F, -1F, 0, 10, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[173].setRotationPoint(-22F, -59.5F, -4F);

        gunModel[174].addShapeBox(1F, 1.43F, -8F, 75, 1, 16, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 651
        gunModel[174].setRotationPoint(26F, -31F, 0F);
        gunModel[174].rotateAngleX = 0.34906585F;

        gunModel[175].addShapeBox(1F, 1.43F, -8F, 75, 1, 16, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 651
        gunModel[175].setRotationPoint(26F, -31F, 0F);
        gunModel[175].rotateAngleX = 0.6981317F;

        gunModel[176].addShapeBox(1F, 1.43F, -8F, 75, 1, 16, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 651
        gunModel[176].setRotationPoint(26F, -31F, 0F);
        gunModel[176].rotateAngleX = 1.04719755F;

        gunModel[177].addShapeBox(1F, 1.43F, -8F, 75, 1, 16, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 651
        gunModel[177].setRotationPoint(26F, -31F, 0F);
        gunModel[177].rotateAngleX = 1.3962634F;

        gunModel[178].addShapeBox(1F, 1.43F, -8F, 75, 1, 16, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 651
        gunModel[178].setRotationPoint(26F, -31F, 0F);
        gunModel[178].rotateAngleX = 1.74532925F;

        gunModel[179].addShapeBox(1F, 1.43F, -8F, 75, 1, 16, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 651
        gunModel[179].setRotationPoint(26F, -31F, 0F);
        gunModel[179].rotateAngleX = -0.34906585F;

        gunModel[180].addShapeBox(1F, 1.43F, -8F, 75, 1, 16, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 651
        gunModel[180].setRotationPoint(26F, -31F, 0F);
        gunModel[180].rotateAngleX = -0.6981317F;

        gunModel[181].addShapeBox(1F, 1.43F, -8F, 75, 1, 16, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 651
        gunModel[181].setRotationPoint(26F, -31F, 0F);
        gunModel[181].rotateAngleX = -1.04719755F;


        ammoModel = new ModelRendererTurbo[4];
        ammoModel[0] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Import
        ammoModel[1] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Import
        ammoModel[2] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Import
        ammoModel[3] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Import

        ammoModel[0].addShapeBox(0F, 0F, 0F, 22, 17, 10, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, -1F, 0.0F, 0F, 1F, 0.0F, 0F, 1F, 0.0F, 0F, -1F, 0.0F, 0F); // Import
        ammoModel[0].setRotationPoint(-43.5F, -14F, -5F);

        ammoModel[1].addShapeBox(0F, 0F, 0F, 22, 5, 10, 0F, -1F, 0.0F, 0F, 1F, 0.0F, 0F, 1F, 0.0F, 0F, -1F, 0.0F, 0F, -2F, 0.0F, 0F, 2F, 0.0F, 0F, 2F, 0.0F, 0F, -2F, 0.0F, 0F); // Import
        ammoModel[1].setRotationPoint(-43.5F, 3F, -5F);

        ammoModel[2].addShapeBox(0F, 0F, 0F, 22, 6, 10, 0F, -1F, 0.0F, 0F, 1F, 0.0F, 0F, 1F, 0.0F, 0F, -1F, 0.0F, 0F, -2.5F, 0.0F, 0F, 2.0F, 0.0F, 0F, 2.0F, 0.0F, 0F, -2.5F, 0.0F, 0F); // Import
        ammoModel[2].setRotationPoint(-42.5F, 8F, -5F);

        ammoModel[3].addShapeBox(0F, 0F, 0F, 22, 5, 10, 0F, -0.5F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, -0.5F, 0.0F, 0F, -2.5F, -1F, 0F, -13.5F, -0.5F, 0F, -13.5F, -0.5F, 0F, -2.5F, -1F, 0F); // Import
        ammoModel[3].setRotationPoint(-40.5F, 14F, -5F);


        slideModel = new ModelRendererTurbo[23];
        slideModel[0] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 651
        slideModel[1] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 651
        slideModel[2] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 651
        slideModel[3] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 651
        slideModel[4] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 651
        slideModel[5] = new ModelRendererTurbo(this, 337, 265, textureX, textureY); // Box 651
        slideModel[6] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 651
        slideModel[7] = new ModelRendererTurbo(this, 337, 273, textureX, textureY); // Box 651
        slideModel[8] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 651
        slideModel[9] = new ModelRendererTurbo(this, 353, 281, textureX, textureY); // Box 651
        slideModel[10] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 651
        slideModel[11] = new ModelRendererTurbo(this, 337, 289, textureX, textureY); // Box 651
        slideModel[12] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 651
        slideModel[13] = new ModelRendererTurbo(this, 337, 297, textureX, textureY); // Box 651
        slideModel[14] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Box 651
        slideModel[15] = new ModelRendererTurbo(this, 353, 305, textureX, textureY); // Box 651
        slideModel[16] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Box 651
        slideModel[17] = new ModelRendererTurbo(this, 337, 313, textureX, textureY); // Box 651
        slideModel[18] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 651
        slideModel[19] = new ModelRendererTurbo(this, 337, 321, textureX, textureY); // Box 651
        slideModel[20] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 651
        slideModel[21] = new ModelRendererTurbo(this, 353, 329, textureX, textureY); // Box 651
        slideModel[22] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Box 651

        slideModel[0].addShapeBox(0F, 0.31F, -2F, 68, 1, 4, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 651
        slideModel[0].setRotationPoint(27F, -42F, 0F);

        slideModel[1].addShapeBox(0F, 0.31F, -2F, 3, 1, 4, 0F, 0F, 0.633F, 0F, 0F, 0.475F, -1F, 0F, 0.475F, -1F, 0F, 0.633F, 0F, 0F, -1F, 0F, 0F, -1.158F, -1F, 0F, -1.158F, -1F, 0F, -1F, 0F); // Box 651
        slideModel[1].setRotationPoint(95F, -42F, 0F);

        slideModel[2].addShapeBox(0F, 0.31F, -2F, 2, 1, 6, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, -0.2F, 0F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -1F, 0F, 0F, -1F, -0.2F); // Box 651
        slideModel[2].setRotationPoint(94.5F, -41.75F, 2.5F);

        slideModel[3].addShapeBox(0F, 0.31F, -2F, 2, 1, 6, 0F, 0F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, -0.2F, 0F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, 0F, -1F, -0.2F); // Box 651
        slideModel[3].setRotationPoint(94.5F, -42.75F, 2.5F);

        slideModel[4].addShapeBox(0F, 0.31F, -2F, 1, 1, 6, 0F, 0.4F, 0.7F, 0F, -1F, 0.2F, 0F, -1F, 0F, -0.2F, 0.4F, 0.2F, 0F, 0.4F, 0.5F, 0F, -1F, 0F, 0F, -1F, -0.2F, -0.2F, 0.4F, 0F, 0F); // Box 651
        slideModel[4].setRotationPoint(96.5F, -42.75F, 2.5F);

        slideModel[5].addShapeBox(0F, 0.31F, -2F, 68, 1, 4, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 651
        slideModel[5].setRotationPoint(27F, -42F, 0F);
        slideModel[5].rotateAngleX = 0.31415927F;

        slideModel[6].addShapeBox(0F, 0.31F, -2F, 3, 1, 4, 0F, 0F, 0.633F, 0F, 0F, 0.475F, -1F, 0F, 0.475F, -1F, 0F, 0.633F, 0F, 0F, -1F, 0F, 0F, -1.158F, -1F, 0F, -1.158F, -1F, 0F, -1F, 0F); // Box 651
        slideModel[6].setRotationPoint(95F, -42F, 0F);
        slideModel[6].rotateAngleX = 0.31415927F;

        slideModel[7].addShapeBox(0F, 0.31F, -2F, 68, 1, 4, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 651
        slideModel[7].setRotationPoint(27F, -42F, 0F);
        slideModel[7].rotateAngleX = 0.62831853F;

        slideModel[8].addShapeBox(0F, 0.31F, -2F, 3, 1, 4, 0F, 0F, 0.633F, 0F, 0F, 0.475F, -1F, 0F, 0.475F, -1F, 0F, 0.633F, 0F, 0F, -1F, 0F, 0F, -1.158F, -1F, 0F, -1.158F, -1F, 0F, -1F, 0F); // Box 651
        slideModel[8].setRotationPoint(95F, -42F, 0F);
        slideModel[8].rotateAngleX = 0.62831853F;

        slideModel[9].addShapeBox(0F, 0.31F, -2F, 68, 1, 4, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 651
        slideModel[9].setRotationPoint(27F, -42F, 0F);
        slideModel[9].rotateAngleX = -0.31415927F;

        slideModel[10].addShapeBox(0F, 0.31F, -2F, 3, 1, 4, 0F, 0F, 0.633F, 0F, 0F, 0.475F, -1F, 0F, 0.475F, -1F, 0F, 0.633F, 0F, 0F, -1F, 0F, 0F, -1.158F, -1F, 0F, -1.158F, -1F, 0F, -1F, 0F); // Box 651
        slideModel[10].setRotationPoint(95F, -42F, 0F);
        slideModel[10].rotateAngleX = -0.31415927F;

        slideModel[11].addShapeBox(0F, 0.31F, -2F, 68, 1, 4, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 651
        slideModel[11].setRotationPoint(27F, -42F, 0F);
        slideModel[11].rotateAngleX = -0.62831853F;

        slideModel[12].addShapeBox(0F, 0.31F, -2F, 3, 1, 4, 0F, 0F, 0.633F, 0F, 0F, 0.475F, -1F, 0F, 0.475F, -1F, 0F, 0.633F, 0F, 0F, -1F, 0F, 0F, -1.158F, -1F, 0F, -1.158F, -1F, 0F, -1F, 0F); // Box 651
        slideModel[12].setRotationPoint(95F, -42F, 0F);
        slideModel[12].rotateAngleX = -0.62831853F;

        slideModel[13].addShapeBox(0F, 0.31F, -2F, 68, 1, 4, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 651
        slideModel[13].setRotationPoint(27F, -42F, 0F);
        slideModel[13].rotateAngleX = 0.9424778F;

        slideModel[14].addShapeBox(0F, 0.31F, -2F, 3, 1, 4, 0F, 0F, 0.633F, 0F, 0F, 0.475F, -1F, 0F, 0.475F, -1F, 0F, 0.633F, 0F, 0F, -1F, 0F, 0F, -1.158F, -1F, 0F, -1.158F, -1F, 0F, -1F, 0F); // Box 651
        slideModel[14].setRotationPoint(95F, -42F, 0F);
        slideModel[14].rotateAngleX = 0.9424778F;

        slideModel[15].addShapeBox(0F, 0.31F, -2F, 68, 1, 4, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 651
        slideModel[15].setRotationPoint(27F, -42F, 0F);
        slideModel[15].rotateAngleX = -0.9424778F;

        slideModel[16].addShapeBox(0F, 0.31F, -2F, 3, 1, 4, 0F, 0F, 0.633F, 0F, 0F, 0.475F, -1F, 0F, 0.475F, -1F, 0F, 0.633F, 0F, 0F, -1F, 0F, 0F, -1.158F, -1F, 0F, -1.158F, -1F, 0F, -1F, 0F); // Box 651
        slideModel[16].setRotationPoint(95F, -42F, 0F);
        slideModel[16].rotateAngleX = -0.9424778F;

        slideModel[17].addShapeBox(0F, 0.31F, -2F, 68, 1, 4, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 651
        slideModel[17].setRotationPoint(27F, -42F, 0F);
        slideModel[17].rotateAngleX = 1.25663706F;

        slideModel[18].addShapeBox(0F, 0.31F, -2F, 3, 1, 4, 0F, 0F, 0.633F, 0F, 0F, 0.475F, -1F, 0F, 0.475F, -1F, 0F, 0.633F, 0F, 0F, -1F, 0F, 0F, -1.158F, -1F, 0F, -1.158F, -1F, 0F, -1F, 0F); // Box 651
        slideModel[18].setRotationPoint(95F, -42F, 0F);
        slideModel[18].rotateAngleX = 1.25663706F;

        slideModel[19].addShapeBox(0F, 0.31F, -2F, 68, 1, 4, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 651
        slideModel[19].setRotationPoint(27F, -42F, 0F);
        slideModel[19].rotateAngleX = -1.25663706F;

        slideModel[20].addShapeBox(0F, 0.31F, -2F, 3, 1, 4, 0F, 0F, 0.633F, 0F, 0F, 0.475F, -1F, 0F, 0.475F, -1F, 0F, 0.633F, 0F, 0F, -1F, 0F, 0F, -1.158F, -1F, 0F, -1.158F, -1F, 0F, -1F, 0F); // Box 651
        slideModel[20].setRotationPoint(95F, -42F, 0F);
        slideModel[20].rotateAngleX = -1.25663706F;

        slideModel[21].addShapeBox(0F, 0.31F, -2F, 68, 1, 4, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, 0.633F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 651
        slideModel[21].setRotationPoint(27F, -42F, 0F);
        slideModel[21].rotateAngleX = 1.57079633F;

        slideModel[22].addShapeBox(0F, 0.31F, -2F, 3, 1, 4, 0F, 0F, 0.633F, 0F, 0F, 0.475F, -1F, 0F, 0.475F, -1F, 0F, 0.633F, 0F, 0F, -1F, 0F, 0F, -1.158F, -1F, 0F, -1.158F, -1F, 0F, -1F, 0F); // Box 651
        slideModel[22].setRotationPoint(95F, -42F, 0F);
        slideModel[22].rotateAngleX = 1.57079633F;

        gunSlideDistance = 25F;
        leftArmPos = new Vector3f(0.05F, -0.4F, -0.05F);
        leftArmRot = new Vector3f(80F, 50F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.45F, -0.95F, -0.05F);
        leftArmReloadRot = new Vector3f(80.0F, 50.0F, 0.0F);

        rightArmPos = new Vector3f(0.25F, -0.54F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85.0F);

        rightArmReloadPos = new Vector3f(0.25F, -0.54F, 0.05F);
        rightArmReloadRot = new Vector3f(0.0F, 20.0F, -85.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
        rightHandAmmo = false;
        leftHandAmmo = true;

        fancyStance = true;
        stanceTranslate = new Vector3f(0.5D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(45.0F, 0.0F, 1.0F);
        animationType = EnumAnimationType.CUSTOM;
        rotateGunHorizontal = 15.0F;
        tiltGun = 30.0F;
        translateGun = new Vector3f(0.0F, -0.0625F, -0.1875F);
        translateClip = new Vector3f(0.0F, -0.625F, 0.0F);
        hasFlash = true;
        hasArms = true;
        translateAll(0F, -18F, 0F);
        flipAll();
    }
}