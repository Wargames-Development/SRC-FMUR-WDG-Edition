//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: QBU191
// Model Creator: 
// Created on: 15.05.2021 - 09:59:23
// Last changed on: 15.05.2021 - 09:59:23

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelQBU191 extends ModelGun //Same as Filename
{
    int textureX = 1024;
    int textureY = 1024;

    public ModelQBU191() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[485];
        defaultBarrelModel = new ModelRendererTurbo[18];
        defaultScopeModel = new ModelRendererTurbo[35];
        ammoModel = new ModelRendererTurbo[44];
        slideModel = new ModelRendererTurbo[10];

        initgunModel_1();
        initdefaultBarrelModel_1();
        initdefaultScopeModel_1();
        initammoModel_1();
        initslideModel_1();

        barrelAttachPoint = new Vector3f(258F / 16F, 66.5F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(171F / 16F, 66F / 16F, -12F / 16F);
        gripAttachPoint = new Vector3f(158 / 16F, 52F / 16F, 0F / 16F);
        scopeAttachPoint = new Vector3f(19F / 16F, 82F / 16F, 0F / 16F);
        translateGun = new Vector3f(0.0F, -0.0625F, -0.1875F);
        translateClip = new Vector3f(0.0F, -0.625F, 0.0F);
        gunSlideDistance = 0.15F;
        animationType = EnumAnimationType.CUSTOM;
        rotateGunHorizontal = 15.0F;
        tiltGun = 30.0F;
        hasFlash = true;
        hasArms = true;
        rightHandAmmo = false;
        leftHandAmmo = true;
        fancyStance = true;
        stanceTranslate = new Vector3f(0.5D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(45.0F, 0.0F, 1.0F);
        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);
        casingAttachPoint = new Vector3f(0.63F, 1.0F, 0.0F);
        casingAnimDistance = new Vector3f(0.0F, 3.0F, 7.75F);
        casingAnimSpread = new Vector3f(3.0F, 5.0F, 3.0F);
        casingAnimTime = 4;
        casingRotateVector = new Vector3f(0.1F, 0.0F, 0.1F);
        leftArmPos = new Vector3f(0.05F, -0.4F, -0.1F);
        leftArmRot = new Vector3f(80.0F, 50.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.12F, -0.55F, -0.05F);
        leftArmReloadRot = new Vector3f(80.0F, 48.0F, 0.0F);
        rightArmPos = new Vector3f(0.25F, -0.52F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85F);
        rightArmReloadPos = new Vector3f(0.25F, -0.52F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
        caseScale = 4.5F;
        casingDelay = 0;
        flashScale = 7.0F;
        muzzleFlashPoint = new Vector3f(2.339F, 0.62642F, 0.0F);
        gunOffset = -0.1F;
        crouchZoom = -0.05F;
        zoomOffset = 0.2F;
        ShakeDistance = 0.5F;

        translateAll(5F, 11F, -0.25F);
        //修正模型位移
        Vector3f vec3 = new Vector3f(10F, 10F, 0F);
        translateAll(vec3.x, -vec3.y, vec3.z);
        Vector3f attVec = new Vector3f(vec3.x / 16F, vec3.y / 16F, vec3.z / 16F);
        barrelAttachPoint = Vector3f.add(barrelAttachPoint, attVec, null);
        gadgetAttachPoint = Vector3f.add(gadgetAttachPoint, attVec, null);
        scopeAttachPoint = Vector3f.add(scopeAttachPoint, attVec, null);
        gripAttachPoint = Vector3f.add(gripAttachPoint, attVec, null);
        stockAttachPoint = Vector3f.add(stockAttachPoint, attVec, null);
        zoomOffsetY = -0.0425F;

        flipAll();
    }

    private void initgunModel_1() {
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        gunModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 1
        gunModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 4
        gunModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 5
        gunModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 6
        gunModel[5] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 7
        gunModel[6] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 8
        gunModel[7] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 9
        gunModel[8] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 10
        gunModel[9] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 11
        gunModel[10] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 12
        gunModel[11] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 13
        gunModel[12] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 14
        gunModel[13] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 15
        gunModel[14] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 16
        gunModel[15] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 18
        gunModel[16] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 19
        gunModel[17] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 20
        gunModel[18] = new ModelRendererTurbo(this, 593, 25, textureX, textureY); // Box 21
        gunModel[19] = new ModelRendererTurbo(this, 673, 33, textureX, textureY); // Box 22
        gunModel[20] = new ModelRendererTurbo(this, 817, 33, textureX, textureY); // Box 23
        gunModel[21] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 24
        gunModel[22] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 25
        gunModel[23] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 26
        gunModel[24] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 27
        gunModel[25] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 28
        gunModel[26] = new ModelRendererTurbo(this, 545, 41, textureX, textureY); // Box 29
        gunModel[27] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 30
        gunModel[28] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 31
        gunModel[29] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 37
        gunModel[30] = new ModelRendererTurbo(this, 585, 57, textureX, textureY); // Box 39
        gunModel[31] = new ModelRendererTurbo(this, 937, 49, textureX, textureY); // Box 40
        gunModel[32] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 41
        gunModel[33] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 43
        gunModel[34] = new ModelRendererTurbo(this, 705, 9, textureX, textureY); // Box 44
        gunModel[35] = new ModelRendererTurbo(this, 753, 9, textureX, textureY); // Box 45
        gunModel[36] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 46
        gunModel[37] = new ModelRendererTurbo(this, 705, 57, textureX, textureY); // Box 47
        gunModel[38] = new ModelRendererTurbo(this, 769, 57, textureX, textureY); // Box 50
        gunModel[39] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Box 51
        gunModel[40] = new ModelRendererTurbo(this, 969, 57, textureX, textureY); // Box 52
        gunModel[41] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 54
        gunModel[42] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 55
        gunModel[43] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 56
        gunModel[44] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 57
        gunModel[45] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 58
        gunModel[46] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 59
        gunModel[47] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 60
        gunModel[48] = new ModelRendererTurbo(this, 905, 57, textureX, textureY); // Box 65
        gunModel[49] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 67
        gunModel[50] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 68
        gunModel[51] = new ModelRendererTurbo(this, 625, 81, textureX, textureY); // Box 69
        gunModel[52] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 70
        gunModel[53] = new ModelRendererTurbo(this, 681, 89, textureX, textureY); // Box 71
        gunModel[54] = new ModelRendererTurbo(this, 881, 81, textureX, textureY); // Box 72
        gunModel[55] = new ModelRendererTurbo(this, 817, 89, textureX, textureY); // 10
        gunModel[56] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // 10
        gunModel[57] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // 10
        gunModel[58] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // 10
        gunModel[59] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // 10
        gunModel[60] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // 10
        gunModel[61] = new ModelRendererTurbo(this, 849, 89, textureX, textureY); // Box 75
        gunModel[62] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 76
        gunModel[63] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 77
        gunModel[64] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 80
        gunModel[65] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 81
        gunModel[66] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 82
        gunModel[67] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 83
        gunModel[68] = new ModelRendererTurbo(this, 657, 81, textureX, textureY); // Box 89
        gunModel[69] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 90
        gunModel[70] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 91
        gunModel[71] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 93
        gunModel[72] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 94
        gunModel[73] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 95
        gunModel[74] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 96
        gunModel[75] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 97
        gunModel[76] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 98
        gunModel[77] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 99
        gunModel[78] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 100
        gunModel[79] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 101
        gunModel[80] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 86
        gunModel[81] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 87
        gunModel[82] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 88
        gunModel[83] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 90
        gunModel[84] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 91
        gunModel[85] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 93
        gunModel[86] = new ModelRendererTurbo(this, 529, 113, textureX, textureY); // Box 94
        gunModel[87] = new ModelRendererTurbo(this, 817, 113, textureX, textureY); // Box 95
        gunModel[88] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 94
        gunModel[89] = new ModelRendererTurbo(this, 937, 113, textureX, textureY); // Box 95
        gunModel[90] = new ModelRendererTurbo(this, 633, 121, textureX, textureY); // Box 96
        gunModel[91] = new ModelRendererTurbo(this, 721, 121, textureX, textureY); // Box 97
        gunModel[92] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 98
        gunModel[93] = new ModelRendererTurbo(this, 937, 129, textureX, textureY); // Box 99
        gunModel[94] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 100
        gunModel[95] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 101
        gunModel[96] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 102
        gunModel[97] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 103
        gunModel[98] = new ModelRendererTurbo(this, 801, 33, textureX, textureY); // Box 105
        gunModel[99] = new ModelRendererTurbo(this, 585, 49, textureX, textureY); // Box 106
        gunModel[100] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 107
        gunModel[101] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 108
        gunModel[102] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 109
        gunModel[103] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 111
        gunModel[104] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // 06
        gunModel[105] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // 02
        gunModel[106] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 119
        gunModel[107] = new ModelRendererTurbo(this, 521, 145, textureX, textureY); // Box 120
        gunModel[108] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 121
        gunModel[109] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 122
        gunModel[110] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 123
        gunModel[111] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 124
        gunModel[112] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 126
        gunModel[113] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 127
        gunModel[114] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 128
        gunModel[115] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 129
        gunModel[116] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 130
        gunModel[117] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 131
        gunModel[118] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 132
        gunModel[119] = new ModelRendererTurbo(this, 1001, 129, textureX, textureY); // Box 146
        gunModel[120] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 147
        gunModel[121] = new ModelRendererTurbo(this, 561, 153, textureX, textureY); // Box 258
        gunModel[122] = new ModelRendererTurbo(this, 537, 185, textureX, textureY); // Box 260
        gunModel[123] = new ModelRendererTurbo(this, 849, 145, textureX, textureY); // Box 263
        gunModel[124] = new ModelRendererTurbo(this, 889, 153, textureX, textureY); // Box 264
        gunModel[125] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 265
        gunModel[126] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 274
        gunModel[127] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 275
        gunModel[128] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 276
        gunModel[129] = new ModelRendererTurbo(this, 137, 177, textureX, textureY); // Box 277
        gunModel[130] = new ModelRendererTurbo(this, 193, 177, textureX, textureY); // Box 278
        gunModel[131] = new ModelRendererTurbo(this, 265, 177, textureX, textureY); // Box 279
        gunModel[132] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Box 280
        gunModel[133] = new ModelRendererTurbo(this, 377, 177, textureX, textureY); // Box 281
        gunModel[134] = new ModelRendererTurbo(this, 33, 193, textureX, textureY); // Box 282
        gunModel[135] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box 283
        gunModel[136] = new ModelRendererTurbo(this, 225, 193, textureX, textureY); // Box 284
        gunModel[137] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Box 285
        gunModel[138] = new ModelRendererTurbo(this, 497, 193, textureX, textureY); // Box 286
        gunModel[139] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 287
        gunModel[140] = new ModelRendererTurbo(this, 441, 201, textureX, textureY); // Box 288
        gunModel[141] = new ModelRendererTurbo(this, 121, 209, textureX, textureY); // Box 289
        gunModel[142] = new ModelRendererTurbo(this, 177, 209, textureX, textureY); // Box 290
        gunModel[143] = new ModelRendererTurbo(this, 257, 209, textureX, textureY); // Box 291
        gunModel[144] = new ModelRendererTurbo(this, 313, 209, textureX, textureY); // Box 292
        gunModel[145] = new ModelRendererTurbo(this, 369, 209, textureX, textureY); // Box 293
        gunModel[146] = new ModelRendererTurbo(this, 529, 217, textureX, textureY); // Box 294
        gunModel[147] = new ModelRendererTurbo(this, 585, 217, textureX, textureY); // Box 295
        gunModel[148] = new ModelRendererTurbo(this, 641, 217, textureX, textureY); // Box 296
        gunModel[149] = new ModelRendererTurbo(this, 697, 217, textureX, textureY); // Box 297
        gunModel[150] = new ModelRendererTurbo(this, 753, 217, textureX, textureY); // Box 298
        gunModel[151] = new ModelRendererTurbo(this, 809, 217, textureX, textureY); // Box 299
        gunModel[152] = new ModelRendererTurbo(this, 865, 217, textureX, textureY); // Box 300
        gunModel[153] = new ModelRendererTurbo(this, 921, 217, textureX, textureY); // Box 301
        gunModel[154] = new ModelRendererTurbo(this, 33, 225, textureX, textureY); // Box 302
        gunModel[155] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Box 303
        gunModel[156] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); // Box 305
        gunModel[157] = new ModelRendererTurbo(this, 241, 241, textureX, textureY); // Box 307
        gunModel[158] = new ModelRendererTurbo(this, 953, 225, textureX, textureY); // Box 314
        gunModel[159] = new ModelRendererTurbo(this, 161, 249, textureX, textureY); // Box 317
        gunModel[160] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 328
        gunModel[161] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 329
        gunModel[162] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 330
        gunModel[163] = new ModelRendererTurbo(this, 977, 169, textureX, textureY); // Box 0
        gunModel[164] = new ModelRendererTurbo(this, 993, 201, textureX, textureY); // Box 0
        gunModel[165] = new ModelRendererTurbo(this, 737, 249, textureX, textureY); // Box 0
        gunModel[166] = new ModelRendererTurbo(this, 785, 249, textureX, textureY); // Box 0
        gunModel[167] = new ModelRendererTurbo(this, 833, 249, textureX, textureY); // Box 0
        gunModel[168] = new ModelRendererTurbo(this, 881, 249, textureX, textureY); // Box 0
        gunModel[169] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 377
        gunModel[170] = new ModelRendererTurbo(this, 337, 281, textureX, textureY); // Box 378
        gunModel[171] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 379
        gunModel[172] = new ModelRendererTurbo(this, 361, 329, textureX, textureY); // Box 380
        gunModel[173] = new ModelRendererTurbo(this, 345, 361, textureX, textureY); // Box 381
        gunModel[174] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Box 382
        gunModel[175] = new ModelRendererTurbo(this, 689, 385, textureX, textureY); // Box 383
        gunModel[176] = new ModelRendererTurbo(this, 697, 297, textureX, textureY); // Box 384
        gunModel[177] = new ModelRendererTurbo(this, 345, 409, textureX, textureY); // Box 385
        gunModel[178] = new ModelRendererTurbo(this, 681, 417, textureX, textureY); // Box 386
        gunModel[179] = new ModelRendererTurbo(this, 1, 433, textureX, textureY); // Box 387
        gunModel[180] = new ModelRendererTurbo(this, 321, 457, textureX, textureY); // Box 388
        gunModel[181] = new ModelRendererTurbo(this, 929, 257, textureX, textureY); // Box 389
        gunModel[182] = new ModelRendererTurbo(this, 721, 329, textureX, textureY); // Box 390
        gunModel[183] = new ModelRendererTurbo(this, 825, 329, textureX, textureY); // Box 391
        gunModel[184] = new ModelRendererTurbo(this, 897, 329, textureX, textureY); // Box 392
        gunModel[185] = new ModelRendererTurbo(this, 657, 465, textureX, textureY); // Box 393
        gunModel[186] = new ModelRendererTurbo(this, 761, 465, textureX, textureY); // Box 394
        gunModel[187] = new ModelRendererTurbo(this, 977, 353, textureX, textureY); // Box 395
        gunModel[188] = new ModelRendererTurbo(this, 865, 465, textureX, textureY); // Box 396
        gunModel[189] = new ModelRendererTurbo(this, 913, 465, textureX, textureY); // Box 397
        gunModel[190] = new ModelRendererTurbo(this, 561, 145, textureX, textureY); // Box 398
        gunModel[191] = new ModelRendererTurbo(this, 961, 465, textureX, textureY); // Box 399
        gunModel[192] = new ModelRendererTurbo(this, 1, 481, textureX, textureY); // Box 400
        gunModel[193] = new ModelRendererTurbo(this, 49, 481, textureX, textureY); // Box 401
        gunModel[194] = new ModelRendererTurbo(this, 97, 481, textureX, textureY); // Box 402
        gunModel[195] = new ModelRendererTurbo(this, 153, 481, textureX, textureY); // Box 403
        gunModel[196] = new ModelRendererTurbo(this, 209, 481, textureX, textureY); // Box 404
        gunModel[197] = new ModelRendererTurbo(this, 241, 481, textureX, textureY); // Box 405
        gunModel[198] = new ModelRendererTurbo(this, 273, 505, textureX, textureY); // Box 406
        gunModel[199] = new ModelRendererTurbo(this, 769, 513, textureX, textureY); // Box 425
        gunModel[200] = new ModelRendererTurbo(this, 865, 513, textureX, textureY); // Box 426
        gunModel[201] = new ModelRendererTurbo(this, 305, 497, textureX, textureY); // Box 427
        gunModel[202] = new ModelRendererTurbo(this, 921, 513, textureX, textureY); // Box 428
        gunModel[203] = new ModelRendererTurbo(this, 801, 521, textureX, textureY); // Box 429
        gunModel[204] = new ModelRendererTurbo(this, 97, 529, textureX, textureY); // Box 430
        gunModel[205] = new ModelRendererTurbo(this, 41, 257, textureX, textureY); // Box 431
        gunModel[206] = new ModelRendererTurbo(this, 977, 513, textureX, textureY); // Box 432
        gunModel[207] = new ModelRendererTurbo(this, 249, 529, textureX, textureY); // Box 433
        gunModel[208] = new ModelRendererTurbo(this, 305, 529, textureX, textureY); // Box 434
        gunModel[209] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 435
        gunModel[210] = new ModelRendererTurbo(this, 353, 529, textureX, textureY); // Box 436
        gunModel[211] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Box 437
        gunModel[212] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Box 439
        gunModel[213] = new ModelRendererTurbo(this, 689, 25, textureX, textureY); // Box 502
        gunModel[214] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 503
        gunModel[215] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 504
        gunModel[216] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 505
        gunModel[217] = new ModelRendererTurbo(this, 153, 313, textureX, textureY); // Box 506
        gunModel[218] = new ModelRendererTurbo(this, 745, 585, textureX, textureY); // Box 507
        gunModel[219] = new ModelRendererTurbo(this, 809, 361, textureX, textureY); // Box 508
        gunModel[220] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 521
        gunModel[221] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 522
        gunModel[222] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 523
        gunModel[223] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 524
        gunModel[224] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 525
        gunModel[225] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 526
        gunModel[226] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 527
        gunModel[227] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 528
        gunModel[228] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 529
        gunModel[229] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 530
        gunModel[230] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 531
        gunModel[231] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 532
        gunModel[232] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Box 533
        gunModel[233] = new ModelRendererTurbo(this, 577, 33, textureX, textureY); // Box 534
        gunModel[234] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 535
        gunModel[235] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 536
        gunModel[236] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 537
        gunModel[237] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 538
        gunModel[238] = new ModelRendererTurbo(this, 593, 33, textureX, textureY); // Box 539
        gunModel[239] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 540
        gunModel[240] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 541
        gunModel[241] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 542
        gunModel[242] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 543
        gunModel[243] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 544
        gunModel[244] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 545
        gunModel[245] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 546
        gunModel[246] = new ModelRendererTurbo(this, 657, 49, textureX, textureY); // Box 547
        gunModel[247] = new ModelRendererTurbo(this, 985, 49, textureX, textureY); // Box 548
        gunModel[248] = new ModelRendererTurbo(this, 705, 57, textureX, textureY); // Box 549
        gunModel[249] = new ModelRendererTurbo(this, 393, 593, textureX, textureY); // Box 260
        gunModel[250] = new ModelRendererTurbo(this, 1, 601, textureX, textureY); // Box 260
        gunModel[251] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Box 260
        gunModel[252] = new ModelRendererTurbo(this, 841, 585, textureX, textureY); // Box 305
        gunModel[253] = new ModelRendererTurbo(this, 257, 593, textureX, textureY); // Box 305
        gunModel[254] = new ModelRendererTurbo(this, 649, 593, textureX, textureY); // Box 305
        gunModel[255] = new ModelRendererTurbo(this, 705, 593, textureX, textureY); // Box 305
        gunModel[256] = new ModelRendererTurbo(this, 873, 593, textureX, textureY); // Box 305
        gunModel[257] = new ModelRendererTurbo(this, 289, 601, textureX, textureY); // Box 305
        gunModel[258] = new ModelRendererTurbo(this, 705, 377, textureX, textureY); // Box 260
        gunModel[259] = new ModelRendererTurbo(this, 769, 57, textureX, textureY); // Box 260
        gunModel[260] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Box 260
        gunModel[261] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 260
        gunModel[262] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 260
        gunModel[263] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 260
        gunModel[264] = new ModelRendererTurbo(this, 1009, 65, textureX, textureY); // Box 260
        gunModel[265] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 260
        gunModel[266] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 260
        gunModel[267] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 260
        gunModel[268] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 260
        gunModel[269] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 260
        gunModel[270] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 260
        gunModel[271] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 260
        gunModel[272] = new ModelRendererTurbo(this, 953, 33, textureX, textureY); // Box 260
        gunModel[273] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 260
        gunModel[274] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 260
        gunModel[275] = new ModelRendererTurbo(this, 585, 41, textureX, textureY); // Box 260
        gunModel[276] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Box 260
        gunModel[277] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 260
        gunModel[278] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 260
        gunModel[279] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 260
        gunModel[280] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 260
        gunModel[281] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // Box 260
        gunModel[282] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 260
        gunModel[283] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 260
        gunModel[284] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 260
        gunModel[285] = new ModelRendererTurbo(this, 681, 57, textureX, textureY); // Box 260
        gunModel[286] = new ModelRendererTurbo(this, 745, 57, textureX, textureY); // Box 260
        gunModel[287] = new ModelRendererTurbo(this, 913, 57, textureX, textureY); // Box 260
        gunModel[288] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 260
        gunModel[289] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 260
        gunModel[290] = new ModelRendererTurbo(this, 329, 609, textureX, textureY); // Box 260
        gunModel[291] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 260
        gunModel[292] = new ModelRendererTurbo(this, 329, 617, textureX, textureY); // Box 260
        gunModel[293] = new ModelRendererTurbo(this, 705, 65, textureX, textureY); // Box 260
        gunModel[294] = new ModelRendererTurbo(this, 769, 65, textureX, textureY); // Box 260
        gunModel[295] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 260
        gunModel[296] = new ModelRendererTurbo(this, 545, 73, textureX, textureY); // Box 260
        gunModel[297] = new ModelRendererTurbo(this, 561, 73, textureX, textureY); // Box 260
        gunModel[298] = new ModelRendererTurbo(this, 625, 81, textureX, textureY); // Box 260
        gunModel[299] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 260
        gunModel[300] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 260
        gunModel[301] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 260
        gunModel[302] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 260
        gunModel[303] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 260
        gunModel[304] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 260
        gunModel[305] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 260
        gunModel[306] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 260
        gunModel[307] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 260
        gunModel[308] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 260
        gunModel[309] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 260
        gunModel[310] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 260
        gunModel[311] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 260
        gunModel[312] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 260
        gunModel[313] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 260
        gunModel[314] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 260
        gunModel[315] = new ModelRendererTurbo(this, 513, 17, textureX, textureY); // Box 260
        gunModel[316] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Box 260
        gunModel[317] = new ModelRendererTurbo(this, 553, 17, textureX, textureY); // Box 260
        gunModel[318] = new ModelRendererTurbo(this, 561, 17, textureX, textureY); // Box 260
        gunModel[319] = new ModelRendererTurbo(this, 569, 17, textureX, textureY); // Box 260
        gunModel[320] = new ModelRendererTurbo(this, 593, 17, textureX, textureY); // Box 260
        gunModel[321] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Box 260
        gunModel[322] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Box 260
        gunModel[323] = new ModelRendererTurbo(this, 1, 625, textureX, textureY); // Box 260
        gunModel[324] = new ModelRendererTurbo(this, 769, 81, textureX, textureY); // Box 260
        gunModel[325] = new ModelRendererTurbo(this, 353, 625, textureX, textureY); // Box 260
        gunModel[326] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 260
        gunModel[327] = new ModelRendererTurbo(this, 681, 81, textureX, textureY); // Box 260
        gunModel[328] = new ModelRendererTurbo(this, 801, 81, textureX, textureY); // Box 260
        gunModel[329] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Box 260
        gunModel[330] = new ModelRendererTurbo(this, 1009, 81, textureX, textureY); // Box 260
        gunModel[331] = new ModelRendererTurbo(this, 625, 89, textureX, textureY); // Box 260
        gunModel[332] = new ModelRendererTurbo(this, 617, 17, textureX, textureY); // Box 260
        gunModel[333] = new ModelRendererTurbo(this, 625, 17, textureX, textureY); // Box 260
        gunModel[334] = new ModelRendererTurbo(this, 649, 17, textureX, textureY); // Box 260
        gunModel[335] = new ModelRendererTurbo(this, 657, 17, textureX, textureY); // Box 260
        gunModel[336] = new ModelRendererTurbo(this, 665, 17, textureX, textureY); // Box 260
        gunModel[337] = new ModelRendererTurbo(this, 673, 17, textureX, textureY); // Box 260
        gunModel[338] = new ModelRendererTurbo(this, 681, 17, textureX, textureY); // Box 260
        gunModel[339] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Box 260
        gunModel[340] = new ModelRendererTurbo(this, 713, 17, textureX, textureY); // Box 260
        gunModel[341] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Box 260
        gunModel[342] = new ModelRendererTurbo(this, 737, 17, textureX, textureY); // Box 260
        gunModel[343] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Box 260
        gunModel[344] = new ModelRendererTurbo(this, 761, 17, textureX, textureY); // Box 260
        gunModel[345] = new ModelRendererTurbo(this, 777, 17, textureX, textureY); // Box 260
        gunModel[346] = new ModelRendererTurbo(this, 785, 17, textureX, textureY); // Box 260
        gunModel[347] = new ModelRendererTurbo(this, 945, 17, textureX, textureY); // Box 260
        gunModel[348] = new ModelRendererTurbo(this, 953, 17, textureX, textureY); // Box 260
        gunModel[349] = new ModelRendererTurbo(this, 961, 17, textureX, textureY); // Box 260
        gunModel[350] = new ModelRendererTurbo(this, 969, 17, textureX, textureY); // Box 260
        gunModel[351] = new ModelRendererTurbo(this, 705, 25, textureX, textureY); // Box 260
        gunModel[352] = new ModelRendererTurbo(this, 713, 25, textureX, textureY); // Box 260
        gunModel[353] = new ModelRendererTurbo(this, 729, 25, textureX, textureY); // Box 260
        gunModel[354] = new ModelRendererTurbo(this, 737, 25, textureX, textureY); // Box 260
        gunModel[355] = new ModelRendererTurbo(this, 745, 25, textureX, textureY); // Box 260
        gunModel[356] = new ModelRendererTurbo(this, 617, 625, textureX, textureY); // Box 260
        gunModel[357] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 260
        gunModel[358] = new ModelRendererTurbo(this, 1, 633, textureX, textureY); // Box 260
        gunModel[359] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 260
        gunModel[360] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 260
        gunModel[361] = new ModelRendererTurbo(this, 881, 89, textureX, textureY); // Box 260
        gunModel[362] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Box 260
        gunModel[363] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 260
        gunModel[364] = new ModelRendererTurbo(this, 585, 105, textureX, textureY); // Box 260
        gunModel[365] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 260
        gunModel[366] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 260
        gunModel[367] = new ModelRendererTurbo(this, 609, 105, textureX, textureY); // Box 260
        gunModel[368] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 260
        gunModel[369] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 260
        gunModel[370] = new ModelRendererTurbo(this, 681, 65, textureX, textureY); // Box 260
        gunModel[371] = new ModelRendererTurbo(this, 745, 65, textureX, textureY); // Box 260
        gunModel[372] = new ModelRendererTurbo(this, 913, 65, textureX, textureY); // Box 260
        gunModel[373] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 260
        gunModel[374] = new ModelRendererTurbo(this, 577, 73, textureX, textureY); // Box 260
        gunModel[375] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 260
        gunModel[376] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 260
        gunModel[377] = new ModelRendererTurbo(this, 657, 81, textureX, textureY); // Box 260
        gunModel[378] = new ModelRendererTurbo(this, 697, 81, textureX, textureY); // Box 260
        gunModel[379] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 260
        gunModel[380] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 260
        gunModel[381] = new ModelRendererTurbo(this, 689, 89, textureX, textureY); // Box 260
        gunModel[382] = new ModelRendererTurbo(this, 817, 89, textureX, textureY); // Box 260
        gunModel[383] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 260
        gunModel[384] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 260
        gunModel[385] = new ModelRendererTurbo(this, 689, 97, textureX, textureY); // Box 260
        gunModel[386] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 260
        gunModel[387] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 260
        gunModel[388] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 260
        gunModel[389] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 260
        gunModel[390] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 260
        gunModel[391] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 260
        gunModel[392] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 260
        gunModel[393] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 260
        gunModel[394] = new ModelRendererTurbo(this, 265, 633, textureX, textureY); // Box 260
        gunModel[395] = new ModelRendererTurbo(this, 529, 633, textureX, textureY); // Box 260
        gunModel[396] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 260
        gunModel[397] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 260
        gunModel[398] = new ModelRendererTurbo(this, 1, 641, textureX, textureY); // Box 260
        gunModel[399] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 260
        gunModel[400] = new ModelRendererTurbo(this, 265, 641, textureX, textureY); // Box 260
        gunModel[401] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 260
        gunModel[402] = new ModelRendererTurbo(this, 641, 113, textureX, textureY); // Box 260
        gunModel[403] = new ModelRendererTurbo(this, 657, 113, textureX, textureY); // Box 260
        gunModel[404] = new ModelRendererTurbo(this, 1009, 113, textureX, textureY); // Box 260
        gunModel[405] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 260
        gunModel[406] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 260
        gunModel[407] = new ModelRendererTurbo(this, 753, 25, textureX, textureY); // Box 260
        gunModel[408] = new ModelRendererTurbo(this, 761, 25, textureX, textureY); // Box 260
        gunModel[409] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 260
        gunModel[410] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 260
        gunModel[411] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 260
        gunModel[412] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Box 260
        gunModel[413] = new ModelRendererTurbo(this, 601, 41, textureX, textureY); // Box 260
        gunModel[414] = new ModelRendererTurbo(this, 673, 41, textureX, textureY); // Box 260
        gunModel[415] = new ModelRendererTurbo(this, 681, 41, textureX, textureY); // Box 260
        gunModel[416] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 260
        gunModel[417] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 260
        gunModel[418] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 260
        gunModel[419] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 260
        gunModel[420] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 260
        gunModel[421] = new ModelRendererTurbo(this, 673, 49, textureX, textureY); // Box 260
        gunModel[422] = new ModelRendererTurbo(this, 681, 49, textureX, textureY); // Box 260
        gunModel[423] = new ModelRendererTurbo(this, 801, 49, textureX, textureY); // Box 260
        gunModel[424] = new ModelRendererTurbo(this, 809, 49, textureX, textureY); // Box 260
        gunModel[425] = new ModelRendererTurbo(this, 817, 49, textureX, textureY); // Box 260
        gunModel[426] = new ModelRendererTurbo(this, 825, 49, textureX, textureY); // Box 260
        gunModel[427] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 260
        gunModel[428] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 260
        gunModel[429] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 260
        gunModel[430] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 260
        gunModel[431] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 260
        gunModel[432] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 260
        gunModel[433] = new ModelRendererTurbo(this, 537, 113, textureX, textureY); // Box 260
        gunModel[434] = new ModelRendererTurbo(this, 673, 113, textureX, textureY); // Box 260
        gunModel[435] = new ModelRendererTurbo(this, 833, 113, textureX, textureY); // Box 260
        gunModel[436] = new ModelRendererTurbo(this, 905, 601, textureX, textureY); // Box 287
        gunModel[437] = new ModelRendererTurbo(this, 961, 601, textureX, textureY); // Box 288
        gunModel[438] = new ModelRendererTurbo(this, 857, 625, textureX, textureY); // Box 289
        gunModel[439] = new ModelRendererTurbo(this, 769, 633, textureX, textureY); // Box 290
        gunModel[440] = new ModelRendererTurbo(this, 825, 633, textureX, textureY); // Box 291
        gunModel[441] = new ModelRendererTurbo(this, 889, 633, textureX, textureY); // Box 292
        gunModel[442] = new ModelRendererTurbo(this, 945, 633, textureX, textureY); // Box 293
        gunModel[443] = new ModelRendererTurbo(this, 505, 641, textureX, textureY); // Box 294
        gunModel[444] = new ModelRendererTurbo(this, 561, 641, textureX, textureY); // Box 295
        gunModel[445] = new ModelRendererTurbo(this, 617, 641, textureX, textureY); // Box 296
        gunModel[446] = new ModelRendererTurbo(this, 673, 641, textureX, textureY); // Box 297
        gunModel[447] = new ModelRendererTurbo(this, 729, 641, textureX, textureY); // Box 298
        gunModel[448] = new ModelRendererTurbo(this, 1, 649, textureX, textureY); // Box 299
        gunModel[449] = new ModelRendererTurbo(this, 57, 649, textureX, textureY); // Box 300
        gunModel[450] = new ModelRendererTurbo(this, 113, 649, textureX, textureY); // Box 301
        gunModel[451] = new ModelRendererTurbo(this, 169, 649, textureX, textureY); // Box 302
        gunModel[452] = new ModelRendererTurbo(this, 225, 649, textureX, textureY); // Box 303
        gunModel[453] = new ModelRendererTurbo(this, 281, 649, textureX, textureY); // Box 305
        gunModel[454] = new ModelRendererTurbo(this, 337, 649, textureX, textureY); // Box 305
        gunModel[455] = new ModelRendererTurbo(this, 393, 649, textureX, textureY); // Box 305
        gunModel[456] = new ModelRendererTurbo(this, 449, 649, textureX, textureY); // Box 305
        gunModel[457] = new ModelRendererTurbo(this, 761, 665, textureX, textureY); // Box 305
        gunModel[458] = new ModelRendererTurbo(this, 857, 657, textureX, textureY); // Box 305
        gunModel[459] = new ModelRendererTurbo(this, 825, 665, textureX, textureY); // Box 305
        gunModel[460] = new ModelRendererTurbo(this, 889, 665, textureX, textureY); // Box 287
        gunModel[461] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 260
        gunModel[462] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 260
        gunModel[463] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 260
        gunModel[464] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 260
        gunModel[465] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 260
        gunModel[466] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 260
        gunModel[467] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 260
        gunModel[468] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 260
        gunModel[469] = new ModelRendererTurbo(this, 545, 57, textureX, textureY); // Box 260
        gunModel[470] = new ModelRendererTurbo(this, 553, 57, textureX, textureY); // Box 260
        gunModel[471] = new ModelRendererTurbo(this, 585, 57, textureX, textureY); // Box 260
        gunModel[472] = new ModelRendererTurbo(this, 593, 57, textureX, textureY); // Box 260
        gunModel[473] = new ModelRendererTurbo(this, 689, 57, textureX, textureY); // Box 260
        gunModel[474] = new ModelRendererTurbo(this, 753, 57, textureX, textureY); // Box 260
        gunModel[475] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 260
        gunModel[476] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 260
        gunModel[477] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 260
        gunModel[478] = new ModelRendererTurbo(this, 689, 65, textureX, textureY); // Box 260
        gunModel[479] = new ModelRendererTurbo(this, 753, 65, textureX, textureY); // Box 260
        gunModel[480] = new ModelRendererTurbo(this, 937, 65, textureX, textureY); // Box 260
        gunModel[481] = new ModelRendererTurbo(this, 945, 65, textureX, textureY); // Box 260
        gunModel[482] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 260
        gunModel[483] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 260
        gunModel[484] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 260

        gunModel[0].addShapeBox(-1F, -1F, 0F, 2, 6, 19, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 0
        gunModel[0].setRotationPoint(-126.55F, -80F, -9.8F);

        gunModel[1].addShapeBox(-1F, -1F, 0F, 2, 3, 19, 0F, 0F, 0.5F, -1F, 0.25F, 0.5F, -1F, 0.25F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0.75F, 0F, -0.5F, 0.75F); // Box 1
        gunModel[1].setRotationPoint(-126.55F, -83F, -9.8F);

        gunModel[2].addShapeBox(-1F, -1F, 0F, 2, 3, 19, 0F, 0F, 1F, -6F, 0.25F, 1F, -6F, 0.25F, 1F, -5.25F, 0F, 1F, -5.25F, 0F, -0.5F, -1F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 4
        gunModel[2].setRotationPoint(-126.55F, -86F, -9.8F);

        gunModel[3].addShapeBox(-1F, -1F, 0F, 2, 34, 19, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0.75F, 0F, 0.5F, 0.75F, -4.45F, 0.5F, -2F, 4.7F, 0.5F, -2F, 4.7F, 0.5F, -1.25F, -4.45F, 0.5F, -1.25F); // Box 5
        gunModel[3].setRotationPoint(-126.55F, -73.5F, -9.8F);

        gunModel[4].addShapeBox(-1F, -1F, 0F, 3, 6, 19, 0F, 0F, 0.5F, -2F, -0.75F, 0.5F, -2F, -0.75F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, -1.25F, 0.5F, -2F, 0.25F, 0.5F, -2F, 0.25F, 0.5F, -1.25F, -1.25F, 0.5F, -1.25F); // Box 6
        gunModel[4].setRotationPoint(-122.1F, -38.5F, -9.8F);

        gunModel[5].addShapeBox(-1F, -1F, 0F, 2, 3, 19, 0F, -0.25F, 0.5F, -2F, 0.25F, 0.5F, -2F, 0.25F, 0.5F, -1.25F, -0.25F, 0.5F, -1.25F, -1F, 0.5F, -4F, 0.25F, 0.5F, -4F, 0.25F, 0.5F, -3.25F, -1F, 0.5F, -3.25F); // Box 7
        gunModel[5].setRotationPoint(-121.1F, -31.5F, -9.8F);

        gunModel[6].addShapeBox(-1F, -1F, 0F, 2, 1, 19, 0F, -1F, 0.5F, -4F, 0.25F, 0.5F, -4F, 0.25F, 0.5F, -3.25F, -1F, 0.5F, -3.25F, -1.25F, 0.5F, -7F, 0.25F, 0.5F, -7F, 0.25F, 0.5F, -6.25F, -1.25F, 0.5F, -6.25F); // Box 8
        gunModel[6].setRotationPoint(-121.1F, -27.5F, -9.8F);

        gunModel[7].addShapeBox(-1F, -1F, 0F, 7, 3, 19, 0F, 0F, 0.75F, -6.25F, 0.6F, 0.75F, -6.25F, 0.6F, 0.75F, -5.5F, 0F, 0.75F, -5.5F, 0F, -0.5F, -1.25F, 0.6F, -0.5F, -1.25F, 0.6F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 9
        gunModel[7].setRotationPoint(-124.3F, -86F, -9.8F);

        gunModel[8].addShapeBox(-1F, -1F, 0F, 7, 3, 19, 0F, 0F, 0.5F, -1.25F, 0.6F, 0.5F, -1.25F, 0.6F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.25F, 0.6F, -0.5F, -0.25F, 0.6F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 10
        gunModel[8].setRotationPoint(-124.3F, -83F, -9.8F);

        gunModel[9].addShapeBox(-1F, -1F, 0F, 7, 6, 19, 0F, 0F, 0.5F, -0.25F, 0.6F, 0.5F, -0.25F, 0.6F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, -0.25F, 0.6F, 0F, -0.25F, 0.6F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 11
        gunModel[9].setRotationPoint(-124.3F, -80F, -9.8F);

        gunModel[10].addShapeBox(-1F, -1F, 0F, 7, 34, 19, 0F, 0F, 0.5F, -0.25F, 0.6F, 0.5F, -0.25F, 0.6F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -4.45F, 0.5F, -2.25F, 5.05F, 0.5F, -2.25F, 5.05F, 0.5F, -1.5F, -4.45F, 0.5F, -1.5F); // Box 12
        gunModel[10].setRotationPoint(-124.3F, -73.5F, -9.8F);

        gunModel[11].addShapeBox(-1F, -1F, 0F, 6, 6, 19, 0F, 1F, 0.5F, -2.25F, 0.6F, 0.5F, -2.25F, 0.6F, 0.5F, -1.5F, 1F, 0.5F, -1.5F, 0F, 0.5F, -2.25F, 0.6F, 0.5F, -2.25F, 0.6F, 0.5F, -1.5F, 0F, 0.5F, -1.5F); // Box 13
        gunModel[11].setRotationPoint(-118.85F, -38.5F, -9.8F);

        gunModel[12].addShapeBox(-1F, -1F, 0F, 6, 3, 19, 0F, 0F, 0.5F, -2.25F, 0.6F, 0.5F, -2.25F, 0.6F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -4.25F, 0.6F, 0.5F, -4.25F, 0.6F, 0.5F, -3.5F, 0F, 0.5F, -3.5F); // Box 14
        gunModel[12].setRotationPoint(-118.85F, -31.5F, -9.8F);

        gunModel[13].addShapeBox(-1F, -1F, 0F, 6, 1, 19, 0F, 0F, 0.5F, -4F, 0.6F, 0.5F, -4F, 0.6F, 0.5F, -3.5F, 0F, 0.5F, -3.5F, 0F, 0.5F, -7F, 0.6F, 0.5F, -7F, 0.6F, 0.5F, -6.5F, 0F, 0.5F, -6.5F); // Box 15
        gunModel[13].setRotationPoint(-118.85F, -27.5F, -9.8F);

        gunModel[14].addShapeBox(-1F, -1F, 0F, 2, 2, 19, 0F, 1F, 0.5F, -7.75F, 1F, 0.5F, -7.75F, 1F, 0.5F, -7.5F, 1F, 0.5F, -7.5F, 1F, 0F, -2.75F, 1F, 0F, -3.8F, 1F, 0F, -3.05F, 1F, 0F, -2F); // Box 16
        gunModel[14].setRotationPoint(-38F, -84.75F, -9.8F);

        gunModel[15].addShapeBox(-1F, -1F, 0F, 71, 7, 19, 0F, 0F, 0.5F, -2.75F, 0.6F, 0.5F, -2.75F, 0.6F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2.75F, 4.6F, 0.5F, -2.75F, 4.6F, 0.5F, -2F, 0F, 0.5F, -2F); // Box 18
        gunModel[15].setRotationPoint(-116.7F, -82.25F, -9.8F);

        gunModel[16].addShapeBox(-1F, -1F, 0F, 75, 4, 19, 0F, 0F, 0.5F, -2.75F, 0.6F, 0.5F, -2.75F, 0.6F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -4.75F, 2.7F, 0.5F, -4.75F, 2.7F, 0.5F, -4F, 0F, 0.5F, -4F); // Box 19
        gunModel[16].setRotationPoint(-116.7F, -74.25F, -9.8F);

        gunModel[17].addShapeBox(-1F, -1F, 0F, 27, 6, 19, 0F, 0F, 0.5F, -4.75F, 0F, 0.5F, -4.75F, 0F, 0.5F, -4F, 0F, 0.5F, -4F, 0F, 0.5F, -4.75F, 0F, 0.5F, -4.75F, 0F, 0.5F, -4F, 0F, 0.5F, -4F); // Box 20
        gunModel[17].setRotationPoint(-66F, -69.25F, -9.8F);

        gunModel[18].addShapeBox(-1F, -1F, 0F, 27, 2, 19, 0F, 0F, 0F, -4.75F, 0F, 0F, -4.75F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0.4F, -6.25F, 0F, 0.4F, -6.25F, 0F, 0.4F, -5.5F, 0F, 0.4F, -5.5F); // Box 21
        gunModel[18].setRotationPoint(-66F, -62.75F, -9.8F);

        gunModel[19].addShapeBox(-1F, -1F, 0F, 51, 4, 19, 0F, 0F, 0.5F, -4.75F, 0F, 0.5F, -4.75F, 0F, 0.5F, -4F, 0F, 0.5F, -4F, 0F, 1.25F, -4.75F, 0F, 1.25F, -4.75F, 0F, 1.25F, -4F, 0F, 1.25F, -4F); // Box 22
        gunModel[19].setRotationPoint(-117F, -69.25F, -9.8F);

        gunModel[20].addShapeBox(-1F, -1F, 0F, 50, 2, 19, 0F, 0F, 0F, -4.75F, 0F, 0F, -4.75F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0.4F, -6.25F, 0F, 0.4F, -6.25F, 0F, 0.4F, -5.5F, 0F, 0.4F, -5.5F); // Box 23
        gunModel[20].setRotationPoint(-116F, -64F, -9.8F);

        gunModel[21].addShapeBox(-1F, -1F, 0F, 6, 22, 19, 0F, 0F, 0F, -6.25F, 0F, 0F, -6.25F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0.4F, -6.25F, -2F, 0.4F, -6.25F, -2F, 0.4F, -5.5F, 0F, 0.4F, -5.5F); // Box 24
        gunModel[21].setRotationPoint(-116F, -61.6F, -9.8F);

        gunModel[22].addShapeBox(-1F, -1F, 0F, 10, 1, 19, 0F, 0F, 0F, -4.75F, 0.95F, 0F, -4.75F, 0.95F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -5.25F, 0.95F, 0F, -5.25F, 0.95F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 25
        gunModel[22].setRotationPoint(-112.25F, -31.85F, -9.8F);

        gunModel[23].addShapeBox(-1F, -1F, 0F, 10, 1, 19, 0F, 0F, 0F, -5.25F, 0.95F, 0F, -5.25F, 0.95F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -6F, 0.95F, 0F, -6F, 0.95F, 0F, -5.25F, 0F, 0F, -5.25F); // Box 26
        gunModel[23].setRotationPoint(-112.25F, -30.85F, -9.8F);

        gunModel[24].addShapeBox(-1F, -1F, 0F, 10, 1, 19, 0F, 0F, 0F, -6F, 0.95F, 0F, -6F, 0.95F, 0F, -5.25F, 0F, 0F, -5.25F, 0F, 0F, -7.5F, 0.95F, 0F, -7.5F, 0.95F, 0F, -6.75F, 0F, 0F, -6.75F); // Box 27
        gunModel[24].setRotationPoint(-112.25F, -29.85F, -9.8F);

        gunModel[25].addShapeBox(-1F, -1F, 0F, 10, 1, 19, 0F, 0F, 0F, -7.5F, 0.95F, 0F, -7.5F, 0.95F, 0F, -6.75F, 0F, 0F, -6.75F, 0F, -0.5F, -9.25F, 0.95F, -0.5F, -9.25F, 0.95F, -0.5F, -8.5F, 0F, -0.5F, -8.5F); // Box 28
        gunModel[25].setRotationPoint(-112.25F, -28.85F, -9.8F);

        gunModel[26].addShapeBox(-1F, -1F, 0F, 10, 7, 19, 0F, 0F, 0.25F, -4.75F, 0.95F, 0.25F, -4.75F, 0.95F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, -4.75F, 0.95F, 0F, -4.75F, 0.95F, 0F, -4F, 0F, 0F, -4F); // Box 29
        gunModel[26].setRotationPoint(-112.25F, -38.85F, -9.8F);

        gunModel[27].addShapeBox(-1F, -1F, 0F, 8, 2, 19, 0F, 0F, 0F, -6.75F, 0F, 0F, -6.75F, 0F, 0F, -6F, 0F, 0F, -6F, -0.25F, 0.9F, -7F, -0.25F, 0F, -7F, -0.25F, 0F, -6.25F, -0.25F, 0.9F, -6.25F); // Box 30
        gunModel[27].setRotationPoint(-106.75F, -61.6F, -9.8F);

        gunModel[28].addShapeBox(-1F, -1F, 0F, 38, 2, 19, 0F, 0F, -28.4F, -4.75F, 0F, 0F, -4.75F, 0F, 0F, -4F, 0F, -28.4F, -4F, 0F, 28.4F, -6.25F, 0F, 0.4F, -6.25F, 0F, 0.4F, -5.5F, 0F, 28.4F, -5.5F); // Box 31
        gunModel[28].setRotationPoint(-104F, -62.75F, -9.8F);

        gunModel[29].addShapeBox(-1F, -1F, 0F, 38, 2, 19, 0F, 0F, 0.4F, -6.25F, 0F, 28.4F, -6.25F, 0F, 28.4F, -5.5F, 0F, 0.4F, -5.5F, 0F, 0F, -4.75F, 0F, -28.4F, -4.75F, 0F, -28.4F, -4F, 0F, 0F, -4F); // Box 37
        gunModel[29].setRotationPoint(-108F, -38.75F, -9.8F);

        gunModel[30].addShapeBox(-1F, -1F, 0F, 38, 2, 19, 0F, 0F, 0.25F, -4.75F, 1F, 29.4F, -4.75F, 1F, 29.4F, -4F, 0F, 0.25F, -4F, 0F, 3.15F, -4.75F, 1F, -26F, -4.75F, 1F, -26F, -4F, 0F, 3.15F, -4F); // Box 39
        gunModel[30].setRotationPoint(-105F, -38.75F, -9.8F);

        gunModel[31].addShapeBox(-1F, -1F, 0F, 3, 7, 19, 0F, 0F, 0.25F, -4.75F, 0F, 0.25F, -7F, 0F, 0.25F, -6.25F, 0F, 0.25F, -4F, 0F, 0F, -4.75F, 0F, 0F, -7F, 0F, 0F, -6.25F, 0F, 0F, -4F); // Box 40
        gunModel[31].setRotationPoint(-101.3F, -38.85F, -9.8F);

        gunModel[32].addShapeBox(-1F, -1F, 0F, 3, 1, 19, 0F, 0F, 0F, -4.75F, 0F, 0F, -7F, 0F, 0F, -6.25F, 0F, 0F, -4F, 0F, 0F, -5.25F, 0F, 0F, -7.5F, 0F, 0F, -6.75F, 0F, 0F, -4.5F); // Box 41
        gunModel[32].setRotationPoint(-101.3F, -31.85F, -9.8F);

        gunModel[33].addShapeBox(-1F, -1F, 0F, 3, 1, 19, 0F, 0F, 0F, -5.25F, 0F, 0F, -7.5F, 0F, 0F, -6.75F, 0F, 0F, -4.5F, 0F, 0F, -6F, -0.75F, 0F, -8.25F, -0.75F, 0F, -7.5F, 0F, 0F, -5.25F); // Box 43
        gunModel[33].setRotationPoint(-101.3F, -30.85F, -9.8F);

        gunModel[34].addShapeBox(-1F, -1F, 0F, 2, 1, 19, 0F, 0F, 0F, -6F, 0.25F, 0F, -8.25F, 0.25F, 0F, -7.5F, 0F, 0F, -5.25F, 0F, 0F, -7.5F, -1F, 0F, -9.75F, -1F, 0F, -9F, 0F, 0F, -6.75F); // Box 44
        gunModel[34].setRotationPoint(-101.3F, -29.85F, -9.8F);

        gunModel[35].addShapeBox(-1F, -1F, 0F, 1, 1, 19, 0F, 0F, 0F, -7.5F, 0F, 0F, -9.75F, 0F, 0F, -9F, 0F, 0F, -6.75F, 0F, -0.5F, -9.25F, -1F, -0.5F, -9.25F, -1F, -0.5F, -8.5F, 0F, -0.5F, -8.5F); // Box 45
        gunModel[35].setRotationPoint(-101.3F, -28.85F, -9.8F);

        gunModel[36].addShapeBox(-1F, -1F, -10F, 11, 2, 19, 0F, 0F, 0F, -4.75F, 0F, 0F, -4.75F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0.4F, -6.25F, 0F, 0.4F, -6.25F, 0F, 0.4F, -5.5F, 0F, 0.4F, -5.5F); // Box 46
        gunModel[36].setRotationPoint(-88F, -64F, 0.2F);
        gunModel[36].rotateAngleZ = -0.99483767F;

        gunModel[37].addShapeBox(-6F, -1F, -10F, 9, 9, 19, 0F, 0F, 0F, -4.75F, 0F, 0F, -4.75F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0.4F, -6.25F, 0F, 0.4F, -6.25F, 0F, 0.4F, -5.5F, 0F, 0.4F, -5.5F); // Box 47
        gunModel[37].setRotationPoint(-78F, -58F, 0.2F);
        gunModel[37].rotateAngleZ = 4.71238898F;

        gunModel[38].addShapeBox(-1F, -1F, -10F, 11, 2, 19, 0F, 0F, 0F, -4.75F, 0F, 0F, -4.75F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0.4F, -4.75F, 0F, 0.4F, -4.75F, 0F, 0.4F, -4F, 0F, 0.4F, -4F); // Box 50
        gunModel[38].setRotationPoint(-86F, -65.31F, 0.2F);
        gunModel[38].rotateAngleZ = -0.99483767F;

        gunModel[39].addShapeBox(-1F, -1F, -10F, 13, 10, 19, 0F, 0F, 0F, -4.75F, 0F, 0F, -4.75F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0.4F, -4.75F, 0F, 0.4F, -4.75F, 0F, 0.4F, -4F, 0F, 0.4F, -4F); // Box 51
        gunModel[39].setRotationPoint(-86F, -65.31F, 0.2F);
        gunModel[39].rotateAngleZ = 0.57595865F;

        gunModel[40].addShapeBox(-1F, -1F, 0F, 8, 2, 19, 0F, 0F, 0F, -4.75F, 0.25F, 0F, -4.75F, 0.25F, 0F, -4F, 0F, 0F, -4F, 0F, 0.4F, -6.25F, 0.25F, 0.4F, -6.25F, 0.25F, 0.4F, -5.5F, 0F, 0.4F, -5.5F); // Box 52
        gunModel[40].setRotationPoint(-39F, -62.75F, -9.8F);

        gunModel[41].addShapeBox(-1F, -1F, 0F, 7, 6, 19, 0F, 0F, 0F, -4.75F, 0.25F, 0F, -4.75F, 0.25F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, -4.75F, 0.25F, 1F, -4.75F, 0.25F, 1F, -4F, 0F, 1F, -4F); // Box 54
        gunModel[41].setRotationPoint(-39F, -69.75F, -9.8F);

        gunModel[42].addShapeBox(-1F, -1F, 0F, 21, 4, 23, 0F, 2.1F, 0F, -4.75F, 0.25F, 0F, -4.75F, 0.25F, 0F, -4F, 2.1F, 0F, -4F, 0F, 1F, -6.75F, 0.25F, 1F, -6.75F, 0.25F, 1F, -6F, 0F, 1F, -6F); // Box 55
        gunModel[42].setRotationPoint(-39F, -74.75F, -11.8F);

        gunModel[43].addShapeBox(-1F, -1F, 0F, 23, 4, 23, 0F, 2.6F, 0F, -4.75F, 0.25F, 0F, -4.75F, 0.25F, 0F, -4F, 2.6F, 0F, -4F, 0.1F, 1F, -4.75F, 0.25F, 1F, -4.75F, 0.25F, 1F, -4F, 0.1F, 1F, -4F); // Box 56
        gunModel[43].setRotationPoint(-41F, -79.75F, -11.8F);

        gunModel[44].addShapeBox(-1F, -1F, 0F, 21, 4, 23, 0F, 0F, 0F, -6.5F, 0.25F, 0F, -6.5F, 0.25F, 0F, -5.75F, 0F, 0F, -5.75F, 0F, 1F, -4.75F, 0.25F, 1F, -4.75F, 0.25F, 1F, -4F, 0F, 1F, -4F); // Box 57
        gunModel[44].setRotationPoint(-39F, -84.75F, -11.8F);

        gunModel[45].addShapeBox(-1F, -1F, 0F, 21, 5, 23, 0F, 0F, 0F, -6.75F, 1.75F, 0F, -6.75F, 1.75F, 0F, -6F, 0F, 0F, -6F, 0F, 1F, -6.5F, 0.25F, 1F, -6.5F, 0.25F, 1F, -5.75F, 0F, 1F, -5.75F); // Box 58
        gunModel[45].setRotationPoint(-39F, -90.75F, -11.8F);

        gunModel[46].addShapeBox(-1F, -1F, 0F, 22, 1, 23, 0F, -1.5F, 0.5F, -6.75F, 1F, 0.5F, -6.75F, 1F, 0.5F, -6F, -1.5F, 0.5F, -6F, 0F, 0F, -6.75F, 0.75F, 0F, -6.75F, 0.75F, 0F, -6F, 0F, 0F, -6F); // Box 59
        gunModel[46].setRotationPoint(-39F, -91.75F, -11.8F);

        gunModel[47].addShapeBox(-1F, -1F, 0F, 70, 2, 19, 0F, 0F, 0.5F, -7.75F, 0.6F, 0.5F, -7.75F, 0.6F, 0.5F, -7.5F, 0F, 0.5F, -7.5F, 0F, 0F, -2.75F, 1.6F, 0F, -2.75F, 1.6F, 0F, -2F, 0F, 0F, -2F); // Box 60
        gunModel[47].setRotationPoint(-116.7F, -84.75F, -9.8F);

        gunModel[48].addShapeBox(-1F, -1F, 0F, 4, 2, 19, 0F, 1F, 0.5F, -7.75F, 2.1F, 0.5F, -7.75F, 2.1F, 0.5F, -7.5F, 1F, 0.5F, -7.5F, 0F, 0F, -2.75F, 2.1F, 0F, -2.75F, 2.1F, 0F, -2F, 0F, 0F, -2F); // Box 65
        gunModel[48].setRotationPoint(-45.1F, -84.75F, -9.8F);

        gunModel[49].addShapeBox(-1F, -1F, 0F, 2, 2, 19, 0F, 2F, 1F, -2.75F, 2.1F, 1F, -2.75F, 2.1F, 1F, -2F, 2F, 1F, -2F, 0.5F, 0F, -2.75F, 2.1F, 0F, -2.75F, 2.1F, 0F, -2F, 0.5F, 0F, -2F); // Box 67
        gunModel[49].setRotationPoint(-43.1F, -81.75F, -9.8F);

        gunModel[50].addShapeBox(-1F, -1F, 0F, 4, 2, 19, 0F, 0F, 1F, -2.75F, 0F, 1F, -3.8F, 0F, 1F, -3.05F, 0F, 1F, -2F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 68
        gunModel[50].setRotationPoint(-39F, -81.75F, -9.8F);

        gunModel[51].addShapeBox(-1F, -1F, 0F, 4, 5, 23, 0F, -4F, 0F, -6.75F, 0F, 0F, -6.75F, 0F, 0F, -6F, -4F, 0F, -6F, 0F, 1F, -6.5F, 0F, 1F, -6.5F, 0F, 1F, -5.75F, 0F, 1F, -5.75F); // Box 69
        gunModel[51].setRotationPoint(-43F, -90.75F, -11.8F);

        gunModel[52].addShapeBox(-1F, -1F, 0F, 4, 2, 19, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 70
        gunModel[52].setRotationPoint(-43F, -84.75F, -9.8F);

        gunModel[53].addShapeBox(-1F, -1F, 0F, 57, 6, 19, 0F, 0F, 0F, -4.75F, 0.25F, 0F, -4.75F, 0.25F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, -4.75F, 0.25F, 1F, -4.75F, 0.25F, 1F, -4F, 0F, 1F, -4F); // Box 71
        gunModel[53].setRotationPoint(-32F, -69.75F, -9.8F);

        gunModel[54].addShapeBox(-1F, -1F, 0F, 51, 5, 19, 0F, 0F, 0F, -4.75F, 0.25F, 0F, -4.75F, 0.25F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4.75F, 0.25F, 0F, -4.75F, 0.25F, 0F, -4F, 0F, 0F, -4F); // Box 72
        gunModel[54].setRotationPoint(-26F, -62.75F, -9.8F);

        gunModel[55].addShapeBox(-1F, -1F, 0F, 16, 10, 8, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.55F, 2F, 0F, -0.55F, 2F, -5F, 0F, -2F, 1F, 0F, -2F, 1F, -0.55F, 2F, -5F, -0.55F); // 10
        gunModel[55].setRotationPoint(-28F, -54.35F, -3.65F);

        gunModel[56].addShapeBox(-1F, -1F, 0F, 16, 6, 8, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 1F, 0F, -0.55F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, -1F, 0F, -0.55F); // 10
        gunModel[56].setRotationPoint(-31F, -60.35F, -3.65F);

        gunModel[57].addShapeBox(-1F, -1F, 0F, 16, 10, 2, 0F, 2F, 0F, 0F, -1.7F, 0F, 0F, -2F, 0F, -0.6F, 1.5F, 0F, -0.6F, 2F, -5F, 0F, -1.7F, 1.25F, 0F, -2F, 1.25F, -0.6F, 1.5F, -5F, -0.6F); // 10
        gunModel[57].setRotationPoint(-28F, -54.35F, 3.8F);

        gunModel[58].addShapeBox(-1F, -1F, 0F, 17, 6, 2, 0F, 1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, -0.6F, 0.5F, 0F, -0.6F, -1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, -0.6F, -1.5F, 0F, -0.6F); // 10
        gunModel[58].setRotationPoint(-31F, -60.35F, 3.8F);

        gunModel[59].addShapeBox(-1F, -1F, 0F, 16, 10, 2, 0F, 1.5F, 0F, -0.6F, -2F, 0F, -0.6F, -1.7F, 0F, 0F, 2F, 0F, 0F, 1.5F, -5F, -0.6F, -2F, 1.25F, -0.6F, -1.7F, 1.25F, 0F, 2F, -5F, 0F); // 10
        gunModel[59].setRotationPoint(-28F, -54.35F, -5.65F);

        gunModel[60].addShapeBox(-1F, -1F, 0F, 17, 6, 2, 0F, 0.5F, 0F, -0.6F, 0F, 0F, -0.6F, 0.3F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -0.6F, 0F, 0F, -0.6F, 0.3F, 0F, 0F, -1F, 0F, 0F); // 10
        gunModel[60].setRotationPoint(-31F, -60.35F, -5.65F);

        gunModel[61].addShapeBox(-1F, -1F, 0F, 5, 3, 19, 0F, 0.5F, -0.6F, -4.75F, 0F, -0.6F, -4.75F, 0F, -0.6F, -4F, 0.5F, -0.6F, -4F, 0.5F, 0F, -4.75F, 0F, 0F, -4.75F, 0F, 0F, -4F, 0.5F, 0F, -4F); // Box 75
        gunModel[61].setRotationPoint(-31F, -63.35F, -9.8F);

        gunModel[62].addShapeBox(-1F, -1F, 0F, 1, 3, 10, 0F, -0.5F, -0.6F, -4.75F, 0F, -0.6F, -4.75F, 0F, -0.6F, -3.8F, -0.5F, -0.6F, -3.8F, -1F, 0F, -4.75F, 0F, 0F, -4.75F, 0F, 0F, -3.8F, -0.5F, 0F, -3.8F); // Box 76
        gunModel[62].setRotationPoint(-32.5F, -63.35F, -9.8F);

        gunModel[63].addShapeBox(-1F, -1F, 0F, 1, 3, 10, 0F, -0.5F, -0.6F, -3.8F, 0F, -0.6F, -3.8F, 0F, -0.6F, -4.75F, -0.5F, -0.6F, -4.75F, -0.5F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0F, -4.75F, -1F, 0F, -4.75F); // Box 77
        gunModel[63].setRotationPoint(-32.5F, -63.35F, -0.05F);

        gunModel[64].addShapeBox(-1F, -1F, 0F, 3, 13, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, -0.6F); // Box 80
        gunModel[64].setRotationPoint(-10F, -57.75F, 3.8F);

        gunModel[65].addShapeBox(-1F, -1F, 0F, 4, 13, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 81
        gunModel[65].setRotationPoint(-14F, -57.75F, 3.8F);

        gunModel[66].addShapeBox(-1F, -1F, 0F, 4, 13, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 82
        gunModel[66].setRotationPoint(-14F, -57.75F, -5.05F);

        gunModel[67].addShapeBox(-1F, -1F, 0F, 3, 13, 2, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 83
        gunModel[67].setRotationPoint(-10F, -57.75F, -5.05F);

        gunModel[68].addShapeBox(-1F, -1F, 0F, 6, 13, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -0.55F, 0F, 0F, -0.55F); // Box 89
        gunModel[68].setRotationPoint(-10F, -57.75F, -3.65F);

        gunModel[69].addShapeBox(-1F, -1F, 0F, 6, 13, 8, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F); // Box 90
        gunModel[69].setRotationPoint(-10F, -56.75F, -3.65F);

        gunModel[70].addShapeBox(-1F, -1F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 91
        gunModel[70].setRotationPoint(-14F, -44.75F, 3.8F);

        gunModel[71].addShapeBox(-1F, -1F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, -0.6F); // Box 93
        gunModel[71].setRotationPoint(-10F, -44.75F, 3.8F);

        gunModel[72].addShapeBox(-1F, -1F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 94
        gunModel[72].setRotationPoint(-14F, -44.75F, -5.05F);

        gunModel[73].addShapeBox(-1F, -1F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 95
        gunModel[73].setRotationPoint(-10F, -44.75F, -5.05F);

        gunModel[74].addShapeBox(-1F, -1F, 0F, 9, 2, 8, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.55F, 1F, -0.5F, -0.55F, 1F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.55F, 1F, 0F, -0.55F); // Box 96
        gunModel[74].setRotationPoint(-13F, -44.25F, -3.65F);

        gunModel[75].addShapeBox(-1F, -1F, 0F, 10, 2, 8, 0F, 0F, -0.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, -0.55F, 0F, -0.5F, -0.55F, 0F, 0.75F, 0F, -0.5F, 3F, 0F, -0.5F, 3F, -0.55F, 0F, 0.75F, -0.55F); // Box 97
        gunModel[75].setRotationPoint(-4F, -44.25F, -3.65F);

        gunModel[76].addShapeBox(-1F, -1F, 0F, 12, 2, 8, 0F, -0.5F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.55F, -0.5F, -2.5F, -0.55F, -0.5F, 3F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.55F, -0.5F, 3F, -0.55F); // Box 98
        gunModel[76].setRotationPoint(5F, -44.25F, -3.65F);

        gunModel[77].addShapeBox(-1F, -1F, 0F, 2, 10, 8, 0F, -2F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, -0.55F, -2F, 0F, -0.55F, 2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.55F, 2.5F, 0F, -0.55F); // Box 99
        gunModel[77].setRotationPoint(17F, -51.5F, -3.65F);

        gunModel[78].addShapeBox(-1F, -1F, 0F, 22, 14, 19, 0F, 0F, 0F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, -3.2F, 0F, 0F, -3.15F, -7F, 1.25F, -3.95F, -7F, 1.25F, -3.95F, -7F, 1.25F, -3.15F, -7F, 1.25F, -3.1F); // Box 100
        gunModel[78].setRotationPoint(10.8F, -71.75F, -9.8F);

        gunModel[79].addShapeBox(-1F, -1F, 0F, 9, 14, 19, 0F, 0F, 0F, -4.95F, -7F, 0F, -3.95F, -7F, 0F, -3.1F, 0F, 0F, -4.1F, -7F, 1.25F, -4.95F, 0F, 1.25F, -3.95F, 0F, 1.25F, -3.1F, -7F, 1.25F, -4.1F); // Box 101
        gunModel[79].setRotationPoint(8.8F, -71.75F, -9.8F);

        gunModel[80].addShapeBox(-1F, -1F, 0F, 2, 5, 8, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.55F, 0F, 0F, -0.55F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.55F, 1F, 0F, -0.55F); // Box 86
        gunModel[80].setRotationPoint(20F, -56.5F, -3.65F);

        gunModel[81].addShapeBox(-1F, -1F, -4F, 3, 6, 8, 0F, 0F, 0.25F, 1.25F, 0F, 1F, 1.25F, 0F, 1F, 0.7F, 0F, 0.25F, 0.7F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 87
        gunModel[81].setRotationPoint(22.5F, -56.45F, 0.35F);
        gunModel[81].rotateAngleZ = -0.20943951F;

        gunModel[82].addShapeBox(-1F, -1F, -2F, 3, 10, 8, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -0.05F, 0F, 0.25F, -0.05F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.55F, 0F, 0F, -1.55F); // Box 88
        gunModel[82].setRotationPoint(21.22F, -50.4F, -1.65F);
        gunModel[82].rotateAngleZ = -0.20943951F;

        gunModel[83].addShapeBox(-1F, -1F, -10.5F, 2, 25, 19, 0F, 0F, -0.5F, -4.75F, 0F, -0.5F, -3.95F, 0F, -0.5F, -3.2F, 0F, -0.5F, -4F, 0F, 1.25F, -4.75F, 0F, 1.25F, -3.95F, 0F, 1.25F, -3.2F, 0F, 1.25F, -4F); // Box 90
        gunModel[83].setRotationPoint(-18.25F, -71.75F, 0.7F);
        gunModel[83].rotateAngleZ = 1.57079633F;

        gunModel[84].addShapeBox(-1F, -1F, -10.5F, 2, 1, 19, 0F, 0F, 0F, -4.75F, 0F, 0F, -3.95F, 0F, 0F, -3.2F, 0F, 0F, -4F, 0F, 1.8F, -4.75F, 0F, 1.8F, -3.95F, 0F, 1.8F, -3.15F, 0F, 1.8F, -4F); // Box 91
        gunModel[84].setRotationPoint(8F, -71.75F, 0.7F);
        gunModel[84].rotateAngleZ = 1.57079633F;

        gunModel[85].addShapeBox(-1F, -1F, 0F, 46, 4, 23, 0F, 0F, 0F, -7.7F, 0F, 0F, -7.7F, 0F, 0F, -6.9F, 0F, 0F, -6.9F, 0F, 1F, -5.95F, 0F, 1F, -5.95F, 0F, 1F, -5.15F, 0F, 1F, -5.15F); // Box 93
        gunModel[85].setRotationPoint(-17.75F, -84.75F, -11.8F);

        gunModel[86].addShapeBox(-1F, -1F, 0F, 46, 7, 17, 0F, 0F, 0F, -3.6F, 0F, 0F, -3.6F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 1F, -3.6F, 0F, 1F, -3.6F, 0F, 1F, -3.5F, 0F, 1F, -3.5F); // Box 94
        gunModel[86].setRotationPoint(-17.75F, -79.75F, -7.45F);

        gunModel[87].addShapeBox(-1F, -1F, 0F, 46, 5, 23, 0F, 0F, 0F, -7.7F, 0F, 0F, -7.7F, 0F, 0F, -6.9F, 0F, 0F, -6.9F, 0F, 1F, -7.7F, 0F, 1F, -7.7F, 0F, 1F, -6.9F, 0F, 1F, -6.9F); // Box 95
        gunModel[87].setRotationPoint(-17.75F, -90.75F, -11.8F);

        gunModel[88].addShapeBox(-1F, -1F, 0F, 30, 4, 15, 0F, 0F, 0F, -7.825F, 0F, 0F, -7.825F, 0F, 0F, -7.025F, 0F, 0F, -7.025F, 0F, 1F, -7.825F, 0F, 1F, -7.825F, 0F, 1F, -5.275F, 0F, 1F, -5.275F); // Box 94
        gunModel[88].setRotationPoint(28.25F, -84.75F, -3.8F);

        gunModel[89].addShapeBox(-1F, -1F, 0F, 30, 4, 11, 0F, 0F, 0F, -5.475F, 0F, 0F, -5.475F, 0F, 0F, -3.625F, 0F, 0F, -3.625F, 0F, 1F, -5.475F, 0F, 1F, -5.475F, 0F, 1F, -3.625F, 0F, 1F, -3.625F); // Box 95
        gunModel[89].setRotationPoint(28.25F, -79.75F, -1.45F);

        gunModel[90].addShapeBox(-1F, -1F, 0F, 30, 3, 23, 0F, 0F, 0F, -7.825F, 0F, 0F, -7.825F, 0F, 0F, -7.025F, 0F, 0F, -7.025F, 0F, 1F, -7.825F, 0F, 1F, -7.825F, 0F, 1F, -7.025F, 0F, 1F, -7.025F); // Box 96
        gunModel[90].setRotationPoint(28.25F, -88.75F, -11.8F);

        gunModel[91].addShapeBox(-1F, -1F, 0F, 30, 2, 17, 0F, 0F, 0F, -3.6F, 0F, 0F, -3.6F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 1F, -3.6F, 0F, 1F, -3.6F, 0F, 1F, -3.5F, 0F, 1F, -3.5F); // Box 97
        gunModel[91].setRotationPoint(28.25F, -74.75F, -7.45F);

        gunModel[92].addShapeBox(-1F, -1F, 0F, 30, 5, 23, 0F, 0F, 0F, -7.7F, 0F, 0F, -7.7F, 0F, 0F, -6.9F, 0F, 0F, -6.9F, 0F, 0F, -7.7F, 0F, 0F, -7.7F, 0F, 0F, -6.9F, 0F, 0F, -6.9F); // Box 98
        gunModel[92].setRotationPoint(28.25F, -90.75F, -11.8F);

        gunModel[93].addShapeBox(-1F, -1F, 0F, 9, 7, 19, 0F, 0F, 0F, -3.6F, 0F, 0F, -3.6F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 1F, -3.6F, 0F, 1F, -3.6F, 0F, 1F, -3.5F, 0F, 1F, -3.5F); // Box 99
        gunModel[93].setRotationPoint(58.25F, -79.75F, -9.45F);

        gunModel[94].addShapeBox(-1F, -1F, 0F, 9, 4, 23, 0F, 0F, 0F, -7.7F, 0F, 0F, -7.7F, 0F, 0F, -6.9F, 0F, 0F, -6.9F, 0F, 1F, -5.95F, 0F, 1F, -5.95F, 0F, 1F, -5.15F, 0F, 1F, -5.15F); // Box 100
        gunModel[94].setRotationPoint(58.25F, -84.75F, -11.8F);

        gunModel[95].addShapeBox(-1F, -1F, 0F, 9, 5, 23, 0F, 0F, 0F, -7.7F, 0F, 0F, -7.7F, 0F, 0F, -6.9F, 0F, 0F, -6.9F, 0F, 1F, -7.7F, 0F, 1F, -7.7F, 0F, 1F, -6.9F, 0F, 1F, -6.9F); // Box 101
        gunModel[95].setRotationPoint(58.25F, -90.75F, -11.8F);

        gunModel[96].addShapeBox(-1F, -1F, 0F, 45, 12, 19, 0F, 0F, 0F, -4.75F, 1F, 0F, -4.75F, 1F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, -4.75F, -4.25F, 1F, -4.75F, -4.25F, 1F, -4F, 0F, 1F, -4F); // Box 102
        gunModel[96].setRotationPoint(25F, -71.75F, -9.8F);

        gunModel[97].addShapeBox(-1F, -1F, 0F, 12, 12, 1, 0F, -5.75F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.475F, -5.75F, 0F, -0.475F, -0.25F, 1F, 0F, -4.25F, 1F, 0F, -4.25F, 1F, -0.475F, -0.25F, 1F, -0.475F); // Box 103
        gunModel[97].setRotationPoint(58F, -71.75F, 5.2F);

        gunModel[98].addShapeBox(-1F, -1F, 0F, 12, 12, 1, 0F, -5.75F, 0F, -0.475F, 1F, 0F, -0.475F, 1F, 0F, 0F, -5.75F, 0F, 0F, -0.25F, 1F, -0.475F, -4.25F, 1F, -0.475F, -4.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 105
        gunModel[98].setRotationPoint(58F, -71.75F, -6.05F);

        gunModel[99].addShapeBox(-1F, -1F, 0F, 34, 3, 1, 0F, 0F, -0.5F, 0F, -0.65F, -0.5F, 0F, -0.65F, -0.5F, -0.475F, 0F, -0.5F, -0.475F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, -0.475F, 0F, 0F, -0.475F); // Box 106
        gunModel[99].setRotationPoint(26F, -61.75F, 5.2F);

        gunModel[100].addShapeBox(-1F, -1F, 0F, 34, 3, 1, 0F, 0F, 0F, -0.475F, -0.45F, 0F, -0.475F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.475F, -1.75F, 0F, -0.475F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 107
        gunModel[100].setRotationPoint(26F, -61.75F, -6.05F);

        gunModel[101].addShapeBox(-1F, -1F, 0F, 5, 2, 3, 0F, 0.05F, 0F, 0F, 0.55F, 0F, 0F, 0.55F, 0F, 0.6F, 0.05F, 0F, 0.6F, -1.15F, 0.425F, 0F, -0.1F, 0.425F, 0F, -0.1F, 0.425F, 0.6F, -1.15F, 0.425F, 0.6F); // Box 108
        gunModel[101].setRotationPoint(-0.8F, -57.75F, -1.75F);

        gunModel[102].addShapeBox(-1F, -1F, 0F, 3, 4, 3, 0F, 0.85F, 0.025F, 0F, -0.1F, 0.025F, 0F, -0.1F, 0.025F, 0.6F, 0.85F, 0.025F, 0.6F, -0.65F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0.6F, -0.65F, 0.1F, 0.6F); // Box 109
        gunModel[102].setRotationPoint(1.2F, -55.3F, -1.75F);

        gunModel[103].addShapeBox(-1F, -1F, 0F, 3, 6, 3, 0F, -0.65F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.6F, -0.65F, 0F, 0.6F, -5.15F, 0.75F, 0F, 2.15F, 0.75F, 0F, 2.15F, 0.75F, 0.6F, -5.15F, 0.75F, 0.6F); // Box 111
        gunModel[103].setRotationPoint(1.2F, -51.2F, -1.75F);

        gunModel[104].addShapeBox(-1F, -1F, 0F, 2, 1, 8, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // 06
        gunModel[104].setRotationPoint(-29F, -7.5F, -4.05F);

        gunModel[105].addShapeBox(-1F, -1F, 0F, 17, 41, 2, 0F, 0F, 4.85F, 0F, 0.3F, -1.4F, 0F, 0F, -1.4F, -0.6F, -0.5F, 4.85F, -0.6F, 20F, -9F, 0F, -16.7F, 0F, 0F, -17F, 0F, -0.6F, 17.5F, -9F, -0.6F); // 02
        gunModel[105].setRotationPoint(-30F, -44.5F, 3.8F);

        gunModel[106].addShapeBox(-1F, -1F, 0F, 17, 41, 8, 0F, 0F, 4.85F, 0F, 0.3F, -1.4F, 0F, 0.3F, -1.4F, -0.6F, 0F, 4.85F, -0.6F, 20F, -9F, 0F, -16.7F, 0F, 0F, -16.7F, 0F, -0.6F, 20F, -9F, -0.6F); // Box 119
        gunModel[106].setRotationPoint(-30F, -44.5F, -3.65F);

        gunModel[107].addShapeBox(-1F, -1F, 0F, 17, 41, 2, 0F, -0.5F, 4.85F, -0.6F, 0F, -1.4F, -0.6F, 0.3F, -1.4F, 0F, 0F, 4.85F, 0F, 17.5F, -9F, -0.6F, -17F, 0F, -0.6F, -16.7F, 0F, 0F, 20F, -9F, 0F); // Box 120
        gunModel[107].setRotationPoint(-30F, -44.5F, -5.65F);

        gunModel[108].addShapeBox(-1F, -1F, 0F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 121
        gunModel[108].setRotationPoint(-29F, -6.5F, -4.05F);

        gunModel[109].addShapeBox(-1F, -1F, 0F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 122
        gunModel[109].setRotationPoint(-29F, -5.5F, -4.05F);

        gunModel[110].addShapeBox(-1F, -1F, 0F, 2, 1, 8, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 123
        gunModel[110].setRotationPoint(-30F, -4.5F, -4.05F);

        gunModel[111].addShapeBox(-1F, -1F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
        gunModel[111].setRotationPoint(-29F, -7.5F, -5.05F);

        gunModel[112].addShapeBox(-1F, -1F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.15F, 0F, 0F); // Box 126
        gunModel[112].setRotationPoint(-29F, -6.5F, -5.05F);

        gunModel[113].addShapeBox(-1F, -1F, 0F, 2, 1, 1, 0F, 0.15F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.35F, 0F, 0F); // Box 127
        gunModel[113].setRotationPoint(-29F, -5.5F, -5.05F);

        gunModel[114].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0.6F, 0F, 0F, 1F, 0F, -0.25F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.8F, 0F, 0F); // Box 128
        gunModel[114].setRotationPoint(-29F, -4.5F, -5.05F);

        gunModel[115].addShapeBox(-1F, -1F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 129
        gunModel[115].setRotationPoint(-29F, -7.5F, 4.2F);

        gunModel[116].addShapeBox(-1F, -1F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.15F, 0F, 0F); // Box 130
        gunModel[116].setRotationPoint(-29F, -6.5F, 4.2F);

        gunModel[117].addShapeBox(-1F, -1F, 0F, 2, 1, 1, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.15F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.6F, 0F, 0F); // Box 131
        gunModel[117].setRotationPoint(-29F, -5.5F, 4.2F);

        gunModel[118].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0.4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.25F, 0.6F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F); // Box 132
        gunModel[118].setRotationPoint(-29F, -4.5F, 4.2F);

        gunModel[119].addShapeBox(-1F, -1F, 0F, 8, 33, 1, 0F, 0F, 5.85F, 0F, 1.3F, 2.6F, 0F, 0F, 1.6F, -0.6F, -0.5F, 4.85F, -0.6F, 16F, -9F, 0F, -12.7F, -3F, 0F, -13F, -4F, -0.6F, 14.5F, -10F, -0.6F); // Box 146
        gunModel[119].setRotationPoint(-27F, -40.5F, 5.2F);

        gunModel[120].addShapeBox(-1F, -1F, 0F, 8, 33, 1, 0F, -0.5F, 4.85F, -0.6F, 0F, 1.6F, -0.6F, 1.3F, 2.6F, 0F, 0F, 5.85F, 0F, 14.5F, -10F, -0.6F, -13F, -4F, -0.6F, -12.7F, -3F, 0F, 16F, -9F, 0F); // Box 147
        gunModel[120].setRotationPoint(-27F, -40.5F, -6.1F);

        gunModel[121].addShapeBox(-1F, -1F, 0F, 130, 2, 23, 0F, 0F, 0F, -7.7F, -0.9F, 0F, -7.7F, -0.9F, 0F, -6.9F, 0F, 0F, -6.9F, 0F, 1F, -7.7F, 0.6F, 1F, -7.7F, 0.6F, 1F, -6.9F, 0F, 1F, -6.9F); // Box 258
        gunModel[121].setRotationPoint(67.25F, -90.75F, -11.8F);

        gunModel[122].addShapeBox(-1F, -1F, 0F, 206, 1, 23, 0F, 0F, 0F, -6.2F, -0.3F, 0F, -6.2F, -0.3F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0.75F, -7.7F, -0.3F, 0.75F, -7.7F, -0.3F, 0.75F, -6.9F, 0F, 0.75F, -6.9F); // Box 260
        gunModel[122].setRotationPoint(-9.75F, -90.75F, -11.8F);

        gunModel[123].addShapeBox(-1F, -1F, 0F, 6, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 263
        gunModel[123].setRotationPoint(-9.75F, -91.75F, -11.8F);

        gunModel[124].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 264
        gunModel[124].setRotationPoint(-1.74F, -91.75F, -11.8F);

        gunModel[125].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 265
        gunModel[125].setRotationPoint(3.28F, -91.75F, -11.8F);

        gunModel[126].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 274
        gunModel[126].setRotationPoint(8.3F, -91.75F, -11.8F);

        gunModel[127].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 275
        gunModel[127].setRotationPoint(13.32F, -91.75F, -11.8F);

        gunModel[128].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 276
        gunModel[128].setRotationPoint(18.34F, -91.75F, -11.8F);

        gunModel[129].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 277
        gunModel[129].setRotationPoint(23.36F, -91.75F, -11.8F);

        gunModel[130].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 278
        gunModel[130].setRotationPoint(28.38F, -91.75F, -11.8F);

        gunModel[131].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 279
        gunModel[131].setRotationPoint(33.41F, -91.75F, -11.8F);

        gunModel[132].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 280
        gunModel[132].setRotationPoint(38.44F, -91.75F, -11.8F);

        gunModel[133].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 281
        gunModel[133].setRotationPoint(43.47F, -91.75F, -11.8F);

        gunModel[134].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 282
        gunModel[134].setRotationPoint(48.5F, -91.75F, -11.8F);

        gunModel[135].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 283
        gunModel[135].setRotationPoint(53.53F, -91.75F, -11.8F);

        gunModel[136].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 284
        gunModel[136].setRotationPoint(58.56F, -91.75F, -11.8F);

        gunModel[137].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 285
        gunModel[137].setRotationPoint(63.59F, -91.75F, -11.8F);

        gunModel[138].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 286
        gunModel[138].setRotationPoint(68.62F, -91.75F, -11.8F);

        gunModel[139].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 287
        gunModel[139].setRotationPoint(73.64F, -91.75F, -11.8F);

        gunModel[140].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 288
        gunModel[140].setRotationPoint(78.66F, -91.75F, -11.8F);

        gunModel[141].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 289
        gunModel[141].setRotationPoint(83.68F, -91.75F, -11.8F);

        gunModel[142].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 290
        gunModel[142].setRotationPoint(88.7F, -91.75F, -11.8F);

        gunModel[143].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 291
        gunModel[143].setRotationPoint(93.72F, -91.75F, -11.8F);

        gunModel[144].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 292
        gunModel[144].setRotationPoint(98.74F, -91.75F, -11.8F);

        gunModel[145].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 293
        gunModel[145].setRotationPoint(103.77F, -91.75F, -11.8F);

        gunModel[146].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 294
        gunModel[146].setRotationPoint(108.79F, -91.75F, -11.8F);

        gunModel[147].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 295
        gunModel[147].setRotationPoint(113.81F, -91.75F, -11.8F);

        gunModel[148].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 296
        gunModel[148].setRotationPoint(118.84F, -91.75F, -11.8F);

        gunModel[149].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 297
        gunModel[149].setRotationPoint(123.87F, -91.75F, -11.8F);

        gunModel[150].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 298
        gunModel[150].setRotationPoint(128.89F, -91.75F, -11.8F);

        gunModel[151].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 299
        gunModel[151].setRotationPoint(133.91F, -91.75F, -11.8F);

        gunModel[152].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 300
        gunModel[152].setRotationPoint(138.94F, -91.75F, -11.8F);

        gunModel[153].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 301
        gunModel[153].setRotationPoint(143.97F, -91.75F, -11.8F);

        gunModel[154].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 302
        gunModel[154].setRotationPoint(149F, -91.75F, -11.8F);

        gunModel[155].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 303
        gunModel[155].setRotationPoint(154.02F, -91.75F, -11.8F);

        gunModel[156].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 305
        gunModel[156].setRotationPoint(159.35F, -91.75F, -11.8F);

        gunModel[157].addShapeBox(-1F, -1F, 0F, 130, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.8F, 0.75F, -7.7F, -0.8F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.8F, 0F, -6.2F, -0.8F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 307
        gunModel[157].setRotationPoint(68.25F, -63F, -11.8F);

        gunModel[158].addShapeBox(-1F, -1F, 0F, 7, 1, 23, 0F, 0F, 0F, -7.7F, 0F, 0F, -7.7F, 0F, 0F, -6.9F, 0F, 0F, -6.9F, 0F, 0.75F, -7.7F, 0F, 0.75F, -7.7F, 0F, 0.75F, -6.9F, 0F, 0.75F, -6.9F); // Box 314
        gunModel[158].setRotationPoint(-16.75F, -92.5F, -11.8F);

        gunModel[159].addShapeBox(-1F, -1F, 0F, 10, 2, 23, 0F, 0F, 0F, -7.7F, 0F, 0F, -7.7F, 0F, 0F, -6.9F, 0F, 0F, -6.9F, 0F, 0F, -7.7F, 0F, 0F, -7.7F, 0F, 0F, -6.9F, 0F, 0F, -6.9F); // Box 317
        gunModel[159].setRotationPoint(-26.25F, -94.1F, -11.8F);

        gunModel[160].addShapeBox(-0.2F, -1F, 0F, 1, 1, 1, 0F, 0.1F, 0.1F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, 0.1F, 0.1F, 0F); // Box 328
        gunModel[160].setRotationPoint(-24.15F, -96F, -4.15F);

        gunModel[161].addShapeBox(-0.6F, -1F, 0F, 1, 1, 1, 0F, 0.1F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 329
        gunModel[161].setRotationPoint(-24.15F, -96F, -4.15F);

        gunModel[162].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0.1F, -0.3F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, 0F, 0.1F, -0.2F, 0F); // Box 330
        gunModel[162].setRotationPoint(-24.15F, -96F, -4.15F);

        gunModel[163].addShapeBox(-1F, -1F, 0F, 3, 10, 18, 0F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F); // Box 0
        gunModel[163].setRotationPoint(222F, -81.5F, -8.9F);

        gunModel[164].addShapeBox(-1F, -1F, 0F, 3, 18, 10, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F); // Box 0
        gunModel[164].setRotationPoint(222F, -85.5F, -4.9F);

        gunModel[165].addShapeBox(-1F, -1F, 0F, 3, 20, 20, 0F, 0F, -16.5F, 0F, 0F, -16.5F, 0F, 0F, -16.5F, -16.5F, 0F, -16.5F, -16.5F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, 0F, -16.5F, 0F, 0F, -16.5F); // Box 0
        gunModel[165].setRotationPoint(222F, -91.5F, -4.9F);

        gunModel[166].addShapeBox(-1F, -1F, 0F, 3, 20, 20, 0F, 0F, -16.5F, -16.5F, 0F, -16.5F, -16.5F, 0F, -16.5F, 0F, 0F, -16.5F, 0F, 0F, 0F, -16.5F, 0F, 0F, -16.5F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F); // Box 0
        gunModel[166].setRotationPoint(222F, -91.5F, -14.9F);

        gunModel[167].addShapeBox(-1F, -1F, 0F, 3, 20, 20, 0F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, 0F, -16.5F, 0F, 0F, -16.5F, 0F, -16.5F, 0F, 0F, -16.5F, 0F, 0F, -16.5F, -16.5F, 0F, -16.5F, -16.5F); // Box 0
        gunModel[167].setRotationPoint(222F, -81.5F, -4.9F);

        gunModel[168].addShapeBox(-1F, -1F, 0F, 3, 20, 20, 0F, 0F, 0F, -16.5F, 0F, 0F, -16.5F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, -16.5F, -16.5F, 0F, -16.5F, -16.5F, 0F, -16.5F, 0F, 0F, -16.5F, 0F); // Box 0
        gunModel[168].setRotationPoint(222F, -81.5F, -14.9F);

        gunModel[169].addShapeBox(-1F, -1F, 0F, 159, 18, 8, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Box 377
        gunModel[169].setRotationPoint(67F, -85.5F, -3.9F);

        gunModel[170].addShapeBox(-1F, -1F, 0F, 159, 20, 20, 0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -17F, -17F, 0F, -17F, -17F, 0F, -17F, 0F, 0F, -17F, 0F); // Box 378
        gunModel[170].setRotationPoint(67F, -80.5F, -15.9F);

        gunModel[171].addShapeBox(-1F, -1F, 0F, 159, 20, 20, 0F, 0F, -17F, -17F, 0F, -17F, -17F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 379
        gunModel[171].setRotationPoint(67F, -92.5F, -15.9F);

        gunModel[172].addShapeBox(-1F, -1F, 0F, 159, 8, 18, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 380
        gunModel[172].setRotationPoint(67F, -80.5F, -8.9F);

        gunModel[173].addShapeBox(-1F, -1F, 0F, 159, 20, 20, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, -17F, -17F, 0F, -17F, -17F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -17F, 0F, 0F, -17F); // Box 381
        gunModel[173].setRotationPoint(67F, -92.5F, -3.9F);

        gunModel[174].addShapeBox(-1F, -1F, 0F, 159, 20, 20, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, -17F, -17F, 0F, -17F, -17F); // Box 382
        gunModel[174].setRotationPoint(67F, -80.5F, -3.9F);

        gunModel[175].addShapeBox(-1F, -1F, 0F, 147, 8, 18, 0F, -0.25F, 0F, -8F, -0.25F, 0F, -8F, -0.25F, 0F, -8F, -0.25F, 0F, -8F, -0.25F, 0F, -8F, -0.25F, 0F, -8F, -0.25F, 0F, -8F, -0.25F, 0F, -8F); // Box 383
        gunModel[175].setRotationPoint(67F, -88F, -8.9F);

        gunModel[176].addShapeBox(-1F, -1F, 0F, 147, 18, 8, 0F, -0.25F, -8F, 0F, -0.25F, -8F, 0F, -0.25F, -8F, 0F, -0.25F, -8F, 0F, -0.25F, -8F, 0F, -0.25F, -8F, 0F, -0.25F, -8F, 0F, -0.25F, -8F, 0F); // Box 384
        gunModel[176].setRotationPoint(67F, -93F, -3.9F);

        gunModel[177].addShapeBox(-1F, -1F, 0F, 147, 20, 20, 0F, -0.25F, -17F, -17F, -0.25F, -17F, -17F, -0.25F, -17F, 0F, -0.25F, -17F, 0F, -0.25F, 0F, -17F, -0.25F, 0F, -17F, -0.25F, -1F, -1F, -0.25F, -1F, -1F); // Box 385
        gunModel[177].setRotationPoint(67F, -100F, -15.9F);

        gunModel[178].addShapeBox(-1F, -1F, 0F, 147, 20, 20, 0F, -0.25F, 0F, -17F, -0.25F, 0F, -17F, -0.25F, -1F, -1F, -0.25F, -1F, -1F, -0.25F, -17F, -17F, -0.25F, -17F, -17F, -0.25F, -17F, 0F, -0.25F, -17F, 0F); // Box 386
        gunModel[178].setRotationPoint(67F, -88F, -15.9F);

        gunModel[179].addShapeBox(-1F, -1F, 0F, 147, 20, 20, 0F, -0.25F, -1F, -1F, -0.25F, -1F, -1F, -0.25F, 0F, -17F, -0.25F, 0F, -17F, -0.25F, -17F, 0F, -0.25F, -17F, 0F, -0.25F, -17F, -17F, -0.25F, -17F, -17F); // Box 387
        gunModel[179].setRotationPoint(67F, -88F, -3.9F);

        gunModel[180].addShapeBox(-1F, -1F, 0F, 147, 20, 20, 0F, -0.25F, -17F, 0F, -0.25F, -17F, 0F, -0.25F, -17F, -17F, -0.25F, -17F, -17F, -0.25F, -1F, -1F, -0.25F, -1F, -1F, -0.25F, 0F, -17F, -0.25F, 0F, -17F); // Box 388
        gunModel[180].setRotationPoint(67F, -100F, -3.9F);

        gunModel[181].addShapeBox(-1F, -1F, 0F, 28, 6, 18, 0F, 0F, 0F, -8.25F, 0F, 0F, -8.25F, 0F, 0F, -8.25F, 0F, 0F, -8.25F, 0F, 0F, -8.25F, 0F, 0F, -8.25F, 0F, 0F, -8.25F, 0F, 0F, -8.25F); // Box 389
        gunModel[181].setRotationPoint(226F, -79.5F, -8.9F);

        gunModel[182].addShapeBox(-1F, -1F, 0F, 28, 20, 20, 0F, 0F, -17.75F, -17.75F, 0F, -17.75F, -17.75F, 0F, -17.75F, 0F, 0F, -17.75F, 0F, 0F, 0F, -17.75F, 0F, 0F, -17.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 390
        gunModel[182].setRotationPoint(226F, -93.5F, -16.9F);

        gunModel[183].addShapeBox(-1F, -1F, 0F, 28, 18, 6, 0F, 0F, -8.25F, 0F, 0F, -8.25F, 0F, 0F, -8.25F, 0F, 0F, -8.25F, 0F, 0F, -8.25F, 0F, 0F, -8.25F, 0F, 0F, -8.25F, 0F, 0F, -8.25F, 0F); // Box 391
        gunModel[183].setRotationPoint(226F, -85.5F, -2.9F);

        gunModel[184].addShapeBox(-1F, -1F, 0F, 28, 20, 20, 0F, 0F, 0F, -17.75F, 0F, 0F, -17.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -17.75F, -17.75F, 0F, -17.75F, -17.75F, 0F, -17.75F, 0F, 0F, -17.75F, 0F); // Box 392
        gunModel[184].setRotationPoint(226F, -79.5F, -16.9F);

        gunModel[185].addShapeBox(-1F, -1F, 0F, 28, 20, 20, 0F, 0F, -17.75F, 0F, 0F, -17.75F, 0F, 0F, -17.75F, -17.75F, 0F, -17.75F, -17.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -17.75F, 0F, 0F, -17.75F); // Box 393
        gunModel[185].setRotationPoint(226F, -93.5F, -2.9F);

        gunModel[186].addShapeBox(-1F, -1F, 0F, 28, 20, 20, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -17.75F, 0F, 0F, -17.75F, 0F, -17.75F, 0F, 0F, -17.75F, 0F, 0F, -17.75F, -17.75F, 0F, -17.75F, -17.75F); // Box 394
        gunModel[186].setRotationPoint(226F, -79.5F, -2.9F);

        gunModel[187].addShapeBox(-1F, -1F, 0F, 3, 8, 18, 0F, 0.75F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0.75F, 0F, -8F, 0.75F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0.75F, 0F, -8F); // Box 395
        gunModel[187].setRotationPoint(229F, -80.5F, -8.9F);

        gunModel[188].addShapeBox(-1F, -1F, 0F, 3, 20, 20, 0F, 0.75F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -17F, 0.75F, 0F, -17F, 0.75F, -17F, 0F, 0F, -17F, 0F, 0F, -17F, -17F, 0.75F, -17F, -17F); // Box 396
        gunModel[188].setRotationPoint(229F, -80.5F, -3.9F);

        gunModel[189].addShapeBox(-1F, -1F, 0F, 3, 20, 20, 0F, 0.75F, 0F, -17F, 0F, 0F, -17F, 0F, -1F, -1F, 0.75F, -1F, -1F, 0.75F, -17F, -17F, 0F, -17F, -17F, 0F, -17F, 0F, 0.75F, -17F, 0F); // Box 397
        gunModel[189].setRotationPoint(229F, -80.5F, -15.9F);

        gunModel[190].addShapeBox(-1F, -1F, 0F, 3, 18, 8, 0F, 0.75F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0.75F, -8F, 0F, 0.75F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0.75F, -8F, 0F); // Box 398
        gunModel[190].setRotationPoint(229F, -85.5F, -3.9F);

        gunModel[191].addShapeBox(-1F, -1F, 0F, 3, 20, 20, 0F, 0.75F, -17F, 0F, 0F, -17F, 0F, 0F, -17F, -17F, 0.75F, -17F, -17F, 0.75F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -17F, 0.75F, 0F, -17F); // Box 399
        gunModel[191].setRotationPoint(229F, -92.5F, -3.9F);

        gunModel[192].addShapeBox(-1F, -1F, 0F, 3, 20, 20, 0F, 0.75F, -17F, -17F, 0F, -17F, -17F, 0F, -17F, 0F, 0.75F, -17F, 0F, 0.75F, 0F, -17F, 0F, 0F, -17F, 0F, -1F, -1F, 0.75F, -1F, -1F); // Box 400
        gunModel[192].setRotationPoint(229F, -92.5F, -15.9F);

        gunModel[193].addShapeBox(-1F, -1F, 0F, 5, 8, 18, 0F, 1.25F, 0F, -8F, 0.15F, 0F, -8F, 0.15F, 0F, -8F, 1.25F, 0F, -8F, 1.25F, 0F, -8F, 0.15F, 0F, -8F, 0.15F, 0F, -8F, 1.25F, 0F, -8F); // Box 401
        gunModel[193].setRotationPoint(234F, -80.5F, -8.9F);

        gunModel[194].addShapeBox(-1F, -1F, 0F, 5, 20, 20, 0F, 1.25F, -1F, -1F, 0.15F, -1F, -1F, 0.15F, 0F, -17F, 1.25F, 0F, -17F, 1.25F, -17F, 0F, 0.15F, -17F, 0F, 0.15F, -17F, -17F, 1.25F, -17F, -17F); // Box 402
        gunModel[194].setRotationPoint(234F, -80.5F, -3.9F);

        gunModel[195].addShapeBox(-1F, -1F, 0F, 5, 20, 20, 0F, 1.25F, 0F, -17F, 0.15F, 0F, -17F, 0.15F, -1F, -1F, 1.25F, -1F, -1F, 1.25F, -17F, -17F, 0.15F, -17F, -17F, 0.15F, -17F, 0F, 1.25F, -17F, 0F); // Box 403
        gunModel[195].setRotationPoint(234F, -80.5F, -15.9F);

        gunModel[196].addShapeBox(-1F, -1F, 0F, 5, 18, 8, 0F, 1.25F, -8F, 0F, 0.15F, -8F, 0F, 0.15F, -8F, 0F, 1.25F, -8F, 0F, 1.25F, -8F, 0F, 0.15F, -8F, 0F, 0.15F, -8F, 0F, 1.25F, -8F, 0F); // Box 404
        gunModel[196].setRotationPoint(234F, -85.5F, -3.9F);

        gunModel[197].addShapeBox(-1F, -1F, 0F, 5, 20, 20, 0F, 1.25F, -17F, 0F, 0.15F, -17F, 0F, 0.15F, -17F, -17F, 1.25F, -17F, -17F, 1.25F, -1F, -1F, 0.15F, -1F, -1F, 0.15F, 0F, -17F, 1.25F, 0F, -17F); // Box 405
        gunModel[197].setRotationPoint(234F, -92.5F, -3.9F);

        gunModel[198].addShapeBox(-1F, -1F, 0F, 5, 20, 20, 0F, 1.25F, -17F, -17F, 0.15F, -17F, -17F, 0.15F, -17F, 0F, 1.25F, -17F, 0F, 1.25F, 0F, -17F, 0.15F, 0F, -17F, 0.15F, -1F, -1F, 1.25F, -1F, -1F); // Box 406
        gunModel[198].setRotationPoint(234F, -92.5F, -15.9F);

        gunModel[199].addShapeBox(-1F, -1F, 0F, 4, 6, 18, 0F, 0F, 0F, -8.25F, 0.4F, 0F, -8.25F, 0.4F, 0F, -8.25F, 0F, 0F, -8.25F, 0F, 0F, -8.25F, 0.4F, 0F, -8.25F, 0.4F, 0F, -8.25F, 0F, 0F, -8.25F); // Box 425
        gunModel[199].setRotationPoint(214F, -87F, -8.9F);

        gunModel[200].addShapeBox(-1F, -1F, 0F, 4, 20, 20, 0F, 0F, 0F, -17.75F, 0.4F, 0F, -17.75F, 0.4F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -17.75F, -17.75F, 0.4F, -17.75F, -17.75F, 0.4F, -17.75F, 0F, 0F, -17.75F, 0F); // Box 426
        gunModel[200].setRotationPoint(214F, -87F, -16.9F);

        gunModel[201].addShapeBox(-1F, -1F, 0F, 4, 18, 6, 0F, 0F, -8.25F, 0F, 0.4F, -8.25F, 0F, 0.4F, -8.25F, 0F, 0F, -8.25F, 0F, 0F, -8.25F, 0F, 0.4F, -8.25F, 0F, 0.4F, -8.25F, 0F, 0F, -8.25F, 0F); // Box 427
        gunModel[201].setRotationPoint(214F, -93F, -2.9F);

        gunModel[202].addShapeBox(-1F, -1F, 0F, 4, 20, 20, 0F, 0F, -17.75F, -17.75F, 0.4F, -17.75F, -17.75F, 0.4F, -17.75F, 0F, 0F, -17.75F, 0F, 0F, 0F, -17.75F, 0.4F, 0F, -17.75F, 0.4F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 428
        gunModel[202].setRotationPoint(214F, -101F, -16.9F);

        gunModel[203].addShapeBox(-1F, -1F, 0F, 4, 20, 20, 0F, 0F, -17.75F, 0F, 0.4F, -17.75F, 0F, 0.4F, -17.75F, -17.75F, 0F, -17.75F, -17.75F, 0F, -0.75F, -0.75F, 0.4F, -0.75F, -0.75F, 0.4F, 0F, -17.75F, 0F, 0F, -17.75F); // Box 429
        gunModel[203].setRotationPoint(214F, -101F, -2.9F);

        gunModel[204].addShapeBox(-1F, -1F, 0F, 4, 20, 20, 0F, 0F, -0.75F, -0.75F, 0.4F, -0.75F, -0.75F, 0.4F, 0F, -17.75F, 0F, 0F, -17.75F, 0F, -17.75F, 0F, 0.4F, -17.75F, 0F, 0.4F, -17.75F, -17.75F, 0F, -17.75F, -17.75F); // Box 430
        gunModel[204].setRotationPoint(214F, -87F, -2.9F);

        gunModel[205].addShapeBox(-1F, -1F, 0F, 1, 5, 18, 0F, 0F, 0F, -8.25F, 0.25F, -0.5F, -8.25F, 0.25F, -0.5F, -8.25F, 0F, 0F, -8.25F, 0F, 0F, -8.25F, 0.25F, -0.5F, -8.25F, 0.25F, -0.5F, -8.25F, 0F, 0F, -8.25F); // Box 431
        gunModel[205].setRotationPoint(218.4F, -86.5F, -8.9F);

        gunModel[206].addShapeBox(-1F, -1F, 0F, 1, 20, 20, 0F, 0F, 0F, -18.25F, 0.25F, -0.5F, -18.25F, 0.25F, -0.875F, -0.875F, 0F, -0.625F, -0.625F, 0F, -18.25F, -18.25F, 0.25F, -18.25F, -18.25F, 0.25F, -18.25F, -0.5F, 0F, -18.25F, 0F); // Box 432
        gunModel[206].setRotationPoint(218.4F, -86.5F, -17.4F);

        gunModel[207].addShapeBox(-1F, -1F, 0F, 1, 20, 20, 0F, 0F, -18.25F, -18.25F, 0.25F, -18.25F, -18.25F, 0.25F, -18.25F, -0.5F, 0F, -18.25F, 0F, 0F, 0F, -18.25F, 0.25F, -0.5F, -18.25F, 0.25F, -0.875F, -0.875F, 0F, -0.625F, -0.625F); // Box 433
        gunModel[207].setRotationPoint(218.4F, -101.5F, -17.4F);

        gunModel[208].addShapeBox(-1F, -1F, 0F, 1, 20, 20, 0F, 0F, -18.25F, 0F, 0.25F, -18.25F, -0.5F, 0.25F, -18.25F, -18.25F, 0F, -18.25F, -18.25F, 0F, -0.625F, -0.625F, 0.25F, -0.875F, -0.875F, 0.25F, -0.5F, -18.25F, 0F, 0F, -18.25F); // Box 434
        gunModel[208].setRotationPoint(218.4F, -101.5F, -2.4F);

        gunModel[209].addShapeBox(-1F, -1F, 0F, 1, 18, 5, 0F, 0F, -8.25F, 0F, 0.25F, -8.25F, -0.5F, 0.25F, -8.25F, -0.5F, 0F, -8.25F, 0F, 0F, -8.25F, 0F, 0.25F, -8.25F, -0.5F, 0.25F, -8.25F, -0.5F, 0F, -8.25F, 0F); // Box 435
        gunModel[209].setRotationPoint(218.4F, -93F, -2.4F);

        gunModel[210].addShapeBox(-1F, -1F, 0F, 1, 20, 20, 0F, 0F, -0.625F, -0.625F, 0.25F, -0.875F, -0.875F, 0.25F, -0.5F, -18.25F, 0F, 0F, -18.25F, 0F, -18.25F, 0F, 0.25F, -18.25F, -0.5F, 0.25F, -18.25F, -18.25F, 0F, -18.25F, -18.25F); // Box 436
        gunModel[210].setRotationPoint(218.4F, -86.5F, -2.4F);

        gunModel[211].addShapeBox(-1F, -1F, 0F, 3, 2, 18, 0F, 0F, 0F, -7.8F, 0F, 0F, -7.8F, 0F, 0F, -7.8F, 0F, 0F, -7.8F, 0F, 0F, -7.8F, 0F, 0F, -7.8F, 0F, 0F, -7.8F, 0F, 0F, -7.8F); // Box 437
        gunModel[211].setRotationPoint(222F, -71.5F, -8.9F);

        gunModel[212].addShapeBox(-1F, -1F, 0F, 3, 1, 18, 0F, 0F, 0F, -7.8F, 0F, 0F, -7.8F, 0F, 0F, -7.8F, 0F, 0F, -7.8F, 0F, -0.25F, -8.3F, 0F, -0.25F, -8.3F, 0F, -0.25F, -8.3F, 0F, -0.25F, -8.3F); // Box 439
        gunModel[212].setRotationPoint(222F, -69.5F, -8.9F);

        gunModel[213].addShapeBox(-1F, -1F, 0F, 2, 2, 4, 0F, 0F, 0F, -3.6F, 0.25F, 0F, -3.6F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0F, 1F, 0F); // Box 502
        gunModel[213].setRotationPoint(28.25F, -87.75F, -8F);

        gunModel[214].addShapeBox(-1F, -1F, 0F, 2, 4, 4, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.6F, 0.25F, 0F, 1.6F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 503
        gunModel[214].setRotationPoint(28.25F, -84.75F, -8F);

        gunModel[215].addShapeBox(-1F, -1F, 0F, 2, 4, 4, 0F, 0F, 0F, 1.6F, 0.25F, 0F, 1.6F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 504
        gunModel[215].setRotationPoint(28.25F, -80.75F, -8F);

        gunModel[216].addShapeBox(-1F, -1F, 0F, 2, 1, 4, 0F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 505
        gunModel[216].setRotationPoint(28.25F, -76.25F, -8F);

        gunModel[217].addShapeBox(-1F, -1F, 0F, 46, 1, 10, 0F, 0F, 0F, -3.6F, 0F, 0F, -3.6F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 1F, -3.6F, 0F, 1F, -3.6F, 0F, 1F, -3.5F, 0F, 1F, -3.5F); // Box 506
        gunModel[217].setRotationPoint(-17.75F, -73.75F, -9.45F);

        gunModel[218].addShapeBox(-1F, -1F, 0F, 46, 4, 10, 0F, 0F, 0F, -3.6F, 0F, 0F, -3.6F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 1F, -3.6F, 0F, 1F, -3.6F, 0F, 1F, -3.5F, 0F, 1F, -3.5F); // Box 507
        gunModel[218].setRotationPoint(-17.75F, -79.75F, -9.45F);

        gunModel[219].addShapeBox(-1F, -1F, 0F, 30, 1, 10, 0F, 0F, 0F, -3.6F, 0F, 0F, -3.6F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 1F, -3.6F, 0F, 1F, -3.6F, 0F, 1F, -3.5F, 0F, 1F, -3.5F); // Box 508
        gunModel[219].setRotationPoint(28.25F, -73.75F, -9.45F);

        gunModel[220].addShapeBox(-1F, -1F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 521
        gunModel[220].setRotationPoint(-14F, -65.75F, -6.05F);

        gunModel[221].addShapeBox(-1F, -1F, 0F, 6, 2, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 522
        gunModel[221].setRotationPoint(-14F, -63.75F, -6.05F);

        gunModel[222].addShapeBox(-1F, -1F, 0F, 6, 2, 1, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 523
        gunModel[222].setRotationPoint(-14F, -67.75F, -6.05F);

        gunModel[223].addShapeBox(-1F, -1F, 0F, 4, 1, 1, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
        gunModel[223].setRotationPoint(-18F, -65.25F, -6.05F);

        gunModel[224].addShapeBox(-1F, -1F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0.45F, 0F, -0.5F, 0.45F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
        gunModel[224].setRotationPoint(-18F, -66.25F, -6.05F);

        gunModel[225].addShapeBox(-1F, -1F, 0F, 4, 1, 1, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.45F, 0F, -0.5F, 0.45F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 526
        gunModel[225].setRotationPoint(-18F, -64.25F, -6.05F);

        gunModel[226].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
        gunModel[226].setRotationPoint(-19F, -65.25F, -6.05F);

        gunModel[227].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.05F, 0F, -0.5F, 0.45F, 0F, -0.25F, 0F, 0F, -0.5F, 0F); // Box 528
        gunModel[227].setRotationPoint(-19F, -64.25F, -6.05F);

        gunModel[228].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.65F, -0.05F, 0F, -0.5F, 0.45F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 529
        gunModel[228].setRotationPoint(-19F, -66.25F, -6.05F);

        gunModel[229].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
        gunModel[229].setRotationPoint(-14F, -65.25F, -6.05F);

        gunModel[230].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.45F, 0F, -0.65F, -0.05F, 0F, -0.5F, 0F, 0F, -0.25F, 0F); // Box 531
        gunModel[230].setRotationPoint(-14F, -64.25F, -6.05F);

        gunModel[231].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.45F, 0F, -0.65F, -0.05F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
        gunModel[231].setRotationPoint(-14F, -66.25F, -6.05F);

        gunModel[232].addShapeBox(-1F, -1F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 533
        gunModel[232].setRotationPoint(-14F, -65.75F, 5.2F);

        gunModel[233].addShapeBox(-1F, -1F, 0F, 6, 2, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F); // Box 534
        gunModel[233].setRotationPoint(-14F, -63.75F, 5.2F);

        gunModel[234].addShapeBox(-1F, -1F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0.45F, 0F, -0.5F, 0.45F); // Box 535
        gunModel[234].setRotationPoint(-18F, -64.25F, 5.2F);

        gunModel[235].addShapeBox(-1F, -1F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F); // Box 536
        gunModel[235].setRotationPoint(-18F, -65.25F, 5.2F);

        gunModel[236].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.7F); // Box 537
        gunModel[236].setRotationPoint(-14F, -65.25F, 5.2F);

        gunModel[237].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.65F, -0.05F, 0F, -0.5F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.7F); // Box 538
        gunModel[237].setRotationPoint(-14F, -66.25F, 5.2F);

        gunModel[238].addShapeBox(-1F, -1F, 0F, 6, 2, 1, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 539
        gunModel[238].setRotationPoint(-14F, -67.75F, 5.2F);

        gunModel[239].addShapeBox(-1F, -1F, 0F, 4, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0.45F, 0F, -0.5F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F); // Box 540
        gunModel[239].setRotationPoint(-18F, -66.25F, 5.2F);

        gunModel[240].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0.45F, 0F, -0.65F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.2F); // Box 541
        gunModel[240].setRotationPoint(-19F, -66.25F, 5.2F);

        gunModel[241].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.2F); // Box 542
        gunModel[241].setRotationPoint(-19F, -65.25F, 5.2F);

        gunModel[242].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.2F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0.45F, 0F, -0.65F, -0.05F); // Box 543
        gunModel[242].setRotationPoint(-19F, -64.25F, 5.2F);

        gunModel[243].addShapeBox(-1F, -1F, 0F, 6, 2, 1, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 544
        gunModel[243].setRotationPoint(-31F, -91.25F, -6.05F);

        gunModel[244].addShapeBox(-1F, -1F, 0F, 6, 2, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 545
        gunModel[244].setRotationPoint(-31F, -89.25F, -6.05F);

        gunModel[245].addShapeBox(-1F, -1F, 0F, 6, 2, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 546
        gunModel[245].setRotationPoint(-31F, -87.25F, -6.05F);

        gunModel[246].addShapeBox(-1F, -1F, 0F, 6, 2, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 547
        gunModel[246].setRotationPoint(-31F, -89.25F, 5.2F);

        gunModel[247].addShapeBox(-1F, -1F, 0F, 6, 2, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F); // Box 548
        gunModel[247].setRotationPoint(-31F, -87.25F, 5.2F);

        gunModel[248].addShapeBox(-1F, -1F, 0F, 6, 2, 1, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 549
        gunModel[248].setRotationPoint(-31F, -91.25F, 5.2F);

        gunModel[249].addShapeBox(-1F, -1F, 0F, 129, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[249].setRotationPoint(68.25F, -87.75F, -3.8F);

        gunModel[250].addShapeBox(-1F, -1F, 0F, 129, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[250].setRotationPoint(68.25F, -65.75F, -3.8F);

        gunModel[251].addShapeBox(-1F, -1F, 0F, 129, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[251].setRotationPoint(68.25F, -79.75F, 10.2F);

        gunModel[252].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 305
        gunModel[252].setRotationPoint(164.35F, -91.75F, -11.8F);

        gunModel[253].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 305
        gunModel[253].setRotationPoint(169.35F, -91.75F, -11.8F);

        gunModel[254].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 305
        gunModel[254].setRotationPoint(174.35F, -91.75F, -11.8F);

        gunModel[255].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 305
        gunModel[255].setRotationPoint(179.35F, -91.75F, -11.8F);

        gunModel[256].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 305
        gunModel[256].setRotationPoint(184.35F, -91.75F, -11.8F);

        gunModel[257].addShapeBox(-1F, -1F, 0F, 7, 1, 23, 0F, 0F, 0.75F, -7.7F, -2.4F, 0.75F, -7.7F, -2.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 305
        gunModel[257].setRotationPoint(189.35F, -91.75F, -11.8F);

        gunModel[258].addShapeBox(-1F, -1F, 0F, 129, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[258].setRotationPoint(68.25F, -73.75F, 10.2F);

        gunModel[259].addShapeBox(-1F, -1F, 0F, 6, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[259].setRotationPoint(77.25F, -77.75F, 10.2F);

        gunModel[260].addShapeBox(-1F, -1F, 0F, 5, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[260].setRotationPoint(97.25F, -77.75F, 10.2F);

        gunModel[261].addShapeBox(-1F, -1F, 0F, 5, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[261].setRotationPoint(116.25F, -77.75F, 10.2F);

        gunModel[262].addShapeBox(-1F, -1F, 0F, 5, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[262].setRotationPoint(135.25F, -77.75F, 10.2F);

        gunModel[263].addShapeBox(-1F, -1F, 0F, 5, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[263].setRotationPoint(154.25F, -77.75F, 10.2F);

        gunModel[264].addShapeBox(-1F, -1F, 0F, 5, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[264].setRotationPoint(173.25F, -77.75F, 10.2F);

        gunModel[265].addShapeBox(-1F, -1F, 0F, 5, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[265].setRotationPoint(192.25F, -77.75F, 10.2F);

        gunModel[266].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
        gunModel[266].setRotationPoint(191.25F, -77.75F, 10.2F);

        gunModel[267].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[267].setRotationPoint(191.25F, -74.75F, 10.2F);

        gunModel[268].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[268].setRotationPoint(178.25F, -74.75F, 10.2F);

        gunModel[269].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[269].setRotationPoint(178.25F, -77.75F, 10.2F);

        gunModel[270].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
        gunModel[270].setRotationPoint(172.25F, -77.75F, 10.2F);

        gunModel[271].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[271].setRotationPoint(172.25F, -74.75F, 10.2F);

        gunModel[272].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[272].setRotationPoint(159.25F, -74.75F, 10.2F);

        gunModel[273].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[273].setRotationPoint(159.25F, -77.75F, 10.2F);

        gunModel[274].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
        gunModel[274].setRotationPoint(153.25F, -77.75F, 10.2F);

        gunModel[275].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[275].setRotationPoint(153.25F, -74.75F, 10.2F);

        gunModel[276].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[276].setRotationPoint(140.25F, -74.75F, 10.2F);

        gunModel[277].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[277].setRotationPoint(140.25F, -77.75F, 10.2F);

        gunModel[278].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
        gunModel[278].setRotationPoint(134.25F, -77.75F, 10.2F);

        gunModel[279].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[279].setRotationPoint(134.25F, -74.75F, 10.2F);

        gunModel[280].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[280].setRotationPoint(121.25F, -74.75F, 10.2F);

        gunModel[281].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[281].setRotationPoint(121.25F, -77.75F, 10.2F);

        gunModel[282].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
        gunModel[282].setRotationPoint(115.25F, -77.75F, 10.2F);

        gunModel[283].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[283].setRotationPoint(115.25F, -74.75F, 10.2F);

        gunModel[284].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[284].setRotationPoint(102.25F, -74.75F, 10.2F);

        gunModel[285].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[285].setRotationPoint(102.25F, -77.75F, 10.2F);

        gunModel[286].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
        gunModel[286].setRotationPoint(96.25F, -77.75F, 10.2F);

        gunModel[287].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[287].setRotationPoint(96.25F, -74.75F, 10.2F);

        gunModel[288].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[288].setRotationPoint(83.25F, -74.75F, 10.2F);

        gunModel[289].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[289].setRotationPoint(83.25F, -77.75F, 10.2F);

        gunModel[290].addShapeBox(-1F, -1F, 0F, 129, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 260
        gunModel[290].setRotationPoint(68.25F, -65.75F, 4.2F);

        gunModel[291].addShapeBox(-1F, -1F, 0F, 11, 2, 2, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, -4F, 2F); // Box 260
        gunModel[291].setRotationPoint(68.25F, -67.75F, 6.2F);

        gunModel[292].addShapeBox(-1F, -1F, 0F, 129, 2, 2, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -4F, 2F, 0F, -4F, 2F); // Box 260
        gunModel[292].setRotationPoint(68.25F, -69.75F, 8.2F);

        gunModel[293].addShapeBox(-1F, -1F, 0F, 5, 2, 2, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, -4F, 2F); // Box 260
        gunModel[293].setRotationPoint(93.25F, -67.75F, 6.2F);

        gunModel[294].addShapeBox(-1F, -1F, 0F, 5, 2, 2, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, -4F, 2F); // Box 260
        gunModel[294].setRotationPoint(112.25F, -67.75F, 6.2F);

        gunModel[295].addShapeBox(-1F, -1F, 0F, 5, 2, 2, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, -4F, 2F); // Box 260
        gunModel[295].setRotationPoint(131.25F, -67.75F, 6.2F);

        gunModel[296].addShapeBox(-1F, -1F, 0F, 5, 2, 2, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, -4F, 2F); // Box 260
        gunModel[296].setRotationPoint(150.25F, -67.75F, 6.2F);

        gunModel[297].addShapeBox(-1F, -1F, 0F, 5, 2, 2, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, -4F, 2F); // Box 260
        gunModel[297].setRotationPoint(169.25F, -67.75F, 6.2F);

        gunModel[298].addShapeBox(-1F, -1F, 0F, 9, 2, 2, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, -4F, 2F); // Box 260
        gunModel[298].setRotationPoint(188.25F, -67.75F, 6.2F);

        gunModel[299].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 260
        gunModel[299].setRotationPoint(187.25F, -66.75F, 6.2F);

        gunModel[300].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 260
        gunModel[300].setRotationPoint(187.25F, -70.75F, 8.2F);

        gunModel[301].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 260
        gunModel[301].setRotationPoint(174.25F, -66.75F, 6.2F);

        gunModel[302].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 260
        gunModel[302].setRotationPoint(174.25F, -70.75F, 8.2F);

        gunModel[303].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 260
        gunModel[303].setRotationPoint(168.25F, -66.75F, 6.2F);

        gunModel[304].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 260
        gunModel[304].setRotationPoint(168.25F, -70.75F, 8.2F);

        gunModel[305].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 260
        gunModel[305].setRotationPoint(155.25F, -66.75F, 6.2F);

        gunModel[306].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 260
        gunModel[306].setRotationPoint(155.25F, -70.75F, 8.2F);

        gunModel[307].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 260
        gunModel[307].setRotationPoint(149.25F, -66.75F, 6.2F);

        gunModel[308].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 260
        gunModel[308].setRotationPoint(149.25F, -70.75F, 8.2F);

        gunModel[309].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 260
        gunModel[309].setRotationPoint(136.25F, -66.75F, 6.2F);

        gunModel[310].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 260
        gunModel[310].setRotationPoint(136.25F, -70.75F, 8.2F);

        gunModel[311].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 260
        gunModel[311].setRotationPoint(130.25F, -66.75F, 6.2F);

        gunModel[312].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 260
        gunModel[312].setRotationPoint(130.25F, -70.75F, 8.2F);

        gunModel[313].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 260
        gunModel[313].setRotationPoint(117.25F, -66.75F, 6.2F);

        gunModel[314].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 260
        gunModel[314].setRotationPoint(117.25F, -70.75F, 8.2F);

        gunModel[315].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 260
        gunModel[315].setRotationPoint(111.25F, -66.75F, 6.2F);

        gunModel[316].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 260
        gunModel[316].setRotationPoint(111.25F, -70.75F, 8.2F);

        gunModel[317].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 260
        gunModel[317].setRotationPoint(98.25F, -66.75F, 6.2F);

        gunModel[318].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 260
        gunModel[318].setRotationPoint(98.25F, -70.75F, 8.2F);

        gunModel[319].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 260
        gunModel[319].setRotationPoint(92.25F, -66.75F, 6.2F);

        gunModel[320].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 260
        gunModel[320].setRotationPoint(92.25F, -70.75F, 8.2F);

        gunModel[321].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 260
        gunModel[321].setRotationPoint(79.25F, -66.75F, 6.2F);

        gunModel[322].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 260
        gunModel[322].setRotationPoint(79.25F, -70.75F, 8.2F);

        gunModel[323].addShapeBox(-1F, -1F, 0F, 129, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 260
        gunModel[323].setRotationPoint(68.25F, -87.75F, 4.2F);

        gunModel[324].addShapeBox(-1F, -1F, 0F, 11, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 3F, 1F, 0F, 3F, 1F); // Box 260
        gunModel[324].setRotationPoint(68.25F, -85.75F, 6.2F);

        gunModel[325].addShapeBox(-1F, -1F, 0F, 129, 2, 2, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 260
        gunModel[325].setRotationPoint(68.25F, -83.75F, 8.2F);

        gunModel[326].addShapeBox(-1F, -1F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 3F, 1F, 0F, 3F, 1F); // Box 260
        gunModel[326].setRotationPoint(93.25F, -85.75F, 6.2F);

        gunModel[327].addShapeBox(-1F, -1F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 3F, 1F, 0F, 3F, 1F); // Box 260
        gunModel[327].setRotationPoint(112.25F, -85.75F, 6.2F);

        gunModel[328].addShapeBox(-1F, -1F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 3F, 1F, 0F, 3F, 1F); // Box 260
        gunModel[328].setRotationPoint(131.25F, -85.75F, 6.2F);

        gunModel[329].addShapeBox(-1F, -1F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 3F, 1F, 0F, 3F, 1F); // Box 260
        gunModel[329].setRotationPoint(150.25F, -85.75F, 6.2F);

        gunModel[330].addShapeBox(-1F, -1F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 3F, 1F, 0F, 3F, 1F); // Box 260
        gunModel[330].setRotationPoint(169.25F, -85.75F, 6.2F);

        gunModel[331].addShapeBox(-1F, -1F, 0F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 3F, 1F, 0F, 3F, 1F); // Box 260
        gunModel[331].setRotationPoint(188.25F, -85.75F, 6.2F);

        gunModel[332].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[332].setRotationPoint(187.25F, -81.75F, 8.2F);

        gunModel[333].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
        gunModel[333].setRotationPoint(187.25F, -85.75F, 6.2F);

        gunModel[334].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[334].setRotationPoint(174.25F, -81.75F, 8.2F);

        gunModel[335].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[335].setRotationPoint(174.25F, -85.75F, 6.2F);

        gunModel[336].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[336].setRotationPoint(168.25F, -81.75F, 8.2F);

        gunModel[337].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
        gunModel[337].setRotationPoint(168.25F, -85.75F, 6.2F);

        gunModel[338].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[338].setRotationPoint(155.25F, -81.75F, 8.2F);

        gunModel[339].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[339].setRotationPoint(155.25F, -85.75F, 6.2F);

        gunModel[340].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[340].setRotationPoint(149.25F, -81.75F, 8.2F);

        gunModel[341].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
        gunModel[341].setRotationPoint(149.25F, -85.75F, 6.2F);

        gunModel[342].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[342].setRotationPoint(136.25F, -81.75F, 8.2F);

        gunModel[343].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[343].setRotationPoint(136.25F, -85.75F, 6.2F);

        gunModel[344].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[344].setRotationPoint(130.25F, -81.75F, 8.2F);

        gunModel[345].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
        gunModel[345].setRotationPoint(130.25F, -85.75F, 6.2F);

        gunModel[346].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[346].setRotationPoint(117.25F, -81.75F, 8.2F);

        gunModel[347].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[347].setRotationPoint(117.25F, -85.75F, 6.2F);

        gunModel[348].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[348].setRotationPoint(111.25F, -81.75F, 8.2F);

        gunModel[349].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
        gunModel[349].setRotationPoint(111.25F, -85.75F, 6.2F);

        gunModel[350].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[350].setRotationPoint(98.25F, -81.75F, 8.2F);

        gunModel[351].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[351].setRotationPoint(98.25F, -85.75F, 6.2F);

        gunModel[352].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[352].setRotationPoint(92.25F, -81.75F, 8.2F);

        gunModel[353].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
        gunModel[353].setRotationPoint(92.25F, -85.75F, 6.2F);

        gunModel[354].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[354].setRotationPoint(79.25F, -81.75F, 8.2F);

        gunModel[355].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[355].setRotationPoint(79.25F, -85.75F, 6.2F);

        gunModel[356].addShapeBox(-1F, -1F, 0F, 129, 2, 2, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[356].setRotationPoint(68.25F, -65.75F, -5.8F);

        gunModel[357].addShapeBox(-1F, -1F, 0F, 11, 2, 2, 0F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[357].setRotationPoint(68.25F, -67.75F, -7.8F);

        gunModel[358].addShapeBox(-1F, -1F, 0F, 129, 2, 2, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 260
        gunModel[358].setRotationPoint(68.25F, -69.75F, -9.8F);

        gunModel[359].addShapeBox(-1F, -1F, 0F, 5, 2, 2, 0F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[359].setRotationPoint(93.25F, -67.75F, -7.8F);

        gunModel[360].addShapeBox(-1F, -1F, 0F, 5, 2, 2, 0F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[360].setRotationPoint(112.25F, -67.75F, -7.8F);

        gunModel[361].addShapeBox(-1F, -1F, 0F, 5, 2, 2, 0F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[361].setRotationPoint(131.25F, -67.75F, -7.8F);

        gunModel[362].addShapeBox(-1F, -1F, 0F, 5, 2, 2, 0F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[362].setRotationPoint(150.25F, -67.75F, -7.8F);

        gunModel[363].addShapeBox(-1F, -1F, 0F, 5, 2, 2, 0F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[363].setRotationPoint(169.25F, -67.75F, -7.8F);

        gunModel[364].addShapeBox(-1F, -1F, 0F, 9, 2, 2, 0F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[364].setRotationPoint(188.25F, -67.75F, -7.8F);

        gunModel[365].addShapeBox(-1F, -1F, 0F, 5, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[365].setRotationPoint(97.25F, -77.75F, -11.8F);

        gunModel[366].addShapeBox(-1F, -1F, 0F, 5, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[366].setRotationPoint(116.25F, -77.75F, -11.8F);

        gunModel[367].addShapeBox(-1F, -1F, 0F, 5, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[367].setRotationPoint(135.25F, -77.75F, -11.8F);

        gunModel[368].addShapeBox(-1F, -1F, 0F, 5, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[368].setRotationPoint(154.25F, -77.75F, -11.8F);

        gunModel[369].addShapeBox(-1F, -1F, 0F, 5, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[369].setRotationPoint(173.25F, -77.75F, -11.8F);

        gunModel[370].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
        gunModel[370].setRotationPoint(191.25F, -77.75F, -11.8F);

        gunModel[371].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[371].setRotationPoint(191.25F, -74.75F, -11.8F);

        gunModel[372].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[372].setRotationPoint(178.25F, -74.75F, -11.8F);

        gunModel[373].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[373].setRotationPoint(178.25F, -77.75F, -11.8F);

        gunModel[374].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
        gunModel[374].setRotationPoint(172.25F, -77.75F, -11.8F);

        gunModel[375].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[375].setRotationPoint(172.25F, -74.75F, -11.8F);

        gunModel[376].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[376].setRotationPoint(159.25F, -74.75F, -11.8F);

        gunModel[377].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[377].setRotationPoint(159.25F, -77.75F, -11.8F);

        gunModel[378].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
        gunModel[378].setRotationPoint(153.25F, -77.75F, -11.8F);

        gunModel[379].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[379].setRotationPoint(153.25F, -74.75F, -11.8F);

        gunModel[380].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[380].setRotationPoint(140.25F, -74.75F, -11.8F);

        gunModel[381].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[381].setRotationPoint(140.25F, -77.75F, -11.8F);

        gunModel[382].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
        gunModel[382].setRotationPoint(134.25F, -77.75F, -11.8F);

        gunModel[383].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[383].setRotationPoint(134.25F, -74.75F, -11.8F);

        gunModel[384].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[384].setRotationPoint(121.25F, -74.75F, -11.8F);

        gunModel[385].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[385].setRotationPoint(121.25F, -77.75F, -11.8F);

        gunModel[386].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
        gunModel[386].setRotationPoint(115.25F, -77.75F, -11.8F);

        gunModel[387].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[387].setRotationPoint(115.25F, -74.75F, -11.8F);

        gunModel[388].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[388].setRotationPoint(102.25F, -74.75F, -11.8F);

        gunModel[389].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[389].setRotationPoint(102.25F, -77.75F, -11.8F);

        gunModel[390].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
        gunModel[390].setRotationPoint(96.25F, -77.75F, -11.8F);

        gunModel[391].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[391].setRotationPoint(96.25F, -74.75F, -11.8F);

        gunModel[392].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[392].setRotationPoint(83.25F, -74.75F, -11.8F);

        gunModel[393].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[393].setRotationPoint(83.25F, -77.75F, -11.8F);

        gunModel[394].addShapeBox(-1F, -1F, 0F, 129, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[394].setRotationPoint(68.25F, -79.75F, -11.8F);

        gunModel[395].addShapeBox(-1F, -1F, 0F, 129, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[395].setRotationPoint(68.25F, -73.75F, -11.8F);

        gunModel[396].addShapeBox(-1F, -1F, 0F, 15, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[396].setRotationPoint(68.25F, -77.75F, -11.8F);

        gunModel[397].addShapeBox(-1F, -1F, 0F, 5, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[397].setRotationPoint(192.25F, -77.75F, -11.8F);

        gunModel[398].addShapeBox(-1F, -1F, 0F, 129, 2, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[398].setRotationPoint(68.25F, -87.75F, -5.8F);

        gunModel[399].addShapeBox(-1F, -1F, 0F, 11, 2, 2, 0F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[399].setRotationPoint(68.25F, -85.75F, -7.8F);

        gunModel[400].addShapeBox(-1F, -1F, 0F, 129, 2, 2, 0F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 260
        gunModel[400].setRotationPoint(68.25F, -83.75F, -9.8F);

        gunModel[401].addShapeBox(-1F, -1F, 0F, 5, 2, 2, 0F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[401].setRotationPoint(93.25F, -85.75F, -7.8F);

        gunModel[402].addShapeBox(-1F, -1F, 0F, 5, 2, 2, 0F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[402].setRotationPoint(112.25F, -85.75F, -7.8F);

        gunModel[403].addShapeBox(-1F, -1F, 0F, 5, 2, 2, 0F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[403].setRotationPoint(131.25F, -85.75F, -7.8F);

        gunModel[404].addShapeBox(-1F, -1F, 0F, 5, 2, 2, 0F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[404].setRotationPoint(150.25F, -85.75F, -7.8F);

        gunModel[405].addShapeBox(-1F, -1F, 0F, 5, 2, 2, 0F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[405].setRotationPoint(169.25F, -85.75F, -7.8F);

        gunModel[406].addShapeBox(-1F, -1F, 0F, 9, 2, 2, 0F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[406].setRotationPoint(188.25F, -85.75F, -7.8F);

        gunModel[407].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 260
        gunModel[407].setRotationPoint(92.25F, -81.75F, -8.8F);

        gunModel[408].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 260
        gunModel[408].setRotationPoint(92.25F, -85.75F, -6.8F);

        gunModel[409].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 260
        gunModel[409].setRotationPoint(79.25F, -81.75F, -8.8F);

        gunModel[410].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 260
        gunModel[410].setRotationPoint(79.25F, -85.75F, -6.8F);

        gunModel[411].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 260
        gunModel[411].setRotationPoint(111.25F, -81.75F, -8.8F);

        gunModel[412].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 260
        gunModel[412].setRotationPoint(111.25F, -85.75F, -6.8F);

        gunModel[413].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 260
        gunModel[413].setRotationPoint(98.25F, -81.75F, -8.8F);

        gunModel[414].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 260
        gunModel[414].setRotationPoint(98.25F, -85.75F, -6.8F);

        gunModel[415].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 260
        gunModel[415].setRotationPoint(130.25F, -81.75F, -8.8F);

        gunModel[416].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 260
        gunModel[416].setRotationPoint(130.25F, -85.75F, -6.8F);

        gunModel[417].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 260
        gunModel[417].setRotationPoint(117.25F, -81.75F, -8.8F);

        gunModel[418].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 260
        gunModel[418].setRotationPoint(117.25F, -85.75F, -6.8F);

        gunModel[419].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 260
        gunModel[419].setRotationPoint(149.25F, -81.75F, -8.8F);

        gunModel[420].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 260
        gunModel[420].setRotationPoint(149.25F, -85.75F, -6.8F);

        gunModel[421].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 260
        gunModel[421].setRotationPoint(136.25F, -81.75F, -8.8F);

        gunModel[422].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 260
        gunModel[422].setRotationPoint(136.25F, -85.75F, -6.8F);

        gunModel[423].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 260
        gunModel[423].setRotationPoint(168.25F, -81.75F, -8.8F);

        gunModel[424].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 260
        gunModel[424].setRotationPoint(168.25F, -85.75F, -6.8F);

        gunModel[425].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 260
        gunModel[425].setRotationPoint(155.25F, -81.75F, -8.8F);

        gunModel[426].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 260
        gunModel[426].setRotationPoint(155.25F, -85.75F, -6.8F);

        gunModel[427].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 260
        gunModel[427].setRotationPoint(187.25F, -81.75F, -8.8F);

        gunModel[428].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 260
        gunModel[428].setRotationPoint(187.25F, -85.75F, -6.8F);

        gunModel[429].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 260
        gunModel[429].setRotationPoint(174.25F, -81.75F, -8.8F);

        gunModel[430].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 260
        gunModel[430].setRotationPoint(174.25F, -85.75F, -6.8F);

        gunModel[431].addShapeBox(-1F, -1F, 0F, 5, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[431].setRotationPoint(68.25F, -77.75F, 10.2F);

        gunModel[432].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[432].setRotationPoint(73.25F, -74.75F, 10.2F);

        gunModel[433].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[433].setRotationPoint(73.25F, -77.75F, 10.2F);

        gunModel[434].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
        gunModel[434].setRotationPoint(76.25F, -77.75F, 10.2F);

        gunModel[435].addShapeBox(-1F, -1F, 0F, 1, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[435].setRotationPoint(76.25F, -74.75F, 10.2F);

        gunModel[436].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F); // Box 287
        gunModel[436].setRotationPoint(75.19F, -62F, -11.8F);

        gunModel[437].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F); // Box 288
        gunModel[437].setRotationPoint(80.21F, -62F, -11.8F);

        gunModel[438].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F); // Box 289
        gunModel[438].setRotationPoint(85.23F, -62F, -11.8F);

        gunModel[439].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F); // Box 290
        gunModel[439].setRotationPoint(90.25F, -62F, -11.8F);

        gunModel[440].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F); // Box 291
        gunModel[440].setRotationPoint(95.27F, -62F, -11.8F);

        gunModel[441].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F); // Box 292
        gunModel[441].setRotationPoint(100.29F, -62F, -11.8F);

        gunModel[442].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F); // Box 293
        gunModel[442].setRotationPoint(105.32F, -62F, -11.8F);

        gunModel[443].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F); // Box 294
        gunModel[443].setRotationPoint(110.34F, -62F, -11.8F);

        gunModel[444].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F); // Box 295
        gunModel[444].setRotationPoint(115.36F, -62F, -11.8F);

        gunModel[445].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F); // Box 296
        gunModel[445].setRotationPoint(120.39F, -62F, -11.8F);

        gunModel[446].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F); // Box 297
        gunModel[446].setRotationPoint(125.42F, -62F, -11.8F);

        gunModel[447].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F); // Box 298
        gunModel[447].setRotationPoint(130.44F, -62F, -11.8F);

        gunModel[448].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F); // Box 299
        gunModel[448].setRotationPoint(135.46F, -62F, -11.8F);

        gunModel[449].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F); // Box 300
        gunModel[449].setRotationPoint(140.49F, -62F, -11.8F);

        gunModel[450].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F); // Box 301
        gunModel[450].setRotationPoint(145.52F, -62F, -11.8F);

        gunModel[451].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F); // Box 302
        gunModel[451].setRotationPoint(150.55F, -62F, -11.8F);

        gunModel[452].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F); // Box 303
        gunModel[452].setRotationPoint(155.57F, -62F, -11.8F);

        gunModel[453].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F); // Box 305
        gunModel[453].setRotationPoint(160.9F, -62F, -11.8F);

        gunModel[454].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F); // Box 305
        gunModel[454].setRotationPoint(165.9F, -62F, -11.8F);

        gunModel[455].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F); // Box 305
        gunModel[455].setRotationPoint(170.9F, -62F, -11.8F);

        gunModel[456].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F); // Box 305
        gunModel[456].setRotationPoint(175.9F, -62F, -11.8F);

        gunModel[457].addShapeBox(-1F, -1F, 0F, 7, 1, 23, 0F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0.75F, -7.7F, -2.4F, 0.75F, -7.7F, -2.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F); // Box 305
        gunModel[457].setRotationPoint(190.9F, -62F, -11.8F);

        gunModel[458].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F); // Box 305
        gunModel[458].setRotationPoint(180.9F, -62F, -11.8F);

        gunModel[459].addShapeBox(-1F, -1F, 0F, 3, 1, 23, 0F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, 0F, 0.75F, -6.9F); // Box 305
        gunModel[459].setRotationPoint(185.9F, -62F, -11.8F);

        gunModel[460].addShapeBox(-1F, -1F, 0F, 5, 1, 23, 0F, 0F, 0F, -6.2F, -0.4F, 0F, -6.2F, -0.4F, 0F, -5.4F, 0F, 0F, -5.4F, -2F, 0.75F, -7.7F, -0.4F, 0.75F, -7.7F, -0.4F, 0.75F, -6.9F, -2F, 0.75F, -6.9F); // Box 287
        gunModel[460].setRotationPoint(68.19F, -62F, -11.8F);

        gunModel[461].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[461].setRotationPoint(92.25F, -66.75F, -6.8F);

        gunModel[462].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
        gunModel[462].setRotationPoint(92.25F, -70.75F, -8.8F);

        gunModel[463].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[463].setRotationPoint(79.25F, -66.75F, -6.8F);

        gunModel[464].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[464].setRotationPoint(79.25F, -70.75F, -8.8F);

        gunModel[465].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[465].setRotationPoint(111.25F, -66.75F, -6.8F);

        gunModel[466].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
        gunModel[466].setRotationPoint(111.25F, -70.75F, -8.8F);

        gunModel[467].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[467].setRotationPoint(98.25F, -66.75F, -6.8F);

        gunModel[468].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[468].setRotationPoint(98.25F, -70.75F, -8.8F);

        gunModel[469].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[469].setRotationPoint(130.25F, -66.75F, -6.8F);

        gunModel[470].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
        gunModel[470].setRotationPoint(130.25F, -70.75F, -8.8F);

        gunModel[471].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[471].setRotationPoint(117.25F, -66.75F, -6.8F);

        gunModel[472].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[472].setRotationPoint(117.25F, -70.75F, -8.8F);

        gunModel[473].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[473].setRotationPoint(149.25F, -66.75F, -6.8F);

        gunModel[474].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
        gunModel[474].setRotationPoint(149.25F, -70.75F, -8.8F);

        gunModel[475].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[475].setRotationPoint(136.25F, -66.75F, -6.8F);

        gunModel[476].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[476].setRotationPoint(136.25F, -70.75F, -8.8F);

        gunModel[477].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[477].setRotationPoint(168.25F, -66.75F, -6.8F);

        gunModel[478].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
        gunModel[478].setRotationPoint(168.25F, -70.75F, -8.8F);

        gunModel[479].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[479].setRotationPoint(155.25F, -66.75F, -6.8F);

        gunModel[480].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[480].setRotationPoint(155.25F, -70.75F, -8.8F);

        gunModel[481].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[481].setRotationPoint(187.25F, -66.75F, -6.8F);

        gunModel[482].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
        gunModel[482].setRotationPoint(187.25F, -70.75F, -8.8F);

        gunModel[483].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 260
        gunModel[483].setRotationPoint(174.25F, -66.75F, -6.8F);

        gunModel[484].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[484].setRotationPoint(174.25F, -70.75F, -8.8F);
    }

    private void initdefaultBarrelModel_1() {
        defaultBarrelModel[0] = new ModelRendererTurbo(this, 329, 505, textureX, textureY); // Box 407
        defaultBarrelModel[1] = new ModelRendererTurbo(this, 377, 505, textureX, textureY); // Box 408
        defaultBarrelModel[2] = new ModelRendererTurbo(this, 265, 153, textureX, textureY); // Box 409
        defaultBarrelModel[3] = new ModelRendererTurbo(this, 425, 505, textureX, textureY); // Box 410
        defaultBarrelModel[4] = new ModelRendererTurbo(this, 473, 505, textureX, textureY); // Box 411
        defaultBarrelModel[5] = new ModelRendererTurbo(this, 521, 505, textureX, textureY); // Box 412
        defaultBarrelModel[6] = new ModelRendererTurbo(this, 569, 505, textureX, textureY); // Box 413
        defaultBarrelModel[7] = new ModelRendererTurbo(this, 33, 513, textureX, textureY); // Box 414
        defaultBarrelModel[8] = new ModelRendererTurbo(this, 185, 513, textureX, textureY); // Box 415
        defaultBarrelModel[9] = new ModelRendererTurbo(this, 633, 513, textureX, textureY); // Box 416
        defaultBarrelModel[10] = new ModelRendererTurbo(this, 737, 489, textureX, textureY); // Box 417
        defaultBarrelModel[11] = new ModelRendererTurbo(this, 841, 489, textureX, textureY); // Box 418
        defaultBarrelModel[12] = new ModelRendererTurbo(this, 129, 505, textureX, textureY); // Box 419
        defaultBarrelModel[13] = new ModelRendererTurbo(this, 697, 513, textureX, textureY); // Box 420
        defaultBarrelModel[14] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box 421
        defaultBarrelModel[15] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Box 422
        defaultBarrelModel[16] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 423
        defaultBarrelModel[17] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 424

        defaultBarrelModel[0].addShapeBox(-1F, -1F, 0F, 3, 8, 18, 0F, 0.75F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0.75F, 0F, -8F, 0.75F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0.75F, 0F, -8F); // Box 407
        defaultBarrelModel[0].setRotationPoint(254.65F, -80.5F, -8.9F);

        defaultBarrelModel[1].addShapeBox(-1F, -1F, 0F, 3, 20, 20, 0F, 0.75F, 0F, -17F, 0F, 0F, -17F, 0F, -1F, -1F, 0.75F, -1F, -1F, 0.75F, -17F, -17F, 0F, -17F, -17F, 0F, -17F, 0F, 0.75F, -17F, 0F); // Box 408
        defaultBarrelModel[1].setRotationPoint(254.65F, -80.5F, -15.9F);

        defaultBarrelModel[2].addShapeBox(-1F, -1F, 0F, 3, 18, 8, 0F, 0.75F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0.75F, -8F, 0F, 0.75F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0.75F, -8F, 0F); // Box 409
        defaultBarrelModel[2].setRotationPoint(254.65F, -85.5F, -3.9F);

        defaultBarrelModel[3].addShapeBox(-1F, -1F, 0F, 3, 20, 20, 0F, 0.75F, -17F, -17F, 0F, -17F, -17F, 0F, -17F, 0F, 0.75F, -17F, 0F, 0.75F, 0F, -17F, 0F, 0F, -17F, 0F, -1F, -1F, 0.75F, -1F, -1F); // Box 410
        defaultBarrelModel[3].setRotationPoint(254.65F, -92.5F, -15.9F);

        defaultBarrelModel[4].addShapeBox(-1F, -1F, 0F, 3, 20, 20, 0F, 0.75F, -17F, 0F, 0F, -17F, 0F, 0F, -17F, -17F, 0.75F, -17F, -17F, 0.75F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -17F, 0.75F, 0F, -17F); // Box 411
        defaultBarrelModel[4].setRotationPoint(254.65F, -92.5F, -3.9F);

        defaultBarrelModel[5].addShapeBox(-1F, -1F, 0F, 3, 20, 20, 0F, 0.75F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -17F, 0.75F, 0F, -17F, 0.75F, -17F, 0F, 0F, -17F, 0F, 0F, -17F, -17F, 0.75F, -17F, -17F); // Box 412
        defaultBarrelModel[5].setRotationPoint(254.65F, -80.5F, -3.9F);

        defaultBarrelModel[6].addShapeBox(-1F, -1F, 0F, 11, 20, 20, 0F, 0.75F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -17F, 0.75F, 0F, -17F, 0.75F, -17F, 0F, 0F, -17F, 0F, 0F, -18.25F, -18.25F, 0.75F, -18.25F, -18.25F); // Box 413
        defaultBarrelModel[6].setRotationPoint(258.4F, -80.5F, -3.9F);

        defaultBarrelModel[7].addShapeBox(-1F, -1F, 0F, 11, 20, 20, 0F, 0.75F, 0F, -17F, 0F, 0F, -17F, 0F, -1F, -1F, 0.75F, -1F, -1F, 0.75F, -18.25F, -18.25F, 0F, -18.25F, -18.25F, 0F, -17F, 0F, 0.75F, -17F, 0F); // Box 414
        defaultBarrelModel[7].setRotationPoint(258.4F, -80.5F, -15.9F);

        defaultBarrelModel[8].addShapeBox(-1F, -1F, 0F, 11, 20, 20, 0F, 0.75F, -17F, 0F, 0F, -17F, 0F, 0F, -18.25F, -18.25F, 0.75F, -18.25F, -18.25F, 0.75F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -17F, 0.75F, 0F, -17F); // Box 415
        defaultBarrelModel[8].setRotationPoint(258.4F, -92.5F, -3.9F);

        defaultBarrelModel[9].addShapeBox(-1F, -1F, 0F, 11, 20, 20, 0F, 0.75F, -18.25F, -18.25F, 0F, -18.25F, -18.25F, 0F, -17F, 0F, 0.75F, -17F, 0F, 0.75F, 0F, -17F, 0F, 0F, -17F, 0F, -1F, -1F, 0.75F, -1F, -1F); // Box 416
        defaultBarrelModel[9].setRotationPoint(258.4F, -92.5F, -15.9F);

        defaultBarrelModel[10].addShapeBox(-1F, -1F, 0F, 1, 20, 20, 0F, 0.75F, -18.25F, -18.25F, 0F, -18.25F, -18.25F, 0F, -17F, 0F, 0.75F, -17F, 0F, 0.75F, 0F, -17F, 0F, 0F, -17F, 0F, -1F, -1F, 0.75F, -1F, -1F); // Box 417
        defaultBarrelModel[10].setRotationPoint(270.15F, -92.5F, -15.9F);

        defaultBarrelModel[11].addShapeBox(-1F, -1F, 0F, 1, 20, 20, 0F, 0.75F, -17F, 0F, 0F, -17F, 0F, 0F, -18.25F, -18.25F, 0.75F, -18.25F, -18.25F, 0.75F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -17F, 0.75F, 0F, -17F); // Box 418
        defaultBarrelModel[11].setRotationPoint(270.15F, -92.5F, -3.9F);

        defaultBarrelModel[12].addShapeBox(-1F, -1F, 0F, 1, 20, 20, 0F, 0.75F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -17F, 0.75F, 0F, -17F, 0.75F, -17F, 0F, 0F, -17F, 0F, 0F, -18.25F, -18.25F, 0.75F, -18.25F, -18.25F); // Box 419
        defaultBarrelModel[12].setRotationPoint(270.15F, -80.5F, -3.9F);

        defaultBarrelModel[13].addShapeBox(-1F, -1F, 0F, 1, 20, 20, 0F, 0.75F, 0F, -17F, 0F, 0F, -17F, 0F, -1F, -1F, 0.75F, -1F, -1F, 0.75F, -18.25F, -18.25F, 0F, -18.25F, -18.25F, 0F, -17F, 0F, 0.75F, -17F, 0F); // Box 420
        defaultBarrelModel[13].setRotationPoint(270.15F, -80.5F, -15.9F);

        defaultBarrelModel[14].addShapeBox(-1F, -1F, 0F, 1, 1, 18, 0F, 0.75F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0.75F, 0F, -8F, 0.75F, 0F, -7.25F, 0F, 0F, -7.25F, 0F, 0F, -7.25F, 0.75F, 0F, -7.25F); // Box 421
        defaultBarrelModel[14].setRotationPoint(270.15F, -80.5F, -8.9F);

        defaultBarrelModel[15].addShapeBox(-1F, -1F, 0F, 1, 1, 18, 0F, 0.75F, 0F, -7.25F, 0F, 0F, -7.25F, 0F, 0F, -7.25F, 0.75F, 0F, -7.25F, 0.75F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0.75F, 0F, -8F); // Box 422
        defaultBarrelModel[15].setRotationPoint(270.15F, -73.5F, -8.9F);

        defaultBarrelModel[16].addShapeBox(-1F, -1F, 0F, 1, 18, 1, 0F, 0.75F, -8F, 0F, 0F, -8F, 0F, 0F, -7.25F, 0F, 0.75F, -7.25F, 0F, 0.75F, -8F, 0F, 0F, -8F, 0F, 0F, -7.25F, 0F, 0.75F, -7.25F, 0F); // Box 423
        defaultBarrelModel[16].setRotationPoint(270.15F, -85.5F, -3.9F);

        defaultBarrelModel[17].addShapeBox(-1F, -1F, 0F, 1, 18, 1, 0F, 0.75F, -7.25F, 0F, 0F, -7.25F, 0F, 0F, -8F, 0F, 0.75F, -8F, 0F, 0.75F, -7.25F, 0F, 0F, -7.25F, 0F, 0F, -8F, 0F, 0.75F, -8F, 0F); // Box 424
        defaultBarrelModel[17].setRotationPoint(270.15F, -85.5F, 3.1F);
    }

    private void initdefaultScopeModel_1() {
        defaultScopeModel[0] = new ModelRendererTurbo(this, 121, 241, textureX, textureY); // Box 316
        defaultScopeModel[1] = new ModelRendererTurbo(this, 529, 249, textureX, textureY); // Box 318
        defaultScopeModel[2] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 319
        defaultScopeModel[3] = new ModelRendererTurbo(this, 601, 249, textureX, textureY); // Box 320
        defaultScopeModel[4] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 321
        defaultScopeModel[5] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 322
        defaultScopeModel[6] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 323
        defaultScopeModel[7] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 324
        defaultScopeModel[8] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 325
        defaultScopeModel[9] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Box 327
        defaultScopeModel[10] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 331
        defaultScopeModel[11] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 333
        defaultScopeModel[12] = new ModelRendererTurbo(this, 657, 249, textureX, textureY); // Box 303
        defaultScopeModel[13] = new ModelRendererTurbo(this, 681, 57, textureX, textureY); // Box 306
        defaultScopeModel[14] = new ModelRendererTurbo(this, 929, 161, textureX, textureY); // Box 307
        defaultScopeModel[15] = new ModelRendererTurbo(this, 745, 57, textureX, textureY); // Box 308
        defaultScopeModel[16] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 309
        defaultScopeModel[17] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 310
        defaultScopeModel[18] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 314
        defaultScopeModel[19] = new ModelRendererTurbo(this, 977, 145, textureX, textureY); // Box 315
        defaultScopeModel[20] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 316
        defaultScopeModel[21] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 317
        defaultScopeModel[22] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 318
        defaultScopeModel[23] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 319
        defaultScopeModel[24] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 320
        defaultScopeModel[25] = new ModelRendererTurbo(this, 513, 9, textureX, textureY); // Box 322
        defaultScopeModel[26] = new ModelRendererTurbo(this, 569, 9, textureX, textureY); // Box 323
        defaultScopeModel[27] = new ModelRendererTurbo(this, 737, 9, textureX, textureY); // Box 324
        defaultScopeModel[28] = new ModelRendererTurbo(this, 761, 9, textureX, textureY); // Box 325
        defaultScopeModel[29] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 326
        defaultScopeModel[30] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 328
        defaultScopeModel[31] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 332
        defaultScopeModel[32] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 331
        defaultScopeModel[33] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 331
        defaultScopeModel[34] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 322

        defaultScopeModel[0].addShapeBox(-1F, -1F, 0F, 6, 3, 23, 0F, 0.5F, 0F, -7.7F, -3.35F, 0F, -7.7F, -3.35F, 0F, -6.9F, 0.5F, 0F, -6.9F, 0.5F, 0.6F, -7.7F, 0F, 0.6F, -7.7F, 0F, 0.6F, -6.9F, 0.5F, 0.6F, -6.9F); // Box 316
        defaultScopeModel[0].setRotationPoint(-15.75F, -96.1F, -11.8F);

        defaultScopeModel[1].addShapeBox(-1F, -1F, 0F, 10, 2, 23, 0F, 0.5F, 0.25F, -8.7F, 0F, 0.25F, -8.7F, 0F, 0.25F, -7.9F, 0.5F, 0.25F, -7.9F, 0.5F, 0F, -8.7F, 0F, 0F, -8.7F, 0F, 0F, -7.9F, 0.5F, 0F, -7.9F); // Box 318
        defaultScopeModel[1].setRotationPoint(-24.25F, -96.1F, -11.8F);

        defaultScopeModel[2].addShapeBox(-1F, -1F, 0F, 4, 2, 23, 0F, 0.5F, -0.45F, -8.7F, 0.75F, -0.45F, -8.7F, 0.75F, -0.45F, -7.9F, 0.5F, -0.45F, -7.9F, 0.5F, 0F, -8.7F, 0.75F, 0F, -8.7F, 0.75F, 0F, -7.9F, 0.5F, 0F, -7.9F); // Box 319
        defaultScopeModel[2].setRotationPoint(-22F, -98.35F, -11.8F);

        defaultScopeModel[3].addShapeBox(-1F, -1F, 0F, 3, 2, 23, 0F, 0F, -0.45F, -8.7F, 0F, -1.95F, -8.7F, 0F, -1.95F, -7.9F, 0F, -0.45F, -7.9F, 0F, 0F, -8.7F, 0F, 0F, -8.7F, 0F, 0F, -7.9F, 0F, 0F, -7.9F); // Box 320
        defaultScopeModel[3].setRotationPoint(-17.25F, -98.35F, -11.8F);

        defaultScopeModel[4].addShapeBox(-0.9F, -11F, 0F, 1, 10, 1, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 321
        defaultScopeModel[4].setRotationPoint(-24.25F, -96F, 3.3F);

        defaultScopeModel[5].addShapeBox(-0.9F, -13.6F, 0F, 1, 2, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
        defaultScopeModel[5].setRotationPoint(-24.25F, -96F, 3.3F);

        defaultScopeModel[6].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0.1F, -0.3F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, 0F, 0.1F, -0.2F, 0F); // Box 323
        defaultScopeModel[6].setRotationPoint(-24.15F, -96F, 3.3F);

        defaultScopeModel[7].addShapeBox(-0.6F, -1F, 0F, 1, 1, 1, 0F, 0.1F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 324
        defaultScopeModel[7].setRotationPoint(-24.15F, -96F, 3.3F);

        defaultScopeModel[8].addShapeBox(-0.2F, -1F, 0F, 1, 1, 1, 0F, 0.1F, 0.1F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, 0.1F, 0.1F, 0F); // Box 325
        defaultScopeModel[8].setRotationPoint(-24.15F, -96F, 3.3F);

        defaultScopeModel[9].addShapeBox(-0.9F, -11F, 0F, 1, 10, 1, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 327
        defaultScopeModel[9].setRotationPoint(-24.25F, -96F, -4.15F);

        defaultScopeModel[10].addShapeBox(-0.9F, -11F, 0F, 1, 7, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.45F, 0F, 0F, 0.45F); // Box 331
        defaultScopeModel[10].setRotationPoint(-24.25F, -94F, -3.15F);

        defaultScopeModel[11].addShapeBox(-0.9F, -11F, 3.7F, 1, 2, 1, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
        defaultScopeModel[11].setRotationPoint(-24.25F, -96F, -4.15F);

        defaultScopeModel[12].addShapeBox(-1F, -1F, 0F, 15, 4, 23, 0F, 0.3F, 0F, -6.05F, -0.3F, 0F, -6.05F, -0.3F, 0F, -5.35F, 0.3F, 0F, -5.35F, 0.3F, -0.15F, -6.05F, -0.3F, -0.15F, -6.05F, -0.3F, -0.15F, -5.35F, 0.3F, -0.15F, -5.35F); // Box 303
        defaultScopeModel[12].setRotationPoint(178.25F, -93.25F, -11.8F);

        defaultScopeModel[13].addShapeBox(-1F, -1F, 0F, 5, 3, 13, 0F, 0F, 0.1F, -5.95F, -0.8F, 0.1F, -5.95F, -0.8F, 0.1F, -5.55F, 0F, 0.1F, -5.55F, 0F, -0.15F, -5.95F, -0.8F, -0.15F, -5.95F, -0.8F, -0.15F, -5.55F, 0F, -0.15F, -5.55F); // Box 306
        defaultScopeModel[13].setRotationPoint(179.4F, -96.1F, -3.8F);

        defaultScopeModel[14].addShapeBox(-1F, -1F, 0F, 7, 3, 19, 0F, 0.8F, 0.1F, -6.25F, -0.3F, 0.1F, -6.25F, -0.3F, 0.1F, -5.55F, 0.8F, 0.1F, -5.55F, 0.8F, -0.15F, -6.25F, 1.45F, -0.15F, -6.25F, 1.45F, -0.15F, -5.55F, 0.8F, -0.15F, -5.55F); // Box 307
        defaultScopeModel[14].setRotationPoint(184.4F, -96.1F, -9.8F);

        defaultScopeModel[15].addShapeBox(-1F, -1F, 0F, 5, 3, 13, 0F, 0F, 0.1F, -6.25F, -0.8F, 0.1F, -6.25F, -0.8F, 0.1F, -5.25F, 0F, 0.1F, -5.25F, 0F, -0.15F, -6.25F, -0.8F, -0.15F, -6.25F, -0.8F, -0.15F, -5.25F, 0F, -0.15F, -5.25F); // Box 308
        defaultScopeModel[15].setRotationPoint(179.4F, -96.1F, -9.8F);

        defaultScopeModel[16].addShapeBox(-1F, -1F, 0F, 1, 3, 13, 0F, 0.45F, -0.9F, -5.95F, 0F, 0.1F, -5.95F, 0F, 0.1F, -5.55F, 0.45F, -0.9F, -5.55F, 0.45F, -0.15F, -5.95F, 0F, -0.15F, -5.95F, 0F, -0.15F, -5.55F, 0.45F, -0.15F, -5.55F); // Box 309
        defaultScopeModel[16].setRotationPoint(178.4F, -96.1F, -3.8F);

        defaultScopeModel[17].addShapeBox(-1F, -1F, 0F, 1, 3, 13, 0F, 0.45F, -0.9F, -6.25F, 0F, 0.1F, -6.25F, 0F, 0.1F, -5.25F, 0.45F, -0.9F, -5.25F, 0.45F, -0.15F, -6.25F, 0F, -0.15F, -6.25F, 0F, -0.15F, -5.25F, 0.45F, -0.15F, -5.25F); // Box 310
        defaultScopeModel[17].setRotationPoint(178.4F, -96.1F, -9.8F);

        defaultScopeModel[18].addShapeBox(-1F, -1F, 0F, 1, 3, 19, 0F, 0F, -0.9F, -5.95F, 0F, 0.1F, -5.95F, 0F, 0.1F, -5.15F, 0F, -0.9F, -5.15F, 0F, -1.15F, -5.95F, 0F, -0.15F, -5.95F, 0F, -0.15F, -5.15F, 0F, -1.15F, -5.15F); // Box 314
        defaultScopeModel[18].setRotationPoint(180.4F, -96F, -9.85F);

        defaultScopeModel[19].addShapeBox(-1F, -1F, 0F, 1, 3, 19, 0F, 0F, 0.1F, -5.95F, 0F, 0.1F, -5.95F, 0F, 0.1F, -5.15F, 0F, 0.1F, -5.15F, 0F, -0.15F, -5.95F, 0F, -0.15F, -5.95F, 0F, -0.15F, -5.15F, 0F, -0.15F, -5.15F); // Box 315
        defaultScopeModel[19].setRotationPoint(181.4F, -96F, -9.85F);

        defaultScopeModel[20].addShapeBox(-1F, -1F, 0F, 1, 3, 19, 0F, 0F, 0.1F, -5.95F, 0F, -0.9F, -5.95F, 0F, -0.9F, -5.15F, 0F, 0.1F, -5.15F, 0F, -0.15F, -5.95F, 0F, -1.15F, -5.95F, 0F, -1.15F, -5.15F, 0F, -0.15F, -5.15F); // Box 316
        defaultScopeModel[20].setRotationPoint(182.4F, -96F, -9.85F);

        defaultScopeModel[21].addShapeBox(-0.9F, -11F, 3.7F, 3, 9, 1, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
        defaultScopeModel[21].setRotationPoint(180.3F, -94F, -4.15F);

        defaultScopeModel[22].addShapeBox(-0.9F, -11F, 3.7F, 3, 9, 1, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
        defaultScopeModel[22].setRotationPoint(180.3F, -94F, -3.15F);

        defaultScopeModel[23].addShapeBox(-0.9F, -11F, 3.7F, 3, 9, 1, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
        defaultScopeModel[23].setRotationPoint(180.3F, -94F, -5.15F);

        defaultScopeModel[24].addShapeBox(-0.9F, -11F, 3.7F, 3, 2, 1, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
        defaultScopeModel[24].setRotationPoint(180.3F, -96.6F, -3.15F);

        defaultScopeModel[25].addShapeBox(-0.9F, -11F, 3.7F, 3, 2, 1, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 322
        defaultScopeModel[25].setRotationPoint(180.3F, -98.6F, -3.15F);

        defaultScopeModel[26].addShapeBox(-0.9F, -11F, 3.7F, 3, 2, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 323
        defaultScopeModel[26].setRotationPoint(180.3F, -100.6F, -3.15F);

        defaultScopeModel[27].addShapeBox(-0.9F, -11F, 3.7F, 3, 2, 1, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 324
        defaultScopeModel[27].setRotationPoint(180.3F, -96.6F, -5.15F);

        defaultScopeModel[28].addShapeBox(-0.9F, -11F, 3.7F, 3, 2, 1, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2.75F, 0F, 0F, -2.75F); // Box 325
        defaultScopeModel[28].setRotationPoint(180.3F, -98.6F, -5.15F);

        defaultScopeModel[29].addShapeBox(-0.9F, -11F, 3.7F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2.75F, 0F, 0F, -2.75F); // Box 326
        defaultScopeModel[29].setRotationPoint(180.3F, -100.6F, -5.15F);

        defaultScopeModel[30].addShapeBox(-0.9F, -11F, 3.7F, 3, 1, 3, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F); // Box 328
        defaultScopeModel[30].setRotationPoint(180.3F, -100F, -5.15F);

        defaultScopeModel[31].addShapeBox(-0.9F, -11F, 3.7F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
        defaultScopeModel[31].setRotationPoint(180.8F, -96.6F, -4.15F);

        defaultScopeModel[32].addShapeBox(-0.9F, -11F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 331
        defaultScopeModel[32].setRotationPoint(-24.25F, -95F, -3.2F);

        defaultScopeModel[33].addShapeBox(-0.9F, -11F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
        defaultScopeModel[33].setRotationPoint(-24.25F, -95F, 2.34999999999999F);

        defaultScopeModel[34].addShapeBox(-0.9F, -13.6F, 0F, 1, 2, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
        defaultScopeModel[34].setRotationPoint(-24.25F, -96F, -4.15F);
    }

    private void initammoModel_1() {
        ammoModel[0] = new ModelRendererTurbo(this, 377, 553, textureX, textureY); // Box 445
        ammoModel[1] = new ModelRendererTurbo(this, 489, 553, textureX, textureY); // Box 448
        ammoModel[2] = new ModelRendererTurbo(this, 1, 561, textureX, textureY); // Box 449
        ammoModel[3] = new ModelRendererTurbo(this, 129, 561, textureX, textureY); // Box 450
        ammoModel[4] = new ModelRendererTurbo(this, 601, 561, textureX, textureY); // Box 451
        ammoModel[5] = new ModelRendererTurbo(this, 745, 537, textureX, textureY); // Box 452
        ammoModel[6] = new ModelRendererTurbo(this, 769, 553, textureX, textureY); // Box 453
        ammoModel[7] = new ModelRendererTurbo(this, 841, 553, textureX, textureY); // Box 454
        ammoModel[8] = new ModelRendererTurbo(this, 281, 561, textureX, textureY); // Box 455
        ammoModel[9] = new ModelRendererTurbo(this, 153, 209, textureX, textureY); // Box 456
        ammoModel[10] = new ModelRendererTurbo(this, 1, 529, textureX, textureY); // Box 457
        ammoModel[11] = new ModelRendererTurbo(this, 721, 561, textureX, textureY); // Box 458
        ammoModel[12] = new ModelRendererTurbo(this, 881, 561, textureX, textureY); // Box 459
        ammoModel[13] = new ModelRendererTurbo(this, 913, 561, textureX, textureY); // Box 460
        ammoModel[14] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 461
        ammoModel[15] = new ModelRendererTurbo(this, 737, 145, textureX, textureY); // Box 462
        ammoModel[16] = new ModelRendererTurbo(this, 425, 233, textureX, textureY); // Box 465
        ammoModel[17] = new ModelRendererTurbo(this, 81, 273, textureX, textureY); // Box 466
        ammoModel[18] = new ModelRendererTurbo(this, 225, 273, textureX, textureY); // Box 467
        ammoModel[19] = new ModelRendererTurbo(this, 305, 273, textureX, textureY); // Box 468
        ammoModel[20] = new ModelRendererTurbo(this, 385, 273, textureX, textureY); // Box 469
        ammoModel[21] = new ModelRendererTurbo(this, 929, 289, textureX, textureY); // Box 470
        ammoModel[22] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 471
        ammoModel[23] = new ModelRendererTurbo(this, 81, 313, textureX, textureY); // Box 472
        ammoModel[24] = new ModelRendererTurbo(this, 673, 25, textureX, textureY); // Box 474
        ammoModel[25] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 475
        ammoModel[26] = new ModelRendererTurbo(this, 937, 33, textureX, textureY); // Box 476
        ammoModel[27] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 477
        ammoModel[28] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 479
        ammoModel[29] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 486
        ammoModel[30] = new ModelRendererTurbo(this, 969, 49, textureX, textureY); // Box 487
        ammoModel[31] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 488
        ammoModel[32] = new ModelRendererTurbo(this, 529, 57, textureX, textureY); // Box 489
        ammoModel[33] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Box 490
        ammoModel[34] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Box 491
        ammoModel[35] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 492
        ammoModel[36] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Box 493
        ammoModel[37] = new ModelRendererTurbo(this, 897, 57, textureX, textureY); // Box 494
        ammoModel[38] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 495
        ammoModel[39] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 496
        ammoModel[40] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 497
        ammoModel[41] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 498
        ammoModel[42] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 499
        ammoModel[43] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 500

        ammoModel[0].addShapeBox(-1F, -1F, 0F, 35, 13, 19, 0F, 1F, 0F, -5.95F, -1F, 0F, -5.95F, -1F, 0F, -5.2F, 1F, 0F, -5.2F, 0F, 6F, -5.95F, 0F, 0F, -5.95F, 0F, 0F, -5.2F, 0F, 6F, -5.2F); // Box 445
        ammoModel[0].setRotationPoint(28.5F, -58.75F, -9.8F);

        ammoModel[1].addShapeBox(-1F, -1F, 0F, 35, 13, 19, 0F, 1F, 0F, -5.95F, -1F, 6F, -5.95F, -1F, 6F, -5.2F, 1F, 0F, -5.2F, -3F, 6F, -5.95F, 2F, -3F, -5.95F, 2F, -3F, -5.2F, -3F, 6F, -5.2F); // Box 448
        ammoModel[1].setRotationPoint(29.5F, -39.75F, -9.8F);

        ammoModel[2].addShapeBox(-1F, -1F, 0F, 35, 13, 19, 0F, 0F, 0F, -5.95F, -1F, 9F, -5.95F, -1F, 9F, -5.2F, 0F, 0F, -5.2F, -7F, 6F, -5.95F, 6F, -5F, -5.95F, 6F, -5F, -5.2F, -7F, 6F, -5.2F); // Box 449
        ammoModel[2].setRotationPoint(32.5F, -20.75F, -9.8F);

        ammoModel[3].addShapeBox(-1F, -1F, 0F, 35, 13, 19, 0F, 0F, 0F, -5.95F, -1F, 11F, -5.95F, -1F, 11F, -5.2F, 0F, 0F, -5.2F, -10F, 4F, -5.95F, 4F, -15F, -5.95F, 4F, -15F, -5.2F, -10F, 4F, -5.2F); // Box 450
        ammoModel[3].setRotationPoint(39.5F, -1.75F, -9.8F);

        ammoModel[4].addShapeBox(-1F, -1F, 0F, 35, 5, 21, 0F, 0F, 0F, -5.8F, -4.5F, 20F, -5.8F, -4.5F, 20F, -5.2F, 0F, 0F, -5.2F, -1.5F, -2.5F, -5.8F, -3.25F, -23F, -5.8F, -3.25F, -23F, -5.2F, -1.5F, -2.5F, -5.2F); // Box 451
        ammoModel[4].setRotationPoint(49.5F, 15.25F, -10.8F);

        ammoModel[5].addShapeBox(-1F, -1F, 0F, 2, 13, 15, 0F, 1F, 0F, -5.95F, -1F, 0F, -5.95F, -1F, 0F, -5.2F, 1F, 0F, -5.2F, 0F, 6F, -5.95F, 0F, 6F, -5.95F, 0F, 6F, -5.2F, 0F, 6F, -5.2F); // Box 452
        ammoModel[5].setRotationPoint(26.5F, -58.75F, -7.8F);

        ammoModel[6].addShapeBox(-1F, -1F, 0F, 1, 13, 15, 0F, 1F, 0F, -5.95F, 0F, 0F, -5.95F, 0F, 0F, -5.2F, 1F, 0F, -5.2F, -3F, 6F, -5.95F, 4F, 6F, -5.95F, 4F, 6F, -5.2F, -3F, 6F, -5.2F); // Box 453
        ammoModel[6].setRotationPoint(27.5F, -39.75F, -7.8F);

        ammoModel[7].addShapeBox(-1F, -1F, 0F, 1, 13, 15, 0F, 0F, 0F, -5.95F, 1F, 0F, -5.95F, 1F, 0F, -5.2F, 0F, 0F, -5.2F, -7F, 6F, -5.95F, 8F, 6F, -5.95F, 8F, 6F, -5.2F, -7F, 6F, -5.2F); // Box 454
        ammoModel[7].setRotationPoint(30.5F, -20.75F, -7.8F);

        ammoModel[8].addShapeBox(-1F, -1F, 0F, 1, 13, 15, 0F, 0F, 0F, -5.95F, 1.05F, 0F, -5.95F, 1.05F, 0F, -5.2F, 0F, 0F, -5.2F, -10F, 4F, -5.95F, 11.05F, 4F, -5.95F, 11.05F, 4F, -5.2F, -10F, 4F, -5.2F); // Box 455
        ammoModel[8].setRotationPoint(37.5F, -1.75F, -7.8F);

        ammoModel[9].addShapeBox(-1F, -1F, 0F, 1, 5, 15, 0F, 0F, 0F, -5.95F, 1F, 0F, -5.95F, 1F, 0F, -5.2F, 0F, 0F, -5.2F, -1.5F, -2.5F, -5.95F, 2.5F, -2.5F, -5.95F, 2.5F, -2.5F, -5.2F, -1.5F, -2.5F, -5.2F); // Box 456
        ammoModel[9].setRotationPoint(47.5F, 15.25F, -7.8F);

        ammoModel[10].addShapeBox(-1F, -1F, 0F, 1, 13, 14, 0F, 1F, 0F, -5.95F, -1F, 0F, -5.95F, -1F, 0F, -5.2F, 1F, 0F, -5.2F, 0F, 0F, -5.95F, 0F, 0F, -5.95F, 0F, 0F, -5.2F, 0F, 0F, -5.2F); // Box 457
        ammoModel[10].setRotationPoint(63.5F, -58.75F, -7.3F);

        ammoModel[11].addShapeBox(-1F, -1F, 0F, 1, 13, 14, 0F, 1F, 6F, -5.95F, -1F, 6F, -5.95F, -1F, 6F, -5.2F, 1F, 6F, -5.2F, -2F, -3F, -5.95F, 2F, -3F, -5.95F, 2F, -3F, -5.2F, -2F, -3F, -5.2F); // Box 458
        ammoModel[11].setRotationPoint(64.5F, -39.75F, -7.3F);

        ammoModel[12].addShapeBox(-1F, -1F, 0F, 1, 13, 14, 0F, 2F, 10F, -5.95F, -1F, 9F, -5.95F, -1F, 9F, -5.2F, 2F, 9F, -5.2F, -7F, 6F, -5.95F, 6F, -5F, -5.95F, 6F, -5F, -5.2F, -7F, 6F, -5.2F); // Box 459
        ammoModel[12].setRotationPoint(67.5F, -20.75F, -7.3F);

        ammoModel[13].addShapeBox(-1F, -1F, 0F, 1, 13, 14, 0F, 0F, 0F, -5.95F, -0.5F, 11F, -5.95F, -0.5F, 11F, -5.2F, 0F, 0F, -5.2F, -6F, -14F, -5.95F, 4.75F, -15F, -5.95F, 4.75F, -15F, -5.2F, -6F, -14F, -5.2F); // Box 460
        ammoModel[13].setRotationPoint(74F, -1.75F, -7.3F);

        ammoModel[14].addShapeBox(-1F, -1F, 0F, 35, 3, 4, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0.5F, 0F); // Box 461
        ammoModel[14].setRotationPoint(27.5F, -58.75F, 1F);

        ammoModel[15].addShapeBox(-1F, -1F, 0F, 35, 3, 4, 0F, 0.2F, -5F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, 0.2F, -5F, -0.2F, 0.05F, 5F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.2F, 0.05F, 5F, -0.2F); // Box 462
        ammoModel[15].setRotationPoint(28.5F, -47.5F, 1F);

        ammoModel[16].addShapeBox(-1F, -1F, 0F, 34, 3, 4, 0F, 0.5F, -5F, 0F, -0.05F, 3F, 0F, -0.05F, 3F, -0.2F, 0.5F, -5F, -0.2F, -0.15F, 5F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, -0.2F, -0.15F, 5F, -0.2F); // Box 465
        ammoModel[16].setRotationPoint(31.5F, -32.5F, 1F);

        ammoModel[17].addShapeBox(-1F, -1F, 0F, 33, 3, 4, 0F, 1F, -5F, 0F, -0.85F, 7.25F, 0F, -0.85F, 7.25F, -0.2F, 1F, -5F, -0.2F, -0.1F, 5F, 0F, 0.35F, -7.25F, 0F, 0.35F, -7.25F, -0.2F, -0.1F, 5F, -0.2F); // Box 466
        ammoModel[17].setRotationPoint(36.5F, -17.5F, 1F);

        ammoModel[18].addShapeBox(-1F, -1F, 0F, 32, 3, 4, 0F, 1.15F, -5F, 0F, -0.9F, 9.25F, 0F, -0.9F, 9.25F, -0.2F, 1.15F, -5F, -0.2F, -0.55F, 5F, 0F, 0.75F, -9.25F, 0F, 0.75F, -9.25F, -0.2F, -0.55F, 5F, -0.2F); // Box 467
        ammoModel[18].setRotationPoint(42.5F, -3.5F, 1F);

        ammoModel[19].addShapeBox(-1F, -1F, 0F, 32, 3, 4, 0F, 1.15F, -5F, -0.2F, -0.9F, 9.25F, -0.2F, -0.9F, 9.25F, 0F, 1.15F, -5F, 0F, -0.55F, 5F, -0.2F, 0.75F, -9.25F, -0.2F, 0.75F, -9.25F, 0F, -0.55F, 5F, 0F); // Box 468
        ammoModel[19].setRotationPoint(42.5F, -3.5F, -5F);

        ammoModel[20].addShapeBox(-1F, -1F, 0F, 33, 3, 4, 0F, 1F, -5F, -0.2F, -0.85F, 7.25F, -0.2F, -0.85F, 7.25F, 0F, 1F, -5F, 0F, -0.1F, 5F, -0.2F, 0.35F, -7.25F, -0.2F, 0.35F, -7.25F, 0F, -0.1F, 5F, 0F); // Box 469
        ammoModel[20].setRotationPoint(36.5F, -17.5F, -5F);

        ammoModel[21].addShapeBox(-1F, -1F, 0F, 34, 3, 4, 0F, 0.5F, -5F, -0.2F, -0.05F, 3F, -0.2F, -0.05F, 3F, 0F, 0.5F, -5F, 0F, -0.15F, 5F, -0.2F, 0.5F, -3F, -0.2F, 0.5F, -3F, 0F, -0.15F, 5F, 0F); // Box 470
        ammoModel[21].setRotationPoint(31.5F, -32.5F, -5F);

        ammoModel[22].addShapeBox(-1F, -1F, 0F, 35, 3, 4, 0F, 0.2F, -5F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, 0.2F, -5F, 0F, 0.05F, 5F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, 0F, 0.05F, 5F, 0F); // Box 471
        ammoModel[22].setRotationPoint(28.5F, -47.5F, -5F);

        ammoModel[23].addShapeBox(-1F, -1F, 0F, 35, 3, 4, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0.5F, 0F); // Box 472
        ammoModel[23].setRotationPoint(27.5F, -58.75F, -5F);

        ammoModel[24].addShapeBox(-1F, -1F, 0F, 3, 10, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 474
        ammoModel[24].setRotationPoint(51.25F, -55.75F, 1F);

        ammoModel[25].addShapeBox(-1F, -1F, 0F, 3, 14, 4, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -2.15F, 0F, 0F, 1.95F, 0F, 0F, 1.95F, 0F, 0F, -2.15F, 0F, 0F); // Box 475
        ammoModel[25].setRotationPoint(52.25F, -45.75F, 1F);

        ammoModel[26].addShapeBox(-1F, -1F, 0F, 3, 14, 4, 0F, -0.15F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.15F, 0F, 0F, -4.15F, 0F, 0F, 3.95F, -0.5F, 0F, 3.95F, -0.5F, 0F, -4.15F, 0F, 0F); // Box 476
        ammoModel[26].setRotationPoint(54.25F, -31.75F, 1F);

        ammoModel[27].addShapeBox(-1F, -1F, 0F, 3, 14, 4, 0F, -0.15F, 0F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0.5F, 0F, -0.15F, 0F, 0F, -7.15F, 0F, 0F, 6.95F, -0.5F, 0F, 6.95F, -0.5F, 0F, -7.15F, 0F, 0F); // Box 477
        ammoModel[27].setRotationPoint(58.25F, -17.75F, 1F);

        ammoModel[28].addShapeBox(-1F, -1F, 0F, 3, 7, 4, 0F, -0.15F, 0F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0.5F, 0F, -0.15F, 0F, 0F, -4.15F, 0F, 0F, 3.95F, -0.5F, 0F, 3.95F, -0.5F, 0F, -4.15F, 0F, 0F); // Box 479
        ammoModel[28].setRotationPoint(65.25F, -3.75F, 1F);

        ammoModel[29].addShapeBox(-1F, -1F, 0F, 3, 15, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 486
        ammoModel[29].setRotationPoint(33.25F, -55.75F, 1F);

        ammoModel[30].addShapeBox(-1F, -1F, 0F, 3, 14, 4, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -2.15F, 0F, 0F, 1.95F, 0F, 0F, 1.95F, 0F, 0F, -2.15F, 0F, 0F); // Box 487
        ammoModel[30].setRotationPoint(34.25F, -40.75F, 1F);

        ammoModel[31].addShapeBox(-1F, -1F, 0F, 3, 14, 4, 0F, -0.15F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.15F, 0F, 0F, -4.15F, 0F, 0F, 3.95F, -0.5F, 0F, 3.95F, -0.5F, 0F, -4.15F, 0F, 0F); // Box 488
        ammoModel[31].setRotationPoint(36.25F, -26.75F, 1F);

        ammoModel[32].addShapeBox(-1F, -1F, 0F, 3, 14, 4, 0F, -0.15F, 0F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0.5F, 0F, -0.15F, 0F, 0F, -7.15F, 0F, 0F, 6.95F, -0.5F, 0F, 6.95F, -0.5F, 0F, -7.15F, 0F, 0F); // Box 489
        ammoModel[32].setRotationPoint(40.25F, -12.75F, 1F);

        ammoModel[33].addShapeBox(-1F, -1F, 0F, 3, 12, 4, 0F, -0.15F, 0F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0.5F, 0F, -0.15F, 0F, 0F, -6.65F, 0F, 0F, 6.45F, -0.5F, 0F, 6.45F, -0.5F, 0F, -6.65F, 0F, 0F); // Box 490
        ammoModel[33].setRotationPoint(47.25F, 1.25F, 1F);

        ammoModel[34].addShapeBox(-1F, -1F, 0F, 3, 10, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 491
        ammoModel[34].setRotationPoint(51.25F, -55.75F, -5F);

        ammoModel[35].addShapeBox(-1F, -1F, 0F, 3, 15, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 492
        ammoModel[35].setRotationPoint(33.25F, -55.75F, -5F);

        ammoModel[36].addShapeBox(-1F, -1F, 0F, 3, 14, 4, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -2.15F, 0F, 0F, 1.95F, 0F, 0F, 1.95F, 0F, 0F, -2.15F, 0F, 0F); // Box 493
        ammoModel[36].setRotationPoint(34.25F, -40.75F, -5F);

        ammoModel[37].addShapeBox(-1F, -1F, 0F, 3, 14, 4, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -2.15F, 0F, 0F, 1.95F, 0F, 0F, 1.95F, 0F, 0F, -2.15F, 0F, 0F); // Box 494
        ammoModel[37].setRotationPoint(52.25F, -45.75F, -5F);

        ammoModel[38].addShapeBox(-1F, -1F, 0F, 3, 14, 4, 0F, -0.15F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.15F, 0F, 0F, -4.15F, 0F, 0F, 3.95F, -0.5F, 0F, 3.95F, -0.5F, 0F, -4.15F, 0F, 0F); // Box 495
        ammoModel[38].setRotationPoint(54.25F, -31.75F, -5F);

        ammoModel[39].addShapeBox(-1F, -1F, 0F, 3, 14, 4, 0F, -0.15F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.15F, 0F, 0F, -4.15F, 0F, 0F, 3.95F, -0.5F, 0F, 3.95F, -0.5F, 0F, -4.15F, 0F, 0F); // Box 496
        ammoModel[39].setRotationPoint(36.25F, -26.75F, -5F);

        ammoModel[40].addShapeBox(-1F, -1F, 0F, 3, 14, 4, 0F, -0.15F, 0F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0.5F, 0F, -0.15F, 0F, 0F, -7.15F, 0F, 0F, 6.95F, -0.5F, 0F, 6.95F, -0.5F, 0F, -7.15F, 0F, 0F); // Box 497
        ammoModel[40].setRotationPoint(40.25F, -12.75F, -5F);

        ammoModel[41].addShapeBox(-1F, -1F, 0F, 3, 14, 4, 0F, -0.15F, 0F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0.5F, 0F, -0.15F, 0F, 0F, -7.15F, 0F, 0F, 6.95F, -0.5F, 0F, 6.95F, -0.5F, 0F, -7.15F, 0F, 0F); // Box 498
        ammoModel[41].setRotationPoint(58.25F, -17.75F, -5F);

        ammoModel[42].addShapeBox(-1F, -1F, 0F, 3, 7, 4, 0F, -0.15F, 0F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0.5F, 0F, -0.15F, 0F, 0F, -4.15F, 0F, 0F, 3.95F, -0.5F, 0F, 3.95F, -0.5F, 0F, -4.15F, 0F, 0F); // Box 499
        ammoModel[42].setRotationPoint(65.25F, -3.75F, -5F);

        ammoModel[43].addShapeBox(-1F, -1F, 0F, 3, 12, 4, 0F, -0.15F, 0F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0.5F, 0F, -0.15F, 0F, 0F, -6.65F, 0F, 0F, 6.45F, -0.5F, 0F, 6.45F, -0.5F, 0F, -6.65F, 0F, 0F); // Box 500
        ammoModel[43].setRotationPoint(47.25F, 1.25F, -5F);
    }

    private void initslideModel_1() {
        slideModel[0] = new ModelRendererTurbo(this, 297, 577, textureX, textureY); // Box 509
        slideModel[1] = new ModelRendererTurbo(this, 929, 577, textureX, textureY); // Box 510
        slideModel[2] = new ModelRendererTurbo(this, 569, 249, textureX, textureY); // Box 511
        slideModel[3] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 512
        slideModel[4] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 513
        slideModel[5] = new ModelRendererTurbo(this, 289, 209, textureX, textureY); // Box 514
        slideModel[6] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 515
        slideModel[7] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 516
        slideModel[8] = new ModelRendererTurbo(this, 345, 209, textureX, textureY); // Box 519
        slideModel[9] = new ModelRendererTurbo(this, 689, 345, textureX, textureY); // Box 520

        slideModel[0].addShapeBox(-1F, -1F, 0F, 30, 4, 19, 0F, 0F, 0F, -7.825F, 0F, 0F, -7.825F, 0F, 0F, -3.275F, 0F, 0F, -3.2755F, 0F, 1F, -6.075F, 0F, 1F, -6.075F, 0F, 1F, -3.275F, 0F, 1F, -3.275F); // Box 509
        slideModel[0].setRotationPoint(28.25F, -84.75F, -11.8F);

        slideModel[1].addShapeBox(-1F, -1F, 0F, 30, 4, 17, 0F, 0F, 0F, -3.725F, 0F, 0F, -3.725F, 0F, 0F, -3.625F, 0F, 0F, -3.625F, 0F, 1F, -3.725F, 0F, 1F, -3.725F, 0F, 1F, -3.625F, 0F, 1F, -3.625F); // Box 510
        slideModel[1].setRotationPoint(28.25F, -79.75F, -9.45F);

        slideModel[2].addShapeBox(-1F, -1F, 0F, 1, 1, 27, 0F, 0.25F, -0.5F, -3.725F, -0.1F, -0.5F, -3.725F, -0.1F, -0.5F, -3.625F, 0.25F, -0.5F, -3.625F, 0.25F, 0.25F, -3.725F, -0.1F, 0.25F, -3.725F, -0.1F, 0.25F, -3.625F, 0.25F, 0.25F, -3.625F); // Box 511
        slideModel[2].setRotationPoint(53.25F, -75.25F, -19.45F);

        slideModel[3].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, -0.25F, -0.1F, 0.25F, -0.25F, -0.1F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 512
        slideModel[3].setRotationPoint(53.25F, -75.25F, -16.7F);

        slideModel[4].addShapeBox(-1F, -1F, 0F, 1, 1, 16, 0F, 0.25F, 0F, -3.725F, -0.1F, 0F, -3.725F, -0.1F, 0F, -3.125F, 0.25F, 0F, -3.125F, 0.25F, 0.5F, -3.725F, -0.1F, 0.5F, -3.725F, -0.1F, 0.5F, -3.125F, 0.25F, 0.5F, -3.125F); // Box 513
        slideModel[4].setRotationPoint(53.25F, -76.25F, -19.45F);

        slideModel[5].addShapeBox(-1F, -1F, 0F, 1, 1, 16, 0F, 0.25F, 0F, -3.725F, -0.1F, 0F, -3.725F, -0.1F, 0F, -3.875F, 0.25F, 0F, -3.875F, 0.25F, 0F, -3.725F, -0.1F, 0F, -3.725F, -0.1F, 0F, -3.125F, 0.25F, 0F, -3.125F); // Box 514
        slideModel[5].setRotationPoint(53.25F, -77.25F, -19.45F);

        slideModel[6].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0F, 0.25F, 0F, 0F); // Box 515
        slideModel[6].setRotationPoint(53.25F, -76.25F, -16.7F);

        slideModel[7].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, 0.25F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0F, 0.25F, 0F, 0F); // Box 516
        slideModel[7].setRotationPoint(53.25F, -77.25F, -16.7F);

        slideModel[8].addShapeBox(-1F, -1F, 0F, 1, 1, 16, 0F, 0.25F, 0F, -2.975F, -0.1F, 0F, -2.975F, -0.1F, 0F, -6.125F, 0.25F, 0F, -6.125F, 0.25F, -0.75F, -7.725F, -0.1F, -0.75F, -7.725F, -0.1F, -0.75F, -7.125F, 0.25F, -0.75F, -7.125F); // Box 519
        slideModel[8].setRotationPoint(53.25F, -74F, -19.45F);

        slideModel[9].addShapeBox(-1F, -1F, 0F, 1, 1, 27, 0F, 0F, -0.5F, -6.725F, 0F, -0.5F, -5.725F, 0F, -0.5F, -3.625F, 0F, -0.5F, -3.625F, 0F, 0.25F, -6.725F, 0F, 0.25F, -5.725F, 0F, 0.25F, -3.625F, 0F, 0.25F, -3.625F); // Box 520
        slideModel[9].setRotationPoint(52F, -75.25F, -19.45F);
    }
}