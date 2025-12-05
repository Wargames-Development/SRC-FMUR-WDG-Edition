//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: VKS
// Model Creator: 
// Created on: 18.12.2021 - 22:19:07
// Last changed on: 18.12.2021 - 22:19:07

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelVKS extends ModelGun //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public ModelVKS() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[242];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Import
        gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Import
        gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Import
        gunModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Import
        gunModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Import
        gunModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Import
        gunModel[6] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Import
        gunModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Import
        gunModel[8] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Import
        gunModel[9] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Import
        gunModel[10] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Import
        gunModel[11] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Import
        gunModel[12] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Import
        gunModel[13] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Import
        gunModel[14] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import Import
        gunModel[15] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import Import
        gunModel[16] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Import
        gunModel[17] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Import
        gunModel[18] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Import
        gunModel[19] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Import
        gunModel[20] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import Import
        gunModel[21] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Import
        gunModel[22] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Import
        gunModel[23] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import Import
        gunModel[24] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import Import
        gunModel[25] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Import Import
        gunModel[26] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Import Import
        gunModel[27] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Import
        gunModel[28] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Import Import
        gunModel[29] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Import Import
        gunModel[30] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 33
        gunModel[31] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 33
        gunModel[32] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 33
        gunModel[33] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 33
        gunModel[34] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 33
        gunModel[35] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 33
        gunModel[36] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 33
        gunModel[37] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 33
        gunModel[38] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 33
        gunModel[39] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 33
        gunModel[40] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 33
        gunModel[41] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 33
        gunModel[42] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 33
        gunModel[43] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 33
        gunModel[44] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 33
        gunModel[45] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 33
        gunModel[46] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 33
        gunModel[47] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 33
        gunModel[48] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 33
        gunModel[49] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 33
        gunModel[50] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 33
        gunModel[51] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 33
        gunModel[52] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 33
        gunModel[53] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 33
        gunModel[54] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 33
        gunModel[55] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 33
        gunModel[56] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 33
        gunModel[57] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 33
        gunModel[58] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 33
        gunModel[59] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 33
        gunModel[60] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 33
        gunModel[61] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 33
        gunModel[62] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 33
        gunModel[63] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 33
        gunModel[64] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 33
        gunModel[65] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 33
        gunModel[66] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 33
        gunModel[67] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 33
        gunModel[68] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 33
        gunModel[69] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 33
        gunModel[70] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 33
        gunModel[71] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 33
        gunModel[72] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 33
        gunModel[73] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 33
        gunModel[74] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 33
        gunModel[75] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 78
        gunModel[76] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 33
        gunModel[77] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 33
        gunModel[78] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 33
        gunModel[79] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 33
        gunModel[80] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 83
        gunModel[81] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 83
        gunModel[82] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 83
        gunModel[83] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 83
        gunModel[84] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 83
        gunModel[85] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 83
        gunModel[86] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 83
        gunModel[87] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 83
        gunModel[88] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 83
        gunModel[89] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 83
        gunModel[90] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 83
        gunModel[91] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 83
        gunModel[92] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 83
        gunModel[93] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 83
        gunModel[94] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 83
        gunModel[95] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 83
        gunModel[96] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 83
        gunModel[97] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import Import
        gunModel[98] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Import Import
        gunModel[99] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Import
        gunModel[100] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Import
        gunModel[101] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import Import
        gunModel[102] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Import
        gunModel[103] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Import
        gunModel[104] = new ModelRendererTurbo(this, 385, 153, textureX, textureY); // Box 33
        gunModel[105] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 33
        gunModel[106] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Box 33
        gunModel[107] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 33
        gunModel[108] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 33
        gunModel[109] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 33
        gunModel[110] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 33
        gunModel[111] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 33
        gunModel[112] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 33
        gunModel[113] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 33
        gunModel[114] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 33
        gunModel[115] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 33
        gunModel[116] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 33
        gunModel[117] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 33
        gunModel[118] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 33
        gunModel[119] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 33
        gunModel[120] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 33
        gunModel[121] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 33
        gunModel[122] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 33
        gunModel[123] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 33
        gunModel[124] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 33
        gunModel[125] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 33
        gunModel[126] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 33
        gunModel[127] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 33
        gunModel[128] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 33
        gunModel[129] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 33
        gunModel[130] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 33
        gunModel[131] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 33
        gunModel[132] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 33
        gunModel[133] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 33
        gunModel[134] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 33
        gunModel[135] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Box 146
        gunModel[136] = new ModelRendererTurbo(this, 353, 169, textureX, textureY); // Box 146
        gunModel[137] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 146
        gunModel[138] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 149
        gunModel[139] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 149
        gunModel[140] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 149
        gunModel[141] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 149
        gunModel[142] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 149
        gunModel[143] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 149
        gunModel[144] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 149
        gunModel[145] = new ModelRendererTurbo(this, 457, 169, textureX, textureY); // Box 149
        gunModel[146] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Box 149
        gunModel[147] = new ModelRendererTurbo(this, 105, 177, textureX, textureY); // Box 149
        gunModel[148] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Box 149
        gunModel[149] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 149
        gunModel[150] = new ModelRendererTurbo(this, 209, 201, textureX, textureY); // Box 149
        gunModel[151] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 149
        gunModel[152] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); // Box 149
        gunModel[153] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 33
        gunModel[154] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 33
        gunModel[155] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Box 33
        gunModel[156] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 33
        gunModel[157] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 33
        gunModel[158] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 33
        gunModel[159] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 33
        gunModel[160] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 33
        gunModel[161] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 33
        gunModel[162] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 33
        gunModel[163] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 33
        gunModel[164] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 33
        gunModel[165] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 33
        gunModel[166] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 33
        gunModel[167] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 33
        gunModel[168] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 33
        gunModel[169] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 33
        gunModel[170] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Box 33
        gunModel[171] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Box 33
        gunModel[172] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 190
        gunModel[173] = new ModelRendererTurbo(this, 193, 177, textureX, textureY); // Box 190
        gunModel[174] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 33
        gunModel[175] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 33
        gunModel[176] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 33
        gunModel[177] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 33
        gunModel[178] = new ModelRendererTurbo(this, 425, 217, textureX, textureY); // Box 33
        gunModel[179] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Box 33
        gunModel[180] = new ModelRendererTurbo(this, 105, 241, textureX, textureY); // Box 33
        gunModel[181] = new ModelRendererTurbo(this, 137, 241, textureX, textureY); // Box 33
        gunModel[182] = new ModelRendererTurbo(this, 353, 257, textureX, textureY); // Box 287
        gunModel[183] = new ModelRendererTurbo(this, 473, 257, textureX, textureY); // Box 287
        gunModel[184] = new ModelRendererTurbo(this, 145, 265, textureX, textureY); // Box 287
        gunModel[185] = new ModelRendererTurbo(this, 377, 265, textureX, textureY); // Box 287
        gunModel[186] = new ModelRendererTurbo(this, 433, 265, textureX, textureY); // Box 287
        gunModel[187] = new ModelRendererTurbo(this, 217, 185, textureX, textureY); // Box 287
        gunModel[188] = new ModelRendererTurbo(this, 401, 265, textureX, textureY); // Box 287
        gunModel[189] = new ModelRendererTurbo(this, 225, 273, textureX, textureY); // Box 287
        gunModel[190] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Box 287
        gunModel[191] = new ModelRendererTurbo(this, 449, 185, textureX, textureY); // Box 287
        gunModel[192] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 287
        gunModel[193] = new ModelRendererTurbo(this, 265, 273, textureX, textureY); // Box 287
        gunModel[194] = new ModelRendererTurbo(this, 305, 273, textureX, textureY); // Box 287
        gunModel[195] = new ModelRendererTurbo(this, 177, 281, textureX, textureY); // Box 287
        gunModel[196] = new ModelRendererTurbo(this, 329, 281, textureX, textureY); // Box 287
        gunModel[197] = new ModelRendererTurbo(this, 409, 281, textureX, textureY); // Box 287
        gunModel[198] = new ModelRendererTurbo(this, 393, 249, textureX, textureY); // Box 287
        gunModel[199] = new ModelRendererTurbo(this, 201, 281, textureX, textureY); // Box 287
        gunModel[200] = new ModelRendererTurbo(this, 353, 281, textureX, textureY); // Box 287
        gunModel[201] = new ModelRendererTurbo(this, 465, 281, textureX, textureY); // Box 287
        gunModel[202] = new ModelRendererTurbo(this, 249, 273, textureX, textureY); // Box 287
        gunModel[203] = new ModelRendererTurbo(this, 289, 273, textureX, textureY); // Box 287
        gunModel[204] = new ModelRendererTurbo(this, 73, 289, textureX, textureY); // Box 287
        gunModel[205] = new ModelRendererTurbo(this, 105, 289, textureX, textureY); // Box 287
        gunModel[206] = new ModelRendererTurbo(this, 481, 185, textureX, textureY); // Box 287
        gunModel[207] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Box 287
        gunModel[208] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 287
        gunModel[209] = new ModelRendererTurbo(this, 209, 193, textureX, textureY); // Box 287
        gunModel[210] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 287
        gunModel[211] = new ModelRendererTurbo(this, 209, 201, textureX, textureY); // Box 287
        gunModel[212] = new ModelRendererTurbo(this, 121, 241, textureX, textureY); // Box 83
        gunModel[213] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 83
        gunModel[214] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Box 83
        gunModel[215] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 83
        gunModel[216] = new ModelRendererTurbo(this, 9, 217, textureX, textureY); // Box 83
        gunModel[217] = new ModelRendererTurbo(this, 449, 217, textureX, textureY); // Box 83
        gunModel[218] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Box 83
        gunModel[219] = new ModelRendererTurbo(this, 481, 217, textureX, textureY); // Box 83
        gunModel[220] = new ModelRendererTurbo(this, 121, 289, textureX, textureY); // Box 83
        gunModel[221] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 83
        gunModel[222] = new ModelRendererTurbo(this, 145, 257, textureX, textureY); // Box 83
        gunModel[223] = new ModelRendererTurbo(this, 329, 273, textureX, textureY); // Box 83
        gunModel[224] = new ModelRendererTurbo(this, 457, 273, textureX, textureY); // Box 83
        gunModel[225] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 212
        gunModel[226] = new ModelRendererTurbo(this, 457, 185, textureX, textureY); // Box 213
        gunModel[227] = new ModelRendererTurbo(this, 249, 273, textureX, textureY); // Box 214
        gunModel[228] = new ModelRendererTurbo(this, 377, 289, textureX, textureY); // Box 215
        gunModel[229] = new ModelRendererTurbo(this, 449, 257, textureX, textureY); // Box 216
        gunModel[230] = new ModelRendererTurbo(this, 385, 265, textureX, textureY); // Box 217
        gunModel[231] = new ModelRendererTurbo(this, 73, 273, textureX, textureY); // Box 218
        gunModel[232] = new ModelRendererTurbo(this, 289, 273, textureX, textureY); // Box 219
        gunModel[233] = new ModelRendererTurbo(this, 441, 289, textureX, textureY); // Box 220
        gunModel[234] = new ModelRendererTurbo(this, 393, 257, textureX, textureY); // Box 221
        gunModel[235] = new ModelRendererTurbo(this, 417, 257, textureX, textureY); // Box 222
        gunModel[236] = new ModelRendererTurbo(this, 441, 273, textureX, textureY); // Box 33
        gunModel[237] = new ModelRendererTurbo(this, 457, 273, textureX, textureY); // Box 33
        gunModel[238] = new ModelRendererTurbo(this, 73, 281, textureX, textureY); // Box 33
        gunModel[239] = new ModelRendererTurbo(this, 185, 281, textureX, textureY); // Box 33
        gunModel[240] = new ModelRendererTurbo(this, 353, 281, textureX, textureY); // Box 33
        gunModel[241] = new ModelRendererTurbo(this, 73, 289, textureX, textureY); // Box 33

        gunModel[0].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[0].setRotationPoint(18F, -39F, 1.5F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[1].setRotationPoint(18F, -34F, 1.5F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[2].setRotationPoint(18F, -39F, -2.5F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[3].setRotationPoint(18F, -34F, -2.5F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[4].setRotationPoint(6F, -28F, -1.5F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import Import
        gunModel[5].setRotationPoint(16F, -30F, -1.5F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F); // Import Import
        gunModel[6].setRotationPoint(3F, -30F, -1.5F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[7].setRotationPoint(7F, -39F, -1F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F); // Import Import
        gunModel[8].setRotationPoint(7F, -37F, -1F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import Import
        gunModel[9].setRotationPoint(8F, -32F, -1F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import Import
        gunModel[10].setRotationPoint(-8F, -38F, -3.5F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 9, 8, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[11].setRotationPoint(-6F, -37F, -3.5F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 1, 8, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[12].setRotationPoint(3F, -37F, -3.5F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 6, 5, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 2.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, 0.0F, 0.0F); // Import Import
        gunModel[13].setRotationPoint(-6F, -31F, -3.5F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 6, 7, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 3.0F, 0.0F, 0.0F); // Import Import
        gunModel[14].setRotationPoint(-8F, -26F, -3.5F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 6, 7, 7, 0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F, 1.0F, 0.0F); // Import Import
        gunModel[15].setRotationPoint(-11F, -19F, -3.5F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[16].setRotationPoint(-13F, -11F, -3.5F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 3, 5, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, 2.0F, 0.0F, 0.0F); // Import Import
        gunModel[17].setRotationPoint(0F, -29F, -3.5F);

        gunModel[18].addShapeBox(0F, 0F, 0F, 3, 6, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 1.0F, -2.0F, -2.0F, 1.0F, -2.0F, 2.0F, 0.0F, 0.0F); // Import Import
        gunModel[18].setRotationPoint(-2F, -24F, -3.5F);

        gunModel[19].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F); // Import Import
        gunModel[19].setRotationPoint(-4F, -18F, -3.5F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[20].setRotationPoint(-5F, -11F, -3.5F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, -2.0F, -2.0F); // Import Import
        gunModel[21].setRotationPoint(-15F, -38F, -3.5F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F, -1.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 0.0F, -4.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -4.0F, -2.0F); // Import Import
        gunModel[22].setRotationPoint(-9F, -35F, -3.62F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F); // Import Import
        gunModel[23].setRotationPoint(-9F, -35F, -3.5F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 4, 5, 7, 0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, 2.0F, 1.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, -2.0F); // Import Import
        gunModel[24].setRotationPoint(-10F, -31F, -3.5F);

        gunModel[25].addShapeBox(0F, 0F, 0F, 4, 7, 7, 0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -2.0F, 2.0F, -1.0F, -2.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.0F, -1.0F, -2.0F); // Import Import
        gunModel[25].setRotationPoint(-12F, -26F, -3.5F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 3, 9, 7, 0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -2.0F, 2.0F, -2.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, -2.0F, -2.0F); // Import Import
        gunModel[26].setRotationPoint(-14F, -20F, -3.5F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -2.0F); // Import Import
        gunModel[27].setRotationPoint(-16F, -13F, -3.5F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[28].setRotationPoint(-6F, -38F, -3F);

        gunModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[29].setRotationPoint(2F, -38F, -3F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 46, 10, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[30].setRotationPoint(-33F, -48F, -5F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 75, 8, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[31].setRotationPoint(-108F, -44F, -5F);

        gunModel[32].addShapeBox(0F, 0F, 0F, 135, 7, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[32].setRotationPoint(-108F, -51F, -1.5F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 135, 1, 9, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[33].setRotationPoint(-108F, -56F, -4.5F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 74, 3, 8, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[34].setRotationPoint(-108F, -36F, -4F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 24, 7, 8, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[35].setRotationPoint(-108F, -29F, -4F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 20, 6, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[36].setRotationPoint(-108F, -22F, -4F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 26, 4, 8, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[37].setRotationPoint(-108F, -33F, -4F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 30, 4, 8, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 33
        gunModel[38].setRotationPoint(-65F, -33F, -4F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 61, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[39].setRotationPoint(-108F, -55F, -6F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 2F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 2F, 0F, 0F); // Box 33
        gunModel[40].setRotationPoint(-34F, -36F, -4F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 8, 7, 8, 0F, -4F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -4F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -1F, 0F, 0F); // Box 33
        gunModel[41].setRotationPoint(-89F, -29F, -4F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 5, 6, 8, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -2F, -2F, -1F, -2F, 0F, 0F, 0F); // Box 33
        gunModel[42].setRotationPoint(-90F, -22F, -4F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 5, 4, 8, 0F, -3F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, -3F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, 2F, 0F, 0F); // Box 33
        gunModel[43].setRotationPoint(-83F, -33F, -4F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 61, 3, 12, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[44].setRotationPoint(-108F, -58F, -6F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 8, 4, 13, 0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[45].setRotationPoint(-116F, -58F, -6.5F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 8, 12, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 33
        gunModel[46].setRotationPoint(-116F, -54F, -6.5F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 10, 11, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[47].setRotationPoint(-118F, -42F, -6.5F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 8, 12, 13, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[48].setRotationPoint(-116F, -31F, -6.5F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 8, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, -3F); // Box 33
        gunModel[49].setRotationPoint(-116F, -19F, -6.5F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 33
        gunModel[50].setRotationPoint(-35F, -33F, -4F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 2, 4, 8, 0F, 0F, 2F, -1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 2F, -1F, -2F, -1F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, -1F, -1F); // Box 33
        gunModel[51].setRotationPoint(-69F, -30F, -4F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 75, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[52].setRotationPoint(-108F, -44F, 5F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 39, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[53].setRotationPoint(-33F, -48F, 5F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 75, 8, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[54].setRotationPoint(-108F, -44F, -6F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 39, 10, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[55].setRotationPoint(-33F, -48F, -6F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 14, 10, 10, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 33
        gunModel[56].setRotationPoint(13F, -48F, -5F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 45, 10, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[57].setRotationPoint(27F, -48F, -4.5F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 33
        gunModel[58].setRotationPoint(6F, -48F, 5F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[59].setRotationPoint(6F, -48F, -6F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 43, 5, 2, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 33
        gunModel[60].setRotationPoint(28F, -43F, 4.5F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 33
        gunModel[61].setRotationPoint(72F, -48F, 4.5F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 33
        gunModel[62].setRotationPoint(27F, -48F, 4.5F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 33
        gunModel[63].setRotationPoint(71F, -48F, 4.5F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, -0.5F, 0F, 1F, -0.5F); // Box 33
        gunModel[64].setRotationPoint(72F, -43F, 4.5F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 43, 5, 2, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 33
        gunModel[65].setRotationPoint(28F, -43F, -6.5F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[66].setRotationPoint(72F, -48F, -6.5F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[67].setRotationPoint(27F, -48F, -6.5F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 33
        gunModel[68].setRotationPoint(71F, -48F, -6.5F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 1F, -1F, -0.5F, 1F, -1F, 0F, 0F, 1F, 0F); // Box 33
        gunModel[69].setRotationPoint(72F, -43F, -6.5F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 27, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[70].setRotationPoint(-58F, -54F, -4.5F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 10, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[71].setRotationPoint(17F, -54F, -4.5F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 61, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 33
        gunModel[72].setRotationPoint(-108F, -51F, -1F);

        gunModel[73].addShapeBox(0F, 0F, 0F, 42, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[73].setRotationPoint(-108F, -51F, -6F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 42, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[74].setRotationPoint(-108F, -45F, -6F);

        gunModel[75].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
        gunModel[75].setRotationPoint(-78F, -33F, -3F);

        gunModel[76].addShapeBox(0F, 0F, 0F, 43, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[76].setRotationPoint(-108F, -51F, -4.5F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 62, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[77].setRotationPoint(-35F, -51F, -4.5F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 49, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[78].setRotationPoint(-31F, -54F, -2.5F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 135, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[79].setRotationPoint(-108F, -55F, -4.5F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 57, 2, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        gunModel[80].setRotationPoint(-32F, -58F, -2.5F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 58, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 83
        gunModel[81].setRotationPoint(-32F, -58.5F, -3F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        gunModel[82].setRotationPoint(-32F, -59.5F, -3F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        gunModel[83].setRotationPoint(-20F, -59.5F, -3F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        gunModel[84].setRotationPoint(-16F, -59.5F, -3F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        gunModel[85].setRotationPoint(-12F, -59.5F, -3F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        gunModel[86].setRotationPoint(-8F, -59.5F, -3F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        gunModel[87].setRotationPoint(-4F, -59.5F, -3F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        gunModel[88].setRotationPoint(0F, -59.5F, -3F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        gunModel[89].setRotationPoint(4F, -59.5F, -3F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        gunModel[90].setRotationPoint(8F, -59.5F, -3F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        gunModel[91].setRotationPoint(12F, -59.5F, -3F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        gunModel[92].setRotationPoint(16F, -59.5F, -3F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        gunModel[93].setRotationPoint(24F, -59.5F, -3F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        gunModel[94].setRotationPoint(20F, -59.5F, -3F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 83
        gunModel[95].setRotationPoint(22F, -59.5F, -3F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        gunModel[96].setRotationPoint(22F, -59.5F, 0F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[97].setRotationPoint(18F, -38F, -1.5F);

        gunModel[98].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[98].setRotationPoint(20.5F, -38F, -1.5F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.5F, 0.0F, 0F); // Import Import
        gunModel[99].setRotationPoint(20.5F, -32F, -1.5F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1F, -0.5F, 0.0F, -1.8F, 0.0F, 0.0F, -1.8F, 0.0F, 0.0F, 1F, -0.5F, 0F); // Import Import
        gunModel[100].setRotationPoint(20F, -30F, -1.5F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0.5F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0F, 0.5F, 0.0F, 2.2F, -0.5F, 0.0F, -3.1F, 0.0F, 0.0F, -3.1F, 0.0F, 0.0F, 2.2F, -0.5F, 0F); // Import Import
        gunModel[101].setRotationPoint(19F, -28F, -1.5F);

        gunModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, -0.2F, 0.5F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.2F, 0.5F, 0.0F, 2.2F, -2.8F, 0.0F, -3.2F, -2.3F, 0.0F, -3.2F, -2.3F, 0.0F, 2.2F, -2.8F, 0F); // Import Import
        gunModel[102].setRotationPoint(15F, -26F, -1.5F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0.2F, 0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, 0.2F, 0.5F, 0.0F, 1.9F, -2.5F, 0.0F, -2.9F, -2F, 0.0F, -2.9F, -2F, 0.0F, 1.8F, -2.5F, 0F); // Import Import
        gunModel[103].setRotationPoint(17F, -26F, -1.5F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 50, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[104].setRotationPoint(27F, -51F, 3.5F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[105].setRotationPoint(27F, -56F, -2F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 50, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 33
        gunModel[106].setRotationPoint(27F, -56F, 2F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[107].setRotationPoint(27F, -54F, 3.5F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[108].setRotationPoint(72F, -54F, 3.5F);

        gunModel[109].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[109].setRotationPoint(57F, -54F, 3.5F);

        gunModel[110].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[110].setRotationPoint(42F, -54F, 3.5F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, -1F, -1F, 0.4F, 0F, -1F, 0.4F, 0F, -1F, -0.4F, -1F, -1F, -0.4F); // Box 33
        gunModel[111].setRotationPoint(71F, -54F, 3.5F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.1F, -1F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[112].setRotationPoint(71F, -52F, 3.5F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[113].setRotationPoint(62F, -52F, 3.5F);

        gunModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, 0.4F, -1F, -1F, 0.4F, -1F, -1F, -0.4F, 0F, -1F, -0.4F); // Box 33
        gunModel[114].setRotationPoint(62F, -54F, 3.5F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, -1F, -1F, 0.4F, 0F, -1F, 0.4F, 0F, -1F, -0.4F, -1F, -1F, -0.4F); // Box 33
        gunModel[115].setRotationPoint(56F, -54F, 3.5F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.1F, -1F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[116].setRotationPoint(56F, -52F, 3.5F);

        gunModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[117].setRotationPoint(47F, -52F, 3.5F);

        gunModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, 0.4F, -1F, -1F, 0.4F, -1F, -1F, -0.4F, 0F, -1F, -0.4F); // Box 33
        gunModel[118].setRotationPoint(47F, -54F, 3.5F);

        gunModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, -1F, -1F, 0.4F, 0F, -1F, 0.4F, 0F, -1F, -0.4F, -1F, -1F, -0.4F); // Box 33
        gunModel[119].setRotationPoint(41F, -54F, 3.5F);

        gunModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.1F, -1F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[120].setRotationPoint(41F, -52F, 3.5F);

        gunModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[121].setRotationPoint(32F, -52F, 3.5F);

        gunModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, 0.4F, -1F, -1F, 0.4F, -1F, -1F, -0.4F, 0F, -1F, -0.4F); // Box 33
        gunModel[122].setRotationPoint(32F, -54F, 3.5F);

        gunModel[123].addShapeBox(0F, 0F, 0F, 50, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[123].setRotationPoint(27F, -51F, -4.5F);

        gunModel[124].addShapeBox(0F, 0F, 0F, 50, 1, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[124].setRotationPoint(27F, -56F, -4F);

        gunModel[125].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[125].setRotationPoint(27F, -54F, -4.5F);

        gunModel[126].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[126].setRotationPoint(72F, -54F, -4.5F);

        gunModel[127].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[127].setRotationPoint(57F, -54F, -4.5F);

        gunModel[128].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[128].setRotationPoint(42F, -54F, -4.5F);

        gunModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, -1F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[129].setRotationPoint(71F, -52F, -4.5F);

        gunModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[130].setRotationPoint(62F, -52F, -4.5F);

        gunModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, -1F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[131].setRotationPoint(56F, -52F, -4.5F);

        gunModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[132].setRotationPoint(47F, -52F, -4.5F);

        gunModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, -1F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[133].setRotationPoint(41F, -52F, -4.5F);

        gunModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[134].setRotationPoint(32F, -52F, -4.5F);

        gunModel[135].addShapeBox(0F, 0F, 0F, 50, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
        gunModel[135].setRotationPoint(28F, -51.5F, -1.5F);

        gunModel[136].addShapeBox(0F, 0F, 0F, 50, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
        gunModel[136].setRotationPoint(28F, -52.5F, -1.5F);

        gunModel[137].addShapeBox(0F, 0F, 0F, 50, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 146
        gunModel[137].setRotationPoint(28F, -50.5F, -1.5F);

        gunModel[138].addShapeBox(0F, -0.5F, -4F, 2, 1, 8, 0F, 0F, 0.8F, 0F, 0F, 1.45F, 2F, 0F, 1.45F, 2F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 1.45F, 2F, 0F, 1.45F, 2F, 0F, 0.8F, 0F); // Box 149
        gunModel[138].setRotationPoint(77.5F, -49F, 0F);

        gunModel[139].addShapeBox(0F, -1F, -6F, 1, 2, 12, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F); // Box 149
        gunModel[139].setRotationPoint(79.5F, -49F, 0F);

        gunModel[140].addShapeBox(0F, -1F, -6F, 1, 2, 12, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F); // Box 149
        gunModel[140].setRotationPoint(79.5F, -49F, 0F);
        gunModel[140].rotateAngleX = 0.62831853F;

        gunModel[141].addShapeBox(0F, -1F, -6F, 1, 2, 12, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F); // Box 149
        gunModel[141].setRotationPoint(79.5F, -49F, 0F);
        gunModel[141].rotateAngleX = -0.62831853F;

        gunModel[142].addShapeBox(0F, -1F, -6F, 1, 2, 12, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F); // Box 149
        gunModel[142].setRotationPoint(79.5F, -49F, 0F);
        gunModel[142].rotateAngleX = 1.25663706F;

        gunModel[143].addShapeBox(0F, -1F, -6F, 1, 2, 12, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F); // Box 149
        gunModel[143].setRotationPoint(79.5F, -49F, 0F);
        gunModel[143].rotateAngleX = -1.25663706F;

        gunModel[144].addShapeBox(0F, -0.5F, -4F, 2, 1, 8, 0F, 0F, 0.8F, 0F, 0F, 1.45F, 2F, 0F, 1.45F, 2F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 1.45F, 2F, 0F, 1.45F, 2F, 0F, 0.8F, 0F); // Box 149
        gunModel[144].setRotationPoint(77.5F, -49F, 0F);
        gunModel[144].rotateAngleX = 0.62831853F;

        gunModel[145].addShapeBox(0F, -0.5F, -4F, 2, 1, 8, 0F, 0F, 0.8F, 0F, 0F, 1.45F, 2F, 0F, 1.45F, 2F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 1.45F, 2F, 0F, 1.45F, 2F, 0F, 0.8F, 0F); // Box 149
        gunModel[145].setRotationPoint(77.5F, -49F, 0F);
        gunModel[145].rotateAngleX = -0.62831853F;

        gunModel[146].addShapeBox(0F, -0.5F, -4F, 2, 1, 8, 0F, 0F, 0.8F, 0F, 0F, 1.45F, 2F, 0F, 1.45F, 2F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 1.45F, 2F, 0F, 1.45F, 2F, 0F, 0.8F, 0F); // Box 149
        gunModel[146].setRotationPoint(77.5F, -49F, 0F);
        gunModel[146].rotateAngleX = 1.25663706F;

        gunModel[147].addShapeBox(0F, -0.5F, -4F, 2, 1, 8, 0F, 0F, 0.8F, 0F, 0F, 1.45F, 2F, 0F, 1.45F, 2F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 1.45F, 2F, 0F, 1.45F, 2F, 0F, 0.8F, 0F); // Box 149
        gunModel[147].setRotationPoint(77.5F, -49F, 0F);
        gunModel[147].rotateAngleX = -1.25663706F;

        gunModel[148].addShapeBox(0F, -1F, -8F, 95, 2, 16, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F); // Box 149
        gunModel[148].setRotationPoint(80.5F, -49F, 0F);

        gunModel[149].addShapeBox(0F, -1F, -8F, 95, 2, 16, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F); // Box 149
        gunModel[149].setRotationPoint(80.5F, -49F, 0F);
        gunModel[149].rotateAngleX = 0.62831853F;

        gunModel[150].addShapeBox(0F, -1F, -8F, 95, 2, 16, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F); // Box 149
        gunModel[150].setRotationPoint(80.5F, -49F, 0F);
        gunModel[150].rotateAngleX = -0.62831853F;

        gunModel[151].addShapeBox(0F, -1F, -8F, 95, 2, 16, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F); // Box 149
        gunModel[151].setRotationPoint(80.5F, -49F, 0F);
        gunModel[151].rotateAngleX = 1.25663706F;

        gunModel[152].addShapeBox(0F, -1F, -8F, 95, 2, 16, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F); // Box 149
        gunModel[152].setRotationPoint(80.5F, -49F, 0F);
        gunModel[152].rotateAngleX = -1.25663706F;

        gunModel[153].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[153].setRotationPoint(42F, -56F, -2F);

        gunModel[154].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[154].setRotationPoint(57F, -56F, -2F);

        gunModel[155].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[155].setRotationPoint(72F, -56F, -2F);

        gunModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 33
        gunModel[156].setRotationPoint(71F, -56F, -2F);

        gunModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[157].setRotationPoint(71F, -56F, 1F);

        gunModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[158].setRotationPoint(62F, -56F, -2F);

        gunModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[159].setRotationPoint(62F, -56F, 1F);

        gunModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 33
        gunModel[160].setRotationPoint(56F, -56F, -2F);

        gunModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[161].setRotationPoint(56F, -56F, 1F);

        gunModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[162].setRotationPoint(47F, -56F, -2F);

        gunModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[163].setRotationPoint(47F, -56F, 1F);

        gunModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 33
        gunModel[164].setRotationPoint(41F, -56F, -2F);

        gunModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[165].setRotationPoint(41F, -56F, 1F);

        gunModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[166].setRotationPoint(32F, -56F, -2F);

        gunModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[167].setRotationPoint(32F, -56F, 1F);

        gunModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 33
        gunModel[168].setRotationPoint(16F, -54F, -4.5F);

        gunModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[169].setRotationPoint(16F, -52F, -4.5F);

        gunModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[170].setRotationPoint(-31F, -54F, -4.5F);

        gunModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[171].setRotationPoint(-31F, -52F, -4.5F);

        gunModel[172].addShapeBox(0F, 0F, 0F, 45, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 190
        gunModel[172].setRotationPoint(27F, -38F, -6F);

        gunModel[173].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F, 1F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.4F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F); // Box 190
        gunModel[173].setRotationPoint(21F, -38F, -6F);

        gunModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[174].setRotationPoint(-65F, -51F, -4.5F);

        gunModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[175].setRotationPoint(-65F, -45F, -4.5F);

        gunModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 33
        gunModel[176].setRotationPoint(-36F, -51F, -4.5F);

        gunModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[177].setRotationPoint(-36F, -45F, -4.5F);

        gunModel[178].addShapeBox(0F, 0F, 0F, 5, 10, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[178].setRotationPoint(72F, -48F, -4.5F);

        gunModel[179].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 33
        gunModel[179].setRotationPoint(72F, -38F, -4.5F);

        gunModel[180].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 33
        gunModel[180].setRotationPoint(73F, -37F, -4.5F);

        gunModel[181].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 33
        gunModel[181].setRotationPoint(73F, -35F, -4.5F);

        gunModel[182].addShapeBox(0F, 0F, 0F, 5, 5, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
        gunModel[182].setRotationPoint(-106F, -42F, -7F);

        gunModel[183].addShapeBox(0F, 0F, 0F, 2, 5, 14, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 287
        gunModel[183].setRotationPoint(-101F, -42F, -7F);

        gunModel[184].addShapeBox(0F, 0F, 0F, 3, 1, 16, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
        gunModel[184].setRotationPoint(-105F, -41F, -8F);

        gunModel[185].addShapeBox(0F, 0F, 0F, 3, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 287
        gunModel[185].setRotationPoint(-105F, -39F, -8F);

        gunModel[186].addShapeBox(0F, 0F, 0F, 3, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
        gunModel[186].setRotationPoint(-105F, -40F, -8F);

        gunModel[187].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
        gunModel[187].setRotationPoint(-105F, -49F, -6.5F);

        gunModel[188].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 287
        gunModel[188].setRotationPoint(-105F, -47F, -6.5F);

        gunModel[189].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
        gunModel[189].setRotationPoint(-105F, -48F, -6.5F);

        gunModel[190].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
        gunModel[190].setRotationPoint(-53F, -49F, 5.5F);

        gunModel[191].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 287
        gunModel[191].setRotationPoint(-53F, -47F, 5.5F);

        gunModel[192].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
        gunModel[192].setRotationPoint(-53F, -48F, 5.5F);

        gunModel[193].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 287
        gunModel[193].setRotationPoint(21F, -44F, -6.5F);

        gunModel[194].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 287
        gunModel[194].setRotationPoint(21F, -45.5F, -6.5F);

        gunModel[195].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 287
        gunModel[195].setRotationPoint(21F, -41.75F, -6.5F);

        gunModel[196].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 287
        gunModel[196].setRotationPoint(21F, -42.5F, -6.5F);

        gunModel[197].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 287
        gunModel[197].setRotationPoint(21F, -43.25F, -6F);

        gunModel[198].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 287
        gunModel[198].setRotationPoint(72.5F, -40.25F, -5.5F);

        gunModel[199].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 287
        gunModel[199].setRotationPoint(72.5F, -41.75F, -5.5F);

        gunModel[200].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 287
        gunModel[200].setRotationPoint(72.5F, -38F, -5.5F);

        gunModel[201].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 287
        gunModel[201].setRotationPoint(72.5F, -38.75F, -5.5F);

        gunModel[202].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 287
        gunModel[202].setRotationPoint(72.5F, -39.5F, -5F);

        gunModel[203].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
        gunModel[203].setRotationPoint(-89F, -32F, -4.5F);

        gunModel[204].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 287
        gunModel[204].setRotationPoint(-89F, -30F, -4.5F);

        gunModel[205].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
        gunModel[205].setRotationPoint(-89F, -31F, -4.5F);

        gunModel[206].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
        gunModel[206].setRotationPoint(-86F, -41F, 6F);

        gunModel[207].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 287
        gunModel[207].setRotationPoint(-81F, -41F, 6F);

        gunModel[208].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 287
        gunModel[208].setRotationPoint(-89F, -41F, 6F);

        gunModel[209].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
        gunModel[209].setRotationPoint(-83.75F, -40.5F, 6.5F);

        gunModel[210].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 287
        gunModel[210].setRotationPoint(-83.75F, -38.5F, 6.5F);

        gunModel[211].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
        gunModel[211].setRotationPoint(-83.75F, -39.5F, 6.5F);

        gunModel[212].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        gunModel[212].setRotationPoint(72.5F, -58F, -2.5F);

        gunModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 83
        gunModel[213].setRotationPoint(22.5F, -59.5F, -1F);

        gunModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.65F, -0.2F, 0F, -0.65F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.65F, -0.2F, 0F, -0.65F, -0.2F, 0F, -0.1F); // Box 83
        gunModel[214].setRotationPoint(23.1F, -59.5F, -1F);

        gunModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, 0F, -0.65F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.65F, -0.2F, 0F, -0.65F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.65F); // Box 83
        gunModel[215].setRotationPoint(21.9F, -59.5F, -1F);

        gunModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, 0F, -0.65F, -0.2F, 0F, -0.1F, -0.2F, 0F, -1.35F, -0.2F, 0F, -1.35F, -0.2F, 0F, -0.65F, -0.2F, 0F, -0.1F, -0.2F, 0F, -1.35F, -0.2F, 0F, -1.35F); // Box 83
        gunModel[216].setRotationPoint(23.2F, -59.5F, 0.35F);

        gunModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, 0F, -1.35F, -0.2F, 0F, -1.35F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.65F, -0.2F, 0F, -1.35F, -0.2F, 0F, -1.35F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.65F); // Box 83
        gunModel[217].setRotationPoint(23.2F, -59.5F, -2.35F);

        gunModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.65F, -0.2F, 0F, -1.35F, -0.2F, 0F, -1.35F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.65F, -0.2F, 0F, -1.35F, -0.2F, 0F, -1.35F); // Box 83
        gunModel[218].setRotationPoint(21.8F, -59.5F, 0.35F);

        gunModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, 0F, -1.35F, -0.2F, 0F, -1.35F, -0.2F, 0F, -0.65F, -0.2F, 0F, -0.1F, -0.2F, 0F, -1.35F, -0.2F, 0F, -1.35F, -0.2F, 0F, -0.65F, -0.2F, 0F, -0.1F); // Box 83
        gunModel[219].setRotationPoint(21.8F, -59.5F, -2.35F);

        gunModel[220].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 83
        gunModel[220].setRotationPoint(66.5F, -58.5F, -3F);

        gunModel[221].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        gunModel[221].setRotationPoint(66.5F, -59.5F, -3F);

        gunModel[222].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        gunModel[222].setRotationPoint(70.5F, -59.5F, -3F);

        gunModel[223].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        gunModel[223].setRotationPoint(74.5F, -59.5F, -3F);

        gunModel[224].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        gunModel[224].setRotationPoint(78.5F, -59.5F, -3F);

        gunModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 212
        gunModel[225].setRotationPoint(-35F, -58F, -1.5F);

        gunModel[226].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 213
        gunModel[226].setRotationPoint(-33F, -58F, -1.5F);

        gunModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
        gunModel[227].setRotationPoint(-34F, -58F, -1.5F);

        gunModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 215
        gunModel[228].setRotationPoint(-34F, -57.5F, -3.5F);

        gunModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 1.5F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1.5F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 216
        gunModel[229].setRotationPoint(-34F, -57.5F, -5.5F);

        gunModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, -1F); // Box 217
        gunModel[230].setRotationPoint(-34F, -57.5F, 3.5F);

        gunModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1.5F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1.5F, 0F, -1F, -2F, 0F, 0F); // Box 218
        gunModel[231].setRotationPoint(-39F, -57.5F, 3.5F);

        gunModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -2F, 0F, 0F, 1.5F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
        gunModel[232].setRotationPoint(-39F, -57.5F, -5.5F);

        gunModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 220
        gunModel[233].setRotationPoint(-39F, -57.5F, -3.5F);

        gunModel[234].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 221
        gunModel[234].setRotationPoint(-37F, -57.5F, -5.5F);

        gunModel[235].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
        gunModel[235].setRotationPoint(-37F, -57.5F, 4.5F);

        gunModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, 0.4F, -1F, -1F, 0.4F); // Box 33
        gunModel[236].setRotationPoint(71F, -54F, -4.5F);

        gunModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -0.4F, -1F, -1F, -0.4F, -1F, -1F, 0.4F, 0F, -1F, 0.4F); // Box 33
        gunModel[237].setRotationPoint(62F, -54F, -4.5F);

        gunModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, 0.4F, -1F, -1F, 0.4F); // Box 33
        gunModel[238].setRotationPoint(56F, -54F, -4.5F);

        gunModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -0.4F, -1F, -1F, -0.4F, -1F, -1F, 0.4F, 0F, -1F, 0.4F); // Box 33
        gunModel[239].setRotationPoint(47F, -54F, -4.5F);

        gunModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, 0.4F, -1F, -1F, 0.4F); // Box 33
        gunModel[240].setRotationPoint(41F, -54F, -4.5F);

        gunModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -0.4F, -1F, -1F, -0.4F, -1F, -1F, 0.4F, 0F, -1F, 0.4F); // Box 33
        gunModel[241].setRotationPoint(32F, -54F, -4.5F);


        defaultScopeModel = new ModelRendererTurbo[41];
        defaultScopeModel[0] = new ModelRendererTurbo(this, 233, 289, textureX, textureY); // Import
        defaultScopeModel[1] = new ModelRendererTurbo(this, 489, 281, textureX, textureY); // Import
        defaultScopeModel[2] = new ModelRendererTurbo(this, 89, 289, textureX, textureY); // Import
        defaultScopeModel[3] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Import
        defaultScopeModel[4] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); // Import
        defaultScopeModel[5] = new ModelRendererTurbo(this, 497, 241, textureX, textureY); // Import
        defaultScopeModel[6] = new ModelRendererTurbo(this, 265, 289, textureX, textureY); // Import
        defaultScopeModel[7] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Import
        defaultScopeModel[8] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Import
        defaultScopeModel[9] = new ModelRendererTurbo(this, 225, 193, textureX, textureY); // Import
        defaultScopeModel[10] = new ModelRendererTurbo(this, 417, 225, textureX, textureY); // Import
        defaultScopeModel[11] = new ModelRendererTurbo(this, 289, 289, textureX, textureY); // Import
        defaultScopeModel[12] = new ModelRendererTurbo(this, 441, 241, textureX, textureY); // Import
        defaultScopeModel[13] = new ModelRendererTurbo(this, 497, 249, textureX, textureY); // Import
        defaultScopeModel[14] = new ModelRendererTurbo(this, 417, 233, textureX, textureY); // Import
        defaultScopeModel[15] = new ModelRendererTurbo(this, 497, 257, textureX, textureY); // Import
        defaultScopeModel[16] = new ModelRendererTurbo(this, 145, 265, textureX, textureY); // Import
        defaultScopeModel[17] = new ModelRendererTurbo(this, 465, 233, textureX, textureY); // Import
        defaultScopeModel[18] = new ModelRendererTurbo(this, 401, 265, textureX, textureY); // Import
        defaultScopeModel[19] = new ModelRendererTurbo(this, 497, 265, textureX, textureY); // Import
        defaultScopeModel[20] = new ModelRendererTurbo(this, 313, 289, textureX, textureY); // Import
        defaultScopeModel[21] = new ModelRendererTurbo(this, 481, 233, textureX, textureY); // Import
        defaultScopeModel[22] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Import
        defaultScopeModel[23] = new ModelRendererTurbo(this, 105, 241, textureX, textureY); // Import
        defaultScopeModel[24] = new ModelRendererTurbo(this, 305, 273, textureX, textureY); // Import
        defaultScopeModel[25] = new ModelRendererTurbo(this, 401, 273, textureX, textureY); // Import
        defaultScopeModel[26] = new ModelRendererTurbo(this, 225, 281, textureX, textureY); // Import
        defaultScopeModel[27] = new ModelRendererTurbo(this, 329, 281, textureX, textureY); // Import
        defaultScopeModel[28] = new ModelRendererTurbo(this, 121, 241, textureX, textureY); // Import
        defaultScopeModel[29] = new ModelRendererTurbo(this, 137, 241, textureX, textureY); // Import
        defaultScopeModel[30] = new ModelRendererTurbo(this, 417, 249, textureX, textureY); // Import
        defaultScopeModel[31] = new ModelRendererTurbo(this, 497, 241, textureX, textureY); // Import
        defaultScopeModel[32] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Import
        defaultScopeModel[33] = new ModelRendererTurbo(this, 449, 249, textureX, textureY); // Import
        defaultScopeModel[34] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Import
        defaultScopeModel[35] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Import
        defaultScopeModel[36] = new ModelRendererTurbo(this, 73, 257, textureX, textureY); // Import
        defaultScopeModel[37] = new ModelRendererTurbo(this, 145, 257, textureX, textureY); // Import
        defaultScopeModel[38] = new ModelRendererTurbo(this, 161, 257, textureX, textureY); // Import
        defaultScopeModel[39] = new ModelRendererTurbo(this, 361, 257, textureX, textureY); // Import
        defaultScopeModel[40] = new ModelRendererTurbo(this, 385, 257, textureX, textureY); // Import

        defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[0].setRotationPoint(-27F, -60.5F, -3F);

        defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[1].setRotationPoint(-27F, -60.5F, -4F);

        defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[2].setRotationPoint(-27F, -60.5F, 3F);

        defaultScopeModel[3].addShapeBox(1F, 0F, 0F, 2, 2, 2, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        defaultScopeModel[3].setRotationPoint(-27F, -62.5F, -4F);

        defaultScopeModel[4].addShapeBox(1F, 0F, 0F, 2, 2, 2, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[4].setRotationPoint(-27F, -62.5F, 2F);

        defaultScopeModel[5].addShapeBox(1F, 0F, 0F, 2, 2, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[5].setRotationPoint(-27F, -63.5F, -2.5F);

        defaultScopeModel[6].addShapeBox(1F, 0F, 0F, 3, 4, 5, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[6].setRotationPoint(-28F, -67.5F, -2.5F);

        defaultScopeModel[7].addShapeBox(1F, 0F, 0F, 1, 1, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[7].setRotationPoint(-27F, -68F, -2.5F);

        defaultScopeModel[8].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[8].setRotationPoint(-27F, -72F, -0.5F);

        defaultScopeModel[9].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[9].setRotationPoint(-27F, -70F, 1.5F);

        defaultScopeModel[10].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[10].setRotationPoint(-27F, -70F, -2.5F);

        defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[11].setRotationPoint(72F, -60.5F, -4F);

        defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[12].setRotationPoint(72F, -59.5F, 3F);

        defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[13].setRotationPoint(72F, -59.5F, -4F);

        defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[14].setRotationPoint(74F, -62.5F, -3F);

        defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[15].setRotationPoint(74F, -63.5F, -2F);

        defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[16].setRotationPoint(74F, -67.5F, -2F);

        defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[17].setRotationPoint(74.5F, -70F, -0.5F);

        defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[18].setRotationPoint(-25F, -59.5F, -6.5F);

        defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[19].setRotationPoint(73F, -59.5F, -6.5F);

        defaultScopeModel[20].addShapeBox(1F, 0F, 0F, 2, 1, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[20].setRotationPoint(-27F, -61.5F, -2.5F);

        defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[21].setRotationPoint(74F, -62.5F, 2F);

        defaultScopeModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[22].setRotationPoint(74F, -63.5F, -3F);

        defaultScopeModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[23].setRotationPoint(74F, -63.5F, 2F);

        defaultScopeModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[24].setRotationPoint(73F, -60.5F, -7F);

        defaultScopeModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[25].setRotationPoint(73F, -58.5F, -7F);

        defaultScopeModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[26].setRotationPoint(-25F, -60.5F, -7F);

        defaultScopeModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[27].setRotationPoint(-25F, -58.5F, -7F);

        defaultScopeModel[28].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, -0.6F, -0.2F, 0.0F, -0.6F, -0.2F); // Import
        defaultScopeModel[28].setRotationPoint(-27.01F, -70F, 1.6F);

        defaultScopeModel[29].addShapeBox(1F, 0F, 0F, 1, 2, 2, 0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        defaultScopeModel[29].setRotationPoint(-27F, -72F, -2.5F);

        defaultScopeModel[30].addShapeBox(1F, 0F, 0F, 1, 2, 2, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        defaultScopeModel[30].setRotationPoint(-27F, -72F, 0.5F);

        defaultScopeModel[31].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        defaultScopeModel[31].setRotationPoint(-27F, -69F, -2.5F);

        defaultScopeModel[32].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[32].setRotationPoint(-27F, -69F, 1.5F);

        defaultScopeModel[33].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, -0.6F, -0.2F, 0.0F, -0.6F, -0.2F); // Import
        defaultScopeModel[33].setRotationPoint(-27.01F, -70F, -2.4F);

        defaultScopeModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[34].setRotationPoint(76F, -66.5F, -2F);

        defaultScopeModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1F, 0.25F, 0.0F, -1F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0F, -0.5F, 0.0F, 0F, -0.5F); // Import
        defaultScopeModel[35].setRotationPoint(74.5F, -69.5F, 1.5F);

        defaultScopeModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import
        defaultScopeModel[36].setRotationPoint(74.5F, -70F, 1.5F);

        defaultScopeModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import
        defaultScopeModel[37].setRotationPoint(74.5F, -72F, 1.5F);

        defaultScopeModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import
        defaultScopeModel[38].setRotationPoint(74.5F, -69.5F, -2.5F);

        defaultScopeModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Import
        defaultScopeModel[39].setRotationPoint(74.5F, -70F, -2.5F);

        defaultScopeModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import
        defaultScopeModel[40].setRotationPoint(74.5F, -72F, -2.5F);


        defaultGripModel = new ModelRendererTurbo[78];
        defaultGripModel[0] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 33
        defaultGripModel[1] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 33
        defaultGripModel[2] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Box 33
        defaultGripModel[3] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 33
        defaultGripModel[4] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 33
        defaultGripModel[5] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 33
        defaultGripModel[6] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 33
        defaultGripModel[7] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 33
        defaultGripModel[8] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 33
        defaultGripModel[9] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Box 33
        defaultGripModel[10] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 33
        defaultGripModel[11] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 33
        defaultGripModel[12] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 33
        defaultGripModel[13] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 33
        defaultGripModel[14] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 33
        defaultGripModel[15] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 33
        defaultGripModel[16] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 33
        defaultGripModel[17] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 33
        defaultGripModel[18] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 33
        defaultGripModel[19] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 33
        defaultGripModel[20] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 33
        defaultGripModel[21] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 33
        defaultGripModel[22] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 33
        defaultGripModel[23] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 33
        defaultGripModel[24] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 33
        defaultGripModel[25] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 33
        defaultGripModel[26] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 33
        defaultGripModel[27] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 33
        defaultGripModel[28] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 33
        defaultGripModel[29] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 33
        defaultGripModel[30] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 33
        defaultGripModel[31] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 33
        defaultGripModel[32] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 33
        defaultGripModel[33] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 33
        defaultGripModel[34] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 33
        defaultGripModel[35] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 33
        defaultGripModel[36] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 33
        defaultGripModel[37] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 33
        defaultGripModel[38] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 33
        defaultGripModel[39] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 33
        defaultGripModel[40] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 33
        defaultGripModel[41] = new ModelRendererTurbo(this, 489, 217, textureX, textureY); // Box 33
        defaultGripModel[42] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 33
        defaultGripModel[43] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 33
        defaultGripModel[44] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 33
        defaultGripModel[45] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 33
        defaultGripModel[46] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 33
        defaultGripModel[47] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 33
        defaultGripModel[48] = new ModelRendererTurbo(this, 457, 233, textureX, textureY); // Box 33
        defaultGripModel[49] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 33
        defaultGripModel[50] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 33
        defaultGripModel[51] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 33
        defaultGripModel[52] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 33
        defaultGripModel[53] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Box 33
        defaultGripModel[54] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 33
        defaultGripModel[55] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Box 33
        defaultGripModel[56] = new ModelRendererTurbo(this, 457, 169, textureX, textureY); // Box 33
        defaultGripModel[57] = new ModelRendererTurbo(this, 497, 169, textureX, textureY); // Box 33
        defaultGripModel[58] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Box 33
        defaultGripModel[59] = new ModelRendererTurbo(this, 105, 177, textureX, textureY); // Box 33
        defaultGripModel[60] = new ModelRendererTurbo(this, 121, 177, textureX, textureY); // Box 33
        defaultGripModel[61] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 33
        defaultGripModel[62] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 33
        defaultGripModel[63] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Box 33
        defaultGripModel[64] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box 33
        defaultGripModel[65] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Box 33
        defaultGripModel[66] = new ModelRendererTurbo(this, 193, 177, textureX, textureY); // Box 33
        defaultGripModel[67] = new ModelRendererTurbo(this, 225, 177, textureX, textureY); // Box 33
        defaultGripModel[68] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Box 33
        defaultGripModel[69] = new ModelRendererTurbo(this, 249, 177, textureX, textureY); // Box 33
        defaultGripModel[70] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Box 33
        defaultGripModel[71] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Box 33
        defaultGripModel[72] = new ModelRendererTurbo(this, 25, 185, textureX, textureY); // Box 33
        defaultGripModel[73] = new ModelRendererTurbo(this, 33, 185, textureX, textureY); // Box 33
        defaultGripModel[74] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 33
        defaultGripModel[75] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Box 33
        defaultGripModel[76] = new ModelRendererTurbo(this, 57, 185, textureX, textureY); // Box 33
        defaultGripModel[77] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Box 33

        defaultGripModel[0].addShapeBox(-1.5F, 1F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[0].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[0].rotateAngleX = 0.17453293F;

        defaultGripModel[1].addShapeBox(-1.5F, 6F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[1].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[1].rotateAngleX = 0.17453293F;

        defaultGripModel[2].addShapeBox(-3.5F, 1F, 0F, 2, 36, 1, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
        defaultGripModel[2].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[2].rotateAngleX = 0.17453293F;

        defaultGripModel[3].addShapeBox(-1.5F, 11F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[3].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[3].rotateAngleX = 0.17453293F;

        defaultGripModel[4].addShapeBox(-1.5F, 16F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[4].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[4].rotateAngleX = 0.17453293F;

        defaultGripModel[5].addShapeBox(-1.5F, 21F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[5].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[5].rotateAngleX = 0.17453293F;

        defaultGripModel[6].addShapeBox(-1.5F, 26F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[6].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[6].rotateAngleX = 0.17453293F;

        defaultGripModel[7].addShapeBox(-1.5F, 31F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[7].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[7].rotateAngleX = 0.17453293F;

        defaultGripModel[8].addShapeBox(-1.5F, 36F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[8].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[8].rotateAngleX = 0.17453293F;

        defaultGripModel[9].addShapeBox(1.5F, 1F, 0F, 2, 36, 1, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[9].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[9].rotateAngleX = 0.17453293F;

        defaultGripModel[10].addShapeBox(-1.5F, 5F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[10].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[10].rotateAngleX = 0.17453293F;

        defaultGripModel[11].addShapeBox(0.5F, 5F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[11].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[11].rotateAngleX = 0.17453293F;

        defaultGripModel[12].addShapeBox(-1.5F, 3F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[12].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[12].rotateAngleX = 0.17453293F;

        defaultGripModel[13].addShapeBox(0.5F, 3F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 33
        defaultGripModel[13].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[13].rotateAngleX = 0.17453293F;

        defaultGripModel[14].addShapeBox(-1.5F, 10F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[14].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[14].rotateAngleX = 0.17453293F;

        defaultGripModel[15].addShapeBox(0.5F, 10F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[15].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[15].rotateAngleX = 0.17453293F;

        defaultGripModel[16].addShapeBox(-1.5F, 8F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[16].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[16].rotateAngleX = 0.17453293F;

        defaultGripModel[17].addShapeBox(0.5F, 8F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 33
        defaultGripModel[17].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[17].rotateAngleX = 0.17453293F;

        defaultGripModel[18].addShapeBox(-1.5F, 15F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[18].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[18].rotateAngleX = 0.17453293F;

        defaultGripModel[19].addShapeBox(0.5F, 15F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[19].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[19].rotateAngleX = 0.17453293F;

        defaultGripModel[20].addShapeBox(-1.5F, 13F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[20].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[20].rotateAngleX = 0.17453293F;

        defaultGripModel[21].addShapeBox(0.5F, 13F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 33
        defaultGripModel[21].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[21].rotateAngleX = 0.17453293F;

        defaultGripModel[22].addShapeBox(-1.5F, 20F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[22].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[22].rotateAngleX = 0.17453293F;

        defaultGripModel[23].addShapeBox(0.5F, 20F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[23].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[23].rotateAngleX = 0.17453293F;

        defaultGripModel[24].addShapeBox(-1.5F, 18F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[24].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[24].rotateAngleX = 0.17453293F;

        defaultGripModel[25].addShapeBox(0.5F, 18F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 33
        defaultGripModel[25].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[25].rotateAngleX = 0.17453293F;

        defaultGripModel[26].addShapeBox(-1.5F, 25F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[26].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[26].rotateAngleX = 0.17453293F;

        defaultGripModel[27].addShapeBox(0.5F, 25F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[27].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[27].rotateAngleX = 0.17453293F;

        defaultGripModel[28].addShapeBox(-1.5F, 23F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[28].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[28].rotateAngleX = 0.17453293F;

        defaultGripModel[29].addShapeBox(0.5F, 23F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 33
        defaultGripModel[29].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[29].rotateAngleX = 0.17453293F;

        defaultGripModel[30].addShapeBox(-1.5F, 30F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[30].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[30].rotateAngleX = 0.17453293F;

        defaultGripModel[31].addShapeBox(0.5F, 30F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[31].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[31].rotateAngleX = 0.17453293F;

        defaultGripModel[32].addShapeBox(-1.5F, 28F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[32].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[32].rotateAngleX = 0.17453293F;

        defaultGripModel[33].addShapeBox(0.5F, 28F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 33
        defaultGripModel[33].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[33].rotateAngleX = 0.17453293F;

        defaultGripModel[34].addShapeBox(-1.5F, 35F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[34].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[34].rotateAngleX = 0.17453293F;

        defaultGripModel[35].addShapeBox(0.5F, 35F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[35].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[35].rotateAngleX = 0.17453293F;

        defaultGripModel[36].addShapeBox(-1.5F, 33F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[36].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[36].rotateAngleX = 0.17453293F;

        defaultGripModel[37].addShapeBox(0.5F, 33F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 33
        defaultGripModel[37].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[37].rotateAngleX = 0.17453293F;

        defaultGripModel[38].addShapeBox(-4.5F, 37F, -2F, 9, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[38].setRotationPoint(73.5F, -36F, 3F);
        defaultGripModel[38].rotateAngleX = 0.17453293F;

        defaultGripModel[39].addShapeBox(-1.5F, 1F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[39].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[39].rotateAngleX = -0.17453293F;

        defaultGripModel[40].addShapeBox(-1.5F, 6F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[40].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[40].rotateAngleX = -0.17453293F;

        defaultGripModel[41].addShapeBox(-3.5F, 1F, 0F, 2, 36, 1, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
        defaultGripModel[41].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[41].rotateAngleX = -0.17453293F;

        defaultGripModel[42].addShapeBox(-1.5F, 11F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[42].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[42].rotateAngleX = -0.17453293F;

        defaultGripModel[43].addShapeBox(-1.5F, 16F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[43].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[43].rotateAngleX = -0.17453293F;

        defaultGripModel[44].addShapeBox(-1.5F, 21F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[44].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[44].rotateAngleX = -0.17453293F;

        defaultGripModel[45].addShapeBox(-1.5F, 26F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[45].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[45].rotateAngleX = -0.17453293F;

        defaultGripModel[46].addShapeBox(-1.5F, 31F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[46].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[46].rotateAngleX = -0.17453293F;

        defaultGripModel[47].addShapeBox(-1.5F, 36F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[47].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[47].rotateAngleX = -0.17453293F;

        defaultGripModel[48].addShapeBox(1.5F, 1F, 0F, 2, 36, 1, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[48].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[48].rotateAngleX = -0.17453293F;

        defaultGripModel[49].addShapeBox(-1.5F, 5F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[49].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[49].rotateAngleX = -0.17453293F;

        defaultGripModel[50].addShapeBox(0.5F, 5F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[50].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[50].rotateAngleX = -0.17453293F;

        defaultGripModel[51].addShapeBox(-1.5F, 3F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[51].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[51].rotateAngleX = -0.17453293F;

        defaultGripModel[52].addShapeBox(0.5F, 3F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 33
        defaultGripModel[52].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[52].rotateAngleX = -0.17453293F;

        defaultGripModel[53].addShapeBox(-1.5F, 10F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[53].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[53].rotateAngleX = -0.17453293F;

        defaultGripModel[54].addShapeBox(0.5F, 10F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[54].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[54].rotateAngleX = -0.17453293F;

        defaultGripModel[55].addShapeBox(-1.5F, 8F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[55].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[55].rotateAngleX = -0.17453293F;

        defaultGripModel[56].addShapeBox(0.5F, 8F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 33
        defaultGripModel[56].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[56].rotateAngleX = -0.17453293F;

        defaultGripModel[57].addShapeBox(-1.5F, 15F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[57].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[57].rotateAngleX = -0.17453293F;

        defaultGripModel[58].addShapeBox(0.5F, 15F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[58].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[58].rotateAngleX = -0.17453293F;

        defaultGripModel[59].addShapeBox(-1.5F, 13F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[59].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[59].rotateAngleX = -0.17453293F;

        defaultGripModel[60].addShapeBox(0.5F, 13F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 33
        defaultGripModel[60].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[60].rotateAngleX = -0.17453293F;

        defaultGripModel[61].addShapeBox(-1.5F, 20F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[61].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[61].rotateAngleX = -0.17453293F;

        defaultGripModel[62].addShapeBox(0.5F, 20F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[62].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[62].rotateAngleX = -0.17453293F;

        defaultGripModel[63].addShapeBox(-1.5F, 18F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[63].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[63].rotateAngleX = -0.17453293F;

        defaultGripModel[64].addShapeBox(0.5F, 18F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 33
        defaultGripModel[64].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[64].rotateAngleX = -0.17453293F;

        defaultGripModel[65].addShapeBox(-1.5F, 25F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[65].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[65].rotateAngleX = -0.17453293F;

        defaultGripModel[66].addShapeBox(0.5F, 25F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[66].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[66].rotateAngleX = -0.17453293F;

        defaultGripModel[67].addShapeBox(-1.5F, 23F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[67].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[67].rotateAngleX = -0.17453293F;

        defaultGripModel[68].addShapeBox(0.5F, 23F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 33
        defaultGripModel[68].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[68].rotateAngleX = -0.17453293F;

        defaultGripModel[69].addShapeBox(-1.5F, 30F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[69].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[69].rotateAngleX = -0.17453293F;

        defaultGripModel[70].addShapeBox(0.5F, 30F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[70].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[70].rotateAngleX = -0.17453293F;

        defaultGripModel[71].addShapeBox(-1.5F, 28F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[71].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[71].rotateAngleX = -0.17453293F;

        defaultGripModel[72].addShapeBox(0.5F, 28F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 33
        defaultGripModel[72].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[72].rotateAngleX = -0.17453293F;

        defaultGripModel[73].addShapeBox(-1.5F, 35F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[73].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[73].rotateAngleX = -0.17453293F;

        defaultGripModel[74].addShapeBox(0.5F, 35F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[74].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[74].rotateAngleX = -0.17453293F;

        defaultGripModel[75].addShapeBox(-1.5F, 33F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[75].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[75].rotateAngleX = -0.17453293F;

        defaultGripModel[76].addShapeBox(0.5F, 33F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 33
        defaultGripModel[76].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[76].rotateAngleX = -0.17453293F;

        defaultGripModel[77].addShapeBox(-4.5F, 37F, -2F, 9, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        defaultGripModel[77].setRotationPoint(73.5F, -36F, -4F);
        defaultGripModel[77].rotateAngleX = -0.17453293F;


        ammoModel = new ModelRendererTurbo[10];
        ammoModel[0] = new ModelRendererTurbo(this, 169, 249, textureX, textureY); // Box 328
        ammoModel[1] = new ModelRendererTurbo(this, 465, 233, textureX, textureY); // Box 328
        ammoModel[2] = new ModelRendererTurbo(this, 425, 241, textureX, textureY); // Box 328
        ammoModel[3] = new ModelRendererTurbo(this, 233, 249, textureX, textureY); // Box 328
        ammoModel[4] = new ModelRendererTurbo(this, 297, 249, textureX, textureY); // Box 328
        ammoModel[5] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 328
        ammoModel[6] = new ModelRendererTurbo(this, 153, 241, textureX, textureY); // Box 328
        ammoModel[7] = new ModelRendererTurbo(this, 361, 249, textureX, textureY); // Box 328
        ammoModel[8] = new ModelRendererTurbo(this, 81, 257, textureX, textureY); // Box 328
        ammoModel[9] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 328

        ammoModel[0].addShapeBox(-23F, 0F, -3.5F, 30, 25, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
        ammoModel[0].setRotationPoint(-42.9F, -34.5F, 0F);
        ammoModel[0].rotateAngleZ = 0.10471976F;

        ammoModel[1].addShapeBox(-24F, 0F, -3.5F, 1, 25, 7, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F); // Box 328
        ammoModel[1].setRotationPoint(-42.9F, -34.5F, 0F);
        ammoModel[1].rotateAngleZ = 0.10471976F;

        ammoModel[2].addShapeBox(7F, 0F, -3.5F, 1, 25, 7, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F); // Box 328
        ammoModel[2].setRotationPoint(-42.9F, -34.5F, 0F);
        ammoModel[2].rotateAngleZ = 0.10471976F;

        ammoModel[3].addShapeBox(-23F, 7F, -4.5F, 30, 18, 1, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
        ammoModel[3].setRotationPoint(-42.9F, -34.5F, 0F);
        ammoModel[3].rotateAngleZ = 0.10471976F;

        ammoModel[4].addShapeBox(-23F, 7F, 3.5F, 30, 18, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F); // Box 328
        ammoModel[4].setRotationPoint(-42.9F, -34.5F, 0F);
        ammoModel[4].rotateAngleZ = 0.10471976F;

        ammoModel[5].addShapeBox(-23F, 25F, -4.5F, 30, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
        ammoModel[5].setRotationPoint(-42.9F, -34.5F, 0F);
        ammoModel[5].rotateAngleZ = 0.10471976F;

        ammoModel[6].addShapeBox(-23F, -2F, -3.5F, 20, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
        ammoModel[6].setRotationPoint(-42.9F, -34.5F, 0F);
        ammoModel[6].rotateAngleZ = 0.10471976F;

        ammoModel[7].addShapeBox(-23F, -2F, 2.5F, 20, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
        ammoModel[7].setRotationPoint(-42.9F, -34.5F, 0F);
        ammoModel[7].rotateAngleZ = 0.10471976F;

        ammoModel[8].addShapeBox(-23F, 0F, 2.5F, 30, 25, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
        ammoModel[8].setRotationPoint(-42.9F, -34.5F, 0F);
        ammoModel[8].rotateAngleZ = 0.10471976F;

        ammoModel[9].addShapeBox(-23F, 2F, -2.5F, 30, 22, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
        ammoModel[9].setRotationPoint(-42.9F, -34.5F, 0F);
        ammoModel[9].rotateAngleZ = 0.10471976F;


        slideModel = new ModelRendererTurbo[16];
        slideModel[0] = new ModelRendererTurbo(this, 417, 201, textureX, textureY); // Box 33
        slideModel[1] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 197
        slideModel[2] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 197
        slideModel[3] = new ModelRendererTurbo(this, 489, 185, textureX, textureY); // Box 197
        slideModel[4] = new ModelRendererTurbo(this, 473, 201, textureX, textureY); // Box 197
        slideModel[5] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 197
        slideModel[6] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 197
        slideModel[7] = new ModelRendererTurbo(this, 89, 185, textureX, textureY); // Box 324
        slideModel[8] = new ModelRendererTurbo(this, 201, 281, textureX, textureY); // Box 292
        slideModel[9] = new ModelRendererTurbo(this, 361, 265, textureX, textureY); // Box 293
        slideModel[10] = new ModelRendererTurbo(this, 481, 265, textureX, textureY); // Box 292
        slideModel[11] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 292
        slideModel[12] = new ModelRendererTurbo(this, 233, 273, textureX, textureY); // Box 292
        slideModel[13] = new ModelRendererTurbo(this, 273, 273, textureX, textureY); // Box 292
        slideModel[14] = new ModelRendererTurbo(this, 329, 273, textureX, textureY); // Box 293
        slideModel[15] = new ModelRendererTurbo(this, 345, 273, textureX, textureY); // Box 292

        slideModel[0].addShapeBox(0F, 0F, 0F, 30, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        slideModel[0].setRotationPoint(-65F, -51F, -3.5F);

        slideModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F); // Box 197
        slideModel[1].setRotationPoint(14F, -53.5F, -11F);

        slideModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 197
        slideModel[2].setRotationPoint(14F, -53.5F, -12F);

        slideModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 197
        slideModel[3].setRotationPoint(11.7F, -53.5F, -11F);

        slideModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F, 0.5F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, 0.4F, -0.4F, 0F, -0.1F, -0.4F, 0F, 0.5F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, 0.4F, -0.4F, 0F, -0.1F, -0.4F, 0F); // Box 197
        slideModel[4].setRotationPoint(10.9F, -53.5F, -11F);

        slideModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.2F, -0.4F, 0.6F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, 0.6F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 197
        slideModel[5].setRotationPoint(11.7F, -53.5F, -11.8F);

        slideModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0.4F, -0.4F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0.4F, -0.4F, 0F); // Box 197
        slideModel[6].setRotationPoint(10.9F, -53.5F, -11.8F);

        slideModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
        slideModel[7].setRotationPoint(12F, -53F, 2F);

        slideModel[8].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 292
        slideModel[8].setRotationPoint(10.5F, -53.75F, 3.5F);

        slideModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 293
        slideModel[9].setRotationPoint(10F, -52.75F, 3.5F);

        slideModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 292
        slideModel[10].setRotationPoint(10.5F, -53.75F, 4.5F);

        slideModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 292
        slideModel[11].setRotationPoint(11.5F, -53.75F, 4.5F);

        slideModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 292
        slideModel[12].setRotationPoint(12.5F, -53.75F, 4.5F);

        slideModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 292
        slideModel[13].setRotationPoint(13.5F, -53.75F, 4.5F);

        slideModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F); // Box 293
        slideModel[14].setRotationPoint(14.5F, -52.75F, 3.5F);

        slideModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 292
        slideModel[15].setRotationPoint(14.5F, -53.75F, 4.5F);


        gadgetAttachPoint = new Vector3f(69F / 16F, 43F / 16F, -5F / 16F);
        scopeAttachPoint = new Vector3f(11F / 16F, 54F / 16F, 0F / 16F);
        gripAttachPoint = new Vector3f(73 / 16F, 32F / 16F, 0F / 16F);
        translateAll(8F, 5F, 0F);
        thirdPersonOffset = new Vector3f(0.2875D, -0.09375D, 0.0D);
        gunSlideDistance = 1.6F;
        hasFlash = true;
        hasArms = true;

        leftArmPos = new Vector3f(0.06F, -0.4F, -0.05F);
        leftArmRot = new Vector3f(80F, 50F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.15F, -0.55F, 0.05F);
        leftArmReloadRot = new Vector3f(80F, 50F, 0.0F);
        rightArmPos = new Vector3f(0.25F, -0.52F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85F);
        rightArmReloadPos = new Vector3f(0.25F, -0.52F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
        rightHandAmmo = false;
        leftHandAmmo = true;
        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);
        animationType = EnumAnimationType.CUSTOM;
        rotateGunHorizontal = 15.0F;
        tiltGun = 30.0F;
        translateGun = new Vector3f(0.0F, -0.0625F, -0.1875F);
        translateClip = new Vector3f(0.0F, -0.625F, 0.0F);
        casingAttachPoint = new Vector3f(-0.5F, 1.2F, 0.0F);
        casingAnimDistance = new Vector3f(0.0F, 3.0F, 7.75F);
        casingAnimSpread = new Vector3f(3.0F, 5.0F, 3.0F);
        casingAnimTime = 6;
        casingRotateVector = new Vector3f(0.1F, 0.0F, 0.1F);
        caseScale = 0.2F;
        casingDelay = 0;
        flashScale = 0.4F;
        muzzleFlashPoint = new Vector3f(0.9F, 0.57F, 0.0F);
        thirdPersonOffset = new Vector3f(-0.05F, -0.04F, 0.0F);
        gunOffset = 0.1F;
        crouchZoom = -0.05F;
        zoomOffset = 0.25F;
        ShakeDistance = 1.5F;

        //修正模型位移
        Vector3f vec3 = new Vector3f(10F, 5F, 0F);
        translateAll(vec3.x, -vec3.y, vec3.z);
        Vector3f attVec = new Vector3f(vec3.x / 16F, vec3.y / 16F, vec3.z / 16F);
        barrelAttachPoint = Vector3f.add(barrelAttachPoint, attVec, null);
        gadgetAttachPoint = Vector3f.add(gadgetAttachPoint, attVec, null);
        scopeAttachPoint = Vector3f.add(scopeAttachPoint, attVec, null);
        gripAttachPoint = Vector3f.add(gripAttachPoint, attVec, null);
        stockAttachPoint = Vector3f.add(stockAttachPoint, attVec, null);
        zoomOffsetY = -0.0325F;

        flipAll();
    }
}