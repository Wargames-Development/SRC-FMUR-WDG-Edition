//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CBJMS
// Model Creator: 
// Created on: 18.03.2022 - 17:24:17
// Last changed on: 18.03.2022 - 17:24:17

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelCBJMS extends ModelGun //Same as Filename
{
    int textureX = 256;
    int textureY = 256;

    public ModelCBJMS() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[175];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox0
        gunModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import ImportBox1
        gunModel[2] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import ImportBox5
        gunModel[3] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import ImportBox6
        gunModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox7
        gunModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import ImportBox8
        gunModel[6] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import ImportBox9
        gunModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import ImportBox10
        gunModel[8] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import ImportBox11
        gunModel[9] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import ImportBox12
        gunModel[10] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import ImportBox13
        gunModel[11] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import ImportBox14
        gunModel[12] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import ImportBox16
        gunModel[13] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import ImportBox17
        gunModel[14] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Import ImportBox18
        gunModel[15] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Import ImportBox19
        gunModel[16] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportBox20
        gunModel[17] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Import ImportBox24
        gunModel[18] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import ImportBox26
        gunModel[19] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Import ImportBox27
        gunModel[20] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import ImportBox28
        gunModel[21] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import ImportBox32
        gunModel[22] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Import ImportBox33
        gunModel[23] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Import ImportBox34
        gunModel[24] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Import ImportBox35
        gunModel[25] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Import ImportBox36
        gunModel[26] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Import ImportBox51
        gunModel[27] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Import ImportBox53
        gunModel[28] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import ImportBox55
        gunModel[29] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import ImportBox56
        gunModel[30] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Import ImportBox57
        gunModel[31] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import ImportBox66
        gunModel[32] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Import ImportBox88
        gunModel[33] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Import ImportBox102
        gunModel[34] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Import ImportBox113
        gunModel[35] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import ImportBox114
        gunModel[36] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Import ImportBox115
        gunModel[37] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Import ImportBox116
        gunModel[38] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Import ImportBox121
        gunModel[39] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Import ImportBox122
        gunModel[40] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Import ImportBox123
        gunModel[41] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Import ImportBox124
        gunModel[42] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Import ImportBox125
        gunModel[43] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Import ImportBox126
        gunModel[44] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Import ImportBox137
        gunModel[45] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import ImportBox138
        gunModel[46] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Import ImportBox139
        gunModel[47] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Import ImportBox140
        gunModel[48] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Import Box148
        gunModel[49] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box150
        gunModel[50] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Import Box151
        gunModel[51] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Import Box165
        gunModel[52] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Import Box166
        gunModel[53] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Import Box167
        gunModel[54] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Import Box168
        gunModel[55] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Import ImportBox0
        gunModel[56] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Import ImportBox0
        gunModel[57] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Import ImportBox0
        gunModel[58] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Import ImportBox0
        gunModel[59] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Import Box166
        gunModel[60] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Import Box167
        gunModel[61] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Import Box168
        gunModel[62] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Import ImportBox5
        gunModel[63] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import ImportBox8
        gunModel[64] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Import ImportBox11
        gunModel[65] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Import ImportBox9
        gunModel[66] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Import ImportBox10
        gunModel[67] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Import ImportBox12
        gunModel[68] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Import ImportBox5
        gunModel[69] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Import ImportBox8
        gunModel[70] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Import ImportBox11
        gunModel[71] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Import ImportBox55
        gunModel[72] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import ImportBox0
        gunModel[73] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import ImportBox0
        gunModel[74] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Import ImportBox0
        gunModel[75] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Import Box165
        gunModel[76] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Import ImportBox5
        gunModel[77] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Import ImportBox6
        gunModel[78] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Import ImportBox7
        gunModel[79] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Import ImportBox8
        gunModel[80] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Import ImportBox11
        gunModel[81] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Import ImportBox13
        gunModel[82] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Import ImportBox5
        gunModel[83] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Import ImportBox6
        gunModel[84] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Import ImportBox7
        gunModel[85] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Import ImportBox8
        gunModel[86] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Import ImportBox11
        gunModel[87] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Import ImportBox13
        gunModel[88] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import ImportBox0
        gunModel[89] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Import ImportBox0
        gunModel[90] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Import ImportBox0
        gunModel[91] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Import ImportBox0
        gunModel[92] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Import ImportBox0
        gunModel[93] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Import ImportBox0
        gunModel[94] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Import ImportBox0
        gunModel[95] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Import ImportBox0
        gunModel[96] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Import ImportBox0
        gunModel[97] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Import ImportBox0
        gunModel[98] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Import ImportBox0
        gunModel[99] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Import ImportBox0
        gunModel[100] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Import ImportBox0
        gunModel[101] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Import ImportBox0
        gunModel[102] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Import Box165
        gunModel[103] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Import ImportBox56
        gunModel[104] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Import ImportBox56
        gunModel[105] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Import Box166
        gunModel[106] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Import Box167
        gunModel[107] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Import Box168
        gunModel[108] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Import ImportBox0
        gunModel[109] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Import Box165
        gunModel[110] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Import Box165
        gunModel[111] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Import Box166
        gunModel[112] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import Box167
        gunModel[113] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Import Box168
        gunModel[114] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box166
        gunModel[115] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Import Box167
        gunModel[116] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box168
        gunModel[117] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Import Box166
        gunModel[118] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Import Box166
        gunModel[119] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Import Box166
        gunModel[120] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import Box166
        gunModel[121] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Import Box166
        gunModel[122] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Import Box166
        gunModel[123] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Import Box166
        gunModel[124] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Import Box167
        gunModel[125] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Import Box168
        gunModel[126] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Import Box166
        gunModel[127] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Import Box166
        gunModel[128] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Import Box167
        gunModel[129] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Import Box168
        gunModel[130] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Import Box166
        gunModel[131] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Import Box166
        gunModel[132] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Import Box166
        gunModel[133] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Import Box166
        gunModel[134] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Import Box166
        gunModel[135] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Import Box166
        gunModel[136] = new ModelRendererTurbo(this, 9, 177, textureX, textureY); // Import Box167
        gunModel[137] = new ModelRendererTurbo(this, 17, 177, textureX, textureY); // Import Box168
        gunModel[138] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Import Box166
        gunModel[139] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Import Box166
        gunModel[140] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Import Box166
        gunModel[141] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Import Box166
        gunModel[142] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Import Box166
        gunModel[143] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Import Box166
        gunModel[144] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box166
        gunModel[145] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box167
        gunModel[146] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Import Box168
        gunModel[147] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Import ImportBox11
        gunModel[148] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Import ImportBox11
        gunModel[149] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Import ImportBox11
        gunModel[150] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Import ImportBox11
        gunModel[151] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Import ImportBox11
        gunModel[152] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Import ImportBox11
        gunModel[153] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import ImportBox11
        gunModel[154] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Import ImportBox11
        gunModel[155] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Import ImportBox11
        gunModel[156] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Import ImportBox11
        gunModel[157] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Import ImportBox11
        gunModel[158] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Import ImportBox11
        gunModel[159] = new ModelRendererTurbo(this, 113, 177, textureX, textureY); // Import Box166
        gunModel[160] = new ModelRendererTurbo(this, 137, 177, textureX, textureY); // Import Box167
        gunModel[161] = new ModelRendererTurbo(this, 161, 177, textureX, textureY); // Import Box168
        gunModel[162] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Import Box166
        gunModel[163] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Import Box167
        gunModel[164] = new ModelRendererTurbo(this, 17, 185, textureX, textureY); // Import Box168
        gunModel[165] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Import ImportBox69
        gunModel[166] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Import ImportBox72
        gunModel[167] = new ModelRendererTurbo(this, 89, 185, textureX, textureY); // Import ImportBox73
        gunModel[168] = new ModelRendererTurbo(this, 6, 201, textureX, textureY); // Import Box165
        gunModel[169] = new ModelRendererTurbo(this, 30, 201, textureX, textureY); // Import Box165
        gunModel[170] = new ModelRendererTurbo(this, 54, 201, textureX, textureY); // Import Box165
        gunModel[171] = new ModelRendererTurbo(this, 78, 201, textureX, textureY); // Import Box165
        gunModel[172] = new ModelRendererTurbo(this, 6, 201, textureX, textureY); // Import Box166
        gunModel[173] = new ModelRendererTurbo(this, 22, 201, textureX, textureY); // Import Box167
        gunModel[174] = new ModelRendererTurbo(this, 30, 201, textureX, textureY); // Import Box168

        gunModel[0].addShapeBox(0F, 0F, 0F, 48, 1, 7, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox0
        gunModel[0].setRotationPoint(-7F, -30.5F, -3.5F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 14, 2, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox1
        gunModel[1].setRotationPoint(8F, -22.5F, -2.5F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox5
        gunModel[2].setRotationPoint(-4F, -29F, -4F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Import ImportBox6
        gunModel[3].setRotationPoint(-4F, -29F, -4.5F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.625F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.75F, -0.125F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F); // Import ImportBox7
        gunModel[4].setRotationPoint(-5F, -29F, -4.5F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F); // Import ImportBox8
        gunModel[5].setRotationPoint(-5F, -29F, -4F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 42, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Import ImportBox9
        gunModel[6].setRotationPoint(-4F, -29F, 3.5F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, -0.75F, -0.625F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.25F, -0.25F, -0.75F, -0.125F, -0.25F); // Import ImportBox10
        gunModel[7].setRotationPoint(-5F, -29F, 3.5F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F); // Import ImportBox11
        gunModel[8].setRotationPoint(7F, -29F, -4F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.75F, -0.625F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.75F, -0.125F, -0.25F, 0F, 0.25F, -0.25F); // Import ImportBox12
        gunModel[9].setRotationPoint(38F, -29F, 3.5F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.625F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, -0.75F, -0.125F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0.5F, -0.5F); // Import ImportBox13
        gunModel[10].setRotationPoint(7F, -29F, -4.5F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F); // Import ImportBox14
        gunModel[11].setRotationPoint(7F, -26.25F, -4F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.625F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, -0.75F, -0.125F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0.5F, -0.5F); // Import ImportBox16
        gunModel[12].setRotationPoint(7F, -26.25F, -4.5F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Import ImportBox17
        gunModel[13].setRotationPoint(-4F, -26.25F, -4.5F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.625F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.75F, -0.125F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F); // Import ImportBox18
        gunModel[14].setRotationPoint(-5F, -26.25F, -4.5F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F); // Import ImportBox19
        gunModel[15].setRotationPoint(-5F, -26.25F, -4F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox20
        gunModel[16].setRotationPoint(-4F, -26.25F, -4F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 7, 18, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox24
        gunModel[17].setRotationPoint(9F, -20.5F, -3F);

        gunModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportBox26
        gunModel[18].setRotationPoint(6F, -20.5F, -3F);

        gunModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, -1F, 0F, -1F); // Import ImportBox27
        gunModel[19].setRotationPoint(6F, -19.5F, -3F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F); // Import ImportBox28
        gunModel[20].setRotationPoint(8F, -18.5F, -3F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 1, 17, 6, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox32
        gunModel[21].setRotationPoint(16F, -20.5F, -3F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Import ImportBox33
        gunModel[22].setRotationPoint(7F, -2.5F, -3F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import ImportBox34
        gunModel[23].setRotationPoint(9F, -2.5F, -3F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1.5F, -0.5F, -1F, 1.5F, -0.5F, -1F, 0F, -0.5F, 0F); // Import ImportBox35
        gunModel[24].setRotationPoint(16F, -3.5F, -3F);

        gunModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox36
        gunModel[25].setRotationPoint(16F, -2.5F, -3F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F); // Import ImportBox51
        gunModel[26].setRotationPoint(17F, -15F, -1F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -1F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -1F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -1F, 0F); // Import ImportBox53
        gunModel[27].setRotationPoint(27F, -14F, -1F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import ImportBox55
        gunModel[28].setRotationPoint(27F, -20.5F, -1F);

        gunModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox56
        gunModel[29].setRotationPoint(22.5F, -20.5F, -0.5F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.25F, 0F, 1.5F, 0.25F, 0F, 1.5F, 0.25F, 0F, -2F, 0.25F, 0F); // Import ImportBox57
        gunModel[30].setRotationPoint(21.5F, -17.5F, -0.5F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox66
        gunModel[31].setRotationPoint(-5.5F, -31.5F, -2.5F);

        gunModel[32].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F, 0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox88
        gunModel[32].setRotationPoint(35F, -31.5F, -2.5F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F); // Import ImportBox102
        gunModel[33].setRotationPoint(-7.75F, -29.5F, -3.5F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Import ImportBox113
        gunModel[34].setRotationPoint(13F, -14.5F, -3F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, -0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F); // Import ImportBox114
        gunModel[35].setRotationPoint(14F, -14.5F, -3F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0.25F, -0.75F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, 0F, 0F, 0.25F); // Import ImportBox115
        gunModel[36].setRotationPoint(14F, -14.5F, -3F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, -0.75F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0.25F, 0.25F); // Import ImportBox116
        gunModel[37].setRotationPoint(14.5F, -14.5F, -3F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox121
        gunModel[38].setRotationPoint(41F, -27F, -3F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F, 0F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox122
        gunModel[39].setRotationPoint(41F, -29F, -3F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, 0F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox123
        gunModel[40].setRotationPoint(41F, -29.5F, -2F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, 0F, -0.5F, -1F); // Import ImportBox124
        gunModel[41].setRotationPoint(41F, -25F, -3F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Import ImportBox125
        gunModel[42].setRotationPoint(41F, -23.5F, -2F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Import ImportBox126
        gunModel[43].setRotationPoint(46F, -26.5F, -1.5F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Import ImportBox137
        gunModel[44].setRotationPoint(46F, -27F, -1.5F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Import ImportBox138
        gunModel[45].setRotationPoint(46F, -27.5F, -1.5F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Import ImportBox139
        gunModel[46].setRotationPoint(46F, -26F, -1.5F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F); // Import ImportBox140
        gunModel[47].setRotationPoint(46F, -25.5F, -1.5F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 48, 1, 7, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F); // Import Box148
        gunModel[48].setRotationPoint(-7F, -23.5F, -3.5F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 15, 2, 5, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -12.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -12.5F, 0F, -0.25F); // Import Box150
        gunModel[49].setRotationPoint(-7F, -22.5F, -2.5F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 19, 2, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box151
        gunModel[50].setRotationPoint(22F, -22.5F, -2.5F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, 0F); // Import Box165
        gunModel[51].setRotationPoint(40.75F, -29.5F, -3.5F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Import Box166
        gunModel[52].setRotationPoint(4F, -23.5F, -5F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Import Box167
        gunModel[53].setRotationPoint(4F, -24F, -5F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F); // Import Box168
        gunModel[54].setRotationPoint(4F, -23F, -5F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 48, 1, 7, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox0
        gunModel[55].setRotationPoint(-7F, -25.5F, -3.5F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 16, 4, 7, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox0
        gunModel[56].setRotationPoint(-7F, -29.5F, -3.5F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 24, 4, 7, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox0
        gunModel[57].setRotationPoint(17F, -29.5F, -3.5F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox0
        gunModel[58].setRotationPoint(8.5F, -29.5F, 0.5F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Import Box166
        gunModel[59].setRotationPoint(19F, -22F, -3F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Import Box167
        gunModel[60].setRotationPoint(19F, -22.5F, -3F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F); // Import Box168
        gunModel[61].setRotationPoint(19F, -21.5F, -3F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 42, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox5
        gunModel[62].setRotationPoint(-4F, -29F, 3F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F); // Import ImportBox8
        gunModel[63].setRotationPoint(-5F, -29F, 3F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F); // Import ImportBox11
        gunModel[64].setRotationPoint(38F, -29F, 3F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 42, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Import ImportBox9
        gunModel[65].setRotationPoint(-4F, -26.25F, 3.5F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, -0.75F, -0.625F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.25F, -0.25F, -0.75F, -0.125F, -0.25F); // Import ImportBox10
        gunModel[66].setRotationPoint(-5F, -26.25F, 3.5F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.75F, -0.625F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.75F, -0.125F, -0.25F, 0F, 0.25F, -0.25F); // Import ImportBox12
        gunModel[67].setRotationPoint(38F, -26.25F, 3.5F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 42, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox5
        gunModel[68].setRotationPoint(-4F, -26.25F, 3F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F); // Import ImportBox8
        gunModel[69].setRotationPoint(-5F, -26.25F, 3F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F); // Import ImportBox11
        gunModel[70].setRotationPoint(38F, -26.25F, 3F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import ImportBox55
        gunModel[71].setRotationPoint(27.5F, -19F, -1F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 32, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import ImportBox0
        gunModel[72].setRotationPoint(1F, -31.5F, -1.5F);

        gunModel[73].addShapeBox(0F, 0F, 0F, 33, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
        gunModel[73].setRotationPoint(0.5F, -31F, -2F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
        gunModel[74].setRotationPoint(1F, -32F, -1.5F);

        gunModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, -1F, -0.75F, -0.125F, -1.125F, -0.75F, -0.125F, -1.125F, 0F, 0F, -1F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, 0F); // Import Box165
        gunModel[75].setRotationPoint(40.75F, -30.5F, -3.5F);

        gunModel[76].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox5
        gunModel[76].setRotationPoint(19F, -29F, -4F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Import ImportBox6
        gunModel[77].setRotationPoint(19F, -29F, -4.5F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.625F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.75F, -0.125F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F); // Import ImportBox7
        gunModel[78].setRotationPoint(18F, -29F, -4.5F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F); // Import ImportBox8
        gunModel[79].setRotationPoint(18F, -29F, -4F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F); // Import ImportBox11
        gunModel[80].setRotationPoint(38F, -29F, -4F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.625F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, -0.75F, -0.125F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0.5F, -0.5F); // Import ImportBox13
        gunModel[81].setRotationPoint(38F, -29F, -4.5F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox5
        gunModel[82].setRotationPoint(19F, -26.25F, -4F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Import ImportBox6
        gunModel[83].setRotationPoint(19F, -26.25F, -4.5F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.625F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.75F, -0.125F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F); // Import ImportBox7
        gunModel[84].setRotationPoint(18F, -26.25F, -4.5F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F); // Import ImportBox8
        gunModel[85].setRotationPoint(18F, -26.25F, -4F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F); // Import ImportBox11
        gunModel[86].setRotationPoint(38F, -26.25F, -4F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.625F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, -0.75F, -0.125F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0.5F, -0.5F); // Import ImportBox13
        gunModel[87].setRotationPoint(38F, -26.25F, -4.5F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
        gunModel[88].setRotationPoint(4F, -32F, -1.5F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
        gunModel[89].setRotationPoint(6F, -32F, -1.5F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
        gunModel[90].setRotationPoint(8F, -32F, -1.5F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
        gunModel[91].setRotationPoint(10F, -32F, -1.5F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
        gunModel[92].setRotationPoint(12F, -32F, -1.5F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
        gunModel[93].setRotationPoint(16F, -32F, -1.5F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
        gunModel[94].setRotationPoint(19F, -32F, -1.5F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
        gunModel[95].setRotationPoint(21F, -32F, -1.5F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
        gunModel[96].setRotationPoint(23F, -32F, -1.5F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
        gunModel[97].setRotationPoint(25F, -32F, -1.5F);

        gunModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
        gunModel[98].setRotationPoint(27F, -32F, -1.5F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
        gunModel[99].setRotationPoint(14F, -32F, -1.5F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
        gunModel[100].setRotationPoint(29F, -32F, -1.5F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
        gunModel[101].setRotationPoint(31F, -32F, -1.5F);

        gunModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.75F, -0.125F, -1.125F, 0F, 0F, -1F, 0F, 0F, -1F, -0.75F, -0.125F, -1.125F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F); // Import Box165
        gunModel[102].setRotationPoint(-7.75F, -30.5F, -3.5F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox56
        gunModel[103].setRotationPoint(22F, -18.5F, -0.5F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox56
        gunModel[104].setRotationPoint(22F, -20.5F, -1F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 58, 1, 1, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F); // Import Box166
        gunModel[105].setRotationPoint(-8F, -23.5F, 3.5F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 58, 1, 1, 0F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F); // Import Box167
        gunModel[106].setRotationPoint(-8F, -24F, 3.5F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 58, 1, 1, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F); // Import Box168
        gunModel[107].setRotationPoint(-8F, -23F, 3.5F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 48, 1, 7, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox0
        gunModel[108].setRotationPoint(-7F, -24.5F, -3.5F);

        gunModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, -0.75F, -0.125F, -1.125F, 0F, 0F, -1F, 0F, 0F, -1F, -0.75F, -0.125F, -1.125F); // Import Box165
        gunModel[109].setRotationPoint(-7.75F, -23.5F, -3.5F);

        gunModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, 0F, -1.125F, -0.75F, 0F, -1.125F, 0F, 0F, -1F); // Import Box165
        gunModel[110].setRotationPoint(40.75F, -23.5F, -3.5F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 58, 1, 1, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F); // Import Box166
        gunModel[111].setRotationPoint(-8F, -23.5F, -4.5F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 58, 1, 1, 0F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F); // Import Box167
        gunModel[112].setRotationPoint(-8F, -24F, -4.5F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 58, 1, 1, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F); // Import Box168
        gunModel[113].setRotationPoint(-8F, -23F, -4.5F);

        gunModel[114].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F); // Import Box166
        gunModel[114].setRotationPoint(-10F, -22F, 3.5F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F); // Import Box167
        gunModel[115].setRotationPoint(-10F, -22F, 3F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F); // Import Box168
        gunModel[116].setRotationPoint(-10F, -22F, 4F);

        gunModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -2.125F, -0.5F, -0.25F, 1.125F, -1.5F, -0.25F, 1.125F, -1.5F, -0.25F, -2.125F, -0.5F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F); // Import Box166
        gunModel[117].setRotationPoint(-10F, -24F, 3.5F);

        gunModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -2.125F, -0.5F, -0.25F, 1.125F, -1.5F, -0.25F, 1.125F, -1.25F, -0.5F, -2.125F, -0.75F, -0.5F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, -0.25F, 0.125F, -0.5F, -0.25F, 0.125F, -0.5F); // Import Box166
        gunModel[118].setRotationPoint(-10F, -24F, 4F);

        gunModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -2.125F, -0.75F, -0.5F, 1.125F, -1.25F, -0.5F, 1.125F, -1.5F, -0.25F, -2.125F, -0.5F, -0.25F, -0.25F, 0.125F, -0.5F, -0.25F, 0.125F, -0.5F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F); // Import Box166
        gunModel[119].setRotationPoint(-10F, -24F, 3F);

        gunModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -2.125F, -0.5F, -0.25F, 1.125F, -1.5F, -0.25F, 1.125F, -1.5F, -0.25F, -2.125F, -0.5F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F); // Import Box166
        gunModel[120].setRotationPoint(-10F, -24F, -4.5F);

        gunModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -2.125F, -0.5F, -0.25F, 1.125F, -1.5F, -0.25F, 1.125F, -1.25F, -0.5F, -2.125F, -0.75F, -0.5F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, -0.25F, 0.125F, -0.5F, -0.25F, 0.125F, -0.5F); // Import Box166
        gunModel[121].setRotationPoint(-10F, -24F, -4F);

        gunModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -2.125F, -0.75F, -0.5F, 1.125F, -1.25F, -0.5F, 1.125F, -1.5F, -0.25F, -2.125F, -0.5F, -0.25F, -0.25F, 0.125F, -0.5F, -0.25F, 0.125F, -0.5F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F); // Import Box166
        gunModel[122].setRotationPoint(-10F, -24F, -5F);

        gunModel[123].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F); // Import Box166
        gunModel[123].setRotationPoint(-10F, -22F, -4.5F);

        gunModel[124].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F); // Import Box167
        gunModel[124].setRotationPoint(-10F, -22F, -5F);

        gunModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F); // Import Box168
        gunModel[125].setRotationPoint(-10F, -22F, -4F);

        gunModel[126].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, -2F, 0.125F, -0.25F, 2F, 0.125F, -0.25F, 2F, 0.125F, -0.25F, -2F, 0.125F, -0.25F); // Import Box166
        gunModel[126].setRotationPoint(-10F, -19F, 3.5F);

        gunModel[127].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F); // Import Box166
        gunModel[127].setRotationPoint(-8F, -16F, 3.5F);

        gunModel[128].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F); // Import Box167
        gunModel[128].setRotationPoint(-8F, -16F, 3F);

        gunModel[129].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F); // Import Box168
        gunModel[129].setRotationPoint(-8F, -16F, 4F);

        gunModel[130].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, -0.25F, 0.125F, -0.5F, -0.25F, 0.125F, -0.5F, -2F, 0.125F, -0.25F, 2F, 0.125F, -0.25F, 1.75F, 0.125F, -0.5F, -2.25F, 0.125F, -0.5F); // Import Box166
        gunModel[130].setRotationPoint(-10F, -19F, 4F);

        gunModel[131].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.25F, 0.125F, -0.5F, -0.25F, 0.125F, -0.5F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, -2.25F, 0.125F, -0.5F, 1.75F, 0.125F, -0.5F, 2F, 0.125F, -0.25F, -2F, 0.125F, -0.25F); // Import Box166
        gunModel[131].setRotationPoint(-10F, -19F, 3F);

        gunModel[132].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, -2F, 0.125F, -0.25F, 2F, 0.125F, -0.25F, 2F, 0.125F, -0.25F, -2F, 0.125F, -0.25F); // Import Box166
        gunModel[132].setRotationPoint(-10F, -19F, -4.5F);

        gunModel[133].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, -0.25F, 0.125F, -0.5F, -0.25F, 0.125F, -0.5F, -2F, 0.125F, -0.25F, 2F, 0.125F, -0.25F, 1.75F, 0.125F, -0.5F, -2.25F, 0.125F, -0.5F); // Import Box166
        gunModel[133].setRotationPoint(-10F, -19F, -4F);

        gunModel[134].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.25F, 0.125F, -0.5F, -0.25F, 0.125F, -0.5F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, -2.25F, 0.125F, -0.5F, 1.75F, 0.125F, -0.5F, 2F, 0.125F, -0.25F, -2F, 0.125F, -0.25F); // Import Box166
        gunModel[134].setRotationPoint(-10F, -19F, -5F);

        gunModel[135].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F); // Import Box166
        gunModel[135].setRotationPoint(-8F, -16F, -4.5F);

        gunModel[136].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F); // Import Box167
        gunModel[136].setRotationPoint(-8F, -16F, -5F);

        gunModel[137].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F); // Import Box168
        gunModel[137].setRotationPoint(-8F, -16F, -4F);

        gunModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, -0.5F, -2.125F, -0.25F, -0.5F, -2.125F, -0.25F, -1.5F, 1.125F, -0.25F, -1.5F, 1.125F); // Import Box166
        gunModel[138].setRotationPoint(-8F, -5F, -4.5F);

        gunModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, 0.125F, -0.25F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.5F, 0.125F, -0.25F, -0.5F, -0.75F, -2.125F, -0.25F, -0.5F, -2.125F, -0.25F, -1.5F, 1.125F, -0.5F, -1.25F, 1.125F); // Import Box166
        gunModel[139].setRotationPoint(-8.5F, -5F, -4.5F);

        gunModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0.125F, 0F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.25F, 0.125F, 0F, -0.25F, -0.5F, -2.125F, -0.5F, -0.75F, -2.125F, -0.5F, -1.25F, 1.125F, -0.25F, -1.5F, 1.125F); // Import Box166
        gunModel[140].setRotationPoint(-7.5F, -5F, -4.5F);

        gunModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, -1.5F, 1.125F, -0.25F, -1.5F, 1.125F, -0.25F, -0.5F, -2.125F, -0.25F, -0.5F, -2.125F); // Import Box166
        gunModel[141].setRotationPoint(-8F, -5F, 3.5F);

        gunModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, 0.125F, -0.25F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.5F, 0.125F, -0.25F, -0.5F, -1.25F, 1.125F, -0.25F, -1.5F, 1.125F, -0.25F, -0.5F, -2.125F, -0.5F, -0.75F, -2.125F); // Import Box166
        gunModel[142].setRotationPoint(-8.5F, -5F, 3.5F);

        gunModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0.125F, 0F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.25F, 0.125F, 0F, -0.25F, -1.5F, 1.125F, -0.5F, -1.25F, 1.125F, -0.5F, -0.75F, -2.125F, -0.25F, -0.5F, -2.125F); // Import Box166
        gunModel[143].setRotationPoint(-7.5F, -5F, 3.5F);

        gunModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Import Box166
        gunModel[144].setRotationPoint(-8F, -4.5F, -2.5F);

        gunModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F); // Import Box167
        gunModel[145].setRotationPoint(-8F, -4F, -2.5F);

        gunModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Import Box168
        gunModel[146].setRotationPoint(-8F, -5F, -2.5F);

        gunModel[147].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox11
        gunModel[147].setRotationPoint(35.5F, -23.75F, 4.25F);

        gunModel[148].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox11
        gunModel[148].setRotationPoint(35.5F, -23.75F, 2.75F);

        gunModel[149].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Import ImportBox11
        gunModel[149].setRotationPoint(35.5F, -23.75F, 3.75F);

        gunModel[150].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox11
        gunModel[150].setRotationPoint(35.5F, -23.75F, -3.75F);

        gunModel[151].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox11
        gunModel[151].setRotationPoint(35.5F, -23.75F, -5.25F);

        gunModel[152].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Import ImportBox11
        gunModel[152].setRotationPoint(35.5F, -23.75F, -4.25F);

        gunModel[153].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox11
        gunModel[153].setRotationPoint(-4.5F, -23.75F, -3.75F);

        gunModel[154].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox11
        gunModel[154].setRotationPoint(-4.5F, -23.75F, -5.25F);

        gunModel[155].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Import ImportBox11
        gunModel[155].setRotationPoint(-4.5F, -23.75F, -4.25F);

        gunModel[156].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox11
        gunModel[156].setRotationPoint(-4.5F, -23.75F, 4.25F);

        gunModel[157].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox11
        gunModel[157].setRotationPoint(-4.5F, -23.75F, 2.75F);

        gunModel[158].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Import ImportBox11
        gunModel[158].setRotationPoint(-4.5F, -23.75F, 3.75F);

        gunModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Import Box166
        gunModel[159].setRotationPoint(12F, -18F, -3.5F);

        gunModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Import Box167
        gunModel[160].setRotationPoint(12F, -18.5F, -3.5F);

        gunModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F); // Import Box168
        gunModel[161].setRotationPoint(12F, -17.5F, -3.5F);

        gunModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Import Box166
        gunModel[162].setRotationPoint(12F, -6F, -3.5F);

        gunModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Import Box167
        gunModel[163].setRotationPoint(12F, -6.5F, -3.5F);

        gunModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F); // Import Box168
        gunModel[164].setRotationPoint(12F, -5.5F, -3.5F);

        gunModel[165].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox69
        gunModel[165].setRotationPoint(7.75F, -22.5F, -3.5F);

        gunModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Import ImportBox72
        gunModel[166].setRotationPoint(7.75F, -21.5F, -3.5F);

        gunModel[167].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import ImportBox73
        gunModel[167].setRotationPoint(7.75F, -22F, -3.5F);

        gunModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -1.125F, 0F, -0.125F, -1.125F, 0F, -0.125F, -1.125F, 0F, -0.25F, -1.125F); // Import Box165
        gunModel[168].setRotationPoint(-8F, -23.5F, -3.5F);

        gunModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box165
        gunModel[169].setRotationPoint(-8F, -24.5F, -3.5F);

        gunModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -5.25F, -1F, 0F, -5.25F, 0F, 4F, -0.25F, 0F, 4F, -0.25F, 0F, 4F, -5.25F, 0F, 4F, -5.25F); // Import Box165
        gunModel[170].setRotationPoint(-8F, -29.25F, -3.5F);

        gunModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -5.25F, -1F, 0F, -5.25F, 0F, 4F, -0.25F, 0F, 4F, -0.25F, 0F, 4F, -5.25F, 0F, 4F, -5.25F); // Import Box165
        gunModel[171].setRotationPoint(-8F, -29.25F, 1.5F);

        gunModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F); // Import Box166
        gunModel[172].setRotationPoint(-7.5F, -25.75F, -0.5F);

        gunModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F); // Import Box167
        gunModel[173].setRotationPoint(-7.5F, -26.25F, -0.5F);

        gunModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F); // Import Box168
        gunModel[174].setRotationPoint(-7.5F, -25.25F, -0.5F);


        defaultScopeModel = new ModelRendererTurbo[28];
        defaultScopeModel[0] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import ImportBox64
        defaultScopeModel[1] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Import ImportBox69
        defaultScopeModel[2] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Import ImportBox70
        defaultScopeModel[3] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import ImportBox71
        defaultScopeModel[4] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Import ImportBox72
        defaultScopeModel[5] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Import ImportBox73
        defaultScopeModel[6] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Import ImportBox74
        defaultScopeModel[7] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Import ImportBox75
        defaultScopeModel[8] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Import ImportBox76
        defaultScopeModel[9] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Import ImportBox77
        defaultScopeModel[10] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Import ImportBox78
        defaultScopeModel[11] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Import ImportBox79
        defaultScopeModel[12] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Import ImportBox81
        defaultScopeModel[13] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import ImportBox84
        defaultScopeModel[14] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Import ImportBox86
        defaultScopeModel[15] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import ImportBox89
        defaultScopeModel[16] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Import ImportBox90
        defaultScopeModel[17] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Import ImportBox91
        defaultScopeModel[18] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Import Box143
        defaultScopeModel[19] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Import Box144
        defaultScopeModel[20] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Import Box145
        defaultScopeModel[21] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box146
        defaultScopeModel[22] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Import ImportBox89
        defaultScopeModel[23] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Import ImportBox89
        defaultScopeModel[24] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Import ImportBox89
        defaultScopeModel[25] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Import ImportBox89
        defaultScopeModel[26] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Import ImportBox64
        defaultScopeModel[27] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Import ImportBox89

        defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Import ImportBox64
        defaultScopeModel[0].setRotationPoint(-5F, -34.5F, 1.5F);

        defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox69
        defaultScopeModel[1].setRotationPoint(-4.25F, -33.5F, 1.75F);

        defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox70
        defaultScopeModel[2].setRotationPoint(-4.25F, -34F, 1.75F);

        defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import ImportBox71
        defaultScopeModel[3].setRotationPoint(-4.25F, -34.5F, 1.75F);

        defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Import ImportBox72
        defaultScopeModel[4].setRotationPoint(-4.25F, -32.5F, 1.75F);

        defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import ImportBox73
        defaultScopeModel[5].setRotationPoint(-4.25F, -33F, 1.75F);

        defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import ImportBox74
        defaultScopeModel[6].setRotationPoint(-4.25F, -34.5F, -2.75F);

        defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox75
        defaultScopeModel[7].setRotationPoint(-4.25F, -34F, -2.75F);

        defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox76
        defaultScopeModel[8].setRotationPoint(-4.25F, -33.5F, -2.75F);

        defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import ImportBox77
        defaultScopeModel[9].setRotationPoint(-4.25F, -33F, -2.75F);

        defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Import ImportBox78
        defaultScopeModel[10].setRotationPoint(-4.25F, -32.5F, -2.75F);

        defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox79
        defaultScopeModel[11].setRotationPoint(-4F, -32.7F, -1.5F);

        defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox81
        defaultScopeModel[12].setRotationPoint(-4F, -33.25F, -1.5F);

        defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox84
        defaultScopeModel[13].setRotationPoint(-4F, -33.25F, 0.5F);

        defaultScopeModel[14].addShapeBox(0F, 1F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox86
        defaultScopeModel[14].setRotationPoint(-4F, -35.25F, -1.5F);

        defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 2F, -0.25F, 0F); // Import ImportBox89
        defaultScopeModel[15].setRotationPoint(37.5F, -34.5F, -2.5F);

        defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox90
        defaultScopeModel[16].setRotationPoint(39F, -32F, -1.5F);

        defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.25F, -0.375F, 0F, 0.25F, -0.375F, 0F, 0.25F, -0.375F, -0.5F, 0.25F, -0.375F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Import ImportBox91
        defaultScopeModel[17].setRotationPoint(39F, -33.5F, -0.5F);

        defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Import Box143
        defaultScopeModel[18].setRotationPoint(-4F, -34.25F, -0.75F);

        defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.05F, 0F, -0.25F, 0.05F); // Import Box144
        defaultScopeModel[19].setRotationPoint(-4F, -34.25F, -0.25F);

        defaultScopeModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F); // Import Box145
        defaultScopeModel[20].setRotationPoint(-4F, -32.75F, -0.25F);

        defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Import Box146
        defaultScopeModel[21].setRotationPoint(-4F, -32.75F, -0.75F);

        defaultScopeModel[22].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, -1F, -2F, -0.5F, -1F, -2F, -0.5F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox89
        defaultScopeModel[22].setRotationPoint(37.5F, -36.75F, -2.5F);

        defaultScopeModel[23].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 2F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 2F, -0.25F, -0.5F); // Import ImportBox89
        defaultScopeModel[23].setRotationPoint(37.5F, -34.5F, 1.5F);

        defaultScopeModel[24].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, -0.5F, -1F, -2F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Import ImportBox89
        defaultScopeModel[24].setRotationPoint(37.5F, -36.75F, 1.5F);

        defaultScopeModel[25].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, -1F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox89
        defaultScopeModel[25].setRotationPoint(-5.5F, -36.25F, 1.5F);

        defaultScopeModel[26].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Import ImportBox64
        defaultScopeModel[26].setRotationPoint(-5F, -34.5F, -2.5F);

        defaultScopeModel[27].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, -1F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox89
        defaultScopeModel[27].setRotationPoint(-5.5F, -36.25F, -2.5F);


        defaultGripModel = new ModelRendererTurbo[14];
        defaultGripModel[0] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Import Box151
        defaultGripModel[1] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import ImportBox24
        defaultGripModel[2] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Import ImportBox24
        defaultGripModel[3] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Import ImportBox24
        defaultGripModel[4] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Import ImportBox24
        defaultGripModel[5] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Import ImportBox24
        defaultGripModel[6] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Import ImportBox24
        defaultGripModel[7] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Import ImportBox24
        defaultGripModel[8] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Import ImportBox24
        defaultGripModel[9] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Import ImportBox24
        defaultGripModel[10] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Import Box151
        defaultGripModel[11] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Import Box151
        defaultGripModel[12] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Import Box151
        defaultGripModel[13] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 109

        defaultGripModel[0].addShapeBox(0F, 0F, 0F, 13, 1, 6, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, -1F, 0F, -0.25F); // Import Box151
        defaultGripModel[0].setRotationPoint(28F, -20.5F, -3F);

        defaultGripModel[1].addShapeBox(-3F, 0F, -2.5F, 8, 19, 5, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox24
        defaultGripModel[1].setRotationPoint(34.5F, -22F, 0F);
        defaultGripModel[1].rotateAngleZ = -0.20943951F;

        defaultGripModel[2].addShapeBox(-3F, 4F, 1.5F, 8, 16, 3, 0F, -1F, -0.7F, -1F, 0F, 1F, -1F, -2F, -3F, -0.5F, -3F, -3.6F, -0.5F, -1F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -0.5F, -3F, 0F, -0.5F); // Import ImportBox24
        defaultGripModel[2].setRotationPoint(34.5F, -23F, 0F);
        defaultGripModel[2].rotateAngleZ = -0.20943951F;

        defaultGripModel[3].addShapeBox(-3F, 4F, -4.5F, 8, 16, 3, 0F, -3F, -3.6F, -0.5F, -2F, -3F, -0.5F, 0F, 1F, -1F, -1F, -0.7F, -1F, -3F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -1F, -1F, 0F, -1F); // Import ImportBox24
        defaultGripModel[3].setRotationPoint(34.5F, -23F, 0F);
        defaultGripModel[3].rotateAngleZ = -0.20943951F;

        defaultGripModel[4].addShapeBox(-1F, 16F, -2F, 8, 4, 4, 0F, 0F, 5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox24
        defaultGripModel[4].setRotationPoint(34.5F, -23F, 0F);
        defaultGripModel[4].rotateAngleZ = -0.20943951F;

        defaultGripModel[5].addShapeBox(-1F, 16F, 2F, 8, 4, 2, 0F, -1F, 5F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -1F, 5F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F); // Import ImportBox24
        defaultGripModel[5].setRotationPoint(34.5F, -23F, 0F);
        defaultGripModel[5].rotateAngleZ = -0.20943951F;

        defaultGripModel[6].addShapeBox(-1F, 16F, -4F, 8, 4, 2, 0F, -1F, 5F, -0.5F, -2F, -3F, 0F, 0F, -3F, 0F, -1F, 5F, 0F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox24
        defaultGripModel[6].setRotationPoint(34.5F, -23F, 0F);
        defaultGripModel[6].rotateAngleZ = -0.20943951F;

        defaultGripModel[7].addShapeBox(-5F, 20F, -2.5F, 11, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox24
        defaultGripModel[7].setRotationPoint(35.5F, -23F, 0F);
        defaultGripModel[7].rotateAngleZ = -0.20943951F;

        defaultGripModel[8].addShapeBox(-5F, 20F, -4.5F, 11, 1, 2, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox24
        defaultGripModel[8].setRotationPoint(35.5F, -23F, 0F);
        defaultGripModel[8].rotateAngleZ = -0.20943951F;

        defaultGripModel[9].addShapeBox(-5F, 20F, 2.5F, 11, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F); // Import ImportBox24
        defaultGripModel[9].setRotationPoint(35.5F, -23F, 0F);
        defaultGripModel[9].rotateAngleZ = -0.20943951F;

        defaultGripModel[10].addShapeBox(0F, 0F, 0F, 15, 1, 6, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box151
        defaultGripModel[10].setRotationPoint(29F, -19.5F, -3F);

        defaultGripModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -0.25F, 1F, -1F, -1.25F, 1F, -1F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0F, -0.25F); // Import Box151
        defaultGripModel[11].setRotationPoint(44F, -19.5F, -3F);

        defaultGripModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, -1F, 0F, -1.25F, 0F, -1.5F, -1.75F, 0F, -1.5F, -1.75F, -1F, 0F, -1.25F, 0F, -0.5F, -1.25F, -1F, 1F, -1.75F, -1F, 1F, -1.75F, 0F, -0.5F, -1.25F); // Import Box151
        defaultGripModel[12].setRotationPoint(46F, -18.5F, -3F);

        defaultGripModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, -1F, 0.5F, -1.75F, -1F, -2.5F, -2.25F, -1F, -2.5F, -2.25F, -1F, 0.5F, -1.75F, 0F, -1F, -1.75F, -1.5F, 2F, -2.25F, -1.5F, 2F, -2.25F, 0F, -1F, -1.75F); // Box 109
        defaultGripModel[13].setRotationPoint(47F, -16.5F, -3F);


        ammoModel = new ModelRendererTurbo[10];
        ammoModel[0] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import ImportBox37
        ammoModel[1] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Import ImportBox38
        ammoModel[2] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Import ImportBox39
        ammoModel[3] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import ImportBox40
        ammoModel[4] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Import ImportBox104
        ammoModel[5] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Import ImportBox105
        ammoModel[6] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Import ImportBox106
        ammoModel[7] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import ImportBox107
        ammoModel[8] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Import ImportBox114
        ammoModel[9] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Import ImportBox115

        ammoModel[0].addShapeBox(0F, 0F, 0F, 6, 30, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox37
        ammoModel[0].setRotationPoint(10F, -16.5F, -2.5F);

        ammoModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.25F); // Import ImportBox38
        ammoModel[1].setRotationPoint(14F, 13.5F, -2.5F);

        ammoModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F); // Import ImportBox39
        ammoModel[2].setRotationPoint(11F, 13.5F, -2.5F);

        ammoModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F); // Import ImportBox40
        ammoModel[3].setRotationPoint(10F, 13.5F, -2.5F);

        ammoModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox104
        ammoModel[4].setRotationPoint(11F, -17.5F, -2.5F);

        ammoModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox105
        ammoModel[5].setRotationPoint(10F, -17.5F, -2.5F);

        ammoModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox106
        ammoModel[6].setRotationPoint(10F, -17.5F, 0.5F);

        ammoModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox107
        ammoModel[7].setRotationPoint(11F, -17.5F, 1.5F);

        ammoModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox114
        ammoModel[8].setRotationPoint(11F, -17.5F, 0.5F);

        ammoModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox115
        ammoModel[9].setRotationPoint(11F, -17.5F, -1.5F);


        extraAmmoModel = new ModelRendererTurbo[10];
        extraAmmoModel[0] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import ImportBox37
        extraAmmoModel[1] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Import ImportBox38
        extraAmmoModel[2] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Import ImportBox39
        extraAmmoModel[3] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import ImportBox40
        extraAmmoModel[4] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Import ImportBox104
        extraAmmoModel[5] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Import ImportBox105
        extraAmmoModel[6] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Import ImportBox106
        extraAmmoModel[7] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import ImportBox107
        extraAmmoModel[8] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Import ImportBox114
        extraAmmoModel[9] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Import ImportBox115

        extraAmmoModel[0].addShapeBox(0F, 0F, 0F, 6, 30, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox37
        extraAmmoModel[0].setRotationPoint(10F, -16.5F, -2.5F);

        extraAmmoModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.25F); // Import ImportBox38
        extraAmmoModel[1].setRotationPoint(14F, 13.5F, -2.5F);

        extraAmmoModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F); // Import ImportBox39
        extraAmmoModel[2].setRotationPoint(11F, 13.5F, -2.5F);

        extraAmmoModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F); // Import ImportBox40
        extraAmmoModel[3].setRotationPoint(10F, 13.5F, -2.5F);

        extraAmmoModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox104
        extraAmmoModel[4].setRotationPoint(11F, -17.5F, -2.5F);

        extraAmmoModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox105
        extraAmmoModel[5].setRotationPoint(10F, -17.5F, -2.5F);

        extraAmmoModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox106
        extraAmmoModel[6].setRotationPoint(10F, -17.5F, 0.5F);

        extraAmmoModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox107
        extraAmmoModel[7].setRotationPoint(11F, -17.5F, 1.5F);

        extraAmmoModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox114
        extraAmmoModel[8].setRotationPoint(11F, -17.5F, 0.5F);

        extraAmmoModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox115
        extraAmmoModel[9].setRotationPoint(11F, -17.5F, -1.5F);


        slideModel = new ModelRendererTurbo[1];
        slideModel[0] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Import ImportBox0

        slideModel[0].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox0
        slideModel[0].setRotationPoint(8.5F, -29.5F, -2.5F);


        pumpModel = new ModelRendererTurbo[10];
        pumpModel[0] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Import ImportBox69
        pumpModel[1] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Import ImportBox72
        pumpModel[2] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Import ImportBox73
        pumpModel[3] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Import ImportBox72
        pumpModel[4] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Import ImportBox73
        pumpModel[5] = new ModelRendererTurbo(this, 102, 201, textureX, textureY); // Import ImportBox121
        pumpModel[6] = new ModelRendererTurbo(this, 118, 201, textureX, textureY); // Import ImportBox124
        pumpModel[7] = new ModelRendererTurbo(this, 46, 201, textureX, textureY); // Import ImportBox125
        pumpModel[8] = new ModelRendererTurbo(this, 134, 201, textureX, textureY); // Import ImportBox124
        pumpModel[9] = new ModelRendererTurbo(this, 70, 201, textureX, textureY); // Import ImportBox125

        pumpModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 5F, -0.15F, 0.5F, 5F, -0.15F, 0.5F, 5F, -0.15F, 0.5F, 5F, -0.15F, 0.5F, 5F, -0.15F, 0.5F, 5F, -0.15F, 0.5F, 5F, -0.15F, 0.5F, 5F, -0.15F, 0.5F); // Import ImportBox69
        pumpModel[0].setRotationPoint(-3.25F, -28.5F, -1F);

        pumpModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 5F, -0.5F, 0.25F, 5F, -0.5F, 0.25F, 5F, -0.5F, 0.25F, 5F, -0.5F, 0.25F, 5F, 0F, -0.55F, 5F, 0F, -0.55F, 5F, 0F, -0.55F, 5F, 0F, -0.55F); // Import ImportBox72
        pumpModel[1].setRotationPoint(-3.25F, -27.5F, -1F);

        pumpModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 5F, -0.35F, 0.5F, 5F, -0.35F, 0.5F, 5F, -0.35F, 0.5F, 5F, -0.35F, 0.5F, 5F, 0F, 0.25F, 5F, 0F, 0.25F, 5F, 0F, 0.25F, 5F, 0F, 0.25F); // Import ImportBox73
        pumpModel[2].setRotationPoint(-3.25F, -28F, -1F);

        pumpModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 5F, 0F, -0.55F, 5F, 0F, -0.55F, 5F, 0F, -0.55F, 5F, 0F, -0.55F, 5F, -0.5F, 0.25F, 5F, -0.5F, 0.25F, 5F, -0.5F, 0.25F, 5F, -0.5F, 0.25F); // Import ImportBox72
        pumpModel[3].setRotationPoint(-3.25F, -29.5F, -1F);

        pumpModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 5F, 0F, 0.25F, 5F, 0F, 0.25F, 5F, 0F, 0.25F, 5F, 0F, 0.25F, 5F, -0.35F, 0.5F, 5F, -0.35F, 0.5F, 5F, -0.35F, 0.5F, 5F, -0.35F, 0.5F); // Import ImportBox73
        pumpModel[4].setRotationPoint(-3.25F, -29F, -1F);

        pumpModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Import ImportBox121
        pumpModel[5].setRotationPoint(-9F, -29F, -3F);

        pumpModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F); // Import ImportBox124
        pumpModel[6].setRotationPoint(-9F, -27.25F, -3F);

        pumpModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F); // Import ImportBox125
        pumpModel[7].setRotationPoint(-9F, -26F, -2F);

        pumpModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox124
        pumpModel[8].setRotationPoint(-9F, -30.75F, -3F);

        pumpModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import ImportBox125
        pumpModel[9].setRotationPoint(-9F, -31F, -2F);


        gunSlideDistance = 0.5F;

        barrelAttachPoint = new Vector3f(56F / 16F, 26F / 16F, 0F / 16F);
        scopeAttachPoint = new Vector3f(12F / 16F, 31.5F / 16F, 0F / 16F);
        gripAttachPoint = new Vector3f(34 / 16F, 20.5F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(33F / 16F, 27F / 16F, -3.5F / 16F);

        animationType = EnumAnimationType.CUSTOM;
        rotateGunVertical = 50F;
        rotateGunHorizontal = 0F;
        tiltGun = 40F;
        translateGun = new Vector3f(0 / 16F, 0 / 16F, 0F / 16F);
        translateClip = new Vector3f(-15 / 16F, -15F / 16F, 0F / 16F);


        hasFlash = true;
        hasArms = true;

        leftArmPos = new Vector3f(0.05F, -0.4F, -0.05F);
        leftArmRot = new Vector3f(80.0F, 50.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.1F, -0.5F, 0.0F);
        leftArmReloadRot = new Vector3f(80.0F, 50.0F, 0.0F);
        rightArmPos = new Vector3f(0.22F, -0.55F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmReloadPos = new Vector3f(0.22F, -0.55F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);

        rightHandAmmo = false;
        leftHandAmmo = false;

        fancyStance = true;
        stanceRotate = new Vector3f(45F, 0.0F, -10.0F);
        stanceTranslate = new Vector3f(0.2F, 0F, 0F);

        casingAttachPoint = new Vector3f(25F / 16F, 27F / 16F, 0.5F / 16F);
        casingAnimDistance = new Vector3f(0, 0, 8);
        casingAnimSpread = new Vector3f(3, 2, 0);
        casingAnimTime = 5;
        casingRotateVector = new Vector3f(0F, -40F, 20F);
        caseScale = 1.0F;

        flashScale = 0.6F;
        muzzleFlashPoint = new Vector3f(0.6F, 0.3F, 0.01F);
        crouchZoom = -0.05F;
        zoomOffset = 0.2F;
        zoomOffsetY = -0.01F;

        gunOffset = -0.7F;
        thirdPersonOffset = new Vector3f(-0.2F, -0.1F, 0F);
        translateAll(0F, 0F, 0F);

        hasFlash = true;
        flashScale = 3F;
        muzzleFlashPoint = new Vector3f(
                barrelAttachPoint.x / flashScale,
                barrelAttachPoint.y / flashScale,
                barrelAttachPoint.z / flashScale
        );

        flipAll();
    }
}