//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: P90
// Model Creator: 
// Created on: 08.08.2020 - 02:30:41
// Last changed on: 08.08.2020 - 02:30:41

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelP90 extends ModelGun //Same as Filename
{
    int textureX = 512;
    int textureY = 256;

    public ModelP90() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[349];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box151
        gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box152
        gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box153
        gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box154
        gunModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 449
        gunModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 450
        gunModel[6] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 451
        gunModel[7] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 452
        gunModel[8] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 453
        gunModel[9] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 454
        gunModel[10] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 866
        gunModel[11] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 867
        gunModel[12] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 868
        gunModel[13] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 869
        gunModel[14] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 870
        gunModel[15] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 872
        gunModel[16] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 873
        gunModel[17] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 874
        gunModel[18] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 875
        gunModel[19] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 876
        gunModel[20] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 877
        gunModel[21] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 878
        gunModel[22] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 879
        gunModel[23] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 880
        gunModel[24] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 881
        gunModel[25] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box74
        gunModel[26] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Import Box80
        gunModel[27] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Import Box81
        gunModel[28] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Import Box82
        gunModel[29] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Import Box84
        gunModel[30] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box85
        gunModel[31] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Import Box86
        gunModel[32] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Import Box87
        gunModel[33] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Import Box88
        gunModel[34] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box89
        gunModel[35] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Import Box92
        gunModel[36] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Import Box93
        gunModel[37] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Import Box94
        gunModel[38] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import Box95
        gunModel[39] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import Box96
        gunModel[40] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Import Box97
        gunModel[41] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Import Box98
        gunModel[42] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Import Box99
        gunModel[43] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Import Box100
        gunModel[44] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Import Box101
        gunModel[45] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box102
        gunModel[46] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Import Box103
        gunModel[47] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Import Box104
        gunModel[48] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Import Box105
        gunModel[49] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Import Box106
        gunModel[50] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Import Box107
        gunModel[51] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Import Box108
        gunModel[52] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Import Box109
        gunModel[53] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Import Box110
        gunModel[54] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Import Box111
        gunModel[55] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Import Box112
        gunModel[56] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Import Box113
        gunModel[57] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Import Box114
        gunModel[58] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Import Box115
        gunModel[59] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Import Box116
        gunModel[60] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Import Box117
        gunModel[61] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import Box118
        gunModel[62] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Import Box117
        gunModel[63] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Import Box118
        gunModel[64] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Import Box119
        gunModel[65] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Import Box120
        gunModel[66] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box121
        gunModel[67] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Import Box122
        gunModel[68] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Import Box123
        gunModel[69] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Import Box124
        gunModel[70] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Import Box125
        gunModel[71] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Import Box126
        gunModel[72] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Import Box127
        gunModel[73] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Import Box128
        gunModel[74] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Import Box129
        gunModel[75] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Import Box130
        gunModel[76] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Import Box131
        gunModel[77] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Import Box132
        gunModel[78] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box133
        gunModel[79] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Import Box134
        gunModel[80] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Import Box135
        gunModel[81] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Import Box136
        gunModel[82] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Import Box137
        gunModel[83] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box138
        gunModel[84] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Import Box139
        gunModel[85] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Import Box140
        gunModel[86] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Import Box141
        gunModel[87] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Import Box142
        gunModel[88] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Import Box143
        gunModel[89] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import Box144
        gunModel[90] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Import Box146
        gunModel[91] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Import Box147
        gunModel[92] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Import Box149
        gunModel[93] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Import Box155
        gunModel[94] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Import Box156
        gunModel[95] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box157
        gunModel[96] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Import Box158
        gunModel[97] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Import Box160
        gunModel[98] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Import Box161
        gunModel[99] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Import Box162
        gunModel[100] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Import Box194
        gunModel[101] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Import Box195
        gunModel[102] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Import Box196
        gunModel[103] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Import Box198
        gunModel[104] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Import Box199
        gunModel[105] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Import Box200
        gunModel[106] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Import Box201
        gunModel[107] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Import Box218
        gunModel[108] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box219
        gunModel[109] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box220
        gunModel[110] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Import Box221
        gunModel[111] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Import Box222
        gunModel[112] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Import Box223
        gunModel[113] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Import Box224
        gunModel[114] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Import Box225
        gunModel[115] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Import Box226
        gunModel[116] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Import Box227
        gunModel[117] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Import Box252
        gunModel[118] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Import Box253
        gunModel[119] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Import Box254
        gunModel[120] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Import Box255
        gunModel[121] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Import Box256
        gunModel[122] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Import Box257
        gunModel[123] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Import Box258
        gunModel[124] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Import Box259
        gunModel[125] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Import Box260
        gunModel[126] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Import Box261
        gunModel[127] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Import Box262
        gunModel[128] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Import Box263
        gunModel[129] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Import Box264
        gunModel[130] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Import Box265
        gunModel[131] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Import Box266
        gunModel[132] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Box267
        gunModel[133] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Import Box268
        gunModel[134] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Import Box269
        gunModel[135] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Import Box79
        gunModel[136] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Import Box63
        gunModel[137] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Import Box65
        gunModel[138] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Import Box44
        gunModel[139] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Import Box46
        gunModel[140] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Import Box68
        gunModel[141] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Import Box69
        gunModel[142] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Import Box70
        gunModel[143] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Import Box71
        gunModel[144] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Import Box72
        gunModel[145] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Import Box73
        gunModel[146] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Import Box77
        gunModel[147] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Import Box78
        gunModel[148] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import Box83
        gunModel[149] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Import Box91
        gunModel[150] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Import Box119
        gunModel[151] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Import Box120
        gunModel[152] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Import Box121
        gunModel[153] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Import Box122
        gunModel[154] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Import Box123
        gunModel[155] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Import Box185
        gunModel[156] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Import Box186
        gunModel[157] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Import Box187
        gunModel[158] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Import Box188
        gunModel[159] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Import Box189
        gunModel[160] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Import Box190
        gunModel[161] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Import Box191
        gunModel[162] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Import Box192
        gunModel[163] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Import Box61
        gunModel[164] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Import Box66
        gunModel[165] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Import Box67
        gunModel[166] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Import Box75
        gunModel[167] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Import Box76
        gunModel[168] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box228
        gunModel[169] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box229
        gunModel[170] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Import Box230
        gunModel[171] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box231
        gunModel[172] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box232
        gunModel[173] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Import Box233
        gunModel[174] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Import Box234
        gunModel[175] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box235
        gunModel[176] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box236
        gunModel[177] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box237
        gunModel[178] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import Box238
        gunModel[179] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box239
        gunModel[180] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Import Box240
        gunModel[181] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box241
        gunModel[182] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box242
        gunModel[183] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Import Box243
        gunModel[184] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Import Box244
        gunModel[185] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box245
        gunModel[186] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import Box246
        gunModel[187] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Import Box247
        gunModel[188] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box248
        gunModel[189] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box249
        gunModel[190] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box250
        gunModel[191] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box251
        gunModel[192] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 273
        gunModel[193] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 275
        gunModel[194] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 276
        gunModel[195] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 280
        gunModel[196] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 281
        gunModel[197] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 282
        gunModel[198] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 283
        gunModel[199] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 284
        gunModel[200] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 285
        gunModel[201] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 286
        gunModel[202] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 296
        gunModel[203] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 297
        gunModel[204] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 298
        gunModel[205] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 320
        gunModel[206] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 321
        gunModel[207] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 322
        gunModel[208] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 323
        gunModel[209] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 324
        gunModel[210] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 325
        gunModel[211] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 326
        gunModel[212] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 327
        gunModel[213] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 328
        gunModel[214] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 329
        gunModel[215] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 330
        gunModel[216] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 331
        gunModel[217] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 332
        gunModel[218] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 333
        gunModel[219] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 334
        gunModel[220] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 335
        gunModel[221] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 336
        gunModel[222] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 337
        gunModel[223] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 338
        gunModel[224] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 339
        gunModel[225] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 340
        gunModel[226] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 341
        gunModel[227] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 342
        gunModel[228] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 343
        gunModel[229] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 344
        gunModel[230] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 345
        gunModel[231] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 346
        gunModel[232] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 347
        gunModel[233] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 348
        gunModel[234] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 349
        gunModel[235] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 350
        gunModel[236] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 351
        gunModel[237] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 352
        gunModel[238] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 353
        gunModel[239] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 354
        gunModel[240] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 355
        gunModel[241] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 356
        gunModel[242] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 357
        gunModel[243] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 358
        gunModel[244] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 359
        gunModel[245] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 360
        gunModel[246] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 361
        gunModel[247] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 362
        gunModel[248] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 363
        gunModel[249] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 364
        gunModel[250] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 368
        gunModel[251] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 371
        gunModel[252] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 372
        gunModel[253] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 373
        gunModel[254] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 374
        gunModel[255] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 375
        gunModel[256] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 376
        gunModel[257] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 434
        gunModel[258] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 435
        gunModel[259] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 436
        gunModel[260] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 437
        gunModel[261] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 438
        gunModel[262] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 439
        gunModel[263] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 440
        gunModel[264] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 441
        gunModel[265] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 442
        gunModel[266] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 443
        gunModel[267] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 444
        gunModel[268] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 445
        gunModel[269] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 446
        gunModel[270] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 447
        gunModel[271] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 448
        gunModel[272] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Import Box1
        gunModel[273] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Import Box44
        gunModel[274] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Import Box45
        gunModel[275] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Import Box46
        gunModel[276] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 277
        gunModel[277] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 278
        gunModel[278] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 279
        gunModel[279] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 377
        gunModel[280] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 378
        gunModel[281] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 379
        gunModel[282] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 380
        gunModel[283] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 381
        gunModel[284] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 382
        gunModel[285] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 383
        gunModel[286] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 384
        gunModel[287] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 385
        gunModel[288] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 386
        gunModel[289] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 387
        gunModel[290] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 388
        gunModel[291] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 389
        gunModel[292] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Box 390
        gunModel[293] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 391
        gunModel[294] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 392
        gunModel[295] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Box 393
        gunModel[296] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 394
        gunModel[297] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 395
        gunModel[298] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Box 396
        gunModel[299] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 397
        gunModel[300] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 398
        gunModel[301] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 399
        gunModel[302] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 400
        gunModel[303] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 401
        gunModel[304] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 402
        gunModel[305] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 403
        gunModel[306] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 404
        gunModel[307] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 405
        gunModel[308] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 406
        gunModel[309] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 407
        gunModel[310] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Box 408
        gunModel[311] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 409
        gunModel[312] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 410
        gunModel[313] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 411
        gunModel[314] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 412
        gunModel[315] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 413
        gunModel[316] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 414
        gunModel[317] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 415
        gunModel[318] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 416
        gunModel[319] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 417
        gunModel[320] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 418
        gunModel[321] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 419
        gunModel[322] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 420
        gunModel[323] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 421
        gunModel[324] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 422
        gunModel[325] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Box 423
        gunModel[326] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 424
        gunModel[327] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 425
        gunModel[328] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 426
        gunModel[329] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 427
        gunModel[330] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 428
        gunModel[331] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 429
        gunModel[332] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 430
        gunModel[333] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 431
        gunModel[334] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 432
        gunModel[335] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 433
        gunModel[336] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Import Box144
        gunModel[337] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 578
        gunModel[338] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 579
        gunModel[339] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Box 580
        gunModel[340] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 578
        gunModel[341] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 579
        gunModel[342] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 580
        gunModel[343] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 578
        gunModel[344] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 579
        gunModel[345] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 580
        gunModel[346] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 578
        gunModel[347] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 579
        gunModel[348] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 580

        gunModel[0].addShapeBox(0F, 0.5F, 0F, 5, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box151
        gunModel[0].setRotationPoint(20.25F, -17F, -1.5F);

        gunModel[1].addShapeBox(0F, 0.5F, 0F, 5, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box152
        gunModel[1].setRotationPoint(20.25F, -15F, -1.5F);

        gunModel[2].addShapeBox(0F, 0.5F, 0F, 5, 1, 3, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box153
        gunModel[2].setRotationPoint(20.25F, -18F, -1.5F);

        gunModel[3].addShapeBox(0F, 0.5F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box154
        gunModel[3].setRotationPoint(20.25F, -19F, -1.5F);

        gunModel[4].addShapeBox(10F, 0.5F, 0F, 1, 1, 3, 0F, 50F, 0F, -0.75F, 22F, 0F, -0.75F, 22F, 0F, -0.75F, 50F, 0F, -0.75F, 50F, 0F, 0F, 22F, 0F, 0F, 22F, 0F, 0F, 50F, 0F, 0F); // Box 449
        gunModel[4].setRotationPoint(22.5F, -25F, -1.5F);

        gunModel[5].addShapeBox(10F, 0.5F, 0F, 1, 1, 3, 0F, 50F, 0F, 0F, 22F, 0F, 0F, 22F, 0F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 22F, 0F, 0F, 22F, 0F, 0F, 50F, 0F, 0F); // Box 450
        gunModel[5].setRotationPoint(22.5F, -24F, -1.5F);

        gunModel[6].addShapeBox(10F, 0.5F, 0F, 1, 1, 3, 0F, 50F, 0F, 0F, 22F, 0F, 0F, 22F, 0F, 0F, 50F, 0F, 0F, 50F, 0F, -0.75F, 22F, 0F, -0.75F, 22F, 0F, -0.75F, 50F, 0F, -0.75F); // Box 451
        gunModel[6].setRotationPoint(22.5F, -23F, -1.5F);

        gunModel[7].addShapeBox(10F, 0.5F, 0F, 1, 1, 3, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 452
        gunModel[7].setRotationPoint(42F, -25F, -1.5F);

        gunModel[8].addShapeBox(10F, 0.5F, 0F, 1, 1, 3, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 453
        gunModel[8].setRotationPoint(42F, -24F, -1.5F);

        gunModel[9].addShapeBox(10F, 0.5F, 0F, 1, 1, 3, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 454
        gunModel[9].setRotationPoint(42F, -23F, -1.5F);

        gunModel[10].addShapeBox(0F, 0.5F, 0F, 13, 11, 5, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 866
        gunModel[10].setRotationPoint(-19.75F, -20.5F, -2.5F);

        gunModel[11].addShapeBox(0F, 0.5F, 0F, 6, 1, 3, 0F, 0F, 1F, 0F, 12F, 1F, 0F, 12F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F); // Box 867
        gunModel[11].setRotationPoint(20.25F, -20F, -1.5F);

        gunModel[12].addShapeBox(0F, 0.5F, 0F, 6, 1, 3, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F); // Box 868
        gunModel[12].setRotationPoint(34.25F, -19F, -1.5F);

        gunModel[13].addShapeBox(0F, 0.5F, 0F, 5, 2, 3, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 869
        gunModel[13].setRotationPoint(16.25F, -17F, -1.5F);

        gunModel[14].addShapeBox(0F, 0.5F, 0F, 5, 2, 3, 0F, -2F, -0.5F, -1F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -1F, -2F, -0.5F, -1F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -1F); // Box 870
        gunModel[14].setRotationPoint(14.25F, -17F, -1.5F);

        gunModel[15].addShapeBox(0F, 0.5F, 0F, 6, 1, 3, 0F, 15F, 0F, 1.75F, 15F, 0F, 1.75F, 15F, 0F, -3.75F, 15F, 0F, -3.75F, 15F, 0F, 1.75F, 15F, 0F, 1.75F, 15F, 0F, -3.75F, 15F, 0F, -3.75F); // Box 872
        gunModel[15].setRotationPoint(19.25F, -21F, -1.5F);

        gunModel[16].addShapeBox(0F, 0.5F, 0F, 6, 1, 3, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -3.75F, 0F, -0.5F, -3.75F, 0F, 0.5F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -3.75F, 0F, 0.5F, -3.75F); // Box 873
        gunModel[16].setRotationPoint(-1.75F, -21F, -1.5F);

        gunModel[17].addShapeBox(0F, 0.5F, 0F, 13, 11, 5, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, -6F, -5F, 0F, -6F, -5F, 0F, 0F, -5F, 0F); // Box 874
        gunModel[17].setRotationPoint(-19.75F, -16.5F, -2.5F);

        gunModel[18].addShapeBox(0F, 0.5F, 0F, 6, 1, 3, 0F, 4F, 0F, 1.75F, 4F, 0F, 1.75F, 4F, 0F, -3.75F, 4F, 0F, -3.75F, 4F, 0F, 1.75F, 4F, 0F, 1.75F, 4F, 0F, -3.75F, 4F, 0F, -3.75F); // Box 875
        gunModel[18].setRotationPoint(-11.75F, -20.5F, -1.5F);

        gunModel[19].addShapeBox(0F, 0.5F, 0F, 6, 1, 3, 0F, 15F, 0F, -3.75F, 15F, 0F, -3.75F, 15F, 0F, 1.75F, 15F, 0F, 1.75F, 15F, 0F, -3.75F, 15F, 0F, -3.75F, 15F, 0F, 1.75F, 15F, 0F, 1.75F); // Box 876
        gunModel[19].setRotationPoint(19.25F, -21F, -1.5F);

        gunModel[20].addShapeBox(0F, 0.5F, 0F, 6, 1, 3, 0F, 0F, -0.5F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, 0.5F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, 1.75F, 0F, 0.5F, 1.75F); // Box 877
        gunModel[20].setRotationPoint(-1.75F, -21F, -1.5F);

        gunModel[21].addShapeBox(0F, 0.5F, 0F, 6, 1, 3, 0F, 4F, 0F, -3.75F, 4F, 0F, -3.75F, 4F, 0F, 1.75F, 4F, 0F, 1.75F, 4F, 0F, -3.75F, 4F, 0F, -3.75F, 4F, 0F, 1.75F, 4F, 0F, 1.75F); // Box 878
        gunModel[21].setRotationPoint(-11.75F, -20.5F, -1.5F);

        gunModel[22].addShapeBox(10F, 0.5F, 0F, 1, 1, 3, 0F, 5F, 1F, 1F, 5F, 1F, 1F, 5F, 1F, 1F, 5F, 1F, 1F, 5F, 1F, 1F, 5F, 1F, 1F, 5F, 1F, 1F, 5F, 1F, 1F); // Box 879
        gunModel[22].setRotationPoint(-12.5F, -24F, -1.5F);

        gunModel[23].addShapeBox(10F, 0.5F, 0F, 1, 1, 3, 0F, 5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 1F, 3F, 0F, 1F, 3F, 0F, 1F, 5F, 0F, 1F); // Box 880
        gunModel[23].setRotationPoint(-12.5F, -26F, -1.5F);

        gunModel[24].addShapeBox(10F, 0.5F, 0F, 1, 1, 3, 0F, 5F, 0F, 1F, 5F, 0F, 1F, 5F, 0F, 1F, 5F, 0F, 1F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F); // Box 881
        gunModel[24].setRotationPoint(-12.5F, -22F, -1.5F);

        gunModel[25].addShapeBox(0F, 0.5F, 0F, 2, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box74
        gunModel[25].setRotationPoint(18.5F, -23.5F, -4.5F);

        gunModel[26].addShapeBox(0F, 0.5F, 0F, 6, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box80
        gunModel[26].setRotationPoint(12.5F, -23.5F, -4.5F);

        gunModel[27].addShapeBox(0F, 0.5F, 0F, 36, 6, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box81
        gunModel[27].setRotationPoint(-43.5F, -26.5F, -4.5F);

        gunModel[28].addShapeBox(0F, 0.5F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box82
        gunModel[28].setRotationPoint(12.5F, -24.5F, -4.5F);

        gunModel[29].addShapeBox(0F, 0.5F, 0F, 18, 5, 5, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box84
        gunModel[29].setRotationPoint(36.5F, -21F, -2.5F);

        gunModel[30].addShapeBox(0F, 0.5F, 0F, 2, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F); // Import Box85
        gunModel[30].setRotationPoint(34.5F, -21F, -2.5F);

        gunModel[31].addShapeBox(0F, 0.5F, 0F, 3, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box86
        gunModel[31].setRotationPoint(31.5F, -21F, -2.5F);

        gunModel[32].addShapeBox(0F, 0.5F, 0F, 21, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box87
        gunModel[32].setRotationPoint(10.5F, -21F, -2.5F);

        gunModel[33].addShapeBox(0F, 0.5F, 0F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box88
        gunModel[33].setRotationPoint(7.5F, -21F, -2.5F);

        gunModel[34].addShapeBox(0F, 0.5F, 0F, 18, 1, 5, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box89
        gunModel[34].setRotationPoint(36.5F, -21.5F, -2.5F);

        gunModel[35].addShapeBox(0F, 0.5F, 0F, 8, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.75F, 0F, 0F); // Import Box92
        gunModel[35].setRotationPoint(36.5F, -15.75F, -2.5F);

        gunModel[36].addShapeBox(0F, 0.5F, 0F, 4, 3, 5, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0.25F, 0F, 0F); // Import Box93
        gunModel[36].setRotationPoint(37.5F, -14.75F, -2.5F);

        gunModel[37].addShapeBox(0F, 0.5F, 0F, 2, 3, 5, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.75F, -1.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1.75F, -1.5F, 0F); // Import Box94
        gunModel[37].setRotationPoint(37.5F, -11.75F, -2.5F);

        gunModel[38].addShapeBox(0F, 0.5F, 0F, 3, 4, 5, 0F, -0.25F, 0.5F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, -0.25F, 0.5F, 0F, 2.25F, -2.5F, 0F, -2.25F, 0.5F, 0F, -2.25F, 0.5F, 0F, 2.25F, -2.5F, 0F); // Import Box95
        gunModel[38].setRotationPoint(35.5F, -9.75F, -2.5F);

        gunModel[39].addShapeBox(0F, 0.5F, 0F, 8, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F); // Import Box96
        gunModel[39].setRotationPoint(25.25F, -8.25F, -2.5F);

        gunModel[40].addShapeBox(0F, 0.5F, 0F, 3, 5, 5, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box97
        gunModel[40].setRotationPoint(33.25F, -8.25F, -2.5F);

        gunModel[41].addShapeBox(0F, 0.5F, 0F, 3, 3, 5, 0F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F); // Import Box98
        gunModel[41].setRotationPoint(34.5F, -14.75F, -2.5F);

        gunModel[42].addShapeBox(0F, 0.5F, 0F, 3, 2, 5, 0F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, 1.5F, -0.5F, -1F, -1.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, 1.5F, -0.5F, -1F); // Import Box99
        gunModel[42].setRotationPoint(34.5F, -11.75F, -2.5F);

        gunModel[43].addShapeBox(0F, 0.5F, 0F, 3, 2, 5, 0F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, 2.75F, 0F, -1F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 2.75F, 0F, -1F); // Import Box100
        gunModel[43].setRotationPoint(33F, -10.25F, -2.5F);

        gunModel[44].addShapeBox(0F, 0.5F, 0F, 8, 2, 5, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box101
        gunModel[44].setRotationPoint(25.25F, -10.25F, -2.5F);

        gunModel[45].addShapeBox(0F, 0.5F, 0F, 9, 2, 5, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -1F); // Import Box102
        gunModel[45].setRotationPoint(24.25F, -3.25F, -2.5F);

        gunModel[46].addShapeBox(0F, 0.5F, 0F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, -3F, -1F, 2F, -3F, -1F, 0F, 0F, -1F); // Import Box103
        gunModel[46].setRotationPoint(33.25F, -3.25F, -2.5F);

        gunModel[47].addShapeBox(0F, 0.5F, 0F, 3, 2, 5, 0F, 0F, 0F, 0F, -0.5F, 3.5F, 0F, -0.5F, 3.5F, 0F, 0F, 0F, 0F, -2F, -1F, -1F, 1.5F, -5F, -1F, 1.5F, -5F, -1F, -2F, -1F, -1F); // Import Box104
        gunModel[47].setRotationPoint(36.25F, -5.25F, -2.5F);

        gunModel[48].addShapeBox(0F, 0.5F, 0F, 2, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0.5F, -1F, -1F, 0.5F, -1F, 1F, 0F, 0F); // Import Box105
        gunModel[48].setRotationPoint(39.75F, -11.75F, -2.5F);

        gunModel[49].addShapeBox(0F, 0.5F, 0F, 2, 3, 5, 0F, -0.75F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.75F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F); // Import Box106
        gunModel[49].setRotationPoint(40.75F, -14.75F, -2.5F);

        gunModel[50].addShapeBox(0F, 0.5F, 0F, 3, 1, 5, 0F, 0.5F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F); // Import Box107
        gunModel[50].setRotationPoint(34.5F, -15.75F, -2.5F);

        gunModel[51].addShapeBox(0F, 0.5F, 0F, 3, 2, 5, 0F, 0.75F, 0.25F, -1F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.75F, 0.25F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F); // Import Box108
        gunModel[51].setRotationPoint(32.5F, -17.75F, -2.5F);

        gunModel[52].addShapeBox(0F, 0.5F, 0F, 3, 1, 5, 0F, 1F, 0.25F, -1F, -2F, 0.25F, 0F, -2F, 0.25F, 0F, 1F, 0.25F, -1F, -1.25F, -0.25F, -1F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1.25F, -0.25F, -1F); // Import Box109
        gunModel[52].setRotationPoint(30.5F, -18.75F, -2.5F);

        gunModel[53].addShapeBox(0F, 0.5F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Import Box110
        gunModel[53].setRotationPoint(24.25F, -9.75F, -1.5F);

        gunModel[54].addShapeBox(0F, 0.5F, 0F, 9, 1, 3, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F); // Import Box111
        gunModel[54].setRotationPoint(19.25F, -10.75F, -1.5F);

        gunModel[55].addShapeBox(0F, 0.5F, 0F, 15, 4, 9, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box112
        gunModel[55].setRotationPoint(-43.5F, -30.5F, -4.5F);

        gunModel[56].addShapeBox(0F, 0.5F, 0F, 4, 4, 9, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box113
        gunModel[56].setRotationPoint(-28.5F, -30.5F, -4.5F);

        gunModel[57].addShapeBox(0F, 0.5F, 0F, 3, 4, 9, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box114
        gunModel[57].setRotationPoint(-24.5F, -30.5F, -4.5F);

        gunModel[58].addShapeBox(0F, 0.5F, 0F, 6, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box115
        gunModel[58].setRotationPoint(-21.5F, -31F, -4.5F);

        gunModel[59].addShapeBox(0F, 0.5F, 0F, 6, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box116
        gunModel[59].setRotationPoint(-21.5F, -27.5F, -4.5F);

        gunModel[60].addShapeBox(0F, 0.5F, 0F, 6, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box117
        gunModel[60].setRotationPoint(-21.5F, -30.5F, -4F);

        gunModel[61].addShapeBox(0F, 0.5F, 0F, 28, 1, 7, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Box118
        gunModel[61].setRotationPoint(-15.5F, -27.5F, -3.5F);

        gunModel[62].addShapeBox(0F, 0.5F, 0F, 8, 1, 5, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box117
        gunModel[62].setRotationPoint(12.25F, -19F, -2.5F);

        gunModel[63].addShapeBox(0F, 0.5F, 0F, 8, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box118
        gunModel[63].setRotationPoint(12.25F, -18F, -2.5F);

        gunModel[64].addShapeBox(0F, 0.5F, 0F, 8, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box119
        gunModel[64].setRotationPoint(12.25F, -16F, -2.5F);

        gunModel[65].addShapeBox(0F, 0.5F, 0F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Import Box120
        gunModel[65].setRotationPoint(18.25F, -12.5F, -2.5F);

        gunModel[66].addShapeBox(0F, 0.5F, 0F, 1, 5, 5, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 7F, 0F, 0F); // Import Box121
        gunModel[66].setRotationPoint(12.25F, -12.5F, -2.5F);

        gunModel[67].addShapeBox(0F, 0.5F, 0F, 15, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box122
        gunModel[67].setRotationPoint(-6.75F, -7.5F, -2.5F);

        gunModel[68].addShapeBox(0F, 0.5F, 0F, 13, 11, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box123
        gunModel[68].setRotationPoint(-19.75F, -20.5F, -2.5F);

        gunModel[69].addShapeBox(0F, 0.5F, 0F, 13, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box124
        gunModel[69].setRotationPoint(-19.75F, -9.5F, -2.5F);

        gunModel[70].addShapeBox(0F, 0.5F, 0F, 3, 3, 5, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box125
        gunModel[70].setRotationPoint(-6.75F, -10.5F, -2.5F);

        gunModel[71].addShapeBox(0F, 0.5F, 0F, 2, 11, 5, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box126
        gunModel[71].setRotationPoint(-6.75F, -20.5F, -2.5F);

        gunModel[72].addShapeBox(0F, 0.5F, 0F, 4, 3, 5, 0F, 0F, 0F, 0F, -2F, 2F, -1F, -2F, 2F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, -1F, 3F, 0F, -1F, -3F, 0F, 0F); // Import Box127
        gunModel[72].setRotationPoint(-6.75F, -10.5F, -2.5F);

        gunModel[73].addShapeBox(0F, 0.5F, 0F, 10, 2, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box128
        gunModel[73].setRotationPoint(-4.75F, -9.5F, -2.5F);

        gunModel[74].addShapeBox(0F, 0.5F, 0F, 5, 5, 5, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 7F, 0F, -1F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, -1F); // Import Box129
        gunModel[74].setRotationPoint(7.25F, -12.5F, -2.5F);

        gunModel[75].addShapeBox(0F, 0.5F, 0F, 6, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F); // Import Box130
        gunModel[75].setRotationPoint(12.25F, -10.5F, -2.5F);

        gunModel[76].addShapeBox(0F, 0.5F, 0F, 4, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box131
        gunModel[76].setRotationPoint(8.25F, -7.5F, -2.5F);

        gunModel[77].addShapeBox(0F, 0.5F, 0F, 6, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box132
        gunModel[77].setRotationPoint(12.25F, -12.5F, -2.5F);

        gunModel[78].addShapeBox(0F, 0.5F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F); // Import Box133
        gunModel[78].setRotationPoint(18.25F, -12.5F, -2.5F);

        gunModel[79].addShapeBox(0F, 0.5F, 0F, 5, 2, 5, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box134
        gunModel[79].setRotationPoint(7.25F, -14.5F, -2.5F);

        gunModel[80].addShapeBox(0F, 0.5F, 0F, 2, 3, 5, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box135
        gunModel[80].setRotationPoint(10.25F, -17.5F, -2.5F);

        gunModel[81].addShapeBox(0F, 0.5F, 0F, 2, 3, 5, 0F, 3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box136
        gunModel[81].setRotationPoint(10.25F, -20.5F, -2.5F);

        gunModel[82].addShapeBox(0F, 0.5F, 0F, 2, 3, 5, 0F, 0F, 0F, 0F, 3F, 0F, -1F, 3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box137
        gunModel[82].setRotationPoint(-6.75F, -20.5F, -2.5F);

        gunModel[83].addShapeBox(0F, 0.5F, 0F, 24, 11, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box138
        gunModel[83].setRotationPoint(-43.75F, -20.5F, -3.5F);

        gunModel[84].addShapeBox(0F, 0.5F, 0F, 24, 1, 7, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Import Box139
        gunModel[84].setRotationPoint(-43.75F, -9.5F, -3.5F);

        gunModel[85].addShapeBox(0F, 0.5F, 0F, 13, 6, 5, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F); // Import Box140
        gunModel[85].setRotationPoint(-19.75F, -9.5F, -2.5F);

        gunModel[86].addShapeBox(0F, 0.5F, 0F, 15, 4, 9, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box141
        gunModel[86].setRotationPoint(-43.5F, -31.5F, -4.5F);

        gunModel[87].addShapeBox(0F, 0.5F, 0F, 4, 1, 9, 0F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import Box142
        gunModel[87].setRotationPoint(-28.5F, -31.5F, -4.5F);

        gunModel[88].addShapeBox(0F, 0.5F, 0F, 9, 1, 9, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box143
        gunModel[88].setRotationPoint(-24.5F, -32F, -4.5F);

        gunModel[89].addShapeBox(0F, 0.5F, 0F, 4, 3, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0.5F, 0F, -0.75F); // Import Box144
        gunModel[89].setRotationPoint(-19.5F, -30.5F, 4F);

        gunModel[90].addShapeBox(0F, 0.5F, 0F, 2, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box146
        gunModel[90].setRotationPoint(-13F, -27.01F, -5F);

        gunModel[91].addShapeBox(0F, 0.5F, 0F, 2, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box147
        gunModel[91].setRotationPoint(-11F, -27.01F, -5F);

        gunModel[92].addShapeBox(0F, 0.5F, 0F, 2, 3, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box149
        gunModel[92].setRotationPoint(-15F, -27.01F, -5F);

        gunModel[93].addShapeBox(0F, 0.5F, 0F, 6, 1, 2, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Box155
        gunModel[93].setRotationPoint(21.25F, -11.75F, -1F);

        gunModel[94].addShapeBox(0F, 0.5F, 0F, 3, 7, 5, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Import Box156
        gunModel[94].setRotationPoint(50.5F, -15.75F, -2.5F);

        gunModel[95].addShapeBox(0F, 0.5F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F); // Import Box157
        gunModel[95].setRotationPoint(49.5F, -15.75F, -2.5F);

        gunModel[96].addShapeBox(0F, 0.5F, 0F, 3, 1, 5, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.75F, 0F, -1F, -1.75F, 0F, -1F, 0F, 0F, 0F); // Import Box158
        gunModel[96].setRotationPoint(41.5F, -15.75F, -2.5F);

        gunModel[97].addShapeBox(0F, 0.5F, 0F, 1, 2, 5, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, -1.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.5F, -0.25F, -1.25F); // Import Box160
        gunModel[97].setRotationPoint(23F, -3.25F, -2.5F);

        gunModel[98].addShapeBox(0F, 0.5F, 0F, 1, 5, 5, 0F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.75F, 0F, -0.25F); // Import Box161
        gunModel[98].setRotationPoint(24.25F, -8.25F, -2.5F);

        gunModel[99].addShapeBox(0F, 0.5F, 0F, 1, 2, 5, 0F, -0.75F, -0.5F, -1.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.75F, -0.5F, -1.25F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F); // Import Box162
        gunModel[99].setRotationPoint(24.25F, -10.25F, -2.5F);

        gunModel[100].addShapeBox(0F, 0.5F, 0F, 1, 3, 9, 0F, 0F, -1F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box194
        gunModel[100].setRotationPoint(-45F, -30.5F, -4.5F);

        gunModel[101].addShapeBox(0F, 0.5F, 0F, 1, 3, 9, 0F, 0F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box195
        gunModel[101].setRotationPoint(-44F, -30.5F, -4.5F);

        gunModel[102].addShapeBox(0F, 0.5F, 0F, 64, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box196
        gunModel[102].setRotationPoint(-43.5F, -20F, -4.5F);

        gunModel[103].addShapeBox(0F, 0.5F, 0F, 1, 7, 9, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Import Box198
        gunModel[103].setRotationPoint(-45F, -27.5F, -4.5F);

        gunModel[104].addShapeBox(0F, 0.5F, 0F, 1, 1, 8, 0F, 0F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box199
        gunModel[104].setRotationPoint(-45F, -20F, -4F);

        gunModel[105].addShapeBox(0F, 0.5F, 0F, 1, 9, 7, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Import Box200
        gunModel[105].setRotationPoint(-44.75F, -19.5F, -3.5F);

        gunModel[106].addShapeBox(0F, 0.5F, 0F, 1, 1, 7, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, -0.75F); // Import Box201
        gunModel[106].setRotationPoint(-44.75F, -10.5F, -3.5F);

        gunModel[107].addShapeBox(0F, 0.5F, 0F, 5, 1, 1, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, -0.5F, -1F, 0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Import Box218
        gunModel[107].setRotationPoint(21.25F, -11.75F, 1F);

        gunModel[108].addShapeBox(0F, 0.5F, 0F, 3, 1, 1, 0F, -0.5F, 0.75F, 0F, 0F, 0.75F, 0F, 0.5F, 0.75F, -0.5F, -1F, 0.75F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F); // Import Box219
        gunModel[108].setRotationPoint(22.25F, -11.75F, 1.5F);

        gunModel[109].addShapeBox(0F, 0.5F, 0F, 3, 1, 1, 0F, -0.5F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.5F, -1F, 0.75F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.75F); // Import Box220
        gunModel[109].setRotationPoint(22.75F, -11.75F, 2F);

        gunModel[110].addShapeBox(0F, 0.5F, 0F, 2, 6, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box221
        gunModel[110].setRotationPoint(10.5F, -26.5F, -4.5F);

        gunModel[111].addShapeBox(0F, 0.5F, 0F, 18, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box222
        gunModel[111].setRotationPoint(-7.5F, -26.5F, -4.5F);

        gunModel[112].addShapeBox(0F, 0.5F, 0F, 18, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box223
        gunModel[112].setRotationPoint(-7.5F, -22.5F, -4.5F);

        gunModel[113].addShapeBox(0F, 0.5F, 0F, 18, 2, 9, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.5F, -0.125F, 0F, 0.5F, -0.125F, 0F, 0.5F, -0.125F, 0F, 0.5F, -0.125F); // Import Box224
        gunModel[113].setRotationPoint(-7.5F, -25F, -4.5F);

        gunModel[114].addShapeBox(0F, 0.5F, 0F, 2, 1, 5, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Import Box225
        gunModel[114].setRotationPoint(51.5F, -17.5F, -2.5F);

        gunModel[115].addShapeBox(0F, 0.5F, 0F, 2, 1, 5, 0F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Import Box226
        gunModel[115].setRotationPoint(51.5F, -18.5F, -2.5F);

        gunModel[116].addShapeBox(0F, 0.5F, 0F, 2, 1, 5, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F); // Import Box227
        gunModel[116].setRotationPoint(51.5F, -16.5F, -2.5F);

        gunModel[117].addShapeBox(0F, 0.5F, 0F, 2, 1, 5, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Import Box252
        gunModel[117].setRotationPoint(40.5F, -17.5F, -2.5F);

        gunModel[118].addShapeBox(0F, 0.5F, 0F, 2, 1, 5, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F); // Import Box253
        gunModel[118].setRotationPoint(40.5F, -16.5F, -2.5F);

        gunModel[119].addShapeBox(0F, 0.5F, 0F, 2, 1, 5, 0F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Import Box254
        gunModel[119].setRotationPoint(40.5F, -18.5F, -2.5F);

        gunModel[120].addShapeBox(0F, 0.5F, 0F, 2, 1, 5, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Import Box255
        gunModel[120].setRotationPoint(12.5F, -17.5F, -2.5F);

        gunModel[121].addShapeBox(0F, 0.5F, 0F, 2, 1, 5, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F); // Import Box256
        gunModel[121].setRotationPoint(12.5F, -16.5F, -2.5F);

        gunModel[122].addShapeBox(0F, 0.5F, 0F, 2, 1, 5, 0F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Import Box257
        gunModel[122].setRotationPoint(12.5F, -18.5F, -2.5F);

        gunModel[123].addShapeBox(0F, 0.5F, 0F, 2, 1, 5, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Import Box258
        gunModel[123].setRotationPoint(9.5F, -7.5F, -2.5F);

        gunModel[124].addShapeBox(0F, 0.5F, 0F, 2, 1, 5, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F); // Import Box259
        gunModel[124].setRotationPoint(9.5F, -6.5F, -2.5F);

        gunModel[125].addShapeBox(0F, 0.5F, 0F, 2, 1, 5, 0F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Import Box260
        gunModel[125].setRotationPoint(9.5F, -8.5F, -2.5F);

        gunModel[126].addShapeBox(0F, 0.5F, 0F, 2, 1, 5, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Import Box261
        gunModel[126].setRotationPoint(-5.5F, -7.5F, -2.5F);

        gunModel[127].addShapeBox(0F, 0.5F, 0F, 2, 1, 5, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F); // Import Box262
        gunModel[127].setRotationPoint(-5.5F, -6.5F, -2.5F);

        gunModel[128].addShapeBox(0F, 0.5F, 0F, 2, 1, 5, 0F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Import Box263
        gunModel[128].setRotationPoint(-5.5F, -8.5F, -2.5F);

        gunModel[129].addShapeBox(0F, 0.5F, 0F, 2, 1, 9, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Import Box264
        gunModel[129].setRotationPoint(-31.5F, -29.5F, -4.5F);

        gunModel[130].addShapeBox(0F, 0.5F, 0F, 2, 1, 9, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F); // Import Box265
        gunModel[130].setRotationPoint(-31.5F, -28.5F, -4.5F);

        gunModel[131].addShapeBox(0F, 0.5F, 0F, 2, 1, 9, 0F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Import Box266
        gunModel[131].setRotationPoint(-31.5F, -30.5F, -4.5F);

        gunModel[132].addShapeBox(0F, 0.5F, 0F, 2, 1, 9, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Import Box267
        gunModel[132].setRotationPoint(-43F, -27F, -4.5F);

        gunModel[133].addShapeBox(0F, 0.5F, 0F, 2, 1, 9, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F); // Import Box268
        gunModel[133].setRotationPoint(-43F, -26F, -4.5F);

        gunModel[134].addShapeBox(0F, 0.5F, 0F, 2, 1, 9, 0F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Import Box269
        gunModel[134].setRotationPoint(-43F, -28F, -4.5F);

        gunModel[135].addShapeBox(0F, 0.5F, 0F, 10, 1, 7, 0F, -1F, -0.75F, -2F, -1.5F, -1.75F, -2F, -1.5F, -1.75F, -2F, -1F, -0.75F, -2F, 0F, 0F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 0F, 0F, 0F); // Import Box79
        gunModel[135].setRotationPoint(15F, -38.5F, -3.5F);

        gunModel[136].addShapeBox(0F, 0.5F, 0F, 2, 2, 6, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.75F, -0.5F); // Import Box63
        gunModel[136].setRotationPoint(23F, -37.5F, -3F);

        gunModel[137].addShapeBox(0F, 0.5F, 0F, 8, 1, 6, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box65
        gunModel[137].setRotationPoint(15.5F, -37.25F, -3F);

        gunModel[138].addShapeBox(0F, 0.5F, 0F, 9, 3, 7, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box44
        gunModel[138].setRotationPoint(45.5F, -35.5F, -3.5F);

        gunModel[139].addShapeBox(0F, 0.5F, 0F, 1, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Import Box46
        gunModel[139].setRotationPoint(45.5F, -32.5F, -3.5F);

        gunModel[140].addShapeBox(0F, 0.5F, 0F, 10, 2, 10, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box68
        gunModel[140].setRotationPoint(14F, -37.5F, -5F);

        gunModel[141].addShapeBox(0F, 0.5F, 0F, 9, 5, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Import Box69
        gunModel[141].setRotationPoint(14F, -35.5F, -5.5F);

        gunModel[142].addShapeBox(0F, 0.5F, 0F, 9, 3, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box70
        gunModel[142].setRotationPoint(12F, -30.5F, -5.5F);

        gunModel[143].addShapeBox(0F, 0.5F, 0F, 9, 1, 10, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Import Box71
        gunModel[143].setRotationPoint(12F, -27.5F, -5F);

        gunModel[144].addShapeBox(0F, 0.5F, 0F, 32, 5, 5, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box72
        gunModel[144].setRotationPoint(20.5F, -26F, -2.5F);

        gunModel[145].addShapeBox(0F, 0.5F, 0F, 21, 1, 5, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box73
        gunModel[145].setRotationPoint(20.5F, -26.75F, -2.5F);

        gunModel[146].addShapeBox(0F, 0.5F, 0F, 9, 1, 7, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box77
        gunModel[146].setRotationPoint(36.5F, -35.5F, -3.5F);

        gunModel[147].addShapeBox(0F, 0.5F, 0F, 13, 1, 7, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box78
        gunModel[147].setRotationPoint(23F, -35.5F, -3.5F);

        gunModel[148].addShapeBox(0F, 0.5F, 0F, 8, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box83
        gunModel[148].setRotationPoint(12.5F, -26.5F, -4F);

        gunModel[149].addShapeBox(0F, 0.5F, 0F, 32, 1, 5, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box91
        gunModel[149].setRotationPoint(20.5F, -21.5F, -2.5F);

        gunModel[150].addShapeBox(0F, 0.5F, 0F, 3, 1, 5, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box119
        gunModel[150].setRotationPoint(41F, -26.75F, -2.5F);

        gunModel[151].addShapeBox(0F, 0.5F, 0F, 1, 1, 7, 0F, -1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box120
        gunModel[151].setRotationPoint(44.5F, -26.75F, -3.5F);

        gunModel[152].addShapeBox(0F, 0.5F, 0F, 2, 1, 7, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box121
        gunModel[152].setRotationPoint(52F, -26F, -3.5F);

        gunModel[153].addShapeBox(0F, 0.5F, 0F, 9, 3, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box122
        gunModel[153].setRotationPoint(12F, -30.5F, 4F);

        gunModel[154].addShapeBox(0F, 0.5F, 0F, 9, 5, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Import Box123
        gunModel[154].setRotationPoint(14F, -35.5F, 4F);

        gunModel[155].addShapeBox(0F, 0.5F, 0F, 1, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Import Box185
        gunModel[155].setRotationPoint(53F, -32.5F, -3.5F);

        gunModel[156].addShapeBox(0F, 0.5F, 0F, 6, 1, 7, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box186
        gunModel[156].setRotationPoint(47F, -32.5F, -3.5F);

        gunModel[157].addShapeBox(0F, 0.5F, 0F, 6, 1, 7, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Import Box187
        gunModel[157].setRotationPoint(47F, -26.5F, -3.5F);

        gunModel[158].addShapeBox(0F, 0.5F, 0F, 6, 4, 4, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import Box188
        gunModel[158].setRotationPoint(47F, -31.5F, -2F);

        gunModel[159].addShapeBox(0F, 0.5F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, -0.25F, 0F); // Import Box189
        gunModel[159].setRotationPoint(46.5F, -31.5F, -3.5F);

        gunModel[160].addShapeBox(0F, 0.5F, 0F, 1, 1, 7, 0F, 0F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box190
        gunModel[160].setRotationPoint(46.5F, -28F, -3.5F);

        gunModel[161].addShapeBox(0F, 0.5F, 0F, 1, 1, 7, 0F, -0.25F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box191
        gunModel[161].setRotationPoint(52F, -28F, -3.5F);

        gunModel[162].addShapeBox(0F, 0.5F, 0F, 1, 1, 7, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -1F, 0F); // Import Box192
        gunModel[162].setRotationPoint(52F, -31.5F, -3.5F);

        gunModel[163].addShapeBox(0F, 0.5F, 0F, 4, 2, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box61
        gunModel[163].setRotationPoint(45F, -37.5F, 2.5F);

        gunModel[164].addShapeBox(0F, 0.5F, 0F, 8, 1, 6, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Import Box66
        gunModel[164].setRotationPoint(17F, -39.5F, -3F);

        gunModel[165].addShapeBox(0F, 0.5F, 0F, 1, 2, 10, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0.25F, 0F, -2F, 0.25F, 0F, 2F, 0F, 0F); // Import Box67
        gunModel[165].setRotationPoint(17F, -39.5F, -5F);

        gunModel[166].addShapeBox(0F, 0.5F, 0F, 10, 1, 6, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -3F, 0F, -0.5F); // Import Box75
        gunModel[166].setRotationPoint(36F, -34.5F, -3F);

        gunModel[167].addShapeBox(0F, 0.5F, 0F, 6, 1, 6, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F); // Import Box76
        gunModel[167].setRotationPoint(40F, -33.5F, -3F);

        gunModel[168].addShapeBox(0F, -1F, 4F, 2, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box228
        gunModel[168].setRotationPoint(42F, -40F, 4.5F);
        gunModel[168].rotateAngleX = -1.57079633F;

        gunModel[169].addShapeBox(2F, -1F, 4F, 2, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box229
        gunModel[169].setRotationPoint(43F, -40F, 4.5F);
        gunModel[169].rotateAngleX = -1.57079633F;

        gunModel[170].addShapeBox(2F, -1F, 1F, 2, 1, 3, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Import Box230
        gunModel[170].setRotationPoint(43F, -40F, 4.5F);
        gunModel[170].rotateAngleX = -1.57079633F;

        gunModel[171].addShapeBox(2F, -1F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import Box231
        gunModel[171].setRotationPoint(43F, -40F, 4.5F);
        gunModel[171].rotateAngleX = -1.57079633F;

        gunModel[172].addShapeBox(0F, -1F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import Box232
        gunModel[172].setRotationPoint(42F, -40F, 4.5F);
        gunModel[172].rotateAngleX = -1.57079633F;

        gunModel[173].addShapeBox(0F, -1F, 1F, 2, 1, 3, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box233
        gunModel[173].setRotationPoint(42F, -40F, 4.5F);
        gunModel[173].rotateAngleX = -1.57079633F;

        gunModel[174].addShapeBox(0F, -1F, 0F, 21, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box234
        gunModel[174].setRotationPoint(26F, -40F, 4.5F);
        gunModel[174].rotateAngleX = -1.57079633F;

        gunModel[175].addShapeBox(0F, -1F, 1F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F); // Import Box235
        gunModel[175].setRotationPoint(43.5F, -40F, 4.5F);
        gunModel[175].rotateAngleX = -1.57079633F;

        gunModel[176].addShapeBox(0F, -1F, 1F, 1, 1, 1, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box236
        gunModel[176].setRotationPoint(43.5F, -38F, 4.5F);
        gunModel[176].rotateAngleX = -1.57079633F;

        gunModel[177].addShapeBox(0F, -1F, 1F, 1, 1, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Import Box237
        gunModel[177].setRotationPoint(44.5F, -38F, 4.5F);
        gunModel[177].rotateAngleX = -1.57079633F;

        gunModel[178].addShapeBox(0F, -1F, 1F, 1, 1, 1, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F); // Import Box238
        gunModel[178].setRotationPoint(44.5F, -40F, 4.5F);
        gunModel[178].rotateAngleX = -1.57079633F;

        gunModel[179].addShapeBox(0F, -1F, 0F, 21, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box239
        gunModel[179].setRotationPoint(26F, -39F, 4F);
        gunModel[179].rotateAngleX = -1.57079633F;

        gunModel[180].addShapeBox(0F, -1F, 0F, 21, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box240
        gunModel[180].setRotationPoint(26F, -36F, -4F);
        gunModel[180].rotateAngleX = 1.57079633F;

        gunModel[181].addShapeBox(0F, -1F, 4F, 2, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box241
        gunModel[181].setRotationPoint(42F, -35F, -4.5F);
        gunModel[181].rotateAngleX = 1.57079633F;

        gunModel[182].addShapeBox(2F, -1F, 4F, 2, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box242
        gunModel[182].setRotationPoint(43F, -35F, -4.5F);
        gunModel[182].rotateAngleX = 1.57079633F;

        gunModel[183].addShapeBox(0F, -1F, 0F, 21, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box243
        gunModel[183].setRotationPoint(26F, -35F, -4.5F);
        gunModel[183].rotateAngleX = 1.57079633F;

        gunModel[184].addShapeBox(2F, -1F, 1F, 2, 1, 3, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Import Box244
        gunModel[184].setRotationPoint(43F, -35F, -4.5F);
        gunModel[184].rotateAngleX = 1.57079633F;

        gunModel[185].addShapeBox(2F, -1F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import Box245
        gunModel[185].setRotationPoint(43F, -35F, -4.5F);
        gunModel[185].rotateAngleX = 1.57079633F;

        gunModel[186].addShapeBox(0F, -1F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import Box246
        gunModel[186].setRotationPoint(42F, -35F, -4.5F);
        gunModel[186].rotateAngleX = 1.57079633F;

        gunModel[187].addShapeBox(0F, -1F, 1F, 2, 1, 3, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box247
        gunModel[187].setRotationPoint(42F, -35F, -4.5F);
        gunModel[187].rotateAngleX = 1.57079633F;

        gunModel[188].addShapeBox(0F, -1F, 1F, 1, 1, 1, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box248
        gunModel[188].setRotationPoint(43.5F, -37F, -4.5F);
        gunModel[188].rotateAngleX = 1.57079633F;

        gunModel[189].addShapeBox(0F, -1F, 1F, 1, 1, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Import Box249
        gunModel[189].setRotationPoint(44.5F, -37F, -4.5F);
        gunModel[189].rotateAngleX = 1.57079633F;

        gunModel[190].addShapeBox(0F, -1F, 1F, 1, 1, 1, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F); // Import Box250
        gunModel[190].setRotationPoint(44.5F, -35F, -4.5F);
        gunModel[190].rotateAngleX = 1.57079633F;

        gunModel[191].addShapeBox(0F, -1F, 1F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F); // Import Box251
        gunModel[191].setRotationPoint(43.5F, -35F, -4.5F);
        gunModel[191].rotateAngleX = 1.57079633F;

        gunModel[192].addShapeBox(0F, -1F, 0F, 8, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 273
        gunModel[192].setRotationPoint(17F, -39F, 2.5F);

        gunModel[193].addShapeBox(0F, 0.5F, 0F, 11, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 275
        gunModel[193].setRotationPoint(25F, -37.5F, 2.5F);

        gunModel[194].addShapeBox(0F, 0.5F, 0F, 10, 2, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 276
        gunModel[194].setRotationPoint(36F, -37.5F, 2.5F);

        gunModel[195].addShapeBox(0F, 0.5F, 0F, 2, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 280
        gunModel[195].setRotationPoint(49F, -36.5F, 2F);

        gunModel[196].addShapeBox(0F, 0.5F, 0F, 3, 3, 2, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
        gunModel[196].setRotationPoint(51F, -38.5F, 2F);

        gunModel[197].addShapeBox(0F, 0.5F, 0F, 4, 1, 2, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 282
        gunModel[197].setRotationPoint(49F, -39.5F, 2F);

        gunModel[198].addShapeBox(0F, 0.5F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 283
        gunModel[198].setRotationPoint(48.5F, -37.5F, 2F);

        gunModel[199].addShapeBox(0F, 0.5F, 0F, 1, 1, 2, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 284
        gunModel[199].setRotationPoint(50.5F, -37.5F, 2F);

        gunModel[200].addShapeBox(0F, 0.5F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 285
        gunModel[200].setRotationPoint(50.5F, -38.5F, 2F);

        gunModel[201].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 286
        gunModel[201].setRotationPoint(48.5F, -38.5F, 2.5F);

        gunModel[202].addShapeBox(0F, -1F, 0F, 11, 3, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
        gunModel[202].setRotationPoint(25F, -39F, 2.5F);

        gunModel[203].addShapeBox(0F, -1F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
        gunModel[203].setRotationPoint(36F, -37F, 2.5F);

        gunModel[204].addShapeBox(0F, -1F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 298
        gunModel[204].setRotationPoint(48F, -38F, 2.5F);

        gunModel[205].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, -1F, 0F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
        gunModel[205].setRotationPoint(17F, -39F, 3.5F);

        gunModel[206].addShapeBox(0F, -1F, 1F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 321
        gunModel[206].setRotationPoint(40F, -40F, 4.5F);
        gunModel[206].rotateAngleX = -1.57079633F;

        gunModel[207].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 322
        gunModel[207].setRotationPoint(40F, -40F, 4.5F);
        gunModel[207].rotateAngleX = -1.57079633F;

        gunModel[208].addShapeBox(0F, -1F, 4F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 323
        gunModel[208].setRotationPoint(40F, -40F, 4.5F);
        gunModel[208].rotateAngleX = -1.57079633F;

        gunModel[209].addShapeBox(0F, -1F, 4F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 324
        gunModel[209].setRotationPoint(40F, -35F, -4.5F);
        gunModel[209].rotateAngleX = 1.57079633F;

        gunModel[210].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 325
        gunModel[210].setRotationPoint(40F, -35F, -4.5F);
        gunModel[210].rotateAngleX = 1.57079633F;

        gunModel[211].addShapeBox(0F, -1F, 1F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 326
        gunModel[211].setRotationPoint(40F, -35F, -4.5F);
        gunModel[211].rotateAngleX = 1.57079633F;

        gunModel[212].addShapeBox(2F, -1F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 327
        gunModel[212].setRotationPoint(27F, -35F, -4.5F);
        gunModel[212].rotateAngleX = 1.57079633F;

        gunModel[213].addShapeBox(0F, -1F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 328
        gunModel[213].setRotationPoint(26F, -35F, -4.5F);
        gunModel[213].rotateAngleX = 1.57079633F;

        gunModel[214].addShapeBox(0F, -1F, 1F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F); // Box 329
        gunModel[214].setRotationPoint(27.5F, -35F, -4.5F);
        gunModel[214].rotateAngleX = 1.57079633F;

        gunModel[215].addShapeBox(0F, -1F, 1F, 2, 1, 3, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 330
        gunModel[215].setRotationPoint(26F, -35F, -4.5F);
        gunModel[215].rotateAngleX = 1.57079633F;

        gunModel[216].addShapeBox(0F, -1F, 1F, 1, 1, 1, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 331
        gunModel[216].setRotationPoint(27.5F, -37F, -4.5F);
        gunModel[216].rotateAngleX = 1.57079633F;

        gunModel[217].addShapeBox(0F, -1F, 4F, 2, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 332
        gunModel[217].setRotationPoint(26F, -35F, -4.5F);
        gunModel[217].rotateAngleX = 1.57079633F;

        gunModel[218].addShapeBox(2F, -1F, 4F, 2, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 333
        gunModel[218].setRotationPoint(27F, -35F, -4.5F);
        gunModel[218].rotateAngleX = 1.57079633F;

        gunModel[219].addShapeBox(0F, -1F, 1F, 1, 1, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 334
        gunModel[219].setRotationPoint(28.5F, -37F, -4.5F);
        gunModel[219].rotateAngleX = 1.57079633F;

        gunModel[220].addShapeBox(2F, -1F, 1F, 2, 1, 3, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 335
        gunModel[220].setRotationPoint(27F, -35F, -4.5F);
        gunModel[220].rotateAngleX = 1.57079633F;

        gunModel[221].addShapeBox(0F, -1F, 1F, 1, 1, 1, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F); // Box 336
        gunModel[221].setRotationPoint(28.5F, -35F, -4.5F);
        gunModel[221].rotateAngleX = 1.57079633F;

        gunModel[222].addShapeBox(0F, -1F, 1F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F); // Box 337
        gunModel[222].setRotationPoint(27.5F, -40F, 4.5F);
        gunModel[222].rotateAngleX = -1.57079633F;

        gunModel[223].addShapeBox(0F, -1F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 338
        gunModel[223].setRotationPoint(26F, -40F, 4.5F);
        gunModel[223].rotateAngleX = -1.57079633F;

        gunModel[224].addShapeBox(2F, -1F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 339
        gunModel[224].setRotationPoint(27F, -40F, 4.5F);
        gunModel[224].rotateAngleX = -1.57079633F;

        gunModel[225].addShapeBox(0F, -1F, 1F, 1, 1, 1, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F); // Box 340
        gunModel[225].setRotationPoint(28.5F, -40F, 4.5F);
        gunModel[225].rotateAngleX = -1.57079633F;

        gunModel[226].addShapeBox(2F, -1F, 1F, 2, 1, 3, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 341
        gunModel[226].setRotationPoint(27F, -40F, 4.5F);
        gunModel[226].rotateAngleX = -1.57079633F;

        gunModel[227].addShapeBox(2F, -1F, 4F, 2, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 342
        gunModel[227].setRotationPoint(27F, -40F, 4.5F);
        gunModel[227].rotateAngleX = -1.57079633F;

        gunModel[228].addShapeBox(0F, -1F, 4F, 2, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 343
        gunModel[228].setRotationPoint(26F, -40F, 4.5F);
        gunModel[228].rotateAngleX = -1.57079633F;

        gunModel[229].addShapeBox(0F, -1F, 1F, 1, 1, 1, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 344
        gunModel[229].setRotationPoint(27.5F, -38F, 4.5F);
        gunModel[229].rotateAngleX = -1.57079633F;

        gunModel[230].addShapeBox(0F, -1F, 1F, 2, 1, 3, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 345
        gunModel[230].setRotationPoint(26F, -40F, 4.5F);
        gunModel[230].rotateAngleX = -1.57079633F;

        gunModel[231].addShapeBox(0F, -1F, 1F, 1, 1, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 346
        gunModel[231].setRotationPoint(28.5F, -38F, 4.5F);
        gunModel[231].rotateAngleX = -1.57079633F;

        gunModel[232].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 347
        gunModel[232].setRotationPoint(38F, -40F, 4.5F);
        gunModel[232].rotateAngleX = -1.57079633F;

        gunModel[233].addShapeBox(0F, -1F, 1F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 348
        gunModel[233].setRotationPoint(38F, -40F, 4.5F);
        gunModel[233].rotateAngleX = -1.57079633F;

        gunModel[234].addShapeBox(0F, -1F, 4F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 349
        gunModel[234].setRotationPoint(38F, -40F, 4.5F);
        gunModel[234].rotateAngleX = -1.57079633F;

        gunModel[235].addShapeBox(0F, -1F, 4F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 350
        gunModel[235].setRotationPoint(38F, -35F, -4.5F);
        gunModel[235].rotateAngleX = 1.57079633F;

        gunModel[236].addShapeBox(0F, -1F, 1F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 351
        gunModel[236].setRotationPoint(38F, -35F, -4.5F);
        gunModel[236].rotateAngleX = 1.57079633F;

        gunModel[237].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 352
        gunModel[237].setRotationPoint(38F, -35F, -4.5F);
        gunModel[237].rotateAngleX = 1.57079633F;

        gunModel[238].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 353
        gunModel[238].setRotationPoint(34F, -40F, 4.5F);
        gunModel[238].rotateAngleX = -1.57079633F;

        gunModel[239].addShapeBox(0F, -1F, 1F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 354
        gunModel[239].setRotationPoint(34F, -40F, 4.5F);
        gunModel[239].rotateAngleX = -1.57079633F;

        gunModel[240].addShapeBox(0F, -1F, 4F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 355
        gunModel[240].setRotationPoint(34F, -40F, 4.5F);
        gunModel[240].rotateAngleX = -1.57079633F;

        gunModel[241].addShapeBox(0F, -1F, 4F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 356
        gunModel[241].setRotationPoint(34F, -35F, -4.5F);
        gunModel[241].rotateAngleX = 1.57079633F;

        gunModel[242].addShapeBox(0F, -1F, 1F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 357
        gunModel[242].setRotationPoint(34F, -35F, -4.5F);
        gunModel[242].rotateAngleX = 1.57079633F;

        gunModel[243].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 358
        gunModel[243].setRotationPoint(34F, -35F, -4.5F);
        gunModel[243].rotateAngleX = 1.57079633F;

        gunModel[244].addShapeBox(0F, -1F, 4F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 359
        gunModel[244].setRotationPoint(36F, -35F, -4.5F);
        gunModel[244].rotateAngleX = 1.57079633F;

        gunModel[245].addShapeBox(0F, -1F, 1F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 360
        gunModel[245].setRotationPoint(36F, -35F, -4.5F);
        gunModel[245].rotateAngleX = 1.57079633F;

        gunModel[246].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 361
        gunModel[246].setRotationPoint(36F, -35F, -4.5F);
        gunModel[246].rotateAngleX = 1.57079633F;

        gunModel[247].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 362
        gunModel[247].setRotationPoint(36F, -40F, 4.5F);
        gunModel[247].rotateAngleX = -1.57079633F;

        gunModel[248].addShapeBox(0F, -1F, 1F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 363
        gunModel[248].setRotationPoint(36F, -40F, 4.5F);
        gunModel[248].rotateAngleX = -1.57079633F;

        gunModel[249].addShapeBox(0F, -1F, 4F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 364
        gunModel[249].setRotationPoint(36F, -40F, 4.5F);
        gunModel[249].rotateAngleX = -1.57079633F;

        gunModel[250].addShapeBox(0F, -1F, 4F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 368
        gunModel[250].setRotationPoint(30F, -35F, -4.5F);
        gunModel[250].rotateAngleX = 1.57079633F;

        gunModel[251].addShapeBox(0F, -1F, 4F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 371
        gunModel[251].setRotationPoint(32F, -35F, -4.5F);
        gunModel[251].rotateAngleX = 1.57079633F;

        gunModel[252].addShapeBox(0F, -1F, 1F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 372
        gunModel[252].setRotationPoint(32F, -35F, -4.5F);
        gunModel[252].rotateAngleX = 1.57079633F;

        gunModel[253].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 373
        gunModel[253].setRotationPoint(32F, -35F, -4.5F);
        gunModel[253].rotateAngleX = 1.57079633F;

        gunModel[254].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 374
        gunModel[254].setRotationPoint(32F, -40F, 4.5F);
        gunModel[254].rotateAngleX = -1.57079633F;

        gunModel[255].addShapeBox(0F, -1F, 1F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 375
        gunModel[255].setRotationPoint(32F, -40F, 4.5F);
        gunModel[255].rotateAngleX = -1.57079633F;

        gunModel[256].addShapeBox(0F, -1F, 4F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 376
        gunModel[256].setRotationPoint(32F, -40F, 4.5F);
        gunModel[256].rotateAngleX = -1.57079633F;

        gunModel[257].addShapeBox(0F, 0.5F, 0F, 4, 2, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 434
        gunModel[257].setRotationPoint(45F, -37.5F, -3.5F);

        gunModel[258].addShapeBox(0F, -1F, 0F, 8, 1, 1, 0F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
        gunModel[258].setRotationPoint(17F, -39F, -3.5F);

        gunModel[259].addShapeBox(0F, 0.5F, 0F, 11, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 436
        gunModel[259].setRotationPoint(25F, -37.5F, -3.5F);

        gunModel[260].addShapeBox(0F, 0.5F, 0F, 10, 2, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 437
        gunModel[260].setRotationPoint(36F, -37.5F, -3.5F);

        gunModel[261].addShapeBox(0F, 0.5F, 0F, 2, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 438
        gunModel[261].setRotationPoint(49F, -36.5F, -4F);

        gunModel[262].addShapeBox(0F, 0.5F, 0F, 3, 3, 2, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 439
        gunModel[262].setRotationPoint(51F, -38.5F, -4F);

        gunModel[263].addShapeBox(0F, 0.5F, 0F, 4, 1, 2, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 440
        gunModel[263].setRotationPoint(49F, -39.5F, -4F);

        gunModel[264].addShapeBox(0F, 0.5F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 441
        gunModel[264].setRotationPoint(48.5F, -37.5F, -4F);

        gunModel[265].addShapeBox(0F, 0.5F, 0F, 1, 1, 2, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 442
        gunModel[265].setRotationPoint(50.5F, -37.5F, -4F);

        gunModel[266].addShapeBox(0F, 0.5F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 443
        gunModel[266].setRotationPoint(50.5F, -38.5F, -4F);

        gunModel[267].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 444
        gunModel[267].setRotationPoint(48.5F, -38.5F, -3.5F);

        gunModel[268].addShapeBox(0F, -1F, 0F, 11, 3, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
        gunModel[268].setRotationPoint(25F, -39F, -3.5F);

        gunModel[269].addShapeBox(0F, -1F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
        gunModel[269].setRotationPoint(36F, -37F, -3.5F);

        gunModel[270].addShapeBox(0F, -1F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 447
        gunModel[270].setRotationPoint(48F, -38F, -3.5F);

        gunModel[271].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 448
        gunModel[271].setRotationPoint(17F, -39F, -4.5F);

        gunModel[272].addShapeBox(0F, -1F, -2.5F, 30, 1, 5, 0F, 0F, -0.5F, 0F, 8F, -0.5F, 0F, 8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 8F, 0F, -0.5F, 8F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box1
        gunModel[272].setRotationPoint(17F, -40F, 0F);

        gunModel[273].addShapeBox(24F, -1F, 1.5F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box44
        gunModel[273].setRotationPoint(-7F, -40F, 0F);

        gunModel[274].addShapeBox(24F, -1F, -1.5F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box45
        gunModel[274].setRotationPoint(-7F, -40F, 0F);

        gunModel[275].addShapeBox(24F, -1F, -2.5F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import Box46
        gunModel[275].setRotationPoint(-7F, -40F, 0F);

        gunModel[276].addShapeBox(0F, -1F, -2.5F, 8, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
        gunModel[276].setRotationPoint(47F, -39F, 0.5F);

        gunModel[277].addShapeBox(0F, -1F, -2.5F, 30, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
        gunModel[277].setRotationPoint(17F, -39F, 0.5F);

        gunModel[278].addShapeBox(0F, -1F, -2.5F, 8, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 279
        gunModel[278].setRotationPoint(47F, -36F, 0.5F);

        gunModel[279].addShapeBox(24F, -1F, 1.5F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 377
        gunModel[279].setRotationPoint(-5F, -40F, 0F);

        gunModel[280].addShapeBox(24F, -1F, -1.5F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 378
        gunModel[280].setRotationPoint(-5F, -40F, 0F);

        gunModel[281].addShapeBox(24F, -1F, -2.5F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 379
        gunModel[281].setRotationPoint(-5F, -40F, 0F);

        gunModel[282].addShapeBox(24F, -1F, 1.5F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 380
        gunModel[282].setRotationPoint(-1F, -40F, 0F);

        gunModel[283].addShapeBox(24F, -1F, -1.5F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 381
        gunModel[283].setRotationPoint(-1F, -40F, 0F);

        gunModel[284].addShapeBox(24F, -1F, -2.5F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 382
        gunModel[284].setRotationPoint(-1F, -40F, 0F);

        gunModel[285].addShapeBox(24F, -1F, -2.5F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 383
        gunModel[285].setRotationPoint(-3F, -40F, 0F);

        gunModel[286].addShapeBox(24F, -1F, -1.5F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 384
        gunModel[286].setRotationPoint(-3F, -40F, 0F);

        gunModel[287].addShapeBox(24F, -1F, 1.5F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 385
        gunModel[287].setRotationPoint(-3F, -40F, 0F);

        gunModel[288].addShapeBox(24F, -1F, 1.5F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 386
        gunModel[288].setRotationPoint(7F, -40F, 0F);

        gunModel[289].addShapeBox(24F, -1F, -1.5F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 387
        gunModel[289].setRotationPoint(7F, -40F, 0F);

        gunModel[290].addShapeBox(24F, -1F, -2.5F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 388
        gunModel[290].setRotationPoint(7F, -40F, 0F);

        gunModel[291].addShapeBox(24F, -1F, -2.5F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 389
        gunModel[291].setRotationPoint(5F, -40F, 0F);

        gunModel[292].addShapeBox(24F, -1F, -1.5F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 390
        gunModel[292].setRotationPoint(5F, -40F, 0F);

        gunModel[293].addShapeBox(24F, -1F, 1.5F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 391
        gunModel[293].setRotationPoint(5F, -40F, 0F);

        gunModel[294].addShapeBox(24F, -1F, -2.5F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 392
        gunModel[294].setRotationPoint(3F, -40F, 0F);

        gunModel[295].addShapeBox(24F, -1F, -1.5F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 393
        gunModel[295].setRotationPoint(3F, -40F, 0F);

        gunModel[296].addShapeBox(24F, -1F, 1.5F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 394
        gunModel[296].setRotationPoint(3F, -40F, 0F);

        gunModel[297].addShapeBox(24F, -1F, -2.5F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 395
        gunModel[297].setRotationPoint(1F, -40F, 0F);

        gunModel[298].addShapeBox(24F, -1F, -1.5F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 396
        gunModel[298].setRotationPoint(1F, -40F, 0F);

        gunModel[299].addShapeBox(24F, -1F, 1.5F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 397
        gunModel[299].setRotationPoint(1F, -40F, 0F);

        gunModel[300].addShapeBox(24F, -1F, 1.5F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 398
        gunModel[300].setRotationPoint(15F, -40F, 0F);

        gunModel[301].addShapeBox(24F, -1F, -1.5F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 399
        gunModel[301].setRotationPoint(15F, -40F, 0F);

        gunModel[302].addShapeBox(24F, -1F, -2.5F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 400
        gunModel[302].setRotationPoint(15F, -40F, 0F);

        gunModel[303].addShapeBox(24F, -1F, -2.5F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 401
        gunModel[303].setRotationPoint(13F, -40F, 0F);

        gunModel[304].addShapeBox(24F, -1F, -1.5F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 402
        gunModel[304].setRotationPoint(13F, -40F, 0F);

        gunModel[305].addShapeBox(24F, -1F, 1.5F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 403
        gunModel[305].setRotationPoint(13F, -40F, 0F);

        gunModel[306].addShapeBox(24F, -1F, -2.5F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 404
        gunModel[306].setRotationPoint(11F, -40F, 0F);

        gunModel[307].addShapeBox(24F, -1F, -1.5F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 405
        gunModel[307].setRotationPoint(11F, -40F, 0F);

        gunModel[308].addShapeBox(24F, -1F, 1.5F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 406
        gunModel[308].setRotationPoint(11F, -40F, 0F);

        gunModel[309].addShapeBox(24F, -1F, -2.5F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 407
        gunModel[309].setRotationPoint(9F, -40F, 0F);

        gunModel[310].addShapeBox(24F, -1F, -1.5F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 408
        gunModel[310].setRotationPoint(9F, -40F, 0F);

        gunModel[311].addShapeBox(24F, -1F, 1.5F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 409
        gunModel[311].setRotationPoint(9F, -40F, 0F);

        gunModel[312].addShapeBox(24F, -1F, 1.5F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 410
        gunModel[312].setRotationPoint(23F, -40F, 0F);

        gunModel[313].addShapeBox(24F, -1F, -1.5F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 411
        gunModel[313].setRotationPoint(23F, -40F, 0F);

        gunModel[314].addShapeBox(24F, -1F, -2.5F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 412
        gunModel[314].setRotationPoint(23F, -40F, 0F);

        gunModel[315].addShapeBox(24F, -1F, -2.5F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 413
        gunModel[315].setRotationPoint(21F, -40F, 0F);

        gunModel[316].addShapeBox(24F, -1F, -1.5F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 414
        gunModel[316].setRotationPoint(21F, -40F, 0F);

        gunModel[317].addShapeBox(24F, -1F, 1.5F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 415
        gunModel[317].setRotationPoint(21F, -40F, 0F);

        gunModel[318].addShapeBox(24F, -1F, -2.5F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 416
        gunModel[318].setRotationPoint(19F, -40F, 0F);

        gunModel[319].addShapeBox(24F, -1F, -1.5F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 417
        gunModel[319].setRotationPoint(19F, -40F, 0F);

        gunModel[320].addShapeBox(24F, -1F, 1.5F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 418
        gunModel[320].setRotationPoint(19F, -40F, 0F);

        gunModel[321].addShapeBox(24F, -1F, -2.5F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 419
        gunModel[321].setRotationPoint(17F, -40F, 0F);

        gunModel[322].addShapeBox(24F, -1F, -1.5F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 420
        gunModel[322].setRotationPoint(17F, -40F, 0F);

        gunModel[323].addShapeBox(24F, -1F, 1.5F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 421
        gunModel[323].setRotationPoint(17F, -40F, 0F);

        gunModel[324].addShapeBox(24F, -1F, 1.5F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 422
        gunModel[324].setRotationPoint(29F, -40F, 0F);

        gunModel[325].addShapeBox(24F, -1F, -1.5F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 423
        gunModel[325].setRotationPoint(29F, -40F, 0F);

        gunModel[326].addShapeBox(24F, -1F, -2.5F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 424
        gunModel[326].setRotationPoint(29F, -40F, 0F);

        gunModel[327].addShapeBox(24F, -1F, -2.5F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 425
        gunModel[327].setRotationPoint(27F, -40F, 0F);

        gunModel[328].addShapeBox(24F, -1F, -1.5F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 426
        gunModel[328].setRotationPoint(27F, -40F, 0F);

        gunModel[329].addShapeBox(24F, -1F, 1.5F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 427
        gunModel[329].setRotationPoint(27F, -40F, 0F);

        gunModel[330].addShapeBox(24F, -1F, -2.5F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 428
        gunModel[330].setRotationPoint(25F, -40F, 0F);

        gunModel[331].addShapeBox(24F, -1F, -1.5F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 429
        gunModel[331].setRotationPoint(25F, -40F, 0F);

        gunModel[332].addShapeBox(24F, -1F, 1.5F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 430
        gunModel[332].setRotationPoint(25F, -40F, 0F);

        gunModel[333].addShapeBox(24F, -1F, -2.5F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 431
        gunModel[333].setRotationPoint(30F, -40F, 0F);

        gunModel[334].addShapeBox(24F, -1F, -1.5F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 432
        gunModel[334].setRotationPoint(30F, -40F, 0F);

        gunModel[335].addShapeBox(24F, -1F, 1.5F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 433
        gunModel[335].setRotationPoint(30F, -40F, 0F);

        gunModel[336].addShapeBox(0F, 0.5F, 0F, 4, 3, 1, 0F, 0.5F, 0F, -0.75F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.75F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box144
        gunModel[336].setRotationPoint(-19.5F, -30.5F, -5F);

        gunModel[337].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 578
        gunModel[337].setRotationPoint(27.5F, -36.5F, -4.25F);

        gunModel[338].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 579
        gunModel[338].setRotationPoint(27.5F, -37.5F, -4.25F);

        gunModel[339].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 580
        gunModel[339].setRotationPoint(27.5F, -38.5F, -4.25F);

        gunModel[340].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 578
        gunModel[340].setRotationPoint(43.5F, -36.5F, -4.25F);

        gunModel[341].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 579
        gunModel[341].setRotationPoint(43.5F, -37.5F, -4.25F);

        gunModel[342].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 580
        gunModel[342].setRotationPoint(43.5F, -38.5F, -4.25F);

        gunModel[343].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F); // Box 578
        gunModel[343].setRotationPoint(27.5F, -36.5F, 3.25F);

        gunModel[344].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 579
        gunModel[344].setRotationPoint(27.5F, -37.5F, 3.25F);

        gunModel[345].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F); // Box 580
        gunModel[345].setRotationPoint(27.5F, -38.5F, 3.25F);

        gunModel[346].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F); // Box 578
        gunModel[346].setRotationPoint(43.5F, -36.5F, 3.25F);

        gunModel[347].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 579
        gunModel[347].setRotationPoint(43.5F, -37.5F, 3.25F);

        gunModel[348].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F); // Box 580
        gunModel[348].setRotationPoint(43.5F, -38.5F, 3.25F);


        defaultBarrelModel = new ModelRendererTurbo[21];
        defaultBarrelModel[0] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Import Box163
        defaultBarrelModel[1] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Import Box165
        defaultBarrelModel[2] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Import Box166
        defaultBarrelModel[3] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Import Box167
        defaultBarrelModel[4] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Import Box168
        defaultBarrelModel[5] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Import Box169
        defaultBarrelModel[6] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Import Box170
        defaultBarrelModel[7] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Import Box171
        defaultBarrelModel[8] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Import Box172
        defaultBarrelModel[9] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Import Box173
        defaultBarrelModel[10] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Import Box174
        defaultBarrelModel[11] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Import Box175
        defaultBarrelModel[12] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Import Box176
        defaultBarrelModel[13] = new ModelRendererTurbo(this, 297, 137, textureX, textureY); // Import Box177
        defaultBarrelModel[14] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Import Box178
        defaultBarrelModel[15] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Import Box179
        defaultBarrelModel[16] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Import Box180
        defaultBarrelModel[17] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Import Box181
        defaultBarrelModel[18] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Import Box182
        defaultBarrelModel[19] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Import Box183
        defaultBarrelModel[20] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Import Box184

        defaultBarrelModel[0].addShapeBox(0F, 0.5F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box163
        defaultBarrelModel[0].setRotationPoint(55F, -24F, -2F);

        defaultBarrelModel[1].addShapeBox(0F, 0.5F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, -1F, 0F, -0.5F, -1F); // Import Box165
        defaultBarrelModel[1].setRotationPoint(55F, -22F, -1.5F);

        defaultBarrelModel[2].addShapeBox(0F, 0.5F, 0F, 2, 1, 3, 0F, 0F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box166
        defaultBarrelModel[2].setRotationPoint(55F, -26F, -1.5F);

        defaultBarrelModel[3].addShapeBox(0F, 0.5F, 0F, 2, 1, 4, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box167
        defaultBarrelModel[3].setRotationPoint(55F, -25F, -2F);

        defaultBarrelModel[4].addShapeBox(0F, 0.5F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box168
        defaultBarrelModel[4].setRotationPoint(56.5F, -24F, -2F);

        defaultBarrelModel[5].addShapeBox(0F, 0.5F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box169
        defaultBarrelModel[5].setRotationPoint(56.5F, -25F, -2F);

        defaultBarrelModel[6].addShapeBox(0F, 0.5F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box170
        defaultBarrelModel[6].setRotationPoint(56.5F, -23F, -2F);

        defaultBarrelModel[7].addShapeBox(0F, 0.5F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box171
        defaultBarrelModel[7].setRotationPoint(55F, -23F, -2F);

        defaultBarrelModel[8].addShapeBox(0F, 0.5F, 0F, 7, 1, 4, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box172
        defaultBarrelModel[8].setRotationPoint(58F, -25F, -2F);

        defaultBarrelModel[9].addShapeBox(0F, 0.5F, 0F, 7, 1, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box173
        defaultBarrelModel[9].setRotationPoint(58F, -24F, -2F);

        defaultBarrelModel[10].addShapeBox(0F, 0.5F, 0F, 7, 1, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box174
        defaultBarrelModel[10].setRotationPoint(58F, -23F, -2F);

        defaultBarrelModel[11].addShapeBox(0F, 0.5F, 0F, 6, 1, 3, 0F, 0F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box175
        defaultBarrelModel[11].setRotationPoint(58F, -26F, -1.5F);

        defaultBarrelModel[12].addShapeBox(0F, 0.5F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0F, -0.5F, -1F); // Import Box176
        defaultBarrelModel[12].setRotationPoint(58F, -22F, -1.5F);

        defaultBarrelModel[13].addShapeBox(0F, 0.5F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0F, -0.5F, -1F); // Import Box177
        defaultBarrelModel[13].setRotationPoint(64.5F, -22F, -1.5F);

        defaultBarrelModel[14].addShapeBox(0F, 0.5F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box178
        defaultBarrelModel[14].setRotationPoint(64.5F, -23F, -2F);

        defaultBarrelModel[15].addShapeBox(0F, 0.5F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Import Box179
        defaultBarrelModel[15].setRotationPoint(64.5F, -24F, -2F);

        defaultBarrelModel[16].addShapeBox(0F, 0.5F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box180
        defaultBarrelModel[16].setRotationPoint(64.5F, -25F, -2F);

        defaultBarrelModel[17].addShapeBox(0F, 0.5F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box181
        defaultBarrelModel[17].setRotationPoint(64.5F, -26F, -1.5F);

        defaultBarrelModel[18].addShapeBox(0F, 0.5F, 0F, 1, 1, 3, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box182
        defaultBarrelModel[18].setRotationPoint(57F, -24F, -1.5F);

        defaultBarrelModel[19].addShapeBox(0F, 0.5F, 0F, 1, 1, 3, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box183
        defaultBarrelModel[19].setRotationPoint(57F, -25F, -1.5F);

        defaultBarrelModel[20].addShapeBox(0F, 0.5F, 0F, 1, 1, 3, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box184
        defaultBarrelModel[20].setRotationPoint(57F, -23F, -1.5F);


        ammoModel = new ModelRendererTurbo[16];
        ammoModel[0] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import Box207
        ammoModel[1] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Import Box208
        ammoModel[2] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Import Box209
        ammoModel[3] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Import Box210
        ammoModel[4] = new ModelRendererTurbo(this, 297, 137, textureX, textureY); // Import Box211
        ammoModel[5] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Import Box212
        ammoModel[6] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Import Box213
        ammoModel[7] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Import Box214
        ammoModel[8] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Import Box215
        ammoModel[9] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Import Box216
        ammoModel[10] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Import Box217
        ammoModel[11] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import Box209
        ammoModel[12] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Import Box209
        ammoModel[13] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Import Box209
        ammoModel[14] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Import Box209
        ammoModel[15] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Import Box209

        ammoModel[0].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box207
        ammoModel[0].setRotationPoint(-13F, -31.5F, -5F);

        ammoModel[1].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box208
        ammoModel[1].setRotationPoint(-11F, -31.5F, -5F);

        ammoModel[2].addShapeBox(0F, 0F, 0F, 54, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box209
        ammoModel[2].setRotationPoint(-10F, -31.5F, -4.5F);

        ammoModel[3].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box210
        ammoModel[3].setRotationPoint(-16F, -31.5F, -4F);

        ammoModel[4].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box211
        ammoModel[4].setRotationPoint(-15F, -31.5F, -5F);

        ammoModel[5].addShapeBox(0F, 0F, 0F, 54, 4, 9, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box212
        ammoModel[5].setRotationPoint(-10F, -31F, -4.5F);

        ammoModel[6].addShapeBox(0F, 0F, 0F, 54, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box213
        ammoModel[6].setRotationPoint(-10F, -27.5F, -4.5F);

        ammoModel[7].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import Box214
        ammoModel[7].setRotationPoint(44F, -31.5F, -4.5F);

        ammoModel[8].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Import Box215
        ammoModel[8].setRotationPoint(45F, -31.5F, -4.5F);

        ammoModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Import Box216
        ammoModel[9].setRotationPoint(45F, -32.5F, -4.5F);

        ammoModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F); // Import Box217
        ammoModel[10].setRotationPoint(45F, -26.5F, -4.5F);

        ammoModel[11].addShapeBox(0F, 0F, 0F, 54, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Import Box209
        ammoModel[11].setRotationPoint(-10F, -31.65F, -3F);

        ammoModel[12].addShapeBox(0F, 0F, 0F, 54, 1, 1, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box209
        ammoModel[12].setRotationPoint(-10F, -31.65F, 2F);

        ammoModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, 0F, -0.25F, 0.25F, 0F, -2.25F, 0F, 0F, 2F, 0F, 0F, 0F, -0.5F, -0.5F, -0.25F, 0.25F, -0.5F, -2.25F, 0F, -0.5F, 2F, 0F, -0.5F, 0F); // Import Box209
        ammoModel[13].setRotationPoint(-13F, -31.65F, 0F);

        ammoModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0.25F, 0F, -2.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0.25F, -0.5F, -2.25F, -0.5F, -0.5F, -0.25F); // Import Box209
        ammoModel[14].setRotationPoint(-13F, -31.65F, -1F);

        ammoModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box209
        ammoModel[15].setRotationPoint(-13F, -31.65F, -1F);


        slideModel = new ModelRendererTurbo[10];
        slideModel[0] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box202
        slideModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box203
        slideModel[2] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box204
        slideModel[3] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box205
        slideModel[4] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box206
        slideModel[5] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box207
        slideModel[6] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import Box208
        slideModel[7] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box209
        slideModel[8] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box210
        slideModel[9] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 871

        slideModel[0].addShapeBox(0F, 0.5F, 0F, 22, 3, 8, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -7.25F, 0F, 0F, -7.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -7.25F, 0F, 0F, -7.25F); // Import Box202
        slideModel[0].setRotationPoint(20.5F, -23.5F, -4F);

        slideModel[1].addShapeBox(0F, 0.5F, 0F, 5, 3, 8, 0F, 0F, 0.25F, -0.125F, -0.5F, 0.25F, -0.125F, -0.5F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, -0.5F, 0.25F, -0.125F, -0.5F, 0.25F, -0.125F, 0F, 0.25F, -0.125F); // Import Box203
        slideModel[1].setRotationPoint(40.5F, -23.5F, -4F);

        slideModel[2].addShapeBox(0F, 0.5F, 0F, 1, 3, 7, 0F, 0F, 0.25F, -0.125F, -0.5F, -0.75F, -0.125F, -0.5F, -0.75F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -0.125F, -0.5F, -0.75F, -0.125F, -0.5F, -0.75F, 0.5F, 0F, 0.25F, 0.5F); // Import Box204
        slideModel[2].setRotationPoint(45F, -23.5F, -3F);

        slideModel[3].addShapeBox(0F, 0.5F, 0F, 4, 1, 7, 0F, -1F, 0F, -0.125F, -1.5F, 0F, -0.125F, -1.5F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box205
        slideModel[3].setRotationPoint(41.5F, -24.25F, -3F);

        slideModel[4].addShapeBox(0F, 0.5F, 0F, 4, 1, 7, 0F, 0F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -1F, 0F, -0.125F, -1.5F, 0F, -0.125F, -1.5F, 0F, 0.5F, -1F, 0F, 0.5F); // Import Box206
        slideModel[4].setRotationPoint(41.5F, -20.75F, -3F);

        slideModel[5].addShapeBox(0F, 0.5F, 0F, 1, 1, 7, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.5F, -1F, 0F, 0.5F); // Import Box207
        slideModel[5].setRotationPoint(44F, -23.75F, -3F);

        slideModel[6].addShapeBox(0F, 0.5F, 0F, 1, 1, 7, 0F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box208
        slideModel[6].setRotationPoint(44F, -21.25F, -3F);

        slideModel[7].addShapeBox(0F, 0.5F, 0F, 1, 1, 7, 0F, 0F, 0F, -0.125F, 0.25F, 0F, -0.125F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.75F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, 0.5F, 0F, -0.75F, 0.5F); // Import Box209
        slideModel[7].setRotationPoint(41.5F, -23.75F, -3F);

        slideModel[8].addShapeBox(0F, 0.5F, 0F, 1, 1, 7, 0F, 0F, -0.75F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, -0.125F, 0.25F, 0F, -0.125F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box210
        slideModel[8].setRotationPoint(41.5F, -21.25F, -3F);

        slideModel[9].addShapeBox(0F, 0.5F, 0F, 22, 3, 8, 0F, 0F, 0F, -7.25F, 0F, 0F, -7.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -7.25F, 0F, 0F, -7.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 871
        slideModel[9].setRotationPoint(20.5F, -23.5F, -4F);


        barrelAttachPoint = new Vector3f(55F / 16F, 23F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(36F / 16F, 37.5F / 16F, -5F / 16F);
        scopeAttachPoint = new Vector3f(28F / 16F, 40.5F / 16F, 0F / 16F);

        gunSlideDistance = 1F;
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
        leftArmPos = new Vector3f(0.0625F, -0.2F, 0.0F);
        leftArmRot = new Vector3f(80.0F, 55.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.2F, -0.65F, 0.1F);
        leftArmReloadRot = new Vector3f(80.0F, 60.0F, 0.0F);
        rightArmPos = new Vector3f(0.21F, -0.41F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmReloadPos = new Vector3f(0.21F, -0.41F, 0.0F);
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

        zoomOffsetY = -0.12F;
        flipAll();
        crouchZoom = -0.05F;
        zoomOffset = 0.4F;
        gunOffset = -0.7F;
        gunOffsetX = -1.5F;
    }
}