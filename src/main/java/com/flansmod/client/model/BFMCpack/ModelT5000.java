//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: T5000
// Model Creator: 
// Created on: -
// Last changed on: -

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelT5000 extends ModelGun //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public ModelT5000() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[652];
        defaultBarrelModel = new ModelRendererTurbo[33];
        ammoModel = new ModelRendererTurbo[43];
        pumpModel = new ModelRendererTurbo[53];

        initgunModel_1();
        initgunModel_2();
        initdefaultBarrelModel_1();
        initammoModel_1();
        initpumpModel_1();

        barrelAttachPoint = new Vector3f(123F / 16F, 25F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(65F / 16F, 24F / 16F, -6F / 16F);
        scopeAttachPoint = new Vector3f(22F / 16F, 28.5F / 16F, 0F / 16F);
        gripAttachPoint = new Vector3f(58 / 16F, 17.5F / 16F, 0F / 16F);

        thirdPersonOffset = new Vector3f(0.0F, -0.05F, 0.0F);
        gunSlideDistance = 40F;
        pumpDelayAfterReload = 50;
        pumpDelay = 10;
        pumpTime = 30;
        chargeHandleDistance = 0.5F;
        chargeDelay = 10;
        chargeDelayAfterReload = 70;
        chargeTime = 30;
        rightArmChargePos = new Vector3f(-0F, -0.5F, 0.13F);
        rightArmChargeRot = new Vector3f(-0F, 0.0F, -70F);
        chargeModifier = new Vector3f(16F, 8F, 4F);
        rightHandBolt = true;
        gripIsOnPump = false;
        rightHandAmmo = false;
        leftHandAmmo = false;

        leftArmPos = new Vector3f(2F, 0F, -9F);
        leftArmRot = new Vector3f(-80F, -55F, 0F);
        rightArmPos = new Vector3f(10F, 1F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.5D, 0.75D);
        enableNewArm = true;

        leftArmReloadPos = new Vector3f(-0.13F, -0.6F, 0.05F);
        leftArmReloadRot = new Vector3f(80F, 60F, 0.0F);
        rightArmReloadPos = new Vector3f(0.2F, -0.56F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85F);

        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);
        hasFlash = true;
        hasArms = true;
        animationType = EnumAnimationType.CUSTOM;
        rotateGunHorizontal = 15F;
        tiltGun = 30F;
        translateGun = new Vector3f(0.0F, -0.0625F, -0.1875F);
        translateClip = new Vector3f(0.0F, -0.625F, 0.0F);

        translateAll(0, -2, 0);

        crouchZoom = -0.1F;
        zoomOffset = 0.3F;
        zoomOffsetY = -0.045F;
        gunOffsetX = -2F;
        gunOffset = -0.4F;

        pumpHandlePoint = new Vector3f(0.0F, 23F / 16F, 0.0F);

        flipAll();
    }

    private void initgunModel_1() {
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
        gunModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box1
        gunModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box8
        gunModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box9
        gunModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box10
        gunModel[5] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box11
        gunModel[6] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box12
        gunModel[7] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box13
        gunModel[8] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box26
        gunModel[9] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box27
        gunModel[10] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box28
        gunModel[11] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box29
        gunModel[12] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box30
        gunModel[13] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box31
        gunModel[14] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box33
        gunModel[15] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Import Box41
        gunModel[16] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Import Box42
        gunModel[17] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Box43
        gunModel[18] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import Box44
        gunModel[19] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box45
        gunModel[20] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import Box46
        gunModel[21] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Import Box47
        gunModel[22] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import Box49
        gunModel[23] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Import Box50
        gunModel[24] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Import Box51
        gunModel[25] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Import Box52
        gunModel[26] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Import Box53
        gunModel[27] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import Box54
        gunModel[28] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Import Box55
        gunModel[29] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Import Box56
        gunModel[30] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Import Box57
        gunModel[31] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Import Box58
        gunModel[32] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Import Box63
        gunModel[33] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Import Box64
        gunModel[34] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Import Box65
        gunModel[35] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Import Box66
        gunModel[36] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Import Box67
        gunModel[37] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Import Box68
        gunModel[38] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box71
        gunModel[39] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import Box73
        gunModel[40] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box74
        gunModel[41] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box77
        gunModel[42] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box78
        gunModel[43] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box79
        gunModel[44] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import Box80
        gunModel[45] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Import Box82
        gunModel[46] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Import Box84
        gunModel[47] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Import Box90
        gunModel[48] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Import Box91
        gunModel[49] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Import Box92
        gunModel[50] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Import Box93
        gunModel[51] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Import Box94
        gunModel[52] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Import Box95
        gunModel[53] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Import Box96
        gunModel[54] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import Box97
        gunModel[55] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Import Box98
        gunModel[56] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Import Box99
        gunModel[57] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Import Box100
        gunModel[58] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Import Box101
        gunModel[59] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Import Box102
        gunModel[60] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Import Box103
        gunModel[61] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box104
        gunModel[62] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box105
        gunModel[63] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Import Box106
        gunModel[64] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Import Box107
        gunModel[65] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Import Box108
        gunModel[66] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Import Box109
        gunModel[67] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Import Box110
        gunModel[68] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Import Box111
        gunModel[69] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box112
        gunModel[70] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Import Box113
        gunModel[71] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Import Box114
        gunModel[72] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Import Box115
        gunModel[73] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Import Box116
        gunModel[74] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Import Box117
        gunModel[75] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Import Box118
        gunModel[76] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Import Box119
        gunModel[77] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Import Box120
        gunModel[78] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Import Box121
        gunModel[79] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Import Box172
        gunModel[80] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Import Box173
        gunModel[81] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import Box174
        gunModel[82] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Import Box175
        gunModel[83] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Import Box176
        gunModel[84] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Import Box177
        gunModel[85] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Import Box178
        gunModel[86] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Import Box179
        gunModel[87] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Import Box180
        gunModel[88] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box227
        gunModel[89] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box228
        gunModel[90] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box229
        gunModel[91] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Import Box230
        gunModel[92] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Import Box247
        gunModel[93] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Import Box248
        gunModel[94] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Import Box249
        gunModel[95] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Import Box250
        gunModel[96] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Import Box251
        gunModel[97] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Import Box252
        gunModel[98] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Import Box253
        gunModel[99] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Import Box254
        gunModel[100] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Import Box255
        gunModel[101] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Import Box256
        gunModel[102] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Import Box257
        gunModel[103] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import Box258
        gunModel[104] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Import Box259
        gunModel[105] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Import Box260
        gunModel[106] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Import Box261
        gunModel[107] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Import Box262
        gunModel[108] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Import Box263
        gunModel[109] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import Box264
        gunModel[110] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Import Box265
        gunModel[111] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Import Box266
        gunModel[112] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Import Box267
        gunModel[113] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Import Box268
        gunModel[114] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Import Box288
        gunModel[115] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Import Box289
        gunModel[116] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Import Box290
        gunModel[117] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Import Box291
        gunModel[118] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Import Box309
        gunModel[119] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Import Box310
        gunModel[120] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Import Box311
        gunModel[121] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Import Box312
        gunModel[122] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Import Box313
        gunModel[123] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Import Box314
        gunModel[124] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Import Box315
        gunModel[125] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Import Box316
        gunModel[126] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box317
        gunModel[127] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Import Box318
        gunModel[128] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Import Box319
        gunModel[129] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Import Box320
        gunModel[130] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Import Box321
        gunModel[131] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import Box322
        gunModel[132] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Import Box323
        gunModel[133] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Import Box324
        gunModel[134] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Import Box325
        gunModel[135] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Import Box326
        gunModel[136] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Import Box327
        gunModel[137] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Import Box328
        gunModel[138] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Import Box329
        gunModel[139] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Import Box330
        gunModel[140] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Import Box331
        gunModel[141] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Import Box332
        gunModel[142] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Import Box333
        gunModel[143] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Import Box334
        gunModel[144] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Import Box335
        gunModel[145] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Import Box336
        gunModel[146] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Import Box337
        gunModel[147] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Import Box338
        gunModel[148] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Import Box386
        gunModel[149] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Import Box387
        gunModel[150] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Import Box388
        gunModel[151] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Import Box14
        gunModel[152] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Import Box15
        gunModel[153] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Import Box16
        gunModel[154] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Import Box17
        gunModel[155] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Import Box18
        gunModel[156] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Import Box19
        gunModel[157] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Import Box20
        gunModel[158] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Import Box21
        gunModel[159] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box22
        gunModel[160] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Import Box23
        gunModel[161] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Import Box24
        gunModel[162] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Import Box34
        gunModel[163] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box35
        gunModel[164] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Import Box36
        gunModel[165] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Import Box181
        gunModel[166] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Import Box182
        gunModel[167] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Import Box183
        gunModel[168] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Import Box184
        gunModel[169] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Import Box185
        gunModel[170] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Import Box186
        gunModel[171] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Import Box187
        gunModel[172] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Import Box191
        gunModel[173] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Import Box192
        gunModel[174] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Import Box193
        gunModel[175] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Import Box194
        gunModel[176] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Import Box195
        gunModel[177] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Import Box196
        gunModel[178] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Import Box197
        gunModel[179] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Import Box198
        gunModel[180] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Import Box199
        gunModel[181] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Import Box201
        gunModel[182] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Import Box202
        gunModel[183] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Import Box203
        gunModel[184] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Import Box204
        gunModel[185] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Import Box205
        gunModel[186] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Import Box206
        gunModel[187] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Import Box207
        gunModel[188] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Import Box208
        gunModel[189] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Import Box209
        gunModel[190] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Import Box339
        gunModel[191] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Import Box340
        gunModel[192] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Import Box341
        gunModel[193] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Import Box342
        gunModel[194] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Import Box343
        gunModel[195] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Import Box344
        gunModel[196] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Import Box345
        gunModel[197] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Import Box346
        gunModel[198] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import Box347
        gunModel[199] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Import Box348
        gunModel[200] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Import Box349
        gunModel[201] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Import Box350
        gunModel[202] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Import Box351
        gunModel[203] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Import Box352
        gunModel[204] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Import Box353
        gunModel[205] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Import Box354
        gunModel[206] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Import Box355
        gunModel[207] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Import Box357
        gunModel[208] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Import Box358
        gunModel[209] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Import Box359
        gunModel[210] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Import Box364
        gunModel[211] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Import Box365
        gunModel[212] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Import Box367
        gunModel[213] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Import Box368
        gunModel[214] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Import Box370
        gunModel[215] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Import Box372
        gunModel[216] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Import Box373
        gunModel[217] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Import Box374
        gunModel[218] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Import Box375
        gunModel[219] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Import Box376
        gunModel[220] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Import Box377
        gunModel[221] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Box378
        gunModel[222] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Import Box381
        gunModel[223] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Import Box382
        gunModel[224] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Import Box210
        gunModel[225] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Import Box211
        gunModel[226] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Import Box212
        gunModel[227] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Import Box213
        gunModel[228] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Import Box214
        gunModel[229] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import Box215
        gunModel[230] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Import Box216
        gunModel[231] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Import Box217
        gunModel[232] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Import Box218
        gunModel[233] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Import Box219
        gunModel[234] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Import Box220
        gunModel[235] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Import Box221
        gunModel[236] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Import Box222
        gunModel[237] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Import Box223
        gunModel[238] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Import Box224
        gunModel[239] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Import Box225
        gunModel[240] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Import Box226
        gunModel[241] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Import Box231
        gunModel[242] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Import Box232
        gunModel[243] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Import Box233
        gunModel[244] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Import Box234
        gunModel[245] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Import Box239
        gunModel[246] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Import Box240
        gunModel[247] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Import Box246
        gunModel[248] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box390
        gunModel[249] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Import Box391
        gunModel[250] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Import Box392
        gunModel[251] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Import Box393
        gunModel[252] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Import Box394
        gunModel[253] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Import Box395
        gunModel[254] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Import Box396
        gunModel[255] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Import Box397
        gunModel[256] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Import Box398
        gunModel[257] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Import Box399
        gunModel[258] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Import Box400
        gunModel[259] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Import Box401
        gunModel[260] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Import Box402
        gunModel[261] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Import Box403
        gunModel[262] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Import Box404
        gunModel[263] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Import Box405
        gunModel[264] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Import Box407
        gunModel[265] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Import Box408
        gunModel[266] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import Box409
        gunModel[267] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Import Box410
        gunModel[268] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Import Box411
        gunModel[269] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Import Box412
        gunModel[270] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Import Box413
        gunModel[271] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Import Box414
        gunModel[272] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Import Box415
        gunModel[273] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Import Box416
        gunModel[274] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Import Box417
        gunModel[275] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Import Box418
        gunModel[276] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Import Box419
        gunModel[277] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Import Box420
        gunModel[278] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Import Box421
        gunModel[279] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Import Box422
        gunModel[280] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Import Box423
        gunModel[281] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Import Box424
        gunModel[282] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import Box425
        gunModel[283] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Import Box426
        gunModel[284] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Import Box427
        gunModel[285] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Import Box428
        gunModel[286] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Import Box429
        gunModel[287] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Import Box430
        gunModel[288] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import Box431
        gunModel[289] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Import Box432
        gunModel[290] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Import Box433
        gunModel[291] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Import Box434
        gunModel[292] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Import Box435
        gunModel[293] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Import Box437
        gunModel[294] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Import Box438
        gunModel[295] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box439
        gunModel[296] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Import Box440
        gunModel[297] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Import Box441
        gunModel[298] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Import Box442
        gunModel[299] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Import Box443
        gunModel[300] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Import Box444
        gunModel[301] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Import Box445
        gunModel[302] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Import Box446
        gunModel[303] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Import Box461
        gunModel[304] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Import Box462
        gunModel[305] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Import Box463
        gunModel[306] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Import Box464
        gunModel[307] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Import Box466
        gunModel[308] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Import Box467
        gunModel[309] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Import Box468
        gunModel[310] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Import Box469
        gunModel[311] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Import Box470
        gunModel[312] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Import Box471
        gunModel[313] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Import Box503
        gunModel[314] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Import Box504
        gunModel[315] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Import Box505
        gunModel[316] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Import Box506
        gunModel[317] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Import Box507
        gunModel[318] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Import Box508
        gunModel[319] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Import Box509
        gunModel[320] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Import Box510
        gunModel[321] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Import Box511
        gunModel[322] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Import Box512
        gunModel[323] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Import Box513
        gunModel[324] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Import Box514
        gunModel[325] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Import Box515
        gunModel[326] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Import Box516
        gunModel[327] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Import Box517
        gunModel[328] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Import Box518
        gunModel[329] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Import Box519
        gunModel[330] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Import Box520
        gunModel[331] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Import Box521
        gunModel[332] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Import Box522
        gunModel[333] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Import Box523
        gunModel[334] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Import Box524
        gunModel[335] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Import Box525
        gunModel[336] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Import Box526
        gunModel[337] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Import Box527
        gunModel[338] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Import Box530
        gunModel[339] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Import Box532
        gunModel[340] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Import Box535
        gunModel[341] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Import Box538
        gunModel[342] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Import Box541
        gunModel[343] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Import Box544
        gunModel[344] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Import Box547
        gunModel[345] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Import Box548
        gunModel[346] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Import Box549
        gunModel[347] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Import Box550
        gunModel[348] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Import Box551
        gunModel[349] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import Box552
        gunModel[350] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Import Box553
        gunModel[351] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Import Box554
        gunModel[352] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Import Box555
        gunModel[353] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Import Box556
        gunModel[354] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Import Box557
        gunModel[355] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Import Box568
        gunModel[356] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Import Box569
        gunModel[357] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Import Box570
        gunModel[358] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Import Box571
        gunModel[359] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Import Box572
        gunModel[360] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Box573
        gunModel[361] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Import Box574
        gunModel[362] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Import Box575
        gunModel[363] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Import Box576
        gunModel[364] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Import Box577
        gunModel[365] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Import Box578
        gunModel[366] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Import Box579
        gunModel[367] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Import Box580
        gunModel[368] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Import Box581
        gunModel[369] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Import Box582
        gunModel[370] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Import Box583
        gunModel[371] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Import Box584
        gunModel[372] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box585
        gunModel[373] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Import Box586
        gunModel[374] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Import Box587
        gunModel[375] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Import Box588
        gunModel[376] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Import Box589
        gunModel[377] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Import Box590
        gunModel[378] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Import Box591
        gunModel[379] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Import Box592
        gunModel[380] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Import Box593
        gunModel[381] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Import Box594
        gunModel[382] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Import Box595
        gunModel[383] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Import Box596
        gunModel[384] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Import Box597
        gunModel[385] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Import Box598
        gunModel[386] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Import Box599
        gunModel[387] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Import Box600
        gunModel[388] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Import Box601
        gunModel[389] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Import Box602
        gunModel[390] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Import Box603
        gunModel[391] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Import Box604
        gunModel[392] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Import Box605
        gunModel[393] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Import Box606
        gunModel[394] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Import Box607
        gunModel[395] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Import Box608
        gunModel[396] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Import Box609
        gunModel[397] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Import Box610
        gunModel[398] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Import Box611
        gunModel[399] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Import Box612
        gunModel[400] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Import Box613
        gunModel[401] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box614
        gunModel[402] = new ModelRendererTurbo(this, 9, 129, textureX, textureY); // Import Box615
        gunModel[403] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Import Box616
        gunModel[404] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Import Box617
        gunModel[405] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Import Box618
        gunModel[406] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Import Box619
        gunModel[407] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Import Box620
        gunModel[408] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Import Box621
        gunModel[409] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Import Box622
        gunModel[410] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Import Box623
        gunModel[411] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Import Box624
        gunModel[412] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Import Box625
        gunModel[413] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Import Box626
        gunModel[414] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Import Box627
        gunModel[415] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Import Box628
        gunModel[416] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Import Box629
        gunModel[417] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Import Box630
        gunModel[418] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Import Box631
        gunModel[419] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Import Box632
        gunModel[420] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Import Box633
        gunModel[421] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Import Box634
        gunModel[422] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Import Box635
        gunModel[423] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Import Box636
        gunModel[424] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Import Box637
        gunModel[425] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Import Box638
        gunModel[426] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Import Box639
        gunModel[427] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Import Box640
        gunModel[428] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Import Box641
        gunModel[429] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Import Box642
        gunModel[430] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Import Box643
        gunModel[431] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Import Box644
        gunModel[432] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Import Box645
        gunModel[433] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Import Box646
        gunModel[434] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Import Box647
        gunModel[435] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Import Box648
        gunModel[436] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Import Box649
        gunModel[437] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Import Box650
        gunModel[438] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Import Box651
        gunModel[439] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Import Box652
        gunModel[440] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Import Box653
        gunModel[441] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Import Box654
        gunModel[442] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Import Box655
        gunModel[443] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Import Box656
        gunModel[444] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Import Box657
        gunModel[445] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Import Box658
        gunModel[446] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Import Box659
        gunModel[447] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Import Box660
        gunModel[448] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Import Box661
        gunModel[449] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Import Box662
        gunModel[450] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Import Box663
        gunModel[451] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Import Box664
        gunModel[452] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Import Box665
        gunModel[453] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Import Box666
        gunModel[454] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Import Box667
        gunModel[455] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Import Box668
        gunModel[456] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Import Box669
        gunModel[457] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Import Box670
        gunModel[458] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Import Box671
        gunModel[459] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Import Box672
        gunModel[460] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Import Box673
        gunModel[461] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Import Box674
        gunModel[462] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Import Box675
        gunModel[463] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Import Box676
        gunModel[464] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Import Box677
        gunModel[465] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import Box678
        gunModel[466] = new ModelRendererTurbo(this, 9, 137, textureX, textureY); // Import Box679
        gunModel[467] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Import Box680
        gunModel[468] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Import Box681
        gunModel[469] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Import Box682
        gunModel[470] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Import Box683
        gunModel[471] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Import Box684
        gunModel[472] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Import Box685
        gunModel[473] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Import Box686
        gunModel[474] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Import Box687
        gunModel[475] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Import Box688
        gunModel[476] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Import Box689
        gunModel[477] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Import Box690
        gunModel[478] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Import Box691
        gunModel[479] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Import Box692
        gunModel[480] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Import Box693
        gunModel[481] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Import Box694
        gunModel[482] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Import Box695
        gunModel[483] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Import Box696
        gunModel[484] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Import Box697
        gunModel[485] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Import Box698
        gunModel[486] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Import Box699
        gunModel[487] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Import Box700
        gunModel[488] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Import Box701
        gunModel[489] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Import Box702
        gunModel[490] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Import Box703
        gunModel[491] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Import Box704
        gunModel[492] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Import Box705
        gunModel[493] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Import Box706
        gunModel[494] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Import Box707
        gunModel[495] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Import Box708
        gunModel[496] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Import Box709
        gunModel[497] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Import Box710
        gunModel[498] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Import Box711
        gunModel[499] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Import Box712

        gunModel[0].addShapeBox(0F, 0F, 0F, 20, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box0
        gunModel[0].setRotationPoint(12F, -21.5F, -3F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 21, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
        gunModel[1].setRotationPoint(11F, -22.5F, -3.5F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F); // Import Box8
        gunModel[2].setRotationPoint(0F, -21.5F, -3.5F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, -2F, -2F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, -2F, -2F, 0F, 2.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 2.5F, 0F); // Import Box9
        gunModel[3].setRotationPoint(0F, -22.5F, -3.5F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box10
        gunModel[4].setRotationPoint(-3F, -19.5F, -3.5F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box11
        gunModel[5].setRotationPoint(-3F, -20.5F, -3.5F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F, 0F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F); // Import Box12
        gunModel[6].setRotationPoint(-6F, -19.5F, -3.5F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -1F); // Import Box13
        gunModel[7].setRotationPoint(-6F, -20.5F, -3.5F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.25F, 0F); // Import Box26
        gunModel[8].setRotationPoint(11F, -16.5F, -3F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Import Box27
        gunModel[9].setRotationPoint(10.5F, -16.5F, -3F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Import Box28
        gunModel[10].setRotationPoint(11F, -16.5F, -3F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Import Box29
        gunModel[11].setRotationPoint(11F, -15.5F, -3F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0.5F, -0.25F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, -0.5F); // Import Box30
        gunModel[12].setRotationPoint(10.5F, -16.5F, -3F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 17, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box31
        gunModel[13].setRotationPoint(-3F, -16.5F, -3.5F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F, 0F, -1.5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, -1F, 0F, 0F, -2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -2F); // Import Box33
        gunModel[14].setRotationPoint(-6F, -17.5F, -3.5F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 20, 1, 6, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F); // Import Box41
        gunModel[15].setRotationPoint(13F, -21F, -3F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 25, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F); // Import Box42
        gunModel[16].setRotationPoint(8F, -22.25F, 0F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box43
        gunModel[17].setRotationPoint(11F, -23.5F, -3F);

        gunModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box44
        gunModel[18].setRotationPoint(11F, -24.75F, -3F);

        gunModel[19].addShapeBox(0F, 0F, 0F, 22, 1, 3, 0F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Import Box45
        gunModel[19].setRotationPoint(11F, -26F, -3F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box46
        gunModel[20].setRotationPoint(27F, -23.5F, -3F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box47
        gunModel[21].setRotationPoint(27F, -24.75F, -3F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box49
        gunModel[22].setRotationPoint(12F, -24.75F, 1.5F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box50
        gunModel[23].setRotationPoint(12F, -23.5F, 1.5F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, -0.75F, -0.375F, -1F, -0.75F, -0.375F, -1F, -0.75F, -0.375F, 0F, -0.75F, -0.375F); // Import Box51
        gunModel[24].setRotationPoint(13F, -24.75F, -3F);

        gunModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box52
        gunModel[25].setRotationPoint(13F, -23.5F, -3F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, 0F, -1F, 0.25F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, -1F, 0.25F, 0F); // Import Box53
        gunModel[26].setRotationPoint(14F, -23.5F, -3F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, 0F); // Import Box54
        gunModel[27].setRotationPoint(14F, -24.5F, -3F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, -0.375F, -0.5F, 0F, -0.875F, -0.5F, 0F, -0.875F, 0F, 0F, -0.375F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, 0F); // Import Box55
        gunModel[28].setRotationPoint(14F, -24.5F, -3F);

        gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -1F, 0F, -0.75F, 0.5F, 0F, -1.25F, 0.5F, 0F, -1.25F, -1F, 0F, -0.75F, 0F, -0.25F, -0.375F, -0.5F, -0.25F, -0.875F, -0.5F, -0.25F, -0.875F, 0F, -0.25F, -0.375F); // Import Box56
        gunModel[29].setRotationPoint(14F, -25.25F, -3F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box57
        gunModel[30].setRotationPoint(12F, -26F, -2F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 23, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Import Box58
        gunModel[31].setRotationPoint(9F, -22.5F, 1F);

        gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, -0.5F); // Import Box63
        gunModel[32].setRotationPoint(26F, -24.5F, -3F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, 0F, -0.875F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, 0F, -0.875F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F); // Import Box64
        gunModel[33].setRotationPoint(26F, -24.5F, -3F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0.5F, 0F, -1.25F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0.5F, 0F, -1.25F, -0.5F, -0.25F, -0.875F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, -0.5F, -0.25F, -0.875F); // Import Box65
        gunModel[34].setRotationPoint(26F, -25.25F, -3F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, -1F, -0.75F, -0.375F, 0F, -0.75F, -0.375F, 0F, -0.75F, -0.375F, -1F, -0.75F, -0.375F); // Import Box66
        gunModel[35].setRotationPoint(26F, -24.75F, -3F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0.5F, 0.25F, -0.5F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.5F, 0.25F, -0.5F); // Import Box67
        gunModel[36].setRotationPoint(26F, -23.5F, -3F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box68
        gunModel[37].setRotationPoint(26F, -23.5F, -3F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -1.25F, -1.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -1.25F, 0.5F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 1F); // Import Box71
        gunModel[38].setRotationPoint(3F, -22.5F, -3.5F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 26, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box73
        gunModel[39].setRotationPoint(6F, -22.5F, 1.5F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -1.25F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -1.25F, -1.25F, 0F, 1.25F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F); // Import Box74
        gunModel[40].setRotationPoint(3F, -22.5F, 1.5F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box77
        gunModel[41].setRotationPoint(8F, -23.5F, 1F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box78
        gunModel[42].setRotationPoint(8F, -24.75F, 1F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Import Box79
        gunModel[43].setRotationPoint(8F, -26F, 0F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Import Box80
        gunModel[44].setRotationPoint(8F, -26F, 0F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0F); // Import Box82
        gunModel[45].setRotationPoint(26F, -17.5F, -3F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F); // Import Box84
        gunModel[46].setRotationPoint(12F, -16.5F, -3F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.25F, 0F); // Import Box90
        gunModel[47].setRotationPoint(15.5F, -16.5F, -3F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, -0.5F, 0F); // Import Box91
        gunModel[48].setRotationPoint(19F, -16.5F, -3F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, -0.75F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, -0.75F, 0F); // Import Box92
        gunModel[49].setRotationPoint(22.5F, -17.5F, -3F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F); // Import Box93
        gunModel[50].setRotationPoint(12F, -16.5F, 2F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.25F, 0F); // Import Box94
        gunModel[51].setRotationPoint(15.5F, -16.5F, 2F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, -0.5F, 0F); // Import Box95
        gunModel[52].setRotationPoint(19F, -16.5F, 2F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, -0.75F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, -0.75F, 0F); // Import Box96
        gunModel[53].setRotationPoint(22.5F, -17.5F, 2F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, 0F); // Import Box97
        gunModel[54].setRotationPoint(33F, -23.5F, -3F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0.5F, -0.75F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, -1.25F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Import Box98
        gunModel[55].setRotationPoint(33F, -24.75F, -3F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, -2.25F, -0.5F, -0.5F, -2.5F, -0.5F, -0.5F, -2.5F, 0F, 0F, -2.25F, 0F, -0.25F, -0.75F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F, -0.25F, -0.75F); // Import Box99
        gunModel[56].setRotationPoint(33F, -26F, -3F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, -0.75F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F, -0.25F, -0.75F, 0F, 0F, -2.25F, -0.5F, -0.5F, -2.5F, -0.5F, -0.5F, -2.5F, 0F, 0F, -2.25F); // Import Box100
        gunModel[57].setRotationPoint(33F, -21F, -3F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, -1.25F, 0F, 0.5F, -0.75F); // Import Box101
        gunModel[58].setRotationPoint(33F, -22.25F, -3F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box102
        gunModel[59].setRotationPoint(11F, -23.5F, -2F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box103
        gunModel[60].setRotationPoint(8F, -23.5F, 1F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box104
        gunModel[61].setRotationPoint(8F, -23.5F, 1F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box105
        gunModel[62].setRotationPoint(13F, -23.5F, 1F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F); // Import Box106
        gunModel[63].setRotationPoint(11F, -23.5F, 1.75F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Import Box107
        gunModel[64].setRotationPoint(10F, -23.5F, 1.75F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.25F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.5F, -0.25F); // Import Box108
        gunModel[65].setRotationPoint(9F, -23.5F, 1.75F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box109
        gunModel[66].setRotationPoint(11F, -21.5F, -3.5F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box110
        gunModel[67].setRotationPoint(0F, -17.5F, -3.5F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 18, 1, 7, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box111
        gunModel[68].setRotationPoint(14F, -17.5F, -3.5F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 18, 1, 7, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box112
        gunModel[69].setRotationPoint(14F, -16.5F, -3.5F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box113
        gunModel[70].setRotationPoint(12F, -21F, 2.5F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box114
        gunModel[71].setRotationPoint(12F, -21F, 2.5F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Import Box115
        gunModel[72].setRotationPoint(12F, -18F, 2.5F);

        gunModel[73].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box116
        gunModel[73].setRotationPoint(24F, -21F, -3.5F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box117
        gunModel[74].setRotationPoint(24F, -21F, -3.5F);

        gunModel[75].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Import Box118
        gunModel[75].setRotationPoint(24F, -18.5F, -3.5F);

        gunModel[76].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box119
        gunModel[76].setRotationPoint(0F, -21.5F, -3F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box120
        gunModel[77].setRotationPoint(-0.5F, -17.5F, -3.5F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box121
        gunModel[78].setRotationPoint(-0.5F, -19.25F, -3.5F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box172
        gunModel[79].setRotationPoint(3F, -16.5F, -2F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import Box173
        gunModel[80].setRotationPoint(4F, -16.5F, -2F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, 0F, 0F); // Import Box174
        gunModel[81].setRotationPoint(4F, -11.5F, -2F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import Box175
        gunModel[82].setRotationPoint(5F, -11.5F, -2F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box176
        gunModel[83].setRotationPoint(11F, -16.5F, -2F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box177
        gunModel[84].setRotationPoint(5F, -16.5F, -2F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box178
        gunModel[85].setRotationPoint(10.5F, -15.5F, -2F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box179
        gunModel[86].setRotationPoint(10.5F, -12.75F, -2F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box180
        gunModel[87].setRotationPoint(4.5F, -15.5F, -2F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box227
        gunModel[88].setRotationPoint(7.5F, -16F, -0.5F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box228
        gunModel[89].setRotationPoint(7F, -15F, -0.5F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box229
        gunModel[90].setRotationPoint(7F, -14F, -0.5F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Import Box230
        gunModel[91].setRotationPoint(7F, -13F, -0.5F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F); // Import Box247
        gunModel[92].setRotationPoint(31F, -21F, -3.5F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box248
        gunModel[93].setRotationPoint(30.5F, -21F, -3.5F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box249
        gunModel[94].setRotationPoint(30.5F, -19F, -3.5F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box250
        gunModel[95].setRotationPoint(31F, -18.5F, -2.5F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F, 0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box251
        gunModel[96].setRotationPoint(31F, -20F, -2.5F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Import Box252
        gunModel[97].setRotationPoint(31F, -17.5F, -2.5F);

        gunModel[98].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -1F); // Import Box253
        gunModel[98].setRotationPoint(11F, -16.5F, 0.5F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F); // Import Box254
        gunModel[99].setRotationPoint(11F, -12.5F, -1F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box255
        gunModel[100].setRotationPoint(8F, -21F, -3.5F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box256
        gunModel[101].setRotationPoint(11F, -21F, -3.5F);

        gunModel[102].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box257
        gunModel[102].setRotationPoint(9F, -19F, -3.5F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box258
        gunModel[103].setRotationPoint(6F, -22.5F, -3.5F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box259
        gunModel[104].setRotationPoint(6F, -21.5F, -3.5F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 22, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F); // Import Box260
        gunModel[105].setRotationPoint(11F, -22.25F, -3F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box261
        gunModel[106].setRotationPoint(7F, -21F, -3.5F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box262
        gunModel[107].setRotationPoint(12F, -21F, -3.5F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box263
        gunModel[108].setRotationPoint(12F, -18F, -3.5F);

        gunModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box264
        gunModel[109].setRotationPoint(7F, -18F, -3.5F);

        gunModel[110].addShapeBox(0F, 0F, 0F, 3, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box265
        gunModel[110].setRotationPoint(6F, -21.5F, -3F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box266
        gunModel[111].setRotationPoint(9F, -21.5F, 1F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box267
        gunModel[112].setRotationPoint(9F, -21.5F, 2.5F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box268
        gunModel[113].setRotationPoint(9F, -22F, -2.5F);

        gunModel[114].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box288
        gunModel[114].setRotationPoint(11F, -23.5F, -3F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box289
        gunModel[115].setRotationPoint(24.5F, -19F, -4F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box290
        gunModel[116].setRotationPoint(24.5F, -19.5F, -4F);

        gunModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box291
        gunModel[117].setRotationPoint(24.5F, -18.5F, -4F);

        gunModel[118].addShapeBox(0F, 0F, 0F, 22, 1, 3, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Import Box309
        gunModel[118].setRotationPoint(11F, -26F, 0F);

        gunModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box310
        gunModel[119].setRotationPoint(11F, -26F, -0.5F);

        gunModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box311
        gunModel[120].setRotationPoint(13F, -26F, -0.5F);

        gunModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.25F); // Import Box312
        gunModel[121].setRotationPoint(12F, -26F, -1F);

        gunModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box313
        gunModel[122].setRotationPoint(12F, -26F, 0F);

        gunModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Import Box314
        gunModel[123].setRotationPoint(12F, -26F, 0F);

        gunModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F); // Import Box315
        gunModel[124].setRotationPoint(12F, -26F, -1F);

        gunModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Import Box316
        gunModel[125].setRotationPoint(14F, -26F, 0F);

        gunModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F); // Import Box317
        gunModel[126].setRotationPoint(14F, -26F, -1F);

        gunModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.25F); // Import Box318
        gunModel[127].setRotationPoint(14F, -26F, -1F);

        gunModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box319
        gunModel[128].setRotationPoint(14F, -26F, 0F);

        gunModel[129].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box320
        gunModel[129].setRotationPoint(15F, -26F, -0.5F);

        gunModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F); // Import Box321
        gunModel[130].setRotationPoint(31F, -26F, -1F);

        gunModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box322
        gunModel[131].setRotationPoint(32F, -26F, -0.5F);

        gunModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Import Box323
        gunModel[132].setRotationPoint(31F, -26F, 0F);

        gunModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.25F); // Import Box324
        gunModel[133].setRotationPoint(31F, -26F, -1F);

        gunModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box325
        gunModel[134].setRotationPoint(31F, -26F, 0F);

        gunModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box326
        gunModel[135].setRotationPoint(30F, -26F, -0.5F);

        gunModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F); // Import Box327
        gunModel[136].setRotationPoint(29F, -26F, -1F);

        gunModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Import Box328
        gunModel[137].setRotationPoint(29F, -26F, 0F);

        gunModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box329
        gunModel[138].setRotationPoint(29F, -26F, 0F);

        gunModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.25F); // Import Box330
        gunModel[139].setRotationPoint(29F, -26F, -1F);

        gunModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box331
        gunModel[140].setRotationPoint(-6F, -20.5F, -3.5F);

        gunModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box332
        gunModel[141].setRotationPoint(-6F, -20.5F, -4.5F);

        gunModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box333
        gunModel[142].setRotationPoint(-6F, -16.5F, -4.5F);

        gunModel[143].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Import Box334
        gunModel[143].setRotationPoint(-6F, -19.5F, -4.5F);

        gunModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box335
        gunModel[144].setRotationPoint(-6F, -16.5F, -3.5F);

        gunModel[145].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Import Box336
        gunModel[145].setRotationPoint(-6F, -19.5F, -3.5F);

        gunModel[146].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Import Box337
        gunModel[146].setRotationPoint(-6F, -19.5F, -3.5F);

        gunModel[147].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Import Box338
        gunModel[147].setRotationPoint(-6F, -19.5F, -4.5F);

        gunModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box386
        gunModel[148].setRotationPoint(-2F, -18.25F, -4F);

        gunModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box387
        gunModel[149].setRotationPoint(-2F, -17.75F, -4F);

        gunModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box388
        gunModel[150].setRotationPoint(-2F, -18.75F, -4F);

        gunModel[151].addShapeBox(0F, 0F, 0F, 3, 5, 5, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box14
        gunModel[151].setRotationPoint(-10F, -20.5F, -2.5F);

        gunModel[152].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Import Box15
        gunModel[152].setRotationPoint(-7F, -20.5F, -2.5F);

        gunModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.375F, -0.875F, 0F, -0.375F, -0.875F, 0F, -0.375F, -0.875F, 0F, -0.375F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Import Box16
        gunModel[153].setRotationPoint(-7F, -21F, -2.5F);

        gunModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.375F, -0.875F, 0F, -0.375F, -0.875F, 0F, -0.375F, -0.875F, 0F, -0.375F, -0.875F); // Import Box17
        gunModel[154].setRotationPoint(-7F, -15.5F, -2.5F);

        gunModel[155].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F); // Import Box18
        gunModel[155].setRotationPoint(-10F, -20.5F, -2.5F);

        gunModel[156].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19
        gunModel[156].setRotationPoint(-21F, -20F, -2.5F);

        gunModel[157].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Import Box20
        gunModel[157].setRotationPoint(-25F, -20F, -2.5F);

        gunModel[158].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
        gunModel[158].setRotationPoint(-35F, -20F, -2.5F);

        gunModel[159].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box22
        gunModel[159].setRotationPoint(-36F, -19F, -2.5F);

        gunModel[160].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box23
        gunModel[160].setRotationPoint(-33F, -17F, -2.5F);

        gunModel[161].addShapeBox(0F, 0F, 0F, 28, 1, 5, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box24
        gunModel[161].setRotationPoint(-35F, -21F, -2.5F);

        gunModel[162].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Import Box34
        gunModel[162].setRotationPoint(-9.5F, -16F, -2.5F);

        gunModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, -1F, -1F); // Import Box35
        gunModel[163].setRotationPoint(-10.5F, -16F, -2.5F);

        gunModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Import Box36
        gunModel[164].setRotationPoint(-11F, -19.5F, -2.5F);

        gunModel[165].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import Box181
        gunModel[165].setRotationPoint(-17F, -19F, -1.5F);

        gunModel[166].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7.5F, 1F, 0F, -7.5F, 1F, 0F, 7F, 0F, 0F); // Import Box182
        gunModel[166].setRotationPoint(-17F, -14F, -1.5F);

        gunModel[167].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box183
        gunModel[167].setRotationPoint(-34F, -8F, -1.5F);

        gunModel[168].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box184
        gunModel[168].setRotationPoint(-26.5F, -7F, -1.5F);

        gunModel[169].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box185
        gunModel[169].setRotationPoint(-30.5F, -9F, -1.5F);

        gunModel[170].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box186
        gunModel[170].setRotationPoint(-30F, -15.5F, -1.5F);

        gunModel[171].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box187
        gunModel[171].setRotationPoint(-30.5F, -15.5F, -1.5F);

        gunModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box191
        gunModel[172].setRotationPoint(-27.5F, -15.5F, -1.5F);

        gunModel[173].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box192
        gunModel[173].setRotationPoint(-27F, -15.5F, -1.5F);

        gunModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box193
        gunModel[174].setRotationPoint(-27.5F, -9F, -1.5F);

        gunModel[175].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box194
        gunModel[175].setRotationPoint(-34F, -10F, -1.5F);

        gunModel[176].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F, 0F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box195
        gunModel[176].setRotationPoint(-34F, -19.5F, -1.5F);

        gunModel[177].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box196
        gunModel[177].setRotationPoint(-23F, -19.5F, -1.5F);

        gunModel[178].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box197
        gunModel[178].setRotationPoint(-17.5F, -18.5F, -1.5F);

        gunModel[179].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box198
        gunModel[179].setRotationPoint(-17.5F, -17.5F, -1.5F);

        gunModel[180].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box199
        gunModel[180].setRotationPoint(-16F, -17F, -1.5F);

        gunModel[181].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box201
        gunModel[181].setRotationPoint(-30F, -19F, -3F);

        gunModel[182].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F); // Import Box202
        gunModel[182].setRotationPoint(-28F, -19F, -3F);

        gunModel[183].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F); // Import Box203
        gunModel[183].setRotationPoint(-32F, -19F, -3F);

        gunModel[184].addShapeBox(0F, 0F, 0F, 13, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box204
        gunModel[184].setRotationPoint(-34F, -21.5F, -2.5F);

        gunModel[185].addShapeBox(0F, 0F, 0F, 13, 1, 5, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box205
        gunModel[185].setRotationPoint(-34F, -21.5F, -2.5F);

        gunModel[186].addShapeBox(0F, 0F, 0F, 20, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box206
        gunModel[186].setRotationPoint(-34F, -23.5F, -2.5F);

        gunModel[187].addShapeBox(0F, 0F, 0F, 20, 1, 5, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box207
        gunModel[187].setRotationPoint(-34F, -24.5F, -2.5F);

        gunModel[188].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F, 0F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box208
        gunModel[188].setRotationPoint(-34F, -25.5F, -2F);

        gunModel[189].addShapeBox(0F, 0F, 0F, 13, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F); // Import Box209
        gunModel[189].setRotationPoint(-34F, -20.5F, -2.5F);

        gunModel[190].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box339
        gunModel[190].setRotationPoint(-34F, -15.5F, -1.5F);

        gunModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box340
        gunModel[191].setRotationPoint(-33.5F, -15.5F, -1.5F);

        gunModel[192].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box341
        gunModel[192].setRotationPoint(-35F, -16F, -2.5F);

        gunModel[193].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import Box342
        gunModel[193].setRotationPoint(-35F, -9.5F, -2.5F);

        gunModel[194].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box343
        gunModel[194].setRotationPoint(-33F, -7.5F, -2.5F);

        gunModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box344
        gunModel[195].setRotationPoint(-28F, -7.5F, -2.5F);

        gunModel[196].addShapeBox(0F, 0F, 0F, 2, 10, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box345
        gunModel[196].setRotationPoint(-41F, -16.5F, -3.5F);

        gunModel[197].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box346
        gunModel[197].setRotationPoint(-41F, -19.5F, -3.5F);

        gunModel[198].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box347
        gunModel[198].setRotationPoint(-41F, -20.5F, -2.5F);

        gunModel[199].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box348
        gunModel[199].setRotationPoint(-41F, -6.5F, -3.5F);

        gunModel[200].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Box349
        gunModel[200].setRotationPoint(-41F, -3.5F, -2.5F);

        gunModel[201].addShapeBox(0F, 0F, 0F, 7, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box350
        gunModel[201].setRotationPoint(-35F, -6.5F, -2.5F);

        gunModel[202].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box351
        gunModel[202].setRotationPoint(-35F, -3.5F, -1.5F);

        gunModel[203].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F); // Import Box352
        gunModel[203].setRotationPoint(-36F, -6.5F, -3.5F);

        gunModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F); // Import Box353
        gunModel[204].setRotationPoint(-36F, -3.5F, -2.5F);

        gunModel[205].addShapeBox(0F, 0F, 0F, 1, 10, 7, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box354
        gunModel[205].setRotationPoint(-36F, -16.5F, -3.5F);

        gunModel[206].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box355
        gunModel[206].setRotationPoint(-36F, -19.5F, -3.5F);

        gunModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box357
        gunModel[207].setRotationPoint(-36F, -20F, -2.5F);

        gunModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Import Box358
        gunModel[208].setRotationPoint(-36F, -21F, -2.5F);

        gunModel[209].addShapeBox(0F, 0F, 0F, 1, 10, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box359
        gunModel[209].setRotationPoint(-37F, -16.5F, -3.5F);

        gunModel[210].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box364
        gunModel[210].setRotationPoint(-39F, -16.5F, -3.5F);

        gunModel[211].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box365
        gunModel[211].setRotationPoint(-39F, -8.5F, -3.5F);

        gunModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F); // Import Box367
        gunModel[212].setRotationPoint(-38.5F, -10.25F, -3F);

        gunModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box368
        gunModel[213].setRotationPoint(-38.5F, -11.5F, -3F);

        gunModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box370
        gunModel[214].setRotationPoint(-38.5F, -12.75F, -3F);

        gunModel[215].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F); // Import Box372
        gunModel[215].setRotationPoint(-39F, -13.5F, -3.5F);

        gunModel[216].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F); // Import Box373
        gunModel[216].setRotationPoint(-38F, -13.5F, -3.5F);

        gunModel[217].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F); // Import Box374
        gunModel[217].setRotationPoint(-39F, -13.5F, -3.5F);

        gunModel[218].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box375
        gunModel[218].setRotationPoint(-39F, -9.5F, -3.5F);

        gunModel[219].addShapeBox(0F, 0F, 0F, 3, 10, 7, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Import Box376
        gunModel[219].setRotationPoint(-44F, -16.5F, -3.5F);

        gunModel[220].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F, 0.5F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0.5F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Import Box377
        gunModel[220].setRotationPoint(-44F, -19.5F, -3.5F);

        gunModel[221].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0.5F, 0.125F, -1.5F, 0F, 0.125F, -1.5F, 0F, 0.125F, -1.5F, 0.5F, 0.125F, -1.5F, 0.5F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0.5F, 0F, 0.125F); // Import Box378
        gunModel[221].setRotationPoint(-44F, -20.5F, -2.5F);

        gunModel[222].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0.5F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0.5F, 0F, -0.875F); // Import Box381
        gunModel[222].setRotationPoint(-44F, -6.5F, -3.5F);

        gunModel[223].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0.5F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0.5F, 0F, 0.125F, 0.5F, 0.125F, -1.5F, 0F, 0.125F, -1.5F, 0F, 0.125F, -1.5F, 0.5F, 0.125F, -1.5F); // Import Box382
        gunModel[223].setRotationPoint(-44F, -3.5F, -2.5F);

        gunModel[224].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import Box210
        gunModel[224].setRotationPoint(-2F, -16.5F, -3F);

        gunModel[225].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F, 0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F); // Import Box211
        gunModel[225].setRotationPoint(-3F, -16.5F, -3F);

        gunModel[226].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1F, -1F); // Import Box212
        gunModel[226].setRotationPoint(-2F, -12.5F, -3F);

        gunModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.99F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.99F, 0F, -1F); // Import Box213
        gunModel[227].setRotationPoint(-3F, -13.5F, -3F);

        gunModel[228].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Import Box214
        gunModel[228].setRotationPoint(3F, -16.5F, -3F);

        gunModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F, 0F, -0.5F, -1F); // Import Box215
        gunModel[229].setRotationPoint(3F, -12.5F, -3F);

        gunModel[230].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Import Box216
        gunModel[230].setRotationPoint(-2F, -12.5F, -2F);

        gunModel[231].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 2F, 0F, 0F); // Import Box217
        gunModel[231].setRotationPoint(-3.5F, -10.5F, -2F);

        gunModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 1.5F, 0F, -1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, -1F); // Import Box218
        gunModel[232].setRotationPoint(-3F, -12.5F, -2F);

        gunModel[233].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, -0.75F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, -0.75F, -1F); // Import Box219
        gunModel[233].setRotationPoint(-4.5F, -10.5F, -2F);

        gunModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, -1.5F, 0F, 0F, 1.5F, 0F, -1F, 1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F); // Import Box220
        gunModel[234].setRotationPoint(0.5F, -12.5F, -2F);

        gunModel[235].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F, -2F, 0F, 0F, 2F, -0.5F, -1F, 2F, -0.5F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box221
        gunModel[235].setRotationPoint(-1.5F, -10.5F, -2F);

        gunModel[236].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box222
        gunModel[236].setRotationPoint(-2F, -16.5F, -3F);

        gunModel[237].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0.75F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Import Box223
        gunModel[237].setRotationPoint(2F, -16.5F, -3F);

        gunModel[238].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box224
        gunModel[238].setRotationPoint(-4F, -16.5F, -3F);

        gunModel[239].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0.5F, -0.5F, -1F); // Import Box225
        gunModel[239].setRotationPoint(-4F, -16.5F, -3F);

        gunModel[240].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Import Box226
        gunModel[240].setRotationPoint(-5F, -16.5F, -3F);

        gunModel[241].addShapeBox(0F, 0F, 0F, 50, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import Box231
        gunModel[241].setRotationPoint(30F, -24F, -5F);

        gunModel[242].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -2F, 0F, -1.5F, 2F, 0F, -1.5F, 2F, -0.5F, 1.5F, -2F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box232
        gunModel[242].setRotationPoint(30F, -26F, -5F);

        gunModel[243].addShapeBox(0F, 0F, 0F, 48, 1, 1, 0F, -1F, 0F, -2F, 2F, 0F, -2F, 2F, -1F, 1.5F, -1F, -1F, 1.5F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box233
        gunModel[243].setRotationPoint(32F, -27F, -3.5F);

        gunModel[244].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box234
        gunModel[244].setRotationPoint(29F, -23F, -5F);

        gunModel[245].addShapeBox(0F, 0F, 0F, 47, 1, 3, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import Box239
        gunModel[245].setRotationPoint(33F, -27F, -1.5F);

        gunModel[246].addShapeBox(0F, 0F, 0F, 41, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box240
        gunModel[246].setRotationPoint(36F, -18F, -1.5F);

        gunModel[247].addShapeBox(0F, 0F, 0F, 49, 1, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box246
        gunModel[247].setRotationPoint(29F, -21F, -5F);

        gunModel[248].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box390
        gunModel[248].setRotationPoint(36F, -23F, -5F);

        gunModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box391
        gunModel[249].setRotationPoint(35.5F, -23F, -5F);

        gunModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box392
        gunModel[250].setRotationPoint(35.5F, -22F, -5F);

        gunModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box393
        gunModel[251].setRotationPoint(31.5F, -22F, -5F);

        gunModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box394
        gunModel[252].setRotationPoint(31.5F, -23F, -5F);

        gunModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box395
        gunModel[253].setRotationPoint(37F, -23F, -5F);

        gunModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box396
        gunModel[254].setRotationPoint(36.5F, -23F, -5F);

        gunModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box397
        gunModel[255].setRotationPoint(36.5F, -22F, -5F);

        gunModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box398
        gunModel[256].setRotationPoint(36.75F, -22F, -5F);

        gunModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box399
        gunModel[257].setRotationPoint(36.25F, -22F, -5F);

        gunModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F); // Import Box400
        gunModel[258].setRotationPoint(36.25F, -23F, -5F);

        gunModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F); // Import Box401
        gunModel[259].setRotationPoint(36.75F, -23F, -5F);

        gunModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -2F, 0F, -1.5F, 2F, 0F, -1.5F, 2F, -0.5F, 1.5F, -2F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box402
        gunModel[260].setRotationPoint(37F, -26F, -5F);

        gunModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, -0.5F, -0.5F, -1.125F, 0F, -0.5F, -1.125F, 0F, 0F, 1.075F, -0.5F, 0F, 1.075F); // Import Box403
        gunModel[261].setRotationPoint(38F, -26F, -5F);

        gunModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1.125F, -0.625F, 0F, 1.125F, -0.75F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Box404
        gunModel[262].setRotationPoint(32F, -24.5F, -3.5F);

        gunModel[263].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, -0.5F, 1.5F, 0F, -0.5F, 1.5F); // Import Box405
        gunModel[263].setRotationPoint(35F, -20F, -5F);

        gunModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -1.125F, -0.5F, -0.5F, -1.125F, -0.5F, 0F, 1.075F, 0F, 0F, 1.075F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F); // Import Box407
        gunModel[264].setRotationPoint(45F, -19F, -5F);

        gunModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, -0.5F, 1.5F, 2F, -0.5F, 1.5F); // Import Box408
        gunModel[265].setRotationPoint(52F, -20F, -5F);

        gunModel[266].addShapeBox(0F, 0F, 0F, 42, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1.5F, -1F, -1F, 1.5F); // Import Box409
        gunModel[266].setRotationPoint(35F, -18F, -3.5F);

        gunModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.625F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, -0.5F, -1.25F, -0.75F, -0.5F, -1.25F); // Import Box410
        gunModel[267].setRotationPoint(51F, -20.5F, -3.5F);

        gunModel[268].addShapeBox(0F, 0F, 0F, 50, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import Box411
        gunModel[268].setRotationPoint(30F, -24F, 4F);

        gunModel[269].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -2F, -0.5F, 1.5F, 2F, -0.5F, 1.5F, 2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box412
        gunModel[269].setRotationPoint(30F, -26F, 4F);

        gunModel[270].addShapeBox(0F, 0F, 0F, 48, 1, 1, 0F, -1F, -1F, 1.5F, 2F, -1F, 1.5F, 2F, 0F, -2F, -1F, 0F, -2F, 0F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import Box413
        gunModel[270].setRotationPoint(32F, -27F, 2.5F);

        gunModel[271].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box414
        gunModel[271].setRotationPoint(29F, -23F, 4F);

        gunModel[272].addShapeBox(0F, 0F, 0F, 49, 1, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box415
        gunModel[272].setRotationPoint(29F, -21F, 4F);

        gunModel[273].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box416
        gunModel[273].setRotationPoint(36F, -23F, 4F);

        gunModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box417
        gunModel[274].setRotationPoint(35.5F, -23F, 4F);

        gunModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box418
        gunModel[275].setRotationPoint(35.5F, -22F, 4F);

        gunModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box419
        gunModel[276].setRotationPoint(31.5F, -22F, 4F);

        gunModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box420
        gunModel[277].setRotationPoint(31.5F, -23F, 4F);

        gunModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box421
        gunModel[278].setRotationPoint(37F, -23F, 4F);

        gunModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box422
        gunModel[279].setRotationPoint(36.5F, -23F, 4F);

        gunModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box423
        gunModel[280].setRotationPoint(36.5F, -22F, 4F);

        gunModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box424
        gunModel[281].setRotationPoint(36.75F, -22F, 4F);

        gunModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box425
        gunModel[282].setRotationPoint(36.25F, -22F, 4F);

        gunModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F); // Import Box426
        gunModel[283].setRotationPoint(36.25F, -23F, 4F);

        gunModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F); // Import Box427
        gunModel[284].setRotationPoint(36.75F, -23F, 4F);

        gunModel[285].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -2F, -0.5F, 1.5F, 2F, -0.5F, 1.5F, 2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box428
        gunModel[285].setRotationPoint(37F, -26F, 4F);

        gunModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, 1.075F, 0F, 0F, 1.075F, 0F, -0.5F, -1.125F, -0.5F, -0.5F, -1.125F); // Import Box429
        gunModel[286].setRotationPoint(38F, -26F, 4F);

        gunModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -1.25F, -0.75F, -0.5F, -1.25F, -0.625F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F); // Import Box430
        gunModel[287].setRotationPoint(32F, -24.5F, 2.5F);

        gunModel[288].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, -2F, -0.5F, 1.5F, -2F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Box431
        gunModel[288].setRotationPoint(35F, -20F, 4F);

        gunModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1.075F, -0.5F, 0F, 1.075F, -0.5F, -0.5F, -1.125F, 0F, -0.5F, -1.125F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Box432
        gunModel[289].setRotationPoint(45F, -19F, 4F);

        gunModel[290].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 1.5F, -2F, -0.5F, 1.5F, -2F, 0F, -1.5F, 2F, 0F, -1.5F); // Import Box433
        gunModel[290].setRotationPoint(52F, -20F, 4F);

        gunModel[291].addShapeBox(0F, 0F, 0F, 42, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 1.5F, 0F, -1F, 1.5F, 0F, 0F, -2F, -1F, 0F, -2F); // Import Box434
        gunModel[291].setRotationPoint(35F, -18F, 2.5F);

        gunModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, -0.75F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, 1.125F, -0.625F, 0F, 1.125F); // Import Box435
        gunModel[292].setRotationPoint(51F, -20.5F, 2.5F);

        gunModel[293].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box437
        gunModel[293].setRotationPoint(29F, -22.5F, -3.5F);

        gunModel[294].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box438
        gunModel[294].setRotationPoint(29F, -21.5F, -3.5F);

        gunModel[295].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box439
        gunModel[295].setRotationPoint(29F, -17.5F, -3.5F);

        gunModel[296].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box440
        gunModel[296].setRotationPoint(29F, -18.5F, -3.5F);

        gunModel[297].addShapeBox(0F, 0F, 0F, 6, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box441
        gunModel[297].setRotationPoint(29F, -21.5F, -3F);

        gunModel[298].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box442
        gunModel[298].setRotationPoint(34F, -21F, -3.5F);

        gunModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box443
        gunModel[299].setRotationPoint(33.5F, -21F, -3.5F);

        gunModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box444
        gunModel[300].setRotationPoint(33.5F, -19.25F, -3.5F);

        gunModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box445
        gunModel[301].setRotationPoint(29.25F, -19.25F, -3.5F);

        gunModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box446
        gunModel[302].setRotationPoint(29.25F, -21F, -3.5F);

        gunModel[303].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box461
        gunModel[303].setRotationPoint(49F, -17F, -2F);

        gunModel[304].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box462
        gunModel[304].setRotationPoint(49F, -16F, -2F);

        gunModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box463
        gunModel[305].setRotationPoint(49F, -16F, -2F);

        gunModel[306].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box464
        gunModel[306].setRotationPoint(49F, -18F, -2F);

        gunModel[307].addShapeBox(0F, 0F, 0F, 31, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box466
        gunModel[307].setRotationPoint(44F, -27F, -2F);

        gunModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box467
        gunModel[308].setRotationPoint(44F, -28F, -2F);

        gunModel[309].addShapeBox(0F, 0F, 0F, 31, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box468
        gunModel[309].setRotationPoint(44F, -28F, -2F);

        gunModel[310].addShapeBox(0F, 0F, 0F, 17, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box469
        gunModel[310].setRotationPoint(56F, -24F, 5F);

        gunModel[311].addShapeBox(0F, 0F, 0F, 17, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box470
        gunModel[311].setRotationPoint(56F, -24F, 5F);

        gunModel[312].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box471
        gunModel[312].setRotationPoint(56F, -24F, 6F);

        gunModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box503
        gunModel[313].setRotationPoint(46F, -28F, -2F);

        gunModel[314].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box504
        gunModel[314].setRotationPoint(58F, -24F, 6F);

        gunModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box505
        gunModel[315].setRotationPoint(51F, -16F, -2F);

        gunModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box506
        gunModel[316].setRotationPoint(48F, -28F, -2F);

        gunModel[317].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box507
        gunModel[317].setRotationPoint(60F, -24F, 6F);

        gunModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box508
        gunModel[318].setRotationPoint(53F, -16F, -2F);

        gunModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box509
        gunModel[319].setRotationPoint(50F, -28F, -2F);

        gunModel[320].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box510
        gunModel[320].setRotationPoint(62F, -24F, 6F);

        gunModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box511
        gunModel[321].setRotationPoint(55F, -16F, -2F);

        gunModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box512
        gunModel[322].setRotationPoint(52F, -28F, -2F);

        gunModel[323].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box513
        gunModel[323].setRotationPoint(64F, -24F, 6F);

        gunModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box514
        gunModel[324].setRotationPoint(57F, -16F, -2F);

        gunModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box515
        gunModel[325].setRotationPoint(54F, -28F, -2F);

        gunModel[326].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box516
        gunModel[326].setRotationPoint(66F, -24F, 6F);

        gunModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box517
        gunModel[327].setRotationPoint(59F, -16F, -2F);

        gunModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box518
        gunModel[328].setRotationPoint(56F, -28F, -2F);

        gunModel[329].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box519
        gunModel[329].setRotationPoint(68F, -24F, 6F);

        gunModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box520
        gunModel[330].setRotationPoint(61F, -16F, -2F);

        gunModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box521
        gunModel[331].setRotationPoint(58F, -28F, -2F);

        gunModel[332].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box522
        gunModel[332].setRotationPoint(70F, -24F, 6F);

        gunModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box523
        gunModel[333].setRotationPoint(63F, -16F, -2F);

        gunModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box524
        gunModel[334].setRotationPoint(60F, -28F, -2F);

        gunModel[335].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box525
        gunModel[335].setRotationPoint(72F, -24F, 6F);

        gunModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box526
        gunModel[336].setRotationPoint(65F, -16F, -2F);

        gunModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box527
        gunModel[337].setRotationPoint(62F, -28F, -2F);

        gunModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box530
        gunModel[338].setRotationPoint(64F, -28F, -2F);

        gunModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box532
        gunModel[339].setRotationPoint(66F, -28F, -2F);

        gunModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box535
        gunModel[340].setRotationPoint(68F, -28F, -2F);

        gunModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box538
        gunModel[341].setRotationPoint(70F, -28F, -2F);

        gunModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box541
        gunModel[342].setRotationPoint(72F, -28F, -2F);

        gunModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box544
        gunModel[343].setRotationPoint(74F, -28F, -2F);

        gunModel[344].addShapeBox(0F, 0F, 0F, 17, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box547
        gunModel[344].setRotationPoint(56F, -24F, -6F);

        gunModel[345].addShapeBox(0F, 0F, 0F, 17, 4, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box548
        gunModel[345].setRotationPoint(56F, -24F, -6F);

        gunModel[346].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box549
        gunModel[346].setRotationPoint(56F, -24F, -7F);

        gunModel[347].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box550
        gunModel[347].setRotationPoint(58F, -24F, -7F);

        gunModel[348].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box551
        gunModel[348].setRotationPoint(60F, -24F, -7F);

        gunModel[349].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box552
        gunModel[349].setRotationPoint(62F, -24F, -7F);

        gunModel[350].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box553
        gunModel[350].setRotationPoint(64F, -24F, -7F);

        gunModel[351].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box554
        gunModel[351].setRotationPoint(66F, -24F, -7F);

        gunModel[352].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box555
        gunModel[352].setRotationPoint(68F, -24F, -7F);

        gunModel[353].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box556
        gunModel[353].setRotationPoint(70F, -24F, -7F);

        gunModel[354].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box557
        gunModel[354].setRotationPoint(72F, -24F, -7F);

        gunModel[355].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box568
        gunModel[355].setRotationPoint(37F, -23F, 4F);

        gunModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F); // Import Box569
        gunModel[356].setRotationPoint(36.75F, -23F, 4F);

        gunModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box570
        gunModel[357].setRotationPoint(36.75F, -22F, 4F);

        gunModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box571
        gunModel[358].setRotationPoint(36.5F, -22F, 4F);

        gunModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box572
        gunModel[359].setRotationPoint(36.25F, -22F, 4F);

        gunModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F); // Import Box573
        gunModel[360].setRotationPoint(36.25F, -23F, 4F);

        gunModel[361].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box574
        gunModel[361].setRotationPoint(36F, -23F, 4F);

        gunModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box575
        gunModel[362].setRotationPoint(36.5F, -23F, 4F);

        gunModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box576
        gunModel[363].setRotationPoint(35.5F, -23F, 4F);

        gunModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box577
        gunModel[364].setRotationPoint(31.5F, -23F, 4F);

        gunModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box578
        gunModel[365].setRotationPoint(31.5F, -22F, 4F);

        gunModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box579
        gunModel[366].setRotationPoint(35.5F, -23F, -5F);

        gunModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box580
        gunModel[367].setRotationPoint(36.5F, -22F, -5F);

        gunModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box581
        gunModel[368].setRotationPoint(35.5F, -22F, -5F);

        gunModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box582
        gunModel[369].setRotationPoint(36.25F, -22F, -5F);

        gunModel[370].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box583
        gunModel[370].setRotationPoint(36F, -23F, -5F);

        gunModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F); // Import Box584
        gunModel[371].setRotationPoint(36.25F, -23F, -5F);

        gunModel[372].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box585
        gunModel[372].setRotationPoint(36.5F, -23F, -5F);

        gunModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F); // Import Box586
        gunModel[373].setRotationPoint(36.75F, -23F, -5F);

        gunModel[374].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box587
        gunModel[374].setRotationPoint(37F, -23F, -5F);

        gunModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box588
        gunModel[375].setRotationPoint(36.75F, -22F, -5F);

        gunModel[376].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box589
        gunModel[376].setRotationPoint(31.5F, -22F, -5F);

        gunModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box590
        gunModel[377].setRotationPoint(31.5F, -23F, -5F);

        gunModel[378].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box591
        gunModel[378].setRotationPoint(43F, -23F, 4F);

        gunModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F); // Import Box592
        gunModel[379].setRotationPoint(42.75F, -23F, 4F);

        gunModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box593
        gunModel[380].setRotationPoint(42.75F, -22F, 4F);

        gunModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box594
        gunModel[381].setRotationPoint(42.5F, -22F, 4F);

        gunModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box595
        gunModel[382].setRotationPoint(42.25F, -22F, 4F);

        gunModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F); // Import Box596
        gunModel[383].setRotationPoint(42.25F, -23F, 4F);

        gunModel[384].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box597
        gunModel[384].setRotationPoint(42F, -23F, 4F);

        gunModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box598
        gunModel[385].setRotationPoint(42.5F, -23F, 4F);

        gunModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box599
        gunModel[386].setRotationPoint(41.5F, -23F, 4F);

        gunModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box600
        gunModel[387].setRotationPoint(37.5F, -23F, 4F);

        gunModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box601
        gunModel[388].setRotationPoint(37.5F, -22F, 4F);

        gunModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box602
        gunModel[389].setRotationPoint(41.5F, -23F, -5F);

        gunModel[390].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box603
        gunModel[390].setRotationPoint(42.5F, -22F, -5F);

        gunModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box604
        gunModel[391].setRotationPoint(41.5F, -22F, -5F);

        gunModel[392].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box605
        gunModel[392].setRotationPoint(42.25F, -22F, -5F);

        gunModel[393].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box606
        gunModel[393].setRotationPoint(42F, -23F, -5F);

        gunModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F); // Import Box607
        gunModel[394].setRotationPoint(42.25F, -23F, -5F);

        gunModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box608
        gunModel[395].setRotationPoint(42.5F, -23F, -5F);

        gunModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F); // Import Box609
        gunModel[396].setRotationPoint(42.75F, -23F, -5F);

        gunModel[397].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box610
        gunModel[397].setRotationPoint(43F, -23F, -5F);

        gunModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box611
        gunModel[398].setRotationPoint(42.75F, -22F, -5F);

        gunModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box612
        gunModel[399].setRotationPoint(37.5F, -22F, -5F);

        gunModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box613
        gunModel[400].setRotationPoint(37.5F, -23F, -5F);

        gunModel[401].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box614
        gunModel[401].setRotationPoint(49F, -23F, 4F);

        gunModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F); // Import Box615
        gunModel[402].setRotationPoint(48.75F, -23F, 4F);

        gunModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box616
        gunModel[403].setRotationPoint(48.75F, -22F, 4F);

        gunModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box617
        gunModel[404].setRotationPoint(48.5F, -22F, 4F);

        gunModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box618
        gunModel[405].setRotationPoint(48.25F, -22F, 4F);

        gunModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F); // Import Box619
        gunModel[406].setRotationPoint(48.25F, -23F, 4F);

        gunModel[407].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box620
        gunModel[407].setRotationPoint(48F, -23F, 4F);

        gunModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box621
        gunModel[408].setRotationPoint(48.5F, -23F, 4F);

        gunModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box622
        gunModel[409].setRotationPoint(47.5F, -23F, 4F);

        gunModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box623
        gunModel[410].setRotationPoint(43.5F, -23F, 4F);

        gunModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box624
        gunModel[411].setRotationPoint(43.5F, -22F, 4F);

        gunModel[412].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box625
        gunModel[412].setRotationPoint(47.5F, -23F, -5F);

        gunModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box626
        gunModel[413].setRotationPoint(48.5F, -22F, -5F);

        gunModel[414].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box627
        gunModel[414].setRotationPoint(47.5F, -22F, -5F);

        gunModel[415].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box628
        gunModel[415].setRotationPoint(48.25F, -22F, -5F);

        gunModel[416].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box629
        gunModel[416].setRotationPoint(48F, -23F, -5F);

        gunModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F); // Import Box630
        gunModel[417].setRotationPoint(48.25F, -23F, -5F);

        gunModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box631
        gunModel[418].setRotationPoint(48.5F, -23F, -5F);

        gunModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F); // Import Box632
        gunModel[419].setRotationPoint(48.75F, -23F, -5F);

        gunModel[420].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box633
        gunModel[420].setRotationPoint(49F, -23F, -5F);

        gunModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box634
        gunModel[421].setRotationPoint(48.75F, -22F, -5F);

        gunModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box635
        gunModel[422].setRotationPoint(43.5F, -22F, -5F);

        gunModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box636
        gunModel[423].setRotationPoint(43.5F, -23F, -5F);

        gunModel[424].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box637
        gunModel[424].setRotationPoint(55F, -23F, 4F);

        gunModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F); // Import Box638
        gunModel[425].setRotationPoint(54.75F, -23F, 4F);

        gunModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box639
        gunModel[426].setRotationPoint(54.75F, -22F, 4F);

        gunModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box640
        gunModel[427].setRotationPoint(54.5F, -22F, 4F);

        gunModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box641
        gunModel[428].setRotationPoint(54.25F, -22F, 4F);

        gunModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F); // Import Box642
        gunModel[429].setRotationPoint(54.25F, -23F, 4F);

        gunModel[430].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box643
        gunModel[430].setRotationPoint(54F, -23F, 4F);

        gunModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box644
        gunModel[431].setRotationPoint(54.5F, -23F, 4F);

        gunModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box645
        gunModel[432].setRotationPoint(53.5F, -23F, 4F);

        gunModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box646
        gunModel[433].setRotationPoint(49.5F, -23F, 4F);

        gunModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box647
        gunModel[434].setRotationPoint(49.5F, -22F, 4F);

        gunModel[435].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box648
        gunModel[435].setRotationPoint(53.5F, -23F, -5F);

        gunModel[436].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box649
        gunModel[436].setRotationPoint(54.5F, -22F, -5F);

        gunModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box650
        gunModel[437].setRotationPoint(53.5F, -22F, -5F);

        gunModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box651
        gunModel[438].setRotationPoint(54.25F, -22F, -5F);

        gunModel[439].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box652
        gunModel[439].setRotationPoint(54F, -23F, -5F);

        gunModel[440].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F); // Import Box653
        gunModel[440].setRotationPoint(54.25F, -23F, -5F);

        gunModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box654
        gunModel[441].setRotationPoint(54.5F, -23F, -5F);

        gunModel[442].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F); // Import Box655
        gunModel[442].setRotationPoint(54.75F, -23F, -5F);

        gunModel[443].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box656
        gunModel[443].setRotationPoint(55F, -23F, -5F);

        gunModel[444].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box657
        gunModel[444].setRotationPoint(54.75F, -22F, -5F);

        gunModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box658
        gunModel[445].setRotationPoint(49.5F, -22F, -5F);

        gunModel[446].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box659
        gunModel[446].setRotationPoint(49.5F, -23F, -5F);

        gunModel[447].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box660
        gunModel[447].setRotationPoint(61F, -23F, 4F);

        gunModel[448].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F); // Import Box661
        gunModel[448].setRotationPoint(60.75F, -23F, 4F);

        gunModel[449].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box662
        gunModel[449].setRotationPoint(60.75F, -22F, 4F);

        gunModel[450].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box663
        gunModel[450].setRotationPoint(60.5F, -22F, 4F);

        gunModel[451].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box664
        gunModel[451].setRotationPoint(60.25F, -22F, 4F);

        gunModel[452].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F); // Import Box665
        gunModel[452].setRotationPoint(60.25F, -23F, 4F);

        gunModel[453].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box666
        gunModel[453].setRotationPoint(60F, -23F, 4F);

        gunModel[454].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box667
        gunModel[454].setRotationPoint(60.5F, -23F, 4F);

        gunModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box668
        gunModel[455].setRotationPoint(59.5F, -23F, 4F);

        gunModel[456].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box669
        gunModel[456].setRotationPoint(55.5F, -23F, 4F);

        gunModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box670
        gunModel[457].setRotationPoint(55.5F, -22F, 4F);

        gunModel[458].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box671
        gunModel[458].setRotationPoint(59.5F, -23F, -5F);

        gunModel[459].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box672
        gunModel[459].setRotationPoint(60.5F, -22F, -5F);

        gunModel[460].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box673
        gunModel[460].setRotationPoint(59.5F, -22F, -5F);

        gunModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box674
        gunModel[461].setRotationPoint(60.25F, -22F, -5F);

        gunModel[462].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box675
        gunModel[462].setRotationPoint(60F, -23F, -5F);

        gunModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F); // Import Box676
        gunModel[463].setRotationPoint(60.25F, -23F, -5F);

        gunModel[464].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box677
        gunModel[464].setRotationPoint(60.5F, -23F, -5F);

        gunModel[465].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F); // Import Box678
        gunModel[465].setRotationPoint(60.75F, -23F, -5F);

        gunModel[466].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box679
        gunModel[466].setRotationPoint(61F, -23F, -5F);

        gunModel[467].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box680
        gunModel[467].setRotationPoint(60.75F, -22F, -5F);

        gunModel[468].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box681
        gunModel[468].setRotationPoint(55.5F, -22F, -5F);

        gunModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box682
        gunModel[469].setRotationPoint(55.5F, -23F, -5F);

        gunModel[470].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box683
        gunModel[470].setRotationPoint(67F, -23F, 4F);

        gunModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F); // Import Box684
        gunModel[471].setRotationPoint(66.75F, -23F, 4F);

        gunModel[472].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box685
        gunModel[472].setRotationPoint(66.75F, -22F, 4F);

        gunModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box686
        gunModel[473].setRotationPoint(66.5F, -22F, 4F);

        gunModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box687
        gunModel[474].setRotationPoint(66.25F, -22F, 4F);

        gunModel[475].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F); // Import Box688
        gunModel[475].setRotationPoint(66.25F, -23F, 4F);

        gunModel[476].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box689
        gunModel[476].setRotationPoint(66F, -23F, 4F);

        gunModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box690
        gunModel[477].setRotationPoint(66.5F, -23F, 4F);

        gunModel[478].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box691
        gunModel[478].setRotationPoint(65.5F, -23F, 4F);

        gunModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box692
        gunModel[479].setRotationPoint(61.5F, -23F, 4F);

        gunModel[480].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box693
        gunModel[480].setRotationPoint(61.5F, -22F, 4F);

        gunModel[481].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box694
        gunModel[481].setRotationPoint(65.5F, -23F, -5F);

        gunModel[482].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box695
        gunModel[482].setRotationPoint(66.5F, -22F, -5F);

        gunModel[483].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box696
        gunModel[483].setRotationPoint(65.5F, -22F, -5F);

        gunModel[484].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box697
        gunModel[484].setRotationPoint(66.25F, -22F, -5F);

        gunModel[485].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box698
        gunModel[485].setRotationPoint(66F, -23F, -5F);

        gunModel[486].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F); // Import Box699
        gunModel[486].setRotationPoint(66.25F, -23F, -5F);

        gunModel[487].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box700
        gunModel[487].setRotationPoint(66.5F, -23F, -5F);

        gunModel[488].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F); // Import Box701
        gunModel[488].setRotationPoint(66.75F, -23F, -5F);

        gunModel[489].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box702
        gunModel[489].setRotationPoint(67F, -23F, -5F);

        gunModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box703
        gunModel[490].setRotationPoint(66.75F, -22F, -5F);

        gunModel[491].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box704
        gunModel[491].setRotationPoint(61.5F, -22F, -5F);

        gunModel[492].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box705
        gunModel[492].setRotationPoint(61.5F, -23F, -5F);

        gunModel[493].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box706
        gunModel[493].setRotationPoint(73F, -23F, 4F);

        gunModel[494].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F); // Import Box707
        gunModel[494].setRotationPoint(72.75F, -23F, 4F);

        gunModel[495].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box708
        gunModel[495].setRotationPoint(72.75F, -22F, 4F);

        gunModel[496].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box709
        gunModel[496].setRotationPoint(72.5F, -22F, 4F);

        gunModel[497].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box710
        gunModel[497].setRotationPoint(72.25F, -22F, 4F);

        gunModel[498].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F); // Import Box711
        gunModel[498].setRotationPoint(72.25F, -23F, 4F);

        gunModel[499].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box712
        gunModel[499].setRotationPoint(72F, -23F, 4F);
    }

    private void initgunModel_2() {
        gunModel[500] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Import Box713
        gunModel[501] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Import Box714
        gunModel[502] = new ModelRendererTurbo(this, 297, 137, textureX, textureY); // Import Box715
        gunModel[503] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Import Box716
        gunModel[504] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Import Box717
        gunModel[505] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Import Box718
        gunModel[506] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Import Box719
        gunModel[507] = new ModelRendererTurbo(this, 337, 137, textureX, textureY); // Import Box720
        gunModel[508] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Import Box721
        gunModel[509] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Import Box722
        gunModel[510] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Import Box723
        gunModel[511] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Import Box724
        gunModel[512] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Import Box725
        gunModel[513] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Import Box726
        gunModel[514] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Import Box727
        gunModel[515] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Import Box728
        gunModel[516] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Import Box729
        gunModel[517] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Import Box730
        gunModel[518] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Import Box731
        gunModel[519] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Import Box732
        gunModel[520] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Import Box733
        gunModel[521] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Import Box734
        gunModel[522] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Import Box735
        gunModel[523] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Import Box736
        gunModel[524] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Import Box737
        gunModel[525] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Import Box738
        gunModel[526] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Import Box739
        gunModel[527] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Import Box740
        gunModel[528] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Import Box741
        gunModel[529] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import Box742
        gunModel[530] = new ModelRendererTurbo(this, 9, 145, textureX, textureY); // Import Box743
        gunModel[531] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Import Box744
        gunModel[532] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Import Box745
        gunModel[533] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Import Box746
        gunModel[534] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Import Box747
        gunModel[535] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Import Box748
        gunModel[536] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Import Box749
        gunModel[537] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Import Box750
        gunModel[538] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Import Box751
        gunModel[539] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Import Box752
        gunModel[540] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Import Box753
        gunModel[541] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Import Box754
        gunModel[542] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Import Box755
        gunModel[543] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Import Box756
        gunModel[544] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Import Box757
        gunModel[545] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Import Box758
        gunModel[546] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Import Box759
        gunModel[547] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Import Box760
        gunModel[548] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Import Box761
        gunModel[549] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Import Box762
        gunModel[550] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Import Box763
        gunModel[551] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Import Box764
        gunModel[552] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Import Box765
        gunModel[553] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Import Box766
        gunModel[554] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Import Box767
        gunModel[555] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Import Box768
        gunModel[556] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Import Box769
        gunModel[557] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Import Box770
        gunModel[558] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Import Box771
        gunModel[559] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Import Box772
        gunModel[560] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Import Box773
        gunModel[561] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Import Box774
        gunModel[562] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Import Box775
        gunModel[563] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Import Box776
        gunModel[564] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Import Box777
        gunModel[565] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Import Box778
        gunModel[566] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Import Box779
        gunModel[567] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Import Box780
        gunModel[568] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Import Box781
        gunModel[569] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Import Box782
        gunModel[570] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Import Box783
        gunModel[571] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Import Box784
        gunModel[572] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Import Box785
        gunModel[573] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Import Box786
        gunModel[574] = new ModelRendererTurbo(this, 361, 145, textureX, textureY); // Import Box787
        gunModel[575] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Import Box788
        gunModel[576] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Import Box789
        gunModel[577] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Import Box790
        gunModel[578] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Import Box791
        gunModel[579] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Import Box792
        gunModel[580] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Import Box793
        gunModel[581] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Import Box794
        gunModel[582] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Import Box795
        gunModel[583] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Import Box801
        gunModel[584] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Import Box802
        gunModel[585] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Import Box803
        gunModel[586] = new ModelRendererTurbo(this, 457, 145, textureX, textureY); // Import Box804
        gunModel[587] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Import Box805
        gunModel[588] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Import Box806
        gunModel[589] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Import Box812
        gunModel[590] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Import Box813
        gunModel[591] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Import Box814
        gunModel[592] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Import Box815
        gunModel[593] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Import Box816
        gunModel[594] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Import Box817
        gunModel[595] = new ModelRendererTurbo(this, 17, 153, textureX, textureY); // Import Box823
        gunModel[596] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Import Box824
        gunModel[597] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Import Box825
        gunModel[598] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Import Box826
        gunModel[599] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Import Box827
        gunModel[600] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Import Box828
        gunModel[601] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Import Box829
        gunModel[602] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Import Box830
        gunModel[603] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Import Box831
        gunModel[604] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Import Box832
        gunModel[605] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Import Box844
        gunModel[606] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Import Box457
        gunModel[607] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Import Box458
        gunModel[608] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Import Box459
        gunModel[609] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Import Box460
        gunModel[610] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Import Box833
        gunModel[611] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Import Box834
        gunModel[612] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Import Box835
        gunModel[613] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Import Box836
        gunModel[614] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Import Box837
        gunModel[615] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Import Box838
        gunModel[616] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Import Box839
        gunModel[617] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Import Box840
        gunModel[618] = new ModelRendererTurbo(this, 321, 153, textureX, textureY); // Import Box841
        gunModel[619] = new ModelRendererTurbo(this, 337, 153, textureX, textureY); // Import Box842
        gunModel[620] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Import Box102
        gunModel[621] = new ModelRendererTurbo(this, 385, 153, textureX, textureY); // Import Box103
        gunModel[622] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Import Box104
        gunModel[623] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Import Box105
        gunModel[624] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Import Box106
        gunModel[625] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import Box110
        gunModel[626] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Import Box112
        gunModel[627] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Import Box113
        gunModel[628] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Import Box114
        gunModel[629] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Import Box115
        gunModel[630] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Import Box116
        gunModel[631] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Import Box117
        gunModel[632] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Import Box118
        gunModel[633] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import Box120
        gunModel[634] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Import Box123
        gunModel[635] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Import Box124
        gunModel[636] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Import Box125
        gunModel[637] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Import Box126
        gunModel[638] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Import Box127
        gunModel[639] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Import Box128
        gunModel[640] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Import Box129
        gunModel[641] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Import Box130
        gunModel[642] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Import Box131
        gunModel[643] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Import Box132
        gunModel[644] = new ModelRendererTurbo(this, 401, 177, textureX, textureY); // Import Box133
        gunModel[645] = new ModelRendererTurbo(this, 209, 273, textureX, textureY); // Import Box418
        gunModel[646] = new ModelRendererTurbo(this, 217, 273, textureX, textureY); // Import Box418
        gunModel[647] = new ModelRendererTurbo(this, 225, 273, textureX, textureY); // Import Box418
        gunModel[648] = new ModelRendererTurbo(this, 233, 273, textureX, textureY); // Import Box418
        gunModel[649] = new ModelRendererTurbo(this, 241, 273, textureX, textureY); // Import Box418
        gunModel[650] = new ModelRendererTurbo(this, 249, 273, textureX, textureY); // Import Box418
        gunModel[651] = new ModelRendererTurbo(this, 257, 273, textureX, textureY); // Import Box418

        gunModel[500].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box713
        gunModel[500].setRotationPoint(72.5F, -23F, 4F);

        gunModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box714
        gunModel[501].setRotationPoint(71.5F, -23F, 4F);

        gunModel[502].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box715
        gunModel[502].setRotationPoint(67.5F, -23F, 4F);

        gunModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box716
        gunModel[503].setRotationPoint(67.5F, -22F, 4F);

        gunModel[504].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box717
        gunModel[504].setRotationPoint(71.5F, -23F, -5F);

        gunModel[505].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box718
        gunModel[505].setRotationPoint(72.5F, -22F, -5F);

        gunModel[506].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box719
        gunModel[506].setRotationPoint(71.5F, -22F, -5F);

        gunModel[507].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box720
        gunModel[507].setRotationPoint(72.25F, -22F, -5F);

        gunModel[508].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box721
        gunModel[508].setRotationPoint(72F, -23F, -5F);

        gunModel[509].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F); // Import Box722
        gunModel[509].setRotationPoint(72.25F, -23F, -5F);

        gunModel[510].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box723
        gunModel[510].setRotationPoint(72.5F, -23F, -5F);

        gunModel[511].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F); // Import Box724
        gunModel[511].setRotationPoint(72.75F, -23F, -5F);

        gunModel[512].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box725
        gunModel[512].setRotationPoint(73F, -23F, -5F);

        gunModel[513].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box726
        gunModel[513].setRotationPoint(72.75F, -22F, -5F);

        gunModel[514].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box727
        gunModel[514].setRotationPoint(67.5F, -22F, -5F);

        gunModel[515].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box728
        gunModel[515].setRotationPoint(67.5F, -23F, -5F);

        gunModel[516].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box729
        gunModel[516].setRotationPoint(78F, -23F, 4F);

        gunModel[517].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F); // Import Box730
        gunModel[517].setRotationPoint(77.75F, -23F, 4F);

        gunModel[518].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box731
        gunModel[518].setRotationPoint(77.75F, -22F, 4F);

        gunModel[519].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box732
        gunModel[519].setRotationPoint(77.5F, -22F, 4F);

        gunModel[520].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box733
        gunModel[520].setRotationPoint(77.25F, -22F, 4F);

        gunModel[521].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F); // Import Box734
        gunModel[521].setRotationPoint(77.25F, -23F, 4F);

        gunModel[522].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box735
        gunModel[522].setRotationPoint(77F, -23F, 4F);

        gunModel[523].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box736
        gunModel[523].setRotationPoint(77.5F, -23F, 4F);

        gunModel[524].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box737
        gunModel[524].setRotationPoint(76.5F, -23F, 4F);

        gunModel[525].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box738
        gunModel[525].setRotationPoint(73.5F, -23F, 4F);

        gunModel[526].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box739
        gunModel[526].setRotationPoint(73.5F, -22F, 4F);

        gunModel[527].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box740
        gunModel[527].setRotationPoint(76.5F, -23F, -5F);

        gunModel[528].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box741
        gunModel[528].setRotationPoint(77.5F, -22F, -5F);

        gunModel[529].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box742
        gunModel[529].setRotationPoint(76.5F, -22F, -5F);

        gunModel[530].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box743
        gunModel[530].setRotationPoint(77.25F, -22F, -5F);

        gunModel[531].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box744
        gunModel[531].setRotationPoint(77F, -23F, -5F);

        gunModel[532].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F); // Import Box745
        gunModel[532].setRotationPoint(77.25F, -23F, -5F);

        gunModel[533].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box746
        gunModel[533].setRotationPoint(77.5F, -23F, -5F);

        gunModel[534].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F); // Import Box747
        gunModel[534].setRotationPoint(77.75F, -23F, -5F);

        gunModel[535].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box748
        gunModel[535].setRotationPoint(78F, -23F, -5F);

        gunModel[536].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Import Box749
        gunModel[536].setRotationPoint(77.75F, -22F, -5F);

        gunModel[537].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box750
        gunModel[537].setRotationPoint(73.5F, -22F, -5F);

        gunModel[538].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box751
        gunModel[538].setRotationPoint(73.5F, -23F, -5F);

        gunModel[539].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 1.5F, -2F, -0.5F, 1.5F, -2F, 0F, -1.5F, 2F, 0F, -1.5F); // Import Box752
        gunModel[539].setRotationPoint(58F, -20F, 4F);

        gunModel[540].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, -0.5F, 1.5F, 2F, -0.5F, 1.5F); // Import Box753
        gunModel[540].setRotationPoint(58F, -20F, -5F);

        gunModel[541].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.625F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, -0.5F, -1.25F, -0.75F, -0.5F, -1.25F); // Import Box754
        gunModel[541].setRotationPoint(57F, -20.5F, -3.5F);

        gunModel[542].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -1.125F, -0.5F, -0.5F, -1.125F, -0.5F, 0F, 1.075F, 0F, 0F, 1.075F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F); // Import Box755
        gunModel[542].setRotationPoint(51F, -19F, -5F);

        gunModel[543].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1.075F, -0.5F, 0F, 1.075F, -0.5F, -0.5F, -1.125F, 0F, -0.5F, -1.125F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Box756
        gunModel[543].setRotationPoint(51F, -19F, 4F);

        gunModel[544].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -2F, -0.5F, 1.5F, 2F, -0.5F, 1.5F, 2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box757
        gunModel[544].setRotationPoint(43F, -26F, 4F);

        gunModel[545].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, 1.075F, 0F, 0F, 1.075F, 0F, -0.5F, -1.125F, -0.5F, -0.5F, -1.125F); // Import Box758
        gunModel[545].setRotationPoint(44F, -26F, 4F);

        gunModel[546].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -1.25F, -0.75F, -0.5F, -1.25F, -0.625F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F); // Import Box759
        gunModel[546].setRotationPoint(38F, -24.5F, 2.5F);

        gunModel[547].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -2F, 0F, -1.5F, 2F, 0F, -1.5F, 2F, -0.5F, 1.5F, -2F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box760
        gunModel[547].setRotationPoint(43F, -26F, -5F);

        gunModel[548].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, -0.5F, -0.5F, -1.125F, 0F, -0.5F, -1.125F, 0F, 0F, 1.075F, -0.5F, 0F, 1.075F); // Import Box761
        gunModel[548].setRotationPoint(44F, -26F, -5F);

        gunModel[549].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1.125F, -0.625F, 0F, 1.125F, -0.75F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Box762
        gunModel[549].setRotationPoint(38F, -24.5F, -3.5F);

        gunModel[550].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 1.5F, -2F, -0.5F, 1.5F, -2F, 0F, -1.5F, 2F, 0F, -1.5F); // Import Box763
        gunModel[550].setRotationPoint(64F, -20F, 4F);

        gunModel[551].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, -0.5F, 1.5F, 2F, -0.5F, 1.5F); // Import Box764
        gunModel[551].setRotationPoint(64F, -20F, -5F);

        gunModel[552].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.625F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, -0.5F, -1.25F, -0.75F, -0.5F, -1.25F); // Import Box765
        gunModel[552].setRotationPoint(63F, -20.5F, -3.5F);

        gunModel[553].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -1.125F, -0.5F, -0.5F, -1.125F, -0.5F, 0F, 1.075F, 0F, 0F, 1.075F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F); // Import Box766
        gunModel[553].setRotationPoint(57F, -19F, -5F);

        gunModel[554].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1.075F, -0.5F, 0F, 1.075F, -0.5F, -0.5F, -1.125F, 0F, -0.5F, -1.125F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Box767
        gunModel[554].setRotationPoint(57F, -19F, 4F);

        gunModel[555].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -2F, -0.5F, 1.5F, 2F, -0.5F, 1.5F, 2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box768
        gunModel[555].setRotationPoint(49F, -26F, 4F);

        gunModel[556].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, 1.075F, 0F, 0F, 1.075F, 0F, -0.5F, -1.125F, -0.5F, -0.5F, -1.125F); // Import Box769
        gunModel[556].setRotationPoint(50F, -26F, 4F);

        gunModel[557].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -1.25F, -0.75F, -0.5F, -1.25F, -0.625F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F); // Import Box770
        gunModel[557].setRotationPoint(44F, -24.5F, 2.5F);

        gunModel[558].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -2F, 0F, -1.5F, 2F, 0F, -1.5F, 2F, -0.5F, 1.5F, -2F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box771
        gunModel[558].setRotationPoint(49F, -26F, -5F);

        gunModel[559].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, -0.5F, -0.5F, -1.125F, 0F, -0.5F, -1.125F, 0F, 0F, 1.075F, -0.5F, 0F, 1.075F); // Import Box772
        gunModel[559].setRotationPoint(50F, -26F, -5F);

        gunModel[560].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1.125F, -0.625F, 0F, 1.125F, -0.75F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Box773
        gunModel[560].setRotationPoint(44F, -24.5F, -3.5F);

        gunModel[561].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 1.5F, -2F, -0.5F, 1.5F, -2F, 0F, -1.5F, 2F, 0F, -1.5F); // Import Box774
        gunModel[561].setRotationPoint(70F, -20F, 4F);

        gunModel[562].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, -0.5F, 1.5F, 2F, -0.5F, 1.5F); // Import Box775
        gunModel[562].setRotationPoint(70F, -20F, -5F);

        gunModel[563].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.625F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, -0.5F, -1.25F, -0.75F, -0.5F, -1.25F); // Import Box776
        gunModel[563].setRotationPoint(69F, -20.5F, -3.5F);

        gunModel[564].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -1.125F, -0.5F, -0.5F, -1.125F, -0.5F, 0F, 1.075F, 0F, 0F, 1.075F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F); // Import Box777
        gunModel[564].setRotationPoint(63F, -19F, -5F);

        gunModel[565].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1.075F, -0.5F, 0F, 1.075F, -0.5F, -0.5F, -1.125F, 0F, -0.5F, -1.125F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Box778
        gunModel[565].setRotationPoint(63F, -19F, 4F);

        gunModel[566].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -2F, -0.5F, 1.5F, 2F, -0.5F, 1.5F, 2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box779
        gunModel[566].setRotationPoint(55F, -26F, 4F);

        gunModel[567].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, 1.075F, 0F, 0F, 1.075F, 0F, -0.5F, -1.125F, -0.5F, -0.5F, -1.125F); // Import Box780
        gunModel[567].setRotationPoint(56F, -26F, 4F);

        gunModel[568].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -1.25F, -0.75F, -0.5F, -1.25F, -0.625F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F); // Import Box781
        gunModel[568].setRotationPoint(50F, -24.5F, 2.5F);

        gunModel[569].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -2F, 0F, -1.5F, 2F, 0F, -1.5F, 2F, -0.5F, 1.5F, -2F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box782
        gunModel[569].setRotationPoint(55F, -26F, -5F);

        gunModel[570].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, -0.5F, -0.5F, -1.125F, 0F, -0.5F, -1.125F, 0F, 0F, 1.075F, -0.5F, 0F, 1.075F); // Import Box783
        gunModel[570].setRotationPoint(56F, -26F, -5F);

        gunModel[571].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1.125F, -0.625F, 0F, 1.125F, -0.75F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Box784
        gunModel[571].setRotationPoint(50F, -24.5F, -3.5F);

        gunModel[572].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.5F, 2F, 0F, -1.5F); // Import Box785
        gunModel[572].setRotationPoint(76F, -20F, 4F);

        gunModel[573].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0.25F, 0F, 0F, 0.25F, 0F, 2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, 2F, -0.5F, 1.5F); // Import Box786
        gunModel[573].setRotationPoint(76F, -20F, -5F);

        gunModel[574].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.625F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, -0.5F, -1.25F, -0.75F, -0.5F, -1.25F); // Import Box787
        gunModel[574].setRotationPoint(75F, -20.5F, -3.5F);

        gunModel[575].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -1.125F, -0.5F, -0.5F, -1.125F, -0.5F, 0F, 1.075F, 0F, 0F, 1.075F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F); // Import Box788
        gunModel[575].setRotationPoint(69F, -19F, -5F);

        gunModel[576].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1.075F, -0.5F, 0F, 1.075F, -0.5F, -0.5F, -1.125F, 0F, -0.5F, -1.125F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Box789
        gunModel[576].setRotationPoint(69F, -19F, 4F);

        gunModel[577].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -2F, -0.5F, 1.5F, 2F, -0.5F, 1.5F, 2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box790
        gunModel[577].setRotationPoint(61F, -26F, 4F);

        gunModel[578].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, 1.075F, 0F, 0F, 1.075F, 0F, -0.5F, -1.125F, -0.5F, -0.5F, -1.125F); // Import Box791
        gunModel[578].setRotationPoint(62F, -26F, 4F);

        gunModel[579].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -1.25F, -0.75F, -0.5F, -1.25F, -0.625F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F); // Import Box792
        gunModel[579].setRotationPoint(56F, -24.5F, 2.5F);

        gunModel[580].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -2F, 0F, -1.5F, 2F, 0F, -1.5F, 2F, -0.5F, 1.5F, -2F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box793
        gunModel[580].setRotationPoint(61F, -26F, -5F);

        gunModel[581].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, -0.5F, -0.5F, -1.125F, 0F, -0.5F, -1.125F, 0F, 0F, 1.075F, -0.5F, 0F, 1.075F); // Import Box794
        gunModel[581].setRotationPoint(62F, -26F, -5F);

        gunModel[582].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1.125F, -0.625F, 0F, 1.125F, -0.75F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Box795
        gunModel[582].setRotationPoint(56F, -24.5F, -3.5F);

        gunModel[583].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -2F, -0.5F, 1.5F, 2F, -0.5F, 1.5F, 2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box801
        gunModel[583].setRotationPoint(67F, -26F, 4F);

        gunModel[584].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, 1.075F, 0F, 0F, 1.075F, 0F, -0.5F, -1.125F, -0.5F, -0.5F, -1.125F); // Import Box802
        gunModel[584].setRotationPoint(68F, -26F, 4F);

        gunModel[585].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -1.25F, -0.75F, -0.5F, -1.25F, -0.625F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F); // Import Box803
        gunModel[585].setRotationPoint(62F, -24.5F, 2.5F);

        gunModel[586].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -2F, 0F, -1.5F, 2F, 0F, -1.5F, 2F, -0.5F, 1.5F, -2F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box804
        gunModel[586].setRotationPoint(67F, -26F, -5F);

        gunModel[587].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, -0.5F, -0.5F, -1.125F, 0F, -0.5F, -1.125F, 0F, 0F, 1.075F, -0.5F, 0F, 1.075F); // Import Box805
        gunModel[587].setRotationPoint(68F, -26F, -5F);

        gunModel[588].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1.125F, -0.625F, 0F, 1.125F, -0.75F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Box806
        gunModel[588].setRotationPoint(62F, -24.5F, -3.5F);

        gunModel[589].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -2F, -0.5F, 1.5F, 2F, -0.5F, 1.5F, 2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box812
        gunModel[589].setRotationPoint(73F, -26F, 4F);

        gunModel[590].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, 1.075F, 0F, 0F, 1.075F, 0F, -0.5F, -1.125F, -0.5F, -0.5F, -1.125F); // Import Box813
        gunModel[590].setRotationPoint(74F, -26F, 4F);

        gunModel[591].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -1.25F, -0.75F, -0.5F, -1.25F, -0.625F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F); // Import Box814
        gunModel[591].setRotationPoint(68F, -24.5F, 2.5F);

        gunModel[592].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -2F, 0F, -1.5F, 2F, 0F, -1.5F, 2F, -0.5F, 1.5F, -2F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box815
        gunModel[592].setRotationPoint(73F, -26F, -5F);

        gunModel[593].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, -0.5F, -0.5F, -1.125F, 0F, -0.5F, -1.125F, 0F, 0F, 1.075F, -0.5F, 0F, 1.075F); // Import Box816
        gunModel[593].setRotationPoint(74F, -26F, -5F);

        gunModel[594].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1.125F, -0.625F, 0F, 1.125F, -0.75F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Box817
        gunModel[594].setRotationPoint(68F, -24.5F, -3.5F);

        gunModel[595].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -2F, -0.5F, 1.5F, 2F, -0.5F, 1.5F, 2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box823
        gunModel[595].setRotationPoint(79F, -26F, 4F);

        gunModel[596].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, 1.075F, 0F, 0F, 1.075F, 0F, -0.5F, -1.125F, -0.5F, -0.5F, -1.125F); // Import Box824
        gunModel[596].setRotationPoint(80F, -26F, 4F);

        gunModel[597].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -1.25F, -0.75F, -0.5F, -1.25F, -0.625F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F); // Import Box825
        gunModel[597].setRotationPoint(74F, -24.5F, 2.5F);

        gunModel[598].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -2F, 0F, -1.5F, 2F, 0F, -1.5F, 2F, -0.5F, 1.5F, -2F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box826
        gunModel[598].setRotationPoint(79F, -26F, -5F);

        gunModel[599].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, -0.5F, -0.5F, -1.125F, 0F, -0.5F, -1.125F, 0F, 0F, 1.075F, -0.5F, 0F, 1.075F); // Import Box827
        gunModel[599].setRotationPoint(80F, -26F, -5F);

        gunModel[600].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1.125F, -0.625F, 0F, 1.125F, -0.75F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Box828
        gunModel[600].setRotationPoint(74F, -24.5F, -3.5F);

        gunModel[601].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, -0.75F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, 1.125F, -0.625F, 0F, 1.125F); // Import Box829
        gunModel[601].setRotationPoint(57F, -20.5F, 2.5F);

        gunModel[602].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, -0.75F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, 1.125F, -0.625F, 0F, 1.125F); // Import Box830
        gunModel[602].setRotationPoint(63F, -20.5F, 2.5F);

        gunModel[603].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, -0.75F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, 1.125F, -0.625F, 0F, 1.125F); // Import Box831
        gunModel[603].setRotationPoint(69F, -20.5F, 2.5F);

        gunModel[604].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, -0.75F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, 1.125F, -0.625F, 0F, 1.125F); // Import Box832
        gunModel[604].setRotationPoint(75F, -20.5F, 2.5F);

        gunModel[605].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box844
        gunModel[605].setRotationPoint(29F, -22.5F, 1.5F);

        gunModel[606].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box457
        gunModel[606].setRotationPoint(12F, -26F, -2F);

        gunModel[607].addShapeBox(0F, 0F, 0F, 21, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box458
        gunModel[607].setRotationPoint(12F, -27F, -2F);

        gunModel[608].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box459
        gunModel[608].setRotationPoint(12F, -27F, -2F);

        gunModel[609].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Import Box460
        gunModel[609].setRotationPoint(32F, -26F, -2F);

        gunModel[610].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box833
        gunModel[610].setRotationPoint(14F, -27F, -2F);

        gunModel[611].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box834
        gunModel[611].setRotationPoint(18F, -27F, -2F);

        gunModel[612].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box835
        gunModel[612].setRotationPoint(16F, -27F, -2F);

        gunModel[613].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box836
        gunModel[613].setRotationPoint(22F, -27F, -2F);

        gunModel[614].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box837
        gunModel[614].setRotationPoint(20F, -27F, -2F);

        gunModel[615].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box838
        gunModel[615].setRotationPoint(26F, -27F, -2F);

        gunModel[616].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box839
        gunModel[616].setRotationPoint(24F, -27F, -2F);

        gunModel[617].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box840
        gunModel[617].setRotationPoint(30F, -27F, -2F);

        gunModel[618].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box841
        gunModel[618].setRotationPoint(28F, -27F, -2F);

        gunModel[619].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box842
        gunModel[619].setRotationPoint(32F, -27F, -2F);

        gunModel[620].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box102
        gunModel[620].setRotationPoint(33.5F, -23.5F, -2F);

        gunModel[621].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box103
        gunModel[621].setRotationPoint(33.5F, -24.5F, -2F);

        gunModel[622].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box104
        gunModel[622].setRotationPoint(33.5F, -25.5F, -1.5F);

        gunModel[623].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Import Box105
        gunModel[623].setRotationPoint(33.5F, -21.5F, -1.5F);

        gunModel[624].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box106
        gunModel[624].setRotationPoint(33.5F, -22.5F, -2F);

        gunModel[625].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F, 0F, 0F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0.5F); // Import Box110
        gunModel[625].setRotationPoint(43.5F, -23.5F, -1.5F);

        gunModel[626].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F, 0F, 0.25F, 0F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, 0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.25F, 0.5F); // Import Box112
        gunModel[626].setRotationPoint(43.5F, -24.25F, -1.5F);

        gunModel[627].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F, 0F, 0.25F, -1F, 0F, -0.25F, -1.125F, 0F, -0.25F, -1.125F, 0F, 0.25F, -1F, 0F, -0.75F, 0F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.75F, 0F); // Import Box113
        gunModel[627].setRotationPoint(43.5F, -24.75F, -1.5F);

        gunModel[628].addShapeBox(0F, 0F, 0F, 66, 1, 3, 0F, 0F, -0.25F, -1.125F, 0F, -0.25F, -1.125F, 0F, -0.25F, -1.125F, 0F, -0.25F, -1.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Import Box114
        gunModel[628].setRotationPoint(57.5F, -24.75F, -1.5F);

        gunModel[629].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.125F, -0.375F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, 0F, -0.125F, -0.375F, 0F, -0.125F, 0F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, 0F); // Import Box115
        gunModel[629].setRotationPoint(57.5F, -24.25F, -1.5F);

        gunModel[630].addShapeBox(0F, 0F, 0F, 66, 1, 3, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Import Box116
        gunModel[630].setRotationPoint(57.5F, -23.5F, -1.5F);

        gunModel[631].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F, 0F, -0.75F, 0F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.75F, 0F, 0F, 0.25F, -1F, 0F, -0.25F, -1.125F, 0F, -0.25F, -1.125F, 0F, 0.25F, -1F); // Import Box117
        gunModel[631].setRotationPoint(43.5F, -22.25F, -1.5F);

        gunModel[632].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F, 0F, -0.25F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.25F, 0.5F, 0F, 0.25F, 0F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, 0.25F, 0F); // Import Box118
        gunModel[632].setRotationPoint(43.5F, -22.75F, -1.5F);

        gunModel[633].addShapeBox(0F, 0F, 0F, 66, 1, 3, 0F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.25F, -1.125F, 0F, -0.25F, -1.125F, 0F, -0.25F, -1.125F, 0F, -0.25F, -1.125F); // Import Box120
        gunModel[633].setRotationPoint(57.5F, -22.25F, -1.5F);

        gunModel[634].addShapeBox(0F, 0F, 0F, 66, 1, 3, 0F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Import Box123
        gunModel[634].setRotationPoint(57.5F, -24.25F, -1.5F);

        gunModel[635].addShapeBox(0F, 0F, 0F, 66, 1, 3, 0F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Import Box124
        gunModel[635].setRotationPoint(57.5F, -24.25F, -1.5F);

        gunModel[636].addShapeBox(0F, 0F, 0F, 58, 1, 3, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Import Box125
        gunModel[636].setRotationPoint(58F, -24.25F, -1.5F);

        gunModel[637].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, -0.125F, -0.5F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.125F, -0.125F); // Import Box126
        gunModel[637].setRotationPoint(115.5F, -24.25F, -1.5F);

        gunModel[638].addShapeBox(0F, 0F, 0F, 58, 1, 3, 0F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F); // Import Box127
        gunModel[638].setRotationPoint(58F, -22.75F, -1.5F);

        gunModel[639].addShapeBox(0F, 0F, 0F, 66, 1, 3, 0F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F); // Import Box128
        gunModel[639].setRotationPoint(57.5F, -22.75F, -1.5F);

        gunModel[640].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.125F, 0F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, 0F, 0F, -0.125F, -0.375F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, 0F, -0.125F, -0.375F); // Import Box129
        gunModel[640].setRotationPoint(57.5F, -22.75F, -1.5F);

        gunModel[641].addShapeBox(0F, 0F, 0F, 66, 1, 3, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F); // Import Box130
        gunModel[641].setRotationPoint(57.5F, -22.75F, -1.5F);

        gunModel[642].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.5F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, -0.5F, -0.125F, -0.5F); // Import Box131
        gunModel[642].setRotationPoint(115.5F, -22.75F, -1.5F);

        gunModel[643].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Import Box132
        gunModel[643].setRotationPoint(116.5F, -24.25F, -1.5F);

        gunModel[644].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F); // Import Box133
        gunModel[644].setRotationPoint(116.5F, -22.75F, -1.5F);

        gunModel[645].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box418
        gunModel[645].setRotationPoint(41.5F, -22F, 4F);

        gunModel[646].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box418
        gunModel[646].setRotationPoint(47.5F, -22F, 4F);

        gunModel[647].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box418
        gunModel[647].setRotationPoint(53.5F, -22F, 4F);

        gunModel[648].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box418
        gunModel[648].setRotationPoint(59.5F, -22F, 4F);

        gunModel[649].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box418
        gunModel[649].setRotationPoint(65.5F, -22F, 4F);

        gunModel[650].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box418
        gunModel[650].setRotationPoint(71.5F, -22F, 4F);

        gunModel[651].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box418
        gunModel[651].setRotationPoint(76.5F, -22F, 4F);
    }

    private void initdefaultBarrelModel_1() {
        defaultBarrelModel[0] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Import Box134
        defaultBarrelModel[1] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Import Box135
        defaultBarrelModel[2] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Import Box136
        defaultBarrelModel[3] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Import Box137
        defaultBarrelModel[4] = new ModelRendererTurbo(this, 145, 185, textureX, textureY); // Import Box138
        defaultBarrelModel[5] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Import Box139
        defaultBarrelModel[6] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Import Box140
        defaultBarrelModel[7] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Import Box141
        defaultBarrelModel[8] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Import Box142
        defaultBarrelModel[9] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Import Box143
        defaultBarrelModel[10] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // Import Box148
        defaultBarrelModel[11] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Import Box149
        defaultBarrelModel[12] = new ModelRendererTurbo(this, 289, 185, textureX, textureY); // Import Box150
        defaultBarrelModel[13] = new ModelRendererTurbo(this, 305, 185, textureX, textureY); // Import Box152
        defaultBarrelModel[14] = new ModelRendererTurbo(this, 321, 185, textureX, textureY); // Import Box153
        defaultBarrelModel[15] = new ModelRendererTurbo(this, 337, 185, textureX, textureY); // Import Box154
        defaultBarrelModel[16] = new ModelRendererTurbo(this, 353, 185, textureX, textureY); // Import Box165
        defaultBarrelModel[17] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Import Box166
        defaultBarrelModel[18] = new ModelRendererTurbo(this, 385, 185, textureX, textureY); // Import Box167
        defaultBarrelModel[19] = new ModelRendererTurbo(this, 401, 185, textureX, textureY); // Import Box168
        defaultBarrelModel[20] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Import Box169
        defaultBarrelModel[21] = new ModelRendererTurbo(this, 433, 185, textureX, textureY); // Import Box170
        defaultBarrelModel[22] = new ModelRendererTurbo(this, 449, 185, textureX, textureY); // Import Box171
        defaultBarrelModel[23] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Import Box558
        defaultBarrelModel[24] = new ModelRendererTurbo(this, 481, 185, textureX, textureY); // Import Box559
        defaultBarrelModel[25] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Import Box560
        defaultBarrelModel[26] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Import Box561
        defaultBarrelModel[27] = new ModelRendererTurbo(this, 17, 193, textureX, textureY); // Import Box562
        defaultBarrelModel[28] = new ModelRendererTurbo(this, 33, 193, textureX, textureY); // Import Box563
        defaultBarrelModel[29] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Import Box564
        defaultBarrelModel[30] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Import Box565
        defaultBarrelModel[31] = new ModelRendererTurbo(this, 81, 193, textureX, textureY); // Import Box566
        defaultBarrelModel[32] = new ModelRendererTurbo(this, 97, 193, textureX, textureY); // Import Box567

        defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box134
        defaultBarrelModel[0].setRotationPoint(123.5F, -23.5F, -2F);

        defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box135
        defaultBarrelModel[1].setRotationPoint(123.5F, -24.5F, -2F);

        defaultBarrelModel[2].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F, 0F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, 0F, -0.5F, -1F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F); // Import Box136
        defaultBarrelModel[2].setRotationPoint(125.5F, -25.5F, -1.5F);

        defaultBarrelModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box137
        defaultBarrelModel[3].setRotationPoint(123.5F, -22.5F, -2F);

        defaultBarrelModel[4].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, 0F, -0.5F, -1F); // Import Box138
        defaultBarrelModel[4].setRotationPoint(123.5F, -21.5F, -1.5F);

        defaultBarrelModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F); // Import Box139
        defaultBarrelModel[5].setRotationPoint(122.5F, -23.5F, -2F);

        defaultBarrelModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, -0.125F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.125F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F); // Import Box140
        defaultBarrelModel[6].setRotationPoint(122.5F, -24.5F, -2F);

        defaultBarrelModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, -0.75F, -1F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -1F, -0.5F, 0.125F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.125F, -0.25F); // Import Box141
        defaultBarrelModel[7].setRotationPoint(122.5F, -25.5F, -1.5F);

        defaultBarrelModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, 0.125F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.125F, -0.25F, -0.5F, -0.75F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, -0.75F, -1F); // Import Box142
        defaultBarrelModel[8].setRotationPoint(122.5F, -21.5F, -1.5F);

        defaultBarrelModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, -0.125F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.125F, -0.75F); // Import Box143
        defaultBarrelModel[9].setRotationPoint(122.5F, -22.5F, -2F);

        defaultBarrelModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box148
        defaultBarrelModel[10].setRotationPoint(127.5F, -24.5F, -2F);

        defaultBarrelModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box149
        defaultBarrelModel[11].setRotationPoint(127.5F, -23.5F, -2F);

        defaultBarrelModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Import Box150
        defaultBarrelModel[12].setRotationPoint(127.5F, -22.5F, -2F);

        defaultBarrelModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box152
        defaultBarrelModel[13].setRotationPoint(123.5F, -25.5F, -1.5F);

        defaultBarrelModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F); // Import Box153
        defaultBarrelModel[14].setRotationPoint(127.5F, -24.5F, -2F);

        defaultBarrelModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box154
        defaultBarrelModel[15].setRotationPoint(127.5F, -22.5F, -2F);

        defaultBarrelModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box165
        defaultBarrelModel[16].setRotationPoint(133.5F, -22.5F, -2F);

        defaultBarrelModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Import Box166
        defaultBarrelModel[17].setRotationPoint(133.5F, -22.5F, -2F);

        defaultBarrelModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box167
        defaultBarrelModel[18].setRotationPoint(133.5F, -23.5F, -2F);

        defaultBarrelModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box168
        defaultBarrelModel[19].setRotationPoint(133.5F, -24.5F, -2F);

        defaultBarrelModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F); // Import Box169
        defaultBarrelModel[20].setRotationPoint(133.5F, -24.5F, -2F);

        defaultBarrelModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F); // Import Box170
        defaultBarrelModel[21].setRotationPoint(125.75F, -24.5F, -2F);

        defaultBarrelModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Import Box171
        defaultBarrelModel[22].setRotationPoint(125.75F, -22.5F, -2F);

        defaultBarrelModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F); // Import Box558
        defaultBarrelModel[23].setRotationPoint(129.5F, -24.5F, -2F);

        defaultBarrelModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box559
        defaultBarrelModel[24].setRotationPoint(129.5F, -22.5F, -2F);

        defaultBarrelModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F); // Import Box560
        defaultBarrelModel[25].setRotationPoint(131.5F, -24.5F, -2F);

        defaultBarrelModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box561
        defaultBarrelModel[26].setRotationPoint(131.5F, -22.5F, -2F);

        defaultBarrelModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box562
        defaultBarrelModel[27].setRotationPoint(129.5F, -24.5F, -2F);

        defaultBarrelModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box563
        defaultBarrelModel[28].setRotationPoint(129.5F, -23.5F, -2F);

        defaultBarrelModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Import Box564
        defaultBarrelModel[29].setRotationPoint(129.5F, -22.5F, -2F);

        defaultBarrelModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box565
        defaultBarrelModel[30].setRotationPoint(131.5F, -24.5F, -2F);

        defaultBarrelModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box566
        defaultBarrelModel[31].setRotationPoint(131.5F, -23.5F, -2F);

        defaultBarrelModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Import Box567
        defaultBarrelModel[32].setRotationPoint(131.5F, -22.5F, -2F);
    }

    private void initammoModel_1() {
        ammoModel[0] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Import Box472
        ammoModel[1] = new ModelRendererTurbo(this, 433, 193, textureX, textureY); // Import Box473
        ammoModel[2] = new ModelRendererTurbo(this, 473, 193, textureX, textureY); // Import Box474
        ammoModel[3] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Import Box475
        ammoModel[4] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Import Box476
        ammoModel[5] = new ModelRendererTurbo(this, 489, 193, textureX, textureY); // Import Box477
        ammoModel[6] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Import Box478
        ammoModel[7] = new ModelRendererTurbo(this, 17, 201, textureX, textureY); // Import Box479
        ammoModel[8] = new ModelRendererTurbo(this, 49, 201, textureX, textureY); // Import Box480
        ammoModel[9] = new ModelRendererTurbo(this, 417, 201, textureX, textureY); // Import Box481
        ammoModel[10] = new ModelRendererTurbo(this, 505, 161, textureX, textureY); // Import Box482
        ammoModel[11] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Import Box483
        ammoModel[12] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Import Box484
        ammoModel[13] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Import Box485
        ammoModel[14] = new ModelRendererTurbo(this, 505, 193, textureX, textureY); // Import Box486
        ammoModel[15] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Import Box487
        ammoModel[16] = new ModelRendererTurbo(this, 449, 201, textureX, textureY); // Import Box488
        ammoModel[17] = new ModelRendererTurbo(this, 153, 193, textureX, textureY); // Import Box489
        ammoModel[18] = new ModelRendererTurbo(this, 241, 193, textureX, textureY); // Import Box490
        ammoModel[19] = new ModelRendererTurbo(this, 17, 209, textureX, textureY); // Import Box491
        ammoModel[20] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Import Box492
        ammoModel[21] = new ModelRendererTurbo(this, 97, 209, textureX, textureY); // Import Box493
        ammoModel[22] = new ModelRendererTurbo(this, 129, 209, textureX, textureY); // Import Box494
        ammoModel[23] = new ModelRendererTurbo(this, 161, 209, textureX, textureY); // Import Box495
        ammoModel[24] = new ModelRendererTurbo(this, 217, 201, textureX, textureY); // Import Box496
        ammoModel[25] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Import Box497
        ammoModel[26] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Import Box498
        ammoModel[27] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Import Box499
        ammoModel[28] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Import Box500
        ammoModel[29] = new ModelRendererTurbo(this, 193, 209, textureX, textureY); // Import Box501
        ammoModel[30] = new ModelRendererTurbo(this, 225, 209, textureX, textureY); // Import Box502
        ammoModel[31] = new ModelRendererTurbo(this, 449, 265, textureX, textureY); // Import Box499
        ammoModel[32] = new ModelRendererTurbo(this, 465, 265, textureX, textureY); // Import Box499
        ammoModel[33] = new ModelRendererTurbo(this, 481, 265, textureX, textureY); // Import Box499
        ammoModel[34] = new ModelRendererTurbo(this, 497, 265, textureX, textureY); // Import Box499
        ammoModel[35] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Import Box499
        ammoModel[36] = new ModelRendererTurbo(this, 9, 273, textureX, textureY); // Import Box499
        ammoModel[37] = new ModelRendererTurbo(this, 17, 273, textureX, textureY); // Import Box499
        ammoModel[38] = new ModelRendererTurbo(this, 25, 273, textureX, textureY); // Import Box499
        ammoModel[39] = new ModelRendererTurbo(this, 33, 273, textureX, textureY); // Import Box499
        ammoModel[40] = new ModelRendererTurbo(this, 41, 273, textureX, textureY); // Import Box499
        ammoModel[41] = new ModelRendererTurbo(this, 49, 273, textureX, textureY); // Import Box499
        ammoModel[42] = new ModelRendererTurbo(this, 57, 273, textureX, textureY); // Import Box499

        ammoModel[0].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box472
        ammoModel[0].setRotationPoint(13F, -8.5F, 1F);

        ammoModel[1].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box473
        ammoModel[1].setRotationPoint(13F, -5.5F, -2.5F);

        ammoModel[2].addShapeBox(0F, 0F, 0F, 1, 11, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box474
        ammoModel[2].setRotationPoint(12F, -16.5F, -2F);

        ammoModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box475
        ammoModel[3].setRotationPoint(12F, -5.5F, -2.5F);

        ammoModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import Box476
        ammoModel[4].setRotationPoint(25F, -6.5F, -2.5F);

        ammoModel[5].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import Box477
        ammoModel[5].setRotationPoint(25F, -16.5F, -2F);

        ammoModel[6].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box478
        ammoModel[6].setRotationPoint(19F, -17.5F, 0.5F);

        ammoModel[7].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box479
        ammoModel[7].setRotationPoint(13F, -11.5F, 1F);

        ammoModel[8].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box480
        ammoModel[8].setRotationPoint(13F, -14.5F, 1F);

        ammoModel[9].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box481
        ammoModel[9].setRotationPoint(13F, -17.5F, 1F);

        ammoModel[10].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box482
        ammoModel[10].setRotationPoint(18F, -16.5F, 1F);

        ammoModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box483
        ammoModel[11].setRotationPoint(18F, -16.5F, 1F);

        ammoModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box484
        ammoModel[12].setRotationPoint(18F, -15.5F, 1F);

        ammoModel[13].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box485
        ammoModel[13].setRotationPoint(13F, -16.5F, 1F);

        ammoModel[14].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box486
        ammoModel[14].setRotationPoint(23F, -17.5F, 1F);

        ammoModel[15].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box487
        ammoModel[15].setRotationPoint(20F, -17.5F, 1F);

        ammoModel[16].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box488
        ammoModel[16].setRotationPoint(13F, -17.5F, 0.5F);

        ammoModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box489
        ammoModel[17].setRotationPoint(12F, -17.5F, -2F);

        ammoModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import Box490
        ammoModel[18].setRotationPoint(25F, -17.5F, -2F);

        ammoModel[19].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box491
        ammoModel[19].setRotationPoint(13F, -8.5F, -2F);

        ammoModel[20].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F); // Import Box492
        ammoModel[20].setRotationPoint(19F, -17.5F, -1.5F);

        ammoModel[21].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box493
        ammoModel[21].setRotationPoint(13F, -11.5F, -2F);

        ammoModel[22].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box494
        ammoModel[22].setRotationPoint(13F, -14.5F, -2F);

        ammoModel[23].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box495
        ammoModel[23].setRotationPoint(13F, -17.5F, -2F);

        ammoModel[24].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box496
        ammoModel[24].setRotationPoint(18F, -16.5F, -2F);

        ammoModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box497
        ammoModel[25].setRotationPoint(18F, -16.5F, -2F);

        ammoModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box498
        ammoModel[26].setRotationPoint(18F, -15.5F, -2F);

        ammoModel[27].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box499
        ammoModel[27].setRotationPoint(13F, -16.5F, -2F);

        ammoModel[28].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box500
        ammoModel[28].setRotationPoint(23F, -17.5F, -2F);

        ammoModel[29].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box501
        ammoModel[29].setRotationPoint(20F, -17.5F, -2F);

        ammoModel[30].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F); // Import Box502
        ammoModel[30].setRotationPoint(13F, -17.5F, -1.5F);

        ammoModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Import Box499
        ammoModel[31].setRotationPoint(13F, -16.5F, -2F);

        ammoModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box499
        ammoModel[32].setRotationPoint(13F, -15.5F, -2F);

        ammoModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Import Box499
        ammoModel[33].setRotationPoint(13F, -10.5F, -2F);

        ammoModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box499
        ammoModel[34].setRotationPoint(13F, -9.5F, -2F);

        ammoModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Import Box499
        ammoModel[35].setRotationPoint(13F, -13.5F, -2F);

        ammoModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box499
        ammoModel[36].setRotationPoint(13F, -12.5F, -2F);

        ammoModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Import Box499
        ammoModel[37].setRotationPoint(13F, -16.5F, 1F);

        ammoModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box499
        ammoModel[38].setRotationPoint(13F, -15.5F, 1F);

        ammoModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Import Box499
        ammoModel[39].setRotationPoint(13F, -10.5F, 1F);

        ammoModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box499
        ammoModel[40].setRotationPoint(13F, -9.5F, 1F);

        ammoModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Import Box499
        ammoModel[41].setRotationPoint(13F, -13.5F, 1F);

        ammoModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box499
        ammoModel[42].setRotationPoint(13F, -12.5F, 1F);
    }

    private void initpumpModel_1() {
        pumpModel[0] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box37
        pumpModel[1] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box38
        pumpModel[2] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Import Box39
        pumpModel[3] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Import Box69
        pumpModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box70
        pumpModel[5] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box72
        pumpModel[6] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box75
        pumpModel[7] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box76
        pumpModel[8] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Import Box81
        pumpModel[9] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box269
        pumpModel[10] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Import Box271
        pumpModel[11] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Import Box272
        pumpModel[12] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Import Box273
        pumpModel[13] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Import Box274
        pumpModel[14] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Import Box275
        pumpModel[15] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Import Box276
        pumpModel[16] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Import Box277
        pumpModel[17] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Import Box278
        pumpModel[18] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Import Box279
        pumpModel[19] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Import Box280
        pumpModel[20] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Import Box281
        pumpModel[21] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Import Box282
        pumpModel[22] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Import Box283
        pumpModel[23] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Import Box284
        pumpModel[24] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import Box285
        pumpModel[25] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Import Box286
        pumpModel[26] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Import Box287
        pumpModel[27] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Import Box292
        pumpModel[28] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Import Box293
        pumpModel[29] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import Box294
        pumpModel[30] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Import Box295
        pumpModel[31] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Import Box296
        pumpModel[32] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Import Box297
        pumpModel[33] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Import Box298
        pumpModel[34] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Import Box299
        pumpModel[35] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Import Box300
        pumpModel[36] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Import Box301
        pumpModel[37] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Import Box302
        pumpModel[38] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Import Box303
        pumpModel[39] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Import Box304
        pumpModel[40] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Import Box305
        pumpModel[41] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Import Box306
        pumpModel[42] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Import Box307
        pumpModel[43] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Import Box308
        pumpModel[44] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Import Box383
        pumpModel[45] = new ModelRendererTurbo(this, 145, 273, textureX, textureY); // Import Box384
        pumpModel[46] = new ModelRendererTurbo(this, 153, 273, textureX, textureY); // Import Box385
        pumpModel[47] = new ModelRendererTurbo(this, 161, 273, textureX, textureY); // Import Box383
        pumpModel[48] = new ModelRendererTurbo(this, 169, 273, textureX, textureY); // Import Box384
        pumpModel[49] = new ModelRendererTurbo(this, 177, 273, textureX, textureY); // Import Box385
        pumpModel[50] = new ModelRendererTurbo(this, 185, 273, textureX, textureY); // Import Box383
        pumpModel[51] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Import Box384
        pumpModel[52] = new ModelRendererTurbo(this, 201, 273, textureX, textureY); // Import Box385

        pumpModel[0].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box37
        pumpModel[0].setRotationPoint(9F, -23.5F, -2F);

        pumpModel[1].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box38
        pumpModel[1].setRotationPoint(9F, -24.5F, -2F);

        pumpModel[2].addShapeBox(0F, 0F, 0F, 18, 1, 3, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box39
        pumpModel[2].setRotationPoint(9F, -25.5F, -1.5F);

        pumpModel[3].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box69
        pumpModel[3].setRotationPoint(9F, -22.5F, -2F);

        pumpModel[4].addShapeBox(0F, 0F, 0F, 18, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Import Box70
        pumpModel[4].setRotationPoint(9F, -21.5F, -1.5F);

        pumpModel[5].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box72
        pumpModel[5].setRotationPoint(5F, -24F, -1.5F);

        pumpModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box75
        pumpModel[6].setRotationPoint(7F, -25F, -1.5F);

        pumpModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box76
        pumpModel[7].setRotationPoint(5F, -22F, -0.5F);

        pumpModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box81
        pumpModel[8].setRotationPoint(5F, -25F, -0.5F);

        pumpModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box269
        pumpModel[9].setRotationPoint(9F, -23.5F, -2.5F);

        pumpModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box271
        pumpModel[10].setRotationPoint(9F, -24.5F, -2.5F);

        pumpModel[11].addShapeBox(0F, -0.5F, -2F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box272
        pumpModel[11].setRotationPoint(9F, -22.5F, -1.5F);
        pumpModel[11].rotateAngleX = 0.85521133F;

        pumpModel[12].addShapeBox(0F, -0.5F, -4F, 2, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box273
        pumpModel[12].setRotationPoint(9F, -22.5F, -1.5F);
        pumpModel[12].rotateAngleX = 0.85521133F;

        pumpModel[13].addShapeBox(0.5F, -0.5F, -6F, 1, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box274
        pumpModel[13].setRotationPoint(9F, -22.5F, -1.5F);
        pumpModel[13].rotateAngleX = 0.85521133F;

        pumpModel[14].addShapeBox(0.5F, -1F, -6F, 1, 1, 2, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box275
        pumpModel[14].setRotationPoint(9F, -22.5F, -1.5F);
        pumpModel[14].rotateAngleX = 0.85521133F;

        pumpModel[15].addShapeBox(0.5F, 0F, -6F, 1, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box276
        pumpModel[15].setRotationPoint(9F, -22.5F, -1.5F);
        pumpModel[15].rotateAngleX = 0.85521133F;

        pumpModel[16].addShapeBox(0F, -1F, -4F, 2, 1, 2, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box277
        pumpModel[16].setRotationPoint(9F, -22.5F, -1.5F);
        pumpModel[16].rotateAngleX = 0.85521133F;

        pumpModel[17].addShapeBox(0F, 0F, -4F, 2, 1, 2, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box278
        pumpModel[17].setRotationPoint(9F, -22.5F, -1.5F);
        pumpModel[17].rotateAngleX = 0.85521133F;

        pumpModel[18].addShapeBox(0.5F, -0.5F, -9F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box279
        pumpModel[18].setRotationPoint(9F, -22.5F, -1.5F);
        pumpModel[18].rotateAngleX = 0.85521133F;

        pumpModel[19].addShapeBox(0.5F, -1.5F, -9F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box280
        pumpModel[19].setRotationPoint(9F, -22.5F, -1.5F);
        pumpModel[19].rotateAngleX = 0.85521133F;

        pumpModel[20].addShapeBox(1.5F, -1.5F, -9F, 1, 1, 3, 0F, 0F, 0F, -1F, -0.99F, 0F, -1F, -0.99F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box281
        pumpModel[20].setRotationPoint(9F, -22.5F, -1.5F);
        pumpModel[20].rotateAngleX = 0.85521133F;

        pumpModel[21].addShapeBox(1.5F, -0.5F, -9F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box282
        pumpModel[21].setRotationPoint(9F, -22.5F, -1.5F);
        pumpModel[21].rotateAngleX = 0.85521133F;

        pumpModel[22].addShapeBox(-0.5F, -1.5F, -9F, 1, 1, 3, 0F, -0.99F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.99F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box283
        pumpModel[22].setRotationPoint(9F, -22.5F, -1.5F);
        pumpModel[22].rotateAngleX = 0.85521133F;

        pumpModel[23].addShapeBox(-0.5F, -0.5F, -9F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box284
        pumpModel[23].setRotationPoint(9F, -22.5F, -1.5F);
        pumpModel[23].rotateAngleX = 0.85521133F;

        pumpModel[24].addShapeBox(0.5F, 0.5F, -9F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box285
        pumpModel[24].setRotationPoint(9F, -22.5F, -1.5F);
        pumpModel[24].rotateAngleX = 0.85521133F;

        pumpModel[25].addShapeBox(-0.5F, 0.5F, -9F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.99F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.99F, 0F, -1F); // Import Box286
        pumpModel[25].setRotationPoint(9F, -22.5F, -1.5F);
        pumpModel[25].rotateAngleX = 0.85521133F;

        pumpModel[26].addShapeBox(1.5F, 0.5F, -9F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -0.99F, 0F, -1F, -0.99F, 0F, -1F, 0F, 0F, -1F); // Import Box287
        pumpModel[26].setRotationPoint(9F, -22.5F, -1.5F);
        pumpModel[26].rotateAngleX = 0.85521133F;

        pumpModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box292
        pumpModel[27].setRotationPoint(6F, -25F, -1.5F);

        pumpModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F); // Import Box293
        pumpModel[28].setRotationPoint(5.5F, -25F, -1.5F);

        pumpModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F); // Import Box294
        pumpModel[29].setRotationPoint(6.5F, -25F, -1.5F);

        pumpModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F); // Import Box295
        pumpModel[30].setRotationPoint(7.5F, -24.5F, -3.5F);

        pumpModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box296
        pumpModel[31].setRotationPoint(7F, -24.5F, -3.5F);

        pumpModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F); // Import Box297
        pumpModel[32].setRotationPoint(6.5F, -24.5F, -3.5F);

        pumpModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1.25F, -0.5F, 0.25F, 1F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -1.25F, 0F, 0.25F, 1F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Import Box298
        pumpModel[33].setRotationPoint(6F, -25F, -2.5F);

        pumpModel[34].addShapeBox(-1F, 0F, -1F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F); // Import Box299
        pumpModel[34].setRotationPoint(6.75F, -25F, -1.5F);
        pumpModel[34].rotateAngleY = 0.61086524F;

        pumpModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box300
        pumpModel[35].setRotationPoint(5F, -24F, -1.5F);

        pumpModel[36].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Import Box301
        pumpModel[36].setRotationPoint(5F, -22F, -1.5F);

        pumpModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box302
        pumpModel[37].setRotationPoint(7F, -25F, 0.5F);

        pumpModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box303
        pumpModel[38].setRotationPoint(7F, -25F, -0.5F);

        pumpModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box304
        pumpModel[39].setRotationPoint(8F, -25F, -0.5F);

        pumpModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.5F); // Import Box305
        pumpModel[40].setRotationPoint(7.5F, -25F, -1F);

        pumpModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Import Box306
        pumpModel[41].setRotationPoint(7.5F, -25F, 0F);

        pumpModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box307
        pumpModel[42].setRotationPoint(7.5F, -25F, 0F);

        pumpModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, 0F, 0F, -0.25F); // Import Box308
        pumpModel[43].setRotationPoint(7.5F, -25F, -1F);

        pumpModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box383
        pumpModel[44].setRotationPoint(4F, -23.5F, -1F);

        pumpModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Import Box384
        pumpModel[45].setRotationPoint(4F, -24.5F, -1F);

        pumpModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Import Box385
        pumpModel[46].setRotationPoint(4F, -22.5F, -1F);

        pumpModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Import Box383
        pumpModel[47].setRotationPoint(4F, -23.5F, -1F);

        pumpModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F); // Import Box384
        pumpModel[48].setRotationPoint(4F, -24.5F, -1F);

        pumpModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F); // Import Box385
        pumpModel[49].setRotationPoint(4F, -22.5F, -1F);

        pumpModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.25F, -0.3F, -0.75F, -0.25F, -0.3F, -0.75F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, -0.75F, -0.25F, -0.3F, -0.75F, -0.25F, -0.3F, 0F, -0.25F, -0.3F); // Import Box383
        pumpModel[50].setRotationPoint(4.25F, -23.5F, -1F);

        pumpModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.8F, -0.75F, -0.75F, -0.8F, -0.75F, -0.75F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, 0F, 0.25F, -0.3F, -0.75F, 0.25F, -0.3F, -0.75F, 0.25F, -0.3F, 0F, 0.25F, -0.3F); // Import Box384
        pumpModel[51].setRotationPoint(4.25F, -24.5F, -1F);

        pumpModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0.25F, -0.3F, -0.75F, 0.25F, -0.3F, -0.75F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F, -0.8F, -0.75F, -0.75F, -0.8F, -0.75F, -0.75F, -0.8F, -0.75F, 0F, -0.8F, -0.75F); // Import Box385
        pumpModel[52].setRotationPoint(4.25F, -22.5F, -1F);
    }
}