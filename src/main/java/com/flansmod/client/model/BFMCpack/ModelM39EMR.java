//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: M39EMR
// Model Creator: 
// Created on: 28.03.2022 - 15:05:06
// Last changed on: 28.03.2022 - 15:05:06

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelM39EMR extends ModelGun //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public ModelM39EMR() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[989];
        ammoModel = new ModelRendererTurbo[1];
        slideModel = new ModelRendererTurbo[23];

        initgunModel_1();
        initgunModel_2();
        initammoModel_1();
        initslideModel_1();
        barrelAttachPoint = new Vector3f(134F / 16F, 56F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(90F / 16F, 52F / 16F, -7F / 16F);
        scopeAttachPoint = new Vector3f(40F / 16F, 63F / 16F, 0F / 16F);
        gripAttachPoint = new Vector3f(88 / 16F, 43F / 16F, 0F / 16F);
        thirdPersonOffset = new Vector3f(0.0F, -0.05F, 0.0F);
        rightHandAmmo = false;
        leftHandAmmo = true;
        leftArmPos = new Vector3f(0.05F, -0.4F, -0.1F);
        leftArmRot = new Vector3f(80.0F, 50.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.12F, -0.55F, -0.05F);
        leftArmReloadRot = new Vector3f(80.0F, 48.0F, 0.0F);
        rightArmPos = new Vector3f(0.13F, -0.88F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -80.0F);
        rightArmReloadPos = new Vector3f(0.13F, -0.88F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -80.0F);
        rightArmScale = new Vector3f(0.7F, 1.3F, 0.7F);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
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

        translateAll(-10F, 0F, 0F);
        crouchZoom = -0.05F;
        gunOffset = -0.8F;
        gunSlideDistance = 2F;
        slideLockOnEmpty = true;


        //修正模型位移
        Vector3f vec3 = new Vector3f(20F, 0F, 0F);
        translateAll(vec3.x, -vec3.y, vec3.z);
        Vector3f attVec = new Vector3f(vec3.x / 16F, vec3.y / 16F, vec3.z / 16F);
        barrelAttachPoint = Vector3f.add(barrelAttachPoint, attVec, null);
        gadgetAttachPoint = Vector3f.add(gadgetAttachPoint, attVec, null);
        scopeAttachPoint = Vector3f.add(scopeAttachPoint, attVec, null);
        gripAttachPoint = Vector3f.add(gripAttachPoint, attVec, null);
        stockAttachPoint = Vector3f.add(stockAttachPoint, attVec, null);
        pumpAttachPoint = Vector3f.add(pumpAttachPoint, attVec, null);
        zoomOffsetY = -0.08F;
        zoomOffset = 0.2F;
        gunOffsetX = -7F;

        hasFlash = true;
        flashScale = 5F;
        muzzleFlashPoint = new Vector3f(
                barrelAttachPoint.x / flashScale,
                barrelAttachPoint.y / flashScale,
                barrelAttachPoint.z / flashScale
        );

        flipAll();
    }

    private void initgunModel_1() {
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import
        gunModel[1] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import
        gunModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import
        gunModel[3] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Import
        gunModel[4] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import
        gunModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import
        gunModel[6] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Import
        gunModel[7] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Import
        gunModel[8] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Import
        gunModel[9] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Import
        gunModel[10] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Import
        gunModel[11] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Import
        gunModel[12] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Import
        gunModel[13] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Import
        gunModel[14] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Import
        gunModel[15] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import
        gunModel[16] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Import
        gunModel[17] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Import
        gunModel[18] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Import
        gunModel[19] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import
        gunModel[20] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Import
        gunModel[21] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Import
        gunModel[22] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Import
        gunModel[23] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Import
        gunModel[24] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Import
        gunModel[25] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Import
        gunModel[26] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Import
        gunModel[27] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Import
        gunModel[28] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Import
        gunModel[29] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Import
        gunModel[30] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Import
        gunModel[31] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Import
        gunModel[32] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Import
        gunModel[33] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Import
        gunModel[34] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import
        gunModel[35] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Import
        gunModel[36] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import
        gunModel[37] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Import
        gunModel[38] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Import
        gunModel[39] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Import
        gunModel[40] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Import
        gunModel[41] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Import
        gunModel[42] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Import
        gunModel[43] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Import
        gunModel[44] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Import
        gunModel[45] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Import
        gunModel[46] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Import
        gunModel[47] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Import
        gunModel[48] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import
        gunModel[49] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Import
        gunModel[50] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Import
        gunModel[51] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Import
        gunModel[52] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Import
        gunModel[53] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import
        gunModel[54] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Import
        gunModel[55] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Import
        gunModel[56] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Import
        gunModel[57] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Import
        gunModel[58] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Import
        gunModel[59] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Import
        gunModel[60] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Import
        gunModel[61] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Import
        gunModel[62] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Import
        gunModel[63] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Import
        gunModel[64] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Import
        gunModel[65] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Import
        gunModel[66] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Import
        gunModel[67] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Import
        gunModel[68] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Import
        gunModel[69] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Import
        gunModel[70] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Import
        gunModel[71] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Import
        gunModel[72] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Import
        gunModel[73] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Import
        gunModel[74] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Import
        gunModel[75] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Import
        gunModel[76] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Import
        gunModel[77] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Import
        gunModel[78] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Import
        gunModel[79] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Import
        gunModel[80] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Import
        gunModel[81] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Import
        gunModel[82] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Import
        gunModel[83] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Import
        gunModel[84] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Import
        gunModel[85] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Import
        gunModel[86] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Import
        gunModel[87] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Import
        gunModel[88] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Import
        gunModel[89] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Import
        gunModel[90] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Import
        gunModel[91] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Import
        gunModel[92] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Import
        gunModel[93] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Import
        gunModel[94] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import
        gunModel[95] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Import
        gunModel[96] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Import
        gunModel[97] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Import
        gunModel[98] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Import
        gunModel[99] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Import
        gunModel[100] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Import
        gunModel[101] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Import
        gunModel[102] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import
        gunModel[103] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Import
        gunModel[104] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Import
        gunModel[105] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Import
        gunModel[106] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Import
        gunModel[107] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Import
        gunModel[108] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Import
        gunModel[109] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Import
        gunModel[110] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Import
        gunModel[111] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import
        gunModel[112] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Import
        gunModel[113] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Import
        gunModel[114] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Import
        gunModel[115] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Import
        gunModel[116] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Import
        gunModel[117] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Import
        gunModel[118] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Import
        gunModel[119] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Import
        gunModel[120] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import
        gunModel[121] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Import
        gunModel[122] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Import
        gunModel[123] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import
        gunModel[124] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Import
        gunModel[125] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Import
        gunModel[126] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Import
        gunModel[127] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Import
        gunModel[128] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Import
        gunModel[129] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Import
        gunModel[130] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Import
        gunModel[131] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Import
        gunModel[132] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Import
        gunModel[133] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Import
        gunModel[134] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Import
        gunModel[135] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Import
        gunModel[136] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Import
        gunModel[137] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Import
        gunModel[138] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Import
        gunModel[139] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import
        gunModel[140] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Import
        gunModel[141] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Import
        gunModel[142] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Import
        gunModel[143] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Import
        gunModel[144] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Import
        gunModel[145] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Import
        gunModel[146] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Import
        gunModel[147] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import
        gunModel[148] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Import
        gunModel[149] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Import
        gunModel[150] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Import
        gunModel[151] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Import
        gunModel[152] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Import
        gunModel[153] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Import
        gunModel[154] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Import
        gunModel[155] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Import
        gunModel[156] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Import
        gunModel[157] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Import
        gunModel[158] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Import
        gunModel[159] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import
        gunModel[160] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Import
        gunModel[161] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Import
        gunModel[162] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Import
        gunModel[163] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Import
        gunModel[164] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Import
        gunModel[165] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Import
        gunModel[166] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Import
        gunModel[167] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Import
        gunModel[168] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Import
        gunModel[169] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Import
        gunModel[170] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Import
        gunModel[171] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Import
        gunModel[172] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Import
        gunModel[173] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Import
        gunModel[174] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Import
        gunModel[175] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Import
        gunModel[176] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Import
        gunModel[177] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Import
        gunModel[178] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Import
        gunModel[179] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import
        gunModel[180] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Import
        gunModel[181] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Import
        gunModel[182] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Import
        gunModel[183] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Import
        gunModel[184] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Import
        gunModel[185] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Import
        gunModel[186] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Import
        gunModel[187] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Import
        gunModel[188] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Import
        gunModel[189] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Import
        gunModel[190] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Import
        gunModel[191] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Import
        gunModel[192] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Import
        gunModel[193] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Import
        gunModel[194] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Import
        gunModel[195] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Import
        gunModel[196] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Import
        gunModel[197] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import
        gunModel[198] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Import
        gunModel[199] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Import
        gunModel[200] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Import
        gunModel[201] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Import
        gunModel[202] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Import
        gunModel[203] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Import
        gunModel[204] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import
        gunModel[205] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Import
        gunModel[206] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Import
        gunModel[207] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Import
        gunModel[208] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Import
        gunModel[209] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Import
        gunModel[210] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Import
        gunModel[211] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Import
        gunModel[212] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Import
        gunModel[213] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Import
        gunModel[214] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Import
        gunModel[215] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import
        gunModel[216] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Import
        gunModel[217] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Import
        gunModel[218] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Import
        gunModel[219] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Import
        gunModel[220] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Import
        gunModel[221] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Import
        gunModel[222] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Import
        gunModel[223] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Import
        gunModel[224] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Import
        gunModel[225] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Import
        gunModel[226] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Import
        gunModel[227] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Import
        gunModel[228] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import
        gunModel[229] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Import
        gunModel[230] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Import
        gunModel[231] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Import
        gunModel[232] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Import
        gunModel[233] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Import
        gunModel[234] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Import
        gunModel[235] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Import
        gunModel[236] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Import
        gunModel[237] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Import
        gunModel[238] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Import
        gunModel[239] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Import
        gunModel[240] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Import
        gunModel[241] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Import
        gunModel[242] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Import
        gunModel[243] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Import
        gunModel[244] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Import
        gunModel[245] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Import
        gunModel[246] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Import
        gunModel[247] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Import
        gunModel[248] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Import
        gunModel[249] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Import
        gunModel[250] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Import
        gunModel[251] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Import
        gunModel[252] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Import
        gunModel[253] = new ModelRendererTurbo(this, 457, 145, textureX, textureY); // Import
        gunModel[254] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Import
        gunModel[255] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Import
        gunModel[256] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Import
        gunModel[257] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Import
        gunModel[258] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Import
        gunModel[259] = new ModelRendererTurbo(this, 153, 153, textureX, textureY); // Import
        gunModel[260] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Import
        gunModel[261] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Import
        gunModel[262] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Import
        gunModel[263] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Import
        gunModel[264] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Import
        gunModel[265] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Import
        gunModel[266] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Import
        gunModel[267] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Import
        gunModel[268] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Import
        gunModel[269] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Import
        gunModel[270] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Import
        gunModel[271] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Import
        gunModel[272] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Import
        gunModel[273] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Import
        gunModel[274] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Import
        gunModel[275] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Import
        gunModel[276] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Import
        gunModel[277] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Import
        gunModel[278] = new ModelRendererTurbo(this, 289, 161, textureX, textureY); // Import
        gunModel[279] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Import
        gunModel[280] = new ModelRendererTurbo(this, 289, 161, textureX, textureY); // Import
        gunModel[281] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Import
        gunModel[282] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Import
        gunModel[283] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Import
        gunModel[284] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Import
        gunModel[285] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Import
        gunModel[286] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Import
        gunModel[287] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Import
        gunModel[288] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Import
        gunModel[289] = new ModelRendererTurbo(this, 409, 161, textureX, textureY); // Import
        gunModel[290] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Import
        gunModel[291] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Import
        gunModel[292] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Import
        gunModel[293] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Import
        gunModel[294] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Import
        gunModel[295] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import
        gunModel[296] = new ModelRendererTurbo(this, 25, 169, textureX, textureY); // Import
        gunModel[297] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Import
        gunModel[298] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import
        gunModel[299] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Import
        gunModel[300] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Import
        gunModel[301] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Import
        gunModel[302] = new ModelRendererTurbo(this, 177, 169, textureX, textureY); // Import
        gunModel[303] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Import
        gunModel[304] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Import
        gunModel[305] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Import
        gunModel[306] = new ModelRendererTurbo(this, 161, 177, textureX, textureY); // Import
        gunModel[307] = new ModelRendererTurbo(this, 313, 169, textureX, textureY); // Import
        gunModel[308] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Import
        gunModel[309] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Import
        gunModel[310] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Import
        gunModel[311] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import
        gunModel[312] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Import
        gunModel[313] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Import
        gunModel[314] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Import
        gunModel[315] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Import
        gunModel[316] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Import
        gunModel[317] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Import
        gunModel[318] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Import
        gunModel[319] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Import
        gunModel[320] = new ModelRendererTurbo(this, 265, 177, textureX, textureY); // Import
        gunModel[321] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Import
        gunModel[322] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Import
        gunModel[323] = new ModelRendererTurbo(this, 369, 177, textureX, textureY); // Import
        gunModel[324] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Import
        gunModel[325] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Import
        gunModel[326] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Import
        gunModel[327] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Import
        gunModel[328] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Import
        gunModel[329] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Import
        gunModel[330] = new ModelRendererTurbo(this, 153, 185, textureX, textureY); // Import
        gunModel[331] = new ModelRendererTurbo(this, 217, 185, textureX, textureY); // Import
        gunModel[332] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Import
        gunModel[333] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Import
        gunModel[334] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Import
        gunModel[335] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Import
        gunModel[336] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Import
        gunModel[337] = new ModelRendererTurbo(this, 73, 193, textureX, textureY); // Import
        gunModel[338] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Import
        gunModel[339] = new ModelRendererTurbo(this, 17, 169, textureX, textureY); // Import
        gunModel[340] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Import
        gunModel[341] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Import
        gunModel[342] = new ModelRendererTurbo(this, 137, 193, textureX, textureY); // Import
        gunModel[343] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Import
        gunModel[344] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Import
        gunModel[345] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Import
        gunModel[346] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import
        gunModel[347] = new ModelRendererTurbo(this, 41, 169, textureX, textureY); // Import
        gunModel[348] = new ModelRendererTurbo(this, 209, 193, textureX, textureY); // Import
        gunModel[349] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Import
        gunModel[350] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Import
        gunModel[351] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Import
        gunModel[352] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Import
        gunModel[353] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Import
        gunModel[354] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Import
        gunModel[355] = new ModelRendererTurbo(this, 249, 193, textureX, textureY); // Import
        gunModel[356] = new ModelRendererTurbo(this, 273, 193, textureX, textureY); // Import
        gunModel[357] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Import
        gunModel[358] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Import
        gunModel[359] = new ModelRendererTurbo(this, 161, 193, textureX, textureY); // Import
        gunModel[360] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Import
        gunModel[361] = new ModelRendererTurbo(this, 489, 193, textureX, textureY); // Import
        gunModel[362] = new ModelRendererTurbo(this, 113, 201, textureX, textureY); // Import
        gunModel[363] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Import
        gunModel[364] = new ModelRendererTurbo(this, 129, 193, textureX, textureY); // Import
        gunModel[365] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Import
        gunModel[366] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import
        gunModel[367] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Import
        gunModel[368] = new ModelRendererTurbo(this, 193, 201, textureX, textureY); // Import
        gunModel[369] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Import
        gunModel[370] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Import
        gunModel[371] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Import
        gunModel[372] = new ModelRendererTurbo(this, 161, 177, textureX, textureY); // Import
        gunModel[373] = new ModelRendererTurbo(this, 201, 201, textureX, textureY); // Import
        gunModel[374] = new ModelRendererTurbo(this, 233, 201, textureX, textureY); // Import
        gunModel[375] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Import
        gunModel[376] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Import
        gunModel[377] = new ModelRendererTurbo(this, 281, 201, textureX, textureY); // Import
        gunModel[378] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Import
        gunModel[379] = new ModelRendererTurbo(this, 297, 201, textureX, textureY); // Import
        gunModel[380] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Import
        gunModel[381] = new ModelRendererTurbo(this, 313, 169, textureX, textureY); // Import
        gunModel[382] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Import
        gunModel[383] = new ModelRendererTurbo(this, 361, 177, textureX, textureY); // Import
        gunModel[384] = new ModelRendererTurbo(this, 313, 201, textureX, textureY); // Import
        gunModel[385] = new ModelRendererTurbo(this, 417, 201, textureX, textureY); // Import
        gunModel[386] = new ModelRendererTurbo(this, 473, 201, textureX, textureY); // Import
        gunModel[387] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Import
        gunModel[388] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Import
        gunModel[389] = new ModelRendererTurbo(this, 369, 177, textureX, textureY); // Import
        gunModel[390] = new ModelRendererTurbo(this, 17, 209, textureX, textureY); // Import
        gunModel[391] = new ModelRendererTurbo(this, 393, 177, textureX, textureY); // Import
        gunModel[392] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Import
        gunModel[393] = new ModelRendererTurbo(this, 17, 209, textureX, textureY); // Import
        gunModel[394] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Import
        gunModel[395] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Import
        gunModel[396] = new ModelRendererTurbo(this, 81, 209, textureX, textureY); // Import
        gunModel[397] = new ModelRendererTurbo(this, 113, 209, textureX, textureY); // Import
        gunModel[398] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Import
        gunModel[399] = new ModelRendererTurbo(this, 297, 209, textureX, textureY); // Import
        gunModel[400] = new ModelRendererTurbo(this, 329, 209, textureX, textureY); // Import
        gunModel[401] = new ModelRendererTurbo(this, 353, 209, textureX, textureY); // Import
        gunModel[402] = new ModelRendererTurbo(this, 377, 209, textureX, textureY); // Import
        gunModel[403] = new ModelRendererTurbo(this, 401, 209, textureX, textureY); // Import
        gunModel[404] = new ModelRendererTurbo(this, 425, 209, textureX, textureY); // Import
        gunModel[405] = new ModelRendererTurbo(this, 449, 209, textureX, textureY); // Import
        gunModel[406] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Import
        gunModel[407] = new ModelRendererTurbo(this, 49, 217, textureX, textureY); // Import
        gunModel[408] = new ModelRendererTurbo(this, 169, 217, textureX, textureY); // Import
        gunModel[409] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Import
        gunModel[410] = new ModelRendererTurbo(this, 105, 209, textureX, textureY); // Import
        gunModel[411] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Import
        gunModel[412] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Import
        gunModel[413] = new ModelRendererTurbo(this, 193, 209, textureX, textureY); // Import
        gunModel[414] = new ModelRendererTurbo(this, 137, 209, textureX, textureY); // Import
        gunModel[415] = new ModelRendererTurbo(this, 233, 209, textureX, textureY); // Import
        gunModel[416] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Import
        gunModel[417] = new ModelRendererTurbo(this, 145, 185, textureX, textureY); // Import
        gunModel[418] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Import
        gunModel[419] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Import
        gunModel[420] = new ModelRendererTurbo(this, 17, 193, textureX, textureY); // Import
        gunModel[421] = new ModelRendererTurbo(this, 65, 217, textureX, textureY); // Import
        gunModel[422] = new ModelRendererTurbo(this, 185, 217, textureX, textureY); // Import
        gunModel[423] = new ModelRendererTurbo(this, 41, 193, textureX, textureY); // Import
        gunModel[424] = new ModelRendererTurbo(this, 473, 217, textureX, textureY); // Import
        gunModel[425] = new ModelRendererTurbo(this, 17, 225, textureX, textureY); // Import
        gunModel[426] = new ModelRendererTurbo(this, 257, 201, textureX, textureY); // Import
        gunModel[427] = new ModelRendererTurbo(this, 497, 209, textureX, textureY); // Import
        gunModel[428] = new ModelRendererTurbo(this, 73, 225, textureX, textureY); // Import
        gunModel[429] = new ModelRendererTurbo(this, 97, 225, textureX, textureY); // Import
        gunModel[430] = new ModelRendererTurbo(this, 241, 217, textureX, textureY); // Import
        gunModel[431] = new ModelRendererTurbo(this, 113, 225, textureX, textureY); // Import
        gunModel[432] = new ModelRendererTurbo(this, 137, 225, textureX, textureY); // Import
        gunModel[433] = new ModelRendererTurbo(this, 193, 225, textureX, textureY); // Import
        gunModel[434] = new ModelRendererTurbo(this, 161, 225, textureX, textureY); // Import
        gunModel[435] = new ModelRendererTurbo(this, 217, 225, textureX, textureY); // Import
        gunModel[436] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Import
        gunModel[437] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Import
        gunModel[438] = new ModelRendererTurbo(this, 233, 225, textureX, textureY); // Import
        gunModel[439] = new ModelRendererTurbo(this, 249, 225, textureX, textureY); // Import
        gunModel[440] = new ModelRendererTurbo(this, 73, 193, textureX, textureY); // Import
        gunModel[441] = new ModelRendererTurbo(this, 177, 193, textureX, textureY); // Import
        gunModel[442] = new ModelRendererTurbo(this, 257, 225, textureX, textureY); // Import
        gunModel[443] = new ModelRendererTurbo(this, 169, 209, textureX, textureY); // Import
        gunModel[444] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Import
        gunModel[445] = new ModelRendererTurbo(this, 257, 209, textureX, textureY); // Import
        gunModel[446] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Import
        gunModel[447] = new ModelRendererTurbo(this, 105, 201, textureX, textureY); // Import
        gunModel[448] = new ModelRendererTurbo(this, 505, 193, textureX, textureY); // Import
        gunModel[449] = new ModelRendererTurbo(this, 265, 225, textureX, textureY); // Import
        gunModel[450] = new ModelRendererTurbo(this, 297, 209, textureX, textureY); // Import
        gunModel[451] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Import
        gunModel[452] = new ModelRendererTurbo(this, 289, 201, textureX, textureY); // Import
        gunModel[453] = new ModelRendererTurbo(this, 297, 201, textureX, textureY); // Import
        gunModel[454] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Import
        gunModel[455] = new ModelRendererTurbo(this, 105, 209, textureX, textureY); // Import
        gunModel[456] = new ModelRendererTurbo(this, 209, 209, textureX, textureY); // Import
        gunModel[457] = new ModelRendererTurbo(this, 321, 209, textureX, textureY); // Import
        gunModel[458] = new ModelRendererTurbo(this, 329, 209, textureX, textureY); // Import
        gunModel[459] = new ModelRendererTurbo(this, 345, 209, textureX, textureY); // Import
        gunModel[460] = new ModelRendererTurbo(this, 281, 225, textureX, textureY); // Import
        gunModel[461] = new ModelRendererTurbo(this, 305, 225, textureX, textureY); // Import
        gunModel[462] = new ModelRendererTurbo(this, 353, 209, textureX, textureY); // Import
        gunModel[463] = new ModelRendererTurbo(this, 369, 209, textureX, textureY); // Import
        gunModel[464] = new ModelRendererTurbo(this, 313, 225, textureX, textureY); // Import
        gunModel[465] = new ModelRendererTurbo(this, 393, 209, textureX, textureY); // Import
        gunModel[466] = new ModelRendererTurbo(this, 377, 209, textureX, textureY); // Import
        gunModel[467] = new ModelRendererTurbo(this, 417, 209, textureX, textureY); // Import
        gunModel[468] = new ModelRendererTurbo(this, 441, 209, textureX, textureY); // Import
        gunModel[469] = new ModelRendererTurbo(this, 449, 209, textureX, textureY); // Import
        gunModel[470] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Import
        gunModel[471] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Import
        gunModel[472] = new ModelRendererTurbo(this, 505, 209, textureX, textureY); // Import
        gunModel[473] = new ModelRendererTurbo(this, 321, 225, textureX, textureY); // Import
        gunModel[474] = new ModelRendererTurbo(this, 329, 225, textureX, textureY); // Import
        gunModel[475] = new ModelRendererTurbo(this, 41, 225, textureX, textureY); // Import
        gunModel[476] = new ModelRendererTurbo(this, 345, 225, textureX, textureY); // Import
        gunModel[477] = new ModelRendererTurbo(this, 17, 217, textureX, textureY); // Import
        gunModel[478] = new ModelRendererTurbo(this, 49, 217, textureX, textureY); // Import
        gunModel[479] = new ModelRendererTurbo(this, 489, 217, textureX, textureY); // Import
        gunModel[480] = new ModelRendererTurbo(this, 73, 225, textureX, textureY); // Import
        gunModel[481] = new ModelRendererTurbo(this, 129, 225, textureX, textureY); // Import
        gunModel[482] = new ModelRendererTurbo(this, 137, 225, textureX, textureY); // Import
        gunModel[483] = new ModelRendererTurbo(this, 153, 225, textureX, textureY); // Import
        gunModel[484] = new ModelRendererTurbo(this, 353, 225, textureX, textureY); // Import
        gunModel[485] = new ModelRendererTurbo(this, 361, 225, textureX, textureY); // Import
        gunModel[486] = new ModelRendererTurbo(this, 369, 225, textureX, textureY); // Import
        gunModel[487] = new ModelRendererTurbo(this, 385, 225, textureX, textureY); // Import
        gunModel[488] = new ModelRendererTurbo(this, 425, 225, textureX, textureY); // Import
        gunModel[489] = new ModelRendererTurbo(this, 465, 225, textureX, textureY); // Import
        gunModel[490] = new ModelRendererTurbo(this, 41, 233, textureX, textureY); // Import
        gunModel[491] = new ModelRendererTurbo(this, 161, 233, textureX, textureY); // Import
        gunModel[492] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Import
        gunModel[493] = new ModelRendererTurbo(this, 385, 225, textureX, textureY); // Import
        gunModel[494] = new ModelRendererTurbo(this, 417, 225, textureX, textureY); // Import
        gunModel[495] = new ModelRendererTurbo(this, 457, 225, textureX, textureY); // Import
        gunModel[496] = new ModelRendererTurbo(this, 257, 241, textureX, textureY); // Import
        gunModel[497] = new ModelRendererTurbo(this, 105, 249, textureX, textureY); // Import
        gunModel[498] = new ModelRendererTurbo(this, 81, 241, textureX, textureY); // Import
        gunModel[499] = new ModelRendererTurbo(this, 505, 225, textureX, textureY); // Import

        gunModel[0].addShapeBox(0F, 0F, 0F, 119, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[0].setRotationPoint(25F, -58F, -1F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 119, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[1].setRotationPoint(25F, -57F, 1F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 119, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[2].setRotationPoint(25F, -57F, -2F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 119, 1, 2, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[3].setRotationPoint(25F, -55F, -1F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[4].setRotationPoint(128F, -59F, -1F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 60, 5, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[5].setRotationPoint(74F, -52F, -1.5F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 60, 5, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[6].setRotationPoint(74F, -52F, 1.5F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 60, 5, 1, 0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[7].setRotationPoint(74F, -52F, -2.5F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[8].setRotationPoint(136F, -51F, -0.5F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[9].setRotationPoint(136F, -51F, 0.5F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[10].setRotationPoint(136F, -51F, -1.5F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[11].setRotationPoint(134F, -52F, -2.5F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[12].setRotationPoint(134F, -52F, 1.5F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[13].setRotationPoint(134F, -52F, -1.5F);

        gunModel[14].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[14].setRotationPoint(139F, -49.5F, 1.11022302462516E-16F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[15].setRotationPoint(128F, -50.5F, -3F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[16].setRotationPoint(128F, -47.5F, -1F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[17].setRotationPoint(128F, -59F, 1F);

        gunModel[18].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[18].setRotationPoint(128F, -48.5F, -3F);

        gunModel[19].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[19].setRotationPoint(128F, -52.5F, -3F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[20].setRotationPoint(128F, -57F, 2F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[21].setRotationPoint(128F, -57F, -3F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[22].setRotationPoint(128F, -59F, -3F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[23].setRotationPoint(128F, -55F, -3F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F); // Import
        gunModel[24].setRotationPoint(128F, -55F, 1F);

        gunModel[25].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[25].setRotationPoint(128F, -54F, -1F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[26].setRotationPoint(128F, -53F, -1F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[27].setRotationPoint(132F, -63F, -2F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[28].setRotationPoint(119F, -59F, -1F);

        gunModel[29].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[29].setRotationPoint(119F, -59F, -3F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[30].setRotationPoint(119F, -59F, 1F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[31].setRotationPoint(119F, -57F, 2F);

        gunModel[32].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[32].setRotationPoint(119F, -57F, -3F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[33].setRotationPoint(119F, -55F, -3F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[34].setRotationPoint(119.5F, -53F, -4F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[35].setRotationPoint(119F, -51F, -3F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[36].setRotationPoint(119F, -48F, -2.55F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[37].setRotationPoint(118F, -57F, 3F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[38].setRotationPoint(118F, -46F, 1.11022302462516E-16F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 2, 11, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[39].setRotationPoint(117F, -57F, 5F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[40].setRotationPoint(118F, -57F, -5F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 2, 11, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[41].setRotationPoint(117F, -57F, -6F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 88, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[42].setRotationPoint(29F, -56F, 5F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 35, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[43].setRotationPoint(82F, -51F, 5F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[44].setRotationPoint(39F, -47F, 5F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[45].setRotationPoint(79F, -58.5F, 5F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[46].setRotationPoint(75F, -52.5F, 5F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[47].setRotationPoint(82F, -53.5F, 5F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[48].setRotationPoint(29F, -53F, 5F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[49].setRotationPoint(39F, -50F, 5F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[50].setRotationPoint(115F, -53.5F, 5F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[51].setRotationPoint(107F, -58.5F, 5F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[52].setRotationPoint(98F, -58.5F, 5F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[53].setRotationPoint(89F, -58.5F, 5F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[54].setRotationPoint(74F, -58.5F, 5F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[55].setRotationPoint(116F, -56.5F, 5F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[56].setRotationPoint(107F, -56.5F, 5F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[57].setRotationPoint(98F, -56.5F, 5F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[58].setRotationPoint(89F, -56.5F, 5F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[59].setRotationPoint(74F, -56.5F, 5F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[60].setRotationPoint(65F, -58.5F, 5F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[61].setRotationPoint(65F, -56.5F, 5F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[62].setRotationPoint(56F, -56.5F, 5F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[63].setRotationPoint(56F, -58.5F, 5F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[64].setRotationPoint(47F, -58.5F, 5F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[65].setRotationPoint(38F, -58.5F, 5F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[66].setRotationPoint(38F, -56.5F, 5F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[67].setRotationPoint(47F, -56.5F, 5F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[68].setRotationPoint(29F, -59F, 5F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[69].setRotationPoint(82F, -51.5F, 5F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[70].setRotationPoint(115F, -51.5F, 5F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[71].setRotationPoint(116F, -49.5F, 5F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[72].setRotationPoint(116F, -47.5F, 5F);

        gunModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[73].setRotationPoint(107F, -47.5F, 5F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[74].setRotationPoint(107F, -49.5F, 5F);

        gunModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[75].setRotationPoint(98F, -49.5F, 5F);

        gunModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[76].setRotationPoint(89F, -49.5F, 5F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[77].setRotationPoint(65F, -49.5F, 5F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[78].setRotationPoint(65F, -47.5F, 5F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[79].setRotationPoint(89F, -47.5F, 5F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[80].setRotationPoint(98F, -47.5F, 5F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[81].setRotationPoint(74F, -49.5F, 5F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[82].setRotationPoint(74F, -47.5F, 5F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[83].setRotationPoint(56F, -49.5F, 5F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[84].setRotationPoint(56F, -47.5F, 5F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[85].setRotationPoint(47F, -47.5F, 5F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[86].setRotationPoint(39F, -47.5F, 5F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[87].setRotationPoint(39F, -49.5F, 5F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[88].setRotationPoint(47F, -49.5F, 5F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[89].setRotationPoint(67F, -51.5F, 5F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[90].setRotationPoint(63F, -51.5F, 5F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[91].setRotationPoint(59F, -51.5F, 5F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[92].setRotationPoint(71F, -51.5F, 5F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[93].setRotationPoint(53F, -51.5F, 5F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[94].setRotationPoint(49F, -51.5F, 5F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[95].setRotationPoint(45F, -51.5F, 5F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[96].setRotationPoint(39F, -51.5F, 5F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[97].setRotationPoint(116F, -57F, 3F);

        gunModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[98].setRotationPoint(116F, -59F, 4F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[99].setRotationPoint(116F, -59F, 3F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[100].setRotationPoint(117F, -58F, 4F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 87, 1, 6, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F); // Import
        gunModel[101].setRotationPoint(32F, -63F, -3F);

        gunModel[102].addShapeBox(0F, -1F, 0F, 87, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[102].setRotationPoint(29F, -60F, 3F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[103].setRotationPoint(118F, -60F, -4F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[104].setRotationPoint(117F, -60F, -4F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[105].setRotationPoint(117F, -60F, 3F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[106].setRotationPoint(116F, -61F, 3F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[107].setRotationPoint(116F, -59F, -4F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[108].setRotationPoint(116F, -61F, -6F);

        gunModel[109].addShapeBox(0F, -1F, 0F, 44, 1, 1, 0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[109].setRotationPoint(33F, -59F, -6F);

        gunModel[110].addShapeBox(0F, -1F, 0F, 83, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[110].setRotationPoint(33F, -60F, -4F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 44, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[111].setRotationPoint(33F, -59F, -6F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[112].setRotationPoint(116F, -59F, -5F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[113].setRotationPoint(116F, -57F, -5F);

        gunModel[114].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[114].setRotationPoint(79F, -58.5F, -6F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[115].setRotationPoint(116F, -56.5F, -6F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 49, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[116].setRotationPoint(33F, -53F, -6F);

        gunModel[117].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[117].setRotationPoint(39F, -50F, -6F);

        gunModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[118].setRotationPoint(39F, -49.5F, -6F);

        gunModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[119].setRotationPoint(39F, -47.5F, -6F);

        gunModel[120].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[120].setRotationPoint(39F, -47F, -6F);

        gunModel[121].addShapeBox(0F, 0F, 0F, 36, 4, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[121].setRotationPoint(40F, -55F, -7F);

        gunModel[122].addShapeBox(0F, 0F, 0F, 90, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[122].setRotationPoint(29F, -61F, -3F);

        gunModel[123].addShapeBox(0F, 0F, 0F, 79, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F); // Import
        gunModel[123].setRotationPoint(39F, -46F, -6F);

        gunModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[124].setRotationPoint(118F, -47F, -3F);

        gunModel[125].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[125].setRotationPoint(107F, -58.5F, -6F);

        gunModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[126].setRotationPoint(107F, -56.5F, -6F);

        gunModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[127].setRotationPoint(98F, -58.5F, -6F);

        gunModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[128].setRotationPoint(89F, -56.5F, -6F);

        gunModel[129].addShapeBox(0F, 0F, 0F, 43, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[129].setRotationPoint(74F, -56F, -6F);

        gunModel[130].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 4.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[130].setRotationPoint(22F, -51F, 5F);

        gunModel[131].addShapeBox(0F, 0F, 0F, 65, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[131].setRotationPoint(-26F, -52F, 5F);

        gunModel[132].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F); // Import
        gunModel[132].setRotationPoint(29F, -50F, 5F);

        gunModel[133].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[133].setRotationPoint(40F, -59F, 6F);

        gunModel[134].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[134].setRotationPoint(40F, -55F, 6F);

        gunModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[135].setRotationPoint(47F, -49.5F, -6F);

        gunModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[136].setRotationPoint(47F, -47.5F, -6F);

        gunModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[137].setRotationPoint(56F, -49.5F, -6F);

        gunModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[138].setRotationPoint(56F, -47.5F, -6F);

        gunModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[139].setRotationPoint(65F, -49.5F, -6F);

        gunModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[140].setRotationPoint(65F, -47.5F, -6F);

        gunModel[141].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[141].setRotationPoint(74F, -49.5F, -6F);

        gunModel[142].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[142].setRotationPoint(74F, -47.5F, -6F);

        gunModel[143].addShapeBox(0F, 0F, 0F, 35, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[143].setRotationPoint(82F, -51F, -6F);

        gunModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[144].setRotationPoint(89F, -49.5F, -6F);

        gunModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[145].setRotationPoint(89F, -47.5F, -6F);

        gunModel[146].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[146].setRotationPoint(98F, -49.5F, -6F);

        gunModel[147].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[147].setRotationPoint(98F, -47.5F, -6F);

        gunModel[148].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[148].setRotationPoint(107F, -49.5F, -6F);

        gunModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[149].setRotationPoint(107F, -47.5F, -6F);

        gunModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[150].setRotationPoint(116F, -49.5F, -6F);

        gunModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[151].setRotationPoint(116F, -47.5F, -6F);

        gunModel[152].addShapeBox(0F, -1F, 0F, 37, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[152].setRotationPoint(79F, -59F, 5F);

        gunModel[153].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[153].setRotationPoint(79F, -59F, 5F);

        gunModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[154].setRotationPoint(116F, -58.5F, 5F);

        gunModel[155].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[155].setRotationPoint(79F, -60F, 3F);

        gunModel[156].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[156].setRotationPoint(77F, -57F, 3F);

        gunModel[157].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[157].setRotationPoint(76F, -60F, 3F);

        gunModel[158].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[158].setRotationPoint(77F, -61F, 3F);

        gunModel[159].addShapeBox(0F, 0F, 0F, 39, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[159].setRotationPoint(38F, -59F, 5F);

        gunModel[160].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[160].setRotationPoint(29F, -57F, 5F);

        gunModel[161].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[161].setRotationPoint(33F, -59F, 5F);

        gunModel[162].addShapeBox(0F, -1F, 0F, 39, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[162].setRotationPoint(38F, -59F, 5F);

        gunModel[163].addShapeBox(0F, -1F, 0F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F); // Import
        gunModel[163].setRotationPoint(33F, -60F, 4F);

        gunModel[164].addShapeBox(0F, -1F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F); // Import
        gunModel[164].setRotationPoint(29F, -60F, 4F);

        gunModel[165].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[165].setRotationPoint(30F, -60F, 4F);

        gunModel[166].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[166].setRotationPoint(33F, -60F, 4F);

        gunModel[167].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[167].setRotationPoint(38F, -60F, 4F);

        gunModel[168].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[168].setRotationPoint(30F, -57F, 4F);

        gunModel[169].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[169].setRotationPoint(29F, -61F, 3F);

        gunModel[170].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[170].setRotationPoint(76F, -60F, -5F);

        gunModel[171].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[171].setRotationPoint(77F, -61F, -4F);

        gunModel[172].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[172].setRotationPoint(79F, -60F, -5F);

        gunModel[173].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[173].setRotationPoint(77F, -57F, -6F);

        gunModel[174].addShapeBox(0F, -1F, 0F, 37, 1, 1, 0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[174].setRotationPoint(79F, -59F, -6F);

        gunModel[175].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[175].setRotationPoint(79F, -59F, -6F);

        gunModel[176].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[176].setRotationPoint(74F, -56.5F, -6F);

        gunModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[177].setRotationPoint(116F, -58.5F, -6F);

        gunModel[178].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[178].setRotationPoint(74F, -58.5F, -6F);

        gunModel[179].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[179].setRotationPoint(75F, -51.5F, -6F);

        gunModel[180].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[180].setRotationPoint(82F, -51.5F, -6F);

        gunModel[181].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[181].setRotationPoint(82F, -53.5F, -6F);

        gunModel[182].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[182].setRotationPoint(115F, -53.5F, -6F);

        gunModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[183].setRotationPoint(115F, -51.5F, -6F);

        gunModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[184].setRotationPoint(71F, -51.5F, -6F);

        gunModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[185].setRotationPoint(67F, -51.5F, -6F);

        gunModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[186].setRotationPoint(63F, -51.5F, -6F);

        gunModel[187].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[187].setRotationPoint(59F, -51.5F, -6F);

        gunModel[188].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[188].setRotationPoint(53F, -51.5F, -6F);

        gunModel[189].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[189].setRotationPoint(49F, -51.5F, -6F);

        gunModel[190].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[190].setRotationPoint(45F, -51.5F, -6F);

        gunModel[191].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[191].setRotationPoint(33F, -52F, -6F);

        gunModel[192].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F); // Import
        gunModel[192].setRotationPoint(38F, -50F, -6F);

        gunModel[193].addShapeBox(0F, 0F, 0F, 85, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[193].setRotationPoint(32F, -45F, -3F);

        gunModel[194].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, -1F, 0.0F, -1F); // Import
        gunModel[194].setRotationPoint(37F, -43F, -3F);

        gunModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F); // Import
        gunModel[195].setRotationPoint(43F, -43F, -3F);

        gunModel[196].addShapeBox(0F, 0F, 0F, 34, 6, 1, 0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[196].setRotationPoint(83F, -55F, 6F);

        gunModel[197].addShapeBox(0F, 0F, 0F, 34, 6, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F); // Import
        gunModel[197].setRotationPoint(83F, -55F, -7F);

        gunModel[198].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F); // Import
        gunModel[198].setRotationPoint(83F, -55F, 7F);

        gunModel[199].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[199].setRotationPoint(83F, -55F, -8F);

        gunModel[200].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[200].setRotationPoint(40F, -51F, -7F);

        gunModel[201].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[201].setRotationPoint(40F, -50F, -7F);

        gunModel[202].addShapeBox(0F, 0F, 0F, 44, 2, 2, 0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[202].setRotationPoint(39F, -49F, -8F);

        gunModel[203].addShapeBox(0F, 0F, 0F, 44, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[203].setRotationPoint(39F, -47F, -8F);

        gunModel[204].addShapeBox(0F, 0F, 0F, 51, 4, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[204].setRotationPoint(32F, -44F, -8F);

        gunModel[205].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[205].setRotationPoint(32F, -55F, -8F);

        gunModel[206].addShapeBox(0F, 0F, 0F, 7, 10, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[206].setRotationPoint(32F, -54F, -8F);

        gunModel[207].addShapeBox(0F, 0F, 0F, 42, 2, 1, 0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[207].setRotationPoint(33F, -59F, -7F);

        gunModel[208].addShapeBox(0F, 0F, 0F, 44, 2, 1, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[208].setRotationPoint(32F, -57F, -7F);

        gunModel[209].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[209].setRotationPoint(39F, -55F, -8F);

        gunModel[210].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[210].setRotationPoint(32F, -49F, 7F);

        gunModel[211].addShapeBox(0F, 0F, 0F, 51, 1, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[211].setRotationPoint(32F, -41F, -4F);

        gunModel[212].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[212].setRotationPoint(89F, -58.5F, -6F);

        gunModel[213].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[213].setRotationPoint(98F, -56.5F, -6F);

        gunModel[214].addShapeBox(0F, 0F, 0F, 51, 4, 4, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[214].setRotationPoint(32F, -44F, 4F);

        gunModel[215].addShapeBox(0F, 0F, 0F, 51, 4, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[215].setRotationPoint(32F, -48F, 7F);

        gunModel[216].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[216].setRotationPoint(32F, -55F, 7F);

        gunModel[217].addShapeBox(0F, 0F, 0F, 44, 2, 2, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[217].setRotationPoint(39F, -49F, 6F);

        gunModel[218].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[218].setRotationPoint(39F, -59F, 6F);

        gunModel[219].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[219].setRotationPoint(32F, -49F, 6F);

        gunModel[220].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[220].setRotationPoint(33F, -59F, 7F);

        gunModel[221].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[221].setRotationPoint(32F, -57F, 7F);

        gunModel[222].addShapeBox(0F, 0F, 0F, 38, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[222].setRotationPoint(40F, -54F, 6F);

        gunModel[223].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[223].setRotationPoint(40F, -51F, 6F);

        gunModel[224].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[224].setRotationPoint(40F, -50F, 6F);

        gunModel[225].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[225].setRotationPoint(40F, -58F, 6F);

        gunModel[226].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[226].setRotationPoint(44F, -43.5F, -1F);

        gunModel[227].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[227].setRotationPoint(68F, -43.5F, -1F);

        gunModel[228].addShapeBox(0F, 0F, 0F, 18, 4, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[228].setRotationPoint(21F, -50F, -5F);

        gunModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[229].setRotationPoint(24F, -45.5F, -5F);

        gunModel[230].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[230].setRotationPoint(27F, -46.5F, -5F);

        gunModel[231].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[231].setRotationPoint(27F, -44.5F, -5F);

        gunModel[232].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[232].setRotationPoint(22F, -44F, -5F);

        gunModel[233].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[233].setRotationPoint(16F, -45.5F, -4F);

        gunModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[234].setRotationPoint(21F, -46F, -6F);

        gunModel[235].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[235].setRotationPoint(20F, -48F, -6F);

        gunModel[236].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[236].setRotationPoint(18F, -48F, -6F);

        gunModel[237].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[237].setRotationPoint(15F, -43F, -5F);

        gunModel[238].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[238].setRotationPoint(18F, -43F, -6F);

        gunModel[239].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[239].setRotationPoint(20F, -44F, -6F);

        gunModel[240].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[240].setRotationPoint(12F, -45.5F, -4F);

        gunModel[241].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[241].setRotationPoint(8F, -45.5F, -4F);

        gunModel[242].addShapeBox(0F, 0F, 0F, 33, 4, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[242].setRotationPoint(-27F, -47F, -4F);

        gunModel[243].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[243].setRotationPoint(21F, -51F, -6F);

        gunModel[244].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[244].setRotationPoint(20F, -52F, -6F);

        gunModel[245].addShapeBox(0F, 0F, 0F, 34, 5, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[245].setRotationPoint(-13F, -52F, -5F);

        gunModel[246].addShapeBox(0F, 0F, 0F, 17, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[246].setRotationPoint(-2F, -43F, -5F);

        gunModel[247].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[247].setRotationPoint(27F, -46F, -3F);

        gunModel[248].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[248].setRotationPoint(-14F, -52F, -5F);

        gunModel[249].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[249].setRotationPoint(-15F, -52F, -5F);

        gunModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[250].setRotationPoint(-16F, -49F, -5F);

        gunModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[251].setRotationPoint(-19F, -49F, -5F);

        gunModel[252].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[252].setRotationPoint(-18F, -48F, -5F);

        gunModel[253].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[253].setRotationPoint(-28F, -52F, -5F);

        gunModel[254].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[254].setRotationPoint(-28F, -51F, -5F);

        gunModel[255].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, -3.0F, -1.0F, 0.0F, -3.0F); // Import
        gunModel[255].setRotationPoint(-26F, -43F, -5F);

        gunModel[256].addShapeBox(0F, 0F, 0F, 22, 2, 11, 0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[256].setRotationPoint(-24F, -43F, -5F);

        gunModel[257].addShapeBox(0F, 0F, 0F, 7, 2, 11, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F); // Import
        gunModel[257].setRotationPoint(-9F, -41F, -5F);

        gunModel[258].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[258].setRotationPoint(-5F, -40F, -5F);

        gunModel[259].addShapeBox(0F, 0F, 0F, 15, 3, 10, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F); // Import
        gunModel[259].setRotationPoint(-24F, -41F, -5F);

        gunModel[260].addShapeBox(0F, 0F, 0F, 4, 3, 10, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F); // Import
        gunModel[260].setRotationPoint(-9F, -41F, -5F);

        gunModel[261].addShapeBox(0F, 0F, 0F, 39, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[261].setRotationPoint(-8F, -57F, -5F);

        gunModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[262].setRotationPoint(-18F, -57F, -5F);

        gunModel[263].addShapeBox(0F, 0F, 0F, 33, 4, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[263].setRotationPoint(-27F, -47F, 3F);

        gunModel[264].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[264].setRotationPoint(8F, -45.5F, 3F);

        gunModel[265].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[265].setRotationPoint(12F, -45.5F, 3F);

        gunModel[266].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[266].setRotationPoint(16F, -45.5F, 3F);

        gunModel[267].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 1.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[267].setRotationPoint(20F, -48F, 5F);

        gunModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[268].setRotationPoint(21F, -46F, 3F);

        gunModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[269].setRotationPoint(20F, -44F, 5F);

        gunModel[270].addShapeBox(0F, 0F, 0F, 17, 3, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[270].setRotationPoint(-2F, -43F, 3F);

        gunModel[271].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[271].setRotationPoint(15F, -43F, 3F);

        gunModel[272].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[272].setRotationPoint(18F, -43F, 3F);

        gunModel[273].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[273].setRotationPoint(22F, -44F, 3F);

        gunModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[274].setRotationPoint(24F, -45.5F, 3F);

        gunModel[275].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[275].setRotationPoint(27F, -45.5F, 3F);

        gunModel[276].addShapeBox(0F, 0F, 0F, 18, 6, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[276].setRotationPoint(21F, -52F, 3F);

        gunModel[277].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[277].setRotationPoint(-17F, -54F, -5F);

        gunModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[278].setRotationPoint(-16F, -53F, -5F);

        gunModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F); // Import
        gunModel[279].setRotationPoint(-17F, -58F, -5F);

        gunModel[280].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F); // Import
        gunModel[280].setRotationPoint(-17F, -58F, -6F);

        gunModel[281].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[281].setRotationPoint(-13F, -63F, -8F);

        gunModel[282].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[282].setRotationPoint(17F, -43F, -6F);

        gunModel[283].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[283].setRotationPoint(-24F, -56F, -5F);

        gunModel[284].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.0F); // Import
        gunModel[284].setRotationPoint(-26F, -56F, -5F);

        gunModel[285].addShapeBox(0F, 0F, 0F, 9, 1, 10, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import
        gunModel[285].setRotationPoint(-26F, -57F, -5F);

        gunModel[286].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[286].setRotationPoint(-18F, -54F, -5F);

        gunModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[287].setRotationPoint(-27F, -39F, -3F);

        gunModel[288].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[288].setRotationPoint(-10F, -63F, -8F);

        gunModel[289].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[289].setRotationPoint(-14F, -63F, -8F);

        gunModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[290].setRotationPoint(-15F, -59F, -6F);

        gunModel[291].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[291].setRotationPoint(-14F, -62F, -6F);

        gunModel[292].addShapeBox(0F, 0F, 0F, 3, 5, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[292].setRotationPoint(-13F, -63F, -6F);

        gunModel[293].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[293].setRotationPoint(-8F, -62F, -5F);

        gunModel[294].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[294].setRotationPoint(-6F, -61F, -4F);

        gunModel[295].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[295].setRotationPoint(-3F, -63F, -4F);

        gunModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[296].setRotationPoint(-2F, -63F, -4F);

        gunModel[297].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[297].setRotationPoint(-10F, -59F, -5F);

        gunModel[298].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[298].setRotationPoint(-10F, -58F, -5F);

        gunModel[299].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[299].setRotationPoint(-1F, -60F, -4F);

        gunModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[300].setRotationPoint(0F, -61F, -4F);

        gunModel[301].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[301].setRotationPoint(28F, -62F, -4F);

        gunModel[302].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[302].setRotationPoint(28F, -62F, 3F);

        gunModel[303].addShapeBox(0F, 0F, 0F, 29, 1, 6, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[303].setRotationPoint(0F, -63F, -3F);

        gunModel[304].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F); // Import
        gunModel[304].setRotationPoint(24F, -62F, -3F);

        gunModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[305].setRotationPoint(27F, -62F, -4F);

        gunModel[306].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[306].setRotationPoint(-2F, -62F, -3F);

        gunModel[307].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[307].setRotationPoint(-2F, -61F, -3F);

        gunModel[308].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import
        gunModel[308].setRotationPoint(-29F, -51F, -4F);

        gunModel[309].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[309].setRotationPoint(-29F, -56F, -1F);

        gunModel[310].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[310].setRotationPoint(-29F, -53F, -4F);

        gunModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[311].setRotationPoint(-29F, -56F, -6F);

        gunModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[312].setRotationPoint(-29F, -53.5F, -6F);

        gunModel[313].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F); // Import
        gunModel[313].setRotationPoint(-29F, -54F, -7F);

        gunModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F); // Import
        gunModel[314].setRotationPoint(-29F, -56F, 1F);

        gunModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F); // Import
        gunModel[315].setRotationPoint(-29F, -53F, 1F);

        gunModel[316].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[316].setRotationPoint(-29F, -54F, 6F);

        gunModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[317].setRotationPoint(-29F, -52F, 1F);

        gunModel[318].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F, 0.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[318].setRotationPoint(-31F, -51F, -4F);

        gunModel[319].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F); // Import
        gunModel[319].setRotationPoint(-27F, -43F, -4F);

        gunModel[320].addShapeBox(0F, 0F, 0F, 11, 4, 8, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[320].setRotationPoint(-39F, -43F, -4F);

        gunModel[321].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[321].setRotationPoint(-29F, -43F, -4F);

        gunModel[322].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[322].setRotationPoint(-39F, -49F, -4F);

        gunModel[323].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[323].setRotationPoint(-46F, -40F, -4F);

        gunModel[324].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[324].setRotationPoint(-45F, -49F, -4F);

        gunModel[325].addShapeBox(0F, 0F, 0F, 14, 1, 8, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[325].setRotationPoint(-45F, -50F, -4F);

        gunModel[326].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F); // Import
        gunModel[326].setRotationPoint(-45F, -51F, -3F);

        gunModel[327].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[327].setRotationPoint(-45F, -52F, -3F);

        gunModel[328].addShapeBox(0F, 0F, 0F, 14, 2, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[328].setRotationPoint(-85F, -46F, -8F);

        gunModel[329].addShapeBox(0F, 0F, 0F, 49, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[329].setRotationPoint(-71F, -46F, -8F);

        gunModel[330].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[330].setRotationPoint(-67F, -45F, -8F);

        gunModel[331].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[331].setRotationPoint(-58F, -45F, -8F);

        gunModel[332].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[332].setRotationPoint(-22F, -46F, -8F);

        gunModel[333].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[333].setRotationPoint(-49F, -45F, -8F);

        gunModel[334].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[334].setRotationPoint(-40F, -45F, -8F);

        gunModel[335].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[335].setRotationPoint(-31F, -45F, -8F);

        gunModel[336].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[336].setRotationPoint(-45F, -49F, 3F);

        gunModel[337].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[337].setRotationPoint(-40F, -48F, -8.5F);

        gunModel[338].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[338].setRotationPoint(-40F, -43F, -5F);

        gunModel[339].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[339].setRotationPoint(-32F, -46.5F, -9F);

        gunModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[340].setRotationPoint(-42F, -48F, -8.5F);

        gunModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[341].setRotationPoint(-42F, -48F, -4.5F);

        gunModel[342].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[342].setRotationPoint(-40F, -43.5F, -9F);

        gunModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[343].setRotationPoint(-36F, -45.5F, -9F);

        gunModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[344].setRotationPoint(-40F, -46.5F, -9F);

        gunModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[345].setRotationPoint(-43F, -48F, 3.5F);

        gunModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[346].setRotationPoint(-43F, -48F, 7.5F);

        gunModel[347].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[347].setRotationPoint(-47F, -48F, 4F);

        gunModel[348].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[348].setRotationPoint(-47F, -47.5F, 8F);

        gunModel[349].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[349].setRotationPoint(-47F, -43F, 5.5F);

        gunModel[350].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[350].setRotationPoint(-45F, -45F, 3F);

        gunModel[351].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[351].setRotationPoint(-45F, -45F, -4F);

        gunModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[352].setRotationPoint(-40F, -45.5F, 8F);

        gunModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[353].setRotationPoint(-36F, -45.5F, 8F);

        gunModel[354].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[354].setRotationPoint(-32F, -46.5F, 8F);

        gunModel[355].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[355].setRotationPoint(-40F, -43.5F, 8F);

        gunModel[356].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[356].setRotationPoint(-40F, -43F, 5.5F);

        gunModel[357].addShapeBox(0F, 0F, 0F, 74, 1, 4, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[357].setRotationPoint(-85F, -47F, 4F);

        gunModel[358].addShapeBox(0F, 0F, 0F, 49, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[358].setRotationPoint(-71F, -46F, 4F);

        gunModel[359].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[359].setRotationPoint(-31F, -45F, 4F);

        gunModel[360].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[360].setRotationPoint(-49F, -45F, 4F);

        gunModel[361].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[361].setRotationPoint(-58F, -45F, 4F);

        gunModel[362].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[362].setRotationPoint(-67F, -45F, 4F);

        gunModel[363].addShapeBox(0F, 0F, 0F, 14, 2, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[363].setRotationPoint(-85F, -46F, 4F);

        gunModel[364].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[364].setRotationPoint(-14F, -62F, 2F);

        gunModel[365].addShapeBox(0F, 0F, 0F, 3, 5, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[365].setRotationPoint(-13F, -63F, 2F);

        gunModel[366].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[366].setRotationPoint(-10F, -63F, -5F);

        gunModel[367].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[367].setRotationPoint(-10F, -63F, 2F);

        gunModel[368].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[368].setRotationPoint(-14F, -62F, -2F);

        gunModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0F, -0.75F, 0.0F, 0F, -0.75F, 0.0F, 0F, -0.75F, 0.0F, 0F, -0.75F); // Import
        gunModel[369].setRotationPoint(-13F, -63F, -2F);

        gunModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F); // Import
        gunModel[370].setRotationPoint(-13F, -66F, -1F);

        gunModel[371].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F); // Import
        gunModel[371].setRotationPoint(-13F, -66F, -2F);

        gunModel[372].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F); // Import
        gunModel[372].setRotationPoint(-13F, -66F, 1F);

        gunModel[373].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[373].setRotationPoint(-44F, -45F, -8F);

        gunModel[374].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[374].setRotationPoint(-40F, -45F, 4F);

        gunModel[375].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[375].setRotationPoint(-44F, -44F, -8F);

        gunModel[376].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[376].setRotationPoint(-45F, -47F, -1F);

        gunModel[377].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[377].setRotationPoint(-47F, -50F, -1.5F);

        gunModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[378].setRotationPoint(-13F, -57F, -5F);

        gunModel[379].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[379].setRotationPoint(-28F, -52F, -3F);

        gunModel[380].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[380].setRotationPoint(-43F, -43F, -1F);

        gunModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[381].setRotationPoint(-46F, -41F, 3F);

        gunModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[382].setRotationPoint(-46F, -41F, -4F);

        gunModel[383].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[383].setRotationPoint(-12F, -38F, -1.5F);

        gunModel[384].addShapeBox(0F, 0F, 0F, 47, 4, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[384].setRotationPoint(-18F, -57F, -4F);

        gunModel[385].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[385].setRotationPoint(-1F, -53F, -4F);

        gunModel[386].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[386].setRotationPoint(25F, -61F, -4F);

        gunModel[387].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[387].setRotationPoint(-15F, -64F, 4.5F);

        gunModel[388].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F); // Import
        gunModel[388].setRotationPoint(-15F, -65F, 4.5F);

        gunModel[389].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[389].setRotationPoint(-10F, -63F, 6F);

        gunModel[390].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[390].setRotationPoint(-13F, -63F, 6F);

        gunModel[391].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[391].setRotationPoint(-14F, -63F, 6F);

        gunModel[392].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[392].setRotationPoint(-18F, -38F, -1F);

        gunModel[393].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0F, 0.0F, -1F, 0F, 0.0F, -1F, 0F, 0F, -1F, 0F, 0.0F, -1F); // Import
        gunModel[393].setRotationPoint(-17F, -58F, -6F);

        gunModel[394].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[394].setRotationPoint(-30F, -39F, -3F);

        gunModel[395].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[395].setRotationPoint(-30F, -38F, -3.5F);

        gunModel[396].addShapeBox(0F, 0F, 0F, 7, 4, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F); // Import
        gunModel[396].setRotationPoint(-30F, -34F, -3.5F);

        gunModel[397].addShapeBox(0F, 0F, 0F, 7, 4, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F); // Import
        gunModel[397].setRotationPoint(-34F, -30F, -3.5F);

        gunModel[398].addShapeBox(0F, 0F, 0F, 8, 5, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 1.0F, 0.0F, -4.0F, 1.0F, 0.0F, 4.0F, 0.0F, 0.0F); // Import
        gunModel[398].setRotationPoint(-38F, -26F, -3.5F);

        gunModel[399].addShapeBox(0F, 0F, 0F, 8, 4, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 3.0F, 0.0F, -3.0F, 3.0F, 0.0F, 3.0F, 0.0F, 0.0F); // Import
        gunModel[399].setRotationPoint(-42F, -21F, -3.5F);

        gunModel[400].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[400].setRotationPoint(-33F, -39F, -3.5F);

        gunModel[401].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F, 0.0F, 0.0F, -2.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -4.0F, 4.0F, 0.0F, -4.0F, 4.0F, 0.0F, 1.0F, 0.0F, -2.0F); // Import
        gunModel[401].setRotationPoint(-33F, -37F, -3.5F);

        gunModel[402].addShapeBox(0F, 0F, 0F, 3, 6, 7, 0F, 0.0F, 0.0F, -2.0F, -3.0F, -4.0F, 0.0F, -3.0F, -4.0F, 0.0F, 0.0F, 0.0F, -2.0F, 6.0F, 0.0F, -2.0F, -7.0F, 2.0F, 0.0F, -7.0F, 2.0F, 0.0F, 6.0F, 0.0F, -2.0F); // Import
        gunModel[402].setRotationPoint(-34F, -34F, -3.5F);

        gunModel[403].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F, 0.0F, 0.0F, -2.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 0.0F, -2.0F, 3.0F, 0.0F, -2.0F, -5.0F, 3.0F, 0.0F, -5.0F, 3.0F, 0.0F, 3.0F, 0.0F, -2.0F); // Import
        gunModel[403].setRotationPoint(-40F, -28F, -3.5F);

        gunModel[404].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F, 0.0F, 0.0F, -2.0F, -2.0F, -3.0F, 0.0F, -2.0F, -3.0F, 0.0F, 0.0F, 0.0F, -2.0F, 4.0F, -1.0F, -2.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 4.0F, -1.0F, -2.0F); // Import
        gunModel[404].setRotationPoint(-43F, -24F, -3.5F);

        gunModel[405].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, 2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -1.0F, 2.0F, -2.0F); // Import
        gunModel[405].setRotationPoint(-27F, -32F, -3.5F);

        gunModel[406].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F, 0.0F, 0.0F, 0.0F, -1.0F, -2.0F, -2.0F, -1.0F, -2.0F, -2.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 1.0F, -2.0F, -3.0F, 1.0F, -2.0F, 3.0F, 0.0F, 0.0F); // Import
        gunModel[406].setRotationPoint(-27F, -30F, -3.5F);

        gunModel[407].addShapeBox(0F, 0F, 0F, 2, 6, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -2.0F, -1.0F, -2.0F, -2.0F, -1.0F, -2.0F, 4.0F, 0.0F, 0.0F); // Import
        gunModel[407].setRotationPoint(-30F, -26F, -3.5F);

        gunModel[408].addShapeBox(0F, 0F, 0F, 4, 6, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -5.0F, 1.0F, -2.0F, -5.0F, 1.0F, -2.0F, 3.0F, 0.0F, 0.0F); // Import
        gunModel[408].setRotationPoint(-34F, -20F, -3.5F);

        gunModel[409].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[409].setRotationPoint(-35F, -17F, -1.5F);

        gunModel[410].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[410].setRotationPoint(-23F, -31F, -2.5F);

        gunModel[411].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[411].setRotationPoint(-19F, -36F, -1F);

        gunModel[412].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F); // Import
        gunModel[412].setRotationPoint(-19F, -34F, -1F);

        gunModel[413].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[413].setRotationPoint(-19F, -31F, -1.5F);

        gunModel[414].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[414].setRotationPoint(-23F, -34F, -1.5F);

        gunModel[415].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[415].setRotationPoint(-14F, -31F, -1.5F);

        gunModel[416].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[416].setRotationPoint(-11F, -38F, -0.5F);

        gunModel[417].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[417].setRotationPoint(-10F, -38F, -0.5F);

        gunModel[418].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[418].setRotationPoint(-10F, -35F, -0.5F);

        gunModel[419].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[419].setRotationPoint(-8F, -38F, -0.5F);

        gunModel[420].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[420].setRotationPoint(4F, -40F, -5F);

        gunModel[421].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[421].setRotationPoint(0F, -40F, -5F);

        gunModel[422].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[422].setRotationPoint(0F, -40F, 1F);

        gunModel[423].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[423].setRotationPoint(4F, -40F, 3F);

        gunModel[424].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[424].setRotationPoint(-5F, -40F, -2F);

        gunModel[425].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[425].setRotationPoint(-3F, -40F, -5F);

        gunModel[426].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[426].setRotationPoint(2F, -40F, -1F);
        gunModel[426].rotateAngleZ = -0.06981317F;

        gunModel[427].addShapeBox(0F, 3F, 0F, 1, 4, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[427].setRotationPoint(2F, -40F, -2F);
        gunModel[427].rotateAngleZ = -0.06981317F;

        gunModel[428].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[428].setRotationPoint(-30F, -38F, -2.5F);

        gunModel[429].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[429].setRotationPoint(-30F, -38F, 2.5F);

        gunModel[430].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[430].setRotationPoint(-24F, -38F, -1.5F);

        gunModel[431].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[431].setRotationPoint(-88F, -48F, 3F);

        gunModel[432].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F); // Import
        gunModel[432].setRotationPoint(-88F, -48F, -9F);

        gunModel[433].addShapeBox(0F, 0F, 0F, 10, 9, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[433].setRotationPoint(-96F, -49F, 2F);

        gunModel[434].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[434].setRotationPoint(-86F, -49F, 2F);

        gunModel[435].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[435].setRotationPoint(-101F, -49F, 2F);

        gunModel[436].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[436].setRotationPoint(-98F, -49F, 2F);

        gunModel[437].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[437].setRotationPoint(-98F, -45F, 2F);

        gunModel[438].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[438].setRotationPoint(-98F, -41F, 2F);

        gunModel[439].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[439].setRotationPoint(-101F, -39F, 2F);

        gunModel[440].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[440].setRotationPoint(-96F, -38F, 2F);

        gunModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[441].setRotationPoint(-96F, -33F, 2F);

        gunModel[442].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[442].setRotationPoint(-98F, -32F, 2F);

        gunModel[443].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[443].setRotationPoint(-94F, -36F, 2F);

        gunModel[444].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[444].setRotationPoint(-95F, -33F, 2F);

        gunModel[445].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[445].setRotationPoint(-93F, -39F, 2F);

        gunModel[446].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[446].setRotationPoint(-93F, -40F, 2F);

        gunModel[447].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[447].setRotationPoint(-96F, -40F, 2F);

        gunModel[448].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[448].setRotationPoint(-96F, -36F, 2F);

        gunModel[449].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[449].setRotationPoint(-97F, -30F, 2F);

        gunModel[450].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[450].setRotationPoint(-99F, -21F, 2F);

        gunModel[451].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[451].setRotationPoint(-99F, -38F, 2F);

        gunModel[452].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[452].setRotationPoint(-99F, -36F, 2F);

        gunModel[453].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[453].setRotationPoint(-99F, -34F, 2F);

        gunModel[454].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[454].setRotationPoint(-99F, -32F, 2F);

        gunModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[455].setRotationPoint(-99F, -30F, 2F);

        gunModel[456].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[456].setRotationPoint(-99F, -28F, 2F);

        gunModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[457].setRotationPoint(-99F, -26F, 2F);

        gunModel[458].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[458].setRotationPoint(-99F, -24F, 2F);

        gunModel[459].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[459].setRotationPoint(-99F, -22F, 2F);

        gunModel[460].addShapeBox(0F, 0F, 0F, 10, 9, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[460].setRotationPoint(-96F, -49F, -3F);

        gunModel[461].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[461].setRotationPoint(-86F, -49F, -3F);

        gunModel[462].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[462].setRotationPoint(-98F, -49F, -3F);

        gunModel[463].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[463].setRotationPoint(-98F, -45F, -3F);

        gunModel[464].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[464].setRotationPoint(-98F, -41F, -3F);

        gunModel[465].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[465].setRotationPoint(-96F, -40F, -3F);

        gunModel[466].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[466].setRotationPoint(-96F, -38F, -3F);

        gunModel[467].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[467].setRotationPoint(-93F, -40F, -3F);

        gunModel[468].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[468].setRotationPoint(-93F, -39F, -3F);

        gunModel[469].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[469].setRotationPoint(-94F, -36F, -3F);

        gunModel[470].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[470].setRotationPoint(-96F, -36F, -3F);

        gunModel[471].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[471].setRotationPoint(-95F, -33F, -3F);

        gunModel[472].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[472].setRotationPoint(-96F, -33F, -3F);

        gunModel[473].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[473].setRotationPoint(-98F, -32F, -3F);

        gunModel[474].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[474].setRotationPoint(-97F, -30F, -3F);

        gunModel[475].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[475].setRotationPoint(-99F, -21F, -3F);

        gunModel[476].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[476].setRotationPoint(-101F, -39F, -3F);

        gunModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[477].setRotationPoint(-99F, -22F, -3F);

        gunModel[478].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[478].setRotationPoint(-99F, -24F, -3F);

        gunModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[479].setRotationPoint(-99F, -26F, -3F);

        gunModel[480].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[480].setRotationPoint(-99F, -28F, -3F);

        gunModel[481].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[481].setRotationPoint(-99F, -30F, -3F);

        gunModel[482].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[482].setRotationPoint(-99F, -32F, -3F);

        gunModel[483].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[483].setRotationPoint(-99F, -34F, -3F);

        gunModel[484].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[484].setRotationPoint(-99F, -36F, -3F);

        gunModel[485].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[485].setRotationPoint(-99F, -38F, -3F);

        gunModel[486].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[486].setRotationPoint(-101F, -49F, -3F);

        gunModel[487].addShapeBox(0F, 0F, 0F, 8, 22, 10, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[487].setRotationPoint(-109F, -45F, -5F);

        gunModel[488].addShapeBox(0F, 0F, 0F, 8, 3, 10, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[488].setRotationPoint(-109F, -48F, -5F);

        gunModel[489].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[489].setRotationPoint(-109F, -50F, -4F);

        gunModel[490].addShapeBox(0F, 0F, 0F, 8, 4, 10, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[490].setRotationPoint(-109F, -23F, -5F);

        gunModel[491].addShapeBox(0F, 0F, 0F, 8, 5, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -1.0F, -2.0F); // Import
        gunModel[491].setRotationPoint(-109F, -19F, -4F);

        gunModel[492].addShapeBox(0F, 0F, 0F, 47, 5, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[492].setRotationPoint(-26F, -52F, 3F);

        gunModel[493].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -1F, -0.5F, 0.0F, -1F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[493].setRotationPoint(-13.01F, -63.75F, 0.25F);

        gunModel[494].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0F, 0.0F, -1F, 0.0F); // Import
        gunModel[494].setRotationPoint(132F, -65F, 2F);

        gunModel[495].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[495].setRotationPoint(132F, -65F, -3F);

        gunModel[496].addShapeBox(0F, 0F, 0F, 41, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, -3.0F, -4.0F, 0.0F, -3.0F, -4.0F, 0.0F, 3.0F, -6.0F, 0.0F, 3.0F); // Import
        gunModel[496].setRotationPoint(-99F, -56F, 3F);

        gunModel[497].addShapeBox(0F, 0F, 0F, 42, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[497].setRotationPoint(-99F, -57F, -3F);

        gunModel[498].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[498].setRotationPoint(-93F, -53F, 6F);

        gunModel[499].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[499].setRotationPoint(-99F, -52F, 1F);
    }

    private void initgunModel_2() {
        gunModel[500] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Import
        gunModel[501] = new ModelRendererTurbo(this, 201, 249, textureX, textureY); // Import
        gunModel[502] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Import
        gunModel[503] = new ModelRendererTurbo(this, 289, 249, textureX, textureY); // Import
        gunModel[504] = new ModelRendererTurbo(this, 425, 249, textureX, textureY); // Import
        gunModel[505] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Import
        gunModel[506] = new ModelRendererTurbo(this, 425, 241, textureX, textureY); // Import
        gunModel[507] = new ModelRendererTurbo(this, 377, 241, textureX, textureY); // Import
        gunModel[508] = new ModelRendererTurbo(this, 201, 241, textureX, textureY); // Import
        gunModel[509] = new ModelRendererTurbo(this, 497, 225, textureX, textureY); // Import
        gunModel[510] = new ModelRendererTurbo(this, 241, 233, textureX, textureY); // Import
        gunModel[511] = new ModelRendererTurbo(this, 353, 233, textureX, textureY); // Import
        gunModel[512] = new ModelRendererTurbo(this, 353, 241, textureX, textureY); // Import
        gunModel[513] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Import
        gunModel[514] = new ModelRendererTurbo(this, 25, 257, textureX, textureY); // Import
        gunModel[515] = new ModelRendererTurbo(this, 361, 233, textureX, textureY); // Import
        gunModel[516] = new ModelRendererTurbo(this, 33, 241, textureX, textureY); // Import
        gunModel[517] = new ModelRendererTurbo(this, 153, 241, textureX, textureY); // Import
        gunModel[518] = new ModelRendererTurbo(this, 241, 241, textureX, textureY); // Import
        gunModel[519] = new ModelRendererTurbo(this, 497, 241, textureX, textureY); // Import
        gunModel[520] = new ModelRendererTurbo(this, 105, 249, textureX, textureY); // Import
        gunModel[521] = new ModelRendererTurbo(this, 41, 257, textureX, textureY); // Import
        gunModel[522] = new ModelRendererTurbo(this, 49, 257, textureX, textureY); // Import
        gunModel[523] = new ModelRendererTurbo(this, 57, 257, textureX, textureY); // Import
        gunModel[524] = new ModelRendererTurbo(this, 65, 257, textureX, textureY); // Import
        gunModel[525] = new ModelRendererTurbo(this, 73, 257, textureX, textureY); // Import
        gunModel[526] = new ModelRendererTurbo(this, 113, 257, textureX, textureY); // Import
        gunModel[527] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // Import
        gunModel[528] = new ModelRendererTurbo(this, 129, 257, textureX, textureY); // Import
        gunModel[529] = new ModelRendererTurbo(this, 153, 257, textureX, textureY); // Import
        gunModel[530] = new ModelRendererTurbo(this, 177, 257, textureX, textureY); // Import
        gunModel[531] = new ModelRendererTurbo(this, 193, 257, textureX, textureY); // Import
        gunModel[532] = new ModelRendererTurbo(this, 201, 257, textureX, textureY); // Import
        gunModel[533] = new ModelRendererTurbo(this, 209, 257, textureX, textureY); // Import
        gunModel[534] = new ModelRendererTurbo(this, 217, 257, textureX, textureY); // Import
        gunModel[535] = new ModelRendererTurbo(this, 225, 257, textureX, textureY); // Import
        gunModel[536] = new ModelRendererTurbo(this, 233, 257, textureX, textureY); // Import
        gunModel[537] = new ModelRendererTurbo(this, 241, 257, textureX, textureY); // Import
        gunModel[538] = new ModelRendererTurbo(this, 249, 257, textureX, textureY); // Import
        gunModel[539] = new ModelRendererTurbo(this, 257, 257, textureX, textureY); // Import
        gunModel[540] = new ModelRendererTurbo(this, 265, 257, textureX, textureY); // Import
        gunModel[541] = new ModelRendererTurbo(this, 273, 257, textureX, textureY); // Import
        gunModel[542] = new ModelRendererTurbo(this, 281, 257, textureX, textureY); // Import
        gunModel[543] = new ModelRendererTurbo(this, 289, 257, textureX, textureY); // Import
        gunModel[544] = new ModelRendererTurbo(this, 289, 257, textureX, textureY); // Import
        gunModel[545] = new ModelRendererTurbo(this, 305, 257, textureX, textureY); // Import
        gunModel[546] = new ModelRendererTurbo(this, 321, 257, textureX, textureY); // Import
        gunModel[547] = new ModelRendererTurbo(this, 337, 257, textureX, textureY); // Import
        gunModel[548] = new ModelRendererTurbo(this, 353, 257, textureX, textureY); // Import
        gunModel[549] = new ModelRendererTurbo(this, 425, 257, textureX, textureY); // Import
        gunModel[550] = new ModelRendererTurbo(this, 433, 257, textureX, textureY); // Import
        gunModel[551] = new ModelRendererTurbo(this, 449, 257, textureX, textureY); // Import
        gunModel[552] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Import
        gunModel[553] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Import
        gunModel[554] = new ModelRendererTurbo(this, 481, 257, textureX, textureY); // Import
        gunModel[555] = new ModelRendererTurbo(this, 497, 257, textureX, textureY); // Import
        gunModel[556] = new ModelRendererTurbo(this, 49, 265, textureX, textureY); // Import
        gunModel[557] = new ModelRendererTurbo(this, 73, 265, textureX, textureY); // Import
        gunModel[558] = new ModelRendererTurbo(this, 129, 265, textureX, textureY); // Import
        gunModel[559] = new ModelRendererTurbo(this, 161, 265, textureX, textureY); // Import
        gunModel[560] = new ModelRendererTurbo(this, 185, 265, textureX, textureY); // Import
        gunModel[561] = new ModelRendererTurbo(this, 505, 257, textureX, textureY); // Import
        gunModel[562] = new ModelRendererTurbo(this, 97, 265, textureX, textureY); // Import
        gunModel[563] = new ModelRendererTurbo(this, 249, 265, textureX, textureY); // Import
        gunModel[564] = new ModelRendererTurbo(this, 297, 265, textureX, textureY); // Import
        gunModel[565] = new ModelRendererTurbo(this, 105, 265, textureX, textureY); // Import
        gunModel[566] = new ModelRendererTurbo(this, 321, 265, textureX, textureY); // Import
        gunModel[567] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Import
        gunModel[568] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Import
        gunModel[569] = new ModelRendererTurbo(this, 417, 265, textureX, textureY); // Import
        gunModel[570] = new ModelRendererTurbo(this, 425, 265, textureX, textureY); // Import
        gunModel[571] = new ModelRendererTurbo(this, 433, 265, textureX, textureY); // Import
        gunModel[572] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Import
        gunModel[573] = new ModelRendererTurbo(this, 465, 265, textureX, textureY); // Import
        gunModel[574] = new ModelRendererTurbo(this, 473, 265, textureX, textureY); // Import
        gunModel[575] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Import
        gunModel[576] = new ModelRendererTurbo(this, 489, 265, textureX, textureY); // Import
        gunModel[577] = new ModelRendererTurbo(this, 289, 217, textureX, textureY); // Import
        gunModel[578] = new ModelRendererTurbo(this, 33, 273, textureX, textureY); // Import
        gunModel[579] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Import
        gunModel[580] = new ModelRendererTurbo(this, 41, 273, textureX, textureY); // Import
        gunModel[581] = new ModelRendererTurbo(this, 105, 273, textureX, textureY); // Import
        gunModel[582] = new ModelRendererTurbo(this, 241, 273, textureX, textureY); // Import
        gunModel[583] = new ModelRendererTurbo(this, 249, 273, textureX, textureY); // Import
        gunModel[584] = new ModelRendererTurbo(this, 257, 273, textureX, textureY); // Import
        gunModel[585] = new ModelRendererTurbo(this, 265, 273, textureX, textureY); // Import
        gunModel[586] = new ModelRendererTurbo(this, 281, 273, textureX, textureY); // Import
        gunModel[587] = new ModelRendererTurbo(this, 289, 273, textureX, textureY); // Import
        gunModel[588] = new ModelRendererTurbo(this, 297, 273, textureX, textureY); // Import
        gunModel[589] = new ModelRendererTurbo(this, 305, 273, textureX, textureY); // Import
        gunModel[590] = new ModelRendererTurbo(this, 313, 273, textureX, textureY); // Import
        gunModel[591] = new ModelRendererTurbo(this, 321, 273, textureX, textureY); // Import
        gunModel[592] = new ModelRendererTurbo(this, 337, 273, textureX, textureY); // Import
        gunModel[593] = new ModelRendererTurbo(this, 353, 273, textureX, textureY); // Import
        gunModel[594] = new ModelRendererTurbo(this, 369, 273, textureX, textureY); // Import
        gunModel[595] = new ModelRendererTurbo(this, 377, 273, textureX, textureY); // Import
        gunModel[596] = new ModelRendererTurbo(this, 385, 273, textureX, textureY); // Import
        gunModel[597] = new ModelRendererTurbo(this, 393, 273, textureX, textureY); // Import
        gunModel[598] = new ModelRendererTurbo(this, 401, 273, textureX, textureY); // Import
        gunModel[599] = new ModelRendererTurbo(this, 409, 273, textureX, textureY); // Import
        gunModel[600] = new ModelRendererTurbo(this, 433, 273, textureX, textureY); // Import
        gunModel[601] = new ModelRendererTurbo(this, 441, 273, textureX, textureY); // Import
        gunModel[602] = new ModelRendererTurbo(this, 449, 273, textureX, textureY); // Import
        gunModel[603] = new ModelRendererTurbo(this, 457, 273, textureX, textureY); // Import
        gunModel[604] = new ModelRendererTurbo(this, 465, 273, textureX, textureY); // Import
        gunModel[605] = new ModelRendererTurbo(this, 473, 273, textureX, textureY); // Import
        gunModel[606] = new ModelRendererTurbo(this, 481, 273, textureX, textureY); // Import
        gunModel[607] = new ModelRendererTurbo(this, 489, 273, textureX, textureY); // Import
        gunModel[608] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Import
        gunModel[609] = new ModelRendererTurbo(this, 9, 281, textureX, textureY); // Import
        gunModel[610] = new ModelRendererTurbo(this, 17, 281, textureX, textureY); // Import
        gunModel[611] = new ModelRendererTurbo(this, 25, 281, textureX, textureY); // Import
        gunModel[612] = new ModelRendererTurbo(this, 41, 281, textureX, textureY); // Import
        gunModel[613] = new ModelRendererTurbo(this, 49, 281, textureX, textureY); // Import
        gunModel[614] = new ModelRendererTurbo(this, 57, 281, textureX, textureY); // Import
        gunModel[615] = new ModelRendererTurbo(this, 65, 281, textureX, textureY); // Import
        gunModel[616] = new ModelRendererTurbo(this, 73, 281, textureX, textureY); // Import
        gunModel[617] = new ModelRendererTurbo(this, 81, 281, textureX, textureY); // Import
        gunModel[618] = new ModelRendererTurbo(this, 89, 281, textureX, textureY); // Import
        gunModel[619] = new ModelRendererTurbo(this, 105, 281, textureX, textureY); // Import
        gunModel[620] = new ModelRendererTurbo(this, 113, 281, textureX, textureY); // Import
        gunModel[621] = new ModelRendererTurbo(this, 121, 281, textureX, textureY); // Import
        gunModel[622] = new ModelRendererTurbo(this, 129, 281, textureX, textureY); // Import
        gunModel[623] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Import
        gunModel[624] = new ModelRendererTurbo(this, 153, 281, textureX, textureY); // Import
        gunModel[625] = new ModelRendererTurbo(this, 161, 281, textureX, textureY); // Import
        gunModel[626] = new ModelRendererTurbo(this, 169, 281, textureX, textureY); // Import
        gunModel[627] = new ModelRendererTurbo(this, 177, 281, textureX, textureY); // Import
        gunModel[628] = new ModelRendererTurbo(this, 185, 281, textureX, textureY); // Import
        gunModel[629] = new ModelRendererTurbo(this, 201, 281, textureX, textureY); // Import
        gunModel[630] = new ModelRendererTurbo(this, 209, 281, textureX, textureY); // Import
        gunModel[631] = new ModelRendererTurbo(this, 217, 281, textureX, textureY); // Import
        gunModel[632] = new ModelRendererTurbo(this, 225, 281, textureX, textureY); // Import
        gunModel[633] = new ModelRendererTurbo(this, 233, 281, textureX, textureY); // Import
        gunModel[634] = new ModelRendererTurbo(this, 249, 281, textureX, textureY); // Import
        gunModel[635] = new ModelRendererTurbo(this, 257, 281, textureX, textureY); // Import
        gunModel[636] = new ModelRendererTurbo(this, 265, 281, textureX, textureY); // Import
        gunModel[637] = new ModelRendererTurbo(this, 273, 281, textureX, textureY); // Import
        gunModel[638] = new ModelRendererTurbo(this, 281, 281, textureX, textureY); // Import
        gunModel[639] = new ModelRendererTurbo(this, 297, 281, textureX, textureY); // Import
        gunModel[640] = new ModelRendererTurbo(this, 305, 281, textureX, textureY); // Import
        gunModel[641] = new ModelRendererTurbo(this, 313, 281, textureX, textureY); // Import
        gunModel[642] = new ModelRendererTurbo(this, 321, 281, textureX, textureY); // Import
        gunModel[643] = new ModelRendererTurbo(this, 329, 281, textureX, textureY); // Import
        gunModel[644] = new ModelRendererTurbo(this, 345, 281, textureX, textureY); // Import
        gunModel[645] = new ModelRendererTurbo(this, 361, 281, textureX, textureY); // Import
        gunModel[646] = new ModelRendererTurbo(this, 377, 281, textureX, textureY); // Import
        gunModel[647] = new ModelRendererTurbo(this, 393, 281, textureX, textureY); // Import
        gunModel[648] = new ModelRendererTurbo(this, 409, 281, textureX, textureY); // Import
        gunModel[649] = new ModelRendererTurbo(this, 425, 281, textureX, textureY); // Import
        gunModel[650] = new ModelRendererTurbo(this, 433, 281, textureX, textureY); // Import
        gunModel[651] = new ModelRendererTurbo(this, 441, 281, textureX, textureY); // Import
        gunModel[652] = new ModelRendererTurbo(this, 449, 281, textureX, textureY); // Import
        gunModel[653] = new ModelRendererTurbo(this, 465, 281, textureX, textureY); // Import
        gunModel[654] = new ModelRendererTurbo(this, 481, 281, textureX, textureY); // Import
        gunModel[655] = new ModelRendererTurbo(this, 185, 273, textureX, textureY); // Import
        gunModel[656] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Import
        gunModel[657] = new ModelRendererTurbo(this, 9, 289, textureX, textureY); // Import
        gunModel[658] = new ModelRendererTurbo(this, 17, 289, textureX, textureY); // Import
        gunModel[659] = new ModelRendererTurbo(this, 25, 289, textureX, textureY); // Import
        gunModel[660] = new ModelRendererTurbo(this, 33, 289, textureX, textureY); // Import
        gunModel[661] = new ModelRendererTurbo(this, 41, 289, textureX, textureY); // Import
        gunModel[662] = new ModelRendererTurbo(this, 49, 289, textureX, textureY); // Import
        gunModel[663] = new ModelRendererTurbo(this, 57, 289, textureX, textureY); // Import
        gunModel[664] = new ModelRendererTurbo(this, 65, 289, textureX, textureY); // Import
        gunModel[665] = new ModelRendererTurbo(this, 73, 289, textureX, textureY); // Import
        gunModel[666] = new ModelRendererTurbo(this, 81, 289, textureX, textureY); // Import
        gunModel[667] = new ModelRendererTurbo(this, 89, 289, textureX, textureY); // Import
        gunModel[668] = new ModelRendererTurbo(this, 97, 289, textureX, textureY); // Import
        gunModel[669] = new ModelRendererTurbo(this, 105, 289, textureX, textureY); // Import
        gunModel[670] = new ModelRendererTurbo(this, 113, 289, textureX, textureY); // Import
        gunModel[671] = new ModelRendererTurbo(this, 121, 289, textureX, textureY); // Import
        gunModel[672] = new ModelRendererTurbo(this, 129, 289, textureX, textureY); // Import
        gunModel[673] = new ModelRendererTurbo(this, 137, 289, textureX, textureY); // Import
        gunModel[674] = new ModelRendererTurbo(this, 145, 289, textureX, textureY); // Import
        gunModel[675] = new ModelRendererTurbo(this, 153, 289, textureX, textureY); // Import
        gunModel[676] = new ModelRendererTurbo(this, 161, 289, textureX, textureY); // Import
        gunModel[677] = new ModelRendererTurbo(this, 169, 289, textureX, textureY); // Import
        gunModel[678] = new ModelRendererTurbo(this, 177, 289, textureX, textureY); // Import
        gunModel[679] = new ModelRendererTurbo(this, 185, 289, textureX, textureY); // Import
        gunModel[680] = new ModelRendererTurbo(this, 193, 289, textureX, textureY); // Import
        gunModel[681] = new ModelRendererTurbo(this, 201, 289, textureX, textureY); // Import
        gunModel[682] = new ModelRendererTurbo(this, 209, 289, textureX, textureY); // Import
        gunModel[683] = new ModelRendererTurbo(this, 217, 289, textureX, textureY); // Import
        gunModel[684] = new ModelRendererTurbo(this, 225, 289, textureX, textureY); // Import
        gunModel[685] = new ModelRendererTurbo(this, 233, 289, textureX, textureY); // Import
        gunModel[686] = new ModelRendererTurbo(this, 241, 289, textureX, textureY); // Import
        gunModel[687] = new ModelRendererTurbo(this, 249, 289, textureX, textureY); // Import
        gunModel[688] = new ModelRendererTurbo(this, 257, 289, textureX, textureY); // Import
        gunModel[689] = new ModelRendererTurbo(this, 257, 289, textureX, textureY); // Import
        gunModel[690] = new ModelRendererTurbo(this, 297, 289, textureX, textureY); // Import
        gunModel[691] = new ModelRendererTurbo(this, 329, 289, textureX, textureY); // Import
        gunModel[692] = new ModelRendererTurbo(this, 361, 289, textureX, textureY); // Import
        gunModel[693] = new ModelRendererTurbo(this, 401, 289, textureX, textureY); // Import
        gunModel[694] = new ModelRendererTurbo(this, 425, 289, textureX, textureY); // Import
        gunModel[695] = new ModelRendererTurbo(this, 449, 289, textureX, textureY); // Import
        gunModel[696] = new ModelRendererTurbo(this, 473, 289, textureX, textureY); // Import
        gunModel[697] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Import
        gunModel[698] = new ModelRendererTurbo(this, 497, 289, textureX, textureY); // Import
        gunModel[699] = new ModelRendererTurbo(this, 289, 289, textureX, textureY); // Import
        gunModel[700] = new ModelRendererTurbo(this, 25, 297, textureX, textureY); // Import
        gunModel[701] = new ModelRendererTurbo(this, 41, 297, textureX, textureY); // Import
        gunModel[702] = new ModelRendererTurbo(this, 417, 289, textureX, textureY); // Import
        gunModel[703] = new ModelRendererTurbo(this, 441, 289, textureX, textureY); // Import
        gunModel[704] = new ModelRendererTurbo(this, 465, 289, textureX, textureY); // Import
        gunModel[705] = new ModelRendererTurbo(this, 81, 297, textureX, textureY); // Import
        gunModel[706] = new ModelRendererTurbo(this, 97, 297, textureX, textureY); // Import
        gunModel[707] = new ModelRendererTurbo(this, 113, 297, textureX, textureY); // Import
        gunModel[708] = new ModelRendererTurbo(this, 137, 297, textureX, textureY); // Import
        gunModel[709] = new ModelRendererTurbo(this, 161, 297, textureX, textureY); // Import
        gunModel[710] = new ModelRendererTurbo(this, 185, 297, textureX, textureY); // Import
        gunModel[711] = new ModelRendererTurbo(this, 209, 297, textureX, textureY); // Import
        gunModel[712] = new ModelRendererTurbo(this, 233, 297, textureX, textureY); // Import
        gunModel[713] = new ModelRendererTurbo(this, 257, 297, textureX, textureY); // Import
        gunModel[714] = new ModelRendererTurbo(this, 297, 297, textureX, textureY); // Import
        gunModel[715] = new ModelRendererTurbo(this, 321, 297, textureX, textureY); // Import
        gunModel[716] = new ModelRendererTurbo(this, 361, 297, textureX, textureY); // Import
        gunModel[717] = new ModelRendererTurbo(this, 401, 297, textureX, textureY); // Import
        gunModel[718] = new ModelRendererTurbo(this, 441, 297, textureX, textureY); // Import
        gunModel[719] = new ModelRendererTurbo(this, 465, 297, textureX, textureY); // Import
        gunModel[720] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Import
        gunModel[721] = new ModelRendererTurbo(this, 33, 305, textureX, textureY); // Import
        gunModel[722] = new ModelRendererTurbo(this, 33, 313, textureX, textureY); // Import
        gunModel[723] = new ModelRendererTurbo(this, 193, 305, textureX, textureY); // Import
        gunModel[724] = new ModelRendererTurbo(this, 73, 313, textureX, textureY); // Import
        gunModel[725] = new ModelRendererTurbo(this, 97, 313, textureX, textureY); // Import
        gunModel[726] = new ModelRendererTurbo(this, 121, 313, textureX, textureY); // Import
        gunModel[727] = new ModelRendererTurbo(this, 145, 313, textureX, textureY); // Import
        gunModel[728] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Import
        gunModel[729] = new ModelRendererTurbo(this, 225, 297, textureX, textureY); // Import
        gunModel[730] = new ModelRendererTurbo(this, 209, 313, textureX, textureY); // Import
        gunModel[731] = new ModelRendererTurbo(this, 489, 289, textureX, textureY); // Import
        gunModel[732] = new ModelRendererTurbo(this, 17, 297, textureX, textureY); // Import
        gunModel[733] = new ModelRendererTurbo(this, 249, 297, textureX, textureY); // Import
        gunModel[734] = new ModelRendererTurbo(this, 313, 297, textureX, textureY); // Import
        gunModel[735] = new ModelRendererTurbo(this, 353, 297, textureX, textureY); // Import
        gunModel[736] = new ModelRendererTurbo(this, 393, 297, textureX, textureY); // Import
        gunModel[737] = new ModelRendererTurbo(this, 457, 297, textureX, textureY); // Import
        gunModel[738] = new ModelRendererTurbo(this, 497, 297, textureX, textureY); // Import
        gunModel[739] = new ModelRendererTurbo(this, 257, 297, textureX, textureY); // Import
        gunModel[740] = new ModelRendererTurbo(this, 297, 297, textureX, textureY); // Import
        gunModel[741] = new ModelRendererTurbo(this, 505, 297, textureX, textureY); // Import
        gunModel[742] = new ModelRendererTurbo(this, 353, 305, textureX, textureY); // Import
        gunModel[743] = new ModelRendererTurbo(this, 393, 305, textureX, textureY); // Import
        gunModel[744] = new ModelRendererTurbo(this, 497, 305, textureX, textureY); // Import
        gunModel[745] = new ModelRendererTurbo(this, 241, 313, textureX, textureY); // Import
        gunModel[746] = new ModelRendererTurbo(this, 345, 313, textureX, textureY); // Import
        gunModel[747] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Import
        gunModel[748] = new ModelRendererTurbo(this, 105, 321, textureX, textureY); // Import
        gunModel[749] = new ModelRendererTurbo(this, 505, 305, textureX, textureY); // Import
        gunModel[750] = new ModelRendererTurbo(this, 89, 313, textureX, textureY); // Import
        gunModel[751] = new ModelRendererTurbo(this, 113, 313, textureX, textureY); // Import
        gunModel[752] = new ModelRendererTurbo(this, 137, 313, textureX, textureY); // Import
        gunModel[753] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Import
        gunModel[754] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Import
        gunModel[755] = new ModelRendererTurbo(this, 449, 313, textureX, textureY); // Import
        gunModel[756] = new ModelRendererTurbo(this, 321, 297, textureX, textureY); // Import
        gunModel[757] = new ModelRendererTurbo(this, 457, 313, textureX, textureY); // Import
        gunModel[758] = new ModelRendererTurbo(this, 473, 313, textureX, textureY); // Import
        gunModel[759] = new ModelRendererTurbo(this, 489, 313, textureX, textureY); // Import
        gunModel[760] = new ModelRendererTurbo(this, 497, 313, textureX, textureY); // Import
        gunModel[761] = new ModelRendererTurbo(this, 209, 321, textureX, textureY); // Import
        gunModel[762] = new ModelRendererTurbo(this, 241, 321, textureX, textureY); // Import
        gunModel[763] = new ModelRendererTurbo(this, 361, 297, textureX, textureY); // Import
        gunModel[764] = new ModelRendererTurbo(this, 401, 297, textureX, textureY); // Import
        gunModel[765] = new ModelRendererTurbo(this, 273, 321, textureX, textureY); // Import
        gunModel[766] = new ModelRendererTurbo(this, 289, 321, textureX, textureY); // Import
        gunModel[767] = new ModelRendererTurbo(this, 305, 321, textureX, textureY); // Import
        gunModel[768] = new ModelRendererTurbo(this, 345, 321, textureX, textureY); // Import
        gunModel[769] = new ModelRendererTurbo(this, 385, 321, textureX, textureY); // Import
        gunModel[770] = new ModelRendererTurbo(this, 441, 297, textureX, textureY); // Import
        gunModel[771] = new ModelRendererTurbo(this, 465, 297, textureX, textureY); // Import
        gunModel[772] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Import
        gunModel[773] = new ModelRendererTurbo(this, 505, 313, textureX, textureY); // Import
        gunModel[774] = new ModelRendererTurbo(this, 401, 321, textureX, textureY); // Import
        gunModel[775] = new ModelRendererTurbo(this, 409, 321, textureX, textureY); // Import
        gunModel[776] = new ModelRendererTurbo(this, 417, 321, textureX, textureY); // Import
        gunModel[777] = new ModelRendererTurbo(this, 425, 321, textureX, textureY); // Import
        gunModel[778] = new ModelRendererTurbo(this, 441, 321, textureX, textureY); // Import
        gunModel[779] = new ModelRendererTurbo(this, 457, 321, textureX, textureY); // Import
        gunModel[780] = new ModelRendererTurbo(this, 473, 321, textureX, textureY); // Import
        gunModel[781] = new ModelRendererTurbo(this, 489, 321, textureX, textureY); // Import
        gunModel[782] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Import
        gunModel[783] = new ModelRendererTurbo(this, 17, 329, textureX, textureY); // Import
        gunModel[784] = new ModelRendererTurbo(this, 33, 329, textureX, textureY); // Import
        gunModel[785] = new ModelRendererTurbo(this, 49, 329, textureX, textureY); // Import
        gunModel[786] = new ModelRendererTurbo(this, 65, 329, textureX, textureY); // Import
        gunModel[787] = new ModelRendererTurbo(this, 81, 329, textureX, textureY); // Import
        gunModel[788] = new ModelRendererTurbo(this, 97, 329, textureX, textureY); // Import
        gunModel[789] = new ModelRendererTurbo(this, 113, 329, textureX, textureY); // Import
        gunModel[790] = new ModelRendererTurbo(this, 129, 329, textureX, textureY); // Import
        gunModel[791] = new ModelRendererTurbo(this, 145, 329, textureX, textureY); // Import
        gunModel[792] = new ModelRendererTurbo(this, 161, 329, textureX, textureY); // Import
        gunModel[793] = new ModelRendererTurbo(this, 177, 329, textureX, textureY); // Import
        gunModel[794] = new ModelRendererTurbo(this, 193, 329, textureX, textureY); // Import
        gunModel[795] = new ModelRendererTurbo(this, 505, 321, textureX, textureY); // Import
        gunModel[796] = new ModelRendererTurbo(this, 209, 329, textureX, textureY); // Import
        gunModel[797] = new ModelRendererTurbo(this, 217, 329, textureX, textureY); // Import
        gunModel[798] = new ModelRendererTurbo(this, 233, 329, textureX, textureY); // Import
        gunModel[799] = new ModelRendererTurbo(this, 249, 329, textureX, textureY); // Import
        gunModel[800] = new ModelRendererTurbo(this, 265, 329, textureX, textureY); // Import
        gunModel[801] = new ModelRendererTurbo(this, 281, 329, textureX, textureY); // Import
        gunModel[802] = new ModelRendererTurbo(this, 297, 329, textureX, textureY); // Import
        gunModel[803] = new ModelRendererTurbo(this, 313, 329, textureX, textureY); // Import
        gunModel[804] = new ModelRendererTurbo(this, 329, 329, textureX, textureY); // Import
        gunModel[805] = new ModelRendererTurbo(this, 345, 329, textureX, textureY); // Import
        gunModel[806] = new ModelRendererTurbo(this, 361, 329, textureX, textureY); // Import
        gunModel[807] = new ModelRendererTurbo(this, 369, 329, textureX, textureY); // Import
        gunModel[808] = new ModelRendererTurbo(this, 385, 329, textureX, textureY); // Import
        gunModel[809] = new ModelRendererTurbo(this, 401, 329, textureX, textureY); // Import
        gunModel[810] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Import
        gunModel[811] = new ModelRendererTurbo(this, 433, 329, textureX, textureY); // Import
        gunModel[812] = new ModelRendererTurbo(this, 449, 329, textureX, textureY); // Import
        gunModel[813] = new ModelRendererTurbo(this, 465, 329, textureX, textureY); // Import
        gunModel[814] = new ModelRendererTurbo(this, 481, 329, textureX, textureY); // Import
        gunModel[815] = new ModelRendererTurbo(this, 489, 329, textureX, textureY); // Import
        gunModel[816] = new ModelRendererTurbo(this, 497, 329, textureX, textureY); // Import
        gunModel[817] = new ModelRendererTurbo(this, 505, 329, textureX, textureY); // Import
        gunModel[818] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Import
        gunModel[819] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Import
        gunModel[820] = new ModelRendererTurbo(this, 9, 337, textureX, textureY); // Import
        gunModel[821] = new ModelRendererTurbo(this, 17, 337, textureX, textureY); // Import
        gunModel[822] = new ModelRendererTurbo(this, 25, 337, textureX, textureY); // Import
        gunModel[823] = new ModelRendererTurbo(this, 33, 337, textureX, textureY); // Import
        gunModel[824] = new ModelRendererTurbo(this, 49, 337, textureX, textureY); // Import
        gunModel[825] = new ModelRendererTurbo(this, 65, 337, textureX, textureY); // Import
        gunModel[826] = new ModelRendererTurbo(this, 73, 337, textureX, textureY); // Import
        gunModel[827] = new ModelRendererTurbo(this, 81, 337, textureX, textureY); // Import
        gunModel[828] = new ModelRendererTurbo(this, 89, 337, textureX, textureY); // Import
        gunModel[829] = new ModelRendererTurbo(this, 97, 337, textureX, textureY); // Import
        gunModel[830] = new ModelRendererTurbo(this, 113, 337, textureX, textureY); // Import
        gunModel[831] = new ModelRendererTurbo(this, 129, 337, textureX, textureY); // Import
        gunModel[832] = new ModelRendererTurbo(this, 145, 337, textureX, textureY); // Import
        gunModel[833] = new ModelRendererTurbo(this, 153, 337, textureX, textureY); // Import
        gunModel[834] = new ModelRendererTurbo(this, 161, 337, textureX, textureY); // Import
        gunModel[835] = new ModelRendererTurbo(this, 169, 337, textureX, textureY); // Import
        gunModel[836] = new ModelRendererTurbo(this, 177, 337, textureX, textureY); // Import
        gunModel[837] = new ModelRendererTurbo(this, 185, 337, textureX, textureY); // Import
        gunModel[838] = new ModelRendererTurbo(this, 193, 337, textureX, textureY); // Import
        gunModel[839] = new ModelRendererTurbo(this, 201, 337, textureX, textureY); // Import
        gunModel[840] = new ModelRendererTurbo(this, 209, 337, textureX, textureY); // Import
        gunModel[841] = new ModelRendererTurbo(this, 217, 337, textureX, textureY); // Import
        gunModel[842] = new ModelRendererTurbo(this, 225, 337, textureX, textureY); // Import
        gunModel[843] = new ModelRendererTurbo(this, 233, 337, textureX, textureY); // Import
        gunModel[844] = new ModelRendererTurbo(this, 241, 337, textureX, textureY); // Import
        gunModel[845] = new ModelRendererTurbo(this, 249, 337, textureX, textureY); // Import
        gunModel[846] = new ModelRendererTurbo(this, 265, 337, textureX, textureY); // Import
        gunModel[847] = new ModelRendererTurbo(this, 273, 337, textureX, textureY); // Import
        gunModel[848] = new ModelRendererTurbo(this, 281, 337, textureX, textureY); // Import
        gunModel[849] = new ModelRendererTurbo(this, 289, 337, textureX, textureY); // Import
        gunModel[850] = new ModelRendererTurbo(this, 297, 337, textureX, textureY); // Import
        gunModel[851] = new ModelRendererTurbo(this, 305, 337, textureX, textureY); // Import
        gunModel[852] = new ModelRendererTurbo(this, 313, 337, textureX, textureY); // Import
        gunModel[853] = new ModelRendererTurbo(this, 321, 337, textureX, textureY); // Import
        gunModel[854] = new ModelRendererTurbo(this, 329, 337, textureX, textureY); // Import
        gunModel[855] = new ModelRendererTurbo(this, 369, 337, textureX, textureY); // Import
        gunModel[856] = new ModelRendererTurbo(this, 385, 337, textureX, textureY); // Import
        gunModel[857] = new ModelRendererTurbo(this, 409, 337, textureX, textureY); // Import
        gunModel[858] = new ModelRendererTurbo(this, 417, 337, textureX, textureY); // Import
        gunModel[859] = new ModelRendererTurbo(this, 433, 337, textureX, textureY); // Import
        gunModel[860] = new ModelRendererTurbo(this, 441, 337, textureX, textureY); // Import
        gunModel[861] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Import
        gunModel[862] = new ModelRendererTurbo(this, 465, 337, textureX, textureY); // Import
        gunModel[863] = new ModelRendererTurbo(this, 481, 337, textureX, textureY); // Import
        gunModel[864] = new ModelRendererTurbo(this, 489, 337, textureX, textureY); // Import
        gunModel[865] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Import
        gunModel[866] = new ModelRendererTurbo(this, 121, 345, textureX, textureY); // Import
        gunModel[867] = new ModelRendererTurbo(this, 137, 345, textureX, textureY); // Import
        gunModel[868] = new ModelRendererTurbo(this, 505, 337, textureX, textureY); // Import
        gunModel[869] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Import
        gunModel[870] = new ModelRendererTurbo(this, 161, 345, textureX, textureY); // Import
        gunModel[871] = new ModelRendererTurbo(this, 169, 345, textureX, textureY); // Import
        gunModel[872] = new ModelRendererTurbo(this, 185, 345, textureX, textureY); // Import
        gunModel[873] = new ModelRendererTurbo(this, 201, 345, textureX, textureY); // Import
        gunModel[874] = new ModelRendererTurbo(this, 217, 345, textureX, textureY); // Import
        gunModel[875] = new ModelRendererTurbo(this, 225, 345, textureX, textureY); // Import
        gunModel[876] = new ModelRendererTurbo(this, 241, 345, textureX, textureY); // Import
        gunModel[877] = new ModelRendererTurbo(this, 257, 345, textureX, textureY); // Import
        gunModel[878] = new ModelRendererTurbo(this, 265, 345, textureX, textureY); // Import
        gunModel[879] = new ModelRendererTurbo(this, 281, 345, textureX, textureY); // Import
        gunModel[880] = new ModelRendererTurbo(this, 297, 345, textureX, textureY); // Import
        gunModel[881] = new ModelRendererTurbo(this, 321, 345, textureX, textureY); // Import
        gunModel[882] = new ModelRendererTurbo(this, 337, 345, textureX, textureY); // Import
        gunModel[883] = new ModelRendererTurbo(this, 353, 345, textureX, textureY); // Import
        gunModel[884] = new ModelRendererTurbo(this, 369, 345, textureX, textureY); // Import
        gunModel[885] = new ModelRendererTurbo(this, 385, 345, textureX, textureY); // Import
        gunModel[886] = new ModelRendererTurbo(this, 401, 345, textureX, textureY); // Import
        gunModel[887] = new ModelRendererTurbo(this, 417, 345, textureX, textureY); // Import
        gunModel[888] = new ModelRendererTurbo(this, 425, 345, textureX, textureY); // Import
        gunModel[889] = new ModelRendererTurbo(this, 441, 345, textureX, textureY); // Import
        gunModel[890] = new ModelRendererTurbo(this, 169, 345, textureX, textureY); // Import
        gunModel[891] = new ModelRendererTurbo(this, 313, 345, textureX, textureY); // Import
        gunModel[892] = new ModelRendererTurbo(this, 457, 345, textureX, textureY); // Import
        gunModel[893] = new ModelRendererTurbo(this, 473, 345, textureX, textureY); // Import
        gunModel[894] = new ModelRendererTurbo(this, 481, 345, textureX, textureY); // Import
        gunModel[895] = new ModelRendererTurbo(this, 489, 345, textureX, textureY); // Import
        gunModel[896] = new ModelRendererTurbo(this, 505, 345, textureX, textureY); // Import
        gunModel[897] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Import
        gunModel[898] = new ModelRendererTurbo(this, 9, 353, textureX, textureY); // Import
        gunModel[899] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Import
        gunModel[900] = new ModelRendererTurbo(this, 17, 353, textureX, textureY); // Import
        gunModel[901] = new ModelRendererTurbo(this, 25, 353, textureX, textureY); // Import
        gunModel[902] = new ModelRendererTurbo(this, 57, 353, textureX, textureY); // Import
        gunModel[903] = new ModelRendererTurbo(this, 137, 377, textureX, textureY); // Import
        gunModel[904] = new ModelRendererTurbo(this, 401, 361, textureX, textureY); // Import
        gunModel[905] = new ModelRendererTurbo(this, 425, 361, textureX, textureY); // Import
        gunModel[906] = new ModelRendererTurbo(this, 449, 361, textureX, textureY); // Import
        gunModel[907] = new ModelRendererTurbo(this, 473, 361, textureX, textureY); // Import
        gunModel[908] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Import
        gunModel[909] = new ModelRendererTurbo(this, 25, 369, textureX, textureY); // Import
        gunModel[910] = new ModelRendererTurbo(this, 49, 369, textureX, textureY); // Import
        gunModel[911] = new ModelRendererTurbo(this, 137, 369, textureX, textureY); // Import
        gunModel[912] = new ModelRendererTurbo(this, 161, 369, textureX, textureY); // Import
        gunModel[913] = new ModelRendererTurbo(this, 257, 369, textureX, textureY); // Import
        gunModel[914] = new ModelRendererTurbo(this, 393, 369, textureX, textureY); // Import
        gunModel[915] = new ModelRendererTurbo(this, 417, 369, textureX, textureY); // Import
        gunModel[916] = new ModelRendererTurbo(this, 441, 369, textureX, textureY); // Import
        gunModel[917] = new ModelRendererTurbo(this, 465, 369, textureX, textureY); // Import
        gunModel[918] = new ModelRendererTurbo(this, 489, 369, textureX, textureY); // Import
        gunModel[919] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Import
        gunModel[920] = new ModelRendererTurbo(this, 25, 377, textureX, textureY); // Import
        gunModel[921] = new ModelRendererTurbo(this, 49, 377, textureX, textureY); // Import
        gunModel[922] = new ModelRendererTurbo(this, 265, 361, textureX, textureY); // Import
        gunModel[923] = new ModelRendererTurbo(this, 497, 361, textureX, textureY); // Import
        gunModel[924] = new ModelRendererTurbo(this, 505, 361, textureX, textureY); // Import
        gunModel[925] = new ModelRendererTurbo(this, 73, 369, textureX, textureY); // Import
        gunModel[926] = new ModelRendererTurbo(this, 369, 369, textureX, textureY); // Import
        gunModel[927] = new ModelRendererTurbo(this, 73, 377, textureX, textureY); // Import
        gunModel[928] = new ModelRendererTurbo(this, 321, 377, textureX, textureY); // Import
        gunModel[929] = new ModelRendererTurbo(this, 329, 377, textureX, textureY); // Import
        gunModel[930] = new ModelRendererTurbo(this, 337, 377, textureX, textureY); // Import
        gunModel[931] = new ModelRendererTurbo(this, 345, 377, textureX, textureY); // Import
        gunModel[932] = new ModelRendererTurbo(this, 353, 377, textureX, textureY); // Import
        gunModel[933] = new ModelRendererTurbo(this, 361, 377, textureX, textureY); // Import
        gunModel[934] = new ModelRendererTurbo(this, 369, 377, textureX, textureY); // Import
        gunModel[935] = new ModelRendererTurbo(this, 377, 377, textureX, textureY); // Import
        gunModel[936] = new ModelRendererTurbo(this, 385, 377, textureX, textureY); // Import
        gunModel[937] = new ModelRendererTurbo(this, 393, 377, textureX, textureY); // Import
        gunModel[938] = new ModelRendererTurbo(this, 401, 377, textureX, textureY); // Import
        gunModel[939] = new ModelRendererTurbo(this, 425, 377, textureX, textureY); // Import
        gunModel[940] = new ModelRendererTurbo(this, 449, 377, textureX, textureY); // Import
        gunModel[941] = new ModelRendererTurbo(this, 257, 361, textureX, textureY); // Import
        gunModel[942] = new ModelRendererTurbo(this, 297, 361, textureX, textureY); // Import
        gunModel[943] = new ModelRendererTurbo(this, 137, 385, textureX, textureY); // Import
        gunModel[944] = new ModelRendererTurbo(this, 305, 361, textureX, textureY); // Import
        gunModel[945] = new ModelRendererTurbo(this, 345, 361, textureX, textureY); // Import
        gunModel[946] = new ModelRendererTurbo(this, 353, 361, textureX, textureY); // Import
        gunModel[947] = new ModelRendererTurbo(this, 369, 361, textureX, textureY); // Import
        gunModel[948] = new ModelRendererTurbo(this, 377, 361, textureX, textureY); // Import
        gunModel[949] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Import
        gunModel[950] = new ModelRendererTurbo(this, 417, 361, textureX, textureY); // Import
        gunModel[951] = new ModelRendererTurbo(this, 441, 361, textureX, textureY); // Import
        gunModel[952] = new ModelRendererTurbo(this, 465, 361, textureX, textureY); // Import
        gunModel[953] = new ModelRendererTurbo(this, 489, 361, textureX, textureY); // Import
        gunModel[954] = new ModelRendererTurbo(this, 17, 369, textureX, textureY); // Import
        gunModel[955] = new ModelRendererTurbo(this, 41, 369, textureX, textureY); // Import
        gunModel[956] = new ModelRendererTurbo(this, 65, 369, textureX, textureY); // Import
        gunModel[957] = new ModelRendererTurbo(this, 273, 369, textureX, textureY); // Import
        gunModel[958] = new ModelRendererTurbo(this, 409, 369, textureX, textureY); // Import
        gunModel[959] = new ModelRendererTurbo(this, 433, 369, textureX, textureY); // Import
        gunModel[960] = new ModelRendererTurbo(this, 457, 369, textureX, textureY); // Import
        gunModel[961] = new ModelRendererTurbo(this, 481, 369, textureX, textureY); // Import
        gunModel[962] = new ModelRendererTurbo(this, 505, 369, textureX, textureY); // Import
        gunModel[963] = new ModelRendererTurbo(this, 17, 377, textureX, textureY); // Import
        gunModel[964] = new ModelRendererTurbo(this, 41, 377, textureX, textureY); // Import
        gunModel[965] = new ModelRendererTurbo(this, 65, 377, textureX, textureY); // Import
        gunModel[966] = new ModelRendererTurbo(this, 417, 377, textureX, textureY); // Import
        gunModel[967] = new ModelRendererTurbo(this, 441, 377, textureX, textureY); // Import
        gunModel[968] = new ModelRendererTurbo(this, 465, 377, textureX, textureY); // Import
        gunModel[969] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Import
        gunModel[970] = new ModelRendererTurbo(this, 481, 377, textureX, textureY); // Import
        gunModel[971] = new ModelRendererTurbo(this, 489, 377, textureX, textureY); // Import
        gunModel[972] = new ModelRendererTurbo(this, 497, 377, textureX, textureY); // Import
        gunModel[973] = new ModelRendererTurbo(this, 505, 377, textureX, textureY); // Import
        gunModel[974] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Import
        gunModel[975] = new ModelRendererTurbo(this, 9, 385, textureX, textureY); // Import
        gunModel[976] = new ModelRendererTurbo(this, 17, 385, textureX, textureY); // Import
        gunModel[977] = new ModelRendererTurbo(this, 25, 385, textureX, textureY); // Import
        gunModel[978] = new ModelRendererTurbo(this, 33, 385, textureX, textureY); // Import
        gunModel[979] = new ModelRendererTurbo(this, 41, 385, textureX, textureY); // Import
        gunModel[980] = new ModelRendererTurbo(this, 49, 385, textureX, textureY); // Import
        gunModel[981] = new ModelRendererTurbo(this, 57, 385, textureX, textureY); // Import
        gunModel[982] = new ModelRendererTurbo(this, 65, 385, textureX, textureY); // Import
        gunModel[983] = new ModelRendererTurbo(this, 73, 385, textureX, textureY); // Import
        gunModel[984] = new ModelRendererTurbo(this, 321, 385, textureX, textureY); // Import
        gunModel[985] = new ModelRendererTurbo(this, 329, 385, textureX, textureY); // Import
        gunModel[986] = new ModelRendererTurbo(this, 401, 361, textureX, textureY); // Import
        gunModel[987] = new ModelRendererTurbo(this, 425, 361, textureX, textureY); // Import
        gunModel[988] = new ModelRendererTurbo(this, 449, 361, textureX, textureY); // Import

        gunModel[500].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[500].setRotationPoint(-94F, -53.01F, 2F);

        gunModel[501].addShapeBox(0F, 0F, 0F, 42, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[501].setRotationPoint(-99F, -57F, 2F);

        gunModel[502].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0.0F, -1.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[502].setRotationPoint(-99F, -56F, 3F);

        gunModel[503].addShapeBox(0F, 0F, 0F, 42, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[503].setRotationPoint(-99F, -57F, -3F);

        gunModel[504].addShapeBox(0F, 0F, 0F, 41, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 3.0F, -4.0F, 0.0F, 3.0F, -4.0F, 0.0F, -3.0F, -6.0F, 0.0F, -3.0F); // Import
        gunModel[504].setRotationPoint(-99F, -56F, -4F);

        gunModel[505].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0.0F, -1.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[505].setRotationPoint(-99F, -56F, -4F);

        gunModel[506].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[506].setRotationPoint(-93F, -53F, -7F);

        gunModel[507].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[507].setRotationPoint(-97F, -52F, 1F);

        gunModel[508].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[508].setRotationPoint(-99F, -53F, 1F);

        gunModel[509].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[509].setRotationPoint(-95F, -52F, 1F);

        gunModel[510].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[510].setRotationPoint(-93F, -52F, 1F);

        gunModel[511].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[511].setRotationPoint(-91F, -52F, 1F);

        gunModel[512].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[512].setRotationPoint(-89F, -52F, 1F);

        gunModel[513].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[513].setRotationPoint(-96F, -51F, 1F);

        gunModel[514].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[514].setRotationPoint(-96F, -50F, 1F);

        gunModel[515].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[515].setRotationPoint(-98F, -51F, 1F);

        gunModel[516].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[516].setRotationPoint(-98F, -49F, 1F);

        gunModel[517].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[517].setRotationPoint(-98F, -47F, 1F);

        gunModel[518].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[518].setRotationPoint(-98F, -45F, 1F);

        gunModel[519].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[519].setRotationPoint(-98F, -43F, 1F);

        gunModel[520].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[520].setRotationPoint(-98F, -41F, 1F);

        gunModel[521].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[521].setRotationPoint(-98F, -39F, 1F);

        gunModel[522].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[522].setRotationPoint(-98F, -37F, 1F);

        gunModel[523].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[523].setRotationPoint(-98F, -35F, 1F);

        gunModel[524].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[524].setRotationPoint(-98F, -33F, 1F);

        gunModel[525].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[525].setRotationPoint(-99F, -53F, -2F);

        gunModel[526].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[526].setRotationPoint(-99F, -52F, -2F);

        gunModel[527].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[527].setRotationPoint(-97F, -52F, -2F);

        gunModel[528].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[528].setRotationPoint(-96F, -51F, -2F);

        gunModel[529].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[529].setRotationPoint(-89F, -52F, -2F);

        gunModel[530].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[530].setRotationPoint(-96F, -50F, -2F);

        gunModel[531].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[531].setRotationPoint(-95F, -52F, -2F);

        gunModel[532].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[532].setRotationPoint(-93F, -52F, -2F);

        gunModel[533].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[533].setRotationPoint(-91F, -52F, -2F);

        gunModel[534].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[534].setRotationPoint(-98F, -51F, -2F);

        gunModel[535].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[535].setRotationPoint(-98F, -49F, -2F);

        gunModel[536].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[536].setRotationPoint(-98F, -47F, -2F);

        gunModel[537].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[537].setRotationPoint(-98F, -45F, -2F);

        gunModel[538].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[538].setRotationPoint(-98F, -43F, -2F);

        gunModel[539].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[539].setRotationPoint(-98F, -41F, -2F);

        gunModel[540].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[540].setRotationPoint(-98F, -39F, -2F);

        gunModel[541].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[541].setRotationPoint(-98F, -37F, -2F);

        gunModel[542].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[542].setRotationPoint(-98F, -35F, -2F);

        gunModel[543].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[543].setRotationPoint(-98F, -33F, -2F);

        gunModel[544].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[544].setRotationPoint(-101F, -45.5F, -3F);

        gunModel[545].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F); // Import
        gunModel[545].setRotationPoint(-101F, -45.5F, 3F);

        gunModel[546].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[546].setRotationPoint(-98F, -45.5F, 5F);

        gunModel[547].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[547].setRotationPoint(-101F, -45.5F, -6F);

        gunModel[548].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[548].setRotationPoint(-98F, -45.5F, -6F);

        gunModel[549].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[549].setRotationPoint(16F, -60F, 5F);

        gunModel[550].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[550].setRotationPoint(0F, -58F, 5F);

        gunModel[551].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[551].setRotationPoint(-4F, -51F, 5F);

        gunModel[552].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[552].setRotationPoint(-28F, -51F, 3F);

        gunModel[553].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[553].setRotationPoint(9F, -53F, 5F);

        gunModel[554].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[554].setRotationPoint(27F, -61F, 4F);

        gunModel[555].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[555].setRotationPoint(5F, -59F, 5F);

        gunModel[556].addShapeBox(0F, 0F, 0F, 8, 6, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[556].setRotationPoint(19F, -61F, 4F);

        gunModel[557].addShapeBox(0F, 0F, 0F, 7, 6, 2, 0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[557].setRotationPoint(12F, -61F, 4F);

        gunModel[558].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[558].setRotationPoint(-10F, -59F, 4F);

        gunModel[559].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[559].setRotationPoint(25F, -58F, -4F);

        gunModel[560].addShapeBox(0F, 0F, 0F, 26, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[560].setRotationPoint(-17F, -55F, 4F);

        gunModel[561].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[561].setRotationPoint(28F, -55F, 4F);

        gunModel[562].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[562].setRotationPoint(29F, -60F, 4F);

        gunModel[563].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[563].setRotationPoint(9F, -55F, 5F);

        gunModel[564].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[564].setRotationPoint(6F, -59F, 4F);

        gunModel[565].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[565].setRotationPoint(19F, -61F, 5F);

        gunModel[566].addShapeBox(0F, 0F, 0F, 46, 1, 1, 0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[566].setRotationPoint(-26F, -48F, 5F);

        gunModel[567].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[567].setRotationPoint(-28F, -52F, 3F);

        gunModel[568].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[568].setRotationPoint(-1F, -56F, 4F);

        gunModel[569].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[569].setRotationPoint(18F, -56F, 5F);

        gunModel[570].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[570].setRotationPoint(18F, -58F, 5F);

        gunModel[571].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[571].setRotationPoint(-4F, -49F, 5F);

        gunModel[572].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[572].setRotationPoint(-4F, -50F, 5F);

        gunModel[573].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[573].setRotationPoint(-26F, -49F, 5F);

        gunModel[574].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[574].setRotationPoint(-26F, -51F, 5F);

        gunModel[575].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F); // Import
        gunModel[575].setRotationPoint(9F, -55F, 4F);

        gunModel[576].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[576].setRotationPoint(-17F, -57F, 4F);

        gunModel[577].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[577].setRotationPoint(-18F, -55F, 4F);

        gunModel[578].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[578].setRotationPoint(20F, -46F, 3F);

        gunModel[579].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[579].setRotationPoint(-94F, -53.01F, -6F);

        gunModel[580].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[580].setRotationPoint(79F, -57.5F, 5F);

        gunModel[581].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[581].setRotationPoint(107F, -57.5F, 5F);

        gunModel[582].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[582].setRotationPoint(98F, -57.5F, 5F);

        gunModel[583].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[583].setRotationPoint(89F, -57.5F, 5F);

        gunModel[584].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[584].setRotationPoint(116F, -57.5F, 5F);

        gunModel[585].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[585].setRotationPoint(74F, -57.5F, 5F);

        gunModel[586].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[586].setRotationPoint(65F, -57.5F, 5F);

        gunModel[587].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[587].setRotationPoint(56F, -57.5F, 5F);

        gunModel[588].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[588].setRotationPoint(47F, -57.5F, 5F);

        gunModel[589].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[589].setRotationPoint(38F, -57.5F, 5F);

        gunModel[590].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[590].setRotationPoint(115F, -52.5F, 5F);

        gunModel[591].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[591].setRotationPoint(82F, -52.5F, 5F);

        gunModel[592].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[592].setRotationPoint(75F, -50.5F, 5F);

        gunModel[593].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[593].setRotationPoint(75F, -51.5F, 5F);

        gunModel[594].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[594].setRotationPoint(107F, -48.5F, 5F);

        gunModel[595].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[595].setRotationPoint(39F, -48.5F, 5F);

        gunModel[596].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[596].setRotationPoint(47F, -48.5F, 5F);

        gunModel[597].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[597].setRotationPoint(56F, -48.5F, 5F);

        gunModel[598].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[598].setRotationPoint(65F, -48.5F, 5F);

        gunModel[599].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[599].setRotationPoint(74F, -48.5F, 5F);

        gunModel[600].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[600].setRotationPoint(89F, -48.5F, 5F);

        gunModel[601].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[601].setRotationPoint(98F, -48.5F, 5F);

        gunModel[602].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[602].setRotationPoint(107F, -48.5F, -6F);

        gunModel[603].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[603].setRotationPoint(65F, -48.5F, -6F);

        gunModel[604].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[604].setRotationPoint(39F, -48.5F, -6F);

        gunModel[605].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[605].setRotationPoint(56F, -48.5F, -6F);

        gunModel[606].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[606].setRotationPoint(47F, -48.5F, -6F);

        gunModel[607].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[607].setRotationPoint(74F, -48.5F, -6F);

        gunModel[608].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[608].setRotationPoint(98F, -48.5F, -6F);

        gunModel[609].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[609].setRotationPoint(89F, -48.5F, -6F);

        gunModel[610].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[610].setRotationPoint(115F, -52.5F, -6F);

        gunModel[611].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[611].setRotationPoint(82F, -52.5F, -6F);

        gunModel[612].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F); // Import
        gunModel[612].setRotationPoint(81F, -50.5F, 5F);

        gunModel[613].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[613].setRotationPoint(71F, -52.5F, 5F);

        gunModel[614].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[614].setRotationPoint(71F, -50.5F, 5F);

        gunModel[615].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[615].setRotationPoint(67F, -52.5F, 5F);

        gunModel[616].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[616].setRotationPoint(63F, -52.5F, 5F);

        gunModel[617].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[617].setRotationPoint(59F, -52.5F, 5F);

        gunModel[618].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[618].setRotationPoint(53F, -52.5F, 5F);

        gunModel[619].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[619].setRotationPoint(49F, -52.5F, 5F);

        gunModel[620].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[620].setRotationPoint(45F, -52.5F, 5F);

        gunModel[621].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[621].setRotationPoint(45F, -50.5F, 5F);

        gunModel[622].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[622].setRotationPoint(49F, -50.5F, 5F);

        gunModel[623].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[623].setRotationPoint(53F, -50.5F, 5F);

        gunModel[624].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[624].setRotationPoint(59F, -50.5F, 5F);

        gunModel[625].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[625].setRotationPoint(63F, -50.5F, 5F);

        gunModel[626].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[626].setRotationPoint(67F, -50.5F, 5F);

        gunModel[627].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F); // Import
        gunModel[627].setRotationPoint(81F, -50.5F, -6F);

        gunModel[628].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[628].setRotationPoint(75F, -52.5F, -6F);

        gunModel[629].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[629].setRotationPoint(71F, -52.5F, -6F);

        gunModel[630].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[630].setRotationPoint(67F, -52.5F, -6F);

        gunModel[631].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[631].setRotationPoint(63F, -52.5F, -6F);

        gunModel[632].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[632].setRotationPoint(59F, -52.5F, -6F);

        gunModel[633].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[633].setRotationPoint(53F, -52.5F, -6F);

        gunModel[634].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[634].setRotationPoint(49F, -52.5F, -6F);

        gunModel[635].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[635].setRotationPoint(45F, -52.5F, -6F);

        gunModel[636].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[636].setRotationPoint(45F, -50.5F, -6F);

        gunModel[637].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[637].setRotationPoint(49F, -50.5F, -6F);

        gunModel[638].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[638].setRotationPoint(53F, -50.5F, -6F);

        gunModel[639].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[639].setRotationPoint(59F, -50.5F, -6F);

        gunModel[640].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[640].setRotationPoint(63F, -50.5F, -6F);

        gunModel[641].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[641].setRotationPoint(67F, -50.5F, -6F);

        gunModel[642].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[642].setRotationPoint(71F, -50.5F, -6F);

        gunModel[643].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[643].setRotationPoint(75F, -50.5F, -6F);

        gunModel[644].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[644].setRotationPoint(39F, -52.5F, 5F);

        gunModel[645].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[645].setRotationPoint(39F, -50.5F, 5F);

        gunModel[646].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[646].setRotationPoint(39F, -50.5F, -6F);

        gunModel[647].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[647].setRotationPoint(39F, -51.5F, -6F);

        gunModel[648].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[648].setRotationPoint(39F, -52.5F, -6F);

        gunModel[649].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[649].setRotationPoint(73F, -53.5F, -6F);

        gunModel[650].addShapeBox(0F, -1F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[650].setRotationPoint(117F, -60F, 3F);

        gunModel[651].addShapeBox(0F, -1F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[651].setRotationPoint(117F, -60F, -4F);

        gunModel[652].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[652].setRotationPoint(29F, -60F, -4F);

        gunModel[653].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[653].setRotationPoint(27F, -45.5F, -5F);

        gunModel[654].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[654].setRotationPoint(27F, -46F, -5F);

        gunModel[655].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[655].setRotationPoint(24F, -46.5F, -5F);

        gunModel[656].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[656].setRotationPoint(24F, -44.5F, -5F);

        gunModel[657].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[657].setRotationPoint(22F, -46.5F, -5F);

        gunModel[658].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[658].setRotationPoint(22F, -44.5F, -5F);

        gunModel[659].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[659].setRotationPoint(20F, -46.5F, -4F);

        gunModel[660].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[660].setRotationPoint(20F, -44.5F, -4F);

        gunModel[661].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[661].setRotationPoint(16F, -46.5F, -4F);

        gunModel[662].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[662].setRotationPoint(16F, -44.5F, -4F);

        gunModel[663].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[663].setRotationPoint(12F, -46.5F, -4F);

        gunModel[664].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[664].setRotationPoint(12F, -44.5F, -4F);

        gunModel[665].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[665].setRotationPoint(8F, -44.5F, -4F);

        gunModel[666].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[666].setRotationPoint(8F, -46.5F, -4F);

        gunModel[667].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[667].setRotationPoint(6F, -46.5F, -4F);

        gunModel[668].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[668].setRotationPoint(6F, -44.5F, -4F);

        gunModel[669].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[669].setRotationPoint(-40F, -44.5F, -9F);

        gunModel[670].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[670].setRotationPoint(-40F, -45.5F, -9F);

        gunModel[671].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[671].setRotationPoint(-36F, -46.5F, -9F);

        gunModel[672].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[672].setRotationPoint(-36F, -44.5F, -9F);

        gunModel[673].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[673].setRotationPoint(-33F, -46.5F, -9F);

        gunModel[674].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[674].setRotationPoint(-33F, -44.5F, -9F);

        gunModel[675].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[675].setRotationPoint(-33F, -44.5F, 8F);

        gunModel[676].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[676].setRotationPoint(-33F, -46.5F, 8F);

        gunModel[677].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[677].setRotationPoint(-40F, -46.5F, 8F);

        gunModel[678].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[678].setRotationPoint(-40F, -44.5F, 8F);

        gunModel[679].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[679].setRotationPoint(-36F, -46.5F, 8F);

        gunModel[680].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[680].setRotationPoint(-36F, -44.5F, 8F);

        gunModel[681].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[681].setRotationPoint(-41F, -48F, 3.5F);

        gunModel[682].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[682].setRotationPoint(-42F, -48F, 3.5F);

        gunModel[683].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[683].setRotationPoint(-41F, -48F, 7.5F);

        gunModel[684].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[684].setRotationPoint(-42F, -48F, 7.5F);

        gunModel[685].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[685].setRotationPoint(-41F, -48F, -4.5F);

        gunModel[686].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[686].setRotationPoint(-43F, -48F, -4.5F);

        gunModel[687].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[687].setRotationPoint(-41F, -48F, -8.5F);

        gunModel[688].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[688].setRotationPoint(-43F, -48F, -8.5F);

        gunModel[689].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[689].setRotationPoint(-40F, -48F, 3.5F);

        gunModel[690].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[690].setRotationPoint(-22F, -44F, 4F);

        gunModel[691].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[691].setRotationPoint(-22F, -46F, 4F);

        gunModel[692].addShapeBox(0F, 0F, 0F, 14, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[692].setRotationPoint(-85F, -44F, 4F);

        gunModel[693].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[693].setRotationPoint(-67F, -44F, 4F);

        gunModel[694].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[694].setRotationPoint(-58F, -44F, 4F);

        gunModel[695].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[695].setRotationPoint(-49F, -44F, 4F);

        gunModel[696].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[696].setRotationPoint(-40F, -44F, 4F);

        gunModel[697].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[697].setRotationPoint(-31F, -44F, 4F);

        gunModel[698].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[698].setRotationPoint(-47F, -48F, 5.5F);

        gunModel[699].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[699].setRotationPoint(-47F, -48F, -5F);

        gunModel[700].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[700].setRotationPoint(-47F, -48F, -8.5F);

        gunModel[701].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[701].setRotationPoint(-47F, -47.5F, -9F);

        gunModel[702].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[702].setRotationPoint(-47F, -44.5F, 8F);

        gunModel[703].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[703].setRotationPoint(-47F, -43F, 4F);

        gunModel[704].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[704].setRotationPoint(-47F, -43F, -5F);

        gunModel[705].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[705].setRotationPoint(-47F, -43F, -8.5F);

        gunModel[706].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[706].setRotationPoint(-47F, -44.5F, -9F);

        gunModel[707].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[707].setRotationPoint(-47F, -46.5F, 8F);

        gunModel[708].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[708].setRotationPoint(-47F, -46.5F, -9F);

        gunModel[709].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[709].setRotationPoint(-40F, -43F, 4F);

        gunModel[710].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[710].setRotationPoint(-40F, -43F, -8.5F);

        gunModel[711].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[711].setRotationPoint(-31F, -51F, -4F);

        gunModel[712].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[712].setRotationPoint(-31F, -51F, -4F);

        gunModel[713].addShapeBox(0F, 0F, 0F, 13, 2, 6, 0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[713].setRotationPoint(-88F, -46F, 3F);

        gunModel[714].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[714].setRotationPoint(-88F, -44F, 3F);

        gunModel[715].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[715].setRotationPoint(-85F, -48F, 3F);

        gunModel[716].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[716].setRotationPoint(-85F, -44F, 3F);

        gunModel[717].addShapeBox(0F, 0F, 0F, 13, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F); // Import
        gunModel[717].setRotationPoint(-88F, -46F, -9F);

        gunModel[718].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F); // Import
        gunModel[718].setRotationPoint(-88F, -44F, -9F);

        gunModel[719].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[719].setRotationPoint(-85F, -48F, -9F);

        gunModel[720].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[720].setRotationPoint(-85F, -44F, -9F);

        gunModel[721].addShapeBox(0F, 0F, 0F, 74, 1, 4, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[721].setRotationPoint(-85F, -47F, -8F);

        gunModel[722].addShapeBox(0F, 0F, 0F, 14, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[722].setRotationPoint(-85F, -44F, -8F);

        gunModel[723].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[723].setRotationPoint(-67F, -44F, -8F);

        gunModel[724].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[724].setRotationPoint(-58F, -44F, -8F);

        gunModel[725].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[725].setRotationPoint(-49F, -44F, -8F);

        gunModel[726].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[726].setRotationPoint(-31F, -44F, -8F);

        gunModel[727].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[727].setRotationPoint(-22F, -44F, -8F);

        gunModel[728].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[728].setRotationPoint(27F, -46.5F, 3F);

        gunModel[729].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[729].setRotationPoint(27F, -44.5F, 3F);

        gunModel[730].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[730].setRotationPoint(27F, -46F, 3F);

        gunModel[731].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[731].setRotationPoint(6F, -46.5F, 3F);

        gunModel[732].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[732].setRotationPoint(6F, -44.5F, 3F);

        gunModel[733].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[733].setRotationPoint(8F, -46.5F, 3F);

        gunModel[734].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[734].setRotationPoint(12F, -46.5F, 3F);

        gunModel[735].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[735].setRotationPoint(16F, -46.5F, 3F);

        gunModel[736].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[736].setRotationPoint(16F, -44.5F, 3F);

        gunModel[737].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[737].setRotationPoint(12F, -44.5F, 3F);

        gunModel[738].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[738].setRotationPoint(8F, -44.5F, 3F);

        gunModel[739].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[739].setRotationPoint(20F, -46.5F, 3F);

        gunModel[740].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[740].setRotationPoint(20F, -44.5F, 3F);

        gunModel[741].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[741].setRotationPoint(24F, -46.5F, 3F);

        gunModel[742].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[742].setRotationPoint(24F, -44.5F, 3F);

        gunModel[743].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[743].setRotationPoint(22F, -46.5F, 3F);

        gunModel[744].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[744].setRotationPoint(22F, -44.5F, 3F);

        gunModel[745].addShapeBox(0F, 0F, 0F, 47, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[745].setRotationPoint(-27F, -47F, -5F);

        gunModel[746].addShapeBox(0F, 0F, 0F, 46, 1, 2, 0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[746].setRotationPoint(-26F, -44F, -5F);

        gunModel[747].addShapeBox(0F, 0F, 0F, 47, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F); // Import
        gunModel[747].setRotationPoint(-27F, -47F, 3F);

        gunModel[748].addShapeBox(0F, 0F, 0F, 46, 1, 2, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[748].setRotationPoint(-26F, -44F, 3F);

        gunModel[749].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[749].setRotationPoint(20F, -46F, -5F);

        gunModel[750].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[750].setRotationPoint(20F, -47F, -5F);

        gunModel[751].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[751].setRotationPoint(20F, -44F, 4F);

        gunModel[752].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[752].setRotationPoint(20F, -47F, 4F);

        gunModel[753].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[753].setRotationPoint(22F, -43F, 5F);

        gunModel[754].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[754].setRotationPoint(22F, -43F, -6F);

        gunModel[755].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[755].setRotationPoint(20F, -44F, -5F);

        gunModel[756].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[756].setRotationPoint(-26F, -50F, 5F);

        gunModel[757].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[757].setRotationPoint(-46F, -47F, 4F);

        gunModel[758].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[758].setRotationPoint(-46F, -47F, -5F);

        gunModel[759].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F); // Import
        gunModel[759].setRotationPoint(-46F, -44F, -5F);

        gunModel[760].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[760].setRotationPoint(-46F, -44F, 4F);

        gunModel[761].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[761].setRotationPoint(-40F, -44F, 4F);

        gunModel[762].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[762].setRotationPoint(-40F, -44F, -5F);

        gunModel[763].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[763].setRotationPoint(-40F, -44F, -8F);

        gunModel[764].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[764].setRotationPoint(-40F, -44F, 7F);

        gunModel[765].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[765].setRotationPoint(-47F, -44F, 7F);

        gunModel[766].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[766].setRotationPoint(-47F, -44F, -8F);

        gunModel[767].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[767].setRotationPoint(-47F, -47F, -8F);

        gunModel[768].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[768].setRotationPoint(-47F, -47F, 7F);

        gunModel[769].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[769].setRotationPoint(0F, -56F, 6F);

        gunModel[770].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[770].setRotationPoint(-9F, -37.5F, -0.5F);

        gunModel[771].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[771].setRotationPoint(-9F, -35.5F, -0.5F);

        gunModel[772].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[772].setRotationPoint(-10F, -35.5F, -0.5F);

        gunModel[773].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[773].setRotationPoint(-10F, -37.5F, -0.5F);

        gunModel[774].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[774].setRotationPoint(-12F, -38F, 0.5F);

        gunModel[775].addShapeBox(0F, -1F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[775].setRotationPoint(115F, -60F, 4F);

        gunModel[776].addShapeBox(0F, -1F, 0F, 2, 1, 1, 0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[776].setRotationPoint(115F, -60F, 4F);

        gunModel[777].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[777].setRotationPoint(73F, -60F, 4F);

        gunModel[778].addShapeBox(0F, -1F, 0F, 3, 1, 1, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[778].setRotationPoint(38F, -60F, 4F);

        gunModel[779].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[779].setRotationPoint(79F, -60F, 4F);

        gunModel[780].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F); // Import
        gunModel[780].setRotationPoint(106F, -60F, 3F);

        gunModel[781].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[781].setRotationPoint(106F, -60F, 4F);

        gunModel[782].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[782].setRotationPoint(97F, -60F, 4F);

        gunModel[783].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[783].setRotationPoint(88F, -60F, 4F);

        gunModel[784].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[784].setRotationPoint(64F, -60F, 4F);

        gunModel[785].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[785].setRotationPoint(55F, -60F, 4F);

        gunModel[786].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[786].setRotationPoint(46F, -60F, 4F);

        gunModel[787].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[787].setRotationPoint(79F, -60F, 4F);

        gunModel[788].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[788].setRotationPoint(73F, -60F, 4F);

        gunModel[789].addShapeBox(0F, -1F, 0F, 3, 1, 1, 0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[789].setRotationPoint(38F, -60F, 4F);

        gunModel[790].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F); // Import
        gunModel[790].setRotationPoint(97F, -60F, 3F);

        gunModel[791].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F); // Import
        gunModel[791].setRotationPoint(88F, -60F, 3F);

        gunModel[792].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F); // Import
        gunModel[792].setRotationPoint(64F, -60F, 3F);

        gunModel[793].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F); // Import
        gunModel[793].setRotationPoint(55F, -60F, 3F);

        gunModel[794].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F); // Import
        gunModel[794].setRotationPoint(46F, -60F, 3F);

        gunModel[795].addShapeBox(0F, -1F, 0F, 2, 1, 1, 0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F); // Import
        gunModel[795].setRotationPoint(115F, -60F, -5F);

        gunModel[796].addShapeBox(0F, -1F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[796].setRotationPoint(115F, -60F, -5F);

        gunModel[797].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F); // Import
        gunModel[797].setRotationPoint(106F, -60F, -5F);

        gunModel[798].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F); // Import
        gunModel[798].setRotationPoint(97F, -60F, -5F);

        gunModel[799].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F); // Import
        gunModel[799].setRotationPoint(88F, -60F, -5F);

        gunModel[800].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[800].setRotationPoint(79F, -60F, -5F);

        gunModel[801].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F); // Import
        gunModel[801].setRotationPoint(88F, -60F, -4F);

        gunModel[802].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F); // Import
        gunModel[802].setRotationPoint(97F, -60F, -4F);

        gunModel[803].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F); // Import
        gunModel[803].setRotationPoint(106F, -60F, -4F);

        gunModel[804].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F); // Import
        gunModel[804].setRotationPoint(79F, -60F, -5F);

        gunModel[805].addShapeBox(0F, -1F, 0F, 2, 1, 2, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[805].setRotationPoint(75F, -60F, -5F);

        gunModel[806].addShapeBox(0F, -1F, 0F, 2, 1, 1, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F); // Import
        gunModel[806].setRotationPoint(75F, -60F, -4F);

        gunModel[807].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F); // Import
        gunModel[807].setRotationPoint(66F, -60F, -5F);

        gunModel[808].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F); // Import
        gunModel[808].setRotationPoint(57F, -60F, -5F);

        gunModel[809].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F); // Import
        gunModel[809].setRotationPoint(48F, -60F, -5F);

        gunModel[810].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F); // Import
        gunModel[810].setRotationPoint(39F, -60F, -5F);

        gunModel[811].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F); // Import
        gunModel[811].setRotationPoint(66F, -60F, -4F);

        gunModel[812].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F); // Import
        gunModel[812].setRotationPoint(57F, -60F, -4F);

        gunModel[813].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F); // Import
        gunModel[813].setRotationPoint(48F, -60F, -4F);

        gunModel[814].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[814].setRotationPoint(33F, -60F, -5F);

        gunModel[815].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F); // Import
        gunModel[815].setRotationPoint(33F, -60F, -4F);

        gunModel[816].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[816].setRotationPoint(-29F, -53.5F, 5F);

        gunModel[817].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[817].setRotationPoint(-29F, -51.5F, 5F);

        gunModel[818].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 3.0F, 0.0F, 0.5F, 3.0F); // Import
        gunModel[818].setRotationPoint(-29F, -54F, -2F);

        gunModel[819].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[819].setRotationPoint(-29F, -55.5F, -2F);

        gunModel[820].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[820].setRotationPoint(-29F, -53.5F, -6F);

        gunModel[821].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[821].setRotationPoint(-29F, -52F, -6F);

        gunModel[822].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F); // Import
        gunModel[822].setRotationPoint(20F, -51F, -6F);

        gunModel[823].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[823].setRotationPoint(17F, -52F, -6F);

        gunModel[824].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[824].setRotationPoint(74F, -57.5F, -6F);

        gunModel[825].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[825].setRotationPoint(116F, -57.5F, -6F);

        gunModel[826].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[826].setRotationPoint(89F, -57.5F, -6F);

        gunModel[827].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[827].setRotationPoint(98F, -57.5F, -6F);

        gunModel[828].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[828].setRotationPoint(107F, -57.5F, -6F);

        gunModel[829].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[829].setRotationPoint(79F, -57.5F, -6F);

        gunModel[830].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -3.0F, 1.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[830].setRotationPoint(-99F, -53F, 3F);

        gunModel[831].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, 1.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[831].setRotationPoint(-99F, -53F, -4F);

        gunModel[832].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[832].setRotationPoint(-98F, -47.5F, -3F);

        gunModel[833].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[833].setRotationPoint(-97F, -47.5F, -3F);

        gunModel[834].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[834].setRotationPoint(-97F, -45.5F, -3F);

        gunModel[835].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[835].setRotationPoint(-98F, -45.5F, -3F);

        gunModel[836].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[836].setRotationPoint(-98F, -41.5F, -3F);

        gunModel[837].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1.0F, 0.0F, 0.0F, 2.0F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 0.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[837].setRotationPoint(-97F, -41.5F, -3F);

        gunModel[838].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[838].setRotationPoint(-94F, -38.5F, -3F);

        gunModel[839].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[839].setRotationPoint(-94F, -36.5F, -3F);

        gunModel[840].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[840].setRotationPoint(-95F, -33.5F, -3F);

        gunModel[841].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[841].setRotationPoint(-96F, -30.5F, -3F);

        gunModel[842].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[842].setRotationPoint(-97F, -30.5F, -3F);

        gunModel[843].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[843].setRotationPoint(-97F, -32.5F, -3F);

        gunModel[844].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[844].setRotationPoint(-96F, -35.5F, -3F);

        gunModel[845].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import
        gunModel[845].setRotationPoint(-96F, -36.5F, -3F);

        gunModel[846].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[846].setRotationPoint(-98F, -41.5F, 2F);

        gunModel[847].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1.0F, 0.0F, 0.0F, 2.0F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 0.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[847].setRotationPoint(-97F, -41.5F, 2F);

        gunModel[848].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[848].setRotationPoint(-97F, -47.5F, 2F);

        gunModel[849].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[849].setRotationPoint(-98F, -47.5F, 2F);

        gunModel[850].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[850].setRotationPoint(-97F, -45.5F, 2F);

        gunModel[851].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[851].setRotationPoint(-98F, -45.5F, 2F);

        gunModel[852].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[852].setRotationPoint(116F, -48.5F, 5F);

        gunModel[853].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[853].setRotationPoint(116F, -48.5F, -6F);

        gunModel[854].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[854].setRotationPoint(21F, -50F, -6F);

        gunModel[855].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F); // Import
        gunModel[855].setRotationPoint(39F, -59F, -5F);

        gunModel[856].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[856].setRotationPoint(-24F, -56F, 3F);

        gunModel[857].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[857].setRotationPoint(-18F, -57F, 3F);

        gunModel[858].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[858].setRotationPoint(-16F, -57F, -5F);

        gunModel[859].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[859].setRotationPoint(29F, -55.5F, -7F);

        gunModel[860].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[860].setRotationPoint(23F, -53F, -7F);

        gunModel[861].addShapeBox(0F, 0F, 0F, 54, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[861].setRotationPoint(-23F, -54F, -7F);

        gunModel[862].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[862].setRotationPoint(-23F, -52F, -7F);

        gunModel[863].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[863].setRotationPoint(-24F, -54F, -7F);

        gunModel[864].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[864].setRotationPoint(-19F, -53F, -5.5F);

        gunModel[865].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[865].setRotationPoint(-17.5F, -51F, -8F);

        gunModel[866].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[866].setRotationPoint(-18.5F, -52.5F, -5.5F);

        gunModel[867].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[867].setRotationPoint(-18.5F, -49.5F, -5.5F);

        gunModel[868].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[868].setRotationPoint(-17.5F, -52.5F, -10F);

        gunModel[869].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[869].setRotationPoint(-17.5F, -51.5F, -10F);

        gunModel[870].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[870].setRotationPoint(29F, -54.5F, -7F);

        gunModel[871].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import
        gunModel[871].setRotationPoint(-28F, -51F, -3F);

        gunModel[872].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[872].setRotationPoint(-19F, -55F, -7F);

        gunModel[873].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[873].setRotationPoint(-23F, -54.5F, -7F);

        gunModel[874].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[874].setRotationPoint(-39.5F, -44F, 7F);

        gunModel[875].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[875].setRotationPoint(-37.5F, -44F, 7F);

        gunModel[876].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[876].setRotationPoint(-33.5F, -44F, 7F);

        gunModel[877].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[877].setRotationPoint(-39.5F, -44F, -8F);

        gunModel[878].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[878].setRotationPoint(-37.5F, -44F, -8F);

        gunModel[879].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[879].setRotationPoint(-33.5F, -44F, -8F);

        gunModel[880].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[880].setRotationPoint(-40F, -44F, -8F);

        gunModel[881].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F); // Import
        gunModel[881].setRotationPoint(-15F, -65F, -5.5F);

        gunModel[882].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[882].setRotationPoint(-15F, -64F, -5.5F);

        gunModel[883].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[883].setRotationPoint(77F, -58F, 4F);

        gunModel[884].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[884].setRotationPoint(36F, -58F, 4F);

        gunModel[885].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[885].setRotationPoint(31F, -58F, 4F);

        gunModel[886].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[886].setRotationPoint(77F, -58F, -6F);

        gunModel[887].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[887].setRotationPoint(117F, -58F, -6F);

        gunModel[888].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[888].setRotationPoint(118F, -45F, -6F);
        gunModel[888].rotateAngleZ = 1.5707964F;

        gunModel[889].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import
        gunModel[889].setRotationPoint(-97F, -33.5F, -3F);

        gunModel[890].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[890].setRotationPoint(-94F, -38.5F, 2F);

        gunModel[891].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[891].setRotationPoint(-94F, -36.5F, 2F);

        gunModel[892].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import
        gunModel[892].setRotationPoint(-96F, -36.5F, 2F);

        gunModel[893].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[893].setRotationPoint(-96F, -35.5F, 2F);

        gunModel[894].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[894].setRotationPoint(-95F, -33.5F, 2F);

        gunModel[895].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import
        gunModel[895].setRotationPoint(-97F, -33.5F, 2F);

        gunModel[896].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[896].setRotationPoint(-97F, -32.5F, 2F);

        gunModel[897].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[897].setRotationPoint(-97F, -30.5F, 2F);

        gunModel[898].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[898].setRotationPoint(-96F, -30.5F, 2F);

        gunModel[899].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[899].setRotationPoint(4F, -56F, 4F);

        gunModel[900].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[900].setRotationPoint(134F, -65F, -0.5F);

        gunModel[901].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[901].setRotationPoint(-41F, -47F, 4F);

        gunModel[902].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[902].setRotationPoint(-41F, -47F, -5F);

        gunModel[903].addShapeBox(0F, 0F, 0F, 85, 1, 6, 0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[903].setRotationPoint(32F, -44F, -3F);

        gunModel[904].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F); // Import
        gunModel[904].setRotationPoint(47F, -43F, -3F);

        gunModel[905].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F); // Import
        gunModel[905].setRotationPoint(51F, -43F, -3F);

        gunModel[906].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F); // Import
        gunModel[906].setRotationPoint(55F, -43F, -3F);

        gunModel[907].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F); // Import
        gunModel[907].setRotationPoint(59F, -43F, -3F);

        gunModel[908].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F); // Import
        gunModel[908].setRotationPoint(63F, -43F, -3F);

        gunModel[909].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F); // Import
        gunModel[909].setRotationPoint(67F, -43F, -3F);

        gunModel[910].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F); // Import
        gunModel[910].setRotationPoint(71F, -43F, -3F);

        gunModel[911].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F); // Import
        gunModel[911].setRotationPoint(75F, -43F, -3F);

        gunModel[912].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F); // Import
        gunModel[912].setRotationPoint(79F, -43F, -3F);

        gunModel[913].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F); // Import
        gunModel[913].setRotationPoint(83F, -43F, -3F);

        gunModel[914].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F); // Import
        gunModel[914].setRotationPoint(87F, -43F, -3F);

        gunModel[915].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F); // Import
        gunModel[915].setRotationPoint(91F, -43F, -3F);

        gunModel[916].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F); // Import
        gunModel[916].setRotationPoint(95F, -43F, -3F);

        gunModel[917].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F); // Import
        gunModel[917].setRotationPoint(99F, -43F, -3F);

        gunModel[918].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F); // Import
        gunModel[918].setRotationPoint(103F, -43F, -3F);

        gunModel[919].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F); // Import
        gunModel[919].setRotationPoint(107F, -43F, -3F);

        gunModel[920].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F); // Import
        gunModel[920].setRotationPoint(111F, -43F, -3F);

        gunModel[921].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F); // Import
        gunModel[921].setRotationPoint(115F, -43F, -3F);

        gunModel[922].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F); // Import
        gunModel[922].setRotationPoint(87F, -55F, 7F);

        gunModel[923].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F); // Import
        gunModel[923].setRotationPoint(91F, -55F, 7F);

        gunModel[924].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F); // Import
        gunModel[924].setRotationPoint(95F, -55F, 7F);

        gunModel[925].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F); // Import
        gunModel[925].setRotationPoint(99F, -55F, 7F);

        gunModel[926].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F); // Import
        gunModel[926].setRotationPoint(103F, -55F, 7F);

        gunModel[927].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F); // Import
        gunModel[927].setRotationPoint(107F, -55F, 7F);

        gunModel[928].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F); // Import
        gunModel[928].setRotationPoint(111F, -55F, 7F);

        gunModel[929].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F); // Import
        gunModel[929].setRotationPoint(115F, -55F, 7F);

        gunModel[930].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[930].setRotationPoint(87F, -55F, -8F);

        gunModel[931].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[931].setRotationPoint(91F, -55F, -8F);

        gunModel[932].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[932].setRotationPoint(95F, -55F, -8F);

        gunModel[933].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[933].setRotationPoint(99F, -55F, -8F);

        gunModel[934].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[934].setRotationPoint(103F, -55F, -8F);

        gunModel[935].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[935].setRotationPoint(107F, -55F, -8F);

        gunModel[936].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[936].setRotationPoint(111F, -55F, -8F);

        gunModel[937].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[937].setRotationPoint(115F, -55F, -8F);

        gunModel[938].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[938].setRotationPoint(-41F, -52F, -3F);

        gunModel[939].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[939].setRotationPoint(-37F, -52F, -3F);

        gunModel[940].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[940].setRotationPoint(-33F, -52F, -3F);

        gunModel[941].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[941].setRotationPoint(32F, -64F, 2F);

        gunModel[942].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[942].setRotationPoint(32F, -64F, -3F);

        gunModel[943].addShapeBox(0F, 0F, 0F, 87, 1, 6, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F); // Import
        gunModel[943].setRotationPoint(32F, -62F, -3F);

        gunModel[944].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[944].setRotationPoint(36F, -64F, 2F);

        gunModel[945].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[945].setRotationPoint(36F, -64F, -3F);

        gunModel[946].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[946].setRotationPoint(40F, -64F, 2F);

        gunModel[947].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[947].setRotationPoint(40F, -64F, -3F);

        gunModel[948].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[948].setRotationPoint(44F, -64F, 2F);

        gunModel[949].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[949].setRotationPoint(44F, -64F, -3F);

        gunModel[950].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[950].setRotationPoint(48F, -64F, 2F);

        gunModel[951].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[951].setRotationPoint(48F, -64F, -3F);

        gunModel[952].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[952].setRotationPoint(52F, -64F, 2F);

        gunModel[953].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[953].setRotationPoint(52F, -64F, -3F);

        gunModel[954].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[954].setRotationPoint(56F, -64F, 2F);

        gunModel[955].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[955].setRotationPoint(56F, -64F, -3F);

        gunModel[956].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[956].setRotationPoint(60F, -64F, 2F);

        gunModel[957].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[957].setRotationPoint(60F, -64F, -3F);

        gunModel[958].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[958].setRotationPoint(64F, -64F, 2F);

        gunModel[959].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[959].setRotationPoint(64F, -64F, -3F);

        gunModel[960].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[960].setRotationPoint(68F, -64F, 2F);

        gunModel[961].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[961].setRotationPoint(68F, -64F, -3F);

        gunModel[962].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[962].setRotationPoint(72F, -64F, 2F);

        gunModel[963].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[963].setRotationPoint(72F, -64F, -3F);

        gunModel[964].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[964].setRotationPoint(76F, -64F, 2F);

        gunModel[965].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[965].setRotationPoint(76F, -64F, -3F);

        gunModel[966].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[966].setRotationPoint(80F, -64F, 2F);

        gunModel[967].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[967].setRotationPoint(80F, -64F, -3F);

        gunModel[968].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[968].setRotationPoint(84F, -64F, 2F);

        gunModel[969].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[969].setRotationPoint(84F, -64F, -3F);

        gunModel[970].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[970].setRotationPoint(88F, -64F, 2F);

        gunModel[971].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[971].setRotationPoint(88F, -64F, -3F);

        gunModel[972].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[972].setRotationPoint(92F, -64F, 2F);

        gunModel[973].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[973].setRotationPoint(92F, -64F, -3F);

        gunModel[974].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[974].setRotationPoint(96F, -64F, 2F);

        gunModel[975].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[975].setRotationPoint(96F, -64F, -3F);

        gunModel[976].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[976].setRotationPoint(100F, -64F, 2F);

        gunModel[977].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[977].setRotationPoint(100F, -64F, -3F);

        gunModel[978].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[978].setRotationPoint(104F, -64F, 2F);

        gunModel[979].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[979].setRotationPoint(104F, -64F, -3F);

        gunModel[980].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[980].setRotationPoint(108F, -64F, 2F);

        gunModel[981].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[981].setRotationPoint(108F, -64F, -3F);

        gunModel[982].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[982].setRotationPoint(112F, -64F, 2F);

        gunModel[983].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[983].setRotationPoint(112F, -64F, -3F);

        gunModel[984].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[984].setRotationPoint(116F, -64F, 2F);

        gunModel[985].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[985].setRotationPoint(116F, -64F, -3F);

        gunModel[986].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import
        gunModel[986].setRotationPoint(-13.01F, -63.75F, -1.25F);

        gunModel[987].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import
        gunModel[987].setRotationPoint(-13.01F, -65.25F, 0.25F);

        gunModel[988].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Import
        gunModel[988].setRotationPoint(-13.01F, -65.25F, -1.25F);
    }

    private void initammoModel_1() {
        ammoModel[0] = new ModelRendererTurbo(this, 81, 353, textureX, textureY); // Import

        ammoModel[0].addShapeBox(0F, 0F, 0F, 21, 39, 6, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, 3.0F, -3.0F, 0.5F, 3.0F, -3.0F, 0.5F, -3.0F, 0.0F, 0.5F); // Import
        ammoModel[0].setRotationPoint(3F, -51F, -3F);
    }

    private void initslideModel_1() {
        slideModel[0] = new ModelRendererTurbo(this, 185, 353, textureX, textureY); // Import
        slideModel[1] = new ModelRendererTurbo(this, 281, 353, textureX, textureY); // Import
        slideModel[2] = new ModelRendererTurbo(this, 377, 353, textureX, textureY); // Import
        slideModel[3] = new ModelRendererTurbo(this, 137, 353, textureX, textureY); // Import
        slideModel[4] = new ModelRendererTurbo(this, 153, 353, textureX, textureY); // Import
        slideModel[5] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Import
        slideModel[6] = new ModelRendererTurbo(this, 17, 361, textureX, textureY); // Import
        slideModel[7] = new ModelRendererTurbo(this, 33, 361, textureX, textureY); // Import
        slideModel[8] = new ModelRendererTurbo(this, 49, 361, textureX, textureY); // Import
        slideModel[9] = new ModelRendererTurbo(this, 137, 361, textureX, textureY); // Import
        slideModel[10] = new ModelRendererTurbo(this, 153, 361, textureX, textureY); // Import
        slideModel[11] = new ModelRendererTurbo(this, 505, 353, textureX, textureY); // Import
        slideModel[12] = new ModelRendererTurbo(this, 273, 353, textureX, textureY); // Import
        slideModel[13] = new ModelRendererTurbo(this, 73, 361, textureX, textureY); // Import
        slideModel[14] = new ModelRendererTurbo(this, 169, 361, textureX, textureY); // Import
        slideModel[15] = new ModelRendererTurbo(this, 177, 361, textureX, textureY); // Import
        slideModel[16] = new ModelRendererTurbo(this, 177, 361, textureX, textureY); // Import
        slideModel[17] = new ModelRendererTurbo(this, 201, 361, textureX, textureY); // Import
        slideModel[18] = new ModelRendererTurbo(this, 281, 361, textureX, textureY); // Import
        slideModel[19] = new ModelRendererTurbo(this, 193, 361, textureX, textureY); // Import
        slideModel[20] = new ModelRendererTurbo(this, 305, 361, textureX, textureY); // Import
        slideModel[21] = new ModelRendererTurbo(this, 353, 361, textureX, textureY); // Import
        slideModel[22] = new ModelRendererTurbo(this, 377, 361, textureX, textureY); // Import

        slideModel[0].addShapeBox(0F, 0F, 0F, 44, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        slideModel[0].setRotationPoint(29F, -57F, -6F);

        slideModel[1].addShapeBox(0F, 0F, 0F, 44, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        slideModel[1].setRotationPoint(29F, -56F, -6F);

        slideModel[2].addShapeBox(0F, 0F, 0F, 60, 3, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        slideModel[2].setRotationPoint(69F, -51F, -1.5F);

        slideModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        slideModel[3].setRotationPoint(70F, -56F, -5F);

        slideModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        slideModel[4].setRotationPoint(70F, -55F, -5F);

        slideModel[5].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        slideModel[5].setRotationPoint(70F, -54F, -4F);

        slideModel[6].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        slideModel[6].setRotationPoint(70F, -52F, -4F);

        slideModel[7].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        slideModel[7].setRotationPoint(17F, -57F, -7F);

        slideModel[8].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F); // Import
        slideModel[8].setRotationPoint(25F, -61F, -7F);

        slideModel[9].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        slideModel[9].setRotationPoint(22F, -59F, -7F);

        slideModel[10].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F, 0.0F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -5.0F, 0.0F, 0.0F, 3.0F, -3.0F, 0.0F, 3.0F, -3.0F, 0.0F, -5.0F, 0.0F, 0.0F); // Import
        slideModel[10].setRotationPoint(24F, -61F, -7F);

        slideModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        slideModel[11].setRotationPoint(17F, -57F, -9F);

        slideModel[12].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        slideModel[12].setRotationPoint(17F, -57F, -13F);

        slideModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        slideModel[13].setRotationPoint(31F, -59F, -6F);

        slideModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        slideModel[14].setRotationPoint(29F, -57F, -7F);

        slideModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        slideModel[15].setRotationPoint(17F, -56F, -5F);

        slideModel[16].addShapeBox(-3F, -1.5F, 0F, 4, 2, 7, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        slideModel[16].setRotationPoint(24F, -56.5F, -3F);

        slideModel[17].addShapeBox(-22F, 0.5F, 0F, 23, 5, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        slideModel[17].setRotationPoint(24F, -56.5F, -3F);

        slideModel[18].addShapeBox(-5F, -1.5F, 0F, 2, 2, 7, 0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        slideModel[18].setRotationPoint(24F, -56.5F, -3F);

        slideModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        slideModel[19].setRotationPoint(22F, -58F, -5F);

        slideModel[20].addShapeBox(-21F, -0.5F, 0F, 15, 1, 7, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        slideModel[20].setRotationPoint(25F, -56.5F, -3F);

        slideModel[21].addShapeBox(-23F, -0.5F, 0F, 1, 1, 7, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        slideModel[21].setRotationPoint(25F, -56.5F, -3F);

        slideModel[22].addShapeBox(-22F, -0.5F, 0F, 1, 1, 7, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        slideModel[22].setRotationPoint(25F, -56.5F, -3F);
    }
}