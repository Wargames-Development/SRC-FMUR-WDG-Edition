//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: FG42S
// Model Creator: 
// Created on: 13.05.2017 - 18:11:01
// Last changed on: 13.05.2017 - 18:11:01

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelFG42 extends ModelGun //Same as Filename
{
    int textureX = 512;
    int textureY = 256;

    public ModelFG42() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[251];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        gunModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 1
        gunModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 2
        gunModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 3
        gunModel[4] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 4
        gunModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 5
        gunModel[6] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 6
        gunModel[7] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 7
        gunModel[8] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 8
        gunModel[9] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 9
        gunModel[10] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 10
        gunModel[11] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 11
        gunModel[12] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 12
        gunModel[13] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 13
        gunModel[14] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 14
        gunModel[15] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 18
        gunModel[16] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 24
        gunModel[17] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 25
        gunModel[18] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 26
        gunModel[19] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 27
        gunModel[20] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 28
        gunModel[21] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 29
        gunModel[22] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 30
        gunModel[23] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 31
        gunModel[24] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 32
        gunModel[25] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 33
        gunModel[26] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 34
        gunModel[27] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 35
        gunModel[28] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 36
        gunModel[29] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 37
        gunModel[30] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 38
        gunModel[31] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 39
        gunModel[32] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 40
        gunModel[33] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 41
        gunModel[34] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 42
        gunModel[35] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 43
        gunModel[36] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 44
        gunModel[37] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 45
        gunModel[38] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 46
        gunModel[39] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 47
        gunModel[40] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 48
        gunModel[41] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 49
        gunModel[42] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 50
        gunModel[43] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 51
        gunModel[44] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 52
        gunModel[45] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 53
        gunModel[46] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 54
        gunModel[47] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 55
        gunModel[48] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 56
        gunModel[49] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 57
        gunModel[50] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 58
        gunModel[51] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 59
        gunModel[52] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 60
        gunModel[53] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 61
        gunModel[54] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 62
        gunModel[55] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 63
        gunModel[56] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 64
        gunModel[57] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 65
        gunModel[58] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 66
        gunModel[59] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 67
        gunModel[60] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 68
        gunModel[61] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 69
        gunModel[62] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 70
        gunModel[63] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 71
        gunModel[64] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 72
        gunModel[65] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 73
        gunModel[66] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 74
        gunModel[67] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 75
        gunModel[68] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 76
        gunModel[69] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 77
        gunModel[70] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 78
        gunModel[71] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 79
        gunModel[72] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 80
        gunModel[73] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 81
        gunModel[74] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 82
        gunModel[75] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 83
        gunModel[76] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 84
        gunModel[77] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 85
        gunModel[78] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 86
        gunModel[79] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 87
        gunModel[80] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 80
        gunModel[81] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 81
        gunModel[82] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 82
        gunModel[83] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 83
        gunModel[84] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 84
        gunModel[85] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 85
        gunModel[86] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 86
        gunModel[87] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 87
        gunModel[88] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 90
        gunModel[89] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 91
        gunModel[90] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 92
        gunModel[91] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 93
        gunModel[92] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 94
        gunModel[93] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 95
        gunModel[94] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 96
        gunModel[95] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 97
        gunModel[96] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 98
        gunModel[97] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 99
        gunModel[98] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 100
        gunModel[99] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 101
        gunModel[100] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 102
        gunModel[101] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 103
        gunModel[102] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 104
        gunModel[103] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 105
        gunModel[104] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 106
        gunModel[105] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 107
        gunModel[106] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 108
        gunModel[107] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 109
        gunModel[108] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 110
        gunModel[109] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 111
        gunModel[110] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 112
        gunModel[111] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 113
        gunModel[112] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 114
        gunModel[113] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 115
        gunModel[114] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 116
        gunModel[115] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 117
        gunModel[116] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 118
        gunModel[117] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 119
        gunModel[118] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 120
        gunModel[119] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 121
        gunModel[120] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 122
        gunModel[121] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 123
        gunModel[122] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 124
        gunModel[123] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 125
        gunModel[124] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 126
        gunModel[125] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 127
        gunModel[126] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 128
        gunModel[127] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 129
        gunModel[128] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 130
        gunModel[129] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 131
        gunModel[130] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 132
        gunModel[131] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 133
        gunModel[132] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 134
        gunModel[133] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 135
        gunModel[134] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 138
        gunModel[135] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 139
        gunModel[136] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 140
        gunModel[137] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 141
        gunModel[138] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 142
        gunModel[139] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 143
        gunModel[140] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 143
        gunModel[141] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 144
        gunModel[142] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 145
        gunModel[143] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 146
        gunModel[144] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 147
        gunModel[145] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 148
        gunModel[146] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 149
        gunModel[147] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 150
        gunModel[148] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 151
        gunModel[149] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 153
        gunModel[150] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 154
        gunModel[151] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 155
        gunModel[152] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 156
        gunModel[153] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 157
        gunModel[154] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 158
        gunModel[155] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 159
        gunModel[156] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 160
        gunModel[157] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 162
        gunModel[158] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 163
        gunModel[159] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 164
        gunModel[160] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 165
        gunModel[161] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 166
        gunModel[162] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 167
        gunModel[163] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 168
        gunModel[164] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 169
        gunModel[165] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 170
        gunModel[166] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 171
        gunModel[167] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 172
        gunModel[168] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 173
        gunModel[169] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 174
        gunModel[170] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 175
        gunModel[171] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 176
        gunModel[172] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 179
        gunModel[173] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 180
        gunModel[174] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 181
        gunModel[175] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 182
        gunModel[176] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 184
        gunModel[177] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 229
        gunModel[178] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 230
        gunModel[179] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 231
        gunModel[180] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 232
        gunModel[181] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 233
        gunModel[182] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 234
        gunModel[183] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 235
        gunModel[184] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 236
        gunModel[185] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 237
        gunModel[186] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 238
        gunModel[187] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 239
        gunModel[188] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 240
        gunModel[189] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 241
        gunModel[190] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 242
        gunModel[191] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 243
        gunModel[192] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 244
        gunModel[193] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 246
        gunModel[194] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 248
        gunModel[195] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 249
        gunModel[196] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 251
        gunModel[197] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 252
        gunModel[198] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 253
        gunModel[199] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 258
        gunModel[200] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 259
        gunModel[201] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 260
        gunModel[202] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 261
        gunModel[203] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 262
        gunModel[204] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 263
        gunModel[205] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 264
        gunModel[206] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 265
        gunModel[207] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 266
        gunModel[208] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 267
        gunModel[209] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 268
        gunModel[210] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 269
        gunModel[211] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 270
        gunModel[212] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 271
        gunModel[213] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 272
        gunModel[214] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 273
        gunModel[215] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 274
        gunModel[216] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 275
        gunModel[217] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 276
        gunModel[218] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 277
        gunModel[219] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 278
        gunModel[220] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 279
        gunModel[221] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 283
        gunModel[222] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 308
        gunModel[223] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 309
        gunModel[224] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 310
        gunModel[225] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 311
        gunModel[226] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 312
        gunModel[227] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 313
        gunModel[228] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 314
        gunModel[229] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 315
        gunModel[230] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 316
        gunModel[231] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 317
        gunModel[232] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 318
        gunModel[233] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 319
        gunModel[234] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 320
        gunModel[235] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 321
        gunModel[236] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 322
        gunModel[237] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 323
        gunModel[238] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 327
        gunModel[239] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 328
        gunModel[240] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Box 329
        gunModel[241] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 330
        gunModel[242] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 246
        gunModel[243] = new ModelRendererTurbo(this, 252, 117, textureX, textureY); // Box 246
        gunModel[244] = new ModelRendererTurbo(this, 252, 117, textureX, textureY); // Box 246
        gunModel[245] = new ModelRendererTurbo(this, 252, 117, textureX, textureY); // Box 246
        gunModel[246] = new ModelRendererTurbo(this, 252, 117, textureX, textureY); // Box 246
        gunModel[247] = new ModelRendererTurbo(this, 252, 117, textureX, textureY); // Box 246
        gunModel[248] = new ModelRendererTurbo(this, 252, 117, textureX, textureY); // Box 246
        gunModel[249] = new ModelRendererTurbo(this, 252, 117, textureX, textureY); // Box 246
        gunModel[250] = new ModelRendererTurbo(this, 252, 117, textureX, textureY); // Box 246

        gunModel[0].addShapeBox(0F, 0F, 0F, 22, 1, 4, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 0
        gunModel[0].setRotationPoint(-1F, -17.5F, -2F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 22, 1, 4, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 1
        gunModel[1].setRotationPoint(-1F, -16.5F, -2F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box 2
        gunModel[2].setRotationPoint(8.5F, -15.5F, -2F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 3
        gunModel[3].setRotationPoint(-0.5F, -16.5F, -2.5F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 4
        gunModel[4].setRotationPoint(-0.5F, -17F, -2.5F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 5
        gunModel[5].setRotationPoint(-0.5F, -16F, -2.5F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 6
        gunModel[6].setRotationPoint(19.5F, -17F, -2.5F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 7
        gunModel[7].setRotationPoint(19.5F, -16.5F, -2.5F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 8
        gunModel[8].setRotationPoint(19.5F, -16F, -2.5F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 9
        gunModel[9].setRotationPoint(7.5F, -17F, -2.5F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 10
        gunModel[10].setRotationPoint(7.5F, -16.5F, -2.5F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 11
        gunModel[11].setRotationPoint(7.5F, -16F, -2.5F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 12
        gunModel[12].setRotationPoint(-0.5F, -15.5F, -2F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 22, 3, 4, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 13
        gunModel[13].setRotationPoint(-1F, -17.5F, -2F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 22, 1, 4, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 14
        gunModel[14].setRotationPoint(-1F, -14.5F, -2F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 18
        gunModel[15].setRotationPoint(-1F, -14F, -1.5F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 24
        gunModel[16].setRotationPoint(9F, -14.5F, -1.5F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, -3F, -0.25F, 0.25F, -3F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 25
        gunModel[17].setRotationPoint(9F, -13.5F, -1.5F);

        gunModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 26
        gunModel[18].setRotationPoint(9F, -12.5F, -1.5F);

        gunModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 27
        gunModel[19].setRotationPoint(9F, -11.5F, -1.5F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 28
        gunModel[20].setRotationPoint(9F, -10.5F, -1.5F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, -0.25F, 0.25F, -3F, -0.25F, 0.25F, -3F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box 29
        gunModel[21].setRotationPoint(9F, -9.5F, -1.5F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -1F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, -1F, -0.25F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 30
        gunModel[22].setRotationPoint(19F, -9.5F, -1.5F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 31
        gunModel[23].setRotationPoint(20F, -10.5F, -1.5F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box 32
        gunModel[24].setRotationPoint(20F, -11.5F, -1.5F);

        gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box 33
        gunModel[25].setRotationPoint(20F, -12.5F, -1.5F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, -1F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -1F, -0.25F, 0.25F); // Box 34
        gunModel[26].setRotationPoint(19F, -13.5F, -1.5F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F); // Box 35
        gunModel[27].setRotationPoint(9F, -8.5F, -1.5F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 36
        gunModel[28].setRotationPoint(12F, -11.5F, -0.5F);

        gunModel[29].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 37
        gunModel[29].setRotationPoint(12F, -10.5F, -0.5F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.25F, 0.25F, -1F, -0.25F, 0.25F, -1F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box 38
        gunModel[30].setRotationPoint(12F, -9.5F, -0.5F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 39
        gunModel[31].setRotationPoint(12F, -12.5F, -0.5F);

        gunModel[32].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, -1F, -0.25F, 0.25F, -1F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 40
        gunModel[32].setRotationPoint(12F, -13.5F, -0.5F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
        gunModel[33].setRotationPoint(0F, -13F, -1F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 2F, 0F, 0F); // Box 42
        gunModel[34].setRotationPoint(0F, -12F, -1F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 43
        gunModel[35].setRotationPoint(-2F, -9F, -1F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 8, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F); // Box 44
        gunModel[36].setRotationPoint(-3.5F, -5F, -1F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 45
        gunModel[37].setRotationPoint(-4F, 2F, -1F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 46
        gunModel[38].setRotationPoint(0F, -12F, 1F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Box 47
        gunModel[39].setRotationPoint(-2F, -9F, 1F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 8, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 48
        gunModel[40].setRotationPoint(-3.5F, -5F, 1F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 49
        gunModel[41].setRotationPoint(-4F, 2F, 1F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 50
        gunModel[42].setRotationPoint(0F, -13F, 1F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -0.5F, 0F, 0F); // Box 51
        gunModel[43].setRotationPoint(5F, -11F, 1F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F); // Box 52
        gunModel[44].setRotationPoint(0F, -12F, -2F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 53
        gunModel[45].setRotationPoint(-2F, -9F, -2F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 8, 7, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F); // Box 54
        gunModel[46].setRotationPoint(-3.5F, -5F, -2F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 55
        gunModel[47].setRotationPoint(-4F, 2F, -2F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, -0.5F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
        gunModel[48].setRotationPoint(0F, -13F, -2F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[49].setRotationPoint(5F, -11F, -2F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 58
        gunModel[50].setRotationPoint(3F, -11F, -2.5F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 59
        gunModel[51].setRotationPoint(3F, -11.5F, -2.5F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 60
        gunModel[52].setRotationPoint(3F, -10.5F, -2.5F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 61
        gunModel[53].setRotationPoint(-0.5F, -2F, -2.5F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 62
        gunModel[54].setRotationPoint(-0.5F, -1.5F, -2.5F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 63
        gunModel[55].setRotationPoint(-0.5F, -2.5F, -2.5F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 15, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
        gunModel[56].setRotationPoint(-14F, -20.5F, -2F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 2, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
        gunModel[57].setRotationPoint(-16F, -24.5F, -4F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 66
        gunModel[58].setRotationPoint(-16F, -19.5F, -4F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 67
        gunModel[59].setRotationPoint(-16F, -17.5F, -3.5F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 68
        gunModel[60].setRotationPoint(-16F, -16.5F, -2.5F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 30, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
        gunModel[61].setRotationPoint(-14F, -21.5F, -1.5F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 30, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
        gunModel[62].setRotationPoint(-14F, -26.5F, -2F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F); // Box 71
        gunModel[63].setRotationPoint(1F, -26.5F, 2F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
        gunModel[64].setRotationPoint(-14F, -25.5F, -3F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
        gunModel[65].setRotationPoint(-16F, -25.5F, -4F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 74
        gunModel[66].setRotationPoint(-16F, -26.5F, -3.5F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 75
        gunModel[67].setRotationPoint(-16F, -27.5F, -3.5F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
        gunModel[68].setRotationPoint(-2F, -25.5F, -3F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
        gunModel[69].setRotationPoint(-2F, -23.5F, -3F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 78
        gunModel[70].setRotationPoint(-2F, -25.5F, -3F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 79
        gunModel[71].setRotationPoint(-11F, -25F, -3F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 80
        gunModel[72].setRotationPoint(-11F, -25.5F, -3F);

        gunModel[73].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 81
        gunModel[73].setRotationPoint(-11F, -23.5F, -3F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 82
        gunModel[74].setRotationPoint(-10F, -24.5F, -3.5F);

        gunModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 83
        gunModel[75].setRotationPoint(-10F, -25F, -3.5F);

        gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 84
        gunModel[76].setRotationPoint(-10F, -24F, -3.5F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 85
        gunModel[77].setRotationPoint(-2.75F, -24.5F, -6F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 86
        gunModel[78].setRotationPoint(-2.75F, -25F, -6F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 87
        gunModel[79].setRotationPoint(-2.75F, -24F, -6F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
        gunModel[80].setRotationPoint(1F, -20.5F, -2F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
        gunModel[81].setRotationPoint(1F, -18.5F, -2F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
        gunModel[82].setRotationPoint(1F, -20.5F, -1F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        gunModel[83].setRotationPoint(16F, -24.5F, -3.5F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
        gunModel[84].setRotationPoint(16F, -25.5F, -3.5F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
        gunModel[85].setRotationPoint(16F, -26.5F, -3F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 86
        gunModel[86].setRotationPoint(16F, -22.5F, -3F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 87
        gunModel[87].setRotationPoint(16F, -23.5F, -3.5F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.75F); // Box 90
        gunModel[88].setRotationPoint(14F, -24.5F, -3.5F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F); // Box 91
        gunModel[89].setRotationPoint(14F, -25.5F, -3.5F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 92
        gunModel[90].setRotationPoint(14F, -26.5F, -3F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F); // Box 93
        gunModel[91].setRotationPoint(14F, -23.5F, -3.5F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 94
        gunModel[92].setRotationPoint(14F, -22.5F, -3F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
        gunModel[93].setRotationPoint(16F, -21.5F, -2.5F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 96
        gunModel[94].setRotationPoint(14F, -21.5F, -2.5F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
        gunModel[95].setRotationPoint(15F, -18.5F, -2F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
        gunModel[96].setRotationPoint(16F, -18.5F, -2F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
        gunModel[97].setRotationPoint(15F, -18.5F, 1F);

        gunModel[98].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
        gunModel[98].setRotationPoint(16F, -18.5F, 1F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
        gunModel[99].setRotationPoint(16F, -19.5F, 1.5F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 102
        gunModel[100].setRotationPoint(15F, -19.5F, 1.5F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 16, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
        gunModel[101].setRotationPoint(21F, -25.5F, -3.5F);

        gunModel[102].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
        gunModel[102].setRotationPoint(21F, -26.5F, -3.5F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
        gunModel[103].setRotationPoint(21F, -27.5F, -2.5F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 106
        gunModel[104].setRotationPoint(29F, -26.5F, -3.5F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 11, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 107
        gunModel[105].setRotationPoint(21F, -18.5F, -3.5F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 108
        gunModel[106].setRotationPoint(25F, -17.5F, -3F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 109
        gunModel[107].setRotationPoint(26F, -16.5F, -2.5F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
        gunModel[108].setRotationPoint(1F, -19.5F, -2F);

        gunModel[109].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
        gunModel[109].setRotationPoint(15F, -19.5F, -2F);

        gunModel[110].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 112
        gunModel[110].setRotationPoint(21F, -17.5F, -3F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
        gunModel[111].setRotationPoint(21F, -19.5F, -0.5F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 1.5F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F); // Box 114
        gunModel[112].setRotationPoint(25F, -17.5F, -3F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.25F, 0F, -1F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, -1F); // Box 115
        gunModel[113].setRotationPoint(25F, -16.5F, -2.5F);

        gunModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F); // Box 116
        gunModel[114].setRotationPoint(28F, -17.5F, -3F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, -1F, -1.25F, 0F, -1F, 0.75F, 0F, 0F); // Box 117
        gunModel[115].setRotationPoint(28F, -16.5F, -2.5F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 16, 1, 5, 0F, 0F, -0.5F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, -1.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 118
        gunModel[116].setRotationPoint(31F, -27.5F, -2.5F);

        gunModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
        gunModel[117].setRotationPoint(35F, -26.5F, -3F);

        gunModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
        gunModel[118].setRotationPoint(41F, -26.5F, -3F);

        gunModel[119].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F); // Box 121
        gunModel[119].setRotationPoint(37F, -25.5F, -3.5F);

        gunModel[120].addShapeBox(0F, 0F, 0F, 10, 7, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
        gunModel[120].setRotationPoint(37F, -25.5F, -3F);

        gunModel[121].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
        gunModel[121].setRotationPoint(35F, -25.5F, -4.5F);

        gunModel[122].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F); // Box 124
        gunModel[122].setRotationPoint(35F, -25.5F, 3.5F);

        gunModel[123].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F); // Box 125
        gunModel[123].setRotationPoint(32F, -18.5F, -3.5F);

        gunModel[124].addShapeBox(0F, 0F, 0F, 15, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 126
        gunModel[124].setRotationPoint(32F, -18.5F, -3F);

        gunModel[125].addShapeBox(0F, 0F, 0F, 18, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 127
        gunModel[125].setRotationPoint(29F, -17.5F, -2.5F);

        gunModel[126].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
        gunModel[126].setRotationPoint(47F, -25.5F, -3.5F);

        gunModel[127].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
        gunModel[127].setRotationPoint(47F, -26.5F, -3.5F);

        gunModel[128].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
        gunModel[128].setRotationPoint(47F, -27.5F, -2.5F);

        gunModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.5F); // Box 131
        gunModel[129].setRotationPoint(47F, -18.5F, -3.5F);

        gunModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, -0.25F, -1F); // Box 132
        gunModel[130].setRotationPoint(47F, -17.5F, -3F);

        gunModel[131].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 133
        gunModel[131].setRotationPoint(50F, -25.5F, -3.5F);

        gunModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F); // Box 134
        gunModel[132].setRotationPoint(50F, -26.5F, -3.5F);

        gunModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.5F, -1.5F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F); // Box 135
        gunModel[133].setRotationPoint(50F, -27.5F, -2.5F);

        gunModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 138
        gunModel[134].setRotationPoint(48F, -18.5F, -3.5F);

        gunModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 139
        gunModel[135].setRotationPoint(48F, -17.5F, -3.5F);

        gunModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 140
        gunModel[136].setRotationPoint(48F, -16.5F, -3.5F);

        gunModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 141
        gunModel[137].setRotationPoint(50F, -18.5F, -3.5F);

        gunModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F); // Box 142
        gunModel[138].setRotationPoint(50F, -16.5F, -3.5F);

        gunModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0.5F, 0.25F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, -1.5F, 0.5F, -1F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -1F, -2.5F); // Box 143
        gunModel[139].setRotationPoint(47.5F, -16.5F, -3.5F);

        gunModel[140].addShapeBox(0F, 0F, 0F, 12, 5, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 143
        gunModel[140].setRotationPoint(-28F, -24.5F, -4F);

        gunModel[141].addShapeBox(0F, 0F, 0F, 12, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F); // Box 144
        gunModel[141].setRotationPoint(-28F, -26.5F, -3.5F);

        gunModel[142].addShapeBox(0F, 0F, 0F, 12, 1, 7, 0F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 145
        gunModel[142].setRotationPoint(-28F, -27.5F, -3.5F);

        gunModel[143].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 146
        gunModel[143].setRotationPoint(-28F, -25.5F, -4F);

        gunModel[144].addShapeBox(0F, 0F, 0F, 12, 2, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F); // Box 147
        gunModel[144].setRotationPoint(-28F, -19.5F, -4F);

        gunModel[145].addShapeBox(0F, 0F, 0F, 12, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F); // Box 148
        gunModel[145].setRotationPoint(-28F, -17.5F, -3.5F);

        gunModel[146].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.5F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, -1.5F); // Box 149
        gunModel[146].setRotationPoint(-28F, -16.5F, -2.5F);

        gunModel[147].addShapeBox(0F, 0F, 0F, 6, 13, 2, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 150
        gunModel[147].setRotationPoint(-34F, -27.5F, -1F);

        gunModel[148].addShapeBox(0F, 0F, 0F, 6, 13, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0.25F, 0F, 0F, 0F); // Box 151
        gunModel[148].setRotationPoint(-34F, -27.5F, 1F);

        gunModel[149].addShapeBox(0F, 0F, 0F, 6, 11, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, -0.25F, 0F, -4.5F, 0F, 0F, -0.5F, 0F); // Box 153
        gunModel[149].setRotationPoint(-34F, -26F, 2F);

        gunModel[150].addShapeBox(0F, 0F, 0F, 6, 13, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0.25F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 154
        gunModel[150].setRotationPoint(-34F, -27.5F, -2F);

        gunModel[151].addShapeBox(0F, 0F, 0F, 6, 11, 1, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -1.5F, -0.25F, 0F, 0.5F, 0F); // Box 155
        gunModel[151].setRotationPoint(-34F, -26F, -3F);

        gunModel[152].addShapeBox(0F, 0F, 0F, 5, 13, 2, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F); // Box 156
        gunModel[152].setRotationPoint(-39F, -26.5F, -1F);

        gunModel[153].addShapeBox(0F, 0F, 0F, 5, 13, 2, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 157
        gunModel[153].setRotationPoint(-39F, -26.5F, 1F);

        gunModel[154].addShapeBox(0F, 0F, 0F, 5, 13, 2, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F); // Box 158
        gunModel[154].setRotationPoint(-39F, -26.5F, -3F);

        gunModel[155].addShapeBox(0F, 0F, 0F, 6, 17, 2, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 4.5F, 0F); // Box 159
        gunModel[155].setRotationPoint(-45F, -26.5F, -1F);

        gunModel[156].addShapeBox(0F, 0F, 0F, 6, 17, 2, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 4.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, 2F, 0F); // Box 160
        gunModel[156].setRotationPoint(-45F, -26.5F, 1F);

        gunModel[157].addShapeBox(0F, 0F, 0F, 6, 17, 2, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, 4.5F, 0F); // Box 162
        gunModel[157].setRotationPoint(-45F, -26.5F, -3F);

        gunModel[158].addShapeBox(0F, 0F, 0F, 8, 12, 6, 0F, 2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 163
        gunModel[158].setRotationPoint(-53F, -26.5F, -3F);

        gunModel[159].addShapeBox(0F, 0F, 0F, 4, 11, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -0.5F, 0F); // Box 164
        gunModel[159].setRotationPoint(-49F, -14.5F, -3F);

        gunModel[160].addShapeBox(0F, 0F, 0F, 2, 11, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 165
        gunModel[160].setRotationPoint(-51F, -14.5F, -3F);

        gunModel[161].addShapeBox(0F, 0F, 0F, 2, 11, 6, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Box 166
        gunModel[161].setRotationPoint(-53F, -14.5F, -3F);

        gunModel[162].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, 0F, 0.5F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, 0.5F, -1F, 2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 2F, 0F, 0F); // Box 167
        gunModel[162].setRotationPoint(-53F, -28.5F, -3F);

        gunModel[163].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -0.5F, -1F, -1F, 0.5F, -1.5F, -1F, 0.5F, -1.5F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, -2.5F, -1F, 0F, -2.5F, -1F, 0F, 0F, 0F); // Box 168
        gunModel[163].setRotationPoint(-55F, -28.5F, -3F);

        gunModel[164].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3.25F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 3.25F, -2F); // Box 169
        gunModel[164].setRotationPoint(-49F, -7.5F, -3F);

        gunModel[165].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, -2F); // Box 170
        gunModel[165].setRotationPoint(-51F, -4.5F, -3F);

        gunModel[166].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -0.75F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0F, -2F, -0.5F, 0.25F, -2F, -0.5F, 0.25F, -2F, 0F, 0F, -2F); // Box 171
        gunModel[166].setRotationPoint(-52.5F, -4.5F, -3F);

        gunModel[167].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
        gunModel[167].setRotationPoint(51F, -24F, -1.5F);

        gunModel[168].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
        gunModel[168].setRotationPoint(51F, -25F, -1.5F);

        gunModel[169].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 174
        gunModel[169].setRotationPoint(51F, -23F, -1.5F);

        gunModel[170].addShapeBox(0F, 0F, 0F, 45, 2, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 175
        gunModel[170].setRotationPoint(59F, -24.5F, -0.5F);

        gunModel[171].addShapeBox(0F, 0F, 0F, 45, 2, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 176
        gunModel[171].setRotationPoint(59F, -24.5F, 0.5F);

        gunModel[172].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
        gunModel[172].setRotationPoint(89F, -24F, -1.5F);

        gunModel[173].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
        gunModel[173].setRotationPoint(89F, -25F, -1.5F);

        gunModel[174].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 181
        gunModel[174].setRotationPoint(89F, -23F, -1F);

        gunModel[175].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 182
        gunModel[175].setRotationPoint(92F, -24.5F, -2F);

        gunModel[176].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 184
        gunModel[176].setRotationPoint(92F, -25.5F, -2F);

        gunModel[177].addShapeBox(0F, 0F, 0F, 45, 2, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 229
        gunModel[177].setRotationPoint(59F, -24.5F, -1.5F);

        gunModel[178].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
        gunModel[178].setRotationPoint(51F, -20F, -1.5F);

        gunModel[179].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
        gunModel[179].setRotationPoint(51F, -21F, -1.5F);

        gunModel[180].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 232
        gunModel[180].setRotationPoint(51F, -19F, -1.5F);

        gunModel[181].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
        gunModel[181].setRotationPoint(53F, -22.5F, -1F);

        gunModel[182].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 234
        gunModel[182].setRotationPoint(59F, -20F, -0.5F);

        gunModel[183].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 235
        gunModel[183].setRotationPoint(59F, -20.5F, -0.5F);

        gunModel[184].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 236
        gunModel[184].setRotationPoint(59F, -19.5F, -0.5F);

        gunModel[185].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 237
        gunModel[185].setRotationPoint(89F, -23F, -1.5F);

        gunModel[186].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 238
        gunModel[186].setRotationPoint(87F, -20F, -0.5F);

        gunModel[187].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 239
        gunModel[187].setRotationPoint(87F, -20.5F, -0.5F);

        gunModel[188].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 240
        gunModel[188].setRotationPoint(87F, -19.5F, -0.5F);

        gunModel[189].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
        gunModel[189].setRotationPoint(89F, -20F, -1F);

        gunModel[190].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 242
        gunModel[190].setRotationPoint(89F, -19F, -1F);

        gunModel[191].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
        gunModel[191].setRotationPoint(89F, -21F, -1F);

        gunModel[192].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 244
        gunModel[192].setRotationPoint(89F, -22F, 0.5F);

        gunModel[193].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 1F, 0F, 0.2F); // Box 246
        gunModel[193].setRotationPoint(0F, -27.5F, -1.5F);

        gunModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -1F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 248
        gunModel[194].setRotationPoint(15F, -27.5F, -2F);

        gunModel[195].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 249
        gunModel[195].setRotationPoint(-14F, -25.5F, 2F);

        gunModel[196].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 251
        gunModel[196].setRotationPoint(1F, -22.5F, 2F);

        gunModel[197].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 252
        gunModel[197].setRotationPoint(0F, -26.5F, 2F);

        gunModel[198].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 253
        gunModel[198].setRotationPoint(14F, -26.5F, 2F);

        gunModel[199].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
        gunModel[199].setRotationPoint(-3.5F, -25.5F, 2F);

        gunModel[200].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -2F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -2F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 259
        gunModel[200].setRotationPoint(-2.5F, -25F, 5F);

        gunModel[201].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 260
        gunModel[201].setRotationPoint(-4.5F, -25F, 7F);

        gunModel[202].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
        gunModel[202].setRotationPoint(83F, -25.5F, -1F);

        gunModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 262
        gunModel[203].setRotationPoint(87F, -26.5F, -1F);

        gunModel[204].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
        gunModel[204].setRotationPoint(87F, -28.5F, -1F);

        gunModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 264
        gunModel[205].setRotationPoint(87F, -26.5F, -1F);

        gunModel[206].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
        gunModel[206].setRotationPoint(87F, -29.5F, -1F);

        gunModel[207].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 266
        gunModel[207].setRotationPoint(87.5F, -31.5F, -0.5F);

        gunModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 267
        gunModel[208].setRotationPoint(87F, -31.5F, -1F);

        gunModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F); // Box 268
        gunModel[209].setRotationPoint(87F, -32.5F, -0.5F);

        gunModel[210].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 269
        gunModel[210].setRotationPoint(87F, -32.5F, 0.5F);

        gunModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 270
        gunModel[211].setRotationPoint(87F, -32.5F, -1.5F);

        gunModel[212].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 271
        gunModel[212].setRotationPoint(87F, -33F, -1.5F);

        gunModel[213].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 272
        gunModel[213].setRotationPoint(87F, -33F, 0.5F);

        gunModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 273
        gunModel[214].setRotationPoint(87F, -33.5F, -1.5F);

        gunModel[215].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 274
        gunModel[215].setRotationPoint(87F, -33.5F, 0.5F);

        gunModel[216].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
        gunModel[216].setRotationPoint(87F, -34.5F, -1F);

        gunModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 276
        gunModel[217].setRotationPoint(88F, -25.5F, -1F);

        gunModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F); // Box 277
        gunModel[218].setRotationPoint(88F, -25F, -1F);

        gunModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 278
        gunModel[219].setRotationPoint(88F, -26.5F, -1F);

        gunModel[220].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 279
        gunModel[220].setRotationPoint(89F, -26.5F, -1F);

        gunModel[221].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 283
        gunModel[221].setRotationPoint(92F, -22.5F, -2F);

        gunModel[222].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 308
        gunModel[222].setRotationPoint(89F, -22.5F, -2.5F);

        gunModel[223].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 309
        gunModel[223].setRotationPoint(89F, -23.5F, -2.5F);

        gunModel[224].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 310
        gunModel[224].setRotationPoint(89F, -21.5F, -2.5F);

        gunModel[225].addShapeBox(4F, 3F, -1F, 2, 33, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
        gunModel[225].setRotationPoint(86.5F, -22F, 0.5F);
        gunModel[225].rotateAngleX = 0.43633231F;

        gunModel[226].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 312
        gunModel[226].setRotationPoint(89F, -22F, 0.5F);
        gunModel[226].rotateAngleX = 0.43633231F;

        gunModel[227].addShapeBox(0F, 9F, 0F, 3, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F); // Box 313
        gunModel[227].setRotationPoint(89F, -22F, 0.5F);
        gunModel[227].rotateAngleX = 0.43633231F;

        gunModel[228].addShapeBox(2F, 3F, -1F, 2, 33, 1, 0F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F); // Box 314
        gunModel[228].setRotationPoint(86.5F, -22F, 0.5F);
        gunModel[228].rotateAngleX = 0.43633231F;

        gunModel[229].addShapeBox(6F, 6F, -1F, 2, 30, 1, 0F, 0F, 0F, 0F, -1.25F, -2F, 1.25F, -1F, -2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 1.25F, -1F, 0F, -1.5F, 0F, 0F, 0F); // Box 315
        gunModel[229].setRotationPoint(86.5F, -22F, 0.5F);
        gunModel[229].rotateAngleX = 0.43633231F;

        gunModel[230].addShapeBox(0F, 36F, -1F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 316
        gunModel[230].setRotationPoint(88.5F, -22F, 0.5F);
        gunModel[230].rotateAngleX = 0.43633231F;

        gunModel[231].addShapeBox(0F, 36F, -2F, 2, 1, 4, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.75F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.75F, 0F, -1.5F, 0F, 0F, -0.25F); // Box 317
        gunModel[231].setRotationPoint(92.5F, -22F, 0.5F);
        gunModel[231].rotateAngleX = 0.43633231F;

        gunModel[232].addShapeBox(2F, 33F, 1F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 318
        gunModel[232].setRotationPoint(86.5F, -22F, 0.5F);
        gunModel[232].rotateAngleX = 0.43633231F;

        gunModel[233].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 319
        gunModel[233].setRotationPoint(89F, -22F, -1.5F);

        gunModel[234].addShapeBox(4F, 3F, 0F, 2, 33, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
        gunModel[234].setRotationPoint(86.5F, -22F, -0.5F);
        gunModel[234].rotateAngleX = -0.43633231F;

        gunModel[235].addShapeBox(0F, 0F, -1F, 3, 9, 1, 0F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 321
        gunModel[235].setRotationPoint(89F, -22F, -0.5F);
        gunModel[235].rotateAngleX = -0.43633231F;

        gunModel[236].addShapeBox(0F, 9F, -1F, 3, 1, 1, 0F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 322
        gunModel[236].setRotationPoint(89F, -22F, -0.5F);
        gunModel[236].rotateAngleX = -0.43633231F;

        gunModel[237].addShapeBox(2F, 3F, 0F, 2, 33, 1, 0F, -0.25F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 323
        gunModel[237].setRotationPoint(86.5F, -22F, -0.5F);
        gunModel[237].rotateAngleX = -0.43633231F;

        gunModel[238].addShapeBox(2F, 33F, -2F, 1, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
        gunModel[238].setRotationPoint(86.5F, -22F, -0.5F);
        gunModel[238].rotateAngleX = -0.43633231F;

        gunModel[239].addShapeBox(6F, 6F, 0F, 2, 30, 1, 0F, 0F, 0F, 0F, -1F, -2F, -1.5F, -1.25F, -2F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -1.25F, 0F, 1.25F, 0F, 0F, 0F); // Box 328
        gunModel[239].setRotationPoint(86.5F, -22F, -0.5F);
        gunModel[239].rotateAngleX = -0.43633231F;

        gunModel[240].addShapeBox(0F, 36F, -2F, 4, 1, 3, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
        gunModel[240].setRotationPoint(88.5F, -22F, -0.5F);
        gunModel[240].rotateAngleX = -0.43633231F;

        gunModel[241].addShapeBox(0F, 36F, -2F, 2, 1, 4, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.75F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, -1F); // Box 330
        gunModel[241].setRotationPoint(92.5F, -22F, -0.5F);
        gunModel[241].rotateAngleX = -0.43633231F;

        gunModel[242].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 246
        gunModel[242].setRotationPoint(0F, -28.1F, -1.5F);

        gunModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F); // Box 246
        gunModel[243].setRotationPoint(0F, -28.5F, -1.5F);

        gunModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F); // Box 246
        gunModel[244].setRotationPoint(2F, -28.5F, -1.5F);

        gunModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F); // Box 246
        gunModel[245].setRotationPoint(4F, -28.5F, -1.5F);

        gunModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F); // Box 246
        gunModel[246].setRotationPoint(6F, -28.5F, -1.5F);

        gunModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F); // Box 246
        gunModel[247].setRotationPoint(8F, -28.5F, -1.5F);

        gunModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F); // Box 246
        gunModel[248].setRotationPoint(10F, -28.5F, -1.5F);

        gunModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F); // Box 246
        gunModel[249].setRotationPoint(12F, -28.5F, -1.5F);

        gunModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F); // Box 246
        gunModel[250].setRotationPoint(14F, -28.5F, -1.5F);


        defaultBarrelModel = new ModelRendererTurbo[24];
        defaultBarrelModel[0] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 284
        defaultBarrelModel[1] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 285
        defaultBarrelModel[2] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 286
        defaultBarrelModel[3] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 287
        defaultBarrelModel[4] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 288
        defaultBarrelModel[5] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 289
        defaultBarrelModel[6] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 290
        defaultBarrelModel[7] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 291
        defaultBarrelModel[8] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 292
        defaultBarrelModel[9] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 293
        defaultBarrelModel[10] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 294
        defaultBarrelModel[11] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 295
        defaultBarrelModel[12] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 296
        defaultBarrelModel[13] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 297
        defaultBarrelModel[14] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 298
        defaultBarrelModel[15] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 299
        defaultBarrelModel[16] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 300
        defaultBarrelModel[17] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 301
        defaultBarrelModel[18] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 302
        defaultBarrelModel[19] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 303
        defaultBarrelModel[20] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 304
        defaultBarrelModel[21] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 305
        defaultBarrelModel[22] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 306
        defaultBarrelModel[23] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 307

        defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F); // Box 284
        defaultBarrelModel[0].setRotationPoint(95F, -24.5F, -2F);

        defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, -1.5F, 0F, 0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, -0.5F); // Box 285
        defaultBarrelModel[1].setRotationPoint(95F, -25.5F, -2F);

        defaultBarrelModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, -1.5F); // Box 286
        defaultBarrelModel[2].setRotationPoint(95F, -22.5F, -2F);

        defaultBarrelModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, -1.5F); // Box 287
        defaultBarrelModel[3].setRotationPoint(96F, -22.5F, -2F);

        defaultBarrelModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F); // Box 288
        defaultBarrelModel[4].setRotationPoint(96F, -24.5F, -2F);

        defaultBarrelModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, -1.5F, 0F, 0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, -0.5F); // Box 289
        defaultBarrelModel[5].setRotationPoint(96F, -25.5F, -2F);

        defaultBarrelModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, -1.5F); // Box 290
        defaultBarrelModel[6].setRotationPoint(97F, -22.5F, -2F);

        defaultBarrelModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F); // Box 291
        defaultBarrelModel[7].setRotationPoint(97F, -24.5F, -2F);

        defaultBarrelModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, -1.5F, 0F, 0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, -0.5F); // Box 292
        defaultBarrelModel[8].setRotationPoint(97F, -25.5F, -2F);

        defaultBarrelModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, -1.5F); // Box 293
        defaultBarrelModel[9].setRotationPoint(98F, -22.5F, -2F);

        defaultBarrelModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F); // Box 294
        defaultBarrelModel[10].setRotationPoint(98F, -24.5F, -2F);

        defaultBarrelModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, -1.5F, 0F, 0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, -0.5F); // Box 295
        defaultBarrelModel[11].setRotationPoint(98F, -25.5F, -2F);

        defaultBarrelModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, -1.5F); // Box 296
        defaultBarrelModel[12].setRotationPoint(99F, -22.5F, -2F);

        defaultBarrelModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F); // Box 297
        defaultBarrelModel[13].setRotationPoint(99F, -24.5F, -2F);

        defaultBarrelModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, -1.5F, 0F, 0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, -0.5F); // Box 298
        defaultBarrelModel[14].setRotationPoint(99F, -25.5F, -2F);

        defaultBarrelModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, -1.5F); // Box 299
        defaultBarrelModel[15].setRotationPoint(100F, -22.5F, -2F);

        defaultBarrelModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F); // Box 300
        defaultBarrelModel[16].setRotationPoint(100F, -24.5F, -2F);

        defaultBarrelModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, -1.5F, 0F, 0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, -0.5F); // Box 301
        defaultBarrelModel[17].setRotationPoint(100F, -25.5F, -2F);

        defaultBarrelModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, -1.5F); // Box 302
        defaultBarrelModel[18].setRotationPoint(101F, -22.5F, -2F);

        defaultBarrelModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F); // Box 303
        defaultBarrelModel[19].setRotationPoint(101F, -24.5F, -2F);

        defaultBarrelModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, -1.5F, 0F, 0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, -0.5F); // Box 304
        defaultBarrelModel[20].setRotationPoint(101F, -25.5F, -2F);

        defaultBarrelModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, -1.5F); // Box 305
        defaultBarrelModel[21].setRotationPoint(102F, -22.5F, -2F);

        defaultBarrelModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F); // Box 306
        defaultBarrelModel[22].setRotationPoint(102F, -24.5F, -2F);

        defaultBarrelModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, -1.5F, 0F, 0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, -0.5F); // Box 307
        defaultBarrelModel[23].setRotationPoint(102F, -25.5F, -2F);


        defaultScopeModel = new ModelRendererTurbo[58];
        defaultScopeModel[0] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 247
        defaultScopeModel[1] = new ModelRendererTurbo(this, 364, 211, textureX, textureY); // Box 163
        defaultScopeModel[2] = new ModelRendererTurbo(this, 364, 211, textureX, textureY); // Box 164
        defaultScopeModel[3] = new ModelRendererTurbo(this, 364, 243, textureX, textureY); // Box 165
        defaultScopeModel[4] = new ModelRendererTurbo(this, 364, 211, textureX, textureY); // Box 166
        defaultScopeModel[5] = new ModelRendererTurbo(this, 364, 243, textureX, textureY); // Box 167
        defaultScopeModel[6] = new ModelRendererTurbo(this, 364, 227, textureX, textureY); // Box 173
        defaultScopeModel[7] = new ModelRendererTurbo(this, 364, 227, textureX, textureY); // Box 174
        defaultScopeModel[8] = new ModelRendererTurbo(this, 394, 227, textureX, textureY); // Box 175
        defaultScopeModel[9] = new ModelRendererTurbo(this, 364, 227, textureX, textureY); // Box 176
        defaultScopeModel[10] = new ModelRendererTurbo(this, 394, 227, textureX, textureY); // Box 177
        defaultScopeModel[11] = new ModelRendererTurbo(this, 364, 195, textureX, textureY); // Box 178
        defaultScopeModel[12] = new ModelRendererTurbo(this, 364, 195, textureX, textureY); // Box 179
        defaultScopeModel[13] = new ModelRendererTurbo(this, 364, 195, textureX, textureY); // Box 180
        defaultScopeModel[14] = new ModelRendererTurbo(this, 318, 195, textureX, textureY); // Box 183
        defaultScopeModel[15] = new ModelRendererTurbo(this, 318, 195, textureX, textureY); // Box 184
        defaultScopeModel[16] = new ModelRendererTurbo(this, 318, 195, textureX, textureY); // Box 185
        defaultScopeModel[17] = new ModelRendererTurbo(this, 318, 195, textureX, textureY); // Box 186
        defaultScopeModel[18] = new ModelRendererTurbo(this, 318, 195, textureX, textureY); // Box 187
        defaultScopeModel[19] = new ModelRendererTurbo(this, 318, 195, textureX, textureY); // Box 188
        defaultScopeModel[20] = new ModelRendererTurbo(this, 318, 195, textureX, textureY); // Box 209
        defaultScopeModel[21] = new ModelRendererTurbo(this, 318, 195, textureX, textureY); // Box 210
        defaultScopeModel[22] = new ModelRendererTurbo(this, 364, 195, textureX, textureY); // Box 211
        defaultScopeModel[23] = new ModelRendererTurbo(this, 364, 195, textureX, textureY); // Box 212
        defaultScopeModel[24] = new ModelRendererTurbo(this, 364, 195, textureX, textureY); // Box 213
        defaultScopeModel[25] = new ModelRendererTurbo(this, 364, 195, textureX, textureY); // Box 214
        defaultScopeModel[26] = new ModelRendererTurbo(this, 364, 195, textureX, textureY); // Box 215
        defaultScopeModel[27] = new ModelRendererTurbo(this, 364, 195, textureX, textureY); // Box 216
        defaultScopeModel[28] = new ModelRendererTurbo(this, 364, 195, textureX, textureY); // Box 217
        defaultScopeModel[29] = new ModelRendererTurbo(this, 364, 195, textureX, textureY); // Box 218
        defaultScopeModel[30] = new ModelRendererTurbo(this, 364, 195, textureX, textureY); // Box 219
        defaultScopeModel[31] = new ModelRendererTurbo(this, 364, 195, textureX, textureY); // Box 220
        defaultScopeModel[32] = new ModelRendererTurbo(this, 364, 195, textureX, textureY); // Box 221
        defaultScopeModel[33] = new ModelRendererTurbo(this, 364, 195, textureX, textureY); // Box 222
        defaultScopeModel[34] = new ModelRendererTurbo(this, 364, 195, textureX, textureY); // Box 223
        defaultScopeModel[35] = new ModelRendererTurbo(this, 318, 195, textureX, textureY); // Box 224
        defaultScopeModel[36] = new ModelRendererTurbo(this, 364, 195, textureX, textureY); // Box 225
        defaultScopeModel[37] = new ModelRendererTurbo(this, 318, 195, textureX, textureY); // Box 226
        defaultScopeModel[38] = new ModelRendererTurbo(this, 318, 195, textureX, textureY); // Box 227
        defaultScopeModel[39] = new ModelRendererTurbo(this, 318, 195, textureX, textureY); // Box 228
        defaultScopeModel[40] = new ModelRendererTurbo(this, 318, 195, textureX, textureY); // Box 229
        defaultScopeModel[41] = new ModelRendererTurbo(this, 318, 195, textureX, textureY); // Box 230
        defaultScopeModel[42] = new ModelRendererTurbo(this, 318, 195, textureX, textureY); // Box 231
        defaultScopeModel[43] = new ModelRendererTurbo(this, 318, 195, textureX, textureY); // Box 232
        defaultScopeModel[44] = new ModelRendererTurbo(this, 364, 195, textureX, textureY); // Box 392
        defaultScopeModel[45] = new ModelRendererTurbo(this, 364, 195, textureX, textureY); // Box 393
        defaultScopeModel[46] = new ModelRendererTurbo(this, 364, 195, textureX, textureY); // Box 394
        defaultScopeModel[47] = new ModelRendererTurbo(this, 364, 195, textureX, textureY); // Box 396
        defaultScopeModel[48] = new ModelRendererTurbo(this, 364, 195, textureX, textureY); // Box 397
        defaultScopeModel[49] = new ModelRendererTurbo(this, 364, 195, textureX, textureY); // Box 398
        defaultScopeModel[50] = new ModelRendererTurbo(this, 364, 195, textureX, textureY); // Box 399
        defaultScopeModel[51] = new ModelRendererTurbo(this, 364, 195, textureX, textureY); // Box 400
        defaultScopeModel[52] = new ModelRendererTurbo(this, 364, 195, textureX, textureY); // Box 401
        defaultScopeModel[53] = new ModelRendererTurbo(this, 318, 195, textureX, textureY); // Box 402
        defaultScopeModel[54] = new ModelRendererTurbo(this, 318, 195, textureX, textureY); // Box 403
        defaultScopeModel[55] = new ModelRendererTurbo(this, 318, 195, textureX, textureY); // Box 404
        defaultScopeModel[56] = new ModelRendererTurbo(this, 318, 195, textureX, textureY); // Box 405
        defaultScopeModel[57] = new ModelRendererTurbo(this, 318, 195, textureX, textureY); // Box 406

        defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
        defaultScopeModel[0].setRotationPoint(15.9F, -27.5F, -2F);

        defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 5, 6, 2, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 163
        defaultScopeModel[1].setRotationPoint(19.9F, -37.75F, -1F);

        defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 5, 6, 2, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 164
        defaultScopeModel[2].setRotationPoint(19.9F, -37.75F, 1F);

        defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 165
        defaultScopeModel[3].setRotationPoint(19.9F, -36.75F, 2.25F);

        defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 5, 6, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 166
        defaultScopeModel[4].setRotationPoint(19.9F, -37.75F, -3F);

        defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 167
        defaultScopeModel[5].setRotationPoint(19.9F, -36.75F, -3.25F);

        defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 8, 6, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 173
        defaultScopeModel[6].setRotationPoint(-6.1F, -37.75F, -1F);

        defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 8, 6, 2, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 174
        defaultScopeModel[7].setRotationPoint(-6.1F, -37.75F, 0F);

        defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 175
        defaultScopeModel[8].setRotationPoint(-6.1F, -36.75F, 2F);

        defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 8, 6, 2, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 176
        defaultScopeModel[9].setRotationPoint(-6.1F, -37.75F, -2F);

        defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 177
        defaultScopeModel[10].setRotationPoint(-6.1F, -36.75F, -3F);

        defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
        defaultScopeModel[11].setRotationPoint(4.9F, -36.75F, -2.5F);

        defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 18, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 179
        defaultScopeModel[12].setRotationPoint(1.9F, -36.75F, 0.5F);

        defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 180
        defaultScopeModel[13].setRotationPoint(1.9F, -35.75F, 1.5F);

        defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
        defaultScopeModel[14].setRotationPoint(1.9F, -37.25F, -1F);

        defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F); // Box 184
        defaultScopeModel[15].setRotationPoint(1.9F, -37.25F, 1F);

        defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
        defaultScopeModel[16].setRotationPoint(1.9F, -37.25F, -3F);

        defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
        defaultScopeModel[17].setRotationPoint(16.9F, -37.25F, -3F);

        defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F); // Box 187
        defaultScopeModel[18].setRotationPoint(16.9F, -37.25F, 1F);

        defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
        defaultScopeModel[19].setRotationPoint(16.9F, -37.25F, -1F);

        defaultScopeModel[20].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
        defaultScopeModel[20].setRotationPoint(1.9F, -35.75F, -4.5F);

        defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
        defaultScopeModel[21].setRotationPoint(1.9F, -33.25F, -4F);

        defaultScopeModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, -0.25F, 1.75F, 0F, -0.25F, 1.75F); // Box 211
        defaultScopeModel[22].setRotationPoint(2.9F, -34.25F, -4.5F);

        defaultScopeModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 212
        defaultScopeModel[23].setRotationPoint(1.9F, -33.25F, -4.5F);

        defaultScopeModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 213
        defaultScopeModel[24].setRotationPoint(1.9F, -33.75F, -4.5F);

        defaultScopeModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F); // Box 214
        defaultScopeModel[25].setRotationPoint(1.9F, -32.75F, -4.5F);

        defaultScopeModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F); // Box 215
        defaultScopeModel[26].setRotationPoint(1.9F, -31.75F, -4F);

        defaultScopeModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 216
        defaultScopeModel[27].setRotationPoint(1.9F, -32.25F, -4F);

        defaultScopeModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 217
        defaultScopeModel[28].setRotationPoint(1.9F, -32.75F, -4F);

        defaultScopeModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F); // Box 218
        defaultScopeModel[29].setRotationPoint(16.9F, -31.75F, -4F);

        defaultScopeModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 219
        defaultScopeModel[30].setRotationPoint(16.9F, -32.25F, -4F);

        defaultScopeModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 220
        defaultScopeModel[31].setRotationPoint(16.9F, -32.75F, -4F);

        defaultScopeModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 221
        defaultScopeModel[32].setRotationPoint(16.9F, -33.25F, -4.5F);

        defaultScopeModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F); // Box 222
        defaultScopeModel[33].setRotationPoint(16.9F, -32.75F, -4.5F);

        defaultScopeModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 223
        defaultScopeModel[34].setRotationPoint(16.9F, -33.75F, -4.5F);

        defaultScopeModel[35].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
        defaultScopeModel[35].setRotationPoint(16.9F, -35.75F, -4.5F);

        defaultScopeModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, -0.25F, 1.75F, 0F, -0.25F, 1.75F); // Box 225
        defaultScopeModel[36].setRotationPoint(17.9F, -34.25F, -4.5F);

        defaultScopeModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
        defaultScopeModel[37].setRotationPoint(16.9F, -33.25F, -4F);

        defaultScopeModel[38].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
        defaultScopeModel[38].setRotationPoint(7.9F, -35.75F, -4.5F);

        defaultScopeModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
        defaultScopeModel[39].setRotationPoint(7.9F, -36.75F, -4.5F);

        defaultScopeModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 229
        defaultScopeModel[40].setRotationPoint(7.9F, -33.75F, -4.5F);

        defaultScopeModel[41].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
        defaultScopeModel[41].setRotationPoint(9.4F, -37.75F, -1.5F);

        defaultScopeModel[42].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 231
        defaultScopeModel[42].setRotationPoint(9.4F, -37.75F, 0.5F);

        defaultScopeModel[43].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
        defaultScopeModel[43].setRotationPoint(9.4F, -37.75F, -2.5F);

        defaultScopeModel[44].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 392
        defaultScopeModel[44].setRotationPoint(1.9F, -33.75F, -2F);

        defaultScopeModel[45].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
        defaultScopeModel[45].setRotationPoint(1.9F, -33.75F, 1F);

        defaultScopeModel[46].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
        defaultScopeModel[46].setRotationPoint(1.9F, -29.75F, -2.5F);

        defaultScopeModel[47].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
        defaultScopeModel[47].setRotationPoint(16.9F, -33.75F, 1F);

        defaultScopeModel[48].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 397
        defaultScopeModel[48].setRotationPoint(16.9F, -33.75F, -2F);

        defaultScopeModel[49].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
        defaultScopeModel[49].setRotationPoint(15.9F, -29.75F, -2.5F);

        defaultScopeModel[50].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
        defaultScopeModel[50].setRotationPoint(5.9F, -29.5F, -1.5F);

        defaultScopeModel[51].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
        defaultScopeModel[51].setRotationPoint(5.9F, -30.5F, -1.5F);

        defaultScopeModel[52].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 401
        defaultScopeModel[52].setRotationPoint(5.9F, -28.5F, -1.5F);

        defaultScopeModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
        defaultScopeModel[53].setRotationPoint(10.9F, -29.5F, -1F);

        defaultScopeModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 403
        defaultScopeModel[54].setRotationPoint(2.9F, -28.75F, -2.5F);

        defaultScopeModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 404
        defaultScopeModel[55].setRotationPoint(2.9F, -33F, -2F);

        defaultScopeModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 405
        defaultScopeModel[56].setRotationPoint(17.9F, -33F, -2F);

        defaultScopeModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 406
        defaultScopeModel[57].setRotationPoint(17.9F, -28.75F, -2.5F);


        ammoModel = new ModelRendererTurbo[4];
        ammoModel[0] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 254
        ammoModel[1] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 255
        ammoModel[2] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 256
        ammoModel[3] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 257

        ammoModel[0].addShapeBox(1F, 0F, 0F, 11, 3, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 254
        ammoModel[0].setRotationPoint(1F, -25.5F, 2F);
        ammoModel[0].rotateAngleY = -0.08726646F;

        ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 4, 20, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F); // Box 255
        ammoModel[1].setRotationPoint(1F, -26F, 2F);
        ammoModel[1].rotateAngleY = -0.08726646F;

        ammoModel[2].addShapeBox(2F, 0F, 0F, 9, 4, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0F); // Box 256
        ammoModel[2].setRotationPoint(1F, -26F, 2F);
        ammoModel[2].rotateAngleY = -0.08726646F;

        ammoModel[3].addShapeBox(12F, 0F, 0F, 1, 4, 18, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.25F, 0.75F); // Box 257
        ammoModel[3].setRotationPoint(1F, -26F, 2F);
        ammoModel[3].rotateAngleY = -0.08726646F;


        slideModel = new ModelRendererTurbo[3];
        slideModel[0] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 144
        slideModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 145
        slideModel[2] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 146

        slideModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 144
        slideModel[0].setRotationPoint(33F, -19.5F, -4F);

        slideModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
        slideModel[1].setRotationPoint(33F, -19.5F, -6F);

        slideModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, 0F, -0.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
        slideModel[2].setRotationPoint(33F, -19.5F, -8F);

        barrelAttachPoint = new Vector3f(99F / 16F, 23.5F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(42F / 16F, 22F / 16F, -3.4F / 16F);
        scopeAttachPoint = new Vector3f(7.5F / 16F, 27.8F / 16F, 0F / 16F);
        gripAttachPoint = new Vector3f(38F / 16F, 16.7F / 16F, 0F / 16F);
        gunSlideDistance = 0.5F;
        leftArmPos = new Vector3f(0.06F, -0.4F, -0.05F);
        leftArmRot = new Vector3f(80F, 50F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.15F, -0.55F, 0.05F);
        leftArmReloadRot = new Vector3f(80F, 50F, 0.0F);
        rightArmPos = new Vector3f(0.25F, -0.52F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85F);
        rightArmReloadPos = new Vector3f(0.25F, -0.52F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
        hasFlash = true;
        hasArms = true;
        rightHandAmmo = false;
        leftHandAmmo = true;
        animationType = EnumAnimationType.CUSTOM;
        rotateGunVertical = 20.0F;
        tiltGun = -60.0F;
        translateGun = new Vector3f(-0.0625F, -0.1875F, 0.25F);
        rotateClipVertical = -30.0F;
        translateClip = new Vector3f(-0.625F, 0.0F, -1.25F);
        rotateClipHorizontal = 50.0F;
        crouchZoom = -0.05F;
        zoomOffset = -0.15F;
        gunOffset = -0.4F;
        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);

        translateAll(0F, 0F, 0F);
        flipAll();

        hasFlash = true;
        flashScale = 5F;
        muzzleFlashPoint = new Vector3f(
                barrelAttachPoint.x / flashScale,
                barrelAttachPoint.y / flashScale,
                barrelAttachPoint.z / flashScale
        );
    }
}