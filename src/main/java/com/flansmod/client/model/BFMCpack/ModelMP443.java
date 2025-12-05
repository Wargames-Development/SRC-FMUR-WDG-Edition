//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MP443
// Model Creator: 
// Created on: 18.07.2020 - 17:27:33
// Last changed on: 18.07.2020 - 17:27:33

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelMP443 extends ModelGun //Same as Filename
{
    int textureX = 512;
    int textureY = 256;

    public ModelMP443() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[147];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44
        gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 45
        gunModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 46
        gunModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 47
        gunModel[4] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 48
        gunModel[5] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 49
        gunModel[6] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 50
        gunModel[7] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 51
        gunModel[8] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 52
        gunModel[9] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 53
        gunModel[10] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 54
        gunModel[11] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 55
        gunModel[12] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 65
        gunModel[13] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 66
        gunModel[14] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 67
        gunModel[15] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 68
        gunModel[16] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 69
        gunModel[17] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 70
        gunModel[18] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 71
        gunModel[19] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 72
        gunModel[20] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 73
        gunModel[21] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 76
        gunModel[22] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 77
        gunModel[23] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 78
        gunModel[24] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 79
        gunModel[25] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 80
        gunModel[26] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 81
        gunModel[27] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 82
        gunModel[28] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 46
        gunModel[29] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 47
        gunModel[30] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 49
        gunModel[31] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 50
        gunModel[32] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 57
        gunModel[33] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 58
        gunModel[34] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 60
        gunModel[35] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 61
        gunModel[36] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 62
        gunModel[37] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 63
        gunModel[38] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 64
        gunModel[39] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 99
        gunModel[40] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 100
        gunModel[41] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 101
        gunModel[42] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 102
        gunModel[43] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 103
        gunModel[44] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 104
        gunModel[45] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 105
        gunModel[46] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 106
        gunModel[47] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 107
        gunModel[48] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 108
        gunModel[49] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 109
        gunModel[50] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 110
        gunModel[51] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 111
        gunModel[52] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 112
        gunModel[53] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 113
        gunModel[54] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 114
        gunModel[55] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 115
        gunModel[56] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 116
        gunModel[57] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 117
        gunModel[58] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 118
        gunModel[59] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 119
        gunModel[60] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 120
        gunModel[61] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 121
        gunModel[62] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 122
        gunModel[63] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 123
        gunModel[64] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 124
        gunModel[65] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 125
        gunModel[66] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 126
        gunModel[67] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 127
        gunModel[68] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 128
        gunModel[69] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 129
        gunModel[70] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 130
        gunModel[71] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 131
        gunModel[72] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 132
        gunModel[73] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 133
        gunModel[74] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 134
        gunModel[75] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 135
        gunModel[76] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 136
        gunModel[77] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 137
        gunModel[78] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 138
        gunModel[79] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 139
        gunModel[80] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 140
        gunModel[81] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 141
        gunModel[82] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 142
        gunModel[83] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 143
        gunModel[84] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 144
        gunModel[85] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 145
        gunModel[86] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 146
        gunModel[87] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 147
        gunModel[88] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 148
        gunModel[89] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 149
        gunModel[90] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 150
        gunModel[91] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 151
        gunModel[92] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 152
        gunModel[93] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 153
        gunModel[94] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 154
        gunModel[95] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 155
        gunModel[96] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 156
        gunModel[97] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 163
        gunModel[98] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 164
        gunModel[99] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 165
        gunModel[100] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 166
        gunModel[101] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 167
        gunModel[102] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 171
        gunModel[103] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 172
        gunModel[104] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 173
        gunModel[105] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 174
        gunModel[106] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 175
        gunModel[107] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 176
        gunModel[108] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 177
        gunModel[109] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 178
        gunModel[110] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 182
        gunModel[111] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 184
        gunModel[112] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 186
        gunModel[113] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 210
        gunModel[114] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 211
        gunModel[115] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 212
        gunModel[116] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 213
        gunModel[117] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 214
        gunModel[118] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 215
        gunModel[119] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 216
        gunModel[120] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 217
        gunModel[121] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 218
        gunModel[122] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 219
        gunModel[123] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 220
        gunModel[124] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 223
        gunModel[125] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 225
        gunModel[126] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 229
        gunModel[127] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 231
        gunModel[128] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 233
        gunModel[129] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 234
        gunModel[130] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 235
        gunModel[131] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 236
        gunModel[132] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 237
        gunModel[133] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 239
        gunModel[134] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 239
        gunModel[135] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 245
        gunModel[136] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 246
        gunModel[137] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 247
        gunModel[138] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 248
        gunModel[139] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 174
        gunModel[140] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 175
        gunModel[141] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 176
        gunModel[142] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 167
        gunModel[143] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 174
        gunModel[144] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 175
        gunModel[145] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 174
        gunModel[146] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 175

        gunModel[0].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 44
        gunModel[0].setRotationPoint(-4F, -24.5F, -3F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 45
        gunModel[1].setRotationPoint(-4F, -23.5F, -3F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 46
        gunModel[2].setRotationPoint(-2F, -22.5F, -3F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 9, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 47
        gunModel[3].setRotationPoint(11F, -24.5F, -3F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 16, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
        gunModel[4].setRotationPoint(11F, -24.5F, -2.5F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 49
        gunModel[5].setRotationPoint(27F, -24.5F, -2.5F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 9, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
        gunModel[6].setRotationPoint(28F, -24.5F, -2.5F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 51
        gunModel[7].setRotationPoint(28F, -22.5F, -2.5F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 52
        gunModel[8].setRotationPoint(27F, -22.5F, -2.5F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, -2F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F); // Box 53
        gunModel[9].setRotationPoint(22F, -24.5F, -3F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 54
        gunModel[10].setRotationPoint(11F, -22F, -3F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 55
        gunModel[11].setRotationPoint(10F, -21F, -3F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 65
        gunModel[12].setRotationPoint(15F, -29.5F, -2.5F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 66
        gunModel[13].setRotationPoint(15F, -30.25F, -2.5F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
        gunModel[14].setRotationPoint(21F, -29.5F, -2.5F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
        gunModel[15].setRotationPoint(21F, -30.5F, -2.5F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.5F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 69
        gunModel[16].setRotationPoint(20F, -29.5F, -2.5F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F); // Box 70
        gunModel[17].setRotationPoint(20F, -29.5F, -2.5F);

        gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F); // Box 71
        gunModel[18].setRotationPoint(20F, -29.5F, -2.5F);

        gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.5F, -1F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, -1F, -0.5F, -0.5F, 0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, -0.25F); // Box 72
        gunModel[19].setRotationPoint(20F, -30.5F, -2.5F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F); // Box 73
        gunModel[20].setRotationPoint(19.5F, -29.5F, -2.5F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 76
        gunModel[21].setRotationPoint(20F, -24.5F, -3F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 77
        gunModel[22].setRotationPoint(19.5F, -24.25F, -3F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 78
        gunModel[23].setRotationPoint(21.5F, -24.25F, -3F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 79
        gunModel[24].setRotationPoint(22F, -23.75F, -3F);

        gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 80
        gunModel[25].setRotationPoint(21.5F, -23.25F, -3F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, -0.75F, 0F, 0.2F, -0.75F, 0F, 0.2F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
        gunModel[26].setRotationPoint(20F, -23F, -3F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
        gunModel[27].setRotationPoint(19.5F, -23.25F, -3F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 46
        gunModel[28].setRotationPoint(28F, -22F, -2F);

        gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.99F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 47
        gunModel[29].setRotationPoint(27F, -22.5F, -2.5F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F); // Box 49
        gunModel[30].setRotationPoint(11F, -22.5F, -3F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.625F, 0F, -0.375F, -0.625F, 0F, -0.375F, -0.125F); // Box 50
        gunModel[31].setRotationPoint(22F, -22.5F, -3F);

        gunModel[32].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, -0.125F, -0.75F, 0.25F, -0.125F, -0.75F, 0.25F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.75F, 0.25F, -0.125F, -0.75F, 0.25F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 57
        gunModel[32].setRotationPoint(13F, -24.25F, 2.25F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.125F, 0.5F, -0.25F, -0.25F, 0.5F, -0.5F, -0.5F, -0.75F, 0F, -0.125F, -0.75F, 0F, 0.125F, 0.5F, -0.25F, -0.25F, 0.5F, -0.5F, -0.5F, -0.75F, 0F, -0.125F, -0.75F); // Box 58
        gunModel[33].setRotationPoint(21.25F, -24.25F, 3F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.125F, 0.5F, 0F, 0.125F, 0.5F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, 0.5F, 0F, 0.125F, 0.5F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F); // Box 60
        gunModel[34].setRotationPoint(20.25F, -24.25F, 3F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0.25F, -0.75F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, 0.125F, 0F, 0.25F, 0.125F, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 61
        gunModel[35].setRotationPoint(9.5F, -24.25F, 2.25F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0.25F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F, -0.125F, 0F, -0.25F, 0.25F, 0.125F, -0.25F, 0F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F, -0.125F, 0F, -0.25F, 0F, 0.125F); // Box 62
        gunModel[36].setRotationPoint(12.5F, -24.25F, 2.25F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, -0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, 0.125F, -0.25F, -0.25F, 0.125F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.125F, -0.25F, -0.25F, 0.125F); // Box 63
        gunModel[37].setRotationPoint(8.75F, -24.25F, 2.25F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, 0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F); // Box 64
        gunModel[38].setRotationPoint(9F, -23.75F, 3.25F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F); // Box 99
        gunModel[39].setRotationPoint(1F, -20.5F, -3F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 1, 17, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 100
        gunModel[40].setRotationPoint(3.5F, -18.5F, -2.5F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
        gunModel[41].setRotationPoint(10F, -19F, -3F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 102
        gunModel[42].setRotationPoint(10F, -18F, -3F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 103
        gunModel[43].setRotationPoint(10F, -16.5F, -3F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 104
        gunModel[44].setRotationPoint(10F, -15.5F, -3F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
        gunModel[45].setRotationPoint(10F, -16F, -3F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 106
        gunModel[46].setRotationPoint(10F, -17F, -3F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, -1F, 4F, 0F, 0F); // Box 107
        gunModel[47].setRotationPoint(11F, -17F, -3F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 108
        gunModel[48].setRotationPoint(10F, -14.5F, -3F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 109
        gunModel[49].setRotationPoint(9.5F, -14.5F, -3F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 110
        gunModel[50].setRotationPoint(6F, -1F, -3F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.25F, -1F, 0.5F, -0.25F, -1F, -0.5F, 0F, 0F); // Box 111
        gunModel[51].setRotationPoint(7F, -1F, -3F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
        gunModel[52].setRotationPoint(5F, -1F, -3F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
        gunModel[53].setRotationPoint(-1F, 0F, -3F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
        gunModel[54].setRotationPoint(-1.5F, -1F, -3F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 115
        gunModel[55].setRotationPoint(-1.5F, -2F, -3F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
        gunModel[56].setRotationPoint(-1F, 0F, 2F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
        gunModel[57].setRotationPoint(5F, -1F, 2F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 118
        gunModel[58].setRotationPoint(-1.5F, -2F, 2F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
        gunModel[59].setRotationPoint(-1.5F, -1F, 2F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
        gunModel[60].setRotationPoint(-1.5F, -2F, -2F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
        gunModel[61].setRotationPoint(-1.5F, -1F, -2F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 122
        gunModel[62].setRotationPoint(-1F, 0F, -2F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 123
        gunModel[63].setRotationPoint(-3F, -1.5F, -2F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F); // Box 124
        gunModel[64].setRotationPoint(-3.5F, -1.5F, -2F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 125
        gunModel[65].setRotationPoint(-3.5F, -1F, -1.5F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 126
        gunModel[66].setRotationPoint(-3.5F, 0F, -1.5F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 127
        gunModel[67].setRotationPoint(-3F, 0F, -1.5F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
        gunModel[68].setRotationPoint(-2F, -1F, -1.5F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.75F, 0F); // Box 129
        gunModel[69].setRotationPoint(-2.5F, -1.25F, -1.5F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 130
        gunModel[70].setRotationPoint(-2.5F, -0.75F, -1.5F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F); // Box 131
        gunModel[71].setRotationPoint(-3.5F, -0.75F, -1.5F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.5F, 0F); // Box 132
        gunModel[72].setRotationPoint(-3.5F, -1.25F, -1.5F);

        gunModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -1.75F, -0.25F, -0.5F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.75F, -0.25F, -0.5F); // Box 133
        gunModel[73].setRotationPoint(0.5F, -20.5F, -3F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, -1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 134
        gunModel[74].setRotationPoint(12F, -21F, -3F);

        gunModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 135
        gunModel[75].setRotationPoint(12F, -19F, -3F);

        gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, -0.5F, 0.5F, 0F); // Box 136
        gunModel[76].setRotationPoint(12F, -18F, -3F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -1F, 0F, 0F); // Box 137
        gunModel[77].setRotationPoint(12F, -17F, -3F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 138
        gunModel[78].setRotationPoint(13F, -22F, -3F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 16, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 139
        gunModel[79].setRotationPoint(11F, -21.5F, -2.5F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.99F, -1.5F, 0F, -0.99F, -1.5F, 0F, -0.75F, -0.25F); // Box 140
        gunModel[80].setRotationPoint(27F, -21.5F, -2.5F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1.75F, -0.5F, 0F); // Box 141
        gunModel[81].setRotationPoint(23F, -22F, -2F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 142
        gunModel[82].setRotationPoint(25F, -20.5F, -2F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 143
        gunModel[83].setRotationPoint(25F, -19.5F, -2F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, -0.25F, 0F, 0F, -0.74F, 0F, 0F, -0.74F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F); // Box 144
        gunModel[84].setRotationPoint(25.5F, -16.5F, -2F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 145
        gunModel[85].setRotationPoint(23.75F, -16.5F, -2F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 146
        gunModel[86].setRotationPoint(20.75F, -14.5F, -2F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
        gunModel[87].setRotationPoint(17.75F, -14.5F, -2F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 148
        gunModel[88].setRotationPoint(13.75F, -14.5F, -2F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, 0F, 0F); // Box 149
        gunModel[89].setRotationPoint(12.75F, -15.25F, -2F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 150
        gunModel[90].setRotationPoint(16F, -22.5F, -1F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 151
        gunModel[91].setRotationPoint(15.5F, -20.5F, -1F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 152
        gunModel[92].setRotationPoint(15F, -18.5F, -1F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0.5F, 0F, 0.875F, 0.25F, 0F, 0.875F, 0.25F, 0F, -1.25F, 0.5F, 0F); // Box 153
        gunModel[93].setRotationPoint(15F, -17.5F, -1F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F); // Box 154
        gunModel[94].setRotationPoint(11F, -16F, -3F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F); // Box 155
        gunModel[95].setRotationPoint(11F, -16.5F, -3F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F); // Box 156
        gunModel[96].setRotationPoint(11F, -15.5F, -3F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 163
        gunModel[97].setRotationPoint(22.75F, -28.5F, -1.5F);

        gunModel[98].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 164
        gunModel[98].setRotationPoint(22.75F, -29.25F, -1.5F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, -0.25F, -1.125F, 0F, -0.25F, -1.125F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 165
        gunModel[99].setRotationPoint(22.75F, -29.75F, -1.5F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 166
        gunModel[100].setRotationPoint(22.75F, -29.75F, -0.5F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.125F, -0.875F, -0.25F, -0.125F, -0.875F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.25F, -0.875F, -0.375F, -0.25F, -0.875F, -0.375F, -0.25F, 0F, -0.25F, -0.25F); // Box 167
        gunModel[101].setRotationPoint(41.75F, -29.75F, -0.5F);

        gunModel[102].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 171
        gunModel[102].setRotationPoint(22.75F, -28.5F, 0.5F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 172
        gunModel[103].setRotationPoint(22.75F, -29.25F, 0.5F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.25F, -1.125F, 0F, -0.25F, -1.125F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 173
        gunModel[104].setRotationPoint(22.75F, -29.75F, 0.5F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0.25F, -0.875F, -0.625F, 0.25F, -0.875F, -0.25F, -1.125F, 0F, -0.25F, -1.125F, 0F, 0F, -0.25F, -0.875F, 0F, -0.375F, -0.875F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 174
        gunModel[105].setRotationPoint(41.75F, -29.75F, 0.5F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, -0.875F, -0.5F, -0.375F, -0.875F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, 0F, -0.5F, -0.875F, 0F, -0.625F, -0.875F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 175
        gunModel[106].setRotationPoint(41.75F, -29.25F, 0.5F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.5F, -0.875F, -0.25F, -0.625F, -0.875F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.25F, -0.5F, -0.875F, -0.25F, -0.625F, -0.875F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 176
        gunModel[107].setRotationPoint(41.75F, -28.5F, 0.5F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F); // Box 177
        gunModel[108].setRotationPoint(22.75F, -27.75F, 0.5F);

        gunModel[109].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.25F, -1.125F, 0F, -0.25F, -1.125F); // Box 178
        gunModel[109].setRotationPoint(22.75F, -27.25F, 0.5F);

        gunModel[110].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 182
        gunModel[110].setRotationPoint(22.75F, -27.75F, -1.5F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -1.125F, 0F, -0.25F, -1.125F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F); // Box 184
        gunModel[111].setRotationPoint(22.75F, -27.25F, -1.5F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Box 186
        gunModel[112].setRotationPoint(22.75F, -27.25F, -0.5F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
        gunModel[113].setRotationPoint(21F, -28.5F, -2.5F);

        gunModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 211
        gunModel[114].setRotationPoint(20F, -28.5F, -2.5F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F); // Box 212
        gunModel[115].setRotationPoint(20F, -28.5F, -2.5F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 213
        gunModel[116].setRotationPoint(15F, -28.5F, -2.5F);

        gunModel[117].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 214
        gunModel[117].setRotationPoint(-4F, -24.5F, 2F);

        gunModel[118].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 215
        gunModel[118].setRotationPoint(-4F, -23.5F, 2F);

        gunModel[119].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 216
        gunModel[119].setRotationPoint(-2F, -22.5F, 2F);

        gunModel[120].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 217
        gunModel[120].setRotationPoint(-2F, -21.5F, -2F);

        gunModel[121].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0.25F, 0F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, 0F, 0.25F, 0F, 0F, 0.5F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, -1F, 0F); // Box 218
        gunModel[121].setRotationPoint(-4F, -23.5F, -3F);

        gunModel[122].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, -0.5F, 0.25F, 0F, -0.5F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, -1F, -0.5F); // Box 219
        gunModel[122].setRotationPoint(-4F, -23.5F, 2F);

        gunModel[123].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, -0.05F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 220
        gunModel[123].setRotationPoint(-4.5F, -21.5F, -2F);

        gunModel[124].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.325F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 223
        gunModel[124].setRotationPoint(-4F, -25.5F, 2F);

        gunModel[125].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, -0.325F, 0F, -0.55F, -0.16F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.55F, -0.16F, -0.5F, -0.55F); // Box 225
        gunModel[125].setRotationPoint(-4F, -25.5F, 2.5F);

        gunModel[126].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, -0.325F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
        gunModel[126].setRotationPoint(-4F, -25.5F, -3F);

        gunModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.325F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.16F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, 0F, -0.16F, -0.5F, 0F); // Box 231
        gunModel[127].setRotationPoint(-4F, -25.5F, -3.5F);

        gunModel[128].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
        gunModel[128].setRotationPoint(1F, -24.5F, -2F);

        gunModel[129].addShapeBox(-2F, -0.5F, 0.75F, 2, 1, 1, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F); // Box 234
        gunModel[129].setRotationPoint(7.5F, -21.75F, 2.5F);
        gunModel[129].rotateAngleZ = -0.59341195F;

        gunModel[130].addShapeBox(-4F, -0.5F, 0F, 4, 1, 1, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 235
        gunModel[130].setRotationPoint(7.5F, -21.75F, 2.5F);
        gunModel[130].rotateAngleZ = -0.59341195F;

        gunModel[131].addShapeBox(0F, -0.5F, 0F, 1, 1, 1, 0F, 0F, 0.25F, -0.25F, -0.625F, 0.125F, -0.25F, -0.75F, -0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0.25F, -0.25F, -0.625F, 0.125F, -0.25F, -0.75F, -0.125F, -0.125F, 0F, 0F, -0.125F); // Box 236
        gunModel[131].setRotationPoint(7.5F, -21.75F, 2.5F);
        gunModel[131].rotateAngleZ = -0.59341195F;

        gunModel[132].addShapeBox(0F, -0.5F, 0.75F, 1, 1, 1, 0F, 0F, 0F, -0.125F, -0.75F, -0.125F, -0.125F, -0.875F, -0.375F, -0.5F, 0F, -0.25F, -0.375F, 0F, 0F, -0.125F, -0.75F, -0.125F, -0.125F, -0.875F, -0.375F, -0.5F, 0F, -0.25F, -0.375F); // Box 237
        gunModel[132].setRotationPoint(7.5F, -21.75F, 2.5F);
        gunModel[132].rotateAngleZ = -0.59341195F;

        gunModel[133].addShapeBox(-5F, -0.5F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.125F, -0.5F, -0.25F, -0.125F, -0.25F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.125F, -0.5F, -0.25F, -0.125F); // Box 239
        gunModel[133].setRotationPoint(7.5F, -21.75F, 2.5F);
        gunModel[133].rotateAngleZ = -0.59341195F;

        gunModel[134].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
        gunModel[134].setRotationPoint(-3F, -27.5F, 1F);

        gunModel[135].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
        gunModel[135].setRotationPoint(-3F, -24.5F, -2F);

        gunModel[136].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
        gunModel[136].setRotationPoint(-4F, -27.5F, -1F);

        gunModel[137].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
        gunModel[137].setRotationPoint(-4F, -26.5F, -1F);

        gunModel[138].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 248
        gunModel[138].setRotationPoint(-4F, -25.5F, -1F);

        gunModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -1.125F, -0.875F, -0.25F, -1.125F, -0.875F, -0.625F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.375F, -0.375F, -0.875F, -0.375F, -0.375F, -0.875F, 0F, -0.375F, 0F, 0F, -0.25F); // Box 174
        gunModel[139].setRotationPoint(41.75F, -29.75F, -1.5F);

        gunModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.125F, -0.375F, -0.875F, -0.125F, -0.375F, -0.875F, -0.5F, -0.375F, 0F, -0.5F, -0.25F, 0F, -0.125F, 0F, -0.875F, -0.125F, 0F, -0.875F, 0F, -0.625F, 0F, 0F, -0.5F); // Box 175
        gunModel[140].setRotationPoint(41.75F, -29.25F, -1.5F);

        gunModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.125F, 0F, -0.875F, -0.125F, 0F, -0.875F, -0.25F, -0.625F, 0F, -0.25F, -0.5F, 0F, -0.125F, 0F, -0.875F, -0.125F, 0F, -0.875F, -0.25F, -0.625F, 0F, -0.25F, -0.5F); // Box 176
        gunModel[141].setRotationPoint(41.75F, -28.5F, -1.5F);

        gunModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.875F, -0.375F, -0.25F, -0.875F, -0.375F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.125F, -0.875F, -0.25F, -0.125F, -0.875F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Box 167
        gunModel[142].setRotationPoint(41.75F, -27.25F, -0.5F);

        gunModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.875F, 0F, -0.375F, -0.875F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.75F, 0.25F, -0.875F, -0.625F, 0.25F, -0.875F, -0.25F, -1.125F, 0F, -0.25F, -1.125F); // Box 174
        gunModel[143].setRotationPoint(41.75F, -27.25F, 0.5F);

        gunModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, -0.875F, 0F, -0.625F, -0.875F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, -0.25F, -0.875F, -0.5F, -0.375F, -0.875F, -0.125F, -0.375F, 0F, -0.125F, -0.375F); // Box 175
        gunModel[144].setRotationPoint(41.75F, -27.75F, 0.5F);

        gunModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.375F, -0.375F, -0.875F, -0.375F, -0.375F, -0.875F, 0F, -0.375F, 0F, 0F, -0.25F, 0F, -0.25F, -1.125F, -0.875F, -0.25F, -1.125F, -0.875F, -0.625F, 0.25F, 0F, -0.75F, 0.25F); // Box 174
        gunModel[145].setRotationPoint(41.75F, -27.25F, -1.5F);

        gunModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.125F, 0F, -0.875F, -0.125F, 0F, -0.875F, 0F, -0.625F, 0F, 0F, -0.5F, 0F, -0.125F, -0.375F, -0.875F, -0.125F, -0.375F, -0.875F, -0.5F, -0.375F, 0F, -0.5F, -0.25F); // Box 175
        gunModel[146].setRotationPoint(41.75F, -27.75F, -1.5F);


        defaultGripModel = new ModelRendererTurbo[32];
        defaultGripModel[0] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 249
        defaultGripModel[1] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 250
        defaultGripModel[2] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 251
        defaultGripModel[3] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 252
        defaultGripModel[4] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 253
        defaultGripModel[5] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 254
        defaultGripModel[6] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 255
        defaultGripModel[7] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 256
        defaultGripModel[8] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 257
        defaultGripModel[9] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 258
        defaultGripModel[10] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 259
        defaultGripModel[11] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 260
        defaultGripModel[12] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 261
        defaultGripModel[13] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 262
        defaultGripModel[14] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 263
        defaultGripModel[15] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 264
        defaultGripModel[16] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 265
        defaultGripModel[17] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 266
        defaultGripModel[18] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 267
        defaultGripModel[19] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 268
        defaultGripModel[20] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 269
        defaultGripModel[21] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 270
        defaultGripModel[22] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 271
        defaultGripModel[23] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 272
        defaultGripModel[24] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 273
        defaultGripModel[25] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 274
        defaultGripModel[26] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 275
        defaultGripModel[27] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 276
        defaultGripModel[28] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 277
        defaultGripModel[29] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 278
        defaultGripModel[30] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 279
        defaultGripModel[31] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 280

        defaultGripModel[0].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 249
        defaultGripModel[0].setRotationPoint(-0.5F, -24.5F, -3.5F);

        defaultGripModel[1].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
        defaultGripModel[1].setRotationPoint(2.5F, -24.5F, -3.5F);

        defaultGripModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 251
        defaultGripModel[2].setRotationPoint(6.5F, -21F, -3.5F);

        defaultGripModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 252
        defaultGripModel[3].setRotationPoint(7.5F, -21F, -3.5F);

        defaultGripModel[4].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 253
        defaultGripModel[4].setRotationPoint(8.5F, -22F, -3.5F);

        defaultGripModel[5].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 254
        defaultGripModel[5].setRotationPoint(-0.5F, -20.5F, -3.5F);

        defaultGripModel[6].addShapeBox(0F, 0F, 0F, 8, 11, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 255
        defaultGripModel[6].setRotationPoint(0.5F, -13.5F, -4.5F);

        defaultGripModel[7].addShapeBox(0F, 0F, 0F, 8, 2, 9, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
        defaultGripModel[7].setRotationPoint(0.5F, -15.5F, -4.5F);

        defaultGripModel[8].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
        defaultGripModel[8].setRotationPoint(1.5F, -16.5F, -4.5F);

        defaultGripModel[9].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 258
        defaultGripModel[9].setRotationPoint(1.5F, -18.5F, -3.5F);

        defaultGripModel[10].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
        defaultGripModel[10].setRotationPoint(-2.5F, -2.5F, -4.5F);

        defaultGripModel[11].addShapeBox(0F, 0F, 0F, 7, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 260
        defaultGripModel[11].setRotationPoint(-1.5F, -1.5F, -4.5F);

        defaultGripModel[12].addShapeBox(0F, 0F, 0F, 3, 11, 9, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, 3F, 0F, 0F); // Box 261
        defaultGripModel[12].setRotationPoint(8.5F, -13.5F, -4.5F);

        defaultGripModel[13].addShapeBox(0F, 0F, 0F, 2, 11, 9, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, -2F); // Box 262
        defaultGripModel[13].setRotationPoint(-1.5F, -13.5F, -4.5F);

        defaultGripModel[14].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F); // Box 263
        defaultGripModel[14].setRotationPoint(-0.5F, -18.5F, -3.5F);

        defaultGripModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, -1F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -2F, -2F, 0F, -2F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -2F); // Box 264
        defaultGripModel[15].setRotationPoint(-2.5F, -20.5F, -3.5F);

        defaultGripModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 265
        defaultGripModel[16].setRotationPoint(-1.5F, -20.5F, -3.5F);

        defaultGripModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, -1F, 0F, -3F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 266
        defaultGripModel[17].setRotationPoint(-1.5F, -15.5F, -4.5F);

        defaultGripModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F, -4F, 1F, -2F, 2F, 0F, 0F, 2F, 0F, 0F, -4F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 267
        defaultGripModel[18].setRotationPoint(-0.5F, -16.5F, -4.5F);

        defaultGripModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
        defaultGripModel[19].setRotationPoint(3.5F, -17.5F, -4.5F);

        defaultGripModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F, 2F, 0F, 0F, -4F, 1F, -2F, -4F, 1F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, 0F); // Box 269
        defaultGripModel[20].setRotationPoint(7.5F, -16.5F, -4.5F);

        defaultGripModel[21].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 270
        defaultGripModel[21].setRotationPoint(8.5F, -15.5F, -4.5F);

        defaultGripModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 271
        defaultGripModel[22].setRotationPoint(5.5F, -2.5F, -4.5F);

        defaultGripModel[23].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, 0F); // Box 272
        defaultGripModel[23].setRotationPoint(5.5F, -1.5F, -4.5F);

        defaultGripModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 273
        defaultGripModel[24].setRotationPoint(-4.5F, -2.5F, -4.5F);

        defaultGripModel[25].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 274
        defaultGripModel[25].setRotationPoint(8.5F, -22F, 2.5F);

        defaultGripModel[26].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 275
        defaultGripModel[26].setRotationPoint(-0.5F, -20.5F, 2.5F);

        defaultGripModel[27].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 276
        defaultGripModel[27].setRotationPoint(1.5F, -18.5F, 2.5F);

        defaultGripModel[28].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
        defaultGripModel[28].setRotationPoint(2.5F, -24.5F, 2.5F);

        defaultGripModel[29].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 278
        defaultGripModel[29].setRotationPoint(-0.5F, -24.5F, 2.5F);

        defaultGripModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 279
        defaultGripModel[30].setRotationPoint(7.5F, -21F, 2.5F);

        defaultGripModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 280
        defaultGripModel[31].setRotationPoint(6.5F, -21F, 2.5F);


        ammoModel = new ModelRendererTurbo[14];
        ammoModel[0] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 224
        ammoModel[1] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 225
        ammoModel[2] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 226
        ammoModel[3] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 227
        ammoModel[4] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 228
        ammoModel[5] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 229
        ammoModel[6] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 230
        ammoModel[7] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 231
        ammoModel[8] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 232
        ammoModel[9] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 233
        ammoModel[10] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 234
        ammoModel[11] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 235
        ammoModel[12] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 236
        ammoModel[13] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 237

        ammoModel[0].addShapeBox(0F, 0F, 0F, 1, 26, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 5F, 0F, 0F); // Box 224
        ammoModel[0].setRotationPoint(4.5F, -24.5F, -1.5F);

        ammoModel[1].addShapeBox(0F, 0F, 0F, 4, 26, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 4.5F, 0F, -0.5F); // Box 225
        ammoModel[1].setRotationPoint(4.5F, -24.5F, 1.5F);

        ammoModel[2].addShapeBox(0F, 0F, 0F, 2, 26, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 5F, 0F, 0F, -5F, 0F, 0F, -5.5F, 0F, -0.5F, 5F, 0F, -0.5F); // Box 226
        ammoModel[2].setRotationPoint(9.5F, -24.5F, 1.5F);

        ammoModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 227
        ammoModel[3].setRotationPoint(4.5F, -25.5F, 1F);

        ammoModel[4].addShapeBox(0F, 0F, 0F, 6, 26, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.75F, 5F, 0F, -0.75F); // Box 228
        ammoModel[4].setRotationPoint(5F, -24.5F, 1.5F);

        ammoModel[5].addShapeBox(0F, 0F, 0F, 9, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
        ammoModel[5].setRotationPoint(-1.5F, 1.5F, -2.5F);

        ammoModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 230
        ammoModel[6].setRotationPoint(7.5F, 1.5F, -2.5F);

        ammoModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 231
        ammoModel[7].setRotationPoint(7.5F, 0.5F, -2.5F);

        ammoModel[8].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
        ammoModel[8].setRotationPoint(-1.5F, 0.5F, -2.5F);

        ammoModel[9].addShapeBox(0F, 0F, 0F, 1, 26, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 5F, 0F, 0F); // Box 233
        ammoModel[9].setRotationPoint(11F, -24.5F, -1.5F);

        ammoModel[10].addShapeBox(0F, 0F, 0F, 4, 26, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 234
        ammoModel[10].setRotationPoint(4.5F, -24.5F, -2.5F);

        ammoModel[11].addShapeBox(0F, 0F, 0F, 2, 26, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 235
        ammoModel[11].setRotationPoint(9.5F, -24.5F, -2.5F);

        ammoModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.5F, 0F, -1F, -1F, 0F, -1F, -1F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F); // Box 236
        ammoModel[12].setRotationPoint(4.5F, -25.5F, -2F);

        ammoModel[13].addShapeBox(0F, 0F, 0F, 6, 26, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -0.75F, -5F, 0F, -0.75F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 237
        ammoModel[13].setRotationPoint(5F, -24.5F, -2.5F);


        slideModel = new ModelRendererTurbo[183];
        slideModel[0] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 58
        slideModel[1] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 59
        slideModel[2] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 62
        slideModel[3] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 63
        slideModel[4] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 64
        slideModel[5] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 84
        slideModel[6] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 85
        slideModel[7] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 86
        slideModel[8] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 87
        slideModel[9] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 88
        slideModel[10] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 89
        slideModel[11] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 51
        slideModel[12] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 54
        slideModel[13] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 55
        slideModel[14] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 56
        slideModel[15] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 67
        slideModel[16] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 75
        slideModel[17] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 76
        slideModel[18] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 80
        slideModel[19] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 81
        slideModel[20] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 83
        slideModel[21] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 84
        slideModel[22] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 85
        slideModel[23] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 86
        slideModel[24] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 87
        slideModel[25] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 88
        slideModel[26] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 92
        slideModel[27] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 94
        slideModel[28] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 97
        slideModel[29] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 98
        slideModel[30] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 99
        slideModel[31] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 102
        slideModel[32] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 103
        slideModel[33] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 104
        slideModel[34] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 105
        slideModel[35] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 187
        slideModel[36] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 188
        slideModel[37] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 189
        slideModel[38] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 190
        slideModel[39] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 191
        slideModel[40] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 194
        slideModel[41] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 195
        slideModel[42] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 196
        slideModel[43] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 197
        slideModel[44] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 199
        slideModel[45] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 200
        slideModel[46] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 201
        slideModel[47] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 202
        slideModel[48] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 203
        slideModel[49] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 204
        slideModel[50] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 205
        slideModel[51] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 206
        slideModel[52] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 207
        slideModel[53] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 208
        slideModel[54] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 209
        slideModel[55] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 224
        slideModel[56] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 226
        slideModel[57] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 227
        slideModel[58] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 228
        slideModel[59] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 230
        slideModel[60] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 232
        slideModel[61] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 241
        slideModel[62] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 242
        slideModel[63] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 243
        slideModel[64] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 244
        slideModel[65] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 425
        slideModel[66] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 426
        slideModel[67] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 427
        slideModel[68] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 64
        slideModel[69] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 425
        slideModel[70] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 426
        slideModel[71] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 427
        slideModel[72] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 425
        slideModel[73] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 426
        slideModel[74] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 427
        slideModel[75] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 425
        slideModel[76] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 426
        slideModel[77] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 427
        slideModel[78] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 425
        slideModel[79] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 426
        slideModel[80] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 427
        slideModel[81] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 425
        slideModel[82] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 426
        slideModel[83] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 427
        slideModel[84] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 425
        slideModel[85] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 426
        slideModel[86] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 427
        slideModel[87] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 425
        slideModel[88] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 426
        slideModel[89] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 427
        slideModel[90] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 425
        slideModel[91] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 426
        slideModel[92] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 427
        slideModel[93] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 425
        slideModel[94] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 426
        slideModel[95] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 427
        slideModel[96] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 425
        slideModel[97] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 426
        slideModel[98] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 427
        slideModel[99] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 75
        slideModel[100] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 425
        slideModel[101] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 426
        slideModel[102] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 427
        slideModel[103] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 425
        slideModel[104] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 426
        slideModel[105] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 427
        slideModel[106] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 425
        slideModel[107] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 426
        slideModel[108] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 427
        slideModel[109] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 425
        slideModel[110] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 426
        slideModel[111] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 427
        slideModel[112] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 75
        slideModel[113] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 75
        slideModel[114] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 76
        slideModel[115] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 80
        slideModel[116] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 81
        slideModel[117] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 86
        slideModel[118] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 87
        slideModel[119] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 88
        slideModel[120] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 425
        slideModel[121] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 426
        slideModel[122] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 427
        slideModel[123] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 425
        slideModel[124] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 426
        slideModel[125] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 427
        slideModel[126] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 425
        slideModel[127] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 426
        slideModel[128] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 427
        slideModel[129] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 425
        slideModel[130] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 426
        slideModel[131] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 427
        slideModel[132] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 425
        slideModel[133] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 426
        slideModel[134] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 427
        slideModel[135] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 425
        slideModel[136] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 426
        slideModel[137] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 427
        slideModel[138] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 425
        slideModel[139] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 426
        slideModel[140] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 427
        slideModel[141] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 425
        slideModel[142] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 426
        slideModel[143] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 427
        slideModel[144] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 425
        slideModel[145] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 426
        slideModel[146] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 427
        slideModel[147] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 425
        slideModel[148] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 426
        slideModel[149] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 427
        slideModel[150] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 425
        slideModel[151] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 426
        slideModel[152] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 427
        slideModel[153] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 425
        slideModel[154] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 426
        slideModel[155] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 427
        slideModel[156] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 425
        slideModel[157] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 426
        slideModel[158] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 427
        slideModel[159] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 425
        slideModel[160] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 426
        slideModel[161] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 427
        slideModel[162] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 425
        slideModel[163] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 426
        slideModel[164] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 427
        slideModel[165] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 60
        slideModel[166] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 54
        slideModel[167] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 54
        slideModel[168] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 54
        slideModel[169] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 94
        slideModel[170] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 60
        slideModel[171] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 62
        slideModel[172] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 63
        slideModel[173] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 204
        slideModel[174] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 205
        slideModel[175] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 206
        slideModel[176] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 84
        slideModel[177] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 84
        slideModel[178] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 84
        slideModel[179] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 84
        slideModel[180] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 84
        slideModel[181] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 84
        slideModel[182] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 84

        slideModel[0].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
        slideModel[0].setRotationPoint(-3F, -28.5F, -3F);

        slideModel[1].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, -1F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 59
        slideModel[1].setRotationPoint(-3F, -29.5F, -3F);

        slideModel[2].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
        slideModel[2].setRotationPoint(23F, -29.5F, -3F);

        slideModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 63
        slideModel[3].setRotationPoint(22F, -29F, -3F);

        slideModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 64
        slideModel[4].setRotationPoint(15F, -29F, -3F);

        slideModel[5].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 84
        slideModel[5].setRotationPoint(36.5F, -29.5F, -2.25F);

        slideModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 85
        slideModel[6].setRotationPoint(35.5F, -26.5F, -2.5F);

        slideModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F); // Box 86
        slideModel[7].setRotationPoint(36.5F, -26.5F, -2.5F);

        slideModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 87
        slideModel[8].setRotationPoint(35.5F, -26.5F, -2.5F);

        slideModel[9].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 88
        slideModel[9].setRotationPoint(36.5F, -26F, -2F);

        slideModel[10].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 89
        slideModel[10].setRotationPoint(36.5F, -23F, -2F);

        slideModel[11].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 51
        slideModel[11].setRotationPoint(36.5F, -30.5F, -2.5F);

        slideModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 54
        slideModel[12].setRotationPoint(0F, -30.75F, -3F);

        slideModel[13].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 55
        slideModel[13].setRotationPoint(23F, -30.75F, -3F);

        slideModel[14].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 56
        slideModel[14].setRotationPoint(23F, -30.5F, -3F);

        slideModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.125F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
        slideModel[15].setRotationPoint(-3F, -28.5F, -3F);

        slideModel[16].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F, 0F, 0.625F, 0F, 1F, 0.625F, 0F, 1F, 0.075F, 0.1F, 0F, 0.075F, 0.1F, 1F, 0.075F, 0F, 0F, 0.075F, 0F, 0F, 0.075F, 0.1F, 1F, 0.075F, 0.1F); // Box 75
        slideModel[16].setRotationPoint(0F, -27.5F, 2F);

        slideModel[17].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, -0.125F, -0.75F, -0.5F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, 0F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 76
        slideModel[17].setRotationPoint(13.5F, -28.5F, 2F);

        slideModel[18].addShapeBox(0F, 0F, 0F, 17, 3, 2, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0.5F, 0F, -0.75F); // Box 80
        slideModel[18].setRotationPoint(13F, -27.5F, 2F);

        slideModel[19].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F, 0.5F, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.625F, -0.75F, -0.5F, -1.125F, -0.75F, -0.25F, -0.875F, -0.75F, -0.25F, 0.625F, -0.75F, -0.25F); // Box 81
        slideModel[19].setRotationPoint(13F, -24.5F, 1F);

        slideModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, -0.325F, 0.05F, -1F, 0.325F, 0.05F, -1F, 0.325F, 0.05F, -0.75F, -0.325F, 0.05F, -0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 83
        slideModel[20].setRotationPoint(-4F, -25.5F, 2F);

        slideModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 84
        slideModel[21].setRotationPoint(-3F, -28.5F, 2F);

        slideModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.75F, -0.675F, -0.25F, -0.75F, -0.675F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 85
        slideModel[22].setRotationPoint(-4F, -24.5F, 2F);

        slideModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 86
        slideModel[23].setRotationPoint(35F, -27.5F, 2F);

        slideModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.75F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 87
        slideModel[24].setRotationPoint(36F, -28.5F, 2F);

        slideModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.125F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0.125F, -0.75F, -0.25F); // Box 88
        slideModel[25].setRotationPoint(35F, -24.5F, 1F);

        slideModel[26].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 92
        slideModel[26].setRotationPoint(6F, -30.25F, -2F);

        slideModel[27].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
        slideModel[27].setRotationPoint(5F, -30.75F, -3F);

        slideModel[28].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
        slideModel[28].setRotationPoint(-1F, -30F, -3F);

        slideModel[29].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 98
        slideModel[29].setRotationPoint(-3F, -28.5F, 2F);

        slideModel[30].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 99
        slideModel[30].setRotationPoint(-3F, -29.5F, 2F);

        slideModel[31].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 102
        slideModel[31].setRotationPoint(-1F, -30F, 2F);

        slideModel[32].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 103
        slideModel[32].setRotationPoint(0F, -30F, -2F);

        slideModel[33].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
        slideModel[33].setRotationPoint(0F, -31F, -2F);

        slideModel[34].addShapeBox(0F, 0F, 0F, 5, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 105
        slideModel[34].setRotationPoint(1F, -30F, -2F);

        slideModel[35].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 187
        slideModel[35].setRotationPoint(36.75F, -24F, -0.5F);

        slideModel[36].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 188
        slideModel[36].setRotationPoint(36.75F, -24.5F, -0.5F);

        slideModel[37].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189
        slideModel[37].setRotationPoint(36.75F, -23.5F, -0.5F);

        slideModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 190
        slideModel[38].setRotationPoint(40.5F, -30.5F, -0.5F);

        slideModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 191
        slideModel[39].setRotationPoint(40F, -31.5F, -0.5F);

        slideModel[40].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 194
        slideModel[40].setRotationPoint(0F, -31F, -2F);

        slideModel[41].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 195
        slideModel[41].setRotationPoint(0F, -31F, 1F);

        slideModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 196
        slideModel[42].setRotationPoint(0F, -31.25F, -2F);

        slideModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.125F, -0.875F, -0.75F, 0F, -0.875F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 197
        slideModel[43].setRotationPoint(0F, -31.25F, -0.5F);

        slideModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.875F, -0.75F, -0.125F, -0.875F, -0.75F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
        slideModel[44].setRotationPoint(0F, -31.25F, -0.5F);

        slideModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.875F, -0.25F, -0.125F, -0.875F, -0.25F, -0.125F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 200
        slideModel[45].setRotationPoint(0F, -31.25F, -0.5F);

        slideModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.4F, -0.75F, 0F, -0.4F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 201
        slideModel[46].setRotationPoint(0F, -31.25F, -2F);

        slideModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
        slideModel[47].setRotationPoint(0F, -31.25F, 0F);

        slideModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, -0.4F, -0.75F, -0.5F, -0.4F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 203
        slideModel[48].setRotationPoint(0F, -31.25F, 0F);

        slideModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.2F, -0.375F, -0.25F, -0.2F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.2F, -0.375F, -0.25F); // Box 204
        slideModel[49].setRotationPoint(-0.25F, -31.25F, -1.5F);

        slideModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.2F, -0.5F, -0.375F, -0.2F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.2F, -0.375F, -0.25F); // Box 205
        slideModel[50].setRotationPoint(-0.25F, -31.5F, -1.5F);

        slideModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.2F, -0.375F, -0.25F, -0.2F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.2F, -0.5F, -0.375F); // Box 206
        slideModel[51].setRotationPoint(-0.25F, -31F, -1.5F);

        slideModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.2F, -0.375F, -0.25F, -0.2F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.2F, -0.375F, -0.25F); // Box 207
        slideModel[52].setRotationPoint(-0.25F, -31.25F, 0.5F);

        slideModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.2F, -0.5F, -0.375F, -0.2F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.2F, -0.375F, -0.25F); // Box 208
        slideModel[53].setRotationPoint(-0.25F, -31.5F, 0.5F);

        slideModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.2F, -0.375F, -0.25F, -0.2F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.2F, -0.5F, -0.375F); // Box 209
        slideModel[54].setRotationPoint(-0.25F, -31F, 0.5F);

        slideModel[55].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.75F, -1F, 0F, -0.75F, -0.325F, -0.05F, 0F, 0.325F, -0.05F, 0F, 0.325F, -0.05F, -0.75F, -0.325F, -0.05F, -0.75F); // Box 224
        slideModel[55].setRotationPoint(-4F, -27.5F, 2F);

        slideModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.16F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.5F, -0.16F, -0.05F, -0.5F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 226
        slideModel[56].setRotationPoint(-4F, -25F, 2.5F);

        slideModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, -0.325F, 0.05F, -0.75F, 0.325F, 0.05F, -0.75F, 0.325F, 0.05F, -1F, -0.325F, 0.05F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 227
        slideModel[57].setRotationPoint(-4F, -25.5F, -4F);

        slideModel[58].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.675F, 0F, -0.75F, -0.675F); // Box 228
        slideModel[58].setRotationPoint(-4F, -24.5F, -3F);

        slideModel[59].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, -1F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, 0F, -1F, 0F, 0F, -0.325F, -0.05F, -0.75F, 0.325F, -0.05F, -0.75F, 0.325F, -0.05F, 0F, -0.325F, -0.05F, 0F); // Box 230
        slideModel[59].setRotationPoint(-4F, -27.5F, -4F);

        slideModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.16F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.05F, -0.16F, -0.05F, -0.05F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F); // Box 232
        slideModel[60].setRotationPoint(-4F, -25F, -3.5F);

        slideModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F); // Box 241
        slideModel[61].setRotationPoint(-2F, -28.5F, 1F);

        slideModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 242
        slideModel[62].setRotationPoint(0.75F, -28.5F, -0.5F);

        slideModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 243
        slideModel[63].setRotationPoint(0.75F, -29F, -0.5F);

        slideModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 244
        slideModel[64].setRotationPoint(0.75F, -28.5F, -0.5F);

        slideModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 425
        slideModel[65].setRotationPoint(12F, -28.5F, 2F);

        slideModel[66].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.75F, -1.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 426
        slideModel[66].setRotationPoint(11F, -27.5F, 2F);

        slideModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F); // Box 427
        slideModel[67].setRotationPoint(11F, -24.5F, 2F);

        slideModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
        slideModel[68].setRotationPoint(15F, -29F, 2F);

        slideModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 425
        slideModel[69].setRotationPoint(10.75F, -28.5F, 2F);

        slideModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.75F, -1.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 426
        slideModel[70].setRotationPoint(9.75F, -27.5F, 2F);

        slideModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F); // Box 427
        slideModel[71].setRotationPoint(9.75F, -24.5F, 2F);

        slideModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 425
        slideModel[72].setRotationPoint(9.5F, -28.5F, 2F);

        slideModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.75F, -1.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 426
        slideModel[73].setRotationPoint(8.5F, -27.5F, 2F);

        slideModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F); // Box 427
        slideModel[74].setRotationPoint(8.5F, -24.5F, 2F);

        slideModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 425
        slideModel[75].setRotationPoint(8.25F, -28.5F, 2F);

        slideModel[76].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.75F, -1.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 426
        slideModel[76].setRotationPoint(7.25F, -27.5F, 2F);

        slideModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F); // Box 427
        slideModel[77].setRotationPoint(7.25F, -24.5F, 2F);

        slideModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 425
        slideModel[78].setRotationPoint(7F, -28.5F, 2F);

        slideModel[79].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.75F, -1.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 426
        slideModel[79].setRotationPoint(6F, -27.5F, 2F);

        slideModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F); // Box 427
        slideModel[80].setRotationPoint(6F, -24.5F, 2F);

        slideModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 425
        slideModel[81].setRotationPoint(5.75F, -28.5F, 2F);

        slideModel[82].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.75F, -1.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 426
        slideModel[82].setRotationPoint(4.75F, -27.5F, 2F);

        slideModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F); // Box 427
        slideModel[83].setRotationPoint(4.75F, -24.5F, 2F);

        slideModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 425
        slideModel[84].setRotationPoint(4.5F, -28.5F, 2F);

        slideModel[85].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.75F, -1.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 426
        slideModel[85].setRotationPoint(3.5F, -27.5F, 2F);

        slideModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F); // Box 427
        slideModel[86].setRotationPoint(3.5F, -24.5F, 2F);

        slideModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 425
        slideModel[87].setRotationPoint(3.25F, -28.5F, 2F);

        slideModel[88].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.75F, -1.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 426
        slideModel[88].setRotationPoint(2.25F, -27.5F, 2F);

        slideModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F); // Box 427
        slideModel[89].setRotationPoint(2.25F, -24.5F, 2F);

        slideModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 425
        slideModel[90].setRotationPoint(2F, -28.5F, 2F);

        slideModel[91].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.75F, -1.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 426
        slideModel[91].setRotationPoint(1F, -27.5F, 2F);

        slideModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F); // Box 427
        slideModel[92].setRotationPoint(1F, -24.5F, 2F);

        slideModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 425
        slideModel[93].setRotationPoint(0.75F, -28.5F, 2F);

        slideModel[94].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.75F, -1.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 426
        slideModel[94].setRotationPoint(-0.25F, -27.5F, 2F);

        slideModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F); // Box 427
        slideModel[95].setRotationPoint(-0.25F, -24.5F, 2F);

        slideModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 425
        slideModel[96].setRotationPoint(-0.5F, -28.5F, 2F);

        slideModel[97].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.75F, -1.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 426
        slideModel[97].setRotationPoint(-1.5F, -27.5F, 2F);

        slideModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F); // Box 427
        slideModel[98].setRotationPoint(-1.5F, -24.5F, 2F);

        slideModel[99].addShapeBox(0F, 0F, 0F, 37, 1, 1, 0F, 0F, -0.075F, 0F, 0F, -0.075F, 0F, 0F, -0.075F, 0.1F, 0F, -0.075F, 0.1F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 75
        slideModel[99].setRotationPoint(-1F, -24.5F, 2F);

        slideModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 425
        slideModel[100].setRotationPoint(34.5F, -28.5F, 2F);

        slideModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.75F, -1.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 426
        slideModel[101].setRotationPoint(33.5F, -27.5F, 2F);

        slideModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F); // Box 427
        slideModel[102].setRotationPoint(33.5F, -24.5F, 2F);

        slideModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 425
        slideModel[103].setRotationPoint(33.25F, -28.5F, 2F);

        slideModel[104].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.75F, -1.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 426
        slideModel[104].setRotationPoint(32.25F, -27.5F, 2F);

        slideModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F); // Box 427
        slideModel[105].setRotationPoint(32.25F, -24.5F, 2F);

        slideModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 425
        slideModel[106].setRotationPoint(32F, -28.5F, 2F);

        slideModel[107].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.75F, -1.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 426
        slideModel[107].setRotationPoint(31F, -27.5F, 2F);

        slideModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F); // Box 427
        slideModel[108].setRotationPoint(31F, -24.5F, 2F);

        slideModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 425
        slideModel[109].setRotationPoint(30.75F, -28.5F, 2F);

        slideModel[110].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.75F, -1.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 426
        slideModel[110].setRotationPoint(29.75F, -27.5F, 2F);

        slideModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F); // Box 427
        slideModel[111].setRotationPoint(29.75F, -24.5F, 2F);

        slideModel[112].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F, 0F, 0.075F, 0.1F, 1F, 0.075F, 0.1F, 1F, 0.625F, 0F, 0F, 0.625F, 0F, 1F, 0.075F, 0.1F, 0F, 0.075F, 0.1F, 0F, 0.075F, 0F, 1F, 0.075F, 0F); // Box 75
        slideModel[112].setRotationPoint(0F, -27.5F, -3F);

        slideModel[113].addShapeBox(0F, 0F, 0F, 37, 1, 1, 0F, 0F, -0.075F, 0.1F, 0F, -0.075F, 0.1F, 0F, -0.075F, 0F, 0F, -0.075F, 0F, 0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 75
        slideModel[113].setRotationPoint(-1F, -24.5F, -3F);

        slideModel[114].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.5F); // Box 76
        slideModel[114].setRotationPoint(13.5F, -28.5F, -3F);

        slideModel[115].addShapeBox(0F, 0F, 0F, 17, 3, 2, 0F, -0.5F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0.5F, 0F, 0F); // Box 80
        slideModel[115].setRotationPoint(13F, -27.5F, -4F);

        slideModel[116].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F, 0.5F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.25F, 0.5F, 0F, -0.5F, 0.625F, -0.75F, -0.25F, -0.875F, -0.75F, -0.25F, -1.125F, -0.75F, -0.25F, 0.625F, -0.75F, -0.5F); // Box 81
        slideModel[116].setRotationPoint(13F, -24.5F, -3F);

        slideModel[117].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
        slideModel[117].setRotationPoint(35F, -27.5F, -4F);

        slideModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F); // Box 87
        slideModel[118].setRotationPoint(36F, -28.5F, -3F);

        slideModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0.125F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0.125F, -0.75F, -0.5F); // Box 88
        slideModel[119].setRotationPoint(35F, -24.5F, -3F);

        slideModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F); // Box 425
        slideModel[120].setRotationPoint(12F, -28.5F, -3F);

        slideModel[121].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 426
        slideModel[121].setRotationPoint(11F, -27.5F, -4F);

        slideModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F); // Box 427
        slideModel[122].setRotationPoint(11F, -24.5F, -3F);

        slideModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F); // Box 425
        slideModel[123].setRotationPoint(10.75F, -28.5F, -3F);

        slideModel[124].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 426
        slideModel[124].setRotationPoint(9.75F, -27.5F, -4F);

        slideModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F); // Box 427
        slideModel[125].setRotationPoint(9.75F, -24.5F, -3F);

        slideModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F); // Box 425
        slideModel[126].setRotationPoint(9.5F, -28.5F, -3F);

        slideModel[127].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 426
        slideModel[127].setRotationPoint(8.5F, -27.5F, -4F);

        slideModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F); // Box 427
        slideModel[128].setRotationPoint(8.5F, -24.5F, -3F);

        slideModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F); // Box 425
        slideModel[129].setRotationPoint(8.25F, -28.5F, -3F);

        slideModel[130].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 426
        slideModel[130].setRotationPoint(7.25F, -27.5F, -4F);

        slideModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F); // Box 427
        slideModel[131].setRotationPoint(7.25F, -24.5F, -3F);

        slideModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F); // Box 425
        slideModel[132].setRotationPoint(7F, -28.5F, -3F);

        slideModel[133].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 426
        slideModel[133].setRotationPoint(6F, -27.5F, -4F);

        slideModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F); // Box 427
        slideModel[134].setRotationPoint(6F, -24.5F, -3F);

        slideModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F); // Box 425
        slideModel[135].setRotationPoint(5.75F, -28.5F, -3F);

        slideModel[136].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 426
        slideModel[136].setRotationPoint(4.75F, -27.5F, -4F);

        slideModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F); // Box 427
        slideModel[137].setRotationPoint(4.75F, -24.5F, -3F);

        slideModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F); // Box 425
        slideModel[138].setRotationPoint(4.5F, -28.5F, -3F);

        slideModel[139].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 426
        slideModel[139].setRotationPoint(3.5F, -27.5F, -4F);

        slideModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F); // Box 427
        slideModel[140].setRotationPoint(3.5F, -24.5F, -3F);

        slideModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F); // Box 425
        slideModel[141].setRotationPoint(3.25F, -28.5F, -3F);

        slideModel[142].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 426
        slideModel[142].setRotationPoint(2.25F, -27.5F, -4F);

        slideModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F); // Box 427
        slideModel[143].setRotationPoint(2.25F, -24.5F, -3F);

        slideModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F); // Box 425
        slideModel[144].setRotationPoint(2F, -28.5F, -3F);

        slideModel[145].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 426
        slideModel[145].setRotationPoint(1F, -27.5F, -4F);

        slideModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F); // Box 427
        slideModel[146].setRotationPoint(1F, -24.5F, -3F);

        slideModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F); // Box 425
        slideModel[147].setRotationPoint(0.75F, -28.5F, -3F);

        slideModel[148].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 426
        slideModel[148].setRotationPoint(-0.25F, -27.5F, -4F);

        slideModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F); // Box 427
        slideModel[149].setRotationPoint(-0.25F, -24.5F, -3F);

        slideModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F); // Box 425
        slideModel[150].setRotationPoint(-0.5F, -28.5F, -3F);

        slideModel[151].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 426
        slideModel[151].setRotationPoint(-1.5F, -27.5F, -4F);

        slideModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F); // Box 427
        slideModel[152].setRotationPoint(-1.5F, -24.5F, -3F);

        slideModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F); // Box 425
        slideModel[153].setRotationPoint(34.5F, -28.5F, -3F);

        slideModel[154].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 426
        slideModel[154].setRotationPoint(33.5F, -27.5F, -4F);

        slideModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F); // Box 427
        slideModel[155].setRotationPoint(33.5F, -24.5F, -3F);

        slideModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F); // Box 425
        slideModel[156].setRotationPoint(33.25F, -28.5F, -3F);

        slideModel[157].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 426
        slideModel[157].setRotationPoint(32.25F, -27.5F, -4F);

        slideModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F); // Box 427
        slideModel[158].setRotationPoint(32.25F, -24.5F, -3F);

        slideModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F); // Box 425
        slideModel[159].setRotationPoint(32F, -28.5F, -3F);

        slideModel[160].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 426
        slideModel[160].setRotationPoint(31F, -27.5F, -4F);

        slideModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F); // Box 427
        slideModel[161].setRotationPoint(31F, -24.5F, -3F);

        slideModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F); // Box 425
        slideModel[162].setRotationPoint(30.75F, -28.5F, -3F);

        slideModel[163].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1.25F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 426
        slideModel[163].setRotationPoint(29.75F, -27.5F, -4F);

        slideModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F); // Box 427
        slideModel[164].setRotationPoint(29.75F, -24.5F, -3F);

        slideModel[165].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0.25F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 60
        slideModel[165].setRotationPoint(0F, -30.5F, -3F);

        slideModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
        slideModel[166].setRotationPoint(3F, -30.75F, -3F);

        slideModel[167].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 54
        slideModel[167].setRotationPoint(3F, -30.75F, 2F);

        slideModel[168].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 54
        slideModel[168].setRotationPoint(0F, -30.75F, 2F);

        slideModel[169].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 94
        slideModel[169].setRotationPoint(5F, -30.75F, 2F);

        slideModel[170].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 60
        slideModel[170].setRotationPoint(0F, -30.5F, 2F);

        slideModel[171].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 62
        slideModel[171].setRotationPoint(23F, -29.5F, 2F);

        slideModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 63
        slideModel[172].setRotationPoint(22F, -29F, 2F);

        slideModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.2F, -0.375F, -0.25F, -0.2F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.2F, -0.375F, -0.25F); // Box 204
        slideModel[173].setRotationPoint(39.75F, -31.25F, -0.5F);

        slideModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.2F, -0.5F, -0.375F, -0.2F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.2F, -0.375F, -0.25F); // Box 205
        slideModel[174].setRotationPoint(39.75F, -31.5F, -0.5F);

        slideModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.2F, -0.375F, -0.25F, -0.2F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.2F, -0.5F, -0.375F); // Box 206
        slideModel[175].setRotationPoint(39.75F, -31F, -0.5F);

        slideModel[176].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 84
        slideModel[176].setRotationPoint(36.5F, -29.5F, 1.25F);

        slideModel[177].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
        slideModel[177].setRotationPoint(36.5F, -27F, -0.5F);

        slideModel[178].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 84
        slideModel[178].setRotationPoint(36.5F, -30F, -0.5F);

        slideModel[179].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
        slideModel[179].setRotationPoint(36.5F, -27F, -1.5F);

        slideModel[180].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 84
        slideModel[180].setRotationPoint(36.5F, -27F, 0.5F);

        slideModel[181].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 84
        slideModel[181].setRotationPoint(36.5F, -30F, -1.5F);

        slideModel[182].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 84
        slideModel[182].setRotationPoint(36.5F, -30F, 0.5F);


        barrelAttachPoint = new Vector3f(46F / 16F, 34F / 16F, 0F / 16F);

        scopeAttachPoint = new Vector3f(14F / 16F, 36F / 16F, 0F / 16F);

        gripAttachPoint = new Vector3f(36F / 16F, 27.5F / 16F, 0F / 16F);

        gunSlideDistance = 1.5F;


        animationType = EnumAnimationType.PISTOL_CLIP;

        translateAll(4.0F, -6.0F, 0.0F);
        hasArms = true;
        leftArmPos = new Vector3f(-0.2F, -0.65F, -0.16F);
        leftArmRot = new Vector3f(80.0F, 35.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.27F, -0.57F, -0.15F);
        leftArmReloadRot = new Vector3f(70.0F, 40.0F, 0.0F);
        leftArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        rightArmPos = new Vector3f(0.13F, -0.53F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(0.13F, -0.53F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        rightHandAmmo = false;
        leftHandAmmo = true;
        slideLockOnEmpty = true;
        flashScale = 0.3F;
        muzzleFlashPoint = new Vector3f(1.6F, 1.2F, 0.0F);
        casingAttachPoint = new Vector3f(0.3F, 1.2F, 0.0F);
        casingAnimDistance = new Vector3f(0.0F, 2.0F, 2.75F);
        casingAnimSpread = new Vector3f(0.0F, 0.0F, 3.0F);
        casingAnimTime = 4;
        casingRotateVector = new Vector3f(0.1F, 0.0F, 0.1F);
        caseScale = 0.3F;
        casingDelay = 2;
        crouchZoom = -0.15F;
        flipAll();
        fancyStance = true;
        stanceTranslate = new Vector3f(0.4D, -0.1D, 0.2D);
        stanceRotate = new Vector3f(0.0F, 0.0F, 45.0F);
        thirdPersonOffset = new Vector3f(0 / 16F, -3F / 16F, 0F / 16F);

        hasFlash = true;
        flashScale = 5F;
        muzzleFlashPoint = new Vector3f(
                barrelAttachPoint.x / flashScale,
                barrelAttachPoint.y / flashScale,
                barrelAttachPoint.z / flashScale
        );
    }
}