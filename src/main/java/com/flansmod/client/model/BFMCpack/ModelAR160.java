//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AR160
// Model Creator: 
// Created on: 08.03.2023 - 19:31:59
// Last changed on: 08.03.2023 - 19:31:59

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelAR160 extends ModelGun //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public ModelAR160() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[532];
        defaultScopeModel = new ModelRendererTurbo[118];
        defaultGripModel = new ModelRendererTurbo[21];
        ammoModel = new ModelRendererTurbo[20];
        slideModel = new ModelRendererTurbo[4];

        initgunModel_1();
        initgunModel_2();
        initdefaultScopeModel_1();
        initdefaultGripModel_1();
        initammoModel_1();
        initslideModel_1();

        barrelAttachPoint = new Vector3f(120F / 16F, 36F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(75.5F / 16F, 38F / 16F, -6.5F / 16F);
        scopeAttachPoint = new Vector3f(17F / 16F, 47F / 16F, 0F / 16F);
        gripAttachPoint = new Vector3f(68 / 16F, 28.5F / 16F, 0F / 16F);


        thirdPersonOffset = new Vector3f(0.0F, -0.06F, 0.0F);
        gunSlideDistance = 1.5F;
        animationType = EnumAnimationType.CUSTOM;
        rotateGunHorizontal = 15F;
        tiltGun = 30F;
        translateGun = new Vector3f(0.0F, 0.0F, -0.1875F);
        translateClip = new Vector3f(0.0F, -0.63F, 0.0F);
        hasFlash = true;
        hasArms = true;
        rightHandAmmo = false;
        leftHandAmmo = true;
        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);
        casingAttachPoint = new Vector3f(1.0F, 1.6F, 0.0F);
        casingAnimDistance = new Vector3f(0.0F, 3F, 7.75F);
        casingAnimSpread = new Vector3f(3F, 5F, 3F);
        casingAnimTime = 5;
        casingRotateVector = new Vector3f(0.1F, 0.0F, 0.1F);

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

        caseScale = 0.2F;
        casingDelay = 0;
        flashScale = 0.4F;
        translateAll(-5F, 1F, 0F);
        crouchZoom = -0.05F;
        zoomOffsetY = -0.055F;
        zoomOffset = 0.25F;
        gunOffsetX = -1F;
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
        gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import
        gunModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import
        gunModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import
        gunModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import
        gunModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import
        gunModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import
        gunModel[7] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import
        gunModel[8] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import
        gunModel[9] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import
        gunModel[10] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import
        gunModel[11] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import
        gunModel[12] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import
        gunModel[13] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import
        gunModel[14] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import
        gunModel[15] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import
        gunModel[16] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import
        gunModel[17] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import
        gunModel[18] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import
        gunModel[19] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import
        gunModel[20] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import
        gunModel[21] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import
        gunModel[22] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import
        gunModel[23] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import
        gunModel[24] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import
        gunModel[25] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import
        gunModel[26] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Import
        gunModel[27] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Import
        gunModel[28] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Import
        gunModel[29] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import
        gunModel[30] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Import
        gunModel[31] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Import
        gunModel[32] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Import
        gunModel[33] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Import
        gunModel[34] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Import
        gunModel[35] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Import
        gunModel[36] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Import
        gunModel[37] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Import
        gunModel[38] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Import
        gunModel[39] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Import
        gunModel[40] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import
        gunModel[41] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Import
        gunModel[42] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import
        gunModel[43] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import
        gunModel[44] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Import
        gunModel[45] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import
        gunModel[46] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Import
        gunModel[47] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Import
        gunModel[48] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Import
        gunModel[49] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Import
        gunModel[50] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Import
        gunModel[51] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Import
        gunModel[52] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Import
        gunModel[53] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Import
        gunModel[54] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Import
        gunModel[55] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Import
        gunModel[56] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Import
        gunModel[57] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import
        gunModel[58] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import
        gunModel[59] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Import
        gunModel[60] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import
        gunModel[61] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Import
        gunModel[62] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Import
        gunModel[63] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Import
        gunModel[64] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Import
        gunModel[65] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Import
        gunModel[66] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Import
        gunModel[67] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Import
        gunModel[68] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Import
        gunModel[69] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Import
        gunModel[70] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Import
        gunModel[71] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Import
        gunModel[72] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Import
        gunModel[73] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Import
        gunModel[74] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Import
        gunModel[75] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Import
        gunModel[76] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import
        gunModel[77] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Import
        gunModel[78] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Import
        gunModel[79] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Import
        gunModel[80] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Import
        gunModel[81] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Import
        gunModel[82] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Import
        gunModel[83] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Import
        gunModel[84] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Import
        gunModel[85] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Import
        gunModel[86] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Import
        gunModel[87] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Import
        gunModel[88] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Import
        gunModel[89] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Import
        gunModel[90] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import
        gunModel[91] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Import
        gunModel[92] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import
        gunModel[93] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Import
        gunModel[94] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Import
        gunModel[95] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import
        gunModel[96] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Import
        gunModel[97] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Import
        gunModel[98] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Import
        gunModel[99] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import
        gunModel[100] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Import
        gunModel[101] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Import
        gunModel[102] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Import
        gunModel[103] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Import
        gunModel[104] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Import
        gunModel[105] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Import
        gunModel[106] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Import
        gunModel[107] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Import
        gunModel[108] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Import
        gunModel[109] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Import
        gunModel[110] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Import
        gunModel[111] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Import
        gunModel[112] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Import
        gunModel[113] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Import
        gunModel[114] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Import
        gunModel[115] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Import
        gunModel[116] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Import
        gunModel[117] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Import
        gunModel[118] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Import
        gunModel[119] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Import
        gunModel[120] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Import
        gunModel[121] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Import
        gunModel[122] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Import
        gunModel[123] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Import
        gunModel[124] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Import
        gunModel[125] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Import
        gunModel[126] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Import
        gunModel[127] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Import
        gunModel[128] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Import
        gunModel[129] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Import
        gunModel[130] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Import
        gunModel[131] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import
        gunModel[132] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Import
        gunModel[133] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Import
        gunModel[134] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Import
        gunModel[135] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Import
        gunModel[136] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import
        gunModel[137] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Import
        gunModel[138] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Import
        gunModel[139] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import
        gunModel[140] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Import
        gunModel[141] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Import
        gunModel[142] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Import
        gunModel[143] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Import
        gunModel[144] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Import
        gunModel[145] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Import
        gunModel[146] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Import
        gunModel[147] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Import
        gunModel[148] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Import
        gunModel[149] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Import
        gunModel[150] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Import
        gunModel[151] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Import
        gunModel[152] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Import
        gunModel[153] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Import
        gunModel[154] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Import
        gunModel[155] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import
        gunModel[156] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Import
        gunModel[157] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Import
        gunModel[158] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Import
        gunModel[159] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Import
        gunModel[160] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Import
        gunModel[161] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Import
        gunModel[162] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Import
        gunModel[163] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Import
        gunModel[164] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Import
        gunModel[165] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Import
        gunModel[166] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Import
        gunModel[167] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Import
        gunModel[168] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Import
        gunModel[169] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Import
        gunModel[170] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Import
        gunModel[171] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Import
        gunModel[172] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Import
        gunModel[173] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import
        gunModel[174] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Import
        gunModel[175] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Import
        gunModel[176] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Import
        gunModel[177] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Import
        gunModel[178] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Import
        gunModel[179] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Import
        gunModel[180] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Import
        gunModel[181] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Import
        gunModel[182] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Import
        gunModel[183] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Import
        gunModel[184] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Import
        gunModel[185] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Import
        gunModel[186] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Import
        gunModel[187] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Import
        gunModel[188] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Import
        gunModel[189] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Import
        gunModel[190] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Import
        gunModel[191] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Import
        gunModel[192] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Import
        gunModel[193] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Import
        gunModel[194] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Import
        gunModel[195] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Import
        gunModel[196] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Import
        gunModel[197] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Import
        gunModel[198] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Import
        gunModel[199] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Import
        gunModel[200] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Import
        gunModel[201] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Import
        gunModel[202] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Import
        gunModel[203] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Import
        gunModel[204] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Import
        gunModel[205] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Import
        gunModel[206] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Import
        gunModel[207] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Import
        gunModel[208] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Import
        gunModel[209] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Import
        gunModel[210] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Import
        gunModel[211] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Import
        gunModel[212] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Import
        gunModel[213] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Import
        gunModel[214] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Import
        gunModel[215] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Import
        gunModel[216] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import
        gunModel[217] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Import
        gunModel[218] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Import
        gunModel[219] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Import
        gunModel[220] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Import
        gunModel[221] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Import
        gunModel[222] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Import
        gunModel[223] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Import
        gunModel[224] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Import
        gunModel[225] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Import
        gunModel[226] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Import
        gunModel[227] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Import
        gunModel[228] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Import
        gunModel[229] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Import
        gunModel[230] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Import
        gunModel[231] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Import
        gunModel[232] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Import
        gunModel[233] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Import
        gunModel[234] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Import
        gunModel[235] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Import
        gunModel[236] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Import
        gunModel[237] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Import
        gunModel[238] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Import
        gunModel[239] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Import
        gunModel[240] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Import
        gunModel[241] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Import
        gunModel[242] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Import
        gunModel[243] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Import
        gunModel[244] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Import
        gunModel[245] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Import
        gunModel[246] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Import
        gunModel[247] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Import
        gunModel[248] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Import
        gunModel[249] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Import
        gunModel[250] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Import
        gunModel[251] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Import
        gunModel[252] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Import
        gunModel[253] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Import
        gunModel[254] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Import
        gunModel[255] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Import
        gunModel[256] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Import
        gunModel[257] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Import
        gunModel[258] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Import
        gunModel[259] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Import
        gunModel[260] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Import
        gunModel[261] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Import
        gunModel[262] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Import
        gunModel[263] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Import
        gunModel[264] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Import
        gunModel[265] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Import
        gunModel[266] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import
        gunModel[267] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Import
        gunModel[268] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Import
        gunModel[269] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Import
        gunModel[270] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Import
        gunModel[271] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Import
        gunModel[272] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Import
        gunModel[273] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Import
        gunModel[274] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Import
        gunModel[275] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Import
        gunModel[276] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Import
        gunModel[277] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Import
        gunModel[278] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Import
        gunModel[279] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Import
        gunModel[280] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Import
        gunModel[281] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Import
        gunModel[282] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Import
        gunModel[283] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import
        gunModel[284] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import
        gunModel[285] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Import
        gunModel[286] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import
        gunModel[287] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Import
        gunModel[288] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Import
        gunModel[289] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import
        gunModel[290] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import
        gunModel[291] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import
        gunModel[292] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import
        gunModel[293] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import
        gunModel[294] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import
        gunModel[295] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import
        gunModel[296] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import
        gunModel[297] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import
        gunModel[298] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import
        gunModel[299] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import
        gunModel[300] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import
        gunModel[301] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import
        gunModel[302] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Import
        gunModel[303] = new ModelRendererTurbo(this, 393, 153, textureX, textureY); // Import
        gunModel[304] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Import
        gunModel[305] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import
        gunModel[306] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Import
        gunModel[307] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Import
        gunModel[308] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Import
        gunModel[309] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Import
        gunModel[310] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Import
        gunModel[311] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Import
        gunModel[312] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Import
        gunModel[313] = new ModelRendererTurbo(this, 305, 161, textureX, textureY); // Import
        gunModel[314] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Import
        gunModel[315] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import
        gunModel[316] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import
        gunModel[317] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import
        gunModel[318] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import
        gunModel[319] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import
        gunModel[320] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import
        gunModel[321] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Import
        gunModel[322] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Import
        gunModel[323] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import
        gunModel[324] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import
        gunModel[325] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import
        gunModel[326] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import
        gunModel[327] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import
        gunModel[328] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Import
        gunModel[329] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Import
        gunModel[330] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Import
        gunModel[331] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Import
        gunModel[332] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Import
        gunModel[333] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Import
        gunModel[334] = new ModelRendererTurbo(this, 81, 177, textureX, textureY); // Import
        gunModel[335] = new ModelRendererTurbo(this, 113, 177, textureX, textureY); // Import
        gunModel[336] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Import
        gunModel[337] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Import
        gunModel[338] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Import
        gunModel[339] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Import
        gunModel[340] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Import
        gunModel[341] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Import
        gunModel[342] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Import
        gunModel[343] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Import
        gunModel[344] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Import
        gunModel[345] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Import
        gunModel[346] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Import
        gunModel[347] = new ModelRendererTurbo(this, 265, 185, textureX, textureY); // Import
        gunModel[348] = new ModelRendererTurbo(this, 289, 185, textureX, textureY); // Import
        gunModel[349] = new ModelRendererTurbo(this, 385, 185, textureX, textureY); // Import
        gunModel[350] = new ModelRendererTurbo(this, 449, 185, textureX, textureY); // Import
        gunModel[351] = new ModelRendererTurbo(this, 481, 185, textureX, textureY); // Import
        gunModel[352] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Import
        gunModel[353] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Import
        gunModel[354] = new ModelRendererTurbo(this, 81, 193, textureX, textureY); // Import
        gunModel[355] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Import
        gunModel[356] = new ModelRendererTurbo(this, 129, 193, textureX, textureY); // Import
        gunModel[357] = new ModelRendererTurbo(this, 153, 193, textureX, textureY); // Import
        gunModel[358] = new ModelRendererTurbo(this, 193, 193, textureX, textureY); // Import
        gunModel[359] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Import
        gunModel[360] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Import
        gunModel[361] = new ModelRendererTurbo(this, 41, 201, textureX, textureY); // Import
        gunModel[362] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Import
        gunModel[363] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Import
        gunModel[364] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Import
        gunModel[365] = new ModelRendererTurbo(this, 217, 201, textureX, textureY); // Import
        gunModel[366] = new ModelRendererTurbo(this, 241, 201, textureX, textureY); // Import
        gunModel[367] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Import
        gunModel[368] = new ModelRendererTurbo(this, 337, 193, textureX, textureY); // Import
        gunModel[369] = new ModelRendererTurbo(this, 265, 201, textureX, textureY); // Import
        gunModel[370] = new ModelRendererTurbo(this, 289, 201, textureX, textureY); // Import
        gunModel[371] = new ModelRendererTurbo(this, 65, 201, textureX, textureY); // Import
        gunModel[372] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Import
        gunModel[373] = new ModelRendererTurbo(this, 345, 201, textureX, textureY); // Import
        gunModel[374] = new ModelRendererTurbo(this, 57, 185, textureX, textureY); // Import
        gunModel[375] = new ModelRendererTurbo(this, 369, 201, textureX, textureY); // Import
        gunModel[376] = new ModelRendererTurbo(this, 473, 201, textureX, textureY); // Import
        gunModel[377] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Import
        gunModel[378] = new ModelRendererTurbo(this, 25, 209, textureX, textureY); // Import
        gunModel[379] = new ModelRendererTurbo(this, 81, 209, textureX, textureY); // Import
        gunModel[380] = new ModelRendererTurbo(this, 105, 209, textureX, textureY); // Import
        gunModel[381] = new ModelRendererTurbo(this, 129, 209, textureX, textureY); // Import
        gunModel[382] = new ModelRendererTurbo(this, 305, 209, textureX, textureY); // Import
        gunModel[383] = new ModelRendererTurbo(this, 329, 209, textureX, textureY); // Import
        gunModel[384] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Import
        gunModel[385] = new ModelRendererTurbo(this, 441, 209, textureX, textureY); // Import
        gunModel[386] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Import
        gunModel[387] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Import
        gunModel[388] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Import
        gunModel[389] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import
        gunModel[390] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Import
        gunModel[391] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Import
        gunModel[392] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Import
        gunModel[393] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Import
        gunModel[394] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Import
        gunModel[395] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Import
        gunModel[396] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import
        gunModel[397] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import
        gunModel[398] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import
        gunModel[399] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Import
        gunModel[400] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Import
        gunModel[401] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Import
        gunModel[402] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Import
        gunModel[403] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Import
        gunModel[404] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Import
        gunModel[405] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Import
        gunModel[406] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import
        gunModel[407] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Import
        gunModel[408] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Import
        gunModel[409] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Import
        gunModel[410] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Import
        gunModel[411] = new ModelRendererTurbo(this, 41, 217, textureX, textureY); // Import
        gunModel[412] = new ModelRendererTurbo(this, 145, 217, textureX, textureY); // Import
        gunModel[413] = new ModelRendererTurbo(this, 193, 217, textureX, textureY); // Import
        gunModel[414] = new ModelRendererTurbo(this, 489, 209, textureX, textureY); // Import
        gunModel[415] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Import
        gunModel[416] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import
        gunModel[417] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Import
        gunModel[418] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import
        gunModel[419] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Import
        gunModel[420] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import
        gunModel[421] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Import
        gunModel[422] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import
        gunModel[423] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import
        gunModel[424] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Import
        gunModel[425] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Import
        gunModel[426] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Import
        gunModel[427] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Import
        gunModel[428] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import
        gunModel[429] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import
        gunModel[430] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Import
        gunModel[431] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Import
        gunModel[432] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Import
        gunModel[433] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Import
        gunModel[434] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Import
        gunModel[435] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Import
        gunModel[436] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Import
        gunModel[437] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Import
        gunModel[438] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Import
        gunModel[439] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Import
        gunModel[440] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Import
        gunModel[441] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import
        gunModel[442] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Import
        gunModel[443] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import
        gunModel[444] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Import
        gunModel[445] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Import
        gunModel[446] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Import
        gunModel[447] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Import
        gunModel[448] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Import
        gunModel[449] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Import
        gunModel[450] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Import
        gunModel[451] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Import
        gunModel[452] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Import
        gunModel[453] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Import
        gunModel[454] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Import
        gunModel[455] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import
        gunModel[456] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Import
        gunModel[457] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Import
        gunModel[458] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Import
        gunModel[459] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Import
        gunModel[460] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Import
        gunModel[461] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Import
        gunModel[462] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Import
        gunModel[463] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Import
        gunModel[464] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Import
        gunModel[465] = new ModelRendererTurbo(this, 241, 217, textureX, textureY); // Import
        gunModel[466] = new ModelRendererTurbo(this, 257, 217, textureX, textureY); // Import
        gunModel[467] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Import
        gunModel[468] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Import
        gunModel[469] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Import
        gunModel[470] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Import
        gunModel[471] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Import
        gunModel[472] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Import
        gunModel[473] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Import
        gunModel[474] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Import
        gunModel[475] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Import
        gunModel[476] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Import
        gunModel[477] = new ModelRendererTurbo(this, 273, 217, textureX, textureY); // Import
        gunModel[478] = new ModelRendererTurbo(this, 345, 217, textureX, textureY); // Import
        gunModel[479] = new ModelRendererTurbo(this, 369, 217, textureX, textureY); // Import
        gunModel[480] = new ModelRendererTurbo(this, 401, 217, textureX, textureY); // Import
        gunModel[481] = new ModelRendererTurbo(this, 425, 217, textureX, textureY); // Import
        gunModel[482] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Import
        gunModel[483] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Import
        gunModel[484] = new ModelRendererTurbo(this, 153, 273, textureX, textureY); // Import
        gunModel[485] = new ModelRendererTurbo(this, 297, 273, textureX, textureY); // Import
        gunModel[486] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Import
        gunModel[487] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Import
        gunModel[488] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Import
        gunModel[489] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Import
        gunModel[490] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Import
        gunModel[491] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Import
        gunModel[492] = new ModelRendererTurbo(this, 193, 265, textureX, textureY); // Import
        gunModel[493] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Import
        gunModel[494] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Import
        gunModel[495] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Import
        gunModel[496] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Import
        gunModel[497] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Import
        gunModel[498] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Import
        gunModel[499] = new ModelRendererTurbo(this, 25, 225, textureX, textureY); // Import

        gunModel[0].addShapeBox(35F, 0F, -3F, 1, 16, 5, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 9.0F, 0.0F, -2.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 9.0F, 0.0F, -2.0F); // Import
        gunModel[0].setRotationPoint(-32.25F, -22.5F, 0.5F);

        gunModel[1].addShapeBox(35F, 0F, -3F, 2, 16, 6, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 9.0F, 0.0F, -0.5F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 9.0F, 0.0F, -0.5F); // Import
        gunModel[1].setRotationPoint(-31.25F, -22.5F, 0F);

        gunModel[2].addShapeBox(35F, 0F, -3F, 5, 16, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 0.0F, -7.75F, 0.0F, 0.0F, -7.75F, 0.0F, 0.0F, 9.0F, 0.0F, 0.0F); // Import
        gunModel[2].setRotationPoint(-29.25F, -22.5F, 0F);

        gunModel[3].addShapeBox(35F, 0F, -3F, 1, 16, 5, 0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, 7.5F, 0.0F, 0.0F, -7.5F, 0.0F, -1.0F, -7.5F, 0.0F, -1.0F, 7.5F, 0.0F, 0.0F); // Import
        gunModel[3].setRotationPoint(-22.5F, -22.5F, 0.5F);

        gunModel[4].addShapeBox(35F, 0F, -3F, 2, 16, 6, 0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 7.5F, 0.0F, 0.0F, -7.5F, 0.0F, -0.5F, -7.5F, 0.0F, -0.5F, 7.5F, 0.0F, 0.0F); // Import
        gunModel[4].setRotationPoint(-24.5F, -22.5F, 0F);

        gunModel[5].addShapeBox(35F, 0F, -3F, 1, 2, 5, 0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F); // Import
        gunModel[5].setRotationPoint(-22.5F, -24.5F, 0.5F);

        gunModel[6].addShapeBox(35F, 0F, -3F, 1, 2, 5, 0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[6].setRotationPoint(-32F, -6.5F, 0.5F);

        gunModel[7].addShapeBox(35F, 0F, -3F, 2, 2, 6, 0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[7].setRotationPoint(-34F, -6.5F, 0F);

        gunModel[8].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[8].setRotationPoint(-31F, -4.5F, 0.5F);

        gunModel[9].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[9].setRotationPoint(-33F, -4.5F, 0F);

        gunModel[10].addShapeBox(35F, 0F, -3F, 5, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 2.25F, 0.0F, 0.25F, 2.25F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[10].setRotationPoint(-38.25F, -6.5F, 0F);

        gunModel[11].addShapeBox(35F, 0F, -3F, 2, 2, 6, 0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F); // Import
        gunModel[11].setRotationPoint(-24.5F, -24.5F, 0F);

        gunModel[12].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[12].setRotationPoint(-31F, -3.5F, 0.5F);

        gunModel[13].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[13].setRotationPoint(-33F, -3.5F, 0F);

        gunModel[14].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, -0.75F, 0.0F); // Import
        gunModel[14].setRotationPoint(-33F, -2.5F, 0F);

        gunModel[15].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[15].setRotationPoint(-30.5F, -2.5F, 0.5F);

        gunModel[16].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[16].setRotationPoint(-30.5F, -2F, 0.5F);

        gunModel[17].addShapeBox(35F, 0F, -3F, 1, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[17].setRotationPoint(-33F, -6.5F, 0F);

        gunModel[18].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.75F, -0.5F); // Import
        gunModel[18].setRotationPoint(-40.25F, -6.5F, 0F);

        gunModel[19].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[19].setRotationPoint(-41.25F, -6.5F, 0.5F);

        gunModel[20].addShapeBox(35F, 0F, -3F, 5, 2, 6, 0F, -0.25F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F); // Import
        gunModel[20].setRotationPoint(-29.5F, -24.5F, 0F);

        gunModel[21].addShapeBox(35F, 0F, -3F, 1, 2, 5, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[21].setRotationPoint(-32.25F, -24.5F, 0.5F);

        gunModel[22].addShapeBox(35F, 0F, -3F, 2, 2, 6, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[22].setRotationPoint(-31.25F, -24.5F, 0F);

        gunModel[23].addShapeBox(35F, 0F, -3F, 1, 2, 4, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); // Import
        gunModel[23].setRotationPoint(-26.5F, -14F, 1F);

        gunModel[24].addShapeBox(35F, 0F, -3F, 1, 2, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[24].setRotationPoint(-25.5F, -14F, 1F);

        gunModel[25].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, 0.5F, 0.5F, -2.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[25].setRotationPoint(-32.25F, -25.5F, 0.5F);

        gunModel[26].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[26].setRotationPoint(-31.25F, -25.5F, 0F);

        gunModel[27].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, 1.0F, 0.0F, -1.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[27].setRotationPoint(-32.75F, -27F, 0.5F);

        gunModel[28].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[28].setRotationPoint(-31.75F, -27F, 0F);

        gunModel[29].addShapeBox(35F, 0F, -3F, 6, 1, 6, 0F, -0.25F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, -0.5F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -0.25F, -0.5F, -2.0F); // Import
        gunModel[29].setRotationPoint(-40.25F, -28F, 0F);

        gunModel[30].addShapeBox(35F, 0F, -3F, 6, 2, 6, 0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F); // Import
        gunModel[30].setRotationPoint(-40.25F, -30F, 0F);

        gunModel[31].addShapeBox(35F, 0F, -3F, 1, 1, 6, 0F, 0.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[31].setRotationPoint(-33.75F, -28F, 0F);

        gunModel[32].addShapeBox(35F, 0F, -3F, 1, 1, 6, 0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F); // Import
        gunModel[32].setRotationPoint(-34.75F, -28F, 0F);

        gunModel[33].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 1.5F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[33].setRotationPoint(-32.75F, -28F, 0F);

        gunModel[34].addShapeBox(35F, 0F, -3F, 2, 2, 6, 0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F); // Import
        gunModel[34].setRotationPoint(-33.75F, -30F, 0F);

        gunModel[35].addShapeBox(35F, 0F, -3F, 2, 2, 4, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[35].setRotationPoint(-21.5F, -20F, 1F);

        gunModel[36].addShapeBox(35F, 0F, -3F, 2, 2, 4, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F); // Import
        gunModel[36].setRotationPoint(-19.5F, -18.5F, 1F);

        gunModel[37].addShapeBox(35F, 0F, -3F, 1, 2, 4, 0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 1.0F, 0.25F, 0.0F); // Import
        gunModel[37].setRotationPoint(-22.5F, -21.25F, 1F);

        gunModel[38].addShapeBox(35F, 0F, -3F, 2, 2, 4, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[38].setRotationPoint(-17.5F, -17.5F, 1F);

        gunModel[39].addShapeBox(35F, 0F, -3F, 7, 2, 4, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        gunModel[39].setRotationPoint(-15.5F, -17F, 1F);

        gunModel[40].addShapeBox(35F, 0F, -3F, 2, 1, 4, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[40].setRotationPoint(-8.5F, -17F, 1F);

        gunModel[41].addShapeBox(35F, 0F, -3F, 2, 1, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[41].setRotationPoint(-25.5F, -26.5F, -0.5F);

        gunModel[42].addShapeBox(35F, 0F, -3F, 3, 1, 7, 0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[42].setRotationPoint(-23.5F, -26.5F, -0.5F);

        gunModel[43].addShapeBox(35F, 0F, -3F, 2, 1, 7, 0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F); // Import
        gunModel[43].setRotationPoint(-27.5F, -26.5F, -0.5F);

        gunModel[44].addShapeBox(35F, 0F, -3F, 2, 1, 7, 0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.5F, -0.5F); // Import
        gunModel[44].setRotationPoint(-29.5F, -27.5F, -0.5F);

        gunModel[45].addShapeBox(35F, 0F, -3F, 7, 4, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[45].setRotationPoint(-25.5F, -30.5F, -0.5F);

        gunModel[46].addShapeBox(35F, 0F, -3F, 3, 1, 7, 0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.5F, -0.5F); // Import
        gunModel[46].setRotationPoint(-32.5F, -29F, -0.5F);

        gunModel[47].addShapeBox(35F, 0F, -3F, 8, 1, 7, 0F, -0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F); // Import
        gunModel[47].setRotationPoint(-40.5F, -30.5F, -0.5F);

        gunModel[48].addShapeBox(35F, 0F, -3F, 3, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[48].setRotationPoint(-25.5F, -25.5F, 0F);

        gunModel[49].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[49].setRotationPoint(-27.5F, -25.5F, 0F);

        gunModel[50].addShapeBox(35F, 0F, -3F, 2, 2, 6, 0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F); // Import
        gunModel[50].setRotationPoint(-29.5F, -26.5F, 0F);

        gunModel[51].addShapeBox(35F, 0F, -3F, 2, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F); // Import
        gunModel[51].setRotationPoint(-29.5F, -28F, 0F);

        gunModel[52].addShapeBox(35F, 0F, -3F, 1, 2, 6, 0F, 0.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F); // Import
        gunModel[52].setRotationPoint(-30.5F, -28F, 0F);

        gunModel[53].addShapeBox(35F, 0F, -3F, 1, 1, 6, 0F, 0.25F, 1.25F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, 0.25F, 1.25F, 0.0F, 0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F); // Import
        gunModel[53].setRotationPoint(-31.5F, -28F, 0F);

        gunModel[54].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0.4F, 0.75F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.5F, 0.0F, 0.4F, 0.75F, 0.0F, 0.4F, -1.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.45F, -1.75F, 0.0F); // Import
        gunModel[54].setRotationPoint(-33.5F, -29F, 0F);

        gunModel[55].addShapeBox(35F, 0F, -3F, 5, 1, 3, 0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[55].setRotationPoint(-19.5F, -25.5F, 1.5F);

        gunModel[56].addShapeBox(35F, 0F, -3F, 5, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[56].setRotationPoint(-19.5F, -26F, 0F);

        gunModel[57].addShapeBox(35F, 0F, -3F, 2, 4, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[57].setRotationPoint(-27.5F, -30.5F, -0.5F);

        gunModel[58].addShapeBox(35F, 0F, -3F, 2, 3, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F); // Import
        gunModel[58].setRotationPoint(-29.5F, -30.5F, -0.5F);

        gunModel[59].addShapeBox(35F, 0F, -3F, 3, 2, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F); // Import
        gunModel[59].setRotationPoint(-32.5F, -30.5F, -0.5F);

        gunModel[60].addShapeBox(35F, 0F, -3F, 6, 3, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[60].setRotationPoint(-32.5F, -33.5F, -0.5F);

        gunModel[61].addShapeBox(35F, 0F, -3F, 1, 3, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.5F, 0.25F); // Import
        gunModel[61].setRotationPoint(-22.5F, -33.5F, -0.5F);

        gunModel[62].addShapeBox(35F, 0F, -3F, 1, 2, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -0.5F, 0.25F); // Import
        gunModel[62].setRotationPoint(-25.5F, -33.5F, -0.5F);

        gunModel[63].addShapeBox(35F, 0F, -3F, 1, 2, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -1.0F, 0.25F); // Import
        gunModel[63].setRotationPoint(-23.5F, -33.5F, -0.5F);

        gunModel[64].addShapeBox(35F, 0F, -3F, 1, 3, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[64].setRotationPoint(-26.5F, -33.5F, -0.5F);

        gunModel[65].addShapeBox(35F, 0F, -3F, 1, 2, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F); // Import
        gunModel[65].setRotationPoint(-24.5F, -33.5F, -0.5F);

        gunModel[66].addShapeBox(35F, 0F, -3F, 3, 4, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 3.0F, 0.25F, 0.0F, 3.0F, 0.25F, 0.0F, -1.0F, 0.25F); // Import
        gunModel[66].setRotationPoint(-21.5F, -33.5F, -0.5F);

        gunModel[67].addShapeBox(35F, 0F, -3F, 5, 2, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[67].setRotationPoint(-26.5F, -32.5F, -0.5F);

        gunModel[68].addShapeBox(35F, 0F, -3F, 1, 7, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[68].setRotationPoint(-18.5F, -33.5F, -0.5F);

        gunModel[69].addShapeBox(35F, 0F, -3F, 6, 7, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[69].setRotationPoint(-17.5F, -33.5F, -0.5F);

        gunModel[70].addShapeBox(35F, 0F, -3F, 5, 5, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[70].setRotationPoint(-11.5F, -33.5F, -0.5F);

        gunModel[71].addShapeBox(35F, 0F, -3F, 2, 5, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[71].setRotationPoint(-6.5F, -33.5F, -0.5F);

        gunModel[72].addShapeBox(35F, 0F, -3F, 3, 4, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[72].setRotationPoint(-4.5F, -33.5F, -0.5F);

        gunModel[73].addShapeBox(35F, 0F, -3F, 4, 4, 7, 0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 1.0F, 0.25F, -0.5F, 1.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[73].setRotationPoint(-1.5F, -33.5F, -0.5F);

        gunModel[74].addShapeBox(35F, 0F, -3F, 8, 5, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[74].setRotationPoint(2F, -33.5F, -0.5F);

        gunModel[75].addShapeBox(35F, 0F, -3F, 59, 2, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[75].setRotationPoint(-40F, -35.5F, -0.5F);

        gunModel[76].addShapeBox(35F, 0F, -3F, 16, 7, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[76].setRotationPoint(-7.5F, -30.5F, -0.5F);

        gunModel[77].addShapeBox(35F, 0F, -3F, 4, 1, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[77].setRotationPoint(-5.5F, -19F, -0.5F);

        gunModel[78].addShapeBox(35F, 0F, -3F, 4, 1, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[78].setRotationPoint(-1.5F, -19F, -0.5F);

        gunModel[79].addShapeBox(35F, 0F, -3F, 4, 1, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.25F, -1.0F, 0.0F, -1.25F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[79].setRotationPoint(2.5F, -19.75F, -0.5F);

        gunModel[80].addShapeBox(35F, 0F, -3F, 2, 1, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[80].setRotationPoint(6.5F, -21F, -0.5F);

        gunModel[81].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[81].setRotationPoint(8.5F, -22F, -0.5F);

        gunModel[82].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[82].setRotationPoint(8.5F, -23F, -0.5F);

        gunModel[83].addShapeBox(35F, 0F, -3F, 2, 2, 7, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[83].setRotationPoint(6.5F, -23F, -0.5F);

        gunModel[84].addShapeBox(35F, 0F, -3F, 4, 3, 7, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F); // Import
        gunModel[84].setRotationPoint(2.5F, -23F, -0.5F);

        gunModel[85].addShapeBox(35F, 0F, -3F, 4, 4, 7, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[85].setRotationPoint(-1.5F, -23F, -0.5F);

        gunModel[86].addShapeBox(35F, 0F, -3F, 4, 4, 7, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[86].setRotationPoint(-5.5F, -23F, -0.5F);

        gunModel[87].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[87].setRotationPoint(-6.5F, -19F, -0.5F);

        gunModel[88].addShapeBox(35F, 0F, -3F, 4, 1, 4, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[88].setRotationPoint(-14.5F, -25.5F, 1F);

        gunModel[89].addShapeBox(35F, 0F, -3F, 4, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[89].setRotationPoint(-14.5F, -26F, 0F);

        gunModel[90].addShapeBox(35F, 0F, -3F, 1, 1, 4, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[90].setRotationPoint(-10.5F, -24.5F, 1F);

        gunModel[91].addShapeBox(35F, 0F, -3F, 1, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[91].setRotationPoint(-10.5F, -25F, 0F);

        gunModel[92].addShapeBox(35F, 0F, -3F, 2, 1, 4, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[92].setRotationPoint(-9.5F, -24F, 1F);

        gunModel[93].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.5F, -1.0F, 0.0F, 1.5F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[93].setRotationPoint(-9.5F, -24.5F, 0F);

        gunModel[94].addShapeBox(35F, 0F, -3F, 1, 1, 6, 0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[94].setRotationPoint(-20.5F, -25.5F, 0F);

        gunModel[95].addShapeBox(35F, 0F, -3F, 1, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[95].setRotationPoint(-20.5F, -26F, 0F);

        gunModel[96].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[96].setRotationPoint(-22.5F, -25.5F, 0F);

        gunModel[97].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[97].setRotationPoint(-22.5F, -26F, 0F);

        gunModel[98].addShapeBox(35F, 0F, -3F, 5, 1, 8, 0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.5F, -0.5F, -1.0F); // Import
        gunModel[98].setRotationPoint(-19.5F, -26.5F, -1F);

        gunModel[99].addShapeBox(35F, 0F, -3F, 10, 4, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[99].setRotationPoint(-17.5F, -30.5F, -0.5F);

        gunModel[100].addShapeBox(35F, 0F, -3F, 4, 1, 8, 0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -0.5F, -1.0F); // Import
        gunModel[100].setRotationPoint(-14.5F, -26.5F, -1F);

        gunModel[101].addShapeBox(35F, 0F, -3F, 1, 1, 8, 0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F); // Import
        gunModel[101].setRotationPoint(-10.5F, -25.5F, -1F);

        gunModel[102].addShapeBox(35F, 0F, -3F, 2, 1, 8, 0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, -0.5F, -1.0F); // Import
        gunModel[102].setRotationPoint(-9.5F, -25F, -1F);

        gunModel[103].addShapeBox(35F, 0F, -3F, 4, 1, 8, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F); // Import
        gunModel[103].setRotationPoint(-14.5F, -26.5F, -1F);

        gunModel[104].addShapeBox(35F, 0F, -3F, 1, 2, 8, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F); // Import
        gunModel[104].setRotationPoint(-10.5F, -26.5F, -1F);

        gunModel[105].addShapeBox(35F, 0F, -3F, 2, 1, 4, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[105].setRotationPoint(-8.5F, -16.25F, 1F);

        gunModel[106].addShapeBox(35F, 0F, -3F, 2, 2, 8, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -0.5F, -0.5F); // Import
        gunModel[106].setRotationPoint(-9.5F, -26.5F, -1F);

        gunModel[107].addShapeBox(35F, 0F, -3F, 1, 4, 4, 0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F); // Import
        gunModel[107].setRotationPoint(-8F, -21.5F, 1F);

        gunModel[108].addShapeBox(35F, 0F, -3F, 2, 2, 4, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 1.5F, 0.0F, 0.5F, 1.5F, -0.5F, 0.5F, 0.0F); // Import
        gunModel[108].setRotationPoint(-7.5F, -21.5F, 1F);

        gunModel[109].addShapeBox(35F, 0F, -3F, 1, 1, 4, 0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F); // Import
        gunModel[109].setRotationPoint(-8F, -22.5F, 1F);

        gunModel[110].addShapeBox(35F, 0F, -3F, 2, 1, 4, 0F, 0.0F, 0.5F, 1.0F, -1.5F, 0.5F, 1.5F, -1.5F, 0.5F, 1.5F, 0.0F, 0.5F, 1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[110].setRotationPoint(-7.5F, -22.5F, 1F);

        gunModel[111].addShapeBox(35F, 0F, -3F, 1, 2, 4, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 1.0F, -0.5F, -0.5F, 1.0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F); // Import
        gunModel[111].setRotationPoint(-8F, -23.5F, 1F);

        gunModel[112].addShapeBox(35F, 0F, -3F, 2, 1, 4, 0F, 0.0F, 0.0F, 1.5F, -2.0F, 0.0F, 1.5F, -2.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -0.5F, 1.0F, -1.5F, -0.5F, 1.5F, -1.5F, -0.5F, 1.5F, 0.0F, -0.5F, 1.0F); // Import
        gunModel[112].setRotationPoint(-7.5F, -23.5F, 1F);

        gunModel[113].addShapeBox(35F, 0F, -3F, 1, 1, 4, 0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, -0.5F, 0.75F, 0.0F); // Import
        gunModel[113].setRotationPoint(-7.5F, -19.5F, 1F);

        gunModel[114].addShapeBox(35F, 0F, -3F, 1, 1, 4, 0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[114].setRotationPoint(-8F, -17.75F, 1F);

        gunModel[115].addShapeBox(35F, 0F, -3F, 1, 1, 4, 0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, -0.5F, -0.75F, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F); // Import
        gunModel[115].setRotationPoint(-7.5F, -18.5F, 1F);

        gunModel[116].addShapeBox(35F, 0F, -3F, 1, 1, 4, 0F, -0.5F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F); // Import
        gunModel[116].setRotationPoint(-7F, -18.5F, 1F);

        gunModel[117].addShapeBox(35F, 0F, -3F, 1, 1, 4, 0F, -0.5F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F); // Import
        gunModel[117].setRotationPoint(-7F, -18.75F, 1F);

        gunModel[118].addShapeBox(35F, 0F, -3F, 1, 1, 4, 0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F); // Import
        gunModel[118].setRotationPoint(-7F, -17.5F, 1F);

        gunModel[119].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, -1.0F, 0.0F); // Import
        gunModel[119].setRotationPoint(-6.5F, -23F, -0.5F);

        gunModel[120].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F); // Import
        gunModel[120].setRotationPoint(-7.5F, -23F, -0.5F);

        gunModel[121].addShapeBox(35F, 0F, -3F, 4, 4, 7, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[121].setRotationPoint(8.5F, -28F, -0.5F);

        gunModel[122].addShapeBox(35F, 0F, -3F, 1, 5, 7, 0F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.75F, 0.25F, 0.5F, 0.75F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[122].setRotationPoint(10F, -33.5F, -0.5F);

        gunModel[123].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, 0.0F, 0.75F, 0.25F, 0.0F, 2.0F, 0.25F, 0.0F, 2.0F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, -0.33F, 0.25F, 0.0F, -0.65F, 0.25F, 0.0F, -0.65F, 0.25F, 0.0F, -0.33F, 0.25F); // Import
        gunModel[123].setRotationPoint(11.5F, -23.5F, -0.5F);

        gunModel[124].addShapeBox(35F, 0F, -3F, 1, 7, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[124].setRotationPoint(12.5F, -33.5F, -0.5F);

        gunModel[125].addShapeBox(35F, 0F, -3F, 9, 1, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 3.0F, 0.25F, 0.0F, 3.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, -3.0F, -0.75F, 0.0F, -3.0F, -0.75F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[125].setRotationPoint(10.5F, -22.5F, -0.5F);

        gunModel[126].addShapeBox(35F, 0F, -3F, 1, 5, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 2.0F, 0.25F, 0.0F, 2.0F, 0.25F, 0.0F, 0.75F, 0.25F); // Import
        gunModel[126].setRotationPoint(11.5F, -33.5F, -0.5F);

        gunModel[127].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, -0.5F, 0.25F, 0.25F, 0.5F, 0.75F, 0.25F, 0.5F, 0.75F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.0F, 0.25F, 0.5F, -0.33F, 0.25F, 0.5F, -0.33F, 0.25F, -0.5F, 0.0F, 0.25F); // Import
        gunModel[127].setRotationPoint(10F, -23.5F, -0.5F);

        gunModel[128].addShapeBox(35F, 0F, -3F, 7, 3, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.35F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.35F, 0.25F); // Import
        gunModel[128].setRotationPoint(12.5F, -26.5F, -0.5F);

        gunModel[129].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[129].setRotationPoint(9.5F, -23F, -0.5F);

        gunModel[130].addShapeBox(35F, 0F, -3F, 6, 7, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[130].setRotationPoint(13.5F, -33.5F, -0.5F);

        gunModel[131].addShapeBox(35F, 0F, -3F, 20, 5, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[131].setRotationPoint(-40F, -40.5F, -0.5F);

        gunModel[132].addShapeBox(35F, 0F, -3F, 12, 3, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[132].setRotationPoint(-20F, -38.5F, -0.5F);

        gunModel[133].addShapeBox(35F, 0F, -3F, 9, 3, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[133].setRotationPoint(7F, -38.5F, -0.5F);

        gunModel[134].addShapeBox(35F, 0F, -3F, 45, 1, 7, 0F, 0.0F, -0.25F, 0.75F, 0.5F, -0.25F, 0.75F, 0.5F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.5F, 0.25F, 1.25F, -0.5F, 0.25F, 1.25F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F); // Import
        gunModel[134].setRotationPoint(-36F, -41F, -0.5F);

        gunModel[135].addShapeBox(35F, 0F, -3F, 61, 3, 7, 0F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F); // Import
        gunModel[135].setRotationPoint(-40F, -44F, -0.5F);

        gunModel[136].addShapeBox(35F, 0F, -3F, 97, 1, 5, 0F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.75F, 0.5F, -0.5F, 0.75F, 0.5F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F); // Import
        gunModel[136].setRotationPoint(-40F, -44.5F, 0.5F);

        gunModel[137].addShapeBox(35F, 0F, -3F, 45, 1, 7, 0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.5F, 0.75F, 0.5F, -0.5F, 0.75F, 0.5F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F); // Import
        gunModel[137].setRotationPoint(-36F, -41.25F, -0.5F);

        gunModel[138].addShapeBox(35F, 0F, -3F, 40, 3, 9, 0F, 8.0F, 0.0F, -0.25F, 1.25F, 0.0F, -0.25F, 1.25F, 0.0F, -0.25F, 8.0F, 0.0F, -0.25F, 0.5F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F); // Import
        gunModel[138].setRotationPoint(17F, -41F, -1.5F);

        gunModel[139].addShapeBox(35F, 0F, -3F, 40, 2, 9, 0F, 2.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 2.5F, 0.0F, 1.0F, 0.5F, -0.5F, 1.0F, 0.25F, -0.5F, 1.0F, 0.25F, -0.5F, 1.0F, 0.5F, -0.5F, 1.0F); // Import
        gunModel[139].setRotationPoint(19F, -38F, -1.5F);

        gunModel[140].addShapeBox(35F, 0F, -3F, 2, 3, 7, 0F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[140].setRotationPoint(22F, -44F, -0.5F);

        gunModel[141].addShapeBox(35F, 0F, -3F, 2, 3, 7, 0F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[141].setRotationPoint(24.75F, -44F, -0.5F);

        gunModel[142].addShapeBox(35F, 0F, -3F, 2, 3, 7, 0F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[142].setRotationPoint(27.5F, -44F, -0.5F);

        gunModel[143].addShapeBox(35F, 0F, -3F, 2, 3, 7, 0F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[143].setRotationPoint(30.25F, -44F, -0.5F);

        gunModel[144].addShapeBox(35F, 0F, -3F, 2, 3, 7, 0F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[144].setRotationPoint(33F, -44F, -0.5F);

        gunModel[145].addShapeBox(35F, 0F, -3F, 2, 3, 7, 0F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[145].setRotationPoint(35.75F, -44F, -0.5F);

        gunModel[146].addShapeBox(35F, 0F, -3F, 2, 3, 7, 0F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[146].setRotationPoint(38.5F, -44F, -0.5F);

        gunModel[147].addShapeBox(35F, 0F, -3F, 2, 3, 7, 0F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[147].setRotationPoint(41.25F, -44F, -0.5F);

        gunModel[148].addShapeBox(35F, 0F, -3F, 2, 3, 7, 0F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[148].setRotationPoint(44F, -44F, -0.5F);

        gunModel[149].addShapeBox(35F, 0F, -3F, 2, 3, 7, 0F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[149].setRotationPoint(46.75F, -44F, -0.5F);

        gunModel[150].addShapeBox(35F, 0F, -3F, 2, 3, 7, 0F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[150].setRotationPoint(49.5F, -44F, -0.5F);

        gunModel[151].addShapeBox(35F, 0F, -3F, 5, 3, 7, 0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[151].setRotationPoint(52.25F, -44F, -0.5F);

        gunModel[152].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, -0.21F, -0.75F, 0.66F, -0.79F, -0.75F, 0.66F, -0.79F, -0.75F, 0.66F, -0.21F, -0.75F, 0.66F, -0.25F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[152].setRotationPoint(21F, -42F, -0.5F);

        gunModel[153].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, -0.46F, -0.75F, 0.66F, -0.54F, -0.75F, 0.66F, -0.54F, -0.75F, 0.66F, -0.46F, -0.75F, 0.66F, -0.25F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[153].setRotationPoint(21.75F, -42F, -0.5F);

        gunModel[154].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, -0.25F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.25F, -0.75F, 0.75F, -0.29F, 0.0F, 0.84F, -0.7F, 0.0F, 0.84F, -0.7F, 0.0F, 0.84F, -0.29F, 0.0F, 0.84F); // Import
        gunModel[154].setRotationPoint(20.5F, -44.75F, 0.5F);

        gunModel[155].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, -0.3F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.3F, -0.75F, 0.75F, -0.54F, 0.0F, 0.81F, -0.46F, 0.0F, 0.81F, -0.46F, 0.0F, 0.81F, -0.54F, 0.0F, 0.81F); // Import
        gunModel[155].setRotationPoint(21.25F, -44.75F, 0.5F);

        gunModel[156].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, -0.21F, -0.75F, 0.66F, -0.79F, -0.75F, 0.66F, -0.79F, -0.75F, 0.66F, -0.21F, -0.75F, 0.66F, -0.25F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[156].setRotationPoint(23.75F, -42F, -0.5F);

        gunModel[157].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, -0.46F, -0.75F, 0.66F, -0.54F, -0.75F, 0.66F, -0.54F, -0.75F, 0.66F, -0.46F, -0.75F, 0.66F, -0.25F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[157].setRotationPoint(24.5F, -42F, -0.5F);

        gunModel[158].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, -0.25F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.25F, -0.75F, 0.75F, -0.29F, 0.0F, 0.84F, -0.7F, 0.0F, 0.84F, -0.7F, 0.0F, 0.84F, -0.29F, 0.0F, 0.84F); // Import
        gunModel[158].setRotationPoint(23.25F, -44.75F, 0.5F);

        gunModel[159].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, -0.3F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.3F, -0.75F, 0.75F, -0.54F, 0.0F, 0.81F, -0.46F, 0.0F, 0.81F, -0.46F, 0.0F, 0.81F, -0.54F, 0.0F, 0.81F); // Import
        gunModel[159].setRotationPoint(24F, -44.75F, 0.5F);

        gunModel[160].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, -0.21F, -0.75F, 0.66F, -0.79F, -0.75F, 0.66F, -0.79F, -0.75F, 0.66F, -0.21F, -0.75F, 0.66F, -0.25F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[160].setRotationPoint(26.5F, -42F, -0.5F);

        gunModel[161].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, -0.46F, -0.75F, 0.66F, -0.54F, -0.75F, 0.66F, -0.54F, -0.75F, 0.66F, -0.46F, -0.75F, 0.66F, -0.25F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[161].setRotationPoint(27.25F, -42F, -0.5F);

        gunModel[162].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, -0.25F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.25F, -0.75F, 0.75F, -0.29F, 0.0F, 0.84F, -0.7F, 0.0F, 0.84F, -0.7F, 0.0F, 0.84F, -0.29F, 0.0F, 0.84F); // Import
        gunModel[162].setRotationPoint(26F, -44.75F, 0.5F);

        gunModel[163].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, -0.3F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.3F, -0.75F, 0.75F, -0.54F, 0.0F, 0.81F, -0.46F, 0.0F, 0.81F, -0.46F, 0.0F, 0.81F, -0.54F, 0.0F, 0.81F); // Import
        gunModel[163].setRotationPoint(26.75F, -44.75F, 0.5F);

        gunModel[164].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, -0.21F, -0.75F, 0.66F, -0.79F, -0.75F, 0.66F, -0.79F, -0.75F, 0.66F, -0.21F, -0.75F, 0.66F, -0.25F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[164].setRotationPoint(29.25F, -42F, -0.5F);

        gunModel[165].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, -0.46F, -0.75F, 0.66F, -0.54F, -0.75F, 0.66F, -0.54F, -0.75F, 0.66F, -0.46F, -0.75F, 0.66F, -0.25F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[165].setRotationPoint(30F, -42F, -0.5F);

        gunModel[166].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, -0.25F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.25F, -0.75F, 0.75F, -0.29F, 0.0F, 0.84F, -0.7F, 0.0F, 0.84F, -0.7F, 0.0F, 0.84F, -0.29F, 0.0F, 0.84F); // Import
        gunModel[166].setRotationPoint(28.75F, -44.75F, 0.5F);

        gunModel[167].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, -0.3F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.3F, -0.75F, 0.75F, -0.54F, 0.0F, 0.81F, -0.46F, 0.0F, 0.81F, -0.46F, 0.0F, 0.81F, -0.54F, 0.0F, 0.81F); // Import
        gunModel[167].setRotationPoint(29.5F, -44.75F, 0.5F);

        gunModel[168].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, -0.21F, -0.75F, 0.66F, -0.79F, -0.75F, 0.66F, -0.79F, -0.75F, 0.66F, -0.21F, -0.75F, 0.66F, -0.25F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[168].setRotationPoint(32F, -42F, -0.5F);

        gunModel[169].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, -0.46F, -0.75F, 0.66F, -0.54F, -0.75F, 0.66F, -0.54F, -0.75F, 0.66F, -0.46F, -0.75F, 0.66F, -0.25F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[169].setRotationPoint(32.75F, -42F, -0.5F);

        gunModel[170].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, -0.25F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.25F, -0.75F, 0.75F, -0.29F, 0.0F, 0.84F, -0.7F, 0.0F, 0.84F, -0.7F, 0.0F, 0.84F, -0.29F, 0.0F, 0.84F); // Import
        gunModel[170].setRotationPoint(31.5F, -44.75F, 0.5F);

        gunModel[171].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, -0.3F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.3F, -0.75F, 0.75F, -0.54F, 0.0F, 0.81F, -0.46F, 0.0F, 0.81F, -0.46F, 0.0F, 0.81F, -0.54F, 0.0F, 0.81F); // Import
        gunModel[171].setRotationPoint(32.25F, -44.75F, 0.5F);

        gunModel[172].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, -0.21F, -0.75F, 0.66F, -0.79F, -0.75F, 0.66F, -0.79F, -0.75F, 0.66F, -0.21F, -0.75F, 0.66F, -0.25F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[172].setRotationPoint(34.75F, -42F, -0.5F);

        gunModel[173].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, -0.46F, -0.75F, 0.66F, -0.54F, -0.75F, 0.66F, -0.54F, -0.75F, 0.66F, -0.46F, -0.75F, 0.66F, -0.25F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[173].setRotationPoint(35.5F, -42F, -0.5F);

        gunModel[174].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, -0.25F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.25F, -0.75F, 0.75F, -0.29F, 0.0F, 0.84F, -0.7F, 0.0F, 0.84F, -0.7F, 0.0F, 0.84F, -0.29F, 0.0F, 0.84F); // Import
        gunModel[174].setRotationPoint(34.25F, -44.75F, 0.5F);

        gunModel[175].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, -0.3F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.3F, -0.75F, 0.75F, -0.54F, 0.0F, 0.81F, -0.46F, 0.0F, 0.81F, -0.46F, 0.0F, 0.81F, -0.54F, 0.0F, 0.81F); // Import
        gunModel[175].setRotationPoint(35F, -44.75F, 0.5F);

        gunModel[176].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, -0.21F, -0.75F, 0.66F, -0.79F, -0.75F, 0.66F, -0.79F, -0.75F, 0.66F, -0.21F, -0.75F, 0.66F, -0.25F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[176].setRotationPoint(37.5F, -42F, -0.5F);

        gunModel[177].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, -0.46F, -0.75F, 0.66F, -0.54F, -0.75F, 0.66F, -0.54F, -0.75F, 0.66F, -0.46F, -0.75F, 0.66F, -0.25F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[177].setRotationPoint(38.25F, -42F, -0.5F);

        gunModel[178].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, -0.25F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.25F, -0.75F, 0.75F, -0.29F, 0.0F, 0.84F, -0.7F, 0.0F, 0.84F, -0.7F, 0.0F, 0.84F, -0.29F, 0.0F, 0.84F); // Import
        gunModel[178].setRotationPoint(37F, -44.75F, 0.5F);

        gunModel[179].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, -0.3F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.3F, -0.75F, 0.75F, -0.54F, 0.0F, 0.81F, -0.46F, 0.0F, 0.81F, -0.46F, 0.0F, 0.81F, -0.54F, 0.0F, 0.81F); // Import
        gunModel[179].setRotationPoint(37.75F, -44.75F, 0.5F);

        gunModel[180].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, -0.21F, -0.75F, 0.66F, -0.79F, -0.75F, 0.66F, -0.79F, -0.75F, 0.66F, -0.21F, -0.75F, 0.66F, -0.25F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[180].setRotationPoint(40.25F, -42F, -0.5F);

        gunModel[181].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, -0.46F, -0.75F, 0.66F, -0.54F, -0.75F, 0.66F, -0.54F, -0.75F, 0.66F, -0.46F, -0.75F, 0.66F, -0.25F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[181].setRotationPoint(41F, -42F, -0.5F);

        gunModel[182].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, -0.25F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.25F, -0.75F, 0.75F, -0.29F, 0.0F, 0.84F, -0.7F, 0.0F, 0.84F, -0.7F, 0.0F, 0.84F, -0.29F, 0.0F, 0.84F); // Import
        gunModel[182].setRotationPoint(39.75F, -44.75F, 0.5F);

        gunModel[183].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, -0.3F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.3F, -0.75F, 0.75F, -0.54F, 0.0F, 0.81F, -0.46F, 0.0F, 0.81F, -0.46F, 0.0F, 0.81F, -0.54F, 0.0F, 0.81F); // Import
        gunModel[183].setRotationPoint(40.5F, -44.75F, 0.5F);

        gunModel[184].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, -0.21F, -0.75F, 0.66F, -0.79F, -0.75F, 0.66F, -0.79F, -0.75F, 0.66F, -0.21F, -0.75F, 0.66F, -0.25F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[184].setRotationPoint(43F, -42F, -0.5F);

        gunModel[185].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, -0.46F, -0.75F, 0.66F, -0.54F, -0.75F, 0.66F, -0.54F, -0.75F, 0.66F, -0.46F, -0.75F, 0.66F, -0.25F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[185].setRotationPoint(43.75F, -42F, -0.5F);

        gunModel[186].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, -0.25F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.25F, -0.75F, 0.75F, -0.29F, 0.0F, 0.84F, -0.7F, 0.0F, 0.84F, -0.7F, 0.0F, 0.84F, -0.29F, 0.0F, 0.84F); // Import
        gunModel[186].setRotationPoint(42.5F, -44.75F, 0.5F);

        gunModel[187].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, -0.3F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.3F, -0.75F, 0.75F, -0.54F, 0.0F, 0.81F, -0.46F, 0.0F, 0.81F, -0.46F, 0.0F, 0.81F, -0.54F, 0.0F, 0.81F); // Import
        gunModel[187].setRotationPoint(43.25F, -44.75F, 0.5F);

        gunModel[188].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, -0.21F, -0.75F, 0.66F, -0.79F, -0.75F, 0.66F, -0.79F, -0.75F, 0.66F, -0.21F, -0.75F, 0.66F, -0.25F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[188].setRotationPoint(45.75F, -42F, -0.5F);

        gunModel[189].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, -0.46F, -0.75F, 0.66F, -0.54F, -0.75F, 0.66F, -0.54F, -0.75F, 0.66F, -0.46F, -0.75F, 0.66F, -0.25F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[189].setRotationPoint(46.5F, -42F, -0.5F);

        gunModel[190].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, -0.25F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.25F, -0.75F, 0.75F, -0.29F, 0.0F, 0.84F, -0.7F, 0.0F, 0.84F, -0.7F, 0.0F, 0.84F, -0.29F, 0.0F, 0.84F); // Import
        gunModel[190].setRotationPoint(45.25F, -44.75F, 0.5F);

        gunModel[191].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, -0.3F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.3F, -0.75F, 0.75F, -0.54F, 0.0F, 0.81F, -0.46F, 0.0F, 0.81F, -0.46F, 0.0F, 0.81F, -0.54F, 0.0F, 0.81F); // Import
        gunModel[191].setRotationPoint(46F, -44.75F, 0.5F);

        gunModel[192].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, -0.21F, -0.75F, 0.66F, -0.79F, -0.75F, 0.66F, -0.79F, -0.75F, 0.66F, -0.21F, -0.75F, 0.66F, -0.25F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[192].setRotationPoint(48.5F, -42F, -0.5F);

        gunModel[193].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, -0.46F, -0.75F, 0.66F, -0.54F, -0.75F, 0.66F, -0.54F, -0.75F, 0.66F, -0.46F, -0.75F, 0.66F, -0.25F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[193].setRotationPoint(49.25F, -42F, -0.5F);

        gunModel[194].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, -0.25F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.25F, -0.75F, 0.75F, -0.29F, 0.0F, 0.84F, -0.7F, 0.0F, 0.84F, -0.7F, 0.0F, 0.84F, -0.29F, 0.0F, 0.84F); // Import
        gunModel[194].setRotationPoint(48F, -44.75F, 0.5F);

        gunModel[195].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, -0.3F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.3F, -0.75F, 0.75F, -0.54F, 0.0F, 0.81F, -0.46F, 0.0F, 0.81F, -0.46F, 0.0F, 0.81F, -0.54F, 0.0F, 0.81F); // Import
        gunModel[195].setRotationPoint(48.75F, -44.75F, 0.5F);

        gunModel[196].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, -0.21F, -0.75F, 0.66F, -0.79F, -0.75F, 0.66F, -0.79F, -0.75F, 0.66F, -0.21F, -0.75F, 0.66F, -0.25F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[196].setRotationPoint(51.25F, -42F, -0.5F);

        gunModel[197].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, -0.46F, -0.75F, 0.66F, -0.54F, -0.75F, 0.66F, -0.54F, -0.75F, 0.66F, -0.46F, -0.75F, 0.66F, -0.25F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F); // Import
        gunModel[197].setRotationPoint(52F, -42F, -0.5F);

        gunModel[198].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, -0.25F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.25F, -0.75F, 0.75F, -0.29F, 0.0F, 0.84F, -0.7F, 0.0F, 0.84F, -0.7F, 0.0F, 0.84F, -0.29F, 0.0F, 0.84F); // Import
        gunModel[198].setRotationPoint(50.75F, -44.75F, 0.5F);

        gunModel[199].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, -0.3F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.3F, -0.75F, 0.75F, -0.54F, 0.0F, 0.81F, -0.46F, 0.0F, 0.81F, -0.46F, 0.0F, 0.81F, -0.54F, 0.0F, 0.81F); // Import
        gunModel[199].setRotationPoint(51.5F, -44.75F, 0.5F);

        gunModel[200].addShapeBox(35F, 0F, -3F, 38, 1, 9, 0F, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F); // Import
        gunModel[200].setRotationPoint(21F, -32.5F, -1.5F);

        gunModel[201].addShapeBox(35F, 0F, -3F, 1, 4, 9, 0F, 2.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 2.5F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[201].setRotationPoint(21F, -36.5F, -1.5F);

        gunModel[202].addShapeBox(35F, 0F, -3F, 1, 4, 9, 0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F); // Import
        gunModel[202].setRotationPoint(23.75F, -36.5F, -1.5F);

        gunModel[203].addShapeBox(35F, 0F, -3F, 1, 4, 9, 0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F); // Import
        gunModel[203].setRotationPoint(26.5F, -36.5F, -1.5F);

        gunModel[204].addShapeBox(35F, 0F, -3F, 1, 4, 9, 0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F); // Import
        gunModel[204].setRotationPoint(29.25F, -36.5F, -1.5F);

        gunModel[205].addShapeBox(35F, 0F, -3F, 1, 4, 9, 0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F); // Import
        gunModel[205].setRotationPoint(32F, -36.5F, -1.5F);

        gunModel[206].addShapeBox(35F, 0F, -3F, 1, 4, 9, 0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F); // Import
        gunModel[206].setRotationPoint(34.75F, -36.5F, -1.5F);

        gunModel[207].addShapeBox(35F, 0F, -3F, 1, 4, 9, 0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F); // Import
        gunModel[207].setRotationPoint(37.5F, -36.5F, -1.5F);

        gunModel[208].addShapeBox(35F, 0F, -3F, 1, 4, 9, 0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F); // Import
        gunModel[208].setRotationPoint(40.25F, -36.5F, -1.5F);

        gunModel[209].addShapeBox(35F, 0F, -3F, 1, 4, 9, 0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F); // Import
        gunModel[209].setRotationPoint(43F, -36.5F, -1.5F);

        gunModel[210].addShapeBox(35F, 0F, -3F, 1, 4, 9, 0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F); // Import
        gunModel[210].setRotationPoint(45.75F, -36.5F, -1.5F);

        gunModel[211].addShapeBox(35F, 0F, -3F, 1, 4, 9, 0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F); // Import
        gunModel[211].setRotationPoint(48.5F, -36.5F, -1.5F);

        gunModel[212].addShapeBox(35F, 0F, -3F, 1, 4, 9, 0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F); // Import
        gunModel[212].setRotationPoint(51.25F, -36.5F, -1.5F);

        gunModel[213].addShapeBox(35F, 0F, -3F, 5, 4, 9, 0F, 0.5F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F); // Import
        gunModel[213].setRotationPoint(54F, -36.5F, -1.5F);

        gunModel[214].addShapeBox(35F, 0F, -3F, 4, 2, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[214].setRotationPoint(9F, -40.5F, -0.5F);

        gunModel[215].addShapeBox(35F, 0F, -3F, 12, 1, 7, 0F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F); // Import
        gunModel[215].setRotationPoint(-20F, -40.5F, -0.5F);

        gunModel[216].addShapeBox(35F, 0F, -3F, 11, 1, 7, 0F, 0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F); // Import
        gunModel[216].setRotationPoint(-2F, -40.5F, -0.5F);

        gunModel[217].addShapeBox(35F, 0F, -3F, 1, 1, 10, 0F, -0.15F, -0.25F, -0.6F, -0.85F, -0.25F, -0.7F, -0.85F, -0.25F, -0.6F, -0.15F, -0.25F, -0.6F, -0.3F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F); // Import
        gunModel[217].setRotationPoint(22.7F, -33.25F, -2F);

        gunModel[218].addShapeBox(35F, 0F, -3F, 1, 1, 12, 0F, -0.2F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.3F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F); // Import
        gunModel[218].setRotationPoint(21.8F, -36.75F, -3F);

        gunModel[219].addShapeBox(35F, 0F, -3F, 1, 1, 10, 0F, -0.6F, -0.25F, -0.7F, -0.4F, -0.25F, -0.6F, -0.4F, -0.25F, -0.6F, -0.6F, -0.25F, -0.6F, -0.25F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Import
        gunModel[219].setRotationPoint(23.55F, -33.25F, -2F);

        gunModel[220].addShapeBox(35F, 0F, -3F, 1, 1, 12, 0F, -0.1F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.7F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F); // Import
        gunModel[220].setRotationPoint(22.65F, -36.75F, -3F);

        gunModel[221].addShapeBox(35F, 0F, -3F, 1, 1, 10, 0F, -0.15F, -0.25F, -0.6F, -0.85F, -0.25F, -0.7F, -0.85F, -0.25F, -0.6F, -0.15F, -0.25F, -0.6F, -0.3F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F); // Import
        gunModel[221].setRotationPoint(25.45F, -33.25F, -2F);

        gunModel[222].addShapeBox(35F, 0F, -3F, 1, 1, 12, 0F, -0.2F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.3F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F); // Import
        gunModel[222].setRotationPoint(24.55F, -36.75F, -3F);

        gunModel[223].addShapeBox(35F, 0F, -3F, 1, 1, 10, 0F, -0.6F, -0.25F, -0.7F, -0.4F, -0.25F, -0.6F, -0.4F, -0.25F, -0.6F, -0.6F, -0.25F, -0.6F, -0.25F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Import
        gunModel[223].setRotationPoint(26.35F, -33.25F, -2F);

        gunModel[224].addShapeBox(35F, 0F, -3F, 1, 1, 12, 0F, -0.1F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.7F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F); // Import
        gunModel[224].setRotationPoint(25.45F, -36.75F, -3F);

        gunModel[225].addShapeBox(35F, 0F, -3F, 1, 1, 10, 0F, -0.15F, -0.25F, -0.6F, -0.85F, -0.25F, -0.7F, -0.85F, -0.25F, -0.6F, -0.15F, -0.25F, -0.6F, -0.3F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F); // Import
        gunModel[225].setRotationPoint(28.2F, -33.25F, -2F);

        gunModel[226].addShapeBox(35F, 0F, -3F, 1, 1, 12, 0F, -0.2F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.3F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F); // Import
        gunModel[226].setRotationPoint(27.3F, -36.75F, -3F);

        gunModel[227].addShapeBox(35F, 0F, -3F, 1, 1, 10, 0F, -0.6F, -0.25F, -0.7F, -0.4F, -0.25F, -0.6F, -0.4F, -0.25F, -0.6F, -0.6F, -0.25F, -0.6F, -0.25F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Import
        gunModel[227].setRotationPoint(29.1F, -33.25F, -2F);

        gunModel[228].addShapeBox(35F, 0F, -3F, 1, 1, 12, 0F, -0.1F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.7F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F); // Import
        gunModel[228].setRotationPoint(28.2F, -36.75F, -3F);

        gunModel[229].addShapeBox(35F, 0F, -3F, 1, 1, 10, 0F, -0.15F, -0.25F, -0.6F, -0.85F, -0.25F, -0.7F, -0.85F, -0.25F, -0.6F, -0.15F, -0.25F, -0.6F, -0.3F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F); // Import
        gunModel[229].setRotationPoint(30.95F, -33.25F, -2F);

        gunModel[230].addShapeBox(35F, 0F, -3F, 1, 1, 12, 0F, -0.2F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.3F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F); // Import
        gunModel[230].setRotationPoint(30.05F, -36.75F, -3F);

        gunModel[231].addShapeBox(35F, 0F, -3F, 1, 1, 10, 0F, -0.6F, -0.25F, -0.7F, -0.4F, -0.25F, -0.6F, -0.4F, -0.25F, -0.6F, -0.6F, -0.25F, -0.6F, -0.25F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Import
        gunModel[231].setRotationPoint(31.8F, -33.25F, -2F);

        gunModel[232].addShapeBox(35F, 0F, -3F, 1, 1, 12, 0F, -0.1F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.7F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F); // Import
        gunModel[232].setRotationPoint(30.9F, -36.75F, -3F);

        gunModel[233].addShapeBox(35F, 0F, -3F, 1, 1, 10, 0F, -0.15F, -0.25F, -0.6F, -0.85F, -0.25F, -0.7F, -0.85F, -0.25F, -0.6F, -0.15F, -0.25F, -0.6F, -0.3F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F); // Import
        gunModel[233].setRotationPoint(33.7F, -33.25F, -2F);

        gunModel[234].addShapeBox(35F, 0F, -3F, 1, 1, 12, 0F, -0.2F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.3F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F); // Import
        gunModel[234].setRotationPoint(32.8F, -36.75F, -3F);

        gunModel[235].addShapeBox(35F, 0F, -3F, 1, 1, 10, 0F, -0.6F, -0.25F, -0.7F, -0.4F, -0.25F, -0.6F, -0.4F, -0.25F, -0.6F, -0.6F, -0.25F, -0.6F, -0.25F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Import
        gunModel[235].setRotationPoint(34.55F, -33.25F, -2F);

        gunModel[236].addShapeBox(35F, 0F, -3F, 1, 1, 12, 0F, -0.1F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.7F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F); // Import
        gunModel[236].setRotationPoint(33.65F, -36.75F, -3F);

        gunModel[237].addShapeBox(35F, 0F, -3F, 1, 1, 10, 0F, -0.15F, -0.25F, -0.6F, -0.85F, -0.25F, -0.7F, -0.85F, -0.25F, -0.6F, -0.15F, -0.25F, -0.6F, -0.3F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F); // Import
        gunModel[237].setRotationPoint(36.45F, -33.25F, -2F);

        gunModel[238].addShapeBox(35F, 0F, -3F, 1, 1, 12, 0F, -0.2F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.3F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F); // Import
        gunModel[238].setRotationPoint(35.55F, -36.75F, -3F);

        gunModel[239].addShapeBox(35F, 0F, -3F, 1, 1, 10, 0F, -0.6F, -0.25F, -0.7F, -0.4F, -0.25F, -0.6F, -0.4F, -0.25F, -0.6F, -0.6F, -0.25F, -0.6F, -0.25F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Import
        gunModel[239].setRotationPoint(37.3F, -33.25F, -2F);

        gunModel[240].addShapeBox(35F, 0F, -3F, 1, 1, 12, 0F, -0.1F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.7F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F); // Import
        gunModel[240].setRotationPoint(36.4F, -36.75F, -3F);

        gunModel[241].addShapeBox(35F, 0F, -3F, 1, 1, 10, 0F, -0.15F, -0.25F, -0.6F, -0.85F, -0.25F, -0.7F, -0.85F, -0.25F, -0.6F, -0.15F, -0.25F, -0.6F, -0.3F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F); // Import
        gunModel[241].setRotationPoint(39.2F, -33.25F, -2F);

        gunModel[242].addShapeBox(35F, 0F, -3F, 1, 1, 12, 0F, -0.2F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.3F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F); // Import
        gunModel[242].setRotationPoint(38.3F, -36.75F, -3F);

        gunModel[243].addShapeBox(35F, 0F, -3F, 1, 1, 10, 0F, -0.6F, -0.25F, -0.7F, -0.4F, -0.25F, -0.6F, -0.4F, -0.25F, -0.6F, -0.6F, -0.25F, -0.6F, -0.25F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Import
        gunModel[243].setRotationPoint(40.05F, -33.25F, -2F);

        gunModel[244].addShapeBox(35F, 0F, -3F, 1, 1, 12, 0F, -0.1F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.7F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F); // Import
        gunModel[244].setRotationPoint(39.15F, -36.75F, -3F);

        gunModel[245].addShapeBox(35F, 0F, -3F, 1, 1, 10, 0F, -0.15F, -0.25F, -0.6F, -0.85F, -0.25F, -0.7F, -0.85F, -0.25F, -0.6F, -0.15F, -0.25F, -0.6F, -0.3F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F); // Import
        gunModel[245].setRotationPoint(41.95F, -33.25F, -2F);

        gunModel[246].addShapeBox(35F, 0F, -3F, 1, 1, 12, 0F, -0.2F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.3F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F); // Import
        gunModel[246].setRotationPoint(41.05F, -36.75F, -3F);

        gunModel[247].addShapeBox(35F, 0F, -3F, 1, 1, 10, 0F, -0.6F, -0.25F, -0.7F, -0.4F, -0.25F, -0.6F, -0.4F, -0.25F, -0.6F, -0.6F, -0.25F, -0.6F, -0.25F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Import
        gunModel[247].setRotationPoint(42.8F, -33.25F, -2F);

        gunModel[248].addShapeBox(35F, 0F, -3F, 1, 1, 12, 0F, -0.1F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.7F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F); // Import
        gunModel[248].setRotationPoint(41.9F, -36.75F, -3F);

        gunModel[249].addShapeBox(35F, 0F, -3F, 1, 1, 10, 0F, -0.15F, -0.25F, -0.6F, -0.85F, -0.25F, -0.7F, -0.85F, -0.25F, -0.6F, -0.15F, -0.25F, -0.6F, -0.3F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F); // Import
        gunModel[249].setRotationPoint(44.7F, -33.25F, -2F);

        gunModel[250].addShapeBox(35F, 0F, -3F, 1, 1, 12, 0F, -0.2F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.3F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F); // Import
        gunModel[250].setRotationPoint(43.8F, -36.75F, -3F);

        gunModel[251].addShapeBox(35F, 0F, -3F, 1, 1, 10, 0F, -0.6F, -0.25F, -0.7F, -0.4F, -0.25F, -0.6F, -0.4F, -0.25F, -0.6F, -0.6F, -0.25F, -0.6F, -0.25F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Import
        gunModel[251].setRotationPoint(45.55F, -33.25F, -2F);

        gunModel[252].addShapeBox(35F, 0F, -3F, 1, 1, 12, 0F, -0.1F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.7F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F); // Import
        gunModel[252].setRotationPoint(44.65F, -36.75F, -3F);

        gunModel[253].addShapeBox(35F, 0F, -3F, 1, 1, 10, 0F, -0.15F, -0.25F, -0.6F, -0.85F, -0.25F, -0.7F, -0.85F, -0.25F, -0.6F, -0.15F, -0.25F, -0.6F, -0.3F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F); // Import
        gunModel[253].setRotationPoint(47.45F, -33.25F, -2F);

        gunModel[254].addShapeBox(35F, 0F, -3F, 1, 1, 12, 0F, -0.2F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.3F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F); // Import
        gunModel[254].setRotationPoint(46.55F, -36.75F, -3F);

        gunModel[255].addShapeBox(35F, 0F, -3F, 1, 1, 10, 0F, -0.6F, -0.25F, -0.7F, -0.4F, -0.25F, -0.6F, -0.4F, -0.25F, -0.6F, -0.6F, -0.25F, -0.6F, -0.25F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Import
        gunModel[255].setRotationPoint(48.3F, -33.25F, -2F);

        gunModel[256].addShapeBox(35F, 0F, -3F, 1, 1, 12, 0F, -0.1F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.7F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F); // Import
        gunModel[256].setRotationPoint(47.4F, -36.75F, -3F);

        gunModel[257].addShapeBox(35F, 0F, -3F, 1, 1, 10, 0F, -0.15F, -0.25F, -0.6F, -0.85F, -0.25F, -0.7F, -0.85F, -0.25F, -0.6F, -0.15F, -0.25F, -0.6F, -0.3F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F); // Import
        gunModel[257].setRotationPoint(50.2F, -33.25F, -2F);

        gunModel[258].addShapeBox(35F, 0F, -3F, 1, 1, 12, 0F, -0.2F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.3F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F); // Import
        gunModel[258].setRotationPoint(49.3F, -36.75F, -3F);

        gunModel[259].addShapeBox(35F, 0F, -3F, 1, 1, 10, 0F, -0.6F, -0.25F, -0.7F, -0.4F, -0.25F, -0.6F, -0.4F, -0.25F, -0.6F, -0.6F, -0.25F, -0.6F, -0.25F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Import
        gunModel[259].setRotationPoint(51.05F, -33.25F, -2F);

        gunModel[260].addShapeBox(35F, 0F, -3F, 1, 1, 12, 0F, -0.1F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.7F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F); // Import
        gunModel[260].setRotationPoint(50.15F, -36.75F, -3F);

        gunModel[261].addShapeBox(35F, 0F, -3F, 1, 1, 10, 0F, -0.15F, -0.25F, -0.6F, -0.85F, -0.25F, -0.7F, -0.85F, -0.25F, -0.6F, -0.15F, -0.25F, -0.6F, -0.3F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F); // Import
        gunModel[261].setRotationPoint(52.95F, -33.25F, -2F);

        gunModel[262].addShapeBox(35F, 0F, -3F, 1, 1, 12, 0F, -0.2F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.3F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F); // Import
        gunModel[262].setRotationPoint(52.05F, -36.75F, -3F);

        gunModel[263].addShapeBox(35F, 0F, -3F, 1, 1, 10, 0F, -0.6F, -0.25F, -0.7F, -0.4F, -0.25F, -0.6F, -0.4F, -0.25F, -0.6F, -0.6F, -0.25F, -0.6F, -0.25F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F, -0.3F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Import
        gunModel[263].setRotationPoint(53.8F, -33.25F, -2F);

        gunModel[264].addShapeBox(35F, 0F, -3F, 1, 1, 12, 0F, -0.1F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.7F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F, -0.3F, -0.25F, -0.65F, -0.7F, -0.25F, -0.65F); // Import
        gunModel[264].setRotationPoint(52.9F, -36.75F, -3F);

        gunModel[265].addShapeBox(35F, 0F, -3F, 2, 1, 9, 0F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.75F); // Import
        gunModel[265].setRotationPoint(19F, -32.5F, -1.5F);

        gunModel[266].addShapeBox(35F, 0F, -3F, 1, 4, 9, 0F, 4.5F, 0.0F, -0.75F, -1.5F, 0.0F, 1.0F, -1.5F, 0.0F, 1.0F, 4.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.75F); // Import
        gunModel[266].setRotationPoint(19F, -36.5F, -1.5F);

        gunModel[267].addShapeBox(35F, 0F, -3F, 3, 2, 9, 0F, 2.5F, 0.0F, -0.75F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, 2.5F, 0.0F, -0.75F, 1.0F, -0.5F, -0.75F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 1.0F, -0.5F, -0.75F); // Import
        gunModel[267].setRotationPoint(15.5F, -38F, -1.5F);

        gunModel[268].addShapeBox(35F, 0F, -3F, 3, 3, 9, 0F, 3.25F, 0.0F, -0.75F, -5.75F, -0.25F, 0.05F, -5.5F, -0.25F, 0.05F, 3.25F, 0.0F, -0.75F, 0.5F, -0.5F, -0.75F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.5F, -0.5F, -0.75F); // Import
        gunModel[268].setRotationPoint(13.5F, -40.5F, -1.5F);

        gunModel[269].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[269].setRotationPoint(-8F, -36.5F, -0.5F);

        gunModel[270].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F); // Import
        gunModel[270].setRotationPoint(-20F, -40F, -0.5F);

        gunModel[271].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[271].setRotationPoint(-20F, -39.5F, -0.5F);

        gunModel[272].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F); // Import
        gunModel[272].setRotationPoint(6F, -36.5F, -0.5F);

        gunModel[273].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F); // Import
        gunModel[273].setRotationPoint(8F, -40F, -0.5F);

        gunModel[274].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F); // Import
        gunModel[274].setRotationPoint(8F, -39.5F, -0.5F);

        gunModel[275].addShapeBox(35F, 0F, -3F, 24, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[275].setRotationPoint(33.5F, -40.5F, 7.5F);

        gunModel[276].addShapeBox(35F, 0F, -3F, 24, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[276].setRotationPoint(33.5F, -42F, 8.5F);

        gunModel[277].addShapeBox(35F, 0F, -3F, 38, 1, 4, 0F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[277].setRotationPoint(19.5F, -31.5F, 1F);

        gunModel[278].addShapeBox(35F, 0F, -3F, 34, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[278].setRotationPoint(23.5F, -30.5F, 0F);

        gunModel[279].addShapeBox(35F, 0F, -3F, 30, 5, 1, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[279].setRotationPoint(-20F, -40.5F, 0.5F);

        gunModel[280].addShapeBox(35F, 0F, -3F, 4, 6, 8, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -2.5F, -0.25F, 0.0F, -2.5F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[280].setRotationPoint(19.5F, -31.5F, -1F);

        gunModel[281].addShapeBox(35F, 0F, -3F, 4, 2, 8, 0F, 0.0F, -1.0F, -0.25F, 0.0F, 1.5F, -0.25F, 0.0F, 1.5F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, -2.5F, -1.25F, 0.0F, -2.5F, -1.25F, 0.0F, 0.0F, -1.25F); // Import
        gunModel[281].setRotationPoint(19.5F, -26.5F, -1F);

        gunModel[282].addShapeBox(35F, 0F, -3F, 3, 3, 3, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F); // Import
        gunModel[282].setRotationPoint(58F, -36.5F, 4.5F);

        gunModel[283].addShapeBox(35F, 0F, -3F, 3, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[283].setRotationPoint(58F, -39.5F, -1.5F);

        gunModel[284].addShapeBox(35F, 0F, -3F, 3, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[284].setRotationPoint(58F, -39.5F, 6.5F);

        gunModel[285].addShapeBox(35F, 0F, -3F, 3, 3, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[285].setRotationPoint(58F, -36.5F, -1.5F);

        gunModel[286].addShapeBox(35F, 0F, -3F, 3, 1, 1, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[286].setRotationPoint(58F, -34.5F, 2.5F);

        gunModel[287].addShapeBox(35F, 0F, -3F, 3, 3, 3, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[287].setRotationPoint(58F, -42.5F, 4.5F);

        gunModel[288].addShapeBox(35F, 0F, -3F, 3, 3, 3, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[288].setRotationPoint(58F, -42.5F, -1.5F);

        gunModel[289].addShapeBox(35F, 0F, -3F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[289].setRotationPoint(58F, -42.5F, 2.5F);

        gunModel[290].addShapeBox(35F, 0F, -3F, 70, 1, 4, 0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[290].setRotationPoint(20F, -39F, 1F);

        gunModel[291].addShapeBox(35F, 0F, -3F, 9, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[291].setRotationPoint(58F, -41F, 1.5F);

        gunModel[292].addShapeBox(35F, 0F, -3F, 4, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[292].setRotationPoint(63F, -41F, 3.5F);

        gunModel[293].addShapeBox(35F, 0F, -3F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F); // Import
        gunModel[293].setRotationPoint(65F, -41F, 5F);

        gunModel[294].addShapeBox(35F, 0F, -3F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F); // Import
        gunModel[294].setRotationPoint(65F, -39.5F, 5F);

        gunModel[295].addShapeBox(35F, 0F, -3F, 2, 1, 1, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import
        gunModel[295].setRotationPoint(63F, -40.75F, 4.75F);

        gunModel[296].addShapeBox(35F, 0F, -3F, 2, 1, 1, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Import
        gunModel[296].setRotationPoint(63F, -40.25F, 4.75F);

        gunModel[297].addShapeBox(35F, 0F, -3F, 2, 1, 1, 0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import
        gunModel[297].setRotationPoint(63F, -41.25F, 4.75F);

        gunModel[298].addShapeBox(35F, 0F, -3F, 2, 1, 1, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Import
        gunModel[298].setRotationPoint(63F, -40.75F, 5.25F);

        gunModel[299].addShapeBox(35F, 0F, -3F, 2, 1, 1, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F); // Import
        gunModel[299].setRotationPoint(63F, -40.25F, 5.25F);

        gunModel[300].addShapeBox(35F, 0F, -3F, 2, 1, 1, 0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Import
        gunModel[300].setRotationPoint(63F, -41.25F, 5.25F);

        gunModel[301].addShapeBox(35F, 0F, -3F, 2, 1, 1, 0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F); // Import
        gunModel[301].setRotationPoint(65.5F, -40.5F, 5F);

        gunModel[302].addShapeBox(35F, 0F, -3F, 24, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[302].setRotationPoint(33.5F, -40.5F, -2.5F);

        gunModel[303].addShapeBox(35F, 0F, -3F, 5, 3, 5, 0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[303].setRotationPoint(-39F, -47.5F, 0.5F);

        gunModel[304].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[304].setRotationPoint(-38.5F, -49F, 0F);

        gunModel[305].addShapeBox(35F, 0F, -3F, 91, 2, 4, 0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1F, 0.0F, 0.25F, 1F, 0.0F, 0.25F, 1F, 0.0F, 0.0F, 1F, 0.0F); // Import
        gunModel[305].setRotationPoint(-34F, -47.5F, 1F);

        gunModel[306].addShapeBox(35F, 0F, -3F, 3, 2, 6, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F); // Import
        gunModel[306].setRotationPoint(-11F, -46.5F, -0.25F);

        gunModel[307].addShapeBox(35F, 0F, -3F, 3, 1, 6, 0F, 0.75F, -0.5F, -0.5F, 0.75F, -0.5F, -0.5F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F); // Import
        gunModel[307].setRotationPoint(-11F, -47F, -0.25F);

        gunModel[308].addShapeBox(35F, 0F, -3F, 7, 1, 6, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F); // Import
        gunModel[308].setRotationPoint(-13F, -47.75F, -0.25F);

        gunModel[309].addShapeBox(35F, 0F, -3F, 3, 1, 6, 0F, 1.25F, -0.75F, -0.5F, 1.25F, -0.75F, -0.5F, 1.25F, -0.75F, 0.0F, 1.25F, -0.75F, 0.0F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F); // Import
        gunModel[309].setRotationPoint(-11F, -47.5F, -0.25F);

        gunModel[310].addShapeBox(35F, 0F, -3F, 3, 2, 6, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F); // Import
        gunModel[310].setRotationPoint(13F, -46.5F, -0.25F);

        gunModel[311].addShapeBox(35F, 0F, -3F, 3, 1, 6, 0F, 0.75F, -0.5F, -0.5F, 0.75F, -0.5F, -0.5F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F); // Import
        gunModel[311].setRotationPoint(13F, -47F, -0.25F);

        gunModel[312].addShapeBox(35F, 0F, -3F, 7, 1, 6, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F); // Import
        gunModel[312].setRotationPoint(11F, -47.75F, -0.25F);

        gunModel[313].addShapeBox(35F, 0F, -3F, 3, 1, 6, 0F, 1.25F, -0.75F, -0.5F, 1.25F, -0.75F, -0.5F, 1.25F, -0.75F, 0.0F, 1.25F, -0.75F, 0.0F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F); // Import
        gunModel[313].setRotationPoint(13F, -47.5F, -0.25F);

        gunModel[314].addShapeBox(35F, 0F, -3F, 3, 2, 6, 0F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F); // Import
        gunModel[314].setRotationPoint(49F, -46.5F, -0.25F);

        gunModel[315].addShapeBox(35F, 0F, -3F, 1, 2, 2, 0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F); // Import
        gunModel[315].setRotationPoint(-18.5F, -22F, 2F);

        gunModel[316].addShapeBox(35F, 0F, -3F, 1, 1, 2, 0F, -0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F); // Import
        gunModel[316].setRotationPoint(-18.5F, -23F, 2F);

        gunModel[317].addShapeBox(35F, 0F, -3F, 1, 1, 2, 0F, -0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); // Import
        gunModel[317].setRotationPoint(-17.75F, -24F, 2F);

        gunModel[318].addShapeBox(35F, 0F, -3F, 1, 1, 2, 0F, 1.0F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); // Import
        gunModel[318].setRotationPoint(-16.75F, -25F, 2F);

        gunModel[319].addShapeBox(35F, 0F, -3F, 1, 1, 2, 0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F); // Import
        gunModel[319].setRotationPoint(-18.5F, -20F, 2F);

        gunModel[320].addShapeBox(35F, 0F, -3F, 1, 1, 2, 0F, -0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, -1.0F, 0.5F, 0.0F); // Import
        gunModel[320].setRotationPoint(-18.25F, -19F, 2F);

        gunModel[321].addShapeBox(35F, 0F, -3F, 2, 7, 3, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[321].setRotationPoint(-9.5F, -23.5F, 1.5F);

        gunModel[322].addShapeBox(35F, 0F, -3F, 1, 7, 3, 0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F); // Import
        gunModel[322].setRotationPoint(-10F, -23.5F, 1.5F);

        gunModel[323].addShapeBox(35F, 0F, -3F, 1, 1, 1, 0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F); // Import
        gunModel[323].setRotationPoint(-9F, -19F, 1.25F);

        gunModel[324].addShapeBox(35F, 0F, -3F, 1, 1, 1, 0F, -0.5F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F); // Import
        gunModel[324].setRotationPoint(-9F, -20F, 0.5F);

        gunModel[325].addShapeBox(35F, 0F, -3F, 1, 1, 1, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F); // Import
        gunModel[325].setRotationPoint(-9F, -21F, 1.25F);

        gunModel[326].addShapeBox(35F, 0F, -3F, 1, 1, 1, 0F, -0.5F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F); // Import
        gunModel[326].setRotationPoint(-9F, -19.5F, 0.5F);

        gunModel[327].addShapeBox(35F, 0F, -3F, 1, 1, 1, 0F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F); // Import
        gunModel[327].setRotationPoint(-9F, -20.5F, 0.5F);

        gunModel[328].addShapeBox(35F, 0F, -3F, 8, 3, 7, 0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, -1.0F, 0.25F); // Import
        gunModel[328].setRotationPoint(-40.5F, -33.5F, -0.5F);

        gunModel[329].addShapeBox(35F, 0F, -3F, 31, 7, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[329].setRotationPoint(-74F, -40.5F, -0.5F);

        gunModel[330].addShapeBox(35F, 0F, -3F, 31, 1, 7, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[330].setRotationPoint(-74F, -41.5F, -0.5F);

        gunModel[331].addShapeBox(35F, 0F, -3F, 31, 1, 6, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[331].setRotationPoint(-74F, -42.5F, 0F);

        gunModel[332].addShapeBox(35F, 0F, -3F, 12, 1, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[332].setRotationPoint(-59F, -30.5F, -0.5F);

        gunModel[333].addShapeBox(35F, 0F, -3F, 9, 1, 7, 0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F); // Import
        gunModel[333].setRotationPoint(-68F, -30.5F, -0.5F);

        gunModel[334].addShapeBox(35F, 0F, -3F, 6, 1, 7, 0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F); // Import
        gunModel[334].setRotationPoint(-74F, -31.5F, -0.5F);

        gunModel[335].addShapeBox(35F, 0F, -3F, 6, 1, 7, 0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[335].setRotationPoint(-74F, -32.5F, -0.5F);

        gunModel[336].addShapeBox(35F, 0F, -3F, 12, 3, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[336].setRotationPoint(-59F, -33.5F, -0.5F);

        gunModel[337].addShapeBox(35F, 0F, -3F, 9, 2, 7, 0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[337].setRotationPoint(-68F, -32.5F, -0.5F);

        gunModel[338].addShapeBox(35F, 0F, -3F, 14, 7, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[338].setRotationPoint(-88F, -40.5F, 0F);

        gunModel[339].addShapeBox(35F, 0F, -3F, 14, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[339].setRotationPoint(-88F, -33.5F, 0F);

        gunModel[340].addShapeBox(35F, 0F, -3F, 14, 1, 6, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[340].setRotationPoint(-88F, -41.5F, 0F);

        gunModel[341].addShapeBox(35F, 0F, -3F, 1, 12, 8, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[341].setRotationPoint(-93.5F, -40.5F, -1F);

        gunModel[342].addShapeBox(35F, 0F, -3F, 5, 12, 8, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[342].setRotationPoint(-93F, -40.5F, -1F);

        gunModel[343].addShapeBox(35F, 0F, -3F, 1, 2, 8, 0F, -0.5F, -0.5F, -1.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[343].setRotationPoint(-93.5F, -42.5F, -1F);

        gunModel[344].addShapeBox(35F, 0F, -3F, 1, 2, 8, 0F, -0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[344].setRotationPoint(-92.5F, -42.5F, -1F);

        gunModel[345].addShapeBox(35F, 0F, -3F, 1, 1, 8, 0F, -1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[345].setRotationPoint(-93F, -43F, -1F);

        gunModel[346].addShapeBox(35F, 0F, -3F, 1, 1, 8, 0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[346].setRotationPoint(-92F, -43F, -1F);

        gunModel[347].addShapeBox(35F, 0F, -3F, 3, 1, 8, 0F, 0.0F, 0.0F, -1.0F, 0.5F, -1.25F, -1.0F, 0.5F, -1.25F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[347].setRotationPoint(-91F, -43F, -1F);

        gunModel[348].addShapeBox(35F, 0F, -3F, 3, 1, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[348].setRotationPoint(-91F, -42F, -1F);

        gunModel[349].addShapeBox(35F, 0F, -3F, 1, 9, 8, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F); // Import
        gunModel[349].setRotationPoint(-93.5F, -28.5F, -1F);

        gunModel[350].addShapeBox(35F, 0F, -3F, 5, 9, 8, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F); // Import
        gunModel[350].setRotationPoint(-93F, -28.5F, -1F);

        gunModel[351].addShapeBox(35F, 0F, -3F, 1, 4, 8, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.5F, 0.0F, -1.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -1.0F); // Import
        gunModel[351].setRotationPoint(-91.5F, -19.5F, -1F);

        gunModel[352].addShapeBox(35F, 0F, -3F, 3, 4, 8, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import
        gunModel[352].setRotationPoint(-91F, -19.5F, -1F);

        gunModel[353].addShapeBox(35F, 0F, -3F, 1, 2, 8, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F); // Import
        gunModel[353].setRotationPoint(-90F, -15.5F, -1F);

        gunModel[354].addShapeBox(35F, 0F, -3F, 2, 2, 8, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import
        gunModel[354].setRotationPoint(-90F, -15.5F, -1F);

        gunModel[355].addShapeBox(35F, 0F, -3F, 2, 4, 8, 0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[355].setRotationPoint(-88F, -41F, -1F);

        gunModel[356].addShapeBox(35F, 0F, -3F, 2, 4, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[356].setRotationPoint(-88F, -37F, -1F);

        gunModel[357].addShapeBox(35F, 0F, -3F, 2, 12, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[357].setRotationPoint(-88F, -33F, -1F);

        gunModel[358].addShapeBox(35F, 0F, -3F, 2, 8, 8, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[358].setRotationPoint(-88F, -21F, -1F);

        gunModel[359].addShapeBox(35F, 0F, -3F, 9, 1, 9, 0F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[359].setRotationPoint(-40F, -41F, -1.5F);

        gunModel[360].addShapeBox(35F, 0F, -3F, 8, 7, 9, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[360].setRotationPoint(-40F, -40F, -1.5F);

        gunModel[361].addShapeBox(35F, 0F, -3F, 7, 1, 9, 0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[361].setRotationPoint(-40F, -33F, -1.5F);

        gunModel[362].addShapeBox(35F, 0F, -3F, 2, 7, 9, 0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[362].setRotationPoint(-32.5F, -40F, -1.5F);

        gunModel[363].addShapeBox(35F, 0F, -3F, 1, 1, 9, 0F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[363].setRotationPoint(-31F, -41F, -1.5F);

        gunModel[364].addShapeBox(35F, 0F, -3F, 1, 1, 9, 0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, -0.75F, 0.75F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[364].setRotationPoint(-32.75F, -33F, -1.5F);

        gunModel[365].addShapeBox(35F, 0F, -3F, 3, 1, 8, 0F, 0.0F, 1.25F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 1.25F, -0.5F, 0.0F, -1.25F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.25F, -2.0F); // Import
        gunModel[365].setRotationPoint(-44.25F, -28.5F, -1F);

        gunModel[366].addShapeBox(35F, 0F, -3F, 3, 2, 8, 0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.25F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -1.25F, -0.5F); // Import
        gunModel[366].setRotationPoint(-44.25F, -30.5F, -1F);

        gunModel[367].addShapeBox(35F, 0F, -3F, 1, 1, 6, 0F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F); // Import
        gunModel[367].setRotationPoint(-41F, -28.5F, 0F);

        gunModel[368].addShapeBox(35F, 0F, -3F, 1, 2, 6, 0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F); // Import
        gunModel[368].setRotationPoint(-41F, -30.5F, 0F);

        gunModel[369].addShapeBox(35F, 0F, -3F, 3, 1, 8, 0F, -0.25F, 0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, -0.75F, -1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -0.25F, -0.75F, -1.5F); // Import
        gunModel[369].setRotationPoint(-47.25F, -29.75F, -1F);

        gunModel[370].addShapeBox(35F, 0F, -3F, 3, 2, 8, 0F, -0.25F, 0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.75F, -0.5F, -0.25F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.25F, -0.75F, -0.5F); // Import
        gunModel[370].setRotationPoint(-47.25F, -31.75F, -1F);

        gunModel[371].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[371].setRotationPoint(-43F, -41.5F, -0.5F);

        gunModel[372].addShapeBox(35F, 0F, -3F, 1, 1, 6, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[372].setRotationPoint(-43F, -42.5F, 0F);

        gunModel[373].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, 0.0F, 0.25F, -0.25F, 0.0F, 1.5F, -0.25F, 0.0F, 1.5F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -0.25F, 0.25F); // Import
        gunModel[373].setRotationPoint(-42F, -42F, -0.5F);

        gunModel[374].addShapeBox(35F, 0F, -3F, 1, 1, 6, 0F, 0.0F, 0.25F, -0.75F, 0.0F, 1.5F, -0.75F, 0.0F, 1.5F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, -0.25F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -0.25F, 0.25F); // Import
        gunModel[374].setRotationPoint(-42F, -43F, 0F);

        gunModel[375].addShapeBox(35F, 0F, -3F, 1, 7, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[375].setRotationPoint(-43F, -40.5F, -0.5F);

        gunModel[376].addShapeBox(35F, 0F, -3F, 3, 1, 8, 0F, -0.25F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.75F, -0.5F); // Import
        gunModel[376].setRotationPoint(-47.25F, -32.75F, -1F);

        gunModel[377].addShapeBox(35F, 0F, -3F, 3, 3, 8, 0F, 0.0F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.25F, 0.0F); // Import
        gunModel[377].setRotationPoint(-44.25F, -33.5F, -1F);

        gunModel[378].addShapeBox(35F, 0F, -3F, 1, 3, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, -0.5F, 1.75F, 0.0F, -0.5F, 1.75F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F); // Import
        gunModel[378].setRotationPoint(-43F, -33.5F, -0.5F);

        gunModel[379].addShapeBox(35F, 0F, -3F, 2, 7, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 0.25F); // Import
        gunModel[379].setRotationPoint(-42F, -40F, -0.5F);

        gunModel[380].addShapeBox(35F, 0F, -3F, 2, 1, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[380].setRotationPoint(-42F, -41F, -0.5F);

        gunModel[381].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[381].setRotationPoint(-41F, -43.5F, -0.5F);

        gunModel[382].addShapeBox(35F, 0F, -3F, 1, 1, 7, 0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[382].setRotationPoint(-41F, -44.5F, -0.5F);

        gunModel[383].addShapeBox(35F, 0F, -3F, 2, 1, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.75F, 0.0F, -0.75F, 0.75F, 0.0F, -0.75F, 0.25F); // Import
        gunModel[383].setRotationPoint(-42F, -41.25F, -0.5F);

        gunModel[384].addShapeBox(35F, 0F, -3F, 2, 1, 7, 0F, -1.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -1.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[384].setRotationPoint(-42F, -42.25F, -0.5F);

        gunModel[385].addShapeBox(35F, 0F, -3F, 2, 2, 7, 0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.5F, 0.25F, -1.75F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -1.75F, 0.5F, -0.5F); // Import
        gunModel[385].setRotationPoint(-42F, -33F, -0.5F);

        gunModel[386].addShapeBox(35F, 0F, -3F, 1, 6, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F); // Import
        gunModel[386].setRotationPoint(-41.5F, -40.5F, 6F);

        gunModel[387].addShapeBox(35F, 0F, -3F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F); // Import
        gunModel[387].setRotationPoint(-41F, -41.5F, 6F);

        gunModel[388].addShapeBox(35F, 0F, -3F, 3, 1, 2, 0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F); // Import
        gunModel[388].setRotationPoint(-40F, -41.5F, 6F);

        gunModel[389].addShapeBox(35F, 0F, -3F, 1, 1, 2, 0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -1.0F); // Import
        gunModel[389].setRotationPoint(-41.5F, -34.5F, 6F);

        gunModel[390].addShapeBox(35F, 0F, -3F, 3, 1, 2, 0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[390].setRotationPoint(-40.5F, -34.5F, 6F);

        gunModel[391].addShapeBox(35F, 0F, -3F, 3, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.15F, -0.5F, 0.0F, -0.15F, -0.5F, 0.0F, -0.15F, -0.5F, -0.5F, 0.15F, -0.5F, 0.0F); // Import
        gunModel[391].setRotationPoint(-40.5F, -40.5F, 6F);

        gunModel[392].addShapeBox(35F, 0F, -3F, 3, 2, 2, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, -0.5F, 0.15F, 0.0F, 0.0F); // Import
        gunModel[392].setRotationPoint(-40.85F, -36.5F, 6F);

        gunModel[393].addShapeBox(35F, 0F, -3F, 4, 1, 2, 0F, -0.1F, -0.25F, 0.0F, -0.85F, -0.25F, 0.0F, -0.85F, -0.25F, -0.5F, -0.1F, -0.25F, 0.0F, -0.05F, -0.25F, 0.0F, -0.9F, -0.25F, 0.0F, -0.9F, -0.25F, -0.5F, -0.05F, -0.25F, 0.0F); // Import
        gunModel[393].setRotationPoint(-40.85F, -38F, 6F);

        gunModel[394].addShapeBox(35F, 0F, -3F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[394].setRotationPoint(-40.25F, -37.12F, 6F);

        gunModel[395].addShapeBox(35F, 0F, -3F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[395].setRotationPoint(-40.25F, -38.87F, 6F);

        gunModel[396].addShapeBox(35F, 0F, -3F, 1, 5, 1, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); // Import
        gunModel[396].setRotationPoint(-42F, -40F, 6.5F);

        gunModel[397].addShapeBox(35F, 0F, -3F, 2, 5, 1, 0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F); // Import
        gunModel[397].setRotationPoint(-44F, -40F, 6.5F);

        gunModel[398].addShapeBox(35F, 0F, -3F, 1, 3, 1, 0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[398].setRotationPoint(-45F, -39F, 6.5F);

        gunModel[399].addShapeBox(35F, 0F, -3F, 1, 8, 2, 0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[399].setRotationPoint(-40F, -41F, -2.5F);

        gunModel[400].addShapeBox(35F, 0F, -3F, 1, 8, 2, 0F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, -0.5F); // Import
        gunModel[400].setRotationPoint(-41F, -41F, -2.5F);

        gunModel[401].addShapeBox(35F, 0F, -3F, 1, 8, 2, 0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[401].setRotationPoint(-39.25F, -41F, -2.5F);

        gunModel[402].addShapeBox(35F, 0F, -3F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[402].setRotationPoint(-41.15F, -41.5F, -1F);

        gunModel[403].addShapeBox(35F, 0F, -3F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[403].setRotationPoint(-41.15F, -41.5F, -2F);

        gunModel[404].addShapeBox(35F, 0F, -3F, 3, 1, 1, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[404].setRotationPoint(-41.15F, -41.5F, -3F);

        gunModel[405].addShapeBox(35F, 0F, -3F, 3, 6, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[405].setRotationPoint(-41.15F, -40F, -1F);

        gunModel[406].addShapeBox(35F, 0F, -3F, 3, 6, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[406].setRotationPoint(-41.15F, -40F, -2F);

        gunModel[407].addShapeBox(35F, 0F, -3F, 3, 6, 1, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[407].setRotationPoint(-41.15F, -40F, -3F);

        gunModel[408].addShapeBox(35F, 0F, -3F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[408].setRotationPoint(-41.15F, -33.5F, -1F);

        gunModel[409].addShapeBox(35F, 0F, -3F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[409].setRotationPoint(-41.15F, -33.5F, -2F);

        gunModel[410].addShapeBox(35F, 0F, -3F, 3, 1, 1, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[410].setRotationPoint(-41.15F, -33.5F, -3F);

        gunModel[411].addShapeBox(35F, 0F, -3F, 4, 1, 8, 0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F); // Import
        gunModel[411].setRotationPoint(-26F, -30F, -1F);

        gunModel[412].addShapeBox(35F, 0F, -3F, 4, 1, 8, 0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F); // Import
        gunModel[412].setRotationPoint(-26F, -28.5F, -1F);

        gunModel[413].addShapeBox(35F, 0F, -3F, 4, 1, 8, 0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F); // Import
        gunModel[413].setRotationPoint(-26F, -31.5F, -1F);

        gunModel[414].addShapeBox(35F, 0F, -3F, 3, 1, 8, 0F, -0.75F, -1.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.75F, -1.25F, 0.25F, -1.5F, 1.25F, 0.25F, 0.75F, -0.25F, 0.25F, 0.75F, -0.25F, 0.25F, -1.5F, 1.25F, 0.25F); // Import
        gunModel[414].setRotationPoint(-28F, -28.5F, -1F);

        gunModel[415].addShapeBox(35F, 0F, -3F, 3, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[415].setRotationPoint(-13.5F, -29.75F, 6F);

        gunModel[416].addShapeBox(35F, 0F, -3F, 1, 2, 1, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F); // Import
        gunModel[416].setRotationPoint(-10.5F, -30.75F, 6F);

        gunModel[417].addShapeBox(35F, 0F, -3F, 3, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[417].setRotationPoint(-9.5F, -29.75F, 6F);

        gunModel[418].addShapeBox(35F, 0F, -3F, 1, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[418].setRotationPoint(-10.5F, -29.75F, 6F);

        gunModel[419].addShapeBox(35F, 0F, -3F, 2, 1, 1, 0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[419].setRotationPoint(65F, -41F, 0.5F);

        gunModel[420].addShapeBox(35F, 0F, -3F, 2, 1, 1, 0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[420].setRotationPoint(65F, -39.5F, 0.5F);

        gunModel[421].addShapeBox(35F, 0F, -3F, 2, 1, 1, 0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F); // Import
        gunModel[421].setRotationPoint(65.5F, -40.5F, 0.5F);

        gunModel[422].addShapeBox(35F, 0F, -3F, 1, 3, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[422].setRotationPoint(-10F, -38.75F, 6.75F);

        gunModel[423].addShapeBox(35F, 0F, -3F, 1, 3, 1, 0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, -0.5F, 0.0F, 0.25F); // Import
        gunModel[423].setRotationPoint(-9.5F, -38.75F, 6.75F);

        gunModel[424].addShapeBox(35F, 0F, -3F, 2, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[424].setRotationPoint(-12F, -38.75F, 6.75F);

        gunModel[425].addShapeBox(35F, 0F, -3F, 2, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[425].setRotationPoint(-14F, -38.75F, 6.75F);

        gunModel[426].addShapeBox(35F, 0F, -3F, 2, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[426].setRotationPoint(-12F, -36.75F, 6.75F);

        gunModel[427].addShapeBox(35F, 0F, -3F, 2, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[427].setRotationPoint(-14F, -36.75F, 6.75F);

        gunModel[428].addShapeBox(35F, 0F, -3F, 1, 1, 1, 0F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.25F, -0.75F, -0.5F, 0.15F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, -1.0F, -0.25F, 0.15F); // Import
        gunModel[428].setRotationPoint(-11F, -38.25F, 6.75F);

        gunModel[429].addShapeBox(35F, 0F, -3F, 1, 1, 1, 0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, -1.0F, -0.25F, 0.15F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.25F, -0.75F, -0.5F, 0.15F); // Import
        gunModel[429].setRotationPoint(-11F, -37F, 6.75F);

        gunModel[430].addShapeBox(35F, 0F, -3F, 6, 1, 1, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[430].setRotationPoint(-9.5F, -28.5F, 6F);

        gunModel[431].addShapeBox(35F, 0F, -3F, 9, 1, 1, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[431].setRotationPoint(-9.5F, -26.5F, 6F);

        gunModel[432].addShapeBox(35F, 0F, -3F, 4, 1, 1, 0F, -1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[432].setRotationPoint(-4.5F, -29.5F, 6F);

        gunModel[433].addShapeBox(35F, 0F, -3F, 1, 3, 1, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F); // Import
        gunModel[433].setRotationPoint(-1.5F, -28.5F, 6F);

        gunModel[434].addShapeBox(35F, 0F, -3F, 1, 1, 1, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F); // Import
        gunModel[434].setRotationPoint(-4.5F, -28.5F, 6F);

        gunModel[435].addShapeBox(35F, 0F, -3F, 2, 1, 1, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[435].setRotationPoint(-11.5F, -28.5F, 6F);

        gunModel[436].addShapeBox(35F, 0F, -3F, 2, 1, 1, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[436].setRotationPoint(-11.5F, -26.5F, 6F);

        gunModel[437].addShapeBox(35F, 0F, -3F, 2, 2, 1, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.15F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[437].setRotationPoint(-11.5F, -28F, 6F);

        gunModel[438].addShapeBox(35F, 0F, -3F, 9, 2, 1, 0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.15F, 0.0F, -0.5F, -0.15F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F); // Import
        gunModel[438].setRotationPoint(-9.5F, -28F, 6F);

        gunModel[439].addShapeBox(35F, 0F, -3F, 3, 2, 1, 0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.15F, 0.0F, -0.5F, -0.15F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.15F, 0.0F, -0.5F, -0.15F); // Import
        gunModel[439].setRotationPoint(-3.5F, -29F, 6F);

        gunModel[440].addShapeBox(35F, 0F, -3F, 3, 2, 1, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[440].setRotationPoint(10.5F, -30.5F, 6.25F);

        gunModel[441].addShapeBox(35F, 0F, -3F, 3, 2, 1, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[441].setRotationPoint(11.5F, -37.5F, 6.25F);

        gunModel[442].addShapeBox(35F, 0F, -3F, 2, 8, 1, 0F, -0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -1.5F, -0.5F, -0.5F, -1.5F, -0.5F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, 0.5F, -1.0F, -0.5F); // Import
        gunModel[442].setRotationPoint(11.5F, -37F, 7.75F);

        gunModel[443].addShapeBox(35F, 0F, -3F, 2, 2, 1, 0F, -0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.4F, -0.75F, 0.0F, 0.4F, -0.75F, 0.0F, 0.4F, -0.75F, 0.0F, -0.4F, -0.75F, 0.0F); // Import
        gunModel[443].setRotationPoint(11.5F, -37F, 6.75F);

        gunModel[444].addShapeBox(35F, 0F, -3F, 2, 2, 1, 0F, -0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.4F, -0.75F, 0.0F, 0.4F, -0.75F, 0.0F, 0.4F, -0.75F, 0.0F, -0.4F, -0.75F, 0.0F); // Import
        gunModel[444].setRotationPoint(10.6F, -30.25F, 6.75F);

        gunModel[445].addShapeBox(35F, 0F, -3F, 3, 2, 1, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[445].setRotationPoint(-32F, -34F, 6.25F);

        gunModel[446].addShapeBox(35F, 0F, -3F, 3, 2, 1, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[446].setRotationPoint(-31F, -41F, 6.25F);

        gunModel[447].addShapeBox(35F, 0F, -3F, 2, 8, 1, 0F, -0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -1.5F, -0.5F, -0.5F, -1.5F, -0.5F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, 0.5F, -1.0F, -0.5F); // Import
        gunModel[447].setRotationPoint(-31F, -40.5F, 7.75F);

        gunModel[448].addShapeBox(35F, 0F, -3F, 2, 2, 1, 0F, -0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.4F, -0.75F, 0.0F, 0.4F, -0.75F, 0.0F, 0.4F, -0.75F, 0.0F, -0.4F, -0.75F, 0.0F); // Import
        gunModel[448].setRotationPoint(-31F, -40.5F, 6.75F);

        gunModel[449].addShapeBox(35F, 0F, -3F, 2, 2, 1, 0F, -0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.4F, -0.75F, 0.0F, 0.4F, -0.75F, 0.0F, 0.4F, -0.75F, 0.0F, -0.4F, -0.75F, 0.0F); // Import
        gunModel[449].setRotationPoint(-31.9F, -33.75F, 6.75F);

        gunModel[450].addShapeBox(35F, 0F, -3F, 3, 2, 1, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[450].setRotationPoint(-31.5F, -34F, -1.25F);

        gunModel[451].addShapeBox(35F, 0F, -3F, 3, 2, 1, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[451].setRotationPoint(-30.5F, -41F, -1.25F);

        gunModel[452].addShapeBox(35F, 0F, -3F, 2, 8, 1, 0F, -0.5F, -1.5F, -0.5F, 0.5F, -1.5F, -0.5F, 0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); // Import
        gunModel[452].setRotationPoint(-30.5F, -40.5F, -2.75F);

        gunModel[453].addShapeBox(35F, 0F, -3F, 2, 2, 1, 0F, -0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.4F, -0.75F, 0.0F, 0.4F, -0.75F, 0.0F, 0.4F, -0.75F, 0.0F, -0.4F, -0.75F, 0.0F); // Import
        gunModel[453].setRotationPoint(-30.5F, -40.5F, -1.75F);

        gunModel[454].addShapeBox(35F, 0F, -3F, 2, 2, 1, 0F, -0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.4F, -0.75F, 0.0F, 0.4F, -0.75F, 0.0F, 0.4F, -0.75F, 0.0F, -0.4F, -0.75F, 0.0F); // Import
        gunModel[454].setRotationPoint(-31.4F, -33.75F, -1.75F);

        gunModel[455].addShapeBox(35F, 0F, -3F, 2, 3, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[455].setRotationPoint(15F, -33.5F, 6.25F);

        gunModel[456].addShapeBox(35F, 0F, -3F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[456].setRotationPoint(15F, -31.5F, 7.25F);

        gunModel[457].addShapeBox(35F, 0F, -3F, 2, 1, 1, 0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[457].setRotationPoint(15F, -31F, 6.75F);

        gunModel[458].addShapeBox(35F, 0F, -3F, 2, 1, 1, 0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[458].setRotationPoint(15F, -33.75F, 6.25F);

        gunModel[459].addShapeBox(35F, 0F, -3F, 8, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, -0.5F, -1.5F, 0.5F, -0.5F); // Import
        gunModel[459].setRotationPoint(-15.5F, -15.25F, 1.5F);

        gunModel[460].addShapeBox(35F, 0F, -3F, 6, 1, 1, 0F, -0.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F); // Import
        gunModel[460].setRotationPoint(-14.5F, -14.25F, 1.5F);

        gunModel[461].addShapeBox(35F, 0F, -3F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[461].setRotationPoint(-9F, -16.25F, 1.5F);

        gunModel[462].addShapeBox(35F, 0F, -3F, 8, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F); // Import
        gunModel[462].setRotationPoint(-15.5F, -15.25F, 3.5F);

        gunModel[463].addShapeBox(35F, 0F, -3F, 6, 1, 1, 0F, -0.5F, -0.5F, -0.5F, 1.5F, -0.5F, -0.5F, 1.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F); // Import
        gunModel[463].setRotationPoint(-14.5F, -14.25F, 3.5F);

        gunModel[464].addShapeBox(35F, 0F, -3F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[464].setRotationPoint(-9F, -16.25F, 3.5F);

        gunModel[465].addShapeBox(35F, 0F, -3F, 7, 1, 2, 0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F); // Import
        gunModel[465].setRotationPoint(-14.5F, -15.25F, 2F);

        gunModel[466].addShapeBox(35F, 0F, -3F, 2, 4, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[466].setRotationPoint(-87F, -29F, 1F);

        gunModel[467].addShapeBox(35F, 0F, -3F, 3, 1, 4, 0F, 0.0F, 0.25F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        gunModel[467].setRotationPoint(-87F, -31F, 1F);

        gunModel[468].addShapeBox(35F, 0F, -3F, 2, 1, 4, 0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[468].setRotationPoint(-87F, -30F, 1F);

        gunModel[469].addShapeBox(35F, 0F, -3F, 1, 4, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[469].setRotationPoint(-85F, -29F, 1F);

        gunModel[470].addShapeBox(35F, 0F, -3F, 1, 1, 4, 0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[470].setRotationPoint(-85F, -30F, 1F);

        gunModel[471].addShapeBox(35F, 0F, -3F, 1, 1, 4, 0F, -1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[471].setRotationPoint(-84.5F, -31F, 1F);

        gunModel[472].addShapeBox(35F, 0F, -3F, 1, 1, 4, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[472].setRotationPoint(-87F, -23F, 1F);

        gunModel[473].addShapeBox(35F, 0F, -3F, 1, 6, 4, 0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F); // Import
        gunModel[473].setRotationPoint(-86F, -22.5F, 1F);

        gunModel[474].addShapeBox(35F, 0F, -3F, 2, 1, 4, 0F, 0.0F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[474].setRotationPoint(-88F, -17F, 1F);

        gunModel[475].addShapeBox(35F, 0F, -3F, 1, 1, 4, 0F, -0.3F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.05F, -0.75F, 0.0F, -0.7F, -0.75F, 0.0F, -0.7F, -0.75F, 0.0F, -0.05F, -0.75F, 0.0F); // Import
        gunModel[475].setRotationPoint(-86.75F, -17.25F, 1F);

        gunModel[476].addShapeBox(35F, 0F, -3F, 1, 1, 4, 0F, -0.2F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.45F, -0.75F, 0.0F, -0.55F, -0.75F, 0.0F, -0.55F, -0.75F, 0.0F, -0.45F, -0.75F, 0.0F); // Import
        gunModel[476].setRotationPoint(-86.5F, -22F, 1F);

        gunModel[477].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.75F, -0.25F, -0.1F, -0.75F, -0.25F, -0.1F, -0.75F, -0.25F, -0.1F, -0.75F, -0.25F, -0.1F); // Import
        gunModel[477].setRotationPoint(-10.5F, -46F, 0F);

        gunModel[478].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F); // Import
        gunModel[478].setRotationPoint(-10.5F, -46.5F, 0F);

        gunModel[479].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, -0.75F, -0.25F, -0.1F, -0.75F, -0.25F, -0.1F, -0.75F, -0.25F, -0.1F, -0.75F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F); // Import
        gunModel[479].setRotationPoint(-10.5F, -47F, 0F);

        gunModel[480].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.75F, -0.25F, -0.1F, -0.75F, -0.25F, -0.1F, -0.75F, -0.25F, -0.1F, -0.75F, -0.25F, -0.1F); // Import
        gunModel[480].setRotationPoint(13.5F, -46F, 0F);

        gunModel[481].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F); // Import
        gunModel[481].setRotationPoint(13.5F, -46.5F, 0F);

        gunModel[482].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, -0.75F, -0.25F, -0.1F, -0.75F, -0.25F, -0.1F, -0.75F, -0.25F, -0.1F, -0.75F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F); // Import
        gunModel[482].setRotationPoint(13.5F, -47F, 0F);

        gunModel[483].addShapeBox(35F, 0F, -3F, 70, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F); // Import
        gunModel[483].setRotationPoint(20F, -36F, 1F);

        gunModel[484].addShapeBox(35F, 0F, -3F, 70, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[484].setRotationPoint(20F, -38F, 1F);

        gunModel[485].addShapeBox(35F, 0F, -3F, 70, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[485].setRotationPoint(20F, -38F, 4F);

        gunModel[486].addShapeBox(35F, 0F, -3F, 3, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import
        gunModel[486].setRotationPoint(33.5F, -42F, 9.5F);

        gunModel[487].addShapeBox(35F, 0F, -3F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import
        gunModel[487].setRotationPoint(38.5F, -42F, 9.5F);

        gunModel[488].addShapeBox(35F, 0F, -3F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import
        gunModel[488].setRotationPoint(42.5F, -42F, 9.5F);

        gunModel[489].addShapeBox(35F, 0F, -3F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import
        gunModel[489].setRotationPoint(46.5F, -42F, 9.5F);

        gunModel[490].addShapeBox(35F, 0F, -3F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import
        gunModel[490].setRotationPoint(50.5F, -42F, 9.5F);

        gunModel[491].addShapeBox(35F, 0F, -3F, 3, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import
        gunModel[491].setRotationPoint(54.5F, -42F, 9.5F);

        gunModel[492].addShapeBox(35F, 0F, -3F, 24, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import
        gunModel[492].setRotationPoint(33.5F, -42F, -3.5F);

        gunModel[493].addShapeBox(35F, 0F, -3F, 3, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[493].setRotationPoint(33.5F, -42F, -4.5F);

        gunModel[494].addShapeBox(35F, 0F, -3F, 2, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[494].setRotationPoint(38.5F, -42F, -4.5F);

        gunModel[495].addShapeBox(35F, 0F, -3F, 2, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[495].setRotationPoint(42.5F, -42F, -4.5F);

        gunModel[496].addShapeBox(35F, 0F, -3F, 2, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[496].setRotationPoint(46.5F, -42F, -4.5F);

        gunModel[497].addShapeBox(35F, 0F, -3F, 2, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[497].setRotationPoint(50.5F, -42F, -4.5F);

        gunModel[498].addShapeBox(35F, 0F, -3F, 3, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[498].setRotationPoint(54.5F, -42F, -4.5F);

        gunModel[499].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import
        gunModel[499].setRotationPoint(23.5F, -29.5F, 0F);
    }

    private void initgunModel_2() {
        gunModel[500] = new ModelRendererTurbo(this, 241, 225, textureX, textureY); // Import
        gunModel[501] = new ModelRendererTurbo(this, 457, 225, textureX, textureY); // Import
        gunModel[502] = new ModelRendererTurbo(this, 49, 233, textureX, textureY); // Import
        gunModel[503] = new ModelRendererTurbo(this, 465, 249, textureX, textureY); // Import
        gunModel[504] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Import
        gunModel[505] = new ModelRendererTurbo(this, 153, 257, textureX, textureY); // Import
        gunModel[506] = new ModelRendererTurbo(this, 201, 257, textureX, textureY); // Import
        gunModel[507] = new ModelRendererTurbo(this, 417, 257, textureX, textureY); // Import
        gunModel[508] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Import
        gunModel[509] = new ModelRendererTurbo(this, 465, 257, textureX, textureY); // Import
        gunModel[510] = new ModelRendererTurbo(this, 489, 257, textureX, textureY); // Import
        gunModel[511] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Import
        gunModel[512] = new ModelRendererTurbo(this, 25, 265, textureX, textureY); // Import
        gunModel[513] = new ModelRendererTurbo(this, 249, 265, textureX, textureY); // Import
        gunModel[514] = new ModelRendererTurbo(this, 417, 265, textureX, textureY); // Import
        gunModel[515] = new ModelRendererTurbo(this, 441, 265, textureX, textureY); // Import
        gunModel[516] = new ModelRendererTurbo(this, 465, 265, textureX, textureY); // Import
        gunModel[517] = new ModelRendererTurbo(this, 489, 265, textureX, textureY); // Import
        gunModel[518] = new ModelRendererTurbo(this, 441, 273, textureX, textureY); // Import
        gunModel[519] = new ModelRendererTurbo(this, 465, 273, textureX, textureY); // Import
        gunModel[520] = new ModelRendererTurbo(this, 489, 273, textureX, textureY); // Import
        gunModel[521] = new ModelRendererTurbo(this, 209, 281, textureX, textureY); // Import
        gunModel[522] = new ModelRendererTurbo(this, 233, 281, textureX, textureY); // Import
        gunModel[523] = new ModelRendererTurbo(this, 257, 281, textureX, textureY); // Import
        gunModel[524] = new ModelRendererTurbo(this, 281, 281, textureX, textureY); // Import
        gunModel[525] = new ModelRendererTurbo(this, 305, 281, textureX, textureY); // Import
        gunModel[526] = new ModelRendererTurbo(this, 329, 281, textureX, textureY); // Import
        gunModel[527] = new ModelRendererTurbo(this, 353, 281, textureX, textureY); // Import
        gunModel[528] = new ModelRendererTurbo(this, 377, 281, textureX, textureY); // Import
        gunModel[529] = new ModelRendererTurbo(this, 401, 281, textureX, textureY); // Import
        gunModel[530] = new ModelRendererTurbo(this, 425, 281, textureX, textureY); // Import
        gunModel[531] = new ModelRendererTurbo(this, 449, 281, textureX, textureY); // Import

        gunModel[500].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import
        gunModel[500].setRotationPoint(27.5F, -29.5F, 0F);

        gunModel[501].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import
        gunModel[501].setRotationPoint(31.5F, -29.5F, 0F);

        gunModel[502].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import
        gunModel[502].setRotationPoint(35.5F, -29.5F, 0F);

        gunModel[503].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import
        gunModel[503].setRotationPoint(39.5F, -29.5F, 0F);

        gunModel[504].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import
        gunModel[504].setRotationPoint(43.5F, -29.5F, 0F);

        gunModel[505].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import
        gunModel[505].setRotationPoint(47.5F, -29.5F, 0F);

        gunModel[506].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import
        gunModel[506].setRotationPoint(51.5F, -29.5F, 0F);

        gunModel[507].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import
        gunModel[507].setRotationPoint(55.5F, -29.5F, 0F);

        gunModel[508].addShapeBox(35F, 0F, -3F, 94, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import
        gunModel[508].setRotationPoint(-38.5F, -48F, 0F);

        gunModel[509].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[509].setRotationPoint(-34.5F, -49F, 0F);

        gunModel[510].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[510].setRotationPoint(-30.5F, -49F, 0F);

        gunModel[511].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[511].setRotationPoint(-26.5F, -49F, 0F);

        gunModel[512].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[512].setRotationPoint(-22.5F, -49F, 0F);

        gunModel[513].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[513].setRotationPoint(-18.5F, -49F, 0F);

        gunModel[514].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[514].setRotationPoint(-14.5F, -49F, 0F);

        gunModel[515].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[515].setRotationPoint(-10.5F, -49F, 0F);

        gunModel[516].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[516].setRotationPoint(-6.5F, -49F, 0F);

        gunModel[517].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[517].setRotationPoint(-2.5F, -49F, 0F);

        gunModel[518].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[518].setRotationPoint(1.5F, -49F, 0F);

        gunModel[519].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[519].setRotationPoint(5.5F, -49F, 0F);

        gunModel[520].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[520].setRotationPoint(9.5F, -49F, 0F);

        gunModel[521].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[521].setRotationPoint(13.5F, -49F, 0F);

        gunModel[522].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[522].setRotationPoint(17.5F, -49F, 0F);

        gunModel[523].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[523].setRotationPoint(21.5F, -49F, 0F);

        gunModel[524].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[524].setRotationPoint(25.5F, -49F, 0F);

        gunModel[525].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[525].setRotationPoint(29.5F, -49F, 0F);

        gunModel[526].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[526].setRotationPoint(33.5F, -49F, 0F);

        gunModel[527].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[527].setRotationPoint(37.5F, -49F, 0F);

        gunModel[528].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[528].setRotationPoint(41.5F, -49F, 0F);

        gunModel[529].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[529].setRotationPoint(45.5F, -49F, 0F);

        gunModel[530].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[530].setRotationPoint(49.5F, -49F, 0F);

        gunModel[531].addShapeBox(35F, 0F, -3F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[531].setRotationPoint(53.5F, -49F, 0F);
    }

    private void initdefaultScopeModel_1() {
        defaultScopeModel[0] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Import
        defaultScopeModel[1] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Import
        defaultScopeModel[2] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Import
        defaultScopeModel[3] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Import
        defaultScopeModel[4] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Import
        defaultScopeModel[5] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import
        defaultScopeModel[6] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Import
        defaultScopeModel[7] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Import
        defaultScopeModel[8] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Import
        defaultScopeModel[9] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Import
        defaultScopeModel[10] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Import
        defaultScopeModel[11] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Import
        defaultScopeModel[12] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Import
        defaultScopeModel[13] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Import
        defaultScopeModel[14] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Import
        defaultScopeModel[15] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Import
        defaultScopeModel[16] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Import
        defaultScopeModel[17] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Import
        defaultScopeModel[18] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Import
        defaultScopeModel[19] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Import
        defaultScopeModel[20] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Import
        defaultScopeModel[21] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Import
        defaultScopeModel[22] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Import
        defaultScopeModel[23] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Import
        defaultScopeModel[24] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Import
        defaultScopeModel[25] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Import
        defaultScopeModel[26] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Import
        defaultScopeModel[27] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Import
        defaultScopeModel[28] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Import
        defaultScopeModel[29] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Import
        defaultScopeModel[30] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Import
        defaultScopeModel[31] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Import
        defaultScopeModel[32] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Import
        defaultScopeModel[33] = new ModelRendererTurbo(this, 473, 281, textureX, textureY); // Import
        defaultScopeModel[34] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Import
        defaultScopeModel[35] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import
        defaultScopeModel[36] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Import
        defaultScopeModel[37] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Import
        defaultScopeModel[38] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // Import
        defaultScopeModel[39] = new ModelRendererTurbo(this, 25, 289, textureX, textureY); // Import
        defaultScopeModel[40] = new ModelRendererTurbo(this, 41, 289, textureX, textureY); // Import
        defaultScopeModel[41] = new ModelRendererTurbo(this, 57, 289, textureX, textureY); // Import
        defaultScopeModel[42] = new ModelRendererTurbo(this, 281, 185, textureX, textureY); // Import
        defaultScopeModel[43] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Import
        defaultScopeModel[44] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Import
        defaultScopeModel[45] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Import
        defaultScopeModel[46] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Import
        defaultScopeModel[47] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Import
        defaultScopeModel[48] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import
        defaultScopeModel[49] = new ModelRendererTurbo(this, 73, 289, textureX, textureY); // Import
        defaultScopeModel[50] = new ModelRendererTurbo(this, 97, 289, textureX, textureY); // Import
        defaultScopeModel[51] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Import
        defaultScopeModel[52] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Import
        defaultScopeModel[53] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Import
        defaultScopeModel[54] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Import
        defaultScopeModel[55] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Import
        defaultScopeModel[56] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Import
        defaultScopeModel[57] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Import
        defaultScopeModel[58] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Import
        defaultScopeModel[59] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Import
        defaultScopeModel[60] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Import
        defaultScopeModel[61] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Import
        defaultScopeModel[62] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Import
        defaultScopeModel[63] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Import
        defaultScopeModel[64] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Import
        defaultScopeModel[65] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Import
        defaultScopeModel[66] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Import
        defaultScopeModel[67] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import
        defaultScopeModel[68] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Import
        defaultScopeModel[69] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Import
        defaultScopeModel[70] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Import
        defaultScopeModel[71] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Import
        defaultScopeModel[72] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Import
        defaultScopeModel[73] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Import
        defaultScopeModel[74] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Import
        defaultScopeModel[75] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Import
        defaultScopeModel[76] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Import
        defaultScopeModel[77] = new ModelRendererTurbo(this, 377, 161, textureX, textureY); // Import
        defaultScopeModel[78] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Import
        defaultScopeModel[79] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Import
        defaultScopeModel[80] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Import
        defaultScopeModel[81] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Import
        defaultScopeModel[82] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Import
        defaultScopeModel[83] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Import
        defaultScopeModel[84] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Import
        defaultScopeModel[85] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Import
        defaultScopeModel[86] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Import
        defaultScopeModel[87] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Import
        defaultScopeModel[88] = new ModelRendererTurbo(this, 121, 289, textureX, textureY); // Import
        defaultScopeModel[89] = new ModelRendererTurbo(this, 145, 289, textureX, textureY); // Import
        defaultScopeModel[90] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import
        defaultScopeModel[91] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Import
        defaultScopeModel[92] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Import
        defaultScopeModel[93] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Import
        defaultScopeModel[94] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Import
        defaultScopeModel[95] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import
        defaultScopeModel[96] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Import
        defaultScopeModel[97] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Import
        defaultScopeModel[98] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Import
        defaultScopeModel[99] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Import
        defaultScopeModel[100] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Import
        defaultScopeModel[101] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Import
        defaultScopeModel[102] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Import
        defaultScopeModel[103] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Import
        defaultScopeModel[104] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Import
        defaultScopeModel[105] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Import
        defaultScopeModel[106] = new ModelRendererTurbo(this, 321, 153, textureX, textureY); // Import
        defaultScopeModel[107] = new ModelRendererTurbo(this, 393, 153, textureX, textureY); // Import
        defaultScopeModel[108] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Import
        defaultScopeModel[109] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Import
        defaultScopeModel[110] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Import
        defaultScopeModel[111] = new ModelRendererTurbo(this, 305, 161, textureX, textureY); // Import
        defaultScopeModel[112] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Import
        defaultScopeModel[113] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Import
        defaultScopeModel[114] = new ModelRendererTurbo(this, 377, 161, textureX, textureY); // Import
        defaultScopeModel[115] = new ModelRendererTurbo(this, 505, 161, textureX, textureY); // Import
        defaultScopeModel[116] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Import
        defaultScopeModel[117] = new ModelRendererTurbo(this, 313, 169, textureX, textureY); // Import

        defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F); // Import
        defaultScopeModel[0].setRotationPoint(3.5F, -50F, -4.2F);

        defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F); // Import
        defaultScopeModel[1].setRotationPoint(3F, -50F, -4.2F);

        defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F); // Import
        defaultScopeModel[2].setRotationPoint(4F, -50F, -4.2F);

        defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F); // Import
        defaultScopeModel[3].setRotationPoint(4F, -49F, -4F);

        defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F); // Import
        defaultScopeModel[4].setRotationPoint(4F, -51F, -4F);

        defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F); // Import
        defaultScopeModel[5].setRotationPoint(5F, -50.5F, -4F);

        defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F); // Import
        defaultScopeModel[6].setRotationPoint(4.25F, -49.5F, -4F);

        defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -0.25F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -1.25F, -0.5F, -0.75F, -1.25F, -0.5F, -0.75F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F); // Import
        defaultScopeModel[7].setRotationPoint(5.5F, -50F, -4F);

        defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -0.25F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, -0.5F, 0.5F, -1.25F, -0.5F, 0.5F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F); // Import
        defaultScopeModel[8].setRotationPoint(5.5F, -51.5F, -4F);

        defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F); // Import
        defaultScopeModel[9].setRotationPoint(5.5F, -50F, -4F);

        defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Import
        defaultScopeModel[10].setRotationPoint(3.5F, -50F, 2.2F);

        defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.75F, -0.5F); // Import
        defaultScopeModel[11].setRotationPoint(3F, -50F, 2.2F);

        defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.25F, -0.5F); // Import
        defaultScopeModel[12].setRotationPoint(4F, -50F, 2.2F);

        defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F); // Import
        defaultScopeModel[13].setRotationPoint(4F, -49F, 2F);

        defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.75F, -0.5F); // Import
        defaultScopeModel[14].setRotationPoint(4F, -51F, 2F);

        defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F); // Import
        defaultScopeModel[15].setRotationPoint(5F, -50.5F, 2F);

        defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F); // Import
        defaultScopeModel[16].setRotationPoint(4.25F, -49.5F, 2F);

        defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -0.25F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -1.25F, 0.0F, -0.75F, -1.25F, 0.0F, -0.75F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F); // Import
        defaultScopeModel[17].setRotationPoint(5.5F, -50F, 2F);

        defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -0.25F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F); // Import
        defaultScopeModel[18].setRotationPoint(5.5F, -51.5F, 2F);

        defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Import
        defaultScopeModel[19].setRotationPoint(5.5F, -50F, 2F);

        defaultScopeModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, -0.25F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F); // Import
        defaultScopeModel[20].setRotationPoint(5.5F, -51.5F, -2F);

        defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -1.0F, -0.25F, -0.5F, -1.0F); // Import
        defaultScopeModel[21].setRotationPoint(5.5F, -50F, -2F);

        defaultScopeModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F, 0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.5F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F); // Import
        defaultScopeModel[22].setRotationPoint(5.5F, -50F, 1F);

        defaultScopeModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F, -0.35F, 0.0F, -1.25F, -0.35F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.15F); // Import
        defaultScopeModel[23].setRotationPoint(4.5F, -51.75F, 1.5F);

        defaultScopeModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F); // Import
        defaultScopeModel[24].setRotationPoint(5F, -50.5F, -2F);

        defaultScopeModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.5F); // Import
        defaultScopeModel[25].setRotationPoint(2.5F, -50F, 1.5F);

        defaultScopeModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F); // Import
        defaultScopeModel[26].setRotationPoint(2.5F, -50F, -3.5F);

        defaultScopeModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0.0F, -1.25F, -0.15F, -1.0F, -1.25F, -0.15F, -1.0F, -1.25F, -0.15F, 0.0F, -1.25F, -0.15F, 0.0F, -1.25F, -0.15F, 0.0F, -1.25F, -0.15F, 0.0F, -1.25F, -0.15F, 0.0F, -1.25F, -0.15F); // Import
        defaultScopeModel[27].setRotationPoint(4.5F, -51.75F, -1.5F);

        defaultScopeModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F); // Import
        defaultScopeModel[28].setRotationPoint(4.5F, -50F, -1.5F);

        defaultScopeModel[29].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, -0.35F, 0.0F, -1.0F, -0.25F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.15F, 0.0F, -1.25F, 0.5F); // Import
        defaultScopeModel[29].setRotationPoint(2.5F, -51.75F, 1.5F);

        defaultScopeModel[30].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F); // Import
        defaultScopeModel[30].setRotationPoint(2.5F, -51.75F, -1.5F);

        defaultScopeModel[31].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.25F, -0.35F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.15F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F); // Import
        defaultScopeModel[31].setRotationPoint(2.5F, -51.75F, -3.5F);

        defaultScopeModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0.0F, -1.25F, -0.35F, -1.0F, -1.25F, -0.35F, -1.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.15F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F); // Import
        defaultScopeModel[32].setRotationPoint(4.5F, -51.75F, -3.5F);

        defaultScopeModel[33].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F, -0.75F, 0.25F, 0.0F, 1.5F, 0.25F, 0.0F, 1.5F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F); // Import
        defaultScopeModel[33].setRotationPoint(0.25F, -49.5F, -3.5F);

        defaultScopeModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.5F, 0.5F, -1.25F, 0.5F); // Import
        defaultScopeModel[34].setRotationPoint(1.5F, -51.75F, 1.5F);

        defaultScopeModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0.5F, -0.75F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F); // Import
        defaultScopeModel[35].setRotationPoint(1.5F, -51.75F, -3.5F);

        defaultScopeModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0.5F, -0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.5F, -1.25F, 0.5F); // Import
        defaultScopeModel[36].setRotationPoint(1.5F, -51.75F, -1F);

        defaultScopeModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F); // Import
        defaultScopeModel[37].setRotationPoint(0.5F, -50F, -3.5F);

        defaultScopeModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.3F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.3F, 0.05F, 0.5F, -0.3F, -0.55F, 0.5F, -0.25F, -0.55F, 0.5F, -0.25F, -0.55F, 0.5F, -0.3F, -0.55F, 0.5F); // Import
        defaultScopeModel[38].setRotationPoint(-0.5F, -49.5F, -3F);

        defaultScopeModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, -0.55F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -0.55F, 0.5F); // Import
        defaultScopeModel[39].setRotationPoint(0F, -50.5F, -3F);

        defaultScopeModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, -0.25F, -0.45F, 0.5F, -0.25F, -0.45F, 0.5F, -0.25F, -0.45F, 0.5F, -0.25F, -0.45F, 0.5F, -0.25F, -0.55F, 0.5F, -0.25F, -0.55F, 0.5F, -0.25F, -0.55F, 0.5F, -0.25F, -0.55F, 0.5F); // Import
        defaultScopeModel[40].setRotationPoint(-1F, -51F, -3F);

        defaultScopeModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F); // Import
        defaultScopeModel[41].setRotationPoint(-0.5F, -50.5F, -3F);

        defaultScopeModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, -0.7F, 0.5F, -0.25F, -0.7F, 0.5F, -0.25F, -0.7F, 0.5F, -0.5F, -0.7F, 0.5F, -0.5F, 0.7F, 0.5F, -0.25F, 0.2F, 0.5F, -0.25F, 0.2F, 0.5F, -0.5F, 0.7F, 0.5F); // Import
        defaultScopeModel[42].setRotationPoint(0.25F, -51.25F, -3F);

        defaultScopeModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.05F, 0.5F, -0.3F, 0.05F, 0.5F, -0.3F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.25F, -0.3F, 0.5F); // Import
        defaultScopeModel[43].setRotationPoint(-1.5F, -49.5F, -3F);

        defaultScopeModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F); // Import
        defaultScopeModel[44].setRotationPoint(-1.5F, -50.5F, -3F);

        defaultScopeModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.2F, 0.05F, 0.5F, -0.2F, -1.05F, 0.5F, -0.25F, -0.55F, 0.5F, -0.25F, -0.55F, 0.5F, -0.2F, -1.05F, 0.5F); // Import
        defaultScopeModel[45].setRotationPoint(-2F, -49.25F, -3F);

        defaultScopeModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.2F, 0.05F, 0.5F, -0.2F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.2F, -0.8F, 0.5F); // Import
        defaultScopeModel[46].setRotationPoint(-2F, -49.5F, -3F);

        defaultScopeModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.5F, 0.05F, 0.5F, -0.2F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.2F, -0.8F, 0.5F); // Import
        defaultScopeModel[47].setRotationPoint(-2F, -49.75F, -3F);

        defaultScopeModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.55F, 0.5F, -0.25F, 0.55F, 0.5F, -0.25F, 0.55F, 0.5F, -0.5F, 0.55F, 0.5F, -0.5F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F); // Import
        defaultScopeModel[48].setRotationPoint(-2F, -50F, -3F);

        defaultScopeModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, -0.5F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, -0.8F, 0.5F, 0.25F, -0.8F, 0.5F, 0.25F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F); // Import
        defaultScopeModel[49].setRotationPoint(-1.25F, -51.75F, -3F);

        defaultScopeModel[50].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, -0.45F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, -0.45F, 0.5F, 0.5F, -0.45F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, -0.45F, -0.5F, 0.5F); // Import
        defaultScopeModel[50].setRotationPoint(-2.25F, -53.75F, -2.5F);

        defaultScopeModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Import
        defaultScopeModel[51].setRotationPoint(-2.3F, -52.75F, -3.5F);

        defaultScopeModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Import
        defaultScopeModel[52].setRotationPoint(-1.8F, -52.75F, -3.5F);

        defaultScopeModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F); // Import
        defaultScopeModel[53].setRotationPoint(0.5F, -52.75F, -3.5F);

        defaultScopeModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F); // Import
        defaultScopeModel[54].setRotationPoint(0F, -52.75F, -3.5F);

        defaultScopeModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Import
        defaultScopeModel[55].setRotationPoint(-2.3F, -52.75F, 3F);

        defaultScopeModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Import
        defaultScopeModel[56].setRotationPoint(-1.8F, -52.75F, 3F);

        defaultScopeModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F); // Import
        defaultScopeModel[57].setRotationPoint(0.5F, -52.75F, 3F);

        defaultScopeModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F); // Import
        defaultScopeModel[58].setRotationPoint(0F, -52.75F, 3F);

        defaultScopeModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, -0.2F, -0.8F, 0.5F, -0.5F, 0.05F, 0.5F, -0.5F, 0.05F, 0.5F, -0.5F, 0.05F, 0.5F, -0.5F, 0.05F, 0.5F); // Import
        defaultScopeModel[59].setRotationPoint(-2F, -51.5F, -3F);

        defaultScopeModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.2F, -0.75F, 0.5F, -0.2F, 0.3F, 0.5F, -0.5F, 0.3F, 0.5F, -0.5F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F); // Import
        defaultScopeModel[60].setRotationPoint(-2F, -53F, -3F);

        defaultScopeModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.05F, 0.5F, -0.3F, 0.05F, 0.5F, -0.3F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.25F, -0.3F, 0.5F); // Import
        defaultScopeModel[61].setRotationPoint(-1.5F, -49.5F, 2F);

        defaultScopeModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F, -0.25F, -1.05F, 0.5F); // Import
        defaultScopeModel[62].setRotationPoint(-1.5F, -50.5F, 2F);

        defaultScopeModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.2F, 0.05F, 0.5F, -0.2F, -1.05F, 0.5F, -0.25F, -0.55F, 0.5F, -0.25F, -0.55F, 0.5F, -0.2F, -1.05F, 0.5F); // Import
        defaultScopeModel[63].setRotationPoint(-2F, -49.25F, 2F);

        defaultScopeModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.2F, 0.05F, 0.5F, -0.2F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.2F, -0.8F, 0.5F); // Import
        defaultScopeModel[64].setRotationPoint(-2F, -49.5F, 2F);

        defaultScopeModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.25F, 0.05F, 0.5F, -0.5F, 0.05F, 0.5F, -0.2F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.2F, -0.8F, 0.5F); // Import
        defaultScopeModel[65].setRotationPoint(-2F, -49.75F, 2F);

        defaultScopeModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.55F, 0.5F, -0.25F, 0.55F, 0.5F, -0.25F, 0.55F, 0.5F, -0.5F, 0.55F, 0.5F, -0.5F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F); // Import
        defaultScopeModel[66].setRotationPoint(-2F, -50F, 2F);

        defaultScopeModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, -0.2F, -0.8F, 0.5F, -0.5F, 0.05F, 0.5F, -0.5F, 0.05F, 0.5F, -0.5F, 0.05F, 0.5F, -0.5F, 0.05F, 0.5F); // Import
        defaultScopeModel[67].setRotationPoint(-2F, -51.5F, 2F);

        defaultScopeModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.2F, -0.75F, 0.5F, -0.2F, 0.3F, 0.5F, -0.5F, 0.3F, 0.5F, -0.5F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F); // Import
        defaultScopeModel[68].setRotationPoint(-2F, -53F, 2F);

        defaultScopeModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.5F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, 0.45F, 0.5F, -0.75F, 0.45F, 0.5F, -0.75F, 0.45F, 0.5F, -0.5F, 0.45F, 0.5F); // Import
        defaultScopeModel[69].setRotationPoint(-2F, -53F, 2F);

        defaultScopeModel[70].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.5F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, 0.45F, 0.5F, -0.75F, 0.45F, 0.5F, -0.75F, 0.45F, 0.5F, -0.5F, 0.45F, 0.5F); // Import
        defaultScopeModel[70].setRotationPoint(-2F, -53F, -3F);

        defaultScopeModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, 0.0F, -0.2F, -0.75F, 0.0F, -0.2F, 0.2F, -0.5F, -0.75F, 0.2F, -0.5F, -0.75F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F); // Import
        defaultScopeModel[71].setRotationPoint(-2F, -53F, -2F);

        defaultScopeModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.5F, -0.2F, -0.75F, -0.5F, -0.2F, 0.2F, -0.5F, -0.75F, 0.2F, -0.5F, -0.75F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F); // Import
        defaultScopeModel[72].setRotationPoint(-2F, -53F, 1F);

        defaultScopeModel[73].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.95F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, -0.25F, -0.95F, 0.5F, -0.25F, -0.45F, -0.75F, 0.5F, 0.25F, -0.75F, 0.5F, 0.25F, -0.75F, -0.25F, -0.45F, -0.75F, -0.25F); // Import
        defaultScopeModel[73].setRotationPoint(-2.25F, -55.5F, -2.5F);

        defaultScopeModel[74].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1.25F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, -0.95F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.95F, 0.0F, 0.25F); // Import
        defaultScopeModel[74].setRotationPoint(-2.25F, -57F, -3F);

        defaultScopeModel[75].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.95F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, -0.25F, -0.95F, 0.5F, -0.25F, -0.45F, -0.75F, 0.5F, 0.25F, -0.75F, 0.5F, 0.25F, -0.75F, -0.25F, -0.45F, -0.75F, -0.25F); // Import
        defaultScopeModel[75].setRotationPoint(-2.25F, -55.5F, 2.25F);

        defaultScopeModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1.25F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, -0.95F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.95F, 0.0F, 0.25F); // Import
        defaultScopeModel[76].setRotationPoint(-2.25F, -57F, 1.75F);

        defaultScopeModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, -0.75F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F); // Import
        defaultScopeModel[77].setRotationPoint(-2.5F, -49.5F, -2.5F);

        defaultScopeModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import
        defaultScopeModel[78].setRotationPoint(-0.75F, -55.25F, -2.75F);

        defaultScopeModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.0F, 0F, 0F, 0.0F, 0F, 0F, 0.0F, 0F, 0F, 0.0F, 0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F); // Import
        defaultScopeModel[79].setRotationPoint(-0.75F, -55.25F, -1F);

        defaultScopeModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, -0.75F, 0F, 0.0F, -0.75F, 0F, 0.0F, -0.75F, 0F, 0.0F, -0.75F, 0F); // Import
        defaultScopeModel[80].setRotationPoint(-0.75F, -56.75F, -1F);

        defaultScopeModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -1.35F, 0.0F, 0.25F, -1.35F, 0.0F, 0F, -0.25F, 0.0F, 0F, -0.25F, 0.0F, 0F, -1.35F, 0.0F, 0F, -1.35F); // Import
        defaultScopeModel[81].setRotationPoint(-0.75F, -56.25F, -1.25F);

        defaultScopeModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.0F, 0.25F, -0.1F, 0.0F, 0.25F, -0.1F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0F, -0.1F, 0.0F, 0F, -0.1F, 0.0F, 0F, -1.5F, 0.0F, 0F, -1.5F); // Import
        defaultScopeModel[82].setRotationPoint(-0.75F, -56.25F, 0.5F);

        defaultScopeModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, 0F, 0.0F, -0.75F, 0F, 0.0F, -0.75F, 0F, 0.0F, -0.75F, 0F); // Import
        defaultScopeModel[83].setRotationPoint(-0.75F, -57F, -1F);

        defaultScopeModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.7F, -0.5F, 0.0F, -0.7F, -0.5F, 0.0F, -0.8F, -1.5F, 0.0F, -0.8F, -1.5F); // Import
        defaultScopeModel[84].setRotationPoint(-0.75F, -56.5F, 0.100000000000001F);

        defaultScopeModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.0F, -0.7F, -0.5F, 0.0F, -0.7F, -0.5F, 0.0F, -0.8F, -1.5F, 0.0F, -0.8F, -1.5F, 0.0F, 0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        defaultScopeModel[85].setRotationPoint(-0.75F, -56.25F, 0.100000000000001F);

        defaultScopeModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.0F, -0.8F, -1.5F, 0.0F, -0.8F, -1.5F, 0.0F, -0.7F, -0.5F, 0.0F, -0.7F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F); // Import
        defaultScopeModel[86].setRotationPoint(-0.75F, -56.25F, -2.1F);

        defaultScopeModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, -0.8F, -1.5F, 0.0F, -0.8F, -1.5F, 0.0F, -0.7F, -0.5F, 0.0F, -0.7F, -0.5F); // Import
        defaultScopeModel[87].setRotationPoint(-0.75F, -56.5F, -2.1F);

        defaultScopeModel[88].addShapeBox(0F, 0F, 0F, 3, 5, 6, 0F, -0.5F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, -0.8F, 0.5F, 0.25F, -0.8F, 0.5F, 0.25F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F); // Import
        defaultScopeModel[88].setRotationPoint(84.75F, -51.75F, -3F);

        defaultScopeModel[89].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, -0.45F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, -0.45F, 0.5F, 0.5F, -0.45F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, -0.45F, -0.5F, 0.5F); // Import
        defaultScopeModel[89].setRotationPoint(84.75F, -53.75F, -2.5F);

        defaultScopeModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Import
        defaultScopeModel[90].setRotationPoint(84.7F, -52.75F, -3.5F);

        defaultScopeModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Import
        defaultScopeModel[91].setRotationPoint(85.2F, -52.75F, -3.5F);

        defaultScopeModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F); // Import
        defaultScopeModel[92].setRotationPoint(87.5F, -52.75F, -3.5F);

        defaultScopeModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F); // Import
        defaultScopeModel[93].setRotationPoint(87F, -52.75F, -3.5F);

        defaultScopeModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Import
        defaultScopeModel[94].setRotationPoint(84.7F, -52.75F, 3F);

        defaultScopeModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Import
        defaultScopeModel[95].setRotationPoint(85.2F, -52.75F, 3F);

        defaultScopeModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F); // Import
        defaultScopeModel[96].setRotationPoint(87.5F, -52.75F, 3F);

        defaultScopeModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F); // Import
        defaultScopeModel[97].setRotationPoint(87F, -52.75F, 3F);

        defaultScopeModel[98].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.95F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, -0.25F, -0.95F, 0.5F, -0.25F, -0.45F, -0.75F, 0.5F, 0.25F, -0.75F, 0.5F, 0.25F, -0.75F, -0.25F, -0.45F, -0.75F, -0.25F); // Import
        defaultScopeModel[98].setRotationPoint(84.75F, -55.5F, -2.5F);

        defaultScopeModel[99].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1.25F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, -0.95F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.95F, 0.0F, 0.25F); // Import
        defaultScopeModel[99].setRotationPoint(84.75F, -57F, -3F);

        defaultScopeModel[100].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.95F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, -0.25F, -0.95F, 0.5F, -0.25F, -0.45F, -0.75F, 0.5F, 0.25F, -0.75F, 0.5F, 0.25F, -0.75F, -0.25F, -0.45F, -0.75F, -0.25F); // Import
        defaultScopeModel[100].setRotationPoint(84.75F, -55.5F, 2.25F);

        defaultScopeModel[101].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1.25F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, -0.95F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.95F, 0.0F, 0.25F); // Import
        defaultScopeModel[101].setRotationPoint(84.75F, -57F, 1.75F);

        defaultScopeModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.75F, 0.0F, -0.75F); // Import
        defaultScopeModel[102].setRotationPoint(-1.5F, -53.5F, 3F);

        defaultScopeModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        defaultScopeModel[103].setRotationPoint(-0.75F, -53.5F, 3F);

        defaultScopeModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        defaultScopeModel[104].setRotationPoint(0F, -53.5F, 3F);

        defaultScopeModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F); // Import
        defaultScopeModel[105].setRotationPoint(-1.5F, -54.25F, 3F);

        defaultScopeModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F); // Import
        defaultScopeModel[106].setRotationPoint(0F, -54.75F, 3F);

        defaultScopeModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        defaultScopeModel[107].setRotationPoint(-0.75F, -55F, 3F);

        defaultScopeModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import
        defaultScopeModel[108].setRotationPoint(-1.5F, -54.75F, 3F);

        defaultScopeModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[109].setRotationPoint(-1.5F, -54.25F, -4F);

        defaultScopeModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        defaultScopeModel[110].setRotationPoint(-1.5F, -54.75F, -4F);

        defaultScopeModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[111].setRotationPoint(-0.75F, -55F, -4F);

        defaultScopeModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        defaultScopeModel[112].setRotationPoint(0F, -54.75F, -4F);

        defaultScopeModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F); // Import
        defaultScopeModel[113].setRotationPoint(-1.5F, -53.5F, -4F);

        defaultScopeModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[114].setRotationPoint(-0.75F, -53.5F, -4F);

        defaultScopeModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[115].setRotationPoint(0F, -53.5F, -4F);

        defaultScopeModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        defaultScopeModel[116].setRotationPoint(86.25F, -56.25F, -0.5F);

        defaultScopeModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[117].setRotationPoint(86F, -55.25F, -0.5F);
    }

    private void initdefaultGripModel_1() {
        defaultGripModel[0] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Import
        defaultGripModel[1] = new ModelRendererTurbo(this, 65, 225, textureX, textureY); // Import
        defaultGripModel[2] = new ModelRendererTurbo(this, 265, 225, textureX, textureY); // Import
        defaultGripModel[3] = new ModelRendererTurbo(this, 473, 217, textureX, textureY); // Import
        defaultGripModel[4] = new ModelRendererTurbo(this, 97, 225, textureX, textureY); // Import
        defaultGripModel[5] = new ModelRendererTurbo(this, 337, 225, textureX, textureY); // Import
        defaultGripModel[6] = new ModelRendererTurbo(this, 401, 225, textureX, textureY); // Import
        defaultGripModel[7] = new ModelRendererTurbo(this, 121, 225, textureX, textureY); // Import
        defaultGripModel[8] = new ModelRendererTurbo(this, 169, 225, textureX, textureY); // Import
        defaultGripModel[9] = new ModelRendererTurbo(this, 217, 225, textureX, textureY); // Import
        defaultGripModel[10] = new ModelRendererTurbo(this, 25, 233, textureX, textureY); // Import
        defaultGripModel[11] = new ModelRendererTurbo(this, 137, 233, textureX, textureY); // Import
        defaultGripModel[12] = new ModelRendererTurbo(this, 185, 233, textureX, textureY); // Import
        defaultGripModel[13] = new ModelRendererTurbo(this, 241, 233, textureX, textureY); // Import
        defaultGripModel[14] = new ModelRendererTurbo(this, 457, 233, textureX, textureY); // Import
        defaultGripModel[15] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Import
        defaultGripModel[16] = new ModelRendererTurbo(this, 49, 241, textureX, textureY); // Import
        defaultGripModel[17] = new ModelRendererTurbo(this, 81, 241, textureX, textureY); // Import
        defaultGripModel[18] = new ModelRendererTurbo(this, 113, 241, textureX, textureY); // Import
        defaultGripModel[19] = new ModelRendererTurbo(this, 161, 241, textureX, textureY); // Import
        defaultGripModel[20] = new ModelRendererTurbo(this, 209, 241, textureX, textureY); // Import

        defaultGripModel[0].addShapeBox(35F, 0F, -3F, 4, 5, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultGripModel[0].setRotationPoint(19.5F, -30.5F, -1F);

        defaultGripModel[1].addShapeBox(35F, 0F, -3F, 4, 2, 8, 0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        defaultGripModel[1].setRotationPoint(19.5F, -26.5F, -1F);

        defaultGripModel[2].addShapeBox(35F, 0F, -3F, 26, 1, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        defaultGripModel[2].setRotationPoint(20.5F, -31.5F, -1F);

        defaultGripModel[3].addShapeBox(35F, 0F, -3F, 2, 3, 8, 0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultGripModel[3].setRotationPoint(46.5F, -31.5F, -1F);

        defaultGripModel[4].addShapeBox(35F, 0F, -3F, 1, 1, 8, 0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        defaultGripModel[4].setRotationPoint(46.5F, -28.5F, -1F);

        defaultGripModel[5].addShapeBox(35F, 0F, -3F, 23, 3, 8, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.5F, -0.5F); // Import
        defaultGripModel[5].setRotationPoint(23.5F, -30.5F, -1F);

        defaultGripModel[6].addShapeBox(35F, 0F, -3F, 23, 1, 8, 0F, 0.0F, -0.5F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.5F, -1.5F); // Import
        defaultGripModel[6].setRotationPoint(23.5F, -27.5F, -1F);

        defaultGripModel[7].addShapeBox(35F, 0F, -3F, 1, 1, 8, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F); // Import
        defaultGripModel[7].setRotationPoint(45.5F, -30.5F, -1F);

        defaultGripModel[8].addShapeBox(35F, 0F, -3F, 1, 1, 8, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        defaultGripModel[8].setRotationPoint(23.5F, -30.5F, -1F);

        defaultGripModel[9].addShapeBox(35F, 0F, -3F, 4, 3, 8, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultGripModel[9].setRotationPoint(24.5F, -29.75F, -1F);

        defaultGripModel[10].addShapeBox(35F, 0F, -3F, 4, 1, 8, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.5F, -1.0F); // Import
        defaultGripModel[10].setRotationPoint(24.5F, -26.5F, -1F);

        defaultGripModel[11].addShapeBox(35F, 0F, -3F, 4, 3, 8, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        defaultGripModel[11].setRotationPoint(30F, -29.75F, -1F);

        defaultGripModel[12].addShapeBox(35F, 0F, -3F, 4, 1, 8, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.5F, -1.0F); // Import
        defaultGripModel[12].setRotationPoint(30F, -26.75F, -1F);

        defaultGripModel[13].addShapeBox(35F, 0F, -3F, 4, 3, 8, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        defaultGripModel[13].setRotationPoint(35.5F, -29.75F, -1F);

        defaultGripModel[14].addShapeBox(35F, 0F, -3F, 4, 1, 8, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.5F, -1.0F); // Import
        defaultGripModel[14].setRotationPoint(35.5F, -27F, -1F);

        defaultGripModel[15].addShapeBox(35F, 0F, -3F, 4, 3, 8, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F); // Import
        defaultGripModel[15].setRotationPoint(41F, -29.75F, -1F);

        defaultGripModel[16].addShapeBox(35F, 0F, -3F, 4, 1, 8, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.5F, -1.0F); // Import
        defaultGripModel[16].setRotationPoint(41F, -27.25F, -1F);

        defaultGripModel[17].addShapeBox(35F, 0F, -3F, 4, 1, 8, 0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        defaultGripModel[17].setRotationPoint(41F, -30F, -1F);

        defaultGripModel[18].addShapeBox(35F, 0F, -3F, 4, 1, 8, 0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        defaultGripModel[18].setRotationPoint(35.5F, -30F, -1F);

        defaultGripModel[19].addShapeBox(35F, 0F, -3F, 4, 1, 8, 0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        defaultGripModel[19].setRotationPoint(30F, -30F, -1F);

        defaultGripModel[20].addShapeBox(35F, 0F, -3F, 4, 1, 8, 0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        defaultGripModel[20].setRotationPoint(24.5F, -30F, -1F);
    }

    private void initammoModel_1() {
        ammoModel[0] = new ModelRendererTurbo(this, 489, 225, textureX, textureY); // Import
        ammoModel[1] = new ModelRendererTurbo(this, 265, 241, textureX, textureY); // Import
        ammoModel[2] = new ModelRendererTurbo(this, 289, 241, textureX, textureY); // Import
        ammoModel[3] = new ModelRendererTurbo(this, 313, 241, textureX, textureY); // Import
        ammoModel[4] = new ModelRendererTurbo(this, 337, 241, textureX, textureY); // Import
        ammoModel[5] = new ModelRendererTurbo(this, 361, 241, textureX, textureY); // Import
        ammoModel[6] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Import
        ammoModel[7] = new ModelRendererTurbo(this, 409, 241, textureX, textureY); // Import
        ammoModel[8] = new ModelRendererTurbo(this, 433, 241, textureX, textureY); // Import
        ammoModel[9] = new ModelRendererTurbo(this, 481, 241, textureX, textureY); // Import
        ammoModel[10] = new ModelRendererTurbo(this, 25, 249, textureX, textureY); // Import
        ammoModel[11] = new ModelRendererTurbo(this, 137, 249, textureX, textureY); // Import
        ammoModel[12] = new ModelRendererTurbo(this, 185, 249, textureX, textureY); // Import
        ammoModel[13] = new ModelRendererTurbo(this, 233, 249, textureX, textureY); // Import
        ammoModel[14] = new ModelRendererTurbo(this, 249, 249, textureX, textureY); // Import
        ammoModel[15] = new ModelRendererTurbo(this, 449, 249, textureX, textureY); // Import
        ammoModel[16] = new ModelRendererTurbo(this, 49, 257, textureX, textureY); // Import
        ammoModel[17] = new ModelRendererTurbo(this, 89, 257, textureX, textureY); // Import
        ammoModel[18] = new ModelRendererTurbo(this, 265, 257, textureX, textureY); // Import
        ammoModel[19] = new ModelRendererTurbo(this, 305, 257, textureX, textureY); // Import

        ammoModel[0].addShapeBox(35F, 0F, -3F, 3, 6, 6, 0F, 0.0F, 3F, 0.0F, 0.0F, 3F, 0.0F, 0.0F, 3F, 0.0F, 0.0F, 3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        ammoModel[0].setRotationPoint(5.5F, -22F, 0F);

        ammoModel[1].addShapeBox(35F, 0F, -3F, 3, 6, 6, 0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F); // Import
        ammoModel[1].setRotationPoint(5F, -16F, 0F);

        ammoModel[2].addShapeBox(35F, 0F, -3F, 3, 6, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F); // Import
        ammoModel[2].setRotationPoint(6.5F, -10F, 0F);

        ammoModel[3].addShapeBox(35F, 0F, -3F, 3, 6, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.25F, 0.0F, 2.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, -2.25F, 0.25F, 0.0F); // Import
        ammoModel[3].setRotationPoint(8.25F, -4F, 0F);

        ammoModel[4].addShapeBox(35F, 0F, -3F, 4, 6, 6, 0F, 0.0F, 3F, 0.0F, 0.0F, 3F, 0.0F, 0.0F, 3F, 0.0F, 0.0F, 3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        ammoModel[4].setRotationPoint(0.5F, -22F, 0F);

        ammoModel[5].addShapeBox(35F, 0F, -3F, 4, 6, 6, 0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F); // Import
        ammoModel[5].setRotationPoint(0F, -16F, 0F);

        ammoModel[6].addShapeBox(35F, 0F, -3F, 4, 6, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F); // Import
        ammoModel[6].setRotationPoint(1.5F, -10F, 0F);

        ammoModel[7].addShapeBox(35F, 0F, -3F, 4, 6, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.75F, 1.5F, 0.0F, 2.0F, 0.5F, 0.0F, 2.0F, 0.5F, 0.0F, -2.75F, 1.5F, 0.0F); // Import
        ammoModel[7].setRotationPoint(3.25F, -4F, 0F);

        ammoModel[8].addShapeBox(35F, 0F, -3F, 3, 6, 6, 0F, 0.0F, 3F, 0.0F, 0.0F, 3F, 0.0F, 0.0F, 3F, 0.0F, 0.0F, 3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        ammoModel[8].setRotationPoint(-3.25F, -22F, 0F);

        ammoModel[9].addShapeBox(35F, 0F, -3F, 3, 6, 6, 0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F); // Import
        ammoModel[9].setRotationPoint(-3.75F, -16F, 0F);

        ammoModel[10].addShapeBox(35F, 0F, -3F, 3, 6, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F); // Import
        ammoModel[10].setRotationPoint(-2.25F, -10F, 0F);

        ammoModel[11].addShapeBox(35F, 0F, -3F, 3, 7, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 1.5F, 0.0F, 2.75F, 0.75F, 0.0F, 2.75F, 0.75F, 0.0F, -3.0F, 1.5F, 0.0F); // Import
        ammoModel[11].setRotationPoint(-0.5F, -4F, 0F);

        ammoModel[12].addShapeBox(35F, 0F, -3F, 1, 6, 6, 0F, 0.0F, 3F, 0.0F, 0.0F, 3F, 0.0F, 0.0F, 3F, 0.0F, 0.0F, 3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        ammoModel[12].setRotationPoint(-5F, -22F, 0F);

        ammoModel[13].addShapeBox(35F, 0F, -3F, 1, 6, 6, 0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F); // Import
        ammoModel[13].setRotationPoint(-5.5F, -16F, 0F);

        ammoModel[14].addShapeBox(35F, 0F, -3F, 1, 6, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F); // Import
        ammoModel[14].setRotationPoint(-4F, -10F, 0F);

        ammoModel[15].addShapeBox(35F, 0F, -3F, 1, 7, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 2.0F, 0.0F, 3.0F, 1.75F, 0.0F, 3.0F, 1.75F, 0.0F, -3.0F, 2.0F, 0.0F); // Import
        ammoModel[15].setRotationPoint(-2.25F, -4F, 0F);

        ammoModel[16].addShapeBox(35F, 0F, -3F, 12, 6, 4, 0F, 0.0F, 3F, 0.0F, 0.0F, 3F, 0.0F, 0.0F, 3F, 0.0F, 0.0F, 3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        ammoModel[16].setRotationPoint(-6F, -22F, 1F);

        ammoModel[17].addShapeBox(35F, 0F, -3F, 12, 6, 4, 0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F); // Import
        ammoModel[17].setRotationPoint(-6.5F, -16F, 1F);

        ammoModel[18].addShapeBox(35F, 0F, -3F, 12, 6, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F); // Import
        ammoModel[18].setRotationPoint(-5F, -10F, 1F);

        ammoModel[19].addShapeBox(35F, 0F, -3F, 12, 7, 4, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 2.5F, 0.0F, 3.0F, -1.25F, 0.0F, 3.0F, -1.25F, 0.0F, -2.5F, 2.5F, 0.0F); // Import
        ammoModel[19].setRotationPoint(-3.25F, -4F, 1F);
    }

    private void initslideModel_1() {
        slideModel[0] = new ModelRendererTurbo(this, 345, 257, textureX, textureY); // Import
        slideModel[1] = new ModelRendererTurbo(this, 129, 265, textureX, textureY); // Import
        slideModel[2] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Import
        slideModel[3] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Import

        slideModel[0].addShapeBox(35F, 0F, -3F, 30, 5, 5, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        slideModel[0].setRotationPoint(-20F, -40.5F, 1.5F);

        slideModel[1].addShapeBox(35F, 0F, -3F, 30, 5, 1, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        slideModel[1].setRotationPoint(-20F, -40.5F, 0F);

        slideModel[2].addShapeBox(35F, 0F, -3F, 1, 1, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        slideModel[2].setRotationPoint(7.75F, -40F, 5.5F);

        slideModel[3].addShapeBox(35F, 0F, -3F, 1, 1, 2, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        slideModel[3].setRotationPoint(7.75F, -39F, 8.5F);
    }
}