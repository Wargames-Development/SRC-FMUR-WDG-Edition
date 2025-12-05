//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: RPK16
// Model Creator: 
// Created on: 17.04.2021 - 10:54:36
// Last changed on: 17.04.2021 - 10:54:36

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelRPKM extends ModelGun //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public ModelRPKM() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[599];
        defaultBarrelModel = new ModelRendererTurbo[85];
        defaultScopeModel = new ModelRendererTurbo[30];
        defaultStockModel = new ModelRendererTurbo[41];
        ammoModel = new ModelRendererTurbo[87];
        slideModel = new ModelRendererTurbo[12];

        initgunModel_1();
        initgunModel_2();
        initdefaultBarrelModel_1();
        initdefaultScopeModel_1();
        initdefaultStockModel_1();
        initammoModel_1();
        initslideModel_1();

        barrelAttachPoint = new Vector3f(99.8F / 16F, 23F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(74.5F / 16F, 27.5F / 16F, -4F / 16F);
        scopeAttachPoint = new Vector3f(10F / 16F, 31.5F / 16F, 0F / 16F);
        gripAttachPoint = new Vector3f(61 / 16F, 18F / 16F, 0F / 16F);

        gunSlideDistance = 0.15F;
        animationType = EnumAnimationType.CUSTOM;
        hasFlash = true;
        hasArms = true;

        leftArmPos = new Vector3f(2F, 0.1F, -8.5F);
        leftArmRot = new Vector3f(-80F, -55F, 0.0F);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
        rightArmPos = new Vector3f(0.24F, -0.6F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        enableNewArm = true;

        leftArmReloadPos = new Vector3f(-0.15F, -0.55F, 0.05F);
        leftArmReloadRot = new Vector3f(80F, 50F, 0.0F);
        rightArmReloadPos = new Vector3f(0.24F, -0.6F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85F);

        rotateGunHorizontal = 15.0F;
        tiltGun = 30.0F;
        translateGun = new Vector3f(0.0F, -0.0625F, -0.186F);
        translateClip = new Vector3f(0.0F, -0.625F, 0.0F);

        rightHandAmmo = false;
        leftHandAmmo = false;
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

        hasFlash = true;
        flashScale = 4F;
        muzzleFlashPoint = new Vector3f(
                barrelAttachPoint.x / flashScale,
                barrelAttachPoint.y / flashScale,
                barrelAttachPoint.z / flashScale
        );

        zoomOffset = 0.275F;
        zoomOffsetY = -0.026F;
        ShakeDistance = 0.3F;
        gunOffset = -0.48F;
        gunOffsetX = -1F;
        flipAll();
    }

    private void initgunModel_1() {
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44
        gunModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 45
        gunModel[2] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 46
        gunModel[3] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 60
        gunModel[4] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 62
        gunModel[5] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 38
        gunModel[6] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 39
        gunModel[7] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 40
        gunModel[8] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 41
        gunModel[9] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 43
        gunModel[10] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 44
        gunModel[11] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 65
        gunModel[12] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 66
        gunModel[13] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 67
        gunModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 68
        gunModel[15] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 132
        gunModel[16] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 271
        gunModel[17] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 272
        gunModel[18] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 273
        gunModel[19] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 274
        gunModel[20] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 275
        gunModel[21] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 276
        gunModel[22] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 277
        gunModel[23] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 278
        gunModel[24] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 279
        gunModel[25] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 280
        gunModel[26] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 281
        gunModel[27] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 282
        gunModel[28] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 283
        gunModel[29] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 284
        gunModel[30] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 285
        gunModel[31] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 310
        gunModel[32] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 311
        gunModel[33] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 312
        gunModel[34] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 313
        gunModel[35] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 314
        gunModel[36] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 506
        gunModel[37] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 508
        gunModel[38] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 509
        gunModel[39] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 510
        gunModel[40] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 656
        gunModel[41] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 657
        gunModel[42] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 658
        gunModel[43] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 665
        gunModel[44] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 666
        gunModel[45] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 667
        gunModel[46] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 668
        gunModel[47] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 669
        gunModel[48] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 670
        gunModel[49] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 671
        gunModel[50] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 672
        gunModel[51] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 673
        gunModel[52] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 674
        gunModel[53] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 675
        gunModel[54] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 676
        gunModel[55] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 677
        gunModel[56] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 678
        gunModel[57] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 679
        gunModel[58] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 680
        gunModel[59] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 681
        gunModel[60] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 682
        gunModel[61] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 370
        gunModel[62] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 371
        gunModel[63] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 372
        gunModel[64] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 373
        gunModel[65] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 377
        gunModel[66] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 378
        gunModel[67] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 379
        gunModel[68] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 383
        gunModel[69] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 384
        gunModel[70] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 385
        gunModel[71] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 386
        gunModel[72] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 387
        gunModel[73] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 388
        gunModel[74] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 389
        gunModel[75] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 390
        gunModel[76] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 391
        gunModel[77] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 392
        gunModel[78] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 393
        gunModel[79] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 394
        gunModel[80] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 395
        gunModel[81] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 396
        gunModel[82] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 397
        gunModel[83] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 403
        gunModel[84] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 404
        gunModel[85] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 405
        gunModel[86] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 406
        gunModel[87] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 407
        gunModel[88] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 408
        gunModel[89] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 409
        gunModel[90] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 410
        gunModel[91] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 411
        gunModel[92] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 412
        gunModel[93] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 413
        gunModel[94] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 414
        gunModel[95] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 415
        gunModel[96] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 416
        gunModel[97] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 417
        gunModel[98] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 418
        gunModel[99] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 419
        gunModel[100] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 420
        gunModel[101] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 421
        gunModel[102] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 422
        gunModel[103] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 423
        gunModel[104] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 424
        gunModel[105] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 425
        gunModel[106] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 426
        gunModel[107] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 427
        gunModel[108] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 428
        gunModel[109] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 429
        gunModel[110] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 430
        gunModel[111] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 431
        gunModel[112] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 432
        gunModel[113] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 433
        gunModel[114] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 434
        gunModel[115] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 435
        gunModel[116] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 436
        gunModel[117] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 437
        gunModel[118] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 438
        gunModel[119] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 439
        gunModel[120] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 440
        gunModel[121] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 441
        gunModel[122] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 442
        gunModel[123] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 443
        gunModel[124] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 444
        gunModel[125] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 445
        gunModel[126] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 446
        gunModel[127] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 447
        gunModel[128] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 448
        gunModel[129] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 449
        gunModel[130] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 450
        gunModel[131] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 451
        gunModel[132] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 452
        gunModel[133] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 453
        gunModel[134] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 454
        gunModel[135] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 455
        gunModel[136] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 456
        gunModel[137] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 457
        gunModel[138] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 458
        gunModel[139] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 459
        gunModel[140] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 460
        gunModel[141] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 461
        gunModel[142] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 237
        gunModel[143] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 238
        gunModel[144] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 239
        gunModel[145] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 240
        gunModel[146] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 241
        gunModel[147] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 242
        gunModel[148] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 243
        gunModel[149] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 244
        gunModel[150] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 245
        gunModel[151] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 246
        gunModel[152] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 247
        gunModel[153] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 248
        gunModel[154] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 249
        gunModel[155] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 250
        gunModel[156] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 251
        gunModel[157] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 252
        gunModel[158] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 253
        gunModel[159] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 254
        gunModel[160] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 255
        gunModel[161] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 256
        gunModel[162] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 257
        gunModel[163] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 258
        gunModel[164] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 259
        gunModel[165] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 260
        gunModel[166] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 261
        gunModel[167] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 262
        gunModel[168] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 264
        gunModel[169] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 265
        gunModel[170] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 266
        gunModel[171] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 267
        gunModel[172] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 268
        gunModel[173] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 269
        gunModel[174] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 270
        gunModel[175] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 271
        gunModel[176] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 272
        gunModel[177] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 273
        gunModel[178] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 274
        gunModel[179] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 602
        gunModel[180] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 603
        gunModel[181] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 604
        gunModel[182] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 605
        gunModel[183] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 606
        gunModel[184] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 607
        gunModel[185] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 608
        gunModel[186] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 609
        gunModel[187] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 610
        gunModel[188] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 611
        gunModel[189] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 612
        gunModel[190] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 613
        gunModel[191] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 614
        gunModel[192] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 615
        gunModel[193] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 616
        gunModel[194] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 617
        gunModel[195] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 618
        gunModel[196] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 619
        gunModel[197] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 620
        gunModel[198] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 621
        gunModel[199] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 622
        gunModel[200] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 623
        gunModel[201] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 624
        gunModel[202] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 625
        gunModel[203] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 626
        gunModel[204] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 627
        gunModel[205] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 629
        gunModel[206] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 630
        gunModel[207] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 631
        gunModel[208] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 632
        gunModel[209] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 633
        gunModel[210] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 634
        gunModel[211] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 635
        gunModel[212] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 636
        gunModel[213] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 637
        gunModel[214] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 638
        gunModel[215] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 639
        gunModel[216] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 640
        gunModel[217] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 641
        gunModel[218] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 642
        gunModel[219] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 643
        gunModel[220] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 644
        gunModel[221] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 645
        gunModel[222] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 646
        gunModel[223] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 274
        gunModel[224] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 275
        gunModel[225] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 276
        gunModel[226] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 277
        gunModel[227] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 278
        gunModel[228] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 279
        gunModel[229] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 280
        gunModel[230] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 281
        gunModel[231] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 282
        gunModel[232] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 283
        gunModel[233] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 284
        gunModel[234] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 285
        gunModel[235] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 286
        gunModel[236] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 287
        gunModel[237] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 288
        gunModel[238] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 289
        gunModel[239] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 290
        gunModel[240] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 291
        gunModel[241] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 292
        gunModel[242] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 293
        gunModel[243] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 294
        gunModel[244] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 295
        gunModel[245] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 296
        gunModel[246] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 297
        gunModel[247] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 298
        gunModel[248] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 301
        gunModel[249] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 302
        gunModel[250] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 303
        gunModel[251] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 304
        gunModel[252] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 305
        gunModel[253] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 306
        gunModel[254] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 329
        gunModel[255] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 330
        gunModel[256] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 331
        gunModel[257] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 332
        gunModel[258] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 335
        gunModel[259] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 336
        gunModel[260] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 337
        gunModel[261] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 338
        gunModel[262] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 339
        gunModel[263] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 340
        gunModel[264] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 341
        gunModel[265] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 342
        gunModel[266] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 343
        gunModel[267] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 344
        gunModel[268] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 345
        gunModel[269] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 346
        gunModel[270] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 347
        gunModel[271] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 348
        gunModel[272] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 349
        gunModel[273] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 350
        gunModel[274] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 351
        gunModel[275] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 352
        gunModel[276] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 353
        gunModel[277] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 354
        gunModel[278] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 355
        gunModel[279] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 356
        gunModel[280] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 357
        gunModel[281] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 358
        gunModel[282] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 359
        gunModel[283] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 360
        gunModel[284] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 361
        gunModel[285] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 362
        gunModel[286] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 363
        gunModel[287] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 364
        gunModel[288] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 365
        gunModel[289] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 366
        gunModel[290] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 367
        gunModel[291] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 368
        gunModel[292] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 369
        gunModel[293] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 370
        gunModel[294] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 371
        gunModel[295] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 372
        gunModel[296] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 373
        gunModel[297] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 374
        gunModel[298] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 375
        gunModel[299] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 376
        gunModel[300] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 377
        gunModel[301] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 378
        gunModel[302] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 379
        gunModel[303] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 380
        gunModel[304] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 381
        gunModel[305] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 382
        gunModel[306] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 383
        gunModel[307] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 384
        gunModel[308] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 385
        gunModel[309] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 386
        gunModel[310] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 387
        gunModel[311] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 388
        gunModel[312] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 389
        gunModel[313] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 390
        gunModel[314] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 391
        gunModel[315] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 392
        gunModel[316] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 393
        gunModel[317] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 394
        gunModel[318] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 395
        gunModel[319] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 396
        gunModel[320] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 397
        gunModel[321] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 398
        gunModel[322] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 399
        gunModel[323] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 400
        gunModel[324] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 401
        gunModel[325] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 402
        gunModel[326] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 403
        gunModel[327] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 404
        gunModel[328] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 405
        gunModel[329] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 406
        gunModel[330] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 407
        gunModel[331] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 408
        gunModel[332] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 409
        gunModel[333] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 410
        gunModel[334] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 411
        gunModel[335] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 412
        gunModel[336] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 413
        gunModel[337] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 414
        gunModel[338] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 415
        gunModel[339] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 419
        gunModel[340] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 420
        gunModel[341] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 426
        gunModel[342] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 427
        gunModel[343] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 428
        gunModel[344] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 429
        gunModel[345] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 430
        gunModel[346] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 431
        gunModel[347] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 432
        gunModel[348] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 433
        gunModel[349] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 434
        gunModel[350] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 435
        gunModel[351] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 436
        gunModel[352] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 437
        gunModel[353] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 438
        gunModel[354] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 439
        gunModel[355] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 440
        gunModel[356] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 441
        gunModel[357] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 442
        gunModel[358] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 443
        gunModel[359] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 444
        gunModel[360] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 445
        gunModel[361] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 446
        gunModel[362] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 447
        gunModel[363] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 448
        gunModel[364] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 449
        gunModel[365] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 450
        gunModel[366] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 451
        gunModel[367] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 452
        gunModel[368] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 453
        gunModel[369] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 454
        gunModel[370] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 455
        gunModel[371] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 456
        gunModel[372] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 457
        gunModel[373] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 458
        gunModel[374] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 459
        gunModel[375] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 460
        gunModel[376] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 461
        gunModel[377] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 462
        gunModel[378] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 463
        gunModel[379] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 464
        gunModel[380] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 465
        gunModel[381] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 466
        gunModel[382] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 467
        gunModel[383] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 468
        gunModel[384] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 469
        gunModel[385] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 470
        gunModel[386] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 471
        gunModel[387] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 472
        gunModel[388] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 473
        gunModel[389] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 474
        gunModel[390] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 475
        gunModel[391] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 476
        gunModel[392] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 477
        gunModel[393] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 478
        gunModel[394] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Box 479
        gunModel[395] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 480
        gunModel[396] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 481
        gunModel[397] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 482
        gunModel[398] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 483
        gunModel[399] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 484
        gunModel[400] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 485
        gunModel[401] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 486
        gunModel[402] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 487
        gunModel[403] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 488
        gunModel[404] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 489
        gunModel[405] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 490
        gunModel[406] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 491
        gunModel[407] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 492
        gunModel[408] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 493
        gunModel[409] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 494
        gunModel[410] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 495
        gunModel[411] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 496
        gunModel[412] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 497
        gunModel[413] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 498
        gunModel[414] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 499
        gunModel[415] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 500
        gunModel[416] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 501
        gunModel[417] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 502
        gunModel[418] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 503
        gunModel[419] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 504
        gunModel[420] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 505
        gunModel[421] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 506
        gunModel[422] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 507
        gunModel[423] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 508
        gunModel[424] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 509
        gunModel[425] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 510
        gunModel[426] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 511
        gunModel[427] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 512
        gunModel[428] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 513
        gunModel[429] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 514
        gunModel[430] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 515
        gunModel[431] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 516
        gunModel[432] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 517
        gunModel[433] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 518
        gunModel[434] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 519
        gunModel[435] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 520
        gunModel[436] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 525
        gunModel[437] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 527
        gunModel[438] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 529
        gunModel[439] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 531
        gunModel[440] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 532
        gunModel[441] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 533
        gunModel[442] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 534
        gunModel[443] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 535
        gunModel[444] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 536
        gunModel[445] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 537
        gunModel[446] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 538
        gunModel[447] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 539
        gunModel[448] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 540
        gunModel[449] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 541
        gunModel[450] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 542
        gunModel[451] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 543
        gunModel[452] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 544
        gunModel[453] = new ModelRendererTurbo(this, 9, 121, textureX, textureY); // Box 546
        gunModel[454] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 547
        gunModel[455] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 548
        gunModel[456] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 549
        gunModel[457] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 550
        gunModel[458] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 551
        gunModel[459] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 552
        gunModel[460] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 553
        gunModel[461] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 554
        gunModel[462] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 555
        gunModel[463] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 521
        gunModel[464] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 522
        gunModel[465] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 523
        gunModel[466] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 524
        gunModel[467] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 525
        gunModel[468] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 526
        gunModel[469] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 527
        gunModel[470] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 534
        gunModel[471] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 535
        gunModel[472] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Box 536
        gunModel[473] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 537
        gunModel[474] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 540
        gunModel[475] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 541
        gunModel[476] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 542
        gunModel[477] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 543
        gunModel[478] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 544
        gunModel[479] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 547
        gunModel[480] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 548
        gunModel[481] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 549
        gunModel[482] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 550
        gunModel[483] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 551
        gunModel[484] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 552
        gunModel[485] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 553
        gunModel[486] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 554
        gunModel[487] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 555
        gunModel[488] = new ModelRendererTurbo(this, 337, 137, textureX, textureY); // Box 556
        gunModel[489] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Box 557
        gunModel[490] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Box 559
        gunModel[491] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 560
        gunModel[492] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 561
        gunModel[493] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 562
        gunModel[494] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 563
        gunModel[495] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 564
        gunModel[496] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 565
        gunModel[497] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 566
        gunModel[498] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 567
        gunModel[499] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Box 568

        gunModel[0].addShapeBox(0F, 0F, 0F, 48, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 44
        gunModel[0].setRotationPoint(-11F, -19.5F, -3F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 48, 1, 6, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -2.5F, -0.25F, 0F, -2.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 45
        gunModel[1].setRotationPoint(-11F, -16.5F, -3F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 48, 1, 1, 0F, 0F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 46
        gunModel[2].setRotationPoint(-11F, -25.5F, 2F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F); // Box 60
        gunModel[3].setRotationPoint(37F, -24.5F, -3F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.625F, -0.625F, -0.5F, -0.625F, -0.625F, -0.5F, 0F, -0.5F, -0.25F); // Box 62
        gunModel[4].setRotationPoint(37F, -18.5F, -3F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 38
        gunModel[5].setRotationPoint(25F, -26F, 1.5F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 39
        gunModel[6].setRotationPoint(34.5F, -25.5F, -2.5F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, -0.25F, 0.25F, -0.375F, -0.25F, 0.25F, -0.375F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 40
        gunModel[7].setRotationPoint(33.5F, -28F, -2.5F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 41
        gunModel[8].setRotationPoint(34.5F, -26F, -2.5F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 43
        gunModel[9].setRotationPoint(33.5F, -28F, -2.5F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 44
        gunModel[10].setRotationPoint(35F, -28F, -2.5F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F); // Box 65
        gunModel[11].setRotationPoint(35F, -26.5F, -2F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F); // Box 66
        gunModel[12].setRotationPoint(35F, -27F, -2F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F); // Box 67
        gunModel[13].setRotationPoint(35F, -26F, -2F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, 0.25F, -0.375F, 0F, 0.25F, -0.375F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.25F, -0.375F, 0F, 0.25F, -0.375F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 68
        gunModel[14].setRotationPoint(33.5F, -31.75F, -2.5F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 48, 5, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
        gunModel[15].setRotationPoint(-11F, -24.5F, 2F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 271
        gunModel[16].setRotationPoint(2.75F, -17F, -2F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0.5F, 0F); // Box 272
        gunModel[17].setRotationPoint(2.75F, -11F, -2F);

        gunModel[18].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 273
        gunModel[18].setRotationPoint(3.75F, -10F, -2F);

        gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -1F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F); // Box 274
        gunModel[19].setRotationPoint(11.25F, -11F, -2F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F); // Box 275
        gunModel[20].setRotationPoint(12.25F, -17F, -2F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 276
        gunModel[21].setRotationPoint(12.75F, -18.5F, -2F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 277
        gunModel[22].setRotationPoint(12.75F, -16.5F, -1.5F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F); // Box 278
        gunModel[23].setRotationPoint(13.75F, -13.5F, -1.5F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 279
        gunModel[24].setRotationPoint(12.75F, -13.5F, -1.5F);

        gunModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 1F, 0F, -0.125F, 0.375F, 0F, -0.125F, 0.375F, 0F, -0.125F, 1F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F); // Box 280
        gunModel[25].setRotationPoint(14.75F, -13.5F, -1.5F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F); // Box 281
        gunModel[26].setRotationPoint(14.75F, -11.5F, -1.5F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 282
        gunModel[27].setRotationPoint(14.75F, -9.5F, -1.5F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0.25F, -0.25F, 0.375F, 0.25F, -0.25F, 0.375F, 0.25F, -0.25F, 0.375F, 0.25F, -0.25F, 0.375F, 0.25F, -0.25F, 0.375F, 0.25F, -0.25F, 0.375F, 0.25F, -0.25F, 0.375F, 0.25F, -0.25F, 0.375F); // Box 283
        gunModel[28].setRotationPoint(14F, -13.25F, -1.5F);

        gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0.25F, 0F, 0.375F, 0.25F, 0F, 0.375F, 0.25F, 0F, 0.375F, 0.25F, 0F, 0.375F, -0.25F, -0.5F, 0.375F, -0.25F, -0.5F, 0.375F, -0.25F, -0.5F, 0.375F, -0.25F, -0.5F, 0.375F); // Box 284
        gunModel[29].setRotationPoint(14F, -12.5F, -1.5F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, -0.5F, 0.375F, -0.25F, -0.5F, 0.375F, -0.25F, -0.5F, 0.375F, -0.25F, -0.5F, 0.375F, 0.25F, 0F, 0.375F, 0.25F, 0F, 0.375F, 0.25F, 0F, 0.375F, 0.25F, 0F, 0.375F); // Box 285
        gunModel[30].setRotationPoint(14F, -14F, -1.5F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
        gunModel[31].setRotationPoint(3.75F, -17F, -0.5F);

        gunModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.75F, 0F, 0F); // Box 311
        gunModel[32].setRotationPoint(3.75F, -16F, -0.5F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 312
        gunModel[33].setRotationPoint(4.5F, -15F, -0.5F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0.5F, 0F); // Box 313
        gunModel[34].setRotationPoint(4.5F, -13.5F, -0.5F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 314
        gunModel[35].setRotationPoint(5.5F, -12.5F, -0.5F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 506
        gunModel[36].setRotationPoint(24F, -26F, 1.5F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 48, 1, 1, 0F, 0F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 508
        gunModel[37].setRotationPoint(-11F, -25.5F, -3F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 48, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 509
        gunModel[38].setRotationPoint(-11F, -24.5F, -3F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
        gunModel[39].setRotationPoint(-11F, -24.5F, -2.5F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F); // Box 656
        gunModel[40].setRotationPoint(26F, -20.5F, -3F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F); // Box 657
        gunModel[41].setRotationPoint(26F, -21F, -3F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F); // Box 658
        gunModel[42].setRotationPoint(26F, -21.5F, -3F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F); // Box 665
        gunModel[43].setRotationPoint(15F, -21.5F, -3F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F); // Box 666
        gunModel[44].setRotationPoint(15F, -22F, -3F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F); // Box 667
        gunModel[45].setRotationPoint(15F, -22.5F, -3F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F); // Box 668
        gunModel[46].setRotationPoint(15F, -20F, -3F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F); // Box 669
        gunModel[47].setRotationPoint(15F, -20.5F, -3F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F); // Box 670
        gunModel[48].setRotationPoint(15F, -19.5F, -3F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F); // Box 671
        gunModel[49].setRotationPoint(12F, -20F, -3F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F); // Box 672
        gunModel[50].setRotationPoint(12F, -20.5F, -3F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F); // Box 673
        gunModel[51].setRotationPoint(12F, -21F, -3F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F); // Box 674
        gunModel[52].setRotationPoint(6F, -19F, -3F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F); // Box 675
        gunModel[53].setRotationPoint(6F, -19.5F, -3F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F); // Box 676
        gunModel[54].setRotationPoint(6F, -20F, -3F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F); // Box 677
        gunModel[55].setRotationPoint(-1F, -23.5F, -3F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F); // Box 678
        gunModel[56].setRotationPoint(-1F, -23F, -3F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F); // Box 679
        gunModel[57].setRotationPoint(-1F, -24F, -3F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F); // Box 680
        gunModel[58].setRotationPoint(-4F, -22F, 2F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, -0.25F, -0.5F, -0.625F, -0.25F, -0.5F, -0.625F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F); // Box 681
        gunModel[59].setRotationPoint(-4F, -21.5F, 2F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.625F, -0.25F, -0.5F, -0.625F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F); // Box 682
        gunModel[60].setRotationPoint(-4F, -22.5F, 2F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 370
        gunModel[61].setRotationPoint(22.5F, -24.5F, 2.75F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, -1F, -1F, -0.5F); // Box 371
        gunModel[62].setRotationPoint(21.5F, -24.5F, 2.75F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
        gunModel[63].setRotationPoint(22.5F, -24.5F, -3.75F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 373
        gunModel[64].setRotationPoint(21.5F, -24.5F, -3.75F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 377
        gunModel[65].setRotationPoint(-8F, -24.25F, -2.5F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 378
        gunModel[66].setRotationPoint(-8F, -23.75F, -1.5F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 379
        gunModel[67].setRotationPoint(-8F, -24.25F, 1.5F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F); // Box 383
        gunModel[68].setRotationPoint(-9.5F, -24F, 2F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, -0.25F, -0.5F, -0.625F, -0.25F, -0.5F, -0.625F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F); // Box 384
        gunModel[69].setRotationPoint(-9.5F, -23.5F, 2F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.625F, -0.25F, -0.5F, -0.625F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F); // Box 385
        gunModel[70].setRotationPoint(-9.5F, -24.5F, 2F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Box 386
        gunModel[71].setRotationPoint(33.5F, -26F, -2.5F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F, -0.375F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.375F, 0F, -0.25F); // Box 387
        gunModel[72].setRotationPoint(33.75F, -29.75F, -2.5F);

        gunModel[73].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
        gunModel[73].setRotationPoint(37.75F, -28.5F, -2F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
        gunModel[74].setRotationPoint(37.75F, -29.5F, -2F);

        gunModel[75].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
        gunModel[75].setRotationPoint(37.75F, -30.5F, -1.5F);

        gunModel[76].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 391
        gunModel[76].setRotationPoint(37.75F, -26.5F, -1.5F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 392
        gunModel[77].setRotationPoint(37.75F, -27.5F, -2F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 393
        gunModel[78].setRotationPoint(76.75F, -26.5F, -1.5F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 394
        gunModel[79].setRotationPoint(76.75F, -27.5F, -2F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
        gunModel[80].setRotationPoint(76.75F, -28.5F, -2F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
        gunModel[81].setRotationPoint(76.75F, -29.5F, -2F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
        gunModel[82].setRotationPoint(76.75F, -30.5F, -1.5F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
        gunModel[83].setRotationPoint(82.75F, -25.5F, -1.5F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
        gunModel[84].setRotationPoint(82.75F, -24.5F, -2F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
        gunModel[85].setRotationPoint(82.75F, -23.5F, -2F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 406
        gunModel[86].setRotationPoint(82.75F, -22.5F, -2F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 407
        gunModel[87].setRotationPoint(82.75F, -21.5F, -1.5F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 49, 1, 3, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F); // Box 408
        gunModel[88].setRotationPoint(45.75F, -25.5F, -1.5F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 49, 1, 4, 0F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 409
        gunModel[89].setRotationPoint(45.75F, -24.5F, -2F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 49, 1, 4, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 410
        gunModel[90].setRotationPoint(45.75F, -23.5F, -2F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 49, 1, 3, 0F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, -1F); // Box 411
        gunModel[91].setRotationPoint(45.75F, -21.5F, -1.5F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 49, 1, 4, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F); // Box 412
        gunModel[92].setRotationPoint(45.75F, -22.5F, -2F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
        gunModel[93].setRotationPoint(37.75F, -23.5F, -2F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
        gunModel[94].setRotationPoint(37.75F, -25.5F, -1.5F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
        gunModel[95].setRotationPoint(37.75F, -24.5F, -2F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 416
        gunModel[96].setRotationPoint(37.75F, -20.5F, -2F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 417
        gunModel[97].setRotationPoint(42.75F, -20.5F, -2F);

        gunModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 418
        gunModel[98].setRotationPoint(42.75F, -19.5F, -2F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 419
        gunModel[99].setRotationPoint(42.75F, -20F, -2F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 420
        gunModel[100].setRotationPoint(44.75F, -20F, -2F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 421
        gunModel[101].setRotationPoint(44.75F, -19.5F, -2F);

        gunModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 422
        gunModel[102].setRotationPoint(44.75F, -20.5F, -2F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Box 423
        gunModel[103].setRotationPoint(43.25F, -18.5F, -2F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 32, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
        gunModel[104].setRotationPoint(44.75F, -28.5F, -2F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 32, 1, 4, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 425
        gunModel[105].setRotationPoint(44.75F, -29.5F, -2F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 32, 1, 3, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
        gunModel[106].setRotationPoint(44.75F, -30.5F, -1.5F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 32, 1, 4, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
        gunModel[107].setRotationPoint(44.75F, -29.5F, -2F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 32, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 428
        gunModel[108].setRotationPoint(44.75F, -29.5F, -1.5F);

        gunModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, -0.75F, -0.125F, -0.5F, -0.75F, -0.125F, -0.5F, -0.75F, -0.125F, -0.25F, -0.75F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 429
        gunModel[109].setRotationPoint(44.25F, -29.5F, -2F);

        gunModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.25F, 0F, 0.125F); // Box 430
        gunModel[110].setRotationPoint(44.25F, -30.25F, -1.5F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.125F); // Box 431
        gunModel[111].setRotationPoint(44.75F, -30.25F, -1.5F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -0.375F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.125F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.125F); // Box 432
        gunModel[112].setRotationPoint(44.75F, -29.5F, -2F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.75F, -0.125F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 433
        gunModel[113].setRotationPoint(44.75F, -29.5F, -2F);

        gunModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.125F, 0F, -0.75F, -0.125F, -0.5F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 434
        gunModel[114].setRotationPoint(75.75F, -29.5F, -2F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, -0.5F, -0.25F, -0.5F); // Box 435
        gunModel[115].setRotationPoint(75.75F, -29.5F, -2F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.5F, 0F, 0F); // Box 436
        gunModel[116].setRotationPoint(75.75F, -30.25F, -1.5F);

        gunModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.5F, 0F, 0.125F); // Box 437
        gunModel[117].setRotationPoint(76.25F, -30.25F, -1.5F);

        gunModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, -0.75F, -0.125F, -0.25F, -0.75F, -0.125F, -0.25F, -0.75F, -0.125F, -0.5F, -0.75F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 438
        gunModel[118].setRotationPoint(76.25F, -29.5F, -2F);

        gunModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.125F, 0F, -0.75F, -0.125F, -0.5F, -0.75F, -0.5F); // Box 439
        gunModel[119].setRotationPoint(75.75F, -27.5F, -2F);

        gunModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, -0.5F, -0.25F, -0.5F); // Box 440
        gunModel[120].setRotationPoint(75.75F, -27.5F, -2F);

        gunModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.5F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Box 441
        gunModel[121].setRotationPoint(75.75F, -28.25F, -1.5F);

        gunModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Box 442
        gunModel[122].setRotationPoint(76.25F, -28.25F, -1.5F);

        gunModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.125F, -0.25F, -0.75F, -0.125F, -0.25F, -0.75F, -0.125F, -0.5F, -0.75F, -0.125F); // Box 443
        gunModel[123].setRotationPoint(76.25F, -27.5F, -2F);

        gunModel[124].addShapeBox(0F, 0F, 0F, 32, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 444
        gunModel[124].setRotationPoint(44.75F, -27.5F, -2F);

        gunModel[125].addShapeBox(0F, 0F, 0F, 32, 1, 4, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 445
        gunModel[125].setRotationPoint(44.75F, -27.5F, -2F);

        gunModel[126].addShapeBox(0F, 0F, 0F, 32, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
        gunModel[126].setRotationPoint(44.75F, -27.5F, -1.5F);

        gunModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, -0.125F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.125F); // Box 447
        gunModel[127].setRotationPoint(44.75F, -27.5F, -2F);

        gunModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -0.125F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.375F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.375F); // Box 448
        gunModel[128].setRotationPoint(44.75F, -27.5F, -2F);

        gunModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Box 449
        gunModel[129].setRotationPoint(44.25F, -28.25F, -1.5F);

        gunModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.125F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Box 450
        gunModel[130].setRotationPoint(44.75F, -28.25F, -1.5F);

        gunModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.125F, -0.5F, -0.75F, -0.125F, -0.5F, -0.75F, -0.125F, -0.25F, -0.75F, -0.125F); // Box 451
        gunModel[131].setRotationPoint(44.25F, -27.5F, -2F);

        gunModel[132].addShapeBox(0F, 0F, 0F, 32, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 452
        gunModel[132].setRotationPoint(44.75F, -26.5F, -1.5F);

        gunModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Box 453
        gunModel[133].setRotationPoint(44.25F, -26.75F, -1.5F);

        gunModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.5F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Box 454
        gunModel[134].setRotationPoint(75.75F, -26.75F, -1.5F);

        gunModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Box 455
        gunModel[135].setRotationPoint(76.25F, -26.75F, -1.5F);

        gunModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.125F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Box 456
        gunModel[136].setRotationPoint(44.75F, -26.75F, -1.5F);

        gunModel[137].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F); // Box 457
        gunModel[137].setRotationPoint(94.75F, -23.5F, -2F);

        gunModel[138].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F); // Box 458
        gunModel[138].setRotationPoint(94.75F, -24.5F, -2F);

        gunModel[139].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, -0.875F, -1F, 0F, -0.875F, -1F, 0F, -0.875F, -1F, 0F, -0.875F, -1F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 459
        gunModel[139].setRotationPoint(94.75F, -25.5F, -1.5F);

        gunModel[140].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.875F, -1F, 0F, -0.875F, -1F, 0F, -0.875F, -1F, 0F, -0.875F, -1F); // Box 460
        gunModel[140].setRotationPoint(94.75F, -21.5F, -1.5F);

        gunModel[141].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 461
        gunModel[141].setRotationPoint(94.75F, -22.5F, -2F);

        gunModel[142].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 237
        gunModel[142].setRotationPoint(34.25F, -31.75F, -2.5F);

        gunModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 238
        gunModel[143].setRotationPoint(36.25F, -30.75F, -2.5F);

        gunModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0.125F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.125F, 0F, -0.25F); // Box 239
        gunModel[144].setRotationPoint(34.25F, -30.75F, -2.5F);

        gunModel[145].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.125F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.25F, 0.125F, 0F, -0.25F); // Box 240
        gunModel[145].setRotationPoint(34.25F, -31.75F, -2.5F);

        gunModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 241
        gunModel[146].setRotationPoint(35.25F, -31.25F, -2.5F);

        gunModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 242
        gunModel[147].setRotationPoint(35.25F, -31.75F, -2.5F);

        gunModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 243
        gunModel[148].setRotationPoint(35.25F, -30.75F, -2.5F);

        gunModel[149].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 244
        gunModel[149].setRotationPoint(33.5F, -31.75F, 1.5F);

        gunModel[150].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 245
        gunModel[150].setRotationPoint(34.25F, -31.75F, 1.5F);

        gunModel[151].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.125F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0.125F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.5F, 0.125F, 0F, -0.5F); // Box 246
        gunModel[151].setRotationPoint(34.25F, -31.75F, 1.5F);

        gunModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Box 247
        gunModel[152].setRotationPoint(36.25F, -31.75F, -2F);

        gunModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, 0F, 0F, -0.75F); // Box 248
        gunModel[153].setRotationPoint(-10F, -21F, 3F);

        gunModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.75F, 0F, 0F, -0.75F); // Box 249
        gunModel[154].setRotationPoint(-10F, -22F, 3F);

        gunModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 250
        gunModel[155].setRotationPoint(-9.5F, -22F, 3F);

        gunModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.25F, -1F, -0.75F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0.25F, -0.75F); // Box 251
        gunModel[156].setRotationPoint(-9F, -22F, 3F);

        gunModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.25F, -0.75F); // Box 252
        gunModel[157].setRotationPoint(-9F, -21F, 3F);

        gunModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0.25F, -0.75F, -0.25F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.25F, -1F, -0.75F); // Box 253
        gunModel[158].setRotationPoint(-9F, -20F, 3F);

        gunModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 254
        gunModel[159].setRotationPoint(-9.5F, -20F, 3F);

        gunModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, -0.75F, -0.5F, -0.5F, -0.75F); // Box 255
        gunModel[160].setRotationPoint(-10F, -20F, 3F);

        gunModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F); // Box 256
        gunModel[161].setRotationPoint(-9.5F, -21F, 3F);

        gunModel[162].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 257
        gunModel[162].setRotationPoint(-8F, -16.5F, -1F);

        gunModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
        gunModel[163].setRotationPoint(-12.5F, -24.5F, 2F);

        gunModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 259
        gunModel[164].setRotationPoint(-11.5F, -24.5F, 2F);

        gunModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 260
        gunModel[165].setRotationPoint(-13.5F, -24.5F, 2F);

        gunModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 261
        gunModel[166].setRotationPoint(-13.5F, -21.5F, 2F);

        gunModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F); // Box 262
        gunModel[167].setRotationPoint(-12.5F, -21.5F, 2F);

        gunModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, 0.25F); // Box 264
        gunModel[168].setRotationPoint(-11.5F, -21.5F, 2F);

        gunModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 265
        gunModel[169].setRotationPoint(-11.5F, -17.5F, 2F);

        gunModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
        gunModel[170].setRotationPoint(-12.5F, -17.5F, 2F);

        gunModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 267
        gunModel[171].setRotationPoint(-13.5F, -17.5F, 2F);

        gunModel[172].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 268
        gunModel[172].setRotationPoint(-12.5F, -23.5F, 2.5F);

        gunModel[173].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F); // Box 269
        gunModel[173].setRotationPoint(-12F, -23.5F, 2.5F);

        gunModel[174].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F); // Box 270
        gunModel[174].setRotationPoint(-13F, -23.5F, 2.5F);

        gunModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F); // Box 271
        gunModel[175].setRotationPoint(-8.5F, -18F, 2F);

        gunModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.625F, -0.25F, -0.5F, -0.625F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F); // Box 272
        gunModel[176].setRotationPoint(-8.5F, -18.5F, 2F);

        gunModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, -0.25F, -0.5F, -0.625F, -0.25F, -0.5F, -0.625F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F); // Box 273
        gunModel[177].setRotationPoint(-8.5F, -17.5F, 2F);

        gunModel[178].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 274
        gunModel[178].setRotationPoint(-10F, -25F, -2.5F);

        gunModel[179].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
        gunModel[179].setRotationPoint(82.75F, -26.5F, -1.5F);

        gunModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 603
        gunModel[180].setRotationPoint(89.75F, -28.5F, -0.5F);

        gunModel[181].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
        gunModel[181].setRotationPoint(88.75F, -30.5F, -0.5F);

        gunModel[182].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 605
        gunModel[182].setRotationPoint(88.75F, -26.5F, -0.5F);

        gunModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 606
        gunModel[183].setRotationPoint(89.75F, -28.5F, -0.5F);

        gunModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 607
        gunModel[184].setRotationPoint(89.75F, -27.5F, -0.5F);

        gunModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 608
        gunModel[185].setRotationPoint(88.25F, -27.5F, -0.5F);

        gunModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 609
        gunModel[186].setRotationPoint(88.25F, -28.5F, -0.5F);

        gunModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 610
        gunModel[187].setRotationPoint(88.75F, -23.5F, -4F);

        gunModel[188].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 611
        gunModel[188].setRotationPoint(88.75F, -22.5F, -4F);

        gunModel[189].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 612
        gunModel[189].setRotationPoint(82.75F, -21.5F, -1.5F);

        gunModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 613
        gunModel[190].setRotationPoint(88.75F, -26.5F, 0.5F);

        gunModel[191].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 614
        gunModel[191].setRotationPoint(88.75F, -26F, 2F);

        gunModel[192].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 615
        gunModel[192].setRotationPoint(88.75F, -26F, -2F);

        gunModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 616
        gunModel[193].setRotationPoint(88.75F, -23F, 1.5F);

        gunModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 617
        gunModel[194].setRotationPoint(88.75F, -26.5F, -2.5F);

        gunModel[195].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 618
        gunModel[195].setRotationPoint(88.75F, -26F, -3F);

        gunModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 619
        gunModel[196].setRotationPoint(88.75F, -23F, -3.5F);

        gunModel[197].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
        gunModel[197].setRotationPoint(84.75F, -31F, -2F);

        gunModel[198].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 621
        gunModel[198].setRotationPoint(84.75F, -30F, -2F);

        gunModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 622
        gunModel[199].setRotationPoint(84.75F, -31.5F, -2F);

        gunModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 623
        gunModel[200].setRotationPoint(87.75F, -31.5F, -2F);

        gunModel[201].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 624
        gunModel[201].setRotationPoint(85.25F, -31.5F, -2F);

        gunModel[202].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.375F, 0F, 0F, -0.375F); // Box 625
        gunModel[202].setRotationPoint(85.25F, -32.5F, -2F);

        gunModel[203].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F); // Box 626
        gunModel[203].setRotationPoint(85.25F, -34F, -2F);

        gunModel[204].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 627
        gunModel[204].setRotationPoint(85.25F, -33F, -2F);

        gunModel[205].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F); // Box 629
        gunModel[205].setRotationPoint(85.25F, -35F, -2F);

        gunModel[206].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 630
        gunModel[206].setRotationPoint(85.25F, -32F, -1.5F);

        gunModel[207].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 631
        gunModel[207].setRotationPoint(85.25F, -32F, -0.5F);

        gunModel[208].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 632
        gunModel[208].setRotationPoint(85.25F, -34F, 1F);

        gunModel[209].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 633
        gunModel[209].setRotationPoint(85.25F, -33F, 1F);

        gunModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 634
        gunModel[210].setRotationPoint(85.25F, -36F, 0.5F);

        gunModel[211].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 635
        gunModel[211].setRotationPoint(85.25F, -35F, 1F);

        gunModel[212].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 636
        gunModel[212].setRotationPoint(85.25F, -32F, 0.5F);

        gunModel[213].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 637
        gunModel[213].setRotationPoint(85.25F, -32.5F, 0F);

        gunModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 638
        gunModel[214].setRotationPoint(85.25F, -36F, -0.5F);

        gunModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 639
        gunModel[215].setRotationPoint(87.25F, -36F, -0.5F);

        gunModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 640
        gunModel[216].setRotationPoint(86.25F, -33F, -0.5F);

        gunModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.5F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F); // Box 641
        gunModel[217].setRotationPoint(86.25F, -34F, -0.5F);

        gunModel[218].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -1.125F, -0.25F, 0F, -1.125F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 642
        gunModel[218].setRotationPoint(85.75F, -36F, 0.5F);

        gunModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 643
        gunModel[219].setRotationPoint(87.25F, -36F, 0.5F);

        gunModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 644
        gunModel[220].setRotationPoint(85.25F, -36F, -1.5F);

        gunModel[221].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -1.125F, -0.25F, 0F, -1.125F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 645
        gunModel[221].setRotationPoint(85.75F, -36F, -1.5F);

        gunModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, -0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F); // Box 646
        gunModel[222].setRotationPoint(87.25F, -36F, -1.5F);

        gunModel[223].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 274
        gunModel[223].setRotationPoint(38F, -24F, -3.5F);

        gunModel[224].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F); // Box 275
        gunModel[224].setRotationPoint(44F, -24F, -3.5F);

        gunModel[225].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F); // Box 276
        gunModel[225].setRotationPoint(50F, -22F, -3.5F);

        gunModel[226].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
        gunModel[226].setRotationPoint(52F, -24F, -4.5F);

        gunModel[227].addShapeBox(0F, 0F, 0F, 19, 1, 9, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
        gunModel[227].setRotationPoint(52F, -22F, -4.5F);

        gunModel[228].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 279
        gunModel[228].setRotationPoint(50F, -24F, -3.5F);

        gunModel[229].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 280
        gunModel[229].setRotationPoint(38F, -25F, 2.5F);

        gunModel[230].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
        gunModel[230].setRotationPoint(55F, -25F, 2.5F);

        gunModel[231].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
        gunModel[231].setRotationPoint(73F, -25F, 2.5F);

        gunModel[232].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F); // Box 283
        gunModel[232].setRotationPoint(71F, -22F, -3.5F);

        gunModel[233].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 284
        gunModel[233].setRotationPoint(71F, -24F, -3.5F);

        gunModel[234].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 285
        gunModel[234].setRotationPoint(73F, -24F, -3.5F);

        gunModel[235].addShapeBox(0F, 0F, 0F, 19, 2, 8, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
        gunModel[235].setRotationPoint(52F, -23.5F, -4F);

        gunModel[236].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 287
        gunModel[236].setRotationPoint(50F, -23.5F, -3F);

        gunModel[237].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 288
        gunModel[237].setRotationPoint(71F, -23.5F, -3F);

        gunModel[238].addShapeBox(0F, 0F, 0F, 19, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 289
        gunModel[238].setRotationPoint(52F, -21F, -4.5F);

        gunModel[239].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, -1F); // Box 290
        gunModel[239].setRotationPoint(50F, -21F, -3.5F);

        gunModel[240].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1.5F, -1F); // Box 291
        gunModel[240].setRotationPoint(44F, -20.5F, -3.5F);

        gunModel[241].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 292
        gunModel[241].setRotationPoint(38F, -18F, -3.5F);

        gunModel[242].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 293
        gunModel[242].setRotationPoint(71F, -21F, -3.5F);

        gunModel[243].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 294
        gunModel[243].setRotationPoint(73F, -20.5F, -3.5F);

        gunModel[244].addShapeBox(0F, 0F, 0F, 28, 1, 4, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
        gunModel[244].setRotationPoint(50F, -19.5F, -2F);

        gunModel[245].addShapeBox(0F, 0F, 0F, 30, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 296
        gunModel[245].setRotationPoint(48F, -18.5F, -2F);

        gunModel[246].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
        gunModel[246].setRotationPoint(46F, -18.5F, -2F);

        gunModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
        gunModel[247].setRotationPoint(50F, -18.5F, -2F);

        gunModel[248].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 301
        gunModel[248].setRotationPoint(52F, -25F, -3.5F);

        gunModel[249].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.99F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 302
        gunModel[249].setRotationPoint(50F, -25F, -3.5F);

        gunModel[250].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -1F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, -1F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 303
        gunModel[250].setRotationPoint(71F, -25F, -3.5F);

        gunModel[251].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 304
        gunModel[251].setRotationPoint(38F, -26.5F, -3F);

        gunModel[252].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
        gunModel[252].setRotationPoint(37.5F, -28F, -3F);

        gunModel[253].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
        gunModel[253].setRotationPoint(37.5F, -30.5F, -3F);

        gunModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 329
        gunModel[254].setRotationPoint(45.5F, -30.5F, -3F);

        gunModel[255].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 330
        gunModel[255].setRotationPoint(45.5F, -28F, -3F);

        gunModel[256].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 331
        gunModel[256].setRotationPoint(47F, -28F, -3F);

        gunModel[257].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 332
        gunModel[257].setRotationPoint(47F, -30.5F, -3F);

        gunModel[258].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 335
        gunModel[258].setRotationPoint(50F, -28F, -3F);

        gunModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 336
        gunModel[259].setRotationPoint(50F, -30.5F, -3F);

        gunModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 337
        gunModel[260].setRotationPoint(48.5F, -28F, -3F);

        gunModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 338
        gunModel[261].setRotationPoint(48.5F, -30.5F, -3F);

        gunModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 339
        gunModel[262].setRotationPoint(53F, -28F, -3F);

        gunModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 340
        gunModel[263].setRotationPoint(53F, -30.5F, -3F);

        gunModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 341
        gunModel[264].setRotationPoint(51.5F, -28F, -3F);

        gunModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 342
        gunModel[265].setRotationPoint(51.5F, -30.5F, -3F);

        gunModel[266].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 343
        gunModel[266].setRotationPoint(54.25F, -28F, -3F);

        gunModel[267].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 344
        gunModel[267].setRotationPoint(54.25F, -30.5F, -3F);

        gunModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 345
        gunModel[268].setRotationPoint(59.5F, -28F, -3F);

        gunModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 346
        gunModel[269].setRotationPoint(59.5F, -30.5F, -3F);

        gunModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 347
        gunModel[270].setRotationPoint(58F, -30.5F, -3F);

        gunModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 348
        gunModel[271].setRotationPoint(58F, -28F, -3F);

        gunModel[272].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 349
        gunModel[272].setRotationPoint(60.75F, -28F, -3F);

        gunModel[273].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 350
        gunModel[273].setRotationPoint(60.75F, -30.5F, -3F);

        gunModel[274].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 351
        gunModel[274].setRotationPoint(67.25F, -28F, -3F);

        gunModel[275].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.25F, 0F, 0F); // Box 352
        gunModel[275].setRotationPoint(67.25F, -30.5F, -3F);

        gunModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 353
        gunModel[276].setRotationPoint(66F, -28F, -3F);

        gunModel[277].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 354
        gunModel[277].setRotationPoint(66F, -30.5F, -3F);

        gunModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 355
        gunModel[278].setRotationPoint(64.5F, -28F, -3F);

        gunModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 356
        gunModel[279].setRotationPoint(64.5F, -30.5F, -3F);

        gunModel[280].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
        gunModel[280].setRotationPoint(37.5F, -28F, 2F);

        gunModel[281].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
        gunModel[281].setRotationPoint(37.5F, -30.5F, 2F);

        gunModel[282].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 359
        gunModel[282].setRotationPoint(45.5F, -30.5F, 2F);

        gunModel[283].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 360
        gunModel[283].setRotationPoint(45.5F, -28F, 2F);

        gunModel[284].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 361
        gunModel[284].setRotationPoint(47F, -28F, 2F);

        gunModel[285].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 362
        gunModel[285].setRotationPoint(47F, -30.5F, 2F);

        gunModel[286].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 363
        gunModel[286].setRotationPoint(50F, -28F, 2F);

        gunModel[287].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 364
        gunModel[287].setRotationPoint(50F, -30.5F, 2F);

        gunModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 365
        gunModel[288].setRotationPoint(48.5F, -28F, 2F);

        gunModel[289].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 366
        gunModel[289].setRotationPoint(48.5F, -30.5F, 2F);

        gunModel[290].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 367
        gunModel[290].setRotationPoint(53F, -28F, 2F);

        gunModel[291].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 368
        gunModel[291].setRotationPoint(53F, -30.5F, 2F);

        gunModel[292].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 369
        gunModel[292].setRotationPoint(51.5F, -28F, 2F);

        gunModel[293].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 370
        gunModel[293].setRotationPoint(51.5F, -30.5F, 2F);

        gunModel[294].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 371
        gunModel[294].setRotationPoint(54.25F, -28F, 2F);

        gunModel[295].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 372
        gunModel[295].setRotationPoint(54.25F, -30.5F, 2F);

        gunModel[296].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 373
        gunModel[296].setRotationPoint(59.5F, -28F, 2F);

        gunModel[297].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 374
        gunModel[297].setRotationPoint(59.5F, -30.5F, 2F);

        gunModel[298].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 375
        gunModel[298].setRotationPoint(58F, -30.5F, 2F);

        gunModel[299].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 376
        gunModel[299].setRotationPoint(58F, -28F, 2F);

        gunModel[300].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 377
        gunModel[300].setRotationPoint(60.75F, -28F, 2F);

        gunModel[301].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 378
        gunModel[301].setRotationPoint(60.75F, -30.5F, 2F);

        gunModel[302].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 379
        gunModel[302].setRotationPoint(67.25F, -28F, 2F);

        gunModel[303].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.25F, 0F, 0F); // Box 380
        gunModel[303].setRotationPoint(67.25F, -30.5F, 2F);

        gunModel[304].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 381
        gunModel[304].setRotationPoint(66F, -28F, 2F);

        gunModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 382
        gunModel[305].setRotationPoint(66F, -30.5F, 2F);

        gunModel[306].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 383
        gunModel[306].setRotationPoint(64.5F, -28F, 2F);

        gunModel[307].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 384
        gunModel[307].setRotationPoint(64.5F, -30.5F, 2F);

        gunModel[308].addShapeBox(0F, 0F, 0F, 34, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 385
        gunModel[308].setRotationPoint(37.5F, -31.5F, -2F);

        gunModel[309].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 386
        gunModel[309].setRotationPoint(38F, -25F, -3.5F);

        gunModel[310].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
        gunModel[310].setRotationPoint(55F, -25F, -3.5F);

        gunModel[311].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
        gunModel[311].setRotationPoint(73F, -25F, -3.5F);

        gunModel[312].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 389
        gunModel[312].setRotationPoint(38F, -26.5F, 2F);

        gunModel[313].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
        gunModel[313].setRotationPoint(52F, -24F, 3.5F);

        gunModel[314].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, 0F); // Box 391
        gunModel[314].setRotationPoint(50F, -24F, 2.5F);

        gunModel[315].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F); // Box 392
        gunModel[315].setRotationPoint(71F, -24F, 2.5F);

        gunModel[316].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F); // Box 393
        gunModel[316].setRotationPoint(52F, -25F, 2.5F);

        gunModel[317].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.99F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0F); // Box 394
        gunModel[317].setRotationPoint(50F, -25F, 2.5F);

        gunModel[318].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -1F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F); // Box 395
        gunModel[318].setRotationPoint(71F, -25F, 2.5F);

        gunModel[319].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F); // Box 396
        gunModel[319].setRotationPoint(44F, -24F, 2.5F);

        gunModel[320].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 397
        gunModel[320].setRotationPoint(38F, -24F, 2.5F);

        gunModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
        gunModel[321].setRotationPoint(37.5F, -18.5F, -2.5F);

        gunModel[322].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 399
        gunModel[322].setRotationPoint(73F, -24F, 2.5F);

        gunModel[323].addShapeBox(0F, 0F, 0F, 34, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 400
        gunModel[323].setRotationPoint(37.5F, -31.5F, -2F);

        gunModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 401
        gunModel[324].setRotationPoint(37.5F, -32.5F, -2F);

        gunModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 402
        gunModel[325].setRotationPoint(39.5F, -32.5F, -2F);

        gunModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 403
        gunModel[326].setRotationPoint(43.5F, -32.5F, -2F);

        gunModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 404
        gunModel[327].setRotationPoint(41.5F, -32.5F, -2F);

        gunModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 405
        gunModel[328].setRotationPoint(45.5F, -32.5F, -2F);

        gunModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 406
        gunModel[329].setRotationPoint(55.5F, -32.5F, -2F);

        gunModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 407
        gunModel[330].setRotationPoint(53.5F, -32.5F, -2F);

        gunModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 408
        gunModel[331].setRotationPoint(51.5F, -32.5F, -2F);

        gunModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 409
        gunModel[332].setRotationPoint(49.5F, -32.5F, -2F);

        gunModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 410
        gunModel[333].setRotationPoint(47.5F, -32.5F, -2F);

        gunModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 411
        gunModel[334].setRotationPoint(65.5F, -32.5F, -2F);

        gunModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 412
        gunModel[335].setRotationPoint(63.5F, -32.5F, -2F);

        gunModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 413
        gunModel[336].setRotationPoint(61.5F, -32.5F, -2F);

        gunModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 414
        gunModel[337].setRotationPoint(59.5F, -32.5F, -2F);

        gunModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 415
        gunModel[338].setRotationPoint(57.5F, -32.5F, -2F);

        gunModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 419
        gunModel[339].setRotationPoint(69.5F, -32.5F, -2F);

        gunModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 420
        gunModel[340].setRotationPoint(67.5F, -32.5F, -2F);

        gunModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1.125F, 0.375F, -0.5F, -1.125F, 0.375F, -0.5F, -1.125F, -0.375F, 0F, -1.125F, -0.375F); // Box 426
        gunModel[341].setRotationPoint(44.5F, -25F, 2.5F);

        gunModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.625F, 0.125F, -0.5F, -0.625F, 0.125F, -0.5F, -0.625F, -0.125F, 0F, -0.625F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
        gunModel[342].setRotationPoint(44.5F, -25F, 2.5F);

        gunModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.625F, 0.125F, 0F, -0.625F, 0.125F, 0F, -0.625F, -0.125F, -0.5F, -0.625F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
        gunModel[343].setRotationPoint(54.5F, -25F, 2.5F);

        gunModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -1.125F, 0.375F, 0F, -1.125F, 0.375F, 0F, -1.125F, -0.375F, -0.5F, -1.125F, -0.375F); // Box 429
        gunModel[344].setRotationPoint(54.5F, -25F, 2.5F);

        gunModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.625F, 0.125F, 0F, -0.625F, 0.125F, 0F, -0.625F, -0.125F, -0.5F, -0.625F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
        gunModel[345].setRotationPoint(72.5F, -25F, 2.5F);

        gunModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -1.125F, 0.375F, 0F, -1.125F, 0.375F, 0F, -1.125F, -0.375F, -0.5F, -1.125F, -0.375F); // Box 431
        gunModel[346].setRotationPoint(72.5F, -25F, 2.5F);

        gunModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.625F, 0.125F, -0.5F, -0.625F, 0.125F, -0.5F, -0.625F, -0.125F, 0F, -0.625F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
        gunModel[347].setRotationPoint(62.5F, -25F, 2.5F);

        gunModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1.125F, 0.375F, -0.5F, -1.125F, 0.375F, -0.5F, -1.125F, -0.375F, 0F, -1.125F, -0.375F); // Box 433
        gunModel[348].setRotationPoint(62.5F, -25F, 2.5F);

        gunModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -1.125F, -0.375F, -0.5F, -1.125F, -0.375F, -0.5F, -1.125F, 0.375F, 0F, -1.125F, 0.375F); // Box 434
        gunModel[349].setRotationPoint(44.5F, -25F, -3.5F);

        gunModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.625F, -0.125F, -0.5F, -0.625F, -0.125F, -0.5F, -0.625F, 0.125F, 0F, -0.625F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
        gunModel[350].setRotationPoint(44.5F, -25F, -3.5F);

        gunModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.625F, -0.125F, 0F, -0.625F, -0.125F, 0F, -0.625F, 0.125F, -0.5F, -0.625F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
        gunModel[351].setRotationPoint(54.5F, -25F, -3.5F);

        gunModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, -1.125F, -0.375F, 0F, -1.125F, -0.375F, 0F, -1.125F, 0.375F, -0.5F, -1.125F, 0.375F); // Box 437
        gunModel[352].setRotationPoint(54.5F, -25F, -3.5F);

        gunModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.625F, -0.125F, 0F, -0.625F, -0.125F, 0F, -0.625F, 0.125F, -0.5F, -0.625F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
        gunModel[353].setRotationPoint(72.5F, -25F, -3.5F);

        gunModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, -1.125F, -0.375F, 0F, -1.125F, -0.375F, 0F, -1.125F, 0.375F, -0.5F, -1.125F, 0.375F); // Box 439
        gunModel[354].setRotationPoint(72.5F, -25F, -3.5F);

        gunModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.625F, -0.125F, -0.5F, -0.625F, -0.125F, -0.5F, -0.625F, 0.125F, 0F, -0.625F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
        gunModel[355].setRotationPoint(62.5F, -25F, -3.5F);

        gunModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -1.125F, -0.375F, -0.5F, -1.125F, -0.375F, -0.5F, -1.125F, 0.375F, 0F, -1.125F, 0.375F); // Box 441
        gunModel[356].setRotationPoint(62.5F, -25F, -3.5F);

        gunModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, -0.75F, 0.875F, -0.5F, -0.75F, 0.875F, -0.5F, -0.75F, -0.875F, 0F, -0.75F, -0.875F); // Box 442
        gunModel[357].setRotationPoint(45.5F, -30.5F, 2F);

        gunModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, -0.75F, 0.875F, -0.5F, -0.75F, 0.875F, -0.5F, -0.75F, -0.875F, 0F, -0.75F, -0.875F); // Box 443
        gunModel[358].setRotationPoint(44F, -30.5F, 2F);

        gunModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 444
        gunModel[359].setRotationPoint(45.5F, -27F, 2F);

        gunModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 445
        gunModel[360].setRotationPoint(44F, -27F, 2F);

        gunModel[361].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 1F, 0.25F, 0F, 1F, 0F, -0.75F, -0.875F, -0.5F, -0.75F, -0.875F, -0.5F, -0.75F, 0.875F, 0F, -0.75F, 0.875F); // Box 446
        gunModel[361].setRotationPoint(45.5F, -30.5F, -3F);

        gunModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 1F, 0.25F, 0F, 1F, 0F, -0.75F, -0.875F, -0.5F, -0.75F, -0.875F, -0.5F, -0.75F, 0.875F, 0F, -0.75F, 0.875F); // Box 447
        gunModel[362].setRotationPoint(44F, -30.5F, -3F);

        gunModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 448
        gunModel[363].setRotationPoint(45.5F, -27F, -3F);

        gunModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 449
        gunModel[364].setRotationPoint(44F, -27F, -3F);

        gunModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 1F, 0.25F, 0F, 1F, 0F, -0.75F, -0.875F, -0.5F, -0.75F, -0.875F, -0.5F, -0.75F, 0.875F, 0F, -0.75F, 0.875F); // Box 450
        gunModel[365].setRotationPoint(47F, -30.5F, -3F);

        gunModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 451
        gunModel[366].setRotationPoint(47F, -27F, -3F);

        gunModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 452
        gunModel[367].setRotationPoint(47F, -27F, 2F);

        gunModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, -0.75F, 0.875F, -0.5F, -0.75F, 0.875F, -0.5F, -0.75F, -0.875F, 0F, -0.75F, -0.875F); // Box 453
        gunModel[368].setRotationPoint(47F, -30.5F, 2F);

        gunModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 1F, 0.25F, 0F, 1F, 0F, -0.75F, -0.875F, -0.5F, -0.75F, -0.875F, -0.5F, -0.75F, 0.875F, 0F, -0.75F, 0.875F); // Box 454
        gunModel[369].setRotationPoint(48.5F, -30.5F, -3F);

        gunModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 455
        gunModel[370].setRotationPoint(48.5F, -27F, -3F);

        gunModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 456
        gunModel[371].setRotationPoint(48.5F, -27F, 2F);

        gunModel[372].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, -0.75F, 0.875F, -0.5F, -0.75F, 0.875F, -0.5F, -0.75F, -0.875F, 0F, -0.75F, -0.875F); // Box 457
        gunModel[372].setRotationPoint(48.5F, -30.5F, 2F);

        gunModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 1F, 0.25F, 0F, 1F, 0F, -0.75F, -0.875F, -0.5F, -0.75F, -0.875F, -0.5F, -0.75F, 0.875F, 0F, -0.75F, 0.875F); // Box 458
        gunModel[373].setRotationPoint(50F, -30.5F, -3F);

        gunModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 459
        gunModel[374].setRotationPoint(50F, -27F, -3F);

        gunModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 460
        gunModel[375].setRotationPoint(50F, -27F, 2F);

        gunModel[376].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, -0.75F, 0.875F, -0.5F, -0.75F, 0.875F, -0.5F, -0.75F, -0.875F, 0F, -0.75F, -0.875F); // Box 461
        gunModel[376].setRotationPoint(50F, -30.5F, 2F);

        gunModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 1F, 0.25F, 0F, 1F, 0F, -0.75F, -0.875F, -0.5F, -0.75F, -0.875F, -0.5F, -0.75F, 0.875F, 0F, -0.75F, 0.875F); // Box 462
        gunModel[377].setRotationPoint(51.5F, -30.5F, -3F);

        gunModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 463
        gunModel[378].setRotationPoint(51.5F, -27F, -3F);

        gunModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 464
        gunModel[379].setRotationPoint(51.5F, -27F, 2F);

        gunModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, -0.75F, 0.875F, -0.5F, -0.75F, 0.875F, -0.5F, -0.75F, -0.875F, 0F, -0.75F, -0.875F); // Box 465
        gunModel[380].setRotationPoint(51.5F, -30.5F, 2F);

        gunModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 1F, 0.25F, 0F, 1F, 0F, -0.75F, -0.875F, -0.5F, -0.75F, -0.875F, -0.5F, -0.75F, 0.875F, 0F, -0.75F, 0.875F); // Box 466
        gunModel[381].setRotationPoint(53F, -30.5F, -3F);

        gunModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 467
        gunModel[382].setRotationPoint(53F, -27F, -3F);

        gunModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 468
        gunModel[383].setRotationPoint(53F, -27F, 2F);

        gunModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, -0.75F, 0.875F, -0.5F, -0.75F, 0.875F, -0.5F, -0.75F, -0.875F, 0F, -0.75F, -0.875F); // Box 469
        gunModel[384].setRotationPoint(53F, -30.5F, 2F);

        gunModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 1F, 0.25F, 0F, 1F, 0F, -0.75F, -0.875F, -0.5F, -0.75F, -0.875F, -0.5F, -0.75F, 0.875F, 0F, -0.75F, 0.875F); // Box 470
        gunModel[385].setRotationPoint(54.5F, -30.5F, -3F);

        gunModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 471
        gunModel[386].setRotationPoint(54.5F, -27F, -3F);

        gunModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 472
        gunModel[387].setRotationPoint(54.5F, -27F, 2F);

        gunModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, -0.75F, 0.875F, -0.5F, -0.75F, 0.875F, -0.5F, -0.75F, -0.875F, 0F, -0.75F, -0.875F); // Box 473
        gunModel[388].setRotationPoint(54.5F, -30.5F, 2F);

        gunModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 1F, 0.25F, 0F, 1F, 0F, -0.75F, -0.875F, -0.5F, -0.75F, -0.875F, -0.5F, -0.75F, 0.875F, 0F, -0.75F, 0.875F); // Box 474
        gunModel[389].setRotationPoint(56.5F, -30.5F, -3F);

        gunModel[390].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 475
        gunModel[390].setRotationPoint(56.5F, -27F, -3F);

        gunModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 476
        gunModel[391].setRotationPoint(56.5F, -27F, 2F);

        gunModel[392].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, -0.75F, 0.875F, -0.5F, -0.75F, 0.875F, -0.5F, -0.75F, -0.875F, 0F, -0.75F, -0.875F); // Box 477
        gunModel[392].setRotationPoint(56.5F, -30.5F, 2F);

        gunModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 1F, 0.25F, 0F, 1F, 0F, -0.75F, -0.875F, -0.5F, -0.75F, -0.875F, -0.5F, -0.75F, 0.875F, 0F, -0.75F, 0.875F); // Box 478
        gunModel[393].setRotationPoint(58F, -30.5F, -3F);

        gunModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 479
        gunModel[394].setRotationPoint(58F, -27F, -3F);

        gunModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 480
        gunModel[395].setRotationPoint(58F, -27F, 2F);

        gunModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, -0.75F, 0.875F, -0.5F, -0.75F, 0.875F, -0.5F, -0.75F, -0.875F, 0F, -0.75F, -0.875F); // Box 481
        gunModel[396].setRotationPoint(58F, -30.5F, 2F);

        gunModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 1F, 0.25F, 0F, 1F, 0F, -0.75F, -0.875F, -0.5F, -0.75F, -0.875F, -0.5F, -0.75F, 0.875F, 0F, -0.75F, 0.875F); // Box 482
        gunModel[397].setRotationPoint(59.5F, -30.5F, -3F);

        gunModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 483
        gunModel[398].setRotationPoint(59.5F, -27F, -3F);

        gunModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 484
        gunModel[399].setRotationPoint(59.5F, -27F, 2F);

        gunModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, -0.75F, 0.875F, -0.5F, -0.75F, 0.875F, -0.5F, -0.75F, -0.875F, 0F, -0.75F, -0.875F); // Box 485
        gunModel[400].setRotationPoint(59.5F, -30.5F, 2F);

        gunModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 1F, 0.25F, 0F, 1F, 0F, -0.75F, -0.875F, -0.5F, -0.75F, -0.875F, -0.5F, -0.75F, 0.875F, 0F, -0.75F, 0.875F); // Box 486
        gunModel[401].setRotationPoint(61F, -30.5F, -3F);

        gunModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 487
        gunModel[402].setRotationPoint(61F, -27F, -3F);

        gunModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 488
        gunModel[403].setRotationPoint(61F, -27F, 2F);

        gunModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, -0.75F, 0.875F, -0.5F, -0.75F, 0.875F, -0.5F, -0.75F, -0.875F, 0F, -0.75F, -0.875F); // Box 489
        gunModel[404].setRotationPoint(61F, -30.5F, 2F);

        gunModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 1F, 0.25F, 0F, 1F, 0F, -0.75F, -0.875F, -0.5F, -0.75F, -0.875F, -0.5F, -0.75F, 0.875F, 0F, -0.75F, 0.875F); // Box 490
        gunModel[405].setRotationPoint(63F, -30.5F, -3F);

        gunModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 491
        gunModel[406].setRotationPoint(63F, -27F, -3F);

        gunModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 492
        gunModel[407].setRotationPoint(63F, -27F, 2F);

        gunModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, -0.75F, 0.875F, -0.5F, -0.75F, 0.875F, -0.5F, -0.75F, -0.875F, 0F, -0.75F, -0.875F); // Box 493
        gunModel[408].setRotationPoint(63F, -30.5F, 2F);

        gunModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 1F, 0.25F, 0F, 1F, 0F, -0.75F, -0.875F, -0.5F, -0.75F, -0.875F, -0.5F, -0.75F, 0.875F, 0F, -0.75F, 0.875F); // Box 494
        gunModel[409].setRotationPoint(64.5F, -30.5F, -3F);

        gunModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 495
        gunModel[410].setRotationPoint(64.5F, -27F, -3F);

        gunModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 496
        gunModel[411].setRotationPoint(64.5F, -27F, 2F);

        gunModel[412].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, -0.75F, 0.875F, -0.5F, -0.75F, 0.875F, -0.5F, -0.75F, -0.875F, 0F, -0.75F, -0.875F); // Box 497
        gunModel[412].setRotationPoint(64.5F, -30.5F, 2F);

        gunModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 1F, 0.25F, 0F, 1F, 0F, -0.75F, -0.875F, -0.5F, -0.75F, -0.875F, -0.5F, -0.75F, 0.875F, 0F, -0.75F, 0.875F); // Box 498
        gunModel[413].setRotationPoint(66F, -30.5F, -3F);

        gunModel[414].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 499
        gunModel[414].setRotationPoint(66F, -27F, -3F);

        gunModel[415].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 500
        gunModel[415].setRotationPoint(66F, -27F, 2F);

        gunModel[416].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, -0.75F, 0.875F, -0.5F, -0.75F, 0.875F, -0.5F, -0.75F, -0.875F, 0F, -0.75F, -0.875F); // Box 501
        gunModel[416].setRotationPoint(66F, -30.5F, 2F);

        gunModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 1F, 0.25F, 0F, 1F, 0F, -0.75F, -0.875F, -0.5F, -0.75F, -0.875F, -0.5F, -0.75F, 0.875F, 0F, -0.75F, 0.875F); // Box 502
        gunModel[417].setRotationPoint(67.5F, -30.5F, -3F);

        gunModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 503
        gunModel[418].setRotationPoint(67.5F, -27F, -3F);

        gunModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 504
        gunModel[419].setRotationPoint(67.5F, -27F, 2F);

        gunModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, -0.75F, 0.875F, -0.5F, -0.75F, 0.875F, -0.5F, -0.75F, -0.875F, 0F, -0.75F, -0.875F); // Box 505
        gunModel[420].setRotationPoint(67.5F, -30.5F, 2F);

        gunModel[421].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 506
        gunModel[421].setRotationPoint(55.25F, -28.5F, 2.25F);

        gunModel[422].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0.5F, 1.25F, -0.25F, 0.5F, 1.25F, -0.25F, 0.5F, -1.25F, -0.25F, 0.5F, -1.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 507
        gunModel[422].setRotationPoint(55.25F, -30.5F, 2.25F);

        gunModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F); // Box 508
        gunModel[423].setRotationPoint(55.25F, -25.5F, 2.25F);

        gunModel[424].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 509
        gunModel[424].setRotationPoint(55.25F, -28.5F, -3.25F);

        gunModel[425].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0.5F, -1.25F, -0.25F, 0.5F, -1.25F, -0.25F, 0.5F, 1.25F, -0.25F, 0.5F, 1.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 510
        gunModel[425].setRotationPoint(55.25F, -30.5F, -3.25F);

        gunModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F); // Box 511
        gunModel[426].setRotationPoint(55.25F, -25.5F, -3.25F);

        gunModel[427].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 512
        gunModel[427].setRotationPoint(61.75F, -28.5F, -3.25F);

        gunModel[428].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0.5F, -1.25F, -0.25F, 0.5F, -1.25F, -0.25F, 0.5F, 1.25F, -0.25F, 0.5F, 1.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 513
        gunModel[428].setRotationPoint(61.75F, -30.5F, -3.25F);

        gunModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F); // Box 514
        gunModel[429].setRotationPoint(61.75F, -25.5F, -3.25F);

        gunModel[430].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0.5F, 1.25F, -0.25F, 0.5F, 1.25F, -0.25F, 0.5F, -1.25F, -0.25F, 0.5F, -1.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 515
        gunModel[430].setRotationPoint(61.75F, -30.5F, 2.25F);

        gunModel[431].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 516
        gunModel[431].setRotationPoint(61.75F, -28.5F, 2.25F);

        gunModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F); // Box 517
        gunModel[432].setRotationPoint(61.75F, -25.5F, 2.25F);

        gunModel[433].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 518
        gunModel[433].setRotationPoint(70F, -29.5F, 3F);

        gunModel[434].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 519
        gunModel[434].setRotationPoint(70F, -29.5F, 3.5F);

        gunModel[435].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 520
        gunModel[435].setRotationPoint(70F, -29.5F, 4F);

        gunModel[436].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 525
        gunModel[436].setRotationPoint(72F, -29.5F, 4F);

        gunModel[437].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 527
        gunModel[437].setRotationPoint(74F, -29.5F, 4F);

        gunModel[438].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 529
        gunModel[438].setRotationPoint(76F, -29.5F, 4F);

        gunModel[439].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 531
        gunModel[439].setRotationPoint(78F, -29.5F, 4F);

        gunModel[440].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
        gunModel[440].setRotationPoint(52F, -18.5F, -2F);

        gunModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533
        gunModel[441].setRotationPoint(56F, -18.5F, -2F);

        gunModel[442].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 534
        gunModel[442].setRotationPoint(54F, -18.5F, -2F);

        gunModel[443].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 535
        gunModel[443].setRotationPoint(60F, -18.5F, -2F);

        gunModel[444].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
        gunModel[444].setRotationPoint(58F, -18.5F, -2F);

        gunModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 537
        gunModel[445].setRotationPoint(64F, -18.5F, -2F);

        gunModel[446].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
        gunModel[446].setRotationPoint(62F, -18.5F, -2F);

        gunModel[447].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
        gunModel[447].setRotationPoint(68F, -18.5F, -2F);

        gunModel[448].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
        gunModel[448].setRotationPoint(66F, -18.5F, -2F);

        gunModel[449].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 541
        gunModel[449].setRotationPoint(72F, -18.5F, -2F);

        gunModel[450].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
        gunModel[450].setRotationPoint(70F, -18.5F, -2F);

        gunModel[451].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
        gunModel[451].setRotationPoint(76F, -18.5F, -2F);

        gunModel[452].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
        gunModel[452].setRotationPoint(74F, -18.5F, -2F);

        gunModel[453].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 546
        gunModel[453].setRotationPoint(42F, -20F, 3F);

        gunModel[454].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 547
        gunModel[454].setRotationPoint(42F, -20.75F, 3F);

        gunModel[455].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1.125F, -0.25F, 0F, -1.125F, -0.25F, 0F, -1.125F, -0.25F, 0F, -1.125F, -0.25F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F); // Box 548
        gunModel[455].setRotationPoint(42F, -21.25F, 3F);

        gunModel[456].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -1.125F, -0.25F, 0F, -1.125F, -0.25F, 0F, -1.125F, -0.25F, 0F, -1.125F, -0.25F, 0F); // Box 549
        gunModel[456].setRotationPoint(42F, -18.75F, 3F);

        gunModel[457].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F); // Box 550
        gunModel[457].setRotationPoint(42F, -19.25F, 3F);

        gunModel[458].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 551
        gunModel[458].setRotationPoint(42F, -20F, -4F);

        gunModel[459].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 552
        gunModel[459].setRotationPoint(42F, -20.75F, -4F);

        gunModel[460].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1.125F, -0.25F, 0F, -1.125F, -0.25F, 0F, -1.125F, -0.25F, 0F, -1.125F, -0.25F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F); // Box 553
        gunModel[460].setRotationPoint(42F, -21.25F, -4F);

        gunModel[461].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -1.125F, -0.25F, 0F, -1.125F, -0.25F, 0F, -1.125F, -0.25F, 0F, -1.125F, -0.25F, 0F); // Box 554
        gunModel[461].setRotationPoint(42F, -18.75F, -4F);

        gunModel[462].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F); // Box 555
        gunModel[462].setRotationPoint(42F, -19.25F, -4F);

        gunModel[463].addShapeBox(0F, 0F, 0F, 37, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F); // Box 521
        gunModel[463].setRotationPoint(-10F, -26F, 2F);

        gunModel[464].addShapeBox(0F, 0F, 0F, 45, 1, 1, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, -1.25F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 522
        gunModel[464].setRotationPoint(-10F, -27F, 2F);

        gunModel[465].addShapeBox(0F, 0F, 0F, 44, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 523
        gunModel[465].setRotationPoint(-9F, -28F, 2F);

        gunModel[466].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 524
        gunModel[466].setRotationPoint(-8F, -29F, 1.5F);

        gunModel[467].addShapeBox(0F, 0F, 0F, 42, 1, 1, 0F, -1.5F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, -0.75F, -1.75F, 0.5F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 525
        gunModel[467].setRotationPoint(-7F, -30F, 1.5F);

        gunModel[468].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F, -1.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.75F, -1.75F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F); // Box 526
        gunModel[468].setRotationPoint(-6F, -31.5F, 0.5F);

        gunModel[469].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 527
        gunModel[469].setRotationPoint(-10F, -25F, 2F);

        gunModel[470].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 534
        gunModel[470].setRotationPoint(-10F, -26F, -2.5F);

        gunModel[471].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 535
        gunModel[471].setRotationPoint(-10F, -27F, -2.5F);

        gunModel[472].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
        gunModel[472].setRotationPoint(-9F, -28F, -2.5F);

        gunModel[473].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 537
        gunModel[473].setRotationPoint(-8F, -29F, -2F);

        gunModel[474].addShapeBox(0F, 0F, 0F, 40, 1, 2, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 540
        gunModel[474].setRotationPoint(-5F, -31.5F, -1F);

        gunModel[475].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0.25F, 0.25F, -1F, 0.25F, 0.25F, -1F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 541
        gunModel[475].setRotationPoint(-10F, -26F, -3F);

        gunModel[476].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, -1.25F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 542
        gunModel[476].setRotationPoint(-10F, -27F, -3F);

        gunModel[477].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F, -1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 543
        gunModel[477].setRotationPoint(-9F, -28F, -3F);

        gunModel[478].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F, -1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 544
        gunModel[478].setRotationPoint(-8F, -29F, -2.5F);

        gunModel[479].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, -0.25F, -0.25F, 0.25F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 547
        gunModel[479].setRotationPoint(-10F, -25F, -3F);

        gunModel[480].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
        gunModel[480].setRotationPoint(-11F, -26F, -3.5F);

        gunModel[481].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 549
        gunModel[481].setRotationPoint(-8F, -26F, -3.5F);

        gunModel[482].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 550
        gunModel[482].setRotationPoint(-11F, -25F, -3.5F);

        gunModel[483].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -1.75F, 0F, -0.25F, 1F, 0F, 0F, 1F, 0F, 0F, -1.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F); // Box 551
        gunModel[483].setRotationPoint(-12F, -26F, -3.5F);

        gunModel[484].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -1.75F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 552
        gunModel[484].setRotationPoint(-11F, -27F, -2.5F);

        gunModel[485].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -1.375F, -0.5F, -1.5F, 0.625F, -0.5F, -1.5F, 0.625F, -0.5F, -1.5F, -1.375F, -0.5F, -1.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 553
        gunModel[485].setRotationPoint(-10F, -28F, -2.5F);

        gunModel[486].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, 1F, 0F, 0F, 1F, 0F, 0F, -1.75F, 0F, -0.25F); // Box 554
        gunModel[486].setRotationPoint(-12F, -25F, -3.5F);

        gunModel[487].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 555
        gunModel[487].setRotationPoint(-10F, -25.5F, -4F);

        gunModel[488].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 556
        gunModel[488].setRotationPoint(-10F, -26F, -4F);

        gunModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 557
        gunModel[489].setRotationPoint(-10F, -25F, -4F);

        gunModel[490].addShapeBox(0F, 0F, 0F, 41, 1, 4, 0F, -1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 559
        gunModel[490].setRotationPoint(-4F, -32F, -2F);

        gunModel[491].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, -1.5F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, -1.5F, -0.49F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 560
        gunModel[491].setRotationPoint(-6.5F, -31.5F, -1F);

        gunModel[492].addShapeBox(0F, 0F, 0F, 42, 1, 1, 0F, -1.75F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, 0.25F, -1.5F, 0.5F, 0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 561
        gunModel[492].setRotationPoint(-7F, -30F, -2.5F);

        gunModel[493].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F, -1.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.25F, -1.5F, -0.5F, 0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 562
        gunModel[493].setRotationPoint(-6F, -31.5F, -1.5F);

        gunModel[494].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F, -1.5F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, -1.5F, 0.5F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 563
        gunModel[494].setRotationPoint(-7F, -30F, -2F);

        gunModel[495].addShapeBox(0F, 0F, 0F, 41, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 564
        gunModel[495].setRotationPoint(-4F, -31F, -2F);

        gunModel[496].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 565
        gunModel[496].setRotationPoint(-3F, -32F, -2F);

        gunModel[497].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 566
        gunModel[497].setRotationPoint(1F, -32F, -2F);

        gunModel[498].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 567
        gunModel[498].setRotationPoint(1F, -32F, 1F);

        gunModel[499].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 568
        gunModel[499].setRotationPoint(3F, -32F, 1F);
    }

    private void initgunModel_2() {
        gunModel[500] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 569
        gunModel[501] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 570
        gunModel[502] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 571
        gunModel[503] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 572
        gunModel[504] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 573
        gunModel[505] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Box 574
        gunModel[506] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 575
        gunModel[507] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 576
        gunModel[508] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 577
        gunModel[509] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 578
        gunModel[510] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 579
        gunModel[511] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 580
        gunModel[512] = new ModelRendererTurbo(this, 337, 137, textureX, textureY); // Box 581
        gunModel[513] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 582
        gunModel[514] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Box 583
        gunModel[515] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 584
        gunModel[516] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 585
        gunModel[517] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 586
        gunModel[518] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 587
        gunModel[519] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 588
        gunModel[520] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 589
        gunModel[521] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 590
        gunModel[522] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 591
        gunModel[523] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 592
        gunModel[524] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 593
        gunModel[525] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 594
        gunModel[526] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 595
        gunModel[527] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 596
        gunModel[528] = new ModelRendererTurbo(this, 17, 153, textureX, textureY); // Box 597
        gunModel[529] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Box 598
        gunModel[530] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Box 599
        gunModel[531] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 600
        gunModel[532] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 601
        gunModel[533] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 846
        gunModel[534] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Box 847
        gunModel[535] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 848
        gunModel[536] = new ModelRendererTurbo(this, 25, 169, textureX, textureY); // Box 849
        gunModel[537] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 850
        gunModel[538] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Box 851
        gunModel[539] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 852
        gunModel[540] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Box 853
        gunModel[541] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 854
        gunModel[542] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 855
        gunModel[543] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Box 856
        gunModel[544] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 857
        gunModel[545] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Box 858
        gunModel[546] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Box 859
        gunModel[547] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 860
        gunModel[548] = new ModelRendererTurbo(this, 321, 169, textureX, textureY); // Box 861
        gunModel[549] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Box 862
        gunModel[550] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 863
        gunModel[551] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Box 864
        gunModel[552] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Box 780
        gunModel[553] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 781
        gunModel[554] = new ModelRendererTurbo(this, 417, 177, textureX, textureY); // Box 782
        gunModel[555] = new ModelRendererTurbo(this, 433, 177, textureX, textureY); // Box 784
        gunModel[556] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 785
        gunModel[557] = new ModelRendererTurbo(this, 81, 185, textureX, textureY); // Box 786
        gunModel[558] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Box 787
        gunModel[559] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Box 788
        gunModel[560] = new ModelRendererTurbo(this, 321, 185, textureX, textureY); // Box 789
        gunModel[561] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 790
        gunModel[562] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 791
        gunModel[563] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 792
        gunModel[564] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 793
        gunModel[565] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 794
        gunModel[566] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 795
        gunModel[567] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Box 374
        gunModel[568] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 375
        gunModel[569] = new ModelRendererTurbo(this, 433, 177, textureX, textureY); // Box 376
        gunModel[570] = new ModelRendererTurbo(this, 289, 233, textureX, textureY); // Box 1
        gunModel[571] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Box 2
        gunModel[572] = new ModelRendererTurbo(this, 305, 233, textureX, textureY); // Box 3
        gunModel[573] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Box 4
        gunModel[574] = new ModelRendererTurbo(this, 329, 233, textureX, textureY); // Box 5
        gunModel[575] = new ModelRendererTurbo(this, 353, 233, textureX, textureY); // Box 6
        gunModel[576] = new ModelRendererTurbo(this, 369, 233, textureX, textureY); // Box 7
        gunModel[577] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Box 8
        gunModel[578] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Box 10
        gunModel[579] = new ModelRendererTurbo(this, 425, 233, textureX, textureY); // Box 11
        gunModel[580] = new ModelRendererTurbo(this, 449, 233, textureX, textureY); // Box 22
        gunModel[581] = new ModelRendererTurbo(this, 465, 233, textureX, textureY); // Box 23
        gunModel[582] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 25
        gunModel[583] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 27
        gunModel[584] = new ModelRendererTurbo(this, 81, 185, textureX, textureY); // Box 28
        gunModel[585] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Box 649
        gunModel[586] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Box 650
        gunModel[587] = new ModelRendererTurbo(this, 321, 185, textureX, textureY); // Box 650
        gunModel[588] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 5
        gunModel[589] = new ModelRendererTurbo(this, 1, 245, textureX, textureY); // Box 647
        gunModel[590] = new ModelRendererTurbo(this, 1, 245, textureX, textureY); // Box 648
        gunModel[591] = new ModelRendererTurbo(this, 1, 245, textureX, textureY); // Box 649
        gunModel[592] = new ModelRendererTurbo(this, 1, 245, textureX, textureY); // Box 650
        gunModel[593] = new ModelRendererTurbo(this, 1, 245, textureX, textureY); // Box 651
        gunModel[594] = new ModelRendererTurbo(this, 1, 245, textureX, textureY); // Box 647
        gunModel[595] = new ModelRendererTurbo(this, 1, 245, textureX, textureY); // Box 648
        gunModel[596] = new ModelRendererTurbo(this, 1, 245, textureX, textureY); // Box 649
        gunModel[597] = new ModelRendererTurbo(this, 1, 245, textureX, textureY); // Box 650
        gunModel[598] = new ModelRendererTurbo(this, 1, 245, textureX, textureY); // Box 651

        gunModel[500].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 569
        gunModel[500].setRotationPoint(3F, -32F, -2F);

        gunModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 570
        gunModel[501].setRotationPoint(5F, -32F, 1F);

        gunModel[502].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 571
        gunModel[502].setRotationPoint(5F, -32F, -2F);

        gunModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 572
        gunModel[503].setRotationPoint(7F, -32F, 1F);

        gunModel[504].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 573
        gunModel[504].setRotationPoint(7F, -32F, -2F);

        gunModel[505].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 574
        gunModel[505].setRotationPoint(9F, -32F, 1F);

        gunModel[506].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 575
        gunModel[506].setRotationPoint(9F, -32F, -2F);

        gunModel[507].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 576
        gunModel[507].setRotationPoint(19F, -32F, 1F);

        gunModel[508].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 577
        gunModel[508].setRotationPoint(19F, -32F, -2F);

        gunModel[509].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 578
        gunModel[509].setRotationPoint(17F, -32F, -2F);

        gunModel[510].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 579
        gunModel[510].setRotationPoint(17F, -32F, 1F);

        gunModel[511].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 580
        gunModel[511].setRotationPoint(15F, -32F, 1F);

        gunModel[512].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 581
        gunModel[512].setRotationPoint(15F, -32F, -2F);

        gunModel[513].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 582
        gunModel[513].setRotationPoint(13F, -32F, -2F);

        gunModel[514].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 583
        gunModel[514].setRotationPoint(13F, -32F, 1F);

        gunModel[515].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 584
        gunModel[515].setRotationPoint(11F, -32F, 1F);

        gunModel[516].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 585
        gunModel[516].setRotationPoint(11F, -32F, -2F);

        gunModel[517].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 586
        gunModel[517].setRotationPoint(29F, -32F, 1F);

        gunModel[518].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 587
        gunModel[518].setRotationPoint(29F, -32F, -2F);

        gunModel[519].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 588
        gunModel[519].setRotationPoint(27F, -32F, -2F);

        gunModel[520].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 589
        gunModel[520].setRotationPoint(27F, -32F, 1F);

        gunModel[521].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 590
        gunModel[521].setRotationPoint(25F, -32F, 1F);

        gunModel[522].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 591
        gunModel[522].setRotationPoint(25F, -32F, -2F);

        gunModel[523].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 592
        gunModel[523].setRotationPoint(23F, -32F, -2F);

        gunModel[524].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 593
        gunModel[524].setRotationPoint(23F, -32F, 1F);

        gunModel[525].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 594
        gunModel[525].setRotationPoint(21F, -32F, 1F);

        gunModel[526].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 595
        gunModel[526].setRotationPoint(21F, -32F, -2F);

        gunModel[527].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 596
        gunModel[527].setRotationPoint(31F, -32F, 1F);

        gunModel[528].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 597
        gunModel[528].setRotationPoint(31F, -32F, -2F);

        gunModel[529].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 598
        gunModel[529].setRotationPoint(33F, -32F, 1F);

        gunModel[530].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 599
        gunModel[530].setRotationPoint(33F, -32F, -2F);

        gunModel[531].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 600
        gunModel[531].setRotationPoint(34F, -32F, -1.5F);

        gunModel[532].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.75F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0.25F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0.25F); // Box 601
        gunModel[532].setRotationPoint(36F, -32F, -1.5F);

        gunModel[533].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 846
        gunModel[533].setRotationPoint(-5F, -16.5F, -3F);

        gunModel[534].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 847
        gunModel[534].setRotationPoint(-5F, -11.5F, -3F);

        gunModel[535].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 848
        gunModel[535].setRotationPoint(-7F, -8.5F, -3F);

        gunModel[536].addShapeBox(0F, 0F, 0F, 5, 7, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 2F, 0F, 0F); // Box 849
        gunModel[536].setRotationPoint(-9F, -3.5F, -3F);

        gunModel[537].addShapeBox(0F, 0F, 0F, 2, 7, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, -0.5F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, -0.5F, -1F); // Box 850
        gunModel[537].setRotationPoint(-11F, -3.5F, -3F);

        gunModel[538].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F); // Box 851
        gunModel[538].setRotationPoint(-9F, -8.5F, -3F);

        gunModel[539].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F); // Box 852
        gunModel[539].setRotationPoint(-7F, -11.5F, -3F);

        gunModel[540].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 853
        gunModel[540].setRotationPoint(-7F, -16.5F, -3F);

        gunModel[541].addShapeBox(0F, 0F, 0F, 3, 8, 6, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 854
        gunModel[541].setRotationPoint(-6F, -3.5F, -3F);

        gunModel[542].addShapeBox(0F, 0F, 0F, 3, 5, 6, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 855
        gunModel[542].setRotationPoint(-4F, -8.5F, -3F);

        gunModel[543].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 856
        gunModel[543].setRotationPoint(-2F, -11.5F, -3F);

        gunModel[544].addShapeBox(0F, 0F, 0F, 3, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 857
        gunModel[544].setRotationPoint(0F, -16.5F, -3F);

        gunModel[545].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 858
        gunModel[545].setRotationPoint(-10F, -16.5F, -3.5F);

        gunModel[546].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 859
        gunModel[546].setRotationPoint(-11F, -16F, -3.5F);

        gunModel[547].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 860
        gunModel[547].setRotationPoint(-2F, -16.5F, -3.5F);

        gunModel[548].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 861
        gunModel[548].setRotationPoint(-2F, -15.5F, -3.5F);

        gunModel[549].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0.5F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, -1F, 0.5F, -1F); // Box 862
        gunModel[549].setRotationPoint(-10F, -15.5F, -3.5F);

        gunModel[550].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -2F); // Box 863
        gunModel[550].setRotationPoint(-11F, -15F, -3.5F);

        gunModel[551].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 864
        gunModel[551].setRotationPoint(-6F, 2.5F, -3F);

        gunModel[552].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 780
        gunModel[552].setRotationPoint(-11.5F, -24F, -3F);

        gunModel[553].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 781
        gunModel[553].setRotationPoint(-11.5F, -24.5F, -3F);

        gunModel[554].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 782
        gunModel[554].setRotationPoint(-11.5F, -18.5F, -3F);

        gunModel[555].addShapeBox(0F, 0F, 0F, 28, 2, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 784
        gunModel[555].setRotationPoint(-41.5F, -22F, -3F);

        gunModel[556].addShapeBox(0F, 0F, 0F, 30, 2, 6, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 785
        gunModel[556].setRotationPoint(-41.5F, -23.5F, -3F);

        gunModel[557].addShapeBox(0F, 0F, 0F, 30, 2, 6, 0F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 786
        gunModel[557].setRotationPoint(-41.5F, -24.5F, -3F);

        gunModel[558].addShapeBox(0F, 0F, 0F, 30, 2, 6, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F); // Box 787
        gunModel[558].setRotationPoint(-41.5F, -19.5F, -3F);

        gunModel[559].addShapeBox(0F, 0F, 0F, 30, 2, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 788
        gunModel[559].setRotationPoint(-41.5F, -20.5F, -3F);

        gunModel[560].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 789
        gunModel[560].setRotationPoint(-13.5F, -22F, -3F);

        gunModel[561].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 790
        gunModel[561].setRotationPoint(-13.5F, -23F, 1F);

        gunModel[562].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 791
        gunModel[562].setRotationPoint(-12.5F, -23F, 1F);

        gunModel[563].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 792
        gunModel[563].setRotationPoint(-11.5F, -23F, 1F);

        gunModel[564].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 793
        gunModel[564].setRotationPoint(-13.5F, -20F, 1F);

        gunModel[565].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 794
        gunModel[565].setRotationPoint(-12.5F, -20F, 1F);

        gunModel[566].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 795
        gunModel[566].setRotationPoint(-11.5F, -20F, 1F);

        gunModel[567].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F); // Box 374
        gunModel[567].setRotationPoint(34F, -23.75F, 2F);

        gunModel[568].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, -0.25F, -0.5F, 0.375F, -0.25F, -0.5F, 0.375F, -0.25F, -0.5F, 0.375F, -0.25F, -0.5F, 0.375F); // Box 375
        gunModel[568].setRotationPoint(34F, -23.25F, 2F);

        gunModel[569].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, 0.375F, -0.25F, -0.5F, 0.375F, -0.25F, -0.5F, 0.375F, -0.25F, -0.5F, 0.375F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F); // Box 376
        gunModel[569].setRotationPoint(34F, -24.25F, 2F);

        gunModel[570].addShapeBox(-1.5F, -0.5F, -1F, 2, 1, 1, 0F, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F); // Box 1
        gunModel[570].setRotationPoint(-2F, -22F, -3F);
        gunModel[570].rotateAngleZ = -0.31415927F;

        gunModel[571].addShapeBox(-1.5F, 0.5F, -1F, 2, 1, 1, 0F, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, -0.75F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F); // Box 2
        gunModel[571].setRotationPoint(-2F, -22F, -3F);
        gunModel[571].rotateAngleZ = -0.31415927F;

        gunModel[572].addShapeBox(-1.5F, -1.5F, -1F, 2, 1, 1, 0F, -0.75F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F); // Box 3
        gunModel[572].setRotationPoint(-2F, -22F, -3F);
        gunModel[572].rotateAngleZ = -0.31415927F;

        gunModel[573].addShapeBox(0.5F, -2F, -1F, 6, 3, 1, 0F, 0.0F, -0.75F, -0.5F, 0.0F, 0F, -0.5F, 0.0F, 0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F); // Box 4
        gunModel[573].setRotationPoint(-2F, -22F, -3F);
        gunModel[573].rotateAngleZ = -0.31415927F;

        gunModel[574].addShapeBox(6.5F, -2F, -1F, 9, 2, 1, 0F, 0.0F, 0F, -0.5F, 1F, 1F, -0.5F, 1F, 1F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 1F, -2F, -0.5F, 1F, -2F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 5
        gunModel[574].setRotationPoint(-2F, -22F, -3F);
        gunModel[574].rotateAngleZ = -0.31415927F;

        gunModel[575].addShapeBox(-2.5F, -0.5F, -0.25F, 3, 1, 1, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Box 6
        gunModel[575].setRotationPoint(-2F, -22F, -3F);
        gunModel[575].rotateAngleZ = -0.31415927F;

        gunModel[576].addShapeBox(-2.5F, 0.75F, -0.25F, 2, 1, 1, 0F, -0.5F, 0.25F, 0.0F, 1F, 0.25F, 0.0F, 1F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -1.75F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F); // Box 7
        gunModel[576].setRotationPoint(-2F, -22F, -3F);
        gunModel[576].rotateAngleZ = -0.31415927F;

        gunModel[577].addShapeBox(-2.5F, -1.75F, -0.25F, 2, 1, 1, 0F, -1.75F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, 1F, 0.25F, 0.0F, 1F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F); // Box 8
        gunModel[577].setRotationPoint(-2F, -22F, -3F);
        gunModel[577].rotateAngleZ = -0.31415927F;

        gunModel[578].addShapeBox(0.5F, -1.75F, -0.25F, 15, 3, 1, 0F, 0.0F, 0F, 0.0F, 0.5F, 2F, 0.0F, 0.5F, 2F, 0F, 0.0F, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, -2.75F, 0.0F, 0.5F, -2.75F, 0.0F, 0.0F, 0.5F, 0.0F); // Box 10
        gunModel[578].setRotationPoint(-2F, -22F, -3F);
        gunModel[578].rotateAngleZ = -0.31415927F;

        gunModel[579].addShapeBox(6.5F, -1.25F, -0.25F, 9, 1, 1, 0F, -0.75F, 3F, 0.0F, 0.5F, 3F, 0.0F, 0.5F, 3F, -0.5F, -0.75F, 3F, -0.5F, 1F, -2.0F, 0.0F, 0.5F, -2.5F, 0.0F, 0.5F, -2.5F, -0.5F, 1F, -2.0F, -0.5F); // Box 11
        gunModel[579].setRotationPoint(-2F, -22F, -3F);
        gunModel[579].rotateAngleZ = -0.31415927F;

        gunModel[580].addShapeBox(16F, -3.75F, -0.5F, 3, 2, 1, 0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.75F, -0.25F); // Box 22
        gunModel[580].setRotationPoint(-2F, -22F, -3F);
        gunModel[580].rotateAngleZ = -0.31415927F;

        gunModel[581].addShapeBox(16F, -4.75F, -0.5F, 4, 1, 1, 0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F); // Box 23
        gunModel[581].setRotationPoint(-2F, -22F, -3F);
        gunModel[581].rotateAngleZ = -0.31415927F;

        gunModel[582].addShapeBox(16F, -2F, -0.5F, 3, 1, 1, 0F, 0.0F, -0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F); // Box 25
        gunModel[582].setRotationPoint(-2F, -22F, -3F);
        gunModel[582].rotateAngleZ = -0.31415927F;

        gunModel[583].addShapeBox(19F, -3.75F, -0.5F, 1, 1, 1, 0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F); // Box 27
        gunModel[583].setRotationPoint(-2F, -22F, -3F);
        gunModel[583].rotateAngleZ = -0.31415927F;

        gunModel[584].addShapeBox(19F, -3F, -0.5F, 1, 1, 1, 0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0F, 0.25F, 0.0F, 0F, -0.75F, 0.0F, 0.0F, -0.75F); // Box 28
        gunModel[584].setRotationPoint(-2F, -22F, -3F);
        gunModel[584].rotateAngleZ = -0.31415927F;

        gunModel[585].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.125F, 0.125F, 0.5F, -0.125F, 0.125F, 0.5F, -0.125F, 0.125F, 0.5F, -0.125F, 0.125F, 0.5F, -0.125F, 0.125F, 0.5F, -0.125F, 0.125F, 0.5F, -0.125F, 0.125F, 0.5F, -0.125F, 0.125F); // Box 649
        gunModel[585].setRotationPoint(-2.5F, -22.5F, -3.5F);

        gunModel[586].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, 0.5F, -0.125F, 0.125F, 0.5F, -0.125F, 0.125F, 0.5F, -0.125F, 0.125F, 0.5F, -0.125F, 0.125F); // Box 650
        gunModel[586].setRotationPoint(-2.5F, -23.25F, -3.5F);

        gunModel[587].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.125F, 0.125F, 0.5F, -0.125F, 0.125F, 0.5F, -0.125F, 0.125F, 0.5F, -0.125F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F); // Box 650
        gunModel[587].setRotationPoint(-2.5F, -21.75F, -3.5F);

        gunModel[588].addShapeBox(16.5F, -3F, -1F, 1, 1, 1, 0F, 0.0F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, 0F, 0F, 0.0F, 0F, 0F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, 0.0F, 0F, 0F, 0.0F); // Box 5
        gunModel[588].setRotationPoint(-2F, -22F, -3F);
        gunModel[588].rotateAngleZ = -0.31415927F;

        gunModel[589].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 12F, 0.05F, 0.05F, 12F, 0.05F, 0.05F, 12F, 0.05F, 0.05F, 12F, 0.05F, 0.05F, 12F, 0.05F, 0.05F, 12F, 0.05F, 0.05F, 12F, 0.05F, 0.05F, 12F, 0.05F, 0.05F); // Box 647
        gunModel[589].setRotationPoint(55.75F, -28.5F, -2F);

        gunModel[590].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 12F, 0.05F, -0.5F, 12F, 0.05F, -0.5F, 12F, 0.05F, -0.5F, 12F, 0.05F, -0.5F, 12F, -0.05F, 0.05F, 12F, -0.05F, 0.05F, 12F, -0.05F, 0.05F, 12F, -0.05F, 0.05F); // Box 648
        gunModel[590].setRotationPoint(55.75F, -29.5F, -2F);

        gunModel[591].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 12F, -0.45F, -1F, 12F, -0.45F, -1F, 12F, -0.45F, -1F, 12F, -0.45F, -1F, 12F, -0.05F, 0F, 12F, -0.05F, 0F, 12F, -0.05F, 0F, 12F, -0.05F, 0F); // Box 649
        gunModel[591].setRotationPoint(55.75F, -30.5F, -1.5F);

        gunModel[592].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 12F, -0.05F, 0F, 12F, -0.05F, 0F, 12F, -0.05F, 0F, 12F, -0.05F, 0F, 12F, -0.45F, -1F, 12F, -0.45F, -1F, 12F, -0.45F, -1F, 12F, -0.45F, -1F); // Box 650
        gunModel[592].setRotationPoint(55.75F, -26.5F, -1.5F);

        gunModel[593].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 12F, -0.05F, 0.05F, 12F, -0.05F, 0.05F, 12F, -0.05F, 0.05F, 12F, -0.05F, 0.05F, 12F, 0.05F, -0.5F, 12F, 0.05F, -0.5F, 12F, 0.05F, -0.5F, 12F, 0.05F, -0.5F); // Box 651
        gunModel[593].setRotationPoint(55.75F, -27.5F, -2F);

        gunModel[594].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 15F, 0.05F, 0.05F, 15F, 0.05F, 0.05F, 15F, 0.05F, 0.05F, 15F, 0.05F, 0.05F, 15F, 0.05F, 0.05F, 15F, 0.05F, 0.05F, 15F, 0.05F, 0.05F, 15F, 0.05F, 0.05F); // Box 647
        gunModel[594].setRotationPoint(57.75F, -23.5F, -2F);

        gunModel[595].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 15F, 0.05F, -0.5F, 15F, 0.05F, -0.5F, 15F, 0.05F, -0.5F, 15F, 0.05F, -0.5F, 15F, -0.05F, 0.05F, 15F, -0.05F, 0.05F, 15F, -0.05F, 0.05F, 15F, -0.05F, 0.05F); // Box 648
        gunModel[595].setRotationPoint(57.75F, -24.5F, -2F);

        gunModel[596].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 15F, -0.45F, -1F, 15F, -0.45F, -1F, 15F, -0.45F, -1F, 15F, -0.45F, -1F, 15F, -0.05F, 0F, 15F, -0.05F, 0F, 15F, -0.05F, 0F, 15F, -0.05F, 0F); // Box 649
        gunModel[596].setRotationPoint(57.75F, -25.5F, -1.5F);

        gunModel[597].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 15F, -0.05F, 0F, 15F, -0.05F, 0F, 15F, -0.05F, 0F, 15F, -0.05F, 0F, 15F, -0.45F, -1F, 15F, -0.45F, -1F, 15F, -0.45F, -1F, 15F, -0.45F, -1F); // Box 650
        gunModel[597].setRotationPoint(57.75F, -21.5F, -1.5F);

        gunModel[598].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 15F, -0.05F, 0.05F, 15F, -0.05F, 0.05F, 15F, -0.05F, 0.05F, 15F, -0.05F, 0.05F, 15F, 0.05F, -0.5F, 15F, 0.05F, -0.5F, 15F, 0.05F, -0.5F, 15F, 0.05F, -0.5F); // Box 651
        gunModel[598].setRotationPoint(57.75F, -22.5F, -2F);
    }

    private void initdefaultBarrelModel_1() {
        defaultBarrelModel[0] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 647
        defaultBarrelModel[1] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 648
        defaultBarrelModel[2] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 649
        defaultBarrelModel[3] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 650
        defaultBarrelModel[4] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Box 651
        defaultBarrelModel[5] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Box 653
        defaultBarrelModel[6] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Box 654
        defaultBarrelModel[7] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Box 657
        defaultBarrelModel[8] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 658
        defaultBarrelModel[9] = new ModelRendererTurbo(this, 265, 153, textureX, textureY); // Box 659
        defaultBarrelModel[10] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 660
        defaultBarrelModel[11] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box 661
        defaultBarrelModel[12] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Box 662
        defaultBarrelModel[13] = new ModelRendererTurbo(this, 393, 153, textureX, textureY); // Box 665
        defaultBarrelModel[14] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Box 666
        defaultBarrelModel[15] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Box 668
        defaultBarrelModel[16] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 669
        defaultBarrelModel[17] = new ModelRendererTurbo(this, 425, 153, textureX, textureY); // Box 670
        defaultBarrelModel[18] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Box 671
        defaultBarrelModel[19] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 672
        defaultBarrelModel[20] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 673
        defaultBarrelModel[21] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Box 674
        defaultBarrelModel[22] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 675
        defaultBarrelModel[23] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 676
        defaultBarrelModel[24] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Box 677
        defaultBarrelModel[25] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Box 678
        defaultBarrelModel[26] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Box 679
        defaultBarrelModel[27] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Box 680
        defaultBarrelModel[28] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 681
        defaultBarrelModel[29] = new ModelRendererTurbo(this, 9, 161, textureX, textureY); // Box 682
        defaultBarrelModel[30] = new ModelRendererTurbo(this, 17, 161, textureX, textureY); // Box 683
        defaultBarrelModel[31] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Box 684
        defaultBarrelModel[32] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 685
        defaultBarrelModel[33] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Box 686
        defaultBarrelModel[34] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 687
        defaultBarrelModel[35] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Box 688
        defaultBarrelModel[36] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Box 689
        defaultBarrelModel[37] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 690
        defaultBarrelModel[38] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 691
        defaultBarrelModel[39] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Box 692
        defaultBarrelModel[40] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 693
        defaultBarrelModel[41] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 694
        defaultBarrelModel[42] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 695
        defaultBarrelModel[43] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 696
        defaultBarrelModel[44] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 697
        defaultBarrelModel[45] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Box 698
        defaultBarrelModel[46] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 699
        defaultBarrelModel[47] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 700
        defaultBarrelModel[48] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 701
        defaultBarrelModel[49] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 702
        defaultBarrelModel[50] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 703
        defaultBarrelModel[51] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 704
        defaultBarrelModel[52] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 705
        defaultBarrelModel[53] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 706
        defaultBarrelModel[54] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 707
        defaultBarrelModel[55] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 708
        defaultBarrelModel[56] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 709
        defaultBarrelModel[57] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 710
        defaultBarrelModel[58] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 711
        defaultBarrelModel[59] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 712
        defaultBarrelModel[60] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 713
        defaultBarrelModel[61] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Box 714
        defaultBarrelModel[62] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 715
        defaultBarrelModel[63] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 716
        defaultBarrelModel[64] = new ModelRendererTurbo(this, 289, 161, textureX, textureY); // Box 717
        defaultBarrelModel[65] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 718
        defaultBarrelModel[66] = new ModelRendererTurbo(this, 305, 161, textureX, textureY); // Box 719
        defaultBarrelModel[67] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Box 720
        defaultBarrelModel[68] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 721
        defaultBarrelModel[69] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Box 722
        defaultBarrelModel[70] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 723
        defaultBarrelModel[71] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 724
        defaultBarrelModel[72] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 725
        defaultBarrelModel[73] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Box 726
        defaultBarrelModel[74] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 727
        defaultBarrelModel[75] = new ModelRendererTurbo(this, 377, 161, textureX, textureY); // Box 728
        defaultBarrelModel[76] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 729
        defaultBarrelModel[77] = new ModelRendererTurbo(this, 393, 161, textureX, textureY); // Box 734
        defaultBarrelModel[78] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Box 735
        defaultBarrelModel[79] = new ModelRendererTurbo(this, 409, 161, textureX, textureY); // Box 738
        defaultBarrelModel[80] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Box 739
        defaultBarrelModel[81] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Box 740
        defaultBarrelModel[82] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Box 741
        defaultBarrelModel[83] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Box 742
        defaultBarrelModel[84] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 743

        defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 647
        defaultBarrelModel[0].setRotationPoint(99.75F, -23.5F, -2F);

        defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 648
        defaultBarrelModel[1].setRotationPoint(99.75F, -24.5F, -2F);

        defaultBarrelModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 649
        defaultBarrelModel[2].setRotationPoint(99.75F, -25.5F, -1.5F);

        defaultBarrelModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 650
        defaultBarrelModel[3].setRotationPoint(99.75F, -21.5F, -1.5F);

        defaultBarrelModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 651
        defaultBarrelModel[4].setRotationPoint(99.75F, -22.5F, -2F);

        defaultBarrelModel[5].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.625F, 0.125F, 0F, -0.625F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F); // Box 653
        defaultBarrelModel[5].setRotationPoint(102.75F, -24.5F, -2F);

        defaultBarrelModel[6].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, -0.625F, -1F, 0F, -0.625F, -1F, 0F, -1.375F, 0.25F, 0F, -1.375F, 0.25F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.625F, -0.375F, 0F, 0.625F, -0.375F); // Box 654
        defaultBarrelModel[6].setRotationPoint(102.75F, -25.5F, -1.5F);

        defaultBarrelModel[7].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, -0.625F, 0.125F, 0F, -0.625F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 657
        defaultBarrelModel[7].setRotationPoint(102.75F, -24.5F, 1F);

        defaultBarrelModel[8].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, -1.375F, 0.25F, 0F, -1.375F, 0.25F, 0F, -0.625F, -1F, 0F, -0.625F, -1F, 0F, 0.625F, -0.375F, 0F, 0.625F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 658
        defaultBarrelModel[8].setRotationPoint(102.75F, -25.5F, 0.5F);

        defaultBarrelModel[9].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.625F, 0.125F, 0F, -0.625F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F); // Box 659
        defaultBarrelModel[9].setRotationPoint(102.75F, -22.5F, 1F);

        defaultBarrelModel[10].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0.625F, -0.375F, 0F, 0.625F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -1.375F, 0.25F, 0F, -1.375F, 0.25F, 0F, -0.625F, -1F, 0F, -0.625F, -1F); // Box 660
        defaultBarrelModel[10].setRotationPoint(102.75F, -21.5F, 0.5F);

        defaultBarrelModel[11].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.625F, 0.125F, 0F, -0.625F, 0.125F); // Box 661
        defaultBarrelModel[11].setRotationPoint(102.75F, -22.5F, -2F);

        defaultBarrelModel[12].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.625F, -0.375F, 0F, 0.625F, -0.375F, 0F, -0.625F, -1F, 0F, -0.625F, -1F, 0F, -1.375F, 0.25F, 0F, -1.375F, 0.25F); // Box 662
        defaultBarrelModel[12].setRotationPoint(102.75F, -21.5F, -1.5F);

        defaultBarrelModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 665
        defaultBarrelModel[13].setRotationPoint(102.75F, -24.5F, 1F);

        defaultBarrelModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 666
        defaultBarrelModel[14].setRotationPoint(102.75F, -25.5F, 0.5F);

        defaultBarrelModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F); // Box 668
        defaultBarrelModel[15].setRotationPoint(102.75F, -24.5F, -2F);

        defaultBarrelModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F); // Box 669
        defaultBarrelModel[16].setRotationPoint(102.75F, -25.5F, -1.5F);

        defaultBarrelModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F); // Box 670
        defaultBarrelModel[17].setRotationPoint(102.75F, -22.5F, -2F);

        defaultBarrelModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F); // Box 671
        defaultBarrelModel[18].setRotationPoint(102.75F, -21.5F, -1.5F);

        defaultBarrelModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F); // Box 672
        defaultBarrelModel[19].setRotationPoint(102.75F, -21.5F, 0.5F);

        defaultBarrelModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F); // Box 673
        defaultBarrelModel[20].setRotationPoint(102.75F, -22.5F, 1F);

        defaultBarrelModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F); // Box 674
        defaultBarrelModel[21].setRotationPoint(104.25F, -21.5F, -1.5F);

        defaultBarrelModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F); // Box 675
        defaultBarrelModel[22].setRotationPoint(104.25F, -21.5F, 0.5F);

        defaultBarrelModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F); // Box 676
        defaultBarrelModel[23].setRotationPoint(104.25F, -22.5F, -2F);

        defaultBarrelModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F); // Box 677
        defaultBarrelModel[24].setRotationPoint(104.25F, -24.5F, -2F);

        defaultBarrelModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 678
        defaultBarrelModel[25].setRotationPoint(104.25F, -25.5F, 0.5F);

        defaultBarrelModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 679
        defaultBarrelModel[26].setRotationPoint(104.25F, -24.5F, 1F);

        defaultBarrelModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F); // Box 680
        defaultBarrelModel[27].setRotationPoint(104.25F, -22.5F, 1F);

        defaultBarrelModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F); // Box 681
        defaultBarrelModel[28].setRotationPoint(104.25F, -25.5F, -1.5F);

        defaultBarrelModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F); // Box 682
        defaultBarrelModel[29].setRotationPoint(105.75F, -21.5F, -1.5F);

        defaultBarrelModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F); // Box 683
        defaultBarrelModel[30].setRotationPoint(105.75F, -21.5F, 0.5F);

        defaultBarrelModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F); // Box 684
        defaultBarrelModel[31].setRotationPoint(105.75F, -22.5F, -2F);

        defaultBarrelModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F); // Box 685
        defaultBarrelModel[32].setRotationPoint(105.75F, -24.5F, -2F);

        defaultBarrelModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 686
        defaultBarrelModel[33].setRotationPoint(105.75F, -25.5F, 0.5F);

        defaultBarrelModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 687
        defaultBarrelModel[34].setRotationPoint(105.75F, -24.5F, 1F);

        defaultBarrelModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F); // Box 688
        defaultBarrelModel[35].setRotationPoint(105.75F, -22.5F, 1F);

        defaultBarrelModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F); // Box 689
        defaultBarrelModel[36].setRotationPoint(105.75F, -25.5F, -1.5F);

        defaultBarrelModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F); // Box 690
        defaultBarrelModel[37].setRotationPoint(107.25F, -21.5F, -1.5F);

        defaultBarrelModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F); // Box 691
        defaultBarrelModel[38].setRotationPoint(107.25F, -21.5F, 0.5F);

        defaultBarrelModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F); // Box 692
        defaultBarrelModel[39].setRotationPoint(107.25F, -22.5F, -2F);

        defaultBarrelModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F); // Box 693
        defaultBarrelModel[40].setRotationPoint(107.25F, -24.5F, -2F);

        defaultBarrelModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 694
        defaultBarrelModel[41].setRotationPoint(107.25F, -25.5F, 0.5F);

        defaultBarrelModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 695
        defaultBarrelModel[42].setRotationPoint(107.25F, -24.5F, 1F);

        defaultBarrelModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F); // Box 696
        defaultBarrelModel[43].setRotationPoint(107.25F, -22.5F, 1F);

        defaultBarrelModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F); // Box 697
        defaultBarrelModel[44].setRotationPoint(107.25F, -25.5F, -1.5F);

        defaultBarrelModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F); // Box 698
        defaultBarrelModel[45].setRotationPoint(108.75F, -21.5F, -1.5F);

        defaultBarrelModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F); // Box 699
        defaultBarrelModel[46].setRotationPoint(108.75F, -21.5F, 0.5F);

        defaultBarrelModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F); // Box 700
        defaultBarrelModel[47].setRotationPoint(108.75F, -22.5F, -2F);

        defaultBarrelModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F); // Box 701
        defaultBarrelModel[48].setRotationPoint(108.75F, -24.5F, -2F);

        defaultBarrelModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 702
        defaultBarrelModel[49].setRotationPoint(108.75F, -25.5F, 0.5F);

        defaultBarrelModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 703
        defaultBarrelModel[50].setRotationPoint(108.75F, -24.5F, 1F);

        defaultBarrelModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F); // Box 704
        defaultBarrelModel[51].setRotationPoint(108.75F, -22.5F, 1F);

        defaultBarrelModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F); // Box 705
        defaultBarrelModel[52].setRotationPoint(108.75F, -25.5F, -1.5F);

        defaultBarrelModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F); // Box 706
        defaultBarrelModel[53].setRotationPoint(110.25F, -21.5F, -1.5F);

        defaultBarrelModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F); // Box 707
        defaultBarrelModel[54].setRotationPoint(110.25F, -21.5F, 0.5F);

        defaultBarrelModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F); // Box 708
        defaultBarrelModel[55].setRotationPoint(110.25F, -22.5F, -2F);

        defaultBarrelModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F); // Box 709
        defaultBarrelModel[56].setRotationPoint(110.25F, -24.5F, -2F);

        defaultBarrelModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 710
        defaultBarrelModel[57].setRotationPoint(110.25F, -25.5F, 0.5F);

        defaultBarrelModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 711
        defaultBarrelModel[58].setRotationPoint(110.25F, -24.5F, 1F);

        defaultBarrelModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F); // Box 712
        defaultBarrelModel[59].setRotationPoint(110.25F, -22.5F, 1F);

        defaultBarrelModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F); // Box 713
        defaultBarrelModel[60].setRotationPoint(110.25F, -25.5F, -1.5F);

        defaultBarrelModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F); // Box 714
        defaultBarrelModel[61].setRotationPoint(111.75F, -21.5F, -1.5F);

        defaultBarrelModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F); // Box 715
        defaultBarrelModel[62].setRotationPoint(111.75F, -21.5F, 0.5F);

        defaultBarrelModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F); // Box 716
        defaultBarrelModel[63].setRotationPoint(111.75F, -22.5F, -2F);

        defaultBarrelModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F); // Box 717
        defaultBarrelModel[64].setRotationPoint(111.75F, -24.5F, -2F);

        defaultBarrelModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 718
        defaultBarrelModel[65].setRotationPoint(111.75F, -25.5F, 0.5F);

        defaultBarrelModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 719
        defaultBarrelModel[66].setRotationPoint(111.75F, -24.5F, 1F);

        defaultBarrelModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F); // Box 720
        defaultBarrelModel[67].setRotationPoint(111.75F, -22.5F, 1F);

        defaultBarrelModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F); // Box 721
        defaultBarrelModel[68].setRotationPoint(111.75F, -25.5F, -1.5F);

        defaultBarrelModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F); // Box 722
        defaultBarrelModel[69].setRotationPoint(113.25F, -21.5F, -1.5F);

        defaultBarrelModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F); // Box 723
        defaultBarrelModel[70].setRotationPoint(113.25F, -21.5F, 0.5F);

        defaultBarrelModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F); // Box 724
        defaultBarrelModel[71].setRotationPoint(113.25F, -22.5F, -2F);

        defaultBarrelModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F); // Box 725
        defaultBarrelModel[72].setRotationPoint(113.25F, -24.5F, -2F);

        defaultBarrelModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 726
        defaultBarrelModel[73].setRotationPoint(113.25F, -25.5F, 0.5F);

        defaultBarrelModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 727
        defaultBarrelModel[74].setRotationPoint(113.25F, -24.5F, 1F);

        defaultBarrelModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F); // Box 728
        defaultBarrelModel[75].setRotationPoint(113.25F, -22.5F, 1F);

        defaultBarrelModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F, -0.125F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F); // Box 729
        defaultBarrelModel[76].setRotationPoint(113.25F, -25.5F, -1.5F);

        defaultBarrelModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -1.375F, 0.25F, -0.375F, -1.375F, 0.25F, -0.375F, -0.75F, -1F, -0.125F, -0.5F, -1F, -0.125F, 0.625F, -0.375F, -0.375F, 0.625F, -0.375F, -0.375F, 0F, -0.25F, -0.125F, 0F, 0F); // Box 734
        defaultBarrelModel[77].setRotationPoint(114F, -25.5F, 0.5F);

        defaultBarrelModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.625F, 0.125F, -0.375F, -0.625F, 0.125F, -0.375F, 0F, -0.75F, -0.125F, 0F, -0.5F, -0.125F, 0.25F, -0.125F, -0.375F, 0.25F, -0.125F, -0.375F, 0F, -0.25F, -0.125F, 0F, 0F); // Box 735
        defaultBarrelModel[78].setRotationPoint(114F, -24.5F, 1F);

        defaultBarrelModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.5F, -1F, -0.375F, -0.75F, -1F, -0.375F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F, -0.125F, 0F, 0F, -0.375F, 0F, -0.25F, -0.375F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F); // Box 738
        defaultBarrelModel[79].setRotationPoint(114F, -25.5F, -1.5F);

        defaultBarrelModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.75F, -0.375F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F, -0.125F, 0F, 0F, -0.375F, 0F, -0.25F, -0.375F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F); // Box 739
        defaultBarrelModel[80].setRotationPoint(114F, -24.5F, -2F);

        defaultBarrelModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, 0F, -0.375F, 0F, -0.25F, -0.375F, 0.625F, -0.375F, -0.125F, 0.625F, -0.375F, -0.125F, -0.5F, -1F, -0.375F, -0.75F, -1F, -0.375F, -1.375F, 0.25F, -0.125F, -1.375F, 0.25F); // Box 740
        defaultBarrelModel[81].setRotationPoint(114F, -21.5F, -1.5F);

        defaultBarrelModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, 0F, -0.375F, 0F, -0.25F, -0.375F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.75F, -0.375F, -0.625F, 0.125F, -0.125F, -0.625F, 0.125F); // Box 741
        defaultBarrelModel[82].setRotationPoint(114F, -22.5F, -2F);

        defaultBarrelModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0.625F, -0.375F, -0.375F, 0.625F, -0.375F, -0.375F, 0F, -0.25F, -0.125F, 0F, 0F, -0.125F, -1.375F, 0.25F, -0.375F, -1.375F, 0.25F, -0.375F, -0.75F, -1F, -0.125F, -0.5F, -1F); // Box 742
        defaultBarrelModel[83].setRotationPoint(114F, -21.5F, 0.5F);

        defaultBarrelModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0.25F, -0.125F, -0.375F, 0.25F, -0.125F, -0.375F, 0F, -0.25F, -0.125F, 0F, 0F, -0.125F, -0.625F, 0.125F, -0.375F, -0.625F, 0.125F, -0.375F, 0F, -0.75F, -0.125F, 0F, -0.5F); // Box 743
        defaultBarrelModel[84].setRotationPoint(114F, -22.5F, 1F);
    }

    private void initdefaultScopeModel_1() {
        defaultScopeModel[0] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // Box 744
        defaultScopeModel[1] = new ModelRendererTurbo(this, 193, 217, textureX, textureY); // Box 745
        defaultScopeModel[2] = new ModelRendererTurbo(this, 393, 217, textureX, textureY); // Box 746
        defaultScopeModel[3] = new ModelRendererTurbo(this, 425, 217, textureX, textureY); // Box 747
        defaultScopeModel[4] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Box 748
        defaultScopeModel[5] = new ModelRendererTurbo(this, 113, 169, textureX, textureY); // Box 749
        defaultScopeModel[6] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 750
        defaultScopeModel[7] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 751
        defaultScopeModel[8] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Box 752
        defaultScopeModel[9] = new ModelRendererTurbo(this, 289, 217, textureX, textureY); // Box 753
        defaultScopeModel[10] = new ModelRendererTurbo(this, 441, 217, textureX, textureY); // Box 757
        defaultScopeModel[11] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Box 758
        defaultScopeModel[12] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 759
        defaultScopeModel[13] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 760
        defaultScopeModel[14] = new ModelRendererTurbo(this, 473, 217, textureX, textureY); // Box 761
        defaultScopeModel[15] = new ModelRendererTurbo(this, 105, 225, textureX, textureY); // Box 765
        defaultScopeModel[16] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 766
        defaultScopeModel[17] = new ModelRendererTurbo(this, 313, 169, textureX, textureY); // Box 767
        defaultScopeModel[18] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Box 769
        defaultScopeModel[19] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Box 770
        defaultScopeModel[20] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 771
        defaultScopeModel[21] = new ModelRendererTurbo(this, 25, 169, textureX, textureY); // Box 772
        defaultScopeModel[22] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 773
        defaultScopeModel[23] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 774
        defaultScopeModel[24] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 775
        defaultScopeModel[25] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Box 776
        defaultScopeModel[26] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Box 777
        defaultScopeModel[27] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 778
        defaultScopeModel[28] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 779
        defaultScopeModel[29] = new ModelRendererTurbo(this, 11, 241, textureX, textureY); // Box 747

        defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 744
        defaultScopeModel[0].setRotationPoint(-1F, -32.02F, -3F);

        defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 745
        defaultScopeModel[1].setRotationPoint(-1F, -33.02F, -3F);

        defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 746
        defaultScopeModel[2].setRotationPoint(-1F, -33.02F, 2F);

        defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.49F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.49F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 747
        defaultScopeModel[3].setRotationPoint(2F, -33.02F, 2F);

        defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 748
        defaultScopeModel[4].setRotationPoint(-1F, -33.02F, 2F);

        defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 749
        defaultScopeModel[5].setRotationPoint(-1F, -33.02F, -3F);

        defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, 0.5F, 0.5F, -2F, 0.5F, 0.5F, -2F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 750
        defaultScopeModel[6].setRotationPoint(9F, -33.52F, 1.5F);

        defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, 0.5F, -0.5F, -2F, 0.5F, -0.5F, -2F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 751
        defaultScopeModel[7].setRotationPoint(9F, -33.52F, -2.5F);

        defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, -0.75F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 752
        defaultScopeModel[8].setRotationPoint(9F, -33.52F, -1.5F);

        defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F); // Box 753
        defaultScopeModel[9].setRotationPoint(1F, -33.52F, -3F);

        defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F); // Box 757
        defaultScopeModel[10].setRotationPoint(1F, -34.02F, -3F);

        defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F); // Box 758
        defaultScopeModel[11].setRotationPoint(1F, -33.02F, -3F);

        defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 759
        defaultScopeModel[12].setRotationPoint(4F, -34.02F, -3F);

        defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 760
        defaultScopeModel[13].setRotationPoint(4F, -33.52F, -3F);

        defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F); // Box 761
        defaultScopeModel[14].setRotationPoint(4F, -33.02F, -3F);

        defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Box 765
        defaultScopeModel[15].setRotationPoint(2F, -33.52F, -1F);

        defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F); // Box 766
        defaultScopeModel[16].setRotationPoint(4F, -34.02F, 1F);

        defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F); // Box 767
        defaultScopeModel[17].setRotationPoint(4F, -33.52F, 1F);

        defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.75F, -0.625F, -0.25F, -0.75F, -0.625F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F); // Box 769
        defaultScopeModel[18].setRotationPoint(1F, -35.02F, -0.5F);

        defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F); // Box 770
        defaultScopeModel[19].setRotationPoint(1F, -35.02F, -0.5F);

        defaultScopeModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.625F, -0.25F, -0.75F, -0.625F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 771
        defaultScopeModel[20].setRotationPoint(1F, -35.02F, -0.5F);

        defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.375F, -0.75F, -0.25F, -0.375F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.375F, -0.75F, -0.25F, -0.375F, -0.75F, -0.25F, -0.375F, 0.25F, -0.25F, -0.375F, 0.25F); // Box 772
        defaultScopeModel[21].setRotationPoint(1F, -34.52F, -0.5F);

        defaultScopeModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.75F, 0.125F, -0.25F, -0.75F, 0.125F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Box 773
        defaultScopeModel[22].setRotationPoint(1F, -34.02F, 0.25F);

        defaultScopeModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.625F, 0.25F, -0.25F, -0.625F, 0.25F, -0.25F, -0.625F, 0.25F, -0.25F, -0.625F, 0.25F); // Box 774
        defaultScopeModel[23].setRotationPoint(1F, -33.77F, -1.5F);

        defaultScopeModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.375F, -0.75F, -0.25F, -0.375F, -0.75F, -0.25F, -0.375F, 0.25F, -0.25F, -0.375F, 0.25F, -0.25F, -0.375F, -0.75F, -0.25F, -0.375F, -0.75F); // Box 775
        defaultScopeModel[24].setRotationPoint(1F, -34.52F, -0.5F);

        defaultScopeModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0.125F, -0.25F, -0.75F, 0.125F); // Box 776
        defaultScopeModel[25].setRotationPoint(1F, -34.02F, -1.25F);

        defaultScopeModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, -0.375F, 0.25F, -0.25F, -0.375F, 0.25F, -0.25F, -0.375F, 0.25F, -0.25F, -0.375F, 0.25F, -0.25F, -0.375F, 0.25F, -0.25F, -0.375F, 0.25F, -0.25F, -0.375F, 0.25F, -0.25F, -0.375F); // Box 777
        defaultScopeModel[26].setRotationPoint(1F, -33.52F, -3.25F);

        defaultScopeModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, 0.25F, -0.25F, -0.375F, 0.25F, -0.25F, -0.375F, 0.25F, -0.25F, -0.375F, 0.25F, -0.25F, -0.375F); // Box 778
        defaultScopeModel[27].setRotationPoint(1F, -34.02F, -3.25F);

        defaultScopeModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, -0.375F, 0.25F, -0.25F, -0.375F, 0.25F, -0.25F, -0.375F, 0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F); // Box 779
        defaultScopeModel[28].setRotationPoint(1F, -33.02F, -3.25F);

        defaultScopeModel[29].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.49F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.49F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 747
        defaultScopeModel[29].setRotationPoint(2F, -33.02F, -3F);
    }

    private void initdefaultStockModel_1() {
        defaultStockModel[0] = new ModelRendererTurbo(this, 345, 185, textureX, textureY); // Box 796
        defaultStockModel[1] = new ModelRendererTurbo(this, 425, 193, textureX, textureY); // Box 797
        defaultStockModel[2] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 798
        defaultStockModel[3] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Box 799
        defaultStockModel[4] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Box 800
        defaultStockModel[5] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Box 801
        defaultStockModel[6] = new ModelRendererTurbo(this, 297, 201, textureX, textureY); // Box 802
        defaultStockModel[7] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Box 803
        defaultStockModel[8] = new ModelRendererTurbo(this, 313, 201, textureX, textureY); // Box 804
        defaultStockModel[9] = new ModelRendererTurbo(this, 345, 201, textureX, textureY); // Box 805
        defaultStockModel[10] = new ModelRendererTurbo(this, 369, 201, textureX, textureY); // Box 806
        defaultStockModel[11] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 807
        defaultStockModel[12] = new ModelRendererTurbo(this, 33, 209, textureX, textureY); // Box 808
        defaultStockModel[13] = new ModelRendererTurbo(this, 409, 201, textureX, textureY); // Box 809
        defaultStockModel[14] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 810
        defaultStockModel[15] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 811
        defaultStockModel[16] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 812
        defaultStockModel[17] = new ModelRendererTurbo(this, 89, 209, textureX, textureY); // Box 813
        defaultStockModel[18] = new ModelRendererTurbo(this, 113, 209, textureX, textureY); // Box 822
        defaultStockModel[19] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 823
        defaultStockModel[20] = new ModelRendererTurbo(this, 225, 209, textureX, textureY); // Box 824
        defaultStockModel[21] = new ModelRendererTurbo(this, 137, 209, textureX, textureY); // Box 825
        defaultStockModel[22] = new ModelRendererTurbo(this, 265, 209, textureX, textureY); // Box 826
        defaultStockModel[23] = new ModelRendererTurbo(this, 305, 209, textureX, textureY); // Box 827
        defaultStockModel[24] = new ModelRendererTurbo(this, 361, 209, textureX, textureY); // Box 828
        defaultStockModel[25] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 829
        defaultStockModel[26] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 830
        defaultStockModel[27] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 831
        defaultStockModel[28] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 832
        defaultStockModel[29] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Box 833
        defaultStockModel[30] = new ModelRendererTurbo(this, 441, 209, textureX, textureY); // Box 834
        defaultStockModel[31] = new ModelRendererTurbo(this, 321, 209, textureX, textureY); // Box 835
        defaultStockModel[32] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Box 836
        defaultStockModel[33] = new ModelRendererTurbo(this, 489, 209, textureX, textureY); // Box 837
        defaultStockModel[34] = new ModelRendererTurbo(this, 25, 217, textureX, textureY); // Box 839
        defaultStockModel[35] = new ModelRendererTurbo(this, 41, 217, textureX, textureY); // Box 840
        defaultStockModel[36] = new ModelRendererTurbo(this, 73, 209, textureX, textureY); // Box 841
        defaultStockModel[37] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Box 842
        defaultStockModel[38] = new ModelRendererTurbo(this, 153, 217, textureX, textureY); // Box 843
        defaultStockModel[39] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); // Box 844
        defaultStockModel[40] = new ModelRendererTurbo(this, 177, 217, textureX, textureY); // Box 845

        defaultStockModel[0].addShapeBox(0F, 0F, 0F, 32, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 796
        defaultStockModel[0].setRotationPoint(-49.5F, -22F, -4F);

        defaultStockModel[1].addShapeBox(0F, 0F, 0F, 32, 2, 8, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 797
        defaultStockModel[1].setRotationPoint(-49.5F, -24F, -4F);

        defaultStockModel[2].addShapeBox(0F, 0F, 0F, 32, 1, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 798
        defaultStockModel[2].setRotationPoint(-49.5F, -25F, -3F);

        defaultStockModel[3].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 799
        defaultStockModel[3].setRotationPoint(-47.5F, -18F, -3F);

        defaultStockModel[4].addShapeBox(0F, 0F, 0F, 30, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 800
        defaultStockModel[4].setRotationPoint(-47.5F, -20F, -4F);

        defaultStockModel[5].addShapeBox(0F, 0F, 0F, 30, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 801
        defaultStockModel[5].setRotationPoint(-47.5F, -18F, -2.5F);

        defaultStockModel[6].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 802
        defaultStockModel[6].setRotationPoint(-19.5F, -16F, -2.5F);

        defaultStockModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 803
        defaultStockModel[7].setRotationPoint(-41.5F, -15F, -2.5F);

        defaultStockModel[8].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 804
        defaultStockModel[8].setRotationPoint(-47.5F, -13F, -2.5F);

        defaultStockModel[9].addShapeBox(0F, 0F, 0F, 4, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 805
        defaultStockModel[9].setRotationPoint(-47.5F, -11F, -2.5F);

        defaultStockModel[10].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 806
        defaultStockModel[10].setRotationPoint(-47.5F, -5F, -2.5F);

        defaultStockModel[11].addShapeBox(0F, 0F, 0F, 7, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 807
        defaultStockModel[11].setRotationPoint(-25.5F, -13F, -2.5F);

        defaultStockModel[12].addShapeBox(0F, 0F, 0F, 19, 1, 5, 0F, 1F, -10F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F); // Box 808
        defaultStockModel[12].setRotationPoint(-42.5F, -11F, -2.5F);

        defaultStockModel[13].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 809
        defaultStockModel[13].setRotationPoint(-47.5F, -1F, -2.5F);

        defaultStockModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 810
        defaultStockModel[14].setRotationPoint(-47.5F, -3F, -2.5F);

        defaultStockModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 811
        defaultStockModel[15].setRotationPoint(-47.5F, -4F, -2.5F);

        defaultStockModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 812
        defaultStockModel[16].setRotationPoint(-47.5F, -2F, -2.5F);

        defaultStockModel[17].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 813
        defaultStockModel[17].setRotationPoint(-47.5F, -15F, -2.5F);

        defaultStockModel[18].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 822
        defaultStockModel[18].setRotationPoint(-25.5F, -16F, -2.5F);

        defaultStockModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 823
        defaultStockModel[19].setRotationPoint(-21.5F, -16F, -2.5F);

        defaultStockModel[20].addShapeBox(0F, 0F, 0F, 9, 2, 7, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 824
        defaultStockModel[20].setRotationPoint(-32.5F, -16F, -3.5F);

        defaultStockModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 825
        defaultStockModel[21].setRotationPoint(-23.5F, -16F, -3.5F);

        defaultStockModel[22].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 826
        defaultStockModel[22].setRotationPoint(-39.5F, -15F, -3.5F);

        defaultStockModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 827
        defaultStockModel[23].setRotationPoint(-40.5F, -15F, -3.5F);

        defaultStockModel[24].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -1F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, -2F, -0.5F, -1F); // Box 828
        defaultStockModel[24].setRotationPoint(-39.5F, -13F, -3.5F);

        defaultStockModel[25].addShapeBox(0F, 0F, 0F, 22, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 829
        defaultStockModel[25].setRotationPoint(-47.5F, -16F, -2.5F);

        defaultStockModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 830
        defaultStockModel[26].setRotationPoint(-23.5F, -12.5F, -2F);

        defaultStockModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 831
        defaultStockModel[27].setRotationPoint(-22.5F, -12.5F, -2F);

        defaultStockModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 832
        defaultStockModel[28].setRotationPoint(-21.5F, -12.5F, -1.5F);

        defaultStockModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 833
        defaultStockModel[29].setRotationPoint(-24.5F, -12.5F, -2F);

        defaultStockModel[30].addShapeBox(0F, 0F, 0F, 19, 1, 5, 0F, 1F, -10.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 1F, -10.5F, -1F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F); // Box 834
        defaultStockModel[30].setRotationPoint(-43.5F, -12F, -2.5F);

        defaultStockModel[31].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 835
        defaultStockModel[31].setRotationPoint(-47.5F, -2F, -2.5F);

        defaultStockModel[32].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 836
        defaultStockModel[32].setRotationPoint(-26.5F, -14F, -2.5F);

        defaultStockModel[33].addShapeBox(0F, 0F, 0F, 2, 18, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 837
        defaultStockModel[33].setRotationPoint(-49.5F, -20F, -4F);

        defaultStockModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 839
        defaultStockModel[34].setRotationPoint(-49.5F, -2F, -4F);

        defaultStockModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 840
        defaultStockModel[35].setRotationPoint(-49.5F, 0F, -3F);

        defaultStockModel[36].addShapeBox(0F, 0F, 0F, 3, 21, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 841
        defaultStockModel[36].setRotationPoint(-52.5F, -22.5F, -4.5F);

        defaultStockModel[37].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 842
        defaultStockModel[37].setRotationPoint(-52.5F, -1.5F, -4.5F);

        defaultStockModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 843
        defaultStockModel[38].setRotationPoint(-52.5F, 0.5F, -3.5F);

        defaultStockModel[39].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 844
        defaultStockModel[39].setRotationPoint(-52.5F, -24.5F, -4.5F);

        defaultStockModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 845
        defaultStockModel[40].setRotationPoint(-52.5F, -25.5F, -3.5F);
    }

    private void initammoModel_1() {
        ammoModel[0] = new ModelRendererTurbo(this, 1, 261, textureX, textureY); // Box 308
        ammoModel[1] = new ModelRendererTurbo(this, 17, 261, textureX, textureY); // Box 309
        ammoModel[2] = new ModelRendererTurbo(this, 33, 261, textureX, textureY); // Box 310
        ammoModel[3] = new ModelRendererTurbo(this, 65, 261, textureX, textureY); // Box 318
        ammoModel[4] = new ModelRendererTurbo(this, 81, 261, textureX, textureY); // Box 319
        ammoModel[5] = new ModelRendererTurbo(this, 89, 261, textureX, textureY); // Box 321
        ammoModel[6] = new ModelRendererTurbo(this, 113, 261, textureX, textureY); // Box 15
        ammoModel[7] = new ModelRendererTurbo(this, 121, 261, textureX, textureY); // Box 18
        ammoModel[8] = new ModelRendererTurbo(this, 161, 261, textureX, textureY); // Box 316
        ammoModel[9] = new ModelRendererTurbo(this, 185, 261, textureX, textureY); // Box 16
        ammoModel[10] = new ModelRendererTurbo(this, 193, 261, textureX, textureY); // Box 23
        ammoModel[11] = new ModelRendererTurbo(this, 233, 261, textureX, textureY); // Box 24
        ammoModel[12] = new ModelRendererTurbo(this, 281, 261, textureX, textureY); // Box 25
        ammoModel[13] = new ModelRendererTurbo(this, 313, 261, textureX, textureY); // Box 26
        ammoModel[14] = new ModelRendererTurbo(this, 369, 261, textureX, textureY); // Box 27
        ammoModel[15] = new ModelRendererTurbo(this, 409, 261, textureX, textureY); // Box 28
        ammoModel[16] = new ModelRendererTurbo(this, 97, 261, textureX, textureY); // Box 29
        ammoModel[17] = new ModelRendererTurbo(this, 353, 261, textureX, textureY); // Box 30
        ammoModel[18] = new ModelRendererTurbo(this, 449, 261, textureX, textureY); // Box 31
        ammoModel[19] = new ModelRendererTurbo(this, 265, 261, textureX, textureY); // Box 32
        ammoModel[20] = new ModelRendererTurbo(this, 393, 261, textureX, textureY); // Box 33
        ammoModel[21] = new ModelRendererTurbo(this, 313, 261, textureX, textureY); // Box 34
        ammoModel[22] = new ModelRendererTurbo(this, 433, 261, textureX, textureY); // Box 35
        ammoModel[23] = new ModelRendererTurbo(this, 473, 261, textureX, textureY); // Box 36
        ammoModel[24] = new ModelRendererTurbo(this, 49, 269, textureX, textureY); // Box 37
        ammoModel[25] = new ModelRendererTurbo(this, 161, 269, textureX, textureY); // Box 39
        ammoModel[26] = new ModelRendererTurbo(this, 73, 269, textureX, textureY); // Box 40
        ammoModel[27] = new ModelRendererTurbo(this, 1, 277, textureX, textureY); // Box 41
        ammoModel[28] = new ModelRendererTurbo(this, 473, 269, textureX, textureY); // Box 42
        ammoModel[29] = new ModelRendererTurbo(this, 17, 277, textureX, textureY); // Box 43
        ammoModel[30] = new ModelRendererTurbo(this, 97, 277, textureX, textureY); // Box 44
        ammoModel[31] = new ModelRendererTurbo(this, 233, 277, textureX, textureY); // Box 45
        ammoModel[32] = new ModelRendererTurbo(this, 273, 277, textureX, textureY); // Box 46
        ammoModel[33] = new ModelRendererTurbo(this, 257, 277, textureX, textureY); // Box 47
        ammoModel[34] = new ModelRendererTurbo(this, 73, 285, textureX, textureY); // Box 48
        ammoModel[35] = new ModelRendererTurbo(this, 113, 285, textureX, textureY); // Box 49
        ammoModel[36] = new ModelRendererTurbo(this, 297, 277, textureX, textureY); // Box 50
        ammoModel[37] = new ModelRendererTurbo(this, 185, 285, textureX, textureY); // Box 51
        ammoModel[38] = new ModelRendererTurbo(this, 137, 285, textureX, textureY); // Box 52
        ammoModel[39] = new ModelRendererTurbo(this, 209, 285, textureX, textureY); // Box 53
        ammoModel[40] = new ModelRendererTurbo(this, 313, 285, textureX, textureY); // Box 54
        ammoModel[41] = new ModelRendererTurbo(this, 185, 269, textureX, textureY); // Box 55
        ammoModel[42] = new ModelRendererTurbo(this, 369, 261, textureX, textureY); // Box 56
        ammoModel[43] = new ModelRendererTurbo(this, 337, 285, textureX, textureY); // Box 57
        ammoModel[44] = new ModelRendererTurbo(this, 361, 285, textureX, textureY); // Box 58
        ammoModel[45] = new ModelRendererTurbo(this, 385, 285, textureX, textureY); // Box 59
        ammoModel[46] = new ModelRendererTurbo(this, 497, 261, textureX, textureY); // Box 60
        ammoModel[47] = new ModelRendererTurbo(this, 409, 285, textureX, textureY); // Box 61
        ammoModel[48] = new ModelRendererTurbo(this, 433, 269, textureX, textureY); // Box 62
        ammoModel[49] = new ModelRendererTurbo(this, 497, 269, textureX, textureY); // Box 63
        ammoModel[50] = new ModelRendererTurbo(this, 425, 285, textureX, textureY); // Box 64
        ammoModel[51] = new ModelRendererTurbo(this, 433, 293, textureX, textureY); // Box 65
        ammoModel[52] = new ModelRendererTurbo(this, 1, 301, textureX, textureY); // Box 66
        ammoModel[53] = new ModelRendererTurbo(this, 145, 301, textureX, textureY); // Box 67
        ammoModel[54] = new ModelRendererTurbo(this, 217, 301, textureX, textureY); // Box 68
        ammoModel[55] = new ModelRendererTurbo(this, 233, 261, textureX, textureY); // Box 69
        ammoModel[56] = new ModelRendererTurbo(this, 281, 261, textureX, textureY); // Box 70
        ammoModel[57] = new ModelRendererTurbo(this, 353, 261, textureX, textureY); // Box 71
        ammoModel[58] = new ModelRendererTurbo(this, 449, 261, textureX, textureY); // Box 72
        ammoModel[59] = new ModelRendererTurbo(this, 489, 261, textureX, textureY); // Box 73
        ammoModel[60] = new ModelRendererTurbo(this, 73, 269, textureX, textureY); // Box 74
        ammoModel[61] = new ModelRendererTurbo(this, 161, 269, textureX, textureY); // Box 75
        ammoModel[62] = new ModelRendererTurbo(this, 449, 269, textureX, textureY); // Box 76
        ammoModel[63] = new ModelRendererTurbo(this, 473, 269, textureX, textureY); // Box 77
        ammoModel[64] = new ModelRendererTurbo(this, 1, 277, textureX, textureY); // Box 78
        ammoModel[65] = new ModelRendererTurbo(this, 257, 277, textureX, textureY); // Box 79
        ammoModel[66] = new ModelRendererTurbo(this, 9, 261, textureX, textureY); // Box 80
        ammoModel[67] = new ModelRendererTurbo(this, 273, 277, textureX, textureY); // Box 83
        ammoModel[68] = new ModelRendererTurbo(this, 25, 261, textureX, textureY); // Box 84
        ammoModel[69] = new ModelRendererTurbo(this, 153, 285, textureX, textureY); // Box 85
        ammoModel[70] = new ModelRendererTurbo(this, 457, 261, textureX, textureY); // Box 86
        ammoModel[71] = new ModelRendererTurbo(this, 57, 293, textureX, textureY); // Box 87
        ammoModel[72] = new ModelRendererTurbo(this, 97, 269, textureX, textureY); // Box 88
        ammoModel[73] = new ModelRendererTurbo(this, 353, 293, textureX, textureY); // Box 89
        ammoModel[74] = new ModelRendererTurbo(this, 113, 269, textureX, textureY); // Box 90
        ammoModel[75] = new ModelRendererTurbo(this, 377, 293, textureX, textureY); // Box 91
        ammoModel[76] = new ModelRendererTurbo(this, 121, 269, textureX, textureY); // Box 92
        ammoModel[77] = new ModelRendererTurbo(this, 401, 293, textureX, textureY); // Box 93
        ammoModel[78] = new ModelRendererTurbo(this, 129, 269, textureX, textureY); // Box 94
        ammoModel[79] = new ModelRendererTurbo(this, 481, 293, textureX, textureY); // Box 95
        ammoModel[80] = new ModelRendererTurbo(this, 201, 269, textureX, textureY); // Box 96
        ammoModel[81] = new ModelRendererTurbo(this, 265, 301, textureX, textureY); // Box 82
        ammoModel[82] = new ModelRendererTurbo(this, 297, 301, textureX, textureY); // Box 83
        ammoModel[83] = new ModelRendererTurbo(this, 497, 293, textureX, textureY); // Box 84
        ammoModel[84] = new ModelRendererTurbo(this, 417, 301, textureX, textureY); // Box 85
        ammoModel[85] = new ModelRendererTurbo(this, 449, 301, textureX, textureY); // Box 86
        ammoModel[86] = new ModelRendererTurbo(this, 1, 309, textureX, textureY); // Box 87

        ammoModel[0].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 308
        ammoModel[0].setRotationPoint(17F, -20F, -2F);

        ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, -3F, -0.25F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -3F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -0.25F); // Box 309
        ammoModel[1].setRotationPoint(30F, -23F, -2F);

        ammoModel[2].addShapeBox(0F, 0F, 0F, 12, 11, 1, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 0F, -3F, 1.875F, 0F, -3F, 1.875F, -0.5F, 0F, 2F, -0.5F); // Box 310
        ammoModel[2].setRotationPoint(18F, -20F, 1.5F);

        ammoModel[3].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 318
        ammoModel[3].setRotationPoint(18F, -22F, 1.5F);

        ammoModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 319
        ammoModel[4].setRotationPoint(17F, -22F, -2F);

        ammoModel[5].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, -0.99F, -2F, 0F, -0.99F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
        ammoModel[5].setRotationPoint(18F, -22F, -2.5F);

        ammoModel[6].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F, 0F, 0F, -0.5F, -7F, 0F, -0.5F, -7F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, -7F, -1.5F, -0.5F, -7F, -1.5F, -0.5F, 0F, -1.5F, -0.5F); // Box 15
        ammoModel[6].setRotationPoint(18F, -22F, -1.5F);

        ammoModel[7].addShapeBox(0F, 0F, 0F, 9, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
        ammoModel[7].setRotationPoint(18F, -9F, -8F);

        ammoModel[8].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.99F, 0F, 0F, -2.99F); // Box 316
        ammoModel[8].setRotationPoint(18F, -22F, -1.5F);

        ammoModel[9].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F, 0F, 0F, -2.5F, -2F, 0F, -2.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.99F, 0F, 0F, -2.99F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
        ammoModel[9].setRotationPoint(18F, -22F, -1.5F);

        ammoModel[10].addShapeBox(0F, 0F, 0F, 9, 4, 16, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
        ammoModel[10].setRotationPoint(18F, -13F, -8F);

        ammoModel[11].addShapeBox(0F, 0F, 0F, 9, 2, 12, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
        ammoModel[11].setRotationPoint(18F, -15F, -6F);

        ammoModel[12].addShapeBox(0F, 0F, 0F, 9, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 25
        ammoModel[12].setRotationPoint(18F, -1F, -6F);

        ammoModel[13].addShapeBox(0F, 0F, 0F, 9, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 26
        ammoModel[13].setRotationPoint(18F, -5F, -8F);

        ammoModel[14].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 27
        ammoModel[14].setRotationPoint(17F, -9F, -8F);

        ammoModel[15].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 28
        ammoModel[15].setRotationPoint(17F, -13F, -8F);

        ammoModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F); // Box 29
        ammoModel[16].setRotationPoint(17F, -15F, -6F);

        ammoModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -5F); // Box 30
        ammoModel[17].setRotationPoint(17F, -1F, -6F);

        ammoModel[18].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F); // Box 31
        ammoModel[18].setRotationPoint(17F, -5F, -8F);

        ammoModel[19].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 32
        ammoModel[19].setRotationPoint(27F, -16F, -3F);

        ammoModel[20].addShapeBox(0F, 0F, 0F, 9, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        ammoModel[20].setRotationPoint(18F, -16F, -3F);

        ammoModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 34
        ammoModel[21].setRotationPoint(30F, -16F, -3F);

        ammoModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 35
        ammoModel[22].setRotationPoint(27F, -14.5F, -3F);

        ammoModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 36
        ammoModel[23].setRotationPoint(27F, -14F, -3F);

        ammoModel[24].addShapeBox(0F, 0F, 0F, 4, 4, 14, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 37
        ammoModel[24].setRotationPoint(26.5F, -9F, -7F);

        ammoModel[25].addShapeBox(0F, 0F, 0F, 4, 4, 14, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
        ammoModel[25].setRotationPoint(26.5F, -12.75F, -7F);

        ammoModel[26].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
        ammoModel[26].setRotationPoint(26.5F, -14.25F, -5F);

        ammoModel[27].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F); // Box 41
        ammoModel[27].setRotationPoint(26.5F, -1.75F, -5F);

        ammoModel[28].addShapeBox(0F, 0F, 0F, 4, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 42
        ammoModel[28].setRotationPoint(26.5F, -5.25F, -7F);

        ammoModel[29].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 43
        ammoModel[29].setRotationPoint(27F, -9F, -8F);

        ammoModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -4F, -0.5F, -0.5F, -4.5F, -0.5F, -0.5F, -4.5F, 0F, 0F, -4F); // Box 44
        ammoModel[30].setRotationPoint(27F, -1F, -6F);

        ammoModel[31].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, 0F, 0F, -2F); // Box 45
        ammoModel[31].setRotationPoint(27F, -5F, -8F);

        ammoModel[32].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F, 0F, 0F, -2F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 46
        ammoModel[32].setRotationPoint(27F, -13F, -8F);

        ammoModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F, 0F, 0F, -4F, -0.5F, -0.5F, -4.5F, -0.5F, -0.5F, -4.5F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 47
        ammoModel[33].setRotationPoint(27F, -15F, -6F);

        ammoModel[34].addShapeBox(0F, 0F, 0F, 1, 4, 14, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, 0F); // Box 48
        ammoModel[34].setRotationPoint(30.5F, -9F, -7F);

        ammoModel[35].addShapeBox(0F, 0F, 0F, 1, 4, 14, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -2F, -0.5F, -0.75F, -2.5F, -0.5F, -0.75F, -2.5F, 0F, -0.5F, -2F); // Box 49
        ammoModel[35].setRotationPoint(30.5F, -5.25F, -7F);

        ammoModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F, 0F, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -3.5F, -0.5F, -1F, -3.5F, -0.5F, -1F, -3.5F, 0F, -0.5F, -3.5F); // Box 50
        ammoModel[36].setRotationPoint(30.5F, -1.75F, -5F);

        ammoModel[37].addShapeBox(0F, 0F, 0F, 1, 4, 14, 0F, 0F, -0.5F, -2F, -0.5F, -0.75F, -2.5F, -0.5F, -0.75F, -2.5F, 0F, -0.5F, -2F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 51
        ammoModel[37].setRotationPoint(30.5F, -12.75F, -7F);

        ammoModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F, 0F, -0.5F, -3.5F, -0.5F, -1F, -3.5F, -0.5F, -1F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0F, 0F); // Box 52
        ammoModel[38].setRotationPoint(30.5F, -14.25F, -5F);

        ammoModel[39].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
        ammoModel[39].setRotationPoint(30F, -8F, -4F);

        ammoModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
        ammoModel[40].setRotationPoint(30F, -10F, -4F);

        ammoModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
        ammoModel[41].setRotationPoint(30F, -11F, -3F);

        ammoModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, -2F, -0.5F, -0.5F, -2F, -0.5F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0F, 0F); // Box 56
        ammoModel[42].setRotationPoint(32F, -11F, -3F);

        ammoModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, -1F, -0.5F, -0.25F, -1.5F, -0.5F, -0.25F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 57
        ammoModel[43].setRotationPoint(32F, -10F, -4F);

        ammoModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 58
        ammoModel[44].setRotationPoint(32F, -8F, -4F);

        ammoModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.25F, -1.5F, -0.5F, -0.25F, -1.5F, 0F, 0F, -1F); // Box 59
        ammoModel[45].setRotationPoint(32F, -6F, -4F);

        ammoModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -0.5F, -2F, -0.5F, -0.5F, -2F, 0F, 0F, -2F); // Box 60
        ammoModel[46].setRotationPoint(32F, -4F, -3F);

        ammoModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 61
        ammoModel[47].setRotationPoint(30F, -6F, -4F);

        ammoModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 62
        ammoModel[48].setRotationPoint(30F, -4F, -3F);

        ammoModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 63
        ammoModel[49].setRotationPoint(17F, -16F, -3F);

        ammoModel[50].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
        ammoModel[50].setRotationPoint(16F, -7.5F, -2F);

        ammoModel[51].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
        ammoModel[51].setRotationPoint(16F, -8.5F, -2F);

        ammoModel[52].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
        ammoModel[52].setRotationPoint(16F, -9.5F, -1.5F);

        ammoModel[53].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 67
        ammoModel[53].setRotationPoint(16F, -5.5F, -1.5F);

        ammoModel[54].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 68
        ammoModel[54].setRotationPoint(16F, -6.5F, -2F);

        ammoModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F); // Box 69
        ammoModel[55].setRotationPoint(15F, -7.5F, -2F);

        ammoModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F); // Box 70
        ammoModel[56].setRotationPoint(15F, -8.5F, -2F);

        ammoModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.75F, -0.75F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.75F, -0.75F, -1F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F); // Box 71
        ammoModel[57].setRotationPoint(15F, -9.5F, -1.5F);

        ammoModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.75F); // Box 72
        ammoModel[58].setRotationPoint(15F, -6.5F, -2F);

        ammoModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, -0.75F, -0.75F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.75F, -0.75F, -1F); // Box 73
        ammoModel[59].setRotationPoint(15F, -5.5F, -1.5F);

        ammoModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, -1F, 0F, -0.5F, -1F); // Box 74
        ammoModel[60].setRotationPoint(33F, -5.5F, -1.5F);

        ammoModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, 0F); // Box 75
        ammoModel[61].setRotationPoint(33F, -7.5F, -2F);

        ammoModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.5F); // Box 76
        ammoModel[62].setRotationPoint(33F, -6.5F, -2F);

        ammoModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, 0F); // Box 77
        ammoModel[63].setRotationPoint(33F, -8.5F, -2F);

        ammoModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, 0F); // Box 78
        ammoModel[64].setRotationPoint(33F, -9.5F, -1.5F);

        ammoModel[65].addShapeBox(0F, -2.5F, 2F, 2, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 79
        ammoModel[65].setRotationPoint(29.5F, -7F, 0F);

        ammoModel[66].addShapeBox(0F, -0.5F, 5F, 2, 2, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -1F, 0F, 0F, -1F, 0F); // Box 80
        ammoModel[66].setRotationPoint(29.5F, -7F, 0F);

        ammoModel[67].addShapeBox(0F, -2.5F, 2F, 2, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 83
        ammoModel[67].setRotationPoint(29.5F, -7F, 0F);
        ammoModel[67].rotateAngleX = 0.78539816F;

        ammoModel[68].addShapeBox(0F, -0.5F, 5F, 2, 2, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -1F, 0F, 0F, -1F, 0F); // Box 84
        ammoModel[68].setRotationPoint(29.5F, -7F, 0F);
        ammoModel[68].rotateAngleX = 0.78539816F;

        ammoModel[69].addShapeBox(0F, -2.5F, 2F, 2, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 85
        ammoModel[69].setRotationPoint(29.5F, -7F, 0F);
        ammoModel[69].rotateAngleX = 1.55334303F;

        ammoModel[70].addShapeBox(0F, -0.5F, 5F, 2, 2, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -1F, 0F, 0F, -1F, 0F); // Box 86
        ammoModel[70].setRotationPoint(29.5F, -7F, 0F);
        ammoModel[70].rotateAngleX = 1.55334303F;

        ammoModel[71].addShapeBox(0F, -2.5F, 2F, 2, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 87
        ammoModel[71].setRotationPoint(29.5F, -7F, 0F);
        ammoModel[71].rotateAngleX = 2.37364778F;

        ammoModel[72].addShapeBox(0F, -0.5F, 5F, 2, 2, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -1F, 0F, 0F, -1F, 0F); // Box 88
        ammoModel[72].setRotationPoint(29.5F, -7F, 0F);
        ammoModel[72].rotateAngleX = 2.37364778F;

        ammoModel[73].addShapeBox(0F, -2.5F, 2F, 2, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 89
        ammoModel[73].setRotationPoint(29.5F, -7F, 0F);
        ammoModel[73].rotateAngleX = 3.14159265F;

        ammoModel[74].addShapeBox(0F, -0.5F, 5F, 2, 2, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -1F, 0F, 0F, -1F, 0F); // Box 90
        ammoModel[74].setRotationPoint(29.5F, -7F, 0F);
        ammoModel[74].rotateAngleX = 3.14159265F;

        ammoModel[75].addShapeBox(0F, -2.5F, 2F, 2, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 91
        ammoModel[75].setRotationPoint(29.5F, -7F, 0F);
        ammoModel[75].rotateAngleX = 3.92699082F;

        ammoModel[76].addShapeBox(0F, -0.5F, 5F, 2, 2, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -1F, 0F, 0F, -1F, 0F); // Box 92
        ammoModel[76].setRotationPoint(29.5F, -7F, 0F);
        ammoModel[76].rotateAngleX = 3.92699082F;

        ammoModel[77].addShapeBox(0F, -2.5F, 2F, 2, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 93
        ammoModel[77].setRotationPoint(29.5F, -7F, 0F);
        ammoModel[77].rotateAngleX = 4.71238898F;

        ammoModel[78].addShapeBox(0F, -0.5F, 5F, 2, 2, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -1F, 0F, 0F, -1F, 0F); // Box 94
        ammoModel[78].setRotationPoint(29.5F, -7F, 0F);
        ammoModel[78].rotateAngleX = 4.71238898F;

        ammoModel[79].addShapeBox(0F, -2.5F, 2F, 2, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 95
        ammoModel[79].setRotationPoint(29.5F, -7F, 0F);
        ammoModel[79].rotateAngleX = -0.78539816F;

        ammoModel[80].addShapeBox(0F, -0.5F, 5F, 2, 2, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -1F, 0F, 0F, -1F, 0F); // Box 96
        ammoModel[80].setRotationPoint(29.5F, -7F, 0F);
        ammoModel[80].rotateAngleX = -0.78539816F;

        ammoModel[81].addShapeBox(0F, 0F, 0F, 12, 11, 1, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.75F, -5F, 0F, -0.75F, -5F, 2F, 0F, -4F, 1.875F, 0F, -4F, 1.875F, -0.75F, -5F, 2F, -0.75F); // Box 82
        ammoModel[81].setRotationPoint(22F, -20F, 1.5F);

        ammoModel[82].addShapeBox(0F, 0F, 0F, 12, 11, 1, 0F, -5F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, -0.5F, -5F, -4F, -0.5F, -5F, -3F, 0F, -4F, -3F, 0F, -4F, -3F, -0.5F, -5F, -3F, -0.5F); // Box 83
        ammoModel[82].setRotationPoint(22F, -21F, 1.5F);

        ammoModel[83].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, -5F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 84
        ammoModel[83].setRotationPoint(30F, -22F, -2F);

        ammoModel[84].addShapeBox(0F, 0F, 0F, 12, 11, 1, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, -3F, 1.875F, -0.5F, -3F, 1.875F, 0F, 0F, 2F, 0F); // Box 85
        ammoModel[84].setRotationPoint(18F, -20F, -2.5F);

        ammoModel[85].addShapeBox(0F, 0F, 0F, 12, 11, 1, 0F, -5F, 0F, -0.75F, -4F, 0F, -0.75F, -4F, 0F, 0F, -5F, 0F, 0F, -5F, 2F, -0.75F, -4F, 1.875F, -0.75F, -4F, 1.875F, 0F, -5F, 2F, 0F); // Box 86
        ammoModel[85].setRotationPoint(22F, -20F, -2.5F);

        ammoModel[86].addShapeBox(0F, 0F, 0F, 12, 11, 1, 0F, -5F, -4F, -0.5F, -4F, -4F, -0.5F, -4F, -4F, 0F, -5F, -4F, 0F, -5F, -3F, -0.5F, -4F, -3F, -0.5F, -4F, -3F, 0F, -5F, -3F, 0F); // Box 87
        ammoModel[86].setRotationPoint(22F, -21F, -2.5F);
    }

    private void initslideModel_1() {
        slideModel[0] = new ModelRendererTurbo(this, 201, 225, textureX, textureY); // Box 500
        slideModel[1] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 501
        slideModel[2] = new ModelRendererTurbo(this, 249, 225, textureX, textureY); // Box 496
        slideModel[3] = new ModelRendererTurbo(this, 297, 225, textureX, textureY); // Box 499
        slideModel[4] = new ModelRendererTurbo(this, 321, 169, textureX, textureY); // Box 503
        slideModel[5] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 504
        slideModel[6] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 505
        slideModel[7] = new ModelRendererTurbo(this, 345, 225, textureX, textureY); // Box 500
        slideModel[8] = new ModelRendererTurbo(this, 393, 225, textureX, textureY); // Box 496
        slideModel[9] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 496
        slideModel[10] = new ModelRendererTurbo(this, 105, 233, textureX, textureY); // Box 496
        slideModel[11] = new ModelRendererTurbo(this, 161, 233, textureX, textureY); // Box 496

        slideModel[0].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F, 0.25F, 0.5F, 1F, 1F, 0.5F, 1F, 1F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.25F, 1F, 1F, 0.25F, 1F, 1F, 0.25F, 1.5F, 0.25F, 0.25F, 1.5F); // Box 500
        slideModel[0].setRotationPoint(15F, -26.5F, -1F);

        slideModel[1].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, -0.25F, -0.375F, -0.75F, -0.25F, -0.375F, -0.75F, 0.25F, -0.125F, 0.125F, 0.25F, -0.125F, 0.125F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F, -0.75F, 0.25F, 0.5F, 0.125F, 0.25F, 0.5F, 0.125F); // Box 501
        slideModel[1].setRotationPoint(25F, -26.75F, -3.75F);

        slideModel[2].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 1.25F, -1F, 0.25F, 1.25F, 0.25F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 1.3F, 0.25F, 0F, 1.3F); // Box 496
        slideModel[2].setRotationPoint(16F, -29F, -1.5F);

        slideModel[3].addShapeBox(0F, 0F, 0F, 19, 1, 3, 0F, -0.75F, 0.25F, 0.55F, 0F, 0.25F, 0.55F, 0F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, 0.25F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F); // Box 499
        slideModel[3].setRotationPoint(15F, -27.75F, -1F);

        slideModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F); // Box 503
        slideModel[4].setRotationPoint(31F, -26.25F, -4.5F);

        slideModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 504
        slideModel[5].setRotationPoint(31F, -26.75F, -7F);

        slideModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 505
        slideModel[6].setRotationPoint(31F, -26.75F, -8.5F);

        slideModel[7].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F, 0.25F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.5F, 0.125F, 0F, 0.5F, 0.125F, 0F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F); // Box 500
        slideModel[7].setRotationPoint(15F, -26.75F, -2.5F);

        slideModel[8].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F, -1.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.75F, -1.5F, -0.25F, 0.75F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.25F, -1F, -0.25F, 1.25F); // Box 496
        slideModel[8].setRotationPoint(16F, -30F, -1.5F);

        slideModel[9].addShapeBox(0F, 0F, 0F, 25, 1, 2, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 496
        slideModel[9].setRotationPoint(34F, -29F, -0.87F);

        slideModel[10].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 496
        slideModel[10].setRotationPoint(34F, -30F, -0.37F);

        slideModel[11].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 496
        slideModel[11].setRotationPoint(34F, -28F, -0.37F);
    }
}