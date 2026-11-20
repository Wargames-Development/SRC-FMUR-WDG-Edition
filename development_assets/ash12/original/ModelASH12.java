//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ASH12
// Model Creator: 
// Created on: 21.01.2021 - 11:57:01
// Last changed on: 21.01.2021 - 11:57:01

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelASH12 extends ModelGun //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public ModelASH12() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[337];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        gunModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 1
        gunModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 2
        gunModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 3
        gunModel[4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 4
        gunModel[5] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 5
        gunModel[6] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 6
        gunModel[7] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 7
        gunModel[8] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 8
        gunModel[9] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 9
        gunModel[10] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 10
        gunModel[11] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 11
        gunModel[12] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 12
        gunModel[13] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 14
        gunModel[14] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 15
        gunModel[15] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 17
        gunModel[16] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 18
        gunModel[17] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 20
        gunModel[18] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 21
        gunModel[19] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 22
        gunModel[20] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 23
        gunModel[21] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 24
        gunModel[22] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 25
        gunModel[23] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 26
        gunModel[24] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 27
        gunModel[25] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 28
        gunModel[26] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 29
        gunModel[27] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 30
        gunModel[28] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 31
        gunModel[29] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 32
        gunModel[30] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 33
        gunModel[31] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 34
        gunModel[32] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 35
        gunModel[33] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 36
        gunModel[34] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 37
        gunModel[35] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 38
        gunModel[36] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 39
        gunModel[37] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 40
        gunModel[38] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 41
        gunModel[39] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 42
        gunModel[40] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 43
        gunModel[41] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 44
        gunModel[42] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 45
        gunModel[43] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 46
        gunModel[44] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 47
        gunModel[45] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 48
        gunModel[46] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 49
        gunModel[47] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 50
        gunModel[48] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 51
        gunModel[49] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 52
        gunModel[50] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 53
        gunModel[51] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 56
        gunModel[52] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 57
        gunModel[53] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 59
        gunModel[54] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 62
        gunModel[55] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 63
        gunModel[56] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 64
        gunModel[57] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 65
        gunModel[58] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 66
        gunModel[59] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 67
        gunModel[60] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 68
        gunModel[61] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 69
        gunModel[62] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 70
        gunModel[63] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 71
        gunModel[64] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 72
        gunModel[65] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 73
        gunModel[66] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 74
        gunModel[67] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 75
        gunModel[68] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 76
        gunModel[69] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 77
        gunModel[70] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 78
        gunModel[71] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 79
        gunModel[72] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 80
        gunModel[73] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 81
        gunModel[74] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 82
        gunModel[75] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 83
        gunModel[76] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 84
        gunModel[77] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 85
        gunModel[78] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 86
        gunModel[79] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 87
        gunModel[80] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 88
        gunModel[81] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 89
        gunModel[82] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 90
        gunModel[83] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 91
        gunModel[84] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 92
        gunModel[85] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 93
        gunModel[86] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 94
        gunModel[87] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 95
        gunModel[88] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 96
        gunModel[89] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 97
        gunModel[90] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 98
        gunModel[91] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 99
        gunModel[92] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 100
        gunModel[93] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 101
        gunModel[94] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 102
        gunModel[95] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 103
        gunModel[96] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 104
        gunModel[97] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 105
        gunModel[98] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 106
        gunModel[99] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 107
        gunModel[100] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 108
        gunModel[101] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 109
        gunModel[102] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 110
        gunModel[103] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 111
        gunModel[104] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 112
        gunModel[105] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 113
        gunModel[106] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 114
        gunModel[107] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 115
        gunModel[108] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 116
        gunModel[109] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 117
        gunModel[110] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 118
        gunModel[111] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 119
        gunModel[112] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 120
        gunModel[113] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 121
        gunModel[114] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 123
        gunModel[115] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 124
        gunModel[116] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 125
        gunModel[117] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 126
        gunModel[118] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 127
        gunModel[119] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 128
        gunModel[120] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 129
        gunModel[121] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 130
        gunModel[122] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 131
        gunModel[123] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 132
        gunModel[124] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 133
        gunModel[125] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 134
        gunModel[126] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 135
        gunModel[127] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 136
        gunModel[128] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 137
        gunModel[129] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 138
        gunModel[130] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 139
        gunModel[131] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 140
        gunModel[132] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 141
        gunModel[133] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 142
        gunModel[134] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 143
        gunModel[135] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 144
        gunModel[136] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 145
        gunModel[137] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 146
        gunModel[138] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 147
        gunModel[139] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 148
        gunModel[140] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 149
        gunModel[141] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 150
        gunModel[142] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 151
        gunModel[143] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 152
        gunModel[144] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 153
        gunModel[145] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 154
        gunModel[146] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 155
        gunModel[147] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 156
        gunModel[148] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 158
        gunModel[149] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 159
        gunModel[150] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 160
        gunModel[151] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 161
        gunModel[152] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 162
        gunModel[153] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 163
        gunModel[154] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 164
        gunModel[155] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 165
        gunModel[156] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 184
        gunModel[157] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 185
        gunModel[158] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 186
        gunModel[159] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 187
        gunModel[160] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 188
        gunModel[161] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 189
        gunModel[162] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 190
        gunModel[163] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 191
        gunModel[164] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 192
        gunModel[165] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 193
        gunModel[166] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 194
        gunModel[167] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 195
        gunModel[168] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 196
        gunModel[169] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 199
        gunModel[170] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 200
        gunModel[171] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 201
        gunModel[172] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 202
        gunModel[173] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 285
        gunModel[174] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 287
        gunModel[175] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 288
        gunModel[176] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 289
        gunModel[177] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 290
        gunModel[178] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 291
        gunModel[179] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 292
        gunModel[180] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 293
        gunModel[181] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 294
        gunModel[182] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 327
        gunModel[183] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 332
        gunModel[184] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 333
        gunModel[185] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 334
        gunModel[186] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 335
        gunModel[187] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 363
        gunModel[188] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 378
        gunModel[189] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 379
        gunModel[190] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 380
        gunModel[191] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 381
        gunModel[192] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 382
        gunModel[193] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 383
        gunModel[194] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 384
        gunModel[195] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 385
        gunModel[196] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 386
        gunModel[197] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 387
        gunModel[198] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 388
        gunModel[199] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 430
        gunModel[200] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 587
        gunModel[201] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 203
        gunModel[202] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 204
        gunModel[203] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 205
        gunModel[204] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 206
        gunModel[205] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 207
        gunModel[206] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 208
        gunModel[207] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 210
        gunModel[208] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 211
        gunModel[209] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 212
        gunModel[210] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 213
        gunModel[211] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 214
        gunModel[212] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 221
        gunModel[213] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 222
        gunModel[214] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 223
        gunModel[215] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 224
        gunModel[216] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 225
        gunModel[217] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 226
        gunModel[218] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 227
        gunModel[219] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 228
        gunModel[220] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 229
        gunModel[221] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 231
        gunModel[222] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 232
        gunModel[223] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 233
        gunModel[224] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 234
        gunModel[225] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 236
        gunModel[226] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 238
        gunModel[227] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 242
        gunModel[228] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 244
        gunModel[229] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 245
        gunModel[230] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 246
        gunModel[231] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 247
        gunModel[232] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 248
        gunModel[233] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 249
        gunModel[234] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 250
        gunModel[235] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 251
        gunModel[236] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 252
        gunModel[237] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 253
        gunModel[238] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 254
        gunModel[239] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 255
        gunModel[240] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Box 256
        gunModel[241] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 257
        gunModel[242] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 258
        gunModel[243] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 263
        gunModel[244] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 76
        gunModel[245] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 77
        gunModel[246] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 78
        gunModel[247] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 79
        gunModel[248] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 80
        gunModel[249] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 265
        gunModel[250] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 266
        gunModel[251] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 267
        gunModel[252] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 268
        gunModel[253] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 269
        gunModel[254] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 270
        gunModel[255] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 271
        gunModel[256] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 272
        gunModel[257] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 275
        gunModel[258] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 276
        gunModel[259] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 277
        gunModel[260] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 278
        gunModel[261] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 279
        gunModel[262] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 280
        gunModel[263] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 281
        gunModel[264] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 282
        gunModel[265] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Box 57
        gunModel[266] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 57
        gunModel[267] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 57
        gunModel[268] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 57
        gunModel[269] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 57
        gunModel[270] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 57
        gunModel[271] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 57
        gunModel[272] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 57
        gunModel[273] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 57
        gunModel[274] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 57
        gunModel[275] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 57
        gunModel[276] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 57
        gunModel[277] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 57
        gunModel[278] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 57
        gunModel[279] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 57
        gunModel[280] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 57
        gunModel[281] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 57
        gunModel[282] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 57
        gunModel[283] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 57
        gunModel[284] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 57
        gunModel[285] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 57
        gunModel[286] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 57
        gunModel[287] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 57
        gunModel[288] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 57
        gunModel[289] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 57
        gunModel[290] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 57
        gunModel[291] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 57
        gunModel[292] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 57
        gunModel[293] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 57
        gunModel[294] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 57
        gunModel[295] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 57
        gunModel[296] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 57
        gunModel[297] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 57
        gunModel[298] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 57
        gunModel[299] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 57
        gunModel[300] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 57
        gunModel[301] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 57
        gunModel[302] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 57
        gunModel[303] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 57
        gunModel[304] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 57
        gunModel[305] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 57
        gunModel[306] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Box 57
        gunModel[307] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 57
        gunModel[308] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 57
        gunModel[309] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 57
        gunModel[310] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 57
        gunModel[311] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Box 57
        gunModel[312] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 57
        gunModel[313] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 57
        gunModel[314] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 57
        gunModel[315] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 57
        gunModel[316] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 57
        gunModel[317] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 57
        gunModel[318] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 57
        gunModel[319] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 57
        gunModel[320] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 57
        gunModel[321] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 57
        gunModel[322] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 57
        gunModel[323] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 57
        gunModel[324] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 57
        gunModel[325] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 57
        gunModel[326] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 203
        gunModel[327] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 263
        gunModel[328] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 57
        gunModel[329] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 57
        gunModel[330] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 57
        gunModel[331] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Box 57
        gunModel[332] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 57
        gunModel[333] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 57
        gunModel[334] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 57
        gunModel[335] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 57
        gunModel[336] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 57

        gunModel[0].addShapeBox(0F, 0F, 0F, 36, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
        gunModel[0].setRotationPoint(-26F, -12F, -3.5F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
        gunModel[1].setRotationPoint(-27F, -12F, -3.5F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 8, 3, 7, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F); // Box 2
        gunModel[2].setRotationPoint(-56F, -10.5F, -3.5F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
        gunModel[3].setRotationPoint(-26F, -8F, -3.5F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 6, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 4
        gunModel[4].setRotationPoint(-46.5F, -10.5F, -3.5F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F); // Box 5
        gunModel[5].setRotationPoint(-48F, -10.5F, -3.5F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0F, 0F); // Box 6
        gunModel[6].setRotationPoint(-37F, -10.5F, -3.5F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 7
        gunModel[7].setRotationPoint(-36.5F, -10.5F, -3.5F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 68, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 8
        gunModel[8].setRotationPoint(-57F, -16F, -3F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
        gunModel[9].setRotationPoint(11F, -14F, -3F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 7, 3, 6, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
        gunModel[10].setRotationPoint(17F, -16F, -3F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 13, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
        gunModel[11].setRotationPoint(11F, -12F, -3F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 12
        gunModel[12].setRotationPoint(24F, -14F, -3F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
        gunModel[13].setRotationPoint(-56F, -17F, -3F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 15
        gunModel[14].setRotationPoint(17F, -17F, -3F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
        gunModel[15].setRotationPoint(14.5F, -13F, -3F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F); // Box 18
        gunModel[16].setRotationPoint(13.5F, -13.5F, -3F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 20
        gunModel[17].setRotationPoint(13.5F, -12.5F, -3F);

        gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 21
        gunModel[18].setRotationPoint(11F, -12.5F, -3F);

        gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F); // Box 22
        gunModel[19].setRotationPoint(11F, -13.5F, -3F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 23
        gunModel[20].setRotationPoint(15.5F, -12.5F, -3F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F); // Box 24
        gunModel[21].setRotationPoint(15.5F, -13.5F, -3F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F); // Box 25
        gunModel[22].setRotationPoint(18F, -13.5F, -3F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 26
        gunModel[23].setRotationPoint(18F, -12.5F, -3F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
        gunModel[24].setRotationPoint(19F, -13F, -3F);

        gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 28
        gunModel[25].setRotationPoint(22.5F, -12.5F, -3F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F); // Box 29
        gunModel[26].setRotationPoint(22.5F, -13.5F, -3F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 30
        gunModel[27].setRotationPoint(20F, -12.5F, -3F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F); // Box 31
        gunModel[28].setRotationPoint(20F, -13.5F, -3F);

        gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 32
        gunModel[29].setRotationPoint(23F, -13F, -3F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 13, 1, 6, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 33
        gunModel[30].setRotationPoint(10.5F, -13F, -3F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
        gunModel[31].setRotationPoint(24F, -17F, 2F);

        gunModel[32].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 35
        gunModel[32].setRotationPoint(24F, -16.5F, -1.5F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
        gunModel[33].setRotationPoint(39F, -17F, -3F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
        gunModel[34].setRotationPoint(33F, -17F, 2F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
        gunModel[35].setRotationPoint(38F, -17F, 2F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0.125F, 0.625F, 0F, 0.125F, 0.625F, 0F, 0.125F, -1.125F, 0F, 0.125F, -1.125F); // Box 39
        gunModel[36].setRotationPoint(29F, -17F, 2F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.625F, 0.875F, 0F, -0.625F, 0.875F, 0F, -0.625F, -1.375F, 0F, -0.625F, -1.375F, 0F, 0.125F, 0.6F, -0.5F, 0.125F, 0.6F, -0.5F, 0.125F, -1.1F, 0F, 0.125F, -1.1F); // Box 40
        gunModel[37].setRotationPoint(28.5F, -16.5F, 2.25F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 1.05F, -0.5F, -0.5F, 1.05F, -0.5F, -0.5F, -1.55F, 0F, -0.5F, -1.55F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 41
        gunModel[38].setRotationPoint(28.5F, -15F, 3.25F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.625F, 0.875F, 0F, -0.625F, 0.875F, 0F, -0.625F, -1.375F, 0F, -0.625F, -1.375F, -0.5F, 0.125F, 0.6F, 0F, 0.125F, 0.6F, 0F, 0.125F, -1.1F, -0.5F, 0.125F, -1.1F); // Box 42
        gunModel[39].setRotationPoint(32.5F, -16.5F, 2.25F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 1.05F, 0F, -0.5F, 1.05F, 0F, -0.5F, -1.55F, -0.5F, -0.5F, -1.55F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 43
        gunModel[40].setRotationPoint(32.5F, -15F, 3.25F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 44
        gunModel[41].setRotationPoint(24F, -14F, 2F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 1.05F, 0F, -0.5F, 1.05F, 0F, -0.5F, -1.55F, -0.5F, -0.5F, -1.55F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 45
        gunModel[42].setRotationPoint(37.5F, -15F, 3.25F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.625F, 0.875F, 0F, -0.625F, 0.875F, 0F, -0.625F, -1.375F, 0F, -0.625F, -1.375F, -0.5F, 0.125F, 0.6F, 0F, 0.125F, 0.6F, 0F, 0.125F, -1.1F, -0.5F, 0.125F, -1.1F); // Box 46
        gunModel[43].setRotationPoint(37.5F, -16.5F, 2.25F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.625F, 0.875F, 0F, -0.625F, 0.875F, 0F, -0.625F, -1.375F, 0F, -0.625F, -1.375F, 0F, 0.125F, 0.6F, -0.5F, 0.125F, 0.6F, -0.5F, 0.125F, -1.1F, 0F, 0.125F, -1.1F); // Box 47
        gunModel[44].setRotationPoint(33.5F, -16.5F, 2.25F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 1.05F, -0.5F, -0.5F, 1.05F, -0.5F, -0.5F, -1.55F, 0F, -0.5F, -1.55F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 48
        gunModel[45].setRotationPoint(33.5F, -15F, 3.25F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F); // Box 49
        gunModel[46].setRotationPoint(23.5F, -15.5F, -3F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.375F, -0.75F, -0.25F, -0.375F, -0.75F, -0.25F, -0.375F, -0.75F, -0.25F, -0.375F, -0.75F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F); // Box 50
        gunModel[47].setRotationPoint(23.5F, -16.5F, -3F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.375F, -0.75F, -0.25F, -0.375F, -0.75F, -0.25F, -0.375F, -0.75F, -0.25F, -0.375F, -0.75F, -0.25F); // Box 51
        gunModel[48].setRotationPoint(23.5F, -14.5F, -3F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 27, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
        gunModel[49].setRotationPoint(13F, -9.5F, -2F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 16, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 53
        gunModel[50].setRotationPoint(24F, -10F, -2.5F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 56
        gunModel[51].setRotationPoint(25F, -14F, 3F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 57
        gunModel[52].setRotationPoint(25F, -14.5F, 3.5F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 56, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
        gunModel[53].setRotationPoint(-16F, -17.5F, -1.5F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 47, 1, 6, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
        gunModel[54].setRotationPoint(-30F, -17F, -3F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 19, 1, 6, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
        gunModel[55].setRotationPoint(-49.5F, -17F, -3F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 64
        gunModel[56].setRotationPoint(-50F, -17F, -3F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 65
        gunModel[57].setRotationPoint(-31F, -17F, -3F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 28, 1, 7, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 66
        gunModel[58].setRotationPoint(-18F, -8F, -3.5F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 67
        gunModel[59].setRotationPoint(-18F, -7.5F, -3.5F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 68
        gunModel[60].setRotationPoint(-36F, -7F, -3.5F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.25F, -0.5F); // Box 69
        gunModel[61].setRotationPoint(-37.5F, -7F, -3.5F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 70
        gunModel[62].setRotationPoint(-46.5F, -7.5F, -3.5F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, -0.5F, 0F, -0.5F); // Box 71
        gunModel[63].setRotationPoint(-48.5F, -7F, -3.5F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 72
        gunModel[64].setRotationPoint(-56F, -7F, -3.5F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 36, 1, 7, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 73
        gunModel[65].setRotationPoint(-26F, -12.5F, -3.5F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 74
        gunModel[66].setRotationPoint(-27F, -12.5F, -3.5F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 30, 1, 7, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 75
        gunModel[67].setRotationPoint(-57F, -11F, -3.5F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0.5F, -0.5F); // Box 76
        gunModel[68].setRotationPoint(-18F, -7.5F, 2.5F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 77
        gunModel[69].setRotationPoint(-36F, -7F, 2.5F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 2F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0.5F, 2F, 0F); // Box 78
        gunModel[70].setRotationPoint(-32F, -6F, -3.5F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -1F, 0F); // Box 79
        gunModel[71].setRotationPoint(-34F, -6F, -3.5F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 80
        gunModel[72].setRotationPoint(-37F, -6F, -3F);

        gunModel[73].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 81
        gunModel[73].setRotationPoint(-56F, -6F, -3F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F); // Box 82
        gunModel[74].setRotationPoint(-39F, -6F, -3F);

        gunModel[75].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 83
        gunModel[75].setRotationPoint(-42F, -6F, -3F);

        gunModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 84
        gunModel[76].setRotationPoint(-45F, -6F, -3F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 85
        gunModel[77].setRotationPoint(-47F, -6F, -3F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 6F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 6F, 0F); // Box 86
        gunModel[78].setRotationPoint(-49F, -6F, -3F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 7, 7, 6, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 87
        gunModel[79].setRotationPoint(-56F, -4F, -3F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0.5F, 2F, -0.5F); // Box 88
        gunModel[80].setRotationPoint(-32F, -6F, 2.5F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F); // Box 89
        gunModel[81].setRotationPoint(-34F, -6F, 2.5F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 34, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 90
        gunModel[82].setRotationPoint(-26F, -12F, 2.5F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
        gunModel[83].setRotationPoint(-27F, -12F, 2.5F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 92
        gunModel[84].setRotationPoint(-36.5F, -10.5F, 2.5F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
        gunModel[85].setRotationPoint(-26F, -8F, 2.5F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
        gunModel[86].setRotationPoint(-48F, -7.5F, -2.5F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
        gunModel[87].setRotationPoint(-56F, -10.5F, -4F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, 0F, -0.5F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F); // Box 96
        gunModel[88].setRotationPoint(-54F, -10.5F, -4F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, -1F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 97
        gunModel[89].setRotationPoint(-55.25F, -10F, -4F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, -0.5F, -1F, 0.25F, -1F, -1F, 0.25F, -1F, -1F, 0.25F, -0.5F, -1F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 98
        gunModel[90].setRotationPoint(-55.25F, -10.5F, -4F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -1F, 0.25F, -1F, -1F, 0.25F, -1F, -1F, 0.25F, -0.5F, -1F, 0.25F); // Box 99
        gunModel[91].setRotationPoint(-55.25F, -9F, -4F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 2, 13, 6, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -2.25F, 0.5F, 0F, 3F, 0.5F, 0F, 3F, 0.5F, 0F, -2.25F, 0.5F, 0F); // Box 100
        gunModel[92].setRotationPoint(-59.25F, -10.5F, -3F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F, 1F, 0F, -0.5F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 1F, 0F, -0.5F, 0.25F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.25F, 0.5F, -0.5F); // Box 101
        gunModel[93].setRotationPoint(-59F, -10.5F, -3.5F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 102
        gunModel[94].setRotationPoint(-59F, -7F, -3.5F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, -0.5F); // Box 103
        gunModel[95].setRotationPoint(-60F, -11F, -3.5F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 5, 18, 5, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2.25F, 0.5F, 0F, 3F, 0.5F, 0F, 3F, 0.5F, 0F, -2.25F, 0.5F, 0F); // Box 104
        gunModel[96].setRotationPoint(-61.25F, -15.5F, -2.5F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -0.25F, 0F, -1F); // Box 105
        gunModel[97].setRotationPoint(-54F, 3F, -3F);

        gunModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, -1F); // Box 106
        gunModel[98].setRotationPoint(-57F, 3F, -3F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0.5F, -5.5F, -1F, 0.5F, -5.5F, -1F, -0.5F, 0F, -1F); // Box 107
        gunModel[99].setRotationPoint(-49F, 3F, -3F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, -0.5F, 0F, -1F); // Box 108
        gunModel[100].setRotationPoint(-47F, -2.5F, -3F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 109
        gunModel[101].setRotationPoint(-45F, -4F, -3F);

        gunModel[102].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 110
        gunModel[102].setRotationPoint(-42F, -5F, -3F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, -0.5F, -0.99F, 0F, -0.5F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F); // Box 111
        gunModel[103].setRotationPoint(-39F, -5F, -3F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
        gunModel[104].setRotationPoint(-60F, -16F, -3.5F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F, 0.25F, -0.25F, -1F, 0.25F, -0.25F, -1F, 0.25F, -0.25F, -1F, 0.25F, -0.25F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 113
        gunModel[105].setRotationPoint(-60F, -17F, -3.5F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 114
        gunModel[106].setRotationPoint(-56F, -12F, -3.5F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 115
        gunModel[107].setRotationPoint(-60F, -12F, -3.5F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 116
        gunModel[108].setRotationPoint(-58F, 3F, -2.5F);

        gunModel[109].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 117
        gunModel[109].setRotationPoint(-62F, -16F, -3F);

        gunModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 118
        gunModel[110].setRotationPoint(-62F, -12F, -3F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 2, 14, 6, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 2.75F, -0.5F, 0F, 2.75F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 119
        gunModel[111].setRotationPoint(-62F, -10.5F, -3F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 120
        gunModel[112].setRotationPoint(-63F, 3F, -3F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, -0.5F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, 0F, -0.5F, -1F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F); // Box 121
        gunModel[113].setRotationPoint(-62F, -17F, -3F);

        gunModel[114].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
        gunModel[114].setRotationPoint(-38F, -10.5F, -3.5F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F); // Box 124
        gunModel[115].setRotationPoint(-38F, -7.5F, -3.5F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 125
        gunModel[116].setRotationPoint(-40.5F, -10.5F, -3.5F);

        gunModel[117].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 126
        gunModel[117].setRotationPoint(-40.5F, -9.5F, -2.5F);

        gunModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
        gunModel[118].setRotationPoint(-39F, -7F, -3.5F);

        gunModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 128
        gunModel[119].setRotationPoint(-39F, -6F, -3.5F);

        gunModel[120].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
        gunModel[120].setRotationPoint(-39F, -8F, -3.5F);

        gunModel[121].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, 0.23F, -0.25F, 0F, 0.23F, -0.25F, 0F, 0.23F, -0.25F, 0F, 0.23F, -0.25F, 0F, 0.23F, -0.25F, 0F, 0.23F, -0.25F, 0F, 0.23F, -0.25F, 0F, 0.23F, -0.25F); // Box 130
        gunModel[121].setRotationPoint(-42F, -7F, -3.5F);

        gunModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0.23F, 0F, -0.25F, 0.23F, 0F, -0.25F, 0.23F, 0F, 0F, 0.23F, 0F, 0F, 0.23F, 0F, -0.25F, 0.23F, 0F, -0.25F, 0.23F, 0F, 0F, 0.23F, 0F); // Box 131
        gunModel[122].setRotationPoint(-42F, -7F, -4.5F);

        gunModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0.25F, 0.23F, 0F, -0.75F, 0.23F, -1.25F, -0.75F, 0.23F, -1.25F, 0.25F, 0.23F, 0F, 0.25F, 0.23F, 0F, -0.75F, 0.23F, -1.25F, -0.75F, 0.23F, -1.25F, 0.25F, 0.23F, 0F); // Box 132
        gunModel[123].setRotationPoint(-41F, -7F, -4.5F);

        gunModel[124].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 133
        gunModel[124].setRotationPoint(9F, -12F, -3.5F);

        gunModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
        gunModel[125].setRotationPoint(8F, -12F, 2.5F);

        gunModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 135
        gunModel[126].setRotationPoint(8F, -9F, 2.5F);

        gunModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F); // Box 136
        gunModel[127].setRotationPoint(8F, -10.5F, 2.5F);

        gunModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 137
        gunModel[128].setRotationPoint(8F, -9.5F, 2.5F);

        gunModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 138
        gunModel[129].setRotationPoint(8F, -9.5F, 2.5F);

        gunModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F); // Box 139
        gunModel[130].setRotationPoint(8F, -10.5F, 2.5F);

        gunModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F); // Box 140
        gunModel[131].setRotationPoint(8F, -10F, -3F);

        gunModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
        gunModel[132].setRotationPoint(10F, -8F, -1.5F);

        gunModel[133].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 142
        gunModel[133].setRotationPoint(10F, -7F, -1.5F);

        gunModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 1.5F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, -0.5F, 0F); // Box 143
        gunModel[134].setRotationPoint(10F, -3F, -1.5F);

        gunModel[135].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
        gunModel[135].setRotationPoint(2F, -2F, -1.5F);

        gunModel[136].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 145
        gunModel[136].setRotationPoint(-4F, -6F, -2.5F);

        gunModel[137].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F, 2F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 146
        gunModel[137].setRotationPoint(-5F, -7F, -2.5F);

        gunModel[138].addShapeBox(0F, 0F, 0F, 5, 8, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 4F, 0F, -0.25F, -3F, 4F, -0.25F, -3F, 4F, -0.25F, 4F, 0F, -0.25F); // Box 147
        gunModel[138].setRotationPoint(-4F, -3F, -2.5F);

        gunModel[139].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, -1F, -0.25F); // Box 148
        gunModel[139].setRotationPoint(-8F, 5F, -2.5F);

        gunModel[140].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 149
        gunModel[140].setRotationPoint(-5F, -6F, -2.5F);

        gunModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 150
        gunModel[141].setRotationPoint(5F, -7F, -1F);

        gunModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 151
        gunModel[142].setRotationPoint(4.5F, -5F, -1F);

        gunModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0.25F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.5F, 0.25F, 0F); // Box 152
        gunModel[143].setRotationPoint(4.5F, -3F, -1F);

        gunModel[144].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
        gunModel[144].setRotationPoint(11F, -16F, -3F);

        gunModel[145].addShapeBox(0F, 0F, 0F, 20, 4, 6, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F); // Box 154
        gunModel[145].setRotationPoint(-57F, -14F, -3F);

        gunModel[146].addShapeBox(0F, 0F, 0F, 33, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
        gunModel[146].setRotationPoint(-57F, -15F, -3F);

        gunModel[147].addShapeBox(0F, 0F, 0F, 41, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
        gunModel[147].setRotationPoint(-24F, -15F, 1F);

        gunModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F); // Box 158
        gunModel[148].setRotationPoint(16F, -15.5F, -3F);

        gunModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 159
        gunModel[149].setRotationPoint(16F, -14.5F, -3F);

        gunModel[150].addShapeBox(0F, 0F, 0F, 33, 1, 6, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 160
        gunModel[150].setRotationPoint(-57F, -14.5F, -3F);

        gunModel[151].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 161
        gunModel[151].setRotationPoint(-19F, -14.5F, -3F);

        gunModel[152].addShapeBox(0F, 0F, 0F, 33, 1, 6, 0F, -0.25F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
        gunModel[152].setRotationPoint(-57F, -16F, -3F);

        gunModel[153].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
        gunModel[153].setRotationPoint(-19F, -16F, -3F);

        gunModel[154].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 164
        gunModel[154].setRotationPoint(-24F, -14.5F, 1F);

        gunModel[155].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
        gunModel[155].setRotationPoint(-24F, -16F, 1F);

        gunModel[156].addShapeBox(0F, 0F, 0F, 1, 8, 5, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 4F, 0F, -1F, -4F, 0F, -0.25F, -4F, 0F, -0.25F, 4F, 0F, -1F); // Box 184
        gunModel[156].setRotationPoint(-5F, -3F, -2.5F);

        gunModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F); // Box 185
        gunModel[157].setRotationPoint(-5F, -4F, -2.5F);

        gunModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 1F, 0F, -1F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F); // Box 186
        gunModel[158].setRotationPoint(-5F, -6F, -2.5F);

        gunModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 2F, 0F, -1F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F); // Box 187
        gunModel[159].setRotationPoint(-6F, -7F, -2.5F);

        gunModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -1F, 0F, -0.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.25F); // Box 188
        gunModel[160].setRotationPoint(2F, -7F, -2.5F);

        gunModel[161].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.25F); // Box 189
        gunModel[161].setRotationPoint(2F, -6F, -2.5F);

        gunModel[162].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 190
        gunModel[162].setRotationPoint(-4F, -1F, -2.5F);

        gunModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.25F, 0F, -0.5F, -1F, -0.5F, -0.99F, -1F, -0.5F, -0.99F, -1F, 0F, -0.5F, -1F); // Box 191
        gunModel[163].setRotationPoint(2F, -1F, -2.5F);

        gunModel[164].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 3F, 0F, -0.25F, -3F, 0F, -1F, -3F, 0F, -1F, 3F, 0F, -0.25F); // Box 192
        gunModel[164].setRotationPoint(1F, -3F, -2.5F);

        gunModel[165].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.5F, -1F); // Box 193
        gunModel[165].setRotationPoint(-6F, 8F, -2.5F);

        gunModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 2F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 2F, -0.25F, 1F, -3F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 1F, -3F, -1F); // Box 194
        gunModel[166].setRotationPoint(-8F, 7F, -2.5F);

        gunModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, -0.5F, -1F, 0F, -0.99F, -1F, 0F, -0.99F, -1F, 0F, -0.5F, -1F); // Box 195
        gunModel[167].setRotationPoint(-2F, 9F, -2.5F);

        gunModel[168].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
        gunModel[168].setRotationPoint(1F, -9.5F, -4F);

        gunModel[169].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, -0.99F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
        gunModel[169].setRotationPoint(1F, -10.5F, -4F);

        gunModel[170].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.99F, 0F); // Box 200
        gunModel[170].setRotationPoint(1F, -8.5F, -4F);

        gunModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0.125F, 0.25F, 0F, 0.125F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0.25F, 0F, 0.125F, 0.25F, 0F, 0F, 0F); // Box 201
        gunModel[171].setRotationPoint(1F, -9.5F, -4F);

        gunModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0.125F, 0.25F, -0.5F, 0.125F, 0F, -0.5F, 0.125F, 0F, 0F, 0.125F, 0.25F, 0F, 0.125F, 0.25F, -0.5F, 0.125F, 0F, -0.5F, 0.125F, 0F, 0F, 0.125F, 0.25F); // Box 202
        gunModel[172].setRotationPoint(2F, -9.5F, -4F);

        gunModel[173].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
        gunModel[173].setRotationPoint(27F, -12.5F, -2F);

        gunModel[174].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
        gunModel[174].setRotationPoint(27F, -13.5F, -2F);

        gunModel[175].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
        gunModel[175].setRotationPoint(27F, -14.5F, -1.5F);

        gunModel[176].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 289
        gunModel[176].setRotationPoint(27F, -10.5F, -1.5F);

        gunModel[177].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 290
        gunModel[177].setRotationPoint(27F, -11.5F, -2F);

        gunModel[178].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
        gunModel[178].setRotationPoint(24F, -11F, 1.5F);

        gunModel[179].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 292
        gunModel[179].setRotationPoint(24F, -14F, 1.5F);

        gunModel[180].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
        gunModel[180].setRotationPoint(24F, -11F, -2.5F);

        gunModel[181].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 294
        gunModel[181].setRotationPoint(24F, -14F, -2.5F);

        gunModel[182].addShapeBox(0F, 0F, 0F, 40, 4, 6, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 327
        gunModel[182].setRotationPoint(-29F, -14F, -3F);

        gunModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 332
        gunModel[183].setRotationPoint(-37F, -14F, -3F);

        gunModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 333
        gunModel[184].setRotationPoint(-37F, -11.5F, -3F);

        gunModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 334
        gunModel[185].setRotationPoint(-30F, -11.5F, -3F);

        gunModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 335
        gunModel[186].setRotationPoint(-30F, -14F, -3F);

        gunModel[187].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
        gunModel[187].setRotationPoint(25F, -14F, -4F);

        gunModel[188].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 378
        gunModel[188].setRotationPoint(24F, -17F, -3F);

        gunModel[189].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 379
        gunModel[189].setRotationPoint(33F, -17F, -3F);

        gunModel[190].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.125F, -1.125F, 0F, 0.125F, -1.125F, 0F, 0.125F, 0.625F, 0F, 0.125F, 0.625F); // Box 380
        gunModel[190].setRotationPoint(29F, -17F, -3F);

        gunModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.625F, -1.375F, 0F, -0.625F, -1.375F, 0F, -0.625F, 0.875F, 0F, -0.625F, 0.875F, 0F, 0.125F, -1.1F, -0.5F, 0.125F, -1.1F, -0.5F, 0.125F, 0.6F, 0F, 0.125F, 0.6F); // Box 381
        gunModel[191].setRotationPoint(28.5F, -16.5F, -3.25F);

        gunModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -1.55F, -0.5F, -0.5F, -1.55F, -0.5F, -0.5F, 1.05F, 0F, -0.5F, 1.05F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 382
        gunModel[192].setRotationPoint(28.5F, -15F, -4.25F);

        gunModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.625F, -1.375F, 0F, -0.625F, -1.375F, 0F, -0.625F, 0.875F, 0F, -0.625F, 0.875F, -0.5F, 0.125F, -1.1F, 0F, 0.125F, -1.1F, 0F, 0.125F, 0.6F, -0.5F, 0.125F, 0.6F); // Box 383
        gunModel[193].setRotationPoint(32.5F, -16.5F, -3.25F);

        gunModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -1.55F, 0F, -0.5F, -1.55F, 0F, -0.5F, 1.05F, -0.5F, -0.5F, 1.05F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 384
        gunModel[194].setRotationPoint(32.5F, -15F, -4.25F);

        gunModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -1.55F, 0F, -0.5F, -1.55F, 0F, -0.5F, 1.05F, -0.5F, -0.5F, 1.05F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 385
        gunModel[195].setRotationPoint(37.5F, -15F, -4.25F);

        gunModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.625F, -1.375F, 0F, -0.625F, -1.375F, 0F, -0.625F, 0.875F, 0F, -0.625F, 0.875F, -0.5F, 0.125F, -1.1F, 0F, 0.125F, -1.1F, 0F, 0.125F, 0.6F, -0.5F, 0.125F, 0.6F); // Box 386
        gunModel[196].setRotationPoint(37.5F, -16.5F, -3.25F);

        gunModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.625F, -1.375F, 0F, -0.625F, -1.375F, 0F, -0.625F, 0.875F, 0F, -0.625F, 0.875F, 0F, 0.125F, -1.1F, -0.5F, 0.125F, -1.1F, -0.5F, 0.125F, 0.6F, 0F, 0.125F, 0.6F); // Box 387
        gunModel[197].setRotationPoint(33.5F, -16.5F, -3.25F);

        gunModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -1.55F, -0.5F, -0.5F, -1.55F, -0.5F, -0.5F, 1.05F, 0F, -0.5F, 1.05F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 388
        gunModel[198].setRotationPoint(33.5F, -15F, -4.25F);

        gunModel[199].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 430
        gunModel[199].setRotationPoint(38F, -17F, -3F);

        gunModel[200].addShapeBox(0F, 0F, 0F, 8, 4, 5, 0F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 587
        gunModel[200].setRotationPoint(-37F, -14F, -1F);

        gunModel[201].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 203
        gunModel[201].setRotationPoint(-16F, -21F, -3F);

        gunModel[202].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, -0.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 204
        gunModel[202].setRotationPoint(-16F, -23F, -3F);

        gunModel[203].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 205
        gunModel[203].setRotationPoint(-15.5F, -26.5F, -3F);

        gunModel[204].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, -0.5F, -0.5F, 0.5F, 1F, -0.5F, 0.5F, 1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
        gunModel[204].setRotationPoint(-16F, -23F, 2F);

        gunModel[205].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
        gunModel[205].setRotationPoint(-15.5F, -26.5F, 2F);

        gunModel[206].addShapeBox(0F, 0F, 0F, 23, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 208
        gunModel[206].setRotationPoint(-14F, -23F, -3F);

        gunModel[207].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
        gunModel[207].setRotationPoint(9.5F, -23F, -3F);

        gunModel[208].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 211
        gunModel[208].setRotationPoint(8.5F, -24F, -3F);

        gunModel[209].addShapeBox(0F, 0F, 0F, 15, 1, 6, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 212
        gunModel[209].setRotationPoint(-6.5F, -24F, -3F);

        gunModel[210].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
        gunModel[210].setRotationPoint(-8F, -24F, -3F);

        gunModel[211].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
        gunModel[211].setRotationPoint(-14F, -24F, -2F);

        gunModel[212].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 221
        gunModel[212].setRotationPoint(-13.5F, -24.75F, -1.5F);

        gunModel[213].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 222
        gunModel[213].setRotationPoint(-6.5F, -24.75F, -1.5F);

        gunModel[214].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 223
        gunModel[214].setRotationPoint(-6.5F, -24.25F, -3F);

        gunModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 224
        gunModel[215].setRotationPoint(-13.5F, -24.75F, -1.5F);

        gunModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 225
        gunModel[216].setRotationPoint(-13.5F, -25.25F, -1.5F);

        gunModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 226
        gunModel[217].setRotationPoint(-13.5F, -24.25F, -1.5F);

        gunModel[218].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 227
        gunModel[218].setRotationPoint(-14.5F, -25.25F, -0.5F);

        gunModel[219].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 228
        gunModel[219].setRotationPoint(-15.5F, -24.5F, -2F);

        gunModel[220].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, -1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 229
        gunModel[220].setRotationPoint(-16F, -23F, -2F);

        gunModel[221].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
        gunModel[221].setRotationPoint(-15.5F, -24.5F, -1.5F);

        gunModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F); // Box 232
        gunModel[222].setRotationPoint(-16.5F, -24.5F, -1.5F);

        gunModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 233
        gunModel[223].setRotationPoint(-15.5F, -23.5F, -1.5F);

        gunModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0.25F, 0.25F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.25F, 0.25F, 0F); // Box 234
        gunModel[224].setRotationPoint(-16F, -23F, -1.5F);

        gunModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.475F, -0.5F, -0.3F, -0.475F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.475F, -0.5F, -0.3F, -0.475F); // Box 236
        gunModel[225].setRotationPoint(-15.5F, -27F, -1F);

        gunModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.225F, 0F, 0F, -0.225F, 0F, 0F, -0.225F, 0F, -0.5F, -0.225F, 0F); // Box 238
        gunModel[226].setRotationPoint(-15.5F, -27.75F, -1F);

        gunModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.225F, 0F, 0F, -0.225F, 0F, 0F, -0.225F, 0F, -0.5F, -0.225F, 0F, -0.5F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.5F, 0.75F, 0F); // Box 242
        gunModel[227].setRotationPoint(-15.5F, -26.25F, -1F);

        gunModel[228].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 244
        gunModel[228].setRotationPoint(-6.5F, -24.25F, 2F);

        gunModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
        gunModel[229].setRotationPoint(0F, -24F, -3F);

        gunModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Box 246
        gunModel[230].setRotationPoint(-0.5F, -24F, -3F);

        gunModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 247
        gunModel[231].setRotationPoint(-0.5F, -24F, -3F);

        gunModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 248
        gunModel[232].setRotationPoint(-3.5F, -24F, -3F);

        gunModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Box 249
        gunModel[233].setRotationPoint(-3.5F, -24F, -3F);

        gunModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 250
        gunModel[234].setRotationPoint(0.5F, -24F, -3F);

        gunModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Box 251
        gunModel[235].setRotationPoint(0.5F, -24F, -3F);

        gunModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Box 252
        gunModel[236].setRotationPoint(3.5F, -24F, -3F);

        gunModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
        gunModel[237].setRotationPoint(4F, -24F, -3F);

        gunModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 254
        gunModel[238].setRotationPoint(3.5F, -24F, -3F);

        gunModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 255
        gunModel[239].setRotationPoint(4.5F, -24F, -3F);

        gunModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Box 256
        gunModel[240].setRotationPoint(4.5F, -24F, -3F);

        gunModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Box 257
        gunModel[241].setRotationPoint(7.5F, -24F, -3F);

        gunModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 258
        gunModel[242].setRotationPoint(7.5F, -24F, -3F);

        gunModel[243].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F); // Box 263
        gunModel[243].setRotationPoint(-16F, -17.5F, -3F);

        gunModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.475F, -0.5F, -0.2F, -0.475F, -0.5F, -0.525F, 0F, 0F, -0.525F, 0F, 0F, -0.525F, -0.25F, -0.5F, -0.525F, -0.25F); // Box 76
        gunModel[244].setRotationPoint(-15.5F, -26.5F, -1F);

        gunModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.525F, 0F, 0F, -0.525F, 0F, 0F, -0.525F, -0.25F, -0.5F, -0.525F, -0.25F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.475F, -0.5F, -0.2F, -0.475F); // Box 77
        gunModel[245].setRotationPoint(-15.5F, -27.5F, -1F);

        gunModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.3F, -0.475F, 0F, -0.3F, -0.475F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.475F, 0F, -0.3F, -0.475F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 78
        gunModel[246].setRotationPoint(-15.5F, -27F, 0F);

        gunModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.2F, -0.475F, 0F, -0.2F, -0.475F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.525F, -0.25F, 0F, -0.525F, -0.25F, 0F, -0.525F, 0F, -0.5F, -0.525F, 0F); // Box 79
        gunModel[247].setRotationPoint(-15.5F, -26.5F, 0F);

        gunModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.525F, -0.25F, 0F, -0.525F, -0.25F, 0F, -0.525F, 0F, -0.5F, -0.525F, 0F, -0.5F, -0.2F, -0.475F, 0F, -0.2F, -0.475F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F); // Box 80
        gunModel[248].setRotationPoint(-15.5F, -27.5F, 0F);

        gunModel[249].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 265
        gunModel[249].setRotationPoint(35F, -17.5F, -3F);

        gunModel[250].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 266
        gunModel[250].setRotationPoint(35F, -18F, -3F);

        gunModel[251].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 267
        gunModel[251].setRotationPoint(35F, -18.5F, -3F);

        gunModel[252].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
        gunModel[252].setRotationPoint(35F, -21.5F, -2F);

        gunModel[253].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
        gunModel[253].setRotationPoint(35F, -22.5F, -2F);

        gunModel[254].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
        gunModel[254].setRotationPoint(35F, -24.5F, -1.5F);

        gunModel[255].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F); // Box 271
        gunModel[255].setRotationPoint(35F, -27F, -2F);

        gunModel[256].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F); // Box 272
        gunModel[256].setRotationPoint(35F, -28F, -2F);

        gunModel[257].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 275
        gunModel[257].setRotationPoint(35F, -26F, -2F);

        gunModel[258].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
        gunModel[258].setRotationPoint(35F, -27F, 1F);

        gunModel[259].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
        gunModel[259].setRotationPoint(35F, -28F, 1F);

        gunModel[260].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 278
        gunModel[260].setRotationPoint(35F, -26F, 1F);

        gunModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 279
        gunModel[261].setRotationPoint(35.5F, -25.5F, -0.5F);

        gunModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.25F, 0F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.25F, 0.25F, 0F); // Box 280
        gunModel[262].setRotationPoint(36F, -25.5F, -0.5F);

        gunModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.25F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.5F, 0.25F, -0.25F); // Box 281
        gunModel[263].setRotationPoint(35F, -25.5F, -0.5F);

        gunModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, 0.25F, -0.375F, -0.375F, 0.25F, -0.375F, -0.375F, 0.25F, -0.375F, -0.375F, 0.25F, -0.375F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 282
        gunModel[264].setRotationPoint(35.5F, -26.5F, -0.5F);

        gunModel[265].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[265].setRotationPoint(25F, -14.5F, 3F);

        gunModel[266].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 57
        gunModel[266].setRotationPoint(27F, -14.5F, 3.5F);

        gunModel[267].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 57
        gunModel[267].setRotationPoint(29F, -14.5F, 3.5F);

        gunModel[268].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 57
        gunModel[268].setRotationPoint(31F, -14.5F, 3.5F);

        gunModel[269].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 57
        gunModel[269].setRotationPoint(33F, -14.5F, 3.5F);

        gunModel[270].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 57
        gunModel[270].setRotationPoint(35F, -14.5F, 3.5F);

        gunModel[271].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 57
        gunModel[271].setRotationPoint(37F, -14.5F, 3.5F);

        gunModel[272].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 57
        gunModel[272].setRotationPoint(39F, -14.5F, 3.5F);

        gunModel[273].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 57
        gunModel[273].setRotationPoint(25F, -14.5F, -4.5F);

        gunModel[274].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 57
        gunModel[274].setRotationPoint(25F, -14.5F, -4F);

        gunModel[275].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 57
        gunModel[275].setRotationPoint(27F, -14.5F, -4.5F);

        gunModel[276].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 57
        gunModel[276].setRotationPoint(29F, -14.5F, -4.5F);

        gunModel[277].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 57
        gunModel[277].setRotationPoint(31F, -14.5F, -4.5F);

        gunModel[278].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 57
        gunModel[278].setRotationPoint(33F, -14.5F, -4.5F);

        gunModel[279].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 57
        gunModel[279].setRotationPoint(35F, -14.5F, -4.5F);

        gunModel[280].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 57
        gunModel[280].setRotationPoint(37F, -14.5F, -4.5F);

        gunModel[281].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 57
        gunModel[281].setRotationPoint(39F, -14.5F, -4.5F);

        gunModel[282].addShapeBox(0F, 0F, 0F, 27, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[282].setRotationPoint(13F, -9F, -1.5F);

        gunModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 57
        gunModel[283].setRotationPoint(13F, -8F, -1.5F);

        gunModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 57
        gunModel[284].setRotationPoint(15F, -8F, -1.5F);

        gunModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 57
        gunModel[285].setRotationPoint(17F, -8F, -1.5F);

        gunModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 57
        gunModel[286].setRotationPoint(19F, -8F, -1.5F);

        gunModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 57
        gunModel[287].setRotationPoint(21F, -8F, -1.5F);

        gunModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 57
        gunModel[288].setRotationPoint(23F, -8F, -1.5F);

        gunModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 57
        gunModel[289].setRotationPoint(25F, -8F, -1.5F);

        gunModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 57
        gunModel[290].setRotationPoint(27F, -8F, -1.5F);

        gunModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 57
        gunModel[291].setRotationPoint(29F, -8F, -1.5F);

        gunModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 57
        gunModel[292].setRotationPoint(31F, -8F, -1.5F);

        gunModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 57
        gunModel[293].setRotationPoint(33F, -8F, -1.5F);

        gunModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 57
        gunModel[294].setRotationPoint(35F, -8F, -1.5F);

        gunModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 57
        gunModel[295].setRotationPoint(37F, -8F, -1.5F);

        gunModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 57
        gunModel[296].setRotationPoint(39F, -8F, -1.5F);

        gunModel[297].addShapeBox(0F, 0F, 0F, 56, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 57
        gunModel[297].setRotationPoint(-16F, -18F, -1.5F);

        gunModel[298].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[298].setRotationPoint(-16F, -19F, -1.5F);

        gunModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[299].setRotationPoint(-13F, -19F, -1.5F);

        gunModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[300].setRotationPoint(-11F, -19F, -1.5F);

        gunModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[301].setRotationPoint(-9F, -19F, -1.5F);

        gunModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[302].setRotationPoint(-7F, -19F, -1.5F);

        gunModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[303].setRotationPoint(-5F, -19F, -1.5F);

        gunModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[304].setRotationPoint(-3F, -19F, -1.5F);

        gunModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[305].setRotationPoint(-1F, -19F, -1.5F);

        gunModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[306].setRotationPoint(1F, -19F, -1.5F);

        gunModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[307].setRotationPoint(3F, -19F, -1.5F);

        gunModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[308].setRotationPoint(5F, -19F, -1.5F);

        gunModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[309].setRotationPoint(7F, -19F, -1.5F);

        gunModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[310].setRotationPoint(9F, -19F, -1.5F);

        gunModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[311].setRotationPoint(11F, -19F, -1.5F);

        gunModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[312].setRotationPoint(13F, -19F, -1.5F);

        gunModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[313].setRotationPoint(15F, -19F, -1.5F);

        gunModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[314].setRotationPoint(17F, -19F, -1.5F);

        gunModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[315].setRotationPoint(19F, -19F, -1.5F);

        gunModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[316].setRotationPoint(21F, -19F, -1.5F);

        gunModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[317].setRotationPoint(23F, -19F, -1.5F);

        gunModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[318].setRotationPoint(25F, -19F, -1.5F);

        gunModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[319].setRotationPoint(27F, -19F, -1.5F);

        gunModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[320].setRotationPoint(29F, -19F, -1.5F);

        gunModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[321].setRotationPoint(31F, -19F, -1.5F);

        gunModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[322].setRotationPoint(33F, -19F, -1.5F);

        gunModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[323].setRotationPoint(35F, -19F, -1.5F);

        gunModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[324].setRotationPoint(37F, -19F, -1.5F);

        gunModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[325].setRotationPoint(39F, -19F, -1.5F);

        gunModel[326].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 203
        gunModel[326].setRotationPoint(9.5F, -22F, -3F);

        gunModel[327].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F); // Box 263
        gunModel[327].setRotationPoint(9.5F, -17.5F, -3F);

        gunModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[328].setRotationPoint(-4F, -26F, -1.5F);

        gunModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[329].setRotationPoint(-2F, -26F, -1.5F);

        gunModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[330].setRotationPoint(0F, -26F, -1.5F);

        gunModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[331].setRotationPoint(2F, -26F, -1.5F);

        gunModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[332].setRotationPoint(4F, -26F, -1.5F);

        gunModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[333].setRotationPoint(6F, -26F, -1.5F);

        gunModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 12F, -0.5F, -0.5F, 12F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 57
        gunModel[334].setRotationPoint(-4F, -25F, -1.5F);

        gunModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[335].setRotationPoint(8F, -26F, -1.5F);

        gunModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.5F, 12F, 0F, -0.5F, 12F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 12F, -0.5F, -0.5F, 12F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 57
        gunModel[336].setRotationPoint(-4F, -24.5F, -1.5F);


        defaultBarrelModel = new ModelRendererTurbo[34];
        defaultBarrelModel[0] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 295
        defaultBarrelModel[1] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 296
        defaultBarrelModel[2] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 297
        defaultBarrelModel[3] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 298
        defaultBarrelModel[4] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 299
        defaultBarrelModel[5] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 300
        defaultBarrelModel[6] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 301
        defaultBarrelModel[7] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 302
        defaultBarrelModel[8] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 303
        defaultBarrelModel[9] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 304
        defaultBarrelModel[10] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 305
        defaultBarrelModel[11] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 306
        defaultBarrelModel[12] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 307
        defaultBarrelModel[13] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 308
        defaultBarrelModel[14] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 309
        defaultBarrelModel[15] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 310
        defaultBarrelModel[16] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 311
        defaultBarrelModel[17] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 312
        defaultBarrelModel[18] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 313
        defaultBarrelModel[19] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 314
        defaultBarrelModel[20] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 315
        defaultBarrelModel[21] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 316
        defaultBarrelModel[22] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 317
        defaultBarrelModel[23] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 318
        defaultBarrelModel[24] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 319
        defaultBarrelModel[25] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 320
        defaultBarrelModel[26] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 321
        defaultBarrelModel[27] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 322
        defaultBarrelModel[28] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 323
        defaultBarrelModel[29] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 324
        defaultBarrelModel[30] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 325
        defaultBarrelModel[31] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 326
        defaultBarrelModel[32] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 33
        defaultBarrelModel[33] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 34

        defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 295
        defaultBarrelModel[0].setRotationPoint(44F, -12.5F, -2.5F);

        defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, -0.625F, 0.25F, 0F, -0.625F, 0.25F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F); // Box 296
        defaultBarrelModel[1].setRotationPoint(44F, -13.75F, -2.5F);

        defaultBarrelModel[2].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -0.25F, -1.875F, 0F, -0.25F, -1.875F, 0F, -1.25F, 1.125F, 0F, -1.25F, 1.125F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, 0.625F, 0.25F, 0F, 0.625F, 0.25F); // Box 297
        defaultBarrelModel[2].setRotationPoint(44F, -14.75F, -2.5F);

        defaultBarrelModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.5F, -0.5F, -2F, 0F, -0.25F, -1.875F, 0F, -0.25F, -1.875F, -0.5F, -0.5F, -2F, -0.5F, 0F, -1F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, -0.5F, 0F, -1F); // Box 298
        defaultBarrelModel[3].setRotationPoint(43F, -14.75F, -2.5F);

        defaultBarrelModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.5F, 0F, -1F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, -0.5F, 0F, -1F, -0.5F, 0.125F, -0.25F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.5F, 0.125F, -0.25F); // Box 299
        defaultBarrelModel[4].setRotationPoint(43F, -13.75F, -2.5F);

        defaultBarrelModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.5F, 0.125F, -0.25F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.5F, 0.125F, -0.25F); // Box 300
        defaultBarrelModel[5].setRotationPoint(43F, -12.5F, -2.5F);

        defaultBarrelModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 301
        defaultBarrelModel[6].setRotationPoint(43F, -10.5F, -1.5F);

        defaultBarrelModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 302
        defaultBarrelModel[7].setRotationPoint(43F, -11.5F, -2F);

        defaultBarrelModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
        defaultBarrelModel[8].setRotationPoint(43F, -12.5F, -2F);

        defaultBarrelModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
        defaultBarrelModel[9].setRotationPoint(43F, -13.5F, -2F);

        defaultBarrelModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
        defaultBarrelModel[10].setRotationPoint(43F, -14.5F, -1.5F);

        defaultBarrelModel[11].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 306
        defaultBarrelModel[11].setRotationPoint(44F, -14.5F, -0.5F);

        defaultBarrelModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 307
        defaultBarrelModel[12].setRotationPoint(44F, -12.5F, 1.5F);

        defaultBarrelModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.625F, 0.25F, 0F, -0.625F, 0.25F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 308
        defaultBarrelModel[13].setRotationPoint(44F, -13.75F, 1.5F);

        defaultBarrelModel[14].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -1.25F, 1.125F, 0F, -1.25F, 1.125F, 0F, -0.25F, -1.875F, 0F, -0.25F, -1.875F, 0F, 0.625F, 0.25F, 0F, 0.625F, 0.25F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F); // Box 309
        defaultBarrelModel[14].setRotationPoint(44F, -14.75F, 1.5F);

        defaultBarrelModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0.25F, 0F, -0.625F, 0.25F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F); // Box 310
        defaultBarrelModel[15].setRotationPoint(44F, -11.25F, 1.5F);

        defaultBarrelModel[16].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0.625F, 0.25F, 0F, 0.625F, 0.25F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -1.25F, 1.125F, 0F, -1.25F, 1.125F, 0F, -0.25F, -1.875F, 0F, -0.25F, -1.875F); // Box 311
        defaultBarrelModel[16].setRotationPoint(44F, -10.25F, 1.5F);

        defaultBarrelModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, -0.625F, 0.25F, 0F, -0.625F, 0.25F); // Box 312
        defaultBarrelModel[17].setRotationPoint(44F, -11.25F, -2.5F);

        defaultBarrelModel[18].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, 0.625F, 0.25F, 0F, 0.625F, 0.25F, 0F, -0.25F, -1.875F, 0F, -0.25F, -1.875F, 0F, -1.25F, 1.125F, 0F, -1.25F, 1.125F); // Box 313
        defaultBarrelModel[18].setRotationPoint(44F, -10.25F, -2.5F);

        defaultBarrelModel[19].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 314
        defaultBarrelModel[19].setRotationPoint(44F, -10.5F, -0.5F);

        defaultBarrelModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.625F, 0.25F, 0F, -0.625F, 0.25F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 315
        defaultBarrelModel[20].setRotationPoint(47F, -13.75F, 1.5F);

        defaultBarrelModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, -0.625F, 0.25F, 0F, -0.625F, 0.25F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F); // Box 316
        defaultBarrelModel[21].setRotationPoint(47F, -13.75F, -2.5F);

        defaultBarrelModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 317
        defaultBarrelModel[22].setRotationPoint(47F, -12.5F, -2.5F);

        defaultBarrelModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, -0.625F, 0.25F, 0F, -0.625F, 0.25F); // Box 318
        defaultBarrelModel[23].setRotationPoint(47F, -11.25F, -2.5F);

        defaultBarrelModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 319
        defaultBarrelModel[24].setRotationPoint(47F, -12.5F, 1.5F);

        defaultBarrelModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0.25F, 0F, -0.625F, 0.25F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F); // Box 320
        defaultBarrelModel[25].setRotationPoint(47F, -11.25F, 1.5F);

        defaultBarrelModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.625F, 0.25F, 0F, -0.625F, 0.25F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 321
        defaultBarrelModel[26].setRotationPoint(50F, -13.75F, 1.5F);

        defaultBarrelModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, -0.625F, 0.25F, 0F, -0.625F, 0.25F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F); // Box 322
        defaultBarrelModel[27].setRotationPoint(50F, -13.75F, -2.5F);

        defaultBarrelModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 323
        defaultBarrelModel[28].setRotationPoint(50F, -12.5F, -2.5F);

        defaultBarrelModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, -0.625F, 0.25F, 0F, -0.625F, 0.25F); // Box 324
        defaultBarrelModel[29].setRotationPoint(50F, -11.25F, -2.5F);

        defaultBarrelModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 325
        defaultBarrelModel[30].setRotationPoint(50F, -12.5F, 1.5F);

        defaultBarrelModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0.25F, 0F, -0.625F, 0.25F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F); // Box 326
        defaultBarrelModel[31].setRotationPoint(50F, -11.25F, 1.5F);

        defaultBarrelModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.5F, 0F, -1F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, -0.5F, 0F, -1F, -0.5F, -0.5F, -2F, 0F, -0.25F, -1.875F, 0F, -0.25F, -1.875F, -0.5F, -0.5F, -2F); // Box 33
        defaultBarrelModel[32].setRotationPoint(43F, -10.25F, -2.5F);

        defaultBarrelModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.5F, 0.125F, -0.25F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.5F, 0.125F, -0.25F, -0.5F, 0F, -1F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, -0.5F, 0F, -1F); // Box 34
        defaultBarrelModel[33].setRotationPoint(43F, -11.25F, -2.5F);


        defaultScopeModel = new ModelRendererTurbo[2];
        defaultScopeModel[0] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 215
        defaultScopeModel[1] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 220

        defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 215
        defaultScopeModel[0].setRotationPoint(-6.5F, -25F, -2F);

        defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 220
        defaultScopeModel[1].setRotationPoint(-6.5F, -25F, 1F);


        ammoModel = new ModelRendererTurbo[22];
        ammoModel[0] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 567
        ammoModel[1] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 568
        ammoModel[2] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 569
        ammoModel[3] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 570
        ammoModel[4] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 571
        ammoModel[5] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 573
        ammoModel[6] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 574
        ammoModel[7] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 575
        ammoModel[8] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 576
        ammoModel[9] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 577
        ammoModel[10] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 579
        ammoModel[11] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 580
        ammoModel[12] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 581
        ammoModel[13] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 582
        ammoModel[14] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 583
        ammoModel[15] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 18
        ammoModel[16] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 19
        ammoModel[17] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 20
        ammoModel[18] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 21
        ammoModel[19] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 22
        ammoModel[20] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 23
        ammoModel[21] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 24

        ammoModel[0].addShapeBox(-1F, 0F, -3F, 12, 6, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, -3F, 0F, 0F, -3F); // Box 567
        ammoModel[0].setRotationPoint(-32F, -10.5F, 0.5F);
        ammoModel[0].rotateAngleZ = 0.05235988F;

        ammoModel[1].addShapeBox(-1F, 6F, -3F, 12, 6, 5, 0F, 0F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F); // Box 568
        ammoModel[1].setRotationPoint(-32F, -10.5F, 0.5F);
        ammoModel[1].rotateAngleZ = 0.05235988F;

        ammoModel[2].addShapeBox(-0.5F, 12F, -3F, 12, 6, 5, 0F, 0F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -1F, 0F, 0F); // Box 569
        ammoModel[2].setRotationPoint(-32F, -10.5F, 0.5F);
        ammoModel[2].rotateAngleZ = 0.05235988F;

        ammoModel[3].addShapeBox(0.5F, 18F, -3F, 12, 6, 5, 0F, 0F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -1.5F, 0F, 0F); // Box 570
        ammoModel[3].setRotationPoint(-32F, -10.5F, 0.5F);
        ammoModel[3].rotateAngleZ = 0.05235988F;

        ammoModel[4].addShapeBox(2F, 24F, -3F, 12, 5, 5, 0F, 0F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.25F, -3F, 0F, 1.25F, -3F, 0F, -2F, 0F, 0F); // Box 571
        ammoModel[4].setRotationPoint(-32F, -10.5F, 0.5F);
        ammoModel[4].rotateAngleZ = 0.05235988F;

        ammoModel[5].addShapeBox(10.5F, 0F, -2.5F, 2, 4, 3, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.49F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -0.49F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 573
        ammoModel[5].setRotationPoint(-32F, -10.5F, 0.5F);
        ammoModel[5].rotateAngleZ = 0.05235988F;

        ammoModel[6].addShapeBox(10.5F, 4F, -2.5F, 2, 6, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F); // Box 574
        ammoModel[6].setRotationPoint(-32F, -10.5F, 0.5F);
        ammoModel[6].rotateAngleZ = 0.05235988F;

        ammoModel[7].addShapeBox(11F, 10F, -2.5F, 2, 6, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, 0.5F); // Box 575
        ammoModel[7].setRotationPoint(-32F, -10.5F, 0.5F);
        ammoModel[7].rotateAngleZ = 0.05235988F;

        ammoModel[8].addShapeBox(12F, 16F, -2.5F, 2, 6, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, -1.5F, 0F, 0.5F); // Box 576
        ammoModel[8].setRotationPoint(-32F, -10.5F, 0.5F);
        ammoModel[8].rotateAngleZ = 0.05235988F;

        ammoModel[9].addShapeBox(13.5F, 22F, -2.5F, 2, 5, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1.75F, -1F, 0.5F, 1.5F, -1.5F, -0.5F, 1.5F, -1.5F, -0.5F, -1.75F, -1F, 0.5F); // Box 577
        ammoModel[9].setRotationPoint(-32F, -10.5F, 0.5F);
        ammoModel[9].rotateAngleZ = 0.05235988F;

        ammoModel[10].addShapeBox(-2F, 0F, -3F, 1, 6, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 579
        ammoModel[10].setRotationPoint(-32F, -10.5F, 0.5F);
        ammoModel[10].rotateAngleZ = 0.05235988F;

        ammoModel[11].addShapeBox(-2F, 6F, -3F, 1, 6, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 580
        ammoModel[11].setRotationPoint(-32F, -10.5F, 0.5F);
        ammoModel[11].rotateAngleZ = 0.05235988F;

        ammoModel[12].addShapeBox(-1.5F, 12F, -3F, 1, 6, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -0.5F); // Box 581
        ammoModel[12].setRotationPoint(-32F, -10.5F, 0.5F);
        ammoModel[12].rotateAngleZ = 0.05235988F;

        ammoModel[13].addShapeBox(-0.5F, 18F, -3F, 1, 6, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, -0.5F); // Box 582
        ammoModel[13].setRotationPoint(-32F, -10.5F, 0.5F);
        ammoModel[13].rotateAngleZ = 0.05235988F;

        ammoModel[14].addShapeBox(1F, 24F, -3F, 1, 5, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0.25F, -0.5F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0.25F, -0.5F); // Box 583
        ammoModel[14].setRotationPoint(-32F, -10.5F, 0.5F);
        ammoModel[14].rotateAngleZ = 0.05235988F;

        ammoModel[15].addShapeBox(-1F, -2F, -3F, 12, 6, 4, 0F, 0F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, -3F, 0F, -4F, -3F); // Box 18
        ammoModel[15].setRotationPoint(-32F, -10.5F, 0.5F);
        ammoModel[15].rotateAngleZ = 0.05235988F;

        ammoModel[16].addShapeBox(-2F, -2F, -3F, 1, 6, 4, 0F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -2.5F, -0.5F, -0.5F, -2.5F, 0F, -4F, -0.5F, 0F, -4F, 0F, 0F, -4F, -3F, 0F, -4F, -3F); // Box 19
        ammoModel[16].setRotationPoint(-32F, -10.5F, 0.5F);
        ammoModel[16].rotateAngleZ = 0.05235988F;

        ammoModel[17].addShapeBox(10.5F, 0F, -2.5F, 2, 4, 4, 0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F); // Box 20
        ammoModel[17].setRotationPoint(-32F, -10.5F, 0.5F);
        ammoModel[17].rotateAngleZ = 0.05235988F;

        ammoModel[18].addShapeBox(-1F, 0F, 1F, 12, 6, 4, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, -2F, -3F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 21
        ammoModel[18].setRotationPoint(-32F, -10.5F, -2.5F);
        ammoModel[18].rotateAngleZ = 0.05235988F;

        ammoModel[19].addShapeBox(10.5F, 0F, 0.5F, 2, 4, 3, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.49F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.49F, 0F, 0F, 0.5F); // Box 22
        ammoModel[19].setRotationPoint(-32F, -10.5F, -1.5F);
        ammoModel[19].rotateAngleZ = 0.05235988F;

        ammoModel[20].addShapeBox(-1F, -2F, 1F, 12, 6, 4, 0F, 0F, 0F, -2.5F, -6F, 0F, -2.5F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, -4F, -3F, -4F, -4F, -3F, -4F, -4F, 0F, 0F, -4F, 0F); // Box 23
        ammoModel[20].setRotationPoint(-32F, -10.5F, -2.5F);
        ammoModel[20].rotateAngleZ = 0.05235988F;

        ammoModel[21].addShapeBox(-2F, -2F, 1F, 1, 6, 4, 0F, -0.5F, -0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -1F, -0.5F, -0.5F, -1F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, -4F, 0F, 0F, -4F, -0.5F); // Box 24
        ammoModel[21].setRotationPoint(-32F, -10.5F, -2.5F);
        ammoModel[21].rotateAngleZ = 0.05235988F;


        slideModel = new ModelRendererTurbo[22];
        slideModel[0] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 166
        slideModel[1] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 167
        slideModel[2] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 168
        slideModel[3] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 169
        slideModel[4] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 170
        slideModel[5] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 171
        slideModel[6] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 172
        slideModel[7] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 173
        slideModel[8] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 174
        slideModel[9] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 175
        slideModel[10] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 176
        slideModel[11] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 177
        slideModel[12] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 178
        slideModel[13] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 179
        slideModel[14] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 180
        slideModel[15] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 181
        slideModel[16] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 182
        slideModel[17] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 183
        slideModel[18] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 328
        slideModel[19] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 329
        slideModel[20] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 330
        slideModel[21] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 331

        slideModel[0].addShapeBox(0F, 0F, 0F, 42, 2, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
        slideModel[0].setRotationPoint(-25F, -15.5F, -3F);

        slideModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 167
        slideModel[1].setRotationPoint(16F, -15F, -3.5F);

        slideModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 168
        slideModel[2].setRotationPoint(13F, -15F, -3.5F);

        slideModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 169
        slideModel[3].setRotationPoint(13F, -15F, -4F);

        slideModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 170
        slideModel[4].setRotationPoint(13F, -15F, -4.5F);

        slideModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.375F, -0.875F, 0F, -0.375F, -0.875F, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -0.875F, 0F, -0.375F, -0.875F, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F); // Box 171
        slideModel[5].setRotationPoint(13F, -15F, -5F);

        slideModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.375F, -0.875F, -0.5F, -0.375F, -0.875F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.375F, -0.875F, -0.5F, -0.375F, -0.875F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 172
        slideModel[6].setRotationPoint(16F, -15F, -5F);

        slideModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 173
        slideModel[7].setRotationPoint(16F, -15F, -4.5F);

        slideModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 174
        slideModel[8].setRotationPoint(16F, -15F, -4F);

        slideModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F); // Box 175
        slideModel[9].setRotationPoint(13F, -15F, -4.25F);

        slideModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F); // Box 176
        slideModel[10].setRotationPoint(13F, -15.25F, -4.25F);

        slideModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F); // Box 177
        slideModel[11].setRotationPoint(13F, -14.75F, -4.25F);

        slideModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.125F, -0.125F, -0.125F); // Box 178
        slideModel[12].setRotationPoint(14F, -15F, -4.25F);

        slideModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, -0.125F, -0.125F, -0.125F, -0.125F, -0.125F, -0.125F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F); // Box 179
        slideModel[13].setRotationPoint(15F, -15F, -4.25F);

        slideModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 180
        slideModel[14].setRotationPoint(13.5F, -16F, -4.25F);

        slideModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 181
        slideModel[15].setRotationPoint(15.5F, -16F, -4.25F);

        slideModel[16].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, -2F, -0.75F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -2F, -0.75F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 182
        slideModel[16].setRotationPoint(13.5F, -20.5F, -4.25F);

        slideModel[17].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 183
        slideModel[17].setRotationPoint(16F, -20.5F, -4.25F);

        slideModel[18].addShapeBox(0F, 0F, 0F, 8, 4, 5, 0F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 328
        slideModel[18].setRotationPoint(-37F, -14F, -2F);

        slideModel[19].addShapeBox(0F, 0F, -1F, 7, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
        slideModel[19].setRotationPoint(-36.5F, -11F, -3F);
        slideModel[19].rotateAngleX = -0.45378561F;

        slideModel[20].addShapeBox(-1F, 0F, -1F, 1, 3, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 330
        slideModel[20].setRotationPoint(-36.5F, -11F, -3F);
        slideModel[20].rotateAngleX = -0.45378561F;

        slideModel[21].addShapeBox(7F, 0F, -1F, 1, 3, 1, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 331
        slideModel[21].setRotationPoint(-36.5F, -11F, -3F);
        slideModel[21].rotateAngleX = -0.45378561F;


        barrelAttachPoint = new Vector3f(50F / 16F, 14.5F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(41F / 16F, 15.5F / 16F, -4F / 16F);
        scopeAttachPoint = new Vector3f(9.5F / 16F, 27.5F / 16F, 0F / 16F);
        gripAttachPoint = new Vector3f(37 / 16F, 10.5F / 16F, 0F / 16F);

        leftArmPos = new Vector3f(0F, -0.4F, 0F);
        leftArmRot = new Vector3f(80F, 50F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.45F, -0.95F, -0.05F);
        leftArmReloadRot = new Vector3f(80.0F, 50.0F, 0.0F);
        rightArmPos = new Vector3f(0.25F, -0.52F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85F);
        rightArmReloadPos = new Vector3f(0.25F, -0.54F, 0.05F);
        rightArmReloadRot = new Vector3f(0.0F, 20.0F, -85.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
        gunSlideDistance = 3.5F;

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
        zoomOffset = 0.17F;
        zoomOffsetY = -0.07F;
        ShakeDistance = 0.8F;
        gunOffset = -0.58F;
        gunOffsetX = -3F;
        translateAll(7F, -2.5F, 0F);

        hasFlash = true;
        flashScale = 10F;
        muzzleFlashPoint = new Vector3f(
                barrelAttachPoint.x / flashScale,
                barrelAttachPoint.y / flashScale,
                barrelAttachPoint.z / flashScale
        );

        flipAll();
    }
}