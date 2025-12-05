//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MG3
// Model Creator: 
// Created on: 29.04.2017 - 13:21:41
// Last changed on: 29.04.2017 - 13:21:41

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelMG3 extends ModelGun //Same as Filename
{
    int textureX = 256;
    int textureY = 256;

    public ModelMG3() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[242];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
        gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
        gunModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
        gunModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 4
        gunModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 6
        gunModel[6] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 7
        gunModel[7] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 8
        gunModel[8] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 9
        gunModel[9] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 10
        gunModel[10] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 11
        gunModel[11] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 13
        gunModel[12] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 14
        gunModel[13] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 15
        gunModel[14] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 16
        gunModel[15] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 17
        gunModel[16] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 18
        gunModel[17] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 19
        gunModel[18] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 20
        gunModel[19] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 21
        gunModel[20] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 22
        gunModel[21] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 23
        gunModel[22] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 24
        gunModel[23] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 25
        gunModel[24] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 26
        gunModel[25] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 27
        gunModel[26] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 28
        gunModel[27] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 29
        gunModel[28] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 30
        gunModel[29] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 31
        gunModel[30] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 32
        gunModel[31] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 33
        gunModel[32] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 34
        gunModel[33] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 36
        gunModel[34] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 37
        gunModel[35] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 38
        gunModel[36] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 39
        gunModel[37] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 40
        gunModel[38] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 41
        gunModel[39] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 42
        gunModel[40] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 43
        gunModel[41] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 47
        gunModel[42] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 48
        gunModel[43] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 49
        gunModel[44] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 50
        gunModel[45] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 51
        gunModel[46] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 52
        gunModel[47] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 53
        gunModel[48] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 54
        gunModel[49] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 55
        gunModel[50] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 56
        gunModel[51] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 57
        gunModel[52] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 58
        gunModel[53] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 59
        gunModel[54] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 60
        gunModel[55] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 61
        gunModel[56] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 62
        gunModel[57] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 63
        gunModel[58] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 64
        gunModel[59] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 68
        gunModel[60] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 69
        gunModel[61] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 70
        gunModel[62] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 71
        gunModel[63] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 72
        gunModel[64] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 73
        gunModel[65] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 74
        gunModel[66] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 75
        gunModel[67] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 76
        gunModel[68] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 77
        gunModel[69] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 78
        gunModel[70] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 79
        gunModel[71] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 80
        gunModel[72] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 81
        gunModel[73] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 82
        gunModel[74] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 83
        gunModel[75] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 84
        gunModel[76] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 85
        gunModel[77] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 90
        gunModel[78] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 98
        gunModel[79] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 99
        gunModel[80] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 136
        gunModel[81] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 137
        gunModel[82] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 138
        gunModel[83] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 139
        gunModel[84] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 140
        gunModel[85] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 141
        gunModel[86] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 142
        gunModel[87] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 143
        gunModel[88] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 144
        gunModel[89] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 145
        gunModel[90] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 146
        gunModel[91] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 147
        gunModel[92] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 148
        gunModel[93] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 151
        gunModel[94] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 152
        gunModel[95] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 153
        gunModel[96] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 154
        gunModel[97] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 168
        gunModel[98] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 169
        gunModel[99] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 170
        gunModel[100] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 171
        gunModel[101] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 172
        gunModel[102] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 173
        gunModel[103] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 174
        gunModel[104] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 186
        gunModel[105] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 187
        gunModel[106] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 188
        gunModel[107] = new ModelRendererTurbo(this, 155, 171, textureX, textureY); // Box 189
        gunModel[108] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 198
        gunModel[109] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 199
        gunModel[110] = new ModelRendererTurbo(this, 154, 156, textureX, textureY); // Box 200
        gunModel[111] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 202
        gunModel[112] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 209
        gunModel[113] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 210
        gunModel[114] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 211
        gunModel[115] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 212
        gunModel[116] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 213
        gunModel[117] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 214
        gunModel[118] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 217
        gunModel[119] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 218
        gunModel[120] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 219
        gunModel[121] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 220
        gunModel[122] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 221
        gunModel[123] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 222
        gunModel[124] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 223
        gunModel[125] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 224
        gunModel[126] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 225
        gunModel[127] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 226
        gunModel[128] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 229
        gunModel[129] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 230
        gunModel[130] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 231
        gunModel[131] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 232
        gunModel[132] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 233
        gunModel[133] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 234
        gunModel[134] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 235
        gunModel[135] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 236
        gunModel[136] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 237
        gunModel[137] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 219
        gunModel[138] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 220
        gunModel[139] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 227
        gunModel[140] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 228
        gunModel[141] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 229
        gunModel[142] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 230
        gunModel[143] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 231
        gunModel[144] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 232
        gunModel[145] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 233
        gunModel[146] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 234
        gunModel[147] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 239
        gunModel[148] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 240
        gunModel[149] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 259
        gunModel[150] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 260
        gunModel[151] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 261
        gunModel[152] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 262
        gunModel[153] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 263
        gunModel[154] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 264
        gunModel[155] = new ModelRendererTurbo(this, 5, 195, textureX, textureY); // Box 265
        gunModel[156] = new ModelRendererTurbo(this, 21, 195, textureX, textureY); // Box 267
        gunModel[157] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 269
        gunModel[158] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 270
        gunModel[159] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 271
        gunModel[160] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 272
        gunModel[161] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 273
        gunModel[162] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 274
        gunModel[163] = new ModelRendererTurbo(this, 37, 195, textureX, textureY); // Box 275
        gunModel[164] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 276
        gunModel[165] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 278
        gunModel[166] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 279
        gunModel[167] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 280
        gunModel[168] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 281
        gunModel[169] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 282
        gunModel[170] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 283
        gunModel[171] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 284
        gunModel[172] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 285
        gunModel[173] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 286
        gunModel[174] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 287
        gunModel[175] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Box 288
        gunModel[176] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 289
        gunModel[177] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 290
        gunModel[178] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 291
        gunModel[179] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 322
        gunModel[180] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 323
        gunModel[181] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 324
        gunModel[182] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 325
        gunModel[183] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 326
        gunModel[184] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 327
        gunModel[185] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 328
        gunModel[186] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 329
        gunModel[187] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 330
        gunModel[188] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 331
        gunModel[189] = new ModelRendererTurbo(this, 73, 156, textureX, textureY); // Box 349
        gunModel[190] = new ModelRendererTurbo(this, 73, 156, textureX, textureY); // Box 350
        gunModel[191] = new ModelRendererTurbo(this, 73, 156, textureX, textureY); // Box 351
        gunModel[192] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 202
        gunModel[193] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 203
        gunModel[194] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 237
        gunModel[195] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 238
        gunModel[196] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 202
        gunModel[197] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 237
        gunModel[198] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 209
        gunModel[199] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 210
        gunModel[200] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 217
        gunModel[201] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 218
        gunModel[202] = new ModelRendererTurbo(this, 154, 164, textureX, textureY); // Box 200
        gunModel[203] = new ModelRendererTurbo(this, 187, 171, textureX, textureY); // Box 189
        gunModel[204] = new ModelRendererTurbo(this, 219, 171, textureX, textureY); // Box 189
        gunModel[205] = new ModelRendererTurbo(this, 179, 179, textureX, textureY); // Box 189
        gunModel[206] = new ModelRendererTurbo(this, 203, 179, textureX, textureY); // Box 189
        gunModel[207] = new ModelRendererTurbo(this, 227, 179, textureX, textureY); // Box 189
        gunModel[208] = new ModelRendererTurbo(this, 155, 187, textureX, textureY); // Box 189
        gunModel[209] = new ModelRendererTurbo(this, 155, 195, textureX, textureY); // Box 189
        gunModel[210] = new ModelRendererTurbo(this, 187, 171, textureX, textureY); // Box 109
        gunModel[211] = new ModelRendererTurbo(this, 240, 164, textureX, textureY); // Box 189
        gunModel[212] = new ModelRendererTurbo(this, 248, 164, textureX, textureY); // Box 189
        gunModel[213] = new ModelRendererTurbo(this, 227, 230, textureX, textureY); // Box 364
        gunModel[214] = new ModelRendererTurbo(this, 227, 230, textureX, textureY); // Box 364
        gunModel[215] = new ModelRendererTurbo(this, 47, 240, textureX, textureY); // Box 364
        gunModel[216] = new ModelRendererTurbo(this, 55, 240, textureX, textureY); // Box 364
        gunModel[217] = new ModelRendererTurbo(this, 79, 240, textureX, textureY); // Box 364
        gunModel[218] = new ModelRendererTurbo(this, 179, 222, textureX, textureY); // Box 364
        gunModel[219] = new ModelRendererTurbo(this, 243, 222, textureX, textureY); // Box 364
        gunModel[220] = new ModelRendererTurbo(this, 243, 222, textureX, textureY); // Box 364
        gunModel[221] = new ModelRendererTurbo(this, 243, 222, textureX, textureY); // Box 364
        gunModel[222] = new ModelRendererTurbo(this, 243, 222, textureX, textureY); // Box 364
        gunModel[223] = new ModelRendererTurbo(this, 243, 222, textureX, textureY); // Box 364
        gunModel[224] = new ModelRendererTurbo(this, 243, 222, textureX, textureY); // Box 364
        gunModel[225] = new ModelRendererTurbo(this, 243, 222, textureX, textureY); // Box 364
        gunModel[226] = new ModelRendererTurbo(this, 243, 222, textureX, textureY); // Box 364
        gunModel[227] = new ModelRendererTurbo(this, 243, 222, textureX, textureY); // Box 364
        gunModel[228] = new ModelRendererTurbo(this, 243, 222, textureX, textureY); // Box 364
        gunModel[229] = new ModelRendererTurbo(this, 243, 222, textureX, textureY); // Box 364
        gunModel[230] = new ModelRendererTurbo(this, 243, 222, textureX, textureY); // Box 364
        gunModel[231] = new ModelRendererTurbo(this, 243, 222, textureX, textureY); // Box 364
        gunModel[232] = new ModelRendererTurbo(this, 243, 222, textureX, textureY); // Box 364
        gunModel[233] = new ModelRendererTurbo(this, 47, 240, textureX, textureY); // Box 364
        gunModel[234] = new ModelRendererTurbo(this, 47, 240, textureX, textureY); // Box 364
        gunModel[235] = new ModelRendererTurbo(this, 47, 240, textureX, textureY); // Box 364
        gunModel[236] = new ModelRendererTurbo(this, 47, 240, textureX, textureY); // Box 364
        gunModel[237] = new ModelRendererTurbo(this, 55, 240, textureX, textureY); // Box 364
        gunModel[238] = new ModelRendererTurbo(this, 79, 240, textureX, textureY); // Box 364
        gunModel[239] = new ModelRendererTurbo(this, 47, 240, textureX, textureY); // Box 364
        gunModel[240] = new ModelRendererTurbo(this, 47, 240, textureX, textureY); // Box 364
        gunModel[241] = new ModelRendererTurbo(this, 47, 240, textureX, textureY); // Box 364

        gunModel[0].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[0].setRotationPoint(3F, -13.5F, -1.5F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1
        gunModel[1].setRotationPoint(3F, -11.5F, -1.5F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 2
        gunModel[2].setRotationPoint(3F, -11F, -1.5F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 3
        gunModel[3].setRotationPoint(1F, -6F, -1.5F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 4
        gunModel[4].setRotationPoint(2.5F, -5F, -1.5F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 6
        gunModel[5].setRotationPoint(3F, -15.25F, -1.5F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 7
        gunModel[6].setRotationPoint(3F, -14.25F, -1.5F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 8
        gunModel[7].setRotationPoint(3F, -14F, -1.5F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 2.5F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, 2.5F, 0F, -0.25F); // Box 9
        gunModel[8].setRotationPoint(3F, -11F, -1.5F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 10
        gunModel[9].setRotationPoint(1F, -6F, -1.5F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 11
        gunModel[10].setRotationPoint(2F, -5F, -1.5F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.65F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.65F, 0F, -0.25F, -1F, -0.65F, -0.25F, 0F, -0.65F, -0.25F, 0F, -0.65F, -0.25F, -1F, -0.65F, -0.25F); // Box 13
        gunModel[11].setRotationPoint(1F, -5F, -1.5F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -1F, -0.65F, -0.25F, 0F, -0.65F, -0.25F, 0F, -0.65F, -0.25F, -1F, -0.65F, -0.25F, -0.65F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.65F, 0F, -0.25F); // Box 14
        gunModel[12].setRotationPoint(1F, -5F, -1.5F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.65F, -0.25F, -1F, -0.65F, -0.25F, -1F, -0.65F, -0.25F, 0F, -0.65F, -0.25F, 0F, 0F, -0.25F, -0.65F, 0F, -0.25F, -0.65F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 15
        gunModel[13].setRotationPoint(1F, -5F, -1.5F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.25F, -0.65F, 0F, -0.25F, -0.65F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.65F, -0.25F, -1F, -0.65F, -0.25F, -1F, -0.65F, -0.25F, 0F, -0.65F, -0.25F); // Box 16
        gunModel[14].setRotationPoint(1F, -5F, -1.5F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Box 17
        gunModel[15].setRotationPoint(0F, -5F, -1.5F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 18
        gunModel[16].setRotationPoint(1F, -4F, -1.5F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F); // Box 19
        gunModel[17].setRotationPoint(3F, -11.5F, -1.5F);

        gunModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 20
        gunModel[18].setRotationPoint(3F, -12.5F, -1.5F);

        gunModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 1.25F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 21
        gunModel[19].setRotationPoint(3F, -13.5F, -1.5F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F); // Box 22
        gunModel[20].setRotationPoint(1F, -14F, -1.5F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F); // Box 23
        gunModel[21].setRotationPoint(1F, -15.5F, -1.5F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 2F, 0.5F, -0.25F, 2F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 24
        gunModel[22].setRotationPoint(3F, -15.5F, -1.5F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.25F, 0F, -0.25F, 2F, 0F, -0.25F, 2F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, -0.5F, -0.25F, 2F, -0.5F, -0.25F, 2F, -0.5F, -0.25F, -1F, -0.5F, -0.25F); // Box 25
        gunModel[23].setRotationPoint(11F, -14F, -1.5F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, 2F, -0.5F, -0.25F, 2F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 26
        gunModel[24].setRotationPoint(12F, -13.5F, -1.5F);

        gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F); // Box 27
        gunModel[25].setRotationPoint(12F, -12.5F, -1.5F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, -1F, 0.5F, -0.25F, -1F, 0.5F, -0.25F, 0F, 0F, -0.25F); // Box 28
        gunModel[26].setRotationPoint(12F, -11.5F, -1.5F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, -1F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 29
        gunModel[27].setRotationPoint(7.5F, -10.5F, -1.5F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0.25F, -0.25F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.25F, -0.25F, -0.25F, -1F, 0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -1F, 0.5F, -0.25F); // Box 30
        gunModel[28].setRotationPoint(7F, -11.5F, -1.5F);

        gunModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 31
        gunModel[29].setRotationPoint(8F, -14F, -1F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 32
        gunModel[30].setRotationPoint(8.5F, -13F, -1F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.25F, 0F, 0F); // Box 33
        gunModel[31].setRotationPoint(8.5F, -12F, -1F);

        gunModel[32].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
        gunModel[32].setRotationPoint(-4F, -15.5F, -1.5F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 36
        gunModel[33].setRotationPoint(-4F, -14.5F, -1.5F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 37
        gunModel[34].setRotationPoint(-4F, -13.75F, -1.5F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 38
        gunModel[35].setRotationPoint(5F, -12.5F, -1.5F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 39
        gunModel[36].setRotationPoint(5F, -13F, -1.5F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F); // Box 40
        gunModel[37].setRotationPoint(5F, -12F, -1.5F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F); // Box 41
        gunModel[38].setRotationPoint(2F, -6F, -1.5F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 42
        gunModel[39].setRotationPoint(2F, -6.5F, -1.5F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 43
        gunModel[40].setRotationPoint(2F, -7F, -1.5F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F); // Box 47
        gunModel[41].setRotationPoint(-3.25F, -14.25F, -1.5F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F); // Box 48
        gunModel[42].setRotationPoint(-3.25F, -14.75F, -1.5F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F); // Box 49
        gunModel[43].setRotationPoint(-3.25F, -15.25F, -1.5F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 50
        gunModel[44].setRotationPoint(0.5F, -15F, -1.5F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 51
        gunModel[45].setRotationPoint(0.5F, -14.5F, -1.5F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F); // Box 52
        gunModel[46].setRotationPoint(0.5F, -14F, -1.5F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 30, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
        gunModel[47].setRotationPoint(-13F, -19F, -2F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 30, 1, 4, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
        gunModel[48].setRotationPoint(-13F, -20F, -2F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 30, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 55
        gunModel[49].setRotationPoint(-13F, -16F, -2F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 56
        gunModel[50].setRotationPoint(10F, -18.5F, -2F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 57
        gunModel[51].setRotationPoint(10F, -18F, -2F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F); // Box 58
        gunModel[52].setRotationPoint(10F, -17.5F, -2F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 59
        gunModel[53].setRotationPoint(2F, -18.5F, -2F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 60
        gunModel[54].setRotationPoint(2F, -18F, -2F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F); // Box 61
        gunModel[55].setRotationPoint(2F, -17.5F, -2F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 62
        gunModel[56].setRotationPoint(-6F, -18F, -2F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F); // Box 63
        gunModel[57].setRotationPoint(-6F, -17.5F, -2F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 64
        gunModel[58].setRotationPoint(-6F, -18.5F, -2F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 68
        gunModel[59].setRotationPoint(-13.5F, -16F, -2F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 69
        gunModel[60].setRotationPoint(-13.5F, -19F, -2F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 70
        gunModel[61].setRotationPoint(-13.5F, -20F, -2F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 71
        gunModel[62].setRotationPoint(-14F, -19F, -2F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 72
        gunModel[63].setRotationPoint(-14F, -20F, -2F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 73
        gunModel[64].setRotationPoint(-14F, -16F, -2F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
        gunModel[65].setRotationPoint(-15F, -19F, -2F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 75
        gunModel[66].setRotationPoint(-15F, -20F, -2F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 76
        gunModel[67].setRotationPoint(-15F, -16F, -2F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 77
        gunModel[68].setRotationPoint(-12.5F, -20.5F, -0.5F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0.5F); // Box 78
        gunModel[69].setRotationPoint(-8.5F, -20.5F, -0.5F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.75F, -0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, -0.75F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -0.25F); // Box 79
        gunModel[70].setRotationPoint(-13.5F, -20.5F, -0.5F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.25F, 0F, -0.1F); // Box 80
        gunModel[71].setRotationPoint(-11.5F, -20.5F, -0.5F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.1F, -0.5F, -0.6F, -0.35F, -0.5F, -0.6F, -0.35F, -0.25F, -0.5F, -0.1F, -0.25F, 0F, -0.1F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.25F, 0F, -0.1F); // Box 81
        gunModel[72].setRotationPoint(-11.25F, -20.5F, -0.5F);

        gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.6F, -0.35F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.5F, -0.6F, -0.35F, -0.5F, 0F, -0.35F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.5F, 0F, -0.35F); // Box 82
        gunModel[73].setRotationPoint(-12F, -20.5F, -0.5F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.6F, -0.35F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.5F, -0.6F, -0.35F, -0.5F, 0F, -0.35F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.5F, 0F, -0.35F); // Box 83
        gunModel[74].setRotationPoint(-11F, -20.5F, -0.5F);

        gunModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.25F, 0F, -0.1F); // Box 84
        gunModel[75].setRotationPoint(-10.5F, -20.5F, -0.5F);

        gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.1F, -0.5F, -0.6F, -0.35F, -0.5F, -0.6F, -0.35F, -0.25F, -0.5F, -0.1F, -0.25F, 0F, -0.1F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.25F, 0F, -0.1F); // Box 85
        gunModel[76].setRotationPoint(-10.25F, -20.5F, -0.5F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 90
        gunModel[77].setRotationPoint(12F, -18.5F, 1.5F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
        gunModel[78].setRotationPoint(17F, -18F, -2F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 99
        gunModel[79].setRotationPoint(17F, -16F, -2F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        gunModel[80].setRotationPoint(25.25F, -22F, 0.8F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
        gunModel[81].setRotationPoint(25.25F, -22.5F, 0.8F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
        gunModel[82].setRotationPoint(25.25F, -22F, -2.8F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
        gunModel[83].setRotationPoint(25.25F, -22.5F, -2.8F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
        gunModel[84].setRotationPoint(-13F, -17F, -3F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
        gunModel[85].setRotationPoint(-13F, -18F, -3F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
        gunModel[86].setRotationPoint(-5F, -18F, -3F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 143
        gunModel[87].setRotationPoint(-13F, -17F, -3F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 144
        gunModel[88].setRotationPoint(-12F, -17F, -3F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 145
        gunModel[89].setRotationPoint(-11F, -17F, -3F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 146
        gunModel[90].setRotationPoint(-8F, -17F, -3F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 147
        gunModel[91].setRotationPoint(-9F, -17F, -3F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 148
        gunModel[92].setRotationPoint(-10F, -17F, -3F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 151
        gunModel[93].setRotationPoint(-4F, -17F, -3F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 152
        gunModel[94].setRotationPoint(-5F, -17F, -3F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 153
        gunModel[95].setRotationPoint(-6F, -17F, -3F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 154
        gunModel[96].setRotationPoint(-7F, -17F, -3F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 168
        gunModel[97].setRotationPoint(2F, -17F, -3F);

        gunModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 169
        gunModel[98].setRotationPoint(1F, -17F, -3F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 170
        gunModel[99].setRotationPoint(0F, -17F, -3F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 171
        gunModel[100].setRotationPoint(-1F, -17F, -3F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 172
        gunModel[101].setRotationPoint(-2F, -17F, -3F);

        gunModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 173
        gunModel[102].setRotationPoint(-3F, -17F, -3F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
        gunModel[103].setRotationPoint(3F, -18F, -3F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 186
        gunModel[104].setRotationPoint(23F, -17F, -2F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F); // Box 187
        gunModel[105].setRotationPoint(23F, -16.5F, -2F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 188
        gunModel[106].setRotationPoint(23F, -17.5F, -2F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 7, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
        gunModel[107].setRotationPoint(25F, -19.5F, -2.5F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 198
        gunModel[108].setRotationPoint(32F, -20F, -2.5F);

        gunModel[109].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 199
        gunModel[109].setRotationPoint(32F, -20F, 1.5F);

        gunModel[110].addShapeBox(0F, 0F, 0F, 18, 1, 3, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 200
        gunModel[110].setRotationPoint(32F, -20.5F, -1.5F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 202
        gunModel[111].setRotationPoint(50F, -20F, 1.5F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 209
        gunModel[112].setRotationPoint(44F, -18F, 1.5F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 210
        gunModel[113].setRotationPoint(44F, -19F, 1.5F);

        gunModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 211
        gunModel[114].setRotationPoint(54F, -18F, 1.5F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 212
        gunModel[115].setRotationPoint(54F, -19F, 1.5F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 213
        gunModel[116].setRotationPoint(49F, -19F, 1.5F);

        gunModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 214
        gunModel[117].setRotationPoint(49F, -18F, 1.5F);

        gunModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 217
        gunModel[118].setRotationPoint(44F, -18F, -2.5F);

        gunModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 218
        gunModel[119].setRotationPoint(44F, -19F, -2.5F);

        gunModel[120].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 219
        gunModel[120].setRotationPoint(54F, -18F, -2.5F);

        gunModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 220
        gunModel[121].setRotationPoint(54F, -19F, -2.5F);

        gunModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 221
        gunModel[122].setRotationPoint(49F, -19F, -2.5F);

        gunModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 222
        gunModel[123].setRotationPoint(49F, -18F, -2.5F);

        gunModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 223
        gunModel[124].setRotationPoint(59F, -19F, 1.5F);

        gunModel[125].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 224
        gunModel[125].setRotationPoint(59F, -18F, 1.5F);

        gunModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 225
        gunModel[126].setRotationPoint(64F, -18F, 1.5F);

        gunModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 226
        gunModel[127].setRotationPoint(64F, -19F, 1.5F);

        gunModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 229
        gunModel[128].setRotationPoint(67F, -19F, 1.5F);

        gunModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 230
        gunModel[129].setRotationPoint(67F, -18F, 1.5F);

        gunModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 231
        gunModel[130].setRotationPoint(64F, -18F, -2.5F);

        gunModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 232
        gunModel[131].setRotationPoint(64F, -19F, -2.5F);

        gunModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 233
        gunModel[132].setRotationPoint(67F, -19F, -2.5F);

        gunModel[133].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 234
        gunModel[133].setRotationPoint(67F, -18F, -2.5F);

        gunModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 235
        gunModel[134].setRotationPoint(59F, -19F, -2.5F);

        gunModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 236
        gunModel[135].setRotationPoint(59F, -18F, -2.5F);

        gunModel[136].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 237
        gunModel[136].setRotationPoint(50F, -20F, -2.5F);

        gunModel[137].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 219
        gunModel[137].setRotationPoint(50F, -20.5F, -1.5F);

        gunModel[138].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 220
        gunModel[138].setRotationPoint(50F, -20.5F, 0.5F);

        gunModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 227
        gunModel[139].setRotationPoint(49F, -20.5F, -1F);

        gunModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, -0.25F, -1F, -0.5F, -0.25F); // Box 228
        gunModel[140].setRotationPoint(49F, -20.5F, 0F);

        gunModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 229
        gunModel[141].setRotationPoint(54F, -20.5F, 0F);

        gunModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 230
        gunModel[142].setRotationPoint(54F, -20.5F, -1F);

        gunModel[143].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 231
        gunModel[143].setRotationPoint(59F, -20.5F, -1F);

        gunModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 232
        gunModel[144].setRotationPoint(59F, -20.5F, 0F);

        gunModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 233
        gunModel[145].setRotationPoint(64F, -20.5F, 0F);

        gunModel[146].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 234
        gunModel[146].setRotationPoint(64F, -20.5F, -1F);

        gunModel[147].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 239
        gunModel[147].setRotationPoint(67F, -20.5F, 0F);

        gunModel[148].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 240
        gunModel[148].setRotationPoint(67F, -20.5F, -1F);

        gunModel[149].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 259
        gunModel[149].setRotationPoint(69F, -20F, -2.5F);

        gunModel[150].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 260
        gunModel[150].setRotationPoint(69F, -20F, 1.5F);

        gunModel[151].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
        gunModel[151].setRotationPoint(69F, -19.5F, -1.5F);

        gunModel[152].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
        gunModel[152].setRotationPoint(74F, -20F, -1F);

        gunModel[153].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 263
        gunModel[153].setRotationPoint(74F, -20F, 1F);

        gunModel[154].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
        gunModel[154].setRotationPoint(74F, -20F, -2F);

        gunModel[155].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 265
        gunModel[155].setRotationPoint(75F, -20F, -1F);

        gunModel[156].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F); // Box 267
        gunModel[156].setRotationPoint(75F, -20F, 1F);

        gunModel[157].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
        gunModel[157].setRotationPoint(80F, -20F, -1F);

        gunModel[158].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
        gunModel[158].setRotationPoint(80F, -20F, -2F);

        gunModel[159].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 271
        gunModel[159].setRotationPoint(80F, -20F, 1F);

        gunModel[160].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 272
        gunModel[160].setRotationPoint(81F, -20F, -1F);

        gunModel[161].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 273
        gunModel[161].setRotationPoint(81F, -20F, 1F);

        gunModel[162].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 274
        gunModel[162].setRotationPoint(81F, -20F, -2F);

        gunModel[163].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 275
        gunModel[163].setRotationPoint(75F, -20F, -2F);

        gunModel[164].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F); // Box 276
        gunModel[164].setRotationPoint(82F, -20F, -1F);

        gunModel[165].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0.25F, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0.25F); // Box 278
        gunModel[165].setRotationPoint(82F, -20F, 1F);

        gunModel[166].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0.25F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.25F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F); // Box 279
        gunModel[166].setRotationPoint(82F, -20F, -2F);

        gunModel[167].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F); // Box 280
        gunModel[167].setRotationPoint(82.25F, -20F, -1F);

        gunModel[168].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0.25F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.25F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F); // Box 281
        gunModel[168].setRotationPoint(82.25F, -20F, -2F);

        gunModel[169].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0.25F, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0.25F); // Box 282
        gunModel[169].setRotationPoint(82.25F, -20F, 1F);

        gunModel[170].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F); // Box 283
        gunModel[170].setRotationPoint(82.5F, -20F, -1F);

        gunModel[171].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0.25F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.25F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F); // Box 284
        gunModel[171].setRotationPoint(82.5F, -20F, -2F);

        gunModel[172].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0.25F, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0.25F); // Box 285
        gunModel[172].setRotationPoint(82.5F, -20F, 1F);

        gunModel[173].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F); // Box 286
        gunModel[173].setRotationPoint(82.75F, -20F, -1F);

        gunModel[174].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0.25F, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0.25F); // Box 287
        gunModel[174].setRotationPoint(82.75F, -20F, 1F);

        gunModel[175].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0.25F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.25F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F); // Box 288
        gunModel[175].setRotationPoint(82.75F, -20F, -2F);

        gunModel[176].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
        gunModel[176].setRotationPoint(83F, -18.5F, -1F);

        gunModel[177].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
        gunModel[177].setRotationPoint(83F, -19.5F, -1F);

        gunModel[178].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 291
        gunModel[178].setRotationPoint(83F, -17.5F, -1F);

        gunModel[179].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
        gunModel[179].setRotationPoint(-26.5F, -19F, -2F);

        gunModel[180].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
        gunModel[180].setRotationPoint(-18.5F, -19F, -2F);

        gunModel[181].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F, 1.5F, -0.5F, -0.5F, -9F, 0F, -0.5F, -9F, 0F, -0.5F, 1.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 324
        gunModel[181].setRotationPoint(-26.5F, -21F, -2F);

        gunModel[182].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F); // Box 325
        gunModel[182].setRotationPoint(-26.5F, -16F, -2F);

        gunModel[183].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
        gunModel[183].setRotationPoint(-18.5F, -20F, -2F);

        gunModel[184].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F, 0F, 2.25F, -1.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 2.25F, -1.25F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F); // Box 327
        gunModel[184].setRotationPoint(-27.5F, -20F, -2F);

        gunModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 328
        gunModel[185].setRotationPoint(-28F, -22.5F, -1.5F);

        gunModel[186].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 329
        gunModel[186].setRotationPoint(-19.5F, -16F, -2F);

        gunModel[187].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 1.5F, -0.5F); // Box 330
        gunModel[187].setRotationPoint(-21.5F, -16F, -2F);

        gunModel[188].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -1.5F, -0.5F, 0.5F, -1.5F, -0.5F, 0F, 0F, -0.5F); // Box 331
        gunModel[188].setRotationPoint(-26.5F, -13F, -2F);

        gunModel[189].addShapeBox(0F, 0F, 0F, 34, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 349
        gunModel[189].setRotationPoint(35F, -18.5F, -0.5F);

        gunModel[190].addShapeBox(0F, 0F, 0F, 34, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 350
        gunModel[190].setRotationPoint(35F, -19F, -0.5F);

        gunModel[191].addShapeBox(0F, 0F, 0F, 34, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 351
        gunModel[191].setRotationPoint(35F, -18F, -0.5F);

        gunModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 202
        gunModel[192].setRotationPoint(40F, -20F, 1.5F);

        gunModel[193].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 203
        gunModel[193].setRotationPoint(40F, -17F, 1.5F);

        gunModel[194].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 237
        gunModel[194].setRotationPoint(40F, -20F, -2.5F);

        gunModel[195].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 238
        gunModel[195].setRotationPoint(40F, -17F, -2.5F);

        gunModel[196].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 202
        gunModel[196].setRotationPoint(42F, -20F, 1.5F);

        gunModel[197].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 237
        gunModel[197].setRotationPoint(42F, -20F, -2.5F);

        gunModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 209
        gunModel[198].setRotationPoint(39.25F, -18F, 1.5F);

        gunModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 210
        gunModel[199].setRotationPoint(39.25F, -19F, 1.5F);

        gunModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F); // Box 217
        gunModel[200].setRotationPoint(39.25F, -18F, -2.5F);

        gunModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 218
        gunModel[201].setRotationPoint(39.25F, -19F, -2.5F);

        gunModel[202].addShapeBox(0F, 0F, 0F, 37, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 200
        gunModel[202].setRotationPoint(32F, -16F, -1.5F);

        gunModel[203].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 189
        gunModel[203].setRotationPoint(25F, -20.5F, -2.5F);

        gunModel[204].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0.1F, 0F, 1.5F, 0.1F, 0F, 1.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 189
        gunModel[204].setRotationPoint(25F, -21F, -3F);

        gunModel[205].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 189
        gunModel[205].setRotationPoint(25F, -20F, -3F);

        gunModel[206].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F); // Box 189
        gunModel[206].setRotationPoint(25F, -18F, -3F);

        gunModel[207].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 189
        gunModel[207].setRotationPoint(25F, -16F, -3F);

        gunModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
        gunModel[208].setRotationPoint(31F, -19F, -3F);

        gunModel[209].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 189
        gunModel[209].setRotationPoint(29F, -16.5F, -2.5F);

        gunModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 109
        gunModel[210].setRotationPoint(16F, -19.5F, 2F);

        gunModel[211].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -0.4F, 0F, -0.95F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -0.4F, 0F, -0.95F, -0.4F); // Box 189
        gunModel[211].setRotationPoint(39F, -19.5F, 2.5F);

        gunModel[212].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.95F, -0.4F, 0F, -0.95F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -0.4F, 0F, -0.95F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
        gunModel[212].setRotationPoint(39F, -19.5F, -3.5F);

        gunModel[213].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 364
        gunModel[213].setRotationPoint(68F, -21.5F, -2F);

        gunModel[214].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 364
        gunModel[214].setRotationPoint(45F, -21.5F, -2F);

        gunModel[215].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -1F, -0.25F, 0F, -1F, -0.25F); // Box 364
        gunModel[215].setRotationPoint(71F, -19.8F, 3.05F);

        gunModel[216].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 364
        gunModel[216].setRotationPoint(65F, -19.8F, 2.8F);

        gunModel[217].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
        gunModel[217].setRotationPoint(65F, -18.8F, 2F);

        gunModel[218].addShapeBox(0F, 0F, 0F, 25, 1, 4, 0F, 0F, -0.6F, -0.75F, 2F, -0.6F, -0.75F, 2F, -0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, 0F, -1.25F, 2F, 0F, -1.25F, 2F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 364
        gunModel[218].setRotationPoint(45F, -22.5F, -2F);

        gunModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F); // Box 364
        gunModel[219].setRotationPoint(45F, -22.55F, -2F);

        gunModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F); // Box 364
        gunModel[220].setRotationPoint(47F, -22.55F, -2F);

        gunModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F); // Box 364
        gunModel[221].setRotationPoint(49F, -22.55F, -2F);

        gunModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F); // Box 364
        gunModel[222].setRotationPoint(51F, -22.55F, -2F);

        gunModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F); // Box 364
        gunModel[223].setRotationPoint(53F, -22.55F, -2F);

        gunModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F); // Box 364
        gunModel[224].setRotationPoint(55F, -22.55F, -2F);

        gunModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F); // Box 364
        gunModel[225].setRotationPoint(57F, -22.55F, -2F);

        gunModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F); // Box 364
        gunModel[226].setRotationPoint(59F, -22.55F, -2F);

        gunModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F); // Box 364
        gunModel[227].setRotationPoint(65F, -22.55F, -2F);

        gunModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F); // Box 364
        gunModel[228].setRotationPoint(67F, -22.55F, -2F);

        gunModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F); // Box 364
        gunModel[229].setRotationPoint(69F, -22.55F, -2F);

        gunModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F); // Box 364
        gunModel[230].setRotationPoint(61F, -22.55F, -2F);

        gunModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F); // Box 364
        gunModel[231].setRotationPoint(63F, -22.55F, -2F);

        gunModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F); // Box 364
        gunModel[232].setRotationPoint(71F, -22.55F, -2F);

        gunModel[233].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -1F, -0.25F, 0F, -1F, -0.25F); // Box 364
        gunModel[233].setRotationPoint(69F, -19.8F, 3.05F);

        gunModel[234].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -1F, -0.25F, 0F, -1F, -0.25F); // Box 364
        gunModel[234].setRotationPoint(67F, -19.8F, 3.05F);

        gunModel[235].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -1F, -0.25F, 0F, -1F, -0.25F); // Box 364
        gunModel[235].setRotationPoint(65F, -19.8F, 3.05F);

        gunModel[236].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F); // Box 364
        gunModel[236].setRotationPoint(71F, -19.8F, -4.05F);

        gunModel[237].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 364
        gunModel[237].setRotationPoint(65F, -19.8F, -3.8F);

        gunModel[238].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 364
        gunModel[238].setRotationPoint(65F, -18.8F, -3F);

        gunModel[239].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F); // Box 364
        gunModel[239].setRotationPoint(69F, -19.8F, -4.05F);

        gunModel[240].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F); // Box 364
        gunModel[240].setRotationPoint(67F, -19.8F, -4.05F);

        gunModel[241].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F); // Box 364
        gunModel[241].setRotationPoint(65F, -19.8F, -4.05F);


        defaultScopeModel = new ModelRendererTurbo[18];
        defaultScopeModel[0] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 292
        defaultScopeModel[1] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 293
        defaultScopeModel[2] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 294
        defaultScopeModel[3] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 295
        defaultScopeModel[4] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 296
        defaultScopeModel[5] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 297
        defaultScopeModel[6] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 298
        defaultScopeModel[7] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 299
        defaultScopeModel[8] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 300
        defaultScopeModel[9] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 301
        defaultScopeModel[10] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 301
        defaultScopeModel[11] = new ModelRendererTurbo(this, 3, 206, textureX, textureY); // Box 300
        defaultScopeModel[12] = new ModelRendererTurbo(this, 11, 206, textureX, textureY); // Box 300
        defaultScopeModel[13] = new ModelRendererTurbo(this, 19, 206, textureX, textureY); // Box 300
        defaultScopeModel[14] = new ModelRendererTurbo(this, 27, 206, textureX, textureY); // Box 300
        defaultScopeModel[15] = new ModelRendererTurbo(this, 35, 206, textureX, textureY); // Box 300
        defaultScopeModel[16] = new ModelRendererTurbo(this, 43, 206, textureX, textureY); // Box 300
        defaultScopeModel[17] = new ModelRendererTurbo(this, 51, 206, textureX, textureY); // Box 300

        defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, 0F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 292
        defaultScopeModel[0].setRotationPoint(32F, -21.5F, -1F);

        defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 293
        defaultScopeModel[1].setRotationPoint(32F, -21.5F, -1F);

        defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 294
        defaultScopeModel[2].setRotationPoint(32.5F, -22.5F, -1F);

        defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.75F, 1F, 0F); // Box 295
        defaultScopeModel[3].setRotationPoint(31.5F, -24.5F, -0.5F);

        defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 296
        defaultScopeModel[4].setRotationPoint(31.5F, -25.5F, -1F);

        defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F); // Box 297
        defaultScopeModel[5].setRotationPoint(31.5F, -26.5F, -1F);

        defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 298
        defaultScopeModel[6].setRotationPoint(31.5F, -26.5F, 0F);

        defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
        defaultScopeModel[7].setRotationPoint(78.5F, -25F, -0.5F);

        defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 300
        defaultScopeModel[8].setRotationPoint(78.5F, -26F, -0.5F);

        defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 4.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 4.5F, -0.5F, 0F, 4.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 4.5F, 0F, 0F); // Box 301
        defaultScopeModel[9].setRotationPoint(77.5F, -21.5F, -1F);

        defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 301
        defaultScopeModel[10].setRotationPoint(80.75F, -21F, -1F);

        defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 300
        defaultScopeModel[11].setRotationPoint(78.5F, -26F, 0.5F);

        defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
        defaultScopeModel[12].setRotationPoint(78.5F, -26.5F, 0.5F);

        defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 300
        defaultScopeModel[13].setRotationPoint(78.5F, -27F, 0.5F);

        defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 300
        defaultScopeModel[14].setRotationPoint(78.5F, -26F, -1.5F);

        defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 300
        defaultScopeModel[15].setRotationPoint(78.5F, -26.5F, -1.5F);

        defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 300
        defaultScopeModel[16].setRotationPoint(78.5F, -27F, -1.5F);

        defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 300
        defaultScopeModel[17].setRotationPoint(78.5F, -27.5F, -0.5F);


        defaultGripModel = new ModelRendererTurbo[21];
        defaultGripModel[0] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 302
        defaultGripModel[1] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 303
        defaultGripModel[2] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 304
        defaultGripModel[3] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 305
        defaultGripModel[4] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 306
        defaultGripModel[5] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 307
        defaultGripModel[6] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 308
        defaultGripModel[7] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 309
        defaultGripModel[8] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 310
        defaultGripModel[9] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 311
        defaultGripModel[10] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 312
        defaultGripModel[11] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 313
        defaultGripModel[12] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 314
        defaultGripModel[13] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 315
        defaultGripModel[14] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 316
        defaultGripModel[15] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 317
        defaultGripModel[16] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 318
        defaultGripModel[17] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 319
        defaultGripModel[18] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 320
        defaultGripModel[19] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 321
        defaultGripModel[20] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 303

        defaultGripModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
        defaultGripModel[0].setRotationPoint(72F, -14.5F, -1.5F);

        defaultGripModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
        defaultGripModel[1].setRotationPoint(72F, -15.5F, -1.5F);

        defaultGripModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 304
        defaultGripModel[2].setRotationPoint(71.5F, -13.5F, -0.5F);

        defaultGripModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 305
        defaultGripModel[3].setRotationPoint(71.5F, -14F, -0.5F);

        defaultGripModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 306
        defaultGripModel[4].setRotationPoint(71.5F, -13F, -0.5F);

        defaultGripModel[5].addShapeBox(0F, 0F, 0F, 2, 25, 2, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 12F, 0.25F, 0F, 12F, 0.25F, 0F, -12F, 0.25F, 0F, -12F); // Box 307
        defaultGripModel[5].setRotationPoint(72F, -13.5F, -1.5F);

        defaultGripModel[6].addShapeBox(0F, 0F, 0F, 2, 25, 2, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -12F, 0.25F, 0F, -12F, 0.25F, 0F, 12F, 0.25F, 0F, 12F); // Box 308
        defaultGripModel[6].setRotationPoint(72F, -13.5F, -0.5F);

        defaultGripModel[7].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
        defaultGripModel[7].setRotationPoint(72F, -12.5F, -1F);

        defaultGripModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 310
        defaultGripModel[8].setRotationPoint(72.5F, -9.5F, -0.5F);

        defaultGripModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F); // Box 311
        defaultGripModel[9].setRotationPoint(73F, -9.5F, -0.5F);

        defaultGripModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F); // Box 312
        defaultGripModel[10].setRotationPoint(72F, -9.5F, -0.5F);

        defaultGripModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
        defaultGripModel[11].setRotationPoint(72.5F, -7.5F, -1F);

        defaultGripModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 314
        defaultGripModel[12].setRotationPoint(73.5F, -7.5F, -1F);

        defaultGripModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 315
        defaultGripModel[13].setRotationPoint(71.5F, -7.5F, -1F);

        defaultGripModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, -2F, 0.25F, 0F, -2F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, -1F, 0F, 0.25F, -1F, 0F); // Box 316
        defaultGripModel[14].setRotationPoint(72F, 11.5F, -17.5F);

        defaultGripModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.25F, 0F, -2F, 0.25F, 0F, -2F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0.25F); // Box 317
        defaultGripModel[15].setRotationPoint(72F, 11.5F, 11.5F);

        defaultGripModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.75F, -1F, 0F, 0.75F, -1F, 0F); // Box 318
        defaultGripModel[16].setRotationPoint(72.5F, 11.5F, -16.5F);

        defaultGripModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0.75F, -1F, 0F, 0.75F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 319
        defaultGripModel[17].setRotationPoint(72.5F, 11.5F, 13.5F);

        defaultGripModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -1F, -0.25F, 0F, -1F); // Box 320
        defaultGripModel[18].setRotationPoint(72.5F, 12.5F, -16.5F);

        defaultGripModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -2F, -0.25F, 0F, -2F); // Box 321
        defaultGripModel[19].setRotationPoint(72.5F, 12.5F, 13.5F);

        defaultGripModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 303
        defaultGripModel[20].setRotationPoint(72F, -16F, -1.5F);


        ammoModel = new ModelRendererTurbo[33];
        ammoModel[0] = new ModelRendererTurbo(this, 20, 168, textureX, textureY); // Box 356
        ammoModel[1] = new ModelRendererTurbo(this, 50, 167, textureX, textureY); // Box 357
        ammoModel[2] = new ModelRendererTurbo(this, 20, 168, textureX, textureY); // Box 358
        ammoModel[3] = new ModelRendererTurbo(this, 50, 167, textureX, textureY); // Box 359
        ammoModel[4] = new ModelRendererTurbo(this, 20, 168, textureX, textureY); // Box 360
        ammoModel[5] = new ModelRendererTurbo(this, 50, 167, textureX, textureY); // Box 361
        ammoModel[6] = new ModelRendererTurbo(this, 20, 168, textureX, textureY); // Box 362
        ammoModel[7] = new ModelRendererTurbo(this, 50, 167, textureX, textureY); // Box 363
        ammoModel[8] = new ModelRendererTurbo(this, 20, 168, textureX, textureY); // Box 364
        ammoModel[9] = new ModelRendererTurbo(this, 50, 167, textureX, textureY); // Box 365
        ammoModel[10] = new ModelRendererTurbo(this, 20, 180, textureX, textureY); // Box 367
        ammoModel[11] = new ModelRendererTurbo(this, 20, 180, textureX, textureY); // Box 368
        ammoModel[12] = new ModelRendererTurbo(this, 20, 180, textureX, textureY); // Box 369
        ammoModel[13] = new ModelRendererTurbo(this, 20, 180, textureX, textureY); // Box 372
        ammoModel[14] = new ModelRendererTurbo(this, 20, 168, textureX, textureY); // Box 356
        ammoModel[15] = new ModelRendererTurbo(this, 50, 167, textureX, textureY); // Box 357
        ammoModel[16] = new ModelRendererTurbo(this, 20, 180, textureX, textureY); // Box 372
        ammoModel[17] = new ModelRendererTurbo(this, 20, 168, textureX, textureY); // Box 356
        ammoModel[18] = new ModelRendererTurbo(this, 50, 167, textureX, textureY); // Box 357
        ammoModel[19] = new ModelRendererTurbo(this, 20, 180, textureX, textureY); // Box 372
        ammoModel[20] = new ModelRendererTurbo(this, 70, 162, textureX, textureY); // Box 189
        ammoModel[21] = new ModelRendererTurbo(this, 86, 162, textureX, textureY); // Box 189
        ammoModel[22] = new ModelRendererTurbo(this, 110, 162, textureX, textureY); // Box 189
        ammoModel[23] = new ModelRendererTurbo(this, 70, 162, textureX, textureY); // Box 189
        ammoModel[24] = new ModelRendererTurbo(this, 134, 162, textureX, textureY); // Box 189
        ammoModel[25] = new ModelRendererTurbo(this, 94, 170, textureX, textureY); // Box 189
        ammoModel[26] = new ModelRendererTurbo(this, 118, 170, textureX, textureY); // Box 189
        ammoModel[27] = new ModelRendererTurbo(this, 70, 186, textureX, textureY); // Box 189
        ammoModel[28] = new ModelRendererTurbo(this, 70, 194, textureX, textureY); // Box 189
        ammoModel[29] = new ModelRendererTurbo(this, 94, 170, textureX, textureY); // Box 189
        ammoModel[30] = new ModelRendererTurbo(this, 110, 170, textureX, textureY); // Box 189
        ammoModel[31] = new ModelRendererTurbo(this, 94, 194, textureX, textureY); // Box 189
        ammoModel[32] = new ModelRendererTurbo(this, 70, 204, textureX, textureY); // Box 189

        ammoModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
        ammoModel[0].setRotationPoint(17.25F, -17.5F, 3.25F);

        ammoModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 357
        ammoModel[1].setRotationPoint(21.25F, -17.5F, 3.25F);

        ammoModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
        ammoModel[2].setRotationPoint(17.5F, -18.75F, 3F);

        ammoModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 359
        ammoModel[3].setRotationPoint(21.5F, -18.75F, 3F);

        ammoModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
        ammoModel[4].setRotationPoint(17.5F, -20F, 1F);

        ammoModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 361
        ammoModel[5].setRotationPoint(21.5F, -20F, 1F);

        ammoModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
        ammoModel[6].setRotationPoint(17.5F, -20F, 2.5F);

        ammoModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 363
        ammoModel[7].setRotationPoint(21.5F, -20F, 2.5F);

        ammoModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
        ammoModel[8].setRotationPoint(17.5F, -20F, -0.5F);

        ammoModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 365
        ammoModel[9].setRotationPoint(21.5F, -20F, -0.5F);

        ammoModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 367
        ammoModel[10].setRotationPoint(19F, -20F, -0.5F);

        ammoModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 368
        ammoModel[11].setRotationPoint(19F, -18.75F, 3F);

        ammoModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
        ammoModel[12].setRotationPoint(19F, -20F, -3.5F);

        ammoModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 372
        ammoModel[13].setRotationPoint(18.75F, -17.5F, 3.25F);

        ammoModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
        ammoModel[14].setRotationPoint(17F, -16.25F, 2.75F);

        ammoModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 357
        ammoModel[15].setRotationPoint(21F, -16.25F, 2.75F);

        ammoModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 372
        ammoModel[16].setRotationPoint(18.5F, -16.25F, 2.75F);

        ammoModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
        ammoModel[17].setRotationPoint(16.75F, -15F, 2.25F);

        ammoModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 357
        ammoModel[18].setRotationPoint(20.75F, -15F, 2.5F);

        ammoModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 372
        ammoModel[19].setRotationPoint(18.25F, -15F, 2.25F);

        ammoModel[20].addShapeBox(0F, 0F, 0F, 2, 12, 8, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 189
        ammoModel[20].setRotationPoint(14.5F, -14.5F, -4F);

        ammoModel[21].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 189
        ammoModel[21].setRotationPoint(14.5F, -14.5F, 4F);

        ammoModel[22].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, -0.5F, -1F, 0F); // Box 189
        ammoModel[22].setRotationPoint(14.5F, -5.5F, 4F);

        ammoModel[23].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 189
        ammoModel[23].setRotationPoint(14.5F, -10.5F, 4F);

        ammoModel[24].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 189
        ammoModel[24].setRotationPoint(18.5F, -10.5F, 4F);

        ammoModel[25].addShapeBox(0F, 0F, 0F, 2, 12, 8, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 189
        ammoModel[25].setRotationPoint(22.5F, -14.5F, -4F);

        ammoModel[26].addShapeBox(0F, 0F, 0F, 6, 10, 8, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 189
        ammoModel[26].setRotationPoint(16.5F, -12.5F, -4F);

        ammoModel[27].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 189
        ammoModel[27].setRotationPoint(14.5F, -14.5F, -5F);

        ammoModel[28].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 189
        ammoModel[28].setRotationPoint(14.5F, -5.5F, -5F);

        ammoModel[29].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 189
        ammoModel[29].setRotationPoint(14.5F, -10.5F, -5F);

        ammoModel[30].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 189
        ammoModel[30].setRotationPoint(18.5F, -10.5F, -5F);

        ammoModel[31].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 189
        ammoModel[31].setRotationPoint(16.5F, -14.5F, -4F);

        ammoModel[32].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 189
        ammoModel[32].setRotationPoint(15F, -15.5F, -5F);


        slideModel = new ModelRendererTurbo[8];
        slideModel[0] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 156
        slideModel[1] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 157
        slideModel[2] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 158
        slideModel[3] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 159
        slideModel[4] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 160
        slideModel[5] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 175
        slideModel[6] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 176
        slideModel[7] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 177

        slideModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
        slideModel[0].setRotationPoint(3F, -17F, -4F);

        slideModel[1].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 157
        slideModel[1].setRotationPoint(3.5F, -17.5F, -4.5F);

        slideModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
        slideModel[2].setRotationPoint(6.5F, -17F, -4F);

        slideModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, -0.5F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1F, -0.5F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 1F); // Box 159
        slideModel[3].setRotationPoint(7.5F, -17F, -5F);

        slideModel[4].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
        slideModel[4].setRotationPoint(8.5F, -20F, -6.5F);

        slideModel[5].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.85F); // Box 175
        slideModel[5].setRotationPoint(8.5F, -20F, -4.5F);

        slideModel[6].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, -0.85F, 0F, -0.25F, -0.85F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, -0.25F, -0.85F, 0F, -0.25F, 0F, 0F, 0F); // Box 176
        slideModel[6].setRotationPoint(9.5F, -20F, -5.5F);

        slideModel[7].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -0.85F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, -0.25F, -0.85F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, -0.25F); // Box 177
        slideModel[7].setRotationPoint(7.5F, -20F, -5.5F);


        breakActionModel = new ModelRendererTurbo[62];
        breakActionModel[0] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 86
        breakActionModel[1] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 87
        breakActionModel[2] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 91
        breakActionModel[3] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 92
        breakActionModel[4] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 93
        breakActionModel[5] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 94
        breakActionModel[6] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 95
        breakActionModel[7] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 96
        breakActionModel[8] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 107
        breakActionModel[9] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 108
        breakActionModel[10] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 109
        breakActionModel[11] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 111
        breakActionModel[12] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 112
        breakActionModel[13] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 113
        breakActionModel[14] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 114
        breakActionModel[15] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 115
        breakActionModel[16] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 122
        breakActionModel[17] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 123
        breakActionModel[18] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 124
        breakActionModel[19] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 125
        breakActionModel[20] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 126
        breakActionModel[21] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 127
        breakActionModel[22] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 128
        breakActionModel[23] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 129
        breakActionModel[24] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 130
        breakActionModel[25] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 131
        breakActionModel[26] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 134
        breakActionModel[27] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 135
        breakActionModel[28] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 178
        breakActionModel[29] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 179
        breakActionModel[30] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 180
        breakActionModel[31] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 181
        breakActionModel[32] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 182
        breakActionModel[33] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 183
        breakActionModel[34] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 184
        breakActionModel[35] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 185
        breakActionModel[36] = new ModelRendererTurbo(this, 155, 171, textureX, textureY); // Box 109
        breakActionModel[37] = new ModelRendererTurbo(this, 179, 171, textureX, textureY); // Box 109
        breakActionModel[38] = new ModelRendererTurbo(this, 3, 222, textureX, textureY); // Box 88
        breakActionModel[39] = new ModelRendererTurbo(this, 43, 222, textureX, textureY); // Box 89
        breakActionModel[40] = new ModelRendererTurbo(this, 83, 222, textureX, textureY); // Box 88
        breakActionModel[41] = new ModelRendererTurbo(this, 107, 222, textureX, textureY); // Box 89
        breakActionModel[42] = new ModelRendererTurbo(this, 131, 222, textureX, textureY); // Box 88
        breakActionModel[43] = new ModelRendererTurbo(this, 155, 222, textureX, textureY); // Box 89
        breakActionModel[44] = new ModelRendererTurbo(this, 179, 222, textureX, textureY); // Box 364
        breakActionModel[45] = new ModelRendererTurbo(this, 243, 222, textureX, textureY); // Box 364
        breakActionModel[46] = new ModelRendererTurbo(this, 227, 230, textureX, textureY); // Box 364
        breakActionModel[47] = new ModelRendererTurbo(this, 3, 238, textureX, textureY); // Box 364
        breakActionModel[48] = new ModelRendererTurbo(this, 180, 193, textureX, textureY); // Box 88
        breakActionModel[49] = new ModelRendererTurbo(this, 196, 193, textureX, textureY); // Box 89
        breakActionModel[50] = new ModelRendererTurbo(this, 243, 222, textureX, textureY); // Box 364
        breakActionModel[51] = new ModelRendererTurbo(this, 243, 222, textureX, textureY); // Box 364
        breakActionModel[52] = new ModelRendererTurbo(this, 243, 222, textureX, textureY); // Box 364
        breakActionModel[53] = new ModelRendererTurbo(this, 243, 222, textureX, textureY); // Box 364
        breakActionModel[54] = new ModelRendererTurbo(this, 243, 222, textureX, textureY); // Box 364
        breakActionModel[55] = new ModelRendererTurbo(this, 243, 222, textureX, textureY); // Box 364
        breakActionModel[56] = new ModelRendererTurbo(this, 243, 222, textureX, textureY); // Box 364
        breakActionModel[57] = new ModelRendererTurbo(this, 243, 222, textureX, textureY); // Box 364
        breakActionModel[58] = new ModelRendererTurbo(this, 243, 222, textureX, textureY); // Box 364
        breakActionModel[59] = new ModelRendererTurbo(this, 243, 222, textureX, textureY); // Box 364
        breakActionModel[60] = new ModelRendererTurbo(this, 243, 222, textureX, textureY); // Box 364
        breakActionModel[61] = new ModelRendererTurbo(this, 243, 222, textureX, textureY); // Box 364

        breakActionModel[0].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
        breakActionModel[0].setRotationPoint(-7.5F, -19.5F, -2.5F);

        breakActionModel[1].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
        breakActionModel[1].setRotationPoint(-7.5F, -20.5F, -2.5F);

        breakActionModel[2].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
        breakActionModel[2].setRotationPoint(14F, -21.75F, -2F);

        breakActionModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 92
        breakActionModel[3].setRotationPoint(13F, -21.75F, -2F);

        breakActionModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F); // Box 93
        breakActionModel[4].setRotationPoint(12F, -21.75F, -1.5F);

        breakActionModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.6F, -0.35F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.5F, -0.6F, -0.35F, -0.5F, 0F, -0.35F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.5F, 0F, -0.35F); // Box 94
        breakActionModel[5].setRotationPoint(13F, -22.5F, -1F);

        breakActionModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.25F, 0F, -0.1F); // Box 95
        breakActionModel[6].setRotationPoint(13.5F, -22.5F, -1F);

        breakActionModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.1F, -0.5F, -0.6F, -0.35F, -0.5F, -0.6F, -0.35F, -0.25F, -0.5F, -0.1F, -0.25F, 0F, -0.1F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.25F, 0F, -0.1F); // Box 96
        breakActionModel[7].setRotationPoint(13.75F, -22.5F, -1F);

        breakActionModel[8].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
        breakActionModel[8].setRotationPoint(17F, -21.5F, -2.5F);

        breakActionModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F); // Box 108
        breakActionModel[9].setRotationPoint(16.5F, -21.5F, 3.5F);

        breakActionModel[10].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 109
        breakActionModel[10].setRotationPoint(17F, -21.5F, 2.5F);

        breakActionModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Box 111
        breakActionModel[11].setRotationPoint(16.5F, -21.5F, 3.5F);

        breakActionModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Box 112
        breakActionModel[12].setRotationPoint(20.5F, -21.5F, 3.5F);

        breakActionModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F); // Box 113
        breakActionModel[13].setRotationPoint(20.5F, -21.5F, 3.5F);

        breakActionModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Box 114
        breakActionModel[14].setRotationPoint(23F, -21.5F, 3.5F);

        breakActionModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F); // Box 115
        breakActionModel[15].setRotationPoint(23F, -21.5F, 3.5F);

        breakActionModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F); // Box 122
        breakActionModel[16].setRotationPoint(20F, -21.75F, -2.5F);

        breakActionModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.75F, 0F, 0F, -0.5F); // Box 123
        breakActionModel[17].setRotationPoint(20F, -21.75F, 0.5F);

        breakActionModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
        breakActionModel[18].setRotationPoint(18F, -21.75F, 2F);

        breakActionModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 125
        breakActionModel[19].setRotationPoint(18F, -21.75F, 3F);

        breakActionModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.6F, -0.35F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.5F, -0.6F, -0.35F, -0.5F, 0F, -0.35F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.5F, 0F, -0.35F); // Box 126
        breakActionModel[20].setRotationPoint(18F, -22.5F, -1F);

        breakActionModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.25F, 0F, -0.1F); // Box 127
        breakActionModel[21].setRotationPoint(18.5F, -22.5F, -1F);

        breakActionModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.1F, -0.5F, -0.6F, -0.35F, -0.5F, -0.6F, -0.35F, -0.25F, -0.5F, -0.1F, -0.25F, 0F, -0.1F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.25F, 0F, -0.1F); // Box 128
        breakActionModel[22].setRotationPoint(18.75F, -22.5F, -1F);

        breakActionModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.6F, -0.35F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.5F, -0.6F, -0.35F, -0.5F, 0F, -0.35F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.5F, 0F, -0.35F); // Box 129
        breakActionModel[23].setRotationPoint(18F, -22.5F, 2F);

        breakActionModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.25F, 0F, -0.1F); // Box 130
        breakActionModel[24].setRotationPoint(18.5F, -22.5F, 2F);

        breakActionModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.1F, -0.5F, -0.6F, -0.35F, -0.5F, -0.6F, -0.35F, -0.25F, -0.5F, -0.1F, -0.25F, 0F, -0.1F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.25F, 0F, -0.1F); // Box 131
        breakActionModel[25].setRotationPoint(18.75F, -22.5F, 2F);

        breakActionModel[26].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
        breakActionModel[26].setRotationPoint(21F, -20.5F, -2.5F);

        breakActionModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F); // Box 135
        breakActionModel[27].setRotationPoint(25F, -21.5F, -0.5F);

        breakActionModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.5F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 178
        breakActionModel[28].setRotationPoint(-7.5F, -21F, -0.5F);

        breakActionModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0.25F); // Box 179
        breakActionModel[29].setRotationPoint(-3.5F, -21F, -0.5F);

        breakActionModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 180
        breakActionModel[30].setRotationPoint(-8F, -21.25F, -0.5F);

        breakActionModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 181
        breakActionModel[31].setRotationPoint(-7.5F, -22.25F, -1.5F);

        breakActionModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, -0.25F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, 0F, -0.25F, 0.25F); // Box 182
        breakActionModel[32].setRotationPoint(-6.75F, -21.25F, -1.5F);

        breakActionModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 183
        breakActionModel[33].setRotationPoint(-4F, -21F, -0.5F);

        breakActionModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 184
        breakActionModel[34].setRotationPoint(-4F, -21F, -0.5F);

        breakActionModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 185
        breakActionModel[35].setRotationPoint(-8F, -21.25F, -1.5F);

        breakActionModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
        breakActionModel[36].setRotationPoint(25F, -20.5F, 2.5F);

        breakActionModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 109
        breakActionModel[37].setRotationPoint(16F, -20.5F, 2.5F);

        breakActionModel[38].addShapeBox(0F, 0F, 0F, 12, 3, 5, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 88
        breakActionModel[38].setRotationPoint(5.5F, -21.5F, -2.5F);

        breakActionModel[39].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F, 0F, 1F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 89
        breakActionModel[39].setRotationPoint(5.5F, -20.5F, -2.5F);

        breakActionModel[40].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 88
        breakActionModel[40].setRotationPoint(3F, -20.5F, -2.5F);

        breakActionModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, 0F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F); // Box 89
        breakActionModel[41].setRotationPoint(3F, -20.5F, -2.5F);

        breakActionModel[42].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 88
        breakActionModel[42].setRotationPoint(-2.5F, -20.5F, -2.5F);

        breakActionModel[43].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F, -1F, 1F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, -1F, 1F, -0.5F, -1F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -1F, -1.5F, 0F); // Box 89
        breakActionModel[43].setRotationPoint(-2.5F, -19.5F, -2.5F);

        breakActionModel[44].addShapeBox(0F, 0F, 0F, 25, 1, 4, 0F, 0F, -0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 364
        breakActionModel[44].setRotationPoint(0F, -23F, -2F);

        breakActionModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F); // Box 364
        breakActionModel[45].setRotationPoint(0F, -23.05F, -2F);

        breakActionModel[46].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 364
        breakActionModel[46].setRotationPoint(21F, -22F, -2F);

        breakActionModel[47].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, 0F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 364
        breakActionModel[47].setRotationPoint(0F, -22F, -2F);

        breakActionModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 88
        breakActionModel[48].setRotationPoint(-3.5F, -20.5F, -2.5F);

        breakActionModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, -1F, 0.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, -1F, 0.5F, -0.5F, -1F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F); // Box 89
        breakActionModel[49].setRotationPoint(-3.5F, -19.5F, -2.5F);

        breakActionModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F); // Box 364
        breakActionModel[50].setRotationPoint(2F, -23.05F, -2F);

        breakActionModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F); // Box 364
        breakActionModel[51].setRotationPoint(4F, -23.05F, -2F);

        breakActionModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F); // Box 364
        breakActionModel[52].setRotationPoint(6F, -23.05F, -2F);

        breakActionModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F); // Box 364
        breakActionModel[53].setRotationPoint(8F, -23.05F, -2F);

        breakActionModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F); // Box 364
        breakActionModel[54].setRotationPoint(10F, -23.05F, -2F);

        breakActionModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F); // Box 364
        breakActionModel[55].setRotationPoint(12F, -23.05F, -2F);

        breakActionModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F); // Box 364
        breakActionModel[56].setRotationPoint(14F, -23.05F, -2F);

        breakActionModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F); // Box 364
        breakActionModel[57].setRotationPoint(20F, -23.05F, -2F);

        breakActionModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F); // Box 364
        breakActionModel[58].setRotationPoint(22F, -23.05F, -2F);

        breakActionModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F); // Box 364
        breakActionModel[59].setRotationPoint(24F, -23.05F, -2F);

        breakActionModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F); // Box 364
        breakActionModel[60].setRotationPoint(16F, -23.05F, -2F);

        breakActionModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F, 0F, -0.35F, -0.75F); // Box 364
        breakActionModel[61].setRotationPoint(18F, -23.05F, -2F);


        barrelAttachPoint = new Vector3f(88F / 16F, 18F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(68.5F / 16F, 17.85F / 16F, -3.4F / 16F);
        scopeAttachPoint = new Vector3f(12F / 16F, 22.4F / 16F, 0F / 16F);
        gripAttachPoint = new Vector3f(54 / 16F, 15.5F / 16F, 0F / 16F);


        barrelBreakPoint = new Vector3f(20.75F / 16F, 21.4F / 16F, 0F / 16F);
        scopeIsOnBreakAction = true;
        defaultScopeIsOnBreakAction = false;
        ammoIsOnBreakAction = false;
        breakAngle = 70F;

        hasFlash = true;
        hasArms = true;
        animationType = EnumAnimationType.BREAK_ACTION;
        gunSlideDistance = 0.05F;
        tiltGun = 30.0F;

        translateGun = new Vector3f(0.0F, -0.0625F, -0.1875F);
        translateClip = new Vector3f(0.0F, -0.625F, 0.0F);
        leftArmPos = new Vector3f(0.05F, -0.4F, -0.1F);
        leftArmRot = new Vector3f(80.0F, 50.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.1F, -0.55F, 0.05F);
        leftArmReloadRot = new Vector3f(80.0F, 54.0F, 0.0F);
        rightArmPos = new Vector3f(0.21F, -0.37F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -87.0F);
        rightArmReloadPos = new Vector3f(0.21F, -0.37F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -87.0F);
        rightArmScale = new Vector3f(0.75D, 0.75D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.1D, 0.75D);

        rightHandAmmo = false;
        leftHandAmmo = true;

        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);

        casingAttachPoint = new Vector3f(1.5F, 1.2F, 0.0F);
        casingAnimDistance = new Vector3f(0.0F, 3.0F, 7.75F);
        casingAnimSpread = new Vector3f(2.0F, 2.5F, 2.0F);
        casingAnimTime = 2;
        casingRotateVector = new Vector3f(0.1F, 0.0F, 0.1F);
        caseScale = 0.2F;
        casingDelay = 0;

        flashScale = 0.4F;
        muzzleFlashPoint = new Vector3f(2.7F, 0.7F, 0.0F);

        thirdPersonOffset = new Vector3f(-0.1F, -0.05F, 0.0F);
        translateAll(0F, 0F, 0F);
        gunOffset = 0F;
        zoomOffset = 0.4F;

        //修正模型位移
        Vector3f vec3 = new Vector3f(-5F, 0F, 0F);
        translateAll(vec3.x, -vec3.y, vec3.z);
        Vector3f attVec = new Vector3f(vec3.x / 16F, vec3.y / 16F, vec3.z / 16F);
        barrelAttachPoint = Vector3f.add(barrelAttachPoint, attVec, null);
        gadgetAttachPoint = Vector3f.add(gadgetAttachPoint, attVec, null);
        scopeAttachPoint = Vector3f.add(scopeAttachPoint, attVec, null);
        gripAttachPoint = Vector3f.add(gripAttachPoint, attVec, null);
        stockAttachPoint = Vector3f.add(stockAttachPoint, attVec, null);
        zoomOffsetY = -0.09F;

        flashScale = 4F;
        muzzleFlashPoint = new Vector3f(
                88F / 16F / flashScale,
                18F / 16F / flashScale,
                0F / flashScale
        );

        flipAll();
    }
}