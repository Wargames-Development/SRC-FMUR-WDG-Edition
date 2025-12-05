//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Firewatch
// Model Creator: 
// Created on: 26.06.2022 - 15:44:57
// Last changed on: 26.06.2022 - 15:44:57

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelCrossbow extends ModelGun //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public ModelCrossbow() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[341];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
        gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
        gunModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 3
        gunModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 4
        gunModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 5
        gunModel[6] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 6
        gunModel[7] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 7
        gunModel[8] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 8
        gunModel[9] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 9
        gunModel[10] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 10
        gunModel[11] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 11
        gunModel[12] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 12
        gunModel[13] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 13
        gunModel[14] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 14
        gunModel[15] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 15
        gunModel[16] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 16
        gunModel[17] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 17
        gunModel[18] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 18
        gunModel[19] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 19
        gunModel[20] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 20
        gunModel[21] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 21
        gunModel[22] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 22
        gunModel[23] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 23
        gunModel[24] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 24
        gunModel[25] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 25
        gunModel[26] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 26
        gunModel[27] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 27
        gunModel[28] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 28
        gunModel[29] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 29
        gunModel[30] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 30
        gunModel[31] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 31
        gunModel[32] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 32
        gunModel[33] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 33
        gunModel[34] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 34
        gunModel[35] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 35
        gunModel[36] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 36
        gunModel[37] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 37
        gunModel[38] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 38
        gunModel[39] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 39
        gunModel[40] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 40
        gunModel[41] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 41
        gunModel[42] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 42
        gunModel[43] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 43
        gunModel[44] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 44
        gunModel[45] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 45
        gunModel[46] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 46
        gunModel[47] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 47
        gunModel[48] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 48
        gunModel[49] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 49
        gunModel[50] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 50
        gunModel[51] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 51
        gunModel[52] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 52
        gunModel[53] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 53
        gunModel[54] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 54
        gunModel[55] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 55
        gunModel[56] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 56
        gunModel[57] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 57
        gunModel[58] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 58
        gunModel[59] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 59
        gunModel[60] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 60
        gunModel[61] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 61
        gunModel[62] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 62
        gunModel[63] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 63
        gunModel[64] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 64
        gunModel[65] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 65
        gunModel[66] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 66
        gunModel[67] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 67
        gunModel[68] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 68
        gunModel[69] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 69
        gunModel[70] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 70
        gunModel[71] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 71
        gunModel[72] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 72
        gunModel[73] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 73
        gunModel[74] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 74
        gunModel[75] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 77
        gunModel[76] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 78
        gunModel[77] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 79
        gunModel[78] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 80
        gunModel[79] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 81
        gunModel[80] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 82
        gunModel[81] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 83
        gunModel[82] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 84
        gunModel[83] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 85
        gunModel[84] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 86
        gunModel[85] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 87
        gunModel[86] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 88
        gunModel[87] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 89
        gunModel[88] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 90
        gunModel[89] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 91
        gunModel[90] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 92
        gunModel[91] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 93
        gunModel[92] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 94
        gunModel[93] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 95
        gunModel[94] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 96
        gunModel[95] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 97
        gunModel[96] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 98
        gunModel[97] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 99
        gunModel[98] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 100
        gunModel[99] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 101
        gunModel[100] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 102
        gunModel[101] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 103
        gunModel[102] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 104
        gunModel[103] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 105
        gunModel[104] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 106
        gunModel[105] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 107
        gunModel[106] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 108
        gunModel[107] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 112
        gunModel[108] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 113
        gunModel[109] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 114
        gunModel[110] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 130
        gunModel[111] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 131
        gunModel[112] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 132
        gunModel[113] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 133
        gunModel[114] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 134
        gunModel[115] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 135
        gunModel[116] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 136
        gunModel[117] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 137
        gunModel[118] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 138
        gunModel[119] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 139
        gunModel[120] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 140
        gunModel[121] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 141
        gunModel[122] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 142
        gunModel[123] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 143
        gunModel[124] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 144
        gunModel[125] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 145
        gunModel[126] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 146
        gunModel[127] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 148
        gunModel[128] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 149
        gunModel[129] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 150
        gunModel[130] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 152
        gunModel[131] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 153
        gunModel[132] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 154
        gunModel[133] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 155
        gunModel[134] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 156
        gunModel[135] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 157
        gunModel[136] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 158
        gunModel[137] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 159
        gunModel[138] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 160
        gunModel[139] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 161
        gunModel[140] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 162
        gunModel[141] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 163
        gunModel[142] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 164
        gunModel[143] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 165
        gunModel[144] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 166
        gunModel[145] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 168
        gunModel[146] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 169
        gunModel[147] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 170
        gunModel[148] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 171
        gunModel[149] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 172
        gunModel[150] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 173
        gunModel[151] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 174
        gunModel[152] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 175
        gunModel[153] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 176
        gunModel[154] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 177
        gunModel[155] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 178
        gunModel[156] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 179
        gunModel[157] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 180
        gunModel[158] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 181
        gunModel[159] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 182
        gunModel[160] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 183
        gunModel[161] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 184
        gunModel[162] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 185
        gunModel[163] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 186
        gunModel[164] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 187
        gunModel[165] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 188
        gunModel[166] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 189
        gunModel[167] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 190
        gunModel[168] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 191
        gunModel[169] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 192
        gunModel[170] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 193
        gunModel[171] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 194
        gunModel[172] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 195
        gunModel[173] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 196
        gunModel[174] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 197
        gunModel[175] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 198
        gunModel[176] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 199
        gunModel[177] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 200
        gunModel[178] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 201
        gunModel[179] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 202
        gunModel[180] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 203
        gunModel[181] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 204
        gunModel[182] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 205
        gunModel[183] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 206
        gunModel[184] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 208
        gunModel[185] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 209
        gunModel[186] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 210
        gunModel[187] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 211
        gunModel[188] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 212
        gunModel[189] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 213
        gunModel[190] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 214
        gunModel[191] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 215
        gunModel[192] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 216
        gunModel[193] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 217
        gunModel[194] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 218
        gunModel[195] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 219
        gunModel[196] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 220
        gunModel[197] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 221
        gunModel[198] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 222
        gunModel[199] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 223
        gunModel[200] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 224
        gunModel[201] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Box 371
        gunModel[202] = new ModelRendererTurbo(this, 393, 161, textureX, textureY); // Box 372
        gunModel[203] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Box 373
        gunModel[204] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Box 374
        gunModel[205] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 375
        gunModel[206] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Box 376
        gunModel[207] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Box 385
        gunModel[208] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 386
        gunModel[209] = new ModelRendererTurbo(this, 25, 169, textureX, textureY); // Box 387
        gunModel[210] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 388
        gunModel[211] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Box 389
        gunModel[212] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Box 390
        gunModel[213] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 391
        gunModel[214] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 392
        gunModel[215] = new ModelRendererTurbo(this, 177, 169, textureX, textureY); // Box 393
        gunModel[216] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 394
        gunModel[217] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Box 395
        gunModel[218] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 396
        gunModel[219] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 397
        gunModel[220] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Box 398
        gunModel[221] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 399
        gunModel[222] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 400
        gunModel[223] = new ModelRendererTurbo(this, 257, 169, textureX, textureY); // Box 401
        gunModel[224] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Box 402
        gunModel[225] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Box 403
        gunModel[226] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Box 404
        gunModel[227] = new ModelRendererTurbo(this, 313, 169, textureX, textureY); // Box 405
        gunModel[228] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 406
        gunModel[229] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Box 407
        gunModel[230] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 408
        gunModel[231] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Box 409
        gunModel[232] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 410
        gunModel[233] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 411
        gunModel[234] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 412
        gunModel[235] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 413
        gunModel[236] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 414
        gunModel[237] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Box 415
        gunModel[238] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 416
        gunModel[239] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // Box 417
        gunModel[240] = new ModelRendererTurbo(this, 113, 177, textureX, textureY); // Box 418
        gunModel[241] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 419
        gunModel[242] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Box 420
        gunModel[243] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box 421
        gunModel[244] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Box 422
        gunModel[245] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 423
        gunModel[246] = new ModelRendererTurbo(this, 201, 177, textureX, textureY); // Box 424
        gunModel[247] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Box 425
        gunModel[248] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Box 426
        gunModel[249] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Box 427
        gunModel[250] = new ModelRendererTurbo(this, 249, 177, textureX, textureY); // Box 428
        gunModel[251] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 429
        gunModel[252] = new ModelRendererTurbo(this, 265, 177, textureX, textureY); // Box 430
        gunModel[253] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Box 431
        gunModel[254] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Box 432
        gunModel[255] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Box 433
        gunModel[256] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Box 434
        gunModel[257] = new ModelRendererTurbo(this, 345, 177, textureX, textureY); // Box 435
        gunModel[258] = new ModelRendererTurbo(this, 377, 177, textureX, textureY); // Box 436
        gunModel[259] = new ModelRendererTurbo(this, 401, 177, textureX, textureY); // Box 437
        gunModel[260] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Box 438
        gunModel[261] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 439
        gunModel[262] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Box 440
        gunModel[263] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 441
        gunModel[264] = new ModelRendererTurbo(this, 473, 177, textureX, textureY); // Box 442
        gunModel[265] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 443
        gunModel[266] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 444
        gunModel[267] = new ModelRendererTurbo(this, 33, 185, textureX, textureY); // Box 445
        gunModel[268] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Box 446
        gunModel[269] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 447
        gunModel[270] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Box 448
        gunModel[271] = new ModelRendererTurbo(this, 81, 185, textureX, textureY); // Box 449
        gunModel[272] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Box 450
        gunModel[273] = new ModelRendererTurbo(this, 113, 185, textureX, textureY); // Box 451
        gunModel[274] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Box 452
        gunModel[275] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Box 453
        gunModel[276] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Box 454
        gunModel[277] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Box 455
        gunModel[278] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 456
        gunModel[279] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // Box 457
        gunModel[280] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Box 458
        gunModel[281] = new ModelRendererTurbo(this, 321, 185, textureX, textureY); // Box 459
        gunModel[282] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 460
        gunModel[283] = new ModelRendererTurbo(this, 481, 185, textureX, textureY); // Box 461
        gunModel[284] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 462
        gunModel[285] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Box 463
        gunModel[286] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Box 464
        gunModel[287] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Box 465
        gunModel[288] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box 466
        gunModel[289] = new ModelRendererTurbo(this, 113, 193, textureX, textureY); // Box 467
        gunModel[290] = new ModelRendererTurbo(this, 137, 193, textureX, textureY); // Box 468
        gunModel[291] = new ModelRendererTurbo(this, 153, 193, textureX, textureY); // Box 469
        gunModel[292] = new ModelRendererTurbo(this, 201, 193, textureX, textureY); // Box 471
        gunModel[293] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Box 472
        gunModel[294] = new ModelRendererTurbo(this, 257, 193, textureX, textureY); // Box 473
        gunModel[295] = new ModelRendererTurbo(this, 273, 193, textureX, textureY); // Box 474
        gunModel[296] = new ModelRendererTurbo(this, 273, 193, textureX, textureY); // Box 477
        gunModel[297] = new ModelRendererTurbo(this, 297, 193, textureX, textureY); // Box 478
        gunModel[298] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); // Box 479
        gunModel[299] = new ModelRendererTurbo(this, 385, 185, textureX, textureY); // Box 492
        gunModel[300] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 495
        gunModel[301] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 496
        gunModel[302] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // Box 509
        gunModel[303] = new ModelRendererTurbo(this, 345, 193, textureX, textureY); // Box 510
        gunModel[304] = new ModelRendererTurbo(this, 393, 193, textureX, textureY); // Box 511
        gunModel[305] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Box 512
        gunModel[306] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 513
        gunModel[307] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 514
        gunModel[308] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Box 515
        gunModel[309] = new ModelRendererTurbo(this, 433, 193, textureX, textureY); // Box 516
        gunModel[310] = new ModelRendererTurbo(this, 449, 193, textureX, textureY); // Box 517
        gunModel[311] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 518
        gunModel[312] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Box 519
        gunModel[313] = new ModelRendererTurbo(this, 417, 177, textureX, textureY); // Box 520
        gunModel[314] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 521
        gunModel[315] = new ModelRendererTurbo(this, 489, 193, textureX, textureY); // Box 522
        gunModel[316] = new ModelRendererTurbo(this, 41, 201, textureX, textureY); // Box 523
        gunModel[317] = new ModelRendererTurbo(this, 129, 201, textureX, textureY); // Box 524
        gunModel[318] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Box 525
        gunModel[319] = new ModelRendererTurbo(this, 249, 185, textureX, textureY); // Box 526
        gunModel[320] = new ModelRendererTurbo(this, 137, 185, textureX, textureY); // Box 527
        gunModel[321] = new ModelRendererTurbo(this, 361, 193, textureX, textureY); // Box 528
        gunModel[322] = new ModelRendererTurbo(this, 17, 201, textureX, textureY); // Box 529
        gunModel[323] = new ModelRendererTurbo(this, 57, 201, textureX, textureY); // Box 530
        gunModel[324] = new ModelRendererTurbo(this, 105, 201, textureX, textureY); // Box 531
        gunModel[325] = new ModelRendererTurbo(this, 145, 201, textureX, textureY); // Box 532
        gunModel[326] = new ModelRendererTurbo(this, 161, 201, textureX, textureY); // Box 533
        gunModel[327] = new ModelRendererTurbo(this, 265, 201, textureX, textureY); // Box 534
        gunModel[328] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Box 535
        gunModel[329] = new ModelRendererTurbo(this, 193, 201, textureX, textureY); // Box 536
        gunModel[330] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 537
        gunModel[331] = new ModelRendererTurbo(this, 14, 322, textureX, textureY); // Box 364
        gunModel[332] = new ModelRendererTurbo(this, 54, 350, textureX, textureY); // Box 364
        gunModel[333] = new ModelRendererTurbo(this, 54, 350, textureX, textureY); // Box 364
        gunModel[334] = new ModelRendererTurbo(this, 54, 350, textureX, textureY); // Box 364
        gunModel[335] = new ModelRendererTurbo(this, 54, 350, textureX, textureY); // Box 364
        gunModel[336] = new ModelRendererTurbo(this, 54, 350, textureX, textureY); // Box 364
        gunModel[337] = new ModelRendererTurbo(this, 54, 350, textureX, textureY); // Box 364
        gunModel[338] = new ModelRendererTurbo(this, 54, 350, textureX, textureY); // Box 364
        gunModel[339] = new ModelRendererTurbo(this, 54, 350, textureX, textureY); // Box 364
        gunModel[340] = new ModelRendererTurbo(this, 54, 350, textureX, textureY); // Box 364

        gunModel[0].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
        gunModel[0].setRotationPoint(-24F, -31.5F, 1.5F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 1
        gunModel[1].setRotationPoint(-28F, -31.5F, 1.5F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.75F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 1.25F, 0F); // Box 2
        gunModel[2].setRotationPoint(-33F, -31.5F, 1.5F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 2.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, 2.25F, 0F); // Box 3
        gunModel[3].setRotationPoint(-42F, -31.5F, 1.5F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 9, 15, 1, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -4.25F, -0.5F, 0F, -4.75F, 0F, 0F, -0.25F, 0F); // Box 4
        gunModel[4].setRotationPoint(-51F, -31.5F, 1.5F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 6, 20, 1, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -0.5F, 0F, -4.75F, -0.5F, 0F, -5.25F, 0F, 0F, -1.75F, 0F); // Box 5
        gunModel[5].setRotationPoint(-57F, -31.5F, 1.5F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 7, 19, 1, 0F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Box 6
        gunModel[6].setRotationPoint(-64F, -31.5F, 1.5F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 7, 20, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 7
        gunModel[7].setRotationPoint(-64F, -32F, -1F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 6, 21, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -1.5F, 0F); // Box 8
        gunModel[8].setRotationPoint(-57F, -32F, -1F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 9, 16, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F); // Box 9
        gunModel[9].setRotationPoint(-51F, -32F, -1F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0F); // Box 10
        gunModel[10].setRotationPoint(-42F, -32F, -1F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F); // Box 11
        gunModel[11].setRotationPoint(-28F, -32F, -1F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 5, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.5F, 0F); // Box 12
        gunModel[12].setRotationPoint(-33F, -32F, -1F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 11, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 13
        gunModel[13].setRotationPoint(-24F, -32F, -1F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 7, 20, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Box 14
        gunModel[14].setRotationPoint(-64F, -32F, 1F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 6, 21, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -5F, 0F, 0F, -5.25F, 0F, 0F, -1.75F, 0F); // Box 15
        gunModel[15].setRotationPoint(-57F, -32F, 1F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 9, 16, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.75F, 0F, 0F, -0.25F, 0F); // Box 16
        gunModel[16].setRotationPoint(-51F, -32F, 1F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 9, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 2.25F, 0F); // Box 17
        gunModel[17].setRotationPoint(-42F, -32F, 1F);

        gunModel[18].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 18
        gunModel[18].setRotationPoint(-28F, -32F, 1F);

        gunModel[19].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F); // Box 19
        gunModel[19].setRotationPoint(-33F, -32F, 1F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 11, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 20
        gunModel[20].setRotationPoint(-24F, -32F, 1F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 21
        gunModel[21].setRotationPoint(-24F, -31.5F, -2.5F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F); // Box 22
        gunModel[22].setRotationPoint(-28F, -31.5F, -2.5F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 1.75F, -0.5F); // Box 23
        gunModel[23].setRotationPoint(-33F, -31.5F, -2.5F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 2.25F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.5F, 0F, 2.75F, -0.5F); // Box 24
        gunModel[24].setRotationPoint(-42F, -31.5F, -2.5F);

        gunModel[25].addShapeBox(0F, 0F, 0F, 9, 15, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -4.75F, 0F, 0F, -4.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 25
        gunModel[25].setRotationPoint(-51F, -31.5F, -2.5F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 6, 20, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -1.75F, 0F, 0F, -5.25F, 0F, 0F, -4.75F, -0.5F, 0F, -1.25F, -0.5F); // Box 26
        gunModel[26].setRotationPoint(-57F, -31.5F, -2.5F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 7, 19, 1, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 27
        gunModel[27].setRotationPoint(-64F, -31.5F, -2.5F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 7, 20, 1, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 28
        gunModel[28].setRotationPoint(-64F, -32F, -2F);

        gunModel[29].addShapeBox(0F, 0F, 0F, 6, 21, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -5.25F, 0F, 0F, -5F, 0F, 0F, -1.5F, 0F); // Box 29
        gunModel[29].setRotationPoint(-57F, -32F, -2F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 9, 16, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -4.75F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F); // Box 30
        gunModel[30].setRotationPoint(-51F, -32F, -2F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 9, 9, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.25F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0F); // Box 31
        gunModel[31].setRotationPoint(-42F, -32F, -2F);

        gunModel[32].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F); // Box 32
        gunModel[32].setRotationPoint(-28F, -32F, -2F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 1.5F, 0F); // Box 33
        gunModel[33].setRotationPoint(-33F, -32F, -2F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 11, 7, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 34
        gunModel[34].setRotationPoint(-24F, -32F, -2F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 2, 19, 1, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 35
        gunModel[35].setRotationPoint(-66F, -31.5F, -2.5F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 2, 20, 1, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 36
        gunModel[36].setRotationPoint(-66F, -32F, -2F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 2, 19, 1, 0F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Box 37
        gunModel[37].setRotationPoint(-66F, -31.5F, 1.5F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 2, 20, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Box 38
        gunModel[38].setRotationPoint(-66F, -32F, 1F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 2, 20, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 39
        gunModel[39].setRotationPoint(-66F, -32F, -1F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 1, 20, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 40
        gunModel[40].setRotationPoint(-64F, -32F, -1F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 41
        gunModel[41].setRotationPoint(-64F, -32F, 1F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F); // Box 42
        gunModel[42].setRotationPoint(-64F, -31.5F, 2F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 43
        gunModel[43].setRotationPoint(-64F, -32F, -2F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 44
        gunModel[44].setRotationPoint(-64F, -31.5F, -3F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F); // Box 45
        gunModel[45].setRotationPoint(-13F, -32F, -1F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 46
        gunModel[46].setRotationPoint(-11F, -32F, -1F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 3, 7, 2, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0.25F, 0F); // Box 47
        gunModel[47].setRotationPoint(-9F, -32F, -1F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F); // Box 48
        gunModel[48].setRotationPoint(-6F, -36F, -1F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 49
        gunModel[49].setRotationPoint(-11F, -25F, -1F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 50
        gunModel[50].setRotationPoint(-9F, -24F, -1F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F); // Box 51
        gunModel[51].setRotationPoint(-6F, -36F, 1F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 1.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0.25F, 0F); // Box 52
        gunModel[52].setRotationPoint(-9F, -32F, 1F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0F, 0F); // Box 53
        gunModel[53].setRotationPoint(-11F, -32F, 1F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F); // Box 54
        gunModel[54].setRotationPoint(-13F, -32F, 1F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -1.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1.75F, -0.5F, 0F); // Box 55
        gunModel[55].setRotationPoint(-11F, -25F, 1F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 56
        gunModel[56].setRotationPoint(-9F, -24F, 1F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.75F, -0.25F, -0.5F, 0F, -1F, -0.5F); // Box 57
        gunModel[57].setRotationPoint(-13F, -32F, 2F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.75F, -0.5F, -0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.75F, -0.25F, -0.5F); // Box 58
        gunModel[58].setRotationPoint(-11F, -32F, 2F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, 0.25F, 0F, 0F, 1.75F, 0F, 0F, 1.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, -0.5F, 0F, 0.25F, -0.5F); // Box 59
        gunModel[59].setRotationPoint(-9F, -32F, 2F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F, 0F, -2.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -0.5F, 0F, -2.75F, -0.5F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0.25F, -0.5F); // Box 60
        gunModel[60].setRotationPoint(-6F, -36F, 2F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -1.75F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -2.25F, -0.5F, -0.5F); // Box 61
        gunModel[61].setRotationPoint(-11F, -25F, 2F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.25F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 62
        gunModel[62].setRotationPoint(-9F, -24F, 2F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F, 0F, -2.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F); // Box 63
        gunModel[63].setRotationPoint(-6F, -36F, -2F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, 0.25F, 0F, 0F, 1.75F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0.25F, 0F); // Box 64
        gunModel[64].setRotationPoint(-9F, -32F, -2F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 65
        gunModel[65].setRotationPoint(-11F, -32F, -2F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F); // Box 66
        gunModel[66].setRotationPoint(-13F, -32F, -2F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.75F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 67
        gunModel[67].setRotationPoint(-11F, -25F, -2F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.25F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 68
        gunModel[68].setRotationPoint(-9F, -24F, -2F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.5F, 0.75F, -0.25F, -0.5F, 0.25F, 0F, 0F, 0F, -0.5F, 0F); // Box 69
        gunModel[69].setRotationPoint(-13F, -32F, -3F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, -0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, -0.25F, 0F, 0F); // Box 70
        gunModel[70].setRotationPoint(-11F, -32F, -3F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, -0.25F, -0.5F, 0F, 1.25F, -0.5F, 0F, 1.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -1.75F, -0.5F, 0F, -1.75F, 0F, 0F, 0.25F, 0F); // Box 71
        gunModel[71].setRotationPoint(-9F, -32F, -3F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F, 0F, -2.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -2.25F, 0F, 0F, 0.25F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0.25F, 0F); // Box 72
        gunModel[72].setRotationPoint(-6F, -36F, -3F);

        gunModel[73].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.75F, 0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -2.25F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, -1.75F, -0.5F, 0F); // Box 73
        gunModel[73].setRotationPoint(-11F, -25F, -3F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F, -0.5F, 0F, 0.25F, -0.5F, 0F, -1F, 0F, -0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
        gunModel[74].setRotationPoint(-9F, -24F, -3F);

        gunModel[75].addShapeBox(0F, 0F, 0F, 3, 9, 4, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F); // Box 77
        gunModel[75].setRotationPoint(-4F, -31F, -2F);

        gunModel[76].addShapeBox(0F, 0F, 0F, 13, 8, 4, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 78
        gunModel[76].setRotationPoint(-1F, -31F, -2F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F, 1F, -3.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 1F, -3.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 79
        gunModel[77].setRotationPoint(-8F, -28F, -2F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 80
        gunModel[78].setRotationPoint(-4F, -31F, -3F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 13, 9, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.5F, 0F, -5.5F, -0.5F, 0F, -5.25F, 0F, 0F, 0F, 0F); // Box 81
        gunModel[79].setRotationPoint(-1F, -31F, -3F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0.75F, -3.5F, -0.5F, 0.25F, -0.25F, -0.5F, 0F, 0F, -0.25F, 1F, -3.25F, -0.25F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 82
        gunModel[80].setRotationPoint(-8F, -28F, -3F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 83
        gunModel[81].setRotationPoint(-4F, -31F, 2F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 13, 9, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -5.25F, 0F, 0F, -5.5F, -0.5F, 0.5F, 0F, -0.5F); // Box 84
        gunModel[82].setRotationPoint(-1F, -31F, 2F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 1F, -3.25F, -0.25F, 0F, 0F, -0.25F, 0.25F, -0.25F, -0.5F, 0.75F, -3.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 85
        gunModel[83].setRotationPoint(-8F, -28F, 2F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 86
        gunModel[84].setRotationPoint(-4F, -34F, -2.5F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 87
        gunModel[85].setRotationPoint(-3.25F, -34F, -2.5F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F); // Box 88
        gunModel[86].setRotationPoint(-2.25F, -34F, -2.5F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 89
        gunModel[87].setRotationPoint(-0.25F, -34F, -2.5F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.5F, 0.15F, -0.25F, -0.5F, 0.15F, -0.25F, -0.5F, 0.15F, 0F, -0.5F, 0.15F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 90
        gunModel[88].setRotationPoint(-0.25F, -34.5F, -2.5F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, -0.25F, -0.5F, 0.35F, 0F, -0.5F, 0.15F, 0F, -0.5F, 0.15F, -0.25F, -0.5F, 0.35F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.5F); // Box 91
        gunModel[89].setRotationPoint(-2.25F, -34.5F, -2.5F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.5F, -0.25F, -0.5F, 0.35F, 0F, -0.5F, 0.15F, 0F, -0.5F, 0.15F, -0.25F, -0.5F, 0.35F); // Box 92
        gunModel[90].setRotationPoint(-2.25F, -32.25F, -2.5F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.5F, 0.15F, -0.25F, -0.5F, 0.15F, -0.25F, -0.5F, 0.15F, 0F, -0.5F, 0.15F); // Box 93
        gunModel[91].setRotationPoint(-0.25F, -32.25F, -2.5F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 11, 4, 5, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 94
        gunModel[92].setRotationPoint(0.75F, -34F, -2.5F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 95
        gunModel[93].setRotationPoint(0.75F, -33.5F, -3.5F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 96
        gunModel[94].setRotationPoint(0.75F, -33.5F, -3.5F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 97
        gunModel[95].setRotationPoint(0.75F, -32F, -3.5F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 98
        gunModel[96].setRotationPoint(0.75F, -33.5F, 2.5F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 99
        gunModel[97].setRotationPoint(0.75F, -33.5F, 2.5F);

        gunModel[98].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 100
        gunModel[98].setRotationPoint(0.75F, -32F, 2.5F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 10, 3, 8, 0F, -0.5F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.75F, -1.25F, 0F, -1.75F, -1.25F, -0.5F, 0F, 0F); // Box 101
        gunModel[99].setRotationPoint(-9.25F, -31.75F, -4F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 1.25F, 0F, -0.15F, -2F, -0.5F, -0.4F, -0.25F, -0.5F, 0F, 0F, 0F, -1.75F, 1.25F, 0F, -1.9F, -2F, -0.5F, -0.4F, -0.25F); // Box 102
        gunModel[100].setRotationPoint(-9.25F, -31.75F, 4F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, -0.5F, -0.4F, -0.75F, 0F, -0.15F, 1F, 0F, -0.4F, -1.85F, -0.5F, -1.1F, 0.15F, -0.5F, -0.4F, -0.75F, 0F, -1.9F, 1F, 0F, -2.15F, -1.85F, -0.5F, -1.1F, 0.15F); // Box 103
        gunModel[101].setRotationPoint(-9.25F, -31.75F, 4F);

        gunModel[102].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, -0.5F, -0.4F, -0.25F, 0F, -0.15F, -2F, 0F, 0F, 1.25F, -0.5F, 0F, 0F, -0.5F, -0.4F, -0.25F, 0F, -1.9F, -2F, 0F, -1.75F, 1.25F, -0.5F, 0F, 0F); // Box 104
        gunModel[102].setRotationPoint(-9.25F, -31.75F, -5F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, -0.5F, -1.1F, 0.15F, 0F, -0.4F, -1.85F, 0F, -0.15F, 1F, -0.5F, -0.4F, -0.75F, -0.5F, -1.1F, 0.15F, 0F, -2.15F, -1.85F, 0F, -1.9F, 1F, -0.5F, -0.4F, -0.75F); // Box 105
        gunModel[103].setRotationPoint(-9.25F, -31.75F, -5F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 106
        gunModel[104].setRotationPoint(-2F, -37F, -2F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 107
        gunModel[105].setRotationPoint(-3F, -37F, -2F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, -1.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -1.25F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 108
        gunModel[106].setRotationPoint(-4F, -37F, -2F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1.5F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -1.25F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 112
        gunModel[107].setRotationPoint(-4F, -37F, -2.5F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.25F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 113
        gunModel[108].setRotationPoint(-3F, -37F, -2.5F);

        gunModel[109].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 114
        gunModel[109].setRotationPoint(-2F, -37F, -2.5F);

        gunModel[110].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 130
        gunModel[110].setRotationPoint(-4F, -37F, 1.5F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 131
        gunModel[111].setRotationPoint(-3F, -37F, 1.5F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 132
        gunModel[112].setRotationPoint(-2F, -37F, 1.5F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F); // Box 133
        gunModel[113].setRotationPoint(2F, -23F, -2F);

        gunModel[114].addShapeBox(0F, 0F, 0F, 4, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 134
        gunModel[114].setRotationPoint(11F, -31F, -1.5F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 2, 9, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
        gunModel[115].setRotationPoint(-1F, -31F, -2F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 23, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        gunModel[116].setRotationPoint(8.75F, -36F, -1.5F);

        gunModel[117].addShapeBox(0F, 0F, 0F, 23, 2, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
        gunModel[117].setRotationPoint(8.75F, -36F, -2.5F);

        gunModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 138
        gunModel[118].setRotationPoint(9.25F, -36.25F, -1.5F);

        gunModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
        gunModel[119].setRotationPoint(10.25F, -36.25F, -1F);

        gunModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 140
        gunModel[120].setRotationPoint(11.25F, -36.25F, -1.5F);

        gunModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 141
        gunModel[121].setRotationPoint(9.25F, -36.25F, -2F);

        gunModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 142
        gunModel[122].setRotationPoint(11.25F, -36.25F, -2F);

        gunModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 143
        gunModel[123].setRotationPoint(9.25F, -36.25F, 1F);

        gunModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 144
        gunModel[124].setRotationPoint(11.25F, -36.25F, 1F);

        gunModel[125].addShapeBox(0F, 0F, 0F, 23, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 145
        gunModel[125].setRotationPoint(8.75F, -36F, 1.5F);

        gunModel[126].addShapeBox(0F, 0F, 0F, 4, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F); // Box 146
        gunModel[126].setRotationPoint(12F, -34F, -2.5F);

        gunModel[127].addShapeBox(0F, 0F, 0F, 107, 5, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.5F); // Box 148
        gunModel[127].setRotationPoint(16F, -34F, 2F);

        gunModel[128].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -1.25F, -0.5F, 0F, 0.5F, -0.5F); // Box 149
        gunModel[128].setRotationPoint(12F, -34F, 2.5F);

        gunModel[129].addShapeBox(0F, 0F, 0F, 107, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -0.5F); // Box 150
        gunModel[129].setRotationPoint(16F, -34F, 2.5F);

        gunModel[130].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1F, 0F, 0F, 0.75F, 0F); // Box 152
        gunModel[130].setRotationPoint(12F, -34F, -3.5F);

        gunModel[131].addShapeBox(0F, 0F, 0F, 107, 5, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 153
        gunModel[131].setRotationPoint(16F, -34F, -3.5F);

        gunModel[132].addShapeBox(0F, 0F, 0F, 107, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 154
        gunModel[132].setRotationPoint(16F, -30F, -1.5F);

        gunModel[133].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -3.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, -3F, -0.5F); // Box 155
        gunModel[133].setRotationPoint(11F, -31F, -2F);

        gunModel[134].addShapeBox(0F, 0F, 0F, 78, 7, 1, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -4.75F, 0F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F); // Box 156
        gunModel[134].setRotationPoint(15F, -31F, -2F);

        gunModel[135].addShapeBox(0F, 0F, 0F, 78, 7, 3, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F); // Box 157
        gunModel[135].setRotationPoint(15F, -31F, -1.5F);

        gunModel[136].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, -3.25F, 0F); // Box 158
        gunModel[136].setRotationPoint(11F, -31F, 1F);

        gunModel[137].addShapeBox(0F, 0F, 0F, 78, 7, 1, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.75F, 0F, 0F, -0.25F, 0F); // Box 159
        gunModel[137].setRotationPoint(15F, -31F, 1F);

        gunModel[138].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F); // Box 160
        gunModel[138].setRotationPoint(-9F, -22F, -1F);

        gunModel[139].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 161
        gunModel[139].setRotationPoint(-9F, -21F, -1F);

        gunModel[140].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.25F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.25F, -2F, 0F); // Box 162
        gunModel[140].setRotationPoint(-10F, -19F, -1F);

        gunModel[141].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F); // Box 163
        gunModel[141].setRotationPoint(-3F, -19F, -1F);

        gunModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.25F, 0F); // Box 164
        gunModel[142].setRotationPoint(-1F, -19F, -1F);

        gunModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0.25F, -0.5F, 0F); // Box 165
        gunModel[143].setRotationPoint(0F, -19F, -1F);

        gunModel[144].addShapeBox(0F, 0F, 0F, 5, 8, 2, 0F, 0.25F, 0F, 0F, -1.25F, -0.75F, 0F, -1.25F, -0.75F, 0F, 0.25F, 0F, 0F, 3.25F, -3.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 3.25F, -3.5F, 0F); // Box 166
        gunModel[144].setRotationPoint(-11F, -17F, -1F);

        gunModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F); // Box 168
        gunModel[145].setRotationPoint(-5F, -16F, -1F);

        gunModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.5F, 0F); // Box 169
        gunModel[146].setRotationPoint(-4F, -16F, -1F);

        gunModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 170
        gunModel[147].setRotationPoint(-7.5F, -12F, -1F);

        gunModel[148].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0.25F, 0F, 0F); // Box 171
        gunModel[148].setRotationPoint(-7F, -15F, -1F);

        gunModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 172
        gunModel[149].setRotationPoint(-7.5F, -11F, -1F);

        gunModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 173
        gunModel[150].setRotationPoint(-7.5F, -11F, -1F);

        gunModel[151].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F, 0.25F, 0F, 0F, -1.25F, -0.75F, 0F, -1.75F, -0.5F, 0F, -0.25F, 0F, 0F, 3.25F, -3.5F, 0F, -1.25F, 0F, 0F, -1.75F, -0.25F, 0F, 2.75F, -3.5F, 0F); // Box 174
        gunModel[151].setRotationPoint(-11F, -17F, 1F);

        gunModel[152].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0.75F, -0.25F, 0F, 0.25F, 0F, 0F, -1.75F, 0F, 0F, -2.25F, 0F, 0F, 0.75F, 0F, 0F); // Box 175
        gunModel[152].setRotationPoint(-7F, -15F, 1F);

        gunModel[153].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0F, 0F, 0.75F, 0.25F, 0F); // Box 176
        gunModel[153].setRotationPoint(-7F, -16F, 1F);

        gunModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0F, 0F); // Box 177
        gunModel[154].setRotationPoint(-5F, -16F, 1F);

        gunModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, -0.25F, 0.25F, 0F, -0.75F, 0F, 0F, 0.25F, 0.25F, 0F); // Box 178
        gunModel[155].setRotationPoint(-4F, -16F, 1F);

        gunModel[156].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 1.25F, -2F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.75F, -2F, 0F); // Box 179
        gunModel[156].setRotationPoint(-10F, -19F, 1F);

        gunModel[157].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F, -2.25F, 0F, 0.5F, -0.75F, 0F); // Box 180
        gunModel[157].setRotationPoint(-3F, -19F, 1F);

        gunModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F); // Box 181
        gunModel[158].setRotationPoint(-1F, -19F, 1F);

        gunModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, -0.5F, 0F, -0.5F, -0.75F, 0F, -1F, -1.25F, 0F, 0.5F, -1F, 0F); // Box 182
        gunModel[159].setRotationPoint(0F, -19F, 1F);

        gunModel[160].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 183
        gunModel[160].setRotationPoint(-9F, -21F, 1F);

        gunModel[161].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -1F, 0F); // Box 184
        gunModel[161].setRotationPoint(-9F, -22F, 1F);

        gunModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F); // Box 185
        gunModel[162].setRotationPoint(-7.5F, -12F, 1F);

        gunModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 186
        gunModel[163].setRotationPoint(-7.5F, -11F, 1F);

        gunModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 187
        gunModel[164].setRotationPoint(-7.5F, -11F, 1F);

        gunModel[165].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F, -0.25F, 0F, 0F, -1.75F, -0.5F, 0F, -1.25F, -0.75F, 0F, 0.25F, 0F, 0F, 2.75F, -3.5F, 0F, -1.75F, -0.25F, 0F, -1.25F, 0F, 0F, 3.25F, -3.5F, 0F); // Box 188
        gunModel[165].setRotationPoint(-11F, -17F, -2F);

        gunModel[166].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0.75F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.75F, 0F, 0F, -2.25F, 0F, 0F, -1.75F, 0F, 0F, 0.25F, 0F, 0F); // Box 189
        gunModel[166].setRotationPoint(-7F, -15F, -2F);

        gunModel[167].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.75F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.75F, 0.25F, 0F, -0.25F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 190
        gunModel[167].setRotationPoint(-7F, -16F, -2F);

        gunModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F); // Box 191
        gunModel[168].setRotationPoint(-5F, -16F, -2F);

        gunModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0.25F, 0.25F, 0F, -0.75F, 0F, 0F, -0.25F, 0.25F, 0F, 0F, 0.5F, 0F); // Box 192
        gunModel[169].setRotationPoint(-4F, -16F, -2F);

        gunModel[170].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, -2F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 1.25F, -2F, 0F); // Box 193
        gunModel[170].setRotationPoint(-10F, -19F, -2F);

        gunModel[171].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0F, -2.25F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F); // Box 194
        gunModel[171].setRotationPoint(-3F, -19F, -2F);

        gunModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.25F, 0F); // Box 195
        gunModel[172].setRotationPoint(-1F, -19F, -2F);

        gunModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, -1F, 0F, -1F, -1.25F, 0F, -0.5F, -0.75F, 0F, 0.25F, -0.5F, 0F); // Box 196
        gunModel[173].setRotationPoint(0F, -19F, -2F);

        gunModel[174].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 197
        gunModel[174].setRotationPoint(-9F, -21F, -2F);

        gunModel[175].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F); // Box 198
        gunModel[175].setRotationPoint(-9F, -22F, -2F);

        gunModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 199
        gunModel[176].setRotationPoint(-7.5F, -12F, -2F);

        gunModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 200
        gunModel[177].setRotationPoint(-7.5F, -11F, -2F);

        gunModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 201
        gunModel[178].setRotationPoint(-7.5F, -11F, -2F);

        gunModel[179].addShapeBox(0F, 0F, 0F, 107, 5, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.5F); // Box 202
        gunModel[179].setRotationPoint(16F, -34F, -3F);

        gunModel[180].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 203
        gunModel[180].setRotationPoint(-14.25F, -12.5F, -1F);
        gunModel[180].rotateAngleZ = -0.45378561F;

        gunModel[181].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F); // Box 204
        gunModel[181].setRotationPoint(-14.25F, -12.5F, 1F);
        gunModel[181].rotateAngleZ = -0.45378561F;

        gunModel[182].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 205
        gunModel[182].setRotationPoint(-14.25F, -12.5F, -2F);
        gunModel[182].rotateAngleZ = -0.45378561F;

        gunModel[183].addShapeBox(0F, 0F, 0F, 10, 9, 4, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F); // Box 206
        gunModel[183].setRotationPoint(1F, -31F, -2F);

        gunModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F); // Box 208
        gunModel[184].setRotationPoint(1F, -23F, -2F);

        gunModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, 0F, 0.25F); // Box 209
        gunModel[185].setRotationPoint(-1F, -23F, -2F);

        gunModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
        gunModel[186].setRotationPoint(2F, -19F, -1F);

        gunModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 211
        gunModel[187].setRotationPoint(1F, -19F, -1F);

        gunModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.75F, 1.25F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, 1.25F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 212
        gunModel[188].setRotationPoint(0F, -19F, -1F);

        gunModel[189].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F); // Box 213
        gunModel[189].setRotationPoint(3F, -19F, -1F);

        gunModel[190].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F); // Box 214
        gunModel[190].setRotationPoint(7F, -18.5F, -1F);

        gunModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 215
        gunModel[191].setRotationPoint(9F, -18.5F, -1F);

        gunModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F); // Box 216
        gunModel[192].setRotationPoint(9F, -18.5F, -1F);

        gunModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 217
        gunModel[193].setRotationPoint(9F, -19.5F, -1F);

        gunModel[194].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 218
        gunModel[194].setRotationPoint(9F, -22.5F, -2F);

        gunModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 219
        gunModel[195].setRotationPoint(11F, -23F, -2F);

        gunModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F); // Box 220
        gunModel[196].setRotationPoint(11F, -23F, -2F);

        gunModel[197].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
        gunModel[197].setRotationPoint(0F, -21.5F, -0.5F);

        gunModel[198].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 222
        gunModel[198].setRotationPoint(0F, -22.5F, -0.5F);

        gunModel[199].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 223
        gunModel[199].setRotationPoint(0F, -20.5F, -0.5F);

        gunModel[200].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 224
        gunModel[200].setRotationPoint(0F, -19.5F, -0.5F);

        gunModel[201].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
        gunModel[201].setRotationPoint(16.75F, -36.5F, -1.5F);

        gunModel[202].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 372
        gunModel[202].setRotationPoint(16.75F, -36.5F, 1.5F);

        gunModel[203].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
        gunModel[203].setRotationPoint(16.75F, -36.5F, 1.5F);

        gunModel[204].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
        gunModel[204].setRotationPoint(16.75F, -36.5F, -2.5F);

        gunModel[205].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 375
        gunModel[205].setRotationPoint(16.75F, -36.5F, -2.5F);

        gunModel[206].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
        gunModel[206].setRotationPoint(13F, -32F, -3.5F);

        gunModel[207].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F, -0.5F, 0F, 0F); // Box 385
        gunModel[207].setRotationPoint(88F, -36F, 4F);

        gunModel[208].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, -1.5F, -1.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, -1.5F, -1.5F, 0F, 1F); // Box 386
        gunModel[208].setRotationPoint(89F, -36F, 7F);

        gunModel[209].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F, 0F, 0F, 0F, -0.25F, 0F, 2.5F, 2.25F, 0F, -3.5F, -3F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 2.5F, 2.25F, 0F, -3.5F, -3F, 0F, 0F); // Box 387
        gunModel[209].setRotationPoint(90.5F, -36F, 12F);

        gunModel[210].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
        gunModel[210].setRotationPoint(75.5F, -39F, 43F);

        gunModel[211].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, -0.75F, 0F, 3.5F, 2F, 0F, -2.5F, -2.5F, 0F, 1F, 0F, 0F, 0F, -0.75F, 0F, 3.5F, 2F, 0F, -2.5F, -2.5F, 0F, 1F); // Box 389
        gunModel[211].setRotationPoint(93.5F, -36F, 17F);

        gunModel[212].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 3.5F, 2F, 0F, -5.5F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 3.5F, 2F, 0F, -5.5F, 0F, 0F, 1F); // Box 390
        gunModel[212].setRotationPoint(96F, -36F, 20F);

        gunModel[213].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
        gunModel[213].setRotationPoint(72.5F, -39F, 44F);

        gunModel[214].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 5.5F, 0F, 0F, -6.75F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 5.5F, 0F, 0F, -6.75F, 0F, 0F, 0F); // Box 392
        gunModel[214].setRotationPoint(79.5F, -39F, 43F);

        gunModel[215].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F, 0.75F, 0F, -0.5F, -3F, 0F, 3F, -1.5F, 0F, -4F, 0F, 0F, 0.25F, 0.75F, 0F, -0.5F, -3F, 0F, 3F, -1.5F, 0F, -4F, 0F, 0F, 0.25F); // Box 393
        gunModel[215].setRotationPoint(89.5F, -39F, 37F);

        gunModel[216].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, 0F, 2.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, 0F, 2.5F, 0F, -1F); // Box 394
        gunModel[216].setRotationPoint(95F, -39F, 29F);

        gunModel[217].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 395
        gunModel[217].setRotationPoint(96F, -39F, 20F);

        gunModel[218].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, -1F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
        gunModel[218].setRotationPoint(99F, -39F, 18F);

        gunModel[219].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0.5F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, 0F, 0.5F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, 0F); // Box 397
        gunModel[219].setRotationPoint(102F, -39F, 16F);

        gunModel[220].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, -2F, -0.5F, 0F, -0.5F, 0.25F, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, -2F, -0.5F, 0F, -0.5F, 0.25F, 0F, 0F, -1.5F, 0F, 1F); // Box 398
        gunModel[220].setRotationPoint(100F, -39F, 16F);

        gunModel[221].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 399
        gunModel[221].setRotationPoint(79F, -36F, -1.5F);

        gunModel[222].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 400
        gunModel[222].setRotationPoint(83F, -36F, -2.5F);

        gunModel[223].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 401
        gunModel[223].setRotationPoint(85F, -36F, -2.5F);

        gunModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
        gunModel[224].setRotationPoint(87F, -36F, -1.5F);

        gunModel[225].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -3.75F, 0F, -0.5F, 2.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3.75F, 0F, 0F, 2.5F, 0F, 0F, 0F); // Box 403
        gunModel[225].setRotationPoint(88F, -36F, -0.5F);

        gunModel[226].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F, -0.5F, 0F, 0F); // Box 404
        gunModel[226].setRotationPoint(88F, -29F, 4F);

        gunModel[227].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, -1.5F, -1.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, -1.5F, -1.5F, 0F, 1F); // Box 405
        gunModel[227].setRotationPoint(89F, -29F, 7F);

        gunModel[228].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F, 0F, 0F, 0F, -0.25F, 0F, 2.5F, 2.25F, 0F, -3.5F, -3F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 2.5F, 2.25F, 0F, -3.5F, -3F, 0F, 0F); // Box 406
        gunModel[228].setRotationPoint(90.5F, -29F, 12F);

        gunModel[229].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0F, 0F, 0F, -0.75F, 0F, 3.5F, 2F, 0F, -2.5F, -2.5F, 0F, 1F, 0F, 0F, 0F, -0.75F, 0F, 3.5F, 2F, 0F, -2.5F, -2.5F, 0F, 1F); // Box 407
        gunModel[229].setRotationPoint(93.5F, -29F, 17F);

        gunModel[230].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 3.5F, 2F, 0F, -5.5F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 3.5F, 2F, 0F, -5.5F, 0F, 0F, 1F); // Box 408
        gunModel[230].setRotationPoint(96F, -29F, 20F);

        gunModel[231].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 409
        gunModel[231].setRotationPoint(88F, -36F, -7F);

        gunModel[232].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F, -1.5F, 0F, 1F, 1.25F, 0F, -1.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 1F, 1.25F, 0F, -1.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 410
        gunModel[232].setRotationPoint(89F, -36F, -11F);

        gunModel[233].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F, -3F, 0F, 0F, 2.25F, 0F, -3.5F, -0.25F, 0F, 2.5F, 0F, 0F, 0F, -3F, 0F, 0F, 2.25F, 0F, -3.5F, -0.25F, 0F, 2.5F, 0F, 0F, 0F); // Box 411
        gunModel[233].setRotationPoint(90.5F, -36F, -17F);

        gunModel[234].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, -2.5F, 0F, 1F, 2F, 0F, -2.5F, -0.75F, 0F, 3.5F, 0F, 0F, 0F, -2.5F, 0F, 1F, 2F, 0F, -2.5F, -0.75F, 0F, 3.5F, 0F, 0F, 0F); // Box 412
        gunModel[234].setRotationPoint(93.5F, -36F, -19F);

        gunModel[235].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F, 0F, 0F, 1F, 2F, 0F, -5.5F, -0.5F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, -5.5F, -0.5F, 0F, 3.5F, 0F, 0F, 0F); // Box 413
        gunModel[235].setRotationPoint(96F, -36F, -25F);

        gunModel[236].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 414
        gunModel[236].setRotationPoint(88F, -29F, -7F);

        gunModel[237].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, -1.5F, 0F, 1F, 1.25F, 0F, -1.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 1F, 1.25F, 0F, -1.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 415
        gunModel[237].setRotationPoint(89F, -29F, -11F);

        gunModel[238].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F, -3F, 0F, 0F, 2.25F, 0F, -3.5F, -0.25F, 0F, 2.5F, 0F, 0F, 0F, -3F, 0F, 0F, 2.25F, 0F, -3.5F, -0.25F, 0F, 2.5F, 0F, 0F, 0F); // Box 416
        gunModel[238].setRotationPoint(90.5F, -29F, -17F);

        gunModel[239].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, -2.5F, 0F, 1F, 2F, 0F, -2.5F, -0.75F, 0F, 3.5F, 0F, 0F, 0F, -2.5F, 0F, 1F, 2F, 0F, -2.5F, -0.75F, 0F, 3.5F, 0F, 0F, 0F); // Box 417
        gunModel[239].setRotationPoint(93.5F, -29F, -19F);

        gunModel[240].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F, 0F, 0F, 1F, 2F, 0F, -5.5F, -0.5F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, -5.5F, -0.5F, 0F, 3.5F, 0F, 0F, 0F); // Box 418
        gunModel[240].setRotationPoint(96F, -29F, -25F);

        gunModel[241].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 419
        gunModel[241].setRotationPoint(88F, -29F, -4F);

        gunModel[242].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.25F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F); // Box 420
        gunModel[242].setRotationPoint(79F, -36F, -1.5F);

        gunModel[243].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F); // Box 421
        gunModel[243].setRotationPoint(83F, -36F, -2.5F);

        gunModel[244].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1F); // Box 422
        gunModel[244].setRotationPoint(85F, -36F, -2.5F);

        gunModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 423
        gunModel[245].setRotationPoint(87F, -36F, -1.5F);

        gunModel[246].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, -0.75F, 0F, 0F, -4F, 0F, 0F, 2.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -3.75F, 0F, -0.5F, 2.5F, 0F, -0.5F, 0F); // Box 424
        gunModel[246].setRotationPoint(88F, -36F, -0.5F);

        gunModel[247].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, -3.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, -3.75F, 0F, 0F, -0.5F); // Box 425
        gunModel[247].setRotationPoint(88F, -36F, -1.5F);

        gunModel[248].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, 2.25F, 0F, 0F, -4F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, -3.75F, 0F, -0.5F, -0.5F); // Box 426
        gunModel[248].setRotationPoint(88F, -36F, -1.5F);

        gunModel[249].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 1F, 1F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.5F, -0.25F, 1F, 1F, -0.25F, 0F); // Box 427
        gunModel[249].setRotationPoint(86F, -36F, 1.5F);

        gunModel[250].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -3F, -0.5F, 3F, 1.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2.25F, -3F, -0.25F, 3F, 1.5F, -0.25F, 0F); // Box 428
        gunModel[250].setRotationPoint(88F, -36F, 1.5F);

        gunModel[251].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 3F, -0.5F, 1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 3F, -0.25F, 1F); // Box 429
        gunModel[251].setRotationPoint(92F, -36F, 3.5F);

        gunModel[252].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F, 1.5F, -0.5F, 0F, -3F, -0.5F, 3F, 0F, -0.5F, -2.25F, 0F, -0.5F, 0F, 1.5F, -0.25F, 0F, -3F, -0.25F, 3F, 0F, -0.25F, -2.25F, 0F, -0.25F, 0F); // Box 430
        gunModel[252].setRotationPoint(88F, -36F, -4.5F);

        gunModel[253].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 3F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.25F, 3F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -0.25F); // Box 431
        gunModel[253].setRotationPoint(92F, -36F, -6.5F);

        gunModel[254].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 1F, -0.5F, 0F, -1.5F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.25F, 0F, -1.5F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 432
        gunModel[254].setRotationPoint(86F, -36F, -3.5F);

        gunModel[255].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
        gunModel[255].setRotationPoint(72.5F, -34F, 44F);

        gunModel[256].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
        gunModel[256].setRotationPoint(75.5F, -34F, 43F);

        gunModel[257].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 5.5F, 0F, 0F, -6.75F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 5.5F, 0F, 0F, -6.75F, 0F, 0F, 0F); // Box 435
        gunModel[257].setRotationPoint(79.5F, -34F, 43F);

        gunModel[258].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F, 0.75F, 0F, -0.5F, -3F, 0F, 3F, -1.5F, 0F, -4F, 0F, 0F, 0.25F, 0.75F, 0F, -0.5F, -3F, 0F, 3F, -1.5F, 0F, -4F, 0F, 0F, 0.25F); // Box 436
        gunModel[258].setRotationPoint(89.5F, -34F, 37F);

        gunModel[259].addShapeBox(0F, 0F, 0F, 3, 5, 6, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, 0F, 2.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, 0F, 2.5F, 0F, -1F); // Box 437
        gunModel[259].setRotationPoint(95F, -34F, 29F);

        gunModel[260].addShapeBox(0F, 0F, 0F, 2, 5, 9, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 438
        gunModel[260].setRotationPoint(96F, -34F, 20F);

        gunModel[261].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, -1F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
        gunModel[261].setRotationPoint(99F, -34F, 18F);

        gunModel[262].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0.5F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, 0F, 0.5F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, 0F); // Box 440
        gunModel[262].setRotationPoint(102F, -34F, 16F);

        gunModel[263].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, -2F, -0.5F, 0F, -0.5F, 0.25F, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, -2F, -0.5F, 0F, -0.5F, 0.25F, 0F, 0F, -1.5F, 0F, 1F); // Box 441
        gunModel[263].setRotationPoint(100F, -34F, 16F);

        gunModel[264].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F); // Box 442
        gunModel[264].setRotationPoint(75.5F, -39F, -46F);

        gunModel[265].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
        gunModel[265].setRotationPoint(72.5F, -39F, -46F);

        gunModel[266].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, -6.75F, -0.75F, 0F, 5.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.75F, -0.75F, 0F, 5.5F, 0.5F, 0F, 0F); // Box 444
        gunModel[266].setRotationPoint(79.5F, -39F, -46F);

        gunModel[267].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F, 0F, 0F, 0.25F, -1.5F, 0F, -4F, -3F, 0F, 3F, 0.75F, 0F, -0.5F, 0F, 0F, 0.25F, -1.5F, 0F, -4F, -3F, 0F, 3F, 0.75F, 0F, -0.5F); // Box 445
        gunModel[267].setRotationPoint(89.5F, -39F, -39F);

        gunModel[268].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F, 2.5F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0F, 2.5F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0F); // Box 446
        gunModel[268].setRotationPoint(95F, -39F, -35F);

        gunModel[269].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 447
        gunModel[269].setRotationPoint(96F, -39F, -29F);

        gunModel[270].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, -1F, 0F, 0F); // Box 448
        gunModel[270].setRotationPoint(99F, -39F, -20F);

        gunModel[271].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, 0F, 0.5F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, 0F, 0.5F, 0F, -0.5F); // Box 449
        gunModel[271].setRotationPoint(102F, -39F, -18F);

        gunModel[272].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, -1.5F, 0F, 1F, 0.25F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -2F, -1.5F, 0F, 1F, 0.25F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -2F); // Box 450
        gunModel[272].setRotationPoint(100F, -39F, -18F);

        gunModel[273].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
        gunModel[273].setRotationPoint(72.5F, -34F, -46F);

        gunModel[274].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F); // Box 452
        gunModel[274].setRotationPoint(75.5F, -34F, -46F);

        gunModel[275].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, -6.75F, -0.75F, 0F, 5.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.75F, -0.75F, 0F, 5.5F, 0.5F, 0F, 0F); // Box 453
        gunModel[275].setRotationPoint(79.5F, -34F, -46F);

        gunModel[276].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F, 0F, 0F, 0.25F, -1.5F, 0F, -4F, -3F, 0F, 3F, 0.75F, 0F, -0.5F, 0F, 0F, 0.25F, -1.5F, 0F, -4F, -3F, 0F, 3F, 0.75F, 0F, -0.5F); // Box 454
        gunModel[276].setRotationPoint(89.5F, -34F, -39F);

        gunModel[277].addShapeBox(0F, 0F, 0F, 3, 5, 6, 0F, 2.5F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0F, 2.5F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0F); // Box 455
        gunModel[277].setRotationPoint(95F, -34F, -35F);

        gunModel[278].addShapeBox(0F, 0F, 0F, 2, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 456
        gunModel[278].setRotationPoint(96F, -34F, -29F);

        gunModel[279].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, -1F, 0F, 0F); // Box 457
        gunModel[279].setRotationPoint(99F, -34F, -20F);

        gunModel[280].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, 0F, 0.5F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, 0F, 0.5F, 0F, -0.5F); // Box 458
        gunModel[280].setRotationPoint(102F, -34F, -18F);

        gunModel[281].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, -1.5F, 0F, 1F, 0.25F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -2F, -1.5F, 0F, 1F, 0.25F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -2F); // Box 459
        gunModel[281].setRotationPoint(100F, -34F, -18F);

        gunModel[282].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F, -3F, 0F, 0F, 2.25F, 0F, -3.5F, -0.25F, 0F, 2.5F, 0F, 0F, 0F, -3F, 0F, 0F, 2.25F, 0F, -3.5F, -0.25F, 0F, 2.5F, 0F, 0F, 0F); // Box 460
        gunModel[282].setRotationPoint(91F, -34F, -17F);

        gunModel[283].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F, -2.5F, 0F, 1F, 2F, 0F, -2.5F, -0.75F, 0F, 3.5F, 0F, 0F, 0F, -2.5F, 0F, 1F, 2F, 0F, -2.5F, -0.75F, 0F, 3.5F, 0F, 0F, 0F); // Box 461
        gunModel[283].setRotationPoint(94F, -34F, -19F);

        gunModel[284].addShapeBox(0F, 0F, 0F, 5, 5, 4, 0F, -1.5F, 0F, 1F, 1.25F, 0F, -1.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 1F, 1.25F, 0F, -1.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 462
        gunModel[284].setRotationPoint(89.5F, -34F, -11F);

        gunModel[285].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 463
        gunModel[285].setRotationPoint(88.5F, -34F, -7F);

        gunModel[286].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F, 0F, 0F, 0F, -0.25F, 0F, 2.5F, 2.25F, 0F, -3.5F, -3F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 2.5F, 2.25F, 0F, -3.5F, -3F, 0F, 0F); // Box 464
        gunModel[286].setRotationPoint(91F, -34F, 12F);

        gunModel[287].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F, 0F, 0F, 0F, -0.75F, 0F, 3.5F, 2F, 0F, -2.5F, -2.5F, 0F, 1F, 0F, 0F, 0F, -0.75F, 0F, 3.5F, 2F, 0F, -2.5F, -2.5F, 0F, 1F); // Box 465
        gunModel[287].setRotationPoint(94F, -34F, 17F);

        gunModel[288].addShapeBox(0F, 0F, 0F, 5, 5, 4, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, -1.5F, -1.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, -1.5F, -1.5F, 0F, 1F); // Box 466
        gunModel[288].setRotationPoint(89.5F, -34F, 7F);

        gunModel[289].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F, -0.5F, 0F, 0F); // Box 467
        gunModel[289].setRotationPoint(88.5F, -34F, 4F);

        gunModel[290].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 468
        gunModel[290].setRotationPoint(77.5F, -40F, 43F);

        gunModel[291].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, -0.75F); // Box 469
        gunModel[291].setRotationPoint(76.5F, -40F, 43F);

        gunModel[292].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, -0.25F, 0F, 0.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F); // Box 471
        gunModel[292].setRotationPoint(78.5F, -40F, 43F);

        gunModel[293].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 472
        gunModel[293].setRotationPoint(77.5F, -40F, -46F);

        gunModel[294].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, -0.75F); // Box 473
        gunModel[294].setRotationPoint(76.5F, -40F, -46F);

        gunModel[295].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, -0.25F, 0F, 0.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F); // Box 474
        gunModel[295].setRotationPoint(78.5F, -40F, -46F);

        gunModel[296].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F, 0F, 0F, -1.6F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -1.6F); // Box 477
        gunModel[296].setRotationPoint(69.75F, -36F, 39F);

        gunModel[297].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.4F, -0.35F, 0F, -1.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.4F, -0.35F, 0F, -1.75F); // Box 478
        gunModel[297].setRotationPoint(68F, -36F, 45F);

        gunModel[298].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, -0.35F, 0F, -1.75F, -0.25F, 0F, 0.4F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -1.75F, -0.25F, 0F, 0.4F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 479
        gunModel[298].setRotationPoint(68F, -36F, 41F);

        gunModel[299].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.25F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.75F); // Box 492
        gunModel[299].setRotationPoint(72F, -36F, 44F);

        gunModel[300].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.25F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.35F, 0.25F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.35F); // Box 495
        gunModel[300].setRotationPoint(72F, -36F, 50F);

        gunModel[301].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.25F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.75F, 0.25F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.75F); // Box 496
        gunModel[301].setRotationPoint(72F, -36F, 39F);

        gunModel[302].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F, 0F, 0F, -0.35F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -0.35F); // Box 509
        gunModel[302].setRotationPoint(76.25F, -36F, 39F);

        gunModel[303].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, -0.25F, 0F, 0.4F, -0.35F, 0F, -1.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.4F, -0.35F, 0F, -1.75F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 510
        gunModel[303].setRotationPoint(78F, -36F, 41F);

        gunModel[304].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -1.75F, -0.25F, 0F, 0.4F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -1.75F, -0.25F, 0F, 0.4F); // Box 511
        gunModel[304].setRotationPoint(78F, -36F, 45F);

        gunModel[305].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0F, 0F, 0F); // Box 512
        gunModel[305].setRotationPoint(74F, -36F, 44F);

        gunModel[306].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.35F, 0.25F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.35F, 0.25F, 0F, 0.75F, 0F, 0F, 0F); // Box 513
        gunModel[306].setRotationPoint(74F, -36F, 39F);

        gunModel[307].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.75F, 0.25F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.75F, 0.25F, 0F, -0.35F, 0F, 0F, 0F); // Box 514
        gunModel[307].setRotationPoint(74F, -36F, 50F);

        gunModel[308].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F, 0F, 0F, -1.6F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -1.6F); // Box 515
        gunModel[308].setRotationPoint(69.75F, -36F, -51F);

        gunModel[309].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, -0.35F, 0F, -1.75F, -0.25F, 0F, 0.4F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -1.75F, -0.25F, 0F, 0.4F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 516
        gunModel[309].setRotationPoint(68F, -36F, -49F);

        gunModel[310].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.4F, -0.35F, 0F, -1.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.4F, -0.35F, 0F, -1.75F); // Box 517
        gunModel[310].setRotationPoint(68F, -36F, -45F);

        gunModel[311].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.25F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.75F); // Box 518
        gunModel[311].setRotationPoint(72F, -36F, -46F);

        gunModel[312].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.25F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.75F, 0.25F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.75F); // Box 519
        gunModel[312].setRotationPoint(72F, -36F, -51F);

        gunModel[313].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.25F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.35F, 0.25F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.35F); // Box 520
        gunModel[313].setRotationPoint(72F, -36F, -40F);

        gunModel[314].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F, 0F, 0F, -0.35F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -0.35F); // Box 521
        gunModel[314].setRotationPoint(76.25F, -36F, -51F);

        gunModel[315].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -1.75F, -0.25F, 0F, 0.4F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -1.75F, -0.25F, 0F, 0.4F); // Box 522
        gunModel[315].setRotationPoint(78F, -36F, -45F);

        gunModel[316].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, -0.25F, 0F, 0.4F, -0.35F, 0F, -1.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.4F, -0.35F, 0F, -1.75F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 523
        gunModel[316].setRotationPoint(78F, -36F, -49F);

        gunModel[317].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0F, 0F, 0F); // Box 524
        gunModel[317].setRotationPoint(74F, -36F, -46F);

        gunModel[318].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.75F, 0.25F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.75F, 0.25F, 0F, -0.35F, 0F, 0F, 0F); // Box 525
        gunModel[318].setRotationPoint(74F, -36F, -40F);

        gunModel[319].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.35F, 0.25F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.35F, 0.25F, 0F, 0.75F, 0F, 0F, 0F); // Box 526
        gunModel[319].setRotationPoint(74F, -36F, -51F);

        gunModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 90, 0F, -0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.6F, -0.3F, 0F); // Box 527
        gunModel[320].setRotationPoint(67F, -35.5F, -45F);

        gunModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -1F, -0.3F, -0.7F, 0.4F, -0.3F, -0.7F, 0F, -0.3F, 0F, -0.6F, -0.3F, 0F, -1F, -0.3F, -0.7F, 0.4F, -0.3F, -0.7F, 0F, -0.3F, 0F, -0.6F, -0.3F, 0F); // Box 528
        gunModel[321].setRotationPoint(67F, -35.5F, -48F);

        gunModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -1.7F, -0.3F, -0.6F, 0.9F, -0.3F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -1.7F, -0.3F, -0.6F, 0.9F, -0.3F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 529
        gunModel[322].setRotationPoint(68F, -35.5F, -50F);

        gunModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0.4F, -0.3F, -0.7F, -1F, -0.3F, -0.7F, -0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0.4F, -0.3F, -0.7F, -1F, -0.3F, -0.7F); // Box 530
        gunModel[323].setRotationPoint(67F, -35.5F, 45F);

        gunModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.9F, -0.3F, -0.6F, -1.7F, -0.3F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.9F, -0.3F, -0.6F, -1.7F, -0.3F, -0.6F); // Box 531
        gunModel[324].setRotationPoint(68F, -35.5F, 47F);

        gunModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.3F, 0F, -0.6F, -0.3F, 0F, -1F, -0.3F, -0.7F, 0.4F, -0.3F, -0.7F, 0F, -0.3F, 0F, -0.6F, -0.3F, 0F, -1F, -0.3F, -0.7F, 0.4F, -0.3F, -0.7F); // Box 532
        gunModel[325].setRotationPoint(80F, -35.5F, 45F);

        gunModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -1.7F, -0.3F, -0.6F, 0.9F, -0.3F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -1.7F, -0.3F, -0.6F, 0.9F, -0.3F, -0.6F); // Box 533
        gunModel[326].setRotationPoint(79F, -35.5F, 47F);

        gunModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 90, 0F, 0F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 534
        gunModel[327].setRotationPoint(80F, -35.5F, -45F);

        gunModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0.4F, -0.3F, -0.7F, -1F, -0.3F, -0.7F, -0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0.4F, -0.3F, -0.7F, -1F, -0.3F, -0.7F, -0.6F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 535
        gunModel[328].setRotationPoint(80F, -35.5F, -48F);

        gunModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0.9F, -0.3F, -0.6F, -1.7F, -0.3F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.9F, -0.3F, -0.6F, -1.7F, -0.3F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 536
        gunModel[329].setRotationPoint(79F, -35.5F, -50F);

        gunModel[330].addShapeBox(0F, 0F, 0F, 47, 2, 4, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 537
        gunModel[330].setRotationPoint(32F, -35F, -2F);

        gunModel[331].addShapeBox(0F, 0F, 0F, 26, 1, 4, 0F, 0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 364
        gunModel[331].setRotationPoint(11F, -37.5F, -2F);

        gunModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.35F, 0F, 0.5F, -0.35F, 0F, 0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 364
        gunModel[332].setRotationPoint(11F, -37.8F, -2F);

        gunModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.35F, 0F, 0.5F, -0.35F, 0F, 0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 364
        gunModel[333].setRotationPoint(14F, -37.8F, -2F);

        gunModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.35F, 0F, 0.5F, -0.35F, 0F, 0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 364
        gunModel[334].setRotationPoint(17F, -37.8F, -2F);

        gunModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.35F, 0F, 0.5F, -0.35F, 0F, 0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 364
        gunModel[335].setRotationPoint(20F, -37.8F, -2F);

        gunModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.35F, 0F, 0.5F, -0.35F, 0F, 0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 364
        gunModel[336].setRotationPoint(23F, -37.8F, -2F);

        gunModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.35F, 0F, 0.5F, -0.35F, 0F, 0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 364
        gunModel[337].setRotationPoint(26F, -37.8F, -2F);

        gunModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.35F, 0F, 0.5F, -0.35F, 0F, 0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 364
        gunModel[338].setRotationPoint(29F, -37.8F, -2F);

        gunModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.35F, 0F, 0.5F, -0.35F, 0F, 0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 364
        gunModel[339].setRotationPoint(32F, -37.8F, -2F);

        gunModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.35F, 0F, 0.5F, -0.35F, 0F, 0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 364
        gunModel[340].setRotationPoint(35F, -37.8F, -2F);


        defaultScopeModel = new ModelRendererTurbo[144];
        defaultScopeModel[0] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 225
        defaultScopeModel[1] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 226
        defaultScopeModel[2] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 227
        defaultScopeModel[3] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 228
        defaultScopeModel[4] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 229
        defaultScopeModel[5] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 230
        defaultScopeModel[6] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 231
        defaultScopeModel[7] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 232
        defaultScopeModel[8] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 233
        defaultScopeModel[9] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 234
        defaultScopeModel[10] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 235
        defaultScopeModel[11] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 236
        defaultScopeModel[12] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 237
        defaultScopeModel[13] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 238
        defaultScopeModel[14] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 239
        defaultScopeModel[15] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 240
        defaultScopeModel[16] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 241
        defaultScopeModel[17] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 242
        defaultScopeModel[18] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 243
        defaultScopeModel[19] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 244
        defaultScopeModel[20] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 245
        defaultScopeModel[21] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 246
        defaultScopeModel[22] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 247
        defaultScopeModel[23] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Box 248
        defaultScopeModel[24] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 249
        defaultScopeModel[25] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 250
        defaultScopeModel[26] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 251
        defaultScopeModel[27] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 252
        defaultScopeModel[28] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 253
        defaultScopeModel[29] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 254
        defaultScopeModel[30] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 255
        defaultScopeModel[31] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 256
        defaultScopeModel[32] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 257
        defaultScopeModel[33] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 258
        defaultScopeModel[34] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 259
        defaultScopeModel[35] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 260
        defaultScopeModel[36] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 261
        defaultScopeModel[37] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 262
        defaultScopeModel[38] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 263
        defaultScopeModel[39] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 264
        defaultScopeModel[40] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 265
        defaultScopeModel[41] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 266
        defaultScopeModel[42] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 267
        defaultScopeModel[43] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 268
        defaultScopeModel[44] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 269
        defaultScopeModel[45] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 270
        defaultScopeModel[46] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 271
        defaultScopeModel[47] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 272
        defaultScopeModel[48] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 273
        defaultScopeModel[49] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 274
        defaultScopeModel[50] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 275
        defaultScopeModel[51] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 276
        defaultScopeModel[52] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 277
        defaultScopeModel[53] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 278
        defaultScopeModel[54] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 279
        defaultScopeModel[55] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 280
        defaultScopeModel[56] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 281
        defaultScopeModel[57] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 282
        defaultScopeModel[58] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 283
        defaultScopeModel[59] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 284
        defaultScopeModel[60] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 285
        defaultScopeModel[61] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 286
        defaultScopeModel[62] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 288
        defaultScopeModel[63] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 289
        defaultScopeModel[64] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 290
        defaultScopeModel[65] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 291
        defaultScopeModel[66] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 292
        defaultScopeModel[67] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 293
        defaultScopeModel[68] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 294
        defaultScopeModel[69] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 295
        defaultScopeModel[70] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 296
        defaultScopeModel[71] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 297
        defaultScopeModel[72] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 298
        defaultScopeModel[73] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 299
        defaultScopeModel[74] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 300
        defaultScopeModel[75] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Box 301
        defaultScopeModel[76] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 302
        defaultScopeModel[77] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 303
        defaultScopeModel[78] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 304
        defaultScopeModel[79] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 305
        defaultScopeModel[80] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 306
        defaultScopeModel[81] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 307
        defaultScopeModel[82] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 308
        defaultScopeModel[83] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 309
        defaultScopeModel[84] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 310
        defaultScopeModel[85] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 311
        defaultScopeModel[86] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 312
        defaultScopeModel[87] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 313
        defaultScopeModel[88] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 314
        defaultScopeModel[89] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 315
        defaultScopeModel[90] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 316
        defaultScopeModel[91] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Box 317
        defaultScopeModel[92] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 318
        defaultScopeModel[93] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 319
        defaultScopeModel[94] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Box 320
        defaultScopeModel[95] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 321
        defaultScopeModel[96] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 322
        defaultScopeModel[97] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 323
        defaultScopeModel[98] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 324
        defaultScopeModel[99] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Box 325
        defaultScopeModel[100] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 326
        defaultScopeModel[101] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Box 327
        defaultScopeModel[102] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 328
        defaultScopeModel[103] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 329
        defaultScopeModel[104] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 330
        defaultScopeModel[105] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 331
        defaultScopeModel[106] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 332
        defaultScopeModel[107] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 333
        defaultScopeModel[108] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 334
        defaultScopeModel[109] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Box 335
        defaultScopeModel[110] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Box 336
        defaultScopeModel[111] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Box 337
        defaultScopeModel[112] = new ModelRendererTurbo(this, 361, 145, textureX, textureY); // Box 338
        defaultScopeModel[113] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Box 339
        defaultScopeModel[114] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Box 340
        defaultScopeModel[115] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 341
        defaultScopeModel[116] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Box 342
        defaultScopeModel[117] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box 343
        defaultScopeModel[118] = new ModelRendererTurbo(this, 393, 153, textureX, textureY); // Box 344
        defaultScopeModel[119] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 345
        defaultScopeModel[120] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 346
        defaultScopeModel[121] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 347
        defaultScopeModel[122] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 348
        defaultScopeModel[123] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Box 349
        defaultScopeModel[124] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 351
        defaultScopeModel[125] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 352
        defaultScopeModel[126] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Box 353
        defaultScopeModel[127] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 354
        defaultScopeModel[128] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Box 355
        defaultScopeModel[129] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Box 356
        defaultScopeModel[130] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 357
        defaultScopeModel[131] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Box 358
        defaultScopeModel[132] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 359
        defaultScopeModel[133] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 360
        defaultScopeModel[134] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 361
        defaultScopeModel[135] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Box 362
        defaultScopeModel[136] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Box 363
        defaultScopeModel[137] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 364
        defaultScopeModel[138] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 365
        defaultScopeModel[139] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 366
        defaultScopeModel[140] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 367
        defaultScopeModel[141] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 368
        defaultScopeModel[142] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Box 369
        defaultScopeModel[143] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 370

        defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
        defaultScopeModel[0].setRotationPoint(13F, -47.65F, -2.5F);

        defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
        defaultScopeModel[1].setRotationPoint(-5F, -46.65F, -4.5F);

        defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, 0.25F, -1.15F, 0F, 0.25F, -1.15F, 0F, 0.25F, -1.15F, 0F, 0.25F, -1.15F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 227
        defaultScopeModel[2].setRotationPoint(-5F, -47.65F, -4.5F);

        defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0.35F); // Box 228
        defaultScopeModel[3].setRotationPoint(-5F, -49.65F, 0F);

        defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 229
        defaultScopeModel[4].setRotationPoint(-5F, -49.65F, -3F);

        defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0.35F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F); // Box 230
        defaultScopeModel[5].setRotationPoint(-5F, -41.65F, 0F);

        defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, -1.15F, 0F, 0.25F, -1.15F, 0F, 0.25F, -1.15F, 0F, 0.25F, -1.15F); // Box 231
        defaultScopeModel[6].setRotationPoint(-5F, -43.65F, -4.5F);

        defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 232
        defaultScopeModel[7].setRotationPoint(-5F, -41.65F, -3F);

        defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 233
        defaultScopeModel[8].setRotationPoint(-5F, -44.65F, -4.5F);

        defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 234
        defaultScopeModel[9].setRotationPoint(-6F, -46.65F, -4.5F);

        defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 10, 2, 9, 0F, 0F, 0.1F, -1.3F, 0F, 0.1F, -1.3F, 0F, 0.1F, -1.3F, 0F, 0.1F, -1.3F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 235
        defaultScopeModel[10].setRotationPoint(-2F, -47.65F, -4.5F);

        defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 236
        defaultScopeModel[11].setRotationPoint(-2F, -49.65F, 0F);

        defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F, 0F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 237
        defaultScopeModel[12].setRotationPoint(-2F, -49.65F, -3F);

        defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.1F, -1.3F, 0F, 0.1F, -1.3F, 0F, -0.2F, 0.7F, 0F, -0.2F, 0.7F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 238
        defaultScopeModel[13].setRotationPoint(-6F, -47.65F, -4.5F);

        defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 239
        defaultScopeModel[14].setRotationPoint(-6F, -49.65F, -3F);

        defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 240
        defaultScopeModel[15].setRotationPoint(-6F, -49.65F, -2F);

        defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 241
        defaultScopeModel[16].setRotationPoint(-6F, -46.65F, 3.5F);

        defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.2F, 0.7F, 0F, -0.2F, 0.7F, 0F, 0.1F, -1.3F, 0F, 0.1F, -1.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 242
        defaultScopeModel[17].setRotationPoint(-6F, -47.65F, 3.5F);

        defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 243
        defaultScopeModel[18].setRotationPoint(-6F, -49.65F, 2F);

        defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 244
        defaultScopeModel[19].setRotationPoint(-6F, -49.65F, 0F);

        defaultScopeModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 245
        defaultScopeModel[20].setRotationPoint(-6F, -44.65F, 3.5F);

        defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.2F, 0.7F, 0F, -0.2F, 0.7F, 0F, 0.1F, -1.3F, 0F, 0.1F, -1.3F); // Box 246
        defaultScopeModel[21].setRotationPoint(-6F, -43.65F, 3.5F);

        defaultScopeModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1F, -1.25F, 0F, -1F, -1.25F); // Box 247
        defaultScopeModel[22].setRotationPoint(-6F, -41.65F, 2F);

        defaultScopeModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F); // Box 248
        defaultScopeModel[23].setRotationPoint(-6F, -40.65F, 0F);

        defaultScopeModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 249
        defaultScopeModel[24].setRotationPoint(-6F, -40.65F, -2F);

        defaultScopeModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F); // Box 250
        defaultScopeModel[25].setRotationPoint(-6F, -41.65F, -3F);

        defaultScopeModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, -1.3F, 0F, 0.1F, -1.3F, 0F, -0.2F, 0.7F, 0F, -0.2F, 0.7F); // Box 251
        defaultScopeModel[26].setRotationPoint(-6F, -43.65F, -4.5F);

        defaultScopeModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 252
        defaultScopeModel[27].setRotationPoint(-6F, -44.65F, -4.5F);

        defaultScopeModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 253
        defaultScopeModel[28].setRotationPoint(2F, -49.65F, -3F);

        defaultScopeModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0.35F); // Box 254
        defaultScopeModel[29].setRotationPoint(2F, -49.65F, 0F);

        defaultScopeModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, 0F, 0.25F, -1.15F, 0F, 0.25F, -1.15F, 0F, 0.25F, -1.15F, 0F, 0.25F, -1.15F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 255
        defaultScopeModel[30].setRotationPoint(2F, -47.65F, -4.5F);

        defaultScopeModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
        defaultScopeModel[31].setRotationPoint(2F, -46.65F, -4.5F);

        defaultScopeModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 257
        defaultScopeModel[32].setRotationPoint(2F, -44.65F, -4.5F);

        defaultScopeModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, -1.15F, 0F, 0.25F, -1.15F, 0F, 0.25F, -1.15F, 0F, 0.25F, -1.15F); // Box 258
        defaultScopeModel[33].setRotationPoint(2F, -43.65F, -4.5F);

        defaultScopeModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0.35F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F); // Box 259
        defaultScopeModel[34].setRotationPoint(2F, -41.65F, 0F);

        defaultScopeModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 260
        defaultScopeModel[35].setRotationPoint(2F, -41.65F, -3F);

        defaultScopeModel[36].addShapeBox(0F, 0F, 0F, 10, 2, 9, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 261
        defaultScopeModel[36].setRotationPoint(-2F, -46.65F, -4.5F);

        defaultScopeModel[37].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 262
        defaultScopeModel[37].setRotationPoint(-2F, -41.65F, -3F);

        defaultScopeModel[38].addShapeBox(0F, 0F, 0F, 10, 2, 9, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.1F, -1.3F, 0F, 0.1F, -1.3F, 0F, 0.1F, -1.3F, 0F, 0.1F, -1.3F); // Box 263
        defaultScopeModel[38].setRotationPoint(-2F, -43.65F, -4.5F);

        defaultScopeModel[39].addShapeBox(0F, 0F, 0F, 10, 2, 9, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 264
        defaultScopeModel[39].setRotationPoint(-2F, -44.65F, -4.5F);

        defaultScopeModel[40].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, -1.25F, 0F, -1F, -1.25F); // Box 265
        defaultScopeModel[40].setRotationPoint(-2F, -41.65F, 0F);

        defaultScopeModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 266
        defaultScopeModel[41].setRotationPoint(8F, -49.65F, -3F);

        defaultScopeModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F, 0F, 0.25F, -1.15F, 0F, 0.25F, -1.15F, 0F, 0.25F, -1.15F, 0F, 0.25F, -1.15F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 267
        defaultScopeModel[42].setRotationPoint(8F, -47.65F, -4.5F);

        defaultScopeModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
        defaultScopeModel[43].setRotationPoint(8F, -46.65F, -4.5F);

        defaultScopeModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0.35F); // Box 269
        defaultScopeModel[44].setRotationPoint(8F, -49.65F, 0F);

        defaultScopeModel[45].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 270
        defaultScopeModel[45].setRotationPoint(12F, -45.15F, -2F);

        defaultScopeModel[46].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 271
        defaultScopeModel[46].setRotationPoint(12F, -46.15F, -2F);

        defaultScopeModel[47].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 272
        defaultScopeModel[47].setRotationPoint(12F, -47.15F, -2F);

        defaultScopeModel[48].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F); // Box 273
        defaultScopeModel[48].setRotationPoint(12F, -43.15F, -2F);

        defaultScopeModel[49].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 274
        defaultScopeModel[49].setRotationPoint(12F, -44.15F, -2F);

        defaultScopeModel[50].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, 0F, -1F, -1.25F, 0F, -1.5F, -1.5F, 0F, -1.25F, 0F, 0F, -0.75F, 0F, 0F, -0.1F, 0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, 0F, 0F, -0.1F, 0F); // Box 275
        defaultScopeModel[50].setRotationPoint(9F, -49.65F, -3F);

        defaultScopeModel[51].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, 0.1F, -1.3F, 0F, -0.3F, -1.7F, 0F, -0.3F, -1.7F, 0F, 0.1F, -1.3F, 0F, -0.75F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.75F, -0.5F); // Box 276
        defaultScopeModel[51].setRotationPoint(9F, -47.65F, -4.5F);

        defaultScopeModel[52].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F); // Box 277
        defaultScopeModel[52].setRotationPoint(9F, -46.65F, -4.5F);

        defaultScopeModel[53].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.5F, -1.5F, 0F, -1F, -1.25F, 0F, -0.1F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.2F, 0F, -0.1F, 0.2F); // Box 278
        defaultScopeModel[53].setRotationPoint(9F, -49.65F, 0F);

        defaultScopeModel[54].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, -0.75F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.75F, -0.5F, 0F, 0.1F, -1.3F, 0F, -0.3F, -1.7F, 0F, -0.3F, -1.7F, 0F, 0.1F, -1.3F); // Box 279
        defaultScopeModel[54].setRotationPoint(9F, -43.65F, -4.5F);

        defaultScopeModel[55].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, 0F, -0.1F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.2F, 0F, -0.1F, 0.2F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.5F, -1.5F, 0F, -1F, -1.25F); // Box 280
        defaultScopeModel[55].setRotationPoint(9F, -41.65F, 0F);

        defaultScopeModel[56].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.25F, -0.5F); // Box 281
        defaultScopeModel[56].setRotationPoint(9F, -44.65F, -4.5F);

        defaultScopeModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 282
        defaultScopeModel[57].setRotationPoint(8F, -44.65F, -4.5F);

        defaultScopeModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, -1.15F, 0F, 0.25F, -1.15F, 0F, 0.25F, -1.15F, 0F, 0.25F, -1.15F); // Box 283
        defaultScopeModel[58].setRotationPoint(8F, -43.65F, -4.5F);

        defaultScopeModel[59].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, 0F, -0.1F, 0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, 0F, 0F, -0.1F, 0F, 0F, -1F, -1.25F, 0F, -1.5F, -1.5F, 0F, -1.25F, 0F, 0F, -0.75F, 0F); // Box 284
        defaultScopeModel[59].setRotationPoint(9F, -41.65F, -3F);

        defaultScopeModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 285
        defaultScopeModel[60].setRotationPoint(8F, -41.65F, -3F);

        defaultScopeModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0.35F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F); // Box 286
        defaultScopeModel[61].setRotationPoint(8F, -41.65F, 0F);

        defaultScopeModel[62].addShapeBox(0F, 0F, 0F, 7, 2, 9, 0F, 0F, -0.3F, -1.7F, 0F, 0.25F, -1.15F, 0F, 0.25F, -1.15F, 0F, -0.3F, -1.7F, 0F, -0.5F, -1F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.5F, -1F); // Box 288
        defaultScopeModel[62].setRotationPoint(31F, -47.65F, -4.5F);

        defaultScopeModel[63].addShapeBox(0F, 0F, 0F, 7, 2, 9, 0F, 0F, -0.5F, -1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 289
        defaultScopeModel[63].setRotationPoint(31F, -46.65F, -4.5F);

        defaultScopeModel[64].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -1.25F, 0F, -1.5F, -1.5F, 0F, 0.3F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.35F, 0F, 0.3F, -0.2F); // Box 290
        defaultScopeModel[64].setRotationPoint(31F, -49.65F, 0F);

        defaultScopeModel[65].addShapeBox(0F, 0F, 0F, 17, 2, 3, 0F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 291
        defaultScopeModel[65].setRotationPoint(38F, -49.65F, -3F);

        defaultScopeModel[66].addShapeBox(0F, 0F, 0F, 17, 2, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0.35F); // Box 292
        defaultScopeModel[66].setRotationPoint(38F, -49.65F, 0F);

        defaultScopeModel[67].addShapeBox(0F, 0F, 0F, 17, 2, 9, 0F, 0F, 0.25F, -1.15F, 0F, 0.25F, -1.15F, 0F, 0.25F, -1.15F, 0F, 0.25F, -1.15F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 293
        defaultScopeModel[67].setRotationPoint(38F, -47.65F, -4.5F);

        defaultScopeModel[68].addShapeBox(0F, 0F, 0F, 17, 2, 9, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
        defaultScopeModel[68].setRotationPoint(38F, -46.65F, -4.5F);

        defaultScopeModel[69].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, -1.5F, -1.5F, 0F, -0.75F, -1.25F, 0F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, 0.3F, -0.2F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0F, 0F, 0.3F, 0F); // Box 295
        defaultScopeModel[69].setRotationPoint(31F, -49.65F, -3F);

        defaultScopeModel[70].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0.3F, -0.2F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0F, 0F, 0.3F, 0F, 0F, -1.5F, -1.5F, 0F, -0.75F, -1.25F, 0F, -0.5F, 0F, 0F, -1.25F, 0F); // Box 296
        defaultScopeModel[70].setRotationPoint(31F, -41.65F, -3F);

        defaultScopeModel[71].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0.3F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.35F, 0F, 0.3F, -0.2F, 0F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -1.25F, 0F, -1.5F, -1.5F); // Box 297
        defaultScopeModel[71].setRotationPoint(31F, -41.65F, 0F);

        defaultScopeModel[72].addShapeBox(0F, 0F, 0F, 17, 2, 3, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0.35F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F); // Box 298
        defaultScopeModel[72].setRotationPoint(38F, -41.65F, 0F);

        defaultScopeModel[73].addShapeBox(0F, 0F, 0F, 17, 2, 9, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, -1.15F, 0F, 0.25F, -1.15F, 0F, 0.25F, -1.15F, 0F, 0.25F, -1.15F); // Box 299
        defaultScopeModel[73].setRotationPoint(38F, -43.65F, -4.5F);

        defaultScopeModel[74].addShapeBox(0F, 0F, 0F, 7, 2, 9, 0F, 0F, -0.5F, -1F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.5F, -1F, 0F, -0.3F, -1.7F, 0F, 0.25F, -1.15F, 0F, 0.25F, -1.15F, 0F, -0.3F, -1.7F); // Box 300
        defaultScopeModel[74].setRotationPoint(31F, -43.65F, -4.5F);

        defaultScopeModel[75].addShapeBox(0F, 0F, 0F, 7, 2, 9, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -1F); // Box 301
        defaultScopeModel[75].setRotationPoint(31F, -44.65F, -4.5F);

        defaultScopeModel[76].addShapeBox(0F, 0F, 0F, 17, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 302
        defaultScopeModel[76].setRotationPoint(38F, -44.65F, -4.5F);

        defaultScopeModel[77].addShapeBox(0F, 0F, 0F, 17, 2, 3, 0F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 303
        defaultScopeModel[77].setRotationPoint(38F, -41.65F, -3F);

        defaultScopeModel[78].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
        defaultScopeModel[78].setRotationPoint(13F, -48.65F, -2.5F);

        defaultScopeModel[79].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 305
        defaultScopeModel[79].setRotationPoint(13F, -46.15F, -3.5F);

        defaultScopeModel[80].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F); // Box 306
        defaultScopeModel[80].setRotationPoint(13F, -47.15F, -2.5F);

        defaultScopeModel[81].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 307
        defaultScopeModel[81].setRotationPoint(13F, -46.15F, -4F);

        defaultScopeModel[82].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 308
        defaultScopeModel[82].setRotationPoint(13F, -46.15F, 3F);

        defaultScopeModel[83].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 309
        defaultScopeModel[83].setRotationPoint(13F, -43.15F, -3.5F);

        defaultScopeModel[84].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 310
        defaultScopeModel[84].setRotationPoint(13F, -43.15F, -4F);

        defaultScopeModel[85].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F); // Box 311
        defaultScopeModel[85].setRotationPoint(13F, -43.15F, 3F);

        defaultScopeModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, -0.2F, -0.4F, 0.25F, -0.2F, -0.4F, 0.25F, -0.2F, -0.4F, 0.25F, -0.2F, -0.4F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 312
        defaultScopeModel[86].setRotationPoint(13.5F, -45.65F, -4F);

        defaultScopeModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, -0.7F, 0F, 0.25F, -0.7F, 0F, 0.25F, -0.7F, 0F, 0.25F, -0.7F, 0F, 0.25F, -0.2F, -0.6F, 0.25F, -0.2F, -0.6F, 0.25F, -0.2F, -0.6F, 0.25F, -0.2F, -0.6F, 0.25F); // Box 313
        defaultScopeModel[87].setRotationPoint(13.5F, -45.65F, -4F);

        defaultScopeModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, -0.2F, -0.6F, 0.25F, -0.2F, -0.6F, 0.25F, -0.2F, -0.6F, 0.25F, -0.2F, -0.6F, 0.25F, -0.7F, 0F, 0.25F, -0.7F, 0F, 0.25F, -0.7F, 0F, 0.25F, -0.7F, 0F, 0.25F); // Box 314
        defaultScopeModel[88].setRotationPoint(13.5F, -44.65F, -4F);

        defaultScopeModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.2F, -0.4F, 0.25F, -0.2F, -0.4F, 0.25F, -0.2F, -0.4F, 0.25F, -0.2F, -0.4F, 0.25F); // Box 315
        defaultScopeModel[89].setRotationPoint(13.5F, -44.65F, -4F);

        defaultScopeModel[90].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 316
        defaultScopeModel[90].setRotationPoint(28F, -46.15F, -3.5F);

        defaultScopeModel[91].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 317
        defaultScopeModel[91].setRotationPoint(28F, -46.15F, -4F);

        defaultScopeModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, -0.7F, 0F, 0.25F, -0.7F, 0F, 0.25F, -0.7F, 0F, 0.25F, -0.7F, 0F, 0.25F, -0.2F, -0.6F, 0.25F, -0.2F, -0.6F, 0.25F, -0.2F, -0.6F, 0.25F, -0.2F, -0.6F, 0.25F); // Box 318
        defaultScopeModel[92].setRotationPoint(28.5F, -45.65F, -4F);

        defaultScopeModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, -0.2F, -0.4F, 0.25F, -0.2F, -0.4F, 0.25F, -0.2F, -0.4F, 0.25F, -0.2F, -0.4F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 319
        defaultScopeModel[93].setRotationPoint(28.5F, -45.65F, -4F);

        defaultScopeModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.2F, -0.4F, 0.25F, -0.2F, -0.4F, 0.25F, -0.2F, -0.4F, 0.25F, -0.2F, -0.4F, 0.25F); // Box 320
        defaultScopeModel[94].setRotationPoint(28.5F, -44.65F, -4F);

        defaultScopeModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, -0.2F, -0.6F, 0.25F, -0.2F, -0.6F, 0.25F, -0.2F, -0.6F, 0.25F, -0.2F, -0.6F, 0.25F, -0.7F, 0F, 0.25F, -0.7F, 0F, 0.25F, -0.7F, 0F, 0.25F, -0.7F, 0F, 0.25F); // Box 321
        defaultScopeModel[95].setRotationPoint(28.5F, -44.65F, -4F);

        defaultScopeModel[96].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 322
        defaultScopeModel[96].setRotationPoint(28F, -43.15F, -4F);

        defaultScopeModel[97].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 323
        defaultScopeModel[97].setRotationPoint(28F, -43.15F, -3.5F);

        defaultScopeModel[98].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F); // Box 324
        defaultScopeModel[98].setRotationPoint(28F, -43.15F, 3F);

        defaultScopeModel[99].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 325
        defaultScopeModel[99].setRotationPoint(28F, -46.15F, 3F);

        defaultScopeModel[100].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
        defaultScopeModel[100].setRotationPoint(28F, -47.65F, -2.5F);

        defaultScopeModel[101].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F); // Box 327
        defaultScopeModel[101].setRotationPoint(28F, -47.15F, -2.5F);

        defaultScopeModel[102].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
        defaultScopeModel[102].setRotationPoint(28F, -48.65F, -2.5F);

        defaultScopeModel[103].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
        defaultScopeModel[103].setRotationPoint(17.5F, -45.15F, -4F);

        defaultScopeModel[104].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 330
        defaultScopeModel[104].setRotationPoint(18F, -45.65F, -3F);

        defaultScopeModel[105].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, -0.85F, -0.75F, 0F, -0.85F, -0.75F, 0F, -0.85F, -0.75F, 0F, -0.85F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 331
        defaultScopeModel[105].setRotationPoint(18F, -47.65F, -3F);

        defaultScopeModel[106].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.15F, 0.25F, 0F, -0.15F, 0.25F, 0F, -0.15F, 0.25F, 0F, -0.15F, 0.25F); // Box 332
        defaultScopeModel[106].setRotationPoint(18F, -47.65F, -2F);

        defaultScopeModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, -0.5F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0.2F, 0F, 0F, -0.15F, 0.25F, 0F, -0.15F, 0.25F, 0F, 0.2F, 0F); // Box 333
        defaultScopeModel[107].setRotationPoint(16F, -47.65F, -2F);

        defaultScopeModel[108].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -1.2F, -1F, 0F, -0.85F, -0.75F, 0F, -0.85F, -0.75F, 0F, -1.2F, -1F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F); // Box 334
        defaultScopeModel[108].setRotationPoint(16F, -47.65F, -3F);

        defaultScopeModel[109].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F); // Box 335
        defaultScopeModel[109].setRotationPoint(16F, -45.65F, -3F);

        defaultScopeModel[110].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F); // Box 336
        defaultScopeModel[110].setRotationPoint(25F, -45.65F, -3F);

        defaultScopeModel[111].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, -0.85F, -0.75F, 0F, -1.2F, -1F, 0F, -1.2F, -1F, 0F, -0.85F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F); // Box 337
        defaultScopeModel[111].setRotationPoint(25F, -47.65F, -3F);

        defaultScopeModel[112].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, -1.25F, 0F, -0.15F, 0.25F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.15F, 0.25F); // Box 338
        defaultScopeModel[112].setRotationPoint(25F, -47.65F, -2F);

        defaultScopeModel[113].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -1.2F, -1F, 0F, -0.85F, -0.75F, 0F, -0.85F, -0.75F, 0F, -1.2F, -1F); // Box 339
        defaultScopeModel[113].setRotationPoint(16F, -43.65F, -3F);

        defaultScopeModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0.2F, 0F, 0F, -0.15F, 0.25F, 0F, -0.15F, 0.25F, 0F, 0.2F, 0F, 0F, -0.5F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, -1.25F); // Box 340
        defaultScopeModel[114].setRotationPoint(16F, -42.65F, -2F);

        defaultScopeModel[115].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F, 0F, -0.15F, 0.25F, 0F, -0.15F, 0.25F, 0F, -0.15F, 0.25F, 0F, -0.15F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 341
        defaultScopeModel[115].setRotationPoint(18F, -42.65F, -2F);

        defaultScopeModel[116].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.85F, -0.75F, 0F, -0.85F, -0.75F, 0F, -0.85F, -0.75F, 0F, -0.85F, -0.75F); // Box 342
        defaultScopeModel[116].setRotationPoint(18F, -43.65F, -3F);

        defaultScopeModel[117].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, -0.85F, -0.75F, 0F, -1.2F, -1F, 0F, -1.2F, -1F, 0F, -0.85F, -0.75F); // Box 343
        defaultScopeModel[117].setRotationPoint(25F, -43.65F, -3F);

        defaultScopeModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, -0.15F, 0.25F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.15F, 0.25F, 0F, 0F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, -1.25F); // Box 344
        defaultScopeModel[118].setRotationPoint(25F, -42.65F, -2F);

        defaultScopeModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
        defaultScopeModel[119].setRotationPoint(21F, -49.65F, -2F);

        defaultScopeModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 346
        defaultScopeModel[120].setRotationPoint(20F, -49.65F, -2F);

        defaultScopeModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 347
        defaultScopeModel[121].setRotationPoint(19F, -49.65F, -1.5F);

        defaultScopeModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 348
        defaultScopeModel[122].setRotationPoint(22F, -49.65F, -2F);

        defaultScopeModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 349
        defaultScopeModel[123].setRotationPoint(23F, -49.65F, -1.5F);

        defaultScopeModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
        defaultScopeModel[124].setRotationPoint(21F, -47.9F, -2F);

        defaultScopeModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 352
        defaultScopeModel[125].setRotationPoint(22F, -47.9F, -2F);

        defaultScopeModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 353
        defaultScopeModel[126].setRotationPoint(23F, -47.9F, -1.5F);

        defaultScopeModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 354
        defaultScopeModel[127].setRotationPoint(20F, -47.9F, -2F);

        defaultScopeModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 355
        defaultScopeModel[128].setRotationPoint(19F, -47.9F, -1.5F);

        defaultScopeModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 356
        defaultScopeModel[129].setRotationPoint(21F, -48.65F, -1.5F);

        defaultScopeModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -1F); // Box 357
        defaultScopeModel[130].setRotationPoint(20F, -48.65F, -1.5F);

        defaultScopeModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, -0.25F); // Box 358
        defaultScopeModel[131].setRotationPoint(22F, -48.65F, -1.5F);

        defaultScopeModel[132].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
        defaultScopeModel[132].setRotationPoint(17.5F, -46.15F, -4F);

        defaultScopeModel[133].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 360
        defaultScopeModel[133].setRotationPoint(17.5F, -47.15F, -4F);

        defaultScopeModel[134].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 361
        defaultScopeModel[134].setRotationPoint(17.5F, -43.15F, -4F);

        defaultScopeModel[135].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 362
        defaultScopeModel[135].setRotationPoint(17.5F, -44.15F, -4F);

        defaultScopeModel[136].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 363
        defaultScopeModel[136].setRotationPoint(13F, -41.15F, -2F);

        defaultScopeModel[137].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 364
        defaultScopeModel[137].setRotationPoint(13F, -38.15F, -1.5F);

        defaultScopeModel[138].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 365
        defaultScopeModel[138].setRotationPoint(13F, -39.15F, -1.5F);

        defaultScopeModel[139].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 366
        defaultScopeModel[139].setRotationPoint(13F, -40.15F, -1.5F);

        defaultScopeModel[140].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 367
        defaultScopeModel[140].setRotationPoint(28F, -40.15F, -1.5F);

        defaultScopeModel[141].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 368
        defaultScopeModel[141].setRotationPoint(28F, -39.15F, -1.5F);

        defaultScopeModel[142].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 369
        defaultScopeModel[142].setRotationPoint(28F, -38.15F, -1.5F);

        defaultScopeModel[143].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 370
        defaultScopeModel[143].setRotationPoint(28F, -41.15F, -2F);


        scopeAttachPoint = new Vector3f(23.75F / 16F, 37.15F / 16F, 0F / 16F);
        animationType = EnumAnimationType.CUSTOM;
        hasArms = true;
        leftArmPos = new Vector3f(-0.02F, -0.4F, -0.08F);
        leftArmRot = new Vector3f(80.0F, 60.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.12F, -0.62F, -0.2F);
        leftArmReloadRot = new Vector3f(80.0F, 60.0F, 0.0F);
        rightArmPos = new Vector3f(0.16F, -0.92F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(0.16F, -0.92F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightHandAmmo = false;
        leftHandAmmo = true;
        rightArmScale = new Vector3f(0.7F, 1.3F, 0.7F);
        leftArmScale = new Vector3f(0.7F, 1.3F, 0.7F);
        rotateGunVertical = 10.0F;
        rotateGunHorizontal = 20.0F;
        tiltGun = 20.0F;
        translateGun = new Vector3f(0.0F, -0.3125F, 0.0F);
        rotateClipHorizontal = 0.0F;
        translateClip = new Vector3f(0.0F, -0.9375F, 0.0F);
        crouchZoom = -0.1F;
        RecoilSlideDistance = 0.4F;
        recoilAmount = 0.1F;
        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);
        translateAll(0.0F, 0.0F, 0.0F);
        flipAll();
    }
}