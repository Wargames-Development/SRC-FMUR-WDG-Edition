//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: QBU10
// Model Creator: 
// Created on: 22.04.2018 - 14:00:34
// Last changed on: 22.04.2018 - 14:00:34

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelQBU10 extends ModelGun //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public ModelQBU10() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[138];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        gunModel[1] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 1
        gunModel[2] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 2
        gunModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 9
        gunModel[4] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 10
        gunModel[5] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 11
        gunModel[6] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 12
        gunModel[7] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 13
        gunModel[8] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 14
        gunModel[9] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 15
        gunModel[10] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 16
        gunModel[11] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 17
        gunModel[12] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 18
        gunModel[13] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 19
        gunModel[14] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 20
        gunModel[15] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 21
        gunModel[16] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 22
        gunModel[17] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 37
        gunModel[18] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 38
        gunModel[19] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 39
        gunModel[20] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 40
        gunModel[21] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 41
        gunModel[22] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 42
        gunModel[23] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 43
        gunModel[24] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 44
        gunModel[25] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 45
        gunModel[26] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 46
        gunModel[27] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 47
        gunModel[28] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 48
        gunModel[29] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 49
        gunModel[30] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 50
        gunModel[31] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 51
        gunModel[32] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 52
        gunModel[33] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 53
        gunModel[34] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 54
        gunModel[35] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 55
        gunModel[36] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 56
        gunModel[37] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 57
        gunModel[38] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 58
        gunModel[39] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 59
        gunModel[40] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 69
        gunModel[41] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 71
        gunModel[42] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 72
        gunModel[43] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 73
        gunModel[44] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 74
        gunModel[45] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 75
        gunModel[46] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 76
        gunModel[47] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 77
        gunModel[48] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 78
        gunModel[49] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 79
        gunModel[50] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 80
        gunModel[51] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 81
        gunModel[52] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 82
        gunModel[53] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 83
        gunModel[54] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 84
        gunModel[55] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 85
        gunModel[56] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 86
        gunModel[57] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 87
        gunModel[58] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 88
        gunModel[59] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 89
        gunModel[60] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 90
        gunModel[61] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 91
        gunModel[62] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 92
        gunModel[63] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 93
        gunModel[64] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 94
        gunModel[65] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 95
        gunModel[66] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 96
        gunModel[67] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 97
        gunModel[68] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 98
        gunModel[69] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 99
        gunModel[70] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 100
        gunModel[71] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 101
        gunModel[72] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 102
        gunModel[73] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 103
        gunModel[74] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 104
        gunModel[75] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 105
        gunModel[76] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 106
        gunModel[77] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 107
        gunModel[78] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 108
        gunModel[79] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 109
        gunModel[80] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 110
        gunModel[81] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 111
        gunModel[82] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 112
        gunModel[83] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 113
        gunModel[84] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 114
        gunModel[85] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 115
        gunModel[86] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 116
        gunModel[87] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 117
        gunModel[88] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 118
        gunModel[89] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 119
        gunModel[90] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 120
        gunModel[91] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 121
        gunModel[92] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 122
        gunModel[93] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 123
        gunModel[94] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 124
        gunModel[95] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 125
        gunModel[96] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 126
        gunModel[97] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 127
        gunModel[98] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 127
        gunModel[99] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 128
        gunModel[100] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 129
        gunModel[101] = new ModelRendererTurbo(this, 87, 161, textureX, textureY); // Box 130
        gunModel[102] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 131
        gunModel[103] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 132
        gunModel[104] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 133
        gunModel[105] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 134
        gunModel[106] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 221
        gunModel[107] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 222
        gunModel[108] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 223
        gunModel[109] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 224
        gunModel[110] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 225
        gunModel[111] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 226
        gunModel[112] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 227
        gunModel[113] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 228
        gunModel[114] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 229
        gunModel[115] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 230
        gunModel[116] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 231
        gunModel[117] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 232
        gunModel[118] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 233
        gunModel[119] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 234
        gunModel[120] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 239
        gunModel[121] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 240
        gunModel[122] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 241
        gunModel[123] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 242
        gunModel[124] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 281
        gunModel[125] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 282
        gunModel[126] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 283
        gunModel[127] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 284
        gunModel[128] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 285
        gunModel[129] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 286
        gunModel[130] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 287
        gunModel[131] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 130
        gunModel[132] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 133
        gunModel[133] = new ModelRendererTurbo(this, 91, 148, textureX, textureY); // Box 134
        gunModel[134] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 130
        gunModel[135] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 133
        gunModel[136] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 134
        gunModel[137] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 130

        gunModel[0].addShapeBox(0F, 0F, 0F, 65, 4, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 0
        gunModel[0].setRotationPoint(81F, -30.25F, -1F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 65, 4, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 1
        gunModel[1].setRotationPoint(81F, -30.25F, 1F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 65, 4, 1, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 2
        gunModel[2].setRotationPoint(81F, -30.25F, -2F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
        gunModel[3].setRotationPoint(79F, -36.25F, -0.5F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 10
        gunModel[4].setRotationPoint(79F, -36.25F, 0.5F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
        gunModel[5].setRotationPoint(79F, -36.25F, -1.5F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 14, 4, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 12
        gunModel[6].setRotationPoint(90F, -36.75F, -1F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 14, 4, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 13
        gunModel[7].setRotationPoint(90F, -36.75F, 1F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 14, 4, 1, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 14
        gunModel[8].setRotationPoint(90F, -36.75F, -2F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 15
        gunModel[9].setRotationPoint(104F, -36.75F, -1F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 16
        gunModel[10].setRotationPoint(104F, -36.75F, 1F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 17
        gunModel[11].setRotationPoint(104F, -36.75F, -2F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 18
        gunModel[12].setRotationPoint(104F, -30.25F, -2F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 19
        gunModel[13].setRotationPoint(104F, -30.25F, -1F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 20
        gunModel[14].setRotationPoint(104F, -30.25F, 1F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
        gunModel[15].setRotationPoint(104F, -31.5F, -1F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
        gunModel[16].setRotationPoint(104F, -32.5F, -1F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 42, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
        gunModel[17].setRotationPoint(-23F, -35.25F, -1.5F);

        gunModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 38
        gunModel[18].setRotationPoint(53F, -35.25F, -1.5F);

        gunModel[19].addShapeBox(0F, 0F, 0F, 27, 3, 4, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
        gunModel[19].setRotationPoint(54F, -35.25F, -2F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 76, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
        gunModel[20].setRotationPoint(-23F, -36.25F, -1.5F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F); // Box 41
        gunModel[21].setRotationPoint(53F, -36.25F, -1.5F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 27, 1, 4, 0F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
        gunModel[22].setRotationPoint(54F, -36.5F, -2F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 42, 2, 6, 0F, 0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 43
        gunModel[23].setRotationPoint(-23F, -33F, -3F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 24, 1, 6, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
        gunModel[24].setRotationPoint(-23F, -31F, -3F);

        gunModel[25].addShapeBox(0F, 0F, 0F, 8, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 45
        gunModel[25].setRotationPoint(19F, -30F, -3F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 10, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 46
        gunModel[26].setRotationPoint(27F, -30F, -3F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
        gunModel[27].setRotationPoint(37F, -28F, -3F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 7, 5, 6, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F); // Box 48
        gunModel[28].setRotationPoint(38F, -28F, -3F);

        gunModel[29].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F); // Box 49
        gunModel[29].setRotationPoint(45F, -27F, -2.5F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 44, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 50
        gunModel[30].setRotationPoint(37F, -30F, -3F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 44, 1, 6, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 51
        gunModel[31].setRotationPoint(37F, -28F, -3F);

        gunModel[32].addShapeBox(0F, 0F, 0F, 44, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 52
        gunModel[32].setRotationPoint(37F, -27F, -2.5F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 27, 1, 3, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 53
        gunModel[33].setRotationPoint(54F, -25F, -1.5F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, 0F, 0.25F, 0.25F, 1F, 0.25F, 0.25F, 1F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 54
        gunModel[34].setRotationPoint(51F, -27F, -2.5F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
        gunModel[35].setRotationPoint(51.5F, -26F, -3F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Box 56
        gunModel[36].setRotationPoint(21F, -24.5F, -3F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0.5F, 0.25F); // Box 57
        gunModel[37].setRotationPoint(27F, -24.5F, -3F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -0.5F, 0F, 0.25F); // Box 58
        gunModel[38].setRotationPoint(20F, -24.5F, -3F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 59
        gunModel[39].setRotationPoint(21F, -24.5F, -3.5F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 4, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -5F, 0F); // Box 69
        gunModel[40].setRotationPoint(15F, -30F, -3F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 71
        gunModel[41].setRotationPoint(12F, -30F, -3F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 35, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 72
        gunModel[42].setRotationPoint(-23F, -30F, -3F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 15, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 73
        gunModel[43].setRotationPoint(3.5F, -25.5F, -2F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 16, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 74
        gunModel[44].setRotationPoint(3.5F, -23F, -2F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 14, 2, 4, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 75
        gunModel[45].setRotationPoint(5.5F, -21.5F, -2F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F); // Box 76
        gunModel[46].setRotationPoint(2.5F, -25.5F, -2F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F); // Box 77
        gunModel[47].setRotationPoint(4.5F, -21.5F, -2F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 1.5F, -0.5F, -0.5F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 1.5F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F); // Box 78
        gunModel[48].setRotationPoint(4.5F, -23.5F, -2F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 79
        gunModel[49].setRotationPoint(5.5F, -20F, -2F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F, -1.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 80
        gunModel[50].setRotationPoint(4.5F, -18F, -2F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 5, 7, 4, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 3.5F, 0F, 0.25F, -3.25F, 0F, 0.25F, -3.25F, 0F, 0.25F, 3.5F, 0F, 0.25F); // Box 81
        gunModel[51].setRotationPoint(4.5F, -16F, -2F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -2F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, 0F, -2F, 0.25F); // Box 82
        gunModel[52].setRotationPoint(1F, -9F, -2F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, -0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, -0.5F); // Box 83
        gunModel[53].setRotationPoint(5F, -20F, -2F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, -0.25F, 0F, -0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, -0.5F, 0.75F, 0F, -0.5F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0.75F, 0F, -0.5F); // Box 84
        gunModel[54].setRotationPoint(4.5F, -18F, -2F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F, -0.25F, 0F, -0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, -0.5F, 3.5F, -0.5F, -0.5F, -3.5F, 0F, 0.25F, -3.5F, 0F, 0.25F, 3.5F, -0.5F, -0.5F); // Box 85
        gunModel[55].setRotationPoint(3.5F, -16F, -2F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0.5F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, -0.5F); // Box 86
        gunModel[56].setRotationPoint(0F, -9F, -2F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0.25F); // Box 87
        gunModel[57].setRotationPoint(10.5F, -20F, -2F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0.25F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0.25F, 1.25F, 0F, 0.25F, -1.25F, 0.5F, -0.5F, -1.25F, 0.5F, -0.5F, 1.25F, 0F, 0.25F); // Box 88
        gunModel[58].setRotationPoint(10.5F, -18F, -2F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F, -0.25F, 0F, 0.25F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.25F, 0F, 0.25F, 4F, -0.5F, 0.25F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 4F, -0.5F, 0.25F); // Box 89
        gunModel[59].setRotationPoint(9F, -16F, -2F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 35, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 90
        gunModel[60].setRotationPoint(-23F, -27.5F, -3F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0.5F, -1F, -2F, 0.5F, -1F, 0F, 0F, -1F); // Box 91
        gunModel[61].setRotationPoint(12F, -27.5F, -3F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -2F, -0.5F, -1F, 4F, -0.5F, 0F, 4F, -0.5F, 0F, -2F, -0.5F, -1F); // Box 92
        gunModel[62].setRotationPoint(13F, -27F, -3F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 93
        gunModel[63].setRotationPoint(9.5F, -20F, -2.5F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 94
        gunModel[64].setRotationPoint(11F, -18.5F, -2.5F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 95
        gunModel[65].setRotationPoint(19.5F, -20F, -2F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F); // Box 96
        gunModel[66].setRotationPoint(13.5F, -16F, -2F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, -0.25F, 0F, -2F, 0.25F, 0F, -2F, 0.25F, 0F, 1F, -0.25F, 0F); // Box 97
        gunModel[67].setRotationPoint(19.5F, -17F, -2F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.75F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F); // Box 98
        gunModel[68].setRotationPoint(12.5F, -16F, -2F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 99
        gunModel[69].setRotationPoint(10F, -19.5F, -3F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.35F, -0.1F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.35F, -0.35F, -0.25F); // Box 100
        gunModel[70].setRotationPoint(9.5F, -19.5F, -3F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.25F, 0.25F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.25F, -0.25F, 0F, -0.25F); // Box 101
        gunModel[71].setRotationPoint(10.5F, -19.5F, -3F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 102
        gunModel[72].setRotationPoint(13.5F, -20F, -1F);

        gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 103
        gunModel[73].setRotationPoint(14F, -19F, -1F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0.25F, 0F, -1.25F, 0F, 0F); // Box 104
        gunModel[74].setRotationPoint(14F, -18F, -1F);

        gunModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 105
        gunModel[75].setRotationPoint(7.5F, -23.25F, 1.5F);

        gunModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 106
        gunModel[76].setRotationPoint(7.5F, -23.75F, 1.5F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 107
        gunModel[77].setRotationPoint(7.5F, -22.75F, 1.5F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 108
        gunModel[78].setRotationPoint(8.5F, -25.25F, 1.5F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 5, 5, 4, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
        gunModel[79].setRotationPoint(-23F, -25.5F, -2F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 110
        gunModel[80].setRotationPoint(-23F, -20.5F, -2F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 111
        gunModel[81].setRotationPoint(-23F, -16.5F, -2F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 112
        gunModel[82].setRotationPoint(-23F, -14F, -2.5F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 113
        gunModel[83].setRotationPoint(-23F, -13F, -2.5F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
        gunModel[84].setRotationPoint(-22F, -12F, -0.5F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 115
        gunModel[85].setRotationPoint(-22F, -12F, 0.5F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 116
        gunModel[86].setRotationPoint(-22.5F, -5F, -0.5F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 117
        gunModel[87].setRotationPoint(-22.5F, -5F, 0.5F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 118
        gunModel[88].setRotationPoint(-23F, -5F, -1F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.25F, 0F, 0F, -1.25F, 0F, 0F); // Box 119
        gunModel[89].setRotationPoint(-23F, -5F, 1F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 120
        gunModel[90].setRotationPoint(-22.5F, -5F, -1.5F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 121
        gunModel[91].setRotationPoint(-23F, -5F, -2F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
        gunModel[92].setRotationPoint(-22F, -12F, -1.5F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 6, 16, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
        gunModel[93].setRotationPoint(-29F, -32F, -3F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
        gunModel[94].setRotationPoint(-29F, -35F, -3F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, 1F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 1F, 0.25F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 125
        gunModel[95].setRotationPoint(-29F, -36F, -2F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 1F, 0.25F, -1F); // Box 126
        gunModel[96].setRotationPoint(-29F, -13F, -2F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -1F); // Box 127
        gunModel[97].setRotationPoint(-29F, -16F, -3F);

        gunModel[98].addShapeBox(0F, 0F, 0F, 22, 3, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
        gunModel[98].setRotationPoint(-23F, -35.5F, -3F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 22, 2, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
        gunModel[99].setRotationPoint(-23F, -37F, -2F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 22, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0.25F); // Box 129
        gunModel[100].setRotationPoint(-23F, -32.5F, -3F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 130
        gunModel[101].setRotationPoint(42F, -37.5F, -2F);

        gunModel[102].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 131
        gunModel[102].setRotationPoint(24F, -37F, -2F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 132
        gunModel[103].setRotationPoint(24F, -36F, -1F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 133
        gunModel[104].setRotationPoint(40F, -37.5F, -2F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 134
        gunModel[105].setRotationPoint(38F, -37.5F, -2F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -1F, -0.25F); // Box 221
        gunModel[106].setRotationPoint(72F, -38.25F, -2F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F); // Box 222
        gunModel[107].setRotationPoint(71F, -39.25F, -2F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 223
        gunModel[108].setRotationPoint(70F, -39.25F, -2F);

        gunModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.25F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0.25F, -0.75F, -0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F); // Box 224
        gunModel[109].setRotationPoint(69F, -39F, -2F);

        gunModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.25F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0.25F, -0.75F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F); // Box 225
        gunModel[110].setRotationPoint(69F, -39F, 1F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0.5F, -0.25F, -0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 226
        gunModel[111].setRotationPoint(70F, -39.25F, 1F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 227
        gunModel[112].setRotationPoint(70.25F, -39.25F, -2F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F); // Box 228
        gunModel[113].setRotationPoint(71F, -39.25F, 1F);

        gunModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F); // Box 229
        gunModel[114].setRotationPoint(72F, -38.25F, 1F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 230
        gunModel[115].setRotationPoint(70.25F, -38.75F, -2F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Box 231
        gunModel[116].setRotationPoint(70.25F, -38.25F, -2F);

        gunModel[117].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 232
        gunModel[117].setRotationPoint(74.5F, -38.25F, -1F);

        gunModel[118].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 233
        gunModel[118].setRotationPoint(73F, -38.25F, 1F);

        gunModel[119].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
        gunModel[119].setRotationPoint(76.5F, -38.25F, -1.5F);

        gunModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 239
        gunModel[120].setRotationPoint(79.5F, -38.25F, -2.5F);

        gunModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 240
        gunModel[121].setRotationPoint(76.5F, -38.25F, -2.5F);

        gunModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 241
        gunModel[122].setRotationPoint(79.5F, -38.25F, 1.5F);

        gunModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 242
        gunModel[123].setRotationPoint(76.5F, -38.25F, 1.5F);

        gunModel[124].addShapeBox(0F, 0F, 0F, 36, 1, 5, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
        gunModel[124].setRotationPoint(1F, -31F, -2F);

        gunModel[125].addShapeBox(0F, 0F, 0F, 44, 1, 6, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
        gunModel[125].setRotationPoint(37F, -31F, -3F);

        gunModel[126].addShapeBox(0F, 0F, 0F, 44, 2, 6, 0F, 0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 283
        gunModel[126].setRotationPoint(37F, -33F, -3F);

        gunModel[127].addShapeBox(0F, 0F, 0F, 18, 2, 5, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 284
        gunModel[127].setRotationPoint(19F, -33F, -2F);

        gunModel[128].addShapeBox(0F, 0F, 0F, 18, 3, 2, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
        gunModel[128].setRotationPoint(19F, -35.25F, -0.5F);

        gunModel[129].addShapeBox(0F, 0F, 0F, 16, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
        gunModel[129].setRotationPoint(37F, -35.25F, -1.5F);

        gunModel[130].addShapeBox(0F, 0F, 0F, 18, 1, 5, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
        gunModel[130].setRotationPoint(19F, -31F, -3F);

        gunModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 130
        gunModel[131].setRotationPoint(28F, -37.5F, -2F);

        gunModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 133
        gunModel[132].setRotationPoint(26F, -37.5F, -2F);

        gunModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 134
        gunModel[133].setRotationPoint(24F, -37.5F, -2F);

        gunModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 130
        gunModel[134].setRotationPoint(34F, -37.5F, -2F);

        gunModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 133
        gunModel[135].setRotationPoint(32F, -37.5F, -2F);

        gunModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 134
        gunModel[136].setRotationPoint(30F, -37.5F, -2F);

        gunModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 130
        gunModel[137].setRotationPoint(36F, -37.5F, -2F);


        defaultBarrelModel = new ModelRendererTurbo[13];
        defaultBarrelModel[0] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 3
        defaultBarrelModel[1] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 4
        defaultBarrelModel[2] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 5
        defaultBarrelModel[3] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 6
        defaultBarrelModel[4] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 7
        defaultBarrelModel[5] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 8
        defaultBarrelModel[6] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 23
        defaultBarrelModel[7] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 24
        defaultBarrelModel[8] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 25
        defaultBarrelModel[9] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 26
        defaultBarrelModel[10] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 27
        defaultBarrelModel[11] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 28
        defaultBarrelModel[12] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 29

        defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F); // Box 3
        defaultBarrelModel[0].setRotationPoint(146F, -30.25F, -1F);

        defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
        defaultBarrelModel[1].setRotationPoint(147F, -29.25F, -2.5F);

        defaultBarrelModel[2].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
        defaultBarrelModel[2].setRotationPoint(147F, -31.25F, -2.5F);

        defaultBarrelModel[3].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 6
        defaultBarrelModel[3].setRotationPoint(147F, -27.25F, -2.5F);

        defaultBarrelModel[4].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0.25F, 0F, 0.5F, 0F, 0F, -1F, -0.5F, 0F, -1.25F, -1F, 0F, 0F, 0.25F, 0F, 0.5F, 0F, 0F, -1F, -0.5F, 0F, -1.25F, -1F); // Box 7
        defaultBarrelModel[4].setRotationPoint(146F, -30.25F, 1F);

        defaultBarrelModel[5].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, -1.25F, -1F, 0F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0.25F, 0F, -1.25F, -1F, 0F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0.25F); // Box 8
        defaultBarrelModel[5].setRotationPoint(146F, -30.25F, -3F);

        defaultBarrelModel[6].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
        defaultBarrelModel[6].setRotationPoint(150.5F, -31.25F, -4F);

        defaultBarrelModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
        defaultBarrelModel[7].setRotationPoint(155.5F, -31.25F, -4F);

        defaultBarrelModel[8].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
        defaultBarrelModel[8].setRotationPoint(150.5F, -32.25F, -4F);

        defaultBarrelModel[9].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
        defaultBarrelModel[9].setRotationPoint(150.5F, -25.25F, -4F);

        defaultBarrelModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
        defaultBarrelModel[10].setRotationPoint(155.5F, -27.25F, -4F);

        defaultBarrelModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
        defaultBarrelModel[11].setRotationPoint(155.5F, -29.25F, -4F);

        defaultBarrelModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
        defaultBarrelModel[12].setRotationPoint(155.5F, -29.25F, 1F);


        defaultScopeModel = new ModelRendererTurbo[95];
        defaultScopeModel[0] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 139
        defaultScopeModel[1] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 140
        defaultScopeModel[2] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 141
        defaultScopeModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 142
        defaultScopeModel[4] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 143
        defaultScopeModel[5] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 144
        defaultScopeModel[6] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 145
        defaultScopeModel[7] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 146
        defaultScopeModel[8] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 147
        defaultScopeModel[9] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 148
        defaultScopeModel[10] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 149
        defaultScopeModel[11] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 150
        defaultScopeModel[12] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 151
        defaultScopeModel[13] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 152
        defaultScopeModel[14] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 153
        defaultScopeModel[15] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 154
        defaultScopeModel[16] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 155
        defaultScopeModel[17] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 156
        defaultScopeModel[18] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 157
        defaultScopeModel[19] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 158
        defaultScopeModel[20] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 159
        defaultScopeModel[21] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 160
        defaultScopeModel[22] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 161
        defaultScopeModel[23] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 162
        defaultScopeModel[24] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 163
        defaultScopeModel[25] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 164
        defaultScopeModel[26] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 165
        defaultScopeModel[27] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 166
        defaultScopeModel[28] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 167
        defaultScopeModel[29] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 168
        defaultScopeModel[30] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 169
        defaultScopeModel[31] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 170
        defaultScopeModel[32] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 171
        defaultScopeModel[33] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 172
        defaultScopeModel[34] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 173
        defaultScopeModel[35] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 175
        defaultScopeModel[36] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 176
        defaultScopeModel[37] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 177
        defaultScopeModel[38] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 179
        defaultScopeModel[39] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 180
        defaultScopeModel[40] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 181
        defaultScopeModel[41] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 186
        defaultScopeModel[42] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 187
        defaultScopeModel[43] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 188
        defaultScopeModel[44] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 189
        defaultScopeModel[45] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 190
        defaultScopeModel[46] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 191
        defaultScopeModel[47] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 212
        defaultScopeModel[48] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 213
        defaultScopeModel[49] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 214
        defaultScopeModel[50] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 215
        defaultScopeModel[51] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 216
        defaultScopeModel[52] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 217
        defaultScopeModel[53] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 218
        defaultScopeModel[54] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 219
        defaultScopeModel[55] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 220
        defaultScopeModel[56] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 235
        defaultScopeModel[57] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 236
        defaultScopeModel[58] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 237
        defaultScopeModel[59] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 243
        defaultScopeModel[60] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 244
        defaultScopeModel[61] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 245
        defaultScopeModel[62] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 246
        defaultScopeModel[63] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 249
        defaultScopeModel[64] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 250
        defaultScopeModel[65] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 251
        defaultScopeModel[66] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 252
        defaultScopeModel[67] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 253
        defaultScopeModel[68] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 254
        defaultScopeModel[69] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 255
        defaultScopeModel[70] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 256
        defaultScopeModel[71] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 257
        defaultScopeModel[72] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 258
        defaultScopeModel[73] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 259
        defaultScopeModel[74] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 260
        defaultScopeModel[75] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 261
        defaultScopeModel[76] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 262
        defaultScopeModel[77] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 263
        defaultScopeModel[78] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 264
        defaultScopeModel[79] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 265
        defaultScopeModel[80] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 266
        defaultScopeModel[81] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 267
        defaultScopeModel[82] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 268
        defaultScopeModel[83] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 269
        defaultScopeModel[84] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 270
        defaultScopeModel[85] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 271
        defaultScopeModel[86] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 272
        defaultScopeModel[87] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 273
        defaultScopeModel[88] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 274
        defaultScopeModel[89] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 275
        defaultScopeModel[90] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 276
        defaultScopeModel[91] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 277
        defaultScopeModel[92] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 278
        defaultScopeModel[93] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 279
        defaultScopeModel[94] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 280

        defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 139
        defaultScopeModel[0].setRotationPoint(21F, -38.25F, -1F);

        defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F); // Box 140
        defaultScopeModel[1].setRotationPoint(18.5F, -38.25F, 1F);

        defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F); // Box 141
        defaultScopeModel[2].setRotationPoint(17.5F, -39.25F, 1F);

        defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0.5F, -0.25F, -0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 142
        defaultScopeModel[3].setRotationPoint(16.5F, -39.25F, 1F);

        defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.25F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0.25F, -0.75F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F); // Box 143
        defaultScopeModel[4].setRotationPoint(15.5F, -39F, 1F);

        defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 144
        defaultScopeModel[5].setRotationPoint(20.5F, -38.25F, 1F);

        defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -1F, -0.25F); // Box 145
        defaultScopeModel[6].setRotationPoint(18.5F, -38.25F, -2F);

        defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F); // Box 146
        defaultScopeModel[7].setRotationPoint(17.5F, -39.25F, -2F);

        defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 147
        defaultScopeModel[8].setRotationPoint(16.5F, -39.25F, -2F);

        defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.25F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0.25F, -0.75F, -0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F); // Box 148
        defaultScopeModel[9].setRotationPoint(15.5F, -39F, -2F);

        defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 149
        defaultScopeModel[10].setRotationPoint(20.5F, -38.25F, -2F);

        defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 150
        defaultScopeModel[11].setRotationPoint(16.75F, -38.75F, -2F);

        defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 151
        defaultScopeModel[12].setRotationPoint(16.75F, -39.25F, -2F);

        defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Box 152
        defaultScopeModel[13].setRotationPoint(16.75F, -38.25F, -2F);

        defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 153
        defaultScopeModel[14].setRotationPoint(20.75F, -37.25F, -2F);

        defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 154
        defaultScopeModel[15].setRotationPoint(20.75F, -38.25F, -2F);

        defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 155
        defaultScopeModel[16].setRotationPoint(20.75F, -37.75F, -2F);

        defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 15, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
        defaultScopeModel[17].setRotationPoint(23.5F, -38F, -2.5F);

        defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 157
        defaultScopeModel[18].setRotationPoint(25.25F, -37.5F, -3F);

        defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 158
        defaultScopeModel[19].setRotationPoint(25.25F, -38F, -3F);

        defaultScopeModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 159
        defaultScopeModel[20].setRotationPoint(25.25F, -37F, -3F);

        defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0.5F, -0.5F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.5F, -0.5F, 0F, -1F, -0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -0.25F, 0F); // Box 160
        defaultScopeModel[21].setRotationPoint(25.25F, -39F, 2.5F);

        defaultScopeModel[22].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0.5F, -0.5F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.5F, -0.5F, 0F, -1F, -0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -0.25F, 0F); // Box 161
        defaultScopeModel[22].setRotationPoint(30.25F, -39F, 2.5F);

        defaultScopeModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 162
        defaultScopeModel[23].setRotationPoint(30.25F, -38F, -3F);

        defaultScopeModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 163
        defaultScopeModel[24].setRotationPoint(30.25F, -37.5F, -3F);

        defaultScopeModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 164
        defaultScopeModel[25].setRotationPoint(30.25F, -37F, -3F);

        defaultScopeModel[26].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -1F, -0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -0.25F, 0F, 0.5F, -0.5F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.5F, -0.5F, 0F); // Box 165
        defaultScopeModel[26].setRotationPoint(35.25F, -39F, 2.5F);

        defaultScopeModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 166
        defaultScopeModel[27].setRotationPoint(35.25F, -38F, -3F);

        defaultScopeModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 167
        defaultScopeModel[28].setRotationPoint(35.25F, -37.5F, -3F);

        defaultScopeModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 168
        defaultScopeModel[29].setRotationPoint(35.25F, -37F, -3F);

        defaultScopeModel[30].addShapeBox(0F, 0F, 0F, 6, 12, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 169
        defaultScopeModel[30].setRotationPoint(39.5F, -53F, -4F);

        defaultScopeModel[31].addShapeBox(0F, 0F, 0F, 2, 11, 8, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
        defaultScopeModel[31].setRotationPoint(18.5F, -53F, -4F);

        defaultScopeModel[32].addShapeBox(0F, 0F, 0F, 2, 11, 8, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
        defaultScopeModel[32].setRotationPoint(45.5F, -53F, -4F);

        defaultScopeModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 172
        defaultScopeModel[33].setRotationPoint(45.5F, -42F, -4F);

        defaultScopeModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 173
        defaultScopeModel[34].setRotationPoint(46F, -51F, -2F);

        defaultScopeModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 175
        defaultScopeModel[35].setRotationPoint(46F, -52F, -2F);

        defaultScopeModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 176
        defaultScopeModel[36].setRotationPoint(46F, -49F, -2F);

        defaultScopeModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
        defaultScopeModel[37].setRotationPoint(47F, -46F, -2.5F);

        defaultScopeModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
        defaultScopeModel[38].setRotationPoint(47F, -48F, -2.5F);

        defaultScopeModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 180
        defaultScopeModel[39].setRotationPoint(47F, -44F, -2.5F);

        defaultScopeModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 181
        defaultScopeModel[40].setRotationPoint(47F, -48F, -1F);

        defaultScopeModel[41].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 186
        defaultScopeModel[41].setRotationPoint(19F, -49F, 4F);

        defaultScopeModel[42].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 187
        defaultScopeModel[42].setRotationPoint(19F, -50F, 4F);

        defaultScopeModel[43].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F); // Box 188
        defaultScopeModel[43].setRotationPoint(19F, -47F, 4F);

        defaultScopeModel[44].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 189
        defaultScopeModel[44].setRotationPoint(25F, -45F, 4F);

        defaultScopeModel[45].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 190
        defaultScopeModel[45].setRotationPoint(25F, -46F, 4F);

        defaultScopeModel[46].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F); // Box 191
        defaultScopeModel[46].setRotationPoint(25F, -43F, 4F);

        defaultScopeModel[47].addShapeBox(0F, 0F, 0F, 19, 11, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
        defaultScopeModel[47].setRotationPoint(20.5F, -53F, -4F);

        defaultScopeModel[48].addShapeBox(0F, 0F, 0F, 21, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 213
        defaultScopeModel[48].setRotationPoint(18.5F, -42F, -4F);

        defaultScopeModel[49].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
        defaultScopeModel[49].setRotationPoint(23.5F, -42F, -2F);

        defaultScopeModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 215
        defaultScopeModel[50].setRotationPoint(41.5F, -42F, -2F);

        defaultScopeModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 216
        defaultScopeModel[51].setRotationPoint(21.5F, -42F, -2F);

        defaultScopeModel[52].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 217
        defaultScopeModel[52].setRotationPoint(23.5F, -41F, -2F);

        defaultScopeModel[53].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 218
        defaultScopeModel[53].setRotationPoint(36.5F, -41F, -2F);

        defaultScopeModel[54].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 219
        defaultScopeModel[54].setRotationPoint(23.5F, -41F, 1F);

        defaultScopeModel[55].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 220
        defaultScopeModel[55].setRotationPoint(36.5F, -41F, 1F);

        defaultScopeModel[56].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 235
        defaultScopeModel[56].setRotationPoint(18F, -53F, -0.5F);

        defaultScopeModel[57].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 236
        defaultScopeModel[57].setRotationPoint(18F, -53F, 0F);

        defaultScopeModel[58].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 237
        defaultScopeModel[58].setRotationPoint(18F, -53F, -1F);

        defaultScopeModel[59].addShapeBox(0F, 0F, 0F, 17, 1, 6, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
        defaultScopeModel[59].setRotationPoint(24.5F, -54F, -3F);

        defaultScopeModel[60].addShapeBox(0F, 0F, 0F, 17, 1, 6, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
        defaultScopeModel[60].setRotationPoint(24.5F, -54F, -3F);

        defaultScopeModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, -2F, 0F, -2.5F, 1F, 0F, -2F, 1F, 0F, -2F, -2F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 245
        defaultScopeModel[61].setRotationPoint(22.5F, -54F, -3F);

        defaultScopeModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 1F, 0F, -2F, -2F, 0F, -2.5F, -2F, 0F, -2.5F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 246
        defaultScopeModel[62].setRotationPoint(41.5F, -54F, -3F);

        defaultScopeModel[63].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
        defaultScopeModel[63].setRotationPoint(11.5F, -46.5F, -3.5F);

        defaultScopeModel[64].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
        defaultScopeModel[64].setRotationPoint(11.5F, -48.5F, -3.5F);

        defaultScopeModel[65].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 251
        defaultScopeModel[65].setRotationPoint(11.5F, -49.5F, -2.5F);

        defaultScopeModel[66].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 252
        defaultScopeModel[66].setRotationPoint(8.5F, -46.5F, -4F);

        defaultScopeModel[67].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F, 0F, 0F, -1F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 253
        defaultScopeModel[67].setRotationPoint(8.5F, -48.5F, -4F);

        defaultScopeModel[68].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1F, 0F); // Box 254
        defaultScopeModel[68].setRotationPoint(8.5F, -49.5F, -3F);

        defaultScopeModel[69].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0F, -2F); // Box 255
        defaultScopeModel[69].setRotationPoint(8.5F, -43.5F, -3F);

        defaultScopeModel[70].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, 0F, -1F); // Box 256
        defaultScopeModel[70].setRotationPoint(8.5F, -44.5F, -4F);

        defaultScopeModel[71].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 257
        defaultScopeModel[71].setRotationPoint(11.5F, -44.5F, -3.5F);

        defaultScopeModel[72].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 258
        defaultScopeModel[72].setRotationPoint(11.5F, -43.5F, -2.5F);

        defaultScopeModel[73].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 259
        defaultScopeModel[73].setRotationPoint(1.5F, -46.5F, -4F);

        defaultScopeModel[74].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F, 0F, -0.25F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 260
        defaultScopeModel[74].setRotationPoint(1.5F, -48.5F, -4F);

        defaultScopeModel[75].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, -0.25F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.25F, -2F, 0F, -0.75F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.25F); // Box 261
        defaultScopeModel[75].setRotationPoint(1.5F, -49.5F, -3F);

        defaultScopeModel[76].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, -1.25F); // Box 262
        defaultScopeModel[76].setRotationPoint(1.5F, -44.5F, -4F);

        defaultScopeModel[77].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, -0.75F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.25F, 0F, -0.25F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.25F, -2F); // Box 263
        defaultScopeModel[77].setRotationPoint(1.5F, -43.5F, -3F);

        defaultScopeModel[78].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F, 0F, -0.25F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -1.5F); // Box 264
        defaultScopeModel[78].setRotationPoint(-1.5F, -46.5F, -4F);

        defaultScopeModel[79].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, -1.5F, -2.25F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -1.5F, -2.25F, 0F, 0.25F, -1F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, -1F); // Box 265
        defaultScopeModel[79].setRotationPoint(-1.5F, -49.5F, -3F);

        defaultScopeModel[80].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F, 0F, -1.25F, -2F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -1.25F, -2F, 0F, 0.25F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -1.5F); // Box 266
        defaultScopeModel[80].setRotationPoint(-1.5F, -48.5F, -4F);

        defaultScopeModel[81].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -1.5F, 0F, -0.25F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, -1.5F, 0F, -0.25F, 0.75F, 0F, 0F, -0.5F); // Box 267
        defaultScopeModel[81].setRotationPoint(-4.5F, -46.5F, -4F);

        defaultScopeModel[82].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -0.25F, -1.25F, 0F, -1.25F, -2F, 0F, -1.5F, 1.25F, 0F, -0.5F, 0.4F, 0F, 0F, -0.25F, 0F, 0.25F, -1.5F, 0F, 0.25F, 0.75F, 0F, 0F, -0.5F); // Box 268
        defaultScopeModel[82].setRotationPoint(-4.5F, -48.5F, -4F);

        defaultScopeModel[83].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0.75F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.75F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.5F, 0F); // Box 269
        defaultScopeModel[83].setRotationPoint(-4.5F, -48.5F, -1F);

        defaultScopeModel[84].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -0.25F, -2F, 0F, -1.5F, -2.25F, 0F, -1.75F, 1.25F, 0F, -0.5F, 1F, 0F, -0.75F, -0.25F, 0F, 0.25F, -1F, 0F, 0.5F, 0.25F, 0F, -0.5F, -0.6F); // Box 270
        defaultScopeModel[84].setRotationPoint(-4.5F, -49.5F, -3F);

        defaultScopeModel[85].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, -0.5F, 0F, -0.25F, 0.75F, 0F, -0.25F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, 0.75F, 0F, -0.25F, -1.5F, 0F, 0F, -0.25F); // Box 271
        defaultScopeModel[85].setRotationPoint(-4.5F, -46.5F, 3F);

        defaultScopeModel[86].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -0.5F, 0.4F, 0F, -1.5F, 1.25F, 0F, -1.25F, -2F, 0F, -0.25F, -1.25F, 0F, 0F, -0.5F, 0F, 0.25F, 0.75F, 0F, 0.25F, -1.5F, 0F, 0F, -0.25F); // Box 272
        defaultScopeModel[86].setRotationPoint(-4.5F, -48.5F, 3F);

        defaultScopeModel[87].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -0.5F, 1F, 0F, -1.75F, 1.25F, 0F, -1.5F, -2.25F, 0F, -0.25F, -2F, 0F, -0.5F, -0.6F, 0F, 0.5F, 0.25F, 0F, 0.25F, -1F, 0F, -0.75F, -0.25F); // Box 273
        defaultScopeModel[87].setRotationPoint(-4.5F, -49.5F, 2F);

        defaultScopeModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -1.5F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.5F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.75F, 0F); // Box 274
        defaultScopeModel[88].setRotationPoint(-4.5F, -43.5F, -1F);

        defaultScopeModel[89].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -0.5F, -0.6F, 0F, 0.5F, 0.25F, 0F, 0.25F, -1F, 0F, -0.75F, -0.25F, 0F, -0.5F, 1F, 0F, -1.75F, 1.25F, 0F, -1.5F, -2.25F, 0F, -0.25F, -2F); // Box 275
        defaultScopeModel[89].setRotationPoint(-4.5F, -43.5F, 2F);

        defaultScopeModel[90].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0.25F, 0.75F, 0F, 0.25F, -1.5F, 0F, 0F, -0.25F, 0F, -0.5F, 0.4F, 0F, -1.5F, 1.25F, 0F, -1.25F, -2F, 0F, -0.25F, -1.25F); // Box 276
        defaultScopeModel[90].setRotationPoint(-4.5F, -44.5F, 3F);

        defaultScopeModel[91].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F, 0F, 0.25F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -1.5F, 0F, -1.25F, -2F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -1.25F, -2F); // Box 277
        defaultScopeModel[91].setRotationPoint(-1.5F, -44.5F, -4F);

        defaultScopeModel[92].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0.25F, -1F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, -1F, 0F, -1.5F, -2.25F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -1.5F, -2.25F); // Box 278
        defaultScopeModel[92].setRotationPoint(-1.5F, -43.5F, -3F);

        defaultScopeModel[93].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0.25F, -1.5F, 0F, 0.25F, 0.75F, 0F, 0F, -0.5F, 0F, -0.25F, -1.25F, 0F, -1.25F, -2F, 0F, -1.5F, 1.25F, 0F, -0.5F, 0.4F); // Box 279
        defaultScopeModel[93].setRotationPoint(-4.5F, -44.5F, -4F);

        defaultScopeModel[94].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -0.75F, -0.25F, 0F, 0.25F, -1F, 0F, 0.5F, 0.25F, 0F, -0.5F, -0.6F, 0F, -0.25F, -2F, 0F, -1.5F, -2.25F, 0F, -1.75F, 1.25F, 0F, -0.5F, 1F); // Box 280
        defaultScopeModel[94].setRotationPoint(-4.5F, -43.5F, -3F);


        defaultGripModel = new ModelRendererTurbo[14];
        defaultGripModel[0] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 247
        defaultGripModel[1] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 248
        defaultGripModel[2] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 249
        defaultGripModel[3] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 250
        defaultGripModel[4] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 251
        defaultGripModel[5] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 252
        defaultGripModel[6] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 253
        defaultGripModel[7] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 254
        defaultGripModel[8] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 255
        defaultGripModel[9] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 256
        defaultGripModel[10] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 257
        defaultGripModel[11] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 258
        defaultGripModel[12] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 259
        defaultGripModel[13] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 260

        defaultGripModel[0].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
        defaultGripModel[0].setRotationPoint(77F, -37.25F, 2F);
        defaultGripModel[0].rotateAngleX = 0.34906585F;

        defaultGripModel[1].addShapeBox(0F, 6F, 0F, 1, 45, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
        defaultGripModel[1].setRotationPoint(78F, -37.25F, 2F);
        defaultGripModel[1].rotateAngleX = 0.34906585F;

        defaultGripModel[2].addShapeBox(0F, 6F, 0F, 1, 45, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 249
        defaultGripModel[2].setRotationPoint(79F, -37.25F, 2F);
        defaultGripModel[2].rotateAngleX = 0.34906585F;

        defaultGripModel[3].addShapeBox(0F, 6F, 0F, 1, 45, 2, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 250
        defaultGripModel[3].setRotationPoint(77F, -37.25F, 2F);
        defaultGripModel[3].rotateAngleX = 0.34906585F;

        defaultGripModel[4].addShapeBox(-1.5F, 6F, 0.5F, 4, 30, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
        defaultGripModel[4].setRotationPoint(78F, -37.25F, 2F);
        defaultGripModel[4].rotateAngleX = 0.34906585F;

        defaultGripModel[5].addShapeBox(-5F, 51F, -1F, 8, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 252
        defaultGripModel[5].setRotationPoint(78F, -37.25F, 2F);
        defaultGripModel[5].rotateAngleX = 0.34906585F;

        defaultGripModel[6].addShapeBox(3F, 51F, -1F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 253
        defaultGripModel[6].setRotationPoint(78F, -37.25F, 2F);
        defaultGripModel[6].rotateAngleX = 0.34906585F;

        defaultGripModel[7].addShapeBox(0F, 0F, -2F, 3, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
        defaultGripModel[7].setRotationPoint(77F, -37.25F, -2F);
        defaultGripModel[7].rotateAngleX = -0.34906585F;

        defaultGripModel[8].addShapeBox(0F, 6F, -2F, 1, 45, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
        defaultGripModel[8].setRotationPoint(78F, -37.25F, -2F);
        defaultGripModel[8].rotateAngleX = -0.34906585F;

        defaultGripModel[9].addShapeBox(0F, 6F, -2F, 1, 45, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 256
        defaultGripModel[9].setRotationPoint(79F, -37.25F, -2F);
        defaultGripModel[9].rotateAngleX = -0.34906585F;

        defaultGripModel[10].addShapeBox(0F, 6F, -2F, 1, 45, 2, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 257
        defaultGripModel[10].setRotationPoint(77F, -37.25F, -2F);
        defaultGripModel[10].rotateAngleX = -0.34906585F;

        defaultGripModel[11].addShapeBox(-1.5F, 6F, -1.5F, 4, 30, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
        defaultGripModel[11].setRotationPoint(78F, -37.25F, -2F);
        defaultGripModel[11].rotateAngleX = -0.34906585F;

        defaultGripModel[12].addShapeBox(-5F, 51F, -2F, 8, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 259
        defaultGripModel[12].setRotationPoint(78F, -37.25F, -3F);
        defaultGripModel[12].rotateAngleX = -0.34906585F;

        defaultGripModel[13].addShapeBox(3F, 51F, -2F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 260
        defaultGripModel[13].setRotationPoint(78F, -37.25F, -3F);
        defaultGripModel[13].rotateAngleX = -0.34906585F;


        ammoModel = new ModelRendererTurbo[20];
        ammoModel[0] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 60
        ammoModel[1] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 61
        ammoModel[2] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 62
        ammoModel[3] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 63
        ammoModel[4] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 64
        ammoModel[5] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 65
        ammoModel[6] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 66
        ammoModel[7] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 67
        ammoModel[8] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 68
        ammoModel[9] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 62
        ammoModel[10] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 63
        ammoModel[11] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 64
        ammoModel[12] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 65
        ammoModel[13] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 66
        ammoModel[14] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 67
        ammoModel[15] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 68
        ammoModel[16] = new ModelRendererTurbo(this, 41, 170, textureX, textureY); // Box 297
        ammoModel[17] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Box 298
        ammoModel[18] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 299
        ammoModel[19] = new ModelRendererTurbo(this, 41, 144, textureX, textureY); // Box 300

        ammoModel[0].addShapeBox(0F, 0F, 0F, 6, 16, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 60
        ammoModel[0].setRotationPoint(21F, -27F, -2F);

        ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
        ammoModel[1].setRotationPoint(27F, -13.5F, -2F);

        ammoModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
        ammoModel[2].setRotationPoint(28F, -13.5F, -2F);

        ammoModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
        ammoModel[3].setRotationPoint(31.5F, -13.5F, -2F);

        ammoModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
        ammoModel[4].setRotationPoint(30.5F, -13.5F, -2F);

        ammoModel[5].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
        ammoModel[5].setRotationPoint(35F, -14.5F, -2F);

        ammoModel[6].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
        ammoModel[6].setRotationPoint(34F, -14.5F, -2F);

        ammoModel[7].addShapeBox(0F, 0F, 0F, 6, 5, 4, 0F, 0F, 0.25F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 67
        ammoModel[7].setRotationPoint(36F, -15.5F, -2F);

        ammoModel[8].addShapeBox(0F, 0F, 0F, 6, 9, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0.25F, 0F); // Box 68
        ammoModel[8].setRotationPoint(36F, -27F, -2F);

        ammoModel[9].addShapeBox(0F, 0F, 0F, 2, 17, 4, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 62
        ammoModel[9].setRotationPoint(32.5F, -27F, -2F);

        ammoModel[10].addShapeBox(0F, 0F, 0F, 2, 17, 4, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 63
        ammoModel[10].setRotationPoint(28.5F, -27F, -2F);

        ammoModel[11].addShapeBox(0F, 0F, 0F, 9, 14, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
        ammoModel[11].setRotationPoint(27F, -27F, -1.5F);

        ammoModel[12].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, -0.25F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F); // Box 65
        ammoModel[12].setRotationPoint(36F, -18F, -1.5F);

        ammoModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.25F, 0.5F); // Box 66
        ammoModel[13].setRotationPoint(36F, -16.5F, -1.5F);

        ammoModel[14].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
        ammoModel[14].setRotationPoint(21F, -10.5F, -2.5F);

        ammoModel[15].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 68
        ammoModel[15].setRotationPoint(36F, -10.5F, -2.5F);

        ammoModel[16].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 297
        ammoModel[16].setRotationPoint(22F, -28F, -1F);

        ammoModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F); // Box 298
        ammoModel[17].setRotationPoint(32F, -28F, -1F);

        ammoModel[18].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
        ammoModel[18].setRotationPoint(33F, -28F, -1F);

        ammoModel[19].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F); // Box 300
        ammoModel[19].setRotationPoint(36F, -28F, -1F);


        slideModel = new ModelRendererTurbo[9];
        slideModel[0] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 288
        slideModel[1] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 289
        slideModel[2] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 290
        slideModel[3] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 291
        slideModel[4] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 292
        slideModel[5] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 293
        slideModel[6] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 294
        slideModel[7] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 295
        slideModel[8] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 296

        slideModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 288
        slideModel[0].setRotationPoint(33F, -32F, -4F);

        slideModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 289
        slideModel[1].setRotationPoint(33F, -33F, -4F);

        slideModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 290
        slideModel[2].setRotationPoint(33F, -31F, -4F);

        slideModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 291
        slideModel[3].setRotationPoint(33F, -32F, -5F);

        slideModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 292
        slideModel[4].setRotationPoint(33.5F, -32F, -9F);

        slideModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 293
        slideModel[5].setRotationPoint(33.5F, -33F, -9F);

        slideModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 294
        slideModel[6].setRotationPoint(33F, -33F, -5F);

        slideModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 295
        slideModel[7].setRotationPoint(33F, -31F, -5F);

        slideModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 296
        slideModel[8].setRotationPoint(33.5F, -31F, -9F);


        barrelAttachPoint = new Vector3f(152F / 16F, 28.25F / 16F, 0F / 16F);

        gadgetAttachPoint = new Vector3f(66F / 16F, 29F / 16F, -3F / 16F);

        scopeAttachPoint = new Vector3f(30F / 16F, 36.75F / 16F, 0F / 16F);
        gunSlideDistance = 1.4F;
        gunOffset = -0.55F;

        leftArmPos = new Vector3f(0.05F, -0.4F, -0.05F);
        leftArmRot = new Vector3f(80F, 50F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.15F, -0.55F, 0.05F);
        leftArmReloadRot = new Vector3f(80F, 50F, 0.0F);
        rightArmPos = new Vector3f(0.25F, -0.52F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85F);
        rightArmReloadPos = new Vector3f(0.25F, -0.52F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);


        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);
        animationType = EnumAnimationType.CUSTOM;
        rotateGunHorizontal = 15.0F;
        tiltGun = 30.0F;
        translateGun = new Vector3f(0.0F, -0.0625F, -0.1875F);
        translateClip = new Vector3f(0.0F, -0.625F, 0.0F);
        hasFlash = true;
        hasArms = true;
        rightHandAmmo = false;
        leftHandAmmo = true;
        crouchZoom = -0.05F;
        translateAll(0F, 0F, 0F);
        zoomOffsetY = -0.075F;
        zoomOffset = 0.2F;

        flipAll();
    }
}