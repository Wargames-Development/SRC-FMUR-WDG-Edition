//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SA58
// Model Creator: 
// Created on: 27.07.2023 - 15:09:07
// Last changed on: 27.07.2023 - 15:09:07

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelSA58 extends ModelGun //Same as Filename
{
    int textureX = 1024;
    int textureY = 1024;

    public ModelSA58() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[382];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
        gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
        gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 3
        gunModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 4
        gunModel[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 5
        gunModel[5] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 6
        gunModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 7
        gunModel[7] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 8
        gunModel[8] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 9
        gunModel[9] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 10
        gunModel[10] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 11
        gunModel[11] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 12
        gunModel[12] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 13
        gunModel[13] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 14
        gunModel[14] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 15
        gunModel[15] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 16
        gunModel[16] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 17
        gunModel[17] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 26
        gunModel[18] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 27
        gunModel[19] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 28
        gunModel[20] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 29
        gunModel[21] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 30
        gunModel[22] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 31
        gunModel[23] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 32
        gunModel[24] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 33
        gunModel[25] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 34
        gunModel[26] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 35
        gunModel[27] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 36
        gunModel[28] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 37
        gunModel[29] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 38
        gunModel[30] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 39
        gunModel[31] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 40
        gunModel[32] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 41
        gunModel[33] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 42
        gunModel[34] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 43
        gunModel[35] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 44
        gunModel[36] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 45
        gunModel[37] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 46
        gunModel[38] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 47
        gunModel[39] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Box 265
        gunModel[40] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 266
        gunModel[41] = new ModelRendererTurbo(this, 617, 17, textureX, textureY); // Box 267
        gunModel[42] = new ModelRendererTurbo(this, 713, 17, textureX, textureY); // Box 268
        gunModel[43] = new ModelRendererTurbo(this, 737, 17, textureX, textureY); // Box 269
        gunModel[44] = new ModelRendererTurbo(this, 945, 9, textureX, textureY); // Box 270
        gunModel[45] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Box 271
        gunModel[46] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 272
        gunModel[47] = new ModelRendererTurbo(this, 537, 33, textureX, textureY); // Box 273
        gunModel[48] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 274
        gunModel[49] = new ModelRendererTurbo(this, 905, 17, textureX, textureY); // Box 275
        gunModel[50] = new ModelRendererTurbo(this, 945, 17, textureX, textureY); // Box 276
        gunModel[51] = new ModelRendererTurbo(this, 969, 25, textureX, textureY); // Box 23
        gunModel[52] = new ModelRendererTurbo(this, 681, 33, textureX, textureY); // Box 31
        gunModel[53] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 32
        gunModel[54] = new ModelRendererTurbo(this, 889, 17, textureX, textureY); // Box 260
        gunModel[55] = new ModelRendererTurbo(this, 729, 33, textureX, textureY); // Box 261
        gunModel[56] = new ModelRendererTurbo(this, 937, 33, textureX, textureY); // Box 262
        gunModel[57] = new ModelRendererTurbo(this, 969, 17, textureX, textureY); // Box 141
        gunModel[58] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 142
        gunModel[59] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box 143
        gunModel[60] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Box 144
        gunModel[61] = new ModelRendererTurbo(this, 665, 33, textureX, textureY); // Box 145
        gunModel[62] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 146
        gunModel[63] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 308
        gunModel[64] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 309
        gunModel[65] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 310
        gunModel[66] = new ModelRendererTurbo(this, 961, 33, textureX, textureY); // Box 311
        gunModel[67] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 312
        gunModel[68] = new ModelRendererTurbo(this, 889, 17, textureX, textureY); // Box 313
        gunModel[69] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 314
        gunModel[70] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 315
        gunModel[71] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 317
        gunModel[72] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 318
        gunModel[73] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 319
        gunModel[74] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 320
        gunModel[75] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 322
        gunModel[76] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 323
        gunModel[77] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 324
        gunModel[78] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 33
        gunModel[79] = new ModelRendererTurbo(this, 745, 41, textureX, textureY); // Box 34
        gunModel[80] = new ModelRendererTurbo(this, 785, 41, textureX, textureY); // Box 35
        gunModel[81] = new ModelRendererTurbo(this, 817, 41, textureX, textureY); // Box 36
        gunModel[82] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 92
        gunModel[83] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 93
        gunModel[84] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 94
        gunModel[85] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 95
        gunModel[86] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 96
        gunModel[87] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 97
        gunModel[88] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 98
        gunModel[89] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 99
        gunModel[90] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 100
        gunModel[91] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 101
        gunModel[92] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 102
        gunModel[93] = new ModelRendererTurbo(this, 841, 41, textureX, textureY); // Box 340
        gunModel[94] = new ModelRendererTurbo(this, 881, 41, textureX, textureY); // Box 341
        gunModel[95] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 342
        gunModel[96] = new ModelRendererTurbo(this, 513, 41, textureX, textureY); // Box 344
        gunModel[97] = new ModelRendererTurbo(this, 769, 41, textureX, textureY); // Box 345
        gunModel[98] = new ModelRendererTurbo(this, 809, 41, textureX, textureY); // Box 346
        gunModel[99] = new ModelRendererTurbo(this, 873, 41, textureX, textureY); // Box 347
        gunModel[100] = new ModelRendererTurbo(this, 913, 41, textureX, textureY); // Box 348
        gunModel[101] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 349
        gunModel[102] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 350
        gunModel[103] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 351
        gunModel[104] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 352
        gunModel[105] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 353
        gunModel[106] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 354
        gunModel[107] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 355
        gunModel[108] = new ModelRendererTurbo(this, 513, 49, textureX, textureY); // Box 356
        gunModel[109] = new ModelRendererTurbo(this, 665, 49, textureX, textureY); // Box 357
        gunModel[110] = new ModelRendererTurbo(this, 705, 49, textureX, textureY); // Box 358
        gunModel[111] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Box 359
        gunModel[112] = new ModelRendererTurbo(this, 537, 57, textureX, textureY); // Box 360
        gunModel[113] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 361
        gunModel[114] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 362
        gunModel[115] = new ModelRendererTurbo(this, 633, 57, textureX, textureY); // Box 363
        gunModel[116] = new ModelRendererTurbo(this, 857, 57, textureX, textureY); // Box 364
        gunModel[117] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 365
        gunModel[118] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Box 366
        gunModel[119] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 367
        gunModel[120] = new ModelRendererTurbo(this, 721, 33, textureX, textureY); // Box 368
        gunModel[121] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 369
        gunModel[122] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 370
        gunModel[123] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 371
        gunModel[124] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 372
        gunModel[125] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 373
        gunModel[126] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 374
        gunModel[127] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 375
        gunModel[128] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 376
        gunModel[129] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 377
        gunModel[130] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 378
        gunModel[131] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 379
        gunModel[132] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 380
        gunModel[133] = new ModelRendererTurbo(this, 737, 49, textureX, textureY); // Box 382
        gunModel[134] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 383
        gunModel[135] = new ModelRendererTurbo(this, 665, 65, textureX, textureY); // Box 384
        gunModel[136] = new ModelRendererTurbo(this, 841, 41, textureX, textureY); // Box 385
        gunModel[137] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 348
        gunModel[138] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 349
        gunModel[139] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 350
        gunModel[140] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 389
        gunModel[141] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 390
        gunModel[142] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 392
        gunModel[143] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 393
        gunModel[144] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 394
        gunModel[145] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 395
        gunModel[146] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 396
        gunModel[147] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 397
        gunModel[148] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 398
        gunModel[149] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 399
        gunModel[150] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 400
        gunModel[151] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 401
        gunModel[152] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 402
        gunModel[153] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 403
        gunModel[154] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 404
        gunModel[155] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 405
        gunModel[156] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 406
        gunModel[157] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 407
        gunModel[158] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 408
        gunModel[159] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 409
        gunModel[160] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 410
        gunModel[161] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 411
        gunModel[162] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 412
        gunModel[163] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 413
        gunModel[164] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 414
        gunModel[165] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 415
        gunModel[166] = new ModelRendererTurbo(this, 913, 17, textureX, textureY); // Box 416
        gunModel[167] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 547
        gunModel[168] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 548
        gunModel[169] = new ModelRendererTurbo(this, 689, 49, textureX, textureY); // Box 420
        gunModel[170] = new ModelRendererTurbo(this, 937, 49, textureX, textureY); // Box 421
        gunModel[171] = new ModelRendererTurbo(this, 969, 9, textureX, textureY); // Box 422
        gunModel[172] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Box 423
        gunModel[173] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Box 424
        gunModel[174] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 50
        gunModel[175] = new ModelRendererTurbo(this, 705, 25, textureX, textureY); // Box 51
        gunModel[176] = new ModelRendererTurbo(this, 665, 41, textureX, textureY); // Box 52
        gunModel[177] = new ModelRendererTurbo(this, 969, 25, textureX, textureY); // Box 53
        gunModel[178] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 54
        gunModel[179] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 55
        gunModel[180] = new ModelRendererTurbo(this, 769, 49, textureX, textureY); // Box 431
        gunModel[181] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 432
        gunModel[182] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 433
        gunModel[183] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 434
        gunModel[184] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 435
        gunModel[185] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 436
        gunModel[186] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 437
        gunModel[187] = new ModelRendererTurbo(this, 793, 41, textureX, textureY); // Box 438
        gunModel[188] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 439
        gunModel[189] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 440
        gunModel[190] = new ModelRendererTurbo(this, 513, 49, textureX, textureY); // Box 441
        gunModel[191] = new ModelRendererTurbo(this, 521, 49, textureX, textureY); // Box 442
        gunModel[192] = new ModelRendererTurbo(this, 713, 49, textureX, textureY); // Box 443
        gunModel[193] = new ModelRendererTurbo(this, 729, 49, textureX, textureY); // Box 444
        gunModel[194] = new ModelRendererTurbo(this, 745, 49, textureX, textureY); // Box 445
        gunModel[195] = new ModelRendererTurbo(this, 817, 49, textureX, textureY); // Box 446
        gunModel[196] = new ModelRendererTurbo(this, 753, 49, textureX, textureY); // Box 447
        gunModel[197] = new ModelRendererTurbo(this, 825, 49, textureX, textureY); // Box 448
        gunModel[198] = new ModelRendererTurbo(this, 921, 49, textureX, textureY); // Box 449
        gunModel[199] = new ModelRendererTurbo(this, 961, 49, textureX, textureY); // Box 450
        gunModel[200] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 451
        gunModel[201] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 452
        gunModel[202] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 37
        gunModel[203] = new ModelRendererTurbo(this, 729, 65, textureX, textureY); // Box 38
        gunModel[204] = new ModelRendererTurbo(this, 769, 65, textureX, textureY); // Box 39
        gunModel[205] = new ModelRendererTurbo(this, 801, 65, textureX, textureY); // Box 40
        gunModel[206] = new ModelRendererTurbo(this, 841, 65, textureX, textureY); // Box 42
        gunModel[207] = new ModelRendererTurbo(this, 889, 65, textureX, textureY); // Box 44
        gunModel[208] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 47
        gunModel[209] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 48
        gunModel[210] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 466
        gunModel[211] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 467
        gunModel[212] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 468
        gunModel[213] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 473
        gunModel[214] = new ModelRendererTurbo(this, 937, 17, textureX, textureY); // Box 218
        gunModel[215] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 219
        gunModel[216] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 105
        gunModel[217] = new ModelRendererTurbo(this, 593, 81, textureX, textureY); // Box 221
        gunModel[218] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 222
        gunModel[219] = new ModelRendererTurbo(this, 705, 81, textureX, textureY); // Box 162
        gunModel[220] = new ModelRendererTurbo(this, 753, 81, textureX, textureY); // Box 165
        gunModel[221] = new ModelRendererTurbo(this, 793, 81, textureX, textureY); // Box 166
        gunModel[222] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 232
        gunModel[223] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 233
        gunModel[224] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 234
        gunModel[225] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 235
        gunModel[226] = new ModelRendererTurbo(this, 833, 89, textureX, textureY); // Box 236
        gunModel[227] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 252
        gunModel[228] = new ModelRendererTurbo(this, 617, 105, textureX, textureY); // Box 253
        gunModel[229] = new ModelRendererTurbo(this, 825, 105, textureX, textureY); // Box 254
        gunModel[230] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 255
        gunModel[231] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 256
        gunModel[232] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 257
        gunModel[233] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 260
        gunModel[234] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 262
        gunModel[235] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 263
        gunModel[236] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 264
        gunModel[237] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 265
        gunModel[238] = new ModelRendererTurbo(this, 521, 73, textureX, textureY); // Box 266
        gunModel[239] = new ModelRendererTurbo(this, 1001, 73, textureX, textureY); // Box 267
        gunModel[240] = new ModelRendererTurbo(this, 737, 81, textureX, textureY); // Box 268
        gunModel[241] = new ModelRendererTurbo(this, 681, 89, textureX, textureY); // Box 269
        gunModel[242] = new ModelRendererTurbo(this, 785, 81, textureX, textureY); // Box 270
        gunModel[243] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 271
        gunModel[244] = new ModelRendererTurbo(this, 985, 105, textureX, textureY); // Box 272
        gunModel[245] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 273
        gunModel[246] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 274
        gunModel[247] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 275
        gunModel[248] = new ModelRendererTurbo(this, 633, 73, textureX, textureY); // Box 276
        gunModel[249] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 277
        gunModel[250] = new ModelRendererTurbo(this, 705, 97, textureX, textureY); // Box 278
        gunModel[251] = new ModelRendererTurbo(this, 753, 73, textureX, textureY); // Box 279
        gunModel[252] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Box 280
        gunModel[253] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Box 281
        gunModel[254] = new ModelRendererTurbo(this, 761, 17, textureX, textureY); // Box 282
        gunModel[255] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Box 283
        gunModel[256] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 284
        gunModel[257] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Box 285
        gunModel[258] = new ModelRendererTurbo(this, 537, 41, textureX, textureY); // Box 286
        gunModel[259] = new ModelRendererTurbo(this, 729, 97, textureX, textureY); // Box 287
        gunModel[260] = new ModelRendererTurbo(this, 761, 97, textureX, textureY); // Box 288
        gunModel[261] = new ModelRendererTurbo(this, 793, 97, textureX, textureY); // Box 289
        gunModel[262] = new ModelRendererTurbo(this, 545, 41, textureX, textureY); // Box 290
        gunModel[263] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 291
        gunModel[264] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 292
        gunModel[265] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 293
        gunModel[266] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 294
        gunModel[267] = new ModelRendererTurbo(this, 785, 49, textureX, textureY); // Box 295
        gunModel[268] = new ModelRendererTurbo(this, 793, 49, textureX, textureY); // Box 296
        gunModel[269] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 297
        gunModel[270] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 298
        gunModel[271] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 299
        gunModel[272] = new ModelRendererTurbo(this, 825, 73, textureX, textureY); // Box 314
        gunModel[273] = new ModelRendererTurbo(this, 993, 105, textureX, textureY); // Box 315
        gunModel[274] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 316
        gunModel[275] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 303
        gunModel[276] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 304
        gunModel[277] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 305
        gunModel[278] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 306
        gunModel[279] = new ModelRendererTurbo(this, 593, 121, textureX, textureY); // Box 307
        gunModel[280] = new ModelRendererTurbo(this, 633, 121, textureX, textureY); // Box 309
        gunModel[281] = new ModelRendererTurbo(this, 681, 121, textureX, textureY); // Box 310
        gunModel[282] = new ModelRendererTurbo(this, 721, 121, textureX, textureY); // Box 311
        gunModel[283] = new ModelRendererTurbo(this, 761, 121, textureX, textureY); // Box 312
        gunModel[284] = new ModelRendererTurbo(this, 801, 121, textureX, textureY); // Box 313
        gunModel[285] = new ModelRendererTurbo(this, 841, 121, textureX, textureY); // Box 317
        gunModel[286] = new ModelRendererTurbo(this, 881, 121, textureX, textureY); // Box 318
        gunModel[287] = new ModelRendererTurbo(this, 921, 121, textureX, textureY); // Box 319
        gunModel[288] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 323
        gunModel[289] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 327
        gunModel[290] = new ModelRendererTurbo(this, 617, 121, textureX, textureY); // Box 328
        gunModel[291] = new ModelRendererTurbo(this, 665, 121, textureX, textureY); // Box 329
        gunModel[292] = new ModelRendererTurbo(this, 945, 121, textureX, textureY); // Box 330
        gunModel[293] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 236
        gunModel[294] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Box 237
        gunModel[295] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 238
        gunModel[296] = new ModelRendererTurbo(this, 1009, 105, textureX, textureY); // Box 242
        gunModel[297] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 243
        gunModel[298] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 244
        gunModel[299] = new ModelRendererTurbo(this, 705, 121, textureX, textureY); // Box 356
        gunModel[300] = new ModelRendererTurbo(this, 721, 121, textureX, textureY); // Box 357
        gunModel[301] = new ModelRendererTurbo(this, 745, 121, textureX, textureY); // Box 358
        gunModel[302] = new ModelRendererTurbo(this, 761, 121, textureX, textureY); // Box 359
        gunModel[303] = new ModelRendererTurbo(this, 785, 121, textureX, textureY); // Box 360
        gunModel[304] = new ModelRendererTurbo(this, 801, 121, textureX, textureY); // Box 361
        gunModel[305] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 377
        gunModel[306] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Box 378
        gunModel[307] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 379
        gunModel[308] = new ModelRendererTurbo(this, 865, 137, textureX, textureY); // Box 380
        gunModel[309] = new ModelRendererTurbo(this, 905, 137, textureX, textureY); // Box 381
        gunModel[310] = new ModelRendererTurbo(this, 985, 137, textureX, textureY); // Box 382
        gunModel[311] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 383
        gunModel[312] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 384
        gunModel[313] = new ModelRendererTurbo(this, 593, 145, textureX, textureY); // Box 385
        gunModel[314] = new ModelRendererTurbo(this, 617, 145, textureX, textureY); // Box 386
        gunModel[315] = new ModelRendererTurbo(this, 641, 145, textureX, textureY); // Box 387
        gunModel[316] = new ModelRendererTurbo(this, 665, 145, textureX, textureY); // Box 388
        gunModel[317] = new ModelRendererTurbo(this, 689, 145, textureX, textureY); // Box 389
        gunModel[318] = new ModelRendererTurbo(this, 713, 145, textureX, textureY); // Box 390
        gunModel[319] = new ModelRendererTurbo(this, 737, 145, textureX, textureY); // Box 391
        gunModel[320] = new ModelRendererTurbo(this, 761, 145, textureX, textureY); // Box 392
        gunModel[321] = new ModelRendererTurbo(this, 785, 145, textureX, textureY); // Box 393
        gunModel[322] = new ModelRendererTurbo(this, 809, 145, textureX, textureY); // Box 394
        gunModel[323] = new ModelRendererTurbo(this, 833, 145, textureX, textureY); // Box 395
        gunModel[324] = new ModelRendererTurbo(this, 881, 145, textureX, textureY); // Box 396
        gunModel[325] = new ModelRendererTurbo(this, 921, 145, textureX, textureY); // Box 398
        gunModel[326] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 406
        gunModel[327] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 408
        gunModel[328] = new ModelRendererTurbo(this, 521, 153, textureX, textureY); // Box 439
        gunModel[329] = new ModelRendererTurbo(this, 729, 65, textureX, textureY); // Box 109
        gunModel[330] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 111
        gunModel[331] = new ModelRendererTurbo(this, 1002, 236, textureX, textureY); // Box 462
        gunModel[332] = new ModelRendererTurbo(this, 1002, 271, textureX, textureY); // Box 463
        gunModel[333] = new ModelRendererTurbo(this, 1002, 236, textureX, textureY); // Box 464
        gunModel[334] = new ModelRendererTurbo(this, 1002, 271, textureX, textureY); // Box 465
        gunModel[335] = new ModelRendererTurbo(this, 1002, 271, textureX, textureY); // Box 466
        gunModel[336] = new ModelRendererTurbo(this, 1002, 271, textureX, textureY); // Box 467
        gunModel[337] = new ModelRendererTurbo(this, 889, 17, textureX, textureY); // Box 260
        gunModel[338] = new ModelRendererTurbo(this, 729, 33, textureX, textureY); // Box 261
        gunModel[339] = new ModelRendererTurbo(this, 937, 33, textureX, textureY); // Box 262
        gunModel[340] = new ModelRendererTurbo(this, 889, 17, textureX, textureY); // Box 260
        gunModel[341] = new ModelRendererTurbo(this, 729, 33, textureX, textureY); // Box 261
        gunModel[342] = new ModelRendererTurbo(this, 937, 33, textureX, textureY); // Box 262
        gunModel[343] = new ModelRendererTurbo(this, 21, 285, textureX, textureY); // Box 386
        gunModel[344] = new ModelRendererTurbo(this, 29, 285, textureX, textureY); // Box 387
        gunModel[345] = new ModelRendererTurbo(this, 37, 285, textureX, textureY); // Box 388
        gunModel[346] = new ModelRendererTurbo(this, 45, 285, textureX, textureY); // Box 389
        gunModel[347] = new ModelRendererTurbo(this, 53, 285, textureX, textureY); // Box 390
        gunModel[348] = new ModelRendererTurbo(this, 61, 285, textureX, textureY); // Box 391
        gunModel[349] = new ModelRendererTurbo(this, 69, 285, textureX, textureY); // Box 392
        gunModel[350] = new ModelRendererTurbo(this, 77, 285, textureX, textureY); // Box 393
        gunModel[351] = new ModelRendererTurbo(this, 85, 285, textureX, textureY); // Box 394
        gunModel[352] = new ModelRendererTurbo(this, 93, 285, textureX, textureY); // Box 395
        gunModel[353] = new ModelRendererTurbo(this, 101, 285, textureX, textureY); // Box 396
        gunModel[354] = new ModelRendererTurbo(this, 109, 285, textureX, textureY); // Box 396
        gunModel[355] = new ModelRendererTurbo(this, 197, 285, textureX, textureY); // Box 396
        gunModel[356] = new ModelRendererTurbo(this, 285, 285, textureX, textureY); // Box 386
        gunModel[357] = new ModelRendererTurbo(this, 293, 285, textureX, textureY); // Box 387
        gunModel[358] = new ModelRendererTurbo(this, 301, 285, textureX, textureY); // Box 388
        gunModel[359] = new ModelRendererTurbo(this, 309, 285, textureX, textureY); // Box 389
        gunModel[360] = new ModelRendererTurbo(this, 317, 285, textureX, textureY); // Box 390
        gunModel[361] = new ModelRendererTurbo(this, 325, 285, textureX, textureY); // Box 391
        gunModel[362] = new ModelRendererTurbo(this, 333, 285, textureX, textureY); // Box 392
        gunModel[363] = new ModelRendererTurbo(this, 341, 285, textureX, textureY); // Box 393
        gunModel[364] = new ModelRendererTurbo(this, 349, 285, textureX, textureY); // Box 394
        gunModel[365] = new ModelRendererTurbo(this, 357, 285, textureX, textureY); // Box 395
        gunModel[366] = new ModelRendererTurbo(this, 365, 285, textureX, textureY); // Box 396
        gunModel[367] = new ModelRendererTurbo(this, 373, 285, textureX, textureY); // Box 396
        gunModel[368] = new ModelRendererTurbo(this, 461, 285, textureX, textureY); // Box 396
        gunModel[369] = new ModelRendererTurbo(this, 549, 285, textureX, textureY); // Box 386
        gunModel[370] = new ModelRendererTurbo(this, 573, 285, textureX, textureY); // Box 387
        gunModel[371] = new ModelRendererTurbo(this, 597, 285, textureX, textureY); // Box 388
        gunModel[372] = new ModelRendererTurbo(this, 621, 285, textureX, textureY); // Box 389
        gunModel[373] = new ModelRendererTurbo(this, 645, 285, textureX, textureY); // Box 390
        gunModel[374] = new ModelRendererTurbo(this, 669, 285, textureX, textureY); // Box 391
        gunModel[375] = new ModelRendererTurbo(this, 693, 285, textureX, textureY); // Box 392
        gunModel[376] = new ModelRendererTurbo(this, 717, 285, textureX, textureY); // Box 393
        gunModel[377] = new ModelRendererTurbo(this, 741, 285, textureX, textureY); // Box 394
        gunModel[378] = new ModelRendererTurbo(this, 765, 285, textureX, textureY); // Box 395
        gunModel[379] = new ModelRendererTurbo(this, 789, 285, textureX, textureY); // Box 396
        gunModel[380] = new ModelRendererTurbo(this, 813, 285, textureX, textureY); // Box 396
        gunModel[381] = new ModelRendererTurbo(this, 917, 285, textureX, textureY); // Box 396

        gunModel[0].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 1
        gunModel[0].setRotationPoint(-9F, -74F, -4F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 2
        gunModel[1].setRotationPoint(-1F, -74F, -4F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 3
        gunModel[2].setRotationPoint(3F, -74F, -4F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 4
        gunModel[3].setRotationPoint(11F, -74F, -4F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 5
        gunModel[4].setRotationPoint(7F, -74F, -4F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 6
        gunModel[5].setRotationPoint(27F, -74F, -4F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 7
        gunModel[6].setRotationPoint(23F, -74F, -4F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 8
        gunModel[7].setRotationPoint(19F, -74F, -4F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 9
        gunModel[8].setRotationPoint(15F, -74F, -4F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 10
        gunModel[9].setRotationPoint(59F, -74F, -4F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 11
        gunModel[10].setRotationPoint(55F, -74F, -4F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 12
        gunModel[11].setRotationPoint(51F, -74F, -4F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 13
        gunModel[12].setRotationPoint(47F, -74F, -4F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 14
        gunModel[13].setRotationPoint(43F, -74F, -4F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 15
        gunModel[14].setRotationPoint(39F, -74F, -4F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 16
        gunModel[15].setRotationPoint(35F, -74F, -4F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 17
        gunModel[16].setRotationPoint(31F, -74F, -4F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 26
        gunModel[17].setRotationPoint(90.5F, -74F, -4F);

        gunModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 27
        gunModel[18].setRotationPoint(87F, -74F, -4F);

        gunModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 28
        gunModel[19].setRotationPoint(83F, -74F, -4F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 29
        gunModel[20].setRotationPoint(79F, -74F, -4F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 30
        gunModel[21].setRotationPoint(75F, -74F, -4F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 31
        gunModel[22].setRotationPoint(71F, -74F, -4F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 32
        gunModel[23].setRotationPoint(67F, -74F, -4F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 33
        gunModel[24].setRotationPoint(63F, -74F, -4F);

        gunModel[25].addShapeBox(0F, 1F, 0F, 102, 1, 8, 0F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, 0F, 0F, -0.625F); // Box 34
        gunModel[25].setRotationPoint(-9F, -74F, -4F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 48, 2, 8, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F); // Box 35
        gunModel[26].setRotationPoint(-9F, -72F, -4F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 38, 2, 8, 0F, 0.5F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0.5F, 0F, -0.625F, 0.5F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0.5F, -0.5F, -0.625F); // Box 36
        gunModel[27].setRotationPoint(41F, -72F, -4F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.5F, -0.625F, -1F, -0.5F, -0.625F, -1F, -0.5F, -0.625F, 0F, -0.5F, -0.625F); // Box 37
        gunModel[28].setRotationPoint(39F, -72F, -4F);

        gunModel[29].addShapeBox(1F, 0F, 0F, 1, 1, 8, 0F, -0.5F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, -0.5F, 0F, -0.625F, -1F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -1F, -0.5F, -0.625F); // Box 38
        gunModel[29].setRotationPoint(38.5F, -72F, -4F);

        gunModel[30].addShapeBox(1F, 0.5F, 0F, 1, 1, 8, 0F, -1F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -1F, -0.5F, -0.625F, -0.5F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, -0.5F, 0F, -0.625F); // Box 39
        gunModel[30].setRotationPoint(38.5F, -72F, -4F);

        gunModel[31].addShapeBox(0F, 0.5F, 0F, 1, 1, 8, 0F, 0F, -0.5F, -0.625F, -1F, -0.5F, -0.625F, -1F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, 0F, 0F, -0.625F); // Box 40
        gunModel[31].setRotationPoint(39F, -72F, -4F);

        gunModel[32].addShapeBox(0F, 0.5F, 0F, 1, 1, 8, 0F, 0F, -0.5F, -0.625F, -1F, -0.5F, -0.625F, -1F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, 0F, 0F, -0.625F); // Box 41
        gunModel[32].setRotationPoint(79F, -72F, -4F);

        gunModel[33].addShapeBox(1F, 0.5F, 0F, 1, 1, 8, 0F, -1F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -1F, -0.5F, -0.625F, -0.5F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, -0.5F, 0F, -0.625F); // Box 42
        gunModel[33].setRotationPoint(78.5F, -72F, -4F);

        gunModel[34].addShapeBox(1F, 0F, 0F, 1, 1, 8, 0F, -0.5F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, -0.5F, 0F, -0.625F, -1F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -1F, -0.5F, -0.625F); // Box 43
        gunModel[34].setRotationPoint(78.5F, -72F, -4F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.5F, -0.625F, -1F, -0.5F, -0.625F, -1F, -0.5F, -0.625F, 0F, -0.5F, -0.625F); // Box 44
        gunModel[35].setRotationPoint(79F, -72F, -4F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 12, 2, 8, 0F, 0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, 0.5F, 0F, -0.625F, 0.5F, -0.5F, -0.625F, -0.5F, -0.5F, -0.625F, -0.5F, -0.5F, -0.625F, 0.5F, -0.5F, -0.625F); // Box 45
        gunModel[36].setRotationPoint(81F, -72F, -4F);

        gunModel[37].addShapeBox(0F, 0F, -3F, 60, 5, 14, 0F, 0F, 0.5F, -3.625F, 0F, 0.5F, -3.625F, 0F, 0.5F, -3.625F, 0F, 0.5F, -3.625F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F); // Box 46
        gunModel[37].setRotationPoint(-9F, -70F, -4F);

        gunModel[38].addShapeBox(0F, 0F, -3F, 60, 7, 14, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F); // Box 47
        gunModel[38].setRotationPoint(-9F, -65F, -4F);

        gunModel[39].addShapeBox(0F, 0F, -3F, 34, 7, 3, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F); // Box 265
        gunModel[39].setRotationPoint(51F, -65F, 7F);

        gunModel[40].addShapeBox(0F, 0F, -3F, 7, 7, 3, 0F, 0F, 0F, -0.375F, 0.5F, 0F, -0.375F, 0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0.5F, -7F, -0.375F, 0.5F, -7F, -0.375F, 0F, 0F, -0.375F); // Box 266
        gunModel[40].setRotationPoint(85F, -65F, 7F);

        gunModel[41].addShapeBox(0F, 0F, -3F, 41, 6, 3, 0F, 0F, -0.5F, 2.375F, 0.5F, -0.5F, 2.375F, 0.5F, -0.5F, -3.625F, 0F, -0.5F, -3.625F, 0F, 0F, -0.375F, 0.5F, 0F, -0.375F, 0.5F, 0F, -0.375F, 0F, 0F, -0.375F); // Box 267
        gunModel[41].setRotationPoint(51F, -71F, 7F);

        gunModel[42].addShapeBox(0F, 0F, -3F, 7, 7, 3, 0F, 0F, 0F, -0.375F, 0.5F, 0F, -0.375F, 0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0.5F, -7F, -0.375F, 0.5F, -7F, -0.375F, 0F, 0F, -0.375F); // Box 268
        gunModel[42].setRotationPoint(85F, -65F, -4F);

        gunModel[43].addShapeBox(0F, 0F, -3F, 9, 6, 3, 0F, 0.5F, -0.5F, -3.625F, -0.5F, -0.5F, -3.625F, -0.5F, -0.5F, 2.375F, 0.5F, -0.5F, 2.375F, 0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, 0.5F, 0F, -0.375F); // Box 269
        gunModel[43].setRotationPoint(84F, -71F, -4F);

        gunModel[44].addShapeBox(0F, 0F, -3F, 2, 7, 3, 0F, -0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F); // Box 270
        gunModel[44].setRotationPoint(83F, -65F, -4F);

        gunModel[45].addShapeBox(0F, 0F, -3F, 60, 4, 13, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Box 271
        gunModel[45].setRotationPoint(-9F, -58F, -3.5F);

        gunModel[46].addShapeBox(0F, 0F, -3F, 94, 2, 13, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 272
        gunModel[46].setRotationPoint(-9F, -54F, -3.5F);

        gunModel[47].addShapeBox(0F, 0F, -3F, 55, 10, 13, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -4.5F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -4.5F, -0.75F); // Box 273
        gunModel[47].setRotationPoint(-21F, -52F, -3.5F);

        gunModel[48].addShapeBox(0F, 0F, -3F, 55, 2, 13, 0F, 0F, 0F, -0.75F, 0F, -4.75F, -0.75F, 0F, -4.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.5F, 0F, 4.75F, -1.5F, 0F, 4.75F, -1.5F, 0F, 0F, -1.5F); // Box 274
        gunModel[48].setRotationPoint(-21F, -46.5F, -3.5F);

        gunModel[49].addShapeBox(0F, 0F, -3F, 5, 7, 13, 0F, 0F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0.25F, -0.75F, -1.5F, 0.25F, -0.75F, -1.5F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 275
        gunModel[49].setRotationPoint(34F, -49F, -3.5F);

        gunModel[50].addShapeBox(0F, 0F, -3F, 4, 2, 13, 0F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0.25F, -1.5F, -1.25F, 0.5F, -1.5F, -1.25F, 0.5F, -1.5F, 0F, 0.25F, -1.5F); // Box 276
        gunModel[50].setRotationPoint(34F, -42F, -3.5F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 12, 12, 13, 0F, 0F, -1.5F, -0.75F, 0F, 1F, -0.75F, 0F, 1F, -0.75F, 0F, -1.5F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 23
        gunModel[51].setRotationPoint(-21F, -63.5F, -6.5F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 12, 5, 9, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 1.25F, 0F); // Box 31
        gunModel[52].setRotationPoint(-21F, -70.5F, -4.5F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 12, 3, 13, 0F, 0F, -2.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, -2.25F, -1.75F, 0F, 1.5F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 1.5F, -0.75F); // Box 32
        gunModel[53].setRotationPoint(-21F, -66.5F, -6.5F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 260
        gunModel[54].setRotationPoint(-16F, -68.5F, -5F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F); // Box 261
        gunModel[55].setRotationPoint(-16F, -67.5F, -5F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 262
        gunModel[56].setRotationPoint(-16F, -69.5F, -5F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 11, 5, 2, 0F, -1.5F, 0.25F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, 0F, -1.5F, 0.25F, 0F, 0F, -0.875F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F, 0F, -0.875F, 0F); // Box 141
        gunModel[57].setRotationPoint(-20F, -69.75F, 1.5F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F, -1.75F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -1.75F, 0F, -0.25F, -0.5F, -0.5F, 1F, 0F, -1F, 1F, 0F, -1F, -1.5F, -0.5F, -0.5F, -1.5F); // Box 142
        gunModel[58].setRotationPoint(-19F, -72.5F, 3F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, -1F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -0.75F, -0.75F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F, -0.75F, -0.75F, 0F); // Box 143
        gunModel[59].setRotationPoint(-18F, -73.75F, 2.75F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 144
        gunModel[60].setRotationPoint(-17F, -76F, 2.75F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F, -2.5F, -0.25F, -0.5F, -2.5F, -0.25F, -0.5F, -2.5F, -0.25F, 0F, -2.5F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 145
        gunModel[61].setRotationPoint(-17F, -79.5F, 2.75F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 146
        gunModel[62].setRotationPoint(-12F, -74.25F, -3F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 11, 5, 2, 0F, -1.5F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.5F, -1.5F, 0.25F, -0.5F, 0F, -0.875F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.875F, -0.5F); // Box 308
        gunModel[63].setRotationPoint(-20F, -69.75F, -3.5F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F, -1.75F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -1.75F, 0F, -0.25F, -0.5F, -0.5F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, 1F, -0.5F, -0.5F, 1F); // Box 309
        gunModel[64].setRotationPoint(-19F, -72.5F, -5F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, -1F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -0.75F, -0.75F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F, -0.75F, -0.75F, 0F); // Box 310
        gunModel[65].setRotationPoint(-18F, -73.75F, -5.25F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 311
        gunModel[66].setRotationPoint(-17F, -76F, -5.25F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F, -2.5F, -0.25F, -0.5F, -2.5F, -0.25F, -0.5F, -2.5F, -0.25F, 0F, -2.5F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 312
        gunModel[67].setRotationPoint(-17F, -79.5F, -5.25F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F); // Box 313
        gunModel[68].setRotationPoint(177F, -77.25F, -0.5F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 314
        gunModel[69].setRotationPoint(-12F, -76.25F, -1F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 315
        gunModel[70].setRotationPoint(-12F, -75.25F, -1F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 317
        gunModel[71].setRotationPoint(-12F, -77.75F, 0.75F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 318
        gunModel[72].setRotationPoint(-12F, -77.75F, -1.75F);

        gunModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 319
        gunModel[73].setRotationPoint(-12F, -78.25F, -1F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -1F, -0.25F, 0F, -1F); // Box 320
        gunModel[74].setRotationPoint(-12F, -78.25F, 0F);

        gunModel[75].addShapeBox(0F, 2F, 0F, 2, 1, 2, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F); // Box 322
        gunModel[75].setRotationPoint(-12F, -78.25F, 0F);

        gunModel[76].addShapeBox(0F, 2F, -2F, 2, 1, 2, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 323
        gunModel[76].setRotationPoint(-12F, -78.25F, 0F);

        gunModel[77].addShapeBox(0F, 0F, -2F, 2, 1, 2, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 324
        gunModel[77].setRotationPoint(-12F, -78.25F, 0F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 2, 5, 14, 0F, 0F, 0F, 0.375F, -0.5F, 0F, 0.375F, -0.5F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, -0.5F, 0.375F, -0.5F, -0.5F, 0.375F, -0.5F, -0.5F, 0.375F, 0F, -0.5F, 0.375F); // Box 33
        gunModel[78].setRotationPoint(-9F, -62.25F, -7F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 2, 4, 14, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.375F, -0.5F, 0F, 0.375F, -0.5F, 0F, 0.375F, 0F, 0F, 0.375F); // Box 34
        gunModel[79].setRotationPoint(-9F, -66.25F, -7F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 2, 3, 13, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 35
        gunModel[80].setRotationPoint(-9F, -68.75F, -6.5F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 2, 4, 14, 0F, 0F, -0.5F, 0.375F, -0.5F, -0.5F, 0.375F, -0.5F, -0.5F, 0.375F, 0F, -0.5F, 0.375F, 0F, 0.25F, 0.125F, -0.5F, 0.25F, 0.125F, -0.5F, 0.25F, 0.125F, 0F, 0.25F, 0.125F); // Box 36
        gunModel[81].setRotationPoint(-9F, -58.25F, -7F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 5, 8, 2, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F); // Box 92
        gunModel[82].setRotationPoint(-14F, -66F, 5F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, -1.25F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -1.25F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 93
        gunModel[83].setRotationPoint(-14F, -68F, 5F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F); // Box 94
        gunModel[84].setRotationPoint(-14F, -58F, 5F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 95
        gunModel[85].setRotationPoint(-14F, -55F, 5F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 96
        gunModel[86].setRotationPoint(-14F, -52F, 5F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0.25F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 97
        gunModel[87].setRotationPoint(-14F, -49F, 5F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -1.5F, -0.5F, -0.25F, -1.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 98
        gunModel[88].setRotationPoint(-14F, -47.25F, 5F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F); // Box 99
        gunModel[89].setRotationPoint(-17F, -63.25F, 6.75F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.125F, -1.25F, 0F, -1.125F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.625F, 0F, -0.75F, 0.625F, 0F); // Box 100
        gunModel[90].setRotationPoint(-17F, -64.25F, 6.75F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.625F, 0F, -0.75F, 0.625F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.125F, -1.25F, 0F, -1.125F, -1.25F, 0F); // Box 101
        gunModel[91].setRotationPoint(-17F, -61.25F, 6.75F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -0.75F, 0F, -0.25F); // Box 102
        gunModel[92].setRotationPoint(-18.5F, -65F, 5F);

        gunModel[93].addShapeBox(0F, 0F, -3F, 8, 2, 11, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 340
        gunModel[93].setRotationPoint(36F, -49F, -2.5F);

        gunModel[94].addShapeBox(0F, 0F, -3F, 8, 2, 11, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 341
        gunModel[94].setRotationPoint(36F, -43F, -2.5F);

        gunModel[95].addShapeBox(0F, 0F, -3F, 8, 2, 11, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 342
        gunModel[95].setRotationPoint(36F, -46F, -2.5F);

        gunModel[96].addShapeBox(0F, 0F, -3F, 8, 2, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F); // Box 344
        gunModel[96].setRotationPoint(36F, -46F, 8.5F);

        gunModel[97].addShapeBox(0F, 0F, -3F, 8, 2, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -0.75F, 0F, -2.5F, -0.75F, 0F); // Box 345
        gunModel[97].setRotationPoint(36F, -43F, 8.5F);

        gunModel[98].addShapeBox(0F, 0F, -3F, 8, 2, 1, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.75F, -0.5F, 0F, -2.75F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F); // Box 346
        gunModel[98].setRotationPoint(36F, -49F, 8.5F);

        gunModel[99].addShapeBox(0F, 0F, -3F, 8, 2, 1, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, -0.75F, 0F, -2.5F, -0.75F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 347
        gunModel[99].setRotationPoint(36F, -43F, -3.5F);

        gunModel[100].addShapeBox(0F, 0F, -3F, 8, 2, 1, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 348
        gunModel[100].setRotationPoint(36F, -46F, -3.5F);

        gunModel[101].addShapeBox(0F, 0F, -3F, 8, 2, 1, 0F, -2.75F, -0.5F, 0F, -2.75F, -0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 349
        gunModel[101].setRotationPoint(36F, -49F, -3.5F);

        gunModel[102].addShapeBox(0F, 0F, -3F, 34, 4, 13, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Box 350
        gunModel[102].setRotationPoint(51F, -58F, -3.5F);

        gunModel[103].addShapeBox(0F, 0F, -3F, 3, 1, 13, 0F, 0F, 0.25F, -0.375F, 0F, 0.25F, -0.375F, 0F, 0.25F, -0.375F, 0F, 0.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F); // Box 351
        gunModel[103].setRotationPoint(30F, -54F, -3.5F);

        gunModel[104].addShapeBox(0F, 0F, -3F, 3, 1, 13, 0F, 0F, 0.25F, -0.375F, 0F, 0.25F, -0.375F, 0F, 0.25F, -0.375F, 0F, 0.25F, -0.375F, 0F, 0F, -0.375F, 0F, 2.5F, -0.375F, 0F, 2.5F, -0.375F, 0F, 0F, -0.375F); // Box 352
        gunModel[104].setRotationPoint(33F, -54F, -3.5F);

        gunModel[105].addShapeBox(0F, 0F, -3F, 12, 4, 13, 0F, 0F, 0.25F, -0.375F, 0F, 0.25F, -0.375F, 0F, 0.25F, -0.375F, 0F, 0.25F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 353
        gunModel[105].setRotationPoint(36F, -54F, -3.5F);

        gunModel[106].addShapeBox(0F, 0F, -3F, 47, 3, 12, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 354
        gunModel[106].setRotationPoint(34F, -51.5F, -2.5F);

        gunModel[107].addShapeBox(0F, 0F, -3F, 6, 2, 13, 0F, 0F, 0.5F, -0.375F, 0.5F, 0.5F, -0.375F, 0.5F, 0.5F, -0.375F, 0F, 0.5F, -0.375F, -0.5F, -0.75F, -0.375F, 0.5F, -0.75F, -0.375F, 0.5F, -0.75F, -0.375F, -0.5F, -0.75F, -0.375F); // Box 355
        gunModel[107].setRotationPoint(36F, -50F, -3.5F);

        gunModel[108].addShapeBox(0F, 0F, -3F, 5, 2, 13, 0F, 0.5F, 0.5F, -0.375F, 0F, 0.5F, -0.375F, 0F, 0.5F, -0.375F, 0.5F, 0.5F, -0.375F, 0.5F, -0.75F, -0.375F, -1.75F, -0.75F, -0.375F, -1.75F, -0.75F, -0.375F, 0.5F, -0.75F, -0.375F); // Box 356
        gunModel[108].setRotationPoint(43F, -50F, -3.5F);

        gunModel[109].addShapeBox(0F, 0F, -3F, 4, 1, 13, 0F, 0.25F, -0.25F, -0.375F, 0.25F, -0.25F, -0.375F, 0.25F, -0.25F, -0.375F, 0.25F, -0.25F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F); // Box 357
        gunModel[109].setRotationPoint(42F, -49F, -3.5F);

        gunModel[110].addShapeBox(0F, 0F, -3F, 2, 1, 13, 0F, 0.5F, -0.25F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, -0.25F, -0.375F, 0.5F, -0.25F, -0.375F, 0.25F, 0F, -0.375F, -1.25F, 0F, -0.375F, -1.25F, 0F, -0.375F, 0.25F, 0F, -0.375F); // Box 358
        gunModel[110].setRotationPoint(37F, -49F, -3.5F);

        gunModel[111].addShapeBox(0F, 0F, -3F, 3, 4, 13, 0F, 0F, 0.25F, -0.375F, 0F, 0.25F, -0.375F, 0F, 0.25F, -0.375F, 0F, 0.25F, -0.375F, 0F, -0.5F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, -0.5F, -0.375F); // Box 359
        gunModel[111].setRotationPoint(48F, -54F, -3.5F);

        gunModel[112].addShapeBox(0F, 0F, -3F, 34, 3, 13, 0F, 0F, 0.25F, -0.375F, 0F, 0.25F, -0.375F, 0F, 0.25F, -0.375F, 0F, 0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F); // Box 360
        gunModel[112].setRotationPoint(51F, -54F, -3.5F);

        gunModel[113].addShapeBox(0F, 0F, -3F, 47, 3, 1, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 361
        gunModel[113].setRotationPoint(34F, -51.5F, -2.5F);

        gunModel[114].addShapeBox(0F, 0F, -3F, 4, 2, 11, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 362
        gunModel[114].setRotationPoint(81F, -51.5F, -2.5F);

        gunModel[115].addShapeBox(0F, 0F, -3F, 4, 4, 11, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -2.5F, 0.25F, 0.25F, -2.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 363
        gunModel[115].setRotationPoint(81F, -49.5F, -2.5F);

        gunModel[116].addShapeBox(0F, 0F, -3F, 27, 3, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 364
        gunModel[116].setRotationPoint(54F, -48.5F, 7.5F);

        gunModel[117].addShapeBox(0F, 0F, -3F, 4, 3, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 365
        gunModel[117].setRotationPoint(50F, -48.5F, 7.5F);

        gunModel[118].addShapeBox(0F, 0F, -3F, 9, 3, 10, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 366
        gunModel[118].setRotationPoint(41F, -48.5F, -1.5F);

        gunModel[119].addShapeBox(0F, 0F, -3F, 7, 4, 10, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 367
        gunModel[119].setRotationPoint(41F, -45F, -1.5F);

        gunModel[120].addShapeBox(0F, 0F, -3F, 7, 3, 1, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F); // Box 368
        gunModel[120].setRotationPoint(41F, -48.5F, -2.5F);

        gunModel[121].addShapeBox(0F, 0F, -3F, 7, 4, 1, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 369
        gunModel[121].setRotationPoint(41F, -45F, -2.5F);

        gunModel[122].addShapeBox(0F, 0F, -3F, 7, 6, 10, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, -1F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -1.25F, -1F, 0.25F, -1.25F); // Box 370
        gunModel[122].setRotationPoint(41F, -41F, -1.5F);

        gunModel[123].addShapeBox(0F, 0F, -3F, 7, 6, 1, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, -1F, 0.25F, -0.25F); // Box 371
        gunModel[123].setRotationPoint(41F, -41F, -2.5F);

        gunModel[124].addShapeBox(0F, 0F, -3F, 2, 2, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -2F, 0.25F, 0.25F, -2F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 372
        gunModel[124].setRotationPoint(48F, -43F, 7.5F);

        gunModel[125].addShapeBox(0F, 0F, -3F, 6, 2, 1, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 373
        gunModel[125].setRotationPoint(48F, -45F, 7.5F);

        gunModel[126].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 374
        gunModel[126].setRotationPoint(48F, -36F, -2.5F);

        gunModel[127].addShapeBox(0F, 0F, -3F, 27, 1, 1, 0F, 0F, -0.25F, 0.25F, 0F, 6.75F, 0.25F, 0F, 6.75F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0.25F, 0.25F, 0F, -6.75F, 0.25F, 0F, -6.75F, -0.75F, 0F, 0.25F, -0.75F); // Box 375
        gunModel[127].setRotationPoint(50F, -36F, -2.5F);

        gunModel[128].addShapeBox(0F, 0F, -3F, 4, 7, 1, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.75F, 0F, 0.25F, -0.75F); // Box 376
        gunModel[128].setRotationPoint(77F, -49F, -2.5F);

        gunModel[129].addShapeBox(0F, 0F, -3F, 2, 2, 1, 0F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, -2F, 0.25F, 0.25F, -1.75F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 377
        gunModel[129].setRotationPoint(81F, -45F, -2.5F);

        gunModel[130].addShapeBox(0F, 0F, -3F, 2, 3, 1, 0F, 0F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0.25F, 0.5F, -3.25F, 0.25F, 0.5F, -3.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 378
        gunModel[130].setRotationPoint(48F, -48.5F, -2.5F);

        gunModel[131].addShapeBox(0F, 0F, -3F, 2, 3, 1, 0F, 0F, 0.25F, 0.25F, 0F, -2.75F, 0.25F, 0F, -2.75F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 379
        gunModel[131].setRotationPoint(48F, -38.5F, -2.5F);

        gunModel[132].addShapeBox(0F, 0F, -3F, 2, 2, 1, 0F, 0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, -2.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0.5F, -2.25F, -0.25F); // Box 380
        gunModel[132].setRotationPoint(75F, -48.5F, -2.5F);

        gunModel[133].addShapeBox(0F, 0F, -3F, 2, 14, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 382
        gunModel[133].setRotationPoint(48F, -49F, -2F);

        gunModel[134].addShapeBox(0F, 0F, -3F, 2, 1, 9, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
        gunModel[134].setRotationPoint(48F, -45F, -1.75F);

        gunModel[135].addShapeBox(0F, 0F, -3F, 27, 14, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0.25F, 0F, -6.75F, 0.25F, 0F, -6.75F, -0.75F, 0F, 0.25F, -0.75F); // Box 384
        gunModel[135].setRotationPoint(50F, -49F, -2F);

        gunModel[136].addShapeBox(0F, 0F, -3F, 4, 7, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.75F, 0F, 0.25F, -0.75F); // Box 385
        gunModel[136].setRotationPoint(77F, -49F, -2F);

        gunModel[137].addShapeBox(-1F, -2F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 348
        gunModel[137].setRotationPoint(1.25F, -61.25F, 6.25F);
        gunModel[137].rotateAngleZ = 1.25663706F;

        gunModel[138].addShapeBox(1F, -2F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 349
        gunModel[138].setRotationPoint(1.25F, -61.25F, 6.25F);
        gunModel[138].rotateAngleZ = 1.25663706F;

        gunModel[139].addShapeBox(-2F, -2F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 350
        gunModel[139].setRotationPoint(1.25F, -61.25F, 6.25F);
        gunModel[139].rotateAngleZ = 1.25663706F;

        gunModel[140].addShapeBox(-1F, -2F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, 0F, 0F, 0F); // Box 389
        gunModel[140].setRotationPoint(1.25F, -61.25F, 6.25F);
        gunModel[140].rotateAngleZ = 1.25663706F;

        gunModel[141].addShapeBox(0F, -2F, 0F, 1, 4, 1, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F); // Box 390
        gunModel[141].setRotationPoint(1.25F, -61.25F, 6.25F);
        gunModel[141].rotateAngleZ = 1.25663706F;

        gunModel[142].addShapeBox(1F, -2F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 392
        gunModel[142].setRotationPoint(33.75F, -61.25F, 6.25F);
        gunModel[142].rotateAngleZ = 0.80285146F;

        gunModel[143].addShapeBox(0F, -2F, 0F, 1, 4, 1, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F); // Box 393
        gunModel[143].setRotationPoint(33.75F, -61.25F, 6.25F);
        gunModel[143].rotateAngleZ = 0.80285146F;

        gunModel[144].addShapeBox(-1F, -2F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 394
        gunModel[144].setRotationPoint(33.75F, -61.25F, 6.25F);
        gunModel[144].rotateAngleZ = 0.80285146F;

        gunModel[145].addShapeBox(-1F, -2F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, 0F, 0F, 0F); // Box 395
        gunModel[145].setRotationPoint(33.75F, -61.25F, 6.25F);
        gunModel[145].rotateAngleZ = 0.80285146F;

        gunModel[146].addShapeBox(-2F, -2F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 396
        gunModel[146].setRotationPoint(33.75F, -61.25F, 6.25F);
        gunModel[146].rotateAngleZ = 0.80285146F;

        gunModel[147].addShapeBox(1F, -2F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 397
        gunModel[147].setRotationPoint(42F, -61.25F, 6.25F);
        gunModel[147].rotateAngleZ = 2.25147474F;

        gunModel[148].addShapeBox(0F, -2F, 0F, 1, 4, 1, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F); // Box 398
        gunModel[148].setRotationPoint(42F, -61.25F, 6.25F);
        gunModel[148].rotateAngleZ = 2.25147474F;

        gunModel[149].addShapeBox(-1F, -2F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 399
        gunModel[149].setRotationPoint(42F, -61.25F, 6.25F);
        gunModel[149].rotateAngleZ = 2.25147474F;

        gunModel[150].addShapeBox(-1F, -2F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, 0F, 0F, 0F); // Box 400
        gunModel[150].setRotationPoint(42F, -61.25F, 6.25F);
        gunModel[150].rotateAngleZ = 2.25147474F;

        gunModel[151].addShapeBox(-2F, -2F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 401
        gunModel[151].setRotationPoint(42F, -61.25F, 6.25F);
        gunModel[151].rotateAngleZ = 2.25147474F;

        gunModel[152].addShapeBox(1F, -2F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 402
        gunModel[152].setRotationPoint(62F, -61.25F, 6.25F);
        gunModel[152].rotateAngleZ = 1.74532925F;

        gunModel[153].addShapeBox(0F, -2F, 0F, 1, 4, 1, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F); // Box 403
        gunModel[153].setRotationPoint(62F, -61.25F, 6.25F);
        gunModel[153].rotateAngleZ = 1.74532925F;

        gunModel[154].addShapeBox(-1F, -2F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 404
        gunModel[154].setRotationPoint(62F, -61.25F, 6.25F);
        gunModel[154].rotateAngleZ = 1.74532925F;

        gunModel[155].addShapeBox(-1F, -2F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, 0F, 0F, 0F); // Box 405
        gunModel[155].setRotationPoint(62F, -61.25F, 6.25F);
        gunModel[155].rotateAngleZ = 1.74532925F;

        gunModel[156].addShapeBox(-2F, -2F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 406
        gunModel[156].setRotationPoint(62F, -61.25F, 6.25F);
        gunModel[156].rotateAngleZ = 1.74532925F;

        gunModel[157].addShapeBox(1F, -2F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 407
        gunModel[157].setRotationPoint(70.5F, -61.25F, 6.25F);
        gunModel[157].rotateAngleZ = 1.44862328F;

        gunModel[158].addShapeBox(0F, -2F, 0F, 1, 4, 1, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F); // Box 408
        gunModel[158].setRotationPoint(70.5F, -61.25F, 6.25F);
        gunModel[158].rotateAngleZ = 1.44862328F;

        gunModel[159].addShapeBox(-1F, -2F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 409
        gunModel[159].setRotationPoint(70.5F, -61.25F, 6.25F);
        gunModel[159].rotateAngleZ = 1.44862328F;

        gunModel[160].addShapeBox(-1F, -2F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, 0F, 0F, 0F); // Box 410
        gunModel[160].setRotationPoint(70.5F, -61.25F, 6.25F);
        gunModel[160].rotateAngleZ = 1.44862328F;

        gunModel[161].addShapeBox(-2F, -2F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 411
        gunModel[161].setRotationPoint(70.5F, -61.25F, 6.25F);
        gunModel[161].rotateAngleZ = 1.44862328F;

        gunModel[162].addShapeBox(0F, -2F, 0F, 1, 4, 1, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F); // Box 412
        gunModel[162].setRotationPoint(9.5F, -61.25F, 6.25F);
        gunModel[162].rotateAngleZ = 2.02458193F;

        gunModel[163].addShapeBox(-1F, -2F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 413
        gunModel[163].setRotationPoint(9.5F, -61.25F, 6.25F);
        gunModel[163].rotateAngleZ = 2.02458193F;

        gunModel[164].addShapeBox(-1F, -2F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, 0F, 0F, 0F); // Box 414
        gunModel[164].setRotationPoint(9.5F, -61.25F, 6.25F);
        gunModel[164].rotateAngleZ = 2.02458193F;

        gunModel[165].addShapeBox(-2F, -2F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 415
        gunModel[165].setRotationPoint(9.5F, -61.25F, 6.25F);
        gunModel[165].rotateAngleZ = 2.02458193F;

        gunModel[166].addShapeBox(1F, -2F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 416
        gunModel[166].setRotationPoint(9.5F, -61.25F, 6.25F);
        gunModel[166].rotateAngleZ = 2.02458193F;

        gunModel[167].addShapeBox(-3F, -1F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 547
        gunModel[167].setRotationPoint(13F, -44.25F, 5F);
        gunModel[167].rotateAngleZ = 0.05235988F;

        gunModel[168].addShapeBox(-3F, 1F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 548
        gunModel[168].setRotationPoint(13F, -44.25F, 5F);
        gunModel[168].rotateAngleZ = 0.05235988F;

        gunModel[169].addShapeBox(-3F, -3F, 0F, 6, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
        gunModel[169].setRotationPoint(13F, -44.25F, 5F);
        gunModel[169].rotateAngleZ = 0.05235988F;

        gunModel[170].addShapeBox(-8F, -1.5F, 0F, 6, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
        gunModel[170].setRotationPoint(13F, -44.25F, 5F);
        gunModel[170].rotateAngleZ = 0.05235988F;

        gunModel[171].addShapeBox(-7F, -1.5F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 422
        gunModel[171].setRotationPoint(13F, -44.25F, 5F);
        gunModel[171].rotateAngleZ = 0.05235988F;

        gunModel[172].addShapeBox(-8F, -1.5F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
        gunModel[172].setRotationPoint(13F, -44.25F, 5F);
        gunModel[172].rotateAngleZ = 0.05235988F;

        gunModel[173].addShapeBox(-9F, -1.5F, 0F, 1, 3, 4, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 424
        gunModel[173].setRotationPoint(13F, -44.25F, 5F);
        gunModel[173].rotateAngleZ = 0.05235988F;

        gunModel[174].addShapeBox(0F, -1F, 0F, 1, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 50
        gunModel[174].setRotationPoint(19F, -40F, -1F);

        gunModel[175].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, -1.5F, 0F, 0F); // Box 51
        gunModel[175].setRotationPoint(19F, -34F, -1F);

        gunModel[176].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0.25F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0.75F, 0F, 1.25F, -1.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 1.25F, -1.25F, 0F); // Box 52
        gunModel[176].setRotationPoint(21.75F, -28.75F, -1F);

        gunModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -1F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0.5F, 0F, 0.75F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, -0.75F, 0F); // Box 53
        gunModel[177].setRotationPoint(32.5F, -29.5F, -1F);

        gunModel[178].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -0.5F, 0F); // Box 54
        gunModel[178].setRotationPoint(34.5F, -35.5F, -1F);

        gunModel[179].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, 0F, -2F, 0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0.5F, 0F); // Box 55
        gunModel[179].setRotationPoint(32.5F, -40.5F, -1F);

        gunModel[180].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -0.5F, 0F, 0F); // Box 431
        gunModel[180].setRotationPoint(26.75F, -28.25F, -1F);

        gunModel[181].addShapeBox(-1F, -2F, 0F, 2, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
        gunModel[181].setRotationPoint(1.25F, -61.25F, -7.25F);
        gunModel[181].rotateAngleZ = 1.25663706F;

        gunModel[182].addShapeBox(1F, -2F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 433
        gunModel[182].setRotationPoint(1.25F, -61.25F, -7.25F);
        gunModel[182].rotateAngleZ = 1.25663706F;

        gunModel[183].addShapeBox(-2F, -2F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 434
        gunModel[183].setRotationPoint(1.25F, -61.25F, -7.25F);
        gunModel[183].rotateAngleZ = 1.25663706F;

        gunModel[184].addShapeBox(-1F, -2F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 435
        gunModel[184].setRotationPoint(1.25F, -61.25F, -7.25F);
        gunModel[184].rotateAngleZ = 1.25663706F;

        gunModel[185].addShapeBox(0F, -2F, 0F, 1, 4, 1, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, 0F, -0.5F); // Box 436
        gunModel[185].setRotationPoint(1.25F, -61.25F, -7.25F);
        gunModel[185].rotateAngleZ = 1.25663706F;

        gunModel[186].addShapeBox(-1F, -2F, 0F, 2, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
        gunModel[186].setRotationPoint(9.5F, -61.25F, -7.25F);
        gunModel[186].rotateAngleZ = 2.02458193F;

        gunModel[187].addShapeBox(-2F, -2F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 438
        gunModel[187].setRotationPoint(9.5F, -61.25F, -7.25F);
        gunModel[187].rotateAngleZ = 2.02458193F;

        gunModel[188].addShapeBox(1F, -2F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 439
        gunModel[188].setRotationPoint(9.5F, -61.25F, -7.25F);
        gunModel[188].rotateAngleZ = 2.02458193F;

        gunModel[189].addShapeBox(0F, -2F, 0F, 1, 4, 1, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, 0F, -0.5F); // Box 440
        gunModel[189].setRotationPoint(9.5F, -61.25F, -7.25F);
        gunModel[189].rotateAngleZ = 2.02458193F;

        gunModel[190].addShapeBox(-1F, -2F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 441
        gunModel[190].setRotationPoint(9.5F, -61.25F, -7.25F);
        gunModel[190].rotateAngleZ = 2.02458193F;

        gunModel[191].addShapeBox(-1F, -2F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 442
        gunModel[191].setRotationPoint(33.75F, -61.25F, -7.25F);
        gunModel[191].rotateAngleZ = 0.80285146F;

        gunModel[192].addShapeBox(0F, -2F, 0F, 1, 4, 1, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, 0F, -0.5F); // Box 443
        gunModel[192].setRotationPoint(33.75F, -61.25F, -7.25F);
        gunModel[192].rotateAngleZ = 0.80285146F;

        gunModel[193].addShapeBox(1F, -2F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 444
        gunModel[193].setRotationPoint(33.75F, -61.25F, -7.25F);
        gunModel[193].rotateAngleZ = 0.80285146F;

        gunModel[194].addShapeBox(-2F, -2F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 445
        gunModel[194].setRotationPoint(33.75F, -61.25F, -7.25F);
        gunModel[194].rotateAngleZ = 0.80285146F;

        gunModel[195].addShapeBox(-1F, -2F, 0F, 2, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
        gunModel[195].setRotationPoint(33.75F, -61.25F, -7.25F);
        gunModel[195].rotateAngleZ = 0.80285146F;

        gunModel[196].addShapeBox(-2F, -2F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 447
        gunModel[196].setRotationPoint(42F, -61.25F, -7.25F);
        gunModel[196].rotateAngleZ = 2.25147474F;

        gunModel[197].addShapeBox(-1F, -2F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 448
        gunModel[197].setRotationPoint(42F, -61.25F, -7.25F);
        gunModel[197].rotateAngleZ = 2.25147474F;

        gunModel[198].addShapeBox(1F, -2F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 449
        gunModel[198].setRotationPoint(42F, -61.25F, -7.25F);
        gunModel[198].rotateAngleZ = 2.25147474F;

        gunModel[199].addShapeBox(0F, -2F, 0F, 1, 4, 1, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, 0F, -0.5F); // Box 450
        gunModel[199].setRotationPoint(42F, -61.25F, -7.25F);
        gunModel[199].rotateAngleZ = 2.25147474F;

        gunModel[200].addShapeBox(-1F, -2F, 0F, 2, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
        gunModel[200].setRotationPoint(42F, -61.25F, -7.25F);
        gunModel[200].rotateAngleZ = 2.25147474F;

        gunModel[201].addShapeBox(0F, -1F, 0F, 1, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
        gunModel[201].setRotationPoint(18F, -40F, -1F);

        gunModel[202].addShapeBox(-1F, -1F, -3F, 6, 1, 12, 0F, 3.5F, 1.375F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 3.5F, 1.375F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F); // Box 37
        gunModel[202].setRotationPoint(-1F, -41.5F, -3F);

        gunModel[203].addShapeBox(-1F, -1F, -3F, 5, 2, 12, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, 0F, 0F); // Box 38
        gunModel[203].setRotationPoint(0F, -40.5F, -3F);

        gunModel[204].addShapeBox(-1F, 0F, -3F, 3, 1, 12, 0F, 2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 2F, 0F, 0F, 1.35F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.35F, 0F, 0F); // Box 39
        gunModel[204].setRotationPoint(2.5F, -39.5F, -3F);

        gunModel[205].addShapeBox(-1F, -1F, -3F, 4, 2, 12, 0F, 1.35F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.35F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 40
        gunModel[205].setRotationPoint(2.5F, -37.5F, -3F);

        gunModel[206].addShapeBox(0F, 0F, 0F, 13, 7, 10, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
        gunModel[206].setRotationPoint(2.5F, -43.5F, -5F);

        gunModel[207].addShapeBox(0F, 0F, 0F, 3, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 44
        gunModel[207].setRotationPoint(15.5F, -41.5F, -6F);

        gunModel[208].addShapeBox(0F, 0F, -3F, 2, 3, 12, 0F, 2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 47
        gunModel[208].setRotationPoint(-0.5F, -39.5F, -3F);

        gunModel[209].addShapeBox(0F, 0F, -3F, 2, 4, 12, 0F, 2F, 0.375F, -2F, -2F, 0.375F, 0F, -2F, 0.375F, 0F, 2F, 0.375F, -2F, -3F, 0F, -2F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, -2F); // Box 48
        gunModel[209].setRotationPoint(-5.5F, -43.5F, -3F);

        gunModel[210].addShapeBox(0F, 0F, -3F, 2, 30, 12, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 19F, -1F, -2F, -19F, 0F, 0F, -19F, 0F, 0F, 19F, -1F, -2F); // Box 466
        gunModel[210].setRotationPoint(-0.5F, -36.5F, -3F);

        gunModel[211].addShapeBox(0F, 0F, -3F, 14, 30, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 19F, 0F, 0F, -17F, 6F, 0F, -17F, 6F, 0F, 19F, 0F, 0F); // Box 467
        gunModel[211].setRotationPoint(1.5F, -36.5F, -3F);

        gunModel[212].addShapeBox(0F, 0F, -3F, 3, 30, 12, 0F, -19F, 0F, 0F, 19F, 0F, -2F, 19F, 0F, -2F, -19F, 0F, 0F, -2F, 6F, 0F, 3F, 7F, -2F, 3F, 7F, -2F, -2F, 6F, 0F); // Box 468
        gunModel[212].setRotationPoint(-3.5F, -36.5F, -3F);

        gunModel[213].addShapeBox(0F, 0.5F, 0.4F, 32, 1, 1, 0F, 0F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 473
        gunModel[213].setRotationPoint(51F, -70.5F, -3.4F);
        gunModel[213].rotateAngleX = -0.52359878F;

        gunModel[214].addShapeBox(0F, 1.5F, 0.4F, 2, 2, 1, 0F, 0F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0.5F, -2F, 0.4F, 0.5F, -2F, 0F, 0F, 0F, 0F); // Box 218
        gunModel[214].setRotationPoint(51F, -70.5F, -3.4F);
        gunModel[214].rotateAngleX = -0.52359878F;

        gunModel[215].addShapeBox(0F, 1.5F, 0.4F, 2, 2, 1, 0F, 0.5F, 0F, 0.4F, 0.0F, 0F, 0.4F, 0.0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0.4F, 0.0F, 0F, 0.4F, 0.0F, 0F, 0F, 0.5F, -2F, 0F); // Box 219
        gunModel[215].setRotationPoint(81.5F, -70.5F, -3.4F);
        gunModel[215].rotateAngleX = -0.52359878F;

        gunModel[216].addShapeBox(0F, 0F, 0F, 59, 2, 2, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 105
        gunModel[216].setRotationPoint(33F, -58.5F, 6F);

        gunModel[217].addShapeBox(0F, 0F, 0F, 59, 2, 2, 0F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 221
        gunModel[217].setRotationPoint(33F, -54.5F, 6F);

        gunModel[218].addShapeBox(0F, 1.5F, -0.5F, 59, 3, 2, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 222
        gunModel[218].setRotationPoint(33F, -58.5F, 6F);

        gunModel[219].addShapeBox(0F, 0F, 0F, 9, 3, 12, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 162
        gunModel[219].setRotationPoint(84.25F, -56F, -6F);

        gunModel[220].addShapeBox(0F, 0F, 0F, 9, 3, 10, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.5F, -3.25F, 0F, -0.5F, -3.25F, 0F, -0.5F, -3.25F, 0F, -0.5F, -3.25F); // Box 165
        gunModel[220].setRotationPoint(84.25F, -51F, -5F);

        gunModel[221].addShapeBox(0F, 0F, 0F, 9, 3, 12, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F); // Box 166
        gunModel[221].setRotationPoint(84.25F, -53F, -6F);

        gunModel[222].addShapeBox(0F, 0F, 0F, 9, 3, 12, 0F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 232
        gunModel[222].setRotationPoint(84.25F, -59F, -6F);

        gunModel[223].addShapeBox(0F, -4F, 0F, 9, 3, 10, 0F, 0F, -0.5F, -3.25F, 0F, -0.5F, -3.25F, 0F, -0.5F, -3.25F, 0F, -0.5F, -3.25F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 233
        gunModel[223].setRotationPoint(84.25F, -57F, -5F);

        gunModel[224].addShapeBox(0F, 0F, 0F, 86, 3, 10, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 234
        gunModel[224].setRotationPoint(84F, -61F, -5F);

        gunModel[225].addShapeBox(0F, 0F, 0F, 86, 3, 10, 0F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 235
        gunModel[225].setRotationPoint(84F, -64F, -5F);

        gunModel[226].addShapeBox(0F, -4F, 0F, 86, 3, 8, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F, -2.75F, 0F, -0.5F, -2.75F, 0F, -0.5F, -2.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 236
        gunModel[226].setRotationPoint(84F, -62F, -4F);

        gunModel[227].addShapeBox(0F, 0F, 0F, 77, 11, 1, 0F, 0F, 0.25F, 0.4F, 0F, 0.25F, 0.4F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.25F, 0.4F, 0F, 1.25F, 0.4F, 0F, 1.25F, 0F, 0F, 1.25F, 0F); // Box 252
        gunModel[227].setRotationPoint(93.25F, -66F, -6F);

        gunModel[228].addShapeBox(0F, 0F, 0F, 90, 3, 12, 0F, 0F, -0.25F, 0.4F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, 0.5F, -1.8F, -0.25F, 0.5F, -1.8F, -0.25F, 0.5F, -1.8F, 0F, 0.5F, -1.8F); // Box 253
        gunModel[228].setRotationPoint(93.25F, -54F, -6F);

        gunModel[229].addShapeBox(0F, 0F, 0F, 77, 11, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.4F, 0F, 0.25F, 0.4F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0.4F, 0F, 1.25F, 0.4F); // Box 254
        gunModel[229].setRotationPoint(93.25F, -66F, 5F);

        gunModel[230].addShapeBox(0F, 0F, 0F, 20, 4, 1, 0F, 0F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, 0.25F, -2.6F, 0F, 0.25F, -2.6F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F); // Box 255
        gunModel[230].setRotationPoint(93.25F, -70F, 5F);

        gunModel[231].addShapeBox(0F, 0F, 0F, 20, 4, 1, 0F, 0F, 0.25F, -2.6F, 0F, 0.25F, -2.6F, 0F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 256
        gunModel[231].setRotationPoint(93.25F, -70F, -6F);

        gunModel[232].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F, 0F, 0.25F, 2F, 0.25F, 0.25F, 2F, 0.25F, 0.25F, -2.6F, 0F, 0.25F, -2.6F, 0F, -0.25F, -1F, 0.25F, -0.25F, -1F, 0.25F, -0.25F, 0.4F, 0F, -0.25F, 0.4F); // Box 257
        gunModel[232].setRotationPoint(124.25F, -70F, 5F);

        gunModel[233].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F, 0.25F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, 0.25F, -2.6F, 0.25F, 0.25F, -2.6F, 0.25F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.4F, 0.25F, -0.25F, 0.4F); // Box 260
        gunModel[233].setRotationPoint(140.75F, -70F, 5F);

        gunModel[234].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F, 0.25F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, 0.25F, -2.6F, 0.25F, 0.25F, -2.6F, 0.25F, -0.25F, -1F, 1F, -0.25F, -1F, 1F, -0.25F, 0.4F, 0.25F, -0.25F, 0.4F); // Box 262
        gunModel[234].setRotationPoint(157F, -70F, 5F);

        gunModel[235].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F); // Box 263
        gunModel[235].setRotationPoint(93.25F, -72F, -3F);

        gunModel[236].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F, 0.25F, 0.25F, -2.6F, 0F, 0.25F, -2.6F, 0F, 0.25F, 2F, 0.25F, 0.25F, 2F, 0.25F, -0.25F, 0.4F, 1F, -0.25F, 0.4F, 1F, -0.25F, -1F, 0.25F, -0.25F, -1F); // Box 264
        gunModel[236].setRotationPoint(157F, -70F, -6F);

        gunModel[237].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F, 0.25F, 0.25F, -2.6F, 0F, 0.25F, -2.6F, 0F, 0.25F, 2F, 0.25F, 0.25F, 2F, 0.25F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, -1F, 0.25F, -0.25F, -1F); // Box 265
        gunModel[237].setRotationPoint(140.75F, -70F, -6F);

        gunModel[238].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F, 0F, 0.25F, -2.6F, 0.25F, 0.25F, -2.6F, 0.25F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, -0.25F, 0.4F, 0.25F, -0.25F, 0.4F, 0.25F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 266
        gunModel[238].setRotationPoint(124.25F, -70F, -6F);

        gunModel[239].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, -0.25F, 0.4F, 0.25F, -0.25F, 0.4F, 0.25F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0.25F, -0.25F, 0.4F, 0.25F, -0.25F, 0.4F, 0F, -0.25F, 0.4F); // Box 267
        gunModel[239].setRotationPoint(124.25F, -72F, -3F);

        gunModel[240].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0.25F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0.25F, -0.25F, 0.4F, 0.25F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0.25F, -0.25F, 0.4F); // Box 268
        gunModel[240].setRotationPoint(140.75F, -72F, -3F);

        gunModel[241].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0.25F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0.25F, -0.25F, 0.4F, 0.25F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0.25F, -0.25F, 0.4F); // Box 269
        gunModel[241].setRotationPoint(157F, -72F, -3F);

        gunModel[242].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -1.5F, 0.4F, 0F, -1.5F, 0.4F, 0F, -0.25F, 0.4F); // Box 270
        gunModel[242].setRotationPoint(113.25F, -72F, -3F);

        gunModel[243].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -1.5F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -1.5F, 0.4F); // Box 271
        gunModel[243].setRotationPoint(122.25F, -72F, -3F);

        gunModel[244].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -1.5F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -1.5F, 0.4F); // Box 272
        gunModel[244].setRotationPoint(138.5F, -72F, -3F);

        gunModel[245].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -1.5F, 0.4F, 0F, -1.5F, 0.4F, 0F, -0.25F, 0.4F); // Box 273
        gunModel[245].setRotationPoint(129.5F, -72F, -3F);

        gunModel[246].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -1.5F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -1.5F, 0.4F); // Box 274
        gunModel[246].setRotationPoint(154.75F, -72F, -3F);

        gunModel[247].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -1.5F, 0.4F, 0F, -1.5F, 0.4F, 0F, -0.25F, 0.4F); // Box 275
        gunModel[247].setRotationPoint(145.75F, -72F, -3F);

        gunModel[248].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F); // Box 276
        gunModel[248].setRotationPoint(115.25F, -72F, -3F);

        gunModel[249].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F); // Box 277
        gunModel[249].setRotationPoint(131.5F, -72F, -3F);

        gunModel[250].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F); // Box 278
        gunModel[250].setRotationPoint(147.75F, -72F, -3F);

        gunModel[251].addShapeBox(-5F, 0F, 0F, 11, 2, 1, 0F, 0F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, -0.91F, 0F, 0F, -0.91F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F); // Box 279
        gunModel[251].setRotationPoint(118.25F, -68F, 5F);

        gunModel[252].addShapeBox(-5F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.92F, -1F, 0F, -0.92F, -1F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, -1.65F, 0F, 0F, -1.65F, 0F, 0F, 1.1F, 0F, 0F, 1.1F); // Box 280
        gunModel[252].setRotationPoint(118.25F, -69F, 3F);

        gunModel[253].addShapeBox(-5F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, -0.92F, 0F, 0F, -0.92F, 0F, 0F, 0.34F, -1F, 0F, 0.34F, 0F, 0F, -1.65F, 0F, 0F, -1.65F, 0F, 0F, 1.1F, 0F, 0F, 1.1F); // Box 281
        gunModel[253].setRotationPoint(128.25F, -69F, 3F);

        gunModel[254].addShapeBox(-5F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, -0.92F, 0F, 0F, -0.92F, 0F, 0F, 0.34F, -1F, 0F, 0.34F, 0F, 0F, -1.65F, 0F, 0F, -1.65F, 0F, 0F, 1.1F, 0F, 0F, 1.1F); // Box 282
        gunModel[254].setRotationPoint(144.5F, -69F, 3F);

        gunModel[255].addShapeBox(-5F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.92F, -1F, 0F, -0.92F, -1F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, -1.65F, 0F, 0F, -1.65F, 0F, 0F, 1.1F, 0F, 0F, 1.1F); // Box 283
        gunModel[255].setRotationPoint(134.5F, -69F, 3F);

        gunModel[256].addShapeBox(-5F, 0F, 0F, 11, 2, 1, 0F, 0F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, -0.91F, 0F, 0F, -0.91F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F); // Box 284
        gunModel[256].setRotationPoint(134.5F, -68F, 5F);

        gunModel[257].addShapeBox(-5F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, -0.92F, 0F, 0F, -0.92F, 0F, 0F, 0.34F, -1F, 0F, 0.34F, 0F, 0F, -1.65F, 0F, 0F, -1.65F, 0F, 0F, 1.1F, 0F, 0F, 1.1F); // Box 285
        gunModel[257].setRotationPoint(160.75F, -69F, 3F);

        gunModel[258].addShapeBox(-5F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.92F, -1F, 0F, -0.92F, -1F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, -1.65F, 0F, 0F, -1.65F, 0F, 0F, 1.1F, 0F, 0F, 1.1F); // Box 286
        gunModel[258].setRotationPoint(150.75F, -69F, 3F);

        gunModel[259].addShapeBox(-5F, 0F, 0F, 11, 2, 1, 0F, 0F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, -0.91F, 0F, 0F, -0.91F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F); // Box 287
        gunModel[259].setRotationPoint(150.75F, -68F, 5F);

        gunModel[260].addShapeBox(-5F, 0F, 0F, 11, 2, 1, 0F, 0F, 0F, -0.91F, 0F, 0F, -0.91F, 0F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 288
        gunModel[260].setRotationPoint(134.5F, -68F, -6F);

        gunModel[261].addShapeBox(-5F, 0F, 0F, 11, 2, 1, 0F, 0F, 0F, -0.91F, 0F, 0F, -0.91F, 0F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 289
        gunModel[261].setRotationPoint(118.25F, -68F, -6F);

        gunModel[262].addShapeBox(-5F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, -0.92F, -1F, 0F, -0.92F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, -1.65F, 0F, 0F, -1.65F); // Box 290
        gunModel[262].setRotationPoint(128.25F, -69F, -4F);

        gunModel[263].addShapeBox(-5F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.34F, -1F, 0F, 0.34F, -1F, 0F, -0.92F, 0F, 0F, -0.92F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, -1.65F, 0F, 0F, -1.65F); // Box 291
        gunModel[263].setRotationPoint(118.25F, -69F, -4F);

        gunModel[264].addShapeBox(-5F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.34F, -1F, 0F, 0.34F, -1F, 0F, -0.92F, 0F, 0F, -0.92F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, -1.65F, 0F, 0F, -1.65F); // Box 292
        gunModel[264].setRotationPoint(134.5F, -69F, -4F);

        gunModel[265].addShapeBox(-5F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, -0.92F, -1F, 0F, -0.92F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, -1.65F, 0F, 0F, -1.65F); // Box 293
        gunModel[265].setRotationPoint(144.5F, -69F, -4F);

        gunModel[266].addShapeBox(-5F, 0F, 0F, 11, 2, 1, 0F, 0F, 0F, -0.91F, 0F, 0F, -0.91F, 0F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 294
        gunModel[266].setRotationPoint(150.75F, -68F, -6F);

        gunModel[267].addShapeBox(-5F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.34F, -1F, 0F, 0.34F, -1F, 0F, -0.92F, 0F, 0F, -0.92F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, -1.65F, 0F, 0F, -1.65F); // Box 295
        gunModel[267].setRotationPoint(150.75F, -69F, -4F);

        gunModel[268].addShapeBox(-5F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, -0.92F, -1F, 0F, -0.92F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, -1.65F, 0F, 0F, -1.65F); // Box 296
        gunModel[268].setRotationPoint(160.75F, -69F, -4F);

        gunModel[269].addShapeBox(0F, -8F, 2.5F, 86, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
        gunModel[269].setRotationPoint(84F, -61F, -4F);

        gunModel[270].addShapeBox(0F, -7F, 2.5F, 86, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
        gunModel[270].setRotationPoint(84F, -61F, -4F);

        gunModel[271].addShapeBox(0F, -6F, 2.5F, 86, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 299
        gunModel[271].setRotationPoint(84F, -61F, -4F);

        gunModel[272].addShapeBox(0F, 0F, -1F, 1, 3, 10, 0F, 0F, -0.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -1.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -1.15F, 0F); // Box 314
        gunModel[272].setRotationPoint(100F, -71F, -4F);

        gunModel[273].addShapeBox(0F, 0F, -1F, 1, 3, 10, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 315
        gunModel[273].setRotationPoint(101F, -71F, -4F);

        gunModel[274].addShapeBox(0F, 0F, -1F, 1, 3, 10, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0.1F, 0F, 0F, -0.15F, 0F, 0F, -1.15F, 0F, 0F, -1.15F, 0F, 0F, -0.15F, 0F); // Box 316
        gunModel[274].setRotationPoint(102F, -71F, -4F);

        gunModel[275].addShapeBox(0F, 0F, 0F, 12, 3, 15, 0F, 0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 303
        gunModel[275].setRotationPoint(170.25F, -66F, -7.5F);

        gunModel[276].addShapeBox(0F, 0F, 0F, 13, 2, 15, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 1.25F, -0.25F, -0.25F, 1.25F, -0.25F, -0.25F, 1.25F, -0.25F, 0F, 1.25F, -0.25F); // Box 304
        gunModel[276].setRotationPoint(170.25F, -57F, -7.5F);

        gunModel[277].addShapeBox(0F, 0F, 0F, 7, 2, 15, 0F, -0.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Box 305
        gunModel[277].setRotationPoint(176.25F, -63.5F, -7.5F);

        gunModel[278].addShapeBox(0F, 0F, 0F, 6, 7, 14, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 306
        gunModel[278].setRotationPoint(171.25F, -63.5F, -7F);

        gunModel[279].addShapeBox(0F, 0F, 0F, 2, 7, 15, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 307
        gunModel[279].setRotationPoint(170.25F, -63.5F, -7.5F);

        gunModel[280].addShapeBox(0F, 0F, 0F, 7, 4, 15, 0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F); // Box 309
        gunModel[280].setRotationPoint(176.25F, -61F, -7.5F);

        gunModel[281].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2F, -0.25F); // Box 310
        gunModel[281].setRotationPoint(174.5F, -63.5F, -7.5F);

        gunModel[282].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F); // Box 311
        gunModel[282].setRotationPoint(172F, -63.5F, -7.5F);

        gunModel[283].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 312
        gunModel[283].setRotationPoint(172F, -58.5F, -7.5F);

        gunModel[284].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 313
        gunModel[284].setRotationPoint(174.5F, -58.5F, -7.5F);

        gunModel[285].addShapeBox(0F, 0F, 0F, 1, 3, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
        gunModel[285].setRotationPoint(173.75F, -61.5F, -7.5F);

        gunModel[286].addShapeBox(-1F, 0F, 0F, 1, 3, 15, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 318
        gunModel[286].setRotationPoint(173.75F, -61.5F, -7.5F);

        gunModel[287].addShapeBox(1F, 0F, 0F, 1, 3, 15, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 319
        gunModel[287].setRotationPoint(173.75F, -61.5F, -7.5F);

        gunModel[288].addShapeBox(0F, -3F, -2F, 8, 3, 2, 0F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
        gunModel[288].setRotationPoint(173F, -77F, -2F);
        gunModel[288].rotateAngleX = 0.34906585F;

        gunModel[289].addShapeBox(-1F, -3F, -0.5F, 8, 3, 2, 0F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
        gunModel[289].setRotationPoint(174F, -77F, 2F);
        gunModel[289].rotateAngleX = -0.34906585F;

        gunModel[290].addShapeBox(0F, 0F, 0F, 8, 8, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.34F, 0F, -0.5F, -0.34F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 328
        gunModel[290].setRotationPoint(173F, -77F, 1.75F);

        gunModel[291].addShapeBox(0F, 0F, 0F, 8, 8, 2, 0F, 0F, -0.5F, -0.34F, 0F, -0.5F, -0.34F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 329
        gunModel[291].setRotationPoint(173F, -77F, -3.75F);

        gunModel[292].addShapeBox(0F, 0F, 0F, 24, 3, 9, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
        gunModel[292].setRotationPoint(159F, -69.25F, -4.5F);

        gunModel[293].addShapeBox(0F, -1F, -1F, 40, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
        gunModel[293].setRotationPoint(165F, -59F, -1.5F);

        gunModel[294].addShapeBox(0F, 0F, -1F, 40, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
        gunModel[294].setRotationPoint(165F, -58F, -1.5F);

        gunModel[295].addShapeBox(0F, 1F, -1F, 40, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 238
        gunModel[295].setRotationPoint(165F, -57F, -1.5F);

        gunModel[296].addShapeBox(0F, 1F, 0F, 1, 2, 6, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0.5F, -2F, 0.25F, 0.5F, -2F, 0.25F, 0.5F, -2F, 0.25F, 0.5F, -2F); // Box 242
        gunModel[296].setRotationPoint(188.5F, -57F, -2.5F);

        gunModel[297].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 243
        gunModel[297].setRotationPoint(188.5F, -58F, -2.5F);

        gunModel[298].addShapeBox(0F, -1F, 0F, 1, 2, 6, 0F, 0.25F, 0.5F, -2F, 0.25F, 0.5F, -2F, 0.25F, 0.5F, -2F, 0.25F, 0.5F, -2F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 244
        gunModel[298].setRotationPoint(188.5F, -59F, -2.5F);

        gunModel[299].addShapeBox(0F, 1F, 0F, 1, 2, 6, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0.5F, -2F, 0.25F, 0.5F, -2F, 0.25F, 0.5F, -2F, 0.25F, 0.5F, -2F); // Box 356
        gunModel[299].setRotationPoint(192.5F, -57F, -2.5F);

        gunModel[300].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 357
        gunModel[300].setRotationPoint(192.5F, -58F, -2.5F);

        gunModel[301].addShapeBox(0F, -1F, 0F, 1, 2, 6, 0F, 0.25F, 0.5F, -2F, 0.25F, 0.5F, -2F, 0.25F, 0.5F, -2F, 0.25F, 0.5F, -2F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 358
        gunModel[301].setRotationPoint(192.5F, -59F, -2.5F);

        gunModel[302].addShapeBox(0F, 1F, 0F, 1, 2, 6, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0.5F, -2F, 0.25F, 0.5F, -2F, 0.25F, 0.5F, -2F, 0.25F, 0.5F, -2F); // Box 359
        gunModel[302].setRotationPoint(196.5F, -57F, -2.5F);

        gunModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 360
        gunModel[303].setRotationPoint(196.5F, -58F, -2.5F);

        gunModel[304].addShapeBox(0F, -1F, 0F, 1, 2, 6, 0F, 0.25F, 0.5F, -2F, 0.25F, 0.5F, -2F, 0.25F, 0.5F, -2F, 0.25F, 0.5F, -2F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 361
        gunModel[304].setRotationPoint(196.5F, -59F, -2.5F);

        gunModel[305].addShapeBox(0F, 6F, 0F, 24, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 377
        gunModel[305].setRotationPoint(159F, -69.25F, -4.5F);

        gunModel[306].addShapeBox(0F, 3F, 0F, 24, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
        gunModel[306].setRotationPoint(159F, -69.25F, -4.5F);

        gunModel[307].addShapeBox(0F, 6F, 0F, 2, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2.25F, -2F, 0F, -2.25F, -2F, 0F, -1F, -1F); // Box 379
        gunModel[307].setRotationPoint(183F, -69.25F, -4.5F);

        gunModel[308].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F, 0F, 0F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F); // Box 380
        gunModel[308].setRotationPoint(183F, -69.25F, -4.5F);

        gunModel[309].addShapeBox(0F, 3F, 0F, 2, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F); // Box 381
        gunModel[309].setRotationPoint(183F, -69.25F, -4.5F);

        gunModel[310].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 382
        gunModel[310].setRotationPoint(93.25F, -74F, -4F);

        gunModel[311].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 383
        gunModel[311].setRotationPoint(101.25F, -74F, -4F);

        gunModel[312].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 384
        gunModel[312].setRotationPoint(105.25F, -74F, -4F);

        gunModel[313].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 385
        gunModel[313].setRotationPoint(109.25F, -74F, -4F);

        gunModel[314].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 386
        gunModel[314].setRotationPoint(113.25F, -74F, -4F);

        gunModel[315].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 387
        gunModel[315].setRotationPoint(117.25F, -74F, -4F);

        gunModel[316].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 388
        gunModel[316].setRotationPoint(121.25F, -74F, -4F);

        gunModel[317].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 389
        gunModel[317].setRotationPoint(125.25F, -74F, -4F);

        gunModel[318].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 390
        gunModel[318].setRotationPoint(129.25F, -74F, -4F);

        gunModel[319].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 391
        gunModel[319].setRotationPoint(133.25F, -74F, -4F);

        gunModel[320].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 392
        gunModel[320].setRotationPoint(137.25F, -74F, -4F);

        gunModel[321].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 393
        gunModel[321].setRotationPoint(141.25F, -74F, -4F);

        gunModel[322].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 394
        gunModel[322].setRotationPoint(145.25F, -74F, -4F);

        gunModel[323].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 395
        gunModel[323].setRotationPoint(149.25F, -74F, -4F);

        gunModel[324].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 396
        gunModel[324].setRotationPoint(153.25F, -74F, -4F);

        gunModel[325].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 398
        gunModel[325].setRotationPoint(158F, -74F, -4F);

        gunModel[326].addShapeBox(0F, 1F, 0F, 68, 1, 8, 0F, 0F, 0F, -0.125F, 0.75F, 0F, -0.125F, 0.75F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0.75F, 0F, -0.625F, 0.75F, 0F, -0.625F, 0F, 0F, -0.625F); // Box 406
        gunModel[326].setRotationPoint(93.25F, -74F, -4F);

        gunModel[327].addShapeBox(0F, 0F, 0F, 68, 1, 6, 0F, 0F, -0.5F, 0.4F, 0.75F, -0.5F, 0.4F, 0.75F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.25F, 0.4F, 0.75F, -0.25F, 0.4F, 0.75F, -0.25F, 0.4F, 0F, -0.25F, 0.4F); // Box 408
        gunModel[327].setRotationPoint(93.25F, -72.5F, -3F);

        gunModel[328].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 439
        gunModel[328].setRotationPoint(97.25F, -74F, -4F);

        gunModel[329].addShapeBox(0F, 0F, -1F, 3, 4, 2, 0F, 0.85F, 0.025F, 0F, -0.1F, 0.025F, 0F, -0.1F, 0.025F, 0F, 0.85F, 0.025F, 0F, -0.65F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.65F, 0.1F, 0F); // Box 109
        gunModel[329].setRotationPoint(23.2F, -41.3F, 0F);

        gunModel[330].addShapeBox(0F, 0F, -1F, 3, 6, 2, 0F, -0.65F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.65F, 0F, 0F, -5.15F, 0.75F, 0F, 2.15F, 0.75F, 0F, 2.15F, 0.75F, 0F, -5.15F, 0.75F, 0F); // Box 111
        gunModel[330].setRotationPoint(23.2F, -37.2F, 0F);

        gunModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 462
        gunModel[331].setRotationPoint(2.5F, -51.5F, 5F);

        gunModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 463
        gunModel[332].setRotationPoint(1.5F, -48.5F, 5F);

        gunModel[333].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 464
        gunModel[333].setRotationPoint(2.5F, -51.5F, 5F);

        gunModel[334].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 465
        gunModel[334].setRotationPoint(1.5F, -48.5F, 5F);

        gunModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 466
        gunModel[335].setRotationPoint(2.5F, -45.5F, 5F);

        gunModel[336].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 467
        gunModel[336].setRotationPoint(2.5F, -45.5F, 5F);

        gunModel[337].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, 0F, 0F, -8.75F, 0F, 0F, -8.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -8.75F, 0F, 0F, -8.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 260
        gunModel[337].setRotationPoint(-14.5F, -76.5F, -5F);

        gunModel[338].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, 0F, 0F, -8.75F, 0F, 0F, -8.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, -8.75F, -1F, 0F, -8.75F, -1F, 0F, 0.25F, -1F, 0F, 0.25F); // Box 261
        gunModel[338].setRotationPoint(-14.5F, -75.5F, -5F);

        gunModel[339].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -1F, 0F, -8.75F, -1F, 0F, -8.75F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, -8.75F, 0F, 0F, -8.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 262
        gunModel[339].setRotationPoint(-14.5F, -77.5F, -5F);

        gunModel[340].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, 0F, 0F, -8.75F, 0F, 0F, -8.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -8.75F, 0F, 0F, -8.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 260
        gunModel[340].setRotationPoint(-14.5F, -76.5F, -14F);

        gunModel[341].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, 0F, 0F, -8.75F, 0F, 0F, -8.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, -8.75F, -1F, 0F, -8.75F, -1F, 0F, 0.25F, -1F, 0F, 0.25F); // Box 261
        gunModel[341].setRotationPoint(-14.5F, -75.5F, -14F);

        gunModel[342].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -1F, 0F, -8.75F, -1F, 0F, -8.75F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, -8.75F, 0F, 0F, -8.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 262
        gunModel[342].setRotationPoint(-14.5F, -77.5F, -14F);

        gunModel[343].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 386
        gunModel[343].setRotationPoint(113.25F, -66F, -10F);

        gunModel[344].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 387
        gunModel[344].setRotationPoint(117.25F, -66F, -10F);

        gunModel[345].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 388
        gunModel[345].setRotationPoint(121.25F, -66F, -10F);

        gunModel[346].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 389
        gunModel[346].setRotationPoint(125.25F, -66F, -10F);

        gunModel[347].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 390
        gunModel[347].setRotationPoint(129.25F, -66F, -10F);

        gunModel[348].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 391
        gunModel[348].setRotationPoint(133.25F, -66F, -10F);

        gunModel[349].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 392
        gunModel[349].setRotationPoint(137.25F, -66F, -10F);

        gunModel[350].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 393
        gunModel[350].setRotationPoint(141.25F, -66F, -10F);

        gunModel[351].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 394
        gunModel[351].setRotationPoint(145.25F, -66F, -10F);

        gunModel[352].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 395
        gunModel[352].setRotationPoint(149.25F, -66F, -10F);

        gunModel[353].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 396
        gunModel[353].setRotationPoint(153.25F, -66F, -10F);

        gunModel[354].addShapeBox(0F, 0F, 0F, 42, 8, 1, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F); // Box 396
        gunModel[354].setRotationPoint(113.25F, -66F, -9F);

        gunModel[355].addShapeBox(0F, 0F, 0F, 42, 8, 1, 0F, 0F, -1.375F, 0F, 0F, -1.375F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0F, 0F, -1.375F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F); // Box 396
        gunModel[355].setRotationPoint(113.25F, -66F, -7.5F);

        gunModel[356].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F); // Box 386
        gunModel[356].setRotationPoint(113.25F, -66F, 9F);

        gunModel[357].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F); // Box 387
        gunModel[357].setRotationPoint(117.25F, -66F, 9F);

        gunModel[358].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F); // Box 388
        gunModel[358].setRotationPoint(121.25F, -66F, 9F);

        gunModel[359].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F); // Box 389
        gunModel[359].setRotationPoint(125.25F, -66F, 9F);

        gunModel[360].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F); // Box 390
        gunModel[360].setRotationPoint(129.25F, -66F, 9F);

        gunModel[361].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F); // Box 391
        gunModel[361].setRotationPoint(133.25F, -66F, 9F);

        gunModel[362].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F); // Box 392
        gunModel[362].setRotationPoint(137.25F, -66F, 9F);

        gunModel[363].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F); // Box 393
        gunModel[363].setRotationPoint(141.25F, -66F, 9F);

        gunModel[364].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F); // Box 394
        gunModel[364].setRotationPoint(145.25F, -66F, 9F);

        gunModel[365].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F); // Box 395
        gunModel[365].setRotationPoint(149.25F, -66F, 9F);

        gunModel[366].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F); // Box 396
        gunModel[366].setRotationPoint(153.25F, -66F, 9F);

        gunModel[367].addShapeBox(0F, 0F, 0F, 42, 8, 1, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 396
        gunModel[367].setRotationPoint(113.25F, -66F, 8F);

        gunModel[368].addShapeBox(0F, 0F, 0F, 42, 8, 1, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0F, 0F, -1.375F, 0F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0.5F, 0F, -1.375F, 0F, 0F, -1.375F, 0F); // Box 396
        gunModel[368].setRotationPoint(113.25F, -66F, 6.5F);

        gunModel[369].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F); // Box 386
        gunModel[369].setRotationPoint(113.25F, -48F, -4F);

        gunModel[370].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F); // Box 387
        gunModel[370].setRotationPoint(117.25F, -48F, -4F);

        gunModel[371].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F); // Box 388
        gunModel[371].setRotationPoint(121.25F, -48F, -4F);

        gunModel[372].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F); // Box 389
        gunModel[372].setRotationPoint(125.25F, -48F, -4F);

        gunModel[373].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F); // Box 390
        gunModel[373].setRotationPoint(129.25F, -48F, -4F);

        gunModel[374].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F); // Box 391
        gunModel[374].setRotationPoint(133.25F, -48F, -4F);

        gunModel[375].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F); // Box 392
        gunModel[375].setRotationPoint(137.25F, -48F, -4F);

        gunModel[376].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F); // Box 393
        gunModel[376].setRotationPoint(141.25F, -48F, -4F);

        gunModel[377].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F); // Box 394
        gunModel[377].setRotationPoint(145.25F, -48F, -4F);

        gunModel[378].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F); // Box 395
        gunModel[378].setRotationPoint(149.25F, -48F, -4F);

        gunModel[379].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F); // Box 396
        gunModel[379].setRotationPoint(153.25F, -48F, -4F);

        gunModel[380].addShapeBox(0F, 0F, 0F, 42, 1, 8, 0F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 396
        gunModel[380].setRotationPoint(113.25F, -49F, -4F);

        gunModel[381].addShapeBox(0F, 0F, 0F, 42, 1, 8, 0F, 0F, 0F, -1.375F, 0F, 0F, -1.375F, 0F, 0F, -1.375F, 0F, 0F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F, 0F, 0.5F, -1.375F); // Box 396
        gunModel[381].setRotationPoint(113.25F, -51F, -4F);


        defaultBarrelModel = new ModelRendererTurbo[10];
        defaultBarrelModel[0] = new ModelRendererTurbo(this, 521, 137, textureX, textureY); // Box 249
        defaultBarrelModel[1] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 251
        defaultBarrelModel[2] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Box 252
        defaultBarrelModel[3] = new ModelRendererTurbo(this, 825, 121, textureX, textureY); // Box 255
        defaultBarrelModel[4] = new ModelRendererTurbo(this, 865, 121, textureX, textureY); // Box 256
        defaultBarrelModel[5] = new ModelRendererTurbo(this, 905, 121, textureX, textureY); // Box 257
        defaultBarrelModel[6] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 372
        defaultBarrelModel[7] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 373
        defaultBarrelModel[8] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 374
        defaultBarrelModel[9] = new ModelRendererTurbo(this, 953, 137, textureX, textureY); // Box 376

        defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 29, 1, 8, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 249
        defaultBarrelModel[0].setRotationPoint(205F, -57.5F, -3.5F);

        defaultBarrelModel[1].addShapeBox(0F, -1F, 0F, 29, 2, 8, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
        defaultBarrelModel[1].setRotationPoint(205F, -59F, -3.5F);

        defaultBarrelModel[2].addShapeBox(0F, 0F, 0F, 29, 2, 7, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 252
        defaultBarrelModel[2].setRotationPoint(205F, -61.5F, -3F);

        defaultBarrelModel[3].addShapeBox(0F, 0F, -2F, 7, 1, 8, 0F, 0F, 0.5F, 0F, 0F, 0.375F, -0.75F, 0F, 0.375F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.375F, -0.75F, 0F, 0.375F, -0.75F, 0F, 0.5F, 0F); // Box 255
        defaultBarrelModel[3].setRotationPoint(234F, -57.5F, -1.5F);

        defaultBarrelModel[4].addShapeBox(0F, -1F, -1F, 7, 1, 5, 0F, 0F, 0.5F, -0.5F, 0F, 0.125F, -1.125F, 0F, 0.125F, -1.125F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.625F, -0.25F, 0F, 0.625F, -0.25F, 0F, 0.5F, 0.5F); // Box 256
        defaultBarrelModel[4].setRotationPoint(234F, -58.5F, -1F);

        defaultBarrelModel[5].addShapeBox(0F, -2F, -2F, 7, 2, 6, 0F, 0F, -0.5F, -1.75F, 0F, -1F, -2.125F, 0F, -1F, -2.375F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.125F, -0.625F, 0F, -0.125F, -0.625F, 0F, -0.5F, 0F); // Box 257
        defaultBarrelModel[5].setRotationPoint(234F, -59.5F, -0.5F);

        defaultBarrelModel[6].addShapeBox(0F, 3F, 0F, 29, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 372
        defaultBarrelModel[6].setRotationPoint(205F, -59F, -3.5F);

        defaultBarrelModel[7].addShapeBox(0F, 7F, 0F, 29, 2, 7, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F); // Box 373
        defaultBarrelModel[7].setRotationPoint(205F, -61.5F, -3F);

        defaultBarrelModel[8].addShapeBox(0F, 3F, -1F, 7, 1, 5, 0F, 0F, 0.5F, 0.5F, 0F, 0.625F, -0.25F, 0F, 0.625F, -0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.125F, -1.125F, 0F, 0.125F, -1.125F, 0F, 0.5F, -0.5F); // Box 374
        defaultBarrelModel[8].setRotationPoint(234F, -58.5F, -1F);

        defaultBarrelModel[9].addShapeBox(0F, 5F, -2F, 7, 2, 6, 0F, 0F, -0.5F, 0F, 0F, -0.125F, -0.625F, 0F, -0.125F, -0.625F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, -1F, -2.125F, 0F, -1F, -2.375F, 0F, -0.5F, -2F); // Box 376
        defaultBarrelModel[9].setRotationPoint(234F, -59.5F, -0.5F);


        defaultStockModel = new ModelRendererTurbo[39];
        defaultStockModel[0] = new ModelRendererTurbo(this, 817, 177, textureX, textureY); // Box 440
        defaultStockModel[1] = new ModelRendererTurbo(this, 817, 97, textureX, textureY); // Box 441
        defaultStockModel[2] = new ModelRendererTurbo(this, 393, 161, textureX, textureY); // Box 442
        defaultStockModel[3] = new ModelRendererTurbo(this, 553, 153, textureX, textureY); // Box 443
        defaultStockModel[4] = new ModelRendererTurbo(this, 969, 153, textureX, textureY); // Box 444
        defaultStockModel[5] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 445
        defaultStockModel[6] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Box 446
        defaultStockModel[7] = new ModelRendererTurbo(this, 865, 153, textureX, textureY); // Box 447
        defaultStockModel[8] = new ModelRendererTurbo(this, 585, 161, textureX, textureY); // Box 448
        defaultStockModel[9] = new ModelRendererTurbo(this, 849, 185, textureX, textureY); // Box 449
        defaultStockModel[10] = new ModelRendererTurbo(this, 593, 161, textureX, textureY); // Box 450
        defaultStockModel[11] = new ModelRendererTurbo(this, 641, 161, textureX, textureY); // Box 451
        defaultStockModel[12] = new ModelRendererTurbo(this, 665, 161, textureX, textureY); // Box 452
        defaultStockModel[13] = new ModelRendererTurbo(this, 697, 161, textureX, textureY); // Box 453
        defaultStockModel[14] = new ModelRendererTurbo(this, 521, 185, textureX, textureY); // Box 454
        defaultStockModel[15] = new ModelRendererTurbo(this, 257, 193, textureX, textureY); // Box 455
        defaultStockModel[16] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Box 456
        defaultStockModel[17] = new ModelRendererTurbo(this, 537, 193, textureX, textureY); // Box 457
        defaultStockModel[18] = new ModelRendererTurbo(this, 625, 193, textureX, textureY); // Box 458
        defaultStockModel[19] = new ModelRendererTurbo(this, 969, 185, textureX, textureY); // Box 459
        defaultStockModel[20] = new ModelRendererTurbo(this, 913, 161, textureX, textureY); // Box 460
        defaultStockModel[21] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Box 461
        defaultStockModel[22] = new ModelRendererTurbo(this, 697, 193, textureX, textureY); // Box 462
        defaultStockModel[23] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 463
        defaultStockModel[24] = new ModelRendererTurbo(this, 729, 193, textureX, textureY); // Box 464
        defaultStockModel[25] = new ModelRendererTurbo(this, 761, 193, textureX, textureY); // Box 465
        defaultStockModel[26] = new ModelRendererTurbo(this, 145, 201, textureX, textureY); // Box 466
        defaultStockModel[27] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Box 467
        defaultStockModel[28] = new ModelRendererTurbo(this, 793, 193, textureX, textureY); // Box 468
        defaultStockModel[29] = new ModelRendererTurbo(this, 209, 201, textureX, textureY); // Box 469
        defaultStockModel[30] = new ModelRendererTurbo(this, 841, 201, textureX, textureY); // Box 470
        defaultStockModel[31] = new ModelRendererTurbo(this, 881, 201, textureX, textureY); // Box 471
        defaultStockModel[32] = new ModelRendererTurbo(this, 913, 201, textureX, textureY); // Box 472
        defaultStockModel[33] = new ModelRendererTurbo(this, 945, 201, textureX, textureY); // Box 473
        defaultStockModel[34] = new ModelRendererTurbo(this, 993, 201, textureX, textureY); // Box 474
        defaultStockModel[35] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 475
        defaultStockModel[36] = new ModelRendererTurbo(this, 649, 161, textureX, textureY); // Box 476
        defaultStockModel[37] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Box 477
        defaultStockModel[38] = new ModelRendererTurbo(this, 969, 250, textureX, textureY); // Box 461

        defaultStockModel[0].addShapeBox(0F, 0F, 0F, 5, 15, 10, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F); // Box 440
        defaultStockModel[0].setRotationPoint(-26F, -62F, -3.5F);

        defaultStockModel[1].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 441
        defaultStockModel[1].setRotationPoint(-26F, -64F, 2.5F);

        defaultStockModel[2].addShapeBox(0F, 0F, 0F, 5, 6, 7, 0F, 0F, 0.25F, -0.75F, 0F, 1F, -0.75F, 0F, 1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 442
        defaultStockModel[2].setRotationPoint(-26F, -68F, -3.5F);

        defaultStockModel[3].addShapeBox(-1F, 0F, -2F, 2, 15, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
        defaultStockModel[3].setRotationPoint(-24F, -64F, -5.75F);

        defaultStockModel[4].addShapeBox(-3F, 0F, -2F, 2, 15, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 444
        defaultStockModel[4].setRotationPoint(-24F, -64F, -5.75F);

        defaultStockModel[5].addShapeBox(1F, 0F, -2F, 2, 15, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 445
        defaultStockModel[5].setRotationPoint(-24F, -64F, -5.75F);

        defaultStockModel[6].addShapeBox(-3F, 0F, -2F, 2, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 446
        defaultStockModel[6].setRotationPoint(-24F, -68F, -5.75F);

        defaultStockModel[7].addShapeBox(-1F, 0F, -2F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
        defaultStockModel[7].setRotationPoint(-24F, -68F, -5.75F);

        defaultStockModel[8].addShapeBox(1F, 0F, -2F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 448
        defaultStockModel[8].setRotationPoint(-24F, -68F, -5.75F);

        defaultStockModel[9].addShapeBox(-48F, 0F, 0F, 49, 3, 9, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
        defaultStockModel[9].setRotationPoint(-26F, -64F, -4.5F);
        defaultStockModel[9].rotateAngleZ = 0.05235988F;

        defaultStockModel[10].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 450
        defaultStockModel[10].setRotationPoint(-26F, -46.5F, -2.5F);

        defaultStockModel[11].addShapeBox(-1F, 0F, -2F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
        defaultStockModel[11].setRotationPoint(-24F, -47F, -5.75F);

        defaultStockModel[12].addShapeBox(1F, 0F, -2F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 452
        defaultStockModel[12].setRotationPoint(-24F, -47F, -5.75F);

        defaultStockModel[13].addShapeBox(-3F, 0F, -2F, 2, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 453
        defaultStockModel[13].setRotationPoint(-24F, -47F, -5.75F);

        defaultStockModel[14].addShapeBox(-1F, 0F, -2F, 2, 19, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
        defaultStockModel[14].setRotationPoint(-24F, -66F, -3.75F);

        defaultStockModel[15].addShapeBox(-48F, 2F, 0F, 49, 13, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
        defaultStockModel[15].setRotationPoint(-26F, -63F, -4.5F);
        defaultStockModel[15].rotateAngleZ = 0.05235988F;

        defaultStockModel[16].addShapeBox(-48F, 16F, 0F, 49, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 456
        defaultStockModel[16].setRotationPoint(-26F, -64F, -4.5F);
        defaultStockModel[16].rotateAngleZ = 0.05235988F;

        defaultStockModel[17].addShapeBox(-48F, -2F, -1F, 32, 2, 10, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
        defaultStockModel[17].setRotationPoint(-26F, -64F, -4.5F);
        defaultStockModel[17].rotateAngleZ = 0.05235988F;

        defaultStockModel[18].addShapeBox(-48F, -2F, 9F, 32, 21, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
        defaultStockModel[18].setRotationPoint(-26F, -64F, -4.5F);
        defaultStockModel[18].rotateAngleZ = 0.05235988F;

        defaultStockModel[19].addShapeBox(-54F, 2F, 0F, 6, 13, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
        defaultStockModel[19].setRotationPoint(-26F, -63F, -4.5F);
        defaultStockModel[19].rotateAngleZ = 0.05235988F;

        defaultStockModel[20].addShapeBox(-54F, 0F, 0F, 6, 3, 9, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
        defaultStockModel[20].setRotationPoint(-26F, -64F, -4.5F);
        defaultStockModel[20].rotateAngleZ = 0.05235988F;

        defaultStockModel[21].addShapeBox(-54F, 16F, 0F, 6, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -1F); // Box 461
        defaultStockModel[21].setRotationPoint(-26F, -64F, -4.5F);
        defaultStockModel[21].rotateAngleZ = 0.05235988F;

        defaultStockModel[22].addShapeBox(-54F, 31F, 1F, 6, 3, 7, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
        defaultStockModel[22].setRotationPoint(-26F, -64F, -4.5F);
        defaultStockModel[22].rotateAngleZ = 0.05235988F;

        defaultStockModel[23].addShapeBox(-48F, 31F, 1F, 2, 3, 7, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F); // Box 463
        defaultStockModel[23].setRotationPoint(-26F, -64F, -4.5F);
        defaultStockModel[23].rotateAngleZ = 0.05235988F;

        defaultStockModel[24].addShapeBox(-60F, 2F, 0F, 6, 13, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
        defaultStockModel[24].setRotationPoint(-26F, -63F, -4.5F);
        defaultStockModel[24].rotateAngleZ = 0.05235988F;

        defaultStockModel[25].addShapeBox(-60F, 0F, 0F, 6, 3, 9, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
        defaultStockModel[25].setRotationPoint(-26F, -64F, -4.5F);
        defaultStockModel[25].rotateAngleZ = 0.05235988F;

        defaultStockModel[26].addShapeBox(-60F, 16F, 0F, 6, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 466
        defaultStockModel[26].setRotationPoint(-26F, -64F, -4.5F);
        defaultStockModel[26].rotateAngleZ = 0.05235988F;

        defaultStockModel[27].addShapeBox(-60F, 25F, 1F, 6, 9, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
        defaultStockModel[27].setRotationPoint(-26F, -64F, -4.5F);
        defaultStockModel[27].rotateAngleZ = 0.05235988F;

        defaultStockModel[28].addShapeBox(-66F, -1F, -1F, 6, 4, 11, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
        defaultStockModel[28].setRotationPoint(-26F, -64F, -4.5F);
        defaultStockModel[28].rotateAngleZ = 0.05235988F;

        defaultStockModel[29].addShapeBox(-66F, 2F, -1F, 6, 13, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
        defaultStockModel[29].setRotationPoint(-26F, -63F, -4.5F);
        defaultStockModel[29].rotateAngleZ = 0.05235988F;

        defaultStockModel[30].addShapeBox(-66F, 16F, -1F, 6, 9, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 470
        defaultStockModel[30].setRotationPoint(-26F, -64F, -4.5F);
        defaultStockModel[30].rotateAngleZ = 0.05235988F;

        defaultStockModel[31].addShapeBox(-66F, 25F, 0F, 6, 8, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
        defaultStockModel[31].setRotationPoint(-26F, -64F, -4.5F);
        defaultStockModel[31].rotateAngleZ = 0.05235988F;

        defaultStockModel[32].addShapeBox(-69F, -1F, -1F, 3, 4, 11, 0F, 2F, -1F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 2F, -1F, -2.5F, 0.55F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.55F, 0F, -1F); // Box 472
        defaultStockModel[32].setRotationPoint(-26F, -64F, -4.5F);
        defaultStockModel[32].rotateAngleZ = 0.05235988F;

        defaultStockModel[33].addShapeBox(-69F, 2F, -1F, 3, 13, 11, 0F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 473
        defaultStockModel[33].setRotationPoint(-26F, -63F, -4.5F);
        defaultStockModel[33].rotateAngleZ = 0.05235988F;

        defaultStockModel[34].addShapeBox(-69F, 16F, -1F, 3, 9, 11, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 474
        defaultStockModel[34].setRotationPoint(-26F, -64F, -4.5F);
        defaultStockModel[34].rotateAngleZ = 0.05235988F;

        defaultStockModel[35].addShapeBox(-66F, 33F, 0F, 6, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 475
        defaultStockModel[35].setRotationPoint(-26F, -64F, -4.5F);
        defaultStockModel[35].rotateAngleZ = 0.05235988F;

        defaultStockModel[36].addShapeBox(-69F, 25F, 0F, 3, 8, 9, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F); // Box 476
        defaultStockModel[36].setRotationPoint(-26F, -64F, -4.5F);
        defaultStockModel[36].rotateAngleZ = 0.05235988F;

        defaultStockModel[37].addShapeBox(-69F, 33F, 0F, 3, 2, 9, 0F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -2F); // Box 477
        defaultStockModel[37].setRotationPoint(-26F, -64F, -4.5F);
        defaultStockModel[37].rotateAngleZ = 0.05235988F;

        defaultStockModel[38].addShapeBox(-6F, 3F, -2F, 7, 11, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 461
        defaultStockModel[38].setRotationPoint(-26F, -64F, -5.75F);


        ammoModel = new ModelRendererTurbo[31];
        ammoModel[0] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 530
        ammoModel[1] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 529
        ammoModel[2] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 528
        ammoModel[3] = new ModelRendererTurbo(this, 753, 137, textureX, textureY); // Box 518
        ammoModel[4] = new ModelRendererTurbo(this, 249, 217, textureX, textureY); // Box 517
        ammoModel[5] = new ModelRendererTurbo(this, 1009, 121, textureX, textureY); // Box 516
        ammoModel[6] = new ModelRendererTurbo(this, 521, 129, textureX, textureY); // Box 515
        ammoModel[7] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Box 514
        ammoModel[8] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 513
        ammoModel[9] = new ModelRendererTurbo(this, 785, 209, textureX, textureY); // Box 512
        ammoModel[10] = new ModelRendererTurbo(this, 761, 209, textureX, textureY); // Box 511
        ammoModel[11] = new ModelRendererTurbo(this, 697, 209, textureX, textureY); // Box 510
        ammoModel[12] = new ModelRendererTurbo(this, 593, 209, textureX, textureY); // Box 508
        ammoModel[13] = new ModelRendererTurbo(this, 569, 209, textureX, textureY); // Box 507
        ammoModel[14] = new ModelRendererTurbo(this, 545, 209, textureX, textureY); // Box 506
        ammoModel[15] = new ModelRendererTurbo(this, 529, 209, textureX, textureY); // Box 503
        ammoModel[16] = new ModelRendererTurbo(this, 129, 209, textureX, textureY); // Box 502
        ammoModel[17] = new ModelRendererTurbo(this, 113, 209, textureX, textureY); // Box 501
        ammoModel[18] = new ModelRendererTurbo(this, 449, 209, textureX, textureY); // Box 500
        ammoModel[19] = new ModelRendererTurbo(this, 369, 209, textureX, textureY); // Box 499
        ammoModel[20] = new ModelRendererTurbo(this, 33, 209, textureX, textureY); // Box 497
        ammoModel[21] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 496
        ammoModel[22] = new ModelRendererTurbo(this, 129, 209, textureX, textureY); // Box 478
        ammoModel[23] = new ModelRendererTurbo(this, 113, 209, textureX, textureY); // Box 479
        ammoModel[24] = new ModelRendererTurbo(this, 545, 209, textureX, textureY); // Box 480
        ammoModel[25] = new ModelRendererTurbo(this, 697, 209, textureX, textureY); // Box 481
        ammoModel[26] = new ModelRendererTurbo(this, 761, 209, textureX, textureY); // Box 482
        ammoModel[27] = new ModelRendererTurbo(this, 569, 209, textureX, textureY); // Box 483
        ammoModel[28] = new ModelRendererTurbo(this, 785, 209, textureX, textureY); // Box 485
        ammoModel[29] = new ModelRendererTurbo(this, 593, 209, textureX, textureY); // Box 486
        ammoModel[30] = new ModelRendererTurbo(this, 529, 209, textureX, textureY); // Box 487

        ammoModel[0].addShapeBox(22F, 1F, -11F, 3, 3, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 530
        ammoModel[0].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[1].addShapeBox(0F, 1F, -11F, 9, 3, 1, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 1F, 0F, 0F); // Box 529
        ammoModel[1].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[2].addShapeBox(10F, 1F, -11F, 7, 3, 1, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 528
        ammoModel[2].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[3].addShapeBox(26F, 1F, -9F, 1, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
        ammoModel[3].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[4].addShapeBox(-4F, 1F, -10F, 31, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
        ammoModel[4].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[5].addShapeBox(-4F, 1F, -9F, 1, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
        ammoModel[5].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[6].addShapeBox(-4F, 1F, -4F, 31, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
        ammoModel[6].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[7].addShapeBox(0F, 1F, -3F, 9, 3, 1, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 514
        ammoModel[7].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[8].addShapeBox(11F, 1F, -3F, 7, 3, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 513
        ammoModel[8].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[9].addShapeBox(5F, 44F, -3F, 9, 28, 1, 0F, 3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.25F, 2F, 0F, -0.25F, -2.25F, -1.25F, 0F, 1.5F, -2.5F, 0F, 1.5F, -2.5F, -0.25F, -3.25F, -1.25F, -0.25F); // Box 512
        ammoModel[9].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[10].addShapeBox(1F, 23F, -3F, 9, 21, 1, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, -0.25F, -2F, 0F, -0.25F); // Box 511
        ammoModel[10].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[11].addShapeBox(0F, 4F, -3F, 9, 19, 1, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 510
        ammoModel[11].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[12].addShapeBox(16F, 44F, -3F, 7, 26, 1, 0F, 2.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, -0.25F, 2.25F, 0F, -0.25F, -1.75F, -1F, 0F, 2.25F, -2.5F, 0F, 2.25F, -2.5F, -0.25F, -1.75F, -1F, -0.25F); // Box 508
        ammoModel[12].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[13].addShapeBox(12F, 23F, -3F, 7, 21, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -1.75F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, -0.25F, -1.75F, 0F, -0.25F); // Box 507
        ammoModel[13].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[14].addShapeBox(11F, 4F, -3F, 7, 19, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Box 506
        ammoModel[14].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[15].addShapeBox(27F, 44F, -3F, 4, 24, 1, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, -0.25F, 2F, 0F, -0.25F, -2F, -1.25F, 0F, 1.5F, -1.75F, 0F, 0.5F, -1.75F, -0.25F, -2F, -1.25F, -0.25F); // Box 503
        ammoModel[15].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[16].addShapeBox(23F, 23F, -3F, 4, 21, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, -0.25F, -2F, 0F, -0.25F); // Box 502
        ammoModel[16].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[17].addShapeBox(22F, 4F, -3F, 4, 19, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 501
        ammoModel[17].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[18].addShapeBox(-3F, 23F, -10F, 31, 21, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 500
        ammoModel[18].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[19].addShapeBox(1F, 44F, -10F, 31, 30, 7, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -3F, -2F, 0F, 1.5F, -8F, 0F, 1.5F, -8F, 0F, -3F, -2F, 0F); // Box 499
        ammoModel[19].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[20].addShapeBox(-4F, 4F, -10F, 31, 19, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 497
        ammoModel[20].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[21].addShapeBox(22F, 1F, -3F, 3, 3, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 496
        ammoModel[21].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[22].addShapeBox(23F, 23F, -11F, 4, 21, 1, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.25F, 1F, 0F, -0.25F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 478
        ammoModel[22].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[23].addShapeBox(22F, 4F, -11F, 4, 19, 1, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 479
        ammoModel[23].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[24].addShapeBox(11F, 4F, -11F, 7, 19, 1, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, 0F, 0F, -0.75F, 0F, 0F); // Box 480
        ammoModel[24].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[25].addShapeBox(0F, 4F, -11F, 9, 19, 1, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 481
        ammoModel[25].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[26].addShapeBox(1F, 23F, -11F, 9, 21, 1, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, 0F, -1F, 0F, 0F); // Box 482
        ammoModel[26].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[27].addShapeBox(12F, 23F, -11F, 7, 21, 1, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, 0F, -0.25F, 2.25F, 0F, -0.25F, 2.25F, 0F, 0F, -1.75F, 0F, 0F); // Box 483
        ammoModel[27].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[28].addShapeBox(5F, 44F, -11F, 9, 28, 1, 0F, 2F, 0F, -0.25F, -2.5F, 0F, -0.25F, -2.5F, 0F, 0F, 3F, 0F, 0F, -3.25F, -1.25F, -0.25F, 1.5F, -2.5F, -0.25F, 1.5F, -2.5F, 0F, -2.25F, -1.25F, 0F); // Box 485
        ammoModel[28].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[29].addShapeBox(16F, 44F, -11F, 7, 26, 1, 0F, 2.25F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, 0F, 2.25F, 0F, 0F, -1.75F, -1F, -0.25F, 2.25F, -2.5F, -0.25F, 2.25F, -2.5F, 0F, -1.75F, -1F, 0F); // Box 486
        ammoModel[29].setRotationPoint(53F, -48F, 6.5F);

        ammoModel[30].addShapeBox(27F, 44F, -11F, 4, 24, 1, 0F, 2F, 0F, -0.25F, -3F, 0F, -0.25F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, -1.25F, -0.25F, 0.5F, -1.75F, -0.25F, 1.5F, -1.75F, 0F, -2F, -1.25F, 0F); // Box 487
        ammoModel[30].setRotationPoint(53F, -48F, 6.5F);


        slideModel = new ModelRendererTurbo[20];
        slideModel[0] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 168
        slideModel[1] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 169
        slideModel[2] = new ModelRendererTurbo(this, 913, 73, textureX, textureY); // Box 175
        slideModel[3] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 176
        slideModel[4] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 547
        slideModel[5] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 548
        slideModel[6] = new ModelRendererTurbo(this, 625, 57, textureX, textureY); // Box 549
        slideModel[7] = new ModelRendererTurbo(this, 657, 57, textureX, textureY); // Box 240
        slideModel[8] = new ModelRendererTurbo(this, 689, 57, textureX, textureY); // Box 241
        slideModel[9] = new ModelRendererTurbo(this, 969, 57, textureX, textureY); // Box 242
        slideModel[10] = new ModelRendererTurbo(this, 1009, 57, textureX, textureY); // Box 243
        slideModel[11] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 244
        slideModel[12] = new ModelRendererTurbo(this, 753, 65, textureX, textureY); // Box 245
        slideModel[13] = new ModelRendererTurbo(this, 793, 65, textureX, textureY); // Box 246
        slideModel[14] = new ModelRendererTurbo(this, 825, 65, textureX, textureY); // Box 247
        slideModel[15] = new ModelRendererTurbo(this, 881, 65, textureX, textureY); // Box 248
        slideModel[16] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 249
        slideModel[17] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 250
        slideModel[18] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 251
        slideModel[19] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 531

        slideModel[0].addShapeBox(0F, 0F, 0F, 34, 2, 9, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 168
        slideModel[0].setRotationPoint(50F, -66F, -4.5F);

        slideModel[1].addShapeBox(0F, 0F, 0F, 34, 2, 9, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 169
        slideModel[1].setRotationPoint(50F, -68F, -4.5F);

        slideModel[2].addShapeBox(0F, 0F, 0F, 34, 3, 12, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
        slideModel[2].setRotationPoint(50F, -64F, -6F);

        slideModel[3].addShapeBox(0F, 0F, 0F, 34, 3, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
        slideModel[3].setRotationPoint(50F, -61F, -6F);

        slideModel[4].addShapeBox(0F, 0F, -1F, 6, 2, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 547
        slideModel[4].setRotationPoint(86F, -56.5F, 9F);

        slideModel[5].addShapeBox(0F, 0F, -1F, 6, 2, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F); // Box 548
        slideModel[5].setRotationPoint(86F, -54.5F, 9F);

        slideModel[6].addShapeBox(0F, 0F, -1F, 6, 2, 1, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 549
        slideModel[6].setRotationPoint(86F, -58.5F, 9F);

        slideModel[7].addShapeBox(0F, 0F, -2F, 6, 2, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 240
        slideModel[7].setRotationPoint(86F, -56.5F, 9F);

        slideModel[8].addShapeBox(0F, 0F, -2F, 6, 2, 1, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 241
        slideModel[8].setRotationPoint(86F, -58.5F, 9F);

        slideModel[9].addShapeBox(0F, 0F, -2F, 6, 2, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 242
        slideModel[9].setRotationPoint(86F, -54.5F, 9F);

        slideModel[10].addShapeBox(0F, 0F, -1F, 6, 2, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 243
        slideModel[10].setRotationPoint(86F, -56.5F, 17F);

        slideModel[11].addShapeBox(0F, 0F, -1F, 6, 2, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 244
        slideModel[11].setRotationPoint(86F, -54.5F, 17F);

        slideModel[12].addShapeBox(0F, 0F, -1F, 6, 2, 1, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 245
        slideModel[12].setRotationPoint(86F, -58.5F, 17F);

        slideModel[13].addShapeBox(0F, 0F, -2F, 6, 2, 1, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 246
        slideModel[13].setRotationPoint(86F, -58.5F, 19F);

        slideModel[14].addShapeBox(0F, 0F, -2F, 6, 2, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 247
        slideModel[14].setRotationPoint(86F, -56.5F, 19F);

        slideModel[15].addShapeBox(0F, 0F, -2F, 6, 2, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 248
        slideModel[15].setRotationPoint(86F, -54.5F, 19F);

        slideModel[16].addShapeBox(0F, 0F, -8F, 6, 2, 7, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 249
        slideModel[16].setRotationPoint(86F, -56.5F, 17F);

        slideModel[17].addShapeBox(0F, 0F, -8F, 6, 2, 7, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 250
        slideModel[17].setRotationPoint(86F, -58.5F, 17F);

        slideModel[18].addShapeBox(0F, 4F, -8F, 6, 2, 7, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F); // Box 251
        slideModel[18].setRotationPoint(86F, -58.5F, 17F);

        slideModel[19].addShapeBox(-5F, 0F, -2.25F, 4, 2, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1.5F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1.5F, 0.5F, 0F, -1F); // Box 531
        slideModel[19].setRotationPoint(86F, -56.5F, 9F);


        barrelAttachPoint = new Vector3f(205F / 16F, 49F / 16F, 0.5F / 16F);
        gadgetAttachPoint = new Vector3f(135F / 16F, 54F / 16F, -8F / 16F);
        scopeAttachPoint = new Vector3f(24F / 16F, 65F / 16F, 0F / 16F);
        gripAttachPoint = new Vector3f(134 / 16F, 40F / 16F, 0F / 16F);
        gunSlideDistance = 1.6F;

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
        leftHandAmmo = false;
        gunOffset = -0.6F;
        translateAll(0F, 8F, 0F);
        crouchZoom = -0.025F;
        zoomOffset = 0.175F;
        zoomOffsetY = -0.025F;
        flipAll();
    }
}