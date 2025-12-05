//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: LVOAC
// Model Creator: 
// Created on: -
// Last changed on: -

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelLVOA extends ModelGun //Same as Filename
{
    int textureX = 256;
    int textureY = 256;

    public ModelLVOA() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[477];
        defaultBarrelModel = new ModelRendererTurbo[30];
        defaultScopeModel = new ModelRendererTurbo[120];
        defaultStockModel = new ModelRendererTurbo[59];
        ammoModel = new ModelRendererTurbo[47];
        slideModel = new ModelRendererTurbo[3];

        initgunModel_1();
        initdefaultBarrelModel_1();
        initdefaultScopeModel_1();
        initdefaultStockModel_1();
        initammoModel_1();
        initslideModel_1();

        barrelAttachPoint = new Vector3f(66.8F / 64F, 18.2F / 64F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(54F / 64F, 18.3F / 64F, -3.4F / 64F);
        scopeAttachPoint = new Vector3f(12F / 64F, 22F / 64F, 0F / 16F);
        gripAttachPoint = new Vector3f(54 / 64F, 13.6F / 64F, 0F / 16F);


        gunSlideDistance = 0.15F;
        animationType = EnumAnimationType.CUSTOM;
        rotateGunHorizontal = 15.0F;
        tiltGun = 30.0F;
        translateGun = new Vector3f(0.0F, -0.0625F, -0.1875F);
        translateClip = new Vector3f(0.0F, -0.625F, 0.0F);
        translateAll(0.0F, 0.0F, 0.0F);
        hasFlash = true;
        hasArms = true;
        leftArmPos = new Vector3f(0.05F, -0.4F, -0.05F);
        leftArmRot = new Vector3f(80.0F, 50.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.15F, -0.55F, 0.05F);
        leftArmReloadRot = new Vector3f(80.0F, 50.0F, 0.0F);
        rightArmPos = new Vector3f(0.25F, -0.52F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmReloadPos = new Vector3f(0.25F, -0.52F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
        rightHandAmmo = false;
        leftHandAmmo = true;
        fancyStance = true;
        stanceTranslate = new Vector3f(0.5D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(45.0F, 0.0F, 1.0F);
        fancyStance = true;
        stanceTranslate = new Vector3f(0.5D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(45.0F, 0.0F, 1.0F);
        casingAttachPoint = new Vector3f(1.0F, 1.6F, 0.0F);
        casingAnimDistance = new Vector3f(0.0F, 3.0F, 7.75F);
        casingAnimSpread = new Vector3f(3.0F, 5.0F, 3.0F);
        casingAnimTime = 6;
        casingRotateVector = new Vector3f(0.1F, 0.0F, 0.1F);
        caseScale = 0.2F;
        casingDelay = 0;
        flashScale = 0.4F;
        muzzleFlashPoint = new Vector3f(3.0F, 0.65F, 0.0F);
        thirdPersonOffset = new Vector3f(-0.1F, -0.05F, 0.0F);
        crouchZoom = -0.05F;
        zoomOffset = 0.25F;


        flipAll();
    }

    private void initgunModel_1() {
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import
        gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import
        gunModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import
        gunModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import
        gunModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import
        gunModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import
        gunModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import
        gunModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import
        gunModel[8] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import
        gunModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import
        gunModel[10] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import
        gunModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import
        gunModel[12] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import
        gunModel[13] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import
        gunModel[14] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import
        gunModel[15] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import
        gunModel[16] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import
        gunModel[17] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import
        gunModel[18] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Import
        gunModel[19] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import
        gunModel[20] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import
        gunModel[21] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import
        gunModel[22] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Import
        gunModel[23] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import
        gunModel[24] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import
        gunModel[25] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Import
        gunModel[26] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Import
        gunModel[27] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Import
        gunModel[28] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Import
        gunModel[29] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Import
        gunModel[30] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import
        gunModel[31] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import
        gunModel[32] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Import
        gunModel[33] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Import
        gunModel[34] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Import
        gunModel[35] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Import
        gunModel[36] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Import
        gunModel[37] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Import
        gunModel[38] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import
        gunModel[39] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import
        gunModel[40] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Import
        gunModel[41] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Import
        gunModel[42] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Import
        gunModel[43] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Import
        gunModel[44] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Import
        gunModel[45] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Import
        gunModel[46] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import
        gunModel[47] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Import
        gunModel[48] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import
        gunModel[49] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Import
        gunModel[50] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import
        gunModel[51] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Import
        gunModel[52] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import
        gunModel[53] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import
        gunModel[54] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import
        gunModel[55] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Import
        gunModel[56] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Import
        gunModel[57] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import
        gunModel[58] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import
        gunModel[59] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import
        gunModel[60] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Import
        gunModel[61] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import
        gunModel[62] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Import
        gunModel[63] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Import
        gunModel[64] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Import
        gunModel[65] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Import
        gunModel[66] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Import
        gunModel[67] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import
        gunModel[68] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import
        gunModel[69] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Import
        gunModel[70] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Import
        gunModel[71] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Import
        gunModel[72] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Import
        gunModel[73] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Import
        gunModel[74] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Import
        gunModel[75] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Import
        gunModel[76] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Import
        gunModel[77] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Import
        gunModel[78] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import
        gunModel[79] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import
        gunModel[80] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Import
        gunModel[81] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Import
        gunModel[82] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import
        gunModel[83] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Import
        gunModel[84] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Import
        gunModel[85] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Import
        gunModel[86] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Import
        gunModel[87] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Import
        gunModel[88] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Import
        gunModel[89] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Import
        gunModel[90] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Import
        gunModel[91] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Import
        gunModel[92] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Import
        gunModel[93] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Import
        gunModel[94] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Import
        gunModel[95] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Import
        gunModel[96] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Import
        gunModel[97] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import
        gunModel[98] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Import
        gunModel[99] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Import
        gunModel[100] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Import
        gunModel[101] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Import
        gunModel[102] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Import
        gunModel[103] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Import
        gunModel[104] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Import
        gunModel[105] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Import
        gunModel[106] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Import
        gunModel[107] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import
        gunModel[108] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Import
        gunModel[109] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Import
        gunModel[110] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Import
        gunModel[111] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Import
        gunModel[112] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Import
        gunModel[113] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import
        gunModel[114] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Import
        gunModel[115] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Import
        gunModel[116] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Import
        gunModel[117] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Import
        gunModel[118] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Import
        gunModel[119] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Import
        gunModel[120] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Import
        gunModel[121] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Import
        gunModel[122] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Import
        gunModel[123] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Import
        gunModel[124] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Import
        gunModel[125] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Import
        gunModel[126] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Import
        gunModel[127] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Import
        gunModel[128] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Import
        gunModel[129] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Import
        gunModel[130] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Import
        gunModel[131] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Import
        gunModel[132] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Import
        gunModel[133] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Import
        gunModel[134] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Import
        gunModel[135] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Import
        gunModel[136] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Import
        gunModel[137] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Import
        gunModel[138] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import
        gunModel[139] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Import
        gunModel[140] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Import
        gunModel[141] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Import
        gunModel[142] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Import
        gunModel[143] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Import
        gunModel[144] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Import
        gunModel[145] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Import
        gunModel[146] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Import
        gunModel[147] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Import
        gunModel[148] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Import
        gunModel[149] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Import
        gunModel[150] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Import
        gunModel[151] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Import
        gunModel[152] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Import
        gunModel[153] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Import
        gunModel[154] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Import
        gunModel[155] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Import
        gunModel[156] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Import
        gunModel[157] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Import
        gunModel[158] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Import
        gunModel[159] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Import
        gunModel[160] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Import
        gunModel[161] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Import
        gunModel[162] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Import
        gunModel[163] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Import
        gunModel[164] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Import
        gunModel[165] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Import
        gunModel[166] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Import
        gunModel[167] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Import
        gunModel[168] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Import
        gunModel[169] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import
        gunModel[170] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Import
        gunModel[171] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Import
        gunModel[172] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Import
        gunModel[173] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Import
        gunModel[174] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Import
        gunModel[175] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Import
        gunModel[176] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Import
        gunModel[177] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Import
        gunModel[178] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Import
        gunModel[179] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Import
        gunModel[180] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Import
        gunModel[181] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Import
        gunModel[182] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Import
        gunModel[183] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Import
        gunModel[184] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import
        gunModel[185] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Import
        gunModel[186] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Import
        gunModel[187] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Import
        gunModel[188] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Import
        gunModel[189] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Import
        gunModel[190] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Import
        gunModel[191] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Import
        gunModel[192] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Import
        gunModel[193] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Import
        gunModel[194] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Import
        gunModel[195] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Import
        gunModel[196] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Import
        gunModel[197] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Import
        gunModel[198] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Import
        gunModel[199] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Import
        gunModel[200] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Import
        gunModel[201] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Import
        gunModel[202] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Import
        gunModel[203] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Import
        gunModel[204] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Import
        gunModel[205] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Import
        gunModel[206] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Import
        gunModel[207] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import
        gunModel[208] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Import
        gunModel[209] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Import
        gunModel[210] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Import
        gunModel[211] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Import
        gunModel[212] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Import
        gunModel[213] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Import
        gunModel[214] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Import
        gunModel[215] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Import
        gunModel[216] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Import
        gunModel[217] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Import
        gunModel[218] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Import
        gunModel[219] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Import
        gunModel[220] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Import
        gunModel[221] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Import
        gunModel[222] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Import
        gunModel[223] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Import
        gunModel[224] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Import
        gunModel[225] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Import
        gunModel[226] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Import
        gunModel[227] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Import
        gunModel[228] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Import
        gunModel[229] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Import
        gunModel[230] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Import
        gunModel[231] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Import
        gunModel[232] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import
        gunModel[233] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Import
        gunModel[234] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Import
        gunModel[235] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Import
        gunModel[236] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Import
        gunModel[237] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Import
        gunModel[238] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Import
        gunModel[239] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Import
        gunModel[240] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Import
        gunModel[241] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Import
        gunModel[242] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Import
        gunModel[243] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Import
        gunModel[244] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Import
        gunModel[245] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Import
        gunModel[246] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Import
        gunModel[247] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import
        gunModel[248] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Import
        gunModel[249] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Import
        gunModel[250] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Import
        gunModel[251] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Import
        gunModel[252] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Import
        gunModel[253] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Import
        gunModel[254] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Import
        gunModel[255] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Import
        gunModel[256] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Import
        gunModel[257] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Import
        gunModel[258] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Import
        gunModel[259] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Import
        gunModel[260] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Import
        gunModel[261] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Import
        gunModel[262] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Import
        gunModel[263] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Import
        gunModel[264] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import
        gunModel[265] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Import
        gunModel[266] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Import
        gunModel[267] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Import
        gunModel[268] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Import
        gunModel[269] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Import
        gunModel[270] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Import
        gunModel[271] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Import
        gunModel[272] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Import
        gunModel[273] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Import
        gunModel[274] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Import
        gunModel[275] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Import
        gunModel[276] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Import
        gunModel[277] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Import
        gunModel[278] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Import
        gunModel[279] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Import
        gunModel[280] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Import
        gunModel[281] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Import
        gunModel[282] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Import
        gunModel[283] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Import
        gunModel[284] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Import
        gunModel[285] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Import
        gunModel[286] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Import
        gunModel[287] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Import
        gunModel[288] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Import
        gunModel[289] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Import
        gunModel[290] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import
        gunModel[291] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Import
        gunModel[292] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Import
        gunModel[293] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Import
        gunModel[294] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Import
        gunModel[295] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Import
        gunModel[296] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Import
        gunModel[297] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Import
        gunModel[298] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Import
        gunModel[299] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Import
        gunModel[300] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Import
        gunModel[301] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Import
        gunModel[302] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Import
        gunModel[303] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Import
        gunModel[304] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Import
        gunModel[305] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Import
        gunModel[306] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Import
        gunModel[307] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Import
        gunModel[308] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Import
        gunModel[309] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Import
        gunModel[310] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Import
        gunModel[311] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Import
        gunModel[312] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Import
        gunModel[313] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Import
        gunModel[314] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Import
        gunModel[315] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Import
        gunModel[316] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Import
        gunModel[317] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Import
        gunModel[318] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Import
        gunModel[319] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Import
        gunModel[320] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Import
        gunModel[321] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Import
        gunModel[322] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import
        gunModel[323] = new ModelRendererTurbo(this, 9, 121, textureX, textureY); // Import
        gunModel[324] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Import
        gunModel[325] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Import
        gunModel[326] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Import
        gunModel[327] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Import
        gunModel[328] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Import
        gunModel[329] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Import
        gunModel[330] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Import
        gunModel[331] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Import
        gunModel[332] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Import
        gunModel[333] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Import
        gunModel[334] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Import
        gunModel[335] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Import
        gunModel[336] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Import
        gunModel[337] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Import
        gunModel[338] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Import
        gunModel[339] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Import
        gunModel[340] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Import
        gunModel[341] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import
        gunModel[342] = new ModelRendererTurbo(this, 9, 129, textureX, textureY); // Import
        gunModel[343] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Import
        gunModel[344] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Import
        gunModel[345] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Import
        gunModel[346] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Import
        gunModel[347] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Import
        gunModel[348] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Import
        gunModel[349] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Import
        gunModel[350] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Import
        gunModel[351] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Import
        gunModel[352] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Import
        gunModel[353] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Import
        gunModel[354] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Import
        gunModel[355] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Import
        gunModel[356] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Import
        gunModel[357] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Import
        gunModel[358] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Import
        gunModel[359] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Import
        gunModel[360] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Import
        gunModel[361] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Import
        gunModel[362] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Import
        gunModel[363] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Import
        gunModel[364] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Import
        gunModel[365] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Import
        gunModel[366] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Import
        gunModel[367] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Import
        gunModel[368] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Import
        gunModel[369] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Import
        gunModel[370] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Import
        gunModel[371] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Import
        gunModel[372] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Import
        gunModel[373] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Import
        gunModel[374] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Import
        gunModel[375] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Import
        gunModel[376] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import
        gunModel[377] = new ModelRendererTurbo(this, 9, 169, textureX, textureY); // Import
        gunModel[378] = new ModelRendererTurbo(this, 25, 169, textureX, textureY); // Import
        gunModel[379] = new ModelRendererTurbo(this, 33, 169, textureX, textureY); // Import
        gunModel[380] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Import
        gunModel[381] = new ModelRendererTurbo(this, 57, 169, textureX, textureY); // Import
        gunModel[382] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Import
        gunModel[383] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Import
        gunModel[384] = new ModelRendererTurbo(this, 81, 169, textureX, textureY); // Import
        gunModel[385] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Import
        gunModel[386] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Import
        gunModel[387] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Import
        gunModel[388] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Import
        gunModel[389] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Import
        gunModel[390] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Import
        gunModel[391] = new ModelRendererTurbo(this, 153, 169, textureX, textureY); // Import
        gunModel[392] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Import
        gunModel[393] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Import
        gunModel[394] = new ModelRendererTurbo(this, 177, 169, textureX, textureY); // Import
        gunModel[395] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Import
        gunModel[396] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Import
        gunModel[397] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Import
        gunModel[398] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Import
        gunModel[399] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Import
        gunModel[400] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Import
        gunModel[401] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Import
        gunModel[402] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Import
        gunModel[403] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Import
        gunModel[404] = new ModelRendererTurbo(this, 9, 177, textureX, textureY); // Import
        gunModel[405] = new ModelRendererTurbo(this, 17, 177, textureX, textureY); // Import
        gunModel[406] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Import
        gunModel[407] = new ModelRendererTurbo(this, 33, 177, textureX, textureY); // Import
        gunModel[408] = new ModelRendererTurbo(this, 41, 177, textureX, textureY); // Import
        gunModel[409] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Import
        gunModel[410] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Import
        gunModel[411] = new ModelRendererTurbo(this, 65, 177, textureX, textureY); // Import
        gunModel[412] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Import
        gunModel[413] = new ModelRendererTurbo(this, 81, 177, textureX, textureY); // Import
        gunModel[414] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Import
        gunModel[415] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // Import
        gunModel[416] = new ModelRendererTurbo(this, 105, 177, textureX, textureY); // Import
        gunModel[417] = new ModelRendererTurbo(this, 113, 177, textureX, textureY); // Import
        gunModel[418] = new ModelRendererTurbo(this, 121, 177, textureX, textureY); // Import
        gunModel[419] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Import
        gunModel[420] = new ModelRendererTurbo(this, 137, 177, textureX, textureY); // Import
        gunModel[421] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Import
        gunModel[422] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Import
        gunModel[423] = new ModelRendererTurbo(this, 161, 177, textureX, textureY); // Import
        gunModel[424] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Import
        gunModel[425] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Import
        gunModel[426] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Import
        gunModel[427] = new ModelRendererTurbo(this, 193, 177, textureX, textureY); // Import
        gunModel[428] = new ModelRendererTurbo(this, 201, 177, textureX, textureY); // Import
        gunModel[429] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Import
        gunModel[430] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Import
        gunModel[431] = new ModelRendererTurbo(this, 225, 177, textureX, textureY); // Import
        gunModel[432] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Import
        gunModel[433] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Import
        gunModel[434] = new ModelRendererTurbo(this, 249, 177, textureX, textureY); // Import
        gunModel[435] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Import
        gunModel[436] = new ModelRendererTurbo(this, 9, 185, textureX, textureY); // Import
        gunModel[437] = new ModelRendererTurbo(this, 17, 185, textureX, textureY); // Import
        gunModel[438] = new ModelRendererTurbo(this, 25, 185, textureX, textureY); // Import
        gunModel[439] = new ModelRendererTurbo(this, 33, 185, textureX, textureY); // Import
        gunModel[440] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Import
        gunModel[441] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Import
        gunModel[442] = new ModelRendererTurbo(this, 73, 193, textureX, textureY); // Import
        gunModel[443] = new ModelRendererTurbo(this, 81, 193, textureX, textureY); // Import
        gunModel[444] = new ModelRendererTurbo(this, 97, 193, textureX, textureY); // Import
        gunModel[445] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Import
        gunModel[446] = new ModelRendererTurbo(this, 113, 193, textureX, textureY); // Import
        gunModel[447] = new ModelRendererTurbo(this, 121, 193, textureX, textureY); // Import
        gunModel[448] = new ModelRendererTurbo(this, 129, 193, textureX, textureY); // Import
        gunModel[449] = new ModelRendererTurbo(this, 137, 193, textureX, textureY); // Import
        gunModel[450] = new ModelRendererTurbo(this, 145, 193, textureX, textureY); // Import
        gunModel[451] = new ModelRendererTurbo(this, 153, 193, textureX, textureY); // Import
        gunModel[452] = new ModelRendererTurbo(this, 161, 193, textureX, textureY); // Import
        gunModel[453] = new ModelRendererTurbo(this, 169, 193, textureX, textureY); // Import
        gunModel[454] = new ModelRendererTurbo(this, 177, 193, textureX, textureY); // Import
        gunModel[455] = new ModelRendererTurbo(this, 185, 193, textureX, textureY); // Import
        gunModel[456] = new ModelRendererTurbo(this, 193, 193, textureX, textureY); // Import
        gunModel[457] = new ModelRendererTurbo(this, 201, 193, textureX, textureY); // Import
        gunModel[458] = new ModelRendererTurbo(this, 209, 193, textureX, textureY); // Import
        gunModel[459] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Import
        gunModel[460] = new ModelRendererTurbo(this, 225, 193, textureX, textureY); // Import
        gunModel[461] = new ModelRendererTurbo(this, 233, 193, textureX, textureY); // Import
        gunModel[462] = new ModelRendererTurbo(this, 241, 193, textureX, textureY); // Import
        gunModel[463] = new ModelRendererTurbo(this, 249, 193, textureX, textureY); // Import
        gunModel[464] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Import
        gunModel[465] = new ModelRendererTurbo(this, 17, 201, textureX, textureY); // Import
        gunModel[466] = new ModelRendererTurbo(this, 33, 201, textureX, textureY); // Import
        gunModel[467] = new ModelRendererTurbo(this, 49, 201, textureX, textureY); // Import
        gunModel[468] = new ModelRendererTurbo(this, 57, 201, textureX, textureY); // Import
        gunModel[469] = new ModelRendererTurbo(this, 65, 201, textureX, textureY); // Import
        gunModel[470] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Import
        gunModel[471] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Import
        gunModel[472] = new ModelRendererTurbo(this, 89, 201, textureX, textureY); // Import
        gunModel[473] = new ModelRendererTurbo(this, 97, 201, textureX, textureY); // Import
        gunModel[474] = new ModelRendererTurbo(this, 105, 201, textureX, textureY); // Import
        gunModel[475] = new ModelRendererTurbo(this, 113, 201, textureX, textureY); // Import
        gunModel[476] = new ModelRendererTurbo(this, 121, 201, textureX, textureY); // Import

        gunModel[0].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0.0F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, 0.2F, -0.6F, 0.1F, 0.2F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[0].setRotationPoint(5.4F, -5.8F, -0.25F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[1].setRotationPoint(5.4F, -6.2F, -0.25F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[2].setRotationPoint(6.2F, -6.2F, -0.25F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[3].setRotationPoint(7F, -6.2F, -0.25F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[4].setRotationPoint(7.8F, -6.2F, -0.25F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[5].setRotationPoint(5.8F, -6.2F, -0.25F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[6].setRotationPoint(6.6F, -6.2F, -0.25F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[7].setRotationPoint(7.4F, -6.2F, -0.25F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0.0F, -0.5F, 0.1F, 0.2F, -0.5F, 0.1F, 0.2F, -0.5F, -0.4F, 0.0F, -0.5F, -0.4F, 0.0F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F); // Import
        gunModel[8].setRotationPoint(5.4F, -5.9F, -0.25F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[9].setRotationPoint(8.2F, -6.2F, -0.25F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[10].setRotationPoint(8.6F, -6.2F, -0.25F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F); // Import
        gunModel[11].setRotationPoint(5.7F, -5.25F, -0.5F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F); // Import
        gunModel[12].setRotationPoint(5.7F, -4.85F, -0.5F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F); // Import
        gunModel[13].setRotationPoint(5.7F, -5.05F, -0.3F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.5F, -0.2F, -0.45F, -0.5F, -0.2F, 0.45F, -0.45F, -0.2F, 0.4F, -0.45F, -0.2F, 0.4F, -0.5F, -0.2F, 0.45F, -0.5F); // Import
        gunModel[14].setRotationPoint(3.25F, -3.8F, 0.15F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -1.15F, 0.2F, 0.0F, -0.9F, 0.2F, 0.0F, -0.9F, 0.2F, 0.0F, -1.15F, 0.2F, 0.0F, 0.25F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.25F, 0.2F); // Import
        gunModel[15].setRotationPoint(3F, -3.4F, -0.5F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.85F, -0.1F, -0.1F, -0.65F, -0.1F, -0.1F, -0.65F, -0.1F, -0.75F, -0.85F, -0.1F, -0.75F, 0.05F, -0.1F, -0.1F, 0.05F, -0.1F, -0.1F, 0.05F, -0.1F, -0.75F, 0.05F, -0.1F); // Import
        gunModel[16].setRotationPoint(2F, -3.2F, -0.5F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -1.0F, -0.2F, -0.7F, -1.15F, -0.2F, -0.7F, -1.15F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, 0.15F, -0.2F, -0.7F, 0.25F, -0.2F, -0.7F, 0.25F, -0.2F, 0.0F, 0.15F, -0.2F); // Import
        gunModel[17].setRotationPoint(1.75F, -3.3F, -0.5F);

        gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.4F, -0.1F, 0.0F, -0.4F, -0.1F, 0.0F, -0.4F, -0.1F, -0.75F, -0.4F, -0.1F, -0.9F, -0.35F, -0.1F, 0.0F, -0.35F, -0.1F, 0.0F, -0.35F, -0.1F, -0.9F, -0.35F, -0.1F); // Import
        gunModel[18].setRotationPoint(2F, -3.45F, -0.5F);

        gunModel[19].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.55F, -0.4F, -0.4F, -0.55F); // Import
        gunModel[19].setRotationPoint(-0.4F, -3.55F, 0.15F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, -0.15F, -0.1F, -0.3F, -0.15F, -0.1F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.5F, -0.15F, -0.1F, -0.5F, -0.15F, -0.1F, -0.5F, -0.15F, -0.3F, -0.5F, -0.15F); // Import
        gunModel[20].setRotationPoint(-0.1F, -5.9F, -0.5F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.425F, -0.4F, -0.5F, -0.425F, -0.4F, -0.5F, -0.425F, -0.4F, 0.0F, -0.425F, -0.4F, 0.0F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, 0.0F, -0.45F, -0.4F); // Import
        gunModel[21].setRotationPoint(-0.2F, -5.75F, 0.05F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.425F, -0.5F, -0.5F, -0.425F, -0.5F, -0.65F, -0.425F, -0.35F, -0.15F, -0.425F, -0.35F, 0.0F, -0.45F, -0.5F, -0.5F, -0.45F, -0.5F, -0.65F, -0.45F, -0.35F, -0.15F, -0.45F, -0.35F); // Import
        gunModel[22].setRotationPoint(-0.2F, -5.75F, 0.15F);

        gunModel[23].addShapeBox(-1.1F, 0F, -0.5F, 1, 1, 1, 0F, 0.0F, -0.45F, -0.4F, -0.6F, -0.45F, -0.4F, -0.6F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.4F, -0.6F, -0.45F, -0.4F, -0.6F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F); // Import
        gunModel[23].setRotationPoint(1.2F, -5.05F, -0.75F);
        gunModel[23].rotateAngleY = 0.20943952F;

        gunModel[24].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -1.0F, -0.4F, -0.7F, -1.0F, -0.4F, -0.7F, -1.0F, -0.5F, -0.1F, -1.0F, -0.5F, -0.15F, 0.15F, -0.4F, -0.7F, 0.15F, -0.4F, -0.7F, 0.15F, -0.5F, -0.15F, 0.15F, -0.5F); // Import
        gunModel[24].setRotationPoint(0.9F, -3.7F, -0.45F);

        gunModel[25].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.6F, -0.4F, -0.7F, -0.6F, -0.4F, -0.7F, -0.6F, -0.5F, -0.2F, -0.6F, -0.5F, -0.2F, -0.05F, -0.4F, -0.7F, -0.05F, -0.4F, -0.7F, -0.05F, -0.5F, -0.2F, -0.05F, -0.5F); // Import
        gunModel[25].setRotationPoint(0.9F, -3.65F, -0.45F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.3F, -0.3F, -0.05F, -0.1F, -0.3F, -0.05F, -0.1F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.6F, -0.15F, -0.1F, -0.6F, -0.15F, -0.1F, -0.6F, -0.15F, -0.3F, -0.6F, -0.15F); // Import
        gunModel[26].setRotationPoint(0.5F, -5.8F, -0.5F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[27].setRotationPoint(4.8F, -6.2F, -0.25F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[28].setRotationPoint(4.4F, -6.2F, -0.25F);

        gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[29].setRotationPoint(4F, -6.2F, -0.25F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[30].setRotationPoint(3.6F, -6.2F, -0.25F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[31].setRotationPoint(3.2F, -6.2F, -0.25F);

        gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[32].setRotationPoint(2.8F, -6.2F, -0.25F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[33].setRotationPoint(2.4F, -6.2F, -0.25F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[34].setRotationPoint(2F, -6.2F, -0.25F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[35].setRotationPoint(1.6F, -6.2F, -0.25F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[36].setRotationPoint(1.2F, -6.2F, -0.25F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F); // Import
        gunModel[37].setRotationPoint(5F, -5.05F, -0.5F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, -0.2F, -0.8F, -0.65F, 0.4F, -0.8F, -0.65F, 0.4F, -0.8F, -0.65F, -0.2F, -0.8F, -0.65F, -0.2F, 0.45F, -0.65F, 0.4F, 0.45F, -0.65F, 0.4F, 0.45F, -0.65F, -0.2F, 0.45F, -0.65F); // Import
        gunModel[38].setRotationPoint(0F, -6.2F, -1F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.6F, -0.35F, -0.15F, 0.1F, -0.35F, -0.15F, 0.1F, -0.35F, -0.1F, 0.6F, -0.35F, -0.1F, 0.6F, -0.3F, -0.15F, 0.1F, -0.3F, -0.15F, 0.1F, -0.3F, -0.1F, 0.6F, -0.3F, -0.1F); // Import
        gunModel[39].setRotationPoint(0.3F, -4.4F, -0.5F);

        gunModel[40].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.5F, 0.1F, -0.45F, -0.5F, 0.1F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.4F, -0.45F, 0.1F, -0.4F, -0.45F, 0.1F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F); // Import
        gunModel[40].setRotationPoint(-0.4F, -4.05F, -0.45F);

        gunModel[41].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.1F, -0.4F, -0.45F, 0.1F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.1F, -0.4F, -0.45F, 0.1F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F); // Import
        gunModel[41].setRotationPoint(-0.4F, -3.95F, -0.45F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.4F, -0.25F, -0.85F, -0.4F, -0.25F, -0.65F, -0.4F, -0.25F, -0.65F, -0.4F, -0.25F, -0.85F, -0.4F, -0.25F, -0.85F, -0.4F, -0.25F, -0.65F, -0.4F, -0.25F, -0.65F, -0.4F, -0.25F, -0.85F); // Import
        gunModel[42].setRotationPoint(-0.4F, -5.85F, -1F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[43].setRotationPoint(10.2F, -6.2F, -0.25F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[44].setRotationPoint(9.8F, -6.2F, -0.25F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[45].setRotationPoint(9.4F, -6.2F, -0.25F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[46].setRotationPoint(9F, -6.2F, -0.25F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[47].setRotationPoint(0.8F, -6.2F, -0.25F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.35F, -0.35F, -0.65F, -0.35F, -0.35F, -0.5F, -0.35F, -0.5F, 0.0F, -0.35F, -0.5F, -0.15F, -0.3F, -0.35F, -0.65F, -0.3F, -0.35F, -0.5F, -0.3F, -0.5F, 0.0F, -0.3F, -0.5F); // Import
        gunModel[48].setRotationPoint(-0.2F, -5.9F, -1.15F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, 0.0F, -0.45F, -0.4F, 0.0F, -0.425F, -0.4F, -0.5F, -0.425F, -0.4F, -0.5F, -0.425F, -0.4F, 0.0F, -0.425F, -0.4F); // Import
        gunModel[49].setRotationPoint(-0.2F, -6F, 0.05F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.45F, -0.5F, -0.5F, -0.45F, -0.5F, -0.65F, -0.45F, -0.35F, -0.15F, -0.45F, -0.35F, 0.0F, -0.425F, -0.5F, -0.5F, -0.425F, -0.5F, -0.65F, -0.425F, -0.35F, -0.15F, -0.425F, -0.35F); // Import
        gunModel[50].setRotationPoint(-0.2F, -6F, 0.15F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.35F, 0.05F, -0.5F, -0.35F, 0.05F, -0.5F, -0.35F, 0.05F, 0.0F, -0.35F, 0.05F, 0.0F, -0.3F, 0.05F, -0.5F, -0.3F, 0.05F, -0.5F, -0.3F, 0.05F, 0.0F, -0.3F, 0.05F); // Import
        gunModel[51].setRotationPoint(-0.2F, -5.9F, -0.6F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F, -0.5F, -0.1F, -0.35F, -0.5F, -0.1F, -0.3F, -0.35F, 0.0F, -0.3F, -0.35F, 0.0F, -0.3F, -0.35F, -0.1F, -0.3F, -0.35F); // Import
        gunModel[52].setRotationPoint(4F, -5.45F, 0F);

        gunModel[53].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.1F, -0.4F, -0.45F, 0.1F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.45F, -0.5F, 0.1F, -0.45F, -0.5F, 0.1F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F); // Import
        gunModel[53].setRotationPoint(-0.4F, -3.85F, -0.45F);

        gunModel[54].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.4F, 0.0F, -0.45F, -0.45F, 0.0F, -0.45F, -0.45F, 0.05F, -0.45F, -0.4F, 0.05F, -0.45F, -0.4F, 0.0F, -0.45F, -0.45F, 0.0F, -0.45F, -0.45F, 0.05F, -0.45F, -0.4F, 0.05F); // Import
        gunModel[54].setRotationPoint(-0.55F, -3.95F, -0.4F);

        gunModel[55].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.55F, -0.3F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.05F, -0.55F, -0.3F, 0.05F, -0.45F, -0.6F, 0.0F, -0.45F, -0.55F, 0.0F, -0.45F, -0.55F, 0.05F, -0.45F, -0.6F, 0.05F); // Import
        gunModel[55].setRotationPoint(-0.55F, -3.95F, -0.4F);

        gunModel[56].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.55F, -0.3F, 0.0F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, 0.05F, -0.55F, -0.3F, 0.05F, -0.6F, -0.6F, 0.0F, -0.3F, -0.6F, 0.0F, -0.3F, -0.6F, 0.05F, -0.6F, -0.6F, 0.05F); // Import
        gunModel[56].setRotationPoint(-0.55F, -3.95F, -0.4F);

        gunModel[57].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, 0.0F, -0.55F, -0.3F, 0.0F, -0.55F, -0.3F, 0.05F, -0.4F, -0.4F, 0.05F, -0.45F, -0.55F, 0.0F, -0.45F, -0.6F, 0.0F, -0.45F, -0.6F, 0.05F, -0.45F, -0.55F, 0.05F); // Import
        gunModel[57].setRotationPoint(-0.25F, -3.95F, -0.4F);

        gunModel[58].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.45F, 0.0F, -0.45F, -0.4F, 0.0F, -0.45F, -0.4F, 0.05F, -0.45F, -0.45F, 0.05F, -0.45F, -0.45F, 0.0F, -0.45F, -0.4F, 0.0F, -0.45F, -0.4F, 0.05F, -0.45F, -0.45F, 0.05F); // Import
        gunModel[58].setRotationPoint(-0.25F, -3.95F, -0.4F);

        gunModel[59].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.55F, 0.0F, -0.45F, -0.6F, 0.0F, -0.45F, -0.6F, 0.05F, -0.45F, -0.55F, 0.05F, -0.4F, -0.4F, 0.0F, -0.55F, -0.3F, 0.0F, -0.55F, -0.3F, 0.05F, -0.4F, -0.4F, 0.05F); // Import
        gunModel[59].setRotationPoint(-0.25F, -3.95F, -0.4F);

        gunModel[60].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.6F, 0.0F, -0.3F, -0.6F, 0.0F, -0.3F, -0.6F, 0.05F, -0.6F, -0.6F, 0.05F, -0.55F, -0.3F, 0.0F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, 0.05F, -0.55F, -0.3F, 0.05F); // Import
        gunModel[60].setRotationPoint(-0.55F, -3.95F, -0.4F);

        gunModel[61].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.6F, 0.0F, -0.45F, -0.55F, 0.0F, -0.45F, -0.55F, 0.05F, -0.45F, -0.6F, 0.05F, -0.55F, -0.3F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.05F, -0.55F, -0.3F, 0.05F); // Import
        gunModel[61].setRotationPoint(-0.55F, -3.95F, -0.4F);

        gunModel[62].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.45F, -0.3F, -0.55F, -0.45F, -0.3F, -0.55F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.45F, -0.45F, -0.55F, -0.45F, -0.45F, -0.55F); // Import
        gunModel[62].setRotationPoint(-0.4F, -3.55F, 0.2F);

        gunModel[63].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.45F, -0.4F, -0.55F, -0.45F, -0.4F, -0.55F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.5F, -0.55F, -0.55F, -0.5F, -0.55F, -0.55F); // Import
        gunModel[63].setRotationPoint(-0.4F, -3.4F, 0.2F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[64].setRotationPoint(5.2F, -6.2F, -0.25F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.6F, -0.15F, 0.0F, -0.6F, -0.15F, 0.0F, -0.6F, -0.15F, -0.6F, -0.6F, -0.15F, -0.6F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, -0.6F, 0.0F, 0.15F); // Import
        gunModel[65].setRotationPoint(-1F, -5.75F, -0.5F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.3F, 0.15F, 0.0F, -0.3F, 0.15F, 0.0F, -0.3F, 0.15F, -0.6F, -0.3F, 0.15F, -0.6F, -0.3F, 0.15F, 0.0F, -0.3F, 0.15F, 0.0F, -0.3F, 0.15F, -0.6F, -0.3F, 0.15F); // Import
        gunModel[66].setRotationPoint(-1F, -5.05F, -0.5F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.35F, 0.15F, 0.0F, -0.35F, 0.15F, 0.0F, -0.35F, 0.15F, -0.6F, -0.35F, 0.15F, -0.6F, -0.25F, 0.0F, 0.3F, -0.25F, 0.0F, 0.3F, -0.25F, 0.0F, -0.6F, -0.25F, 0.0F); // Import
        gunModel[67].setRotationPoint(-1F, -4.7F, -0.5F);

        gunModel[68].addShapeBox(-1.1F, 0.1F, -0.5F, 1, 1, 1, 0F, 0.0F, -0.45F, -0.4F, -0.6F, -0.45F, -0.4F, -0.6F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.5F, -0.6F, -0.45F, -0.5F, -0.6F, -0.45F, -0.4F, 0.0F, -0.45F, -0.4F); // Import
        gunModel[68].setRotationPoint(1.2F, -5.05F, -0.75F);
        gunModel[68].rotateAngleY = 0.20943952F;

        gunModel[69].addShapeBox(-1.1F, 0.1F, -0.5F, 1, 1, 1, 0F, 0.0F, -0.45F, -0.5F, -0.6F, -0.45F, -0.5F, -0.6F, -0.45F, -0.4F, 0.0F, -0.45F, -0.4F, 0.0F, -0.45F, -0.4F, -0.6F, -0.45F, -0.4F, -0.6F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F); // Import
        gunModel[69].setRotationPoint(1.2F, -5.25F, -0.75F);
        gunModel[69].rotateAngleY = 0.20943952F;

        gunModel[70].addShapeBox(-1.65F, 0.1F, -0.5F, 1, 1, 1, 0F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, -0.5F, -0.25F, -0.45F, -0.5F, -0.25F); // Import
        gunModel[70].setRotationPoint(1.2F, -5.25F, -0.75F);
        gunModel[70].rotateAngleY = 0.20943952F;

        gunModel[71].addShapeBox(-1.65F, 0F, -0.5F, 1, 1, 1, 0F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.25F, -0.45F, -0.4F, -0.25F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.25F, -0.45F, -0.4F, -0.25F); // Import
        gunModel[71].setRotationPoint(1.2F, -5.05F, -0.75F);
        gunModel[71].rotateAngleY = 0.20943952F;

        gunModel[72].addShapeBox(-1.65F, 0.1F, -0.5F, 1, 1, 1, 0F, -0.45F, -0.5F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, -0.5F, -0.25F, -0.45F, -0.5F, -0.25F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F); // Import
        gunModel[72].setRotationPoint(1.2F, -5.05F, -0.75F);
        gunModel[72].rotateAngleY = 0.20943952F;

        gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.35F, -0.1F, -0.3F, -0.35F, -0.1F, -0.3F, -0.35F, -0.1F, -0.3F, -0.35F, -0.1F); // Import
        gunModel[73].setRotationPoint(-0.1F, -5.9F, -0.5F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.4F, -0.1F, -0.45F, -0.475F, -0.1F, -0.45F, -0.475F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.425F, -0.1F, -0.45F, -0.425F, -0.1F, -0.45F, -0.35F, -0.1F); // Import
        gunModel[74].setRotationPoint(0.15F, -5.9F, -0.5F);

        gunModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, 0.4F, -0.3F, -0.3F, 0.4F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, 0.4F, -0.3F, -0.3F, 0.4F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F); // Import
        gunModel[75].setRotationPoint(4.7F, -5.05F, -0.25F);

        gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.3F, -0.3F, 0.0F, 0.5F, -0.3F, 0.0F, 0.5F, -0.3F, 0.0F, 0.3F, -0.3F, 0.0F, 0.3F, -0.4F, 0.0F, 0.5F, -0.4F, 0.0F, 0.5F, -0.4F, 0.0F, 0.3F, -0.4F, 0.0F); // Import
        gunModel[76].setRotationPoint(3.5F, -5.05F, -0.35F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, 0.15F, -0.3F, -0.3F, 0.15F, -0.3F, -0.3F, 0.15F, -0.3F, -0.3F, 0.15F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F); // Import
        gunModel[77].setRotationPoint(4.7F, -4.65F, -0.5F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.01F, -0.3F, 0.15F, -0.4F, -0.3F, 0.15F, -0.4F, -0.3F, 0.15F, -0.01F, -0.3F, 0.15F, -0.01F, -0.4F, 0.15F, -0.4F, -0.4F, 0.15F, -0.4F, -0.4F, 0.15F, -0.01F, -0.4F, 0.15F); // Import
        gunModel[78].setRotationPoint(0F, -5.05F, -0.5F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.19F, -0.3F, -0.15F, -0.6F, -0.3F, -0.15F, -0.6F, -0.3F, -0.15F, 0.19F, -0.3F, -0.15F, 0.19F, -0.3F, 0.15F, -0.6F, -0.3F, 0.15F, -0.6F, -0.3F, 0.15F, 0.19F, -0.3F, 0.15F); // Import
        gunModel[79].setRotationPoint(0.2F, -5.45F, -0.5F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.3F, -0.3F, -0.05F, 0.5F, -0.3F, -0.05F, 0.5F, -0.3F, -0.35F, 0.3F, -0.3F, -0.35F, 0.3F, -0.3F, -0.05F, 0.5F, -0.3F, -0.05F, 0.5F, -0.3F, -0.05F, 0.3F, -0.3F, -0.05F); // Import
        gunModel[80].setRotationPoint(3.5F, -5.45F, -0.3F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, 0.15F, -0.3F, -0.3F, 0.15F, -0.3F, -0.3F, 0.15F, -0.3F, -0.3F, 0.15F); // Import
        gunModel[81].setRotationPoint(4.7F, -5.45F, -0.5F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.6F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, 0.6F, -0.3F, 0.0F, 0.6F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, 0.6F, 0.2F, 0.0F); // Import
        gunModel[82].setRotationPoint(1.3F, -4.25F, -0.5F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.05F, -0.55F, 0.1F, -0.8F, -0.65F, 0.1F, -0.8F, -0.65F, 0.1F, -0.05F, -0.55F, 0.1F, -0.05F, 0.0F, 0.1F, -0.8F, -0.1F, 0.1F, -0.8F, -0.1F, 0.1F, -0.05F, 0.0F, 0.1F); // Import
        gunModel[83].setRotationPoint(5.2F, -4.5F, -0.5F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.5F, 0.15F, -0.4F, -0.5F, 0.15F, -0.4F, -0.5F, 0.15F, -0.4F, -0.5F, 0.15F, -0.45F, -0.45F, 0.15F, -0.45F, -0.45F, 0.15F, -0.45F, -0.45F, 0.15F, -0.45F, -0.45F, 0.15F); // Import
        gunModel[84].setRotationPoint(4.7F, -4.2F, -0.5F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.15F, -0.4F, -0.45F, 0.15F, -0.4F, -0.45F, 0.15F, -0.4F, -0.45F, 0.15F, -0.4F, -0.45F, 0.15F, -0.4F, -0.45F, 0.15F, -0.4F, -0.45F, 0.15F, -0.4F, -0.45F, 0.15F); // Import
        gunModel[85].setRotationPoint(4.7F, -4.25F, -0.5F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.45F, 0.15F, -0.45F, -0.45F, 0.15F, -0.45F, -0.45F, 0.15F, -0.45F, -0.45F, 0.15F, -0.4F, -0.5F, 0.15F, -0.4F, -0.5F, 0.15F, -0.4F, -0.5F, 0.15F, -0.4F, -0.5F, 0.15F); // Import
        gunModel[86].setRotationPoint(4.7F, -4.3F, -0.5F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.7F, 0.05F, -0.95F, -0.7F, 0.05F, -0.95F, -0.7F, 0.05F, 0.1F, -0.7F, 0.05F, 0.1F, -0.2F, -0.2F, -1.0F, -0.2F, -0.2F, -1.0F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F); // Import
        gunModel[87].setRotationPoint(-0.3F, -4.3F, -0.5F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.1F, 0.1F, 0.0F, -0.1F, 0.1F, 0.0F, -0.1F, 0.1F, 0.0F, -0.1F, 0.1F, 0.0F, 0.15F, 0.1F, 0.0F, -0.1F, 0.1F, 0.0F, -0.1F, 0.1F, 0.0F, 0.15F, 0.1F); // Import
        gunModel[88].setRotationPoint(3F, -3.45F, -0.5F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.55F, -0.3F, -0.15F, 0.0F, -0.3F, -0.15F, 0.0F, -0.3F, 0.15F, 0.55F, -0.3F, 0.15F, 0.55F, -0.31F, -0.15F, 0.0F, -0.31F, -0.15F, 0.0F, -0.31F, 0.1F, 0.55F, -0.31F, 0.1F); // Import
        gunModel[89].setRotationPoint(4F, -4.65F, -0.5F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.25F, 0.1F, -0.75F, -0.25F, 0.1F, -0.75F, -0.25F, 0.1F, -0.15F, -0.25F, 0.1F, -0.15F, -0.3F, 0.1F, -0.75F, -0.3F, 0.1F, -0.75F, -0.3F, 0.1F, -0.15F, -0.3F, 0.1F); // Import
        gunModel[90].setRotationPoint(5F, -4.2F, -0.5F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.65F, -0.85F, 0.1F, -0.25F, -0.95F, 0.1F, -0.25F, -0.95F, 0.1F, -0.65F, -0.85F, 0.1F, -0.5F, -0.05F, 0.1F, -0.35F, 0.1F, 0.1F, -0.35F, 0.1F, 0.1F, -0.5F, -0.05F, 0.1F); // Import
        gunModel[91].setRotationPoint(2F, -4.3F, -0.5F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.85F, 0.1F, -0.1F, -0.85F, 0.1F, -0.1F, -0.85F, 0.1F, -0.75F, -0.85F, 0.1F, -0.65F, 0.0F, 0.1F, -0.1F, 0.0F, 0.1F, -0.1F, 0.0F, 0.1F, -0.65F, 0.0F, 0.1F); // Import
        gunModel[92].setRotationPoint(2F, -4.2F, -0.5F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -1.1F, 0.15F, 0.0F, -0.85F, 0.15F, 0.0F, -0.85F, 0.15F, 0.0F, -1.1F, 0.15F, 0.0F, 0.15F, 0.2F, 0.0F, -0.1F, 0.2F, 0.0F, -0.1F, 0.2F, 0.0F, 0.15F, 0.2F); // Import
        gunModel[93].setRotationPoint(3F, -3.4F, -0.5F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.75F, 0.1F, -0.35F, -0.75F, 0.1F, -0.35F, -0.75F, 0.1F, -0.5F, -0.75F, 0.1F, -0.5F, -0.05F, 0.1F, -0.35F, -0.15F, 0.1F, -0.35F, -0.15F, 0.1F, -0.5F, -0.05F, 0.1F); // Import
        gunModel[94].setRotationPoint(2F, -4.3F, -0.5F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.05F, 0.1F, -0.25F, -0.05F, 0.1F, -0.25F, -0.05F, 0.1F, -0.5F, -0.05F, 0.1F, -0.5F, -0.85F, 0.1F, -0.35F, -0.85F, 0.1F, -0.35F, -0.85F, 0.1F, -0.5F, -0.85F, 0.1F); // Import
        gunModel[95].setRotationPoint(2F, -3.7F, -0.5F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0.05F, 0.1F, 0.0F, 0.05F, 0.1F, 0.0F, 0.05F, 0.1F, 0.5F, 0.05F, 0.1F, 0.5F, -0.75F, 0.1F, 0.0F, -0.75F, 0.1F, 0.0F, -0.75F, 0.1F, 0.5F, -0.75F, 0.1F); // Import
        gunModel[96].setRotationPoint(3F, -3.9F, -0.5F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.35F, 0.1F, 0.4F, -0.35F, 0.1F, 0.4F, -0.35F, 0.1F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F, 0.1F, 0.4F, -0.35F, 0.1F, 0.4F, -0.35F, 0.1F, -0.35F, -0.35F, 0.1F); // Import
        gunModel[97].setRotationPoint(3.6F, -4F, -0.5F);

        gunModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.85F, 0.15F, -0.65F, -0.85F, 0.15F, -0.65F, -0.85F, 0.15F, -0.35F, -0.85F, 0.15F, -0.25F, -0.05F, 0.15F, -0.65F, -0.05F, 0.15F, -0.65F, -0.05F, 0.15F, -0.25F, -0.05F, 0.15F); // Import
        gunModel[98].setRotationPoint(3.6F, -4.3F, -0.45F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.85F, 0.1F, -0.1F, -0.85F, 0.1F, -0.1F, -0.85F, 0.1F, -0.8F, -0.85F, 0.1F, -0.8F, 0.0F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.8F, 0.0F, 0.1F); // Import
        gunModel[99].setRotationPoint(2.1F, -4.2F, -0.5F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.5F, -0.2F, -0.35F, -0.5F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.5F, -0.2F, -0.35F, -0.5F); // Import
        gunModel[100].setRotationPoint(3.25F, -4.3F, 0.15F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.05F, 0.15F, -0.65F, -0.05F, 0.15F, -0.65F, -0.05F, 0.15F, -0.25F, -0.05F, 0.15F, -0.35F, -0.85F, 0.15F, -0.65F, -0.85F, 0.15F, -0.65F, -0.85F, 0.15F, -0.35F, -0.85F, 0.15F); // Import
        gunModel[101].setRotationPoint(3.6F, -3.7F, -0.45F);

        gunModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, -0.35F, -0.5F, -0.05F, -0.35F, -0.5F, -0.1F, -0.35F, -0.45F, -0.9F, -0.35F, -0.45F, -0.9F, -0.35F, -0.5F, -0.05F, -0.35F, -0.5F, -0.1F, -0.35F, -0.45F, -0.9F, -0.35F, -0.45F); // Import
        gunModel[102].setRotationPoint(3.05F, -4F, 0.15F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F); // Import
        gunModel[103].setRotationPoint(3.25F, -4.25F, 0.2F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F); // Import
        gunModel[104].setRotationPoint(3.25F, -3.75F, 0.2F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.14F, -0.75F, 0.0F, 0.14F, -0.75F, 0.0F, 0.14F, -0.75F, 0.0F, 0.14F, -0.75F, 0.0F, 0.14F, -0.15F, 0.0F, 0.14F, -0.15F, 0.0F, 0.14F, -0.15F, 0.0F, 0.14F, -0.15F, 0.0F); // Import
        gunModel[105].setRotationPoint(2.8F, -4.3F, -0.4F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, -0.76F, 0.0F, 0.05F, -0.76F, 0.0F, 0.05F, -0.76F, 0.0F, 0.05F, -0.76F, 0.0F, 0.14F, -0.15F, 0.0F, 0.14F, -0.15F, 0.0F, 0.14F, -0.15F, 0.0F, 0.14F, -0.15F, 0.0F); // Import
        gunModel[106].setRotationPoint(2.8F, -4.4F, -0.4F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.14F, -0.15F, 0.0F, 0.14F, -0.15F, 0.0F, 0.14F, -0.15F, 0.0F, 0.14F, -0.15F, 0.0F, 0.05F, -0.76F, 0.0F, 0.05F, -0.76F, 0.0F, 0.05F, -0.76F, 0.0F, 0.05F, -0.76F, 0.0F); // Import
        gunModel[107].setRotationPoint(2.8F, -3.6F, -0.4F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.75F, 0.1F, -0.4F, -0.75F, 0.1F, -0.4F, -0.75F, 0.1F, -0.4F, -0.75F, 0.1F, -0.4F, -0.15F, 0.1F, -0.4F, -0.15F, 0.1F, -0.4F, -0.15F, 0.1F, -0.4F, -0.15F, 0.1F); // Import
        gunModel[108].setRotationPoint(2.35F, -4.3F, -0.47F);

        gunModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.75F, 0.1F, -0.45F, -0.75F, 0.1F, -0.45F, -0.75F, 0.1F, -0.45F, -0.75F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F); // Import
        gunModel[109].setRotationPoint(2.35F, -4.35F, -0.47F);

        gunModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.45F, -0.75F, 0.1F, -0.45F, -0.75F, 0.1F, -0.45F, -0.75F, 0.1F, -0.45F, -0.75F, 0.1F); // Import
        gunModel[110].setRotationPoint(2.35F, -3.65F, -0.47F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F); // Import
        gunModel[111].setRotationPoint(2.45F, -4.3F, 0.15F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F); // Import
        gunModel[112].setRotationPoint(2.15F, -4.3F, 0.15F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F); // Import
        gunModel[113].setRotationPoint(2.3F, -4.5F, 0.15F);

        gunModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F); // Import
        gunModel[114].setRotationPoint(2.3F, -4.3F, 0.15F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.5F, -0.45F, -0.45F, -0.5F, -0.45F, -0.45F, -0.5F, -0.45F, -0.45F, -0.5F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F); // Import
        gunModel[115].setRotationPoint(2.3F, -4.6F, 0.15F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F); // Import
        gunModel[116].setRotationPoint(2.3F, -4.65F, 0.15F);

        gunModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F); // Import
        gunModel[117].setRotationPoint(2.3F, -4.85F, 0.15F);

        gunModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F); // Import
        gunModel[118].setRotationPoint(2.3F, -4.75F, 0.15F);

        gunModel[119].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.1F, 0.15F, -0.45F, 0.0F, 0.15F, -0.45F, 0.0F, 0.15F, 0.0F, 0.1F, 0.15F, 0.0F, 0.1F, -0.8F, -0.2F, 0.0F, -0.8F, -0.2F, 0.0F, -0.8F, 0.0F, 0.1F, -0.8F, 0.0F); // Import
        gunModel[119].setRotationPoint(2F, -5.1F, -0.8F);

        gunModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.05F, -0.2F, -0.75F, -0.05F, -0.2F, -0.75F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.15F, -0.8F, -0.15F, -0.75F, -0.8F, -0.15F, -0.75F, -0.8F, 0.0F, -0.15F, -0.8F, 0.0F); // Import
        gunModel[120].setRotationPoint(4.75F, -4.95F, -0.8F);

        gunModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.15F, -0.45F, -0.3F, -0.15F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, -0.05F, -0.45F, -0.3F, -0.05F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F); // Import
        gunModel[121].setRotationPoint(4.45F, -5.05F, -0.8F);

        gunModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.15F, -0.35F, 0.0F, 0.15F, -0.35F, 0.0F, 0.15F, -0.35F, 0.0F, 0.15F, -0.35F, 0.0F, 0.15F, -0.35F, 0.0F, 0.15F, -0.35F, 0.0F, 0.15F, -0.35F, 0.0F, 0.15F, -0.35F, 0.0F); // Import
        gunModel[122].setRotationPoint(2.8F, -4F, -0.6F);

        gunModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F); // Import
        gunModel[123].setRotationPoint(3.25F, -4.3F, -1.3F);

        gunModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F); // Import
        gunModel[124].setRotationPoint(3.25F, -4.15F, -1.3F);

        gunModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.55F, -0.35F, -0.5F, -0.55F, -0.35F, -0.5F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F); // Import
        gunModel[125].setRotationPoint(4.5F, -4.7F, -1.2F);

        gunModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.35F, -0.5F, -0.45F, -0.35F, -0.5F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.5F, -0.45F, -0.35F, -0.5F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F); // Import
        gunModel[126].setRotationPoint(4.5F, -4.7F, -1.2F);

        gunModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.35F, -0.5F, -0.55F, -0.35F, -0.5F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Import
        gunModel[127].setRotationPoint(4.5F, -4.7F, -1.2F);

        gunModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F, 0.0F, -0.55F, -0.4F, 0.0F, -0.55F, -0.4F, 0.0F, -0.55F, -0.4F, 0.0F, -0.55F, -0.4F); // Import
        gunModel[128].setRotationPoint(2.55F, -4.7F, -1.2F);

        gunModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.45F, -0.4F, 0.0F, -0.45F, -0.4F, 0.0F, -0.45F, -0.4F, 0.0F, -0.45F, -0.4F, 0.0F, -0.45F, -0.4F, 0.0F, -0.45F, -0.4F, 0.0F, -0.45F, -0.4F, 0.0F, -0.45F, -0.4F); // Import
        gunModel[129].setRotationPoint(2.55F, -4.7F, -1.2F);

        gunModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.55F, -0.4F, 0.0F, -0.55F, -0.4F, 0.0F, -0.55F, -0.4F, 0.0F, -0.55F, -0.4F, 0.0F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[130].setRotationPoint(2.55F, -4.7F, -1.2F);

        gunModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.1F, -0.25F, 0.0F, 0.1F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.1F, -0.5F, 0.0F); // Import
        gunModel[131].setRotationPoint(-0.3F, -4.2F, -0.5F);

        gunModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.2F, -0.25F, 0.0F, -0.5F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.5F, -0.4F, 0.0F); // Import
        gunModel[132].setRotationPoint(-0.3F, -3.95F, -0.5F);

        gunModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.45F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.45F, 0.0F, -0.5F, -0.45F, 0.0F); // Import
        gunModel[133].setRotationPoint(-0.3F, -3.6F, -0.5F);

        gunModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.2F, -0.75F, -0.35F, 0.05F, -0.75F, -0.35F, 0.05F, -0.2F, -0.45F, -0.2F, -0.4F, -0.3F, -0.2F, -0.35F, -0.4F, 0.05F, -0.35F, -0.4F, 0.05F, -0.4F, -0.3F, -0.2F); // Import
        gunModel[134].setRotationPoint(-0.5F, -3.95F, -0.5F);

        gunModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.2F, -0.35F, -0.25F, 0.05F, -0.35F, -0.25F, 0.05F, -0.4F, -0.35F, -0.2F, -0.45F, -0.45F, -0.2F, -0.3F, -0.45F, 0.05F, -0.3F, -0.45F, 0.05F, -0.45F, -0.45F, -0.2F); // Import
        gunModel[135].setRotationPoint(-0.5F, -3.6F, -0.5F);

        gunModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.8F, -0.4F, -0.1F, -0.8F, 0.05F, -0.1F, -0.1F, 0.05F, -0.1F, -0.1F, 0.05F, -0.1F, -0.8F, 0.05F, -0.1F); // Import
        gunModel[136].setRotationPoint(2.1F, -3.2F, -0.5F);

        gunModel[137].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.9F, -0.4F, -0.7F, -0.9F, -0.4F, -0.7F, -0.9F, -0.5F, -0.15F, -0.9F, -0.5F, -0.25F, 0.0F, -0.4F, -0.6F, 0.0F, -0.4F, -0.6F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F); // Import
        gunModel[137].setRotationPoint(0.9F, -3.45F, -0.45F);

        gunModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.65F, -0.1F, -0.75F, -0.85F, -0.1F, -0.75F, -0.85F, -0.1F, -0.1F, -0.65F, -0.1F, -0.1F, 0.05F, -0.1F, -0.75F, 0.05F, -0.1F, -0.75F, 0.05F, -0.1F, -0.1F, 0.05F, -0.1F); // Import
        gunModel[138].setRotationPoint(1.5F, -3.2F, -0.5F);

        gunModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.4F, -0.1F, -0.8F, -0.4F, -0.1F, -0.8F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, 0.05F, -0.1F, -0.8F, 0.05F, -0.1F, -0.8F, 0.05F, -0.1F, -0.1F, 0.05F, -0.1F); // Import
        gunModel[139].setRotationPoint(1.4F, -3.2F, -0.5F);

        gunModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.4F, -0.1F, -0.75F, -0.4F, -0.1F, -0.75F, -0.4F, -0.1F, 0.2F, -0.4F, -0.1F, 0.2F, -0.35F, -0.1F, -0.9F, -0.35F, -0.1F, -0.9F, -0.35F, -0.1F, 0.2F, -0.35F, -0.1F); // Import
        gunModel[140].setRotationPoint(1.5F, -3.45F, -0.5F);

        gunModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.05F, -0.2F, -0.45F, -0.7F, -0.15F, -0.7F, -0.7F, -0.15F, -0.7F, 0.05F, -0.2F, -0.45F, 0.1F, -0.7F, -0.45F, -0.7F, -0.65F, -0.7F, -0.7F, -0.65F, -0.7F, 0.1F, -0.7F, -0.45F); // Import
        gunModel[141].setRotationPoint(0F, -0.55F, -1F);

        gunModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.05F, 0.3F, -0.7F, -0.8F, 0.3F, -0.45F, -0.8F, 0.3F, -0.45F, 0.05F, 0.3F, -0.7F, 0.25F, -0.95F, -0.7F, -1.0F, -0.95F, -0.45F, -1.0F, -0.95F, -0.45F, 0.25F, -0.95F, -0.7F); // Import
        gunModel[142].setRotationPoint(0F, -2.55F, -1F);

        gunModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.6F, -0.6F, -0.7F, -1.25F, -0.6F, -0.45F, -1.25F, -0.6F, -0.45F, 0.6F, -0.6F, -0.7F, 0.75F, -0.2F, -0.7F, -1.4F, -0.2F, -0.45F, -1.4F, -0.2F, -0.45F, 0.75F, -0.2F, -0.7F); // Import
        gunModel[143].setRotationPoint(0F, -2.75F, -1F);

        gunModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.65F, -0.5F, -0.7F, -1.3F, -0.5F, -0.45F, -1.3F, -0.5F, -0.45F, 0.65F, -0.5F, -0.7F, 1.15F, 0.25F, -0.7F, -1.85F, 0.35F, -0.45F, -1.85F, 0.35F, -0.45F, 1.15F, 0.25F, -0.7F); // Import
        gunModel[144].setRotationPoint(-0.1F, -2.45F, -1F);

        gunModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.85F, -0.85F, -0.7F, -1.55F, -0.95F, -0.45F, -1.55F, -0.95F, -0.45F, 0.85F, -0.85F, -0.7F, 1.15F, 0.4F, -0.7F, -1.9F, 0.45F, -0.45F, -1.9F, 0.45F, -0.45F, 1.15F, 0.4F, -0.7F); // Import
        gunModel[145].setRotationPoint(-0.4F, -2.05F, -1F);

        gunModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.25F, 0.25F, -0.7F, -1.0F, 0.25F, -0.45F, -1.0F, 0.25F, -0.45F, 0.25F, 0.25F, -0.7F, 0.6F, -0.9F, -0.7F, -1.25F, -0.9F, -0.45F, -1.25F, -0.9F, -0.45F, 0.6F, -0.9F, -0.7F); // Import
        gunModel[146].setRotationPoint(0F, -2.25F, -1F);

        gunModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0.3F, 0.05F, 0.5F, 0.3F, 0.05F, 0.5F, 0.3F, 0.05F, -0.2F, 0.3F, 0.05F, 0.0F, -0.95F, 0.05F, 0.5F, -0.95F, 0.05F, 0.5F, -0.95F, 0.05F, 0.0F, -0.95F, 0.05F); // Import
        gunModel[147].setRotationPoint(0F, -2.55F, -0.5F);

        gunModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.25F, 0.05F, 0.5F, 0.25F, 0.05F, 0.5F, 0.25F, 0.05F, 0.0F, 0.25F, 0.05F, 0.25F, -0.9F, 0.05F, 0.5F, -0.9F, 0.05F, 0.5F, -0.9F, 0.05F, 0.25F, -0.9F, 0.05F); // Import
        gunModel[148].setRotationPoint(0F, -2.25F, -0.5F);

        gunModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.6F, 0.05F, 0.1F, -0.6F, 0.05F, 0.1F, -0.6F, 0.05F, 0.25F, -0.6F, 0.05F, 0.4F, -0.2F, 0.05F, -0.05F, -0.2F, 0.05F, -0.05F, -0.2F, 0.05F, 0.4F, -0.2F, 0.05F); // Import
        gunModel[149].setRotationPoint(0F, -2.75F, -0.5F);

        gunModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.3F, -0.5F, 0.05F, 0.05F, -0.5F, 0.05F, 0.05F, -0.5F, 0.05F, 0.3F, -0.5F, 0.05F, 0.85F, 0.35F, 0.05F, -0.95F, 1.1F, 0.05F, -0.95F, 1.1F, 0.05F, 0.85F, 0.35F, 0.05F); // Import
        gunModel[150].setRotationPoint(-0.1F, -2.45F, -0.5F);

        gunModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.5F, -0.4F, -0.7F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F, -0.7F, -0.5F, -0.4F, -0.7F); // Import
        gunModel[151].setRotationPoint(0.8F, -2.55F, -1F);

        gunModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.6F, -0.45F, -0.3F, -0.8F, -0.7F, -0.3F, -0.8F, -0.7F, -0.5F, -0.6F, -0.45F, -0.35F, -0.2F, -0.45F, -0.5F, -0.05F, -0.7F, -0.5F, -0.05F, -0.7F, -0.35F, -0.2F, -0.45F); // Import
        gunModel[152].setRotationPoint(0.6F, -2.75F, -1F);

        gunModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.45F, 0.15F, -0.45F, -0.4F, 0.0F, -0.7F, -0.4F, 0.0F, -0.7F, -0.45F, 0.15F, -0.45F, 0.55F, 0.45F, -0.45F, -1.2F, 0.4F, -0.7F, -1.2F, 0.4F, -0.7F, 0.55F, 0.45F, -0.45F); // Import
        gunModel[153].setRotationPoint(0.5F, -1.8F, -1F);

        gunModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.1F, -0.7F, -0.45F, -0.7F, -0.75F, -0.7F, -0.7F, -0.75F, -0.7F, 0.1F, -0.7F, -0.45F, 0.1F, -0.2F, -0.5F, -0.75F, -0.15F, -0.75F, -0.75F, -0.15F, -0.75F, 0.1F, -0.2F, -0.5F); // Import
        gunModel[154].setRotationPoint(0F, -0.95F, -1F);

        gunModel[155].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F); // Import
        gunModel[155].setRotationPoint(-1.1F, -4.2F, -0.5F);

        gunModel[156].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F); // Import
        gunModel[156].setRotationPoint(-1.1F, -4.3F, -0.5F);

        gunModel[157].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F); // Import
        gunModel[157].setRotationPoint(-1.1F, -4.4F, -0.5F);

        gunModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.5F, 0.001F, -0.4F, -0.5F, 0.001F, -0.4F, -0.5F, 0.001F, -0.4F, -0.5F, 0.001F, -0.4F, -0.4F, 0.001F, -0.4F, -0.4F, 0.001F, -0.4F, -0.4F, 0.001F, -0.4F, -0.4F, 0.001F); // Import
        gunModel[158].setRotationPoint(0.2F, -4F, -0.5F);

        gunModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.5F, 0.001F, -0.4F, -0.5F, 0.001F, -0.4F, -0.5F, 0.001F, -0.4F, -0.5F, 0.001F, -0.4F, -0.4F, 0.001F, -0.4F, -0.4F, 0.001F, -0.4F, -0.4F, 0.001F, -0.4F, -0.4F, 0.001F); // Import
        gunModel[159].setRotationPoint(1F, -4F, -0.5F);

        gunModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.5F, 0.001F, -0.4F, -0.5F, 0.001F, -0.4F, -0.5F, 0.001F, -0.4F, -0.5F, 0.001F, -0.4F, -0.4F, 0.001F, -0.4F, -0.4F, 0.001F, -0.4F, -0.4F, 0.001F, -0.4F, -0.4F, 0.001F); // Import
        gunModel[160].setRotationPoint(0.6F, -4.35F, -0.5F);

        gunModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F); // Import
        gunModel[161].setRotationPoint(2.3F, -3.9F, -1.15F);

        gunModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F); // Import
        gunModel[162].setRotationPoint(2.3F, -3.95F, -1.15F);

        gunModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F); // Import
        gunModel[163].setRotationPoint(2.3F, -4.05F, -1.15F);

        gunModel[164].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.35F, -0.5F, -0.3F, -0.35F, -0.5F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F); // Import
        gunModel[164].setRotationPoint(2.3F, -4.25F, -1.1F);

        gunModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.45F, -0.2F, 0.1F, -0.45F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.45F, -0.2F, 0.1F); // Import
        gunModel[165].setRotationPoint(-1.1F, -5F, -0.5F);

        gunModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, -0.8F, 0.1F, -0.3F, -0.8F, 0.1F, -0.3F, -0.8F, 0.1F, -0.3F, -0.8F, 0.1F); // Import
        gunModel[166].setRotationPoint(-1.1F, -5F, -0.5F);

        gunModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.8F, 0.1F, -0.3F, -0.8F, 0.1F, -0.3F, -0.8F, 0.1F, -0.3F, -0.8F, 0.1F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F); // Import
        gunModel[167].setRotationPoint(-1.1F, -5F, -0.5F);

        gunModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.45F, -0.2F, 0.1F, -0.45F, -0.55F, 0.1F, -0.4F, -0.55F, 0.1F, -0.4F, -0.55F, 0.1F, -0.45F, -0.55F, 0.1F); // Import
        gunModel[168].setRotationPoint(-1.25F, -5F, -0.5F);

        gunModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.15F, 0.1F, -0.4F, -0.15F, 0.1F, -0.4F, -0.15F, 0.1F, -0.45F, -0.15F, 0.1F, -0.45F, -0.6F, 0.1F, -0.4F, -0.6F, 0.1F, -0.4F, -0.6F, 0.1F, -0.45F, -0.6F, 0.1F); // Import
        gunModel[169].setRotationPoint(-1.25F, -4.6F, -0.5F);

        gunModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.5F, -0.45F, -0.5F, -0.45F, -0.45F, -0.5F, -0.4F, -0.5F, -0.4F, -0.5F, -0.5F, -0.45F, -0.45F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.35F, -0.5F, -0.4F, -0.45F, -0.5F); // Import
        gunModel[170].setRotationPoint(2.1F, -4.3F, -1.1F);

        gunModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.45F, -0.5F, -0.25F, -0.45F, -0.5F, -0.4F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.4F, -0.45F, -0.5F, -0.35F, -0.45F, -0.5F); // Import
        gunModel[171].setRotationPoint(2.8F, -4.15F, -1.1F);

        gunModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.4F, -0.2F, -0.5F, -0.35F, -0.2F, -0.5F, -0.4F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.4F, -0.3F, -0.5F, -0.35F, -0.3F, -0.5F); // Import
        gunModel[172].setRotationPoint(2.8F, -3.8F, -1.1F);

        gunModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.4F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.45F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.45F, -0.5F, -0.5F); // Import
        gunModel[173].setRotationPoint(2.8F, -3.45F, -1.1F);

        gunModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.45F, -0.5F, -0.35F, -0.45F, -0.5F, -0.3F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.5F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.35F, -0.5F, -0.4F, -0.45F, -0.5F); // Import
        gunModel[174].setRotationPoint(2.7F, -3.75F, -1.1F);

        gunModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, -0.5F, -0.45F, -0.3F, -0.5F, -0.45F, -0.3F, -0.45F, -0.5F, -0.25F, -0.45F, -0.5F); // Import
        gunModel[175].setRotationPoint(2.4F, -3.75F, -1.1F);

        gunModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.475F, -0.475F, -0.45F, -0.5F, -0.45F, -0.45F, -0.5F, -0.4F, -0.5F, -0.45F, -0.45F, -0.5F, -0.475F, -0.525F, -0.45F, -0.5F, -0.5F, -0.45F, -0.5F, -0.45F, -0.5F, -0.45F, -0.5F, -0.5F); // Import
        gunModel[176].setRotationPoint(2.15F, -3.75F, -1.1F);

        gunModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.1F, -0.35F, -0.7F, -0.1F, -0.35F, -0.25F, -0.3F, -0.35F, 0.0F, -0.3F, -0.35F, -0.2F, -0.8F, -0.3F, -0.7F, -0.8F, -0.3F, -0.4F, -0.55F, -0.4F, 0.0F, -0.55F, -0.4F); // Import
        gunModel[177].setRotationPoint(1.9F, -5.2F, -1.25F);

        gunModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0.15F, -0.45F, -0.6F, 0.15F, -0.45F, -0.15F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.3F, -0.95F, -0.35F, -0.6F, -0.95F, -0.35F, -0.15F, -0.75F, -0.35F, -0.1F, -0.75F, -0.35F); // Import
        gunModel[178].setRotationPoint(1.8F, -5.15F, -1.25F);

        gunModel[179].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.55F, -0.4F, -0.45F, -0.55F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.55F, -0.45F, -0.5F, -0.55F); // Import
        gunModel[179].setRotationPoint(-0.4F, -3.4F, 0.15F);

        gunModel[180].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.0F, -0.6F, -0.2F, 0.0F, -0.6F, -0.2F, 0.0F, -0.6F, 0.3F, 0.0F, -0.6F, 0.3F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F); // Import
        gunModel[180].setRotationPoint(-4F, -4.85F, -0.75F);

        gunModel[181].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.6F, -0.2F, 0.0F, -0.6F, -0.2F, 0.0F, -0.6F, 0.3F, 0.0F, -0.6F, 0.3F); // Import
        gunModel[181].setRotationPoint(-4F, -5.15F, -0.75F);

        gunModel[182].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, -0.5F, -0.2F, 0.0F, -0.5F, -0.2F, 0.0F, -0.5F, 0.3F, 0.0F, -0.5F, 0.3F); // Import
        gunModel[182].setRotationPoint(-4F, -4.75F, -0.75F);

        gunModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[183].setRotationPoint(12.2F, -6.2F, -0.25F);

        gunModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[184].setRotationPoint(11.8F, -6.2F, -0.25F);

        gunModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[185].setRotationPoint(11.4F, -6.2F, -0.25F);

        gunModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[186].setRotationPoint(11F, -6.2F, -0.25F);

        gunModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[187].setRotationPoint(10.6F, -6.2F, -0.25F);

        gunModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[188].setRotationPoint(14.2F, -6.2F, -0.25F);

        gunModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[189].setRotationPoint(13.8F, -6.2F, -0.25F);

        gunModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[190].setRotationPoint(13.4F, -6.2F, -0.25F);

        gunModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[191].setRotationPoint(13F, -6.2F, -0.25F);

        gunModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[192].setRotationPoint(12.6F, -6.2F, -0.25F);

        gunModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[193].setRotationPoint(16.2F, -6.2F, -0.25F);

        gunModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[194].setRotationPoint(15.8F, -6.2F, -0.25F);

        gunModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[195].setRotationPoint(15.4F, -6.2F, -0.25F);

        gunModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[196].setRotationPoint(15F, -6.2F, -0.25F);

        gunModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[197].setRotationPoint(14.6F, -6.2F, -0.25F);

        gunModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[198].setRotationPoint(17.4F, -6.2F, -0.25F);

        gunModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[199].setRotationPoint(17F, -6.2F, -0.25F);

        gunModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[200].setRotationPoint(16.6F, -6.2F, -0.25F);

        gunModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.3F, -0.35F, 0.0F, -0.3F, -0.35F, 0.0F, -0.3F, -0.55F, -0.1F, -0.3F, -0.55F, -0.1F, -0.65F, -0.35F, 0.0F, -0.65F, -0.35F, 0.0F, -0.65F, -0.5F, -0.1F, -0.65F, -0.5F); // Import
        gunModel[201].setRotationPoint(4F, -5.45F, 0F);

        gunModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.39F, -0.3F, 0.15F, 0.1F, -0.3F, 0.15F, 0.1F, -0.3F, 0.15F, 0.39F, -0.3F, 0.15F, 0.095F, -0.31F, 0.0F, 0.1F, -0.31F, 0.0F, 0.1F, -0.31F, 0.0F, 0.095F, -0.31F, 0.0F); // Import
        gunModel[202].setRotationPoint(0.4F, -4.65F, -0.5F);

        gunModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.3F, -0.45F, -0.2F, -0.3F, -0.45F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.45F, -0.2F, -0.3F, -0.45F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F); // Import
        gunModel[203].setRotationPoint(3.25F, -4.65F, 0.15F);

        gunModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.2F, -0.15F, -0.05F, -0.2F, -0.15F, -0.05F, -0.2F, 0.1F, 0.0F, -0.2F, 0.1F, 0.0F, -0.31F, -0.15F, -0.05F, -0.31F, -0.15F, -0.05F, -0.31F, 0.1F, 0.0F, -0.31F, 0.1F); // Import
        gunModel[204].setRotationPoint(2.5F, -4.65F, -0.5F);

        gunModel[205].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.01F, -0.45F, 0.15F, -0.4F, -0.45F, 0.15F, -0.4F, -0.45F, 0.15F, -0.01F, -0.45F, 0.15F, -0.01F, -0.45F, 0.15F, -0.5F, -0.45F, 0.15F, -0.5F, -0.45F, 0.15F, -0.01F, -0.45F, 0.15F); // Import
        gunModel[205].setRotationPoint(0F, -4.9F, -0.5F);

        gunModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.5F, -0.45F, -0.35F, -0.5F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.5F, -0.45F, -0.35F, -0.5F); // Import
        gunModel[206].setRotationPoint(3.5F, -4F, 0.15F);

        gunModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.35F, -0.45F, 0.0F, 0.3F, -0.45F, 0.0F, 0.3F, -0.45F, 0.0F, 0.35F, -0.45F, 0.0F, 0.25F, -0.45F, 0.0F, 0.3F, -0.45F, 0.0F, 0.3F, -0.45F, 0.0F, 0.25F, -0.45F, 0.0F); // Import
        gunModel[207].setRotationPoint(3.7F, -4.9F, -0.35F);

        gunModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -1.15F, -0.2F, -0.2F, -1.0F, -0.2F, -0.2F, -1.0F, -0.2F, -0.25F, -1.15F, -0.2F, -0.25F, 0.25F, -0.2F, -0.2F, 0.15F, -0.2F, -0.2F, 0.15F, -0.2F, -0.25F, 0.25F, -0.2F); // Import
        gunModel[208].setRotationPoint(1.95F, -3.3F, -0.5F);

        gunModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F); // Import
        gunModel[209].setRotationPoint(1.6F, -2.6F, -0.5F);

        gunModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, 0.0F, 0.25F, -0.085F, 0.0F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F); // Import
        gunModel[210].setRotationPoint(5.4F, -5F, -0.5F);

        gunModel[211].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0.0F, -0.1F, 0.135F, -0.7F, -0.1F, 0.135F, -0.7F, -0.1F, 0.135F, 0.0F, -0.1F, 0.135F, 0.0F, -0.8F, 0.2F, -0.7F, -0.8F, 0.2F, -0.7F, -0.8F, 0.2F, 0.0F, -0.8F, 0.2F); // Import
        gunModel[211].setRotationPoint(5.4F, -5F, -0.5F);

        gunModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, 0.0F, 0.0F, 0.07F, 0.0F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, 0.0F, -0.9F, 0.135F); // Import
        gunModel[212].setRotationPoint(5.4F, -5F, -0.5F);

        gunModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, 0.0F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, 0.0F, -1.0F, 0.07F); // Import
        gunModel[213].setRotationPoint(5.4F, -5F, -0.5F);

        gunModel[214].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0.0F, 0.35F, -0.15F, 0.2F, 0.35F, -0.15F, 0.2F, 0.35F, -0.15F, 0.0F, 0.35F, -0.15F, 0.0F, -1.25F, -0.085F, 0.2F, -1.25F, -0.085F, 0.2F, -1.25F, -0.085F, 0.0F, -1.25F, -0.085F); // Import
        gunModel[214].setRotationPoint(5.4F, -5F, -0.5F);

        gunModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F); // Import
        gunModel[215].setRotationPoint(6.8F, -5F, -0.5F);

        gunModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F); // Import
        gunModel[216].setRotationPoint(6.8F, -5F, -0.5F);

        gunModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F); // Import
        gunModel[217].setRotationPoint(6.8F, -5F, -0.5F);

        gunModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F); // Import
        gunModel[218].setRotationPoint(6.5F, -5F, -0.5F);

        gunModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F); // Import
        gunModel[219].setRotationPoint(6.5F, -5F, -0.5F);

        gunModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F); // Import
        gunModel[220].setRotationPoint(6.5F, -5F, -0.5F);

        gunModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F); // Import
        gunModel[221].setRotationPoint(7.6F, -5F, -0.5F);

        gunModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F); // Import
        gunModel[222].setRotationPoint(7.6F, -5F, -0.5F);

        gunModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F); // Import
        gunModel[223].setRotationPoint(7.6F, -5F, -0.5F);

        gunModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F); // Import
        gunModel[224].setRotationPoint(7.9F, -5F, -0.5F);

        gunModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F); // Import
        gunModel[225].setRotationPoint(7.9F, -5F, -0.5F);

        gunModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F); // Import
        gunModel[226].setRotationPoint(7.9F, -5F, -0.5F);

        gunModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F); // Import
        gunModel[227].setRotationPoint(8.7F, -5F, -0.5F);

        gunModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F); // Import
        gunModel[228].setRotationPoint(8.7F, -5F, -0.5F);

        gunModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F); // Import
        gunModel[229].setRotationPoint(8.7F, -5F, -0.5F);

        gunModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F); // Import
        gunModel[230].setRotationPoint(9F, -5F, -0.5F);

        gunModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F); // Import
        gunModel[231].setRotationPoint(9F, -5F, -0.5F);

        gunModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F); // Import
        gunModel[232].setRotationPoint(9F, -5F, -0.5F);

        gunModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F); // Import
        gunModel[233].setRotationPoint(9.8F, -5F, -0.5F);

        gunModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F); // Import
        gunModel[234].setRotationPoint(9.8F, -5F, -0.5F);

        gunModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F); // Import
        gunModel[235].setRotationPoint(9.8F, -5F, -0.5F);

        gunModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F); // Import
        gunModel[236].setRotationPoint(10.1F, -5F, -0.5F);

        gunModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F); // Import
        gunModel[237].setRotationPoint(10.1F, -5F, -0.5F);

        gunModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F); // Import
        gunModel[238].setRotationPoint(10.1F, -5F, -0.5F);

        gunModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F); // Import
        gunModel[239].setRotationPoint(10.9F, -5F, -0.5F);

        gunModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F); // Import
        gunModel[240].setRotationPoint(10.9F, -5F, -0.5F);

        gunModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F); // Import
        gunModel[241].setRotationPoint(10.9F, -5F, -0.5F);

        gunModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F); // Import
        gunModel[242].setRotationPoint(11.2F, -5F, -0.5F);

        gunModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F); // Import
        gunModel[243].setRotationPoint(11.2F, -5F, -0.5F);

        gunModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F); // Import
        gunModel[244].setRotationPoint(11.2F, -5F, -0.5F);

        gunModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F); // Import
        gunModel[245].setRotationPoint(14.2F, -5F, -0.5F);

        gunModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F); // Import
        gunModel[246].setRotationPoint(14.5F, -5F, -0.5F);

        gunModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F); // Import
        gunModel[247].setRotationPoint(14.5F, -5F, -0.5F);

        gunModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F); // Import
        gunModel[248].setRotationPoint(14.5F, -5F, -0.5F);

        gunModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F); // Import
        gunModel[249].setRotationPoint(14.2F, -5F, -0.5F);

        gunModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F); // Import
        gunModel[250].setRotationPoint(14.2F, -5F, -0.5F);

        gunModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, 0.25F, -0.085F, 0.8F, 0.25F, -0.085F, 0.8F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, -0.8F, -1.15F, -0.025F, 0.6F, -1.15F, -0.025F, 0.6F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F); // Import
        gunModel[251].setRotationPoint(15.3F, -5F, -0.5F);

        gunModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0.15F, -0.025F, 0.6F, 0.15F, -0.025F, 0.6F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, -0.85F, -1.0F, 0.07F, 0.45F, -1.0F, 0.07F, 0.45F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F); // Import
        gunModel[252].setRotationPoint(15.3F, -5F, -0.5F);

        gunModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.85F, 0.0F, 0.07F, 0.45F, 0.0F, 0.07F, 0.45F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, -0.8F, -0.9F, 0.135F, 0.4F, -0.9F, 0.135F, 0.4F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F); // Import
        gunModel[253].setRotationPoint(15.3F, -5F, -0.5F);

        gunModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F); // Import
        gunModel[254].setRotationPoint(15.6F, -5F, -0.5F);

        gunModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F); // Import
        gunModel[255].setRotationPoint(15.6F, -5F, -0.5F);

        gunModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F); // Import
        gunModel[256].setRotationPoint(15.6F, -5F, -0.5F);

        gunModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F); // Import
        gunModel[257].setRotationPoint(13.1F, -5F, -0.5F);

        gunModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F); // Import
        gunModel[258].setRotationPoint(13.1F, -5F, -0.5F);

        gunModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F); // Import
        gunModel[259].setRotationPoint(13.1F, -5F, -0.5F);

        gunModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F); // Import
        gunModel[260].setRotationPoint(13.4F, -5F, -0.5F);

        gunModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F); // Import
        gunModel[261].setRotationPoint(13.4F, -5F, -0.5F);

        gunModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F); // Import
        gunModel[262].setRotationPoint(13.4F, -5F, -0.5F);

        gunModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F); // Import
        gunModel[263].setRotationPoint(12F, -5F, -0.5F);

        gunModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F); // Import
        gunModel[264].setRotationPoint(12F, -5F, -0.5F);

        gunModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F); // Import
        gunModel[265].setRotationPoint(12F, -5F, -0.5F);

        gunModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F); // Import
        gunModel[266].setRotationPoint(12.3F, -5F, -0.5F);

        gunModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F); // Import
        gunModel[267].setRotationPoint(12.3F, -5F, -0.5F);

        gunModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F); // Import
        gunModel[268].setRotationPoint(12.3F, -5F, -0.5F);

        gunModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.45F, -0.5F, -0.1F, -0.45F, -0.45F, -0.1F, -0.5F, -0.45F, -0.1F, -0.5F, -0.45F, -0.1F, -0.45F, -0.45F, -0.1F); // Import
        gunModel[269].setRotationPoint(17F, -5.9F, -0.5F);

        gunModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.45F, -0.5F, -0.1F, -0.45F, -0.45F, -0.1F, -0.5F, -0.45F, -0.1F, -0.5F, -0.45F, -0.1F, -0.45F, -0.45F, -0.1F); // Import
        gunModel[270].setRotationPoint(16.8F, -5.9F, -0.5F);

        gunModel[271].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.9F, 0.135F, 0.25F, -0.9F, 0.135F, 0.25F, -0.9F, 0.135F, 0.0F, -0.9F, 0.135F, 0.0F, 0.0F, 0.07F, 0.15F, 0.0F, 0.07F, 0.15F, 0.0F, 0.07F, 0.0F, 0.0F, 0.07F); // Import
        gunModel[271].setRotationPoint(5.4F, -5.1F, -0.5F);

        gunModel[272].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -1.0F, 0.07F, 0.15F, -1.0F, 0.07F, 0.15F, -1.0F, 0.07F, 0.0F, -1.0F, 0.07F, 0.0F, 0.15F, -0.025F, 0.1F, 0.15F, -0.025F, 0.1F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F); // Import
        gunModel[272].setRotationPoint(5.4F, -5.1F, -0.5F);

        gunModel[273].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -1.15F, -0.025F, 0.1F, -1.15F, -0.025F, 0.1F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, 0.0F, 0.25F, -0.085F, 0.15F, 0.25F, -0.085F, 0.15F, 0.25F, -0.085F, 0.0F, 0.25F, -0.085F); // Import
        gunModel[273].setRotationPoint(5.4F, -5.1F, -0.5F);

        gunModel[274].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0.0F, -0.8F, 0.2F, -0.7F, -0.8F, 0.2F, -0.7F, -0.8F, 0.2F, 0.0F, -0.8F, 0.2F, 0.0F, -0.1F, 0.135F, -0.7F, -0.1F, 0.135F, -0.7F, -0.1F, 0.135F, 0.0F, -0.1F, 0.135F); // Import
        gunModel[274].setRotationPoint(5.4F, -5.1F, -0.5F);

        gunModel[275].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0.0F, -1.25F, -0.085F, 0.2F, -1.25F, -0.085F, 0.2F, -1.25F, -0.085F, 0.0F, -1.25F, -0.085F, 0.0F, 0.35F, -0.15F, 0.2F, 0.35F, -0.15F, 0.2F, 0.35F, -0.15F, 0.0F, 0.35F, -0.15F); // Import
        gunModel[275].setRotationPoint(5.4F, -5.1F, -0.5F);

        gunModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F); // Import
        gunModel[276].setRotationPoint(7.9F, -5.1F, -0.5F);

        gunModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F); // Import
        gunModel[277].setRotationPoint(7.9F, -5.1F, -0.5F);

        gunModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F); // Import
        gunModel[278].setRotationPoint(7.9F, -5.1F, -0.5F);

        gunModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F); // Import
        gunModel[279].setRotationPoint(7.6F, -5.1F, -0.5F);

        gunModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F); // Import
        gunModel[280].setRotationPoint(7.6F, -5.1F, -0.5F);

        gunModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F); // Import
        gunModel[281].setRotationPoint(7.6F, -5.1F, -0.5F);

        gunModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F); // Import
        gunModel[282].setRotationPoint(8.7F, -5.1F, -0.5F);

        gunModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F); // Import
        gunModel[283].setRotationPoint(8.7F, -5.1F, -0.5F);

        gunModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F); // Import
        gunModel[284].setRotationPoint(8.7F, -5.1F, -0.5F);

        gunModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F); // Import
        gunModel[285].setRotationPoint(9F, -5.1F, -0.5F);

        gunModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F); // Import
        gunModel[286].setRotationPoint(9F, -5.1F, -0.5F);

        gunModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F); // Import
        gunModel[287].setRotationPoint(9F, -5.1F, -0.5F);

        gunModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F); // Import
        gunModel[288].setRotationPoint(9.8F, -5.1F, -0.5F);

        gunModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F); // Import
        gunModel[289].setRotationPoint(9.8F, -5.1F, -0.5F);

        gunModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F); // Import
        gunModel[290].setRotationPoint(9.8F, -5.1F, -0.5F);

        gunModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F); // Import
        gunModel[291].setRotationPoint(10.1F, -5.1F, -0.5F);

        gunModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F); // Import
        gunModel[292].setRotationPoint(10.1F, -5.1F, -0.5F);

        gunModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F); // Import
        gunModel[293].setRotationPoint(10.1F, -5.1F, -0.5F);

        gunModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F); // Import
        gunModel[294].setRotationPoint(10.9F, -5.1F, -0.5F);

        gunModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F); // Import
        gunModel[295].setRotationPoint(10.9F, -5.1F, -0.5F);

        gunModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F); // Import
        gunModel[296].setRotationPoint(10.9F, -5.1F, -0.5F);

        gunModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F); // Import
        gunModel[297].setRotationPoint(11.2F, -5.1F, -0.5F);

        gunModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F); // Import
        gunModel[298].setRotationPoint(11.2F, -5.1F, -0.5F);

        gunModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F); // Import
        gunModel[299].setRotationPoint(11.2F, -5.1F, -0.5F);

        gunModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F); // Import
        gunModel[300].setRotationPoint(12F, -5.1F, -0.5F);

        gunModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F); // Import
        gunModel[301].setRotationPoint(12F, -5.1F, -0.5F);

        gunModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F); // Import
        gunModel[302].setRotationPoint(12F, -5.1F, -0.5F);

        gunModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F); // Import
        gunModel[303].setRotationPoint(12.3F, -5.1F, -0.5F);

        gunModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F); // Import
        gunModel[304].setRotationPoint(12.3F, -5.1F, -0.5F);

        gunModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F); // Import
        gunModel[305].setRotationPoint(12.3F, -5.1F, -0.5F);

        gunModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F); // Import
        gunModel[306].setRotationPoint(13.4F, -5.1F, -0.5F);

        gunModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F); // Import
        gunModel[307].setRotationPoint(13.4F, -5.1F, -0.5F);

        gunModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F); // Import
        gunModel[308].setRotationPoint(13.4F, -5.1F, -0.5F);

        gunModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F); // Import
        gunModel[309].setRotationPoint(13.1F, -5.1F, -0.5F);

        gunModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F); // Import
        gunModel[310].setRotationPoint(13.1F, -5.1F, -0.5F);

        gunModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F); // Import
        gunModel[311].setRotationPoint(13.1F, -5.1F, -0.5F);

        gunModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F); // Import
        gunModel[312].setRotationPoint(14.5F, -5.1F, -0.5F);

        gunModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F); // Import
        gunModel[313].setRotationPoint(14.5F, -5.1F, -0.5F);

        gunModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F); // Import
        gunModel[314].setRotationPoint(14.5F, -5.1F, -0.5F);

        gunModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F); // Import
        gunModel[315].setRotationPoint(14.2F, -5.1F, -0.5F);

        gunModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F); // Import
        gunModel[316].setRotationPoint(14.2F, -5.1F, -0.5F);

        gunModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F); // Import
        gunModel[317].setRotationPoint(14.2F, -5.1F, -0.5F);

        gunModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.15F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, 0.15F, -0.9F, 0.135F, 0.05F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F, 0.05F, 0.0F, 0.07F); // Import
        gunModel[318].setRotationPoint(15.6F, -5.1F, -0.5F);

        gunModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, 0.05F, -1.0F, 0.07F, 0.0F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F, 0.0F, 0.15F, -0.025F); // Import
        gunModel[319].setRotationPoint(15.6F, -5.1F, -0.5F);

        gunModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, 0.0F, -1.15F, -0.025F, 0.05F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F, 0.05F, 0.25F, -0.085F); // Import
        gunModel[320].setRotationPoint(15.6F, -5.1F, -0.5F);

        gunModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.9F, 0.135F, 0.4F, -0.9F, 0.135F, 0.4F, -0.9F, 0.135F, -0.8F, -0.9F, 0.135F, -0.85F, 0.0F, 0.07F, 0.45F, 0.0F, 0.07F, 0.45F, 0.0F, 0.07F, -0.85F, 0.0F, 0.07F); // Import
        gunModel[321].setRotationPoint(15.3F, -5.1F, -0.5F);

        gunModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.85F, -1.0F, 0.07F, 0.45F, -1.0F, 0.07F, 0.45F, -1.0F, 0.07F, -0.85F, -1.0F, 0.07F, -0.8F, 0.15F, -0.025F, 0.6F, 0.15F, -0.025F, 0.6F, 0.15F, -0.025F, -0.8F, 0.15F, -0.025F); // Import
        gunModel[322].setRotationPoint(15.3F, -5.1F, -0.5F);

        gunModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -1.15F, -0.025F, 0.6F, -1.15F, -0.025F, 0.6F, -1.15F, -0.025F, -0.8F, -1.15F, -0.025F, -0.7F, 0.25F, -0.085F, 0.8F, 0.25F, -0.085F, 0.8F, 0.25F, -0.085F, -0.7F, 0.25F, -0.085F); // Import
        gunModel[323].setRotationPoint(15.3F, -5.1F, -0.5F);

        gunModel[324].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, -0.5F, -0.4F, -0.15F, 0.7F, -0.4F, -0.15F, 0.7F, -0.4F, -0.15F, -0.5F, -0.4F, -0.15F, -0.5F, -0.45F, -0.15F, 0.5F, -0.45F, -0.15F, 0.5F, -0.45F, -0.15F, -0.5F, -0.45F, -0.15F); // Import
        gunModel[324].setRotationPoint(4.9F, -4.15F, -0.5F);

        gunModel[325].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0.0F, -0.25F, 0.2F, 0.3F, -0.25F, 0.2F, 0.3F, -0.25F, 0.2F, 0.0F, -0.25F, 0.2F, 0.0F, -0.7F, 0.2F, 0.3F, -0.7F, 0.2F, 0.3F, -0.7F, 0.2F, 0.0F, -0.7F, 0.2F); // Import
        gunModel[325].setRotationPoint(5.4F, -5.05F, -0.5F);

        gunModel[326].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0.0F, -0.7F, 0.2F, 0.3F, -0.7F, 0.2F, 0.3F, -0.7F, 0.2F, 0.0F, -0.7F, 0.2F, 0.0F, -0.25F, 0.2F, 0.3F, -0.25F, 0.2F, 0.3F, -0.25F, 0.2F, 0.0F, -0.25F, 0.2F); // Import
        gunModel[326].setRotationPoint(5.4F, -5.05F, -0.5F);

        gunModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.3F, 0.2F, -0.2F, -0.3F, 0.25F, -0.2F, -0.3F, 0.25F, -0.2F, -0.3F, 0.2F, -0.2F, -0.3F, 0.2F, -0.2F, -0.3F, 0.25F, -0.2F, -0.3F, 0.25F, -0.2F, -0.3F, 0.2F); // Import
        gunModel[327].setRotationPoint(5.4F, -5.05F, -0.5F);

        gunModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.45F, 0.25F, 0.1F, -0.45F, 0.25F, 0.1F, -0.45F, 0.25F, 0.1F, -0.45F, 0.25F, 0.1F, -0.45F, 0.25F, 0.1F, -0.45F, 0.25F, 0.1F, -0.45F, 0.25F, 0.1F, -0.45F, 0.25F); // Import
        gunModel[328].setRotationPoint(6.3F, -5.05F, -0.5F);

        gunModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.35F, 0.25F, 0.2F, -0.35F, 0.25F, 0.2F, -0.35F, 0.25F, 0.1F, -0.35F, 0.25F, 0.1F, -0.55F, 0.25F, 0.1F, -0.55F, 0.25F, 0.1F, -0.55F, 0.25F, 0.1F, -0.55F, 0.25F); // Import
        gunModel[329].setRotationPoint(6.3F, -5.05F, -0.5F);

        gunModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F); // Import
        gunModel[330].setRotationPoint(7.3F, -5.05F, -0.5F);

        gunModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F); // Import
        gunModel[331].setRotationPoint(7.6F, -5.05F, -0.5F);

        gunModel[332].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0.0F, -0.3F, 0.25F, 0.5F, -0.3F, 0.25F, 0.5F, -0.3F, 0.25F, 0.0F, -0.3F, 0.25F, 0.0F, -0.65F, 0.25F, 0.5F, -0.65F, 0.25F, 0.5F, -0.65F, 0.25F, 0.0F, -0.65F, 0.25F); // Import
        gunModel[332].setRotationPoint(6.2F, -5.05F, -0.5F);

        gunModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.55F, 0.25F, 0.1F, -0.55F, 0.25F, 0.1F, -0.55F, 0.25F, 0.1F, -0.55F, 0.25F, 0.1F, -0.35F, 0.25F, 0.2F, -0.35F, 0.25F, 0.2F, -0.35F, 0.25F, 0.1F, -0.35F, 0.25F); // Import
        gunModel[333].setRotationPoint(6.3F, -5.05F, -0.5F);

        gunModel[334].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0.0F, -0.65F, 0.25F, 0.5F, -0.65F, 0.25F, 0.5F, -0.65F, 0.25F, 0.0F, -0.65F, 0.25F, 0.0F, -0.3F, 0.25F, 0.5F, -0.3F, 0.25F, 0.5F, -0.3F, 0.25F, 0.0F, -0.3F, 0.25F); // Import
        gunModel[334].setRotationPoint(6.2F, -5.05F, -0.5F);

        gunModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F); // Import
        gunModel[335].setRotationPoint(7.45F, -5.05F, -0.5F);

        gunModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F); // Import
        gunModel[336].setRotationPoint(7.45F, -5.05F, -0.5F);

        gunModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F); // Import
        gunModel[337].setRotationPoint(8.25F, -5.05F, -0.5F);

        gunModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F); // Import
        gunModel[338].setRotationPoint(8.1F, -5.05F, -0.5F);

        gunModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F); // Import
        gunModel[339].setRotationPoint(8.25F, -5.05F, -0.5F);

        gunModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F); // Import
        gunModel[340].setRotationPoint(8.4F, -5.05F, -0.5F);

        gunModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F); // Import
        gunModel[341].setRotationPoint(9.85F, -5.05F, -0.5F);

        gunModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F); // Import
        gunModel[342].setRotationPoint(9.7F, -5.05F, -0.5F);

        gunModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F); // Import
        gunModel[343].setRotationPoint(9.85F, -5.05F, -0.5F);

        gunModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F); // Import
        gunModel[344].setRotationPoint(10F, -5.05F, -0.5F);

        gunModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F); // Import
        gunModel[345].setRotationPoint(9.05F, -5.05F, -0.5F);

        gunModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F); // Import
        gunModel[346].setRotationPoint(9.2F, -5.05F, -0.5F);

        gunModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F); // Import
        gunModel[347].setRotationPoint(8.9F, -5.05F, -0.5F);

        gunModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F); // Import
        gunModel[348].setRotationPoint(9.05F, -5.05F, -0.5F);

        gunModel[349].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.05F, -0.45F, 0.25F, -0.05F, -0.45F, 0.25F, -0.05F, -0.45F, 0.25F, -0.05F, -0.45F, 0.25F, -0.05F, -0.45F, 0.25F, -0.05F, -0.45F, 0.25F, -0.05F, -0.45F, 0.25F, -0.05F, -0.45F, 0.25F); // Import
        gunModel[349].setRotationPoint(11.65F, -5.05F, -0.5F);

        gunModel[350].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.05F, -0.55F, 0.25F, -0.05F, -0.55F, 0.25F, -0.05F, -0.55F, 0.25F, -0.05F, -0.55F, 0.25F, 0.05F, -0.35F, 0.25F, 0.05F, -0.35F, 0.25F, 0.05F, -0.35F, 0.25F, 0.05F, -0.35F, 0.25F); // Import
        gunModel[350].setRotationPoint(11.65F, -5.05F, -0.5F);

        gunModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F); // Import
        gunModel[351].setRotationPoint(10.65F, -5.05F, -0.5F);

        gunModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F); // Import
        gunModel[352].setRotationPoint(10.8F, -5.05F, -0.5F);

        gunModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F); // Import
        gunModel[353].setRotationPoint(10.5F, -5.05F, -0.5F);

        gunModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F); // Import
        gunModel[354].setRotationPoint(10.65F, -5.05F, -0.5F);

        gunModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.35F, 0.25F, -0.55F, -0.35F, 0.25F, -0.55F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.25F, -0.55F, 0.25F, -0.55F, -0.55F, 0.25F, -0.55F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F); // Import
        gunModel[355].setRotationPoint(16.25F, -5.05F, -0.5F);

        gunModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F); // Import
        gunModel[356].setRotationPoint(16.1F, -5.05F, -0.5F);

        gunModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.55F, 0.25F, -0.55F, -0.55F, 0.25F, -0.55F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.15F, -0.35F, 0.25F, -0.55F, -0.35F, 0.25F, -0.55F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F); // Import
        gunModel[357].setRotationPoint(16.25F, -5.05F, -0.5F);

        gunModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F); // Import
        gunModel[358].setRotationPoint(15.45F, -5.05F, -0.5F);

        gunModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F); // Import
        gunModel[359].setRotationPoint(15.6F, -5.05F, -0.5F);

        gunModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F); // Import
        gunModel[360].setRotationPoint(15.3F, -5.05F, -0.5F);

        gunModel[361].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F); // Import
        gunModel[361].setRotationPoint(15.45F, -5.05F, -0.5F);

        gunModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F); // Import
        gunModel[362].setRotationPoint(14.65F, -5.05F, -0.5F);

        gunModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F); // Import
        gunModel[363].setRotationPoint(14.5F, -5.05F, -0.5F);

        gunModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F, -0.4F, -0.45F, 0.25F); // Import
        gunModel[364].setRotationPoint(14.8F, -5.05F, -0.5F);

        gunModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -0.55F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F, -0.15F, -0.35F, 0.25F); // Import
        gunModel[365].setRotationPoint(14.65F, -5.05F, -0.5F);

        gunModel[366].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0.0F, -0.55F, -0.15F, 0.0F, -0.55F, -0.15F, 0.0F, -0.55F, -0.15F, 0.0F, -0.55F, -0.15F, -0.1F, -0.35F, -0.15F, -0.15F, -0.35F, -0.15F, -0.15F, -0.35F, -0.15F, -0.1F, -0.35F, -0.15F); // Import
        gunModel[366].setRotationPoint(5.4F, -4.15F, -0.5F);

        gunModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.25F, 0.1F, -0.85F, -0.25F, 0.1F, -0.85F, -0.25F, 0.1F, 0.0F, -0.25F, 0.1F, 0.0F, -0.15F, 0.1F, -0.85F, -0.3F, 0.1F, -0.85F, -0.3F, 0.1F, 0.0F, -0.15F, 0.1F); // Import
        gunModel[367].setRotationPoint(5F, -4.2F, -0.5F);

        gunModel[368].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -1.2F, 0.1F, -0.45F, -0.8F, 0.1F, -0.45F, -0.8F, 0.2F, -0.45F, -1.2F, 0.2F, -0.45F, -1.2F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, -1.2F, -0.3F, -0.45F); // Import
        gunModel[368].setRotationPoint(10.6F, -4.8F, 0.3F);

        gunModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.2F, -0.45F, -0.8F, 0.2F, -0.45F, -0.8F, 0.1F, -0.45F, 0.0F, 0.1F, -0.45F, 0.0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[369].setRotationPoint(12.6F, -4.8F, 0.4F);

        gunModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.2F, -0.45F, -0.8F, 0.2F, -0.45F, -0.8F, 0.1F, -0.45F, 0.0F, 0.1F, -0.45F, 0.0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[370].setRotationPoint(12.2F, -4.8F, 0.4F);

        gunModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.2F, -0.45F, -0.8F, 0.2F, -0.45F, -0.8F, 0.1F, -0.45F, 0.0F, 0.1F, -0.45F, 0.0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[371].setRotationPoint(13F, -4.8F, 0.4F);

        gunModel[372].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.2F, -0.45F, -0.8F, 0.2F, -0.45F, -0.8F, 0.1F, -0.45F, 0.0F, 0.1F, -0.45F, 0.0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[372].setRotationPoint(14.6F, -4.8F, 0.4F);

        gunModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.2F, -0.45F, -0.8F, 0.2F, -0.45F, -0.8F, 0.1F, -0.45F, 0.0F, 0.1F, -0.45F, 0.0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[373].setRotationPoint(14.2F, -4.8F, 0.4F);

        gunModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.2F, -0.45F, -0.8F, 0.2F, -0.45F, -0.8F, 0.1F, -0.45F, 0.0F, 0.1F, -0.45F, 0.0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[374].setRotationPoint(13.8F, -4.8F, 0.4F);

        gunModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.2F, -0.45F, -0.8F, 0.2F, -0.45F, -0.8F, 0.1F, -0.45F, 0.0F, 0.1F, -0.45F, 0.0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[375].setRotationPoint(13.4F, -4.8F, 0.4F);

        gunModel[376].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.2F, -0.45F, -0.8F, 0.2F, -0.45F, -0.8F, 0.1F, -0.45F, 0.0F, 0.1F, -0.45F, 0.0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[376].setRotationPoint(11.8F, -4.8F, 0.4F);

        gunModel[377].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.05F, -0.35F, 0.25F, 0.05F, -0.35F, 0.25F, 0.05F, -0.35F, 0.25F, 0.05F, -0.35F, 0.25F, -0.05F, -0.55F, 0.25F, -0.05F, -0.55F, 0.25F, -0.05F, -0.55F, 0.25F, -0.05F, -0.55F, 0.25F); // Import
        gunModel[377].setRotationPoint(11.65F, -5.05F, -0.5F);

        gunModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.1F, -0.45F, -0.8F, 0.1F, -0.45F, -0.8F, 0.2F, -0.45F, 0.0F, 0.2F, -0.45F, 0.0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0.0F, -0.3F, -0.45F); // Import
        gunModel[378].setRotationPoint(14.6F, -4.8F, -1.4F);

        gunModel[379].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -1.2F, 0.2F, -0.45F, -0.8F, 0.2F, -0.45F, -0.8F, 0.1F, -0.45F, -1.2F, 0.1F, -0.45F, -1.2F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.4F, -0.45F, -1.2F, -0.4F, -0.45F); // Import
        gunModel[379].setRotationPoint(10.6F, -4.8F, -1.3F);

        gunModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.1F, -0.45F, -0.8F, 0.1F, -0.45F, -0.8F, 0.2F, -0.45F, 0.0F, 0.2F, -0.45F, 0.0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0.0F, -0.3F, -0.45F); // Import
        gunModel[380].setRotationPoint(14.2F, -4.8F, -1.4F);

        gunModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.1F, -0.45F, -0.8F, 0.1F, -0.45F, -0.8F, 0.2F, -0.45F, 0.0F, 0.2F, -0.45F, 0.0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0.0F, -0.3F, -0.45F); // Import
        gunModel[381].setRotationPoint(13.8F, -4.8F, -1.4F);

        gunModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.1F, -0.45F, -0.8F, 0.1F, -0.45F, -0.8F, 0.2F, -0.45F, 0.0F, 0.2F, -0.45F, 0.0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0.0F, -0.3F, -0.45F); // Import
        gunModel[382].setRotationPoint(13.4F, -4.8F, -1.4F);

        gunModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.1F, -0.45F, -0.8F, 0.1F, -0.45F, -0.8F, 0.2F, -0.45F, 0.0F, 0.2F, -0.45F, 0.0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0.0F, -0.3F, -0.45F); // Import
        gunModel[383].setRotationPoint(13F, -4.8F, -1.4F);

        gunModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.1F, -0.45F, -0.8F, 0.1F, -0.45F, -0.8F, 0.2F, -0.45F, 0.0F, 0.2F, -0.45F, 0.0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0.0F, -0.3F, -0.45F); // Import
        gunModel[384].setRotationPoint(12.6F, -4.8F, -1.4F);

        gunModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.1F, -0.45F, -0.8F, 0.1F, -0.45F, -0.8F, 0.2F, -0.45F, 0.0F, 0.2F, -0.45F, 0.0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0.0F, -0.3F, -0.45F); // Import
        gunModel[385].setRotationPoint(12.2F, -4.8F, -1.4F);

        gunModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.1F, -0.45F, -0.8F, 0.1F, -0.45F, -0.8F, 0.2F, -0.45F, 0.0F, 0.2F, -0.45F, 0.0F, -0.4F, -0.45F, -0.8F, -0.4F, -0.45F, -0.8F, -0.3F, -0.45F, 0.0F, -0.3F, -0.45F); // Import
        gunModel[386].setRotationPoint(11.8F, -4.8F, -1.4F);

        gunModel[387].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -1.2F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, -1.2F, -0.6F, -0.4F, -1.2F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, -1.2F, -0.3F, -0.3F); // Import
        gunModel[387].setRotationPoint(9.6F, -4.1F, -0.25F);

        gunModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[388].setRotationPoint(10.8F, -3.7F, -0.25F);

        gunModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[389].setRotationPoint(11.6F, -3.7F, -0.25F);

        gunModel[390].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[390].setRotationPoint(12.4F, -3.7F, -0.25F);

        gunModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[391].setRotationPoint(13.2F, -3.7F, -0.25F);

        gunModel[392].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[392].setRotationPoint(11.2F, -3.7F, -0.25F);

        gunModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[393].setRotationPoint(12F, -3.7F, -0.25F);

        gunModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[394].setRotationPoint(12.8F, -3.7F, -0.25F);

        gunModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[395].setRotationPoint(13.6F, -3.7F, -0.25F);

        gunModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[396].setRotationPoint(14F, -3.7F, -0.25F);

        gunModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[397].setRotationPoint(15.6F, -3.7F, -0.25F);

        gunModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[398].setRotationPoint(15.2F, -3.7F, -0.25F);

        gunModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[399].setRotationPoint(14.8F, -3.7F, -0.25F);

        gunModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[400].setRotationPoint(14.4F, -3.7F, -0.25F);

        gunModel[401].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, -0.4F, -0.95F, -0.6F, -0.4F, -0.95F, -0.6F, -0.5F, 0.0F, -0.6F, -0.5F, -0.1F, -0.05F, -0.4F, -0.85F, -0.05F, -0.4F, -0.85F, -0.05F, -0.5F, -0.1F, -0.05F, -0.5F); // Import
        gunModel[401].setRotationPoint(0.9F, -3.65F, -0.45F);

        gunModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.55F, -0.95F, 0.05F, -0.65F, -1.7F, 0.05F, -0.65F, -1.7F, 0.05F, 0.55F, -0.95F, 0.05F, 0.9F, 0.45F, 0.05F, -0.7F, 0.8F, 0.05F, -0.7F, 0.8F, 0.05F, 0.9F, 0.45F, 0.05F); // Import
        gunModel[402].setRotationPoint(-0.4F, -2.05F, -0.5F);

        gunModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.1F, 0.05F, 0.3F, -0.1F, 0.05F, 0.3F, -0.1F, 0.05F, -0.4F, -0.1F, 0.05F, -0.2F, -0.7F, 0.05F, 0.5F, -0.7F, 0.05F, 0.5F, -0.7F, 0.05F, -0.2F, -0.7F, 0.05F); // Import
        gunModel[403].setRotationPoint(0F, -3.15F, -0.5F);

        gunModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.25F, 0.05F, -0.5F, -0.15F, 0.05F, -0.5F, -0.15F, 0.05F, -0.35F, -0.25F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F); // Import
        gunModel[404].setRotationPoint(-0.2F, -3.6F, -0.5F);

        gunModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.5F, 0.05F, -0.7F, -0.4F, 0.05F, -0.7F, -0.4F, 0.05F, -0.15F, -0.5F, 0.05F, -0.55F, -0.25F, 0.05F, -0.3F, -0.35F, 0.05F, -0.3F, -0.35F, 0.05F, -0.55F, -0.25F, 0.05F); // Import
        gunModel[405].setRotationPoint(-0.4F, -4.1F, -0.5F);

        gunModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.7F, 0.05F, -0.8F, -0.7F, 0.05F, -0.8F, -0.7F, 0.05F, 0.1F, -0.7F, 0.05F, 0.1F, -0.2F, 0.05F, -0.95F, -0.2F, 0.05F, -0.95F, -0.2F, 0.05F, 0.1F, -0.2F, 0.05F); // Import
        gunModel[406].setRotationPoint(-0.3F, -4.4F, -0.5F);

        gunModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.05F, -0.1F, -0.7F, -0.8F, -0.1F, -0.45F, -0.8F, -0.1F, -0.45F, 0.05F, -0.1F, -0.7F, 0.05F, -0.7F, -0.7F, -0.8F, -0.7F, -0.45F, -0.8F, -0.7F, -0.45F, 0.05F, -0.7F, -0.7F); // Import
        gunModel[407].setRotationPoint(0F, -3.15F, -1F);

        gunModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.4F, 0.05F, 0.0F, -0.75F, 0.05F, 0.0F, -0.75F, 0.05F, 0.2F, -0.4F, 0.05F, 0.2F, -0.5F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.2F, -0.5F, 0.0F); // Import
        gunModel[408].setRotationPoint(-1.1F, -1F, -0.5F);

        gunModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.55F, -0.2F, -0.4F, -0.6F, 0.05F, -0.4F, -0.6F, 0.05F, -0.35F, -0.55F, -0.2F, -0.35F, -0.35F, -0.25F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.35F, -0.35F, -0.25F); // Import
        gunModel[409].setRotationPoint(-1.9F, -1.2F, -0.5F);

        gunModel[410].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F); // Import
        gunModel[410].setRotationPoint(0.4F, -3.9F, -0.5F);

        gunModel[411].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F); // Import
        gunModel[411].setRotationPoint(0.4F, -3.8F, -0.5F);

        gunModel[412].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F); // Import
        gunModel[412].setRotationPoint(0.4F, -3.7F, -0.5F);

        gunModel[413].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F); // Import
        gunModel[413].setRotationPoint(0.85F, -4.1F, -0.5F);

        gunModel[414].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F); // Import
        gunModel[414].setRotationPoint(0.85F, -4F, -0.5F);

        gunModel[415].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F); // Import
        gunModel[415].setRotationPoint(0.85F, -3.9F, -0.5F);

        gunModel[416].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.35F, -0.45F, -0.3F, -0.05F, -0.6F, -0.3F, -0.05F, -0.3F, -0.15F, -0.35F, -0.45F, -0.25F, -0.55F, -0.45F, -0.2F, -0.85F, -0.6F, -0.2F, -0.85F, -0.3F, -0.25F, -0.55F, -0.45F); // Import
        gunModel[416].setRotationPoint(10.65F, -5.05F, -1.3F);

        gunModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, -0.05F, 0.2F, -0.2F, -0.05F, 0.1F, -0.2F, -0.05F, 0.1F, -0.7F, -0.05F, 0.2F, -0.8F, -0.85F, 0.2F, -0.15F, -0.9F, 0.1F, -0.15F, -0.9F, 0.1F, -0.8F, -0.85F, 0.2F); // Import
        gunModel[417].setRotationPoint(10.65F, -5.05F, -0.5F);

        gunModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.95F, 0.25F, -0.8F, -0.85F, 0.35F, -0.8F, -0.85F, 0.35F, -0.15F, -0.95F, 0.25F, -0.2F, 0.0F, 0.25F, -0.7F, -0.05F, 0.35F, -0.7F, -0.05F, 0.35F, -0.2F, 0.0F, 0.25F); // Import
        gunModel[418].setRotationPoint(10.6F, -5.55F, -0.5F);

        gunModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.85F, 0.2F, -0.15F, -0.9F, 0.1F, -0.15F, -0.9F, 0.1F, -0.8F, -0.85F, 0.2F, -0.7F, -0.05F, 0.2F, -0.2F, -0.05F, 0.1F, -0.2F, -0.05F, 0.1F, -0.7F, -0.05F, 0.2F); // Import
        gunModel[419].setRotationPoint(10.65F, -5.05F, -0.5F);

        gunModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.55F, -0.45F, -0.2F, -0.85F, -0.6F, -0.2F, -0.85F, -0.3F, -0.25F, -0.55F, -0.45F, -0.15F, -0.35F, -0.45F, -0.3F, -0.05F, -0.6F, -0.3F, -0.05F, -0.3F, -0.15F, -0.35F, -0.45F); // Import
        gunModel[420].setRotationPoint(10.65F, -5.05F, -1.3F);

        gunModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0.0F, 0.25F, -0.7F, -0.05F, 0.35F, -0.7F, -0.05F, 0.35F, -0.2F, 0.0F, 0.25F, -0.15F, -0.95F, 0.25F, -0.8F, -0.85F, 0.35F, -0.8F, -0.85F, 0.35F, -0.15F, -0.95F, 0.25F); // Import
        gunModel[421].setRotationPoint(10.6F, -4.55F, -0.5F);

        gunModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.55F, -0.45F, -0.2F, -0.85F, -0.3F, -0.2F, -0.85F, -0.6F, -0.25F, -0.55F, -0.45F, -0.15F, -0.35F, -0.45F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.6F, -0.15F, -0.35F, -0.45F); // Import
        gunModel[422].setRotationPoint(10.65F, -5.05F, 0.3F);

        gunModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.35F, -0.45F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.6F, -0.15F, -0.35F, -0.45F, -0.25F, -0.55F, -0.45F, -0.2F, -0.85F, -0.3F, -0.2F, -0.85F, -0.6F, -0.25F, -0.55F, -0.45F); // Import
        gunModel[423].setRotationPoint(10.65F, -5.05F, 0.3F);

        gunModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.35F, -0.45F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.6F, -0.15F, -0.35F, -0.45F, -0.25F, -0.55F, -0.45F, -0.2F, -0.85F, -0.3F, -0.2F, -0.85F, -0.6F, -0.25F, -0.55F, -0.45F); // Import
        gunModel[424].setRotationPoint(9.05F, -5.05F, 0.3F);

        gunModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.95F, 0.25F, -0.8F, -0.85F, 0.35F, -0.8F, -0.85F, 0.35F, -0.15F, -0.95F, 0.25F, -0.2F, 0.0F, 0.25F, -0.7F, -0.05F, 0.35F, -0.7F, -0.05F, 0.35F, -0.2F, 0.0F, 0.25F); // Import
        gunModel[425].setRotationPoint(9F, -5.55F, -0.5F);

        gunModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0.0F, 0.25F, -0.7F, -0.05F, 0.35F, -0.7F, -0.05F, 0.35F, -0.2F, 0.0F, 0.25F, -0.15F, -0.95F, 0.25F, -0.8F, -0.85F, 0.35F, -0.8F, -0.85F, 0.35F, -0.15F, -0.95F, 0.25F); // Import
        gunModel[426].setRotationPoint(9F, -4.55F, -0.5F);

        gunModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, -0.05F, 0.2F, -0.2F, -0.05F, 0.1F, -0.2F, -0.05F, 0.1F, -0.7F, -0.05F, 0.2F, -0.8F, -0.85F, 0.2F, -0.15F, -0.9F, 0.1F, -0.15F, -0.9F, 0.1F, -0.8F, -0.85F, 0.2F); // Import
        gunModel[427].setRotationPoint(9.05F, -5.05F, -0.5F);

        gunModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.85F, 0.2F, -0.15F, -0.9F, 0.1F, -0.15F, -0.9F, 0.1F, -0.8F, -0.85F, 0.2F, -0.7F, -0.05F, 0.2F, -0.2F, -0.05F, 0.1F, -0.2F, -0.05F, 0.1F, -0.7F, -0.05F, 0.2F); // Import
        gunModel[428].setRotationPoint(9.05F, -5.05F, -0.5F);

        gunModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.55F, -0.45F, -0.2F, -0.85F, -0.3F, -0.2F, -0.85F, -0.6F, -0.25F, -0.55F, -0.45F, -0.15F, -0.35F, -0.45F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.6F, -0.15F, -0.35F, -0.45F); // Import
        gunModel[429].setRotationPoint(9.05F, -5.05F, 0.3F);

        gunModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.35F, -0.45F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.6F, -0.15F, -0.35F, -0.45F, -0.25F, -0.55F, -0.45F, -0.2F, -0.85F, -0.3F, -0.2F, -0.85F, -0.6F, -0.25F, -0.55F, -0.45F); // Import
        gunModel[430].setRotationPoint(7.45F, -5.05F, 0.3F);

        gunModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.95F, 0.25F, -0.8F, -0.85F, 0.35F, -0.8F, -0.85F, 0.35F, -0.15F, -0.95F, 0.25F, -0.2F, 0.0F, 0.25F, -0.7F, -0.05F, 0.35F, -0.7F, -0.05F, 0.35F, -0.2F, 0.0F, 0.25F); // Import
        gunModel[431].setRotationPoint(7.4F, -5.55F, -0.5F);

        gunModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0.0F, 0.25F, -0.7F, -0.05F, 0.35F, -0.7F, -0.05F, 0.35F, -0.2F, 0.0F, 0.25F, -0.15F, -0.95F, 0.25F, -0.8F, -0.85F, 0.35F, -0.8F, -0.85F, 0.35F, -0.15F, -0.95F, 0.25F); // Import
        gunModel[432].setRotationPoint(7.4F, -4.55F, -0.5F);

        gunModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, -0.05F, 0.2F, -0.2F, -0.05F, 0.1F, -0.2F, -0.05F, 0.1F, -0.7F, -0.05F, 0.2F, -0.8F, -0.85F, 0.2F, -0.15F, -0.9F, 0.1F, -0.15F, -0.9F, 0.1F, -0.8F, -0.85F, 0.2F); // Import
        gunModel[433].setRotationPoint(7.45F, -5.05F, -0.5F);

        gunModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.85F, 0.2F, -0.15F, -0.9F, 0.1F, -0.15F, -0.9F, 0.1F, -0.8F, -0.85F, 0.2F, -0.7F, -0.05F, 0.2F, -0.2F, -0.05F, 0.1F, -0.2F, -0.05F, 0.1F, -0.7F, -0.05F, 0.2F); // Import
        gunModel[434].setRotationPoint(7.45F, -5.05F, -0.5F);

        gunModel[435].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.55F, -0.45F, -0.2F, -0.85F, -0.3F, -0.2F, -0.85F, -0.6F, -0.25F, -0.55F, -0.45F, -0.15F, -0.35F, -0.45F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.6F, -0.15F, -0.35F, -0.45F); // Import
        gunModel[435].setRotationPoint(7.45F, -5.05F, 0.3F);

        gunModel[436].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.35F, -0.45F, -0.3F, -0.05F, -0.6F, -0.3F, -0.05F, -0.3F, -0.15F, -0.35F, -0.45F, -0.25F, -0.55F, -0.45F, -0.2F, -0.85F, -0.6F, -0.2F, -0.85F, -0.3F, -0.25F, -0.55F, -0.45F); // Import
        gunModel[436].setRotationPoint(9.05F, -5.05F, -1.3F);

        gunModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.55F, -0.45F, -0.2F, -0.85F, -0.6F, -0.2F, -0.85F, -0.3F, -0.25F, -0.55F, -0.45F, -0.15F, -0.35F, -0.45F, -0.3F, -0.05F, -0.6F, -0.3F, -0.05F, -0.3F, -0.15F, -0.35F, -0.45F); // Import
        gunModel[437].setRotationPoint(9.05F, -5.05F, -1.3F);

        gunModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.35F, -0.45F, -0.3F, -0.05F, -0.6F, -0.3F, -0.05F, -0.3F, -0.15F, -0.35F, -0.45F, -0.25F, -0.55F, -0.45F, -0.2F, -0.85F, -0.6F, -0.2F, -0.85F, -0.3F, -0.25F, -0.55F, -0.45F); // Import
        gunModel[438].setRotationPoint(7.45F, -5.05F, -1.3F);

        gunModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.55F, -0.45F, -0.2F, -0.85F, -0.6F, -0.2F, -0.85F, -0.3F, -0.25F, -0.55F, -0.45F, -0.15F, -0.35F, -0.45F, -0.3F, -0.05F, -0.6F, -0.3F, -0.05F, -0.3F, -0.15F, -0.35F, -0.45F); // Import
        gunModel[439].setRotationPoint(7.45F, -5.05F, -1.3F);

        gunModel[440].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.3F, -0.3F, 0.15F, -0.2F, -0.3F, 0.15F, -0.2F, -0.3F, -0.7F, -0.3F, -0.3F, -0.7F, -0.3F, -0.3F, 0.0F, -0.2F, -0.3F, 0.0F, -0.2F, -0.3F, -0.7F, -0.3F, -0.3F, -0.7F); // Import
        gunModel[440].setRotationPoint(2.2F, -4.65F, -0.5F);

        gunModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F); // Import
        gunModel[441].setRotationPoint(2.6F, -5.05F, -0.35F);

        gunModel[442].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.15F, -0.45F, -0.3F, -0.15F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, -0.05F, -0.45F, -0.3F, -0.05F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F); // Import
        gunModel[442].setRotationPoint(2.05F, -5.05F, -0.8F);

        gunModel[443].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.05F, -0.2F, 0.05F, -0.05F, -0.2F, 0.05F, -0.05F, 0.0F, -0.2F, -0.05F, 0.0F, -0.2F, -0.8F, -0.15F, -0.1F, -0.8F, -0.15F, -0.1F, -0.8F, 0.0F, -0.2F, -0.8F, 0.0F); // Import
        gunModel[443].setRotationPoint(1.7F, -4.95F, -0.8F);

        gunModel[444].addShapeBox(0F, -0.5F, -0.5F, 2, 1, 1, 0F, 0.15F, -0.4F, -0.5F, 0.15F, -0.4F, -0.5F, 0.15F, -0.4F, -0.45F, 0.15F, -0.4F, -0.45F, 0.15F, -0.15F, -0.5F, 0.15F, -0.15F, -0.5F, 0.15F, -0.15F, -0.45F, 0.15F, -0.15F, -0.45F); // Import
        gunModel[444].setRotationPoint(2.75F, -4F, -0.7F);

        gunModel[445].addShapeBox(0F, -0.1F, -0.55F, 2, 1, 1, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.45F, -0.05F, -0.5F, -0.45F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[445].setRotationPoint(2.75F, -4F, -0.7F);

        gunModel[446].addShapeBox(1.6F, -0.5F, -0.55F, 1, 1, 1, 0F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.2F, -0.5F, -0.45F, -0.15F, -0.5F, -0.45F, -0.15F, -0.45F, -0.45F, -0.2F, -0.45F); // Import
        gunModel[446].setRotationPoint(2.75F, -4F, -0.7F);

        gunModel[447].addShapeBox(0F, -0.1F, -0.5F, 2, 1, 1, 0F, 0.15F, -0.45F, -0.5F, 0.15F, -0.45F, -0.5F, 0.15F, -0.45F, -0.45F, 0.15F, -0.45F, -0.45F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[447].setRotationPoint(2.75F, -4F, -0.7F);

        gunModel[448].addShapeBox(1.6F, -0.5F, -0.55F, 1, 1, 1, 0F, -0.45F, -0.8F, -0.5F, -0.45F, -0.85F, -0.5F, -0.45F, -0.85F, -0.45F, -0.45F, -0.8F, -0.45F, -0.35F, -0.1F, -0.5F, -0.6F, 0.0F, -0.5F, -0.6F, 0.0F, -0.45F, -0.35F, -0.1F, -0.45F); // Import
        gunModel[448].setRotationPoint(2.75F, -4F, -0.7F);

        gunModel[449].addShapeBox(-0.6F, -0.5F, -0.55F, 1, 1, 1, 0F, -0.45F, -0.85F, -0.5F, -0.45F, -0.8F, -0.5F, -0.45F, -0.8F, -0.45F, -0.45F, -0.85F, -0.45F, -0.6F, 0.0F, -0.5F, -0.35F, -0.1F, -0.5F, -0.35F, -0.1F, -0.45F, -0.6F, 0.0F, -0.45F); // Import
        gunModel[449].setRotationPoint(2.75F, -4F, -0.7F);

        gunModel[450].addShapeBox(-0.6F, -0.5F, -0.55F, 1, 1, 1, 0F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.15F, -0.5F, -0.45F, -0.2F, -0.5F, -0.45F, -0.2F, -0.45F, -0.45F, -0.15F, -0.45F); // Import
        gunModel[450].setRotationPoint(2.75F, -4F, -0.7F);

        gunModel[451].addShapeBox(0.5F, -0.2F, -0.55F, 1, 1, 1, 0F, -0.35F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.5F, -0.45F, -0.35F, -0.5F, -0.45F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F); // Import
        gunModel[451].setRotationPoint(2.75F, -4F, -0.7F);

        gunModel[452].addShapeBox(0.5F, -0.4F, -0.55F, 1, 1, 1, 0F, -0.35F, -0.3F, -0.5F, -0.35F, -0.3F, -0.5F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.5F, -0.35F, -0.3F, -0.5F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F); // Import
        gunModel[452].setRotationPoint(2.75F, -4F, -0.7F);

        gunModel[453].addShapeBox(1.1F, -0.4F, -0.55F, 1, 1, 1, 0F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F); // Import
        gunModel[453].setRotationPoint(2.75F, -4F, -0.7F);

        gunModel[454].addShapeBox(1.1F, -0.4F, -0.55F, 1, 1, 1, 0F, -0.1F, -0.45F, -0.5F, -0.1F, -0.45F, -0.5F, -0.1F, -0.45F, -0.45F, -0.1F, -0.45F, -0.45F, -0.15F, -0.5F, -0.5F, -0.15F, -0.5F, -0.5F, -0.15F, -0.5F, -0.45F, -0.15F, -0.5F, -0.45F); // Import
        gunModel[454].setRotationPoint(2.75F, -3.75F, -0.7F);

        gunModel[455].addShapeBox(-0.1F, -0.4F, -0.55F, 1, 1, 1, 0F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F); // Import
        gunModel[455].setRotationPoint(2.75F, -4F, -0.7F);

        gunModel[456].addShapeBox(-0.1F, -0.4F, -0.55F, 1, 1, 1, 0F, -0.1F, -0.45F, -0.5F, -0.1F, -0.45F, -0.5F, -0.1F, -0.45F, -0.45F, -0.1F, -0.45F, -0.45F, -0.15F, -0.5F, -0.5F, -0.15F, -0.5F, -0.5F, -0.15F, -0.5F, -0.45F, -0.15F, -0.5F, -0.45F); // Import
        gunModel[456].setRotationPoint(2.75F, -3.75F, -0.7F);

        gunModel[457].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0.05F, -0.4F, 0.0F, 0.05F, -0.4F, 0.0F, 0.05F, -0.4F, 0.5F, 0.05F, -0.4F, 0.5F, -0.75F, -0.4F, 0.0F, -0.75F, -0.4F, 0.0F, -0.75F, -0.4F, 0.5F, -0.75F, -0.4F); // Import
        gunModel[457].setRotationPoint(3F, -4.2F, -1F);

        gunModel[458].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.55F, -0.35F, -0.5F, -0.55F, -0.35F, -0.5F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F); // Import
        gunModel[458].setRotationPoint(2.1F, -4.7F, -1.2F);

        gunModel[459].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.35F, -0.5F, -0.45F, -0.35F, -0.5F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.5F, -0.45F, -0.35F, -0.5F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F); // Import
        gunModel[459].setRotationPoint(2.1F, -4.7F, -1.2F);

        gunModel[460].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.35F, -0.5F, -0.55F, -0.35F, -0.5F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Import
        gunModel[460].setRotationPoint(2.1F, -4.7F, -1.2F);

        gunModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.45F, -0.4F, 0.0F, -0.45F, -0.4F, 0.0F, -0.45F, -0.4F, 0.0F, -0.45F, -0.4F, 0.0F, -0.45F, -0.4F, 0.0F, -0.45F, -0.4F, 0.0F, -0.45F, -0.4F, 0.0F, -0.45F, -0.4F); // Import
        gunModel[461].setRotationPoint(3.95F, -4.7F, -1.2F);

        gunModel[462].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F, 0.0F, -0.55F, -0.4F, 0.0F, -0.55F, -0.4F, 0.0F, -0.55F, -0.4F, 0.0F, -0.55F, -0.4F); // Import
        gunModel[462].setRotationPoint(3.95F, -4.7F, -1.2F);

        gunModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.55F, -0.4F, 0.0F, -0.55F, -0.4F, 0.0F, -0.55F, -0.4F, 0.0F, -0.55F, -0.4F, 0.0F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F); // Import
        gunModel[463].setRotationPoint(3.95F, -4.7F, -1.2F);

        gunModel[464].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.15F, -0.475F, -0.425F, -0.15F, -0.475F, -0.425F, -0.15F, -0.475F, -0.425F, -0.15F, -0.475F, -0.425F, -0.15F, -0.475F, -0.425F, -0.15F, -0.475F, -0.425F, -0.15F, -0.475F, -0.425F, -0.15F, -0.475F, -0.425F); // Import
        gunModel[464].setRotationPoint(2.25F, -4.7F, -1.2F);

        gunModel[465].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.15F, -0.425F, -0.475F, -0.15F, -0.425F, -0.475F, -0.15F, -0.425F, -0.475F, -0.15F, -0.425F, -0.475F, -0.15F, -0.525F, -0.425F, -0.15F, -0.525F, -0.425F, -0.15F, -0.525F, -0.425F, -0.15F, -0.525F, -0.425F); // Import
        gunModel[465].setRotationPoint(2.25F, -4.7F, -1.2F);

        gunModel[466].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.15F, -0.525F, -0.425F, -0.15F, -0.525F, -0.425F, -0.15F, -0.525F, -0.425F, -0.15F, -0.525F, -0.425F, -0.15F, -0.425F, -0.475F, -0.15F, -0.425F, -0.475F, -0.15F, -0.425F, -0.475F, -0.15F, -0.425F, -0.475F); // Import
        gunModel[466].setRotationPoint(2.25F, -4.7F, -1.2F);

        gunModel[467].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.55F, -0.4F, -0.35F, -0.55F, -0.4F, -0.35F, -0.55F, -0.4F, -0.35F, -0.55F, -0.4F); // Import
        gunModel[467].setRotationPoint(3.25F, -4.7F, -1.2F);

        gunModel[468].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F); // Import
        gunModel[468].setRotationPoint(3.25F, -4.7F, -1.2F);

        gunModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.55F, -0.4F, -0.35F, -0.55F, -0.4F, -0.35F, -0.55F, -0.4F, -0.35F, -0.55F, -0.4F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F); // Import
        gunModel[469].setRotationPoint(3.25F, -4.7F, -1.2F);

        gunModel[470].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.6F, 0.3F, -0.3F, 0.25F, 0.3F, -0.3F, -0.9F, 0.0F, -0.3F, -0.9F, 0.0F, -0.55F, 0.8F, 0.3F, -0.55F, 0.4F, 0.3F, -0.55F, -0.9F, 0.0F, -0.55F, -0.9F); // Import
        gunModel[470].setRotationPoint(0.5F, -5.2F, -0.25F);

        gunModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.8F, 0.3F, -0.3F, 0.4F, 0.3F, -0.3F, -0.9F, 0.0F, -0.3F, -0.9F, 0.0F, -0.3F, 0.8F, 0.3F, -0.3F, 0.4F, 0.3F, -0.3F, -0.9F, 0.0F, -0.3F, -0.9F); // Import
        gunModel[471].setRotationPoint(0.5F, -5.05F, -0.25F);

        gunModel[472].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.55F, 0.8F, 0.3F, -0.55F, 0.4F, 0.3F, -0.55F, -0.9F, 0.0F, -0.55F, -0.9F, 0.0F, -0.3F, 0.6F, 0.3F, -0.3F, 0.25F, 0.3F, -0.3F, -0.9F, 0.0F, -0.3F, -0.9F); // Import
        gunModel[472].setRotationPoint(0.5F, -4.9F, -0.25F);

        gunModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F); // Import
        gunModel[473].setRotationPoint(2.6F, -5.45F, -0.35F);

        gunModel[474].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F); // Import
        gunModel[474].setRotationPoint(0.6F, -3.8F, 0F);

        gunModel[475].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.45F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.5F, -0.45F, -0.45F, -0.5F, -0.45F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.5F, -0.45F, -0.45F); // Import
        gunModel[475].setRotationPoint(0.8F, -3.8F, 0F);

        gunModel[476].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.1F, 0.05F, -0.6F, -0.1F, 0.05F, -0.6F, -0.1F, 0.05F, -0.2F, -0.1F, 0.05F, -0.2F, -0.7F, 0.05F, -0.8F, -0.7F, 0.05F, -0.8F, -0.7F, 0.05F, -0.2F, -0.7F, 0.05F); // Import
        gunModel[476].setRotationPoint(0F, -3.15F, -0.5F);
    }

    private void initdefaultBarrelModel_1() {
        defaultBarrelModel[0] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Import
        defaultBarrelModel[1] = new ModelRendererTurbo(this, 57, 185, textureX, textureY); // Import
        defaultBarrelModel[2] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Import
        defaultBarrelModel[3] = new ModelRendererTurbo(this, 73, 185, textureX, textureY); // Import
        defaultBarrelModel[4] = new ModelRendererTurbo(this, 81, 185, textureX, textureY); // Import
        defaultBarrelModel[5] = new ModelRendererTurbo(this, 89, 185, textureX, textureY); // Import
        defaultBarrelModel[6] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Import
        defaultBarrelModel[7] = new ModelRendererTurbo(this, 105, 185, textureX, textureY); // Import
        defaultBarrelModel[8] = new ModelRendererTurbo(this, 113, 185, textureX, textureY); // Import
        defaultBarrelModel[9] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Import
        defaultBarrelModel[10] = new ModelRendererTurbo(this, 129, 185, textureX, textureY); // Import
        defaultBarrelModel[11] = new ModelRendererTurbo(this, 137, 185, textureX, textureY); // Import
        defaultBarrelModel[12] = new ModelRendererTurbo(this, 145, 185, textureX, textureY); // Import
        defaultBarrelModel[13] = new ModelRendererTurbo(this, 153, 185, textureX, textureY); // Import
        defaultBarrelModel[14] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Import
        defaultBarrelModel[15] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Import
        defaultBarrelModel[16] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Import
        defaultBarrelModel[17] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Import
        defaultBarrelModel[18] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Import
        defaultBarrelModel[19] = new ModelRendererTurbo(this, 201, 185, textureX, textureY); // Import
        defaultBarrelModel[20] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Import
        defaultBarrelModel[21] = new ModelRendererTurbo(this, 217, 185, textureX, textureY); // Import
        defaultBarrelModel[22] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Import
        defaultBarrelModel[23] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Import
        defaultBarrelModel[24] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Import
        defaultBarrelModel[25] = new ModelRendererTurbo(this, 249, 185, textureX, textureY); // Import
        defaultBarrelModel[26] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Import
        defaultBarrelModel[27] = new ModelRendererTurbo(this, 9, 193, textureX, textureY); // Import
        defaultBarrelModel[28] = new ModelRendererTurbo(this, 17, 193, textureX, textureY); // Import
        defaultBarrelModel[29] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Import

        defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.2F, -0.3F, 0.0F, -0.2F, -0.3F, 0.0F, -0.2F, -0.3F, 0.0F, -0.2F, -0.3F, 0.0F, -0.65F, -0.45F, 0.0F, -0.65F, -0.45F, 0.0F, -0.65F, -0.45F, 0.0F, -0.65F, -0.45F); // Import
        defaultBarrelModel[0].setRotationPoint(16.6F, -5.05F, -0.5F);

        defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.35F, -0.15F, 0.0F, -0.35F, -0.15F, 0.0F, -0.45F, -0.65F, 0.0F, -0.45F, -0.65F, 0.0F, -0.6F, -0.15F, 0.0F, -0.6F, -0.15F, 0.0F, -0.55F, -0.65F, 0.0F, -0.55F, -0.65F); // Import
        defaultBarrelModel[1].setRotationPoint(16.6F, -5.05F, -0.5F);

        defaultBarrelModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, -0.2F, 0.0F, -0.3F, -0.2F, 0.0F, -0.45F, -0.65F, 0.0F, -0.45F, -0.65F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -0.55F, -0.65F, 0.0F, -0.55F, -0.65F); // Import
        defaultBarrelModel[2].setRotationPoint(16.6F, -5.05F, -0.5F);

        defaultBarrelModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, -0.15F, 0.0F, -0.6F, -0.15F, 0.0F, -0.55F, -0.65F, 0.0F, -0.55F, -0.65F, 0.0F, -0.35F, -0.15F, 0.0F, -0.35F, -0.15F, 0.0F, -0.45F, -0.65F, 0.0F, -0.45F, -0.65F); // Import
        defaultBarrelModel[3].setRotationPoint(16.6F, -5.05F, -0.5F);

        defaultBarrelModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.35F, -0.55F, -0.35F, -0.35F, -0.55F, -0.35F, -0.7F, -0.2F, -0.4F, -0.7F, -0.2F, -0.4F, -0.55F, -0.65F, -0.35F, -0.55F, -0.65F); // Import
        defaultBarrelModel[4].setRotationPoint(17F, -5.05F, -0.5F);

        defaultBarrelModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.35F, -0.55F, -0.4F, -0.35F, -0.55F, -0.4F, -0.7F, -0.2F, -0.4F, -0.7F, -0.2F, -0.4F, -0.55F, -0.65F, -0.4F, -0.55F, -0.65F); // Import
        defaultBarrelModel[5].setRotationPoint(16.65F, -5.05F, -0.5F);

        defaultBarrelModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.35F, -0.55F, -0.35F, -0.35F, -0.55F, -0.35F, -0.7F, -0.2F, -0.4F, -0.7F, -0.2F, -0.4F, -0.55F, -0.65F, -0.35F, -0.55F, -0.65F); // Import
        defaultBarrelModel[6].setRotationPoint(16.35F, -5.05F, -0.5F);

        defaultBarrelModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.15F, -0.35F, 0.0F, -0.15F, -0.35F, 0.0F, -0.15F, -0.35F, 0.0F, -0.15F, -0.35F, 0.0F, -0.8F, -0.3F, 0.0F, -0.8F, -0.3F, 0.0F, -0.8F, -0.3F, 0.0F, -0.8F, -0.3F); // Import
        defaultBarrelModel[7].setRotationPoint(16.6F, -5.05F, -0.5F);

        defaultBarrelModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.8F, -0.3F, 0.0F, -0.8F, -0.3F, 0.0F, -0.8F, -0.3F, 0.0F, -0.8F, -0.3F, 0.0F, -0.15F, -0.35F, 0.0F, -0.15F, -0.35F, 0.0F, -0.15F, -0.35F, 0.0F, -0.15F, -0.35F); // Import
        defaultBarrelModel[8].setRotationPoint(16.6F, -5.05F, -0.5F);

        defaultBarrelModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.65F, -0.45F, 0.0F, -0.65F, -0.45F, 0.0F, -0.65F, -0.45F, 0.0F, -0.65F, -0.45F, 0.0F, -0.2F, -0.3F, 0.0F, -0.2F, -0.3F, 0.0F, -0.2F, -0.3F, 0.0F, -0.2F, -0.3F); // Import
        defaultBarrelModel[9].setRotationPoint(16.6F, -5.05F, -0.5F);

        defaultBarrelModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.7F, -0.2F, -0.4F, -0.7F, -0.2F, -0.4F, -0.55F, -0.65F, -0.35F, -0.55F, -0.65F, -0.35F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.35F, -0.55F, -0.35F, -0.35F, -0.55F); // Import
        defaultBarrelModel[10].setRotationPoint(16.35F, -5.05F, -0.5F);

        defaultBarrelModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.7F, -0.2F, -0.4F, -0.7F, -0.2F, -0.4F, -0.55F, -0.65F, -0.4F, -0.55F, -0.65F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.35F, -0.55F, -0.4F, -0.35F, -0.55F); // Import
        defaultBarrelModel[11].setRotationPoint(16.65F, -5.05F, -0.5F);

        defaultBarrelModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.7F, -0.2F, -0.4F, -0.7F, -0.2F, -0.4F, -0.55F, -0.65F, -0.35F, -0.55F, -0.65F, -0.35F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.35F, -0.55F, -0.35F, -0.35F, -0.55F); // Import
        defaultBarrelModel[12].setRotationPoint(17F, -5.05F, -0.5F);

        defaultBarrelModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -0.55F, -0.65F, 0.0F, -0.55F, -0.65F, 0.0F, -0.3F, -0.2F, 0.0F, -0.3F, -0.2F, 0.0F, -0.45F, -0.65F, 0.0F, -0.45F, -0.65F); // Import
        defaultBarrelModel[13].setRotationPoint(16.6F, -5.05F, -0.5F);

        defaultBarrelModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.4F, -0.15F, -0.4F, -0.4F, -0.15F, -0.4F, -0.45F, -0.65F, -0.35F, -0.45F, -0.65F, -0.35F, -0.4F, -0.15F, -0.4F, -0.4F, -0.15F, -0.4F, -0.45F, -0.65F, -0.35F, -0.45F, -0.65F); // Import
        defaultBarrelModel[14].setRotationPoint(17F, -5.05F, -0.5F);

        defaultBarrelModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.15F, -0.4F, -0.4F, -0.15F, -0.4F, -0.45F, -0.65F, -0.4F, -0.45F, -0.65F, -0.4F, -0.4F, -0.15F, -0.4F, -0.4F, -0.15F, -0.4F, -0.45F, -0.65F, -0.4F, -0.45F, -0.65F); // Import
        defaultBarrelModel[15].setRotationPoint(16.65F, -5.05F, -0.5F);

        defaultBarrelModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.4F, -0.15F, -0.4F, -0.4F, -0.15F, -0.4F, -0.45F, -0.65F, -0.35F, -0.45F, -0.65F, -0.35F, -0.4F, -0.15F, -0.4F, -0.4F, -0.15F, -0.4F, -0.45F, -0.65F, -0.35F, -0.45F, -0.65F); // Import
        defaultBarrelModel[16].setRotationPoint(16.35F, -5.05F, -0.5F);

        defaultBarrelModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.45F, -0.65F, 0.0F, -0.45F, -0.65F, 0.0F, -0.35F, -0.15F, 0.0F, -0.35F, -0.15F, 0.0F, -0.55F, -0.65F, 0.0F, -0.55F, -0.65F, 0.0F, -0.6F, -0.15F, 0.0F, -0.6F, -0.15F); // Import
        defaultBarrelModel[17].setRotationPoint(16.6F, -5.05F, -0.5F);

        defaultBarrelModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.45F, -0.65F, -0.4F, -0.45F, -0.65F, -0.4F, -0.4F, -0.15F, -0.35F, -0.4F, -0.15F, -0.35F, -0.45F, -0.65F, -0.4F, -0.45F, -0.65F, -0.4F, -0.4F, -0.15F, -0.35F, -0.4F, -0.15F); // Import
        defaultBarrelModel[18].setRotationPoint(17F, -5.05F, -0.5F);

        defaultBarrelModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.55F, -0.65F, 0.0F, -0.55F, -0.65F, 0.0F, -0.6F, -0.15F, 0.0F, -0.6F, -0.15F, 0.0F, -0.45F, -0.65F, 0.0F, -0.45F, -0.65F, 0.0F, -0.35F, -0.15F, 0.0F, -0.35F, -0.15F); // Import
        defaultBarrelModel[19].setRotationPoint(16.6F, -5.05F, -0.5F);

        defaultBarrelModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.65F, -0.4F, -0.45F, -0.65F, -0.4F, -0.4F, -0.15F, -0.4F, -0.4F, -0.15F, -0.4F, -0.45F, -0.65F, -0.4F, -0.45F, -0.65F, -0.4F, -0.4F, -0.15F, -0.4F, -0.4F, -0.15F); // Import
        defaultBarrelModel[20].setRotationPoint(16.65F, -5.05F, -0.5F);

        defaultBarrelModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.45F, -0.65F, -0.4F, -0.45F, -0.65F, -0.4F, -0.4F, -0.15F, -0.35F, -0.4F, -0.15F, -0.35F, -0.45F, -0.65F, -0.4F, -0.45F, -0.65F, -0.4F, -0.4F, -0.15F, -0.35F, -0.4F, -0.15F); // Import
        defaultBarrelModel[21].setRotationPoint(16.35F, -5.05F, -0.5F);

        defaultBarrelModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.45F, -0.65F, 0.0F, -0.45F, -0.65F, 0.0F, -0.3F, -0.2F, 0.0F, -0.3F, -0.2F, 0.0F, -0.55F, -0.65F, 0.0F, -0.55F, -0.65F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F); // Import
        defaultBarrelModel[22].setRotationPoint(16.6F, -5.05F, -0.5F);

        defaultBarrelModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.35F, -0.55F, -0.4F, -0.35F, -0.55F, -0.4F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.55F, -0.65F, -0.4F, -0.55F, -0.65F, -0.4F, -0.7F, -0.2F, -0.35F, -0.7F, -0.2F); // Import
        defaultBarrelModel[23].setRotationPoint(17F, -5.05F, -0.5F);

        defaultBarrelModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.55F, -0.65F, 0.0F, -0.55F, -0.65F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -0.45F, -0.65F, 0.0F, -0.45F, -0.65F, 0.0F, -0.3F, -0.2F, 0.0F, -0.3F, -0.2F); // Import
        defaultBarrelModel[24].setRotationPoint(16.6F, -5.05F, -0.5F);

        defaultBarrelModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.55F, -0.65F, -0.4F, -0.55F, -0.65F, -0.4F, -0.7F, -0.2F, -0.35F, -0.7F, -0.2F, -0.35F, -0.35F, -0.55F, -0.4F, -0.35F, -0.55F, -0.4F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F); // Import
        defaultBarrelModel[25].setRotationPoint(17F, -5.05F, -0.5F);

        defaultBarrelModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.65F, -0.4F, -0.55F, -0.65F, -0.4F, -0.7F, -0.2F, -0.4F, -0.7F, -0.2F, -0.4F, -0.35F, -0.55F, -0.4F, -0.35F, -0.55F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F); // Import
        defaultBarrelModel[26].setRotationPoint(16.65F, -5.05F, -0.5F);

        defaultBarrelModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.55F, -0.65F, -0.4F, -0.55F, -0.65F, -0.4F, -0.7F, -0.2F, -0.35F, -0.7F, -0.2F, -0.35F, -0.35F, -0.55F, -0.4F, -0.35F, -0.55F, -0.4F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F); // Import
        defaultBarrelModel[27].setRotationPoint(16.35F, -5.05F, -0.5F);

        defaultBarrelModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.35F, -0.55F, -0.4F, -0.35F, -0.55F, -0.4F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.55F, -0.65F, -0.4F, -0.55F, -0.65F, -0.4F, -0.7F, -0.2F, -0.35F, -0.7F, -0.2F); // Import
        defaultBarrelModel[28].setRotationPoint(16.35F, -5.05F, -0.5F);

        defaultBarrelModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.55F, -0.4F, -0.35F, -0.55F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.55F, -0.65F, -0.4F, -0.55F, -0.65F, -0.4F, -0.7F, -0.2F, -0.4F, -0.7F, -0.2F); // Import
        defaultBarrelModel[29].setRotationPoint(16.65F, -5.05F, -0.5F);
    }

    private void initdefaultScopeModel_1() {
        defaultScopeModel[0] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Import
        defaultScopeModel[1] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import
        defaultScopeModel[2] = new ModelRendererTurbo(this, 9, 137, textureX, textureY); // Import
        defaultScopeModel[3] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Import
        defaultScopeModel[4] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Import
        defaultScopeModel[5] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Import
        defaultScopeModel[6] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Import
        defaultScopeModel[7] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Import
        defaultScopeModel[8] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Import
        defaultScopeModel[9] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Import
        defaultScopeModel[10] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Import
        defaultScopeModel[11] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Import
        defaultScopeModel[12] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Import
        defaultScopeModel[13] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Import
        defaultScopeModel[14] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Import
        defaultScopeModel[15] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Import
        defaultScopeModel[16] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Import
        defaultScopeModel[17] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Import
        defaultScopeModel[18] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Import
        defaultScopeModel[19] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Import
        defaultScopeModel[20] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Import
        defaultScopeModel[21] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Import
        defaultScopeModel[22] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Import
        defaultScopeModel[23] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Import
        defaultScopeModel[24] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Import
        defaultScopeModel[25] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Import
        defaultScopeModel[26] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Import
        defaultScopeModel[27] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Import
        defaultScopeModel[28] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Import
        defaultScopeModel[29] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Import
        defaultScopeModel[30] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Import
        defaultScopeModel[31] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Import
        defaultScopeModel[32] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import
        defaultScopeModel[33] = new ModelRendererTurbo(this, 9, 145, textureX, textureY); // Import
        defaultScopeModel[34] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Import
        defaultScopeModel[35] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Import
        defaultScopeModel[36] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Import
        defaultScopeModel[37] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Import
        defaultScopeModel[38] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Import
        defaultScopeModel[39] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Import
        defaultScopeModel[40] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Import
        defaultScopeModel[41] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Import
        defaultScopeModel[42] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Import
        defaultScopeModel[43] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Import
        defaultScopeModel[44] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Import
        defaultScopeModel[45] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Import
        defaultScopeModel[46] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Import
        defaultScopeModel[47] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Import
        defaultScopeModel[48] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Import
        defaultScopeModel[49] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Import
        defaultScopeModel[50] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Import
        defaultScopeModel[51] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Import
        defaultScopeModel[52] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Import
        defaultScopeModel[53] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Import
        defaultScopeModel[54] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Import
        defaultScopeModel[55] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Import
        defaultScopeModel[56] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Import
        defaultScopeModel[57] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Import
        defaultScopeModel[58] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Import
        defaultScopeModel[59] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Import
        defaultScopeModel[60] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Import
        defaultScopeModel[61] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Import
        defaultScopeModel[62] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Import
        defaultScopeModel[63] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Import
        defaultScopeModel[64] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Import
        defaultScopeModel[65] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Import
        defaultScopeModel[66] = new ModelRendererTurbo(this, 17, 153, textureX, textureY); // Import
        defaultScopeModel[67] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Import
        defaultScopeModel[68] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Import
        defaultScopeModel[69] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Import
        defaultScopeModel[70] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Import
        defaultScopeModel[71] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Import
        defaultScopeModel[72] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Import
        defaultScopeModel[73] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Import
        defaultScopeModel[74] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Import
        defaultScopeModel[75] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Import
        defaultScopeModel[76] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Import
        defaultScopeModel[77] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Import
        defaultScopeModel[78] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Import
        defaultScopeModel[79] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Import
        defaultScopeModel[80] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Import
        defaultScopeModel[81] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Import
        defaultScopeModel[82] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Import
        defaultScopeModel[83] = new ModelRendererTurbo(this, 153, 153, textureX, textureY); // Import
        defaultScopeModel[84] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Import
        defaultScopeModel[85] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Import
        defaultScopeModel[86] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Import
        defaultScopeModel[87] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Import
        defaultScopeModel[88] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Import
        defaultScopeModel[89] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Import
        defaultScopeModel[90] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Import
        defaultScopeModel[91] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Import
        defaultScopeModel[92] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Import
        defaultScopeModel[93] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Import
        defaultScopeModel[94] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Import
        defaultScopeModel[95] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Import
        defaultScopeModel[96] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import
        defaultScopeModel[97] = new ModelRendererTurbo(this, 9, 161, textureX, textureY); // Import
        defaultScopeModel[98] = new ModelRendererTurbo(this, 17, 161, textureX, textureY); // Import
        defaultScopeModel[99] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Import
        defaultScopeModel[100] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Import
        defaultScopeModel[101] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Import
        defaultScopeModel[102] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Import
        defaultScopeModel[103] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Import
        defaultScopeModel[104] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Import
        defaultScopeModel[105] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Import
        defaultScopeModel[106] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Import
        defaultScopeModel[107] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Import
        defaultScopeModel[108] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Import
        defaultScopeModel[109] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Import
        defaultScopeModel[110] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Import
        defaultScopeModel[111] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Import
        defaultScopeModel[112] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Import
        defaultScopeModel[113] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Import
        defaultScopeModel[114] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Import
        defaultScopeModel[115] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Import
        defaultScopeModel[116] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Import
        defaultScopeModel[117] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Import
        defaultScopeModel[118] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Import
        defaultScopeModel[119] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Import

        defaultScopeModel[0].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F); // Import
        defaultScopeModel[0].setRotationPoint(0.5F, -6.8F, -1.3F);

        defaultScopeModel[1].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F, -0.8F, -0.4F, 0.3F, -0.8F, -0.4F, -1.25F, -0.1F, -0.4F, -1.25F, -0.1F, -0.4F, -1.25F, -0.75F, -0.4F, -1.25F, -0.75F); // Import
        defaultScopeModel[1].setRotationPoint(0.5F, -6.1F, -1.3F);

        defaultScopeModel[2].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F, -0.4F, 0.3F, -0.8F, -0.4F, 0.3F, -0.8F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F, -0.1F, -0.4F, -1.25F, -0.75F, -0.4F, -1.25F, -0.75F, -0.4F, -1.25F, -0.1F, -0.4F, -1.25F, -0.1F); // Import
        defaultScopeModel[2].setRotationPoint(0.5F, -6.1F, -1.7F);

        defaultScopeModel[3].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F, -0.4F, 0.3F, -0.8F, -0.4F, 0.3F, -0.8F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F, -0.1F, -0.4F, -1.2F, -0.8F, -0.4F, -1.2F, -0.8F, -0.4F, -1.2F, -0.1F, -0.4F, -1.2F, -0.1F); // Import
        defaultScopeModel[3].setRotationPoint(0.5F, -6.2F, -1.7F);

        defaultScopeModel[4].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F, -0.4F, 0.3F, -0.85F, -0.4F, 0.3F, -0.85F, -0.4F, 0.3F, -0.05F, -0.4F, 0.3F, -0.05F, -0.4F, -1.2F, -0.85F, -0.4F, -1.2F, -0.85F, -0.4F, -1.2F, -0.05F, -0.4F, -1.2F, -0.05F); // Import
        defaultScopeModel[4].setRotationPoint(0.5F, -6.2F, -2.05F);

        defaultScopeModel[5].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F); // Import
        defaultScopeModel[5].setRotationPoint(0.5F, -7.1F, -1.5F);

        defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.55F, 0.0F, -0.05F, -0.55F, 0.0F, -0.05F, -0.55F, 0.0F, -0.1F, -0.55F, 0.0F, 0.0F, -0.3F, 0.0F, -0.05F, -0.4F, 0.0F, -0.05F, -0.4F, 0.0F, 0.0F, -0.3F, 0.0F); // Import
        defaultScopeModel[6].setRotationPoint(1.6F, -6.2F, -0.5F);

        defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.8F, 0.0F, -0.05F, -0.7F, 0.0F, -0.05F, -0.7F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.1F, 0.0F, -0.15F, -0.1F, 0.0F, -0.15F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F); // Import
        defaultScopeModel[7].setRotationPoint(1.6F, -6.3F, -0.5F);

        defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F, -0.45F, -0.6F, -0.35F, -0.45F, -0.6F, -0.35F); // Import
        defaultScopeModel[8].setRotationPoint(1.7F, -6.1F, -0.15F);

        defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.6F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.35F, -0.45F, -0.6F, -0.35F); // Import
        defaultScopeModel[9].setRotationPoint(1.6F, -6.2F, -0.15F);

        defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.35F, -0.45F, -0.35F, -0.35F); // Import
        defaultScopeModel[10].setRotationPoint(1.8F, -6.35F, -0.15F);

        defaultScopeModel[11].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F); // Import
        defaultScopeModel[11].setRotationPoint(0.44F, -6.95F, -1.65F);

        defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.3F, -0.9F, 0.0F, -0.4F, -0.9F, 0.0F, -0.4F, -0.9F, 0.0F, -0.3F, -0.9F, 0.0F); // Import
        defaultScopeModel[12].setRotationPoint(1.95F, -5.75F, -0.5F);

        defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.6F, -0.35F, -0.45F, -0.6F, -0.35F, -0.45F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F); // Import
        defaultScopeModel[13].setRotationPoint(1.7F, -6.1F, -0.85F);

        defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.6F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, -0.5F, -0.4F, -0.45F, -0.6F, -0.4F); // Import
        defaultScopeModel[14].setRotationPoint(1.6F, -6.2F, -0.85F);

        defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.4F, -0.45F, -0.35F, -0.4F); // Import
        defaultScopeModel[15].setRotationPoint(1.8F, -6.35F, -0.85F);

        defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0.2F, -0.25F, -0.7F, 0.2F, -0.25F, -0.7F, 0.2F, -0.25F, -0.2F, 0.2F, -0.25F, -0.2F, -0.9F, -0.25F, -0.4F, -0.9F, -0.25F, -0.4F, -0.9F, -0.25F, -0.2F, -0.9F, -0.25F); // Import
        defaultScopeModel[16].setRotationPoint(1.95F, -5.75F, -0.5F);

        defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, 0.15F, -0.25F, -0.8F, 0.2F, -0.25F, -0.8F, 0.2F, -0.25F, -0.1F, 0.15F, -0.25F, -0.1F, -0.9F, -0.25F, -0.8F, -0.9F, -0.25F, -0.8F, -0.9F, -0.25F, -0.1F, -0.9F, -0.25F); // Import
        defaultScopeModel[17].setRotationPoint(1.95F, -5.75F, -0.5F);

        defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.3F, 0.0F, -0.1F, -0.3F, 0.0F, -0.1F, -0.3F, 0.0F, -0.2F, -0.3F, 0.0F, -0.2F, -0.6F, 0.0F, -0.1F, -0.6F, 0.0F, -0.1F, -0.6F, 0.0F, -0.2F, -0.6F, 0.0F); // Import
        defaultScopeModel[18].setRotationPoint(1.15F, -6.2F, -0.5F);

        defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.55F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F, -0.4F, -0.9F, 0.0F, -0.15F, -0.9F, 0.0F, -0.15F, -0.9F, 0.0F, -0.4F, -0.9F, 0.0F); // Import
        defaultScopeModel[19].setRotationPoint(1.3F, -5.75F, -0.5F);

        defaultScopeModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.25F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.2F, -0.25F, -0.1F, -0.2F, -0.6F, 0.0F, -0.1F, -0.6F, 0.0F, -0.1F, -0.6F, 0.0F, -0.2F, -0.6F, 0.0F); // Import
        defaultScopeModel[20].setRotationPoint(1.15F, -6.3F, -0.5F);

        defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.35F, -0.5F, 0.0F, -0.35F, -0.2F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.35F, -0.2F, 0.0F); // Import
        defaultScopeModel[21].setRotationPoint(1F, -6.2F, -0.5F);

        defaultScopeModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.475F, -0.45F, 0.05F, -0.475F, -0.45F, 0.05F, -0.475F, -0.45F, 0.05F, -0.475F, -0.45F, 0.05F, -0.475F, -0.45F, 0.05F, -0.475F, -0.45F, 0.05F, -0.475F, -0.45F, 0.05F, -0.475F, -0.45F, 0.05F); // Import
        defaultScopeModel[22].setRotationPoint(1.7F, -6.35F, -0.5F);

        defaultScopeModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.525F, -0.45F, 0.05F, -0.45F, -0.475F, 0.05F, -0.45F, -0.475F, 0.05F, -0.525F, -0.45F, 0.05F, -0.525F, -0.45F, 0.05F, -0.45F, -0.475F, 0.05F, -0.45F, -0.475F, 0.05F, -0.525F, -0.45F, 0.05F); // Import
        defaultScopeModel[23].setRotationPoint(1.7F, -6.35F, -0.5F);

        defaultScopeModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.475F, 0.05F, -0.525F, -0.45F, 0.05F, -0.525F, -0.45F, 0.05F, -0.45F, -0.475F, 0.05F, -0.45F, -0.475F, 0.05F, -0.525F, -0.45F, 0.05F, -0.525F, -0.45F, 0.05F, -0.45F, -0.475F, 0.05F); // Import
        defaultScopeModel[24].setRotationPoint(1.7F, -6.35F, -0.5F);

        defaultScopeModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.6F, 0.0F, -0.45F, -0.6F, 0.0F, -0.45F, -0.6F, 0.0F, -0.35F, -0.6F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F); // Import
        defaultScopeModel[25].setRotationPoint(0.7F, -6.2F, -0.5F);

        defaultScopeModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.6F, -0.1F, -0.35F, -0.6F, -0.1F, -0.35F, -0.6F, -0.1F, -0.2F, -0.6F, -0.1F, -0.2F, -0.25F, -0.1F, -0.3F, -0.25F, -0.1F, -0.3F, -0.25F, -0.1F, -0.2F, -0.25F, -0.1F); // Import
        defaultScopeModel[26].setRotationPoint(0.65F, -6.85F, -0.5F);

        defaultScopeModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.3F, -0.8F, -0.3F, -0.3F, -0.8F, -0.3F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.8F, -0.3F, -0.3F, -0.8F, -0.3F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F); // Import
        defaultScopeModel[27].setRotationPoint(0.65F, -6.4F, -0.5F);

        defaultScopeModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.8F, -0.2F, -0.3F, -0.8F, -0.2F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.8F, -0.2F, -0.3F, -0.8F); // Import
        defaultScopeModel[28].setRotationPoint(0.65F, -6.4F, -0.5F);

        defaultScopeModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.9F, -0.3F, -0.3F, -0.9F, -0.4F, -0.3F, 0.0F, -0.3F, -0.25F, 0.0F, -0.2F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.4F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F); // Import
        defaultScopeModel[29].setRotationPoint(0.65F, -6.4F, -0.5F);

        defaultScopeModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.35F, -0.4F, 0.0F, -0.35F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.35F, -0.5F, 0.0F); // Import
        defaultScopeModel[30].setRotationPoint(1F, -6.2F, -0.5F);

        defaultScopeModel[31].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F, -0.4F, -1.25F, -0.1F, -0.4F, -1.25F, -0.1F, -0.4F, -1.25F, -0.75F, -0.4F, -1.25F, -0.75F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F, -0.8F, -0.4F, 0.3F, -0.8F); // Import
        defaultScopeModel[31].setRotationPoint(0.5F, -7.8F, -1.3F);

        defaultScopeModel[32].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F, -0.4F, -1.25F, -0.75F, -0.4F, -1.25F, -0.75F, -0.4F, -1.25F, -0.1F, -0.4F, -1.25F, -0.1F, -0.4F, 0.3F, -0.8F, -0.4F, 0.3F, -0.8F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F, -0.1F); // Import
        defaultScopeModel[32].setRotationPoint(0.5F, -7.8F, -1.7F);

        defaultScopeModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.25F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.45F, -0.2F, -0.25F, -0.45F, -0.2F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F); // Import
        defaultScopeModel[33].setRotationPoint(0.65F, -6.85F, -0.15F);

        defaultScopeModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.2F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, -0.45F, -0.25F, -0.2F, -0.45F, -0.2F, -0.75F, -0.4F, -0.45F, -0.7F, -0.4F, -0.45F, -0.7F, -0.45F, -0.2F, -0.75F, -0.45F); // Import
        defaultScopeModel[34].setRotationPoint(0.65F, -6.85F, -0.15F);

        defaultScopeModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.25F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.45F, -0.2F, -0.25F, -0.45F, -0.2F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F); // Import
        defaultScopeModel[35].setRotationPoint(0.65F, -6.85F, -0.8F);

        defaultScopeModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.2F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, -0.45F, -0.25F, -0.2F, -0.45F, -0.2F, -0.75F, -0.4F, -0.45F, -0.7F, -0.4F, -0.45F, -0.7F, -0.45F, -0.2F, -0.75F, -0.45F); // Import
        defaultScopeModel[36].setRotationPoint(0.65F, -6.85F, -0.8F);

        defaultScopeModel[37].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.5F, -0.45F, -0.45F, -0.5F, -0.45F, -0.45F, -0.5F, -0.45F, -0.45F, -0.5F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F); // Import
        defaultScopeModel[37].setRotationPoint(-0.45F, -6.9F, -0.1F);

        defaultScopeModel[38].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.55F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.55F, -0.45F); // Import
        defaultScopeModel[38].setRotationPoint(-0.45F, -6.8F, -0.1F);

        defaultScopeModel[39].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.45F, -0.5F, -0.45F, -0.45F, -0.5F, -0.45F, -0.45F, -0.5F, -0.45F, -0.45F, -0.5F, -0.45F); // Import
        defaultScopeModel[39].setRotationPoint(-0.45F, -6.7F, -0.1F);

        defaultScopeModel[40].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.47F, -0.4F, -0.45F, -0.47F, -0.4F, -0.45F, -0.47F, -0.4F, -0.45F, -0.47F, -0.4F, -0.45F, -0.47F, -0.4F, -0.45F, -0.47F, -0.4F, -0.45F, -0.47F, -0.4F, -0.45F, -0.47F); // Import
        defaultScopeModel[40].setRotationPoint(-0.45F, -6.8F, -0.1F);

        defaultScopeModel[41].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.5F, -0.45F, -0.4F, -0.55F, -0.45F, -0.4F, -0.55F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F); // Import
        defaultScopeModel[41].setRotationPoint(-0.45F, -6.8F, -0.1F);

        defaultScopeModel[42].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.55F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.55F, -0.3F, -0.4F, -0.6F, -0.6F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, -0.6F, -0.4F, -0.6F, -0.6F, -0.4F); // Import
        defaultScopeModel[42].setRotationPoint(-0.6F, -6.85F, -1F);

        defaultScopeModel[43].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.4F, -0.55F, -0.3F, -0.4F, -0.55F, -0.3F, -0.4F, -0.4F, -0.4F, -0.4F, -0.45F, -0.55F, -0.4F, -0.45F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F, -0.45F, -0.55F, -0.4F); // Import
        defaultScopeModel[43].setRotationPoint(-0.3F, -6.85F, -1F);

        defaultScopeModel[44].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.45F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.45F, -0.4F); // Import
        defaultScopeModel[44].setRotationPoint(-0.3F, -6.85F, -1F);

        defaultScopeModel[45].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.55F, -0.4F, -0.45F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F, -0.45F, -0.55F, -0.4F, -0.4F, -0.4F, -0.4F, -0.55F, -0.3F, -0.4F, -0.55F, -0.3F, -0.4F, -0.4F, -0.4F, -0.4F); // Import
        defaultScopeModel[45].setRotationPoint(-0.3F, -6.85F, -1F);

        defaultScopeModel[46].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.6F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, -0.6F, -0.4F, -0.6F, -0.6F, -0.4F, -0.55F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.55F, -0.3F, -0.4F); // Import
        defaultScopeModel[46].setRotationPoint(-0.6F, -6.85F, -1F);

        defaultScopeModel[47].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.6F, -0.4F, -0.45F, -0.55F, -0.4F, -0.45F, -0.55F, -0.4F, -0.45F, -0.6F, -0.4F, -0.55F, -0.3F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.55F, -0.3F, -0.4F); // Import
        defaultScopeModel[47].setRotationPoint(-0.6F, -6.85F, -1F);

        defaultScopeModel[48].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.4F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.4F, -0.4F); // Import
        defaultScopeModel[48].setRotationPoint(-0.6F, -6.85F, -1F);

        defaultScopeModel[49].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.55F, -0.3F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.55F, -0.3F, -0.4F, -0.45F, -0.6F, -0.4F, -0.45F, -0.55F, -0.4F, -0.45F, -0.55F, -0.4F, -0.45F, -0.6F, -0.4F); // Import
        defaultScopeModel[49].setRotationPoint(-0.6F, -6.85F, -1F);

        defaultScopeModel[50].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F); // Import
        defaultScopeModel[50].setRotationPoint(-0.45F, -6.85F, -1F);

        defaultScopeModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.25F, 0.0F, -0.4F, -0.3F, 0.0F, -0.3F, -0.3F, -0.9F, -0.2F, -0.2F, -0.9F, -0.3F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.3F, -0.3F, -0.9F, -0.2F, -0.3F, -0.9F); // Import
        defaultScopeModel[51].setRotationPoint(0.65F, -6.4F, -0.5F);

        defaultScopeModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.35F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F); // Import
        defaultScopeModel[52].setRotationPoint(0.55F, -6.3F, -0.5F);

        defaultScopeModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.45F, -0.3F, -0.4F, -0.35F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.35F, -0.6F, -0.4F); // Import
        defaultScopeModel[53].setRotationPoint(0.55F, -6.3F, -0.5F);

        defaultScopeModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.55F, -0.2F, -0.2F, -0.55F, -0.2F, -0.2F, -0.55F, -0.2F, -0.35F, -0.55F, -0.2F, -0.5F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F); // Import
        defaultScopeModel[54].setRotationPoint(0.55F, -6.3F, -0.5F);

        defaultScopeModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.4F, -0.8F, -0.3F, -0.4F, -0.8F, -0.3F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.3F, -0.5F, -0.8F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F); // Import
        defaultScopeModel[55].setRotationPoint(0.65F, -6.1F, -0.5F);

        defaultScopeModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.4F, -0.9F, -0.3F, -0.4F, -0.9F, -0.4F, -0.4F, 0.0F, -0.3F, -0.4F, 0.0F, -0.3F, -0.5F, -0.9F, -0.4F, -0.5F, -0.9F, -0.45F, -0.55F, 0.0F, -0.35F, -0.55F, 0.0F); // Import
        defaultScopeModel[56].setRotationPoint(0.65F, -6.1F, -0.5F);

        defaultScopeModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.3F, -0.4F, -0.9F, -0.2F, -0.4F, -0.9F, -0.35F, -0.55F, 0.0F, -0.45F, -0.55F, 0.0F, -0.4F, -0.5F, -0.9F, -0.3F, -0.5F, -0.9F); // Import
        defaultScopeModel[57].setRotationPoint(0.65F, -6.1F, -0.5F);

        defaultScopeModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.3F, -0.5F, -0.1F, -0.4F, -0.5F, -0.1F, -0.4F, -0.5F, -0.8F, -0.3F, -0.5F, -0.8F); // Import
        defaultScopeModel[58].setRotationPoint(0.65F, -6.1F, -0.5F);

        defaultScopeModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.55F, -0.6F, 0.0F, -0.35F, -0.5F, 0.0F, -0.35F, -0.5F, 0.0F, -0.55F, -0.6F, 0.0F, -0.55F, -0.2F, 0.0F, -0.35F, -0.2F, 0.0F, -0.35F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F); // Import
        defaultScopeModel[59].setRotationPoint(0.7F, -6.2F, -0.5F);

        defaultScopeModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.475F, -0.45F, 0.05F, -0.475F, -0.45F, 0.05F, -0.475F, -0.45F, 0.05F, -0.475F, -0.45F, 0.05F, -0.475F, -0.45F, 0.05F, -0.475F, -0.45F, 0.05F, -0.475F, -0.45F, 0.05F, -0.475F, -0.45F, 0.05F); // Import
        defaultScopeModel[60].setRotationPoint(0.6F, -6.3F, -0.5F);

        defaultScopeModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.525F, -0.45F, 0.05F, -0.45F, -0.475F, 0.05F, -0.45F, -0.475F, 0.05F, -0.525F, -0.45F, 0.05F, -0.525F, -0.45F, 0.05F, -0.45F, -0.475F, 0.05F, -0.45F, -0.475F, 0.05F, -0.525F, -0.45F, 0.05F); // Import
        defaultScopeModel[61].setRotationPoint(0.6F, -6.3F, -0.5F);

        defaultScopeModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.475F, 0.05F, -0.525F, -0.45F, 0.05F, -0.525F, -0.45F, 0.05F, -0.45F, -0.475F, 0.05F, -0.45F, -0.475F, 0.05F, -0.525F, -0.45F, 0.05F, -0.525F, -0.45F, 0.05F, -0.45F, -0.475F, 0.05F); // Import
        defaultScopeModel[62].setRotationPoint(0.6F, -6.3F, -0.5F);

        defaultScopeModel[63].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F); // Import
        defaultScopeModel[63].setRotationPoint(0.44F, -6.95F, -1.35F);

        defaultScopeModel[64].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F); // Import
        defaultScopeModel[64].setRotationPoint(0.45F, -6.15F, -0.5F);

        defaultScopeModel[65].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F); // Import
        defaultScopeModel[65].setRotationPoint(0.45F, -6.05F, -0.5F);

        defaultScopeModel[66].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F); // Import
        defaultScopeModel[66].setRotationPoint(0.45F, -5.95F, -0.5F);

        defaultScopeModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.55F, -0.2F, -0.6F, -0.2F, -0.25F, -0.6F, -0.2F, -0.25F, -0.2F, -0.55F, -0.2F, -0.2F, -0.35F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, -0.6F, -0.2F, -0.35F, -0.6F, -0.2F); // Import
        defaultScopeModel[67].setRotationPoint(0.55F, -6.3F, -0.5F);

        defaultScopeModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.55F, -0.2F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.6F, -0.55F, -0.2F, -0.6F, -0.35F, -0.6F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.6F, -0.6F, -0.35F, -0.6F, -0.6F); // Import
        defaultScopeModel[68].setRotationPoint(0.55F, -6.3F, -0.5F);

        defaultScopeModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.55F, 0.0F, -0.05F, -0.55F, 0.0F, -0.05F, -0.55F, 0.0F, -0.1F, -0.55F, 0.0F, 0.0F, -0.3F, 0.0F, -0.05F, -0.4F, 0.0F, -0.05F, -0.4F, 0.0F, 0.0F, -0.3F, 0.0F); // Import
        defaultScopeModel[69].setRotationPoint(16.6F, -6.2F, -0.5F);

        defaultScopeModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.8F, 0.0F, -0.05F, -0.7F, 0.0F, -0.05F, -0.7F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.1F, 0.0F, -0.15F, -0.1F, 0.0F, -0.15F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F); // Import
        defaultScopeModel[70].setRotationPoint(16.6F, -6.3F, -0.5F);

        defaultScopeModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F, -0.45F, -0.6F, -0.35F, -0.45F, -0.6F, -0.35F); // Import
        defaultScopeModel[71].setRotationPoint(16.7F, -6.1F, -0.15F);

        defaultScopeModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.6F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.35F, -0.45F, -0.6F, -0.35F); // Import
        defaultScopeModel[72].setRotationPoint(16.6F, -6.2F, -0.15F);

        defaultScopeModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.35F, -0.45F, -0.35F, -0.35F); // Import
        defaultScopeModel[73].setRotationPoint(16.8F, -6.35F, -0.15F);

        defaultScopeModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.3F, -0.9F, 0.0F, -0.4F, -0.9F, 0.0F, -0.4F, -0.9F, 0.0F, -0.3F, -0.9F, 0.0F); // Import
        defaultScopeModel[74].setRotationPoint(16.95F, -5.75F, -0.5F);

        defaultScopeModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.6F, -0.35F, -0.45F, -0.6F, -0.35F, -0.45F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F); // Import
        defaultScopeModel[75].setRotationPoint(16.7F, -6.1F, -0.85F);

        defaultScopeModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.6F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, -0.5F, -0.4F, -0.45F, -0.6F, -0.4F); // Import
        defaultScopeModel[76].setRotationPoint(16.6F, -6.2F, -0.85F);

        defaultScopeModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.4F, -0.45F, -0.35F, -0.4F); // Import
        defaultScopeModel[77].setRotationPoint(16.8F, -6.35F, -0.85F);

        defaultScopeModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0.2F, -0.25F, -0.7F, 0.2F, -0.25F, -0.7F, 0.2F, -0.25F, -0.2F, 0.2F, -0.25F, -0.2F, -0.9F, -0.25F, -0.4F, -0.9F, -0.25F, -0.4F, -0.9F, -0.25F, -0.2F, -0.9F, -0.25F); // Import
        defaultScopeModel[78].setRotationPoint(16.95F, -5.75F, -0.5F);

        defaultScopeModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, 0.15F, -0.25F, -0.8F, 0.2F, -0.25F, -0.8F, 0.2F, -0.25F, -0.1F, 0.15F, -0.25F, -0.1F, -0.9F, -0.25F, -0.8F, -0.9F, -0.25F, -0.8F, -0.9F, -0.25F, -0.1F, -0.9F, -0.25F); // Import
        defaultScopeModel[79].setRotationPoint(16.95F, -5.75F, -0.5F);

        defaultScopeModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.3F, 0.0F, -0.1F, -0.3F, 0.0F, -0.1F, -0.3F, 0.0F, -0.2F, -0.3F, 0.0F, -0.2F, -0.6F, 0.0F, -0.1F, -0.6F, 0.0F, -0.1F, -0.6F, 0.0F, -0.2F, -0.6F, 0.0F); // Import
        defaultScopeModel[80].setRotationPoint(16.15F, -6.2F, -0.5F);

        defaultScopeModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.55F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F, -0.4F, -0.9F, 0.0F, -0.15F, -0.9F, 0.0F, -0.15F, -0.9F, 0.0F, -0.4F, -0.9F, 0.0F); // Import
        defaultScopeModel[81].setRotationPoint(16.3F, -5.75F, -0.5F);

        defaultScopeModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.25F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.2F, -0.25F, -0.1F, -0.2F, -0.6F, 0.0F, -0.1F, -0.6F, 0.0F, -0.1F, -0.6F, 0.0F, -0.2F, -0.6F, 0.0F); // Import
        defaultScopeModel[82].setRotationPoint(16.15F, -6.3F, -0.5F);

        defaultScopeModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.35F, -0.5F, 0.0F, -0.35F, -0.2F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.35F, -0.2F, 0.0F); // Import
        defaultScopeModel[83].setRotationPoint(16F, -6.2F, -0.5F);

        defaultScopeModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.475F, -0.45F, 0.05F, -0.475F, -0.45F, 0.05F, -0.475F, -0.45F, 0.05F, -0.475F, -0.45F, 0.05F, -0.475F, -0.45F, 0.05F, -0.475F, -0.45F, 0.05F, -0.475F, -0.45F, 0.05F, -0.475F, -0.45F, 0.05F); // Import
        defaultScopeModel[84].setRotationPoint(16.7F, -6.35F, -0.5F);

        defaultScopeModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.525F, -0.45F, 0.05F, -0.45F, -0.475F, 0.05F, -0.45F, -0.475F, 0.05F, -0.525F, -0.45F, 0.05F, -0.525F, -0.45F, 0.05F, -0.45F, -0.475F, 0.05F, -0.45F, -0.475F, 0.05F, -0.525F, -0.45F, 0.05F); // Import
        defaultScopeModel[85].setRotationPoint(16.7F, -6.35F, -0.5F);

        defaultScopeModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.475F, 0.05F, -0.525F, -0.45F, 0.05F, -0.525F, -0.45F, 0.05F, -0.45F, -0.475F, 0.05F, -0.45F, -0.475F, 0.05F, -0.525F, -0.45F, 0.05F, -0.525F, -0.45F, 0.05F, -0.45F, -0.475F, 0.05F); // Import
        defaultScopeModel[86].setRotationPoint(16.7F, -6.35F, -0.5F);

        defaultScopeModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.6F, 0.0F, -0.45F, -0.6F, 0.0F, -0.45F, -0.6F, 0.0F, -0.35F, -0.6F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F); // Import
        defaultScopeModel[87].setRotationPoint(15.7F, -6.2F, -0.5F);

        defaultScopeModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.6F, -0.1F, -0.35F, -0.6F, -0.1F, -0.35F, -0.6F, -0.1F, -0.2F, -0.6F, -0.1F, -0.2F, -0.25F, -0.1F, -0.3F, -0.25F, -0.1F, -0.3F, -0.25F, -0.1F, -0.2F, -0.25F, -0.1F); // Import
        defaultScopeModel[88].setRotationPoint(15.65F, -6.85F, -0.5F);

        defaultScopeModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.3F, -0.8F, -0.3F, -0.3F, -0.8F, -0.3F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.8F, -0.3F, -0.3F, -0.8F, -0.3F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F); // Import
        defaultScopeModel[89].setRotationPoint(15.65F, -6.4F, -0.5F);

        defaultScopeModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.8F, -0.2F, -0.3F, -0.8F, -0.2F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.8F, -0.2F, -0.3F, -0.8F); // Import
        defaultScopeModel[90].setRotationPoint(15.65F, -6.4F, -0.5F);

        defaultScopeModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.9F, -0.3F, -0.3F, -0.9F, -0.4F, -0.3F, 0.0F, -0.3F, -0.25F, 0.0F, -0.2F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.4F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F); // Import
        defaultScopeModel[91].setRotationPoint(15.65F, -6.4F, -0.5F);

        defaultScopeModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.35F, -0.4F, 0.0F, -0.35F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.35F, -0.5F, 0.0F); // Import
        defaultScopeModel[92].setRotationPoint(16F, -6.2F, -0.5F);

        defaultScopeModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.25F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F, -0.55F, -0.4F, -0.4F, -0.55F, -0.4F, -0.4F, -0.55F, -0.45F, -0.2F, -0.55F, -0.45F); // Import
        defaultScopeModel[93].setRotationPoint(15.65F, -6.85F, -0.15F);

        defaultScopeModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.25F, -0.4F, -0.45F, -0.3F, -0.4F, -0.5F, -0.25F, -0.475F, -0.25F, -0.2F, -0.475F, -0.2F, -0.75F, -0.4F, -0.45F, -0.7F, -0.4F, -0.45F, -0.7F, -0.45F, -0.2F, -0.75F, -0.45F); // Import
        defaultScopeModel[94].setRotationPoint(15.65F, -6.85F, -0.2F);

        defaultScopeModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.25F, 0.0F, -0.4F, -0.3F, 0.0F, -0.3F, -0.3F, -0.9F, -0.2F, -0.2F, -0.9F, -0.3F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.3F, -0.3F, -0.9F, -0.2F, -0.3F, -0.9F); // Import
        defaultScopeModel[95].setRotationPoint(15.65F, -6.4F, -0.5F);

        defaultScopeModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.35F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F); // Import
        defaultScopeModel[96].setRotationPoint(15.55F, -6.3F, -0.5F);

        defaultScopeModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.45F, -0.3F, -0.4F, -0.35F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.35F, -0.6F, -0.4F); // Import
        defaultScopeModel[97].setRotationPoint(15.55F, -6.3F, -0.5F);

        defaultScopeModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.55F, -0.2F, -0.2F, -0.55F, -0.2F, -0.2F, -0.55F, -0.2F, -0.35F, -0.55F, -0.2F, -0.5F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F); // Import
        defaultScopeModel[98].setRotationPoint(15.55F, -6.3F, -0.5F);

        defaultScopeModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.4F, -0.8F, -0.3F, -0.4F, -0.8F, -0.3F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.3F, -0.5F, -0.8F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F); // Import
        defaultScopeModel[99].setRotationPoint(15.65F, -6.1F, -0.5F);

        defaultScopeModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.4F, -0.9F, -0.3F, -0.4F, -0.9F, -0.4F, -0.4F, 0.0F, -0.3F, -0.4F, 0.0F, -0.3F, -0.5F, -0.9F, -0.4F, -0.5F, -0.9F, -0.45F, -0.55F, 0.0F, -0.35F, -0.55F, 0.0F); // Import
        defaultScopeModel[100].setRotationPoint(15.65F, -6.1F, -0.5F);

        defaultScopeModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.3F, -0.4F, -0.9F, -0.2F, -0.4F, -0.9F, -0.35F, -0.55F, 0.0F, -0.45F, -0.55F, 0.0F, -0.4F, -0.5F, -0.9F, -0.3F, -0.5F, -0.9F); // Import
        defaultScopeModel[101].setRotationPoint(15.65F, -6.1F, -0.5F);

        defaultScopeModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.3F, -0.5F, -0.1F, -0.4F, -0.5F, -0.1F, -0.4F, -0.5F, -0.8F, -0.3F, -0.5F, -0.8F); // Import
        defaultScopeModel[102].setRotationPoint(15.65F, -6.1F, -0.5F);

        defaultScopeModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.55F, -0.6F, 0.0F, -0.35F, -0.5F, 0.0F, -0.35F, -0.5F, 0.0F, -0.55F, -0.6F, 0.0F, -0.55F, -0.2F, 0.0F, -0.35F, -0.2F, 0.0F, -0.35F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F); // Import
        defaultScopeModel[103].setRotationPoint(15.7F, -6.2F, -0.5F);

        defaultScopeModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.475F, -0.45F, 0.05F, -0.475F, -0.45F, 0.05F, -0.475F, -0.45F, 0.05F, -0.475F, -0.45F, 0.05F, -0.475F, -0.45F, 0.05F, -0.475F, -0.45F, 0.05F, -0.475F, -0.45F, 0.05F, -0.475F, -0.45F, 0.05F); // Import
        defaultScopeModel[104].setRotationPoint(15.6F, -6.3F, -0.5F);

        defaultScopeModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.525F, -0.45F, 0.05F, -0.45F, -0.475F, 0.05F, -0.45F, -0.475F, 0.05F, -0.525F, -0.45F, 0.05F, -0.525F, -0.45F, 0.05F, -0.45F, -0.475F, 0.05F, -0.45F, -0.475F, 0.05F, -0.525F, -0.45F, 0.05F); // Import
        defaultScopeModel[105].setRotationPoint(15.6F, -6.3F, -0.5F);

        defaultScopeModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.475F, 0.05F, -0.525F, -0.45F, 0.05F, -0.525F, -0.45F, 0.05F, -0.45F, -0.475F, 0.05F, -0.45F, -0.475F, 0.05F, -0.525F, -0.45F, 0.05F, -0.525F, -0.45F, 0.05F, -0.45F, -0.475F, 0.05F); // Import
        defaultScopeModel[106].setRotationPoint(15.6F, -6.3F, -0.5F);

        defaultScopeModel[107].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F, -0.45F, -0.475F, -0.475F); // Import
        defaultScopeModel[107].setRotationPoint(15.54F, -6.95F, -1.5F);

        defaultScopeModel[108].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F); // Import
        defaultScopeModel[108].setRotationPoint(15.45F, -6.15F, -0.5F);

        defaultScopeModel[109].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F); // Import
        defaultScopeModel[109].setRotationPoint(15.45F, -6.05F, -0.5F);

        defaultScopeModel[110].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F); // Import
        defaultScopeModel[110].setRotationPoint(15.45F, -5.95F, -0.5F);

        defaultScopeModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.55F, -0.2F, -0.6F, -0.2F, -0.25F, -0.6F, -0.2F, -0.25F, -0.2F, -0.55F, -0.2F, -0.2F, -0.35F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, -0.6F, -0.2F, -0.35F, -0.6F, -0.2F); // Import
        defaultScopeModel[111].setRotationPoint(15.55F, -6.3F, -0.5F);

        defaultScopeModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.55F, -0.2F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.6F, -0.55F, -0.2F, -0.6F, -0.35F, -0.6F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.6F, -0.6F, -0.35F, -0.6F, -0.6F); // Import
        defaultScopeModel[112].setRotationPoint(15.55F, -6.3F, -0.5F);

        defaultScopeModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F); // Import
        defaultScopeModel[113].setRotationPoint(15.65F, -6.85F, -0.15F);

        defaultScopeModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.2F, -0.475F, -0.5F, -0.25F, -0.475F, -0.45F, -0.3F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.75F, -0.45F, -0.45F, -0.7F, -0.45F, -0.45F, -0.7F, -0.4F, -0.2F, -0.75F, -0.4F); // Import
        defaultScopeModel[114].setRotationPoint(15.65F, -6.85F, -0.8F);

        defaultScopeModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.25F, -0.5F, -0.45F, -0.3F, -0.5F, -0.45F, -0.3F, -0.35F, -0.2F, -0.25F, -0.35F, -0.2F, -0.55F, -0.45F, -0.4F, -0.55F, -0.45F, -0.4F, -0.55F, -0.4F, -0.2F, -0.55F, -0.4F); // Import
        defaultScopeModel[115].setRotationPoint(15.65F, -6.85F, -0.85F);

        defaultScopeModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F); // Import
        defaultScopeModel[116].setRotationPoint(15.65F, -6.85F, -0.85F);

        defaultScopeModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F); // Import
        defaultScopeModel[117].setRotationPoint(15.55F, -6.8F, -0.5F);

        defaultScopeModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F); // Import
        defaultScopeModel[118].setRotationPoint(15.55F, -6.9F, -0.5F);

        defaultScopeModel[119].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F, -0.3F); // Import
        defaultScopeModel[119].setRotationPoint(0.5F, -7.1F, -1.5F);
    }

    private void initdefaultStockModel_1() {
        defaultStockModel[0] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Import
        defaultStockModel[1] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Import
        defaultStockModel[2] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import
        defaultStockModel[3] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Import
        defaultStockModel[4] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Import
        defaultStockModel[5] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Import
        defaultStockModel[6] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Import
        defaultStockModel[7] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Import
        defaultStockModel[8] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Import
        defaultStockModel[9] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Import
        defaultStockModel[10] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Import
        defaultStockModel[11] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Import
        defaultStockModel[12] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Import
        defaultStockModel[13] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Import
        defaultStockModel[14] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Import
        defaultStockModel[15] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Import
        defaultStockModel[16] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Import
        defaultStockModel[17] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Import
        defaultStockModel[18] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Import
        defaultStockModel[19] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Import
        defaultStockModel[20] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Import
        defaultStockModel[21] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Import
        defaultStockModel[22] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Import
        defaultStockModel[23] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Import
        defaultStockModel[24] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Import
        defaultStockModel[25] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Import
        defaultStockModel[26] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Import
        defaultStockModel[27] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Import
        defaultStockModel[28] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import
        defaultStockModel[29] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Import
        defaultStockModel[30] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Import
        defaultStockModel[31] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Import
        defaultStockModel[32] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Import
        defaultStockModel[33] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Import
        defaultStockModel[34] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Import
        defaultStockModel[35] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Import
        defaultStockModel[36] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Import
        defaultStockModel[37] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Import
        defaultStockModel[38] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Import
        defaultStockModel[39] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Import
        defaultStockModel[40] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Import
        defaultStockModel[41] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Import
        defaultStockModel[42] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Import
        defaultStockModel[43] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Import
        defaultStockModel[44] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Import
        defaultStockModel[45] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Import
        defaultStockModel[46] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Import
        defaultStockModel[47] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Import
        defaultStockModel[48] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Import
        defaultStockModel[49] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Import
        defaultStockModel[50] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Import
        defaultStockModel[51] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Import
        defaultStockModel[52] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Import
        defaultStockModel[53] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Import
        defaultStockModel[54] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Import
        defaultStockModel[55] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import
        defaultStockModel[56] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Import
        defaultStockModel[57] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Import
        defaultStockModel[58] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Import

        defaultStockModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.3F, -0.7F, 0.25F, 0.5F, -0.7F, 0.25F, 0.5F, -0.7F, 0.25F, -0.3F, -0.7F, 0.25F, -0.3F, 0.05F, 0.25F, 0.5F, 0.05F, 0.25F, 0.5F, 0.05F, 0.25F, -0.3F, 0.05F, 0.25F); // Import
        defaultStockModel[0].setRotationPoint(-5.8F, -4.85F, -0.5F);

        defaultStockModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, -0.5F, 0.7F, 0.0F, -0.5F, 0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, -0.1F, 0.7F, -0.6F, -0.1F, 0.7F, -0.6F, 0.4F, 0.0F, -0.6F, 0.4F); // Import
        defaultStockModel[1].setRotationPoint(-5.8F, -5.15F, -0.75F);

        defaultStockModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, -0.1F, 0.7F, 0.0F, -0.1F, 0.7F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, -0.3F, -0.4F, 0.0F, 0.5F, -0.4F, 0.0F, 0.5F, -0.4F, 0.5F, -0.3F, -0.4F, 0.5F); // Import
        defaultStockModel[2].setRotationPoint(-5.8F, -4.75F, -0.75F);

        defaultStockModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.5F, -0.3F, 0.0F, 0.5F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, 0.5F); // Import
        defaultStockModel[3].setRotationPoint(-6.5F, -4.15F, -0.75F);

        defaultStockModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.6F, 0.15F, -0.3F, -0.6F, 0.15F, -0.3F, -0.6F, 0.15F, -0.3F, -0.6F, 0.15F, -0.3F, 0.0F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, 0.0F, -0.25F); // Import
        defaultStockModel[4].setRotationPoint(-6.5F, -2.85F, -0.5F);

        defaultStockModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.0F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.1F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.2F, -0.7F, -0.1F, -0.8F, -0.7F, -0.1F, -0.8F, 0.0F, 0.0F, 0.2F, 0.0F); // Import
        defaultStockModel[5].setRotationPoint(-4.8F, -3.55F, -0.85F);

        defaultStockModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -1.1F, -0.3F, -0.3F, -1.1F, -0.3F, -0.3F, -1.1F, -0.3F, 0.0F, -1.1F, -0.3F, 0.0F, 0.2F, -0.25F, -0.1F, 0.2F, -0.25F, -0.1F, 0.2F, -0.25F, 0.0F, 0.2F, -0.25F); // Import
        defaultStockModel[6].setRotationPoint(-2.8F, -4.6F, -0.5F);

        defaultStockModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -1.6F, -0.3F, -0.8F, -1.1F, -0.3F, -0.8F, -1.1F, -0.3F, -0.2F, -1.6F, -0.3F, -0.2F, 0.7F, -0.25F, -0.8F, 0.2F, -0.25F, -0.8F, 0.2F, -0.25F, -0.2F, 0.7F, -0.25F); // Import
        defaultStockModel[7].setRotationPoint(-4F, -4.6F, -0.5F);

        defaultStockModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.4F, -1.1F, -0.65F, -0.4F, -1.1F, -0.65F, -0.4F, -1.1F, 0.05F, -0.4F, -1.1F, 0.05F, -0.4F, 0.6F, -0.65F, -0.4F, 0.6F, -0.65F, -0.4F, 0.6F, 0.05F, -0.4F, 0.6F, 0.05F); // Import
        defaultStockModel[8].setRotationPoint(-3F, -5.1F, -0.85F);

        defaultStockModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0.2F, -0.5F, -0.3F, 0.2F, -0.5F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, -0.8F, -0.1F, -0.3F, -0.8F, -0.1F, -0.3F, -0.8F, 0.4F, -0.3F, -0.8F, 0.4F); // Import
        defaultStockModel[9].setRotationPoint(-6.5F, -4.95F, -0.75F);

        defaultStockModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, -0.45F, -0.7F, 0.45F, -0.45F, -0.7F, 0.45F, -0.45F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.5F, -0.7F, 0.4F, -0.5F, -0.7F, 0.4F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        defaultStockModel[10].setRotationPoint(-5.8F, -4.05F, -0.85F);

        defaultStockModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -1.1F, -0.65F, -0.4F, -1.1F, -0.75F, -0.4F, -1.1F, -0.05F, -0.5F, -1.1F, 0.05F, -0.5F, 0.6F, -0.65F, -0.4F, 0.6F, -0.75F, -0.4F, 0.6F, -0.05F, -0.5F, 0.6F, 0.05F); // Import
        defaultStockModel[11].setRotationPoint(-2.9F, -5.1F, -0.85F);

        defaultStockModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.4F, -1.1F, -0.75F, -0.5F, -1.1F, -0.65F, -0.5F, -1.1F, 0.05F, -0.4F, -1.1F, -0.05F, -0.4F, 0.6F, -0.75F, -0.5F, 0.6F, -0.65F, -0.5F, 0.6F, 0.05F, -0.4F, 0.6F, -0.05F); // Import
        defaultStockModel[12].setRotationPoint(-3.1F, -5.1F, -0.85F);

        defaultStockModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0.0F, 0.15F, -0.3F, 0.0F, 0.15F, -0.3F, 0.0F, 0.15F, -0.3F, 0.0F, 0.15F, -0.3F, -0.4F, 0.25F, -0.3F, -0.4F, 0.25F, -0.3F, -0.4F, 0.25F, -0.3F, -0.4F, 0.25F); // Import
        defaultStockModel[13].setRotationPoint(-6.5F, -4.75F, -0.5F);

        defaultStockModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.45F, -0.4F, -0.7F, 0.15F, -0.4F, -0.7F, 0.15F, -0.4F, 0.0F, -0.45F, -0.4F, 0.0F, -0.5F, -0.55F, -0.7F, 0.1F, -0.55F, -0.7F, 0.1F, -0.55F, 0.0F, -0.5F, -0.55F, 0.0F); // Import
        defaultStockModel[14].setRotationPoint(-4.8F, -3.95F, -0.85F);

        defaultStockModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.45F, -0.7F, -0.25F, -0.45F, -0.7F, -0.25F, -0.45F, 0.0F, -0.35F, -0.45F, 0.0F, -0.35F, -0.5F, -0.7F, -0.25F, -0.5F, -0.7F, -0.25F, -0.5F, 0.0F, -0.35F, -0.5F, 0.0F); // Import
        defaultStockModel[15].setRotationPoint(-6.15F, -3.95F, -0.85F);

        defaultStockModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.4F, -0.7F, 0.25F, -0.4F, -0.7F, 0.25F, -0.4F, 0.0F, -0.8F, -0.4F, 0.0F, -0.8F, -0.55F, -0.7F, 0.2F, -0.55F, -0.7F, 0.2F, -0.55F, 0.0F, -0.8F, -0.55F, 0.0F); // Import
        defaultStockModel[16].setRotationPoint(-6.6F, -3.95F, -0.85F);

        defaultStockModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.95F, -0.45F, -0.7F, -0.45F, -0.45F, -0.7F, -0.45F, -0.45F, 0.0F, -0.95F, -0.45F, 0.0F, -0.95F, -0.5F, -0.7F, -0.45F, -0.5F, -0.7F, -0.45F, -0.5F, 0.0F, -0.95F, -0.5F, 0.0F); // Import
        defaultStockModel[17].setRotationPoint(-5.25F, -3.95F, -0.85F);

        defaultStockModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, -0.55F, -0.7F, 0.1F, -0.55F, -0.7F, 0.1F, -0.55F, 0.0F, -0.5F, -0.55F, 0.0F, -0.45F, -0.4F, -0.7F, 0.15F, -0.4F, -0.7F, 0.15F, -0.4F, 0.0F, -0.45F, -0.4F, 0.0F); // Import
        defaultStockModel[18].setRotationPoint(-4.8F, -4F, -0.85F);

        defaultStockModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.55F, -0.7F, 0.2F, -0.55F, -0.7F, 0.2F, -0.55F, 0.0F, -0.8F, -0.55F, 0.0F, -0.8F, -0.4F, -0.7F, 0.25F, -0.4F, -0.7F, 0.25F, -0.4F, 0.0F, -0.8F, -0.4F, 0.0F); // Import
        defaultStockModel[19].setRotationPoint(-6.6F, -4F, -0.85F);

        defaultStockModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.6F, -0.25F, -0.8F, -0.1F, -0.25F, -0.8F, -0.1F, -0.25F, -0.2F, -0.6F, -0.25F, -0.2F, -0.25F, -0.3F, -0.8F, -0.75F, -0.3F, -0.8F, -0.75F, -0.3F, -0.2F, -0.25F, -0.3F); // Import
        defaultStockModel[20].setRotationPoint(-4F, -3.1F, -0.5F);

        defaultStockModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.2F, -0.25F, 0.0F, -0.2F, -0.25F, 0.0F, -0.2F, -0.25F, 0.0F, -0.2F, -0.25F, 0.0F, -0.65F, -0.3F, -0.1F, -0.65F, -0.3F, -0.1F, -0.65F, -0.3F, 0.0F, -0.65F, -0.3F); // Import
        defaultStockModel[21].setRotationPoint(-2.8F, -3.2F, -0.5F);

        defaultStockModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F); // Import
        defaultStockModel[22].setRotationPoint(-2.8F, -4.5F, -0.5F);

        defaultStockModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -1.6F, -0.25F, -0.8F, -1.1F, -0.25F, -0.8F, -1.1F, -0.25F, -0.2F, -1.6F, -0.25F, -0.2F, 1.0F, -0.25F, -0.8F, 0.5F, -0.25F, -0.8F, 0.5F, -0.25F, -0.2F, 1.0F, -0.25F); // Import
        defaultStockModel[23].setRotationPoint(-4F, -4.5F, -0.5F);

        defaultStockModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.3F, -0.1F, 0.25F, 0.5F, -0.1F, 0.25F, 0.5F, -0.1F, 0.25F, -0.3F, -0.1F, 0.25F, 0.0F, -0.7F, 0.0F, 0.5F, -0.7F, 0.0F, 0.5F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F); // Import
        defaultStockModel[24].setRotationPoint(-5.8F, -3.9F, -0.5F);

        defaultStockModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -1.3F, -0.25F, -0.1F, -1.3F, -0.25F, -0.1F, -1.3F, -0.25F, 0.0F, -1.3F, -0.25F, 0.0F, 0.45F, -0.25F, 0.0F, 0.45F, -0.25F, 0.0F, 0.45F, -0.25F, 0.0F, 0.45F, -0.25F); // Import
        defaultStockModel[25].setRotationPoint(-2.8F, -4.7F, -0.5F);

        defaultStockModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.55F, -0.7F, -0.95F, -0.55F, -0.7F, -0.95F, -0.55F, 0.0F, 0.0F, -0.55F, 0.0F, 0.05F, -0.4F, -0.7F, -1.0F, -0.4F, -0.7F, -1.0F, -0.4F, 0.0F, 0.05F, -0.4F, 0.0F); // Import
        defaultStockModel[26].setRotationPoint(-1.55F, -4F, -0.85F);

        defaultStockModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.7F, -0.5F, -0.45F, -0.7F, -0.5F, -0.45F, 0.0F, -0.4F, -0.45F, 0.0F, -0.4F, -0.5F, -0.7F, -0.55F, -0.5F, -0.7F, -0.55F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F); // Import
        defaultStockModel[27].setRotationPoint(-1.95F, -3.95F, -0.85F);

        defaultStockModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.4F, -0.7F, -0.9F, -0.4F, -0.7F, -0.9F, -0.4F, 0.0F, 0.1F, -0.4F, 0.0F, 0.05F, -0.55F, -0.7F, -0.95F, -0.55F, -0.7F, -0.95F, -0.55F, 0.0F, 0.05F, -0.55F, 0.0F); // Import
        defaultStockModel[28].setRotationPoint(-1.5F, -3.95F, -0.85F);

        defaultStockModel[29].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, -0.45F, -0.7F, 0.25F, -0.45F, -0.7F, 0.25F, -0.45F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.5F, -0.7F, 0.2F, -0.5F, -0.7F, 0.2F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        defaultStockModel[29].setRotationPoint(-5.8F, -3.85F, -0.85F);

        defaultStockModel[30].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.45F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.45F, -0.3F); // Import
        defaultStockModel[30].setRotationPoint(-6.3F, -3.4F, -0.5F);

        defaultStockModel[31].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.3F, -0.55F, -0.3F, -0.3F, -0.55F, -0.3F, -0.3F, -0.4F, -0.4F, -0.3F, -0.45F, -0.55F, -0.3F, -0.45F, -0.6F, -0.3F, -0.45F, -0.6F, -0.3F, -0.45F, -0.55F, -0.3F); // Import
        defaultStockModel[31].setRotationPoint(-6.3F, -3.4F, -0.5F);

        defaultStockModel[32].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.55F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.55F, -0.3F, -0.3F, -0.6F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.6F, -0.6F, -0.3F); // Import
        defaultStockModel[32].setRotationPoint(-6.6F, -3.4F, -0.5F);

        defaultStockModel[33].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.55F, -0.3F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.55F, -0.3F, -0.3F, -0.45F, -0.6F, -0.3F, -0.45F, -0.55F, -0.3F, -0.45F, -0.55F, -0.3F, -0.45F, -0.6F, -0.3F); // Import
        defaultStockModel[33].setRotationPoint(-6.6F, -3.4F, -0.5F);

        defaultStockModel[34].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.4F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.4F, -0.3F); // Import
        defaultStockModel[34].setRotationPoint(-6.6F, -3.4F, -0.5F);

        defaultStockModel[35].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.6F, -0.3F, -0.45F, -0.55F, -0.3F, -0.45F, -0.55F, -0.3F, -0.45F, -0.6F, -0.3F, -0.55F, -0.3F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.55F, -0.3F, -0.3F); // Import
        defaultStockModel[35].setRotationPoint(-6.6F, -3.4F, -0.5F);

        defaultStockModel[36].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.6F, -0.6F, -0.3F, -0.55F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.55F, -0.3F, -0.3F); // Import
        defaultStockModel[36].setRotationPoint(-6.6F, -3.4F, -0.5F);

        defaultStockModel[37].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.55F, -0.3F, -0.45F, -0.6F, -0.3F, -0.45F, -0.6F, -0.3F, -0.45F, -0.55F, -0.3F, -0.4F, -0.4F, -0.3F, -0.55F, -0.3F, -0.3F, -0.55F, -0.3F, -0.3F, -0.4F, -0.4F, -0.3F); // Import
        defaultStockModel[37].setRotationPoint(-6.3F, -3.4F, -0.5F);

        defaultStockModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, 0.25F, -0.3F, -0.4F, 0.25F, -0.3F, -0.4F, 0.25F, -0.3F, -0.4F, 0.25F, -0.3F, 0.0F, 0.15F, -0.3F, 0.0F, 0.15F, -0.3F, 0.0F, 0.15F, -0.3F, 0.0F, 0.15F); // Import
        defaultStockModel[38].setRotationPoint(-6.5F, -3.25F, -0.5F);

        defaultStockModel[39].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.35F, -0.3F, 0.25F, -0.9F, -0.3F, 0.25F, -0.9F, -0.3F, -0.6F, -0.35F, -0.3F, -0.45F, -0.6F, -0.3F, 0.15F, 0.0F, -0.3F, 0.15F, 0.0F, -0.3F, -0.45F, -0.6F, -0.3F); // Import
        defaultStockModel[39].setRotationPoint(-7.3F, -4F, -0.5F);

        defaultStockModel[40].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, 0.15F, 0.0F, -0.3F, -0.85F, -0.25F, -0.3F, -0.85F, -0.25F, -0.3F, 0.15F, 0.0F, -0.3F, 0.25F, -0.9F, -0.3F, -1.0F, -0.7F, -0.3F, -1.0F, -0.7F, -0.3F, 0.25F, -0.9F, -0.3F); // Import
        defaultStockModel[40].setRotationPoint(-5.6F, -2.8F, -0.5F);

        defaultStockModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.15F, -0.7F, -0.45F, 0.15F, -0.7F, -0.45F, 0.15F, 0.0F, -0.5F, 0.15F, 0.0F, -0.5F, -1.1F, -0.7F, -0.45F, -1.05F, -0.7F, -0.45F, -1.05F, 0.0F, -0.5F, -1.1F, 0.0F); // Import
        defaultStockModel[41].setRotationPoint(-6.05F, -3.2F, -0.85F);

        defaultStockModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.15F, -0.7F, -0.45F, 0.15F, -0.7F, -0.45F, 0.15F, 0.0F, -0.5F, 0.15F, 0.0F, -0.5F, -1.1F, -0.7F, -0.45F, -1.1F, -0.7F, -0.45F, -1.1F, 0.0F, -0.5F, -1.1F, 0.0F); // Import
        defaultStockModel[42].setRotationPoint(-6.1F, -3.2F, -0.85F);

        defaultStockModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, 0.15F, -0.7F, -0.5F, 0.15F, -0.7F, -0.5F, 0.15F, 0.0F, -0.45F, 0.15F, 0.0F, -0.45F, -1.05F, -0.7F, -0.5F, -1.1F, -0.7F, -0.5F, -1.1F, 0.0F, -0.45F, -1.05F, 0.0F); // Import
        defaultStockModel[43].setRotationPoint(-6.1F, -3.2F, -0.85F);

        defaultStockModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -1.05F, -0.7F, -0.5F, -1.1F, -0.7F, -0.5F, -1.1F, 0.0F, -0.45F, -1.05F, 0.0F, -0.45F, 0.525F, -0.7F, -0.5F, 0.5F, -0.7F, -0.5F, 0.5F, 0.0F, -0.45F, 0.525F, 0.0F); // Import
        defaultStockModel[44].setRotationPoint(-6.1F, -3.6F, -0.85F);

        defaultStockModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -1.1F, -0.7F, -0.45F, -1.1F, -0.7F, -0.45F, -1.1F, 0.0F, -0.5F, -1.1F, 0.0F, -0.5F, 0.5F, -0.7F, -0.45F, 0.475F, -0.7F, -0.45F, 0.475F, 0.0F, -0.5F, 0.5F, 0.0F); // Import
        defaultStockModel[45].setRotationPoint(-6.1F, -3.6F, -0.85F);

        defaultStockModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -1.1F, -0.7F, -0.45F, -1.05F, -0.7F, -0.45F, -1.05F, 0.0F, -0.5F, -1.1F, 0.0F, -0.5F, 0.475F, -0.7F, -0.45F, 0.45F, -0.7F, -0.45F, 0.45F, 0.0F, -0.5F, 0.475F, 0.0F); // Import
        defaultStockModel[46].setRotationPoint(-6.05F, -3.6F, -0.85F);

        defaultStockModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.2F, -0.7F, -0.4F, -0.2F, -0.7F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, 0.55F, -0.7F, -0.4F, 0.475F, -0.7F, -0.4F, 0.475F, 0.0F, -0.4F, 0.55F, 0.0F); // Import
        defaultStockModel[47].setRotationPoint(-6.25F, -3.55F, -0.85F);

        defaultStockModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.7F, -1.25F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, 0.7F, -1.25F, -0.3F, 0.7F, 0.4F, -0.3F, -0.1F, -0.8F, -0.3F, -0.1F, -0.8F, -0.3F, 0.7F, 0.4F, -0.3F); // Import
        defaultStockModel[48].setRotationPoint(-5.1F, -3.4F, -0.5F);

        defaultStockModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, 0.0F, -0.45F, -0.35F, 0.0F, -0.45F, -0.35F, 0.0F, -0.45F, -0.35F, 0.0F, -0.45F, -0.35F, 0.0F, -0.45F, -0.35F, 0.0F, -0.45F, -0.35F, 0.0F, -0.45F, -0.35F, 0.0F); // Import
        defaultStockModel[49].setRotationPoint(-6.3F, -3.3F, -0.5F);

        defaultStockModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.55F, -0.35F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.55F, -0.35F, 0.0F, -0.55F, -0.35F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.55F, -0.35F, 0.0F); // Import
        defaultStockModel[50].setRotationPoint(-6.3F, -3.3F, -0.5F);

        defaultStockModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.0F, -0.2F, -0.7F, -2.6F, -0.2F, -0.7F, -2.6F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.3F, -0.7F, -2.6F, 0.2F, -0.7F, -2.6F, 0.2F, 0.0F, 0.0F, 0.3F, 0.0F); // Import
        defaultStockModel[51].setRotationPoint(-5.5F, -3.55F, -0.85F);

        defaultStockModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.1F, -0.2F, -0.7F, -2.6F, -0.2F, -0.7F, -2.6F, -0.2F, 0.0F, -0.1F, -0.2F, 0.0F, -0.1F, -0.5F, -0.7F, -2.6F, -0.5F, -0.7F, -2.6F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F); // Import
        defaultStockModel[52].setRotationPoint(-5.2F, -3.55F, -0.85F);

        defaultStockModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.1F, -0.1F, -0.7F, -2.6F, -0.1F, -0.7F, -2.6F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.4F, -0.7F, -2.6F, -0.5F, -0.7F, -2.6F, -0.5F, 0.0F, -0.1F, -0.4F, 0.0F); // Import
        defaultStockModel[53].setRotationPoint(-5.2F, -2.9F, -0.85F);

        defaultStockModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F); // Import
        defaultStockModel[54].setRotationPoint(-1.75F, -4.3F, -0.5F);

        defaultStockModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.35F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.5F, -0.35F, -0.2F); // Import
        defaultStockModel[55].setRotationPoint(-1.7F, -4.3F, -0.5F);

        defaultStockModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.4F, 0.0F, 0.1F, -0.4F, -0.4F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F); // Import
        defaultStockModel[56].setRotationPoint(-6.2F, -4.75F, -0.5F);

        defaultStockModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.4F, -0.1F, 0.2F, -0.4F, -0.7F, -0.05F, -0.3F, -0.7F, -0.05F, -0.3F, -0.7F, -0.05F, -0.4F, -0.7F, -0.05F); // Import
        defaultStockModel[57].setRotationPoint(-6.2F, -3.9F, -0.5F);

        defaultStockModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.7F, 0.2F, -0.3F, -0.7F, 0.2F, -0.3F, -0.7F, 0.2F, -0.4F, -0.7F, 0.2F, -0.4F, 0.05F, 0.2F, -0.3F, 0.05F, 0.2F, -0.3F, 0.05F, 0.2F, -0.4F, 0.05F, 0.2F); // Import
        defaultStockModel[58].setRotationPoint(-6.2F, -4.85F, -0.5F);
    }

    private void initammoModel_1() {
        ammoModel[0] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import
        ammoModel[1] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Import
        ammoModel[2] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Import
        ammoModel[3] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Import
        ammoModel[4] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Import
        ammoModel[5] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Import
        ammoModel[6] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Import
        ammoModel[7] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Import
        ammoModel[8] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Import
        ammoModel[9] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Import
        ammoModel[10] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Import
        ammoModel[11] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Import
        ammoModel[12] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Import
        ammoModel[13] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import
        ammoModel[14] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Import
        ammoModel[15] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import
        ammoModel[16] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Import
        ammoModel[17] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Import
        ammoModel[18] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Import
        ammoModel[19] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Import
        ammoModel[20] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Import
        ammoModel[21] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Import
        ammoModel[22] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Import
        ammoModel[23] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Import
        ammoModel[24] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Import
        ammoModel[25] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Import
        ammoModel[26] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Import
        ammoModel[27] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Import
        ammoModel[28] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Import
        ammoModel[29] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Import
        ammoModel[30] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Import
        ammoModel[31] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Import
        ammoModel[32] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Import
        ammoModel[33] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Import
        ammoModel[34] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Import
        ammoModel[35] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Import
        ammoModel[36] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Import
        ammoModel[37] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Import
        ammoModel[38] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Import
        ammoModel[39] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Import
        ammoModel[40] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Import
        ammoModel[41] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Import
        ammoModel[42] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Import
        ammoModel[43] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Import
        ammoModel[44] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Import
        ammoModel[45] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Import
        ammoModel[46] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Import

        ammoModel[0].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, -0.1F, -0.95F, 0.0F, -0.35F, -0.8F, 0.0F, -0.35F, -0.8F, 0.0F, -0.1F, -0.95F, 0.0F, -0.2F, -0.5F, 0.0F, -0.25F, -0.7F, 0.0F, -0.25F, -0.7F, 0.0F, -0.2F, -0.5F, 0.0F); // Import
        ammoModel[0].setRotationPoint(3F, -4.05F, -0.5F);

        ammoModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.2F, -0.5F, 0.0F, -0.3F, -0.2F, 0.0F, -0.3F, -0.2F, 0.0F, -0.2F, -0.5F, 0.0F, -0.65F, 0.1F, 0.0F, 0.1F, -0.4F, 0.0F, 0.1F, -0.4F, 0.0F, -0.65F, 0.1F, 0.0F); // Import
        ammoModel[1].setRotationPoint(3.2F, -1.05F, -0.5F);

        ammoModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.1F, -0.5F, 0.0F, -0.35F, -0.3F, 0.0F, -0.35F, -0.3F, 0.0F, -0.1F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.2F, -0.8F, 0.0F, -0.2F, -0.8F, 0.0F, -0.3F, -0.5F, 0.0F); // Import
        ammoModel[2].setRotationPoint(3.1F, -2.05F, -0.5F);

        ammoModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.6F, -0.8F, 0.05F, -0.1F, -0.4F, 0.05F, -0.1F, -0.4F, 0.05F, -0.6F, -0.8F, 0.05F, -0.55F, -0.05F, 0.05F, 0.0F, -0.5F, 0.05F, 0.0F, -0.5F, 0.05F, -0.55F, -0.05F, 0.05F); // Import
        ammoModel[3].setRotationPoint(3.35F, -0.05F, -0.5F);

        ammoModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.55F, -0.85F, 0.05F, 0.0F, -0.4F, 0.05F, 0.0F, -0.4F, 0.05F, -0.55F, -0.85F, 0.05F, -0.6F, 0.0F, 0.05F, 0.05F, -0.45F, 0.05F, 0.05F, -0.45F, 0.05F, -0.6F, 0.0F, 0.05F); // Import
        ammoModel[4].setRotationPoint(3.35F, 0.05F, -0.5F);

        ammoModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.4F, -0.925F, 0.05F, -0.4F, -0.91F, 0.05F, -0.4F, -0.91F, 0.05F, -0.4F, -0.925F, 0.05F, -0.5F, -0.95F, 0.05F, -0.3F, -0.95F, 0.05F, -0.3F, -0.95F, 0.05F, -0.5F, -0.95F, 0.05F); // Import
        ammoModel[5].setRotationPoint(3F, -4.05F, -0.5F);

        ammoModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.0F, -1.0F, 0.0F, -0.75F, -1.0F, -0.15F, -0.75F, -1.0F, -0.15F, 0.0F, -1.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.65F, -0.55F, -0.15F, -0.65F, -0.55F, -0.15F, -0.1F, -0.5F, 0.0F); // Import
        ammoModel[6].setRotationPoint(4.65F, -4.25F, -0.5F);

        ammoModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.45F, -0.15F, -0.75F, -0.45F, -0.15F, 0.0F, -0.5F, 0.0F, -0.15F, -0.6F, 0.0F, -0.6F, -0.65F, -0.15F, -0.6F, -0.65F, -0.15F, -0.15F, -0.6F, 0.0F); // Import
        ammoModel[7].setRotationPoint(4.75F, -2.25F, -0.5F);

        ammoModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.1F, -0.5F, 0.0F, -0.65F, -0.45F, -0.15F, -0.65F, -0.45F, -0.15F, -0.1F, -0.5F, 0.0F, -0.5F, -0.1F, 0.0F, -0.3F, -0.25F, -0.15F, -0.3F, -0.25F, -0.15F, -0.5F, -0.1F, 0.0F); // Import
        ammoModel[8].setRotationPoint(4.8F, -1.35F, -0.5F);

        ammoModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.55F, -0.8F, 0.05F, -0.2F, -0.75F, -0.1F, -0.2F, -0.75F, -0.1F, -0.55F, -0.8F, 0.05F, -0.6F, -0.05F, 0.05F, -0.15F, -0.15F, -0.1F, -0.15F, -0.15F, -0.1F, -0.6F, -0.05F, 0.05F); // Import
        ammoModel[9].setRotationPoint(4.8F, -0.35F, -0.5F);

        ammoModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.55F, -0.5F, -0.05F, -0.35F, -0.5F, -0.1F, -0.35F, -0.5F, -0.1F, -0.55F, -0.5F, -0.05F, -0.6F, -0.05F, 0.05F, -0.15F, -0.1F, -0.1F, -0.15F, -0.1F, -0.1F, -0.6F, -0.05F, 0.05F); // Import
        ammoModel[10].setRotationPoint(4.75F, -0.5F, -0.5F);

        ammoModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.1F, -1.0F, -0.15F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.1F, -1.0F, -0.15F, -0.2F, -0.4F, -0.15F, -0.65F, -0.45F, 0.0F, -0.65F, -0.45F, 0.0F, -0.2F, -0.4F, -0.15F); // Import
        ammoModel[11].setRotationPoint(2.85F, -4.1F, -0.5F);

        ammoModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.1F, -0.5F, -0.15F, -0.75F, -0.45F, 0.0F, -0.75F, -0.45F, 0.0F, -0.1F, -0.5F, -0.15F, -0.3F, -0.5F, -0.15F, -0.55F, -0.55F, 0.0F, -0.55F, -0.55F, 0.0F, -0.3F, -0.5F, -0.15F); // Import
        ammoModel[12].setRotationPoint(2.95F, -2F, -0.5F);

        ammoModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, -0.5F, -0.15F, -0.65F, -0.45F, 0.0F, -0.65F, -0.45F, 0.0F, -0.2F, -0.5F, -0.15F, -0.65F, 0.05F, -0.15F, -0.2F, 0.05F, 0.0F, -0.2F, 0.05F, 0.0F, -0.65F, 0.05F, -0.15F); // Import
        ammoModel[13].setRotationPoint(3.05F, -1F, -0.5F);

        ammoModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0.05F, 0.5F, -0.35F, 0.05F, 0.5F, -0.35F, 0.05F, -0.3F, -0.5F, 0.05F, -0.3F, -0.4F, 0.05F, 0.5F, -0.55F, 0.05F, 0.5F, -0.55F, 0.05F, -0.3F, -0.4F, 0.05F); // Import
        ammoModel[14].setRotationPoint(3.1F, -2.35F, -0.5F);

        ammoModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.3F, -0.4F, 0.05F, -0.3F, -0.45F, 0.05F, -0.3F, -0.45F, 0.05F, -0.3F, -0.4F, 0.05F); // Import
        ammoModel[15].setRotationPoint(3.1F, -2.45F, -0.5F);

        ammoModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, 0.05F, -0.3F, -0.4F, 0.05F, -0.3F, -0.4F, 0.05F, -0.3F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F); // Import
        ammoModel[16].setRotationPoint(3.1F, -2.2F, -0.5F);

        ammoModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.3F, -0.4F, 0.05F, -0.3F, -0.45F, 0.05F, -0.3F, -0.45F, 0.05F, -0.3F, -0.4F, 0.05F); // Import
        ammoModel[17].setRotationPoint(3.9F, -2.55F, -0.5F);

        ammoModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, 0.05F, -0.3F, -0.4F, 0.05F, -0.3F, -0.4F, 0.05F, -0.3F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F); // Import
        ammoModel[18].setRotationPoint(3.9F, -2.3F, -0.5F);

        ammoModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.3F, -0.4F, 0.05F, -0.3F, -0.45F, 0.05F, -0.3F, -0.45F, 0.05F, -0.3F, -0.4F, 0.05F); // Import
        ammoModel[19].setRotationPoint(3.15F, -1.65F, -0.5F);

        ammoModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0.05F, 0.5F, -0.35F, 0.05F, 0.5F, -0.35F, 0.05F, -0.3F, -0.5F, 0.05F, -0.3F, -0.4F, 0.05F, 0.5F, -0.55F, 0.05F, 0.5F, -0.55F, 0.05F, -0.3F, -0.4F, 0.05F); // Import
        ammoModel[20].setRotationPoint(3.15F, -1.55F, -0.5F);

        ammoModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, 0.05F, -0.3F, -0.4F, 0.05F, -0.3F, -0.4F, 0.05F, -0.3F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.35F, -0.5F, 0.05F, -0.35F, -0.5F, 0.05F, -0.45F, -0.45F, 0.05F); // Import
        ammoModel[21].setRotationPoint(3.15F, -1.4F, -0.5F);

        ammoModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, 0.05F, -0.3F, -0.4F, 0.05F, -0.3F, -0.4F, 0.05F, -0.3F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.35F, -0.5F, 0.05F, -0.35F, -0.5F, 0.05F, -0.45F, -0.45F, 0.05F); // Import
        ammoModel[22].setRotationPoint(3.95F, -1.5F, -0.5F);

        ammoModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.3F, -0.4F, 0.05F, -0.3F, -0.45F, 0.05F, -0.3F, -0.45F, 0.05F, -0.3F, -0.4F, 0.05F); // Import
        ammoModel[23].setRotationPoint(3.95F, -1.75F, -0.5F);

        ammoModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.5F, 0.05F, -0.45F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.35F, -0.5F, 0.05F, -0.3F, -0.4F, 0.05F, -0.35F, -0.475F, 0.05F, -0.35F, -0.475F, 0.05F, -0.3F, -0.4F, 0.05F); // Import
        ammoModel[24].setRotationPoint(3.45F, -0.85F, -0.5F);

        ammoModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0.05F, 0.55F, -0.2F, 0.05F, 0.55F, -0.2F, 0.05F, -0.3F, -0.5F, 0.05F, -0.35F, -0.35F, 0.05F, 0.6F, -0.65F, 0.05F, 0.6F, -0.65F, 0.05F, -0.35F, -0.35F, 0.05F); // Import
        ammoModel[25].setRotationPoint(3.45F, -0.75F, -0.5F);

        ammoModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.4F, -0.95F, 0.05F, -0.4F, -0.93F, 0.05F, -0.4F, -0.93F, 0.05F, -0.4F, -0.95F, 0.05F, -0.5F, -0.95F, 0.05F, -0.3F, -0.95F, 0.05F, -0.3F, -0.95F, 0.05F, -0.5F, -0.95F, 0.05F); // Import
        ammoModel[26].setRotationPoint(3.8F, -4.15F, -0.5F);

        ammoModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.45F, -1.25F, 0.05F, -0.35F, -1.25F, 0.05F, -0.35F, -1.25F, 0.05F, -0.45F, -1.25F, 0.05F, -0.5F, -1.3F, 0.05F, -0.3F, -1.3F, 0.05F, -0.3F, -1.3F, 0.05F, -0.5F, -1.3F, 0.05F); // Import
        ammoModel[27].setRotationPoint(3.05F, -2.9F, -0.5F);

        ammoModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.45F, -1.25F, 0.05F, -0.35F, -1.25F, 0.05F, -0.35F, -1.25F, 0.05F, -0.45F, -1.25F, 0.05F, -0.5F, -1.3F, 0.05F, -0.3F, -1.3F, 0.05F, -0.3F, -1.3F, 0.05F, -0.5F, -1.3F, 0.05F); // Import
        ammoModel[28].setRotationPoint(3.85F, -3F, -0.5F);

        ammoModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.5F, 0.05F, -0.45F, -0.45F, 0.05F, -0.45F, -0.45F, 0.05F, -0.35F, -0.5F, 0.05F, -0.3F, -0.35F, 0.05F, -0.35F, -0.45F, 0.05F, -0.35F, -0.45F, 0.05F, -0.3F, -0.35F, 0.05F); // Import
        ammoModel[29].setRotationPoint(4.2F, -1.05F, -0.5F);

        ammoModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.525F, 0.05F, -0.3F, -0.425F, 0.05F, -0.3F, -0.425F, 0.05F, -0.35F, -0.525F, 0.05F, -0.45F, -0.4F, 0.05F, -0.35F, -0.45F, 0.05F, -0.35F, -0.45F, 0.05F, -0.45F, -0.4F, 0.05F); // Import
        ammoModel[30].setRotationPoint(4.2F, -0.8F, -0.5F);

        ammoModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, 0.05F, -0.35F, -0.25F, 0.05F, -0.35F, -0.25F, 0.05F, -0.45F, -0.3F, 0.05F, -0.65F, -0.2F, 0.05F, -0.15F, -0.25F, 0.05F, -0.15F, -0.25F, 0.05F, -0.65F, -0.2F, 0.05F); // Import
        ammoModel[31].setRotationPoint(3.15F, -1.15F, -0.5F);

        ammoModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, 0.05F, -0.35F, -0.25F, 0.05F, -0.35F, -0.25F, 0.05F, -0.45F, -0.3F, 0.05F, -0.6F, -0.3F, 0.05F, -0.2F, -0.35F, 0.05F, -0.2F, -0.35F, 0.05F, -0.6F, -0.3F, 0.05F); // Import
        ammoModel[32].setRotationPoint(3.95F, -1.25F, -0.5F);

        ammoModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, 0.05F, -0.45F, -0.325F, 0.05F, -0.45F, -0.325F, 0.05F, -0.45F, -0.35F, 0.05F, -0.45F, -0.55F, 0.05F, -0.4F, -0.575F, 0.05F, -0.4F, -0.575F, 0.05F, -0.45F, -0.55F, 0.05F); // Import
        ammoModel[33].setRotationPoint(4.15F, -2.35F, -0.5F);

        ammoModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.325F, 0.05F, -0.36F, -0.25F, -0.1F, -0.36F, -0.25F, -0.1F, -0.35F, -0.325F, 0.05F, -0.4F, -0.575F, 0.05F, -0.35F, -0.65F, -0.1F, -0.35F, -0.65F, -0.1F, -0.4F, -0.575F, 0.05F); // Import
        ammoModel[34].setRotationPoint(4.35F, -2.35F, -0.5F);

        ammoModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.325F, 0.05F, -0.35F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, -0.325F, 0.05F, -0.4F, -0.575F, 0.05F, -0.325F, -0.65F, -0.1F, -0.325F, -0.65F, -0.1F, -0.4F, -0.575F, 0.05F); // Import
        ammoModel[35].setRotationPoint(4.45F, -1.55F, -0.5F);

        ammoModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, 0.05F, -0.45F, -0.325F, 0.05F, -0.45F, -0.325F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.55F, 0.05F, -0.4F, -0.575F, 0.05F, -0.4F, -0.575F, 0.05F, -0.4F, -0.55F, 0.05F); // Import
        ammoModel[36].setRotationPoint(4.25F, -1.55F, -0.5F);

        ammoModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.3F, 0.05F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.35F, -0.3F, 0.05F, -0.4F, -0.55F, 0.05F, -0.35F, -0.6F, -0.1F, -0.35F, -0.6F, -0.1F, -0.4F, -0.55F, 0.05F); // Import
        ammoModel[37].setRotationPoint(4.65F, -0.85F, -0.5F);

        ammoModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, 0.05F, -0.35F, -0.25F, 0.05F, -0.35F, -0.25F, 0.05F, -0.45F, -0.3F, 0.05F, -0.6F, -0.3F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.6F, -0.3F, 0.05F); // Import
        ammoModel[38].setRotationPoint(4.2F, -0.5F, -0.5F);

        ammoModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.7F, 0.05F, -0.2F, -0.6F, 0.05F, -0.2F, -0.6F, 0.05F, -0.6F, -0.7F, 0.05F, -0.675F, -0.25F, 0.05F, -0.225F, -0.3F, 0.05F, -0.225F, -0.3F, 0.05F, -0.675F, -0.25F, 0.05F); // Import
        ammoModel[39].setRotationPoint(4.2F, -0.5F, -0.5F);

        ammoModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, 0.05F, -0.45F, -0.35F, 0.05F, -0.45F, -0.35F, 0.05F, -0.3F, -0.4F, 0.05F, -0.35F, -0.5F, 0.05F, -0.45F, -0.55F, 0.05F, -0.45F, -0.55F, 0.05F, -0.35F, -0.5F, 0.05F); // Import
        ammoModel[40].setRotationPoint(2.85F, -2.2F, -0.5F);

        ammoModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.45F, -0.1F, -0.5F, -0.4F, 0.05F, -0.5F, -0.4F, 0.05F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.35F, -0.45F, -0.1F); // Import
        ammoModel[41].setRotationPoint(2.65F, -2.2F, -0.5F);

        ammoModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.45F, -0.1F, -0.45F, -0.4F, 0.05F, -0.45F, -0.4F, 0.05F, -0.375F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.4F, -0.45F, -0.1F); // Import
        ammoModel[42].setRotationPoint(2.75F, -1.4F, -0.5F);

        ammoModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, 0.05F, -0.45F, -0.35F, 0.05F, -0.45F, -0.35F, 0.05F, -0.4F, -0.4F, 0.05F, -0.4F, -0.5F, 0.05F, -0.45F, -0.55F, 0.05F, -0.45F, -0.55F, 0.05F, -0.4F, -0.5F, 0.05F); // Import
        ammoModel[43].setRotationPoint(2.9F, -1.4F, -0.5F);

        ammoModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, 0.05F, -0.35F, -0.3F, 0.05F, -0.35F, -0.3F, 0.05F, -0.4F, -0.35F, 0.05F, -0.45F, -0.5F, 0.05F, -0.3F, -0.55F, 0.05F, -0.3F, -0.55F, 0.05F, -0.45F, -0.5F, 0.05F); // Import
        ammoModel[44].setRotationPoint(3.1F, -0.55F, -0.5F);

        ammoModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.45F, -0.1F, -0.45F, -0.4F, 0.05F, -0.45F, -0.4F, 0.05F, -0.375F, -0.45F, -0.1F, -0.425F, -0.4F, -0.1F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.425F, -0.4F, -0.1F); // Import
        ammoModel[45].setRotationPoint(2.95F, -0.6F, -0.5F);

        ammoModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1.9F, -0.4F, 0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -1.9F, -0.4F, 0.05F, -1.9F, -0.6F, 0.05F, 0.0F, -0.5F, 0.05F, 0.0F, -0.5F, 0.05F, -1.9F, -0.6F, 0.05F); // Import
        ammoModel[46].setRotationPoint(3.35F, -0.05F, -0.5F);
    }

    private void initslideModel_1() {
        slideModel[0] = new ModelRendererTurbo(this, 33, 193, textureX, textureY); // Import
        slideModel[1] = new ModelRendererTurbo(this, 41, 193, textureX, textureY); // Import
        slideModel[2] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Import

        slideModel[0].addShapeBox(0F, -0.5F, -0.5F, 2, 1, 1, 0F, 0.2F, -0.25F, -0.45F, 0.2F, -0.25F, -0.45F, 0.2F, -0.15F, -0.45F, 0.2F, -0.15F, -0.45F, 0.2F, -0.3F, -0.45F, 0.2F, -0.3F, -0.45F, 0.2F, -0.2F, -0.45F, 0.2F, -0.2F, -0.45F); // Import
        slideModel[0].setRotationPoint(2.8F, -4.6F, -0.45F);
        slideModel[0].rotateAngleX = -0.2617994F;

        slideModel[1].addShapeBox(0F, -0.5F, -0.6F, 1, 1, 1, 0F, 0.2F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, 0.0F, -0.25F, -0.45F, 0.2F, -0.25F, -0.45F, 0.2F, -0.45F, -0.45F, -0.15F, -0.45F, -0.45F, 0.0F, -0.3F, -0.45F, 0.2F, -0.3F, -0.45F); // Import
        slideModel[1].setRotationPoint(2.8F, -4.6F, -0.45F);
        slideModel[1].rotateAngleX = -0.2617994F;

        slideModel[2].addShapeBox(0F, -0.5F, -0.6F, 1, 1, 1, 0F, -0.35F, -0.4F, -0.45F, 0.0F, -0.4F, -0.45F, 0.0F, -0.25F, -0.45F, -0.2F, -0.25F, -0.45F, -0.35F, -0.45F, -0.45F, 0.0F, -0.45F, -0.45F, 0.0F, -0.3F, -0.45F, -0.2F, -0.3F, -0.45F); // Import
        slideModel[2].setRotationPoint(4F, -4.6F, -0.45F);
        slideModel[2].rotateAngleX = -0.2617994F;
    }
}