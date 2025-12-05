//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 08.06.2018 - 17:31:05
// Last changed on: 08.06.2018 - 17:31:05

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelSOCOM16 extends ModelGun //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public ModelSOCOM16() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[233];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
        gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
        gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 8
        gunModel[4] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 17
        gunModel[5] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 19
        gunModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 20
        gunModel[7] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 22
        gunModel[8] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 24
        gunModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 25
        gunModel[10] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 26
        gunModel[11] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 27
        gunModel[12] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 28
        gunModel[13] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 29
        gunModel[14] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 44
        gunModel[15] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 45
        gunModel[16] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 47
        gunModel[17] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 55
        gunModel[18] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 56
        gunModel[19] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 57
        gunModel[20] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 58
        gunModel[21] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 46
        gunModel[22] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 47
        gunModel[23] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 48
        gunModel[24] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 49
        gunModel[25] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 50
        gunModel[26] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 48
        gunModel[27] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 49
        gunModel[28] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 50
        gunModel[29] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 51
        gunModel[30] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 52
        gunModel[31] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 53
        gunModel[32] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 54
        gunModel[33] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 55
        gunModel[34] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 56
        gunModel[35] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 57
        gunModel[36] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 58
        gunModel[37] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 59
        gunModel[38] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 60
        gunModel[39] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 61
        gunModel[40] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 62
        gunModel[41] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 64
        gunModel[42] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 65
        gunModel[43] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 66
        gunModel[44] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 67
        gunModel[45] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 68
        gunModel[46] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 69
        gunModel[47] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 70
        gunModel[48] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 71
        gunModel[49] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 74
        gunModel[50] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 75
        gunModel[51] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 76
        gunModel[52] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 91
        gunModel[53] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 92
        gunModel[54] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 93
        gunModel[55] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 94
        gunModel[56] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 88
        gunModel[57] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 89
        gunModel[58] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 90
        gunModel[59] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 91
        gunModel[60] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 92
        gunModel[61] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 93
        gunModel[62] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 94
        gunModel[63] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 95
        gunModel[64] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 97
        gunModel[65] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 106
        gunModel[66] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 107
        gunModel[67] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 108
        gunModel[68] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 109
        gunModel[69] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 110
        gunModel[70] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 111
        gunModel[71] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 112
        gunModel[72] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 113
        gunModel[73] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 114
        gunModel[74] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 115
        gunModel[75] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 116
        gunModel[76] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 117
        gunModel[77] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 118
        gunModel[78] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 119
        gunModel[79] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 111
        gunModel[80] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 112
        gunModel[81] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 113
        gunModel[82] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 114
        gunModel[83] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 115
        gunModel[84] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 116
        gunModel[85] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 117
        gunModel[86] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 118
        gunModel[87] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 119
        gunModel[88] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 120
        gunModel[89] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 121
        gunModel[90] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 122
        gunModel[91] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 123
        gunModel[92] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 124
        gunModel[93] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 125
        gunModel[94] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 126
        gunModel[95] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 127
        gunModel[96] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 128
        gunModel[97] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 129
        gunModel[98] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 131
        gunModel[99] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 132
        gunModel[100] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 133
        gunModel[101] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 135
        gunModel[102] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 132
        gunModel[103] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 133
        gunModel[104] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 134
        gunModel[105] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 135
        gunModel[106] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Import ImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportBox86
        gunModel[107] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Import ImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportBox87
        gunModel[108] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import ImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportBox88
        gunModel[109] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 136
        gunModel[110] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 137
        gunModel[111] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 138
        gunModel[112] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 139
        gunModel[113] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 140
        gunModel[114] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 141
        gunModel[115] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 142
        gunModel[116] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 143
        gunModel[117] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 144
        gunModel[118] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 137
        gunModel[119] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 138
        gunModel[120] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 140
        gunModel[121] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 141
        gunModel[122] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 142
        gunModel[123] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 143
        gunModel[124] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 157
        gunModel[125] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 158
        gunModel[126] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 159
        gunModel[127] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 161
        gunModel[128] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 162
        gunModel[129] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 163
        gunModel[130] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 164
        gunModel[131] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 166
        gunModel[132] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 167
        gunModel[133] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 168
        gunModel[134] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 169
        gunModel[135] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 170
        gunModel[136] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 171
        gunModel[137] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 172
        gunModel[138] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 174
        gunModel[139] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 175
        gunModel[140] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 176
        gunModel[141] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 183
        gunModel[142] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 184
        gunModel[143] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 185
        gunModel[144] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 186
        gunModel[145] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 187
        gunModel[146] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 188
        gunModel[147] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 189
        gunModel[148] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 190
        gunModel[149] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 191
        gunModel[150] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 192
        gunModel[151] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 193
        gunModel[152] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 194
        gunModel[153] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 195
        gunModel[154] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 196
        gunModel[155] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 197
        gunModel[156] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 198
        gunModel[157] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 199
        gunModel[158] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 197
        gunModel[159] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 198
        gunModel[160] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 200
        gunModel[161] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 201
        gunModel[162] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 202
        gunModel[163] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 203
        gunModel[164] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 269
        gunModel[165] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 270
        gunModel[166] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 271
        gunModel[167] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 272
        gunModel[168] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 273
        gunModel[169] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 274
        gunModel[170] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 275
        gunModel[171] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 276
        gunModel[172] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 277
        gunModel[173] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 278
        gunModel[174] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 279
        gunModel[175] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 280
        gunModel[176] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 281
        gunModel[177] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 282
        gunModel[178] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 283
        gunModel[179] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 284
        gunModel[180] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 285
        gunModel[181] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 286
        gunModel[182] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 292
        gunModel[183] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 293
        gunModel[184] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 294
        gunModel[185] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 295
        gunModel[186] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 296
        gunModel[187] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 297
        gunModel[188] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 298
        gunModel[189] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 299
        gunModel[190] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 300
        gunModel[191] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 301
        gunModel[192] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 302
        gunModel[193] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 303
        gunModel[194] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 304
        gunModel[195] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 305
        gunModel[196] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 306
        gunModel[197] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 307
        gunModel[198] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 308
        gunModel[199] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 309
        gunModel[200] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 310
        gunModel[201] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 311
        gunModel[202] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 312
        gunModel[203] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 313
        gunModel[204] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 314
        gunModel[205] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 315
        gunModel[206] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 316
        gunModel[207] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 317
        gunModel[208] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 318
        gunModel[209] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 319
        gunModel[210] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 320
        gunModel[211] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 321
        gunModel[212] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 322
        gunModel[213] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 323
        gunModel[214] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 324
        gunModel[215] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 325
        gunModel[216] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 326
        gunModel[217] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 327
        gunModel[218] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 329
        gunModel[219] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 330
        gunModel[220] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 332
        gunModel[221] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 333
        gunModel[222] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 334
        gunModel[223] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 335
        gunModel[224] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 336
        gunModel[225] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 337
        gunModel[226] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 344
        gunModel[227] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 346
        gunModel[228] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 347
        gunModel[229] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 348
        gunModel[230] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 386
        gunModel[231] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 387
        gunModel[232] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 388

        gunModel[0].addShapeBox(-42.8F, -24F, 1F, 1, 2, 3, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, -1F); // Box 0
        gunModel[0].setRotationPoint(0F, 0F, 0F);

        gunModel[1].addShapeBox(-42.8F, -25F, 1F, 1, 1, 3, 0F, 0.4F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.2F, -0.6F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -1F); // Box 1
        gunModel[1].setRotationPoint(0F, 0F, 0F);

        gunModel[2].addShapeBox(-42F, -26F, -1F, 1, 2, 2, 0F, 0.9F, 0.25F, 0F, -0.9F, 0.45F, 0F, -0.9F, 0.45F, 0F, 0.9F, 0.25F, 0F, 1.2F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, 1.2F, -0.4F, 0F); // Box 2
        gunModel[2].setRotationPoint(0F, 0F, 0F);

        gunModel[3].addShapeBox(-36F, -25F, 1F, 1, 3, 3, 0F, -2.77555756156289E-17F, -0.5F, 0F, 2.77555756156289E-17F, 2.1F, 0F, 2.77555756156289E-17F, 2.1F, 0F, 2.77555756156289E-17F, -0.4F, 0F, -2.77555756156289E-17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.77555756156289E-17F, 0F, 0F); // Box 8
        gunModel[3].setRotationPoint(0F, 0F, 0F);

        gunModel[4].addShapeBox(-34.4F, -23F, -4.75F, 1, 1, 1, 0F, 0F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 17
        gunModel[4].setRotationPoint(0F, 0F, 0F);

        gunModel[5].addShapeBox(-34.4F, -24F, -4.75F, 1, 1, 1, 0F, 0F, -0.8F, -0.25F, -0.4F, -1.3F, -0.25F, -0.4F, -1.3F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.3F, -0.25F, -0.4F, 0.3F, -0.25F, -0.4F, 0.3F, -0.25F, 0F, 0.3F, -0.25F); // Box 19
        gunModel[5].setRotationPoint(0F, 0F, 0F);

        gunModel[6].addShapeBox(-34.4F, -25.5F, -4.75F, 1, 2, 1, 0F, 0F, 1.1F, -0.25F, -0.2F, 1.2F, -0.25F, -0.2F, 1.2F, -0.25F, 0F, 1.1F, -0.25F, 0F, -0.5F, -0.25F, -0.2F, -0.9F, -0.25F, -0.2F, -0.9F, -0.25F, 0F, -0.2F, -0.25F); // Box 20
        gunModel[6].setRotationPoint(0F, 0F, 0F);

        gunModel[7].addShapeBox(-33.5F, -24.2F, -4.75F, 2, 1, 1, 0F, 0.1F, 1.4F, -0.25F, 0.3F, 1.4F, -0.25F, 0.3F, 1.8F, -0.25F, 0.1F, 1.8F, -0.25F, 0.1F, -1.2F, -0.25F, 0.3F, -1.2F, -0.25F, 0.3F, -1.2F, -0.25F, 0.1F, -1.2F, -0.25F); // Box 22
        gunModel[7].setRotationPoint(0F, 0F, 0F);

        gunModel[8].addShapeBox(-31.2F, -24.2F, -4.75F, 1, 1, 1, 0F, -2.77555756156289E-17F, 1.4F, -0.25F, -0.7F, 1.4F, -0.25F, -0.7F, 1.8F, -0.25F, -2.77555756156289E-17F, 1.8F, -0.25F, -2.77555756156289E-17F, -1.2F, -0.25F, -0.7F, -1.5F, -0.25F, -0.7F, -1.5F, -0.25F, -2.77555756156289E-17F, -1.2F, -0.25F); // Box 24
        gunModel[8].setRotationPoint(0F, 0F, 0F);

        gunModel[9].addShapeBox(-35.4F, -24.5F, -4.75F, 1, 1, 1, 0F, -0.4F, 1.6F, -0.25F, 0F, 2.1F, -0.25F, 0F, 2.1F, -0.25F, -0.4F, 1.6F, -0.25F, -0.4F, -0.5F, -0.25F, 2.77555756156289E-17F, -0.5F, -0.25F, 2.77555756156289E-17F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F); // Box 25
        gunModel[9].setRotationPoint(0F, 0F, 0F);

        gunModel[10].addShapeBox(-35.4F, -23F, -4.75F, 1, 1, 1, 0F, -0.4F, 0.2F, -0.25F, 2.77555756156289E-17F, 0.2F, -0.25F, 2.77555756156289E-17F, 0.5F, -0.25F, -0.4F, 0.5F, -0.25F, -0.4F, -5.55111512312578E-17F, -0.25F, 0F, -2.77555756156289E-17F, -0.25F, 0F, -2.77555756156289E-17F, -0.25F, -0.4F, -5.55111512312578E-17F, -0.25F); // Box 26
        gunModel[10].setRotationPoint(0F, 0F, 0F);

        gunModel[11].addShapeBox(-35F, -27F, -4F, 1, 5, 8, 0F, 0F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 27
        gunModel[11].setRotationPoint(0F, 0F, 0F);

        gunModel[12].addShapeBox(-34F, -27F, -4F, 1, 5, 8, 0F, 0.4F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.4F, 0F, 0F); // Box 28
        gunModel[12].setRotationPoint(0F, 0F, 0F);

        gunModel[13].addShapeBox(-29F, -24.2F, -4.75F, 1, 1, 1, 0F, -2.77555756156289E-17F, 1.4F, -0.25F, 0.5F, 1.4F, -0.25F, 0.5F, 1.8F, -0.25F, -2.77555756156289E-17F, 1.8F, -0.25F, -2.77555756156289E-17F, -1.2F, -0.25F, 0.5F, -1.2F, -0.25F, 0.5F, -1.2F, -0.25F, -2.77555756156289E-17F, -1.2F, -0.25F); // Box 29
        gunModel[13].setRotationPoint(0F, 0F, 0F);

        gunModel[14].addShapeBox(-41F, -25F, -4F, 4, 3, 8, 0F, 0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0.8F, -0.6F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F); // Box 44
        gunModel[14].setRotationPoint(0F, 0F, 0F);

        gunModel[15].addShapeBox(-37F, -25F, -4F, 1, 3, 8, 0F, 0F, -0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
        gunModel[15].setRotationPoint(0F, 0F, 0F);

        gunModel[16].addShapeBox(-36F, -25F, -4F, 1, 3, 4, 0F, 2.77555756156289E-17F, -0.4F, 0F, 2.77555756156289E-17F, 2.1F, 0F, 2.77555756156289E-17F, 2.1F, 0F, 2.77555756156289E-17F, -0.5F, 0F, 2.77555756156289E-17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.77555756156289E-17F, 0F, 0F); // Box 47
        gunModel[16].setRotationPoint(0F, 0F, 0F);

        gunModel[17].addShapeBox(-34.4F, -23F, -4.75F, 1, 1, 1, 0F, -0.6F, -0.3F, -0.25F, 0.4F, -0.3F, 0.15F, 0.4F, -0.3F, -0.25F, -0.6F, -0.3F, -0.25F, -0.6F, 0F, -0.25F, 0.4F, 0F, 0.15F, 0.4F, 0F, -0.25F, -0.6F, 0F, -0.25F); // Box 55
        gunModel[17].setRotationPoint(0F, 0F, 0F);

        gunModel[18].addShapeBox(-32.4F, -23F, -4.75F, 1, 1, 1, 0F, 0.6F, -0.3F, 0.15F, -0.9F, 0.1F, 0.15F, -0.9F, 0.1F, -0.25F, 0.6F, -0.3F, -0.25F, 0.6F, 0F, 0.15F, -0.9F, 0F, 0.15F, -0.9F, 0F, -0.25F, 0.6F, 0F, -0.25F); // Box 56
        gunModel[18].setRotationPoint(0F, 0F, 0F);

        gunModel[19].addShapeBox(-30F, -24.2F, -4.75F, 1, 1, 1, 0F, -0.7F, 1.4F, -0.25F, -2.77555756156289E-17F, 1.4F, -0.25F, -2.77555756156289E-17F, 1.8F, -0.25F, -0.7F, 1.8F, -0.25F, -0.7F, -1.5F, -0.25F, -2.77555756156289E-17F, -1.2F, -0.25F, -2.77555756156289E-17F, -1.2F, -0.25F, -0.7F, -1.5F, -0.25F); // Box 57
        gunModel[19].setRotationPoint(0F, 0F, 0F);

        gunModel[20].addShapeBox(-30.2F, -24.2F, -4.75F, 1, 1, 1, 0F, 0.7F, 1.4F, -0.25F, -0.1F, 1.4F, -0.25F, -0.1F, 1.8F, -0.25F, 0.7F, 1.8F, -0.25F, 0.7F, -1.5F, -0.25F, -0.1F, -1.5F, -0.25F, -0.1F, -1.5F, -0.25F, 0.7F, -1.5F, -0.25F); // Box 58
        gunModel[20].setRotationPoint(0F, 0F, 0F);

        gunModel[21].addShapeBox(-27F, -24.2F, -4.75F, 1, 1, 1, 0F, 0.5F, 1.4F, -0.25F, -1F, 1.4F, -0.25F, -1F, 1.4F, -0.25F, 0.5F, 1.8F, -0.25F, 0.5F, -1.2F, -0.25F, -1F, -1.2F, -0.25F, -1F, -1.2F, -0.25F, 0.5F, -1.2F, -0.25F); // Box 46
        gunModel[21].setRotationPoint(0F, 0F, 0F);

        gunModel[22].addShapeBox(-31.4F, -23F, -4.75F, 28, 1, 1, 0F, 0.9F, 0.1F, 0.15F, -1.2F, 0.1F, 0.15F, -1.2F, 0.1F, -0.25F, 0.9F, 0.1F, -0.25F, 0.9F, 0F, 0.15F, -1.2F, 0F, 0.15F, -1.2F, 0F, -0.25F, 0.9F, 0F, -0.25F); // Box 47
        gunModel[22].setRotationPoint(0F, 0F, 0F);

        gunModel[23].addShapeBox(-26F, -24.2F, -4.75F, 22, 1, 1, 0F, 1F, 1.4F, -0.25F, -0.6F, 1.4F, -0.25F, -0.6F, 1.4F, -0.25F, 1F, 1.4F, -0.25F, 1F, -1.2F, -0.25F, -0.6F, -1.2F, -0.25F, -0.6F, -1.2F, -0.25F, 1F, -1.2F, -0.25F); // Box 48
        gunModel[23].setRotationPoint(0F, 0F, 0F);

        gunModel[24].addShapeBox(-33.5F, -28.8F, -4.75F, 5, 1, 1, 0F, 0.1F, -1.3F, -0.25F, 0.7F, -1.3F, -0.25F, 0.8F, -1.3F, -0.25F, 0.1F, -1.3F, -0.25F, 0.1F, 1.1F, -0.25F, 1F, 1.1F, -0.25F, 1F, 1.8F, -0.25F, 0.1F, 1.8F, -0.25F); // Box 49
        gunModel[24].setRotationPoint(0F, 0F, 0F);

        gunModel[25].addShapeBox(-27.5F, -28.8F, -4.75F, 1, 1, 1, 0F, 0.3F, -1.3F, -0.25F, -0.8F, -1.2F, -0.75F, -0.8F, -1.2F, -0.25F, 0.2F, -1.3F, -0.25F, 2.77555756156289E-17F, 1.1F, -0.25F, -0.7F, 0.5F, -0.75F, -0.7F, 0.5F, -0.25F, 2.77555756156289E-17F, 1.8F, -0.25F); // Box 50
        gunModel[25].setRotationPoint(0F, 0F, 0F);

        gunModel[26].addShapeBox(-27.5F, -31.8F, -4.75F, 1, 3, 1, 0F, 0.7F, -1.5F, -0.25F, -1.3F, -1.7F, -0.75F, -1.3F, -1.7F, -0.25F, 0.7F, -1.5F, -0.25F, 0.3F, 1.3F, -0.25F, -0.8F, 1.2F, -0.75F, -0.8F, 1.2F, -0.25F, 0.2F, 1.3F, -0.25F); // Box 48
        gunModel[26].setRotationPoint(0F, 0F, 0F);

        gunModel[27].addShapeBox(-27.5F, -31.3F, -4.75F, 1, 2, 8, 0F, 0.7F, -1F, -0.75F, -1.3F, -1.2F, -0.75F, -1.3F, -1.2F, 0.65F, 0.7F, -1F, 0.65F, 0.2F, 1.8F, -0.75F, -0.8F, 1.7F, -0.75F, -0.8F, 1.7F, 0.65F, 0.2F, 1.8F, 0.65F); // Box 49
        gunModel[27].setRotationPoint(0F, 0F, 0F);

        gunModel[28].addShapeBox(-26.5F, -31.3F, -4.75F, 1, 2, 8, 0F, 1.3F, -1.2F, -0.75F, -1.3F, -1.5F, -0.75F, -1.3F, -1.5F, 0.65F, 1.3F, -1.2F, 0.65F, 0.8F, 1.7F, -0.75F, -0.8F, 1.7F, -0.75F, -0.8F, 1.7F, 0.65F, 0.8F, 1.7F, 0.65F); // Box 50
        gunModel[28].setRotationPoint(0F, 0F, 0F);

        gunModel[29].addShapeBox(-25.5F, -31.3F, -4.75F, 1, 2, 8, 0F, 1.3F, -1.5F, -0.75F, -0.7F, -1.8F, -0.75F, -0.7F, -1.8F, 0.65F, 1.3F, -1.5F, 0.65F, 0.8F, 1.7F, -0.75F, -0.7F, 1.7F, -0.75F, -0.7F, 1.7F, 0.65F, 0.8F, 1.7F, 0.65F); // Box 51
        gunModel[29].setRotationPoint(0F, 0F, 0F);

        gunModel[30].addShapeBox(-25.9F, -30.8F, -4.75F, 6, 2, 7, 0F, 1.4F, -3.2F, -0.75F, 0.5F, -3.2F, -0.75F, 0.5F, -3.2F, 0.15F, 1.4F, -3.2F, 0.15F, 1.3F, 1.5F, -0.75F, 0.2F, 1.4F, -0.75F, 0.2F, 1.4F, 0.15F, 1.3F, 1.5F, 0.15F); // Box 52
        gunModel[30].setRotationPoint(0F, 0F, 0F);

        gunModel[31].addShapeBox(-23.9F, -30.8F, -4.75F, 4, 2, 7, 0F, 1.3F, -1.8F, -0.75F, -1.3F, -1.8F, -0.75F, -1.3F, -1.8F, 0.15F, 1.3F, -1.8F, 0.15F, 1.3F, 1.2F, -0.75F, -1.3F, 1.2F, -0.75F, -1.3F, 1.2F, 0.15F, 1.3F, 1.2F, 0.15F); // Box 53
        gunModel[31].setRotationPoint(0F, 0F, 0F);

        gunModel[32].addShapeBox(-19.9F, -30.8F, -4.75F, 1, 2, 7, 0F, 1.3F, -1.7F, -0.75F, -1.5F, -2.4F, -0.75F, -1.5F, -2.4F, 0.15F, 1.3F, -1.7F, 0.15F, 1.3F, 1.2F, -0.75F, -1.5F, 1.2F, -0.75F, -1.5F, 1.2F, 0.15F, 1.3F, 1.2F, 0.15F); // Box 54
        gunModel[32].setRotationPoint(0F, 0F, 0F);

        gunModel[33].addShapeBox(-18.9F, -30.8F, -4.75F, 1, 2, 7, 0F, 1.5F, -2.4F, -0.75F, -1.3F, -3F, -0.75F, -1.3F, -3F, 0.15F, 1.5F, -2.4F, 0.15F, 1.5F, 1.2F, -0.75F, -1.5F, 1.2F, -0.75F, -1.5F, 1.2F, 0.15F, 1.5F, 1.2F, 0.15F); // Box 55
        gunModel[33].setRotationPoint(0F, 0F, 0F);

        gunModel[34].addShapeBox(-18.9F, -30.8F, -4.75F, 1, 2, 7, 0F, 0.8F, -1.6F, -0.75F, -1.2F, -2.4F, -0.75F, -1.2F, -2.4F, 0.15F, 0.8F, -1.6F, 0.15F, 1.5F, 0.4F, -0.75F, -1.3F, 1F, -0.75F, -1.3F, 1F, 0.15F, 1.5F, 0.4F, 0.15F); // Box 56
        gunModel[34].setRotationPoint(0F, 0F, 0F);

        gunModel[35].addShapeBox(-20.9F, -31.8F, -4.75F, 1, 2, 7, 0F, 0.9F, -2.2F, -0.75F, -1.3F, -2.7F, -0.75F, -1.3F, -2.7F, 0.15F, 0.9F, -2.2F, 0.15F, 0.9F, 0.8F, -0.75F, -1.3F, 0.8F, -0.75F, -1.3F, 0.8F, 0.15F, 0.9F, 0.8F, 0.15F); // Box 57
        gunModel[35].setRotationPoint(0F, 0F, 0F);

        gunModel[36].addShapeBox(-21.9F, -31.8F, -4.75F, 1, 2, 7, 0F, 0.5F, -2F, -0.75F, -0.9F, -2F, -0.75F, -0.9F, -2F, 0.15F, 0.5F, -2F, 0.15F, 0.5F, 0.8F, -0.75F, -0.9F, 0.8F, -0.75F, -0.9F, 0.8F, 0.15F, 0.5F, 0.8F, 0.15F); // Box 58
        gunModel[36].setRotationPoint(0F, 0F, 0F);

        gunModel[37].addShapeBox(-21.9F, -32.8F, -4.75F, 1, 2, 7, 0F, 0.5F, -2.4F, -0.75F, -1.3F, -2F, -0.75F, -1.3F, -2F, 0.15F, 0.5F, -2.4F, 0.15F, 0.5F, 1F, -0.75F, -1.3F, 1F, -0.75F, -1.3F, 1F, 0.15F, 0.5F, 1F, 0.15F); // Box 59
        gunModel[37].setRotationPoint(0F, 0F, 0F);

        gunModel[38].addShapeBox(-20.9F, -32.8F, -4.75F, 1, 2, 7, 0F, 0.9F, -2F, -0.75F, -1.8F, -2F, -0.75F, -1.8F, -2F, 0.15F, 0.9F, -2F, 0.15F, 0.9F, 1.2F, -0.75F, -1.1F, 0.5F, -0.75F, -1.1F, 0.5F, 0.15F, 0.9F, 1.2F, 0.15F); // Box 60
        gunModel[38].setRotationPoint(0F, 0F, 0F);

        gunModel[39].addShapeBox(-21.9F, -32.8F, -4.75F, 1, 2, 7, 0F, 0.3F, -2F, -0.75F, -0.9F, -2F, -0.75F, -0.9F, -2F, 0.15F, 0.3F, -2F, 0.15F, 0.3F, 1F, -0.75F, -0.9F, 1F, -0.75F, -0.9F, 1F, 0.15F, 0.3F, 1F, 0.15F); // Box 61
        gunModel[39].setRotationPoint(0F, 0F, 0F);

        gunModel[40].addShapeBox(-33F, -26F, -4F, 37, 4, 1, 0F, 0.6F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0.5F, 0.6F, -0.4F, 0.5F, 0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, 0.6F, 0F, 0.5F); // Box 62
        gunModel[40].setRotationPoint(0F, 0F, 0F);

        gunModel[41].addShapeBox(-33.5F, -29.8F, -4.3F, 4, 3, 1, 0F, 0F, 1.1F, -0.25F, 1.3F, 1F, -0.25F, 1.3F, 1F, -0.25F, 0F, 1.1F, -0.25F, 0F, -0.7F, -0.25F, 1.3F, -0.7F, -0.25F, 1.3F, -0.7F, -0.25F, 0F, -0.7F, -0.25F); // Box 64
        gunModel[41].setRotationPoint(0F, 0F, 0F);

        gunModel[42].addShapeBox(-33.5F, -30.8F, -4.3F, 5, 1, 1, 0F, -0.1F, 0.4F, -0.25F, 2.77555756156289E-17F, 0.4F, -0.25F, 2.77555756156289E-17F, 0.4F, -0.25F, -0.1F, 0.4F, -0.25F, 0F, -1.1F, -0.25F, 0.3F, -1F, -0.25F, 0.3F, -1F, -0.25F, 0F, -1.1F, -0.25F); // Box 65
        gunModel[42].setRotationPoint(0F, 0F, 0F);

        gunModel[43].addShapeBox(-33.5F, -30.8F, -4.3F, 5, 1, 1, 0F, -0.3F, 0.7F, -0.25F, -0.3F, 0.7F, -0.25F, -0.3F, 0.7F, -0.25F, -0.3F, 0.7F, -0.25F, -0.1F, -1.4F, -0.25F, -2.77555756156289E-17F, -1.4F, -0.25F, -2.77555756156289E-17F, -1.4F, -0.25F, -0.1F, -1.4F, -0.25F); // Box 66
        gunModel[43].setRotationPoint(0F, 0F, 0F);

        gunModel[44].addShapeBox(-33.5F, -30.8F, -4.3F, 5, 1, 1, 0F, -0.6F, 1F, -0.25F, -0.7F, 1F, -0.25F, -0.7F, 1F, -0.25F, -0.6F, 1F, -0.25F, -0.3F, -1.7F, -0.25F, -0.3F, -1.7F, -0.25F, -0.3F, -1.7F, -0.25F, -0.3F, -1.7F, -0.25F); // Box 67
        gunModel[44].setRotationPoint(0F, 0F, 0F);

        gunModel[45].addShapeBox(-33.5F, -30.8F, -4.3F, 5, 1, 1, 0F, -1.1F, 1.3F, -0.25F, -1.2F, 1.3F, -0.25F, -1.2F, 1.3F, -0.25F, -1.1F, 1.3F, -0.25F, -0.6F, -2F, -0.25F, -0.7F, -2F, -0.25F, -0.7F, -2F, -0.25F, -0.6F, -2F, -0.25F); // Box 68
        gunModel[45].setRotationPoint(0F, 0F, 0F);

        gunModel[46].addShapeBox(-33.5F, -30.8F, -4.3F, 5, 1, 1, 0F, -1.6F, 1.5F, -0.25F, -1.9F, 1.5F, -0.25F, -1.9F, 1.5F, -0.25F, -1.6F, 1.5F, -0.25F, -1.1F, -2.3F, -0.25F, -1.2F, -2.3F, -0.25F, -1.2F, -2.3F, -0.25F, -1.1F, -2.3F, -0.25F); // Box 69
        gunModel[46].setRotationPoint(0F, 0F, 0F);

        gunModel[47].addShapeBox(-42F, -24F, -1F, 1, 2, 2, 0F, 1.3F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 1.3F, 0F, 0F, 1.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 1.8F, 0F, 0F); // Box 70
        gunModel[47].setRotationPoint(0F, 0F, 0F);

        gunModel[48].addShapeBox(-42F, -25F, -1F, 1, 1, 2, 0F, 1.2F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 1.2F, -0.6F, 0F, 1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.3F, 0F, 0F); // Box 71
        gunModel[48].setRotationPoint(0F, 0F, 0F);

        gunModel[49].addShapeBox(-41F, -26F, -1F, 1, 2, 2, 0F, 0.9F, 0.45F, 0F, -0.1F, 0.55F, 0F, -0.1F, 0.55F, 0F, 0.9F, 0.45F, 0F, 0.9F, -0.4F, 0F, 1.11022302462516E-16F, -0.4F, 0F, 0.3F, -0.4F, 0F, 0.9F, -0.4F, 0F); // Box 74
        gunModel[49].setRotationPoint(0F, 0F, 0F);

        gunModel[50].addShapeBox(-40F, -26F, -1F, 3, 2, 2, 0F, 0.1F, 0.55F, 0F, -0.1F, 0.75F, 0F, -0.1F, 0.75F, 0F, 0.1F, 0.55F, 0F, 2.77555756156289E-17F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, 2.77555756156289E-17F, -0.4F, 0F); // Box 75
        gunModel[50].setRotationPoint(0F, 0F, 0F);

        gunModel[51].addShapeBox(-37F, -26F, -1F, 2, 2, 2, 0F, 0.1F, 0.75F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0.1F, 0.75F, 0F, 0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F); // Box 76
        gunModel[51].setRotationPoint(0F, 0F, 0F);

        gunModel[52].addShapeBox(-37F, -26F, 1F, 1, 2, 3, 0F, 0.1F, 0.75F, 1.11022302462516E-16F, 1F, 1.1F, 0F, 1F, 1.1F, 0F, -2.77555756156289E-17F, -0.05F, -0.4F, 0.1F, -0.4F, 0F, 2.77555756156289E-17F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.4F, 0F); // Box 91
        gunModel[52].setRotationPoint(0F, 0F, 0F);

        gunModel[53].addShapeBox(-40F, -26F, 1F, 3, 2, 3, 0F, 0.1F, 0.55F, 0F, -0.1F, 0.75F, 0F, 0F, -0.05F, -0.4F, -2.77555756156289E-17F, -0.05F, -0.4F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 92
        gunModel[53].setRotationPoint(0F, 0F, 0F);

        gunModel[54].addShapeBox(-41F, -26F, 1F, 1, 2, 3, 0F, 0.9F, 0.45F, 0F, -0.1F, 0.55F, 0F, 0F, -0.05F, -0.4F, 0.8F, -0.15F, -0.4F, 0.9F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0F, -0.4F, 0F, 0.8F, -0.4F, 0F); // Box 93
        gunModel[54].setRotationPoint(0F, 0F, 0F);

        gunModel[55].addShapeBox(-42.8F, -26F, 1F, 1, 2, 3, 0F, 0.1F, 0.25F, 0F, -0.1F, 0.45F, 0F, 0F, -0.15F, -0.4F, -0.5F, -0.35F, -1.4F, 0.4F, -0.4F, 0F, -2.77555756156289E-17F, -0.4F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, -1F); // Box 94
        gunModel[55].setRotationPoint(0F, 0F, 0F);

        gunModel[56].addShapeBox(-33.5F, -30.8F, 3.15F, 5, 3, 1, 0F, -1F, -0.4F, -0.25F, 0.3F, -0.5F, -0.25F, 0.3F, -0.5F, -0.25F, -1F, -0.4F, -0.25F, -1F, 0.3F, -0.25F, 0.8F, 0.3F, -0.25F, 0.8F, 0.3F, -0.25F, -1F, 0.3F, -0.25F); // Box 88
        gunModel[56].setRotationPoint(0F, 0F, 0F);

        gunModel[57].addShapeBox(-32.9F, -30.8F, 3.15F, 1, 3, 1, 0F, 1.38777878078145E-16F, -2.2F, -0.25F, -0.6F, -2.2F, -0.25F, -0.6F, -2.2F, -0.25F, 1.38777878078145E-16F, -2.2F, -0.25F, 0.1F, 0.3F, -0.25F, -0.6F, 0.3F, -0.25F, -0.6F, 0.3F, -0.25F, 0.1F, 0.3F, -0.25F); // Box 89
        gunModel[57].setRotationPoint(0F, 0F, 0F);

        gunModel[58].addShapeBox(-32.9F, -31.8F, 3.15F, 1, 3, 1, 0F, -0.2F, -1.7F, -0.25F, -0.6F, -1.7F, -0.25F, -0.6F, -1.7F, -0.25F, -0.2F, -1.7F, -0.25F, -2.77555756156289E-17F, 0.2F, -0.25F, -0.6F, 0.2F, -0.25F, -0.6F, 0.2F, -0.25F, -2.77555756156289E-17F, 0.2F, -0.25F); // Box 90
        gunModel[58].setRotationPoint(0F, 0F, 0F);

        gunModel[59].addShapeBox(-32.9F, -33.3F, 3.15F, 1, 1, 1, 0F, -0.3F, -3F, -0.25F, -0.6F, -2.9F, -0.25F, -0.6F, -2.9F, -0.25F, -0.3F, -3F, -0.25F, -0.2F, 2.2F, -0.25F, -0.6F, 2.2F, -0.25F, -0.6F, 2.2F, -0.25F, -0.2F, 2.2F, -0.25F); // Box 91
        gunModel[59].setRotationPoint(0F, 0F, 0F);

        gunModel[60].addShapeBox(-32.5F, -30.3F, 3.15F, 5, 1, 1, 0F, -0.3F, 0.4F, -0.25F, -1.1F, 0.4F, -0.25F, -1.1F, 0.4F, -0.25F, -0.3F, 0.4F, -0.25F, 2.77555756156289E-17F, -1.1F, -0.25F, -0.7F, -1F, -0.25F, -0.7F, -1F, -0.25F, 2.77555756156289E-17F, -1.1F, -0.25F); // Box 92
        gunModel[60].setRotationPoint(0F, 0F, 0F);

        gunModel[61].addShapeBox(-32.5F, -30.3F, 3.15F, 4, 1, 1, 0F, -0.6F, 0.7F, -0.25F, -0.5F, 0.7F, -0.25F, -0.5F, 0.7F, -0.25F, -0.6F, 0.7F, -0.25F, -0.3F, -1.4F, -0.25F, -0.1F, -1.4F, -0.25F, -0.1F, -1.4F, -0.25F, -0.3F, -1.4F, -0.25F); // Box 93
        gunModel[61].setRotationPoint(0F, 0F, 0F);

        gunModel[62].addShapeBox(-32.5F, -30.3F, 3.15F, 4, 1, 1, 0F, -1.3F, 1F, -0.25F, -1.1F, 1F, -0.25F, -1.1F, 1F, -0.25F, -1.3F, 1F, -0.25F, -0.6F, -1.7F, -0.25F, -0.5F, -1.7F, -0.25F, -0.5F, -1.7F, -0.25F, -0.6F, -1.7F, -0.25F); // Box 94
        gunModel[62].setRotationPoint(0F, 0F, 0F);

        gunModel[63].addShapeBox(-33F, -26F, 3F, 19, 4, 1, 0F, 0.6F, -1.2F, 0F, -1F, -1.2F, 0F, -1F, -1.2F, 0F, 0.6F, -1.2F, 0F, 0.6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.6F, 0F, 0F); // Box 95
        gunModel[63].setRotationPoint(0F, 0F, 0F);

        gunModel[64].addShapeBox(-33.5F, -27.8F, -4F, 5, 3, 8, 0F, 0.1F, -0.3F, 1.94289029309402E-16F, 0.8F, -0.3F, 5.55111512312578E-17F, 0.8F, -0.3F, -0.1F, 0.1F, -0.3F, -0.0999999999999999F, 0.1F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.8F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F); // Box 97
        gunModel[64].setRotationPoint(0F, 0F, 0F);

        gunModel[65].addShapeBox(-24.5F, -30.8F, 1.25F, 5, 1, 3, 0F, 0.7F, -1.3F, -0.15F, -3F, -1.3F, -0.15F, -3F, -1.3F, -0.35F, 0.7F, -1.3F, -0.35F, 0.7F, 1.2F, -0.15F, -1.6F, 1.2F, -0.15F, -1.6F, 1.2F, -0.35F, 0.7F, 1.2F, -0.35F); // Box 106
        gunModel[65].setRotationPoint(0F, 0F, 0F);

        gunModel[66].addShapeBox(-28.7F, -25.8F, 4F, 14, 1, 1, 0F, 1.1F, -0.6F, 0.1F, -0.3F, -0.6F, 0.1F, -0.3F, -0.6F, -1F, 1.1F, -0.6F, -1F, 1.7F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, -1F, 1.7F, -0.2F, -1F); // Box 107
        gunModel[66].setRotationPoint(0F, 0F, 0F);

        gunModel[67].addShapeBox(-28.7F, -25.8F, 4F, 14, 1, 1, 0F, 0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, -1F, 0.3F, -0.2F, -1F, 1.1F, -0.4F, 0.1F, -0.3F, -0.4F, 0.1F, -0.3F, -0.4F, -1F, 1.1F, -0.4F, -1F); // Box 108
        gunModel[67].setRotationPoint(0F, 0F, 0F);

        gunModel[68].addShapeBox(-28.7F, -26.8F, 4F, 14, 1, 1, 0F, -0.4F, -0.5F, 0.1F, -0.3F, -0.5F, 0.1F, -0.3F, -0.5F, -1F, -0.4F, -0.5F, -1F, 0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, -1F, 0.3F, 0.2F, -1F); // Box 109
        gunModel[68].setRotationPoint(0F, 0F, 0F);

        gunModel[69].addShapeBox(-28.7F, -26.8F, 4F, 14, 1, 1, 0F, -0.7F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, -1F, -0.7F, -0.1F, -1F, -0.4F, -0.5F, 0.1F, -0.3F, -0.5F, 0.1F, -0.3F, -0.5F, -1F, -0.4F, -0.5F, -1F); // Box 110
        gunModel[69].setRotationPoint(0F, 0F, 0F);

        gunModel[70].addShapeBox(-28.7F, -27.8F, 4F, 14, 1, 1, 0F, -1.1F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, -1F, -1.1F, -0.3F, -1F, -0.7F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, -1F, -0.7F, 0.1F, -1F); // Box 111
        gunModel[70].setRotationPoint(0F, 0F, 0F);

        gunModel[71].addShapeBox(-33.6F, -25.8F, 4F, 1, 1, 1, 0F, 2.77555756156289E-17F, -0.6F, 0.1F, 1.2F, -0.6F, 0.1F, 1.2F, -0.6F, -1F, 2.77555756156289E-17F, -0.6F, -1F, 0F, -0.2F, 0.1F, 1.8F, -0.2F, 0.1F, 1.8F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 112
        gunModel[71].setRotationPoint(0F, 0F, 0F);

        gunModel[72].addShapeBox(-33.6F, -25.8F, 4F, 1, 1, 1, 0F, 0F, -0.2F, 0.1F, 0.4F, -0.2F, 0.1F, 0.4F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.4F, 0.1F, 1.2F, -0.4F, 0.1F, 1.2F, -0.4F, -1F, 0F, -0.4F, -1F); // Box 113
        gunModel[72].setRotationPoint(0F, 0F, 0F);

        gunModel[73].addShapeBox(-33.6F, -26.8F, 4F, 1, 1, 1, 0F, -2.77555756156289E-17F, -0.5F, 0.1F, -0.3F, -0.5F, 0.1F, -0.3F, -0.5F, -1F, -2.77555756156289E-17F, -0.5F, -1F, 0F, 0.2F, 0.1F, 0.4F, 0.2F, 0.1F, 0.4F, 0.2F, -1F, 0F, 0.2F, -1F); // Box 114
        gunModel[73].setRotationPoint(0F, 0F, 0F);

        gunModel[74].addShapeBox(-33.6F, -27.8F, 4F, 1, 1, 1, 0F, 2.77555756156289E-17F, -0.3F, 0.1F, -1F, -0.3F, 0.1F, -1F, -0.3F, -1F, 2.77555756156289E-17F, -0.3F, -1F, 2.77555756156289E-17F, 0.1F, 0.1F, -0.6F, 0.1F, 0.1F, -0.6F, 0.1F, -1F, 2.77555756156289E-17F, 0.1F, -1F); // Box 115
        gunModel[74].setRotationPoint(0F, 0F, 0F);

        gunModel[75].addShapeBox(-33.6F, -26.8F, 4F, 1, 1, 1, 0F, -2.77555756156289E-17F, -0.1F, 0.1F, -0.6F, -0.1F, 0.1F, -0.6F, -0.1F, -1F, -2.77555756156289E-17F, -0.1F, -1F, -2.77555756156289E-17F, -0.5F, 0.1F, -0.3F, -0.5F, 0.1F, -0.3F, -0.5F, -1F, -2.77555756156289E-17F, -0.5F, -1F); // Box 116
        gunModel[75].setRotationPoint(0F, 0F, 0F);

        gunModel[76].addShapeBox(-31.8F, -25.8F, 4F, 17, 1, 1, 0F, 1.8F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, -1F, 1.8F, -0.8F, -1F, 1.8F, 0F, 0.1F, -0.2F, -5.55111512312578E-17F, 0.1F, -0.2F, -5.55111512312578E-17F, -1F, 1.8F, 0F, -1F); // Box 117
        gunModel[76].setRotationPoint(0F, 0F, 0F);

        gunModel[77].addShapeBox(-27.5F, -30.8F, 1.25F, 11, 2, 3, 0F, -0.2F, -3.1F, -0.35F, 0.3F, -3.1F, -0.35F, 0.3F, -3.1F, -0.35F, -0.2F, -3.1F, -0.35F, 0.2F, 1.3F, -0.35F, 0.3F, 1.4F, -0.35F, 0.3F, 1.4F, -0.35F, 0.2F, 1.3F, -0.35F); // Box 118
        gunModel[77].setRotationPoint(0F, 0F, 0F);

        gunModel[78].addShapeBox(-27.5F, -30.8F, 3.25F, 12, 2, 1, 0F, 0.2F, -3.3F, -0.15F, 0.5F, -3.4F, -0.15F, 0.5F, -3.4F, -0.35F, 0.2F, -3.3F, -0.35F, 0.2F, 4F, -0.15F, 0.5F, 4F, -0.15F, 0.5F, 4F, -0.35F, 0.2F, 4F, -0.35F); // Box 119
        gunModel[78].setRotationPoint(0F, 0F, 0F);

        gunModel[79].addShapeBox(-24.5F, -29.8F, 1.25F, 5, 1, 3, 0F, 0.7F, -1.2F, -0.45F, -1.6F, -1.2F, -0.45F, -1.6F, -1.2F, -0.35F, 0.7F, -1.2F, -0.35F, 0.7F, 1.1F, -0.35F, 2.3F, 1.1F, -0.35F, 2.3F, 1.1F, -0.35F, 0.7F, 1.1F, -0.35F); // Box 111
        gunModel[79].setRotationPoint(0F, 0F, 0F);

        gunModel[80].addShapeBox(-28.7F, -28.8F, 4F, 2, 1, 1, 0F, -1.1F, -0.7F, 0.1F, -0.5F, -0.7F, 0.1F, -0.5F, -0.7F, -1F, -1.1F, -0.7F, -1F, -1.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, -1F, -1.1F, 0.3F, -1F); // Box 112
        gunModel[80].setRotationPoint(0F, 0F, 0F);

        gunModel[81].addShapeBox(-28.7F, -29.8F, 4F, 2, 1, 1, 0F, -1.05F, 0.26F, 0.1F, -0.55F, 0.15F, 0.1F, -0.55F, 0.15F, -1F, -1.05F, 0.26F, -1F, -1.1F, 0.7F, 0.1F, -0.5F, 0.7F, 0.1F, -0.5F, 0.7F, -1F, -1.1F, 0.7F, -1F); // Box 113
        gunModel[81].setRotationPoint(0F, 0F, 0F);

        gunModel[82].addShapeBox(-23.9F, -31.8F, -4.75F, 2, 2, 7, 0F, 1.3F, -2.3F, -0.75F, -0.5F, -2.4F, -0.75F, -0.5F, -2.4F, 0.15F, 1.3F, -2.3F, 0.15F, 1.3F, 0.8F, -0.75F, -0.5F, 0.8F, -0.75F, -0.5F, 0.8F, 0.15F, 1.3F, 0.8F, 0.15F); // Box 114
        gunModel[82].setRotationPoint(0F, 0F, 0F);

        gunModel[83].addShapeBox(-37F, -26F, -4F, 1, 2, 3, 0F, -2.77555756156289E-17F, -0.05F, -0.4F, 1F, 1.1F, 0F, 1F, 1.1F, 0F, 0.1F, 0.75F, 1.11022302462516E-16F, 0F, -0.4F, 0F, 0F, -0.6F, 0F, 2.77555756156289E-17F, -0.6F, 0F, 0.1F, -0.4F, 0F); // Box 115
        gunModel[83].setRotationPoint(0F, 0F, 0F);

        gunModel[84].addShapeBox(-40F, -26F, -4F, 3, 2, 3, 0F, -2.77555756156289E-17F, -0.05F, -0.4F, 0F, -0.05F, -0.4F, -0.1F, 0.75F, 0F, 0.1F, 0.55F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F); // Box 116
        gunModel[84].setRotationPoint(0F, 0F, 0F);

        gunModel[85].addShapeBox(-41F, -26F, -4F, 1, 2, 3, 0F, 0.8F, -0.15F, -0.4F, 0F, -0.05F, -0.4F, -0.1F, 0.55F, 0F, 0.9F, 0.45F, 0F, 0.8F, -0.4F, 0F, 0F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.9F, -0.4F, 0F); // Box 117
        gunModel[85].setRotationPoint(0F, 0F, 0F);

        gunModel[86].addShapeBox(-42.8F, -26F, -4F, 1, 2, 3, 0F, -0.5F, -0.35F, -1.4F, 0F, -0.15F, -0.4F, -0.1F, 0.45F, 0F, 0.1F, 0.25F, 0F, -0.2F, -0.4F, -1F, 0F, -0.4F, 0F, -2.77555756156289E-17F, -0.4F, 0F, 0.4F, -0.4F, 0F); // Box 118
        gunModel[86].setRotationPoint(0F, 0F, 0F);

        gunModel[87].addShapeBox(-42.8F, -25F, -4F, 1, 1, 3, 0F, -0.2F, -0.6F, -1F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0.4F, -0.6F, 0F, -0.1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 119
        gunModel[87].setRotationPoint(0F, 0F, 0F);

        gunModel[88].addShapeBox(-42.8F, -24F, -4F, 1, 2, 3, 0F, -0.1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 120
        gunModel[88].setRotationPoint(0F, 0F, 0F);

        gunModel[89].addShapeBox(-17.5F, -29.8F, 1.25F, 5, 1, 3, 0F, -1.7F, -1.8F, -0.35F, -2.5F, -1.7F, -0.35F, -2.5F, -1.7F, -0.25F, -1.7F, -1.8F, -0.35F, -1.3F, 1.1F, -0.35F, -2.5F, 1.1F, -0.35F, -2.5F, 1.1F, -0.25F, -1.3F, 1.1F, -0.35F); // Box 121
        gunModel[89].setRotationPoint(0F, 0F, 0F);

        gunModel[90].addShapeBox(-16.5F, -30.8F, 1.25F, 1, 2, 3, 0F, -0.3F, -3.1F, -0.35F, 0.5F, -3.1F, -0.35F, 0.5F, -3.1F, -0.25F, -0.3F, -3.1F, -0.35F, -0.3F, 1.4F, -0.35F, 0.5F, 1.4F, -0.35F, 0.5F, 1.4F, -0.25F, -0.3F, 1.4F, -0.35F); // Box 122
        gunModel[90].setRotationPoint(0F, 0F, 0F);

        gunModel[91].addShapeBox(-12F, -24F, 3F, 18, 2, 1, 0F, 1F, -1.2F, 0F, -1.6F, -1.2F, 0F, -2.6F, -1.2F, 0F, 1F, -1.2F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F, -2.6F, 0F, 0F, 1F, 0F, 0F); // Box 123
        gunModel[91].setRotationPoint(0F, 0F, 0F);

        gunModel[92].addShapeBox(-11F, -25F, 3F, 16, 2, 1, 0F, 1F, -1.7F, 0F, -2F, -1.7F, 0F, -2.3F, -1.7F, -0.3F, 1F, -1.7F, -0.3F, 1F, 0.2F, 0F, -2F, 0.2F, 0F, -2.3F, 0.2F, 0F, 1F, 0.2F, 0F); // Box 124
        gunModel[92].setRotationPoint(0F, 0F, 0F);

        gunModel[93].addShapeBox(-11F, -23.6F, 3F, 16, 2, 1, 0F, 1F, 0.2F, 0F, -2F, 0.2F, 0F, -2.3F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, -1.7F, 0F, -2F, -1.7F, 0F, -2.3F, -1.7F, -0.3F, 1F, -1.7F, -0.3F); // Box 125
        gunModel[93].setRotationPoint(0F, 0F, 0F);

        gunModel[94].addShapeBox(-15F, -29F, 3F, 7, 5, 1, 0F, -1.110223024625E-16F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -1.11022302462516E-16F, -0.9F, 0F, -1.11022302462516E-16F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, -1.11022302462516E-16F, 0.2F, 0F); // Box 126
        gunModel[94].setRotationPoint(0F, 0F, 0F);

        gunModel[95].addShapeBox(-14F, -29F, 3F, 7, 5, 1, 0F, -5.1F, -0.9F, -2.77555756156289E-17F, 0.4F, -0.3F, 1.38777878078145E-16F, 0.4F, -0.3F, -0.3F, -5.1F, -0.9F, 0F, -6.3F, 0.2F, 2.77555756156289E-17F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 5.55111512312578E-17F, -6.3F, 0.2F, 0F); // Box 127
        gunModel[95].setRotationPoint(0F, 0F, 0F);

        gunModel[96].addShapeBox(-6F, -29F, 3F, 7, 5, 1, 0F, 0.6F, -0.3F, 0F, -6.9F, -2.77555756156289E-17F, 5.55111512312578E-17F, -6.9F, -2.77555756156289E-17F, -0.2F, 0.6F, -0.3F, -0.3F, 0.7F, 0.2F, 8.32667268468867E-17F, -7.4F, 0.2F, 0F, -7.4F, 0.2F, 0F, 0.7F, 0.2F, 0F); // Box 128
        gunModel[96].setRotationPoint(0F, 0F, 0F);

        gunModel[97].addShapeBox(-6F, -29F, 3F, 7, 5, 1, 0F, -0.1F, 8.32667268468867E-17F, 0F, -6.1F, 0.3F, 1.11022302462516E-16F, -6.1F, 0.3F, 0.1F, -0.1F, 8.32667268468867E-17F, -0.2F, 0.4F, 0.2F, 0F, -6.1F, 0.2F, 1.11022302462516E-16F, -6.1F, 0.2F, 0F, 0.4F, 0.2F, 0F); // Box 129
        gunModel[97].setRotationPoint(0F, 0F, 0F);

        gunModel[98].addShapeBox(-5F, -29F, 3F, 7, 5, 1, 0F, 0.1F, -2.4F, 0F, -6.1F, -2.4F, 0F, -6.1F, -2.4F, 0.05F, 0.1F, -2.4F, 0.05F, 0.1F, 0.2F, 1.11022302462516E-16F, -6.1F, 0.2F, -2.77555756156289E-17F, -6.1F, 0.2F, 0F, 0.1F, 0.2F, 0F); // Box 131
        gunModel[98].setRotationPoint(0F, 0F, 0F);

        gunModel[99].addShapeBox(-10.2F, -29F, 3F, 7, 5, 1, 0F, -6.1F, 0.3F, 2.77555756156289E-17F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, -0.2F, -6.1F, 0.3F, 0.1F, -6.1F, 0.2F, 5.55111512312578E-17F, 0.4F, 0.2F, -2.77555756156289E-17F, 0.4F, 0.2F, 0F, -6.1F, 0.2F, 0F); // Box 132
        gunModel[99].setRotationPoint(0F, 0F, 0F);

        gunModel[100].addShapeBox(-10.2F, -29F, 3F, 7, 5, 1, 0F, -6.9F, 0.3F, 5.55111512312578E-17F, 0.6F, 0.3F, -5.55111512312578E-17F, 0.6F, 0.3F, -0.05F, -6.9F, 0.3F, -0.2F, -7.4F, 0.2F, 5.55111512312578E-17F, 0.6F, 0.2F, -5.55111512312578E-17F, 0.6F, 0.2F, 0F, -7.4F, 0.2F, 0F); // Box 133
        gunModel[100].setRotationPoint(0F, 0F, 0F);

        gunModel[101].addShapeBox(-10.2F, -29F, 3F, 7, 3, 1, 0F, -5.1F, 0.3F, -2.77555756156289E-17F, -0.9F, 0.3F, 0F, -0.9F, 0.3F, -0.2F, -5.1F, 0.3F, -0.2F, -5.1F, -0.6F, -5.55111512312578E-17F, -0.9F, -0.6F, 0F, -0.9F, -0.6F, -0.2F, -5.1F, -0.6F, -0.2F); // Box 135
        gunModel[101].setRotationPoint(0F, 0F, 0F);

        gunModel[102].addShapeBox(-2.2F, -25F, 3F, 10, 1, 1, 0F, 0.4F, 0.8F, 0F, -3.4F, 0.8F, 0.3F, -4.1F, 0.8F, -0.3F, 0.4F, 0.8F, -0.02F, 0.4F, 0.2F, 0F, -3.4F, 0.2F, 5.55111512312578E-17F, -4.9F, 0.2F, -5.55111512312578E-17F, 0.4F, 0.2F, 0F); // Box 132
        gunModel[102].setRotationPoint(0F, 0F, 0F);

        gunModel[103].addShapeBox(-2.2F, -28F, 3F, 10, 2, 1, 0F, 0.4F, 1.3F, -2.77555756156289E-17F, -3.4F, 1.3F, 1.1F, -4.9F, 1.3F, -0.8F, 0.4F, 1.3F, -0.05F, 0.4F, 0.2F, 0F, -3.4F, 0.2F, 0.3F, -4.1F, 0.2F, -0.3F, 0.4F, 0.2F, -0.02F); // Box 133
        gunModel[103].setRotationPoint(0F, 0F, 0F);

        gunModel[104].addShapeBox(4F, -23.6F, 3F, 2, 2, 1, 0F, 1F, 0.2F, 0F, -1.6F, 0.2F, 0F, -3.1F, 0.2F, 0F, 1.3F, 0.2F, 0F, 1F, -1.7F, 0F, -1.6F, -1.7F, 0F, -2.6F, -1.7F, -0.3F, 1.3F, -1.7F, -0.3F); // Box 134
        gunModel[104].setRotationPoint(0F, 0F, 0F);

        gunModel[105].addShapeBox(4F, -25F, 3F, 2, 2, 1, 0F, 1F, -1.7F, 0F, -1.6F, -1.7F, 0F, -2.6F, -1.7F, -0.3F, 1.3F, -1.7F, -0.3F, 1F, 0.2F, 0F, -1.6F, 0.2F, 0F, -2.6F, 0.2F, 0F, 1.3F, 0.2F, 0F); // Box 135
        gunModel[105].setRotationPoint(0F, 0F, 0F);

        gunModel[106].addShapeBox(8F, -27.75F, -2.07F, 87, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportBox86
        gunModel[106].setRotationPoint(0F, 0F, 0F);

        gunModel[107].addShapeBox(8F, -26.75F, -2.07F, 87, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportBox87
        gunModel[107].setRotationPoint(0F, 0F, 0F);

        gunModel[108].addShapeBox(8F, -24.75F, -2.07F, 87, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportImportBox88
        gunModel[108].setRotationPoint(0F, 0F, 0F);

        gunModel[109].addShapeBox(-32.5F, -30.3F, -4.75F, 4, 1, 1, 0F, -1.3F, 1F, -0.25F, -1.1F, 1F, -0.25F, -1.1F, 1F, -0.25F, -1.3F, 1F, -0.25F, -0.6F, -1.7F, -0.25F, -0.5F, -1.7F, -0.25F, -0.5F, -1.7F, -0.25F, -0.6F, -1.7F, -0.25F); // Box 136
        gunModel[109].setRotationPoint(0F, 0F, 0F);

        gunModel[110].addShapeBox(-32.5F, -30.3F, -4.75F, 4, 1, 1, 0F, -0.6F, 0.7F, -0.25F, -0.5F, 0.7F, -0.25F, -0.5F, 0.7F, -0.25F, -0.6F, 0.7F, -0.25F, -0.3F, -1.4F, -0.25F, -0.1F, -1.4F, -0.25F, -0.1F, -1.4F, -0.25F, -0.3F, -1.4F, -0.25F); // Box 137
        gunModel[110].setRotationPoint(0F, 0F, 0F);

        gunModel[111].addShapeBox(-32.5F, -30.3F, -4.75F, 5, 1, 1, 0F, -0.3F, 0.4F, -0.25F, -1.1F, 0.4F, -0.25F, -1.1F, 0.4F, -0.25F, -0.3F, 0.4F, -0.25F, 2.77555756156289E-17F, -1.1F, -0.25F, -0.7F, -1F, -0.25F, -0.7F, -1F, -0.25F, 2.77555756156289E-17F, -1.1F, -0.25F); // Box 138
        gunModel[111].setRotationPoint(0F, 0F, 0F);

        gunModel[112].addShapeBox(-32.9F, -33.3F, -4.75F, 1, 1, 1, 0F, -0.3F, -3F, -0.25F, -0.6F, -2.9F, -0.25F, -0.6F, -2.9F, -0.25F, -0.3F, -3F, -0.25F, -0.2F, 2.2F, -0.25F, -0.6F, 2.2F, -0.25F, -0.6F, 2.2F, -0.25F, -0.2F, 2.2F, -0.25F); // Box 139
        gunModel[112].setRotationPoint(0F, 0F, 0F);

        gunModel[113].addShapeBox(-32.9F, -31.8F, -4.75F, 1, 3, 1, 0F, -0.2F, -1.7F, -0.25F, -0.6F, -1.7F, -0.25F, -0.6F, -1.7F, -0.25F, -0.2F, -1.7F, -0.25F, -2.77555756156289E-17F, 0.2F, -0.25F, -0.6F, 0.2F, -0.25F, -0.6F, 0.2F, -0.25F, -2.77555756156289E-17F, 0.2F, -0.25F); // Box 140
        gunModel[113].setRotationPoint(0F, 0F, 0F);

        gunModel[114].addShapeBox(-32.9F, -30.8F, -4.75F, 1, 3, 1, 0F, 1.38777878078145E-16F, -2.2F, -0.25F, -0.6F, -2.2F, -0.25F, -0.6F, -2.2F, -0.25F, 1.38777878078145E-16F, -2.2F, -0.25F, 0.1F, 0.3F, -0.25F, -0.6F, 0.3F, -0.25F, -0.6F, 0.3F, -0.25F, 0.1F, 0.3F, -0.25F); // Box 141
        gunModel[114].setRotationPoint(0F, 0F, 0F);

        gunModel[115].addShapeBox(-33.5F, -30.8F, -4.75F, 5, 3, 1, 0F, -1F, -0.4F, -0.25F, 0.3F, -0.5F, -0.25F, 0.3F, -0.5F, -0.25F, -1F, -0.4F, -0.25F, -1F, 0.3F, -0.25F, 0.7F, 0.3F, -0.25F, 0.7F, 0.3F, -0.25F, -1F, 0.3F, -0.25F); // Box 142
        gunModel[115].setRotationPoint(0F, 0F, 0F);

        gunModel[116].addShapeBox(-27F, -27.2F, -3.75F, 1, 1, 7, 0F, 0.8F, 0.1F, 0.25F, -1.2F, 0.1F, 0.25F, -1.2F, 0.1F, 0.2F, 0.8F, 0.1F, 0.2F, 0.7F, 0.2F, 0.25F, -1.5F, 0.2F, 0.25F, -1.5F, 0.2F, 0.2F, 0.7F, 0.2F, 0.2F); // Box 143
        gunModel[116].setRotationPoint(0F, 0F, 0F);

        gunModel[117].addShapeBox(-14F, -25F, 3F, 2, 3, 1, 0F, 1F, -1.2F, 0F, -1F, -1.2F, 0F, -1F, -1.2F, 0F, 1F, -1.2F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 144
        gunModel[117].setRotationPoint(0F, 0F, 0F);

        gunModel[118].addShapeBox(-12F, -23.6F, 3F, 2, 2, 1, 0F, 1F, 0.2F, 0F, -2F, 0.2F, 0F, -2F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, -1.7F, 0F, -2F, -1.7F, 0F, -2F, -1.7F, -0.3F, 1F, -1.7F, 5.55111512312578E-17F); // Box 137
        gunModel[118].setRotationPoint(0F, 0F, 0F);

        gunModel[119].addShapeBox(-12F, -25F, 3F, 2, 2, 1, 0F, 1F, -1.7F, 0F, -2F, -1.7F, 0F, -2F, -1.7F, -0.3F, 1F, -1.7F, 5.55111512312578E-17F, 1F, 0.2F, 0F, -2F, 0.2F, 0F, -2F, 0.2F, 0F, 1F, 0.2F, 0F); // Box 138
        gunModel[119].setRotationPoint(0F, 0F, 0F);

        gunModel[120].addShapeBox(-4.4F, -23F, -4.75F, 1, 1, 1, 0F, 0.2F, 0.1F, 0.15F, -0.5F, -0.2F, 0.15F, -0.5F, -0.2F, -0.25F, 0.2F, 0.1F, -0.25F, 0.2F, 0F, 0.15F, -0.5F, 0F, 0.15F, -0.5F, 0F, -0.25F, 0.2F, 0F, -0.25F); // Box 140
        gunModel[120].setRotationPoint(0F, 0F, 0F);

        gunModel[121].addShapeBox(-4.4F, -23F, -4.75F, 4, 1, 1, 0F, -0.5F, -0.2F, 0.15F, 0.4F, -0.2F, 0.15F, 0.4F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, 0F, 0.15F, 0.4F, 0F, 0.15F, 0.4F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 141
        gunModel[121].setRotationPoint(0F, 0F, 0F);

        gunModel[122].addShapeBox(-0.4F, -23F, -4.75F, 1, 1, 1, 0F, -0.4F, -0.2F, 0.15F, 0.2F, 0.1F, 0.15F, 0.2F, 0.1F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, 0F, 0.15F, 0.2F, 0F, 0.15F, 0.2F, 0F, -0.25F, -0.4F, 0F, -0.25F); // Box 142
        gunModel[122].setRotationPoint(0F, 0F, 0F);

        gunModel[123].addShapeBox(0.6F, -23F, -4.75F, 3, 1, 1, 0F, -0.2F, 0.1F, 0.15F, 0.2F, 0.1F, 0.15F, 0.2F, 0.1F, -0.25F, -0.2F, 0.1F, -0.25F, -0.2F, 0F, 0.15F, 0.2F, 0F, 0.15F, 0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F); // Box 143
        gunModel[123].setRotationPoint(0F, 0F, 0F);

        gunModel[124].addShapeBox(35F, -20.5F, -1.57F, 27, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 157
        gunModel[124].setRotationPoint(0F, 0F, 0F);

        gunModel[125].addShapeBox(35F, -21.5F, -1.57F, 27, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
        gunModel[125].setRotationPoint(0F, 0F, 0F);

        gunModel[126].addShapeBox(35F, -22.5F, -1.57F, 27, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
        gunModel[126].setRotationPoint(0F, 0F, 0F);

        gunModel[127].addShapeBox(45F, -27.5F, -2.07F, 3, 4, 4, 0F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 161
        gunModel[127].setRotationPoint(0F, 0F, 0F);

        gunModel[128].addShapeBox(45F, -28.25F, -2.07F, 3, 1, 4, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 162
        gunModel[128].setRotationPoint(0F, 0F, 0F);

        gunModel[129].addShapeBox(45F, -20.5F, -1.57F, 3, 1, 3, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 163
        gunModel[129].setRotationPoint(0F, 0F, 0F);

        gunModel[130].addShapeBox(45F, -23.5F, -2.07F, 3, 3, 4, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 164
        gunModel[130].setRotationPoint(0F, 0F, 0F);

        gunModel[131].addShapeBox(63F, -21F, -1.57F, 23, 1, 3, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 166
        gunModel[131].setRotationPoint(0F, 0F, 0F);

        gunModel[132].addShapeBox(63F, -22.3F, -1.57F, 23, 1, 3, 0F, 0F, 0.3F, -0.7F, 0F, 0.3F, -0.7F, 0F, 0.3F, -0.7F, 0F, 0.3F, -0.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 167
        gunModel[132].setRotationPoint(0F, 0F, 0F);

        gunModel[133].addShapeBox(63F, -19.7F, -1.57F, 23, 1, 3, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.3F, -0.7F, 0F, 0.3F, -0.7F, 0F, 0.3F, -0.7F, 0F, 0.3F, -0.7F); // Box 168
        gunModel[133].setRotationPoint(0F, 0F, 0F);

        gunModel[134].addShapeBox(61F, -21.5F, -0.57F, 3, 1, 1, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 169
        gunModel[134].setRotationPoint(0F, 0F, 0F);

        gunModel[135].addShapeBox(73F, -27.5F, -2.07F, 3, 4, 4, 0F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 170
        gunModel[135].setRotationPoint(0F, 0F, 0F);

        gunModel[136].addShapeBox(73F, -28.25F, -2.07F, 3, 1, 4, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 171
        gunModel[136].setRotationPoint(0F, 0F, 0F);

        gunModel[137].addShapeBox(73F, -23.5F, -2.07F, 3, 2, 4, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 172
        gunModel[137].setRotationPoint(0F, 0F, 0F);

        gunModel[138].addShapeBox(81F, -28.25F, -2.07F, 3, 1, 4, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 174
        gunModel[138].setRotationPoint(0F, 0F, 0F);

        gunModel[139].addShapeBox(81.5F, -31.5F, -1.07F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
        gunModel[139].setRotationPoint(0F, 0F, 0F);

        gunModel[140].addShapeBox(81F, -19.5F, -2.07F, 3, 1, 4, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 176
        gunModel[140].setRotationPoint(0F, 0F, 0F);

        gunModel[141].addShapeBox(-2.5F, -29F, 1F, 7, 3, 1, 0F, 0.1F, 0.3F, -0.6F, -0.1F, 0.3F, -0.6F, -0.1F, 0.3F, -0.1F, 0.1F, 0.3F, 1F, 0.1F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, -0.1F, 0.2F, 0.7F, 0.1F, 0.2F, 1.1F); // Box 183
        gunModel[141].setRotationPoint(0F, 0F, 0F);

        gunModel[142].addShapeBox(-2.5F, -25F, 1F, 7, 1, 1, 0F, 0.1F, 0.8F, -0.6F, 0F, 0.8F, -0.6F, -0.1F, 0.8F, 0.7F, 0.1F, 0.8F, 1F, 0.1F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, -0.1F, 0.2F, 1F, 0.1F, 0.2F, 1F); // Box 184
        gunModel[142].setRotationPoint(0F, 0F, 0F);

        gunModel[143].addShapeBox(-2.5F, -23F, 1F, 7, 1, 1, 0F, 0.1F, 0.8F, -0.6F, 0F, 0.8F, -0.6F, -0.1F, 0.8F, 1F, 0.1F, 0.8F, 1F, 0.1F, 0F, -0.6F, 0F, 0F, -0.6F, -0.1F, 0F, 1F, 0.1F, 0F, 1F); // Box 185
        gunModel[143].setRotationPoint(0F, 0F, 0F);

        gunModel[144].addShapeBox(-5.5F, -29F, 1F, 3, 6, 1, 0F, -0.5F, 0.3F, -0.6F, -0.1F, 0.3F, -0.6F, -0.1F, 0.3F, 1F, -0.4F, 0.3F, 1F, -0.5F, 1F, -0.6F, -0.1F, 1F, -0.6F, -0.1F, 1F, 1F, -0.4F, 1F, 1F); // Box 186
        gunModel[144].setRotationPoint(0F, 0F, 0F);

        gunModel[145].addShapeBox(1.5F, -29F, 0F, 3, 1, 1, 0F, 0F, 0.3F, -0.1F, -0.3F, 0.3F, 0F, -0.1F, 0.3F, 0.6F, 0F, 0.3F, 0.6F, 0F, 0F, -0.1F, -0.265F, 0F, 0F, -0.065F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 187
        gunModel[145].setRotationPoint(0F, 0F, 0F);

        gunModel[146].addShapeBox(1.5F, -29F, -1F, 3, 1, 1, 0F, 0F, -0.1F, 0.3F, -0.4F, -0.1F, 0.2F, -0.3F, 0.3F, -1.11022302462516E-16F, 0F, 0.3F, 0.1F, 0F, -5.55111512312578E-17F, 0.3F, -0.365F, -5.55111512312578E-17F, 0.2F, -0.265F, 0F, -1.11022302462516E-16F, 0F, 0F, 0.1F); // Box 188
        gunModel[146].setRotationPoint(0F, 0F, 0F);

        gunModel[147].addShapeBox(1.5F, -29F, -2F, 3, 1, 1, 0F, 0F, -0.8F, 0.2F, -0.6F, -0.8F, 0.2F, -0.4F, -0.1F, -0.2F, 0F, -0.1F, -0.3F, 0F, 1.3F, 0.2F, -0.565F, 1.3F, 0.2F, -0.365F, -5.55111512312578E-17F, -0.2F, 0F, -5.55111512312578E-17F, -0.3F); // Box 189
        gunModel[147].setRotationPoint(0F, 0F, 0F);

        gunModel[148].addShapeBox(1.5F, -29F, -3F, 3, 1, 1, 0F, 0F, -1.9F, -2.77555756156289E-17F, -0.7F, -1.9F, 2.77555756156289E-17F, -0.6F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 2.4F, -0.5F, -0.665F, 2.4F, -0.5F, -0.565F, 1.3F, -0.2F, 0F, 1.3F, -0.2F); // Box 190
        gunModel[148].setRotationPoint(0F, 0F, 0F);

        gunModel[149].addShapeBox(1.5F, -29F, -3F, 3, 1, 1, 0F, 0F, -2.8F, 0.7F, -0.7F, -2.8F, 0.7F, -0.7F, -1.9F, -1F, 0F, -1.9F, -1F, 0F, 2.4F, 1F, -0.665F, 2.4F, 1F, -0.665F, 2.4F, -0.5F, 0F, 2.4F, -0.5F); // Box 191
        gunModel[149].setRotationPoint(0F, 0F, 0F);

        gunModel[150].addShapeBox(4F, -22.5F, -1.57F, 31, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
        gunModel[150].setRotationPoint(0F, 0F, 0F);

        gunModel[151].addShapeBox(4F, -21.5F, -1.57F, 31, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
        gunModel[151].setRotationPoint(0F, 0F, 0F);

        gunModel[152].addShapeBox(4F, -20.5F, -1.57F, 31, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 194
        gunModel[152].setRotationPoint(0F, 0F, 0F);

        gunModel[153].addShapeBox(-6.5F, -29F, 1F, 1, 6, 1, 0F, -0.6F, 0F, -0.6F, 0.5F, 0.3F, -0.6F, 0.4F, 0.3F, 1F, -0.6F, 0F, 1F, -0.6F, 1F, -0.6F, 0.5F, 1F, -0.6F, 0.4F, 1F, 1F, -0.6F, 1F, 1F); // Box 195
        gunModel[153].setRotationPoint(0F, 0F, 0F);

        gunModel[154].addShapeBox(-7.5F, -29F, 1F, 1, 6, 1, 0F, -0.9F, -0.3F, -0.6F, 0.6F, -5.55111512312578E-17F, -0.6F, 0.6F, -5.55111512312578E-17F, 1F, -0.9F, -0.3F, 1F, -0.8F, 1F, -0.6F, 0.6F, 1F, -0.6F, 0.6F, 1F, 1F, -0.8F, 1F, 1F); // Box 196
        gunModel[154].setRotationPoint(0F, 0F, 0F);

        gunModel[155].addShapeBox(-9.5F, -29F, 1F, 2, 6, 1, 0F, -0.6F, -0.9F, -0.6F, 0.9F, -0.3F, -0.6F, 0.9F, -0.3F, 1F, -0.6F, -0.9F, 1F, -0.6F, 1F, -0.6F, 0.8F, 1F, -0.6F, 0.8F, 1F, 1F, -0.6F, 1F, 1F); // Box 197
        gunModel[155].setRotationPoint(0F, 0F, 0F);

        gunModel[156].addShapeBox(-15.5F, -29F, 1F, 6, 6, 1, 0F, -0.5F, -0.9F, -0.6F, 0.6F, -0.9F, -0.6F, 0.6F, -0.9F, 1F, -0.5F, -0.9F, 1F, -0.5F, 1F, -0.6F, 0.6F, 1F, -0.6F, 0.6F, 1F, 1F, -0.5F, 1F, 1F); // Box 198
        gunModel[156].setRotationPoint(0F, 0F, 0F);

        gunModel[157].addShapeBox(-28.5F, -28F, 1F, 13, 5, 1, 0F, -1.1F, -0.5F, -0.6F, 0.5F, -0.6F, -0.6F, 0.6F, -0.6F, 0.2F, -1.1F, -0.5F, 0.9F, -0.5F, 1F, -0.6F, 0.5F, 1F, -0.6F, 0.5F, 1F, 1F, -0.5F, 1F, 1F); // Box 199
        gunModel[157].setRotationPoint(0F, 0F, 0F);

        gunModel[158].addShapeBox(7F, -27.75F, -2.07F, 1, 1, 4, 0F, 0F, 0.5F, -0.5F, 0F, 2.77555756156289E-17F, -1F, 0F, -5.55111512312578E-17F, -1F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F); // Box 197
        gunModel[158].setRotationPoint(0F, 0F, 0F);

        gunModel[159].addShapeBox(7F, -26.75F, -2.07F, 1, 2, 4, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F); // Box 198
        gunModel[159].setRotationPoint(0F, 0F, 0F);

        gunModel[160].addShapeBox(7F, -24.75F, -2.07F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 2.77555756156289E-17F, -1F, 0F, -5.55111512312578E-17F, -1F, 0F, 0.5F, -0.5F); // Box 200
        gunModel[160].setRotationPoint(0F, 0F, 0F);

        gunModel[161].addShapeBox(3F, -26.75F, -2.07F, 4, 2, 4, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 201
        gunModel[161].setRotationPoint(0F, 0F, 0F);

        gunModel[162].addShapeBox(3F, -27.75F, -2.07F, 4, 1, 4, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 202
        gunModel[162].setRotationPoint(0F, 0F, 0F);

        gunModel[163].addShapeBox(3F, -24.75F, -2.07F, 4, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 203
        gunModel[163].setRotationPoint(0F, 0F, 0F);

        gunModel[164].addShapeBox(-25F, -13F, -2.5F, 4, 1, 5, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
        gunModel[164].setRotationPoint(0F, 0F, 0F);

        gunModel[165].addShapeBox(-22.5F, -12F, -1.5F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
        gunModel[165].setRotationPoint(0F, 0F, 0F);

        gunModel[166].addShapeBox(-40F, -13F, -2.5F, 10, 1, 5, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
        gunModel[166].setRotationPoint(0F, 0F, 0F);

        gunModel[167].addShapeBox(-40F, -11.5F, -1.5F, 1, 2, 3, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
        gunModel[167].setRotationPoint(0F, 0F, 0F);

        gunModel[168].addShapeBox(-40F, -9F, -1.5F, 1, 1, 3, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 273
        gunModel[168].setRotationPoint(0F, 0F, 0F);

        gunModel[169].addShapeBox(-39F, -7.5F, -1.5F, 1, 1, 3, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.4F, -0.2F, 0F, 1F, -0.7F, 0F, 1F, -0.7F, 0F, -1.4F, -0.2F, 0F); // Box 274
        gunModel[169].setRotationPoint(0F, 0F, 0F);

        gunModel[170].addShapeBox(-38F, -6.5F, -1.5F, 1, 1, 3, 0F, -0.4F, 0.2F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -0.4F, 0.2F, 0F, -1.8F, -0.9F, 0F, 0.8F, -1.5F, 0F, 0.8F, -1.5F, 0F, -1.8F, -0.9F, 0F); // Box 275
        gunModel[170].setRotationPoint(0F, 0F, 0F);

        gunModel[171].addShapeBox(-37F, -6.5F, -1.5F, 3, 1, 3, 0F, -0.8F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.8F, -0.9F, 0F); // Box 276
        gunModel[171].setRotationPoint(0F, 0F, 0F);

        gunModel[172].addShapeBox(-33.2F, -6.5F, -1.5F, 1, 1, 3, 0F, 0F, 0.7F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.7F, 0F, 0.8F, -1.5F, 0F, -1.8F, -0.9F, 0F, -1.8F, -0.9F, 0F, 0.8F, -1.5F, 0F); // Box 277
        gunModel[172].setRotationPoint(0F, 0F, 0F);

        gunModel[173].addShapeBox(-32.2F, -7.5F, -1.5F, 1, 1, 3, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, -0.7F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, 0F, 1F, -0.7F, 0F); // Box 278
        gunModel[173].setRotationPoint(0F, 0F, 0F);

        gunModel[174].addShapeBox(-31.2F, -9F, -1.5F, 1, 1, 3, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 279
        gunModel[174].setRotationPoint(0F, 0F, 0F);

        gunModel[175].addShapeBox(-31.2F, -11.5F, -1.5F, 1, 2, 3, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
        gunModel[175].setRotationPoint(0F, 0F, 0F);

        gunModel[176].addShapeBox(-31.2F, -10.5F, -1.5F, 1, 1, 3, 0F, 1.4F, -0.6F, 0F, -1.9F, -0.2F, 0F, -1.9F, -0.2F, 0F, 1.4F, -0.6F, 0F, 0F, 0F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, 0F, 0F, 0F); // Box 281
        gunModel[176].setRotationPoint(0F, 0F, 0F);

        gunModel[177].addShapeBox(-31.2F, -10.5F, -1.5F, 1, 1, 3, 0F, 2F, 0.2F, 0F, -2.4F, 0.2F, 0F, -2.4F, 0.2F, 0F, 2F, 0.2F, 0F, 1.4F, -0.4F, 0F, -1.9F, -0.8F, 0F, -1.9F, -0.8F, 0F, 1.4F, -0.4F, 0F); // Box 282
        gunModel[177].setRotationPoint(0F, 0F, 0F);

        gunModel[178].addShapeBox(-31.2F, -11.9F, -1.5F, 1, 1, 3, 0F, 1.5F, 0.1F, 0F, -1.8F, 0.1F, 0F, -1.8F, 0.1F, 0F, 1.5F, 0.1F, 0F, 2F, 0.2F, 0F, -2.4F, 0.2F, 0F, -2.4F, 0.2F, 0F, 2F, 0.2F, 0F); // Box 283
        gunModel[178].setRotationPoint(0F, 0F, 0F);

        gunModel[179].addShapeBox(-35.2F, -11.9F, -1.5F, 1, 1, 3, 0F, 1.5F, 0.1F, 0F, -1.8F, 0.1F, 0F, -1.8F, 0.1F, 0F, 1.5F, 0.1F, 0F, 2F, 0.2F, 0F, -2.4F, 0.2F, 0F, -2.4F, 0.2F, 0F, 2F, 0.2F, 0F); // Box 284
        gunModel[179].setRotationPoint(0F, 0F, 0F);

        gunModel[180].addShapeBox(-35.2F, -10.9F, -1.5F, 1, 1, 3, 0F, 2F, -0.2F, 0F, -2.4F, -0.2F, 0F, -2.4F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, 0.2F, 0F, -2.4F, 0.2F, 0F, -2.4F, 0.2F, 0F, 2F, 0.2F, 0F); // Box 285
        gunModel[180].setRotationPoint(0F, 0F, 0F);

        gunModel[181].addShapeBox(-35.2F, -9.9F, -1.5F, 1, 1, 3, 0F, 2F, -0.2F, 0F, -2.4F, -0.2F, 0F, -2.4F, -0.2F, 0F, 2F, -0.2F, 0F, 1.6F, 0.2F, 0F, -2F, 0.2F, 0F, -2F, 0.2F, 0F, 1.6F, 0.2F, 0F); // Box 286
        gunModel[181].setRotationPoint(0F, 0F, 0F);

        gunModel[182].addShapeBox(-32.9F, -31.8F, -3.75F, 1, 3, 2, 0F, -0.2F, -1.7F, -0.25F, -0.6F, -1.7F, -0.25F, -0.6F, -1.7F, -0.25F, -0.2F, -1.7F, -0.25F, -2.77555756156289E-17F, 0.2F, -0.25F, -0.6F, 0.2F, -0.25F, -0.6F, 0.2F, -0.25F, -2.77555756156289E-17F, 0.2F, -0.25F); // Box 292
        gunModel[182].setRotationPoint(0F, 0F, 0F);

        gunModel[183].addShapeBox(-33.5F, -30.8F, -3.75F, 5, 3, 2, 0F, -1F, -0.4F, -0.25F, 0.3F, -0.5F, -0.25F, 0.3F, -0.5F, -0.25F, -1F, -0.4F, -0.25F, -1F, 0.3F, -0.25F, 0.7F, 0.3F, -0.25F, 0.7F, 0.3F, -0.25F, -1F, 0.3F, -0.25F); // Box 293
        gunModel[183].setRotationPoint(0F, 0F, 0F);

        gunModel[184].addShapeBox(-32.5F, -30.3F, -3.75F, 5, 1, 2, 0F, -0.3F, 0.4F, -0.25F, -1.1F, 0.4F, -0.25F, -1.1F, 0.4F, -0.25F, -0.3F, 0.4F, -0.25F, 2.77555756156289E-17F, -1.1F, -0.25F, -0.7F, -1F, -0.25F, -0.7F, -1F, -0.25F, 2.77555756156289E-17F, -1.1F, -0.25F); // Box 294
        gunModel[184].setRotationPoint(0F, 0F, 0F);

        gunModel[185].addShapeBox(-32.5F, -30.3F, -3.75F, 4, 1, 2, 0F, -0.6F, 0.7F, -0.25F, -0.5F, 0.7F, -0.25F, -0.5F, 0.7F, -0.25F, -0.6F, 0.7F, -0.25F, -0.3F, -1.4F, -0.25F, -0.1F, -1.4F, -0.25F, -0.1F, -1.4F, -0.25F, -0.3F, -1.4F, -0.25F); // Box 295
        gunModel[185].setRotationPoint(0F, 0F, 0F);

        gunModel[186].addShapeBox(-32.5F, -30.3F, -3.75F, 4, 1, 2, 0F, -1.3F, 1F, -0.25F, -1.1F, 1F, -0.25F, -1.1F, 1F, -0.25F, -1.3F, 1F, -0.25F, -0.6F, -1.7F, -0.25F, -0.5F, -1.7F, -0.25F, -0.5F, -1.7F, -0.25F, -0.6F, -1.7F, -0.25F); // Box 296
        gunModel[186].setRotationPoint(0F, 0F, 0F);

        gunModel[187].addShapeBox(-32.9F, -30.8F, -3.75F, 1, 3, 2, 0F, 1.38777878078145E-16F, -2.2F, -0.25F, -0.6F, -2.2F, -0.25F, -0.6F, -2.2F, -0.25F, 1.38777878078145E-16F, -2.2F, -0.25F, 0.1F, 0.3F, -0.25F, -0.6F, 0.3F, -0.25F, -0.6F, 0.3F, -0.25F, 0.1F, 0.3F, -0.25F); // Box 297
        gunModel[187].setRotationPoint(0F, 0F, 0F);

        gunModel[188].addShapeBox(-32.5F, -30.3F, -2.25F, 4, 1, 2, 0F, -1.3F, 1F, -0.25F, -1.1F, 1F, -0.25F, -1.1F, 0.5F, -0.25F, -1.3F, 0.5F, -0.25F, -0.6F, -1.7F, -0.25F, -0.5F, -1.7F, -0.25F, -0.5F, -1.2F, -0.25F, -0.6F, -1.2F, -0.25F); // Box 298
        gunModel[188].setRotationPoint(0F, 0F, 0F);

        gunModel[189].addShapeBox(-32.9F, -30.8F, -2.25F, 1, 3, 2, 0F, 1.38777878078145E-16F, -2.2F, -0.25F, -0.6F, -2.2F, -0.25F, -0.6F, -2.2F, -0.25F, 1.38777878078145E-16F, -2.2F, -0.25F, 0.1F, 0.3F, -0.25F, -0.6F, 0.3F, -0.25F, -0.6F, 0.3F, -0.25F, 0.1F, 0.3F, -0.25F); // Box 299
        gunModel[189].setRotationPoint(0F, 0F, 0F);

        gunModel[190].addShapeBox(-32.9F, -31.8F, -2.25F, 1, 3, 2, 0F, -0.2F, -1.7F, -0.25F, -0.6F, -1.7F, -0.25F, -0.6F, -2.2F, -0.25F, -0.2F, -2.2F, -0.25F, -2.77555756156289E-17F, 0.2F, -0.25F, -0.6F, 0.2F, -0.25F, -0.6F, 0.2F, -0.25F, -2.77555756156289E-17F, 0.2F, -0.25F); // Box 300
        gunModel[190].setRotationPoint(0F, 0F, 0F);

        gunModel[191].addShapeBox(-33.5F, -30.8F, -2.25F, 5, 3, 2, 0F, -1F, -0.4F, -0.25F, 0.3F, -0.5F, -0.25F, 0.3F, -1F, -0.25F, -1F, -0.9F, -0.25F, -1F, 0.3F, -0.25F, 0.7F, 0.3F, -0.25F, 0.7F, 0.3F, -0.25F, -1F, 0.3F, -0.25F); // Box 301
        gunModel[191].setRotationPoint(0F, 0F, 0F);

        gunModel[192].addShapeBox(-32.5F, -30.3F, -2.25F, 5, 1, 2, 0F, -0.3F, 0.4F, -0.25F, -1.1F, 0.4F, -0.25F, -1.1F, -0.1F, -0.25F, -0.3F, -0.1F, -0.25F, 2.77555756156289E-17F, -1.1F, -0.25F, -0.7F, -1F, -0.25F, -0.7F, -0.5F, -0.25F, 2.77555756156289E-17F, -0.6F, -0.25F); // Box 302
        gunModel[192].setRotationPoint(0F, 0F, 0F);

        gunModel[193].addShapeBox(-32.5F, -30.3F, -2.25F, 4, 1, 2, 0F, -0.6F, 0.7F, -0.25F, -0.5F, 0.7F, -0.25F, -0.5F, 0.2F, -0.25F, -0.6F, 0.2F, -0.25F, -0.3F, -1.4F, -0.25F, -0.1F, -1.4F, -0.25F, -0.1F, -0.9F, -0.25F, -0.3F, -0.9F, -0.25F); // Box 303
        gunModel[193].setRotationPoint(0F, 0F, 0F);

        gunModel[194].addShapeBox(-32.9F, -30.8F, -0.25F, 1, 3, 2, 0F, 1.38777878078145E-16F, -2.2F, -0.25F, -0.6F, -2.2F, -0.25F, -0.6F, -2.2F, -0.25F, 1.38777878078145E-16F, -2.2F, -0.25F, 0.1F, 0.3F, -0.25F, -0.6F, 0.3F, -0.25F, -0.6F, 0.3F, -0.25F, 0.1F, 0.3F, -0.25F); // Box 304
        gunModel[194].setRotationPoint(0F, 0F, 0F);

        gunModel[195].addShapeBox(-32.9F, -31.8F, -0.25F, 1, 3, 2, 0F, -0.2F, -2.2F, -0.25F, -0.6F, -2.2F, -0.25F, -0.6F, -1.7F, -0.25F, -0.2F, -1.7F, -0.25F, -2.77555756156289E-17F, 0.2F, -0.25F, -0.6F, 0.2F, -0.25F, -0.6F, 0.2F, -0.25F, -2.77555756156289E-17F, 0.2F, -0.25F); // Box 305
        gunModel[195].setRotationPoint(0F, 0F, 0F);

        gunModel[196].addShapeBox(-33.5F, -30.8F, -0.25F, 5, 3, 2, 0F, -1F, -0.9F, -0.25F, 0.3F, -1F, -0.25F, 0.3F, -0.5F, -0.25F, -1F, -0.4F, -0.25F, -1F, 0.3F, -0.25F, 0.7F, 0.3F, -0.25F, 0.7F, 0.3F, -0.25F, -1F, 0.3F, -0.25F); // Box 306
        gunModel[196].setRotationPoint(0F, 0F, 0F);

        gunModel[197].addShapeBox(-32.5F, -30.3F, -0.25F, 5, 1, 2, 0F, -0.3F, -0.1F, -0.25F, -1.1F, -0.1F, -0.25F, -1.1F, 0.4F, -0.25F, -0.3F, 0.4F, -0.25F, 2.77555756156289E-17F, -0.6F, -0.25F, -0.7F, -0.5F, -0.25F, -0.7F, -1F, -0.25F, 2.77555756156289E-17F, -1.1F, -0.25F); // Box 307
        gunModel[197].setRotationPoint(0F, 0F, 0F);

        gunModel[198].addShapeBox(-32.5F, -30.3F, -0.25F, 4, 1, 2, 0F, -0.6F, 0.2F, -0.25F, -0.5F, 0.2F, -0.25F, -0.5F, 0.7F, -0.25F, -0.6F, 0.7F, -0.25F, -0.3F, -0.9F, -0.25F, -0.1F, -0.9F, -0.25F, -0.1F, -1.4F, -0.25F, -0.3F, -1.4F, -0.25F); // Box 308
        gunModel[198].setRotationPoint(0F, 0F, 0F);

        gunModel[199].addShapeBox(-32.5F, -30.3F, -0.25F, 4, 1, 2, 0F, -1.3F, 0.5F, -0.25F, -1.1F, 0.5F, -0.25F, -1.1F, 1F, -0.25F, -1.3F, 1F, -0.25F, -0.6F, -1.2F, -0.25F, -0.5F, -1.2F, -0.25F, -0.5F, -1.7F, -0.25F, -0.6F, -1.7F, -0.25F); // Box 309
        gunModel[199].setRotationPoint(0F, 0F, 0F);

        gunModel[200].addShapeBox(-32.5F, -30.3F, 1.25F, 4, 1, 2, 0F, -1.3F, 1F, -0.25F, -1.1F, 1F, -0.25F, -1.1F, 1F, -0.25F, -1.3F, 1F, -0.25F, -0.6F, -1.7F, -0.25F, -0.5F, -1.7F, -0.25F, -0.5F, -1.7F, -0.25F, -0.6F, -1.7F, -0.25F); // Box 310
        gunModel[200].setRotationPoint(0F, 0F, 0F);

        gunModel[201].addShapeBox(-32.5F, -30.3F, 1.25F, 4, 1, 2, 0F, -0.6F, 0.7F, -0.25F, -0.5F, 0.7F, -0.25F, -0.5F, 0.7F, -0.25F, -0.6F, 0.7F, -0.25F, -0.3F, -1.4F, -0.25F, -0.1F, -1.4F, -0.25F, -0.1F, -1.4F, -0.25F, -0.3F, -1.4F, -0.25F); // Box 311
        gunModel[201].setRotationPoint(0F, 0F, 0F);

        gunModel[202].addShapeBox(-32.5F, -30.3F, 1.25F, 5, 1, 2, 0F, -0.3F, 0.4F, -0.25F, -1.1F, 0.4F, -0.25F, -1.1F, 0.4F, -0.25F, -0.3F, 0.4F, -0.25F, 2.77555756156289E-17F, -1.1F, -0.25F, -0.7F, -1F, -0.25F, -0.7F, -1F, -0.25F, 2.77555756156289E-17F, -1.1F, -0.25F); // Box 312
        gunModel[202].setRotationPoint(0F, 0F, 0F);

        gunModel[203].addShapeBox(-33.5F, -30.8F, 1.25F, 5, 3, 2, 0F, -1F, -0.4F, -0.25F, 0.3F, -0.5F, -0.25F, 0.3F, -0.5F, -0.25F, -1F, -0.4F, -0.25F, -1F, 0.3F, -0.25F, 0.7F, 0.3F, -0.25F, 0.7F, 0.3F, -0.25F, -1F, 0.3F, -0.25F); // Box 313
        gunModel[203].setRotationPoint(0F, 0F, 0F);

        gunModel[204].addShapeBox(-32.9F, -31.8F, 1.25F, 1, 3, 2, 0F, -0.2F, -1.7F, -0.25F, -0.6F, -1.7F, -0.25F, -0.6F, -1.7F, -0.25F, -0.2F, -1.7F, -0.25F, -2.77555756156289E-17F, 0.2F, -0.25F, -0.6F, 0.2F, -0.25F, -0.6F, 0.2F, -0.25F, -2.77555756156289E-17F, 0.2F, -0.25F); // Box 314
        gunModel[204].setRotationPoint(0F, 0F, 0F);

        gunModel[205].addShapeBox(-32.9F, -30.8F, 1.25F, 1, 3, 2, 0F, 1.38777878078145E-16F, -2.2F, -0.25F, -0.6F, -2.2F, -0.25F, -0.6F, -2.2F, -0.25F, 1.38777878078145E-16F, -2.2F, -0.25F, 0.1F, 0.3F, -0.25F, -0.6F, 0.3F, -0.25F, -0.6F, 0.3F, -0.25F, 0.1F, 0.3F, -0.25F); // Box 315
        gunModel[205].setRotationPoint(0F, 0F, 0F);

        gunModel[206].addShapeBox(-33.5F, -30.8F, -0.75F, 5, 3, 1, 0F, -1F, -0.9F, -0.25F, 0.3F, -1F, -0.25F, 0.3F, -1F, -0.25F, -1F, -0.9F, -0.25F, -1F, 0.3F, -0.25F, 0.7F, 0.3F, -0.25F, 0.7F, 0.3F, -0.25F, -1F, 0.3F, -0.25F); // Box 316
        gunModel[206].setRotationPoint(0F, 0F, 0F);

        gunModel[207].addShapeBox(-32.9F, -31.8F, -0.75F, 1, 3, 1, 0F, -0.2F, -2.2F, -0.25F, -0.6F, -2.2F, -0.25F, -0.6F, -2.2F, -0.25F, -0.2F, -2.2F, -0.25F, -2.77555756156289E-17F, 0.2F, -0.25F, -0.6F, 0.2F, -0.25F, -0.6F, 0.2F, -0.25F, -2.77555756156289E-17F, 0.2F, -0.25F); // Box 317
        gunModel[207].setRotationPoint(0F, 0F, 0F);

        gunModel[208].addShapeBox(-32.9F, -30.8F, -0.75F, 1, 3, 1, 0F, 1.38777878078145E-16F, -2.2F, -0.25F, -0.6F, -2.2F, -0.25F, -0.6F, -2.2F, -0.25F, 1.38777878078145E-16F, -2.2F, -0.25F, 0.1F, 0.3F, -0.25F, -0.6F, 0.3F, -0.25F, -0.6F, 0.3F, -0.25F, 0.1F, 0.3F, -0.25F); // Box 318
        gunModel[208].setRotationPoint(0F, 0F, 0F);

        gunModel[209].addShapeBox(-32.5F, -30.3F, -0.75F, 5, 1, 1, 0F, -0.3F, -0.1F, -0.25F, -1.1F, -0.1F, -0.25F, -1.1F, -0.1F, -0.25F, -0.3F, -0.1F, -0.25F, 2.77555756156289E-17F, -0.6F, -0.25F, -0.7F, -0.5F, -0.25F, -0.7F, -0.5F, -0.25F, 2.77555756156289E-17F, -0.6F, -0.25F); // Box 319
        gunModel[209].setRotationPoint(0F, 0F, 0F);

        gunModel[210].addShapeBox(-32.5F, -30.3F, -0.75F, 4, 1, 1, 0F, -1.3F, 0.5F, -0.25F, -1.1F, 0.5F, -0.25F, -1.1F, 0.5F, -0.25F, -1.3F, 0.5F, -0.25F, -0.6F, -1.2F, -0.25F, -0.5F, -1.2F, -0.25F, -0.5F, -1.2F, -0.25F, -0.6F, -1.2F, -0.25F); // Box 320
        gunModel[210].setRotationPoint(0F, 0F, 0F);

        gunModel[211].addShapeBox(-32.5F, -30.3F, -0.75F, 4, 1, 1, 0F, -0.6F, 0.2F, -0.25F, -0.5F, 0.2F, -0.25F, -0.5F, 0.2F, -0.25F, -0.6F, 0.2F, -0.25F, -0.3F, -0.9F, -0.25F, -0.1F, -0.9F, -0.25F, -0.1F, -0.9F, -0.25F, -0.3F, -0.9F, -0.25F); // Box 321
        gunModel[211].setRotationPoint(0F, 0F, 0F);

        gunModel[212].addShapeBox(-33.5F, -29.8F, 2.7F, 4, 3, 1, 0F, 0F, 1.1F, -0.25F, 1.3F, 1F, -0.25F, 1.3F, 1F, -0.25F, 0F, 1.1F, -0.25F, 0F, -0.7F, -0.25F, 1.3F, -0.7F, -0.25F, 1.3F, -0.7F, -0.25F, 0F, -0.7F, -0.25F); // Box 322
        gunModel[212].setRotationPoint(0F, 0F, 0F);

        gunModel[213].addShapeBox(-33.5F, -30.8F, 2.7F, 5, 1, 1, 0F, -0.3F, 0.7F, -0.25F, -0.3F, 0.7F, -0.25F, -0.3F, 0.7F, -0.25F, -0.3F, 0.7F, -0.25F, -0.1F, -1.4F, -0.25F, -2.77555756156289E-17F, -1.4F, -0.25F, -2.77555756156289E-17F, -1.4F, -0.25F, -0.1F, -1.4F, -0.25F); // Box 323
        gunModel[213].setRotationPoint(0F, 0F, 0F);

        gunModel[214].addShapeBox(-33.5F, -30.8F, 2.7F, 5, 1, 1, 0F, -0.6F, 1F, -0.25F, -0.7F, 1F, -0.25F, -0.7F, 1F, -0.25F, -0.6F, 1F, -0.25F, -0.3F, -1.7F, -0.25F, -0.3F, -1.7F, -0.25F, -0.3F, -1.7F, -0.25F, -0.3F, -1.7F, -0.25F); // Box 324
        gunModel[214].setRotationPoint(0F, 0F, 0F);

        gunModel[215].addShapeBox(-33.5F, -30.8F, 2.7F, 5, 1, 1, 0F, -0.1F, 0.4F, -0.25F, 2.77555756156289E-17F, 0.4F, -0.25F, 2.77555756156289E-17F, 0.4F, -0.25F, -0.1F, 0.4F, -0.25F, 0F, -1.1F, -0.25F, 0.3F, -1F, -0.25F, 0.3F, -1F, -0.25F, 0F, -1.1F, -0.25F); // Box 325
        gunModel[215].setRotationPoint(0F, 0F, 0F);

        gunModel[216].addShapeBox(-33.5F, -30.8F, 2.7F, 5, 1, 1, 0F, -1.1F, 1.3F, -0.25F, -1.2F, 1.3F, -0.25F, -1.2F, 1.3F, -0.25F, -1.1F, 1.3F, -0.25F, -0.6F, -2F, -0.25F, -0.7F, -2F, -0.25F, -0.7F, -2F, -0.25F, -0.6F, -2F, -0.25F); // Box 326
        gunModel[216].setRotationPoint(0F, 0F, 0F);

        gunModel[217].addShapeBox(-33.5F, -30.8F, 2.7F, 5, 1, 1, 0F, -1.6F, 1.5F, -0.25F, -1.9F, 1.5F, -0.25F, -1.9F, 1.5F, -0.25F, -1.6F, 1.5F, -0.25F, -1.1F, -2.3F, -0.25F, -1.2F, -2.3F, -0.25F, -1.2F, -2.3F, -0.25F, -1.1F, -2.3F, -0.25F); // Box 327
        gunModel[217].setRotationPoint(0F, 0F, 0F);

        gunModel[218].addShapeBox(-31F, -31F, -0.75F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
        gunModel[218].setRotationPoint(0F, 0F, 0F);

        gunModel[219].addShapeBox(-31F, -32.5F, -0.75F, 1, 1, 1, 0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
        gunModel[219].setRotationPoint(0F, 0F, 0F);

        gunModel[220].addShapeBox(-31F, -32.5F, -0.75F, 1, 1, 1, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 332
        gunModel[220].setRotationPoint(0F, 0F, 0F);

        gunModel[221].addShapeBox(-31F, -32.75F, -0.75F, 1, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 333
        gunModel[221].setRotationPoint(0F, 0F, 0F);

        gunModel[222].addShapeBox(-31F, -32.75F, -0.75F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F); // Box 334
        gunModel[222].setRotationPoint(0F, 0F, 0F);

        gunModel[223].addShapeBox(-31F, -32.5F, -0.75F, 1, 1, 1, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 335
        gunModel[223].setRotationPoint(0F, 0F, 0F);

        gunModel[224].addShapeBox(-31F, -32.5F, -0.75F, 1, 1, 1, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F); // Box 336
        gunModel[224].setRotationPoint(0F, 0F, 0F);

        gunModel[225].addShapeBox(-31F, -34F, -0.75F, 1, 1, 1, 0F, 0F, -1.1F, -0.2F, 0F, -1.1F, -0.2F, 0F, -1.1F, -0.2F, 0F, -1.1F, -0.2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 337
        gunModel[225].setRotationPoint(0F, 0F, 0F);

        gunModel[226].addShapeBox(81F, -27.5F, -2.07F, 3, 8, 4, 0F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 344
        gunModel[226].setRotationPoint(0F, 0F, 0F);

        gunModel[227].addShapeBox(82F, -32.5F, -0.57F, 1, 1, 1, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 346
        gunModel[227].setRotationPoint(0F, 0F, 0F);

        gunModel[228].addShapeBox(81.5F, -32.5F, -0.07F, 2, 1, 1, 0F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
        gunModel[228].setRotationPoint(0F, 0F, 0F);

        gunModel[229].addShapeBox(81.5F, -32.5F, -1.07F, 2, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 348
        gunModel[229].setRotationPoint(0F, 0F, 0F);

        gunModel[230].addShapeBox(86F, -21F, -1.57F, 2, 1, 3, 0F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F); // Box 386
        gunModel[230].setRotationPoint(0F, 0F, 0F);

        gunModel[231].addShapeBox(86F, -22.3F, -1.57F, 2, 1, 3, 0F, 0F, -0.2F, -1.2F, 0F, -0.2F, -1.2F, 0F, -0.2F, -1.2F, 0F, -0.2F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 387
        gunModel[231].setRotationPoint(0F, 0F, 0F);

        gunModel[232].addShapeBox(86F, -19.7F, -1.57F, 2, 1, 3, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -1.2F, 0F, -0.2F, -1.2F, 0F, -0.2F, -1.2F, 0F, -0.2F, -1.2F); // Box 388
        gunModel[232].setRotationPoint(0F, 0F, 0F);


        ammoModel = new ModelRendererTurbo[6];
        ammoModel[0] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 263
        ammoModel[1] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box 264
        ammoModel[2] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 265
        ammoModel[3] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Box 266
        ammoModel[4] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 267
        ammoModel[5] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Box 268

        ammoModel[0].addShapeBox(-18F, -16.2F, -3.5F, 7, 23, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
        ammoModel[0].setRotationPoint(0F, 0F, 0F);
        ammoModel[0].rotateAngleZ = 0.03490659F;

        ammoModel[1].addShapeBox(-8F, -16.2F, -3.5F, 2, 23, 7, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 264
        ammoModel[1].setRotationPoint(0F, 0F, 0F);
        ammoModel[1].rotateAngleZ = 0.03490659F;

        ammoModel[2].addShapeBox(-19F, -16.2F, -3F, 1, 23, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
        ammoModel[2].setRotationPoint(0F, 0F, 0F);
        ammoModel[2].rotateAngleZ = 0.03490659F;

        ammoModel[3].addShapeBox(-20F, -16.2F, -3.5F, 1, 23, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
        ammoModel[3].setRotationPoint(0F, 0F, 0F);
        ammoModel[3].rotateAngleZ = 0.03490659F;

        ammoModel[4].addShapeBox(-10F, -16.2F, -3.5F, 2, 23, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
        ammoModel[4].setRotationPoint(0F, 0F, 0F);
        ammoModel[4].rotateAngleZ = 0.03490659F;

        ammoModel[5].addShapeBox(-11F, -16.2F, -3F, 1, 23, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
        ammoModel[5].setRotationPoint(0F, 0F, 0F);
        ammoModel[5].rotateAngleZ = 0.03490659F;


        slideModel = new ModelRendererTurbo[39];
        slideModel[0] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 139
        slideModel[1] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 144
        slideModel[2] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 145
        slideModel[3] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 146
        slideModel[4] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 147
        slideModel[5] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 148
        slideModel[6] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 149
        slideModel[7] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 150
        slideModel[8] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 151
        slideModel[9] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 152
        slideModel[10] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 153
        slideModel[11] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 154
        slideModel[12] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 155
        slideModel[13] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 156
        slideModel[14] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 177
        slideModel[15] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 178
        slideModel[16] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 179
        slideModel[17] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 180
        slideModel[18] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 181
        slideModel[19] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 182
        slideModel[20] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 204
        slideModel[21] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 205
        slideModel[22] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 206
        slideModel[23] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 207
        slideModel[24] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 208
        slideModel[25] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 209
        slideModel[26] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 210
        slideModel[27] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 211
        slideModel[28] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 212
        slideModel[29] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 213
        slideModel[30] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 214
        slideModel[31] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 215
        slideModel[32] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 216
        slideModel[33] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 218
        slideModel[34] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 219
        slideModel[35] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 220
        slideModel[36] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 221
        slideModel[37] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 222
        slideModel[38] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 223

        slideModel[0].addShapeBox(-6F, -26F, -5F, 10, 3, 1, 0F, 0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0.6F, -0.6F, 0F, 0.6F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.6F, -0.2F, 0F); // Box 139
        slideModel[0].setRotationPoint(0F, 0F, 0F);

        slideModel[1].addShapeBox(-6F, -28.8F, -5F, 10, 3, 1, 0F, 0.6F, -3.1F, 0F, -0.3F, -3.1F, 0F, -0.3F, -3.1F, 0F, 0.6F, -3.1F, 0F, 0.6F, 0.4F, 0F, -0.6F, 0.4F, 0F, -0.6F, 0.4F, 0F, 0.6F, 0.4F, 0F); // Box 144
        slideModel[1].setRotationPoint(0F, 0F, 0F);

        slideModel[2].addShapeBox(-2F, -29.8F, -5F, 6, 3, 1, 0F, -0.2F, -3.1F, 0F, -0.3F, -3.1F, 0F, -0.3F, -3.1F, 0F, -0.2F, -3.1F, 0F, 1.1F, 1.1F, 0F, -0.3F, 1.1F, 0F, -0.3F, 1.1F, 0F, 1.1F, 1.1F, 0F); // Box 145
        slideModel[2].setRotationPoint(0F, 0F, 0F);

        slideModel[3].addShapeBox(-2F, -30.8F, -5F, 6, 3, 1, 0F, -1F, -3.1F, 0F, -0.3F, -3.1F, 0F, -0.3F, -3.1F, 0F, -1F, -3.1F, 0F, -0.2F, 1.1F, 0F, -0.3F, 1.1F, 0F, -0.3F, 1.1F, 0F, -0.2F, 1.1F, 0F); // Box 146
        slideModel[3].setRotationPoint(0F, 0F, 0F);

        slideModel[4].addShapeBox(4F, -31.8F, -5F, 1, 5, 1, 0F, 0.3F, -2.7F, 0F, -1F, -2.8F, 0F, -1F, -2.8F, 0F, 0.3F, -2.7F, 0F, 0.3F, 1.1F, 0F, -1F, 0.8F, 0F, -1F, 0.8F, 0F, 0.3F, 1.1F, 0F); // Box 147
        slideModel[4].setRotationPoint(0F, 0F, 0F);

        slideModel[5].addShapeBox(-2F, -31.8F, -5F, 6, 3, 1, 0F, -1.5F, -3.1F, 0F, -0.3F, -3.1F, 0F, -0.3F, -3.1F, 0F, -1.5F, -3.1F, 0F, -1F, 1.1F, 0F, -0.3F, 1.1F, 0F, -0.3F, 1.1F, 0F, -1F, 1.1F, 0F); // Box 148
        slideModel[5].setRotationPoint(0F, 0F, 0F);

        slideModel[6].addShapeBox(-2F, -32.8F, -5F, 6, 3, 1, 0F, -1.8F, -3.7F, 0F, -0.3F, -3.7F, 0F, -0.3F, -3.7F, 0F, -1.8F, -3.7F, 0F, -1.5F, 1.1F, 0F, -0.3F, 1.1F, 0F, -0.3F, 1.1F, 0F, -1.5F, 1.1F, 0F); // Box 149
        slideModel[6].setRotationPoint(0F, 0F, 0F);

        slideModel[7].addShapeBox(4F, -24.5F, -4.75F, 23, 2, 1, 0F, 0.6F, 0.9F, -0.25F, -0.6F, 1F, -0.25F, -0.6F, 1F, -0.25F, 0.6F, 0.9F, -0.25F, 0F, -0.7F, -0.25F, -0.6F, -0.6F, -0.25F, -0.6F, -0.6F, -0.25F, 0F, -0.7F, -0.25F); // Box 150
        slideModel[7].setRotationPoint(0F, 0F, 0F);

        slideModel[8].addShapeBox(25F, -24.5F, -4.75F, 3, 2, 1, 0F, -1.4F, 1F, -0.25F, -0.6F, 1F, -0.25F, -0.6F, 1F, -0.25F, -1.4F, 1F, -0.25F, -1.4F, -0.6F, -0.25F, -0.6F, -0.6F, -0.25F, -0.6F, -0.6F, -0.25F, -1.4F, -0.6F, -0.25F); // Box 151
        slideModel[8].setRotationPoint(0F, 0F, 0F);

        slideModel[9].addShapeBox(26F, -24.5F, -4.75F, 3, 2, 1, 0F, -1.4F, 1F, -0.25F, -0.6F, 0.6F, -0.25F, -0.6F, 0.6F, -0.25F, -1.4F, 1F, -0.25F, -1.4F, -0.6F, -0.25F, -0.6F, -0.3F, -0.25F, -0.6F, -0.3F, -0.25F, -1.4F, -0.6F, -0.25F); // Box 152
        slideModel[9].setRotationPoint(0F, 0F, 0F);

        slideModel[10].addShapeBox(26F, -24.5F, -3.75F, 3, 2, 1, 0F, -1.4F, 1F, 0.25F, -0.6F, 0.6F, 0.25F, -0.6F, 0.6F, -0.25F, -1.4F, 1F, -0.25F, -1.4F, -0.6F, 0.25F, -0.6F, -0.3F, 0.25F, -1F, 1.1F, -0.25F, -1.4F, 1.1F, -0.25F); // Box 153
        slideModel[10].setRotationPoint(0F, 0F, 0F);

        slideModel[11].addShapeBox(22F, -24.5F, -3.75F, 6, 2, 1, 0F, -1.4F, 1F, 0.25F, -0.6F, 1F, 0.25F, -0.6F, 1F, -0.25F, -1.4F, 1F, -0.25F, -1.5F, -0.6F, 0.25F, -0.6F, -0.6F, 0.25F, -0.6F, 1.1F, -0.25F, -1F, 1.1F, -0.25F); // Box 154
        slideModel[11].setRotationPoint(0F, 0F, 0F);

        slideModel[12].addShapeBox(26F, -22.5F, -3.25F, 3, 2, 1, 0F, -1.4F, 0.6F, -0.25F, -0.6F, 0.6F, -0.25F, -0.6F, 0.6F, -0.25F, -1.4F, 0.6F, -0.25F, -1.4F, -0.9F, -0.25F, -1F, -0.9F, -0.25F, -1F, -0.9F, 0.75F, -1.4F, -0.9F, 0.75F); // Box 155
        slideModel[12].setRotationPoint(0F, 0F, 0F);

        slideModel[13].addShapeBox(22F, -22.5F, -3.25F, 6, 2, 1, 0F, -1.2F, 1F, -0.25F, -0.6F, 0.6F, -0.25F, -0.6F, 0.6F, -0.25F, -1.4F, 1F, -0.25F, -1F, -0.9F, -0.25F, -0.6F, -0.9F, -0.25F, -0.6F, -0.9F, 0.75F, -1F, -0.95F, 0.75F); // Box 156
        slideModel[13].setRotationPoint(0F, 0F, 0F);

        slideModel[14].addShapeBox(23F, -20.5F, -1.57F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 177
        slideModel[14].setRotationPoint(0F, 0F, 0F);

        slideModel[15].addShapeBox(23F, -21.5F, -1.57F, 5, 1, 2, 0F, 0F, -0.1F, 1.4F, 0F, -0.1F, 1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
        slideModel[15].setRotationPoint(0F, 0F, 0F);

        slideModel[16].addShapeBox(23F, -22.5F, -1.57F, 5, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5.55111512312578E-17F, 0F, 0F, -5.55111512312578E-17F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 179
        slideModel[16].setRotationPoint(0F, 0F, 0F);

        slideModel[17].addShapeBox(23F, -22.5F, 0.43F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 180
        slideModel[17].setRotationPoint(0F, 0F, 0F);

        slideModel[18].addShapeBox(-6F, -26F, -6F, 1, 3, 1, 0F, 0.6F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0.6F, -0.3F, 0F, 0.6F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, -0.2F, 0F, 0.6F, -0.2F, 0F); // Box 181
        slideModel[18].setRotationPoint(0F, 0F, 0F);

        slideModel[19].addShapeBox(-6F, -26F, -9F, 1, 3, 3, 0F, -0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, -0.5F, -0.3F, 0F, 0.6F, -0.3F, 0F, -0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0.6F, 0.1F, 0F); // Box 182
        slideModel[19].setRotationPoint(0F, 0F, 0F);

        slideModel[20].addShapeBox(-14.5F, -29F, 0F, 14, 4, 2, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -1.2F, -0.4F, 0F, -1.2F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 204
        slideModel[20].setRotationPoint(0F, 0F, 0F);

        slideModel[21].addShapeBox(-14.5F, -29F, -2F, 14, 4, 2, 0F, 0F, -2.6F, 0F, 0F, -2.6F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
        slideModel[21].setRotationPoint(0F, 0F, 0F);

        slideModel[22].addShapeBox(-14.5F, -29F, -2F, 14, 4, 1, 0F, 0F, -3.4F, 0.5F, 0F, -3.4F, 0.5F, 0F, -2.6F, -1F, 0F, -2.6F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 206
        slideModel[22].setRotationPoint(0F, 0F, 0F);

        slideModel[23].addShapeBox(-0.5F, -29F, 0F, 1, 4, 2, 0F, 0F, -1.4F, 0F, 0F, -1F, 0F, 0F, -0.8F, -0.4F, 0F, -1.2F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 207
        slideModel[23].setRotationPoint(0F, 0F, 0F);

        slideModel[24].addShapeBox(-0.5F, -29F, -2F, 1, 4, 2, 0F, 0F, -2.6F, 0F, 0F, -2.2F, 0F, 0F, -1F, 0F, 0F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
        slideModel[24].setRotationPoint(0F, 0F, 0F);

        slideModel[25].addShapeBox(-0.5F, -29F, -2F, 1, 4, 1, 0F, 0F, -3.4F, 0.5F, 0F, -3F, 0.5F, 0F, -2.2F, -1F, 0F, -2.6F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 209
        slideModel[25].setRotationPoint(0F, 0F, 0F);

        slideModel[26].addShapeBox(0.5F, -29F, 0F, 2, 4, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 210
        slideModel[26].setRotationPoint(0F, 0F, 0F);

        slideModel[27].addShapeBox(0.5F, -29F, -2F, 2, 4, 2, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
        slideModel[27].setRotationPoint(0F, 0F, 0F);

        slideModel[28].addShapeBox(0.5F, -29F, -2F, 2, 4, 1, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, -2.2F, -1F, 0F, -2.2F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 212
        slideModel[28].setRotationPoint(0F, 0F, 0F);

        slideModel[29].addShapeBox(-15.5F, -29F, -2F, 1, 4, 1, 0F, 0F, -3.9F, 0.5F, 0F, -3.4F, 0.5F, 0F, -2.6F, -1F, 0F, -3.1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 213
        slideModel[29].setRotationPoint(0F, 0F, 0F);

        slideModel[30].addShapeBox(-15.5F, -29F, -2F, 1, 4, 2, 0F, 0F, -3.1F, 0F, 0F, -2.6F, 0F, 0F, -1.4F, 0F, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
        slideModel[30].setRotationPoint(0F, 0F, 0F);

        slideModel[31].addShapeBox(-15.5F, -29F, 0F, 1, 4, 2, 0F, 0F, -1.9F, 0F, 0F, -1.4F, 0F, 0F, -1.2F, -0.4F, 0F, -1.7F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 215
        slideModel[31].setRotationPoint(0F, 0F, 0F);

        slideModel[32].addShapeBox(-22.5F, -28F, -2F, 25, 5, 5, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, -1.4F, 0F, -3F, -1.4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.4F, 0F, 0F, -1.4F); // Box 216
        slideModel[32].setRotationPoint(0F, 0F, 0F);

        slideModel[33].addShapeBox(-18.5F, -29F, -2F, 3, 4, 1, 0F, 0F, -3.9F, 0.5F, 0F, -3.9F, 0.5F, 0F, -3.1F, -1F, 0F, -3.1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 218
        slideModel[33].setRotationPoint(0F, 0F, 0F);

        slideModel[34].addShapeBox(-18.5F, -29F, -2F, 3, 4, 2, 0F, 0F, -3.1F, 0F, 0F, -3.1F, 0F, 0F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
        slideModel[34].setRotationPoint(0F, 0F, 0F);

        slideModel[35].addShapeBox(-18.5F, -29F, 0F, 3, 4, 2, 0F, 0F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, -1.7F, -0.4F, 0F, -1.7F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 220
        slideModel[35].setRotationPoint(0F, 0F, 0F);

        slideModel[36].addShapeBox(-22.5F, -29F, -2F, 4, 4, 1, 0F, 0F, -4F, 0.5F, 0F, -3.9F, 0.5F, 0F, -3.1F, -1F, 0F, -4F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 221
        slideModel[36].setRotationPoint(0F, 0F, 0F);

        slideModel[37].addShapeBox(-22.5F, -29F, -2F, 4, 4, 2, 0F, 0F, -4F, 0F, 0F, -3.1F, 0F, 0F, -1.9F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
        slideModel[37].setRotationPoint(0F, 0F, 0F);

        slideModel[38].addShapeBox(-22.5F, -29F, 0F, 4, 4, 2, 0F, 0F, -4F, 0F, 0F, -1.9F, 0F, 0F, -1.7F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 223
        slideModel[38].setRotationPoint(0F, 0F, 0F);


        gunSlideDistance = 1.4F;
        gunOffset = -0.6F;

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
        stanceTranslate = new Vector3f(0.5D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(45.0F, 0.0F, 1.0F);
        animationType = EnumAnimationType.CUSTOM;
        rotateGunHorizontal = 15.0F;
        tiltGun = 30.0F;
        translateGun = new Vector3f(0.0F, -0.0625F, -0.1875F);
        translateClip = new Vector3f(0.0F, -0.625F, 0.0F);
        hasFlash = true;
        hasArms = true;
        rightHandAmmo = false;
        leftHandAmmo = true;
        crouchZoom = -0.25F;
        translateAll(0F, 0F, 0F);


        flipAll();
    }
}