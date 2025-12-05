//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PF89
// Model Creator: 
// Created on: 29.03.2022 - 11:31:51
// Last changed on: 29.03.2022 - 11:31:51

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelPF89 extends ModelGun //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public ModelPF89() //Same as Filename
    {
        ammoModel = new ModelRendererTurbo[157];
        ammoModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 136
        ammoModel[1] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 136
        ammoModel[2] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 136
        ammoModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 136
        ammoModel[4] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 136
        ammoModel[5] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 136
        ammoModel[6] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 136
        ammoModel[7] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 136
        ammoModel[8] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 136
        ammoModel[9] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 136
        ammoModel[10] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 136
        ammoModel[11] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 136
        ammoModel[12] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 136
        ammoModel[13] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 136
        ammoModel[14] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 136
        ammoModel[15] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 136
        ammoModel[16] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 136
        ammoModel[17] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 136
        ammoModel[18] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 136
        ammoModel[19] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 136
        ammoModel[20] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 136
        ammoModel[21] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 136
        ammoModel[22] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 136
        ammoModel[23] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 136
        ammoModel[24] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 136
        ammoModel[25] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 136
        ammoModel[26] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 136
        ammoModel[27] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 136
        ammoModel[28] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 136
        ammoModel[29] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 136
        ammoModel[30] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 136
        ammoModel[31] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 136
        ammoModel[32] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 136
        ammoModel[33] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 136
        ammoModel[34] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 136
        ammoModel[35] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 136
        ammoModel[36] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 136
        ammoModel[37] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 136
        ammoModel[38] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 136
        ammoModel[39] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 136
        ammoModel[40] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 136
        ammoModel[41] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 136
        ammoModel[42] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 136
        ammoModel[43] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 136
        ammoModel[44] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 136
        ammoModel[45] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 136
        ammoModel[46] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 136
        ammoModel[47] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 136
        ammoModel[48] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 136
        ammoModel[49] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 136
        ammoModel[50] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 136
        ammoModel[51] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 136
        ammoModel[52] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 136
        ammoModel[53] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 136
        ammoModel[54] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 136
        ammoModel[55] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 136
        ammoModel[56] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 136
        ammoModel[57] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 136
        ammoModel[58] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 136
        ammoModel[59] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 136
        ammoModel[60] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 80
        ammoModel[61] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 80
        ammoModel[62] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 80
        ammoModel[63] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 80
        ammoModel[64] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 80
        ammoModel[65] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 80
        ammoModel[66] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 80
        ammoModel[67] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 80
        ammoModel[68] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 80
        ammoModel[69] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 80
        ammoModel[70] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 80
        ammoModel[71] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 136
        ammoModel[72] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 136
        ammoModel[73] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 136
        ammoModel[74] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 136
        ammoModel[75] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 136
        ammoModel[76] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 136
        ammoModel[77] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 136
        ammoModel[78] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 136
        ammoModel[79] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 136
        ammoModel[80] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 136
        ammoModel[81] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 136
        ammoModel[82] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 136
        ammoModel[83] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 136
        ammoModel[84] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 136
        ammoModel[85] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 136
        ammoModel[86] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 136
        ammoModel[87] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 136
        ammoModel[88] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 80
        ammoModel[89] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 80
        ammoModel[90] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 80
        ammoModel[91] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 80
        ammoModel[92] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 80
        ammoModel[93] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 80
        ammoModel[94] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 80
        ammoModel[95] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 80
        ammoModel[96] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 80
        ammoModel[97] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 80
        ammoModel[98] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 80
        ammoModel[99] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 80
        ammoModel[100] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 80
        ammoModel[101] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 124
        ammoModel[102] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 124
        ammoModel[103] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 124
        ammoModel[104] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 127
        ammoModel[105] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 127
        ammoModel[106] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 127
        ammoModel[107] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 130
        ammoModel[108] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 130
        ammoModel[109] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 130
        ammoModel[110] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 133
        ammoModel[111] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 133
        ammoModel[112] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 133
        ammoModel[113] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 133
        ammoModel[114] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 137
        ammoModel[115] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 137
        ammoModel[116] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 137
        ammoModel[117] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 137
        ammoModel[118] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 137
        ammoModel[119] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 137
        ammoModel[120] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 137
        ammoModel[121] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 137
        ammoModel[122] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 137
        ammoModel[123] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 137
        ammoModel[124] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 137
        ammoModel[125] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Box 137
        ammoModel[126] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 137
        ammoModel[127] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 150
        ammoModel[128] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 150
        ammoModel[129] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 150
        ammoModel[130] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 153
        ammoModel[131] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 153
        ammoModel[132] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 137
        ammoModel[133] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 137
        ammoModel[134] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Box 137
        ammoModel[135] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 137
        ammoModel[136] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 137
        ammoModel[137] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 137
        ammoModel[138] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 137
        ammoModel[139] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 137
        ammoModel[140] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 137
        ammoModel[141] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 137
        ammoModel[142] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 137
        ammoModel[143] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 137
        ammoModel[144] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 137
        ammoModel[145] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 137
        ammoModel[146] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 137
        ammoModel[147] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 137
        ammoModel[148] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 137
        ammoModel[149] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 137
        ammoModel[150] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 137
        ammoModel[151] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 137
        ammoModel[152] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 137
        ammoModel[153] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 137
        ammoModel[154] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 137
        ammoModel[155] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 137
        ammoModel[156] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 137

        ammoModel[0].addShapeBox(0F, 0F, 0F, 115, 14, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[0].setRotationPoint(-77F, -38F, -7F);

        ammoModel[1].addShapeBox(0F, 0F, 0F, 115, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[1].setRotationPoint(-77F, -33F, -3F);

        ammoModel[2].addShapeBox(0F, 0F, 0F, 115, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[2].setRotationPoint(-77F, -33F, -12F);

        ammoModel[3].addShapeBox(0F, 0F, 0F, 115, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -1.75F, 0F, -1.75F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[3].setRotationPoint(-77F, -38F, -3F);

        ammoModel[4].addShapeBox(0F, 0F, 0F, 115, 5, 5, 0F, 0F, -1.75F, -1.75F, 0F, -1.75F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[4].setRotationPoint(-77F, -38F, -12F);

        ammoModel[5].addShapeBox(0F, 0F, 0F, 115, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -1.75F, 0F, -1.75F, -1.75F); // Box 136
        ammoModel[5].setRotationPoint(-77F, -29F, -3F);

        ammoModel[6].addShapeBox(0F, 0F, 0F, 115, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -1.75F, 0F, -1.75F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[6].setRotationPoint(-77F, -29F, -12F);

        ammoModel[7].addShapeBox(0F, 0F, 0F, 5, 26, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[7].setRotationPoint(40F, -44F, -8F);

        ammoModel[8].addShapeBox(0F, 0F, 0F, 5, 6, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[8].setRotationPoint(40F, -34F, -2F);

        ammoModel[9].addShapeBox(0F, 0F, 0F, 5, 6, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[9].setRotationPoint(40F, -34F, -18F);

        ammoModel[10].addShapeBox(0F, 0F, 0F, 5, 10, 10, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[10].setRotationPoint(40F, -44F, -18F);

        ammoModel[11].addShapeBox(0F, 0F, 0F, 5, 10, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F); // Box 136
        ammoModel[11].setRotationPoint(40F, -28F, -2F);

        ammoModel[12].addShapeBox(0F, 0F, 0F, 5, 10, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[12].setRotationPoint(40F, -28F, -18F);

        ammoModel[13].addShapeBox(0F, 0F, 0F, 5, 16, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[13].setRotationPoint(45F, -39F, -7F);

        ammoModel[14].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[14].setRotationPoint(45F, -33F, -3F);

        ammoModel[15].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[15].setRotationPoint(45F, -33F, -13F);

        ammoModel[16].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[16].setRotationPoint(45F, -39F, -3F);

        ammoModel[17].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 136
        ammoModel[17].setRotationPoint(45F, -29F, -3F);

        ammoModel[18].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[18].setRotationPoint(45F, -39F, -13F);

        ammoModel[19].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[19].setRotationPoint(45F, -29F, -13F);

        ammoModel[20].addShapeBox(0F, 0F, 0F, 2, 16, 4, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[20].setRotationPoint(50F, -39F, -7F);

        ammoModel[21].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 136
        ammoModel[21].setRotationPoint(50F, -33F, -3F);

        ammoModel[22].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[22].setRotationPoint(50F, -33F, -13F);

        ammoModel[23].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3.5F, -3.5F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 136
        ammoModel[23].setRotationPoint(50F, -39F, -3F);

        ammoModel[24].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F, 0F, -2F, -2F, 0F, -3.5F, -3.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[24].setRotationPoint(50F, -39F, -13F);

        ammoModel[25].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3.5F, -3.5F, 0F, -2F, -2F); // Box 136
        ammoModel[25].setRotationPoint(50F, -29F, -3F);

        ammoModel[26].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -3.5F, -3.5F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[26].setRotationPoint(50F, -29F, -13F);

        ammoModel[27].addShapeBox(0F, 0F, 0F, 2, 22, 6, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 136
        ammoModel[27].setRotationPoint(-79F, -42F, -8F);

        ammoModel[28].addShapeBox(0F, 0F, 0F, 2, 6, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 136
        ammoModel[28].setRotationPoint(-79F, -34F, -2F);

        ammoModel[29].addShapeBox(0F, 0F, 0F, 2, 6, 8, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[29].setRotationPoint(-79F, -34F, -16F);

        ammoModel[30].addShapeBox(0F, 0F, 0F, 2, 8, 8, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 136
        ammoModel[30].setRotationPoint(-79F, -42F, -2F);

        ammoModel[31].addShapeBox(0F, 0F, 0F, 5, 26, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[31].setRotationPoint(-84F, -44F, -8F);

        ammoModel[32].addShapeBox(0F, 0F, 0F, 5, 6, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[32].setRotationPoint(-84F, -34F, -2F);

        ammoModel[33].addShapeBox(0F, 0F, 0F, 5, 6, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[33].setRotationPoint(-84F, -34F, -18F);

        ammoModel[34].addShapeBox(0F, 0F, 0F, 5, 10, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[34].setRotationPoint(-84F, -44F, -2F);

        ammoModel[35].addShapeBox(0F, 0F, 0F, 5, 10, 10, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[35].setRotationPoint(-84F, -44F, -18F);

        ammoModel[36].addShapeBox(0F, 0F, 0F, 5, 10, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F); // Box 136
        ammoModel[36].setRotationPoint(-84F, -28F, -2F);

        ammoModel[37].addShapeBox(0F, 0F, 0F, 5, 10, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[37].setRotationPoint(-84F, -28F, -18F);

        ammoModel[38].addShapeBox(0F, 0F, 0F, 5, 18, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[38].setRotationPoint(-89F, -40F, -7F);

        ammoModel[39].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[39].setRotationPoint(-89F, -33F, -3F);

        ammoModel[40].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[40].setRotationPoint(-89F, -33F, -14F);

        ammoModel[41].addShapeBox(0F, 0F, 0F, 5, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[41].setRotationPoint(-89F, -40F, -3F);

        ammoModel[42].addShapeBox(0F, 0F, 0F, 5, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 136
        ammoModel[42].setRotationPoint(-89F, -29F, -3F);

        ammoModel[43].addShapeBox(0F, 0F, 0F, 5, 7, 7, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[43].setRotationPoint(-89F, -40F, -14F);

        ammoModel[44].addShapeBox(0F, 0F, 0F, 5, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[44].setRotationPoint(-89F, -29F, -14F);

        ammoModel[45].addShapeBox(0F, 0F, 0F, 2, 18, 4, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 136
        ammoModel[45].setRotationPoint(-91F, -40F, -7F);

        ammoModel[46].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 136
        ammoModel[46].setRotationPoint(-91F, -33F, -3F);

        ammoModel[47].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[47].setRotationPoint(-91F, -33F, -14F);

        ammoModel[48].addShapeBox(0F, 0F, 0F, 2, 7, 7, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -3.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 136
        ammoModel[48].setRotationPoint(-91F, -40F, -3F);

        ammoModel[49].addShapeBox(0F, 0F, 0F, 2, 7, 7, 0F, 0F, -3.5F, -3.5F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[49].setRotationPoint(-91F, -40F, -14F);

        ammoModel[50].addShapeBox(0F, 0F, 0F, 2, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -3.5F, -3.5F); // Box 136
        ammoModel[50].setRotationPoint(-91F, -29F, -3F);

        ammoModel[51].addShapeBox(0F, 0F, 0F, 2, 7, 7, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -3.5F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 136
        ammoModel[51].setRotationPoint(-91F, -29F, -14F);

        ammoModel[52].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[52].setRotationPoint(40F, -36F, 4F);

        ammoModel[53].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[53].setRotationPoint(40F, -35F, 2F);

        ammoModel[54].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[54].setRotationPoint(40F, -35F, -2F);

        ammoModel[55].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[55].setRotationPoint(40F, -40F, -2F);

        ammoModel[56].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 136
        ammoModel[56].setRotationPoint(40F, -38F, -2F);

        ammoModel[57].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[57].setRotationPoint(40F, -36F, 7F);

        ammoModel[58].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 136
        ammoModel[58].setRotationPoint(40F, -43F, -2F);

        ammoModel[59].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 136
        ammoModel[59].setRotationPoint(40F, -44F, -2F);

        ammoModel[60].addShapeBox(0F, 0F, 0F, 17, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
        ammoModel[60].setRotationPoint(-4F, -23F, -7F);

        ammoModel[61].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 80
        ammoModel[61].setRotationPoint(4F, -20F, -7F);

        ammoModel[62].addBox(0F, 0F, 0F, 5, 17, 4, 0F); // Box 80
        ammoModel[62].setRotationPoint(-2F, -18F, -7F);

        ammoModel[63].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
        ammoModel[63].setRotationPoint(-2F, -20F, -8F);

        ammoModel[64].addShapeBox(0F, 0F, 0F, 1, 17, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 80
        ammoModel[64].setRotationPoint(3F, -18F, -8F);

        ammoModel[65].addShapeBox(0F, 0F, 0F, 1, 17, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 80
        ammoModel[65].setRotationPoint(-3F, -18F, -8F);

        ammoModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 80
        ammoModel[66].setRotationPoint(-3F, -20F, -8F);

        ammoModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 80
        ammoModel[67].setRotationPoint(3F, -20F, -8F);

        ammoModel[68].addShapeBox(0F, 0F, 0F, 18, 2, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
        ammoModel[68].setRotationPoint(-5F, -25F, -7F);

        ammoModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 80
        ammoModel[69].setRotationPoint(-5F, -23F, -7F);

        ammoModel[70].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F); // Box 80
        ammoModel[70].setRotationPoint(5F, -20F, -7F);

        ammoModel[71].addShapeBox(0F, 0F, 0F, 2, 8, 8, 0F, 0F, -1F, -1F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[71].setRotationPoint(-79F, -42F, -16F);

        ammoModel[72].addShapeBox(0F, 0F, 0F, 2, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -1F, -1F); // Box 136
        ammoModel[72].setRotationPoint(-79F, -28F, -2F);

        ammoModel[73].addShapeBox(0F, 0F, 0F, 2, 8, 8, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 136
        ammoModel[73].setRotationPoint(-79F, -28F, -16F);

        ammoModel[74].addShapeBox(0F, 0F, 0F, 2, 26, 6, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 136
        ammoModel[74].setRotationPoint(38F, -44F, -8F);

        ammoModel[75].addShapeBox(0F, 0F, 0F, 2, 6, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 136
        ammoModel[75].setRotationPoint(38F, -34F, -2F);

        ammoModel[76].addShapeBox(0F, 0F, 0F, 2, 6, 10, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[76].setRotationPoint(38F, -34F, -18F);

        ammoModel[77].addShapeBox(0F, 0F, 0F, 2, 10, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -4.5F, -4.5F); // Box 136
        ammoModel[77].setRotationPoint(38F, -28F, -2F);

        ammoModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 136
        ammoModel[78].setRotationPoint(38F, -36F, 4F);

        ammoModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[79].setRotationPoint(38F, -35F, 2F);

        ammoModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[80].setRotationPoint(38F, -35F, -2F);

        ammoModel[81].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[81].setRotationPoint(38F, -40F, -2F);

        ammoModel[82].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 136
        ammoModel[82].setRotationPoint(38F, -38F, -2F);

        ammoModel[83].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, -1F, 0F, -0.5F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 136
        ammoModel[83].setRotationPoint(38F, -36F, 7F);

        ammoModel[84].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 136
        ammoModel[84].setRotationPoint(38F, -43F, -2F);

        ammoModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -2F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 136
        ammoModel[85].setRotationPoint(38F, -44F, -2F);

        ammoModel[86].addShapeBox(0F, 0F, 0F, 2, 10, 10, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4.5F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 136
        ammoModel[86].setRotationPoint(38F, -28F, -18F);

        ammoModel[87].addShapeBox(0F, 0F, 0F, 2, 10, 10, 0F, 0F, -4.5F, -4.5F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        ammoModel[87].setRotationPoint(38F, -44F, -18F);

        ammoModel[88].addBox(0F, 0F, 0F, 5, 4, 6, 0F); // Box 80
        ammoModel[88].setRotationPoint(-2F, -18F, -8F);

        ammoModel[89].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 80
        ammoModel[89].setRotationPoint(-1F, -13.5F, -8F);

        ammoModel[90].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 80
        ammoModel[90].setRotationPoint(-1F, -12F, -8F);

        ammoModel[91].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 80
        ammoModel[91].setRotationPoint(-1F, -10.5F, -8F);

        ammoModel[92].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 80
        ammoModel[92].setRotationPoint(-1F, -9F, -8F);

        ammoModel[93].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 80
        ammoModel[93].setRotationPoint(-1F, -7.5F, -8F);

        ammoModel[94].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 80
        ammoModel[94].setRotationPoint(-1F, -6F, -8F);

        ammoModel[95].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 80
        ammoModel[95].setRotationPoint(-1F, -4.5F, -8F);

        ammoModel[96].addBox(0F, 0F, 0F, 4, 2, 6, 0F); // Box 80
        ammoModel[96].setRotationPoint(-1F, -3F, -8F);

        ammoModel[97].addBox(0F, 0F, 0F, 1, 13, 6, 0F); // Box 80
        ammoModel[97].setRotationPoint(-2F, -14F, -8F);

        ammoModel[98].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
        ammoModel[98].setRotationPoint(14F, -24F, -7F);

        ammoModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 80
        ammoModel[99].setRotationPoint(13F, -23F, -7F);

        ammoModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
        ammoModel[100].setRotationPoint(13F, -25F, -7F);

        ammoModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, -0.6F, -0.15F, 0F, -0.6F, -0.15F, 0F, -0.6F, -0.15F, 0F, -0.6F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 124
        ammoModel[101].setRotationPoint(-2F, -22.5F, -8F);

        ammoModel[102].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 124
        ammoModel[102].setRotationPoint(-2F, -21.75F, -8F);

        ammoModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F); // Box 124
        ammoModel[103].setRotationPoint(-2F, -21F, -8F);

        ammoModel[104].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 127
        ammoModel[104].setRotationPoint(8.5F, -20F, -5.5F);

        ammoModel[105].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 127
        ammoModel[105].setRotationPoint(8.5F, -19F, -5.5F);

        ammoModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 127
        ammoModel[106].setRotationPoint(9F, -17F, -5.5F);

        ammoModel[107].addShapeBox(0F, 0F, 0F, 5, 7, 4, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
        ammoModel[107].setRotationPoint(-52F, -45F, -7F);

        ammoModel[108].addShapeBox(0F, 0F, 0F, 5, 7, 4, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
        ammoModel[108].setRotationPoint(-26F, -45F, -7F);

        ammoModel[109].addShapeBox(0F, 0F, 0F, 27, 2, 4, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
        ammoModel[109].setRotationPoint(-50F, -47F, -7F);

        ammoModel[110].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 133
        ammoModel[110].setRotationPoint(-47F, -45F, -7F);

        ammoModel[111].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 133
        ammoModel[111].setRotationPoint(-28F, -45F, -7F);

        ammoModel[112].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
        ammoModel[112].setRotationPoint(-47F, -40F, -7F);

        ammoModel[113].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
        ammoModel[113].setRotationPoint(-28F, -40F, -7F);

        ammoModel[114].addBox(0F, 0F, 0F, 12, 7, 2, 0F); // Box 137
        ammoModel[114].setRotationPoint(-3F, -34.5F, 1F);

        ammoModel[115].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
        ammoModel[115].setRotationPoint(-3F, -35.5F, 0F);

        ammoModel[116].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 137
        ammoModel[116].setRotationPoint(-3F, -27.5F, 0F);

        ammoModel[117].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 137
        ammoModel[117].setRotationPoint(-1F, -35.5F, 3F);

        ammoModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 137
        ammoModel[118].setRotationPoint(-1F, -30.5F, 3F);

        ammoModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 137
        ammoModel[119].setRotationPoint(-1F, -27.5F, 3F);

        ammoModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 137
        ammoModel[120].setRotationPoint(-1F, -28.5F, 3F);

        ammoModel[121].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 137
        ammoModel[121].setRotationPoint(6.5F, -35.5F, 3F);

        ammoModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 137
        ammoModel[122].setRotationPoint(6.5F, -30.5F, 3F);

        ammoModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 137
        ammoModel[123].setRotationPoint(6.5F, -27.5F, 3F);

        ammoModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 137
        ammoModel[124].setRotationPoint(6.5F, -28.5F, 3F);

        ammoModel[125].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
        ammoModel[125].setRotationPoint(-1F, -36.5F, 3F);

        ammoModel[126].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 137
        ammoModel[126].setRotationPoint(2.75F, -35.5F, 3F);

        ammoModel[127].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 150
        ammoModel[127].setRotationPoint(-2F, -32F, 3F);

        ammoModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 150
        ammoModel[128].setRotationPoint(7F, -32F, 3F);

        ammoModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 150
        ammoModel[129].setRotationPoint(7F, -30F, 3F);

        ammoModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0.05F, -0.1F, 0F, -0.25F); // Box 153
        ammoModel[130].setRotationPoint(6.5F, -36.5F, 1.5F);

        ammoModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.5F, 0F, 0F); // Box 153
        ammoModel[131].setRotationPoint(6.5F, -36.5F, 1.5F);

        ammoModel[132].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
        ammoModel[132].setRotationPoint(-1F, -37.5F, 5F);

        ammoModel[133].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
        ammoModel[133].setRotationPoint(-1F, -38.5F, 5F);

        ammoModel[134].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
        ammoModel[134].setRotationPoint(1F, -40.5F, 3F);

        ammoModel[135].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 137
        ammoModel[135].setRotationPoint(1F, -39.5F, 5F);

        ammoModel[136].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
        ammoModel[136].setRotationPoint(-5F, -42.5F, 2F);

        ammoModel[137].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
        ammoModel[137].setRotationPoint(-5F, -42.5F, -2F);

        ammoModel[138].addShapeBox(0F, 0F, 0F, 13, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
        ammoModel[138].setRotationPoint(-5F, -43.5F, -2F);

        ammoModel[139].addShapeBox(0F, 0F, 0F, 13, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 137
        ammoModel[139].setRotationPoint(-5F, -39.5F, -2F);

        ammoModel[140].addShapeBox(0F, 0F, 0F, 9, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
        ammoModel[140].setRotationPoint(-14F, -42F, -2.5F);

        ammoModel[141].addShapeBox(0F, 0F, 0F, 9, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
        ammoModel[141].setRotationPoint(-14F, -44F, -2.5F);

        ammoModel[142].addShapeBox(0F, 0F, 0F, 9, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 137
        ammoModel[142].setRotationPoint(-14F, -40F, -2.5F);

        ammoModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 137
        ammoModel[143].setRotationPoint(-13F, -42F, -3.5F);

        ammoModel[144].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 137
        ammoModel[144].setRotationPoint(-13F, -45F, -3.5F);

        ammoModel[145].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F); // Box 137
        ammoModel[145].setRotationPoint(-13F, -40F, -3.5F);

        ammoModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
        ammoModel[146].setRotationPoint(-15F, -42F, -3.5F);

        ammoModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
        ammoModel[147].setRotationPoint(-15F, -42F, 3.5F);

        ammoModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
        ammoModel[148].setRotationPoint(-15F, -45F, -0.5F);

        ammoModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
        ammoModel[149].setRotationPoint(-15F, -38F, -0.5F);

        ammoModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
        ammoModel[150].setRotationPoint(-15F, -44F, -3.5F);

        ammoModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
        ammoModel[151].setRotationPoint(-15F, -44F, 3.5F);

        ammoModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 137
        ammoModel[152].setRotationPoint(-15F, -40F, -3.5F);

        ammoModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, -3F, 0F, 1F, -3F); // Box 137
        ammoModel[153].setRotationPoint(-15F, -40F, 3.5F);

        ammoModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 137
        ammoModel[154].setRotationPoint(-11F, -42F, -3.5F);

        ammoModel[155].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 137
        ammoModel[155].setRotationPoint(-11F, -45F, -3.5F);

        ammoModel[156].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F); // Box 137
        ammoModel[156].setRotationPoint(-11F, -40F, -3.5F);

        thirdPersonOffset = new Vector3f(0 / 16F, 1.5F / 16F, 0F / 16F);
        hasFlash = true;
        hasArms = true;
        leftArmPos = new Vector3f(0.05F, -0.35F, 0.1F);
        leftArmRot = new Vector3f(40.0F, 30.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.4F, -0.45F, -0.1F);
        leftArmReloadRot = new Vector3f(60.0F, 20.0F, 0.0F);
        rightArmPos = new Vector3f(0.17F, -0.52F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmReloadPos = new Vector3f(0.17F, -0.52F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.8F, 1.0F, 0.8F);
        rightHandAmmo = true;
        leftHandAmmo = false;
        fancyStance = true;
        stanceRotate = new Vector3f(20.0F, 0.0F, -70.0F);
        stanceTranslate = new Vector3f(0.0F, 0.0F, 0.0F);
        animationType = EnumAnimationType.RIFLE_TOP;
        translateAll(15F, -5F, 0F);
        flipAll();
    }
}