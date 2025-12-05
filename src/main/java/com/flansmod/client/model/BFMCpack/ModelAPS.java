//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: APS
// Model Creator: 
// Created on: 05.11.2022 - 19:36:33
// Last changed on: 05.11.2022 - 19:36:33

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelAPS extends ModelGun //Same as Filename
{
    int textureX = 1024;
    int textureY = 512;

    public ModelAPS() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[219];
        gunModel[0] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 17
        gunModel[1] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 20
        gunModel[2] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 21
        gunModel[3] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 22
        gunModel[4] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 23
        gunModel[5] = new ModelRendererTurbo(this, 713, 9, textureX, textureY); // Box 24
        gunModel[6] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 25
        gunModel[7] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 26
        gunModel[8] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Box 27
        gunModel[9] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 28
        gunModel[10] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 29
        gunModel[11] = new ModelRendererTurbo(this, 569, 25, textureX, textureY); // Box 30
        gunModel[12] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 31
        gunModel[13] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 32
        gunModel[14] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 33
        gunModel[15] = new ModelRendererTurbo(this, 721, 33, textureX, textureY); // Box 34
        gunModel[16] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 100
        gunModel[17] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 102
        gunModel[18] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 103
        gunModel[19] = new ModelRendererTurbo(this, 585, 73, textureX, textureY); // Box 104
        gunModel[20] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 105
        gunModel[21] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 106
        gunModel[22] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 91
        gunModel[23] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 92
        gunModel[24] = new ModelRendererTurbo(this, 657, 81, textureX, textureY); // Box 93
        gunModel[25] = new ModelRendererTurbo(this, 705, 81, textureX, textureY); // Box 94
        gunModel[26] = new ModelRendererTurbo(this, 761, 81, textureX, textureY); // Box 95
        gunModel[27] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Box 96
        gunModel[28] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 97
        gunModel[29] = new ModelRendererTurbo(this, 969, 81, textureX, textureY); // Box 98
        gunModel[30] = new ModelRendererTurbo(this, 865, 89, textureX, textureY); // Box 99
        gunModel[31] = new ModelRendererTurbo(this, 609, 89, textureX, textureY); // Box 100
        gunModel[32] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 126
        gunModel[33] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 127
        gunModel[34] = new ModelRendererTurbo(this, 705, 57, textureX, textureY); // Box 128
        gunModel[35] = new ModelRendererTurbo(this, 969, 65, textureX, textureY); // Box 133
        gunModel[36] = new ModelRendererTurbo(this, 1009, 81, textureX, textureY); // Box 134
        gunModel[37] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Box 135
        gunModel[38] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 136
        gunModel[39] = new ModelRendererTurbo(this, 705, 65, textureX, textureY); // Box 137
        gunModel[40] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 138
        gunModel[41] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 139
        gunModel[42] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 148
        gunModel[43] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 149
        gunModel[44] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 150
        gunModel[45] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 151
        gunModel[46] = new ModelRendererTurbo(this, 641, 113, textureX, textureY); // Box 152
        gunModel[47] = new ModelRendererTurbo(this, 521, 113, textureX, textureY); // Box 153
        gunModel[48] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 154
        gunModel[49] = new ModelRendererTurbo(this, 753, 121, textureX, textureY); // Box 155
        gunModel[50] = new ModelRendererTurbo(this, 905, 105, textureX, textureY); // Box 156
        gunModel[51] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 157
        gunModel[52] = new ModelRendererTurbo(this, 929, 113, textureX, textureY); // Box 158
        gunModel[53] = new ModelRendererTurbo(this, 849, 121, textureX, textureY); // Box 159
        gunModel[54] = new ModelRendererTurbo(this, 969, 121, textureX, textureY); // Box 160
        gunModel[55] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 161
        gunModel[56] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Box 162
        gunModel[57] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 163
        gunModel[58] = new ModelRendererTurbo(this, 577, 97, textureX, textureY); // Box 164
        gunModel[59] = new ModelRendererTurbo(this, 689, 81, textureX, textureY); // Box 165
        gunModel[60] = new ModelRendererTurbo(this, 745, 81, textureX, textureY); // Box 166
        gunModel[61] = new ModelRendererTurbo(this, 801, 81, textureX, textureY); // Box 167
        gunModel[62] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 168
        gunModel[63] = new ModelRendererTurbo(this, 737, 105, textureX, textureY); // Box 169
        gunModel[64] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 170
        gunModel[65] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 171
        gunModel[66] = new ModelRendererTurbo(this, 905, 129, textureX, textureY); // Box 172
        gunModel[67] = new ModelRendererTurbo(this, 865, 89, textureX, textureY); // Box 173
        gunModel[68] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 174
        gunModel[69] = new ModelRendererTurbo(this, 969, 89, textureX, textureY); // Box 175
        gunModel[70] = new ModelRendererTurbo(this, 609, 121, textureX, textureY); // Box 176
        gunModel[71] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 177
        gunModel[72] = new ModelRendererTurbo(this, 737, 121, textureX, textureY); // Box 178
        gunModel[73] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 179
        gunModel[74] = new ModelRendererTurbo(this, 833, 121, textureX, textureY); // Box 180
        gunModel[75] = new ModelRendererTurbo(this, 801, 145, textureX, textureY); // Box 194
        gunModel[76] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 195
        gunModel[77] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 196
        gunModel[78] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 197
        gunModel[79] = new ModelRendererTurbo(this, 905, 153, textureX, textureY); // Box 198
        gunModel[80] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 199
        gunModel[81] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Box 200
        gunModel[82] = new ModelRendererTurbo(this, 553, 161, textureX, textureY); // Box 201
        gunModel[83] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Box 202
        gunModel[84] = new ModelRendererTurbo(this, 625, 161, textureX, textureY); // Box 203
        gunModel[85] = new ModelRendererTurbo(this, 689, 161, textureX, textureY); // Box 204
        gunModel[86] = new ModelRendererTurbo(this, 745, 161, textureX, textureY); // Box 205
        gunModel[87] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 206
        gunModel[88] = new ModelRendererTurbo(this, 961, 161, textureX, textureY); // Box 207
        gunModel[89] = new ModelRendererTurbo(this, 377, 177, textureX, textureY); // Box 208
        gunModel[90] = new ModelRendererTurbo(this, 785, 177, textureX, textureY); // Box 209
        gunModel[91] = new ModelRendererTurbo(this, 849, 177, textureX, textureY); // Box 210
        gunModel[92] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 211
        gunModel[93] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Box 212
        gunModel[94] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Box 213
        gunModel[95] = new ModelRendererTurbo(this, 889, 185, textureX, textureY); // Box 214
        gunModel[96] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Box 215
        gunModel[97] = new ModelRendererTurbo(this, 145, 193, textureX, textureY); // Box 216
        gunModel[98] = new ModelRendererTurbo(this, 273, 193, textureX, textureY); // Box 217
        gunModel[99] = new ModelRendererTurbo(this, 329, 193, textureX, textureY); // Box 218
        gunModel[100] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Box 219
        gunModel[101] = new ModelRendererTurbo(this, 577, 193, textureX, textureY); // Box 220
        gunModel[102] = new ModelRendererTurbo(this, 633, 193, textureX, textureY); // Box 221
        gunModel[103] = new ModelRendererTurbo(this, 689, 193, textureX, textureY); // Box 222
        gunModel[104] = new ModelRendererTurbo(this, 945, 193, textureX, textureY); // Box 223
        gunModel[105] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Box 224
        gunModel[106] = new ModelRendererTurbo(this, 737, 201, textureX, textureY); // Box 225
        gunModel[107] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 227
        gunModel[108] = new ModelRendererTurbo(this, 777, 209, textureX, textureY); // Box 229
        gunModel[109] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 230
        gunModel[110] = new ModelRendererTurbo(this, 129, 225, textureX, textureY); // Box 231
        gunModel[111] = new ModelRendererTurbo(this, 601, 225, textureX, textureY); // Box 233
        gunModel[112] = new ModelRendererTurbo(this, 665, 233, textureX, textureY); // Box 234
        gunModel[113] = new ModelRendererTurbo(this, 945, 225, textureX, textureY); // Box 235
        gunModel[114] = new ModelRendererTurbo(this, 529, 161, textureX, textureY); // Box 236
        gunModel[115] = new ModelRendererTurbo(this, 889, 121, textureX, textureY); // Box 237
        gunModel[116] = new ModelRendererTurbo(this, 465, 241, textureX, textureY); // Box 238
        gunModel[117] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Box 239
        gunModel[118] = new ModelRendererTurbo(this, 545, 241, textureX, textureY); // Box 240
        gunModel[119] = new ModelRendererTurbo(this, 729, 241, textureX, textureY); // Box 241
        gunModel[120] = new ModelRendererTurbo(this, 785, 241, textureX, textureY); // Box 242
        gunModel[121] = new ModelRendererTurbo(this, 241, 249, textureX, textureY); // Box 243
        gunModel[122] = new ModelRendererTurbo(this, 297, 249, textureX, textureY); // Box 244
        gunModel[123] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 245
        gunModel[124] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 246
        gunModel[125] = new ModelRendererTurbo(this, 1001, 121, textureX, textureY); // Box 247
        gunModel[126] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 248
        gunModel[127] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 249
        gunModel[128] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 250
        gunModel[129] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 251
        gunModel[130] = new ModelRendererTurbo(this, 321, 153, textureX, textureY); // Box 252
        gunModel[131] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 253
        gunModel[132] = new ModelRendererTurbo(this, 961, 153, textureX, textureY); // Box 254
        gunModel[133] = new ModelRendererTurbo(this, 1001, 153, textureX, textureY); // Box 255
        gunModel[134] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 297
        gunModel[135] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Box 298
        gunModel[136] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 299
        gunModel[137] = new ModelRendererTurbo(this, 865, 105, textureX, textureY); // Box 300
        gunModel[138] = new ModelRendererTurbo(this, 945, 105, textureX, textureY); // Box 301
        gunModel[139] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 302
        gunModel[140] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 303
        gunModel[141] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 304
        gunModel[142] = new ModelRendererTurbo(this, 665, 161, textureX, textureY); // Box 305
        gunModel[143] = new ModelRendererTurbo(this, 721, 161, textureX, textureY); // Box 306
        gunModel[144] = new ModelRendererTurbo(this, 745, 161, textureX, textureY); // Box 307
        gunModel[145] = new ModelRendererTurbo(this, 81, 233, textureX, textureY); // Box 308
        gunModel[146] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 309
        gunModel[147] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 310
        gunModel[148] = new ModelRendererTurbo(this, 689, 169, textureX, textureY); // Box 311
        gunModel[149] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 312
        gunModel[150] = new ModelRendererTurbo(this, 825, 177, textureX, textureY); // Box 313
        gunModel[151] = new ModelRendererTurbo(this, 921, 185, textureX, textureY); // Box 314
        gunModel[152] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Box 315
        gunModel[153] = new ModelRendererTurbo(this, 553, 193, textureX, textureY); // Box 316
        gunModel[154] = new ModelRendererTurbo(this, 609, 193, textureX, textureY); // Box 317
        gunModel[155] = new ModelRendererTurbo(this, 665, 193, textureX, textureY); // Box 318
        gunModel[156] = new ModelRendererTurbo(this, 977, 193, textureX, textureY); // Box 319
        gunModel[157] = new ModelRendererTurbo(this, 129, 201, textureX, textureY); // Box 320
        gunModel[158] = new ModelRendererTurbo(this, 857, 209, textureX, textureY); // Box 321
        gunModel[159] = new ModelRendererTurbo(this, 985, 209, textureX, textureY); // Box 322
        gunModel[160] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 323
        gunModel[161] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 324
        gunModel[162] = new ModelRendererTurbo(this, 521, 113, textureX, textureY); // Box 325
        gunModel[163] = new ModelRendererTurbo(this, 641, 105, textureX, textureY); // Box 326
        gunModel[164] = new ModelRendererTurbo(this, 729, 105, textureX, textureY); // Box 327
        gunModel[165] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 328
        gunModel[166] = new ModelRendererTurbo(this, 769, 113, textureX, textureY); // Box 329
        gunModel[167] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 330
        gunModel[168] = new ModelRendererTurbo(this, 905, 105, textureX, textureY); // Box 331
        gunModel[169] = new ModelRendererTurbo(this, 785, 113, textureX, textureY); // Box 332
        gunModel[170] = new ModelRendererTurbo(this, 633, 121, textureX, textureY); // Box 333
        gunModel[171] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 334
        gunModel[172] = new ModelRendererTurbo(this, 969, 121, textureX, textureY); // Box 335
        gunModel[173] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 336
        gunModel[174] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 337
        gunModel[175] = new ModelRendererTurbo(this, 929, 137, textureX, textureY); // Box 338
        gunModel[176] = new ModelRendererTurbo(this, 617, 105, textureX, textureY); // Box 339
        gunModel[177] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 340
        gunModel[178] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 341
        gunModel[179] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Box 342
        gunModel[180] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Box 343
        gunModel[181] = new ModelRendererTurbo(this, 785, 169, textureX, textureY); // Box 344
        gunModel[182] = new ModelRendererTurbo(this, 449, 185, textureX, textureY); // Box 345
        gunModel[183] = new ModelRendererTurbo(this, 849, 185, textureX, textureY); // Box 346
        gunModel[184] = new ModelRendererTurbo(this, 521, 241, textureX, textureY); // Box 347
        gunModel[185] = new ModelRendererTurbo(this, 761, 241, textureX, textureY); // Box 348
        gunModel[186] = new ModelRendererTurbo(this, 889, 177, textureX, textureY); // Box 350
        gunModel[187] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Box 351
        gunModel[188] = new ModelRendererTurbo(this, 601, 177, textureX, textureY); // Box 352
        gunModel[189] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 353
        gunModel[190] = new ModelRendererTurbo(this, 721, 177, textureX, textureY); // Box 354
        gunModel[191] = new ModelRendererTurbo(this, 273, 249, textureX, textureY); // Box 357
        gunModel[192] = new ModelRendererTurbo(this, 81, 193, textureX, textureY); // Box 358
        gunModel[193] = new ModelRendererTurbo(this, 737, 193, textureX, textureY); // Box 359
        gunModel[194] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Box 360
        gunModel[195] = new ModelRendererTurbo(this, 361, 201, textureX, textureY); // Box 361
        gunModel[196] = new ModelRendererTurbo(this, 441, 249, textureX, textureY); // Box 363
        gunModel[197] = new ModelRendererTurbo(this, 577, 193, textureX, textureY); // Box 364
        gunModel[198] = new ModelRendererTurbo(this, 633, 193, textureX, textureY); // Box 365
        gunModel[199] = new ModelRendererTurbo(this, 329, 257, textureX, textureY); // Box 366
        gunModel[200] = new ModelRendererTurbo(this, 577, 249, textureX, textureY); // Box 367
        gunModel[201] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 368
        gunModel[202] = new ModelRendererTurbo(this, 801, 113, textureX, textureY); // Box 369
        gunModel[203] = new ModelRendererTurbo(this, 937, 137, textureX, textureY); // Box 370
        gunModel[204] = new ModelRendererTurbo(this, 953, 137, textureX, textureY); // Box 371
        gunModel[205] = new ModelRendererTurbo(this, 153, 153, textureX, textureY); // Box 372
        gunModel[206] = new ModelRendererTurbo(this, 345, 153, textureX, textureY); // Box 373
        gunModel[207] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Box 374
        gunModel[208] = new ModelRendererTurbo(this, 985, 153, textureX, textureY); // Box 375
        gunModel[209] = new ModelRendererTurbo(this, 689, 161, textureX, textureY); // Box 376
        gunModel[210] = new ModelRendererTurbo(this, 737, 161, textureX, textureY); // Box 377
        gunModel[211] = new ModelRendererTurbo(this, 785, 161, textureX, textureY); // Box 378
        gunModel[212] = new ModelRendererTurbo(this, 801, 161, textureX, textureY); // Box 379
        gunModel[213] = new ModelRendererTurbo(this, 585, 257, textureX, textureY); // Box 381
        gunModel[214] = new ModelRendererTurbo(this, 849, 257, textureX, textureY); // Box 382
        gunModel[215] = new ModelRendererTurbo(this, 921, 257, textureX, textureY); // Box 383
        gunModel[216] = new ModelRendererTurbo(this, 785, 273, textureX, textureY); // Box 430
        gunModel[217] = new ModelRendererTurbo(this, 73, 281, textureX, textureY); // Box 432
        gunModel[218] = new ModelRendererTurbo(this, 129, 281, textureX, textureY); // Box 433

        gunModel[0].addShapeBox(0F, 0F, 0F, 115, 2, 2, 0F, 0F, -0.9F, -2F, -1F, -0.9F, -2F, 0F, -2.75F, 0.5F, 0F, -2.75F, 0.5F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F); // Box 17
        gunModel[0].setRotationPoint(0F, -115F, -4F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 115, 2, 3, 0F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 20
        gunModel[1].setRotationPoint(0F, -111F, -5.5F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 115, 3, 2, 0F, 0F, -0.9F, 0F, -1F, -0.9F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 21
        gunModel[2].setRotationPoint(0F, -115F, -2F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 115, 2, 2, 0F, 0F, -0.5F, -1F, -1F, -0.5F, -1F, 0F, -1.75F, 0.5F, 0F, -1.75F, 0.5F, 0F, 0.25F, 0.1F, -1F, 0.25F, 0.1F, 0F, 1F, -0.25F, 0F, 1F, -0.25F); // Box 22
        gunModel[3].setRotationPoint(0F, -113.25F, -5F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 115, 2, 2, 0F, 0F, -2.75F, 0.5F, 0F, -2.75F, 0.5F, -1F, -0.9F, -2F, 0F, -0.9F, -2F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 23
        gunModel[4].setRotationPoint(0F, -115F, 2F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 115, 2, 3, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 24
        gunModel[5].setRotationPoint(0F, -111F, 2.5F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 115, 3, 2, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 25
        gunModel[6].setRotationPoint(0F, -115F, 0F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 115, 2, 2, 0F, 0F, -1.75F, 0.5F, 0F, -1.75F, 0.5F, -1F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, -1F, 0.25F, 0.1F, 0F, 0.25F, 0.1F); // Box 26
        gunModel[7].setRotationPoint(0F, -113.25F, 3F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 115, 2, 3, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 27
        gunModel[8].setRotationPoint(0F, -109F, -5.5F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 115, 2, 2, 0F, 0F, 0.25F, 0.1F, -1F, 0.25F, 0.1F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -0.5F, -1F, -1F, -0.5F, -1F, 0F, -1.75F, 0.5F, 0F, -1.75F, 0.5F); // Box 28
        gunModel[9].setRotationPoint(0F, -106.75F, -5F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 115, 2, 2, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, -0.9F, -2F, -1F, -0.9F, -2F, 0F, -2.75F, 0.5F, 0F, -2.75F, 0.5F); // Box 29
        gunModel[10].setRotationPoint(0F, -105F, -4F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 115, 3, 2, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.9F, 0F, -1F, -0.9F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 30
        gunModel[11].setRotationPoint(0F, -106F, -2F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 115, 3, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.9F, 0F, 0F, -0.9F, 0F); // Box 31
        gunModel[12].setRotationPoint(0F, -106F, 0F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 115, 2, 2, 0F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2.75F, 0.5F, 0F, -2.75F, 0.5F, -1F, -0.9F, -2F, 0F, -0.9F, -2F); // Box 32
        gunModel[13].setRotationPoint(0F, -105F, 2F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 115, 2, 2, 0F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, -1F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, -1.75F, 0.5F, 0F, -1.75F, 0.5F, -1F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 33
        gunModel[14].setRotationPoint(0F, -106.75F, 3F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 115, 2, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -1F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 34
        gunModel[15].setRotationPoint(0F, -109F, 2.5F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 31, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
        gunModel[16].setRotationPoint(45F, -96F, -8F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 3, 4, 16, 0F, 0F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, 0F, 0F); // Box 102
        gunModel[17].setRotationPoint(76F, -96F, -8F);

        gunModel[18].addShapeBox(0F, 0F, 0F, 31, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 103
        gunModel[18].setRotationPoint(45F, -92F, -8F);

        gunModel[19].addShapeBox(0F, 0F, 0F, 3, 4, 16, 0F, 0F, 0F, 0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.25F, -1.5F, -4F, -0.25F, -1.5F, -4F, 0F, 0F, -4F); // Box 104
        gunModel[19].setRotationPoint(76F, -92F, -8F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, -4F, 0F, -3F, -2F, 0F, -3F, -2F, 0.25F, 0F, -4F); // Box 105
        gunModel[20].setRotationPoint(79F, -93.5F, -8F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F, -0.75F, 0.25F, 0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, -0.75F, 0.25F, 0F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.25F, 0F, 0F); // Box 106
        gunModel[21].setRotationPoint(79F, -95.5F, -8F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 30, 13, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
        gunModel[22].setRotationPoint(0F, -96F, -8F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 2, 13, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 92
        gunModel[23].setRotationPoint(30F, -96F, -8F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 5, 12, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 93
        gunModel[24].setRotationPoint(32F, -96F, -8F);

        gunModel[25].addShapeBox(0F, 0F, 0F, 8, 7, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 94
        gunModel[25].setRotationPoint(37F, -96F, -8F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 8, 13, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 95
        gunModel[26].setRotationPoint(-8F, -96F, -8F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 6, 20, 16, 0F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 3F, 1F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 3F, 1F); // Box 96
        gunModel[27].setRotationPoint(-14F, -96F, -8F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 40, 15, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 97
        gunModel[28].setRotationPoint(-53.5F, -95.5F, -10F);

        gunModel[29].addShapeBox(0F, 0F, 0F, 6, 15, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 98
        gunModel[29].setRotationPoint(-59.5F, -95.5F, -10F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 6, 11, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -1.5F, 0F); // Box 99
        gunModel[30].setRotationPoint(-65.5F, -95.5F, -10F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 2, 9, 20, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, -1F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 1F, -1F, 0F); // Box 100
        gunModel[31].setRotationPoint(-67.5F, -95.5F, -10F);

        gunModel[32].addShapeBox(0F, 0F, 0F, 24, 11, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F); // Box 126
        gunModel[32].setRotationPoint(-4F, -96F, 8F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 7, 7, 2, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 127
        gunModel[33].setRotationPoint(20F, -96F, 8F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -2F, -1.5F, 0F, -2.5F, -2F, 0F, 0F, -1.25F, 0F); // Box 128
        gunModel[34].setRotationPoint(20F, -89F, 8F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 133
        gunModel[35].setRotationPoint(-9F, -96F, 8F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 5, 17, 2, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 1.5F, -1F, 0F, -4F, 0F, 0F, -5F, 0F, -0.5F, 0.5F, 0F); // Box 134
        gunModel[36].setRotationPoint(-14F, -96F, 8F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 24, 11, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 135
        gunModel[37].setRotationPoint(-4F, -96F, -10F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 7, 7, 2, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F); // Box 136
        gunModel[38].setRotationPoint(20F, -96F, -10F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, -2.5F, -2F, 0F, -2F, -1.5F, 0F, 0F, -0.25F, 0F); // Box 137
        gunModel[39].setRotationPoint(20F, -89F, -10F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 138
        gunModel[40].setRotationPoint(-9F, -96F, -10F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 5, 17, 2, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, -0.5F, 1.5F, -1F); // Box 139
        gunModel[41].setRotationPoint(-14F, -96F, -10F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 36, 4, 20, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 148
        gunModel[42].setRotationPoint(-49.5F, -76.5F, -10F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 40, 4, 20, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -4F, 0F, 0F); // Box 149
        gunModel[43].setRotationPoint(-53.5F, -80.5F, -10F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, 0.5F, 0F, 0F); // Box 150
        gunModel[44].setRotationPoint(-13.5F, -78.5F, -10F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F, 0.5F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -1.5F, -1F, -0.25F, -1.5F, -1F, 0F, -0.5F, 0F); // Box 151
        gunModel[45].setRotationPoint(-13.5F, -75.5F, -10F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 34, 7, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F); // Box 152
        gunModel[46].setRotationPoint(-47.5F, -73F, -10F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 33, 24, 20, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 10F, 0F, 0F); // Box 153
        gunModel[47].setRotationPoint(-47.5F, -66F, -10F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 39, 32, 20, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 5.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 5.5F, 0F, 0F); // Box 154
        gunModel[48].setRotationPoint(-57.5F, -42F, -10F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 30, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F); // Box 155
        gunModel[49].setRotationPoint(0F, -83F, -8F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0.5F, -0.5F, -4F, 0.5F, -0.5F, -4F, 0F, -0.5F, -4F); // Box 156
        gunModel[50].setRotationPoint(30F, -83F, -8F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 5, 4, 16, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -4F, 1F, -6F, -4F, 1F, -6F, -4F, -0.5F, 0.5F, -4F); // Box 157
        gunModel[51].setRotationPoint(32F, -84F, -8F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 8, 4, 16, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -1F, -1F, -4F, 0F, -3F, -4F, 0F, -3F, -4F, -1F, -1F, -4F); // Box 158
        gunModel[52].setRotationPoint(37F, -89F, -8F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 8, 4, 16, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.5F, 2.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, -1.5F, 2.5F, -4F); // Box 159
        gunModel[53].setRotationPoint(-8F, -83F, -8F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 4, 7, 16, 0F, 0F, 0F, 0F, -2.5F, -3.5F, -4F, -2.5F, -3.5F, -4F, 0F, 0F, 0F, 4.75F, -1F, 1F, -5.75F, 1F, -3.25F, -5.75F, 1F, -3.25F, 4.75F, -1F, 1F); // Box 160
        gunModel[54].setRotationPoint(-8F, -80F, -8F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F, -0.25F, 0F, 1F, -0.75F, -2F, -3.25F, -0.75F, -2F, -3.25F, -0.25F, 0F, 1F, 0.5F, 0F, 2F, -1.25F, 2.5F, -3F, -1.25F, 2.5F, -3F, 0.5F, 0F, 2F); // Box 161
        gunModel[55].setRotationPoint(-13F, -74F, -8F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 4, 63, 20, 0F, 0F, 0F, 0F, -0.75F, -2.5F, -5F, -0.75F, -2.5F, -5F, 0F, 0F, 0F, 11F, 0F, 0F, -11F, 0F, -5F, -11F, 0F, -5F, 11F, 0F, 0F); // Box 162
        gunModel[56].setRotationPoint(-13.5F, -73F, -10F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.25F, 0F, 0F); // Box 163
        gunModel[57].setRotationPoint(-70F, -95.5F, -4F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F, 1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -2F, 0F); // Box 164
        gunModel[58].setRotationPoint(-67.5F, -84.5F, -4F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -3F, 1F, 0F, 1.5F, -1.5F, 0F, 1.5F, -1.5F, 0F, -3F, 1F, 0F); // Box 165
        gunModel[59].setRotationPoint(-71.5F, -87.5F, -4F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 6, 3, 8, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 1F, 0F, 0F); // Box 166
        gunModel[60].setRotationPoint(-59.5F, -84.5F, -4F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 3, 5, 8, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -4F, 0.5F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -4F, 0.5F, 0F); // Box 167
        gunModel[61].setRotationPoint(-56.5F, -80.5F, -4F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 4, 5, 8, 0F, 1F, -2.5F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 1F, -2.5F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 168
        gunModel[62].setRotationPoint(-51.5F, -77.5F, -4F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 4, 7, 8, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 169
        gunModel[63].setRotationPoint(-51.5F, -73F, -4F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 4, 11, 8, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, 5F, 0F, 0F); // Box 170
        gunModel[64].setRotationPoint(-51.5F, -67F, -4F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 5, 14, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 4F, 0F, 0F); // Box 171
        gunModel[65].setRotationPoint(-56.5F, -56F, -4F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 3, 30, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 172
        gunModel[66].setRotationPoint(-60.5F, -42F, -4F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 3, 8, 6, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -3F, 0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -3F); // Box 173
        gunModel[67].setRotationPoint(-70F, -95.5F, 4F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 8, 3, 6, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F, 1F, -2F, 0F, -1F, 0F, 0F, -1F, -0.5F, -3F, 0.75F, -2.5F, -3F); // Box 174
        gunModel[68].setRotationPoint(-67.5F, -84.5F, 4F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -3F, -3F, 1F, 0F, 1.5F, -1.5F, 0F, 1.5F, -1.5F, 0F, -3.25F, 0.5F, -3F); // Box 175
        gunModel[69].setRotationPoint(-71.5F, -87.5F, 4F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 4F, 0F, -1F, 3.5F, -3F, 1F, -0.5F, -3F); // Box 176
        gunModel[70].setRotationPoint(-59.5F, -84.5F, 4F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 3, 8, 6, 0F, -1.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, -3F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.25F, 0F, 0F); // Box 177
        gunModel[71].setRotationPoint(-70F, -95.5F, -10F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 8, 3, 6, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F, 0.75F, -2.5F, -3F, -1F, -0.5F, -3F, -1F, 0F, 0F, 1F, -2F, 0F); // Box 178
        gunModel[72].setRotationPoint(-67.5F, -84.5F, -10F);

        gunModel[73].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F, -1.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -3.25F, 0.5F, -3F, 1.5F, -1.5F, 0F, 1.5F, -1.5F, 0F, -3F, 1F, 0F); // Box 179
        gunModel[73].setRotationPoint(-71.5F, -87.5F, -10F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, -0.5F, -3F, -1F, 3.5F, -3F, -1F, 4F, 0F, 1F, 0F, 0F); // Box 180
        gunModel[74].setRotationPoint(-59.5F, -84.5F, -10F);

        gunModel[75].addShapeBox(0F, 0F, 0F, 29, 4, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 194
        gunModel[75].setRotationPoint(-48.5F, -79.5F, -12F);

        gunModel[76].addShapeBox(0F, 0F, 0F, 13, 6, 24, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -5.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -5.5F, -1.5F, 0F); // Box 195
        gunModel[76].setRotationPoint(-46.5F, -75.5F, -12F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 13, 6, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -5.5F, -2F, 0F, -5.5F, -2F, 0F, 0F, -0.5F, 0F); // Box 196
        gunModel[77].setRotationPoint(-33.5F, -75.5F, -12F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 29, 4, 24, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
        gunModel[78].setRotationPoint(-48.5F, -83.5F, -12F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 13, 6, 24, 0F, -5.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -5.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 198
        gunModel[79].setRotationPoint(-46.5F, -89.5F, -12F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 13, 6, 24, 0F, 0F, -0.5F, 0F, -5.5F, -2F, 0F, -5.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
        gunModel[80].setRotationPoint(-33.5F, -89.5F, -12F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 8, 2, 24, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -0.5F, 0F); // Box 200
        gunModel[81].setRotationPoint(-41.5F, -89.5F, -12F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 8, 2, 24, 0F, -1F, -4F, -2F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -1F, -4F, -2F, -2.5F, 4F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -2.5F, 4F, 0F); // Box 201
        gunModel[82].setRotationPoint(-49.5F, -89.5F, -12F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 4, 4, 24, 0F, -4F, 2F, -2F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -4F, 2F, -2F, 1F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, -2F); // Box 202
        gunModel[83].setRotationPoint(-52.5F, -83.5F, -12F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 6, 4, 24, 0F, 0F, 0F, -2F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, -2F, -4.5F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, -2F); // Box 203
        gunModel[84].setRotationPoint(-53.5F, -80.5F, -12F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 24, 0F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2F, -2F, 2.5F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 2.5F, -2F); // Box 204
        gunModel[85].setRotationPoint(-49.5F, -76.5F, -12F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 6, 2, 24, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -2F, -0.5F, 3.5F, -0.5F, -0.5F, 3.5F, -0.5F, 0.5F, 0.5F, -2F); // Box 205
        gunModel[86].setRotationPoint(-47F, -75.5F, -12F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 8, 1, 24, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, 0.5F, 0F, -0.5F); // Box 206
        gunModel[87].setRotationPoint(-41F, -71F, -12F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 5, 4, 24, 0F, 1F, 0F, 0F, -4F, 1F, -1F, -4F, 1F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 207
        gunModel[88].setRotationPoint(-19.5F, -83.5F, -12F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 8, 1, 24, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F); // Box 208
        gunModel[89].setRotationPoint(-33.5F, -90F, -12F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 7, 2, 24, 0F, 0F, 0F, -1F, 0F, -4.5F, -1F, 0F, -4.5F, -1F, 0F, 0F, -1F, 0.5F, -0.5F, 0F, -2F, 3.5F, 0F, -2F, 3.5F, 0F, 0.5F, -0.5F, 0F); // Box 209
        gunModel[90].setRotationPoint(-25.5F, -89F, -12F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 5, 4, 24, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 1F, -1F, -4F, 1F, -1F, 1F, 0F, 0F); // Box 210
        gunModel[91].setRotationPoint(-19.5F, -79.5F, -12F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 8, 1, 24, 0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -0.5F, 1F, -0.5F); // Box 211
        gunModel[92].setRotationPoint(-34F, -71F, -12F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 5, 2, 24, 0F, 0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4F, 0F, 0F, 3F, -0.5F, 2F, -1F, -1F, 2F, -1F, -1F, 0F, 3F, -0.5F); // Box 212
        gunModel[93].setRotationPoint(-25.5F, -75.5F, -12F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 2, 4, 22, 0F, 0.75F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 213
        gunModel[94].setRotationPoint(-16.5F, -79.5F, -11F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 2, 65, 22, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 11.5F, 0F, 0.5F, -11.5F, 0F, 0F, -11.5F, 0F, 0F, 11.5F, 0F, 0.5F); // Box 214
        gunModel[95].setRotationPoint(-16.5F, -75.5F, -11F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 2, 3, 24, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -2F); // Box 215
        gunModel[96].setRotationPoint(-48.5F, -75.5F, -12F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 2, 7, 24, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -2F); // Box 216
        gunModel[97].setRotationPoint(-47.5F, -72.5F, -12F);

        gunModel[98].addShapeBox(0F, 0F, 0F, 2, 24, 24, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 10F, 0F, -2F, -9F, 0F, -0.5F, -9F, 0F, -0.5F, 10F, 0F, -2F); // Box 217
        gunModel[98].setRotationPoint(-47.5F, -66F, -12F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 3, 34, 24, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 6F, 0.5F, -2F, -6F, -1F, -0.5F, -6F, -1F, -0.5F, 6F, 0.5F, -2F); // Box 218
        gunModel[99].setRotationPoint(-57.5F, -42F, -12F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 20, 3, 24, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F); // Box 219
        gunModel[100].setRotationPoint(-49.5F, -9.5F, -12F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 24, 0F, 0F, 0F, -0.25F, 0.5F, 1F, -0.5F, 0.5F, 1F, -0.5F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.25F); // Box 220
        gunModel[101].setRotationPoint(-29.5F, -9.5F, -12F);

        gunModel[102].addShapeBox(0F, 0F, 0F, 2, 4, 23, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0F, 0F); // Box 221
        gunModel[102].setRotationPoint(-28.5F, -10.5F, -11.5F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 10, 3, 24, 0F, -0.5F, 1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, -0.25F, -0.5F, -2F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, -0.25F); // Box 222
        gunModel[103].setRotationPoint(-59.5F, -9.5F, -12F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 1, 3, 22, 0F, -0.5F, 1F, -0.5F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, -0.5F, 1F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, -0.5F, -0.5F); // Box 223
        gunModel[104].setRotationPoint(-60.5F, -11.5F, -10F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 10, 3, 24, 0F, -0.5F, -1F, -0.25F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, -0.5F, -1F, -0.25F, -0.5F, -0.25F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -1F); // Box 224
        gunModel[105].setRotationPoint(-59.5F, -9.5F, -12F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 4, 3, 24, 0F, -2.5F, -0.5F, -0.5F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -2.5F, -0.5F, -0.5F, 0.5F, -1F, -2F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0.5F, -1F, -2F); // Box 225
        gunModel[106].setRotationPoint(-63F, -9.5F, -12F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 27, 10, 22, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 227
        gunModel[107].setRotationPoint(-45.5F, -75.5F, -11F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 27, 4, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
        gunModel[108].setRotationPoint(-43.5F, -79.5F, -11F);

        gunModel[109].addShapeBox(0F, 0F, 0F, 27, 24, 22, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, 9F, 0F, 0F); // Box 230
        gunModel[109].setRotationPoint(-45.5F, -66F, -11F);

        gunModel[110].addShapeBox(0F, 0F, 0F, 32, 33, 22, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 6F, 0F, 0F); // Box 231
        gunModel[110].setRotationPoint(-54.5F, -42F, -11F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 19, 4, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 233
        gunModel[111].setRotationPoint(-43.5F, -10F, -10F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 20, 4, 20, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 234
        gunModel[112].setRotationPoint(-43.5F, -6F, -10F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 17, 5, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F); // Box 235
        gunModel[113].setRotationPoint(-60.5F, -8F, -10F);

        gunModel[114].addShapeBox(0F, 0F, 0F, 3, 3, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 236
        gunModel[114].setRotationPoint(-63.5F, -9F, -10F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1.25F, 0F); // Box 237
        gunModel[115].setRotationPoint(-65.5F, -12F, -4F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 13, 4, 23, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 238
        gunModel[116].setRotationPoint(-43.5F, -6.5F, -11.5F);

        gunModel[117].addShapeBox(0F, 0F, 0F, 1, 4, 23, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F); // Box 239
        gunModel[117].setRotationPoint(-44.5F, -6.5F, -11.5F);

        gunModel[118].addShapeBox(0F, 0F, 0F, 1, 4, 23, 0F, -0.75F, 0F, -0.5F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F); // Box 240
        gunModel[118].setRotationPoint(-45.5F, -6.5F, -11.5F);

        gunModel[119].addShapeBox(0F, 0F, 0F, 2, 3, 22, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F); // Box 241
        gunModel[119].setRotationPoint(-47.5F, -6.5F, -11F);

        gunModel[120].addShapeBox(0F, 0F, 0F, 2, 3, 22, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -1F); // Box 242
        gunModel[120].setRotationPoint(-49.5F, -6.5F, -11F);

        gunModel[121].addShapeBox(0F, 0F, 0F, 2, 4, 22, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, -1F, 0F, -1F, -1F, 0F, -1F, 0.5F, 0F, 0.5F); // Box 243
        gunModel[121].setRotationPoint(-30.5F, -6.5F, -11F);

        gunModel[122].addShapeBox(0F, 0F, 0F, 4, 4, 20, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, -0.5F, -5F, 0.25F, -0.5F, -5F, -0.5F, 0F, 0F); // Box 244
        gunModel[122].setRotationPoint(-24.5F, -10F, -10F);

        gunModel[123].addShapeBox(0F, 0F, 0F, 4, 4, 20, 0F, 0F, 0F, 0F, -0.25F, 0.5F, -5F, -0.25F, 0.5F, -5F, 0F, 0F, 0F, -1.25F, -0.5F, 0F, 1.5F, -0.5F, -5F, 1.5F, -0.5F, -5F, -1.25F, -0.5F, 0F); // Box 245
        gunModel[123].setRotationPoint(-24F, -6F, -10F);

        gunModel[124].addShapeBox(0F, 0F, 0F, 4, 10, 6, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, -3F, 4.25F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, 3.5F, 0F, -3F); // Box 246
        gunModel[124].setRotationPoint(-51.5F, -67F, 4F);

        gunModel[125].addShapeBox(0F, 0F, 0F, 4, 7, 6, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -3F); // Box 247
        gunModel[125].setRotationPoint(-51.5F, -73F, 4F);

        gunModel[126].addShapeBox(0F, 0F, 0F, 4, 5, 6, 0F, 1F, -2.5F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0.5F, -2.5F, -3F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 1F, -3F); // Box 248
        gunModel[126].setRotationPoint(-51.5F, -77.5F, 4F);

        gunModel[127].addShapeBox(0F, 0F, 0F, 3, 5, 6, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2.5F, -3F, -4F, 0.5F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -4.5F, 0.5F, -3F); // Box 249
        gunModel[127].setRotationPoint(-56.5F, -80.5F, 4F);

        gunModel[128].addShapeBox(0F, 0F, 0F, 4, 10, 6, 0F, -0.5F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 3.5F, 0F, -3F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, 4.25F, 0F, 0F); // Box 250
        gunModel[128].setRotationPoint(-51.5F, -67F, -10F);

        gunModel[129].addShapeBox(0F, 0F, 0F, 4, 7, 6, 0F, -0.5F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 251
        gunModel[129].setRotationPoint(-51.5F, -73F, -10F);

        gunModel[130].addShapeBox(0F, 0F, 0F, 4, 5, 6, 0F, 0.5F, -2.5F, -3F, -2F, -1F, 0F, -2F, -1F, 0F, 1F, -2.5F, 0F, -0.5F, 1F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 252
        gunModel[130].setRotationPoint(-51.5F, -77.5F, -10F);

        gunModel[131].addShapeBox(0F, 0F, 0F, 3, 5, 6, 0F, -2F, -2.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -4.5F, 0.5F, -3F, 4F, -1F, 0F, 4F, -1F, 0F, -4F, 0.5F, 0F); // Box 253
        gunModel[131].setRotationPoint(-56.5F, -80.5F, -10F);

        gunModel[132].addShapeBox(0F, 0F, 0F, 5, 15, 6, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, 0F, -3F, 1.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 1.5F, 0F, -0.5F); // Box 254
        gunModel[132].setRotationPoint(-56.5F, -57F, 4F);

        gunModel[133].addShapeBox(0F, 0F, 0F, 5, 15, 6, 0F, -1.5F, 0F, -3F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 1.5F, 0F, -0.5F, -6F, 0F, 0F, -6F, 0F, 0F, 1.5F, 0F, 0F); // Box 255
        gunModel[133].setRotationPoint(-56.5F, -57F, -10F);

        gunModel[134].addShapeBox(0F, 1F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
        gunModel[134].setRotationPoint(-20.5F, -97.5F, 9F);
        gunModel[134].rotateAngleZ = -0.27925268F;

        gunModel[135].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
        gunModel[135].setRotationPoint(-20.5F, -97.5F, 9F);
        gunModel[135].rotateAngleZ = -0.27925268F;

        gunModel[136].addShapeBox(0F, 0F, 1F, 7, 1, 2, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 299
        gunModel[136].setRotationPoint(-20.5F, -97.5F, 9F);
        gunModel[136].rotateAngleZ = -0.27925268F;

        gunModel[137].addShapeBox(0F, 0F, 2F, 7, 1, 1, 0F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.75F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 300
        gunModel[137].setRotationPoint(-20.5F, -97.5F, 9F);
        gunModel[137].rotateAngleZ = -0.27925268F;

        gunModel[138].addShapeBox(0F, 1F, 2F, 8, 2, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 301
        gunModel[138].setRotationPoint(-20.5F, -97.5F, 9F);
        gunModel[138].rotateAngleZ = -0.27925268F;

        gunModel[139].addShapeBox(0F, 3F, 2F, 8, 2, 1, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, 0F, -0.75F, 0.25F, 0F, 0F, 0.25F); // Box 302
        gunModel[139].setRotationPoint(-20.5F, -97.5F, 9F);
        gunModel[139].rotateAngleZ = -0.27925268F;

        gunModel[140].addShapeBox(0F, 5F, 2F, 8, 2, 1, 0F, 0F, 0F, -0.5F, -0.25F, 0.75F, -0.5F, 0F, 0.75F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, -1.25F, -1F, 0F, -0.25F, -1F); // Box 303
        gunModel[140].setRotationPoint(-20.5F, -97.5F, 9F);
        gunModel[140].rotateAngleZ = -0.27925268F;

        gunModel[141].addShapeBox(0F, 0F, 0F, 10, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F); // Box 304
        gunModel[141].setRotationPoint(22.5F, -79.5F, -4F);

        gunModel[142].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 305
        gunModel[142].setRotationPoint(26.5F, -76.5F, -4F);

        gunModel[143].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 306
        gunModel[143].setRotationPoint(28.5F, -73.5F, -4F);

        gunModel[144].addShapeBox(0F, 0F, 0F, 2, 4, 8, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 307
        gunModel[144].setRotationPoint(29.5F, -69.5F, -4F);

        gunModel[145].addShapeBox(0F, 0F, 0F, 19, 2, 8, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
        gunModel[145].setRotationPoint(1.5F, -56.5F, -4F);

        gunModel[146].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, -2.5F, 0F, 1F, -2.5F, 0F, 0F, 0F, 0F); // Box 309
        gunModel[146].setRotationPoint(20.5F, -56.5F, -4F);

        gunModel[147].addShapeBox(0F, 0F, 0F, 2, 4, 8, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 1F, 0F, 0F); // Box 310
        gunModel[147].setRotationPoint(29.5F, -65.5F, -4F);

        gunModel[148].addShapeBox(0F, 0F, 0F, 2, 4, 8, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 3F, -0.5F, 0F, -4F, 0.5F, 0F, -4F, 0.5F, 0F, 3F, -0.5F, 0F); // Box 311
        gunModel[148].setRotationPoint(28.5F, -61.5F, -4F);

        gunModel[149].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 312
        gunModel[149].setRotationPoint(-3.5F, -56.5F, -4F);

        gunModel[150].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F, -1F, 1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1F, 1.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F); // Box 313
        gunModel[150].setRotationPoint(-8.5F, -58.5F, -4F);

        gunModel[151].addShapeBox(0F, 0F, 0F, 7, 2, 10, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 314
        gunModel[151].setRotationPoint(-13.5F, -58.5F, -5F);

        gunModel[152].addShapeBox(0F, 0F, 0F, 7, 2, 10, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 315
        gunModel[152].setRotationPoint(-13.5F, -60.5F, -5F);

        gunModel[153].addShapeBox(0F, 0F, 0F, 6, 2, 10, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
        gunModel[153].setRotationPoint(-13.5F, -62F, -5F);

        gunModel[154].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 317
        gunModel[154].setRotationPoint(-13.5F, -66F, -5F);

        gunModel[155].addShapeBox(0F, 0F, 0F, 8, 2, 10, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 318
        gunModel[155].setRotationPoint(-14.5F, -56.5F, -5F);

        gunModel[156].addShapeBox(0F, 0F, 0F, 6, 2, 10, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 319
        gunModel[156].setRotationPoint(-14.5F, -55F, -5F);

        gunModel[157].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F); // Box 320
        gunModel[157].setRotationPoint(-14.5F, -53F, -5F);

        gunModel[158].addShapeBox(0F, 0F, 0F, 3, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
        gunModel[158].setRotationPoint(-13.5F, -70F, -5F);

        gunModel[159].addShapeBox(0F, 0F, 0F, 3, 4, 10, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 322
        gunModel[159].setRotationPoint(-15.5F, -51F, -5F);

        gunModel[160].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -2.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 323
        gunModel[160].setRotationPoint(-14.5F, -56.5F, 5F);

        gunModel[161].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 324
        gunModel[161].setRotationPoint(-13.5F, -58.5F, 5F);

        gunModel[162].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 325
        gunModel[162].setRotationPoint(-13.5F, -60.5F, 5F);

        gunModel[163].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 326
        gunModel[163].setRotationPoint(-13.5F, -62F, 5F);

        gunModel[164].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 327
        gunModel[164].setRotationPoint(-13.5F, -66F, 5F);

        gunModel[165].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 328
        gunModel[165].setRotationPoint(-13.5F, -69F, 5F);

        gunModel[166].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 329
        gunModel[166].setRotationPoint(-15.5F, -51F, 5F);

        gunModel[167].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 330
        gunModel[167].setRotationPoint(-14.5F, -53F, 5F);

        gunModel[168].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -3.25F, 0F, 0F, 0F, 0F, 0F); // Box 331
        gunModel[168].setRotationPoint(-14.5F, -55F, 5F);

        gunModel[169].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2.25F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 332
        gunModel[169].setRotationPoint(-14.5F, -56.5F, -6F);

        gunModel[170].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 333
        gunModel[170].setRotationPoint(-13.5F, -58.5F, -6F);

        gunModel[171].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, -0.5F, 0F, -1.75F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 334
        gunModel[171].setRotationPoint(-13.5F, -60.5F, -6F);

        gunModel[172].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
        gunModel[172].setRotationPoint(-13.5F, -62F, -6F);

        gunModel[173].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 336
        gunModel[173].setRotationPoint(-13.5F, -66F, -6F);

        gunModel[174].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
        gunModel[174].setRotationPoint(-13.5F, -69F, -6F);

        gunModel[175].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 338
        gunModel[175].setRotationPoint(-15.5F, -51F, -6F);

        gunModel[176].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F); // Box 339
        gunModel[176].setRotationPoint(-14.5F, -53F, -6F);

        gunModel[177].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.25F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 340
        gunModel[177].setRotationPoint(-14.5F, -55F, -6F);

        gunModel[178].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
        gunModel[178].setRotationPoint(4F, -80.5F, -4F);

        gunModel[179].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 342
        gunModel[179].setRotationPoint(4F, -78.5F, -4F);

        gunModel[180].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 343
        gunModel[180].setRotationPoint(3F, -75.5F, -4F);

        gunModel[181].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2.5F, 1.5F, 0F); // Box 344
        gunModel[181].setRotationPoint(4F, -71.5F, -4F);

        gunModel[182].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -4.5F, 1.5F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4.5F, 1.5F, 0F); // Box 345
        gunModel[182].setRotationPoint(6F, -67.5F, -4F);

        gunModel[183].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, 0F, 2.5F, -2.5F, 0F, 2.5F, -2.5F, 0F, 0F, 0F, 0F, 1.5F, -0.5F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1.5F, -0.5F, 0F); // Box 346
        gunModel[183].setRotationPoint(12F, -63.5F, -4F);

        gunModel[184].addShapeBox(0F, 0F, 0F, 12, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 347
        gunModel[184].setRotationPoint(-59F, -110F, 3F);

        gunModel[185].addShapeBox(0F, 0F, 0F, 12, 8, 6, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
        gunModel[185].setRotationPoint(-59F, -110F, -9F);

        gunModel[186].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.25F, 0F, 0F); // Box 350
        gunModel[186].setRotationPoint(-70F, -95.5F, 3F);

        gunModel[187].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.25F, 0F, 0F); // Box 351
        gunModel[187].setRotationPoint(-70F, -94.5F, -3F);

        gunModel[188].addShapeBox(0F, 0F, 0F, 18, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
        gunModel[188].setRotationPoint(-56F, -112.5F, -2F);

        gunModel[189].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
        gunModel[189].setRotationPoint(-56F, -113.5F, -2F);

        gunModel[190].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 354
        gunModel[190].setRotationPoint(-56F, -110.5F, -2F);

        gunModel[191].addShapeBox(-5F, 0F, 0F, 10, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 357
        gunModel[191].setRotationPoint(-63F, -101F, -3F);

        gunModel[192].addShapeBox(-4F, 2F, 0F, 4, 3, 6, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F); // Box 358
        gunModel[192].setRotationPoint(-63F, -101F, -3F);

        gunModel[193].addShapeBox(-0.5F, -7F, 0F, 5, 5, 6, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 359
        gunModel[193].setRotationPoint(-63F, -101F, -3F);

        gunModel[194].addShapeBox(-5F, -3F, 0F, 10, 3, 6, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
        gunModel[194].setRotationPoint(-63F, -101F, -3F);

        gunModel[195].addShapeBox(-4.5F, -6F, 0F, 4, 4, 6, 0F, -1F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 361
        gunModel[195].setRotationPoint(-63F, -101F, -3F);

        gunModel[196].addShapeBox(-2.25F, -14F, 0F, 9, 3, 6, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 363
        gunModel[196].setRotationPoint(-63F, -101F, -3F);

        gunModel[197].addShapeBox(2.25F, -16F, 0F, 4, 2, 6, 0F, 0F, 0F, 0F, -1.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 364
        gunModel[197].setRotationPoint(-63F, -101F, -3F);

        gunModel[198].addShapeBox(-1.75F, -16F, 0F, 4, 2, 6, 0F, -1.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 365
        gunModel[198].setRotationPoint(-63F, -101F, -3F);

        gunModel[199].addShapeBox(-2.25F, -12F, 0F, 9, 3, 6, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 366
        gunModel[199].setRotationPoint(-63F, -101F, -3F);

        gunModel[200].addShapeBox(-2.25F, -10F, 0F, 8, 3, 6, 0F, 0F, -0.75F, 0F, 1F, -0.75F, 0F, 1F, -0.75F, 0F, 0F, -0.75F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 367
        gunModel[200].setRotationPoint(-63F, -101F, -3F);

        gunModel[201].addShapeBox(-2.75F, -11.5F, 0F, 1, 1, 6, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F); // Box 368
        gunModel[201].setRotationPoint(-63F, -101F, -3F);

        gunModel[202].addShapeBox(-2.75F, -13.5F, 0F, 1, 1, 6, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.5F); // Box 369
        gunModel[202].setRotationPoint(-63F, -101F, -3F);

        gunModel[203].addShapeBox(-1F, -15.25F, 0F, 1, 1, 6, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, -0.5F, 0.25F, -0.75F, -0.5F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.75F, -0.5F); // Box 370
        gunModel[203].setRotationPoint(-63F, -101F, -3F);

        gunModel[204].addShapeBox(1F, -16.25F, 0F, 1, 1, 6, 0F, 0F, 0F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0F, -0.5F, 0F); // Box 371
        gunModel[204].setRotationPoint(-63F, -101F, -3F);

        gunModel[205].addShapeBox(3F, -16.25F, 0F, 1, 1, 6, 0F, -0.5F, 0F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F); // Box 372
        gunModel[205].setRotationPoint(-63F, -101F, -3F);

        gunModel[206].addShapeBox(4.5F, -15.25F, 0F, 1, 1, 6, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, 0F, -1F, -0.25F, 0F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, -1F, -0.25F, 0F); // Box 373
        gunModel[206].setRotationPoint(-63F, -101F, -3F);

        gunModel[207].addShapeBox(0.5F, -16.25F, 0F, 1, 1, 6, 0F, 0.5F, -0.25F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.25F, 0F); // Box 374
        gunModel[207].setRotationPoint(-63F, -101F, -3F);

        gunModel[208].addShapeBox(2.25F, -16.25F, 0F, 1, 1, 6, 0F, 0F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F); // Box 375
        gunModel[208].setRotationPoint(-63F, -101F, -3F);

        gunModel[209].addShapeBox(-1.75F, -14.5F, 0F, 1, 1, 6, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, -0.5F, 0.25F, -0.75F, -0.5F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.75F, -0.5F); // Box 376
        gunModel[209].setRotationPoint(-63F, -101F, -3F);

        gunModel[210].addShapeBox(-3F, -12.5F, 0F, 1, 1, 6, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.5F); // Box 377
        gunModel[210].setRotationPoint(-63F, -101F, -3F);

        gunModel[211].addShapeBox(-2.5F, -10.5F, 0F, 1, 1, 6, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F); // Box 378
        gunModel[211].setRotationPoint(-63F, -101F, -3F);

        gunModel[212].addShapeBox(5.25F, -14.5F, 0F, 1, 1, 6, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, 0F, -1F, -0.25F, 0F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, -1F, -0.25F, 0F); // Box 379
        gunModel[212].setRotationPoint(-63F, -101F, -3F);

        gunModel[213].addShapeBox(0F, 0F, 0F, 5, 2, 23, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
        gunModel[213].setRotationPoint(-49.5F, -24F, -11.5F);

        gunModel[214].addShapeBox(0F, 0F, 0F, 5, 2, 23, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
        gunModel[214].setRotationPoint(-49.5F, -26F, -11.5F);

        gunModel[215].addShapeBox(0F, 0F, 0F, 5, 2, 23, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 383
        gunModel[215].setRotationPoint(-49.5F, -22F, -11.5F);

        gunModel[216].addShapeBox(0F, 0F, 0F, 20, 3, 15, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
        gunModel[216].setRotationPoint(-1F, -115F, -7.5F);

        gunModel[217].addShapeBox(0F, 0F, 0F, 20, 3, 6, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
        gunModel[217].setRotationPoint(-1F, -117.5F, -6F);

        gunModel[218].addShapeBox(0F, 0F, 0F, 20, 3, 6, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
        gunModel[218].setRotationPoint(-1F, -117.5F, 0F);


        ammoModel = new ModelRendererTurbo[35];
        ammoModel[0] = new ModelRendererTurbo(this, 161, 281, textureX, textureY); // Box 434
        ammoModel[1] = new ModelRendererTurbo(this, 329, 273, textureX, textureY); // Box 435
        ammoModel[2] = new ModelRendererTurbo(this, 273, 265, textureX, textureY); // Box 436
        ammoModel[3] = new ModelRendererTurbo(this, 385, 281, textureX, textureY); // Box 437
        ammoModel[4] = new ModelRendererTurbo(this, 985, 273, textureX, textureY); // Box 438
        ammoModel[5] = new ModelRendererTurbo(this, 889, 273, textureX, textureY); // Box 439
        ammoModel[6] = new ModelRendererTurbo(this, 665, 209, textureX, textureY); // Box 440
        ammoModel[7] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 441
        ammoModel[8] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 443
        ammoModel[9] = new ModelRendererTurbo(this, 897, 81, textureX, textureY); // Box 444
        ammoModel[10] = new ModelRendererTurbo(this, 433, 281, textureX, textureY); // Box 445
        ammoModel[11] = new ModelRendererTurbo(this, 953, 185, textureX, textureY); // Box 446
        ammoModel[12] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 447
        ammoModel[13] = new ModelRendererTurbo(this, 665, 225, textureX, textureY); // Box 448
        ammoModel[14] = new ModelRendererTurbo(this, 729, 233, textureX, textureY); // Box 449
        ammoModel[15] = new ModelRendererTurbo(this, 1001, 273, textureX, textureY); // Box 436
        ammoModel[16] = new ModelRendererTurbo(this, 257, 281, textureX, textureY); // Box 437
        ammoModel[17] = new ModelRendererTurbo(this, 481, 281, textureX, textureY); // Box 439
        ammoModel[18] = new ModelRendererTurbo(this, 537, 281, textureX, textureY); // Box 440
        ammoModel[19] = new ModelRendererTurbo(this, 641, 281, textureX, textureY); // Box 441
        ammoModel[20] = new ModelRendererTurbo(this, 777, 209, textureX, textureY); // Box 442
        ammoModel[21] = new ModelRendererTurbo(this, 249, 217, textureX, textureY); // Box 443
        ammoModel[22] = new ModelRendererTurbo(this, 465, 217, textureX, textureY); // Box 444
        ammoModel[23] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 445
        ammoModel[24] = new ModelRendererTurbo(this, 217, 225, textureX, textureY); // Box 446
        ammoModel[25] = new ModelRendererTurbo(this, 1001, 225, textureX, textureY); // Box 447
        ammoModel[26] = new ModelRendererTurbo(this, 729, 241, textureX, textureY); // Box 448
        ammoModel[27] = new ModelRendererTurbo(this, 817, 241, textureX, textureY); // Box 449
        ammoModel[28] = new ModelRendererTurbo(this, 105, 249, textureX, textureY); // Box 450
        ammoModel[29] = new ModelRendererTurbo(this, 241, 249, textureX, textureY); // Box 451
        ammoModel[30] = new ModelRendererTurbo(this, 233, 281, textureX, textureY); // Box 452
        ammoModel[31] = new ModelRendererTurbo(this, 313, 281, textureX, textureY); // Box 453
        ammoModel[32] = new ModelRendererTurbo(this, 697, 281, textureX, textureY); // Box 454
        ammoModel[33] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 455
        ammoModel[34] = new ModelRendererTurbo(this, 585, 289, textureX, textureY); // Box 456

        ammoModel[0].addShapeBox(0F, 0F, 0F, 24, 2, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
        ammoModel[0].setRotationPoint(-46.5F, -1.5F, -11F);

        ammoModel[1].addShapeBox(0F, 0F, 0F, 4, 2, 22, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 435
        ammoModel[1].setRotationPoint(-22.5F, -1.5F, -11F);

        ammoModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 436
        ammoModel[2].setRotationPoint(-18.5F, -1.5F, -9F);

        ammoModel[3].addShapeBox(0F, 0F, 0F, 20, 93, 1, 0F, -15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
        ammoModel[3].setRotationPoint(-45.5F, -94.5F, -9F);

        ammoModel[4].addShapeBox(0F, 0F, 0F, 3, 93, 1, 0F, -15F, 0F, 0F, 15F, 0F, -4F, 14F, 0F, 3F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, 3F, 0F, 0F, 0F); // Box 438
        ammoModel[4].setRotationPoint(-25.5F, -94.5F, -9F);

        ammoModel[5].addShapeBox(0F, 0F, 0F, 1, 93, 18, 0F, -15F, 0F, -1F, 15F, 0F, 0F, 15F, 0F, 0F, -15F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 439
        ammoModel[5].setRotationPoint(-46.5F, -94.5F, -9F);

        ammoModel[6].addShapeBox(0F, 0F, 0F, 20, 3, 1, 0F, -0.5F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
        ammoModel[6].setRotationPoint(-30.5F, -97.5F, 8F);

        ammoModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 441
        ammoModel[7].setRotationPoint(-31.5F, -97.5F, 4F);

        ammoModel[8].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F, -1F, -0.5F, 1.5F, -0.5F, -0.5F, 1.5F, -0.5F, 0F, -2F, -1F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 443
        ammoModel[8].setRotationPoint(-30.5F, -99.5F, 7.5F);

        ammoModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1.5F, -1F, 0F, -2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F); // Box 444
        ammoModel[9].setRotationPoint(-31.5F, -99.5F, 4F);

        ammoModel[10].addShapeBox(0F, 0F, 0F, 20, 93, 1, 0F, -15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
        ammoModel[10].setRotationPoint(-45.5F, -94.5F, 8F);

        ammoModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, -0.5F, 0F, -1.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 446
        ammoModel[11].setRotationPoint(-31.5F, -97.5F, -9F);

        ammoModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, -1F, 0F, -2F, 1F, 0F, -1.5F, 1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 447
        ammoModel[12].setRotationPoint(-31.5F, -99.5F, -8F);

        ammoModel[13].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F, -1F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -0.5F, 1.5F, -1F, -0.5F, 1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 448
        ammoModel[13].setRotationPoint(-30.5F, -99.5F, -8.5F);

        ammoModel[14].addShapeBox(0F, 0F, 0F, 20, 3, 1, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
        ammoModel[14].setRotationPoint(-30.5F, -97.5F, -9F);

        ammoModel[15].addShapeBox(0F, 0F, 0F, 1, 93, 10, 0F, -15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
        ammoModel[15].setRotationPoint(-23.5F, -94.5F, -5F);

        ammoModel[16].addShapeBox(0F, 0F, 0F, 3, 93, 1, 0F, -15F, 0F, 0F, 14F, 0F, 3F, 15F, 0F, -4F, -15F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 437
        ammoModel[16].setRotationPoint(-25.5F, -94.5F, 8F);

        ammoModel[17].addShapeBox(0F, 0F, 0F, 17, 3, 8, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 439
        ammoModel[17].setRotationPoint(-29.5F, -98.5F, -0.5F);

        ammoModel[18].addShapeBox(0F, 0F, 0F, 17, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
        ammoModel[18].setRotationPoint(-29.5F, -96F, -0.5F);

        ammoModel[19].addShapeBox(0F, 0F, 0F, 17, 3, 8, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 441
        ammoModel[19].setRotationPoint(-29.5F, -93.5F, -0.5F);

        ammoModel[20].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 442
        ammoModel[20].setRotationPoint(-12.5F, -96F, -0.5F);

        ammoModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 443
        ammoModel[21].setRotationPoint(-12.5F, -98F, -0.5F);

        ammoModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, -2.5F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, -0.5F); // Box 444
        ammoModel[22].setRotationPoint(-10.5F, -98F, -0.5F);

        ammoModel[23].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F); // Box 445
        ammoModel[23].setRotationPoint(-10.5F, -96F, -0.5F);

        ammoModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, -2.5F); // Box 446
        ammoModel[24].setRotationPoint(-10.5F, -93F, -0.5F);

        ammoModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 447
        ammoModel[25].setRotationPoint(-12.5F, -93F, -0.5F);

        ammoModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, -2.5F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, -0.5F); // Box 448
        ammoModel[26].setRotationPoint(-11F, -93F, -7.5F);

        ammoModel[27].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F); // Box 449
        ammoModel[27].setRotationPoint(-11F, -91F, -7.5F);

        ammoModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, -2.5F); // Box 450
        ammoModel[28].setRotationPoint(-11F, -88F, -7.5F);

        ammoModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 451
        ammoModel[29].setRotationPoint(-13F, -88F, -7.5F);

        ammoModel[30].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 452
        ammoModel[30].setRotationPoint(-12.5F, -91F, -7.5F);

        ammoModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 453
        ammoModel[31].setRotationPoint(-13F, -93F, -7.5F);

        ammoModel[32].addShapeBox(0F, 0F, 0F, 17, 3, 8, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 454
        ammoModel[32].setRotationPoint(-30F, -93.5F, -7.5F);

        ammoModel[33].addShapeBox(0F, 0F, 0F, 17, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
        ammoModel[33].setRotationPoint(-30F, -91F, -7.5F);

        ammoModel[34].addShapeBox(0F, 0F, 0F, 17, 3, 8, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 456
        ammoModel[34].setRotationPoint(-30F, -88.5F, -7.5F);


        slideModel = new ModelRendererTurbo[202];
        slideModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        slideModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 4
        slideModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 5
        slideModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
        slideModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 8
        slideModel[5] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 9
        slideModel[6] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 10
        slideModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 12
        slideModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 13
        slideModel[9] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 35
        slideModel[10] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 36
        slideModel[11] = new ModelRendererTurbo(this, 945, 25, textureX, textureY); // Box 37
        slideModel[12] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 38
        slideModel[13] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 39
        slideModel[14] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); // Box 40
        slideModel[15] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 41
        slideModel[16] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 42
        slideModel[17] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 43
        slideModel[18] = new ModelRendererTurbo(this, 809, 25, textureX, textureY); // Box 44
        slideModel[19] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 45
        slideModel[20] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 46
        slideModel[21] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 47
        slideModel[22] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 48
        slideModel[23] = new ModelRendererTurbo(this, 801, 41, textureX, textureY); // Box 49
        slideModel[24] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 50
        slideModel[25] = new ModelRendererTurbo(this, 633, 49, textureX, textureY); // Box 51
        slideModel[26] = new ModelRendererTurbo(this, 825, 49, textureX, textureY); // Box 52
        slideModel[27] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 53
        slideModel[28] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 54
        slideModel[29] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 56
        slideModel[30] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 59
        slideModel[31] = new ModelRendererTurbo(this, 529, 57, textureX, textureY); // Box 64
        slideModel[32] = new ModelRendererTurbo(this, 585, 57, textureX, textureY); // Box 65
        slideModel[33] = new ModelRendererTurbo(this, 889, 25, textureX, textureY); // Box 66
        slideModel[34] = new ModelRendererTurbo(this, 889, 41, textureX, textureY); // Box 68
        slideModel[35] = new ModelRendererTurbo(this, 625, 57, textureX, textureY); // Box 69
        slideModel[36] = new ModelRendererTurbo(this, 673, 57, textureX, textureY); // Box 70
        slideModel[37] = new ModelRendererTurbo(this, 705, 57, textureX, textureY); // Box 71
        slideModel[38] = new ModelRendererTurbo(this, 769, 57, textureX, textureY); // Box 72
        slideModel[39] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Box 73
        slideModel[40] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 74
        slideModel[41] = new ModelRendererTurbo(this, 657, 57, textureX, textureY); // Box 75
        slideModel[42] = new ModelRendererTurbo(this, 561, 57, textureX, textureY); // Box 76
        slideModel[43] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 77
        slideModel[44] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 78
        slideModel[45] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 79
        slideModel[46] = new ModelRendererTurbo(this, 857, 57, textureX, textureY); // Box 80
        slideModel[47] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 81
        slideModel[48] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 82
        slideModel[49] = new ModelRendererTurbo(this, 961, 57, textureX, textureY); // Box 83
        slideModel[50] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 85
        slideModel[51] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 86
        slideModel[52] = new ModelRendererTurbo(this, 953, 9, textureX, textureY); // Box 87
        slideModel[53] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Box 88
        slideModel[54] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 89
        slideModel[55] = new ModelRendererTurbo(this, 985, 57, textureX, textureY); // Box 90
        slideModel[56] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 91
        slideModel[57] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 92
        slideModel[58] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 93
        slideModel[59] = new ModelRendererTurbo(this, 857, 65, textureX, textureY); // Box 94
        slideModel[60] = new ModelRendererTurbo(this, 905, 65, textureX, textureY); // Box 96
        slideModel[61] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 97
        slideModel[62] = new ModelRendererTurbo(this, 945, 65, textureX, textureY); // Box 98
        slideModel[63] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Box 99
        slideModel[64] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 101
        slideModel[65] = new ModelRendererTurbo(this, 969, 25, textureX, textureY); // Box 103
        slideModel[66] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Box 104
        slideModel[67] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); // Box 105
        slideModel[68] = new ModelRendererTurbo(this, 993, 25, textureX, textureY); // Box 106
        slideModel[69] = new ModelRendererTurbo(this, 905, 89, textureX, textureY); // Box 107
        slideModel[70] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 108
        slideModel[71] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 109
        slideModel[72] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 110
        slideModel[73] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 111
        slideModel[74] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Box 112
        slideModel[75] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 113
        slideModel[76] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 114
        slideModel[77] = new ModelRendererTurbo(this, 889, 65, textureX, textureY); // Box 115
        slideModel[78] = new ModelRendererTurbo(this, 769, 57, textureX, textureY); // Box 116
        slideModel[79] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 117
        slideModel[80] = new ModelRendererTurbo(this, 657, 57, textureX, textureY); // Box 118
        slideModel[81] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 119
        slideModel[82] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Box 120
        slideModel[83] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 121
        slideModel[84] = new ModelRendererTurbo(this, 929, 65, textureX, textureY); // Box 123
        slideModel[85] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 124
        slideModel[86] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 129
        slideModel[87] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 130
        slideModel[88] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Box 131
        slideModel[89] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Box 132
        slideModel[90] = new ModelRendererTurbo(this, 681, 57, textureX, textureY); // Box 140
        slideModel[91] = new ModelRendererTurbo(this, 521, 57, textureX, textureY); // Box 141
        slideModel[92] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 142
        slideModel[93] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 143
        slideModel[94] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 144
        slideModel[95] = new ModelRendererTurbo(this, 665, 57, textureX, textureY); // Box 145
        slideModel[96] = new ModelRendererTurbo(this, 1009, 57, textureX, textureY); // Box 146
        slideModel[97] = new ModelRendererTurbo(this, 833, 65, textureX, textureY); // Box 147
        slideModel[98] = new ModelRendererTurbo(this, 633, 145, textureX, textureY); // Box 181
        slideModel[99] = new ModelRendererTurbo(this, 609, 73, textureX, textureY); // Box 182
        slideModel[100] = new ModelRendererTurbo(this, 913, 65, textureX, textureY); // Box 183
        slideModel[101] = new ModelRendererTurbo(this, 953, 65, textureX, textureY); // Box 184
        slideModel[102] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 185
        slideModel[103] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 186
        slideModel[104] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 187
        slideModel[105] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 188
        slideModel[106] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 189
        slideModel[107] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 190
        slideModel[108] = new ModelRendererTurbo(this, 633, 57, textureX, textureY); // Box 191
        slideModel[109] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 192
        slideModel[110] = new ModelRendererTurbo(this, 937, 41, textureX, textureY); // Box 193
        slideModel[111] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 194
        slideModel[112] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 195
        slideModel[113] = new ModelRendererTurbo(this, 929, 145, textureX, textureY); // Box 196
        slideModel[114] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 197
        slideModel[115] = new ModelRendererTurbo(this, 489, 225, textureX, textureY); // Box 232
        slideModel[116] = new ModelRendererTurbo(this, 577, 81, textureX, textureY); // Box 256
        slideModel[117] = new ModelRendererTurbo(this, 713, 81, textureX, textureY); // Box 257
        slideModel[118] = new ModelRendererTurbo(this, 825, 81, textureX, textureY); // Box 258
        slideModel[119] = new ModelRendererTurbo(this, 849, 81, textureX, textureY); // Box 259
        slideModel[120] = new ModelRendererTurbo(this, 641, 89, textureX, textureY); // Box 260
        slideModel[121] = new ModelRendererTurbo(this, 649, 89, textureX, textureY); // Box 261
        slideModel[122] = new ModelRendererTurbo(this, 929, 105, textureX, textureY); // Box 262
        slideModel[123] = new ModelRendererTurbo(this, 937, 105, textureX, textureY); // Box 263
        slideModel[124] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 264
        slideModel[125] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 265
        slideModel[126] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 266
        slideModel[127] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 267
        slideModel[128] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 268
        slideModel[129] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 269
        slideModel[130] = new ModelRendererTurbo(this, 1017, 137, textureX, textureY); // Box 270
        slideModel[131] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 271
        slideModel[132] = new ModelRendererTurbo(this, 513, 145, textureX, textureY); // Box 272
        slideModel[133] = new ModelRendererTurbo(this, 889, 145, textureX, textureY); // Box 273
        slideModel[134] = new ModelRendererTurbo(this, 897, 145, textureX, textureY); // Box 274
        slideModel[135] = new ModelRendererTurbo(this, 377, 153, textureX, textureY); // Box 275
        slideModel[136] = new ModelRendererTurbo(this, 529, 161, textureX, textureY); // Box 276
        slideModel[137] = new ModelRendererTurbo(this, 537, 161, textureX, textureY); // Box 277
        slideModel[138] = new ModelRendererTurbo(this, 561, 161, textureX, textureY); // Box 278
        slideModel[139] = new ModelRendererTurbo(this, 569, 161, textureX, textureY); // Box 279
        slideModel[140] = new ModelRendererTurbo(this, 601, 161, textureX, textureY); // Box 280
        slideModel[141] = new ModelRendererTurbo(this, 857, 65, textureX, textureY); // Box 281
        slideModel[142] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 282
        slideModel[143] = new ModelRendererTurbo(this, 985, 65, textureX, textureY); // Box 283
        slideModel[144] = new ModelRendererTurbo(this, 561, 81, textureX, textureY); // Box 284
        slideModel[145] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 285
        slideModel[146] = new ModelRendererTurbo(this, 681, 65, textureX, textureY); // Box 286
        slideModel[147] = new ModelRendererTurbo(this, 585, 81, textureX, textureY); // Box 288
        slideModel[148] = new ModelRendererTurbo(this, 705, 105, textureX, textureY); // Box 289
        slideModel[149] = new ModelRendererTurbo(this, 521, 121, textureX, textureY); // Box 290
        slideModel[150] = new ModelRendererTurbo(this, 657, 89, textureX, textureY); // Box 291
        slideModel[151] = new ModelRendererTurbo(this, 857, 89, textureX, textureY); // Box 292
        slideModel[152] = new ModelRendererTurbo(this, 1017, 65, textureX, textureY); // Box 293
        slideModel[153] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 294
        slideModel[154] = new ModelRendererTurbo(this, 905, 65, textureX, textureY); // Box 295
        slideModel[155] = new ModelRendererTurbo(this, 945, 65, textureX, textureY); // Box 296
        slideModel[156] = new ModelRendererTurbo(this, 841, 241, textureX, textureY); // Box 349
        slideModel[157] = new ModelRendererTurbo(this, 1001, 193, textureX, textureY); // Box 384
        slideModel[158] = new ModelRendererTurbo(this, 889, 161, textureX, textureY); // Box 385
        slideModel[159] = new ModelRendererTurbo(this, 337, 153, textureX, textureY); // Box 386
        slideModel[160] = new ModelRendererTurbo(this, 705, 161, textureX, textureY); // Box 387
        slideModel[161] = new ModelRendererTurbo(this, 361, 257, textureX, textureY); // Box 388
        slideModel[162] = new ModelRendererTurbo(this, 945, 201, textureX, textureY); // Box 389
        slideModel[163] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 390
        slideModel[164] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Box 391
        slideModel[165] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 392
        slideModel[166] = new ModelRendererTurbo(this, 625, 257, textureX, textureY); // Box 393
        slideModel[167] = new ModelRendererTurbo(this, 521, 65, textureX, textureY); // Box 395
        slideModel[168] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Box 396
        slideModel[169] = new ModelRendererTurbo(this, 633, 65, textureX, textureY); // Box 397
        slideModel[170] = new ModelRendererTurbo(this, 961, 257, textureX, textureY); // Box 398
        slideModel[171] = new ModelRendererTurbo(this, 761, 193, textureX, textureY); // Box 399
        slideModel[172] = new ModelRendererTurbo(this, 305, 209, textureX, textureY); // Box 400
        slideModel[173] = new ModelRendererTurbo(this, 417, 273, textureX, textureY); // Box 401
        slideModel[174] = new ModelRendererTurbo(this, 625, 273, textureX, textureY); // Box 402
        slideModel[175] = new ModelRendererTurbo(this, 641, 257, textureX, textureY); // Box 403
        slideModel[176] = new ModelRendererTurbo(this, 993, 257, textureX, textureY); // Box 404
        slideModel[177] = new ModelRendererTurbo(this, 89, 265, textureX, textureY); // Box 405
        slideModel[178] = new ModelRendererTurbo(this, 321, 169, textureX, textureY); // Box 406
        slideModel[179] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Box 407
        slideModel[180] = new ModelRendererTurbo(this, 913, 169, textureX, textureY); // Box 408
        slideModel[181] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Box 409
        slideModel[182] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 410
        slideModel[183] = new ModelRendererTurbo(this, 665, 177, textureX, textureY); // Box 411
        slideModel[184] = new ModelRendererTurbo(this, 849, 177, textureX, textureY); // Box 412
        slideModel[185] = new ModelRendererTurbo(this, 1001, 177, textureX, textureY); // Box 413
        slideModel[186] = new ModelRendererTurbo(this, 145, 185, textureX, textureY); // Box 414
        slideModel[187] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Box 415
        slideModel[188] = new ModelRendererTurbo(this, 297, 185, textureX, textureY); // Box 416
        slideModel[189] = new ModelRendererTurbo(this, 361, 193, textureX, textureY); // Box 417
        slideModel[190] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 418
        slideModel[191] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 419
        slideModel[192] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Box 420
        slideModel[193] = new ModelRendererTurbo(this, 553, 209, textureX, textureY); // Box 421
        slideModel[194] = new ModelRendererTurbo(this, 609, 209, textureX, textureY); // Box 422
        slideModel[195] = new ModelRendererTurbo(this, 217, 209, textureX, textureY); // Box 423
        slideModel[196] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 424
        slideModel[197] = new ModelRendererTurbo(this, 617, 81, textureX, textureY); // Box 425
        slideModel[198] = new ModelRendererTurbo(this, 897, 185, textureX, textureY); // Box 426
        slideModel[199] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 427
        slideModel[200] = new ModelRendererTurbo(this, 337, 193, textureX, textureY); // Box 428
        slideModel[201] = new ModelRendererTurbo(this, 41, 273, textureX, textureY); // Box 429

        slideModel[0].addShapeBox(0F, 0F, 0F, 22, 10, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 0
        slideModel[0].setRotationPoint(86F, -110F, -9F);

        slideModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 17, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
        slideModel[1].setRotationPoint(111F, -112F, -8.5F);

        slideModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 16, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
        slideModel[2].setRotationPoint(111F, -115F, -8F);

        slideModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 7
        slideModel[3].setRotationPoint(111F, -118F, 0F);

        slideModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
        slideModel[4].setRotationPoint(111F, -118F, -6F);

        slideModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 16, 0F, 0F, 0F, -1.75F, 0F, -0.75F, -2.5F, 0F, -0.75F, -2.5F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0F, 0F); // Box 9
        slideModel[5].setRotationPoint(112F, -115F, -8F);

        slideModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 17, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 10
        slideModel[6].setRotationPoint(112F, -112F, -8.5F);

        slideModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, -1F, -3F, 0F, -2F, -3.25F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0.75F, -0.5F, 0F, 0.75F, 0F, 0F, 0F, 0F); // Box 12
        slideModel[7].setRotationPoint(112F, -118F, -6F);

        slideModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, -3.25F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.5F, 0F, 0F, 0.25F); // Box 13
        slideModel[8].setRotationPoint(112F, -118F, 0F);

        slideModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0.25F, 0F, 0.75F, -0.5F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -2F, -3.25F, 0F, -1.5F, 0F, 0F, -0.5F, 0F); // Box 35
        slideModel[9].setRotationPoint(112F, -103F, -6F);

        slideModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 16, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.75F, -2.5F, 0F, -0.75F, -2.5F, 0F, 0F, -1.75F); // Box 36
        slideModel[10].setRotationPoint(112F, -106F, -8F);

        slideModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 17, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, -0.5F); // Box 37
        slideModel[11].setRotationPoint(112F, -109F, -8.5F);

        slideModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.5F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, -3.25F, 0F, -1F, -3F); // Box 38
        slideModel[12].setRotationPoint(112F, -103F, 0F);

        slideModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -3F, 0F, -1F, -3F); // Box 39
        slideModel[13].setRotationPoint(111F, -103F, 0F);

        slideModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F); // Box 40
        slideModel[14].setRotationPoint(111F, -106F, -8F);

        slideModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
        slideModel[15].setRotationPoint(111F, -109F, -8.5F);

        slideModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 42
        slideModel[16].setRotationPoint(111F, -103F, -6F);

        slideModel[17].addShapeBox(0F, 0F, 0F, 149, 2, 1, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
        slideModel[17].setRotationPoint(-38F, -112F, -9F);

        slideModel[18].addShapeBox(0F, 0F, 0F, 38, 3, 1, 0F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 44
        slideModel[18].setRotationPoint(-38F, -115F, -8.5F);

        slideModel[19].addShapeBox(0F, 0F, 0F, 38, 1, 3, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
        slideModel[19].setRotationPoint(-38F, -118F, -3F);

        slideModel[20].addShapeBox(0F, 0F, 0F, 38, 3, 1, 0F, 0F, -0.5F, -1.75F, 0F, -0.5F, -1.75F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, -0.25F, 1.75F, 0F, -0.25F, 1.75F, 0F, 0.5F, -2F, 0F, 0.5F, -2F); // Box 46
        slideModel[20].setRotationPoint(-38F, -118F, -5F);

        slideModel[21].addShapeBox(0F, 0F, 0F, 149, 2, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
        slideModel[21].setRotationPoint(-38F, -112F, 8F);

        slideModel[22].addShapeBox(0F, 0F, 0F, 149, 3, 1, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 48
        slideModel[22].setRotationPoint(-38F, -115F, 7.5F);

        slideModel[23].addShapeBox(0F, 0F, 0F, 38, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 49
        slideModel[23].setRotationPoint(-38F, -118F, 0F);

        slideModel[24].addShapeBox(0F, 0F, 0F, 149, 3, 1, 0F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, -1.75F, 0F, -0.5F, -1.75F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -0.25F, 1.75F, 0F, -0.25F, 1.75F); // Box 50
        slideModel[24].setRotationPoint(-38F, -118F, 4F);

        slideModel[25].addShapeBox(0F, 0F, 0F, 92, 1, 3, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
        slideModel[25].setRotationPoint(19F, -118F, -3F);

        slideModel[26].addShapeBox(0F, 0F, 0F, 92, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 2F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 2F, 0.5F, 0F); // Box 52
        slideModel[26].setRotationPoint(19F, -118F, 0F);

        slideModel[27].addShapeBox(0F, 0F, 0F, 92, 3, 1, 0F, 0F, -0.5F, -1.75F, 0F, -0.5F, -1.75F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, -0.25F, 1.75F, 0F, -0.25F, 1.75F, 0F, 0.5F, -2F, 0F, 0.5F, -2F); // Box 53
        slideModel[27].setRotationPoint(19F, -118F, -5F);

        slideModel[28].addShapeBox(0F, 0F, 0F, 92, 3, 1, 0F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 54
        slideModel[28].setRotationPoint(19F, -115F, -8.5F);

        slideModel[29].addShapeBox(0F, 0F, 0F, 18, 3, 6, 0F, -1.25F, 0.25F, -2.25F, 0F, 0.25F, -2.25F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 56
        slideModel[29].setRotationPoint(-56F, -115F, -9F);

        slideModel[30].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F, -1.25F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 59
        slideModel[30].setRotationPoint(-57F, -112F, -9F);

        slideModel[31].addShapeBox(0F, 0F, 0F, 18, 3, 6, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2.25F, -1.25F, 0.25F, -2.25F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Box 64
        slideModel[31].setRotationPoint(-56F, -115F, 3F);

        slideModel[32].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -1.25F, 0.25F, -0.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
        slideModel[32].setRotationPoint(-57F, -112F, 3F);

        slideModel[33].addShapeBox(0F, 0F, 0F, 17, 3, 3, 0F, -1.4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.75F, -1.5F, -0.5F, -2.75F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F); // Box 66
        slideModel[33].setRotationPoint(-55F, -118F, 3F);

        slideModel[34].addShapeBox(0F, 0F, 0F, 17, 3, 3, 0F, -1.5F, -0.5F, -2.75F, 0F, -0.5F, -2.75F, 0F, -0.5F, 0F, -1.4F, -0.5F, 0F, -0.25F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0F, 0.75F, -0.25F, 0F); // Box 68
        slideModel[34].setRotationPoint(-55F, -118F, -6F);

        slideModel[35].addShapeBox(0F, 0F, 0F, 3, 7, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
        slideModel[35].setRotationPoint(108F, -110F, -9F);

        slideModel[36].addShapeBox(0F, 0F, 0F, 3, 3, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F); // Box 70
        slideModel[36].setRotationPoint(108F, -103F, -9F);

        slideModel[37].addShapeBox(0F, 0F, 0F, 22, 2, 15, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 71
        slideModel[37].setRotationPoint(86F, -97.5F, -7.5F);

        slideModel[38].addShapeBox(0F, 0F, 0F, 22, 3, 18, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1.25F); // Box 72
        slideModel[38].setRotationPoint(86F, -100F, -9F);

        slideModel[39].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -3F); // Box 73
        slideModel[39].setRotationPoint(108F, -97.5F, -7.5F);

        slideModel[40].addShapeBox(0F, 0F, 0F, 2, 3, 18, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, -1.5F); // Box 74
        slideModel[40].setRotationPoint(108F, -100F, -9F);

        slideModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F); // Box 75
        slideModel[41].setRotationPoint(110F, -98.5F, -7.5F);

        slideModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, -1.5F); // Box 76
        slideModel[42].setRotationPoint(110F, -101F, -9F);

        slideModel[43].addShapeBox(0F, 0F, 0F, 93, 10, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 77
        slideModel[43].setRotationPoint(-10F, -110F, 9F);

        slideModel[44].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, -1.5F, 0.25F, -0.5F, 0F, 1F, -0.5F); // Box 78
        slideModel[44].setRotationPoint(83F, -110F, 9F);

        slideModel[45].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, -0.5F, 0.5F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 79
        slideModel[45].setRotationPoint(83F, -110F, 9F);

        slideModel[46].addShapeBox(0F, 0F, 0F, 49, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 80
        slideModel[46].setRotationPoint(30F, -100F, 9F);

        slideModel[47].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.5F, 0F); // Box 81
        slideModel[47].setRotationPoint(79F, -100F, 9F);

        slideModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F); // Box 82
        slideModel[48].setRotationPoint(81F, -100F, 9F);

        slideModel[49].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 83
        slideModel[49].setRotationPoint(12F, -100F, 8F);

        slideModel[50].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, 0F); // Box 85
        slideModel[50].setRotationPoint(5F, -100F, 8F);

        slideModel[51].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, -0.5F, 0F); // Box 86
        slideModel[51].setRotationPoint(-1F, -100F, 8F);

        slideModel[52].addShapeBox(0F, 0F, 0F, 11, 5, 2, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, -0.75F, 0F, 1F, -0.75F, 0F, 1F, -0.75F, 0F, 0.75F, -0.75F, 0F); // Box 87
        slideModel[52].setRotationPoint(-12F, -100F, 8F);

        slideModel[53].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 88
        slideModel[53].setRotationPoint(27F, -100F, 8F);

        slideModel[54].addShapeBox(0F, 0F, 0F, 3, 3, 18, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -0.5F, -0.5F, -1F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, -0.5F, -0.5F, -1F); // Box 89
        slideModel[54].setRotationPoint(83F, -100F, -9F);

        slideModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F, 1F, -1.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 1F, -1.75F, 0.25F, -0.5F, 0.5F, -2.5F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, -0.5F, 0.5F, -2.5F); // Box 90
        slideModel[55].setRotationPoint(84F, -97.5F, -7.5F);

        slideModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F, 0F, 0.25F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.25F, 0F, -1.25F, -1F, -2F, 0.5F, -1.5F, -2F, 0.5F, -1.5F, -2F, -1.25F, -1F, -2F); // Box 91
        slideModel[56].setRotationPoint(81F, -98F, -10F);

        slideModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F, 0F, -1.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, 0F, -2.25F, 0.25F, -2F, 1.25F, -1F, -2F, 1.25F, -1F, -2F, -2.25F, 0.25F, -2F); // Box 92
        slideModel[57].setRotationPoint(79F, -98F, -10F);

        slideModel[58].addShapeBox(0F, 0F, 0F, 51, 1, 3, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -2F, -1.5F, 0.25F, -2F); // Box 93
        slideModel[58].setRotationPoint(30F, -97F, 7F);

        slideModel[59].addShapeBox(0F, 0F, 0F, 5, 2, 16, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.25F, -0.25F, -3F, 0.25F, -0.25F, -3F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 94
        slideModel[59].setRotationPoint(81F, -98F, -8F);

        slideModel[60].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -1.25F, -0.75F, 0F, -1.25F, -0.75F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 96
        slideModel[60].setRotationPoint(80F, -96F, -8F);

        slideModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, -3F); // Box 97
        slideModel[61].setRotationPoint(80F, -94F, -7F);

        slideModel[62].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F, -1F, -0.25F, -0.25F, 0.5F, -1F, -3F, 0.5F, -1F, -3F, -1F, -0.25F, -0.25F, -0.25F, 0F, -1.25F, -0.75F, 0F, -2.5F, -0.75F, 0F, -2.5F, -0.25F, 0F, -1.25F); // Box 98
        slideModel[62].setRotationPoint(82F, -96F, -8F);

        slideModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, -0.25F, 0F, -0.25F, 0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, -0.25F, 0F, -0.25F, 0F, 0F, -3F, -0.75F, 0F, -3.35F, -0.75F, 0F, -3.35F, 0F, 0F, -3F); // Box 99
        slideModel[63].setRotationPoint(82F, -94F, -7F);

        slideModel[64].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 1.5F, -0.25F, 0F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.5F, -0.25F, -0.5F); // Box 101
        slideModel[64].setRotationPoint(-12.5F, -110F, 9F);

        slideModel[65].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 1.5F, 0.25F, 0F, -2F, 0.75F, 0F, -2F, 0.75F, 0F, 1.5F, 0.25F, -0.5F); // Box 103
        slideModel[65].setRotationPoint(-14F, -110F, 9F);

        slideModel[66].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 1.25F, -0.5F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 1.25F, -0.5F, -0.5F); // Box 104
        slideModel[66].setRotationPoint(-17F, -110F, 9F);

        slideModel[67].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 1.25F, 0F, 0F, -2F, 0.25F, 0F, -2F, 0.25F, 0F, 1.25F, 0F, -0.5F); // Box 105
        slideModel[67].setRotationPoint(-15.5F, -110F, 9F);

        slideModel[68].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 1.25F, 0.25F, 0F, -1.75F, 0.5F, 0F, -1.75F, 0.5F, 0F, 1.25F, 0.25F, -0.5F); // Box 106
        slideModel[68].setRotationPoint(-18.5F, -110F, 9F);

        slideModel[69].addShapeBox(0F, 0F, 0F, 28, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 2.25F, 0.25F, 0F); // Box 107
        slideModel[69].setRotationPoint(-50F, -110F, 9F);

        slideModel[70].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 1.75F, 0.25F, 0F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, -0.5F); // Box 108
        slideModel[70].setRotationPoint(-52F, -110F, 9F);

        slideModel[71].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 1.75F, 0.25F, 0F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, -0.5F); // Box 109
        slideModel[71].setRotationPoint(-53.5F, -110F, 9F);

        slideModel[72].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 1.75F, 0.25F, 0F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, -0.5F); // Box 110
        slideModel[72].setRotationPoint(-55F, -110F, 9F);

        slideModel[73].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 1.75F, 0.25F, 0F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, -0.5F); // Box 111
        slideModel[73].setRotationPoint(-56.5F, -110F, 9F);

        slideModel[74].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.25F, -0.5F, 1.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.25F, 0.25F, -0.5F); // Box 112
        slideModel[74].setRotationPoint(-58F, -110F, 9F);

        slideModel[75].addShapeBox(0F, 0F, 0F, 19, 7, 6, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 2.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 1.5F, -0.75F, 0F); // Box 113
        slideModel[75].setRotationPoint(-66F, -102F, 3F);

        slideModel[76].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F, 0.5F, 1.75F, 0F, -1F, 3F, 0F, 0.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
        slideModel[76].setRotationPoint(-64F, -105F, 3F);

        slideModel[77].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F, 1F, 0F, 0F, -2F, 2F, 0F, 0F, 2F, 0F, -0.5F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
        slideModel[77].setRotationPoint(-61F, -108F, 3F);

        slideModel[78].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, 0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 0F, 0F, -0.25F, -1.25F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 116
        slideModel[78].setRotationPoint(-66F, -105F, 3F);

        slideModel[79].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.25F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -1.75F, -0.5F, 1.75F, 0.25F, 0F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, -0.5F); // Box 117
        slideModel[79].setRotationPoint(-59F, -110F, 9F);

        slideModel[80].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F, 0F, -2F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, 0F, -2.5F, -0.5F, 1.75F, 0.25F, 0F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, -0.5F); // Box 118
        slideModel[80].setRotationPoint(-60.5F, -109F, 9F);

        slideModel[81].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 119
        slideModel[81].setRotationPoint(-64F, -105F, 9F);

        slideModel[82].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, 1F, 0.25F, 0F); // Box 120
        slideModel[82].setRotationPoint(-66F, -102F, 9F);

        slideModel[83].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, -0.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
        slideModel[83].setRotationPoint(-66F, -105F, 9F);

        slideModel[84].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F, 0F, 0F, 0F, 0.5F, 2F, 0F, -1F, 3F, 0F, 0.5F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 123
        slideModel[84].setRotationPoint(-64F, -105F, -9F);

        slideModel[85].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F, -0.5F, -1F, 0F, 0F, 2F, 0F, -2F, 2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Box 124
        slideModel[85].setRotationPoint(-61F, -108F, -9F);

        slideModel[86].addShapeBox(0F, 0F, 0F, 19, 7, 6, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 2.75F, -0.75F, 0F); // Box 129
        slideModel[86].setRotationPoint(-66F, -102F, -9F);

        slideModel[87].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, -0.25F, -1.25F, 0F, 0F, 0F, 0F, -0.5F, 1.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F); // Box 130
        slideModel[87].setRotationPoint(-66F, -105F, -9F);

        slideModel[88].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, 1.5F, 0.25F, 0F); // Box 131
        slideModel[88].setRotationPoint(-66F, -102F, -10F);

        slideModel[89].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 132
        slideModel[89].setRotationPoint(-66F, -105F, -10F);

        slideModel[90].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, -0.75F, 3.5F, 0F, 0.25F, 3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 1F, 0F, 0F); // Box 140
        slideModel[90].setRotationPoint(-26F, -106F, 10F);

        slideModel[91].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 2F, 0F, 0F); // Box 141
        slideModel[91].setRotationPoint(-27F, -102F, 10F);

        slideModel[92].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, -4F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -4F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F); // Box 142
        slideModel[92].setRotationPoint(-33F, -99F, 10F);

        slideModel[93].addShapeBox(0F, 0F, 0F, 2, 11, 2, 0F, -0.75F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, 1.75F, 0.25F, 0F, -2F, 0.25F, 0F, -2F, 0.25F, -0.5F, 1.75F, 0.25F, -0.5F); // Box 143
        slideModel[93].setRotationPoint(-24.5F, -107F, 10F);

        slideModel[94].addShapeBox(0F, 0F, 0F, 4, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -1.75F, 0.25F, 0F, -1.75F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 144
        slideModel[94].setRotationPoint(-22F, -110F, 9F);

        slideModel[95].addShapeBox(0F, 0F, 0F, 2, 11, 1, 0F, -0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 2F, 0.25F, 0F, -1.75F, 0.25F, 0F, -2F, 0.25F, 0F, 2F, 0.25F, 0F); // Box 145
        slideModel[95].setRotationPoint(-22.5F, -107F, 10F);

        slideModel[96].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F, -0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0F, 1.5F, -0.5F, -0.25F, 1.5F, -0.5F, 1.75F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.75F, 0.25F, -0.5F, 1.75F, 0.25F, -0.5F); // Box 146
        slideModel[96].setRotationPoint(-20.5F, -107F, 10F);

        slideModel[97].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 2.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.5F, 2.5F, 0.25F, -0.5F); // Box 147
        slideModel[97].setRotationPoint(-31F, -97F, 10F);

        slideModel[98].addShapeBox(0F, 0F, 0F, 93, 10, 1, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 181
        slideModel[98].setRotationPoint(-10F, -110F, -10F);

        slideModel[99].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, 0F, -0.25F, -0.5F, -1.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, -1.5F, 0.25F, -0.5F, 0F, 0.5F, 0F, 0F, 1.5F, 0F); // Box 182
        slideModel[99].setRotationPoint(83F, -110F, -10F);

        slideModel[100].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, -0.5F, 0F, 1F, -0.5F); // Box 183
        slideModel[100].setRotationPoint(83F, -110F, -10F);

        slideModel[101].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 184
        slideModel[101].setRotationPoint(-52F, -110F, -10F);

        slideModel[102].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 185
        slideModel[102].setRotationPoint(-53.5F, -110F, -10F);

        slideModel[103].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 186
        slideModel[103].setRotationPoint(-55F, -110F, -10F);

        slideModel[104].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 187
        slideModel[104].setRotationPoint(-56.5F, -110F, -10F);

        slideModel[105].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -1F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1.25F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.25F, 0.25F, 0F); // Box 188
        slideModel[105].setRotationPoint(-58F, -110F, -10F);

        slideModel[106].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.25F, -1.75F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -1.5F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 189
        slideModel[106].setRotationPoint(-59F, -110F, -10F);

        slideModel[107].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F, 0F, -2.5F, -0.5F, -0.25F, -1F, 0F, -0.25F, -0.5F, 0F, 0F, -2F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 190
        slideModel[107].setRotationPoint(-60.5F, -109F, -10F);

        slideModel[108].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, -0.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 191
        slideModel[108].setRotationPoint(-64F, -105F, -10F);

        slideModel[109].addShapeBox(0F, 0F, 0F, 51, 3, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F); // Box 192
        slideModel[109].setRotationPoint(28F, -100F, -10F);

        slideModel[110].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.5F, 0F); // Box 193
        slideModel[110].setRotationPoint(79F, -100F, -10F);

        slideModel[111].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F); // Box 194
        slideModel[111].setRotationPoint(81F, -100F, -10F);

        slideModel[112].addShapeBox(0F, 0F, 0F, 53, 1, 3, 0F, 1F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, 0F, 1F, 0.25F, 0F); // Box 195
        slideModel[112].setRotationPoint(28F, -97F, -10F);

        slideModel[113].addShapeBox(0F, 0F, 0F, 39, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.75F, 0.25F, 0F); // Box 196
        slideModel[113].setRotationPoint(-12F, -100F, -10F);

        slideModel[114].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 197
        slideModel[114].setRotationPoint(-12.5F, -110F, -10F);

        slideModel[115].addShapeBox(0F, 0F, 0F, 64, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
        slideModel[115].setRotationPoint(-50F, -109.5F, 8F);

        slideModel[116].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 256
        slideModel[116].setRotationPoint(-47.5F, -110F, -10F);

        slideModel[117].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 257
        slideModel[117].setRotationPoint(-46F, -110F, -10F);

        slideModel[118].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 258
        slideModel[118].setRotationPoint(-49F, -110F, -10F);

        slideModel[119].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 259
        slideModel[119].setRotationPoint(-50.5F, -110F, -10F);

        slideModel[120].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 260
        slideModel[120].setRotationPoint(-35.5F, -110F, -10F);

        slideModel[121].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 261
        slideModel[121].setRotationPoint(-34F, -110F, -10F);

        slideModel[122].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 262
        slideModel[122].setRotationPoint(-37F, -110F, -10F);

        slideModel[123].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 263
        slideModel[123].setRotationPoint(-38.5F, -110F, -10F);

        slideModel[124].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 264
        slideModel[124].setRotationPoint(-40F, -110F, -10F);

        slideModel[125].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 265
        slideModel[125].setRotationPoint(-41.5F, -110F, -10F);

        slideModel[126].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 266
        slideModel[126].setRotationPoint(-43F, -110F, -10F);

        slideModel[127].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 267
        slideModel[127].setRotationPoint(-44.5F, -110F, -10F);

        slideModel[128].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 268
        slideModel[128].setRotationPoint(-23.5F, -110F, -10F);

        slideModel[129].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 269
        slideModel[129].setRotationPoint(-22F, -110F, -10F);

        slideModel[130].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 270
        slideModel[130].setRotationPoint(-25F, -110F, -10F);

        slideModel[131].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 271
        slideModel[131].setRotationPoint(-26.5F, -110F, -10F);

        slideModel[132].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 272
        slideModel[132].setRotationPoint(-28F, -110F, -10F);

        slideModel[133].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 273
        slideModel[133].setRotationPoint(-29.5F, -110F, -10F);

        slideModel[134].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 274
        slideModel[134].setRotationPoint(-31F, -110F, -10F);

        slideModel[135].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 275
        slideModel[135].setRotationPoint(-32.5F, -110F, -10F);

        slideModel[136].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2F, 0.25F, 0F, -2F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 276
        slideModel[136].setRotationPoint(-16F, -110F, -10F);

        slideModel[137].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 277
        slideModel[137].setRotationPoint(-17.5F, -110F, -10F);

        slideModel[138].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 278
        slideModel[138].setRotationPoint(-19F, -110F, -10F);

        slideModel[139].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Box 279
        slideModel[139].setRotationPoint(-20.5F, -110F, -10F);

        slideModel[140].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 2F, 0.25F, -0.5F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 2F, 0.25F, 0F); // Box 280
        slideModel[140].setRotationPoint(-14F, -110F, -10F);

        slideModel[141].addShapeBox(0F, 7F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
        slideModel[141].setRotationPoint(-38.75F, -108F, 10F);

        slideModel[142].addShapeBox(-5F, -3F, 0F, 10, 3, 2, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
        slideModel[142].setRotationPoint(-38.75F, -108F, 8F);

        slideModel[143].addShapeBox(0F, -5F, 0F, 3, 3, 2, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 283
        slideModel[143].setRotationPoint(-38.75F, -108F, 8F);

        slideModel[144].addShapeBox(-3F, -5F, 0F, 3, 3, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.5F, -0.5F, 0F); // Box 284
        slideModel[144].setRotationPoint(-38.75F, -108F, 8F);

        slideModel[145].addShapeBox(-5F, -3F, 0F, 10, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.75F, -1F, 0F, -1.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F); // Box 285
        slideModel[145].setRotationPoint(-38.75F, -108F, 10F);

        slideModel[146].addShapeBox(-3F, -5F, 0F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, -1F, -1.75F, 0F, 1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 286
        slideModel[146].setRotationPoint(-38.75F, -108F, 10F);

        slideModel[147].addShapeBox(0F, -5F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -1.75F, 0F, 0F, -1.25F, 0F, 0F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 288
        slideModel[147].setRotationPoint(-38.75F, -108F, 10F);

        slideModel[148].addShapeBox(-5F, 0F, 0F, 10, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1.75F, -1F, 0F, -1.75F, -1F, 0F); // Box 289
        slideModel[148].setRotationPoint(-38.75F, -108F, 10F);

        slideModel[149].addShapeBox(-4F, 2F, 0F, 5, 8, 1, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, -0.5F, 0F); // Box 290
        slideModel[149].setRotationPoint(-38.75F, -108F, 10F);

        slideModel[150].addShapeBox(0F, 3F, 0F, 4, 4, 2, 0F, -1F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
        slideModel[150].setRotationPoint(-38.75F, -108F, 10F);

        slideModel[151].addShapeBox(0F, 9F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 292
        slideModel[151].setRotationPoint(-38.75F, -108F, 10F);

        slideModel[152].addShapeBox(-1F, 3F, 0F, 1, 4, 2, 0F, -1.25F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.25F, 0.5F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F); // Box 293
        slideModel[152].setRotationPoint(-38.75F, -108F, 10F);

        slideModel[153].addShapeBox(1F, 2F, 0F, 2, 1, 2, 0F, 0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.75F, -0.5F, -1F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 294
        slideModel[153].setRotationPoint(-38.75F, -108F, 10F);

        slideModel[154].addShapeBox(-1F, 7F, 0F, 1, 2, 2, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.25F, -1F); // Box 295
        slideModel[154].setRotationPoint(-38.75F, -108F, 10F);

        slideModel[155].addShapeBox(-1F, 9F, 0F, 1, 2, 2, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -1F, -1.25F, -0.75F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1.25F, -0.75F, -0.75F); // Box 296
        slideModel[155].setRotationPoint(-38.75F, -108F, 10F);

        slideModel[156].addShapeBox(0F, 0F, 0F, 8, 23, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
        slideModel[156].setRotationPoint(-55F, -118F, -3F);

        slideModel[157].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
        slideModel[157].setRotationPoint(-51F, -123.5F, 5F);

        slideModel[158].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 385
        slideModel[158].setRotationPoint(-55F, -120.5F, 5F);

        slideModel[159].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 386
        slideModel[159].setRotationPoint(-54F, -123.5F, 5F);

        slideModel[160].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
        slideModel[160].setRotationPoint(-44F, -123.5F, 5F);

        slideModel[161].addShapeBox(0F, 0F, 0F, 12, 8, 1, 0F, 0F, -0.5F, 0F, 0F, -7.75F, 0F, 0F, -7.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 388
        slideModel[161].setRotationPoint(-42F, -123.5F, 5F);

        slideModel[162].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
        slideModel[162].setRotationPoint(-51F, -123.5F, -6F);

        slideModel[163].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 390
        slideModel[163].setRotationPoint(-55F, -120.5F, -6F);

        slideModel[164].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 391
        slideModel[164].setRotationPoint(-54F, -123.5F, -6F);

        slideModel[165].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
        slideModel[165].setRotationPoint(-44F, -123.5F, -6F);

        slideModel[166].addShapeBox(0F, 0F, 0F, 12, 8, 1, 0F, 0F, -0.5F, 0F, 0F, -7.75F, 0F, 0F, -7.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 393
        slideModel[166].setRotationPoint(-42F, -123.5F, -6F);

        slideModel[167].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, -1F, -0.5F, 0F, 0.25F, -0.4F, -0.5F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 395
        slideModel[167].setRotationPoint(-55F, -119.5F, -6F);

        slideModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 396
        slideModel[168].setRotationPoint(-55F, -118.5F, -3F);

        slideModel[169].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0.25F, -0.4F, -0.5F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F); // Box 397
        slideModel[169].setRotationPoint(-55F, -119.5F, 3F);

        slideModel[170].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
        slideModel[170].setRotationPoint(-54F, -119F, -5F);

        slideModel[171].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
        slideModel[171].setRotationPoint(-20F, -118.5F, -2F);

        slideModel[172].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 400
        slideModel[172].setRotationPoint(-20F, -118.5F, 0F);

        slideModel[173].addShapeBox(0F, 0F, 0F, 82, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
        slideModel[173].setRotationPoint(19F, -118.5F, -2F);

        slideModel[174].addShapeBox(0F, 0F, 0F, 82, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 402
        slideModel[174].setRotationPoint(19F, -118.5F, 0F);

        slideModel[175].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 403
        slideModel[175].setRotationPoint(-46F, -120.5F, -6F);

        slideModel[176].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 404
        slideModel[176].setRotationPoint(-46F, -121.5F, -6F);

        slideModel[177].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F); // Box 405
        slideModel[177].setRotationPoint(-46F, -119.5F, -6F);

        slideModel[178].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 406
        slideModel[178].setRotationPoint(-45F, -123F, -5F);

        slideModel[179].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
        slideModel[179].setRotationPoint(-48F, -122F, -5F);

        slideModel[180].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 408
        slideModel[180].setRotationPoint(-48F, -123F, -5F);

        slideModel[181].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F); // Box 409
        slideModel[181].setRotationPoint(-48F, -119F, -5F);

        slideModel[182].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F); // Box 410
        slideModel[182].setRotationPoint(-45F, -119F, -5F);

        slideModel[183].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 411
        slideModel[183].setRotationPoint(-48F, -120F, -5F);

        slideModel[184].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 412
        slideModel[184].setRotationPoint(-45F, -123F, 3F);

        slideModel[185].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
        slideModel[185].setRotationPoint(-48F, -122F, 3F);

        slideModel[186].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 414
        slideModel[186].setRotationPoint(-48F, -123F, 3F);

        slideModel[187].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F); // Box 415
        slideModel[187].setRotationPoint(-48F, -119F, 3F);

        slideModel[188].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F); // Box 416
        slideModel[188].setRotationPoint(-45F, -119F, 3F);

        slideModel[189].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 417
        slideModel[189].setRotationPoint(-48F, -120F, 3F);

        slideModel[190].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
        slideModel[190].setRotationPoint(-47F, -122F, -3F);

        slideModel[191].addShapeBox(0F, 0F, 0F, 13, 3, 6, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 419
        slideModel[191].setRotationPoint(-43F, -120F, -3F);

        slideModel[192].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, -2.25F, 0F, 0F, -0.75F, 1F, 0F, 0F, 0F); // Box 420
        slideModel[192].setRotationPoint(-42F, -118F, 2F);

        slideModel[193].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F, 0F, 0F, 0F, -3.75F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 1F, 1.25F, -2.25F, 0F, 0F, 0F, 0F); // Box 421
        slideModel[193].setRotationPoint(-42F, -118F, -5F);

        slideModel[194].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
        slideModel[194].setRotationPoint(-30F, -118F, -2F);

        slideModel[195].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
        slideModel[195].setRotationPoint(-52F, -122.5F, -5F);

        slideModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
        slideModel[196].setRotationPoint(-52F, -123.5F, -5F);

        slideModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
        slideModel[197].setRotationPoint(-52F, -123.5F, 1F);

        slideModel[198].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
        slideModel[198].setRotationPoint(106F, -122.5F, -1F);

        slideModel[199].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
        slideModel[199].setRotationPoint(109F, -121.5F, -1F);

        slideModel[200].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
        slideModel[200].setRotationPoint(102F, -122.5F, -1F);

        slideModel[201].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F); // Box 429
        slideModel[201].setRotationPoint(101F, -118.5F, -3.5F);


        barrelAttachPoint = new Vector3f(165F / 16F, 148F / 16F, 0F / 16F);

        scopeAttachPoint = new Vector3f(32F / 16F, 157F / 16F, 0F / 16F);

        gripAttachPoint = new Vector3f(108F / 16F, 127F / 16F, 0F / 16F);
        gunSlideDistance = 3.5F;


        animationType = EnumAnimationType.PISTOL_CLIP;
        hasArms = true;
        leftArmPos = new Vector3f(-0.2F, -0.65F, -0.16F);
        leftArmRot = new Vector3f(80.0F, 35.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.27F, -0.57F, -0.15F);
        leftArmReloadRot = new Vector3f(70.0F, 40.0F, 0.0F);
        leftArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        rightArmPos = new Vector3f(0.13F, -0.53F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(0.13F, -0.53F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        rightHandAmmo = false;
        leftHandAmmo = true;
        slideLockOnEmpty = true;
        flashScale = 0.3F;
        muzzleFlashPoint = new Vector3f(1.6F, 1.2F, 0.0F);
        casingAttachPoint = new Vector3f(0.3F, 1.2F, 0.0F);
        casingAnimDistance = new Vector3f(0.0F, 2.0F, 2.75F);
        casingAnimSpread = new Vector3f(0.0F, 0.0F, 3.0F);
        casingAnimTime = 4;
        casingRotateVector = new Vector3f(0.1F, 0.0F, 0.1F);
        caseScale = 0.3F;
        casingDelay = 2;
        crouchZoom = -0.15F;
        ShakeDistance = 0.2F;
        gunOffset = -0.3F;
        translateAll(50.0F, -39.0F, 0.0F);
        flipAll();
        fancyStance = true;
        stanceTranslate = new Vector3f(0.4D, -0.1D, 0.2D);
        stanceRotate = new Vector3f(0.0F, 0.0F, 45.0F);
        thirdPersonOffset = new Vector3f(0 / 16F, -3F / 16F, 0F / 16F);

        hasFlash = true;
        flashScale = 6F;
        muzzleFlashPoint = new Vector3f(
                barrelAttachPoint.x / flashScale,
                barrelAttachPoint.y / flashScale,
                barrelAttachPoint.z / flashScale
        );
    }
}