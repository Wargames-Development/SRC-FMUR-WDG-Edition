//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: M249
// Model Creator: 
// Created on: 04.08.2022 - 14:54:23
// Last changed on: 04.08.2022 - 14:54:23

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelM249 extends ModelGun //Same as Filename
{
    int textureX = 256;
    int textureY = 256;

    public ModelM249() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[359];
        defaultBarrelModel = new ModelRendererTurbo[13];
        defaultScopeModel = new ModelRendererTurbo[29];
        defaultStockModel = new ModelRendererTurbo[47];
        defaultGripModel = new ModelRendererTurbo[27];
        ammoModel = new ModelRendererTurbo[201];

        initgunModel_1();
        initdefaultBarrelModel_1();
        initdefaultScopeModel_1();
        initdefaultStockModel_1();
        initdefaultGripModel_1();
        initammoModel_1();

        barrelAttachPoint = new Vector3f(67.2F / 64F, 18.75F / 64F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(37F / 64F, 18.6F / 64F, -4.8F / 64F);
        scopeAttachPoint = new Vector3f(3F / 64F, 24F / 64F, 0F / 16F);
        stockAttachPoint = new Vector3f(-17.2F / 64F, 15.6F / 64F, 0F / 16F);
        hasFlash = true;
        hasArms = true;
        animationType = EnumAnimationType.CUSTOM;
        gunSlideDistance = 0.05F;
        tiltGun = 30.0F;

        translateGun = new Vector3f(0.0F, -0.0625F, -0.1875F);
        translateClip = new Vector3f(0.0F, -0.625F, 0.0F);
        leftArmPos = new Vector3f(0.05F, -0.4F, -0.1F);
        leftArmRot = new Vector3f(80.0F, 50.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.1F, -0.55F, 0.05F);
        leftArmReloadRot = new Vector3f(80.0F, 54.0F, 0.0F);
        rightArmPos = new Vector3f(0.21F, -0.37F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -87.0F);
        rightArmReloadPos = new Vector3f(0.21F, -0.37F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -87.0F);
        rightArmScale = new Vector3f(0.75D, 0.75D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.1D, 0.75D);

        rightHandAmmo = false;
        leftHandAmmo = true;

        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);

        casingAttachPoint = new Vector3f(1.5F, 1.2F, 0.0F);
        casingAnimDistance = new Vector3f(0.0F, 3.0F, 7.75F);
        casingAnimSpread = new Vector3f(2.0F, 2.5F, 2.0F);
        casingAnimTime = 2;
        casingRotateVector = new Vector3f(0.1F, 0.0F, 0.1F);
        caseScale = 0.2F;
        casingDelay = 0;

        flashScale = 0.4F;
        muzzleFlashPoint = new Vector3f(2.7F, 0.7F, 0.0F);

        thirdPersonOffset = new Vector3f(-0.1F, -0.05F, 0.0F);
        translateAll(0F, 0F, 0F);
        gunOffset = -0.55F;
        crouchZoom = -0.05F;
        zoomOffset = 0.2F;
        ShakeDistance = 0.3F;

        //修正模型位移
        Vector3f vec3 = new Vector3f(1F, 1.5F, 0F);
        translateAll(vec3.x, -vec3.y, vec3.z);
        Vector3f attVec = new Vector3f(vec3.x / 16F, vec3.y / 16F, vec3.z / 16F);
        barrelAttachPoint = Vector3f.add(barrelAttachPoint, attVec, null);
        gadgetAttachPoint = Vector3f.add(gadgetAttachPoint, attVec, null);
        scopeAttachPoint = Vector3f.add(scopeAttachPoint, attVec, null);
        gripAttachPoint = Vector3f.add(gripAttachPoint, attVec, null);
        stockAttachPoint = Vector3f.add(stockAttachPoint, attVec, null);
        zoomOffsetY = -0.095F;

        flipAll();
    }

    private void initgunModel_1() {
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
        gunModel[12] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import
        gunModel[13] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import
        gunModel[14] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import
        gunModel[15] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import
        gunModel[16] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import
        gunModel[17] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import
        gunModel[18] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import
        gunModel[19] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import
        gunModel[20] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import
        gunModel[21] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import
        gunModel[22] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import
        gunModel[23] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import
        gunModel[24] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import
        gunModel[25] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import
        gunModel[26] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import
        gunModel[27] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import
        gunModel[28] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import
        gunModel[29] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import
        gunModel[30] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import
        gunModel[31] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import
        gunModel[32] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Import
        gunModel[33] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import
        gunModel[34] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import
        gunModel[35] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import
        gunModel[36] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import
        gunModel[37] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Import
        gunModel[38] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import
        gunModel[39] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Import
        gunModel[40] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Import
        gunModel[41] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import
        gunModel[42] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Import
        gunModel[43] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import
        gunModel[44] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import
        gunModel[45] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import
        gunModel[46] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import
        gunModel[47] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Import
        gunModel[48] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import
        gunModel[49] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Import
        gunModel[50] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Import
        gunModel[51] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import
        gunModel[52] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Import
        gunModel[53] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import
        gunModel[54] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Import
        gunModel[55] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Import
        gunModel[56] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import
        gunModel[57] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Import
        gunModel[58] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Import
        gunModel[59] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Import
        gunModel[60] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Import
        gunModel[61] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Import
        gunModel[62] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Import
        gunModel[63] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Import
        gunModel[64] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Import
        gunModel[65] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Import
        gunModel[66] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Import
        gunModel[67] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Import
        gunModel[68] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Import
        gunModel[69] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import
        gunModel[70] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Import
        gunModel[71] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Import
        gunModel[72] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Import
        gunModel[73] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Import
        gunModel[74] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Import
        gunModel[75] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Import
        gunModel[76] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Import
        gunModel[77] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Import
        gunModel[78] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import
        gunModel[79] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Import
        gunModel[80] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Import
        gunModel[81] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Import
        gunModel[82] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Import
        gunModel[83] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Import
        gunModel[84] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import
        gunModel[85] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Import
        gunModel[86] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Import
        gunModel[87] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Import
        gunModel[88] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Import
        gunModel[89] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Import
        gunModel[90] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Import
        gunModel[91] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Import
        gunModel[92] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Import
        gunModel[93] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Import
        gunModel[94] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Import
        gunModel[95] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Import
        gunModel[96] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Import
        gunModel[97] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Import
        gunModel[98] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Import
        gunModel[99] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Import
        gunModel[100] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Import
        gunModel[101] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Import
        gunModel[102] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Import
        gunModel[103] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Import
        gunModel[104] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import
        gunModel[105] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Import
        gunModel[106] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Import
        gunModel[107] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Import
        gunModel[108] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Import
        gunModel[109] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Import
        gunModel[110] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Import
        gunModel[111] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Import
        gunModel[112] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Import
        gunModel[113] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Import
        gunModel[114] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Import
        gunModel[115] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Import
        gunModel[116] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Import
        gunModel[117] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Import
        gunModel[118] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Import
        gunModel[119] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Import
        gunModel[120] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Import
        gunModel[121] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Import
        gunModel[122] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Import
        gunModel[123] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Import
        gunModel[124] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Import
        gunModel[125] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Import
        gunModel[126] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Import
        gunModel[127] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Import
        gunModel[128] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Import
        gunModel[129] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import
        gunModel[130] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Import
        gunModel[131] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Import
        gunModel[132] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Import
        gunModel[133] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Import
        gunModel[134] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Import
        gunModel[135] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Import
        gunModel[136] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Import
        gunModel[137] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import
        gunModel[138] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Import
        gunModel[139] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Import
        gunModel[140] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Import
        gunModel[141] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Import
        gunModel[142] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Import
        gunModel[143] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Import
        gunModel[144] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Import
        gunModel[145] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Import
        gunModel[146] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Import
        gunModel[147] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Import
        gunModel[148] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Import
        gunModel[149] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Import
        gunModel[150] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import
        gunModel[151] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import
        gunModel[152] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Import
        gunModel[153] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Import
        gunModel[154] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Import
        gunModel[155] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Import
        gunModel[156] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Import
        gunModel[157] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Import
        gunModel[158] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Import
        gunModel[159] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Import
        gunModel[160] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Import
        gunModel[161] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Import
        gunModel[162] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Import
        gunModel[163] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Import
        gunModel[164] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Import
        gunModel[165] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Import
        gunModel[166] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import
        gunModel[167] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Import
        gunModel[168] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Import
        gunModel[169] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Import
        gunModel[170] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Import
        gunModel[171] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Import
        gunModel[172] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Import
        gunModel[173] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Import
        gunModel[174] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Import
        gunModel[175] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Import
        gunModel[176] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Import
        gunModel[177] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Import
        gunModel[178] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Import
        gunModel[179] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Import
        gunModel[180] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Import
        gunModel[181] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Import
        gunModel[182] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Import
        gunModel[183] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Import
        gunModel[184] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Import
        gunModel[185] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Import
        gunModel[186] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Import
        gunModel[187] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Import
        gunModel[188] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Import
        gunModel[189] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Import
        gunModel[190] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import
        gunModel[191] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Import
        gunModel[192] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Import
        gunModel[193] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Import
        gunModel[194] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Import
        gunModel[195] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Import
        gunModel[196] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Import
        gunModel[197] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Import
        gunModel[198] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Import
        gunModel[199] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Import
        gunModel[200] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Import
        gunModel[201] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Import
        gunModel[202] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Import
        gunModel[203] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Import
        gunModel[204] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Import
        gunModel[205] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Import
        gunModel[206] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Import
        gunModel[207] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Import
        gunModel[208] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Import
        gunModel[209] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Import
        gunModel[210] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Import
        gunModel[211] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Import
        gunModel[212] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Import
        gunModel[213] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Import
        gunModel[214] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Import
        gunModel[215] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Import
        gunModel[216] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Import
        gunModel[217] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Import
        gunModel[218] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Import
        gunModel[219] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Import
        gunModel[220] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import
        gunModel[221] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Import
        gunModel[222] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Import
        gunModel[223] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Import
        gunModel[224] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Import
        gunModel[225] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Import
        gunModel[226] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Import
        gunModel[227] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Import
        gunModel[228] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Import
        gunModel[229] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Import
        gunModel[230] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Import
        gunModel[231] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Import
        gunModel[232] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Import
        gunModel[233] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Import
        gunModel[234] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Import
        gunModel[235] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Import
        gunModel[236] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Import
        gunModel[237] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Import
        gunModel[238] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Import
        gunModel[239] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Import
        gunModel[240] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Import
        gunModel[241] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Import
        gunModel[242] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Import
        gunModel[243] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Import
        gunModel[244] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Import
        gunModel[245] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Import
        gunModel[246] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Import
        gunModel[247] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Import
        gunModel[248] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Import
        gunModel[249] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Import
        gunModel[250] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Import
        gunModel[251] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Import
        gunModel[252] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Import
        gunModel[253] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Import
        gunModel[254] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Import
        gunModel[255] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Import
        gunModel[256] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Import
        gunModel[257] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Import
        gunModel[258] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Import
        gunModel[259] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Import
        gunModel[260] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Import
        gunModel[261] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Import
        gunModel[262] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Import
        gunModel[263] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Import
        gunModel[264] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Import
        gunModel[265] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Import
        gunModel[266] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Import
        gunModel[267] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Import
        gunModel[268] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Import
        gunModel[269] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Import
        gunModel[270] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Import
        gunModel[271] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import
        gunModel[272] = new ModelRendererTurbo(this, 9, 121, textureX, textureY); // Import
        gunModel[273] = new ModelRendererTurbo(this, 57, 169, textureX, textureY); // Import
        gunModel[274] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Import
        gunModel[275] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Import
        gunModel[276] = new ModelRendererTurbo(this, 81, 169, textureX, textureY); // Import
        gunModel[277] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Import
        gunModel[278] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Import
        gunModel[279] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Import
        gunModel[280] = new ModelRendererTurbo(this, 113, 169, textureX, textureY); // Import
        gunModel[281] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Import
        gunModel[282] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Import
        gunModel[283] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Import
        gunModel[284] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Import
        gunModel[285] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Import
        gunModel[286] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Import
        gunModel[287] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Import
        gunModel[288] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Import
        gunModel[289] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Import
        gunModel[290] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Import
        gunModel[291] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Import
        gunModel[292] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Import
        gunModel[293] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Import
        gunModel[294] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Import
        gunModel[295] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Import
        gunModel[296] = new ModelRendererTurbo(this, 9, 177, textureX, textureY); // Import
        gunModel[297] = new ModelRendererTurbo(this, 17, 177, textureX, textureY); // Import
        gunModel[298] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Import
        gunModel[299] = new ModelRendererTurbo(this, 33, 177, textureX, textureY); // Import
        gunModel[300] = new ModelRendererTurbo(this, 41, 177, textureX, textureY); // Import
        gunModel[301] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Import
        gunModel[302] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Import
        gunModel[303] = new ModelRendererTurbo(this, 65, 177, textureX, textureY); // Import
        gunModel[304] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Import
        gunModel[305] = new ModelRendererTurbo(this, 81, 177, textureX, textureY); // Import
        gunModel[306] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Import
        gunModel[307] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // Import
        gunModel[308] = new ModelRendererTurbo(this, 113, 177, textureX, textureY); // Import
        gunModel[309] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Import
        gunModel[310] = new ModelRendererTurbo(this, 137, 177, textureX, textureY); // Import
        gunModel[311] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Import
        gunModel[312] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Import
        gunModel[313] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Import
        gunModel[314] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Import
        gunModel[315] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Import
        gunModel[316] = new ModelRendererTurbo(this, 193, 177, textureX, textureY); // Import
        gunModel[317] = new ModelRendererTurbo(this, 201, 177, textureX, textureY); // Import
        gunModel[318] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Import
        gunModel[319] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Import
        gunModel[320] = new ModelRendererTurbo(this, 225, 177, textureX, textureY); // Import
        gunModel[321] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Import
        gunModel[322] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Import
        gunModel[323] = new ModelRendererTurbo(this, 249, 177, textureX, textureY); // Import
        gunModel[324] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Import
        gunModel[325] = new ModelRendererTurbo(this, 9, 185, textureX, textureY); // Import
        gunModel[326] = new ModelRendererTurbo(this, 17, 185, textureX, textureY); // Import
        gunModel[327] = new ModelRendererTurbo(this, 25, 185, textureX, textureY); // Import
        gunModel[328] = new ModelRendererTurbo(this, 33, 185, textureX, textureY); // Import
        gunModel[329] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Import
        gunModel[330] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Import
        gunModel[331] = new ModelRendererTurbo(this, 57, 185, textureX, textureY); // Import
        gunModel[332] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Import
        gunModel[333] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import
        gunModel[334] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import
        gunModel[335] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import
        gunModel[336] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import
        gunModel[337] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import
        gunModel[338] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import
        gunModel[339] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import
        gunModel[340] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import
        gunModel[341] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import
        gunModel[342] = new ModelRendererTurbo(this, 2, 203, textureX, textureY); // Import
        gunModel[343] = new ModelRendererTurbo(this, 22, 199, textureX, textureY); // Import
        gunModel[344] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Import
        gunModel[345] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Import
        gunModel[346] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Import
        gunModel[347] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Import
        gunModel[348] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Import
        gunModel[349] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Import
        gunModel[350] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import
        gunModel[351] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Import
        gunModel[352] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Import
        gunModel[353] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Import
        gunModel[354] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Import
        gunModel[355] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Import
        gunModel[356] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import
        gunModel[357] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Import
        gunModel[358] = new ModelRendererTurbo(this, 9, 212, textureX, textureY); // Import

        gunModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.6F, -0.2F, 0.0F, -0.6F, -0.2F, 0.0F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.5F, 0.0F, -0.2F); // Import
        gunModel[0].setRotationPoint(-1F, -3F, -0.5F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.8F, -0.7F, -0.8F, 0.0F, -0.7F, -0.8F, -0.2F, -0.7F, 0.0F, 0.6F, -0.7F, 0.0F, 0.5F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, -0.2F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F); // Import
        gunModel[1].setRotationPoint(-1F, -3.4F, -0.5F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.5F, 0.0F, -0.2F, 1.7F, 0.0F, -0.2F, -0.9F, 0.0F, -0.2F, -0.9F, 0.0F, -0.2F, 1.7F, 0.0F, -0.2F); // Import
        gunModel[2].setRotationPoint(-1F, -2F, -0.5F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.5F, -0.4F, -0.2F); // Import
        gunModel[3].setRotationPoint(-2.2F, -0.4F, -0.5F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.3F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0.5F, -0.3F, -0.2F, -1.2F, -0.1F, -0.2F, 0.4F, -0.3F, -0.2F, 0.4F, -0.3F, -0.2F, -1.2F, -0.1F, -0.2F); // Import
        gunModel[4].setRotationPoint(-2.2F, -0.1F, -0.5F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.3F, -0.8F, 0.3F, -0.5F, -0.8F, 0.1F, -0.5F, 0.0F, 0.3F, -0.3F, 0.0F, -1.2F, -0.1F, -0.8F, 0.4F, -0.3F, -0.8F, 0.2F, -0.3F, 0.0F, -1.1F, -0.2F, 0.0F); // Import
        gunModel[5].setRotationPoint(-2.2F, -0.1F, -0.5F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.8F, -0.7F, -0.2F, 0.0F, -0.7F, -0.2F, 0.0F, -0.7F, -0.2F, 0.8F, -0.7F, -0.2F, 0.5F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.5F, 0.0F, -0.2F); // Import
        gunModel[6].setRotationPoint(-1F, -3.4F, -0.5F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.6F, -0.8F, 0.0F, -0.6F, -0.8F, -0.2F, -0.6F, 0.0F, 0.3F, -0.6F, 0.0F, 0.5F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, -0.2F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F); // Import
        gunModel[7].setRotationPoint(-1F, -3F, -0.5F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, -0.2F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 1.7F, 0.0F, -0.8F, -0.9F, 0.0F, -0.8F, -1.1F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F); // Import
        gunModel[8].setRotationPoint(-1F, -2F, -0.5F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.4F, -0.8F, 0.3F, -0.4F, -0.8F, 0.1F, -0.4F, 0.0F, 0.3F, -0.4F, 0.0F, 0.5F, -0.4F, -0.8F, 0.3F, -0.2F, -0.8F, 0.1F, -0.2F, 0.0F, 0.3F, -0.4F, 0.0F); // Import
        gunModel[9].setRotationPoint(-2.2F, -0.4F, -0.5F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.0F, -0.3F, -0.4F, 0.0F, -0.3F, -0.4F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, -0.5F, -0.1F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.5F, -0.1F, -0.3F); // Import
        gunModel[10].setRotationPoint(-0.5F, -2.7F, -0.5F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.4F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.5F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, -0.35F, -0.5F, -0.3F, -0.35F, -0.5F, -0.3F, -0.6F, -0.4F, -0.3F); // Import
        gunModel[11].setRotationPoint(-0.5F, -2.2F, -0.5F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.65F, -0.3F, -0.3F, -0.65F, -0.3F, -0.3F, -0.3F, -0.4F, -0.3F, -0.45F, -0.5F, -0.3F, -0.5F, -0.6F, -0.3F, -0.5F, -0.6F, -0.3F, -0.45F, -0.5F, -0.3F); // Import
        gunModel[12].setRotationPoint(-0.2F, -2F, -0.5F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.25F, -0.5F, -0.3F, 0.25F, -0.5F, -0.3F, 0.25F, -0.5F, -0.3F, 0.25F, -0.5F, -0.3F); // Import
        gunModel[13].setRotationPoint(0.5F, -2F, -0.5F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.65F, -0.3F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.65F, -0.3F, -0.3F, -0.5F, -0.6F, -0.3F, -0.45F, -0.5F, -0.3F, -0.45F, -0.5F, -0.3F, -0.5F, -0.6F, -0.3F); // Import
        gunModel[14].setRotationPoint(1.2F, -2F, -0.5F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.4F, -0.35F, -0.3F, -0.35F, -0.5F, -0.3F, -0.6F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, -0.35F, -0.5F, -0.3F); // Import
        gunModel[15].setRotationPoint(1.5F, -2.2F, -0.5F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, -0.4F, 0.0F, -0.3F, -0.4F, -0.15F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.4F, -0.15F, -0.3F); // Import
        gunModel[16].setRotationPoint(1.5F, -2.7F, -0.5F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.3F, -0.3F, 0.0F, 0.1F, -0.5F, 0.0F, 0.3F, -0.5F, -0.8F, 0.5F, -0.3F, -0.8F, -1.1F, -0.2F, 0.0F, 0.2F, -0.3F, 0.0F, 0.4F, -0.3F, -0.8F, -1.2F, -0.1F, -0.8F); // Import
        gunModel[17].setRotationPoint(-2.2F, -0.1F, -0.5F);

        gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.3F, -0.4F, 0.0F, 0.1F, -0.4F, 0.0F, 0.3F, -0.4F, -0.8F, 0.5F, -0.4F, -0.8F, 0.3F, -0.4F, 0.0F, 0.1F, -0.2F, 0.0F, 0.3F, -0.2F, -0.8F, 0.5F, -0.4F, -0.8F); // Import
        gunModel[18].setRotationPoint(-2.2F, -0.4F, -0.5F);

        gunModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.3F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.5F, 0.0F, -0.8F, 1.5F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -0.9F, 0.0F, -0.8F, 1.7F, 0.0F, -0.8F); // Import
        gunModel[19].setRotationPoint(-1F, -2F, -0.5F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.3F, -0.6F, 0.0F, -0.2F, -0.6F, 0.0F, 0.0F, -0.6F, -0.8F, 0.5F, -0.6F, -0.8F, 0.3F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.5F, 0.0F, -0.8F); // Import
        gunModel[20].setRotationPoint(-1F, -3F, -0.5F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.6F, -0.7F, 0.0F, -0.2F, -0.7F, 0.0F, 0.0F, -0.7F, -0.8F, 0.8F, -0.7F, -0.8F, 0.3F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.5F, 0.0F, -0.8F); // Import
        gunModel[21].setRotationPoint(-1F, -3.4F, -0.5F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, 0.0F, -0.3F, -0.1F, 0.0F, -0.3F, -0.1F, 0.0F, -0.3F, 0.05F, 0.0F, -0.3F, 0.0F, -0.7F, -0.3F, -0.6F, -0.7F, -0.3F, -0.6F, -0.7F, -0.3F, 0.0F, -0.7F, -0.3F); // Import
        gunModel[22].setRotationPoint(0.5F, -2.7F, -0.5F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, -0.3F, -0.6F, 0.0F, -0.3F, -0.6F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.8F, -0.3F, -0.75F, -0.8F, -0.3F, -0.75F, -0.8F, -0.3F, 0.0F, -0.8F, -0.3F); // Import
        gunModel[23].setRotationPoint(0.5F, -2.4F, -0.5F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.1F, -0.3F, -0.75F, -0.1F, -0.3F, -0.75F, -0.1F, -0.3F, 0.0F, -0.1F, -0.3F, -0.05F, -0.7F, -0.3F, -0.75F, -0.7F, -0.3F, -0.75F, -0.7F, -0.3F, -0.05F, -0.7F, -0.3F); // Import
        gunModel[24].setRotationPoint(0.5F, -2.3F, -0.5F);

        gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.05F, -0.1F, -0.3F, -0.75F, -0.1F, -0.3F, -0.75F, -0.1F, -0.3F, -0.05F, -0.1F, -0.3F, -0.15F, -0.7F, -0.3F, -0.65F, -0.7F, -0.3F, -0.65F, -0.7F, -0.3F, -0.15F, -0.7F, -0.3F); // Import
        gunModel[25].setRotationPoint(0.5F, -2.1F, -0.5F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.1F, -0.3F, -0.65F, -0.1F, -0.3F, -0.65F, -0.1F, -0.3F, -0.15F, -0.1F, -0.3F, -0.4F, -0.75F, -0.3F, -0.5F, -0.75F, -0.3F, -0.5F, -0.75F, -0.3F, -0.4F, -0.75F, -0.3F); // Import
        gunModel[26].setRotationPoint(0.5F, -1.9F, -0.5F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F); // Import
        gunModel[27].setRotationPoint(-2.7F, -3.7F, -0.5F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, 0.0F, -0.4F, 0.2F, 0.0F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, 0.0F, -0.4F, 0.2F); // Import
        gunModel[28].setRotationPoint(1.3F, -3.7F, -0.5F);

        gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F, -0.4F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F, 0.2F, 0.0F, -0.4F, 0.2F); // Import
        gunModel[29].setRotationPoint(1.3F, -3.3F, -0.5F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.5F, 0.2F, -0.8F, -0.5F, 0.2F, -0.8F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F, -0.4F, 0.2F, -0.7F, -0.4F, 0.2F, -0.7F, -0.4F, 0.2F, 0.0F, -0.4F, 0.2F); // Import
        gunModel[30].setRotationPoint(1.3F, -3.4F, -0.5F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.5F, 0.2F, -0.8F, -0.5F, 0.2F, -0.8F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F, -0.4F, 0.2F, -0.8F, -0.4F, 0.2F, -0.8F, -0.4F, 0.2F, 0.0F, -0.4F, 0.2F); // Import
        gunModel[31].setRotationPoint(1.3F, -3.5F, -0.5F);

        gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.4F, 0.2F, -0.7F, -0.4F, 0.2F, -0.7F, -0.4F, 0.2F, 0.0F, -0.4F, 0.2F, 0.0F, -0.5F, 0.2F, -0.8F, -0.5F, 0.2F, -0.8F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F); // Import
        gunModel[32].setRotationPoint(1.3F, -3.5F, -0.5F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, -0.4F, 0.2F, 0.1F, -0.4F, 0.2F, 0.1F, -0.4F, 0.2F, -0.7F, -0.4F, 0.2F, -0.8F, -0.5F, 0.2F, 0.1F, -0.5F, 0.2F, 0.1F, -0.5F, 0.2F, -0.8F, -0.5F, 0.2F); // Import
        gunModel[33].setRotationPoint(1F, -3.5F, -0.5F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.5F, 0.2F, 0.1F, -0.5F, 0.2F, 0.1F, -0.5F, 0.2F, -0.8F, -0.5F, 0.2F, -0.8F, -0.4F, 0.2F, 0.1F, -0.4F, 0.2F, 0.1F, -0.4F, 0.2F, -0.8F, -0.4F, 0.2F); // Import
        gunModel[34].setRotationPoint(1F, -3.5F, -0.5F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.5F, 0.2F, 0.1F, -0.5F, 0.2F, 0.1F, -0.5F, 0.2F, -0.8F, -0.5F, 0.2F, -0.7F, -0.4F, 0.2F, 0.1F, -0.4F, 0.2F, 0.1F, -0.4F, 0.2F, -0.7F, -0.4F, 0.2F); // Import
        gunModel[35].setRotationPoint(1F, -3.4F, -0.5F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F); // Import
        gunModel[36].setRotationPoint(-2.7F, -4.3F, -0.5F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.0F, 0.0F, -1.1F, -0.2F, 0.0F, -1.1F, -0.2F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, -0.2F, -1.1F, 0.2F, -0.2F, -1.1F, 0.2F, -0.2F, 0.3F, 0.0F, -0.2F, 0.3F); // Import
        gunModel[37].setRotationPoint(-2.7F, -4.9F, -0.5F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0.0F, -0.25F, 0.1F, 0.0F, -0.25F, 0.1F, 0.0F, -0.25F, 0.1F, 0.0F, -0.25F, 0.1F, 0.0F, -0.2F, 0.1F, 0.0F, -0.2F, 0.1F, 0.0F, -0.2F, 0.1F, 0.0F, -0.2F, 0.1F); // Import
        gunModel[38].setRotationPoint(-3.7F, -5.9F, -0.5F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F); // Import
        gunModel[39].setRotationPoint(-2.7F, -5.6F, -0.5F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F); // Import
        gunModel[40].setRotationPoint(1.8F, -5.2F, -0.5F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F); // Import
        gunModel[41].setRotationPoint(1.8F, -5.2F, -0.5F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F); // Import
        gunModel[42].setRotationPoint(1.8F, -5.2F, -0.5F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F); // Import
        gunModel[43].setRotationPoint(1.8F, -5.2F, -0.5F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F); // Import
        gunModel[44].setRotationPoint(1.8F, -5.2F, -0.5F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F); // Import
        gunModel[45].setRotationPoint(1.8F, -5.2F, -0.5F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F); // Import
        gunModel[46].setRotationPoint(1.8F, -5.2F, -0.5F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F); // Import
        gunModel[47].setRotationPoint(5.3F, -4.2F, -0.5F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F); // Import
        gunModel[48].setRotationPoint(5.3F, -4.2F, -0.5F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F); // Import
        gunModel[49].setRotationPoint(5.3F, -4.2F, -0.5F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F); // Import
        gunModel[50].setRotationPoint(5.3F, -4.2F, -0.5F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F); // Import
        gunModel[51].setRotationPoint(5.3F, -4.2F, -0.5F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F); // Import
        gunModel[52].setRotationPoint(5.3F, -4.2F, -0.5F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F); // Import
        gunModel[53].setRotationPoint(5.3F, -4.2F, -0.5F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.1F, -0.3F, -0.05F, -0.1F, -0.3F, -0.05F, -0.1F, -0.3F, -0.05F, -0.1F, -0.3F, -0.05F, -0.1F, -0.6F, -0.15F, -0.1F, -0.6F, -0.15F, -0.1F, -0.6F, -0.15F, -0.1F, -0.6F, -0.15F); // Import
        gunModel[54].setRotationPoint(-1.6F, -6.3F, -0.5F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[55].setRotationPoint(0.1F, -6.7F, -0.25F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[56].setRotationPoint(-0.3F, -6.7F, -0.25F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[57].setRotationPoint(-0.7F, -6.7F, -0.25F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[58].setRotationPoint(-1.1F, -6.7F, -0.25F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[59].setRotationPoint(-1.5F, -6.7F, -0.25F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[60].setRotationPoint(0.5F, -6.7F, -0.25F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[61].setRotationPoint(0.9F, -6.7F, -0.25F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[62].setRotationPoint(1.3F, -6.7F, -0.25F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[63].setRotationPoint(1.7F, -6.7F, -0.25F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[64].setRotationPoint(2.1F, -6.7F, -0.25F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[65].setRotationPoint(2.5F, -6.7F, -0.25F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[66].setRotationPoint(2.9F, -6.7F, -0.25F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[67].setRotationPoint(3.3F, -6.7F, -0.25F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[68].setRotationPoint(3.7F, -6.7F, -0.25F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[69].setRotationPoint(4.1F, -6.7F, -0.25F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.1F, -0.3F, -0.15F, -0.1F, -0.3F, -0.15F, -0.1F, -0.3F, -0.15F, -0.1F, -0.3F, -0.15F, -0.1F, -0.5F, -0.15F, -0.1F, -0.5F, -0.15F, -0.1F, -0.5F, -0.15F, -0.1F, -0.5F, -0.15F); // Import
        gunModel[70].setRotationPoint(-1.6F, -6.2F, -0.5F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.22F, -0.275F, -0.3F, -0.22F, -0.275F, -0.3F, -0.22F, -0.275F, -0.3F, -0.22F, -0.275F, -0.3F, -0.7F, -0.2F, -0.3F, -0.7F, -0.2F, -0.3F, -0.7F, -0.2F, -0.3F, -0.7F, -0.2F); // Import
        gunModel[71].setRotationPoint(15.9F, -5.2F, -0.5F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.15F, -0.425F, -0.3F, -0.15F, -0.425F, -0.3F, -0.15F, -0.425F, -0.3F, -0.15F, -0.425F, -0.3F, -0.78F, -0.275F, -0.3F, -0.78F, -0.275F, -0.3F, -0.78F, -0.275F, -0.3F, -0.78F, -0.275F); // Import
        gunModel[72].setRotationPoint(15.9F, -5.2F, -0.5F);

        gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.575F, -0.15F, -0.3F, -0.575F, -0.15F, -0.3F, -0.575F, -0.15F, -0.3F, -0.575F, -0.15F); // Import
        gunModel[73].setRotationPoint(15.9F, -5.2F, -0.5F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.425F, -0.15F, -0.3F, -0.425F, -0.15F, -0.3F, -0.425F, -0.15F, -0.3F, -0.425F, -0.15F, -0.3F, -0.425F, -0.15F, -0.3F, -0.425F, -0.15F, -0.3F, -0.425F, -0.15F, -0.3F, -0.425F, -0.15F); // Import
        gunModel[74].setRotationPoint(15.9F, -5.2F, -0.5F);

        gunModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.55F, -0.2F, 0.2F, -0.55F, -0.2F, 0.2F, -0.55F, -0.2F, 0.2F, -0.55F, -0.2F, 0.2F, -0.325F, -0.25F, 0.2F, -0.325F, -0.25F, 0.2F, -0.325F, -0.25F, 0.2F, -0.325F, -0.25F); // Import
        gunModel[75].setRotationPoint(15.3F, -5.2F, -0.5F);

        gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.675F, -0.25F, 0.2F, -0.675F, -0.25F, 0.2F, -0.675F, -0.25F, 0.2F, -0.675F, -0.25F, 0.2F, -0.25F, -0.325F, 0.2F, -0.25F, -0.325F, 0.2F, -0.25F, -0.325F, 0.2F, -0.25F, -0.325F); // Import
        gunModel[76].setRotationPoint(15.3F, -5.2F, -0.5F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.75F, -0.325F, 0.2F, -0.75F, -0.325F, 0.2F, -0.75F, -0.325F, 0.2F, -0.75F, -0.325F, 0.2F, -0.2F, -0.45F, 0.2F, -0.2F, -0.45F, 0.2F, -0.2F, -0.45F, 0.2F, -0.2F, -0.45F); // Import
        gunModel[77].setRotationPoint(15.3F, -5.2F, -0.5F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.3F, -0.35F, 0.0F, -0.3F, -0.35F, 0.0F, -0.3F, -0.35F, 0.0F, -0.3F, -0.35F, 0.0F, -0.65F, -0.3F, 0.0F, -0.65F, -0.3F, 0.0F, -0.65F, -0.3F, 0.0F, -0.65F, -0.3F); // Import
        gunModel[78].setRotationPoint(14.8F, -5.2F, -0.5F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.25F, -0.45F, 0.0F, -0.25F, -0.45F, 0.0F, -0.25F, -0.45F, 0.0F, -0.25F, -0.45F, 0.0F, -0.7F, -0.35F, 0.0F, -0.7F, -0.35F, 0.0F, -0.7F, -0.35F, 0.0F, -0.7F, -0.35F); // Import
        gunModel[79].setRotationPoint(14.8F, -5.2F, -0.5F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.35F, -0.3F, 0.0F, -0.35F, -0.3F, 0.0F, -0.35F, -0.3F, 0.0F, -0.35F, -0.3F, 0.0F, -0.55F, -0.25F, 0.0F, -0.55F, -0.25F, 0.0F, -0.55F, -0.25F, 0.0F, -0.55F, -0.25F); // Import
        gunModel[80].setRotationPoint(14.8F, -5.2F, -0.5F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.45F, -0.25F, 0.0F, -0.45F, -0.25F, 0.0F, -0.45F, -0.25F, 0.0F, -0.45F, -0.25F, 0.0F, -0.45F, -0.25F, 0.0F, -0.45F, -0.25F, 0.0F, -0.45F, -0.25F, 0.0F, -0.45F, -0.25F); // Import
        gunModel[81].setRotationPoint(14.8F, -5.2F, -0.5F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.65F, -0.3F, 0.0F, -0.65F, -0.3F, 0.0F, -0.65F, -0.3F, 0.0F, -0.65F, -0.3F, 0.0F, -0.3F, -0.35F, 0.0F, -0.3F, -0.35F, 0.0F, -0.3F, -0.35F, 0.0F, -0.3F, -0.35F); // Import
        gunModel[82].setRotationPoint(14.8F, -5.2F, -0.5F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.7F, -0.35F, 0.0F, -0.7F, -0.35F, 0.0F, -0.7F, -0.35F, 0.0F, -0.7F, -0.35F, 0.0F, -0.25F, -0.45F, 0.0F, -0.25F, -0.45F, 0.0F, -0.25F, -0.45F, 0.0F, -0.25F, -0.45F); // Import
        gunModel[83].setRotationPoint(14.8F, -5.2F, -0.5F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.55F, -0.25F, 0.0F, -0.55F, -0.25F, 0.0F, -0.55F, -0.25F, 0.0F, -0.55F, -0.25F, 0.0F, -0.35F, -0.3F, 0.0F, -0.35F, -0.3F, 0.0F, -0.35F, -0.3F, 0.0F, -0.35F, -0.3F); // Import
        gunModel[84].setRotationPoint(14.8F, -5.2F, -0.5F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.45F, -0.2F, 0.2F, -0.45F, -0.2F, 0.2F, -0.45F, -0.2F, 0.2F, -0.45F, -0.2F, 0.2F, -0.45F, -0.2F, 0.2F, -0.45F, -0.2F, 0.2F, -0.45F, -0.2F, 0.2F, -0.45F, -0.2F); // Import
        gunModel[85].setRotationPoint(15.3F, -5.2F, -0.5F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.325F, -0.25F, 0.2F, -0.325F, -0.25F, 0.2F, -0.325F, -0.25F, 0.2F, -0.325F, -0.25F, 0.2F, -0.55F, -0.2F, 0.2F, -0.55F, -0.2F, 0.2F, -0.55F, -0.2F, 0.2F, -0.55F, -0.2F); // Import
        gunModel[86].setRotationPoint(15.3F, -5.2F, -0.5F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.25F, -0.325F, 0.2F, -0.25F, -0.325F, 0.2F, -0.25F, -0.325F, 0.2F, -0.25F, -0.325F, 0.2F, -0.675F, -0.25F, 0.2F, -0.675F, -0.25F, 0.2F, -0.675F, -0.25F, 0.2F, -0.675F, -0.25F); // Import
        gunModel[87].setRotationPoint(15.3F, -5.2F, -0.5F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.2F, -0.45F, 0.2F, -0.2F, -0.45F, 0.2F, -0.2F, -0.45F, 0.2F, -0.2F, -0.45F, 0.2F, -0.75F, -0.325F, 0.2F, -0.75F, -0.325F, 0.2F, -0.75F, -0.325F, 0.2F, -0.75F, -0.325F); // Import
        gunModel[88].setRotationPoint(15.3F, -5.2F, -0.5F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.575F, -0.15F, -0.3F, -0.575F, -0.15F, -0.3F, -0.575F, -0.15F, -0.3F, -0.575F, -0.15F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F); // Import
        gunModel[89].setRotationPoint(15.9F, -5.2F, -0.5F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.7F, -0.2F, -0.3F, -0.7F, -0.2F, -0.3F, -0.7F, -0.2F, -0.3F, -0.7F, -0.2F, -0.3F, -0.22F, -0.275F, -0.3F, -0.22F, -0.275F, -0.3F, -0.22F, -0.275F, -0.3F, -0.22F, -0.275F); // Import
        gunModel[90].setRotationPoint(15.9F, -5.2F, -0.5F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.78F, -0.275F, -0.3F, -0.78F, -0.275F, -0.3F, -0.78F, -0.275F, -0.3F, -0.78F, -0.275F, -0.3F, -0.15F, -0.425F, -0.3F, -0.15F, -0.425F, -0.3F, -0.15F, -0.425F, -0.3F, -0.15F, -0.425F); // Import
        gunModel[91].setRotationPoint(15.9F, -5.2F, -0.5F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.575F, -0.15F, -0.1F, -0.575F, -0.15F, -0.1F, -0.575F, -0.15F, -0.1F, -0.575F, -0.15F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F); // Import
        gunModel[92].setRotationPoint(13.8F, -5.2F, -0.5F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F); // Import
        gunModel[93].setRotationPoint(13.8F, -4.7F, -0.5F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.425F, -0.15F, -0.1F, -0.425F, -0.15F, -0.1F, -0.425F, -0.15F, -0.1F, -0.425F, -0.15F, -0.1F, -0.425F, -0.15F, -0.1F, -0.425F, -0.15F, -0.1F, -0.425F, -0.15F, -0.1F, -0.425F, -0.15F); // Import
        gunModel[94].setRotationPoint(13.8F, -5.2F, -0.5F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.575F, -0.15F, -0.1F, -0.575F, -0.15F, -0.1F, -0.575F, -0.15F, -0.1F, -0.575F, -0.15F); // Import
        gunModel[95].setRotationPoint(13.8F, -5.2F, -0.5F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.7F, -0.2F, -0.1F, -0.7F, -0.2F, -0.1F, -0.7F, -0.2F, -0.1F, -0.7F, -0.2F); // Import
        gunModel[96].setRotationPoint(13.8F, -5.2F, -0.5F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, 0.0F, -0.25F, -0.1F, 0.0F, -0.25F, -0.1F, 0.0F, -0.25F, -0.1F, 0.0F, -0.25F, -0.1F, -0.7F, -0.25F, -0.1F, -0.7F, -0.25F, -0.1F, -0.7F, -0.25F, -0.1F, -0.7F, -0.25F); // Import
        gunModel[97].setRotationPoint(13.8F, -5.25F, -0.5F);

        gunModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F); // Import
        gunModel[98].setRotationPoint(13.8F, -5.6F, -0.5F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.4F, -0.55F, -0.2F, -0.4F, -0.55F, -0.2F, -0.4F, -0.55F, -0.2F, -0.4F, -0.55F, -0.2F); // Import
        gunModel[99].setRotationPoint(13.8F, -5.6F, -0.5F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.2F, -0.4F, -0.55F, -0.2F, -0.4F, -0.55F, -0.2F, -0.4F, -0.55F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F); // Import
        gunModel[100].setRotationPoint(13.8F, -5.6F, -0.5F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, 0.0F, -0.3F, -0.4F, 0.0F, -0.3F, -0.4F, 0.0F, -0.3F, -0.4F, 0.0F, -0.3F); // Import
        gunModel[101].setRotationPoint(14.1F, -6.25F, -0.5F);

        gunModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.7F, -0.3F, -0.4F, -0.6F, -0.3F, -0.4F, -0.6F, -0.3F, -0.3F, -0.7F, -0.3F, -0.3F, 0.0F, -0.3F, -0.4F, 0.0F, -0.3F, -0.4F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F); // Import
        gunModel[102].setRotationPoint(13.6F, -6.25F, -0.5F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.7F, -0.3F, -0.5F, -0.8F, -0.3F, -0.5F, -0.8F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, -0.4F, 0.0F, -0.3F); // Import
        gunModel[103].setRotationPoint(13.8F, -6.25F, -0.5F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, -0.3F, -0.5F, -0.8F, -0.3F, -0.5F, -0.8F, -0.3F, -0.4F, -0.8F, -0.3F, -0.4F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, -0.4F, 0.0F, -0.3F); // Import
        gunModel[104].setRotationPoint(13.9F, -6.25F, -0.5F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, -0.3F, -0.5F, -0.7F, -0.3F, -0.5F, -0.7F, -0.3F, -0.4F, -0.8F, -0.3F, -0.4F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, -0.4F, 0.0F, -0.3F); // Import
        gunModel[105].setRotationPoint(14F, -6.25F, -0.5F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.45F, -0.5F, -0.3F, -0.3F, -0.3F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.3F, -0.3F, -0.3F); // Import
        gunModel[106].setRotationPoint(13.6F, -6.25F, -0.5F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.5F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.4F, -0.5F, -0.3F); // Import
        gunModel[107].setRotationPoint(14F, -6.25F, -0.5F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.25F, -0.5F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F); // Import
        gunModel[108].setRotationPoint(13.8F, -6.25F, -0.5F);

        gunModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F); // Import
        gunModel[109].setRotationPoint(14F, -6.9F, -0.5F);

        gunModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F); // Import
        gunModel[110].setRotationPoint(14F, -7.05F, -0.5F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.35F, -0.8F, -0.3F, -0.35F, -0.8F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.45F, -0.7F, -0.3F, -0.45F, -0.7F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F); // Import
        gunModel[111].setRotationPoint(14F, -6.85F, -0.5F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.35F, -0.7F, -0.3F, -0.35F, -0.7F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.6F, -0.55F, -0.3F, -0.6F, -0.55F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F); // Import
        gunModel[112].setRotationPoint(14F, -6.65F, -0.5F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.35F, -0.7F, -0.3F, -0.35F, -0.7F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.6F, -0.55F, -0.3F, -0.6F, -0.55F); // Import
        gunModel[113].setRotationPoint(14F, -6.65F, -0.5F);

        gunModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.35F, -0.8F, -0.3F, -0.35F, -0.8F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.45F, -0.7F, -0.3F, -0.45F, -0.7F); // Import
        gunModel[114].setRotationPoint(14F, -6.85F, -0.5F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.45F, -0.8F, -0.3F, -0.45F, -0.8F); // Import
        gunModel[115].setRotationPoint(14F, -7.05F, -0.5F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.45F, -0.7F, -0.3F, -0.45F, -0.7F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.35F, -0.8F, -0.3F, -0.35F, -0.8F); // Import
        gunModel[116].setRotationPoint(14F, -7.25F, -0.5F);

        gunModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, -0.7F, -0.3F, -0.45F, -0.7F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.35F, -0.8F, -0.3F, -0.35F, -0.8F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F); // Import
        gunModel[117].setRotationPoint(14F, -7.25F, -0.5F);

        gunModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F); // Import
        gunModel[118].setRotationPoint(14F, -6.65F, -0.5F);

        gunModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.15F, -0.425F, -0.2F, -0.15F, -0.425F, -0.2F, -0.15F, -0.425F, -0.2F, -0.15F, -0.425F, -0.2F, -0.78F, -0.275F, -0.2F, -0.78F, -0.275F, -0.2F, -0.78F, -0.275F, -0.2F, -0.78F, -0.275F); // Import
        gunModel[119].setRotationPoint(13.7F, -4.2F, -0.5F);

        gunModel[120].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.22F, -0.275F, -0.2F, -0.22F, -0.275F, -0.2F, -0.22F, -0.275F, -0.2F, -0.22F, -0.275F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F); // Import
        gunModel[120].setRotationPoint(13.7F, -4.2F, -0.5F);

        gunModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.575F, -0.15F, -0.2F, -0.575F, -0.15F, -0.2F, -0.575F, -0.15F, -0.2F, -0.575F, -0.15F); // Import
        gunModel[121].setRotationPoint(13.7F, -4.2F, -0.5F);

        gunModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.425F, -0.15F, -0.2F, -0.425F, -0.15F, -0.2F, -0.425F, -0.15F, -0.2F, -0.425F, -0.15F, -0.2F, -0.425F, -0.15F, -0.2F, -0.425F, -0.15F, -0.2F, -0.425F, -0.15F, -0.2F, -0.425F, -0.15F); // Import
        gunModel[122].setRotationPoint(13.7F, -4.2F, -0.5F);

        gunModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.575F, -0.15F, -0.2F, -0.575F, -0.15F, -0.2F, -0.575F, -0.15F, -0.2F, -0.575F, -0.15F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F); // Import
        gunModel[123].setRotationPoint(13.7F, -4.2F, -0.5F);

        gunModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.22F, -0.275F, -0.2F, -0.22F, -0.275F, -0.2F, -0.22F, -0.275F, -0.2F, -0.22F, -0.275F); // Import
        gunModel[124].setRotationPoint(13.7F, -4.2F, -0.5F);

        gunModel[125].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.78F, -0.275F, -0.2F, -0.78F, -0.275F, -0.2F, -0.78F, -0.275F, -0.2F, -0.78F, -0.275F, -0.2F, -0.15F, -0.425F, -0.2F, -0.15F, -0.425F, -0.2F, -0.15F, -0.425F, -0.2F, -0.15F, -0.425F); // Import
        gunModel[125].setRotationPoint(13.7F, -4.2F, -0.5F);

        gunModel[126].addShapeBox(0F, -0.5F, -0.5F, 9, 1, 1, 0F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F); // Import
        gunModel[126].setRotationPoint(4.9F, -3.7F, 0F);

        gunModel[127].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.85F, -0.275F, -0.2F, -0.85F, -0.275F, -0.2F, -0.85F, -0.275F, -0.2F, -0.85F, -0.275F); // Import
        gunModel[127].setRotationPoint(4.9F, -4.2F, -0.5F);

        gunModel[128].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, -0.2F, -0.15F, -0.275F, -0.2F, -0.15F, -0.275F, -0.2F, -0.15F, -0.275F, -0.2F, -0.15F, -0.275F, -0.2F, -0.725F, -0.15F, -0.2F, -0.725F, -0.15F, -0.2F, -0.725F, -0.15F, -0.2F, -0.725F, -0.15F); // Import
        gunModel[128].setRotationPoint(4.9F, -4.2F, -0.5F);

        gunModel[129].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, -0.2F, -0.275F, -0.15F, -0.2F, -0.275F, -0.15F, -0.2F, -0.275F, -0.15F, -0.2F, -0.275F, -0.15F, -0.2F, -0.6F, -0.1F, -0.2F, -0.6F, -0.1F, -0.2F, -0.6F, -0.1F, -0.2F, -0.6F, -0.1F); // Import
        gunModel[129].setRotationPoint(4.9F, -4.2F, -0.5F);

        gunModel[130].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, -0.2F, -0.85F, -0.275F, -0.2F, -0.85F, -0.275F, -0.2F, -0.85F, -0.275F, -0.2F, -0.85F, -0.275F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F); // Import
        gunModel[130].setRotationPoint(4.9F, -4.2F, -0.5F);

        gunModel[131].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, -0.2F, -0.725F, -0.15F, -0.2F, -0.725F, -0.15F, -0.2F, -0.725F, -0.15F, -0.2F, -0.725F, -0.15F, -0.2F, -0.15F, -0.275F, -0.2F, -0.15F, -0.275F, -0.2F, -0.15F, -0.275F, -0.2F, -0.15F, -0.275F); // Import
        gunModel[131].setRotationPoint(4.9F, -4.2F, -0.5F);

        gunModel[132].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, -0.2F, -0.6F, -0.1F, -0.2F, -0.6F, -0.1F, -0.2F, -0.6F, -0.1F, -0.2F, -0.6F, -0.1F, -0.2F, -0.275F, -0.15F, -0.2F, -0.275F, -0.15F, -0.2F, -0.275F, -0.15F, -0.2F, -0.275F, -0.15F); // Import
        gunModel[132].setRotationPoint(4.9F, -4.2F, -0.5F);

        gunModel[133].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.45F, 0.1F, 0.0F, -0.45F, 0.1F, 0.0F, -0.45F, 0.1F, 0.0F, -0.45F, 0.1F); // Import
        gunModel[133].setRotationPoint(-3.7F, -6.2F, -0.5F);

        gunModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.7F, -1.1F, 0.0F, -0.7F, -1.1F, 0.0F, -0.7F, 0.3F, 0.0F, -0.7F, 0.3F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F); // Import
        gunModel[134].setRotationPoint(11.3F, -5.1F, -0.5F);

        gunModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.7F, -1.1F, -0.7F, -0.7F, -1.1F, -0.7F, -0.7F, 0.3F, 0.0F, -0.7F, 0.3F, 0.0F, -0.2F, -1.1F, -0.6F, -0.2F, -1.1F, -0.6F, -0.2F, 0.3F, 0.0F, -0.2F, 0.3F); // Import
        gunModel[135].setRotationPoint(11.3F, -5.2F, -0.5F);

        gunModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, -0.7F, -1.1F, 0.0F, -0.7F, -1.1F, 0.0F, -0.7F, 0.3F, -0.7F, -0.7F, 0.3F, -0.6F, -0.2F, -1.1F, 0.0F, -0.2F, -1.1F, 0.0F, -0.2F, 0.3F, -0.6F, -0.2F, 0.3F); // Import
        gunModel[136].setRotationPoint(11.3F, -5.2F, -0.5F);

        gunModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, -0.6F, -1.1F, -0.1F, -0.6F, -1.1F, -0.1F, -0.6F, 0.3F, -0.7F, -0.6F, 0.3F, -0.7F, -0.2F, -1.1F, 0.0F, -0.2F, -1.1F, 0.0F, -0.2F, 0.3F, -0.7F, -0.2F, 0.3F); // Import
        gunModel[137].setRotationPoint(11.3F, -5.3F, -0.5F);

        gunModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, -1.1F, -0.7F, -0.6F, -1.1F, -0.7F, -0.6F, 0.3F, 0.0F, -0.6F, 0.3F, 0.0F, -0.2F, -1.1F, -0.7F, -0.2F, -1.1F, -0.7F, -0.2F, 0.3F, 0.0F, -0.2F, 0.3F); // Import
        gunModel[138].setRotationPoint(11.3F, -5.3F, -0.5F);

        gunModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.2F, -1.1F, -0.2F, -0.2F, -1.1F, -0.2F, -0.2F, 0.3F, -0.6F, -0.2F, 0.3F, -0.7F, -0.7F, -1.1F, -0.1F, -0.7F, -1.1F, -0.1F, -0.7F, 0.3F, -0.7F, -0.7F, 0.3F); // Import
        gunModel[139].setRotationPoint(11.3F, -5F, -0.5F);

        gunModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.2F, -1.1F, -0.6F, -0.2F, -1.1F, -0.6F, -0.2F, 0.3F, 0.0F, -0.2F, 0.3F, 0.0F, -0.7F, -1.1F, -0.7F, -0.7F, -1.1F, -0.7F, -0.7F, 0.3F, 0.0F, -0.7F, 0.3F); // Import
        gunModel[140].setRotationPoint(11.3F, -5F, -0.5F);

        gunModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.2F, -1.1F, -0.3F, -0.2F, -1.1F, -0.3F, -0.2F, 0.3F, 0.0F, -0.2F, 0.3F, 0.0F, -0.7F, -1.1F, -0.2F, -0.7F, -1.1F, -0.2F, -0.7F, 0.3F, 0.0F, -0.7F, 0.3F); // Import
        gunModel[141].setRotationPoint(11.3F, -5.1F, -0.5F);

        gunModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F); // Import
        gunModel[142].setRotationPoint(5.5F, -5.8F, -1.5F);

        gunModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, -1.1F, 0.0F, -0.2F, -1.1F, 0.0F, -0.7F, 0.3F, -0.2F, -0.7F, 0.3F, -0.2F, -0.7F, -1.1F, 0.0F, -0.7F, -1.1F); // Import
        gunModel[143].setRotationPoint(11.3F, -5.1F, -0.5F);

        gunModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.2F, 0.3F, -0.6F, -0.2F, 0.3F, -0.6F, -0.2F, -1.1F, 0.0F, -0.2F, -1.1F, 0.0F, -0.7F, 0.3F, -0.7F, -0.7F, 0.3F, -0.7F, -0.7F, -1.1F, 0.0F, -0.7F, -1.1F); // Import
        gunModel[144].setRotationPoint(11.3F, -5F, -0.5F);

        gunModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.3F, -0.7F, -0.6F, 0.3F, -0.7F, -0.6F, -1.1F, 0.0F, -0.6F, -1.1F, 0.0F, -0.2F, 0.3F, -0.7F, -0.2F, 0.3F, -0.7F, -0.2F, -1.1F, 0.0F, -0.2F, -1.1F); // Import
        gunModel[145].setRotationPoint(11.3F, -5.3F, -0.5F);

        gunModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.7F, 0.3F, -0.7F, -0.7F, 0.3F, -0.7F, -0.7F, -1.1F, 0.0F, -0.7F, -1.1F, 0.0F, -0.2F, 0.3F, -0.6F, -0.2F, 0.3F, -0.6F, -0.2F, -1.1F, 0.0F, -0.2F, -1.1F); // Import
        gunModel[146].setRotationPoint(11.3F, -5.2F, -0.5F);

        gunModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.7F, 0.3F, 0.0F, -0.7F, 0.3F, 0.0F, -0.7F, -1.1F, 0.0F, -0.7F, -1.1F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F); // Import
        gunModel[147].setRotationPoint(11.3F, -5.1F, -0.5F);

        gunModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, -0.7F, 0.3F, 0.0F, -0.7F, 0.3F, 0.0F, -0.7F, -1.1F, -0.7F, -0.7F, -1.1F, -0.6F, -0.2F, 0.3F, 0.0F, -0.2F, 0.3F, 0.0F, -0.2F, -1.1F, -0.6F, -0.2F, -1.1F); // Import
        gunModel[148].setRotationPoint(11.3F, -5.2F, -0.5F);

        gunModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, -0.6F, 0.3F, -0.1F, -0.6F, 0.3F, -0.1F, -0.6F, -1.1F, -0.7F, -0.6F, -1.1F, -0.7F, -0.2F, 0.3F, 0.0F, -0.2F, 0.3F, 0.0F, -0.2F, -1.1F, -0.7F, -0.2F, -1.1F); // Import
        gunModel[149].setRotationPoint(11.3F, -5.3F, -0.5F);

        gunModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, -1.1F, -0.6F, -0.2F, -1.1F, -0.7F, -0.7F, 0.3F, -0.1F, -0.7F, 0.3F, -0.1F, -0.7F, -1.1F, -0.7F, -0.7F, -1.1F); // Import
        gunModel[150].setRotationPoint(11.3F, -5F, -0.5F);

        gunModel[151].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, -0.2F, 0.3F, 0.0F, -0.2F, 0.3F, 0.0F, -0.2F, -1.1F, 0.0F, -0.2F, -1.1F); // Import
        gunModel[151].setRotationPoint(-2.7F, -4.9F, -0.5F);

        gunModel[152].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F); // Import
        gunModel[152].setRotationPoint(6.5F, -4.6F, 0.4F);

        gunModel[153].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0.2F, 0.0F, 0.2F, 0.3F, 0.0F, 0.2F, 0.3F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, -0.7F, -0.1F, 0.0F, -0.7F, -0.1F, 0.0F, -0.7F, -0.1F, 0.2F, -0.7F, -0.1F); // Import
        gunModel[153].setRotationPoint(2.3F, -3.3F, -0.5F);

        gunModel[154].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.3F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F); // Import
        gunModel[154].setRotationPoint(6.5F, -5.1F, 0.4F);

        gunModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.4F, -0.5F, -0.4F, 0.0F, -0.1F, -0.4F, 0.0F, -0.1F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F); // Import
        gunModel[155].setRotationPoint(5.7F, -4.6F, 0.4F);

        gunModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F); // Import
        gunModel[156].setRotationPoint(5.4F, -4.6F, 0.4F);

        gunModel[157].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.2F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F); // Import
        gunModel[157].setRotationPoint(6.5F, -3.6F, 0.4F);

        gunModel[158].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.2F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F); // Import
        gunModel[158].setRotationPoint(6.5F, -3.9F, 0.4F);

        gunModel[159].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.2F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F); // Import
        gunModel[159].setRotationPoint(6.5F, -4.1F, 0.4F);

        gunModel[160].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.2F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.7F, -0.4F, -0.4F, -0.7F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Import
        gunModel[160].setRotationPoint(5.5F, -3F, 0.4F);

        gunModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.7F, -0.5F, 0.0F, -0.7F, -0.5F, -0.1F, -0.1F, -0.4F, 0.0F, -0.1F, -0.4F, 0.0F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F); // Import
        gunModel[161].setRotationPoint(10.3F, -4.6F, 0.6F);

        gunModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, -0.4F, -0.4F, -0.1F, -0.7F, -0.4F, -0.1F, -0.7F, -0.5F, -0.8F, -0.5F, -0.5F, -0.3F, -0.3F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.5F, -0.4F, -0.2F, -0.5F); // Import
        gunModel[162].setRotationPoint(9.5F, -4.4F, 0.6F);

        gunModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.1F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.5F, -0.4F, -0.2F, -0.5F, -0.2F, -0.6F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.5F, -0.3F, -0.5F, -0.5F); // Import
        gunModel[163].setRotationPoint(9.5F, -3.8F, 0.6F);

        gunModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0.0F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.5F, -0.4F, -0.1F, -0.5F, -0.3F, -0.3F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.5F, -0.4F, -0.3F, -0.5F); // Import
        gunModel[164].setRotationPoint(9.4F, -3.4F, 0.6F);

        gunModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.1F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.5F, -0.4F, -0.1F, -0.5F, 0.0F, -0.6F, -0.4F, -0.6F, -0.6F, -0.4F, -0.6F, -0.6F, -0.5F, -0.1F, -0.6F, -0.5F); // Import
        gunModel[165].setRotationPoint(9.4F, -2.8F, 0.6F);

        gunModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.5F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F, -0.2F, -0.4F, -0.4F, -0.6F, -0.1F, -0.4F, -0.7F, -0.2F, -0.5F, -0.2F, -0.4F, -0.5F); // Import
        gunModel[166].setRotationPoint(6.5F, -5.1F, 0.6F);

        gunModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.2F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F); // Import
        gunModel[167].setRotationPoint(5.4F, -4.6F, 0.6F);

        gunModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.5F, -0.3F, -0.5F, -0.5F, -0.5F, -0.2F, -0.4F, 0.1F, -0.6F, -0.4F, 0.0F, -0.7F, -0.5F, -0.4F, -0.3F, -0.5F); // Import
        gunModel[168].setRotationPoint(5.8F, -4.6F, 0.6F);

        gunModel[169].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.35F, -0.4F, 0.0F, -0.35F, -0.4F, 0.0F, -0.45F, -0.5F, 0.0F, -0.45F, -0.5F, 0.0F, -0.35F, -0.4F, 0.0F, -0.35F, -0.4F, 0.0F, -0.45F, -0.5F, 0.0F, -0.45F, -0.5F); // Import
        gunModel[169].setRotationPoint(7.3F, -4.3F, 0.6F);

        gunModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.45F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.45F, -0.5F, -0.5F, -0.5F, -0.5F, -0.45F, -0.45F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.45F, -0.5F, -0.5F, -0.5F, -0.5F); // Import
        gunModel[170].setRotationPoint(6.7F, -4.3F, 0.6F);

        gunModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.4F, -0.45F, -0.45F, -0.4F, -0.5F, -0.5F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.35F, -0.4F, -0.45F, -0.45F, -0.4F, -0.5F, -0.5F, -0.5F, -0.4F, -0.45F, -0.5F); // Import
        gunModel[171].setRotationPoint(8.9F, -4.3F, 0.6F);

        gunModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.45F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.45F, -0.5F, -0.5F, -0.5F, -0.5F, -0.45F, -0.45F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.45F, -0.5F, -0.5F, -0.5F, -0.5F); // Import
        gunModel[172].setRotationPoint(5.5F, -3.8F, 0.6F);

        gunModel[173].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.1F, -0.35F, -0.4F, 0.1F, -0.35F, -0.4F, 0.1F, -0.45F, -0.5F, 0.1F, -0.45F, -0.5F, 0.1F, -0.35F, -0.4F, 0.1F, -0.35F, -0.4F, 0.1F, -0.45F, -0.5F, 0.1F, -0.45F, -0.5F); // Import
        gunModel[173].setRotationPoint(6.2F, -3.8F, 0.6F);

        gunModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.4F, -0.45F, -0.45F, -0.4F, -0.5F, -0.5F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.35F, -0.4F, -0.45F, -0.45F, -0.4F, -0.5F, -0.5F, -0.5F, -0.4F, -0.45F, -0.5F); // Import
        gunModel[174].setRotationPoint(8.9F, -3.8F, 0.6F);

        gunModel[175].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.1F, -0.35F, -0.4F, 0.1F, -0.35F, -0.4F, 0.1F, -0.45F, -0.5F, 0.1F, -0.45F, -0.5F, 0.1F, -0.35F, -0.4F, 0.1F, -0.35F, -0.4F, 0.1F, -0.45F, -0.5F, 0.1F, -0.45F, -0.5F); // Import
        gunModel[175].setRotationPoint(6.2F, -3.3F, 0.6F);

        gunModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.45F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.45F, -0.5F, -0.5F, -0.5F, -0.5F, -0.45F, -0.45F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.45F, -0.5F, -0.5F, -0.5F, -0.5F); // Import
        gunModel[176].setRotationPoint(5.5F, -3.3F, 0.6F);

        gunModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.4F, -0.45F, -0.45F, -0.4F, -0.5F, -0.5F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.35F, -0.4F, -0.45F, -0.45F, -0.4F, -0.5F, -0.5F, -0.5F, -0.4F, -0.45F, -0.5F); // Import
        gunModel[177].setRotationPoint(8.9F, -3.3F, 0.6F);

        gunModel[178].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F); // Import
        gunModel[178].setRotationPoint(6.5F, -4.6F, -1.4F);

        gunModel[179].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.3F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F); // Import
        gunModel[179].setRotationPoint(6.5F, -5.1F, -1.4F);

        gunModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.4F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.2F, -0.4F, -0.5F, -0.7F, -0.2F, -0.5F, -0.6F, -0.1F, -0.4F, -0.2F, -0.4F, -0.4F); // Import
        gunModel[180].setRotationPoint(6.5F, -5.1F, -1.6F);

        gunModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.4F, -0.3F, -0.5F, -0.4F, -0.4F, -0.3F, -0.5F, 0.0F, -0.7F, -0.5F, 0.1F, -0.6F, -0.4F, -0.5F, -0.2F, -0.4F); // Import
        gunModel[181].setRotationPoint(5.8F, -4.6F, -1.6F);

        gunModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.1F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F); // Import
        gunModel[182].setRotationPoint(5.4F, -4.6F, -1.6F);

        gunModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F, -0.3F, 0.0F, -0.4F); // Import
        gunModel[183].setRotationPoint(5.4F, -4.6F, -1.4F);

        gunModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.4F, -0.5F, -0.4F, 0.0F, -0.1F, -0.4F, 0.0F, -0.1F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F); // Import
        gunModel[184].setRotationPoint(5.7F, -4.6F, -1.4F);

        gunModel[185].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.2F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F); // Import
        gunModel[185].setRotationPoint(6.5F, -4.1F, -1.4F);

        gunModel[186].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.1F, -0.45F, -0.5F, 0.1F, -0.45F, -0.5F, 0.1F, -0.35F, -0.4F, 0.1F, -0.35F, -0.4F, 0.1F, -0.45F, -0.5F, 0.1F, -0.45F, -0.5F, 0.1F, -0.35F, -0.4F, 0.1F, -0.35F, -0.4F); // Import
        gunModel[186].setRotationPoint(6.2F, -3.8F, -1.6F);

        gunModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.35F, -0.4F, -0.45F, -0.45F, -0.4F, -0.5F, -0.5F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.35F, -0.4F, -0.45F, -0.45F, -0.4F); // Import
        gunModel[187].setRotationPoint(5.5F, -3.8F, -1.6F);

        gunModel[188].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.2F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.7F, -0.4F, -0.4F, -0.7F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Import
        gunModel[188].setRotationPoint(5.5F, -3F, -1.4F);

        gunModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.35F, -0.4F, -0.45F, -0.45F, -0.4F, -0.5F, -0.5F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.35F, -0.4F, -0.45F, -0.45F, -0.4F); // Import
        gunModel[189].setRotationPoint(5.5F, -3.3F, -1.6F);

        gunModel[190].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.1F, -0.45F, -0.5F, 0.1F, -0.45F, -0.5F, 0.1F, -0.35F, -0.4F, 0.1F, -0.35F, -0.4F, 0.1F, -0.45F, -0.5F, 0.1F, -0.45F, -0.5F, 0.1F, -0.35F, -0.4F, 0.1F, -0.35F, -0.4F); // Import
        gunModel[190].setRotationPoint(6.2F, -3.3F, -1.6F);

        gunModel[191].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.2F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F); // Import
        gunModel[191].setRotationPoint(6.5F, -3.6F, -1.4F);

        gunModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.5F, -0.5F, -0.5F, -0.5F, -0.45F, -0.45F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.45F, -0.5F, -0.5F, -0.5F, -0.5F, -0.45F, -0.45F, -0.4F, -0.4F, -0.35F, -0.4F); // Import
        gunModel[192].setRotationPoint(8.9F, -3.8F, -1.6F);

        gunModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.5F, -0.5F, -0.5F, -0.5F, -0.45F, -0.45F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.45F, -0.5F, -0.5F, -0.5F, -0.5F, -0.45F, -0.45F, -0.4F, -0.4F, -0.35F, -0.4F); // Import
        gunModel[193].setRotationPoint(8.9F, -4.3F, -1.6F);

        gunModel[194].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.45F, -0.5F, 0.0F, -0.45F, -0.5F, 0.0F, -0.35F, -0.4F, 0.0F, -0.35F, -0.4F, 0.0F, -0.45F, -0.5F, 0.0F, -0.45F, -0.5F, 0.0F, -0.35F, -0.4F, 0.0F, -0.35F, -0.4F); // Import
        gunModel[194].setRotationPoint(7.3F, -4.3F, -1.6F);

        gunModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.5F, -0.5F, -0.5F, -0.5F, -0.45F, -0.45F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.45F, -0.5F, -0.5F, -0.5F, -0.5F, -0.45F, -0.45F, -0.4F, -0.4F, -0.35F, -0.4F); // Import
        gunModel[195].setRotationPoint(8.9F, -3.3F, -1.6F);

        gunModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.35F, -0.4F, -0.45F, -0.45F, -0.4F, -0.5F, -0.5F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.35F, -0.4F, -0.45F, -0.45F, -0.4F); // Import
        gunModel[196].setRotationPoint(6.7F, -4.3F, -1.6F);

        gunModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.7F, -0.5F, 0.0F, -0.7F, -0.5F, 0.0F, -0.6F, -0.4F, 0.1F, -0.6F, -0.4F, -0.1F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F); // Import
        gunModel[197].setRotationPoint(10.3F, -4.6F, -1.6F);

        gunModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.5F, -0.5F, -0.1F, -0.7F, -0.5F, -0.1F, -0.7F, -0.4F, -0.7F, -0.4F, -0.4F, -0.4F, -0.2F, -0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, -0.4F, -0.3F, -0.3F, -0.4F); // Import
        gunModel[198].setRotationPoint(9.5F, -4.4F, -1.6F);

        gunModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.2F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.5F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.4F, -0.2F, -0.6F, -0.4F); // Import
        gunModel[199].setRotationPoint(9.5F, -3.8F, -1.6F);

        gunModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.1F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.4F, -0.3F, 0.0F, -0.4F, -0.4F, -0.3F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.4F, -0.3F, -0.3F, -0.4F); // Import
        gunModel[200].setRotationPoint(9.4F, -3.4F, -1.6F);

        gunModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.1F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.4F, -0.3F, -0.1F, -0.4F, -0.1F, -0.6F, -0.5F, -0.6F, -0.6F, -0.5F, -0.6F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F); // Import
        gunModel[201].setRotationPoint(9.4F, -2.8F, -1.6F);

        gunModel[202].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.2F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F); // Import
        gunModel[202].setRotationPoint(6.5F, -3.9F, -1.4F);

        gunModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, -0.5F, 0.0F, 0.1F, -0.5F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F); // Import
        gunModel[203].setRotationPoint(5.3F, -5.7F, -0.5F);

        gunModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.15F, -0.425F, -0.1F, -0.15F, -0.425F, -0.1F, -0.15F, -0.425F, -0.1F, -0.15F, -0.425F, -0.1F, -0.78F, -0.275F, -0.1F, -0.78F, -0.275F, -0.1F, -0.78F, -0.275F, -0.1F, -0.78F, -0.275F); // Import
        gunModel[204].setRotationPoint(5.7F, -5.2F, -0.5F);

        gunModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.22F, -0.275F, -0.1F, -0.22F, -0.275F, -0.1F, -0.22F, -0.275F, -0.1F, -0.22F, -0.275F, -0.1F, -0.7F, -0.2F, -0.1F, -0.7F, -0.2F, -0.1F, -0.7F, -0.2F, -0.1F, -0.7F, -0.2F); // Import
        gunModel[205].setRotationPoint(5.7F, -5.2F, -0.5F);

        gunModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.575F, -0.15F, -0.1F, -0.575F, -0.15F, -0.1F, -0.575F, -0.15F, -0.1F, -0.575F, -0.15F); // Import
        gunModel[206].setRotationPoint(5.7F, -5.2F, -0.5F);

        gunModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.425F, -0.15F, -0.1F, -0.425F, -0.15F, -0.1F, -0.425F, -0.15F, -0.1F, -0.425F, -0.15F, -0.1F, -0.425F, -0.15F, -0.1F, -0.425F, -0.15F, -0.1F, -0.425F, -0.15F, -0.1F, -0.425F, -0.15F); // Import
        gunModel[207].setRotationPoint(5.7F, -5.2F, -0.5F);

        gunModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.575F, -0.15F, -0.1F, -0.575F, -0.15F, -0.1F, -0.575F, -0.15F, -0.1F, -0.575F, -0.15F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F); // Import
        gunModel[208].setRotationPoint(5.7F, -5.2F, -0.5F);

        gunModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.7F, -0.2F, -0.1F, -0.7F, -0.2F, -0.1F, -0.7F, -0.2F, -0.1F, -0.7F, -0.2F, -0.1F, -0.22F, -0.275F, -0.1F, -0.22F, -0.275F, -0.1F, -0.22F, -0.275F, -0.1F, -0.22F, -0.275F); // Import
        gunModel[209].setRotationPoint(5.7F, -5.2F, -0.5F);

        gunModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.78F, -0.275F, -0.1F, -0.78F, -0.275F, -0.1F, -0.78F, -0.275F, -0.1F, -0.78F, -0.275F, -0.1F, -0.15F, -0.425F, -0.1F, -0.15F, -0.425F, -0.1F, -0.15F, -0.425F, -0.1F, -0.15F, -0.425F); // Import
        gunModel[210].setRotationPoint(5.7F, -5.2F, -0.5F);

        gunModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F); // Import
        gunModel[211].setRotationPoint(5.5F, -5.5F, -0.5F);

        gunModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.15F, -0.425F, -0.1F, -0.15F, -0.425F, -0.1F, -0.15F, -0.425F, -0.1F, -0.15F, -0.425F, -0.1F, -0.78F, -0.275F, -0.1F, -0.78F, -0.275F, -0.1F, -0.78F, -0.275F, -0.1F, -0.78F, -0.275F); // Import
        gunModel[212].setRotationPoint(5.7F, -5.9F, -1.5F);

        gunModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.22F, -0.275F, -0.1F, -0.22F, -0.275F, -0.1F, -0.22F, -0.275F, -0.1F, -0.22F, -0.275F, -0.1F, -0.7F, -0.2F, -0.1F, -0.7F, -0.2F, -0.1F, -0.7F, -0.2F, -0.1F, -0.7F, -0.2F); // Import
        gunModel[213].setRotationPoint(5.7F, -5.9F, -1.5F);

        gunModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.575F, -0.15F, -0.1F, -0.575F, -0.15F, -0.1F, -0.575F, -0.15F, -0.1F, -0.575F, -0.15F); // Import
        gunModel[214].setRotationPoint(5.7F, -5.9F, -1.5F);

        gunModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.425F, -0.15F, -0.1F, -0.425F, -0.15F, -0.1F, -0.425F, -0.15F, -0.1F, -0.425F, -0.15F, -0.1F, -0.425F, -0.15F, -0.1F, -0.425F, -0.15F, -0.1F, -0.425F, -0.15F, -0.1F, -0.425F, -0.15F); // Import
        gunModel[215].setRotationPoint(5.7F, -5.9F, -1.5F);

        gunModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.575F, -0.15F, -0.1F, -0.575F, -0.15F, -0.1F, -0.575F, -0.15F, -0.1F, -0.575F, -0.15F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F); // Import
        gunModel[216].setRotationPoint(5.7F, -5.9F, -1.5F);

        gunModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.7F, -0.2F, -0.1F, -0.7F, -0.2F, -0.1F, -0.7F, -0.2F, -0.1F, -0.7F, -0.2F, -0.1F, -0.22F, -0.275F, -0.1F, -0.22F, -0.275F, -0.1F, -0.22F, -0.275F, -0.1F, -0.22F, -0.275F); // Import
        gunModel[217].setRotationPoint(5.7F, -5.9F, -1.5F);

        gunModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.78F, -0.275F, -0.1F, -0.78F, -0.275F, -0.1F, -0.78F, -0.275F, -0.1F, -0.78F, -0.275F, -0.1F, -0.15F, -0.425F, -0.1F, -0.15F, -0.425F, -0.1F, -0.15F, -0.425F, -0.1F, -0.15F, -0.425F); // Import
        gunModel[218].setRotationPoint(5.7F, -5.9F, -1.5F);

        gunModel[219].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.45F, -0.35F, 0.0F, -0.45F, -0.35F, 0.0F, -0.45F, -0.35F, 0.0F, -0.45F, -0.35F, 0.0F, -0.45F, -0.35F, 0.0F, -0.45F, -0.35F, 0.0F, -0.45F, -0.35F, 0.0F, -0.45F, -0.35F); // Import
        gunModel[219].setRotationPoint(6.15F, -5.9F, -1.5F);

        gunModel[220].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.45F, -0.45F, 0.0F, -0.45F, -0.45F, 0.0F, -0.45F, -0.45F, 0.0F, -0.45F, -0.45F, 0.0F, -0.45F, -0.35F, 0.0F, -0.45F, -0.35F, 0.0F, -0.45F, -0.35F, 0.0F, -0.45F, -0.35F); // Import
        gunModel[220].setRotationPoint(6.15F, -6F, -1.5F);

        gunModel[221].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.45F, -0.35F, 0.0F, -0.45F, -0.35F, 0.0F, -0.45F, -0.35F, 0.0F, -0.45F, -0.35F, 0.0F, -0.45F, -0.45F, 0.0F, -0.45F, -0.45F, 0.0F, -0.45F, -0.45F, 0.0F, -0.45F, -0.45F); // Import
        gunModel[221].setRotationPoint(6.15F, -5.8F, -1.5F);

        gunModel[222].addShapeBox(0.8F, 0F, 0F, 3, 1, 1, 0F, -0.1F, -0.15F, -0.425F, -0.1F, -0.15F, -0.425F, -0.1F, -0.15F, -0.425F, -0.1F, -0.15F, -0.425F, -0.1F, -0.78F, -0.275F, -0.1F, -0.78F, -0.275F, -0.1F, -0.78F, -0.275F, -0.1F, -0.78F, -0.275F); // Import
        gunModel[222].setRotationPoint(4.5F, -7.8F, -1.3F);
        gunModel[222].rotateAngleX = -0.3490658F;

        gunModel[223].addShapeBox(0.8F, 0F, 0F, 3, 1, 1, 0F, -0.1F, -0.22F, -0.275F, -0.1F, -0.22F, -0.275F, -0.1F, -0.22F, -0.275F, -0.1F, -0.22F, -0.275F, -0.1F, -0.7F, -0.2F, -0.1F, -0.7F, -0.2F, -0.1F, -0.7F, -0.2F, -0.1F, -0.7F, -0.2F); // Import
        gunModel[223].setRotationPoint(4.5F, -7.8F, -1.3F);
        gunModel[223].rotateAngleX = -0.3490658F;

        gunModel[224].addShapeBox(0.8F, 0F, 0F, 3, 1, 1, 0F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.575F, -0.15F, -0.1F, -0.575F, -0.15F, -0.1F, -0.575F, -0.15F, -0.1F, -0.575F, -0.15F); // Import
        gunModel[224].setRotationPoint(4.5F, -7.8F, -1.3F);
        gunModel[224].rotateAngleX = -0.3490658F;

        gunModel[225].addShapeBox(0.8F, 0F, 0F, 3, 1, 1, 0F, -0.1F, -0.425F, -0.15F, -0.1F, -0.425F, -0.15F, -0.1F, -0.425F, -0.15F, -0.1F, -0.425F, -0.15F, -0.1F, -0.425F, -0.15F, -0.1F, -0.425F, -0.15F, -0.1F, -0.425F, -0.15F, -0.1F, -0.425F, -0.15F); // Import
        gunModel[225].setRotationPoint(4.5F, -7.8F, -1.3F);
        gunModel[225].rotateAngleX = -0.3490658F;

        gunModel[226].addShapeBox(0.8F, 0F, 0F, 3, 1, 1, 0F, -0.1F, -0.575F, -0.15F, -0.1F, -0.575F, -0.15F, -0.1F, -0.575F, -0.15F, -0.1F, -0.575F, -0.15F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F); // Import
        gunModel[226].setRotationPoint(4.5F, -7.8F, -1.3F);
        gunModel[226].rotateAngleX = -0.3490658F;

        gunModel[227].addShapeBox(0.8F, 0F, 0F, 3, 1, 1, 0F, -0.1F, -0.7F, -0.2F, -0.1F, -0.7F, -0.2F, -0.1F, -0.7F, -0.2F, -0.1F, -0.7F, -0.2F, -0.1F, -0.22F, -0.275F, -0.1F, -0.22F, -0.275F, -0.1F, -0.22F, -0.275F, -0.1F, -0.22F, -0.275F); // Import
        gunModel[227].setRotationPoint(4.5F, -7.8F, -1.3F);
        gunModel[227].rotateAngleX = -0.3490658F;

        gunModel[228].addShapeBox(0.8F, 0F, 0F, 3, 1, 1, 0F, -0.1F, -0.78F, -0.275F, -0.1F, -0.78F, -0.275F, -0.1F, -0.78F, -0.275F, -0.1F, -0.78F, -0.275F, -0.1F, -0.15F, -0.425F, -0.1F, -0.15F, -0.425F, -0.1F, -0.15F, -0.425F, -0.1F, -0.15F, -0.425F); // Import
        gunModel[228].setRotationPoint(4.5F, -7.8F, -1.3F);
        gunModel[228].rotateAngleX = -0.3490658F;

        gunModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.3F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.3F, 0.0F, 0.2F, 0.0F, -0.7F, -0.1F, 0.0F, -0.7F, -0.1F, 0.0F, -0.7F, -0.1F, 0.0F, -0.7F, -0.1F); // Import
        gunModel[229].setRotationPoint(11.3F, -3.3F, -0.5F);

        gunModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.3F, -0.8F, -0.4F, 0.3F, -0.8F, -0.4F, 0.3F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F, -0.8F, -0.4F, 0.3F, -0.8F, -0.4F, 0.3F, 0.0F, -0.3F, 0.3F); // Import
        gunModel[230].setRotationPoint(10.3F, -3.5F, -0.5F);

        gunModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0.0F, 0.3F, -0.6F, -0.2F, 0.3F, -0.6F, -0.2F, 0.3F, -0.3F, 0.0F, 0.3F, 0.0F, -0.7F, 0.3F, -0.8F, -0.6F, 0.3F, -0.8F, -0.6F, 0.3F, 0.0F, -0.7F, 0.3F); // Import
        gunModel[231].setRotationPoint(10.3F, -3.5F, -0.5F);

        gunModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0.0F, 0.3F, -0.3F, 0.0F, 0.3F, -0.3F, 0.0F, 0.3F, -0.3F, 0.0F, 0.3F, -0.4F, -0.8F, 0.3F, -0.4F, -0.8F, 0.3F, -0.4F, -0.8F, 0.3F, -0.4F, -0.8F, 0.3F); // Import
        gunModel[232].setRotationPoint(10.3F, -3.5F, -0.5F);

        gunModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.2F, 0.3F, -0.3F, 0.0F, 0.3F, -0.3F, 0.0F, 0.3F, -0.6F, -0.2F, 0.3F, -0.8F, -0.6F, 0.3F, 0.0F, -0.7F, 0.3F, 0.0F, -0.7F, 0.3F, -0.8F, -0.6F, 0.3F); // Import
        gunModel[233].setRotationPoint(10.3F, -3.5F, -0.5F);

        gunModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.4F, 0.3F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F, -0.8F, -0.4F, 0.3F, -0.8F, -0.4F, 0.3F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F, -0.8F, -0.4F, 0.3F); // Import
        gunModel[234].setRotationPoint(10.3F, -3.5F, -0.5F);

        gunModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.3F, -0.4F, -0.8F, 0.3F, -0.4F, -0.8F, 0.3F, -0.4F, -0.8F, 0.3F, -0.3F, 0.0F, 0.3F, -0.3F, 0.0F, 0.3F, -0.3F, 0.0F, 0.3F, -0.3F, 0.0F, 0.3F); // Import
        gunModel[235].setRotationPoint(10.3F, -3.5F, -0.5F);

        gunModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.7F, 0.3F, -0.8F, -0.6F, 0.3F, -0.8F, -0.6F, 0.3F, 0.0F, -0.7F, 0.3F, -0.3F, 0.0F, 0.3F, -0.6F, -0.2F, 0.3F, -0.6F, -0.2F, 0.3F, -0.3F, 0.0F, 0.3F); // Import
        gunModel[236].setRotationPoint(10.3F, -3.5F, -0.5F);

        gunModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.6F, 0.3F, 0.0F, -0.7F, 0.3F, 0.0F, -0.7F, 0.3F, -0.8F, -0.6F, 0.3F, -0.6F, -0.2F, 0.3F, -0.3F, 0.0F, 0.3F, -0.3F, 0.0F, 0.3F, -0.6F, -0.2F, 0.3F); // Import
        gunModel[237].setRotationPoint(10.3F, -3.5F, -0.5F);

        gunModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.3F, 0.0F, -0.1F, -0.3F, 0.0F, -0.1F, -0.3F, 0.0F, -0.1F, -0.3F, 0.0F, -0.1F, -0.3F, 0.0F, -0.1F, -0.3F, 0.0F, -0.1F, -0.3F, 0.0F, -0.1F, -0.3F, 0.0F); // Import
        gunModel[238].setRotationPoint(12.3F, -4.2F, -0.5F);

        gunModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, 0.0F, -0.3F, -0.1F, 0.0F, -0.3F, -0.1F, 0.0F, -0.3F, -0.1F, 0.0F, -0.3F, -0.1F, -0.7F, 0.0F, -0.1F, -0.7F, 0.0F, -0.1F, -0.7F, 0.0F, -0.1F, -0.7F, 0.0F); // Import
        gunModel[239].setRotationPoint(12.3F, -4.2F, -0.5F);

        gunModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.7F, 0.0F, -0.1F, -0.7F, 0.0F, -0.1F, -0.7F, 0.0F, -0.1F, -0.7F, 0.0F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F); // Import
        gunModel[240].setRotationPoint(12.3F, -4.2F, -0.5F);

        gunModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.3F, -0.25F, 0.4F, 0.0F, -0.25F, 0.4F, 0.0F, -0.25F, 0.4F, 0.3F, -0.25F, 0.4F, 0.2F, -0.3F, 0.4F, 0.0F, -0.3F, 0.4F, 0.0F, -0.3F, 0.4F, 0.2F, -0.3F, 0.4F); // Import
        gunModel[241].setRotationPoint(-3.7F, -5.6F, -0.5F);

        gunModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.35F, -0.35F, 0.2F, 0.0F, -0.35F, 0.2F, 0.0F, -0.35F, 0.2F, 0.35F, -0.35F, 0.2F, 0.3F, -0.45F, 0.4F, 0.0F, -0.45F, 0.4F, 0.0F, -0.45F, 0.4F, 0.3F, -0.45F, 0.4F); // Import
        gunModel[242].setRotationPoint(-3.7F, -5.9F, -0.5F);

        gunModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.1F, 0.5F, 0.0F, -0.1F, 0.5F, 0.0F, -0.1F, 0.5F, 0.2F, -0.1F, 0.5F, 0.0F, -0.1F, 0.5F, 0.0F, -0.1F, 0.5F, 0.0F, -0.1F, 0.5F, 0.0F, -0.1F, 0.5F); // Import
        gunModel[243].setRotationPoint(-3.7F, -5F, -0.5F);

        gunModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.6F, 0.3F, 0.0F, -0.6F, 0.3F, 0.0F, -0.6F, 0.3F, -0.2F, -0.6F, 0.3F, -0.35F, 0.2F, 0.3F, 0.0F, 0.2F, 0.3F, 0.0F, 0.2F, 0.3F, -0.35F, 0.2F, 0.3F); // Import
        gunModel[244].setRotationPoint(-3.7F, -3.9F, -0.5F);

        gunModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.2F, 0.4F, 0.0F, 0.2F, 0.4F, 0.0F, 0.2F, 0.4F, 0.0F, 0.2F, 0.4F, -0.2F, -0.4F, 0.4F, 0.0F, -0.4F, 0.4F, 0.0F, -0.4F, 0.4F, -0.2F, -0.4F, 0.4F); // Import
        gunModel[245].setRotationPoint(-3.7F, -3.9F, -0.5F);

        gunModel[246].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, 0.2F); // Import
        gunModel[246].setRotationPoint(-4.3F, -5.6F, -0.5F);

        gunModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.4F, -0.55F, 0.2F, -0.4F, -0.55F, 0.2F, -0.4F, -0.55F, 0.2F, -0.4F, -0.55F, 0.2F); // Import
        gunModel[247].setRotationPoint(0.3F, -3.6F, -0.5F);

        gunModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.2F, -0.4F, -0.45F, 0.2F, -0.4F, -0.45F, 0.2F, -0.4F, -0.45F, 0.2F, -0.4F, -0.45F, 0.2F, -0.4F, -0.45F, 0.2F, -0.4F, -0.45F, 0.2F, -0.4F, -0.45F, 0.2F); // Import
        gunModel[248].setRotationPoint(0.3F, -3.6F, -0.5F);

        gunModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, 0.2F, -0.4F, -0.55F, 0.2F, -0.4F, -0.55F, 0.2F, -0.4F, -0.55F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F); // Import
        gunModel[249].setRotationPoint(0.3F, -3.6F, -0.5F);

        gunModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.4F, 0.3F, -0.45F, -0.4F, 0.3F, -0.45F, -0.4F, 0.3F, -0.45F, -0.4F, 0.3F, -0.4F, -0.55F, 0.3F, -0.4F, -0.55F, 0.3F, -0.4F, -0.55F, 0.3F, -0.4F, -0.55F, 0.3F); // Import
        gunModel[250].setRotationPoint(-2.7F, -4.3F, -0.5F);

        gunModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.3F, -0.4F, -0.45F, 0.3F, -0.4F, -0.45F, 0.3F, -0.4F, -0.45F, 0.3F, -0.4F, -0.45F, 0.3F, -0.4F, -0.45F, 0.3F, -0.4F, -0.45F, 0.3F, -0.4F, -0.45F, 0.3F); // Import
        gunModel[251].setRotationPoint(-2.7F, -4.3F, -0.5F);

        gunModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, 0.3F, -0.4F, -0.55F, 0.3F, -0.4F, -0.55F, 0.3F, -0.4F, -0.55F, 0.3F, -0.45F, -0.4F, 0.3F, -0.45F, -0.4F, 0.3F, -0.45F, -0.4F, 0.3F, -0.45F, -0.4F, 0.3F); // Import
        gunModel[252].setRotationPoint(-2.7F, -4.3F, -0.5F);

        gunModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, 0.4F, -0.4F, -0.3F, 0.4F, -0.4F, -0.3F, 0.4F, -0.4F, -0.3F, 0.4F, -0.3F, -0.6F, 0.4F, -0.3F, -0.6F, 0.4F, -0.3F, -0.6F, 0.4F, -0.3F, -0.6F, 0.4F); // Import
        gunModel[253].setRotationPoint(-3.5F, -3.5F, -0.5F);

        gunModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, 0.4F, -0.3F, -0.4F, 0.4F, -0.3F, -0.4F, 0.4F, -0.3F, -0.4F, 0.4F, -0.3F, -0.4F, 0.4F, -0.3F, -0.4F, 0.4F, -0.3F, -0.4F, 0.4F, -0.3F, -0.4F, 0.4F); // Import
        gunModel[254].setRotationPoint(-3.5F, -3.5F, -0.5F);

        gunModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.6F, 0.4F, -0.3F, -0.6F, 0.4F, -0.3F, -0.6F, 0.4F, -0.3F, -0.6F, 0.4F, -0.4F, -0.3F, 0.4F, -0.4F, -0.3F, 0.4F, -0.4F, -0.3F, 0.4F, -0.4F, -0.3F, 0.4F); // Import
        gunModel[255].setRotationPoint(-3.5F, -3.5F, -0.5F);

        gunModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.6F, 0.6F, -0.3F, -0.6F, 0.6F, -0.3F, -0.6F, 0.6F, -0.3F, -0.6F, 0.6F, -0.4F, -0.3F, 0.6F, -0.4F, -0.3F, 0.6F, -0.4F, -0.3F, 0.6F, -0.4F, -0.3F, 0.6F); // Import
        gunModel[256].setRotationPoint(-4F, -5.1F, -0.5F);

        gunModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, 0.6F, -0.4F, -0.3F, 0.6F, -0.4F, -0.3F, 0.6F, -0.4F, -0.3F, 0.6F, -0.3F, -0.6F, 0.6F, -0.3F, -0.6F, 0.6F, -0.3F, -0.6F, 0.6F, -0.3F, -0.6F, 0.6F); // Import
        gunModel[257].setRotationPoint(-4F, -5.1F, -0.5F);

        gunModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0.6F); // Import
        gunModel[258].setRotationPoint(-4F, -5.1F, -0.5F);

        gunModel[259].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.3F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.7F, -0.2F, -1.1F, 0.0F, -0.2F, -1.1F, 0.0F, -0.2F, 0.3F, 0.7F, -0.2F, 0.3F); // Import
        gunModel[259].setRotationPoint(5.3F, -4.9F, -0.5F);

        gunModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, 0.3F, -0.4F, 0.0F, 0.3F, -0.4F, -0.7F, -0.9F, -0.4F, -0.6F, -0.9F, -0.4F, -0.6F, 0.3F, -0.4F, -0.7F, 0.3F); // Import
        gunModel[260].setRotationPoint(4.4F, -4.9F, -0.4F);

        gunModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, 0.3F, -0.4F, 0.0F, 0.3F, -0.4F, 0.0F, -0.9F, -0.4F, -0.1F, -0.9F, -0.4F, -0.1F, 0.3F, -0.4F, 0.0F, 0.3F); // Import
        gunModel[261].setRotationPoint(1.7F, -5.5F, -0.4F);

        gunModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, -0.9F, -0.4F, -0.2F, -0.9F, -0.4F, -0.2F, 0.3F, -0.4F, -0.3F, 0.3F, -0.8F, -0.3F, -0.9F, -0.1F, -0.5F, -0.9F, -0.1F, -0.5F, 0.3F, -0.8F, -0.3F, 0.3F); // Import
        gunModel[262].setRotationPoint(1.7F, -4.8F, -0.4F);

        gunModel[263].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.4F, -0.9F, -0.1F, -0.4F, -0.9F, -0.1F, -0.4F, 0.3F, 0.0F, -0.4F, 0.3F, 0.1F, -0.4F, -0.9F, 0.0F, -0.4F, -0.9F, 0.0F, -0.4F, 0.3F, 0.1F, -0.4F, 0.3F); // Import
        gunModel[263].setRotationPoint(2.6F, -4.7F, -0.4F);

        gunModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.2F, -0.9F, -0.4F, -0.3F, -0.9F, -0.4F, -0.3F, 0.3F, -0.4F, -0.2F, 0.3F, -0.1F, -0.5F, -0.9F, -0.8F, -0.3F, -0.9F, -0.8F, -0.3F, 0.3F, -0.1F, -0.5F, 0.3F); // Import
        gunModel[264].setRotationPoint(4.4F, -4.8F, -0.4F);

        gunModel[265].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F); // Import
        gunModel[265].setRotationPoint(2.6F, -5.9F, 0.2F);

        gunModel[266].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F); // Import
        gunModel[266].setRotationPoint(2.6F, -6.1F, 0.2F);

        gunModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, 0.4F, -0.3F, -0.4F, 0.4F, -0.3F, -0.4F, 0.4F, -0.3F, -0.4F, 0.4F, -0.3F, -0.4F, 0.4F, -0.3F, -0.4F, 0.4F, -0.3F, -0.4F, 0.4F, -0.3F, -0.4F, 0.4F); // Import
        gunModel[267].setRotationPoint(1F, -5.1F, -0.5F);

        gunModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, 0.4F, -0.4F, -0.3F, 0.4F, -0.4F, -0.3F, 0.4F, -0.4F, -0.3F, 0.4F, -0.3F, -0.6F, 0.4F, -0.3F, -0.6F, 0.4F, -0.3F, -0.6F, 0.4F, -0.3F, -0.6F, 0.4F); // Import
        gunModel[268].setRotationPoint(1F, -5.1F, -0.5F);

        gunModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.6F, 0.4F, -0.3F, -0.6F, 0.4F, -0.3F, -0.6F, 0.4F, -0.3F, -0.6F, 0.4F, -0.4F, -0.3F, 0.4F, -0.4F, -0.3F, 0.4F, -0.4F, -0.3F, 0.4F, -0.4F, -0.3F, 0.4F); // Import
        gunModel[269].setRotationPoint(1F, -5.1F, -0.5F);

        gunModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, 0.4F, -0.3F, -0.4F, 0.4F, -0.3F, -0.4F, 0.4F, -0.3F, -0.4F, 0.4F, -0.3F, -0.4F, 0.4F, -0.3F, -0.4F, 0.4F, -0.3F, -0.4F, 0.4F, -0.3F, -0.4F, 0.4F); // Import
        gunModel[270].setRotationPoint(-1F, -5.1F, -0.5F);

        gunModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, 0.4F, -0.4F, -0.3F, 0.4F, -0.4F, -0.3F, 0.4F, -0.4F, -0.3F, 0.4F, -0.3F, -0.6F, 0.4F, -0.3F, -0.6F, 0.4F, -0.3F, -0.6F, 0.4F, -0.3F, -0.6F, 0.4F); // Import
        gunModel[271].setRotationPoint(-1F, -5.1F, -0.5F);

        gunModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.6F, 0.4F, -0.3F, -0.6F, 0.4F, -0.3F, -0.6F, 0.4F, -0.3F, -0.6F, 0.4F, -0.4F, -0.3F, 0.4F, -0.4F, -0.3F, 0.4F, -0.4F, -0.3F, 0.4F, -0.4F, -0.3F, 0.4F); // Import
        gunModel[272].setRotationPoint(-1F, -5.1F, -0.5F);

        gunModel[273].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F); // Import
        gunModel[273].setRotationPoint(7.85F, -7.2F, -1.5F);

        gunModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.55F, -0.3F, -0.35F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.55F, -0.3F, -0.35F, -0.55F, -0.4F, -0.35F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.55F, -0.4F, -0.35F); // Import
        gunModel[274].setRotationPoint(7.85F, -7.2F, -1.5F);

        gunModel[275].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.35F, -0.3F, -0.45F, -0.55F, -0.3F, -0.35F, -0.55F, -0.3F, -0.35F, -0.35F, -0.3F, -0.45F, -0.35F, -0.4F, -0.45F, -0.55F, -0.4F, -0.35F, -0.55F, -0.4F, -0.35F, -0.35F, -0.4F, -0.45F); // Import
        gunModel[275].setRotationPoint(7.85F, -7.2F, -1.5F);

        gunModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.45F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.35F, -0.4F, -0.6F, -0.35F, -0.4F, -0.6F, -0.35F, -0.45F, -0.45F, -0.35F); // Import
        gunModel[276].setRotationPoint(7.7F, -6F, -1.5F);

        gunModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.45F, -0.35F, -0.4F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.3F, -0.7F, -0.35F, -0.3F, -0.7F, -0.35F, -0.45F, -0.45F, -0.35F); // Import
        gunModel[277].setRotationPoint(7.7F, -5.9F, -1.5F);

        gunModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.45F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.45F, -0.2F, -0.8F, -0.45F, -0.2F, -0.8F, -0.45F, -0.45F, -0.45F, -0.45F); // Import
        gunModel[278].setRotationPoint(7.7F, -5.8F, -1.5F);

        gunModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.45F, -0.45F, -0.2F, -0.8F, -0.45F, -0.2F, -0.8F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.45F, -0.45F, -0.35F); // Import
        gunModel[279].setRotationPoint(7.7F, -7.7F, -1.5F);

        gunModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.45F, -0.35F, -0.4F, -0.6F, -0.35F, -0.4F, -0.6F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.45F, -0.45F, -0.45F); // Import
        gunModel[280].setRotationPoint(7.7F, -7.5F, -1.5F);

        gunModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.45F, -0.35F, -0.3F, -0.7F, -0.35F, -0.3F, -0.7F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.4F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.45F, -0.45F, -0.35F); // Import
        gunModel[281].setRotationPoint(7.7F, -7.6F, -1.5F);

        gunModel[282].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F); // Import
        gunModel[282].setRotationPoint(2.5F, -5.7F, -1.4F);

        gunModel[283].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F); // Import
        gunModel[283].setRotationPoint(2.5F, -5.9F, -1.4F);

        gunModel[284].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F); // Import
        gunModel[284].setRotationPoint(2.5F, -5.5F, -1.4F);

        gunModel[285].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.0F, -0.4F, -1.1F, 0.0F, -0.4F, -1.1F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F, -1.1F, 0.0F, -0.3F, -1.1F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F); // Import
        gunModel[285].setRotationPoint(6.3F, -5.5F, -0.4F);

        gunModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.4F, -0.9F, -0.3F, -0.4F, -0.9F, -0.3F, -0.3F, 0.1F, -0.5F, -0.3F, 0.1F, -0.5F, -0.45F, -1.0F, -0.3F, -0.45F, -1.0F, -0.3F, -0.55F, 0.2F, -0.5F, -0.55F, 0.2F); // Import
        gunModel[286].setRotationPoint(5.8F, -5.8F, -0.4F);

        gunModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.55F, -1.0F, -0.3F, -0.55F, -1.0F, -0.3F, -0.45F, 0.2F, -0.5F, -0.45F, 0.2F, -0.5F, -0.3F, -1.1F, -0.1F, -0.3F, -1.1F, -0.1F, -0.4F, 0.3F, -0.5F, -0.4F, 0.3F); // Import
        gunModel[287].setRotationPoint(5.8F, -5.8F, -0.4F);

        gunModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.25F, -0.8F, -0.1F, -0.25F, -0.8F, -0.1F, -0.15F, 0.0F, -0.5F, -0.15F, 0.0F, -0.5F, -0.6F, -0.9F, -0.3F, -0.6F, -0.9F, -0.3F, -0.7F, 0.1F, -0.5F, -0.7F, 0.1F); // Import
        gunModel[288].setRotationPoint(5.8F, -5.8F, -0.4F);

        gunModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.25F, -0.8F, -0.3F, -0.25F, -0.8F, -0.3F, -0.15F, 0.0F, -0.1F, -0.15F, 0.0F, -0.3F, -0.6F, -0.9F, -0.5F, -0.6F, -0.9F, -0.5F, -0.7F, 0.1F, -0.3F, -0.7F, 0.1F); // Import
        gunModel[289].setRotationPoint(6.8F, -5.8F, -0.4F);

        gunModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.9F, -0.5F, -0.4F, -0.9F, -0.5F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.45F, -1.0F, -0.5F, -0.45F, -1.0F, -0.5F, -0.55F, 0.2F, -0.3F, -0.55F, 0.2F); // Import
        gunModel[290].setRotationPoint(6.8F, -5.8F, -0.4F);

        gunModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.55F, -1.0F, -0.5F, -0.55F, -1.0F, -0.5F, -0.45F, 0.2F, -0.3F, -0.45F, 0.2F, -0.1F, -0.3F, -1.1F, -0.3F, -0.3F, -1.1F, -0.3F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F); // Import
        gunModel[291].setRotationPoint(6.8F, -5.8F, -0.4F);

        gunModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.55F, -1.0F, -0.5F, -0.55F, -1.0F, -0.5F, -0.45F, 0.2F, -0.3F, -0.45F, 0.2F, -0.1F, -0.3F, -1.1F, -0.3F, -0.3F, -1.1F, -0.3F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F); // Import
        gunModel[292].setRotationPoint(7.6F, -5.8F, -0.4F);

        gunModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.9F, -0.5F, -0.4F, -0.9F, -0.5F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.45F, -1.0F, -0.5F, -0.45F, -1.0F, -0.5F, -0.55F, 0.2F, -0.3F, -0.55F, 0.2F); // Import
        gunModel[293].setRotationPoint(7.6F, -5.8F, -0.4F);

        gunModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.25F, -0.8F, -0.3F, -0.25F, -0.8F, -0.3F, -0.15F, 0.0F, -0.1F, -0.15F, 0.0F, -0.3F, -0.6F, -0.9F, -0.5F, -0.6F, -0.9F, -0.5F, -0.7F, 0.1F, -0.3F, -0.7F, 0.1F); // Import
        gunModel[294].setRotationPoint(7.6F, -5.8F, -0.4F);

        gunModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.55F, -1.0F, -0.5F, -0.55F, -1.0F, -0.5F, -0.45F, 0.2F, -0.3F, -0.45F, 0.2F, -0.1F, -0.3F, -1.1F, -0.3F, -0.3F, -1.1F, -0.3F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F); // Import
        gunModel[295].setRotationPoint(9.2F, -5.8F, -0.4F);

        gunModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.9F, -0.5F, -0.4F, -0.9F, -0.5F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.45F, -1.0F, -0.5F, -0.45F, -1.0F, -0.5F, -0.55F, 0.2F, -0.3F, -0.55F, 0.2F); // Import
        gunModel[296].setRotationPoint(9.2F, -5.8F, -0.4F);

        gunModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.25F, -0.8F, -0.3F, -0.25F, -0.8F, -0.3F, -0.15F, 0.0F, -0.1F, -0.15F, 0.0F, -0.3F, -0.6F, -0.9F, -0.5F, -0.6F, -0.9F, -0.5F, -0.7F, 0.1F, -0.3F, -0.7F, 0.1F); // Import
        gunModel[297].setRotationPoint(9.2F, -5.8F, -0.4F);

        gunModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.55F, -1.0F, -0.5F, -0.55F, -1.0F, -0.5F, -0.45F, 0.2F, -0.3F, -0.45F, 0.2F, -0.1F, -0.3F, -1.1F, -0.3F, -0.3F, -1.1F, -0.3F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F); // Import
        gunModel[298].setRotationPoint(8.4F, -5.8F, -0.4F);

        gunModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.9F, -0.5F, -0.4F, -0.9F, -0.5F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.45F, -1.0F, -0.5F, -0.45F, -1.0F, -0.5F, -0.55F, 0.2F, -0.3F, -0.55F, 0.2F); // Import
        gunModel[299].setRotationPoint(8.4F, -5.8F, -0.4F);

        gunModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.25F, -0.8F, -0.3F, -0.25F, -0.8F, -0.3F, -0.15F, 0.0F, -0.1F, -0.15F, 0.0F, -0.3F, -0.6F, -0.9F, -0.5F, -0.6F, -0.9F, -0.5F, -0.7F, 0.1F, -0.3F, -0.7F, 0.1F); // Import
        gunModel[300].setRotationPoint(8.4F, -5.8F, -0.4F);

        gunModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.55F, -1.0F, -0.5F, -0.55F, -1.0F, -0.5F, -0.45F, 0.2F, -0.3F, -0.45F, 0.2F, -0.1F, -0.3F, -1.1F, -0.3F, -0.3F, -1.1F, -0.3F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F); // Import
        gunModel[301].setRotationPoint(10F, -5.8F, -0.4F);

        gunModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.9F, -0.5F, -0.4F, -0.9F, -0.5F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.45F, -1.0F, -0.5F, -0.45F, -1.0F, -0.5F, -0.55F, 0.2F, -0.3F, -0.55F, 0.2F); // Import
        gunModel[302].setRotationPoint(10F, -5.8F, -0.4F);

        gunModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.25F, -0.8F, -0.3F, -0.25F, -0.8F, -0.3F, -0.15F, 0.0F, -0.1F, -0.15F, 0.0F, -0.3F, -0.6F, -0.9F, -0.5F, -0.6F, -0.9F, -0.5F, -0.7F, 0.1F, -0.3F, -0.7F, 0.1F); // Import
        gunModel[303].setRotationPoint(10F, -5.8F, -0.4F);

        gunModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.25F, -0.8F, -0.5F, -0.25F, -0.8F, -0.5F, -0.15F, 0.0F, -0.1F, -0.15F, 0.0F, -0.3F, -0.6F, -0.9F, -0.5F, -0.6F, -0.9F, -0.5F, -0.7F, 0.1F, -0.3F, -0.7F, 0.1F); // Import
        gunModel[304].setRotationPoint(10.8F, -5.8F, -0.4F);

        gunModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.9F, -0.5F, -0.4F, -0.9F, -0.5F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.45F, -1.0F, -0.5F, -0.45F, -1.0F, -0.5F, -0.55F, 0.2F, -0.3F, -0.55F, 0.2F); // Import
        gunModel[305].setRotationPoint(10.8F, -5.8F, -0.4F);

        gunModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.55F, -1.0F, -0.5F, -0.55F, -1.0F, -0.5F, -0.45F, 0.2F, -0.3F, -0.45F, 0.2F, -0.1F, -0.3F, -1.1F, -0.5F, -0.3F, -1.1F, -0.5F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F); // Import
        gunModel[306].setRotationPoint(10.8F, -5.8F, -0.4F);

        gunModel[307].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.0F, -0.2F, -0.65F, 0.0F, -0.2F, -0.65F, 0.0F, -0.05F, -0.2F, 0.0F, -0.05F, -0.2F, 0.0F, -0.75F, -0.8F, 0.0F, -0.75F, -0.8F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F); // Import
        gunModel[307].setRotationPoint(6.3F, -5.8F, -0.4F);

        gunModel[308].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F, 0.0F, -0.4F, -1.1F, 0.0F, -0.4F, -1.1F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F, -1.1F, 0.0F, -0.3F, -1.1F); // Import
        gunModel[308].setRotationPoint(6.3F, -5.5F, -0.6F);

        gunModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.45F, 0.2F, -0.3F, -0.45F, 0.2F, -0.3F, -0.55F, -1.0F, -0.5F, -0.55F, -1.0F, -0.5F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F, -0.1F, -0.3F, -1.1F, -0.5F, -0.3F, -1.1F); // Import
        gunModel[309].setRotationPoint(5.8F, -5.8F, -0.6F);

        gunModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.4F, -0.9F, -0.5F, -0.4F, -0.9F, -0.5F, -0.55F, 0.2F, -0.3F, -0.55F, 0.2F, -0.3F, -0.45F, -1.0F, -0.5F, -0.45F, -1.0F); // Import
        gunModel[310].setRotationPoint(5.8F, -5.8F, -0.6F);

        gunModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.15F, 0.0F, -0.1F, -0.15F, 0.0F, -0.1F, -0.25F, -0.8F, -0.5F, -0.25F, -0.8F, -0.5F, -0.7F, 0.1F, -0.3F, -0.7F, 0.1F, -0.3F, -0.6F, -0.9F, -0.5F, -0.6F, -0.9F); // Import
        gunModel[311].setRotationPoint(5.8F, -5.8F, -0.6F);

        gunModel[312].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.0F, -0.05F, -0.2F, 0.0F, -0.05F, -0.2F, 0.0F, -0.2F, -0.65F, 0.0F, -0.2F, -0.65F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.75F, -0.8F, 0.0F, -0.75F, -0.8F); // Import
        gunModel[312].setRotationPoint(6.3F, -5.8F, -0.6F);

        gunModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.15F, 0.0F, -0.3F, -0.15F, 0.0F, -0.3F, -0.25F, -0.8F, -0.1F, -0.25F, -0.8F, -0.3F, -0.7F, 0.1F, -0.5F, -0.7F, 0.1F, -0.5F, -0.6F, -0.9F, -0.3F, -0.6F, -0.9F); // Import
        gunModel[313].setRotationPoint(6.8F, -5.8F, -0.6F);

        gunModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, 0.1F, -0.5F, -0.3F, 0.1F, -0.5F, -0.4F, -0.9F, -0.3F, -0.4F, -0.9F, -0.3F, -0.55F, 0.2F, -0.5F, -0.55F, 0.2F, -0.5F, -0.45F, -1.0F, -0.3F, -0.45F, -1.0F); // Import
        gunModel[314].setRotationPoint(6.8F, -5.8F, -0.6F);

        gunModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, 0.2F, -0.5F, -0.45F, 0.2F, -0.5F, -0.55F, -1.0F, -0.3F, -0.55F, -1.0F, -0.1F, -0.4F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.3F, -1.1F, -0.1F, -0.3F, -1.1F); // Import
        gunModel[315].setRotationPoint(6.8F, -5.8F, -0.6F);

        gunModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.15F, 0.0F, -0.3F, -0.15F, 0.0F, -0.3F, -0.25F, -0.8F, -0.1F, -0.25F, -0.8F, -0.3F, -0.7F, 0.1F, -0.5F, -0.7F, 0.1F, -0.5F, -0.6F, -0.9F, -0.3F, -0.6F, -0.9F); // Import
        gunModel[316].setRotationPoint(7.6F, -5.8F, -0.6F);

        gunModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, 0.1F, -0.5F, -0.3F, 0.1F, -0.5F, -0.4F, -0.9F, -0.3F, -0.4F, -0.9F, -0.3F, -0.55F, 0.2F, -0.5F, -0.55F, 0.2F, -0.5F, -0.45F, -1.0F, -0.3F, -0.45F, -1.0F); // Import
        gunModel[317].setRotationPoint(7.6F, -5.8F, -0.6F);

        gunModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, 0.2F, -0.5F, -0.45F, 0.2F, -0.5F, -0.55F, -1.0F, -0.3F, -0.55F, -1.0F, -0.1F, -0.4F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.3F, -1.1F, -0.1F, -0.3F, -1.1F); // Import
        gunModel[318].setRotationPoint(7.6F, -5.8F, -0.6F);

        gunModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.15F, 0.0F, -0.3F, -0.15F, 0.0F, -0.3F, -0.25F, -0.8F, -0.1F, -0.25F, -0.8F, -0.3F, -0.7F, 0.1F, -0.5F, -0.7F, 0.1F, -0.5F, -0.6F, -0.9F, -0.3F, -0.6F, -0.9F); // Import
        gunModel[319].setRotationPoint(8.4F, -5.8F, -0.6F);

        gunModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, 0.1F, -0.5F, -0.3F, 0.1F, -0.5F, -0.4F, -0.9F, -0.3F, -0.4F, -0.9F, -0.3F, -0.55F, 0.2F, -0.5F, -0.55F, 0.2F, -0.5F, -0.45F, -1.0F, -0.3F, -0.45F, -1.0F); // Import
        gunModel[320].setRotationPoint(8.4F, -5.8F, -0.6F);

        gunModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, 0.2F, -0.5F, -0.45F, 0.2F, -0.5F, -0.55F, -1.0F, -0.3F, -0.55F, -1.0F, -0.1F, -0.4F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.3F, -1.1F, -0.1F, -0.3F, -1.1F); // Import
        gunModel[321].setRotationPoint(8.4F, -5.8F, -0.6F);

        gunModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.15F, 0.0F, -0.3F, -0.15F, 0.0F, -0.3F, -0.25F, -0.8F, -0.1F, -0.25F, -0.8F, -0.3F, -0.7F, 0.1F, -0.5F, -0.7F, 0.1F, -0.5F, -0.6F, -0.9F, -0.3F, -0.6F, -0.9F); // Import
        gunModel[322].setRotationPoint(9.2F, -5.8F, -0.6F);

        gunModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, 0.1F, -0.5F, -0.3F, 0.1F, -0.5F, -0.4F, -0.9F, -0.3F, -0.4F, -0.9F, -0.3F, -0.55F, 0.2F, -0.5F, -0.55F, 0.2F, -0.5F, -0.45F, -1.0F, -0.3F, -0.45F, -1.0F); // Import
        gunModel[323].setRotationPoint(9.2F, -5.8F, -0.6F);

        gunModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, 0.2F, -0.5F, -0.45F, 0.2F, -0.5F, -0.55F, -1.0F, -0.3F, -0.55F, -1.0F, -0.1F, -0.4F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.3F, -1.1F, -0.1F, -0.3F, -1.1F); // Import
        gunModel[324].setRotationPoint(9.2F, -5.8F, -0.6F);

        gunModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.15F, 0.0F, -0.3F, -0.15F, 0.0F, -0.3F, -0.25F, -0.8F, -0.1F, -0.25F, -0.8F, -0.3F, -0.7F, 0.1F, -0.5F, -0.7F, 0.1F, -0.5F, -0.6F, -0.9F, -0.3F, -0.6F, -0.9F); // Import
        gunModel[325].setRotationPoint(10F, -5.8F, -0.6F);

        gunModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, 0.1F, -0.5F, -0.3F, 0.1F, -0.5F, -0.4F, -0.9F, -0.3F, -0.4F, -0.9F, -0.3F, -0.55F, 0.2F, -0.5F, -0.55F, 0.2F, -0.5F, -0.45F, -1.0F, -0.3F, -0.45F, -1.0F); // Import
        gunModel[326].setRotationPoint(10F, -5.8F, -0.6F);

        gunModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, 0.2F, -0.5F, -0.45F, 0.2F, -0.5F, -0.55F, -1.0F, -0.3F, -0.55F, -1.0F, -0.1F, -0.4F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.3F, -1.1F, -0.1F, -0.3F, -1.1F); // Import
        gunModel[327].setRotationPoint(10F, -5.8F, -0.6F);

        gunModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.15F, 0.0F, -0.5F, -0.15F, 0.0F, -0.5F, -0.25F, -0.8F, -0.1F, -0.25F, -0.8F, -0.3F, -0.7F, 0.1F, -0.5F, -0.7F, 0.1F, -0.5F, -0.6F, -0.9F, -0.3F, -0.6F, -0.9F); // Import
        gunModel[328].setRotationPoint(10.8F, -5.8F, -0.6F);

        gunModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, 0.1F, -0.5F, -0.3F, 0.1F, -0.5F, -0.4F, -0.9F, -0.3F, -0.4F, -0.9F, -0.3F, -0.55F, 0.2F, -0.5F, -0.55F, 0.2F, -0.5F, -0.45F, -1.0F, -0.3F, -0.45F, -1.0F); // Import
        gunModel[329].setRotationPoint(10.8F, -5.8F, -0.6F);

        gunModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, 0.2F, -0.5F, -0.45F, 0.2F, -0.5F, -0.55F, -1.0F, -0.3F, -0.55F, -1.0F, -0.1F, -0.4F, 0.3F, -0.5F, -0.4F, 0.3F, -0.5F, -0.3F, -1.1F, -0.1F, -0.3F, -1.1F); // Import
        gunModel[330].setRotationPoint(10.8F, -5.8F, -0.6F);

        gunModel[331].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.0F, -0.4F, -0.1F, 0.0F, -0.4F, -0.1F, 0.0F, -0.4F, -0.1F, 0.0F, -0.4F, -0.1F, 0.0F, -0.45F, -0.25F, 0.0F, -0.45F, -0.25F, 0.0F, -0.45F, -0.25F, 0.0F, -0.45F, -0.25F); // Import
        gunModel[331].setRotationPoint(6.3F, -6.15F, -0.5F);

        gunModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.8F, -0.1F, 0.4F, -0.8F, -0.1F, 0.4F, -0.8F, -0.1F, 0.2F, -0.8F, -0.1F, 0.2F, 0.0F, -0.1F, 0.4F, 0.0F, -0.1F, 0.4F, 0.0F, -0.1F, 0.2F, 0.0F, -0.1F); // Import
        gunModel[332].setRotationPoint(-3F, -6.7F, -0.5F);

        gunModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.3F, -0.8F, -0.4F, -0.3F, -0.8F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0.1F, -0.3F, -0.8F, 0.1F, -0.3F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F); // Import
        gunModel[333].setRotationPoint(7.3F, -5.4F, 0.9F);

        gunModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.3F, -0.8F, -0.4F, -0.3F, -0.8F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0.1F, -0.3F, -0.8F, 0.1F, -0.3F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F); // Import
        gunModel[334].setRotationPoint(7.7F, -5.4F, 0.9F);

        gunModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.3F, -0.8F, -0.4F, -0.3F, -0.8F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0.1F, -0.3F, -0.8F, 0.1F, -0.3F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F); // Import
        gunModel[335].setRotationPoint(8.1F, -5.4F, 0.9F);

        gunModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.3F, -0.8F, -0.4F, -0.3F, -0.8F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0.1F, -0.3F, -0.8F, 0.1F, -0.3F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F); // Import
        gunModel[336].setRotationPoint(8.5F, -5.4F, 0.9F);

        gunModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.3F, -0.8F, -0.4F, -0.3F, -0.8F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0.1F, -0.3F, -0.8F, 0.1F, -0.3F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F); // Import
        gunModel[337].setRotationPoint(9.3F, -5.4F, 0.9F);

        gunModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.3F, -0.8F, -0.4F, -0.3F, -0.8F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0.1F, -0.3F, -0.8F, 0.1F, -0.3F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F); // Import
        gunModel[338].setRotationPoint(9.7F, -5.4F, 0.9F);

        gunModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.3F, -0.8F, -0.4F, -0.3F, -0.8F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0.1F, -0.3F, -0.8F, 0.1F, -0.3F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F); // Import
        gunModel[339].setRotationPoint(10.1F, -5.4F, 0.9F);

        gunModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.3F, -0.8F, -0.4F, -0.3F, -0.8F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0.1F, -0.3F, -0.8F, 0.1F, -0.3F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F); // Import
        gunModel[340].setRotationPoint(10.5F, -5.4F, 0.9F);

        gunModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.3F, -0.8F, -0.4F, -0.3F, -0.8F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0.1F, -0.3F, -0.8F, 0.1F, -0.3F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F); // Import
        gunModel[341].setRotationPoint(8.9F, -5.4F, 0.9F);

        gunModel[342].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, -0.6F, -0.6F, -0.5F, -0.6F, -0.6F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0.1F, -0.3F, 0F, 0.1F, -0.3F); // Import
        gunModel[342].setRotationPoint(7.3F, -5.4F, 0.5F);

        gunModel[343].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, -0.6F, -0.6F, -0.5F, -0.6F, -0.6F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.3F, 0F, 0F, -0.3F); // Import
        gunModel[343].setRotationPoint(7.3F, -5.4F, 0.4F);

        gunModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[344].setRotationPoint(8.7F, -6.65F, -0.25F);

        gunModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[345].setRotationPoint(9.1F, -6.65F, -0.25F);

        gunModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[346].setRotationPoint(9.5F, -6.65F, -0.25F);

        gunModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[347].setRotationPoint(9.9F, -6.65F, -0.25F);

        gunModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[348].setRotationPoint(10.3F, -6.65F, -0.25F);

        gunModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[349].setRotationPoint(10.7F, -6.65F, -0.25F);

        gunModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[350].setRotationPoint(11.1F, -6.65F, -0.25F);

        gunModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[351].setRotationPoint(6.3F, -6.65F, -0.25F);

        gunModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[352].setRotationPoint(6.7F, -6.65F, -0.25F);

        gunModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[353].setRotationPoint(7.1F, -6.65F, -0.25F);

        gunModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[354].setRotationPoint(7.5F, -6.65F, -0.25F);

        gunModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[355].setRotationPoint(7.9F, -6.65F, -0.25F);

        gunModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.6F, 0.1F, -0.8F, -0.6F, 0.1F, -0.8F, -0.6F, -0.4F, 0.0F, -0.6F, -0.4F, 0.0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F); // Import
        gunModel[356].setRotationPoint(8.3F, -6.65F, -0.25F);

        gunModel[357].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.9F, -0.3F, -0.05F, -0.1F, -0.3F, -0.05F, -0.1F, -0.3F, -0.05F, -0.9F, -0.3F, -0.05F, -0.9F, -0.6F, -0.15F, -0.1F, -0.6F, -0.15F, -0.1F, -0.6F, -0.15F, -0.9F, -0.6F, -0.15F); // Import
        gunModel[357].setRotationPoint(5.4F, -6.25F, -0.5F);

        gunModel[358].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.9F, -0.3F, -0.15F, -0.1F, -0.3F, -0.15F, -0.1F, -0.3F, -0.15F, -0.9F, -0.3F, -0.15F, -0.9F, -0.6F, -0.15F, -0.1F, -0.6F, -0.15F, -0.1F, -0.6F, -0.15F, -0.9F, -0.6F, -0.15F); // Import
        gunModel[358].setRotationPoint(5.4F, -6.15F, -0.5F);
    }

    private void initdefaultBarrelModel_1() {
        defaultBarrelModel[0] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Import
        defaultBarrelModel[1] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Import
        defaultBarrelModel[2] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Import
        defaultBarrelModel[3] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Import
        defaultBarrelModel[4] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Import
        defaultBarrelModel[5] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Import
        defaultBarrelModel[6] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Import
        defaultBarrelModel[7] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Import
        defaultBarrelModel[8] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Import
        defaultBarrelModel[9] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Import
        defaultBarrelModel[10] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Import
        defaultBarrelModel[11] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Import
        defaultBarrelModel[12] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Import

        defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F); // Import
        defaultBarrelModel[0].setRotationPoint(16.8F, -5.2F, -0.5F);

        defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.25F, -0.325F, -0.8F, -0.25F, -0.325F, -0.8F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F, 0.0F, -0.675F, -0.25F, -0.8F, -0.675F, -0.25F, -0.8F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F); // Import
        defaultBarrelModel[1].setRotationPoint(16.8F, -5.2F, -0.5F);

        defaultBarrelModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F); // Import
        defaultBarrelModel[2].setRotationPoint(16.8F, -5.2F, -0.5F);

        defaultBarrelModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F); // Import
        defaultBarrelModel[3].setRotationPoint(16.8F, -5.2F, -0.5F);

        defaultBarrelModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F); // Import
        defaultBarrelModel[4].setRotationPoint(16.8F, -5.2F, -0.5F);

        defaultBarrelModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F); // Import
        defaultBarrelModel[5].setRotationPoint(16.8F, -5.2F, -0.5F);

        defaultBarrelModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.25F, -0.325F, -0.9F, -0.25F, -0.325F, -0.9F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F, 0.0F, -0.675F, -0.25F, -0.9F, -0.675F, -0.25F, -0.9F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F); // Import
        defaultBarrelModel[6].setRotationPoint(17.15F, -5.2F, -0.5F);

        defaultBarrelModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.25F, -0.325F, -0.9F, -0.25F, -0.325F, -0.9F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F, 0.0F, -0.675F, -0.25F, -0.9F, -0.675F, -0.25F, -0.9F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F); // Import
        defaultBarrelModel[7].setRotationPoint(17.4F, -5.2F, -0.5F);

        defaultBarrelModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.05F, -0.25F, -0.325F, -0.8F, -0.25F, -0.325F, -0.8F, -0.25F, -0.325F, -0.05F, -0.25F, -0.325F, -0.05F, -0.675F, -0.25F, -0.8F, -0.675F, -0.25F, -0.8F, -0.675F, -0.25F, -0.05F, -0.675F, -0.25F); // Import
        defaultBarrelModel[8].setRotationPoint(17.6F, -5.2F, -0.5F);

        defaultBarrelModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.675F, -0.25F, -0.8F, -0.675F, -0.25F, -0.8F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F, 0.0F, -0.25F, -0.325F, -0.8F, -0.25F, -0.325F, -0.8F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F); // Import
        defaultBarrelModel[9].setRotationPoint(16.8F, -5.2F, -0.5F);

        defaultBarrelModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.675F, -0.25F, -0.9F, -0.675F, -0.25F, -0.9F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F, 0.0F, -0.25F, -0.325F, -0.9F, -0.25F, -0.325F, -0.9F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F); // Import
        defaultBarrelModel[10].setRotationPoint(17.15F, -5.2F, -0.5F);

        defaultBarrelModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.675F, -0.25F, -0.9F, -0.675F, -0.25F, -0.9F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F, 0.0F, -0.25F, -0.325F, -0.9F, -0.25F, -0.325F, -0.9F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F); // Import
        defaultBarrelModel[11].setRotationPoint(17.4F, -5.2F, -0.5F);

        defaultBarrelModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.05F, -0.675F, -0.25F, -0.8F, -0.675F, -0.25F, -0.8F, -0.675F, -0.25F, -0.05F, -0.675F, -0.25F, -0.05F, -0.25F, -0.325F, -0.8F, -0.25F, -0.325F, -0.8F, -0.25F, -0.325F, -0.05F, -0.25F, -0.325F); // Import
        defaultBarrelModel[12].setRotationPoint(17.6F, -5.2F, -0.5F);
    }

    private void initdefaultScopeModel_1() {
        defaultScopeModel[0] = new ModelRendererTurbo(this, 73, 185, textureX, textureY); // Import
        defaultScopeModel[1] = new ModelRendererTurbo(this, 81, 185, textureX, textureY); // Import
        defaultScopeModel[2] = new ModelRendererTurbo(this, 89, 185, textureX, textureY); // Import
        defaultScopeModel[3] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Import
        defaultScopeModel[4] = new ModelRendererTurbo(this, 105, 185, textureX, textureY); // Import
        defaultScopeModel[5] = new ModelRendererTurbo(this, 113, 185, textureX, textureY); // Import
        defaultScopeModel[6] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Import
        defaultScopeModel[7] = new ModelRendererTurbo(this, 129, 185, textureX, textureY); // Import
        defaultScopeModel[8] = new ModelRendererTurbo(this, 137, 185, textureX, textureY); // Import
        defaultScopeModel[9] = new ModelRendererTurbo(this, 145, 185, textureX, textureY); // Import
        defaultScopeModel[10] = new ModelRendererTurbo(this, 153, 185, textureX, textureY); // Import
        defaultScopeModel[11] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Import
        defaultScopeModel[12] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Import
        defaultScopeModel[13] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Import
        defaultScopeModel[14] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Import
        defaultScopeModel[15] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Import
        defaultScopeModel[16] = new ModelRendererTurbo(this, 201, 185, textureX, textureY); // Import
        defaultScopeModel[17] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Import
        defaultScopeModel[18] = new ModelRendererTurbo(this, 217, 185, textureX, textureY); // Import
        defaultScopeModel[19] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Import
        defaultScopeModel[20] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Import
        defaultScopeModel[21] = new ModelRendererTurbo(this, 249, 185, textureX, textureY); // Import
        defaultScopeModel[22] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Import
        defaultScopeModel[23] = new ModelRendererTurbo(this, 9, 193, textureX, textureY); // Import
        defaultScopeModel[24] = new ModelRendererTurbo(this, 17, 193, textureX, textureY); // Import
        defaultScopeModel[25] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Import
        defaultScopeModel[26] = new ModelRendererTurbo(this, 33, 193, textureX, textureY); // Import
        defaultScopeModel[27] = new ModelRendererTurbo(this, 41, 193, textureX, textureY); // Import
        defaultScopeModel[28] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Import

        defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.6F, -0.9F, 0.4F, -0.7F, -0.9F, 0.4F, -0.7F, 0.0F, -0.8F, -0.6F, 0.0F, -0.6F, -0.2F, -0.9F, 0.4F, 0.0F, -0.9F, 0.4F, 0.0F, 0.0F, -0.6F, -0.2F, 0.0F); // Import
        defaultScopeModel[0].setRotationPoint(-3F, -6.7F, -0.5F);

        defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, -0.9F, -0.4F, -0.8F, -0.9F, -0.4F, -0.8F, 0.0F, -0.4F, -0.8F, 0.0F, 0.0F, 0.0F, -0.9F, 0.4F, 0.0F, -0.9F, 0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[1].setRotationPoint(-3F, -6.7F, -0.5F);

        defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.7F, -0.9F, -0.8F, -0.6F, -0.9F, -0.8F, -0.6F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, -0.9F, -0.6F, -0.2F, -0.9F, -0.6F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[2].setRotationPoint(-3F, -6.7F, -0.5F);

        defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, -0.9F, -0.8F, -0.4F, -0.9F, -0.8F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3F, -0.9F, -0.8F, -0.4F, -0.9F, -0.8F, -0.4F, 0.0F, 0.0F, -0.3F, 0.0F); // Import
        defaultScopeModel[3].setRotationPoint(-3F, -6.7F, -0.5F);

        defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0.0F, -0.9F, -0.6F, -0.2F, -0.9F, -0.6F, -0.2F, 0.0F, -0.3F, 0.0F, 0.0F, 0.0F, -1.0F, -0.9F, -0.8F, -0.6F, -0.9F, -0.8F, -0.6F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        defaultScopeModel[4].setRotationPoint(-3F, -6.7F, -0.5F);

        defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.4F, -0.8F, -0.9F, -0.4F, -0.8F, -0.9F, -0.4F, -0.8F, 0.0F, -0.4F, -0.8F, 0.0F); // Import
        defaultScopeModel[5].setRotationPoint(-3F, -6.7F, -0.5F);

        defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.2F, -0.9F, -0.3F, 0.0F, -0.9F, -0.3F, 0.0F, 0.0F, -0.6F, -0.2F, 0.0F, -0.8F, -0.6F, -0.9F, 0.4F, -0.7F, -0.9F, 0.4F, -0.7F, 0.0F, -0.8F, -0.6F, 0.0F); // Import
        defaultScopeModel[6].setRotationPoint(-3F, -6.7F, -0.5F);

        defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.4F, -0.9F, 0.4F, -0.3F, -0.9F, 0.4F, -0.3F, 0.0F, -0.8F, -0.4F, 0.0F, -0.8F, -0.4F, -0.9F, 0.4F, -0.3F, -0.9F, 0.4F, -0.3F, 0.0F, -0.8F, -0.4F, 0.0F); // Import
        defaultScopeModel[7].setRotationPoint(-3F, -6.7F, -0.5F);

        defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.2F, -0.9F, -0.8F, -0.05F, -0.9F, -0.8F, -0.05F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, -0.9F, -0.8F, 0.0F, -0.9F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[8].setRotationPoint(-3.2F, -6.75F, -0.5F);

        defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.1F, -0.4F, -0.9F, -0.2F, -0.4F, -0.9F, -0.2F, -0.4F, 0.0F, -0.1F, -0.4F, 0.0F); // Import
        defaultScopeModel[9].setRotationPoint(-3.1F, -7.3F, -0.5F);

        defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.9F, -0.3F, -0.5F, -0.9F, -0.1F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, -0.9F, -0.1F, -0.4F, -0.9F); // Import
        defaultScopeModel[10].setRotationPoint(-3.1F, -7.3F, -0.5F);

        defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.9F, -0.3F, 0.0F, -0.9F, -0.4F, -0.8F, 0.0F, -0.4F, -0.8F, 0.0F, -0.4F, -0.8F, -0.9F, -0.4F, -0.8F, -0.9F); // Import
        defaultScopeModel[11].setRotationPoint(-3F, -6.7F, -0.5F);

        defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.2F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.9F, -0.6F, -0.2F, -0.9F, -0.8F, -0.6F, 0.0F, 0.4F, -0.7F, 0.0F, 0.4F, -0.7F, -0.9F, -0.8F, -0.6F, -0.9F); // Import
        defaultScopeModel[12].setRotationPoint(-3F, -6.7F, -0.5F);

        defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.4F, 0.0F, 0.4F, -0.3F, 0.0F, 0.4F, -0.3F, -0.9F, -0.8F, -0.4F, -0.9F, -0.8F, -0.4F, 0.0F, 0.4F, -0.3F, 0.0F, 0.4F, -0.3F, -0.9F, -0.8F, -0.4F, -0.9F); // Import
        defaultScopeModel[13].setRotationPoint(-3F, -6.7F, -0.5F);

        defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.6F, 0.0F, 0.4F, -0.7F, 0.0F, 0.4F, -0.7F, -0.9F, -0.8F, -0.6F, -0.9F, -0.6F, -0.2F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, -0.9F, -0.6F, -0.2F, -0.9F); // Import
        defaultScopeModel[14].setRotationPoint(-3F, -6.7F, -0.5F);

        defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.0F, -0.4F, -0.8F, 0.0F, -0.4F, -0.8F, -0.9F, -0.4F, -0.8F, -0.9F, 0.0F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F); // Import
        defaultScopeModel[15].setRotationPoint(-3F, -6.7F, -0.5F);

        defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.7F, 0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F, -0.9F, 0.0F, -0.7F, -0.9F, 0.0F, 0.0F, 0.0F, -0.6F, -0.2F, 0.0F, -0.6F, -0.2F, -0.9F, 0.0F, 0.0F, -0.9F); // Import
        defaultScopeModel[16].setRotationPoint(-3F, -6.7F, -0.5F);

        defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -0.8F, -0.4F, 0.0F, -0.8F, -0.4F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, -0.3F, 0.0F, -0.8F, -0.4F, 0.0F, -0.8F, -0.4F, -0.9F, 0.0F, -0.3F, -0.9F); // Import
        defaultScopeModel[17].setRotationPoint(-3F, -6.7F, -0.5F);

        defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0.0F, 0.0F, -0.6F, -0.2F, 0.0F, -0.6F, -0.2F, -0.9F, -0.3F, 0.0F, -0.9F, 0.0F, -1.0F, 0.0F, -0.8F, -0.6F, 0.0F, -0.8F, -0.6F, -0.9F, 0.0F, -1.0F, -0.9F); // Import
        defaultScopeModel[18].setRotationPoint(-3F, -6.7F, -0.5F);

        defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.2F, 0.0F, -0.8F, -0.05F, 0.0F, -0.8F, -0.05F, -0.9F, 0.0F, -0.2F, -0.9F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F); // Import
        defaultScopeModel[19].setRotationPoint(-3.2F, -6.75F, -0.5F);

        defaultScopeModel[20].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F, -0.4F, 0.25F, -0.1F, -0.4F, 0.25F, -0.1F, -0.4F, 0.25F, -0.5F, -0.4F, 0.25F, -0.5F, -0.4F, -0.8F, -0.1F, -0.4F, -0.8F, -0.1F, -0.4F, -0.8F, -0.5F, -0.4F, -0.8F, -0.5F); // Import
        defaultScopeModel[20].setRotationPoint(-3.5F, -6.1F, -1.3F);

        defaultScopeModel[21].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F, -0.8F, -0.4F, 0.3F, -0.8F, -0.4F, -1.25F, -0.1F, -0.4F, -1.25F, -0.1F, -0.4F, -1.25F, -0.75F, -0.4F, -1.25F, -0.75F); // Import
        defaultScopeModel[21].setRotationPoint(-3.5F, -6.1F, -1.3F);

        defaultScopeModel[22].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F, -0.4F, 0.3F, -0.8F, -0.4F, 0.3F, -0.8F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F, -0.1F, -0.4F, -1.25F, -0.75F, -0.4F, -1.25F, -0.75F, -0.4F, -1.25F, -0.1F, -0.4F, -1.25F, -0.1F); // Import
        defaultScopeModel[22].setRotationPoint(-3.5F, -6.1F, -1.7F);

        defaultScopeModel[23].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F, -0.4F, 0.3F, -0.8F, -0.4F, 0.3F, -0.8F, -0.4F, 0.35F, -0.1F, -0.4F, 0.35F, -0.1F, -0.4F, -1.2F, -0.8F, -0.4F, -1.2F, -0.8F, -0.4F, -1.2F, -0.1F, -0.4F, -1.2F, -0.1F); // Import
        defaultScopeModel[23].setRotationPoint(-3.5F, -6.2F, -1.7F);

        defaultScopeModel[24].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F, -0.4F, 0.35F, -0.85F, -0.4F, 0.35F, -0.85F, -0.4F, 0.3F, -0.05F, -0.4F, 0.3F, -0.05F, -0.4F, -1.2F, -0.85F, -0.4F, -1.2F, -0.85F, -0.4F, -1.2F, -0.05F, -0.4F, -1.2F, -0.05F); // Import
        defaultScopeModel[24].setRotationPoint(-3.5F, -6.2F, -2.05F);

        defaultScopeModel[25].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F, -0.4F, -1.25F, -0.75F, -0.4F, -1.25F, -0.75F, -0.4F, -1.15F, -0.2F, -0.4F, -1.15F, -0.2F, -0.4F, 0.3F, -0.8F, -0.4F, 0.3F, -0.8F, -0.4F, 0.25F, -0.1F, -0.4F, 0.25F, -0.1F); // Import
        defaultScopeModel[25].setRotationPoint(-3.5F, -7.8F, -1.7F);

        defaultScopeModel[26].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F); // Import
        defaultScopeModel[26].setRotationPoint(-3.5F, -7.1F, -1.5F);

        defaultScopeModel[27].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F, -0.4F, -1.15F, -0.2F, -0.4F, -1.15F, -0.2F, -0.4F, -1.25F, -0.75F, -0.4F, -1.25F, -0.75F, -0.4F, 0.25F, -0.1F, -0.4F, 0.25F, -0.1F, -0.4F, 0.3F, -0.8F, -0.4F, 0.3F, -0.8F); // Import
        defaultScopeModel[27].setRotationPoint(-3.5F, -7.8F, -1.3F);

        defaultScopeModel[28].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F, -0.35F, 0.05F, -0.15F, -0.35F, 0.05F, -0.15F, -0.35F, 0.05F, -0.15F, -0.35F, 0.05F, -0.15F, -0.35F, -0.8F, -0.15F, -0.1F, -0.8F, -0.15F, -0.1F, -0.8F, -0.15F, -0.35F, -0.8F, -0.15F); // Import
        defaultScopeModel[28].setRotationPoint(-3.5F, -6.1F, -1.5F);
    }

    private void initdefaultStockModel_1() {
        defaultStockModel[0] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Import
        defaultStockModel[1] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Import
        defaultStockModel[2] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Import
        defaultStockModel[3] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Import
        defaultStockModel[4] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Import
        defaultStockModel[5] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Import
        defaultStockModel[6] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Import
        defaultStockModel[7] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Import
        defaultStockModel[8] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Import
        defaultStockModel[9] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Import
        defaultStockModel[10] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Import
        defaultStockModel[11] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import
        defaultStockModel[12] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Import
        defaultStockModel[13] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Import
        defaultStockModel[14] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Import
        defaultStockModel[15] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Import
        defaultStockModel[16] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Import
        defaultStockModel[17] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Import
        defaultStockModel[18] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Import
        defaultStockModel[19] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Import
        defaultStockModel[20] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Import
        defaultStockModel[21] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import
        defaultStockModel[22] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Import
        defaultStockModel[23] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Import
        defaultStockModel[24] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Import
        defaultStockModel[25] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Import
        defaultStockModel[26] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Import
        defaultStockModel[27] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Import
        defaultStockModel[28] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Import
        defaultStockModel[29] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Import
        defaultStockModel[30] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Import
        defaultStockModel[31] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Import
        defaultStockModel[32] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Import
        defaultStockModel[33] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Import
        defaultStockModel[34] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Import
        defaultStockModel[35] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Import
        defaultStockModel[36] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Import
        defaultStockModel[37] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Import
        defaultStockModel[38] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Import
        defaultStockModel[39] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Import
        defaultStockModel[40] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Import
        defaultStockModel[41] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Import
        defaultStockModel[42] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Import
        defaultStockModel[43] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Import
        defaultStockModel[44] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Import
        defaultStockModel[45] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Import
        defaultStockModel[46] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import

        defaultStockModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.15F, -0.425F, -0.2F, -0.15F, -0.425F, -0.2F, -0.15F, -0.425F, -0.2F, -0.15F, -0.425F, -0.2F, -0.78F, -0.275F, -0.2F, -0.78F, -0.275F, -0.2F, -0.78F, -0.275F, -0.2F, -0.78F, -0.275F); // Import
        defaultStockModel[0].setRotationPoint(-6.1F, -5.4F, -0.5F);

        defaultStockModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.22F, -0.275F, -0.2F, -0.22F, -0.275F, -0.2F, -0.22F, -0.275F, -0.2F, -0.22F, -0.275F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F); // Import
        defaultStockModel[1].setRotationPoint(-6.1F, -5.4F, -0.5F);

        defaultStockModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.575F, -0.15F, -0.2F, -0.575F, -0.15F, -0.2F, -0.575F, -0.15F, -0.2F, -0.575F, -0.15F); // Import
        defaultStockModel[2].setRotationPoint(-6.1F, -5.4F, -0.5F);

        defaultStockModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.425F, -0.15F, -0.2F, -0.425F, -0.15F, -0.2F, -0.425F, -0.15F, -0.2F, -0.425F, -0.15F, -0.2F, -0.425F, -0.15F, -0.2F, -0.425F, -0.15F, -0.2F, -0.425F, -0.15F, -0.2F, -0.425F, -0.15F); // Import
        defaultStockModel[3].setRotationPoint(-6.1F, -5.4F, -0.5F);

        defaultStockModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.575F, -0.15F, -0.2F, -0.575F, -0.15F, -0.2F, -0.575F, -0.15F, -0.2F, -0.575F, -0.15F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F); // Import
        defaultStockModel[4].setRotationPoint(-6.1F, -5.4F, -0.5F);

        defaultStockModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.22F, -0.275F, -0.2F, -0.22F, -0.275F, -0.2F, -0.22F, -0.275F, -0.2F, -0.22F, -0.275F); // Import
        defaultStockModel[5].setRotationPoint(-6.1F, -5.4F, -0.5F);

        defaultStockModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.78F, -0.275F, -0.2F, -0.78F, -0.275F, -0.2F, -0.78F, -0.275F, -0.2F, -0.78F, -0.275F, -0.2F, -0.15F, -0.425F, -0.2F, -0.15F, -0.425F, -0.2F, -0.15F, -0.425F, -0.2F, -0.15F, -0.425F); // Import
        defaultStockModel[6].setRotationPoint(-6.1F, -5.4F, -0.5F);

        defaultStockModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.15F, -0.425F, -0.2F, -0.15F, -0.425F, -0.2F, -0.15F, -0.425F, -0.2F, -0.15F, -0.425F, -0.2F, -0.78F, -0.275F, -0.2F, -0.78F, -0.275F, -0.2F, -0.78F, -0.275F, -0.2F, -0.78F, -0.275F); // Import
        defaultStockModel[7].setRotationPoint(-6.1F, -3.4F, -0.5F);

        defaultStockModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.22F, -0.275F, -0.2F, -0.22F, -0.275F, -0.2F, -0.22F, -0.275F, -0.2F, -0.22F, -0.275F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F); // Import
        defaultStockModel[8].setRotationPoint(-6.1F, -3.4F, -0.5F);

        defaultStockModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.575F, -0.15F, -0.2F, -0.575F, -0.15F, -0.2F, -0.575F, -0.15F, -0.2F, -0.575F, -0.15F); // Import
        defaultStockModel[9].setRotationPoint(-6.1F, -3.4F, -0.5F);

        defaultStockModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.425F, -0.15F, -0.2F, -0.425F, -0.15F, -0.2F, -0.425F, -0.15F, -0.2F, -0.425F, -0.15F, -0.2F, -0.425F, -0.15F, -0.2F, -0.425F, -0.15F, -0.2F, -0.425F, -0.15F, -0.2F, -0.425F, -0.15F); // Import
        defaultStockModel[10].setRotationPoint(-6.1F, -3.4F, -0.5F);

        defaultStockModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.575F, -0.15F, -0.2F, -0.575F, -0.15F, -0.2F, -0.575F, -0.15F, -0.2F, -0.575F, -0.15F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F); // Import
        defaultStockModel[11].setRotationPoint(-6.1F, -3.4F, -0.5F);

        defaultStockModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.22F, -0.275F, -0.2F, -0.22F, -0.275F, -0.2F, -0.22F, -0.275F, -0.2F, -0.22F, -0.275F); // Import
        defaultStockModel[12].setRotationPoint(-6.1F, -3.4F, -0.5F);

        defaultStockModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.78F, -0.275F, -0.2F, -0.78F, -0.275F, -0.2F, -0.78F, -0.275F, -0.2F, -0.78F, -0.275F, -0.2F, -0.15F, -0.425F, -0.2F, -0.15F, -0.425F, -0.2F, -0.15F, -0.425F, -0.2F, -0.15F, -0.425F); // Import
        defaultStockModel[13].setRotationPoint(-6.1F, -3.4F, -0.5F);

        defaultStockModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F); // Import
        defaultStockModel[14].setRotationPoint(-8.9F, -5.4F, -0.5F);

        defaultStockModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F); // Import
        defaultStockModel[15].setRotationPoint(-8.9F, -5.4F, -0.5F);

        defaultStockModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F); // Import
        defaultStockModel[16].setRotationPoint(-8.9F, -5.4F, -0.5F);

        defaultStockModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F); // Import
        defaultStockModel[17].setRotationPoint(-8.9F, -5.4F, -0.5F);

        defaultStockModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F); // Import
        defaultStockModel[18].setRotationPoint(-8.9F, -5.4F, -0.5F);

        defaultStockModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F); // Import
        defaultStockModel[19].setRotationPoint(-8.9F, -5.4F, -0.5F);

        defaultStockModel[20].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F); // Import
        defaultStockModel[20].setRotationPoint(-8.9F, -5.4F, -0.5F);

        defaultStockModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F); // Import
        defaultStockModel[21].setRotationPoint(-8.9F, -3.4F, -0.5F);

        defaultStockModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F); // Import
        defaultStockModel[22].setRotationPoint(-8.9F, -3.4F, -0.5F);

        defaultStockModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F); // Import
        defaultStockModel[23].setRotationPoint(-8.9F, -3.4F, -0.5F);

        defaultStockModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F); // Import
        defaultStockModel[24].setRotationPoint(-8.9F, -3.4F, -0.5F);

        defaultStockModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F); // Import
        defaultStockModel[25].setRotationPoint(-8.9F, -3.4F, -0.5F);

        defaultStockModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F); // Import
        defaultStockModel[26].setRotationPoint(-8.9F, -3.4F, -0.5F);

        defaultStockModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F); // Import
        defaultStockModel[27].setRotationPoint(-8.9F, -3.4F, -0.5F);

        defaultStockModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultStockModel[28].setRotationPoint(-9.9F, -5.4F, -0.5F);

        defaultStockModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F); // Import
        defaultStockModel[29].setRotationPoint(-9.9F, -6F, -0.5F);

        defaultStockModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F); // Import
        defaultStockModel[30].setRotationPoint(-9.9F, -2.8F, -0.5F);

        defaultStockModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, -0.9F, 0.0F, -0.2F, -0.9F, 0.0F, -0.2F, -0.9F, 0.0F, -0.2F, -0.9F, 0.0F); // Import
        defaultStockModel[31].setRotationPoint(-6.1F, -4.4F, -0.5F);

        defaultStockModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F); // Import
        defaultStockModel[32].setRotationPoint(-6.1F, -4.4F, -0.5F);

        defaultStockModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.1F, 0.0F, -0.2F, -0.1F, 0.0F, -0.2F, -0.1F, 0.0F, -0.2F, -0.1F, 0.0F, -0.2F, -0.7F, 0.1F, -0.2F, -0.7F, 0.1F, -0.2F, -0.7F, 0.1F, -0.2F, -0.7F, 0.1F); // Import
        defaultStockModel[33].setRotationPoint(-6.1F, -4.4F, -0.5F);

        defaultStockModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.9F, 0.0F, -0.2F, -0.9F, 0.0F, -0.2F, -0.9F, 0.0F, -0.2F, -0.9F, 0.0F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F); // Import
        defaultStockModel[34].setRotationPoint(-6.1F, -4.4F, -0.5F);

        defaultStockModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.7F, 0.1F, -0.2F, -0.7F, 0.1F, -0.2F, -0.7F, 0.1F, -0.2F, -0.7F, 0.1F, -0.2F, -0.1F, 0.0F, -0.2F, -0.1F, 0.0F, -0.2F, -0.1F, 0.0F, -0.2F, -0.1F, 0.0F); // Import
        defaultStockModel[35].setRotationPoint(-6.1F, -4.4F, -0.5F);

        defaultStockModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F); // Import
        defaultStockModel[36].setRotationPoint(-6.1F, -4.4F, -0.5F);

        defaultStockModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F); // Import
        defaultStockModel[37].setRotationPoint(-6.6F, -4.4F, -0.5F);

        defaultStockModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F); // Import
        defaultStockModel[38].setRotationPoint(-6.6F, -4.4F, -0.5F);

        defaultStockModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F); // Import
        defaultStockModel[39].setRotationPoint(-6.6F, -4.4F, -0.5F);

        defaultStockModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F, 0.0F, -0.325F, -0.25F); // Import
        defaultStockModel[40].setRotationPoint(-6.6F, -4.4F, -0.5F);

        defaultStockModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F, 0.0F, -0.45F, -0.2F); // Import
        defaultStockModel[41].setRotationPoint(-6.6F, -4.4F, -0.5F);

        defaultStockModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.75F, -0.325F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F, 0.0F, -0.2F, -0.45F); // Import
        defaultStockModel[42].setRotationPoint(-6.6F, -4.4F, -0.5F);

        defaultStockModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F, 0.0F, -0.675F, -0.25F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F, 0.0F, -0.25F, -0.325F); // Import
        defaultStockModel[43].setRotationPoint(-6.6F, -4.4F, -0.5F);

        defaultStockModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F); // Import
        defaultStockModel[44].setRotationPoint(-7.2F, -4.4F, -0.5F);

        defaultStockModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.6F, -0.3F, -0.1F, -0.6F, -0.3F, -0.1F, -0.6F, -0.3F, -0.1F, -0.6F, -0.3F); // Import
        defaultStockModel[45].setRotationPoint(-7.2F, -4.4F, -0.5F);

        defaultStockModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.6F, -0.3F, -0.1F, -0.6F, -0.3F, -0.1F, -0.6F, -0.3F, -0.1F, -0.6F, -0.3F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F); // Import
        defaultStockModel[46].setRotationPoint(-7.2F, -4.4F, -0.5F);
    }

    private void initdefaultGripModel_1() {
        defaultGripModel[0] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Import
        defaultGripModel[1] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Import
        defaultGripModel[2] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Import
        defaultGripModel[3] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Import
        defaultGripModel[4] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import
        defaultGripModel[5] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Import
        defaultGripModel[6] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Import
        defaultGripModel[7] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Import
        defaultGripModel[8] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Import
        defaultGripModel[9] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Import
        defaultGripModel[10] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Import
        defaultGripModel[11] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Import
        defaultGripModel[12] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Import
        defaultGripModel[13] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Import
        defaultGripModel[14] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Import
        defaultGripModel[15] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Import
        defaultGripModel[16] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Import
        defaultGripModel[17] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Import
        defaultGripModel[18] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Import
        defaultGripModel[19] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Import
        defaultGripModel[20] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Import
        defaultGripModel[21] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Import
        defaultGripModel[22] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Import
        defaultGripModel[23] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Import
        defaultGripModel[24] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import
        defaultGripModel[25] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Import
        defaultGripModel[26] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Import

        defaultGripModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, 0.0F, -0.2F, -0.1F, 0.0F, -0.2F, -0.1F, 0.0F, -0.2F, -0.1F, 0.0F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F); // Import
        defaultGripModel[0].setRotationPoint(12.3F, -3.3F, -0.5F);

        defaultGripModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.3F, -1.0F, -0.1F, -0.3F, -1.0F, -0.1F, -0.3F, 0.3F, -0.1F, -0.3F, 0.3F, -0.1F, -0.3F, -1.0F, -0.1F, -0.3F, -1.0F, -0.1F, -0.3F, 0.3F, -0.1F, -0.3F, 0.3F); // Import
        defaultGripModel[1].setRotationPoint(12.3F, -2.8F, -0.5F);

        defaultGripModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F); // Import
        defaultGripModel[2].setRotationPoint(12.3F, -3.1F, -0.5F);

        defaultGripModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.4F, -1.0F, -0.1F, -0.4F, -1.0F, -0.1F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F, -0.1F, -0.4F, -1.0F, -0.3F, -0.4F, -1.0F, -0.3F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F); // Import
        defaultGripModel[3].setRotationPoint(12.3F, -2.5F, -0.5F);

        defaultGripModel[4].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F); // Import
        defaultGripModel[4].setRotationPoint(5.3F, -2.8F, 0F);

        defaultGripModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.6F, -0.3F, -0.1F, -0.6F, -0.3F, -0.1F, -0.6F, -0.3F, -0.1F, -0.6F, -0.3F); // Import
        defaultGripModel[5].setRotationPoint(5.3F, -2.8F, 0F);

        defaultGripModel[6].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -0.1F, -0.6F, -0.3F, -0.1F, -0.6F, -0.3F, -0.1F, -0.6F, -0.3F, -0.1F, -0.6F, -0.3F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F); // Import
        defaultGripModel[6].setRotationPoint(5.3F, -2.8F, 0F);

        defaultGripModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F, -0.1F, -0.4F, -1.0F, -0.1F, -0.4F, -1.0F, -0.1F, -0.4F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, -1.0F, -0.1F, -0.4F, -1.0F); // Import
        defaultGripModel[7].setRotationPoint(12.3F, -2.5F, -0.5F);

        defaultGripModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.3F, 0.3F, -0.1F, -0.3F, 0.3F, -0.1F, -0.3F, -1.0F, -0.1F, -0.3F, -1.0F, -0.1F, -0.3F, 0.3F, -0.1F, -0.3F, 0.3F, -0.1F, -0.3F, -1.0F, -0.1F, -0.3F, -1.0F); // Import
        defaultGripModel[8].setRotationPoint(12.3F, -2.8F, -0.5F);

        defaultGripModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.6F, -0.2F, -0.4F, -0.6F, -0.2F, -0.4F, -0.6F, -0.2F, -0.4F, -0.6F, -0.2F); // Import
        defaultGripModel[9].setRotationPoint(11.8F, -2.8F, 0F);

        defaultGripModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F); // Import
        defaultGripModel[10].setRotationPoint(11.8F, -2.8F, 0F);

        defaultGripModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.6F, -0.2F, -0.4F, -0.6F, -0.2F, -0.4F, -0.6F, -0.2F, -0.4F, -0.6F, -0.2F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F); // Import
        defaultGripModel[11].setRotationPoint(11.8F, -2.8F, 0F);

        defaultGripModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, 0.4F, -0.4F, -0.45F, 0.4F, -0.4F, -0.45F, 0.4F, -0.4F, -0.45F, 0.4F, -0.4F, -0.45F, 0.4F, -0.4F, -0.45F, 0.4F, -0.4F, -0.45F, 0.4F, -0.4F, -0.45F, 0.4F); // Import
        defaultGripModel[12].setRotationPoint(12.3F, -2.8F, -0.5F);

        defaultGripModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.4F, 0.4F, -0.45F, -0.4F, 0.4F, -0.45F, -0.4F, 0.4F, -0.45F, -0.4F, 0.4F, -0.4F, -0.55F, 0.4F, -0.4F, -0.55F, 0.4F, -0.4F, -0.55F, 0.4F, -0.4F, -0.55F, 0.4F); // Import
        defaultGripModel[13].setRotationPoint(12.3F, -2.8F, -0.5F);

        defaultGripModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, 0.4F, -0.4F, -0.55F, 0.4F, -0.4F, -0.55F, 0.4F, -0.4F, -0.55F, 0.4F, -0.45F, -0.4F, 0.4F, -0.45F, -0.4F, 0.4F, -0.45F, -0.4F, 0.4F, -0.45F, -0.4F, 0.4F); // Import
        defaultGripModel[14].setRotationPoint(12.3F, -2.8F, -0.5F);

        defaultGripModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.6F, -0.2F, -0.3F, -0.6F, -0.2F, -0.3F, -0.6F, -0.2F, -0.3F, -0.6F, -0.2F); // Import
        defaultGripModel[15].setRotationPoint(4.8F, -2.8F, 0F);

        defaultGripModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.1F, -0.2F); // Import
        defaultGripModel[16].setRotationPoint(4.8F, -2.7F, 0F);

        defaultGripModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.8F, -0.2F, -0.3F, -0.6F, -0.2F, -0.3F, -0.6F, -0.2F, -0.3F, -0.8F, -0.2F, -0.6F, 0.2F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.6F, 0.2F, -0.3F); // Import
        defaultGripModel[17].setRotationPoint(4.8F, -2.6F, 0F);

        defaultGripModel[18].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F); // Import
        defaultGripModel[18].setRotationPoint(5.3F, -2.8F, -1F);

        defaultGripModel[19].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.6F, -0.3F, -0.1F, -0.6F, -0.3F, -0.1F, -0.6F, -0.3F, -0.1F, -0.6F, -0.3F); // Import
        defaultGripModel[19].setRotationPoint(5.3F, -2.8F, -1F);

        defaultGripModel[20].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -0.1F, -0.6F, -0.3F, -0.1F, -0.6F, -0.3F, -0.1F, -0.6F, -0.3F, -0.1F, -0.6F, -0.3F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F); // Import
        defaultGripModel[20].setRotationPoint(5.3F, -2.8F, -1F);

        defaultGripModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.6F, -0.2F, -0.3F, -0.6F, -0.2F, -0.3F, -0.6F, -0.2F, -0.3F, -0.6F, -0.2F); // Import
        defaultGripModel[21].setRotationPoint(4.8F, -2.8F, -1F);

        defaultGripModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.1F, -0.2F); // Import
        defaultGripModel[22].setRotationPoint(4.8F, -2.7F, -1F);

        defaultGripModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.8F, -0.2F, -0.3F, -0.6F, -0.2F, -0.3F, -0.6F, -0.2F, -0.3F, -0.8F, -0.2F, -0.6F, 0.2F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.6F, 0.2F, -0.3F); // Import
        defaultGripModel[23].setRotationPoint(4.8F, -2.6F, -1F);

        defaultGripModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.6F, -0.2F, -0.4F, -0.6F, -0.2F, -0.4F, -0.6F, -0.2F, -0.4F, -0.6F, -0.2F); // Import
        defaultGripModel[24].setRotationPoint(11.8F, -2.8F, -1F);

        defaultGripModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F); // Import
        defaultGripModel[25].setRotationPoint(11.8F, -2.8F, -1F);

        defaultGripModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.6F, -0.2F, -0.4F, -0.6F, -0.2F, -0.4F, -0.6F, -0.2F, -0.4F, -0.6F, -0.2F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F); // Import
        defaultGripModel[26].setRotationPoint(11.8F, -2.8F, -1F);
    }

    private void initammoModel_1() {
        ammoModel[0] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Import
        ammoModel[1] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Import
        ammoModel[2] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import
        ammoModel[3] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Import
        ammoModel[4] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Import
        ammoModel[5] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Import
        ammoModel[6] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Import
        ammoModel[7] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Import
        ammoModel[8] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Import
        ammoModel[9] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Import
        ammoModel[10] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Import
        ammoModel[11] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Import
        ammoModel[12] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Import
        ammoModel[13] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Import
        ammoModel[14] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Import
        ammoModel[15] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Import
        ammoModel[16] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Import
        ammoModel[17] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Import
        ammoModel[18] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Import
        ammoModel[19] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Import
        ammoModel[20] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Import
        ammoModel[21] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Import
        ammoModel[22] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Import
        ammoModel[23] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Import
        ammoModel[24] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Import
        ammoModel[25] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Import
        ammoModel[26] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Import
        ammoModel[27] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Import
        ammoModel[28] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Import
        ammoModel[29] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Import
        ammoModel[30] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Import
        ammoModel[31] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Import
        ammoModel[32] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Import
        ammoModel[33] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Import
        ammoModel[34] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import
        ammoModel[35] = new ModelRendererTurbo(this, 9, 129, textureX, textureY); // Import
        ammoModel[36] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Import
        ammoModel[37] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Import
        ammoModel[38] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Import
        ammoModel[39] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Import
        ammoModel[40] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Import
        ammoModel[41] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Import
        ammoModel[42] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Import
        ammoModel[43] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Import
        ammoModel[44] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Import
        ammoModel[45] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Import
        ammoModel[46] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Import
        ammoModel[47] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Import
        ammoModel[48] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Import
        ammoModel[49] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Import
        ammoModel[50] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Import
        ammoModel[51] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Import
        ammoModel[52] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Import
        ammoModel[53] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Import
        ammoModel[54] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Import
        ammoModel[55] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Import
        ammoModel[56] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Import
        ammoModel[57] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Import
        ammoModel[58] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Import
        ammoModel[59] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Import
        ammoModel[60] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Import
        ammoModel[61] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Import
        ammoModel[62] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Import
        ammoModel[63] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Import
        ammoModel[64] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Import
        ammoModel[65] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Import
        ammoModel[66] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import
        ammoModel[67] = new ModelRendererTurbo(this, 9, 137, textureX, textureY); // Import
        ammoModel[68] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Import
        ammoModel[69] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Import
        ammoModel[70] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Import
        ammoModel[71] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Import
        ammoModel[72] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Import
        ammoModel[73] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Import
        ammoModel[74] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Import
        ammoModel[75] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Import
        ammoModel[76] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Import
        ammoModel[77] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Import
        ammoModel[78] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Import
        ammoModel[79] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Import
        ammoModel[80] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Import
        ammoModel[81] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Import
        ammoModel[82] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Import
        ammoModel[83] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Import
        ammoModel[84] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Import
        ammoModel[85] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Import
        ammoModel[86] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Import
        ammoModel[87] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Import
        ammoModel[88] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Import
        ammoModel[89] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Import
        ammoModel[90] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Import
        ammoModel[91] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Import
        ammoModel[92] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Import
        ammoModel[93] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Import
        ammoModel[94] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Import
        ammoModel[95] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Import
        ammoModel[96] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Import
        ammoModel[97] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Import
        ammoModel[98] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import
        ammoModel[99] = new ModelRendererTurbo(this, 9, 145, textureX, textureY); // Import
        ammoModel[100] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Import
        ammoModel[101] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Import
        ammoModel[102] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Import
        ammoModel[103] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Import
        ammoModel[104] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Import
        ammoModel[105] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Import
        ammoModel[106] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Import
        ammoModel[107] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Import
        ammoModel[108] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Import
        ammoModel[109] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Import
        ammoModel[110] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Import
        ammoModel[111] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Import
        ammoModel[112] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Import
        ammoModel[113] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Import
        ammoModel[114] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Import
        ammoModel[115] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Import
        ammoModel[116] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Import
        ammoModel[117] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Import
        ammoModel[118] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Import
        ammoModel[119] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Import
        ammoModel[120] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Import
        ammoModel[121] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Import
        ammoModel[122] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Import
        ammoModel[123] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Import
        ammoModel[124] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Import
        ammoModel[125] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Import
        ammoModel[126] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Import
        ammoModel[127] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Import
        ammoModel[128] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Import
        ammoModel[129] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Import
        ammoModel[130] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Import
        ammoModel[131] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Import
        ammoModel[132] = new ModelRendererTurbo(this, 17, 153, textureX, textureY); // Import
        ammoModel[133] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Import
        ammoModel[134] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Import
        ammoModel[135] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Import
        ammoModel[136] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Import
        ammoModel[137] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Import
        ammoModel[138] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Import
        ammoModel[139] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Import
        ammoModel[140] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Import
        ammoModel[141] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Import
        ammoModel[142] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Import
        ammoModel[143] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Import
        ammoModel[144] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Import
        ammoModel[145] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Import
        ammoModel[146] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Import
        ammoModel[147] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Import
        ammoModel[148] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Import
        ammoModel[149] = new ModelRendererTurbo(this, 153, 153, textureX, textureY); // Import
        ammoModel[150] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Import
        ammoModel[151] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Import
        ammoModel[152] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Import
        ammoModel[153] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Import
        ammoModel[154] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Import
        ammoModel[155] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Import
        ammoModel[156] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Import
        ammoModel[157] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Import
        ammoModel[158] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Import
        ammoModel[159] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Import
        ammoModel[160] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Import
        ammoModel[161] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Import
        ammoModel[162] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import
        ammoModel[163] = new ModelRendererTurbo(this, 9, 161, textureX, textureY); // Import
        ammoModel[164] = new ModelRendererTurbo(this, 17, 161, textureX, textureY); // Import
        ammoModel[165] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Import
        ammoModel[166] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Import
        ammoModel[167] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Import
        ammoModel[168] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Import
        ammoModel[169] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Import
        ammoModel[170] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Import
        ammoModel[171] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Import
        ammoModel[172] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Import
        ammoModel[173] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Import
        ammoModel[174] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Import
        ammoModel[175] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Import
        ammoModel[176] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Import
        ammoModel[177] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Import
        ammoModel[178] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Import
        ammoModel[179] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Import
        ammoModel[180] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Import
        ammoModel[181] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Import
        ammoModel[182] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Import
        ammoModel[183] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Import
        ammoModel[184] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Import
        ammoModel[185] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Import
        ammoModel[186] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Import
        ammoModel[187] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Import
        ammoModel[188] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Import
        ammoModel[189] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Import
        ammoModel[190] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Import
        ammoModel[191] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Import
        ammoModel[192] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Import
        ammoModel[193] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Import
        ammoModel[194] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import
        ammoModel[195] = new ModelRendererTurbo(this, 9, 169, textureX, textureY); // Import
        ammoModel[196] = new ModelRendererTurbo(this, 17, 169, textureX, textureY); // Import
        ammoModel[197] = new ModelRendererTurbo(this, 25, 169, textureX, textureY); // Import
        ammoModel[198] = new ModelRendererTurbo(this, 33, 169, textureX, textureY); // Import
        ammoModel[199] = new ModelRendererTurbo(this, 41, 169, textureX, textureY); // Import
        ammoModel[200] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Import

        ammoModel[0].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F); // Import
        ammoModel[0].setRotationPoint(2.3F, -2.7F, -2F);

        ammoModel[1].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0.3F, 0.1F, -0.3F, 0.3F, 0.1F, -0.3F, 0.3F, 0.1F, -0.3F, 0.3F, 0.1F, -0.3F, 0.3F, 0.1F, -0.3F, 0.3F, 0.1F, -0.3F, 0.3F, 0.1F, -0.3F, 0.3F, 0.1F, -0.3F); // Import
        ammoModel[1].setRotationPoint(2.3F, -2.7F, 1.5F);

        ammoModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.1F, -0.6F, -1.0F, -0.1F, -0.6F, -1.0F, -0.1F, -0.6F, -0.5F, -0.1F, -0.6F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F); // Import
        ammoModel[2].setRotationPoint(2.3F, -3.7F, -2F);

        ammoModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F); // Import
        ammoModel[3].setRotationPoint(2.3F, -3.5F, 1.5F);

        ammoModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.1F, -0.4F, -0.3F, 0.1F, -0.4F, -0.3F, 0.1F, -0.4F, -0.3F, 0.1F, -0.4F, -0.3F); // Import
        ammoModel[4].setRotationPoint(2.3F, 2F, 1.5F);

        ammoModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, -0.1F, -0.8F, -0.1F, -0.1F, -0.8F, -0.1F, -0.1F, -0.8F, -0.2F, -0.1F, -0.8F, -0.2F); // Import
        ammoModel[5].setRotationPoint(2.3F, 2.3F, -2F);

        ammoModel[6].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.3F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F); // Import
        ammoModel[6].setRotationPoint(2.3F, -2.7F, -2.3F);

        ammoModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.1F, -0.6F, -0.8F, -0.8F, -0.6F, -0.8F, -0.8F, -0.6F, -0.9F, -0.1F, -0.6F, -0.9F, 0.2F, 0.0F, -0.8F, -0.8F, 0.0F, -0.8F, -0.8F, 0.0F, -0.9F, 0.2F, 0.0F, -0.9F); // Import
        ammoModel[7].setRotationPoint(2.3F, -3.7F, -0.3F);

        ammoModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.8F, -0.6F, -0.8F, -0.1F, -0.6F, -0.8F, -0.1F, -0.6F, -0.9F, -0.8F, -0.6F, -0.9F, -0.8F, 0.0F, -0.8F, 0.2F, 0.0F, -0.8F, 0.2F, 0.0F, -0.9F, -0.8F, 0.0F, -0.9F); // Import
        ammoModel[8].setRotationPoint(3.3F, -3.7F, -0.3F);

        ammoModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F); // Import
        ammoModel[9].setRotationPoint(2.5F, -5.2F, 0F);

        ammoModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F); // Import
        ammoModel[10].setRotationPoint(2.5F, -5.2F, 0F);

        ammoModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F); // Import
        ammoModel[11].setRotationPoint(2.5F, -5.2F, 0F);

        ammoModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F); // Import
        ammoModel[12].setRotationPoint(3.2F, -5.2F, 0F);

        ammoModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F); // Import
        ammoModel[13].setRotationPoint(3.2F, -5.2F, 0F);

        ammoModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F); // Import
        ammoModel[14].setRotationPoint(3.2F, -5.2F, 0F);

        ammoModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.4F, -0.4F, -0.475F, -0.45F, -0.4F, -0.475F, -0.45F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.475F, -0.45F, -0.4F, -0.475F, -0.45F, -0.4F, -0.45F, -0.4F); // Import
        ammoModel[15].setRotationPoint(3.5F, -5.2F, 0F);

        ammoModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.45F, -0.4F, -0.45F, -0.475F, -0.4F, -0.45F, -0.475F, -0.4F, -0.4F, -0.45F, -0.4F, -0.55F, -0.4F, -0.4F, -0.525F, -0.45F, -0.4F, -0.525F, -0.45F, -0.4F, -0.55F, -0.4F); // Import
        ammoModel[16].setRotationPoint(3.5F, -5.2F, 0F);

        ammoModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.4F, -0.4F, -0.525F, -0.45F, -0.4F, -0.525F, -0.45F, -0.4F, -0.55F, -0.4F, -0.4F, -0.4F, -0.45F, -0.4F, -0.45F, -0.475F, -0.4F, -0.45F, -0.475F, -0.4F, -0.4F, -0.45F); // Import
        ammoModel[17].setRotationPoint(3.5F, -5.2F, 0F);

        ammoModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F); // Import
        ammoModel[18].setRotationPoint(2.2F, -5.2F, 0F);

        ammoModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F); // Import
        ammoModel[19].setRotationPoint(2.45F, -5.2F, 0F);

        ammoModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Import
        ammoModel[20].setRotationPoint(2.2F, -5.2F, 0F);

        ammoModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Import
        ammoModel[21].setRotationPoint(2.7F, -5.2F, 0F);

        ammoModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F); // Import
        ammoModel[22].setRotationPoint(2.7F, -5.2F, 0F);

        ammoModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F); // Import
        ammoModel[23].setRotationPoint(2.4F, -5.2F, 0F);

        ammoModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Import
        ammoModel[24].setRotationPoint(2.4F, -5.2F, 0F);

        ammoModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.45F, -0.4F, -0.45F, -0.475F, -0.4F, -0.45F, -0.475F, -0.4F, -0.4F, -0.45F, -0.4F, -0.55F, -0.4F, -0.4F, -0.525F, -0.45F, -0.4F, -0.525F, -0.45F, -0.4F, -0.55F, -0.4F); // Import
        ammoModel[25].setRotationPoint(3.5F, -5.15F, 0.3F);

        ammoModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.4F, -0.4F, -0.475F, -0.45F, -0.4F, -0.475F, -0.45F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.475F, -0.45F, -0.4F, -0.475F, -0.45F, -0.4F, -0.45F, -0.4F); // Import
        ammoModel[26].setRotationPoint(3.5F, -5.15F, 0.3F);

        ammoModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.4F, -0.4F, -0.525F, -0.45F, -0.4F, -0.525F, -0.45F, -0.4F, -0.55F, -0.4F, -0.4F, -0.4F, -0.45F, -0.4F, -0.45F, -0.475F, -0.4F, -0.45F, -0.475F, -0.4F, -0.4F, -0.45F); // Import
        ammoModel[27].setRotationPoint(3.5F, -5.15F, 0.3F);

        ammoModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F); // Import
        ammoModel[28].setRotationPoint(3.2F, -5.15F, 0.3F);

        ammoModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F); // Import
        ammoModel[29].setRotationPoint(3.2F, -5.15F, 0.3F);

        ammoModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F); // Import
        ammoModel[30].setRotationPoint(3.2F, -5.15F, 0.3F);

        ammoModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F); // Import
        ammoModel[31].setRotationPoint(2.5F, -5.15F, 0.3F);

        ammoModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F); // Import
        ammoModel[32].setRotationPoint(2.5F, -5.15F, 0.3F);

        ammoModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F); // Import
        ammoModel[33].setRotationPoint(2.2F, -5.15F, 0.3F);

        ammoModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F); // Import
        ammoModel[34].setRotationPoint(2.45F, -5.15F, 0.3F);

        ammoModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Import
        ammoModel[35].setRotationPoint(2.2F, -5.15F, 0.3F);

        ammoModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F); // Import
        ammoModel[36].setRotationPoint(2.5F, -5.15F, 0.3F);

        ammoModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F); // Import
        ammoModel[37].setRotationPoint(2.4F, -5.15F, 0.3F);

        ammoModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Import
        ammoModel[38].setRotationPoint(2.4F, -5.15F, 0.3F);

        ammoModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Import
        ammoModel[39].setRotationPoint(2.7F, -5.15F, 0.3F);

        ammoModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F); // Import
        ammoModel[40].setRotationPoint(2.7F, -5.15F, 0.3F);

        ammoModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.45F, -0.4F, -0.45F, -0.475F, -0.4F, -0.45F, -0.475F, -0.4F, -0.4F, -0.45F, -0.4F, -0.55F, -0.4F, -0.4F, -0.525F, -0.45F, -0.4F, -0.525F, -0.45F, -0.4F, -0.55F, -0.4F); // Import
        ammoModel[41].setRotationPoint(3.5F, -5.05F, 0.6F);

        ammoModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.4F, -0.4F, -0.475F, -0.45F, -0.4F, -0.475F, -0.45F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.475F, -0.45F, -0.4F, -0.475F, -0.45F, -0.4F, -0.45F, -0.4F); // Import
        ammoModel[42].setRotationPoint(3.5F, -5.05F, 0.6F);

        ammoModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.4F, -0.4F, -0.525F, -0.45F, -0.4F, -0.525F, -0.45F, -0.4F, -0.55F, -0.4F, -0.4F, -0.4F, -0.45F, -0.4F, -0.45F, -0.475F, -0.4F, -0.45F, -0.475F, -0.4F, -0.4F, -0.45F); // Import
        ammoModel[43].setRotationPoint(3.5F, -5.05F, 0.6F);

        ammoModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F); // Import
        ammoModel[44].setRotationPoint(3.2F, -5.05F, 0.6F);

        ammoModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F); // Import
        ammoModel[45].setRotationPoint(3.2F, -5.05F, 0.6F);

        ammoModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F); // Import
        ammoModel[46].setRotationPoint(3.2F, -5.05F, 0.6F);

        ammoModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F); // Import
        ammoModel[47].setRotationPoint(2.5F, -5.05F, 0.6F);

        ammoModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F); // Import
        ammoModel[48].setRotationPoint(2.5F, -5.05F, 0.6F);

        ammoModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F); // Import
        ammoModel[49].setRotationPoint(2.2F, -5.05F, 0.6F);

        ammoModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F); // Import
        ammoModel[50].setRotationPoint(2.45F, -5.05F, 0.6F);

        ammoModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Import
        ammoModel[51].setRotationPoint(2.2F, -5.05F, 0.6F);

        ammoModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F); // Import
        ammoModel[52].setRotationPoint(2.5F, -5.05F, 0.6F);

        ammoModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F); // Import
        ammoModel[53].setRotationPoint(2.4F, -5.05F, 0.6F);

        ammoModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Import
        ammoModel[54].setRotationPoint(2.4F, -5.05F, 0.6F);

        ammoModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Import
        ammoModel[55].setRotationPoint(2.7F, -5.05F, 0.6F);

        ammoModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F); // Import
        ammoModel[56].setRotationPoint(2.7F, -5.05F, 0.6F);

        ammoModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.45F, -0.4F, -0.45F, -0.475F, -0.4F, -0.45F, -0.475F, -0.4F, -0.4F, -0.45F, -0.4F, -0.55F, -0.4F, -0.4F, -0.525F, -0.45F, -0.4F, -0.525F, -0.45F, -0.4F, -0.55F, -0.4F); // Import
        ammoModel[57].setRotationPoint(3.5F, -4.85F, 0.8F);

        ammoModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.4F, -0.4F, -0.475F, -0.45F, -0.4F, -0.475F, -0.45F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.475F, -0.45F, -0.4F, -0.475F, -0.45F, -0.4F, -0.45F, -0.4F); // Import
        ammoModel[58].setRotationPoint(3.5F, -4.85F, 0.8F);

        ammoModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.4F, -0.4F, -0.525F, -0.45F, -0.4F, -0.525F, -0.45F, -0.4F, -0.55F, -0.4F, -0.4F, -0.4F, -0.45F, -0.4F, -0.45F, -0.475F, -0.4F, -0.45F, -0.475F, -0.4F, -0.4F, -0.45F); // Import
        ammoModel[59].setRotationPoint(3.5F, -4.85F, 0.8F);

        ammoModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F); // Import
        ammoModel[60].setRotationPoint(3.2F, -4.85F, 0.8F);

        ammoModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F); // Import
        ammoModel[61].setRotationPoint(3.2F, -4.85F, 0.8F);

        ammoModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F); // Import
        ammoModel[62].setRotationPoint(3.2F, -4.85F, 0.8F);

        ammoModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F); // Import
        ammoModel[63].setRotationPoint(2.5F, -4.85F, 0.8F);

        ammoModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F); // Import
        ammoModel[64].setRotationPoint(2.5F, -4.85F, 0.8F);

        ammoModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F); // Import
        ammoModel[65].setRotationPoint(2.2F, -4.85F, 0.8F);

        ammoModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F); // Import
        ammoModel[66].setRotationPoint(2.45F, -4.85F, 0.8F);

        ammoModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Import
        ammoModel[67].setRotationPoint(2.2F, -4.85F, 0.8F);

        ammoModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F); // Import
        ammoModel[68].setRotationPoint(2.5F, -4.85F, 0.8F);

        ammoModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F); // Import
        ammoModel[69].setRotationPoint(2.4F, -4.85F, 0.8F);

        ammoModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Import
        ammoModel[70].setRotationPoint(2.4F, -4.85F, 0.8F);

        ammoModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Import
        ammoModel[71].setRotationPoint(2.7F, -4.85F, 0.8F);

        ammoModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F); // Import
        ammoModel[72].setRotationPoint(2.7F, -4.85F, 0.8F);

        ammoModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.45F, -0.4F, -0.45F, -0.475F, -0.4F, -0.45F, -0.475F, -0.4F, -0.4F, -0.45F, -0.4F, -0.55F, -0.4F, -0.4F, -0.525F, -0.45F, -0.4F, -0.525F, -0.45F, -0.4F, -0.55F, -0.4F); // Import
        ammoModel[73].setRotationPoint(3.5F, -4.55F, 0.9F);

        ammoModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.4F, -0.4F, -0.475F, -0.45F, -0.4F, -0.475F, -0.45F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.475F, -0.45F, -0.4F, -0.475F, -0.45F, -0.4F, -0.45F, -0.4F); // Import
        ammoModel[74].setRotationPoint(3.5F, -4.55F, 0.9F);

        ammoModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.4F, -0.4F, -0.525F, -0.45F, -0.4F, -0.525F, -0.45F, -0.4F, -0.55F, -0.4F, -0.4F, -0.4F, -0.45F, -0.4F, -0.45F, -0.475F, -0.4F, -0.45F, -0.475F, -0.4F, -0.4F, -0.45F); // Import
        ammoModel[75].setRotationPoint(3.5F, -4.55F, 0.9F);

        ammoModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F); // Import
        ammoModel[76].setRotationPoint(3.2F, -4.55F, 0.9F);

        ammoModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F); // Import
        ammoModel[77].setRotationPoint(3.2F, -4.55F, 0.9F);

        ammoModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F); // Import
        ammoModel[78].setRotationPoint(3.2F, -4.55F, 0.9F);

        ammoModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F); // Import
        ammoModel[79].setRotationPoint(2.5F, -4.55F, 0.9F);

        ammoModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F); // Import
        ammoModel[80].setRotationPoint(2.5F, -4.55F, 0.9F);

        ammoModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F); // Import
        ammoModel[81].setRotationPoint(2.2F, -4.55F, 0.9F);

        ammoModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F); // Import
        ammoModel[82].setRotationPoint(2.45F, -4.55F, 0.9F);

        ammoModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Import
        ammoModel[83].setRotationPoint(2.2F, -4.55F, 0.9F);

        ammoModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F); // Import
        ammoModel[84].setRotationPoint(2.5F, -4.55F, 0.9F);

        ammoModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F); // Import
        ammoModel[85].setRotationPoint(2.4F, -4.55F, 0.9F);

        ammoModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Import
        ammoModel[86].setRotationPoint(2.4F, -4.55F, 0.9F);

        ammoModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Import
        ammoModel[87].setRotationPoint(2.7F, -4.55F, 0.9F);

        ammoModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F); // Import
        ammoModel[88].setRotationPoint(2.7F, -4.55F, 0.9F);

        ammoModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.45F, -0.4F, -0.45F, -0.475F, -0.4F, -0.45F, -0.475F, -0.4F, -0.4F, -0.45F, -0.4F, -0.55F, -0.4F, -0.4F, -0.525F, -0.45F, -0.4F, -0.525F, -0.45F, -0.4F, -0.55F, -0.4F); // Import
        ammoModel[89].setRotationPoint(3.5F, -4.25F, 0.95F);

        ammoModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.4F, -0.4F, -0.475F, -0.45F, -0.4F, -0.475F, -0.45F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.475F, -0.45F, -0.4F, -0.475F, -0.45F, -0.4F, -0.45F, -0.4F); // Import
        ammoModel[90].setRotationPoint(3.5F, -4.25F, 0.95F);

        ammoModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.4F, -0.4F, -0.525F, -0.45F, -0.4F, -0.525F, -0.45F, -0.4F, -0.55F, -0.4F, -0.4F, -0.4F, -0.45F, -0.4F, -0.45F, -0.475F, -0.4F, -0.45F, -0.475F, -0.4F, -0.4F, -0.45F); // Import
        ammoModel[91].setRotationPoint(3.5F, -4.25F, 0.95F);

        ammoModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F); // Import
        ammoModel[92].setRotationPoint(3.2F, -4.25F, 0.95F);

        ammoModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F); // Import
        ammoModel[93].setRotationPoint(3.2F, -4.25F, 0.95F);

        ammoModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F); // Import
        ammoModel[94].setRotationPoint(3.2F, -4.25F, 0.95F);

        ammoModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F); // Import
        ammoModel[95].setRotationPoint(2.5F, -4.25F, 0.95F);

        ammoModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F); // Import
        ammoModel[96].setRotationPoint(2.5F, -4.25F, 0.95F);

        ammoModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F); // Import
        ammoModel[97].setRotationPoint(2.2F, -4.25F, 0.95F);

        ammoModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F); // Import
        ammoModel[98].setRotationPoint(2.45F, -4.25F, 0.95F);

        ammoModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Import
        ammoModel[99].setRotationPoint(2.2F, -4.25F, 0.95F);

        ammoModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F); // Import
        ammoModel[100].setRotationPoint(2.5F, -4.25F, 0.95F);

        ammoModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F); // Import
        ammoModel[101].setRotationPoint(2.4F, -4.25F, 0.95F);

        ammoModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Import
        ammoModel[102].setRotationPoint(2.4F, -4.25F, 0.95F);

        ammoModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Import
        ammoModel[103].setRotationPoint(2.7F, -4.25F, 0.95F);

        ammoModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F); // Import
        ammoModel[104].setRotationPoint(2.7F, -4.25F, 0.95F);

        ammoModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.45F, -0.4F, -0.45F, -0.475F, -0.4F, -0.45F, -0.475F, -0.4F, -0.4F, -0.45F, -0.4F, -0.55F, -0.4F, -0.4F, -0.525F, -0.45F, -0.4F, -0.525F, -0.45F, -0.4F, -0.55F, -0.4F); // Import
        ammoModel[105].setRotationPoint(3.5F, -3.95F, 1F);

        ammoModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.4F, -0.4F, -0.475F, -0.45F, -0.4F, -0.475F, -0.45F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.475F, -0.45F, -0.4F, -0.475F, -0.45F, -0.4F, -0.45F, -0.4F); // Import
        ammoModel[106].setRotationPoint(3.5F, -3.95F, 1F);

        ammoModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.4F, -0.4F, -0.525F, -0.45F, -0.4F, -0.525F, -0.45F, -0.4F, -0.55F, -0.4F, -0.4F, -0.4F, -0.45F, -0.4F, -0.45F, -0.475F, -0.4F, -0.45F, -0.475F, -0.4F, -0.4F, -0.45F); // Import
        ammoModel[107].setRotationPoint(3.5F, -3.95F, 1F);

        ammoModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F); // Import
        ammoModel[108].setRotationPoint(3.2F, -3.95F, 1F);

        ammoModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F); // Import
        ammoModel[109].setRotationPoint(3.2F, -3.95F, 1F);

        ammoModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F); // Import
        ammoModel[110].setRotationPoint(3.2F, -3.95F, 1F);

        ammoModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F); // Import
        ammoModel[111].setRotationPoint(2.5F, -3.95F, 1F);

        ammoModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F); // Import
        ammoModel[112].setRotationPoint(2.5F, -3.95F, 1F);

        ammoModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F); // Import
        ammoModel[113].setRotationPoint(2.2F, -3.95F, 1F);

        ammoModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F); // Import
        ammoModel[114].setRotationPoint(2.45F, -3.95F, 1F);

        ammoModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Import
        ammoModel[115].setRotationPoint(2.2F, -3.95F, 1F);

        ammoModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F); // Import
        ammoModel[116].setRotationPoint(2.5F, -3.95F, 1F);

        ammoModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F); // Import
        ammoModel[117].setRotationPoint(2.4F, -3.95F, 1F);

        ammoModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Import
        ammoModel[118].setRotationPoint(2.4F, -3.95F, 1F);

        ammoModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Import
        ammoModel[119].setRotationPoint(2.7F, -3.95F, 1F);

        ammoModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F); // Import
        ammoModel[120].setRotationPoint(2.7F, -3.95F, 1F);

        ammoModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F); // Import
        ammoModel[121].setRotationPoint(2.5F, -3.65F, 1F);

        ammoModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F); // Import
        ammoModel[122].setRotationPoint(2.5F, -3.65F, 1F);

        ammoModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F); // Import
        ammoModel[123].setRotationPoint(2.5F, -3.65F, 1F);

        ammoModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F); // Import
        ammoModel[124].setRotationPoint(2.2F, -3.65F, 1F);

        ammoModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Import
        ammoModel[125].setRotationPoint(2.2F, -3.65F, 1F);

        ammoModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F); // Import
        ammoModel[126].setRotationPoint(2.4F, -3.65F, 1F);

        ammoModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Import
        ammoModel[127].setRotationPoint(2.4F, -3.65F, 1F);

        ammoModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F); // Import
        ammoModel[128].setRotationPoint(2.7F, -3.65F, 1F);

        ammoModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F); // Import
        ammoModel[129].setRotationPoint(2.45F, -3.65F, 1F);

        ammoModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Import
        ammoModel[130].setRotationPoint(2.7F, -3.65F, 1F);

        ammoModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F); // Import
        ammoModel[131].setRotationPoint(3.2F, -3.65F, 1F);

        ammoModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.45F, -0.4F, -0.45F, -0.475F, -0.4F, -0.45F, -0.475F, -0.4F, -0.4F, -0.45F, -0.4F, -0.55F, -0.4F, -0.4F, -0.525F, -0.45F, -0.4F, -0.525F, -0.45F, -0.4F, -0.55F, -0.4F); // Import
        ammoModel[132].setRotationPoint(3.5F, -3.65F, 1F);

        ammoModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.4F, -0.4F, -0.475F, -0.45F, -0.4F, -0.475F, -0.45F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.475F, -0.45F, -0.4F, -0.475F, -0.45F, -0.4F, -0.45F, -0.4F); // Import
        ammoModel[133].setRotationPoint(3.5F, -3.65F, 1F);

        ammoModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F); // Import
        ammoModel[134].setRotationPoint(3.2F, -3.65F, 1F);

        ammoModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.4F, -0.4F, -0.525F, -0.45F, -0.4F, -0.525F, -0.45F, -0.4F, -0.55F, -0.4F, -0.4F, -0.4F, -0.45F, -0.4F, -0.45F, -0.475F, -0.4F, -0.45F, -0.475F, -0.4F, -0.4F, -0.45F); // Import
        ammoModel[135].setRotationPoint(3.5F, -3.65F, 1F);

        ammoModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F); // Import
        ammoModel[136].setRotationPoint(3.2F, -3.65F, 1F);

        ammoModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F); // Import
        ammoModel[137].setRotationPoint(2.5F, -3.35F, 1F);

        ammoModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F); // Import
        ammoModel[138].setRotationPoint(2.5F, -3.35F, 1F);

        ammoModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F); // Import
        ammoModel[139].setRotationPoint(2.5F, -3.35F, 1F);

        ammoModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F); // Import
        ammoModel[140].setRotationPoint(2.2F, -3.35F, 1F);

        ammoModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Import
        ammoModel[141].setRotationPoint(2.2F, -3.35F, 1F);

        ammoModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F); // Import
        ammoModel[142].setRotationPoint(2.4F, -3.35F, 1F);

        ammoModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Import
        ammoModel[143].setRotationPoint(2.4F, -3.35F, 1F);

        ammoModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F); // Import
        ammoModel[144].setRotationPoint(2.7F, -3.35F, 1F);

        ammoModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F); // Import
        ammoModel[145].setRotationPoint(2.45F, -3.35F, 1F);

        ammoModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Import
        ammoModel[146].setRotationPoint(2.7F, -3.35F, 1F);

        ammoModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F); // Import
        ammoModel[147].setRotationPoint(3.2F, -3.35F, 1F);

        ammoModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.45F, -0.4F, -0.45F, -0.475F, -0.4F, -0.45F, -0.475F, -0.4F, -0.4F, -0.45F, -0.4F, -0.55F, -0.4F, -0.4F, -0.525F, -0.45F, -0.4F, -0.525F, -0.45F, -0.4F, -0.55F, -0.4F); // Import
        ammoModel[148].setRotationPoint(3.5F, -3.35F, 1F);

        ammoModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.4F, -0.4F, -0.475F, -0.45F, -0.4F, -0.475F, -0.45F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.475F, -0.45F, -0.4F, -0.475F, -0.45F, -0.4F, -0.45F, -0.4F); // Import
        ammoModel[149].setRotationPoint(3.5F, -3.35F, 1F);

        ammoModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F); // Import
        ammoModel[150].setRotationPoint(3.2F, -3.35F, 1F);

        ammoModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.4F, -0.4F, -0.525F, -0.45F, -0.4F, -0.525F, -0.45F, -0.4F, -0.55F, -0.4F, -0.4F, -0.4F, -0.45F, -0.4F, -0.45F, -0.475F, -0.4F, -0.45F, -0.475F, -0.4F, -0.4F, -0.45F); // Import
        ammoModel[151].setRotationPoint(3.5F, -3.35F, 1F);

        ammoModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F); // Import
        ammoModel[152].setRotationPoint(3.2F, -3.35F, 1F);

        ammoModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F); // Import
        ammoModel[153].setRotationPoint(2.5F, -3.35F, 0.7F);

        ammoModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F); // Import
        ammoModel[154].setRotationPoint(2.5F, -3.35F, 0.7F);

        ammoModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F); // Import
        ammoModel[155].setRotationPoint(2.5F, -3.35F, 0.7F);

        ammoModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F); // Import
        ammoModel[156].setRotationPoint(2.2F, -3.35F, 0.7F);

        ammoModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Import
        ammoModel[157].setRotationPoint(2.2F, -3.35F, 0.7F);

        ammoModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F); // Import
        ammoModel[158].setRotationPoint(2.4F, -3.35F, 0.7F);

        ammoModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Import
        ammoModel[159].setRotationPoint(2.4F, -3.35F, 0.7F);

        ammoModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F); // Import
        ammoModel[160].setRotationPoint(2.7F, -3.35F, 0.7F);

        ammoModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F); // Import
        ammoModel[161].setRotationPoint(2.45F, -3.35F, 0.7F);

        ammoModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Import
        ammoModel[162].setRotationPoint(2.7F, -3.35F, 0.7F);

        ammoModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F); // Import
        ammoModel[163].setRotationPoint(3.2F, -3.35F, 0.7F);

        ammoModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.45F, -0.4F, -0.45F, -0.475F, -0.4F, -0.45F, -0.475F, -0.4F, -0.4F, -0.45F, -0.4F, -0.55F, -0.4F, -0.4F, -0.525F, -0.45F, -0.4F, -0.525F, -0.45F, -0.4F, -0.55F, -0.4F); // Import
        ammoModel[164].setRotationPoint(3.5F, -3.35F, 0.7F);

        ammoModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.4F, -0.4F, -0.475F, -0.45F, -0.4F, -0.475F, -0.45F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.475F, -0.45F, -0.4F, -0.475F, -0.45F, -0.4F, -0.45F, -0.4F); // Import
        ammoModel[165].setRotationPoint(3.5F, -3.35F, 0.7F);

        ammoModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F); // Import
        ammoModel[166].setRotationPoint(3.2F, -3.35F, 0.7F);

        ammoModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.4F, -0.4F, -0.525F, -0.45F, -0.4F, -0.525F, -0.45F, -0.4F, -0.55F, -0.4F, -0.4F, -0.4F, -0.45F, -0.4F, -0.45F, -0.475F, -0.4F, -0.45F, -0.475F, -0.4F, -0.4F, -0.45F); // Import
        ammoModel[167].setRotationPoint(3.5F, -3.35F, 0.7F);

        ammoModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F); // Import
        ammoModel[168].setRotationPoint(3.2F, -3.35F, 0.7F);

        ammoModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F); // Import
        ammoModel[169].setRotationPoint(2.5F, -3.35F, 0.4F);

        ammoModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F); // Import
        ammoModel[170].setRotationPoint(2.5F, -3.35F, 0.4F);

        ammoModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F); // Import
        ammoModel[171].setRotationPoint(2.5F, -3.35F, 0.4F);

        ammoModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F); // Import
        ammoModel[172].setRotationPoint(2.2F, -3.35F, 0.4F);

        ammoModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Import
        ammoModel[173].setRotationPoint(2.2F, -3.35F, 0.4F);

        ammoModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F); // Import
        ammoModel[174].setRotationPoint(2.4F, -3.35F, 0.4F);

        ammoModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Import
        ammoModel[175].setRotationPoint(2.4F, -3.35F, 0.4F);

        ammoModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F); // Import
        ammoModel[176].setRotationPoint(2.7F, -3.35F, 0.4F);

        ammoModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F); // Import
        ammoModel[177].setRotationPoint(2.45F, -3.35F, 0.4F);

        ammoModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Import
        ammoModel[178].setRotationPoint(2.7F, -3.35F, 0.4F);

        ammoModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F); // Import
        ammoModel[179].setRotationPoint(3.2F, -3.35F, 0.4F);

        ammoModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.45F, -0.4F, -0.45F, -0.475F, -0.4F, -0.45F, -0.475F, -0.4F, -0.4F, -0.45F, -0.4F, -0.55F, -0.4F, -0.4F, -0.525F, -0.45F, -0.4F, -0.525F, -0.45F, -0.4F, -0.55F, -0.4F); // Import
        ammoModel[180].setRotationPoint(3.5F, -3.35F, 0.4F);

        ammoModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.4F, -0.4F, -0.475F, -0.45F, -0.4F, -0.475F, -0.45F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.475F, -0.45F, -0.4F, -0.475F, -0.45F, -0.4F, -0.45F, -0.4F); // Import
        ammoModel[181].setRotationPoint(3.5F, -3.35F, 0.4F);

        ammoModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F); // Import
        ammoModel[182].setRotationPoint(3.2F, -3.35F, 0.4F);

        ammoModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.4F, -0.4F, -0.525F, -0.45F, -0.4F, -0.525F, -0.45F, -0.4F, -0.55F, -0.4F, -0.4F, -0.4F, -0.45F, -0.4F, -0.45F, -0.475F, -0.4F, -0.45F, -0.475F, -0.4F, -0.4F, -0.45F); // Import
        ammoModel[183].setRotationPoint(3.5F, -3.35F, 0.4F);

        ammoModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F); // Import
        ammoModel[184].setRotationPoint(3.2F, -3.35F, 0.4F);

        ammoModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F); // Import
        ammoModel[185].setRotationPoint(2.5F, -3.35F, 0.1F);

        ammoModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F, 0.0F, -0.45F, -0.375F); // Import
        ammoModel[186].setRotationPoint(2.5F, -3.35F, 0.1F);

        ammoModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.55F, -0.375F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F, 0.0F, -0.375F, -0.45F); // Import
        ammoModel[187].setRotationPoint(2.5F, -3.35F, 0.1F);

        ammoModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F); // Import
        ammoModel[188].setRotationPoint(2.2F, -3.35F, 0.1F);

        ammoModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Import
        ammoModel[189].setRotationPoint(2.2F, -3.35F, 0.1F);

        ammoModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F); // Import
        ammoModel[190].setRotationPoint(2.4F, -3.35F, 0.1F);

        ammoModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.55F, -0.35F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Import
        ammoModel[191].setRotationPoint(2.4F, -3.35F, 0.1F);

        ammoModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F); // Import
        ammoModel[192].setRotationPoint(2.7F, -3.35F, 0.1F);

        ammoModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F); // Import
        ammoModel[193].setRotationPoint(2.45F, -3.35F, 0.1F);

        ammoModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.55F, -0.35F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Import
        ammoModel[194].setRotationPoint(2.7F, -3.35F, 0.1F);

        ammoModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F); // Import
        ammoModel[195].setRotationPoint(3.2F, -3.35F, 0.1F);

        ammoModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.45F, -0.4F, -0.45F, -0.475F, -0.4F, -0.45F, -0.475F, -0.4F, -0.4F, -0.45F, -0.4F, -0.55F, -0.4F, -0.4F, -0.525F, -0.45F, -0.4F, -0.525F, -0.45F, -0.4F, -0.55F, -0.4F); // Import
        ammoModel[196].setRotationPoint(3.5F, -3.35F, 0.1F);

        ammoModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.4F, -0.4F, -0.475F, -0.45F, -0.4F, -0.475F, -0.45F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.475F, -0.45F, -0.4F, -0.475F, -0.45F, -0.4F, -0.45F, -0.4F); // Import
        ammoModel[197].setRotationPoint(3.5F, -3.35F, 0.1F);

        ammoModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F); // Import
        ammoModel[198].setRotationPoint(3.2F, -3.35F, 0.1F);

        ammoModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.55F, -0.4F, -0.4F, -0.525F, -0.45F, -0.4F, -0.525F, -0.45F, -0.4F, -0.55F, -0.4F, -0.4F, -0.4F, -0.45F, -0.4F, -0.45F, -0.475F, -0.4F, -0.45F, -0.475F, -0.4F, -0.4F, -0.45F); // Import
        ammoModel[199].setRotationPoint(3.5F, -3.35F, 0.1F);

        ammoModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.55F, -0.4F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F); // Import
        ammoModel[200].setRotationPoint(3.2F, -3.35F, 0.1F);
    }
}