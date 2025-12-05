//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MP9
// Model Creator: 
// Created on: 20.01.2021 - 10:23:58
// Last changed on: 20.01.2021 - 10:23:58

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelMP9 extends ModelGun //Same as Filename
{
    int textureX = 512;
    int textureY = 256;

    public ModelMP9() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[360];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
        gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
        gunModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
        gunModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 6
        gunModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 7
        gunModel[6] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 8
        gunModel[7] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 9
        gunModel[8] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 11
        gunModel[9] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 13
        gunModel[10] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 15
        gunModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 16
        gunModel[12] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 17
        gunModel[13] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 18
        gunModel[14] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 19
        gunModel[15] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 20
        gunModel[16] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 21
        gunModel[17] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 22
        gunModel[18] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 23
        gunModel[19] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 24
        gunModel[20] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 25
        gunModel[21] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 26
        gunModel[22] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 28
        gunModel[23] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 29
        gunModel[24] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 30
        gunModel[25] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 31
        gunModel[26] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 32
        gunModel[27] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 33
        gunModel[28] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 34
        gunModel[29] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 35
        gunModel[30] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 36
        gunModel[31] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 37
        gunModel[32] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 38
        gunModel[33] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 39
        gunModel[34] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 40
        gunModel[35] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 41
        gunModel[36] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 42
        gunModel[37] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 43
        gunModel[38] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 44
        gunModel[39] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 45
        gunModel[40] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 46
        gunModel[41] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 47
        gunModel[42] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 48
        gunModel[43] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 49
        gunModel[44] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 50
        gunModel[45] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 51
        gunModel[46] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 52
        gunModel[47] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 53
        gunModel[48] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 54
        gunModel[49] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 55
        gunModel[50] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 56
        gunModel[51] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 57
        gunModel[52] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 58
        gunModel[53] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 59
        gunModel[54] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 60
        gunModel[55] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 61
        gunModel[56] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 63
        gunModel[57] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 64
        gunModel[58] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 65
        gunModel[59] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 66
        gunModel[60] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 69
        gunModel[61] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 70
        gunModel[62] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 71
        gunModel[63] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 72
        gunModel[64] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 73
        gunModel[65] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 74
        gunModel[66] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 76
        gunModel[67] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 77
        gunModel[68] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 78
        gunModel[69] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 79
        gunModel[70] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 80
        gunModel[71] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 81
        gunModel[72] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 82
        gunModel[73] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 83
        gunModel[74] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 84
        gunModel[75] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 85
        gunModel[76] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 87
        gunModel[77] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 88
        gunModel[78] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 89
        gunModel[79] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 90
        gunModel[80] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 91
        gunModel[81] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 92
        gunModel[82] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 93
        gunModel[83] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 94
        gunModel[84] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 95
        gunModel[85] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 96
        gunModel[86] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 97
        gunModel[87] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 98
        gunModel[88] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 99
        gunModel[89] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 100
        gunModel[90] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 101
        gunModel[91] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 102
        gunModel[92] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 103
        gunModel[93] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 104
        gunModel[94] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 105
        gunModel[95] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 106
        gunModel[96] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 107
        gunModel[97] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 108
        gunModel[98] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 109
        gunModel[99] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 110
        gunModel[100] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 111
        gunModel[101] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 112
        gunModel[102] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 113
        gunModel[103] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 114
        gunModel[104] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 119
        gunModel[105] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 120
        gunModel[106] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 121
        gunModel[107] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 122
        gunModel[108] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 125
        gunModel[109] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 126
        gunModel[110] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 127
        gunModel[111] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 128
        gunModel[112] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 129
        gunModel[113] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 130
        gunModel[114] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 132
        gunModel[115] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 133
        gunModel[116] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 134
        gunModel[117] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 135
        gunModel[118] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 136
        gunModel[119] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 152
        gunModel[120] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 153
        gunModel[121] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 154
        gunModel[122] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 155
        gunModel[123] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 156
        gunModel[124] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 157
        gunModel[125] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 158
        gunModel[126] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 159
        gunModel[127] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 160
        gunModel[128] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 161
        gunModel[129] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 162
        gunModel[130] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 163
        gunModel[131] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 183
        gunModel[132] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 184
        gunModel[133] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 185
        gunModel[134] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 186
        gunModel[135] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 187
        gunModel[136] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 188
        gunModel[137] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 189
        gunModel[138] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 198
        gunModel[139] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 199
        gunModel[140] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 200
        gunModel[141] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 201
        gunModel[142] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 202
        gunModel[143] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 217
        gunModel[144] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 218
        gunModel[145] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 219
        gunModel[146] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 220
        gunModel[147] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 221
        gunModel[148] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 222
        gunModel[149] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 223
        gunModel[150] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 225
        gunModel[151] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 226
        gunModel[152] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 227
        gunModel[153] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 228
        gunModel[154] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 229
        gunModel[155] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 230
        gunModel[156] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 231
        gunModel[157] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 232
        gunModel[158] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 233
        gunModel[159] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 234
        gunModel[160] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 235
        gunModel[161] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 236
        gunModel[162] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 238
        gunModel[163] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 239
        gunModel[164] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 240
        gunModel[165] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 241
        gunModel[166] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 242
        gunModel[167] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 243
        gunModel[168] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 244
        gunModel[169] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 245
        gunModel[170] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 246
        gunModel[171] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 248
        gunModel[172] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 249
        gunModel[173] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 308
        gunModel[174] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 309
        gunModel[175] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 310
        gunModel[176] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 311
        gunModel[177] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 312
        gunModel[178] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 313
        gunModel[179] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 314
        gunModel[180] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 315
        gunModel[181] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 316
        gunModel[182] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 317
        gunModel[183] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 318
        gunModel[184] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 390
        gunModel[185] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 391
        gunModel[186] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 392
        gunModel[187] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 393
        gunModel[188] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 394
        gunModel[189] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 395
        gunModel[190] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 396
        gunModel[191] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 436
        gunModel[192] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 437
        gunModel[193] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 438
        gunModel[194] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 222
        gunModel[195] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 223
        gunModel[196] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 224
        gunModel[197] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 225
        gunModel[198] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 226
        gunModel[199] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 227
        gunModel[200] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 228
        gunModel[201] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 229
        gunModel[202] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 230
        gunModel[203] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 231
        gunModel[204] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 232
        gunModel[205] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 233
        gunModel[206] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 234
        gunModel[207] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 235
        gunModel[208] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 236
        gunModel[209] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 237
        gunModel[210] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 238
        gunModel[211] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 239
        gunModel[212] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 240
        gunModel[213] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 241
        gunModel[214] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 242
        gunModel[215] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 243
        gunModel[216] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 244
        gunModel[217] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 245
        gunModel[218] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 246
        gunModel[219] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 247
        gunModel[220] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 248
        gunModel[221] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 249
        gunModel[222] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 250
        gunModel[223] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 251
        gunModel[224] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 252
        gunModel[225] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 253
        gunModel[226] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 254
        gunModel[227] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 255
        gunModel[228] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 256
        gunModel[229] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 257
        gunModel[230] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 258
        gunModel[231] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 259
        gunModel[232] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 260
        gunModel[233] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 261
        gunModel[234] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 262
        gunModel[235] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 263
        gunModel[236] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 264
        gunModel[237] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 265
        gunModel[238] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 266
        gunModel[239] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 267
        gunModel[240] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 268
        gunModel[241] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 270
        gunModel[242] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 271
        gunModel[243] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 272
        gunModel[244] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 273
        gunModel[245] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 274
        gunModel[246] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 275
        gunModel[247] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 277
        gunModel[248] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 289
        gunModel[249] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 290
        gunModel[250] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 291
        gunModel[251] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 296
        gunModel[252] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 297
        gunModel[253] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 298
        gunModel[254] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 300
        gunModel[255] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 301
        gunModel[256] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 303
        gunModel[257] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 304
        gunModel[258] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 305
        gunModel[259] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 306
        gunModel[260] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 307
        gunModel[261] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 387
        gunModel[262] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 388
        gunModel[263] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 389
        gunModel[264] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 407
        gunModel[265] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 408
        gunModel[266] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 409
        gunModel[267] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 410
        gunModel[268] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 411
        gunModel[269] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 412
        gunModel[270] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 413
        gunModel[271] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 414
        gunModel[272] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 415
        gunModel[273] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 416
        gunModel[274] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 417
        gunModel[275] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 418
        gunModel[276] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 419
        gunModel[277] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 420
        gunModel[278] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 421
        gunModel[279] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 422
        gunModel[280] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 423
        gunModel[281] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 424
        gunModel[282] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 425
        gunModel[283] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 426
        gunModel[284] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 427
        gunModel[285] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 428
        gunModel[286] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 429
        gunModel[287] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 430
        gunModel[288] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 431
        gunModel[289] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 432
        gunModel[290] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 433
        gunModel[291] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 434
        gunModel[292] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 435
        gunModel[293] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 250
        gunModel[294] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 339
        gunModel[295] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 340
        gunModel[296] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 341
        gunModel[297] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 342
        gunModel[298] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 343
        gunModel[299] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 344
        gunModel[300] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 345
        gunModel[301] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 346
        gunModel[302] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 347
        gunModel[303] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 348
        gunModel[304] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 349
        gunModel[305] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 350
        gunModel[306] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 351
        gunModel[307] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 352
        gunModel[308] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 353
        gunModel[309] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 354
        gunModel[310] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 355
        gunModel[311] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 356
        gunModel[312] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 357
        gunModel[313] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 358
        gunModel[314] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 359
        gunModel[315] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 360
        gunModel[316] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 361
        gunModel[317] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 362
        gunModel[318] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 363
        gunModel[319] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 364
        gunModel[320] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 365
        gunModel[321] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 367
        gunModel[322] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 368
        gunModel[323] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 369
        gunModel[324] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 370
        gunModel[325] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 371
        gunModel[326] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 397
        gunModel[327] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 398
        gunModel[328] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 399
        gunModel[329] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 400
        gunModel[330] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 401
        gunModel[331] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 402
        gunModel[332] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 403
        gunModel[333] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 404
        gunModel[334] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 405
        gunModel[335] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 406
        gunModel[336] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 319
        gunModel[337] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 320
        gunModel[338] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 321
        gunModel[339] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 322
        gunModel[340] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 323
        gunModel[341] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 324
        gunModel[342] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 325
        gunModel[343] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 326
        gunModel[344] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 327
        gunModel[345] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 328
        gunModel[346] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 329
        gunModel[347] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 330
        gunModel[348] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 331
        gunModel[349] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 332
        gunModel[350] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 333
        gunModel[351] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 334
        gunModel[352] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 335
        gunModel[353] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 336
        gunModel[354] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 337
        gunModel[355] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 338
        gunModel[356] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 248
        gunModel[357] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 246
        gunModel[358] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 257
        gunModel[359] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 258

        gunModel[0].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
        gunModel[0].setRotationPoint(-9.5F, -26F, -3F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 1
        gunModel[1].setRotationPoint(-2.5F, -26F, -3F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -0.25F, -0.5F); // Box 2
        gunModel[2].setRotationPoint(6F, -26F, -3F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.75F, 0F); // Box 5
        gunModel[3].setRotationPoint(9F, -26F, -3F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.5F, 0.25F, 0F); // Box 6
        gunModel[4].setRotationPoint(10F, -26F, -3F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 7
        gunModel[5].setRotationPoint(9.5F, -26F, -3F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 7, 4, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
        gunModel[6].setRotationPoint(11F, -26F, -3F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9
        gunModel[7].setRotationPoint(18F, -26F, -3F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
        gunModel[8].setRotationPoint(20F, -26F, -3F);

        gunModel[9].addShapeBox(1.5F, 0.5F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
        gunModel[9].setRotationPoint(24F, -20F, -2F);
        gunModel[9].rotateAngleZ = 0.20943951F;

        gunModel[10].addShapeBox(2.5F, 0.5F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 15
        gunModel[10].setRotationPoint(24F, -20F, -2F);
        gunModel[10].rotateAngleZ = 0.20943951F;

        gunModel[11].addShapeBox(3.5F, 0.5F, 0.5F, 1, 2, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 16
        gunModel[11].setRotationPoint(24F, -20F, -2F);
        gunModel[11].rotateAngleZ = 0.20943951F;

        gunModel[12].addShapeBox(-0.5F, 0.5F, 0.5F, 1, 2, 3, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 17
        gunModel[12].setRotationPoint(24F, -20F, -2F);
        gunModel[12].rotateAngleZ = 0.20943951F;

        gunModel[13].addShapeBox(0.5F, 0.5F, 0F, 1, 2, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 18
        gunModel[13].setRotationPoint(24F, -20F, -2F);
        gunModel[13].rotateAngleZ = 0.20943951F;

        gunModel[14].addShapeBox(1.5F, -0.5F, 0F, 1, 1, 4, 0F, 0.75F, 0F, 0.75F, 0.75F, 0F, 0.75F, 0.75F, 0F, 0.75F, 0.75F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
        gunModel[14].setRotationPoint(24F, -20F, -2F);
        gunModel[14].rotateAngleZ = 0.20943951F;

        gunModel[15].addShapeBox(3.5F, -0.5F, 0.5F, 1, 1, 3, 0F, -1F, 0F, 1F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 20
        gunModel[15].setRotationPoint(24F, -20F, -2F);
        gunModel[15].rotateAngleZ = 0.20943951F;

        gunModel[16].addShapeBox(2.5F, -0.5F, 0F, 1, 1, 4, 0F, -0.75F, 0F, 0.75F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, -0.75F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 21
        gunModel[16].setRotationPoint(24F, -20F, -2F);
        gunModel[16].rotateAngleZ = 0.20943951F;

        gunModel[17].addShapeBox(0.5F, -0.5F, 0F, 1, 1, 4, 0F, 1F, 0F, 0.5F, -0.75F, 0F, 0.75F, -0.75F, 0F, 0.75F, 1F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 22
        gunModel[17].setRotationPoint(24F, -20F, -2F);
        gunModel[17].rotateAngleZ = 0.20943951F;

        gunModel[18].addShapeBox(-0.5F, -0.5F, 0.5F, 1, 1, 3, 0F, 0.5F, 0F, -0.5F, -1F, 0F, 1F, -1F, 0F, 1F, 0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 23
        gunModel[18].setRotationPoint(24F, -20F, -2F);
        gunModel[18].rotateAngleZ = 0.20943951F;

        gunModel[19].addShapeBox(0F, 0F, 0F, 7, 12, 5, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
        gunModel[19].setRotationPoint(1.5F, -23F, -2.5F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
        gunModel[20].setRotationPoint(3F, -21F, -2.5F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
        gunModel[21].setRotationPoint(1.5F, -11F, -2.5F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
        gunModel[22].setRotationPoint(1.5F, -6F, -2.5F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
        gunModel[23].setRotationPoint(7.5F, -6F, -2.5F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 30
        gunModel[24].setRotationPoint(-2.5F, -21.5F, -3F);

        gunModel[25].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F); // Box 31
        gunModel[25].setRotationPoint(-9.5F, -21.5F, -3F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, -0.5F, 0F, -0.25F, -0.5F); // Box 32
        gunModel[26].setRotationPoint(6F, -21.5F, -3F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F); // Box 33
        gunModel[27].setRotationPoint(11F, -22.25F, -3F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -0.5F); // Box 34
        gunModel[28].setRotationPoint(10F, -23F, -3F);

        gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F); // Box 35
        gunModel[29].setRotationPoint(10F, -23F, -3F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 36
        gunModel[30].setRotationPoint(9.5F, -23F, -3F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, 0F); // Box 37
        gunModel[31].setRotationPoint(9F, -23F, -3F);

        gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, 0F, 0F); // Box 38
        gunModel[32].setRotationPoint(9F, -23F, -3F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 39
        gunModel[33].setRotationPoint(0.5F, -11F, -2.5F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F, -3F, 0F, -1F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 40
        gunModel[34].setRotationPoint(0.5F, -23F, -2.5F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F, -3F, 0F, 0F, 3F, 0F, -1F, 3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 41
        gunModel[35].setRotationPoint(8.5F, -23F, -2.5F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 42
        gunModel[36].setRotationPoint(2F, -21F, -2.5F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 43
        gunModel[37].setRotationPoint(8.5F, -11F, -2.5F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
        gunModel[38].setRotationPoint(3F, -21F, -2.5F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 45
        gunModel[39].setRotationPoint(2F, -21F, -2.5F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 46
        gunModel[40].setRotationPoint(32F, -22.5F, -1.5F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, -0.375F, 0F, 0.25F, -0.375F, 0F, 0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F); // Box 47
        gunModel[41].setRotationPoint(32F, -22.5F, -1.5F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.5F, 0F); // Box 48
        gunModel[42].setRotationPoint(33.5F, -18.5F, -1.5F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 49
        gunModel[43].setRotationPoint(10.5F, -17.5F, -1.5F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
        gunModel[44].setRotationPoint(10.5F, -19.5F, -1.5F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 51
        gunModel[45].setRotationPoint(11.5F, -17.5F, -1.5F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 52
        gunModel[46].setRotationPoint(12F, -17.5F, -1.5F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
        gunModel[47].setRotationPoint(13F, -17F, -1.5F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0.5F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F); // Box 54
        gunModel[48].setRotationPoint(17F, -17F, -1.5F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 55
        gunModel[49].setRotationPoint(19F, -21F, -1.5F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
        gunModel[50].setRotationPoint(19F, -21F, -1.5F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, -0.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 1.75F, -0.5F, 0F, 1.75F, -0.5F, 0F, -0.25F, -0.5F); // Box 57
        gunModel[51].setRotationPoint(18F, -22.25F, -3F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 58
        gunModel[52].setRotationPoint(20F, -20.25F, -3F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 12, 1, 6, 0F, 0F, -0.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.2F, -2.75F, -0.5F, 0.2F, -2.75F, -0.5F, 0F, -0.25F, -0.5F); // Box 59
        gunModel[53].setRotationPoint(21F, -20.25F, -3F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 60
        gunModel[54].setRotationPoint(-10.5F, -26.5F, -3F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 61
        gunModel[55].setRotationPoint(-12.5F, -26.5F, -3F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -2F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 63
        gunModel[56].setRotationPoint(-13F, -26.5F, -1F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F); // Box 64
        gunModel[57].setRotationPoint(-14F, -26.5F, 1F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 65
        gunModel[58].setRotationPoint(-10.5F, -22F, -3F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 66
        gunModel[59].setRotationPoint(-11.5F, -22F, 1.12F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 69
        gunModel[60].setRotationPoint(-10.5F, -22F, -3F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 70
        gunModel[61].setRotationPoint(-13F, -26.5F, 2.5F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, -1F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, -1F, 0F, -0.25F, -0.75F); // Box 71
        gunModel[62].setRotationPoint(-13F, -26.5F, 1.5F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.75F, -0.75F, -0.25F, -1F, -0.75F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, -0.75F, -0.25F, -1F, -0.75F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 72
        gunModel[63].setRotationPoint(-13F, -26.5F, 1.5F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, -1F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, -1F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F); // Box 73
        gunModel[64].setRotationPoint(-13F, -26.5F, 1.5F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, -0.75F, -0.25F, -1F, -0.75F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, -0.75F, -0.25F, -1F); // Box 74
        gunModel[65].setRotationPoint(-13F, -26.5F, 1.5F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F); // Box 76
        gunModel[66].setRotationPoint(-12F, -22F, 1.12F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F); // Box 77
        gunModel[67].setRotationPoint(-11F, -22F, 1.12F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 78
        gunModel[68].setRotationPoint(-12.5F, -25.75F, 2F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 79
        gunModel[69].setRotationPoint(-12.5F, -22.75F, -3F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 80
        gunModel[70].setRotationPoint(-11.5F, -26.5F, -3F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 81
        gunModel[71].setRotationPoint(-11.5F, -22.75F, -3F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
        gunModel[72].setRotationPoint(-11.5F, -25.5F, 2F);

        gunModel[73].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.5F, 0F); // Box 83
        gunModel[73].setRotationPoint(-9.5F, -26F, 2F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 84
        gunModel[74].setRotationPoint(-2.5F, -26F, 2F);

        gunModel[75].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 85
        gunModel[75].setRotationPoint(6F, -26F, 2F);

        gunModel[76].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 87
        gunModel[76].setRotationPoint(29F, -26.5F, -2F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 88
        gunModel[77].setRotationPoint(29F, -27.5F, -2F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 89
        gunModel[78].setRotationPoint(29F, -28.5F, -1.5F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
        gunModel[79].setRotationPoint(29F, -26.5F, 1F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
        gunModel[80].setRotationPoint(29F, -27.5F, 1F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
        gunModel[81].setRotationPoint(29F, -28.5F, 0.5F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.74F, 0F, 0F, -0.74F); // Box 93
        gunModel[82].setRotationPoint(29F, -28.5F, -0.5F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.74F, 0F, 0F, -0.74F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 94
        gunModel[83].setRotationPoint(29F, -28.5F, -0.5F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 95
        gunModel[84].setRotationPoint(29F, -28.5F, -0.5F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 96
        gunModel[85].setRotationPoint(29F, -25.5F, 1F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.74F, 0F, 0F, -0.74F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 97
        gunModel[86].setRotationPoint(29F, -24.5F, -0.5F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 98
        gunModel[87].setRotationPoint(29F, -24.5F, -0.5F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, -0.74F, 0F, 0F, -0.74F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 99
        gunModel[88].setRotationPoint(29F, -24.5F, -0.5F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 100
        gunModel[89].setRotationPoint(29F, -24.5F, 0.5F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 101
        gunModel[90].setRotationPoint(29F, -24.5F, -1.5F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 102
        gunModel[91].setRotationPoint(29F, -25.5F, -2F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 103
        gunModel[92].setRotationPoint(33.25F, -26.5F, -2F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 104
        gunModel[93].setRotationPoint(33.25F, -27.5F, -2F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 105
        gunModel[94].setRotationPoint(33.25F, -28.5F, -1.5F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F); // Box 106
        gunModel[95].setRotationPoint(32.75F, -26.5F, -2F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F); // Box 107
        gunModel[96].setRotationPoint(32.75F, -27.5F, -2F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, -0.5F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F); // Box 108
        gunModel[97].setRotationPoint(32.75F, -28.5F, -1.5F);

        gunModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F); // Box 109
        gunModel[98].setRotationPoint(32.75F, -25.5F, -2F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F); // Box 110
        gunModel[99].setRotationPoint(33.25F, -24.5F, -1.5F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 111
        gunModel[100].setRotationPoint(33.25F, -25.5F, -2F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, -0.5F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.5F, -1F); // Box 112
        gunModel[101].setRotationPoint(32.75F, -24.5F, -1.5F);

        gunModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F); // Box 113
        gunModel[102].setRotationPoint(34.75F, -24.5F, -1.5F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, -0.25F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.25F, -1F); // Box 114
        gunModel[103].setRotationPoint(35.25F, -24.5F, -1.5F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F); // Box 119
        gunModel[104].setRotationPoint(34.75F, -28.5F, -1.5F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F); // Box 120
        gunModel[105].setRotationPoint(35.25F, -28.5F, -1.5F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F); // Box 121
        gunModel[106].setRotationPoint(35.25F, -25.5F, -2F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 122
        gunModel[107].setRotationPoint(34.75F, -25.5F, -2F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, 0.025F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.025F, -0.25F, 0F, 0.025F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.025F); // Box 125
        gunModel[108].setRotationPoint(35.25F, -26.5F, -2F);

        gunModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, 0.025F, -0.25F, 0F, 0.025F, -0.25F, 0F, 0.025F, -0.25F, 0F, 0.025F, -0.25F, 0F, 0.025F, -0.25F, 0F, 0.025F, -0.25F, 0F, 0.025F, -0.25F, 0F, 0.025F); // Box 126
        gunModel[109].setRotationPoint(34.75F, -26.5F, -2F);

        gunModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0.05F, -0.5F, -0.25F, 0.05F, -0.5F, -0.25F, 0.05F, -0.5F, -0.25F, 0.05F, -0.5F, -0.25F, 0F, 0.025F, -0.25F, 0F, 0.025F, -0.25F, 0F, 0.025F, -0.25F, 0F, 0.025F); // Box 127
        gunModel[110].setRotationPoint(34.75F, -27.5F, -2F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0.05F, -0.475F, -0.25F, 0.05F, -0.5F, -0.25F, 0.05F, -0.5F, -0.25F, 0.05F, -0.475F, -0.25F, 0F, 0.025F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.025F); // Box 128
        gunModel[111].setRotationPoint(35.25F, -27.5F, -2F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 129
        gunModel[112].setRotationPoint(-2.5F, -26F, -3F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 130
        gunModel[113].setRotationPoint(8.5F, -26F, -4F);

        gunModel[114].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 1F, -0.75F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 132
        gunModel[114].setRotationPoint(8.5F, -26F, -4F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F); // Box 133
        gunModel[115].setRotationPoint(9F, -22.25F, -3.5F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F); // Box 134
        gunModel[116].setRotationPoint(9F, -23.25F, -3.5F);

        gunModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F); // Box 135
        gunModel[117].setRotationPoint(9F, -21.25F, -3.5F);

        gunModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0.125F, -0.875F, 0F, -0.375F, 0.375F, 0F, -0.375F, 0.375F, 0F, 0.125F, -0.875F, 0F, 0F, 0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0F, 0.125F, 0F); // Box 136
        gunModel[118].setRotationPoint(7F, -22.25F, -3.5F);

        gunModel[119].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 152
        gunModel[119].setRotationPoint(-10F, -29F, -0.5F);

        gunModel[120].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 153
        gunModel[120].setRotationPoint(-10F, -29.5F, -0.5F);

        gunModel[121].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 154
        gunModel[121].setRotationPoint(-10F, -28.5F, -0.5F);

        gunModel[122].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 155
        gunModel[122].setRotationPoint(-9.5F, -27.5F, -2.5F);

        gunModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 156
        gunModel[123].setRotationPoint(-9.5F, -29.5F, -2.5F);

        gunModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 157
        gunModel[124].setRotationPoint(-9.5F, -28.75F, -1.25F);

        gunModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 158
        gunModel[125].setRotationPoint(-9.5F, -29.5F, 0.5F);

        gunModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.99F, -0.5F, 0F, -0.99F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 159
        gunModel[126].setRotationPoint(-9.5F, -28.75F, 0.25F);

        gunModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 160
        gunModel[127].setRotationPoint(-9.5F, -29.5F, -1.5F);

        gunModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 161
        gunModel[128].setRotationPoint(-9.5F, -29.5F, 0.5F);

        gunModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.625F, -0.25F, 0.25F, -0.125F, -0.25F, 0.25F, -0.125F, -0.25F, 0.25F, -0.625F, -0.25F, 0.25F, -0.625F, -0.25F, 0.25F, -0.125F, -0.25F, 0.25F, -0.125F, -0.25F, 0.25F, -0.625F, -0.25F, 0.25F); // Box 162
        gunModel[129].setRotationPoint(-10F, -29F, -0.5F);

        gunModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.625F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.625F, -0.25F, -0.25F, -0.625F, -0.25F, 0.25F, -0.125F, -0.25F, 0.25F, -0.125F, -0.25F, 0.25F, -0.625F, -0.25F, 0.25F); // Box 163
        gunModel[130].setRotationPoint(-10F, -29.5F, -0.5F);

        gunModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 183
        gunModel[131].setRotationPoint(5F, -26F, 1.25F);

        gunModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F); // Box 184
        gunModel[132].setRotationPoint(5F, -26F, 3.25F);

        gunModel[133].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 185
        gunModel[133].setRotationPoint(8.5F, -26F, 3F);

        gunModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 186
        gunModel[134].setRotationPoint(-11.5F, -22F, -3F);

        gunModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 187
        gunModel[135].setRotationPoint(-11.5F, -22F, -3F);

        gunModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.75F, 0F, -1F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F); // Box 188
        gunModel[136].setRotationPoint(-12.5F, -22F, -3F);

        gunModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F); // Box 189
        gunModel[137].setRotationPoint(-12.5F, -22F, -3F);

        gunModel[138].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
        gunModel[138].setRotationPoint(12F, -26.5F, -1.5F);

        gunModel[139].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
        gunModel[139].setRotationPoint(12F, -27.5F, -1.5F);

        gunModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, 0.025F, -0.25F, 0F, 0.025F, -0.25F, 0F, 0.025F, -0.25F, 0F, 0.025F, -0.25F, 0F, -0.475F, -0.25F, 0F, -0.475F, -0.25F, 0F, -0.475F, -0.25F, 0F, -0.475F); // Box 200
        gunModel[140].setRotationPoint(34.75F, -25.5F, -2F);

        gunModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, 0.025F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.025F, -0.25F, 0F, -0.475F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.475F); // Box 201
        gunModel[141].setRotationPoint(35.25F, -25.5F, -2F);

        gunModel[142].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
        gunModel[142].setRotationPoint(25F, -28.5F, -2F);

        gunModel[143].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 217
        gunModel[143].setRotationPoint(28F, -29.5F, -1.5F);

        gunModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 218
        gunModel[144].setRotationPoint(28F, -29.5F, -1.5F);

        gunModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.75F, 0.25F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0.25F); // Box 219
        gunModel[145].setRotationPoint(29F, -29.5F, -1.5F);

        gunModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, 0F); // Box 220
        gunModel[146].setRotationPoint(32F, -29.5F, -1.5F);

        gunModel[147].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 221
        gunModel[147].setRotationPoint(-3.5F, -26F, -2.5F);

        gunModel[148].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 222
        gunModel[148].setRotationPoint(-3.5F, -26F, -3F);

        gunModel[149].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 223
        gunModel[149].setRotationPoint(0.5F, -26F, -2.5F);

        gunModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -0.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.75F, 0.5F, 0F); // Box 225
        gunModel[150].setRotationPoint(32F, -22.5F, -1.5F);

        gunModel[151].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.25F, 0F); // Box 226
        gunModel[151].setRotationPoint(30F, -26F, -3F);

        gunModel[152].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F, 0F, -1.75F, 0F, 0F, -0.615F, 0F, 0F, -0.615F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F); // Box 227
        gunModel[152].setRotationPoint(21F, -22F, -3F);

        gunModel[153].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F, 0F, -1.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F); // Box 228
        gunModel[153].setRotationPoint(27F, -23.25F, -3F);

        gunModel[154].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
        gunModel[154].setRotationPoint(21F, -26F, -3F);

        gunModel[155].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
        gunModel[155].setRotationPoint(21F, -25F, -3F);

        gunModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 231
        gunModel[156].setRotationPoint(23.5F, -25F, -3F);

        gunModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 232
        gunModel[157].setRotationPoint(25.5F, -25F, -3F);

        gunModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 233
        gunModel[158].setRotationPoint(25.5F, -22F, -3F);

        gunModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
        gunModel[159].setRotationPoint(23.5F, -22F, -3F);

        gunModel[160].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.99F, 0F, -0.5F, -0.99F, 0F, 0F, 0F, 0F); // Box 235
        gunModel[160].setRotationPoint(21F, -21F, -3F);

        gunModel[161].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.125F, 0F); // Box 236
        gunModel[161].setRotationPoint(26F, -25F, -3F);

        gunModel[162].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 238
        gunModel[162].setRotationPoint(24F, -25F, -3F);

        gunModel[163].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 239
        gunModel[163].setRotationPoint(25F, -25F, -3F);

        gunModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F); // Box 240
        gunModel[164].setRotationPoint(25F, -25F, -3F);

        gunModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F); // Box 241
        gunModel[165].setRotationPoint(24F, -25F, -3F);

        gunModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F); // Box 242
        gunModel[166].setRotationPoint(24F, -22F, -3F);

        gunModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F); // Box 243
        gunModel[167].setRotationPoint(25F, -22F, -3F);

        gunModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
        gunModel[168].setRotationPoint(24.5F, -22F, -3F);

        gunModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 245
        gunModel[169].setRotationPoint(24.5F, -25F, -3F);

        gunModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.125F, -0.05F, 0.25F, -0.125F, -0.05F, 0.25F, -0.125F, -0.05F, 0.25F, -0.125F, -0.05F, 0.25F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 246
        gunModel[170].setRotationPoint(24.5F, -24.5F, -2.5F);

        gunModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.05F, 0.25F, -0.125F, -0.05F, 0.25F, -0.125F, -0.05F, 0.25F, -0.125F, -0.05F, 0.25F); // Box 248
        gunModel[171].setRotationPoint(24.5F, -23.5F, -2.5F);

        gunModel[172].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 249
        gunModel[172].setRotationPoint(24.5F, -25F, -2F);

        gunModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
        gunModel[173].setRotationPoint(13.5F, -22F, -1F);

        gunModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 309
        gunModel[174].setRotationPoint(13.5F, -21F, -1F);

        gunModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
        gunModel[175].setRotationPoint(13F, -20F, -1F);

        gunModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0.25F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0.25F, 0F); // Box 311
        gunModel[176].setRotationPoint(13F, -19F, -1F);

        gunModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
        gunModel[177].setRotationPoint(13.5F, -20.5F, -0.5F);

        gunModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0.25F, 0F); // Box 313
        gunModel[178].setRotationPoint(13.5F, -19.5F, -0.5F);

        gunModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 314
        gunModel[179].setRotationPoint(14F, -21.5F, -0.5F);

        gunModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
        gunModel[180].setRotationPoint(14F, -22.5F, -0.5F);

        gunModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 316
        gunModel[181].setRotationPoint(9.5F, -17.5F, -2.5F);
        gunModel[181].rotateAngleZ = -0.27925268F;

        gunModel[182].addShapeBox(0F, -1F, 0F, 1, 1, 5, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 317
        gunModel[182].setRotationPoint(9.5F, -17.5F, -2.5F);
        gunModel[182].rotateAngleZ = -0.27925268F;

        gunModel[183].addShapeBox(0F, 1F, 0F, 1, 1, 5, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F); // Box 318
        gunModel[183].setRotationPoint(9.5F, -17.5F, -2.5F);
        gunModel[183].rotateAngleZ = -0.27925268F;

        gunModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F); // Box 390
        gunModel[184].setRotationPoint(-5.5F, -24F, -3F);

        gunModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, -0.625F, -0.5F, -0.5F, -0.625F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F); // Box 391
        gunModel[185].setRotationPoint(-5.5F, -25F, -3F);

        gunModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, -0.625F, -0.5F, -0.5F, -0.625F); // Box 392
        gunModel[186].setRotationPoint(-5.5F, -23F, -3F);

        gunModel[187].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, -0.625F, -0.5F, -0.5F, -0.625F); // Box 393
        gunModel[187].setRotationPoint(1.5F, -22.5F, -3F);

        gunModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F); // Box 394
        gunModel[188].setRotationPoint(1.5F, -23.5F, -3F);

        gunModel[189].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, -0.625F, -0.5F, -0.5F, -0.625F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F); // Box 395
        gunModel[189].setRotationPoint(1.5F, -24.5F, -3F);

        gunModel[190].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F); // Box 396
        gunModel[190].setRotationPoint(-3F, -24.5F, -3F);

        gunModel[191].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
        gunModel[191].setRotationPoint(1.5F, -11F, 1.5F);

        gunModel[192].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
        gunModel[192].setRotationPoint(1.5F, -6F, 1.5F);

        gunModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
        gunModel[193].setRotationPoint(7.5F, -6F, 1.5F);

        gunModel[194].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 222
        gunModel[194].setRotationPoint(-4F, -29.5F, -3F);

        gunModel[195].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 223
        gunModel[195].setRotationPoint(-6F, -29.5F, -3F);

        gunModel[196].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 224
        gunModel[196].setRotationPoint(-10F, -28.5F, -3F);

        gunModel[197].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F); // Box 225
        gunModel[197].setRotationPoint(-10F, -28F, -3F);

        gunModel[198].addShapeBox(0F, 0F, 0F, 17, 1, 6, 0F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
        gunModel[198].setRotationPoint(14F, -30.5F, -3F);

        gunModel[199].addShapeBox(0F, 0F, 0F, 27, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 227
        gunModel[199].setRotationPoint(-2F, -31.5F, -2.5F);

        gunModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 228
        gunModel[200].setRotationPoint(-2F, -31.5F, -2.5F);

        gunModel[201].addShapeBox(0F, 0F, 0F, 33, 1, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 229
        gunModel[201].setRotationPoint(-2F, -30.5F, -2F);

        gunModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 230
        gunModel[202].setRotationPoint(1F, -31.5F, -2.5F);

        gunModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 231
        gunModel[203].setRotationPoint(-6F, -30.5F, -3F);

        gunModel[204].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, -0.5F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 232
        gunModel[204].setRotationPoint(-10F, -30.5F, -3F);

        gunModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 233
        gunModel[205].setRotationPoint(-10F, -30.5F, -3F);

        gunModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 234
        gunModel[206].setRotationPoint(-10F, -29F, -3F);

        gunModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, -0.5F); // Box 235
        gunModel[207].setRotationPoint(-10F, -30.5F, 1F);

        gunModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0F, 0F, 0.25F, -0.5F); // Box 236
        gunModel[208].setRotationPoint(-10F, -29F, 1F);

        gunModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 237
        gunModel[209].setRotationPoint(-10F, -29.5F, -1F);

        gunModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 238
        gunModel[210].setRotationPoint(-10F, -29.25F, -1F);

        gunModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 239
        gunModel[211].setRotationPoint(-10F, -28.75F, -1F);

        gunModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 240
        gunModel[212].setRotationPoint(-10F, -29.25F, 0F);

        gunModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 241
        gunModel[213].setRotationPoint(-10F, -28.75F, 0F);

        gunModel[214].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
        gunModel[214].setRotationPoint(-5F, -31F, -2F);

        gunModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
        gunModel[215].setRotationPoint(-3F, -32F, -2F);

        gunModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
        gunModel[216].setRotationPoint(-5F, -31.5F, -2F);

        gunModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 245
        gunModel[217].setRotationPoint(-4.5F, -31.5F, -2F);

        gunModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 246
        gunModel[218].setRotationPoint(-3.5F, -31.75F, -2F);

        gunModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Box 247
        gunModel[219].setRotationPoint(-3.5F, -31.5F, -2F);

        gunModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Box 248
        gunModel[220].setRotationPoint(-4.5F, -31.5F, -2F);

        gunModel[221].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 249
        gunModel[221].setRotationPoint(-10F, -32F, -1.5F);

        gunModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F); // Box 250
        gunModel[222].setRotationPoint(-10F, -32F, -1.5F);

        gunModel[223].addShapeBox(0F, 0F, 0F, 15, 1, 6, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 251
        gunModel[223].setRotationPoint(-10F, -26.5F, -3F);

        gunModel[224].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 252
        gunModel[224].setRotationPoint(14F, -29.5F, -3F);

        gunModel[225].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 253
        gunModel[225].setRotationPoint(-2F, -29.5F, 2F);

        gunModel[226].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 254
        gunModel[226].setRotationPoint(-4F, -27.5F, -3F);

        gunModel[227].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0.5F, 0F, 0F, 0.5F, 2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 2F, -0.5F, 0.5F); // Box 255
        gunModel[227].setRotationPoint(13F, -27.5F, -3F);

        gunModel[228].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1.99F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, -1.99F, -0.5F, 0F); // Box 256
        gunModel[228].setRotationPoint(0F, -27.5F, -3F);

        gunModel[229].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, -0.5F, -1F, 0F, 0F, -1F, -0.875F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.99F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, -0.99F, 0F, 0F); // Box 257
        gunModel[229].setRotationPoint(-1F, -29.5F, -3F);

        gunModel[230].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, -1F, -0.875F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -0.25F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0.5F, 0F); // Box 258
        gunModel[230].setRotationPoint(11F, -29.5F, -3F);

        gunModel[231].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.75F, -0.5F, 0F, -1.99F, -0.5F, 0F, -1.99F, -0.5F, 0F, 0.75F, -0.5F, 0F); // Box 259
        gunModel[231].setRotationPoint(11F, -27.5F, -3F);

        gunModel[232].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[232].setRotationPoint(-4F, -30.5F, -3F);

        gunModel[233].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, -0.5F, -0.5F, 1F, -0.5F, -1.25F, 1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 1F, 0F, -1.25F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 261
        gunModel[233].setRotationPoint(-1F, -30.5F, -3F);

        gunModel[234].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 1F, -0.5F, -1.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 262
        gunModel[234].setRotationPoint(11F, -30.5F, -3F);

        gunModel[235].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
        gunModel[235].setRotationPoint(2F, -30.5F, -3F);

        gunModel[236].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 264
        gunModel[236].setRotationPoint(-1F, -26F, -3F);

        gunModel[237].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 265
        gunModel[237].setRotationPoint(25F, -31.5F, -2F);

        gunModel[238].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -3F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -3F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 266
        gunModel[238].setRotationPoint(25F, -32F, -0.5F);

        gunModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.5F, -0.125F, -0.25F, 0.5F, -0.125F, -0.25F, 0.5F, -0.125F, -0.25F, 0.5F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F); // Box 267
        gunModel[239].setRotationPoint(27.5F, -32F, -0.5F);

        gunModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.5F, -0.125F, -0.625F, 0.5F, -0.375F, -0.625F, 0.5F, -0.375F, -0.25F, 0.5F, -0.125F, -0.25F, 0F, -0.125F, -0.625F, 0F, -0.375F, -0.625F, 0F, -0.375F, -0.25F, 0F, -0.125F); // Box 268
        gunModel[240].setRotationPoint(28F, -32F, -0.5F);

        gunModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 270
        gunModel[241].setRotationPoint(27.5F, -32F, -0.5F);

        gunModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.625F, -0.25F, -0.5F, -0.625F, -0.25F, -0.25F, -0.625F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F); // Box 271
        gunModel[242].setRotationPoint(28F, -32F, -0.5F);

        gunModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.625F, 0.5F, -0.375F, -0.25F, 0.5F, -0.125F, -0.25F, 0.5F, -0.125F, -0.625F, 0.5F, -0.375F, -0.625F, 0F, -0.375F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.625F, 0F, -0.375F); // Box 272
        gunModel[243].setRotationPoint(27F, -32F, -0.5F);

        gunModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.625F, -0.25F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.625F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F); // Box 273
        gunModel[244].setRotationPoint(27F, -32F, -0.5F);

        gunModel[245].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, 0.25F, -0.125F, -1F, 0.25F, -0.125F, -1F, 0.25F, -0.375F, -0.25F, 0.25F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.375F, 0F, 0F, -0.375F); // Box 274
        gunModel[245].setRotationPoint(-5F, -33F, -1.75F);

        gunModel[246].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, 0.25F, -0.375F, -1F, 0.25F, -0.375F, -1F, 0.25F, -0.125F, -0.25F, 0.25F, -0.125F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 275
        gunModel[246].setRotationPoint(-5F, -33F, 0.75F);

        gunModel[247].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.875F, 0.375F, -0.125F, -0.875F, 0.375F, -0.125F, -0.875F, 0.375F, 0F, -0.875F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0.375F); // Box 277
        gunModel[247].setRotationPoint(-5F, -33F, -1F);

        gunModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.05F, -0.25F, -0.25F, -0.05F, -0.25F, -0.375F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.375F, -0.175F, -0.25F, -0.375F, -0.175F); // Box 289
        gunModel[248].setRotationPoint(-5F, -33.7F, -0.6F);

        gunModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.375F, -0.125F, -0.25F, -0.375F, -0.125F, -0.25F, -0.05F, -0.5F, -0.25F, -0.05F, -0.5F, -0.25F, -0.175F, -0.125F, -0.25F, -0.175F, -0.125F); // Box 290
        gunModel[249].setRotationPoint(-5F, -33.2F, -1.35F);

        gunModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.625F, 0.125F, -0.25F, -0.625F, 0.125F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F); // Box 291
        gunModel[250].setRotationPoint(-5F, -33.7F, -1.35F);

        gunModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.375F, -0.125F, -0.25F, -0.375F, -0.125F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.175F, -0.125F, -0.25F, -0.175F, -0.125F, -0.25F, -0.05F, -0.5F, -0.25F, -0.05F, -0.5F); // Box 296
        gunModel[251].setRotationPoint(-5F, -33.2F, 0.35F);

        gunModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.625F, 0.125F, -0.25F, -0.625F, 0.125F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Box 297
        gunModel[252].setRotationPoint(-5F, -33.7F, 0.35F);

        gunModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.625F, 0.125F, -0.25F, -0.625F, 0.125F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 298
        gunModel[253].setRotationPoint(-5F, -32.5F, 0.35F);

        gunModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.625F, 0.125F, -0.25F, -0.625F, 0.125F); // Box 300
        gunModel[254].setRotationPoint(-5F, -32.5F, -1.35F);

        gunModel[255].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 301
        gunModel[255].setRotationPoint(23F, -31.5F, -2.5F);

        gunModel[256].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -0.5F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 303
        gunModel[256].setRotationPoint(6F, -29.5F, 2F);

        gunModel[257].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 304
        gunModel[257].setRotationPoint(4.5F, -29.5F, 2F);

        gunModel[258].addShapeBox(0F, 0F, 0F, 26, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F); // Box 305
        gunModel[258].setRotationPoint(6F, -26.5F, -3F);

        gunModel[259].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -0.375F, 0F, 0.5F, -0.375F, 0F, 0F, 1F, 0F, 0F); // Box 306
        gunModel[259].setRotationPoint(14F, -29.5F, 2F);

        gunModel[260].addShapeBox(0F, 0F, 0F, 18, 1, 3, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, -0.375F, 0F, -0.8F, -0.375F, 0F, -0.8F, -0.375F, 0F, 1F, -0.375F, 0F); // Box 307
        gunModel[260].setRotationPoint(14F, -29.5F, -1.5F);

        gunModel[261].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 387
        gunModel[261].setRotationPoint(15F, -30.5F, -4.5F);

        gunModel[262].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 388
        gunModel[262].setRotationPoint(15F, -30.5F, -4.5F);

        gunModel[263].addShapeBox(0F, 0F, 0F, 15, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 389
        gunModel[263].setRotationPoint(15F, -30F, -3.5F);

        gunModel[264].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F, 0F, 0F, 0.5F, -0.375F, 0F, 0.5F, -0.375F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 2F, -0.5F, 0F); // Box 407
        gunModel[264].setRotationPoint(13F, -27.5F, 2F);

        gunModel[265].addShapeBox(0F, 0F, 0F, 26, 1, 2, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 408
        gunModel[265].setRotationPoint(6F, -26.5F, 1F);

        gunModel[266].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 409
        gunModel[266].setRotationPoint(15F, -30.5F, 3.5F);

        gunModel[267].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 410
        gunModel[267].setRotationPoint(15F, -30.5F, 3.5F);

        gunModel[268].addShapeBox(0F, 0F, 0F, 15, 4, 1, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
        gunModel[268].setRotationPoint(15F, -30F, 2.5F);

        gunModel[269].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 412
        gunModel[269].setRotationPoint(17F, -30.5F, 3.5F);

        gunModel[270].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 413
        gunModel[270].setRotationPoint(17F, -30.5F, -4.5F);

        gunModel[271].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 414
        gunModel[271].setRotationPoint(19F, -30.5F, 3.5F);

        gunModel[272].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 415
        gunModel[272].setRotationPoint(19F, -30.5F, -4.5F);

        gunModel[273].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 416
        gunModel[273].setRotationPoint(21F, -30.5F, 3.5F);

        gunModel[274].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 417
        gunModel[274].setRotationPoint(21F, -30.5F, -4.5F);

        gunModel[275].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 418
        gunModel[275].setRotationPoint(23F, -30.5F, 3.5F);

        gunModel[276].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 419
        gunModel[276].setRotationPoint(23F, -30.5F, -4.5F);

        gunModel[277].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 420
        gunModel[277].setRotationPoint(25F, -30.5F, 3.5F);

        gunModel[278].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 421
        gunModel[278].setRotationPoint(25F, -30.5F, -4.5F);

        gunModel[279].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 422
        gunModel[279].setRotationPoint(27F, -30.5F, 3.5F);

        gunModel[280].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 423
        gunModel[280].setRotationPoint(27F, -30.5F, -4.5F);

        gunModel[281].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 424
        gunModel[281].setRotationPoint(29F, -30.5F, 3.5F);

        gunModel[282].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 425
        gunModel[282].setRotationPoint(29F, -30.5F, -4.5F);

        gunModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 426
        gunModel[283].setRotationPoint(3F, -31.5F, -2.5F);

        gunModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 427
        gunModel[284].setRotationPoint(7F, -31.5F, -2.5F);

        gunModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 428
        gunModel[285].setRotationPoint(5F, -31.5F, -2.5F);

        gunModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 429
        gunModel[286].setRotationPoint(11F, -31.5F, -2.5F);

        gunModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 430
        gunModel[287].setRotationPoint(9F, -31.5F, -2.5F);

        gunModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 431
        gunModel[288].setRotationPoint(15F, -31.5F, -2.5F);

        gunModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 432
        gunModel[289].setRotationPoint(13F, -31.5F, -2.5F);

        gunModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 433
        gunModel[290].setRotationPoint(19F, -31.5F, -2.5F);

        gunModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 434
        gunModel[291].setRotationPoint(17F, -31.5F, -2.5F);

        gunModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 435
        gunModel[292].setRotationPoint(21F, -31.5F, -2.5F);

        gunModel[293].addShapeBox(0F, 0F, 0F, 29, 3, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
        gunModel[293].setRotationPoint(-40.5F, -25.75F, -1F);

        gunModel[294].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 339
        gunModel[294].setRotationPoint(-11.5F, -25.75F, -3F);

        gunModel[295].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 340
        gunModel[295].setRotationPoint(-11.5F, -25.75F, -3F);

        gunModel[296].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
        gunModel[296].setRotationPoint(-40.5F, -25.75F, -2F);

        gunModel[297].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 342
        gunModel[297].setRotationPoint(-40.5F, -24.75F, -2F);

        gunModel[298].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
        gunModel[298].setRotationPoint(-40.5F, -24.5F, -2F);

        gunModel[299].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 344
        gunModel[299].setRotationPoint(-40.5F, -23.5F, -2F);

        gunModel[300].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 345
        gunModel[300].setRotationPoint(-40.5F, -25.75F, -2F);

        gunModel[301].addShapeBox(0F, 0F, 0F, 29, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 346
        gunModel[301].setRotationPoint(-40.5F, -23.5F, -2F);

        gunModel[302].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
        gunModel[302].setRotationPoint(-42.5F, -25.75F, -1F);

        gunModel[303].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 348
        gunModel[303].setRotationPoint(-52.5F, -25.75F, -1F);

        gunModel[304].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 349
        gunModel[304].setRotationPoint(-52.5F, -22.75F, -1F);

        gunModel[305].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 350
        gunModel[305].setRotationPoint(-52.5F, -21.75F, -1F);

        gunModel[306].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
        gunModel[306].setRotationPoint(-52.5F, -20.75F, -1F);

        gunModel[307].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 352
        gunModel[307].setRotationPoint(-52.5F, -19.75F, -1F);

        gunModel[308].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 353
        gunModel[308].setRotationPoint(-52.5F, -18.75F, -1F);

        gunModel[309].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 354
        gunModel[309].setRotationPoint(-52.5F, -25.75F, -1F);

        gunModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, -2F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -2F); // Box 355
        gunModel[310].setRotationPoint(-41.5F, -24.75F, -2F);

        gunModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 356
        gunModel[311].setRotationPoint(-41.5F, -25.75F, -2F);

        gunModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F); // Box 357
        gunModel[312].setRotationPoint(-41.5F, -25.75F, -2F);

        gunModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 358
        gunModel[313].setRotationPoint(-41.5F, -24.5F, -2F);

        gunModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F); // Box 359
        gunModel[314].setRotationPoint(-41.5F, -23.5F, -2F);

        gunModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F); // Box 360
        gunModel[315].setRotationPoint(-41.5F, -23.5F, -2F);

        gunModel[316].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 361
        gunModel[316].setRotationPoint(-31.5F, -25.75F, -2F);

        gunModel[317].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
        gunModel[317].setRotationPoint(-31.5F, -25.75F, -2F);

        gunModel[318].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 363
        gunModel[318].setRotationPoint(-31.5F, -24.75F, -2F);

        gunModel[319].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
        gunModel[319].setRotationPoint(-31.5F, -24.5F, -2F);

        gunModel[320].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 365
        gunModel[320].setRotationPoint(-31.5F, -23.5F, -2F);

        gunModel[321].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 367
        gunModel[321].setRotationPoint(-35.5F, -25.75F, -1F);

        gunModel[322].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
        gunModel[322].setRotationPoint(-35.5F, -25.75F, -1F);

        gunModel[323].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 369
        gunModel[323].setRotationPoint(-35.5F, -24.75F, -1F);

        gunModel[324].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
        gunModel[324].setRotationPoint(-35.5F, -24.5F, -1F);

        gunModel[325].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 371
        gunModel[325].setRotationPoint(-35.5F, -23.5F, -1F);

        gunModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 397
        gunModel[326].setRotationPoint(-32.5F, -25.75F, -2F);

        gunModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F); // Box 398
        gunModel[327].setRotationPoint(-32.5F, -25.75F, -2F);

        gunModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, -2F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -2F); // Box 399
        gunModel[328].setRotationPoint(-32.5F, -24.75F, -2F);

        gunModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 400
        gunModel[329].setRotationPoint(-32.5F, -24.5F, -2F);

        gunModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F); // Box 401
        gunModel[330].setRotationPoint(-32.5F, -23.5F, -2F);

        gunModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 402
        gunModel[331].setRotationPoint(-35.5F, -25.75F, -2F);

        gunModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 403
        gunModel[332].setRotationPoint(-35.5F, -25.75F, -2F);

        gunModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, -1F); // Box 404
        gunModel[333].setRotationPoint(-35.5F, -24.75F, -2F);

        gunModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 405
        gunModel[334].setRotationPoint(-35.5F, -24.5F, -2F);

        gunModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 406
        gunModel[335].setRotationPoint(-35.5F, -23.5F, -2F);

        gunModel[336].addShapeBox(1.5F, 2.5F, 0F, 1, 2, 4, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 319
        gunModel[336].setRotationPoint(24F, -20F, -2F);
        gunModel[336].rotateAngleZ = 0.20943951F;

        gunModel[337].addShapeBox(2.5F, 2.5F, 0F, 1, 2, 4, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, -0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F); // Box 320
        gunModel[337].setRotationPoint(24F, -20F, -2F);
        gunModel[337].rotateAngleZ = 0.20943951F;

        gunModel[338].addShapeBox(3.5F, 2.5F, 0.5F, 1, 2, 3, 0F, 0F, 0F, -0.125F, -0.625F, 0F, -1F, -0.625F, 0F, -1F, 0F, 0F, -0.125F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F); // Box 321
        gunModel[338].setRotationPoint(24F, -20F, -2F);
        gunModel[338].rotateAngleZ = 0.20943951F;

        gunModel[339].addShapeBox(3.5F, 4.5F, 0.5F, 1, 6, 3, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, 0.5F); // Box 322
        gunModel[339].setRotationPoint(24F, -20F, -2F);
        gunModel[339].rotateAngleZ = 0.20943951F;

        gunModel[340].addShapeBox(2.5F, 4.5F, 0F, 1, 6, 4, 0F, -0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.5F); // Box 323
        gunModel[340].setRotationPoint(24F, -20F, -2F);
        gunModel[340].rotateAngleZ = 0.20943951F;

        gunModel[341].addShapeBox(1.5F, 4.5F, 0F, 1, 6, 4, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 324
        gunModel[341].setRotationPoint(24F, -20F, -2F);
        gunModel[341].rotateAngleZ = 0.20943951F;

        gunModel[342].addShapeBox(1.5F, 10.5F, 0F, 1, 3, 4, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 325
        gunModel[342].setRotationPoint(24F, -20F, -2F);
        gunModel[342].rotateAngleZ = 0.20943951F;

        gunModel[343].addShapeBox(2.5F, 10.5F, 0F, 1, 3, 4, 0F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.5F); // Box 326
        gunModel[343].setRotationPoint(24F, -20F, -2F);
        gunModel[343].rotateAngleZ = 0.20943951F;

        gunModel[344].addShapeBox(3.75F, 10.5F, 0.5F, 1, 3, 3, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.5F); // Box 327
        gunModel[344].setRotationPoint(24F, -20F, -2F);
        gunModel[344].rotateAngleZ = 0.20943951F;

        gunModel[345].addShapeBox(-0.75F, 10.5F, 0.5F, 1, 3, 3, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.75F); // Box 328
        gunModel[345].setRotationPoint(24F, -20F, -2F);
        gunModel[345].rotateAngleZ = 0.20943951F;

        gunModel[346].addShapeBox(0.5F, 10.5F, 0F, 1, 3, 4, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0F); // Box 329
        gunModel[346].setRotationPoint(24F, -20F, -2F);
        gunModel[346].rotateAngleZ = 0.20943951F;

        gunModel[347].addShapeBox(0.5F, 4.5F, 0F, 1, 6, 4, 0F, 0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0F); // Box 330
        gunModel[347].setRotationPoint(24F, -20F, -2F);
        gunModel[347].rotateAngleZ = 0.20943951F;

        gunModel[348].addShapeBox(0.5F, 2.5F, 0F, 1, 2, 4, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F); // Box 331
        gunModel[348].setRotationPoint(24F, -20F, -2F);
        gunModel[348].rotateAngleZ = 0.20943951F;

        gunModel[349].addShapeBox(-0.5F, 2.5F, 0.5F, 1, 2, 3, 0F, -0.625F, 0F, -1F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.625F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F); // Box 332
        gunModel[349].setRotationPoint(24F, -20F, -2F);
        gunModel[349].rotateAngleZ = 0.20943951F;

        gunModel[350].addShapeBox(-0.5F, 4.5F, 0.5F, 1, 6, 3, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, 0F, 0F, -0.75F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F); // Box 333
        gunModel[350].setRotationPoint(24F, -20F, -2F);
        gunModel[350].rotateAngleZ = 0.20943951F;

        gunModel[351].addShapeBox(-0.5F, 13.5F, 0.5F, 1, 2, 3, 0F, 0F, 0F, -0.75F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F); // Box 334
        gunModel[351].setRotationPoint(24F, -20F, -2F);
        gunModel[351].rotateAngleZ = 0.20943951F;

        gunModel[352].addShapeBox(0.5F, 13.5F, 0F, 1, 2, 4, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F); // Box 335
        gunModel[352].setRotationPoint(24F, -20F, -2F);
        gunModel[352].rotateAngleZ = 0.20943951F;

        gunModel[353].addShapeBox(1.5F, 13.5F, 0F, 1, 2, 4, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 336
        gunModel[353].setRotationPoint(24F, -20F, -2F);
        gunModel[353].rotateAngleZ = 0.20943951F;

        gunModel[354].addShapeBox(2.5F, 13.5F, 0F, 1, 2, 4, 0F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F); // Box 337
        gunModel[354].setRotationPoint(24F, -20F, -2F);
        gunModel[354].rotateAngleZ = 0.20943951F;

        gunModel[355].addShapeBox(3.5F, 13.5F, 0.5F, 1, 2, 3, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, 0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F); // Box 338
        gunModel[355].setRotationPoint(24F, -20F, -2F);
        gunModel[355].rotateAngleZ = 0.20943951F;

        gunModel[356].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Box 248
        gunModel[356].setRotationPoint(-5.25F, -31.75F, -2F);

        gunModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 246
        gunModel[357].setRotationPoint(-3.5F, -31.5F, -2F);

        gunModel[358].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, 0F, 1F, 0F, -1.25F, 1F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1F, 0F, 0F, -1F, -0.875F, 0F, -1F, 0F, -0.49F, -1F, 0F); // Box 257
        gunModel[358].setRotationPoint(-1F, -29.5F, -3F);

        gunModel[359].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 1F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, -0.875F, -0.49F, -1F, 0F, -0.49F, -1F, 0F, 0F, -1F, 0F); // Box 258
        gunModel[359].setRotationPoint(11F, -29.5F, -3F);


        ammoModel = new ModelRendererTurbo[23];
        ammoModel[0] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 354
        ammoModel[1] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 355
        ammoModel[2] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 356
        ammoModel[3] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 357
        ammoModel[4] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 358
        ammoModel[5] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 359
        ammoModel[6] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 360
        ammoModel[7] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 361
        ammoModel[8] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 362
        ammoModel[9] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 363
        ammoModel[10] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 364
        ammoModel[11] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 365
        ammoModel[12] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 366
        ammoModel[13] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 367
        ammoModel[14] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 368
        ammoModel[15] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 369
        ammoModel[16] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 370
        ammoModel[17] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 371
        ammoModel[18] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 372
        ammoModel[19] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Box 373
        ammoModel[20] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 374
        ammoModel[21] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 375
        ammoModel[22] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 376

        ammoModel[0].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 354
        ammoModel[0].setRotationPoint(2F, 8F, -1.5F);

        ammoModel[1].addShapeBox(0F, 0F, 0F, 4, 29, 1, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 355
        ammoModel[1].setRotationPoint(2F, -20F, -2F);

        ammoModel[2].addShapeBox(0F, 0F, 0F, 1, 29, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
        ammoModel[2].setRotationPoint(7F, -20F, -2F);

        ammoModel[3].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 357
        ammoModel[3].setRotationPoint(5F, 5F, -2F);

        ammoModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 358
        ammoModel[4].setRotationPoint(5F, 2F, -2F);

        ammoModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 359
        ammoModel[5].setRotationPoint(5F, -1F, -2F);

        ammoModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 360
        ammoModel[6].setRotationPoint(5F, -7F, -2F);

        ammoModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 361
        ammoModel[7].setRotationPoint(5F, -4F, -2F);

        ammoModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 362
        ammoModel[8].setRotationPoint(5F, -13F, -2F);

        ammoModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 363
        ammoModel[9].setRotationPoint(5F, -10F, -2F);

        ammoModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 364
        ammoModel[10].setRotationPoint(5F, -20F, -2F);

        ammoModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 365
        ammoModel[11].setRotationPoint(5F, -16F, -2F);

        ammoModel[12].addShapeBox(0F, 0F, 0F, 2, 23, 4, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 366
        ammoModel[12].setRotationPoint(5F, -18F, -2F);

        ammoModel[13].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, -1F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 367
        ammoModel[13].setRotationPoint(2F, -22F, -2F);

        ammoModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F); // Box 368
        ammoModel[14].setRotationPoint(2F, -22.5F, -2F);

        ammoModel[15].addShapeBox(0F, 0F, 0F, 4, 29, 1, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 369
        ammoModel[15].setRotationPoint(2F, -20F, 1F);

        ammoModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 370
        ammoModel[16].setRotationPoint(5F, -20F, 1F);

        ammoModel[17].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, -0.5F, -0.75F, -0.5F, -1.5F, -0.75F, -0.5F, -1.5F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 371
        ammoModel[17].setRotationPoint(2F, -22F, 1F);

        ammoModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 372
        ammoModel[18].setRotationPoint(2F, -22.5F, 1F);

        ammoModel[19].addShapeBox(0F, 0F, 0F, 1, 29, 4, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 373
        ammoModel[19].setRotationPoint(2F, -20F, -2F);

        ammoModel[20].addShapeBox(0F, 0F, 0F, 1, 29, 4, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 374
        ammoModel[20].setRotationPoint(8F, -20F, -2F);

        ammoModel[21].addShapeBox(0F, 0F, 0F, 1, 29, 3, 0F, 0F, -0.25F, 0F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, 0F, 0F, 0F); // Box 375
        ammoModel[21].setRotationPoint(8F, -20F, -1.5F);

        ammoModel[22].addShapeBox(0F, 0F, 0F, 1, 19, 3, 0F, -0.375F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.375F, -0.25F, -0.75F, -0.375F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.375F, 0F, -0.75F); // Box 376
        ammoModel[22].setRotationPoint(2F, -12F, -1.5F);


        extraAmmoModel = new ModelRendererTurbo[23];
        extraAmmoModel[0] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 354
        extraAmmoModel[1] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 355
        extraAmmoModel[2] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 356
        extraAmmoModel[3] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 357
        extraAmmoModel[4] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 358
        extraAmmoModel[5] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 359
        extraAmmoModel[6] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 360
        extraAmmoModel[7] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 361
        extraAmmoModel[8] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 362
        extraAmmoModel[9] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 363
        extraAmmoModel[10] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 364
        extraAmmoModel[11] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 365
        extraAmmoModel[12] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 366
        extraAmmoModel[13] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 367
        extraAmmoModel[14] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 368
        extraAmmoModel[15] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 369
        extraAmmoModel[16] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 370
        extraAmmoModel[17] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 371
        extraAmmoModel[18] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 372
        extraAmmoModel[19] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Box 373
        extraAmmoModel[20] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 374
        extraAmmoModel[21] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 375
        extraAmmoModel[22] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 376

        extraAmmoModel[0].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 354
        extraAmmoModel[0].setRotationPoint(2F, 8F, -1.5F);

        extraAmmoModel[1].addShapeBox(0F, 0F, 0F, 4, 29, 1, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 355
        extraAmmoModel[1].setRotationPoint(2F, -20F, -2F);

        extraAmmoModel[2].addShapeBox(0F, 0F, 0F, 1, 29, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
        extraAmmoModel[2].setRotationPoint(7F, -20F, -2F);

        extraAmmoModel[3].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 357
        extraAmmoModel[3].setRotationPoint(5F, 5F, -2F);

        extraAmmoModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 358
        extraAmmoModel[4].setRotationPoint(5F, 2F, -2F);

        extraAmmoModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 359
        extraAmmoModel[5].setRotationPoint(5F, -1F, -2F);

        extraAmmoModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 360
        extraAmmoModel[6].setRotationPoint(5F, -7F, -2F);

        extraAmmoModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 361
        extraAmmoModel[7].setRotationPoint(5F, -4F, -2F);

        extraAmmoModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 362
        extraAmmoModel[8].setRotationPoint(5F, -13F, -2F);

        extraAmmoModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 363
        extraAmmoModel[9].setRotationPoint(5F, -10F, -2F);

        extraAmmoModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 364
        extraAmmoModel[10].setRotationPoint(5F, -20F, -2F);

        extraAmmoModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 365
        extraAmmoModel[11].setRotationPoint(5F, -16F, -2F);

        extraAmmoModel[12].addShapeBox(0F, 0F, 0F, 2, 23, 4, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 366
        extraAmmoModel[12].setRotationPoint(5F, -18F, -2F);

        extraAmmoModel[13].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, -1F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 367
        extraAmmoModel[13].setRotationPoint(2F, -22F, -2F);

        extraAmmoModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F); // Box 368
        extraAmmoModel[14].setRotationPoint(2F, -22.5F, -2F);

        extraAmmoModel[15].addShapeBox(0F, 0F, 0F, 4, 29, 1, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 369
        extraAmmoModel[15].setRotationPoint(2F, -20F, 1F);

        extraAmmoModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 370
        extraAmmoModel[16].setRotationPoint(5F, -20F, 1F);

        extraAmmoModel[17].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, -0.5F, -0.75F, -0.5F, -1.5F, -0.75F, -0.5F, -1.5F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 371
        extraAmmoModel[17].setRotationPoint(2F, -22F, 1F);

        extraAmmoModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 372
        extraAmmoModel[18].setRotationPoint(2F, -22.5F, 1F);

        extraAmmoModel[19].addShapeBox(0F, 0F, 0F, 1, 29, 4, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 373
        extraAmmoModel[19].setRotationPoint(2F, -20F, -2F);

        extraAmmoModel[20].addShapeBox(0F, 0F, 0F, 1, 29, 4, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 374
        extraAmmoModel[20].setRotationPoint(8F, -20F, -2F);

        extraAmmoModel[21].addShapeBox(0F, 0F, 0F, 1, 29, 3, 0F, 0F, -0.25F, 0F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, 0F, 0F, 0F); // Box 375
        extraAmmoModel[21].setRotationPoint(8F, -20F, -1.5F);

        extraAmmoModel[22].addShapeBox(0F, 0F, 0F, 1, 19, 3, 0F, -0.375F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.375F, -0.25F, -0.75F, -0.375F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.375F, 0F, -0.75F); // Box 376
        extraAmmoModel[22].setRotationPoint(2F, -12F, -1.5F);


        slideModel = new ModelRendererTurbo[28];
        slideModel[0] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 137
        slideModel[1] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 138
        slideModel[2] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 139
        slideModel[3] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 140
        slideModel[4] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 141
        slideModel[5] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 143
        slideModel[6] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 146
        slideModel[7] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 147
        slideModel[8] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 148
        slideModel[9] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 149
        slideModel[10] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 172
        slideModel[11] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 175
        slideModel[12] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 195
        slideModel[13] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 196
        slideModel[14] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 197
        slideModel[15] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 144
        slideModel[16] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 377
        slideModel[17] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 378
        slideModel[18] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 379
        slideModel[19] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 380
        slideModel[20] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 381
        slideModel[21] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 382
        slideModel[22] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 383
        slideModel[23] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 384
        slideModel[24] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 385
        slideModel[25] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 386
        slideModel[26] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 172
        slideModel[27] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 172

        slideModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 137
        slideModel[0].setRotationPoint(10F, -27F, -2.5F);

        slideModel[1].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 138
        slideModel[1].setRotationPoint(19F, -27F, -2.5F);

        slideModel[2].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F); // Box 139
        slideModel[2].setRotationPoint(19F, -29F, -2.5F);

        slideModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 140
        slideModel[3].setRotationPoint(10F, -29F, -2.5F);

        slideModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0.01F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
        slideModel[4].setRotationPoint(10F, -29F, 1.5F);

        slideModel[5].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 143
        slideModel[5].setRotationPoint(11F, -29F, 1.5F);

        slideModel[6].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 146
        slideModel[6].setRotationPoint(2F, -29.5F, -1.5F);

        slideModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
        slideModel[7].setRotationPoint(2F, -27F, -2.5F);

        slideModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.26F, 0F, 0.5F, 0.26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
        slideModel[8].setRotationPoint(2F, -29F, -2.5F);

        slideModel[9].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 149
        slideModel[9].setRotationPoint(2F, -29.5F, 0.5F);

        slideModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 172
        slideModel[10].setRotationPoint(11F, -29.5F, -1.5F);

        slideModel[11].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 175
        slideModel[11].setRotationPoint(11F, -29F, -1.5F);

        slideModel[12].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F); // Box 195
        slideModel[12].setRotationPoint(11F, -29F, -2.5F);

        slideModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, -0.5F, -0.875F, -0.75F, 0F, -0.875F, -0.75F, 0F, -0.875F, -1F, -0.5F, -0.875F, -1F); // Box 196
        slideModel[13].setRotationPoint(18.5F, -27.75F, -3F);

        slideModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, -0.875F, -0.75F, -0.5F, -0.875F, -0.75F, -0.5F, -0.875F, -1F, 0F, -0.875F, -1F); // Box 197
        slideModel[14].setRotationPoint(10.5F, -27.75F, -3F);

        slideModel[15].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
        slideModel[15].setRotationPoint(3F, -27F, 1.5F);

        slideModel[16].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 377
        slideModel[16].setRotationPoint(3F, -29F, -2.5F);

        slideModel[17].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 378
        slideModel[17].setRotationPoint(3F, -27F, -2.5F);

        slideModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 379
        slideModel[18].setRotationPoint(8F, -29F, -2.5F);

        slideModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 380
        slideModel[19].setRotationPoint(8F, -27F, -2.5F);

        slideModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 381
        slideModel[20].setRotationPoint(9.5F, -27F, -2.5F);

        slideModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -0.5F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -1F, 0.05F, -0.5F, -1F, 0.05F); // Box 382
        slideModel[21].setRotationPoint(9.5F, -27.75F, -3F);

        slideModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -1F, -0.8F, -0.5F, -1F, -0.8F, -0.5F, -1F, 0.05F, 0F, -1F, 0.05F); // Box 383
        slideModel[22].setRotationPoint(7.5F, -27.75F, -3F);

        slideModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 384
        slideModel[23].setRotationPoint(7.5F, -27F, -2.5F);

        slideModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 385
        slideModel[24].setRotationPoint(8F, -29F, -2.5F);

        slideModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 386
        slideModel[25].setRotationPoint(8F, -27F, -2.5F);

        slideModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 172
        slideModel[26].setRotationPoint(12F, -29.5F, -1.5F);

        slideModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 172
        slideModel[27].setRotationPoint(12F, -29.5F, 0.5F);


        pumpModel = new ModelRendererTurbo[12];
        pumpModel[0] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 173
        pumpModel[1] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 174
        pumpModel[2] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 176
        pumpModel[3] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 177
        pumpModel[4] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 180
        pumpModel[5] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 181
        pumpModel[6] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 182
        pumpModel[7] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 190
        pumpModel[8] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 191
        pumpModel[9] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 192
        pumpModel[10] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 193
        pumpModel[11] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 194

        pumpModel[0].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
        pumpModel[0].setRotationPoint(-3F, -30.5F, -1F);

        pumpModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
        pumpModel[1].setRotationPoint(13F, -30.5F, -1F);

        pumpModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
        pumpModel[2].setRotationPoint(-5F, -30.5F, -1F);

        pumpModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.625F, 0F, 0.25F, -0.625F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F); // Box 177
        pumpModel[3].setRotationPoint(-10F, -30.5F, -1.5F);

        pumpModel[4].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.5F, 0F, 0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 180
        pumpModel[4].setRotationPoint(-10F, -31.5F, -3F);

        pumpModel[5].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -1F, 0.4F, 0F, -1F, 0.4F, 0F, 0F, 0.4F, -0.5F, 0F, 0.4F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 181
        pumpModel[5].setRotationPoint(-10F, -31.5F, -3.5F);

        pumpModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0.25F, -0.625F, 0F, 0.25F, -0.625F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 182
        pumpModel[6].setRotationPoint(-10F, -30.5F, -0.5F);

        pumpModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
        pumpModel[7].setRotationPoint(-9F, -30.5F, -1F);

        pumpModel[8].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 191
        pumpModel[8].setRotationPoint(-10F, -31.5F, -2.5F);

        pumpModel[9].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0.4F, -0.5F, 0F, 0.4F, -0.5F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
        pumpModel[9].setRotationPoint(-10F, -31.5F, 2F);

        pumpModel[10].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0.4F, -0.5F, 0F, 0.4F, -0.5F, -1F, 0.4F, 0F, -1F, 0.4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 193
        pumpModel[10].setRotationPoint(-10F, -31.5F, 2.5F);

        pumpModel[11].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
        pumpModel[11].setRotationPoint(-10F, -31.5F, 1.5F);


        barrelAttachPoint = new Vector3f(38F / 16F, 26F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(22F / 16F, 28F / 16F, -4F / 16F);
        scopeAttachPoint = new Vector3f(10F / 16F, 31F / 16F, 0F / 16F);

        gunSlideDistance = 0.2F;
        animationType = EnumAnimationType.PISTOL_CLIP;
        rotateGunHorizontal = 15.0F;
        tiltGun = 30.0F;
        translateGun = new Vector3f(0.0F, -0.0625F, -0.1875F);
        translateClip = new Vector3f(0.0F, -0.625F, 0.0F);
        flashScale = 0.4F;
        muzzleFlashPoint = new Vector3f(1.7F, 0.65F, 0.0F);
        translateAll(0.0F, 0.0F, 0.0F);
        hasFlash = true;
        hasArms = true;
        leftArmPos = new Vector3f(-0.05F, -0.2F, 0.0F);
        leftArmRot = new Vector3f(80.0F, 55.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.2F, -0.65F, 0.1F);
        leftArmReloadRot = new Vector3f(80.0F, 60.0F, 0.0F);
        rightArmPos = new Vector3f(0.21F, -0.5F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmReloadPos = new Vector3f(0.21F, -0.5F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        rightHandAmmo = false;
        leftHandAmmo = false;
        fancyStance = true;
        stanceTranslate = new Vector3f(0.4D, -0.1D, 0.2D);
        stanceRotate = new Vector3f(45.0F, 0.0F, 1.0F);
        casingAttachPoint = new Vector3f(0.1F, 1.5F, 0.0F);
        casingAnimDistance = new Vector3f(0.0F, 3.0F, 7.75F);
        casingAnimSpread = new Vector3f(3.0F, 5.0F, 3.0F);
        casingAnimTime = 6;
        casingRotateVector = new Vector3f(0.1F, 0.0F, 0.1F);
        caseScale = 0.2F;
        casingDelay = 0;
        thirdPersonOffset = new Vector3f(-0.21F, -0.08F, 0.0F);

        zoomOffsetY = -0.01F;
        flipAll();
        crouchZoom = -0.05F;
        zoomOffset = 0.2F;
        gunOffset = -0.6F;
        ShakeDistance = 0.2F;
    }
}