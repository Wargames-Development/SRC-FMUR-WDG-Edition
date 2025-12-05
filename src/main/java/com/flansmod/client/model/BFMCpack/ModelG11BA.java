//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: G11
// Model Creator: 
// Created on: 08.07.2023 - 11:25:22
// Last changed on: 08.07.2023 - 11:25:22

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelG11BA extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelG11BA() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[261];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import 
		gunModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import 
		gunModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import 
		gunModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import 
		gunModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import 
		gunModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import 
		gunModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import 
		gunModel[8] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import 
		gunModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import 
		gunModel[10] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import 
		gunModel[11] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import 
		gunModel[12] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import 
		gunModel[13] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import 
		gunModel[14] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import 
		gunModel[15] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import 
		gunModel[16] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import 
		gunModel[17] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import 
		gunModel[18] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import 
		gunModel[19] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import 
		gunModel[20] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Import 
		gunModel[21] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import 
		gunModel[22] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import 
		gunModel[23] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Import 
		gunModel[24] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Import 
		gunModel[25] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Import 
		gunModel[26] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Import 
		gunModel[27] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Import 
		gunModel[28] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Import 
		gunModel[29] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import 
		gunModel[30] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import 
		gunModel[31] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Import 
		gunModel[32] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Import 
		gunModel[33] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Import 
		gunModel[34] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Import 
		gunModel[35] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Import 
		gunModel[36] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Import 
		gunModel[37] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import 
		gunModel[38] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import 
		gunModel[39] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import 
		gunModel[40] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import 
		gunModel[41] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Import 
		gunModel[42] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Import 
		gunModel[43] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Import 
		gunModel[44] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Import 
		gunModel[45] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Import 
		gunModel[46] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import 
		gunModel[47] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Import 
		gunModel[48] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import 
		gunModel[49] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import 
		gunModel[50] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import 
		gunModel[51] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import 
		gunModel[52] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import 
		gunModel[53] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Import 
		gunModel[54] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Import 
		gunModel[55] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import 
		gunModel[56] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import 
		gunModel[57] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import 
		gunModel[58] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Import 
		gunModel[59] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import 
		gunModel[60] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Import 
		gunModel[61] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Import 
		gunModel[62] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Import 
		gunModel[63] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Import 
		gunModel[64] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Import 
		gunModel[65] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import 
		gunModel[66] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Import 
		gunModel[67] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Import 
		gunModel[68] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Import 
		gunModel[69] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import 
		gunModel[70] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import 
		gunModel[71] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Import 
		gunModel[72] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Import 
		gunModel[73] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Import 
		gunModel[74] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Import 
		gunModel[75] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Import 
		gunModel[76] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Import 
		gunModel[77] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import 
		gunModel[78] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Import 
		gunModel[79] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Import 
		gunModel[80] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Import 
		gunModel[81] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import 
		gunModel[82] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Import 
		gunModel[83] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Import 
		gunModel[84] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Import 
		gunModel[85] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Import 
		gunModel[86] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Import 
		gunModel[87] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Import 
		gunModel[88] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Import 
		gunModel[89] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Import 
		gunModel[90] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Import 
		gunModel[91] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Import 
		gunModel[92] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Import 
		gunModel[93] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Import 
		gunModel[94] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Import 
		gunModel[95] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Import 
		gunModel[96] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Import 
		gunModel[97] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Import 
		gunModel[98] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Import 
		gunModel[99] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Import 
		gunModel[100] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import 
		gunModel[101] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Import 
		gunModel[102] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Import 
		gunModel[103] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Import 
		gunModel[104] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Import 
		gunModel[105] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Import 
		gunModel[106] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Import 
		gunModel[107] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Import 
		gunModel[108] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Import 
		gunModel[109] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Import 
		gunModel[110] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Import 
		gunModel[111] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Import 
		gunModel[112] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Import 
		gunModel[113] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Import 
		gunModel[114] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Import 
		gunModel[115] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Import 
		gunModel[116] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Import 
		gunModel[117] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Import 
		gunModel[118] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Import 
		gunModel[119] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Import 
		gunModel[120] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Import 
		gunModel[121] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Import 
		gunModel[122] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Import 
		gunModel[123] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Import 
		gunModel[124] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Import 
		gunModel[125] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Import 
		gunModel[126] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import 
		gunModel[127] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Import 
		gunModel[128] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Import 
		gunModel[129] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Import 
		gunModel[130] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Import 
		gunModel[131] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Import 
		gunModel[132] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Import 
		gunModel[133] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Import 
		gunModel[134] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Import 
		gunModel[135] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Import 
		gunModel[136] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Import 
		gunModel[137] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Import 
		gunModel[138] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Import 
		gunModel[139] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Import 
		gunModel[140] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Import 
		gunModel[141] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Import 
		gunModel[142] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Import 
		gunModel[143] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import 
		gunModel[144] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Import 
		gunModel[145] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Import 
		gunModel[146] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Import 
		gunModel[147] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Import 
		gunModel[148] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Import 
		gunModel[149] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Import 
		gunModel[150] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Import 
		gunModel[151] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Import 
		gunModel[152] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Import 
		gunModel[153] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Import 
		gunModel[154] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Import 
		gunModel[155] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Import 
		gunModel[156] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import 
		gunModel[157] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Import 
		gunModel[158] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import 
		gunModel[159] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Import 
		gunModel[160] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Import 
		gunModel[161] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Import 
		gunModel[162] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Import 
		gunModel[163] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Import 
		gunModel[164] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Import 
		gunModel[165] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Import 
		gunModel[166] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Import 
		gunModel[167] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Import 
		gunModel[168] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Import 
		gunModel[169] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Import 
		gunModel[170] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Import 
		gunModel[171] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Import 
		gunModel[172] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Import 
		gunModel[173] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Import 
		gunModel[174] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Import 
		gunModel[175] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Import 
		gunModel[176] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Import 
		gunModel[177] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Import 
		gunModel[178] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Import 
		gunModel[179] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Import 
		gunModel[180] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Import 
		gunModel[181] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import 
		gunModel[182] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Import 
		gunModel[183] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Import 
		gunModel[184] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Import 
		gunModel[185] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Import 
		gunModel[186] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Import 
		gunModel[187] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import 
		gunModel[188] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Import 
		gunModel[189] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Import 
		gunModel[190] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Import 
		gunModel[191] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Import 
		gunModel[192] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Import 
		gunModel[193] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Import 
		gunModel[194] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Import 
		gunModel[195] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 256
		gunModel[196] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 257
		gunModel[197] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 258
		gunModel[198] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 259
		gunModel[199] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 260
		gunModel[200] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 261
		gunModel[201] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 262
		gunModel[202] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 263
		gunModel[203] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 264
		gunModel[204] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 265
		gunModel[205] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 266
		gunModel[206] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 267
		gunModel[207] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 268
		gunModel[208] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 269
		gunModel[209] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 270
		gunModel[210] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 271
		gunModel[211] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 272
		gunModel[212] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 273
		gunModel[213] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 274
		gunModel[214] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 275
		gunModel[215] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 276
		gunModel[216] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 277
		gunModel[217] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 278
		gunModel[218] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 283
		gunModel[219] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 284
		gunModel[220] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 285
		gunModel[221] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 286
		gunModel[222] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 287
		gunModel[223] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 288
		gunModel[224] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 289
		gunModel[225] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 290
		gunModel[226] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 291
		gunModel[227] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 292
		gunModel[228] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 293
		gunModel[229] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 294
		gunModel[230] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 295
		gunModel[231] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 296
		gunModel[232] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 297
		gunModel[233] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 298
		gunModel[234] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 299
		gunModel[235] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 300
		gunModel[236] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 301
		gunModel[237] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 302
		gunModel[238] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 303
		gunModel[239] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 304
		gunModel[240] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 305
		gunModel[241] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 306
		gunModel[242] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 307
		gunModel[243] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 308
		gunModel[244] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 309
		gunModel[245] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 310
		gunModel[246] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 311
		gunModel[247] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 312
		gunModel[248] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 313
		gunModel[249] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 314
		gunModel[250] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 315
		gunModel[251] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 316
		gunModel[252] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 317
		gunModel[253] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 318
		gunModel[254] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 319
		gunModel[255] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 320
		gunModel[256] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 321
		gunModel[257] = new ModelRendererTurbo(this, 169, 87, textureX, textureY); // Box 322
		gunModel[258] = new ModelRendererTurbo(this, 2, 107, textureX, textureY); // Box 323
		gunModel[259] = new ModelRendererTurbo(this, 2, 107, textureX, textureY); // Box 282
		gunModel[260] = new ModelRendererTurbo(this, 41, 147, textureX, textureY); // Box 283

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, 0.1F, -0.4F, -0.15F, 0.1F, -0.4F, -0.15F, 0.1F, -0.3F, -0.45F, 0.1F, -0.4F, -0.45F, 0.1F, -0.3F, -0.75F, 0.1F, -0.3F, -0.75F, 0.1F, -0.4F, -0.45F, 0.1F); // Import 
		gunModel[0].setRotationPoint(-1.2F, -3.35F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, 0.1F, -0.6F, -0.3F, 0.1F, -0.6F, -0.3F, 0.1F, -0.3F, -0.4F, 0.1F, -0.3F, -0.4F, 0.1F, -0.4F, -0.7F, 0.1F, -0.4F, -0.7F, 0.1F, -0.3F, -0.4F, 0.1F); // Import 
		gunModel[1].setRotationPoint(-1.2F, -3.5F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.4F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.4F, 0.1F, -0.5F, -0.6F, 0.1F, -0.45F, -0.65F, 0.1F, -0.45F, -0.65F, 0.1F, -0.5F, -0.6F, 0.1F); // Import 
		gunModel[2].setRotationPoint(-0.9F, -3.05F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F); // Import 
		gunModel[3].setRotationPoint(-1.6F, -3.85F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F); // Import 
		gunModel[4].setRotationPoint(-1.85F, -3.55F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F); // Import 
		gunModel[5].setRotationPoint(-0.6F, -3.15F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F); // Import 
		gunModel[6].setRotationPoint(-0.35F, -3.15F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F); // Import 
		gunModel[7].setRotationPoint(-0.1F, -3.15F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F); // Import 
		gunModel[8].setRotationPoint(-0.85F, -3.85F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F, -0.4F, -0.45F, 0.001F); // Import 
		gunModel[9].setRotationPoint(-0.6F, -3.85F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, -0.25F, 0.1F, -0.15F, -0.6F, 0.1F, -0.15F, -0.6F, 0.1F, -0.7F, -0.25F, 0.1F, -0.4F, -0.45F, 0.1F, -0.25F, -0.3F, 0.1F, -0.25F, -0.3F, 0.1F, -0.4F, -0.45F, 0.1F); // Import 
		gunModel[10].setRotationPoint(-1.2F, -3.35F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, -0.35F, -0.55F, 0.0F, -0.35F, -0.55F, 0.0F, -0.2F, -0.25F, 0.0F, -0.2F, -0.25F, 0.0F, -0.55F, -0.65F, 0.0F, -0.55F, -0.65F, 0.0F, -0.6F, -0.25F, 0.0F, -0.6F, -0.25F); // Import 
		gunModel[11].setRotationPoint(1.7F, -4.55F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, -0.45F, -0.65F, 0.0F, -0.45F, -0.65F, 0.0F, -0.4F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.45F, -0.65F, 0.0F, -0.45F, -0.65F, 0.0F, -0.4F, -0.25F, 0.0F, -0.4F, -0.25F); // Import 
		gunModel[12].setRotationPoint(1.7F, -4.55F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, -0.2F, -0.25F, 0.0F, -0.2F, -0.25F, 0.0F, -0.2F, -0.25F, 0.0F, -0.2F, -0.25F, 0.0F, -0.65F, -0.45F, 0.0F, -0.65F, -0.45F, 0.0F, -0.65F, -0.45F, 0.0F, -0.65F, -0.45F); // Import 
		gunModel[13].setRotationPoint(1.7F, -4.55F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, -0.2F, -0.25F, 0.0F, -0.2F, -0.25F, 0.0F, -0.35F, -0.55F, 0.0F, -0.35F, -0.55F, 0.0F, -0.6F, -0.25F, 0.0F, -0.6F, -0.25F, 0.0F, -0.55F, -0.65F, 0.0F, -0.55F, -0.65F); // Import 
		gunModel[14].setRotationPoint(1.7F, -4.55F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, -0.4F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.45F, -0.65F, 0.0F, -0.45F, -0.65F, 0.0F, -0.4F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.45F, -0.65F, 0.0F, -0.45F, -0.65F); // Import 
		gunModel[15].setRotationPoint(1.7F, -4.55F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, -0.65F, -0.45F, 0.0F, -0.65F, -0.45F, 0.0F, -0.65F, -0.45F, 0.0F, -0.65F, -0.45F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F); // Import 
		gunModel[16].setRotationPoint(1.7F, -4.55F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, -0.6F, -0.25F, 0.0F, -0.6F, -0.25F, 0.0F, -0.55F, -0.65F, 0.0F, -0.55F, -0.65F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.35F, -0.55F, 0.0F, -0.35F, -0.55F); // Import 
		gunModel[17].setRotationPoint(1.7F, -4.55F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, -0.55F, -0.65F, 0.0F, -0.55F, -0.65F, 0.0F, -0.6F, -0.25F, 0.0F, -0.6F, -0.25F, 0.0F, -0.35F, -0.55F, 0.0F, -0.35F, -0.55F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F); // Import 
		gunModel[18].setRotationPoint(1.7F, -4.55F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, 0.0F, -0.6F, 0.1F, 0.0F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import 
		gunModel[19].setRotationPoint(-2F, -5.8F, -0.25F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import 
		gunModel[20].setRotationPoint(-2F, -6.2F, -0.25F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import 
		gunModel[21].setRotationPoint(-1.2F, -6.2F, -0.25F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import 
		gunModel[22].setRotationPoint(-0.4F, -6.2F, -0.25F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import 
		gunModel[23].setRotationPoint(-1.6F, -6.2F, -0.25F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import 
		gunModel[24].setRotationPoint(-0.8F, -6.2F, -0.25F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import 
		gunModel[25].setRotationPoint(1.6F, -6.2F, -0.25F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import 
		gunModel[26].setRotationPoint(1.2F, -6.2F, -0.25F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import 
		gunModel[27].setRotationPoint(0.8F, -6.2F, -0.25F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import 
		gunModel[28].setRotationPoint(0.4F, -6.2F, -0.25F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import 
		gunModel[29].setRotationPoint(0F, -6.2F, -0.25F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import 
		gunModel[30].setRotationPoint(2.8F, -6.2F, -0.25F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import 
		gunModel[31].setRotationPoint(2.4F, -6.2F, -0.25F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import 
		gunModel[32].setRotationPoint(2F, -6.2F, -0.25F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F, -0.5F, -0.15F, -0.2F, -0.5F, -0.15F, -0.2F, -0.5F, -0.15F, -0.2F, -0.5F, -0.15F); // Import 
		gunModel[33].setRotationPoint(-2.2F, -5.8F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.4F, -0.15F, -0.1F, -0.4F, -0.15F, -0.1F, -0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F, -0.5F, -0.15F, -0.2F, -0.5F, -0.15F, -0.2F, -0.5F, -0.15F, -0.2F, -0.5F, -0.15F); // Import 
		gunModel[34].setRotationPoint(0.9F, -5.8F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, -0.25F, 0.3F, 0.0F, -0.25F, 0.3F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.2F, -0.25F, 0.3F, -0.2F, -0.25F, 0.3F, -0.2F, -0.25F, 0.0F, -0.2F, -0.25F); // Import 
		gunModel[35].setRotationPoint(-1.3F, -3.2F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.2F, -0.25F, 0.3F, 0.2F, -0.25F, 0.3F, 0.2F, -0.25F, 0.0F, 0.2F, -0.25F, 1.0F, -0.2F, -0.25F, -0.6F, 0.0F, -0.25F, -0.6F, 0.0F, -0.25F, 1.0F, -0.2F, -0.25F); // Import 
		gunModel[36].setRotationPoint(-1.3F, -2.2F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.2F, -0.25F, 0.4F, 0.0F, -0.25F, 0.4F, 0.0F, -0.25F, 0.0F, 0.2F, -0.25F, -1.2F, -0.6F, -0.25F, 0.4F, -0.7F, -0.25F, 0.4F, -0.7F, -0.25F, -1.2F, -0.6F, -0.25F); // Import 
		gunModel[37].setRotationPoint(-2.3F, -0.2F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, -0.4F, 0.3F, 0.0F, -0.4F, 0.1F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, 0.0F, -0.2F, -0.4F, 0.3F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F); // Import 
		gunModel[38].setRotationPoint(-1.3F, -3.2F, -0.15F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, 1.0F, -0.2F, -0.4F, -0.6F, 0.0F, -0.4F, -0.75F, -0.1F, -0.4F, 0.8F, -0.15F, -0.4F); // Import 
		gunModel[39].setRotationPoint(-1.3F, -2.2F, -0.15F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.2F, -0.4F, 0.4F, 0.0F, -0.4F, 0.25F, 0.1F, -0.4F, -0.2F, 0.15F, -0.4F, -1.2F, -0.6F, -0.4F, 0.4F, -0.7F, -0.4F, 0.25F, -0.8F, -0.4F, -1.1F, -0.7F, -0.4F); // Import 
		gunModel[40].setRotationPoint(-2.3F, -0.2F, -0.15F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0.0F, -0.4F, 0.1F, 0.0F, -0.4F, 0.3F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, -0.2F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.3F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F); // Import 
		gunModel[41].setRotationPoint(-1.3F, -3.2F, -0.85F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.3F, 0.2F, -0.4F, 0.0F, 0.2F, -0.4F, 0.8F, -0.15F, -0.4F, -0.75F, -0.1F, -0.4F, -0.6F, 0.0F, -0.4F, 1.0F, -0.2F, -0.4F); // Import 
		gunModel[42].setRotationPoint(-1.3F, -2.2F, -0.85F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0.15F, -0.4F, 0.25F, 0.1F, -0.4F, 0.4F, 0.0F, -0.4F, 0.0F, 0.2F, -0.4F, -1.1F, -0.7F, -0.4F, 0.25F, -0.8F, -0.4F, 0.4F, -0.7F, -0.4F, -1.2F, -0.6F, -0.4F); // Import 
		gunModel[43].setRotationPoint(-2.3F, -0.2F, -0.85F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.2F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.2F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F); // Import 
		gunModel[44].setRotationPoint(-1.3F, -3.15F, -0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.2F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F); // Import 
		gunModel[45].setRotationPoint(-2.2F, -4.75F, -0.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.5F, 0.05F, 0.0F, -0.5F, 0.05F, 0.0F, -0.5F, 0.05F, -0.1F, -0.5F, 0.05F, -0.1F, -0.4F, 0.05F, -0.1F, -0.4F, 0.05F, -0.1F, -0.4F, 0.05F, -0.1F, -0.4F, 0.05F); // Import 
		gunModel[46].setRotationPoint(0.7F, -3.15F, -0.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.1F, 0.05F, 0.0F, -0.1F, 0.05F, 0.0F, -0.1F, 0.05F, -0.1F, -0.1F, 0.05F, -0.1F, 0.0F, 0.05F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.05F, -0.1F, 0.0F, 0.05F); // Import 
		gunModel[47].setRotationPoint(0.7F, -3.65F, -0.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.3F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.3F, -0.1F, 0.0F, -0.3F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.3F, -0.1F, 0.0F); // Import 
		gunModel[48].setRotationPoint(-2.3F, -3.65F, -0.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.2F, -0.35F, -0.01F, -0.1F, -0.35F, -0.01F, -0.1F, -0.35F, -0.01F, -0.2F, -0.35F, -0.01F, -0.2F, -0.3F, 0.2F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F, 0.2F, -0.2F, -0.3F, 0.2F); // Import 
		gunModel[49].setRotationPoint(-2.2F, -5.65F, -0.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, 0.2F, -0.15F, -0.3F, 0.2F, -0.15F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.5F, 0.2F, -0.4F, -0.5F, 0.2F, -0.4F, -0.5F, 0.2F, -0.3F, -0.5F, 0.2F); // Import 
		gunModel[50].setRotationPoint(-2.3F, -3.85F, -0.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.25F, 0.2F, -0.5F, -0.25F, 0.2F, -0.5F, -0.25F, 0.2F, -0.3F, -0.25F, 0.2F); // Import 
		gunModel[51].setRotationPoint(-2.3F, -3.65F, -0.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, 0.2F, -0.5F, -0.45F, 0.2F, -0.5F, -0.45F, 0.2F, -0.3F, -0.45F, 0.2F, -0.3F, -0.4F, 0.1F, -0.5F, -0.4F, 0.1F, -0.5F, -0.4F, 0.1F, -0.3F, -0.4F, 0.1F); // Import 
		gunModel[52].setRotationPoint(-2.3F, -3.35F, -0.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.15F, -0.3F, 0.2F, -0.4F, -0.5F, 0.2F, -0.3F, -0.5F, 0.2F, -0.3F, -0.5F, 0.2F, -0.4F, -0.5F, 0.2F); // Import 
		gunModel[53].setRotationPoint(1F, -3.85F, -0.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.5F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.5F, -0.3F, 0.2F); // Import 
		gunModel[54].setRotationPoint(1F, -3.75F, -0.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0.2F, -0.3F, -0.5F, 0.2F, -0.3F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.4F, 0.1F, -0.3F, -0.4F, 0.1F, -0.3F, -0.4F, 0.1F, -0.5F, -0.4F, 0.1F); // Import 
		gunModel[55].setRotationPoint(1F, -3.55F, -0.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.2F, -0.1F, -0.02F, -0.2F, -0.1F, -0.02F, -0.2F, -0.1F, 0.0F, -0.2F, -0.1F, 0.0F, -0.3F, 0.2F, -0.02F, -0.3F, 0.2F, -0.02F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F); // Import 
		gunModel[56].setRotationPoint(-4F, -5.65F, -0.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.2F, -0.02F, 0.0F, 0.2F, -0.02F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.05F, 0.2F, -0.02F, 0.05F, 0.2F, -0.02F, 0.05F, 0.2F, 0.0F, 0.05F, 0.2F); // Import 
		gunModel[57].setRotationPoint(-4F, -4.95F, -0.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.3F, -0.45F, 0.2F, -0.02F, -0.45F, 0.2F, -0.02F, -0.45F, 0.2F, -0.3F, -0.45F, 0.2F, -0.3F, -0.4F, 0.1F, -0.02F, -0.4F, 0.1F, -0.02F, -0.4F, 0.1F, -0.3F, -0.4F, 0.1F); // Import 
		gunModel[58].setRotationPoint(-4F, -3.35F, -0.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.05F, -0.4F, -0.4F, -0.05F, -0.4F, -0.4F, -0.05F, -0.4F, -0.4F, -0.05F, -0.4F, -0.3F, 0.15F, -0.4F, -0.3F, 0.15F, -0.4F, -0.3F, 0.15F, -0.4F, -0.3F, 0.15F); // Import 
		gunModel[59].setRotationPoint(-2.5F, -5.65F, -0.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.4F, 0.0F, 0.15F, -0.4F, 0.0F, 0.15F, -0.4F, 0.0F, 0.15F, -0.4F, 0.0F, 0.15F, -0.4F, 0.05F, 0.15F, -0.4F, 0.05F, 0.15F, -0.4F, 0.05F, 0.15F, -0.4F, 0.05F, 0.15F); // Import 
		gunModel[60].setRotationPoint(-2.5F, -4.95F, -0.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.15F, -0.4F, -0.45F, 0.15F, -0.4F, -0.45F, 0.15F, -0.4F, -0.45F, 0.15F, -0.4F, -0.45F, 0.1F, -0.4F, -0.45F, 0.1F, -0.4F, -0.45F, 0.1F, -0.4F, -0.45F, 0.1F); // Import 
		gunModel[61].setRotationPoint(-2.5F, -3.35F, -0.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.4F, -0.3F, 0.0F, -0.2F, -0.1F, 0.0F, -0.2F, -0.1F, 0.0F, -0.4F, -0.3F, 0.0F, -0.2F, 0F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.2F, 0F); // Import 
		gunModel[62].setRotationPoint(-5F, -5.65F, -0.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, -0.1F, 0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, -0.1F, 0F, 0.0F, 0.05F, 0F, 0.0F, 0.05F, 0.2F, 0.0F, 0.05F, 0.2F, 0.0F, 0.05F, 0F); // Import 
		gunModel[63].setRotationPoint(-5F, -4.95F, -0.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0.0F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, 0.0F, -0.1F, 0F, 0.0F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, 0.0F, 0.05F, 0F); // Import 
		gunModel[64].setRotationPoint(-8.7F, -4.95F, -0.5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.3F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.2F, 0F, 0.0F, -0.2F, 0F, 0.0F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Import 
		gunModel[65].setRotationPoint(-9F, -5.65F, -0.5F);

		gunModel[66].addShapeBox(1F, 0F, 0F, 3, 1, 1, 0F, 0.5F, -0.45F, 0.1F, -0.1F, -0.45F, 0.1F, -0.1F, -0.45F, 0.1F, 0.5F, -0.45F, 0.1F, 0.5F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, 0.5F, -0.4F, 0F); // Import 
		gunModel[66].setRotationPoint(-9.2F, -3.35F, -0.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.2F, -0.02F, -0.5F, 0.2F, 0.0F, -0.4F, -0.75F, -0.1F, -0.4F, -0.75F, -0.1F, -0.4F, 0.1F, -0.02F, -0.4F, 0.1F); // Import 
		gunModel[67].setRotationPoint(1.7F, -3.55F, -0.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, 0.1F, -0.75F, 0.0F, 0.1F, -0.75F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		gunModel[68].setRotationPoint(1.7F, -4.05F, -0.5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.0F, -0.45F, -1.05F, -0.05F, -0.45F, -1.05F, -0.05F, -0.45F, 0.1F, -0.02F, -0.45F, 0.1F, 0.0F, -0.4F, -1.05F, 0.0F, -0.4F, -1.05F, 0.0F, -0.4F, 0.1F, -0.02F, -0.4F, 0.1F); // Import 
		gunModel[69].setRotationPoint(3.7F, -4.8F, -0.5F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.0F, -0.5F, -1.05F, -0.2F, -0.5F, -1.05F, -0.2F, -0.5F, 0.1F, -0.02F, -0.5F, 0.1F, 0.0F, -0.4F, -1.05F, -0.05F, -0.4F, -1.05F, -0.05F, -0.4F, 0.1F, -0.02F, -0.4F, 0.1F); // Import 
		gunModel[70].setRotationPoint(3.7F, -4.95F, -0.5F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, 0.0F, -0.5F, -0.45F, 0.0F, -0.4F, -0.45F, -0.05F, -0.4F, -0.45F, -0.05F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import 
		gunModel[71].setRotationPoint(1.7F, -5.25F, -0.3F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, -0.45F, -0.45F, -0.05F, -0.45F, -0.45F, -0.05F, -0.45F, -0.45F, 0.0F, -0.45F, -0.45F, 0.0F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import 
		gunModel[72].setRotationPoint(1.7F, -5.1F, -0.3F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, -0.45F, -0.45F, 0.0F, -0.45F, -0.45F, 0.0F, -0.45F, -0.45F, 0.0F, -0.45F, -0.45F, 0.0F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import 
		gunModel[73].setRotationPoint(1.7F, -4.95F, -0.3F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, 0.0F, -0.5F, -0.45F, 0.0F, -0.4F, -0.45F, -0.05F, -0.4F, -0.45F, -0.05F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import 
		gunModel[74].setRotationPoint(1.7F, -5.25F, -0.7F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, -0.45F, -0.45F, -0.05F, -0.45F, -0.45F, -0.05F, -0.45F, -0.45F, 0.0F, -0.45F, -0.45F, 0.0F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import 
		gunModel[75].setRotationPoint(1.7F, -5.1F, -0.7F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, -0.45F, -0.45F, 0.0F, -0.45F, -0.45F, 0.0F, -0.45F, -0.45F, 0.0F, -0.45F, -0.45F, 0.0F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import 
		gunModel[76].setRotationPoint(1.7F, -4.95F, -0.7F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.0F, -0.5F, -1.05F, 0.0F, -0.5F, -1.05F, 0.0F, -0.5F, 0.1F, -0.02F, -0.5F, 0.1F, 0.0F, -0.45F, -1.05F, 0.0F, -0.45F, -1.05F, 0.0F, -0.45F, 0.1F, -0.02F, -0.45F, 0.1F); // Import 
		gunModel[77].setRotationPoint(3.7F, -4.7F, -0.5F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, 0.1F, 0.05F, 0.0F, 0.1F, 0.05F, 0.0F, 0.1F, -0.75F, 0.0F, 0.1F, -0.75F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F); // Import 
		gunModel[78].setRotationPoint(1.7F, -4.05F, -0.5F);

		gunModel[79].addShapeBox(0F, 0F, -1F, 5, 1, 1, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, -1.05F, 0F, -0.5F, -1.05F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, -1.05F, 0F, -0.45F, -1.05F); // Import 
		gunModel[79].setRotationPoint(3.7F, -4.7F, 0.5F);

		gunModel[80].addShapeBox(0F, 0F, -1F, 5, 1, 1, 0F, 0F, -0.45F, 0.1F, -0.05F, -0.45F, 0.1F, -0.05F, -0.45F, -1.05F, 0F, -0.45F, -1.05F, 0F, -0.4F, 0.1F, 0.0F, -0.4F, 0.1F, 0.0F, -0.4F, -1.05F, 0.0F, -0.4F, -1.05F); // Import 
		gunModel[80].setRotationPoint(3.7F, -4.8F, 0.5F);

		gunModel[81].addShapeBox(0F, 0F, -1F, 5, 1, 1, 0F, 0F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, -1.05F, 0F, -0.5F, -1.05F, 0F, -0.4F, 0.1F, -0.05F, -0.4F, 0.1F, -0.05F, -0.4F, -1.05F, 0.0F, -0.4F, -1.05F); // Import 
		gunModel[81].setRotationPoint(3.7F, -4.95F, 0.5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, -0.75F, 0.0F, -0.4F, -0.75F); // Import 
		gunModel[82].setRotationPoint(1.7F, -3.55F, -0.5F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, -0.35F, -0.25F, 0.0F, -0.35F, -0.25F, 0.0F, -0.35F, -0.25F, 0.0F, -0.35F, -0.25F, 0.0F, -0.35F, -0.25F, 0.0F, -0.35F, -0.25F, 0.0F, -0.35F, -0.25F, 0.0F, -0.35F, -0.25F); // Import 
		gunModel[83].setRotationPoint(1.7F, -4.15F, -0.5F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, -0.15F, -0.5F, -0.45F, -0.25F, -0.5F, -0.45F, -0.25F, -0.3F, -0.3F, -0.15F, -0.2F, -0.45F, -0.15F, -0.55F, -0.45F, -0.25F, -0.55F, -0.45F, -0.25F, -0.2F, -0.45F, -0.15F); // Import 
		gunModel[84].setRotationPoint(-0.6F, -2.25F, -0.5F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, -0.25F, -0.3F, -0.55F, -0.25F, -0.3F, -0.55F, -0.25F, -0.3F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.3F, -0.35F, -0.25F, -0.3F, -0.35F, -0.25F, -0.25F, -0.45F, -0.25F); // Import 
		gunModel[85].setRotationPoint(-0.4F, -2.25F, -0.5F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.45F, -0.25F, -0.15F, -0.45F, -0.25F, -0.15F, -0.45F, -0.25F, -0.1F, -0.45F, -0.25F, -0.1F, -0.45F, -0.25F, -0.1F, -0.45F, -0.25F, -0.1F, -0.45F, -0.25F, -0.1F, -0.45F, -0.25F); // Import 
		gunModel[86].setRotationPoint(0.2F, -2.15F, -0.5F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.45F, -0.25F, -0.55F, -0.3F, -0.25F, -0.55F, -0.3F, -0.25F, -0.25F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.45F, -0.6F, -0.25F, -0.45F, -0.6F, -0.25F, -0.3F, -0.45F, -0.25F); // Import 
		gunModel[87].setRotationPoint(0.8F, -2.15F, -0.5F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.65F, -0.1F, -0.25F, -0.2F, -0.1F, -0.25F, -0.2F, -0.1F, -0.25F, -0.65F, -0.1F, -0.25F, -0.45F, -0.2F, -0.25F, -0.45F, -0.1F, -0.25F, -0.45F, -0.1F, -0.25F, -0.45F, -0.2F, -0.25F); // Import 
		gunModel[88].setRotationPoint(0.8F, -2.65F, -0.5F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.05F, -0.45F, -1.05F, 0.0F, -0.45F, -1.05F, 0.0F, -0.45F, 0.1F, -0.07F, -0.45F, 0.1F, -0.1F, -0.4F, -1.05F, 0.0F, -0.4F, -1.05F, 0.0F, -0.4F, 0.1F, -0.12F, -0.4F, 0.1F); // Import 
		gunModel[89].setRotationPoint(3.7F, -4.4F, -0.5F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.0F, -0.45F, -1.05F, 0.0F, -0.45F, -1.05F, 0.0F, -0.45F, 0.1F, 0.0F, -0.45F, 0.1F, 0.0F, -0.4F, -1.05F, 0.0F, -0.4F, -1.05F, 0.0F, -0.4F, 0.1F, 0.0F, -0.4F, 0.1F); // Import 
		gunModel[90].setRotationPoint(4.7F, -4.1F, -0.5F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -1.05F, 0.0F, -0.45F, -1.05F, 0.0F, -0.45F, 0.1F, -0.5F, -0.45F, 0.1F, -0.4F, -0.4F, -1.05F, 0.0F, -0.4F, -1.05F, 0.0F, -0.4F, 0.1F, -0.5F, -0.4F, 0.1F); // Import 
		gunModel[91].setRotationPoint(6.7F, -4.25F, -0.5F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.5F, -1.05F, 0.0F, -0.5F, -1.05F, 0.0F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.4F, -0.4F, -1.05F, 0.0F, -0.4F, -1.05F, 0.0F, -0.4F, 0.1F, -0.5F, -0.4F, 0.1F); // Import 
		gunModel[92].setRotationPoint(6.7F, -4.55F, -0.5F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -1.05F, 0.0F, -0.45F, -1.05F, 0.0F, -0.45F, 0.1F, -0.5F, -0.45F, 0.1F, -0.4F, -0.45F, -1.05F, 0.0F, -0.45F, -1.05F, 0.0F, -0.45F, 0.1F, -0.5F, -0.45F, 0.1F); // Import 
		gunModel[93].setRotationPoint(6.7F, -3.95F, -0.5F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, -0.8F, -1.15F, 0.0F, -0.8F, -1.15F, 0.0F, -0.8F, 0.2F, -0.02F, -0.8F, 0.2F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, 0.2F, -0.02F, 0.0F, 0.2F); // Import 
		gunModel[94].setRotationPoint(1.7F, -4.05F, -0.5F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0.0F, -1.05F, -0.05F, 0.0F, -1.05F, -0.05F, 0.0F, 0.1F, -0.4F, 0.0F, 0.1F, -0.3F, -0.95F, -1.05F, -0.1F, -0.95F, -1.05F, -0.1F, -0.95F, 0.1F, -0.4F, -0.95F, 0.1F); // Import 
		gunModel[95].setRotationPoint(6.8F, -4.1F, -0.5F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.0F, 0.1F, -1.0F, 0.0F, 0.1F, -1.0F, 0.0F, 0.1F, 0.1F, -0.02F, 0.1F, 0.1F, 0.0F, -1.05F, -1.0F, 0.0F, -1.05F, -1.0F, 0.0F, -1.05F, 0.1F, -0.02F, -1.05F, 0.1F); // Import 
		gunModel[96].setRotationPoint(3.7F, -4.05F, -0.5F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.95F, -1.05F, -0.1F, -0.95F, -1.05F, -0.1F, -0.95F, 0.1F, -0.4F, -0.95F, 0.1F, -0.3F, 0.0F, -1.05F, -0.05F, 0.0F, -1.05F, -0.05F, 0.0F, 0.1F, -0.4F, 0.0F, 0.1F); // Import 
		gunModel[97].setRotationPoint(6.8F, -4.35F, -0.5F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.05F, 0.0F, -0.2F, 0.05F, 0.0F, -0.15F, -1.0F, 0.0F, -0.15F, -1.0F, 0.0F, -0.15F, 0.05F, 0.0F, -0.15F, 0.05F); // Import 
		gunModel[98].setRotationPoint(1.7F, -4.25F, -0.5F);

		gunModel[99].addShapeBox(0F, 0F, -1F, 4, 1, 1, 0F, 0.25F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, -1.0F, 0.25F, 0.1F, -1.0F, 0.25F, -1.05F, 0.1F, 0F, -1.05F, 0.1F, 0F, -1.05F, -1.0F, 0.25F, -1.05F, -1.0F); // Import 
		gunModel[99].setRotationPoint(4.7F, -4.05F, 0.5F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, 0.15F, 0.0F, -0.3F, 0.15F, 0.0F, -0.4F, -1.0F, 0.0F, -0.4F, -1.0F, 0.0F, -0.4F, 0.15F, 0.0F, -0.4F, 0.15F); // Import 
		gunModel[100].setRotationPoint(1.7F, -3.65F, -0.5F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.0F, -0.8F, -1.0F, 0.0F, -0.8F, -1.0F, 0.0F, -0.8F, 0.05F, 0.0F, -0.8F, 0.05F, 0.0F, -0.15F, -1.0F, 0.05F, -0.15F, -1.0F, 0.05F, -0.15F, 0.05F, 0.0F, -0.15F, 0.05F); // Import 
		gunModel[101].setRotationPoint(1.7F, -4.2F, -0.5F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.0F, -0.15F, -1F, 0.05F, -0.15F, -1F, 0.05F, -0.15F, 0.05F, 0.0F, -0.15F, 0.05F, 0.0F, -0.8F, -1.0F, 0.0F, -0.8F, -1.0F, 0.0F, -0.8F, 0.05F, 0.0F, -0.8F, 0.05F); // Import 
		gunModel[102].setRotationPoint(1.7F, -4.25F, -0.5F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, -0.3F, 0.15F, 0.0F, -0.3F, 0.15F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.4F, 0.15F, 0.0F, -0.4F, 0.15F, 0.0F, -0.4F, -1.0F, 0.0F, -0.4F, -1.0F); // Import 
		gunModel[103].setRotationPoint(1.7F, -3.65F, -0.5F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.95F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.1F, -0.95F, -0.2F, 0.1F, -0.95F, -0.15F, -1.0F, 0.0F, -0.15F, -1.0F, 0.0F, -0.15F, 0.1F, -0.95F, -0.15F, 0.1F); // Import 
		gunModel[104].setRotationPoint(7.7F, -4.25F, -0.5F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, -0.45F, -1.0F, 0.0F, -0.45F, -1.0F, 0.0F, -0.45F, 0.1F, -0.9F, -0.45F, 0.1F, -0.95F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.1F, -0.95F, -0.5F, 0.1F); // Import 
		gunModel[105].setRotationPoint(7.7F, -4.55F, -0.5F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.95F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.1F, -0.95F, -0.5F, 0.1F, -0.9F, -0.45F, -1.0F, 0.0F, -0.45F, -1.0F, 0.0F, -0.45F, 0.1F, -0.9F, -0.45F, 0.1F); // Import 
		gunModel[106].setRotationPoint(7.7F, -3.9F, -0.5F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.95F, -0.15F, -1.05F, 0.0F, -0.15F, -1.05F, 0.0F, -0.15F, 0.1F, -0.95F, -0.15F, 0.1F, -0.95F, -0.1F, -1.05F, 0.0F, -0.1F, -1.05F, 0.0F, -0.1F, 0.1F, -0.95F, -0.1F, 0.1F); // Import 
		gunModel[107].setRotationPoint(7.2F, -4.25F, -0.5F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, -0.45F, 0.1F, 0.0F, -0.45F, 0.1F, 0.0F, -0.45F, -1.0F, -0.9F, -0.45F, -1.0F, -0.95F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, -1.0F, -0.95F, -0.5F, -1.0F); // Import 
		gunModel[108].setRotationPoint(7.7F, -4.55F, -0.5F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.95F, -0.2F, 0.1F, 0.0F, -0.2F, 0.1F, 0.0F, -0.2F, -1.0F, -0.95F, -0.2F, -1.0F, -0.95F, -0.15F, 0.1F, 0.0F, -0.15F, 0.1F, 0.0F, -0.15F, -1.0F, -0.95F, -0.15F, -1.0F); // Import 
		gunModel[109].setRotationPoint(7.7F, -4.25F, -0.5F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.95F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, -1.0F, -0.95F, -0.5F, -1.0F, -0.9F, -0.45F, 0.1F, 0.0F, -0.45F, 0.1F, 0.0F, -0.45F, -1.0F, -0.9F, -0.45F, -1.0F); // Import 
		gunModel[110].setRotationPoint(7.7F, -3.9F, -0.5F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.95F, -0.15F, 0.1F, 0.0F, -0.15F, 0.1F, 0.0F, -0.15F, -1.05F, -0.95F, -0.15F, -1.05F, -0.95F, -0.1F, 0.1F, 0.0F, -0.1F, 0.1F, 0.0F, -0.1F, -1.05F, -0.95F, -0.1F, -1.05F); // Import 
		gunModel[111].setRotationPoint(7.2F, -4.25F, -0.5F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.5F, -0.75F, -0.4F, -0.35F, -0.65F, -0.4F, -0.35F, -0.65F, -0.4F, -0.5F, -0.75F, -0.4F); // Import 
		gunModel[112].setRotationPoint(-0.2F, -2.65F, -0.5F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.05F, -0.4F, -0.35F, -0.15F, -0.4F, -0.35F, -0.15F, -0.4F, -0.5F, -0.05F, -0.4F, -0.5F, -0.6F, -0.4F, -0.35F, -0.65F, -0.4F, -0.35F, -0.65F, -0.4F, -0.5F, -0.6F, -0.4F); // Import 
		gunModel[113].setRotationPoint(-0.2F, -2.45F, -0.5F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.2F, -0.4F, -0.35F, -0.15F, -0.4F, -0.35F, -0.15F, -0.4F, -0.5F, -0.2F, -0.4F, -0.65F, -0.55F, -0.4F, -0.25F, -0.6F, -0.4F, -0.25F, -0.6F, -0.4F, -0.65F, -0.55F, -0.4F); // Import 
		gunModel[114].setRotationPoint(-0.2F, -2.25F, -0.5F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0.0F, -0.7F, 0.1F, -0.3F, -0.7F, 0.1F, -0.3F, -0.7F, 0.1F, 0.0F, -0.7F, 0.1F, 0.0F, 0.05F, 0.1F, -0.3F, 0.05F, 0.1F, -0.3F, 0.05F, 0.1F, 0.0F, 0.05F, 0.1F); // Import 
		gunModel[115].setRotationPoint(-8.7F, -4.95F, -0.5F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.3F, -0.9F, 0F, 0.0F, -0.9F, 0F, 0.0F, -0.9F, 0F, -0.3F, -0.9F, 0F, -0.3F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F); // Import 
		gunModel[116].setRotationPoint(-9F, -5.25F, -0.5F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.1F, 0.25F, 0.2F, -0.1F, 0.25F, 0.2F, -0.1F, 0.25F, 0.2F, -0.1F, 0.25F, 0.2F, 0.0F, 0.25F, 0.2F, 0.0F, 0.25F, 0.2F, 0.0F, 0.25F, 0.2F, 0.0F, 0.25F); // Import 
		gunModel[117].setRotationPoint(-5F, -3.75F, -0.5F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, -0.7F, 0.25F, 0.05F, -0.7F, 0.25F, 0.05F, -0.7F, 0.25F, 0.05F, -0.7F, 0.25F, 0.2F, 0.0F, 0.25F, 0.2F, 0.0F, 0.25F, 0.2F, 0.0F, 0.25F, 0.2F, 0.0F, 0.25F); // Import 
		gunModel[118].setRotationPoint(-5F, -4.65F, -0.5F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.8F, 0.25F, -0.25F, -0.8F, 0.25F, -0.25F, -0.8F, 0.25F, -0.25F, -0.8F, 0.25F, 0.05F, 0.0F, 0.25F, 0.05F, 0.0F, 0.25F, 0.05F, 0.0F, 0.25F, 0.05F, 0.0F, 0.25F); // Import 
		gunModel[119].setRotationPoint(-5F, -4.95F, -0.5F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.1F, -1.25F, 0.2F, -0.1F, -1.25F, 0.1F, -0.2F, 0.4F, 0.1F, -0.2F, 0.4F, 0.2F, 0.0F, -1.25F, 0.2F, 0.0F, -1.25F, 0.1F, 0.0F, 0.4F, 0.1F, 0.0F, 0.4F); // Import 
		gunModel[120].setRotationPoint(-5F, -3.75F, -0.5F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, -0.3F, -1.25F, 0.05F, -0.3F, -1.25F, -0.05F, -0.4F, 0.4F, -0.05F, -0.4F, 0.4F, 0.2F, -0.4F, -1.25F, 0.2F, -0.4F, -1.25F, 0.1F, -0.3F, 0.4F, 0.1F, -0.3F, 0.4F); // Import 
		gunModel[121].setRotationPoint(-5F, -4.25F, -0.5F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.4F, -1.25F, -0.25F, -0.4F, -1.25F, -0.35F, -0.5F, 0.4F, -0.35F, -0.5F, 0.4F, 0.05F, -0.4F, -1.25F, 0.05F, -0.4F, -1.25F, -0.05F, -0.3F, 0.4F, -0.05F, -0.3F, 0.4F); // Import 
		gunModel[122].setRotationPoint(-5F, -4.55F, -0.5F);

		gunModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.1F, -0.05F, -0.4F, -0.1F, -0.05F, -0.4F, -0.1F, -0.05F, -0.5F, -0.1F, -0.05F, -0.5F, -0.1F, -0.05F, -0.4F, -0.1F, -0.05F, -0.4F, -0.1F, -0.05F, -0.5F, -0.1F, -0.05F); // Import 
		gunModel[123].setRotationPoint(-5.8F, -3.65F, -1F);

		gunModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.1F, -0.05F, -0.4F, -0.1F, -0.05F, -0.4F, -0.1F, -0.05F, -0.5F, -0.1F, -0.05F, -0.5F, -0.1F, -0.05F, -0.4F, -0.1F, -0.05F, -0.4F, -0.1F, -0.05F, -0.5F, -0.1F, -0.05F); // Import 
		gunModel[124].setRotationPoint(-4.3F, -3.65F, -1F);

		gunModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.2F, -0.45F, -0.5F, -0.2F, -0.45F, -0.5F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.2F, -0.45F, -0.5F, -0.2F, -0.45F); // Import 
		gunModel[125].setRotationPoint(-5.8F, -3.65F, 0.5F);

		gunModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.2F, -0.45F, -0.5F, -0.2F, -0.45F, -0.5F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.2F, -0.45F, -0.5F, -0.2F, -0.45F); // Import 
		gunModel[126].setRotationPoint(-4.3F, -3.65F, 0.5F);

		gunModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.2F, -0.45F, -0.05F, 0.2F, -0.45F, -0.05F, 0.2F, -0.45F, -0.05F, 0.2F, -0.45F, -0.05F, 0.2F, -0.45F, -0.05F, 0.2F, -0.45F, -0.05F, 0.2F, -0.45F, -0.05F, 0.2F, -0.45F, -0.05F); // Import 
		gunModel[127].setRotationPoint(-5F, -3.85F, -1F);

		gunModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0.5F, -0.4F, -0.5F, 0.5F, -0.4F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.3F, -0.45F, 0.5F); // Import 
		gunModel[128].setRotationPoint(-5.25F, -3.95F, -0.5F);

		gunModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.45F, 0.45F, -0.4F, -0.45F, 0.45F, -0.4F, -0.45F, 0.45F, -0.5F, -0.45F, 0.45F, -0.5F, -0.4F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0.5F, -0.5F, -0.4F, 0.5F); // Import 
		gunModel[129].setRotationPoint(-5.25F, -4.05F, -0.5F);

		gunModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.45F, 0.45F, -0.4F, -0.45F, 0.45F, -0.4F, -0.45F, 0.45F, -0.5F, -0.45F, 0.45F, -0.5F, -0.4F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0.5F, -0.5F, -0.4F, 0.5F); // Import 
		gunModel[130].setRotationPoint(-5.45F, -4.05F, -0.5F);

		gunModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0.5F, -0.4F, -0.5F, 0.5F, -0.4F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.3F, -0.45F, 0.5F); // Import 
		gunModel[131].setRotationPoint(-4.65F, -3.95F, -0.5F);

		gunModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.45F, 0.45F, -0.4F, -0.45F, 0.45F, -0.4F, -0.45F, 0.45F, -0.5F, -0.45F, 0.45F, -0.5F, -0.4F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0.5F, -0.5F, -0.4F, 0.5F); // Import 
		gunModel[132].setRotationPoint(-4.85F, -4.05F, -0.5F);

		gunModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.45F, 0.45F, -0.4F, -0.45F, 0.45F, -0.4F, -0.45F, 0.45F, -0.5F, -0.45F, 0.45F, -0.5F, -0.4F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0.5F, -0.5F, -0.4F, 0.5F); // Import 
		gunModel[133].setRotationPoint(-4.65F, -4.05F, -0.5F);

		gunModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0.5F, -0.4F, -0.5F, 0.5F, -0.4F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.3F, -0.45F, 0.5F); // Import 
		gunModel[134].setRotationPoint(-5.25F, -3.8F, -0.5F);

		gunModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0.5F, -0.4F, -0.5F, 0.5F, -0.4F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.3F, -0.45F, 0.5F); // Import 
		gunModel[135].setRotationPoint(-4.65F, -3.8F, -0.5F);

		gunModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.45F, -0.15F, -0.45F, -0.45F, -0.2F, -0.475F, -0.525F, -0.2F, -0.475F, -0.525F, -0.2F, -0.45F, -0.45F, -0.15F, -0.45F, -0.45F, -0.2F, -0.475F, -0.525F, -0.2F, -0.475F, -0.525F); // Import 
		gunModel[136].setRotationPoint(-5.4F, -3.85F, 0.5F);

		gunModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.475F, -0.525F, -0.2F, -0.475F, -0.525F, -0.15F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.475F, -0.525F, -0.2F, -0.475F, -0.525F); // Import 
		gunModel[137].setRotationPoint(-4.6F, -3.85F, 0.5F);

		gunModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.5F, 0.5F, -0.35F, -0.5F, 0.5F, -0.35F, -0.5F, 0.5F, -0.35F, -0.5F, 0.5F, -0.4F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F); // Import 
		gunModel[138].setRotationPoint(-5F, -3.8F, -0.5F);

		gunModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.0F, -0.2F, -0.05F, 0.0F, -0.2F, -0.05F, 0.0F, -0.2F, -0.05F, 0.0F, -0.2F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F); // Import 
		gunModel[139].setRotationPoint(-5F, -3.75F, -1F);

		gunModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.1F, -0.4F, -0.05F, -0.1F, -0.4F, -0.05F, -0.1F, -0.4F, -0.05F, -0.1F, -0.4F, -0.05F, 0.0F, -0.4F, -0.05F, 0.0F, -0.4F, -0.05F, 0.0F, -0.4F, -0.05F, 0.0F, -0.4F, -0.05F); // Import 
		gunModel[140].setRotationPoint(-5F, -4.15F, -1F);

		gunModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.3F, -0.45F, -0.05F, -0.3F, -0.45F, -0.05F, -0.3F, -0.45F, -0.05F, -0.3F, -0.45F, -0.05F, -0.1F, -0.4F, -0.05F, -0.1F, -0.4F, -0.05F, -0.1F, -0.4F, -0.05F, -0.1F, -0.4F, -0.05F); // Import 
		gunModel[141].setRotationPoint(-5F, -4.35F, -1F);

		gunModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F); // Import 
		gunModel[142].setRotationPoint(-5F, -3.65F, -0.5F);

		gunModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.35F, -0.5F, 0.5F, -0.35F, -0.5F, 0.5F, -0.35F, -0.5F, 0.5F, -0.35F, -0.5F, 0.5F); // Import 
		gunModel[143].setRotationPoint(-5F, -3.55F, -0.5F);

		gunModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.4F, 0.5F, 0.1F, -0.4F, 0.5F, 0.1F, -0.4F, 0.5F, 0.1F, -0.4F, 0.5F, 0.1F, -0.4F, 0.5F, 0.1F, -0.4F, 0.5F, 0.1F, -0.4F, 0.5F, 0.1F, -0.4F, 0.5F); // Import 
		gunModel[144].setRotationPoint(-5F, -3.45F, -0.5F);

		gunModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.5F, 0.5F, -0.35F, -0.5F, 0.5F, -0.35F, -0.5F, 0.5F, -0.45F, -0.5F, 0.5F, -0.45F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.45F, -0.45F, 0.5F); // Import 
		gunModel[145].setRotationPoint(-5.6F, -3.8F, -0.5F);

		gunModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.4F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0.5F, -0.5F, -0.4F, 0.5F, -0.5F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.5F, -0.45F, 0.5F); // Import 
		gunModel[146].setRotationPoint(-5.6F, -3.65F, -0.5F);

		gunModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.5F, -0.45F, 0.5F, -0.5F, -0.5F, 0.5F, -0.35F, -0.5F, 0.5F, -0.35F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F); // Import 
		gunModel[147].setRotationPoint(-5.6F, -3.55F, -0.5F);

		gunModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.5F, 0.5F, -0.45F, -0.5F, 0.5F, -0.45F, -0.5F, 0.5F, -0.35F, -0.5F, 0.5F, -0.4F, -0.45F, 0.5F, -0.45F, -0.45F, 0.5F, -0.45F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F); // Import 
		gunModel[148].setRotationPoint(-4.4F, -3.8F, -0.5F);

		gunModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, 0.5F, -0.5F, -0.4F, 0.5F, -0.5F, -0.4F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.45F, 0.5F, -0.5F, -0.45F, 0.5F, -0.5F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F); // Import 
		gunModel[149].setRotationPoint(-4.4F, -3.65F, -0.5F);

		gunModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.5F, -0.5F, -0.45F, 0.5F, -0.5F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.35F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.35F, -0.5F, 0.5F); // Import 
		gunModel[150].setRotationPoint(-4.4F, -3.55F, -0.5F);

		gunModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.5F, 0.5F, 0.1F, -0.5F, 0.5F, 0.1F, -0.5F, 0.5F, 0.1F, -0.5F, 0.5F, -0.25F, -0.4F, 0.5F, -0.25F, -0.4F, 0.5F, -0.25F, -0.4F, 0.5F, -0.25F, -0.4F, 0.5F); // Import 
		gunModel[151].setRotationPoint(-5F, -3.35F, -0.5F);

		gunModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.5F, 0.4F, -0.35F, -0.5F, 0.4F, -0.25F, -0.4F, -1.25F, -0.25F, -0.4F, -1.25F, -0.05F, -0.3F, 0.4F, -0.05F, -0.3F, 0.4F, 0.05F, -0.4F, -1.25F, 0.05F, -0.4F, -1.25F); // Import 
		gunModel[152].setRotationPoint(-5F, -4.55F, -0.5F);

		gunModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.05F, -0.4F, 0.4F, -0.05F, -0.4F, 0.4F, 0.05F, -0.3F, -1.25F, 0.05F, -0.3F, -1.25F, 0.1F, -0.3F, 0.4F, 0.1F, -0.3F, 0.4F, 0.2F, -0.4F, -1.25F, 0.2F, -0.4F, -1.25F); // Import 
		gunModel[153].setRotationPoint(-5F, -4.25F, -0.5F);

		gunModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.2F, 0.4F, 0.1F, -0.2F, 0.4F, 0.2F, -0.1F, -1.25F, 0.2F, -0.1F, -1.25F, 0.1F, 0.0F, 0.4F, 0.1F, 0.0F, 0.4F, 0.2F, 0.0F, -1.25F, 0.2F, 0.0F, -1.25F); // Import 
		gunModel[154].setRotationPoint(-5F, -3.75F, -0.5F);

		gunModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.4F, 0.05F, -0.45F, -0.4F, 0.05F, -0.45F, -0.4F, 0.05F, -0.5F, -0.4F, 0.05F, -0.5F, -0.3F, 0.05F, -0.45F, -0.35F, 0.05F, -0.45F, -0.35F, 0.05F, -0.5F, -0.3F, 0.05F); // Import 
		gunModel[155].setRotationPoint(-5.6F, -3.55F, -1F);

		gunModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.05F, -0.5F, 0.05F, 0.05F, -0.5F, 0.05F, 0.05F, -0.5F, 0.05F, 0.05F, -0.5F, 0.05F, 0.05F, -0.45F, 0.05F, 0.05F, -0.45F, 0.05F, 0.05F, -0.45F, 0.05F, 0.05F, -0.45F, 0.05F); // Import 
		gunModel[156].setRotationPoint(-5F, -3.55F, -1F);

		gunModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.45F, -0.4F, 0.05F, -0.5F, -0.4F, 0.05F, -0.5F, -0.4F, 0.05F, -0.45F, -0.4F, 0.05F, -0.45F, -0.35F, 0.05F, -0.5F, -0.3F, 0.05F, -0.5F, -0.3F, 0.05F, -0.45F, -0.35F, 0.05F); // Import 
		gunModel[157].setRotationPoint(-4.4F, -3.55F, -1F);

		gunModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.35F, -0.45F, 0.05F, -0.3F, -0.55F, 0.05F, -0.3F, -0.55F, 0.05F, -0.35F, -0.45F, 0.05F, -0.3F, -0.5F, 0.05F, -0.35F, -0.4F, 0.05F, -0.35F, -0.4F, 0.05F, -0.3F, -0.5F, 0.05F); // Import 
		gunModel[158].setRotationPoint(-5.4F, -3.35F, -1F);

		gunModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.3F, -0.55F, 0.05F, -0.35F, -0.45F, 0.05F, -0.35F, -0.45F, 0.05F, -0.3F, -0.55F, 0.05F, -0.35F, -0.4F, 0.05F, -0.3F, -0.5F, 0.05F, -0.3F, -0.5F, 0.05F, -0.35F, -0.4F, 0.05F); // Import 
		gunModel[159].setRotationPoint(-4.6F, -3.35F, -1F);

		gunModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.3F, -0.5F, 0.05F, -0.3F, -0.5F, 0.05F, -0.3F, -0.5F, 0.05F, -0.3F, -0.5F, 0.05F, -0.25F, -0.45F, 0.05F, -0.25F, -0.45F, 0.05F, -0.25F, -0.45F, 0.05F, -0.25F, -0.45F, 0.05F); // Import 
		gunModel[160].setRotationPoint(-5F, -3.3F, -1F);

		gunModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.4F, 0.15F, -0.25F, -0.4F, 0.15F, -0.25F, -0.4F, 0.15F, -0.25F, -0.4F, 0.15F, -0.25F, -0.3F, 0.15F, -0.25F, -0.3F, 0.15F, -0.25F, -0.3F, 0.15F, -0.25F, -0.3F, 0.15F); // Import 
		gunModel[161].setRotationPoint(-7.3F, -3.15F, -0.5F);

		gunModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.4F, -0.25F, -0.7F, -0.4F, 0.15F, -0.7F, -0.4F, 0.15F, 0.1F, -0.4F, -0.25F, 0.1F, -0.3F, -0.25F, -0.7F, -0.3F, 0.15F, -0.7F, -0.3F, 0.15F, 0.1F, -0.3F, -0.25F); // Import 
		gunModel[162].setRotationPoint(-7.35F, -3.15F, -0.5F);

		gunModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, -0.4F, 0.15F, 0.1F, -0.4F, -0.25F, 0.1F, -0.4F, -0.25F, -0.7F, -0.4F, 0.15F, -0.7F, -0.3F, 0.15F, 0.1F, -0.3F, -0.25F, 0.1F, -0.3F, -0.25F, -0.7F, -0.3F, 0.15F); // Import 
		gunModel[163].setRotationPoint(-7.25F, -3.15F, -0.5F);

		gunModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Import 
		gunModel[164].setRotationPoint(-9.4F, -5.05F, -0.5F);

		gunModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.7F, 0.1F, -0.3F, -0.7F, 0.1F, -0.3F, -0.7F, 0.1F, -0.3F, -0.7F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F); // Import 
		gunModel[165].setRotationPoint(-9.4F, -4.95F, -0.5F);

		gunModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F); // Import 
		gunModel[166].setRotationPoint(-9.4F, -4.25F, -0.5F);

		gunModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F); // Import 
		gunModel[167].setRotationPoint(-9.5F, -4.25F, 0.05F);

		gunModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F); // Import 
		gunModel[168].setRotationPoint(-9.5F, -4.25F, -1.05F);

		gunModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.0F, 0.0F, -0.4F, 0.0F, 0.05F, -0.4F, 0.0F, 0.05F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.4F, 0.0F, 0.05F, -0.4F, 0.0F, 0.05F, -0.5F, 0.0F, 0.0F); // Import 
		gunModel[169].setRotationPoint(0.2F, -3.55F, -0.5F);

		gunModel[170].addShapeBox(0F, 0F, -1F, 7, 1, 1, 0F, -0.1F, -0.9F, 0.2F, 0.1F, -0.9F, 0.2F, 0.1F, -0.9F, -1.15F, -0.1F, -0.9F, -1.15F, -0.1F, 0.0F, 0.2F, 0.1F, 0.0F, 0.2F, 0.1F, 0.0F, -1.15F, -0.1F, 0.0F, -1.15F); // Import 
		gunModel[170].setRotationPoint(1.6F, -4.25F, 0.5F);

		gunModel[171].addShapeBox(0F, 0F, -1F, 7, 1, 1, 0F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.8F, -1.15F, 0F, -0.8F, -1.15F, 0F, 0.0F, 0.2F, 0F, 0.0F, 0.2F, 0F, 0.0F, -1.15F, 0F, 0.0F, -1.15F); // Import 
		gunModel[171].setRotationPoint(1.7F, -4.05F, 0.5F);

		gunModel[172].addShapeBox(0F, 0F, -1F, 1, 1, 1, 0F, -0.5F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, -1.05F, -0.4F, -0.5F, -1.05F, -0.5F, -0.4F, 0.1F, 0.0F, -0.4F, 0.1F, 0.0F, -0.4F, -1.05F, -0.4F, -0.4F, -1.05F); // Import 
		gunModel[172].setRotationPoint(6.7F, -4.55F, 0.5F);

		gunModel[173].addShapeBox(0F, 0F, -1F, 3, 1, 1, 0F, -0.02F, -0.45F, 0.1F, 0.0F, -0.45F, 0.1F, 0.0F, -0.45F, -1.05F, 0.0F, -0.45F, -1.05F, -0.02F, -0.4F, 0.1F, 0.0F, -0.4F, 0.1F, 0.0F, -0.4F, -1.05F, 0.0F, -0.4F, -1.05F); // Import 
		gunModel[173].setRotationPoint(4.7F, -4.4F, 0.5F);

		gunModel[174].addShapeBox(0F, 0F, -1F, 3, 1, 1, 0F, 0.0F, -0.45F, 0.1F, 0.0F, -0.45F, 0.1F, 0.0F, -0.45F, -1.05F, 0.0F, -0.45F, -1.05F, 0.0F, -0.4F, 0.1F, 0.0F, -0.4F, 0.1F, 0.0F, -0.4F, -1.05F, 0.0F, -0.4F, -1.05F); // Import 
		gunModel[174].setRotationPoint(4.7F, -4.1F, 0.5F);

		gunModel[175].addShapeBox(0F, 0F, -1F, 1, 1, 1, 0F, -0.5F, -0.45F, 0.1F, 0.0F, -0.45F, 0.1F, 0.0F, -0.45F, -1.05F, -0.4F, -0.45F, -1.05F, -0.5F, -0.4F, 0.1F, 0.0F, -0.4F, 0.1F, 0.0F, -0.4F, -1.05F, -0.4F, -0.4F, -1.05F); // Import 
		gunModel[175].setRotationPoint(6.7F, -4.25F, 0.5F);

		gunModel[176].addShapeBox(0F, 0F, -1F, 1, 1, 1, 0F, -0.5F, -0.45F, 0.1F, 0.0F, -0.45F, 0.1F, 0.0F, -0.45F, -1.05F, -0.4F, -0.45F, -1.05F, -0.5F, -0.45F, 0.1F, 0.0F, -0.45F, 0.1F, 0.0F, -0.45F, -1.05F, -0.4F, -0.45F, -1.05F); // Import 
		gunModel[176].setRotationPoint(6.7F, -3.95F, 0.5F);

		gunModel[177].addShapeBox(0F, 0F, -1F, 1, 1, 1, 0F, -0.4F, -0.95F, 0.1F, -0.1F, -0.95F, 0.1F, -0.1F, -0.95F, -1.05F, -0.3F, -0.95F, -1.05F, -0.4F, 0.0F, 0.1F, -0.05F, 0.0F, 0.1F, -0.05F, 0.0F, -1.05F, -0.3F, 0.0F, -1.05F); // Import 
		gunModel[177].setRotationPoint(6.8F, -4.35F, 0.5F);

		gunModel[178].addShapeBox(0F, 0F, -1F, 1, 1, 1, 0F, -0.4F, 0.0F, 0.1F, -0.05F, 0.0F, 0.1F, -0.05F, 0.0F, -1.05F, -0.3F, 0.0F, -1.05F, -0.4F, -0.95F, 0.1F, -0.1F, -0.95F, 0.1F, -0.1F, -0.95F, -1.05F, -0.3F, -0.95F, -1.05F); // Import 
		gunModel[178].setRotationPoint(6.8F, -4.1F, 0.5F);

		gunModel[179].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.0F, -0.8F, 0.05F, 0.0F, -0.8F, 0.05F, 0.0F, -0.8F, -1.0F, 0.0F, -0.8F, -1.0F, 0.0F, -0.15F, 0.05F, 0.05F, -0.15F, 0.05F, 0.05F, -0.15F, -1.0F, 0.0F, -0.15F, -1.0F); // Import 
		gunModel[179].setRotationPoint(1.7F, -4.2F, -0.5F);

		gunModel[180].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.0F, -0.2F, 0.05F, 0.0F, -0.2F, 0.05F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.15F, 0.05F, 0.0F, -0.15F, 0.05F, 0.0F, -0.15F, -1.0F, 0.0F, -0.15F, -1.0F); // Import 
		gunModel[180].setRotationPoint(1.7F, -4.25F, -0.5F);

		gunModel[181].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.0F, -0.15F, 0.05F, 0.05F, -0.15F, 0.05F, 0.05F, -0.15F, -1.0F, 0.0F, -0.15F, -1.0F, 0.0F, -0.8F, 0.05F, 0.0F, -0.8F, 0.05F, 0.0F, -0.8F, -1.0F, 0.0F, -0.8F, -1.0F); // Import 
		gunModel[181].setRotationPoint(1.7F, -4.25F, -0.5F);

		gunModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.1F, -0.45F, -0.5F, -0.1F, -0.45F, -0.5F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.1F, -0.45F, -0.5F, -0.1F, -0.45F); // Import 
		gunModel[182].setRotationPoint(-5.8F, -3.65F, -1.5F);

		gunModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.1F, -0.45F, -0.5F, -0.1F, -0.45F, -0.5F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.1F, -0.45F, -0.5F, -0.1F, -0.45F); // Import 
		gunModel[183].setRotationPoint(-4.3F, -3.65F, -1.5F);

		gunModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.475F, -0.525F, -0.2F, -0.475F, -0.525F, -0.2F, -0.45F, -0.45F, -0.15F, -0.45F, -0.45F, -0.2F, -0.475F, -0.525F, -0.2F, -0.475F, -0.525F, -0.2F, -0.45F, -0.45F, -0.15F, -0.45F, -0.45F); // Import 
		gunModel[184].setRotationPoint(-4.6F, -3.85F, -1.5F);

		gunModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.475F, -0.525F, -0.2F, -0.475F, -0.525F, -0.15F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.475F, -0.525F, -0.2F, -0.475F, -0.525F, -0.15F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F); // Import 
		gunModel[185].setRotationPoint(-5.4F, -3.85F, -1.5F);

		gunModel[186].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -2.4F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, -0.4F, -2.4F, -0.6F, -0.4F, -2.4F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, -0.3F, -2.4F, -0.3F, -0.3F); // Import 
		gunModel[186].setRotationPoint(1F, -3.4F, -0.25F);

		gunModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0F, -0.6F, -0.4F); // Import 
		gunModel[187].setRotationPoint(4.6F, -3F, -0.25F);

		gunModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0F, -0.6F, -0.4F); // Import 
		gunModel[188].setRotationPoint(4.2F, -3F, -0.25F);

		gunModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0F, -0.6F, -0.4F); // Import 
		gunModel[189].setRotationPoint(3.8F, -3F, -0.25F);

		gunModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0F, -0.6F, -0.4F); // Import 
		gunModel[190].setRotationPoint(3.4F, -3F, -0.25F);

		gunModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0F, -0.6F, -0.4F); // Import 
		gunModel[191].setRotationPoint(5.8F, -3F, -0.25F);

		gunModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0F, -0.6F, -0.4F); // Import 
		gunModel[192].setRotationPoint(5.4F, -3F, -0.25F);

		gunModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0F, -0.6F, -0.4F); // Import 
		gunModel[193].setRotationPoint(5F, -3F, -0.25F);

		gunModel[194].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -2.4F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, -2.4F, -0.4F, -0.5F, -2.4F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, -2.4F, -0.3F, -0.5F); // Import 
		gunModel[194].setRotationPoint(1F, -3.5F, -0.25F);

		gunModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 256
		gunModel[195].setRotationPoint(-9.4F, -5.65F, -0.5F);

		gunModel[196].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F, -0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 257
		gunModel[196].setRotationPoint(-7.5F, -3.95F, 0F);

		gunModel[197].addShapeBox(-2F, 0F, -0.5F, 3, 1, 1, 0F, -0.3F, -0.1F, 0.2F, -0.15F, -0.1F, 0.2F, -0.15F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.7F, 0.1F, -0.25F, -0.7F, 0.1F, -0.25F, -0.7F, 0.1F, -0.3F, -0.7F, 0.1F); // Box 258
		gunModel[197].setRotationPoint(-7.5F, -2.95F, 0F);

		gunModel[198].addShapeBox(-2F, 0F, -0.5F, 3, 1, 1, 0F, -0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, -0.9F, 0.2F, -0.15F, -0.9F, 0.2F, -0.15F, -0.9F, 0.2F, -0.3F, -0.9F, 0.2F); // Box 259
		gunModel[198].setRotationPoint(-7.5F, -2.95F, 0F);

		gunModel[199].addShapeBox(0F, -1F, -0.5F, 1, 1, 1, 0F, -0.2F, -0.1F, 0.2F, -0.45F, -0.1F, 0.2F, -0.45F, -0.1F, 0.2F, -0.2F, -0.1F, 0.2F, -0.4F, -0.5F, 0.2F, -0.25F, -0.5F, 0.2F, -0.25F, -0.5F, 0.2F, -0.4F, -0.5F, 0.2F); // Box 260
		gunModel[199].setRotationPoint(-7.5F, -3.95F, 0F);

		gunModel[200].addShapeBox(-2F, -1F, -0.5F, 1, 1, 1, 0F, -0.3F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.3F, -0.2F, 0.2F); // Box 261
		gunModel[200].setRotationPoint(-7.5F, -2.95F, 0F);

		gunModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.45F, 0.2F, -0.5F, -0.45F, 0.2F, -0.5F, -0.45F, 0.2F, -0.1F, -0.45F, 0.2F, -0.1F, -0.4F, 0.1F, -0.5F, -0.4F, 0.1F, -0.5F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F); // Box 262
		gunModel[201].setRotationPoint(-9.2F, -3.35F, -0.5F);

		gunModel[202].addShapeBox(0F, -1F, -0.5F, 1, 1, 1, 0F, 0.1F, -0.5F, 0.2F, -0.1F, -0.5F, 0.2F, -0.1F, -0.5F, 0.2F, 0.1F, -0.5F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F); // Box 263
		gunModel[202].setRotationPoint(-7F, -3.95F, 0F);

		gunModel[203].addShapeBox(0F, -2F, -0.5F, 1, 1, 1, 0F, 0.05F, -0.6F, -0.2F, -0.7F, -0.6F, -0.2F, -0.7F, -0.6F, -0.2F, 0.05F, -0.6F, -0.2F, -0.2F, 0.1F, 0.2F, -0.45F, 0.1F, 0.2F, -0.45F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F); // Box 264
		gunModel[203].setRotationPoint(-7.5F, -3.95F, 0F);

		gunModel[204].addShapeBox(0.6F, -1F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.1F, 0.2F, -0.4F, -0.1F, 0.2F, -0.4F, -0.1F, 0.2F, -0.25F, -0.1F, 0.2F, -0.45F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.45F, -0.5F, 0.2F); // Box 265
		gunModel[204].setRotationPoint(-7.5F, -3.95F, 0F);

		gunModel[205].addShapeBox(0.65F, -2F, -0.5F, 1, 1, 1, 0F, 0.05F, -0.6F, -0.2F, -0.7F, -0.6F, -0.2F, -0.7F, -0.6F, -0.2F, 0.05F, -0.6F, -0.2F, -0.2F, 0.1F, 0.2F, -0.45F, 0.1F, 0.2F, -0.45F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F); // Box 266
		gunModel[205].setRotationPoint(-7.5F, -3.95F, 0F);

		gunModel[206].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F, 0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, -1.05F, 0.5F, 0.3F, -1.05F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1.05F, 0F, -0.2F, -1.05F); // Box 267
		gunModel[206].setRotationPoint(4F, -4.15F, 0F);

		gunModel[207].addShapeBox(-1F, -1F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, -1.05F, -0.25F, -0.2F, -1.05F, -0.5F, -0.3F, 0.2F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F, -1.05F, -0.5F, -0.3F, -1.05F); // Box 268
		gunModel[207].setRotationPoint(4F, -4.15F, 0F);

		gunModel[208].addShapeBox(-0.45F, -1F, -0.5F, 1, 1, 1, 0F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F, -1.05F, -0.3F, -0.2F, -1.05F, -0.55F, -0.3F, 0.2F, -0.05F, -0.3F, 0.2F, -0.05F, -0.3F, -1.05F, -0.55F, -0.3F, -1.05F); // Box 269
		gunModel[208].setRotationPoint(4F, -4.15F, 0F);

		gunModel[209].addShapeBox(-0.45F, -1F, -0.5F, 1, 1, 1, 0F, -0.2F, 0F, 0.05F, -0.4F, 0F, 0.05F, -0.4F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.3F, -0.8F, 0.2F, -0.3F, -0.8F, 0.2F, -0.3F, -0.8F, -1.05F, -0.3F, -0.8F, -1.05F); // Box 270
		gunModel[209].setRotationPoint(4F, -4.15F, 0F);

		gunModel[210].addShapeBox(-1.05F, -1F, -0.5F, 1, 1, 1, 0F, -0.2F, 0F, 0.05F, -0.4F, 0F, 0.05F, -0.4F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.3F, -0.8F, 0.2F, -0.3F, -0.8F, 0.2F, -0.3F, -0.8F, -1.05F, -0.3F, -0.8F, -1.05F); // Box 271
		gunModel[210].setRotationPoint(4F, -4.15F, 0F);

		gunModel[211].addShapeBox(-1.05F, -2F, -0.5F, 1, 1, 1, 0F, -0.15F, -0.9F, -0.03F, -0.45F, -0.9F, -0.03F, -0.45F, -0.9F, -0.03F, -0.15F, -0.9F, -0.03F, -0.2F, 0F, 0.05F, -0.4F, 0F, 0.05F, -0.4F, 0F, 0.05F, -0.2F, 0F, 0.05F); // Box 272
		gunModel[211].setRotationPoint(4F, -4.15F, 0F);

		gunModel[212].addShapeBox(-0.45F, -2F, -0.5F, 1, 1, 1, 0F, -0.15F, -0.9F, -0.03F, -0.45F, -0.9F, -0.03F, -0.45F, -0.9F, -0.03F, -0.15F, -0.9F, -0.03F, -0.2F, 0F, 0.05F, -0.4F, 0F, 0.05F, -0.4F, 0F, 0.05F, -0.2F, 0F, 0.05F); // Box 273
		gunModel[212].setRotationPoint(4F, -4.15F, 0F);

		gunModel[213].addShapeBox(-0.45F, -1F, -0.5F, 1, 1, 1, 0F, -0.3F, -0.2F, -1.05F, -0.3F, -0.2F, -1.05F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F, 0.2F, -0.55F, -0.3F, -1.05F, -0.05F, -0.3F, -1.05F, -0.05F, -0.3F, 0.2F, -0.55F, -0.3F, 0.2F); // Box 274
		gunModel[213].setRotationPoint(4F, -4.15F, 0F);

		gunModel[214].addShapeBox(-0.45F, -1F, -0.5F, 1, 1, 1, 0F, -0.2F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, 0.05F, -0.2F, 0F, 0.05F, -0.3F, -0.8F, -1.05F, -0.3F, -0.8F, -1.05F, -0.3F, -0.8F, 0.2F, -0.3F, -0.8F, 0.2F); // Box 275
		gunModel[214].setRotationPoint(4F, -4.15F, 0F);

		gunModel[215].addShapeBox(-1.05F, -1F, -0.5F, 1, 1, 1, 0F, -0.2F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, 0.05F, -0.2F, 0F, 0.05F, -0.3F, -0.8F, -1.05F, -0.3F, -0.8F, -1.05F, -0.3F, -0.8F, 0.2F, -0.3F, -0.8F, 0.2F); // Box 276
		gunModel[215].setRotationPoint(4F, -4.15F, 0F);

		gunModel[216].addShapeBox(-1F, -1F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.2F, -1.05F, -0.35F, -0.2F, -1.05F, -0.35F, -0.2F, 0.2F, -0.25F, -0.2F, 0.2F, -0.5F, -0.3F, -1.05F, -0.1F, -0.3F, -1.05F, -0.1F, -0.3F, 0.2F, -0.5F, -0.3F, 0.2F); // Box 277
		gunModel[216].setRotationPoint(4F, -4.15F, 0F);

		gunModel[217].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F, 0.5F, 0.3F, -1.05F, -0.5F, 0.3F, -1.05F, -0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0F, -0.2F, -1.05F, 0F, -0.2F, -1.05F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 278
		gunModel[217].setRotationPoint(4F, -4.15F, 0F);

		gunModel[218].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0.0F, -0.1F, -0.35F, 0.0F, -0.1F, -0.35F, 0.0F, -0.1F, -0.35F, 0.0F, -0.1F, -0.35F, 0.0F, -0.1F, -0.35F, 0.0F, -0.1F, -0.35F, 0.0F, -0.1F, -0.35F, 0.0F, -0.1F, -0.35F); // Box 283
		gunModel[218].setRotationPoint(-2F, -5.05F, -0.9F);

		gunModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.1F, -0.35F, -0.9F, -0.2F, -0.35F, -0.9F, -0.2F, -0.35F, 0.0F, -0.1F, -0.35F, 0.0F, -0.1F, -0.35F, -0.9F, -0.2F, -0.35F, -0.9F, -0.2F, -0.35F, 0.0F, -0.1F, -0.35F); // Box 284
		gunModel[219].setRotationPoint(8F, -5.05F, -0.9F);

		gunModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, -0.2F, -0.35F, 0.0F, -0.1F, -0.35F, 0.0F, -0.1F, -0.35F, -0.9F, -0.2F, -0.35F, -0.9F, -0.2F, -0.35F, 0.0F, -0.1F, -0.35F, 0.0F, -0.1F, -0.35F, -0.9F, -0.2F, -0.35F); // Box 285
		gunModel[220].setRotationPoint(-3F, -5.05F, -0.9F);

		gunModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.35F, -0.349F, -0.2F, -0.35F, -0.349F, -0.2F, -0.35F, -0.349F, -0.2F, -0.35F, -0.349F, -0.2F, -0.35F, -0.349F, -0.2F, -0.35F, -0.349F, -0.2F, -0.35F, -0.349F, -0.2F, -0.35F, -0.349F); // Box 286
		gunModel[221].setRotationPoint(7.2F, -5.05F, -0.9F);

		gunModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.4F, -0.349F, -0.35F, -0.4F, -0.349F, -0.35F, -0.4F, -0.349F, -0.35F, -0.4F, -0.349F, -0.2F, -0.45F, -0.349F, -0.2F, -0.45F, -0.349F, -0.2F, -0.45F, -0.349F, -0.2F, -0.45F, -0.349F); // Box 287
		gunModel[222].setRotationPoint(7.2F, -5.25F, -0.9F);

		gunModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.349F, -0.2F, -0.45F, -0.349F, -0.2F, -0.45F, -0.349F, -0.2F, -0.45F, -0.349F, -0.35F, -0.4F, -0.349F, -0.35F, -0.4F, -0.349F, -0.35F, -0.4F, -0.349F, -0.35F, -0.4F, -0.349F); // Box 288
		gunModel[223].setRotationPoint(7.2F, -4.85F, -0.9F);

		gunModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Box 289
		gunModel[224].setRotationPoint(6.5F, -5.05F, -0.9F);

		gunModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Box 290
		gunModel[225].setRotationPoint(6.4F, -5.05F, -0.9F);

		gunModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Box 291
		gunModel[226].setRotationPoint(6.2F, -5.05F, -0.9F);

		gunModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Box 292
		gunModel[227].setRotationPoint(6.3F, -5.05F, -0.9F);

		gunModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Box 293
		gunModel[228].setRotationPoint(5.8F, -5.05F, -0.9F);

		gunModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Box 294
		gunModel[229].setRotationPoint(5.9F, -5.05F, -0.9F);

		gunModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Box 295
		gunModel[230].setRotationPoint(6F, -5.05F, -0.9F);

		gunModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Box 296
		gunModel[231].setRotationPoint(6.1F, -5.05F, -0.9F);

		gunModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Box 297
		gunModel[232].setRotationPoint(5F, -5.05F, -0.9F);

		gunModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Box 298
		gunModel[233].setRotationPoint(5.1F, -5.05F, -0.9F);

		gunModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Box 299
		gunModel[234].setRotationPoint(5.2F, -5.05F, -0.9F);

		gunModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Box 300
		gunModel[235].setRotationPoint(5.3F, -5.05F, -0.9F);

		gunModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Box 301
		gunModel[236].setRotationPoint(5.4F, -5.05F, -0.9F);

		gunModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Box 302
		gunModel[237].setRotationPoint(5.5F, -5.05F, -0.9F);

		gunModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Box 303
		gunModel[238].setRotationPoint(5.6F, -5.05F, -0.9F);

		gunModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Box 304
		gunModel[239].setRotationPoint(5.7F, -5.05F, -0.9F);

		gunModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Box 305
		gunModel[240].setRotationPoint(4.9F, -5.05F, -0.9F);

		gunModel[241].addShapeBox(0F, 0F, -0.5F, 2, 1, 1, 0F, 0.3F, 0.3F, 0.1F, -0.5F, 0.3F, 0.1F, -0.5F, 0.3F, -1.05F, 0.3F, 0.3F, -1.05F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -1.05F, 0.3F, -0.2F, -1.05F); // Box 306
		gunModel[241].setRotationPoint(2F, -4.15F, 0F);

		gunModel[242].addShapeBox(-1F, -1F, -0.5F, 1, 1, 1, 0F, 0.3F, -0.2F, 0.1F, 0.25F, -0.2F, 0.1F, 0.25F, -0.2F, -1.05F, 0.3F, -0.2F, -1.05F, 0.3F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, -1.05F, 0.3F, -0.3F, -1.05F); // Box 307
		gunModel[242].setRotationPoint(3F, -4.15F, 0F);

		gunModel[243].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F, 0.45F, 0.1F, 0.15F, -1.35F, 0.1F, 0.15F, -1.35F, 0.1F, -1.05F, 0.45F, 0.1F, -1.05F, 0F, -0.2F, 0.15F, -0.9F, -0.2F, 0.15F, -0.9F, -0.2F, -1.05F, 0F, -0.2F, -1.05F); // Box 308
		gunModel[243].setRotationPoint(2.6F, -4.15F, 0F);

		gunModel[244].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F, 0.45F, 0.1F, 0.15F, -1.35F, 0.1F, 0.15F, -1.35F, 0.1F, -1.05F, 0.45F, 0.1F, -1.05F, 0F, -0.2F, 0.15F, -0.9F, -0.2F, 0.15F, -0.9F, -0.2F, -1.05F, 0F, -0.2F, -1.05F); // Box 309
		gunModel[244].setRotationPoint(2.95F, -4.15F, 0F);

		gunModel[245].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F, 0.45F, 0.1F, 0.15F, -1.35F, 0.1F, 0.15F, -1.35F, 0.1F, -1.05F, 0.45F, 0.1F, -1.05F, 0F, -0.2F, 0.15F, -0.9F, -0.2F, 0.15F, -0.9F, -0.2F, -1.05F, 0F, -0.2F, -1.05F); // Box 310
		gunModel[245].setRotationPoint(3.3F, -4.15F, 0F);

		gunModel[246].addShapeBox(0F, 0F, -0.5F, 2, 1, 1, 0F, 0.3F, 0.3F, -1.05F, -0.5F, 0.3F, -1.05F, -0.5F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, -0.2F, -1.05F, 0F, -0.2F, -1.05F, 0F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 311
		gunModel[246].setRotationPoint(2F, -4.15F, 0F);

		gunModel[247].addShapeBox(-1F, -1F, -0.5F, 1, 1, 1, 0F, 0.3F, -0.2F, -1.05F, 0.25F, -0.2F, -1.05F, 0.25F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.3F, -0.3F, -1.05F, 0.5F, -0.3F, -1.05F, 0.5F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F); // Box 312
		gunModel[247].setRotationPoint(3F, -4.15F, 0F);

		gunModel[248].addShapeBox(0F, 0F, -1F, 7, 1, 1, 0F, -0.1F, -0.9F, -1.15F, 0.1F, -0.9F, -1.15F, 0.1F, -0.9F, 0.2F, -0.1F, -0.9F, 0.2F, -0.1F, 0F, -1.15F, 0.1F, 0F, -1.15F, 0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F); // Box 313
		gunModel[248].setRotationPoint(1.6F, -4.25F, 0.5F);

		gunModel[249].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F, 0.45F, 0.1F, -1.05F, -1.35F, 0.1F, -1.05F, -1.35F, 0.1F, 0.15F, 0.45F, 0.1F, 0.15F, 0F, -0.2F, -1.05F, -0.9F, -0.2F, -1.05F, -0.9F, -0.2F, 0.15F, 0F, -0.2F, 0.15F); // Box 314
		gunModel[249].setRotationPoint(3.3F, -4.15F, 0F);

		gunModel[250].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F, 0.45F, 0.1F, -1.05F, -1.35F, 0.1F, -1.05F, -1.35F, 0.1F, 0.15F, 0.45F, 0.1F, 0.15F, 0F, -0.2F, -1.05F, -0.9F, -0.2F, -1.05F, -0.9F, -0.2F, 0.15F, 0F, -0.2F, 0.15F); // Box 315
		gunModel[250].setRotationPoint(2.95F, -4.15F, 0F);

		gunModel[251].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F, 0.45F, 0.1F, -1.05F, -1.35F, 0.1F, -1.05F, -1.35F, 0.1F, 0.15F, 0.45F, 0.1F, 0.15F, 0F, -0.2F, -1.05F, -0.9F, -0.2F, -1.05F, -0.9F, -0.2F, 0.15F, 0F, -0.2F, 0.15F); // Box 316
		gunModel[251].setRotationPoint(2.6F, -4.15F, 0F);

		gunModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, 0.215F, -0.5F, -0.3F, 0.215F, -0.5F, -0.3F, 0.215F, -0.3F, -0.3F, 0.215F, -0.3F, -0.3F, 0.215F, -0.5F, -0.3F, 0.215F, -0.5F, -0.3F, 0.215F, -0.3F, -0.3F, 0.215F); // Box 317
		gunModel[252].setRotationPoint(-2.3F, -4.85F, -0.5F);

		gunModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.02F, -0.15F, -0.3F, -0.02F, -0.15F, -0.3F, -0.02F, -0.45F, -0.3F, -0.02F, -0.3F, -0.3F, -0.02F, -0.3F, -0.3F, -0.02F, -0.3F, -0.3F, -0.02F, -0.3F, -0.3F, -0.02F); // Box 318
		gunModel[253].setRotationPoint(-1.3F, -2.2F, -0.5F);

		gunModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.02F, -0.15F, -0.3F, -0.02F, -0.15F, -0.3F, -0.02F, -0.45F, -0.3F, -0.02F, -0.3F, -0.3F, -0.02F, -0.3F, -0.3F, -0.02F, -0.3F, -0.3F, -0.02F, -0.3F, -0.3F, -0.02F); // Box 319
		gunModel[254].setRotationPoint(-1.5F, -1.7F, -0.5F);

		gunModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.02F, -0.15F, -0.3F, -0.02F, -0.15F, -0.3F, -0.02F, -0.45F, -0.3F, -0.02F, -0.3F, -0.3F, -0.02F, -0.3F, -0.3F, -0.02F, -0.3F, -0.3F, -0.02F, -0.3F, -0.3F, -0.02F); // Box 320
		gunModel[255].setRotationPoint(-1.7F, -1.2F, -0.5F);

		gunModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, 0.215F, -0.4F, -0.4F, 0.215F, -0.4F, -0.4F, 0.215F, -0.4F, -0.4F, 0.215F, -0.4F, -0.4F, 0.215F, -0.4F, -0.4F, 0.215F, -0.4F, -0.4F, 0.215F, -0.4F, -0.4F, 0.215F); // Box 321
		gunModel[256].setRotationPoint(-2.7F, -3.5F, -0.5F);

		gunModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.9F, 0F, -0.7F, -0.9F, 0F, -0.7F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0.1F, 0.0F, 0.1F, -0.7F, 0.0F, 0.1F, -0.7F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F); // Box 322
		gunModel[257].setRotationPoint(-9F, -5.25F, -0.5F);

		gunModel[258].addShapeBox(0F, 0F, 0F, 32, 32, 1, 0F, -15.6F, -15.6F, -0.4F, -15.6F, -15.6F, -0.4F, -15.6F, -15.6F, -0.4F, -15.6F, -15.6F, -0.4F, -15.6F, -15.6F, -0.4F, -15.6F, -15.6F, -0.4F, -15.6F, -15.6F, -0.4F, -15.6F, -15.6F, -0.4F); // Box 323
		gunModel[258].setRotationPoint(-17.25F, -20F, -1.12F);

		gunModel[259].addShapeBox(0F, 0F, 0F, 32, 32, 1, 0F, -15.6F, -15.6F, -0.4F, -15.6F, -15.6F, -0.4F, -15.6F, -15.6F, -0.4F, -15.6F, -15.6F, -0.4F, -15.6F, -15.6F, -0.4F, -15.6F, -15.6F, -0.4F, -15.6F, -15.6F, -0.4F, -15.6F, -15.6F, -0.4F); // Box 282
		gunModel[259].setRotationPoint(-17.25F, -20F, 0.12F);

		gunModel[260].addShapeBox(1F, 0F, 0F, 100, 100, 1, 0F, -49.4F, -49.4F, -0.45F, -49.4F, -49.4F, -0.45F, -49.4F, -49.4F, -0.45F, -49.4F, -49.4F, -0.45F, -49.4F, -49.4F, -0.45F, -49.4F, -49.4F, -0.45F, -49.4F, -49.4F, -0.45F, -49.4F, -49.4F, -0.45F); // Box 283
		gunModel[260].setRotationPoint(-50.5F, -54.25F, 0.19F);


		ammoModel = new ModelRendererTurbo[23];
		ammoModel[0] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Import 
		ammoModel[1] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Import 
		ammoModel[2] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Import 
		ammoModel[3] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Import 
		ammoModel[4] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Import 
		ammoModel[5] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Import 
		ammoModel[6] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Import 
		ammoModel[7] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Import 
		ammoModel[8] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Import 
		ammoModel[9] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Import 
		ammoModel[10] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Import 
		ammoModel[11] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Import 
		ammoModel[12] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Import 
		ammoModel[13] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Import 
		ammoModel[14] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Import 
		ammoModel[15] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Import 
		ammoModel[16] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Import 
		ammoModel[17] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import 
		ammoModel[18] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Import 
		ammoModel[19] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Import 
		ammoModel[20] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Import 
		ammoModel[21] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Import 
		ammoModel[22] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Import 

		ammoModel[0].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0.0F, -0.1F, -0.35F, 0.0F, -0.1F, -0.35F, 0.0F, -0.1F, -0.35F, 0.0F, -0.1F, -0.35F, 0.0F, -0.1F, -0.35F, 0.0F, -0.1F, -0.35F, 0.0F, -0.1F, -0.35F, 0.0F, -0.1F, -0.35F); // Import 
		ammoModel[0].setRotationPoint(-3F, -5.25F, -0.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.1F, -0.35F, -0.9F, -0.2F, -0.35F, -0.9F, -0.2F, -0.35F, 0.0F, -0.1F, -0.35F, 0.0F, -0.1F, -0.35F, -0.9F, -0.2F, -0.35F, -0.9F, -0.2F, -0.35F, 0.0F, -0.1F, -0.35F); // Import 
		ammoModel[1].setRotationPoint(7F, -5.25F, -0.5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, -0.2F, -0.35F, 0.0F, -0.1F, -0.35F, 0.0F, -0.1F, -0.35F, -0.9F, -0.2F, -0.35F, -0.9F, -0.2F, -0.35F, 0.0F, -0.1F, -0.35F, 0.0F, -0.1F, -0.35F, -0.9F, -0.2F, -0.35F); // Import 
		ammoModel[2].setRotationPoint(-4F, -5.25F, -0.5F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.35F, -0.349F, -0.2F, -0.35F, -0.349F, -0.2F, -0.35F, -0.349F, -0.2F, -0.35F, -0.349F, -0.2F, -0.35F, -0.349F, -0.2F, -0.35F, -0.349F, -0.2F, -0.35F, -0.349F, -0.2F, -0.35F, -0.349F); // Import 
		ammoModel[3].setRotationPoint(6.2F, -5.25F, -0.5F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.4F, -0.349F, -0.35F, -0.4F, -0.349F, -0.35F, -0.4F, -0.349F, -0.35F, -0.4F, -0.349F, -0.2F, -0.45F, -0.349F, -0.2F, -0.45F, -0.349F, -0.2F, -0.45F, -0.349F, -0.2F, -0.45F, -0.349F); // Import 
		ammoModel[4].setRotationPoint(6.2F, -5.45F, -0.5F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.349F, -0.2F, -0.45F, -0.349F, -0.2F, -0.45F, -0.349F, -0.2F, -0.45F, -0.349F, -0.35F, -0.4F, -0.349F, -0.35F, -0.4F, -0.349F, -0.35F, -0.4F, -0.349F, -0.35F, -0.4F, -0.349F); // Import 
		ammoModel[5].setRotationPoint(6.2F, -5.05F, -0.5F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Import 
		ammoModel[6].setRotationPoint(5.5F, -5.25F, -0.5F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Import 
		ammoModel[7].setRotationPoint(5.4F, -5.25F, -0.5F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Import 
		ammoModel[8].setRotationPoint(5.2F, -5.25F, -0.5F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Import 
		ammoModel[9].setRotationPoint(5.3F, -5.25F, -0.5F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Import 
		ammoModel[10].setRotationPoint(4.8F, -5.25F, -0.5F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Import 
		ammoModel[11].setRotationPoint(4.9F, -5.25F, -0.5F);

		ammoModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Import 
		ammoModel[12].setRotationPoint(5F, -5.25F, -0.5F);

		ammoModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Import 
		ammoModel[13].setRotationPoint(5.1F, -5.25F, -0.5F);

		ammoModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Import 
		ammoModel[14].setRotationPoint(4F, -5.25F, -0.5F);

		ammoModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Import 
		ammoModel[15].setRotationPoint(4.1F, -5.25F, -0.5F);

		ammoModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Import 
		ammoModel[16].setRotationPoint(4.2F, -5.25F, -0.5F);

		ammoModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Import 
		ammoModel[17].setRotationPoint(4.3F, -5.25F, -0.5F);

		ammoModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Import 
		ammoModel[18].setRotationPoint(4.4F, -5.25F, -0.5F);

		ammoModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Import 
		ammoModel[19].setRotationPoint(4.5F, -5.25F, -0.5F);

		ammoModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Import 
		ammoModel[20].setRotationPoint(4.6F, -5.25F, -0.5F);

		ammoModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Import 
		ammoModel[21].setRotationPoint(4.7F, -5.25F, -0.5F);

		ammoModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.5F, -0.3F, -0.349F, -0.45F, -0.3F, -0.349F); // Import 
		ammoModel[22].setRotationPoint(3.9F, -5.25F, -0.5F);


		gadgetAttachPoint = new Vector3f(30F / 64F, 17.7F / 64F, -2.8F / 64F);
		scopeAttachPoint = new Vector3f(5F / 64F, 24.7F / 64F, 0F / 16F);
		gripAttachPoint = new Vector3f(28 / 64F, 13.5F / 64F, 0F / 16F);
		gunSlideDistance = 0.1F;
		animationType = EnumAnimationType.CUSTOM;
		rotateGunVertical = 40.0F;
		rotateGunHorizontal = 75.0F;
		tiltGun = 10.0F;
		translateGun = new Vector3f(0.1875F, 0.125F, -0.0625F);
		translateClip = new Vector3f(1.875F, 0.0F, 0.0F);
		translateAll(2F, -0.7F, 0.0F);

		hasFlash = true;
		hasArms = true;
		muzzleFlashPoint = new Vector3f(35 / 16F, 10F / 16F, 0F / 16F);
		flashScale = 0.4F;
		leftArmPos = new Vector3f(0.05F, -0.4F, -0.05F);
		leftArmRot = new Vector3f(80.0F, 50.0F, 0.0F);
		leftArmReloadPos = new Vector3f(-0.15F, -0.55F, 0.05F);
		leftArmReloadRot = new Vector3f(80.0F, 50.0F, 0.0F);
		rightArmPos = new Vector3f(0.235F, -0.53F, 0.0F);
		rightArmRot = new Vector3f(0.0F, 0.0F, -85.0F);
		rightArmReloadPos = new Vector3f(0.235F, -0.53F, 0.0F);
		rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85.0F);
		rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
		leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
		rightHandAmmo = false;
		leftHandAmmo = true;
		fancyStance = true;
		stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
		stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);

		gunOffset = -0.2F;
		zoomOffsetY = -0.03F;
		zoomOffset = 0.2F;
		crouchZoom = -0.075F;

		flipAll();
	}
}