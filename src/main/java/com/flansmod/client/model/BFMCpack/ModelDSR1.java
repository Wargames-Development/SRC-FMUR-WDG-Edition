//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: dsr
// Model Creator: 
// Created on: 06.11.2023 - 13:06:32
// Last changed on: 06.11.2023 - 13:06:32

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelDSR1 extends ModelGun //Same as Filename
{
    int textureX = 1024;
    int textureY = 1024;

    public ModelDSR1() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[565];
        defaultScopeModel = new ModelRendererTurbo[41];
        ammoModel = new ModelRendererTurbo[16];
        pumpModel = new ModelRendererTurbo[23];

        initgunModel_1();
        initgunModel_2();
        initdefaultScopeModel_1();
        initammoModel_1();
        initpumpModel_1();

        barrelAttachPoint = new Vector3f(193F / 16F, 54F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(168F / 16F, 54F / 16F, -6F / 16F);
        scopeAttachPoint = new Vector3f(25F / 16F, 63.5F / 16F, 0F / 16F);
        gripAttachPoint = new Vector3f(110 / 16F, 37.5F / 16F, 0F / 16F);

        thirdPersonOffset = new Vector3f(0.0F, -0.05F, 0.0F);
        gunSlideDistance = 40F;
        pumpDelayAfterReload = 50;
        pumpDelay = 10;
        pumpTime = 25;
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
        leftArmPos = new Vector3f(0.17F, -0.5F, 0.0F);
        leftArmRot = new Vector3f(80F, 55F, 10F);
        leftArmReloadPos = new Vector3f(-0.13F, -0.6F, 0.05F);
        leftArmReloadRot = new Vector3f(80F, 60F, 0.0F);
        rightArmPos = new Vector3f(0.2F, -0.56F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85F);
        rightArmReloadPos = new Vector3f(0.2F, -0.56F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.5D, 0.75D);
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

        crouchZoom = -0.1F;
        zoomOffset = 0.1F;
        zoomOffsetY = -0.065F;
        gunOffset = -0.6F;

        pumpHandlePoint = new Vector3f(0.0F, 55.5F / 16F, 0.0F);

        flipAll();
    }

    private void initgunModel_1() {
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import
        gunModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import
        gunModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import
        gunModel[3] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import
        gunModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import
        gunModel[5] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import
        gunModel[6] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import
        gunModel[7] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import
        gunModel[8] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import
        gunModel[9] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import
        gunModel[10] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import
        gunModel[11] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import
        gunModel[12] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import
        gunModel[13] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import
        gunModel[14] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Import
        gunModel[15] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Import
        gunModel[16] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Import
        gunModel[17] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import
        gunModel[18] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import
        gunModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import
        gunModel[20] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Import
        gunModel[21] = new ModelRendererTurbo(this, 809, 9, textureX, textureY); // Import
        gunModel[22] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import
        gunModel[23] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Import
        gunModel[24] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Import
        gunModel[25] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Import
        gunModel[26] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Import
        gunModel[27] = new ModelRendererTurbo(this, 513, 17, textureX, textureY); // Import
        gunModel[28] = new ModelRendererTurbo(this, 553, 25, textureX, textureY); // Import
        gunModel[29] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import
        gunModel[30] = new ModelRendererTurbo(this, 721, 17, textureX, textureY); // Import
        gunModel[31] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import
        gunModel[32] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import
        gunModel[33] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import
        gunModel[34] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import
        gunModel[35] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import
        gunModel[36] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import
        gunModel[37] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import
        gunModel[38] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Import
        gunModel[39] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import
        gunModel[40] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Import
        gunModel[41] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Import
        gunModel[42] = new ModelRendererTurbo(this, 777, 17, textureX, textureY); // Import
        gunModel[43] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Import
        gunModel[44] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Import
        gunModel[45] = new ModelRendererTurbo(this, 793, 25, textureX, textureY); // Import
        gunModel[46] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Import
        gunModel[47] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Import
        gunModel[48] = new ModelRendererTurbo(this, 729, 33, textureX, textureY); // Import
        gunModel[49] = new ModelRendererTurbo(this, 817, 33, textureX, textureY); // Import
        gunModel[50] = new ModelRendererTurbo(this, 865, 33, textureX, textureY); // Import
        gunModel[51] = new ModelRendererTurbo(this, 897, 33, textureX, textureY); // Import
        gunModel[52] = new ModelRendererTurbo(this, 929, 33, textureX, textureY); // Import
        gunModel[53] = new ModelRendererTurbo(this, 953, 33, textureX, textureY); // Import
        gunModel[54] = new ModelRendererTurbo(this, 977, 33, textureX, textureY); // Import
        gunModel[55] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Import
        gunModel[56] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Import
        gunModel[57] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import
        gunModel[58] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Import
        gunModel[59] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Import
        gunModel[60] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import
        gunModel[61] = new ModelRendererTurbo(this, 521, 41, textureX, textureY); // Import
        gunModel[62] = new ModelRendererTurbo(this, 913, 41, textureX, textureY); // Import
        gunModel[63] = new ModelRendererTurbo(this, 961, 41, textureX, textureY); // Import
        gunModel[64] = new ModelRendererTurbo(this, 993, 41, textureX, textureY); // Import
        gunModel[65] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Import
        gunModel[66] = new ModelRendererTurbo(this, 537, 49, textureX, textureY); // Import
        gunModel[67] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Import
        gunModel[68] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Import
        gunModel[69] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Import
        gunModel[70] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Import
        gunModel[71] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Import
        gunModel[72] = new ModelRendererTurbo(this, 585, 49, textureX, textureY); // Import
        gunModel[73] = new ModelRendererTurbo(this, 617, 49, textureX, textureY); // Import
        gunModel[74] = new ModelRendererTurbo(this, 649, 49, textureX, textureY); // Import
        gunModel[75] = new ModelRendererTurbo(this, 681, 49, textureX, textureY); // Import
        gunModel[76] = new ModelRendererTurbo(this, 713, 49, textureX, textureY); // Import
        gunModel[77] = new ModelRendererTurbo(this, 785, 49, textureX, textureY); // Import
        gunModel[78] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import
        gunModel[79] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Import
        gunModel[80] = new ModelRendererTurbo(this, 833, 49, textureX, textureY); // Import
        gunModel[81] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Import
        gunModel[82] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Import
        gunModel[83] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Import
        gunModel[84] = new ModelRendererTurbo(this, 729, 57, textureX, textureY); // Import
        gunModel[85] = new ModelRendererTurbo(this, 865, 57, textureX, textureY); // Import
        gunModel[86] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Import
        gunModel[87] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Import
        gunModel[88] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Import
        gunModel[89] = new ModelRendererTurbo(this, 945, 57, textureX, textureY); // Import
        gunModel[90] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Import
        gunModel[91] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Import
        gunModel[92] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Import
        gunModel[93] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Import
        gunModel[94] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Import
        gunModel[95] = new ModelRendererTurbo(this, 513, 65, textureX, textureY); // Import
        gunModel[96] = new ModelRendererTurbo(this, 545, 65, textureX, textureY); // Import
        gunModel[97] = new ModelRendererTurbo(this, 585, 65, textureX, textureY); // Import
        gunModel[98] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Import
        gunModel[99] = new ModelRendererTurbo(this, 633, 57, textureX, textureY); // Import
        gunModel[100] = new ModelRendererTurbo(this, 665, 57, textureX, textureY); // Import
        gunModel[101] = new ModelRendererTurbo(this, 697, 57, textureX, textureY); // Import
        gunModel[102] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Import
        gunModel[103] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Import
        gunModel[104] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Import
        gunModel[105] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Import
        gunModel[106] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Import
        gunModel[107] = new ModelRendererTurbo(this, 617, 73, textureX, textureY); // Import
        gunModel[108] = new ModelRendererTurbo(this, 681, 65, textureX, textureY); // Import
        gunModel[109] = new ModelRendererTurbo(this, 713, 65, textureX, textureY); // Import
        gunModel[110] = new ModelRendererTurbo(this, 833, 65, textureX, textureY); // Import
        gunModel[111] = new ModelRendererTurbo(this, 929, 65, textureX, textureY); // Import
        gunModel[112] = new ModelRendererTurbo(this, 785, 73, textureX, textureY); // Import
        gunModel[113] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import
        gunModel[114] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Import
        gunModel[115] = new ModelRendererTurbo(this, 697, 73, textureX, textureY); // Import
        gunModel[116] = new ModelRendererTurbo(this, 849, 73, textureX, textureY); // Import
        gunModel[117] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Import
        gunModel[118] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Import
        gunModel[119] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Import
        gunModel[120] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Import
        gunModel[121] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Import
        gunModel[122] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Import
        gunModel[123] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Import
        gunModel[124] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Import
        gunModel[125] = new ModelRendererTurbo(this, 537, 81, textureX, textureY); // Import
        gunModel[126] = new ModelRendererTurbo(this, 593, 81, textureX, textureY); // Import
        gunModel[127] = new ModelRendererTurbo(this, 657, 81, textureX, textureY); // Import
        gunModel[128] = new ModelRendererTurbo(this, 713, 81, textureX, textureY); // Import
        gunModel[129] = new ModelRendererTurbo(this, 745, 81, textureX, textureY); // Import
        gunModel[130] = new ModelRendererTurbo(this, 865, 81, textureX, textureY); // Import
        gunModel[131] = new ModelRendererTurbo(this, 921, 81, textureX, textureY); // Import
        gunModel[132] = new ModelRendererTurbo(this, 825, 81, textureX, textureY); // Import
        gunModel[133] = new ModelRendererTurbo(this, 977, 81, textureX, textureY); // Import
        gunModel[134] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Import
        gunModel[135] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Import
        gunModel[136] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Import
        gunModel[137] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Import
        gunModel[138] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Import
        gunModel[139] = new ModelRendererTurbo(this, 609, 89, textureX, textureY); // Import
        gunModel[140] = new ModelRendererTurbo(this, 673, 89, textureX, textureY); // Import
        gunModel[141] = new ModelRendererTurbo(this, 761, 89, textureX, textureY); // Import
        gunModel[142] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import
        gunModel[143] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Import
        gunModel[144] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Import
        gunModel[145] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Import
        gunModel[146] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Import
        gunModel[147] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Import
        gunModel[148] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Import
        gunModel[149] = new ModelRendererTurbo(this, 577, 89, textureX, textureY); // Import
        gunModel[150] = new ModelRendererTurbo(this, 841, 89, textureX, textureY); // Import
        gunModel[151] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import
        gunModel[152] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Import
        gunModel[153] = new ModelRendererTurbo(this, 993, 89, textureX, textureY); // Import
        gunModel[154] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Import
        gunModel[155] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Import
        gunModel[156] = new ModelRendererTurbo(this, 649, 97, textureX, textureY); // Import
        gunModel[157] = new ModelRendererTurbo(this, 713, 97, textureX, textureY); // Import
        gunModel[158] = new ModelRendererTurbo(this, 801, 97, textureX, textureY); // Import
        gunModel[159] = new ModelRendererTurbo(this, 865, 97, textureX, textureY); // Import
        gunModel[160] = new ModelRendererTurbo(this, 897, 97, textureX, textureY); // Import
        gunModel[161] = new ModelRendererTurbo(this, 929, 97, textureX, textureY); // Import
        gunModel[162] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Import
        gunModel[163] = new ModelRendererTurbo(this, 961, 89, textureX, textureY); // Import
        gunModel[164] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Import
        gunModel[165] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import
        gunModel[166] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import
        gunModel[167] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Import
        gunModel[168] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Import
        gunModel[169] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Import
        gunModel[170] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Import
        gunModel[171] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import
        gunModel[172] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Import
        gunModel[173] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import
        gunModel[174] = new ModelRendererTurbo(this, 697, 17, textureX, textureY); // Import
        gunModel[175] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Import
        gunModel[176] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Import
        gunModel[177] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Import
        gunModel[178] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Import
        gunModel[179] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Import
        gunModel[180] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Import
        gunModel[181] = new ModelRendererTurbo(this, 593, 97, textureX, textureY); // Import
        gunModel[182] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Import
        gunModel[183] = new ModelRendererTurbo(this, 609, 105, textureX, textureY); // Import
        gunModel[184] = new ModelRendererTurbo(this, 977, 97, textureX, textureY); // Import
        gunModel[185] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Import
        gunModel[186] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Import
        gunModel[187] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Import
        gunModel[188] = new ModelRendererTurbo(this, 673, 105, textureX, textureY); // Import
        gunModel[189] = new ModelRendererTurbo(this, 753, 105, textureX, textureY); // Import
        gunModel[190] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Import
        gunModel[191] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Import
        gunModel[192] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Import
        gunModel[193] = new ModelRendererTurbo(this, 561, 105, textureX, textureY); // Import
        gunModel[194] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import
        gunModel[195] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Import
        gunModel[196] = new ModelRendererTurbo(this, 953, 105, textureX, textureY); // Import
        gunModel[197] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Import
        gunModel[198] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Import
        gunModel[199] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Import
        gunModel[200] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Import
        gunModel[201] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Import
        gunModel[202] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Import
        gunModel[203] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Import
        gunModel[204] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Import
        gunModel[205] = new ModelRendererTurbo(this, 537, 113, textureX, textureY); // Import
        gunModel[206] = new ModelRendererTurbo(this, 577, 113, textureX, textureY); // Import
        gunModel[207] = new ModelRendererTurbo(this, 713, 113, textureX, textureY); // Import
        gunModel[208] = new ModelRendererTurbo(this, 793, 113, textureX, textureY); // Import
        gunModel[209] = new ModelRendererTurbo(this, 825, 113, textureX, textureY); // Import
        gunModel[210] = new ModelRendererTurbo(this, 969, 113, textureX, textureY); // Import
        gunModel[211] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Import
        gunModel[212] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Import
        gunModel[213] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Import
        gunModel[214] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Import
        gunModel[215] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Import
        gunModel[216] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Import
        gunModel[217] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Import
        gunModel[218] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Import
        gunModel[219] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Import
        gunModel[220] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Import
        gunModel[221] = new ModelRendererTurbo(this, 521, 121, textureX, textureY); // Import
        gunModel[222] = new ModelRendererTurbo(this, 593, 121, textureX, textureY); // Import
        gunModel[223] = new ModelRendererTurbo(this, 641, 121, textureX, textureY); // Import
        gunModel[224] = new ModelRendererTurbo(this, 553, 121, textureX, textureY); // Import
        gunModel[225] = new ModelRendererTurbo(this, 689, 121, textureX, textureY); // Import
        gunModel[226] = new ModelRendererTurbo(this, 729, 121, textureX, textureY); // Import
        gunModel[227] = new ModelRendererTurbo(this, 761, 121, textureX, textureY); // Import
        gunModel[228] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import
        gunModel[229] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Import
        gunModel[230] = new ModelRendererTurbo(this, 849, 121, textureX, textureY); // Import
        gunModel[231] = new ModelRendererTurbo(this, 881, 121, textureX, textureY); // Import
        gunModel[232] = new ModelRendererTurbo(this, 569, 49, textureX, textureY); // Import
        gunModel[233] = new ModelRendererTurbo(this, 913, 121, textureX, textureY); // Import
        gunModel[234] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import
        gunModel[235] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import
        gunModel[236] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import
        gunModel[237] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Import
        gunModel[238] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Import
        gunModel[239] = new ModelRendererTurbo(this, 649, 137, textureX, textureY); // Import
        gunModel[240] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import
        gunModel[241] = new ModelRendererTurbo(this, 937, 129, textureX, textureY); // Import
        gunModel[242] = new ModelRendererTurbo(this, 849, 137, textureX, textureY); // Import
        gunModel[243] = new ModelRendererTurbo(this, 905, 137, textureX, textureY); // Import
        gunModel[244] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Import
        gunModel[245] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Import
        gunModel[246] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Import
        gunModel[247] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Import
        gunModel[248] = new ModelRendererTurbo(this, 457, 145, textureX, textureY); // Import
        gunModel[249] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Import
        gunModel[250] = new ModelRendererTurbo(this, 537, 145, textureX, textureY); // Import
        gunModel[251] = new ModelRendererTurbo(this, 577, 145, textureX, textureY); // Import
        gunModel[252] = new ModelRendererTurbo(this, 617, 145, textureX, textureY); // Import
        gunModel[253] = new ModelRendererTurbo(this, 657, 145, textureX, textureY); // Import
        gunModel[254] = new ModelRendererTurbo(this, 697, 145, textureX, textureY); // Import
        gunModel[255] = new ModelRendererTurbo(this, 761, 145, textureX, textureY); // Import
        gunModel[256] = new ModelRendererTurbo(this, 801, 145, textureX, textureY); // Import
        gunModel[257] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Import
        gunModel[258] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Import
        gunModel[259] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Import
        gunModel[260] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Import
        gunModel[261] = new ModelRendererTurbo(this, 937, 153, textureX, textureY); // Import
        gunModel[262] = new ModelRendererTurbo(this, 801, 113, textureX, textureY); // Import
        gunModel[263] = new ModelRendererTurbo(this, 881, 137, textureX, textureY); // Import
        gunModel[264] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Import
        gunModel[265] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Import
        gunModel[266] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Import
        gunModel[267] = new ModelRendererTurbo(this, 553, 145, textureX, textureY); // Import
        gunModel[268] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Import
        gunModel[269] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Import
        gunModel[270] = new ModelRendererTurbo(this, 825, 161, textureX, textureY); // Import
        gunModel[271] = new ModelRendererTurbo(this, 865, 161, textureX, textureY); // Import
        gunModel[272] = new ModelRendererTurbo(this, 513, 153, textureX, textureY); // Import
        gunModel[273] = new ModelRendererTurbo(this, 593, 153, textureX, textureY); // Import
        gunModel[274] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Import
        gunModel[275] = new ModelRendererTurbo(this, 633, 161, textureX, textureY); // Import
        gunModel[276] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import
        gunModel[277] = new ModelRendererTurbo(this, 993, 121, textureX, textureY); // Import
        gunModel[278] = new ModelRendererTurbo(this, 985, 153, textureX, textureY); // Import
        gunModel[279] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Import
        gunModel[280] = new ModelRendererTurbo(this, 1001, 73, textureX, textureY); // Import
        gunModel[281] = new ModelRendererTurbo(this, 681, 169, textureX, textureY); // Import
        gunModel[282] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); // Import
        gunModel[283] = new ModelRendererTurbo(this, 641, 145, textureX, textureY); // Import
        gunModel[284] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Import
        gunModel[285] = new ModelRendererTurbo(this, 681, 145, textureX, textureY); // Import
        gunModel[286] = new ModelRendererTurbo(this, 545, 169, textureX, textureY); // Import
        gunModel[287] = new ModelRendererTurbo(this, 745, 145, textureX, textureY); // Import
        gunModel[288] = new ModelRendererTurbo(this, 601, 49, textureX, textureY); // Import
        gunModel[289] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Import
        gunModel[290] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Import
        gunModel[291] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Import
        gunModel[292] = new ModelRendererTurbo(this, 785, 145, textureX, textureY); // Import
        gunModel[293] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // Import
        gunModel[294] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Import
        gunModel[295] = new ModelRendererTurbo(this, 993, 169, textureX, textureY); // Import
        gunModel[296] = new ModelRendererTurbo(this, 921, 177, textureX, textureY); // Import
        gunModel[297] = new ModelRendererTurbo(this, 129, 185, textureX, textureY); // Import
        gunModel[298] = new ModelRendererTurbo(this, 417, 177, textureX, textureY); // Import
        gunModel[299] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Import
        gunModel[300] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Import
        gunModel[301] = new ModelRendererTurbo(this, 585, 177, textureX, textureY); // Import
        gunModel[302] = new ModelRendererTurbo(this, 609, 177, textureX, textureY); // Import
        gunModel[303] = new ModelRendererTurbo(this, 801, 177, textureX, textureY); // Import
        gunModel[304] = new ModelRendererTurbo(this, 665, 177, textureX, textureY); // Import
        gunModel[305] = new ModelRendererTurbo(this, 825, 145, textureX, textureY); // Import
        gunModel[306] = new ModelRendererTurbo(this, 33, 185, textureX, textureY); // Import
        gunModel[307] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Import
        gunModel[308] = new ModelRendererTurbo(this, 249, 185, textureX, textureY); // Import
        gunModel[309] = new ModelRendererTurbo(this, 681, 185, textureX, textureY); // Import
        gunModel[310] = new ModelRendererTurbo(this, 729, 185, textureX, textureY); // Import
        gunModel[311] = new ModelRendererTurbo(this, 297, 185, textureX, textureY); // Import
        gunModel[312] = new ModelRendererTurbo(this, 913, 161, textureX, textureY); // Import
        gunModel[313] = new ModelRendererTurbo(this, 825, 185, textureX, textureY); // Import
        gunModel[314] = new ModelRendererTurbo(this, 633, 185, textureX, textureY); // Import
        gunModel[315] = new ModelRendererTurbo(this, 777, 185, textureX, textureY); // Import
        gunModel[316] = new ModelRendererTurbo(this, 881, 185, textureX, textureY); // Import
        gunModel[317] = new ModelRendererTurbo(this, 57, 193, textureX, textureY); // Import
        gunModel[318] = new ModelRendererTurbo(this, 729, 81, textureX, textureY); // Import
        gunModel[319] = new ModelRendererTurbo(this, 905, 81, textureX, textureY); // Import
        gunModel[320] = new ModelRendererTurbo(this, 905, 193, textureX, textureY); // Import
        gunModel[321] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Import
        gunModel[322] = new ModelRendererTurbo(this, 745, 121, textureX, textureY); // Import
        gunModel[323] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import
        gunModel[324] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import
        gunModel[325] = new ModelRendererTurbo(this, 89, 201, textureX, textureY); // Import
        gunModel[326] = new ModelRendererTurbo(this, 609, 201, textureX, textureY); // Import
        gunModel[327] = new ModelRendererTurbo(this, 721, 201, textureX, textureY); // Import
        gunModel[328] = new ModelRendererTurbo(this, 945, 193, textureX, textureY); // Import
        gunModel[329] = new ModelRendererTurbo(this, 841, 201, textureX, textureY); // Import
        gunModel[330] = new ModelRendererTurbo(this, 201, 201, textureX, textureY); // Import
        gunModel[331] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Import
        gunModel[332] = new ModelRendererTurbo(this, 33, 209, textureX, textureY); // Import
        gunModel[333] = new ModelRendererTurbo(this, 361, 209, textureX, textureY); // Import
        gunModel[334] = new ModelRendererTurbo(this, 905, 209, textureX, textureY); // Import
        gunModel[335] = new ModelRendererTurbo(this, 81, 217, textureX, textureY); // Import
        gunModel[336] = new ModelRendererTurbo(this, 713, 217, textureX, textureY); // Import
        gunModel[337] = new ModelRendererTurbo(this, 185, 217, textureX, textureY); // Import
        gunModel[338] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Import
        gunModel[339] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import
        gunModel[340] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import
        gunModel[341] = new ModelRendererTurbo(this, 817, 217, textureX, textureY); // Import
        gunModel[342] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import
        gunModel[343] = new ModelRendererTurbo(this, 489, 217, textureX, textureY); // Import
        gunModel[344] = new ModelRendererTurbo(this, 993, 33, textureX, textureY); // Import
        gunModel[345] = new ModelRendererTurbo(this, 521, 217, textureX, textureY); // Import
        gunModel[346] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Import
        gunModel[347] = new ModelRendererTurbo(this, 577, 217, textureX, textureY); // Import
        gunModel[348] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Import
        gunModel[349] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import
        gunModel[350] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import
        gunModel[351] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Import
        gunModel[352] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Import
        gunModel[353] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Import
        gunModel[354] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Import
        gunModel[355] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Import
        gunModel[356] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Import
        gunModel[357] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Import
        gunModel[358] = new ModelRendererTurbo(this, 769, 17, textureX, textureY); // Import
        gunModel[359] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Import
        gunModel[360] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Import
        gunModel[361] = new ModelRendererTurbo(this, 633, 49, textureX, textureY); // Import
        gunModel[362] = new ModelRendererTurbo(this, 665, 49, textureX, textureY); // Import
        gunModel[363] = new ModelRendererTurbo(this, 697, 49, textureX, textureY); // Import
        gunModel[364] = new ModelRendererTurbo(this, 817, 49, textureX, textureY); // Import
        gunModel[365] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Import
        gunModel[366] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Import
        gunModel[367] = new ModelRendererTurbo(this, 41, 225, textureX, textureY); // Import
        gunModel[368] = new ModelRendererTurbo(this, 233, 225, textureX, textureY); // Import
        gunModel[369] = new ModelRendererTurbo(this, 265, 225, textureX, textureY); // Import
        gunModel[370] = new ModelRendererTurbo(this, 793, 17, textureX, textureY); // Import
        gunModel[371] = new ModelRendererTurbo(this, 857, 33, textureX, textureY); // Import
        gunModel[372] = new ModelRendererTurbo(this, 889, 33, textureX, textureY); // Import
        gunModel[373] = new ModelRendererTurbo(this, 921, 33, textureX, textureY); // Import
        gunModel[374] = new ModelRendererTurbo(this, 945, 33, textureX, textureY); // Import
        gunModel[375] = new ModelRendererTurbo(this, 1009, 113, textureX, textureY); // Import
        gunModel[376] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import
        gunModel[377] = new ModelRendererTurbo(this, 289, 225, textureX, textureY); // Import
        gunModel[378] = new ModelRendererTurbo(this, 993, 217, textureX, textureY); // Import
        gunModel[379] = new ModelRendererTurbo(this, 361, 225, textureX, textureY); // Import
        gunModel[380] = new ModelRendererTurbo(this, 601, 225, textureX, textureY); // Import
        gunModel[381] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Import
        gunModel[382] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // Import
        gunModel[383] = new ModelRendererTurbo(this, 457, 233, textureX, textureY); // Import
        gunModel[384] = new ModelRendererTurbo(this, 529, 233, textureX, textureY); // Import
        gunModel[385] = new ModelRendererTurbo(this, 689, 233, textureX, textureY); // Import
        gunModel[386] = new ModelRendererTurbo(this, 969, 33, textureX, textureY); // Import
        gunModel[387] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Import
        gunModel[388] = new ModelRendererTurbo(this, 601, 241, textureX, textureY); // Import
        gunModel[389] = new ModelRendererTurbo(this, 177, 233, textureX, textureY); // Import
        gunModel[390] = new ModelRendererTurbo(this, 209, 233, textureX, textureY); // Import
        gunModel[391] = new ModelRendererTurbo(this, 865, 121, textureX, textureY); // Import
        gunModel[392] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Import
        gunModel[393] = new ModelRendererTurbo(this, 513, 17, textureX, textureY); // Import
        gunModel[394] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Import
        gunModel[395] = new ModelRendererTurbo(this, 401, 209, textureX, textureY); // Import
        gunModel[396] = new ModelRendererTurbo(this, 857, 233, textureX, textureY); // Import
        gunModel[397] = new ModelRendererTurbo(this, 945, 233, textureX, textureY); // Import
        gunModel[398] = new ModelRendererTurbo(this, 329, 233, textureX, textureY); // Import
        gunModel[399] = new ModelRendererTurbo(this, 865, 161, textureX, textureY); // Import
        gunModel[400] = new ModelRendererTurbo(this, 1001, 185, textureX, textureY); // Import
        gunModel[401] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Import
        gunModel[402] = new ModelRendererTurbo(this, 41, 241, textureX, textureY); // Import
        gunModel[403] = new ModelRendererTurbo(this, 233, 241, textureX, textureY); // Import
        gunModel[404] = new ModelRendererTurbo(this, 457, 241, textureX, textureY); // Import
        gunModel[405] = new ModelRendererTurbo(this, 489, 241, textureX, textureY); // Import
        gunModel[406] = new ModelRendererTurbo(this, 769, 241, textureX, textureY); // Import
        gunModel[407] = new ModelRendererTurbo(this, 809, 241, textureX, textureY); // Import
        gunModel[408] = new ModelRendererTurbo(this, 73, 249, textureX, textureY); // Import
        gunModel[409] = new ModelRendererTurbo(this, 169, 249, textureX, textureY); // Import
        gunModel[410] = new ModelRendererTurbo(this, 209, 249, textureX, textureY); // Import
        gunModel[411] = new ModelRendererTurbo(this, 609, 249, textureX, textureY); // Import
        gunModel[412] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Import
        gunModel[413] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Import
        gunModel[414] = new ModelRendererTurbo(this, 641, 249, textureX, textureY); // Import
        gunModel[415] = new ModelRendererTurbo(this, 673, 249, textureX, textureY); // Import
        gunModel[416] = new ModelRendererTurbo(this, 697, 249, textureX, textureY); // Import
        gunModel[417] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import
        gunModel[418] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import
        gunModel[419] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Import
        gunModel[420] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import
        gunModel[421] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Import
        gunModel[422] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Import
        gunModel[423] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import
        gunModel[424] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Import
        gunModel[425] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Import
        gunModel[426] = new ModelRendererTurbo(this, 529, 9, textureX, textureY); // Import
        gunModel[427] = new ModelRendererTurbo(this, 657, 9, textureX, textureY); // Import
        gunModel[428] = new ModelRendererTurbo(this, 721, 9, textureX, textureY); // Import
        gunModel[429] = new ModelRendererTurbo(this, 753, 9, textureX, textureY); // Import
        gunModel[430] = new ModelRendererTurbo(this, 785, 9, textureX, textureY); // Import
        gunModel[431] = new ModelRendererTurbo(this, 809, 9, textureX, textureY); // Import
        gunModel[432] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import
        gunModel[433] = new ModelRendererTurbo(this, 777, 121, textureX, textureY); // Import
        gunModel[434] = new ModelRendererTurbo(this, 937, 249, textureX, textureY); // Import
        gunModel[435] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Import
        gunModel[436] = new ModelRendererTurbo(this, 929, 57, textureX, textureY); // Import
        gunModel[437] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Import
        gunModel[438] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Import
        gunModel[439] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Import
        gunModel[440] = new ModelRendererTurbo(this, 985, 249, textureX, textureY); // Import
        gunModel[441] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Import
        gunModel[442] = new ModelRendererTurbo(this, 721, 17, textureX, textureY); // Import
        gunModel[443] = new ModelRendererTurbo(this, 809, 17, textureX, textureY); // Import
        gunModel[444] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Import
        gunModel[445] = new ModelRendererTurbo(this, 537, 25, textureX, textureY); // Import
        gunModel[446] = new ModelRendererTurbo(this, 553, 25, textureX, textureY); // Import
        gunModel[447] = new ModelRendererTurbo(this, 721, 25, textureX, textureY); // Import
        gunModel[448] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Import
        gunModel[449] = new ModelRendererTurbo(this, 281, 185, textureX, textureY); // Import
        gunModel[450] = new ModelRendererTurbo(this, 865, 185, textureX, textureY); // Import
        gunModel[451] = new ModelRendererTurbo(this, 449, 217, textureX, textureY); // Import
        gunModel[452] = new ModelRendererTurbo(this, 113, 249, textureX, textureY); // Import
        gunModel[453] = new ModelRendererTurbo(this, 273, 249, textureX, textureY); // Import
        gunModel[454] = new ModelRendererTurbo(this, 753, 249, textureX, textureY); // Import
        gunModel[455] = new ModelRendererTurbo(this, 905, 137, textureX, textureY); // Import
        gunModel[456] = new ModelRendererTurbo(this, 1009, 137, textureX, textureY); // Import
        gunModel[457] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Import
        gunModel[458] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Import
        gunModel[459] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Import
        gunModel[460] = new ModelRendererTurbo(this, 457, 145, textureX, textureY); // Import
        gunModel[461] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Import
        gunModel[462] = new ModelRendererTurbo(this, 537, 145, textureX, textureY); // Import
        gunModel[463] = new ModelRendererTurbo(this, 577, 145, textureX, textureY); // Import
        gunModel[464] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import
        gunModel[465] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import
        gunModel[466] = new ModelRendererTurbo(this, 617, 145, textureX, textureY); // Import
        gunModel[467] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Import
        gunModel[468] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Import
        gunModel[469] = new ModelRendererTurbo(this, 129, 257, textureX, textureY); // Import
        gunModel[470] = new ModelRendererTurbo(this, 145, 257, textureX, textureY); // Import
        gunModel[471] = new ModelRendererTurbo(this, 241, 257, textureX, textureY); // Import
        gunModel[472] = new ModelRendererTurbo(this, 529, 177, textureX, textureY); // Import
        gunModel[473] = new ModelRendererTurbo(this, 529, 193, textureX, textureY); // Import
        gunModel[474] = new ModelRendererTurbo(this, 1009, 201, textureX, textureY); // Import
        gunModel[475] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Import
        gunModel[476] = new ModelRendererTurbo(this, 841, 249, textureX, textureY); // Import
        gunModel[477] = new ModelRendererTurbo(this, 57, 257, textureX, textureY); // Import
        gunModel[478] = new ModelRendererTurbo(this, 257, 257, textureX, textureY); // Import
        gunModel[479] = new ModelRendererTurbo(this, 289, 257, textureX, textureY); // Import
        gunModel[480] = new ModelRendererTurbo(this, 305, 257, textureX, textureY); // Import
        gunModel[481] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import
        gunModel[482] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Import
        gunModel[483] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import
        gunModel[484] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import
        gunModel[485] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import
        gunModel[486] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Import
        gunModel[487] = new ModelRendererTurbo(this, 937, 121, textureX, textureY); // Import
        gunModel[488] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Import
        gunModel[489] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Import
        gunModel[490] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Import
        gunModel[491] = new ModelRendererTurbo(this, 369, 201, textureX, textureY); // Import
        gunModel[492] = new ModelRendererTurbo(this, 545, 225, textureX, textureY); // Import
        gunModel[493] = new ModelRendererTurbo(this, 769, 265, textureX, textureY); // Import
        gunModel[494] = new ModelRendererTurbo(this, 289, 273, textureX, textureY); // Import
        gunModel[495] = new ModelRendererTurbo(this, 289, 281, textureX, textureY); // Import
        gunModel[496] = new ModelRendererTurbo(this, 489, 281, textureX, textureY); // Import
        gunModel[497] = new ModelRendererTurbo(this, 489, 273, textureX, textureY); // Import
        gunModel[498] = new ModelRendererTurbo(this, 521, 273, textureX, textureY); // Import
        gunModel[499] = new ModelRendererTurbo(this, 553, 273, textureX, textureY); // Import

        gunModel[0].addShapeBox(42F, 0F, -6F, 34, 5, 12, 0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F); // Import
        gunModel[0].setRotationPoint(-11F, -56.5F, 0F);

        gunModel[1].addShapeBox(42F, 0F, -6F, 1, 2, 12, 0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F); // Import
        gunModel[1].setRotationPoint(-9.9F, -53.75F, -0.25F);

        gunModel[2].addShapeBox(42F, 0F, -6F, 2, 1, 12, 0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F); // Import
        gunModel[2].setRotationPoint(-10.9F, -53.75F, -0.25F);

        gunModel[3].addShapeBox(42F, 0F, -6F, 2, 1, 12, 0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F); // Import
        gunModel[3].setRotationPoint(-10.9F, -52.85F, -0.25F);

        gunModel[4].addShapeBox(42F, 0F, -6F, 4, 5, 12, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 3.5F, 0.0F); // Import
        gunModel[4].setRotationPoint(-15F, -56.5F, 0F);

        gunModel[5].addShapeBox(42F, 0F, -6F, 4, 5, 12, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.5F, 0.0F, -0.5F, 0.25F, 0.0F); // Import
        gunModel[5].setRotationPoint(-23F, -56.5F, 0F);

        gunModel[6].addShapeBox(42F, 0F, -6F, 4, 8, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[6].setRotationPoint(-19F, -56.5F, 0F);

        gunModel[7].addShapeBox(42F, 0F, -6F, 2, 1, 12, 0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F); // Import
        gunModel[7].setRotationPoint(-25.3F, -52.85F, -0.25F);

        gunModel[8].addShapeBox(42F, 0F, -6F, 2, 1, 12, 0F, -1.75F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.75F, 0.5F, 0.5F, -1.75F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, -1.75F, -0.25F, 0.5F); // Import
        gunModel[8].setRotationPoint(-25.55F, -53.35F, -0.25F);

        gunModel[9].addShapeBox(42F, 0F, -6F, 2, 1, 12, 0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F); // Import
        gunModel[9].setRotationPoint(-25.3F, -53.85F, -0.25F);

        gunModel[10].addShapeBox(42F, 0F, -6F, 2, 1, 12, 0F, -1.75F, -0.2F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.5F, -1.75F, -0.2F, 0.5F, -1.75F, -0.1F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.5F, -1.75F, -0.1F, 0.5F); // Import
        gunModel[10].setRotationPoint(-26.55F, -52.75F, -0.25F);

        gunModel[11].addShapeBox(42F, 0F, -6F, 2, 1, 12, 0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F); // Import
        gunModel[11].setRotationPoint(-25.3F, -51.85F, -0.25F);

        gunModel[12].addShapeBox(42F, 0F, -6F, 2, 1, 12, 0F, -1.25F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.5F, -1.25F, 0.25F, 0.5F, -1.25F, -0.75F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.5F, -1.25F, -0.75F, 0.5F); // Import
        gunModel[12].setRotationPoint(-25.05F, -51.85F, -0.25F);

        gunModel[13].addShapeBox(42F, 0F, -6F, 2, 1, 12, 0F, -0.5F, -1.0F, 0.0F, -1.25F, -0.75F, 0.0F, -1.25F, -0.75F, 0.5F, -0.5F, -1.0F, 0.5F, -0.5F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F); // Import
        gunModel[13].setRotationPoint(-25.3F, -54.6F, -0.25F);

        gunModel[14].addShapeBox(42F, 0F, -6F, 50, 5, 12, 0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F); // Import
        gunModel[14].setRotationPoint(-72F, -56.5F, 0F);

        gunModel[15].addShapeBox(42F, 0F, -6F, 1, 5, 13, 0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F); // Import
        gunModel[15].setRotationPoint(-17.5F, -54.5F, -0.25F);

        gunModel[16].addShapeBox(42F, 0F, -6F, 3, 1, 12, 0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[16].setRotationPoint(-18.5F, -49.5F, 0.75F);

        gunModel[17].addShapeBox(42F, 0F, -6F, 3, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[17].setRotationPoint(-18.5F, -48.5F, 0.75F);

        gunModel[18].addShapeBox(42F, 0F, -6F, 3, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F); // Import
        gunModel[18].setRotationPoint(-18.5F, -47.5F, 0.75F);

        gunModel[19].addShapeBox(42F, 0F, -6F, 1, 5, 2, 0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -2.5F, 0.25F, 0.25F, -2.5F, 0.25F); // Import
        gunModel[19].setRotationPoint(-17.5F, -54.5F, 12.75F);

        gunModel[20].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F); // Import
        gunModel[20].setRotationPoint(-17.5F, -54.25F, 3.25F);

        gunModel[21].addShapeBox(42F, 0F, -6F, 95, 5, 12, 0F, 0.5F, 0.0F, -3.5F, -0.5F, 0.0F, -3.5F, -0.5F, 0.0F, -3.5F, 0.5F, 0.0F, -3.5F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); // Import
        gunModel[21].setRotationPoint(-72F, -61.5F, 0F);

        gunModel[22].addShapeBox(42F, 0F, -6F, 113, 1, 4, 0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); // Import
        gunModel[22].setRotationPoint(-62.75F, -62.5F, 4F);

        gunModel[23].addShapeBox(42F, 0F, -6F, 27, 1, 4, 0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F); // Import
        gunModel[23].setRotationPoint(23.25F, -61.5F, 4F);

        gunModel[24].addShapeBox(42F, 0F, -6F, 53, 9, 12, 0F, 0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F); // Import
        gunModel[24].setRotationPoint(-11F, -51.25F, 0F);

        gunModel[25].addShapeBox(42F, 0F, -6F, 4, 9, 12, 0F, 0.0F, -3.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, -3.25F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[25].setRotationPoint(-15F, -51.25F, 0F);

        gunModel[26].addShapeBox(42F, 0F, -6F, 4, 9, 12, 0F, -0.5F, 0.0F, 0.5F, 0.0F, -3.25F, 0.5F, 0.0F, -3.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F); // Import
        gunModel[26].setRotationPoint(-23F, -51.25F, 0F);

        gunModel[27].addShapeBox(42F, 0F, -6F, 4, 9, 12, 0F, 0.0F, -3.25F, 0.5F, 0.0F, -3.25F, 0.5F, 0.0F, -3.25F, 0.5F, 0.0F, -3.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[27].setRotationPoint(-19F, -51.25F, 0F);

        gunModel[28].addShapeBox(42F, 0F, -6F, 74, 9, 12, 0F, 0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 18.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 18.5F, 0.0F, 0.5F); // Import
        gunModel[28].setRotationPoint(-96F, -51.25F, 0F);

        gunModel[29].addShapeBox(42F, 0F, -6F, 156, 2, 12, 0F, 0.5F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, -0.25F, -1.5F, -2.25F, -0.25F, -1.5F, -2.25F, -0.25F, -1.5F, 0.5F, -0.25F, -1.5F); // Import
        gunModel[29].setRotationPoint(-114F, -42.25F, 0F);

        gunModel[30].addShapeBox(42F, 0F, -6F, 4, 1, 12, 0F, 0.0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.0F, -1F, 0F, 0.0F, 0F, 0F, 0.0F, 0F, 0F, 0.0F, -1F); // Import
        gunModel[30].setRotationPoint(-33.5F, -27F, -0.5F);

        gunModel[31].addShapeBox(42F, 0F, -6F, 4, 2, 4, 0F, -1.25F, 0.5F, 0.0F, 2F, 0.5F, 0.0F, 2F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F); // Import
        gunModel[31].setRotationPoint(-20F, -40F, 4F);

        gunModel[32].addShapeBox(42F, 0F, -6F, 4, 1, 4, 0F, 0.25F, 0F, 0.0F, -0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, 0.25F, 0F, 0.0F, 0.75F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F); // Import
        gunModel[32].setRotationPoint(-20F, -37.5F, 4F);

        gunModel[33].addShapeBox(42F, 0F, -6F, 1, 3, 4, 0F, 0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F); // Import
        gunModel[33].setRotationPoint(-20.5F, -35.5F, 4F);

        gunModel[34].addShapeBox(42F, 0F, -6F, 1, 3, 4, 0F, 0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F); // Import
        gunModel[34].setRotationPoint(-18.5F, -35.5F, 4F);

        gunModel[35].addShapeBox(42F, 0F, -6F, 1, 1, 4, 0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[35].setRotationPoint(-18F, -35.5F, 4F);

        gunModel[36].addShapeBox(42F, 0F, -6F, 3, 3, 4, 0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.25F, -0.25F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F, -2.25F, -0.25F, 0.0F); // Import
        gunModel[36].setRotationPoint(-21F, -32F, 4F);

        gunModel[37].addShapeBox(42F, 0F, -6F, 2, 1, 10, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[37].setRotationPoint(-9.75F, -27F, 0.5F);

        gunModel[38].addShapeBox(42F, 0F, -6F, 4, 1, 10, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[38].setRotationPoint(-10.25F, -29F, 0.5F);

        gunModel[39].addShapeBox(42F, 0F, -6F, 3, 1, 10, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[39].setRotationPoint(-9.25F, -30.5F, 0.5F);

        gunModel[40].addShapeBox(42F, 0F, -6F, 2, 2, 10, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[40].setRotationPoint(-8.25F, -33F, 0.5F);

        gunModel[41].addShapeBox(42F, 0F, -6F, 2, 2, 10, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F); // Import
        gunModel[41].setRotationPoint(-8.25F, -35.5F, 0.5F);

        gunModel[42].addShapeBox(42F, 0F, -6F, 2, 2, 10, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[42].setRotationPoint(-8.25F, -37.5F, 0.5F);

        gunModel[43].addShapeBox(42F, 0F, -6F, 3, 1, 10, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[43].setRotationPoint(-9.25F, -39F, 0.5F);

        gunModel[44].addShapeBox(42F, 0F, -6F, 4, 1, 10, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F); // Import
        gunModel[44].setRotationPoint(-10.25F, -40F, 0.5F);

        gunModel[45].addShapeBox(42F, 0F, -6F, 2, 13, 9, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[45].setRotationPoint(-6.25F, -40F, 1.5F);

        gunModel[46].addShapeBox(42F, 0F, -6F, 3, 13, 9, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[46].setRotationPoint(-4.25F, -40F, 1.5F);

        gunModel[47].addShapeBox(42F, 0F, -6F, 2, 14, 9, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        gunModel[47].setRotationPoint(-1.25F, -40F, 1.5F);

        gunModel[48].addShapeBox(42F, 0F, -6F, 22, 14, 9, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F); // Import
        gunModel[48].setRotationPoint(0.75F, -40F, 1.5F);

        gunModel[49].addShapeBox(42F, 0F, -6F, 14, 3, 9, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 1.25F, 0.0F); // Import
        gunModel[49].setRotationPoint(22.75F, -40F, 1.5F);

        gunModel[50].addShapeBox(42F, 0F, -6F, 6, 9, 8, 0F, 0.0F, 0.75F, 0.5F, 1.0F, 3.15F, 0.0F, 1.0F, 3.15F, 0.0F, 0.0F, 0.75F, 0.5F, 0.0F, 1.25F, 0.5F, 1.0F, -6.0F, 0.0F, 1.0F, -6.0F, 0.0F, 0.0F, 1.25F, 0.5F); // Import
        gunModel[50].setRotationPoint(22.75F, -35F, 2F);

        gunModel[51].addShapeBox(42F, 0F, -6F, 4, 9, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[51].setRotationPoint(29.75F, -41F, 2F);

        gunModel[52].addShapeBox(42F, 0F, -6F, 2, 9, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[52].setRotationPoint(33.75F, -41F, 2F);

        gunModel[53].addShapeBox(42F, 0F, -6F, 1, 9, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, -2.0F, 0.0F); // Import
        gunModel[53].setRotationPoint(35.75F, -41F, 2F);

        gunModel[54].addShapeBox(42F, 0F, -6F, 1, 6, 8, 0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.5F, -5.5F, 0.0F, 0.5F, -5.5F, 0.0F, 0.0F, -2.5F, 0.0F); // Import
        gunModel[54].setRotationPoint(36.75F, -41F, 2F);

        gunModel[55].addShapeBox(42F, 0F, -6F, 10, 2, 10, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F); // Import
        gunModel[55].setRotationPoint(5.75F, -30F, 1F);

        gunModel[56].addShapeBox(42F, 0F, -6F, 2, 2, 10, 0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F); // Import
        gunModel[56].setRotationPoint(15.75F, -30F, 1F);

        gunModel[57].addShapeBox(42F, 0F, -6F, 1, 1, 10, 0F, 0.0F, 0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F); // Import
        gunModel[57].setRotationPoint(17.75F, -29F, 1F);

        gunModel[58].addShapeBox(42F, 0F, -6F, 2, 2, 10, 0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.25F, 0.0F); // Import
        gunModel[58].setRotationPoint(3.75F, -30F, 1F);

        gunModel[59].addShapeBox(42F, 0F, -6F, 1, 1, 10, 0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, -0.5F, 0.0F); // Import
        gunModel[59].setRotationPoint(2.75F, -29F, 1F);

        gunModel[60].addShapeBox(42F, 0F, -6F, 1, 1, 11, 0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Import
        gunModel[60].setRotationPoint(5.5F, -29F, 0.75F);

        gunModel[61].addShapeBox(42F, 0F, -6F, 1, 1, 11, 0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Import
        gunModel[61].setRotationPoint(5.5F, -29.5F, 0.75F);

        gunModel[62].addShapeBox(42F, 0F, -6F, 1, 1, 11, 0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Import
        gunModel[62].setRotationPoint(5.5F, -28.5F, 0.75F);

        gunModel[63].addShapeBox(42F, 0F, -6F, 1, 1, 11, 0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Import
        gunModel[63].setRotationPoint(15F, -29F, 0.75F);

        gunModel[64].addShapeBox(42F, 0F, -6F, 1, 1, 11, 0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Import
        gunModel[64].setRotationPoint(15F, -29.5F, 0.75F);

        gunModel[65].addShapeBox(42F, 0F, -6F, 1, 1, 11, 0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Import
        gunModel[65].setRotationPoint(15F, -28.5F, 0.75F);

        gunModel[66].addShapeBox(42F, 0F, -6F, 10, 2, 10, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F); // Import
        gunModel[66].setRotationPoint(-95.25F, -35.5F, 1F);

        gunModel[67].addShapeBox(42F, 0F, -6F, 2, 2, 10, 0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F); // Import
        gunModel[67].setRotationPoint(-85.25F, -35.5F, 1F);

        gunModel[68].addShapeBox(42F, 0F, -6F, 1, 1, 10, 0F, 0.0F, 0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F); // Import
        gunModel[68].setRotationPoint(-83.25F, -34.5F, 1F);

        gunModel[69].addShapeBox(42F, 0F, -6F, 2, 2, 10, 0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.25F, 0.0F); // Import
        gunModel[69].setRotationPoint(-97.25F, -35.5F, 1F);

        gunModel[70].addShapeBox(42F, 0F, -6F, 1, 1, 10, 0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, -0.5F, 0.0F); // Import
        gunModel[70].setRotationPoint(-98.25F, -34.5F, 1F);

        gunModel[71].addShapeBox(42F, 0F, -6F, 1, 1, 11, 0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Import
        gunModel[71].setRotationPoint(-95.5F, -34.5F, 0.75F);

        gunModel[72].addShapeBox(42F, 0F, -6F, 1, 1, 11, 0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Import
        gunModel[72].setRotationPoint(-95.5F, -35F, 0.75F);

        gunModel[73].addShapeBox(42F, 0F, -6F, 1, 1, 11, 0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Import
        gunModel[73].setRotationPoint(-95.5F, -34F, 0.75F);

        gunModel[74].addShapeBox(42F, 0F, -6F, 1, 1, 11, 0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Import
        gunModel[74].setRotationPoint(-86F, -34.5F, 0.75F);

        gunModel[75].addShapeBox(42F, 0F, -6F, 1, 1, 11, 0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Import
        gunModel[75].setRotationPoint(-86F, -35F, 0.75F);

        gunModel[76].addShapeBox(42F, 0F, -6F, 1, 1, 11, 0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Import
        gunModel[76].setRotationPoint(-86F, -34F, 0.75F);

        gunModel[77].addShapeBox(42F, 0F, -6F, 11, 7, 9, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, -0.5F, 0.0F, 1.25F, 0.0F); // Import
        gunModel[77].setRotationPoint(-78.25F, -38F, 1.5F);

        gunModel[78].addShapeBox(42F, 0F, -6F, 28, 7, 9, 0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.25F, 1.25F, 0.0F); // Import
        gunModel[78].setRotationPoint(-106.25F, -38F, 1.5F);

        gunModel[79].addShapeBox(42F, 0F, -6F, 28, 1, 9, 0F, 2.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 2.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F); // Import
        gunModel[79].setRotationPoint(-106.25F, -40F, 1.5F);

        gunModel[80].addShapeBox(42F, 0F, -6F, 11, 1, 9, 0F, 0.25F, 0.5F, 0.0F, 1.75F, 0.5F, 0.0F, 1.75F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.5F, 0.25F, 0.5F, 0.0F); // Import
        gunModel[80].setRotationPoint(-78F, -40F, 1.5F);

        gunModel[81].addBox(42F, 0F, -6F, 3, 4, 12, 0F); // Import
        gunModel[81].setRotationPoint(128.5F, -56F, 0F);

        gunModel[82].addShapeBox(42F, 0F, -6F, 3, 4, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[82].setRotationPoint(120F, -60F, 0F);

        gunModel[83].addShapeBox(42F, 0F, -6F, 24, 4, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[83].setRotationPoint(22.5F, -52F, 0F);

        gunModel[84].addShapeBox(42F, 0F, -6F, 18, 4, 12, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[84].setRotationPoint(22F, -56F, 0F);

        gunModel[85].addShapeBox(42F, 0F, -6F, 24, 4, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[85].setRotationPoint(22.5F, -60F, 0F);

        gunModel[86].addShapeBox(42F, 0F, -6F, 3, 4, 12, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[86].setRotationPoint(52F, -56F, 0F);

        gunModel[87].addShapeBox(42F, 0F, -6F, 3, 4, 12, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[87].setRotationPoint(67.5F, -56F, 0F);

        gunModel[88].addShapeBox(42F, 0F, -6F, 3, 4, 12, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[88].setRotationPoint(82.75F, -56F, 0F);

        gunModel[89].addShapeBox(42F, 0F, -6F, 3, 4, 12, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[89].setRotationPoint(98F, -56F, 0F);

        gunModel[90].addShapeBox(42F, 0F, -6F, 3, 4, 12, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[90].setRotationPoint(113.25F, -56F, 0F);

        gunModel[91].addShapeBox(42F, 0F, -6F, 4, 4, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[91].setRotationPoint(136F, -60F, 0F);

        gunModel[92].addShapeBox(42F, 0F, -6F, 4, 4, 12, 0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[92].setRotationPoint(136F, -52F, 0F);

        gunModel[93].addShapeBox(42F, 0F, -6F, 3, 4, 12, 0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[93].setRotationPoint(137F, -56F, 0F);

        gunModel[94].addShapeBox(42F, 0F, -6F, 3, 4, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[94].setRotationPoint(90F, -60F, 0F);

        gunModel[95].addShapeBox(42F, 0F, -6F, 3, 4, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[95].setRotationPoint(90F, -52F, 0F);

        gunModel[96].addShapeBox(42F, 0F, -6F, 6, 1, 12, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[96].setRotationPoint(131.5F, -56F, 0F);

        gunModel[97].addShapeBox(42F, 0F, -6F, 6, 1, 12, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[97].setRotationPoint(131.5F, -52.5F, 0F);

        gunModel[98].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[98].setRotationPoint(131.5F, -53.5F, 0F);

        gunModel[99].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[99].setRotationPoint(131.5F, -55.5F, 0F);

        gunModel[100].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F); // Import
        gunModel[100].setRotationPoint(136F, -55.5F, 0F);

        gunModel[101].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[101].setRotationPoint(136F, -53.5F, 0F);

        gunModel[102].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[102].setRotationPoint(116.25F, -53.5F, 0F);

        gunModel[103].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[103].setRotationPoint(116.25F, -55.5F, 0F);

        gunModel[104].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F); // Import
        gunModel[104].setRotationPoint(127.5F, -55.5F, 0F);

        gunModel[105].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[105].setRotationPoint(127.5F, -53.5F, 0F);

        gunModel[106].addShapeBox(42F, 0F, -6F, 12, 1, 12, 0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F); // Import
        gunModel[106].setRotationPoint(116.5F, -56F, 0F);

        gunModel[107].addShapeBox(42F, 0F, -6F, 12, 1, 12, 0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F); // Import
        gunModel[107].setRotationPoint(116.5F, -52.5F, 0F);

        gunModel[108].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[108].setRotationPoint(101F, -53.5F, 0F);

        gunModel[109].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[109].setRotationPoint(101F, -55.5F, 0F);

        gunModel[110].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F); // Import
        gunModel[110].setRotationPoint(112.75F, -55.5F, 0F);

        gunModel[111].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[111].setRotationPoint(112.75F, -53.5F, 0F);

        gunModel[112].addShapeBox(42F, 0F, -6F, 12, 1, 12, 0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F); // Import
        gunModel[112].setRotationPoint(101.5F, -56F, 0F);

        gunModel[113].addShapeBox(42F, 0F, -6F, 12, 1, 12, 0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F); // Import
        gunModel[113].setRotationPoint(101.5F, -52.5F, 0F);

        gunModel[114].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[114].setRotationPoint(85.75F, -53.5F, 0F);

        gunModel[115].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[115].setRotationPoint(85.75F, -55.5F, 0F);

        gunModel[116].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F); // Import
        gunModel[116].setRotationPoint(97.5F, -55.5F, 0F);

        gunModel[117].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[117].setRotationPoint(97.5F, -53.5F, 0F);

        gunModel[118].addShapeBox(42F, 0F, -6F, 12, 1, 12, 0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F); // Import
        gunModel[118].setRotationPoint(86F, -56F, 0F);

        gunModel[119].addShapeBox(42F, 0F, -6F, 12, 1, 12, 0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F); // Import
        gunModel[119].setRotationPoint(86F, -52.5F, 0F);

        gunModel[120].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[120].setRotationPoint(70.5F, -53.5F, 0F);

        gunModel[121].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[121].setRotationPoint(70.5F, -55.5F, 0F);

        gunModel[122].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F); // Import
        gunModel[122].setRotationPoint(82.25F, -55.5F, 0F);

        gunModel[123].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[123].setRotationPoint(82.25F, -53.5F, 0F);

        gunModel[124].addShapeBox(42F, 0F, -6F, 12, 1, 12, 0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F); // Import
        gunModel[124].setRotationPoint(70.75F, -56F, 0F);

        gunModel[125].addShapeBox(42F, 0F, -6F, 12, 1, 12, 0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F); // Import
        gunModel[125].setRotationPoint(70.75F, -52.5F, 0F);

        gunModel[126].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[126].setRotationPoint(55F, -53.5F, 0F);

        gunModel[127].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[127].setRotationPoint(55F, -55.5F, 0F);

        gunModel[128].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F); // Import
        gunModel[128].setRotationPoint(67F, -55.5F, 0F);

        gunModel[129].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[129].setRotationPoint(67F, -53.5F, 0F);

        gunModel[130].addShapeBox(42F, 0F, -6F, 12, 1, 12, 0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F); // Import
        gunModel[130].setRotationPoint(55.25F, -56F, 0F);

        gunModel[131].addShapeBox(42F, 0F, -6F, 12, 1, 12, 0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F); // Import
        gunModel[131].setRotationPoint(55.25F, -52.5F, 0F);

        gunModel[132].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[132].setRotationPoint(40F, -53.5F, 0F);

        gunModel[133].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[133].setRotationPoint(40F, -55.5F, 0F);

        gunModel[134].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F); // Import
        gunModel[134].setRotationPoint(51.5F, -55.5F, 0F);

        gunModel[135].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[135].setRotationPoint(51.5F, -53.5F, 0F);

        gunModel[136].addShapeBox(42F, 0F, -6F, 12, 1, 12, 0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F); // Import
        gunModel[136].setRotationPoint(40.25F, -56F, 0F);

        gunModel[137].addShapeBox(42F, 0F, -6F, 12, 1, 12, 0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F); // Import
        gunModel[137].setRotationPoint(40.25F, -52.5F, 0F);

        gunModel[138].addShapeBox(42F, 0F, -6F, 3, 4, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[138].setRotationPoint(120F, -52F, 0F);

        gunModel[139].addShapeBox(42F, 0F, -6F, 11, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[139].setRotationPoint(124F, -52F, 0F);

        gunModel[140].addShapeBox(42F, 0F, -6F, 11, 1, 12, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[140].setRotationPoint(124F, -49F, 0F);

        gunModel[141].addShapeBox(42F, 0F, -6F, 11, 1, 12, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[141].setRotationPoint(124F, -57F, 0F);

        gunModel[142].addShapeBox(42F, 0F, -6F, 11, 1, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F); // Import
        gunModel[142].setRotationPoint(124F, -60F, 0F);

        gunModel[143].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F); // Import
        gunModel[143].setRotationPoint(123F, -52F, 0F);

        gunModel[144].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[144].setRotationPoint(135F, -52F, 0F);

        gunModel[145].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[145].setRotationPoint(123F, -49F, 0F);

        gunModel[146].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[146].setRotationPoint(135F, -49F, 0F);

        gunModel[147].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[147].setRotationPoint(135F, -57F, 0F);

        gunModel[148].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F); // Import
        gunModel[148].setRotationPoint(123F, -60F, 0F);

        gunModel[149].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F); // Import
        gunModel[149].setRotationPoint(135F, -60F, 0F);

        gunModel[150].addShapeBox(42F, 0F, -6F, 3, 4, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[150].setRotationPoint(105F, -52F, 0F);

        gunModel[151].addShapeBox(42F, 0F, -6F, 10, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[151].setRotationPoint(109F, -52F, 0F);

        gunModel[152].addShapeBox(42F, 0F, -6F, 10, 1, 12, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[152].setRotationPoint(109F, -49F, 0F);

        gunModel[153].addShapeBox(42F, 0F, -6F, 3, 4, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[153].setRotationPoint(74F, -52F, 0F);

        gunModel[154].addShapeBox(42F, 0F, -6F, 11, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[154].setRotationPoint(78F, -52F, 0F);

        gunModel[155].addShapeBox(42F, 0F, -6F, 11, 1, 12, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[155].setRotationPoint(78F, -49F, 0F);

        gunModel[156].addShapeBox(42F, 0F, -6F, 3, 4, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[156].setRotationPoint(59.5F, -52F, 0F);

        gunModel[157].addShapeBox(42F, 0F, -6F, 10, 1, 12, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F); // Import
        gunModel[157].setRotationPoint(63F, -52F, 0F);

        gunModel[158].addShapeBox(42F, 0F, -6F, 10, 1, 12, 0F, -0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F); // Import
        gunModel[158].setRotationPoint(63F, -49F, 0F);

        gunModel[159].addShapeBox(42F, 0F, -6F, 3, 4, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[159].setRotationPoint(59.5F, -60F, 0F);

        gunModel[160].addShapeBox(42F, 0F, -6F, 3, 4, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[160].setRotationPoint(74F, -60F, 0F);

        gunModel[161].addShapeBox(42F, 0F, -6F, 3, 4, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[161].setRotationPoint(105F, -60F, 0F);

        gunModel[162].addShapeBox(42F, 0F, -6F, 10, 1, 12, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[162].setRotationPoint(109F, -57F, 0F);

        gunModel[163].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[163].setRotationPoint(119F, -57F, 0F);

        gunModel[164].addShapeBox(42F, 0F, -6F, 9, 1, 6, 0F, 0.5F, 0.0F, -1.0F, -0.5F, 0F, -1.0F, -0.5F, 0F, -1.0F, 0.5F, 0F, -1.0F, 0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, 0.5F, 0F, 0.0F); // Import
        gunModel[164].setRotationPoint(48.25F, -64.5F, 3F);

        gunModel[165].addShapeBox(42F, 0F, -6F, 2, 1, 6, 0F, 0.5F, 0.0F, -1.0F, 0.0F, 0F, -1.0F, 0.0F, 0F, -1.0F, 0.5F, 0F, -1.0F, 0.5F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.5F, 0F, 0.0F); // Import
        gunModel[165].setRotationPoint(138.25F, -64.5F, 3F);

        gunModel[166].addShapeBox(42F, 0F, -6F, 6, 1, 4, 0F, 0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F); // Import
        gunModel[166].setRotationPoint(55.25F, -61.5F, 4F);

        gunModel[167].addShapeBox(42F, 0F, -6F, 6, 1, 4, 0F, 0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F); // Import
        gunModel[167].setRotationPoint(65.25F, -61.5F, 4F);

        gunModel[168].addShapeBox(42F, 0F, -6F, 6, 1, 4, 0F, 0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F); // Import
        gunModel[168].setRotationPoint(75.25F, -61.5F, 4F);

        gunModel[169].addShapeBox(42F, 0F, -6F, 6, 1, 4, 0F, 0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F); // Import
        gunModel[169].setRotationPoint(85.25F, -61.5F, 4F);

        gunModel[170].addShapeBox(42F, 0F, -6F, 6, 1, 4, 0F, 0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F); // Import
        gunModel[170].setRotationPoint(95.25F, -61.5F, 4F);

        gunModel[171].addShapeBox(42F, 0F, -6F, 6, 1, 4, 0F, 0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F); // Import
        gunModel[171].setRotationPoint(105.25F, -61.5F, 4F);

        gunModel[172].addShapeBox(42F, 0F, -6F, 6, 1, 4, 0F, 0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F); // Import
        gunModel[172].setRotationPoint(115.25F, -61.5F, 4F);

        gunModel[173].addShapeBox(42F, 0F, -6F, 6, 1, 4, 0F, 0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F); // Import
        gunModel[173].setRotationPoint(125.25F, -61.5F, 4F);

        gunModel[174].addShapeBox(42F, 0F, -6F, 6, 1, 4, 0F, 0.75F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F); // Import
        gunModel[174].setRotationPoint(135.25F, -61.5F, 4F);

        gunModel[175].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[175].setRotationPoint(123F, -57F, 0F);

        gunModel[176].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F); // Import
        gunModel[176].setRotationPoint(119F, -60F, 0F);

        gunModel[177].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F); // Import
        gunModel[177].setRotationPoint(108F, -60F, 0F);

        gunModel[178].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[178].setRotationPoint(108F, -57F, 0F);

        gunModel[179].addShapeBox(42F, 0F, -6F, 10, 1, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F); // Import
        gunModel[179].setRotationPoint(109F, -60F, 0F);

        gunModel[180].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[180].setRotationPoint(104F, -57F, 0F);

        gunModel[181].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F); // Import
        gunModel[181].setRotationPoint(104F, -60F, 0F);

        gunModel[182].addShapeBox(42F, 0F, -6F, 10, 1, 12, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[182].setRotationPoint(94F, -57F, 0F);

        gunModel[183].addShapeBox(42F, 0F, -6F, 10, 1, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F); // Import
        gunModel[183].setRotationPoint(94F, -60F, 0F);

        gunModel[184].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F); // Import
        gunModel[184].setRotationPoint(93F, -60F, 0F);

        gunModel[185].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[185].setRotationPoint(93F, -57F, 0F);

        gunModel[186].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[186].setRotationPoint(89F, -57F, 0F);

        gunModel[187].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F); // Import
        gunModel[187].setRotationPoint(89F, -60F, 0F);

        gunModel[188].addShapeBox(42F, 0F, -6F, 11, 1, 12, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[188].setRotationPoint(78F, -57F, 0F);

        gunModel[189].addShapeBox(42F, 0F, -6F, 11, 1, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F); // Import
        gunModel[189].setRotationPoint(78F, -60F, 0F);

        gunModel[190].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F); // Import
        gunModel[190].setRotationPoint(77F, -60F, 0F);

        gunModel[191].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[191].setRotationPoint(77F, -57F, 0F);

        gunModel[192].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[192].setRotationPoint(73F, -57F, 0F);

        gunModel[193].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F); // Import
        gunModel[193].setRotationPoint(73F, -60F, 0F);

        gunModel[194].addShapeBox(42F, 0F, -6F, 10, 1, 12, 0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[194].setRotationPoint(63F, -57F, 0F);

        gunModel[195].addShapeBox(42F, 0F, -6F, 10, 1, 12, 0F, -0.5F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F); // Import
        gunModel[195].setRotationPoint(63F, -60F, 0F);

        gunModel[196].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F); // Import
        gunModel[196].setRotationPoint(62.5F, -60F, 0F);

        gunModel[197].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[197].setRotationPoint(62.5F, -57F, 0F);

        gunModel[198].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[198].setRotationPoint(58.5F, -57F, 0F);

        gunModel[199].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F); // Import
        gunModel[199].setRotationPoint(58.5F, -60F, 0F);

        gunModel[200].addShapeBox(42F, 0F, -6F, 11, 1, 12, 0F, -0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[200].setRotationPoint(47F, -57F, 0F);

        gunModel[201].addShapeBox(42F, 0F, -6F, 11, 1, 12, 0F, -0.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F); // Import
        gunModel[201].setRotationPoint(47F, -60F, 0F);

        gunModel[202].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F); // Import
        gunModel[202].setRotationPoint(46.5F, -60F, 0F);

        gunModel[203].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[203].setRotationPoint(46.5F, -57F, 0F);

        gunModel[204].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[204].setRotationPoint(119F, -52F, 0F);

        gunModel[205].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[205].setRotationPoint(119F, -49F, 0F);

        gunModel[206].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F); // Import
        gunModel[206].setRotationPoint(108F, -52F, 0F);

        gunModel[207].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[207].setRotationPoint(108F, -49F, 0F);

        gunModel[208].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[208].setRotationPoint(104F, -52F, 0F);

        gunModel[209].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[209].setRotationPoint(104F, -49F, 0F);

        gunModel[210].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F); // Import
        gunModel[210].setRotationPoint(93F, -52F, 0F);

        gunModel[211].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[211].setRotationPoint(93F, -49F, 0F);

        gunModel[212].addShapeBox(42F, 0F, -6F, 10, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[212].setRotationPoint(94F, -52F, 0F);

        gunModel[213].addShapeBox(42F, 0F, -6F, 10, 1, 12, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[213].setRotationPoint(94F, -49F, 0F);

        gunModel[214].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[214].setRotationPoint(89F, -52F, 0F);

        gunModel[215].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[215].setRotationPoint(89F, -49F, 0F);

        gunModel[216].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F); // Import
        gunModel[216].setRotationPoint(77F, -52F, 0F);

        gunModel[217].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[217].setRotationPoint(77F, -49F, 0F);

        gunModel[218].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[218].setRotationPoint(73F, -52F, 0F);

        gunModel[219].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[219].setRotationPoint(73F, -49F, 0F);

        gunModel[220].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F); // Import
        gunModel[220].setRotationPoint(62.5F, -52F, 0F);

        gunModel[221].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[221].setRotationPoint(62.5F, -49F, 0F);

        gunModel[222].addShapeBox(42F, 0F, -6F, 11, 1, 12, 0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F); // Import
        gunModel[222].setRotationPoint(47F, -52F, 0F);

        gunModel[223].addShapeBox(42F, 0F, -6F, 11, 1, 12, 0F, -0.5F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F); // Import
        gunModel[223].setRotationPoint(47F, -49F, 0F);

        gunModel[224].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[224].setRotationPoint(58.5F, -52F, 0F);

        gunModel[225].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[225].setRotationPoint(58.5F, -49F, 0F);

        gunModel[226].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F); // Import
        gunModel[226].setRotationPoint(46.5F, -52F, 0F);

        gunModel[227].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[227].setRotationPoint(46.5F, -49F, 0F);

        gunModel[228].addShapeBox(42F, 0F, -6F, 1, 2, 7, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[228].setRotationPoint(140.25F, -63.5F, 2.5F);

        gunModel[229].addShapeBox(42F, 0F, -6F, 1, 2, 9, 0F, 0.0F, 0.0F, -1F, 1.0F, 0.0F, -1F, 1.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.5F, 0.0F, 2.75F, 0.5F, 0.0F, 2.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[229].setRotationPoint(140.25F, -61.5F, 1.5F);

        gunModel[230].addShapeBox(42F, 0F, -6F, 3, 6, 9, 0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[230].setRotationPoint(140.25F, -59F, 1.5F);

        gunModel[231].addShapeBox(42F, 0F, -6F, 5, 4, 9, 0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 2.0F, 0.0F, -1.5F, 2.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        gunModel[231].setRotationPoint(140.25F, -53F, 1.5F);

        gunModel[232].addShapeBox(42F, 0F, -6F, 6, 3, 6, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[232].setRotationPoint(140.25F, -49F, 3F);

        gunModel[233].addShapeBox(42F, 0F, -6F, 7, 5, 9, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[233].setRotationPoint(140.25F, -46F, 1.5F);

        gunModel[234].addShapeBox(42F, 0F, -6F, 6, 1, 1, 0F, 0.0F, 0.75F, 0.5F, 1.4F, 0.75F, 0.5F, 2F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 2.0F, 0.0F, 0.5F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[234].setRotationPoint(140.25F, -47F, 9.5F);

        gunModel[235].addShapeBox(42F, 0F, -6F, 104, 1, 3, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[235].setRotationPoint(38.25F, -44.5F, 7F);

        gunModel[236].addShapeBox(42F, 0F, -6F, 104, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[236].setRotationPoint(38.25F, -43.5F, 7F);

        gunModel[237].addShapeBox(42F, 0F, -6F, 104, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[237].setRotationPoint(38.25F, -42.5F, 7F);

        gunModel[238].addShapeBox(42F, 0F, -6F, 104, 1, 3, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[238].setRotationPoint(38.25F, -44.5F, 2F);

        gunModel[239].addShapeBox(42F, 0F, -6F, 104, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[239].setRotationPoint(38.25F, -43.5F, 2F);

        gunModel[240].addShapeBox(42F, 0F, -6F, 104, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[240].setRotationPoint(38.25F, -42.5F, 2F);

        gunModel[241].addShapeBox(42F, 0F, -6F, 16, 4, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[241].setRotationPoint(41.25F, -45F, -2F);

        gunModel[242].addShapeBox(42F, 0F, -6F, 9, 3, 16, 0F, -2.25F, 0.0F, -1.2F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -1.2F, -2.25F, 0.0F, -1.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[242].setRotationPoint(41.25F, -48F, -2F);

        gunModel[243].addShapeBox(42F, 0F, -6F, 7, 2, 16, 0F, -3.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -3.5F, 0.0F, -2.0F, -0.25F, 0.0F, -1.2F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -1.2F, -0.25F, 0.0F, -1.2F); // Import
        gunModel[243].setRotationPoint(43.25F, -50F, -2F);

        gunModel[244].addShapeBox(42F, 0F, -6F, 49, 2, 16, 0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -4.0F, 0.0F, -1.0F); // Import
        gunModel[244].setRotationPoint(41.25F, -41F, -2F);

        gunModel[245].addShapeBox(42F, 0F, -6F, 1, 2, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[245].setRotationPoint(57.25F, -45F, -2F);

        gunModel[246].addShapeBox(42F, 0F, -6F, 1, 2, 16, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[246].setRotationPoint(57.25F, -43F, -2F);

        gunModel[247].addShapeBox(42F, 0F, -6F, 1, 2, 16, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[247].setRotationPoint(65.25F, -43F, -2F);

        gunModel[248].addShapeBox(42F, 0F, -6F, 1, 2, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[248].setRotationPoint(65.25F, -45F, -2F);

        gunModel[249].addShapeBox(42F, 0F, -6F, 1, 2, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[249].setRotationPoint(69.25F, -45F, -2F);

        gunModel[250].addShapeBox(42F, 0F, -6F, 1, 2, 16, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[250].setRotationPoint(69.25F, -43F, -2F);

        gunModel[251].addShapeBox(42F, 0F, -6F, 1, 2, 16, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[251].setRotationPoint(77.25F, -43F, -2F);

        gunModel[252].addShapeBox(42F, 0F, -6F, 1, 2, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[252].setRotationPoint(77.25F, -45F, -2F);

        gunModel[253].addShapeBox(42F, 0F, -6F, 3, 4, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[253].setRotationPoint(66.25F, -45F, -2F);

        gunModel[254].addShapeBox(42F, 0F, -6F, 15, 4, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[254].setRotationPoint(78.25F, -45F, -2F);

        gunModel[255].addShapeBox(42F, 0F, -6F, 3, 5, 16, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[255].setRotationPoint(59.75F, -50F, -2F);

        gunModel[256].addShapeBox(42F, 0F, -6F, 3, 5, 16, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[256].setRotationPoint(72.25F, -50F, -2F);

        gunModel[257].addShapeBox(42F, 0F, -6F, 4, 5, 16, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[257].setRotationPoint(84.75F, -50F, -2F);

        gunModel[258].addShapeBox(42F, 0F, -6F, 10, 1, 16, 0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, -1.4F, -0.5F, 0.5F, -1.4F, -0.5F, 0.5F, -1.4F, 0.0F, 0.5F, -1.4F); // Import
        gunModel[258].setRotationPoint(50.25F, -50F, -2F);

        gunModel[259].addShapeBox(42F, 0F, -6F, 10, 1, 16, 0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, -1.4F, -0.5F, 0.5F, -1.4F, -0.5F, 0.5F, -1.4F, 0.0F, 0.5F, -1.4F); // Import
        gunModel[259].setRotationPoint(75.25F, -50F, -2F);

        gunModel[260].addShapeBox(42F, 0F, -6F, 10, 1, 20, 0F, 0.0F, 0.0F, -2.4F, -0.5F, 0.0F, -2.4F, -0.5F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[260].setRotationPoint(75.25F, -46F, -4F);

        gunModel[261].addShapeBox(42F, 0F, -6F, 10, 1, 20, 0F, 0.0F, 0.0F, -2.4F, -0.5F, 0.0F, -2.4F, -0.5F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[261].setRotationPoint(50.25F, -46F, -4F);

        gunModel[262].addShapeBox(42F, 0F, -6F, 1, 1, 20, 0F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F); // Import
        gunModel[262].setRotationPoint(75.25F, -48.5F, -4F);

        gunModel[263].addShapeBox(42F, 0F, -6F, 1, 1, 20, 0F, 0.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F); // Import
        gunModel[263].setRotationPoint(75.25F, -47F, -4F);

        gunModel[264].addShapeBox(42F, 0F, -6F, 1, 1, 20, 0F, -1.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F); // Import
        gunModel[264].setRotationPoint(83.75F, -47F, -4F);

        gunModel[265].addShapeBox(42F, 0F, -6F, 1, 1, 20, 0F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, -1.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F); // Import
        gunModel[265].setRotationPoint(83.75F, -48.5F, -4F);

        gunModel[266].addShapeBox(42F, 0F, -6F, 1, 1, 20, 0F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F); // Import
        gunModel[266].setRotationPoint(50.25F, -48.5F, -4F);

        gunModel[267].addShapeBox(42F, 0F, -6F, 1, 1, 20, 0F, 0.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F); // Import
        gunModel[267].setRotationPoint(50.25F, -47F, -4F);

        gunModel[268].addShapeBox(42F, 0F, -6F, 1, 1, 20, 0F, -1.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F); // Import
        gunModel[268].setRotationPoint(58.75F, -47F, -4F);

        gunModel[269].addShapeBox(42F, 0F, -6F, 1, 1, 20, 0F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, -1.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F); // Import
        gunModel[269].setRotationPoint(58.75F, -48.5F, -4F);

        gunModel[270].addShapeBox(42F, 0F, -6F, 10, 1, 16, 0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, -1.4F, -0.5F, 0.5F, -1.4F, -0.5F, 0.5F, -1.4F, 0.0F, 0.5F, -1.4F); // Import
        gunModel[270].setRotationPoint(62.75F, -50F, -2F);

        gunModel[271].addShapeBox(42F, 0F, -6F, 10, 1, 20, 0F, 0.0F, 0.0F, -2.4F, -0.5F, 0.0F, -2.4F, -0.5F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[271].setRotationPoint(62.75F, -46F, -4F);

        gunModel[272].addShapeBox(42F, 0F, -6F, 1, 1, 20, 0F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F); // Import
        gunModel[272].setRotationPoint(62.75F, -48.5F, -4F);

        gunModel[273].addShapeBox(42F, 0F, -6F, 1, 1, 20, 0F, 0.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F); // Import
        gunModel[273].setRotationPoint(62.75F, -47F, -4F);

        gunModel[274].addShapeBox(42F, 0F, -6F, 1, 1, 20, 0F, -1.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F); // Import
        gunModel[274].setRotationPoint(71.25F, -47F, -4F);

        gunModel[275].addShapeBox(42F, 0F, -6F, 1, 1, 20, 0F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, -1.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, 0.0F, 0.25F, -2.9F, -1.0F, 0.25F, -2.9F); // Import
        gunModel[275].setRotationPoint(71.25F, -48.5F, -4F);

        gunModel[276].addShapeBox(42F, 0F, -6F, 1, 5, 2, 0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -2.5F, 0.25F, 0.25F, -2.5F, 0.25F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F); // Import
        gunModel[276].setRotationPoint(-17.5F, -54.5F, -2.75F);

        gunModel[277].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F); // Import
        gunModel[277].setRotationPoint(-17.5F, -54.25F, -3.25F);

        gunModel[278].addShapeBox(42F, 0F, -6F, 9, 5, 8, 0F, 0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F); // Import
        gunModel[278].setRotationPoint(-103F, -51.5F, 4F);

        gunModel[279].addShapeBox(42F, 0F, -6F, 55, 5, 9, 0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -3.5F, 0.5F, 0.0F, -3.5F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); // Import
        gunModel[279].setRotationPoint(-156F, -61.5F, 3F);

        gunModel[280].addShapeBox(42F, 0F, -6F, 2, 5, 9, 0F, 1.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -3.5F, 1.0F, 0.0F, -3.5F, 1.0F, 0.0F, 3.0F, -0.5F, 0.0F, 3.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[280].setRotationPoint(-158F, -61.5F, 3F);

        gunModel[281].addShapeBox(42F, 0F, -6F, 55, 5, 9, 0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F); // Import
        gunModel[281].setRotationPoint(-156F, -56.5F, 3F);

        gunModel[282].addShapeBox(42F, 0F, -6F, 2, 14, 12, 0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F); // Import
        gunModel[282].setRotationPoint(-158F, -56.5F, 0F);

        gunModel[283].addShapeBox(42F, 0F, -6F, 2, 5, 9, 0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -3.5F, 0.5F, 0.0F, -3.5F, 0.5F, 0.0F, 3.0F, -0.5F, 0.0F, 3.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); // Import
        gunModel[283].setRotationPoint(-160.5F, -61.5F, 3F);

        gunModel[284].addShapeBox(42F, 0F, -6F, 2, 39, 12, 0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F); // Import
        gunModel[284].setRotationPoint(-160.5F, -56.5F, 0F);

        gunModel[285].addShapeBox(42F, 0F, -6F, 4, 5, 9, 0F, 1.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -3.5F, 1.0F, 0.0F, -3.5F, 2.0F, 0.0F, 3.0F, -0.5F, 0.0F, 3.0F, -0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F); // Import
        gunModel[285].setRotationPoint(-164.5F, -61.5F, 3F);

        gunModel[286].addShapeBox(42F, 0F, -6F, 5, 39, 12, 0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F); // Import
        gunModel[286].setRotationPoint(-165.5F, -56.5F, 0F);

        gunModel[287].addShapeBox(42F, 0F, -6F, 2, 2, 12, 0F, 0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F); // Import
        gunModel[287].setRotationPoint(-160.5F, -17.5F, 0F);

        gunModel[288].addShapeBox(42F, 0F, -6F, 2, 1, 9, 0F, 0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F); // Import
        gunModel[288].setRotationPoint(-160.5F, -15.75F, 1.5F);

        gunModel[289].addShapeBox(42F, 0F, -6F, 6, 2, 12, 0F, 0.5F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.0F, -1.5F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F); // Import
        gunModel[289].setRotationPoint(-166F, -17.5F, 0F);

        gunModel[290].addShapeBox(42F, 0F, -6F, 5, 1, 9, 0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F); // Import
        gunModel[290].setRotationPoint(-166F, -15.75F, 1.5F);

        gunModel[291].addShapeBox(42F, 0F, -6F, 1, 33, 12, 0F, 1.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F); // Import
        gunModel[291].setRotationPoint(-158F, -42.5F, 0F);

        gunModel[292].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F); // Import
        gunModel[292].setRotationPoint(-157.5F, -42.25F, 0F);

        gunModel[293].addShapeBox(42F, 0F, -6F, 10, 7, 9, 0F, 0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); // Import
        gunModel[293].setRotationPoint(-156F, -51F, 3F);

        gunModel[294].addShapeBox(42F, 0F, -6F, 3, 5, 9, 0F, 0.5F, 0.75F, -0.5F, -0.5F, -2.25F, -0.5F, -0.5F, -2.25F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); // Import
        gunModel[294].setRotationPoint(-146F, -48F, 2F);

        gunModel[295].addShapeBox(42F, 0F, -6F, 4, 3, 9, 0F, 0.5F, -0.25F, -0.5F, -0.5F, -3.0F, -0.5F, -0.5F, -3.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); // Import
        gunModel[295].setRotationPoint(-143F, -47F, 3F);

        gunModel[296].addShapeBox(42F, 0F, -6F, 26, 1, 12, 0F, 1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F); // Import
        gunModel[296].setRotationPoint(-155.5F, -43.5F, 0F);

        gunModel[297].addShapeBox(42F, 0F, -6F, 26, 3, 12, 0F, 1.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, 1.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F); // Import
        gunModel[297].setRotationPoint(-156F, -12.5F, 0F);

        gunModel[298].addShapeBox(42F, 0F, -6F, 7, 30, 12, 0F, 1.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, 1.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F); // Import
        gunModel[298].setRotationPoint(-137F, -42.5F, 0F);

        gunModel[299].addShapeBox(42F, 0F, -6F, 2, 30, 12, 0F, 1.25F, -0.25F, -3.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 1.25F, -0.25F, -3.0F, 1.25F, 0.25F, -3.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 1.25F, 0.25F, -3.0F); // Import
        gunModel[299].setRotationPoint(-140F, -42.5F, 0F);

        gunModel[300].addShapeBox(42F, 0F, -6F, 2, 23, 12, 0F, -0.25F, -0.25F, 0.0F, 1.25F, -0.25F, -2.0F, 1.25F, -0.25F, -2.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 1.25F, 0.25F, -2.0F, 1.25F, 0.25F, -2.0F, -0.25F, 0.25F, 0.0F); // Import
        gunModel[300].setRotationPoint(-130.5F, -35.5F, 0F);

        gunModel[301].addShapeBox(42F, 0F, -6F, 1, 25, 8, 0F, -0.25F, -0.25F, 0.0F, 1.25F, -0.25F, -3.0F, 1.25F, -0.25F, -3.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 1.25F, 0.25F, -3.0F, 1.25F, 0.25F, -3.0F, -0.25F, 0.25F, 0.0F); // Import
        gunModel[301].setRotationPoint(-127.5F, -37.5F, 2F);

        gunModel[302].addShapeBox(42F, 0F, -6F, 2, 7, 12, 0F, 1.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, 1.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F); // Import
        gunModel[302].setRotationPoint(-129F, -42.5F, 0F);

        gunModel[303].addShapeBox(42F, 0F, -6F, 3, 4, 12, 0F, 1.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, 1.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 1.25F, 0.25F, 0.0F); // Import
        gunModel[303].setRotationPoint(-125F, -42.5F, 0F);

        gunModel[304].addShapeBox(42F, 0F, -6F, 1, 5, 12, 0F, 0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F); // Import
        gunModel[304].setRotationPoint(-127F, -42.5F, 0F);

        gunModel[305].addShapeBox(42F, 0F, -6F, 3, 2, 12, 0F, 1.25F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 1.25F, -0.25F, 0.0F, 1.25F, 0.25F, -1.0F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, -2.0F, 1.25F, 0.25F, -1.0F); // Import
        gunModel[305].setRotationPoint(-125F, -38.5F, 0F);

        gunModel[306].addShapeBox(42F, 0F, -6F, 1, 3, 12, 0F, 0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, -0.75F, -1.0F, -0.25F, -0.75F, -1.0F, 0.25F, 0.25F, 0.0F); // Import
        gunModel[306].setRotationPoint(-127F, -38.5F, 0F);

        gunModel[307].addShapeBox(42F, 0F, -6F, 6, 2, 12, 0F, 1.25F, 0.25F, 0.0F, 1.75F, 0.25F, 0.0F, 1.75F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F, 1.25F, -0.25F, -2.0F, 0.5F, -0.25F, -2.0F, 0.5F, -0.25F, -2.0F, 1.25F, -0.25F, -2.0F); // Import
        gunModel[307].setRotationPoint(-121F, -38.5F, 0F);

        gunModel[308].addShapeBox(42F, 0F, -6F, 9, 4, 12, 0F, 1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F); // Import
        gunModel[308].setRotationPoint(-121F, -42.5F, 0F);

        gunModel[309].addShapeBox(42F, 0F, -6F, 10, 2, 12, 0F, 2.25F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 2.25F, -0.25F, 0.0F, 1.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 1.75F, 0.25F, 0.0F); // Import
        gunModel[309].setRotationPoint(-156F, -9.5F, 0F);

        gunModel[310].addShapeBox(42F, 0F, -6F, 10, 2, 12, 0F, 1.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 1.75F, -0.25F, 0.0F, 0.5F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F); // Import
        gunModel[310].setRotationPoint(-156F, -7.5F, 0F);

        gunModel[311].addShapeBox(42F, 0F, -6F, 2, 10, 12, 0F, -0.25F, -0.25F, 0.0F, 1.25F, -0.25F, -2.0F, 1.25F, -0.25F, -2.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 1.25F, 0.0F, -2.0F, 1.25F, 0.0F, -2.0F, -0.25F, 0.25F, 0.0F); // Import
        gunModel[311].setRotationPoint(-130.5F, -12.5F, 0F);

        gunModel[312].addShapeBox(42F, 0F, -6F, 1, 10, 8, 0F, -0.25F, -0.25F, 0.0F, 1.25F, -0.25F, -3.0F, 1.25F, -0.25F, -3.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 1.25F, -0.25F, -3.0F, 1.25F, -0.25F, -3.0F, -0.25F, 0.0F, 0.0F); // Import
        gunModel[312].setRotationPoint(-127.5F, -12.5F, 2F);

        gunModel[313].addShapeBox(42F, 0F, -6F, 12, 2, 12, 0F, -0.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F); // Import
        gunModel[313].setRotationPoint(-143.5F, -4.5F, 0F);

        gunModel[314].addShapeBox(42F, 0F, -6F, 2, 2, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F); // Import
        gunModel[314].setRotationPoint(-145.25F, -4.25F, 0F);

        gunModel[315].addShapeBox(42F, 0F, -6F, 2, 2, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[315].setRotationPoint(-145.25F, -6.25F, 0F);

        gunModel[316].addShapeBox(42F, 0F, -6F, 2, 2, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F); // Import
        gunModel[316].setRotationPoint(-147.25F, -6.25F, 0F);

        gunModel[317].addShapeBox(42F, 0F, -6F, 9, 2, 9, 0F, -0.25F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F); // Import
        gunModel[317].setRotationPoint(-142.5F, -8.75F, 1.5F);

        gunModel[318].addShapeBox(42F, 0F, -6F, 1, 2, 9, 0F, -0.25F, -0.25F, -2.0F, 1.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, -0.25F, -0.25F, -2.0F, -0.25F, 0.0F, -2.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F); // Import
        gunModel[318].setRotationPoint(-144.5F, -8.75F, 1.5F);

        gunModel[319].addShapeBox(42F, 0F, -6F, 1, 2, 9, 0F, 1.25F, -0.25F, 0.0F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, -2.0F, 1.25F, -0.25F, 0.0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, 1.25F, 0.0F, 0.0F); // Import
        gunModel[319].setRotationPoint(-131.5F, -8.75F, 1.5F);

        gunModel[320].addShapeBox(42F, 0F, -6F, 9, 2, 9, 0F, -0.25F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F); // Import
        gunModel[320].setRotationPoint(-142.5F, -6.75F, 1.5F);

        gunModel[321].addShapeBox(42F, 0F, -6F, 1, 2, 9, 0F, -0.25F, -0.5F, -2.0F, 1.25F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, -0.25F, -0.5F, -2.0F, -0.25F, 0.25F, -2.0F, 1.25F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F, -0.25F, 0.25F, -2.0F); // Import
        gunModel[321].setRotationPoint(-144.5F, -6.75F, 1.5F);

        gunModel[322].addShapeBox(42F, 0F, -6F, 1, 2, 9, 0F, 1.25F, -0.5F, 0.0F, -0.25F, -0.5F, -2.0F, -0.25F, -0.5F, -2.0F, 1.25F, -0.5F, 0.0F, 1.25F, 0.25F, 0.0F, -0.25F, 0.25F, -2.0F, -0.25F, 0.25F, -2.0F, 1.25F, 0.25F, 0.0F); // Import
        gunModel[322].setRotationPoint(-131.5F, -6.75F, 1.5F);

        gunModel[323].addShapeBox(42F, 0F, -6F, 3, 7, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[323].setRotationPoint(-138.25F, -10.75F, 4F);

        gunModel[324].addShapeBox(42F, 0F, -6F, 3, 7, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[324].setRotationPoint(-134.25F, -10.75F, 4F);

        gunModel[325].addShapeBox(42F, 0F, -6F, 46, 5, 9, 0F, 0.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F, -7.5F, -1.5F, 0.0F, -7.5F, -1.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F); // Import
        gunModel[325].setRotationPoint(-146F, -61.5F, 4.5F);

        gunModel[326].addShapeBox(42F, 0F, -6F, 46, 7, 9, 0F, 0.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F); // Import
        gunModel[326].setRotationPoint(-146F, -56.5F, 8F);

        gunModel[327].addShapeBox(42F, 0F, -6F, 46, 1, 11, 0F, 0.5F, 0.0F, -4.5F, -1.5F, 0.0F, -4.5F, -1.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.5F, -1.5F, 0.0F, -4.5F, -1.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F); // Import
        gunModel[327].setRotationPoint(-146F, -62.5F, -1F);

        gunModel[328].addShapeBox(42F, 0F, -6F, 23, 3, 9, 0F, 0.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, -2.5F, -0.25F, -3.5F, -1.5F, -0.25F, -3.5F, -1.5F, -0.25F, -4.0F, -2.5F, -0.25F, -4.0F); // Import
        gunModel[328].setRotationPoint(-146F, -49.5F, 8F);

        gunModel[329].addShapeBox(42F, 0F, -6F, 24, 3, 9, 0F, -1.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, -1.5F, -0.25F, -3.5F, -2.5F, -0.25F, -3.5F, -2.5F, -0.25F, -4.0F, -1.5F, -0.25F, -4.0F); // Import
        gunModel[329].setRotationPoint(-126F, -49.5F, 8F);

        gunModel[330].addShapeBox(42F, 0F, -6F, 17, 3, 9, 0F, 0.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, -3.5F, -0.25F, -3.5F, -1.5F, -0.25F, -3.5F, -1.5F, -0.25F, -4.0F, -3.5F, -0.25F, -4.0F); // Import
        gunModel[330].setRotationPoint(-143F, -46.75F, 8F);

        gunModel[331].addShapeBox(42F, 0F, -6F, 24, 3, 9, 0F, -1.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, -1.5F, -0.25F, -3.5F, -3.5F, -0.25F, -3.5F, -3.5F, -0.25F, -4.0F, -1.5F, -0.25F, -4.0F); // Import
        gunModel[331].setRotationPoint(-129F, -46.75F, 8F);

        gunModel[332].addShapeBox(42F, 0F, -6F, 18, 2, 9, 0F, -1.5F, 0.25F, -4.0F, 0.5F, 0.25F, -4.0F, 0.5F, 0.25F, -4.0F, -1.5F, 0.25F, -4.0F, -1.5F, -0.25F, -3.5F, -6.5F, -0.25F, -3.5F, -6.5F, -0.25F, -4.0F, -1.5F, -0.25F, -4.0F); // Import
        gunModel[332].setRotationPoint(-127F, -43.75F, 8F);

        gunModel[333].addShapeBox(42F, 0F, -6F, 15, 2, 9, 0F, 0.5F, 0.25F, -4.0F, -1.5F, 0.25F, -4.0F, -1.5F, 0.25F, -4.0F, 0.5F, 0.25F, -4.0F, -6.5F, -0.25F, -3.5F, -1.5F, -0.25F, -3.5F, -1.5F, -0.25F, -4.0F, -6.5F, -0.25F, -4.0F); // Import
        gunModel[333].setRotationPoint(-139F, -43.75F, 8F);

        gunModel[334].addShapeBox(42F, 0F, -6F, 40, 7, 9, 0F, 0.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, -0.5F, -4.0F, -1.5F, -0.5F, -4.0F, -1.5F, -0.5F, -4.0F, 0.5F, -0.5F, -4.0F); // Import
        gunModel[334].setRotationPoint(-143F, -56.5F, 8.5F);

        gunModel[335].addShapeBox(42F, 0F, -6F, 40, 5, 9, 0F, 0.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F, -7.5F, -1.5F, 0.0F, -7.5F, -1.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F); // Import
        gunModel[335].setRotationPoint(-143F, -61.5F, 5F);

        gunModel[336].addShapeBox(42F, 0F, -6F, 40, 1, 11, 0F, 0.5F, 0.25F, -4.5F, -1.5F, 0.25F, -4.5F, -1.5F, 0.25F, -4.0F, 0.5F, 0.25F, -4.0F, 0.5F, 0.0F, -4.5F, -1.5F, 0.0F, -4.5F, -1.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F); // Import
        gunModel[336].setRotationPoint(-143F, -62.5F, -0.5F);

        gunModel[337].addShapeBox(42F, 0F, -6F, 18, 3, 9, 0F, 0.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, -1.5F, 0.0F, -3.75F, 0.5F, 0.0F, -3.75F, 0.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, -1.5F, 0.0F, -3.75F, 0.5F, 0.0F, -3.75F); // Import
        gunModel[337].setRotationPoint(-132F, -49F, 8.5F);

        gunModel[338].addShapeBox(42F, 0F, -6F, 18, 2, 9, 0F, 0.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, -1.5F, 0.0F, -3.75F, 0.5F, 0.0F, -3.75F, -2.5F, 0.5F, -4.0F, -4.5F, 0.5F, -4.0F, -4.5F, 0.5F, -3.75F, -2.5F, 0.5F, -3.75F); // Import
        gunModel[338].setRotationPoint(-132F, -46F, 8.5F);

        gunModel[339].addShapeBox(42F, 0F, -6F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[339].setRotationPoint(-130F, -48F, 13F);

        gunModel[340].addShapeBox(42F, 0F, -6F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[340].setRotationPoint(-119.5F, -48F, 13F);

        gunModel[341].addShapeBox(42F, 0F, -6F, 29, 5, 9, 0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F); // Import
        gunModel[341].setRotationPoint(-101F, -56.5F, 3F);

        gunModel[342].addShapeBox(42F, 0F, -6F, 5, 2, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[342].setRotationPoint(-137F, -2.5F, 3.5F);

        gunModel[343].addShapeBox(42F, 0F, -6F, 7, 1, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[343].setRotationPoint(-138F, -0.5F, 2.5F);

        gunModel[344].addShapeBox(42F, 0F, -6F, 6, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[344].setRotationPoint(-137.5F, 0.5F, 3F);

        gunModel[345].addShapeBox(42F, 0F, -6F, 7, 1, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[345].setRotationPoint(-138F, 1.5F, 2.5F);

        gunModel[346].addShapeBox(42F, 0F, -6F, 6, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[346].setRotationPoint(-137.5F, 2.5F, 3F);

        gunModel[347].addShapeBox(42F, 0F, -6F, 7, 1, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[347].setRotationPoint(-138F, 3.5F, 2.5F);

        gunModel[348].addShapeBox(42F, 0F, -6F, 12, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[348].setRotationPoint(-142F, 4.5F, 3F);

        gunModel[349].addShapeBox(42F, 0F, -6F, 2, 4, 6, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[349].setRotationPoint(-142F, 0.5F, 3F);

        gunModel[350].addShapeBox(42F, 0F, -6F, 2, 4, 6, 0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F); // Import
        gunModel[350].setRotationPoint(-148F, 0.5F, 3F);

        gunModel[351].addShapeBox(42F, 0F, -6F, 4, 1, 6, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[351].setRotationPoint(-146F, 0.5F, 3F);

        gunModel[352].addShapeBox(42F, 0F, -6F, 4, 1, 6, 0F, 1.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[352].setRotationPoint(-146F, 5.5F, 3F);

        gunModel[353].addShapeBox(42F, 0F, -6F, 1, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[353].setRotationPoint(-146F, 1.5F, 3F);

        gunModel[354].addShapeBox(42F, 0F, -6F, 1, 1, 6, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[354].setRotationPoint(-146F, 4F, 3F);

        gunModel[355].addShapeBox(42F, 0F, -6F, 1, 1, 6, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[355].setRotationPoint(-143F, 4F, 3F);

        gunModel[356].addShapeBox(42F, 0F, -6F, 1, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[356].setRotationPoint(-143F, 1.5F, 3F);

        gunModel[357].addShapeBox(42F, 0F, -6F, 4, 8, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[357].setRotationPoint(-136.5F, 6.5F, 4F);

        gunModel[358].addShapeBox(42F, 0F, -6F, 4, 1, 4, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[358].setRotationPoint(-140.5F, 14.5F, 0F);

        gunModel[359].addShapeBox(42F, 0F, -6F, 4, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[359].setRotationPoint(-140.5F, 14.5F, 4F);

        gunModel[360].addShapeBox(42F, 0F, -6F, 4, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[360].setRotationPoint(-140.5F, 14.5F, 8F);

        gunModel[361].addShapeBox(42F, 0F, -6F, 4, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[361].setRotationPoint(-136.5F, 14.5F, 0F);

        gunModel[362].addShapeBox(42F, 0F, -6F, 4, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[362].setRotationPoint(-136.5F, 14.5F, 4F);

        gunModel[363].addShapeBox(42F, 0F, -6F, 4, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[363].setRotationPoint(-136.5F, 14.5F, 8F);

        gunModel[364].addShapeBox(42F, 0F, -6F, 4, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[364].setRotationPoint(-132.5F, 14.5F, 0F);

        gunModel[365].addShapeBox(42F, 0F, -6F, 4, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[365].setRotationPoint(-132.5F, 14.5F, 4F);

        gunModel[366].addShapeBox(42F, 0F, -6F, 4, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[366].setRotationPoint(-132.5F, 14.5F, 8F);

        gunModel[367].addShapeBox(42F, 0F, -6F, 6, 3, 8, 0F, 1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.25F, 0.0F, -2.75F, 0.25F, 0.0F, -2.75F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F); // Import
        gunModel[367].setRotationPoint(-156.5F, -42.5F, 2F);

        gunModel[368].addShapeBox(42F, 0F, -6F, 6, 4, 8, 0F, 1.0F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, 0.25F, 0.0F, -2.75F, 0.25F, 0.0F, -2.75F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F); // Import
        gunModel[368].setRotationPoint(-156.5F, -39.5F, 2F);

        gunModel[369].addShapeBox(42F, 0F, -6F, 6, 2, 8, 0F, 1.0F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, 0.25F, -1.0F, -2.75F, 0.25F, -1.0F, -2.75F, 0.25F, -1.0F, 1.0F, 0.25F, -1.0F); // Import
        gunModel[369].setRotationPoint(-156.5F, -35.5F, 2F);

        gunModel[370].addShapeBox(42F, 0F, -6F, 3, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[370].setRotationPoint(-153F, -35.5F, 4F);

        gunModel[371].addShapeBox(42F, 0F, -6F, 3, 1, 4, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[371].setRotationPoint(-153F, -37.5F, 4F);

        gunModel[372].addShapeBox(42F, 0F, -6F, 3, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[372].setRotationPoint(-153F, -36.5F, 4F);

        gunModel[373].addShapeBox(42F, 0F, -6F, 3, 2, 4, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[373].setRotationPoint(-153F, -34.5F, 4F);

        gunModel[374].addShapeBox(42F, 0F, -6F, 3, 3, 4, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F); // Import
        gunModel[374].setRotationPoint(-153F, -32.5F, 4F);

        gunModel[375].addShapeBox(42F, 0F, -6F, 3, 10, 4, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[375].setRotationPoint(-155F, -29.5F, 4F);

        gunModel[376].addShapeBox(42F, 0F, -6F, 3, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[376].setRotationPoint(-154F, -37F, 5F);

        gunModel[377].addShapeBox(42F, 0F, -6F, 5, 12, 12, 0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F); // Import
        gunModel[377].setRotationPoint(-155.5F, -56.5F, 0F);

        gunModel[378].addShapeBox(42F, 0F, -6F, 3, 12, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F, 1.0F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F); // Import
        gunModel[378].setRotationPoint(-151F, -56.5F, 0F);

        gunModel[379].addShapeBox(42F, 0F, -6F, 34, 12, 12, 0F, 2.0F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F); // Import
        gunModel[379].setRotationPoint(-145.75F, -53.5F, 0F);

        gunModel[380].addShapeBox(42F, 0F, -6F, 35, 3, 12, 0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 2.0F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, 2.0F, 1.0F, 0.0F); // Import
        gunModel[380].setRotationPoint(-145.75F, -58.5F, 0F);

        gunModel[381].addShapeBox(42F, 0F, -6F, 19, 1, 8, 0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F); // Import
        gunModel[381].setRotationPoint(-129.5F, -43.5F, 0F);

        gunModel[382].addShapeBox(42F, 0F, -6F, 18, 9, 9, 0F, -3.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -9.0F, 0.5F, 0.0F, -9.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[382].setRotationPoint(-114.5F, -51.25F, 0F);

        gunModel[383].addShapeBox(42F, 0F, -6F, 35, 3, 4, 0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F); // Import
        gunModel[383].setRotationPoint(-110.5F, -51.5F, 0F);

        gunModel[384].addShapeBox(42F, 0F, -6F, 29, 5, 12, 0F, 0.5F, 0.0F, -3.5F, -0.5F, 0.0F, -3.5F, -0.5F, 0.0F, -3.5F, 0.5F, 0.0F, -3.5F, 0.5F, 0.0F, -3.5F, -0.5F, 0.0F, -3.5F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); // Import
        gunModel[384].setRotationPoint(-101F, -61.5F, 0F);

        gunModel[385].addShapeBox(42F, 0F, -6F, 84, 1, 1, 0F, 1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.5F, 0.55F, -1.0F, 0.5F, 0.55F, -1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F); // Import
        gunModel[385].setRotationPoint(-155.5F, -61.5F, 3F);

        gunModel[386].addShapeBox(42F, 0F, -6F, 3, 3, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[386].setRotationPoint(-75.5F, -54.25F, 1.75F);

        gunModel[387].addShapeBox(42F, 0F, -6F, 3, 3, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F); // Import
        gunModel[387].setRotationPoint(-75.5F, -51.25F, 0.25F);

        gunModel[388].addShapeBox(42F, 0F, -6F, 84, 1, 1, 0F, 1.0F, 0.5F, 0.55F, -1.0F, 0.5F, 0.55F, -1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F); // Import
        gunModel[388].setRotationPoint(-155.5F, -59.5F, 3F);

        gunModel[389].addShapeBox(42F, 0F, -6F, 2, 2, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[389].setRotationPoint(-143F, -48.5F, -0.5F);

        gunModel[390].addShapeBox(42F, 0F, -6F, 2, 2, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[390].setRotationPoint(-118F, -48.5F, -0.5F);

        gunModel[391].addShapeBox(42F, 0F, -6F, 8, 5, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[391].setRotationPoint(-133.5F, -50F, -0.5F);

        gunModel[392].addShapeBox(42F, 0F, -6F, 2, 5, 3, 0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F); // Import
        gunModel[392].setRotationPoint(-135.5F, -50F, -0.5F);

        gunModel[393].addShapeBox(42F, 0F, -6F, 2, 5, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[393].setRotationPoint(-125.5F, -50F, -0.5F);

        gunModel[394].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[394].setRotationPoint(-135F, -48F, -0.75F);

        gunModel[395].addShapeBox(42F, 0F, -6F, 1, 1, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[395].setRotationPoint(-125F, -48F, -0.75F);

        gunModel[396].addShapeBox(42F, 0F, -6F, 35, 15, 7, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F); // Import
        gunModel[396].setRotationPoint(-4.25F, -40F, 2.5F);

        gunModel[397].addShapeBox(42F, 0F, -6F, 11, 2, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[397].setRotationPoint(-5.25F, -23.75F, 2F);

        gunModel[398].addShapeBox(42F, 0F, -6F, 4, 11, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[398].setRotationPoint(1.75F, -21.75F, 2F);

        gunModel[399].addShapeBox(42F, 0F, -6F, 1, 6, 8, 0F, 0.0F, 1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[399].setRotationPoint(5.75F, -16.75F, 2F);

        gunModel[400].addShapeBox(42F, 0F, -6F, 1, 6, 8, 0F, 0.5F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); // Import
        gunModel[400].setRotationPoint(16.75F, -16.75F, 2F);

        gunModel[401].addShapeBox(42F, 0F, -6F, 9, 1, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[401].setRotationPoint(7.25F, -16.25F, 2F);

        gunModel[402].addShapeBox(42F, 0F, -6F, 4, 11, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[402].setRotationPoint(17.75F, -21.75F, 2F);

        gunModel[403].addShapeBox(42F, 0F, -6F, 14, 2, 7, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[403].setRotationPoint(17.75F, -23.75F, 3F);

        gunModel[404].addShapeBox(42F, 0F, -6F, 7, 11, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[404].setRotationPoint(-5.25F, -21.75F, 2.5F);

        gunModel[405].addShapeBox(42F, 0F, -6F, 10, 5, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[405].setRotationPoint(6.75F, -15.75F, 2.5F);

        gunModel[406].addShapeBox(42F, 0F, -6F, 10, 11, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[406].setRotationPoint(21.75F, -21.75F, 2.5F);

        gunModel[407].addShapeBox(42F, 0F, -6F, 12, 8, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[407].setRotationPoint(5.75F, -23.75F, 2.5F);

        gunModel[408].addShapeBox(42F, 0F, -6F, 9, 2, 7, 0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[408].setRotationPoint(7.25F, -23.25F, 3F);

        gunModel[409].addShapeBox(42F, 0F, -6F, 9, 4, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[409].setRotationPoint(7.25F, -21.25F, 3F);

        gunModel[410].addShapeBox(42F, 0F, -6F, 8, 1, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[410].setRotationPoint(7.75F, -21.25F, 3.35F);

        gunModel[411].addShapeBox(42F, 0F, -6F, 8, 1, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[411].setRotationPoint(7.75F, -19.25F, 3.35F);

        gunModel[412].addShapeBox(42F, 0F, -6F, 9, 2, 1, 0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[412].setRotationPoint(7.25F, -23.25F, 2F);

        gunModel[413].addShapeBox(42F, 0F, -6F, 9, 4, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[413].setRotationPoint(7.25F, -21.25F, 2F);

        gunModel[414].addShapeBox(42F, 0F, -6F, 8, 1, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[414].setRotationPoint(7.75F, -21.25F, 1.65F);

        gunModel[415].addShapeBox(42F, 0F, -6F, 8, 1, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[415].setRotationPoint(7.75F, -19.25F, 1.65F);

        gunModel[416].addShapeBox(42F, 0F, -6F, 18, 8, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[416].setRotationPoint(75.25F, -70F, 1.5F);

        gunModel[417].addShapeBox(42F, 0F, -6F, 4, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F); // Import
        gunModel[417].setRotationPoint(75.25F, -70F, 10.5F);

        gunModel[418].addShapeBox(42F, 0F, -6F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[418].setRotationPoint(75.25F, -68F, 12.5F);

        gunModel[419].addShapeBox(42F, 0F, -6F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[419].setRotationPoint(75.25F, -68F, 11.5F);

        gunModel[420].addShapeBox(42F, 0F, -6F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[420].setRotationPoint(75.25F, -67F, 11.5F);

        gunModel[421].addShapeBox(42F, 0F, -6F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[421].setRotationPoint(75.25F, -67F, 12.5F);

        gunModel[422].addShapeBox(42F, 0F, -6F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[422].setRotationPoint(75.25F, -66F, 12F);

        gunModel[423].addShapeBox(42F, 0F, -6F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[423].setRotationPoint(75.25F, -66F, 13F);

        gunModel[424].addShapeBox(42F, 0F, -6F, 4, 1, 1, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[424].setRotationPoint(75.25F, -68F, 10.5F);

        gunModel[425].addShapeBox(42F, 0F, -6F, 4, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[425].setRotationPoint(75.25F, -70F, 0.5F);

        gunModel[426].addShapeBox(42F, 0F, -6F, 4, 1, 1, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[426].setRotationPoint(75.25F, -68F, -1.5F);

        gunModel[427].addShapeBox(42F, 0F, -6F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[427].setRotationPoint(75.25F, -68F, -0.5F);

        gunModel[428].addShapeBox(42F, 0F, -6F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[428].setRotationPoint(75.25F, -68F, 0.5F);

        gunModel[429].addShapeBox(42F, 0F, -6F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[429].setRotationPoint(75.25F, -67F, -0.5F);

        gunModel[430].addShapeBox(42F, 0F, -6F, 4, 1, 1, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[430].setRotationPoint(75.25F, -67F, -2F);

        gunModel[431].addShapeBox(42F, 0F, -6F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[431].setRotationPoint(75.25F, -66F, -1F);

        gunModel[432].addShapeBox(42F, 0F, -6F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[432].setRotationPoint(75.25F, -66F, -2F);

        gunModel[433].addShapeBox(42F, 0F, -6F, 1, 1, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[433].setRotationPoint(88.25F, -68F, 3F);

        gunModel[434].addShapeBox(42F, 0F, -6F, 11, 3, 9, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F); // Import
        gunModel[434].setRotationPoint(93.75F, -70F, 1.5F);

        gunModel[435].addShapeBox(42F, 0F, -6F, 11, 4, 9, 0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[435].setRotationPoint(93.25F, -66F, 1.5F);

        gunModel[436].addShapeBox(42F, 0F, -6F, 11, 4, 2, 0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[436].setRotationPoint(93.75F, -67F, 13.5F);

        gunModel[437].addShapeBox(42F, 0F, -6F, 11, 2, 2, 0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.75F, -2.0F, 0.0F, 0.75F, -2.0F, 0.0F, -0.75F, -2.0F, 0.0F, -0.75F); // Import
        gunModel[437].setRotationPoint(93.75F, -63F, 15.75F);

        gunModel[438].addShapeBox(42F, 0F, -6F, 11, 4, 2, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[438].setRotationPoint(93.75F, -67F, -3.5F);

        gunModel[439].addShapeBox(42F, 0F, -6F, 11, 2, 2, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, -2.0F, 0.0F, -0.75F, -2.0F, 0.0F, -0.75F, -2.0F, 0.0F, 0.75F, -2.0F, 0.0F, 0.75F); // Import
        gunModel[439].setRotationPoint(93.75F, -63F, -5.75F);

        gunModel[440].addShapeBox(42F, 0F, -6F, 11, 1, 8, 0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[440].setRotationPoint(93.25F, -67F, 2F);

        gunModel[441].addShapeBox(42F, 0F, -6F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[441].setRotationPoint(75.25F, -65F, 12.5F);

        gunModel[442].addShapeBox(42F, 0F, -6F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[442].setRotationPoint(75.25F, -65F, 13.5F);

        gunModel[443].addShapeBox(42F, 0F, -6F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[443].setRotationPoint(75.25F, -64F, 13F);

        gunModel[444].addShapeBox(42F, 0F, -6F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[444].setRotationPoint(75.25F, -64F, 14F);

        gunModel[445].addShapeBox(42F, 0F, -6F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[445].setRotationPoint(75.25F, -65F, -1.5F);

        gunModel[446].addShapeBox(42F, 0F, -6F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[446].setRotationPoint(75.25F, -65F, -2.5F);

        gunModel[447].addShapeBox(42F, 0F, -6F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[447].setRotationPoint(75.25F, -64F, -2F);

        gunModel[448].addShapeBox(42F, 0F, -6F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[448].setRotationPoint(75.25F, -64F, -3F);

        gunModel[449].addShapeBox(42F, 0F, -6F, 3, 2, 9, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[449].setRotationPoint(94.75F, 9F, 26.75F);

        gunModel[450].addShapeBox(42F, 0F, -6F, 3, 2, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[450].setRotationPoint(97.75F, 9F, 26.75F);

        gunModel[451].addShapeBox(42F, 0F, -6F, 3, 2, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[451].setRotationPoint(100.75F, 9F, 26.75F);

        gunModel[452].addShapeBox(42F, 0F, -6F, 1, 68, 3, 0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -17.75F, 0.25F, 0.0F, -17.75F, 0.25F, 0.0F, 18.25F, 0.25F, 0.0F, 18.25F); // Import
        gunModel[452].setRotationPoint(98.75F, -59.25F, 12.25F);

        gunModel[453].addShapeBox(42F, 0F, -6F, 1, 68, 3, 0F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -17.75F, 0.25F, 0.0F, -19.0F, 0.25F, 0.0F, 17.0F, 0.0F, 0.0F, 18.25F); // Import
        gunModel[453].setRotationPoint(100F, -59.25F, 12.25F);

        gunModel[454].addShapeBox(42F, 0F, -6F, 1, 68, 3, 0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -19.0F, 0.0F, 0.0F, -17.75F, 0.0F, 0.0F, 18.25F, 0.25F, 0.0F, 17.0F); // Import
        gunModel[454].setRotationPoint(97.5F, -59.25F, 12.25F);

        gunModel[455].addShapeBox(42F, 0F, -6F, 2, 7, 5, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, 1.75F, -0.25F, -0.25F, 1.75F); // Import
        gunModel[455].setRotationPoint(98.25F, -66F, 9.25F);

        gunModel[456].addShapeBox(42F, 0F, -6F, 2, 7, 5, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -3.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 1.75F); // Import
        gunModel[456].setRotationPoint(99.75F, -66F, 9.25F);

        gunModel[457].addShapeBox(42F, 0F, -6F, 2, 7, 5, 0F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -3.75F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, 1.75F, -0.25F, -0.25F, 0.25F); // Import
        gunModel[457].setRotationPoint(96.75F, -66F, 9.25F);

        gunModel[458].addShapeBox(42F, 0F, -6F, 2, 7, 5, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 1.5F); // Import
        gunModel[458].setRotationPoint(98.25F, -39F, 16.75F);

        gunModel[459].addShapeBox(42F, 0F, -6F, 2, 7, 5, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, -3.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 1.5F); // Import
        gunModel[459].setRotationPoint(99.75F, -39F, 16.75F);

        gunModel[460].addShapeBox(42F, 0F, -6F, 2, 7, 5, 0F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -3.5F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 0.0F); // Import
        gunModel[460].setRotationPoint(96.75F, -39F, 16.75F);

        gunModel[461].addShapeBox(42F, 0F, -6F, 2, 7, 5, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 1.5F); // Import
        gunModel[461].setRotationPoint(98.25F, 2.25F, 27.5F);

        gunModel[462].addShapeBox(42F, 0F, -6F, 2, 7, 5, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, -3.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 1.5F); // Import
        gunModel[462].setRotationPoint(99.75F, 2.25F, 27.5F);

        gunModel[463].addShapeBox(42F, 0F, -6F, 2, 7, 5, 0F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -3.5F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 0.0F); // Import
        gunModel[463].setRotationPoint(96.75F, 2.25F, 27.5F);

        gunModel[464].addShapeBox(42F, 0F, -6F, 2, 7, 2, 0F, -0.25F, -5.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -5.25F, 1.25F, -0.25F, -0.25F, -1.5F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 2.0F); // Import
        gunModel[464].setRotationPoint(95.25F, 2.25F, 29F);

        gunModel[465].addShapeBox(42F, 0F, -6F, 2, 4, 1, 0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[465].setRotationPoint(95.25F, 3F, 30F);

        gunModel[466].addShapeBox(42F, 0F, -6F, 2, 7, 5, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1.75F, -0.25F, -0.25F, 1.75F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2.25F); // Import
        gunModel[466].setRotationPoint(98.25F, -66F, -2.25F);

        gunModel[467].addShapeBox(42F, 0F, -6F, 2, 7, 5, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -3.75F, -0.25F, -0.25F, -2.25F); // Import
        gunModel[467].setRotationPoint(99.75F, -66F, -2.25F);

        gunModel[468].addShapeBox(42F, 0F, -6F, 2, 7, 5, 0F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 1.75F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -3.75F); // Import
        gunModel[468].setRotationPoint(96.75F, -66F, -2.25F);

        gunModel[469].addShapeBox(42F, 0F, -6F, 1, 68, 3, 0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 18.25F, 0.25F, 0.0F, 18.25F, 0.25F, 0.0F, -17.75F, 0.25F, 0.0F, -17.75F); // Import
        gunModel[469].setRotationPoint(98.75F, -59.25F, -3.25F);

        gunModel[470].addShapeBox(42F, 0F, -6F, 1, 68, 3, 0F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 18.25F, 0.25F, 0.0F, 17.0F, 0.25F, 0.0F, -19.0F, 0.0F, 0.0F, -17.75F); // Import
        gunModel[470].setRotationPoint(100F, -59.25F, -3.25F);

        gunModel[471].addShapeBox(42F, 0F, -6F, 1, 68, 3, 0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 17.0F, 0.0F, 0.0F, 18.25F, 0.0F, 0.0F, -17.75F, 0.25F, 0.0F, -19.0F); // Import
        gunModel[471].setRotationPoint(97.5F, -59.25F, -3.25F);

        gunModel[472].addShapeBox(42F, 0F, -6F, 2, 7, 5, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, -2.0F); // Import
        gunModel[472].setRotationPoint(98.25F, -39F, -9.75F);

        gunModel[473].addShapeBox(42F, 0F, -6F, 2, 7, 5, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -3.5F, -0.25F, -0.25F, -2.0F); // Import
        gunModel[473].setRotationPoint(99.75F, -39F, -9.75F);

        gunModel[474].addShapeBox(42F, 0F, -6F, 2, 7, 5, 0F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, -3.5F); // Import
        gunModel[474].setRotationPoint(96.75F, -39F, -9.75F);

        gunModel[475].addShapeBox(42F, 0F, -6F, 3, 2, 9, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[475].setRotationPoint(94.75F, 9F, -23.75F);

        gunModel[476].addShapeBox(42F, 0F, -6F, 3, 2, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[476].setRotationPoint(97.75F, 9F, -23.75F);

        gunModel[477].addShapeBox(42F, 0F, -6F, 3, 2, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[477].setRotationPoint(100.75F, 9F, -23.75F);

        gunModel[478].addShapeBox(42F, 0F, -6F, 2, 7, 5, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, -2.0F); // Import
        gunModel[478].setRotationPoint(98.25F, 2.25F, -20.5F);

        gunModel[479].addShapeBox(42F, 0F, -6F, 2, 7, 5, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -3.5F, -0.25F, -0.25F, -2.0F); // Import
        gunModel[479].setRotationPoint(99.75F, 2.25F, -20.5F);

        gunModel[480].addShapeBox(42F, 0F, -6F, 2, 7, 5, 0F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, -3.5F); // Import
        gunModel[480].setRotationPoint(96.75F, 2.25F, -20.5F);

        gunModel[481].addShapeBox(42F, 0F, -6F, 2, 7, 2, 0F, -0.25F, -5.25F, 1.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -5.25F, -0.75F, -0.25F, -0.25F, 2.0F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, -2.0F, -0.25F, -0.25F, -1.5F); // Import
        gunModel[481].setRotationPoint(95.25F, 2.25F, -19F);

        gunModel[482].addShapeBox(42F, 0F, -6F, 2, 4, 1, 0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[482].setRotationPoint(95.25F, 3F, -19F);

        gunModel[483].addShapeBox(42F, 0F, -6F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[483].setRotationPoint(103F, -69F, 12F);

        gunModel[484].addShapeBox(42F, 0F, -6F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[484].setRotationPoint(94.5F, -69F, 12F);

        gunModel[485].addShapeBox(42F, 0F, -6F, 1, 1, 1, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[485].setRotationPoint(94.5F, -69F, -1F);

        gunModel[486].addShapeBox(42F, 0F, -6F, 1, 1, 1, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[486].setRotationPoint(103F, -69F, -1F);

        gunModel[487].addShapeBox(42F, 0F, -6F, 9, 1, 6, 0F, 0.5F, 0.0F, -1.0F, -0.5F, 0F, -1.0F, -0.5F, 0F, -1.0F, 0.5F, 0F, -1.0F, 0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, 0.5F, 0F, 0.0F); // Import
        gunModel[487].setRotationPoint(58.25F, -64.5F, 3F);

        gunModel[488].addShapeBox(42F, 0F, -6F, 9, 1, 6, 0F, 0.5F, 0.0F, -1.0F, -0.5F, 0F, -1.0F, -0.5F, 0F, -1.0F, 0.5F, 0F, -1.0F, 0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, 0.5F, 0F, 0.0F); // Import
        gunModel[488].setRotationPoint(68.25F, -64.5F, 3F);

        gunModel[489].addShapeBox(42F, 0F, -6F, 9, 1, 6, 0F, 0.5F, 0.0F, -1.0F, -0.5F, 0F, -1.0F, -0.5F, 0F, -1.0F, 0.5F, 0F, -1.0F, 0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, 0.5F, 0F, 0.0F); // Import
        gunModel[489].setRotationPoint(78.25F, -64.5F, 3F);

        gunModel[490].addShapeBox(42F, 0F, -6F, 9, 1, 6, 0F, 0.5F, 0.0F, -1.0F, -0.5F, 0F, -1.0F, -0.5F, 0F, -1.0F, 0.5F, 0F, -1.0F, 0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, 0.5F, 0F, 0.0F); // Import
        gunModel[490].setRotationPoint(88.25F, -64.5F, 3F);

        gunModel[491].addShapeBox(42F, 0F, -6F, 9, 1, 6, 0F, 0.5F, 0.0F, -1.0F, -0.5F, 0F, -1.0F, -0.5F, 0F, -1.0F, 0.5F, 0F, -1.0F, 0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, 0.5F, 0F, 0.0F); // Import
        gunModel[491].setRotationPoint(98.25F, -64.5F, 3F);

        gunModel[492].addShapeBox(42F, 0F, -6F, 9, 1, 6, 0F, 0.5F, 0.0F, -1.0F, -0.5F, 0F, -1.0F, -0.5F, 0F, -1.0F, 0.5F, 0F, -1.0F, 0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, 0.5F, 0F, 0.0F); // Import
        gunModel[492].setRotationPoint(108.25F, -64.5F, 3F);

        gunModel[493].addShapeBox(42F, 0F, -6F, 9, 1, 6, 0F, 0.5F, 0.0F, -1.0F, -0.5F, 0F, -1.0F, -0.5F, 0F, -1.0F, 0.5F, 0F, -1.0F, 0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, 0.5F, 0F, 0.0F); // Import
        gunModel[493].setRotationPoint(118.25F, -64.5F, 3F);

        gunModel[494].addShapeBox(42F, 0F, -6F, 9, 1, 6, 0F, 0.5F, 0.0F, -1.0F, -0.5F, 0F, -1.0F, -0.5F, 0F, -1.0F, 0.5F, 0F, -1.0F, 0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, 0.5F, 0F, 0.0F); // Import
        gunModel[494].setRotationPoint(128.25F, -64.5F, 3F);

        gunModel[495].addShapeBox(42F, 0F, -6F, 93, 1, 6, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0.5F, 0F, -1F); // Import
        gunModel[495].setRotationPoint(48.25F, -63.5F, 3F);

        gunModel[496].addShapeBox(42F, 0F, -6F, 110, 1, 6, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, 0.5F, 0F, -1F); // Import
        gunModel[496].setRotationPoint(-62.75F, -63.5F, 3F);

        gunModel[497].addShapeBox(42F, 0F, -6F, 9, 1, 6, 0F, 0.5F, 0.0F, -1.0F, -0.5F, 0F, -1.0F, -0.5F, 0F, -1.0F, 0.5F, 0F, -1.0F, 0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, 0.5F, 0F, 0.0F); // Import
        gunModel[497].setRotationPoint(-62.75F, -64.5F, 3F);

        gunModel[498].addShapeBox(42F, 0F, -6F, 9, 1, 6, 0F, 0.5F, 0.0F, -1.0F, -0.5F, 0F, -1.0F, -0.5F, 0F, -1.0F, 0.5F, 0F, -1.0F, 0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, 0.5F, 0F, 0.0F); // Import
        gunModel[498].setRotationPoint(-52.75F, -64.5F, 3F);

        gunModel[499].addShapeBox(42F, 0F, -6F, 9, 1, 6, 0F, 0.5F, 0.0F, -1.0F, -0.5F, 0F, -1.0F, -0.5F, 0F, -1.0F, 0.5F, 0F, -1.0F, 0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, 0.5F, 0F, 0.0F); // Import
        gunModel[499].setRotationPoint(-42.75F, -64.5F, 3F);
    }

    private void initgunModel_2() {
        gunModel[500] = new ModelRendererTurbo(this, 673, 273, textureX, textureY); // Import
        gunModel[501] = new ModelRendererTurbo(this, 705, 273, textureX, textureY); // Import
        gunModel[502] = new ModelRendererTurbo(this, 769, 273, textureX, textureY); // Import
        gunModel[503] = new ModelRendererTurbo(this, 865, 273, textureX, textureY); // Import
        gunModel[504] = new ModelRendererTurbo(this, 937, 273, textureX, textureY); // Import
        gunModel[505] = new ModelRendererTurbo(this, 969, 273, textureX, textureY); // Import
        gunModel[506] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Import
        gunModel[507] = new ModelRendererTurbo(this, 33, 281, textureX, textureY); // Import
        gunModel[508] = new ModelRendererTurbo(this, 769, 281, textureX, textureY); // Box 594
        gunModel[509] = new ModelRendererTurbo(this, 977, 49, textureX, textureY); // Import
        gunModel[510] = new ModelRendererTurbo(this, 289, 289, textureX, textureY); // Box 594
        gunModel[511] = new ModelRendererTurbo(this, 769, 297, textureX, textureY); // Box 594
        gunModel[512] = new ModelRendererTurbo(this, 65, 281, textureX, textureY); // Import
        gunModel[513] = new ModelRendererTurbo(this, 161, 281, textureX, textureY); // Import
        gunModel[514] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Import
        gunModel[515] = new ModelRendererTurbo(this, 33, 289, textureX, textureY); // Import
        gunModel[516] = new ModelRendererTurbo(this, 529, 289, textureX, textureY); // Import
        gunModel[517] = new ModelRendererTurbo(this, 617, 289, textureX, textureY); // Import
        gunModel[518] = new ModelRendererTurbo(this, 57, 289, textureX, textureY); // Import
        gunModel[519] = new ModelRendererTurbo(this, 161, 289, textureX, textureY); // Import
        gunModel[520] = new ModelRendererTurbo(this, 713, 281, textureX, textureY); // Import
        gunModel[521] = new ModelRendererTurbo(this, 569, 169, textureX, textureY); // Import Import
        gunModel[522] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Import Import
        gunModel[523] = new ModelRendererTurbo(this, 521, 297, textureX, textureY); // Import Import
        gunModel[524] = new ModelRendererTurbo(this, 553, 297, textureX, textureY); // Import Import
        gunModel[525] = new ModelRendererTurbo(this, 585, 297, textureX, textureY); // Import Import
        gunModel[526] = new ModelRendererTurbo(this, 617, 297, textureX, textureY); // Import Import
        gunModel[527] = new ModelRendererTurbo(this, 1001, 265, textureX, textureY); // Import Import
        gunModel[528] = new ModelRendererTurbo(this, 697, 289, textureX, textureY); // Import Import
        gunModel[529] = new ModelRendererTurbo(this, 41, 297, textureX, textureY); // Import Import
        gunModel[530] = new ModelRendererTurbo(this, 1001, 289, textureX, textureY); // Import Import
        gunModel[531] = new ModelRendererTurbo(this, 217, 297, textureX, textureY); // Import Import
        gunModel[532] = new ModelRendererTurbo(this, 649, 297, textureX, textureY); // Import Import
        gunModel[533] = new ModelRendererTurbo(this, 673, 297, textureX, textureY); // Import Import
        gunModel[534] = new ModelRendererTurbo(this, 713, 297, textureX, textureY); // Import Import
        gunModel[535] = new ModelRendererTurbo(this, 57, 305, textureX, textureY); // Import Import
        gunModel[536] = new ModelRendererTurbo(this, 81, 305, textureX, textureY); // Import Import
        gunModel[537] = new ModelRendererTurbo(this, 161, 305, textureX, textureY); // Import
        gunModel[538] = new ModelRendererTurbo(this, 193, 305, textureX, textureY); // Import
        gunModel[539] = new ModelRendererTurbo(this, 289, 305, textureX, textureY); // Import
        gunModel[540] = new ModelRendererTurbo(this, 329, 305, textureX, textureY); // Import
        gunModel[541] = new ModelRendererTurbo(this, 361, 305, textureX, textureY); // Import
        gunModel[542] = new ModelRendererTurbo(this, 393, 305, textureX, textureY); // Import Import
        gunModel[543] = new ModelRendererTurbo(this, 433, 305, textureX, textureY); // Import Import
        gunModel[544] = new ModelRendererTurbo(this, 473, 305, textureX, textureY); // Import Import
        gunModel[545] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Import Import
        gunModel[546] = new ModelRendererTurbo(this, 505, 313, textureX, textureY); // Import Import
        gunModel[547] = new ModelRendererTurbo(this, 545, 313, textureX, textureY); // Import Import
        gunModel[548] = new ModelRendererTurbo(this, 585, 313, textureX, textureY); // Import Import
        gunModel[549] = new ModelRendererTurbo(this, 689, 305, textureX, textureY); // Box 594
        gunModel[550] = new ModelRendererTurbo(this, 657, 313, textureX, textureY); // Box 594
        gunModel[551] = new ModelRendererTurbo(this, 713, 313, textureX, textureY); // Box 594
        gunModel[552] = new ModelRendererTurbo(this, 97, 313, textureX, textureY); // Box 594
        gunModel[553] = new ModelRendererTurbo(this, 257, 313, textureX, textureY); // Box 594
        gunModel[554] = new ModelRendererTurbo(this, 753, 313, textureX, textureY); // Box 594
        gunModel[555] = new ModelRendererTurbo(this, 1001, 305, textureX, textureY); // Box 594
        gunModel[556] = new ModelRendererTurbo(this, 217, 313, textureX, textureY); // Box 594
        gunModel[557] = new ModelRendererTurbo(this, 785, 313, textureX, textureY); // Box 594
        gunModel[558] = new ModelRendererTurbo(this, 809, 313, textureX, textureY); // Box 594
        gunModel[559] = new ModelRendererTurbo(this, 833, 313, textureX, textureY); // Box 594
        gunModel[560] = new ModelRendererTurbo(this, 857, 313, textureX, textureY); // Box 594
        gunModel[561] = new ModelRendererTurbo(this, 881, 313, textureX, textureY); // Box 594
        gunModel[562] = new ModelRendererTurbo(this, 913, 313, textureX, textureY); // Box 594
        gunModel[563] = new ModelRendererTurbo(this, 945, 313, textureX, textureY); // Box 594
        gunModel[564] = new ModelRendererTurbo(this, 977, 313, textureX, textureY); // Box 594

        gunModel[500].addShapeBox(42F, 0F, -6F, 9, 1, 6, 0F, 0.5F, 0.0F, -1.0F, -0.5F, 0F, -1.0F, -0.5F, 0F, -1.0F, 0.5F, 0F, -1.0F, 0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, 0.5F, 0F, 0.0F); // Import
        gunModel[500].setRotationPoint(-32.75F, -64.5F, 3F);

        gunModel[501].addShapeBox(42F, 0F, -6F, 9, 1, 6, 0F, 0.5F, 0.0F, -1.0F, -0.5F, 0F, -1.0F, -0.5F, 0F, -1.0F, 0.5F, 0F, -1.0F, 0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, 0.5F, 0F, 0.0F); // Import
        gunModel[501].setRotationPoint(-22.75F, -64.5F, 3F);

        gunModel[502].addShapeBox(42F, 0F, -6F, 9, 1, 6, 0F, 0.5F, 0.0F, -1.0F, -0.5F, 0F, -1.0F, -0.5F, 0F, -1.0F, 0.5F, 0F, -1.0F, 0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, 0.5F, 0F, 0.0F); // Import
        gunModel[502].setRotationPoint(-12.75F, -64.5F, 3F);

        gunModel[503].addShapeBox(42F, 0F, -6F, 9, 1, 6, 0F, 0.5F, 0.0F, -1.0F, -0.5F, 0F, -1.0F, -0.5F, 0F, -1.0F, 0.5F, 0F, -1.0F, 0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, 0.5F, 0F, 0.0F); // Import
        gunModel[503].setRotationPoint(-2.75F, -64.5F, 3F);

        gunModel[504].addShapeBox(42F, 0F, -6F, 9, 1, 6, 0F, 0.5F, 0.0F, -1.0F, -0.5F, 0F, -1.0F, -0.5F, 0F, -1.0F, 0.5F, 0F, -1.0F, 0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, 0.5F, 0F, 0.0F); // Import
        gunModel[504].setRotationPoint(7.25F, -64.5F, 3F);

        gunModel[505].addShapeBox(42F, 0F, -6F, 9, 1, 6, 0F, 0.5F, 0.0F, -1.0F, -0.5F, 0F, -1.0F, -0.5F, 0F, -1.0F, 0.5F, 0F, -1.0F, 0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, 0.5F, 0F, 0.0F); // Import
        gunModel[505].setRotationPoint(17.25F, -64.5F, 3F);

        gunModel[506].addShapeBox(42F, 0F, -6F, 9, 1, 6, 0F, 0.5F, 0.0F, -1.0F, -0.5F, 0F, -1.0F, -0.5F, 0F, -1.0F, 0.5F, 0F, -1.0F, 0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, 0.5F, 0F, 0.0F); // Import
        gunModel[506].setRotationPoint(27.25F, -64.5F, 3F);

        gunModel[507].addShapeBox(42F, 0F, -6F, 9, 1, 6, 0F, 0.5F, 0.0F, -1.0F, -0.5F, 0F, -1.0F, -0.5F, 0F, -1.0F, 0.5F, 0F, -1.0F, 0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, 0.5F, 0F, 0.0F); // Import
        gunModel[507].setRotationPoint(37.25F, -64.5F, 3F);

        gunModel[508].addShapeBox(0F, 0F, 0F, 112, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
        gunModel[508].setRotationPoint(81F, -55F, -3F);

        gunModel[509].addShapeBox(42F, 0F, -6F, 6, 1, 1, 0F, 0F, -1F, 0F, 2F, -1F, 0F, 1.4F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.5F, 0F, 0F, 0.5F); // Import
        gunModel[509].setRotationPoint(140.25F, -47F, 1.5F);

        gunModel[510].addShapeBox(0F, 0F, 0F, 112, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
        gunModel[510].setRotationPoint(81F, -57F, -3F);

        gunModel[511].addShapeBox(0F, 0F, 0F, 112, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 594
        gunModel[511].setRotationPoint(81F, -53F, -3F);

        gunModel[512].addShapeBox(42F, 0F, -6F, 9, 1, 6, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, -1F); // Import
        gunModel[512].setRotationPoint(49.25F, -37.5F, 3F);

        gunModel[513].addShapeBox(42F, 0F, -6F, 9, 1, 6, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, -1F); // Import
        gunModel[513].setRotationPoint(59.25F, -37.5F, 3F);

        gunModel[514].addShapeBox(42F, 0F, -6F, 9, 1, 6, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, -1F); // Import
        gunModel[514].setRotationPoint(69.25F, -37.5F, 3F);

        gunModel[515].addShapeBox(42F, 0F, -6F, 9, 1, 6, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, -1F); // Import
        gunModel[515].setRotationPoint(79.25F, -37.5F, 3F);

        gunModel[516].addShapeBox(42F, 0F, -6F, 39, 1, 6, 0F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import
        gunModel[516].setRotationPoint(49.25F, -38.5F, 3F);

        gunModel[517].addShapeBox(42F, 0F, -6F, 39, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[517].setRotationPoint(48.75F, -39.5F, 4F);

        gunModel[518].addShapeBox(42F, 0F, -6F, 17, 2, 8, 0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[518].setRotationPoint(-38.5F, -40.5F, 1.5F);

        gunModel[519].addShapeBox(42F, 0F, -6F, 19, 2, 10, 0F, 0.0F, 0.5F, 0.0F, 0F, 0.5F, 0.0F, 0F, 0.5F, 0.0F, 0F, 0.5F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F); // Import
        gunModel[519].setRotationPoint(-39.5F, -39.5F, 0.5F);

        gunModel[520].addShapeBox(42F, 0F, -6F, 3, 2, 10, 0F, 0.0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, -1F, -2F); // Import
        gunModel[520].setRotationPoint(-42.5F, -39.5F, 0.5F);

        gunModel[521].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F, 3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import Import
        gunModel[521].setRotationPoint(5F, -38F, -4.5F);

        gunModel[522].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 0.0F, -0.5F, 0.0F); // Import Import
        gunModel[522].setRotationPoint(7F, -37.5F, -4.5F);

        gunModel[523].addShapeBox(0F, 0F, 0F, 6, 5, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 2.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, 0.0F, 0.0F); // Import Import
        gunModel[523].setRotationPoint(7F, -31F, -4.5F);

        gunModel[524].addShapeBox(0F, 0F, 0F, 6, 7, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 3.0F, 0.0F, 0.0F); // Import Import
        gunModel[524].setRotationPoint(5F, -26F, -4.5F);

        gunModel[525].addShapeBox(0F, 0F, 0F, 6, 7, 8, 0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F, 1.0F, 0.0F); // Import Import
        gunModel[525].setRotationPoint(2F, -19F, -4.5F);

        gunModel[526].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[526].setRotationPoint(0F, -11F, -4.5F);

        gunModel[527].addShapeBox(0F, 0F, 0F, 3, 5, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -3F, -2.0F, 0.0F, -3F, -2.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, 2.0F, 0.0F, 0.0F); // Import Import
        gunModel[527].setRotationPoint(13F, -29F, -4.5F);

        gunModel[528].addShapeBox(0F, 0F, 0F, 3, 6, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 1.0F, -2.0F, -2.0F, 1.0F, -2.0F, 2.0F, 0.0F, 0.0F); // Import Import
        gunModel[528].setRotationPoint(11F, -24F, -4.5F);

        gunModel[529].addShapeBox(0F, 0F, 0F, 3, 7, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F); // Import Import
        gunModel[529].setRotationPoint(9F, -18F, -4.5F);

        gunModel[530].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[530].setRotationPoint(8F, -11F, -4.5F);

        gunModel[531].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F, 2F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2F, 3.0F, 0.0F, 0.0F, -4.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -4.0F, -2.0F); // Import Import
        gunModel[531].setRotationPoint(4F, -35F, -4.5F);

        gunModel[532].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F); // Import Import
        gunModel[532].setRotationPoint(4F, -35F, -4.5F);

        gunModel[533].addShapeBox(0F, 0F, 0F, 4, 5, 8, 0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, 2.0F, 1.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, -2.0F); // Import Import
        gunModel[533].setRotationPoint(3F, -31F, -4.5F);

        gunModel[534].addShapeBox(0F, 0F, 0F, 4, 7, 8, 0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -2.0F, 2.0F, -1.0F, -2.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.0F, -1.0F, -2.0F); // Import Import
        gunModel[534].setRotationPoint(1F, -26F, -4.5F);

        gunModel[535].addShapeBox(0F, 0F, 0F, 3, 9, 8, 0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -2.0F, 2.0F, -2.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, -2.0F, -2.0F); // Import Import
        gunModel[535].setRotationPoint(-1F, -20F, -4.5F);

        gunModel[536].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -2.0F); // Import Import
        gunModel[536].setRotationPoint(-3F, -13F, -4.5F);

        gunModel[537].addShapeBox(42F, 0F, -6F, 3, 1, 10, 0F, 0.0F, -0.5F, 0.0F, 0F, 0.5F, 0.0F, 0F, 0.5F, 0.0F, 0F, -0.5F, 0.0F, 0F, 1F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 1F, 0.0F); // Import
        gunModel[537].setRotationPoint(-36.5F, -27F, 0.5F);

        gunModel[538].addShapeBox(42F, 0F, -6F, 3, 1, 10, 0F, 0.0F, -2.5F, -1.5F, 0F, 0.5F, 0.0F, 0F, 0.5F, 0.0F, 0F, -2.5F, -1.5F, 0F, 3F, -1F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 3F, -1F); // Import
        gunModel[538].setRotationPoint(-39.5F, -26F, 0.5F);

        gunModel[539].addShapeBox(42F, 0F, -6F, 14, 1, 10, 0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[539].setRotationPoint(-23.5F, -27F, 0.5F);

        gunModel[540].addShapeBox(42F, 0F, -6F, 6, 1, 12, 0F, 0.0F, 0.5F, 0.0F, 0F, 0.5F, 0.0F, 0F, 0.5F, 0.0F, 0F, 0.5F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F); // Import
        gunModel[540].setRotationPoint(-29.5F, -27F, -0.5F);

        gunModel[541].addShapeBox(42F, 0F, -6F, 3, 1, 10, 0F, 0.3F, -2.5F, -3F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0.3F, -2.5F, -3F, 0.75F, 3F, -3F, 0F, 0.0F, -1F, 0F, 0.0F, -1F, 0.75F, 3F, -3F); // Import
        gunModel[541].setRotationPoint(-42.5F, -23F, 0.5F);

        gunModel[542].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[542].setRotationPoint(7F, -29F, -4.5F);

        gunModel[543].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1F, 0.5F, -1F, -1F, 0.5F, -1F, 0.0F, 0.5F, 0.0F); // Import Import
        gunModel[543].setRotationPoint(7F, -32.5F, -4.5F);

        gunModel[544].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F, 0.0F, 0.5F, 0.0F, -1F, 0.5F, -1F, -1F, 0.5F, -1F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[544].setRotationPoint(7F, -35F, -4.5F);

        gunModel[545].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F, 0.0F, -0.5F, 0.0F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[545].setRotationPoint(7F, -31F, -4.5F);

        gunModel[546].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Import
        gunModel[546].setRotationPoint(7F, -33.5F, -4.5F);

        gunModel[547].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F); // Import Import
        gunModel[547].setRotationPoint(7F, -36F, -4.5F);

        gunModel[548].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F); // Import Import
        gunModel[548].setRotationPoint(7F, -31F, -4.5F);

        gunModel[549].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
        gunModel[549].setRotationPoint(196F, -55.5F, -4.5F);

        gunModel[550].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
        gunModel[550].setRotationPoint(196F, -58.5F, -4.5F);

        gunModel[551].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 594
        gunModel[551].setRotationPoint(196F, -52.5F, -4.5F);

        gunModel[552].addShapeBox(0F, 0F, 0F, 3, 3, 9, 0F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F); // Box 594
        gunModel[552].setRotationPoint(193F, -55.5F, -4.5F);

        gunModel[553].addShapeBox(0F, 0F, 0F, 3, 3, 9, 0F, 0F, -1.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1.5F, -3.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F); // Box 594
        gunModel[553].setRotationPoint(193F, -58.5F, -4.5F);

        gunModel[554].addShapeBox(0F, 0F, 0F, 3, 3, 9, 0F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, -1.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1.5F, -3.5F); // Box 594
        gunModel[554].setRotationPoint(193F, -52.5F, -4.5F);

        gunModel[555].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
        gunModel[555].setRotationPoint(203F, -55.5F, -4.5F);

        gunModel[556].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
        gunModel[556].setRotationPoint(203F, -58.5F, -4.5F);

        gunModel[557].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 594
        gunModel[557].setRotationPoint(203F, -52.5F, -4.5F);

        gunModel[558].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
        gunModel[558].setRotationPoint(208F, -55.5F, -4.5F);

        gunModel[559].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
        gunModel[559].setRotationPoint(208F, -58.5F, -4.5F);

        gunModel[560].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 594
        gunModel[560].setRotationPoint(208F, -52.5F, -4.5F);

        gunModel[561].addShapeBox(0F, 0F, 0F, 3, 3, 9, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 594
        gunModel[561].setRotationPoint(200F, -58.5F, -4.5F);

        gunModel[562].addShapeBox(0F, 0F, 0F, 3, 3, 9, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 594
        gunModel[562].setRotationPoint(205F, -58.5F, -4.5F);

        gunModel[563].addShapeBox(0F, 0F, 0F, 3, 3, 9, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 594
        gunModel[563].setRotationPoint(200F, -52.5F, -4.5F);

        gunModel[564].addShapeBox(0F, 0F, 0F, 3, 3, 9, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 594
        gunModel[564].setRotationPoint(205F, -52.5F, -4.5F);
    }

    private void initdefaultScopeModel_1() {
        defaultScopeModel[0] = new ModelRendererTurbo(this, 321, 169, textureX, textureY); // Import
        defaultScopeModel[1] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Import
        defaultScopeModel[2] = new ModelRendererTurbo(this, 537, 65, textureX, textureY); // Import
        defaultScopeModel[3] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Import
        defaultScopeModel[4] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import
        defaultScopeModel[5] = new ModelRendererTurbo(this, 577, 65, textureX, textureY); // Import
        defaultScopeModel[6] = new ModelRendererTurbo(this, 889, 97, textureX, textureY); // Import
        defaultScopeModel[7] = new ModelRendererTurbo(this, 657, 17, textureX, textureY); // Import
        defaultScopeModel[8] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Import
        defaultScopeModel[9] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Import
        defaultScopeModel[10] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Import
        defaultScopeModel[11] = new ModelRendererTurbo(this, 625, 313, textureX, textureY); // Import
        defaultScopeModel[12] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Import
        defaultScopeModel[13] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Import
        defaultScopeModel[14] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Import
        defaultScopeModel[15] = new ModelRendererTurbo(this, 617, 65, textureX, textureY); // Import
        defaultScopeModel[16] = new ModelRendererTurbo(this, 921, 97, textureX, textureY); // Import
        defaultScopeModel[17] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Import
        defaultScopeModel[18] = new ModelRendererTurbo(this, 849, 65, textureX, textureY); // Import
        defaultScopeModel[19] = new ModelRendererTurbo(this, 961, 81, textureX, textureY); // Import
        defaultScopeModel[20] = new ModelRendererTurbo(this, 969, 81, textureX, textureY); // Import
        defaultScopeModel[21] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Import
        defaultScopeModel[22] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Import
        defaultScopeModel[23] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Import
        defaultScopeModel[24] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Import
        defaultScopeModel[25] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Import
        defaultScopeModel[26] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Import
        defaultScopeModel[27] = new ModelRendererTurbo(this, 521, 89, textureX, textureY); // Import
        defaultScopeModel[28] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Import
        defaultScopeModel[29] = new ModelRendererTurbo(this, 785, 33, textureX, textureY); // Import
        defaultScopeModel[30] = new ModelRendererTurbo(this, 817, 33, textureX, textureY); // Import
        defaultScopeModel[31] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Import
        defaultScopeModel[32] = new ModelRendererTurbo(this, 993, 33, textureX, textureY); // Import
        defaultScopeModel[33] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Import
        defaultScopeModel[34] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import
        defaultScopeModel[35] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Import
        defaultScopeModel[36] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Import
        defaultScopeModel[37] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Import
        defaultScopeModel[38] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Import
        defaultScopeModel[39] = new ModelRendererTurbo(this, 521, 41, textureX, textureY); // Import
        defaultScopeModel[40] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import

        defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[0].setRotationPoint(-19F, -65.5F, -3F);

        defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[1].setRotationPoint(-19F, -65.5F, -4F);

        defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[2].setRotationPoint(-19F, -65.5F, 3F);

        defaultScopeModel[3].addShapeBox(1F, 0F, 0F, 2, 2, 2, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        defaultScopeModel[3].setRotationPoint(-19F, -67.5F, -4F);

        defaultScopeModel[4].addShapeBox(1F, 0F, 0F, 2, 2, 2, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[4].setRotationPoint(-19F, -67.5F, 2F);

        defaultScopeModel[5].addShapeBox(1F, 0F, 0F, 2, 2, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[5].setRotationPoint(-19F, -68.5F, -2.5F);

        defaultScopeModel[6].addShapeBox(1F, 0F, 0F, 3, 4, 5, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[6].setRotationPoint(-20F, -72.5F, -2.5F);

        defaultScopeModel[7].addShapeBox(1F, 0F, 0F, 1, 1, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[7].setRotationPoint(-19F, -73F, -2.5F);

        defaultScopeModel[8].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[8].setRotationPoint(-19F, -77F, -0.5F);

        defaultScopeModel[9].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[9].setRotationPoint(-19F, -75F, 1.5F);

        defaultScopeModel[10].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[10].setRotationPoint(-19F, -75F, -2.5F);

        defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[11].setRotationPoint(159F, -65.5F, -4F);

        defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[12].setRotationPoint(159F, -64.5F, 3F);

        defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[13].setRotationPoint(159F, -64.5F, -4F);

        defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[14].setRotationPoint(161F, -67.5F, -3F);

        defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[15].setRotationPoint(161F, -68.5F, -2F);

        defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[16].setRotationPoint(161F, -72.5F, -2F);

        defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[17].setRotationPoint(161.5F, -75F, -0.5F);

        defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[18].setRotationPoint(-17F, -64.5F, -6.5F);

        defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[19].setRotationPoint(160F, -64.5F, -6.5F);

        defaultScopeModel[20].addShapeBox(1F, 0F, 0F, 2, 1, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[20].setRotationPoint(-19F, -66.5F, -2.5F);

        defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[21].setRotationPoint(161F, -67.5F, 2F);

        defaultScopeModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[22].setRotationPoint(161F, -68.5F, -3F);

        defaultScopeModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[23].setRotationPoint(161F, -68.5F, 2F);

        defaultScopeModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[24].setRotationPoint(160F, -65.5F, -7F);

        defaultScopeModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[25].setRotationPoint(160F, -63.5F, -7F);

        defaultScopeModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[26].setRotationPoint(-17F, -65.5F, -7F);

        defaultScopeModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[27].setRotationPoint(-17F, -63.5F, -7F);

        defaultScopeModel[28].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, -0.6F, -0.2F, 0.0F, -0.6F, -0.2F); // Import
        defaultScopeModel[28].setRotationPoint(-19.01F, -75F, 1.59999999999999F);

        defaultScopeModel[29].addShapeBox(1F, 0F, 0F, 1, 2, 2, 0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        defaultScopeModel[29].setRotationPoint(-19F, -77F, -2.5F);

        defaultScopeModel[30].addShapeBox(1F, 0F, 0F, 1, 2, 2, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        defaultScopeModel[30].setRotationPoint(-19F, -77F, 0.5F);

        defaultScopeModel[31].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        defaultScopeModel[31].setRotationPoint(-19F, -74F, -2.5F);

        defaultScopeModel[32].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[32].setRotationPoint(-19F, -74F, 1.5F);

        defaultScopeModel[33].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, -0.6F, -0.2F, 0.0F, -0.6F, -0.2F); // Import
        defaultScopeModel[33].setRotationPoint(-19.01F, -75F, -2.40000000000001F);

        defaultScopeModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[34].setRotationPoint(163F, -71.5F, -2F);

        defaultScopeModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1F, 0.25F, 0.0F, -1F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0F, -0.5F, 0.0F, 0F, -0.5F); // Import
        defaultScopeModel[35].setRotationPoint(161.5F, -74.5F, 1.5F);

        defaultScopeModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import
        defaultScopeModel[36].setRotationPoint(161.5F, -75F, 1.5F);

        defaultScopeModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import
        defaultScopeModel[37].setRotationPoint(161.5F, -77F, 1.5F);

        defaultScopeModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import
        defaultScopeModel[38].setRotationPoint(161.5F, -74.5F, -2.5F);

        defaultScopeModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Import
        defaultScopeModel[39].setRotationPoint(161.5F, -75F, -2.5F);

        defaultScopeModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import
        defaultScopeModel[40].setRotationPoint(161.5F, -77F, -2.5F);
    }

    private void initammoModel_1() {
        ammoModel[0] = new ModelRendererTurbo(this, 369, 257, textureX, textureY); // Import
        ammoModel[1] = new ModelRendererTurbo(this, 481, 257, textureX, textureY); // Import
        ammoModel[2] = new ModelRendererTurbo(this, 321, 257, textureX, textureY); // Import
        ammoModel[3] = new ModelRendererTurbo(this, 521, 257, textureX, textureY); // Import
        ammoModel[4] = new ModelRendererTurbo(this, 545, 257, textureX, textureY); // Import
        ammoModel[5] = new ModelRendererTurbo(this, 569, 257, textureX, textureY); // Import
        ammoModel[6] = new ModelRendererTurbo(this, 801, 257, textureX, textureY); // Import
        ammoModel[7] = new ModelRendererTurbo(this, 865, 257, textureX, textureY); // Import
        ammoModel[8] = new ModelRendererTurbo(this, 913, 257, textureX, textureY); // Import
        ammoModel[9] = new ModelRendererTurbo(this, 161, 265, textureX, textureY); // Import
        ammoModel[10] = new ModelRendererTurbo(this, 201, 265, textureX, textureY); // Import
        ammoModel[11] = new ModelRendererTurbo(this, 601, 265, textureX, textureY); // Import
        ammoModel[12] = new ModelRendererTurbo(this, 641, 265, textureX, textureY); // Import
        ammoModel[13] = new ModelRendererTurbo(this, 833, 265, textureX, textureY); // Import
        ammoModel[14] = new ModelRendererTurbo(this, 81, 265, textureX, textureY); // Import
        ammoModel[15] = new ModelRendererTurbo(this, 457, 265, textureX, textureY); // Import

        ammoModel[0].addShapeBox(42F, 0F, -6F, 35, 15, 7, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F); // Import
        ammoModel[0].setRotationPoint(-104.25F, -45.5F, 2.5F);

        ammoModel[1].addShapeBox(42F, 0F, -6F, 11, 2, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        ammoModel[1].setRotationPoint(-105.25F, -29.25F, 2F);

        ammoModel[2].addShapeBox(42F, 0F, -6F, 4, 11, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        ammoModel[2].setRotationPoint(-98.25F, -27.25F, 2F);

        ammoModel[3].addShapeBox(42F, 0F, -6F, 1, 6, 8, 0F, 0.0F, 1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        ammoModel[3].setRotationPoint(-94.25F, -22.25F, 2F);

        ammoModel[4].addShapeBox(42F, 0F, -6F, 1, 6, 8, 0F, 0.5F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); // Import
        ammoModel[4].setRotationPoint(-83.25F, -22.25F, 2F);

        ammoModel[5].addShapeBox(42F, 0F, -6F, 9, 1, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        ammoModel[5].setRotationPoint(-92.75F, -21.75F, 2F);

        ammoModel[6].addShapeBox(42F, 0F, -6F, 4, 11, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        ammoModel[6].setRotationPoint(-82.25F, -27.25F, 2F);

        ammoModel[7].addShapeBox(42F, 0F, -6F, 14, 2, 7, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        ammoModel[7].setRotationPoint(-82.25F, -29.25F, 3F);

        ammoModel[8].addShapeBox(42F, 0F, -6F, 7, 11, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        ammoModel[8].setRotationPoint(-105.25F, -27.25F, 2.5F);

        ammoModel[9].addShapeBox(42F, 0F, -6F, 10, 5, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        ammoModel[9].setRotationPoint(-93.25F, -21.25F, 2.5F);

        ammoModel[10].addShapeBox(42F, 0F, -6F, 10, 11, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        ammoModel[10].setRotationPoint(-78.25F, -27.25F, 2.5F);

        ammoModel[11].addShapeBox(42F, 0F, -6F, 12, 8, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        ammoModel[11].setRotationPoint(-94.25F, -29.25F, 2.5F);

        ammoModel[12].addShapeBox(42F, 0F, -6F, 9, 2, 7, 0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        ammoModel[12].setRotationPoint(-92.75F, -28.75F, 3F);

        ammoModel[13].addShapeBox(42F, 0F, -6F, 9, 4, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        ammoModel[13].setRotationPoint(-92.75F, -26.75F, 3F);

        ammoModel[14].addShapeBox(42F, 0F, -6F, 8, 1, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        ammoModel[14].setRotationPoint(-92.25F, -26.75F, 3.35F);

        ammoModel[15].addShapeBox(42F, 0F, -6F, 8, 1, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        ammoModel[15].setRotationPoint(-92.25F, -24.75F, 3.35F);
    }

    private void initpumpModel_1() {
        pumpModel[0] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Import
        pumpModel[1] = new ModelRendererTurbo(this, 945, 265, textureX, textureY); // Import
        pumpModel[2] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Import
        pumpModel[3] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import
        pumpModel[4] = new ModelRendererTurbo(this, 657, 169, textureX, textureY); // Import
        pumpModel[5] = new ModelRendererTurbo(this, 801, 169, textureX, textureY); // Import
        pumpModel[6] = new ModelRendererTurbo(this, 513, 57, textureX, textureY); // Import
        pumpModel[7] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Import
        pumpModel[8] = new ModelRendererTurbo(this, 657, 73, textureX, textureY); // Import
        pumpModel[9] = new ModelRendererTurbo(this, 537, 41, textureX, textureY); // Import
        pumpModel[10] = new ModelRendererTurbo(this, 665, 9, textureX, textureY); // Import
        pumpModel[11] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Import
        pumpModel[12] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Import
        pumpModel[13] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Import
        pumpModel[14] = new ModelRendererTurbo(this, 969, 57, textureX, textureY); // Import
        pumpModel[15] = new ModelRendererTurbo(this, 721, 33, textureX, textureY); // Import
        pumpModel[16] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Import
        pumpModel[17] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Import
        pumpModel[18] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Import
        pumpModel[19] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Import
        pumpModel[20] = new ModelRendererTurbo(this, 577, 81, textureX, textureY); // Import
        pumpModel[21] = new ModelRendererTurbo(this, 673, 81, textureX, textureY); // Import
        pumpModel[22] = new ModelRendererTurbo(this, 761, 81, textureX, textureY); // Import

        pumpModel[0].addShapeBox(42F, 0F, -6F, 25, 3, 4, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[0].setRotationPoint(-115.5F, -60F, 0.25F);

        pumpModel[1].addShapeBox(42F, 0F, -6F, 25, 3, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[1].setRotationPoint(-115.5F, -57F, 0.25F);

        pumpModel[2].addShapeBox(42F, 0F, -6F, 25, 3, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[2].setRotationPoint(-115.5F, -54F, 0.25F);

        pumpModel[3].addShapeBox(42F, 0F, -6F, 12, 3, 4, 0F, 0.0F, -0.25F, -3.25F, 0.0F, -0.25F, -3.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F); // Import
        pumpModel[3].setRotationPoint(-90.5F, -59.5F, 0.25F);

        pumpModel[4].addShapeBox(42F, 0F, -6F, 12, 3, 4, 0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F); // Import
        pumpModel[4].setRotationPoint(-90.5F, -57F, 0.25F);

        pumpModel[5].addShapeBox(42F, 0F, -6F, 12, 3, 4, 0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -3.25F, 0.0F, -0.25F, -3.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F); // Import
        pumpModel[5].setRotationPoint(-90.5F, -54.5F, 0.25F);

        pumpModel[6].addShapeBox(42F, 0F, -6F, 6, 3, 4, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[6].setRotationPoint(-78.5F, -60F, 0.25F);

        pumpModel[7].addShapeBox(42F, 0F, -6F, 6, 3, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[7].setRotationPoint(-78.5F, -57F, 0.25F);

        pumpModel[8].addShapeBox(42F, 0F, -6F, 6, 3, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[8].setRotationPoint(-78.5F, -54F, 0.25F);

        pumpModel[9].addShapeBox(42F, 0F, -6F, 3, 3, 3, 0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[9].setRotationPoint(-75.5F, -55.75F, -2.75F);

        pumpModel[10].addShapeBox(42F, 0F, -6F, 3, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[10].setRotationPoint(-75.5F, -52.75F, -2.75F);

        pumpModel[11].addShapeBox(42F, 0F, -6F, 3, 3, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F); // Import
        pumpModel[11].setRotationPoint(-75.5F, -51.75F, -2.75F);

        pumpModel[12].addShapeBox(42F, 0F, -6F, 3, 3, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[12].setRotationPoint(-75.5F, -55.75F, 0.25F);

        pumpModel[13].addShapeBox(42F, 0F, -6F, 3, 2, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F); // Import
        pumpModel[13].setRotationPoint(-75.5F, -52.75F, 0.25F);

        pumpModel[14].addShapeBox(42F, 0F, -6F, 5, 2, 2, 0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[14].setRotationPoint(-76.5F, -57.68F, -3.75F);
        pumpModel[14].rotateAngleX = 0.57595867F;

        pumpModel[15].addShapeBox(42F, 0F, -6F, 5, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[15].setRotationPoint(-76.5F, -56F, -2.65F);
        pumpModel[15].rotateAngleX = 0.57595867F;

        pumpModel[16].addShapeBox(42F, 0F, -6F, 5, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import
        pumpModel[16].setRotationPoint(-76.5F, -55.17F, -2.1F);
        pumpModel[16].rotateAngleX = 0.57595867F;

        pumpModel[17].addShapeBox(42F, 0F, -6F, 5, 2, 5, 0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[17].setRotationPoint(-76.5F, -54.95F, -7.91F);
        pumpModel[17].rotateAngleX = 0.57595867F;

        pumpModel[18].addShapeBox(42F, 0F, -6F, 5, 1, 5, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[18].setRotationPoint(-76.48F, -53.28F, -6.83F);
        pumpModel[18].rotateAngleX = 0.57595867F;

        pumpModel[19].addShapeBox(42F, 0F, -6F, 5, 2, 5, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import
        pumpModel[19].setRotationPoint(-76.5F, -52.45F, -6.3F);
        pumpModel[19].rotateAngleX = 0.57595867F;

        pumpModel[20].addShapeBox(42F, 0F, -6F, 5, 1, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        pumpModel[20].setRotationPoint(-76.5F, -50.55F, -11.03F);
        pumpModel[20].rotateAngleX = 0.57595867F;

        pumpModel[21].addShapeBox(42F, 0F, -6F, 5, 2, 5, 0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        pumpModel[21].setRotationPoint(-76.5F, -52.25F, -12.1F);
        pumpModel[21].rotateAngleX = 0.57595867F;

        pumpModel[22].addShapeBox(42F, 0F, -6F, 5, 2, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F); // Import
        pumpModel[22].setRotationPoint(-76.5F, -49.72F, -10.48F);
        pumpModel[22].rotateAngleX = 0.57595867F;
    }
}