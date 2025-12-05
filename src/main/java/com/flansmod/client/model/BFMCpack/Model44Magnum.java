//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Taurus Raging Bull
// Model Creator: 
// Created on: 26.07.2020 - 01:23:17
// Last changed on: 26.07.2020 - 01:23:17

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class Model44Magnum extends ModelGun //Same as Filename
{
    int textureX = 1024;
    int textureY = 1024;

    public Model44Magnum() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[283];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 17
        gunModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 20
        gunModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 21
        gunModel[3] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 22
        gunModel[4] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 23
        gunModel[5] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 24
        gunModel[6] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 25
        gunModel[7] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 26
        gunModel[8] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 27
        gunModel[9] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 28
        gunModel[10] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 29
        gunModel[11] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 30
        gunModel[12] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 31
        gunModel[13] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 33
        gunModel[14] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 34
        gunModel[15] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 35
        gunModel[16] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 36
        gunModel[17] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 37
        gunModel[18] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 38
        gunModel[19] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 39
        gunModel[20] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 40
        gunModel[21] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 41
        gunModel[22] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 42
        gunModel[23] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Box 43
        gunModel[24] = new ModelRendererTurbo(this, 585, 17, textureX, textureY); // Box 44
        gunModel[25] = new ModelRendererTurbo(this, 761, 17, textureX, textureY); // Box 45
        gunModel[26] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Box 46
        gunModel[27] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Box 47
        gunModel[28] = new ModelRendererTurbo(this, 921, 17, textureX, textureY); // Box 48
        gunModel[29] = new ModelRendererTurbo(this, 945, 17, textureX, textureY); // Box 59
        gunModel[30] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 60
        gunModel[31] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 61
        gunModel[32] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 62
        gunModel[33] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 63
        gunModel[34] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 64
        gunModel[35] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 65
        gunModel[36] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 66
        gunModel[37] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 67
        gunModel[38] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 68
        gunModel[39] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 69
        gunModel[40] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 70
        gunModel[41] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 71
        gunModel[42] = new ModelRendererTurbo(this, 793, 17, textureX, textureY); // Box 72
        gunModel[43] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 73
        gunModel[44] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 74
        gunModel[45] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 75
        gunModel[46] = new ModelRendererTurbo(this, 609, 25, textureX, textureY); // Box 76
        gunModel[47] = new ModelRendererTurbo(this, 681, 25, textureX, textureY); // Box 77
        gunModel[48] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 78
        gunModel[49] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 79
        gunModel[50] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 80
        gunModel[51] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 81
        gunModel[52] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 82
        gunModel[53] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 83
        gunModel[54] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 84
        gunModel[55] = new ModelRendererTurbo(this, 737, 25, textureX, textureY); // Box 89
        gunModel[56] = new ModelRendererTurbo(this, 793, 25, textureX, textureY); // Box 90
        gunModel[57] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 91
        gunModel[58] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Box 92
        gunModel[59] = new ModelRendererTurbo(this, 817, 33, textureX, textureY); // Box 93
        gunModel[60] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 96
        gunModel[61] = new ModelRendererTurbo(this, 945, 33, textureX, textureY); // Box 98
        gunModel[62] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 99
        gunModel[63] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 100
        gunModel[64] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 101
        gunModel[65] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 102
        gunModel[66] = new ModelRendererTurbo(this, 665, 41, textureX, textureY); // Box 103
        gunModel[67] = new ModelRendererTurbo(this, 873, 41, textureX, textureY); // Box 104
        gunModel[68] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 105
        gunModel[69] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 106
        gunModel[70] = new ModelRendererTurbo(this, 761, 33, textureX, textureY); // Box 107
        gunModel[71] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 108
        gunModel[72] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 109
        gunModel[73] = new ModelRendererTurbo(this, 609, 49, textureX, textureY); // Box 110
        gunModel[74] = new ModelRendererTurbo(this, 713, 49, textureX, textureY); // Box 111
        gunModel[75] = new ModelRendererTurbo(this, 545, 57, textureX, textureY); // Box 113
        gunModel[76] = new ModelRendererTurbo(this, 761, 57, textureX, textureY); // Box 114
        gunModel[77] = new ModelRendererTurbo(this, 921, 57, textureX, textureY); // Box 115
        gunModel[78] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 116
        gunModel[79] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 117
        gunModel[80] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Box 118
        gunModel[81] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 119
        gunModel[82] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 120
        gunModel[83] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 121
        gunModel[84] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 122
        gunModel[85] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 123
        gunModel[86] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 124
        gunModel[87] = new ModelRendererTurbo(this, 649, 65, textureX, textureY); // Box 125
        gunModel[88] = new ModelRendererTurbo(this, 865, 65, textureX, textureY); // Box 126
        gunModel[89] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 127
        gunModel[90] = new ModelRendererTurbo(this, 977, 65, textureX, textureY); // Box 128
        gunModel[91] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 129
        gunModel[92] = new ModelRendererTurbo(this, 513, 73, textureX, textureY); // Box 130
        gunModel[93] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 131
        gunModel[94] = new ModelRendererTurbo(this, 681, 73, textureX, textureY); // Box 132
        gunModel[95] = new ModelRendererTurbo(this, 745, 81, textureX, textureY); // Box 133
        gunModel[96] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 116
        gunModel[97] = new ModelRendererTurbo(this, 993, 33, textureX, textureY); // Box 117
        gunModel[98] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 118
        gunModel[99] = new ModelRendererTurbo(this, 553, 81, textureX, textureY); // Box 119
        gunModel[100] = new ModelRendererTurbo(this, 825, 81, textureX, textureY); // Box 120
        gunModel[101] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 121
        gunModel[102] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 124
        gunModel[103] = new ModelRendererTurbo(this, 585, 105, textureX, textureY); // Box 125
        gunModel[104] = new ModelRendererTurbo(this, 905, 81, textureX, textureY); // Box 126
        gunModel[105] = new ModelRendererTurbo(this, 953, 89, textureX, textureY); // Box 127
        gunModel[106] = new ModelRendererTurbo(this, 785, 105, textureX, textureY); // Box 132
        gunModel[107] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 133
        gunModel[108] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 134
        gunModel[109] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 136
        gunModel[110] = new ModelRendererTurbo(this, 641, 89, textureX, textureY); // Box 137
        gunModel[111] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 139
        gunModel[112] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 140
        gunModel[113] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 141
        gunModel[114] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 142
        gunModel[115] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 143
        gunModel[116] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 144
        gunModel[117] = new ModelRendererTurbo(this, 569, 121, textureX, textureY); // Box 145
        gunModel[118] = new ModelRendererTurbo(this, 977, 105, textureX, textureY); // Box 147
        gunModel[119] = new ModelRendererTurbo(this, 641, 121, textureX, textureY); // Box 148
        gunModel[120] = new ModelRendererTurbo(this, 681, 121, textureX, textureY); // Box 149
        gunModel[121] = new ModelRendererTurbo(this, 729, 121, textureX, textureY); // Box 150
        gunModel[122] = new ModelRendererTurbo(this, 769, 121, textureX, textureY); // Box 151
        gunModel[123] = new ModelRendererTurbo(this, 809, 121, textureX, textureY); // Box 152
        gunModel[124] = new ModelRendererTurbo(this, 857, 121, textureX, textureY); // Box 153
        gunModel[125] = new ModelRendererTurbo(this, 905, 121, textureX, textureY); // Box 155
        gunModel[126] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 156
        gunModel[127] = new ModelRendererTurbo(this, 945, 121, textureX, textureY); // Box 157
        gunModel[128] = new ModelRendererTurbo(this, 969, 129, textureX, textureY); // Box 158
        gunModel[129] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 159
        gunModel[130] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 160
        gunModel[131] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 161
        gunModel[132] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 162
        gunModel[133] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 163
        gunModel[134] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 164
        gunModel[135] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 165
        gunModel[136] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 166
        gunModel[137] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Box 167
        gunModel[138] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 176
        gunModel[139] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 177
        gunModel[140] = new ModelRendererTurbo(this, 577, 145, textureX, textureY); // Box 179
        gunModel[141] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 181
        gunModel[142] = new ModelRendererTurbo(this, 817, 25, textureX, textureY); // Box 182
        gunModel[143] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 183
        gunModel[144] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 184
        gunModel[145] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Box 185
        gunModel[146] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 191
        gunModel[147] = new ModelRendererTurbo(this, 873, 33, textureX, textureY); // Box 192
        gunModel[148] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 193
        gunModel[149] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 194
        gunModel[150] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 196
        gunModel[151] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 197
        gunModel[152] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 199
        gunModel[153] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Box 201
        gunModel[154] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 203
        gunModel[155] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 206
        gunModel[156] = new ModelRendererTurbo(this, 889, 33, textureX, textureY); // Box 207
        gunModel[157] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 208
        gunModel[158] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 209
        gunModel[159] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 210
        gunModel[160] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 211
        gunModel[161] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 212
        gunModel[162] = new ModelRendererTurbo(this, 649, 145, textureX, textureY); // Box 213
        gunModel[163] = new ModelRendererTurbo(this, 713, 145, textureX, textureY); // Box 214
        gunModel[164] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 227
        gunModel[165] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 228
        gunModel[166] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 229
        gunModel[167] = new ModelRendererTurbo(this, 993, 137, textureX, textureY); // Box 230
        gunModel[168] = new ModelRendererTurbo(this, 785, 145, textureX, textureY); // Box 231
        gunModel[169] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 255
        gunModel[170] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 256
        gunModel[171] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 257
        gunModel[172] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 258
        gunModel[173] = new ModelRendererTurbo(this, 569, 17, textureX, textureY); // Box 259
        gunModel[174] = new ModelRendererTurbo(this, 865, 17, textureX, textureY); // Box 260
        gunModel[175] = new ModelRendererTurbo(this, 905, 17, textureX, textureY); // Box 261
        gunModel[176] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 262
        gunModel[177] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 263
        gunModel[178] = new ModelRendererTurbo(this, 665, 25, textureX, textureY); // Box 264
        gunModel[179] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 265
        gunModel[180] = new ModelRendererTurbo(this, 761, 33, textureX, textureY); // Box 266
        gunModel[181] = new ModelRendererTurbo(this, 785, 33, textureX, textureY); // Box 267
        gunModel[182] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 268
        gunModel[183] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 269
        gunModel[184] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 270
        gunModel[185] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 271
        gunModel[186] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 272
        gunModel[187] = new ModelRendererTurbo(this, 713, 41, textureX, textureY); // Box 273
        gunModel[188] = new ModelRendererTurbo(this, 921, 41, textureX, textureY); // Box 274
        gunModel[189] = new ModelRendererTurbo(this, 937, 41, textureX, textureY); // Box 275
        gunModel[190] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 276
        gunModel[191] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 277
        gunModel[192] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 278
        gunModel[193] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 288
        gunModel[194] = new ModelRendererTurbo(this, 649, 49, textureX, textureY); // Box 289
        gunModel[195] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // Box 290
        gunModel[196] = new ModelRendererTurbo(this, 793, 49, textureX, textureY); // Box 291
        gunModel[197] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 292
        gunModel[198] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 293
        gunModel[199] = new ModelRendererTurbo(this, 513, 65, textureX, textureY); // Box 294
        gunModel[200] = new ModelRendererTurbo(this, 681, 65, textureX, textureY); // Box 295
        gunModel[201] = new ModelRendererTurbo(this, 921, 49, textureX, textureY); // Box 296
        gunModel[202] = new ModelRendererTurbo(this, 841, 145, textureX, textureY); // Box 297
        gunModel[203] = new ModelRendererTurbo(this, 897, 65, textureX, textureY); // Box 298
        gunModel[204] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 299
        gunModel[205] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 300
        gunModel[206] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 301
        gunModel[207] = new ModelRendererTurbo(this, 865, 57, textureX, textureY); // Box 302
        gunModel[208] = new ModelRendererTurbo(this, 1009, 65, textureX, textureY); // Box 303
        gunModel[209] = new ModelRendererTurbo(this, 633, 73, textureX, textureY); // Box 304
        gunModel[210] = new ModelRendererTurbo(this, 745, 73, textureX, textureY); // Box 305
        gunModel[211] = new ModelRendererTurbo(this, 585, 81, textureX, textureY); // Box 306
        gunModel[212] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 307
        gunModel[213] = new ModelRendererTurbo(this, 873, 89, textureX, textureY); // Box 308
        gunModel[214] = new ModelRendererTurbo(this, 921, 129, textureX, textureY); // Box 315
        gunModel[215] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Box 316
        gunModel[216] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 317
        gunModel[217] = new ModelRendererTurbo(this, 809, 81, textureX, textureY); // Box 318
        gunModel[218] = new ModelRendererTurbo(this, 657, 49, textureX, textureY); // Box 319
        gunModel[219] = new ModelRendererTurbo(this, 601, 57, textureX, textureY); // Box 320
        gunModel[220] = new ModelRendererTurbo(this, 1001, 89, textureX, textureY); // Box 327
        gunModel[221] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 328
        gunModel[222] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 329
        gunModel[223] = new ModelRendererTurbo(this, 537, 65, textureX, textureY); // Box 330
        gunModel[224] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 331
        gunModel[225] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 332
        gunModel[226] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 333
        gunModel[227] = new ModelRendererTurbo(this, 729, 41, textureX, textureY); // Box 335
        gunModel[228] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 336
        gunModel[229] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 337
        gunModel[230] = new ModelRendererTurbo(this, 585, 97, textureX, textureY); // Box 338
        gunModel[231] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 339
        gunModel[232] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 340
        gunModel[233] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 341
        gunModel[234] = new ModelRendererTurbo(this, 585, 17, textureX, textureY); // Box 342
        gunModel[235] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Box 343
        gunModel[236] = new ModelRendererTurbo(this, 921, 17, textureX, textureY); // Box 344
        gunModel[237] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 345
        gunModel[238] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 346
        gunModel[239] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 347
        gunModel[240] = new ModelRendererTurbo(this, 681, 25, textureX, textureY); // Box 348
        gunModel[241] = new ModelRendererTurbo(this, 993, 33, textureX, textureY); // Box 349
        gunModel[242] = new ModelRendererTurbo(this, 785, 41, textureX, textureY); // Box 350
        gunModel[243] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 351
        gunModel[244] = new ModelRendererTurbo(this, 713, 49, textureX, textureY); // Box 352
        gunModel[245] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 353
        gunModel[246] = new ModelRendererTurbo(this, 761, 57, textureX, textureY); // Box 354
        gunModel[247] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 355
        gunModel[248] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 356
        gunModel[249] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 357
        gunModel[250] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 358
        gunModel[251] = new ModelRendererTurbo(this, 601, 65, textureX, textureY); // Box 359
        gunModel[252] = new ModelRendererTurbo(this, 705, 65, textureX, textureY); // Box 360
        gunModel[253] = new ModelRendererTurbo(this, 921, 65, textureX, textureY); // Box 361
        gunModel[254] = new ModelRendererTurbo(this, 977, 65, textureX, textureY); // Box 362
        gunModel[255] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 364
        gunModel[256] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 365
        gunModel[257] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 366
        gunModel[258] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 394
        gunModel[259] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Box 395
        gunModel[260] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 396
        gunModel[261] = new ModelRendererTurbo(this, 905, 65, textureX, textureY); // Box 397
        gunModel[262] = new ModelRendererTurbo(this, 865, 145, textureX, textureY); // Box 398
        gunModel[263] = new ModelRendererTurbo(this, 505, 161, textureX, textureY); // Box 405
        gunModel[264] = new ModelRendererTurbo(this, 953, 145, textureX, textureY); // Box 406
        gunModel[265] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 860
        gunModel[266] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 861
        gunModel[267] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Box 862
        gunModel[268] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 863
        gunModel[269] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Box 864
        gunModel[270] = new ModelRendererTurbo(this, 921, 153, textureX, textureY); // Box 865
        gunModel[271] = new ModelRendererTurbo(this, 977, 153, textureX, textureY); // Box 866
        gunModel[272] = new ModelRendererTurbo(this, 769, 105, textureX, textureY); // Box 867
        gunModel[273] = new ModelRendererTurbo(this, 857, 161, textureX, textureY); // Box 876
        gunModel[274] = new ModelRendererTurbo(this, 889, 161, textureX, textureY); // Box 880
        gunModel[275] = new ModelRendererTurbo(this, 993, 161, textureX, textureY); // Box 881
        gunModel[276] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 868
        gunModel[277] = new ModelRendererTurbo(this, 33, 169, textureX, textureY); // Box 869
        gunModel[278] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 870
        gunModel[279] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 872
        gunModel[280] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 873
        gunModel[281] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 874
        gunModel[282] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 875

        gunModel[0].addShapeBox(94F, -20F, -8.5F, 12, 3, 16, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 17
        gunModel[0].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[1].addShapeBox(94F, -25F, -8.5F, 12, 5, 16, 0F, 1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 20
        gunModel[1].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[2].addShapeBox(94F, -17F, -8.5F, 12, 5, 16, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 1F, 0F, -3F); // Box 21
        gunModel[2].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[3].addShapeBox(94F, -12F, -6.5F, 12, 8, 12, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 22
        gunModel[3].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[4].addShapeBox(94F, -30F, -6.5F, 12, 5, 12, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 23
        gunModel[4].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[5].addShapeBox(81F, -30F, -6.5F, 12, 7, 12, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 1F, -1F, -1F); // Box 24
        gunModel[5].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[6].addShapeBox(94F, -4F, -6.5F, 12, 2, 12, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 1F, 0F, -1F); // Box 25
        gunModel[6].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[7].addShapeBox(94F, -2F, -6.5F, 10, 2, 12, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F); // Box 26
        gunModel[7].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[8].addShapeBox(94F, 0F, -6.5F, 9, 3, 12, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 27
        gunModel[8].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[9].addShapeBox(94F, 3F, -6.5F, 9, 7, 12, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 28
        gunModel[9].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[10].addShapeBox(94F, 10F, -6.5F, 9, 2, 12, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 29
        gunModel[10].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[11].addShapeBox(27F, 5F, -6.5F, 66, 5, 12, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 30
        gunModel[11].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[12].addShapeBox(81F, 10F, -6.5F, 12, 2, 12, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 31
        gunModel[12].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[13].addShapeBox(52F, -18F, -6.5F, 6, 14, 5, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 33
        gunModel[13].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[14].addShapeBox(52F, -24F, -6.5F, 3, 2, 5, 0F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -1F, 2F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 2F, 0F, -1F); // Box 34
        gunModel[14].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[15].addShapeBox(52F, -4F, -6.5F, 6, 4, 5, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F); // Box 35
        gunModel[15].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[16].addShapeBox(27F, 0F, -6.5F, 31, 5, 5, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F); // Box 36
        gunModel[16].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[17].addShapeBox(73F, 10F, -6.5F, 7, 2, 12, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F); // Box 37
        gunModel[17].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[18].addShapeBox(81F, 12F, -6.5F, 10, 2, 12, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F); // Box 38
        gunModel[18].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[19].addShapeBox(85F, 14F, -6.5F, 4, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 39
        gunModel[19].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[20].addShapeBox(85F, 16F, -6.5F, 4, 5, 12, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 1F, 0F, -1F); // Box 40
        gunModel[20].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[21].addShapeBox(84F, 21F, -6.5F, 4, 3, 12, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F, 2F, 0F, -1F); // Box 41
        gunModel[21].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[22].addShapeBox(82F, 24F, -6.5F, 4, 3, 12, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 4F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, -1F, 4F, 0F, -1F); // Box 42
        gunModel[22].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[23].addShapeBox(78F, 27F, -6.5F, 4, 2, 12, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 5F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, -1F, 5F, 0F, -1F); // Box 43
        gunModel[23].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[24].addShapeBox(74F, 29F, -6.5F, 4, 1, 12, 0F, 11F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 11F, 0F, -1F, 8F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, -1F, 8F, 0F, -1F); // Box 44
        gunModel[24].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[25].addShapeBox(63F, 10F, -6.5F, 9, 1, 12, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 45
        gunModel[25].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[26].addShapeBox(58F, 27F, -6.5F, 4, 2, 12, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -5F, 0F, -1F, 5F, 0F, -1F, 5F, 0F, -1F, -5F, 0F, -1F); // Box 46
        gunModel[26].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[27].addShapeBox(54F, 24F, -6.5F, 4, 3, 12, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -5F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, -1F, -5F, 0F, -1F); // Box 47
        gunModel[27].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[28].addShapeBox(52F, 18F, -6.5F, 4, 6, 12, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, -3F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, -1F, -3F, 0F, -1F); // Box 48
        gunModel[28].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[29].addShapeBox(27F, 0F, 0.5F, 31, 5, 5, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 59
        gunModel[29].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[30].addShapeBox(52F, -4F, 0.5F, 6, 4, 5, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F); // Box 60
        gunModel[30].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[31].addShapeBox(52F, -18F, 0.5F, 6, 14, 5, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 61
        gunModel[31].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[32].addShapeBox(51F, -22F, 0.5F, 6, 4, 5, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F); // Box 62
        gunModel[32].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[33].addShapeBox(52F, -24F, 0.5F, 3, 2, 5, 0F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -1F, 2F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 2F, 0F, -1F); // Box 63
        gunModel[33].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[34].addShapeBox(60F, 10F, -6.5F, 2, 1, 12, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, -1F); // Box 64
        gunModel[34].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[35].addShapeBox(57F, 13F, -5.5F, 2, 3, 10, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, 2F, 0F); // Box 65
        gunModel[35].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[36].addShapeBox(27F, 10F, -6.5F, 32, 3, 12, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 66
        gunModel[36].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[37].addShapeBox(52F, 13F, -6.5F, 4, 5, 12, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 67
        gunModel[37].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[38].addShapeBox(52F, -31F, -6.5F, 10, 7, 12, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 68
        gunModel[38].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[39].addShapeBox(48F, -18F, 0.5F, 3, 4, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, -1F); // Box 69
        gunModel[39].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[40].addShapeBox(46F, -14F, 0.5F, 5, 3, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 3F, 0F, -1F); // Box 70
        gunModel[40].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[41].addShapeBox(43F, -11F, 0.5F, 8, 2, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 4F, 0F, -1F); // Box 71
        gunModel[41].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[42].addShapeBox(39F, -9F, 0.5F, 12, 2, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 6F, 0F, -1F); // Box 72
        gunModel[42].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[43].addShapeBox(33F, -7F, 0.5F, 18, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 4F, 0F, -1F); // Box 73
        gunModel[43].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[44].addShapeBox(31F, -6F, 0.5F, 20, 2, 5, 0F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, -1F, 4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 4F, 0F, -1F); // Box 74
        gunModel[44].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[45].addShapeBox(31F, -4F, -6.5F, 20, 22, 12, 0F, 4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 4F, 0F, -1F); // Box 75
        gunModel[45].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[46].addShapeBox(31F, 18F, -6.5F, 20, 6, 12, 0F, 4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, -1F); // Box 76
        gunModel[46].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[47].addShapeBox(31F, 24F, -6.5F, 23, 1, 12, 0F, 4F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, -1F, 2.35F, 0F, -1F, 2.35F, 0F, -1F, 4F, 0F, -1F); // Box 77
        gunModel[47].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[48].addShapeBox(31F, -6F, -6.5F, 20, 2, 5, 0F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, -1F, 4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 4F, 0F, -1F); // Box 78
        gunModel[48].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[49].addShapeBox(33F, -7F, -6.5F, 18, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 4F, 0F, -1F); // Box 79
        gunModel[49].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[50].addShapeBox(39F, -9F, -6.5F, 12, 2, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 6F, 0F, -1F); // Box 80
        gunModel[50].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[51].addShapeBox(43F, -11F, -6.5F, 8, 2, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 4F, 0F, -1F); // Box 81
        gunModel[51].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[52].addShapeBox(46F, -14F, -6.5F, 5, 3, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 3F, 0F, -1F); // Box 82
        gunModel[52].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[53].addShapeBox(48F, -18F, -6.5F, 3, 4, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, -1F); // Box 83
        gunModel[53].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[54].addShapeBox(51F, -22F, -6.5F, 6, 4, 5, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F); // Box 84
        gunModel[54].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[55].addShapeBox(27F, 5F, -8F, 2, 4, 15, 0F, 4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 6F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 6F, 0F, -0.5F); // Box 89
        gunModel[55].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[56].addShapeBox(27F, 9F, -8F, 4, 4, 15, 0F, 6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 6F, 0F, -0.5F, 8F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 8F, 0F, -0.5F); // Box 90
        gunModel[56].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[57].addShapeBox(25F, 13F, -8F, 8, 4, 15, 0F, 6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 6F, 0F, -0.5F, 8F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -0.5F, 8F, 0F, -0.5F); // Box 91
        gunModel[57].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[58].addShapeBox(23F, 17F, -8F, 15, 5, 15, 0F, 6F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 6F, 0F, -0.5F, 9F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 9F, 0F, -0.5F); // Box 92
        gunModel[58].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[59].addShapeBox(20F, 22F, -8F, 18, 5, 15, 0F, 6F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 6F, 0F, -0.5F, 8F, 0F, -0.5F, -3F, -4F, -0.5F, -3F, -4F, -0.5F, 8F, 0F, -0.5F); // Box 93
        gunModel[59].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[60].addShapeBox(20F, 52F, -8F, 3, 4, 15, 0F, 6F, 0.5F, -0.5F, 0F, 4F, -0.5F, 0F, 4F, -0.5F, 6F, 0.5F, -0.5F, 6F, 1F, -0.5F, -4F, 1F, -0.5F, -4F, 1F, -0.5F, 6F, 1F, -0.5F); // Box 96
        gunModel[60].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[61].addShapeBox(21F, 27F, -8F, 15, 5, 15, 0F, 9F, 0F, -0.5F, -1F, 4F, -0.5F, -1F, 4F, -0.5F, 9F, 0F, -0.5F, 11F, 0F, -0.5F, -3F, -7F, -0.5F, -3F, -7F, -0.5F, 11F, 0F, -0.5F); // Box 98
        gunModel[61].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[62].addShapeBox(19F, 32F, -8F, 15, 5, 15, 0F, 9F, 0F, -0.5F, -1F, 7F, -0.5F, -1F, 7F, -0.5F, 9F, 0F, -0.5F, 11F, 0F, -0.5F, -5F, -7F, -0.5F, -5F, -7F, -0.5F, 11F, 0F, -0.5F); // Box 99
        gunModel[62].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[63].addShapeBox(17F, 37F, -8F, 15, 3, 15, 0F, 9F, 0F, -0.5F, -3F, 7F, -0.5F, -3F, 7F, -0.5F, 9F, 0F, -0.5F, 10F, 0F, -0.5F, -3F, -7F, -0.5F, -3F, -7F, -0.5F, 10F, 0F, -0.5F); // Box 100
        gunModel[63].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[64].addShapeBox(17F, 40F, -8F, 15, 2, 15, 0F, 10F, 0F, -0.5F, -3F, 7F, -0.5F, -3F, 7F, -0.5F, 10F, 0F, -0.5F, 11F, 0F, -0.5F, -3F, -7F, -0.5F, -3F, -7F, -0.5F, 11F, 0F, -0.5F); // Box 101
        gunModel[64].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[65].addShapeBox(17F, 42F, -8F, 15, 3, 15, 0F, 11F, 0F, -0.5F, -3F, 7F, -0.5F, -3F, 7F, -0.5F, 11F, 0F, -0.5F, 12F, 0F, -0.5F, -5F, -7F, -0.5F, -5F, -7F, -0.5F, 12F, 0F, -0.5F); // Box 102
        gunModel[65].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[66].addShapeBox(17F, 45F, -8F, 15, 3, 15, 0F, 12F, 0F, -0.5F, -5F, 7F, -0.5F, -5F, 7F, -0.5F, 12F, 0F, -0.5F, 12F, 0F, -0.5F, -6F, -7F, -0.5F, -6F, -7F, -0.5F, 12F, 0F, -0.5F); // Box 103
        gunModel[66].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[67].addShapeBox(17F, 48F, -8F, 15, 3, 15, 0F, 12F, 0F, -0.5F, -6F, 7F, -0.5F, -6F, 7F, -0.5F, 12F, 0F, -0.5F, 12F, 0F, -0.5F, -7F, -7F, -0.5F, -7F, -7F, -0.5F, 12F, 0F, -0.5F); // Box 104
        gunModel[67].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[68].addShapeBox(17F, 51F, -8F, 15, 2, 15, 0F, 12F, 0F, -0.5F, -7F, 7F, -0.5F, -7F, 7F, -0.5F, 12F, 0F, -0.5F, 12F, 0F, -0.5F, -7F, -7F, -0.5F, -7F, -7F, -0.5F, 12F, 0F, -0.5F); // Box 105
        gunModel[68].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[69].addShapeBox(17F, 53F, -8F, 15, 2, 15, 0F, 12F, 0F, -0.5F, -7F, 7F, -0.5F, -7F, 7F, -0.5F, 12F, 0F, -0.5F, 12F, 0F, -0.5F, -9F, -7F, -0.5F, -9F, -7F, -0.5F, 12F, 0F, -0.5F); // Box 106
        gunModel[69].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[70].addShapeBox(46F, 17F, -8F, 1, 5, 15, 0F, 9F, 0F, -0.5F, -8F, -1F, -0.5F, -8F, -1F, -0.5F, 9F, 0F, -0.5F, 9F, 0F, -0.5F, -8F, -1F, -0.5F, -8F, -1F, -0.5F, 9F, 0F, -0.5F); // Box 107
        gunModel[70].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[71].addShapeBox(11F, 55.5F, -8F, 3, 3, 15, 0F, 6F, 0.5F, -0.5F, 0F, 4F, -0.5F, 0F, 4F, -0.5F, 6F, 0.5F, -0.5F, 4F, -2F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 4F, -2F, -0.5F); // Box 108
        gunModel[71].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[72].addShapeBox(27F, 0F, -8F, 7, 8, 15, 0F, 4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 4F, 0F, -1F, 8F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 8F, 0F, -1F); // Box 109
        gunModel[72].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[73].addShapeBox(25F, 8F, -8F, 9, 3, 15, 0F, 6F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 6F, 0F, -1F, 8F, 0F, -1F, 6F, 0F, -1F, 6F, 0F, -1F, 8F, 0F, -1F); // Box 110
        gunModel[73].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[74].addShapeBox(24F, 11F, -8F, 13, 3, 15, 0F, 7F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 7F, 0F, -1F, 9F, 0F, -1F, 6F, 0F, -1F, 6F, 0F, -1F, 9F, 0F, -1F); // Box 111
        gunModel[74].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[75].addShapeBox(23F, 14F, -8F, 17, 3, 15, 0F, 8F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 8F, 0F, -1F, 10F, 0F, -1F, 7F, 0F, -1F, 7F, 0F, -1F, 10F, 0F, -1F); // Box 113
        gunModel[75].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[76].addShapeBox(22F, 17F, -8F, 20, 4, 15, 0F, 9F, 0F, -1F, 5F, 0F, -1F, 5F, 0F, -1F, 9F, 0F, -1F, 11F, 0F, -1F, 9F, 0F, -1F, 9F, 0F, -1F, 11F, 0F, -1F); // Box 114
        gunModel[76].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[77].addShapeBox(21F, 24F, -8F, 20, 2, 15, 0F, 11F, 0F, -1F, 10F, 0F, -1F, 10F, 0F, -1F, 11F, 0F, -1F, 12F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 12F, 0F, -1F); // Box 115
        gunModel[77].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[78].addShapeBox(21F, 26F, -8F, 21, 3, 15, 0F, 12F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 12F, 0F, -1F, 13F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, 13F, 0F, -1F); // Box 116
        gunModel[78].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[79].addShapeBox(31F, -3F, -8F, 7, 3, 15, 0F, 8F, -1F, -2F, -4F, -1F, -2F, -4F, -1F, -2F, 8F, -1F, -2F, 8F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, 8F, 0F, -1F); // Box 117
        gunModel[79].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[80].addShapeBox(42F, -3F, -8F, 7, 3, 15, 0F, 6F, -3F, -2F, -10F, -10F, -2F, -10F, -10F, -2F, 6F, -3F, -2F, 8F, 0F, -1F, -12F, 8F, -1F, -12F, 8F, -1F, 8F, 0F, -1F); // Box 118
        gunModel[80].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[81].addShapeBox(45F, 5F, -8F, 10, 3, 15, 0F, 6F, -2F, -2F, -11F, -7F, -2F, -11F, -7F, -2F, 6F, -2F, -2F, 8F, 0F, -1F, -12F, 6F, -1F, -12F, 6F, -1F, 8F, 0F, -1F); // Box 119
        gunModel[81].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[82].addShapeBox(51F, 11F, -8F, 8, 3, 15, 0F, 7F, -1F, -2F, -11F, -4F, -2F, -11F, -4F, -2F, 7F, -1F, -2F, 8F, 0F, -1F, -12F, 3F, -1F, -12F, 3F, -1F, 8F, 0F, -1F); // Box 120
        gunModel[82].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[83].addShapeBox(23F, 21F, -8F, 30, 3, 15, 0F, 12F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 12F, 0F, -1F, 13F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 13F, 0F, -1F); // Box 121
        gunModel[83].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[84].addShapeBox(42F, -3F, -8F, 1, 3, 15, 0F, 8F, -1F, -2F, -9F, -1F, -2F, -9F, -1F, -2F, 8F, -1F, -2F, 8F, 0F, -1F, -7F, 0F, -2F, -7F, 0F, -2F, 8F, 0F, -1F); // Box 122
        gunModel[84].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[85].addShapeBox(55F, 14F, -8F, 6, 3, 15, 0F, 7F, -1F, -2F, -10F, -4F, -2F, -10F, -4F, -2F, 7F, -1F, -2F, 8F, 0F, -1F, -10F, 4F, -1F, -10F, 4F, -1F, 8F, 0F, -1F); // Box 123
        gunModel[85].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[86].addShapeBox(14F, -3F, -8F, 1, 3, 15, 0F, -9F, -1F, -2F, 8F, -1F, -2F, 8F, -1F, -2F, -9F, -1F, -2F, -7F, 0F, -2F, 8F, 0F, -1F, 8F, 0F, -1F, -7F, 0F, -2F); // Box 124
        gunModel[86].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[87].addShapeBox(8F, -3F, -8F, 7, 3, 15, 0F, -9F, -10F, -2F, 6F, -3F, -2F, 6F, -3F, -2F, -9F, -10F, -2F, -11F, 8F, -1F, 8F, 0F, -1F, 8F, 0F, -1F, -11F, 8F, -1F); // Box 125
        gunModel[87].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[88].addShapeBox(4F, 5F, -8F, 7, 3, 15, 0F, -7F, -11F, -2F, 6F, -2F, -2F, 6F, -2F, -2F, -7F, -11F, -2F, -9F, 9F, -1F, 8F, 0F, -1F, 8F, 0F, -1F, -9F, 9F, -1F); // Box 126
        gunModel[88].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[89].addShapeBox(21F, 29F, -8F, 21, 3, 15, 0F, 13F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, 13F, 0F, -1F, 14F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, 14F, 0F, -1F); // Box 127
        gunModel[89].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[90].addShapeBox(-2F, 14F, -8F, 7, 3, 15, 0F, -10F, -7F, -2F, 6F, -2F, -2F, 6F, -2F, -2F, -10F, -7F, -2F, -13F, 4F, -1F, 8F, 0F, -1F, 8F, 0F, -1F, -13F, 4F, -1F); // Box 128
        gunModel[90].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[91].addShapeBox(-5F, 19F, -8F, 7, 3, 15, 0F, -12F, -5F, -2F, 6F, -2F, -2F, 6F, -2F, -2F, -12F, -5F, -2F, -15F, 2F, -1F, 9F, -1F, -1F, 9F, -1F, -1F, -15F, 2F, -1F); // Box 129
        gunModel[91].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[92].addShapeBox(-7F, 22F, -8F, 7, 2, 15, 0F, -13F, -4F, -2F, 7F, -2F, -2F, 7F, -2F, -2F, -13F, -4F, -2F, -16F, 2F, -1F, 10F, 0F, -1F, 10F, 0F, -1F, -16F, 2F, -1F); // Box 130
        gunModel[92].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[93].addShapeBox(-9F, 25F, -8F, 7, 2, 15, 0F, -12F, -12F, -2F, 8F, -1F, -2F, 8F, -1F, -2F, -12F, -12F, -2F, -14F, 11F, -1F, 11F, -1F, -1F, 11F, -1F, -1F, -14F, 11F, -1F); // Box 131
        gunModel[93].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[94].addShapeBox(20F, 32F, -8F, 22, 3, 15, 0F, 13F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, 13F, 0F, -1F, 14F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F, 14F, 0F, -1F); // Box 132
        gunModel[94].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[95].addShapeBox(20F, 35F, -8F, 22, 3, 15, 0F, 14F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F, 14F, 0F, -1F, 15F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, -1F, 15F, 0F, -1F); // Box 133
        gunModel[95].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[96].addShapeBox(106F, -23F, -7F, 72, 5, 13, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
        gunModel[96].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[97].addShapeBox(220F, -26F, -6F, 3, 3, 11, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F); // Box 117
        gunModel[97].setRotationPoint(-51F, -64F, 0.5F);

        gunModel[98].addShapeBox(194F, -26F, -6F, 7, 3, 11, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 118
        gunModel[98].setRotationPoint(-46F, -64F, 0.5F);

        gunModel[99].addShapeBox(152F, -26F, -7F, 6, 3, 12, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
        gunModel[99].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[100].addShapeBox(107F, -26F, -7F, 9, 3, 13, 0F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 120
        gunModel[100].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[101].addShapeBox(106F, -28F, -7F, 90, 2, 12, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -1F, 0F, 0F, -1F); // Box 121
        gunModel[101].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[102].addShapeBox(106F, -7F, -5F, 87, 2, 8, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 124
        gunModel[102].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[103].addShapeBox(106F, -5F, -6F, 86, 2, 10, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, -3.25F, 0F, -0.25F, -3.25F, 0F, -0.25F, -2.25F, 0F, -0.25F, -2.25F); // Box 125
        gunModel[103].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[104].addShapeBox(137F, -24F, -7F, 15, 1, 12, 0F, 0F, 0F, -1.35F, 0F, 0F, -1.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
        gunModel[104].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[105].addShapeBox(158F, -24F, -7F, 15, 1, 12, 0F, 0F, 0F, -1.35F, 0F, 0F, -1.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
        gunModel[105].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[106].addShapeBox(106F, -29F, -7F, 90, 1, 12, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 132
        gunModel[106].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[107].addShapeBox(222F, -23F, 2F, 3, 5, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
        gunModel[107].setRotationPoint(-51F, -64F, 0.5F);

        gunModel[108].addShapeBox(204F, -22F, -7F, 18, 4, 13, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
        gunModel[108].setRotationPoint(-51F, -64F, 0.5F);

        gunModel[109].addShapeBox(116F, -24F, -7F, 15, 1, 12, 0F, 0F, 0F, -1.35F, 0F, 0F, -1.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        gunModel[109].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[110].addShapeBox(131F, -26F, -7F, 6, 3, 12, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
        gunModel[110].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[111].addShapeBox(20F, 38F, -8F, 22, 3, 15, 0F, 15F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, -1F, 15F, 0F, -1F, 16F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, -1F, 16F, 0F, -1F); // Box 139
        gunModel[111].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[112].addShapeBox(20F, 41F, -8F, 22, 3, 15, 0F, 16F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, -1F, 16F, 0F, -1F, 17F, 0F, -1F, -8F, 0F, -1F, -8F, 0F, -1F, 17F, 0F, -1F); // Box 140
        gunModel[112].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[113].addShapeBox(20F, 44F, -8F, 22, 3, 15, 0F, 17F, 0F, -1F, -8F, 0F, -1F, -8F, 0F, -1F, 17F, 0F, -1F, 18F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, -1F, 18F, 0F, -1F); // Box 141
        gunModel[113].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[114].addShapeBox(20F, 47F, -8F, 22, 3, 15, 0F, 18F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, -1F, 18F, 0F, -1F, 18F, 0F, -1F, -9F, 0F, -1F, -9F, 0F, -1F, 18F, 0F, -1F); // Box 142
        gunModel[114].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[115].addShapeBox(20F, 50F, -8F, 22, 3, 15, 0F, 18F, 0F, -1F, -9F, 0F, -1F, -9F, 0F, -1F, 18F, 0F, -1F, 18F, 0F, -1F, -13F, 0F, -1F, -13F, 0F, -1F, 18F, 0F, -1F); // Box 143
        gunModel[115].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[116].addShapeBox(20F, 53F, -8F, 22, 2, 15, 0F, 18F, 0F, -1F, -13F, 0F, -1F, -13F, 0F, -1F, 18F, 0F, -1F, 18F, 0F, -1F, -15F, 0F, -1F, -15F, 0F, -1F, 18F, 0F, -1F); // Box 144
        gunModel[116].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[117].addShapeBox(20F, 55F, -8F, 20, 3, 15, 0F, 18F, 0F, -1F, -13F, 0F, -1F, -13F, 0F, -1F, 18F, 0F, -1F, 16F, 0F, -1F, -15F, 0F, -1F, -15F, 0F, -1F, 16F, 0F, -1F); // Box 145
        gunModel[117].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[118].addShapeBox(-13F, 37F, -8F, 7, 2, 15, 0F, -13F, -10F, -2F, 9F, 0F, -2F, 9F, 0F, -2F, -13F, -10F, -2F, -15F, 8F, -1F, 11F, -1F, -1F, 11F, -1F, -1F, -15F, 8F, -1F); // Box 147
        gunModel[118].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[119].addShapeBox(59F, 17F, -8F, 1, 4, 15, 0F, 8F, -1F, -2F, -9F, -1F, -2F, -9F, -1F, -2F, 8F, -1F, -2F, 8F, 0F, -1F, -7F, 0F, -2F, -7F, 0F, -2F, 8F, 0F, -1F); // Box 148
        gunModel[119].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[120].addShapeBox(-16F, 47F, -8F, 7, 1, 15, 0F, -16F, -8F, -2F, 9F, 0F, -2F, 9F, 0F, -2F, -16F, -8F, -2F, -18F, 7F, -1F, 11F, -1F, -1F, 11F, -1F, -1F, -18F, 7F, -1F); // Box 149
        gunModel[120].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[121].addShapeBox(64F, 21F, -8F, 1, 3, 15, 0F, 13F, 0F, -1F, -12F, 0F, -2F, -12F, 0F, -2F, 13F, 0F, -1F, 13F, 0F, -1F, -12F, 0F, -2F, -12F, 0F, -2F, 13F, 0F, -1F); // Box 150
        gunModel[121].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[122].addShapeBox(59F, 24F, -8F, 1, 3, 15, 0F, 8F, 0F, -1F, -7F, 0F, -2F, -7F, 0F, -2F, 8F, 0F, -1F, 8F, -1F, -2F, -9F, -1F, -2F, -9F, -1F, -2F, 8F, -1F, -2F); // Box 151
        gunModel[122].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[123].addShapeBox(55F, 28F, -8F, 6, 3, 15, 0F, 15F, 2F, -1F, -10F, 4F, -1F, -10F, 4F, -1F, 15F, 2F, -1F, 15F, -3F, -2F, -10F, -5F, -2F, -10F, -5F, -2F, 15F, -3F, -2F); // Box 152
        gunModel[123].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[124].addShapeBox(-16F, 55F, -8F, 7, 1, 15, 0F, -18F, -3F, -2F, 9F, 0F, -2F, 9F, 0F, -2F, -18F, -3F, -2F, -20F, 2F, -1F, 11F, -1F, -1F, 11F, -1F, -1F, -20F, 2F, -1F); // Box 153
        gunModel[124].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[125].addShapeBox(-5F, 58F, -8F, 1, 3, 15, 0F, -7F, 0F, -2F, 8F, 0F, -1F, 8F, 0F, -1F, -7F, 0F, -2F, -9F, -1F, -2F, 8F, -1F, -2F, 8F, -1F, -2F, -9F, -1F, -2F); // Box 155
        gunModel[125].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[126].addShapeBox(12F, 58F, -8F, 17, 3, 15, 0F, 8F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, 8F, 0F, -1F, 8F, -1F, -2F, -4F, -1F, -2F, -4F, -1F, -2F, 8F, -1F, -2F); // Box 156
        gunModel[126].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[127].addShapeBox(33F, 58F, -8F, 1, 3, 15, 0F, 8F, 0F, -1F, -7F, 0F, -2F, -7F, 0F, -2F, 8F, 0F, -1F, 8F, -1F, -2F, -9F, -1F, -2F, -9F, -1F, -2F, 8F, -1F, -2F); // Box 157
        gunModel[127].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[128].addShapeBox(55F, 29F, -8F, 1, 3, 15, 0F, 15F, 3F, -1F, -16F, 3F, -1F, -16F, 3F, -1F, 15F, 3F, -1F, 17F, -3F, -1F, -16F, -4F, -2F, -16F, -4F, -2F, 17F, -3F, -1F); // Box 158
        gunModel[128].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[129].addShapeBox(51F, 29F, -8F, 1, 3, 15, 0F, 13F, 0F, -1F, -12F, 1F, -2F, -12F, 1F, -2F, 13F, 0F, -1F, 13F, 0F, -1F, -12F, 0F, -2F, -12F, 0F, -2F, 13F, 0F, -1F); // Box 159
        gunModel[129].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[130].addShapeBox(51F, 32F, -8F, 1, 3, 15, 0F, 13F, 0F, -1F, -12F, 0F, -2F, -12F, 0F, -2F, 13F, 0F, -1F, 12F, 0F, -1F, -11F, 0F, -2F, -11F, 0F, -2F, 12F, 0F, -1F); // Box 160
        gunModel[130].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[131].addShapeBox(51F, 35F, -8F, 1, 3, 15, 0F, 12F, 0F, -1F, -11F, 0F, -2F, -11F, 0F, -2F, 12F, 0F, -1F, 15F, 0F, -1F, -14F, 0F, -2F, -14F, 0F, -2F, 15F, 0F, -1F); // Box 161
        gunModel[131].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[132].addShapeBox(49F, 38F, -8F, 1, 6, 15, 0F, 13F, 0F, -1F, -12F, 0F, -2F, -12F, 0F, -2F, 13F, 0F, -1F, 15F, 0F, -1F, -14F, 0F, -2F, -14F, 0F, -2F, 15F, 0F, -1F); // Box 162
        gunModel[132].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[133].addShapeBox(47F, 44F, -8F, 1, 3, 15, 0F, 13F, 0F, -1F, -12F, 0F, -2F, -12F, 0F, -2F, 13F, 0F, -1F, 12F, 0F, -1F, -11F, 0F, -2F, -11F, 0F, -2F, 12F, 0F, -1F); // Box 163
        gunModel[133].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[134].addShapeBox(47F, 47F, -8F, 1, 3, 15, 0F, 12F, 0F, -1F, -11F, 0F, -2F, -11F, 0F, -2F, 12F, 0F, -1F, 14F, 0F, -1F, -13F, 0F, -2F, -13F, 0F, -2F, 14F, 0F, -1F); // Box 164
        gunModel[134].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[135].addShapeBox(45F, 50F, -8F, 1, 3, 15, 0F, 12F, 0F, -1F, -11F, 0F, -2F, -11F, 0F, -2F, 12F, 0F, -1F, 16F, 0F, -1F, -15F, 0F, -2F, -15F, 0F, -2F, 16F, 0F, -1F); // Box 165
        gunModel[135].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[136].addShapeBox(41F, 53F, -8F, 1, 2, 15, 0F, 12F, 0F, -1F, -11F, 0F, -2F, -11F, 0F, -2F, 12F, 0F, -1F, 14F, 0F, -1F, -13F, 0F, -2F, -13F, 0F, -2F, 14F, 0F, -1F); // Box 166
        gunModel[136].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[137].addShapeBox(39F, 55F, -8F, 1, 2, 15, 0F, 12F, 0F, -1F, -11F, 0F, -2F, -11F, 0F, -2F, 12F, 0F, -1F, 14F, 1F, -1F, -13F, 1F, -2F, -13F, 1F, -2F, 14F, 1F, -1F); // Box 167
        gunModel[137].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[138].addShapeBox(59F, -11F, -3.5F, 34, 3, 6, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 176
        gunModel[138].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[139].addShapeBox(59F, -14F, -3.5F, 34, 3, 6, 0F, 1F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 1F, -2F, -2F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 177
        gunModel[139].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[140].addShapeBox(59F, -8F, -3.5F, 34, 3, 6, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 1F, -2F, -2F); // Box 179
        gunModel[140].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[141].addShapeBox(54F, -32.5F, 0.5F, 6, 6, 6, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 181
        gunModel[141].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[142].addShapeBox(61F, -32.5F, 0.5F, 1, 6, 6, 0F, 1F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F); // Box 182
        gunModel[142].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[143].addShapeBox(52F, -32.5F, 0.5F, 1, 6, 6, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 183
        gunModel[143].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[144].addShapeBox(51F, -32.5F, 0.5F, 1, 6, 6, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 184
        gunModel[144].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[145].addShapeBox(50F, -32.5F, 0.5F, 1, 6, 6, 0F, 0F, 2F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 2F, -2F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -2F); // Box 185
        gunModel[145].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[146].addShapeBox(50.5F, -33.5F, 1.5F, 1, 1, 3, 0F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F); // Box 191
        gunModel[146].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[147].addShapeBox(50F, -32.5F, -7.5F, 1, 6, 6, 0F, 0F, 2F, -2F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 2F, -1F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 192
        gunModel[147].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[148].addShapeBox(51F, -32.5F, -7.5F, 1, 6, 6, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 193
        gunModel[148].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[149].addShapeBox(52F, -32.5F, -7.5F, 1, 6, 6, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 194
        gunModel[149].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[150].addShapeBox(61F, -32.5F, -7.5F, 1, 6, 6, 0F, 1F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 196
        gunModel[150].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[151].addShapeBox(50.5F, -33.5F, -5.5F, 1, 1, 3, 0F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F); // Box 197
        gunModel[151].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[152].addShapeBox(54F, -32.5F, -7.5F, 6, 6, 6, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 199
        gunModel[152].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[153].addShapeBox(52F, -31.7F, -3.5F, 9, 5, 6, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 1F, 0.2F, -1F); // Box 201
        gunModel[153].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[154].addShapeBox(50F, -30.5F, -3.5F, 1, 4, 6, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 203
        gunModel[154].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[155].addShapeBox(198F, -32F, -2F, 7, 3, 3, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
        gunModel[155].setRotationPoint(-51F, -64F, 0.5F);

        gunModel[156].addShapeBox(205F, -32F, -2F, 14, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
        gunModel[156].setRotationPoint(-51F, -64F, 0.5F);

        gunModel[157].addShapeBox(219F, -32F, -2F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
        gunModel[157].setRotationPoint(-51F, -64F, 0.5F);

        gunModel[158].addShapeBox(220F, -32F, -2F, 1, 3, 3, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
        gunModel[158].setRotationPoint(-51F, -64F, 0.5F);

        gunModel[159].addShapeBox(206F, -33F, -1F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
        gunModel[159].setRotationPoint(-51F, -64F, 0.5F);

        gunModel[160].addShapeBox(217F, -33F, -1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
        gunModel[160].setRotationPoint(-51F, -64F, 0.5F);

        gunModel[161].addShapeBox(205.65F, -33.1F, -1F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 212
        gunModel[161].setRotationPoint(-51F, -64F, 0.5F);

        gunModel[162].addShapeBox(204F, -24F, -7F, 18, 2, 13, 0F, 0F, 0F, -2.8F, 0F, 0F, -2.8F, 0F, 0F, -2.8F, 0F, 0F, -2.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 213
        gunModel[162].setRotationPoint(-51F, -64F, 0.5F);

        gunModel[163].addShapeBox(201F, -26F, -7F, 20, 2, 13, 0F, 0F, 0F, -2.3F, 0F, 0F, -2.3F, 0F, 0F, -2.3F, 0F, 0F, -2.3F, 0F, 0F, -2.8F, 0F, 0F, -2.8F, 0F, 0F, -2.8F, 0F, 0F, -2.8F); // Box 214
        gunModel[163].setRotationPoint(-51F, -64F, 0.5F);

        gunModel[164].addShapeBox(77F, -30F, -6.5F, 3, 1, 12, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 227
        gunModel[164].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[165].addShapeBox(77F, -29F, -6.5F, 3, 1, 12, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 228
        gunModel[165].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[166].addShapeBox(77F, -28F, -6.5F, 3, 1, 12, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 229
        gunModel[166].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[167].addShapeBox(77F, -30F, -6.5F, 3, 7, 12, 0F, 1F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 1F, -1F, 1F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 1F, -1F, -1F); // Box 230
        gunModel[167].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[168].addShapeBox(63F, -31F, -6.5F, 13, 8, 12, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 1F, -1F, -1F); // Box 231
        gunModel[168].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[169].addShapeBox(217.75F, -18F, 13F, 3, 1, 4, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 255
        gunModel[169].setRotationPoint(-51F, -64F, 0.5F);
        gunModel[169].rotateAngleX = 0.61086524F;

        gunModel[170].addShapeBox(217.75F, -17F, 13F, 3, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 256
        gunModel[170].setRotationPoint(-51F, -64F, 0.5F);
        gunModel[170].rotateAngleX = 0.61086524F;

        gunModel[171].addShapeBox(217.75F, -16F, 13F, 3, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 257
        gunModel[171].setRotationPoint(-51F, -64F, 0.5F);
        gunModel[171].rotateAngleX = 0.61086524F;

        gunModel[172].addShapeBox(209.75F, -18F, 13F, 3, 1, 4, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 258
        gunModel[172].setRotationPoint(-51F, -64F, 0.5F);
        gunModel[172].rotateAngleX = 0.61086524F;

        gunModel[173].addShapeBox(209.75F, -17F, 13F, 3, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
        gunModel[173].setRotationPoint(-51F, -64F, 0.5F);
        gunModel[173].rotateAngleX = 0.61086524F;

        gunModel[174].addShapeBox(209.75F, -16F, 13F, 3, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 260
        gunModel[174].setRotationPoint(-51F, -64F, 0.5F);
        gunModel[174].rotateAngleX = 0.61086524F;

        gunModel[175].addShapeBox(205.75F, -18F, 13F, 3, 1, 4, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 261
        gunModel[175].setRotationPoint(-51F, -64F, 0.5F);
        gunModel[175].rotateAngleX = 0.61086524F;

        gunModel[176].addShapeBox(205.75F, -17F, 13F, 3, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 262
        gunModel[176].setRotationPoint(-51F, -64F, 0.5F);
        gunModel[176].rotateAngleX = 0.61086524F;

        gunModel[177].addShapeBox(205.75F, -16F, 13F, 3, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 263
        gunModel[177].setRotationPoint(-51F, -64F, 0.5F);
        gunModel[177].rotateAngleX = 0.61086524F;

        gunModel[178].addShapeBox(213.75F, -17F, 13F, 3, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 264
        gunModel[178].setRotationPoint(-51F, -64F, 0.5F);
        gunModel[178].rotateAngleX = 0.61086524F;

        gunModel[179].addShapeBox(213.75F, -16F, 13F, 3, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 265
        gunModel[179].setRotationPoint(-51F, -64F, 0.5F);
        gunModel[179].rotateAngleX = 0.61086524F;

        gunModel[180].addShapeBox(213.75F, -18F, 13F, 3, 1, 4, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 266
        gunModel[180].setRotationPoint(-51F, -64F, 0.5F);
        gunModel[180].rotateAngleX = 0.61086524F;

        gunModel[181].addShapeBox(205.75F, -17.5F, -17.75F, 3, 1, 4, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 267
        gunModel[181].setRotationPoint(-51F, -64F, 0.5F);
        gunModel[181].rotateAngleX = -0.61086524F;

        gunModel[182].addShapeBox(205.75F, -16.5F, -17.75F, 3, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 268
        gunModel[182].setRotationPoint(-51F, -64F, 0.5F);
        gunModel[182].rotateAngleX = -0.61086524F;

        gunModel[183].addShapeBox(205.75F, -15.5F, -17.75F, 3, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 269
        gunModel[183].setRotationPoint(-51F, -64F, 0.5F);
        gunModel[183].rotateAngleX = -0.61086524F;

        gunModel[184].addShapeBox(209.75F, -15.5F, -17.75F, 3, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 270
        gunModel[184].setRotationPoint(-51F, -64F, 0.5F);
        gunModel[184].rotateAngleX = -0.61086524F;

        gunModel[185].addShapeBox(209.75F, -16.5F, -17.75F, 3, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 271
        gunModel[185].setRotationPoint(-51F, -64F, 0.5F);
        gunModel[185].rotateAngleX = -0.61086524F;

        gunModel[186].addShapeBox(209.75F, -17.5F, -17.75F, 3, 1, 4, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 272
        gunModel[186].setRotationPoint(-51F, -64F, 0.5F);
        gunModel[186].rotateAngleX = -0.61086524F;

        gunModel[187].addShapeBox(213.75F, -17.5F, -17.75F, 3, 1, 4, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 273
        gunModel[187].setRotationPoint(-51F, -64F, 0.5F);
        gunModel[187].rotateAngleX = -0.61086524F;

        gunModel[188].addShapeBox(213.75F, -16.5F, -17.75F, 3, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 274
        gunModel[188].setRotationPoint(-51F, -64F, 0.5F);
        gunModel[188].rotateAngleX = -0.61086524F;

        gunModel[189].addShapeBox(213.75F, -15.5F, -17.75F, 3, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 275
        gunModel[189].setRotationPoint(-51F, -64F, 0.5F);
        gunModel[189].rotateAngleX = -0.61086524F;

        gunModel[190].addShapeBox(217.75F, -15.5F, -17.75F, 3, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 276
        gunModel[190].setRotationPoint(-51F, -64F, 0.5F);
        gunModel[190].rotateAngleX = -0.61086524F;

        gunModel[191].addShapeBox(217.75F, -16.5F, -17.75F, 3, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 277
        gunModel[191].setRotationPoint(-51F, -64F, 0.5F);
        gunModel[191].rotateAngleX = -0.61086524F;

        gunModel[192].addShapeBox(217.75F, -17.5F, -17.75F, 3, 1, 4, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 278
        gunModel[192].setRotationPoint(-51F, -64F, 0.5F);
        gunModel[192].rotateAngleX = -0.61086524F;

        gunModel[193].addShapeBox(61F, 11F, -2.5F, 9, 3, 5, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 288
        gunModel[193].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[194].addShapeBox(59F, 11F, -2.5F, 1, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 289
        gunModel[194].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[195].addShapeBox(60F, 14F, -2.5F, 5, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -3F, 0F); // Box 290
        gunModel[195].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[196].addShapeBox(66F, 14F, -2.5F, 4, 1, 5, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F); // Box 291
        gunModel[196].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[197].addShapeBox(66F, 15F, -2.5F, 4, 2, 5, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 292
        gunModel[197].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[198].addShapeBox(66F, 17F, -2.5F, 4, 2, 5, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 293
        gunModel[198].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[199].addShapeBox(67F, 19F, -2.5F, 4, 2, 5, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -2F, 0F, -1F); // Box 294
        gunModel[199].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[200].addShapeBox(69F, 21F, -2.5F, 4, 2, 5, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, -1F, -3F, 0F, -1F); // Box 295
        gunModel[200].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[201].addShapeBox(72F, 23F, -2.5F, 4, 1, 5, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, -1F, -3F, 0F, -1F); // Box 296
        gunModel[201].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[202].addShapeBox(46F, -19F, -3F, 5, 15, 5, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 297
        gunModel[202].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[203].addShapeBox(47F, -22F, -3F, 4, 3, 5, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, -1F); // Box 298
        gunModel[203].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[204].addShapeBox(47F, -24F, -3F, 5, 2, 5, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 299
        gunModel[204].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[205].addShapeBox(44F, -17F, -3F, 1, 9, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 300
        gunModel[205].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[206].addShapeBox(44F, -18F, -3F, 1, 1, 5, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 301
        gunModel[206].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[207].addShapeBox(43F, -18F, -3F, 1, 5, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 302
        gunModel[207].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[208].addShapeBox(41F, -18F, -3F, 2, 3, 5, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1F); // Box 303
        gunModel[208].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[209].addShapeBox(39F, -19F, -3F, 2, 3, 5, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, -2F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -2F, -1F); // Box 304
        gunModel[209].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[210].addShapeBox(37F, -20F, -3F, 2, 3, 5, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, -2F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -2F, -1F); // Box 305
        gunModel[210].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[211].addShapeBox(35F, -21F, -3F, 2, 3, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -3F, -1F); // Box 306
        gunModel[211].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[212].addShapeBox(43F, -13F, -3F, 1, 5, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 307
        gunModel[212].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[213].addShapeBox(36F, -13F, -3F, 7, 9, 5, 0F, 0F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 308
        gunModel[213].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[214].addShapeBox(16F, 53F, -9F, 1, 2, 17, 0F, 9F, 0F, -0.5F, -7F, 0F, -0.5F, -7F, 0F, -0.5F, 9F, 0F, -0.5F, 9F, -1F, -0.5F, -7F, -1F, -0.5F, -7F, -1F, -0.5F, 9F, -1F, -0.5F); // Box 315
        gunModel[214].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[215].addShapeBox(16F, 51F, -9F, 1, 2, 17, 0F, 8F, -1F, -0.5F, -8F, -1F, -0.5F, -8F, -1F, -0.5F, 8F, -1F, -0.5F, 9F, 0F, -0.5F, -7F, 0F, -0.5F, -7F, 0F, -0.5F, 9F, 0F, -0.5F); // Box 316
        gunModel[215].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[216].addShapeBox(16F, 54F, -9F, 1, 2, 17, 0F, 9F, 0F, -0.5F, -7F, 0F, -0.5F, -7F, 0F, -0.5F, 9F, 0F, -0.5F, 8F, -1F, -0.5F, -8F, -1F, -0.5F, -8F, -1F, -0.5F, 8F, -1F, -0.5F); // Box 317
        gunModel[216].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[217].addShapeBox(100F, -10F, 3.5F, 5, 4, 3, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 318
        gunModel[217].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[218].addShapeBox(100F, -11F, 3.5F, 5, 1, 3, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 319
        gunModel[218].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[219].addShapeBox(100F, -6F, 3.5F, 5, 1, 3, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 320
        gunModel[219].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[220].addShapeBox(51F, -9F, 1.5F, 3, 4, 5, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 327
        gunModel[220].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[221].addShapeBox(44F, -9F, 1.5F, 6, 4, 5, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 328
        gunModel[221].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[222].addShapeBox(45F, -10F, 1.5F, 4, 1, 5, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 329
        gunModel[222].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[223].addShapeBox(45F, -5F, 1.5F, 4, 1, 5, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 330
        gunModel[223].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[224].addShapeBox(50F, -10F, 1.5F, 1, 1, 5, 0F, 1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F); // Box 331
        gunModel[224].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[225].addShapeBox(42F, -10F, 1.5F, 1, 1, 5, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F); // Box 332
        gunModel[225].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[226].addShapeBox(50F, -5F, 1.5F, 1, 1, 5, 0F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 1F, 0F, -1F); // Box 333
        gunModel[226].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[227].addShapeBox(42F, -5F, 1.5F, 1, 1, 5, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -2F, 0F, -1F); // Box 335
        gunModel[227].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[228].addShapeBox(106.5F, -9.5F, 0F, 22, 1, 4, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 336
        gunModel[228].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[229].addShapeBox(106.5F, -10.5F, 0F, 22, 1, 4, 0F, 1F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 1F, -0.5F, -1.5F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 337
        gunModel[229].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[230].addShapeBox(106.5F, -8.5F, 0F, 22, 1, 4, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 1F, -0.5F, -1.5F); // Box 338
        gunModel[230].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[231].addShapeBox(127F, -9.5F, 0F, 1, 1, 4, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 339
        gunModel[231].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[232].addShapeBox(128F, -10.5F, 0F, 1, 1, 4, 0F, 0.75F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, 0.75F, -0.25F, -1.25F, 0.75F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0.75F, 0F, -0.75F); // Box 340
        gunModel[232].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[233].addShapeBox(128F, -8.5F, 0F, 1, 1, 4, 0F, 0.75F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, 0.75F, -0.25F, -1.25F); // Box 341
        gunModel[233].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[234].addShapeBox(129F, -10.5F, 0F, 1, 1, 4, 0F, 0.75F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, 0.75F, -0.25F, -1.25F, 0.75F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0.75F, 0F, -0.75F); // Box 342
        gunModel[234].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[235].addShapeBox(128F, -9.5F, 0F, 1, 1, 4, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 343
        gunModel[235].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[236].addShapeBox(129F, -8.5F, 0F, 1, 1, 4, 0F, 0.75F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, 0.75F, -0.25F, -1.25F); // Box 344
        gunModel[236].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[237].addShapeBox(127F, -10.5F, 0F, 1, 1, 4, 0F, 0.75F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, 0.75F, -0.25F, -1.25F, 0.75F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0.75F, 0F, -0.75F); // Box 345
        gunModel[237].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[238].addShapeBox(126F, -9.5F, 0F, 1, 1, 4, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 346
        gunModel[238].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[239].addShapeBox(127F, -8.5F, 0F, 1, 1, 4, 0F, 0.75F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, 0.75F, -0.25F, -1.25F); // Box 347
        gunModel[239].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[240].addShapeBox(126F, -10.5F, 0F, 1, 1, 4, 0F, 0.75F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, 0.75F, -0.25F, -1.25F, 0.75F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0.75F, 0F, -0.75F); // Box 348
        gunModel[240].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[241].addShapeBox(125F, -9.5F, 0F, 1, 1, 4, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 349
        gunModel[241].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[242].addShapeBox(126F, -8.5F, 0F, 1, 1, 4, 0F, 0.75F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, 0.75F, -0.25F, -1.25F); // Box 350
        gunModel[242].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[243].addShapeBox(125F, -10.5F, 0F, 1, 1, 4, 0F, 0.75F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, 0.75F, -0.25F, -1.25F, 0.75F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0.75F, 0F, -0.75F); // Box 351
        gunModel[243].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[244].addShapeBox(124F, -9.5F, 0F, 1, 1, 4, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 352
        gunModel[244].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[245].addShapeBox(125F, -8.5F, 0F, 1, 1, 4, 0F, 0.75F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, 0.75F, -0.25F, -1.25F); // Box 353
        gunModel[245].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[246].addShapeBox(124F, -10.5F, 0F, 1, 1, 4, 0F, 0.75F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, 0.75F, -0.25F, -1.25F, 0.75F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0.75F, 0F, -0.75F); // Box 354
        gunModel[246].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[247].addShapeBox(123F, -9.5F, 0F, 1, 1, 4, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 355
        gunModel[247].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[248].addShapeBox(124F, -8.5F, 0F, 1, 1, 4, 0F, 0.75F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, 0.75F, -0.25F, -1.25F); // Box 356
        gunModel[248].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[249].addShapeBox(123F, -10.5F, 0F, 1, 1, 4, 0F, 0.75F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, 0.75F, -0.25F, -1.25F, 0.75F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0.75F, 0F, -0.75F); // Box 357
        gunModel[249].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[250].addShapeBox(122F, -9.5F, 0F, 1, 1, 4, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 358
        gunModel[250].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[251].addShapeBox(123F, -8.5F, 0F, 1, 1, 4, 0F, 0.75F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, 0.75F, -0.25F, -1.25F); // Box 359
        gunModel[251].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[252].addShapeBox(122F, -10.5F, 0F, 1, 1, 4, 0F, 0.75F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, 0.75F, -0.25F, -1.25F, 0.75F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0.75F, 0F, -0.75F); // Box 360
        gunModel[252].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[253].addShapeBox(121F, -9.5F, 0F, 1, 1, 4, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 361
        gunModel[253].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[254].addShapeBox(122F, -8.5F, 0F, 1, 1, 4, 0F, 0.75F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, 0.75F, -0.25F, -1.25F); // Box 362
        gunModel[254].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[255].addShapeBox(129.75F, -10.5F, 0F, 1, 1, 4, 0F, 0.75F, -0.25F, -1.25F, -1.25F, -1F, -1.25F, -1.25F, -1F, -1.25F, 0.75F, -0.25F, -1.25F, 0.75F, 0F, -0.75F, -1.25F, 0F, -1.25F, -1.25F, 0F, -1.25F, 0.75F, 0F, -0.75F); // Box 364
        gunModel[255].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[256].addShapeBox(128.75F, -9.5F, 0F, 1, 1, 4, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.75F); // Box 365
        gunModel[256].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[257].addShapeBox(129.75F, -8.5F, 0F, 1, 1, 4, 0F, 0.75F, 0F, -0.75F, -1.25F, 0F, -1.25F, -1.25F, 0F, -1.25F, 0.75F, 0F, -0.75F, 0.75F, -0.25F, -1.25F, -1.25F, -1F, -1.25F, -1.25F, -1F, -1.25F, 0.75F, -0.25F, -1.25F); // Box 366
        gunModel[257].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[258].addShapeBox(106F, -18F, -7F, 92, 7, 13, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 394
        gunModel[258].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[259].addShapeBox(130F, -11F, -6F, 65, 4, 11, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 395
        gunModel[259].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[260].addShapeBox(128F, -10F, -5F, 1, 3, 8, 0F, -1F, -3F, -2F, 1F, -1F, -1F, 1F, -1F, 0.5F, -1F, -2F, 0F, -1F, 0F, -2F, 1F, 0F, -2F, 1F, -1F, 0F, -1F, -1F, 0F); // Box 396
        gunModel[260].setRotationPoint(-25F, -63F, 0.5F);

        gunModel[261].addShapeBox(128F, -13F, -6F, 1, 3, 11, 0F, -1F, 0F, -2F, 1F, -1F, -2F, 1F, -1F, 0F, -1F, -1F, 0F, -1F, -3F, -2F, 1F, -1F, -1F, 1F, -1F, -0.5F, -1F, -2F, 0F); // Box 397
        gunModel[261].setRotationPoint(-25F, -63F, 0.5F);

        gunModel[262].addShapeBox(106F, -11F, -6F, 24, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
        gunModel[262].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[263].addShapeBox(27F, 0F, -2.5F, 34, 5, 4, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Box 405
        gunModel[263].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[264].addShapeBox(10F, 7F, -5F, 1, 9, 9, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
        gunModel[264].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[265].addShapeBox(14F, 0F, -5F, 1, 7, 9, 0F, -7F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 860
        gunModel[265].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[266].addShapeBox(4F, 16F, -5F, 1, 5, 9, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 861
        gunModel[266].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[267].addShapeBox(1F, 21F, -5F, 1, 3, 9, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 862
        gunModel[267].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[268].addShapeBox(0F, 24F, -5F, 1, 2, 9, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 863
        gunModel[268].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[269].addShapeBox(-1F, 26F, -5F, 1, 11, 9, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 864
        gunModel[269].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[270].addShapeBox(-4F, 37F, -5F, 1, 10, 9, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 865
        gunModel[270].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[271].addShapeBox(-7F, 47F, -5F, 1, 8, 9, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -7F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -7F, 0F, 0F); // Box 866
        gunModel[271].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[272].addShapeBox(222F, -23F, -7F, 3, 5, 4, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 867
        gunModel[272].setRotationPoint(-51F, -64F, 0.5F);

        gunModel[273].addShapeBox(55F, -13F, 2F, 3, 6, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 876
        gunModel[273].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[274].addShapeBox(55F, -24F, 2F, 3, 11, 11, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 880
        gunModel[274].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[275].addShapeBox(55F, -7F, 2F, 3, 11, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -5F, -5F); // Box 881
        gunModel[275].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[276].addShapeBox(55F, -13F, -15F, 3, 6, 11, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 868
        gunModel[276].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[277].addShapeBox(55F, -7F, -15F, 3, 11, 11, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -5F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 869
        gunModel[277].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[278].addShapeBox(55F, -24F, -15F, 3, 11, 11, 0F, 0F, -5F, -5F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
        gunModel[278].setRotationPoint(-25F, -64F, 0.5F);

        gunModel[279].addShapeBox(222F, -23F, -3F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -1F, 0F, 0F, -1F); // Box 872
        gunModel[279].setRotationPoint(-51F, -64F, 0.5F);

        gunModel[280].addShapeBox(222F, -23F, 1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 873
        gunModel[280].setRotationPoint(-51F, -64F, 0.5F);

        gunModel[281].addShapeBox(222F, -19F, 1F, 3, 1, 1, 0F, 0F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 874
        gunModel[281].setRotationPoint(-51F, -64F, 0.5F);

        gunModel[282].addShapeBox(222F, -19F, -3F, 3, 1, 1, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 875
        gunModel[282].setRotationPoint(-51F, -64F, 0.5F);


        ammoModel = new ModelRendererTurbo[168];
        ammoModel[0] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 323
        ammoModel[1] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 327
        ammoModel[2] = new ModelRendererTurbo(this, 673, 97, textureX, textureY); // Box 328
        ammoModel[3] = new ModelRendererTurbo(this, 705, 97, textureX, textureY); // Box 329
        ammoModel[4] = new ModelRendererTurbo(this, 905, 97, textureX, textureY); // Box 330
        ammoModel[5] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 331
        ammoModel[6] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 332
        ammoModel[7] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 333
        ammoModel[8] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 334
        ammoModel[9] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 335
        ammoModel[10] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 336
        ammoModel[11] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 337
        ammoModel[12] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 338
        ammoModel[13] = new ModelRendererTurbo(this, 513, 9, textureX, textureY); // Box 339
        ammoModel[14] = new ModelRendererTurbo(this, 513, 73, textureX, textureY); // Box 340
        ammoModel[15] = new ModelRendererTurbo(this, 545, 9, textureX, textureY); // Box 341
        ammoModel[16] = new ModelRendererTurbo(this, 809, 9, textureX, textureY); // Box 342
        ammoModel[17] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 343
        ammoModel[18] = new ModelRendererTurbo(this, 529, 65, textureX, textureY); // Box 344
        ammoModel[19] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 345
        ammoModel[20] = new ModelRendererTurbo(this, 649, 73, textureX, textureY); // Box 346
        ammoModel[21] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 349
        ammoModel[22] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 352
        ammoModel[23] = new ModelRendererTurbo(this, 561, 9, textureX, textureY); // Box 353
        ammoModel[24] = new ModelRendererTurbo(this, 681, 73, textureX, textureY); // Box 356
        ammoModel[25] = new ModelRendererTurbo(this, 945, 9, textureX, textureY); // Box 357
        ammoModel[26] = new ModelRendererTurbo(this, 545, 81, textureX, textureY); // Box 358
        ammoModel[27] = new ModelRendererTurbo(this, 601, 81, textureX, textureY); // Box 359
        ammoModel[28] = new ModelRendererTurbo(this, 745, 25, textureX, textureY); // Box 323
        ammoModel[29] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 327
        ammoModel[30] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 328
        ammoModel[31] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 329
        ammoModel[32] = new ModelRendererTurbo(this, 625, 121, textureX, textureY); // Box 330
        ammoModel[33] = new ModelRendererTurbo(this, 665, 121, textureX, textureY); // Box 331
        ammoModel[34] = new ModelRendererTurbo(this, 713, 121, textureX, textureY); // Box 332
        ammoModel[35] = new ModelRendererTurbo(this, 753, 121, textureX, textureY); // Box 333
        ammoModel[36] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 334
        ammoModel[37] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 335
        ammoModel[38] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 336
        ammoModel[39] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 337
        ammoModel[40] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 338
        ammoModel[41] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 339
        ammoModel[42] = new ModelRendererTurbo(this, 953, 81, textureX, textureY); // Box 340
        ammoModel[43] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 341
        ammoModel[44] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 342
        ammoModel[45] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 343
        ammoModel[46] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 344
        ammoModel[47] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 345
        ammoModel[48] = new ModelRendererTurbo(this, 857, 89, textureX, textureY); // Box 346
        ammoModel[49] = new ModelRendererTurbo(this, 833, 25, textureX, textureY); // Box 349
        ammoModel[50] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 352
        ammoModel[51] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 353
        ammoModel[52] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 356
        ammoModel[53] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 357
        ammoModel[54] = new ModelRendererTurbo(this, 937, 97, textureX, textureY); // Box 358
        ammoModel[55] = new ModelRendererTurbo(this, 785, 105, textureX, textureY); // Box 359
        ammoModel[56] = new ModelRendererTurbo(this, 801, 33, textureX, textureY); // Box 323
        ammoModel[57] = new ModelRendererTurbo(this, 793, 121, textureX, textureY); // Box 327
        ammoModel[58] = new ModelRendererTurbo(this, 841, 121, textureX, textureY); // Box 328
        ammoModel[59] = new ModelRendererTurbo(this, 889, 121, textureX, textureY); // Box 329
        ammoModel[60] = new ModelRendererTurbo(this, 929, 121, textureX, textureY); // Box 330
        ammoModel[61] = new ModelRendererTurbo(this, 625, 129, textureX, textureY); // Box 331
        ammoModel[62] = new ModelRendererTurbo(this, 665, 129, textureX, textureY); // Box 332
        ammoModel[63] = new ModelRendererTurbo(this, 713, 129, textureX, textureY); // Box 333
        ammoModel[64] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 334
        ammoModel[65] = new ModelRendererTurbo(this, 545, 25, textureX, textureY); // Box 335
        ammoModel[66] = new ModelRendererTurbo(this, 569, 25, textureX, textureY); // Box 336
        ammoModel[67] = new ModelRendererTurbo(this, 577, 25, textureX, textureY); // Box 337
        ammoModel[68] = new ModelRendererTurbo(this, 585, 25, textureX, textureY); // Box 338
        ammoModel[69] = new ModelRendererTurbo(this, 609, 25, textureX, textureY); // Box 339
        ammoModel[70] = new ModelRendererTurbo(this, 1009, 105, textureX, textureY); // Box 340
        ammoModel[71] = new ModelRendererTurbo(this, 793, 25, textureX, textureY); // Box 341
        ammoModel[72] = new ModelRendererTurbo(this, 865, 25, textureX, textureY); // Box 342
        ammoModel[73] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 343
        ammoModel[74] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 344
        ammoModel[75] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 345
        ammoModel[76] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 346
        ammoModel[77] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 349
        ammoModel[78] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 352
        ammoModel[79] = new ModelRendererTurbo(this, 761, 25, textureX, textureY); // Box 353
        ammoModel[80] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 356
        ammoModel[81] = new ModelRendererTurbo(this, 841, 25, textureX, textureY); // Box 357
        ammoModel[82] = new ModelRendererTurbo(this, 569, 113, textureX, textureY); // Box 358
        ammoModel[83] = new ModelRendererTurbo(this, 1009, 113, textureX, textureY); // Box 359
        ammoModel[84] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 323
        ammoModel[85] = new ModelRendererTurbo(this, 753, 129, textureX, textureY); // Box 327
        ammoModel[86] = new ModelRendererTurbo(this, 793, 129, textureX, textureY); // Box 328
        ammoModel[87] = new ModelRendererTurbo(this, 841, 129, textureX, textureY); // Box 329
        ammoModel[88] = new ModelRendererTurbo(this, 889, 129, textureX, textureY); // Box 330
        ammoModel[89] = new ModelRendererTurbo(this, 993, 129, textureX, textureY); // Box 331
        ammoModel[90] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 332
        ammoModel[91] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 333
        ammoModel[92] = new ModelRendererTurbo(this, 881, 25, textureX, textureY); // Box 334
        ammoModel[93] = new ModelRendererTurbo(this, 905, 25, textureX, textureY); // Box 335
        ammoModel[94] = new ModelRendererTurbo(this, 913, 25, textureX, textureY); // Box 336
        ammoModel[95] = new ModelRendererTurbo(this, 921, 25, textureX, textureY); // Box 337
        ammoModel[96] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 338
        ammoModel[97] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 339
        ammoModel[98] = new ModelRendererTurbo(this, 569, 121, textureX, textureY); // Box 340
        ammoModel[99] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 341
        ammoModel[100] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 342
        ammoModel[101] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 343
        ammoModel[102] = new ModelRendererTurbo(this, 945, 129, textureX, textureY); // Box 344
        ammoModel[103] = new ModelRendererTurbo(this, 969, 129, textureX, textureY); // Box 345
        ammoModel[104] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 346
        ammoModel[105] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Box 349
        ammoModel[106] = new ModelRendererTurbo(this, 969, 121, textureX, textureY); // Box 352
        ammoModel[107] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 353
        ammoModel[108] = new ModelRendererTurbo(this, 929, 129, textureX, textureY); // Box 356
        ammoModel[109] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 357
        ammoModel[110] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 358
        ammoModel[111] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 359
        ammoModel[112] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 323
        ammoModel[113] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 327
        ammoModel[114] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 328
        ammoModel[115] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 329
        ammoModel[116] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 330
        ammoModel[117] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 331
        ammoModel[118] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 332
        ammoModel[119] = new ModelRendererTurbo(this, 521, 137, textureX, textureY); // Box 333
        ammoModel[120] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 334
        ammoModel[121] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 335
        ammoModel[122] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 336
        ammoModel[123] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 337
        ammoModel[124] = new ModelRendererTurbo(this, 545, 33, textureX, textureY); // Box 338
        ammoModel[125] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Box 339
        ammoModel[126] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 340
        ammoModel[127] = new ModelRendererTurbo(this, 665, 33, textureX, textureY); // Box 341
        ammoModel[128] = new ModelRendererTurbo(this, 897, 89, textureX, textureY); // Box 342
        ammoModel[129] = new ModelRendererTurbo(this, 553, 137, textureX, textureY); // Box 343
        ammoModel[130] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 344
        ammoModel[131] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 345
        ammoModel[132] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 346
        ammoModel[133] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 349
        ammoModel[134] = new ModelRendererTurbo(this, 993, 137, textureX, textureY); // Box 352
        ammoModel[135] = new ModelRendererTurbo(this, 609, 33, textureX, textureY); // Box 353
        ammoModel[136] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 356
        ammoModel[137] = new ModelRendererTurbo(this, 681, 33, textureX, textureY); // Box 357
        ammoModel[138] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 358
        ammoModel[139] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 359
        ammoModel[140] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 323
        ammoModel[141] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 327
        ammoModel[142] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 328
        ammoModel[143] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 329
        ammoModel[144] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Box 330
        ammoModel[145] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 331
        ammoModel[146] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 332
        ammoModel[147] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 333
        ammoModel[148] = new ModelRendererTurbo(this, 745, 33, textureX, textureY); // Box 334
        ammoModel[149] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 335
        ammoModel[150] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 336
        ammoModel[151] = new ModelRendererTurbo(this, 721, 49, textureX, textureY); // Box 337
        ammoModel[152] = new ModelRendererTurbo(this, 809, 49, textureX, textureY); // Box 338
        ammoModel[153] = new ModelRendererTurbo(this, 937, 49, textureX, textureY); // Box 339
        ammoModel[154] = new ModelRendererTurbo(this, 705, 145, textureX, textureY); // Box 340
        ammoModel[155] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 341
        ammoModel[156] = new ModelRendererTurbo(this, 569, 145, textureX, textureY); // Box 342
        ammoModel[157] = new ModelRendererTurbo(this, 769, 145, textureX, textureY); // Box 343
        ammoModel[158] = new ModelRendererTurbo(this, 825, 145, textureX, textureY); // Box 344
        ammoModel[159] = new ModelRendererTurbo(this, 857, 145, textureX, textureY); // Box 345
        ammoModel[160] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 346
        ammoModel[161] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 349
        ammoModel[162] = new ModelRendererTurbo(this, 785, 145, textureX, textureY); // Box 352
        ammoModel[163] = new ModelRendererTurbo(this, 697, 65, textureX, textureY); // Box 353
        ammoModel[164] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 356
        ammoModel[165] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 357
        ammoModel[166] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 358
        ammoModel[167] = new ModelRendererTurbo(this, 377, 153, textureX, textureY); // Box 359

        ammoModel[0].addShapeBox(0F, -12F, -0.5F, 1, 5, 1, 0F, 0F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 323
        ammoModel[0].setRotationPoint(33.3F, -74F, 0.5F);

        ammoModel[1].addShapeBox(0F, -12F, -0.5F, 13, 5, 1, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 327
        ammoModel[1].setRotationPoint(33.3F, -74F, 0.5F);

        ammoModel[2].addShapeBox(0F, -10F, 0.5F, 13, 1, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 328
        ammoModel[2].setRotationPoint(33.3F, -74F, 0.5F);

        ammoModel[3].addShapeBox(0F, -12F, 0.5F, 13, 2, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 329
        ammoModel[3].setRotationPoint(33.3F, -74F, 0.5F);

        ammoModel[4].addShapeBox(0F, -12F, -2.5F, 13, 2, 2, 0F, -0.6F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 330
        ammoModel[4].setRotationPoint(33.3F, -74F, 0.5F);

        ammoModel[5].addShapeBox(0F, -10F, -2.5F, 13, 1, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 331
        ammoModel[5].setRotationPoint(33.3F, -74F, 0.5F);

        ammoModel[6].addShapeBox(0F, -9F, -2.5F, 13, 2, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 332
        ammoModel[6].setRotationPoint(33.3F, -74F, 0.5F);

        ammoModel[7].addShapeBox(0F, -9F, 0.5F, 13, 2, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F); // Box 333
        ammoModel[7].setRotationPoint(33.3F, -74F, 0.5F);

        ammoModel[8].addShapeBox(0F, -10F, 0.5F, 1, 1, 2, 0F, 0F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 334
        ammoModel[8].setRotationPoint(33.3F, -74F, 0.5F);

        ammoModel[9].addShapeBox(0F, -12F, 0.5F, 1, 1, 2, 0F, 0F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0.7F, -0.3F, -0.4F, 0.7F, -0.3F, -0.4F, 0.7F, 0.3F, 0F, 0.7F, 0.3F); // Box 335
        ammoModel[9].setRotationPoint(33.3F, -74F, 0.5F);

        ammoModel[10].addShapeBox(0F, -12F, -2.5F, 1, 1, 2, 0F, 0F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.7F, 0.3F, -0.4F, 0.7F, 0.3F, -0.4F, 0.7F, -0.3F, 0F, 0.7F, -0.3F); // Box 336
        ammoModel[10].setRotationPoint(33.3F, -74F, 0.5F);

        ammoModel[11].addShapeBox(0F, -10F, -2.5F, 1, 1, 2, 0F, 0F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, -0.4F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, -0.4F, 0.3F, -0.3F, 0F, 0.3F, -0.3F); // Box 337
        ammoModel[11].setRotationPoint(33.3F, -74F, 0.5F);

        ammoModel[12].addShapeBox(0F, -8F, 0.5F, 1, 1, 2, 0F, 0F, 0.7F, -0.3F, -0.4F, 0.7F, -0.3F, -0.4F, 0.7F, 0.3F, 0F, 0.7F, 0.3F, 0F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 338
        ammoModel[12].setRotationPoint(33.3F, -74F, 0.5F);

        ammoModel[13].addShapeBox(0F, -8F, -2.5F, 1, 1, 2, 0F, 0F, 0.7F, 0.3F, -0.4F, 0.7F, 0.3F, -0.4F, 0.7F, -0.3F, 0F, 0.7F, -0.3F, 0F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 0.3F, -0.3F, 0F, 0.3F, -0.3F); // Box 339
        ammoModel[13].setRotationPoint(33.3F, -74F, 0.5F);

        ammoModel[14].addShapeBox(11F, -12F, -0.5F, 4, 5, 1, 0F, -0.8F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.8F, -0.2F, 0F); // Box 340
        ammoModel[14].setRotationPoint(33.3F, -74F, 0.5F);

        ammoModel[15].addShapeBox(11F, -10F, 0.5F, 4, 1, 2, 0F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.8F, 0F, -0.2F); // Box 341
        ammoModel[15].setRotationPoint(33.3F, -74F, 0.5F);

        ammoModel[16].addShapeBox(11F, -10F, -2.5F, 4, 1, 2, 0F, -0.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.8F, 0F, 0F); // Box 342
        ammoModel[16].setRotationPoint(33.3F, -74F, 0.5F);

        ammoModel[17].addShapeBox(11F, -12F, 0.5F, 4, 2, 2, 0F, -0.8F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.7F, -0.7F, -0.8F, -0.7F, -0.7F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.8F, 0F, -0.2F); // Box 343
        ammoModel[17].setRotationPoint(33.3F, -74F, 0.5F);

        ammoModel[18].addShapeBox(11F, -12F, -2.5F, 4, 2, 2, 0F, -0.8F, -0.7F, -0.7F, -0.3F, -0.7F, -0.7F, -0.3F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.8F, 0F, 0F); // Box 344
        ammoModel[18].setRotationPoint(33.3F, -74F, 0.5F);

        ammoModel[19].addShapeBox(11F, -9F, -2.5F, 4, 2, 2, 0F, -0.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.7F, -0.7F, -0.3F, -0.7F, -0.7F, -0.3F, -0.2F, 0F, -0.8F, -0.2F, 0F); // Box 345
        ammoModel[19].setRotationPoint(33.3F, -74F, 0.5F);

        ammoModel[20].addShapeBox(11F, -9F, 0.5F, 4, 2, 2, 0F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.7F, -0.7F, -0.8F, -0.7F, -0.7F); // Box 346
        ammoModel[20].setRotationPoint(33.3F, -74F, 0.5F);

        ammoModel[21].addShapeBox(14F, -12F, -0.5F, 2, 5, 1, 0F, -0.7F, -0.2F, 0F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, -0.7F, -0.2F, 0F); // Box 349
        ammoModel[21].setRotationPoint(33.3F, -74F, 0.5F);

        ammoModel[22].addShapeBox(14F, -12F, 0.5F, 2, 2, 2, 0F, -0.7F, -0.2F, 0F, 0F, -1.4F, 0.2F, 0F, -1.6F, -1.6F, -0.7F, -0.7F, -0.7F, -0.7F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, -1.4F, -0.7F, 0F, -0.2F); // Box 352
        ammoModel[22].setRotationPoint(33.3F, -74F, 0.5F);

        ammoModel[23].addShapeBox(14F, -10F, 0.5F, 2, 1, 2, 0F, -0.7F, 0F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1.4F, -0.7F, 0F, -0.2F, -0.7F, 0F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1.4F, -0.7F, 0F, -0.2F); // Box 353
        ammoModel[23].setRotationPoint(33.3F, -74F, 0.5F);

        ammoModel[24].addShapeBox(14F, -12F, -2.5F, 2, 2, 2, 0F, -0.7F, -0.7F, -0.7F, 0F, -1.6F, -1.6F, 0F, -1.4F, 0.2F, -0.7F, -0.2F, 0F, -0.7F, 0F, -0.2F, 0F, 0.2F, -1.4F, 0F, 0.2F, 0.2F, -0.7F, 0F, 0F); // Box 356
        ammoModel[24].setRotationPoint(33.3F, -74F, 0.5F);

        ammoModel[25].addShapeBox(14F, -10F, -2.5F, 2, 1, 2, 0F, -0.7F, 0F, -0.2F, 0F, -0.2F, -1.4F, 0F, -0.2F, 0.2F, -0.7F, 0F, 0F, -0.7F, 0F, -0.2F, 0F, -0.2F, -1.4F, 0F, -0.2F, 0.2F, -0.7F, 0F, 0F); // Box 357
        ammoModel[25].setRotationPoint(33.3F, -74F, 0.5F);

        ammoModel[26].addShapeBox(14F, -9F, -2.5F, 2, 2, 2, 0F, -0.7F, 0F, -0.2F, 0F, 0.2F, -1.4F, 0F, 0.2F, 0.2F, -0.7F, 0F, 0F, -0.7F, -0.7F, -0.7F, 0F, -1.6F, -1.6F, 0F, -1.4F, 0.2F, -0.7F, -0.2F, 0F); // Box 358
        ammoModel[26].setRotationPoint(33.3F, -74F, 0.5F);

        ammoModel[27].addShapeBox(14F, -9F, 0.5F, 2, 2, 2, 0F, -0.7F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, -1.4F, -0.7F, 0F, -0.2F, -0.7F, -0.2F, 0F, 0F, -1.4F, 0.2F, 0F, -1.6F, -1.6F, -0.7F, -0.7F, -0.7F); // Box 359
        ammoModel[27].setRotationPoint(33.3F, -74F, 0.5F);

        ammoModel[28].addShapeBox(0F, -12F, -0.5F, 1, 5, 1, 0F, 0F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 323
        ammoModel[28].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[28].rotateAngleX = 1.04719755F;

        ammoModel[29].addShapeBox(0F, -12F, -0.5F, 13, 5, 1, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 327
        ammoModel[29].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[29].rotateAngleX = 1.04719755F;

        ammoModel[30].addShapeBox(0F, -10F, 0.5F, 13, 1, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 328
        ammoModel[30].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[30].rotateAngleX = 1.04719755F;

        ammoModel[31].addShapeBox(0F, -12F, 0.5F, 13, 2, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 329
        ammoModel[31].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[31].rotateAngleX = 1.04719755F;

        ammoModel[32].addShapeBox(0F, -12F, -2.5F, 13, 2, 2, 0F, -0.6F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 330
        ammoModel[32].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[32].rotateAngleX = 1.04719755F;

        ammoModel[33].addShapeBox(0F, -10F, -2.5F, 13, 1, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 331
        ammoModel[33].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[33].rotateAngleX = 1.04719755F;

        ammoModel[34].addShapeBox(0F, -9F, -2.5F, 13, 2, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 332
        ammoModel[34].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[34].rotateAngleX = 1.04719755F;

        ammoModel[35].addShapeBox(0F, -9F, 0.5F, 13, 2, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F); // Box 333
        ammoModel[35].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[35].rotateAngleX = 1.04719755F;

        ammoModel[36].addShapeBox(0F, -10F, 0.5F, 1, 1, 2, 0F, 0F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 334
        ammoModel[36].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[36].rotateAngleX = 1.04719755F;

        ammoModel[37].addShapeBox(0F, -12F, 0.5F, 1, 1, 2, 0F, 0F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0.7F, -0.3F, -0.4F, 0.7F, -0.3F, -0.4F, 0.7F, 0.3F, 0F, 0.7F, 0.3F); // Box 335
        ammoModel[37].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[37].rotateAngleX = 1.04719755F;

        ammoModel[38].addShapeBox(0F, -12F, -2.5F, 1, 1, 2, 0F, 0F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.7F, 0.3F, -0.4F, 0.7F, 0.3F, -0.4F, 0.7F, -0.3F, 0F, 0.7F, -0.3F); // Box 336
        ammoModel[38].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[38].rotateAngleX = 1.04719755F;

        ammoModel[39].addShapeBox(0F, -10F, -2.5F, 1, 1, 2, 0F, 0F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, -0.4F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, -0.4F, 0.3F, -0.3F, 0F, 0.3F, -0.3F); // Box 337
        ammoModel[39].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[39].rotateAngleX = 1.04719755F;

        ammoModel[40].addShapeBox(0F, -8F, 0.5F, 1, 1, 2, 0F, 0F, 0.7F, -0.3F, -0.4F, 0.7F, -0.3F, -0.4F, 0.7F, 0.3F, 0F, 0.7F, 0.3F, 0F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 338
        ammoModel[40].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[40].rotateAngleX = 1.04719755F;

        ammoModel[41].addShapeBox(0F, -8F, -2.5F, 1, 1, 2, 0F, 0F, 0.7F, 0.3F, -0.4F, 0.7F, 0.3F, -0.4F, 0.7F, -0.3F, 0F, 0.7F, -0.3F, 0F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 0.3F, -0.3F, 0F, 0.3F, -0.3F); // Box 339
        ammoModel[41].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[41].rotateAngleX = 1.04719755F;

        ammoModel[42].addShapeBox(11F, -12F, -0.5F, 4, 5, 1, 0F, -0.8F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.8F, -0.2F, 0F); // Box 340
        ammoModel[42].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[42].rotateAngleX = 1.04719755F;

        ammoModel[43].addShapeBox(11F, -10F, 0.5F, 4, 1, 2, 0F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.8F, 0F, -0.2F); // Box 341
        ammoModel[43].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[43].rotateAngleX = 1.04719755F;

        ammoModel[44].addShapeBox(11F, -10F, -2.5F, 4, 1, 2, 0F, -0.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.8F, 0F, 0F); // Box 342
        ammoModel[44].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[44].rotateAngleX = 1.04719755F;

        ammoModel[45].addShapeBox(11F, -12F, 0.5F, 4, 2, 2, 0F, -0.8F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.7F, -0.7F, -0.8F, -0.7F, -0.7F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.8F, 0F, -0.2F); // Box 343
        ammoModel[45].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[45].rotateAngleX = 1.04719755F;

        ammoModel[46].addShapeBox(11F, -12F, -2.5F, 4, 2, 2, 0F, -0.8F, -0.7F, -0.7F, -0.3F, -0.7F, -0.7F, -0.3F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.8F, 0F, 0F); // Box 344
        ammoModel[46].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[46].rotateAngleX = 1.04719755F;

        ammoModel[47].addShapeBox(11F, -9F, -2.5F, 4, 2, 2, 0F, -0.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.7F, -0.7F, -0.3F, -0.7F, -0.7F, -0.3F, -0.2F, 0F, -0.8F, -0.2F, 0F); // Box 345
        ammoModel[47].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[47].rotateAngleX = 1.04719755F;

        ammoModel[48].addShapeBox(11F, -9F, 0.5F, 4, 2, 2, 0F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.7F, -0.7F, -0.8F, -0.7F, -0.7F); // Box 346
        ammoModel[48].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[48].rotateAngleX = 1.04719755F;

        ammoModel[49].addShapeBox(14F, -12F, -0.5F, 2, 5, 1, 0F, -0.7F, -0.2F, 0F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, -0.7F, -0.2F, 0F); // Box 349
        ammoModel[49].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[49].rotateAngleX = 1.04719755F;

        ammoModel[50].addShapeBox(14F, -12F, 0.5F, 2, 2, 2, 0F, -0.7F, -0.2F, 0F, 0F, -1.4F, 0.2F, 0F, -1.6F, -1.6F, -0.7F, -0.7F, -0.7F, -0.7F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, -1.4F, -0.7F, 0F, -0.2F); // Box 352
        ammoModel[50].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[50].rotateAngleX = 1.04719755F;

        ammoModel[51].addShapeBox(14F, -10F, 0.5F, 2, 1, 2, 0F, -0.7F, 0F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1.4F, -0.7F, 0F, -0.2F, -0.7F, 0F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1.4F, -0.7F, 0F, -0.2F); // Box 353
        ammoModel[51].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[51].rotateAngleX = 1.04719755F;

        ammoModel[52].addShapeBox(14F, -12F, -2.5F, 2, 2, 2, 0F, -0.7F, -0.7F, -0.7F, 0F, -1.6F, -1.6F, 0F, -1.4F, 0.2F, -0.7F, -0.2F, 0F, -0.7F, 0F, -0.2F, 0F, 0.2F, -1.4F, 0F, 0.2F, 0.2F, -0.7F, 0F, 0F); // Box 356
        ammoModel[52].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[52].rotateAngleX = 1.04719755F;

        ammoModel[53].addShapeBox(14F, -10F, -2.5F, 2, 1, 2, 0F, -0.7F, 0F, -0.2F, 0F, -0.2F, -1.4F, 0F, -0.2F, 0.2F, -0.7F, 0F, 0F, -0.7F, 0F, -0.2F, 0F, -0.2F, -1.4F, 0F, -0.2F, 0.2F, -0.7F, 0F, 0F); // Box 357
        ammoModel[53].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[53].rotateAngleX = 1.04719755F;

        ammoModel[54].addShapeBox(14F, -9F, -2.5F, 2, 2, 2, 0F, -0.7F, 0F, -0.2F, 0F, 0.2F, -1.4F, 0F, 0.2F, 0.2F, -0.7F, 0F, 0F, -0.7F, -0.7F, -0.7F, 0F, -1.6F, -1.6F, 0F, -1.4F, 0.2F, -0.7F, -0.2F, 0F); // Box 358
        ammoModel[54].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[54].rotateAngleX = 1.04719755F;

        ammoModel[55].addShapeBox(14F, -9F, 0.5F, 2, 2, 2, 0F, -0.7F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, -1.4F, -0.7F, 0F, -0.2F, -0.7F, -0.2F, 0F, 0F, -1.4F, 0.2F, 0F, -1.6F, -1.6F, -0.7F, -0.7F, -0.7F); // Box 359
        ammoModel[55].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[55].rotateAngleX = 1.04719755F;

        ammoModel[56].addShapeBox(0F, -12F, -0.5F, 1, 5, 1, 0F, 0F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 323
        ammoModel[56].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[56].rotateAngleX = -1.04719755F;

        ammoModel[57].addShapeBox(0F, -12F, -0.5F, 13, 5, 1, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 327
        ammoModel[57].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[57].rotateAngleX = -1.04719755F;

        ammoModel[58].addShapeBox(0F, -10F, 0.5F, 13, 1, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 328
        ammoModel[58].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[58].rotateAngleX = -1.04719755F;

        ammoModel[59].addShapeBox(0F, -12F, 0.5F, 13, 2, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 329
        ammoModel[59].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[59].rotateAngleX = -1.04719755F;

        ammoModel[60].addShapeBox(0F, -12F, -2.5F, 13, 2, 2, 0F, -0.6F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 330
        ammoModel[60].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[60].rotateAngleX = -1.04719755F;

        ammoModel[61].addShapeBox(0F, -10F, -2.5F, 13, 1, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 331
        ammoModel[61].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[61].rotateAngleX = -1.04719755F;

        ammoModel[62].addShapeBox(0F, -9F, -2.5F, 13, 2, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 332
        ammoModel[62].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[62].rotateAngleX = -1.04719755F;

        ammoModel[63].addShapeBox(0F, -9F, 0.5F, 13, 2, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F); // Box 333
        ammoModel[63].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[63].rotateAngleX = -1.04719755F;

        ammoModel[64].addShapeBox(0F, -10F, 0.5F, 1, 1, 2, 0F, 0F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 334
        ammoModel[64].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[64].rotateAngleX = -1.04719755F;

        ammoModel[65].addShapeBox(0F, -12F, 0.5F, 1, 1, 2, 0F, 0F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0.7F, -0.3F, -0.4F, 0.7F, -0.3F, -0.4F, 0.7F, 0.3F, 0F, 0.7F, 0.3F); // Box 335
        ammoModel[65].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[65].rotateAngleX = -1.04719755F;

        ammoModel[66].addShapeBox(0F, -12F, -2.5F, 1, 1, 2, 0F, 0F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.7F, 0.3F, -0.4F, 0.7F, 0.3F, -0.4F, 0.7F, -0.3F, 0F, 0.7F, -0.3F); // Box 336
        ammoModel[66].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[66].rotateAngleX = -1.04719755F;

        ammoModel[67].addShapeBox(0F, -10F, -2.5F, 1, 1, 2, 0F, 0F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, -0.4F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, -0.4F, 0.3F, -0.3F, 0F, 0.3F, -0.3F); // Box 337
        ammoModel[67].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[67].rotateAngleX = -1.04719755F;

        ammoModel[68].addShapeBox(0F, -8F, 0.5F, 1, 1, 2, 0F, 0F, 0.7F, -0.3F, -0.4F, 0.7F, -0.3F, -0.4F, 0.7F, 0.3F, 0F, 0.7F, 0.3F, 0F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 338
        ammoModel[68].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[68].rotateAngleX = -1.04719755F;

        ammoModel[69].addShapeBox(0F, -8F, -2.5F, 1, 1, 2, 0F, 0F, 0.7F, 0.3F, -0.4F, 0.7F, 0.3F, -0.4F, 0.7F, -0.3F, 0F, 0.7F, -0.3F, 0F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 0.3F, -0.3F, 0F, 0.3F, -0.3F); // Box 339
        ammoModel[69].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[69].rotateAngleX = -1.04719755F;

        ammoModel[70].addShapeBox(11F, -12F, -0.5F, 4, 5, 1, 0F, -0.8F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.8F, -0.2F, 0F); // Box 340
        ammoModel[70].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[70].rotateAngleX = -1.04719755F;

        ammoModel[71].addShapeBox(11F, -10F, 0.5F, 4, 1, 2, 0F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.8F, 0F, -0.2F); // Box 341
        ammoModel[71].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[71].rotateAngleX = -1.04719755F;

        ammoModel[72].addShapeBox(11F, -10F, -2.5F, 4, 1, 2, 0F, -0.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.8F, 0F, 0F); // Box 342
        ammoModel[72].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[72].rotateAngleX = -1.04719755F;

        ammoModel[73].addShapeBox(11F, -12F, 0.5F, 4, 2, 2, 0F, -0.8F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.7F, -0.7F, -0.8F, -0.7F, -0.7F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.8F, 0F, -0.2F); // Box 343
        ammoModel[73].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[73].rotateAngleX = -1.04719755F;

        ammoModel[74].addShapeBox(11F, -12F, -2.5F, 4, 2, 2, 0F, -0.8F, -0.7F, -0.7F, -0.3F, -0.7F, -0.7F, -0.3F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.8F, 0F, 0F); // Box 344
        ammoModel[74].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[74].rotateAngleX = -1.04719755F;

        ammoModel[75].addShapeBox(11F, -9F, -2.5F, 4, 2, 2, 0F, -0.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.7F, -0.7F, -0.3F, -0.7F, -0.7F, -0.3F, -0.2F, 0F, -0.8F, -0.2F, 0F); // Box 345
        ammoModel[75].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[75].rotateAngleX = -1.04719755F;

        ammoModel[76].addShapeBox(11F, -9F, 0.5F, 4, 2, 2, 0F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.7F, -0.7F, -0.8F, -0.7F, -0.7F); // Box 346
        ammoModel[76].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[76].rotateAngleX = -1.04719755F;

        ammoModel[77].addShapeBox(14F, -12F, -0.5F, 2, 5, 1, 0F, -0.7F, -0.2F, 0F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, -0.7F, -0.2F, 0F); // Box 349
        ammoModel[77].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[77].rotateAngleX = -1.04719755F;

        ammoModel[78].addShapeBox(14F, -12F, 0.5F, 2, 2, 2, 0F, -0.7F, -0.2F, 0F, 0F, -1.4F, 0.2F, 0F, -1.6F, -1.6F, -0.7F, -0.7F, -0.7F, -0.7F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, -1.4F, -0.7F, 0F, -0.2F); // Box 352
        ammoModel[78].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[78].rotateAngleX = -1.04719755F;

        ammoModel[79].addShapeBox(14F, -10F, 0.5F, 2, 1, 2, 0F, -0.7F, 0F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1.4F, -0.7F, 0F, -0.2F, -0.7F, 0F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1.4F, -0.7F, 0F, -0.2F); // Box 353
        ammoModel[79].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[79].rotateAngleX = -1.04719755F;

        ammoModel[80].addShapeBox(14F, -12F, -2.5F, 2, 2, 2, 0F, -0.7F, -0.7F, -0.7F, 0F, -1.6F, -1.6F, 0F, -1.4F, 0.2F, -0.7F, -0.2F, 0F, -0.7F, 0F, -0.2F, 0F, 0.2F, -1.4F, 0F, 0.2F, 0.2F, -0.7F, 0F, 0F); // Box 356
        ammoModel[80].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[80].rotateAngleX = -1.04719755F;

        ammoModel[81].addShapeBox(14F, -10F, -2.5F, 2, 1, 2, 0F, -0.7F, 0F, -0.2F, 0F, -0.2F, -1.4F, 0F, -0.2F, 0.2F, -0.7F, 0F, 0F, -0.7F, 0F, -0.2F, 0F, -0.2F, -1.4F, 0F, -0.2F, 0.2F, -0.7F, 0F, 0F); // Box 357
        ammoModel[81].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[81].rotateAngleX = -1.04719755F;

        ammoModel[82].addShapeBox(14F, -9F, -2.5F, 2, 2, 2, 0F, -0.7F, 0F, -0.2F, 0F, 0.2F, -1.4F, 0F, 0.2F, 0.2F, -0.7F, 0F, 0F, -0.7F, -0.7F, -0.7F, 0F, -1.6F, -1.6F, 0F, -1.4F, 0.2F, -0.7F, -0.2F, 0F); // Box 358
        ammoModel[82].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[82].rotateAngleX = -1.04719755F;

        ammoModel[83].addShapeBox(14F, -9F, 0.5F, 2, 2, 2, 0F, -0.7F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, -1.4F, -0.7F, 0F, -0.2F, -0.7F, -0.2F, 0F, 0F, -1.4F, 0.2F, 0F, -1.6F, -1.6F, -0.7F, -0.7F, -0.7F); // Box 359
        ammoModel[83].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[83].rotateAngleX = -1.04719755F;

        ammoModel[84].addShapeBox(0F, -12F, -0.5F, 1, 5, 1, 0F, 0F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 323
        ammoModel[84].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[84].rotateAngleX = 2.0943951F;

        ammoModel[85].addShapeBox(0F, -12F, -0.5F, 13, 5, 1, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 327
        ammoModel[85].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[85].rotateAngleX = 2.0943951F;

        ammoModel[86].addShapeBox(0F, -10F, 0.5F, 13, 1, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 328
        ammoModel[86].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[86].rotateAngleX = 2.0943951F;

        ammoModel[87].addShapeBox(0F, -12F, 0.5F, 13, 2, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 329
        ammoModel[87].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[87].rotateAngleX = 2.0943951F;

        ammoModel[88].addShapeBox(0F, -12F, -2.5F, 13, 2, 2, 0F, -0.6F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 330
        ammoModel[88].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[88].rotateAngleX = 2.0943951F;

        ammoModel[89].addShapeBox(0F, -10F, -2.5F, 13, 1, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 331
        ammoModel[89].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[89].rotateAngleX = 2.0943951F;

        ammoModel[90].addShapeBox(0F, -9F, -2.5F, 13, 2, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 332
        ammoModel[90].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[90].rotateAngleX = 2.0943951F;

        ammoModel[91].addShapeBox(0F, -9F, 0.5F, 13, 2, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F); // Box 333
        ammoModel[91].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[91].rotateAngleX = 2.0943951F;

        ammoModel[92].addShapeBox(0F, -10F, 0.5F, 1, 1, 2, 0F, 0F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 334
        ammoModel[92].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[92].rotateAngleX = 2.0943951F;

        ammoModel[93].addShapeBox(0F, -12F, 0.5F, 1, 1, 2, 0F, 0F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0.7F, -0.3F, -0.4F, 0.7F, -0.3F, -0.4F, 0.7F, 0.3F, 0F, 0.7F, 0.3F); // Box 335
        ammoModel[93].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[93].rotateAngleX = 2.0943951F;

        ammoModel[94].addShapeBox(0F, -12F, -2.5F, 1, 1, 2, 0F, 0F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.7F, 0.3F, -0.4F, 0.7F, 0.3F, -0.4F, 0.7F, -0.3F, 0F, 0.7F, -0.3F); // Box 336
        ammoModel[94].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[94].rotateAngleX = 2.0943951F;

        ammoModel[95].addShapeBox(0F, -10F, -2.5F, 1, 1, 2, 0F, 0F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, -0.4F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, -0.4F, 0.3F, -0.3F, 0F, 0.3F, -0.3F); // Box 337
        ammoModel[95].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[95].rotateAngleX = 2.0943951F;

        ammoModel[96].addShapeBox(0F, -8F, 0.5F, 1, 1, 2, 0F, 0F, 0.7F, -0.3F, -0.4F, 0.7F, -0.3F, -0.4F, 0.7F, 0.3F, 0F, 0.7F, 0.3F, 0F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 338
        ammoModel[96].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[96].rotateAngleX = 2.0943951F;

        ammoModel[97].addShapeBox(0F, -8F, -2.5F, 1, 1, 2, 0F, 0F, 0.7F, 0.3F, -0.4F, 0.7F, 0.3F, -0.4F, 0.7F, -0.3F, 0F, 0.7F, -0.3F, 0F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 0.3F, -0.3F, 0F, 0.3F, -0.3F); // Box 339
        ammoModel[97].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[97].rotateAngleX = 2.0943951F;

        ammoModel[98].addShapeBox(11F, -12F, -0.5F, 4, 5, 1, 0F, -0.8F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.8F, -0.2F, 0F); // Box 340
        ammoModel[98].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[98].rotateAngleX = 2.0943951F;

        ammoModel[99].addShapeBox(11F, -10F, 0.5F, 4, 1, 2, 0F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.8F, 0F, -0.2F); // Box 341
        ammoModel[99].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[99].rotateAngleX = 2.0943951F;

        ammoModel[100].addShapeBox(11F, -10F, -2.5F, 4, 1, 2, 0F, -0.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.8F, 0F, 0F); // Box 342
        ammoModel[100].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[100].rotateAngleX = 2.0943951F;

        ammoModel[101].addShapeBox(11F, -12F, 0.5F, 4, 2, 2, 0F, -0.8F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.7F, -0.7F, -0.8F, -0.7F, -0.7F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.8F, 0F, -0.2F); // Box 343
        ammoModel[101].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[101].rotateAngleX = 2.0943951F;

        ammoModel[102].addShapeBox(11F, -12F, -2.5F, 4, 2, 2, 0F, -0.8F, -0.7F, -0.7F, -0.3F, -0.7F, -0.7F, -0.3F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.8F, 0F, 0F); // Box 344
        ammoModel[102].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[102].rotateAngleX = 2.0943951F;

        ammoModel[103].addShapeBox(11F, -9F, -2.5F, 4, 2, 2, 0F, -0.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.7F, -0.7F, -0.3F, -0.7F, -0.7F, -0.3F, -0.2F, 0F, -0.8F, -0.2F, 0F); // Box 345
        ammoModel[103].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[103].rotateAngleX = 2.0943951F;

        ammoModel[104].addShapeBox(11F, -9F, 0.5F, 4, 2, 2, 0F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.7F, -0.7F, -0.8F, -0.7F, -0.7F); // Box 346
        ammoModel[104].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[104].rotateAngleX = 2.0943951F;

        ammoModel[105].addShapeBox(14F, -12F, -0.5F, 2, 5, 1, 0F, -0.7F, -0.2F, 0F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, -0.7F, -0.2F, 0F); // Box 349
        ammoModel[105].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[105].rotateAngleX = 2.0943951F;

        ammoModel[106].addShapeBox(14F, -12F, 0.5F, 2, 2, 2, 0F, -0.7F, -0.2F, 0F, 0F, -1.4F, 0.2F, 0F, -1.6F, -1.6F, -0.7F, -0.7F, -0.7F, -0.7F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, -1.4F, -0.7F, 0F, -0.2F); // Box 352
        ammoModel[106].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[106].rotateAngleX = 2.0943951F;

        ammoModel[107].addShapeBox(14F, -10F, 0.5F, 2, 1, 2, 0F, -0.7F, 0F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1.4F, -0.7F, 0F, -0.2F, -0.7F, 0F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1.4F, -0.7F, 0F, -0.2F); // Box 353
        ammoModel[107].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[107].rotateAngleX = 2.0943951F;

        ammoModel[108].addShapeBox(14F, -12F, -2.5F, 2, 2, 2, 0F, -0.7F, -0.7F, -0.7F, 0F, -1.6F, -1.6F, 0F, -1.4F, 0.2F, -0.7F, -0.2F, 0F, -0.7F, 0F, -0.2F, 0F, 0.2F, -1.4F, 0F, 0.2F, 0.2F, -0.7F, 0F, 0F); // Box 356
        ammoModel[108].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[108].rotateAngleX = 2.0943951F;

        ammoModel[109].addShapeBox(14F, -10F, -2.5F, 2, 1, 2, 0F, -0.7F, 0F, -0.2F, 0F, -0.2F, -1.4F, 0F, -0.2F, 0.2F, -0.7F, 0F, 0F, -0.7F, 0F, -0.2F, 0F, -0.2F, -1.4F, 0F, -0.2F, 0.2F, -0.7F, 0F, 0F); // Box 357
        ammoModel[109].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[109].rotateAngleX = 2.0943951F;

        ammoModel[110].addShapeBox(14F, -9F, -2.5F, 2, 2, 2, 0F, -0.7F, 0F, -0.2F, 0F, 0.2F, -1.4F, 0F, 0.2F, 0.2F, -0.7F, 0F, 0F, -0.7F, -0.7F, -0.7F, 0F, -1.6F, -1.6F, 0F, -1.4F, 0.2F, -0.7F, -0.2F, 0F); // Box 358
        ammoModel[110].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[110].rotateAngleX = 2.0943951F;

        ammoModel[111].addShapeBox(14F, -9F, 0.5F, 2, 2, 2, 0F, -0.7F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, -1.4F, -0.7F, 0F, -0.2F, -0.7F, -0.2F, 0F, 0F, -1.4F, 0.2F, 0F, -1.6F, -1.6F, -0.7F, -0.7F, -0.7F); // Box 359
        ammoModel[111].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[111].rotateAngleX = 2.0943951F;

        ammoModel[112].addShapeBox(0F, -12F, -0.5F, 1, 5, 1, 0F, 0F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 323
        ammoModel[112].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[112].rotateAngleX = -2.0943951F;

        ammoModel[113].addShapeBox(0F, -12F, -0.5F, 13, 5, 1, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 327
        ammoModel[113].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[113].rotateAngleX = -2.0943951F;

        ammoModel[114].addShapeBox(0F, -10F, 0.5F, 13, 1, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 328
        ammoModel[114].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[114].rotateAngleX = -2.0943951F;

        ammoModel[115].addShapeBox(0F, -12F, 0.5F, 13, 2, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 329
        ammoModel[115].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[115].rotateAngleX = -2.0943951F;

        ammoModel[116].addShapeBox(0F, -12F, -2.5F, 13, 2, 2, 0F, -0.6F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 330
        ammoModel[116].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[116].rotateAngleX = -2.0943951F;

        ammoModel[117].addShapeBox(0F, -10F, -2.5F, 13, 1, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 331
        ammoModel[117].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[117].rotateAngleX = -2.0943951F;

        ammoModel[118].addShapeBox(0F, -9F, -2.5F, 13, 2, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 332
        ammoModel[118].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[118].rotateAngleX = -2.0943951F;

        ammoModel[119].addShapeBox(0F, -9F, 0.5F, 13, 2, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F); // Box 333
        ammoModel[119].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[119].rotateAngleX = -2.0943951F;

        ammoModel[120].addShapeBox(0F, -10F, 0.5F, 1, 1, 2, 0F, 0F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 334
        ammoModel[120].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[120].rotateAngleX = -2.0943951F;

        ammoModel[121].addShapeBox(0F, -12F, 0.5F, 1, 1, 2, 0F, 0F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0.7F, -0.3F, -0.4F, 0.7F, -0.3F, -0.4F, 0.7F, 0.3F, 0F, 0.7F, 0.3F); // Box 335
        ammoModel[121].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[121].rotateAngleX = -2.0943951F;

        ammoModel[122].addShapeBox(0F, -12F, -2.5F, 1, 1, 2, 0F, 0F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.7F, 0.3F, -0.4F, 0.7F, 0.3F, -0.4F, 0.7F, -0.3F, 0F, 0.7F, -0.3F); // Box 336
        ammoModel[122].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[122].rotateAngleX = -2.0943951F;

        ammoModel[123].addShapeBox(0F, -10F, -2.5F, 1, 1, 2, 0F, 0F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, -0.4F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, -0.4F, 0.3F, -0.3F, 0F, 0.3F, -0.3F); // Box 337
        ammoModel[123].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[123].rotateAngleX = -2.0943951F;

        ammoModel[124].addShapeBox(0F, -8F, 0.5F, 1, 1, 2, 0F, 0F, 0.7F, -0.3F, -0.4F, 0.7F, -0.3F, -0.4F, 0.7F, 0.3F, 0F, 0.7F, 0.3F, 0F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 338
        ammoModel[124].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[124].rotateAngleX = -2.0943951F;

        ammoModel[125].addShapeBox(0F, -8F, -2.5F, 1, 1, 2, 0F, 0F, 0.7F, 0.3F, -0.4F, 0.7F, 0.3F, -0.4F, 0.7F, -0.3F, 0F, 0.7F, -0.3F, 0F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 0.3F, -0.3F, 0F, 0.3F, -0.3F); // Box 339
        ammoModel[125].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[125].rotateAngleX = -2.0943951F;

        ammoModel[126].addShapeBox(11F, -12F, -0.5F, 4, 5, 1, 0F, -0.8F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.8F, -0.2F, 0F); // Box 340
        ammoModel[126].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[126].rotateAngleX = -2.0943951F;

        ammoModel[127].addShapeBox(11F, -10F, 0.5F, 4, 1, 2, 0F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.8F, 0F, -0.2F); // Box 341
        ammoModel[127].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[127].rotateAngleX = -2.0943951F;

        ammoModel[128].addShapeBox(11F, -10F, -2.5F, 4, 1, 2, 0F, -0.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.8F, 0F, 0F); // Box 342
        ammoModel[128].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[128].rotateAngleX = -2.0943951F;

        ammoModel[129].addShapeBox(11F, -12F, 0.5F, 4, 2, 2, 0F, -0.8F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.7F, -0.7F, -0.8F, -0.7F, -0.7F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.8F, 0F, -0.2F); // Box 343
        ammoModel[129].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[129].rotateAngleX = -2.0943951F;

        ammoModel[130].addShapeBox(11F, -12F, -2.5F, 4, 2, 2, 0F, -0.8F, -0.7F, -0.7F, -0.3F, -0.7F, -0.7F, -0.3F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.8F, 0F, 0F); // Box 344
        ammoModel[130].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[130].rotateAngleX = -2.0943951F;

        ammoModel[131].addShapeBox(11F, -9F, -2.5F, 4, 2, 2, 0F, -0.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.7F, -0.7F, -0.3F, -0.7F, -0.7F, -0.3F, -0.2F, 0F, -0.8F, -0.2F, 0F); // Box 345
        ammoModel[131].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[131].rotateAngleX = -2.0943951F;

        ammoModel[132].addShapeBox(11F, -9F, 0.5F, 4, 2, 2, 0F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.7F, -0.7F, -0.8F, -0.7F, -0.7F); // Box 346
        ammoModel[132].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[132].rotateAngleX = -2.0943951F;

        ammoModel[133].addShapeBox(14F, -12F, -0.5F, 2, 5, 1, 0F, -0.7F, -0.2F, 0F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, -0.7F, -0.2F, 0F); // Box 349
        ammoModel[133].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[133].rotateAngleX = -2.0943951F;

        ammoModel[134].addShapeBox(14F, -12F, 0.5F, 2, 2, 2, 0F, -0.7F, -0.2F, 0F, 0F, -1.4F, 0.2F, 0F, -1.6F, -1.6F, -0.7F, -0.7F, -0.7F, -0.7F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, -1.4F, -0.7F, 0F, -0.2F); // Box 352
        ammoModel[134].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[134].rotateAngleX = -2.0943951F;

        ammoModel[135].addShapeBox(14F, -10F, 0.5F, 2, 1, 2, 0F, -0.7F, 0F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1.4F, -0.7F, 0F, -0.2F, -0.7F, 0F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1.4F, -0.7F, 0F, -0.2F); // Box 353
        ammoModel[135].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[135].rotateAngleX = -2.0943951F;

        ammoModel[136].addShapeBox(14F, -12F, -2.5F, 2, 2, 2, 0F, -0.7F, -0.7F, -0.7F, 0F, -1.6F, -1.6F, 0F, -1.4F, 0.2F, -0.7F, -0.2F, 0F, -0.7F, 0F, -0.2F, 0F, 0.2F, -1.4F, 0F, 0.2F, 0.2F, -0.7F, 0F, 0F); // Box 356
        ammoModel[136].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[136].rotateAngleX = -2.0943951F;

        ammoModel[137].addShapeBox(14F, -10F, -2.5F, 2, 1, 2, 0F, -0.7F, 0F, -0.2F, 0F, -0.2F, -1.4F, 0F, -0.2F, 0.2F, -0.7F, 0F, 0F, -0.7F, 0F, -0.2F, 0F, -0.2F, -1.4F, 0F, -0.2F, 0.2F, -0.7F, 0F, 0F); // Box 357
        ammoModel[137].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[137].rotateAngleX = -2.0943951F;

        ammoModel[138].addShapeBox(14F, -9F, -2.5F, 2, 2, 2, 0F, -0.7F, 0F, -0.2F, 0F, 0.2F, -1.4F, 0F, 0.2F, 0.2F, -0.7F, 0F, 0F, -0.7F, -0.7F, -0.7F, 0F, -1.6F, -1.6F, 0F, -1.4F, 0.2F, -0.7F, -0.2F, 0F); // Box 358
        ammoModel[138].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[138].rotateAngleX = -2.0943951F;

        ammoModel[139].addShapeBox(14F, -9F, 0.5F, 2, 2, 2, 0F, -0.7F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, -1.4F, -0.7F, 0F, -0.2F, -0.7F, -0.2F, 0F, 0F, -1.4F, 0.2F, 0F, -1.6F, -1.6F, -0.7F, -0.7F, -0.7F); // Box 359
        ammoModel[139].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[139].rotateAngleX = -2.0943951F;

        ammoModel[140].addShapeBox(0F, -12F, -0.5F, 1, 5, 1, 0F, 0F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 323
        ammoModel[140].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[140].rotateAngleX = 3.14159265F;

        ammoModel[141].addShapeBox(0F, -12F, -0.5F, 13, 5, 1, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 327
        ammoModel[141].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[141].rotateAngleX = 3.14159265F;

        ammoModel[142].addShapeBox(0F, -10F, 0.5F, 13, 1, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 328
        ammoModel[142].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[142].rotateAngleX = 3.14159265F;

        ammoModel[143].addShapeBox(0F, -12F, 0.5F, 13, 2, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 329
        ammoModel[143].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[143].rotateAngleX = 3.14159265F;

        ammoModel[144].addShapeBox(0F, -12F, -2.5F, 13, 2, 2, 0F, -0.6F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 330
        ammoModel[144].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[144].rotateAngleX = 3.14159265F;

        ammoModel[145].addShapeBox(0F, -10F, -2.5F, 13, 1, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 331
        ammoModel[145].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[145].rotateAngleX = 3.14159265F;

        ammoModel[146].addShapeBox(0F, -9F, -2.5F, 13, 2, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 332
        ammoModel[146].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[146].rotateAngleX = 3.14159265F;

        ammoModel[147].addShapeBox(0F, -9F, 0.5F, 13, 2, 2, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F); // Box 333
        ammoModel[147].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[147].rotateAngleX = 3.14159265F;

        ammoModel[148].addShapeBox(0F, -10F, 0.5F, 1, 1, 2, 0F, 0F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 334
        ammoModel[148].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[148].rotateAngleX = 3.14159265F;

        ammoModel[149].addShapeBox(0F, -12F, 0.5F, 1, 1, 2, 0F, 0F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0.7F, -0.3F, -0.4F, 0.7F, -0.3F, -0.4F, 0.7F, 0.3F, 0F, 0.7F, 0.3F); // Box 335
        ammoModel[149].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[149].rotateAngleX = 3.14159265F;

        ammoModel[150].addShapeBox(0F, -12F, -2.5F, 1, 1, 2, 0F, 0F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.7F, 0.3F, -0.4F, 0.7F, 0.3F, -0.4F, 0.7F, -0.3F, 0F, 0.7F, -0.3F); // Box 336
        ammoModel[150].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[150].rotateAngleX = 3.14159265F;

        ammoModel[151].addShapeBox(0F, -10F, -2.5F, 1, 1, 2, 0F, 0F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, -0.4F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, -0.4F, 0.3F, -0.3F, 0F, 0.3F, -0.3F); // Box 337
        ammoModel[151].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[151].rotateAngleX = 3.14159265F;

        ammoModel[152].addShapeBox(0F, -8F, 0.5F, 1, 1, 2, 0F, 0F, 0.7F, -0.3F, -0.4F, 0.7F, -0.3F, -0.4F, 0.7F, 0.3F, 0F, 0.7F, 0.3F, 0F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 338
        ammoModel[152].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[152].rotateAngleX = 3.14159265F;

        ammoModel[153].addShapeBox(0F, -8F, -2.5F, 1, 1, 2, 0F, 0F, 0.7F, 0.3F, -0.4F, 0.7F, 0.3F, -0.4F, 0.7F, -0.3F, 0F, 0.7F, -0.3F, 0F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 0.3F, -0.3F, 0F, 0.3F, -0.3F); // Box 339
        ammoModel[153].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[153].rotateAngleX = 3.14159265F;

        ammoModel[154].addShapeBox(11F, -12F, -0.5F, 4, 5, 1, 0F, -0.8F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.8F, -0.2F, 0F); // Box 340
        ammoModel[154].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[154].rotateAngleX = 3.14159265F;

        ammoModel[155].addShapeBox(11F, -10F, 0.5F, 4, 1, 2, 0F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.8F, 0F, -0.2F); // Box 341
        ammoModel[155].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[155].rotateAngleX = 3.14159265F;

        ammoModel[156].addShapeBox(11F, -10F, -2.5F, 4, 1, 2, 0F, -0.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.8F, 0F, 0F); // Box 342
        ammoModel[156].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[156].rotateAngleX = 3.14159265F;

        ammoModel[157].addShapeBox(11F, -12F, 0.5F, 4, 2, 2, 0F, -0.8F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.7F, -0.7F, -0.8F, -0.7F, -0.7F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.8F, 0F, -0.2F); // Box 343
        ammoModel[157].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[157].rotateAngleX = 3.14159265F;

        ammoModel[158].addShapeBox(11F, -12F, -2.5F, 4, 2, 2, 0F, -0.8F, -0.7F, -0.7F, -0.3F, -0.7F, -0.7F, -0.3F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.8F, 0F, 0F); // Box 344
        ammoModel[158].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[158].rotateAngleX = 3.14159265F;

        ammoModel[159].addShapeBox(11F, -9F, -2.5F, 4, 2, 2, 0F, -0.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.7F, -0.7F, -0.3F, -0.7F, -0.7F, -0.3F, -0.2F, 0F, -0.8F, -0.2F, 0F); // Box 345
        ammoModel[159].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[159].rotateAngleX = 3.14159265F;

        ammoModel[160].addShapeBox(11F, -9F, 0.5F, 4, 2, 2, 0F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.7F, -0.7F, -0.8F, -0.7F, -0.7F); // Box 346
        ammoModel[160].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[160].rotateAngleX = 3.14159265F;

        ammoModel[161].addShapeBox(14F, -12F, -0.5F, 2, 5, 1, 0F, -0.7F, -0.2F, 0F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, -0.7F, -0.2F, 0F); // Box 349
        ammoModel[161].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[161].rotateAngleX = 3.14159265F;

        ammoModel[162].addShapeBox(14F, -12F, 0.5F, 2, 2, 2, 0F, -0.7F, -0.2F, 0F, 0F, -1.4F, 0.2F, 0F, -1.6F, -1.6F, -0.7F, -0.7F, -0.7F, -0.7F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, -1.4F, -0.7F, 0F, -0.2F); // Box 352
        ammoModel[162].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[162].rotateAngleX = 3.14159265F;

        ammoModel[163].addShapeBox(14F, -10F, 0.5F, 2, 1, 2, 0F, -0.7F, 0F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1.4F, -0.7F, 0F, -0.2F, -0.7F, 0F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1.4F, -0.7F, 0F, -0.2F); // Box 353
        ammoModel[163].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[163].rotateAngleX = 3.14159265F;

        ammoModel[164].addShapeBox(14F, -12F, -2.5F, 2, 2, 2, 0F, -0.7F, -0.7F, -0.7F, 0F, -1.6F, -1.6F, 0F, -1.4F, 0.2F, -0.7F, -0.2F, 0F, -0.7F, 0F, -0.2F, 0F, 0.2F, -1.4F, 0F, 0.2F, 0.2F, -0.7F, 0F, 0F); // Box 356
        ammoModel[164].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[164].rotateAngleX = 3.14159265F;

        ammoModel[165].addShapeBox(14F, -10F, -2.5F, 2, 1, 2, 0F, -0.7F, 0F, -0.2F, 0F, -0.2F, -1.4F, 0F, -0.2F, 0.2F, -0.7F, 0F, 0F, -0.7F, 0F, -0.2F, 0F, -0.2F, -1.4F, 0F, -0.2F, 0.2F, -0.7F, 0F, 0F); // Box 357
        ammoModel[165].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[165].rotateAngleX = 3.14159265F;

        ammoModel[166].addShapeBox(14F, -9F, -2.5F, 2, 2, 2, 0F, -0.7F, 0F, -0.2F, 0F, 0.2F, -1.4F, 0F, 0.2F, 0.2F, -0.7F, 0F, 0F, -0.7F, -0.7F, -0.7F, 0F, -1.6F, -1.6F, 0F, -1.4F, 0.2F, -0.7F, -0.2F, 0F); // Box 358
        ammoModel[166].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[166].rotateAngleX = 3.14159265F;

        ammoModel[167].addShapeBox(14F, -9F, 0.5F, 2, 2, 2, 0F, -0.7F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, -1.4F, -0.7F, 0F, -0.2F, -0.7F, -0.2F, 0F, 0F, -1.4F, 0.2F, 0F, -1.6F, -1.6F, -0.7F, -0.7F, -0.7F); // Box 359
        ammoModel[167].setRotationPoint(33.3F, -74F, 0.5F);
        ammoModel[167].rotateAngleX = 3.14159265F;


        revolverBarrelModel = new ModelRendererTurbo[6];
        revolverBarrelModel[0] = new ModelRendererTurbo(this, 585, 161, textureX, textureY); // Box 407
        revolverBarrelModel[1] = new ModelRendererTurbo(this, 673, 161, textureX, textureY); // Box 409
        revolverBarrelModel[2] = new ModelRendererTurbo(this, 345, 177, textureX, textureY); // Box 409
        revolverBarrelModel[3] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Box 409
        revolverBarrelModel[4] = new ModelRendererTurbo(this, 913, 177, textureX, textureY); // Box 409
        revolverBarrelModel[5] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 409

        revolverBarrelModel[0].addShapeBox(59F, -24F, -4F, 34, 28, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
        revolverBarrelModel[0].setRotationPoint(-25F, -64F, 0.5F);

        revolverBarrelModel[1].addShapeBox(59F, -13F, -15F, 34, 6, 28, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
        revolverBarrelModel[1].setRotationPoint(-25F, -64F, 0.5F);

        revolverBarrelModel[2].addShapeBox(59F, -13F, -15F, 34, 11, 11, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
        revolverBarrelModel[2].setRotationPoint(-25F, -75F, 0.5F);

        revolverBarrelModel[3].addShapeBox(59F, -13F, -15F, 34, 11, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
        revolverBarrelModel[3].setRotationPoint(-25F, -58F, 0.5F);

        revolverBarrelModel[4].addShapeBox(59F, -13F, -15F, 34, 11, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
        revolverBarrelModel[4].setRotationPoint(-25F, -75F, 17.5F);

        revolverBarrelModel[5].addShapeBox(59F, -13F, -15F, 34, 11, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F); // Box 409
        revolverBarrelModel[5].setRotationPoint(-25F, -58F, 17.5F);


        barrelAttachPoint = new Vector3f(198F / 16F, 22F / 16F, 0F / 16F);
        scopeAttachPoint = new Vector3f(89F / 16F, 32F / 16F, 0F / 16F);
        gripAttachPoint = new Vector3f(139 / 16F, 5F / 16F, 0F / 16F);

        translateAll(5F, -43F, 0F);
        gunSlideDistance = 0.15F;
        animationType = EnumAnimationType.REVOLVER;
        revolverFlipAngle = -25.0F;
        revolverFlipPoint = new Vector3f(0.25F, 0.125F, 0.0625F);
        hasArms = true;
        leftArmPos = new Vector3f(-0.2F, -0.65F, -0.16F);
        leftArmRot = new Vector3f(80.0F, 35.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.27F, -0.57F, -0.15F);
        leftArmReloadRot = new Vector3f(70.0F, 40.0F, 0.0F);
        leftArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        rightArmPos = new Vector3f(0.13F, -0.56F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(0.1F, -0.56F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        rightHandAmmo = false;
        leftHandAmmo = true;
        slideLockOnEmpty = true;
        flashScale = 0.3F;
        fancyStance = true;
        stanceTranslate = new Vector3f(0.4D, -0.1D, 0.2D);
        stanceRotate = new Vector3f(0.0F, 0.0F, 45.0F);

        crouchZoom = -0.25F;
        ShakeDistance = 1.3F;
        zoomOffsetY = -0.035F;

        hasFlash = true;
        flashScale = 4F;
        muzzleFlashPoint = new Vector3f(
                barrelAttachPoint.x / flashScale,
                barrelAttachPoint.y / flashScale,
                barrelAttachPoint.z / flashScale
        );
        flipAll();
    }
}