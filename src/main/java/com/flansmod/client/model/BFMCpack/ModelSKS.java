//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: sks
// Model Creator: 
// Created on: 17.03.2018 - 18:56:38
// Last changed on: 17.03.2018 - 18:56:38

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelSKS extends ModelGun //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public ModelSKS() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[233];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        gunModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 1
        gunModel[2] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 2
        gunModel[3] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 26
        gunModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 35
        gunModel[5] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 36
        gunModel[6] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 39
        gunModel[7] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 40
        gunModel[8] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 41
        gunModel[9] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 44
        gunModel[10] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 45
        gunModel[11] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 46
        gunModel[12] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 47
        gunModel[13] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 48
        gunModel[14] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 49
        gunModel[15] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 50
        gunModel[16] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 51
        gunModel[17] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 52
        gunModel[18] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 53
        gunModel[19] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 54
        gunModel[20] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 55
        gunModel[21] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 56
        gunModel[22] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 57
        gunModel[23] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 60
        gunModel[24] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 61
        gunModel[25] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 64
        gunModel[26] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 65
        gunModel[27] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 66
        gunModel[28] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 67
        gunModel[29] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 68
        gunModel[30] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 69
        gunModel[31] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 70
        gunModel[32] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 71
        gunModel[33] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 73
        gunModel[34] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 74
        gunModel[35] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 75
        gunModel[36] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 76
        gunModel[37] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 77
        gunModel[38] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 78
        gunModel[39] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 79
        gunModel[40] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 80
        gunModel[41] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 81
        gunModel[42] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 82
        gunModel[43] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 83
        gunModel[44] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 84
        gunModel[45] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 85
        gunModel[46] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 86
        gunModel[47] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 87
        gunModel[48] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 88
        gunModel[49] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 89
        gunModel[50] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 90
        gunModel[51] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 91
        gunModel[52] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 92
        gunModel[53] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 93
        gunModel[54] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 94
        gunModel[55] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 95
        gunModel[56] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 96
        gunModel[57] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 97
        gunModel[58] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 98
        gunModel[59] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 99
        gunModel[60] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 100
        gunModel[61] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 101
        gunModel[62] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 102
        gunModel[63] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 103
        gunModel[64] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 104
        gunModel[65] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 105
        gunModel[66] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 106
        gunModel[67] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 107
        gunModel[68] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 108
        gunModel[69] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 109
        gunModel[70] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 111
        gunModel[71] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 113
        gunModel[72] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 114
        gunModel[73] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 115
        gunModel[74] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 116
        gunModel[75] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 117
        gunModel[76] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 118
        gunModel[77] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 119
        gunModel[78] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 120
        gunModel[79] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 121
        gunModel[80] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 122
        gunModel[81] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 123
        gunModel[82] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 124
        gunModel[83] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 125
        gunModel[84] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 126
        gunModel[85] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 127
        gunModel[86] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 133
        gunModel[87] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 134
        gunModel[88] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 135
        gunModel[89] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 136
        gunModel[90] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 137
        gunModel[91] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 138
        gunModel[92] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 139
        gunModel[93] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 140
        gunModel[94] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 141
        gunModel[95] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 142
        gunModel[96] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 143
        gunModel[97] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 144
        gunModel[98] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 137
        gunModel[99] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 138
        gunModel[100] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 139
        gunModel[101] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 140
        gunModel[102] = new ModelRendererTurbo(this, 177, 300, textureX, textureY); // Box 171
        gunModel[103] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 188
        gunModel[104] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 189
        gunModel[105] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 204
        gunModel[106] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 205
        gunModel[107] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 206
        gunModel[108] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 207
        gunModel[109] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 208
        gunModel[110] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 209
        gunModel[111] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 210
        gunModel[112] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 211
        gunModel[113] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 212
        gunModel[114] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 213
        gunModel[115] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 214
        gunModel[116] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 215
        gunModel[117] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 216
        gunModel[118] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 217
        gunModel[119] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 218
        gunModel[120] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 219
        gunModel[121] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 220
        gunModel[122] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 221
        gunModel[123] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 222
        gunModel[124] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 223
        gunModel[125] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 224
        gunModel[126] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 225
        gunModel[127] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 226
        gunModel[128] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 227
        gunModel[129] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 228
        gunModel[130] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 229
        gunModel[131] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 230
        gunModel[132] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 231
        gunModel[133] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 232
        gunModel[134] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 233
        gunModel[135] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 234
        gunModel[136] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 239
        gunModel[137] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 240
        gunModel[138] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 243
        gunModel[139] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 244
        gunModel[140] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 245
        gunModel[141] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 246
        gunModel[142] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 247
        gunModel[143] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 248
        gunModel[144] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 249
        gunModel[145] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 250
        gunModel[146] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Box 251
        gunModel[147] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Box 252
        gunModel[148] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 253
        gunModel[149] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 254
        gunModel[150] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 255
        gunModel[151] = new ModelRendererTurbo(this, 361, 145, textureX, textureY); // Box 256
        gunModel[152] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 257
        gunModel[153] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Box 240
        gunModel[154] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 241
        gunModel[155] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 242
        gunModel[156] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Box 243
        gunModel[157] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Box 244
        gunModel[158] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 245
        gunModel[159] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 246
        gunModel[160] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 247
        gunModel[161] = new ModelRendererTurbo(this, 113, 169, textureX, textureY); // Box 248
        gunModel[162] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 249
        gunModel[163] = new ModelRendererTurbo(this, 305, 169, textureX, textureY); // Box 250
        gunModel[164] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 251
        gunModel[165] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 252
        gunModel[166] = new ModelRendererTurbo(this, 9, 177, textureX, textureY); // Box 253
        gunModel[167] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 254
        gunModel[168] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Box 255
        gunModel[169] = new ModelRendererTurbo(this, 137, 177, textureX, textureY); // Box 256
        gunModel[170] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Box 257
        gunModel[171] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 258
        gunModel[172] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Box 259
        gunModel[173] = new ModelRendererTurbo(this, 345, 177, textureX, textureY); // Box 260
        gunModel[174] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 261
        gunModel[175] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 262
        gunModel[176] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Box 263
        gunModel[177] = new ModelRendererTurbo(this, 297, 185, textureX, textureY); // Box 264
        gunModel[178] = new ModelRendererTurbo(this, 321, 185, textureX, textureY); // Box 265
        gunModel[179] = new ModelRendererTurbo(this, 385, 185, textureX, textureY); // Box 266
        gunModel[180] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Box 267
        gunModel[181] = new ModelRendererTurbo(this, 449, 185, textureX, textureY); // Box 268
        gunModel[182] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Box 269
        gunModel[183] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 270
        gunModel[184] = new ModelRendererTurbo(this, 345, 153, textureX, textureY); // Box 271
        gunModel[185] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 272
        gunModel[186] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Box 273
        gunModel[187] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 274
        gunModel[188] = new ModelRendererTurbo(this, 17, 193, textureX, textureY); // Box 275
        gunModel[189] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 276
        gunModel[190] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 277
        gunModel[191] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 278
        gunModel[192] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 279
        gunModel[193] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // Box 280
        gunModel[194] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 281
        gunModel[195] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 282
        gunModel[196] = new ModelRendererTurbo(this, 457, 145, textureX, textureY); // Box 283
        gunModel[197] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 188
        gunModel[198] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 189
        gunModel[199] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 188
        gunModel[200] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 189
        gunModel[201] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 188
        gunModel[202] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 189
        gunModel[203] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 188
        gunModel[204] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 189
        gunModel[205] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 188
        gunModel[206] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 189
        gunModel[207] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 188
        gunModel[208] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 189
        gunModel[209] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 188
        gunModel[210] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 189
        gunModel[211] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 188
        gunModel[212] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 189
        gunModel[213] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 188
        gunModel[214] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 189
        gunModel[215] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 188
        gunModel[216] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 189
        gunModel[217] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 188
        gunModel[218] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 189
        gunModel[219] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 188
        gunModel[220] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 189
        gunModel[221] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 188
        gunModel[222] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 189
        gunModel[223] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 188
        gunModel[224] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 189
        gunModel[225] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 188
        gunModel[226] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 189
        gunModel[227] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 240
        gunModel[228] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 240
        gunModel[229] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 240
        gunModel[230] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 240
        gunModel[231] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 240
        gunModel[232] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 240

        gunModel[0].addBox(0F, 0F, 0F, 60, 4, 2, 0F); // Box 0
        gunModel[0].setRotationPoint(121F, -57F, -1F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 60, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 1
        gunModel[1].setRotationPoint(121F, -57F, 1F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 60, 4, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
        gunModel[2].setRotationPoint(121F, -57F, -2F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 26
        gunModel[3].setRotationPoint(-13.5F, -59.5F, 3F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
        gunModel[4].setRotationPoint(23.5F, -55F, -4F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
        gunModel[5].setRotationPoint(23.5F, -55F, 3F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 38, 12, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
        gunModel[6].setRotationPoint(-13.5F, -54F, -5F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 38, 1, 10, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
        gunModel[7].setRotationPoint(-13.5F, -55F, -5F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 43, 4, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 4F, -0.5F, 0F, 4F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
        gunModel[8].setRotationPoint(-13.5F, -58.5F, 3F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 29, 1, 8, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 44
        gunModel[9].setRotationPoint(-13.5F, -60.5F, -4F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 29, 1, 7, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 45
        gunModel[10].setRotationPoint(-13.5F, -61.5F, -3.5F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 29, 1, 5, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 46
        gunModel[11].setRotationPoint(-13.5F, -62.5F, -2.5F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 47
        gunModel[12].setRotationPoint(-13.5F, -59.5F, -4F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 43, 4, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 4F, -0.5F, 0F, 4F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 48
        gunModel[13].setRotationPoint(-13.5F, -58.5F, -4F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
        gunModel[14].setRotationPoint(-13.5F, -59.5F, -3F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 3, 12, 10, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
        gunModel[15].setRotationPoint(24.5F, -54F, -5F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 22, 11, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
        gunModel[16].setRotationPoint(27.5F, -53F, -5F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 3, 11, 10, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
        gunModel[17].setRotationPoint(49.5F, -53F, -5F);

        gunModel[18].addShapeBox(0F, 0F, 0F, 13, 14, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 53
        gunModel[18].setRotationPoint(52.5F, -56F, -5F);

        gunModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 54
        gunModel[19].setRotationPoint(24.5F, -55F, -5F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 22, 1, 10, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
        gunModel[20].setRotationPoint(27.5F, -54F, -5F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, 0F, 0F, -0.5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 56
        gunModel[21].setRotationPoint(49.5F, -54F, -5F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 63, 1, 10, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[22].setRotationPoint(52.5F, -57F, -5F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
        gunModel[23].setRotationPoint(52.5F, -58F, -4F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 61
        gunModel[24].setRotationPoint(52.5F, -59F, -4F);

        gunModel[25].addShapeBox(0F, 0F, 0F, 38, 11, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
        gunModel[25].setRotationPoint(65.5F, -56F, -5F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
        gunModel[26].setRotationPoint(79.5F, -59F, -4F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 39, 4, 8, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
        gunModel[27].setRotationPoint(79.5F, -62.5F, -4F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
        gunModel[28].setRotationPoint(90.5F, -59F, -4F);

        gunModel[29].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
        gunModel[29].setRotationPoint(101.5F, -59F, -4F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
        gunModel[30].setRotationPoint(113.5F, -59F, -4F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 39, 1, 8, 0F, 1F, 0F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 70
        gunModel[31].setRotationPoint(79.5F, -63.5F, -4F);

        gunModel[32].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 71
        gunModel[32].setRotationPoint(78.5F, -63.5F, -4F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
        gunModel[33].setRotationPoint(77.5F, -59.5F, -3F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
        gunModel[34].setRotationPoint(77.5F, -61.5F, -3F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 75
        gunModel[35].setRotationPoint(77.5F, -62.5F, -2F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 76
        gunModel[36].setRotationPoint(76.5F, -62.5F, -3F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -0.25F, 0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 77
        gunModel[37].setRotationPoint(75.5F, -64.5F, -3F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F, 0F, 0F, -0.5F, 0.25F, 1.5F, -0.5F, 0.25F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 78
        gunModel[38].setRotationPoint(71.5F, -63.5F, -3F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
        gunModel[39].setRotationPoint(68.5F, -63.5F, -3F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
        gunModel[40].setRotationPoint(62.5F, -62F, -3F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
        gunModel[41].setRotationPoint(55.5F, -60F, -2.5F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
        gunModel[42].setRotationPoint(55.5F, -61F, -2.5F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 83
        gunModel[43].setRotationPoint(55.5F, -62F, -2.5F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 84
        gunModel[44].setRotationPoint(76.5F, -62.5F, 2F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 85
        gunModel[45].setRotationPoint(75.5F, -64.5F, 2F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F, 0F, 0F, 0F, 0.25F, 1.5F, 0F, 0.25F, 1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 86
        gunModel[46].setRotationPoint(71.5F, -63.5F, 2F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 87
        gunModel[47].setRotationPoint(68.5F, -63.5F, 2F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 88
        gunModel[48].setRotationPoint(62.5F, -62F, 2F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
        gunModel[49].setRotationPoint(74.5F, -64F, -3F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
        gunModel[50].setRotationPoint(74.5F, -65F, -3F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 91
        gunModel[51].setRotationPoint(74.5F, -63F, -3F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0F, -0.25F, 0F, 4F, -0.25F, 0F, 4F, -0.25F, 0F, 0F, -0.25F, -1F, -0.5F, -0.25F, 1.5F, -4.5F, -0.25F, 1.5F, -4.5F, -0.25F, -1F, -0.5F, -0.25F); // Box 92
        gunModel[52].setRotationPoint(69.5F, -60F, -3F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 20, 2, 4, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 93
        gunModel[53].setRotationPoint(55.5F, -64.5F, -2F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
        gunModel[54].setRotationPoint(58.5F, -64.5F, -2.5F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 7, 5, 4, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 95
        gunModel[55].setRotationPoint(55.5F, -62.5F, -2F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
        gunModel[56].setRotationPoint(58.5F, -64.5F, -3.5F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
        gunModel[57].setRotationPoint(58.5F, -64.5F, 0.5F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 98
        gunModel[58].setRotationPoint(58.5F, -64.5F, 2.5F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 99
        gunModel[59].setRotationPoint(54.5F, -65.5F, -2F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 100
        gunModel[60].setRotationPoint(54.5F, -65.5F, 0F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 12, 11, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 101
        gunModel[61].setRotationPoint(103.5F, -56F, -5F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 4, 8, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F); // Box 102
        gunModel[62].setRotationPoint(115.5F, -56F, -5F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 103
        gunModel[63].setRotationPoint(115.5F, -57F, -5F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 41, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 104
        gunModel[64].setRotationPoint(-13.5F, -42F, -5F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 25, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F); // Box 105
        gunModel[65].setRotationPoint(27.5F, -42F, -5F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 13, 2, 10, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F); // Box 106
        gunModel[66].setRotationPoint(52.5F, -42F, -5F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 38, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F); // Box 107
        gunModel[67].setRotationPoint(65.5F, -45F, -5F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 12, 2, 10, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0.5F, -2F); // Box 108
        gunModel[68].setRotationPoint(103.5F, -45F, -5F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -1.5F, -3F, -1F, -1.5F, -3F, 0F, 0F, -2F); // Box 109
        gunModel[69].setRotationPoint(115.5F, -48F, -5F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 23, 3, 2, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 111
        gunModel[70].setRotationPoint(120F, -61F, -1F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 23, 3, 2, 0F, 0F, 1F, -1F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F); // Box 113
        gunModel[71].setRotationPoint(120F, -61F, 0F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 23, 3, 2, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F); // Box 114
        gunModel[72].setRotationPoint(120F, -61F, -2F);

        gunModel[73].addBox(0F, 0F, 0F, 3, 5, 2, 0F); // Box 115
        gunModel[73].setRotationPoint(143F, -57.5F, -1F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F); // Box 116
        gunModel[74].setRotationPoint(143F, -57.5F, 1F);

        gunModel[75].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
        gunModel[75].setRotationPoint(143F, -57.5F, -3F);

        gunModel[76].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F, 0F, -0.25F, -0.5F, -2F, -0.25F, -0.5F, -2F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
        gunModel[76].setRotationPoint(143F, -61.5F, -1F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, -1.5F, -0.25F, -2F, -1.5F, -0.25F, -2F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
        gunModel[77].setRotationPoint(143F, -61.5F, -2F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, -0.25F, 0.5F, -2F, -0.25F, 0.5F, -2F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 120
        gunModel[78].setRotationPoint(143F, -61.5F, 1F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
        gunModel[79].setRotationPoint(118F, -62F, -1F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
        gunModel[80].setRotationPoint(118F, -62F, -3F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F); // Box 123
        gunModel[81].setRotationPoint(118F, -62F, 1F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 124
        gunModel[82].setRotationPoint(119.5F, -56F, -3F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 1F, 0.5F, -1.5F); // Box 125
        gunModel[83].setRotationPoint(119.5F, -50F, -3F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 126
        gunModel[84].setRotationPoint(119.5F, -58F, -3F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
        gunModel[85].setRotationPoint(176F, -62.5F, -1.5F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
        gunModel[86].setRotationPoint(176F, -63.5F, -2F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 134
        gunModel[87].setRotationPoint(176F, -64.5F, -2.5F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 135
        gunModel[88].setRotationPoint(176F, -65.5F, -2.5F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 136
        gunModel[89].setRotationPoint(176F, -66.5F, -2.5F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 137
        gunModel[90].setRotationPoint(176F, -67.5F, -2F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 138
        gunModel[91].setRotationPoint(176F, -67.5F, -0.5F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 139
        gunModel[92].setRotationPoint(176F, -63.5F, 1F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 140
        gunModel[93].setRotationPoint(176F, -64.5F, 1.5F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
        gunModel[94].setRotationPoint(176F, -65.5F, 1.5F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
        gunModel[95].setRotationPoint(176F, -66.5F, 1.5F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 143
        gunModel[96].setRotationPoint(176F, -67.5F, 0F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 144
        gunModel[97].setRotationPoint(176F, -65F, -0.5F);

        gunModel[98].addShapeBox(0F, 0F, 0F, 31, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
        gunModel[98].setRotationPoint(81.5F, -63.5F, -2F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 31, 1, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
        gunModel[99].setRotationPoint(81.5F, -64.5F, -2F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
        gunModel[100].setRotationPoint(81.5F, -65.5F, -2.5F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 140
        gunModel[101].setRotationPoint(81.5F, -65.5F, 1.5F);

        gunModel[102].addShapeBox(0F, 0F, 0F, 68, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 171
        gunModel[102].setRotationPoint(-13.5F, -64.5F, -3F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 188
        gunModel[103].setRotationPoint(-7.5F, -65.5F, 1.5F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
        gunModel[104].setRotationPoint(-7.5F, -65.5F, -2.5F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 204
        gunModel[105].setRotationPoint(-13.5F, -65.5F, 1.5F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
        gunModel[106].setRotationPoint(-13.5F, -65.5F, -2.5F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 68, 1, 4, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 206
        gunModel[107].setRotationPoint(-13.5F, -63.5F, -2F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 4, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
        gunModel[108].setRotationPoint(-13F, -58.5F, -4.5F);

        gunModel[109].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
        gunModel[109].setRotationPoint(-13F, -60.5F, -4.5F);

        gunModel[110].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F, 0F, 0.5F, -2.25F, 0F, 0.5F, -2.25F, 0F, 0.5F, -2.25F, 0F, 0.5F, -2.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 209
        gunModel[110].setRotationPoint(-13F, -62.5F, -4F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
        gunModel[111].setRotationPoint(164F, -53.5F, -1.5F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 211
        gunModel[112].setRotationPoint(164F, -49.5F, 0.5F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 212
        gunModel[113].setRotationPoint(164F, -47.5F, 0.5F);

        gunModel[114].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 213
        gunModel[114].setRotationPoint(164F, -49.5F, -1.5F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F); // Box 214
        gunModel[115].setRotationPoint(164F, -47.5F, -1.5F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F); // Box 215
        gunModel[116].setRotationPoint(164F, -57.5F, 1F);

        gunModel[117].addBox(0F, 0F, 0F, 4, 5, 2, 0F); // Box 216
        gunModel[117].setRotationPoint(164F, -57.5F, -1F);

        gunModel[118].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
        gunModel[118].setRotationPoint(164F, -57.5F, -3F);

        gunModel[119].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F); // Box 218
        gunModel[119].setRotationPoint(176F, -57.5F, 1F);

        gunModel[120].addBox(0F, 0F, 0F, 3, 5, 2, 0F); // Box 219
        gunModel[120].setRotationPoint(176F, -57.5F, -1F);

        gunModel[121].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
        gunModel[121].setRotationPoint(176F, -57.5F, -3F);

        gunModel[122].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F); // Box 221
        gunModel[122].setRotationPoint(74.5F, -56F, 5F);

        gunModel[123].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F); // Box 222
        gunModel[123].setRotationPoint(74.5F, -54F, 5F);

        gunModel[124].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F); // Box 223
        gunModel[124].setRotationPoint(74.5F, -50F, 5F);

        gunModel[125].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F); // Box 224
        gunModel[125].setRotationPoint(74.5F, -52F, 5F);

        gunModel[126].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F); // Box 225
        gunModel[126].setRotationPoint(74.5F, -48F, 5F);

        gunModel[127].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
        gunModel[127].setRotationPoint(74.5F, -56F, -6F);

        gunModel[128].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
        gunModel[128].setRotationPoint(74.5F, -54F, -6F);

        gunModel[129].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
        gunModel[129].setRotationPoint(74.5F, -50F, -6F);

        gunModel[130].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
        gunModel[130].setRotationPoint(74.5F, -52F, -6F);

        gunModel[131].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
        gunModel[131].setRotationPoint(74.5F, -48F, -6F);

        gunModel[132].addShapeBox(0F, 0F, 0F, 38, 1, 8, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F); // Box 231
        gunModel[132].setRotationPoint(79.5F, -63F, -4F);

        gunModel[133].addShapeBox(0F, 0F, 0F, 38, 1, 8, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 232
        gunModel[133].setRotationPoint(79.5F, -62F, -4F);

        gunModel[134].addShapeBox(0F, 0F, 0F, 38, 1, 8, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 233
        gunModel[134].setRotationPoint(79.5F, -61F, -4F);

        gunModel[135].addShapeBox(0F, 0F, 0F, 31, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
        gunModel[135].setRotationPoint(69.5F, -41.5F, -3F);

        gunModel[136].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
        gunModel[136].setRotationPoint(97.5F, -40.5F, -2F);

        gunModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
        gunModel[137].setRotationPoint(93.5F, -40.5F, -2F);

        gunModel[138].addShapeBox(0F, 0F, 0F, 31, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
        gunModel[138].setRotationPoint(69.5F, -42.5F, -2F);

        gunModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 244
        gunModel[139].setRotationPoint(85.5F, -65.5F, 1.5F);

        gunModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
        gunModel[140].setRotationPoint(85.5F, -65.5F, -2.5F);

        gunModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 246
        gunModel[141].setRotationPoint(93.5F, -65.5F, 1.5F);

        gunModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
        gunModel[142].setRotationPoint(93.5F, -65.5F, -2.5F);

        gunModel[143].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 248
        gunModel[143].setRotationPoint(89.5F, -65.5F, 1.5F);

        gunModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
        gunModel[144].setRotationPoint(89.5F, -65.5F, -2.5F);

        gunModel[145].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 250
        gunModel[145].setRotationPoint(109.5F, -65.5F, 1.5F);

        gunModel[146].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
        gunModel[146].setRotationPoint(109.5F, -65.5F, -2.5F);

        gunModel[147].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 252
        gunModel[147].setRotationPoint(105.5F, -65.5F, 1.5F);

        gunModel[148].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
        gunModel[148].setRotationPoint(105.5F, -65.5F, -2.5F);

        gunModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 254
        gunModel[149].setRotationPoint(101.5F, -65.5F, 1.5F);

        gunModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
        gunModel[150].setRotationPoint(101.5F, -65.5F, -2.5F);

        gunModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 256
        gunModel[151].setRotationPoint(97.5F, -65.5F, 1.5F);

        gunModel[152].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
        gunModel[152].setRotationPoint(97.5F, -65.5F, -2.5F);

        gunModel[153].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 240
        gunModel[153].setRotationPoint(28.5F, -40F, -1.5F);

        gunModel[154].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 241
        gunModel[154].setRotationPoint(29.5F, -38F, -1.5F);

        gunModel[155].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 242
        gunModel[155].setRotationPoint(23.5F, -40F, -1.5F);

        gunModel[156].addShapeBox(0F, 0F, 0F, 24, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
        gunModel[156].setRotationPoint(-37.5F, -48F, -5F);

        gunModel[157].addShapeBox(0F, 0F, 0F, 8, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
        gunModel[157].setRotationPoint(-45.5F, -46.5F, -4.5F);

        gunModel[158].addShapeBox(0F, 0F, 0F, 8, 2, 9, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
        gunModel[158].setRotationPoint(-45.5F, -48.5F, -4.5F);

        gunModel[159].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
        gunModel[159].setRotationPoint(-45.5F, -50.5F, -3.5F);

        gunModel[160].addShapeBox(0F, 0F, 0F, 8, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 247
        gunModel[160].setRotationPoint(-45.5F, -44.5F, -4.5F);

        gunModel[161].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F); // Box 248
        gunModel[161].setRotationPoint(-45.5F, -42.5F, -3.5F);

        gunModel[162].addShapeBox(0F, 0F, 0F, 13, 6, 10, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 249
        gunModel[162].setRotationPoint(-26.5F, -54F, -5F);

        gunModel[163].addShapeBox(0F, 0F, 0F, 12, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 250
        gunModel[163].setRotationPoint(-25.5F, -45F, -5F);

        gunModel[164].addShapeBox(0F, 0F, 0F, 13, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 251
        gunModel[164].setRotationPoint(-26.5F, -42F, -5F);

        gunModel[165].addShapeBox(0F, 0F, 0F, 13, 1, 10, 0F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 252
        gunModel[165].setRotationPoint(-26.5F, -55F, -5F);

        gunModel[166].addShapeBox(0F, 0F, 0F, 12, 2, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
        gunModel[166].setRotationPoint(-37.5F, -50F, -5F);

        gunModel[167].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
        gunModel[167].setRotationPoint(-37.5F, -51F, -4F);

        gunModel[168].addShapeBox(0F, 0F, 0F, 12, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
        gunModel[168].setRotationPoint(-37.5F, -45F, -5F);

        gunModel[169].addShapeBox(0F, 0F, 0F, 12, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 256
        gunModel[169].setRotationPoint(-37.5F, -43F, -4F);

        gunModel[170].addShapeBox(0F, 0F, 0F, 12, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 257
        gunModel[170].setRotationPoint(-37.5F, -40F, -3F);

        gunModel[171].addShapeBox(0F, 0F, 0F, 15, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F); // Box 258
        gunModel[171].setRotationPoint(-26.5F, -39F, -3F);

        gunModel[172].addShapeBox(0F, 0F, 0F, 13, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
        gunModel[172].setRotationPoint(-22.5F, -36F, -3F);

        gunModel[173].addShapeBox(0F, 0F, 0F, 12, 20, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 7F, 0F, 0F); // Box 260
        gunModel[173].setRotationPoint(-21.5F, -33F, -3F);

        gunModel[174].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, 2F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 261
        gunModel[174].setRotationPoint(-9.5F, -39F, -3F);

        gunModel[175].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 262
        gunModel[175].setRotationPoint(-9.5F, -36F, -3F);

        gunModel[176].addShapeBox(0F, 0F, 0F, 2, 20, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 6F, 0F, 0F, -5F, 0F, -1F, -5F, 0F, -1F, 6F, 0F, 0F); // Box 263
        gunModel[176].setRotationPoint(-9.5F, -33F, -3F);

        gunModel[177].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, 4F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 264
        gunModel[177].setRotationPoint(-24.5F, -39F, -3F);

        gunModel[178].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F); // Box 265
        gunModel[178].setRotationPoint(-24.5F, -36F, -3F);

        gunModel[179].addShapeBox(0F, 0F, 0F, 2, 20, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 8F, -1F, -1F, -7F, 0F, 0F, -7F, 0F, 0F, 8F, -1F, -1F); // Box 266
        gunModel[179].setRotationPoint(-23.5F, -33F, -3F);

        gunModel[180].addShapeBox(0F, 0F, 0F, 13, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 1F, 0F, 0F); // Box 267
        gunModel[180].setRotationPoint(-28.5F, -13F, -3F);

        gunModel[181].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, -1F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, -1F, 0.5F, -1.5F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1.5F, -1F); // Box 268
        gunModel[181].setRotationPoint(-32.5F, -13F, -3F);

        gunModel[182].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F, -1F, 0F, 0F, 2F, -2.5F, -1F, 2F, -2.5F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, -1F, 0.5F, 1F, -1F, 0F, 0F, 0F); // Box 269
        gunModel[182].setRotationPoint(-16.5F, -13F, -3F);

        gunModel[183].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0.5F, -1F, 1.5F, 0.5F, -2F, 1.5F, 0.5F, -2F, -3F, 0.5F, -1F); // Box 270
        gunModel[183].setRotationPoint(-15.5F, -13F, -3F);

        gunModel[184].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 1.5F, -0.5F, 0F, -2F, -1F, -1F, -2F, -1F, -1F, 1.5F, -0.5F, 0F); // Box 271
        gunModel[184].setRotationPoint(-12.5F, -10.5F, -2F);

        gunModel[185].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 272
        gunModel[185].setRotationPoint(-8.5F, -39F, -2F);

        gunModel[186].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
        gunModel[186].setRotationPoint(-7F, -38F, -2F);

        gunModel[187].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.75F, 0F, 0F); // Box 274
        gunModel[187].setRotationPoint(-7F, -34F, -2F);

        gunModel[188].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 275
        gunModel[188].setRotationPoint(-4F, -31F, -2F);

        gunModel[189].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -2F, 0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, -2F, 0.5F, 0F); // Box 276
        gunModel[189].setRotationPoint(-6.5F, -32.5F, -2F);

        gunModel[190].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 1.5F, -0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 1.5F, -0.5F, 0F); // Box 277
        gunModel[190].setRotationPoint(8.5F, -32.5F, -2F);

        gunModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, -0.5F, 0F); // Box 278
        gunModel[191].setRotationPoint(9F, -34F, -2F);

        gunModel[192].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
        gunModel[192].setRotationPoint(9F, -37F, -2F);

        gunModel[193].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 280
        gunModel[193].setRotationPoint(7F, -39F, -2F);

        gunModel[194].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Box 281
        gunModel[194].setRotationPoint(-1.5F, -39F, -1F);

        gunModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
        gunModel[195].setRotationPoint(-2.5F, -36F, -1F);

        gunModel[196].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1.5F, 0F, 0F); // Box 283
        gunModel[196].setRotationPoint(-2.5F, -34F, -1F);

        gunModel[197].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 188
        gunModel[197].setRotationPoint(-3.5F, -65.5F, 1.5F);

        gunModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
        gunModel[198].setRotationPoint(-3.5F, -65.5F, -2.5F);

        gunModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 188
        gunModel[199].setRotationPoint(0.5F, -65.5F, 1.5F);

        gunModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
        gunModel[200].setRotationPoint(0.5F, -65.5F, -2.5F);

        gunModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 188
        gunModel[201].setRotationPoint(4.5F, -65.5F, 1.5F);

        gunModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
        gunModel[202].setRotationPoint(4.5F, -65.5F, -2.5F);

        gunModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 188
        gunModel[203].setRotationPoint(8.5F, -65.5F, 1.5F);

        gunModel[204].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
        gunModel[204].setRotationPoint(8.5F, -65.5F, -2.5F);

        gunModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 188
        gunModel[205].setRotationPoint(12.5F, -65.5F, 1.5F);

        gunModel[206].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
        gunModel[206].setRotationPoint(12.5F, -65.5F, -2.5F);

        gunModel[207].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 188
        gunModel[207].setRotationPoint(16.5F, -65.5F, 1.5F);

        gunModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
        gunModel[208].setRotationPoint(16.5F, -65.5F, -2.5F);

        gunModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 188
        gunModel[209].setRotationPoint(20.5F, -65.5F, 1.5F);

        gunModel[210].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
        gunModel[210].setRotationPoint(20.5F, -65.5F, -2.5F);

        gunModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 188
        gunModel[211].setRotationPoint(24.5F, -65.5F, 1.5F);

        gunModel[212].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
        gunModel[212].setRotationPoint(24.5F, -65.5F, -2.5F);

        gunModel[213].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 188
        gunModel[213].setRotationPoint(28.5F, -65.5F, 1.5F);

        gunModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
        gunModel[214].setRotationPoint(28.5F, -65.5F, -2.5F);

        gunModel[215].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 188
        gunModel[215].setRotationPoint(32.5F, -65.5F, 1.5F);

        gunModel[216].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
        gunModel[216].setRotationPoint(32.5F, -65.5F, -2.5F);

        gunModel[217].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 188
        gunModel[217].setRotationPoint(36.5F, -65.5F, 1.5F);

        gunModel[218].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
        gunModel[218].setRotationPoint(36.5F, -65.5F, -2.5F);

        gunModel[219].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 188
        gunModel[219].setRotationPoint(40.5F, -65.5F, 1.5F);

        gunModel[220].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
        gunModel[220].setRotationPoint(40.5F, -65.5F, -2.5F);

        gunModel[221].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 188
        gunModel[221].setRotationPoint(44.5F, -65.5F, 1.5F);

        gunModel[222].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
        gunModel[222].setRotationPoint(44.5F, -65.5F, -2.5F);

        gunModel[223].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 188
        gunModel[223].setRotationPoint(48.5F, -65.5F, 1.5F);

        gunModel[224].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
        gunModel[224].setRotationPoint(48.5F, -65.5F, -2.5F);

        gunModel[225].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 188
        gunModel[225].setRotationPoint(52.5F, -65.5F, 1.5F);

        gunModel[226].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
        gunModel[226].setRotationPoint(52.5F, -65.5F, -2.5F);

        gunModel[227].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
        gunModel[227].setRotationPoint(89.5F, -40.5F, -2F);

        gunModel[228].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
        gunModel[228].setRotationPoint(85.5F, -40.5F, -2F);

        gunModel[229].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
        gunModel[229].setRotationPoint(81.5F, -40.5F, -2F);

        gunModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
        gunModel[230].setRotationPoint(77.5F, -40.5F, -2F);

        gunModel[231].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
        gunModel[231].setRotationPoint(73.5F, -40.5F, -2F);

        gunModel[232].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
        gunModel[232].setRotationPoint(69.5F, -40.5F, -2F);


        defaultBarrelModel = new ModelRendererTurbo[21];
        defaultBarrelModel[0] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 3
        defaultBarrelModel[1] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 4
        defaultBarrelModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 5
        defaultBarrelModel[3] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 6
        defaultBarrelModel[4] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 7
        defaultBarrelModel[5] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 8
        defaultBarrelModel[6] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 9
        defaultBarrelModel[7] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 10
        defaultBarrelModel[8] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 11
        defaultBarrelModel[9] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 12
        defaultBarrelModel[10] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 13
        defaultBarrelModel[11] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 14
        defaultBarrelModel[12] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 15
        defaultBarrelModel[13] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 16
        defaultBarrelModel[14] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 17
        defaultBarrelModel[15] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 18
        defaultBarrelModel[16] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 19
        defaultBarrelModel[17] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 20
        defaultBarrelModel[18] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 21
        defaultBarrelModel[19] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 22
        defaultBarrelModel[20] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 23

        defaultBarrelModel[0].addBox(0F, 0F, 0F, 18, 5, 2, 0F); // Box 3
        defaultBarrelModel[0].setRotationPoint(181F, -57.5F, -1F);

        defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 18, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F); // Box 4
        defaultBarrelModel[1].setRotationPoint(181F, -57.5F, 1F);

        defaultBarrelModel[2].addShapeBox(0F, 0F, 0F, 18, 5, 2, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
        defaultBarrelModel[2].setRotationPoint(181F, -57.5F, -3F);

        defaultBarrelModel[3].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 6
        defaultBarrelModel[3].setRotationPoint(199F, -57.5F, -1F);

        defaultBarrelModel[4].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Box 7
        defaultBarrelModel[4].setRotationPoint(199F, -57.5F, 1F);

        defaultBarrelModel[5].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 8
        defaultBarrelModel[5].setRotationPoint(199F, -57.5F, -3F);

        defaultBarrelModel[6].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 9
        defaultBarrelModel[6].setRotationPoint(197F, -57.5F, -3F);

        defaultBarrelModel[7].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 10
        defaultBarrelModel[7].setRotationPoint(197F, -57.5F, -1F);

        defaultBarrelModel[8].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Box 11
        defaultBarrelModel[8].setRotationPoint(197F, -57.5F, 1F);

        defaultBarrelModel[9].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 12
        defaultBarrelModel[9].setRotationPoint(193F, -57.5F, -3F);

        defaultBarrelModel[10].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 13
        defaultBarrelModel[10].setRotationPoint(193F, -57.5F, -1F);

        defaultBarrelModel[11].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Box 14
        defaultBarrelModel[11].setRotationPoint(193F, -57.5F, 1F);

        defaultBarrelModel[12].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Box 15
        defaultBarrelModel[12].setRotationPoint(195F, -57.5F, 1F);

        defaultBarrelModel[13].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 16
        defaultBarrelModel[13].setRotationPoint(195F, -57.5F, -1F);

        defaultBarrelModel[14].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 17
        defaultBarrelModel[14].setRotationPoint(195F, -57.5F, -3F);

        defaultBarrelModel[15].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Box 18
        defaultBarrelModel[15].setRotationPoint(191F, -57.5F, 1F);

        defaultBarrelModel[16].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 19
        defaultBarrelModel[16].setRotationPoint(191F, -57.5F, -1F);

        defaultBarrelModel[17].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 20
        defaultBarrelModel[17].setRotationPoint(191F, -57.5F, -3F);

        defaultBarrelModel[18].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Box 21
        defaultBarrelModel[18].setRotationPoint(189F, -57.5F, 1F);

        defaultBarrelModel[19].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 22
        defaultBarrelModel[19].setRotationPoint(189F, -57.5F, -1F);

        defaultBarrelModel[20].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 23
        defaultBarrelModel[20].setRotationPoint(189F, -57.5F, -3F);


        defaultStockModel = new ModelRendererTurbo[24];
        defaultStockModel[0] = new ModelRendererTurbo(this, 17, 201, textureX, textureY); // Box 284
        defaultStockModel[1] = new ModelRendererTurbo(this, 193, 201, textureX, textureY); // Box 285
        defaultStockModel[2] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 286
        defaultStockModel[3] = new ModelRendererTurbo(this, 121, 217, textureX, textureY); // Box 287
        defaultStockModel[4] = new ModelRendererTurbo(this, 145, 193, textureX, textureY); // Box 288
        defaultStockModel[5] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 289
        defaultStockModel[6] = new ModelRendererTurbo(this, 321, 201, textureX, textureY); // Box 290
        defaultStockModel[7] = new ModelRendererTurbo(this, 433, 201, textureX, textureY); // Box 291
        defaultStockModel[8] = new ModelRendererTurbo(this, 345, 209, textureX, textureY); // Box 292
        defaultStockModel[9] = new ModelRendererTurbo(this, 249, 217, textureX, textureY); // Box 293
        defaultStockModel[10] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 294
        defaultStockModel[11] = new ModelRendererTurbo(this, 273, 217, textureX, textureY); // Box 295
        defaultStockModel[12] = new ModelRendererTurbo(this, 209, 193, textureX, textureY); // Box 296
        defaultStockModel[13] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Box 297
        defaultStockModel[14] = new ModelRendererTurbo(this, 385, 217, textureX, textureY); // Box 298
        defaultStockModel[15] = new ModelRendererTurbo(this, 81, 233, textureX, textureY); // Box 299
        defaultStockModel[16] = new ModelRendererTurbo(this, 417, 217, textureX, textureY); // Box 300
        defaultStockModel[17] = new ModelRendererTurbo(this, 129, 233, textureX, textureY); // Box 301
        defaultStockModel[18] = new ModelRendererTurbo(this, 17, 153, textureX, textureY); // Box 302
        defaultStockModel[19] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 303
        defaultStockModel[20] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Box 304
        defaultStockModel[21] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 305
        defaultStockModel[22] = new ModelRendererTurbo(this, 161, 233, textureX, textureY); // Box 306
        defaultStockModel[23] = new ModelRendererTurbo(this, 201, 233, textureX, textureY); // Box 307

        defaultStockModel[0].addShapeBox(0F, 0F, 0F, 51, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
        defaultStockModel[0].setRotationPoint(-96.5F, -46.5F, -5F);

        defaultStockModel[1].addShapeBox(0F, 0F, 0F, 51, 2, 10, 0F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
        defaultStockModel[1].setRotationPoint(-96.5F, -48.5F, -5F);

        defaultStockModel[2].addShapeBox(0F, 0F, 0F, 51, 2, 8, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 286
        defaultStockModel[2].setRotationPoint(-96.5F, -50.5F, -4F);

        defaultStockModel[3].addShapeBox(0F, 0F, 0F, 51, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F); // Box 287
        defaultStockModel[3].setRotationPoint(-96.5F, -44.5F, -5F);

        defaultStockModel[4].addShapeBox(0F, 0F, 0F, 6, 7, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 288
        defaultStockModel[4].setRotationPoint(-102.5F, -47.5F, -6F);

        defaultStockModel[5].addShapeBox(0F, 0F, 0F, 6, 2, 12, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
        defaultStockModel[5].setRotationPoint(-102.5F, -49.5F, -6F);

        defaultStockModel[6].addShapeBox(0F, 0F, 0F, 6, 2, 10, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
        defaultStockModel[6].setRotationPoint(-102.5F, -51.5F, -5F);

        defaultStockModel[7].addShapeBox(0F, 0F, 0F, 6, 21, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, -1F); // Box 291
        defaultStockModel[7].setRotationPoint(-102.5F, -40.5F, -7F);

        defaultStockModel[8].addShapeBox(0F, 0F, 0F, 6, 6, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F); // Box 292
        defaultStockModel[8].setRotationPoint(-100.5F, -19.5F, -6F);

        defaultStockModel[9].addShapeBox(0F, 0F, 0F, 6, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -3F, -1F, 0F, -3F); // Box 293
        defaultStockModel[9].setRotationPoint(-99.5F, -13.5F, -5F);

        defaultStockModel[10].addShapeBox(0F, 0F, 0F, 40, 5, 4, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
        defaultStockModel[10].setRotationPoint(-96.5F, -41F, -2F);

        defaultStockModel[11].addShapeBox(0F, 0F, 0F, 26, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 3F, 0F); // Box 295
        defaultStockModel[11].setRotationPoint(-82.5F, -36F, -2F);

        defaultStockModel[12].addShapeBox(0F, 0F, 0F, 23, 1, 6, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F); // Box 296
        defaultStockModel[12].setRotationPoint(-82.5F, -30F, -3F);

        defaultStockModel[13].addShapeBox(0F, 0F, 0F, 2, 26, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 297
        defaultStockModel[13].setRotationPoint(-96.5F, -44.5F, -5F);

        defaultStockModel[14].addShapeBox(0F, 0F, 0F, 2, 6, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, -2F); // Box 298
        defaultStockModel[14].setRotationPoint(-94.5F, -18.5F, -5F);

        defaultStockModel[15].addShapeBox(0F, 0F, 0F, 10, 1, 10, 0F, 0F, 0F, 0F, 0F, 10.5F, -2F, 0F, 10.5F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, -10.5F, -2F, 1F, -10.5F, -2F, 0F, 0F, -0.5F); // Box 299
        defaultStockModel[15].setRotationPoint(-92.5F, -18.5F, -5F);

        defaultStockModel[16].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 9.5F, 0F, 0F, -10.25F, 2F, 0F, -10.25F, 2F, 0F, 9.5F, 0F, 0F); // Box 300
        defaultStockModel[16].setRotationPoint(-82.5F, -28.5F, -3F);

        defaultStockModel[17].addShapeBox(0F, 0F, 0F, 11, 19, 4, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, -1.5F, 0F, 0F); // Box 301
        defaultStockModel[17].setRotationPoint(-93.5F, -34F, -2F);

        defaultStockModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
        defaultStockModel[18].setRotationPoint(-94.5F, -35F, -2F);

        defaultStockModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 303
        defaultStockModel[19].setRotationPoint(-94.5F, -36F, -2F);

        defaultStockModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 304
        defaultStockModel[20].setRotationPoint(-84.5F, -36F, -2F);

        defaultStockModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
        defaultStockModel[21].setRotationPoint(-84.5F, -35F, -2F);

        defaultStockModel[22].addShapeBox(0F, 0F, 0F, 11, 5, 8, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F); // Box 306
        defaultStockModel[22].setRotationPoint(-70.5F, -32F, -4F);

        defaultStockModel[23].addShapeBox(0F, 0F, 0F, 9, 5, 8, 0F, 0F, -7F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -7F, 0F, -1F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 8F, 0F); // Box 307
        defaultStockModel[23].setRotationPoint(-77.5F, -32F, -4F);


        ammoModel = new ModelRendererTurbo[12];
        ammoModel[0] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 258
        ammoModel[1] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Box 259
        ammoModel[2] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 260
        ammoModel[3] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 261
        ammoModel[4] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Box 262
        ammoModel[5] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 263
        ammoModel[6] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 264
        ammoModel[7] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 265
        ammoModel[8] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Box 236
        ammoModel[9] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Box 237
        ammoModel[10] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 238
        ammoModel[11] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 239

        ammoModel[0].addShapeBox(0F, 0F, 0F, 14, 17, 6, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, -3F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 6F, 0F); // Box 258
        ammoModel[0].setRotationPoint(38.5F, -51F, -3F);

        ammoModel[1].addShapeBox(0F, 0F, 0F, 11, 14, 6, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -7F, 3F, 0F, 6F, -4F, 0F, 6F, -4F, 0F, -7F, 3F, 0F); // Box 259
        ammoModel[1].setRotationPoint(41.5F, -34F, -3F);

        ammoModel[2].addShapeBox(0F, 0F, 0F, 10, 15, 6, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -7F, 0F, 0F, 6F, -8F, 0F, 6F, -8F, 0F, -7F, 0F, 0F); // Box 260
        ammoModel[2].setRotationPoint(48.5F, -24F, -3F);

        ammoModel[3].addShapeBox(0F, 0F, 0F, 2, 23, 6, 0F, 10F, 0F, -1F, -10F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 261
        ammoModel[3].setRotationPoint(39.5F, -51F, -3F);

        ammoModel[4].addShapeBox(0F, 0F, 0F, 2, 12, 6, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -7.5F, 0F, -1F, 7F, -1F, 0F, 7F, -1F, 0F, -7.5F, 0F, -1F); // Box 262
        ammoModel[4].setRotationPoint(39.5F, -28F, -3F);

        ammoModel[5].addShapeBox(0F, 0F, 0F, 2, 10, 6, 0F, -0.5F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -1F, -7.5F, -0.5F, -1F, 7F, -2F, 0F, 7F, -2F, 0F, -7.5F, -0.5F, -1F); // Box 263
        ammoModel[5].setRotationPoint(46.5F, -17F, -3F);

        ammoModel[6].addShapeBox(0F, 0F, 0F, 3, 17, 6, 0F, 7F, 0F, 0F, -7F, 0F, -1F, -7F, 0F, -1F, 7F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, -1F, -0.5F, -1.5F, -1F, 0F, 0F, 0F); // Box 264
        ammoModel[6].setRotationPoint(52.5F, -51F, -3F);

        ammoModel[7].addShapeBox(0F, 0F, 0F, 3, 10, 6, 0F, 0F, 0F, 0F, -0.5F, 1.5F, -1F, -0.5F, 1.5F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, -2F, -1F, 6F, -2F, -1F, -6F, 0F, 0F); // Box 265
        ammoModel[7].setRotationPoint(52.5F, -34F, -3F);

        ammoModel[8].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 5.5F, -2.5F, -1F, 5.5F, -2.5F, -1F, -6F, 0F, 0F); // Box 236
        ammoModel[8].setRotationPoint(58.5F, -24F, -3F);

        ammoModel[9].addShapeBox(0F, 0F, 0F, 3, 15, 4, 0F, 7F, 0F, 0F, -7F, 0F, -1F, -7F, 0F, -1F, 7F, 0F, 0F, 0.5F, 0.5F, 0F, -1F, -1F, -1F, -1F, -1F, -1F, 0.5F, 0.5F, 0F); // Box 237
        ammoModel[9].setRotationPoint(55.5F, -51F, -2F);

        ammoModel[10].addShapeBox(0F, 0F, 0F, 3, 10, 4, 0F, 0F, 0F, 0F, -0.5F, 1.5F, -1F, -0.5F, 1.5F, -1F, 0F, 0F, 0F, -6.5F, -0.5F, 0F, 5.5F, -2F, -1F, 5.5F, -2F, -1F, -6.5F, -0.5F, 0F); // Box 238
        ammoModel[10].setRotationPoint(55F, -35.5F, -2F);

        ammoModel[11].addShapeBox(0F, 0F, 0F, 3, 7, 4, 0F, 0F, 0F, 0F, -1F, 1.5F, -1F, -1F, 1.5F, -1F, 0F, 0F, 0F, -5.5F, -0.5F, 0F, 4F, -2.5F, -1F, 4F, -2.5F, -1F, -5.5F, -0.5F, 0F); // Box 239
        ammoModel[11].setRotationPoint(61.5F, -26F, -2F);


        slideModel = new ModelRendererTurbo[18];
        slideModel[0] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 29
        slideModel[1] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 30
        slideModel[2] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 31
        slideModel[3] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 32
        slideModel[4] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 33
        slideModel[5] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 37
        slideModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 38
        slideModel[7] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 51
        slideModel[8] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 52
        slideModel[9] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 53
        slideModel[10] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 54
        slideModel[11] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 55
        slideModel[12] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 56
        slideModel[13] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 57
        slideModel[14] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 58
        slideModel[15] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 59
        slideModel[16] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 62
        slideModel[17] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 63

        slideModel[0].addShapeBox(0F, 0F, 0F, 34, 2, 7, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
        slideModel[0].setRotationPoint(15.5F, -60.5F, -3.55F);

        slideModel[1].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F, 0F, 0F, -0.5F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
        slideModel[1].setRotationPoint(49.5F, -60.5F, -3.55F);

        slideModel[2].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
        slideModel[2].setRotationPoint(52.5F, -61.5F, -3.55F);

        slideModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F); // Box 32
        slideModel[3].setRotationPoint(49.5F, -61.5F, -3.55F);

        slideModel[4].addShapeBox(0F, 0F, 0F, 34, 1, 7, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 33
        slideModel[4].setRotationPoint(15.5F, -61.5F, -3.55F);

        slideModel[5].addShapeBox(0F, 0F, 0F, 37, 2, 7, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
        slideModel[5].setRotationPoint(15.5F, -58.5F, -3.55F);

        slideModel[6].addShapeBox(0F, 0F, 0F, 37, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
        slideModel[6].setRotationPoint(15.5F, -56.5F, -3.55F);

        slideModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 51
        slideModel[7].setRotationPoint(49.5F, -60.5F, -7.55F);

        slideModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 52
        slideModel[8].setRotationPoint(49.5F, -61.5F, -7.55F);

        slideModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 53
        slideModel[9].setRotationPoint(49.5F, -59.5F, -7.55F);

        slideModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
        slideModel[10].setRotationPoint(49.5F, -60.5F, -8.55F);

        slideModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
        slideModel[11].setRotationPoint(49.5F, -61.5F, -8.55F);

        slideModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 56
        slideModel[12].setRotationPoint(49.5F, -59.5F, -8.55F);

        slideModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F); // Box 57
        slideModel[13].setRotationPoint(49.5F, -59.5F, -9.55F);

        slideModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 58
        slideModel[14].setRotationPoint(49.5F, -60.5F, -9.55F);

        slideModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 59
        slideModel[15].setRotationPoint(49.5F, -61.5F, -9.55F);

        slideModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
        slideModel[16].setRotationPoint(54.5F, -61.5F, -3.55F);

        slideModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
        slideModel[17].setRotationPoint(54.5F, -61.5F, 2.45F);


		/*revolverBarrelModel = new ModelRendererTurbo[3];
		revolverBarrelModel[0] = new ModelRendererTurbo(this, 333, 243, textureX, textureY); // Box 321
		revolverBarrelModel[1] = new ModelRendererTurbo(this, 152, 275, textureX, textureY); // Box 322
		revolverBarrelModel[2] = new ModelRendererTurbo(this, 137, 275, textureX, textureY); // Box 323

		revolverBarrelModel[0].addShapeBox(0F, -13F, -13F, 0, 26, 26, 0F, 0F, 5F, 5F, 0F, 5F, 5F, 0F, 5F, 5F, 0F, 5F, 5F, 0F, 5F, 5F, 0F, 5F, 5F, 0F, 5F, 5F, 0F, 5F, 5F); // Box 321
		revolverBarrelModel[0].setRotationPoint(200F, -55F, 0F);

		revolverBarrelModel[1].addShapeBox(0F, -7F, 0F, 24, 14, 0, 0F, 0F, 5F, 0F, 7F, 5F, 0F, 7F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 7F, 5F, 0F, 7F, 5F, 0F, 0F, 5F, 0F); // Box 322
		revolverBarrelModel[1].setRotationPoint(200F, -55F, 0F);

		revolverBarrelModel[2].addShapeBox(0F, 0F, -7F, 24, 0, 14, 0F, 0F, 0F, 5F, 7F, 0F, 5F, 7F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 7F, 0F, 5F, 7F, 0F, 5F, 0F, 0F, 5F); // Box 323
		revolverBarrelModel[2].setRotationPoint(200F, -55F, 0F);*/

        hasFlash = true;
        hasArms = true;
        leftArmPos = new Vector3f(0.05F, -0.4F, -0.1F);
        leftArmRot = new Vector3f(80.0F, 50.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.25F, -0.45F, -0.05F);
        leftArmReloadRot = new Vector3f(90.0F, 45.0F, 0.0F);
        rightArmPos = new Vector3f(0.3F, -0.6F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -80.0F);
        rightArmReloadPos = new Vector3f(0.3F, -0.6F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -80.0F);
        rightHandAmmo = false;
        leftHandAmmo = true;
        gunSlideDistance = 1.5F;
        animationType = EnumAnimationType.CUSTOM;
        rotateGunHorizontal = 15F;
        tiltGun = 30F;
        translateGun = new Vector3f(0.0F, 0.0F, -0.1875F);
        translateClip = new Vector3f(0.0F, -0.63F, 0.0F);
        hasFlash = true;
        hasArms = true;
        rightHandAmmo = false;
        leftHandAmmo = true;
        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
        barrelAttachPoint = new Vector3f(181F / 16F, 55F / 16F, 0F / 16F);
        stockAttachPoint = new Vector3f(-45F / 16F, 45.5F / 16F, 0F / 16F);
        scopeAttachPoint = new Vector3f(20F / 16F, 64.5F / 16F, 0F / 16F);
        gripAttachPoint = new Vector3f(86 / 16F, 40.5F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(93 / 16F, 51.5F / 16F, -5F / 16F);
        crouchZoom = -0.05F;
        translateAll(0F, 0F, 0F);
        ShakeDistance = 0.5F;
        gunOffset = -0.9F;

        //修正模型位移
        Vector3f vec3 = new Vector3f(5F, 7F, 0F);
        translateAll(vec3.x, -vec3.y, vec3.z);
        Vector3f attVec = new Vector3f(vec3.x / 16F, vec3.y / 16F, vec3.z / 16F);
        barrelAttachPoint = Vector3f.add(barrelAttachPoint, attVec, null);
        gadgetAttachPoint = Vector3f.add(gadgetAttachPoint, attVec, null);
        scopeAttachPoint = Vector3f.add(scopeAttachPoint, attVec, null);
        gripAttachPoint = Vector3f.add(gripAttachPoint, attVec, null);
        stockAttachPoint = Vector3f.add(stockAttachPoint, attVec, null);
        zoomOffsetY = -0.05F;
        zoomOffset = 0.2F;

        flipAll();
        gunOffsetX = -2F;
    }
}