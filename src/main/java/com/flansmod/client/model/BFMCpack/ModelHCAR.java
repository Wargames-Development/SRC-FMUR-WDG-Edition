//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HCAR
// Model Creator: 
// Created on: 28.03.2022 - 17:08:47
// Last changed on: 28.03.2022 - 17:08:47

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelHCAR extends ModelGun //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public ModelHCAR() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[251];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Import
        gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Import
        gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Import
        gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Import
        gunModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Import
        gunModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Import
        gunModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Import
        gunModel[7] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Import
        gunModel[8] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Import
        gunModel[9] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Import
        gunModel[10] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Import
        gunModel[11] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Import
        gunModel[12] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Import
        gunModel[13] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import Import
        gunModel[14] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Import
        gunModel[15] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Import
        gunModel[16] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Import
        gunModel[17] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Import
        gunModel[18] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Import
        gunModel[19] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Import
        gunModel[20] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import Import
        gunModel[21] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Import Import
        gunModel[22] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Import Import
        gunModel[23] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Import Import
        gunModel[24] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Import Import
        gunModel[25] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Import
        gunModel[26] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Import Import
        gunModel[27] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Import
        gunModel[28] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import Import
        gunModel[29] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import Import
        gunModel[30] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Import Import
        gunModel[31] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Import Import
        gunModel[32] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Import Import
        gunModel[33] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Import Import
        gunModel[34] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Import Import
        gunModel[35] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 66
        gunModel[36] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 66
        gunModel[37] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 66
        gunModel[38] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 66
        gunModel[39] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 66
        gunModel[40] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 66
        gunModel[41] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Import Import
        gunModel[42] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Import Import
        gunModel[43] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Import Import
        gunModel[44] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Import Import
        gunModel[45] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Import Import
        gunModel[46] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Import Import
        gunModel[47] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import Import
        gunModel[48] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Import Import
        gunModel[49] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Import Import
        gunModel[50] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Import Import
        gunModel[51] = new ModelRendererTurbo(this, 305, 161, textureX, textureY); // Import Import
        gunModel[52] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Import Import
        gunModel[53] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Import Import
        gunModel[54] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 194
        gunModel[55] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 194
        gunModel[56] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 194
        gunModel[57] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 197
        gunModel[58] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 197
        gunModel[59] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 197
        gunModel[60] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 197
        gunModel[61] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 197
        gunModel[62] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 197
        gunModel[63] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 197
        gunModel[64] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 197
        gunModel[65] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 197
        gunModel[66] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Box 194
        gunModel[67] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 194
        gunModel[68] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 194
        gunModel[69] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 194
        gunModel[70] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 194
        gunModel[71] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 194
        gunModel[72] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 194
        gunModel[73] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 194
        gunModel[74] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 194
        gunModel[75] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 194
        gunModel[76] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Import Import
        gunModel[77] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import Import
        gunModel[78] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Import Import
        gunModel[79] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Import Import
        gunModel[80] = new ModelRendererTurbo(this, 153, 185, textureX, textureY); // Import Import
        gunModel[81] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Import Import
        gunModel[82] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Import Import
        gunModel[83] = new ModelRendererTurbo(this, 457, 185, textureX, textureY); // Import Import
        gunModel[84] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Import Import
        gunModel[85] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Import Import
        gunModel[86] = new ModelRendererTurbo(this, 97, 193, textureX, textureY); // Import Import
        gunModel[87] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 66
        gunModel[88] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 66
        gunModel[89] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 66
        gunModel[90] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 66
        gunModel[91] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 66
        gunModel[92] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 66
        gunModel[93] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 66
        gunModel[94] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 66
        gunModel[95] = new ModelRendererTurbo(this, 265, 193, textureX, textureY); // Import Import
        gunModel[96] = new ModelRendererTurbo(this, 329, 193, textureX, textureY); // Import Import
        gunModel[97] = new ModelRendererTurbo(this, 393, 193, textureX, textureY); // Import Import
        gunModel[98] = new ModelRendererTurbo(this, 129, 201, textureX, textureY); // Import Import
        gunModel[99] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Import Import
        gunModel[100] = new ModelRendererTurbo(this, 169, 225, textureX, textureY); // Import Import
        gunModel[101] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Import Import
        gunModel[102] = new ModelRendererTurbo(this, 33, 193, textureX, textureY); // Import Import
        gunModel[103] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Import Import
        gunModel[104] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Import Import
        gunModel[105] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Import Import
        gunModel[106] = new ModelRendererTurbo(this, 489, 185, textureX, textureY); // Import Import
        gunModel[107] = new ModelRendererTurbo(this, 209, 201, textureX, textureY); // Import Import
        gunModel[108] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Import Import
        gunModel[109] = new ModelRendererTurbo(this, 81, 193, textureX, textureY); // Import Import
        gunModel[110] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Import Import
        gunModel[111] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Import Import
        gunModel[112] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); // Import Import
        gunModel[113] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Import Import
        gunModel[114] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); // Import Import
        gunModel[115] = new ModelRendererTurbo(this, 233, 201, textureX, textureY); // Import Import
        gunModel[116] = new ModelRendererTurbo(this, 33, 209, textureX, textureY); // Import Import
        gunModel[117] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Import Import
        gunModel[118] = new ModelRendererTurbo(this, 57, 209, textureX, textureY); // Import Import
        gunModel[119] = new ModelRendererTurbo(this, 73, 209, textureX, textureY); // Import Import
        gunModel[120] = new ModelRendererTurbo(this, 97, 209, textureX, textureY); // Import Import
        gunModel[121] = new ModelRendererTurbo(this, 329, 217, textureX, textureY); // Import Import
        gunModel[122] = new ModelRendererTurbo(this, 345, 217, textureX, textureY); // Import Import
        gunModel[123] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Import Import
        gunModel[124] = new ModelRendererTurbo(this, 369, 217, textureX, textureY); // Import Import
        gunModel[125] = new ModelRendererTurbo(this, 449, 217, textureX, textureY); // Import Import
        gunModel[126] = new ModelRendererTurbo(this, 473, 217, textureX, textureY); // Import Import
        gunModel[127] = new ModelRendererTurbo(this, 489, 217, textureX, textureY); // Import Import
        gunModel[128] = new ModelRendererTurbo(this, 385, 225, textureX, textureY); // Import Import
        gunModel[129] = new ModelRendererTurbo(this, 409, 225, textureX, textureY); // Import Import
        gunModel[130] = new ModelRendererTurbo(this, 425, 225, textureX, textureY); // Import Import
        gunModel[131] = new ModelRendererTurbo(this, 169, 233, textureX, textureY); // Import Import
        gunModel[132] = new ModelRendererTurbo(this, 193, 233, textureX, textureY); // Import Import
        gunModel[133] = new ModelRendererTurbo(this, 209, 233, textureX, textureY); // Import Import
        gunModel[134] = new ModelRendererTurbo(this, 225, 233, textureX, textureY); // Import Import
        gunModel[135] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Import Import
        gunModel[136] = new ModelRendererTurbo(this, 265, 233, textureX, textureY); // Import Import
        gunModel[137] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Import Import
        gunModel[138] = new ModelRendererTurbo(this, 305, 233, textureX, textureY); // Import Import
        gunModel[139] = new ModelRendererTurbo(this, 321, 233, textureX, textureY); // Import Import
        gunModel[140] = new ModelRendererTurbo(this, 337, 233, textureX, textureY); // Import Import
        gunModel[141] = new ModelRendererTurbo(this, 361, 233, textureX, textureY); // Import Import
        gunModel[142] = new ModelRendererTurbo(this, 441, 233, textureX, textureY); // Import Import
        gunModel[143] = new ModelRendererTurbo(this, 457, 233, textureX, textureY); // Import Import
        gunModel[144] = new ModelRendererTurbo(this, 481, 233, textureX, textureY); // Import Import
        gunModel[145] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Import Import
        gunModel[146] = new ModelRendererTurbo(this, 17, 249, textureX, textureY); // Import Import
        gunModel[147] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Import Import
        gunModel[148] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Import Import
        gunModel[149] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Import Import
        gunModel[150] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Import Import
        gunModel[151] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Import Import
        gunModel[152] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Import Import
        gunModel[153] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Import Import
        gunModel[154] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Import Import
        gunModel[155] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Import Import
        gunModel[156] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Import Import
        gunModel[157] = new ModelRendererTurbo(this, 313, 249, textureX, textureY); // Import Import
        gunModel[158] = new ModelRendererTurbo(this, 353, 249, textureX, textureY); // Import Import
        gunModel[159] = new ModelRendererTurbo(this, 417, 249, textureX, textureY); // Import Import
        gunModel[160] = new ModelRendererTurbo(this, 457, 249, textureX, textureY); // Import Import
        gunModel[161] = new ModelRendererTurbo(this, 385, 257, textureX, textureY); // Import Import
        gunModel[162] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Import Import
        gunModel[163] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Import Import
        gunModel[164] = new ModelRendererTurbo(this, 321, 153, textureX, textureY); // Import Import
        gunModel[165] = new ModelRendererTurbo(this, 17, 241, textureX, textureY); // Import Import
        gunModel[166] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Import Import
        gunModel[167] = new ModelRendererTurbo(this, 33, 177, textureX, textureY); // Import Import
        gunModel[168] = new ModelRendererTurbo(this, 265, 185, textureX, textureY); // Import Import
        gunModel[169] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Import Import
        gunModel[170] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Import Import
        gunModel[171] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Import Import
        gunModel[172] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Import Import
        gunModel[173] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Import Import
        gunModel[174] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Import Import
        gunModel[175] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Import Import
        gunModel[176] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Import Import
        gunModel[177] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Import Import
        gunModel[178] = new ModelRendererTurbo(this, 297, 273, textureX, textureY); // Import Import
        gunModel[179] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Import Import
        gunModel[180] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Import Import
        gunModel[181] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Import Import
        gunModel[182] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Import Import
        gunModel[183] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Import Import
        gunModel[184] = new ModelRendererTurbo(this, 129, 193, textureX, textureY); // Import Import
        gunModel[185] = new ModelRendererTurbo(this, 329, 193, textureX, textureY); // Import Import
        gunModel[186] = new ModelRendererTurbo(this, 201, 201, textureX, textureY); // Import Import
        gunModel[187] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Import Import
        gunModel[188] = new ModelRendererTurbo(this, 265, 201, textureX, textureY); // Import Import
        gunModel[189] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Import Import
        gunModel[190] = new ModelRendererTurbo(this, 25, 209, textureX, textureY); // Import Import
        gunModel[191] = new ModelRendererTurbo(this, 113, 209, textureX, textureY); // Import Import
        gunModel[192] = new ModelRendererTurbo(this, 129, 209, textureX, textureY); // Import Import
        gunModel[193] = new ModelRendererTurbo(this, 193, 217, textureX, textureY); // Import Import
        gunModel[194] = new ModelRendererTurbo(this, 209, 217, textureX, textureY); // Import Import
        gunModel[195] = new ModelRendererTurbo(this, 225, 217, textureX, textureY); // Import Import
        gunModel[196] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // Import Import
        gunModel[197] = new ModelRendererTurbo(this, 497, 233, textureX, textureY); // Import Import
        gunModel[198] = new ModelRendererTurbo(this, 417, 241, textureX, textureY); // Import Import
        gunModel[199] = new ModelRendererTurbo(this, 305, 249, textureX, textureY); // Import Import
        gunModel[200] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Import Import
        gunModel[201] = new ModelRendererTurbo(this, 449, 249, textureX, textureY); // Import Import
        gunModel[202] = new ModelRendererTurbo(this, 489, 249, textureX, textureY); // Import Import
        gunModel[203] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Import Import
        gunModel[204] = new ModelRendererTurbo(this, 489, 257, textureX, textureY); // Import Import
        gunModel[205] = new ModelRendererTurbo(this, 433, 265, textureX, textureY); // Import Import
        gunModel[206] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Import Import
        gunModel[207] = new ModelRendererTurbo(this, 457, 265, textureX, textureY); // Import Import
        gunModel[208] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Import Import
        gunModel[209] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Import Import
        gunModel[210] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 314
        gunModel[211] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 314
        gunModel[212] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 314
        gunModel[213] = new ModelRendererTurbo(this, 289, 281, textureX, textureY); // Import Import
        gunModel[214] = new ModelRendererTurbo(this, 281, 305, textureX, textureY); // Import Import
        gunModel[215] = new ModelRendererTurbo(this, 425, 305, textureX, textureY); // Import Import
        gunModel[216] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 325
        gunModel[217] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 325
        gunModel[218] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 325
        gunModel[219] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 325
        gunModel[220] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 325
        gunModel[221] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 325
        gunModel[222] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Box 325
        gunModel[223] = new ModelRendererTurbo(this, 153, 241, textureX, textureY); // Box 325
        gunModel[224] = new ModelRendererTurbo(this, 481, 265, textureX, textureY); // Box 325
        gunModel[225] = new ModelRendererTurbo(this, 281, 321, textureX, textureY); // Import Import
        gunModel[226] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import Import
        gunModel[227] = new ModelRendererTurbo(this, 369, 321, textureX, textureY); // Import Import
        gunModel[228] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Import Import
        gunModel[229] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Import Import
        gunModel[230] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Import Import
        gunModel[231] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Import Import
        gunModel[232] = new ModelRendererTurbo(this, 497, 273, textureX, textureY); // Import Import
        gunModel[233] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Import Import
        gunModel[234] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Import Import
        gunModel[235] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Import Import
        gunModel[236] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Import Import
        gunModel[237] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Import Import
        gunModel[238] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Import Import
        gunModel[239] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Import Import
        gunModel[240] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Import
        gunModel[241] = new ModelRendererTurbo(this, 481, 273, textureX, textureY); // Import Import
        gunModel[242] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Import Import
        gunModel[243] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Import Import
        gunModel[244] = new ModelRendererTurbo(this, 281, 329, textureX, textureY); // Import
        gunModel[245] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Import Import
        gunModel[246] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Import Import
        gunModel[247] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Import Import
        gunModel[248] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Import Import
        gunModel[249] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Import Import
        gunModel[250] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Import Import

        gunModel[0].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[0].setRotationPoint(19F, -39F, 1.5F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[1].setRotationPoint(19F, -31F, 1.5F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[2].setRotationPoint(19F, -39F, -2.5F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[3].setRotationPoint(19F, -31F, -2.5F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[4].setRotationPoint(19F, -39F, -1.5F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[5].setRotationPoint(6F, -28F, -2.5F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, -3F, 0.0F, 0.0F, 3F, 0.0F, 0.0F, 3F, 0.0F, 0.0F, -3F, 0F, 0.0F, 0.0F, -1.0F, 0.0F, -2F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import Import
        gunModel[6].setRotationPoint(16F, -30F, -2.5F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[7].setRotationPoint(1F, -39F, -1F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F); // Import Import
        gunModel[8].setRotationPoint(1F, -37F, -1F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 7, 3, 2, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -1F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, -1F, 0.0F); // Import Import
        gunModel[9].setRotationPoint(2F, -32F, -1F);

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
        gunModel[22].setRotationPoint(-9F, -35F, -3.5F);

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

        gunModel[30].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F); // Import Import
        gunModel[30].setRotationPoint(3F, -30F, -2.5F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 63, 3, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[31].setRotationPoint(-8F, -56F, -6F);

        gunModel[32].addShapeBox(0F, 0F, 0F, 63, 3, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, -2F); // Import Import
        gunModel[32].setRotationPoint(-8F, -41F, -6F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 16, 7, 3, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F); // Import Import
        gunModel[33].setRotationPoint(21F, -63F, -6F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 63, 4, 12, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Import
        gunModel[34].setRotationPoint(-8F, -60F, -6F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 14, 7, 6, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F); // Box 66
        gunModel[35].setRotationPoint(22F, -63F, -3F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 41, 1, 4, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 66
        gunModel[36].setRotationPoint(-7F, -64F, -2F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 38, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 66
        gunModel[37].setRotationPoint(-4F, -65F, -3F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 42, 2, 4, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
        gunModel[38].setRotationPoint(-8F, -61F, -2F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 66
        gunModel[39].setRotationPoint(8F, -63F, -2F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
        gunModel[40].setRotationPoint(-7F, -63F, -2F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 10, 3, 12, 0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, -2F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, -2F, 0.0F, 1.5F, -2F); // Import Import
        gunModel[41].setRotationPoint(-18F, -41F, -6F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 18, 3, 12, 0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 1F, -2F, 0.0F, 1F, -2F, 0.0F, 1F, -2F, 0.0F, 1F, -2F); // Import Import
        gunModel[42].setRotationPoint(-36F, -40.5F, -6F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 18, 10, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import Import
        gunModel[43].setRotationPoint(-36F, -50F, -6F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 18, 3, 12, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Import
        gunModel[44].setRotationPoint(-36F, -52F, -6F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 10, 10, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 6F, 0.0F, 0.0F, 6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.5F, 0.0F); // Import Import
        gunModel[45].setRotationPoint(-18F, -50F, -6F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 10, 3, 12, 0F, 0F, -5F, -2F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, -5F, -2F, 0F, 5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 5F, 0F); // Import Import
        gunModel[46].setRotationPoint(-18F, -58F, -6F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 16, 7, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import Import
        gunModel[47].setRotationPoint(21F, -63F, 3F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 10, 10, 14, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[48].setRotationPoint(55F, -51.5F, -7F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 10, 5, 14, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F); // Import Import
        gunModel[49].setRotationPoint(55F, -41.5F, -7F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 75, 6, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[50].setRotationPoint(55F, -52F, -6F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 75, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[51].setRotationPoint(55F, -56F, -6F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0F, 1F, 0.0F, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[52].setRotationPoint(79F, -55F, -6F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 75, 2, 10, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, -2F); // Import Import
        gunModel[53].setRotationPoint(55F, -43F, -5F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 75, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
        gunModel[54].setRotationPoint(55F, -41F, -2F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 35, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
        gunModel[55].setRotationPoint(95F, -40F, -3F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
        gunModel[56].setRotationPoint(9F, -39F, -3F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 197
        gunModel[57].setRotationPoint(95F, -39F, -3F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 197
        gunModel[58].setRotationPoint(99F, -39F, -3F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 197
        gunModel[59].setRotationPoint(103F, -39F, -3F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 197
        gunModel[60].setRotationPoint(107F, -39F, -3F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 197
        gunModel[61].setRotationPoint(111F, -39F, -3F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 197
        gunModel[62].setRotationPoint(115F, -39F, -3F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 197
        gunModel[63].setRotationPoint(119F, -39F, -3F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 197
        gunModel[64].setRotationPoint(123F, -39F, -3F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 197
        gunModel[65].setRotationPoint(127F, -39F, -3F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 35, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
        gunModel[66].setRotationPoint(95F, -51.5F, 6F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194
        gunModel[67].setRotationPoint(95F, -51.5F, 7F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194
        gunModel[68].setRotationPoint(99F, -51.5F, 7F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194
        gunModel[69].setRotationPoint(103F, -51.5F, 7F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194
        gunModel[70].setRotationPoint(107F, -51.5F, 7F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194
        gunModel[71].setRotationPoint(111F, -51.5F, 7F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194
        gunModel[72].setRotationPoint(115F, -51.5F, 7F);

        gunModel[73].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194
        gunModel[73].setRotationPoint(119F, -51.5F, 7F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194
        gunModel[74].setRotationPoint(123F, -51.5F, 7F);

        gunModel[75].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194
        gunModel[75].setRotationPoint(127F, -51.5F, 7F);

        gunModel[76].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[76].setRotationPoint(79F, -54F, -6F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F); // Import Import
        gunModel[77].setRotationPoint(79F, -53F, -6F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F, 1F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0F, 1F, 0.0F, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[78].setRotationPoint(123F, -55F, -6F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[79].setRotationPoint(123F, -54F, -6F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 1F, 0.0F, 0.0F); // Import Import
        gunModel[80].setRotationPoint(123F, -53F, -6F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0F, 1F, 0.0F, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[81].setRotationPoint(100F, -55F, -6F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[82].setRotationPoint(100F, -54F, -6F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F); // Import Import
        gunModel[83].setRotationPoint(100F, -53F, -6F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 9, 1, 12, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Import
        gunModel[84].setRotationPoint(55F, -55F, -6F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 9, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Import
        gunModel[85].setRotationPoint(55F, -54F, -6F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 9, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Import
        gunModel[86].setRotationPoint(55F, -53F, -6F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F); // Box 66
        gunModel[87].setRotationPoint(8F, -61.7F, -2F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 66
        gunModel[88].setRotationPoint(8F, -62.3F, -2F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 66
        gunModel[89].setRotationPoint(21F, -63F, -2F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F); // Box 66
        gunModel[90].setRotationPoint(21F, -61.7F, -2F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 66
        gunModel[91].setRotationPoint(21F, -62.3F, -2F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 66
        gunModel[92].setRotationPoint(-4F, -62.3F, -2F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 66
        gunModel[93].setRotationPoint(-4F, -63F, -2F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 66
        gunModel[94].setRotationPoint(-4F, -62F, -2F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 15, 10, 14, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[95].setRotationPoint(65F, -51.5F, -7F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 15, 5, 14, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1F, 0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.5F); // Import Import
        gunModel[96].setRotationPoint(65F, -41.5F, -7F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 15, 10, 16, 0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[97].setRotationPoint(80F, -51.5F, -8F);

        gunModel[98].addShapeBox(0F, 0F, 0F, 15, 5, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F); // Import Import
        gunModel[98].setRotationPoint(80F, -41.5F, -8F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 75, 3, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F); // Import Import
        gunModel[99].setRotationPoint(55F, -46F, -6F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 75, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F); // Import Import
        gunModel[100].setRotationPoint(55F, -60F, -3F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0F, 0.0F, 0.0F); // Import Import
        gunModel[101].setRotationPoint(55F, -57F, -6F);

        gunModel[102].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import Import
        gunModel[102].setRotationPoint(55F, -58F, -5F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[103].setRotationPoint(55F, -59F, -4F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F); // Import Import
        gunModel[104].setRotationPoint(61F, -57F, -6F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F); // Import Import
        gunModel[105].setRotationPoint(61F, -58F, -5F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[106].setRotationPoint(61F, -59F, -4F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F); // Import Import
        gunModel[107].setRotationPoint(66F, -57F, -6F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F); // Import Import
        gunModel[108].setRotationPoint(66F, -58F, -5F);

        gunModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[109].setRotationPoint(66F, -59F, -4F);

        gunModel[110].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F); // Import Import
        gunModel[110].setRotationPoint(71F, -57F, -6F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F); // Import Import
        gunModel[111].setRotationPoint(71F, -58F, -5F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[112].setRotationPoint(71F, -59F, -4F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F); // Import Import
        gunModel[113].setRotationPoint(76F, -57F, -6F);

        gunModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F); // Import Import
        gunModel[114].setRotationPoint(76F, -58F, -5F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[115].setRotationPoint(76F, -59F, -4F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F); // Import Import
        gunModel[116].setRotationPoint(81F, -57F, -6F);

        gunModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F); // Import Import
        gunModel[117].setRotationPoint(81F, -58F, -5F);

        gunModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[118].setRotationPoint(81F, -59F, -4F);

        gunModel[119].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F); // Import Import
        gunModel[119].setRotationPoint(86F, -57F, -6F);

        gunModel[120].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F); // Import Import
        gunModel[120].setRotationPoint(86F, -58F, -5F);

        gunModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[121].setRotationPoint(86F, -59F, -4F);

        gunModel[122].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F); // Import Import
        gunModel[122].setRotationPoint(91F, -57F, -6F);

        gunModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F); // Import Import
        gunModel[123].setRotationPoint(91F, -58F, -5F);

        gunModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[124].setRotationPoint(91F, -59F, -4F);

        gunModel[125].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F); // Import Import
        gunModel[125].setRotationPoint(96F, -57F, -6F);

        gunModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F); // Import Import
        gunModel[126].setRotationPoint(96F, -58F, -5F);

        gunModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[127].setRotationPoint(96F, -59F, -4F);

        gunModel[128].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F); // Import Import
        gunModel[128].setRotationPoint(101F, -57F, -6F);

        gunModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F); // Import Import
        gunModel[129].setRotationPoint(101F, -58F, -5F);

        gunModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[130].setRotationPoint(101F, -59F, -4F);

        gunModel[131].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F); // Import Import
        gunModel[131].setRotationPoint(106F, -57F, -6F);

        gunModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F); // Import Import
        gunModel[132].setRotationPoint(106F, -58F, -5F);

        gunModel[133].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[133].setRotationPoint(106F, -59F, -4F);

        gunModel[134].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F); // Import Import
        gunModel[134].setRotationPoint(111F, -57F, -6F);

        gunModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F); // Import Import
        gunModel[135].setRotationPoint(111F, -58F, -5F);

        gunModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[136].setRotationPoint(111F, -59F, -4F);

        gunModel[137].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F); // Import Import
        gunModel[137].setRotationPoint(116F, -57F, -6F);

        gunModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F); // Import Import
        gunModel[138].setRotationPoint(116F, -58F, -5F);

        gunModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[139].setRotationPoint(116F, -59F, -4F);

        gunModel[140].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F); // Import Import
        gunModel[140].setRotationPoint(121F, -57F, -6F);

        gunModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F); // Import Import
        gunModel[141].setRotationPoint(121F, -58F, -5F);

        gunModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[142].setRotationPoint(121F, -59F, -4F);

        gunModel[143].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0.5F, 0.0F, -0.75F, 1F, 0.0F, -0.75F, 1F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 1.25F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F); // Import Import
        gunModel[143].setRotationPoint(126F, -57F, -6F);

        gunModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0.0F, 0.0F, -0.5F, 2F, 0.0F, -0.5F, 2F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.25F, 2F, 0.0F, 0.25F, 2F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F); // Import Import
        gunModel[144].setRotationPoint(126F, -58F, -5F);

        gunModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.0F, -0.25F, 2F, 0.0F, -0.25F, 2F, 0.0F, -0.25F, 0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 2F, 0.0F, 0.5F, 2F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[145].setRotationPoint(126F, -59F, -4F);

        gunModel[146].addShapeBox(0F, 0F, 0F, 140, 2, 6, 0F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[146].setRotationPoint(55F, -58F, -3F);

        gunModel[147].addShapeBox(0F, 0F, 0F, 140, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[147].setRotationPoint(55F, -56F, -3F);

        gunModel[148].addShapeBox(0F, 0F, 0F, 140, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, -2F); // Import Import
        gunModel[148].setRotationPoint(55F, -54F, -3F);

        gunModel[149].addShapeBox(0F, 0F, 0F, 134, 2, 6, 0F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[149].setRotationPoint(55F, -50F, -3F);

        gunModel[150].addShapeBox(0F, 0F, 0F, 134, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[150].setRotationPoint(55F, -48F, -3F);

        gunModel[151].addShapeBox(0F, 0F, 0F, 134, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, -2F); // Import Import
        gunModel[151].setRotationPoint(55F, -46F, -3F);

        gunModel[152].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[152].setRotationPoint(193F, -56F, -2F);

        gunModel[153].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[153].setRotationPoint(193F, -56F, 1F);

        gunModel[154].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[154].setRotationPoint(193F, -57F, -2F);

        gunModel[155].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Import
        gunModel[155].setRotationPoint(193F, -54F, -2F);

        gunModel[156].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[156].setRotationPoint(179F, -48.5F, -4F);

        gunModel[157].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import Import
        gunModel[157].setRotationPoint(179F, -51F, -4F);

        gunModel[158].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Import Import
        gunModel[158].setRotationPoint(179F, -45F, -4F);

        gunModel[159].addShapeBox(0F, 0F, 0F, 8, 5, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[159].setRotationPoint(179F, -56.5F, -4F);

        gunModel[160].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import Import
        gunModel[160].setRotationPoint(179F, -59F, -4F);

        gunModel[161].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F); // Import Import
        gunModel[161].setRotationPoint(179F, -51.5F, -4F);

        gunModel[162].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import Import
        gunModel[162].setRotationPoint(56F, -61F, -2F);

        gunModel[163].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Import
        gunModel[163].setRotationPoint(56F, -62F, -2F);

        gunModel[164].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Import Import
        gunModel[164].setRotationPoint(57F, -63F, -2F);

        gunModel[165].addShapeBox(0F, 0F, 0F, 65, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Import
        gunModel[165].setRotationPoint(60F, -64F, -2F);

        gunModel[166].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Import
        gunModel[166].setRotationPoint(120F, -61F, -2F);

        gunModel[167].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Import
        gunModel[167].setRotationPoint(121F, -62F, -2F);

        gunModel[168].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // Import Import
        gunModel[168].setRotationPoint(120F, -63F, -2F);

        gunModel[169].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Import
        gunModel[169].setRotationPoint(92F, -62F, -2F);

        gunModel[170].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Import Import
        gunModel[170].setRotationPoint(92F, -61F, -2F);

        gunModel[171].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Import
        gunModel[171].setRotationPoint(92F, -63F, -2F);

        gunModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Import
        gunModel[172].setRotationPoint(106F, -62F, -2F);

        gunModel[173].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Import Import
        gunModel[173].setRotationPoint(106F, -61F, -2F);

        gunModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Import
        gunModel[174].setRotationPoint(106F, -63F, -2F);

        gunModel[175].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Import
        gunModel[175].setRotationPoint(78F, -62F, -2F);

        gunModel[176].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Import Import
        gunModel[176].setRotationPoint(78F, -61F, -2F);

        gunModel[177].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Import
        gunModel[177].setRotationPoint(78F, -63F, -2F);

        gunModel[178].addShapeBox(0F, 0F, 0F, 65, 1, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Import
        gunModel[178].setRotationPoint(60F, -65F, -2F);

        gunModel[179].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Import
        gunModel[179].setRotationPoint(60F, -66F, -2F);

        gunModel[180].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Import
        gunModel[180].setRotationPoint(66F, -66F, -2F);

        gunModel[181].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Import
        gunModel[181].setRotationPoint(70F, -66F, -2F);

        gunModel[182].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Import
        gunModel[182].setRotationPoint(74F, -66F, -2F);

        gunModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Import
        gunModel[183].setRotationPoint(78F, -66F, -2F);

        gunModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Import
        gunModel[184].setRotationPoint(82F, -66F, -2F);

        gunModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Import
        gunModel[185].setRotationPoint(86F, -66F, -2F);

        gunModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Import
        gunModel[186].setRotationPoint(90F, -66F, -2F);

        gunModel[187].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Import
        gunModel[187].setRotationPoint(94F, -66F, -2F);

        gunModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Import
        gunModel[188].setRotationPoint(98F, -66F, -2F);

        gunModel[189].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Import
        gunModel[189].setRotationPoint(102F, -66F, -2F);

        gunModel[190].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Import
        gunModel[190].setRotationPoint(106F, -66F, -2F);

        gunModel[191].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Import
        gunModel[191].setRotationPoint(110F, -66F, -2F);

        gunModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Import
        gunModel[192].setRotationPoint(114F, -66F, -2F);

        gunModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Import
        gunModel[193].setRotationPoint(118F, -66F, -2F);

        gunModel[194].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Import
        gunModel[194].setRotationPoint(122F, -66F, -2F);

        gunModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Import
        gunModel[195].setRotationPoint(-4F, -66F, -2F);

        gunModel[196].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Import
        gunModel[196].setRotationPoint(0F, -66F, -2F);

        gunModel[197].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Import
        gunModel[197].setRotationPoint(4F, -66F, -2F);

        gunModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Import
        gunModel[198].setRotationPoint(8F, -66F, -2F);

        gunModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Import
        gunModel[199].setRotationPoint(12F, -66F, -2F);

        gunModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Import
        gunModel[200].setRotationPoint(16F, -66F, -2F);

        gunModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Import
        gunModel[201].setRotationPoint(20F, -66F, -2F);

        gunModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Import
        gunModel[202].setRotationPoint(24F, -66F, -2F);

        gunModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Import
        gunModel[203].setRotationPoint(28F, -66F, -2F);

        gunModel[204].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Import
        gunModel[204].setRotationPoint(32F, -66F, -2F);

        gunModel[205].addShapeBox(0F, 0F, 0F, 9, 10, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0F); // Import Import
        gunModel[205].setRotationPoint(27F, -38F, 3F);

        gunModel[206].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0.0F, 0.0F, -0.5F, 0F, 0.0F, -0.5F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, -0.5F, 0.0F, 0.0F, -0.5F, 1F, 0.0F, 0.0F, 0.0F, -1F, 0.0F); // Import Import
        gunModel[206].setRotationPoint(25F, -38F, 2F);

        gunModel[207].addShapeBox(0F, 0F, 0F, 9, 10, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Import
        gunModel[207].setRotationPoint(27F, -38F, -4F);

        gunModel[208].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F); // Import Import
        gunModel[208].setRotationPoint(25F, -38F, -3F);

        gunModel[209].addShapeBox(0F, 0F, 0F, 0, 3, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[209].setRotationPoint(27F, -31F, -3F);

        gunModel[210].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
        gunModel[210].setRotationPoint(21F, -35.5F, 2.5F);

        gunModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
        gunModel[211].setRotationPoint(21F, -36.5F, 2.5F);

        gunModel[212].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 314
        gunModel[212].setRotationPoint(21F, -33.5F, 2.5F);

        gunModel[213].addShapeBox(0F, 0F, 0F, 63, 5, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[213].setRotationPoint(-8F, -46F, -6F);

        gunModel[214].addShapeBox(0F, 0F, 0F, 63, 7, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[214].setRotationPoint(-8F, -53F, 0F);

        gunModel[215].addShapeBox(0F, 0F, 0F, 36, 7, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[215].setRotationPoint(-8F, -53F, -6F);

        gunModel[216].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
        gunModel[216].setRotationPoint(47F, -52F, 5.3F);

        gunModel[217].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
        gunModel[217].setRotationPoint(47F, -53F, 5.3F);

        gunModel[218].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 325
        gunModel[218].setRotationPoint(47F, -51F, 5.3F);

        gunModel[219].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
        gunModel[219].setRotationPoint(35.5F, -52F, 5.3F);

        gunModel[220].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
        gunModel[220].setRotationPoint(35.5F, -53F, 5.3F);

        gunModel[221].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 325
        gunModel[221].setRotationPoint(35.5F, -51F, 5.3F);

        gunModel[222].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 1F, -1F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F); // Box 325
        gunModel[222].setRotationPoint(44F, -42F, 5.2F);

        gunModel[223].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 2F, 14F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 2F, 14F, 0F, 3F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -15F, 0F); // Box 325
        gunModel[223].setRotationPoint(32F, -42F, 5.2F);

        gunModel[224].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, -5.1F, 5.9F, 1.25F, 1F, -1F, 0F, 1F, -1F, 0F, -5.1F, 5.9F, -2F, -4.75F, -6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -4.75F, -6F, -1.75F); // Box 325
        gunModel[224].setRotationPoint(19F, -57F, 5.2F);

        gunModel[225].addShapeBox(0F, 0F, 0F, 40, 5, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[225].setRotationPoint(-7F, -49F, 6F);

        gunModel[226].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0F, 0.0F); // Import Import
        gunModel[226].setRotationPoint(33F, -49F, 6F);

        gunModel[227].addShapeBox(0F, 0F, 0F, 35, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0F, 0.0F, -1F, -1F, 0F, -1F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, -1F, 0.0F, -1F, -1F, 0.0F); // Import Import
        gunModel[227].setRotationPoint(-7F, -48F, 7F);

        gunModel[228].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1F); // Import Import
        gunModel[228].setRotationPoint(30F, -49F, 7F);

        gunModel[229].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1F); // Import Import
        gunModel[229].setRotationPoint(30F, -45F, 7F);

        gunModel[230].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2F); // Import Import
        gunModel[230].setRotationPoint(27F, -49F, 7F);

        gunModel[231].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2F); // Import Import
        gunModel[231].setRotationPoint(27F, -45F, 7F);

        gunModel[232].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[232].setRotationPoint(29.5F, -48F, 7F);

        gunModel[233].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Import
        gunModel[233].setRotationPoint(19F, -44F, 6F);

        gunModel[234].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Import
        gunModel[234].setRotationPoint(24F, -43F, 6F);

        gunModel[235].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Import
        gunModel[235].setRotationPoint(24F, -42F, 6F);

        gunModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Import
        gunModel[236].setRotationPoint(25F, -43F, 6.2F);

        gunModel[237].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Import
        gunModel[237].setRotationPoint(-9F, -44F, 6F);

        gunModel[238].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Import
        gunModel[238].setRotationPoint(-4F, -43F, 6F);

        gunModel[239].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Import
        gunModel[239].setRotationPoint(-4F, -42F, 6F);

        gunModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Import
        gunModel[240].setRotationPoint(-3F, -43F, 6.2F);

        gunModel[241].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0F, 0.0F, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[241].setRotationPoint(15F, -51F, 5.5F);

        gunModel[242].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0F, -0.6F, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[242].setRotationPoint(24F, -51F, 5.5F);

        gunModel[243].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F); // Import Import
        gunModel[243].setRotationPoint(14F, -51F, 5.5F);

        gunModel[244].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[244].setRotationPoint(115F, -67F, -2.12F);

        gunModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 0F); // Import Import
        gunModel[245].setRotationPoint(28.5F, -48F, 7F);

        gunModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Import
        gunModel[246].setRotationPoint(28.5F, -46F, 7F);

        gunModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F); // Import Import
        gunModel[247].setRotationPoint(30.5F, -48F, 7F);

        gunModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Import
        gunModel[248].setRotationPoint(30.5F, -46F, 7F);

        gunModel[249].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, -0.5F, 0.0F, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[249].setRotationPoint(29F, -48F, 12F);

        gunModel[250].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import Import
        gunModel[250].setRotationPoint(29F, -48F, 13F);


        defaultScopeModel = new ModelRendererTurbo[35];
        defaultScopeModel[0] = new ModelRendererTurbo(this, 441, 321, textureX, textureY); // Import
        defaultScopeModel[1] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Import
        defaultScopeModel[2] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Import
        defaultScopeModel[3] = new ModelRendererTurbo(this, 321, 265, textureX, textureY); // Import
        defaultScopeModel[4] = new ModelRendererTurbo(this, 369, 265, textureX, textureY); // Import
        defaultScopeModel[5] = new ModelRendererTurbo(this, 417, 265, textureX, textureY); // Import
        defaultScopeModel[6] = new ModelRendererTurbo(this, 489, 289, textureX, textureY); // Import
        defaultScopeModel[7] = new ModelRendererTurbo(this, 441, 297, textureX, textureY); // Import
        defaultScopeModel[8] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Import
        defaultScopeModel[9] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Import
        defaultScopeModel[10] = new ModelRendererTurbo(this, 457, 297, textureX, textureY); // Import
        defaultScopeModel[11] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Import
        defaultScopeModel[12] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Import
        defaultScopeModel[13] = new ModelRendererTurbo(this, 481, 297, textureX, textureY); // Import
        defaultScopeModel[14] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Import
        defaultScopeModel[15] = new ModelRendererTurbo(this, 289, 329, textureX, textureY); // Import
        defaultScopeModel[16] = new ModelRendererTurbo(this, 497, 297, textureX, textureY); // Import
        defaultScopeModel[17] = new ModelRendererTurbo(this, 473, 321, textureX, textureY); // Import
        defaultScopeModel[18] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Import
        defaultScopeModel[19] = new ModelRendererTurbo(this, 489, 321, textureX, textureY); // Import
        defaultScopeModel[20] = new ModelRendererTurbo(this, 417, 305, textureX, textureY); // Import
        defaultScopeModel[21] = new ModelRendererTurbo(this, 321, 329, textureX, textureY); // Import
        defaultScopeModel[22] = new ModelRendererTurbo(this, 337, 329, textureX, textureY); // Import
        defaultScopeModel[23] = new ModelRendererTurbo(this, 473, 297, textureX, textureY); // Import
        defaultScopeModel[24] = new ModelRendererTurbo(this, 353, 329, textureX, textureY); // Import
        defaultScopeModel[25] = new ModelRendererTurbo(this, 369, 329, textureX, textureY); // Import
        defaultScopeModel[26] = new ModelRendererTurbo(this, 385, 329, textureX, textureY); // Import
        defaultScopeModel[27] = new ModelRendererTurbo(this, 401, 329, textureX, textureY); // Import
        defaultScopeModel[28] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Import
        defaultScopeModel[29] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Import
        defaultScopeModel[30] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Import
        defaultScopeModel[31] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Import
        defaultScopeModel[32] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Import
        defaultScopeModel[33] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Import
        defaultScopeModel[34] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Import

        defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[0].setRotationPoint(-2F, -66F, -4F);

        defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[1].setRotationPoint(-2F, -65F, -4F);

        defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[2].setRotationPoint(-2F, -65F, 3F);

        defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        defaultScopeModel[3].setRotationPoint(-2F, -68F, -4F);

        defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[4].setRotationPoint(-2F, -68F, 2F);

        defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[5].setRotationPoint(-2F, -68F, -2.5F);

        defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[6].setRotationPoint(-2F, -67F, -2.5F);

        defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[7].setRotationPoint(-2F, -69F, -2.5F);

        defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[8].setRotationPoint(116.5F, -73F, -0.5F);

        defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[9].setRotationPoint(-1F, -75.5F, -0.5F);

        defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[10].setRotationPoint(-2F, -71F, -2.5F);

        defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[11].setRotationPoint(-1F, -73.5F, -2.5F);

        defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[12].setRotationPoint(-1F, -73.5F, 1.5F);

        defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[13].setRotationPoint(-2F, -71.5F, -2.5F);

        defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[14].setRotationPoint(115F, -65F, -4F);

        defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[15].setRotationPoint(115F, -66F, -4F);

        defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[16].setRotationPoint(115F, -68F, -4F);

        defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[17].setRotationPoint(115F, -68F, 2F);

        defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[18].setRotationPoint(115F, -65F, 3F);

        defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[19].setRotationPoint(115F, -70F, -2F);

        defaultScopeModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[20].setRotationPoint(115F, -69F, -2F);

        defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[21].setRotationPoint(115F, -68F, -2F);

        defaultScopeModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[22].setRotationPoint(115F, -71F, -2F);

        defaultScopeModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[23].setRotationPoint(0.5F, -66F, -7F);

        defaultScopeModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[24].setRotationPoint(0.5F, -65F, -6.5F);

        defaultScopeModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[25].setRotationPoint(0.5F, -64F, -7F);

        defaultScopeModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[26].setRotationPoint(117.5F, -64F, -7F);

        defaultScopeModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[27].setRotationPoint(117.5F, -65F, -6.5F);

        defaultScopeModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[28].setRotationPoint(117.5F, -66F, -7F);

        defaultScopeModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        defaultScopeModel[29].setRotationPoint(-1F, -75.5F, -2.5F);

        defaultScopeModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        defaultScopeModel[30].setRotationPoint(-1F, -75.5F, 0.5F);

        defaultScopeModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[31].setRotationPoint(-1F, -72.5F, 1.5F);

        defaultScopeModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        defaultScopeModel[32].setRotationPoint(-1F, -72.5F, -2.5F);

        defaultScopeModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, -0.6F, -0.2F, 0.0F, -0.6F, -0.2F); // Import
        defaultScopeModel[33].setRotationPoint(-1.01F, -73.5F, 1.6F);

        defaultScopeModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, -0.6F, -0.2F, 0.0F, -0.6F, -0.2F); // Import
        defaultScopeModel[34].setRotationPoint(-1.01F, -73.5F, -2.4F);


        defaultStockModel = new ModelRendererTurbo[93];
        defaultStockModel[0] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Import
        defaultStockModel[1] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import
        defaultStockModel[2] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Import
        defaultStockModel[3] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import
        defaultStockModel[4] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Import
        defaultStockModel[5] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import
        defaultStockModel[6] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Import
        defaultStockModel[7] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import
        defaultStockModel[8] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Import
        defaultStockModel[9] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Import
        defaultStockModel[10] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Import
        defaultStockModel[11] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Import
        defaultStockModel[12] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import
        defaultStockModel[13] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Import
        defaultStockModel[14] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Import
        defaultStockModel[15] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Import
        defaultStockModel[16] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Import
        defaultStockModel[17] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import
        defaultStockModel[18] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Import
        defaultStockModel[19] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Import
        defaultStockModel[20] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Import
        defaultStockModel[21] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Import
        defaultStockModel[22] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Import
        defaultStockModel[23] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Import
        defaultStockModel[24] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Import
        defaultStockModel[25] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import
        defaultStockModel[26] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import
        defaultStockModel[27] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Import
        defaultStockModel[28] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Import
        defaultStockModel[29] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Import
        defaultStockModel[30] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Import
        defaultStockModel[31] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import
        defaultStockModel[32] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Import
        defaultStockModel[33] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Import
        defaultStockModel[34] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Import
        defaultStockModel[35] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import
        defaultStockModel[36] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Import
        defaultStockModel[37] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import
        defaultStockModel[38] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Import
        defaultStockModel[39] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Import
        defaultStockModel[40] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Import
        defaultStockModel[41] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Import
        defaultStockModel[42] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import
        defaultStockModel[43] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import
        defaultStockModel[44] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Import
        defaultStockModel[45] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Import
        defaultStockModel[46] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Import
        defaultStockModel[47] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Import
        defaultStockModel[48] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Import
        defaultStockModel[49] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Import
        defaultStockModel[50] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Import
        defaultStockModel[51] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import
        defaultStockModel[52] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Import
        defaultStockModel[53] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Import
        defaultStockModel[54] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Import
        defaultStockModel[55] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Import
        defaultStockModel[56] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Import
        defaultStockModel[57] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Import
        defaultStockModel[58] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Import
        defaultStockModel[59] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Import
        defaultStockModel[60] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Import
        defaultStockModel[61] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Import
        defaultStockModel[62] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Import
        defaultStockModel[63] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Import
        defaultStockModel[64] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Import
        defaultStockModel[65] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import
        defaultStockModel[66] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Import
        defaultStockModel[67] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Import
        defaultStockModel[68] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Import
        defaultStockModel[69] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Import
        defaultStockModel[70] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Import
        defaultStockModel[71] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Import
        defaultStockModel[72] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Import
        defaultStockModel[73] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import
        defaultStockModel[74] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import
        defaultStockModel[75] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Import
        defaultStockModel[76] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Import
        defaultStockModel[77] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Import
        defaultStockModel[78] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Import
        defaultStockModel[79] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import
        defaultStockModel[80] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Import
        defaultStockModel[81] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Import
        defaultStockModel[82] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Import
        defaultStockModel[83] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Import
        defaultStockModel[84] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Import
        defaultStockModel[85] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import
        defaultStockModel[86] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import
        defaultStockModel[87] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import
        defaultStockModel[88] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import
        defaultStockModel[89] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import
        defaultStockModel[90] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import
        defaultStockModel[91] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import
        defaultStockModel[92] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import

        defaultStockModel[0].addShapeBox(0F, 0F, 0F, 55, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[0].setRotationPoint(-90F, -50F, -3F);

        defaultStockModel[1].addShapeBox(0F, 0F, 0F, 55, 2, 6, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[1].setRotationPoint(-90F, -52F, -3F);

        defaultStockModel[2].addShapeBox(0F, 0F, 0F, 55, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        defaultStockModel[2].setRotationPoint(-90F, -48F, -3F);

        defaultStockModel[3].addShapeBox(0F, 0F, 0F, 56, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        defaultStockModel[3].setRotationPoint(-93F, -53F, -2F);

        defaultStockModel[4].addShapeBox(0F, 0F, 0F, 49, 4, 1, 0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F); // Import
        defaultStockModel[4].setRotationPoint(-93F, -51F, 3F);

        defaultStockModel[5].addShapeBox(0F, 0F, 0F, 49, 4, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        defaultStockModel[5].setRotationPoint(-93F, -51F, -4F);

        defaultStockModel[6].addShapeBox(0F, 0F, 0F, 56, 3, 3, 0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        defaultStockModel[6].setRotationPoint(-93F, -53F, 1F);

        defaultStockModel[7].addShapeBox(0F, 0F, 0F, 56, 3, 3, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        defaultStockModel[7].setRotationPoint(-93F, -53F, -4F);

        defaultStockModel[8].addShapeBox(0F, 0F, 0F, 48, 2, 3, 0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[8].setRotationPoint(-93F, -47F, 3F);

        defaultStockModel[9].addShapeBox(0F, 0F, 0F, 48, 2, 3, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F); // Import
        defaultStockModel[9].setRotationPoint(-93F, -47F, -6F);

        defaultStockModel[10].addShapeBox(0F, 0F, 0F, 48, 1, 12, 0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[10].setRotationPoint(-93F, -46F, -6F);

        defaultStockModel[11].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 2.0F); // Import
        defaultStockModel[11].setRotationPoint(-44F, -51F, 3F);

        defaultStockModel[12].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        defaultStockModel[12].setRotationPoint(-45F, -46F, -2F);

        defaultStockModel[13].addShapeBox(0F, 0F, 0F, 8, 6, 3, 0F, -1.0F, -4.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, -1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[13].setRotationPoint(-45F, -51F, -6F);

        defaultStockModel[14].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        defaultStockModel[14].setRotationPoint(-44F, -50F, 3F);

        defaultStockModel[15].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[15].setRotationPoint(-45F, -48F, 1F);

        defaultStockModel[16].addShapeBox(0F, 0F, 0F, 48, 2, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        defaultStockModel[16].setRotationPoint(-93F, -45F, -6F);

        defaultStockModel[17].addShapeBox(0F, 0F, 0F, 8, 2, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        defaultStockModel[17].setRotationPoint(-45F, -45F, -6F);

        defaultStockModel[18].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F); // Import
        defaultStockModel[18].setRotationPoint(-45F, -41F, -2F);

        defaultStockModel[19].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[19].setRotationPoint(-45F, -43F, -2F);

        defaultStockModel[20].addShapeBox(0F, 0F, 0F, 16, 3, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[20].setRotationPoint(-78F, -43F, -2F);

        defaultStockModel[21].addShapeBox(0F, 0F, 0F, 13, 11, 4, 0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[21].setRotationPoint(-58F, -43F, -2F);

        defaultStockModel[22].addShapeBox(0F, 0F, 0F, 23, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 17.0F, 0.0F, 0.0F, 17.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -17.0F, 0.0F, 0.0F, -17.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[22].setRotationPoint(-83F, -20F, -2F);

        defaultStockModel[23].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F); // Import
        defaultStockModel[23].setRotationPoint(-86F, -43F, -2F);

        defaultStockModel[24].addShapeBox(0F, 0F, 0F, 1, 23, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        defaultStockModel[24].setRotationPoint(-87F, -43F, -2F);

        defaultStockModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        defaultStockModel[25].setRotationPoint(-86F, -20F, -2F);

        defaultStockModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        defaultStockModel[26].setRotationPoint(-61F, -40F, -2F);

        defaultStockModel[27].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[27].setRotationPoint(-64F, -43F, 2F);

        defaultStockModel[28].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F); // Import
        defaultStockModel[28].setRotationPoint(-72F, -43F, 2F);

        defaultStockModel[29].addShapeBox(0F, 0F, 0F, 7, 3, 2, 0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[29].setRotationPoint(-79F, -39F, -1F);

        defaultStockModel[30].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[30].setRotationPoint(-64F, -43F, -3F);

        defaultStockModel[31].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F); // Import
        defaultStockModel[31].setRotationPoint(-72F, -43F, -3F);

        defaultStockModel[32].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, -2.0F, 0.0F, -2.0F, 0.0F, 2.0F, -2.0F, 0.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        defaultStockModel[32].setRotationPoint(-79F, -38F, 1F);

        defaultStockModel[33].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, -2.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 2.0F, -2.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        defaultStockModel[33].setRotationPoint(-79F, -38F, -3F);

        defaultStockModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[34].setRotationPoint(-64.5F, -42F, -3.5F);

        defaultStockModel[35].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[35].setRotationPoint(-62F, -43F, -2F);

        defaultStockModel[36].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[36].setRotationPoint(-60F, -40F, -2F);

        defaultStockModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[37].setRotationPoint(-59F, -38F, -2F);

        defaultStockModel[38].addShapeBox(0F, 0F, 0F, 25, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 17.0F, 0.0F, 0.0F, 17.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -17.0F, 0.0F, 0.0F, -17.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[38].setRotationPoint(-83F, -16F, -2F);

        defaultStockModel[39].addShapeBox(0F, 0F, 0F, 6, 11, 4, 0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -11.0F, 0.0F, 1.0F, -11.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[39].setRotationPoint(-58F, -43F, -2F);

        defaultStockModel[40].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[40].setRotationPoint(-58F, -43F, -2F);

        defaultStockModel[41].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[41].setRotationPoint(-55F, -43F, -2F);

        defaultStockModel[42].addShapeBox(0F, 0F, 0F, 3, 5, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[42].setRotationPoint(-86F, -16F, -2F);

        defaultStockModel[43].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[43].setRotationPoint(-91F, -16F, -2F);

        defaultStockModel[44].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[44].setRotationPoint(-91F, -13F, -2F);

        defaultStockModel[45].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F); // Import
        defaultStockModel[45].setRotationPoint(-97F, -53F, -2F);

        defaultStockModel[46].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F); // Import
        defaultStockModel[46].setRotationPoint(-97F, -51F, -4F);

        defaultStockModel[47].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[47].setRotationPoint(-97F, -47F, -6F);

        defaultStockModel[48].addShapeBox(0F, 0F, 0F, 4, 28, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, 2.0F, 0.0F, -2.0F, 2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F); // Import
        defaultStockModel[48].setRotationPoint(-97F, -45F, -6F);

        defaultStockModel[49].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[49].setRotationPoint(-95F, -17F, -4F);

        defaultStockModel[50].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F); // Import
        defaultStockModel[50].setRotationPoint(-98F, -14F, -4F);

        defaultStockModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        defaultStockModel[51].setRotationPoint(-100F, -53F, -2F);

        defaultStockModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[52].setRotationPoint(-100F, -50F, -4F);

        defaultStockModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[53].setRotationPoint(-100F, -47F, -5F);

        defaultStockModel[54].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[54].setRotationPoint(-100F, -44F, -5F);

        defaultStockModel[55].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[55].setRotationPoint(-100F, -41F, -5F);

        defaultStockModel[56].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[56].setRotationPoint(-100F, -38F, -4.5F);

        defaultStockModel[57].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[57].setRotationPoint(-99F, -35F, -4.5F);

        defaultStockModel[58].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[58].setRotationPoint(-99F, -32F, -4.5F);

        defaultStockModel[59].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[59].setRotationPoint(-99F, -29F, -4F);

        defaultStockModel[60].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[60].setRotationPoint(-98F, -26F, -4F);

        defaultStockModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[61].setRotationPoint(-98F, -23F, -4F);

        defaultStockModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[62].setRotationPoint(-98F, -20F, -4F);

        defaultStockModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[63].setRotationPoint(-97F, -17F, -4F);

        defaultStockModel[64].addShapeBox(0F, 0F, 0F, 1, 28, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, -2.0F, 3.0F, 0.0F, -2.0F, 3.0F, 0.0F, -2.0F, -3.0F, 0.0F, -2.0F); // Import
        defaultStockModel[64].setRotationPoint(-101F, -45F, -6F);

        defaultStockModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F); // Import
        defaultStockModel[65].setRotationPoint(-101F, -53F, -2F);

        defaultStockModel[66].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F); // Import
        defaultStockModel[66].setRotationPoint(-101F, -51F, -4F);

        defaultStockModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[67].setRotationPoint(-101F, -47F, -6F);

        defaultStockModel[68].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[68].setRotationPoint(-98F, -17F, -4F);

        defaultStockModel[69].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[69].setRotationPoint(-93F, -43F, -0.5F);

        defaultStockModel[70].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[70].setRotationPoint(-93F, -35F, -0.5F);

        defaultStockModel[71].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[71].setRotationPoint(-88F, -35F, -0.5F);

        defaultStockModel[72].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[72].setRotationPoint(-92F, -24F, -0.5F);

        defaultStockModel[73].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[73].setRotationPoint(-87F, -21F, -0.5F);

        defaultStockModel[74].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[74].setRotationPoint(-83F, -20F, -0.5F);

        defaultStockModel[75].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F, 2.0F, -3.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 2.0F, -3.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 2.0F, 0.0F); // Import
        defaultStockModel[75].setRotationPoint(-68F, -32F, -0.5F);

        defaultStockModel[76].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[76].setRotationPoint(-80F, -19F, -0.5F);

        defaultStockModel[77].addShapeBox(0F, 0F, 0F, 13, 2, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, 2.0F, -9.0F, -1.0F, 2.0F, -9.0F, -1.0F, -2.0F, 0.0F, -1.0F); // Import
        defaultStockModel[77].setRotationPoint(-58F, -32F, -2F);

        defaultStockModel[78].addShapeBox(0F, 0F, 0F, 25, 2, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 17.0F, 0.0F, 0.0F, 17.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, 2.0F, -17.0F, -1.0F, 2.0F, -17.0F, -1.0F, -2.0F, 0.0F, -1.0F); // Import
        defaultStockModel[78].setRotationPoint(-83F, -15F, -2F);

        defaultStockModel[79].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F, -1.0F, 2.0F, -4.0F, -1.0F, 2.0F, -4.0F, -1.0F, -2.0F, -1.0F, -1.0F); // Import
        defaultStockModel[79].setRotationPoint(-86F, -11F, -2F);

        defaultStockModel[80].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F); // Import
        defaultStockModel[80].setRotationPoint(-96F, -11F, -2F);

        defaultStockModel[81].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        defaultStockModel[81].setRotationPoint(-44F, -51F, -4F);

        defaultStockModel[82].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0.0F, -2.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 4.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[82].setRotationPoint(-44F, -50F, -4F);

        defaultStockModel[83].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        defaultStockModel[83].setRotationPoint(-45F, -48F, -3F);

        defaultStockModel[84].addShapeBox(0F, 0F, 0F, 8, 6, 3, 0F, -1.0F, -3.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, -1.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[84].setRotationPoint(-45F, -51F, 3F);

        defaultStockModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        defaultStockModel[85].setRotationPoint(-88.5F, -35F, -0.5F);

        defaultStockModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        defaultStockModel[86].setRotationPoint(-90.5F, -35F, -0.5F);

        defaultStockModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[87].setRotationPoint(-90.5F, -25F, -0.5F);

        defaultStockModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[88].setRotationPoint(-88.5F, -25F, -0.5F);

        defaultStockModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[89].setRotationPoint(-69.5F, -27F, -0.5F);
        defaultStockModel[89].rotateAngleZ = 0.5934119F;

        defaultStockModel[90].addShapeBox(0F, -2F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        defaultStockModel[90].setRotationPoint(-69.5F, -27F, -0.5F);
        defaultStockModel[90].rotateAngleZ = 0.5934119F;

        defaultStockModel[91].addShapeBox(-12F, 0F, 0F, 1, 1, 1, 0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[91].setRotationPoint(-69.5F, -27F, -0.5F);
        defaultStockModel[91].rotateAngleZ = 0.5934119F;

        defaultStockModel[92].addShapeBox(-12F, -1F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        defaultStockModel[92].setRotationPoint(-69.5F, -27F, -0.5F);
        defaultStockModel[92].rotateAngleZ = 0.5934119F;


        ammoModel = new ModelRendererTurbo[8];
        ammoModel[0] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Import Import
        ammoModel[1] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Import Import
        ammoModel[2] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Import Import
        ammoModel[3] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import Import
        ammoModel[4] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Import Import
        ammoModel[5] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Import Import
        ammoModel[6] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Import Import
        ammoModel[7] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Import Import

        ammoModel[0].addShapeBox(0F, 0F, 0F, 3, 28, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        ammoModel[0].setRotationPoint(29F, -43F, -3.5F);

        ammoModel[1].addShapeBox(0F, 0F, 0F, 22, 28, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 7F, 0.0F); // Import Import
        ammoModel[1].setRotationPoint(30F, -43F, -2.5F);

        ammoModel[2].addShapeBox(0F, 0F, 0F, 12, 28, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        ammoModel[2].setRotationPoint(34F, -43F, -3.5F);

        ammoModel[3].addShapeBox(0F, 0F, 0F, 4, 28, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        ammoModel[3].setRotationPoint(49F, -43F, -3.5F);

        ammoModel[4].addShapeBox(-12F, 0F, -3.5F, 3, 10, 7, 0F, -0.8F, 6.1F, 0.0F, 0.72F, 5.4F, 0.0F, 0.72F, 5.4F, 0.0F, -0.8F, 6.1F, 0.0F, 0.0F, 2F, 0.0F, 0.0F, 2F, 0.0F, 0.0F, 2F, 0.0F, 0.0F, 2F, 0.0F); // Import Import
        ammoModel[4].setRotationPoint(41.4F, -12F, 0F);
        ammoModel[4].rotateAngleZ = 0.26179939F;

        ammoModel[5].addShapeBox(-11F, 0F, -2.5F, 22, 10, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2F, 0.0F, 0.0F, 2F, 0.0F, 0.0F, 2F, 0.0F, 0.0F, 2F, 0.0F); // Import Import
        ammoModel[5].setRotationPoint(41.4F, -12F, 0F);
        ammoModel[5].rotateAngleZ = 0.26179939F;

        ammoModel[6].addShapeBox(-7F, 0F, -3.5F, 12, 10, 7, 0F, -0.62F, 4.81F, 0.0F, 0.25F, 2F, 0.0F, 0.25F, 2F, 0.0F, -0.62F, 4.81F, 0.0F, 0.0F, 2F, 0.0F, 0.0F, 2F, 0.0F, 0.0F, 2F, 0.0F, 0.0F, 2F, 0.0F); // Import Import
        ammoModel[6].setRotationPoint(41.4F, -12F, 0F);
        ammoModel[6].rotateAngleZ = 0.26179939F;

        ammoModel[7].addShapeBox(8F, 0F, -3.5F, 4, 10, 7, 0F, -0.13F, 0.94F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.13F, 0.94F, 0.0F, 0.0F, 2F, 0.0F, 0.0F, 2F, 0.0F, 0.0F, 2F, 0.0F, 0.0F, 2F, 0.0F); // Import Import
        ammoModel[7].setRotationPoint(41.4F, -12F, 0F);
        ammoModel[7].rotateAngleZ = 0.26179939F;


        slideModel = new ModelRendererTurbo[4];
        slideModel[0] = new ModelRendererTurbo(this, 433, 281, textureX, textureY); // Import Import
        slideModel[1] = new ModelRendererTurbo(this, 337, 257, textureX, textureY); // Import Import
        slideModel[2] = new ModelRendererTurbo(this, 289, 265, textureX, textureY); // Import Import
        slideModel[3] = new ModelRendererTurbo(this, 305, 265, textureX, textureY); // Import Import

        slideModel[0].addShapeBox(0F, 0F, 0F, 27, 7, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        slideModel[0].setRotationPoint(28F, -53F, -4.5F);

        slideModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        slideModel[1].setRotationPoint(51F, -51F, -14F);

        slideModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        slideModel[2].setRotationPoint(51F, -52F, -14F);

        slideModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Import
        slideModel[3].setRotationPoint(51F, -49F, -14F);


        barrelAttachPoint = new Vector3f(203F / 16F, 47F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(117F / 16F, 40.5F / 16F, -7F / 16F);
        scopeAttachPoint = new Vector3f(15F / 16F, 57F / 16F, 0F / 16F);
        gripAttachPoint = new Vector3f(115 / 16F, 31F / 16F, 0F / 16F);

        gunSlideDistance = 1.4F;

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
        leftHandAmmo = true;

        translateAll(0F, 8F, 0F);
        ShakeDistance = 0.8F;


        //修正模型位移
        Vector3f vec3 = new Vector3f(10F, 5F, 0F);
        translateAll(vec3.x, -vec3.y, vec3.z);
        Vector3f attVec = new Vector3f(vec3.x / 16F, vec3.y / 16F, vec3.z / 16F);
        barrelAttachPoint = Vector3f.add(barrelAttachPoint, attVec, null);
        gadgetAttachPoint = Vector3f.add(gadgetAttachPoint, attVec, null);
        scopeAttachPoint = Vector3f.add(scopeAttachPoint, attVec, null);
        gripAttachPoint = Vector3f.add(gripAttachPoint, attVec, null);

        zoomOffsetY = -0.035F;
        crouchZoom = -0.05F;
        zoomOffset = 0.3F;
        gunOffset = -0.18F;

        flipAll();

        hasFlash = true;
        flashScale = 5F;
        muzzleFlashPoint = new Vector3f(
                barrelAttachPoint.x / flashScale,
                barrelAttachPoint.y / flashScale,
                barrelAttachPoint.z / flashScale
        );
    }
}