//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Saiga12K
// Model Creator: 
// Created on: 11.10.2020 - 19:53:14
// Last changed on: 11.10.2020 - 19:53:14

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelSaiga12K extends ModelGun //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public ModelSaiga12K() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[179];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        gunModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 1
        gunModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 2
        gunModel[3] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 3
        gunModel[4] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 4
        gunModel[5] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 5
        gunModel[6] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 6
        gunModel[7] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 7
        gunModel[8] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 8
        gunModel[9] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 9
        gunModel[10] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 10
        gunModel[11] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 11
        gunModel[12] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 12
        gunModel[13] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 15
        gunModel[14] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 16
        gunModel[15] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 17
        gunModel[16] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 18
        gunModel[17] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 20
        gunModel[18] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 21
        gunModel[19] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 22
        gunModel[20] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 23
        gunModel[21] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 24
        gunModel[22] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 25
        gunModel[23] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 26
        gunModel[24] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 27
        gunModel[25] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 28
        gunModel[26] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 29
        gunModel[27] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 30
        gunModel[28] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 31
        gunModel[29] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 32
        gunModel[30] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 33
        gunModel[31] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 34
        gunModel[32] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 35
        gunModel[33] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 36
        gunModel[34] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 37
        gunModel[35] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 38
        gunModel[36] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 39
        gunModel[37] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 40
        gunModel[38] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 41
        gunModel[39] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 42
        gunModel[40] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 43
        gunModel[41] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 44
        gunModel[42] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 45
        gunModel[43] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 46
        gunModel[44] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 48
        gunModel[45] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 49
        gunModel[46] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 50
        gunModel[47] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 56
        gunModel[48] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 58
        gunModel[49] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 64
        gunModel[50] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 65
        gunModel[51] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 67
        gunModel[52] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 68
        gunModel[53] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 69
        gunModel[54] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 70
        gunModel[55] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 71
        gunModel[56] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 73
        gunModel[57] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 74
        gunModel[58] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 75
        gunModel[59] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 76
        gunModel[60] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 77
        gunModel[61] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 78
        gunModel[62] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 79
        gunModel[63] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 80
        gunModel[64] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 81
        gunModel[65] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 82
        gunModel[66] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 83
        gunModel[67] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 84
        gunModel[68] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 85
        gunModel[69] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 86
        gunModel[70] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 87
        gunModel[71] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 88
        gunModel[72] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 89
        gunModel[73] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 90
        gunModel[74] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 108
        gunModel[75] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 121
        gunModel[76] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 122
        gunModel[77] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 123
        gunModel[78] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 124
        gunModel[79] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 125
        gunModel[80] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 126
        gunModel[81] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 127
        gunModel[82] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 128
        gunModel[83] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 129
        gunModel[84] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 131
        gunModel[85] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 174
        gunModel[86] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 226
        gunModel[87] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 287
        gunModel[88] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 288
        gunModel[89] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 289
        gunModel[90] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 290
        gunModel[91] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 291
        gunModel[92] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 292
        gunModel[93] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 293
        gunModel[94] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 294
        gunModel[95] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 295
        gunModel[96] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 297
        gunModel[97] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 298
        gunModel[98] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 299
        gunModel[99] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 300
        gunModel[100] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 301
        gunModel[101] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 302
        gunModel[102] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 303
        gunModel[103] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 304
        gunModel[104] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 271
        gunModel[105] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 272
        gunModel[106] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 273
        gunModel[107] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 273
        gunModel[108] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 274
        gunModel[109] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 275
        gunModel[110] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 276
        gunModel[111] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 277
        gunModel[112] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 278
        gunModel[113] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 279
        gunModel[114] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 280
        gunModel[115] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Box 281
        gunModel[116] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Box 282
        gunModel[117] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 283
        gunModel[118] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 284
        gunModel[119] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 285
        gunModel[120] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 286
        gunModel[121] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 287
        gunModel[122] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 290
        gunModel[123] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 291
        gunModel[124] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 292
        gunModel[125] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 293
        gunModel[126] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 294
        gunModel[127] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 295
        gunModel[128] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 296
        gunModel[129] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 297
        gunModel[130] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 298
        gunModel[131] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 299
        gunModel[132] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 309
        gunModel[133] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 310
        gunModel[134] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 170
        gunModel[135] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 170
        gunModel[136] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 170
        gunModel[137] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 170
        gunModel[138] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 170
        gunModel[139] = new ModelRendererTurbo(this, 129, 217, textureX, textureY); // Box 170
        gunModel[140] = new ModelRendererTurbo(this, 393, 209, textureX, textureY); // Box 170
        gunModel[141] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 170
        gunModel[142] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 170
        gunModel[143] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 170
        gunModel[144] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 170
        gunModel[145] = new ModelRendererTurbo(this, 273, 217, textureX, textureY); // Box 300
        gunModel[146] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // Box 301
        gunModel[147] = new ModelRendererTurbo(this, 121, 225, textureX, textureY); // Box 302
        gunModel[148] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 170
        gunModel[149] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 170
        gunModel[150] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 170
        gunModel[151] = new ModelRendererTurbo(this, 201, 177, textureX, textureY); // Box 170
        gunModel[152] = new ModelRendererTurbo(this, 249, 177, textureX, textureY); // Box 170
        gunModel[153] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 170
        gunModel[154] = new ModelRendererTurbo(this, 441, 185, textureX, textureY); // Box 170
        gunModel[155] = new ModelRendererTurbo(this, 417, 217, textureX, textureY); // Box 170
        gunModel[156] = new ModelRendererTurbo(this, 257, 225, textureX, textureY); // Box 170
        gunModel[157] = new ModelRendererTurbo(this, 345, 233, textureX, textureY); // Box 170
        gunModel[158] = new ModelRendererTurbo(this, 369, 233, textureX, textureY); // Box 170
        gunModel[159] = new ModelRendererTurbo(this, 393, 233, textureX, textureY); // Box 170
        gunModel[160] = new ModelRendererTurbo(this, 417, 233, textureX, textureY); // Box 170
        gunModel[161] = new ModelRendererTurbo(this, 489, 233, textureX, textureY); // Box 170
        gunModel[162] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 170
        gunModel[163] = new ModelRendererTurbo(this, 25, 241, textureX, textureY); // Box 170
        gunModel[164] = new ModelRendererTurbo(this, 49, 241, textureX, textureY); // Box 170
        gunModel[165] = new ModelRendererTurbo(this, 73, 241, textureX, textureY); // Box 170
        gunModel[166] = new ModelRendererTurbo(this, 97, 241, textureX, textureY); // Box 170
        gunModel[167] = new ModelRendererTurbo(this, 121, 241, textureX, textureY); // Box 170
        gunModel[168] = new ModelRendererTurbo(this, 145, 241, textureX, textureY); // Box 170
        gunModel[169] = new ModelRendererTurbo(this, 169, 241, textureX, textureY); // Box 170
        gunModel[170] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 170
        gunModel[171] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 170
        gunModel[172] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 170
        gunModel[173] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 170
        gunModel[174] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 170
        gunModel[175] = new ModelRendererTurbo(this, 217, 241, textureX, textureY); // Box 170
        gunModel[176] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 310
        gunModel[177] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 65
        gunModel[178] = new ModelRendererTurbo(this, 233, 241, textureX, textureY); // Box 65

        gunModel[0].addShapeBox(0F, 0F, 0F, 17, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[0].setRotationPoint(-2F, -34F, -4F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 17, 1, 9, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
        gunModel[1].setRotationPoint(-2F, -31F, -4.5F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 17, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 2
        gunModel[2].setRotationPoint(-2F, -30F, -4.5F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 15, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 3
        gunModel[3].setRotationPoint(0F, -26F, -4.5F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 18, 18, 9, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 4
        gunModel[4].setRotationPoint(-7F, -25F, -4.5F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 11, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
        gunModel[5].setRotationPoint(-7F, -7F, -4.5F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 11, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.95F, 0F); // Box 6
        gunModel[6].setRotationPoint(-7F, -4F, -4.5F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 7
        gunModel[7].setRotationPoint(-3F, -33F, -4F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 8
        gunModel[8].setRotationPoint(15F, -34F, -4F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 9
        gunModel[9].setRotationPoint(15F, -31F, -4.5F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 10
        gunModel[10].setRotationPoint(-3F, -31F, -4.5F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 11
        gunModel[11].setRotationPoint(15F, -30F, -4.5F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 3, 4, 9, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F); // Box 12
        gunModel[12].setRotationPoint(-3F, -30F, -4.5F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 15
        gunModel[13].setRotationPoint(11F, -26F, -4.5F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F); // Box 16
        gunModel[14].setRotationPoint(15F, -26F, -4.5F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 8, 18, 9, 0F, -7F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F); // Box 17
        gunModel[15].setRotationPoint(4F, -25F, -4.5F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 8, 18, 9, 0F, -7F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -1F); // Box 18
        gunModel[16].setRotationPoint(-8F, -25F, -4.5F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 20
        gunModel[17].setRotationPoint(-1F, -26F, -4.5F);

        gunModel[18].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 21
        gunModel[18].setRotationPoint(-8F, -7F, -4.5F);

        gunModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 22
        gunModel[19].setRotationPoint(4F, -7F, -4.5F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 23
        gunModel[20].setRotationPoint(4F, -4F, -4.5F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F); // Box 24
        gunModel[21].setRotationPoint(4F, -4F, -4.5F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 25
        gunModel[22].setRotationPoint(5F, -2F, -4.5F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 26
        gunModel[23].setRotationPoint(4F, -1F, -4.5F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 11, 4, 9, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, -1F); // Box 27
        gunModel[24].setRotationPoint(-7F, -3F, -4.5F);

        gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.95F, -1F, 0F, -0.95F, -1F, 0F, 0F, -1F); // Box 28
        gunModel[25].setRotationPoint(4F, 0F, -4.5F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.95F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.95F, -1F); // Box 29
        gunModel[26].setRotationPoint(-8F, -3F, -4.5F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
        gunModel[27].setRotationPoint(16F, -34F, -2F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
        gunModel[28].setRotationPoint(30F, -34F, -2F);

        gunModel[29].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
        gunModel[29].setRotationPoint(17F, -34F, -2F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 33
        gunModel[30].setRotationPoint(16F, -25F, -2F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 34
        gunModel[31].setRotationPoint(29F, -25F, -2F);

        gunModel[32].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 35
        gunModel[32].setRotationPoint(17F, -23F, -2F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // Box 36
        gunModel[33].setRotationPoint(18F, -33F, -1F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
        gunModel[34].setRotationPoint(19F, -31F, -1F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
        gunModel[35].setRotationPoint(19F, -29F, -1F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 39
        gunModel[36].setRotationPoint(20F, -27F, -1F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
        gunModel[37].setRotationPoint(31F, -34F, -3F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 41
        gunModel[38].setRotationPoint(31F, -28F, -3F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
        gunModel[39].setRotationPoint(34F, -27F, -2F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 76, 3, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 43
        gunModel[40].setRotationPoint(-6F, -36F, -5.5F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
        gunModel[41].setRotationPoint(-3F, -38F, -6F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
        gunModel[42].setRotationPoint(-3F, -39F, -6F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 46
        gunModel[43].setRotationPoint(-3F, -37F, -6F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
        gunModel[44].setRotationPoint(53F, -39F, -6F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
        gunModel[45].setRotationPoint(53F, -38F, -6F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 50
        gunModel[46].setRotationPoint(53F, -37F, -6F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 48, 10, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
        gunModel[47].setRotationPoint(-6F, -46F, -5.5F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 28, 8, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
        gunModel[48].setRotationPoint(42F, -44F, -5.5F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 48, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
        gunModel[49].setRotationPoint(-6F, -48F, 0F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 25, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
        gunModel[50].setRotationPoint(42F, -48F, 0.5F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 48, 1, 5, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
        gunModel[51].setRotationPoint(-6F, -49F, 0F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 3, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
        gunModel[52].setRotationPoint(67F, -47F, -5F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
        gunModel[53].setRotationPoint(67F, -48F, -5F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 70, 2, 4, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
        gunModel[54].setRotationPoint(-5F, -51F, 0F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 67, 2, 4, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
        gunModel[55].setRotationPoint(-2F, -53F, 0F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 25, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 73
        gunModel[56].setRotationPoint(-6F, -48F, -5F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 47, 1, 5, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 74
        gunModel[57].setRotationPoint(-6F, -49F, -5F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 49, 2, 4, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 75
        gunModel[58].setRotationPoint(-5F, -51F, -4F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 67, 2, 4, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
        gunModel[59].setRotationPoint(-2F, -53F, -4F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 65, 1, 7, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
        gunModel[60].setRotationPoint(0F, -54F, -3.5F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, -1.95F, 0F, 0F, -1.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
        gunModel[61].setRotationPoint(42F, -46F, -5.5F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
        gunModel[62].setRotationPoint(68F, -46.5F, -5.5F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
        gunModel[63].setRotationPoint(6F, -43F, -7F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
        gunModel[64].setRotationPoint(6F, -45F, -7F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 82
        gunModel[65].setRotationPoint(6F, -41F, -7F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 22, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, 0F, 0F); // Box 83
        gunModel[66].setRotationPoint(12F, -43F, -6.5F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
        gunModel[67].setRotationPoint(10F, -43F, -6.5F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
        gunModel[68].setRotationPoint(17F, -46F, -6.5F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
        gunModel[69].setRotationPoint(35F, -45F, -7F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
        gunModel[70].setRotationPoint(16F, -45F, -6.5F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
        gunModel[71].setRotationPoint(7F, -43F, -7.5F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
        gunModel[72].setRotationPoint(7F, -44F, -7.5F);

        gunModel[73].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 90
        gunModel[73].setRotationPoint(7F, -41F, -7.5F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 9, 6, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
        gunModel[74].setRotationPoint(65F, -53F, -4F);

        gunModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
        gunModel[75].setRotationPoint(-4F, -45F, -6F);

        gunModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 122
        gunModel[76].setRotationPoint(-4F, -43F, -6F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
        gunModel[77].setRotationPoint(-4F, -44F, -6F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
        gunModel[78].setRotationPoint(60F, -43F, 4F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 125
        gunModel[79].setRotationPoint(60F, -41F, 4F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
        gunModel[80].setRotationPoint(60F, -42F, 4F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
        gunModel[81].setRotationPoint(67F, -43F, 4F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
        gunModel[82].setRotationPoint(67F, -42F, 4F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 129
        gunModel[83].setRotationPoint(67F, -41F, 4F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 66, 8, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
        gunModel[84].setRotationPoint(70F, -44F, -6.5F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
        gunModel[85].setRotationPoint(70F, -48F, -6.5F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 226
        gunModel[86].setRotationPoint(-1.5F, -52.5F, -1.5F);
        gunModel[86].rotateAngleZ = -0.78539816F;

        gunModel[87].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
        gunModel[87].setRotationPoint(4F, -43F, 5.5F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 31, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
        gunModel[88].setRotationPoint(4F, -42F, 5.5F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
        gunModel[89].setRotationPoint(16F, -39F, 5.5F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 290
        gunModel[90].setRotationPoint(16F, -37F, 5.5F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F); // Box 291
        gunModel[91].setRotationPoint(4F, -39F, 5.5F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F); // Box 292
        gunModel[92].setRotationPoint(15F, -39F, 5F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F); // Box 293
        gunModel[93].setRotationPoint(23F, -39F, 5F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 294
        gunModel[94].setRotationPoint(28F, -39F, 5.5F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, -1.95F, 0F, 0F, -1.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
        gunModel[95].setRotationPoint(35F, -41F, 5.5F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F); // Box 297
        gunModel[96].setRotationPoint(27F, -39F, 5.5F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
        gunModel[97].setRotationPoint(16F, -39F, 6F);

        gunModel[98].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
        gunModel[98].setRotationPoint(7F, -40F, 6F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
        gunModel[99].setRotationPoint(7F, -42F, 6F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
        gunModel[100].setRotationPoint(7F, -41F, 6F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
        gunModel[101].setRotationPoint(18F, -41F, 6F);

        gunModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 303
        gunModel[102].setRotationPoint(6F, -42F, 6F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 304
        gunModel[103].setRotationPoint(33F, -42F, 6F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 35, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
        gunModel[104].setRotationPoint(136F, -40.5F, -3.5F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 35, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 272
        gunModel[105].setRotationPoint(136F, -37.5F, -3.5F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 35, 2, 7, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
        gunModel[106].setRotationPoint(136F, -42.5F, -3.5F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
        gunModel[107].setRotationPoint(65F, -54F, -4F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 66, 2, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 274
        gunModel[108].setRotationPoint(70F, -36F, -6.5F);

        gunModel[109].addShapeBox(0F, 0F, 0F, 66, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 275
        gunModel[109].setRotationPoint(70F, -34F, -5.5F);

        gunModel[110].addShapeBox(0F, 0F, 0F, 2, 3, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
        gunModel[110].setRotationPoint(70F, -47F, -6.5F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 11, 3, 13, 0F, 0F, 0F, 0F, 0F, -2.95F, 0F, 0F, -2.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
        gunModel[111].setRotationPoint(72F, -47F, -6.5F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 11, 4, 13, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 278
        gunModel[112].setRotationPoint(72F, -48F, -6.5F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 11, 4, 13, 0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 279
        gunModel[113].setRotationPoint(123F, -48F, -6.5F);

        gunModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
        gunModel[114].setRotationPoint(134F, -48F, -6.5F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 2, 3, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
        gunModel[115].setRotationPoint(134F, -47F, -6.5F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 11, 3, 13, 0F, 0F, -2.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
        gunModel[116].setRotationPoint(123F, -47F, -6.5F);

        gunModel[117].addShapeBox(0F, 0F, 0F, 40, 1, 13, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
        gunModel[117].setRotationPoint(83F, -45F, -6.5F);

        gunModel[118].addShapeBox(0F, 0F, 0F, 65, 3, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
        gunModel[118].setRotationPoint(70F, -48F, -5.5F);

        gunModel[119].addShapeBox(0F, 0F, 0F, 66, 3, 11, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
        gunModel[119].setRotationPoint(70F, -51F, -5.5F);

        gunModel[120].addShapeBox(0F, 0F, 0F, 66, 1, 9, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
        gunModel[120].setRotationPoint(70F, -52F, -4.5F);

        gunModel[121].addShapeBox(0F, 0F, 0F, 68, 2, 7, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
        gunModel[121].setRotationPoint(74F, -54F, -3.5F);

        gunModel[122].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 290
        gunModel[122].setRotationPoint(136F, -50F, -3.5F);

        gunModel[123].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
        gunModel[123].setRotationPoint(136F, -52F, -3.5F);

        gunModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
        gunModel[124].setRotationPoint(136F, -51.5F, -4F);

        gunModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
        gunModel[125].setRotationPoint(136F, -50.5F, -5F);

        gunModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
        gunModel[126].setRotationPoint(136F, -47.5F, -6F);

        gunModel[127].addShapeBox(0F, 0F, 0F, 1, 10, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
        gunModel[127].setRotationPoint(136F, -46.5F, -6F);

        gunModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 296
        gunModel[128].setRotationPoint(136F, -36.5F, -6F);

        gunModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 297
        gunModel[129].setRotationPoint(136F, -34.5F, -5F);

        gunModel[130].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 298
        gunModel[130].setRotationPoint(136F, -48F, -1.5F);

        gunModel[131].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
        gunModel[131].setRotationPoint(137F, -47F, -1.5F);

        gunModel[132].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
        gunModel[132].setRotationPoint(136F, -62.5F, -0.5F);

        gunModel[133].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
        gunModel[133].setRotationPoint(137F, -62.5F, -0.5F);

        gunModel[134].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[134].setRotationPoint(65F, -58F, -3F);

        gunModel[135].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[135].setRotationPoint(65F, -60F, 2F);

        gunModel[136].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[136].setRotationPoint(66F, -62F, 2F);

        gunModel[137].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[137].setRotationPoint(65F, -60F, -3F);

        gunModel[138].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[138].setRotationPoint(66F, -62F, -3F);

        gunModel[139].addShapeBox(0F, 0F, 0F, 69, 1, 6, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 170
        gunModel[139].setRotationPoint(73F, -58F, -3F);

        gunModel[140].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 170
        gunModel[140].setRotationPoint(132.5F, -57F, -2F);

        gunModel[141].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[141].setRotationPoint(73F, -57F, -3F);

        gunModel[142].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 170
        gunModel[142].setRotationPoint(86F, -57F, -2F);

        gunModel[143].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 170
        gunModel[143].setRotationPoint(101F, -57F, -2F);

        gunModel[144].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 170
        gunModel[144].setRotationPoint(116F, -57F, -2F);

        gunModel[145].addShapeBox(0F, 0F, 0F, 12, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
        gunModel[145].setRotationPoint(147F, -41F, -4F);

        gunModel[146].addShapeBox(0F, 0F, 0F, 12, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
        gunModel[146].setRotationPoint(147F, -43F, -4F);

        gunModel[147].addShapeBox(0F, 0F, 0F, 12, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 302
        gunModel[147].setRotationPoint(147F, -37F, -4F);

        gunModel[148].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[148].setRotationPoint(75F, -59F, -3F);

        gunModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[149].setRotationPoint(78F, -59F, -3F);

        gunModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[150].setRotationPoint(81F, -59F, -3F);

        gunModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[151].setRotationPoint(84F, -59F, -3F);

        gunModel[152].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[152].setRotationPoint(87F, -59F, -3F);

        gunModel[153].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[153].setRotationPoint(90F, -59F, -3F);

        gunModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[154].setRotationPoint(93F, -59F, -3F);

        gunModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[155].setRotationPoint(96F, -59F, -3F);

        gunModel[156].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[156].setRotationPoint(99F, -59F, -3F);

        gunModel[157].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[157].setRotationPoint(102F, -59F, -3F);

        gunModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[158].setRotationPoint(105F, -59F, -3F);

        gunModel[159].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[159].setRotationPoint(108F, -59F, -3F);

        gunModel[160].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[160].setRotationPoint(111F, -59F, -3F);

        gunModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[161].setRotationPoint(114F, -59F, -3F);

        gunModel[162].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[162].setRotationPoint(117F, -59F, -3F);

        gunModel[163].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[163].setRotationPoint(120F, -59F, -3F);

        gunModel[164].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[164].setRotationPoint(123F, -59F, -3F);

        gunModel[165].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[165].setRotationPoint(126F, -59F, -3F);

        gunModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[166].setRotationPoint(129F, -59F, -3F);

        gunModel[167].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[167].setRotationPoint(132F, -59F, -3F);

        gunModel[168].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[168].setRotationPoint(135F, -59F, -3F);

        gunModel[169].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[169].setRotationPoint(138F, -59F, -3F);

        gunModel[170].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[170].setRotationPoint(68F, -59F, -2F);

        gunModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 170
        gunModel[171].setRotationPoint(69F, -60F, -2F);

        gunModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0.6F, 0F, 0.5F, 0.6F); // Box 170
        gunModel[172].setRotationPoint(69F, -61F, -2F);

        gunModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0.6F, 0F, 0.5F, 0.6F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F); // Box 170
        gunModel[173].setRotationPoint(69F, -61F, 1F);

        gunModel[174].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[174].setRotationPoint(135.5F, -60F, -3F);

        gunModel[175].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 170
        gunModel[175].setRotationPoint(135.5F, -59F, -3F);

        gunModel[176].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 310
        gunModel[176].setRotationPoint(136F, -60.5F, -1.5F);

        gunModel[177].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
        gunModel[177].setRotationPoint(42F, -46F, 4.5F);

        gunModel[178].addShapeBox(0F, 0F, 0F, 23, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
        gunModel[178].setRotationPoint(42F, -49F, 0.5F);


        defaultBarrelModel = new ModelRendererTurbo[22];
        defaultBarrelModel[0] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 300
        defaultBarrelModel[1] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 301
        defaultBarrelModel[2] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 302
        defaultBarrelModel[3] = new ModelRendererTurbo(this, 369, 217, textureX, textureY); // Box 300
        defaultBarrelModel[4] = new ModelRendererTurbo(this, 169, 225, textureX, textureY); // Box 301
        defaultBarrelModel[5] = new ModelRendererTurbo(this, 201, 225, textureX, textureY); // Box 302
        defaultBarrelModel[6] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 189
        defaultBarrelModel[7] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 189
        defaultBarrelModel[8] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 189
        defaultBarrelModel[9] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 189
        defaultBarrelModel[10] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box 189
        defaultBarrelModel[11] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 189
        defaultBarrelModel[12] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Box 189
        defaultBarrelModel[13] = new ModelRendererTurbo(this, 401, 225, textureX, textureY); // Box 189
        defaultBarrelModel[14] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 189
        defaultBarrelModel[15] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 189
        defaultBarrelModel[16] = new ModelRendererTurbo(this, 41, 233, textureX, textureY); // Box 189
        defaultBarrelModel[17] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 189
        defaultBarrelModel[18] = new ModelRendererTurbo(this, 81, 233, textureX, textureY); // Box 189
        defaultBarrelModel[19] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Box 189
        defaultBarrelModel[20] = new ModelRendererTurbo(this, 273, 233, textureX, textureY); // Box 189
        defaultBarrelModel[21] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Box 189

        defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
        defaultBarrelModel[0].setRotationPoint(170F, -41F, -4F);

        defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
        defaultBarrelModel[1].setRotationPoint(170F, -43F, -4F);

        defaultBarrelModel[2].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 302
        defaultBarrelModel[2].setRotationPoint(170F, -37F, -4F);

        defaultBarrelModel[3].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
        defaultBarrelModel[3].setRotationPoint(190F, -41F, -4F);

        defaultBarrelModel[4].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
        defaultBarrelModel[4].setRotationPoint(190F, -43F, -4F);

        defaultBarrelModel[5].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 302
        defaultBarrelModel[5].setRotationPoint(190F, -37F, -4F);

        defaultBarrelModel[6].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 189
        defaultBarrelModel[6].setRotationPoint(174F, -43F, -2F);

        defaultBarrelModel[7].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 189
        defaultBarrelModel[7].setRotationPoint(174F, -43F, 1F);

        defaultBarrelModel[8].addBox(0F, 0F, 0F, 9, 1, 2, 0F); // Box 189
        defaultBarrelModel[8].setRotationPoint(174F, -43F, -1F);

        defaultBarrelModel[9].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 189
        defaultBarrelModel[9].setRotationPoint(174F, -36F, -2F);

        defaultBarrelModel[10].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 189
        defaultBarrelModel[10].setRotationPoint(174F, -36F, 1F);

        defaultBarrelModel[11].addBox(0F, 0F, 0F, 9, 1, 2, 0F); // Box 189
        defaultBarrelModel[11].setRotationPoint(174F, -36F, -1F);

        defaultBarrelModel[12].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 189
        defaultBarrelModel[12].setRotationPoint(174F, -41F, 3F);

        defaultBarrelModel[13].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 189
        defaultBarrelModel[13].setRotationPoint(174F, -38F, 3F);

        defaultBarrelModel[14].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 189
        defaultBarrelModel[14].setRotationPoint(174F, -40F, 3F);

        defaultBarrelModel[15].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 189
        defaultBarrelModel[15].setRotationPoint(174F, -41F, -4F);

        defaultBarrelModel[16].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 189
        defaultBarrelModel[16].setRotationPoint(174F, -38F, -4F);

        defaultBarrelModel[17].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 189
        defaultBarrelModel[17].setRotationPoint(174F, -40F, -4F);

        defaultBarrelModel[18].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 189
        defaultBarrelModel[18].setRotationPoint(174F, -43F, 2F);

        defaultBarrelModel[19].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 189
        defaultBarrelModel[19].setRotationPoint(174F, -36F, 2F);

        defaultBarrelModel[20].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 189
        defaultBarrelModel[20].setRotationPoint(174F, -43F, -3F);

        defaultBarrelModel[21].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 189
        defaultBarrelModel[21].setRotationPoint(174F, -36F, -3F);


        defaultStockModel = new ModelRendererTurbo[19];
        defaultStockModel[0] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 225
        defaultStockModel[1] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 232
        defaultStockModel[2] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 233
        defaultStockModel[3] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 235
        defaultStockModel[4] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 236
        defaultStockModel[5] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 237
        defaultStockModel[6] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Box 238
        defaultStockModel[7] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 240
        defaultStockModel[8] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Box 241
        defaultStockModel[9] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 242
        defaultStockModel[10] = new ModelRendererTurbo(this, 137, 185, textureX, textureY); // Box 243
        defaultStockModel[11] = new ModelRendererTurbo(this, 265, 185, textureX, textureY); // Box 244
        defaultStockModel[12] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 246
        defaultStockModel[13] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 247
        defaultStockModel[14] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 249
        defaultStockModel[15] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 250
        defaultStockModel[16] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Box 252
        defaultStockModel[17] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 253
        defaultStockModel[18] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 254

        defaultStockModel[0].addShapeBox(0F, 0F, 0F, 4, 12, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 225
        defaultStockModel[0].setRotationPoint(-11F, -45F, -3.5F);

        defaultStockModel[1].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 232
        defaultStockModel[1].setRotationPoint(-11F, -34F, -3.5F);

        defaultStockModel[2].addShapeBox(0F, 0F, 0F, 1, 12, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
        defaultStockModel[2].setRotationPoint(-12F, -45F, -3.5F);

        defaultStockModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 235
        defaultStockModel[3].setRotationPoint(-12F, -33F, -3.5F);

        defaultStockModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 236
        defaultStockModel[4].setRotationPoint(-7F, -34F, -3.5F);

        defaultStockModel[5].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
        defaultStockModel[5].setRotationPoint(-12F, -46F, -3.5F);

        defaultStockModel[6].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
        defaultStockModel[6].setRotationPoint(-7F, -45F, -3.5F);

        defaultStockModel[7].addShapeBox(0F, 0F, 0F, 60, 8, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 240
        defaultStockModel[7].setRotationPoint(-72F, -44.5F, 1.5F);

        defaultStockModel[8].addShapeBox(0F, 0F, 0F, 60, 8, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 241
        defaultStockModel[8].setRotationPoint(-72F, -44.5F, -2.5F);

        defaultStockModel[9].addShapeBox(0F, 0F, 0F, 60, 5, 5, 0F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 242
        defaultStockModel[9].setRotationPoint(-72F, -45.5F, -2.5F);

        defaultStockModel[10].addShapeBox(0F, 0F, 0F, 60, 23, 1, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F); // Box 243
        defaultStockModel[10].setRotationPoint(-72F, -37.5F, 1.5F);

        defaultStockModel[11].addShapeBox(0F, 0F, 0F, 60, 20, 5, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, 0F, -1F, 0F, -19F, -1F, 0F, -19F, -1F, 0F, 0F, -1F); // Box 244
        defaultStockModel[11].setRotationPoint(-72F, -33.5F, -2.5F);

        defaultStockModel[12].addShapeBox(0F, 0F, 0F, 60, 23, 1, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F); // Box 246
        defaultStockModel[12].setRotationPoint(-72F, -37.5F, -2.5F);

        defaultStockModel[13].addShapeBox(0F, 0F, 0F, 9, 26, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
        defaultStockModel[13].setRotationPoint(-81F, -40.5F, -2.5F);

        defaultStockModel[14].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
        defaultStockModel[14].setRotationPoint(-81F, -41.5F, -2.5F);

        defaultStockModel[15].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 250
        defaultStockModel[15].setRotationPoint(-81F, -14.5F, -2.5F);

        defaultStockModel[16].addShapeBox(0F, 0F, 0F, 3, 27, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
        defaultStockModel[16].setRotationPoint(-80.5F, -41F, -3F);

        defaultStockModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
        defaultStockModel[17].setRotationPoint(-80.5F, -42F, -3F);

        defaultStockModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 254
        defaultStockModel[18].setRotationPoint(-80.5F, -14F, -3F);


        ammoModel = new ModelRendererTurbo[1];
        ammoModel[0] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); // Import Import

        ammoModel[0].addShapeBox(0F, 0F, 0F, 19, 39, 6, 0F, 2F, 0.0F, 0.0F, -2F, 4.0F, 0.0F, -2F, 4.0F, 0.0F, 2F, 0.0F, 0.0F, -4F, 1.0F, 0.0F, 4F, -2F, 0.0F, 4F, -2F, 0.0F, -4F, 1.0F, 0.0F); // Import Import
        ammoModel[0].setRotationPoint(41F, -34F, -3F);


        slideModel = new ModelRendererTurbo[6];
        slideModel[0] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 100
        slideModel[1] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 101
        slideModel[2] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 102
        slideModel[3] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 103
        slideModel[4] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 104
        slideModel[5] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 107

        slideModel[0].addShapeBox(0F, 0F, 0F, 31, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
        slideModel[0].setRotationPoint(36F, -47F, -4.5F);

        slideModel[1].addShapeBox(0F, 0F, 0F, 31, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
        slideModel[1].setRotationPoint(36F, -48F, -4.5F);

        slideModel[2].addShapeBox(0F, 0F, 0F, 29, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
        slideModel[2].setRotationPoint(36F, -49F, -3.5F);

        slideModel[3].addShapeBox(0F, 0F, 0F, 29, 2, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
        slideModel[3].setRotationPoint(36F, -51F, -3.5F);

        slideModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
        slideModel[4].setRotationPoint(65F, -47F, -9.5F);

        slideModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
        slideModel[5].setRotationPoint(65F, -47F, -10.5F);


        barrelAttachPoint = new Vector3f(170F / 16F, 44F / 16F, 0F / 16F);
        stockAttachPoint = new Vector3f(-6F / 16F, 45F / 16F, 0F / 16F);
        scopeAttachPoint = new Vector3f(95F / 16F, 63F / 16F, 0F / 16F);
        gripAttachPoint = new Vector3f(100 / 16F, 38F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(112 / 16F, 44F / 16F, -6.5F / 16F);
        thirdPersonOffset = new Vector3f(0.2875D, -0.09375D, 0.0D);
        gunSlideDistance = 1.4F;

        gunOffsetX = -7F;
        gunOffset = -0.85F;

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
        zoomOffset = 0.3F;
        ShakeDistance = 0.8F;
        translateAll(0F, -5F, 0F);
        flipAll();
    }

}