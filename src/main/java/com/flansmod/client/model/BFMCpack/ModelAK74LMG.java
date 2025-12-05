//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AK74M
// Model Creator: 
// Created on: 22.07.2022 - 00:10:05
// Last changed on: 22.07.2022 - 00:10:05

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelAK74LMG extends ModelGun //Same as Filename
{
    int textureX = 256;
    int textureY = 256;

    public ModelAK74LMG() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[433];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // 01
        gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // 02
        gunModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // 03
        gunModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // 04
        gunModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // 05
        gunModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // 06
        gunModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // 07
        gunModel[7] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // 08
        gunModel[8] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // 09
        gunModel[9] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // 10
        gunModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // 12
        gunModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // 14
        gunModel[12] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // 15
        gunModel[13] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // 16
        gunModel[14] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // 17
        gunModel[15] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // 18
        gunModel[16] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // 19
        gunModel[17] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // 20
        gunModel[18] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // 21
        gunModel[19] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // 22
        gunModel[20] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // 23
        gunModel[21] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // 24
        gunModel[22] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // 25
        gunModel[23] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // 26
        gunModel[24] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // 27
        gunModel[25] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // 28
        gunModel[26] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // 29
        gunModel[27] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // 30
        gunModel[28] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // 31
        gunModel[29] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // 32
        gunModel[30] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // 33
        gunModel[31] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // 34
        gunModel[32] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // 35
        gunModel[33] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // 36
        gunModel[34] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // 37
        gunModel[35] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // 38
        gunModel[36] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // 39
        gunModel[37] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // 40
        gunModel[38] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // 41
        gunModel[39] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // 42
        gunModel[40] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // 43
        gunModel[41] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // 44
        gunModel[42] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // 45
        gunModel[43] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // 47
        gunModel[44] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // 48
        gunModel[45] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // 49
        gunModel[46] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // 50
        gunModel[47] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // 51
        gunModel[48] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // 52
        gunModel[49] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // 53
        gunModel[50] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // 54
        gunModel[51] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // 55
        gunModel[52] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // 56
        gunModel[53] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // 57
        gunModel[54] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // 58
        gunModel[55] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // 59
        gunModel[56] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // 60
        gunModel[57] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // 61
        gunModel[58] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // 62
        gunModel[59] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // 63
        gunModel[60] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // 64
        gunModel[61] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // 65
        gunModel[62] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // 66
        gunModel[63] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // 67
        gunModel[64] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // 68
        gunModel[65] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // 69
        gunModel[66] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // 70
        gunModel[67] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // 71
        gunModel[68] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // 72
        gunModel[69] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // 73
        gunModel[70] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // 74
        gunModel[71] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // 75
        gunModel[72] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // 76
        gunModel[73] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // 77
        gunModel[74] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // 78
        gunModel[75] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // 79
        gunModel[76] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // 80
        gunModel[77] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // 81
        gunModel[78] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // 82
        gunModel[79] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // 83
        gunModel[80] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // 84
        gunModel[81] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // 85
        gunModel[82] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // 86
        gunModel[83] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // 87
        gunModel[84] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // 88
        gunModel[85] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // 89
        gunModel[86] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // 90
        gunModel[87] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // 91
        gunModel[88] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // 92
        gunModel[89] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // 93
        gunModel[90] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // 94
        gunModel[91] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // 95
        gunModel[92] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // 96
        gunModel[93] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // 97
        gunModel[94] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // 98
        gunModel[95] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // 99
        gunModel[96] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // 100
        gunModel[97] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // 101
        gunModel[98] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // 102
        gunModel[99] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // 103
        gunModel[100] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // 104
        gunModel[101] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // 105
        gunModel[102] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // 106
        gunModel[103] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // 107
        gunModel[104] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // 108
        gunModel[105] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // 109
        gunModel[106] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // 110
        gunModel[107] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // 111
        gunModel[108] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // 112
        gunModel[109] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // 113
        gunModel[110] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // 114
        gunModel[111] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // 115
        gunModel[112] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // 116
        gunModel[113] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // 117
        gunModel[114] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // 118
        gunModel[115] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // 119
        gunModel[116] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // 120
        gunModel[117] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // 121
        gunModel[118] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // 122
        gunModel[119] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // 123
        gunModel[120] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // 124
        gunModel[121] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // 125
        gunModel[122] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // 126
        gunModel[123] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // 127
        gunModel[124] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // 128
        gunModel[125] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // 129
        gunModel[126] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // 130
        gunModel[127] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // 133
        gunModel[128] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // 134
        gunModel[129] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // 135
        gunModel[130] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // 136
        gunModel[131] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // 137
        gunModel[132] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // 138
        gunModel[133] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // 139
        gunModel[134] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // 140
        gunModel[135] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // 141
        gunModel[136] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // 147
        gunModel[137] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // 148
        gunModel[138] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // 149
        gunModel[139] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // 150
        gunModel[140] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // 151
        gunModel[141] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // 152
        gunModel[142] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // 153
        gunModel[143] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // 154
        gunModel[144] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // 155
        gunModel[145] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // 156
        gunModel[146] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // 157
        gunModel[147] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // 158
        gunModel[148] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // 159
        gunModel[149] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // 160
        gunModel[150] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // 161
        gunModel[151] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // 162
        gunModel[152] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // 163
        gunModel[153] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // 164
        gunModel[154] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // 165
        gunModel[155] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // 166
        gunModel[156] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // 167
        gunModel[157] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // 168
        gunModel[158] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // 169
        gunModel[159] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // 170
        gunModel[160] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // 171
        gunModel[161] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // 172
        gunModel[162] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // 173
        gunModel[163] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // 174
        gunModel[164] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // 175
        gunModel[165] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // 176
        gunModel[166] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // 177
        gunModel[167] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // 178
        gunModel[168] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // 179
        gunModel[169] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // 180
        gunModel[170] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // 181
        gunModel[171] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // 182
        gunModel[172] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // 183
        gunModel[173] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // 184
        gunModel[174] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // 185
        gunModel[175] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // 186
        gunModel[176] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // 187
        gunModel[177] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // 188
        gunModel[178] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // 189
        gunModel[179] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // 190
        gunModel[180] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // 191
        gunModel[181] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // 192
        gunModel[182] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // 193
        gunModel[183] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // 194
        gunModel[184] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // 195
        gunModel[185] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // 196
        gunModel[186] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // 197
        gunModel[187] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // 198
        gunModel[188] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // 199
        gunModel[189] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // 200
        gunModel[190] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // 201
        gunModel[191] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // 202
        gunModel[192] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // 203
        gunModel[193] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // 204
        gunModel[194] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // 205
        gunModel[195] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // 206
        gunModel[196] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // 207
        gunModel[197] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // 208
        gunModel[198] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // 209
        gunModel[199] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // 210
        gunModel[200] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // 211
        gunModel[201] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // 212
        gunModel[202] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // 213
        gunModel[203] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // 234
        gunModel[204] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // 235
        gunModel[205] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // 236
        gunModel[206] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // 237
        gunModel[207] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // 238
        gunModel[208] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // 239
        gunModel[209] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // 240
        gunModel[210] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // 241
        gunModel[211] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // 242
        gunModel[212] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // 243
        gunModel[213] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // 244
        gunModel[214] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // 245
        gunModel[215] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // 246
        gunModel[216] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // 247
        gunModel[217] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // 249
        gunModel[218] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // 250
        gunModel[219] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // 251
        gunModel[220] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // 252
        gunModel[221] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // 253
        gunModel[222] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // 254
        gunModel[223] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // 255
        gunModel[224] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // 256
        gunModel[225] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // 257
        gunModel[226] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // 258
        gunModel[227] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // 259
        gunModel[228] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // 260
        gunModel[229] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // 261
        gunModel[230] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // 262
        gunModel[231] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // 263
        gunModel[232] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // 264
        gunModel[233] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // 265
        gunModel[234] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // 266
        gunModel[235] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // 267
        gunModel[236] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // 268
        gunModel[237] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // 269
        gunModel[238] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // 270
        gunModel[239] = new ModelRendererTurbo(this, 2, 105, textureX, textureY); // 271
        gunModel[240] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 272
        gunModel[241] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 273
        gunModel[242] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 274
        gunModel[243] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 275
        gunModel[244] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 276
        gunModel[245] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 277
        gunModel[246] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 278
        gunModel[247] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 279
        gunModel[248] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 280
        gunModel[249] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 281
        gunModel[250] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 282
        gunModel[251] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 283
        gunModel[252] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 284
        gunModel[253] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 285
        gunModel[254] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 286
        gunModel[255] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 287
        gunModel[256] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 288
        gunModel[257] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 289
        gunModel[258] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 290
        gunModel[259] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 291
        gunModel[260] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 292
        gunModel[261] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 293
        gunModel[262] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 294
        gunModel[263] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 295
        gunModel[264] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 296
        gunModel[265] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 297
        gunModel[266] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 298
        gunModel[267] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 299
        gunModel[268] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 300
        gunModel[269] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // 301
        gunModel[270] = new ModelRendererTurbo(this, 43, 113, textureX, textureY); // Import
        gunModel[271] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[272] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import
        gunModel[273] = new ModelRendererTurbo(this, 212, 94, textureX, textureY); // Import
        gunModel[274] = new ModelRendererTurbo(this, 212, 94, textureX, textureY); // Import
        gunModel[275] = new ModelRendererTurbo(this, 212, 94, textureX, textureY); // Import
        gunModel[276] = new ModelRendererTurbo(this, 212, 94, textureX, textureY); // Import
        gunModel[277] = new ModelRendererTurbo(this, 212, 94, textureX, textureY); // Import
        gunModel[278] = new ModelRendererTurbo(this, 212, 94, textureX, textureY); // Import
        gunModel[279] = new ModelRendererTurbo(this, 212, 94, textureX, textureY); // Import
        gunModel[280] = new ModelRendererTurbo(this, 212, 94, textureX, textureY); // Import
        gunModel[281] = new ModelRendererTurbo(this, 212, 94, textureX, textureY); // Import
        gunModel[282] = new ModelRendererTurbo(this, 189, 114, textureX, textureY); // Import
        gunModel[283] = new ModelRendererTurbo(this, 88, 111, textureX, textureY); // Import
        gunModel[284] = new ModelRendererTurbo(this, 212, 94, textureX, textureY); // Import
        gunModel[285] = new ModelRendererTurbo(this, 212, 94, textureX, textureY); // Import
        gunModel[286] = new ModelRendererTurbo(this, 212, 94, textureX, textureY); // Import
        gunModel[287] = new ModelRendererTurbo(this, 212, 94, textureX, textureY); // Import
        gunModel[288] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Import
        gunModel[289] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Import
        gunModel[290] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Import
        gunModel[291] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Import
        gunModel[292] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Import
        gunModel[293] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Import
        gunModel[294] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Import
        gunModel[295] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Import
        gunModel[296] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Import
        gunModel[297] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Import
        gunModel[298] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Import
        gunModel[299] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Import
        gunModel[300] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Import
        gunModel[301] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Import
        gunModel[302] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Import
        gunModel[303] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Import
        gunModel[304] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Import
        gunModel[305] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Import
        gunModel[306] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Import
        gunModel[307] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Import
        gunModel[308] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Import
        gunModel[309] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Import
        gunModel[310] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Import
        gunModel[311] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Import
        gunModel[312] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Import
        gunModel[313] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Import
        gunModel[314] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Import
        gunModel[315] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Import
        gunModel[316] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Import
        gunModel[317] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Import
        gunModel[318] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Import
        gunModel[319] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Import
        gunModel[320] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Import
        gunModel[321] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Import
        gunModel[322] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Import
        gunModel[323] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Import
        gunModel[324] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Import
        gunModel[325] = new ModelRendererTurbo(this, 212, 94, textureX, textureY); // Import
        gunModel[326] = new ModelRendererTurbo(this, 212, 94, textureX, textureY); // Import
        gunModel[327] = new ModelRendererTurbo(this, 212, 94, textureX, textureY); // Import
        gunModel[328] = new ModelRendererTurbo(this, 212, 94, textureX, textureY); // Import
        gunModel[329] = new ModelRendererTurbo(this, 212, 94, textureX, textureY); // Import
        gunModel[330] = new ModelRendererTurbo(this, 212, 94, textureX, textureY); // Import
        gunModel[331] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[332] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[333] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[334] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[335] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[336] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[337] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[338] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[339] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[340] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[341] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[342] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[343] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[344] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[345] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[346] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[347] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[348] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[349] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[350] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[351] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[352] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[353] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[354] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[355] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[356] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[357] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[358] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[359] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[360] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[361] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[362] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[363] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[364] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[365] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[366] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[367] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[368] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[369] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[370] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[371] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[372] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[373] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[374] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[375] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[376] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[377] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[378] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[379] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[380] = new ModelRendererTurbo(this, 8, 120, textureX, textureY); // Import
        gunModel[381] = new ModelRendererTurbo(this, 43, 113, textureX, textureY); // Import
        gunModel[382] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[383] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[384] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[385] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[386] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[387] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[388] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[389] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[390] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[391] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[392] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[393] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[394] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[395] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[396] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[397] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[398] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[399] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[400] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[401] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[402] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[403] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[404] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[405] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[406] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[407] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[408] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[409] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[410] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[411] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[412] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[413] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[414] = new ModelRendererTurbo(this, 10, 170, textureX, textureY); // Import
        gunModel[415] = new ModelRendererTurbo(this, 216, 104, textureX, textureY); // Import
        gunModel[416] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[417] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[418] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[419] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[420] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[421] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[422] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[423] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[424] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[425] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[426] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[427] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[428] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[429] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[430] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[431] = new ModelRendererTurbo(this, 11, 160, textureX, textureY); // Import
        gunModel[432] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // 115

        gunModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.4F, -0.35F, 0.0F, -0.4F, -0.35F, 0.0F, -0.4F, -0.35F, 0.0F, -0.4F, -0.35F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F); // 01
        gunModel[0].setRotationPoint(14.6F, -5.6F, -0.5F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.35F, -0.7F, 0.0F, -0.35F, -0.7F, 0.0F, -0.35F, -0.2F, 0.0F, -0.35F, -0.2F, 0.0F, -0.35F, -0.7F, 0.0F, -0.35F, -0.7F, 0.0F, -0.35F, -0.2F, 0.0F, -0.35F, -0.2F); // 02
        gunModel[1].setRotationPoint(14.6F, -5.4F, -0.5F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F); // 03
        gunModel[2].setRotationPoint(10.8F, -5F, -0.5F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // 04
        gunModel[3].setRotationPoint(14.2F, -5F, -0.5F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 4F, -0.35F, -0.46F, 1F, -0.35F, -0.46F, 1F, -0.35F, -0.46F, 4F, -0.35F, -0.46F, 4F, -0.5F, -0.46F, 1F, -0.5F, -0.46F, 1F, -0.5F, -0.46F, 4F, -0.5F, -0.46F); // 05
        gunModel[4].setRotationPoint(8.6F, -4.9F, -0.5F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, 0.1F, -0.4F, -0.35F, 0.1F, -0.4F, -0.35F, 0.1F, -0.4F, -0.35F, 0.1F, -0.4F, -0.35F, 0.1F, -0.4F, -0.35F); // 06
        gunModel[5].setRotationPoint(11.3F, -5.8F, -0.5F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, -0.8F, -0.1F, -0.1F, -0.8F, -0.6F, 0.1F, 0.0F, -0.6F, 0.1F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F); // 07
        gunModel[6].setRotationPoint(8.1F, -6.2F, -0.5F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, -0.8F, 0.1F, 0.1F, -0.8F, -0.65F, 0.1F, 0.0F, -0.65F, 0.1F, 0.0F, -0.65F, 0.1F, -0.8F, -0.65F, 0.1F); // 08
        gunModel[7].setRotationPoint(8.1F, -5.7F, -0.5F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.6F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.6F, -0.1F, 0.0F, -0.6F, -0.6F, 0.15F, 0.0F, -0.6F, 0.15F, 0.0F, -0.6F, 0.15F, -0.6F, -0.6F, 0.15F); // 09
        gunModel[8].setRotationPoint(5.9F, -6.2F, -0.5F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.6F, 0.5F, 0.15F, 0.0F, 0.5F, 0.15F, 0.0F, 0.5F, 0.15F, -0.6F, 0.5F, 0.15F, -0.6F, -1.05F, 0.15F, 0.0F, -1.05F, 0.15F, 0.0F, -1.05F, 0.15F, -0.6F, -1.05F, 0.15F); // 10
        gunModel[9].setRotationPoint(5.9F, -5.3F, -0.5F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0.5F, 0.1F, 0.0F, 0.5F, 0.1F, 0.0F, 0.5F, 0.1F, -0.8F, 0.5F, 0.1F, -0.8F, -1.0F, 0.1F, 0.0F, -1.0F, 0.1F, 0.0F, -1.0F, 0.1F, -0.8F, -1.0F, 0.1F); // 12
        gunModel[10].setRotationPoint(5.5F, -5.3F, -0.5F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1.1F, 0.85F, 0.0F, -0.1F, 0.85F, 0.0F, -0.1F, 0.85F, 0.0F, -1.1F, 0.85F, 0.0F, -1.1F, -1.0F, 0.0F, -0.1F, -1.0F, 0.0F, -0.1F, -1.0F, 0.0F, -1.1F, -1.0F, 0.0F); // 14
        gunModel[11].setRotationPoint(3.3F, -5.3F, -0.5F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1.5F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, -0.45F, -1.5F, 0.3F, -0.45F, -1.3F, -1.05F, -0.5F, -0.1F, -1.05F, -0.5F, -0.1F, -1.05F, -0.45F, -1.3F, -1.05F, -0.45F); // 15
        gunModel[12].setRotationPoint(4.3F, -6.1F, -1F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1.5F, 0.3F, -0.45F, -0.3F, 0.3F, -0.45F, -0.3F, 0.3F, -0.5F, -1.5F, 0.3F, -0.5F, -1.3F, -1.05F, -0.45F, -0.1F, -1.05F, -0.45F, -0.1F, -1.05F, -0.5F, -1.3F, -1.05F, -0.5F); // 16
        gunModel[13].setRotationPoint(4.3F, -6.1F, 0F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1.1F, 0.3F, -0.05F, -0.3F, 0.2F, -0.05F, -0.3F, 0.2F, -0.05F, -1.1F, 0.3F, -0.05F, -1.0F, -1.2F, -0.05F, -0.3F, -1.1F, -0.05F, -0.3F, -1.1F, -0.05F, -1.0F, -1.2F, -0.05F); // 17
        gunModel[14].setRotationPoint(3.3F, -6.1F, -0.5F);

        gunModel[15].addShapeBox(0F, -1.1F, 0F, 2, 1, 1, 0F, -1.45F, -1.1F, -0.35F, -0.25F, -1.1F, -0.35F, -0.25F, -1.1F, -0.35F, -1.45F, -1.1F, -0.35F, -1.55F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -1.55F, 0.2F, -0.35F); // 18
        gunModel[15].setRotationPoint(3.3F, -6.25F, -1.1F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1.55F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -1.55F, 0.2F, -0.35F, -1.45F, -1.1F, -0.35F, -0.25F, -1.1F, -0.35F, -0.25F, -1.1F, -0.35F, -1.45F, -1.1F, -0.35F); // 19
        gunModel[16].setRotationPoint(3.3F, -6.25F, -1.1F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1.55F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -1.55F, 0.2F, -0.35F, -1.45F, -1.1F, -0.35F, -0.25F, -1.1F, -0.35F, -0.25F, -1.1F, -0.35F, -1.45F, -1.1F, -0.35F); // 20
        gunModel[17].setRotationPoint(3.3F, -6.25F, 0.1F);

        gunModel[18].addShapeBox(0F, -1.1F, 0F, 2, 1, 1, 0F, -1.45F, -1.1F, -0.35F, -0.25F, -1.1F, -0.35F, -0.25F, -1.1F, -0.35F, -1.45F, -1.1F, -0.35F, -1.55F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -1.55F, 0.2F, -0.35F); // 21
        gunModel[18].setRotationPoint(3.3F, -6.25F, 0.1F);

        gunModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -1.55F, 0.1F, -0.55F, -0.35F, 0.1F, -0.55F, -0.35F, 0.1F, -0.55F, -1.55F, 0.1F, -0.55F, -1.55F, -1.05F, -0.55F, -0.35F, -1.05F, -0.55F, -0.35F, -1.05F, -0.55F, -1.55F, -1.05F, -0.55F); // 22
        gunModel[19].setRotationPoint(4.3F, -6.25F, -1F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.8F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.8F, -0.4F, 0.0F, 0.8F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.8F, -0.4F, 0.0F); // 23
        gunModel[20].setRotationPoint(4F, -4.9F, -0.5F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F); // 24
        gunModel[21].setRotationPoint(1.9F, -5.3F, -0.5F);

        gunModel[22].addShapeBox(-0.2F, -2.5F, 0F, 1, 1, 1, 0F, 0.9F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.9F, -0.5F, 0.0F, 0.8F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.8F, -0.4F, 0.0F); // 25
        gunModel[22].setRotationPoint(4.2F, -2.6F, -0.5F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.0F, -0.4F, 0.0F, 0.2F, -0.4F, 0.0F, 0.2F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.3F, 0.0F, 0.2F, -0.5F, 0.0F, 0.2F, -0.5F, 0.0F, 0.0F, -0.3F, 0.0F); // 26
        gunModel[23].setRotationPoint(1.8F, -4.6F, -0.5F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1.55F, 0.2F, -0.45F, -0.35F, 0.2F, -0.45F, -0.35F, 0.2F, -0.45F, -1.55F, 0.2F, -0.45F, -1.45F, -1.1F, -0.45F, -0.25F, -1.1F, -0.45F, -0.25F, -1.1F, -0.45F, -1.45F, -1.1F, -0.45F); // 27
        gunModel[24].setRotationPoint(0F, -4.1F, 0F);

        gunModel[25].addShapeBox(0F, -1.1F, 0F, 2, 1, 1, 0F, -1.45F, -1.1F, -0.45F, -0.25F, -1.1F, -0.45F, -0.25F, -1.1F, -0.45F, -1.45F, -1.1F, -0.45F, -1.55F, 0.2F, -0.45F, -0.35F, 0.2F, -0.45F, -0.35F, 0.2F, -0.45F, -1.55F, 0.2F, -0.45F); // 28
        gunModel[25].setRotationPoint(0F, -4.1F, 0F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1.45F, 0.1F, -0.45F, -0.25F, 0.1F, -0.45F, -0.25F, 0.1F, -0.45F, -1.45F, 0.1F, -0.45F, -1.45F, -1.0F, -0.45F, -0.25F, -1.0F, -0.45F, -0.25F, -1.0F, -0.45F, -1.45F, -1.0F, -0.45F); // 29
        gunModel[26].setRotationPoint(0F, -4.1F, 0F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1.45F, 0.1F, -0.45F, -0.25F, 0.1F, -0.45F, -0.25F, 0.1F, -0.45F, -1.45F, 0.1F, -0.45F, -1.45F, -1.0F, -0.45F, -0.25F, -1.0F, -0.45F, -0.25F, -1.0F, -0.45F, -1.45F, -1.0F, -0.45F); // 30
        gunModel[27].setRotationPoint(-0.5F, -4.2F, 0F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1.55F, 0.2F, -0.45F, -0.35F, 0.2F, -0.45F, -0.35F, 0.2F, -0.45F, -1.55F, 0.2F, -0.45F, -1.45F, -1.1F, -0.45F, -0.25F, -1.1F, -0.45F, -0.25F, -1.1F, -0.45F, -1.45F, -1.1F, -0.45F); // 31
        gunModel[28].setRotationPoint(-0.5F, -4.2F, 0F);

        gunModel[29].addShapeBox(0F, -1.1F, 0F, 2, 1, 1, 0F, -1.45F, -1.1F, -0.45F, -0.25F, -1.1F, -0.45F, -0.25F, -1.1F, -0.45F, -1.45F, -1.1F, -0.45F, -1.55F, 0.2F, -0.45F, -0.35F, 0.2F, -0.45F, -0.35F, 0.2F, -0.45F, -1.55F, 0.2F, -0.45F); // 32
        gunModel[29].setRotationPoint(-0.5F, -4.2F, 0F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1.55F, 0.2F, -0.45F, -0.35F, 0.2F, -0.45F, -0.35F, 0.2F, -0.45F, -1.55F, 0.2F, -0.45F, -1.45F, -1.1F, -0.45F, -0.25F, -1.1F, -0.45F, -0.25F, -1.1F, -0.45F, -1.45F, -1.1F, -0.45F); // 33
        gunModel[30].setRotationPoint(-1.5F, -4.1F, 0F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1.45F, 0.1F, -0.45F, -0.25F, 0.1F, -0.45F, -0.25F, 0.1F, -0.45F, -1.45F, 0.1F, -0.45F, -1.45F, -1.0F, -0.45F, -0.25F, -1.0F, -0.45F, -0.25F, -1.0F, -0.45F, -1.45F, -1.0F, -0.45F); // 34
        gunModel[31].setRotationPoint(-1.5F, -4.1F, 0F);

        gunModel[32].addShapeBox(0F, -1.1F, 0F, 2, 1, 1, 0F, -1.45F, -1.1F, -0.45F, -0.25F, -1.1F, -0.45F, -0.25F, -1.1F, -0.45F, -1.45F, -1.1F, -0.45F, -1.55F, 0.2F, -0.45F, -0.35F, 0.2F, -0.45F, -0.35F, 0.2F, -0.45F, -1.55F, 0.2F, -0.45F); // 35
        gunModel[32].setRotationPoint(-1.5F, -4.1F, 0F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.7F, 0.0F, -0.2F, -0.7F, 0.0F, -0.2F, -0.7F, 0.0F, -0.2F, -0.7F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F); // 36
        gunModel[33].setRotationPoint(1F, -4.6F, -0.5F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.1F, -0.2F, 0.2F, -0.1F, -0.2F, 0.2F, -0.1F, -0.2F, 0.2F, -0.1F, -0.2F, 0.2F, -0.1F); // 37
        gunModel[34].setRotationPoint(1F, -4.5F, -0.5F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.8F, -0.1F, -0.2F, -0.8F, -0.1F, -0.2F, -0.8F, -0.1F, -0.2F, -0.8F, -0.1F, -0.2F, 0.0F, -0.1F, -0.4F, 0.0F, -0.1F, -0.4F, 0.0F, -0.1F, -0.2F, 0.0F, -0.1F); // 38
        gunModel[35].setRotationPoint(1F, -4.1F, -0.5F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.8F, -0.1F, -0.05F, 0.5F, -0.1F, -0.05F, 0.5F, -0.05F, -0.05F, -0.8F, -0.05F, -0.05F, -0.8F, -0.1F, -0.05F, 0.5F, -0.1F, -0.05F, 0.5F, -0.1F, -0.05F, -0.8F, -0.1F, -0.05F); // 39
        gunModel[36].setRotationPoint(1.5F, -5.1F, -0.5F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, -0.05F, 0.1F, 0.0F); // 40
        gunModel[37].setRotationPoint(-2.2F, -5F, -0.5F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.25F, -0.3F, -0.3F, 0.25F, -0.3F, -0.3F, 0.25F, -0.3F, -0.5F, 0.25F, -0.3F, -0.4F, -1.1F, -0.3F, -0.4F, -1.1F, -0.3F, -0.4F, -1.1F, -0.3F, -0.4F, -1.1F, -0.3F); // 41
        gunModel[38].setRotationPoint(-2.4F, -5.5F, -0.5F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0.1F, -0.3F, -0.4F, 0.1F, -0.3F, -0.4F, 0.1F, -0.3F, -0.4F, 0.1F, -0.3F, -0.4F, -0.85F, -0.3F, -0.4F, -0.85F, -0.3F, -0.4F, -0.85F, -0.3F, -0.4F, -0.85F, -0.3F); // 42
        gunModel[39].setRotationPoint(-2.4F, -5.5F, -0.5F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.45F, -0.35F, 0.0F, -0.45F, -0.35F, 0.0F, -0.45F, -0.35F, 0.0F, -0.45F, -0.35F, 0.0F, -0.4F, -0.35F, 0.0F, -0.4F, -0.35F, 0.0F, -0.4F, -0.35F, 0.0F, -0.4F, -0.35F); // 43
        gunModel[40].setRotationPoint(14.6F, -5.7F, -0.5F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.2F, -0.3F, 0.0F, -0.2F, -0.3F, 0.0F, -0.2F, -0.3F, -0.8F, -0.2F, -0.3F, -0.8F, -0.7F, -0.1F, 0.0F, -0.7F, -0.1F, 0.0F, -0.7F, -0.1F, -0.8F, -0.7F, -0.1F); // 44
        gunModel[41].setRotationPoint(8.1F, -6.4F, -0.5F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.6F, -0.15F, -0.3F, 0.0F, -0.15F, -0.3F, 0.0F, -0.15F, -0.3F, -0.6F, -0.15F, -0.3F, -0.6F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, -0.6F, -0.7F, 0.0F); // 45
        gunModel[42].setRotationPoint(5.9F, -6.4F, -0.5F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.15F, -0.75F, -0.2F, -0.2F, -0.75F, -0.2F, -0.2F, -0.75F, -0.55F, 0.15F, -0.75F, -0.55F, 0.4F, 0.05F, -0.1F, -0.6F, 0.05F, -0.1F, -0.6F, 0.05F, -0.55F, 0.4F, 0.05F, -0.55F); // 47
        gunModel[43].setRotationPoint(-1.4F, -6.75F, -0.5F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.1F, -0.85F, -0.1F, -0.1F, -0.85F, -0.1F, -0.1F, -0.85F, -0.55F, -0.1F, -0.85F, -0.55F, 0.0F, 0.0F, 0.05F, -0.1F, 0.0F, 0.05F, -0.1F, 0.0F, -0.55F, 0.0F, 0.0F, -0.55F); // 48
        gunModel[44].setRotationPoint(-1.9F, -6.55F, -0.5F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.2F, -0.9F, -0.35F, 0.0F, -0.9F, -0.35F, 0.0F, -0.9F, -0.35F, -0.2F, -0.9F, -0.35F, -0.05F, 0.05F, -0.2F, 0.0F, 0.05F, -0.2F, 0.0F, 0.05F, -0.2F, -0.05F, 0.05F, -0.2F); // 49
        gunModel[45].setRotationPoint(-1.6F, -7.05F, -0.5F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.85F, -0.05F, -0.4F, -0.85F, -0.05F, -0.4F, -0.85F, -0.05F, -0.4F, -0.85F, -0.05F, -0.4F, 0.0F, 0.05F, -0.4F, 0.0F, 0.05F, -0.4F, 0.0F, 0.05F, -0.4F, 0.0F, 0.05F); // 50
        gunModel[46].setRotationPoint(-0.4F, -6.55F, -0.5F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.7F, -0.15F, -0.4F, -0.7F, -0.15F, -0.4F, -0.7F, -0.15F, -0.4F, -0.7F, -0.15F, -0.4F, 0.0F, -0.05F, -0.4F, 0.0F, -0.05F, -0.4F, 0.0F, -0.05F, -0.4F, 0.0F, -0.05F); // 51
        gunModel[47].setRotationPoint(-0.4F, -6.7F, -0.5F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, -0.35F, -0.4F, -0.8F, -0.35F, -0.4F, -0.8F, -0.35F, -0.4F, -0.8F, -0.35F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F); // 52
        gunModel[48].setRotationPoint(-0.4F, -7F, -0.5F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.85F, -0.05F, -0.4F, -0.85F, -0.05F, -0.4F, -0.85F, -0.05F, -0.4F, -0.85F, -0.05F, -0.4F, 0.0F, 0.05F, -0.4F, 0.0F, 0.05F, -0.4F, 0.0F, 0.05F, -0.4F, 0.0F, 0.05F); // 53
        gunModel[49].setRotationPoint(1.3F, -6.55F, -0.5F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.7F, -0.15F, -0.4F, -0.7F, -0.15F, -0.4F, -0.7F, -0.15F, -0.4F, -0.7F, -0.15F, -0.4F, 0.0F, -0.05F, -0.4F, 0.0F, -0.05F, -0.4F, 0.0F, -0.05F, -0.4F, 0.0F, -0.05F); // 54
        gunModel[50].setRotationPoint(1.3F, -6.7F, -0.5F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, -0.35F, -0.4F, -0.8F, -0.35F, -0.4F, -0.8F, -0.35F, -0.4F, -0.8F, -0.35F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F); // 55
        gunModel[51].setRotationPoint(1.3F, -7F, -0.5F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.85F, -0.9F, -0.4F, -0.85F, -0.9F, -0.4F, -0.85F, -0.05F, -0.4F, -0.85F, -0.05F, -0.4F, 0.0F, -1.0F, -0.4F, 0.0F, -1.0F, -0.4F, 0.0F, 0.05F, -0.4F, 0.0F, 0.05F); // 56
        gunModel[52].setRotationPoint(3F, -6.55F, -0.5F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.7F, -0.8F, -0.4F, -0.7F, -0.8F, -0.4F, -0.7F, -0.15F, -0.4F, -0.7F, -0.15F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.05F, -0.4F, 0.0F, -0.05F); // 57
        gunModel[53].setRotationPoint(3F, -6.7F, -0.5F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, -0.35F, -0.4F, -0.8F, -0.35F, -0.4F, -0.8F, -0.35F, -0.4F, -0.8F, -0.35F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F); // 58
        gunModel[54].setRotationPoint(3F, -7F, -0.5F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.1F, -0.8F, 0.05F, 0.0F, -0.8F, 0.05F, 0.0F, -0.8F, 0.05F, -0.1F, -0.8F, 0.05F, -0.05F, -0.1F, 0.05F, 0.0F, -0.1F, 0.05F, 0.0F, -0.1F, 0.05F, -0.05F, -0.1F, 0.05F); // 59
        gunModel[55].setRotationPoint(-2F, -6.35F, -0.5F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.05F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.15F, -0.05F, -0.75F, -0.15F, 0.2F, 0.05F, -0.5F, 0.0F, 0.05F, -0.5F, 0.0F, 0.05F, -0.05F, 0.2F, 0.05F, -0.05F); // 60
        gunModel[56].setRotationPoint(-1.6F, -6.75F, -0.55F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.2F, -0.4F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.3F, -0.45F, -0.25F, 0.0F, -0.45F, -0.25F, 0.0F, -0.45F, -0.15F, 0.3F, -0.45F, -0.15F); // 61
        gunModel[57].setRotationPoint(-1.6F, -6.1F, -0.3F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.0F, 0.1F, -0.25F, 0.0F, 0.1F, -0.25F, 0.0F, 0.1F, -0.15F, 0.0F, 0.1F, -0.15F, 0.0F, -0.55F, -0.25F, 0.0F, -0.55F, -0.25F, 0.0F, -0.55F, -0.15F, 0.0F, -0.55F, -0.15F); // 62
        gunModel[58].setRotationPoint(-0.6F, -5.45F, -0.3F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0.0F, 0.05F, -0.2F, 0.0F, 0.05F, -0.2F, 0.0F, 0.05F, -0.2F, 0.0F, 0.05F, -0.2F, -0.6F, 0.05F, -0.2F, -0.6F, 0.05F, -0.2F, -0.6F, 0.05F, -0.2F, -0.6F, 0.05F); // 63
        gunModel[59].setRotationPoint(4.2F, -5.4F, -0.5F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, -0.9F, 0.6F, 0.0F, -0.9F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.9F, -1.0F, 0.0F); // 64
        gunModel[60].setRotationPoint(5.3F, -5.3F, -0.5F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.8F, -0.6F, 0.0F); // 65
        gunModel[61].setRotationPoint(5.3F, -6.3F, -0.5F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.15F, -0.5F, 0.05F, -0.2F, -0.5F, 0.05F, -0.2F, -0.5F, 0.05F, 0.15F, -0.5F, 0.05F, 0.15F, -0.45F, 0.05F, -0.3F, -0.45F, 0.05F, -0.3F, -0.45F, 0.05F, 0.15F, -0.45F, 0.05F); // 66
        gunModel[62].setRotationPoint(-2F, -5.55F, -0.5F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.05F, -0.7F, 0.05F, 0.15F, -0.7F, 0.05F, 0.15F, -0.7F, 0.05F, -0.05F, -0.7F, 0.05F, 0.0F, -0.2F, 0.05F, 0.0F, -0.2F, 0.05F, 0.0F, -0.2F, 0.05F, 0.0F, -0.2F, 0.05F); // 67
        gunModel[63].setRotationPoint(-2F, -6.15F, -0.5F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.6F, 0.05F, 0.0F, -0.6F, 0.05F, 0.0F, -0.6F, 0.05F, 0.0F, -0.6F, 0.05F, 0.15F, -0.1F, 0.05F, -0.2F, -0.1F, 0.05F, -0.2F, -0.1F, 0.05F, 0.15F, -0.1F, 0.05F); // 68
        gunModel[64].setRotationPoint(-2F, -5.95F, -0.5F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0.1F, -0.35F, -0.2F, 0.1F, -0.35F, -0.2F, 0.1F, -0.35F, -0.3F, 0.1F, -0.35F, -0.1F, -0.6F, -0.35F, -0.2F, -0.6F, -0.35F, -0.2F, -0.6F, -0.35F, -0.1F, -0.6F, -0.35F); // 69
        gunModel[65].setRotationPoint(14.7F, -6.1F, -0.5F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, -0.4F, -0.35F, 0.1F, -0.4F, -0.35F, 0.1F, -0.4F, -0.35F, -0.9F, -0.4F, -0.35F, -0.7F, -0.15F, -0.35F, 0.1F, -0.15F, -0.35F, 0.1F, -0.15F, -0.35F, -0.7F, -0.15F, -0.35F); // 70
        gunModel[66].setRotationPoint(13.9F, -6.1F, -0.5F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, 0.1F, -0.35F, 0.0F, 0.1F, -0.35F, 0.0F, 0.1F, -0.35F, -0.9F, 0.1F, -0.35F, -0.9F, -0.15F, -0.35F, 0.0F, -0.15F, -0.35F, 0.0F, -0.15F, -0.35F, -0.9F, -0.15F, -0.35F); // 71
        gunModel[67].setRotationPoint(14.6F, -6.1F, -0.5F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.15F, -0.2F, -0.45F, -0.15F, -0.2F, -0.4F, -0.75F, -0.2F, -0.4F, -0.75F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.45F, -0.6F, -0.2F, -0.45F, -0.6F); // 72
        gunModel[68].setRotationPoint(14.8F, -6.85F, -0.5F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.35F, -0.15F, -0.2F, -0.35F, -0.15F, -0.2F, -0.4F, -0.75F, -0.2F, -0.4F, -0.75F, -0.2F, -0.35F, -0.15F, -0.2F, -0.35F, -0.15F, -0.2F, -0.4F, -0.75F, -0.2F, -0.4F, -0.75F); // 73
        gunModel[69].setRotationPoint(14.8F, -7.05F, -0.5F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.4F, -0.75F, -0.2F, -0.4F, -0.75F, -0.2F, -0.45F, -0.15F, -0.2F, -0.45F, -0.15F, -0.2F, -0.45F, -0.6F, -0.2F, -0.45F, -0.6F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F); // 74
        gunModel[70].setRotationPoint(14.8F, -6.85F, -0.5F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F); // 75
        gunModel[71].setRotationPoint(14.8F, -6.9F, -0.5F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F); // 76
        gunModel[72].setRotationPoint(14.9F, -6.9F, -0.5F);

        gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, -0.65F, -0.3F, -0.45F, -0.65F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.2F, -0.4F, -0.75F, -0.2F, -0.4F, -0.75F, -0.2F, -0.45F, -0.15F, -0.2F, -0.45F, -0.15F); // 77
        gunModel[73].setRotationPoint(14.8F, -7.25F, -0.5F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.4F, -0.75F, -0.2F, -0.4F, -0.75F, -0.2F, -0.35F, -0.15F, -0.2F, -0.35F, -0.15F, -0.2F, -0.4F, -0.75F, -0.2F, -0.4F, -0.75F, -0.2F, -0.35F, -0.15F, -0.2F, -0.35F, -0.15F); // 78
        gunModel[74].setRotationPoint(14.8F, -7.05F, -0.5F);

        gunModel[75].addShapeBox(-0.2F, -2.5F, 0F, 1, 1, 1, 0F, -1.4F, -1.5F, -0.35F, 0.5F, -1.5F, -0.35F, 0.5F, -1.5F, -0.35F, -1.4F, -1.5F, -0.35F, -1.4F, 0.5F, -0.35F, 0.5F, 0.6F, -0.35F, 0.5F, 0.6F, -0.35F, -1.4F, 0.5F, -0.35F); // 79
        gunModel[75].setRotationPoint(14.2F, -4.7F, -0.5F);

        gunModel[76].addShapeBox(-0.2F, 0F, 0F, 1, 1, 1, 0F, -1.4F, 0.5F, -0.35F, 0.5F, 0.6F, -0.35F, 0.5F, 0.6F, -0.35F, -1.4F, 0.5F, -0.35F, -1.4F, -1.5F, -0.35F, 0.5F, -1.5F, -0.35F, 0.5F, -1.5F, -0.35F, -1.4F, -1.5F, -0.35F); // 80
        gunModel[76].setRotationPoint(14.2F, -4.75F, -0.5F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0.6F, -0.35F, -1.4F, 0.5F, -0.35F, -1.4F, 0.5F, -0.35F, 0.5F, 0.6F, -0.35F, 0.5F, -1.5F, -0.35F, -1.4F, -1.5F, -0.35F, -1.4F, -1.5F, -0.35F, 0.5F, -1.5F, -0.35F); // 81
        gunModel[77].setRotationPoint(15.5F, -4.75F, -0.5F);

        gunModel[78].addShapeBox(0F, -2.5F, 0F, 1, 1, 1, 0F, 0.5F, -1.5F, -0.35F, -1.4F, -1.5F, -0.35F, -1.4F, -1.5F, -0.35F, 0.5F, -1.5F, -0.35F, 0.5F, 0.6F, -0.35F, -1.4F, 0.5F, -0.35F, -1.4F, 0.5F, -0.35F, 0.5F, 0.6F, -0.35F); // 82
        gunModel[78].setRotationPoint(15.5F, -4.7F, -0.5F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.45F, -0.65F, -0.3F, -0.45F, -0.65F, -0.2F, -0.45F, -0.15F, -0.2F, -0.45F, -0.15F, -0.2F, -0.4F, -0.75F, -0.2F, -0.4F, -0.75F); // 83
        gunModel[79].setRotationPoint(14.8F, -7.25F, -0.5F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1.0F, 0.35F, -0.3F, -0.9F, 0.35F, -0.3F, -0.9F, 0.35F, -0.35F, -1.0F, 0.35F, -0.35F, -1.0F, -1.2F, -0.3F, -0.9F, -1.2F, -0.3F, -0.9F, -1.2F, -0.35F, -1.0F, -1.2F, -0.35F); // 84
        gunModel[80].setRotationPoint(3.3F, -6.2F, -0.2F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1.0F, 0.35F, -0.35F, -0.9F, 0.35F, -0.35F, -0.9F, 0.35F, -0.3F, -1.0F, 0.35F, -0.3F, -1.0F, -1.2F, -0.35F, -0.9F, -1.2F, -0.35F, -0.9F, -1.2F, -0.3F, -1.0F, -1.2F, -0.3F); // 85
        gunModel[81].setRotationPoint(3.3F, -6.2F, -0.8F);

        gunModel[82].addShapeBox(0F, -1.1F, 0F, 1, 1, 1, 0F, -0.35F, -1.1F, -0.35F, -0.35F, -1.1F, -0.35F, -0.35F, -1.1F, -0.35F, -0.35F, -1.1F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F); // 86
        gunModel[82].setRotationPoint(4.4F, -6.35F, 0.1F);

        gunModel[83].addShapeBox(0F, -1.1F, 0F, 1, 1, 1, 0F, -0.35F, -1.1F, -0.35F, -0.35F, -1.1F, -0.35F, -0.35F, -1.1F, -0.35F, -0.35F, -1.1F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F); // 87
        gunModel[83].setRotationPoint(4.4F, -6.35F, -1.1F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.05F, -0.45F, -0.45F, -0.05F, -0.45F, -0.45F, -0.05F, -0.4F, -0.45F, -0.05F, -0.45F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, -0.45F, -0.5F, -0.05F); // 88
        gunModel[84].setRotationPoint(1.13F, -3.75F, -0.5F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, -0.45F, -0.5F, -0.05F, -0.4F, -0.45F, -0.05F, -0.45F, -0.45F, -0.05F, -0.45F, -0.45F, -0.05F, -0.4F, -0.45F, -0.05F); // 89
        gunModel[85].setRotationPoint(1.13F, -3.9F, -0.5F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.05F, -0.45F, -0.45F, -0.05F, -0.45F, -0.45F, -0.05F, -0.4F, -0.45F, -0.05F, -0.4F, -0.5F, -0.05F, -0.45F, -0.5F, -0.05F, -0.45F, -0.5F, -0.05F, -0.4F, -0.5F, -0.05F); // 90
        gunModel[86].setRotationPoint(1.13F, -3.8F, -0.5F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.4F, -0.5F, 0.05F); // 91
        gunModel[87].setRotationPoint(-2.4F, -5.3F, -0.5F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.5F, 0.05F, -0.5F, -0.5F, 0.05F, -0.5F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.4F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F); // 92
        gunModel[88].setRotationPoint(-2.4F, -5.4F, -0.5F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.45F, -0.5F, 0.05F, -0.5F, -0.5F, 0.05F, -0.5F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F); // 93
        gunModel[89].setRotationPoint(-2.4F, -5.25F, -0.5F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.2F, -0.3F, 0.0F, -0.2F, -0.3F, 0.0F, -0.2F, -0.3F, -0.8F, -0.2F, -0.3F, -0.8F, -0.7F, -0.1F, 0.0F, -0.7F, -0.1F, 0.0F, -0.7F, -0.1F, -0.8F, -0.7F, -0.1F); // 94
        gunModel[90].setRotationPoint(5.5F, -6.4F, -0.5F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, -0.8F, -0.1F, -0.1F, -0.8F, -0.6F, 0.1F, 0.0F, -0.6F, 0.1F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F); // 95
        gunModel[91].setRotationPoint(5.5F, -6.2F, -0.5F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, -0.45F, -0.3F, 0.05F, -0.45F, -0.3F, 0.05F, -0.45F, -0.3F, 0.05F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F); // 96
        gunModel[92].setRotationPoint(-0.1F, -3.4F, -0.5F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.05F, -0.55F, -0.3F, -0.8F, -0.4F, -0.3F, -0.8F, -0.4F, -0.3F, -0.05F, -0.55F, -0.3F, -0.1F, -0.35F, -0.3F, -0.7F, -0.55F, -0.3F, -0.7F, -0.55F, -0.3F, -0.1F, -0.35F, -0.3F); // 97
        gunModel[93].setRotationPoint(0.9F, -3.5F, -0.5F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.0F, -0.3F, -0.4F, 0.0F, -0.3F, -0.4F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, -0.5F, -0.1F, -0.3F, -0.4F, -0.05F, -0.3F, -0.4F, -0.05F, -0.3F, -0.5F, -0.1F, -0.3F); // 98
        gunModel[94].setRotationPoint(0.6F, -4F, -0.5F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F); // 99
        gunModel[95].setRotationPoint(1.2F, -3.7F, -0.5F);

        gunModel[96].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F); // 100
        gunModel[96].setRotationPoint(14.89F, -7.05F, -1.5F);

        gunModel[97].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F); // 101
        gunModel[97].setRotationPoint(3.84F, -7F, -1.35F);

        gunModel[98].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F); // 102
        gunModel[98].setRotationPoint(3.84F, -7F, -1.65F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1.0F, 0.3F, -0.05F, -0.9F, 0.3F, -0.05F, -0.9F, 0.3F, -0.05F, -1.0F, 0.3F, -0.05F, -1.0F, -1.2F, -0.05F, -1.0F, -1.2F, -0.05F, -1.0F, -1.2F, -0.05F, -1.0F, -1.2F, -0.05F); // 103
        gunModel[99].setRotationPoint(3.3F, -6.1F, -0.5F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 5F, -0.35F, -0.55F, 0.0F, -0.35F, -0.55F, 0.0F, -0.25F, -0.4F, 5F, -0.25F, -0.4F, 5F, -0.55F, -0.65F, 0.0F, -0.55F, -0.65F, 0.0F, -0.6F, -0.25F, 5F, -0.6F, -0.25F); // 104
        gunModel[100].setRotationPoint(10F, -5.4F, -0.5F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 5F, -0.45F, -0.65F, 0.0F, -0.45F, -0.65F, 0.0F, -0.4F, -0.25F, 5F, -0.4F, -0.25F, 5F, -0.45F, -0.65F, 0.0F, -0.45F, -0.65F, 0.0F, -0.4F, -0.25F, 5F, -0.4F, -0.25F); // 105
        gunModel[101].setRotationPoint(10F, -5.4F, -0.5F);

        gunModel[102].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 5F, -0.25F, -0.4F, 0.0F, -0.25F, -0.4F, 0.0F, -0.25F, -0.4F, 5F, -0.25F, -0.4F, 5F, -0.65F, -0.45F, 0.0F, -0.65F, -0.45F, 0.0F, -0.65F, -0.45F, 5F, -0.65F, -0.45F); // 106
        gunModel[102].setRotationPoint(10F, -5.4F, -0.5F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 5F, -0.25F, -0.4F, 0.0F, -0.25F, -0.4F, 0.0F, -0.35F, -0.55F, 5F, -0.35F, -0.55F, 5F, -0.6F, -0.25F, 0.0F, -0.6F, -0.25F, 0.0F, -0.55F, -0.65F, 5F, -0.55F, -0.65F); // 107
        gunModel[103].setRotationPoint(10F, -5.4F, -0.5F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 5F, -0.4F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.45F, -0.65F, 5F, -0.45F, -0.65F, 5F, -0.4F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.45F, -0.65F, 5F, -0.45F, -0.65F); // 108
        gunModel[104].setRotationPoint(10F, -5.4F, -0.5F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 5F, -0.6F, -0.25F, 0.0F, -0.6F, -0.25F, 0.0F, -0.55F, -0.65F, 5F, -0.55F, -0.65F, 5F, -0.25F, -0.4F, 0.0F, -0.25F, -0.4F, 0.0F, -0.35F, -0.55F, 5F, -0.35F, -0.55F); // 109
        gunModel[105].setRotationPoint(10F, -5.4F, -0.5F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 5F, -0.65F, -0.45F, 0.0F, -0.65F, -0.45F, 0.0F, -0.65F, -0.45F, 5F, -0.65F, -0.45F, 5F, -0.25F, -0.4F, 0.0F, -0.25F, -0.4F, 0.0F, -0.25F, -0.4F, 5F, -0.25F, -0.4F); // 110
        gunModel[106].setRotationPoint(10F, -5.4F, -0.5F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 5F, -0.55F, -0.65F, 0.0F, -0.55F, -0.65F, 0.0F, -0.6F, -0.25F, 5F, -0.6F, -0.25F, 5F, -0.35F, -0.55F, 0.0F, -0.35F, -0.55F, 0.0F, -0.25F, -0.4F, 5F, -0.25F, -0.4F); // 111
        gunModel[107].setRotationPoint(10F, -5.4F, -0.5F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.35F, -0.2F, 0.0F, -0.35F, -0.2F, 0.0F, -0.35F, -0.7F, 0.0F, -0.35F, -0.7F, 0.0F, -0.35F, -0.2F, 0.0F, -0.35F, -0.2F, 0.0F, -0.35F, -0.7F, 0.0F, -0.35F, -0.7F); // 112
        gunModel[108].setRotationPoint(14.6F, -5.4F, -0.5F);

        gunModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.4F, -0.35F, 0.0F, -0.4F, -0.35F, 0.0F, -0.4F, -0.35F, 0.0F, -0.4F, -0.35F); // 113
        gunModel[109].setRotationPoint(14.6F, -5.2F, -0.5F);

        gunModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.4F, -0.35F, 0.1F, -0.4F, -0.35F, 0.1F, -0.4F, -0.35F, 0.1F, -0.4F, -0.35F, 0.1F, -0.45F, -0.2F, 0.1F, -0.45F, -0.2F, 0.1F, -0.45F, -0.2F, 0.1F, -0.45F, -0.2F); // 114
        gunModel[110].setRotationPoint(11.3F, -5.6F, -0.5F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.35F, -0.2F, 0.1F, -0.35F, -0.2F, 0.1F, -0.35F, -0.7F, 0.1F, -0.35F, -0.7F, 0.1F, -0.35F, -0.2F, 0.1F, -0.35F, -0.2F, 0.1F, -0.35F, -0.7F, 0.1F, -0.35F, -0.7F); // 115
        gunModel[111].setRotationPoint(11.3F, -5.4F, -0.5F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.45F, -0.2F, 0.1F, -0.45F, -0.2F, 0.1F, -0.45F, -0.2F, 0.1F, -0.45F, -0.2F, 0.1F, -0.4F, -0.35F, 0.1F, -0.4F, -0.35F, 0.1F, -0.4F, -0.35F, 0.1F, -0.4F, -0.35F); // 116
        gunModel[112].setRotationPoint(11.3F, -5.2F, -0.5F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.35F, -0.7F, 0.1F, -0.35F, -0.7F, 0.1F, -0.35F, -0.2F, 0.1F, -0.35F, -0.2F, 0.1F, -0.35F, -0.7F, 0.1F, -0.35F, -0.7F, 0.1F, -0.35F, -0.2F, 0.1F, -0.35F, -0.2F); // 117
        gunModel[113].setRotationPoint(11.3F, -5.4F, -0.5F);

        gunModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.4F, -0.35F, -0.1F, -0.4F, -0.35F, -0.1F, -0.4F, -0.35F, 0.0F, -0.4F, -0.35F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F); // 118
        gunModel[114].setRotationPoint(10.7F, -6.4F, -0.5F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.35F, -0.2F, 0.0F, -0.35F, -0.2F, 0.0F, -0.35F, -0.2F, 0.0F, -0.35F, -0.2F, 0.0F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0.0F, -0.35F, -0.2F); // 119
        gunModel[115].setRotationPoint(10.7F, -6.2F, -0.5F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.45F, -0.2F, 0.2F, -0.45F, -0.2F, 0.2F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.4F, -0.35F, 0.3F, -0.4F, -0.35F, 0.3F, -0.4F, -0.35F, 0.0F, -0.4F, -0.35F); // 120
        gunModel[116].setRotationPoint(10.7F, -6F, -0.5F);

        gunModel[117].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.05F, -0.9F, -0.4F, -0.75F, -0.9F, -0.4F, -0.75F, -0.9F, -0.5F, -0.05F, -0.9F, -0.5F, -0.15F, 0.15F, -0.4F, -0.7F, 0.1F, -0.4F, -0.7F, 0.1F, -0.5F, -0.15F, 0.15F, -0.5F); // 121
        gunModel[117].setRotationPoint(-1F, -4.4F, -0.45F);

        gunModel[118].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.05F, -0.6F, -0.4F, -0.7F, -0.6F, -0.4F, -0.7F, -0.6F, -0.5F, -0.05F, -0.6F, -0.5F, -0.05F, -0.2F, -0.4F, -0.75F, -0.2F, -0.4F, -0.75F, -0.2F, -0.5F, -0.05F, -0.2F, -0.5F); // 122
        gunModel[118].setRotationPoint(-1F, -4.3F, -0.45F);

        gunModel[119].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.95F, -0.4F, -0.7F, -0.9F, -0.4F, -0.7F, -0.9F, -0.5F, -0.15F, -0.95F, -0.5F, -0.35F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.5F, -0.35F, 0.1F, -0.5F); // 123
        gunModel[119].setRotationPoint(-1F, -4.2F, -0.45F);

        gunModel[120].addShapeBox(-0.2F, -2.5F, 0F, 1, 1, 1, 0F, 0.8F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.8F, -0.4F, 0.0F, 0.9F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.9F, -0.5F, 0.0F); // 124
        gunModel[120].setRotationPoint(4.2F, -2.2F, -0.5F);

        gunModel[121].addShapeBox(-0.2F, -2.5F, 0F, 1, 1, 1, 0F, 0.0F, -0.4F, 0.0F, -0.5F, -0.4F, 0.0F, -0.5F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // 125
        gunModel[121].setRotationPoint(2F, -2.2F, -0.5F);

        gunModel[122].addShapeBox(-0.2F, -2.5F, 0F, 1, 1, 1, 0F, 0.0F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.4F, 0.0F, -0.5F, -0.4F, 0.0F, -0.5F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F); // 126
        gunModel[122].setRotationPoint(2F, -2.6F, -0.5F);

        gunModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.4F, 0.0F, -0.5F, -0.4F, 0.0F, -0.5F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.5F, -0.4F, 0.0F, -0.5F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F); // 127
        gunModel[123].setRotationPoint(1.8F, -4.9F, -0.5F);

        gunModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.3F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.5F, -0.3F, -0.3F); // 128
        gunModel[124].setRotationPoint(1.2F, -3.5F, -0.5F);

        gunModel[125].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.5F, -0.1F, -0.4F, -0.5F, -0.3F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F); // 129
        gunModel[125].setRotationPoint(-1.3F, -4.3F, -0.45F);

        gunModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.4F, -0.3F, -0.05F, -0.55F, -0.3F, -0.05F, -0.55F, -0.3F, -0.8F, -0.4F, -0.3F, -0.7F, -0.55F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.7F, -0.55F, -0.3F); // 130
        gunModel[126].setRotationPoint(-1.1F, -3.5F, -0.5F);

        gunModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.5F, 0.05F, -0.5F, -0.5F, 0.05F, -0.5F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.4F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F); // 133
        gunModel[127].setRotationPoint(4.3F, -5.4F, -0.5F);

        gunModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.4F, -0.5F, 0.05F); // 134
        gunModel[128].setRotationPoint(4.3F, -5.3F, -0.5F);

        gunModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.45F, -0.5F, 0.05F, -0.5F, -0.5F, 0.05F, -0.5F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F); // 135
        gunModel[129].setRotationPoint(4.3F, -5.25F, -0.5F);

        gunModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.5F, 0.05F, -0.5F, -0.5F, 0.05F, -0.5F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.4F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F); // 136
        gunModel[130].setRotationPoint(3.9F, -5.4F, -0.5F);

        gunModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.4F, -0.5F, 0.05F); // 137
        gunModel[131].setRotationPoint(3.9F, -5.3F, -0.5F);

        gunModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.45F, -0.5F, 0.05F, -0.5F, -0.5F, 0.05F, -0.5F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F); // 138
        gunModel[132].setRotationPoint(3.9F, -5.25F, -0.5F);

        gunModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.5F, 0.05F, -0.5F, -0.5F, 0.05F, -0.5F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.4F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F); // 139
        gunModel[133].setRotationPoint(2.9F, -5F, -0.5F);

        gunModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.4F, -0.5F, 0.05F); // 140
        gunModel[134].setRotationPoint(2.9F, -4.9F, -0.5F);

        gunModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.45F, -0.5F, 0.05F, -0.5F, -0.5F, 0.05F, -0.5F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F); // 141
        gunModel[135].setRotationPoint(2.9F, -4.85F, -0.5F);

        gunModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.25F, -0.4F, 0.0F, -0.25F, -0.4F, 0.0F, -0.25F, -0.4F, 0.0F, -0.25F, -0.4F, 0.0F, -0.6F, -0.25F, 0.0F, -0.6F, -0.25F, 0.0F, -0.6F, -0.25F, 0.0F, -0.6F, -0.25F); // 147
        gunModel[136].setRotationPoint(9F, -6.2F, -0.5F);

        gunModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.4F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.4F, -0.25F); // 148
        gunModel[137].setRotationPoint(9F, -6.2F, -0.5F);

        gunModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.6F, -0.25F, 0.0F, -0.6F, -0.25F, 0.0F, -0.6F, -0.25F, 0.0F, -0.6F, -0.25F, 0.0F, -0.25F, -0.4F, 0.0F, -0.25F, -0.4F, 0.0F, -0.25F, -0.4F, 0.0F, -0.25F, -0.4F); // 149
        gunModel[138].setRotationPoint(9F, -6.2F, -0.5F);

        gunModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.45F, -0.2F, -0.3F, -0.45F, -0.2F, -0.3F, -0.45F, -0.2F, -0.3F, -0.45F, -0.2F); // 150
        gunModel[139].setRotationPoint(8.7F, -6.4F, -0.5F);

        gunModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F); // 151
        gunModel[140].setRotationPoint(8.7F, -6.2F, -0.5F);

        gunModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, -0.2F, -0.3F, -0.45F, -0.2F, -0.3F, -0.45F, -0.2F, -0.3F, -0.45F, -0.2F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F); // 152
        gunModel[141].setRotationPoint(8.7F, -6F, -0.5F);

        gunModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, -0.2F, -0.3F, -0.45F, -0.2F, -0.3F, -0.45F, -0.2F, -0.3F, -0.45F, -0.2F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F); // 153
        gunModel[142].setRotationPoint(8.6F, -5.2F, -0.5F);

        gunModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.45F, -0.2F, -0.3F, -0.45F, -0.2F, -0.3F, -0.45F, -0.2F, -0.3F, -0.45F, -0.2F); // 154
        gunModel[143].setRotationPoint(8.6F, -5.6F, -0.5F);

        gunModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F); // 155
        gunModel[144].setRotationPoint(8.6F, -5.4F, -0.5F);

        gunModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F); // 156
        gunModel[145].setRotationPoint(8.6F, -5.8F, -0.5F);

        gunModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.4F, -0.5F, 0.05F); // 157
        gunModel[146].setRotationPoint(-2.3F, -4.6F, -0.5F);

        gunModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.45F, -0.5F, 0.05F, -0.5F, -0.5F, 0.05F, -0.5F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F); // 158
        gunModel[147].setRotationPoint(-2.3F, -4.55F, -0.5F);

        gunModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.5F, 0.05F, -0.5F, -0.5F, 0.05F, -0.5F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.4F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F); // 159
        gunModel[148].setRotationPoint(-2.3F, -4.7F, -0.5F);

        gunModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.45F, -0.5F, 0.0F, -0.4F, -0.45F, 0.0F, -0.45F, -0.45F, 0.0F, -0.45F, -0.45F, 0.0F, -0.4F, -0.45F, 0.0F); // 160
        gunModel[149].setRotationPoint(-1.7F, -5.2F, -0.55F);

        gunModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.0F, -0.45F, -0.45F, 0.0F, -0.45F, -0.45F, 0.0F, -0.4F, -0.45F, 0.0F, -0.4F, -0.5F, 0.0F, -0.45F, -0.5F, 0.0F, -0.45F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F); // 161
        gunModel[150].setRotationPoint(-1.7F, -5.1F, -0.55F);

        gunModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.0F, -0.45F, -0.45F, 0.0F, -0.45F, -0.45F, 0.0F, -0.4F, -0.45F, 0.0F, -0.45F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.45F, -0.5F, 0.0F); // 162
        gunModel[151].setRotationPoint(-1.7F, -5.05F, -0.55F);

        gunModel[152].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.4F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.4F, -0.25F); // 163
        gunModel[152].setRotationPoint(-0.5F, -5.5F, -0.5F);

        gunModel[153].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.25F, -0.4F, 0.0F, -0.25F, -0.4F, 0.0F, -0.25F, -0.4F, 0.0F, -0.25F, -0.4F, 0.0F, -0.6F, -0.25F, 0.0F, -0.6F, -0.25F, 0.0F, -0.6F, -0.25F, 0.0F, -0.6F, -0.25F); // 164
        gunModel[153].setRotationPoint(-0.5F, -5.5F, -0.5F);

        gunModel[154].addShapeBox(0.7F, -0.5F, -1.1F, 1, 1, 1, 0F, 0.0F, -0.35F, -0.55F, 0.5F, -0.35F, -0.55F, 0.5F, -0.35F, -0.4F, 0.0F, -0.35F, -0.4F, 0.0F, -0.5F, -0.55F, 0.5F, -0.5F, -0.55F, 0.5F, -0.5F, -0.4F, 0.0F, -0.5F, -0.4F); // 165
        gunModel[154].setRotationPoint(-0.7F, -4.6F, 0F);
        gunModel[154].rotateAngleZ = -0.15707964F;

        gunModel[155].addShapeBox(1.7F, -0.5F, -1.1F, 1, 1, 1, 0F, -0.5F, -0.4F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.4F, -0.5F, -0.4F, -0.4F); // 166
        gunModel[155].setRotationPoint(-0.7F, -4.6F, 0F);
        gunModel[155].rotateAngleZ = -0.15707964F;

        gunModel[156].addShapeBox(-0.5F, -0.5F, -1.1F, 1, 1, 1, 0F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F); // 167
        gunModel[156].setRotationPoint(-0.7F, -4.6F, 0F);
        gunModel[156].rotateAngleZ = -0.15707964F;

        gunModel[157].addShapeBox(-0.5F, -0.5F, -1.1F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F, -0.35F, -0.55F, -0.4F, -0.35F, -0.55F, -0.4F, -0.35F, -0.55F, -0.4F, -0.35F, -0.55F, -0.4F); // 168
        gunModel[157].setRotationPoint(-0.7F, -4.6F, 0F);
        gunModel[157].rotateAngleZ = -0.15707964F;

        gunModel[158].addShapeBox(-0.1F, -0.5F, -1.1F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.55F, -0.2F, -0.35F, -0.55F, -0.2F, -0.35F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.5F, -0.55F, -0.2F, -0.5F, -0.55F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F); // 169
        gunModel[158].setRotationPoint(-0.7F, -4.6F, 0F);
        gunModel[158].rotateAngleZ = -0.15707964F;

        gunModel[159].addShapeBox(0.1F, -0.5F, -1.1F, 2, 1, 1, 0F, 0.0F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.4F, 0.0F, -0.5F, -0.4F, 0.0F, -0.25F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.4F, 0.0F, -0.25F, -0.4F); // 170
        gunModel[159].setRotationPoint(-0.7F, -4.6F, 0F);
        gunModel[159].rotateAngleZ = -0.15707964F;

        gunModel[160].addShapeBox(0.1F, -0.5F, -1.1F, 2, 1, 1, 0F, 0.0F, -0.5F, -0.55F, 0.1F, -0.5F, -0.55F, 0.1F, -0.5F, -0.4F, 0.0F, -0.5F, -0.4F, 0.0F, -0.2F, -0.55F, 0.1F, -0.35F, -0.55F, 0.1F, -0.35F, -0.4F, 0.0F, -0.2F, -0.4F); // 171
        gunModel[160].setRotationPoint(-0.7F, -4.6F, 0F);
        gunModel[160].rotateAngleZ = -0.15707964F;

        gunModel[161].addShapeBox(0.7F, -0.5F, -1.1F, 1, 1, 1, 0F, 0.0F, -0.4F, -0.5F, 0.5F, -0.4F, -0.5F, 0.5F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.4F, 0.0F, -0.5F, -0.4F); // 172
        gunModel[161].setRotationPoint(-0.7F, -4.6F, 0F);
        gunModel[161].rotateAngleZ = -0.15707964F;

        gunModel[162].addShapeBox(-0.1F, -0.5F, -1.1F, 1, 1, 1, 0F, -0.2F, -0.25F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F); // 173
        gunModel[162].setRotationPoint(-0.7F, -4.6F, 0F);
        gunModel[162].rotateAngleZ = -0.15707964F;

        gunModel[163].addShapeBox(-0.5F, -0.5F, -1.1F, 1, 1, 1, 0F, -0.2F, -0.4F, -0.55F, -0.6F, -0.2F, -0.55F, -0.6F, -0.2F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.55F, -0.6F, -0.2F, -0.55F, -0.6F, -0.2F, -0.4F, -0.2F, -0.4F, -0.4F); // 174
        gunModel[163].setRotationPoint(-0.7F, -4.6F, 0F);
        gunModel[163].rotateAngleZ = -0.15707964F;

        gunModel[164].addShapeBox(-0.3F, -0.5F, -1.1F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.55F, -0.6F, -0.2F, -0.55F, -0.6F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.55F, -0.6F, -0.2F, -0.55F, -0.6F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F); // 175
        gunModel[164].setRotationPoint(-0.7F, -4.6F, 0F);
        gunModel[164].rotateAngleZ = -0.15707964F;

        gunModel[165].addShapeBox(-0.5F, -0.5F, -1.1F, 1, 1, 1, 0F, -0.25F, -0.6F, -0.45F, -0.25F, -0.6F, -0.45F, -0.25F, -0.6F, -0.45F, -0.25F, -0.6F, -0.45F, -0.4F, -0.25F, -0.45F, -0.4F, -0.25F, -0.45F, -0.4F, -0.25F, -0.45F, -0.4F, -0.25F, -0.45F); // 176
        gunModel[165].setRotationPoint(-0.7F, -4.6F, 0F);
        gunModel[165].rotateAngleZ = -0.15707964F;

        gunModel[166].addShapeBox(-0.5F, -0.5F, -1.1F, 1, 1, 1, 0F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F); // 177
        gunModel[166].setRotationPoint(-0.7F, -4.6F, 0F);
        gunModel[166].rotateAngleZ = -0.15707964F;

        gunModel[167].addShapeBox(-0.5F, -0.5F, -1.1F, 1, 1, 1, 0F, -0.4F, -0.25F, -0.45F, -0.4F, -0.25F, -0.45F, -0.4F, -0.25F, -0.45F, -0.4F, -0.25F, -0.45F, -0.25F, -0.6F, -0.45F, -0.25F, -0.6F, -0.45F, -0.25F, -0.6F, -0.45F, -0.25F, -0.6F, -0.45F); // 178
        gunModel[167].setRotationPoint(-0.7F, -4.6F, 0F);
        gunModel[167].rotateAngleZ = -0.15707964F;

        gunModel[168].addShapeBox(-0.5F, -0.5F, -1.1F, 1, 1, 1, 0F, -0.35F, -0.55F, -0.4F, -0.35F, -0.55F, -0.4F, -0.35F, -0.55F, -0.4F, -0.35F, -0.55F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F); // 179
        gunModel[168].setRotationPoint(-0.7F, -4.6F, 0F);
        gunModel[168].rotateAngleZ = -0.15707964F;

        gunModel[169].addShapeBox(0.7F, -0.5F, -1.1F, 1, 1, 1, 0F, -0.4F, 0.05F, -0.55F, 0.5F, -0.25F, -0.55F, 0.5F, -0.25F, -0.4F, -0.4F, 0.05F, -0.4F, -0.4F, -0.65F, -0.55F, 0.5F, -0.65F, -0.55F, 0.5F, -0.65F, -0.4F, -0.4F, -0.65F, -0.4F); // 180
        gunModel[169].setRotationPoint(-0.7F, -4.6F, 0F);
        gunModel[169].rotateAngleZ = -0.15707964F;

        gunModel[170].addShapeBox(0.6F, -0.5F, -1.1F, 1, 1, 1, 0F, -0.35F, 0.0F, -0.55F, -0.5F, 0.05F, -0.55F, -0.5F, 0.05F, -0.4F, -0.35F, 0.0F, -0.4F, 0.0F, -0.65F, -0.55F, -0.5F, -0.65F, -0.55F, -0.5F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F); // 181
        gunModel[170].setRotationPoint(-0.7F, -4.6F, 0F);
        gunModel[170].rotateAngleZ = -0.15707964F;

        gunModel[171].addShapeBox(1.8F, -0.6F, -1.1F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.55F, -0.4F, -0.4F, -0.55F, -0.4F, -0.4F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.2F, -0.55F, -0.4F, -0.2F, -0.55F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F); // 182
        gunModel[171].setRotationPoint(-0.7F, -4.6F, 0F);
        gunModel[171].rotateAngleZ = -0.15707964F;

        gunModel[172].addShapeBox(2F, -0.6F, -1.1F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.55F, -0.4F, -0.45F, -0.55F, -0.4F, -0.45F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.5F, -0.55F, -0.4F, -0.5F, -0.55F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F); // 183
        gunModel[172].setRotationPoint(-0.7F, -4.6F, 0F);
        gunModel[172].rotateAngleZ = -0.15707964F;

        gunModel[173].addShapeBox(2.2F, -0.5F, -1.1F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.55F, -0.4F, -0.4F, -0.55F, -0.4F, -0.4F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F); // 184
        gunModel[173].setRotationPoint(-0.7F, -4.6F, 0F);
        gunModel[173].rotateAngleZ = -0.15707964F;

        gunModel[174].addShapeBox(2F, -0.4F, -1.1F, 1, 1, 1, 0F, -0.4F, -0.5F, -0.55F, -0.4F, -0.5F, -0.55F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.4F, -0.55F, -0.4F, -0.4F, -0.55F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // 185
        gunModel[174].setRotationPoint(-0.7F, -4.6F, 0F);
        gunModel[174].rotateAngleZ = -0.15707964F;

        gunModel[175].addShapeBox(2.3F, -0.55F, -1.1F, 1, 1, 1, 0F, -0.5F, -0.45F, -0.55F, -0.4F, -0.5F, -0.55F, -0.4F, -0.5F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.4F, -0.55F, -0.4F, -0.45F, -0.55F, -0.4F, -0.45F, -0.4F, -0.5F, -0.4F, -0.4F); // 186
        gunModel[175].setRotationPoint(-0.7F, -4.6F, 0F);
        gunModel[175].rotateAngleZ = -0.15707964F;

        gunModel[176].addShapeBox(2F, -0.35F, -1.1F, 1, 1, 1, 0F, -0.3F, -0.5F, -0.45F, -0.3F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F); // 187
        gunModel[176].setRotationPoint(-0.7F, -4.6F, 0F);
        gunModel[176].rotateAngleZ = -0.15707964F;

        gunModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.1F, -0.459F, -0.5F, -0.1F, -0.459F, -0.5F, -0.1F, -0.459F, -0.45F, -0.1F, -0.459F, -0.45F, -0.1F, -0.459F, -0.5F, -0.1F, -0.459F, -0.5F, -0.1F, -0.459F, -0.45F, -0.1F, -0.459F); // 188
        gunModel[177].setRotationPoint(1.3F, -5F, -0.96F);

        gunModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.5F, -0.45F, -0.3F, -0.5F, -0.45F, -0.3F, -0.5F, -0.45F, -0.3F, -0.5F, -0.45F); // 189
        gunModel[178].setRotationPoint(1.3F, -5F, -0.96F);

        gunModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.5F, -0.45F, -0.3F, -0.5F, -0.45F, -0.3F, -0.5F, -0.45F, -0.3F, -0.5F, -0.45F); // 190
        gunModel[179].setRotationPoint(1.3F, -4.7F, -0.96F);

        gunModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.1F, -0.4F, -0.45F, 0.1F, -0.4F, -0.45F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.1F, -0.4F, -0.45F, 0.1F, -0.4F, -0.45F); // 191
        gunModel[180].setRotationPoint(-1.6F, -5.75F, -1.1F);

        gunModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.5F, -0.45F, -0.1F, -0.5F, -0.45F, -0.1F, -0.5F, -0.45F, -0.1F, -0.5F, -0.45F, -0.05F, -0.45F, -0.4F, -0.05F, -0.45F, -0.4F, -0.05F, -0.45F, -0.4F, -0.05F, -0.45F, -0.4F); // 192
        gunModel[181].setRotationPoint(0.45F, -6.7F, -0.5F);

        gunModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, -0.15F, -0.45F, -0.4F, -0.15F, -0.45F, -0.4F, -0.15F, -0.45F, -0.4F, -0.15F, -0.45F, -0.4F); // 193
        gunModel[182].setRotationPoint(-1.2F, -6.7F, -0.5F);

        gunModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.5F, -0.45F, -0.1F, -0.5F, -0.45F, -0.1F, -0.5F, -0.45F, -0.1F, -0.5F, -0.45F, -0.05F, -0.45F, -0.4F, -0.05F, -0.45F, -0.4F, -0.05F, -0.45F, -0.4F, -0.05F, -0.45F, -0.4F); // 194
        gunModel[183].setRotationPoint(2.15F, -6.7F, -0.5F);

        gunModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.6F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.6F, -0.3F, 0.0F, -0.6F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.6F, -0.3F, 0.0F); // 195
        gunModel[184].setRotationPoint(-2.2F, -3.9F, -0.5F);

        gunModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.4F, -0.3F, -0.2F, 0.0F, -0.3F, -0.2F, 0.0F, -0.3F, -0.2F, 0.4F, -0.3F, -0.2F); // 196
        gunModel[185].setRotationPoint(-1.6F, -3.5F, -0.5F);

        gunModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, 0.1F, -0.3F, -0.4F, 0.0F, -0.3F, -0.4F, 0.4F, -0.3F, -0.4F, 0.0F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, 0.1F, -0.3F, -0.4F); // 197
        gunModel[186].setRotationPoint(-1.6F, -3.5F, -0.1F);

        gunModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, -0.4F, 0.1F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, 0.1F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, 0.0F, -0.3F, -0.4F, 0.4F, -0.3F, -0.4F); // 198
        gunModel[187].setRotationPoint(-1.6F, -3.5F, -0.9F);

        gunModel[188].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.3F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.8F, -0.3F, -0.2F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, 0.8F, -0.3F, -0.2F); // 199
        gunModel[188].setRotationPoint(-1.7F, -3.2F, -0.5F);

        gunModel[189].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.3F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.8F, -0.3F, -0.4F, -0.5F, 0.0F, -0.4F, -0.7F, -0.1F, -0.4F, 0.5F, -0.3F, -0.4F); // 200
        gunModel[189].setRotationPoint(-1.7F, -3.2F, -0.1F);

        gunModel[190].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.5F, -0.3F, -0.4F, -0.7F, -0.1F, -0.4F, -0.5F, 0.0F, -0.4F, 0.8F, -0.3F, -0.4F); // 201
        gunModel[190].setRotationPoint(-1.7F, -3.2F, -0.9F);

        gunModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.8F, -0.1F, -0.4F, -0.5F, -0.4F, -0.4F, -0.7F, -0.3F, -0.4F, 0.5F, -0.1F, -0.4F, 0.85F, -0.7F, -0.4F, -0.4F, -0.3F, -0.4F, -0.6F, -0.4F, -0.4F, 0.55F, -0.7F, -0.4F); // 202
        gunModel[191].setRotationPoint(-1.7F, -1.6F, -0.1F);

        gunModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.8F, -0.1F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, 0.8F, -0.1F, -0.2F, 0.85F, -0.7F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, 0.85F, -0.7F, -0.2F); // 203
        gunModel[192].setRotationPoint(-1.7F, -1.6F, -0.5F);

        gunModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.1F, -0.4F, -0.7F, -0.3F, -0.4F, -0.5F, -0.4F, -0.4F, 0.8F, -0.1F, -0.4F, 0.55F, -0.7F, -0.4F, -0.6F, -0.4F, -0.4F, -0.4F, -0.3F, -0.4F, 0.85F, -0.7F, -0.4F); // 204
        gunModel[193].setRotationPoint(-1.7F, -1.6F, -0.9F);

        gunModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, -0.3F, -0.2F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.7F, -0.3F, -0.2F, -0.7F, -0.3F, -0.2F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.7F, -0.3F, -0.2F); // 205
        gunModel[194].setRotationPoint(-2.6F, -3.9F, -0.5F);

        gunModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F); // 206
        gunModel[195].setRotationPoint(-1.2F, -3.6F, -0.5F);

        gunModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.85F, -0.2F, -0.4F, -0.4F, -0.6F, -0.4F, -0.6F, -0.5F, -0.4F, 0.55F, -0.2F, -0.4F, 0.75F, -0.6F, -0.4F, -0.5F, -0.3F, -0.4F, -0.7F, -0.4F, -0.4F, 0.5F, -0.6F, -0.4F); // 207
        gunModel[196].setRotationPoint(-1.7F, -1.5F, -0.1F);

        gunModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.55F, -0.2F, -0.4F, -0.6F, -0.5F, -0.4F, -0.4F, -0.6F, -0.4F, 0.85F, -0.2F, -0.4F, 0.5F, -0.6F, -0.4F, -0.7F, -0.4F, -0.4F, -0.5F, -0.3F, -0.4F, 0.75F, -0.6F, -0.4F); // 208
        gunModel[197].setRotationPoint(-1.7F, -1.5F, -0.9F);

        gunModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.85F, -0.2F, -0.2F, -0.4F, -0.6F, -0.2F, -0.4F, -0.6F, -0.2F, 0.85F, -0.2F, -0.2F, 0.75F, -0.6F, -0.2F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, 0.75F, -0.6F, -0.2F); // 209
        gunModel[198].setRotationPoint(-1.7F, -1.5F, -0.5F);

        gunModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, -0.3F, -0.2F, 0.0F, -0.3F, -0.1F, 0.0F, -0.3F, -0.1F, -0.7F, -0.3F, -0.2F, -0.7F, -0.3F, -0.2F, 0.0F, -0.3F, -0.1F, 0.0F, -0.3F, -0.1F, -0.7F, -0.3F, -0.2F); // 210
        gunModel[199].setRotationPoint(-2.6F, -4.3F, -0.5F);

        gunModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.6F, -0.3F, -0.1F, 0.0F, -0.3F, -0.1F, 0.0F, -0.3F, -0.1F, -0.6F, -0.3F, -0.1F, -0.6F, -0.3F, -0.1F, 0.0F, -0.3F, -0.1F, 0.0F, -0.3F, -0.1F, -0.6F, -0.3F, -0.1F); // 211
        gunModel[200].setRotationPoint(-2.2F, -4.3F, -0.5F);

        gunModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // 212
        gunModel[201].setRotationPoint(11.8F, -5F, -0.5F);

        gunModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F); // 213
        gunModel[202].setRotationPoint(15F, -5F, -0.5F);

        gunModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.2F, -0.4F, 0.3F, -0.2F, -0.4F, 0.3F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.6F, -0.7F, -0.4F, 0.3F, -0.7F, -0.4F, 0.3F, -0.7F, -0.4F, 0.6F, -0.7F, -0.4F); // 234
        gunModel[203].setRotationPoint(3.7F, -5.3F, 0F);

        gunModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, 0.1F, -0.7F, -0.2F, 0.1F, -0.7F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.7F, 0.1F, -0.6F, -0.7F, 0.1F, -0.6F, -0.7F, 0.1F, -0.2F, -0.7F, 0.1F); // 235
        gunModel[204].setRotationPoint(4.2F, -5.4F, -0.5F);

        gunModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, 0.1F, -0.7F, -0.2F, 0.1F, -0.7F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.6F, 0.1F, -0.7F, -0.6F, 0.1F, -0.7F, -0.6F, 0.1F, -0.2F, -0.6F, 0.1F); // 236
        gunModel[205].setRotationPoint(4.2F, -5.6F, -0.5F);

        gunModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0.05F, -0.6F, -0.5F, 0.05F, -0.6F, -0.5F, 0.05F, -0.3F, -0.5F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F); // 237
        gunModel[206].setRotationPoint(4.2F, -6F, -0.5F);

        gunModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.45F, -0.5F, 0.1F, -0.4F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.4F, -0.45F, 0.1F); // 238
        gunModel[207].setRotationPoint(4.2F, -5.8F, -0.5F);

        gunModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.4F, -0.45F, 0.1F, -0.4F, -0.5F, 0.1F, -0.45F, -0.5F, 0.1F, -0.45F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F); // 239
        gunModel[208].setRotationPoint(4.2F, -5.7F, -0.5F);

        gunModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.4F, -0.45F, 0.1F, -0.45F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.45F, -0.5F, 0.1F); // 240
        gunModel[209].setRotationPoint(4.2F, -5.65F, -0.5F);

        gunModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.7F, -0.4F, -0.2F, -0.7F, -0.4F, -0.2F, -0.7F, -0.4F, -0.2F, -0.7F, -0.4F); // 241
        gunModel[210].setRotationPoint(4.2F, -5.3F, -1F);

        gunModel[211].addShapeBox(0F, -0.1F, 0F, 1, 1, 1, 0F, -0.45F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.45F, -0.5F, 0.1F, -0.4F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.4F, -0.45F, 0.1F); // 242
        gunModel[211].setRotationPoint(-2.1F, -4.9F, -0.5F);

        gunModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.4F, -0.45F, 0.1F, -0.4F, -0.5F, 0.1F, -0.45F, -0.5F, 0.1F, -0.45F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F); // 243
        gunModel[212].setRotationPoint(-2.1F, -4.9F, -0.5F);

        gunModel[213].addShapeBox(0F, 0.05F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.4F, -0.45F, 0.1F, -0.45F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.45F, -0.5F, 0.1F); // 244
        gunModel[213].setRotationPoint(-2.1F, -4.9F, -0.5F);

        gunModel[214].addShapeBox(-0.2F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.3F, 0.05F, -0.3F, -0.3F, 0.05F, -0.3F, -0.3F, 0.05F, -0.2F, -0.3F, 0.05F, -0.2F, -0.35F, 0.05F, -0.3F, -0.35F, 0.05F, -0.3F, -0.35F, 0.05F, -0.2F, -0.35F, 0.05F); // 245
        gunModel[214].setRotationPoint(-2.1F, -4.9F, -0.5F);

        gunModel[215].addShapeBox(0.1F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, 0.05F, -0.5F, -0.4F, 0.05F, -0.5F, -0.4F, 0.05F, -0.4F, -0.3F, 0.05F, -0.4F, -0.35F, 0.05F, -0.5F, -0.45F, 0.05F, -0.5F, -0.45F, 0.05F, -0.4F, -0.35F, 0.05F); // 246
        gunModel[215].setRotationPoint(-2.1F, -4.9F, -0.5F);

        gunModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1.8F, -0.4F, -0.45F, 1.9F, -0.4F, -0.45F, 1.85F, -0.45F, -0.5F, 1.75F, -0.45F, -0.5F, 1.8F, -0.4F, -0.45F, 1.9F, -0.4F, -0.45F, 1.85F, -0.45F, -0.5F, 1.75F, -0.45F, -0.5F); // 247
        gunModel[216].setRotationPoint(0.1F, -5.75F, 0.1F);

        gunModel[217].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.2F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.2F, -0.3F, -0.45F, -0.2F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.2F, -0.3F, -0.45F); // 249
        gunModel[217].setRotationPoint(-1F, -5.1F, 1.3877788E-17F);

        gunModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F); // 250
        gunModel[218].setRotationPoint(-0.9F, -5.1F, 0.1F);

        gunModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.4F, -0.45F); // 251
        gunModel[219].setRotationPoint(-0.4F, -5.1F, 0.1F);

        gunModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F); // 252
        gunModel[220].setRotationPoint(-0.2F, -5F, 0.1F);

        gunModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.05F, -0.5F, -0.45F, -0.15F, -0.5F, -0.45F, -0.15F, -0.5F, -0.45F, -0.05F, -0.5F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F); // 253
        gunModel[221].setRotationPoint(0.1F, -4.8F, 1.3877788E-17F);

        gunModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, -0.4F, -0.45F, -0.05F, -0.4F, -0.45F, -0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, -0.05F, -0.5F, -0.45F, -0.15F, -0.5F, -0.45F, -0.15F, -0.5F, -0.45F, -0.05F, -0.5F, -0.45F); // 254
        gunModel[222].setRotationPoint(0.1F, -4.8F, 1.3877788E-17F);

        gunModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.2F, -0.45F); // 255
        gunModel[223].setRotationPoint(0.5F, -5.1F, 0.1F);

        gunModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F); // 256
        gunModel[224].setRotationPoint(1F, -5.1F, 0.1F);

        gunModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F); // 257
        gunModel[225].setRotationPoint(0.3F, -5F, 0.1F);

        gunModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.5F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F); // 258
        gunModel[226].setRotationPoint(-1.4F, -5.1F, 1.3877788E-17F);

        gunModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F); // 259
        gunModel[227].setRotationPoint(0.05F, -4.95F, 0.15F);

        gunModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.4F, -0.55F, -0.45F, -0.4F, -0.55F, -0.45F, -0.4F, -0.55F, -0.5F, -0.4F, -0.55F, -0.5F); // 260
        gunModel[228].setRotationPoint(0.05F, -4.95F, 0.15F);

        gunModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.45F, -0.4F, -0.55F, -0.45F, -0.4F, -0.55F, -0.5F, -0.4F, -0.55F, -0.5F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F); // 261
        gunModel[229].setRotationPoint(0.05F, -4.95F, 0.15F);

        gunModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.3F, -0.45F); // 262
        gunModel[230].setRotationPoint(1.5F, -5.1F, 1.3877788E-17F);

        gunModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.4F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.3F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.5F, -0.3F, -0.45F); // 263
        gunModel[231].setRotationPoint(1.7F, -4.9F, 1.3877788E-17F);

        gunModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.3F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.5F, -0.3F, -0.45F, -0.5F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.5F, -0.3F, -0.45F); // 264
        gunModel[232].setRotationPoint(1.6F, -4.9F, 1.3877788E-17F);

        gunModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.5F, -0.45F, -0.15F, -0.5F, -0.45F, -0.15F, -0.5F, -0.45F, -0.15F, -0.5F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F); // 265
        gunModel[233].setRotationPoint(0.1F, -4.7F, 1.3877788E-17F);

        gunModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.4F, -0.55F, -0.45F, -0.4F, -0.55F, -0.45F, -0.4F, -0.55F, -0.5F, -0.4F, -0.55F, -0.5F); // 266
        gunModel[234].setRotationPoint(1.65F, -4.85F, 0.1F);

        gunModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F); // 267
        gunModel[235].setRotationPoint(1.65F, -4.85F, 0.1F);

        gunModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.45F, -0.4F, -0.55F, -0.45F, -0.4F, -0.55F, -0.5F, -0.4F, -0.55F, -0.5F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F); // 268
        gunModel[236].setRotationPoint(1.65F, -4.85F, 0.1F);

        gunModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.5F, -0.45F, -0.15F, -0.5F, -0.45F, -0.15F, -0.5F, -0.45F, -0.15F, -0.5F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F); // 269
        gunModel[237].setRotationPoint(0.1F, -4.6F, 1.3877788E-17F);

        gunModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F); // 270
        gunModel[238].setRotationPoint(0.05F, -5F, 0.05F);

        gunModel[239].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0.0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.9F, -0.3F, -0.2F, -0.9F, -0.3F, -0.2F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // 271
        gunModel[239].setRotationPoint(-1.4F, -6.25F, -0.5F);

        gunModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.3F, -0.8F, -0.9F, -0.3F, -0.8F, -0.9F, -0.6F, 0F, -0.9F, -0.6F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F); // 272
        gunModel[240].setRotationPoint(-1.4F, -7.25F, -0.5F);

        gunModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.6F, -0.8F, -0.9F, -0.6F, -0.8F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F); // 273
        gunModel[241].setRotationPoint(-1.4F, -7.25F, -0.5F);

        gunModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.3F, -0.8F, -0.9F, -0.3F, -0.8F, -0.9F, -0.6F, 0F, -0.9F, -0.6F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F); // 274
        gunModel[242].setRotationPoint(-1F, -7.25F, -0.5F);

        gunModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.6F, -0.8F, -0.9F, -0.6F, -0.8F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F); // 275
        gunModel[243].setRotationPoint(-1F, -7.25F, -0.5F);

        gunModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.3F, -0.8F, -0.9F, -0.3F, -0.8F, -0.9F, -0.6F, 0F, -0.9F, -0.6F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F); // 276
        gunModel[244].setRotationPoint(-0.6F, -7.25F, -0.5F);

        gunModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.6F, -0.8F, -0.9F, -0.6F, -0.8F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F); // 277
        gunModel[245].setRotationPoint(-0.6F, -7.25F, -0.5F);

        gunModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.3F, -0.8F, -0.9F, -0.3F, -0.8F, -0.9F, -0.6F, 0F, -0.9F, -0.6F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F); // 278
        gunModel[246].setRotationPoint(-0.2F, -7.25F, -0.5F);

        gunModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.6F, -0.8F, -0.9F, -0.6F, -0.8F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F); // 279
        gunModel[247].setRotationPoint(-0.2F, -7.25F, -0.5F);

        gunModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.3F, -0.8F, -0.9F, -0.3F, -0.8F, -0.9F, -0.6F, 0F, -0.9F, -0.6F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F); // 280
        gunModel[248].setRotationPoint(0.2F, -7.25F, -0.5F);

        gunModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.6F, -0.8F, -0.9F, -0.6F, -0.8F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F); // 281
        gunModel[249].setRotationPoint(0.2F, -7.25F, -0.5F);

        gunModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.3F, -0.8F, -0.9F, -0.3F, -0.8F, -0.9F, -0.6F, 0F, -0.9F, -0.6F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F); // 282
        gunModel[250].setRotationPoint(0.6F, -7.25F, -0.5F);

        gunModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.6F, -0.8F, -0.9F, -0.6F, -0.8F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F); // 283
        gunModel[251].setRotationPoint(0.6F, -7.25F, -0.5F);

        gunModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.3F, -0.8F, -0.9F, -0.3F, -0.8F, -0.9F, -0.6F, 0F, -0.9F, -0.6F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F); // 284
        gunModel[252].setRotationPoint(1F, -7.25F, -0.5F);

        gunModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.6F, -0.8F, -0.9F, -0.6F, -0.8F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F); // 285
        gunModel[253].setRotationPoint(1F, -7.25F, -0.5F);

        gunModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.3F, -0.8F, -0.9F, -0.3F, -0.8F, -0.9F, -0.6F, 0F, -0.9F, -0.6F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F); // 286
        gunModel[254].setRotationPoint(1.4F, -7.25F, -0.5F);

        gunModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.6F, -0.8F, -0.9F, -0.6F, -0.8F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F); // 287
        gunModel[255].setRotationPoint(1.4F, -7.25F, -0.5F);

        gunModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.3F, -0.8F, -0.9F, -0.3F, -0.8F, -0.9F, -0.6F, 0F, -0.9F, -0.6F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F); // 288
        gunModel[256].setRotationPoint(1.8F, -7.25F, -0.5F);

        gunModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.6F, -0.8F, -0.9F, -0.6F, -0.8F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F); // 289
        gunModel[257].setRotationPoint(1.8F, -7.25F, -0.5F);

        gunModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.3F, -0.8F, -0.9F, -0.3F, -0.8F, -0.9F, -0.6F, 0F, -0.9F, -0.6F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F); // 290
        gunModel[258].setRotationPoint(2.2F, -7.25F, -0.5F);

        gunModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.6F, -0.8F, -0.9F, -0.6F, -0.8F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F); // 291
        gunModel[259].setRotationPoint(2.2F, -7.25F, -0.5F);

        gunModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.3F, -0.8F, -0.9F, -0.3F, -0.8F, -0.9F, -0.6F, 0F, -0.9F, -0.6F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F); // 292
        gunModel[260].setRotationPoint(2.6F, -7.25F, -0.5F);

        gunModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.6F, -0.8F, -0.9F, -0.6F, -0.8F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F); // 293
        gunModel[261].setRotationPoint(2.6F, -7.25F, -0.5F);

        gunModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.3F, -0.8F, -0.9F, -0.3F, -0.8F, -0.9F, -0.6F, 0F, -0.9F, -0.6F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F); // 294
        gunModel[262].setRotationPoint(3F, -7.25F, -0.5F);

        gunModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.6F, -0.8F, -0.9F, -0.6F, -0.8F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F); // 295
        gunModel[263].setRotationPoint(3F, -7.25F, -0.5F);

        gunModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.3F, -0.8F, -0.9F, -0.3F, -0.8F, -0.9F, -0.6F, 0F, -0.9F, -0.6F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F); // 296
        gunModel[264].setRotationPoint(3.4F, -7.25F, -0.5F);

        gunModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.6F, -0.8F, -0.9F, -0.6F, -0.8F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F); // 297
        gunModel[265].setRotationPoint(3.4F, -7.25F, -0.5F);

        gunModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.3F, -0.8F, -0.9F, -0.3F, -0.8F, -0.9F, -0.6F, 0F, -0.9F, -0.6F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F); // 298
        gunModel[266].setRotationPoint(3.8F, -7.25F, -0.5F);

        gunModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.6F, -0.8F, -0.9F, -0.6F, -0.8F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F); // 299
        gunModel[267].setRotationPoint(3.8F, -7.25F, -0.5F);

        gunModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.3F, -0.8F, -0.9F, -0.3F, -0.8F, -0.9F, -0.6F, 0F, -0.9F, -0.6F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F); // 300
        gunModel[268].setRotationPoint(4.2F, -7.25F, -0.5F);

        gunModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.6F, -0.8F, -0.9F, -0.6F, -0.8F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F); // 301
        gunModel[269].setRotationPoint(4.2F, -7.25F, -0.5F);

        gunModel[270].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -0.2F, 0F, -0.45F, 0.4F, 0F, -0.45F, 0.4F, 0.1F, -0.45F, -0.2F, 0.1F, -0.45F, -0.2F, -0.95F, -0.45F, 0.4F, -0.95F, -0.45F, 0.4F, -0.95F, -0.45F, -0.2F, -0.95F, -0.45F); // Import
        gunModel[270].setRotationPoint(4.8F, -5.15F, 0.2F);

        gunModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0.0F, -0.5F, -0.45F, 0.0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[271].setRotationPoint(5F, -5.25F, 0.3F);

        gunModel[272].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -0.2F, -0.6F, 0.1F, 0.4F, -0.6F, 0.1F, 0.4F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.3F, 0.2F, 0.4F, -0.3F, 0.2F, 0.4F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Import
        gunModel[272].setRotationPoint(4.8F, -4.7F, -0.25F);

        gunModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[273].setRotationPoint(5F, -4.3F, -0.25F);

        gunModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[274].setRotationPoint(5.8F, -4.3F, -0.25F);

        gunModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[275].setRotationPoint(6.6F, -4.3F, -0.25F);

        gunModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[276].setRotationPoint(7.4F, -4.3F, -0.25F);

        gunModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[277].setRotationPoint(5.4F, -4.3F, -0.25F);

        gunModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[278].setRotationPoint(6.2F, -4.3F, -0.25F);

        gunModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[279].setRotationPoint(7F, -4.3F, -0.25F);

        gunModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[280].setRotationPoint(7.8F, -4.3F, -0.25F);

        gunModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[281].setRotationPoint(8.2F, -4.3F, -0.25F);

        gunModel[282].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -1.0F, -0.5F, 0.1F, 1.2F, -0.5F, 0.1F, 1.2F, -0.5F, -0.4F, -1.0F, -0.5F, -0.4F, -1.0F, -0.4F, 0.1F, 1.2F, -0.4F, 0.1F, 1.2F, -0.4F, -0.4F, -1.0F, -0.4F, -0.4F); // Import
        gunModel[282].setRotationPoint(4F, -4.7F, -0.25F);

        gunModel[283].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -0.2F, -0.65F, 0.25F, 0.4F, -0.65F, 0.25F, 0.4F, -0.65F, 0.25F, -0.2F, -0.65F, 0.25F, -0.2F, -0.15F, 0.25F, 0.4F, -0.15F, 0.25F, 0.4F, -0.15F, 0.25F, -0.2F, -0.15F, 0.25F); // Import
        gunModel[283].setRotationPoint(4.8F, -5.4F, -0.5F);

        gunModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[284].setRotationPoint(9.8F, -4.3F, -0.25F);

        gunModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[285].setRotationPoint(9.4F, -4.3F, -0.25F);

        gunModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[286].setRotationPoint(9F, -4.3F, -0.25F);

        gunModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[287].setRotationPoint(8.6F, -4.3F, -0.25F);

        gunModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.8F, 0.5F, -0.2F, -0.8F, 0.5F, -0.2F, -0.8F, 0.0F, -0.2F, -0.8F, 0.0F, -0.2F, -0.1F, 0.45F, -0.3F, -0.1F, 0.45F, -0.3F, -0.1F, -0.05F, -0.2F, -0.1F, -0.05F); // Import
        gunModel[288].setRotationPoint(4.8F, -5.35F, -0.25F);

        gunModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.8F, 0.45F, -0.3F, -0.8F, 0.45F, -0.3F, -0.8F, -0.05F, -0.2F, -0.8F, -0.05F, -0.2F, -0.1F, 0.35F, -0.3F, -0.1F, 0.35F, -0.3F, -0.1F, -0.15F, -0.2F, -0.1F, -0.15F); // Import
        gunModel[289].setRotationPoint(4.8F, -5.25F, -0.25F);

        gunModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.8F, 0.35F, -0.3F, -0.8F, 0.35F, -0.3F, -0.8F, -0.15F, -0.2F, -0.8F, -0.15F, -0.2F, -0.1F, 0.25F, -0.2F, -0.1F, 0.25F, -0.2F, -0.1F, -0.25F, -0.2F, -0.1F, -0.25F); // Import
        gunModel[290].setRotationPoint(4.8F, -5.15F, -0.25F);

        gunModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.35F, -0.4F, -0.8F, 0.35F, -0.4F, -0.8F, -0.15F, -0.4F, -0.8F, -0.15F, -0.3F, -0.1F, 0.25F, -0.3F, -0.1F, 0.25F, -0.3F, -0.1F, -0.25F, -0.3F, -0.1F, -0.25F); // Import
        gunModel[291].setRotationPoint(5.5F, -5.15F, -0.25F);

        gunModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.45F, -0.4F, -0.8F, 0.45F, -0.4F, -0.8F, -0.05F, -0.4F, -0.8F, -0.05F, -0.4F, -0.1F, 0.35F, -0.4F, -0.1F, 0.35F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F); // Import
        gunModel[292].setRotationPoint(5.5F, -5.25F, -0.25F);

        gunModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.0F, -0.3F, -0.8F, 0.0F, -0.4F, -0.1F, 0.45F, -0.4F, -0.1F, 0.45F, -0.4F, -0.1F, -0.05F, -0.4F, -0.1F, -0.05F); // Import
        gunModel[293].setRotationPoint(5.5F, -5.35F, -0.25F);

        gunModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.35F, -0.4F, -0.8F, 0.35F, -0.4F, -0.8F, -0.15F, -0.4F, -0.8F, -0.15F, -0.3F, -0.1F, 0.25F, -0.3F, -0.1F, 0.25F, -0.3F, -0.1F, -0.25F, -0.3F, -0.1F, -0.25F); // Import
        gunModel[294].setRotationPoint(6.1F, -5.15F, -0.25F);

        gunModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.45F, -0.4F, -0.8F, 0.45F, -0.4F, -0.8F, -0.05F, -0.4F, -0.8F, -0.05F, -0.4F, -0.1F, 0.35F, -0.4F, -0.1F, 0.35F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F); // Import
        gunModel[295].setRotationPoint(6.1F, -5.25F, -0.25F);

        gunModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.0F, -0.3F, -0.8F, 0.0F, -0.4F, -0.1F, 0.45F, -0.4F, -0.1F, 0.45F, -0.4F, -0.1F, -0.05F, -0.4F, -0.1F, -0.05F); // Import
        gunModel[296].setRotationPoint(6.1F, -5.35F, -0.25F);

        gunModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.35F, -0.4F, -0.8F, 0.35F, -0.4F, -0.8F, -0.15F, -0.4F, -0.8F, -0.15F, -0.3F, -0.1F, 0.25F, -0.3F, -0.1F, 0.25F, -0.3F, -0.1F, -0.25F, -0.3F, -0.1F, -0.25F); // Import
        gunModel[297].setRotationPoint(6.7F, -5.15F, -0.25F);

        gunModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.45F, -0.4F, -0.8F, 0.45F, -0.4F, -0.8F, -0.05F, -0.4F, -0.8F, -0.05F, -0.4F, -0.1F, 0.35F, -0.4F, -0.1F, 0.35F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F); // Import
        gunModel[298].setRotationPoint(6.7F, -5.25F, -0.25F);

        gunModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.0F, -0.3F, -0.8F, 0.0F, -0.4F, -0.1F, 0.45F, -0.4F, -0.1F, 0.45F, -0.4F, -0.1F, -0.05F, -0.4F, -0.1F, -0.05F); // Import
        gunModel[299].setRotationPoint(6.7F, -5.35F, -0.25F);

        gunModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.35F, -0.4F, -0.8F, 0.35F, -0.4F, -0.8F, -0.15F, -0.4F, -0.8F, -0.15F, -0.3F, -0.1F, 0.25F, -0.3F, -0.1F, 0.25F, -0.3F, -0.1F, -0.25F, -0.3F, -0.1F, -0.25F); // Import
        gunModel[300].setRotationPoint(7.3F, -5.15F, -0.25F);

        gunModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.85F, 0.25F, 6.2F, -0.85F, 0.25F, 6.2F, -0.85F, -0.25F, 0.0F, -0.85F, -0.25F, 0.0F, -0.1F, 0.1F, 6.2F, -0.1F, 0.1F, 6.2F, -0.1F, -0.4F, 0.0F, -0.1F, -0.4F); // Import
        gunModel[301].setRotationPoint(5F, -5.1F, -0.25F);

        gunModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.45F, -0.4F, -0.8F, 0.45F, -0.4F, -0.8F, -0.05F, -0.4F, -0.8F, -0.05F, -0.4F, -0.1F, 0.35F, -0.4F, -0.1F, 0.35F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F); // Import
        gunModel[302].setRotationPoint(7.3F, -5.25F, -0.25F);

        gunModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.0F, -0.3F, -0.8F, 0.0F, -0.4F, -0.1F, 0.45F, -0.4F, -0.1F, 0.45F, -0.4F, -0.1F, -0.05F, -0.4F, -0.1F, -0.05F); // Import
        gunModel[303].setRotationPoint(7.3F, -5.35F, -0.25F);

        gunModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.35F, -0.4F, -0.8F, 0.35F, -0.4F, -0.8F, -0.15F, -0.4F, -0.8F, -0.15F, -0.3F, -0.1F, 0.25F, -0.3F, -0.1F, 0.25F, -0.3F, -0.1F, -0.25F, -0.3F, -0.1F, -0.25F); // Import
        gunModel[304].setRotationPoint(7.9F, -5.15F, -0.25F);

        gunModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.35F, -0.4F, -0.8F, 0.35F, -0.4F, -0.8F, -0.15F, -0.4F, -0.8F, -0.15F, -0.3F, -0.1F, 0.25F, -0.3F, -0.1F, 0.25F, -0.3F, -0.1F, -0.25F, -0.3F, -0.1F, -0.25F); // Import
        gunModel[305].setRotationPoint(8.5F, -5.15F, -0.25F);

        gunModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.45F, -0.4F, -0.8F, 0.45F, -0.4F, -0.8F, -0.05F, -0.4F, -0.8F, -0.05F, -0.4F, -0.1F, 0.35F, -0.4F, -0.1F, 0.35F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F); // Import
        gunModel[306].setRotationPoint(7.9F, -5.25F, -0.25F);

        gunModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.45F, -0.4F, -0.8F, 0.45F, -0.4F, -0.8F, -0.05F, -0.4F, -0.8F, -0.05F, -0.4F, -0.1F, 0.35F, -0.4F, -0.1F, 0.35F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F); // Import
        gunModel[307].setRotationPoint(8.5F, -5.25F, -0.25F);

        gunModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.0F, -0.3F, -0.8F, 0.0F, -0.4F, -0.1F, 0.45F, -0.4F, -0.1F, 0.45F, -0.4F, -0.1F, -0.05F, -0.4F, -0.1F, -0.05F); // Import
        gunModel[308].setRotationPoint(8.5F, -5.35F, -0.25F);

        gunModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.0F, -0.3F, -0.8F, 0.0F, -0.4F, -0.1F, 0.45F, -0.4F, -0.1F, 0.45F, -0.4F, -0.1F, -0.05F, -0.4F, -0.1F, -0.05F); // Import
        gunModel[309].setRotationPoint(7.9F, -5.35F, -0.25F);

        gunModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.35F, -0.3F, -0.8F, 0.35F, -0.3F, -0.8F, -0.15F, -0.4F, -0.8F, -0.15F, -0.3F, -0.1F, 0.25F, -0.3F, -0.1F, 0.25F, -0.3F, -0.1F, -0.25F, -0.3F, -0.1F, -0.25F); // Import
        gunModel[310].setRotationPoint(11.5F, -5.15F, -0.25F);

        gunModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.45F, -0.3F, -0.8F, 0.45F, -0.3F, -0.8F, -0.05F, -0.4F, -0.8F, -0.05F, -0.4F, -0.1F, 0.35F, -0.3F, -0.1F, 0.35F, -0.3F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F); // Import
        gunModel[311].setRotationPoint(11.5F, -5.25F, -0.25F);

        gunModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.0F, -0.3F, -0.8F, 0.0F, -0.4F, -0.1F, 0.45F, -0.3F, -0.1F, 0.45F, -0.3F, -0.1F, -0.05F, -0.4F, -0.1F, -0.05F); // Import
        gunModel[312].setRotationPoint(11.5F, -5.35F, -0.25F);

        gunModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.0F, -0.3F, -0.8F, 0.0F, -0.4F, -0.1F, 0.45F, -0.4F, -0.1F, 0.45F, -0.4F, -0.1F, -0.05F, -0.4F, -0.1F, -0.05F); // Import
        gunModel[313].setRotationPoint(10.9F, -5.35F, -0.25F);

        gunModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.45F, -0.4F, -0.8F, 0.45F, -0.4F, -0.8F, -0.05F, -0.4F, -0.8F, -0.05F, -0.4F, -0.1F, 0.35F, -0.4F, -0.1F, 0.35F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F); // Import
        gunModel[314].setRotationPoint(10.9F, -5.25F, -0.25F);

        gunModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.35F, -0.4F, -0.8F, 0.35F, -0.4F, -0.8F, -0.15F, -0.4F, -0.8F, -0.15F, -0.3F, -0.1F, 0.25F, -0.3F, -0.1F, 0.25F, -0.3F, -0.1F, -0.25F, -0.3F, -0.1F, -0.25F); // Import
        gunModel[315].setRotationPoint(10.9F, -5.15F, -0.25F);

        gunModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.0F, -0.3F, -0.8F, 0.0F, -0.4F, -0.1F, 0.45F, -0.4F, -0.1F, 0.45F, -0.4F, -0.1F, -0.05F, -0.4F, -0.1F, -0.05F); // Import
        gunModel[316].setRotationPoint(10.3F, -5.35F, -0.25F);

        gunModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.45F, -0.4F, -0.8F, 0.45F, -0.4F, -0.8F, -0.05F, -0.4F, -0.8F, -0.05F, -0.4F, -0.1F, 0.35F, -0.4F, -0.1F, 0.35F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F); // Import
        gunModel[317].setRotationPoint(10.3F, -5.25F, -0.25F);

        gunModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.35F, -0.4F, -0.8F, 0.35F, -0.4F, -0.8F, -0.15F, -0.4F, -0.8F, -0.15F, -0.3F, -0.1F, 0.25F, -0.3F, -0.1F, 0.25F, -0.3F, -0.1F, -0.25F, -0.3F, -0.1F, -0.25F); // Import
        gunModel[318].setRotationPoint(10.3F, -5.15F, -0.25F);

        gunModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.0F, -0.3F, -0.8F, 0.0F, -0.4F, -0.1F, 0.45F, -0.4F, -0.1F, 0.45F, -0.4F, -0.1F, -0.05F, -0.4F, -0.1F, -0.05F); // Import
        gunModel[319].setRotationPoint(9.7F, -5.35F, -0.25F);

        gunModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.45F, -0.4F, -0.8F, 0.45F, -0.4F, -0.8F, -0.05F, -0.4F, -0.8F, -0.05F, -0.4F, -0.1F, 0.35F, -0.4F, -0.1F, 0.35F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F); // Import
        gunModel[320].setRotationPoint(9.7F, -5.25F, -0.25F);

        gunModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.35F, -0.4F, -0.8F, 0.35F, -0.4F, -0.8F, -0.15F, -0.4F, -0.8F, -0.15F, -0.3F, -0.1F, 0.25F, -0.3F, -0.1F, 0.25F, -0.3F, -0.1F, -0.25F, -0.3F, -0.1F, -0.25F); // Import
        gunModel[321].setRotationPoint(9.7F, -5.15F, -0.25F);

        gunModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.0F, -0.3F, -0.8F, 0.0F, -0.4F, -0.1F, 0.45F, -0.4F, -0.1F, 0.45F, -0.4F, -0.1F, -0.05F, -0.4F, -0.1F, -0.05F); // Import
        gunModel[322].setRotationPoint(9.1F, -5.35F, -0.25F);

        gunModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.45F, -0.4F, -0.8F, 0.45F, -0.4F, -0.8F, -0.05F, -0.4F, -0.8F, -0.05F, -0.4F, -0.1F, 0.35F, -0.4F, -0.1F, 0.35F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F); // Import
        gunModel[323].setRotationPoint(9.1F, -5.25F, -0.25F);

        gunModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.35F, -0.4F, -0.8F, 0.35F, -0.4F, -0.8F, -0.15F, -0.4F, -0.8F, -0.15F, -0.3F, -0.1F, 0.25F, -0.3F, -0.1F, 0.25F, -0.3F, -0.1F, -0.25F, -0.3F, -0.1F, -0.25F); // Import
        gunModel[324].setRotationPoint(9.1F, -5.15F, -0.25F);

        gunModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[325].setRotationPoint(11.8F, -4.3F, -0.25F);

        gunModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[326].setRotationPoint(11.4F, -4.3F, -0.25F);

        gunModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[327].setRotationPoint(11F, -4.3F, -0.25F);

        gunModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[328].setRotationPoint(10.6F, -4.3F, -0.25F);

        gunModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[329].setRotationPoint(10.2F, -4.3F, -0.25F);

        gunModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[330].setRotationPoint(12F, -4.3F, -0.25F);

        gunModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[331].setRotationPoint(5F, -5.55F, 0.3F);

        gunModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0.0F, -0.5F, -0.45F, 0.0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[332].setRotationPoint(5.4F, -5.25F, 0.3F);

        gunModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[333].setRotationPoint(5.4F, -5.55F, 0.3F);

        gunModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0.0F, -0.5F, -0.45F, 0.0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[334].setRotationPoint(5.8F, -5.25F, 0.3F);

        gunModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[335].setRotationPoint(5.8F, -5.55F, 0.3F);

        gunModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0.0F, -0.5F, -0.45F, 0.0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[336].setRotationPoint(6.2F, -5.25F, 0.3F);

        gunModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[337].setRotationPoint(6.2F, -5.55F, 0.3F);

        gunModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0.0F, -0.5F, -0.45F, 0.0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[338].setRotationPoint(6.6F, -5.25F, 0.3F);

        gunModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[339].setRotationPoint(6.6F, -5.55F, 0.3F);

        gunModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0.0F, -0.5F, -0.45F, 0.0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[340].setRotationPoint(7F, -5.25F, 0.3F);

        gunModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[341].setRotationPoint(7F, -5.55F, 0.3F);

        gunModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0.0F, -0.5F, -0.45F, 0.0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[342].setRotationPoint(7.4F, -5.25F, 0.3F);

        gunModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[343].setRotationPoint(7.4F, -5.55F, 0.3F);

        gunModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0.0F, -0.5F, -0.45F, 0.0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[344].setRotationPoint(7.8F, -5.25F, 0.3F);

        gunModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[345].setRotationPoint(7.8F, -5.55F, 0.3F);

        gunModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0.0F, -0.5F, -0.45F, 0.0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[346].setRotationPoint(8.2F, -5.25F, 0.3F);

        gunModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[347].setRotationPoint(8.2F, -5.55F, 0.3F);

        gunModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0.0F, -0.5F, -0.45F, 0.0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[348].setRotationPoint(8.6F, -5.25F, 0.3F);

        gunModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[349].setRotationPoint(8.6F, -5.55F, 0.3F);

        gunModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0.0F, -0.5F, -0.45F, 0.0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[350].setRotationPoint(10.4F, -5.25F, 0.3F);

        gunModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[351].setRotationPoint(10.4F, -5.55F, 0.3F);

        gunModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0.0F, -0.5F, -0.45F, 0.0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[352].setRotationPoint(10.8F, -5.25F, 0.3F);

        gunModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[353].setRotationPoint(10.8F, -5.55F, 0.3F);

        gunModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0.0F, -0.5F, -0.45F, 0.0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[354].setRotationPoint(11.2F, -5.25F, 0.3F);

        gunModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[355].setRotationPoint(11.2F, -5.55F, 0.3F);

        gunModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0.0F, -0.5F, -0.45F, 0.0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[356].setRotationPoint(11.6F, -5.25F, 0.3F);

        gunModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[357].setRotationPoint(11.6F, -5.55F, 0.3F);

        gunModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0.0F, -0.5F, -0.45F, 0.0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[358].setRotationPoint(12F, -5.25F, 0.3F);

        gunModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[359].setRotationPoint(12F, -5.55F, 0.3F);

        gunModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0.0F, -0.5F, -0.45F, 0.0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[360].setRotationPoint(10F, -5.25F, 0.3F);

        gunModel[361].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[361].setRotationPoint(10F, -5.55F, 0.3F);

        gunModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, 0.0F, -0.5F, -0.45F, 0.0F, -0.3F, -0.45F, -0.2F, -0.3F, -0.45F, -0.2F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[362].setRotationPoint(9F, -5.25F, 0.3F);

        gunModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.45F, -0.2F, -0.3F, -0.45F, -0.2F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[363].setRotationPoint(9F, -5.55F, 0.3F);

        gunModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Import
        gunModel[364].setRotationPoint(5F, -5.45F, 0.3F);

        gunModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Import
        gunModel[365].setRotationPoint(5.4F, -5.45F, 0.3F);

        gunModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Import
        gunModel[366].setRotationPoint(5.8F, -5.45F, 0.3F);

        gunModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Import
        gunModel[367].setRotationPoint(6.2F, -5.45F, 0.3F);

        gunModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Import
        gunModel[368].setRotationPoint(7F, -5.45F, 0.3F);

        gunModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Import
        gunModel[369].setRotationPoint(7.4F, -5.45F, 0.3F);

        gunModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Import
        gunModel[370].setRotationPoint(7.8F, -5.45F, 0.3F);

        gunModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Import
        gunModel[371].setRotationPoint(8.2F, -5.45F, 0.3F);

        gunModel[372].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Import
        gunModel[372].setRotationPoint(6.6F, -5.45F, 0.3F);

        gunModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Import
        gunModel[373].setRotationPoint(8.6F, -5.45F, 0.3F);

        gunModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Import
        gunModel[374].setRotationPoint(10.4F, -5.45F, 0.3F);

        gunModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Import
        gunModel[375].setRotationPoint(10.8F, -5.45F, 0.3F);

        gunModel[376].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Import
        gunModel[376].setRotationPoint(11.2F, -5.45F, 0.3F);

        gunModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Import
        gunModel[377].setRotationPoint(11.6F, -5.45F, 0.3F);

        gunModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Import
        gunModel[378].setRotationPoint(10F, -5.45F, 0.3F);

        gunModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Import
        gunModel[379].setRotationPoint(12F, -5.45F, 0.3F);

        gunModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[380].setRotationPoint(9F, -5.45F, 0.25F);

        gunModel[381].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -0.2F, 0.1F, -0.45F, 0.4F, 0.1F, -0.45F, 0.4F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, -0.95F, -0.45F, 0.4F, -0.95F, -0.45F, 0.4F, -0.95F, -0.45F, -0.2F, -0.95F, -0.45F); // Import
        gunModel[381].setRotationPoint(4.8F, -5.15F, -1.2F);

        gunModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[382].setRotationPoint(5F, -5.25F, -1.3F);

        gunModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[383].setRotationPoint(5F, -5.55F, -1.3F);

        gunModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[384].setRotationPoint(5.4F, -5.25F, -1.3F);

        gunModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[385].setRotationPoint(5.4F, -5.55F, -1.3F);

        gunModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[386].setRotationPoint(5.8F, -5.25F, -1.3F);

        gunModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[387].setRotationPoint(5.8F, -5.55F, -1.3F);

        gunModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[388].setRotationPoint(6.2F, -5.25F, -1.3F);

        gunModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[389].setRotationPoint(6.2F, -5.55F, -1.3F);

        gunModel[390].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[390].setRotationPoint(6.6F, -5.25F, -1.3F);

        gunModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[391].setRotationPoint(6.6F, -5.55F, -1.3F);

        gunModel[392].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[392].setRotationPoint(7F, -5.25F, -1.3F);

        gunModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[393].setRotationPoint(7F, -5.55F, -1.3F);

        gunModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[394].setRotationPoint(7.4F, -5.25F, -1.3F);

        gunModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[395].setRotationPoint(7.4F, -5.55F, -1.3F);

        gunModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[396].setRotationPoint(7.8F, -5.25F, -1.3F);

        gunModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[397].setRotationPoint(7.8F, -5.55F, -1.3F);

        gunModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[398].setRotationPoint(8.2F, -5.25F, -1.3F);

        gunModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[399].setRotationPoint(8.2F, -5.55F, -1.3F);

        gunModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[400].setRotationPoint(8.6F, -5.25F, -1.3F);

        gunModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[401].setRotationPoint(8.6F, -5.55F, -1.3F);

        gunModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[402].setRotationPoint(10.4F, -5.25F, -1.3F);

        gunModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[403].setRotationPoint(10.4F, -5.55F, -1.3F);

        gunModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[404].setRotationPoint(10.8F, -5.25F, -1.3F);

        gunModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[405].setRotationPoint(10.8F, -5.55F, -1.3F);

        gunModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[406].setRotationPoint(11.2F, -5.25F, -1.3F);

        gunModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[407].setRotationPoint(11.2F, -5.55F, -1.3F);

        gunModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[408].setRotationPoint(11.6F, -5.25F, -1.3F);

        gunModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[409].setRotationPoint(11.6F, -5.55F, -1.3F);

        gunModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[410].setRotationPoint(12F, -5.25F, -1.3F);

        gunModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[411].setRotationPoint(12F, -5.55F, -1.3F);

        gunModel[412].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[412].setRotationPoint(10F, -5.25F, -1.3F);

        gunModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[413].setRotationPoint(10F, -5.55F, -1.3F);

        gunModel[414].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[414].setRotationPoint(9F, -5.25F, -1.3F);

        gunModel[415].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Import
        gunModel[415].setRotationPoint(9F, -5.55F, -1.3F);

        gunModel[416].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.3F, -0.5F, -0.8F, -0.3F, -0.5F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[416].setRotationPoint(5F, -5.45F, -1.3F);

        gunModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.3F, -0.5F, -0.8F, -0.3F, -0.5F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[417].setRotationPoint(5.4F, -5.45F, -1.3F);

        gunModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.3F, -0.5F, -0.8F, -0.3F, -0.5F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[418].setRotationPoint(5.8F, -5.45F, -1.3F);

        gunModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.3F, -0.5F, -0.8F, -0.3F, -0.5F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[419].setRotationPoint(6.2F, -5.45F, -1.3F);

        gunModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.3F, -0.5F, -0.8F, -0.3F, -0.5F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[420].setRotationPoint(7F, -5.45F, -1.3F);

        gunModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.3F, -0.5F, -0.8F, -0.3F, -0.5F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[421].setRotationPoint(7.4F, -5.45F, -1.3F);

        gunModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.3F, -0.5F, -0.8F, -0.3F, -0.5F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[422].setRotationPoint(7.8F, -5.45F, -1.3F);

        gunModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.3F, -0.5F, -0.8F, -0.3F, -0.5F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[423].setRotationPoint(8.2F, -5.45F, -1.3F);

        gunModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.3F, -0.5F, -0.8F, -0.3F, -0.5F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[424].setRotationPoint(6.6F, -5.45F, -1.3F);

        gunModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.3F, -0.5F, -0.8F, -0.3F, -0.5F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[425].setRotationPoint(8.6F, -5.45F, -1.3F);

        gunModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.3F, -0.5F, -0.8F, -0.3F, -0.5F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[426].setRotationPoint(10.4F, -5.45F, -1.3F);

        gunModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.3F, -0.5F, -0.8F, -0.3F, -0.5F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[427].setRotationPoint(10.8F, -5.45F, -1.3F);

        gunModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.3F, -0.5F, -0.8F, -0.3F, -0.5F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[428].setRotationPoint(11.2F, -5.45F, -1.3F);

        gunModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.3F, -0.5F, -0.8F, -0.3F, -0.5F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[429].setRotationPoint(11.6F, -5.45F, -1.3F);

        gunModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.3F, -0.5F, -0.8F, -0.3F, -0.5F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[430].setRotationPoint(10F, -5.45F, -1.3F);

        gunModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F, -0.8F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.3F, -0.5F, -0.8F, -0.3F, -0.5F, -0.8F, -0.3F, -0.45F, 0F, -0.3F, -0.45F); // Import
        gunModel[431].setRotationPoint(12F, -5.45F, -1.3F);

        gunModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.35F, -0.2F, 0.1F, -0.35F, -0.2F, 0.1F, -0.35F, -0.7F, 0.1F, -0.35F, -0.7F, 0.1F, -0.35F, -0.2F, 0.1F, -0.35F, -0.2F, 0.1F, -0.35F, -0.7F, 0.1F, -0.35F, -0.7F); // 115
        gunModel[432].setRotationPoint(16F, -5.4F, -0.5F);


        defaultBarrelModel = new ModelRendererTurbo[18];
        defaultBarrelModel[0] = new ModelRendererTurbo(this, 88, 155, textureX, textureY); // 114
        defaultBarrelModel[1] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // 116
        defaultBarrelModel[2] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // 117
        defaultBarrelModel[3] = new ModelRendererTurbo(this, 65, 159, textureX, textureY); // 114
        defaultBarrelModel[4] = new ModelRendererTurbo(this, 65, 170, textureX, textureY); // 114
        defaultBarrelModel[5] = new ModelRendererTurbo(this, 65, 165, textureX, textureY); // 114
        defaultBarrelModel[6] = new ModelRendererTurbo(this, 31, 156, textureX, textureY); // 114
        defaultBarrelModel[7] = new ModelRendererTurbo(this, 42, 166, textureX, textureY); // 114
        defaultBarrelModel[8] = new ModelRendererTurbo(this, 50, 150, textureX, textureY); // 114
        defaultBarrelModel[9] = new ModelRendererTurbo(this, 31, 156, textureX, textureY); // 114
        defaultBarrelModel[10] = new ModelRendererTurbo(this, 42, 166, textureX, textureY); // 114
        defaultBarrelModel[11] = new ModelRendererTurbo(this, 50, 150, textureX, textureY); // 114
        defaultBarrelModel[12] = new ModelRendererTurbo(this, 31, 156, textureX, textureY); // 114
        defaultBarrelModel[13] = new ModelRendererTurbo(this, 42, 166, textureX, textureY); // 114
        defaultBarrelModel[14] = new ModelRendererTurbo(this, 50, 150, textureX, textureY); // 114
        defaultBarrelModel[15] = new ModelRendererTurbo(this, 31, 156, textureX, textureY); // 114
        defaultBarrelModel[16] = new ModelRendererTurbo(this, 42, 166, textureX, textureY); // 114
        defaultBarrelModel[17] = new ModelRendererTurbo(this, 50, 150, textureX, textureY); // 114

        defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.4F, -0.35F, 0.1F, -0.4F, -0.35F, 0.1F, -0.4F, -0.35F, 0.1F, -0.4F, -0.35F, 0.1F, -0.45F, -0.2F, 0.1F, -0.45F, -0.2F, 0.1F, -0.45F, -0.2F, 0.1F, -0.45F, -0.2F); // 114
        defaultBarrelModel[0].setRotationPoint(16F, -5.6F, -0.5F);

        defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.45F, -0.2F, 0.1F, -0.45F, -0.2F, 0.1F, -0.45F, -0.2F, 0.1F, -0.45F, -0.2F, 0.1F, -0.4F, -0.35F, 0.1F, -0.4F, -0.35F, 0.1F, -0.4F, -0.35F, 0.1F, -0.4F, -0.35F); // 116
        defaultBarrelModel[1].setRotationPoint(16F, -5.2F, -0.5F);

        defaultBarrelModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.35F, -0.7F, 0.1F, -0.35F, -0.7F, 0.1F, -0.35F, -0.2F, 0.1F, -0.35F, -0.2F, 0.1F, -0.35F, -0.7F, 0.1F, -0.35F, -0.7F, 0.1F, -0.35F, -0.2F, 0.1F, -0.35F, -0.2F); // 117
        defaultBarrelModel[2].setRotationPoint(16F, -5.4F, -0.5F);

        defaultBarrelModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F); // 114
        defaultBarrelModel[3].setRotationPoint(16.8F, -5.6F, -0.5F);

        defaultBarrelModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // 114
        defaultBarrelModel[4].setRotationPoint(16.8F, -5.2F, -0.5F);

        defaultBarrelModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F); // 114
        defaultBarrelModel[5].setRotationPoint(16.8F, -5.6F, -0.5F);

        defaultBarrelModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.35F, -0.9F, -0.35F, -0.35F, -0.9F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.45F, -0.15F, -0.9F, -0.45F, -0.15F, -0.9F, -0.45F, -0.15F, 0F, -0.45F, -0.15F); // 114
        defaultBarrelModel[6].setRotationPoint(16F, -5.6F, -0.5F);

        defaultBarrelModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.45F, -0.15F, -0.9F, -0.45F, -0.15F, -0.9F, -0.45F, -0.15F, 0F, -0.45F, -0.15F, 0F, -0.35F, -0.35F, -0.9F, -0.35F, -0.35F, -0.9F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // 114
        defaultBarrelModel[7].setRotationPoint(16F, -5.2F, -0.5F);

        defaultBarrelModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.15F, -0.9F, -0.25F, -0.15F, -0.9F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.45F, -0.15F, -0.9F, -0.45F, -0.15F, -0.9F, -0.45F, -0.15F, 0F, -0.45F, -0.15F); // 114
        defaultBarrelModel[8].setRotationPoint(16F, -5.3F, -0.5F);

        defaultBarrelModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.35F, -0.9F, -0.35F, -0.35F, -0.9F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.45F, -0.15F, -0.9F, -0.45F, -0.15F, -0.9F, -0.45F, -0.15F, 0F, -0.45F, -0.15F); // 114
        defaultBarrelModel[9].setRotationPoint(16.3F, -5.6F, -0.5F);

        defaultBarrelModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.45F, -0.15F, -0.9F, -0.45F, -0.15F, -0.9F, -0.45F, -0.15F, 0F, -0.45F, -0.15F, 0F, -0.35F, -0.35F, -0.9F, -0.35F, -0.35F, -0.9F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // 114
        defaultBarrelModel[10].setRotationPoint(16.3F, -5.2F, -0.5F);

        defaultBarrelModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.15F, -0.9F, -0.25F, -0.15F, -0.9F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.45F, -0.15F, -0.9F, -0.45F, -0.15F, -0.9F, -0.45F, -0.15F, 0F, -0.45F, -0.15F); // 114
        defaultBarrelModel[11].setRotationPoint(16.3F, -5.3F, -0.5F);

        defaultBarrelModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.35F, -0.9F, -0.35F, -0.35F, -0.9F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.45F, -0.15F, -0.9F, -0.45F, -0.15F, -0.9F, -0.45F, -0.15F, 0F, -0.45F, -0.15F); // 114
        defaultBarrelModel[12].setRotationPoint(16.6F, -5.6F, -0.5F);

        defaultBarrelModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.45F, -0.15F, -0.9F, -0.45F, -0.15F, -0.9F, -0.45F, -0.15F, 0F, -0.45F, -0.15F, 0F, -0.35F, -0.35F, -0.9F, -0.35F, -0.35F, -0.9F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // 114
        defaultBarrelModel[13].setRotationPoint(16.6F, -5.2F, -0.5F);

        defaultBarrelModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.15F, -0.9F, -0.25F, -0.15F, -0.9F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.45F, -0.15F, -0.9F, -0.45F, -0.15F, -0.9F, -0.45F, -0.15F, 0F, -0.45F, -0.15F); // 114
        defaultBarrelModel[14].setRotationPoint(16.6F, -5.3F, -0.5F);

        defaultBarrelModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.35F, -0.9F, -0.35F, -0.35F, -0.9F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.45F, -0.15F, -0.9F, -0.45F, -0.15F, -0.9F, -0.45F, -0.15F, 0F, -0.45F, -0.15F); // 114
        defaultBarrelModel[15].setRotationPoint(16.9F, -5.6F, -0.5F);

        defaultBarrelModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.45F, -0.15F, -0.9F, -0.45F, -0.15F, -0.9F, -0.45F, -0.15F, 0F, -0.45F, -0.15F, 0F, -0.35F, -0.35F, -0.9F, -0.35F, -0.35F, -0.9F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // 114
        defaultBarrelModel[16].setRotationPoint(16.9F, -5.2F, -0.5F);

        defaultBarrelModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.15F, -0.9F, -0.25F, -0.15F, -0.9F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.45F, -0.15F, -0.9F, -0.45F, -0.15F, -0.9F, -0.45F, -0.15F, 0F, -0.45F, -0.15F); // 114
        defaultBarrelModel[17].setRotationPoint(16.9F, -5.3F, -0.5F);


        defaultStockModel = new ModelRendererTurbo[36];
        defaultStockModel[0] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Import
        defaultStockModel[1] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Import
        defaultStockModel[2] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Import
        defaultStockModel[3] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import
        defaultStockModel[4] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Import
        defaultStockModel[5] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Import
        defaultStockModel[6] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Import
        defaultStockModel[7] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Import
        defaultStockModel[8] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import
        defaultStockModel[9] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Import
        defaultStockModel[10] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Import
        defaultStockModel[11] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Import
        defaultStockModel[12] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Import
        defaultStockModel[13] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Import
        defaultStockModel[14] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Import
        defaultStockModel[15] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Import
        defaultStockModel[16] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Import
        defaultStockModel[17] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Import
        defaultStockModel[18] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Import
        defaultStockModel[19] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Import
        defaultStockModel[20] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Import
        defaultStockModel[21] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Import
        defaultStockModel[22] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Import
        defaultStockModel[23] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Import
        defaultStockModel[24] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Import
        defaultStockModel[25] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Import
        defaultStockModel[26] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Import
        defaultStockModel[27] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Import
        defaultStockModel[28] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Import
        defaultStockModel[29] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Import
        defaultStockModel[30] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Import
        defaultStockModel[31] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Import
        defaultStockModel[32] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Import
        defaultStockModel[33] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Import
        defaultStockModel[34] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Import
        defaultStockModel[35] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Import

        defaultStockModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F); // Import
        defaultStockModel[0].setRotationPoint(-8.9F, -4.6F, -0.5F);

        defaultStockModel[1].addShapeBox(0F, -0.6F, 0F, 1, 1, 1, 0F, -0.5F, -0.4F, 0.0F, -0.3F, -0.4F, 0.0F, -0.3F, -0.4F, 0.0F, -0.5F, -0.4F, 0.0F, -0.5F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F); // Import
        defaultStockModel[1].setRotationPoint(-9F, -2.4F, -0.5F);

        defaultStockModel[2].addShapeBox(0F, -0.6F, 0F, 1, 1, 1, 0F, -0.5F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, 0.0F, -0.3F, -0.4F, 0.0F, -0.3F, -0.4F, 0.0F, -0.5F, -0.4F, 0.0F); // Import
        defaultStockModel[2].setRotationPoint(-9F, -4.6F, -0.5F);

        defaultStockModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.1F, -0.2F, 0.2F, 0.35F, -0.2F, 0.2F, 0.35F, -0.2F, 0.0F, -0.1F, -0.2F, 0.0F, 0.15F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.0F, 0.15F, -0.2F); // Import
        defaultStockModel[3].setRotationPoint(-3.3F, -4.7F, -0.5F);

        defaultStockModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 1.0F, -0.2F, 0.0F, -0.15F, -0.2F, 0.0F, -0.15F, -0.2F, 0.0F, 1.0F, -0.2F); // Import
        defaultStockModel[4].setRotationPoint(-7.3F, -4.4F, -0.5F);

        defaultStockModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F); // Import
        defaultStockModel[5].setRotationPoint(-8.3F, -4.5F, -0.5F);

        defaultStockModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.1F, -0.4F, 0.2F, 0.35F, -0.4F, -0.85F, -0.25F, -0.4F, 0.0F, -0.3F, -0.4F, 0.0F, 0.15F, -0.4F, 0.3F, -0.2F, -0.4F, -0.8F, -0.15F, -0.4F, 0.0F, -0.05F, -0.4F); // Import
        defaultStockModel[6].setRotationPoint(-3.3F, -4.7F, -0.1F);

        defaultStockModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, 0.2F, -0.4F, 0.0F, 0.2F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 1.0F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.35F, -0.4F, 0.0F, 0.8F, -0.4F); // Import
        defaultStockModel[7].setRotationPoint(-7.3F, -4.4F, -0.1F);

        defaultStockModel[8].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.0F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F); // Import
        defaultStockModel[8].setRotationPoint(-8.3F, -5.2F, -0.5F);

        defaultStockModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.0F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F); // Import
        defaultStockModel[9].setRotationPoint(-8.3F, -5.2F, -0.1F);

        defaultStockModel[10].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.0F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F); // Import
        defaultStockModel[10].setRotationPoint(-8.3F, -5.2F, -0.9F);

        defaultStockModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.2F, -0.4F, 0.0F, 0.2F, -0.4F, 0.0F, 0.8F, -0.4F, 0.0F, -0.35F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, 1.0F, -0.4F); // Import
        defaultStockModel[11].setRotationPoint(-7.3F, -4.4F, -0.9F);

        defaultStockModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, -0.4F, -0.85F, -0.25F, -0.4F, 0.2F, 0.35F, -0.4F, 0.0F, -0.1F, -0.4F, 0.0F, -0.05F, -0.4F, -0.8F, -0.15F, -0.4F, 0.3F, -0.2F, -0.4F, 0.0F, 0.15F, -0.4F); // Import
        defaultStockModel[12].setRotationPoint(-3.3F, -4.7F, -0.9F);

        defaultStockModel[13].addShapeBox(0F, -0.6F, 0F, 1, 1, 1, 0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F); // Import
        defaultStockModel[13].setRotationPoint(-8.3F, -2.4F, -0.5F);

        defaultStockModel[14].addShapeBox(-0.6F, 0.05F, 0F, 1, 1, 1, 0F, -0.55F, 0.2F, 0.05F, -0.35F, 0.2F, 0.05F, -0.35F, 0.2F, 0.05F, -0.55F, 0.2F, 0.05F, -0.45F, -1.1F, 0.05F, -0.25F, -1.1F, 0.05F, -0.25F, -1.1F, 0.05F, -0.45F, -1.1F, 0.05F); // Import
        defaultStockModel[14].setRotationPoint(-7.5F, -2.9F, -0.5F);
        defaultStockModel[14].rotateAngleZ = 0.05235988F;

        defaultStockModel[15].addShapeBox(-0.6F, 0.05F, 0F, 1, 1, 1, 0F, -0.45F, 0.1F, 0.05F, -0.25F, 0.1F, 0.05F, -0.25F, 0.1F, 0.05F, -0.45F, 0.1F, 0.05F, -0.45F, -1.0F, 0.05F, -0.25F, -1.0F, 0.05F, -0.25F, -1.0F, 0.05F, -0.45F, -1.0F, 0.05F); // Import
        defaultStockModel[15].setRotationPoint(-7.5F, -2.9F, -0.5F);
        defaultStockModel[15].rotateAngleZ = 0.05235988F;

        defaultStockModel[16].addShapeBox(-0.6F, -1.05F, 0F, 1, 1, 1, 0F, -0.45F, -1.1F, 0.05F, -0.25F, -1.1F, 0.05F, -0.25F, -1.1F, 0.05F, -0.45F, -1.1F, 0.05F, -0.55F, 0.2F, 0.05F, -0.35F, 0.2F, 0.05F, -0.35F, 0.2F, 0.05F, -0.55F, 0.2F, 0.05F); // Import
        defaultStockModel[16].setRotationPoint(-7.5F, -2.9F, -0.5F);
        defaultStockModel[16].rotateAngleZ = 0.05235988F;

        defaultStockModel[17].addShapeBox(-0.6F, 0.05F, 1F, 1, 1, 1, 0F, -0.45F, 0.1F, -0.45F, -0.25F, 0.1F, -0.45F, -0.25F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.5F, -1.0F, -0.45F, -0.3F, -1.0F, -0.45F, -0.3F, -1.0F, -0.45F, -0.5F, -1.0F, -0.45F); // Import
        defaultStockModel[17].setRotationPoint(-7.5F, -2.9F, -0.9F);
        defaultStockModel[17].rotateAngleZ = 0.87266463F;

        defaultStockModel[18].addShapeBox(-0.3F, 0.05F, 1F, 1, 1, 1, 0F, -0.45F, 0.1F, -0.45F, -0.4F, -0.05F, -0.45F, -0.4F, -0.05F, -0.45F, -0.45F, 0.1F, -0.45F, -0.4F, -1.0F, -0.45F, -0.45F, -0.85F, -0.45F, -0.45F, -0.85F, -0.45F, -0.4F, -1.0F, -0.45F); // Import
        defaultStockModel[18].setRotationPoint(-7.5F, -2.9F, -0.9F);
        defaultStockModel[18].rotateAngleZ = 0.87266463F;

        defaultStockModel[19].addShapeBox(-0.7F, 0.05F, 1F, 1, 1, 1, 0F, -0.4F, -0.05F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.4F, -0.05F, -0.45F, -0.45F, -0.85F, -0.45F, -0.4F, -1.0F, -0.45F, -0.4F, -1.0F, -0.45F, -0.45F, -0.85F, -0.45F); // Import
        defaultStockModel[19].setRotationPoint(-7.5F, -2.9F, -0.9F);
        defaultStockModel[19].rotateAngleZ = 0.87266463F;

        defaultStockModel[20].addShapeBox(-0.1F, -0.9F, 1F, 1, 1, 1, 0F, -0.4F, -1.0F, -0.45F, -0.5F, -1.0F, -0.45F, -0.5F, -1.0F, -0.45F, -0.4F, -1.0F, -0.45F, -0.35F, 0.1F, -0.45F, -0.4F, 0.1F, -0.45F, -0.4F, 0.1F, -0.45F, -0.35F, 0.1F, -0.45F); // Import
        defaultStockModel[20].setRotationPoint(-7.5F, -2.9F, -0.9F);
        defaultStockModel[20].rotateAngleZ = 0.87266463F;

        defaultStockModel[21].addShapeBox(-0.9F, -0.9F, 1F, 1, 1, 1, 0F, -0.5F, -1.0F, -0.45F, -0.4F, -1.0F, -0.45F, -0.4F, -1.0F, -0.45F, -0.5F, -1.0F, -0.45F, -0.4F, 0.1F, -0.45F, -0.35F, 0.1F, -0.45F, -0.35F, 0.1F, -0.45F, -0.4F, 0.1F, -0.45F); // Import
        defaultStockModel[21].setRotationPoint(-7.5F, -2.9F, -0.9F);
        defaultStockModel[21].rotateAngleZ = 0.87266463F;

        defaultStockModel[22].addShapeBox(-0.9F, -0.2F, 1F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F); // Import
        defaultStockModel[22].setRotationPoint(-7.5F, -2.9F, -0.9F);
        defaultStockModel[22].rotateAngleZ = 0.87266463F;

        defaultStockModel[23].addShapeBox(0F, -0.2F, 1F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F); // Import
        defaultStockModel[23].setRotationPoint(-7.5F, -2.9F, -0.9F);
        defaultStockModel[23].rotateAngleZ = 0.87266463F;

        defaultStockModel[24].addShapeBox(-0.5F, -0.6F, 1F, 1, 1, 1, 0F, 0.0F, -1.0F, -0.45F, 0.0F, -1.0F, -0.45F, 0.0F, -1.0F, -0.45F, 0.0F, -1.0F, -0.45F, -0.1F, 0.1F, -0.45F, -0.1F, 0.1F, -0.45F, -0.1F, 0.1F, -0.45F, -0.1F, 0.1F, -0.45F); // Import
        defaultStockModel[24].setRotationPoint(-7.5F, -2.9F, -0.9F);
        defaultStockModel[24].rotateAngleZ = 0.87266463F;

        defaultStockModel[25].addShapeBox(-0.6F, 0.05F, 1F, 1, 1, 1, 0F, -0.45F, 0.1F, -0.45F, -0.25F, 0.1F, -0.45F, -0.25F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.5F, -1.0F, -0.45F, -0.3F, -1.0F, -0.45F, -0.3F, -1.0F, -0.45F, -0.5F, -1.0F, -0.45F); // Import
        defaultStockModel[25].setRotationPoint(-7.5F, -2.9F, -2.1F);
        defaultStockModel[25].rotateAngleZ = 0.87266463F;

        defaultStockModel[26].addShapeBox(-0.3F, 0.05F, 1F, 1, 1, 1, 0F, -0.45F, 0.1F, -0.45F, -0.4F, -0.05F, -0.45F, -0.4F, -0.05F, -0.45F, -0.45F, 0.1F, -0.45F, -0.4F, -1.0F, -0.45F, -0.45F, -0.85F, -0.45F, -0.45F, -0.85F, -0.45F, -0.4F, -1.0F, -0.45F); // Import
        defaultStockModel[26].setRotationPoint(-7.5F, -2.9F, -2.1F);
        defaultStockModel[26].rotateAngleZ = 0.87266463F;

        defaultStockModel[27].addShapeBox(-0.1F, -0.9F, 1F, 1, 1, 1, 0F, -0.4F, -1.0F, -0.45F, -0.5F, -1.0F, -0.45F, -0.5F, -1.0F, -0.45F, -0.4F, -1.0F, -0.45F, -0.35F, 0.1F, -0.45F, -0.4F, 0.1F, -0.45F, -0.4F, 0.1F, -0.45F, -0.35F, 0.1F, -0.45F); // Import
        defaultStockModel[27].setRotationPoint(-7.5F, -2.9F, -2.1F);
        defaultStockModel[27].rotateAngleZ = 0.87266463F;

        defaultStockModel[28].addShapeBox(0F, -0.2F, 1F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F); // Import
        defaultStockModel[28].setRotationPoint(-7.5F, -2.9F, -2.1F);
        defaultStockModel[28].rotateAngleZ = 0.87266463F;

        defaultStockModel[29].addShapeBox(-0.5F, -0.6F, 1F, 1, 1, 1, 0F, 0.0F, -1.0F, -0.45F, 0.0F, -1.0F, -0.45F, 0.0F, -1.0F, -0.45F, 0.0F, -1.0F, -0.45F, -0.1F, 0.1F, -0.45F, -0.1F, 0.1F, -0.45F, -0.1F, 0.1F, -0.45F, -0.1F, 0.1F, -0.45F); // Import
        defaultStockModel[29].setRotationPoint(-7.5F, -2.9F, -2.1F);
        defaultStockModel[29].rotateAngleZ = 0.87266463F;

        defaultStockModel[30].addShapeBox(-0.9F, -0.2F, 1F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F); // Import
        defaultStockModel[30].setRotationPoint(-7.5F, -2.9F, -2.1F);
        defaultStockModel[30].rotateAngleZ = 0.87266463F;

        defaultStockModel[31].addShapeBox(-0.9F, -0.9F, 1F, 1, 1, 1, 0F, -0.5F, -1.0F, -0.45F, -0.4F, -1.0F, -0.45F, -0.4F, -1.0F, -0.45F, -0.5F, -1.0F, -0.45F, -0.4F, 0.1F, -0.45F, -0.35F, 0.1F, -0.45F, -0.35F, 0.1F, -0.45F, -0.4F, 0.1F, -0.45F); // Import
        defaultStockModel[31].setRotationPoint(-7.5F, -2.9F, -2.1F);
        defaultStockModel[31].rotateAngleZ = 0.87266463F;

        defaultStockModel[32].addShapeBox(-0.7F, 0.05F, 1F, 1, 1, 1, 0F, -0.4F, -0.05F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.4F, -0.05F, -0.45F, -0.45F, -0.85F, -0.45F, -0.4F, -1.0F, -0.45F, -0.4F, -1.0F, -0.45F, -0.45F, -0.85F, -0.45F); // Import
        defaultStockModel[32].setRotationPoint(-7.5F, -2.9F, -2.1F);
        defaultStockModel[32].rotateAngleZ = 0.87266463F;

        defaultStockModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.3F, 0.001F, 0.0F, -0.3F, 0.001F, 0.0F, -0.3F, 0.001F, 0.0F, -0.3F, 0.001F, 0.0F, -0.3F, 0.001F, 0.0F, -0.3F, 0.001F, 0.0F, -0.3F, 0.001F, 0.0F, -0.3F, 0.001F); // Import
        defaultStockModel[33].setRotationPoint(-7.3F, -3.9F, -0.5F);
        defaultStockModel[33].rotateAngleZ = 0.2617994F;

        defaultStockModel[34].addShapeBox(1.6F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, 0.001F, -0.5F, -0.4F, 0.001F, -0.5F, -0.4F, 0.001F, -0.4F, -0.3F, 0.001F, -0.4F, -0.3F, 0.001F, -0.5F, -0.4F, 0.001F, -0.5F, -0.4F, 0.001F, -0.4F, -0.3F, 0.001F); // Import
        defaultStockModel[34].setRotationPoint(-7.3F, -3.9F, -0.5F);
        defaultStockModel[34].rotateAngleZ = 0.2617994F;

        defaultStockModel[35].addShapeBox(-0.6F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.4F, 0.001F, -0.4F, -0.3F, 0.001F, -0.4F, -0.3F, 0.001F, -0.5F, -0.4F, 0.001F, -0.5F, -0.4F, 0.001F, -0.4F, -0.3F, 0.001F, -0.4F, -0.3F, 0.001F, -0.5F, -0.4F, 0.001F); // Import
        defaultStockModel[35].setRotationPoint(-7.3F, -3.9F, -0.5F);
        defaultStockModel[35].rotateAngleZ = 0.2617994F;


        ammoModel = new ModelRendererTurbo[22];
        ammoModel[0] = new ModelRendererTurbo(this, 81, 95, textureX, textureY); // Box 363
        ammoModel[1] = new ModelRendererTurbo(this, 68, 95, textureX, textureY); // Box 363
        ammoModel[2] = new ModelRendererTurbo(this, 56, 95, textureX, textureY); // Box 363
        ammoModel[3] = new ModelRendererTurbo(this, 42, 95, textureX, textureY); // Box 363
        ammoModel[4] = new ModelRendererTurbo(this, 94, 95, textureX, textureY); // Box 363
        ammoModel[5] = new ModelRendererTurbo(this, 107, 95, textureX, textureY); // Box 363
        ammoModel[6] = new ModelRendererTurbo(this, 122, 95, textureX, textureY); // Box 363
        ammoModel[7] = new ModelRendererTurbo(this, 191, 85, textureX, textureY); // Box 318
        ammoModel[8] = new ModelRendererTurbo(this, 191, 90, textureX, textureY); // Box 318
        ammoModel[9] = new ModelRendererTurbo(this, 191, 98, textureX, textureY); // Box 318
        ammoModel[10] = new ModelRendererTurbo(this, 31, 98, textureX, textureY); // Box 321
        ammoModel[11] = new ModelRendererTurbo(this, 191, 85, textureX, textureY); // Box 318
        ammoModel[12] = new ModelRendererTurbo(this, 191, 90, textureX, textureY); // Box 318
        ammoModel[13] = new ModelRendererTurbo(this, 191, 98, textureX, textureY); // Box 318
        ammoModel[14] = new ModelRendererTurbo(this, 31, 98, textureX, textureY); // Box 321
        ammoModel[15] = new ModelRendererTurbo(this, 63, 187, textureX, textureY); // Box 363
        ammoModel[16] = new ModelRendererTurbo(this, 43, 187, textureX, textureY); // Box 363
        ammoModel[17] = new ModelRendererTurbo(this, 23, 187, textureX, textureY); // Box 363
        ammoModel[18] = new ModelRendererTurbo(this, 3, 187, textureX, textureY); // Box 363
        ammoModel[19] = new ModelRendererTurbo(this, 83, 187, textureX, textureY); // Box 363
        ammoModel[20] = new ModelRendererTurbo(this, 103, 187, textureX, textureY); // Box 363
        ammoModel[21] = new ModelRendererTurbo(this, 123, 187, textureX, textureY); // Box 363

        ammoModel[0].addShapeBox(4F, -3F, -0.5F, 4, 2, 1, 0F, 0F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0.4F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.4F, 0F, 0F); // Box 363
        ammoModel[0].setRotationPoint(0.1F, -6.4F, 0F);
        ammoModel[0].rotateAngleZ = -1.18682389F;

        ammoModel[1].addShapeBox(4F, -3F, 0.5F, 4, 2, 1, 0F, 0F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, 0.4F, 0F, 0F, 0.9F, 0F, 0F, 0.65F, 0F, -0.15F, 0.15F, 0F, -0.15F); // Box 363
        ammoModel[1].setRotationPoint(0.1F, -6.4F, 0F);
        ammoModel[1].rotateAngleZ = -1.18682389F;

        ammoModel[2].addShapeBox(4F, -3F, 1.05F, 4, 2, 1, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.3F, 0F, -0.35F, -0.8F, 0F, -0.35F, 0.15F, 0F, -0.3F, 0.65F, 0F, -0.3F, 0.1F, 0F, -0.05F, -0.4F, 0F, -0.05F); // Box 363
        ammoModel[2].setRotationPoint(0.1F, -6.4F, 0F);
        ammoModel[2].rotateAngleZ = -1.18682389F;

        ammoModel[3].addShapeBox(4F, -3F, 1.7F, 4, 2, 1, 0F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -1.3F, 0F, -0.55F, -1.8F, 0F, -0.55F, -0.4F, 0F, -0.3F, 0.1F, 0F, -0.3F, -1F, 0F, -0.15F, -1.5F, 0F, -0.15F); // Box 363
        ammoModel[3].setRotationPoint(0.1F, -6.4F, 0F);
        ammoModel[3].rotateAngleZ = -1.18682389F;

        ammoModel[4].addShapeBox(4F, -3F, -1.5F, 4, 2, 1, 0F, -0.25F, 0F, -0.45F, 0.25F, 0F, -0.45F, 0.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0.15F, 0F, -0.15F, 0.65F, 0F, -0.15F, 0.9F, 0F, 0F, 0.4F, 0F, 0F); // Box 363
        ammoModel[4].setRotationPoint(0.1F, -6.4F, 0F);
        ammoModel[4].rotateAngleZ = -1.18682389F;

        ammoModel[5].addShapeBox(4F, -3F, -2.05F, 4, 2, 1, 0F, -0.8F, 0F, -0.35F, -0.3F, 0F, -0.35F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.4F, 0F, 0.05F, 0.1F, 0F, 0.05F, 0.65F, 0F, -0.3F, 0.15F, 0F, -0.3F); // Box 363
        ammoModel[5].setRotationPoint(0.1F, -6.4F, 0F);
        ammoModel[5].rotateAngleZ = -1.18682389F;

        ammoModel[6].addShapeBox(4F, -3F, -2.7F, 4, 2, 1, 0F, -1.8F, 0F, -0.55F, -1.3F, 0F, -0.55F, -0.3F, 0F, 0F, -0.8F, 0F, 0F, -1.5F, 0F, -0.15F, -1F, 0F, -0.15F, 0.1F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 363
        ammoModel[6].setRotationPoint(0.1F, -6.4F, 0F);
        ammoModel[6].rotateAngleZ = -1.18682389F;

        ammoModel[7].addShapeBox(4.75F, -4F, -0.5F, 3, 1, 1, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
        ammoModel[7].setRotationPoint(0.1F, -6.4F, 0F);
        ammoModel[7].rotateAngleZ = -1.18682389F;

        ammoModel[8].addShapeBox(4.75F, -4F, 0.5F, 3, 1, 1, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 318
        ammoModel[8].setRotationPoint(0.1F, -6.4F, 0F);
        ammoModel[8].rotateAngleZ = -1.18682389F;

        ammoModel[9].addShapeBox(4.75F, -4F, -1.5F, 3, 1, 1, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
        ammoModel[9].setRotationPoint(0.1F, -6.4F, 0F);
        ammoModel[9].rotateAngleZ = -1.18682389F;

        ammoModel[10].addShapeBox(3F, -2.2F, -0.5F, 1, 1, 1, 0F, 0.2F, 1F, -0.15F, 0.2F, 0.7F, -0.15F, 0.2F, 0.7F, -0.15F, 0.2F, 1F, -0.15F, 0.5F, -0.1F, -0.15F, 0F, 0.2F, -0.15F, 0F, 0.2F, -0.15F, 0.5F, -0.1F, -0.15F); // Box 321
        ammoModel[10].setRotationPoint(0.1F, -6.4F, 0F);
        ammoModel[10].rotateAngleZ = -1.18682389F;

        ammoModel[11].addShapeBox(4.75F, -1.4F, -0.5F, 3, 1, 1, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
        ammoModel[11].setRotationPoint(0.1F, -6.4F, 0F);
        ammoModel[11].rotateAngleZ = -1.18682389F;

        ammoModel[12].addShapeBox(4.75F, -1.4F, 0.5F, 3, 1, 1, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 318
        ammoModel[12].setRotationPoint(0.1F, -6.4F, 0F);
        ammoModel[12].rotateAngleZ = -1.18682389F;

        ammoModel[13].addShapeBox(4.75F, -1.4F, -1.5F, 3, 1, 1, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
        ammoModel[13].setRotationPoint(0.1F, -6.4F, 0F);
        ammoModel[13].rotateAngleZ = -1.18682389F;

        ammoModel[14].addShapeBox(8F, -2.2F, -0.5F, 1, 1, 1, 0F, 0F, 0.7F, -0.4F, -0.4F, 0.7F, -0.4F, -0.4F, 0.7F, -0.4F, 0F, 0.7F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F); // Box 321
        ammoModel[14].setRotationPoint(0.1F, -6.4F, 0F);
        ammoModel[14].rotateAngleZ = -1.18682389F;

        ammoModel[15].addShapeBox(4F, -1.8F, -0.499999999999999F, 4, 2, 1, 0F, 0.4F, -0.8F, 0F, 0.9F, -0.8F, 0F, 0.9F, -0.8F, 0F, 0.4F, -0.8F, 0F, 0.4F, -0.8F, 0F, 0.9F, -0.8F, 0F, 0.9F, -0.8F, 0F, 0.4F, -0.8F, 0F); // Box 363
        ammoModel[15].setRotationPoint(0.1F, -6.4F, 0F);
        ammoModel[15].rotateAngleZ = -1.18682389F;

        ammoModel[16].addShapeBox(4F, -1.8F, 0.500000000000001F, 4, 2, 1, 0F, 0.4F, -0.8F, 0F, 0.9F, -0.8F, 0F, 0.65F, -0.8F, -0.15F, 0.15F, -0.8F, -0.15F, 0.4F, -0.8F, 0F, 0.9F, -0.8F, 0F, 0.65F, -0.8F, -0.15F, 0.15F, -0.8F, -0.15F); // Box 363
        ammoModel[16].setRotationPoint(0.1F, -6.4F, 0F);
        ammoModel[16].rotateAngleZ = -1.18682389F;

        ammoModel[17].addShapeBox(4F, -1.8F, 1.05F, 4, 2, 1, 0F, 0.15F, -0.8F, -0.3F, 0.65F, -0.8F, -0.3F, 0.1F, -0.8F, -0.05F, -0.4F, -0.8F, -0.05F, 0.15F, -0.8F, -0.3F, 0.65F, -0.8F, -0.3F, 0.1F, -0.8F, -0.05F, -0.4F, -0.8F, -0.05F); // Box 363
        ammoModel[17].setRotationPoint(0.1F, -6.4F, 0F);
        ammoModel[17].rotateAngleZ = -1.18682389F;

        ammoModel[18].addShapeBox(4F, -1.8F, 1.7F, 4, 2, 1, 0F, -0.4F, -0.8F, -0.3F, 0.1F, -0.8F, -0.3F, -1F, -0.8F, -0.15F, -1.5F, -0.8F, -0.15F, -0.4F, -0.8F, -0.3F, 0.1F, -0.8F, -0.3F, -1F, -0.8F, -0.15F, -1.5F, -0.8F, -0.15F); // Box 363
        ammoModel[18].setRotationPoint(0.1F, -6.4F, 0F);
        ammoModel[18].rotateAngleZ = -1.18682389F;

        ammoModel[19].addShapeBox(4F, -1.8F, -1.5F, 4, 2, 1, 0F, 0.15F, -0.8F, -0.15F, 0.65F, -0.8F, -0.15F, 0.9F, -0.8F, 0F, 0.4F, -0.8F, 0F, 0.15F, -0.8F, -0.15F, 0.65F, -0.8F, -0.15F, 0.9F, -0.8F, 0F, 0.4F, -0.8F, 0F); // Box 363
        ammoModel[19].setRotationPoint(0.1F, -6.4F, 0F);
        ammoModel[19].rotateAngleZ = -1.18682389F;

        ammoModel[20].addShapeBox(4F, -1.8F, -2.05F, 4, 2, 1, 0F, -0.4F, -0.8F, 0.05F, 0.1F, -0.8F, 0.05F, 0.65F, -0.8F, -0.3F, 0.15F, -0.8F, -0.3F, -0.4F, -0.8F, 0.05F, 0.1F, -0.8F, 0.05F, 0.65F, -0.8F, -0.3F, 0.15F, -0.8F, -0.3F); // Box 363
        ammoModel[20].setRotationPoint(0.1F, -6.4F, 0F);
        ammoModel[20].rotateAngleZ = -1.18682389F;

        ammoModel[21].addShapeBox(4F, -1.8F, -2.7F, 4, 2, 1, 0F, -1.5F, -0.8F, -0.15F, -1F, -0.8F, -0.15F, 0.1F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -1.5F, -0.8F, -0.15F, -1F, -0.8F, -0.15F, 0.1F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F); // Box 363
        ammoModel[21].setRotationPoint(0.1F, -6.4F, 0F);
        ammoModel[21].rotateAngleZ = -1.18682389F;


        slideModel = new ModelRendererTurbo[5];
        slideModel[0] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Import
        slideModel[1] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Import
        slideModel[2] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Import
        slideModel[3] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Import
        slideModel[4] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Import

        slideModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, 0.8F, 0.0F, -0.45F, 0.8F, 0.0F, -0.45F, 0.8F, 0.0F, -0.45F, 0.8F, 0.0F, -0.45F, -1.4F, 0.0F, -0.45F, -1.4F, 0.0F, -0.45F, -1.4F, 0.0F, -0.45F, -1.4F, 0.0F); // Import
        slideModel[0].setRotationPoint(3.85F, -4.65F, -1.2F);

        slideModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, 0.7F, 0.1F, -0.45F, 0.7F, 0.1F, -0.45F, 0.8F, -1.0F, -0.45F, 0.8F, -1.0F, -0.45F, -1.5F, 0.1F, -0.45F, -1.5F, 0.1F, -0.45F, -1.4F, -1.0F, -0.45F, -1.4F, -1.0F); // Import
        slideModel[1].setRotationPoint(3.85F, -4.65F, -1.2F);

        slideModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.0F, -0.15F, -0.2F, -0.1F, -0.15F, -0.2F, -0.1F, -0.15F, -0.35F, 0.0F, -0.15F, -0.35F, 0.0F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.35F, 0.0F, -0.3F, -0.35F); // Import
        slideModel[2].setRotationPoint(1.5F, -5.7F, -0.65F);

        slideModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.45F, -0.4F, -0.35F, -0.6F, -0.4F, -0.35F, -0.6F, -0.4F, -0.35F, 0.45F, -0.4F, -0.35F, 0.5F, -0.45F, -0.2F, -0.6F, -0.45F, -0.2F, -0.6F, -0.45F, -0.35F, 0.5F, -0.45F, -0.35F); // Import
        slideModel[3].setRotationPoint(2F, -6.1F, -0.65F);

        slideModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.15F, -0.75F, -0.3F, -0.6F, -0.75F, -0.3F, -0.6F, -0.75F, -0.5F, 0.15F, -0.75F, -0.5F, 0.45F, 0.05F, -0.2F, -0.6F, 0.05F, -0.2F, -0.6F, 0.05F, -0.5F, 0.45F, 0.05F, -0.5F); // Import
        slideModel[4].setRotationPoint(2F, -6.75F, -0.5F);


        scopeAttachPoint = new Vector3f(5F / 64F, 25F / 64F, 0F / 16F);
        barrelAttachPoint = new Vector3f(64.1F / 64F, 19.5F / 64F, 0F / 16F);
        stockAttachPoint = new Vector3f(-8.1F / 64F, 18F / 64F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(41.5F / 64F, 19.5F / 64F, -3F / 64F);
        gripAttachPoint = new Vector3f(39.5F / 64F, 16F / 64F, 0F / 16F);


        gunSlideDistance = 0.15F;
        animationType = EnumAnimationType.CUSTOM;
        hasFlash = true;
        hasArms = true;
        leftArmPos = new Vector3f(0.05F, -0.4F, -0.05F);
        leftArmRot = new Vector3f(80.0F, 50.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.15F, -0.55F, 0.05F);
        leftArmReloadRot = new Vector3f(80.0F, 50.0F, 0.0F);
        rightArmPos = new Vector3f(0.25F, -0.52F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmReloadPos = new Vector3f(0.25F, -0.52F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
        rotateGunHorizontal = 15.0F;
        tiltGun = 30.0F;
        translateGun = new Vector3f(0.0F, -0.0625F, -0.186F);
        translateClip = new Vector3f(0.0F, -0.625F, 0.0F);
        translateAll(0.5F, 0.0F, 0.0F);
        rightHandAmmo = false;
        leftHandAmmo = true;
        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);
        casingAttachPoint = new Vector3f(1.0F, 1.6F, 0.0F);
        casingAnimDistance = new Vector3f(0.0F, 3.0F, 7.75F);
        casingAnimSpread = new Vector3f(3.0F, 5.0F, 3.0F);
        casingAnimTime = 6;
        casingRotateVector = new Vector3f(0.1F, 0.0F, 0.1F);
        caseScale = 0.2F;
        casingDelay = 0;

        Vector3f vec3 = new Vector3f(1F, -1F, 0F);
        translateAll(vec3.x, -vec3.y, vec3.z);
        vec3.y = ((Vector3f) vec3.scale(1 / 16F)).y;
        barrelAttachPoint = Vector3f.add(barrelAttachPoint, vec3, null);
        gadgetAttachPoint = Vector3f.add(gadgetAttachPoint, vec3, null);
        scopeAttachPoint = Vector3f.add(scopeAttachPoint, vec3, null);
        gripAttachPoint = Vector3f.add(gripAttachPoint, vec3, null);

        flashScale = 0.4F;
        muzzleFlashPoint = new Vector3f(2.7F, 0.7F, 0.0F);
        thirdPersonOffset = new Vector3f(-0.1F, -0.05F, 0.0F);
        crouchZoom = -0.05F;
        zoomOffset = 0.3F;
        ShakeDistance = 0.6F;
        gunOffset = -0.85F;
        gunOffsetX = -1F;

        hasFlash = true;
        flashScale = 0.5F;
        muzzleFlashPoint = new Vector3f(
                barrelAttachPoint.x / flashScale,
                barrelAttachPoint.y / flashScale,
                barrelAttachPoint.z / flashScale
        );


        flipAll();
    }
}