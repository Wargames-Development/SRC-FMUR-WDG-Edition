//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MPX
// Model Creator: 
// Created on: 09.08.2023 - 20:36:27
// Last changed on: 09.08.2023 - 20:36:27

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelMPX extends ModelGun //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public ModelMPX() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[623];
        defaultBarrelModel = new ModelRendererTurbo[27];
        defaultScopeModel = new ModelRendererTurbo[109];
        defaultGripModel = new ModelRendererTurbo[8];
        ammoModel = new ModelRendererTurbo[10];
        slideModel = new ModelRendererTurbo[11];

        initgunModel_1();
        initgunModel_2();
        initdefaultBarrelModel_1();
        initdefaultScopeModel_1();
        initdefaultGripModel_1();
        initammoModel_1();
        initslideModel_1();

        barrelAttachPoint = new Vector3f(110.5F / 16F, 36F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(88F / 16F, 35F / 16F, -8.75F / 16F);
        scopeAttachPoint = new Vector3f(29F / 16F, 48F / 16F, 0F / 16F);
        gripAttachPoint = new Vector3f(82 / 16F, 26.5F / 16F, 0F / 16F);

        gunSlideDistance = 1.2F;
        animationType = EnumAnimationType.CUSTOM;
        rotateGunHorizontal = 15.0F;
        tiltGun = 30.0F;
        translateGun = new Vector3f(0.0F, -0.0625F, -0.1875F);
        translateClip = new Vector3f(0.0F, -0.625F, 0.0F);
        hasFlash = true;
        hasArms = true;
        leftArmPos = new Vector3f(0.05F, -0.4F, -0.05F);
        leftArmRot = new Vector3f(80.0F, 50.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.15F, -0.55F, -0.05F);
        leftArmReloadRot = new Vector3f(80.0F, 50.0F, 0.0F);
        rightArmPos = new Vector3f(0.21F, -0.55F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmReloadPos = new Vector3f(0.21F, -0.55F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
        rightHandAmmo = false;
        leftHandAmmo = true;
        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);
        casingAttachPoint = new Vector3f(1.0F, 1.8F, 0.0F);
        casingAnimDistance = new Vector3f(0.0F, 3.0F, 7.75F);
        casingAnimSpread = new Vector3f(3.0F, 5.0F, 3.0F);
        casingAnimTime = 6;
        casingRotateVector = new Vector3f(0.1F, 0.0F, 0.1F);
        caseScale = 0.2F;
        casingDelay = 0;
        thirdPersonOffset = new Vector3f(-0.06F, -0.08F, 0.0F);
        translateAll(-3.0F, 5.0F, 0.0F);
        zoomOffset = 0.3F;
        zoomOffsetY = -0.0725F;
        crouchZoom = -0.05F;
        gunOffset = 0.3F;
        flipAll();

        hasFlash = true;
        flashScale = 5F;
        muzzleFlashPoint = new Vector3f(
                barrelAttachPoint.x / flashScale,
                barrelAttachPoint.y / flashScale,
                barrelAttachPoint.z / flashScale
        );
    }

    private void initgunModel_1() {
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import
        gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import
        gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import
        gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import
        gunModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import
        gunModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import
        gunModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import
        gunModel[7] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import
        gunModel[8] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import
        gunModel[9] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import
        gunModel[10] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import
        gunModel[11] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import
        gunModel[12] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import
        gunModel[13] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import
        gunModel[14] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import
        gunModel[15] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import
        gunModel[16] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import
        gunModel[17] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import
        gunModel[18] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import
        gunModel[19] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import
        gunModel[20] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import
        gunModel[21] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import
        gunModel[22] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import
        gunModel[23] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import
        gunModel[24] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Import
        gunModel[25] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Import
        gunModel[26] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import
        gunModel[27] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Import
        gunModel[28] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import
        gunModel[29] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Import
        gunModel[30] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import
        gunModel[31] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Import
        gunModel[32] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Import
        gunModel[33] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import
        gunModel[34] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Import
        gunModel[35] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Import
        gunModel[36] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Import
        gunModel[37] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Import
        gunModel[38] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Import
        gunModel[39] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Import
        gunModel[40] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Import
        gunModel[41] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Import
        gunModel[42] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Import
        gunModel[43] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Import
        gunModel[44] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Import
        gunModel[45] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Import
        gunModel[46] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Import
        gunModel[47] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Import
        gunModel[48] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import
        gunModel[49] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Import
        gunModel[50] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import
        gunModel[51] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Import
        gunModel[52] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Import
        gunModel[53] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Import
        gunModel[54] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Import
        gunModel[55] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Import
        gunModel[56] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Import
        gunModel[57] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Import
        gunModel[58] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Import
        gunModel[59] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Import
        gunModel[60] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Import
        gunModel[61] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import
        gunModel[62] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Import
        gunModel[63] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Import
        gunModel[64] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Import
        gunModel[65] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Import
        gunModel[66] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Import
        gunModel[67] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Import
        gunModel[68] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Import
        gunModel[69] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Import
        gunModel[70] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import
        gunModel[71] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Import
        gunModel[72] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Import
        gunModel[73] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Import
        gunModel[74] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import
        gunModel[75] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import
        gunModel[76] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Import
        gunModel[77] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Import
        gunModel[78] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Import
        gunModel[79] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Import
        gunModel[80] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Import
        gunModel[81] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Import
        gunModel[82] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Import
        gunModel[83] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Import
        gunModel[84] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Import
        gunModel[85] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Import
        gunModel[86] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Import
        gunModel[87] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Import
        gunModel[88] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Import
        gunModel[89] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Import
        gunModel[90] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Import
        gunModel[91] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Import
        gunModel[92] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import
        gunModel[93] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Import
        gunModel[94] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Import
        gunModel[95] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Import
        gunModel[96] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Import
        gunModel[97] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Import
        gunModel[98] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import
        gunModel[99] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Import
        gunModel[100] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Import
        gunModel[101] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Import
        gunModel[102] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import
        gunModel[103] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Import
        gunModel[104] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Import
        gunModel[105] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Import
        gunModel[106] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Import
        gunModel[107] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Import
        gunModel[108] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Import
        gunModel[109] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import
        gunModel[110] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Import
        gunModel[111] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import
        gunModel[112] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import
        gunModel[113] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import
        gunModel[114] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import
        gunModel[115] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Import
        gunModel[116] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import
        gunModel[117] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import
        gunModel[118] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import
        gunModel[119] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import
        gunModel[120] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import
        gunModel[121] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import
        gunModel[122] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import
        gunModel[123] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import
        gunModel[124] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import
        gunModel[125] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import
        gunModel[126] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import
        gunModel[127] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import
        gunModel[128] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import
        gunModel[129] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import
        gunModel[130] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Import
        gunModel[131] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import
        gunModel[132] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import
        gunModel[133] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import
        gunModel[134] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import
        gunModel[135] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import
        gunModel[136] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import
        gunModel[137] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import
        gunModel[138] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Import
        gunModel[139] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Import
        gunModel[140] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import
        gunModel[141] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import
        gunModel[142] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Import
        gunModel[143] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import
        gunModel[144] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import
        gunModel[145] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Import
        gunModel[146] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Import
        gunModel[147] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import
        gunModel[148] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Import
        gunModel[149] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Import
        gunModel[150] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import
        gunModel[151] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import
        gunModel[152] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Import
        gunModel[153] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Import
        gunModel[154] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Import
        gunModel[155] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import
        gunModel[156] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Import
        gunModel[157] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Import
        gunModel[158] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Import
        gunModel[159] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Import
        gunModel[160] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Import
        gunModel[161] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Import
        gunModel[162] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Import
        gunModel[163] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Import
        gunModel[164] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Import
        gunModel[165] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Import
        gunModel[166] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Import
        gunModel[167] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Import
        gunModel[168] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Import
        gunModel[169] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Import
        gunModel[170] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Import
        gunModel[171] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import
        gunModel[172] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Import
        gunModel[173] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Import
        gunModel[174] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import
        gunModel[175] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Import
        gunModel[176] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Import
        gunModel[177] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Import
        gunModel[178] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Import
        gunModel[179] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Import
        gunModel[180] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Import
        gunModel[181] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Import
        gunModel[182] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Import
        gunModel[183] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Import
        gunModel[184] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import
        gunModel[185] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Import
        gunModel[186] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Import
        gunModel[187] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Import
        gunModel[188] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Import
        gunModel[189] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Import
        gunModel[190] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import
        gunModel[191] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Import
        gunModel[192] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Import
        gunModel[193] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Import
        gunModel[194] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Import
        gunModel[195] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Import
        gunModel[196] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Import
        gunModel[197] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Import
        gunModel[198] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Import
        gunModel[199] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Import
        gunModel[200] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Import
        gunModel[201] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Import
        gunModel[202] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Import
        gunModel[203] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Import
        gunModel[204] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Import
        gunModel[205] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Import
        gunModel[206] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Import
        gunModel[207] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Import
        gunModel[208] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Import
        gunModel[209] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Import
        gunModel[210] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Import
        gunModel[211] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Import
        gunModel[212] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Import
        gunModel[213] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Import
        gunModel[214] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Import
        gunModel[215] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Import
        gunModel[216] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Import
        gunModel[217] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Import
        gunModel[218] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Import
        gunModel[219] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Import
        gunModel[220] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import
        gunModel[221] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Import
        gunModel[222] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Import
        gunModel[223] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Import
        gunModel[224] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Import
        gunModel[225] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Import
        gunModel[226] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Import
        gunModel[227] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Import
        gunModel[228] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Import
        gunModel[229] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Import
        gunModel[230] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import
        gunModel[231] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Import
        gunModel[232] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Import
        gunModel[233] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Import
        gunModel[234] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import
        gunModel[235] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Import
        gunModel[236] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Import
        gunModel[237] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Import
        gunModel[238] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Import
        gunModel[239] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Import
        gunModel[240] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Import
        gunModel[241] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Import
        gunModel[242] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Import
        gunModel[243] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Import
        gunModel[244] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Import
        gunModel[245] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Import
        gunModel[246] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Import
        gunModel[247] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Import
        gunModel[248] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Import
        gunModel[249] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Import
        gunModel[250] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Import
        gunModel[251] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Import
        gunModel[252] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Import
        gunModel[253] = new ModelRendererTurbo(this, 25, 185, textureX, textureY); // Import
        gunModel[254] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Import
        gunModel[255] = new ModelRendererTurbo(this, 9, 185, textureX, textureY); // Import
        gunModel[256] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Import
        gunModel[257] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Import
        gunModel[258] = new ModelRendererTurbo(this, 57, 193, textureX, textureY); // Import
        gunModel[259] = new ModelRendererTurbo(this, 489, 185, textureX, textureY); // Import
        gunModel[260] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import
        gunModel[261] = new ModelRendererTurbo(this, 129, 193, textureX, textureY); // Import
        gunModel[262] = new ModelRendererTurbo(this, 289, 185, textureX, textureY); // Import
        gunModel[263] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Import
        gunModel[264] = new ModelRendererTurbo(this, 185, 193, textureX, textureY); // Import
        gunModel[265] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Import
        gunModel[266] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Import
        gunModel[267] = new ModelRendererTurbo(this, 249, 193, textureX, textureY); // Import
        gunModel[268] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // Import
        gunModel[269] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); // Import
        gunModel[270] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Import
        gunModel[271] = new ModelRendererTurbo(this, 25, 201, textureX, textureY); // Import
        gunModel[272] = new ModelRendererTurbo(this, 233, 201, textureX, textureY); // Import
        gunModel[273] = new ModelRendererTurbo(this, 265, 201, textureX, textureY); // Import
        gunModel[274] = new ModelRendererTurbo(this, 305, 201, textureX, textureY); // Import
        gunModel[275] = new ModelRendererTurbo(this, 425, 201, textureX, textureY); // Import
        gunModel[276] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Import
        gunModel[277] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Import
        gunModel[278] = new ModelRendererTurbo(this, 41, 209, textureX, textureY); // Import
        gunModel[279] = new ModelRendererTurbo(this, 113, 209, textureX, textureY); // Import
        gunModel[280] = new ModelRendererTurbo(this, 169, 209, textureX, textureY); // Import
        gunModel[281] = new ModelRendererTurbo(this, 113, 193, textureX, textureY); // Import
        gunModel[282] = new ModelRendererTurbo(this, 201, 209, textureX, textureY); // Import
        gunModel[283] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Import
        gunModel[284] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Import
        gunModel[285] = new ModelRendererTurbo(this, 321, 209, textureX, textureY); // Import
        gunModel[286] = new ModelRendererTurbo(this, 57, 217, textureX, textureY); // Import
        gunModel[287] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import
        gunModel[288] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import
        gunModel[289] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import
        gunModel[290] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import
        gunModel[291] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import
        gunModel[292] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Import
        gunModel[293] = new ModelRendererTurbo(this, 353, 209, textureX, textureY); // Import
        gunModel[294] = new ModelRendererTurbo(this, 393, 209, textureX, textureY); // Import
        gunModel[295] = new ModelRendererTurbo(this, 169, 193, textureX, textureY); // Import
        gunModel[296] = new ModelRendererTurbo(this, 441, 209, textureX, textureY); // Import
        gunModel[297] = new ModelRendererTurbo(this, 17, 217, textureX, textureY); // Import
        gunModel[298] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import
        gunModel[299] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import
        gunModel[300] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Import
        gunModel[301] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import
        gunModel[302] = new ModelRendererTurbo(this, 129, 217, textureX, textureY); // Import
        gunModel[303] = new ModelRendererTurbo(this, 185, 217, textureX, textureY); // Import
        gunModel[304] = new ModelRendererTurbo(this, 409, 209, textureX, textureY); // Import
        gunModel[305] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Import
        gunModel[306] = new ModelRendererTurbo(this, 265, 217, textureX, textureY); // Import
        gunModel[307] = new ModelRendererTurbo(this, 297, 217, textureX, textureY); // Import
        gunModel[308] = new ModelRendererTurbo(this, 337, 217, textureX, textureY); // Import
        gunModel[309] = new ModelRendererTurbo(this, 369, 217, textureX, textureY); // Import
        gunModel[310] = new ModelRendererTurbo(this, 425, 217, textureX, textureY); // Import
        gunModel[311] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Import
        gunModel[312] = new ModelRendererTurbo(this, 33, 225, textureX, textureY); // Import
        gunModel[313] = new ModelRendererTurbo(this, 105, 225, textureX, textureY); // Import
        gunModel[314] = new ModelRendererTurbo(this, 145, 225, textureX, textureY); // Import
        gunModel[315] = new ModelRendererTurbo(this, 233, 225, textureX, textureY); // Import
        gunModel[316] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Import
        gunModel[317] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import
        gunModel[318] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Import
        gunModel[319] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Import
        gunModel[320] = new ModelRendererTurbo(this, 393, 225, textureX, textureY); // Import
        gunModel[321] = new ModelRendererTurbo(this, 489, 217, textureX, textureY); // Import
        gunModel[322] = new ModelRendererTurbo(this, 321, 225, textureX, textureY); // Import
        gunModel[323] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Import
        gunModel[324] = new ModelRendererTurbo(this, 201, 225, textureX, textureY); // Import
        gunModel[325] = new ModelRendererTurbo(this, 281, 225, textureX, textureY); // Import
        gunModel[326] = new ModelRendererTurbo(this, 161, 225, textureX, textureY); // Import
        gunModel[327] = new ModelRendererTurbo(this, 201, 193, textureX, textureY); // Import
        gunModel[328] = new ModelRendererTurbo(this, 361, 193, textureX, textureY); // Import
        gunModel[329] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Import
        gunModel[330] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import
        gunModel[331] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import
        gunModel[332] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import
        gunModel[333] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Import
        gunModel[334] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Import
        gunModel[335] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Import
        gunModel[336] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Import
        gunModel[337] = new ModelRendererTurbo(this, 57, 233, textureX, textureY); // Import
        gunModel[338] = new ModelRendererTurbo(this, 81, 233, textureX, textureY); // Import
        gunModel[339] = new ModelRendererTurbo(this, 177, 233, textureX, textureY); // Import
        gunModel[340] = new ModelRendererTurbo(this, 257, 233, textureX, textureY); // Import
        gunModel[341] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Import
        gunModel[342] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Import
        gunModel[343] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Import
        gunModel[344] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Import
        gunModel[345] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Import
        gunModel[346] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Import
        gunModel[347] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Import
        gunModel[348] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Import
        gunModel[349] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Import
        gunModel[350] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Import
        gunModel[351] = new ModelRendererTurbo(this, 473, 217, textureX, textureY); // Import
        gunModel[352] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Import
        gunModel[353] = new ModelRendererTurbo(this, 345, 233, textureX, textureY); // Import
        gunModel[354] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Import
        gunModel[355] = new ModelRendererTurbo(this, 129, 233, textureX, textureY); // Import
        gunModel[356] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Import
        gunModel[357] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Import
        gunModel[358] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Import
        gunModel[359] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Import
        gunModel[360] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Import
        gunModel[361] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import
        gunModel[362] = new ModelRendererTurbo(this, 417, 233, textureX, textureY); // Import
        gunModel[363] = new ModelRendererTurbo(this, 217, 233, textureX, textureY); // Import
        gunModel[364] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Import
        gunModel[365] = new ModelRendererTurbo(this, 449, 233, textureX, textureY); // Import
        gunModel[366] = new ModelRendererTurbo(this, 481, 233, textureX, textureY); // Import
        gunModel[367] = new ModelRendererTurbo(this, 33, 241, textureX, textureY); // Import
        gunModel[368] = new ModelRendererTurbo(this, 97, 241, textureX, textureY); // Import
        gunModel[369] = new ModelRendererTurbo(this, 145, 241, textureX, textureY); // Import
        gunModel[370] = new ModelRendererTurbo(this, 201, 241, textureX, textureY); // Import
        gunModel[371] = new ModelRendererTurbo(this, 233, 241, textureX, textureY); // Import
        gunModel[372] = new ModelRendererTurbo(this, 273, 241, textureX, textureY); // Import
        gunModel[373] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Import
        gunModel[374] = new ModelRendererTurbo(this, 345, 241, textureX, textureY); // Import
        gunModel[375] = new ModelRendererTurbo(this, 393, 241, textureX, textureY); // Import
        gunModel[376] = new ModelRendererTurbo(this, 113, 241, textureX, textureY); // Import
        gunModel[377] = new ModelRendererTurbo(this, 161, 241, textureX, textureY); // Import
        gunModel[378] = new ModelRendererTurbo(this, 465, 241, textureX, textureY); // Import
        gunModel[379] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Import
        gunModel[380] = new ModelRendererTurbo(this, 49, 249, textureX, textureY); // Import
        gunModel[381] = new ModelRendererTurbo(this, 81, 249, textureX, textureY); // Import
        gunModel[382] = new ModelRendererTurbo(this, 129, 249, textureX, textureY); // Import
        gunModel[383] = new ModelRendererTurbo(this, 177, 249, textureX, textureY); // Import
        gunModel[384] = new ModelRendererTurbo(this, 217, 249, textureX, textureY); // Import
        gunModel[385] = new ModelRendererTurbo(this, 249, 249, textureX, textureY); // Import
        gunModel[386] = new ModelRendererTurbo(this, 297, 249, textureX, textureY); // Import
        gunModel[387] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Import
        gunModel[388] = new ModelRendererTurbo(this, 417, 249, textureX, textureY); // Import
        gunModel[389] = new ModelRendererTurbo(this, 449, 249, textureX, textureY); // Import
        gunModel[390] = new ModelRendererTurbo(this, 481, 249, textureX, textureY); // Import
        gunModel[391] = new ModelRendererTurbo(this, 17, 257, textureX, textureY); // Import
        gunModel[392] = new ModelRendererTurbo(this, 313, 257, textureX, textureY); // Import
        gunModel[393] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Import
        gunModel[394] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Import
        gunModel[395] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Import
        gunModel[396] = new ModelRendererTurbo(this, 49, 265, textureX, textureY); // Import
        gunModel[397] = new ModelRendererTurbo(this, 105, 257, textureX, textureY); // Import
        gunModel[398] = new ModelRendererTurbo(this, 433, 249, textureX, textureY); // Import
        gunModel[399] = new ModelRendererTurbo(this, 65, 249, textureX, textureY); // Import
        gunModel[400] = new ModelRendererTurbo(this, 145, 257, textureX, textureY); // Import
        gunModel[401] = new ModelRendererTurbo(this, 193, 257, textureX, textureY); // Import
        gunModel[402] = new ModelRendererTurbo(this, 273, 257, textureX, textureY); // Import
        gunModel[403] = new ModelRendererTurbo(this, 393, 257, textureX, textureY); // Import
        gunModel[404] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Import
        gunModel[405] = new ModelRendererTurbo(this, 73, 265, textureX, textureY); // Import
        gunModel[406] = new ModelRendererTurbo(this, 129, 265, textureX, textureY); // Import
        gunModel[407] = new ModelRendererTurbo(this, 161, 265, textureX, textureY); // Import
        gunModel[408] = new ModelRendererTurbo(this, 217, 265, textureX, textureY); // Import
        gunModel[409] = new ModelRendererTurbo(this, 249, 265, textureX, textureY); // Import
        gunModel[410] = new ModelRendererTurbo(this, 289, 265, textureX, textureY); // Import
        gunModel[411] = new ModelRendererTurbo(this, 353, 257, textureX, textureY); // Import
        gunModel[412] = new ModelRendererTurbo(this, 369, 265, textureX, textureY); // Import
        gunModel[413] = new ModelRendererTurbo(this, 409, 265, textureX, textureY); // Import
        gunModel[414] = new ModelRendererTurbo(this, 433, 265, textureX, textureY); // Import
        gunModel[415] = new ModelRendererTurbo(this, 457, 265, textureX, textureY); // Import
        gunModel[416] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Import
        gunModel[417] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Import
        gunModel[418] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Import
        gunModel[419] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Import
        gunModel[420] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Import
        gunModel[421] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Import
        gunModel[422] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Import
        gunModel[423] = new ModelRendererTurbo(this, 105, 281, textureX, textureY); // Import
        gunModel[424] = new ModelRendererTurbo(this, 209, 281, textureX, textureY); // Import
        gunModel[425] = new ModelRendererTurbo(this, 313, 281, textureX, textureY); // Import
        gunModel[426] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Import
        gunModel[427] = new ModelRendererTurbo(this, 105, 289, textureX, textureY); // Import
        gunModel[428] = new ModelRendererTurbo(this, 409, 281, textureX, textureY); // Import
        gunModel[429] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Import
        gunModel[430] = new ModelRendererTurbo(this, 233, 193, textureX, textureY); // Import
        gunModel[431] = new ModelRendererTurbo(this, 265, 193, textureX, textureY); // Import
        gunModel[432] = new ModelRendererTurbo(this, 337, 209, textureX, textureY); // Import
        gunModel[433] = new ModelRendererTurbo(this, 33, 265, textureX, textureY); // Import
        gunModel[434] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Import
        gunModel[435] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Import
        gunModel[436] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Import
        gunModel[437] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Import
        gunModel[438] = new ModelRendererTurbo(this, 481, 265, textureX, textureY); // Import
        gunModel[439] = new ModelRendererTurbo(this, 201, 289, textureX, textureY); // Import
        gunModel[440] = new ModelRendererTurbo(this, 457, 281, textureX, textureY); // Import
        gunModel[441] = new ModelRendererTurbo(this, 233, 289, textureX, textureY); // Import
        gunModel[442] = new ModelRendererTurbo(this, 265, 289, textureX, textureY); // Import
        gunModel[443] = new ModelRendererTurbo(this, 297, 289, textureX, textureY); // Import
        gunModel[444] = new ModelRendererTurbo(this, 329, 289, textureX, textureY); // Import
        gunModel[445] = new ModelRendererTurbo(this, 369, 289, textureX, textureY); // Import
        gunModel[446] = new ModelRendererTurbo(this, 441, 281, textureX, textureY); // Import
        gunModel[447] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Import
        gunModel[448] = new ModelRendererTurbo(this, 33, 297, textureX, textureY); // Import
        gunModel[449] = new ModelRendererTurbo(this, 57, 297, textureX, textureY); // Import
        gunModel[450] = new ModelRendererTurbo(this, 81, 297, textureX, textureY); // Import
        gunModel[451] = new ModelRendererTurbo(this, 105, 297, textureX, textureY); // Import
        gunModel[452] = new ModelRendererTurbo(this, 129, 297, textureX, textureY); // Import
        gunModel[453] = new ModelRendererTurbo(this, 153, 297, textureX, textureY); // Import
        gunModel[454] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Import
        gunModel[455] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Import
        gunModel[456] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Import
        gunModel[457] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Import
        gunModel[458] = new ModelRendererTurbo(this, 393, 297, textureX, textureY); // Import
        gunModel[459] = new ModelRendererTurbo(this, 313, 297, textureX, textureY); // Import
        gunModel[460] = new ModelRendererTurbo(this, 417, 297, textureX, textureY); // Import
        gunModel[461] = new ModelRendererTurbo(this, 89, 265, textureX, textureY); // Import
        gunModel[462] = new ModelRendererTurbo(this, 177, 265, textureX, textureY); // Import
        gunModel[463] = new ModelRendererTurbo(this, 353, 297, textureX, textureY); // Import
        gunModel[464] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Import
        gunModel[465] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Import
        gunModel[466] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import
        gunModel[467] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Import
        gunModel[468] = new ModelRendererTurbo(this, 441, 297, textureX, textureY); // Import
        gunModel[469] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Import
        gunModel[470] = new ModelRendererTurbo(this, 217, 209, textureX, textureY); // Import
        gunModel[471] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Import
        gunModel[472] = new ModelRendererTurbo(this, 473, 297, textureX, textureY); // Import
        gunModel[473] = new ModelRendererTurbo(this, 233, 305, textureX, textureY); // Import
        gunModel[474] = new ModelRendererTurbo(this, 265, 305, textureX, textureY); // Import
        gunModel[475] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Import
        gunModel[476] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Import
        gunModel[477] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Import
        gunModel[478] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Import
        gunModel[479] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Import
        gunModel[480] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Import
        gunModel[481] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Import
        gunModel[482] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Import
        gunModel[483] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Import
        gunModel[484] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Import
        gunModel[485] = new ModelRendererTurbo(this, 145, 217, textureX, textureY); // Import
        gunModel[486] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Import
        gunModel[487] = new ModelRendererTurbo(this, 377, 265, textureX, textureY); // Import
        gunModel[488] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Import
        gunModel[489] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Import
        gunModel[490] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Import
        gunModel[491] = new ModelRendererTurbo(this, 169, 297, textureX, textureY); // Import
        gunModel[492] = new ModelRendererTurbo(this, 233, 217, textureX, textureY); // Import
        gunModel[493] = new ModelRendererTurbo(this, 281, 289, textureX, textureY); // Import
        gunModel[494] = new ModelRendererTurbo(this, 65, 305, textureX, textureY); // Import
        gunModel[495] = new ModelRendererTurbo(this, 329, 305, textureX, textureY); // Import
        gunModel[496] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Import
        gunModel[497] = new ModelRendererTurbo(this, 297, 305, textureX, textureY); // Import
        gunModel[498] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Import
        gunModel[499] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Import

        gunModel[0].addShapeBox(26F, -1F, -5F, 1, 3, 9, 0F, 0.25F, 0.0F, -1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.5F, 2.0F, 0.0F, -1.5F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -1.5F); // Import
        gunModel[0].setRotationPoint(-20F, -14F, 0.5F);

        gunModel[1].addShapeBox(26F, -1F, -5F, 1, 5, 9, 0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 2.5F, 0.0F, -1.5F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 2.5F, 0.0F, -1.5F); // Import
        gunModel[1].setRotationPoint(-22F, -11F, 0.5F);

        gunModel[2].addShapeBox(26F, -1F, -5F, 1, 6, 9, 0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 2.5F, 0.0F, -1.5F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 2.5F, 0.0F, -1.5F); // Import
        gunModel[2].setRotationPoint(-24.5F, -6F, 0.5F);

        gunModel[3].addShapeBox(26F, -1F, -5F, 1, 4, 9, 0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, -1.5F); // Import
        gunModel[3].setRotationPoint(-27F, 0F, 0.5F);

        gunModel[4].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, 0.0F, 0.0F, -1.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, -0.25F, -2.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, -0.25F, -2.0F); // Import
        gunModel[4].setRotationPoint(-27F, 4F, 0.5F);

        gunModel[5].addShapeBox(26F, -1F, -5F, 1, 1, 11, 0F, 0.0F, -1.0F, -0.5F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -1.0F, -0.5F, 0.0F, 1.0F, -1.5F, 0.0F, 0.75F, -2.5F, 0.0F, 0.75F, -2.5F, 0.0F, 1.0F, -1.5F); // Import
        gunModel[5].setRotationPoint(-14F, 4.5F, -0.5F);

        gunModel[6].addShapeBox(26F, -1F, -5F, 9, 1, 11, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        gunModel[6].setRotationPoint(-24F, 5.5F, -0.5F);

        gunModel[7].addShapeBox(26F, -1F, -5F, 1, 15, 9, 0F, -7.0F, 0.0F, 0.0F, 7.0F, 0.0F, -1.5F, 7.0F, 0.0F, -1.5F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[7].setRotationPoint(-13F, -12F, 0.5F);

        gunModel[8].addShapeBox(26F, -1F, -5F, 2, 1, 11, 0F, 0.0F, -0.25F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.25F, -1.5F, 0.0F, 1.0F, -1.5F, 0.0F, 1.0F, -1.5F, 0.0F, 0.25F, -1.5F); // Import
        gunModel[8].setRotationPoint(-26F, 4.5F, -0.5F);

        gunModel[9].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, -1.5F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, 0.0F, 1.0F, -1.5F); // Import
        gunModel[9].setRotationPoint(-13F, 4.25F, 0.5F);

        gunModel[10].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 1.5F, 0.0F); // Import
        gunModel[10].setRotationPoint(-13F, 2.75F, 0.5F);

        gunModel[11].addShapeBox(26F, -1F, -5F, 2, 3, 11, 0F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -1.0F); // Import
        gunModel[11].setRotationPoint(-19F, -14F, -0.5F);

        gunModel[12].addShapeBox(26F, -1F, -5F, 2, 5, 11, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 2.5F, 0.0F, -1.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 2.5F, 0.0F, -1.0F); // Import
        gunModel[12].setRotationPoint(-21F, -11F, -0.5F);

        gunModel[13].addShapeBox(26F, -1F, -5F, 2, 6, 11, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 2.5F, 0.0F, -1.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 2.5F, 0.0F, -1.0F); // Import
        gunModel[13].setRotationPoint(-23.5F, -6F, -0.5F);

        gunModel[14].addShapeBox(26F, -1F, -5F, 2, 5, 11, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, -1.0F); // Import
        gunModel[14].setRotationPoint(-26F, 0F, -0.5F);

        gunModel[15].addShapeBox(26F, -1F, -5F, 2, 15, 9, 0F, -7.0F, 0.0F, 1.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[15].setRotationPoint(-15F, -12F, 0.5F);

        gunModel[16].addShapeBox(26F, -1F, -5F, 1, 1, 11, 0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.5F, 0.0F, 1.75F, -0.5F, 0.0F, 1.5F, -1.0F, 0.0F, 1.5F, -1.0F, 0.0F, 1.75F, -0.5F); // Import
        gunModel[16].setRotationPoint(-14F, 2.75F, -0.5F);

        gunModel[17].addShapeBox(26F, -1F, -5F, 1, 1, 11, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, -0.5F, 0.0F, 1.75F, -0.5F, 0.0F, 1.75F, 0.0F); // Import
        gunModel[17].setRotationPoint(-15F, 2.75F, -0.5F);

        gunModel[18].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[18].setRotationPoint(-6F, -13F, 0.5F);

        gunModel[19].addShapeBox(26F, -1F, -5F, 1, 1, 7, 0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[19].setRotationPoint(-5.5F, -14F, 1.5F);

        gunModel[20].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[20].setRotationPoint(-3.5F, -15F, 0.5F);

        gunModel[21].addShapeBox(26F, -1F, -5F, 1, 1, 7, 0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[21].setRotationPoint(-4.5F, -15F, 1.5F);

        gunModel[22].addShapeBox(26F, -1F, -5F, 1, 7, 9, 0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[22].setRotationPoint(-2.5F, -22F, 0.5F);

        gunModel[23].addShapeBox(26F, -1F, -5F, 1, 5, 9, 0F, -0.75F, 0.0F, -1.5F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -1.5F, 2.25F, 0.0F, -1.5F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 2.25F, 0.0F, -1.5F); // Import
        gunModel[23].setRotationPoint(-18F, -19F, 0.5F);

        gunModel[24].addShapeBox(26F, -1F, -5F, 2, 5, 9, 0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 1.0F, -2.25F, 0.0F, 1.0F, 2.25F, 0.0F, 0.0F); // Import
        gunModel[24].setRotationPoint(-17F, -19F, 0.5F);

        gunModel[25].addShapeBox(26F, -1F, -5F, 1, 2, 9, 0F, 1.0F, 0.0F, -1.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.5F, 2.0F, 0.0F, -1.5F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -1.5F); // Import
        gunModel[25].setRotationPoint(-15.25F, -21F, 0.5F);

        gunModel[26].addShapeBox(26F, -1F, -5F, 2, 2, 9, 0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F); // Import
        gunModel[26].setRotationPoint(-14.25F, -21F, 0.5F);

        gunModel[27].addShapeBox(26F, -1F, -5F, 1, 3, 9, 0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F); // Import
        gunModel[27].setRotationPoint(-16.25F, -24F, 0.5F);

        gunModel[28].addShapeBox(26F, -1F, -5F, 1, 3, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[28].setRotationPoint(-15.25F, -24F, 0.5F);

        gunModel[29].addShapeBox(26F, -1F, -5F, 1, 2, 9, 0F, 1.25F, 0.0F, -1.5F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F); // Import
        gunModel[29].setRotationPoint(-16.25F, -26F, 0.5F);

        gunModel[30].addShapeBox(26F, -1F, -5F, 3, 2, 9, 0F, 1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[30].setRotationPoint(-15.25F, -26F, 0.5F);

        gunModel[31].addShapeBox(26F, -1F, -5F, 1, 2, 9, 0F, 2.5F, 0.0F, -1.5F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 2.5F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.5F); // Import
        gunModel[31].setRotationPoint(-17.25F, -28F, 0.5F);

        gunModel[32].addShapeBox(26F, -1F, -5F, 3, 2, 9, 0F, 2.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F); // Import
        gunModel[32].setRotationPoint(-16.25F, -28F, 0.5F);

        gunModel[33].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, 0.0F, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F); // Import
        gunModel[33].setRotationPoint(-19.75F, -29F, 0.5F);

        gunModel[34].addShapeBox(26F, -1F, -5F, 4, 1, 9, 0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[34].setRotationPoint(-18.75F, -29F, 0.5F);

        gunModel[35].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.5F, -0.5F, 0.0F); // Import
        gunModel[35].setRotationPoint(-2F, -23F, 0.5F);

        gunModel[36].addShapeBox(26F, -1F, -5F, 7, 1, 9, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); // Import
        gunModel[36].setRotationPoint(-11.5F, -24.5F, 0.5F);

        gunModel[37].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[37].setRotationPoint(-4F, -24.5F, 0.5F);

        gunModel[38].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, 0.0F, -0.5F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[38].setRotationPoint(-3F, -24F, 0.5F);

        gunModel[39].addShapeBox(26F, -1F, -5F, 1, 2, 9, 0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[39].setRotationPoint(-12.5F, -26F, 0.5F);

        gunModel[40].addShapeBox(26F, -1F, -5F, 1, 2, 9, 0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[40].setRotationPoint(-13.5F, -28F, 0.5F);

        gunModel[41].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[41].setRotationPoint(-14.5F, -29F, 0.5F);

        gunModel[42].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, 0.75F, -0.5F, 0.0F, -1.25F, -0.5F, -0.5F, -1.25F, -0.5F, -0.5F, 0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[42].setRotationPoint(-15.5F, -30F, 0.5F);

        gunModel[43].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, 1.0F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, 1.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[43].setRotationPoint(-16.25F, -30.5F, 0.5F);

        gunModel[44].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, -1.5F, -0.5F, -2.0F, 1.0F, -0.5F, -0.5F, 1.0F, -0.5F, -0.5F, -1.5F, -0.5F, -2.0F, -0.5F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.5F); // Import
        gunModel[44].setRotationPoint(-19.75F, -30.5F, 0.5F);

        gunModel[45].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, -1.5F, -0.5F, -1.5F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -1.5F, -0.5F, -1.5F, -1.0F, 0.0F, -1.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, -1.5F); // Import
        gunModel[45].setRotationPoint(-20.75F, -30F, 0.5F);

        gunModel[46].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); // Import
        gunModel[46].setRotationPoint(-18.25F, -30.5F, 0.5F);

        gunModel[47].addShapeBox(26F, -1F, -5F, 3, 1, 9, 0F, -1.5F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[47].setRotationPoint(-20.25F, -30F, 0.5F);

        gunModel[48].addShapeBox(26F, -1F, -5F, 2, 1, 9, 0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F); // Import
        gunModel[48].setRotationPoint(-14.5F, -24F, 0.5F);

        gunModel[49].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[49].setRotationPoint(-12.5F, -24.5F, 0.5F);

        gunModel[50].addShapeBox(26F, -1F, -5F, 10, 3, 9, 0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F); // Import
        gunModel[50].setRotationPoint(-14.5F, -23.5F, 0.5F);

        gunModel[51].addShapeBox(26F, -1F, -5F, 1, 3, 9, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[51].setRotationPoint(-4F, -24F, 0.5F);

        gunModel[52].addShapeBox(26F, -1F, -5F, 1, 9, 9, 0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[52].setRotationPoint(-3F, -24F, 0.5F);

        gunModel[53].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[53].setRotationPoint(-2.5F, -15F, 0.5F);

        gunModel[54].addShapeBox(26F, -1F, -5F, 9, 3, 11, 0F, 0.0F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[54].setRotationPoint(-24F, 0F, -0.5F);

        gunModel[55].addShapeBox(26F, -1F, -5F, 1, 1, 11, 0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, -1.5F, 0.0F, 1.0F, -1.5F, 0.0F, 1.0F, -1.5F, 0.0F, 1.0F, -1.5F); // Import
        gunModel[55].setRotationPoint(-15F, 4.5F, -0.5F);

        gunModel[56].addShapeBox(26F, -1F, -5F, 2, 5, 9, 0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 2.25F, 0.0F, 1.0F, -1.25F, -2.25F, 0.5F, -1.25F, -2.25F, 0.5F, 2.25F, 0.0F, 1.0F); // Import
        gunModel[56].setRotationPoint(-15F, -19F, 0.5F);

        gunModel[57].addShapeBox(26F, -1F, -5F, 9, 3, 11, 0F, 0.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F); // Import
        gunModel[57].setRotationPoint(-17F, -14F, -0.5F);

        gunModel[58].addShapeBox(26F, -1F, -5F, 10, 5, 11, 0F, 0.0F, 0.0F, 0.0F, 0.55F, 0.0F, 0.0F, 0.55F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -1.8F, 0.0F, 0.0F, -1.8F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F); // Import
        gunModel[58].setRotationPoint(-19F, -11F, -0.5F);

        gunModel[59].addShapeBox(26F, -1F, -5F, 10, 6, 11, 0F, 0.0F, 0.0F, 0.0F, 0.7F, 0.0F, 0.0F, 0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -2.1F, 0.0F, 0.0F, -2.1F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F); // Import
        gunModel[59].setRotationPoint(-21.5F, -6F, -0.5F);

        gunModel[60].addShapeBox(26F, -1F, -5F, 2, 1, 9, 0F, -0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[60].setRotationPoint(-8F, -13F, 0.5F);

        gunModel[61].addShapeBox(26F, -1F, -5F, 2, 1, 7, 0F, -1.0F, 0.0F, 2.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 2.0F); // Import
        gunModel[61].setRotationPoint(-7.5F, -14F, 1.5F);

        gunModel[62].addShapeBox(26F, -1F, -5F, 2, 1, 11, 0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[62].setRotationPoint(-10F, -13F, -0.5F);

        gunModel[63].addShapeBox(26F, -1F, -5F, 3, 1, 11, 0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[63].setRotationPoint(-10F, -14F, -0.5F);

        gunModel[64].addShapeBox(26F, -1F, -5F, 2, 1, 11, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[64].setRotationPoint(-10F, -12F, -0.5F);

        gunModel[65].addShapeBox(26F, -1F, -5F, 9, 3, 11, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[65].setRotationPoint(-24F, 3F, -0.5F);

        gunModel[66].addShapeBox(26F, -1F, -5F, 5, 1, 9, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[66].setRotationPoint(-13F, -15F, 0.5F);

        gunModel[67].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, 0.25F, 1.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.25F, 1.25F, 0.5F, 0.25F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F); // Import
        gunModel[67].setRotationPoint(-14F, -15F, 0.5F);

        gunModel[68].addShapeBox(26F, -1F, -5F, 3, 1, 9, 0F, 0.0F, -1.0F, 1.0F, 0.0F, 1.25F, 0.5F, 0.0F, 1.25F, 0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[68].setRotationPoint(-17.25F, -15F, 0.5F);

        gunModel[69].addShapeBox(26F, -1F, -5F, 2, 1, 9, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, -1.5F, 1.0F, 0.0F, -1.5F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[69].setRotationPoint(-8F, -15F, 0.5F);

        gunModel[70].addShapeBox(26F, -1F, -5F, 2, 1, 9, 0F, 0.0F, 0.0F, 0.5F, -0.5F, 2.5F, 0.0F, -0.5F, 2.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, -0.5F, -2.5F, 0.0F, -0.5F, -2.5F, 0.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[70].setRotationPoint(-6F, -16.5F, 0.5F);

        gunModel[71].addShapeBox(26F, -1F, -5F, 1, 6, 9, 0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[71].setRotationPoint(-4.5F, -21F, 0.5F);

        gunModel[72].addShapeBox(26F, -1F, -5F, 1, 3, 11, 0F, 0.0F, -3.0F, 0.0F, 0.5F, -0.5F, -1.0F, 0.5F, -0.5F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, -1.0F, 0.5F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[72].setRotationPoint(-6F, -18.5F, -0.5F);

        gunModel[73].addShapeBox(26F, -1F, -5F, 2, 1, 11, 0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[73].setRotationPoint(-8F, -15F, -0.5F);

        gunModel[74].addShapeBox(26F, -1F, -5F, 2, 1, 7, 0F, -2.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 2.0F); // Import
        gunModel[74].setRotationPoint(-6.5F, -15F, 1.5F);

        gunModel[75].addShapeBox(26F, -1F, -5F, 2, 1, 7, 0F, -0.5F, 0.5F, 2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -0.5F, 0.5F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 2.0F); // Import
        gunModel[75].setRotationPoint(-6.5F, -15F, 1.5F);

        gunModel[76].addShapeBox(26F, -1F, -5F, 5, 6, 9, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F); // Import
        gunModel[76].setRotationPoint(-13F, -20.5F, 0.5F);

        gunModel[77].addShapeBox(26F, -1F, -5F, 1, 3, 9, 0F, 0.25F, 1.5F, 0.0F, 0.0F, 1.5F, 0.2F, 0.0F, 1.5F, 0.2F, 0.25F, 1.5F, 0.0F, 0.25F, -1.75F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.25F, -1.75F, 0.5F); // Import
        gunModel[77].setRotationPoint(-14F, -17.5F, 0.5F);

        gunModel[78].addShapeBox(26F, -1F, -5F, 1, 2, 9, 0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, 0.25F, -0.5F, 0.0F); // Import
        gunModel[78].setRotationPoint(-14F, -20.5F, 0.5F);

        gunModel[79].addShapeBox(26F, -1F, -5F, 2, 5, 9, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.5F, 0.5F); // Import
        gunModel[79].setRotationPoint(-8F, -20.5F, 0.5F);

        gunModel[80].addShapeBox(26F, -1F, -5F, 2, 5, 9, 0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.5F, -0.5F, -3.5F, 0.0F, -0.5F, -3.5F, 0.0F, 0.0F, -1.0F, 0.5F); // Import
        gunModel[80].setRotationPoint(-6F, -20.5F, 0.5F);

        gunModel[81].addShapeBox(26F, -1F, -5F, 8, 2, 9, 0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[81].setRotationPoint(-12F, -26F, 0.5F);

        gunModel[82].addShapeBox(26F, -1F, -5F, 1, 2, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[82].setRotationPoint(-4F, -26F, 0.5F);

        gunModel[83].addShapeBox(26F, -1F, -5F, 1, 3, 9, 0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[83].setRotationPoint(-3F, -26F, 0.5F);

        gunModel[84].addShapeBox(26F, -1F, -5F, 1, 2, 9, 0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[84].setRotationPoint(-13F, -28F, 0.5F);

        gunModel[85].addShapeBox(26F, -1F, -5F, 2, 1, 9, 0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[85].setRotationPoint(-14F, -29F, 0.5F);

        gunModel[86].addShapeBox(26F, -1F, -5F, 2, 1, 9, 0F, 1.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.75F, -0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[86].setRotationPoint(-14F, -30F, 0.5F);

        gunModel[87].addShapeBox(26F, -1F, -5F, 2, 1, 9, 0F, 2.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 2.75F, -0.5F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F); // Import
        gunModel[87].setRotationPoint(-14F, -30.5F, 0.5F);

        gunModel[88].addShapeBox(26F, -1F, -5F, 3, 3, 9, 0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F); // Import
        gunModel[88].setRotationPoint(-2F, -26F, 0.5F);

        gunModel[89].addShapeBox(26F, -1F, -5F, 1, 3, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F); // Import
        gunModel[89].setRotationPoint(0.5F, -26F, 0.5F);

        gunModel[90].addShapeBox(26F, -1F, -5F, 2, 3, 9, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        gunModel[90].setRotationPoint(1.5F, -26F, 0.5F);

        gunModel[91].addShapeBox(26F, -1F, -5F, 8, 3, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[91].setRotationPoint(3F, -26F, 0.5F);

        gunModel[92].addShapeBox(26F, -1F, -5F, 29, 2, 9, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[92].setRotationPoint(-18F, -32F, 0.5F);

        gunModel[93].addShapeBox(26F, -1F, -5F, 28, 3, 10, 0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F); // Import
        gunModel[93].setRotationPoint(-16F, -36.5F, 0F);

        gunModel[94].addShapeBox(26F, -1F, -5F, 31, 3, 10, 0F, 0.0F, 0.5F, 1.0F, 0.5F, 0.5F, 1.0F, 0.5F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[94].setRotationPoint(-19F, -39.5F, 0F);

        gunModel[95].addShapeBox(26F, -1F, -5F, 33, 1, 10, 0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F); // Import
        gunModel[95].setRotationPoint(-20.5F, -46F, 0F);

        gunModel[96].addShapeBox(26F, -1F, -5F, 5, 1, 10, 0F, -0.5F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, -0.5F, 0.5F, 1.0F, -0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F); // Import
        gunModel[96].setRotationPoint(12F, -39.5F, 0F);

        gunModel[97].addShapeBox(26F, -1F, -5F, 25, 9, 6, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[97].setRotationPoint(17F, -45.5F, 4F);

        gunModel[98].addShapeBox(26F, -1F, -5F, 36, 1, 10, 0F, 0.25F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.25F, 0.75F, 0.5F, 0.25F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.25F, -1.0F, 1.0F); // Import
        gunModel[98].setRotationPoint(-23.5F, -40F, 0F);

        gunModel[99].addShapeBox(26F, -1F, -5F, 38, 1, 10, 0F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 1.0F, -0.5F, -0.5F, 1.0F, -0.5F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F); // Import
        gunModel[99].setRotationPoint(-20.5F, -45.5F, 0F);

        gunModel[100].addShapeBox(26F, -1F, -5F, 62, 1, 10, 0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F); // Import
        gunModel[100].setRotationPoint(-20.5F, -48.5F, 0F);

        gunModel[101].addShapeBox(26F, -1F, -5F, 63, 1, 10, 0F, 0.0F, 1.25F, 0.25F, -0.5F, 1.25F, 0.25F, -0.5F, 1.25F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[101].setRotationPoint(-20.5F, -46.5F, 0F);

        gunModel[102].addShapeBox(26F, -1F, -5F, 27, 1, 9, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[102].setRotationPoint(-16F, -34.25F, 0.5F);

        gunModel[103].addShapeBox(26F, -1F, -5F, 29, 1, 9, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[103].setRotationPoint(-18F, -33.25F, 0.5F);

        gunModel[104].addShapeBox(26F, -1F, -5F, 62, 2, 10, 0F, 0.0F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, -0.25F, -0.25F, -1.0F, -0.25F, -0.25F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F); // Import
        gunModel[104].setRotationPoint(-20.5F, -49.5F, 0F);

        gunModel[105].addShapeBox(26F, -1F, -5F, 17, 3, 10, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F); // Import
        gunModel[105].setRotationPoint(16.5F, -36.5F, 0F);

        gunModel[106].addShapeBox(26F, -1F, -5F, 98, 1, 6, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[106].setRotationPoint(-13.5F, -51F, 2F);

        gunModel[107].addShapeBox(26F, -1F, -5F, 42, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[107].setRotationPoint(42F, -45.5F, 10F);

        gunModel[108].addShapeBox(26F, -1F, -5F, 42, 1, 1, 0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[108].setRotationPoint(42F, -46.5F, 0F);

        gunModel[109].addShapeBox(26F, -1F, -5F, 42, 1, 1, 0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[109].setRotationPoint(42F, -46.5F, 9F);

        gunModel[110].addShapeBox(26F, -1F, -5F, 6, 2, 10, 0F, 2.75F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 2.75F, 0.0F, -2.0F, 0.25F, -1.0F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -1.0F, -0.25F, 0.25F, -1.0F, -0.25F); // Import
        gunModel[110].setRotationPoint(78.5F, -49.5F, 0F);

        gunModel[111].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.0F, -0.25F, 0.75F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.75F, 1.25F, -0.5F, 0.75F, 1.25F, -0.5F, 0.75F, -1.25F, 0.0F, 0.75F, -1.25F); // Import
        gunModel[111].setRotationPoint(80.5F, -48F, 0.5F);

        gunModel[112].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 2.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.5F, 2.25F, 0.0F, 0.5F, 0.75F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F); // Import
        gunModel[112].setRotationPoint(80.5F, -48.5F, 0F);

        gunModel[113].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, -0.25F, -0.25F, 0.75F, -0.75F, -0.25F, 0.75F, -0.75F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0.75F, 1.25F, 1.75F, 0.75F, 1.25F, 1.75F, 0.75F, -1.25F, -0.25F, 0.75F, -1.25F); // Import
        gunModel[113].setRotationPoint(73.5F, -48F, 0.5F);

        gunModel[114].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 2.0F, 0.0F, -0.25F, -2.5F, 0.0F, -0.25F, -2.5F, 0.0F, 0.5F, 2.0F, 0.0F, 0.5F, 0.5F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F); // Import
        gunModel[114].setRotationPoint(73.5F, -48.5F, 0F);

        gunModel[115].addShapeBox(26F, -1F, -5F, 4, 2, 10, 0F, 2.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 2.5F, 0.0F, -2.0F, 0.0F, -1.0F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F); // Import
        gunModel[115].setRotationPoint(71.5F, -49.5F, 0F);

        gunModel[116].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.0F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.75F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F); // Import
        gunModel[116].setRotationPoint(73F, -48F, 0.5F);

        gunModel[117].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.75F, -0.5F, 0.85F, -0.25F, -0.5F, 0.85F, -0.25F, -0.5F, -0.85F, -0.75F, -0.5F, -0.85F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F); // Import
        gunModel[117].setRotationPoint(73F, -47.25F, 0.25F);

        gunModel[118].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, -0.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, 0.75F, -1.25F, 1.75F, 0.75F, -1.25F, 1.75F, 0.75F, 1.25F, -0.25F, 0.75F, 1.25F); // Import
        gunModel[118].setRotationPoint(73.5F, -48F, 8.5F);

        gunModel[119].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 2.0F, 0.0F, 0.5F, -2.5F, 0.0F, 0.5F, -2.5F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F); // Import
        gunModel[119].setRotationPoint(73.5F, -48.5F, 9F);

        gunModel[120].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, -0.75F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F); // Import
        gunModel[120].setRotationPoint(73F, -48F, 8.5F);

        gunModel[121].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.75F, -0.5F, -0.85F, -0.25F, -0.5F, -0.85F, -0.25F, -0.5F, 0.85F, -0.75F, -0.5F, 0.85F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F); // Import
        gunModel[121].setRotationPoint(73F, -47.25F, 8.75F);

        gunModel[122].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.0F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.75F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F); // Import
        gunModel[122].setRotationPoint(79.75F, -48F, 0.5F);

        gunModel[123].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.75F, -0.5F, 0.85F, -0.25F, -0.5F, 0.85F, -0.25F, -0.5F, -0.85F, -0.75F, -0.5F, -0.85F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F); // Import
        gunModel[123].setRotationPoint(79.75F, -47.25F, 0.25F);

        gunModel[124].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, 0.75F, -1.25F, -0.5F, 0.75F, -1.25F, -0.5F, 0.75F, 1.25F, 0.0F, 0.75F, 1.25F); // Import
        gunModel[124].setRotationPoint(80.5F, -48F, 8.5F);

        gunModel[125].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 2.25F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.25F, 2.25F, 0.0F, -0.25F, 0.75F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0.25F, 0.75F, -0.25F, 0.25F); // Import
        gunModel[125].setRotationPoint(80.5F, -48.5F, 9F);

        gunModel[126].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, -0.75F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F); // Import
        gunModel[126].setRotationPoint(79.75F, -48F, 8.5F);

        gunModel[127].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.75F, -0.5F, -0.85F, -0.25F, -0.5F, -0.85F, -0.25F, -0.5F, 0.85F, -0.75F, -0.5F, 0.85F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F); // Import
        gunModel[127].setRotationPoint(79.75F, -47.25F, 8.75F);

        gunModel[128].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, -0.25F, -0.25F, 0.75F, -0.75F, -0.25F, 0.75F, -0.75F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0.75F, 1.25F, 1.75F, 0.75F, 1.25F, 1.75F, 0.75F, -1.25F, -0.25F, 0.75F, -1.25F); // Import
        gunModel[128].setRotationPoint(66.75F, -48F, 0.5F);

        gunModel[129].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 2.0F, 0.0F, -0.25F, -2.5F, 0.0F, -0.25F, -2.5F, 0.0F, 0.5F, 2.0F, 0.0F, 0.5F, 0.5F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F); // Import
        gunModel[129].setRotationPoint(66.75F, -48.5F, 0F);

        gunModel[130].addShapeBox(26F, -1F, -5F, 4, 2, 10, 0F, 2.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 2.5F, 0.0F, -2.0F, 0.0F, -1.0F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F); // Import
        gunModel[130].setRotationPoint(64.75F, -49.5F, 0F);

        gunModel[131].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.0F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.75F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F); // Import
        gunModel[131].setRotationPoint(66.25F, -48F, 0.5F);

        gunModel[132].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.75F, -0.5F, 0.85F, -0.25F, -0.5F, 0.85F, -0.25F, -0.5F, -0.85F, -0.75F, -0.5F, -0.85F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F); // Import
        gunModel[132].setRotationPoint(66.25F, -47.25F, 0.25F);

        gunModel[133].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, -0.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, 0.75F, -1.25F, 1.75F, 0.75F, -1.25F, 1.75F, 0.75F, 1.25F, -0.25F, 0.75F, 1.25F); // Import
        gunModel[133].setRotationPoint(66.75F, -48F, 8.5F);

        gunModel[134].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 2.0F, 0.0F, 0.5F, -2.5F, 0.0F, 0.5F, -2.5F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F); // Import
        gunModel[134].setRotationPoint(66.75F, -48.5F, 9F);

        gunModel[135].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, -0.75F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F); // Import
        gunModel[135].setRotationPoint(66.25F, -48F, 8.5F);

        gunModel[136].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.75F, -0.5F, -0.85F, -0.25F, -0.5F, -0.85F, -0.25F, -0.5F, 0.85F, -0.75F, -0.5F, 0.85F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F); // Import
        gunModel[136].setRotationPoint(66.25F, -47.25F, 8.75F);

        gunModel[137].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, -0.25F, -0.25F, 0.75F, -0.75F, -0.25F, 0.75F, -0.75F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0.75F, 1.25F, 1.75F, 0.75F, 1.25F, 1.75F, 0.75F, -1.25F, -0.25F, 0.75F, -1.25F); // Import
        gunModel[137].setRotationPoint(60F, -48F, 0.5F);

        gunModel[138].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 2.0F, 0.0F, -0.25F, -2.5F, 0.0F, -0.25F, -2.5F, 0.0F, 0.5F, 2.0F, 0.0F, 0.5F, 0.5F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F); // Import
        gunModel[138].setRotationPoint(60F, -48.5F, 0F);

        gunModel[139].addShapeBox(26F, -1F, -5F, 4, 2, 10, 0F, 2.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 2.5F, 0.0F, -2.0F, 0.0F, -1.0F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F); // Import
        gunModel[139].setRotationPoint(58F, -49.5F, 0F);

        gunModel[140].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.0F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.75F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F); // Import
        gunModel[140].setRotationPoint(59.5F, -48F, 0.5F);

        gunModel[141].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.75F, -0.5F, 0.85F, -0.25F, -0.5F, 0.85F, -0.25F, -0.5F, -0.85F, -0.75F, -0.5F, -0.85F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F); // Import
        gunModel[141].setRotationPoint(59.5F, -47.25F, 0.25F);

        gunModel[142].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, -0.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, 0.75F, -1.25F, 1.75F, 0.75F, -1.25F, 1.75F, 0.75F, 1.25F, -0.25F, 0.75F, 1.25F); // Import
        gunModel[142].setRotationPoint(60F, -48F, 8.5F);

        gunModel[143].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 2.0F, 0.0F, 0.5F, -2.5F, 0.0F, 0.5F, -2.5F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F); // Import
        gunModel[143].setRotationPoint(60F, -48.5F, 9F);

        gunModel[144].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, -0.75F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F); // Import
        gunModel[144].setRotationPoint(59.5F, -48F, 8.5F);

        gunModel[145].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.75F, -0.5F, -0.85F, -0.25F, -0.5F, -0.85F, -0.25F, -0.5F, 0.85F, -0.75F, -0.5F, 0.85F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F); // Import
        gunModel[145].setRotationPoint(59.5F, -47.25F, 8.75F);

        gunModel[146].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, -0.25F, -0.25F, 0.75F, -0.75F, -0.25F, 0.75F, -0.75F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0.75F, 1.25F, 1.75F, 0.75F, 1.25F, 1.75F, 0.75F, -1.25F, -0.25F, 0.75F, -1.25F); // Import
        gunModel[146].setRotationPoint(53F, -48F, 0.5F);

        gunModel[147].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 2.0F, 0.0F, -0.25F, -2.5F, 0.0F, -0.25F, -2.5F, 0.0F, 0.5F, 2.0F, 0.0F, 0.5F, 0.5F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F); // Import
        gunModel[147].setRotationPoint(53F, -48.5F, 0F);

        gunModel[148].addShapeBox(26F, -1F, -5F, 4, 2, 10, 0F, 2.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 2.5F, 0.0F, -2.0F, 0.0F, -1.0F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F); // Import
        gunModel[148].setRotationPoint(51F, -49.5F, 0F);

        gunModel[149].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.0F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.75F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F); // Import
        gunModel[149].setRotationPoint(52.5F, -48F, 0.5F);

        gunModel[150].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.75F, -0.5F, 0.85F, -0.25F, -0.5F, 0.85F, -0.25F, -0.5F, -0.85F, -0.75F, -0.5F, -0.85F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F); // Import
        gunModel[150].setRotationPoint(52.5F, -47.25F, 0.25F);

        gunModel[151].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, -0.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, 0.75F, -1.25F, 1.75F, 0.75F, -1.25F, 1.75F, 0.75F, 1.25F, -0.25F, 0.75F, 1.25F); // Import
        gunModel[151].setRotationPoint(53F, -48F, 8.5F);

        gunModel[152].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 2.0F, 0.0F, 0.5F, -2.5F, 0.0F, 0.5F, -2.5F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F); // Import
        gunModel[152].setRotationPoint(53F, -48.5F, 9F);

        gunModel[153].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, -0.75F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F); // Import
        gunModel[153].setRotationPoint(52.5F, -48F, 8.5F);

        gunModel[154].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.75F, -0.5F, -0.85F, -0.25F, -0.5F, -0.85F, -0.25F, -0.5F, 0.85F, -0.75F, -0.5F, 0.85F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F); // Import
        gunModel[154].setRotationPoint(52.5F, -47.25F, 8.75F);

        gunModel[155].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, -0.25F, -0.25F, 0.75F, -0.75F, -0.25F, 0.75F, -0.75F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0.75F, 1.25F, 1.75F, 0.75F, 1.25F, 1.75F, 0.75F, -1.25F, -0.25F, 0.75F, -1.25F); // Import
        gunModel[155].setRotationPoint(46.25F, -48F, 0.5F);

        gunModel[156].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 2.0F, 0.0F, -0.25F, -2.5F, 0.0F, -0.25F, -2.5F, 0.0F, 0.5F, 2.0F, 0.0F, 0.5F, 0.5F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F); // Import
        gunModel[156].setRotationPoint(46.25F, -48.5F, 0F);

        gunModel[157].addShapeBox(26F, -1F, -5F, 4, 2, 10, 0F, 2.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 2.5F, 0.0F, -2.0F, 0.0F, -1.0F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F); // Import
        gunModel[157].setRotationPoint(44.25F, -49.5F, 0F);

        gunModel[158].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.0F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.75F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F); // Import
        gunModel[158].setRotationPoint(45.75F, -48F, 0.5F);

        gunModel[159].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.75F, -0.5F, 0.85F, -0.25F, -0.5F, 0.85F, -0.25F, -0.5F, -0.85F, -0.75F, -0.5F, -0.85F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F); // Import
        gunModel[159].setRotationPoint(45.75F, -47.25F, 0.25F);

        gunModel[160].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, -0.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, 0.75F, -1.25F, 1.75F, 0.75F, -1.25F, 1.75F, 0.75F, 1.25F, -0.25F, 0.75F, 1.25F); // Import
        gunModel[160].setRotationPoint(46.25F, -48F, 8.5F);

        gunModel[161].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 2.0F, 0.0F, 0.5F, -2.5F, 0.0F, 0.5F, -2.5F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F); // Import
        gunModel[161].setRotationPoint(46.25F, -48.5F, 9F);

        gunModel[162].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, -0.75F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F); // Import
        gunModel[162].setRotationPoint(45.75F, -48F, 8.5F);

        gunModel[163].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.75F, -0.5F, -0.85F, -0.25F, -0.5F, -0.85F, -0.25F, -0.5F, 0.85F, -0.75F, -0.5F, 0.85F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F); // Import
        gunModel[163].setRotationPoint(45.75F, -47.25F, 8.75F);

        gunModel[164].addShapeBox(26F, -1F, -5F, 2, 1, 1, 0F, -0.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, 0.75F, -1.25F, 1.75F, 0.75F, -1.25F, 1.75F, 0.75F, 1.25F, -0.25F, 0.75F, 1.25F); // Import
        gunModel[164].setRotationPoint(41.75F, -48F, 8.5F);

        gunModel[165].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, -1.25F, 0.0F, 0.5F, -2.5F, 0.0F, 0.5F, -2.5F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0.25F, -1.25F, -0.25F, 0.25F); // Import
        gunModel[165].setRotationPoint(39.75F, -48.5F, 9F);

        gunModel[166].addShapeBox(26F, -1F, -5F, 2, 1, 1, 0F, -0.25F, -0.25F, 0.75F, -0.75F, -0.25F, 0.75F, -0.75F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0.75F, 1.25F, 1.75F, 0.75F, 1.25F, 1.75F, 0.75F, -1.25F, -0.25F, 0.75F, -1.25F); // Import
        gunModel[166].setRotationPoint(41.75F, -48F, 0.5F);

        gunModel[167].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, -1.25F, 0.0F, -0.25F, -2.5F, 0.0F, -0.25F, -2.5F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F); // Import
        gunModel[167].setRotationPoint(39.75F, -48.5F, 0F);

        gunModel[168].addShapeBox(26F, -1F, -5F, 56, 1, 9, 0F, 0.0F, -0.25F, -0.5F, -1.25F, -0.25F, -0.5F, -1.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[168].setRotationPoint(-13.5F, -48.75F, 0.5F);

        gunModel[169].addShapeBox(26F, -1F, -5F, 50, 5, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[169].setRotationPoint(34F, -41.5F, 11.75F);

        gunModel[170].addShapeBox(26F, -1F, -5F, 50, 3, 1, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F); // Import
        gunModel[170].setRotationPoint(34F, -44.5F, 11F);

        gunModel[171].addShapeBox(26F, -1F, -5F, 50, 1, 1, 0F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[171].setRotationPoint(34F, -45.5F, 11F);

        gunModel[172].addShapeBox(26F, -1F, -5F, 1, 5, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[172].setRotationPoint(33F, -41.5F, 11F);

        gunModel[173].addShapeBox(26F, -1F, -5F, 1, 3, 1, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[173].setRotationPoint(33F, -44.5F, 11F);

        gunModel[174].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[174].setRotationPoint(33F, -45.5F, 11F);

        gunModel[175].addShapeBox(26F, -1F, -5F, 50, 5, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[175].setRotationPoint(34F, -41.5F, -2.75F);

        gunModel[176].addShapeBox(26F, -1F, -5F, 50, 3, 1, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[176].setRotationPoint(34F, -44.5F, -2F);

        gunModel[177].addShapeBox(26F, -1F, -5F, 50, 1, 1, 0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[177].setRotationPoint(34F, -45.5F, -2F);

        gunModel[178].addShapeBox(26F, -1F, -5F, 42, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F); // Import
        gunModel[178].setRotationPoint(42F, -45.5F, -1F);

        gunModel[179].addShapeBox(26F, -1F, -5F, 1, 5, 2, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[179].setRotationPoint(33F, -41.5F, -3F);

        gunModel[180].addShapeBox(26F, -1F, -5F, 1, 3, 1, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[180].setRotationPoint(33F, -44.5F, -2F);

        gunModel[181].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[181].setRotationPoint(33F, -45.5F, -2F);

        gunModel[182].addShapeBox(26F, -1F, -5F, 3, 5, 10, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[182].setRotationPoint(14F, -45F, 0F);

        gunModel[183].addShapeBox(26F, -1F, -5F, 1, 1, 10, 0F, 0.0F, -1.0F, 1.0F, 0.5F, -1.75F, 1.0F, 0.5F, -1.75F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.75F, 0.5F, -0.5F, 1.5F, 0.5F, -0.5F, 1.5F, 0.5F, 0.0F, 0.75F, 0.5F); // Import
        gunModel[183].setRotationPoint(12.5F, -46F, 0F);

        gunModel[184].addShapeBox(26F, -1F, -5F, 1, 1, 10, 0F, 0.0F, 0.75F, 0.5F, -0.5F, 1.5F, 0.5F, -0.5F, 1.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, -1.0F, 1.0F, 0.5F, -1.75F, 1.0F, 0.5F, -1.75F, 1.0F, 0.0F, -1.0F, 1.0F); // Import
        gunModel[184].setRotationPoint(12.5F, -40F, 0F);

        gunModel[185].addShapeBox(26F, -1F, -5F, 1, 2, 10, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[185].setRotationPoint(13F, -43.5F, 0F);

        gunModel[186].addShapeBox(26F, -1F, -5F, 1, 1, 10, 0F, 0.0F, -1.0F, 0.5F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[186].setRotationPoint(13F, -44.5F, 0F);

        gunModel[187].addShapeBox(26F, -1F, -5F, 1, 1, 10, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -1.0F, 0.5F); // Import
        gunModel[187].setRotationPoint(13F, -41.5F, 0F);

        gunModel[188].addShapeBox(26F, -1F, -5F, 1, 1, 10, 0F, 0.0F, -1.0F, 1.0F, 0.5F, -0.25F, 1.0F, 0.5F, -0.25F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[188].setRotationPoint(12.5F, -41F, 0F);

        gunModel[189].addShapeBox(26F, -1F, -5F, 1, 1, 10, 0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.5F, -0.25F, 1.0F, 0.5F, -0.25F, 1.0F, 0.0F, -1.0F, 1.0F); // Import
        gunModel[189].setRotationPoint(12.5F, -45F, 0F);

        gunModel[190].addShapeBox(26F, -1F, -5F, 1, 1, 2, 0F, 2.25F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2.25F, -0.25F, 0.25F, 2.25F, -0.25F, -0.75F, 2.25F, 0.0F, 0.35F, -2.25F, 0.0F, 0.35F, -2.25F, 0.0F, -0.1F, 2.25F, 0.0F, -1.1F); // Import
        gunModel[190].setRotationPoint(35.25F, -35.25F, 10F);

        gunModel[191].addShapeBox(26F, -1F, -5F, 1, 2, 2, 0F, 2.25F, -0.5F, -0.8F, -2.25F, -0.5F, -0.8F, -2.25F, -0.5F, 0.75F, 2.25F, -0.5F, 0.0F, 2.25F, 0.0F, -0.25F, -2.25F, 0.0F, -0.25F, -2.25F, 0.0F, 0.25F, 2.25F, 0.0F, -0.75F); // Import
        gunModel[191].setRotationPoint(35.25F, -37F, 10F);

        gunModel[192].addShapeBox(26F, -1F, -5F, 6, 2, 5, 0F, 0.25F, -1.0F, -0.1F, -0.5F, -1.0F, -0.1F, -0.5F, -1.0F, -3.65F, 0.25F, -1.0F, -3.65F, 2.75F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -3.05F, 2.75F, -0.25F, -3.05F); // Import
        gunModel[192].setRotationPoint(78.5F, -35.25F, -1.75F);

        gunModel[193].addShapeBox(26F, -1F, -5F, 4, 2, 5, 0F, 0.0F, -1.0F, -0.1F, -0.5F, -1.0F, -0.1F, -0.5F, -1.0F, -3.65F, 0.0F, -1.0F, -3.65F, 2.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -3.05F, 2.5F, -0.25F, -3.05F); // Import
        gunModel[193].setRotationPoint(71.5F, -35.25F, -1.75F);

        gunModel[194].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, -0.25F, 0.75F, 1.5F, 1.75F, 0.75F, 1.5F, 1.75F, 0.75F, -1.5F, -0.25F, 0.75F, -1.5F, -0.25F, -0.25F, 0.75F, -0.75F, -0.25F, 0.75F, -0.75F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Import
        gunModel[194].setRotationPoint(73.5F, -35.75F, -1.25F);

        gunModel[195].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.5F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 2.0F, 0.0F, -0.1F, -2.5F, 0.0F, -0.1F, -2.5F, 0.0F, 0.35F, 2.0F, 0.0F, 0.35F); // Import
        gunModel[195].setRotationPoint(73.5F, -35.25F, -1.75F);

        gunModel[196].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.75F, 0.0F, 1.1F, -0.25F, 0.0F, 1.1F, -0.25F, 0.0F, -1.1F, -0.75F, 0.0F, -1.1F, 0.0F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F); // Import
        gunModel[196].setRotationPoint(73F, -35.75F, -1.25F);

        gunModel[197].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.75F, -0.5F, 0.95F, -0.25F, -0.5F, 0.95F, -0.25F, -0.5F, -0.95F, -0.75F, -0.5F, -0.95F); // Import
        gunModel[197].setRotationPoint(73F, -36.5F, -1.5F);

        gunModel[198].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.0F, 0.75F, 1.5F, -0.5F, 0.75F, 1.5F, -0.5F, 0.75F, -1.5F, 0.0F, 0.75F, -1.5F, 0.0F, -0.25F, 0.75F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F); // Import
        gunModel[198].setRotationPoint(80.5F, -35.75F, -1.25F);

        gunModel[199].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.75F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 2.25F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, 0.35F, 2.25F, 0.0F, 0.35F); // Import
        gunModel[199].setRotationPoint(80.5F, -35.25F, -1.75F);

        gunModel[200].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.75F, 0.0F, 1.1F, -0.25F, 0.0F, 1.1F, -0.25F, 0.0F, -1.1F, -0.75F, 0.0F, -1.1F, 0.0F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F); // Import
        gunModel[200].setRotationPoint(79.75F, -35.75F, -1.25F);

        gunModel[201].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.75F, -0.5F, 0.95F, -0.25F, -0.5F, 0.95F, -0.25F, -0.5F, -0.95F, -0.75F, -0.5F, -0.95F); // Import
        gunModel[201].setRotationPoint(79.75F, -36.5F, -1.5F);

        gunModel[202].addShapeBox(26F, -1F, -5F, 4, 2, 5, 0F, 0.0F, -1.0F, -0.1F, -0.5F, -1.0F, -0.1F, -0.5F, -1.0F, -3.65F, 0.0F, -1.0F, -3.65F, 2.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -3.05F, 2.5F, -0.25F, -3.05F); // Import
        gunModel[202].setRotationPoint(64.75F, -35.25F, -1.75F);

        gunModel[203].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, -0.25F, 0.75F, 1.5F, 1.75F, 0.75F, 1.5F, 1.75F, 0.75F, -1.5F, -0.25F, 0.75F, -1.5F, -0.25F, -0.25F, 0.75F, -0.75F, -0.25F, 0.75F, -0.75F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Import
        gunModel[203].setRotationPoint(66.75F, -35.75F, -1.25F);

        gunModel[204].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.5F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 2.0F, 0.0F, -0.1F, -2.5F, 0.0F, -0.1F, -2.5F, 0.0F, 0.35F, 2.0F, 0.0F, 0.35F); // Import
        gunModel[204].setRotationPoint(66.75F, -35.25F, -1.75F);

        gunModel[205].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.75F, 0.0F, 1.1F, -0.25F, 0.0F, 1.1F, -0.25F, 0.0F, -1.1F, -0.75F, 0.0F, -1.1F, 0.0F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F); // Import
        gunModel[205].setRotationPoint(66.25F, -35.75F, -1.25F);

        gunModel[206].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.75F, -0.5F, 0.95F, -0.25F, -0.5F, 0.95F, -0.25F, -0.5F, -0.95F, -0.75F, -0.5F, -0.95F); // Import
        gunModel[206].setRotationPoint(66.25F, -36.5F, -1.5F);

        gunModel[207].addShapeBox(26F, -1F, -5F, 4, 2, 5, 0F, 0.0F, -1.0F, -0.1F, -0.5F, -1.0F, -0.1F, -0.5F, -1.0F, -3.65F, 0.0F, -1.0F, -3.65F, 2.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -3.05F, 2.5F, -0.25F, -3.05F); // Import
        gunModel[207].setRotationPoint(58F, -35.25F, -1.75F);

        gunModel[208].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, -0.25F, 0.75F, 1.5F, 1.75F, 0.75F, 1.5F, 1.75F, 0.75F, -1.5F, -0.25F, 0.75F, -1.5F, -0.25F, -0.25F, 0.75F, -0.75F, -0.25F, 0.75F, -0.75F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Import
        gunModel[208].setRotationPoint(60F, -35.75F, -1.25F);

        gunModel[209].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.5F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 2.0F, 0.0F, -0.1F, -2.5F, 0.0F, -0.1F, -2.5F, 0.0F, 0.35F, 2.0F, 0.0F, 0.35F); // Import
        gunModel[209].setRotationPoint(60F, -35.25F, -1.75F);

        gunModel[210].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.75F, 0.0F, 1.1F, -0.25F, 0.0F, 1.1F, -0.25F, 0.0F, -1.1F, -0.75F, 0.0F, -1.1F, 0.0F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F); // Import
        gunModel[210].setRotationPoint(59.5F, -35.75F, -1.25F);

        gunModel[211].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.75F, -0.5F, 0.95F, -0.25F, -0.5F, 0.95F, -0.25F, -0.5F, -0.95F, -0.75F, -0.5F, -0.95F); // Import
        gunModel[211].setRotationPoint(59.5F, -36.5F, -1.5F);

        gunModel[212].addShapeBox(26F, -1F, -5F, 4, 2, 5, 0F, 0.0F, -1.0F, -0.1F, -0.5F, -1.0F, -0.1F, -0.5F, -1.0F, -3.65F, 0.0F, -1.0F, -3.65F, 2.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -3.05F, 2.5F, -0.25F, -3.05F); // Import
        gunModel[212].setRotationPoint(51F, -35.25F, -1.75F);

        gunModel[213].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, -0.25F, 0.75F, 1.5F, 1.75F, 0.75F, 1.5F, 1.75F, 0.75F, -1.5F, -0.25F, 0.75F, -1.5F, -0.25F, -0.25F, 0.75F, -0.75F, -0.25F, 0.75F, -0.75F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Import
        gunModel[213].setRotationPoint(53F, -35.75F, -1.25F);

        gunModel[214].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.5F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 2.0F, 0.0F, -0.1F, -2.5F, 0.0F, -0.1F, -2.5F, 0.0F, 0.35F, 2.0F, 0.0F, 0.35F); // Import
        gunModel[214].setRotationPoint(53F, -35.25F, -1.75F);

        gunModel[215].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.75F, 0.0F, 1.1F, -0.25F, 0.0F, 1.1F, -0.25F, 0.0F, -1.1F, -0.75F, 0.0F, -1.1F, 0.0F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F); // Import
        gunModel[215].setRotationPoint(52.5F, -35.75F, -1.25F);

        gunModel[216].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.75F, -0.5F, 0.95F, -0.25F, -0.5F, 0.95F, -0.25F, -0.5F, -0.95F, -0.75F, -0.5F, -0.95F); // Import
        gunModel[216].setRotationPoint(52.5F, -36.5F, -1.5F);

        gunModel[217].addShapeBox(26F, -1F, -5F, 4, 2, 5, 0F, 0.0F, -1.0F, -0.1F, -0.5F, -1.0F, -0.1F, -0.5F, -1.0F, -3.65F, 0.0F, -1.0F, -3.65F, 2.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -3.05F, 2.5F, -0.25F, -3.05F); // Import
        gunModel[217].setRotationPoint(44.25F, -35.25F, -1.75F);

        gunModel[218].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, -0.25F, 0.75F, 1.5F, 1.75F, 0.75F, 1.5F, 1.75F, 0.75F, -1.5F, -0.25F, 0.75F, -1.5F, -0.25F, -0.25F, 0.75F, -0.75F, -0.25F, 0.75F, -0.75F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Import
        gunModel[218].setRotationPoint(46.25F, -35.75F, -1.25F);

        gunModel[219].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.5F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 2.0F, 0.0F, -0.1F, -2.5F, 0.0F, -0.1F, -2.5F, 0.0F, 0.35F, 2.0F, 0.0F, 0.35F); // Import
        gunModel[219].setRotationPoint(46.25F, -35.25F, -1.75F);

        gunModel[220].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.75F, 0.0F, 1.1F, -0.25F, 0.0F, 1.1F, -0.25F, 0.0F, -1.1F, -0.75F, 0.0F, -1.1F, 0.0F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F); // Import
        gunModel[220].setRotationPoint(45.75F, -35.75F, -1.25F);

        gunModel[221].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.75F, -0.5F, 0.95F, -0.25F, -0.5F, 0.95F, -0.25F, -0.5F, -0.95F, -0.75F, -0.5F, -0.95F); // Import
        gunModel[221].setRotationPoint(45.75F, -36.5F, -1.5F);

        gunModel[222].addShapeBox(26F, -1F, -5F, 6, 2, 5, 0F, 2.25F, -1.0F, -0.1F, -1.5F, -1.0F, -0.1F, -1.5F, -1.0F, -3.65F, 2.25F, -1.0F, -3.65F, 2.25F, -0.25F, -0.5F, -1.5F, -0.25F, -0.5F, -1.5F, -0.25F, -3.05F, 2.25F, -0.25F, -3.05F); // Import
        gunModel[222].setRotationPoint(36.25F, -35.25F, -1.75F);

        gunModel[223].addShapeBox(26F, -1F, -5F, 9, 1, 1, 0F, 0.25F, 0.75F, 1.5F, 1.75F, 0.75F, 1.5F, 1.75F, 0.75F, -1.5F, 0.25F, 0.75F, -1.5F, 0.25F, -0.25F, 0.75F, -0.75F, -0.25F, 0.75F, -0.75F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F); // Import
        gunModel[223].setRotationPoint(34.25F, -35.75F, -1.25F);

        gunModel[224].addShapeBox(26F, -1F, -5F, 7, 1, 1, 0F, 2.25F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, -0.25F, 2.25F, -0.25F, -0.25F, 2.25F, 0.0F, -0.1F, -2.5F, 0.0F, -0.1F, -2.5F, 0.0F, 0.35F, 2.25F, 0.0F, 0.35F); // Import
        gunModel[224].setRotationPoint(36.25F, -35.25F, -1.75F);

        gunModel[225].addShapeBox(26F, -1F, -5F, 50, 1, 6, 0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[225].setRotationPoint(34F, -32.5F, 2F);

        gunModel[226].addShapeBox(26F, -1F, -5F, 50, 1, 6, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[226].setRotationPoint(34F, -33.5F, 2F);

        gunModel[227].addShapeBox(26F, -1F, -5F, 50, 1, 8, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[227].setRotationPoint(34F, -33F, 1F);

        gunModel[228].addShapeBox(26F, -1F, -5F, 50, 1, 1, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F); // Import
        gunModel[228].setRotationPoint(34F, -33.5F, -0.5F);

        gunModel[229].addShapeBox(26F, -1F, -5F, 50, 1, 2, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F); // Import
        gunModel[229].setRotationPoint(34F, -33F, 7.5F);

        gunModel[230].addShapeBox(26F, -1F, -5F, 50, 1, 2, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F); // Import
        gunModel[230].setRotationPoint(34F, -33F, 0.5F);

        gunModel[231].addShapeBox(26F, -1F, -5F, 50, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[231].setRotationPoint(38F, -39F, 2F);

        gunModel[232].addShapeBox(26F, -1F, -5F, 50, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[232].setRotationPoint(38F, -41F, 2F);

        gunModel[233].addShapeBox(26F, -1F, -5F, 50, 2, 6, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[233].setRotationPoint(38F, -43F, 2F);

        gunModel[234].addShapeBox(26F, -1F, -5F, 40, 2, 7, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F); // Import
        gunModel[234].setRotationPoint(41.5F, -38.5F, 1.5F);

        gunModel[235].addShapeBox(26F, -1F, -5F, 40, 2, 7, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        gunModel[235].setRotationPoint(41.5F, -41F, 1.5F);

        gunModel[236].addShapeBox(26F, -1F, -5F, 40, 2, 7, 0F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        gunModel[236].setRotationPoint(41.5F, -43.5F, 1.5F);

        gunModel[237].addShapeBox(26F, -1F, -5F, 1, 9, 7, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.25F, 0.0F); // Import
        gunModel[237].setRotationPoint(-2F, -23F, 1.5F);

        gunModel[238].addShapeBox(26F, -1F, -5F, 2, 3, 7, 0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[238].setRotationPoint(-1F, -17F, 1.5F);

        gunModel[239].addShapeBox(26F, -1F, -5F, 2, 1, 7, 0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[239].setRotationPoint(1F, -15F, 1.5F);

        gunModel[240].addShapeBox(26F, -1F, -5F, 2, 1, 7, 0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[240].setRotationPoint(3F, -14F, 1.5F);

        gunModel[241].addShapeBox(26F, -1F, -5F, 4, 1, 7, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F); // Import
        gunModel[241].setRotationPoint(5F, -14F, 1.5F);

        gunModel[242].addShapeBox(26F, -1F, -5F, 2, 1, 7, 0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F); // Import
        gunModel[242].setRotationPoint(9F, -14F, 1.5F);

        gunModel[243].addShapeBox(26F, -1F, -5F, 2, 1, 7, 0F, 0.0F, -0.75F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F); // Import
        gunModel[243].setRotationPoint(11F, -15F, 1.5F);

        gunModel[244].addShapeBox(26F, -1F, -5F, 1, 9, 7, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, -0.5F, 0.0F); // Import
        gunModel[244].setRotationPoint(-2.5F, -23F, 1.5F);

        gunModel[245].addShapeBox(26F, -1F, -5F, 36, 3, 8, 0F, 0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F); // Import
        gunModel[245].setRotationPoint(-23F, -44F, 1F);

        gunModel[246].addShapeBox(26F, -1F, -5F, 23, 4, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[246].setRotationPoint(-12F, -30F, 0.5F);

        gunModel[247].addShapeBox(26F, -1F, -5F, 2, 1, 7, 0F, 0.75F, -0.75F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, 2.0F, 0.0F, 0.75F, -0.75F, 0.0F, 0.5F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.5F, 1.5F, 0.0F); // Import
        gunModel[247].setRotationPoint(13F, -16F, 1.5F);

        gunModel[248].addShapeBox(26F, -1F, -5F, 1, 1, 7, 0F, 0.25F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.25F, 2.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F); // Import
        gunModel[248].setRotationPoint(15F, -16F, 1.5F);

        gunModel[249].addShapeBox(26F, -1F, -5F, 1, 1, 7, 0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F); // Import
        gunModel[249].setRotationPoint(15F, -13.5F, 1.5F);

        gunModel[250].addShapeBox(26F, -1F, -5F, 1, 1, 7, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F); // Import
        gunModel[250].setRotationPoint(15F, -12.75F, 1.5F);

        gunModel[251].addShapeBox(26F, -1F, -5F, 1, 2, 7, 0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F); // Import
        gunModel[251].setRotationPoint(15F, -20F, 1.5F);

        gunModel[252].addShapeBox(26F, -1F, -5F, 1, 2, 7, 0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F); // Import
        gunModel[252].setRotationPoint(15F, -22F, 1.5F);

        gunModel[253].addShapeBox(26F, -1F, -5F, 2, 1, 7, 0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[253].setRotationPoint(14F, -23F, 1.5F);

        gunModel[254].addShapeBox(26F, -1F, -5F, 1, 10, 8, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 1.5F, 0.0F, 0.5F, 1.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[254].setRotationPoint(16F, -22F, 1F);

        gunModel[255].addShapeBox(26F, -1F, -5F, 1, 8, 11, 0F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[255].setRotationPoint(11F, -31.5F, -0.5F);

        gunModel[256].addShapeBox(26F, -1F, -5F, 1, 1, 11, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[256].setRotationPoint(11F, -33.25F, -0.5F);

        gunModel[257].addShapeBox(26F, -1F, -5F, 1, 1, 11, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[257].setRotationPoint(11F, -34.25F, -0.5F);

        gunModel[258].addShapeBox(26F, -1F, -5F, 21, 10, 11, 0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[258].setRotationPoint(12F, -33.5F, -0.5F);

        gunModel[259].addShapeBox(26F, -1F, -5F, 1, 1, 8, 0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[259].setRotationPoint(16F, -23.5F, 1F);

        gunModel[260].addShapeBox(26F, -1F, -5F, 16, 1, 1, 0F, 0.0F, 0.15F, -1.0F, 0.5F, 0.15F, -1.0F, 0.5F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[260].setRotationPoint(16.5F, -35.25F, 9.5F);

        gunModel[261].addShapeBox(26F, -1F, -5F, 13, 11, 11, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[261].setRotationPoint(17F, -23.5F, -0.5F);

        gunModel[262].addShapeBox(26F, -1F, -5F, 2, 11, 11, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[262].setRotationPoint(30F, -23.5F, -0.5F);

        gunModel[263].addShapeBox(26F, -1F, -5F, 2, 11, 11, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[263].setRotationPoint(32F, -23.5F, -0.5F);

        gunModel[264].addShapeBox(26F, -1F, -5F, 2, 10, 11, 0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        gunModel[264].setRotationPoint(34F, -23.5F, -0.5F);

        gunModel[265].addShapeBox(26F, -1F, -5F, 2, 2, 11, 0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[265].setRotationPoint(33F, -25.5F, -0.5F);

        gunModel[266].addShapeBox(26F, -1F, -5F, 2, 2, 11, 0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[266].setRotationPoint(33F, -27F, -0.5F);

        gunModel[267].addShapeBox(26F, -1F, -5F, 2, 2, 11, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[267].setRotationPoint(33F, -28.5F, -0.5F);

        gunModel[268].addShapeBox(26F, -1F, -5F, 13, 1, 11, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -0.5F, 1.0F); // Import
        gunModel[268].setRotationPoint(17F, -12F, -0.5F);

        gunModel[269].addShapeBox(26F, -1F, -5F, 13, 1, 11, 0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -0.5F, 1.0F); // Import
        gunModel[269].setRotationPoint(17F, -11.25F, -0.5F);

        gunModel[270].addShapeBox(26F, -1F, -5F, 2, 9, 11, 0F, 1.0F, 0.0F, 0.0F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F); // Import
        gunModel[270].setRotationPoint(35F, -23.5F, -0.5F);

        gunModel[271].addShapeBox(26F, -1F, -5F, 2, 1, 11, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -0.5F, 1.0F); // Import
        gunModel[271].setRotationPoint(30F, -12.5F, -0.5F);

        gunModel[272].addShapeBox(26F, -1F, -5F, 2, 1, 11, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -1.25F, 1.0F, 0.0F, -1.25F, 1.0F, 0.0F, -0.5F, 1.0F); // Import
        gunModel[272].setRotationPoint(32F, -13F, -0.5F);

        gunModel[273].addShapeBox(26F, -1F, -5F, 2, 1, 11, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 1.0F, -0.5F, -1.5F, 1.0F, -0.5F, -1.5F, 1.0F, 0.0F, -0.5F, 1.0F); // Import
        gunModel[273].setRotationPoint(34F, -13.75F, -0.5F);

        gunModel[274].addShapeBox(26F, -1F, -5F, 2, 1, 11, 0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -0.5F, 1.0F); // Import
        gunModel[274].setRotationPoint(30F, -11.75F, -0.5F);

        gunModel[275].addShapeBox(26F, -1F, -5F, 2, 1, 11, 0F, 0.0F, 0.25F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -1.25F, 1.0F, 0.0F, -1.25F, 1.0F, 0.0F, -0.5F, 1.0F); // Import
        gunModel[275].setRotationPoint(32F, -12.25F, -0.5F);

        gunModel[276].addShapeBox(26F, -1F, -5F, 2, 1, 11, 0F, 0.0F, 0.25F, 1.0F, -0.5F, 1.25F, 1.0F, -0.5F, 1.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, -0.5F, 1.0F, -0.5F, -1.5F, 1.0F, -0.5F, -1.5F, 1.0F, 0.0F, -0.5F, 1.0F); // Import
        gunModel[276].setRotationPoint(34F, -13F, -0.5F);

        gunModel[277].addShapeBox(26F, -1F, -5F, 2, 9, 9, 0F, 0.75F, 0.0F, 0.5F, -2.25F, 0.0F, -0.25F, -2.25F, 0.0F, -0.25F, 0.75F, 0.0F, 0.5F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0.5F); // Import
        gunModel[277].setRotationPoint(35.5F, -23.5F, 0.5F);

        gunModel[278].addShapeBox(26F, -1F, -5F, 2, 2, 11, 0F, 0.5F, 0.0F, 0.0F, -1.65F, 0.0F, -0.5F, -1.65F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[278].setRotationPoint(34F, -25.5F, -0.5F);

        gunModel[279].addShapeBox(26F, -1F, -5F, 2, 2, 9, 0F, 0.65F, 0.0F, 0.5F, -2.1F, 0.0F, -0.25F, -2.1F, 0.0F, -0.25F, 0.65F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -1.75F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, 0.25F, 0.0F, 0.5F); // Import
        gunModel[279].setRotationPoint(35F, -25.5F, 0.5F);

        gunModel[280].addShapeBox(26F, -1F, -5F, 2, 1, 11, 0F, 0.5F, 0.5F, 0.0F, -1.65F, 0.5F, -0.5F, -1.65F, 0.5F, -0.5F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, -1.65F, 0.0F, -0.5F, -1.65F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F); // Import
        gunModel[280].setRotationPoint(34F, -26.5F, -0.5F);

        gunModel[281].addShapeBox(26F, -1F, -5F, 2, 1, 9, 0F, 0.75F, 0.5F, 0.5F, -2.2F, 0.5F, -0.25F, -2.2F, 0.5F, -0.25F, 0.75F, 0.5F, 0.5F, 0.75F, 0.0F, 0.5F, -2.2F, 0.0F, -0.25F, -2.2F, 0.0F, -0.25F, 0.75F, 0.0F, 0.5F); // Import
        gunModel[281].setRotationPoint(35.1F, -26.5F, 0.5F);

        gunModel[282].addShapeBox(26F, -1F, -5F, 1, 1, 11, 0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 1.0F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, 0.0F, -0.5F, 1.0F); // Import
        gunModel[282].setRotationPoint(35.5F, -14.75F, -0.5F);

        gunModel[283].addShapeBox(26F, -1F, -5F, 1, 1, 11, 0F, 0.0F, 0.25F, 1.0F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, 0.0F, 0.25F, 1.0F, 0.0F, -0.5F, 1.0F, -0.25F, -1.0F, 0.25F, -0.25F, -1.0F, 0.25F, 0.0F, -0.5F, 1.0F); // Import
        gunModel[283].setRotationPoint(35.5F, -14F, -0.5F);

        gunModel[284].addShapeBox(26F, -1F, -5F, 1, 1, 11, 0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, 0.25F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, 0.0F, -0.75F, 0.25F); // Import
        gunModel[284].setRotationPoint(36.25F, -14.75F, -0.5F);

        gunModel[285].addShapeBox(26F, -1F, -5F, 1, 1, 11, 0F, 0.0F, 0.25F, 0.25F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0.0F, 0.25F, 0.25F, 0.0F, -0.75F, 0.25F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, 0.0F, -0.75F, 0.25F); // Import
        gunModel[285].setRotationPoint(36.25F, -14.25F, -0.5F);

        gunModel[286].addShapeBox(26F, -1F, -5F, 14, 2, 12, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[286].setRotationPoint(12F, -33.5F, -1F);

        gunModel[287].addShapeBox(26F, -1F, -5F, 17, 2, 3, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F); // Import
        gunModel[287].setRotationPoint(20.5F, -31.5F, -1F);

        gunModel[288].addShapeBox(26F, -1F, -5F, 1, 3, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[288].setRotationPoint(37.5F, -31.5F, -1.25F);

        gunModel[289].addShapeBox(26F, -1F, -5F, 1, 2, 3, 0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[289].setRotationPoint(38.5F, -31F, -1.25F);

        gunModel[290].addShapeBox(26F, -1F, -5F, 1, 1, 3, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[290].setRotationPoint(36.5F, -29.5F, -1.25F);

        gunModel[291].addShapeBox(26F, -1F, -5F, 1, 1, 3, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        gunModel[291].setRotationPoint(35.5F, -29.5F, -1.25F);

        gunModel[292].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, -0.5F, 0.0F); // Import
        gunModel[292].setRotationPoint(34.5F, -29.5F, -1.25F);

        gunModel[293].addShapeBox(26F, -1F, -5F, 1, 2, 12, 0F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[293].setRotationPoint(26F, -33.5F, -1F);

        gunModel[294].addShapeBox(26F, -1F, -5F, 1, 2, 12, 0F, -0.25F, -1.0F, 0.25F, -0.25F, -2.0F, 0.25F, -0.25F, -2.0F, 0.25F, -0.25F, -1.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F); // Import
        gunModel[294].setRotationPoint(26.75F, -33.5F, -1F);

        gunModel[295].addShapeBox(26F, -1F, -5F, 2, 1, 7, 0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F); // Import
        gunModel[295].setRotationPoint(14F, -23.5F, 1.5F);

        gunModel[296].addShapeBox(26F, -1F, -5F, 2, 1, 11, 0F, -1.0F, 0.5F, 0.0F, -0.15F, 0.5F, -0.5F, -0.15F, 0.5F, -0.5F, -1.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -1.65F, 0.5F, -0.5F, -1.65F, 0.5F, -0.5F, 0.5F, 0.5F, 0.0F); // Import
        gunModel[296].setRotationPoint(34F, -28.5F, -0.5F);

        gunModel[297].addShapeBox(26F, -1F, -5F, 2, 1, 11, 0F, -0.85F, 0.5F, -0.5F, -0.6F, 0.5F, -1.25F, -0.6F, 0.5F, -1.25F, -0.85F, 0.5F, -0.5F, 0.65F, 0.5F, -0.5F, -2.1F, 0.5F, -1.25F, -2.1F, 0.5F, -1.25F, 0.65F, 0.5F, -0.5F); // Import
        gunModel[297].setRotationPoint(35F, -28.5F, -0.5F);

        gunModel[298].addShapeBox(26F, -1F, -5F, 1, 3, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[298].setRotationPoint(37.5F, -31.5F, 8.25F);

        gunModel[299].addShapeBox(26F, -1F, -5F, 1, 2, 3, 0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[299].setRotationPoint(38.5F, -31F, 8.25F);

        gunModel[300].addShapeBox(26F, -1F, -5F, 1, 1, 3, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[300].setRotationPoint(36.5F, -29.5F, 8.25F);

        gunModel[301].addShapeBox(26F, -1F, -5F, 1, 1, 3, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        gunModel[301].setRotationPoint(35.5F, -29.5F, 8.25F);

        gunModel[302].addShapeBox(26F, -1F, -5F, 1, 1, 12, 0F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F); // Import
        gunModel[302].setRotationPoint(19.5F, -29.5F, -1F);

        gunModel[303].addShapeBox(26F, -1F, -5F, 1, 1, 12, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -1.0F, 0.25F); // Import
        gunModel[303].setRotationPoint(19F, -31.5F, -1F);

        gunModel[304].addShapeBox(26F, -1F, -5F, 1, 1, 10, 0F, -0.5F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, -0.5F, 0.5F, 1.0F, -0.5F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, -0.5F, 0.5F, 1.0F); // Import
        gunModel[304].setRotationPoint(16F, -38F, 0F);

        gunModel[305].addShapeBox(26F, -1F, -5F, 1, 1, 12, 0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, -0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.5F, -0.25F, 0.25F); // Import
        gunModel[305].setRotationPoint(19.5F, -31.5F, -1F);

        gunModel[306].addShapeBox(26F, -1F, -5F, 1, 1, 12, 0F, -0.5F, -0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -0.5F, 0.0F, 0.25F); // Import
        gunModel[306].setRotationPoint(19F, -29.5F, -1F);

        gunModel[307].addShapeBox(26F, -1F, -5F, 2, 1, 12, 0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F); // Import
        gunModel[307].setRotationPoint(20F, -29.5F, -1F);

        gunModel[308].addShapeBox(26F, -1F, -5F, 1, 1, 12, 0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F); // Import
        gunModel[308].setRotationPoint(21.5F, -29F, -1F);

        gunModel[309].addShapeBox(26F, -1F, -5F, 1, 1, 12, 0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F); // Import
        gunModel[309].setRotationPoint(20F, -26.25F, -1F);

        gunModel[310].addShapeBox(26F, -1F, -5F, 1, 1, 12, 0F, 1.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 1.25F, 0.0F, 0.25F, 1.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 1.25F, 0.0F, 0.25F); // Import
        gunModel[310].setRotationPoint(20F, -25.25F, -1F);

        gunModel[311].addShapeBox(26F, -1F, -5F, 1, 1, 12, 0F, 1.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 1.25F, 0.0F, 0.25F, 1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 1.25F, 0.0F, 0.25F); // Import
        gunModel[311].setRotationPoint(20F, -24.25F, -1F);

        gunModel[312].addShapeBox(26F, -1F, -5F, 1, 1, 12, 0F, 1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 1.25F, 0.0F, 0.25F, 1.25F, -0.5F, 0.25F, -2.25F, -0.5F, 0.25F, -2.25F, -0.5F, 0.25F, 1.25F, -0.5F, 0.25F); // Import
        gunModel[312].setRotationPoint(20F, -23.25F, -1F);

        gunModel[313].addShapeBox(26F, -1F, -5F, 1, 1, 12, 0F, 0.0F, -1.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[313].setRotationPoint(19F, -26.25F, -1F);

        gunModel[314].addShapeBox(26F, -1F, -5F, 1, 2, 12, 0F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F); // Import
        gunModel[314].setRotationPoint(18F, -25.25F, -1F);

        gunModel[315].addShapeBox(26F, -1F, -5F, 3, 2, 13, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[315].setRotationPoint(15F, -25.25F, -1.5F);

        gunModel[316].addShapeBox(26F, -1F, -5F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, 0.0F, 0.5F, -0.5F); // Import
        gunModel[316].setRotationPoint(18F, -25.25F, -1.5F);

        gunModel[317].addShapeBox(26F, -1F, -5F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, 0.0F, 0.5F, -0.5F); // Import
        gunModel[317].setRotationPoint(18F, -25.25F, 11F);

        gunModel[318].addShapeBox(26F, -1F, -5F, 1, 2, 13, 0F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F); // Import
        gunModel[318].setRotationPoint(14F, -25.25F, -1.5F);

        gunModel[319].addShapeBox(26F, -1F, -5F, 1, 1, 13, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.5F); // Import
        gunModel[319].setRotationPoint(13F, -24.25F, -1.5F);

        gunModel[320].addShapeBox(26F, -1F, -5F, 4, 3, 10, 0F, -0.75F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F); // Import
        gunModel[320].setRotationPoint(13.5F, -28.5F, 1F);

        gunModel[321].addShapeBox(26F, -1F, -5F, 1, 3, 10, 0F, 0.0F, -0.25F, 0.5F, -0.5F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.5F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, 0.0F, -0.25F, 0.5F); // Import
        gunModel[321].setRotationPoint(17.5F, -28.5F, 1F);

        gunModel[322].addShapeBox(26F, -1F, -5F, 1, 3, 10, 0F, 0.0F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[322].setRotationPoint(17F, -28.5F, 1F);

        gunModel[323].addShapeBox(26F, -1F, -5F, 7, 3, 11, 0F, 0.0F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, 0.0F, -0.5F, -0.1F); // Import
        gunModel[323].setRotationPoint(17.5F, -28.5F, 0F);

        gunModel[324].addShapeBox(26F, -1F, -5F, 1, 3, 11, 0F, 0.0F, -0.5F, -0.1F, -0.5F, -1.0F, -0.1F, -0.5F, -1.0F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.1F, -0.5F, -1.0F, -0.1F, -0.5F, -1.0F, -0.1F, 0.0F, -0.5F, -0.1F); // Import
        gunModel[324].setRotationPoint(24F, -28.5F, 0F);

        gunModel[325].addShapeBox(26F, -1F, -5F, 1, 3, 11, 0F, 0.0F, -1.0F, -0.1F, -0.75F, -1.35F, -0.1F, -0.75F, -1.35F, -0.1F, 0.0F, -1.0F, -0.1F, 0.0F, -1.0F, -0.1F, -0.75F, -1.35F, -0.1F, -0.75F, -1.35F, -0.1F, 0.0F, -1.0F, -0.1F); // Import
        gunModel[325].setRotationPoint(24.5F, -28.5F, 0F);

        gunModel[326].addShapeBox(26F, -1F, -5F, 3, 2, 9, 0F, 0.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, 0.0F, 0.25F, 0.25F); // Import
        gunModel[326].setRotationPoint(12F, -28F, 2F);

        gunModel[327].addShapeBox(26F, -1F, -5F, 3, 1, 9, 0F, 0.0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, 0.75F, 0.0F, -0.25F, 0.25F, -0.75F, 0.0F, 0.5F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -0.75F, 0.0F, 0.0F); // Import
        gunModel[327].setRotationPoint(12F, -26F, 2F);

        gunModel[328].addShapeBox(26F, -1F, -5F, 3, 1, 9, 0F, -0.75F, 0.0F, -0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -0.75F, 0.0F, -0.25F, 0.0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, 0.75F, 0.0F, -0.25F, 0.25F); // Import
        gunModel[328].setRotationPoint(12F, -29F, 2F);

        gunModel[329].addShapeBox(26F, -1F, -5F, 1, 1, 3, 0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F); // Import
        gunModel[329].setRotationPoint(3F, -21F, 3.5F);

        gunModel[330].addShapeBox(26F, -1F, -5F, 1, 2, 3, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); // Import
        gunModel[330].setRotationPoint(3F, -22.75F, 3.5F);

        gunModel[331].addShapeBox(26F, -1F, -5F, 1, 1, 3, 0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[331].setRotationPoint(4F, -23.75F, 3.5F);

        gunModel[332].addShapeBox(26F, -1F, -5F, 1, 1, 3, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F); // Import
        gunModel[332].setRotationPoint(3F, -19F, 3.5F);

        gunModel[333].addShapeBox(26F, -1F, -5F, 1, 1, 3, 0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[333].setRotationPoint(3F, -18F, 3.5F);

        gunModel[334].addShapeBox(26F, -1F, -5F, 1, 1, 3, 0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.75F, 0.5F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.75F, 0.5F, 0.0F); // Import
        gunModel[334].setRotationPoint(3F, -17F, 3.5F);

        gunModel[335].addShapeBox(26F, -1F, -5F, 1, 1, 3, 0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[335].setRotationPoint(3.5F, -21F, 3.5F);

        gunModel[336].addShapeBox(26F, -1F, -5F, 1, 1, 13, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.25F, -1.0F); // Import
        gunModel[336].setRotationPoint(12F, -24.25F, -1.5F);

        gunModel[337].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, 0.0F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.25F, 1.0F, -0.25F, -1.0F, 1.0F, -0.25F, -1.0F, 1.0F, 0.0F, -0.25F, 1.0F); // Import
        gunModel[337].setRotationPoint(12.5F, -38.5F, 1F);

        gunModel[338].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, -0.25F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, -1.0F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, -0.25F, -1.0F, 1.0F); // Import
        gunModel[338].setRotationPoint(15.5F, -38.5F, 1F);

        gunModel[339].addShapeBox(26F, -1F, -5F, 4, 3, 9, 0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F); // Import
        gunModel[339].setRotationPoint(12.5F, -36.5F, 0.5F);

        gunModel[340].addShapeBox(26F, -1F, -5F, 4, 1, 9, 0F, 0.0F, 0.5F, 1.5F, 0.0F, 0.5F, 1.5F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.5F, 0.0F, 0.5F, 1.5F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F); // Import
        gunModel[340].setRotationPoint(12.5F, -38F, 0.5F);

        gunModel[341].addShapeBox(26F, -1F, -5F, 3, 2, 1, 0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F); // Import
        gunModel[341].setRotationPoint(13F, -37F, 10.5F);

        gunModel[342].addShapeBox(26F, -1F, -5F, 3, 1, 1, 0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F); // Import
        gunModel[342].setRotationPoint(13F, -38F, 10.5F);

        gunModel[343].addShapeBox(26F, -1F, -5F, 3, 1, 1, 0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F); // Import
        gunModel[343].setRotationPoint(13F, -38.5F, 10.5F);

        gunModel[344].addShapeBox(26F, -1F, -5F, 3, 1, 1, 0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F); // Import
        gunModel[344].setRotationPoint(13F, -35F, 10.5F);

        gunModel[345].addShapeBox(26F, -1F, -5F, 3, 1, 1, 0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F); // Import
        gunModel[345].setRotationPoint(13F, -34.5F, 10.5F);

        gunModel[346].addShapeBox(26F, -1F, -5F, 3, 4, 1, 0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F); // Import
        gunModel[346].setRotationPoint(13F, -34.5F, 10.25F);

        gunModel[347].addShapeBox(26F, -1F, -5F, 5, 2, 1, 0F, -0.75F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F); // Import
        gunModel[347].setRotationPoint(14.5F, -31.5F, 10.25F);

        gunModel[348].addShapeBox(26F, -1F, -5F, 2, 2, 1, 0F, -0.25F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F); // Import
        gunModel[348].setRotationPoint(14F, -31.25F, 10.25F);

        gunModel[349].addShapeBox(26F, -1F, -5F, 2, 2, 1, 0F, -0.25F, -0.25F, 0.25F, -1.25F, -0.25F, 0.25F, -1.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -1.0F, 0.25F, -1.25F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, -0.25F, -1.0F, 0.25F); // Import
        gunModel[349].setRotationPoint(13.5F, -31.25F, 10.25F);

        gunModel[350].addShapeBox(26F, -1F, -5F, 2, 2, 1, 0F, -1.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, -0.5F, 0.25F, -0.25F, -1.0F, 0.25F, -0.25F, -1.0F, 0.25F, -1.25F, -0.5F, 0.25F); // Import
        gunModel[350].setRotationPoint(17.75F, -31.25F, 10.25F);

        gunModel[351].addShapeBox(26F, -1F, -5F, 5, 3, 6, 0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, -2.25F, 0.0F, 0.5F, -2.25F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[351].setRotationPoint(35.5F, -31.5F, 2F);

        gunModel[352].addShapeBox(26F, -1F, -5F, 1, 2, 6, 0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.25F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, -0.5F, -1.25F, 0.0F); // Import
        gunModel[352].setRotationPoint(40.5F, -31.5F, 2F);

        gunModel[353].addShapeBox(26F, -1F, -5F, 17, 2, 3, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F); // Import
        gunModel[353].setRotationPoint(20.5F, -31.5F, 8F);

        gunModel[354].addShapeBox(26F, -1F, -5F, 4, 3, 10, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[354].setRotationPoint(32.5F, -34.5F, 0F);

        gunModel[355].addShapeBox(26F, -1F, -5F, 1, 3, 10, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[355].setRotationPoint(36.5F, -34.5F, 0F);

        gunModel[356].addShapeBox(26F, -1F, -5F, 1, 1, 2, 0F, 2.25F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2.25F, -0.25F, -0.1F, 2.25F, -0.25F, -1.1F, 2.25F, 0.0F, 0.35F, -2.25F, 0.0F, 0.35F, -2.25F, 0.0F, -0.5F, 2.25F, 0.0F, -1.5F); // Import
        gunModel[356].setRotationPoint(35.25F, -34.5F, 10F);

        gunModel[357].addShapeBox(26F, -1F, -5F, 1, 1, 2, 0F, 2.25F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2.25F, -0.25F, 0.0F, 2.25F, -0.25F, -1.0F, 2.25F, -0.15F, 0.35F, -2.25F, -0.15F, 0.35F, -2.25F, -0.15F, -1.5F, 2.25F, -0.15F, -1.5F); // Import
        gunModel[357].setRotationPoint(35.25F, -33.75F, 9.5F);

        gunModel[358].addShapeBox(26F, -1F, -5F, 1, 1, 2, 0F, 2.25F, -0.25F, -0.75F, -2.25F, -0.25F, 0.25F, -2.25F, -0.25F, -0.25F, 2.25F, -0.25F, -0.25F, 2.25F, 0.0F, -1.1F, -2.25F, 0.0F, -0.1F, -2.25F, 0.0F, 0.35F, 2.25F, 0.0F, 0.35F); // Import
        gunModel[358].setRotationPoint(35.25F, -35.25F, -1.75F);

        gunModel[359].addShapeBox(26F, -1F, -5F, 1, 1, 2, 0F, 2.25F, -0.25F, -1.1F, -2.25F, -0.25F, -0.1F, -2.25F, -0.25F, -0.25F, 2.25F, -0.25F, -0.25F, 2.25F, 0.0F, -1.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, 0.35F, 2.25F, 0.0F, 0.35F); // Import
        gunModel[359].setRotationPoint(35.25F, -34.5F, -1.75F);

        gunModel[360].addShapeBox(26F, -1F, -5F, 1, 1, 2, 0F, 2.25F, -0.25F, -1.0F, -2.25F, -0.25F, 0.0F, -2.25F, -0.25F, -0.25F, 2.25F, -0.25F, -0.25F, 2.25F, -0.15F, -1.5F, -2.25F, -0.15F, -1.5F, -2.25F, -0.15F, 0.35F, 2.25F, -0.15F, 0.35F); // Import
        gunModel[360].setRotationPoint(35.25F, -33.75F, -1.25F);

        gunModel[361].addShapeBox(26F, -1F, -5F, 1, 2, 2, 0F, 2.25F, -0.5F, 0.25F, -2.25F, -0.5F, 1.0F, -2.25F, -0.5F, -0.8F, 2.25F, -0.5F, -0.8F, 2.25F, 0.0F, -0.75F, -2.25F, 0.0F, 0.25F, -2.25F, 0.0F, -0.25F, 2.25F, 0.0F, -0.25F); // Import
        gunModel[361].setRotationPoint(35.25F, -37F, -1.75F);

        gunModel[362].addShapeBox(26F, -1F, -5F, 5, 1, 9, 0F, 0.0F, 3.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 3.0F, 0.5F, 1.5F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, -3.0F, 0.0F); // Import
        gunModel[362].setRotationPoint(-23F, -33.25F, 0.5F);

        gunModel[363].addShapeBox(26F, -1F, -5F, 1, 3, 10, 0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, -1.5F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.5F, 1.0F); // Import
        gunModel[363].setRotationPoint(-20F, -39.5F, 0F);

        gunModel[364].addShapeBox(26F, -1F, -5F, 1, 1, 10, 0F, -0.5F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, -0.5F, 0.5F, 1.0F, -0.5F, -1.0F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, -0.5F, -1.0F, 1.0F); // Import
        gunModel[364].setRotationPoint(-21F, -39.5F, 0F);

        gunModel[365].addShapeBox(26F, -1F, -5F, 2, 3, 10, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.75F, 0.45F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.75F, 0.45F); // Import
        gunModel[365].setRotationPoint(-18F, -36.5F, 0F);

        gunModel[366].addShapeBox(26F, -1F, -5F, 1, 3, 10, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -3.0F, 1.0F, 0.0F, -1.75F, 0.45F, 0.0F, -1.75F, 0.45F, 0.0F, -3.0F, 1.0F); // Import
        gunModel[366].setRotationPoint(-19F, -36.5F, 0F);

        gunModel[367].addShapeBox(26F, -1F, -5F, 2, 1, 9, 0F, 0.0F, 1.0F, 0.95F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.95F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[367].setRotationPoint(-18F, -34.25F, 0.5F);

        gunModel[368].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, 0.0F, 2.25F, 1.5F, 0.0F, 1.0F, 0.95F, 0.0F, 1.0F, 0.95F, 0.0F, 2.25F, 1.5F, 0.0F, -0.6F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.6F, 0.5F); // Import
        gunModel[368].setRotationPoint(-19F, -34.25F, 0.5F);

        gunModel[369].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, 0.0F, 3.25F, 1.5F, 0.0F, 1.75F, 1.5F, 0.0F, 1.75F, 1.5F, 0.0F, 3.25F, 1.5F, 0.0F, -0.7F, 0.5F, 0.0F, -0.1F, 0.5F, 0.0F, -0.1F, 0.5F, 0.0F, -0.7F, 0.5F); // Import
        gunModel[369].setRotationPoint(-20F, -34.75F, 0.5F);

        gunModel[370].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, -0.5F, 3.75F, 1.5F, 0.0F, 2.25F, 1.5F, 0.0F, 2.25F, 1.5F, -0.5F, 3.75F, 1.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.3F, 0.5F, 0.0F, 0.3F, 0.5F, -0.5F, 0.0F, 0.5F); // Import
        gunModel[370].setRotationPoint(-21F, -35.75F, 0.5F);

        gunModel[371].addShapeBox(26F, -1F, -5F, 3, 1, 9, 0F, -0.5F, 3.75F, 1.5F, 0.0F, 3.75F, 1.5F, 0.0F, 3.75F, 1.5F, -0.5F, 3.75F, 1.5F, -0.5F, -1.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, -1.5F, 0.5F); // Import
        gunModel[371].setRotationPoint(-23.5F, -35.75F, 0.5F);

        gunModel[372].addShapeBox(26F, -1F, -5F, 3, 1, 12, 0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F); // Import
        gunModel[372].setRotationPoint(-23.5F, -40.25F, -1F);

        gunModel[373].addShapeBox(26F, -1F, -5F, 2, 1, 9, 0F, -1.0F, 3.75F, 1.5F, 0.0F, 3.75F, 1.5F, 0.0F, 3.75F, 1.5F, -1.0F, 3.75F, 1.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F); // Import
        gunModel[373].setRotationPoint(-25F, -35.75F, 0.5F);

        gunModel[374].addShapeBox(26F, -1F, -5F, 5, 2, 9, 0F, 1.5F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 3.0F, 0.0F, 1.5F, -2.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 1.5F, -2.75F, 0.0F); // Import
        gunModel[374].setRotationPoint(-23F, -32.25F, 0.5F);

        gunModel[375].addShapeBox(26F, -1F, -5F, 5, 1, 9, 0F, 1.5F, 2.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 1.5F, 2.75F, 0.0F, 1.5F, -2.25F, -1.5F, -1.75F, 0.25F, -1.5F, -1.75F, 0.25F, -1.5F, 1.5F, -2.25F, -1.5F); // Import
        gunModel[375].setRotationPoint(-23F, -30.25F, 0.5F);

        gunModel[376].addShapeBox(26F, -1F, -5F, 1, 3, 11, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[376].setRotationPoint(-6F, -29.75F, -0.5F);

        gunModel[377].addShapeBox(26F, -1F, -5F, 1, 3, 11, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[377].setRotationPoint(-5F, -29.75F, -0.5F);

        gunModel[378].addShapeBox(26F, -1F, -5F, 1, 3, 11, 0F, 0.0F, -1.0F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[378].setRotationPoint(-4F, -29.75F, -0.5F);

        gunModel[379].addShapeBox(26F, -1F, -5F, 1, 3, 11, 0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        gunModel[379].setRotationPoint(-7F, -29.75F, -0.5F);

        gunModel[380].addShapeBox(26F, -1F, -5F, 1, 3, 11, 0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F); // Import
        gunModel[380].setRotationPoint(-8F, -29.75F, -0.5F);

        gunModel[381].addShapeBox(26F, -1F, -5F, 2, 3, 11, 0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F); // Import
        gunModel[381].setRotationPoint(-10F, -29.75F, -0.5F);

        gunModel[382].addShapeBox(26F, -1F, -5F, 1, 3, 11, 0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[382].setRotationPoint(-11F, -29.75F, -0.5F);

        gunModel[383].addShapeBox(26F, -1F, -5F, 1, 3, 11, 0F, -0.75F, -1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, -1.25F, 0.0F, -0.75F, -1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, -1.25F, 0.0F); // Import
        gunModel[383].setRotationPoint(-12F, -29.75F, -0.5F);

        gunModel[384].addShapeBox(26F, -1F, -5F, 1, 2, 12, 0F, 1.5F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 1.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[384].setRotationPoint(-2F, -31.75F, -1F);

        gunModel[385].addShapeBox(26F, -1F, -5F, 1, 1, 12, 0F, 1.0F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, 1.0F, -0.25F, -1.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[385].setRotationPoint(-3F, -32.5F, -1F);

        gunModel[386].addShapeBox(26F, -1F, -5F, 1, 1, 12, 0F, 0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, 0.75F, -0.25F, -1.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F); // Import
        gunModel[386].setRotationPoint(-2F, -32.5F, -1F);

        gunModel[387].addShapeBox(26F, -1F, -5F, 1, 1, 12, 0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.75F, 0.0F, 0.5F, 0.75F, -1.0F, 0.5F, 0.75F, -1.0F, -0.5F, 0.75F, 0.0F); // Import
        gunModel[387].setRotationPoint(-1F, -31.5F, -1F);

        gunModel[388].addShapeBox(26F, -1F, -5F, 1, 2, 12, 0F, -0.75F, -0.25F, 0.0F, 1.5F, -0.25F, 0.0F, 1.5F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); // Import
        gunModel[388].setRotationPoint(-12F, -31.75F, -1F);

        gunModel[389].addShapeBox(26F, -1F, -5F, 1, 1, 12, 0F, -0.75F, -0.25F, -1.0F, 1.0F, -0.25F, -1.0F, 1.0F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F); // Import
        gunModel[389].setRotationPoint(-11F, -32.5F, -1F);

        gunModel[390].addShapeBox(26F, -1F, -5F, 1, 1, 12, 0F, -0.75F, -0.25F, -1.0F, 0.75F, -0.25F, -1.0F, 0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F); // Import
        gunModel[390].setRotationPoint(-12F, -32.5F, -1F);

        gunModel[391].addShapeBox(26F, -1F, -5F, 1, 1, 12, 0F, -0.75F, 0.0F, -1.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, 0.5F, 0.75F, -1.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, 0.5F, 0.75F, -1.0F); // Import
        gunModel[391].setRotationPoint(-13F, -31.5F, -1F);

        gunModel[392].addShapeBox(26F, -1F, -5F, 11, 4, 11, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F); // Import
        gunModel[392].setRotationPoint(-38F, -44F, -0.5F);

        gunModel[393].addShapeBox(26F, -1F, -5F, 14, 4, 1, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        gunModel[393].setRotationPoint(-38F, -44F, 10.5F);

        gunModel[394].addShapeBox(26F, -1F, -5F, 14, 4, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F); // Import
        gunModel[394].setRotationPoint(-38F, -44F, 11.5F);

        gunModel[395].addShapeBox(26F, -1F, -5F, 14, 4, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F); // Import
        gunModel[395].setRotationPoint(-38F, -44F, -1.5F);

        gunModel[396].addShapeBox(26F, -1F, -5F, 14, 4, 1, 0F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        gunModel[396].setRotationPoint(-38F, -44F, -2.5F);

        gunModel[397].addShapeBox(26F, -1F, -5F, 6, 2, 10, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[397].setRotationPoint(-38F, -39.75F, 0F);

        gunModel[398].addShapeBox(26F, -1F, -5F, 1, 2, 9, 0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F); // Import
        gunModel[398].setRotationPoint(-25.5F, -35.25F, 0.5F);

        gunModel[399].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -1.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, -0.5F, -1.0F); // Import
        gunModel[399].setRotationPoint(-25.5F, -33F, 0.5F);

        gunModel[400].addShapeBox(26F, -1F, -5F, 1, 5, 10, 0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F); // Import
        gunModel[400].setRotationPoint(-29F, -39.75F, 0F);

        gunModel[401].addShapeBox(26F, -1F, -5F, 3, 3, 10, 0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[401].setRotationPoint(-32F, -37.75F, 0F);

        gunModel[402].addShapeBox(26F, -1F, -5F, 2, 1, 10, 0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F); // Import
        gunModel[402].setRotationPoint(-31F, -39.75F, 0F);

        gunModel[403].addShapeBox(26F, -1F, -5F, 1, 1, 10, 0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[403].setRotationPoint(-30.25F, -38.5F, 0F);

        gunModel[404].addShapeBox(26F, -1F, -5F, 1, 1, 10, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F); // Import
        gunModel[404].setRotationPoint(-30.25F, -39F, 0F);

        gunModel[405].addShapeBox(26F, -1F, -5F, 1, 1, 10, 0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[405].setRotationPoint(-30.75F, -38.5F, 0F);

        gunModel[406].addShapeBox(26F, -1F, -5F, 1, 1, 10, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[406].setRotationPoint(-30.75F, -39F, 0F);

        gunModel[407].addShapeBox(26F, -1F, -5F, 1, 2, 10, 0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F); // Import
        gunModel[407].setRotationPoint(-31.75F, -39.75F, 0F);

        gunModel[408].addShapeBox(26F, -1F, -5F, 6, 3, 9, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.75F, 0.0F); // Import
        gunModel[408].setRotationPoint(-38F, -37.75F, 0.5F);

        gunModel[409].addShapeBox(26F, -1F, -5F, 1, 1, 10, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F); // Import
        gunModel[409].setRotationPoint(-33F, -37.25F, 0F);

        gunModel[410].addShapeBox(26F, -1F, -5F, 3, 5, 9, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F); // Import
        gunModel[410].setRotationPoint(-28F, -39.75F, 0.5F);

        gunModel[411].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[411].setRotationPoint(-25.5F, -36.25F, 0.5F);

        gunModel[412].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[412].setRotationPoint(-24.5F, -36.25F, 0.5F);

        gunModel[413].addShapeBox(26F, -1F, -5F, 2, 3, 9, 0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[413].setRotationPoint(-28F, -36.25F, 0.5F);

        gunModel[414].addShapeBox(26F, -1F, -5F, 2, 2, 9, 0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -1.5F, 0.0F); // Import
        gunModel[414].setRotationPoint(-28.25F, -34.25F, 0.5F);

        gunModel[415].addShapeBox(26F, -1F, -5F, 1, 2, 9, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, -2.0F, 0.0F); // Import
        gunModel[415].setRotationPoint(-29.25F, -34.25F, 0.5F);

        gunModel[416].addShapeBox(26F, -1F, -5F, 3, 4, 2, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F); // Import
        gunModel[416].setRotationPoint(-27F, -44F, 0.5F);

        gunModel[417].addShapeBox(26F, -1F, -5F, 3, 4, 2, 0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F); // Import
        gunModel[417].setRotationPoint(-27F, -44F, 7.5F);

        gunModel[418].addShapeBox(26F, -1F, -5F, 1, 4, 2, 0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F); // Import
        gunModel[418].setRotationPoint(-27F, -44F, 5.5F);

        gunModel[419].addShapeBox(26F, -1F, -5F, 1, 4, 2, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F); // Import
        gunModel[419].setRotationPoint(-27F, -44F, 2.5F);

        gunModel[420].addShapeBox(26F, -1F, -5F, 3, 4, 1, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F); // Import
        gunModel[420].setRotationPoint(-27F, -44F, -0.5F);

        gunModel[421].addShapeBox(26F, -1F, -5F, 3, 4, 1, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F); // Import
        gunModel[421].setRotationPoint(-27F, -44F, 9.5F);

        gunModel[422].addShapeBox(26F, -1F, -5F, 48, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[422].setRotationPoint(-75F, -41.5F, 8F);

        gunModel[423].addShapeBox(26F, -1F, -5F, 48, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[423].setRotationPoint(-75F, -42.5F, 8F);

        gunModel[424].addShapeBox(26F, -1F, -5F, 48, 1, 3, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[424].setRotationPoint(-75F, -43.5F, 8F);

        gunModel[425].addShapeBox(26F, -1F, -5F, 48, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[425].setRotationPoint(-75F, -41.5F, -1F);

        gunModel[426].addShapeBox(26F, -1F, -5F, 48, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[426].setRotationPoint(-75F, -42.5F, -1F);

        gunModel[427].addShapeBox(26F, -1F, -5F, 48, 1, 3, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[427].setRotationPoint(-75F, -43.5F, -1F);

        gunModel[428].addShapeBox(26F, -1F, -5F, 10, 4, 11, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F); // Import
        gunModel[428].setRotationPoint(-84F, -44F, -0.5F);

        gunModel[429].addShapeBox(26F, -1F, -5F, 10, 4, 1, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        gunModel[429].setRotationPoint(-84F, -44F, 10.5F);

        gunModel[430].addShapeBox(26F, -1F, -5F, 10, 4, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F); // Import
        gunModel[430].setRotationPoint(-84F, -44F, 11.5F);

        gunModel[431].addShapeBox(26F, -1F, -5F, 10, 4, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F); // Import
        gunModel[431].setRotationPoint(-84F, -44F, -1.5F);

        gunModel[432].addShapeBox(26F, -1F, -5F, 10, 4, 1, 0F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        gunModel[432].setRotationPoint(-84F, -44F, -2.5F);

        gunModel[433].addShapeBox(26F, -1F, -5F, 2, 4, 11, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F); // Import
        gunModel[433].setRotationPoint(-86.5F, -44F, -0.5F);

        gunModel[434].addShapeBox(26F, -1F, -5F, 2, 4, 1, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        gunModel[434].setRotationPoint(-86.5F, -44F, 10.5F);

        gunModel[435].addShapeBox(26F, -1F, -5F, 2, 4, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F); // Import
        gunModel[435].setRotationPoint(-86.5F, -44F, 11.5F);

        gunModel[436].addShapeBox(26F, -1F, -5F, 2, 4, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F); // Import
        gunModel[436].setRotationPoint(-86.5F, -44F, -1.5F);

        gunModel[437].addShapeBox(26F, -1F, -5F, 2, 4, 1, 0F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        gunModel[437].setRotationPoint(-86.5F, -44F, -2.5F);

        gunModel[438].addShapeBox(26F, -1F, -5F, 3, 16, 10, 0F, -0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F); // Import
        gunModel[438].setRotationPoint(-84F, -36.5F, 0F);

        gunModel[439].addShapeBox(26F, -1F, -5F, 2, 16, 10, 0F, -0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F); // Import
        gunModel[439].setRotationPoint(-86.5F, -36.5F, 0F);

        gunModel[440].addShapeBox(26F, -1F, -5F, 2, 3, 11, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Import
        gunModel[440].setRotationPoint(-86.5F, -39.5F, -0.5F);

        gunModel[441].addShapeBox(26F, -1F, -5F, 3, 3, 11, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Import
        gunModel[441].setRotationPoint(-84F, -39.5F, -0.5F);

        gunModel[442].addShapeBox(26F, -1F, -5F, 3, 2, 10, 0F, -0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -1.0F, 0.75F, -0.5F, 1.0F, 0.75F, -0.5F, 1.0F, 0.75F, -0.5F, -1.0F, 0.75F, -0.5F); // Import
        gunModel[442].setRotationPoint(-83.25F, -20F, 0F);

        gunModel[443].addShapeBox(26F, -1F, -5F, 2, 2, 10, 0F, -0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -1.0F, 0.75F, -0.5F, 1.0F, 0.75F, -0.5F, 1.0F, 0.75F, -0.5F, -1.0F, 0.75F, -0.5F); // Import
        gunModel[443].setRotationPoint(-85.75F, -20F, 0F);

        gunModel[444].addShapeBox(26F, -1F, -5F, 6, 1, 10, 0F, 0.0F, 0.25F, -0.5F, 1.5F, 0.25F, -0.5F, 1.5F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, -1.0F, 0.25F, -1.0F, 1.5F, 0.25F, -1.0F, 1.5F, 0.25F, -1.0F, -1.0F, 0.25F, -1.0F); // Import
        gunModel[444].setRotationPoint(-82.25F, -17F, 0F);

        gunModel[445].addShapeBox(26F, -1F, -5F, 2, 1, 10, 0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, -1.0F, 0.25F, -1.0F, 1.0F, 0.25F, -1.0F, 1.0F, 0.25F, -1.0F, -1.0F, 0.25F, -1.0F); // Import
        gunModel[445].setRotationPoint(-84.75F, -17F, 0F);

        gunModel[446].addShapeBox(26F, -1F, -5F, 5, 1, 8, 0F, 0.0F, 0.25F, 0.0F, 1.5F, 0.25F, 0.0F, 1.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -1.25F, 0.0F, -1.5F); // Import
        gunModel[446].setRotationPoint(-81.25F, -15.5F, 1F);

        gunModel[447].addShapeBox(26F, -1F, -5F, 2, 1, 10, 0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, -1.25F, 0.0F, -2.5F, 1.25F, 0.0F, -2.5F, 1.25F, 0.0F, -2.5F, -1.25F, 0.0F, -2.5F); // Import
        gunModel[447].setRotationPoint(-83.75F, -15.5F, 0F);

        gunModel[448].addShapeBox(26F, -1F, -5F, 2, 16, 7, 0F, -0.25F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F); // Import
        gunModel[448].setRotationPoint(-81F, -36.5F, 1.5F);

        gunModel[449].addShapeBox(26F, -1F, -5F, 3, 3, 7, 0F, -0.25F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F); // Import
        gunModel[449].setRotationPoint(-82F, -39.5F, 1.5F);

        gunModel[450].addShapeBox(26F, -1F, -5F, 2, 7, 7, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        gunModel[450].setRotationPoint(-78F, -39.5F, 1.5F);

        gunModel[451].addShapeBox(26F, -1F, -5F, 1, 23, 7, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.0F); // Import
        gunModel[451].setRotationPoint(-76F, -39.5F, 1.5F);

        gunModel[452].addShapeBox(26F, -1F, -5F, 4, 3, 7, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        gunModel[452].setRotationPoint(-80F, -20F, 1.5F);

        gunModel[453].addShapeBox(26F, -1F, -5F, 3, 1, 10, 0F, -1.7F, -0.5F, -0.3F, -1.25F, -0.5F, -0.3F, -1.25F, -0.5F, -0.3F, -1.7F, -0.5F, -0.3F, -2.0F, 0.75F, -0.5F, 3.5F, 0.75F, -0.5F, 3.5F, 0.75F, -0.5F, -2.0F, 0.75F, -0.5F); // Import
        gunModel[453].setRotationPoint(-81.25F, -19F, 0F);

        gunModel[454].addShapeBox(26F, -1F, -5F, 1, 1, 7, 0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[454].setRotationPoint(-77F, -21.25F, 1.5F);

        gunModel[455].addShapeBox(26F, -1F, -5F, 1, 1, 7, 0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[455].setRotationPoint(-78F, -21.25F, 1.5F);

        gunModel[456].addShapeBox(26F, -1F, -5F, 1, 1, 7, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F); // Import
        gunModel[456].setRotationPoint(-77F, -32.75F, 1.5F);

        gunModel[457].addShapeBox(26F, -1F, -5F, 1, 1, 7, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[457].setRotationPoint(-78F, -32.75F, 1.5F);

        gunModel[458].addShapeBox(26F, -1F, -5F, 2, 16, 8, 0F, -0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F); // Import
        gunModel[458].setRotationPoint(-85.5F, -36.5F, 1F);

        gunModel[459].addShapeBox(26F, -1F, -5F, 2, 3, 9, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Import
        gunModel[459].setRotationPoint(-85.5F, -39.5F, 0.5F);

        gunModel[460].addShapeBox(26F, -1F, -5F, 2, 2, 8, 0F, -0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -1.0F, 0.75F, -0.5F, 1.0F, 0.75F, -0.5F, 1.0F, 0.75F, -0.5F, -1.0F, 0.75F, -0.5F); // Import
        gunModel[460].setRotationPoint(-84.75F, -20F, 1F);

        gunModel[461].addShapeBox(26F, -1F, -5F, 2, 1, 8, 0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, -1.0F, 0.25F, -1.0F, 1.0F, 0.25F, -1.0F, 1.0F, 0.25F, -1.0F, -1.0F, 0.25F, -1.0F); // Import
        gunModel[461].setRotationPoint(-83.75F, -17F, 1F);

        gunModel[462].addShapeBox(26F, -1F, -5F, 2, 1, 8, 0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, -1.25F, 0.0F, -2.5F, 1.25F, 0.0F, -2.5F, 1.25F, 0.0F, -2.5F, -1.25F, 0.0F, -2.5F); // Import
        gunModel[462].setRotationPoint(-82.75F, -15.5F, 1F);

        gunModel[463].addShapeBox(26F, -1F, -5F, 2, 4, 9, 0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F); // Import
        gunModel[463].setRotationPoint(-85.5F, -44F, 0.5F);

        gunModel[464].addShapeBox(26F, -1F, -5F, 2, 4, 1, 0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        gunModel[464].setRotationPoint(-85.5F, -44F, 9.5F);

        gunModel[465].addShapeBox(26F, -1F, -5F, 2, 4, 1, 0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -1.3F, -0.5F, 0.0F, -1.3F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F); // Import
        gunModel[465].setRotationPoint(-85.5F, -44F, 10.5F);

        gunModel[466].addShapeBox(26F, -1F, -5F, 2, 4, 1, 0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F); // Import
        gunModel[466].setRotationPoint(-85.5F, -44F, -0.5F);

        gunModel[467].addShapeBox(26F, -1F, -5F, 2, 4, 1, 0F, 0.0F, -1.3F, -0.5F, 0.0F, -1.3F, -0.5F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        gunModel[467].setRotationPoint(-85.5F, -44F, -1.5F);

        gunModel[468].addShapeBox(26F, -1F, -5F, 3, 4, 10, 0F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, 1.0F, -0.5F, -0.5F, 1.0F, -0.5F, -0.5F, 1.0F, -0.25F, -0.5F, 1.0F); // Import
        gunModel[468].setRotationPoint(-23F, -49.5F, 0F);

        gunModel[469].addShapeBox(26F, -1F, -5F, 3, 1, 6, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[469].setRotationPoint(-17.5F, -52F, 2F);

        gunModel[470].addShapeBox(26F, -1F, -5F, 3, 1, 6, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[470].setRotationPoint(-17.5F, -53F, 2F);

        gunModel[471].addShapeBox(26F, -1F, -5F, 3, 1, 6, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[471].setRotationPoint(-17.5F, -52.5F, 2F);

        gunModel[472].addShapeBox(26F, -1F, -5F, 3, 1, 10, 0F, -0.25F, 0.5F, 1.0F, -0.5F, 0.5F, 1.0F, -0.5F, 0.5F, 1.0F, -0.25F, 0.5F, 1.0F, -0.25F, 0.25F, 1.0F, -0.5F, 0.25F, 1.0F, -0.5F, 0.25F, 1.0F, -0.25F, 0.25F, 1.0F); // Import
        gunModel[472].setRotationPoint(-23F, -45.5F, 0F);

        gunModel[473].addShapeBox(26F, -1F, -5F, 3, 1, 10, 0F, 0.0F, -0.5F, -1.75F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, -0.5F, -1.75F, 0.0F, 0.25F, -1.75F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, -1.75F); // Import
        gunModel[473].setRotationPoint(-25.75F, -45.5F, 0F);

        gunModel[474].addShapeBox(26F, -1F, -5F, 3, 4, 10, 0F, 0.0F, -3.25F, -2.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.25F, -2.75F, 0.0F, 0.5F, -1.75F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.5F, -1.75F); // Import
        gunModel[474].setRotationPoint(-25.75F, -49.5F, 0F);

        gunModel[475].addShapeBox(26F, -1F, -5F, 1, 1, 6, 0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[475].setRotationPoint(-18.5F, -52F, 2F);

        gunModel[476].addShapeBox(26F, -1F, -5F, 1, 1, 6, 0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[476].setRotationPoint(-18.5F, -53F, 2F);

        gunModel[477].addShapeBox(26F, -1F, -5F, 1, 1, 6, 0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[477].setRotationPoint(-18.5F, -52.5F, 2F);

        gunModel[478].addShapeBox(26F, -1F, -5F, 1, 1, 5, 0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[478].setRotationPoint(-19.5F, -52F, 2.5F);

        gunModel[479].addShapeBox(26F, -1F, -5F, 1, 1, 5, 0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[479].setRotationPoint(-19.5F, -53F, 2.5F);

        gunModel[480].addShapeBox(26F, -1F, -5F, 1, 1, 5, 0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[480].setRotationPoint(-19.5F, -52.5F, 2.5F);

        gunModel[481].addShapeBox(26F, -1F, -5F, 1, 1, 6, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[481].setRotationPoint(-14.5F, -53F, 2F);

        gunModel[482].addShapeBox(26F, -1F, -5F, 1, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[482].setRotationPoint(-14.5F, -51.5F, 2F);

        gunModel[483].addShapeBox(26F, -1F, -5F, 1, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[483].setRotationPoint(-14.5F, -52F, 2F);

        gunModel[484].addShapeBox(26F, -1F, -5F, 1, 1, 13, 0F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -2.75F, 0.0F, 0.5F, -2.75F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -2.75F); // Import
        gunModel[484].setRotationPoint(-24.25F, -52.75F, -1.5F);

        gunModel[485].addShapeBox(26F, -1F, -5F, 5, 1, 6, 0F, 0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F); // Import
        gunModel[485].setRotationPoint(-18.5F, -50.5F, 2F);

        gunModel[486].addShapeBox(26F, -1F, -5F, 5, 1, 5, 0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F); // Import
        gunModel[486].setRotationPoint(-18.5F, -51.25F, 2.5F);

        gunModel[487].addShapeBox(26F, -1F, -5F, 1, 1, 13, 0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, -0.5F); // Import
        gunModel[487].setRotationPoint(-23.25F, -52.75F, -1.5F);

        gunModel[488].addShapeBox(26F, -1F, -5F, 1, 1, 5, 0F, -0.5F, -0.25F, 2.25F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.5F, 2.25F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F); // Import
        gunModel[488].setRotationPoint(-21.75F, -52.75F, 7.5F);

        gunModel[489].addShapeBox(26F, -1F, -5F, 1, 1, 4, 0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.75F, 0.0F, 0.5F, -0.5F); // Import
        gunModel[489].setRotationPoint(-19.75F, -52.75F, 7F);

        gunModel[490].addShapeBox(26F, -1F, -5F, 1, 1, 6, 0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -2.5F, 0.0F, -0.25F, -0.75F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -2.5F, 0.0F, 0.5F, -0.75F); // Import
        gunModel[490].setRotationPoint(-20.75F, -52.75F, 7F);

        gunModel[491].addShapeBox(26F, -1F, -5F, 2, 1, 13, 0F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, 0.75F, -0.5F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F); // Import
        gunModel[491].setRotationPoint(-22.75F, -52.75F, -1.5F);

        gunModel[492].addShapeBox(26F, -1F, -5F, 5, 1, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[492].setRotationPoint(-24.25F, -51.25F, 2.5F);

        gunModel[493].addShapeBox(26F, -1F, -5F, 1, 1, 13, 0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -2.0F); // Import
        gunModel[493].setRotationPoint(-24.25F, -50.75F, -1.5F);

        gunModel[494].addShapeBox(26F, -1F, -5F, 1, 1, 13, 0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, -0.25F); // Import
        gunModel[494].setRotationPoint(-23.25F, -50.75F, -1.5F);

        gunModel[495].addShapeBox(26F, -1F, -5F, 2, 1, 13, 0F, -0.5F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, -0.5F, -0.5F, 0.75F, -0.5F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F); // Import
        gunModel[495].setRotationPoint(-22.75F, -50.75F, -1.5F);

        gunModel[496].addShapeBox(26F, -1F, -5F, 1, 1, 14, 0F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -0.25F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -0.25F); // Import
        gunModel[496].setRotationPoint(-20.75F, -50.75F, -1.5F);

        gunModel[497].addShapeBox(26F, -1F, -5F, 1, 1, 11, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.0F); // Import
        gunModel[497].setRotationPoint(-19.75F, -50.75F, -0.5F);

        gunModel[498].addShapeBox(26F, -1F, -5F, 1, 1, 5, 0F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 1.0F, -0.5F, -0.25F, 2.25F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 1.0F, -0.5F, 0.5F, 2.25F); // Import
        gunModel[498].setRotationPoint(-21.75F, -52.75F, -2.5F);

        gunModel[499].addShapeBox(26F, -1F, -5F, 1, 1, 4, 0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -1.75F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -0.5F); // Import
        gunModel[499].setRotationPoint(-19.75F, -52.75F, -1F);
    }

    private void initgunModel_2() {
        gunModel[500] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Import
        gunModel[501] = new ModelRendererTurbo(this, 41, 313, textureX, textureY); // Import
        gunModel[502] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Import
        gunModel[503] = new ModelRendererTurbo(this, 457, 305, textureX, textureY); // Import
        gunModel[504] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Import
        gunModel[505] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Import
        gunModel[506] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Import
        gunModel[507] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Import
        gunModel[508] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Import
        gunModel[509] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Import
        gunModel[510] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Import
        gunModel[511] = new ModelRendererTurbo(this, 217, 289, textureX, textureY); // Import
        gunModel[512] = new ModelRendererTurbo(this, 441, 233, textureX, textureY); // Import
        gunModel[513] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Import
        gunModel[514] = new ModelRendererTurbo(this, 129, 313, textureX, textureY); // Import
        gunModel[515] = new ModelRendererTurbo(this, 321, 273, textureX, textureY); // Import
        gunModel[516] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Import
        gunModel[517] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Import
        gunModel[518] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Import
        gunModel[519] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import
        gunModel[520] = new ModelRendererTurbo(this, 161, 313, textureX, textureY); // Import
        gunModel[521] = new ModelRendererTurbo(this, 361, 313, textureX, textureY); // Import
        gunModel[522] = new ModelRendererTurbo(this, 385, 289, textureX, textureY); // Import
        gunModel[523] = new ModelRendererTurbo(this, 417, 313, textureX, textureY); // Import
        gunModel[524] = new ModelRendererTurbo(this, 89, 369, textureX, textureY); // Box 0
        gunModel[525] = new ModelRendererTurbo(this, 433, 297, textureX, textureY); // Box 0
        gunModel[526] = new ModelRendererTurbo(this, 465, 297, textureX, textureY); // Box 0
        gunModel[527] = new ModelRendererTurbo(this, 297, 321, textureX, textureY); // Box 0
        gunModel[528] = new ModelRendererTurbo(this, 337, 321, textureX, textureY); // Box 0
        gunModel[529] = new ModelRendererTurbo(this, 377, 321, textureX, textureY); // Box 0
        gunModel[530] = new ModelRendererTurbo(this, 425, 321, textureX, textureY); // Box 0
        gunModel[531] = new ModelRendererTurbo(this, 441, 329, textureX, textureY); // Box 0
        gunModel[532] = new ModelRendererTurbo(this, 81, 337, textureX, textureY); // Box 0
        gunModel[533] = new ModelRendererTurbo(this, 225, 337, textureX, textureY); // Box 0
        gunModel[534] = new ModelRendererTurbo(this, 409, 337, textureX, textureY); // Box 0
        gunModel[535] = new ModelRendererTurbo(this, 441, 337, textureX, textureY); // Box 0
        gunModel[536] = new ModelRendererTurbo(this, 193, 369, textureX, textureY); // Box 0
        gunModel[537] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Box 0
        gunModel[538] = new ModelRendererTurbo(this, 41, 345, textureX, textureY); // Box 0
        gunModel[539] = new ModelRendererTurbo(this, 121, 345, textureX, textureY); // Box 0
        gunModel[540] = new ModelRendererTurbo(this, 401, 345, textureX, textureY); // Box 0
        gunModel[541] = new ModelRendererTurbo(this, 449, 345, textureX, textureY); // Box 0
        gunModel[542] = new ModelRendererTurbo(this, 217, 353, textureX, textureY); // Box 0
        gunModel[543] = new ModelRendererTurbo(this, 225, 361, textureX, textureY); // Box 0
        gunModel[544] = new ModelRendererTurbo(this, 305, 361, textureX, textureY); // Box 0
        gunModel[545] = new ModelRendererTurbo(this, 329, 361, textureX, textureY); // Box 0
        gunModel[546] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 0
        gunModel[547] = new ModelRendererTurbo(this, 25, 369, textureX, textureY); // Box 0
        gunModel[548] = new ModelRendererTurbo(this, 401, 369, textureX, textureY); // Box 0
        gunModel[549] = new ModelRendererTurbo(this, 425, 369, textureX, textureY); // Box 0
        gunModel[550] = new ModelRendererTurbo(this, 449, 369, textureX, textureY); // Box 0
        gunModel[551] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 0
        gunModel[552] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Box 0
        gunModel[553] = new ModelRendererTurbo(this, 25, 377, textureX, textureY); // Box 0
        gunModel[554] = new ModelRendererTurbo(this, 49, 377, textureX, textureY); // Box 0
        gunModel[555] = new ModelRendererTurbo(this, 73, 377, textureX, textureY); // Box 0
        gunModel[556] = new ModelRendererTurbo(this, 97, 377, textureX, textureY); // Box 0
        gunModel[557] = new ModelRendererTurbo(this, 121, 377, textureX, textureY); // Box 0
        gunModel[558] = new ModelRendererTurbo(this, 145, 377, textureX, textureY); // Box 0
        gunModel[559] = new ModelRendererTurbo(this, 169, 377, textureX, textureY); // Box 0
        gunModel[560] = new ModelRendererTurbo(this, 193, 377, textureX, textureY); // Box 0
        gunModel[561] = new ModelRendererTurbo(this, 217, 377, textureX, textureY); // Box 0
        gunModel[562] = new ModelRendererTurbo(this, 33, 217, textureX, textureY); // Box 0
        gunModel[563] = new ModelRendererTurbo(this, 105, 217, textureX, textureY); // Box 0
        gunModel[564] = new ModelRendererTurbo(this, 505, 217, textureX, textureY); // Box 0
        gunModel[565] = new ModelRendererTurbo(this, 161, 225, textureX, textureY); // Box 0
        gunModel[566] = new ModelRendererTurbo(this, 257, 225, textureX, textureY); // Box 0
        gunModel[567] = new ModelRendererTurbo(this, 417, 225, textureX, textureY); // Box 0
        gunModel[568] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 0
        gunModel[569] = new ModelRendererTurbo(this, 81, 233, textureX, textureY); // Box 0
        gunModel[570] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Box 0
        gunModel[571] = new ModelRendererTurbo(this, 49, 241, textureX, textureY); // Box 0
        gunModel[572] = new ModelRendererTurbo(this, 113, 241, textureX, textureY); // Box 0
        gunModel[573] = new ModelRendererTurbo(this, 321, 377, textureX, textureY); // Import
        gunModel[574] = new ModelRendererTurbo(this, 425, 377, textureX, textureY); // Import
        gunModel[575] = new ModelRendererTurbo(this, 449, 377, textureX, textureY); // Import
        gunModel[576] = new ModelRendererTurbo(this, 425, 209, textureX, textureY); // Import
        gunModel[577] = new ModelRendererTurbo(this, 441, 209, textureX, textureY); // Import
        gunModel[578] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Import
        gunModel[579] = new ModelRendererTurbo(this, 473, 209, textureX, textureY); // Import
        gunModel[580] = new ModelRendererTurbo(this, 481, 209, textureX, textureY); // Import
        gunModel[581] = new ModelRendererTurbo(this, 497, 209, textureX, textureY); // Import
        gunModel[582] = new ModelRendererTurbo(this, 41, 217, textureX, textureY); // Import
        gunModel[583] = new ModelRendererTurbo(this, 57, 217, textureX, textureY); // Import
        gunModel[584] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Import
        gunModel[585] = new ModelRendererTurbo(this, 169, 217, textureX, textureY); // Import
        gunModel[586] = new ModelRendererTurbo(this, 185, 217, textureX, textureY); // Import
        gunModel[587] = new ModelRendererTurbo(this, 145, 217, textureX, textureY); // Import
        gunModel[588] = new ModelRendererTurbo(this, 201, 217, textureX, textureY); // Import
        gunModel[589] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Import
        gunModel[590] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Import
        gunModel[591] = new ModelRendererTurbo(this, 249, 217, textureX, textureY); // Import
        gunModel[592] = new ModelRendererTurbo(this, 233, 217, textureX, textureY); // Import
        gunModel[593] = new ModelRendererTurbo(this, 265, 217, textureX, textureY); // Import
        gunModel[594] = new ModelRendererTurbo(this, 25, 385, textureX, textureY); // Import
        gunModel[595] = new ModelRendererTurbo(this, 281, 217, textureX, textureY); // Import
        gunModel[596] = new ModelRendererTurbo(this, 297, 217, textureX, textureY); // Import
        gunModel[597] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // Import
        gunModel[598] = new ModelRendererTurbo(this, 337, 217, textureX, textureY); // Import
        gunModel[599] = new ModelRendererTurbo(this, 49, 385, textureX, textureY); // Import
        gunModel[600] = new ModelRendererTurbo(this, 353, 217, textureX, textureY); // Import
        gunModel[601] = new ModelRendererTurbo(this, 369, 217, textureX, textureY); // Import
        gunModel[602] = new ModelRendererTurbo(this, 441, 217, textureX, textureY); // Import
        gunModel[603] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Import
        gunModel[604] = new ModelRendererTurbo(this, 73, 385, textureX, textureY); // Import
        gunModel[605] = new ModelRendererTurbo(this, 33, 257, textureX, textureY); // Import
        gunModel[606] = new ModelRendererTurbo(this, 385, 225, textureX, textureY); // Import
        gunModel[607] = new ModelRendererTurbo(this, 161, 241, textureX, textureY); // Box 0
        gunModel[608] = new ModelRendererTurbo(this, 249, 241, textureX, textureY); // Box 0
        gunModel[609] = new ModelRendererTurbo(this, 97, 385, textureX, textureY); // Box 0
        gunModel[610] = new ModelRendererTurbo(this, 369, 241, textureX, textureY); // Box 0
        gunModel[611] = new ModelRendererTurbo(this, 505, 241, textureX, textureY); // Box 0
        gunModel[612] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 0
        gunModel[613] = new ModelRendererTurbo(this, 65, 249, textureX, textureY); // Box 0
        gunModel[614] = new ModelRendererTurbo(this, 81, 249, textureX, textureY); // Box 0
        gunModel[615] = new ModelRendererTurbo(this, 193, 249, textureX, textureY); // Box 0
        gunModel[616] = new ModelRendererTurbo(this, 265, 249, textureX, textureY); // Box 0
        gunModel[617] = new ModelRendererTurbo(this, 313, 249, textureX, textureY); // Box 0
        gunModel[618] = new ModelRendererTurbo(this, 385, 249, textureX, textureY); // Box 0
        gunModel[619] = new ModelRendererTurbo(this, 433, 249, textureX, textureY); // Box 0
        gunModel[620] = new ModelRendererTurbo(this, 449, 249, textureX, textureY); // Box 0
        gunModel[621] = new ModelRendererTurbo(this, 497, 249, textureX, textureY); // Box 0
        gunModel[622] = new ModelRendererTurbo(this, 505, 249, textureX, textureY); // Box 0

        gunModel[500].addShapeBox(26F, -1F, -5F, 1, 1, 6, 0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -2.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -2.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.5F); // Import
        gunModel[500].setRotationPoint(-20.75F, -52.75F, -3F);

        gunModel[501].addShapeBox(26F, -1F, -5F, 3, 1, 11, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[501].setRotationPoint(-22.75F, -51.25F, -0.5F);

        gunModel[502].addShapeBox(26F, -1F, -5F, 1, 2, 1, 0F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.25F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, -0.75F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[502].setRotationPoint(-21.25F, -52.25F, 12.25F);

        gunModel[503].addShapeBox(26F, -1F, -5F, 1, 1, 11, 0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F); // Import
        gunModel[503].setRotationPoint(-23.75F, -51.25F, -0.5F);

        gunModel[504].addShapeBox(26F, -1F, -5F, 4, 1, 3, 0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.5F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[504].setRotationPoint(-20.75F, -51.25F, 7.5F);

        gunModel[505].addShapeBox(26F, -1F, -5F, 1, 2, 2, 0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F); // Import
        gunModel[505].setRotationPoint(-20.75F, -52.25F, 11.25F);

        gunModel[506].addShapeBox(26F, -1F, -5F, 1, 2, 1, 0F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F); // Import
        gunModel[506].setRotationPoint(-21F, -52.25F, 12.25F);

        gunModel[507].addShapeBox(26F, -1F, -5F, 1, 2, 1, 0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.75F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.75F); // Import
        gunModel[507].setRotationPoint(-21.25F, -52.25F, -3.25F);

        gunModel[508].addShapeBox(26F, -1F, -5F, 1, 2, 2, 0F, -0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[508].setRotationPoint(-20.75F, -52.25F, -3.25F);

        gunModel[509].addShapeBox(26F, -1F, -5F, 1, 2, 1, 0F, -0.5F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F); // Import
        gunModel[509].setRotationPoint(-21F, -52.25F, -3.25F);

        gunModel[510].addShapeBox(26F, -1F, -5F, 4, 1, 3, 0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, -2.5F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[510].setRotationPoint(-20.75F, -51.25F, -1.5F);

        gunModel[511].addShapeBox(26F, -1F, -5F, 3, 1, 7, 0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[511].setRotationPoint(-28.75F, -45.25F, 1.5F);

        gunModel[512].addShapeBox(26F, -1F, -5F, 1, 1, 7, 0F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.75F); // Import
        gunModel[512].setRotationPoint(-29.75F, -45.25F, 1.5F);

        gunModel[513].addShapeBox(26F, -1F, -5F, 1, 9, 2, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[513].setRotationPoint(17F, -45.5F, 0F);

        gunModel[514].addShapeBox(26F, -1F, -5F, 10, 9, 2, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[514].setRotationPoint(32F, -45.5F, 0F);

        gunModel[515].addShapeBox(26F, -1F, -5F, 14, 1, 2, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[515].setRotationPoint(18F, -45.5F, 0F);

        gunModel[516].addShapeBox(26F, -1F, -5F, 1, 1, 2, 0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[516].setRotationPoint(31F, -38.5F, 0F);

        gunModel[517].addShapeBox(26F, -1F, -5F, 1, 1, 2, 0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[517].setRotationPoint(18F, -38.5F, 0F);

        gunModel[518].addShapeBox(26F, -1F, -5F, 1, 1, 2, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F); // Import
        gunModel[518].setRotationPoint(31F, -44.5F, 0F);

        gunModel[519].addShapeBox(26F, -1F, -5F, 1, 1, 2, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[519].setRotationPoint(18F, -44.5F, 0F);

        gunModel[520].addShapeBox(26F, -1F, -5F, 14, 1, 2, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[520].setRotationPoint(18F, -37.5F, 0F);

        gunModel[521].addShapeBox(26F, -1F, -5F, 14, 6, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[521].setRotationPoint(18F, -36.5F, -2F);

        gunModel[522].addShapeBox(26F, -1F, -5F, 14, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.4F, -0.75F, 0.0F, 0.4F, -0.75F, 0.0F, -0.4F, -0.75F, 0.0F, -0.4F); // Import
        gunModel[522].setRotationPoint(18F, -30.5F, -4F);

        gunModel[523].addShapeBox(26F, -1F, -5F, 14, 1, 1, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[523].setRotationPoint(18F, -37.5F, -2F);

        gunModel[524].addShapeBox(0F, 0F, 0F, 42, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[524].setRotationPoint(68F, -32.5F, -3F);

        gunModel[525].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
        gunModel[525].setRotationPoint(68F, -31.5F, -3F);

        gunModel[526].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
        gunModel[526].setRotationPoint(72F, -31.5F, -3F);

        gunModel[527].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
        gunModel[527].setRotationPoint(76F, -31.5F, -3F);

        gunModel[528].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
        gunModel[528].setRotationPoint(80F, -31.5F, -3F);

        gunModel[529].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
        gunModel[529].setRotationPoint(84F, -31.5F, -3F);

        gunModel[530].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
        gunModel[530].setRotationPoint(88F, -31.5F, -3F);

        gunModel[531].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
        gunModel[531].setRotationPoint(92F, -31.5F, -3F);

        gunModel[532].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
        gunModel[532].setRotationPoint(96F, -31.5F, -3F);

        gunModel[533].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
        gunModel[533].setRotationPoint(100F, -31.5F, -3F);

        gunModel[534].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
        gunModel[534].setRotationPoint(104F, -31.5F, -3F);

        gunModel[535].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
        gunModel[535].setRotationPoint(108F, -31.5F, -3F);

        gunModel[536].addShapeBox(0F, 0F, 0F, 97, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
        gunModel[536].setRotationPoint(13F, -53F, -3F);

        gunModel[537].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[537].setRotationPoint(13F, -54F, -3F);

        gunModel[538].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[538].setRotationPoint(17F, -54F, -3F);

        gunModel[539].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[539].setRotationPoint(21F, -54F, -3F);

        gunModel[540].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[540].setRotationPoint(25F, -54F, -3F);

        gunModel[541].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[541].setRotationPoint(29F, -54F, -3F);

        gunModel[542].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[542].setRotationPoint(33F, -54F, -3F);

        gunModel[543].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[543].setRotationPoint(37F, -54F, -3F);

        gunModel[544].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[544].setRotationPoint(41F, -54F, -3F);

        gunModel[545].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[545].setRotationPoint(45F, -54F, -3F);

        gunModel[546].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[546].setRotationPoint(49F, -54F, -3F);

        gunModel[547].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[547].setRotationPoint(53F, -54F, -3F);

        gunModel[548].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[548].setRotationPoint(57F, -54F, -3F);

        gunModel[549].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[549].setRotationPoint(61F, -54F, -3F);

        gunModel[550].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[550].setRotationPoint(65F, -54F, -3F);

        gunModel[551].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[551].setRotationPoint(69F, -54F, -3F);

        gunModel[552].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[552].setRotationPoint(73F, -54F, -3F);

        gunModel[553].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[553].setRotationPoint(77F, -54F, -3F);

        gunModel[554].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[554].setRotationPoint(81F, -54F, -3F);

        gunModel[555].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[555].setRotationPoint(85F, -54F, -3F);

        gunModel[556].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[556].setRotationPoint(89F, -54F, -3F);

        gunModel[557].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[557].setRotationPoint(93F, -54F, -3F);

        gunModel[558].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[558].setRotationPoint(97F, -54F, -3F);

        gunModel[559].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[559].setRotationPoint(101F, -54F, -3F);

        gunModel[560].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[560].setRotationPoint(105F, -54F, -3F);

        gunModel[561].addShapeBox(0F, 0F, 0F, 50, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[561].setRotationPoint(60F, -43F, 7.75F);

        gunModel[562].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
        gunModel[562].setRotationPoint(68F, -43F, 8.75F);

        gunModel[563].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
        gunModel[563].setRotationPoint(72F, -43F, 8.75F);

        gunModel[564].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
        gunModel[564].setRotationPoint(76F, -43F, 8.75F);

        gunModel[565].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
        gunModel[565].setRotationPoint(80F, -43F, 8.75F);

        gunModel[566].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
        gunModel[566].setRotationPoint(84F, -43F, 8.75F);

        gunModel[567].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
        gunModel[567].setRotationPoint(88F, -43F, 8.75F);

        gunModel[568].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
        gunModel[568].setRotationPoint(92F, -43F, 8.75F);

        gunModel[569].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
        gunModel[569].setRotationPoint(96F, -43F, 8.75F);

        gunModel[570].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
        gunModel[570].setRotationPoint(100F, -43F, 8.75F);

        gunModel[571].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
        gunModel[571].setRotationPoint(104F, -43F, 8.75F);

        gunModel[572].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
        gunModel[572].setRotationPoint(108F, -43F, 8.75F);

        gunModel[573].addShapeBox(26F, -1F, -5F, 50, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import
        gunModel[573].setRotationPoint(34F, -33.5F, 9.5F);

        gunModel[574].addShapeBox(26F, -1F, -5F, 6, 2, 5, 0F, 0.25F, -1F, -3.65F, -0.5F, -1F, -3.65F, -0.5F, -1F, -0.1F, 0.25F, -1F, -0.1F, 2.75F, -0.25F, -3.05F, -0.5F, -0.25F, -3.05F, -0.5F, -0.25F, -0.5F, 2.75F, -0.25F, -0.5F); // Import
        gunModel[574].setRotationPoint(78.5F, -35.25F, 6.75F);

        gunModel[575].addShapeBox(26F, -1F, -5F, 4, 2, 5, 0F, 0F, -1F, -3.65F, -0.5F, -1F, -3.65F, -0.5F, -1F, -0.1F, 0F, -1F, -0.1F, 2.5F, -0.25F, -3.05F, -0.5F, -0.25F, -3.05F, -0.5F, -0.25F, -0.5F, 2.5F, -0.25F, -0.5F); // Import
        gunModel[575].setRotationPoint(71.5F, -35.25F, 6.75F);

        gunModel[576].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, -0.25F, 0.75F, -1.5F, 1.75F, 0.75F, -1.5F, 1.75F, 0.75F, 1.5F, -0.25F, 0.75F, 1.5F, -0.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F); // Import
        gunModel[576].setRotationPoint(73.5F, -35.75F, 10.25F);

        gunModel[577].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.5F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 2F, 0F, 0.35F, -2.5F, 0F, 0.35F, -2.5F, 0F, -0.1F, 2F, 0F, -0.1F); // Import
        gunModel[577].setRotationPoint(73.5F, -35.25F, 10.75F);

        gunModel[578].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.75F, 0F, -1.1F, -0.25F, 0F, -1.1F, -0.25F, 0F, 1.1F, -0.75F, 0F, 1.1F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.75F, 0F, -0.25F, 0.75F); // Import
        gunModel[578].setRotationPoint(73F, -35.75F, 10.25F);

        gunModel[579].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, 1.25F, -0.75F, -0.5F, -0.95F, -0.25F, -0.5F, -0.95F, -0.25F, -0.5F, 0.95F, -0.75F, -0.5F, 0.95F); // Import
        gunModel[579].setRotationPoint(73F, -36.5F, 10.5F);

        gunModel[580].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0F, 0.75F, -1.5F, -0.5F, 0.75F, -1.5F, -0.5F, 0.75F, 1.5F, 0F, 0.75F, 1.5F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0.75F, 0F, -0.25F, 0.75F); // Import
        gunModel[580].setRotationPoint(80.5F, -35.75F, 10.25F);

        gunModel[581].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.75F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0.25F, 0.75F, -0.25F, 0.25F, 2.25F, 0F, 0.35F, -0.5F, 0F, 0.35F, -0.5F, 0F, -0.1F, 2.25F, 0F, -0.1F); // Import
        gunModel[581].setRotationPoint(80.5F, -35.25F, 10.75F);

        gunModel[582].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.75F, 0F, -1.1F, -0.25F, 0F, -1.1F, -0.25F, 0F, 1.1F, -0.75F, 0F, 1.1F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.75F, 0F, -0.25F, 0.75F); // Import
        gunModel[582].setRotationPoint(79.75F, -35.75F, 10.25F);

        gunModel[583].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, 1.25F, -0.75F, -0.5F, -0.95F, -0.25F, -0.5F, -0.95F, -0.25F, -0.5F, 0.95F, -0.75F, -0.5F, 0.95F); // Import
        gunModel[583].setRotationPoint(79.75F, -36.5F, 10.5F);

        gunModel[584].addShapeBox(26F, -1F, -5F, 4, 2, 5, 0F, 0F, -1F, -3.65F, -0.5F, -1F, -3.65F, -0.5F, -1F, -0.1F, 0F, -1F, -0.1F, 2.5F, -0.25F, -3.05F, -0.5F, -0.25F, -3.05F, -0.5F, -0.25F, -0.5F, 2.5F, -0.25F, -0.5F); // Import
        gunModel[584].setRotationPoint(64.75F, -35.25F, 6.75F);

        gunModel[585].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, -0.25F, 0.75F, -1.5F, 1.75F, 0.75F, -1.5F, 1.75F, 0.75F, 1.5F, -0.25F, 0.75F, 1.5F, -0.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F); // Import
        gunModel[585].setRotationPoint(66.75F, -35.75F, 10.25F);

        gunModel[586].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.5F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 2F, 0F, 0.35F, -2.5F, 0F, 0.35F, -2.5F, 0F, -0.1F, 2F, 0F, -0.1F); // Import
        gunModel[586].setRotationPoint(66.75F, -35.25F, 10.75F);

        gunModel[587].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.75F, 0F, -1.1F, -0.25F, 0F, -1.1F, -0.25F, 0F, 1.1F, -0.75F, 0F, 1.1F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.75F, 0F, -0.25F, 0.75F); // Import
        gunModel[587].setRotationPoint(66.25F, -35.75F, 10.25F);

        gunModel[588].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, 1.25F, -0.75F, -0.5F, -0.95F, -0.25F, -0.5F, -0.95F, -0.25F, -0.5F, 0.95F, -0.75F, -0.5F, 0.95F); // Import
        gunModel[588].setRotationPoint(66.25F, -36.5F, 10.5F);

        gunModel[589].addShapeBox(26F, -1F, -5F, 4, 2, 5, 0F, 0F, -1F, -3.65F, -0.5F, -1F, -3.65F, -0.5F, -1F, -0.1F, 0F, -1F, -0.1F, 2.5F, -0.25F, -3.05F, -0.5F, -0.25F, -3.05F, -0.5F, -0.25F, -0.5F, 2.5F, -0.25F, -0.5F); // Import
        gunModel[589].setRotationPoint(58F, -35.25F, 6.75F);

        gunModel[590].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, -0.25F, 0.75F, -1.5F, 1.75F, 0.75F, -1.5F, 1.75F, 0.75F, 1.5F, -0.25F, 0.75F, 1.5F, -0.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F); // Import
        gunModel[590].setRotationPoint(60F, -35.75F, 10.25F);

        gunModel[591].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.5F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 2F, 0F, 0.35F, -2.5F, 0F, 0.35F, -2.5F, 0F, -0.1F, 2F, 0F, -0.1F); // Import
        gunModel[591].setRotationPoint(60F, -35.25F, 10.75F);

        gunModel[592].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.75F, 0F, -1.1F, -0.25F, 0F, -1.1F, -0.25F, 0F, 1.1F, -0.75F, 0F, 1.1F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.75F, 0F, -0.25F, 0.75F); // Import
        gunModel[592].setRotationPoint(59.5F, -35.75F, 10.25F);

        gunModel[593].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, 1.25F, -0.75F, -0.5F, -0.95F, -0.25F, -0.5F, -0.95F, -0.25F, -0.5F, 0.95F, -0.75F, -0.5F, 0.95F); // Import
        gunModel[593].setRotationPoint(59.5F, -36.5F, 10.5F);

        gunModel[594].addShapeBox(26F, -1F, -5F, 4, 2, 5, 0F, 0F, -1F, -3.65F, -0.5F, -1F, -3.65F, -0.5F, -1F, -0.1F, 0F, -1F, -0.1F, 2.5F, -0.25F, -3.05F, -0.5F, -0.25F, -3.05F, -0.5F, -0.25F, -0.5F, 2.5F, -0.25F, -0.5F); // Import
        gunModel[594].setRotationPoint(51F, -35.25F, 6.75F);

        gunModel[595].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, -0.25F, 0.75F, -1.5F, 1.75F, 0.75F, -1.5F, 1.75F, 0.75F, 1.5F, -0.25F, 0.75F, 1.5F, -0.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F); // Import
        gunModel[595].setRotationPoint(53F, -35.75F, 10.25F);

        gunModel[596].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.5F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 2F, 0F, 0.35F, -2.5F, 0F, 0.35F, -2.5F, 0F, -0.1F, 2F, 0F, -0.1F); // Import
        gunModel[596].setRotationPoint(53F, -35.25F, 10.75F);

        gunModel[597].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.75F, 0F, -1.1F, -0.25F, 0F, -1.1F, -0.25F, 0F, 1.1F, -0.75F, 0F, 1.1F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.75F, 0F, -0.25F, 0.75F); // Import
        gunModel[597].setRotationPoint(52.5F, -35.75F, 10.25F);

        gunModel[598].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, 1.25F, -0.75F, -0.5F, -0.95F, -0.25F, -0.5F, -0.95F, -0.25F, -0.5F, 0.95F, -0.75F, -0.5F, 0.95F); // Import
        gunModel[598].setRotationPoint(52.5F, -36.5F, 10.5F);

        gunModel[599].addShapeBox(26F, -1F, -5F, 4, 2, 5, 0F, 0F, -1F, -3.65F, -0.5F, -1F, -3.65F, -0.5F, -1F, -0.1F, 0F, -1F, -0.1F, 2.5F, -0.25F, -3.05F, -0.5F, -0.25F, -3.05F, -0.5F, -0.25F, -0.5F, 2.5F, -0.25F, -0.5F); // Import
        gunModel[599].setRotationPoint(44.25F, -35.25F, 6.75F);

        gunModel[600].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, -0.25F, 0.75F, -1.5F, 1.75F, 0.75F, -1.5F, 1.75F, 0.75F, 1.5F, -0.25F, 0.75F, 1.5F, -0.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F); // Import
        gunModel[600].setRotationPoint(46.25F, -35.75F, 10.25F);

        gunModel[601].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.5F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 2F, 0F, 0.35F, -2.5F, 0F, 0.35F, -2.5F, 0F, -0.1F, 2F, 0F, -0.1F); // Import
        gunModel[601].setRotationPoint(46.25F, -35.25F, 10.75F);

        gunModel[602].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.75F, 0F, -1.1F, -0.25F, 0F, -1.1F, -0.25F, 0F, 1.1F, -0.75F, 0F, 1.1F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.75F, 0F, -0.25F, 0.75F); // Import
        gunModel[602].setRotationPoint(45.75F, -35.75F, 10.25F);

        gunModel[603].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, 1.25F, -0.75F, -0.5F, -0.95F, -0.25F, -0.5F, -0.95F, -0.25F, -0.5F, 0.95F, -0.75F, -0.5F, 0.95F); // Import
        gunModel[603].setRotationPoint(45.75F, -36.5F, 10.5F);

        gunModel[604].addShapeBox(26F, -1F, -5F, 6, 2, 5, 0F, 2.25F, -1F, -3.65F, -1.5F, -1F, -3.65F, -1.5F, -1F, -0.1F, 2.25F, -1F, -0.1F, 2.25F, -0.25F, -3.05F, -1.5F, -0.25F, -3.05F, -1.5F, -0.25F, -0.5F, 2.25F, -0.25F, -0.5F); // Import
        gunModel[604].setRotationPoint(36.25F, -35.25F, 6.75F);

        gunModel[605].addShapeBox(26F, -1F, -5F, 9, 1, 1, 0F, 0.25F, 0.75F, -1.5F, 1.75F, 0.75F, -1.5F, 1.75F, 0.75F, 1.5F, 0.25F, 0.75F, 1.5F, 0.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0.75F, 0.25F, -0.25F, 0.75F); // Import
        gunModel[605].setRotationPoint(34.25F, -35.75F, 10.25F);

        gunModel[606].addShapeBox(26F, -1F, -5F, 7, 1, 1, 0F, 2.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0.25F, 2.25F, -0.25F, 0.25F, 2.25F, 0F, 0.35F, -2.5F, 0F, 0.35F, -2.5F, 0F, -0.1F, 2.25F, 0F, -0.1F); // Import
        gunModel[606].setRotationPoint(36.25F, -35.25F, 10.75F);

        gunModel[607].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
        gunModel[607].setRotationPoint(60F, -43F, 8.75F);

        gunModel[608].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
        gunModel[608].setRotationPoint(64F, -43F, 8.75F);

        gunModel[609].addShapeBox(0F, 0F, 0F, 50, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
        gunModel[609].setRotationPoint(60F, -43F, -8.75F);

        gunModel[610].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[610].setRotationPoint(68F, -43F, -9.75F);

        gunModel[611].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[611].setRotationPoint(72F, -43F, -9.75F);

        gunModel[612].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[612].setRotationPoint(76F, -43F, -9.75F);

        gunModel[613].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[613].setRotationPoint(80F, -43F, -9.75F);

        gunModel[614].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[614].setRotationPoint(84F, -43F, -9.75F);

        gunModel[615].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[615].setRotationPoint(88F, -43F, -9.75F);

        gunModel[616].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[616].setRotationPoint(92F, -43F, -9.75F);

        gunModel[617].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[617].setRotationPoint(96F, -43F, -9.75F);

        gunModel[618].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[618].setRotationPoint(100F, -43F, -9.75F);

        gunModel[619].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[619].setRotationPoint(104F, -43F, -9.75F);

        gunModel[620].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[620].setRotationPoint(108F, -43F, -9.75F);

        gunModel[621].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[621].setRotationPoint(60F, -43F, -9.75F);

        gunModel[622].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[622].setRotationPoint(64F, -43F, -9.75F);
    }

    private void initdefaultBarrelModel_1() {
        defaultBarrelModel[0] = new ModelRendererTurbo(this, 257, 289, textureX, textureY); // Import
        defaultBarrelModel[1] = new ModelRendererTurbo(this, 257, 305, textureX, textureY); // Import
        defaultBarrelModel[2] = new ModelRendererTurbo(this, 289, 305, textureX, textureY); // Import
        defaultBarrelModel[3] = new ModelRendererTurbo(this, 441, 313, textureX, textureY); // Import
        defaultBarrelModel[4] = new ModelRendererTurbo(this, 481, 313, textureX, textureY); // Import
        defaultBarrelModel[5] = new ModelRendererTurbo(this, 65, 321, textureX, textureY); // Import
        defaultBarrelModel[6] = new ModelRendererTurbo(this, 89, 321, textureX, textureY); // Import
        defaultBarrelModel[7] = new ModelRendererTurbo(this, 153, 321, textureX, textureY); // Import
        defaultBarrelModel[8] = new ModelRendererTurbo(this, 177, 321, textureX, textureY); // Import
        defaultBarrelModel[9] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Import
        defaultBarrelModel[10] = new ModelRendererTurbo(this, 225, 321, textureX, textureY); // Import
        defaultBarrelModel[11] = new ModelRendererTurbo(this, 249, 321, textureX, textureY); // Import
        defaultBarrelModel[12] = new ModelRendererTurbo(this, 273, 321, textureX, textureY); // Import
        defaultBarrelModel[13] = new ModelRendererTurbo(this, 313, 321, textureX, textureY); // Import
        defaultBarrelModel[14] = new ModelRendererTurbo(this, 353, 321, textureX, textureY); // Import
        defaultBarrelModel[15] = new ModelRendererTurbo(this, 25, 321, textureX, textureY); // Import
        defaultBarrelModel[16] = new ModelRendererTurbo(this, 113, 321, textureX, textureY); // Import
        defaultBarrelModel[17] = new ModelRendererTurbo(this, 409, 321, textureX, textureY); // Import
        defaultBarrelModel[18] = new ModelRendererTurbo(this, 457, 321, textureX, textureY); // Import
        defaultBarrelModel[19] = new ModelRendererTurbo(this, 337, 241, textureX, textureY); // Import
        defaultBarrelModel[20] = new ModelRendererTurbo(this, 241, 265, textureX, textureY); // Import
        defaultBarrelModel[21] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Import
        defaultBarrelModel[22] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Import
        defaultBarrelModel[23] = new ModelRendererTurbo(this, 425, 265, textureX, textureY); // Import
        defaultBarrelModel[24] = new ModelRendererTurbo(this, 449, 265, textureX, textureY); // Import
        defaultBarrelModel[25] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Import
        defaultBarrelModel[26] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Import

        defaultBarrelModel[0].addShapeBox(26F, -1F, -5F, 1, 2, 7, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F); // Import
        defaultBarrelModel[0].setRotationPoint(85.5F, -38.5F, 1.5F);

        defaultBarrelModel[1].addShapeBox(26F, -1F, -5F, 1, 2, 7, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        defaultBarrelModel[1].setRotationPoint(85.5F, -41F, 1.5F);

        defaultBarrelModel[2].addShapeBox(26F, -1F, -5F, 1, 2, 7, 0F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        defaultBarrelModel[2].setRotationPoint(85.5F, -43.5F, 1.5F);

        defaultBarrelModel[3].addShapeBox(26F, -1F, -5F, 2, 2, 7, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F); // Import
        defaultBarrelModel[3].setRotationPoint(87.5F, -38.5F, 1.5F);

        defaultBarrelModel[4].addShapeBox(26F, -1F, -5F, 2, 2, 7, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        defaultBarrelModel[4].setRotationPoint(87.5F, -41F, 1.5F);

        defaultBarrelModel[5].addShapeBox(26F, -1F, -5F, 2, 2, 7, 0F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        defaultBarrelModel[5].setRotationPoint(87.5F, -43.5F, 1.5F);

        defaultBarrelModel[6].addShapeBox(26F, -1F, -5F, 1, 2, 7, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F); // Import
        defaultBarrelModel[6].setRotationPoint(96.5F, -38.5F, 1.5F);

        defaultBarrelModel[7].addShapeBox(26F, -1F, -5F, 1, 2, 7, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        defaultBarrelModel[7].setRotationPoint(96.5F, -41F, 1.5F);

        defaultBarrelModel[8].addShapeBox(26F, -1F, -5F, 1, 2, 7, 0F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        defaultBarrelModel[8].setRotationPoint(96.5F, -43.5F, 1.5F);

        defaultBarrelModel[9].addShapeBox(26F, -1F, -5F, 7, 1, 7, 0F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F); // Import
        defaultBarrelModel[9].setRotationPoint(89.5F, -43.5F, 1.5F);

        defaultBarrelModel[10].addShapeBox(26F, -1F, -5F, 7, 1, 9, 0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F); // Import
        defaultBarrelModel[10].setRotationPoint(89.5F, -42F, 0.5F);

        defaultBarrelModel[11].addShapeBox(26F, -1F, -5F, 7, 1, 7, 0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F); // Import
        defaultBarrelModel[11].setRotationPoint(89.5F, -37.5F, 1.5F);

        defaultBarrelModel[12].addShapeBox(26F, -1F, -5F, 7, 1, 9, 0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        defaultBarrelModel[12].setRotationPoint(89.5F, -39F, 0.5F);

        defaultBarrelModel[13].addShapeBox(26F, -1F, -5F, 7, 1, 9, 0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F); // Import
        defaultBarrelModel[13].setRotationPoint(89.5F, -39.75F, 0.5F);

        defaultBarrelModel[14].addShapeBox(26F, -1F, -5F, 7, 1, 9, 0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F); // Import
        defaultBarrelModel[14].setRotationPoint(89.5F, -41.25F, 0.5F);

        defaultBarrelModel[15].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, 0.0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.25F, -0.75F, -1.0F, -0.25F, -0.75F, -1.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F); // Import
        defaultBarrelModel[15].setRotationPoint(89.5F, -41F, 0.5F);

        defaultBarrelModel[16].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, 0.0F, -0.25F, -0.75F, -1.0F, -0.25F, -0.75F, -1.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F); // Import
        defaultBarrelModel[16].setRotationPoint(89.5F, -40F, 0.5F);

        defaultBarrelModel[17].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, -0.75F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -1.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -1.0F, -0.25F, -0.75F); // Import
        defaultBarrelModel[17].setRotationPoint(95.5F, -41F, 0.5F);

        defaultBarrelModel[18].addShapeBox(26F, -1F, -5F, 1, 1, 9, 0F, -1.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -1.0F, -0.25F, -0.75F, -0.75F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F); // Import
        defaultBarrelModel[18].setRotationPoint(95.5F, -40F, 0.5F);

        defaultBarrelModel[19].addShapeBox(26F, -1F, -5F, 1, 1, 7, 0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -1.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -1.0F, -0.25F, -0.75F); // Import
        defaultBarrelModel[19].setRotationPoint(95.5F, -38.5F, 1.5F);

        defaultBarrelModel[20].addShapeBox(26F, -1F, -5F, 1, 1, 7, 0F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, -0.75F, -1.0F, -0.25F, -0.75F, -1.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F); // Import
        defaultBarrelModel[20].setRotationPoint(89.5F, -38.5F, 1.5F);

        defaultBarrelModel[21].addShapeBox(26F, -1F, -5F, 1, 1, 5, 0F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F); // Import
        defaultBarrelModel[21].setRotationPoint(89.5F, -37.75F, 2.5F);

        defaultBarrelModel[22].addShapeBox(26F, -1F, -5F, 1, 1, 5, 0F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -0.75F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F); // Import
        defaultBarrelModel[22].setRotationPoint(95.5F, -37.75F, 2.5F);

        defaultBarrelModel[23].addShapeBox(26F, -1F, -5F, 1, 1, 7, 0F, -1.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -1.0F, -0.25F, -0.75F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F); // Import
        defaultBarrelModel[23].setRotationPoint(95.5F, -42.5F, 1.5F);

        defaultBarrelModel[24].addShapeBox(26F, -1F, -5F, 1, 1, 7, 0F, 0.0F, -0.25F, -0.75F, -1.0F, -0.25F, -0.75F, -1.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F); // Import
        defaultBarrelModel[24].setRotationPoint(89.5F, -42.5F, 1.5F);

        defaultBarrelModel[25].addShapeBox(26F, -1F, -5F, 1, 1, 5, 0F, 0.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F); // Import
        defaultBarrelModel[25].setRotationPoint(89.5F, -43.25F, 2.5F);

        defaultBarrelModel[26].addShapeBox(26F, -1F, -5F, 1, 1, 5, 0F, -0.75F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F); // Import
        defaultBarrelModel[26].setRotationPoint(95.5F, -43.25F, 2.5F);
    }

    private void initdefaultScopeModel_1() {
        defaultScopeModel[0] = new ModelRendererTurbo(this, 353, 225, textureX, textureY); // Import
        defaultScopeModel[1] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Import
        defaultScopeModel[2] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Import
        defaultScopeModel[3] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Import
        defaultScopeModel[4] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Import
        defaultScopeModel[5] = new ModelRendererTurbo(this, 41, 329, textureX, textureY); // Import
        defaultScopeModel[6] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import
        defaultScopeModel[7] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Import
        defaultScopeModel[8] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Import
        defaultScopeModel[9] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Import
        defaultScopeModel[10] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Import
        defaultScopeModel[11] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Import
        defaultScopeModel[12] = new ModelRendererTurbo(this, 129, 329, textureX, textureY); // Import
        defaultScopeModel[13] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Import
        defaultScopeModel[14] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Import
        defaultScopeModel[15] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Import
        defaultScopeModel[16] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Import
        defaultScopeModel[17] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Import
        defaultScopeModel[18] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Import
        defaultScopeModel[19] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Import
        defaultScopeModel[20] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Import
        defaultScopeModel[21] = new ModelRendererTurbo(this, 465, 233, textureX, textureY); // Import
        defaultScopeModel[22] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Import
        defaultScopeModel[23] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Import
        defaultScopeModel[24] = new ModelRendererTurbo(this, 497, 169, textureX, textureY); // Import
        defaultScopeModel[25] = new ModelRendererTurbo(this, 17, 249, textureX, textureY); // Import
        defaultScopeModel[26] = new ModelRendererTurbo(this, 105, 273, textureX, textureY); // Import
        defaultScopeModel[27] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Import
        defaultScopeModel[28] = new ModelRendererTurbo(this, 417, 177, textureX, textureY); // Import
        defaultScopeModel[29] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Import
        defaultScopeModel[30] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Import
        defaultScopeModel[31] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Import
        defaultScopeModel[32] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Import
        defaultScopeModel[33] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Import
        defaultScopeModel[34] = new ModelRendererTurbo(this, 129, 193, textureX, textureY); // Import
        defaultScopeModel[35] = new ModelRendererTurbo(this, 185, 193, textureX, textureY); // Import
        defaultScopeModel[36] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Import
        defaultScopeModel[37] = new ModelRendererTurbo(this, 289, 193, textureX, textureY); // Import
        defaultScopeModel[38] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // Import
        defaultScopeModel[39] = new ModelRendererTurbo(this, 393, 193, textureX, textureY); // Import
        defaultScopeModel[40] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Import
        defaultScopeModel[41] = new ModelRendererTurbo(this, 385, 217, textureX, textureY); // Import
        defaultScopeModel[42] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Import
        defaultScopeModel[43] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Import
        defaultScopeModel[44] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Import
        defaultScopeModel[45] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Import
        defaultScopeModel[46] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Import
        defaultScopeModel[47] = new ModelRendererTurbo(this, 441, 225, textureX, textureY); // Import
        defaultScopeModel[48] = new ModelRendererTurbo(this, 233, 257, textureX, textureY); // Import
        defaultScopeModel[49] = new ModelRendererTurbo(this, 505, 161, textureX, textureY); // Import
        defaultScopeModel[50] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import
        defaultScopeModel[51] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Import
        defaultScopeModel[52] = new ModelRendererTurbo(this, 385, 329, textureX, textureY); // Import
        defaultScopeModel[53] = new ModelRendererTurbo(this, 425, 329, textureX, textureY); // Import
        defaultScopeModel[54] = new ModelRendererTurbo(this, 113, 193, textureX, textureY); // Import
        defaultScopeModel[55] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Import
        defaultScopeModel[56] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Import
        defaultScopeModel[57] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Import
        defaultScopeModel[58] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Import
        defaultScopeModel[59] = new ModelRendererTurbo(this, 25, 185, textureX, textureY); // Import
        defaultScopeModel[60] = new ModelRendererTurbo(this, 473, 329, textureX, textureY); // Import
        defaultScopeModel[61] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Import
        defaultScopeModel[62] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Import
        defaultScopeModel[63] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Import
        defaultScopeModel[64] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Import
        defaultScopeModel[65] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Import
        defaultScopeModel[66] = new ModelRendererTurbo(this, 169, 193, textureX, textureY); // Import
        defaultScopeModel[67] = new ModelRendererTurbo(this, 201, 193, textureX, textureY); // Import
        defaultScopeModel[68] = new ModelRendererTurbo(this, 361, 193, textureX, textureY); // Import
        defaultScopeModel[69] = new ModelRendererTurbo(this, 313, 289, textureX, textureY); // Import
        defaultScopeModel[70] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Import
        defaultScopeModel[71] = new ModelRendererTurbo(this, 425, 193, textureX, textureY); // Import
        defaultScopeModel[72] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); // Import
        defaultScopeModel[73] = new ModelRendererTurbo(this, 353, 273, textureX, textureY); // Import
        defaultScopeModel[74] = new ModelRendererTurbo(this, 353, 289, textureX, textureY); // Import
        defaultScopeModel[75] = new ModelRendererTurbo(this, 17, 297, textureX, textureY); // Import
        defaultScopeModel[76] = new ModelRendererTurbo(this, 473, 265, textureX, textureY); // Import
        defaultScopeModel[77] = new ModelRendererTurbo(this, 497, 233, textureX, textureY); // Import
        defaultScopeModel[78] = new ModelRendererTurbo(this, 49, 225, textureX, textureY); // Import
        defaultScopeModel[79] = new ModelRendererTurbo(this, 121, 225, textureX, textureY); // Import
        defaultScopeModel[80] = new ModelRendererTurbo(this, 465, 257, textureX, textureY); // Import
        defaultScopeModel[81] = new ModelRendererTurbo(this, 233, 201, textureX, textureY); // Import
        defaultScopeModel[82] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Import
        defaultScopeModel[83] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Import
        defaultScopeModel[84] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Import
        defaultScopeModel[85] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Import
        defaultScopeModel[86] = new ModelRendererTurbo(this, 265, 201, textureX, textureY); // Import
        defaultScopeModel[87] = new ModelRendererTurbo(this, 321, 201, textureX, textureY); // Import
        defaultScopeModel[88] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Import
        defaultScopeModel[89] = new ModelRendererTurbo(this, 409, 209, textureX, textureY); // Import
        defaultScopeModel[90] = new ModelRendererTurbo(this, 441, 201, textureX, textureY); // Import
        defaultScopeModel[91] = new ModelRendererTurbo(this, 41, 201, textureX, textureY); // Import
        defaultScopeModel[92] = new ModelRendererTurbo(this, 281, 201, textureX, textureY); // Import
        defaultScopeModel[93] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Import
        defaultScopeModel[94] = new ModelRendererTurbo(this, 177, 225, textureX, textureY); // Import
        defaultScopeModel[95] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Import
        defaultScopeModel[96] = new ModelRendererTurbo(this, 17, 209, textureX, textureY); // Import
        defaultScopeModel[97] = new ModelRendererTurbo(this, 41, 209, textureX, textureY); // Import
        defaultScopeModel[98] = new ModelRendererTurbo(this, 233, 209, textureX, textureY); // Import
        defaultScopeModel[99] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Import
        defaultScopeModel[100] = new ModelRendererTurbo(this, 265, 209, textureX, textureY); // Import
        defaultScopeModel[101] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Import
        defaultScopeModel[102] = new ModelRendererTurbo(this, 473, 217, textureX, textureY); // Import
        defaultScopeModel[103] = new ModelRendererTurbo(this, 33, 225, textureX, textureY); // Import
        defaultScopeModel[104] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Import
        defaultScopeModel[105] = new ModelRendererTurbo(this, 105, 225, textureX, textureY); // Import
        defaultScopeModel[106] = new ModelRendererTurbo(this, 145, 225, textureX, textureY); // Import
        defaultScopeModel[107] = new ModelRendererTurbo(this, 201, 225, textureX, textureY); // Import
        defaultScopeModel[108] = new ModelRendererTurbo(this, 217, 225, textureX, textureY); // Import

        defaultScopeModel[0].addShapeBox(26F, -1F, -5F, 9, 1, 2, 0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F); // Import
        defaultScopeModel[0].setRotationPoint(74.5F, -51.5F, 1F);

        defaultScopeModel[1].addShapeBox(26F, -1F, -5F, 1, 2, 2, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[1].setRotationPoint(74F, -54F, 1F);

        defaultScopeModel[2].addShapeBox(26F, -1F, -5F, 1, 2, 2, 0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        defaultScopeModel[2].setRotationPoint(74.5F, -54F, 1F);

        defaultScopeModel[3].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[3].setRotationPoint(75F, -53F, 1F);

        defaultScopeModel[4].addShapeBox(26F, -1F, -5F, 3, 2, 8, 0F, 0.5F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); // Import
        defaultScopeModel[4].setRotationPoint(80.5F, -56.5F, 1F);

        defaultScopeModel[5].addShapeBox(26F, -1F, -5F, 1, 2, 8, 0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[5].setRotationPoint(79.5F, -56.5F, 1F);

        defaultScopeModel[6].addShapeBox(26F, -1F, -5F, 3, 5, 1, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        defaultScopeModel[6].setRotationPoint(76.5F, -56.5F, 1.5F);

        defaultScopeModel[7].addShapeBox(26F, -1F, -5F, 1, 5, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        defaultScopeModel[7].setRotationPoint(75.5F, -56.5F, 1.5F);

        defaultScopeModel[8].addShapeBox(26F, -1F, -5F, 1, 5, 1, 0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        defaultScopeModel[8].setRotationPoint(74.5F, -56.5F, 1.5F);

        defaultScopeModel[9].addShapeBox(26F, -1F, -5F, 1, 2, 1, 0F, -0.5F, -1.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, -0.5F, -1.5F, 0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F); // Import
        defaultScopeModel[9].setRotationPoint(73.5F, -55.5F, 1.5F);

        defaultScopeModel[10].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[10].setRotationPoint(78F, -53F, 1F);

        defaultScopeModel[11].addShapeBox(26F, -1F, -5F, 1, 2, 2, 0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F); // Import
        defaultScopeModel[11].setRotationPoint(78.5F, -54F, 1F);

        defaultScopeModel[12].addShapeBox(26F, -1F, -5F, 4, 2, 8, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[12].setRotationPoint(79.5F, -54F, 1F);

        defaultScopeModel[13].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        defaultScopeModel[13].setRotationPoint(77F, -53F, 1F);

        defaultScopeModel[14].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.0F, -0.75F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[14].setRotationPoint(76F, -53F, 1F);

        defaultScopeModel[15].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 1.75F, 0.25F, -0.5F, 1.75F, 0.25F, -0.5F, 1.75F, 0.25F, 0.0F, 1.75F, 0.25F, 0.0F); // Import
        defaultScopeModel[15].setRotationPoint(76.5F, -56.5F, 0.5F);

        defaultScopeModel[16].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F); // Import
        defaultScopeModel[16].setRotationPoint(75F, -55F, 0.5F);

        defaultScopeModel[17].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 1.75F, 0.25F, -0.5F, 1.75F, 0.25F, -0.5F, 1.75F, 0.25F, 0.0F, 1.75F, 0.25F, 0.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F); // Import
        defaultScopeModel[17].setRotationPoint(76.5F, -53.5F, 0.5F);

        defaultScopeModel[18].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 1.25F, 0.25F, -0.5F, 1.25F, 0.25F, -0.5F, 1.75F, 0.25F, 0.0F, 1.75F, 0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F); // Import
        defaultScopeModel[18].setRotationPoint(76.5F, -53.5F, 0F);

        defaultScopeModel[19].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 1.25F, 0.25F, -0.5F, 1.25F, 0.25F, -0.5F, 1.75F, 0.25F, 0.0F, 1.75F, 0.25F, 0.0F); // Import
        defaultScopeModel[19].setRotationPoint(76.5F, -56.5F, 0F);

        defaultScopeModel[20].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 1.25F, 0.25F, -0.5F, 1.25F, 0.25F, -0.5F, 1.75F, 0.25F, 0.0F, 1.75F, 0.25F, 0.0F, 1.25F, 0.25F, -0.5F, 1.25F, 0.25F, -0.5F, 1.75F, 0.25F, 0.0F, 1.75F, 0.25F, 0.0F); // Import
        defaultScopeModel[20].setRotationPoint(76.5F, -55F, 0F);

        defaultScopeModel[21].addShapeBox(26F, -1F, -5F, 6, 1, 4, 0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[21].setRotationPoint(74F, -53.5F, 3F);

        defaultScopeModel[22].addShapeBox(26F, -1F, -5F, 3, 1, 1, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[22].setRotationPoint(80F, -52.5F, 0.25F);

        defaultScopeModel[23].addShapeBox(26F, -1F, -5F, 3, 1, 1, 0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[23].setRotationPoint(80F, -54.5F, 0.25F);

        defaultScopeModel[24].addShapeBox(26F, -1F, -5F, 3, 1, 1, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[24].setRotationPoint(80F, -53.5F, 0.25F);

        defaultScopeModel[25].addShapeBox(26F, -1F, -5F, 4, 2, 5, 0F, 0.0F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F); // Import
        defaultScopeModel[25].setRotationPoint(75F, -55.5F, 2.5F);

        defaultScopeModel[26].addShapeBox(26F, -1F, -5F, 4, 1, 5, 0F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F); // Import
        defaultScopeModel[26].setRotationPoint(75F, -54F, 2.5F);

        defaultScopeModel[27].addShapeBox(26F, -1F, -5F, 4, 1, 5, 0F, 0.0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F); // Import
        defaultScopeModel[27].setRotationPoint(75F, -56.5F, 2.5F);

        defaultScopeModel[28].addShapeBox(26F, -1F, -5F, 4, 3, 4, 0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        defaultScopeModel[28].setRotationPoint(75F, -59.5F, 3F);

        defaultScopeModel[29].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        defaultScopeModel[29].setRotationPoint(75F, -60.5F, 6F);

        defaultScopeModel[30].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F); // Import
        defaultScopeModel[30].setRotationPoint(75F, -61.5F, 6.5F);

        defaultScopeModel[31].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F); // Import
        defaultScopeModel[31].setRotationPoint(75F, -62.5F, 7F);

        defaultScopeModel[32].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, -0.75F, 0.5F, 0.25F, -0.75F, 0.5F, 0.25F, -0.75F, 0.25F, -0.35F, -0.75F, 0.25F, -0.35F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F); // Import
        defaultScopeModel[32].setRotationPoint(75F, -63.25F, 6.5F);

        defaultScopeModel[33].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        defaultScopeModel[33].setRotationPoint(75F, -61F, 6.5F);

        defaultScopeModel[34].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.0F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F); // Import
        defaultScopeModel[34].setRotationPoint(75F, -61.5F, 2.5F);

        defaultScopeModel[35].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        defaultScopeModel[35].setRotationPoint(75F, -62.5F, 2F);

        defaultScopeModel[36].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, -0.75F, 0.25F, -0.35F, -0.75F, 0.25F, -0.35F, -0.75F, 0.5F, 0.25F, -0.75F, 0.5F, 0.25F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F); // Import
        defaultScopeModel[36].setRotationPoint(75F, -63.25F, 2.5F);

        defaultScopeModel[37].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F); // Import
        defaultScopeModel[37].setRotationPoint(75F, -61F, 2.5F);

        defaultScopeModel[38].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        defaultScopeModel[38].setRotationPoint(75F, -60.5F, 3F);

        defaultScopeModel[39].addShapeBox(26F, -1F, -5F, 5, 2, 2, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        defaultScopeModel[39].setRotationPoint(74.5F, -55F, 7F);

        defaultScopeModel[40].addShapeBox(26F, -1F, -5F, 5, 1, 2, 0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        defaultScopeModel[40].setRotationPoint(74.5F, -56F, 7F);

        defaultScopeModel[41].addShapeBox(26F, -1F, -5F, 5, 1, 2, 0F, -1.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -1.5F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F); // Import
        defaultScopeModel[41].setRotationPoint(74.5F, -57F, 7F);

        defaultScopeModel[42].addShapeBox(26F, -1F, -5F, 1, 1, 2, 0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F); // Import
        defaultScopeModel[42].setRotationPoint(76.75F, -60.5F, 4F);

        defaultScopeModel[43].addShapeBox(26F, -1F, -5F, 1, 1, 2, 0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F); // Import
        defaultScopeModel[43].setRotationPoint(76.25F, -60.5F, 4F);

        defaultScopeModel[44].addShapeBox(26F, -1F, -5F, 1, 1, 2, 0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F); // Import
        defaultScopeModel[44].setRotationPoint(77.25F, -60.5F, 4F);

        defaultScopeModel[45].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F); // Import
        defaultScopeModel[45].setRotationPoint(76.75F, -61.5F, 4.5F);

        defaultScopeModel[46].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Import
        defaultScopeModel[46].setRotationPoint(76.75F, -62.5F, 4.5F);

        defaultScopeModel[47].addShapeBox(26F, -1F, -5F, 9, 1, 2, 0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F); // Import
        defaultScopeModel[47].setRotationPoint(74.5F, -50.5F, 1F);

        defaultScopeModel[48].addShapeBox(26F, -1F, -5F, 9, 1, 2, 0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F); // Import
        defaultScopeModel[48].setRotationPoint(-12.5F, -51.5F, 1F);

        defaultScopeModel[49].addShapeBox(26F, -1F, -5F, 1, 2, 2, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[49].setRotationPoint(-13F, -54F, 1F);

        defaultScopeModel[50].addShapeBox(26F, -1F, -5F, 1, 2, 2, 0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        defaultScopeModel[50].setRotationPoint(-12.5F, -54F, 1F);

        defaultScopeModel[51].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[51].setRotationPoint(-12F, -53F, 1F);

        defaultScopeModel[52].addShapeBox(26F, -1F, -5F, 3, 2, 8, 0F, 0.5F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); // Import
        defaultScopeModel[52].setRotationPoint(-6.5F, -56.5F, 1F);

        defaultScopeModel[53].addShapeBox(26F, -1F, -5F, 1, 2, 8, 0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[53].setRotationPoint(-7.5F, -56.5F, 1F);

        defaultScopeModel[54].addShapeBox(26F, -1F, -5F, 3, 5, 1, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        defaultScopeModel[54].setRotationPoint(-10.5F, -56.5F, 1.5F);

        defaultScopeModel[55].addShapeBox(26F, -1F, -5F, 1, 5, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        defaultScopeModel[55].setRotationPoint(-11.5F, -56.5F, 1.5F);

        defaultScopeModel[56].addShapeBox(26F, -1F, -5F, 1, 5, 1, 0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        defaultScopeModel[56].setRotationPoint(-12.5F, -56.5F, 1.5F);

        defaultScopeModel[57].addShapeBox(26F, -1F, -5F, 1, 2, 1, 0F, -0.5F, -1.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, -0.5F, -1.5F, 0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F); // Import
        defaultScopeModel[57].setRotationPoint(-13.5F, -55.5F, 1.5F);

        defaultScopeModel[58].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[58].setRotationPoint(-9F, -53F, 1F);

        defaultScopeModel[59].addShapeBox(26F, -1F, -5F, 1, 2, 2, 0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F); // Import
        defaultScopeModel[59].setRotationPoint(-8.5F, -54F, 1F);

        defaultScopeModel[60].addShapeBox(26F, -1F, -5F, 4, 2, 8, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[60].setRotationPoint(-7.5F, -54F, 1F);

        defaultScopeModel[61].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        defaultScopeModel[61].setRotationPoint(-10F, -53F, 1F);

        defaultScopeModel[62].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.0F, -0.75F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[62].setRotationPoint(-11F, -53F, 1F);

        defaultScopeModel[63].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 1.75F, 0.25F, -0.5F, 1.75F, 0.25F, -0.5F, 1.75F, 0.25F, 0.0F, 1.75F, 0.25F, 0.0F); // Import
        defaultScopeModel[63].setRotationPoint(-10.5F, -56.5F, 0.5F);

        defaultScopeModel[64].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F); // Import
        defaultScopeModel[64].setRotationPoint(-12F, -55F, 0.5F);

        defaultScopeModel[65].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 1.75F, 0.25F, -0.5F, 1.75F, 0.25F, -0.5F, 1.75F, 0.25F, 0.0F, 1.75F, 0.25F, 0.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F); // Import
        defaultScopeModel[65].setRotationPoint(-10.5F, -53.5F, 0.5F);

        defaultScopeModel[66].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 1.25F, 0.25F, -0.5F, 1.25F, 0.25F, -0.5F, 1.75F, 0.25F, 0.0F, 1.75F, 0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F); // Import
        defaultScopeModel[66].setRotationPoint(-10.5F, -53.5F, 0F);

        defaultScopeModel[67].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 1.25F, 0.25F, -0.5F, 1.25F, 0.25F, -0.5F, 1.75F, 0.25F, 0.0F, 1.75F, 0.25F, 0.0F); // Import
        defaultScopeModel[67].setRotationPoint(-10.5F, -56.5F, 0F);

        defaultScopeModel[68].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 1.25F, 0.25F, -0.5F, 1.25F, 0.25F, -0.5F, 1.75F, 0.25F, 0.0F, 1.75F, 0.25F, 0.0F, 1.25F, 0.25F, -0.5F, 1.25F, 0.25F, -0.5F, 1.75F, 0.25F, 0.0F, 1.75F, 0.25F, 0.0F); // Import
        defaultScopeModel[68].setRotationPoint(-10.5F, -55F, 0F);

        defaultScopeModel[69].addShapeBox(26F, -1F, -5F, 6, 1, 4, 0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[69].setRotationPoint(-13F, -53.5F, 3F);

        defaultScopeModel[70].addShapeBox(26F, -1F, -5F, 3, 1, 1, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[70].setRotationPoint(-7F, -52.5F, 0.25F);

        defaultScopeModel[71].addShapeBox(26F, -1F, -5F, 3, 1, 1, 0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[71].setRotationPoint(-7F, -54.5F, 0.25F);

        defaultScopeModel[72].addShapeBox(26F, -1F, -5F, 3, 1, 1, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[72].setRotationPoint(-7F, -53.5F, 0.25F);

        defaultScopeModel[73].addShapeBox(26F, -1F, -5F, 4, 2, 5, 0F, 0.0F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F); // Import
        defaultScopeModel[73].setRotationPoint(-12F, -55.5F, 2.5F);

        defaultScopeModel[74].addShapeBox(26F, -1F, -5F, 4, 1, 5, 0F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F); // Import
        defaultScopeModel[74].setRotationPoint(-12F, -54F, 2.5F);

        defaultScopeModel[75].addShapeBox(26F, -1F, -5F, 4, 1, 5, 0F, 0.0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F); // Import
        defaultScopeModel[75].setRotationPoint(-12F, -56.5F, 2.5F);

        defaultScopeModel[76].addShapeBox(26F, -1F, -5F, 4, 1, 4, 0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        defaultScopeModel[76].setRotationPoint(-12F, -57.5F, 3F);

        defaultScopeModel[77].addShapeBox(26F, -1F, -5F, 5, 2, 2, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        defaultScopeModel[77].setRotationPoint(-12.5F, -55F, 7F);

        defaultScopeModel[78].addShapeBox(26F, -1F, -5F, 5, 1, 2, 0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        defaultScopeModel[78].setRotationPoint(-12.5F, -56F, 7F);

        defaultScopeModel[79].addShapeBox(26F, -1F, -5F, 5, 1, 2, 0F, -1.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -1.5F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F); // Import
        defaultScopeModel[79].setRotationPoint(-12.5F, -57F, 7F);

        defaultScopeModel[80].addShapeBox(26F, -1F, -5F, 9, 1, 2, 0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F); // Import
        defaultScopeModel[80].setRotationPoint(-12.5F, -50.5F, 1F);

        defaultScopeModel[81].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.0F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        defaultScopeModel[81].setRotationPoint(-12F, -60F, 1.75F);

        defaultScopeModel[82].addShapeBox(26F, -1F, -5F, 3, 2, 1, 0F, 0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F); // Import
        defaultScopeModel[82].setRotationPoint(-11F, -62F, 1.75F);

        defaultScopeModel[83].addShapeBox(26F, -1F, -5F, 3, 1, 1, 0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F); // Import
        defaultScopeModel[83].setRotationPoint(-12F, -63F, 1.75F);

        defaultScopeModel[84].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.5F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F); // Import
        defaultScopeModel[84].setRotationPoint(-11.5F, -61F, 1.75F);

        defaultScopeModel[85].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F); // Import
        defaultScopeModel[85].setRotationPoint(-11.5F, -62F, 1.75F);

        defaultScopeModel[86].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.0F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        defaultScopeModel[86].setRotationPoint(-12F, -60F, 7.25F);

        defaultScopeModel[87].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.0F, 1.0F, 0.25F, 0.5F, 1.0F, 0.25F, 0.5F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, -0.5F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F); // Import
        defaultScopeModel[87].setRotationPoint(-12F, -58.5F, 2F);

        defaultScopeModel[88].addShapeBox(26F, -1F, -5F, 4, 1, 1, 0F, 0.0F, 1.0F, -0.25F, 0.5F, 1.0F, -0.25F, 0.5F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, -0.5F, 1.0F, 0.5F, -0.5F, 1.0F, 0.5F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); // Import
        defaultScopeModel[88].setRotationPoint(-12F, -58.5F, 7F);

        defaultScopeModel[89].addShapeBox(26F, -1F, -5F, 3, 2, 1, 0F, 0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F); // Import
        defaultScopeModel[89].setRotationPoint(-11F, -62F, 7.25F);

        defaultScopeModel[90].addShapeBox(26F, -1F, -5F, 3, 1, 1, 0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F); // Import
        defaultScopeModel[90].setRotationPoint(-12F, -63F, 7.25F);

        defaultScopeModel[91].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.5F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F); // Import
        defaultScopeModel[91].setRotationPoint(-11.5F, -61F, 7.25F);

        defaultScopeModel[92].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F); // Import
        defaultScopeModel[92].setRotationPoint(-11.5F, -62F, 7.25F);

        defaultScopeModel[93].addShapeBox(26F, -1F, -5F, 1, 1, 5, 0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, -0.5F, -0.15F, -0.15F, -0.5F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, -0.5F, -0.15F, -0.15F, -0.5F); // Import
        defaultScopeModel[93].setRotationPoint(-10.5F, -60.65F, 2.75F);

        defaultScopeModel[94].addShapeBox(26F, -1F, -5F, 4, 1, 2, 0F, 0.0F, 0.5F, -0.15F, 0.5F, 0.5F, -0.15F, 0.5F, 0.5F, 1.85F, 0.0F, 0.5F, 1.85F, 0.0F, -0.5F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F); // Import
        defaultScopeModel[94].setRotationPoint(-12F, -58.5F, 3F);

        defaultScopeModel[95].addShapeBox(26F, -1F, -5F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F); // Import
        defaultScopeModel[95].setRotationPoint(-12F, -61.5F, 8.25F);

        defaultScopeModel[96].addShapeBox(26F, -1F, -5F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F); // Import
        defaultScopeModel[96].setRotationPoint(-12F, -60.5F, 8.25F);

        defaultScopeModel[97].addShapeBox(26F, -1F, -5F, 3, 1, 1, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F); // Import
        defaultScopeModel[97].setRotationPoint(-12F, -62.5F, 8.25F);

        defaultScopeModel[98].addShapeBox(26F, -1F, -5F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F); // Import
        defaultScopeModel[98].setRotationPoint(-12F, -61.5F, 1.5F);

        defaultScopeModel[99].addShapeBox(26F, -1F, -5F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F); // Import
        defaultScopeModel[99].setRotationPoint(-12F, -60.5F, 1.5F);

        defaultScopeModel[100].addShapeBox(26F, -1F, -5F, 3, 1, 1, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F); // Import
        defaultScopeModel[100].setRotationPoint(-12F, -62.5F, 1.5F);

        defaultScopeModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.15F, -0.1F, 0.0F, -0.15F, -0.1F, 0.0F, -0.15F, -0.1F, -0.5F, -0.15F, -0.1F, -0.5F, -0.15F, 0.25F, 0.0F, -0.15F, 0.25F, 0.0F, -0.15F, 0.25F, -0.5F, -0.15F, 0.25F, -0.5F); // Import
        defaultScopeModel[101].setRotationPoint(15.5F, -62.75F, -1.25F);

        defaultScopeModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, 0.1F, 0.0F, -0.15F, 0.1F, 0.0F, -0.15F, 0.1F, -0.4F, -0.15F, 0.1F, -0.4F, -0.15F, 0.1F, 0.0F, -0.15F, 0.1F, 0.0F, -0.15F, 0.1F, -0.4F, -0.15F, 0.1F, -0.4F); // Import
        defaultScopeModel[102].setRotationPoint(15.5F, -63.75F, -1.25F);

        defaultScopeModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, 0.1F, 0.1F, -0.15F, 0.1F, 0.1F, -0.15F, 0.1F, -0.5F, -0.15F, 0.1F, -0.5F, -0.15F, 0.1F, 0.1F, -0.15F, 0.1F, 0.1F, -0.15F, 0.1F, -0.5F, -0.15F, 0.1F, -0.5F); // Import
        defaultScopeModel[103].setRotationPoint(15.5F, -63.75F, 0.75F);

        defaultScopeModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.15F, -0.5F, -0.25F, -0.15F, -0.5F, -0.25F, -0.15F, -0.5F, -0.75F, -0.15F, -0.5F, -0.75F, -0.15F, -0.1F, 0.0F, -0.15F, -0.1F, 0.0F, -0.15F, -0.1F, -0.5F, -0.15F, -0.1F, -0.5F); // Import
        defaultScopeModel[104].setRotationPoint(15.5F, -64.75F, -1.25F);

        defaultScopeModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.75F, -1.0F, -0.15F, -0.75F, -1.0F, -0.15F, -0.75F, 0.0F, -0.15F, -0.75F, 0.0F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F); // Import
        defaultScopeModel[105].setRotationPoint(15.5F, -63.65F, -0.35F);

        defaultScopeModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.75F, 0.0F, -0.15F, -0.75F, 0.0F, -0.15F, -0.75F, -1.0F, -0.15F, -0.75F, -1.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F); // Import
        defaultScopeModel[106].setRotationPoint(15.5F, -63.65F, -0.65F);

        defaultScopeModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, -0.75F, -1.0F, -0.15F, -0.75F, -1.0F, -0.15F, -0.75F, 0.0F, -0.15F, -0.75F, 0.0F); // Import
        defaultScopeModel[107].setRotationPoint(15.5F, -63.85F, -0.35F);

        defaultScopeModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F, -0.75F, 0.0F, -0.15F, -0.75F, 0.0F, -0.15F, -0.75F, -1.0F, -0.15F, -0.75F, -1.0F); // Import
        defaultScopeModel[108].setRotationPoint(15.5F, -63.85F, -0.65F);
    }

    private void initdefaultGripModel_1() {
        defaultGripModel[0] = new ModelRendererTurbo(this, 97, 329, textureX, textureY); // Import
        defaultGripModel[1] = new ModelRendererTurbo(this, 161, 329, textureX, textureY); // Import
        defaultGripModel[2] = new ModelRendererTurbo(this, 185, 329, textureX, textureY); // Import
        defaultGripModel[3] = new ModelRendererTurbo(this, 297, 329, textureX, textureY); // Import
        defaultGripModel[4] = new ModelRendererTurbo(this, 17, 337, textureX, textureY); // Import
        defaultGripModel[5] = new ModelRendererTurbo(this, 57, 337, textureX, textureY); // Import
        defaultGripModel[6] = new ModelRendererTurbo(this, 201, 337, textureX, textureY); // Import
        defaultGripModel[7] = new ModelRendererTurbo(this, 233, 337, textureX, textureY); // Import

        defaultGripModel[0].addShapeBox(26F, -1F, -5F, 3, 4, 9, 0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.75F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, -0.75F, 0.5F, -1.0F); // Import
        defaultGripModel[0].setRotationPoint(81.25F, -28F, 0.5F);

        defaultGripModel[1].addShapeBox(26F, -1F, -5F, 2, 1, 9, 0F, 0.25F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.25F, -0.5F, -1.0F, -0.25F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, -0.25F, 0.5F, -1.5F); // Import
        defaultGripModel[1].setRotationPoint(82.25F, -24F, 0.5F);

        defaultGripModel[2].addShapeBox(26F, -1F, -5F, 2, 1, 9, 0F, -0.25F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, -0.25F, -0.5F, -1.5F, -1.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, -1.0F, 0.0F, -2.25F); // Import
        defaultGripModel[2].setRotationPoint(82.25F, -23F, 0.5F);

        defaultGripModel[3].addShapeBox(26F, -1F, -5F, 3, 1, 9, 0F, 1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 1.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F); // Import
        defaultGripModel[3].setRotationPoint(81.25F, -29F, 0.5F);

        defaultGripModel[4].addShapeBox(26F, -1F, -5F, 5, 1, 9, 0F, 1.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F); // Import
        defaultGripModel[4].setRotationPoint(79.25F, -30F, 0.5F);

        defaultGripModel[5].addShapeBox(26F, -1F, -5F, 5, 1, 9, 0F, 1.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.75F, -0.5F, 0.0F, 1.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 1.25F, 0.5F, 0.0F); // Import
        defaultGripModel[5].setRotationPoint(79.25F, -31F, 0.5F);

        defaultGripModel[6].addShapeBox(26F, -1F, -5F, 5, 1, 9, 0F, 1.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.75F, -0.5F, 0.0F, 1.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 1.75F, 0.5F, 0.0F); // Import
        defaultGripModel[6].setRotationPoint(79.25F, -32F, 0.5F);

        defaultGripModel[7].addShapeBox(26F, -1F, -5F, 5, 1, 9, 0F, 1.75F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.75F, -1.0F, 0.0F, 1.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 1.75F, 0.5F, 0.0F); // Import
        defaultGripModel[7].setRotationPoint(79.25F, -33F, 0.5F);
    }

    private void initammoModel_1() {
        ammoModel[0] = new ModelRendererTurbo(this, 313, 337, textureX, textureY); // Import
        ammoModel[1] = new ModelRendererTurbo(this, 81, 345, textureX, textureY); // Import
        ammoModel[2] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Import
        ammoModel[3] = new ModelRendererTurbo(this, 257, 345, textureX, textureY); // Import
        ammoModel[4] = new ModelRendererTurbo(this, 361, 345, textureX, textureY); // Import
        ammoModel[5] = new ModelRendererTurbo(this, 409, 345, textureX, textureY); // Import
        ammoModel[6] = new ModelRendererTurbo(this, 457, 345, textureX, textureY); // Import
        ammoModel[7] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Import
        ammoModel[8] = new ModelRendererTurbo(this, 177, 353, textureX, textureY); // Import
        ammoModel[9] = new ModelRendererTurbo(this, 41, 361, textureX, textureY); // Import

        ammoModel[0].addShapeBox(26F, -1F, -5F, 13, 11, 10, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import
        ammoModel[0].setRotationPoint(20F, -10.75F, 0F);

        ammoModel[1].addShapeBox(26F, -1F, -5F, 13, 11, 10, 0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F); // Import
        ammoModel[1].setRotationPoint(22F, 0.25F, 0F);

        ammoModel[2].addShapeBox(26F, -1F, -5F, 13, 11, 10, 0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, 4.25F, 0.0F, 0.0F, 4.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F); // Import
        ammoModel[2].setRotationPoint(25F, 11.25F, 0F);

        ammoModel[3].addShapeBox(26F, -1F, -5F, 13, 6, 10, 0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F); // Import
        ammoModel[3].setRotationPoint(29F, 22.25F, 0F);

        ammoModel[4].addShapeBox(26F, -1F, -5F, 13, 6, 10, 0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.25F, -5.25F, 0.0F, 0.25F, -5.25F, 0.0F, -1.5F, 0.0F, 0.0F); // Import
        ammoModel[4].setRotationPoint(32F, 28.25F, 0F);

        ammoModel[5].addShapeBox(26F, -1F, -5F, 13, 11, 10, 0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        ammoModel[5].setRotationPoint(20F, -21.75F, 0F);

        ammoModel[6].addShapeBox(26F, -1F, -5F, 13, 11, 10, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        ammoModel[6].setRotationPoint(18.5F, -32.75F, 0F);

        ammoModel[7].addShapeBox(26F, -1F, -5F, 11, 1, 12, 0F, 0.25F, -6.0F, -1.0F, 0.5F, -0.75F, -1.0F, 0.5F, -0.75F, -1.0F, 0.25F, -6.0F, -1.0F, 0.0F, 6.0F, -0.25F, 1.15F, 0.75F, -0.25F, 1.15F, 0.75F, -0.25F, 0.0F, 6.0F, -0.25F); // Import
        ammoModel[7].setRotationPoint(33.75F, 28.25F, -1F);

        ammoModel[8].addShapeBox(26F, -1F, -5F, 11, 2, 12, 0F, 0.0F, -6.0F, -0.25F, 1.1F, -0.75F, -0.25F, 1.1F, -0.75F, -0.25F, 0.0F, -6.0F, -0.25F, -1.0F, 6.0F, -0.25F, 1.8F, 0.75F, -0.25F, 1.8F, 0.75F, -0.25F, -1.0F, 6.0F, -0.25F); // Import
        ammoModel[8].setRotationPoint(33.75F, 29.25F, -1F);

        ammoModel[9].addShapeBox(26F, -1F, -5F, 12, 1, 12, 0F, -1.0F, -6.0F, -0.25F, 0.8F, -0.75F, -0.25F, 0.8F, -0.75F, -0.25F, -1.0F, -6.0F, -0.25F, -1.5F, 6.0F, -1.0F, 0.45F, 0.75F, -1.0F, 0.45F, 0.75F, -1.0F, -1.5F, 6.0F, -1.0F); // Import
        ammoModel[9].setRotationPoint(33.75F, 31.25F, -1F);
    }

    private void initslideModel_1() {
        slideModel[0] = new ModelRendererTurbo(this, 257, 337, textureX, textureY); // Import
        slideModel[1] = new ModelRendererTurbo(this, 353, 337, textureX, textureY); // Import
        slideModel[2] = new ModelRendererTurbo(this, 297, 209, textureX, textureY); // Import
        slideModel[3] = new ModelRendererTurbo(this, 369, 209, textureX, textureY); // Import
        slideModel[4] = new ModelRendererTurbo(this, 169, 345, textureX, textureY); // Import
        slideModel[5] = new ModelRendererTurbo(this, 41, 353, textureX, textureY); // Import
        slideModel[6] = new ModelRendererTurbo(this, 81, 313, textureX, textureY); // Import
        slideModel[7] = new ModelRendererTurbo(this, 217, 209, textureX, textureY); // Import
        slideModel[8] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Import
        slideModel[9] = new ModelRendererTurbo(this, 305, 209, textureX, textureY); // Import
        slideModel[10] = new ModelRendererTurbo(this, 321, 209, textureX, textureY); // Import

        slideModel[0].addShapeBox(26F, -1F, -5F, 14, 1, 1, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        slideModel[0].setRotationPoint(18F, -39.5F, 1F);

        slideModel[1].addShapeBox(26F, -1F, -5F, 14, 1, 1, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        slideModel[1].setRotationPoint(18F, -38.5F, 1F);

        slideModel[2].addShapeBox(26F, -1F, -5F, 2, 3, 1, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        slideModel[2].setRotationPoint(18F, -42.5F, 1F);

        slideModel[3].addShapeBox(26F, -1F, -5F, 2, 3, 1, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        slideModel[3].setRotationPoint(30F, -42.5F, 1F);

        slideModel[4].addShapeBox(26F, -1F, -5F, 14, 1, 1, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        slideModel[4].setRotationPoint(18F, -43.5F, 1F);

        slideModel[5].addShapeBox(26F, -1F, -5F, 14, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        slideModel[5].setRotationPoint(18F, -44.5F, 1F);

        slideModel[6].addShapeBox(26F, -1F, -5F, 10, 3, 1, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        slideModel[6].setRotationPoint(20F, -42.5F, 1.5F);

        slideModel[7].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -1.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, -1.0F, -0.5F, 1.0F, -0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F); // Import
        slideModel[7].setRotationPoint(29F, -40.5F, 1F);

        slideModel[8].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, -0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -1.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, -1.0F, -0.5F, 1.0F); // Import
        slideModel[8].setRotationPoint(29F, -42.5F, 1F);

        slideModel[9].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.0F, -0.5F, 1.0F, -1.0F, -0.5F, 1.0F, -1.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        slideModel[9].setRotationPoint(20F, -40.5F, 1F);

        slideModel[10].addShapeBox(26F, -1F, -5F, 1, 1, 1, 0F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 1.0F, -1.0F, -0.5F, 1.0F, -1.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F); // Import
        slideModel[10].setRotationPoint(20F, -42.5F, 1F);
    }
}