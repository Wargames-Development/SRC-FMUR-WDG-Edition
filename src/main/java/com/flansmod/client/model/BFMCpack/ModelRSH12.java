//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: RSH12
// Model Creator: 
// Created on: 11.08.2023 - 11:01:07
// Last changed on: 11.08.2023 - 11:01:07

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelRSH12 extends ModelGun //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public ModelRSH12() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[224];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        gunModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 1
        gunModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 2
        gunModel[3] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 3
        gunModel[4] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 4
        gunModel[5] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 5
        gunModel[6] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 6
        gunModel[7] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 7
        gunModel[8] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 8
        gunModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 9
        gunModel[10] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 10
        gunModel[11] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 11
        gunModel[12] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 12
        gunModel[13] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 13
        gunModel[14] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 18
        gunModel[15] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 19
        gunModel[16] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 20
        gunModel[17] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 21
        gunModel[18] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 22
        gunModel[19] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 23
        gunModel[20] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 24
        gunModel[21] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 25
        gunModel[22] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 26
        gunModel[23] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 27
        gunModel[24] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 28
        gunModel[25] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 29
        gunModel[26] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 30
        gunModel[27] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 31
        gunModel[28] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 32
        gunModel[29] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 33
        gunModel[30] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 34
        gunModel[31] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 35
        gunModel[32] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 36
        gunModel[33] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 37
        gunModel[34] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 38
        gunModel[35] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 39
        gunModel[36] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 40
        gunModel[37] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 41
        gunModel[38] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 42
        gunModel[39] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 43
        gunModel[40] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 44
        gunModel[41] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 45
        gunModel[42] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 46
        gunModel[43] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 47
        gunModel[44] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 48
        gunModel[45] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 49
        gunModel[46] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 50
        gunModel[47] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 51
        gunModel[48] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 52
        gunModel[49] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 53
        gunModel[50] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 54
        gunModel[51] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 55
        gunModel[52] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 56
        gunModel[53] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 57
        gunModel[54] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 58
        gunModel[55] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 59
        gunModel[56] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 60
        gunModel[57] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 61
        gunModel[58] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 62
        gunModel[59] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 63
        gunModel[60] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 64
        gunModel[61] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 65
        gunModel[62] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 66
        gunModel[63] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 67
        gunModel[64] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 68
        gunModel[65] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 69
        gunModel[66] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 70
        gunModel[67] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 71
        gunModel[68] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 72
        gunModel[69] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 73
        gunModel[70] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 74
        gunModel[71] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 75
        gunModel[72] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 76
        gunModel[73] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 73
        gunModel[74] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 74
        gunModel[75] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 75
        gunModel[76] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 76
        gunModel[77] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 77
        gunModel[78] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 78
        gunModel[79] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 79
        gunModel[80] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 80
        gunModel[81] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 81
        gunModel[82] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 82
        gunModel[83] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 83
        gunModel[84] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 84
        gunModel[85] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 85
        gunModel[86] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 86
        gunModel[87] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 87
        gunModel[88] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 88
        gunModel[89] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 89
        gunModel[90] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 90
        gunModel[91] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 91
        gunModel[92] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 92
        gunModel[93] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 93
        gunModel[94] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 94
        gunModel[95] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 95
        gunModel[96] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 96
        gunModel[97] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 97
        gunModel[98] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 98
        gunModel[99] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 99
        gunModel[100] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 100
        gunModel[101] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 101
        gunModel[102] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 102
        gunModel[103] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 103
        gunModel[104] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 104
        gunModel[105] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 105
        gunModel[106] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 106
        gunModel[107] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 107
        gunModel[108] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 108
        gunModel[109] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 109
        gunModel[110] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 110
        gunModel[111] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 111
        gunModel[112] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 112
        gunModel[113] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 113
        gunModel[114] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 114
        gunModel[115] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 115
        gunModel[116] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 116
        gunModel[117] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 117
        gunModel[118] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 118
        gunModel[119] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 119
        gunModel[120] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 120
        gunModel[121] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 121
        gunModel[122] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 122
        gunModel[123] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 123
        gunModel[124] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 124
        gunModel[125] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 125
        gunModel[126] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 126
        gunModel[127] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 127
        gunModel[128] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 128
        gunModel[129] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 129
        gunModel[130] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 130
        gunModel[131] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 131
        gunModel[132] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 132
        gunModel[133] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 133
        gunModel[134] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 134
        gunModel[135] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 135
        gunModel[136] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 136
        gunModel[137] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 137
        gunModel[138] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 138
        gunModel[139] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 139
        gunModel[140] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 140
        gunModel[141] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 141
        gunModel[142] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 142
        gunModel[143] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 143
        gunModel[144] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 144
        gunModel[145] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 145
        gunModel[146] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 146
        gunModel[147] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 147
        gunModel[148] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 148
        gunModel[149] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 149
        gunModel[150] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 150
        gunModel[151] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 151
        gunModel[152] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 152
        gunModel[153] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 153
        gunModel[154] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 154
        gunModel[155] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 155
        gunModel[156] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 156
        gunModel[157] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 157
        gunModel[158] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 159
        gunModel[159] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 160
        gunModel[160] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 161
        gunModel[161] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 162
        gunModel[162] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 163
        gunModel[163] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 164
        gunModel[164] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 165
        gunModel[165] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 166
        gunModel[166] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 167
        gunModel[167] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 168
        gunModel[168] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 169
        gunModel[169] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 170
        gunModel[170] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 171
        gunModel[171] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 172
        gunModel[172] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 173
        gunModel[173] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 174
        gunModel[174] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 175
        gunModel[175] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 176
        gunModel[176] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 177
        gunModel[177] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 178
        gunModel[178] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 179
        gunModel[179] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 180
        gunModel[180] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 181
        gunModel[181] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 182
        gunModel[182] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 183
        gunModel[183] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 184
        gunModel[184] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 185
        gunModel[185] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 186
        gunModel[186] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 187
        gunModel[187] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 188
        gunModel[188] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 189
        gunModel[189] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 190
        gunModel[190] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 191
        gunModel[191] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 192
        gunModel[192] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 193
        gunModel[193] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 194
        gunModel[194] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 196
        gunModel[195] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 197
        gunModel[196] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 198
        gunModel[197] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 200
        gunModel[198] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 201
        gunModel[199] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 202
        gunModel[200] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 203
        gunModel[201] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 204
        gunModel[202] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 205
        gunModel[203] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 206
        gunModel[204] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 207
        gunModel[205] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 208
        gunModel[206] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 209
        gunModel[207] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 210
        gunModel[208] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 211
        gunModel[209] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 212
        gunModel[210] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 213
        gunModel[211] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 215
        gunModel[212] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 216
        gunModel[213] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 217
        gunModel[214] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 435
        gunModel[215] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 436
        gunModel[216] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 437
        gunModel[217] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 438
        gunModel[218] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 439
        gunModel[219] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 440
        gunModel[220] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 441
        gunModel[221] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 442
        gunModel[222] = new ModelRendererTurbo(this, 465, 133, textureX, textureY); // Box 443
        gunModel[223] = new ModelRendererTurbo(this, 465, 133, textureX, textureY); // Box 444

        gunModel[0].addShapeBox(0F, 0F, 0F, 39, 1, 7, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.5F, 0.25F, 0.25F, -1.5F, 0.25F, 0.25F, -1.5F, 0F, 0.25F, -1.5F); // Box 0
        gunModel[0].setRotationPoint(54.25F, -28.5F, -3.5F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 39, 5, 7, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 1
        gunModel[1].setRotationPoint(54.25F, -33.5F, -3.5F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 23, 1, 7, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 2
        gunModel[2].setRotationPoint(54.25F, -34.5F, -3.5F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 9, 1, 7, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 3
        gunModel[3].setRotationPoint(84.25F, -34.5F, -3.5F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 39, 2, 7, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 4
        gunModel[4].setRotationPoint(54.25F, -36.5F, -3.5F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -1F, -0.625F, 0F); // Box 5
        gunModel[5].setRotationPoint(83.25F, -34.5F, -3.5F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -1F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -1F, -0.625F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 6
        gunModel[6].setRotationPoint(83.25F, -34.25F, -3.5F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, -0.625F, 0F, -1F, -0.625F, 0F, -1F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 7
        gunModel[7].setRotationPoint(77.75F, -34.25F, -3.5F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -1F, -0.625F, 0F, -1F, -0.625F, 0F, 0F, -0.625F, 0F); // Box 8
        gunModel[8].setRotationPoint(77.75F, -34.5F, -3.5F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 39, 1, 7, 0F, 1.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 1.25F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 9
        gunModel[9].setRotationPoint(54.25F, -37.5F, -3.5F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, -1.25F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 10
        gunModel[10].setRotationPoint(89.25F, -38.5F, -2.5F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.25F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F); // Box 11
        gunModel[11].setRotationPoint(90.25F, -39.5F, -2.5F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, -0.25F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F); // Box 12
        gunModel[12].setRotationPoint(90.25F, -39.5F, -2.5F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.25F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F); // Box 13
        gunModel[13].setRotationPoint(89.25F, -40.5F, -2.5F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F, -1.5F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, -1.5F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 18
        gunModel[14].setRotationPoint(76.5F, -38.5F, -2.5F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, -1F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F); // Box 19
        gunModel[15].setRotationPoint(77.5F, -39.5F, -2.5F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, -0.5F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -1F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -1F, -0.5F, 0.25F); // Box 20
        gunModel[16].setRotationPoint(77.5F, -39.5F, -2.5F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -1.5F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, -1.5F, -0.5F, 0.25F); // Box 21
        gunModel[17].setRotationPoint(76.5F, -40.5F, -2.5F);

        gunModel[18].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -1.5F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, -1.5F, -0.5F, 0.25F); // Box 22
        gunModel[18].setRotationPoint(64F, -40.5F, -2.5F);

        gunModel[19].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, -0.5F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -1F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -1F, -0.5F, 0.25F); // Box 23
        gunModel[19].setRotationPoint(65F, -39.5F, -2.5F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, -1F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F); // Box 24
        gunModel[20].setRotationPoint(65F, -39.5F, -2.5F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F, -1.5F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, -1.5F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 25
        gunModel[21].setRotationPoint(64F, -38.5F, -2.5F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 26
        gunModel[22].setRotationPoint(53.5F, -39.5F, -2.5F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Box 27
        gunModel[23].setRotationPoint(53.5F, -39.5F, -2.5F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, 0F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 28
        gunModel[24].setRotationPoint(53.5F, -38.5F, -2.5F);

        gunModel[25].addShapeBox(0F, 0F, 0F, 17, 1, 5, 0F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.15F, 0F, 0.25F, 0.15F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, 0.15F, -0.5F, 0.25F); // Box 29
        gunModel[25].setRotationPoint(41.5F, -40.5F, -2.5F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 52, 1, 5, 0F, -0.1F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, -0.1F, -0.75F, 0.25F, -0.1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.1F, 0F, 0.25F); // Box 30
        gunModel[26].setRotationPoint(41.25F, -41.5F, -2.5F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F, 0.15F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0.15F, -0.25F, 0.25F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.15F, 0F, 0.25F); // Box 31
        gunModel[27].setRotationPoint(41.5F, -38.5F, -2.5F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.75F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F); // Box 32
        gunModel[28].setRotationPoint(52.5F, -38.5F, -2.5F);

        gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F); // Box 33
        gunModel[29].setRotationPoint(52.5F, -39.5F, -2.5F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, -0.75F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F); // Box 34
        gunModel[30].setRotationPoint(52.5F, -40.75F, -2.5F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, -0.1F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, -0.1F, -0.75F, 0.25F, -0.1F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, -0.1F, 0.25F, 0.25F); // Box 35
        gunModel[31].setRotationPoint(41.25F, -40.75F, -2.5F);

        gunModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, -0.1F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.1F, -0.25F, 0.25F); // Box 36
        gunModel[32].setRotationPoint(41.25F, -39.5F, -2.5F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, -0.1F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, -0.1F, 0.25F, 0.25F, -0.1F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, -0.1F, -0.75F, 0.25F); // Box 37
        gunModel[33].setRotationPoint(41.25F, -38.5F, -2.5F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 52, 1, 5, 0F, -0.1F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, -0.1F, -0.125F, -0.5F, -0.1F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.1F, -0.25F, 0.25F); // Box 38
        gunModel[34].setRotationPoint(41.25F, -41.5F, -2.5F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F, -0.1F, 0F, 0.05F, 0.1F, 0F, 0.05F, 0.1F, 0F, 0.05F, -0.1F, 0F, 0.05F, -0.1F, 0.15F, 0.05F, 0.1F, 0.15F, 0.05F, 0.1F, 0.15F, 0.05F, -0.1F, 0.15F, 0.05F); // Box 39
        gunModel[35].setRotationPoint(83.5F, -42.5F, -1.5F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.175F, 0F, -0.25F, -0.175F, 0F, -0.25F, -0.175F, 0F, -0.25F, -0.175F, 0F, -0.25F, -0.175F, 0.25F, -0.25F, -0.175F, 0.25F, -0.25F, -0.175F, 0.25F, -0.25F, -0.175F, 0.25F, -0.25F); // Box 40
        gunModel[36].setRotationPoint(82.5F, -34.5F, -3.5F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, -3.35F, 0F, 0F, -1.15F, 0F, 0F, -1.15F, 0F, 0F, -3.35F, 0F, 0F, -0.1F, 0F, 0.325F, 0.1F, 0F, 0.325F, 0.1F, 0F, 0.325F, -0.1F, 0F, 0.325F); // Box 41
        gunModel[37].setRotationPoint(83.5F, -44.5F, -0.5F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.5F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 42
        gunModel[38].setRotationPoint(86.5F, -45.5F, -0.5F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 42, 1, 4, 0F, 0.15F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.15F, -0.15F, 0F, 0.15F, 0.15F, 0F, 0.1F, 0.15F, 0F, 0.1F, 0.15F, 0F, 0.15F, 0.15F, 0F); // Box 43
        gunModel[39].setRotationPoint(41.5F, -42.5F, -2F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 38, 1, 4, 0F, -0.4F, -0.4F, 1F, 0.1F, -0.4F, 1F, 0.1F, -0.4F, 1F, -0.4F, -0.4F, 1F, 0.6F, 0.15F, 0F, 0.1F, 0.15F, 0F, 0.1F, 0.15F, 0F, 0.6F, 0.15F, 0F); // Box 44
        gunModel[40].setRotationPoint(45.5F, -43.5F, -2F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F); // Box 45
        gunModel[41].setRotationPoint(82.5F, -43.75F, -2F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F); // Box 46
        gunModel[42].setRotationPoint(79.75F, -43.75F, -2F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F); // Box 47
        gunModel[43].setRotationPoint(77F, -43.75F, -2F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F); // Box 48
        gunModel[44].setRotationPoint(74.25F, -43.75F, -2F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F); // Box 49
        gunModel[45].setRotationPoint(71.4F, -43.75F, -2F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F); // Box 50
        gunModel[46].setRotationPoint(68.6F, -43.75F, -2F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F); // Box 51
        gunModel[47].setRotationPoint(65.8F, -43.75F, -2F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F); // Box 52
        gunModel[48].setRotationPoint(63F, -43.75F, -2F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F); // Box 53
        gunModel[49].setRotationPoint(60.25F, -43.75F, -2F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F); // Box 54
        gunModel[50].setRotationPoint(57.45F, -43.75F, -2F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F); // Box 55
        gunModel[51].setRotationPoint(54.7F, -43.75F, -2F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F); // Box 56
        gunModel[52].setRotationPoint(51.9F, -43.75F, -2F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F); // Box 57
        gunModel[53].setRotationPoint(49.1F, -43.75F, -2F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F); // Box 58
        gunModel[54].setRotationPoint(46.35F, -43.75F, -2F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 50, 1, 4, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 59
        gunModel[55].setRotationPoint(43.25F, -27.25F, -2F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F); // Box 60
        gunModel[56].setRotationPoint(92.15F, -26F, -2F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F); // Box 61
        gunModel[57].setRotationPoint(89.4F, -26F, -2F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F); // Box 62
        gunModel[58].setRotationPoint(86.65F, -26F, -2F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F); // Box 63
        gunModel[59].setRotationPoint(83.9F, -26F, -2F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F); // Box 64
        gunModel[60].setRotationPoint(81.05F, -26F, -2F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F); // Box 65
        gunModel[61].setRotationPoint(78.25F, -26F, -2F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F); // Box 66
        gunModel[62].setRotationPoint(75.45F, -26F, -2F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F); // Box 67
        gunModel[63].setRotationPoint(72.65F, -26F, -2F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F); // Box 68
        gunModel[64].setRotationPoint(69.9F, -26F, -2F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F); // Box 69
        gunModel[65].setRotationPoint(67.1F, -26F, -2F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F); // Box 70
        gunModel[66].setRotationPoint(64.35F, -26F, -2F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F); // Box 71
        gunModel[67].setRotationPoint(61.55F, -26F, -2F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F); // Box 72
        gunModel[68].setRotationPoint(58.75F, -26F, -2F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F); // Box 73
        gunModel[69].setRotationPoint(56F, -26F, -2F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.45F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.45F, -0.35F, 1F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F); // Box 74
        gunModel[70].setRotationPoint(53.1F, -26F, -2F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 1.25F, -0.35F, 1F, 0.1F, -0.35F, 1F, 0.1F, -0.35F, 1F, 1.25F, -0.35F, 1F, 0.45F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.1F, 0.25F, 0.4F, 0.45F, 0.25F, 0.4F); // Box 75
        gunModel[71].setRotationPoint(50.25F, -26F, -2F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 45, 1, 4, 0F, 0.75F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.75F, 0.15F, 0F, -0.75F, -0.4F, 1F, 0F, -0.4F, 1F, 0F, -0.4F, 1F, -0.75F, -0.4F, 1F); // Box 76
        gunModel[72].setRotationPoint(48.25F, -26.25F, -2F);

        gunModel[73].addShapeBox(0F, 0F, 0F, 13, 5, 3, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 73
        gunModel[73].setRotationPoint(41.25F, -33.5F, -3.5F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 74
        gunModel[74].setRotationPoint(41.25F, -34.5F, -3.5F);

        gunModel[75].addShapeBox(0F, 0F, 0F, 13, 2, 3, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
        gunModel[75].setRotationPoint(41.25F, -36.5F, -3.5F);

        gunModel[76].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F, 0F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 76
        gunModel[76].setRotationPoint(41.25F, -37.5F, -3.5F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 77
        gunModel[77].setRotationPoint(41.25F, -28.5F, -3.5F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F, 0F, 0.25F, 0.2F, -0.15F, -1F, 0.2F, -0.15F, -1F, 0.2F, 0F, 0.25F, 0.2F, 0F, 0.15F, 0.2F, -0.15F, 0.15F, 0.2F, -0.15F, 0.15F, 0.2F, 0F, 0.15F, 0.2F); // Box 78
        gunModel[78].setRotationPoint(40.5F, -43.5F, -3F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F, 0.4F, 0.25F, 0.2F, 0F, 0.25F, 0.2F, 0F, 0.25F, 0.2F, 0.4F, 0.25F, 0.2F, 0.4F, 0.15F, 0.2F, 0F, 0.15F, 0.2F, 0F, 0.15F, 0.2F, 0.4F, 0.15F, 0.2F); // Box 79
        gunModel[79].setRotationPoint(38.5F, -43.5F, -3F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0.4F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.25F, 0.4F, -0.15F, 0.25F, 0.4F, 0.55F, 0.2F, -0.15F, 0.55F, 0.2F, -0.15F, 0.55F, -0.9F, 0.4F, 0.55F, -0.9F); // Box 80
        gunModel[80].setRotationPoint(38.5F, -38.5F, -3F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F, 0.4F, 0.45F, 0.2F, -0.15F, 0.45F, 0.2F, -0.15F, 0.45F, 0.1F, 0.4F, 0.45F, 0.1F, 0.4F, -0.5F, 0.2F, -0.15F, -0.5F, 0.2F, -0.15F, -0.5F, 0.1F, 0.4F, -0.5F, 0.1F); // Box 81
        gunModel[81].setRotationPoint(38.5F, -36.5F, -3F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0.4F, 0.45F, -0.1F, -0.4F, 0.45F, -0.1F, -0.4F, 0.45F, -1.3F, 0.4F, 0.45F, -1.3F, 0.4F, -0.6F, -0.1F, -0.4F, -0.6F, -0.1F, -0.4F, -0.6F, 0.5F, 0.4F, -0.6F, 0.5F); // Box 82
        gunModel[82].setRotationPoint(38.5F, -36.5F, -1F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0.4F, 0.6F, -0.1F, -0.4F, 0.6F, -0.1F, -0.4F, 0.6F, 0.5F, 0.4F, 0.6F, 0.5F, 0.4F, -2.1F, -0.1F, -0.4F, -2.1F, -0.1F, -0.4F, -0.2F, -0.6F, 0.4F, -0.2F, -0.6F); // Box 83
        gunModel[83].setRotationPoint(38.5F, -33.5F, -1F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, 0.4F, -1.8F, -0.4F, -0.4F, -1.8F, -0.4F, -0.4F, 0.6F, 0.5F, 0.4F, 0.6F, 0.5F, 0.4F, -3.3F, -0.4F, -0.4F, -3.3F, -0.4F, -0.4F, -0.35F, 0.5F, 0.4F, -0.35F, 0.5F); // Box 84
        gunModel[84].setRotationPoint(38.5F, -33.5F, 2F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0.4F, -1.5F, -0.1F, -0.4F, -1.5F, -0.1F, -0.4F, 0.3F, -0.6F, 0.4F, 0.3F, -0.6F, 0.4F, 0.65F, -0.1F, -0.4F, 0.65F, -0.1F, -0.4F, 0.65F, 0.5F, 0.4F, 0.65F, 0.5F); // Box 85
        gunModel[85].setRotationPoint(38.5F, -28.5F, -1F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 86
        gunModel[86].setRotationPoint(43.3F, -33F, -2.25F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 87
        gunModel[87].setRotationPoint(43.3F, -33F, -0.5F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F); // Box 88
        gunModel[88].setRotationPoint(43.3F, -33F, 1.25F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 89
        gunModel[89].setRotationPoint(40.9F, -33F, -2.25F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 90
        gunModel[90].setRotationPoint(40.9F, -33F, -0.5F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F); // Box 91
        gunModel[91].setRotationPoint(40.9F, -33F, 1.25F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 60, 5, 1, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -1.75F, 0.25F, 0F, -1.75F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -1.75F, 0.25F, 0F, -1.75F, 0.25F); // Box 92
        gunModel[92].setRotationPoint(38F, -33F, 1F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 60, 5, 1, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 93
        gunModel[93].setRotationPoint(38F, -33F, -0.5F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 60, 5, 1, 0F, 0F, -1.75F, 0.25F, 0F, -1.75F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -1.75F, 0.25F, 0F, -1.75F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 94
        gunModel[94].setRotationPoint(38F, -33F, -2F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F); // Box 95
        gunModel[95].setRotationPoint(93.25F, -33F, 1.25F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 96
        gunModel[96].setRotationPoint(93.25F, -33F, -0.5F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 97
        gunModel[97].setRotationPoint(93.25F, -33F, -2.25F);

        gunModel[98].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F); // Box 98
        gunModel[98].setRotationPoint(43.3F, -30F, -0.75F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
        gunModel[99].setRotationPoint(40.75F, -36F, -0.5F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 100
        gunModel[100].setRotationPoint(40.75F, -36F, 0.5F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
        gunModel[101].setRotationPoint(40.75F, -36F, -1.5F);

        gunModel[102].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 102
        gunModel[102].setRotationPoint(45.75F, -36F, -0.5F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F); // Box 103
        gunModel[103].setRotationPoint(45.75F, -36F, 0.5F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 104
        gunModel[104].setRotationPoint(45.75F, -36F, -1.5F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 105
        gunModel[105].setRotationPoint(47F, -36F, 0.5F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
        gunModel[106].setRotationPoint(47F, -36F, -0.5F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
        gunModel[107].setRotationPoint(47F, -36F, -1.5F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 108
        gunModel[108].setRotationPoint(51.5F, -36F, 0.5F);

        gunModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
        gunModel[109].setRotationPoint(51.5F, -36F, -0.5F);

        gunModel[110].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
        gunModel[110].setRotationPoint(51.5F, -36F, -1.5F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -0.25F, 0F, -1F, 0F); // Box 111
        gunModel[111].setRotationPoint(52.5F, -36F, 0.5F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 112
        gunModel[112].setRotationPoint(52.5F, -36F, -0.5F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0.1F, 0F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 113
        gunModel[113].setRotationPoint(41.25F, -28.9F, 1.25F);

        gunModel[114].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0.1F, 0F, 0.25F, 0.1F, 0F, 0.25F, -1.4F, 0.2F, 0F, -1.4F, 0.2F, 0F, 0.1F, -0.2F, 0.25F, 0.1F, -0.2F, 0.25F, -1F, 0.2F, 0F, -1F, 0.2F); // Box 114
        gunModel[114].setRotationPoint(41.25F, -28.9F, 2.25F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0.5F, 0.4F, -0.15F, 0.5F, 0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, -0.25F, 0.4F, -0.15F, -0.25F); // Box 115
        gunModel[115].setRotationPoint(38.5F, -26F, 1F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, -0.1F, 0.15F, 0F, -0.1F, 0.15F, 0F, -0.1F, 0.15F, 0F, -0.1F, 0.15F, 0F, -0.1F, 0.15F, 0F, -0.1F, 0.15F, 0F, -0.1F, 0.15F, 0F, -0.1F, 0.15F, 0F); // Box 116
        gunModel[116].setRotationPoint(37.25F, -26.25F, -1F);

        gunModel[117].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, -0.1F, -0.15F, 0F, -0.1F, -0.15F, 0F, -0.1F, -0.15F, 0F, -0.1F, -0.15F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F); // Box 117
        gunModel[117].setRotationPoint(37.25F, -24.25F, -1F);

        gunModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 118
        gunModel[118].setRotationPoint(44.6F, -24.65F, -0.5F);

        gunModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 119
        gunModel[119].setRotationPoint(44.6F, -24.65F, -0.5F);

        gunModel[120].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F); // Box 120
        gunModel[120].setRotationPoint(44.6F, -24.65F, -0.5F);

        gunModel[121].addShapeBox(0F, 0F, 0F, 27, 2, 5, 0F, 0F, 0.5F, 0.2F, -0.35F, 0.5F, 0.2F, -0.35F, 0.5F, -0.15F, 0F, 0.5F, -0.15F, 0F, -0.25F, 0.2F, -0.35F, -0.25F, 0.2F, -0.35F, -0.25F, -0.15F, 0F, -0.25F, -0.15F); // Box 121
        gunModel[121].setRotationPoint(16.75F, -26.5F, -3F);

        gunModel[122].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F, 0F, 0.5F, 0.15F, 0.2F, 0.5F, 0.15F, -0.75F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, -0.25F, 0.15F, 0.2F, -0.25F, 0.15F, -0.75F, -0.25F, 0.2F, 0F, -0.25F, 0.2F); // Box 122
        gunModel[122].setRotationPoint(16.75F, -26.5F, 2F);

        gunModel[123].addShapeBox(0F, 0F, 0F, 22, 2, 1, 0F, 0F, -0.2F, 0.25F, 0.1F, -0.2F, 0.25F, 0.1F, -0.2F, 0.6F, 0F, -0.2F, 0.6F, 0F, -0.2F, 0.25F, 0.1F, -0.2F, 0.25F, 0.1F, -0.2F, 0.6F, 0F, -0.2F, 0.6F); // Box 123
        gunModel[123].setRotationPoint(21.25F, -25F, 1.25F);

        gunModel[124].addShapeBox(0F, 0F, 0F, 22, 2, 1, 0F, 0F, -0.2F, 0.6F, 0.1F, -0.2F, 0.6F, 0.1F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.6F, 0.1F, -0.2F, 0.6F, 0.1F, -0.2F, 0.25F, 0F, -0.2F, 0.25F); // Box 124
        gunModel[124].setRotationPoint(21.25F, -25F, -2.25F);

        gunModel[125].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F, 0F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 125
        gunModel[125].setRotationPoint(21.25F, -25F, -1F);

        gunModel[126].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, -0.25F, 0F, 0.15F, -0.35F, 0F, 0.15F, -0.35F, -0.65F, 0.15F, -0.25F, -0.65F, 0.15F, -0.25F, -0.25F, 0.15F, -0.35F, -0.25F, 0.15F, -0.35F, -0.25F, 0.15F, -0.25F, -0.25F, 0.15F); // Box 126
        gunModel[126].setRotationPoint(32.75F, -25.5F, 2F);

        gunModel[127].addShapeBox(0F, 0F, 0F, 15, 2, 6, 0F, -0.25F, 0.25F, 0.2F, -0.4F, 0.25F, 0.2F, -0.4F, 0.25F, 0.2F, -0.25F, 0.25F, 0.2F, -0.25F, -0.35F, 0.2F, -0.4F, -0.35F, 0.2F, -0.4F, -0.35F, 0.2F, -0.25F, -0.35F, 0.2F); // Box 127
        gunModel[127].setRotationPoint(23.5F, -43.5F, -3F);

        gunModel[128].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F, -0.35F, 0.25F, 0.2F, 0.25F, 0.25F, 0.2F, 0.25F, 0.25F, 0.2F, -0.35F, 0.25F, 0.2F, -0.35F, -0.35F, 0.2F, 0.25F, -0.35F, 0.2F, 0.25F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F); // Box 128
        gunModel[128].setRotationPoint(16.5F, -42.5F, -3F);

        gunModel[129].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F, 0F, 0.25F, 0.05F, 0.05F, 0.25F, 0.05F, 0.05F, 0.25F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 129
        gunModel[129].setRotationPoint(17F, -43.5F, -3.5F);

        gunModel[130].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F, -0.35F, -0.3F, -0.15F, -0.25F, -0.3F, -0.15F, -0.25F, -0.3F, -0.15F, -0.35F, -0.3F, -0.15F, 0F, -0.25F, 0.05F, 0.05F, -0.25F, 0.05F, 0.05F, -0.25F, 0.05F, 0F, -0.25F, 0.05F); // Box 130
        gunModel[130].setRotationPoint(17F, -44.5F, -3.5F);

        gunModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.3F, 0.15F, 0.05F, -0.3F, 0.15F, 0.05F, -0.3F, 0.15F, 0F, -0.3F, 0.15F, 0F, 0F, 0.15F, 0.05F, 0F, 0.15F, 0.05F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 131
        gunModel[131].setRotationPoint(23F, -43.5F, -2F);

        gunModel[132].addShapeBox(0F, 0F, 0F, 5, 17, 6, 0F, 0F, 0.25F, 0.2F, 0.35F, 0.25F, 0.2F, 0.35F, 0.25F, 0.2F, 0F, 0.25F, 0.2F, 0F, -0.5F, 0.2F, 0.35F, -0.5F, 0.2F, 0.35F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Box 132
        gunModel[132].setRotationPoint(11.5F, -43.5F, -3F);

        gunModel[133].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F, 0.65F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0.65F, 0.5F, 0.2F, 0.65F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0.65F, -0.25F, 0.2F); // Box 133
        gunModel[133].setRotationPoint(-3.25F, -26.5F, -3F);

        gunModel[134].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 134
        gunModel[134].setRotationPoint(9.5F, -44.5F, -3F);

        gunModel[135].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0.4F, -0.25F, -4.2F, 0.4F, -0.25F, -4.2F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.25F, -0.25F, 0.3F, 0.25F, -0.25F, 0.2F, 0.25F, 0.5F, 0F, 0.25F, 0F); // Box 135
        gunModel[135].setRotationPoint(9.5F, -45.5F, -3F);

        gunModel[136].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0.4F, 0F, -4.2F, 0.4F, 0F, -4.2F, 0.4F, -0.25F, 0F, 0.4F, -0.25F, 0F, 0.25F, 0F, 0.2F, 0.25F, 0.5F, 0.3F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 136
        gunModel[136].setRotationPoint(9.5F, -45.5F, 2F);

        gunModel[137].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, -0.25F, 0.15F, 0.6F, -0.25F, 0.15F, 0.6F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.25F, 0.6F, -0.25F, 0.25F, 0.6F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 137
        gunModel[137].setRotationPoint(10.25F, -44.5F, 1F);

        gunModel[138].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0.6F, -0.25F, 0.15F, 0.6F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0.6F, -0.25F, 0.25F, 0.6F); // Box 138
        gunModel[138].setRotationPoint(10.25F, -44.5F, -2F);

        gunModel[139].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, -0.25F, 0.15F, -0.1F, -0.25F, 0.15F, -0.1F, -0.25F, 0.15F, -0.1F, -0.25F, 0.15F, -0.1F, -0.25F, 0.25F, -0.1F, -0.25F, 0.25F, -0.1F, -0.25F, 0.25F, -0.1F, -0.25F, 0.25F, -0.1F); // Box 139
        gunModel[139].setRotationPoint(10.25F, -44F, -0.5F);

        gunModel[140].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0.05F, 0.25F, 0.2F, 0F, 0.25F, 0.2F, 0F, 0.25F, 0.2F, 0.05F, 0.25F, 0.2F, 0.35F, -0.35F, 0.2F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.2F, 0.35F, -0.35F, 0.2F); // Box 140
        gunModel[140].setRotationPoint(9.5F, -43.5F, -3F);

        gunModel[141].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0.35F, 0.35F, 0.2F, 0F, 0.35F, 0.2F, 0F, 0.35F, 0.2F, 0.35F, 0.35F, 0.2F, 0.55F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.55F, 0.2F, 0.2F); // Box 141
        gunModel[141].setRotationPoint(9.5F, -37.5F, -3F);

        gunModel[142].addShapeBox(-2F, 0F, 0F, 3, 2, 1, 0F, -0.45F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.45F, -0.2F, 0.2F, 1.25F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 1.25F, 0.3F, 0.2F); // Box 142
        gunModel[142].setRotationPoint(10.5F, -34.5F, -3F);

        gunModel[143].addShapeBox(-2F, 0F, 0F, 7, 2, 1, 0F, -2.75F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, -2.75F, -0.3F, 0.2F, 0.75F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0.75F, -0.25F, 0.2F); // Box 143
        gunModel[143].setRotationPoint(6.5F, -32.5F, -3F);

        gunModel[144].addShapeBox(-2F, 0F, 0F, 14, 1, 1, 0F, -6.25F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, -6.25F, -0.25F, 0.2F, 0.25F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0.25F, -0.4F, 0.2F); // Box 144
        gunModel[144].setRotationPoint(-0.5F, -31F, -3F);

        gunModel[145].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0.35F, 0.35F, 0.2F, 0F, 0.35F, 0.2F, 0F, 0.35F, 0.2F, 0.35F, 0.35F, 0.2F, 0.55F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.55F, 0.2F, 0.2F); // Box 145
        gunModel[145].setRotationPoint(9.5F, -37.5F, 2F);

        gunModel[146].addShapeBox(-2F, 0F, 0F, 3, 2, 1, 0F, -0.45F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.45F, -0.2F, 0.2F, 1.25F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 1.25F, 0.3F, 0.2F); // Box 146
        gunModel[146].setRotationPoint(10.5F, -34.5F, 2F);

        gunModel[147].addShapeBox(-2F, 0F, 0F, 7, 2, 1, 0F, -2.75F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, -2.75F, -0.3F, 0.2F, 0.75F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0.75F, -0.25F, 0.2F); // Box 147
        gunModel[147].setRotationPoint(6.5F, -32.5F, 2F);

        gunModel[148].addShapeBox(-2F, 0F, 0F, 14, 1, 1, 0F, -6.25F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, -6.25F, -0.25F, 0.2F, 0.25F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0.25F, -0.4F, 0.2F); // Box 148
        gunModel[148].setRotationPoint(-0.5F, -31F, 2F);

        gunModel[149].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0.05F, 0.25F, 0.2F, 0F, 0.25F, 0.2F, 0F, 0.25F, 0.2F, 0.05F, 0.25F, 0.2F, 0.35F, -0.35F, 0.2F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.2F, 0.35F, -0.35F, 0.2F); // Box 149
        gunModel[149].setRotationPoint(9.5F, -43.5F, 2F);

        gunModel[150].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0.05F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, 0.25F, -0.2F, 0.05F, 0.25F, -0.2F, 0.35F, -1.1F, 0.1F, 0F, -1.1F, 0.1F, 0F, -0.35F, -0.2F, 0.35F, -0.35F, -0.2F); // Box 150
        gunModel[150].setRotationPoint(9.5F, -43.5F, 1F);

        gunModel[151].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0.05F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, 0.1F, 0.05F, 0.25F, 0.1F, 0.35F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -1.1F, 0.1F, 0.35F, -1.1F, 0.1F); // Box 151
        gunModel[151].setRotationPoint(9.5F, -43.5F, -2F);

        gunModel[152].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0.05F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0.05F, 0.25F, -0.1F, 0.35F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.35F, -0.1F, -0.1F); // Box 152
        gunModel[152].setRotationPoint(9.5F, -43.5F, -1F);

        gunModel[153].addShapeBox(-2F, 0F, 0F, 15, 2, 1, 0F, -0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F, 0.4F, -0.15F, 0.2F, 0F, -0.15F, 0.2F, 0F, -0.15F, 0.2F, 0.4F, -0.15F, 0.2F); // Box 153
        gunModel[153].setRotationPoint(-1.5F, -30.5F, 2F);

        gunModel[154].addShapeBox(-2F, 0F, 0F, 15, 2, 1, 0F, -0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F, 0.4F, -0.15F, 0.2F, 0F, -0.15F, 0.2F, 0F, -0.15F, 0.2F, 0.4F, -0.15F, 0.2F); // Box 154
        gunModel[154].setRotationPoint(-1.5F, -30.5F, -3F);

        gunModel[155].addShapeBox(-2F, 0F, 0F, 5, 2, 4, 0F, -0.75F, -0.1F, -0.2F, -0.05F, 0.1F, -0.2F, -0.05F, 0.1F, -0.2F, -0.75F, -0.1F, -0.2F, 0.4F, -0.15F, -0.2F, -0.05F, -0.15F, -0.2F, -0.05F, -0.15F, -0.2F, 0.4F, -0.15F, -0.2F); // Box 155
        gunModel[155].setRotationPoint(-1.5F, -30.5F, -2F);

        gunModel[156].addShapeBox(-2F, 0F, 0F, 3, 2, 4, 0F, 0.05F, 0.1F, -0.2F, -1F, -0.1F, -0.2F, -1F, -0.1F, -0.2F, 0.05F, 0.1F, -0.2F, 0.05F, -0.15F, -0.2F, 0.4F, -0.15F, -0.2F, 0.4F, -0.15F, -0.2F, 0.05F, -0.15F, -0.2F); // Box 156
        gunModel[156].setRotationPoint(3.5F, -30.5F, -2F);

        gunModel[157].addShapeBox(0F, 0F, 0F, 15, 2, 6, 0F, 0.4F, 0.15F, 0.2F, 0F, 0.15F, 0.2F, 0F, 0.15F, 0.2F, 0.4F, 0.15F, 0.2F, 0.4F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0.4F, -0.5F, 0.2F); // Box 157
        gunModel[157].setRotationPoint(-3.5F, -28.5F, -3F);

        gunModel[158].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F, 1.2F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.6F, 1.2F, -0.2F, 0.6F, -0.4F, 0.6F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.6F, -0.4F, 0.6F, 0.6F); // Box 159
        gunModel[158].setRotationPoint(17.25F, -25F, -2.75F);

        gunModel[159].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F, 1.2F, -0.25F, 0.1F, -1.2F, -0.2F, 0.1F, -1.2F, -0.2F, 0.6F, 1.2F, -0.25F, 0.6F, -1.6F, 2F, 0.1F, 0.4F, -0.4F, 0.1F, 0.4F, -0.4F, 0.6F, -1.6F, 2F, 0.6F); // Box 160
        gunModel[159].setRotationPoint(13.25F, -25F, -2.75F);

        gunModel[160].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F, -2.2F, -5.2F, 0.1F, -2.2F, 2.75F, 0.1F, -2.2F, 2.75F, 0.6F, -2.2F, -5.2F, 0.6F, -3.7F, 1.7F, 0.1F, 0.6F, -1F, 0.1F, 0.6F, -1F, 0.6F, -3.7F, 1.7F, 0.6F); // Box 161
        gunModel[160].setRotationPoint(10.25F, -22F, -2.75F);

        gunModel[161].addShapeBox(0F, 0F, 0F, 22, 1, 8, 0F, -0.15F, 0.15F, 0.5F, -12.8F, 0.1F, 0.5F, -12.8F, 0.1F, 0F, -0.15F, 0.15F, 0F, 1F, -0.2F, 0.5F, -0.3F, 3.65F, 0.5F, -0.3F, 3.65F, 0F, 1F, -0.2F, 0F); // Box 162
        gunModel[161].setRotationPoint(-6F, -28.5F, -3.75F);

        gunModel[162].addShapeBox(0F, 0F, 0F, 23, 1, 8, 0F, 0F, 0.2F, 0.5F, -0.3F, -3.65F, 0.5F, -0.3F, -3.65F, 0F, 0F, 0.2F, 0F, 0F, -1.2F, 0.5F, -0.4F, 4.5F, 0.5F, -0.4F, 4.5F, 0F, 0F, -1.2F, 0F); // Box 163
        gunModel[162].setRotationPoint(-7F, -27.5F, -3.75F);

        gunModel[163].addShapeBox(0F, 0F, 0F, 23, 1, 8, 0F, 0F, 0.2F, 0.5F, -0.4F, -5.5F, 0.5F, -0.4F, -5.5F, 0F, 0F, 0.2F, 0F, -5.4F, 2.85F, 0.5F, -2.2F, 6.3F, 0.5F, -2.2F, 6.3F, 0F, -5.4F, 2.85F, 0F); // Box 164
        gunModel[163].setRotationPoint(-7F, -27.5F, -3.75F);

        gunModel[164].addShapeBox(0F, 0F, 0F, 16, 1, 8, 0F, -0.4F, 0.15F, 0.5F, -0.2F, -3.3F, 0.5F, -0.2F, -3.3F, 0F, -0.4F, 0.15F, 0F, -0.4F, -1.15F, 0.5F, -0.65F, 3.5F, 0.5F, -0.65F, 3.5F, 0F, -0.4F, -1.15F, 0F); // Box 165
        gunModel[164].setRotationPoint(-2F, -23.5F, -3.75F);

        gunModel[165].addShapeBox(0F, 0F, 0F, 16, 3, 8, 0F, -0.4F, 0.15F, 0.5F, -0.65F, -4.5F, 0.5F, -0.65F, -4.5F, 0F, -0.4F, 0.15F, 0F, 0.05F, 0.4F, 0.5F, -6.4F, 2.6F, 0.5F, -6.4F, 2.6F, 0F, 0.05F, 0.4F, 0F); // Box 166
        gunModel[165].setRotationPoint(-2F, -23.5F, -3.75F);

        gunModel[166].addShapeBox(0F, 0F, 0F, 10, 3, 8, 0F, 0.05F, 0.6F, 0.5F, -0.4F, -1.6F, 0.5F, -0.4F, -1.6F, 0F, 0.05F, 0.6F, 0F, 1.8F, -0.2F, 0.5F, -2.15F, 2.35F, 0.5F, -2.15F, 2.35F, 0F, 1.8F, -0.2F, 0F); // Box 167
        gunModel[166].setRotationPoint(-2F, -19.5F, -3.75F);

        gunModel[167].addShapeBox(0F, 0F, 0F, 10, 8, 8, 0F, -0.2F, 1.2F, 0.5F, -0.15F, -1.35F, 0.5F, -0.15F, -1.35F, 0F, -0.2F, 1.2F, 0F, 2.8F, 0F, 0.5F, -0.65F, 0F, 0.5F, -0.65F, 0F, 0F, 2.8F, 0F, 0F); // Box 168
        gunModel[167].setRotationPoint(-4F, -15.5F, -3.75F);

        gunModel[168].addShapeBox(0F, 0F, 0F, 12, 13, 8, 0F, -0.2F, 0F, 0.5F, 0.35F, 0F, 0.5F, 0.35F, 0F, 0F, -0.2F, 0F, 0F, 1.85F, 0.1F, 0.5F, 0.35F, 0.1F, 0.5F, 0.35F, 0.1F, 0F, 1.85F, 0.1F, 0F); // Box 169
        gunModel[168].setRotationPoint(-7F, -7.5F, -3.75F);

        gunModel[169].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F, 0F, 0.2F, 0.5F, 0.4F, -3.85F, 0.5F, 0.4F, -3.85F, 0F, 0F, 0.2F, 0F, -0.55F, 0.9F, -0.5F, 0.4F, 2.85F, 0.5F, 0.4F, 2.85F, 0F, -0.55F, 0.9F, -1F); // Box 170
        gunModel[169].setRotationPoint(-7F, -27.5F, -3.75F);

        gunModel[170].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F, -0.75F, -0.55F, -1.05F, 0.4F, 0.15F, 0.5F, 0.4F, 0.15F, 0F, -0.75F, -0.55F, -1.55F, -0.3F, 0F, -1.05F, -0.05F, 0.4F, 0.5F, -0.05F, 0.4F, 0F, -0.3F, 0F, -1.55F); // Box 171
        gunModel[170].setRotationPoint(-5F, -23.5F, -3.75F);

        gunModel[171].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0.45F, 0.1F, -0.5F, 0.4F, -1.85F, 0.5F, 0.4F, -1.85F, 0F, 0.45F, 0.1F, -1F, -1.75F, 1.55F, -1F, 0.4F, 0.85F, 0.5F, 0.4F, 0.85F, 0F, -1.75F, 1.55F, -1.55F); // Box 172
        gunModel[171].setRotationPoint(-6F, -25.5F, -3.75F);

        gunModel[172].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F, -0.3F, 1F, -1.05F, -0.05F, 0.6F, 0.5F, -0.05F, 0.6F, 0F, -0.3F, 1F, -1.55F, 1.3F, -0.9F, -1.05F, -1.8F, -0.2F, 0.5F, -1.8F, -0.2F, 0F, 1.3F, -0.9F, -1.55F); // Box 173
        gunModel[172].setRotationPoint(-5F, -19.5F, -3.75F);

        gunModel[173].addShapeBox(0F, 0F, 0F, 2, 9, 8, 0F, 0.3F, 0.9F, -1.05F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 0.3F, 0.9F, -1.55F, 3.4F, 0F, -1.05F, -2.8F, 0F, 0.5F, -2.8F, 0F, 0F, 3.4F, 0F, -1.55F); // Box 174
        gunModel[173].setRotationPoint(-6F, -16.5F, -3.75F);

        gunModel[174].addShapeBox(0F, 0F, 0F, 2, 13, 8, 0F, 0.4F, 0F, -1.05F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0F, 0.4F, 0F, -1.55F, 2.5F, 0.1F, -1.05F, -1.85F, 0.1F, 0.5F, -1.85F, 0.1F, 0F, 2.5F, 0.1F, -1.55F); // Box 175
        gunModel[174].setRotationPoint(-9F, -7.5F, -3.75F);

        gunModel[175].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F, 0.4F, -0.6F, 0.5F, 0.35F, 0.5F, 0.5F, 0.35F, 0.5F, 0F, 0.4F, -0.6F, 0F, -1.45F, 1.1F, -0.9F, -0.4F, 0.6F, -0.9F, -0.4F, 0.5F, -1.4F, -1.45F, 1.1F, -1.4F); // Box 176
        gunModel[175].setRotationPoint(8F, -18.5F, -3.75F);

        gunModel[176].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F, -0.6F, 0.4F, 0.5F, 0.45F, -1.1F, -0.9F, 0.45F, -1.1F, -1.4F, -0.6F, 0.4F, 0F, 1.15F, 0.35F, 0.5F, -0.9F, 0.95F, -0.9F, -0.9F, 0.95F, -1.4F, 1.15F, 0.35F, 0F); // Box 177
        gunModel[176].setRotationPoint(7F, -17.5F, -3.75F);

        gunModel[177].addShapeBox(0F, 0F, 0F, 2, 6, 8, 0F, 0.15F, 0.65F, 0.5F, 0.1F, 0.05F, -0.9F, 0.1F, 0.05F, -1.4F, 0.15F, 0.65F, 0F, 0.65F, 0F, 0.5F, -0.35F, 0F, -0.9F, -0.35F, 0F, -1.4F, 0.65F, 0F, 0F); // Box 178
        gunModel[177].setRotationPoint(6F, -13.5F, -3.75F);

        gunModel[178].addShapeBox(0F, 0F, 0F, 2, 13, 8, 0F, 0.4F, 0F, 0.5F, -0.1F, 0F, -0.9F, -0.1F, 0F, -1.4F, 0.4F, 0F, 0F, 0.4F, 0.1F, 0.5F, -0.1F, 0.1F, -0.9F, -0.1F, 0.1F, -1.4F, 0.4F, 0.1F, 0F); // Box 179
        gunModel[178].setRotationPoint(5.75F, -7.5F, -3.75F);

        gunModel[179].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0.8F, -1.2F, -0.25F, -0.3F, -0.7F, -0.25F, -0.3F, -0.7F, -0.25F, 0.8F, -1.2F, -0.25F, -1.2F, 0.5F, -0.25F, 0.6F, -0.05F, -0.25F, 0.6F, -0.05F, -0.25F, -1.2F, 0.5F, -0.25F); // Box 180
        gunModel[179].setRotationPoint(13.25F, -18F, -2F);

        gunModel[180].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, -0.6F, 0.05F, -0.25F, 0.5F, -1.65F, -0.25F, 0.5F, -1.65F, -0.25F, -0.6F, 0.05F, -0.25F, -0.2F, -0.5F, -0.25F, 0.25F, 1.3F, -0.25F, 0.25F, 1.3F, -0.25F, -0.2F, -0.5F, -0.25F); // Box 181
        gunModel[180].setRotationPoint(14.25F, -15F, -2F);

        gunModel[181].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0.5F, -0.15F, -0.25F, 0.65F, -0.45F, -0.25F, 0.65F, -0.45F, -0.25F, 0.5F, -0.15F, -0.25F, 0.75F, -0.2F, -0.25F, 0.7F, 0.1F, -0.25F, 0.7F, 0.1F, -0.25F, 0.75F, -0.2F, -0.25F); // Box 182
        gunModel[181].setRotationPoint(18.25F, -13.5F, -2F);

        gunModel[182].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0.35F, -0.45F, -0.25F, 0.75F, 0.4F, -0.25F, 0.75F, 0.4F, -0.25F, 0.35F, -0.45F, -0.25F, 0.3F, 0.1F, -0.25F, 0.8F, -0.75F, -0.25F, 0.8F, -0.75F, -0.25F, 0.3F, 0.1F, -0.25F); // Box 183
        gunModel[182].setRotationPoint(22.25F, -13.5F, -2F);

        gunModel[183].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0.25F, -0.6F, -0.25F, -0.55F, 1F, -0.25F, -0.55F, 1F, -0.25F, 0.25F, -0.6F, -0.25F, 0.2F, 0.3F, -0.25F, -0.25F, -1.4F, -0.25F, -0.25F, -1.4F, -0.25F, 0.2F, 0.25F, -0.25F); // Box 184
        gunModel[183].setRotationPoint(26.25F, -14.5F, -2F);

        gunModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, -0.2F, 0.35F, -0.25F, 0.25F, -1.3F, -0.25F, 0.25F, -1.3F, -0.25F, -0.2F, 0.35F, -0.25F, 0.55F, 0F, -0.25F, -1.25F, 0.6F, -0.25F, -1.25F, 0.6F, -0.25F, 0.55F, 0F, -0.25F); // Box 185
        gunModel[184].setRotationPoint(29.25F, -17.5F, -2F);

        gunModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.2F, 0.35F, -0.25F, -0.15F, 0.55F, -0.25F, -0.15F, 0.55F, -0.25F, -0.2F, 0.35F, -0.25F, -1.25F, 0.3F, -0.25F, 0.25F, 0.3F, -0.25F, 0.25F, 0.3F, -0.25F, -1.25F, 0.3F, -0.25F); // Box 186
        gunModel[185].setRotationPoint(29.25F, -17.5F, -2F);

        gunModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0.2F, -0.05F, -0.25F, -0.15F, 0.1F, -0.25F, -0.15F, 0.1F, -0.25F, 0.2F, -0.05F, -0.25F, -0.2F, 0.15F, -0.25F, -0.15F, -0.05F, -0.25F, -0.15F, -0.05F, -0.25F, -0.2F, 0.15F, -0.25F); // Box 187
        gunModel[186].setRotationPoint(29.25F, -20F, -2F);

        gunModel[187].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0.35F, -0.05F, -0.25F, 0.75F, -0.15F, -0.25F, 0.75F, -0.15F, -0.25F, 0.35F, -0.05F, -0.25F, -0.8F, 0.05F, -0.25F, -0.15F, -0.1F, -0.25F, -0.15F, -0.1F, -0.25F, -0.8F, 0.05F, -0.25F); // Box 188
        gunModel[187].setRotationPoint(28.25F, -22F, -2F);

        gunModel[188].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, 0.85F, 0.2F, -0.25F, 0.4F, 0.2F, -0.25F, 0.4F, 0.2F, -0.25F, 0.85F, 0.2F, -0.25F, -1.65F, 0.05F, -0.25F, -1.25F, 0.15F, -0.25F, -1.25F, 0.15F, -0.25F, -1.65F, 0.05F, -0.25F); // Box 189
        gunModel[188].setRotationPoint(26.25F, -23F, -2F);

        gunModel[189].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0.15F, 0F, 0.3F, 0.15F, 0F, 0.3F, 0.15F, 0F, 0F, 0.15F, -1.5F, 0.05F, 0.15F, -1.4F, -0.1F, 0.15F, -1.4F, -0.15F, 0.15F, -1.5F, 0.05F, 0.15F); // Box 190
        gunModel[189].setRotationPoint(17.25F, -23F, -1F);

        gunModel[190].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.5F, -0.05F, 0.15F, -0.4F, 0.15F, 0.15F, -0.4F, 0.15F, 0.15F, 0.5F, -0.05F, 0.15F, 0F, 0.6F, 0.15F, -0.75F, 0.25F, 0.15F, -0.75F, 0.25F, 0.15F, 0F, 0.6F, 0.15F); // Box 191
        gunModel[190].setRotationPoint(19.25F, -21F, -1F);

        gunModel[191].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, -0.6F, 0.15F, 0.25F, -0.25F, 0.15F, 0.25F, -0.25F, 0.15F, 0F, -0.6F, 0.15F, -2.05F, 0.1F, 0.15F, 1.5F, -0.35F, 0.15F, 1.5F, -0.35F, 0.15F, -2.05F, 0.1F, 0.15F); // Box 192
        gunModel[191].setRotationPoint(19.25F, -19F, -1F);

        gunModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.05F, 0F, 0.15F, -0.5F, 0.35F, 0.15F, -0.5F, 0.35F, 0.15F, -0.05F, -0.1F, 0.15F, -2.45F, -0.6F, 0.15F, 1.65F, -0.95F, 0.15F, 1.65F, -0.95F, 0.15F, -2.45F, -0.6F, 0.15F); // Box 193
        gunModel[192].setRotationPoint(21.25F, -16F, -1F);

        gunModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.15F, 0.35F, 0.15F, -0.55F, 0.4F, 0.15F, -0.55F, 0.4F, 0.15F, 0.15F, 0.35F, 0.15F, -0.05F, -0.55F, 0.15F, 0.5F, 0.05F, 0.15F, 0.5F, 0.05F, 0.15F, -0.05F, -0.55F, 0.15F); // Box 194
        gunModel[193].setRotationPoint(17.25F, -22F, -1F);

        gunModel[194].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, -0.55F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, -0.55F, 0.15F, 0F, 0.7F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.7F, -0.15F, 0F); // Box 196
        gunModel[194].setRotationPoint(6.5F, -32.5F, -1.5F);

        gunModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, -0.3F, 0F, -0.7F, 0.15F, 0F, -0.7F, 0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.15F, 0F, -0.7F, -0.15F, 0F, -0.7F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 197
        gunModel[195].setRotationPoint(4.5F, -29.5F, -1.5F);

        gunModel[196].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0.05F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.05F, 0.2F, 0F, 0.45F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.45F, -0.15F, 0F); // Box 198
        gunModel[196].setRotationPoint(7.5F, -35.5F, -1.5F);

        gunModel[197].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0.1F, 0.45F, 0F, -0.05F, 0.2F, 0F, -0.05F, 0.2F, 0F, 0.1F, 0.45F, 0F, 0.05F, -2.15F, 0F, -0.45F, -0.15F, 0F, -0.45F, -0.15F, 0F, 0.05F, -2.15F, 0F); // Box 200
        gunModel[197].setRotationPoint(6.5F, -35.5F, -1.5F);

        gunModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.45F, -0.05F, 0F, -0.1F, -1.55F, 0F, -0.1F, -1.55F, 0F, -0.45F, -0.05F, 0F, -0.1F, 0.05F, 0F, -0.05F, 1.85F, 0F, -0.05F, 1.85F, 0F, -0.1F, 0.05F, 0F); // Box 201
        gunModel[198].setRotationPoint(4.5F, -37.5F, -1.5F);

        gunModel[199].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -0.2F, 0.65F, 0F, 0.45F, -0.05F, 0F, 0.45F, -0.05F, 0F, -0.2F, 0.65F, 0F, -0.2F, -1.2F, 0F, 0.1F, 0.05F, 0F, 0.1F, 0.05F, 0F, -0.2F, -1.2F, 0F); // Box 202
        gunModel[199].setRotationPoint(1.5F, -37.5F, -1.5F);

        gunModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0.15F, -0.25F, -0.15F, 0.15F, -0.25F, -0.15F, 0.15F, -0.25F, -0.15F, 0.15F, -0.25F, -0.15F, 0.15F, -0.25F, -0.15F, 0.15F, -0.25F, -0.15F, 0.15F, -0.25F, -0.15F, 0.15F, -0.25F, -0.15F); // Box 203
        gunModel[200].setRotationPoint(-5.5F, -10.2F, -4.5F);

        gunModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, -0.2F, 0.15F, -0.15F, -0.2F, 0.15F, -0.15F, -0.2F, 0.15F, -0.15F, -0.2F, 0.15F, -0.15F, 0.15F, -0.75F, -0.15F, 0.15F, -0.75F, -0.15F, 0.15F, -0.75F, -0.15F, 0.15F, -0.75F, -0.15F); // Box 204
        gunModel[201].setRotationPoint(-5.5F, -10.2F, -4.5F);

        gunModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0.15F, -0.75F, -0.15F, 0.15F, -0.75F, -0.15F, 0.15F, -0.75F, -0.15F, 0.15F, -0.75F, -0.15F, -0.2F, 0.15F, -0.15F, -0.2F, 0.15F, -0.15F, -0.2F, 0.15F, -0.15F, -0.2F, 0.15F, -0.15F); // Box 205
        gunModel[202].setRotationPoint(-5.5F, -10.2F, -4.5F);

        gunModel[203].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0.45F, 0.25F, -0.1F, 0.25F, 0.25F, -0.1F, 0.25F, 0.25F, -0.1F, 0.45F, 0.25F, -0.1F, 0.65F, 0.25F, -0.1F, 0.25F, 0.25F, -0.1F, 0.25F, 0.25F, -0.1F, 0.65F, 0.25F, -0.1F); // Box 206
        gunModel[203].setRotationPoint(9.5F, -37.5F, 2.5F);

        gunModel[204].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.4F, 0.3F, -0.1F, -0.7F, 0.3F, -0.1F, -0.7F, 0.3F, -0.1F, 0.4F, 0.3F, -0.1F, 0.45F, -0.25F, -0.1F, 0.25F, -0.25F, -0.1F, 0.25F, -0.25F, -0.1F, 0.45F, -0.25F, -0.1F); // Box 207
        gunModel[204].setRotationPoint(9.5F, -38.5F, 2.5F);

        gunModel[205].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, -0.35F, 0F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, 0F, -0.1F, -0.35F, 0F, -0.1F, 1.2F, 0.15F, -0.1F, 0.25F, 0.15F, -0.1F, 0.25F, 0.15F, -0.1F, 1.2F, 0.15F, -0.1F); // Box 208
        gunModel[205].setRotationPoint(8.5F, -34.25F, 2.5F);

        gunModel[206].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0.2F, -0.15F, -0.1F, 0.25F, -0.15F, -0.1F, 0.25F, -0.15F, -0.1F, 0.2F, -0.15F, -0.1F, 0.2F, 0.25F, -0.1F, 0.25F, 0.25F, -0.1F, 0.25F, 0.25F, -0.1F, 0.2F, 0.25F, -0.1F); // Box 209
        gunModel[206].setRotationPoint(7.5F, -32.25F, 2.5F);

        gunModel[207].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0.2F, -0.25F, -0.1F, 0.25F, -0.25F, -0.1F, 0.25F, -0.25F, -0.1F, 0.2F, -0.25F, -0.1F, 0.2F, 0.4F, -0.1F, -0.65F, 0.4F, -0.1F, -0.65F, 0.4F, -0.1F, 0.2F, 0.4F, -0.1F); // Box 210
        gunModel[207].setRotationPoint(7.5F, -30.25F, 2.5F);

        gunModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.45F, 0.4F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.45F, 0.4F, 0F, -0.45F, 0.35F, 0F, 0.1F, 0.35F, 0F, 0.1F, 0.35F, 0F, -0.45F, 0.35F, 0F); // Box 211
        gunModel[208].setRotationPoint(11.5F, -33.25F, 2.85F);

        gunModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.45F, 0.35F, 0F, 0.1F, 0.35F, 0F, 0.1F, 0.35F, 0F, -0.45F, 0.35F, 0F, -0.45F, 0.4F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.45F, 0.4F, 0F); // Box 212
        gunModel[209].setRotationPoint(11.5F, -31.55F, 2.85F);

        gunModel[210].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, -0.4F, 0F, -0.05F, 0.4F, 0F, -0.05F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.9F, 0F, -0.05F, 0.1F, 0F, -0.05F, 0.1F, 0F, 0F, -0.9F, 0F); // Box 213
        gunModel[210].setRotationPoint(9F, -33.25F, 2.85F);

        gunModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.35F, -0.15F, 0F, 0.35F, -0.15F, 0F, 0.35F, -0.15F, 0F, 0.35F, -0.15F, 0F, 0.35F, -0.15F, 0F, 0.35F, -0.15F, 0F, 0.35F, -0.15F, 0F, 0.35F, -0.15F, 0F); // Box 215
        gunModel[211].setRotationPoint(11.25F, -32.4F, 3F);

        gunModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, 0.35F, 0F, -0.15F, 0.35F, 0F, -0.15F, 0.35F, 0F, -0.15F, 0.35F, 0F, 0.35F, -0.85F, 0F, 0.35F, -0.85F, 0F, 0.35F, -0.85F, 0F, 0.35F, -0.85F, 0F); // Box 216
        gunModel[212].setRotationPoint(11.25F, -32.4F, 3F);

        gunModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.35F, -0.85F, 0F, 0.35F, -0.85F, 0F, 0.35F, -0.85F, 0F, 0.35F, -0.85F, 0F, -0.15F, 0.35F, 0F, -0.15F, 0.35F, 0F, -0.15F, 0.35F, 0F, -0.15F, 0.35F, 0F); // Box 217
        gunModel[213].setRotationPoint(11.25F, -32.4F, 3F);

        gunModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.2F, 0F, -0.25F, -1.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F); // Box 435
        gunModel[214].setRotationPoint(16F, -39F, 3.2F);

        gunModel[215].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0.95F, -0.25F, 0.25F, 0.95F); // Box 436
        gunModel[215].setRotationPoint(16F, -38F, 3.2F);

        gunModel[216].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.05F, -0.25F, 0.25F, -0.05F, -0.25F, -0.55F, 0F, -0.25F, -0.55F, 0F, -0.25F, -0.55F, -0.05F, -0.25F, -0.55F, -0.05F); // Box 437
        gunModel[216].setRotationPoint(16F, -34.5F, 3.2F);

        gunModel[217].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, -0.25F, 0.55F, 0F, -0.25F, 0.55F, 0F, -0.25F, 0.55F, -0.05F, -0.25F, 0.55F, -0.05F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, -3F, -0.25F, -0.15F, -3F); // Box 438
        gunModel[217].setRotationPoint(16F, -31.5F, 3.2F);

        gunModel[218].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, -0.25F, 0.25F, -0.05F, -0.25F, 0.25F, -0.05F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.55F, -0.05F, -0.25F, -0.55F, -0.05F, -0.25F, -0.55F, 0F, -0.25F, -0.55F, 0F); // Box 439
        gunModel[218].setRotationPoint(16F, -34.5F, -6.2F);

        gunModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, -0.25F, 0.55F, -0.05F, -0.25F, 0.55F, -0.05F, -0.25F, 0.55F, 0F, -0.25F, 0.55F, 0F, -0.25F, -0.15F, -3F, -0.25F, -0.15F, -3F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F); // Box 440
        gunModel[219].setRotationPoint(16F, -31.5F, -6.2F);

        gunModel[220].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, 0.25F, 0.95F, -0.25F, 0.25F, 0.95F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 441
        gunModel[220].setRotationPoint(16F, -38F, -5.2F);

        gunModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, -1.2F, 0F, -0.25F, -1.2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F); // Box 442
        gunModel[221].setRotationPoint(16F, -39F, -5.2F);

        gunModel[222].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 443
        gunModel[222].setRotationPoint(10.2F, -44.8F, 0.3F);

        gunModel[223].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 444
        gunModel[223].setRotationPoint(10.2F, -44.8F, -1.3F);


        ammoModel = new ModelRendererTurbo[30];
        ammoModel[0] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 392
        ammoModel[1] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 393
        ammoModel[2] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 395
        ammoModel[3] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 396
        ammoModel[4] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 397
        ammoModel[5] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 398
        ammoModel[6] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 399
        ammoModel[7] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 400
        ammoModel[8] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 401
        ammoModel[9] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 402
        ammoModel[10] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 403
        ammoModel[11] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 404
        ammoModel[12] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 405
        ammoModel[13] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 406
        ammoModel[14] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 407
        ammoModel[15] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 414
        ammoModel[16] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 415
        ammoModel[17] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 416
        ammoModel[18] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 423
        ammoModel[19] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 424
        ammoModel[20] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 425
        ammoModel[21] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 426
        ammoModel[22] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 427
        ammoModel[23] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 428
        ammoModel[24] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 429
        ammoModel[25] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 430
        ammoModel[26] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 431
        ammoModel[27] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 432
        ammoModel[28] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 433
        ammoModel[29] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 434

        ammoModel[0].addShapeBox(-1F, 0F, 36F, 15, 2, 3, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 392
        ammoModel[0].setRotationPoint(18.3F, -39.1F, -35.15F);

        ammoModel[1].addShapeBox(-1F, 0F, 36F, 15, 2, 3, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F); // Box 393
        ammoModel[1].setRotationPoint(18.3F, -40.1F, -35.15F);

        ammoModel[2].addShapeBox(-1F, 2F, 36F, 15, 2, 3, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 395
        ammoModel[2].setRotationPoint(18.3F, -40.1F, -35.15F);

        ammoModel[3].addShapeBox(-1F, 0F, 36F, 15, 2, 3, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 396
        ammoModel[3].setRotationPoint(18.3F, -39.1F, -40.25F);

        ammoModel[4].addShapeBox(-1F, 0F, 36F, 15, 2, 3, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F); // Box 397
        ammoModel[4].setRotationPoint(18.3F, -40.1F, -40.25F);

        ammoModel[5].addShapeBox(-1F, 2F, 36F, 15, 2, 3, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 398
        ammoModel[5].setRotationPoint(18.3F, -40.1F, -40.25F);

        ammoModel[6].addShapeBox(-1F, 0F, 36F, 15, 2, 3, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 399
        ammoModel[6].setRotationPoint(18.3F, -34.1F, -41.7F);

        ammoModel[7].addShapeBox(-1F, 0F, 36F, 15, 2, 3, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F); // Box 400
        ammoModel[7].setRotationPoint(18.3F, -35.1F, -41.7F);

        ammoModel[8].addShapeBox(-1F, 2F, 36F, 15, 2, 3, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 401
        ammoModel[8].setRotationPoint(18.3F, -35.1F, -41.7F);

        ammoModel[9].addShapeBox(-1F, 0F, 36F, 15, 2, 3, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 402
        ammoModel[9].setRotationPoint(18.3F, -34.1F, -33.4F);

        ammoModel[10].addShapeBox(-1F, 0F, 36F, 15, 2, 3, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F); // Box 403
        ammoModel[10].setRotationPoint(18.3F, -35.1F, -33.4F);

        ammoModel[11].addShapeBox(-1F, 2F, 36F, 15, 2, 3, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 404
        ammoModel[11].setRotationPoint(18.3F, -35.1F, -33.4F);

        ammoModel[12].addShapeBox(-1F, 0F, 36F, 15, 2, 3, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 405
        ammoModel[12].setRotationPoint(18.3F, -31.15F, -37.5F);

        ammoModel[13].addShapeBox(-1F, 0F, 36F, 15, 2, 3, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F); // Box 406
        ammoModel[13].setRotationPoint(18.3F, -32.15F, -37.5F);

        ammoModel[14].addShapeBox(-1F, 2F, 36F, 15, 2, 3, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 407
        ammoModel[14].setRotationPoint(18.3F, -32.15F, -37.5F);

        ammoModel[15].addShapeBox(-1F, 2F, 36F, 1, 2, 3, 0F, -0.625F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, -0.625F, -0.75F, 0.75F, -0.625F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, -0.625F, 0.25F, -0.75F); // Box 414
        ammoModel[15].setRotationPoint(17.3F, -40.1F, -35.15F);

        ammoModel[16].addShapeBox(-1F, 0F, 36F, 1, 2, 3, 0F, -0.625F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, -0.625F, -0.25F, 0.75F, -0.625F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, -0.625F, -0.25F, 0.75F); // Box 415
        ammoModel[16].setRotationPoint(17.3F, -39.1F, -35.15F);

        ammoModel[17].addShapeBox(-1F, 0F, 36F, 1, 2, 3, 0F, -0.625F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, -0.625F, 0.25F, -0.75F, -0.625F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, -0.625F, -0.75F, 0.75F); // Box 416
        ammoModel[17].setRotationPoint(17.3F, -40.1F, -35.15F);

        ammoModel[18].addShapeBox(-1F, 0F, 36F, 1, 2, 3, 0F, -0.625F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, -0.625F, -0.25F, 0.75F, -0.625F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, -0.625F, -0.25F, 0.75F); // Box 423
        ammoModel[18].setRotationPoint(17.3F, -34.1F, -33.4F);

        ammoModel[19].addShapeBox(-1F, 2F, 36F, 1, 2, 3, 0F, -0.625F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, -0.625F, -0.75F, 0.75F, -0.625F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, -0.625F, 0.25F, -0.75F); // Box 424
        ammoModel[19].setRotationPoint(17.3F, -35.1F, -33.4F);

        ammoModel[20].addShapeBox(-1F, 0F, 36F, 1, 2, 3, 0F, -0.625F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, -0.625F, 0.25F, -0.75F, -0.625F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, -0.625F, -0.75F, 0.75F); // Box 425
        ammoModel[20].setRotationPoint(17.3F, -35.1F, -33.4F);

        ammoModel[21].addShapeBox(-1F, 0F, 36F, 1, 2, 3, 0F, -0.625F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, -0.625F, -0.25F, 0.75F, -0.625F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, -0.625F, -0.25F, 0.75F); // Box 426
        ammoModel[21].setRotationPoint(17.3F, -31.15F, -37.5F);

        ammoModel[22].addShapeBox(-1F, 2F, 36F, 1, 2, 3, 0F, -0.625F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, -0.625F, -0.75F, 0.75F, -0.625F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, -0.625F, 0.25F, -0.75F); // Box 427
        ammoModel[22].setRotationPoint(17.3F, -32.15F, -37.5F);

        ammoModel[23].addShapeBox(-1F, 0F, 36F, 1, 2, 3, 0F, -0.625F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, -0.625F, 0.25F, -0.75F, -0.625F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, -0.625F, -0.75F, 0.75F); // Box 428
        ammoModel[23].setRotationPoint(17.3F, -32.15F, -37.5F);

        ammoModel[24].addShapeBox(-1F, 0F, 36F, 1, 2, 3, 0F, -0.625F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, -0.625F, -0.25F, 0.75F, -0.625F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, -0.625F, -0.25F, 0.75F); // Box 429
        ammoModel[24].setRotationPoint(17.3F, -34.1F, -41.7F);

        ammoModel[25].addShapeBox(-1F, 2F, 36F, 1, 2, 3, 0F, -0.625F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, -0.625F, -0.75F, 0.75F, -0.625F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, -0.625F, 0.25F, -0.75F); // Box 430
        ammoModel[25].setRotationPoint(17.3F, -35.1F, -41.7F);

        ammoModel[26].addShapeBox(-1F, 0F, 36F, 1, 2, 3, 0F, -0.625F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, -0.625F, 0.25F, -0.75F, -0.625F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, -0.625F, -0.75F, 0.75F); // Box 431
        ammoModel[26].setRotationPoint(17.3F, -35.1F, -41.7F);

        ammoModel[27].addShapeBox(-1F, 0F, 36F, 1, 2, 3, 0F, -0.625F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, -0.625F, -0.25F, 0.75F, -0.625F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, -0.625F, -0.25F, 0.75F); // Box 432
        ammoModel[27].setRotationPoint(17.3F, -39.1F, -40.25F);

        ammoModel[28].addShapeBox(-1F, 0F, 36F, 1, 2, 3, 0F, -0.625F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, -0.625F, 0.25F, -0.75F, -0.625F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, -0.625F, -0.75F, 0.75F); // Box 433
        ammoModel[28].setRotationPoint(17.3F, -40.1F, -40.25F);

        ammoModel[29].addShapeBox(-1F, 2F, 36F, 1, 2, 3, 0F, -0.625F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, -0.625F, -0.75F, 0.75F, -0.625F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, -0.625F, 0.25F, -0.75F); // Box 434
        ammoModel[29].setRotationPoint(17.3F, -40.1F, -40.25F);


        revolverBarrelModel = new ModelRendererTurbo[5];
        revolverBarrelModel[0] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 218
        revolverBarrelModel[1] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 387
        revolverBarrelModel[2] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 388
        revolverBarrelModel[3] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 389
        revolverBarrelModel[4] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 390

        revolverBarrelModel[0].addShapeBox(-1F, 0F, 0F, 21, 1, 8, 0F, -0.3F, 0.15F, -0.1F, -0.1F, 0.15F, -0.1F, -0.1F, 0.15F, -0.1F, -0.3F, 0.15F, -0.1F, -0.3F, 0.55F, -2.4F, -0.1F, 0.55F, -2.4F, -0.1F, 0.55F, -2.4F, -0.3F, 0.55F, -2.4F); // Box 218
        revolverBarrelModel[0].setRotationPoint(18F, -29F, -4F);

        revolverBarrelModel[1].addShapeBox(-1F, 0F, 0F, 21, 2, 10, 0F, -0.3F, -0.15F, 1.25F, -0.1F, -0.15F, 1.25F, -0.1F, -0.15F, 1.25F, -0.3F, -0.15F, 1.25F, -0.3F, -0.15F, -1.1F, -0.1F, -0.15F, -1.1F, -0.1F, -0.15F, -1.1F, -0.3F, -0.15F, -1.1F); // Box 387
        revolverBarrelModel[1].setRotationPoint(18F, -31F, -5F);

        revolverBarrelModel[2].addShapeBox(-1F, 0F, 0F, 21, 3, 12, 0F, -0.3F, -0.15F, 1.2F, -0.1F, -0.15F, 1.2F, -0.1F, -0.15F, 1.2F, -0.3F, -0.15F, 1.2F, -0.3F, 0.15F, 0.25F, -0.1F, 0.15F, 0.25F, -0.1F, 0.15F, 0.25F, -0.3F, 0.15F, 0.25F); // Box 388
        revolverBarrelModel[2].setRotationPoint(18F, -34F, -6F);

        revolverBarrelModel[3].addShapeBox(-1F, 0F, 0F, 21, 5, 12, 0F, -0.3F, 0.25F, -0.55F, -0.1F, 0.25F, -0.55F, -0.1F, 0.25F, -0.55F, -0.3F, 0.25F, -0.55F, -0.3F, 0.15F, 1.2F, -0.1F, 0.15F, 1.2F, -0.1F, 0.15F, 1.2F, -0.3F, 0.15F, 1.2F); // Box 389
        revolverBarrelModel[3].setRotationPoint(18F, -39F, -6F);

        revolverBarrelModel[4].addShapeBox(-1F, 0F, 0F, 21, 2, 10, 0F, -0.3F, 0.15F, -2.15F, -0.1F, 0.15F, -2.15F, -0.1F, 0.15F, -2.15F, -0.3F, 0.15F, -2.15F, -0.3F, -0.25F, 0.45F, -0.1F, -0.25F, 0.45F, -0.1F, -0.25F, 0.45F, -0.3F, -0.25F, 0.45F); // Box 390
        revolverBarrelModel[4].setRotationPoint(18F, -41F, -5F);

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
        fancyStance = true;
        stanceTranslate = new Vector3f(0.4D, -0.1D, 0.2D);
        stanceRotate = new Vector3f(0.0F, 0.0F, 45.0F);

        crouchZoom = -0.25F;
        ShakeDistance = 1.3F;

        //修正模型位移
        Vector3f vec3 = new Vector3f(0F, 25F, 0F);
        translateAll(vec3.x, -vec3.y, vec3.z);
        Vector3f attVec = new Vector3f(vec3.x / 16F, vec3.y / 16F, vec3.z / 16F);
        barrelAttachPoint = Vector3f.add(barrelAttachPoint, attVec, null);
        gadgetAttachPoint = Vector3f.add(gadgetAttachPoint, attVec, null);
        scopeAttachPoint = Vector3f.add(scopeAttachPoint, attVec, null);
        gripAttachPoint = Vector3f.add(gripAttachPoint, attVec, null);
        stockAttachPoint = Vector3f.add(stockAttachPoint, attVec, null);
        zoomOffsetY = -0.04F;

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