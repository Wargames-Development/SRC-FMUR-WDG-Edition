//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CombatAxe
// Model Creator:
// Created on:-
// Last changed on: -

package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelCombatAxe extends ModelBase {
    public ModelRendererTurbo combataxeModel[];
    int textureX = 512;
    int textureY = 512;

    public ModelCombatAxe() {
        combataxeModel = new ModelRendererTurbo[223];
        combataxeModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
        combataxeModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box1
        combataxeModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box2
        combataxeModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box3
        combataxeModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box4
        combataxeModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box5
        combataxeModel[6] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box6
        combataxeModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box7
        combataxeModel[8] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box8
        combataxeModel[9] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box9
        combataxeModel[10] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box10
        combataxeModel[11] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box11
        combataxeModel[12] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box12
        combataxeModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box13
        combataxeModel[14] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box14
        combataxeModel[15] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box15
        combataxeModel[16] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box16
        combataxeModel[17] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box17
        combataxeModel[18] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box18
        combataxeModel[19] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box19
        combataxeModel[20] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box20
        combataxeModel[21] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box21
        combataxeModel[22] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box23
        combataxeModel[23] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import Box25
        combataxeModel[24] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box26
        combataxeModel[25] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box28
        combataxeModel[26] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import Box29
        combataxeModel[27] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box30
        combataxeModel[28] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import Box31
        combataxeModel[29] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import Box32
        combataxeModel[30] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import Box33
        combataxeModel[31] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box34
        combataxeModel[32] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Box35
        combataxeModel[33] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box36
        combataxeModel[34] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box37
        combataxeModel[35] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import Box38
        combataxeModel[36] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import Box39
        combataxeModel[37] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Import Box40
        combataxeModel[38] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import Box41
        combataxeModel[39] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Import Box42
        combataxeModel[40] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Import Box43
        combataxeModel[41] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import Box44
        combataxeModel[42] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box46
        combataxeModel[43] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Import Box47
        combataxeModel[44] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Import Box48
        combataxeModel[45] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box49
        combataxeModel[46] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box50
        combataxeModel[47] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box51
        combataxeModel[48] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box52
        combataxeModel[49] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Import Box65
        combataxeModel[50] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Import Box66
        combataxeModel[51] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Import Box67
        combataxeModel[52] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Import Box68
        combataxeModel[53] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Import Box69
        combataxeModel[54] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Import Box70
        combataxeModel[55] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Import Box116
        combataxeModel[56] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Import Box117
        combataxeModel[57] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Import Box118
        combataxeModel[58] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Import Box122
        combataxeModel[59] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Import Box123
        combataxeModel[60] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import Box128
        combataxeModel[61] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Import Box129
        combataxeModel[62] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import Box80
        combataxeModel[63] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box81
        combataxeModel[64] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import Box82
        combataxeModel[65] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Import Box83
        combataxeModel[66] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Import Box84
        combataxeModel[67] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import Box85
        combataxeModel[68] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import Box86
        combataxeModel[69] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Import Box87
        combataxeModel[70] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box88
        combataxeModel[71] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box89
        combataxeModel[72] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box90
        combataxeModel[73] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box91
        combataxeModel[74] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box92
        combataxeModel[75] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box93
        combataxeModel[76] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box94
        combataxeModel[77] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box95
        combataxeModel[78] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box96
        combataxeModel[79] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box97
        combataxeModel[80] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box98
        combataxeModel[81] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box99
        combataxeModel[82] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box100
        combataxeModel[83] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box101
        combataxeModel[84] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box102
        combataxeModel[85] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box103
        combataxeModel[86] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box104
        combataxeModel[87] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box105
        combataxeModel[88] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box106
        combataxeModel[89] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box107
        combataxeModel[90] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box108
        combataxeModel[91] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box109
        combataxeModel[92] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box110
        combataxeModel[93] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box111
        combataxeModel[94] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box112
        combataxeModel[95] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box113
        combataxeModel[96] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box114
        combataxeModel[97] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box115
        combataxeModel[98] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box116
        combataxeModel[99] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box117
        combataxeModel[100] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box118
        combataxeModel[101] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box119
        combataxeModel[102] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box120
        combataxeModel[103] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box121
        combataxeModel[104] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box122
        combataxeModel[105] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box123
        combataxeModel[106] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box124
        combataxeModel[107] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box125
        combataxeModel[108] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box126
        combataxeModel[109] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box127
        combataxeModel[110] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box128
        combataxeModel[111] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box129
        combataxeModel[112] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box130
        combataxeModel[113] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box131
        combataxeModel[114] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box132
        combataxeModel[115] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box133
        combataxeModel[116] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box134
        combataxeModel[117] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box135
        combataxeModel[118] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box136
        combataxeModel[119] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box137
        combataxeModel[120] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box138
        combataxeModel[121] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box139
        combataxeModel[122] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box140
        combataxeModel[123] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box141
        combataxeModel[124] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box142
        combataxeModel[125] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box143
        combataxeModel[126] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box144
        combataxeModel[127] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box145
        combataxeModel[128] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box146
        combataxeModel[129] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box147
        combataxeModel[130] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box148
        combataxeModel[131] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box149
        combataxeModel[132] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box150
        combataxeModel[133] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box151
        combataxeModel[134] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box152
        combataxeModel[135] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box153
        combataxeModel[136] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box154
        combataxeModel[137] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box155
        combataxeModel[138] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box156
        combataxeModel[139] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box157
        combataxeModel[140] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box158
        combataxeModel[141] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box159
        combataxeModel[142] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box160
        combataxeModel[143] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box161
        combataxeModel[144] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box162
        combataxeModel[145] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box163
        combataxeModel[146] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box164
        combataxeModel[147] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box165
        combataxeModel[148] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box166
        combataxeModel[149] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box167
        combataxeModel[150] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box168
        combataxeModel[151] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box169
        combataxeModel[152] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box170
        combataxeModel[153] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box171
        combataxeModel[154] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box172
        combataxeModel[155] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box173
        combataxeModel[156] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box174
        combataxeModel[157] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box175
        combataxeModel[158] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box176
        combataxeModel[159] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box177
        combataxeModel[160] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box178
        combataxeModel[161] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box179
        combataxeModel[162] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box180
        combataxeModel[163] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box181
        combataxeModel[164] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box182
        combataxeModel[165] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box183
        combataxeModel[166] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box184
        combataxeModel[167] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box185
        combataxeModel[168] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box186
        combataxeModel[169] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box187
        combataxeModel[170] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box188
        combataxeModel[171] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box189
        combataxeModel[172] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box190
        combataxeModel[173] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box191
        combataxeModel[174] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box192
        combataxeModel[175] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box193
        combataxeModel[176] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box194
        combataxeModel[177] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box195
        combataxeModel[178] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box196
        combataxeModel[179] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box197
        combataxeModel[180] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box198
        combataxeModel[181] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box199
        combataxeModel[182] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box200
        combataxeModel[183] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box201
        combataxeModel[184] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box202
        combataxeModel[185] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box203
        combataxeModel[186] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box204
        combataxeModel[187] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box205
        combataxeModel[188] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box206
        combataxeModel[189] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box207
        combataxeModel[190] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box208
        combataxeModel[191] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box209
        combataxeModel[192] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box210
        combataxeModel[193] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box211
        combataxeModel[194] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box212
        combataxeModel[195] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box213
        combataxeModel[196] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box214
        combataxeModel[197] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box216
        combataxeModel[198] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box217
        combataxeModel[199] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box218
        combataxeModel[200] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box219
        combataxeModel[201] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box220
        combataxeModel[202] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box221
        combataxeModel[203] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box222
        combataxeModel[204] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box223
        combataxeModel[205] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box224
        combataxeModel[206] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box225
        combataxeModel[207] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box226
        combataxeModel[208] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box227
        combataxeModel[209] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box228
        combataxeModel[210] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box229
        combataxeModel[211] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box230
        combataxeModel[212] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box231
        combataxeModel[213] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box232
        combataxeModel[214] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box233
        combataxeModel[215] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box234
        combataxeModel[216] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box235
        combataxeModel[217] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box236
        combataxeModel[218] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box237
        combataxeModel[219] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box238
        combataxeModel[220] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box239
        combataxeModel[221] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box240
        combataxeModel[222] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box241

        combataxeModel[0].addShapeBox(-5F, -27F, -0.5F, 12, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -0.5F, 0F, 0F); // Import Box0
        combataxeModel[0].setRotationPoint(0F, 0F, 0F);
        combataxeModel[0].rotateAngleY = -3.14159265F;
        combataxeModel[0].rotateAngleZ = 3.14159265F;

        combataxeModel[1].addShapeBox(5F, -34F, -0.5F, 2, 2, 1, 0F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box1
        combataxeModel[1].setRotationPoint(0F, 0F, 0F);
        combataxeModel[1].rotateAngleY = -3.14159265F;
        combataxeModel[1].rotateAngleZ = 3.14159265F;

        combataxeModel[2].addShapeBox(7F, -34F, -0.5F, 6, 2, 1, 0F, 0F, 0F, 0F, -4.5F, 1.5F, 0F, -4.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F); // Import Box2
        combataxeModel[2].setRotationPoint(0F, 0F, 0F);
        combataxeModel[2].rotateAngleY = -3.14159265F;
        combataxeModel[2].rotateAngleZ = 3.14159265F;

        combataxeModel[3].addShapeBox(7F, -32F, -0.5F, 5, 9, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 1F, 0F, 0F); // Import Box3
        combataxeModel[3].setRotationPoint(0F, 0F, 0F);
        combataxeModel[3].rotateAngleY = -3.14159265F;
        combataxeModel[3].rotateAngleZ = 3.14159265F;

        combataxeModel[4].addShapeBox(12F, -36F, -0.5F, 3, 6, 1, 0F, 3.5F, -0.5F, 0F, -3.5F, -0.5F, -0.375F, -3.5F, -0.5F, -0.375F, 3.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F); // Import Box4
        combataxeModel[4].setRotationPoint(0F, 0F, 0F);
        combataxeModel[4].rotateAngleY = -3.14159265F;
        combataxeModel[4].rotateAngleZ = 3.14159265F;

        combataxeModel[5].addShapeBox(8.5F, -37.5F, -0.5F, 3, 2, 1, 0F, 0.5F, -1F, 0F, -1F, -0.5F, -0.375F, -1F, -0.5F, -0.375F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F); // Import Box5
        combataxeModel[5].setRotationPoint(0F, 0F, 0F);
        combataxeModel[5].rotateAngleY = -3.14159265F;
        combataxeModel[5].rotateAngleZ = 3.14159265F;

        combataxeModel[6].addShapeBox(10.5F, -30F, -0.5F, 3, 8, 1, 0F, -1.5F, 0F, 0F, 1.5F, 0F, -0.375F, 1.5F, 0F, -0.375F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, -0.375F, -0.5F, 1.5F, -0.375F, 0F, 0F, 0F); // Import Box6
        combataxeModel[6].setRotationPoint(0F, 0F, 0F);
        combataxeModel[6].rotateAngleY = -3.14159265F;
        combataxeModel[6].rotateAngleZ = 3.14159265F;

        combataxeModel[7].addShapeBox(0F, -26F, -0.5F, 6, 2, 1, 0F, 0F, -1F, 0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F); // Import Box7
        combataxeModel[7].setRotationPoint(0F, 0F, 0F);
        combataxeModel[7].rotateAngleY = -3.14159265F;
        combataxeModel[7].rotateAngleZ = 3.14159265F;

        combataxeModel[8].addShapeBox(5.5F, -25.5F, -0.5F, 1, 1, 1, 0F, -1F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box8
        combataxeModel[8].setRotationPoint(0F, 0F, 0F);
        combataxeModel[8].rotateAngleY = -3.14159265F;
        combataxeModel[8].rotateAngleZ = 3.14159265F;

        combataxeModel[9].addShapeBox(0F, -25F, -0.5F, 4, 3, 1, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Import Box9
        combataxeModel[9].setRotationPoint(0F, 0F, 0F);
        combataxeModel[9].rotateAngleY = -3.14159265F;
        combataxeModel[9].rotateAngleZ = 3.14159265F;

        combataxeModel[10].addShapeBox(-2F, -22F, -0.5F, 4, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import Box10
        combataxeModel[10].setRotationPoint(0F, 0F, 0F);
        combataxeModel[10].rotateAngleY = -3.14159265F;
        combataxeModel[10].rotateAngleZ = 3.14159265F;

        combataxeModel[11].addShapeBox(-4F, -24F, -0.5F, 2, 2, 1, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import Box11
        combataxeModel[11].setRotationPoint(0F, 0F, 0F);
        combataxeModel[11].rotateAngleY = -3.14159265F;
        combataxeModel[11].rotateAngleZ = 3.14159265F;

        combataxeModel[12].addShapeBox(-5F, -24F, -0.5F, 1, 2, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F); // Import Box12
        combataxeModel[12].setRotationPoint(0F, 0F, 0F);
        combataxeModel[12].rotateAngleY = -3.14159265F;
        combataxeModel[12].rotateAngleZ = 3.14159265F;

        combataxeModel[13].addShapeBox(-6.5F, -27F, -0.5F, 2, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box13
        combataxeModel[13].setRotationPoint(0F, 0F, 0F);
        combataxeModel[13].rotateAngleY = -3.14159265F;
        combataxeModel[13].rotateAngleZ = 3.14159265F;

        combataxeModel[14].addShapeBox(-7.5F, -26F, -0.5F, 1, 2, 1, 0F, -0.75F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.25F); // Import Box14
        combataxeModel[14].setRotationPoint(0F, 0F, 0F);
        combataxeModel[14].rotateAngleY = -3.14159265F;
        combataxeModel[14].rotateAngleZ = 3.14159265F;

        combataxeModel[15].addShapeBox(-2F, -14F, -0.5F, 4, 1, 1, 0F, 0F, 1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import Box15
        combataxeModel[15].setRotationPoint(0F, 0F, 0F);
        combataxeModel[15].rotateAngleY = -3.14159265F;
        combataxeModel[15].rotateAngleZ = 3.14159265F;

        combataxeModel[16].addShapeBox(-2F, -13F, -0.5F, 4, 1, 1, 0F, 0F, 1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import Box16
        combataxeModel[16].setRotationPoint(0F, 0F, 0F);
        combataxeModel[16].rotateAngleY = -3.14159265F;
        combataxeModel[16].rotateAngleZ = 3.14159265F;

        combataxeModel[17].addShapeBox(-2F, -12F, -0.5F, 4, 1, 1, 0F, 0F, 1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import Box17
        combataxeModel[17].setRotationPoint(0F, 0F, 0F);
        combataxeModel[17].rotateAngleY = -3.14159265F;
        combataxeModel[17].rotateAngleZ = 3.14159265F;

        combataxeModel[18].addShapeBox(-2F, -11F, -0.5F, 4, 1, 1, 0F, 0F, 1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import Box18
        combataxeModel[18].setRotationPoint(0F, 0F, 0F);
        combataxeModel[18].rotateAngleY = -3.14159265F;
        combataxeModel[18].rotateAngleZ = 3.14159265F;

        combataxeModel[19].addShapeBox(-2F, -10F, -0.5F, 4, 1, 1, 0F, 0F, 1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import Box19
        combataxeModel[19].setRotationPoint(0F, 0F, 0F);
        combataxeModel[19].rotateAngleY = -3.14159265F;
        combataxeModel[19].rotateAngleZ = 3.14159265F;

        combataxeModel[20].addShapeBox(-2F, -9F, -0.5F, 4, 1, 1, 0F, 0F, 1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import Box20
        combataxeModel[20].setRotationPoint(0F, 0F, 0F);
        combataxeModel[20].rotateAngleY = -3.14159265F;
        combataxeModel[20].rotateAngleZ = 3.14159265F;

        combataxeModel[21].addShapeBox(-2F, -8F, -0.5F, 4, 9, 1, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box21
        combataxeModel[21].setRotationPoint(0F, 0F, 0F);
        combataxeModel[21].rotateAngleY = -3.14159265F;
        combataxeModel[21].rotateAngleZ = 3.14159265F;

        combataxeModel[22].addShapeBox(-2F, -14F, -0.5F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F); // Import Box23
        combataxeModel[22].setRotationPoint(0F, 0F, 0F);
        combataxeModel[22].rotateAngleY = -3.14159265F;
        combataxeModel[22].rotateAngleZ = 3.14159265F;

        combataxeModel[23].addShapeBox(-2F, -12F, -0.5F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.75F, -0.25F); // Import Box25
        combataxeModel[23].setRotationPoint(0F, 0F, 0F);
        combataxeModel[23].rotateAngleY = -3.14159265F;
        combataxeModel[23].rotateAngleZ = 3.14159265F;

        combataxeModel[24].addShapeBox(-2F, -15F, -0.5F, 4, 1, 1, 0F, 0F, -0.75F, -0.25F, -1F, -2F, -0.25F, -1F, -2F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 0F, 0F); // Import Box26
        combataxeModel[24].setRotationPoint(0F, 0F, 0F);
        combataxeModel[24].rotateAngleY = -3.14159265F;
        combataxeModel[24].rotateAngleZ = 3.14159265F;

        combataxeModel[25].addShapeBox(-2F, -16F, -0.5F, 4, 1, 1, 0F, 0F, -0.75F, -0.25F, -1F, -2F, -0.25F, -1F, -2F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 0F, 0F); // Import Box28
        combataxeModel[25].setRotationPoint(0F, 0F, 0F);
        combataxeModel[25].rotateAngleY = -3.14159265F;
        combataxeModel[25].rotateAngleZ = 3.14159265F;

        combataxeModel[26].addShapeBox(-2F, -13F, -0.5F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.75F, -0.25F); // Import Box29
        combataxeModel[26].setRotationPoint(0F, 0F, 0F);
        combataxeModel[26].rotateAngleY = -3.14159265F;
        combataxeModel[26].rotateAngleZ = 3.14159265F;

        combataxeModel[27].addShapeBox(-2F, -14F, -0.5F, 4, 1, 1, 0F, 0F, -0.75F, -0.25F, -1F, -2F, -0.25F, -1F, -2F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 0F, 0F); // Import Box30
        combataxeModel[27].setRotationPoint(0F, 0F, 0F);
        combataxeModel[27].rotateAngleY = -3.14159265F;
        combataxeModel[27].rotateAngleZ = 3.14159265F;

        combataxeModel[28].addShapeBox(-2F, -11F, -0.5F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.75F, -0.25F); // Import Box31
        combataxeModel[28].setRotationPoint(0F, 0F, 0F);
        combataxeModel[28].rotateAngleY = -3.14159265F;
        combataxeModel[28].rotateAngleZ = 3.14159265F;

        combataxeModel[29].addShapeBox(-2F, -13F, -0.5F, 4, 1, 1, 0F, 0F, -0.75F, -0.25F, -1F, -2F, -0.25F, -1F, -2F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 0F, 0F); // Import Box32
        combataxeModel[29].setRotationPoint(0F, 0F, 0F);
        combataxeModel[29].rotateAngleY = -3.14159265F;
        combataxeModel[29].rotateAngleZ = 3.14159265F;

        combataxeModel[30].addShapeBox(-2F, -10F, -0.5F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.75F, -0.25F); // Import Box33
        combataxeModel[30].setRotationPoint(0F, 0F, 0F);
        combataxeModel[30].rotateAngleY = -3.14159265F;
        combataxeModel[30].rotateAngleZ = 3.14159265F;

        combataxeModel[31].addShapeBox(-2F, -12F, -0.5F, 4, 1, 1, 0F, 0F, -0.75F, -0.25F, -1F, -2F, -0.25F, -1F, -2F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 0F, 0F); // Import Box34
        combataxeModel[31].setRotationPoint(0F, 0F, 0F);
        combataxeModel[31].rotateAngleY = -3.14159265F;
        combataxeModel[31].rotateAngleZ = 3.14159265F;

        combataxeModel[32].addShapeBox(-2F, -9F, -0.5F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.75F, -0.25F); // Import Box35
        combataxeModel[32].setRotationPoint(0F, 0F, 0F);
        combataxeModel[32].rotateAngleY = -3.14159265F;
        combataxeModel[32].rotateAngleZ = 3.14159265F;

        combataxeModel[33].addShapeBox(-2F, -11F, -0.5F, 4, 1, 1, 0F, 0F, -0.75F, -0.25F, -1F, -2F, -0.25F, -1F, -2F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 0F, 0F); // Import Box36
        combataxeModel[33].setRotationPoint(0F, 0F, 0F);
        combataxeModel[33].rotateAngleY = -3.14159265F;
        combataxeModel[33].rotateAngleZ = 3.14159265F;

        combataxeModel[34].addShapeBox(-2F, -8F, -0.5F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.75F, -0.25F); // Import Box37
        combataxeModel[34].setRotationPoint(0F, 0F, 0F);
        combataxeModel[34].rotateAngleY = -3.14159265F;
        combataxeModel[34].rotateAngleZ = 3.14159265F;

        combataxeModel[35].addShapeBox(-2F, -10F, -0.5F, 4, 1, 1, 0F, 0F, -0.75F, -0.25F, -1F, -2.25F, -0.25F, -1F, -2.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F); // Import Box38
        combataxeModel[35].setRotationPoint(0F, 0F, 0F);
        combataxeModel[35].rotateAngleY = -3.14159265F;
        combataxeModel[35].rotateAngleZ = 3.14159265F;

        combataxeModel[36].addShapeBox(-3F, -19F, -1F, 3, 1, 2, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -0.99F, 0F, -0.25F, -0.99F, 0F, -0.25F, -0.99F, 0F, -0.25F, -0.99F, 0F); // Import Box39
        combataxeModel[36].setRotationPoint(0F, 0F, 0F);
        combataxeModel[36].rotateAngleY = -3.14159265F;
        combataxeModel[36].rotateAngleZ = 3.14159265F;

        combataxeModel[37].addShapeBox(-3F, -21F, -1F, 3, 1, 2, 0F, 0F, -0.5F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F); // Import Box40
        combataxeModel[37].setRotationPoint(0F, 0F, 0F);
        combataxeModel[37].rotateAngleY = -3.14159265F;
        combataxeModel[37].rotateAngleZ = 3.14159265F;

        combataxeModel[38].addShapeBox(-1F, -19F, -1F, 1, 18, 2, 0F, -0.75F, 0F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F); // Import Box41
        combataxeModel[38].setRotationPoint(0F, 0F, 0F);
        combataxeModel[38].rotateAngleY = -3.14159265F;
        combataxeModel[38].rotateAngleZ = 3.14159265F;

        combataxeModel[39].addShapeBox(-3F, -20F, -1F, 1, 19, 2, 0F, 0F, 0.5F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F); // Import Box42
        combataxeModel[39].setRotationPoint(0F, 0F, 0F);
        combataxeModel[39].rotateAngleY = -3.14159265F;
        combataxeModel[39].rotateAngleZ = 3.14159265F;

        combataxeModel[40].addShapeBox(-3F, -19F, -1F, 1, 18, 2, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Import Box43
        combataxeModel[40].setRotationPoint(0F, 0F, 0F);
        combataxeModel[40].rotateAngleY = -3.14159265F;
        combataxeModel[40].rotateAngleZ = 3.14159265F;

        combataxeModel[41].addShapeBox(-1F, -19F, -1F, 1, 21, 2, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F); // Import Box44
        combataxeModel[41].setRotationPoint(0F, 0F, 0F);
        combataxeModel[41].rotateAngleY = -3.14159265F;
        combataxeModel[41].rotateAngleZ = 3.14159265F;

        combataxeModel[42].addShapeBox(-2.5F, -18.5F, -1F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box46
        combataxeModel[42].setRotationPoint(0F, 0F, 0F);
        combataxeModel[42].rotateAngleY = -3.14159265F;
        combataxeModel[42].rotateAngleZ = 3.14159265F;

        combataxeModel[43].addShapeBox(-2F, -19F, -1F, 1, 19, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F); // Import Box47
        combataxeModel[43].setRotationPoint(0F, 0F, 0F);
        combataxeModel[43].rotateAngleY = -3.14159265F;
        combataxeModel[43].rotateAngleZ = 3.14159265F;

        combataxeModel[44].addShapeBox(-2.5F, -19F, -1F, 2, 18, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box48
        combataxeModel[44].setRotationPoint(0F, 0F, 0F);
        combataxeModel[44].rotateAngleY = -3.14159265F;
        combataxeModel[44].rotateAngleZ = 3.14159265F;

        combataxeModel[45].addShapeBox(-2.25F, -18.75F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box49
        combataxeModel[45].setRotationPoint(0F, 0F, 0F);
        combataxeModel[45].rotateAngleY = -3.14159265F;
        combataxeModel[45].rotateAngleZ = 3.14159265F;

        combataxeModel[46].addShapeBox(-2.25F, -19.5F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box50
        combataxeModel[46].setRotationPoint(0F, 0F, 0F);
        combataxeModel[46].rotateAngleY = -3.14159265F;
        combataxeModel[46].rotateAngleZ = 3.14159265F;

        combataxeModel[47].addShapeBox(-3F, -19.5F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box51
        combataxeModel[47].setRotationPoint(0F, 0F, 0F);
        combataxeModel[47].rotateAngleY = -3.14159265F;
        combataxeModel[47].rotateAngleZ = 3.14159265F;

        combataxeModel[48].addShapeBox(-3F, -18.75F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box52
        combataxeModel[48].setRotationPoint(0F, 0F, 0F);
        combataxeModel[48].rotateAngleY = -3.14159265F;
        combataxeModel[48].rotateAngleZ = 3.14159265F;

        combataxeModel[49].addShapeBox(-0.5F, -1F, -1F, 1, 3, 2, 0F, 2.25F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Import Box65
        combataxeModel[49].setRotationPoint(0F, 0F, 0F);
        combataxeModel[49].rotateAngleY = -3.14159265F;
        combataxeModel[49].rotateAngleZ = 3.14159265F;

        combataxeModel[50].addShapeBox(-0.5F, -1F, -1F, 1, 3, 2, 0F, 2.5F, 0F, -0.25F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 2.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F); // Import Box66
        combataxeModel[50].setRotationPoint(0F, 0F, 0F);
        combataxeModel[50].rotateAngleY = -3.14159265F;
        combataxeModel[50].rotateAngleZ = 3.14159265F;

        combataxeModel[51].addShapeBox(0.5F, -1F, -1F, 1, 3, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box67
        combataxeModel[51].setRotationPoint(0F, 0F, 0F);
        combataxeModel[51].rotateAngleY = -3.14159265F;
        combataxeModel[51].rotateAngleZ = 3.14159265F;

        combataxeModel[52].addShapeBox(1.5F, -1F, -1F, 1, 3, 2, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F); // Import Box68
        combataxeModel[52].setRotationPoint(0F, 0F, 0F);
        combataxeModel[52].rotateAngleY = -3.14159265F;
        combataxeModel[52].rotateAngleZ = 3.14159265F;

        combataxeModel[53].addShapeBox(1.5F, -1F, -1F, 1, 3, 2, 0F, -0.75F, 0F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0.25F, 0F); // Import Box69
        combataxeModel[53].setRotationPoint(0F, 0F, 0F);
        combataxeModel[53].rotateAngleY = -3.14159265F;
        combataxeModel[53].rotateAngleZ = 3.14159265F;

        combataxeModel[54].addShapeBox(0F, -1F, -1F, 2, 3, 2, 0F, 2.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box70
        combataxeModel[54].setRotationPoint(0F, 0F, 0F);
        combataxeModel[54].rotateAngleY = -3.14159265F;
        combataxeModel[54].rotateAngleZ = 3.14159265F;

        combataxeModel[55].addShapeBox(-0.5F, -2F, -1F, 3, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F); // Import Box116
        combataxeModel[55].setRotationPoint(0F, 0F, 0F);
        combataxeModel[55].rotateAngleY = -3.14159265F;
        combataxeModel[55].rotateAngleZ = 3.14159265F;

        combataxeModel[56].addShapeBox(-0.5F, -3F, -1F, 3, 1, 2, 0F, -0.25F, -0.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F); // Import Box117
        combataxeModel[56].setRotationPoint(0F, 0F, 0F);
        combataxeModel[56].rotateAngleY = -3.14159265F;
        combataxeModel[56].rotateAngleZ = 3.14159265F;

        combataxeModel[57].addShapeBox(-0.5F, -2F, -1F, 1, 4, 2, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Import Box118
        combataxeModel[57].setRotationPoint(0F, 0F, 0F);
        combataxeModel[57].rotateAngleY = -3.14159265F;
        combataxeModel[57].rotateAngleZ = 3.14159265F;

        combataxeModel[58].addShapeBox(-3F, -8F, -0.5F, 1, 9, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box122
        combataxeModel[58].setRotationPoint(0F, 0F, 0F);
        combataxeModel[58].rotateAngleY = -3.14159265F;
        combataxeModel[58].rotateAngleZ = 3.14159265F;

        combataxeModel[59].addShapeBox(-2.5F, -1F, -0.5F, 1, 5, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box123
        combataxeModel[59].setRotationPoint(0F, 0F, 0F);
        combataxeModel[59].rotateAngleY = -3.14159265F;
        combataxeModel[59].rotateAngleZ = 3.14159265F;

        combataxeModel[60].addShapeBox(-1F, -1F, -0.5F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box128
        combataxeModel[60].setRotationPoint(0F, 0F, 0F);
        combataxeModel[60].rotateAngleY = -3.14159265F;
        combataxeModel[60].rotateAngleZ = 3.14159265F;

        combataxeModel[61].addShapeBox(-2F, 2F, -0.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box129
        combataxeModel[61].setRotationPoint(0F, 0F, 0F);
        combataxeModel[61].rotateAngleY = -3.14159265F;
        combataxeModel[61].rotateAngleZ = 3.14159265F;

        combataxeModel[62].addShapeBox(-2.5F, 3F, -0.5F, 3, 6, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box80
        combataxeModel[62].setRotationPoint(0F, 0F, 0F);
        combataxeModel[62].rotateAngleY = -3.14159265F;
        combataxeModel[62].rotateAngleZ = 3.14159265F;

        combataxeModel[63].addShapeBox(0F, 4F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box81
        combataxeModel[63].setRotationPoint(0F, 0F, 0F);
        combataxeModel[63].rotateAngleY = -3.14159265F;
        combataxeModel[63].rotateAngleZ = 3.14159265F;

        combataxeModel[64].addShapeBox(0F, 5F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box82
        combataxeModel[64].setRotationPoint(0F, 0F, 0F);
        combataxeModel[64].rotateAngleY = -3.14159265F;
        combataxeModel[64].rotateAngleZ = 3.14159265F;

        combataxeModel[65].addShapeBox(0F, 6F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box83
        combataxeModel[65].setRotationPoint(0F, 0F, 0F);
        combataxeModel[65].rotateAngleY = -3.14159265F;
        combataxeModel[65].rotateAngleZ = 3.14159265F;

        combataxeModel[66].addShapeBox(0F, 7F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box84
        combataxeModel[66].setRotationPoint(0F, 0F, 0F);
        combataxeModel[66].rotateAngleY = -3.14159265F;
        combataxeModel[66].rotateAngleZ = 3.14159265F;

        combataxeModel[67].addShapeBox(-2.5F, 9F, -0.5F, 4, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box85
        combataxeModel[67].setRotationPoint(0F, 0F, 0F);
        combataxeModel[67].rotateAngleY = -3.14159265F;
        combataxeModel[67].rotateAngleZ = 3.14159265F;

        combataxeModel[68].addShapeBox(-2.5F, 9.5F, -0.5F, 2, 2, 1, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -1F, 0F, -0.375F); // Import Box86
        combataxeModel[68].setRotationPoint(0F, 0F, 0F);
        combataxeModel[68].rotateAngleY = -3.14159265F;
        combataxeModel[68].rotateAngleZ = 3.14159265F;

        combataxeModel[69].addShapeBox(0F, 9.5F, -0.5F, 2, 2, 1, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -0.5F, 0F, -0.375F); // Import Box87
        combataxeModel[69].setRotationPoint(0F, 0F, 0F);
        combataxeModel[69].rotateAngleY = -3.14159265F;
        combataxeModel[69].rotateAngleZ = 3.14159265F;

        combataxeModel[70].addShapeBox(-1F, -18.75F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box88
        combataxeModel[70].setRotationPoint(0F, 0F, 0F);
        combataxeModel[70].rotateAngleY = -3.14159265F;
        combataxeModel[70].rotateAngleZ = 3.14159265F;

        combataxeModel[71].addShapeBox(-1F, -19.5F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box89
        combataxeModel[71].setRotationPoint(0F, 0F, 0F);
        combataxeModel[71].rotateAngleY = -3.14159265F;
        combataxeModel[71].rotateAngleZ = 3.14159265F;

        combataxeModel[72].addShapeBox(-1.75F, -19.5F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box90
        combataxeModel[72].setRotationPoint(0F, 0F, 0F);
        combataxeModel[72].rotateAngleY = -3.14159265F;
        combataxeModel[72].rotateAngleZ = 3.14159265F;

        combataxeModel[73].addShapeBox(-1.75F, -18.75F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box91
        combataxeModel[73].setRotationPoint(0F, 0F, 0F);
        combataxeModel[73].rotateAngleY = -3.14159265F;
        combataxeModel[73].rotateAngleZ = 3.14159265F;

        combataxeModel[74].addShapeBox(-1F, -17.5F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box92
        combataxeModel[74].setRotationPoint(0F, 0F, 0F);
        combataxeModel[74].rotateAngleY = -3.14159265F;
        combataxeModel[74].rotateAngleZ = 3.14159265F;

        combataxeModel[75].addShapeBox(-1F, -18.25F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box93
        combataxeModel[75].setRotationPoint(0F, 0F, 0F);
        combataxeModel[75].rotateAngleY = -3.14159265F;
        combataxeModel[75].rotateAngleZ = 3.14159265F;

        combataxeModel[76].addShapeBox(-1.75F, -18.25F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box94
        combataxeModel[76].setRotationPoint(0F, 0F, 0F);
        combataxeModel[76].rotateAngleY = -3.14159265F;
        combataxeModel[76].rotateAngleZ = 3.14159265F;

        combataxeModel[77].addShapeBox(-1.75F, -17.5F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box95
        combataxeModel[77].setRotationPoint(0F, 0F, 0F);
        combataxeModel[77].rotateAngleY = -3.14159265F;
        combataxeModel[77].rotateAngleZ = 3.14159265F;

        combataxeModel[78].addShapeBox(-2.25F, -17.5F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box96
        combataxeModel[78].setRotationPoint(0F, 0F, 0F);
        combataxeModel[78].rotateAngleY = -3.14159265F;
        combataxeModel[78].rotateAngleZ = 3.14159265F;

        combataxeModel[79].addShapeBox(-2.25F, -18.25F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box97
        combataxeModel[79].setRotationPoint(0F, 0F, 0F);
        combataxeModel[79].rotateAngleY = -3.14159265F;
        combataxeModel[79].rotateAngleZ = 3.14159265F;

        combataxeModel[80].addShapeBox(-3F, -18.25F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box98
        combataxeModel[80].setRotationPoint(0F, 0F, 0F);
        combataxeModel[80].rotateAngleY = -3.14159265F;
        combataxeModel[80].rotateAngleZ = 3.14159265F;

        combataxeModel[81].addShapeBox(-3F, -17.5F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box99
        combataxeModel[81].setRotationPoint(0F, 0F, 0F);
        combataxeModel[81].rotateAngleY = -3.14159265F;
        combataxeModel[81].rotateAngleZ = 3.14159265F;

        combataxeModel[82].addShapeBox(-2.5F, -17.25F, -1F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box100
        combataxeModel[82].setRotationPoint(0F, 0F, 0F);
        combataxeModel[82].rotateAngleY = -3.14159265F;
        combataxeModel[82].rotateAngleZ = 3.14159265F;

        combataxeModel[83].addShapeBox(-1F, -15F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box101
        combataxeModel[83].setRotationPoint(0F, 0F, 0F);
        combataxeModel[83].rotateAngleY = -3.14159265F;
        combataxeModel[83].rotateAngleZ = 3.14159265F;

        combataxeModel[84].addShapeBox(-1F, -15.75F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box102
        combataxeModel[84].setRotationPoint(0F, 0F, 0F);
        combataxeModel[84].rotateAngleY = -3.14159265F;
        combataxeModel[84].rotateAngleZ = 3.14159265F;

        combataxeModel[85].addShapeBox(-1.75F, -15.75F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box103
        combataxeModel[85].setRotationPoint(0F, 0F, 0F);
        combataxeModel[85].rotateAngleY = -3.14159265F;
        combataxeModel[85].rotateAngleZ = 3.14159265F;

        combataxeModel[86].addShapeBox(-1.75F, -15F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box104
        combataxeModel[86].setRotationPoint(0F, 0F, 0F);
        combataxeModel[86].rotateAngleY = -3.14159265F;
        combataxeModel[86].rotateAngleZ = 3.14159265F;

        combataxeModel[87].addShapeBox(-2.25F, -15F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box105
        combataxeModel[87].setRotationPoint(0F, 0F, 0F);
        combataxeModel[87].rotateAngleY = -3.14159265F;
        combataxeModel[87].rotateAngleZ = 3.14159265F;

        combataxeModel[88].addShapeBox(-2.25F, -15.75F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box106
        combataxeModel[88].setRotationPoint(0F, 0F, 0F);
        combataxeModel[88].rotateAngleY = -3.14159265F;
        combataxeModel[88].rotateAngleZ = 3.14159265F;

        combataxeModel[89].addShapeBox(-3F, -15.75F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box107
        combataxeModel[89].setRotationPoint(0F, 0F, 0F);
        combataxeModel[89].rotateAngleY = -3.14159265F;
        combataxeModel[89].rotateAngleZ = 3.14159265F;

        combataxeModel[90].addShapeBox(-3F, -15F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box108
        combataxeModel[90].setRotationPoint(0F, 0F, 0F);
        combataxeModel[90].rotateAngleY = -3.14159265F;
        combataxeModel[90].rotateAngleZ = 3.14159265F;

        combataxeModel[91].addShapeBox(-2.5F, -14.75F, -1F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box109
        combataxeModel[91].setRotationPoint(0F, 0F, 0F);
        combataxeModel[91].rotateAngleY = -3.14159265F;
        combataxeModel[91].rotateAngleZ = 3.14159265F;

        combataxeModel[92].addShapeBox(-2.5F, -16F, -1F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box110
        combataxeModel[92].setRotationPoint(0F, 0F, 0F);
        combataxeModel[92].rotateAngleY = -3.14159265F;
        combataxeModel[92].rotateAngleZ = 3.14159265F;

        combataxeModel[93].addShapeBox(-1F, -16.25F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box111
        combataxeModel[93].setRotationPoint(0F, 0F, 0F);
        combataxeModel[93].rotateAngleY = -3.14159265F;
        combataxeModel[93].rotateAngleZ = 3.14159265F;

        combataxeModel[94].addShapeBox(-1F, -17F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box112
        combataxeModel[94].setRotationPoint(0F, 0F, 0F);
        combataxeModel[94].rotateAngleY = -3.14159265F;
        combataxeModel[94].rotateAngleZ = 3.14159265F;

        combataxeModel[95].addShapeBox(-1.75F, -17F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box113
        combataxeModel[95].setRotationPoint(0F, 0F, 0F);
        combataxeModel[95].rotateAngleY = -3.14159265F;
        combataxeModel[95].rotateAngleZ = 3.14159265F;

        combataxeModel[96].addShapeBox(-1.75F, -16.25F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box114
        combataxeModel[96].setRotationPoint(0F, 0F, 0F);
        combataxeModel[96].rotateAngleY = -3.14159265F;
        combataxeModel[96].rotateAngleZ = 3.14159265F;

        combataxeModel[97].addShapeBox(-2.25F, -16.25F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box115
        combataxeModel[97].setRotationPoint(0F, 0F, 0F);
        combataxeModel[97].rotateAngleY = -3.14159265F;
        combataxeModel[97].rotateAngleZ = 3.14159265F;

        combataxeModel[98].addShapeBox(-2.25F, -17F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box116
        combataxeModel[98].setRotationPoint(0F, 0F, 0F);
        combataxeModel[98].rotateAngleY = -3.14159265F;
        combataxeModel[98].rotateAngleZ = 3.14159265F;

        combataxeModel[99].addShapeBox(-3F, -17F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box117
        combataxeModel[99].setRotationPoint(0F, 0F, 0F);
        combataxeModel[99].rotateAngleY = -3.14159265F;
        combataxeModel[99].rotateAngleZ = 3.14159265F;

        combataxeModel[100].addShapeBox(-3F, -16.25F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box118
        combataxeModel[100].setRotationPoint(0F, 0F, 0F);
        combataxeModel[100].rotateAngleY = -3.14159265F;
        combataxeModel[100].rotateAngleZ = 3.14159265F;

        combataxeModel[101].addShapeBox(-1F, -12.5F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box119
        combataxeModel[101].setRotationPoint(0F, 0F, 0F);
        combataxeModel[101].rotateAngleY = -3.14159265F;
        combataxeModel[101].rotateAngleZ = 3.14159265F;

        combataxeModel[102].addShapeBox(-1F, -13.25F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box120
        combataxeModel[102].setRotationPoint(0F, 0F, 0F);
        combataxeModel[102].rotateAngleY = -3.14159265F;
        combataxeModel[102].rotateAngleZ = 3.14159265F;

        combataxeModel[103].addShapeBox(-1.75F, -13.25F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box121
        combataxeModel[103].setRotationPoint(0F, 0F, 0F);
        combataxeModel[103].rotateAngleY = -3.14159265F;
        combataxeModel[103].rotateAngleZ = 3.14159265F;

        combataxeModel[104].addShapeBox(-1.75F, -12.5F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box122
        combataxeModel[104].setRotationPoint(0F, 0F, 0F);
        combataxeModel[104].rotateAngleY = -3.14159265F;
        combataxeModel[104].rotateAngleZ = 3.14159265F;

        combataxeModel[105].addShapeBox(-2.25F, -12.5F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box123
        combataxeModel[105].setRotationPoint(0F, 0F, 0F);
        combataxeModel[105].rotateAngleY = -3.14159265F;
        combataxeModel[105].rotateAngleZ = 3.14159265F;

        combataxeModel[106].addShapeBox(-2.25F, -13.25F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box124
        combataxeModel[106].setRotationPoint(0F, 0F, 0F);
        combataxeModel[106].rotateAngleY = -3.14159265F;
        combataxeModel[106].rotateAngleZ = 3.14159265F;

        combataxeModel[107].addShapeBox(-3F, -13.25F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box125
        combataxeModel[107].setRotationPoint(0F, 0F, 0F);
        combataxeModel[107].rotateAngleY = -3.14159265F;
        combataxeModel[107].rotateAngleZ = 3.14159265F;

        combataxeModel[108].addShapeBox(-3F, -12.5F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box126
        combataxeModel[108].setRotationPoint(0F, 0F, 0F);
        combataxeModel[108].rotateAngleY = -3.14159265F;
        combataxeModel[108].rotateAngleZ = 3.14159265F;

        combataxeModel[109].addShapeBox(-2.5F, -12.25F, -1F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box127
        combataxeModel[109].setRotationPoint(0F, 0F, 0F);
        combataxeModel[109].rotateAngleY = -3.14159265F;
        combataxeModel[109].rotateAngleZ = 3.14159265F;

        combataxeModel[110].addShapeBox(-2.5F, -13.5F, -1F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box128
        combataxeModel[110].setRotationPoint(0F, 0F, 0F);
        combataxeModel[110].rotateAngleY = -3.14159265F;
        combataxeModel[110].rotateAngleZ = 3.14159265F;

        combataxeModel[111].addShapeBox(-1F, -13.75F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box129
        combataxeModel[111].setRotationPoint(0F, 0F, 0F);
        combataxeModel[111].rotateAngleY = -3.14159265F;
        combataxeModel[111].rotateAngleZ = 3.14159265F;

        combataxeModel[112].addShapeBox(-1F, -14.5F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box130
        combataxeModel[112].setRotationPoint(0F, 0F, 0F);
        combataxeModel[112].rotateAngleY = -3.14159265F;
        combataxeModel[112].rotateAngleZ = 3.14159265F;

        combataxeModel[113].addShapeBox(-1.75F, -14.5F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box131
        combataxeModel[113].setRotationPoint(0F, 0F, 0F);
        combataxeModel[113].rotateAngleY = -3.14159265F;
        combataxeModel[113].rotateAngleZ = 3.14159265F;

        combataxeModel[114].addShapeBox(-1.75F, -13.75F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box132
        combataxeModel[114].setRotationPoint(0F, 0F, 0F);
        combataxeModel[114].rotateAngleY = -3.14159265F;
        combataxeModel[114].rotateAngleZ = 3.14159265F;

        combataxeModel[115].addShapeBox(-2.25F, -13.75F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box133
        combataxeModel[115].setRotationPoint(0F, 0F, 0F);
        combataxeModel[115].rotateAngleY = -3.14159265F;
        combataxeModel[115].rotateAngleZ = 3.14159265F;

        combataxeModel[116].addShapeBox(-2.25F, -14.5F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box134
        combataxeModel[116].setRotationPoint(0F, 0F, 0F);
        combataxeModel[116].rotateAngleY = -3.14159265F;
        combataxeModel[116].rotateAngleZ = 3.14159265F;

        combataxeModel[117].addShapeBox(-3F, -14.5F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box135
        combataxeModel[117].setRotationPoint(0F, 0F, 0F);
        combataxeModel[117].rotateAngleY = -3.14159265F;
        combataxeModel[117].rotateAngleZ = 3.14159265F;

        combataxeModel[118].addShapeBox(-3F, -13.75F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box136
        combataxeModel[118].setRotationPoint(0F, 0F, 0F);
        combataxeModel[118].rotateAngleY = -3.14159265F;
        combataxeModel[118].rotateAngleZ = 3.14159265F;

        combataxeModel[119].addShapeBox(-1F, -10F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box137
        combataxeModel[119].setRotationPoint(0F, 0F, 0F);
        combataxeModel[119].rotateAngleY = -3.14159265F;
        combataxeModel[119].rotateAngleZ = 3.14159265F;

        combataxeModel[120].addShapeBox(-1F, -10.75F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box138
        combataxeModel[120].setRotationPoint(0F, 0F, 0F);
        combataxeModel[120].rotateAngleY = -3.14159265F;
        combataxeModel[120].rotateAngleZ = 3.14159265F;

        combataxeModel[121].addShapeBox(-1.75F, -10.75F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box139
        combataxeModel[121].setRotationPoint(0F, 0F, 0F);
        combataxeModel[121].rotateAngleY = -3.14159265F;
        combataxeModel[121].rotateAngleZ = 3.14159265F;

        combataxeModel[122].addShapeBox(-1.75F, -10F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box140
        combataxeModel[122].setRotationPoint(0F, 0F, 0F);
        combataxeModel[122].rotateAngleY = -3.14159265F;
        combataxeModel[122].rotateAngleZ = 3.14159265F;

        combataxeModel[123].addShapeBox(-2.25F, -10F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box141
        combataxeModel[123].setRotationPoint(0F, 0F, 0F);
        combataxeModel[123].rotateAngleY = -3.14159265F;
        combataxeModel[123].rotateAngleZ = 3.14159265F;

        combataxeModel[124].addShapeBox(-2.25F, -10.75F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box142
        combataxeModel[124].setRotationPoint(0F, 0F, 0F);
        combataxeModel[124].rotateAngleY = -3.14159265F;
        combataxeModel[124].rotateAngleZ = 3.14159265F;

        combataxeModel[125].addShapeBox(-3F, -10.75F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box143
        combataxeModel[125].setRotationPoint(0F, 0F, 0F);
        combataxeModel[125].rotateAngleY = -3.14159265F;
        combataxeModel[125].rotateAngleZ = 3.14159265F;

        combataxeModel[126].addShapeBox(-3F, -10F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box144
        combataxeModel[126].setRotationPoint(0F, 0F, 0F);
        combataxeModel[126].rotateAngleY = -3.14159265F;
        combataxeModel[126].rotateAngleZ = 3.14159265F;

        combataxeModel[127].addShapeBox(-2.5F, -9.75F, -1F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box145
        combataxeModel[127].setRotationPoint(0F, 0F, 0F);
        combataxeModel[127].rotateAngleY = -3.14159265F;
        combataxeModel[127].rotateAngleZ = 3.14159265F;

        combataxeModel[128].addShapeBox(-2.5F, -11F, -1F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box146
        combataxeModel[128].setRotationPoint(0F, 0F, 0F);
        combataxeModel[128].rotateAngleY = -3.14159265F;
        combataxeModel[128].rotateAngleZ = 3.14159265F;

        combataxeModel[129].addShapeBox(-1F, -11.25F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box147
        combataxeModel[129].setRotationPoint(0F, 0F, 0F);
        combataxeModel[129].rotateAngleY = -3.14159265F;
        combataxeModel[129].rotateAngleZ = 3.14159265F;

        combataxeModel[130].addShapeBox(-1F, -12F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box148
        combataxeModel[130].setRotationPoint(0F, 0F, 0F);
        combataxeModel[130].rotateAngleY = -3.14159265F;
        combataxeModel[130].rotateAngleZ = 3.14159265F;

        combataxeModel[131].addShapeBox(-1.75F, -12F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box149
        combataxeModel[131].setRotationPoint(0F, 0F, 0F);
        combataxeModel[131].rotateAngleY = -3.14159265F;
        combataxeModel[131].rotateAngleZ = 3.14159265F;

        combataxeModel[132].addShapeBox(-1.75F, -11.25F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box150
        combataxeModel[132].setRotationPoint(0F, 0F, 0F);
        combataxeModel[132].rotateAngleY = -3.14159265F;
        combataxeModel[132].rotateAngleZ = 3.14159265F;

        combataxeModel[133].addShapeBox(-2.25F, -11.25F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box151
        combataxeModel[133].setRotationPoint(0F, 0F, 0F);
        combataxeModel[133].rotateAngleY = -3.14159265F;
        combataxeModel[133].rotateAngleZ = 3.14159265F;

        combataxeModel[134].addShapeBox(-2.25F, -12F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box152
        combataxeModel[134].setRotationPoint(0F, 0F, 0F);
        combataxeModel[134].rotateAngleY = -3.14159265F;
        combataxeModel[134].rotateAngleZ = 3.14159265F;

        combataxeModel[135].addShapeBox(-3F, -12F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box153
        combataxeModel[135].setRotationPoint(0F, 0F, 0F);
        combataxeModel[135].rotateAngleY = -3.14159265F;
        combataxeModel[135].rotateAngleZ = 3.14159265F;

        combataxeModel[136].addShapeBox(-3F, -11.25F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box154
        combataxeModel[136].setRotationPoint(0F, 0F, 0F);
        combataxeModel[136].rotateAngleY = -3.14159265F;
        combataxeModel[136].rotateAngleZ = 3.14159265F;

        combataxeModel[137].addShapeBox(-1F, -7.5F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box155
        combataxeModel[137].setRotationPoint(0F, 0F, 0F);
        combataxeModel[137].rotateAngleY = -3.14159265F;
        combataxeModel[137].rotateAngleZ = 3.14159265F;

        combataxeModel[138].addShapeBox(-1F, -8.25F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box156
        combataxeModel[138].setRotationPoint(0F, 0F, 0F);
        combataxeModel[138].rotateAngleY = -3.14159265F;
        combataxeModel[138].rotateAngleZ = 3.14159265F;

        combataxeModel[139].addShapeBox(-1.75F, -8.25F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box157
        combataxeModel[139].setRotationPoint(0F, 0F, 0F);
        combataxeModel[139].rotateAngleY = -3.14159265F;
        combataxeModel[139].rotateAngleZ = 3.14159265F;

        combataxeModel[140].addShapeBox(-1.75F, -7.5F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box158
        combataxeModel[140].setRotationPoint(0F, 0F, 0F);
        combataxeModel[140].rotateAngleY = -3.14159265F;
        combataxeModel[140].rotateAngleZ = 3.14159265F;

        combataxeModel[141].addShapeBox(-2.25F, -7.5F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box159
        combataxeModel[141].setRotationPoint(0F, 0F, 0F);
        combataxeModel[141].rotateAngleY = -3.14159265F;
        combataxeModel[141].rotateAngleZ = 3.14159265F;

        combataxeModel[142].addShapeBox(-2.25F, -8.25F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box160
        combataxeModel[142].setRotationPoint(0F, 0F, 0F);
        combataxeModel[142].rotateAngleY = -3.14159265F;
        combataxeModel[142].rotateAngleZ = 3.14159265F;

        combataxeModel[143].addShapeBox(-3F, -8.25F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box161
        combataxeModel[143].setRotationPoint(0F, 0F, 0F);
        combataxeModel[143].rotateAngleY = -3.14159265F;
        combataxeModel[143].rotateAngleZ = 3.14159265F;

        combataxeModel[144].addShapeBox(-3F, -7.5F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box162
        combataxeModel[144].setRotationPoint(0F, 0F, 0F);
        combataxeModel[144].rotateAngleY = -3.14159265F;
        combataxeModel[144].rotateAngleZ = 3.14159265F;

        combataxeModel[145].addShapeBox(-2.5F, -7.25F, -1F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box163
        combataxeModel[145].setRotationPoint(0F, 0F, 0F);
        combataxeModel[145].rotateAngleY = -3.14159265F;
        combataxeModel[145].rotateAngleZ = 3.14159265F;

        combataxeModel[146].addShapeBox(-2.5F, -8.5F, -1F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box164
        combataxeModel[146].setRotationPoint(0F, 0F, 0F);
        combataxeModel[146].rotateAngleY = -3.14159265F;
        combataxeModel[146].rotateAngleZ = 3.14159265F;

        combataxeModel[147].addShapeBox(-1F, -8.75F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box165
        combataxeModel[147].setRotationPoint(0F, 0F, 0F);
        combataxeModel[147].rotateAngleY = -3.14159265F;
        combataxeModel[147].rotateAngleZ = 3.14159265F;

        combataxeModel[148].addShapeBox(-1F, -9.5F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box166
        combataxeModel[148].setRotationPoint(0F, 0F, 0F);
        combataxeModel[148].rotateAngleY = -3.14159265F;
        combataxeModel[148].rotateAngleZ = 3.14159265F;

        combataxeModel[149].addShapeBox(-1.75F, -9.5F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box167
        combataxeModel[149].setRotationPoint(0F, 0F, 0F);
        combataxeModel[149].rotateAngleY = -3.14159265F;
        combataxeModel[149].rotateAngleZ = 3.14159265F;

        combataxeModel[150].addShapeBox(-1.75F, -8.75F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box168
        combataxeModel[150].setRotationPoint(0F, 0F, 0F);
        combataxeModel[150].rotateAngleY = -3.14159265F;
        combataxeModel[150].rotateAngleZ = 3.14159265F;

        combataxeModel[151].addShapeBox(-2.25F, -8.75F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box169
        combataxeModel[151].setRotationPoint(0F, 0F, 0F);
        combataxeModel[151].rotateAngleY = -3.14159265F;
        combataxeModel[151].rotateAngleZ = 3.14159265F;

        combataxeModel[152].addShapeBox(-2.25F, -9.5F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box170
        combataxeModel[152].setRotationPoint(0F, 0F, 0F);
        combataxeModel[152].rotateAngleY = -3.14159265F;
        combataxeModel[152].rotateAngleZ = 3.14159265F;

        combataxeModel[153].addShapeBox(-3F, -9.5F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box171
        combataxeModel[153].setRotationPoint(0F, 0F, 0F);
        combataxeModel[153].rotateAngleY = -3.14159265F;
        combataxeModel[153].rotateAngleZ = 3.14159265F;

        combataxeModel[154].addShapeBox(-3F, -8.75F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box172
        combataxeModel[154].setRotationPoint(0F, 0F, 0F);
        combataxeModel[154].rotateAngleY = -3.14159265F;
        combataxeModel[154].rotateAngleZ = 3.14159265F;

        combataxeModel[155].addShapeBox(-1F, -5F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box173
        combataxeModel[155].setRotationPoint(0F, 0F, 0F);
        combataxeModel[155].rotateAngleY = -3.14159265F;
        combataxeModel[155].rotateAngleZ = 3.14159265F;

        combataxeModel[156].addShapeBox(-1F, -5.75F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box174
        combataxeModel[156].setRotationPoint(0F, 0F, 0F);
        combataxeModel[156].rotateAngleY = -3.14159265F;
        combataxeModel[156].rotateAngleZ = 3.14159265F;

        combataxeModel[157].addShapeBox(-1.75F, -5.75F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box175
        combataxeModel[157].setRotationPoint(0F, 0F, 0F);
        combataxeModel[157].rotateAngleY = -3.14159265F;
        combataxeModel[157].rotateAngleZ = 3.14159265F;

        combataxeModel[158].addShapeBox(-1.75F, -5F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box176
        combataxeModel[158].setRotationPoint(0F, 0F, 0F);
        combataxeModel[158].rotateAngleY = -3.14159265F;
        combataxeModel[158].rotateAngleZ = 3.14159265F;

        combataxeModel[159].addShapeBox(-2.25F, -5F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box177
        combataxeModel[159].setRotationPoint(0F, 0F, 0F);
        combataxeModel[159].rotateAngleY = -3.14159265F;
        combataxeModel[159].rotateAngleZ = 3.14159265F;

        combataxeModel[160].addShapeBox(-2.25F, -5.75F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box178
        combataxeModel[160].setRotationPoint(0F, 0F, 0F);
        combataxeModel[160].rotateAngleY = -3.14159265F;
        combataxeModel[160].rotateAngleZ = 3.14159265F;

        combataxeModel[161].addShapeBox(-3F, -5.75F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box179
        combataxeModel[161].setRotationPoint(0F, 0F, 0F);
        combataxeModel[161].rotateAngleY = -3.14159265F;
        combataxeModel[161].rotateAngleZ = 3.14159265F;

        combataxeModel[162].addShapeBox(-3F, -5F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box180
        combataxeModel[162].setRotationPoint(0F, 0F, 0F);
        combataxeModel[162].rotateAngleY = -3.14159265F;
        combataxeModel[162].rotateAngleZ = 3.14159265F;

        combataxeModel[163].addShapeBox(-2.5F, -4.75F, -1F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box181
        combataxeModel[163].setRotationPoint(0F, 0F, 0F);
        combataxeModel[163].rotateAngleY = -3.14159265F;
        combataxeModel[163].rotateAngleZ = 3.14159265F;

        combataxeModel[164].addShapeBox(-2.5F, -6F, -1F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box182
        combataxeModel[164].setRotationPoint(0F, 0F, 0F);
        combataxeModel[164].rotateAngleY = -3.14159265F;
        combataxeModel[164].rotateAngleZ = 3.14159265F;

        combataxeModel[165].addShapeBox(-1F, -6.25F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box183
        combataxeModel[165].setRotationPoint(0F, 0F, 0F);
        combataxeModel[165].rotateAngleY = -3.14159265F;
        combataxeModel[165].rotateAngleZ = 3.14159265F;

        combataxeModel[166].addShapeBox(-1F, -7F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box184
        combataxeModel[166].setRotationPoint(0F, 0F, 0F);
        combataxeModel[166].rotateAngleY = -3.14159265F;
        combataxeModel[166].rotateAngleZ = 3.14159265F;

        combataxeModel[167].addShapeBox(-1.75F, -7F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box185
        combataxeModel[167].setRotationPoint(0F, 0F, 0F);
        combataxeModel[167].rotateAngleY = -3.14159265F;
        combataxeModel[167].rotateAngleZ = 3.14159265F;

        combataxeModel[168].addShapeBox(-1.75F, -6.25F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box186
        combataxeModel[168].setRotationPoint(0F, 0F, 0F);
        combataxeModel[168].rotateAngleY = -3.14159265F;
        combataxeModel[168].rotateAngleZ = 3.14159265F;

        combataxeModel[169].addShapeBox(-2.25F, -6.25F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box187
        combataxeModel[169].setRotationPoint(0F, 0F, 0F);
        combataxeModel[169].rotateAngleY = -3.14159265F;
        combataxeModel[169].rotateAngleZ = 3.14159265F;

        combataxeModel[170].addShapeBox(-2.25F, -7F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box188
        combataxeModel[170].setRotationPoint(0F, 0F, 0F);
        combataxeModel[170].rotateAngleY = -3.14159265F;
        combataxeModel[170].rotateAngleZ = 3.14159265F;

        combataxeModel[171].addShapeBox(-3F, -7F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box189
        combataxeModel[171].setRotationPoint(0F, 0F, 0F);
        combataxeModel[171].rotateAngleY = -3.14159265F;
        combataxeModel[171].rotateAngleZ = 3.14159265F;

        combataxeModel[172].addShapeBox(-3F, -6.25F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box190
        combataxeModel[172].setRotationPoint(0F, 0F, 0F);
        combataxeModel[172].rotateAngleY = -3.14159265F;
        combataxeModel[172].rotateAngleZ = 3.14159265F;

        combataxeModel[173].addShapeBox(-1F, -2.5F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box191
        combataxeModel[173].setRotationPoint(0F, 0F, 0F);
        combataxeModel[173].rotateAngleY = -3.14159265F;
        combataxeModel[173].rotateAngleZ = 3.14159265F;

        combataxeModel[174].addShapeBox(-1F, -3.25F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box192
        combataxeModel[174].setRotationPoint(0F, 0F, 0F);
        combataxeModel[174].rotateAngleY = -3.14159265F;
        combataxeModel[174].rotateAngleZ = 3.14159265F;

        combataxeModel[175].addShapeBox(-1.75F, -3.25F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box193
        combataxeModel[175].setRotationPoint(0F, 0F, 0F);
        combataxeModel[175].rotateAngleY = -3.14159265F;
        combataxeModel[175].rotateAngleZ = 3.14159265F;

        combataxeModel[176].addShapeBox(-1.75F, -2.5F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box194
        combataxeModel[176].setRotationPoint(0F, 0F, 0F);
        combataxeModel[176].rotateAngleY = -3.14159265F;
        combataxeModel[176].rotateAngleZ = 3.14159265F;

        combataxeModel[177].addShapeBox(-2.25F, -2.5F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box195
        combataxeModel[177].setRotationPoint(0F, 0F, 0F);
        combataxeModel[177].rotateAngleY = -3.14159265F;
        combataxeModel[177].rotateAngleZ = 3.14159265F;

        combataxeModel[178].addShapeBox(-2.25F, -3.25F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box196
        combataxeModel[178].setRotationPoint(0F, 0F, 0F);
        combataxeModel[178].rotateAngleY = -3.14159265F;
        combataxeModel[178].rotateAngleZ = 3.14159265F;

        combataxeModel[179].addShapeBox(-3F, -3.25F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box197
        combataxeModel[179].setRotationPoint(0F, 0F, 0F);
        combataxeModel[179].rotateAngleY = -3.14159265F;
        combataxeModel[179].rotateAngleZ = 3.14159265F;

        combataxeModel[180].addShapeBox(-3F, -2.5F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box198
        combataxeModel[180].setRotationPoint(0F, 0F, 0F);
        combataxeModel[180].rotateAngleY = -3.14159265F;
        combataxeModel[180].rotateAngleZ = 3.14159265F;

        combataxeModel[181].addShapeBox(-2.5F, -2.25F, -1F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box199
        combataxeModel[181].setRotationPoint(0F, 0F, 0F);
        combataxeModel[181].rotateAngleY = -3.14159265F;
        combataxeModel[181].rotateAngleZ = 3.14159265F;

        combataxeModel[182].addShapeBox(-2.5F, -3.5F, -1F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box200
        combataxeModel[182].setRotationPoint(0F, 0F, 0F);
        combataxeModel[182].rotateAngleY = -3.14159265F;
        combataxeModel[182].rotateAngleZ = 3.14159265F;

        combataxeModel[183].addShapeBox(-1F, -3.75F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box201
        combataxeModel[183].setRotationPoint(0F, 0F, 0F);
        combataxeModel[183].rotateAngleY = -3.14159265F;
        combataxeModel[183].rotateAngleZ = 3.14159265F;

        combataxeModel[184].addShapeBox(-1F, -4.5F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box202
        combataxeModel[184].setRotationPoint(0F, 0F, 0F);
        combataxeModel[184].rotateAngleY = -3.14159265F;
        combataxeModel[184].rotateAngleZ = 3.14159265F;

        combataxeModel[185].addShapeBox(-1.75F, -4.5F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box203
        combataxeModel[185].setRotationPoint(0F, 0F, 0F);
        combataxeModel[185].rotateAngleY = -3.14159265F;
        combataxeModel[185].rotateAngleZ = 3.14159265F;

        combataxeModel[186].addShapeBox(-1.75F, -3.75F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box204
        combataxeModel[186].setRotationPoint(0F, 0F, 0F);
        combataxeModel[186].rotateAngleY = -3.14159265F;
        combataxeModel[186].rotateAngleZ = 3.14159265F;

        combataxeModel[187].addShapeBox(-2.25F, -3.75F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box205
        combataxeModel[187].setRotationPoint(0F, 0F, 0F);
        combataxeModel[187].rotateAngleY = -3.14159265F;
        combataxeModel[187].rotateAngleZ = 3.14159265F;

        combataxeModel[188].addShapeBox(-2.25F, -4.5F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box206
        combataxeModel[188].setRotationPoint(0F, 0F, 0F);
        combataxeModel[188].rotateAngleY = -3.14159265F;
        combataxeModel[188].rotateAngleZ = 3.14159265F;

        combataxeModel[189].addShapeBox(-3F, -4.5F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box207
        combataxeModel[189].setRotationPoint(0F, 0F, 0F);
        combataxeModel[189].rotateAngleY = -3.14159265F;
        combataxeModel[189].rotateAngleZ = 3.14159265F;

        combataxeModel[190].addShapeBox(-3F, -3.75F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box208
        combataxeModel[190].setRotationPoint(0F, 0F, 0F);
        combataxeModel[190].rotateAngleY = -3.14159265F;
        combataxeModel[190].rotateAngleZ = 3.14159265F;

        combataxeModel[191].addShapeBox(-1.75F, -1.25F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box209
        combataxeModel[191].setRotationPoint(0F, 0F, 0F);
        combataxeModel[191].rotateAngleY = -3.14159265F;
        combataxeModel[191].rotateAngleZ = 3.14159265F;

        combataxeModel[192].addShapeBox(-1F, -2F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box210
        combataxeModel[192].setRotationPoint(0F, 0F, 0F);
        combataxeModel[192].rotateAngleY = -3.14159265F;
        combataxeModel[192].rotateAngleZ = 3.14159265F;

        combataxeModel[193].addShapeBox(-1F, -1.25F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box211
        combataxeModel[193].setRotationPoint(0F, 0F, 0F);
        combataxeModel[193].rotateAngleY = -3.14159265F;
        combataxeModel[193].rotateAngleZ = 3.14159265F;

        combataxeModel[194].addShapeBox(-1.75F, -2F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box212
        combataxeModel[194].setRotationPoint(0F, 0F, 0F);
        combataxeModel[194].rotateAngleY = -3.14159265F;
        combataxeModel[194].rotateAngleZ = 3.14159265F;

        combataxeModel[195].addShapeBox(-2.25F, -2F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box213
        combataxeModel[195].setRotationPoint(0F, 0F, 0F);
        combataxeModel[195].rotateAngleY = -3.14159265F;
        combataxeModel[195].rotateAngleZ = 3.14159265F;

        combataxeModel[196].addShapeBox(-2.25F, -1.25F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box214
        combataxeModel[196].setRotationPoint(0F, 0F, 0F);
        combataxeModel[196].rotateAngleY = -3.14159265F;
        combataxeModel[196].rotateAngleZ = 3.14159265F;

        combataxeModel[197].addShapeBox(-3F, -2F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box216
        combataxeModel[197].setRotationPoint(0F, 0F, 0F);
        combataxeModel[197].rotateAngleY = -3.14159265F;
        combataxeModel[197].rotateAngleZ = 3.14159265F;

        combataxeModel[198].addShapeBox(-2.5F, -1F, -1F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box217
        combataxeModel[198].setRotationPoint(0F, 0F, 0F);
        combataxeModel[198].rotateAngleY = -3.14159265F;
        combataxeModel[198].rotateAngleZ = 3.14159265F;

        combataxeModel[199].addShapeBox(-1F, 0F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box218
        combataxeModel[199].setRotationPoint(0F, 0F, 0F);
        combataxeModel[199].rotateAngleY = -3.14159265F;
        combataxeModel[199].rotateAngleZ = 3.14159265F;

        combataxeModel[200].addShapeBox(-1.75F, -0.75F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box219
        combataxeModel[200].setRotationPoint(0F, 0F, 0F);
        combataxeModel[200].rotateAngleY = -3.14159265F;
        combataxeModel[200].rotateAngleZ = 3.14159265F;

        combataxeModel[201].addShapeBox(-1F, -0.75F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box220
        combataxeModel[201].setRotationPoint(0F, 0F, 0F);
        combataxeModel[201].rotateAngleY = -3.14159265F;
        combataxeModel[201].rotateAngleZ = 3.14159265F;

        combataxeModel[202].addShapeBox(-1.75F, 0F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box221
        combataxeModel[202].setRotationPoint(0F, 0F, 0F);
        combataxeModel[202].rotateAngleY = -3.14159265F;
        combataxeModel[202].rotateAngleZ = 3.14159265F;

        combataxeModel[203].addShapeBox(-2.5F, 0.25F, -1F, 2, 1, 2, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.5F, -0.25F, 0F); // Import Box222
        combataxeModel[203].setRotationPoint(0F, 0F, 0F);
        combataxeModel[203].rotateAngleY = -3.14159265F;
        combataxeModel[203].rotateAngleZ = 3.14159265F;

        combataxeModel[204].addShapeBox(-2.25F, -0.75F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box223
        combataxeModel[204].setRotationPoint(0F, 0F, 0F);
        combataxeModel[204].rotateAngleY = -3.14159265F;
        combataxeModel[204].rotateAngleZ = 3.14159265F;

        combataxeModel[205].addShapeBox(1.5F, 0F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box224
        combataxeModel[205].setRotationPoint(0F, 0F, 0F);
        combataxeModel[205].rotateAngleY = -3.14159265F;
        combataxeModel[205].rotateAngleZ = 3.14159265F;

        combataxeModel[206].addShapeBox(1.5F, -0.75F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box225
        combataxeModel[206].setRotationPoint(0F, 0F, 0F);
        combataxeModel[206].rotateAngleY = -3.14159265F;
        combataxeModel[206].rotateAngleZ = 3.14159265F;

        combataxeModel[207].addShapeBox(0.75F, -0.75F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box226
        combataxeModel[207].setRotationPoint(0F, 0F, 0F);
        combataxeModel[207].rotateAngleY = -3.14159265F;
        combataxeModel[207].rotateAngleZ = 3.14159265F;

        combataxeModel[208].addShapeBox(0.75F, 0F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box227
        combataxeModel[208].setRotationPoint(0F, 0F, 0F);
        combataxeModel[208].rotateAngleY = -3.14159265F;
        combataxeModel[208].rotateAngleZ = 3.14159265F;

        combataxeModel[209].addShapeBox(0.25F, -0.75F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box228
        combataxeModel[209].setRotationPoint(0F, 0F, 0F);
        combataxeModel[209].rotateAngleY = -3.14159265F;
        combataxeModel[209].rotateAngleZ = 3.14159265F;

        combataxeModel[210].addShapeBox(0.25F, 0F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box229
        combataxeModel[210].setRotationPoint(0F, 0F, 0F);
        combataxeModel[210].rotateAngleY = -3.14159265F;
        combataxeModel[210].rotateAngleZ = 3.14159265F;

        combataxeModel[211].addShapeBox(-0.5F, 0F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box230
        combataxeModel[211].setRotationPoint(0F, 0F, 0F);
        combataxeModel[211].rotateAngleY = -3.14159265F;
        combataxeModel[211].rotateAngleZ = 3.14159265F;

        combataxeModel[212].addShapeBox(-0.5F, -0.75F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box231
        combataxeModel[212].setRotationPoint(0F, 0F, 0F);
        combataxeModel[212].rotateAngleY = -3.14159265F;
        combataxeModel[212].rotateAngleZ = 3.14159265F;

        combataxeModel[213].addShapeBox(0F, 0.25F, -1F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box232
        combataxeModel[213].setRotationPoint(0F, 0F, 0F);
        combataxeModel[213].rotateAngleY = -3.14159265F;
        combataxeModel[213].rotateAngleZ = 3.14159265F;

        combataxeModel[214].addShapeBox(1.5F, 1.25F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box233
        combataxeModel[214].setRotationPoint(0F, 0F, 0F);
        combataxeModel[214].rotateAngleY = -3.14159265F;
        combataxeModel[214].rotateAngleZ = 3.14159265F;

        combataxeModel[215].addShapeBox(1.5F, 0.5F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box234
        combataxeModel[215].setRotationPoint(0F, 0F, 0F);
        combataxeModel[215].rotateAngleY = -3.14159265F;
        combataxeModel[215].rotateAngleZ = 3.14159265F;

        combataxeModel[216].addShapeBox(0.75F, 0.5F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box235
        combataxeModel[216].setRotationPoint(0F, 0F, 0F);
        combataxeModel[216].rotateAngleY = -3.14159265F;
        combataxeModel[216].rotateAngleZ = 3.14159265F;

        combataxeModel[217].addShapeBox(0.75F, 1.25F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box236
        combataxeModel[217].setRotationPoint(0F, 0F, 0F);
        combataxeModel[217].rotateAngleY = -3.14159265F;
        combataxeModel[217].rotateAngleZ = 3.14159265F;

        combataxeModel[218].addShapeBox(0.25F, 0.5F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box237
        combataxeModel[218].setRotationPoint(0F, 0F, 0F);
        combataxeModel[218].rotateAngleY = -3.14159265F;
        combataxeModel[218].rotateAngleZ = 3.14159265F;

        combataxeModel[219].addShapeBox(0.25F, 1.25F, -1F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box238
        combataxeModel[219].setRotationPoint(0F, 0F, 0F);
        combataxeModel[219].rotateAngleY = -3.14159265F;
        combataxeModel[219].rotateAngleZ = 3.14159265F;

        combataxeModel[220].addShapeBox(-0.5F, 1.25F, -1F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box239
        combataxeModel[220].setRotationPoint(0F, 0F, 0F);
        combataxeModel[220].rotateAngleY = -3.14159265F;
        combataxeModel[220].rotateAngleZ = 3.14159265F;

        combataxeModel[221].addShapeBox(-0.5F, 0.5F, -1F, 1, 1, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box240
        combataxeModel[221].setRotationPoint(0F, 0F, 0F);
        combataxeModel[221].rotateAngleY = -3.14159265F;
        combataxeModel[221].rotateAngleZ = 3.14159265F;

        combataxeModel[222].addShapeBox(0F, 1.5F, -1F, 2, 1, 2, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Import Box241
        combataxeModel[222].setRotationPoint(0F, 0F, 0F);
        combataxeModel[222].rotateAngleY = -3.14159265F;
        combataxeModel[222].rotateAngleZ = 3.14159265F;


    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

        GL11.glScalef(0.25F, 0.25F, 0.25F);

        for (int i = 0; i < 223; i++) {
            combataxeModel[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
    }
}