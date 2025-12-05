//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AK12U
// Model Creator: 
// Created on: 15.09.2019 - 15:18:34
// Last changed on: 15.09.2019 - 15:18:34

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelAK12U extends ModelGun //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public ModelAK12U() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[381];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        gunModel[1] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 1
        gunModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 3
        gunModel[3] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 4
        gunModel[4] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 4
        gunModel[5] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 5
        gunModel[6] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 6
        gunModel[7] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 7
        gunModel[8] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 8
        gunModel[9] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 9
        gunModel[10] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 10
        gunModel[11] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 11
        gunModel[12] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 20
        gunModel[13] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 21
        gunModel[14] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 22
        gunModel[15] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 23
        gunModel[16] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 24
        gunModel[17] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 26
        gunModel[18] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 27
        gunModel[19] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 28
        gunModel[20] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 29
        gunModel[21] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 30
        gunModel[22] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 31
        gunModel[23] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 33
        gunModel[24] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 34
        gunModel[25] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 35
        gunModel[26] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 36
        gunModel[27] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 37
        gunModel[28] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 38
        gunModel[29] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 39
        gunModel[30] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 40
        gunModel[31] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 41
        gunModel[32] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 42
        gunModel[33] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 43
        gunModel[34] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 44
        gunModel[35] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 45
        gunModel[36] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 47
        gunModel[37] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 48
        gunModel[38] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 49
        gunModel[39] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 50
        gunModel[40] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 51
        gunModel[41] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 52
        gunModel[42] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 53
        gunModel[43] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 54
        gunModel[44] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 56
        gunModel[45] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 57
        gunModel[46] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 58
        gunModel[47] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 59
        gunModel[48] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 60
        gunModel[49] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 61
        gunModel[50] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 62
        gunModel[51] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 63
        gunModel[52] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 65
        gunModel[53] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 66
        gunModel[54] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 67
        gunModel[55] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 68
        gunModel[56] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 70
        gunModel[57] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 71
        gunModel[58] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 72
        gunModel[59] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 73
        gunModel[60] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 74
        gunModel[61] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 75
        gunModel[62] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 76
        gunModel[63] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 77
        gunModel[64] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 78
        gunModel[65] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 80
        gunModel[66] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 81
        gunModel[67] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 82
        gunModel[68] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 83
        gunModel[69] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 84
        gunModel[70] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 85
        gunModel[71] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 86
        gunModel[72] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 90
        gunModel[73] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 92
        gunModel[74] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 93
        gunModel[75] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 98
        gunModel[76] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 99
        gunModel[77] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 100
        gunModel[78] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 102
        gunModel[79] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 103
        gunModel[80] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 104
        gunModel[81] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 105
        gunModel[82] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 106
        gunModel[83] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 107
        gunModel[84] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 108
        gunModel[85] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 110
        gunModel[86] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 111
        gunModel[87] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 113
        gunModel[88] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 114
        gunModel[89] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 115
        gunModel[90] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 116
        gunModel[91] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 117
        gunModel[92] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 141
        gunModel[93] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 142
        gunModel[94] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 143
        gunModel[95] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 144
        gunModel[96] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 145
        gunModel[97] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 146
        gunModel[98] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 147
        gunModel[99] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 148
        gunModel[100] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 149
        gunModel[101] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 150
        gunModel[102] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 151
        gunModel[103] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 152
        gunModel[104] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 153
        gunModel[105] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 154
        gunModel[106] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 155
        gunModel[107] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 156
        gunModel[108] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 157
        gunModel[109] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 158
        gunModel[110] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 159
        gunModel[111] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 160
        gunModel[112] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 161
        gunModel[113] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 162
        gunModel[114] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 163
        gunModel[115] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 164
        gunModel[116] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 165
        gunModel[117] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 166
        gunModel[118] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 167
        gunModel[119] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 168
        gunModel[120] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 169
        gunModel[121] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 170
        gunModel[122] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 171
        gunModel[123] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 172
        gunModel[124] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 173
        gunModel[125] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 174
        gunModel[126] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 175
        gunModel[127] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 178
        gunModel[128] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 179
        gunModel[129] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 180
        gunModel[130] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 183
        gunModel[131] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 184
        gunModel[132] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 219
        gunModel[133] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 222
        gunModel[134] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 223
        gunModel[135] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 224
        gunModel[136] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 225
        gunModel[137] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 226
        gunModel[138] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 227
        gunModel[139] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 228
        gunModel[140] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 229
        gunModel[141] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 230
        gunModel[142] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 231
        gunModel[143] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Box 232
        gunModel[144] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 233
        gunModel[145] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 234
        gunModel[146] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 235
        gunModel[147] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 236
        gunModel[148] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 237
        gunModel[149] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 238
        gunModel[150] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 239
        gunModel[151] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 240
        gunModel[152] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 241
        gunModel[153] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 242
        gunModel[154] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 243
        gunModel[155] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 244
        gunModel[156] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 245
        gunModel[157] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 246
        gunModel[158] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 247
        gunModel[159] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 248
        gunModel[160] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Box 249
        gunModel[161] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 250
        gunModel[162] = new ModelRendererTurbo(this, 361, 145, textureX, textureY); // Box 251
        gunModel[163] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Box 252
        gunModel[164] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 253
        gunModel[165] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Box 254
        gunModel[166] = new ModelRendererTurbo(this, 457, 145, textureX, textureY); // Box 255
        gunModel[167] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Box 256
        gunModel[168] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 257
        gunModel[169] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 258
        gunModel[170] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Box 259
        gunModel[171] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 285
        gunModel[172] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Box 286
        gunModel[173] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 287
        gunModel[174] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 290
        gunModel[175] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 294
        gunModel[176] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 295
        gunModel[177] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 296
        gunModel[178] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 297
        gunModel[179] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 315
        gunModel[180] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 316
        gunModel[181] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Box 330
        gunModel[182] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Box 331
        gunModel[183] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 332
        gunModel[184] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Box 334
        gunModel[185] = new ModelRendererTurbo(this, 393, 153, textureX, textureY); // Box 333
        gunModel[186] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 334
        gunModel[187] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 335
        gunModel[188] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 338
        gunModel[189] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 342
        gunModel[190] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 343
        gunModel[191] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Box 344
        gunModel[192] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 345
        gunModel[193] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 346
        gunModel[194] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 347
        gunModel[195] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 348
        gunModel[196] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 355
        gunModel[197] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 356
        gunModel[198] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Box 357
        gunModel[199] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 413
        gunModel[200] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Box 410
        gunModel[201] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Box 395
        gunModel[202] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 396
        gunModel[203] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 406
        gunModel[204] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 408
        gunModel[205] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 409
        gunModel[206] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 424
        gunModel[207] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 425
        gunModel[208] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 426
        gunModel[209] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 427
        gunModel[210] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 428
        gunModel[211] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 429
        gunModel[212] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 430
        gunModel[213] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 67
        gunModel[214] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 547
        gunModel[215] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 548
        gunModel[216] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 614
        gunModel[217] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 614
        gunModel[218] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 614
        gunModel[219] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 614
        gunModel[220] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Import Box274
        gunModel[221] = new ModelRendererTurbo(this, 353, 169, textureX, textureY); // Import Box276
        gunModel[222] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Import Box519
        gunModel[223] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Import Box262
        gunModel[224] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import Box262
        gunModel[225] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Import Box262
        gunModel[226] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Import Box262
        gunModel[227] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Import Box262
        gunModel[228] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Box 73
        gunModel[229] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 73
        gunModel[230] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 73
        gunModel[231] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Import Box274
        gunModel[232] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Import Box276
        gunModel[233] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Import Box519
        gunModel[234] = new ModelRendererTurbo(this, 193, 177, textureX, textureY); // Box 93
        gunModel[235] = new ModelRendererTurbo(this, 377, 177, textureX, textureY); // Box 31
        gunModel[236] = new ModelRendererTurbo(this, 353, 185, textureX, textureY); // Box 47
        gunModel[237] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 93
        gunModel[238] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 93
        gunModel[239] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Box 31
        gunModel[240] = new ModelRendererTurbo(this, 249, 185, textureX, textureY); // Box 47
        gunModel[241] = new ModelRendererTurbo(this, 393, 185, textureX, textureY); // Box 274
        gunModel[242] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Box 276
        gunModel[243] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Box 278
        gunModel[244] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 181
        gunModel[245] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 183
        gunModel[246] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 342
        gunModel[247] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 342
        gunModel[248] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 342
        gunModel[249] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Box 20
        gunModel[250] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 21
        gunModel[251] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 22
        gunModel[252] = new ModelRendererTurbo(this, 121, 193, textureX, textureY); // Box 20
        gunModel[253] = new ModelRendererTurbo(this, 145, 193, textureX, textureY); // Box 21
        gunModel[254] = new ModelRendererTurbo(this, 161, 193, textureX, textureY); // Box 22
        gunModel[255] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); // Box 20
        gunModel[256] = new ModelRendererTurbo(this, 425, 193, textureX, textureY); // Box 20
        gunModel[257] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 22
        gunModel[258] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 4
        gunModel[259] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 4
        gunModel[260] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 4
        gunModel[261] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 222
        gunModel[262] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 4
        gunModel[263] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Box 73
        gunModel[264] = new ModelRendererTurbo(this, 369, 193, textureX, textureY); // Import Box274
        gunModel[265] = new ModelRendererTurbo(this, 33, 201, textureX, textureY); // Import Box276
        gunModel[266] = new ModelRendererTurbo(this, 121, 201, textureX, textureY); // Import Box519
        gunModel[267] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Import Box274
        gunModel[268] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Import Box276
        gunModel[269] = new ModelRendererTurbo(this, 217, 201, textureX, textureY); // Import Box519
        gunModel[270] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Import Box274
        gunModel[271] = new ModelRendererTurbo(this, 281, 201, textureX, textureY); // Import Box276
        gunModel[272] = new ModelRendererTurbo(this, 313, 201, textureX, textureY); // Import Box519
        gunModel[273] = new ModelRendererTurbo(this, 153, 153, textureX, textureY); // Import Box276
        gunModel[274] = new ModelRendererTurbo(this, 321, 153, textureX, textureY); // Import Box519
        gunModel[275] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Import Box519
        gunModel[276] = new ModelRendererTurbo(this, 425, 153, textureX, textureY); // Import Box274
        gunModel[277] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Import Box276
        gunModel[278] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Import Box519
        gunModel[279] = new ModelRendererTurbo(this, 345, 201, textureX, textureY); // Import Box274
        gunModel[280] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Import Box276
        gunModel[281] = new ModelRendererTurbo(this, 425, 201, textureX, textureY); // Import Box519
        gunModel[282] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Import Box274
        gunModel[283] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Import Box276
        gunModel[284] = new ModelRendererTurbo(this, 57, 209, textureX, textureY); // Import Box519
        gunModel[285] = new ModelRendererTurbo(this, 89, 209, textureX, textureY); // Import Box274
        gunModel[286] = new ModelRendererTurbo(this, 369, 209, textureX, textureY); // Import Box276
        gunModel[287] = new ModelRendererTurbo(this, 481, 209, textureX, textureY); // Import Box519
        gunModel[288] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 274
        gunModel[289] = new ModelRendererTurbo(this, 353, 169, textureX, textureY); // Box 276
        gunModel[290] = new ModelRendererTurbo(this, 33, 177, textureX, textureY); // Box 278
        gunModel[291] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Import Box274
        gunModel[292] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Import Box276
        gunModel[293] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Import Box519
        gunModel[294] = new ModelRendererTurbo(this, 209, 193, textureX, textureY); // Import Box274
        gunModel[295] = new ModelRendererTurbo(this, 145, 201, textureX, textureY); // Import Box276
        gunModel[296] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Import Box519
        gunModel[297] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Box 424
        gunModel[298] = new ModelRendererTurbo(this, 137, 209, textureX, textureY); // Box 424
        gunModel[299] = new ModelRendererTurbo(this, 457, 145, textureX, textureY); // Box 406
        gunModel[300] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 406
        gunModel[301] = new ModelRendererTurbo(this, 209, 201, textureX, textureY); // Box 274
        gunModel[302] = new ModelRendererTurbo(this, 241, 201, textureX, textureY); // Box 276
        gunModel[303] = new ModelRendererTurbo(this, 273, 201, textureX, textureY); // Box 278
        gunModel[304] = new ModelRendererTurbo(this, 305, 201, textureX, textureY); // Box 274
        gunModel[305] = new ModelRendererTurbo(this, 337, 201, textureX, textureY); // Box 276
        gunModel[306] = new ModelRendererTurbo(this, 417, 201, textureX, textureY); // Box 278
        gunModel[307] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Box 406
        gunModel[308] = new ModelRendererTurbo(this, 497, 169, textureX, textureY); // Box 406
        gunModel[309] = new ModelRendererTurbo(this, 161, 177, textureX, textureY); // Box 406
        gunModel[310] = new ModelRendererTurbo(this, 25, 217, textureX, textureY); // Box 153
        gunModel[311] = new ModelRendererTurbo(this, 113, 217, textureX, textureY); // Box 406
        gunModel[312] = new ModelRendererTurbo(this, 161, 217, textureX, textureY); // Box 406
        gunModel[313] = new ModelRendererTurbo(this, 185, 217, textureX, textureY); // Box 406
        gunModel[314] = new ModelRendererTurbo(this, 209, 217, textureX, textureY); // Import Box274
        gunModel[315] = new ModelRendererTurbo(this, 233, 217, textureX, textureY); // Import Box276
        gunModel[316] = new ModelRendererTurbo(this, 257, 217, textureX, textureY); // Import Box519
        gunModel[317] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Box 12
        gunModel[318] = new ModelRendererTurbo(this, 457, 193, textureX, textureY); // Box 274
        gunModel[319] = new ModelRendererTurbo(this, 449, 201, textureX, textureY); // Box 276
        gunModel[320] = new ModelRendererTurbo(this, 81, 209, textureX, textureY); // Box 278
        gunModel[321] = new ModelRendererTurbo(this, 273, 217, textureX, textureY); // Box 73
        gunModel[322] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Import Box262
        gunModel[323] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Import Box262
        gunModel[324] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Import Box262
        gunModel[325] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Import Box262
        gunModel[326] = new ModelRendererTurbo(this, 401, 217, textureX, textureY); // Import Box262
        gunModel[327] = new ModelRendererTurbo(this, 281, 225, textureX, textureY); // Box 73
        gunModel[328] = new ModelRendererTurbo(this, 425, 217, textureX, textureY); // Box 73
        gunModel[329] = new ModelRendererTurbo(this, 57, 225, textureX, textureY); // Box 73
        gunModel[330] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Import Box276
        gunModel[331] = new ModelRendererTurbo(this, 129, 217, textureX, textureY); // Import Box519
        gunModel[332] = new ModelRendererTurbo(this, 153, 217, textureX, textureY); // Import Box519
        gunModel[333] = new ModelRendererTurbo(this, 377, 225, textureX, textureY); // Box 93
        gunModel[334] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 93
        gunModel[335] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 91
        gunModel[336] = new ModelRendererTurbo(this, 177, 217, textureX, textureY); // Box 91
        gunModel[337] = new ModelRendererTurbo(this, 201, 217, textureX, textureY); // Box 91
        gunModel[338] = new ModelRendererTurbo(this, 225, 217, textureX, textureY); // Box 91
        gunModel[339] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 92
        gunModel[340] = new ModelRendererTurbo(this, 249, 217, textureX, textureY); // Box 92
        gunModel[341] = new ModelRendererTurbo(this, 393, 177, textureX, textureY); // Box 92
        gunModel[342] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 93
        gunModel[343] = new ModelRendererTurbo(this, 505, 193, textureX, textureY); // Box 93
        gunModel[344] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Box 93
        gunModel[345] = new ModelRendererTurbo(this, 137, 225, textureX, textureY); // Box 92
        gunModel[346] = new ModelRendererTurbo(this, 73, 233, textureX, textureY); // Box 93
        gunModel[347] = new ModelRendererTurbo(this, 145, 233, textureX, textureY); // Box 93
        gunModel[348] = new ModelRendererTurbo(this, 41, 177, textureX, textureY); // Box 93
        gunModel[349] = new ModelRendererTurbo(this, 217, 233, textureX, textureY); // Box 93
        gunModel[350] = new ModelRendererTurbo(this, 289, 233, textureX, textureY); // Box 93
        gunModel[351] = new ModelRendererTurbo(this, 361, 233, textureX, textureY); // Box 93
        gunModel[352] = new ModelRendererTurbo(this, 153, 225, textureX, textureY); // Box 91
        gunModel[353] = new ModelRendererTurbo(this, 449, 225, textureX, textureY); // Box 91
        gunModel[354] = new ModelRendererTurbo(this, 465, 225, textureX, textureY); // Box 91
        gunModel[355] = new ModelRendererTurbo(this, 481, 225, textureX, textureY); // Box 91
        gunModel[356] = new ModelRendererTurbo(this, 433, 233, textureX, textureY); // Box 92
        gunModel[357] = new ModelRendererTurbo(this, 497, 225, textureX, textureY); // Box 92
        gunModel[358] = new ModelRendererTurbo(this, 241, 193, textureX, textureY); // Box 92
        gunModel[359] = new ModelRendererTurbo(this, 57, 201, textureX, textureY); // Box 93
        gunModel[360] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Box 93
        gunModel[361] = new ModelRendererTurbo(this, 457, 233, textureX, textureY); // Box 93
        gunModel[362] = new ModelRendererTurbo(this, 305, 185, textureX, textureY); // Box 332
        gunModel[363] = new ModelRendererTurbo(this, 137, 233, textureX, textureY); // Import Box274
        gunModel[364] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Import Box276
        gunModel[365] = new ModelRendererTurbo(this, 481, 233, textureX, textureY); // Import Box519
        gunModel[366] = new ModelRendererTurbo(this, 497, 233, textureX, textureY); // Import Box274
        gunModel[367] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Import Box276
        gunModel[368] = new ModelRendererTurbo(this, 17, 241, textureX, textureY); // Import Box519
        gunModel[369] = new ModelRendererTurbo(this, 33, 241, textureX, textureY); // Box 22
        gunModel[370] = new ModelRendererTurbo(this, 97, 241, textureX, textureY); // Box 0
        gunModel[371] = new ModelRendererTurbo(this, 113, 241, textureX, textureY); // Box 1
        gunModel[372] = new ModelRendererTurbo(this, 129, 241, textureX, textureY); // Box 3
        gunModel[373] = new ModelRendererTurbo(this, 145, 241, textureX, textureY); // Box 4
        gunModel[374] = new ModelRendererTurbo(this, 161, 241, textureX, textureY); // Box 0
        gunModel[375] = new ModelRendererTurbo(this, 177, 241, textureX, textureY); // Box 1
        gunModel[376] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 3
        gunModel[377] = new ModelRendererTurbo(this, 209, 241, textureX, textureY); // Box 4
        gunModel[378] = new ModelRendererTurbo(this, 444, 241, textureX, textureY); // Box 76
        gunModel[379] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 486
        gunModel[380] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Import Import

        gunModel[0].addShapeBox(0F, 0F, 0F, 100, 1, 2, 0F, 0F, 0F, 0F, -38F, 0F, 0F, -38F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -38F, 0F, 1F, -38F, 0F, 1F, 0F, 0F, 1F); // Box 0
        gunModel[0].setRotationPoint(59F, -49F, -1F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 100, 1, 2, 0F, 0F, 0F, 1F, -38F, 0F, 1F, -38F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -38F, 0F, 0F, -38F, 0F, 0F, 0F, 0F, 0F); // Box 1
        gunModel[1].setRotationPoint(59F, -46F, -1F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 100, 2, 1, 0F, 0F, 0F, 0F, -38F, 0F, 0F, -38F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -38F, 0F, 0F, -38F, 0F, 0F, 0F, 0F, 0F); // Box 3
        gunModel[2].setRotationPoint(59F, -48F, -2F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 100, 2, 1, 0F, 0F, 0F, 0F, -38F, 0F, 0F, -38F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -38F, 0F, 0F, -38F, 0F, 0F, 0F, 0F, 0F); // Box 4
        gunModel[3].setRotationPoint(59F, -48F, 1F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
        gunModel[4].setRotationPoint(111F, -50F, -2F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
        gunModel[5].setRotationPoint(111F, -45F, -1F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
        gunModel[6].setRotationPoint(111F, -48F, 2F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 7
        gunModel[7].setRotationPoint(111F, -50F, 1F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 1F, -1F, 0F); // Box 8
        gunModel[8].setRotationPoint(111F, -50F, -3F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
        gunModel[9].setRotationPoint(111F, -46F, -3F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 10
        gunModel[10].setRotationPoint(111F, -46F, 1F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 11
        gunModel[11].setRotationPoint(111F, -48F, -3F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 30, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F); // Box 20
        gunModel[12].setRotationPoint(72F, -57F, -1.5F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 30, 1, 3, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 21
        gunModel[13].setRotationPoint(72F, -53F, -1.5F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 30, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 22
        gunModel[14].setRotationPoint(72F, -55.5F, -2.5F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
        gunModel[15].setRotationPoint(104F, -52F, -1.5F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
        gunModel[16].setRotationPoint(104F, -50F, -1.5F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
        gunModel[17].setRotationPoint(112F, -44F, -1F);

        gunModel[18].addShapeBox(0F, 0F, 0F, 28, 2, 8, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
        gunModel[18].setRotationPoint(73.5F, -58F, -4F);

        gunModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
        gunModel[19].setRotationPoint(101.5F, -48F, 2F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 29
        gunModel[20].setRotationPoint(94.5F, -50F, -1F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 1.5F, -1F, 0F, 1.5F, 0F, -1F, 0F, 0F, -1F); // Box 30
        gunModel[21].setRotationPoint(94.5F, -50F, 1F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
        gunModel[22].setRotationPoint(96.5F, -50.5F, -4F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[23].setRotationPoint(101.5F, -48F, -3F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1.5F, 0F, -1F, 1.5F, -1F, 0F, 0F, -1F, 0F); // Box 34
        gunModel[24].setRotationPoint(94.5F, -50F, -3F);

        gunModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, -1F, 1.5F, 0F, -1F, 1.5F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
        gunModel[25].setRotationPoint(101.5F, -46F, -3F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -1F, 0F, 1.5F, -1F, 0F, 1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 36
        gunModel[26].setRotationPoint(101.5F, -46F, 1F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
        gunModel[27].setRotationPoint(101.5F, -45F, -1F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 28, 1, 6, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
        gunModel[28].setRotationPoint(73.5F, -59F, -3F);

        gunModel[29].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 39
        gunModel[29].setRotationPoint(74F, -55F, -4F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 40
        gunModel[30].setRotationPoint(85F, -55F, -4F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 41
        gunModel[31].setRotationPoint(97F, -55F, -4F);

        gunModel[32].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 42
        gunModel[32].setRotationPoint(85F, -53.5F, -4F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 43
        gunModel[33].setRotationPoint(97F, -53.5F, -4F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 44
        gunModel[34].setRotationPoint(74F, -53.5F, -4F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 28, 2, 8, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
        gunModel[35].setRotationPoint(73.5F, -52.5F, -4F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 47
        gunModel[36].setRotationPoint(96.5F, -47F, -4F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 31, 4, 12, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -2F); // Box 48
        gunModel[37].setRotationPoint(63F, -46F, -6F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 7, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 49
        gunModel[38].setRotationPoint(94.5F, -44F, -5F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 50
        gunModel[39].setRotationPoint(94.5F, -48F, 2F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
        gunModel[40].setRotationPoint(94.5F, -48F, -3F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
        gunModel[41].setRotationPoint(94.5F, -45F, -4F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 21, 1, 10, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
        gunModel[42].setRotationPoint(73.5F, -51F, -5F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
        gunModel[43].setRotationPoint(94.49F, -51F, -1F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 56
        gunModel[44].setRotationPoint(48F, -49F, -5F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F); // Box 57
        gunModel[45].setRotationPoint(6F, -48F, 4F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 58
        gunModel[46].setRotationPoint(-2.5F, -49F, -5F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 10, 10, 1, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, 0.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 59
        gunModel[47].setRotationPoint(-10F, -48F, -5F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F); // Box 60
        gunModel[48].setRotationPoint(-16F, -47F, -5F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
        gunModel[49].setRotationPoint(-16F, -42F, -5F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
        gunModel[50].setRotationPoint(-16F, -48F, -5F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
        gunModel[51].setRotationPoint(-16F, -49F, -5F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
        gunModel[52].setRotationPoint(-6F, -49F, -5F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 44, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 66
        gunModel[53].setRotationPoint(-16F, -50F, -5F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 85, 4, 6, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.1765F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 1.1765F, -2.5F, 0F); // Box 67
        gunModel[54].setRotationPoint(-12F, -58F, -3F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 3, 6, 10, 0F, 0.1765F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0.1765F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 68
        gunModel[55].setRotationPoint(-13F, -56.5F, -5F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 38, 6, 1, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
        gunModel[56].setRotationPoint(-10F, -56.5F, 4F);

        gunModel[57].addShapeBox(0F, 23F, 0F, 38, 6, 1, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
        gunModel[57].setRotationPoint(-10F, -79.5F, -5F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 72
        gunModel[58].setRotationPoint(48F, -49F, 4F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 42, 3, 2, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F); // Box 73
        gunModel[59].setRotationPoint(6F, -41F, 3F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F); // Box 74
        gunModel[60].setRotationPoint(6F, -48F, -5F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 21, 12, 8, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 75
        gunModel[61].setRotationPoint(-16F, -50F, -4F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
        gunModel[62].setRotationPoint(-16F, -49F, 4F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 44, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 77
        gunModel[63].setRotationPoint(-16F, -50F, 4F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 10, 10, 1, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
        gunModel[64].setRotationPoint(-16F, -48F, 4F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 17, 1, 6, 0F, 0.5F, 0F, 0F, 0F, 0.8235F, 0F, 0F, 0.8235F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.8235F, 0F, 0F, -0.8235F, 0F, 0.5F, 0F, 0F); // Box 80
        gunModel[65].setRotationPoint(6F, -39F, -3F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
        gunModel[66].setRotationPoint(42.5F, -41F, -4F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 3, 5, 10, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 82
        gunModel[67].setRotationPoint(51F, -45F, -5F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 3, 5, 10, 0F, -3F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, -3F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -0.5F, 0F, 0F); // Box 83
        gunModel[68].setRotationPoint(51F, -45F, -5F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 7, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 84
        gunModel[69].setRotationPoint(54F, -45F, -5F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 49, 1, 6, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F); // Box 85
        gunModel[70].setRotationPoint(53F, -42F, -3F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 86
        gunModel[71].setRotationPoint(61F, -46F, -6F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 23, 3, 1, 0F, 0F, -1.75F, 0.5F, 0F, -1.75F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 90
        gunModel[72].setRotationPoint(50.5F, -53.5F, 4F);

        gunModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 92
        gunModel[73].setRotationPoint(60F, -50F, 4F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 29, 1, 4, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 93
        gunModel[74].setRotationPoint(65F, -50F, 2F);

        gunModel[75].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
        gunModel[75].setRotationPoint(65F, -60F, -3.5F);

        gunModel[76].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -1F, -0.5F, 0F); // Box 99
        gunModel[76].setRotationPoint(68F, -60.5F, -3.5F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 100
        gunModel[77].setRotationPoint(69F, -58F, -3.5F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, 0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.01F, 0.5F, 0F, 0.01F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 102
        gunModel[78].setRotationPoint(69F, -59.5F, -3.5F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -2F, 0F, 2F, 2F, -1F, 1.81F, 2F, -1F, -2.8F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, -0.19F, 0F, 1F, -0.8F, 0F, 0F, 0F); // Box 103
        gunModel[79].setRotationPoint(28F, -56.5F, 4F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 104
        gunModel[80].setRotationPoint(29F, -50F, 4F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 105
        gunModel[81].setRotationPoint(29F, -50F, 4F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 106
        gunModel[82].setRotationPoint(30F, -56.5F, 2F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
        gunModel[83].setRotationPoint(65F, -56.5F, 2F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
        gunModel[84].setRotationPoint(70F, -55.5F, 2F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 110
        gunModel[85].setRotationPoint(73F, -58.5F, -3F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 111
        gunModel[86].setRotationPoint(73F, -56.5F, 2F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
        gunModel[87].setRotationPoint(93.5F, -50F, -2F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -2F, 0F, -2F, 2F, -1F, -2.8F, 2F, -1F, 1.81F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 1F, -0.8F, 0F, 1F, -0.19F, 0F, 0F, 0F); // Box 114
        gunModel[88].setRotationPoint(28F, -56.5F, -5F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.19F, 0F, 0F, -0.19F); // Box 115
        gunModel[89].setRotationPoint(30F, -56.5F, -3F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1F, 0.5F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
        gunModel[90].setRotationPoint(29F, -50F, -5F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
        gunModel[91].setRotationPoint(29F, -50F, -5F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F, 0F, 0F, 0F, 0F, -0.1765F, 0F, 0F, -0.1765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
        gunModel[92].setRotationPoint(18F, -39F, 1.5F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 142
        gunModel[93].setRotationPoint(18F, -31F, 1.5F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F, 0F, 0F, 0F, 0F, -0.1765F, 0F, 0F, -0.1765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
        gunModel[94].setRotationPoint(18F, -39F, -2.5F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 144
        gunModel[95].setRotationPoint(18F, -31F, -2.5F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 1, 9, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
        gunModel[96].setRotationPoint(18F, -39F, -1.5F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
        gunModel[97].setRotationPoint(6F, -28F, -1.5F);

        gunModel[98].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 0.5F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, -1F, 0F); // Box 147
        gunModel[98].setRotationPoint(16F, -30F, -1.5F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -3F, 0F, 0F); // Box 148
        gunModel[99].setRotationPoint(3F, -30F, -1.5F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
        gunModel[100].setRotationPoint(7F, -39F, -1F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F); // Box 150
        gunModel[101].setRotationPoint(7F, -37F, -1F);

        gunModel[102].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, -0.5F, 0F); // Box 151
        gunModel[102].setRotationPoint(8F, -32F, -1F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F, 1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -1F, 0F, 0F); // Box 152
        gunModel[103].setRotationPoint(-7F, -38F, -3.5F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
        gunModel[104].setRotationPoint(0F, -37F, -3.5F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 1, 8, 7, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 154
        gunModel[105].setRotationPoint(3F, -37F, -3.5F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 6, 5, 7, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 2F, 0F, 0F); // Box 155
        gunModel[106].setRotationPoint(-6F, -31F, -3.5F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 6, 7, 7, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 3F, 0F, 0F); // Box 156
        gunModel[107].setRotationPoint(-8F, -26F, -3.5F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 6, 7, 7, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 2F, 1F, 0F); // Box 157
        gunModel[108].setRotationPoint(-11F, -19F, -3.5F);

        gunModel[109].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F); // Box 158
        gunModel[109].setRotationPoint(-13F, -11F, -3.5F);

        gunModel[110].addShapeBox(0F, 0F, 0F, 3, 5, 7, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, 0F); // Box 159
        gunModel[110].setRotationPoint(0F, -29F, -3.5F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 3, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 1F, -2F, -2F, 1F, -2F, 2F, 0F, 0F); // Box 160
        gunModel[111].setRotationPoint(-2F, -24F, -3.5F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F); // Box 161
        gunModel[112].setRotationPoint(-4F, -18F, -3.5F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 162
        gunModel[113].setRotationPoint(-5F, -11F, -3.5F);

        gunModel[114].addShapeBox(0F, 0F, 0F, 6, 3, 7, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F); // Box 163
        gunModel[114].setRotationPoint(-15F, -38F, -3.5F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2F); // Box 164
        gunModel[115].setRotationPoint(-9F, -38F, -3.5F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 165
        gunModel[116].setRotationPoint(-9F, -35F, -3.5F);

        gunModel[117].addShapeBox(0F, 0F, 0F, 4, 5, 7, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 2F, 1F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 1F, -2F); // Box 166
        gunModel[117].setRotationPoint(-10F, -31F, -3.5F);

        gunModel[118].addShapeBox(0F, 0F, 0F, 4, 7, 7, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 2F, -1F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, -1F, -2F); // Box 167
        gunModel[118].setRotationPoint(-12F, -26F, -3.5F);

        gunModel[119].addShapeBox(0F, 0F, 0F, 3, 9, 7, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 2F, -2F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, -2F, -2F); // Box 168
        gunModel[119].setRotationPoint(-14F, -20F, -3.5F);

        gunModel[120].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 169
        gunModel[120].setRotationPoint(-16F, -13F, -3.5F);

        gunModel[121].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[121].setRotationPoint(-6F, -38F, -3F);

        gunModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 171
        gunModel[122].setRotationPoint(2F, -38F, -3F);

        gunModel[123].addShapeBox(-0.5F, 0F, -9.5F, 1, 12, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
        gunModel[123].setRotationPoint(-17.5F, -50F, 5.5F);

        gunModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 173
        gunModel[124].setRotationPoint(-19F, -50F, 4F);

        gunModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 174
        gunModel[125].setRotationPoint(-17F, -50F, 4F);

        gunModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
        gunModel[126].setRotationPoint(-18F, -50F, 4F);

        gunModel[127].addShapeBox(-1.5F, 0F, -9.5F, 1, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
        gunModel[127].setRotationPoint(-17.5F, -50F, 5.5F);

        gunModel[128].addShapeBox(-5.5F, 0F, -10F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 179
        gunModel[128].setRotationPoint(-17.5F, -46F, 5.5F);

        gunModel[129].addShapeBox(-4.5F, 0F, -10F, 5, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
        gunModel[129].setRotationPoint(-17.5F, -46F, 5.5F);

        gunModel[130].addShapeBox(0.5F, 0F, -13F, 1, 1, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 183
        gunModel[130].setRotationPoint(-17.5F, -39F, 5.5F);

        gunModel[131].addShapeBox(0.5F, 0F, -14F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
        gunModel[131].setRotationPoint(-17.5F, -46.5F, 5.5F);

        gunModel[132].addShapeBox(0F, 0F, 0F, 28, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 219
        gunModel[132].setRotationPoint(73.5F, -56F, -4F);

        gunModel[133].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
        gunModel[133].setRotationPoint(117F, -61F, -2F);

        gunModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, 1F); // Box 223
        gunModel[134].setRotationPoint(74F, -60F, -3F);

        gunModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 224
        gunModel[135].setRotationPoint(78F, -60F, -3F);

        gunModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 225
        gunModel[136].setRotationPoint(82F, -60F, -3F);

        gunModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 226
        gunModel[137].setRotationPoint(86F, -60F, -3F);

        gunModel[138].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 227
        gunModel[138].setRotationPoint(61F, -60F, -3F);

        gunModel[139].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0F, 0F, 1F); // Box 228
        gunModel[139].setRotationPoint(98F, -60F, -3F);

        gunModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 229
        gunModel[140].setRotationPoint(94F, -60F, -3F);

        gunModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 230
        gunModel[141].setRotationPoint(90F, -60F, -3F);

        gunModel[142].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 231
        gunModel[142].setRotationPoint(95F, -41F, -3F);

        gunModel[143].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
        gunModel[143].setRotationPoint(91F, -41F, -3F);

        gunModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
        gunModel[144].setRotationPoint(87F, -41F, -3F);

        gunModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
        gunModel[145].setRotationPoint(83F, -41F, -3F);

        gunModel[146].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
        gunModel[146].setRotationPoint(79F, -41F, -3F);

        gunModel[147].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
        gunModel[147].setRotationPoint(75F, -41F, -3F);

        gunModel[148].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
        gunModel[148].setRotationPoint(69F, -41F, -3F);

        gunModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
        gunModel[149].setRotationPoint(53F, -41F, -3F);

        gunModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
        gunModel[150].setRotationPoint(57F, -41F, -3F);

        gunModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
        gunModel[151].setRotationPoint(61F, -41F, -3F);

        gunModel[152].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
        gunModel[152].setRotationPoint(65F, -41F, -3F);

        gunModel[153].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 242
        gunModel[153].setRotationPoint(37F, -60F, -3F);

        gunModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 243
        gunModel[154].setRotationPoint(41F, -60F, -3F);

        gunModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 244
        gunModel[155].setRotationPoint(45F, -60F, -3F);

        gunModel[156].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 245
        gunModel[156].setRotationPoint(49F, -60F, -3F);

        gunModel[157].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 246
        gunModel[157].setRotationPoint(53F, -60F, -3F);

        gunModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 247
        gunModel[158].setRotationPoint(57F, -60F, -3F);

        gunModel[159].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 248
        gunModel[159].setRotationPoint(9F, -60F, -3F);

        gunModel[160].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 249
        gunModel[160].setRotationPoint(13F, -60F, -3F);

        gunModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 250
        gunModel[161].setRotationPoint(17F, -60F, -3F);

        gunModel[162].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 251
        gunModel[162].setRotationPoint(21F, -60F, -3F);

        gunModel[163].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 252
        gunModel[163].setRotationPoint(25F, -60F, -3F);

        gunModel[164].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 253
        gunModel[164].setRotationPoint(29F, -60F, -3F);

        gunModel[165].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 254
        gunModel[165].setRotationPoint(33F, -60F, -3F);

        gunModel[166].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 255
        gunModel[166].setRotationPoint(-12F, -60F, -3F);

        gunModel[167].addShapeBox(0F, 23F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 256
        gunModel[167].setRotationPoint(-7F, -83F, -3F);

        gunModel[168].addShapeBox(0F, 23F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 257
        gunModel[168].setRotationPoint(-3F, -83F, -3F);

        gunModel[169].addShapeBox(0F, 23F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 258
        gunModel[169].setRotationPoint(1F, -83F, -3F);

        gunModel[170].addShapeBox(0F, 23F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 259
        gunModel[170].setRotationPoint(5F, -83F, -3F);

        gunModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
        gunModel[171].setRotationPoint(115F, -64F, -0.5F);

        gunModel[172].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
        gunModel[172].setRotationPoint(111F, -61F, -2F);

        gunModel[173].addShapeBox(0F, 0F, 0F, 4, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 287
        gunModel[173].setRotationPoint(113F, -61F, -2F);

        gunModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
        gunModel[174].setRotationPoint(114.5F, -62F, -1F);

        gunModel[175].addShapeBox(-1F, -1F, 0F, 7, 1, 1, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 294
        gunModel[175].setRotationPoint(-13F, -48F, -5.5F);

        gunModel[176].addShapeBox(-1F, -1F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 295
        gunModel[176].setRotationPoint(-13F, -47F, -5.5F);

        gunModel[177].addShapeBox(-1F, -1F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 296
        gunModel[177].setRotationPoint(-13F, -46F, -5.5F);

        gunModel[178].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 297
        gunModel[178].setRotationPoint(-9F, -49F, -6F);

        gunModel[179].addShapeBox(-4.5F, 0F, -2F, 5, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
        gunModel[179].setRotationPoint(-17.5F, -46F, 5.5F);

        gunModel[180].addShapeBox(-5.5F, 0F, -2F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 316
        gunModel[180].setRotationPoint(-17.5F, -46F, 5.5F);

        gunModel[181].addShapeBox(0F, 0F, 0F, 54, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
        gunModel[181].setRotationPoint(60F, -43.5F, -0.5F);

        gunModel[182].addShapeBox(0F, -3F, 0F, 1, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
        gunModel[182].setRotationPoint(21F, -34F, -1.5F);
        gunModel[182].rotateAngleZ = -0.26179939F;

        gunModel[183].addShapeBox(0F, 3F, 0F, 1, 2, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
        gunModel[183].setRotationPoint(21F, -34F, -2F);
        gunModel[183].rotateAngleZ = -0.26179939F;

        gunModel[184].addShapeBox(0F, 5F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
        gunModel[184].setRotationPoint(21F, -34F, -2F);
        gunModel[184].rotateAngleZ = -0.26179939F;

        gunModel[185].addShapeBox(0F, 0F, 0F, 1, 9, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 333
        gunModel[185].setRotationPoint(-17F, -48F, -3F);

        gunModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 334
        gunModel[186].setRotationPoint(-17F, -50F, -1F);

        gunModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 335
        gunModel[187].setRotationPoint(-17F, -39F, -2F);

        gunModel[188].addShapeBox(0.5F, 0F, -9.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
        gunModel[188].setRotationPoint(-17.5F, -50F, 5.5F);

        gunModel[189].addShapeBox(0.5F, 0F, -14F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
        gunModel[189].setRotationPoint(-17.5F, -47.5F, 5.5F);

        gunModel[190].addShapeBox(-0.5F, 0F, -1.5F, 1, 10, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
        gunModel[190].setRotationPoint(-17.5F, -49F, 5.5F);

        gunModel[191].addShapeBox(0.5F, 0F, -1.5F, 1, 10, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 344
        gunModel[191].setRotationPoint(-17.5F, -49F, 5.5F);

        gunModel[192].addShapeBox(-1.5F, 0F, -1.5F, 1, 10, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 345
        gunModel[192].setRotationPoint(-17.5F, -49F, 5.5F);

        gunModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
        gunModel[193].setRotationPoint(-18F, -39F, 4F);

        gunModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 347
        gunModel[194].setRotationPoint(-19F, -39F, 4F);

        gunModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 348
        gunModel[195].setRotationPoint(-17F, -39F, 4F);

        gunModel[196].addShapeBox(-2.5F, 0F, -9.5F, 1, 2, 8, 0F, -1F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
        gunModel[196].setRotationPoint(-17.5F, -50F, 5.5F);

        gunModel[197].addShapeBox(-2.5F, 0F, -9.5F, 1, 9, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 356
        gunModel[197].setRotationPoint(-17.5F, -48F, 5.5F);

        gunModel[198].addShapeBox(-1.5F, 0F, -9.5F, 1, 10, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
        gunModel[198].setRotationPoint(-17.5F, -48F, 5.5F);

        gunModel[199].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 413
        gunModel[199].setRotationPoint(104.5F, -54F, -1.5F);

        gunModel[200].addShapeBox(0F, 0F, 0F, 28, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
        gunModel[200].setRotationPoint(73.5F, -55F, -3.5F);

        gunModel[201].addShapeBox(0F, 0F, 0F, 23, 3, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.75F, 0.5F, 0F, -1.75F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 395
        gunModel[201].setRotationPoint(50.5F, -53.5F, -5F);

        gunModel[202].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
        gunModel[202].setRotationPoint(65F, -56.5F, -3F);

        gunModel[203].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 406
        gunModel[203].setRotationPoint(-12.5F, -47.5F, -6F);

        gunModel[204].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 408
        gunModel[204].setRotationPoint(73F, -56.5F, -3F);

        gunModel[205].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
        gunModel[205].setRotationPoint(70F, -55.5F, -3F);

        gunModel[206].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 11, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 424
        gunModel[206].setRotationPoint(1.25F, -46F, -5.5F);
        gunModel[206].rotateAngleZ = 0.27925268F;

        gunModel[207].addShapeBox(-0.5F, -2F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 425
        gunModel[207].setRotationPoint(1.25F, -46F, 4F);
        gunModel[207].rotateAngleZ = 0.27925268F;

        gunModel[208].addShapeBox(-0.5F, 0F, 0F, 1, 7, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 426
        gunModel[208].setRotationPoint(1.25F, -46F, 4F);
        gunModel[208].rotateAngleZ = 0.27925268F;

        gunModel[209].addShapeBox(-0.5F, 4.5F, 0F, 1, 3, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
        gunModel[209].setRotationPoint(1.25F, -46F, 5F);
        gunModel[209].rotateAngleZ = 0.27925268F;

        gunModel[210].addShapeBox(-0.5F, 4.5F, 0F, 1, 3, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
        gunModel[210].setRotationPoint(1.25F, -46F, -6F);
        gunModel[210].rotateAngleZ = 0.29670597F;

        gunModel[211].addShapeBox(-0.5F, 0F, 0F, 1, 7, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 429
        gunModel[211].setRotationPoint(1.25F, -46F, -5F);
        gunModel[211].rotateAngleZ = 0.29670597F;

        gunModel[212].addShapeBox(-0.5F, -2F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 430
        gunModel[212].setRotationPoint(1.25F, -46F, -5F);
        gunModel[212].rotateAngleZ = 0.29670597F;

        gunModel[213].addShapeBox(0F, 0F, 0F, 77, 1, 6, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 67
        gunModel[213].setRotationPoint(-12F, -59F, -3F);

        gunModel[214].addShapeBox(-1.5F, -9.5F, -3.5F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 547
        gunModel[214].setRotationPoint(114.5F, -54.75F, 0F);

        gunModel[215].addShapeBox(-1.5F, -9.5F, 2.5F, 5, 3, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
        gunModel[215].setRotationPoint(114.5F, -54.75F, 0F);

        gunModel[216].addShapeBox(-1.5F, -11.5F, -3.5F, 5, 2, 1, 0F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -1F, 1.25F, 0F, -1F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 614
        gunModel[216].setRotationPoint(114.5F, -54.75F, 0F);

        gunModel[217].addShapeBox(-1.5F, -11.5F, 2.5F, 5, 2, 1, 0F, 0F, -1F, 1.25F, 0F, -1F, 1.25F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 614
        gunModel[217].setRotationPoint(114.5F, -54.75F, 0F);

        gunModel[218].addShapeBox(-1.5F, -6.5F, -3.5F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -1.75F, 0.5F, 0F, -1.75F, 0.5F); // Box 614
        gunModel[218].setRotationPoint(114.5F, -54.75F, 0F);

        gunModel[219].addShapeBox(-1.5F, -6.5F, 2.5F, 5, 2, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0.5F, 0F, -1.75F, 0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 614
        gunModel[219].setRotationPoint(114.5F, -54.75F, 0F);

        gunModel[220].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F); // Import Box274
        gunModel[220].setRotationPoint(21F, -43.5F, -5F);

        gunModel[221].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box276
        gunModel[221].setRotationPoint(21F, -44.5F, -5F);

        gunModel[222].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box519
        gunModel[222].setRotationPoint(21F, -45.5F, -5F);

        gunModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box262
        gunModel[223].setRotationPoint(35F, -42F, 4F);

        gunModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box262
        gunModel[224].setRotationPoint(28F, -44F, 4F);

        gunModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box262
        gunModel[225].setRotationPoint(35F, -44F, 4F);

        gunModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box262
        gunModel[226].setRotationPoint(28F, -42F, 4F);

        gunModel[227].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box262
        gunModel[227].setRotationPoint(28F, -44F, 4F);

        gunModel[228].addShapeBox(0F, 0F, 0F, 42, 5, 2, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 73
        gunModel[228].setRotationPoint(6F, -49F, 3F);

        gunModel[229].addShapeBox(0F, 0F, 0F, 22, 3, 2, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 73
        gunModel[229].setRotationPoint(6F, -44F, 3F);

        gunModel[230].addShapeBox(0F, 0F, 0F, 12, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
        gunModel[230].setRotationPoint(36F, -44F, 3F);

        gunModel[231].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F); // Import Box274
        gunModel[231].setRotationPoint(47F, -46.5F, -5F);

        gunModel[232].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box276
        gunModel[232].setRotationPoint(47F, -47.5F, -5F);

        gunModel[233].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box519
        gunModel[233].setRotationPoint(47F, -48.5F, -5F);

        gunModel[234].addShapeBox(0F, 0F, 0F, 31, 1, 4, 0F, -0.25F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 93
        gunModel[234].setRotationPoint(63F, -47F, 2F);

        gunModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
        gunModel[235].setRotationPoint(99.5F, -50.5F, -4F);

        gunModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 47
        gunModel[236].setRotationPoint(99.5F, -47F, -4F);

        gunModel[237].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 93
        gunModel[237].setRotationPoint(93.5F, -49.5F, 2F);

        gunModel[238].addShapeBox(0F, 0F, 0F, 29, 2, 4, 0F, -0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, 1.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.25F, 1.25F, 0.5F, -0.25F); // Box 93
        gunModel[238].setRotationPoint(64.5F, -49F, 2F);

        gunModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -1F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 31
        gunModel[239].setRotationPoint(93.5F, -50.5F, -5F);

        gunModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -1F, 0F, -1F); // Box 47
        gunModel[240].setRotationPoint(93.5F, -46F, -5F);

        gunModel[241].addShapeBox(-5F, 4.5F, -10.5F, 3, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 274
        gunModel[241].setRotationPoint(-17.5F, -48F, 5.5F);

        gunModel[242].addShapeBox(-5F, 4.5F, -10.5F, 3, 1, 10, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
        gunModel[242].setRotationPoint(-17.5F, -50F, 5.5F);

        gunModel[243].addShapeBox(-5F, 4.5F, -10.5F, 3, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
        gunModel[243].setRotationPoint(-17.5F, -49F, 5.5F);

        gunModel[244].addShapeBox(0.5F, 0F, -10.5F, 1, 7, 2, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
        gunModel[244].setRotationPoint(-17.5F, -46.5F, 5.5F);

        gunModel[245].addShapeBox(0.5F, 0F, -13F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 183
        gunModel[245].setRotationPoint(-17.5F, -48F, 5.5F);

        gunModel[246].addShapeBox(0.5F, 0F, -11F, 1, 1, 2, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 342
        gunModel[246].setRotationPoint(-17.5F, -47.5F, 5.5F);

        gunModel[247].addShapeBox(0.5F, 0F, -14F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 342
        gunModel[247].setRotationPoint(-17.5F, -39.5F, 5.5F);

        gunModel[248].addShapeBox(0.5F, 0F, -11F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 342
        gunModel[248].setRotationPoint(-17.5F, -39.5F, 5.5F);

        gunModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F, 0.5F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 1F); // Box 20
        gunModel[249].setRotationPoint(110F, -57F, -1.5F);

        gunModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0.5F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 1F, 0F, 0F, -0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -0.5F); // Box 21
        gunModel[250].setRotationPoint(110F, -53F, -1.5F);

        gunModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F); // Box 22
        gunModel[251].setRotationPoint(110F, -55.5F, -2.5F);

        gunModel[252].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F); // Box 20
        gunModel[252].setRotationPoint(103F, -57F, -1.5F);

        gunModel[253].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 21
        gunModel[253].setRotationPoint(103F, -53F, -1.5F);

        gunModel[254].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
        gunModel[254].setRotationPoint(103F, -55.5F, -2.5F);

        gunModel[255].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Box 20
        gunModel[255].setRotationPoint(94F, -57F, -1.5F);

        gunModel[256].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 20
        gunModel[256].setRotationPoint(94F, -53F, -1.5F);

        gunModel[257].addShapeBox(0F, 0F, 0F, 15, 2, 3, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 22
        gunModel[257].setRotationPoint(94F, -55.5F, -1.5F);

        gunModel[258].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
        gunModel[258].setRotationPoint(111F, -51F, -2F);

        gunModel[259].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
        gunModel[259].setRotationPoint(116F, -51F, -2F);

        gunModel[260].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 4
        gunModel[260].setRotationPoint(116F, -54F, -2F);

        gunModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
        gunModel[261].setRotationPoint(117F, -53F, -2F);

        gunModel[262].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, 0F); // Box 4
        gunModel[262].setRotationPoint(111.4F, -54F, -2F);

        gunModel[263].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 73
        gunModel[263].setRotationPoint(24F, -49F, 5F);

        gunModel[264].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F); // Import Box274
        gunModel[264].setRotationPoint(-6F, -43.5F, -5F);

        gunModel[265].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box276
        gunModel[265].setRotationPoint(-6F, -44.5F, -5F);

        gunModel[266].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box519
        gunModel[266].setRotationPoint(-6F, -45.5F, -5F);

        gunModel[267].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F); // Import Box274
        gunModel[267].setRotationPoint(-16F, -43.5F, -5F);

        gunModel[268].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box276
        gunModel[268].setRotationPoint(-16F, -44.5F, -5F);

        gunModel[269].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box519
        gunModel[269].setRotationPoint(-16F, -45.5F, -5F);

        gunModel[270].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F); // Import Box274
        gunModel[270].setRotationPoint(-12F, -39.5F, -5F);

        gunModel[271].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box276
        gunModel[271].setRotationPoint(-12F, -40.5F, -5F);

        gunModel[272].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box519
        gunModel[272].setRotationPoint(-12F, -41.5F, -5F);

        gunModel[273].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import Box276
        gunModel[273].setRotationPoint(37F, -42.5F, 4.5F);

        gunModel[274].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Import Box519
        gunModel[274].setRotationPoint(37F, -41.5F, 4.5F);

        gunModel[275].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import Box519
        gunModel[275].setRotationPoint(37F, -43.5F, 4.5F);

        gunModel[276].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F); // Import Box274
        gunModel[276].setRotationPoint(44F, -46.5F, -5F);

        gunModel[277].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box276
        gunModel[277].setRotationPoint(44F, -47.5F, -5F);

        gunModel[278].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box519
        gunModel[278].setRotationPoint(44F, -48.5F, -5F);

        gunModel[279].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F); // Import Box274
        gunModel[279].setRotationPoint(18F, -41.5F, -5F);

        gunModel[280].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box276
        gunModel[280].setRotationPoint(18F, -42.5F, -5F);

        gunModel[281].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box519
        gunModel[281].setRotationPoint(18F, -43.5F, -5F);

        gunModel[282].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F); // Import Box274
        gunModel[282].setRotationPoint(13F, -39.5F, -5F);

        gunModel[283].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box276
        gunModel[283].setRotationPoint(13F, -40.5F, -5F);

        gunModel[284].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box519
        gunModel[284].setRotationPoint(13F, -41.5F, -5F);

        gunModel[285].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F); // Import Box274
        gunModel[285].setRotationPoint(6F, -39F, -5F);

        gunModel[286].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box276
        gunModel[286].setRotationPoint(6F, -40F, -5F);

        gunModel[287].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box519
        gunModel[287].setRotationPoint(6F, -41F, -5F);

        gunModel[288].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 274
        gunModel[288].setRotationPoint(-10.5F, -46.5F, 4.25F);

        gunModel[289].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
        gunModel[289].setRotationPoint(-10.5F, -48.5F, 4.25F);

        gunModel[290].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
        gunModel[290].setRotationPoint(-10.5F, -47.5F, 4.25F);

        gunModel[291].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F); // Import Box274
        gunModel[291].setRotationPoint(-10.5F, -43.25F, 4F);

        gunModel[292].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box276
        gunModel[292].setRotationPoint(-10.5F, -44.25F, 4F);

        gunModel[293].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box519
        gunModel[293].setRotationPoint(-10.5F, -45.25F, 4F);

        gunModel[294].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F); // Import Box274
        gunModel[294].setRotationPoint(-10.5F, -46.5F, 4.25F);

        gunModel[295].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box276
        gunModel[295].setRotationPoint(-10.5F, -47.5F, 4.25F);

        gunModel[296].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box519
        gunModel[296].setRotationPoint(-10.5F, -48.5F, 4.25F);

        gunModel[297].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 11, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 424
        gunModel[297].setRotationPoint(1.25F, -46F, -5.5F);
        gunModel[297].rotateAngleZ = 0.27925268F;

        gunModel[298].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 11, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 424
        gunModel[298].setRotationPoint(1.25F, -46F, -5.5F);
        gunModel[298].rotateAngleZ = 0.27925268F;

        gunModel[299].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 406
        gunModel[299].setRotationPoint(-12.5F, -47.5F, -6F);

        gunModel[300].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F); // Box 406
        gunModel[300].setRotationPoint(-12.5F, -47.5F, -6F);

        gunModel[301].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 274
        gunModel[301].setRotationPoint(19F, -35F, 2F);

        gunModel[302].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
        gunModel[302].setRotationPoint(19F, -38F, 2F);

        gunModel[303].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
        gunModel[303].setRotationPoint(19F, -37F, 2F);

        gunModel[304].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 274
        gunModel[304].setRotationPoint(19F, -35F, -3F);

        gunModel[305].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
        gunModel[305].setRotationPoint(19F, -38F, -3F);

        gunModel[306].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
        gunModel[306].setRotationPoint(19F, -37F, -3F);

        gunModel[307].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 6, 0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 406
        gunModel[307].setRotationPoint(20.5F, -32F, -3F);

        gunModel[308].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 6, 0F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Box 406
        gunModel[308].setRotationPoint(20.5F, -32F, -3F);

        gunModel[309].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 6, 0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F); // Box 406
        gunModel[309].setRotationPoint(20.5F, -32F, -3F);

        gunModel[310].addShapeBox(0F, 0F, 0F, 6, 8, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 153
        gunModel[310].setRotationPoint(-6F, -37F, -3.5F);

        gunModel[311].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 8, 0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 406
        gunModel[311].setRotationPoint(66.5F, -58.5F, -4F);

        gunModel[312].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 8, 0F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Box 406
        gunModel[312].setRotationPoint(66.5F, -58.5F, -4F);

        gunModel[313].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 8, 0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F); // Box 406
        gunModel[313].setRotationPoint(66.5F, -58.5F, -4F);

        gunModel[314].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F); // Import Box274
        gunModel[314].setRotationPoint(69.5F, -58.25F, -4F);

        gunModel[315].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box276
        gunModel[315].setRotationPoint(69.5F, -59.25F, -4F);

        gunModel[316].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box519
        gunModel[316].setRotationPoint(69.5F, -60.25F, -4F);

        gunModel[317].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 12
        gunModel[317].setRotationPoint(111F, -50F, -1F);

        gunModel[318].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 274
        gunModel[318].setRotationPoint(113.5F, -56.5F, -2.5F);

        gunModel[319].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
        gunModel[319].setRotationPoint(113.5F, -58.5F, -2.5F);

        gunModel[320].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
        gunModel[320].setRotationPoint(113.5F, -57.5F, -2.5F);

        gunModel[321].addShapeBox(0F, 0F, 0F, 42, 3, 2, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F); // Box 73
        gunModel[321].setRotationPoint(6F, -41F, -5F);

        gunModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box262
        gunModel[322].setRotationPoint(35F, -42F, -5F);

        gunModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box262
        gunModel[323].setRotationPoint(28F, -44F, -5F);

        gunModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box262
        gunModel[324].setRotationPoint(35F, -44F, -5F);

        gunModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box262
        gunModel[325].setRotationPoint(28F, -42F, -5F);

        gunModel[326].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box262
        gunModel[326].setRotationPoint(28F, -44F, -5F);

        gunModel[327].addShapeBox(0F, 0F, 0F, 42, 5, 2, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 73
        gunModel[327].setRotationPoint(6F, -49F, -5F);

        gunModel[328].addShapeBox(0F, 0F, 0F, 22, 3, 2, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 73
        gunModel[328].setRotationPoint(6F, -44F, -5F);

        gunModel[329].addShapeBox(0F, 0F, 0F, 12, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
        gunModel[329].setRotationPoint(36F, -44F, -5F);

        gunModel[330].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import Box276
        gunModel[330].setRotationPoint(37F, -42.5F, -5.5F);

        gunModel[331].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Import Box519
        gunModel[331].setRotationPoint(37F, -41.5F, -5.5F);

        gunModel[332].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Import Box519
        gunModel[332].setRotationPoint(37F, -43.5F, -5.5F);

        gunModel[333].addShapeBox(0F, 0F, 0F, 30, 1, 4, 0F, 0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.35F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.35F, -0.5F, 0F); // Box 93
        gunModel[333].setRotationPoint(64.5F, -48.8F, 2F);

        gunModel[334].addShapeBox(0F, 0F, 0F, 31, 1, 4, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.55F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.55F, -0.5F, 0F); // Box 93
        gunModel[334].setRotationPoint(63F, -47.6F, 2F);

        gunModel[335].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 1.25F, -0.5F, 0F, -1.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, 1.25F, -0.5F, -1F, 2F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 2F, 0F, -1F); // Box 91
        gunModel[335].setRotationPoint(63F, -47F, 4F);

        gunModel[336].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 1.25F, -0.5F, 0F, -1.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, 1.25F, -0.5F, -1F, 1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, -1F); // Box 91
        gunModel[336].setRotationPoint(63.55F, -48.1F, 4F);

        gunModel[337].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 1.25F, -0.5F, 0F, -1.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, 1.25F, -0.5F, -1F, 1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, -1F); // Box 91
        gunModel[337].setRotationPoint(64.15F, -49.3F, 4F);

        gunModel[338].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 1.25F, -0.5F, 0F, -1.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, 1.25F, -0.5F, -1F, 1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, -1F); // Box 91
        gunModel[338].setRotationPoint(64.75F, -50.5F, 4F);

        gunModel[339].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0.5F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 92
        gunModel[339].setRotationPoint(51F, -46F, 4F);

        gunModel[340].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.5F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 92
        gunModel[340].setRotationPoint(60F, -48.8F, 4F);

        gunModel[341].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 92
        gunModel[341].setRotationPoint(60F, -47.6F, 4F);

        gunModel[342].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.25F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, -0.25F, -0.25F, 0.5F, -1.25F, 1.25F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, -0.25F, 1.25F, 0.5F, -1.25F); // Box 93
        gunModel[342].setRotationPoint(63F, -49F, 4F);

        gunModel[343].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, -0.25F, 0.75F, 0.5F, -0.25F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, -0.25F, -0.75F, 0.5F, -0.25F); // Box 93
        gunModel[343].setRotationPoint(60.5F, -49F, 4F);

        gunModel[344].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 93
        gunModel[344].setRotationPoint(50.5F, -50F, 4F);

        gunModel[345].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 92
        gunModel[345].setRotationPoint(60F, -50F, -5F);

        gunModel[346].addShapeBox(0F, 0F, 0F, 29, 1, 4, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 93
        gunModel[346].setRotationPoint(65F, -50F, -6F);

        gunModel[347].addShapeBox(0F, 0F, 0F, 31, 1, 4, 0F, -0.25F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 93
        gunModel[347].setRotationPoint(63F, -47F, -6F);

        gunModel[348].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 93
        gunModel[348].setRotationPoint(93.5F, -49.5F, -6F);

        gunModel[349].addShapeBox(0F, 0F, 0F, 29, 2, 4, 0F, -0.25F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, 0F, -0.25F, 0.5F, 0F, 1.25F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, 0F, 1.25F, 0.5F, 0F); // Box 93
        gunModel[349].setRotationPoint(64.5F, -49F, -6F);

        gunModel[350].addShapeBox(0F, 0F, 0F, 30, 1, 4, 0F, 0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.35F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.35F, -0.5F, 0F); // Box 93
        gunModel[350].setRotationPoint(64.5F, -48.8F, -6F);

        gunModel[351].addShapeBox(0F, 0F, 0F, 31, 1, 4, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.55F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.55F, -0.5F, 0F); // Box 93
        gunModel[351].setRotationPoint(63F, -47.6F, -6F);

        gunModel[352].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 1.25F, -0.5F, -1F, -1.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, 1.25F, -0.5F, 0F, 2F, 0F, -1F, -2F, -1F, 0F, -2F, -1F, 0F, 2F, 0F, 0F); // Box 91
        gunModel[352].setRotationPoint(63F, -47F, -6F);

        gunModel[353].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 1.25F, -0.5F, -1F, -1.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, 1.25F, -0.5F, 0F, 1.5F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F); // Box 91
        gunModel[353].setRotationPoint(63.55F, -48.1F, -6F);

        gunModel[354].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 1.25F, -0.5F, -1F, -1.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, 1.25F, -0.5F, 0F, 1.5F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F); // Box 91
        gunModel[354].setRotationPoint(64.15F, -49.3F, -6F);

        gunModel[355].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 1.25F, -0.5F, -1F, -1.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, 1.25F, -0.5F, 0F, 1.5F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F); // Box 91
        gunModel[355].setRotationPoint(64.75F, -50.5F, -6F);

        gunModel[356].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0.5F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 92
        gunModel[356].setRotationPoint(51F, -46F, -5F);

        gunModel[357].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.5F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 92
        gunModel[357].setRotationPoint(60F, -48.8F, -5F);

        gunModel[358].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 92
        gunModel[358].setRotationPoint(60F, -47.6F, -5F);

        gunModel[359].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.25F, 0.5F, -1.25F, 0.75F, 0.5F, -0.25F, 0.75F, 0.5F, 0F, -0.25F, 0.5F, 0F, 1.25F, 0.5F, -1.25F, -0.75F, 0.5F, -0.25F, -0.75F, 0.5F, 0F, 1.25F, 0.5F, 0F); // Box 93
        gunModel[359].setRotationPoint(63F, -49F, -6F);

        gunModel[360].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.75F, 0.5F, -0.25F, 0.75F, 0.5F, -0.25F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0.5F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F); // Box 93
        gunModel[360].setRotationPoint(60.5F, -49F, -5F);

        gunModel[361].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 93
        gunModel[361].setRotationPoint(50.5F, -50F, -5F);

        gunModel[362].addShapeBox(0F, 9F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 332
        gunModel[362].setRotationPoint(21F, -34F, -2F);
        gunModel[362].rotateAngleZ = -0.26179939F;

        gunModel[363].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F); // Import Box274
        gunModel[363].setRotationPoint(47F, -46.5F, 4F);

        gunModel[364].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box276
        gunModel[364].setRotationPoint(47F, -47.5F, 4F);

        gunModel[365].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box519
        gunModel[365].setRotationPoint(47F, -48.5F, 4F);

        gunModel[366].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F); // Import Box274
        gunModel[366].setRotationPoint(44F, -46.5F, 4F);

        gunModel[367].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box276
        gunModel[367].setRotationPoint(44F, -47.5F, 4F);

        gunModel[368].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box519
        gunModel[368].setRotationPoint(44F, -48.5F, 4F);

        gunModel[369].addShapeBox(0F, 0F, 0F, 30, 2, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
        gunModel[369].setRotationPoint(72F, -55.5F, 1.5F);

        gunModel[370].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F); // Box 0
        gunModel[370].setRotationPoint(56F, -49F, -1F);

        gunModel[371].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 1
        gunModel[371].setRotationPoint(56F, -46F, -1F);

        gunModel[372].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
        gunModel[372].setRotationPoint(56F, -48F, -2F);

        gunModel[373].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 4
        gunModel[373].setRotationPoint(56F, -48F, 1F);

        gunModel[374].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 0
        gunModel[374].setRotationPoint(51F, -49F, -1F);

        gunModel[375].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 1
        gunModel[375].setRotationPoint(51F, -46F, -1F);

        gunModel[376].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
        gunModel[376].setRotationPoint(51F, -48F, -2F);

        gunModel[377].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 4
        gunModel[377].setRotationPoint(51F, -48F, 1F);

        gunModel[378].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F, -5F, -1.75F, 0F, -5F, -1.75F, 0F, -5F, -1.75F, 0F, -5F, -1.75F, 0F, -5F, -1.75F, 0F, -5F, -1.75F, 0F, -5F, -1.75F, 0F, -5F, -1.75F, 0F); // Box 76
        gunModel[378].setRotationPoint(-6.5F, -51.75F, 4.01F);

        gunModel[379].addShapeBox(-0.55F, -3.5F, -2F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 486
        gunModel[379].setRotationPoint(115.45F, -60.5F, 1.5F);

        gunModel[380].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[380].setRotationPoint(37F, -44F, -3.62F);


        defaultScopeModel = new ModelRendererTurbo[55];
        defaultScopeModel[0] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 260
        defaultScopeModel[1] = new ModelRendererTurbo(this, 265, 185, textureX, textureY); // Box 261
        defaultScopeModel[2] = new ModelRendererTurbo(this, 313, 185, textureX, textureY); // Box 262
        defaultScopeModel[3] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 263
        defaultScopeModel[4] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 264
        defaultScopeModel[5] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 265
        defaultScopeModel[6] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Box 266
        defaultScopeModel[7] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Box 267
        defaultScopeModel[8] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 268
        defaultScopeModel[9] = new ModelRendererTurbo(this, 473, 177, textureX, textureY); // Box 269
        defaultScopeModel[10] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 270
        defaultScopeModel[11] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 271
        defaultScopeModel[12] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 272
        defaultScopeModel[13] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 273
        defaultScopeModel[14] = new ModelRendererTurbo(this, 377, 161, textureX, textureY); // Box 274
        defaultScopeModel[15] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 275
        defaultScopeModel[16] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 276
        defaultScopeModel[17] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 277
        defaultScopeModel[18] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 278
        defaultScopeModel[19] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 279
        defaultScopeModel[20] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 280
        defaultScopeModel[21] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 281
        defaultScopeModel[22] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 282
        defaultScopeModel[23] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Box 283
        defaultScopeModel[24] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 284
        defaultScopeModel[25] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 332
        defaultScopeModel[26] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 404
        defaultScopeModel[27] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 405
        defaultScopeModel[28] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 273
        defaultScopeModel[29] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 273
        defaultScopeModel[30] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 273
        defaultScopeModel[31] = new ModelRendererTurbo(this, 97, 193, textureX, textureY); // Import Box274
        defaultScopeModel[32] = new ModelRendererTurbo(this, 385, 153, textureX, textureY); // Import Box276
        defaultScopeModel[33] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Import Box519
        defaultScopeModel[34] = new ModelRendererTurbo(this, 17, 161, textureX, textureY); // Import Box276
        defaultScopeModel[35] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Import Box519
        defaultScopeModel[36] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 269
        defaultScopeModel[37] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 269
        defaultScopeModel[38] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 269
        defaultScopeModel[39] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 269
        defaultScopeModel[40] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 269
        defaultScopeModel[41] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 269
        defaultScopeModel[42] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 269
        defaultScopeModel[43] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 269
        defaultScopeModel[44] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 269
        defaultScopeModel[45] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 269
        defaultScopeModel[46] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 269
        defaultScopeModel[47] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Box 269
        defaultScopeModel[48] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 404
        defaultScopeModel[49] = new ModelRendererTurbo(this, 361, 145, textureX, textureY); // Box 405
        defaultScopeModel[50] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Box 332
        defaultScopeModel[51] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 404
        defaultScopeModel[52] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Box 404
        defaultScopeModel[53] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 486
        defaultScopeModel[54] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 486

        defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 19, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        defaultScopeModel[0].setRotationPoint(-11F, -61F, -4F);

        defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
        defaultScopeModel[1].setRotationPoint(-11F, -60F, -4F);

        defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
        defaultScopeModel[2].setRotationPoint(-11F, -60F, 3F);

        defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
        defaultScopeModel[3].setRotationPoint(4F, -63F, -4F);

        defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, -1F, -1F, 1F, 0F, 0F, 0F, 0F); // Box 264
        defaultScopeModel[4].setRotationPoint(6F, -63F, -4F);

        defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 265
        defaultScopeModel[5].setRotationPoint(2F, -63F, -4F);

        defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 266
        defaultScopeModel[6].setRotationPoint(2F, -63F, 2F);

        defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
        defaultScopeModel[7].setRotationPoint(4F, -63F, 2F);

        defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, -1F); // Box 268
        defaultScopeModel[8].setRotationPoint(6F, -61F, 2F);
        defaultScopeModel[8].rotateAngleZ = 1.57079633F;

        defaultScopeModel[9].addShapeBox(1F, 0F, 0F, 15, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 269
        defaultScopeModel[9].setRotationPoint(-10F, -63F, -2F);

        defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 1F, 0F); // Box 270
        defaultScopeModel[10].setRotationPoint(-2F, -62F, 2F);

        defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 271
        defaultScopeModel[11].setRotationPoint(-2F, -61F, -3F);
        defaultScopeModel[11].rotateAngleZ = 1.57079633F;

        defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 272
        defaultScopeModel[12].setRotationPoint(-10F, -64F, -3F);

        defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
        defaultScopeModel[13].setRotationPoint(-10F, -64F, 2F);

        defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 274
        defaultScopeModel[14].setRotationPoint(-4F, -62F, -4.5F);

        defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
        defaultScopeModel[15].setRotationPoint(-4F, -64F, -4.5F);

        defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
        defaultScopeModel[16].setRotationPoint(-4F, -64F, 1.5F);

        defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
        defaultScopeModel[17].setRotationPoint(-4F, -63F, -4F);

        defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 278
        defaultScopeModel[18].setRotationPoint(-4F, -63F, 2F);

        defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
        defaultScopeModel[19].setRotationPoint(-9F, -61F, 4F);

        defaultScopeModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
        defaultScopeModel[20].setRotationPoint(3F, -61F, 4F);

        defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 281
        defaultScopeModel[21].setRotationPoint(-9F, -59F, 4F);

        defaultScopeModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 282
        defaultScopeModel[22].setRotationPoint(3F, -59F, 4F);

        defaultScopeModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
        defaultScopeModel[23].setRotationPoint(-9F, -60F, 3.5F);

        defaultScopeModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
        defaultScopeModel[24].setRotationPoint(3F, -60F, 3.5F);

        defaultScopeModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
        defaultScopeModel[25].setRotationPoint(-10F, -64.5F, 0.5F);

        defaultScopeModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
        defaultScopeModel[26].setRotationPoint(-10F, -65.5F, 0.5F);

        defaultScopeModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 405
        defaultScopeModel[27].setRotationPoint(-10F, -65.5F, -0.5F);

        defaultScopeModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
        defaultScopeModel[28].setRotationPoint(-10F, -63F, 0.5F);

        defaultScopeModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
        defaultScopeModel[29].setRotationPoint(-10F, -63F, -1.5F);

        defaultScopeModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
        defaultScopeModel[30].setRotationPoint(-10F, -63F, -0.5F);

        defaultScopeModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Import Box274
        defaultScopeModel[31].setRotationPoint(-4F, -62F, -5F);

        defaultScopeModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import Box276
        defaultScopeModel[32].setRotationPoint(-4F, -63F, -5F);

        defaultScopeModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import Box519
        defaultScopeModel[33].setRotationPoint(-4F, -64F, -5F);

        defaultScopeModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import Box276
        defaultScopeModel[34].setRotationPoint(-4F, -63F, 1F);

        defaultScopeModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import Box519
        defaultScopeModel[35].setRotationPoint(-4F, -64F, 1F);

        defaultScopeModel[36].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0.5F, 0F, -0.9F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 269
        defaultScopeModel[36].setRotationPoint(-7F, -64F, -2F);

        defaultScopeModel[37].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, 0.5F, 0F, -0.9F, 0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
        defaultScopeModel[37].setRotationPoint(-7F, -64F, 1F);

        defaultScopeModel[38].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0.5F, 0F, -0.9F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 269
        defaultScopeModel[38].setRotationPoint(-5F, -64F, -2F);

        defaultScopeModel[39].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, 0.5F, 0F, -0.9F, 0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
        defaultScopeModel[39].setRotationPoint(-5F, -64F, 1F);

        defaultScopeModel[40].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0.5F, 0F, -0.9F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 269
        defaultScopeModel[40].setRotationPoint(-3F, -64F, -2F);

        defaultScopeModel[41].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, 0.5F, 0F, -0.9F, 0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
        defaultScopeModel[41].setRotationPoint(-3F, -64F, 1F);

        defaultScopeModel[42].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0.5F, 0F, -0.9F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 269
        defaultScopeModel[42].setRotationPoint(-1F, -64F, -2F);

        defaultScopeModel[43].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, 0.5F, 0F, -0.9F, 0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
        defaultScopeModel[43].setRotationPoint(-1F, -64F, 1F);

        defaultScopeModel[44].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0.5F, 0F, -0.9F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 269
        defaultScopeModel[44].setRotationPoint(-9F, -64F, -2F);

        defaultScopeModel[45].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, 0.5F, 0F, -0.9F, 0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
        defaultScopeModel[45].setRotationPoint(-9F, -64F, 1F);

        defaultScopeModel[46].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0.5F, 0F, -0.9F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 269
        defaultScopeModel[46].setRotationPoint(1F, -64F, -2F);

        defaultScopeModel[47].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, 0.5F, 0F, -0.9F, 0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
        defaultScopeModel[47].setRotationPoint(1F, -64F, 1F);

        defaultScopeModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 404
        defaultScopeModel[48].setRotationPoint(-10F, -63.5F, 0.5F);

        defaultScopeModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
        defaultScopeModel[49].setRotationPoint(-10F, -63.5F, -0.5F);

        defaultScopeModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 332
        defaultScopeModel[50].setRotationPoint(-10F, -64.5F, -1.5F);

        defaultScopeModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 404
        defaultScopeModel[51].setRotationPoint(-10F, -65.5F, -1.5F);

        defaultScopeModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F); // Box 404
        defaultScopeModel[52].setRotationPoint(-10F, -63.5F, -1.5F);

        defaultScopeModel[53].addShapeBox(-0.55F, -3.5F, -2F, 1, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 486
        defaultScopeModel[53].setRotationPoint(-9.55F, -61F, 0.37F);

        defaultScopeModel[54].addShapeBox(-0.55F, -3.5F, 1F, 1, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 486
        defaultScopeModel[54].setRotationPoint(-9.55F, -61F, -0.37F);


        defaultStockModel = new ModelRendererTurbo[39];
        defaultStockModel[0] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 176
        defaultStockModel[1] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 177
        defaultStockModel[2] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 185
        defaultStockModel[3] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 186
        defaultStockModel[4] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 187
        defaultStockModel[5] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 188
        defaultStockModel[6] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 189
        defaultStockModel[7] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 190
        defaultStockModel[8] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 192
        defaultStockModel[9] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 193
        defaultStockModel[10] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 194
        defaultStockModel[11] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 195
        defaultStockModel[12] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 196
        defaultStockModel[13] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 197
        defaultStockModel[14] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 198
        defaultStockModel[15] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 199
        defaultStockModel[16] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 200
        defaultStockModel[17] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 202
        defaultStockModel[18] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 204
        defaultStockModel[19] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 205
        defaultStockModel[20] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 206
        defaultStockModel[21] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 207
        defaultStockModel[22] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 208
        defaultStockModel[23] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 209
        defaultStockModel[24] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 210
        defaultStockModel[25] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 211
        defaultStockModel[26] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 212
        defaultStockModel[27] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 213
        defaultStockModel[28] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 214
        defaultStockModel[29] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 215
        defaultStockModel[30] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 216
        defaultStockModel[31] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 217
        defaultStockModel[32] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 218
        defaultStockModel[33] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 349
        defaultStockModel[34] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Box 350
        defaultStockModel[35] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 351
        defaultStockModel[36] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Box 352
        defaultStockModel[37] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 353
        defaultStockModel[38] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 354

        defaultStockModel[0].addShapeBox(-56.5F, 2F, -9.5F, 51, 10, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
        defaultStockModel[0].setRotationPoint(-17.5F, -50F, 5.5F);

        defaultStockModel[1].addShapeBox(-60.5F, 0F, -7.5F, 58, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 177
        defaultStockModel[1].setRotationPoint(-17.5F, -50F, 5.5F);

        defaultStockModel[2].addShapeBox(-59.5F, 0F, -9.5F, 5, 15, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
        defaultStockModel[2].setRotationPoint(-17.5F, -38F, 5.5F);

        defaultStockModel[3].addShapeBox(-54.5F, 0F, -8.5F, 1, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 186
        defaultStockModel[3].setRotationPoint(-17.5F, -38F, 4.5F);

        defaultStockModel[4].addShapeBox(-53.5F, 0F, -8.5F, 2, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 187
        defaultStockModel[4].setRotationPoint(-17.5F, -39F, 4.5F);

        defaultStockModel[5].addShapeBox(-54.5F, 0F, -9.5F, 2, 11, 8, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 188
        defaultStockModel[5].setRotationPoint(-17.5F, -34F, 5.5F);

        defaultStockModel[6].addShapeBox(-59.5F, 0F, -7.5F, 5, 3, 4, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
        defaultStockModel[6].setRotationPoint(-17.5F, -23F, 5.5F);

        defaultStockModel[7].addShapeBox(-60.5F, 0F, -9.5F, 4, 11, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 190
        defaultStockModel[7].setRotationPoint(-17.5F, -48F, 5.5F);

        defaultStockModel[8].addShapeBox(-54.5F, 0F, -9.5F, 2, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -2F); // Box 192
        defaultStockModel[8].setRotationPoint(-17.5F, -23F, 5.5F);

        defaultStockModel[9].addShapeBox(-54.5F, 0F, -9.5F, 2, 3, 8, 0F, -1F, 0F, 0F, 1F, -1F, -3F, 1F, -1F, -3F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F); // Box 193
        defaultStockModel[9].setRotationPoint(-17.5F, -37F, 5.5F);

        defaultStockModel[10].addShapeBox(-53.5F, 0F, -9.5F, 2, 2, 8, 0F, -2F, 0F, 0F, 3F, 0F, -3F, 3F, 0F, -3F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F); // Box 194
        defaultStockModel[10].setRotationPoint(-17.5F, -38F, 5.5F);

        defaultStockModel[11].addShapeBox(-51.5F, 0F, -6.5F, 12, 2, 2, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 195
        defaultStockModel[11].setRotationPoint(-17.5F, -38F, 5.5F);

        defaultStockModel[12].addShapeBox(-44.5F, 0F, -6.5F, 2, 15, 2, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 7F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 7F, 0F, 0F); // Box 196
        defaultStockModel[12].setRotationPoint(-17.5F, -36F, 5.5F);

        defaultStockModel[13].addShapeBox(-49.5F, 0F, -6.5F, 2, 15, 2, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 7F, 0F, 0F); // Box 197
        defaultStockModel[13].setRotationPoint(-17.5F, -36F, 5.5F);

        defaultStockModel[14].addShapeBox(-53.5F, 0F, -6.5F, 4, 3, 2, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
        defaultStockModel[14].setRotationPoint(-17.5F, -24F, 5.5F);

        defaultStockModel[15].addShapeBox(-48.5F, 0F, -6.5F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 199
        defaultStockModel[15].setRotationPoint(-17.5F, -36F, 5.5F);

        defaultStockModel[16].addShapeBox(-53F, 0F, -6.5F, 2, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
        defaultStockModel[16].setRotationPoint(-17.5F, -25.5F, 5.5F);

        defaultStockModel[17].addShapeBox(-30.5F, 0F, -5.5F, 3, 2, 2, 0F, 1F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 202
        defaultStockModel[17].setRotationPoint(-17.5F, -38F, 4.5F);

        defaultStockModel[18].addShapeBox(-36.5F, 0F, -5.5F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F); // Box 204
        defaultStockModel[18].setRotationPoint(-17.5F, -38F, 4.5F);

        defaultStockModel[19].addShapeBox(-36.5F, 0F, -7F, 5, 3, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 205
        defaultStockModel[19].setRotationPoint(-17.5F, -38F, 4.5F);

        defaultStockModel[20].addShapeBox(-36.5F, 0F, -3F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 206
        defaultStockModel[20].setRotationPoint(-17.5F, -38F, 4.5F);

        defaultStockModel[21].addShapeBox(-41.5F, 0F, -5.5F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 207
        defaultStockModel[21].setRotationPoint(-17.5F, -36F, 4.5F);

        defaultStockModel[22].addShapeBox(-36.5F, 0F, -6F, 5, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 208
        defaultStockModel[22].setRotationPoint(-17.5F, -38F, 4.5F);

        defaultStockModel[23].addShapeBox(-45.5F, 0F, -6.5F, 2, 2, 2, 0F, 2.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F); // Box 209
        defaultStockModel[23].setRotationPoint(-17.5F, -36F, 5.5F);

        defaultStockModel[24].addShapeBox(-50.5F, 0F, -9.5F, 31, 6, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3.5F, 0F, 0F); // Box 210
        defaultStockModel[24].setRotationPoint(-17.5F, -48F, 4.5F);

        defaultStockModel[25].addShapeBox(-46.5F, 0F, -9.5F, 23, 2, 10, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0.5F, 0.5F, -1F); // Box 211
        defaultStockModel[25].setRotationPoint(-17.5F, -42F, 4.5F);

        defaultStockModel[26].addShapeBox(-23.5F, 0F, -9.5F, 4, 8, 10, 0F, -4F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, -4F, 0F, 0F, 0F, -2F, 0F, -4F, 0.5F, -1F, -4F, 0.5F, -1F, 0F, -2F, 0F); // Box 212
        defaultStockModel[26].setRotationPoint(-17.5F, -48F, 4.5F);

        defaultStockModel[27].addShapeBox(-50.5F, 0F, -9.5F, 4, 8, 10, 0F, 0F, -1F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -1F, -1F, -3.5F, 0.5F, -1F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -3.5F, 0.5F, -1F); // Box 213
        defaultStockModel[27].setRotationPoint(-17.5F, -48F, 4.5F);

        defaultStockModel[28].addShapeBox(-50.5F, 0F, -9.5F, 31, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
        defaultStockModel[28].setRotationPoint(-17.5F, -50F, 4.5F);

        defaultStockModel[29].addShapeBox(-50.5F, 0F, -9.5F, 31, 2, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, 0.5F, 0F, -1F, 0.5F); // Box 215
        defaultStockModel[29].setRotationPoint(-17.5F, -52F, 4.5F);

        defaultStockModel[30].addShapeBox(-50.5F, 0F, -7.5F, 31, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 216
        defaultStockModel[30].setRotationPoint(-17.5F, -52F, 4.5F);

        defaultStockModel[31].addShapeBox(-50.5F, 0F, -0.5F, 31, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
        defaultStockModel[31].setRotationPoint(-17.5F, -50F, 4.5F);

        defaultStockModel[32].addShapeBox(-50.5F, 0F, -1.5F, 31, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 218
        defaultStockModel[32].setRotationPoint(-17.5F, -52F, 4.5F);

        defaultStockModel[33].addShapeBox(-5.5F, 8F, -9.5F, 1, 4, 8, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
        defaultStockModel[33].setRotationPoint(-17.5F, -50F, 5.5F);

        defaultStockModel[34].addShapeBox(-5.5F, 2F, -9.5F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 350
        defaultStockModel[34].setRotationPoint(-17.5F, -50F, 5.5F);

        defaultStockModel[35].addShapeBox(-4.5F, 2F, -9.5F, 2, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
        defaultStockModel[35].setRotationPoint(-17.5F, -50F, 5.5F);

        defaultStockModel[36].addShapeBox(-4.5F, 8F, -9.5F, 2, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
        defaultStockModel[36].setRotationPoint(-17.5F, -50F, 5.5F);

        defaultStockModel[37].addShapeBox(-26.5F, 0F, -9F, 25, 9, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 353
        defaultStockModel[37].setRotationPoint(-17.5F, -48F, 5.5F);

        defaultStockModel[38].addShapeBox(-26.5F, 0F, -7F, 25, 1, 3, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 354
        defaultStockModel[38].setRotationPoint(-17.5F, -49F, 5.5F);


        ammoModel = new ModelRendererTurbo[15];
        ammoModel[0] = new ModelRendererTurbo(this, 2, 260, textureX, textureY); // Import Import
        ammoModel[1] = new ModelRendererTurbo(this, 64, 280, textureX, textureY); // Import Import
        ammoModel[2] = new ModelRendererTurbo(this, 64, 310, textureX, textureY); // Import Import
        ammoModel[3] = new ModelRendererTurbo(this, 63, 340, textureX, textureY); // Import Import
        ammoModel[4] = new ModelRendererTurbo(this, 64, 370, textureX, textureY); // Import Import
        ammoModel[5] = new ModelRendererTurbo(this, 2, 300, textureX, textureY); // Import Import
        ammoModel[6] = new ModelRendererTurbo(this, 2, 320, textureX, textureY); // Import Import
        ammoModel[7] = new ModelRendererTurbo(this, 2, 340, textureX, textureY); // Import Import
        ammoModel[8] = new ModelRendererTurbo(this, 2, 360, textureX, textureY); // Import Import
        ammoModel[9] = new ModelRendererTurbo(this, 2, 380, textureX, textureY); // Import Import
        ammoModel[10] = new ModelRendererTurbo(this, 2, 278, textureX, textureY); // Import Import
        ammoModel[11] = new ModelRendererTurbo(this, 31, 320, textureX, textureY); // Import Import
        ammoModel[12] = new ModelRendererTurbo(this, 30, 340, textureX, textureY); // Import Import
        ammoModel[13] = new ModelRendererTurbo(this, 30, 360, textureX, textureY); // Import Import
        ammoModel[14] = new ModelRendererTurbo(this, 30, 380, textureX, textureY); // Import Import

        ammoModel[0].addShapeBox(0F, 0F, 0F, 13, 5, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        ammoModel[0].setRotationPoint(24F, -44F, -3.5F);

        ammoModel[1].addShapeBox(0F, 0F, 0F, 13, 11, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, -1.0F, 0.0F, 2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import Import
        ammoModel[1].setRotationPoint(24F, -39F, -3.5F);

        ammoModel[2].addShapeBox(0F, 0F, 0F, 13, 12, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 1.0F, 0.0F, 4.0F, -1.0F, 0.0F, 4.0F, -1.0F, 0.0F, -4.0F, 1.0F, 0.0F); // Import Import
        ammoModel[2].setRotationPoint(26F, -28F, -3.5F);

        ammoModel[3].addShapeBox(0F, 0F, 0F, 13, 11, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 3.0F, 0.0F, 6.0F, -1.0F, 0.0F, 6.0F, -1.0F, 0.0F, -6.0F, 3.0F, 0.0F); // Import Import
        ammoModel[3].setRotationPoint(30F, -15F, -3.5F);

        ammoModel[4].addShapeBox(0F, 0F, 0F, 13, 11, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 5.0F, -8.0F, 0.0F, 5.0F, -8.0F, 0.0F, -6.0F, 0.0F, 0.0F); // Import Import
        ammoModel[4].setRotationPoint(36F, -1F, -3.5F);

        ammoModel[5].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        ammoModel[5].setRotationPoint(37F, -44F, -2.5F);

        ammoModel[6].addShapeBox(0F, 0F, 0F, 5, 11, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import Import
        ammoModel[6].setRotationPoint(37F, -40F, -2.5F);

        ammoModel[7].addShapeBox(0F, 0F, 0F, 5, 12, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F); // Import Import
        ammoModel[7].setRotationPoint(39F, -29F, -2.5F);

        ammoModel[8].addShapeBox(0F, 0F, 0F, 5, 12, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 8.0F, 3.0F, 0.0F, 8.0F, 3.0F, 0.0F, -6.0F, 0.0F, 0.0F); // Import Import
        ammoModel[8].setRotationPoint(43F, -17F, -2.5F);

        ammoModel[9].addShapeBox(0F, 0F, 0F, 5, 6, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 1.0F, 0.0F, 4.0F, -2.0F, 0.0F, 4.0F, -2.0F, 0.0F, -5.0F, 1.0F, 0.0F); // Import Import
        ammoModel[9].setRotationPoint(49F, -5F, -2.5F);

        ammoModel[10].addShapeBox(0F, 0F, 0F, 5, 17, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F); // Import Import
        ammoModel[10].setRotationPoint(22F, -43.9F, -1.5F);

        ammoModel[11].addShapeBox(0F, 0F, 0F, 2, 11, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F); // Import Import
        ammoModel[11].setRotationPoint(37F, -40F, -3.5F);

        ammoModel[12].addShapeBox(0F, 0F, 0F, 2, 12, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, -1.0F, 4.0F, 0.0F, -1.0F, -4.0F, 0.0F, 0.0F); // Import Import
        ammoModel[12].setRotationPoint(39F, -29F, -3.5F);

        ammoModel[13].addShapeBox(0F, 0F, 0F, 2, 12, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 0.0F, -1.0F, 6.0F, 0.0F, -1.0F, -6.0F, 0.0F, 0.0F); // Import Import
        ammoModel[13].setRotationPoint(43F, -17F, -3.5F);

        ammoModel[14].addShapeBox(0F, 0F, 0F, 2, 6, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -5.0F, 1.0F, 0.0F, 4.0F, 0.0F, -1.0F, 4.0F, 0.0F, -1.0F, -5.0F, 1.0F, 0.0F); // Import Import
        ammoModel[14].setRotationPoint(49F, -5F, -3.5F);

        extraAmmoModel = new ModelRendererTurbo[15];
        extraAmmoModel[0] = new ModelRendererTurbo(this, 2, 260, textureX, textureY); // Import Import
        extraAmmoModel[1] = new ModelRendererTurbo(this, 64, 280, textureX, textureY); // Import Import
        extraAmmoModel[2] = new ModelRendererTurbo(this, 64, 310, textureX, textureY); // Import Import
        extraAmmoModel[3] = new ModelRendererTurbo(this, 63, 340, textureX, textureY); // Import Import
        extraAmmoModel[4] = new ModelRendererTurbo(this, 64, 370, textureX, textureY); // Import Import
        extraAmmoModel[5] = new ModelRendererTurbo(this, 2, 300, textureX, textureY); // Import Import
        extraAmmoModel[6] = new ModelRendererTurbo(this, 2, 320, textureX, textureY); // Import Import
        extraAmmoModel[7] = new ModelRendererTurbo(this, 2, 340, textureX, textureY); // Import Import
        extraAmmoModel[8] = new ModelRendererTurbo(this, 2, 360, textureX, textureY); // Import Import
        extraAmmoModel[9] = new ModelRendererTurbo(this, 2, 380, textureX, textureY); // Import Import
        extraAmmoModel[10] = new ModelRendererTurbo(this, 2, 278, textureX, textureY); // Import Import
        extraAmmoModel[11] = new ModelRendererTurbo(this, 31, 320, textureX, textureY); // Import Import
        extraAmmoModel[12] = new ModelRendererTurbo(this, 30, 340, textureX, textureY); // Import Import
        extraAmmoModel[13] = new ModelRendererTurbo(this, 30, 360, textureX, textureY); // Import Import
        extraAmmoModel[14] = new ModelRendererTurbo(this, 30, 380, textureX, textureY); // Import Import

        extraAmmoModel[0].addShapeBox(0F, 0F, 0F, 13, 5, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        extraAmmoModel[0].setRotationPoint(24F, -44F, -3.5F);

        extraAmmoModel[1].addShapeBox(0F, 0F, 0F, 13, 11, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, -1.0F, 0.0F, 2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import Import
        extraAmmoModel[1].setRotationPoint(24F, -39F, -3.5F);

        extraAmmoModel[2].addShapeBox(0F, 0F, 0F, 13, 12, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 1.0F, 0.0F, 4.0F, -1.0F, 0.0F, 4.0F, -1.0F, 0.0F, -4.0F, 1.0F, 0.0F); // Import Import
        extraAmmoModel[2].setRotationPoint(26F, -28F, -3.5F);

        extraAmmoModel[3].addShapeBox(0F, 0F, 0F, 13, 11, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 3.0F, 0.0F, 6.0F, -1.0F, 0.0F, 6.0F, -1.0F, 0.0F, -6.0F, 3.0F, 0.0F); // Import Import
        extraAmmoModel[3].setRotationPoint(30F, -15F, -3.5F);

        extraAmmoModel[4].addShapeBox(0F, 0F, 0F, 13, 11, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 5.0F, -8.0F, 0.0F, 5.0F, -8.0F, 0.0F, -6.0F, 0.0F, 0.0F); // Import Import
        extraAmmoModel[4].setRotationPoint(36F, -1F, -3.5F);

        extraAmmoModel[5].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        extraAmmoModel[5].setRotationPoint(37F, -44F, -2.5F);

        extraAmmoModel[6].addShapeBox(0F, 0F, 0F, 5, 11, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import Import
        extraAmmoModel[6].setRotationPoint(37F, -40F, -2.5F);

        extraAmmoModel[7].addShapeBox(0F, 0F, 0F, 5, 12, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F); // Import Import
        extraAmmoModel[7].setRotationPoint(39F, -29F, -2.5F);

        extraAmmoModel[8].addShapeBox(0F, 0F, 0F, 5, 12, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 8.0F, 3.0F, 0.0F, 8.0F, 3.0F, 0.0F, -6.0F, 0.0F, 0.0F); // Import Import
        extraAmmoModel[8].setRotationPoint(43F, -17F, -2.5F);

        extraAmmoModel[9].addShapeBox(0F, 0F, 0F, 5, 6, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 1.0F, 0.0F, 4.0F, -2.0F, 0.0F, 4.0F, -2.0F, 0.0F, -5.0F, 1.0F, 0.0F); // Import Import
        extraAmmoModel[9].setRotationPoint(49F, -5F, -2.5F);

        extraAmmoModel[10].addShapeBox(0F, 0F, 0F, 5, 17, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F); // Import Import
        extraAmmoModel[10].setRotationPoint(22F, -43.9F, -1.5F);

        extraAmmoModel[11].addShapeBox(0F, 0F, 0F, 2, 11, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F); // Import Import
        extraAmmoModel[11].setRotationPoint(37F, -40F, -3.5F);

        extraAmmoModel[12].addShapeBox(0F, 0F, 0F, 2, 12, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, -1.0F, 4.0F, 0.0F, -1.0F, -4.0F, 0.0F, 0.0F); // Import Import
        extraAmmoModel[12].setRotationPoint(39F, -29F, -3.5F);

        extraAmmoModel[13].addShapeBox(0F, 0F, 0F, 2, 12, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 0.0F, -1.0F, 6.0F, 0.0F, -1.0F, -6.0F, 0.0F, 0.0F); // Import Import
        extraAmmoModel[13].setRotationPoint(43F, -17F, -3.5F);

        extraAmmoModel[14].addShapeBox(0F, 0F, 0F, 2, 6, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -5.0F, 1.0F, 0.0F, 4.0F, 0.0F, -1.0F, 4.0F, 0.0F, -1.0F, -5.0F, 1.0F, 0.0F); // Import Import
        extraAmmoModel[14].setRotationPoint(49F, -5F, -3.5F);


        slideModel = new ModelRendererTurbo[26];
        slideModel[0] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 109
        slideModel[1] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 112
        slideModel[2] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 117
        slideModel[3] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 119
        slideModel[4] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 123
        slideModel[5] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box 335
        slideModel[6] = new ModelRendererTurbo(this, 225, 241, textureX, textureY); // Box 1
        slideModel[7] = new ModelRendererTurbo(this, 241, 241, textureX, textureY); // Box 2
        slideModel[8] = new ModelRendererTurbo(this, 257, 241, textureX, textureY); // Box 3
        slideModel[9] = new ModelRendererTurbo(this, 25, 209, textureX, textureY); // Box 567
        slideModel[10] = new ModelRendererTurbo(this, 113, 209, textureX, textureY); // Box 568
        slideModel[11] = new ModelRendererTurbo(this, 505, 209, textureX, textureY); // Box 570
        slideModel[12] = new ModelRendererTurbo(this, 49, 217, textureX, textureY); // Box 1
        slideModel[13] = new ModelRendererTurbo(this, 273, 241, textureX, textureY); // Box 2
        slideModel[14] = new ModelRendererTurbo(this, 281, 241, textureX, textureY); // Box 4
        slideModel[15] = new ModelRendererTurbo(this, 289, 241, textureX, textureY); // Box 1
        slideModel[16] = new ModelRendererTurbo(this, 305, 241, textureX, textureY); // Box 1
        slideModel[17] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Box 1
        slideModel[18] = new ModelRendererTurbo(this, 337, 241, textureX, textureY); // Box 1
        slideModel[19] = new ModelRendererTurbo(this, 353, 241, textureX, textureY); // Box 1
        slideModel[20] = new ModelRendererTurbo(this, 369, 241, textureX, textureY); // Box 1
        slideModel[21] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 1
        slideModel[22] = new ModelRendererTurbo(this, 401, 241, textureX, textureY); // Box 1
        slideModel[23] = new ModelRendererTurbo(this, 417, 241, textureX, textureY); // Box 3
        slideModel[24] = new ModelRendererTurbo(this, 433, 241, textureX, textureY); // Box 570
        slideModel[25] = new ModelRendererTurbo(this, 281, 241, textureX, textureY); // Box 4

        slideModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 109
        slideModel[0].setRotationPoint(68F, -55.5F, 3F);

        slideModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
        slideModel[1].setRotationPoint(69F, -55.5F, 6F);

        slideModel[2].addShapeBox(0F, 0F, 0F, 41, 6, 8, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 117
        slideModel[2].setRotationPoint(28.5F, -56F, -4F);

        slideModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
        slideModel[3].setRotationPoint(69F, -55.5F, 5F);

        slideModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
        slideModel[4].setRotationPoint(68F, -55.5F, 2F);

        slideModel[5].addShapeBox(0F, 0F, 0F, 22, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
        slideModel[5].setRotationPoint(28.5F, -50F, -3F);

        slideModel[6].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 1
        slideModel[6].setRotationPoint(52.5F, -49.5F, -1F);

        slideModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
        slideModel[7].setRotationPoint(52.5F, -45.5F, -1F);

        slideModel[8].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
        slideModel[8].setRotationPoint(52.5F, -47.5F, -3F);

        slideModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 567
        slideModel[9].setRotationPoint(50.5F, -48.5F, -1F);

        slideModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 568
        slideModel[10].setRotationPoint(50.5F, -45.5F, -1F);

        slideModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 570
        slideModel[11].setRotationPoint(50.5F, -47.5F, 1F);

        slideModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 1
        slideModel[12].setRotationPoint(51.5F, -49.5F, -1F);

        slideModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 2
        slideModel[13].setRotationPoint(51.5F, -45.5F, -1F);

        slideModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 4
        slideModel[14].setRotationPoint(51.5F, -47.5F, 1F);

        slideModel[15].addShapeBox(-2F, -3.5F, -0.5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
        slideModel[15].setRotationPoint(54.5F, -46.5F, 0F);

        slideModel[16].addShapeBox(-2F, -3.5F, -0.5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
        slideModel[16].setRotationPoint(54.5F, -46.5F, 0F);
        slideModel[16].rotateAngleX = 0.78539816F;

        slideModel[17].addShapeBox(-2F, -3.5F, -0.5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
        slideModel[17].setRotationPoint(54.5F, -46.5F, 0F);
        slideModel[17].rotateAngleX = 1.57079633F;

        slideModel[18].addShapeBox(-2F, -3.5F, -0.5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
        slideModel[18].setRotationPoint(54.5F, -46.5F, 0F);
        slideModel[18].rotateAngleX = 2.35619449F;

        slideModel[19].addShapeBox(-2F, -3.5F, -0.5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
        slideModel[19].setRotationPoint(54.5F, -46.5F, 0F);
        slideModel[19].rotateAngleX = 3.14159265F;

        slideModel[20].addShapeBox(-2F, -3.5F, -0.5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
        slideModel[20].setRotationPoint(54.5F, -46.5F, 0F);
        slideModel[20].rotateAngleX = -0.78539816F;

        slideModel[21].addShapeBox(-2F, -3.5F, -0.5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
        slideModel[21].setRotationPoint(54.5F, -46.5F, 0F);
        slideModel[21].rotateAngleX = -1.57079633F;

        slideModel[22].addShapeBox(-2F, -3.5F, -0.5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
        slideModel[22].setRotationPoint(54.5F, -46.5F, 0F);
        slideModel[22].rotateAngleX = -2.35619449F;

        slideModel[23].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
        slideModel[23].setRotationPoint(52.5F, -47.5F, 1F);

        slideModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 570
        slideModel[24].setRotationPoint(50.5F, -47.5F, -2F);

        slideModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
        slideModel[25].setRotationPoint(51.5F, -47.5F, -3F);


        barrelAttachPoint = new Vector3f(121F / 16F, 47F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(86F / 16F, 48F / 16F, -6F / 16F);
        scopeAttachPoint = new Vector3f(10F / 16F, 59F / 16F, 0F / 16F);
        gripAttachPoint = new Vector3f(71F / 16F, 41F / 16F, 0F / 16F);
        stockAttachPoint = new Vector3f(-20F / 16F, 44F / 16F, 0F / 16F);
        thirdPersonOffset = new Vector3f(0.2875D, -0.09375D, 0.0D);
        gunSlideDistance = 1.4F;

        leftArmPos = new Vector3f(2F, 0.1F, -8.5F);
        leftArmRot = new Vector3f(-80F, -55F, 0.0F);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
        rightArmPos = new Vector3f(0.24F, -0.6F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        enableNewArm = true;

        leftArmReloadPos = new Vector3f(-0.15F, -0.55F, 0.05F);
        leftArmReloadRot = new Vector3f(80F, 50F, 0.0F);
        rightArmReloadPos = new Vector3f(0.24F, -0.6F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85F);


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
        leftHandAmmo = false;
        crouchZoom = -0.05F;
        zoomOffset = 0.275F;

        Vector3f vec3 = new Vector3f(2F, -8F, 0F);
        translateAll(vec3.x, -vec3.y, vec3.z);
        vec3.y = ((Vector3f) vec3.scale(1 / 16F)).y;
        barrelAttachPoint = Vector3f.add(barrelAttachPoint, vec3, null);
        gadgetAttachPoint = Vector3f.add(gadgetAttachPoint, vec3, null);
        scopeAttachPoint = Vector3f.add(scopeAttachPoint, vec3, null);
        gripAttachPoint = Vector3f.add(gripAttachPoint, vec3, null);
        zoomOffsetY = -0.02F;
        gunOffset = -0.35F;

        hasFlash = true;
        flashScale = 5F;
        muzzleFlashPoint = new Vector3f(
                barrelAttachPoint.x / flashScale,
                barrelAttachPoint.y / flashScale,
                barrelAttachPoint.z / flashScale
        );

        flipAll();
    }
}