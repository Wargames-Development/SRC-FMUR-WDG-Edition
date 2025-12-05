//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SPAS12
// Model Creator: 
// Created on: 10.08.2023 - 11:20:01
// Last changed on: 10.08.2023 - 11:20:01

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelSPAS12 extends ModelGun //Same as Filename
{
    int textureX = 1024;
    int textureY = 1024;

    public ModelSPAS12() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[510];
        defaultScopeModel = new ModelRendererTurbo[18];
        ammoModel = new ModelRendererTurbo[3];
        pumpModel = new ModelRendererTurbo[271];

        initgunModel_1();
        initgunModel_2();
        initdefaultScopeModel_1();
        initammoModel_1();
        initpumpModel_1();

        barrelAttachPoint = new Vector3f(345F / 16F, 63.5F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(287F / 16F, 57F / 16F, -4.8F / 16F);
        scopeAttachPoint = new Vector3f(77F / 16F, 75F / 16F, 0F / 16F);

        gunSlideDistance = 0.0F;
        animationType = EnumAnimationType.SHOTGUN;
        tiltGunTime = 0.1F;
        unloadClipTime = 0.0F;
        loadClipTime = 0.8F;
        untiltGunTime = 0.1F;
        endLoadedAmmoDistance = 10.0F;
        lefthandPump = true;
        hasFlash = true;
        hasArms = true;

        //leftArmPos = new Vector3f(0.5F, -0.03F, -0.45F);
        leftArmPos = new Vector3f(0.4F, -0.03F, -0.55F);
        leftArmRot = new Vector3f(80.0F, 56.0F, 10.0F);
        leftArmReloadPos = new Vector3f(-0.15F, -0.6F, -0.04F);
        leftArmReloadRot = new Vector3f(80.0F, 50.0F, 0.0F);
        leftArmScale = new Vector3f(0.75D, 1.75D, 0.75D);

        rightArmPos = new Vector3f(0.2F, -0.52F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmReloadPos = new Vector3f(0.2F, -0.52F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);

        rightHandAmmo = false;
        leftHandAmmo = true;
        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);
        casingAttachPoint = new Vector3f(1.4F, 1.45F, 0.0F);
        casingAnimDistance = new Vector3f(0.0F, 3.0F, 7.75F);
        casingAnimSpread = new Vector3f(3.0F, 5.0F, 3.0F);
        casingAnimTime = 6;
        casingRotateVector = new Vector3f(0.1F, 0.0F, 0.1F);
        caseScale = 0.25F;
        casingDelay = 0;
        flashScale = 0.6F;
        muzzleFlashPoint = new Vector3f(2.1F, 0.6F, 0.0F);
        numBulletsInReloadAnimation = 9.0F;
        pumpDelayAfterReload = 150;
        pumpDelay = 7;
        pumpTime = 7;
        pumpHandleDistance = 3F;
        gunOffset = -0.5F;
        zoomOffset = 0.5F;
        zoomOffsetY = -0.1F;
        crouchZoom = -0.05F;
        translateAll(-10.0F, 5.0F, 0.0F);
        ShakeDistance = 1.0F;
        flipAll();
    }

    private void initgunModel_1() {
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import
        gunModel[1] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import
        gunModel[2] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import
        gunModel[3] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import
        gunModel[4] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Import
        gunModel[5] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Import
        gunModel[6] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Import
        gunModel[7] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import
        gunModel[8] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import
        gunModel[9] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import
        gunModel[10] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Import
        gunModel[11] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Import
        gunModel[12] = new ModelRendererTurbo(this, 713, 9, textureX, textureY); // Import
        gunModel[13] = new ModelRendererTurbo(this, 913, 9, textureX, textureY); // Import
        gunModel[14] = new ModelRendererTurbo(this, 961, 9, textureX, textureY); // Import
        gunModel[15] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Import
        gunModel[16] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Import
        gunModel[17] = new ModelRendererTurbo(this, 545, 33, textureX, textureY); // Import
        gunModel[18] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import
        gunModel[19] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import
        gunModel[20] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Import
        gunModel[21] = new ModelRendererTurbo(this, 889, 33, textureX, textureY); // Import
        gunModel[22] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Import
        gunModel[23] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Import
        gunModel[24] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Import
        gunModel[25] = new ModelRendererTurbo(this, 961, 33, textureX, textureY); // Import
        gunModel[26] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Import
        gunModel[27] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Import
        gunModel[28] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Import
        gunModel[29] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Import
        gunModel[30] = new ModelRendererTurbo(this, 937, 49, textureX, textureY); // Import
        gunModel[31] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Import
        gunModel[32] = new ModelRendererTurbo(this, 529, 57, textureX, textureY); // Import
        gunModel[33] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Import
        gunModel[34] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); // Import
        gunModel[35] = new ModelRendererTurbo(this, 985, 49, textureX, textureY); // Import
        gunModel[36] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Import
        gunModel[37] = new ModelRendererTurbo(this, 577, 57, textureX, textureY); // Import
        gunModel[38] = new ModelRendererTurbo(this, 617, 57, textureX, textureY); // Import
        gunModel[39] = new ModelRendererTurbo(this, 657, 57, textureX, textureY); // Import
        gunModel[40] = new ModelRendererTurbo(this, 697, 57, textureX, textureY); // Import
        gunModel[41] = new ModelRendererTurbo(this, 737, 57, textureX, textureY); // Import
        gunModel[42] = new ModelRendererTurbo(this, 777, 57, textureX, textureY); // Import
        gunModel[43] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Import
        gunModel[44] = new ModelRendererTurbo(this, 857, 57, textureX, textureY); // Import
        gunModel[45] = new ModelRendererTurbo(this, 897, 57, textureX, textureY); // Import
        gunModel[46] = new ModelRendererTurbo(this, 961, 57, textureX, textureY); // Import
        gunModel[47] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import
        gunModel[48] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Import
        gunModel[49] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Import
        gunModel[50] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Import
        gunModel[51] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Import
        gunModel[52] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Import
        gunModel[53] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Import
        gunModel[54] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Import
        gunModel[55] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Import
        gunModel[56] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Import
        gunModel[57] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Import
        gunModel[58] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Import
        gunModel[59] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Import
        gunModel[60] = new ModelRendererTurbo(this, 921, 73, textureX, textureY); // Import
        gunModel[61] = new ModelRendererTurbo(this, 985, 73, textureX, textureY); // Import
        gunModel[62] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Import
        gunModel[63] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Import
        gunModel[64] = new ModelRendererTurbo(this, 529, 81, textureX, textureY); // Import
        gunModel[65] = new ModelRendererTurbo(this, 569, 81, textureX, textureY); // Import
        gunModel[66] = new ModelRendererTurbo(this, 617, 81, textureX, textureY); // Import
        gunModel[67] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import
        gunModel[68] = new ModelRendererTurbo(this, 649, 97, textureX, textureY); // Import
        gunModel[69] = new ModelRendererTurbo(this, 617, 113, textureX, textureY); // Import
        gunModel[70] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import
        gunModel[71] = new ModelRendererTurbo(this, 641, 81, textureX, textureY); // Import
        gunModel[72] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Import
        gunModel[73] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Import
        gunModel[74] = new ModelRendererTurbo(this, 593, 81, textureX, textureY); // Import
        gunModel[75] = new ModelRendererTurbo(this, 953, 81, textureX, textureY); // Import
        gunModel[76] = new ModelRendererTurbo(this, 985, 97, textureX, textureY); // Import
        gunModel[77] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Import
        gunModel[78] = new ModelRendererTurbo(this, 553, 25, textureX, textureY); // Import
        gunModel[79] = new ModelRendererTurbo(this, 601, 25, textureX, textureY); // Import
        gunModel[80] = new ModelRendererTurbo(this, 649, 25, textureX, textureY); // Import
        gunModel[81] = new ModelRendererTurbo(this, 753, 25, textureX, textureY); // Import
        gunModel[82] = new ModelRendererTurbo(this, 801, 25, textureX, textureY); // Import
        gunModel[83] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Import
        gunModel[84] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import
        gunModel[85] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import
        gunModel[86] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Import
        gunModel[87] = new ModelRendererTurbo(this, 809, 81, textureX, textureY); // Import
        gunModel[88] = new ModelRendererTurbo(this, 857, 81, textureX, textureY); // Import
        gunModel[89] = new ModelRendererTurbo(this, 513, 113, textureX, textureY); // Import
        gunModel[90] = new ModelRendererTurbo(this, 561, 129, textureX, textureY); // Import
        gunModel[91] = new ModelRendererTurbo(this, 945, 105, textureX, textureY); // Import
        gunModel[92] = new ModelRendererTurbo(this, 913, 113, textureX, textureY); // Import
        gunModel[93] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Import
        gunModel[94] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Import
        gunModel[95] = new ModelRendererTurbo(this, 969, 121, textureX, textureY); // Import
        gunModel[96] = new ModelRendererTurbo(this, 889, 129, textureX, textureY); // Import
        gunModel[97] = new ModelRendererTurbo(this, 937, 129, textureX, textureY); // Import
        gunModel[98] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import
        gunModel[99] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Import
        gunModel[100] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Import
        gunModel[101] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Import
        gunModel[102] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Import
        gunModel[103] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Import
        gunModel[104] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Import
        gunModel[105] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Import
        gunModel[106] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Import
        gunModel[107] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Import
        gunModel[108] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Import
        gunModel[109] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Import
        gunModel[110] = new ModelRendererTurbo(this, 913, 137, textureX, textureY); // Import
        gunModel[111] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Import
        gunModel[112] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Import
        gunModel[113] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Import
        gunModel[114] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Import
        gunModel[115] = new ModelRendererTurbo(this, 529, 145, textureX, textureY); // Import
        gunModel[116] = new ModelRendererTurbo(this, 961, 145, textureX, textureY); // Import
        gunModel[117] = new ModelRendererTurbo(this, 553, 153, textureX, textureY); // Import
        gunModel[118] = new ModelRendererTurbo(this, 601, 161, textureX, textureY); // Import
        gunModel[119] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import
        gunModel[120] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import
        gunModel[121] = new ModelRendererTurbo(this, 585, 153, textureX, textureY); // Import
        gunModel[122] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import
        gunModel[123] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import
        gunModel[124] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Import
        gunModel[125] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Import
        gunModel[126] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Import
        gunModel[127] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Import
        gunModel[128] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Import
        gunModel[129] = new ModelRendererTurbo(this, 937, 153, textureX, textureY); // Import
        gunModel[130] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Import
        gunModel[131] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Import
        gunModel[132] = new ModelRendererTurbo(this, 409, 161, textureX, textureY); // Import
        gunModel[133] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Import
        gunModel[134] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Import
        gunModel[135] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); // Import
        gunModel[136] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Import
        gunModel[137] = new ModelRendererTurbo(this, 529, 169, textureX, textureY); // Import
        gunModel[138] = new ModelRendererTurbo(this, 913, 169, textureX, textureY); // Import
        gunModel[139] = new ModelRendererTurbo(this, 961, 169, textureX, textureY); // Import
        gunModel[140] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Import
        gunModel[141] = new ModelRendererTurbo(this, 937, 177, textureX, textureY); // Import
        gunModel[142] = new ModelRendererTurbo(this, 985, 177, textureX, textureY); // Import
        gunModel[143] = new ModelRendererTurbo(this, 321, 185, textureX, textureY); // Import
        gunModel[144] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // Import
        gunModel[145] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Import
        gunModel[146] = new ModelRendererTurbo(this, 449, 185, textureX, textureY); // Import
        gunModel[147] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Import
        gunModel[148] = new ModelRendererTurbo(this, 553, 185, textureX, textureY); // Import
        gunModel[149] = new ModelRendererTurbo(this, 601, 185, textureX, textureY); // Import
        gunModel[150] = new ModelRendererTurbo(this, 641, 185, textureX, textureY); // Import
        gunModel[151] = new ModelRendererTurbo(this, 681, 185, textureX, textureY); // Import
        gunModel[152] = new ModelRendererTurbo(this, 721, 185, textureX, textureY); // Import
        gunModel[153] = new ModelRendererTurbo(this, 761, 185, textureX, textureY); // Import
        gunModel[154] = new ModelRendererTurbo(this, 809, 185, textureX, textureY); // Import
        gunModel[155] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Import
        gunModel[156] = new ModelRendererTurbo(this, 873, 185, textureX, textureY); // Import
        gunModel[157] = new ModelRendererTurbo(this, 897, 201, textureX, textureY); // Import
        gunModel[158] = new ModelRendererTurbo(this, 945, 201, textureX, textureY); // Import
        gunModel[159] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Import
        gunModel[160] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Import
        gunModel[161] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Import
        gunModel[162] = new ModelRendererTurbo(this, 385, 193, textureX, textureY); // Import
        gunModel[163] = new ModelRendererTurbo(this, 873, 33, textureX, textureY); // Import
        gunModel[164] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Import
        gunModel[165] = new ModelRendererTurbo(this, 57, 193, textureX, textureY); // Import
        gunModel[166] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Import
        gunModel[167] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Import
        gunModel[168] = new ModelRendererTurbo(this, 561, 57, textureX, textureY); // Import
        gunModel[169] = new ModelRendererTurbo(this, 601, 57, textureX, textureY); // Import
        gunModel[170] = new ModelRendererTurbo(this, 641, 57, textureX, textureY); // Import
        gunModel[171] = new ModelRendererTurbo(this, 473, 193, textureX, textureY); // Import
        gunModel[172] = new ModelRendererTurbo(this, 681, 57, textureX, textureY); // Import
        gunModel[173] = new ModelRendererTurbo(this, 721, 57, textureX, textureY); // Import
        gunModel[174] = new ModelRendererTurbo(this, 113, 193, textureX, textureY); // Import
        gunModel[175] = new ModelRendererTurbo(this, 761, 57, textureX, textureY); // Import
        gunModel[176] = new ModelRendererTurbo(this, 169, 193, textureX, textureY); // Import
        gunModel[177] = new ModelRendererTurbo(this, 801, 57, textureX, textureY); // Import
        gunModel[178] = new ModelRendererTurbo(this, 841, 57, textureX, textureY); // Import
        gunModel[179] = new ModelRendererTurbo(this, 225, 193, textureX, textureY); // Import
        gunModel[180] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Import
        gunModel[181] = new ModelRendererTurbo(this, 337, 209, textureX, textureY); // Import
        gunModel[182] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Import
        gunModel[183] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Import
        gunModel[184] = new ModelRendererTurbo(this, 521, 193, textureX, textureY); // Import
        gunModel[185] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Import
        gunModel[186] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Import
        gunModel[187] = new ModelRendererTurbo(this, 417, 209, textureX, textureY); // Import
        gunModel[188] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Import
        gunModel[189] = new ModelRendererTurbo(this, 577, 193, textureX, textureY); // Import
        gunModel[190] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Import
        gunModel[191] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Import
        gunModel[192] = new ModelRendererTurbo(this, 609, 209, textureX, textureY); // Import
        gunModel[193] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Import
        gunModel[194] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Import
        gunModel[195] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Import
        gunModel[196] = new ModelRendererTurbo(this, 553, 81, textureX, textureY); // Import
        gunModel[197] = new ModelRendererTurbo(this, 889, 81, textureX, textureY); // Import
        gunModel[198] = new ModelRendererTurbo(this, 785, 193, textureX, textureY); // Import
        gunModel[199] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Import
        gunModel[200] = new ModelRendererTurbo(this, 657, 217, textureX, textureY); // Import
        gunModel[201] = new ModelRendererTurbo(this, 345, 225, textureX, textureY); // Import
        gunModel[202] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Import
        gunModel[203] = new ModelRendererTurbo(this, 817, 89, textureX, textureY); // Import
        gunModel[204] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Import
        gunModel[205] = new ModelRendererTurbo(this, 521, 105, textureX, textureY); // Import
        gunModel[206] = new ModelRendererTurbo(this, 529, 137, textureX, textureY); // Import
        gunModel[207] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import
        gunModel[208] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Import
        gunModel[209] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Import
        gunModel[210] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Import
        gunModel[211] = new ModelRendererTurbo(this, 657, 209, textureX, textureY); // Import
        gunModel[212] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Import
        gunModel[213] = new ModelRendererTurbo(this, 553, 209, textureX, textureY); // Import
        gunModel[214] = new ModelRendererTurbo(this, 857, 209, textureX, textureY); // Import
        gunModel[215] = new ModelRendererTurbo(this, 993, 121, textureX, textureY); // Import
        gunModel[216] = new ModelRendererTurbo(this, 873, 129, textureX, textureY); // Import
        gunModel[217] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Import
        gunModel[218] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Import
        gunModel[219] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Import
        gunModel[220] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Import
        gunModel[221] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Import
        gunModel[222] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Import
        gunModel[223] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Import
        gunModel[224] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Import
        gunModel[225] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Import
        gunModel[226] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Import
        gunModel[227] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Import
        gunModel[228] = new ModelRendererTurbo(this, 593, 225, textureX, textureY); // Import
        gunModel[229] = new ModelRendererTurbo(this, 897, 225, textureX, textureY); // Import
        gunModel[230] = new ModelRendererTurbo(this, 649, 233, textureX, textureY); // Import
        gunModel[231] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Import
        gunModel[232] = new ModelRendererTurbo(this, 201, 233, textureX, textureY); // Import
        gunModel[233] = new ModelRendererTurbo(this, 201, 241, textureX, textureY); // Import
        gunModel[234] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Import
        gunModel[235] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Import
        gunModel[236] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Import
        gunModel[237] = new ModelRendererTurbo(this, 865, 89, textureX, textureY); // Import
        gunModel[238] = new ModelRendererTurbo(this, 761, 9, textureX, textureY); // Import
        gunModel[239] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Import
        gunModel[240] = new ModelRendererTurbo(this, 921, 57, textureX, textureY); // Import
        gunModel[241] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import
        gunModel[242] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import
        gunModel[243] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Import
        gunModel[244] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import
        gunModel[245] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import
        gunModel[246] = new ModelRendererTurbo(this, 889, 9, textureX, textureY); // Import
        gunModel[247] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Import
        gunModel[248] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Import
        gunModel[249] = new ModelRendererTurbo(this, 521, 9, textureX, textureY); // Import
        gunModel[250] = new ModelRendererTurbo(this, 529, 9, textureX, textureY); // Import
        gunModel[251] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Import
        gunModel[252] = new ModelRendererTurbo(this, 697, 25, textureX, textureY); // Import
        gunModel[253] = new ModelRendererTurbo(this, 721, 9, textureX, textureY); // Import
        gunModel[254] = new ModelRendererTurbo(this, 737, 9, textureX, textureY); // Import
        gunModel[255] = new ModelRendererTurbo(this, 745, 9, textureX, textureY); // Import
        gunModel[256] = new ModelRendererTurbo(this, 785, 9, textureX, textureY); // Import
        gunModel[257] = new ModelRendererTurbo(this, 825, 9, textureX, textureY); // Import
        gunModel[258] = new ModelRendererTurbo(this, 841, 9, textureX, textureY); // Import
        gunModel[259] = new ModelRendererTurbo(this, 913, 9, textureX, textureY); // Import
        gunModel[260] = new ModelRendererTurbo(this, 937, 9, textureX, textureY); // Import
        gunModel[261] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Import
        gunModel[262] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Import
        gunModel[263] = new ModelRendererTurbo(this, 985, 169, textureX, textureY); // Import
        gunModel[264] = new ModelRendererTurbo(this, 577, 185, textureX, textureY); // Import
        gunModel[265] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Import
        gunModel[266] = new ModelRendererTurbo(this, 849, 9, textureX, textureY); // Import
        gunModel[267] = new ModelRendererTurbo(this, 873, 9, textureX, textureY); // Import
        gunModel[268] = new ModelRendererTurbo(this, 913, 9, textureX, textureY); // Import
        gunModel[269] = new ModelRendererTurbo(this, 937, 9, textureX, textureY); // Import
        gunModel[270] = new ModelRendererTurbo(this, 961, 9, textureX, textureY); // Import
        gunModel[271] = new ModelRendererTurbo(this, 969, 9, textureX, textureY); // Import
        gunModel[272] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Import
        gunModel[273] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Import
        gunModel[274] = new ModelRendererTurbo(this, 985, 9, textureX, textureY); // Import
        gunModel[275] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Import
        gunModel[276] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Import
        gunModel[277] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Import
        gunModel[278] = new ModelRendererTurbo(this, 785, 185, textureX, textureY); // Import
        gunModel[279] = new ModelRendererTurbo(this, 897, 193, textureX, textureY); // Import
        gunModel[280] = new ModelRendererTurbo(this, 281, 201, textureX, textureY); // Import
        gunModel[281] = new ModelRendererTurbo(this, 985, 201, textureX, textureY); // Import
        gunModel[282] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Import
        gunModel[283] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Import
        gunModel[284] = new ModelRendererTurbo(this, 697, 25, textureX, textureY); // Import
        gunModel[285] = new ModelRendererTurbo(this, 897, 25, textureX, textureY); // Import
        gunModel[286] = new ModelRendererTurbo(this, 905, 25, textureX, textureY); // Import
        gunModel[287] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Import
        gunModel[288] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Import
        gunModel[289] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Import
        gunModel[290] = new ModelRendererTurbo(this, 873, 33, textureX, textureY); // Import
        gunModel[291] = new ModelRendererTurbo(this, 881, 33, textureX, textureY); // Import
        gunModel[292] = new ModelRendererTurbo(this, 897, 33, textureX, textureY); // Import
        gunModel[293] = new ModelRendererTurbo(this, 937, 33, textureX, textureY); // Import
        gunModel[294] = new ModelRendererTurbo(this, 913, 81, textureX, textureY); // Import
        gunModel[295] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Import
        gunModel[296] = new ModelRendererTurbo(this, 617, 105, textureX, textureY); // Import
        gunModel[297] = new ModelRendererTurbo(this, 705, 209, textureX, textureY); // Import
        gunModel[298] = new ModelRendererTurbo(this, 745, 209, textureX, textureY); // Import
        gunModel[299] = new ModelRendererTurbo(this, 825, 209, textureX, textureY); // Import
        gunModel[300] = new ModelRendererTurbo(this, 985, 209, textureX, textureY); // Import
        gunModel[301] = new ModelRendererTurbo(this, 945, 33, textureX, textureY); // Import
        gunModel[302] = new ModelRendererTurbo(this, 961, 33, textureX, textureY); // Import
        gunModel[303] = new ModelRendererTurbo(this, 969, 33, textureX, textureY); // Import
        gunModel[304] = new ModelRendererTurbo(this, 985, 33, textureX, textureY); // Import
        gunModel[305] = new ModelRendererTurbo(this, 993, 33, textureX, textureY); // Import
        gunModel[306] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Import
        gunModel[307] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Import
        gunModel[308] = new ModelRendererTurbo(this, 873, 41, textureX, textureY); // Import
        gunModel[309] = new ModelRendererTurbo(this, 881, 41, textureX, textureY); // Import
        gunModel[310] = new ModelRendererTurbo(this, 897, 41, textureX, textureY); // Import
        gunModel[311] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import
        gunModel[312] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Import
        gunModel[313] = new ModelRendererTurbo(this, 937, 113, textureX, textureY); // Import
        gunModel[314] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Import
        gunModel[315] = new ModelRendererTurbo(this, 961, 129, textureX, textureY); // Import
        gunModel[316] = new ModelRendererTurbo(this, 473, 217, textureX, textureY); // Import
        gunModel[317] = new ModelRendererTurbo(this, 513, 217, textureX, textureY); // Import
        gunModel[318] = new ModelRendererTurbo(this, 953, 225, textureX, textureY); // Import
        gunModel[319] = new ModelRendererTurbo(this, 305, 233, textureX, textureY); // Import
        gunModel[320] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Import
        gunModel[321] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Import
        gunModel[322] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Import
        gunModel[323] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Import
        gunModel[324] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Import
        gunModel[325] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Import
        gunModel[326] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Import
        gunModel[327] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Import
        gunModel[328] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Import
        gunModel[329] = new ModelRendererTurbo(this, 529, 49, textureX, textureY); // Import
        gunModel[330] = new ModelRendererTurbo(this, 537, 49, textureX, textureY); // Import
        gunModel[331] = new ModelRendererTurbo(this, 1009, 49, textureX, textureY); // Import
        gunModel[332] = new ModelRendererTurbo(this, 985, 217, textureX, textureY); // Import
        gunModel[333] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Import
        gunModel[334] = new ModelRendererTurbo(this, 545, 233, textureX, textureY); // Import
        gunModel[335] = new ModelRendererTurbo(this, 825, 233, textureX, textureY); // Import
        gunModel[336] = new ModelRendererTurbo(this, 865, 233, textureX, textureY); // Import
        gunModel[337] = new ModelRendererTurbo(this, 937, 233, textureX, textureY); // Import
        gunModel[338] = new ModelRendererTurbo(this, 297, 241, textureX, textureY); // Import
        gunModel[339] = new ModelRendererTurbo(this, 337, 241, textureX, textureY); // Import
        gunModel[340] = new ModelRendererTurbo(this, 377, 241, textureX, textureY); // Import
        gunModel[341] = new ModelRendererTurbo(this, 433, 241, textureX, textureY); // Import
        gunModel[342] = new ModelRendererTurbo(this, 473, 241, textureX, textureY); // Import
        gunModel[343] = new ModelRendererTurbo(this, 513, 241, textureX, textureY); // Import
        gunModel[344] = new ModelRendererTurbo(this, 569, 241, textureX, textureY); // Import
        gunModel[345] = new ModelRendererTurbo(this, 609, 241, textureX, textureY); // Import
        gunModel[346] = new ModelRendererTurbo(this, 649, 241, textureX, textureY); // Import
        gunModel[347] = new ModelRendererTurbo(this, 689, 241, textureX, textureY); // Import
        gunModel[348] = new ModelRendererTurbo(this, 769, 241, textureX, textureY); // Import
        gunModel[349] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Import
        gunModel[350] = new ModelRendererTurbo(this, 889, 241, textureX, textureY); // Import
        gunModel[351] = new ModelRendererTurbo(this, 961, 241, textureX, textureY); // Import
        gunModel[352] = new ModelRendererTurbo(this, 81, 249, textureX, textureY); // Import
        gunModel[353] = new ModelRendererTurbo(this, 121, 249, textureX, textureY); // Import
        gunModel[354] = new ModelRendererTurbo(this, 161, 249, textureX, textureY); // Import
        gunModel[355] = new ModelRendererTurbo(this, 537, 257, textureX, textureY); // Import
        gunModel[356] = new ModelRendererTurbo(this, 825, 257, textureX, textureY); // Import
        gunModel[357] = new ModelRendererTurbo(this, 929, 257, textureX, textureY); // Import
        gunModel[358] = new ModelRendererTurbo(this, 193, 265, textureX, textureY); // Import
        gunModel[359] = new ModelRendererTurbo(this, 249, 265, textureX, textureY); // Import
        gunModel[360] = new ModelRendererTurbo(this, 297, 265, textureX, textureY); // Import
        gunModel[361] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Import
        gunModel[362] = new ModelRendererTurbo(this, 337, 265, textureX, textureY); // Import
        gunModel[363] = new ModelRendererTurbo(this, 385, 265, textureX, textureY); // Import
        gunModel[364] = new ModelRendererTurbo(this, 585, 265, textureX, textureY); // Import
        gunModel[365] = new ModelRendererTurbo(this, 649, 265, textureX, textureY); // Import
        gunModel[366] = new ModelRendererTurbo(this, 721, 265, textureX, textureY); // Import
        gunModel[367] = new ModelRendererTurbo(this, 857, 265, textureX, textureY); // Import
        gunModel[368] = new ModelRendererTurbo(this, 961, 265, textureX, textureY); // Import
        gunModel[369] = new ModelRendererTurbo(this, 785, 265, textureX, textureY); // Import
        gunModel[370] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Import
        gunModel[371] = new ModelRendererTurbo(this, 497, 265, textureX, textureY); // Import
        gunModel[372] = new ModelRendererTurbo(this, 57, 273, textureX, textureY); // Import
        gunModel[373] = new ModelRendererTurbo(this, 81, 273, textureX, textureY); // Import
        gunModel[374] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Import
        gunModel[375] = new ModelRendererTurbo(this, 417, 273, textureX, textureY); // Import
        gunModel[376] = new ModelRendererTurbo(this, 457, 273, textureX, textureY); // Import
        gunModel[377] = new ModelRendererTurbo(this, 225, 273, textureX, textureY); // Import
        gunModel[378] = new ModelRendererTurbo(this, 785, 281, textureX, textureY); // Import
        gunModel[379] = new ModelRendererTurbo(this, 921, 281, textureX, textureY); // Import
        gunModel[380] = new ModelRendererTurbo(this, 257, 289, textureX, textureY); // Import
        gunModel[381] = new ModelRendererTurbo(this, 337, 289, textureX, textureY); // Import
        gunModel[382] = new ModelRendererTurbo(this, 585, 289, textureX, textureY); // Import
        gunModel[383] = new ModelRendererTurbo(this, 393, 297, textureX, textureY); // Import
        gunModel[384] = new ModelRendererTurbo(this, 57, 305, textureX, textureY); // Import
        gunModel[385] = new ModelRendererTurbo(this, 713, 305, textureX, textureY); // Import
        gunModel[386] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import
        gunModel[387] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Import
        gunModel[388] = new ModelRendererTurbo(this, 993, 145, textureX, textureY); // Import
        gunModel[389] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Import
        gunModel[390] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Import
        gunModel[391] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Import
        gunModel[392] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Import
        gunModel[393] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Import
        gunModel[394] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Import
        gunModel[395] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Import
        gunModel[396] = new ModelRendererTurbo(this, 529, 57, textureX, textureY); // Import
        gunModel[397] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Import
        gunModel[398] = new ModelRendererTurbo(this, 945, 73, textureX, textureY); // Import
        gunModel[399] = new ModelRendererTurbo(this, 345, 185, textureX, textureY); // Import
        gunModel[400] = new ModelRendererTurbo(this, 737, 57, textureX, textureY); // Import
        gunModel[401] = new ModelRendererTurbo(this, 585, 161, textureX, textureY); // Import
        gunModel[402] = new ModelRendererTurbo(this, 433, 185, textureX, textureY); // Import
        gunModel[403] = new ModelRendererTurbo(this, 625, 185, textureX, textureY); // Import
        gunModel[404] = new ModelRendererTurbo(this, 841, 289, textureX, textureY); // Import
        gunModel[405] = new ModelRendererTurbo(this, 665, 185, textureX, textureY); // Import
        gunModel[406] = new ModelRendererTurbo(this, 705, 185, textureX, textureY); // Import
        gunModel[407] = new ModelRendererTurbo(this, 745, 185, textureX, textureY); // Import
        gunModel[408] = new ModelRendererTurbo(this, 857, 185, textureX, textureY); // Import
        gunModel[409] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import
        gunModel[410] = new ModelRendererTurbo(this, 961, 57, textureX, textureY); // Import
        gunModel[411] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import
        gunModel[412] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Import
        gunModel[413] = new ModelRendererTurbo(this, 969, 113, textureX, textureY); // Import
        gunModel[414] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Import
        gunModel[415] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Import
        gunModel[416] = new ModelRendererTurbo(this, 561, 57, textureX, textureY); // Import
        gunModel[417] = new ModelRendererTurbo(this, 1009, 73, textureX, textureY); // Import
        gunModel[418] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import
        gunModel[419] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Import
        gunModel[420] = new ModelRendererTurbo(this, 873, 305, textureX, textureY); // Import
        gunModel[421] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Import
        gunModel[422] = new ModelRendererTurbo(this, 121, 313, textureX, textureY); // Import
        gunModel[423] = new ModelRendererTurbo(this, 849, 233, textureX, textureY); // Import
        gunModel[424] = new ModelRendererTurbo(this, 281, 241, textureX, textureY); // Import
        gunModel[425] = new ModelRendererTurbo(this, 601, 57, textureX, textureY); // Import
        gunModel[426] = new ModelRendererTurbo(this, 641, 57, textureX, textureY); // Import
        gunModel[427] = new ModelRendererTurbo(this, 681, 57, textureX, textureY); // Import
        gunModel[428] = new ModelRendererTurbo(this, 249, 313, textureX, textureY); // Import
        gunModel[429] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Import
        gunModel[430] = new ModelRendererTurbo(this, 585, 57, textureX, textureY); // Import
        gunModel[431] = new ModelRendererTurbo(this, 625, 57, textureX, textureY); // Import
        gunModel[432] = new ModelRendererTurbo(this, 665, 57, textureX, textureY); // Import
        gunModel[433] = new ModelRendererTurbo(this, 705, 57, textureX, textureY); // Import
        gunModel[434] = new ModelRendererTurbo(this, 721, 57, textureX, textureY); // Import
        gunModel[435] = new ModelRendererTurbo(this, 761, 57, textureX, textureY); // Import
        gunModel[436] = new ModelRendererTurbo(this, 785, 57, textureX, textureY); // Import
        gunModel[437] = new ModelRendererTurbo(this, 801, 57, textureX, textureY); // Import
        gunModel[438] = new ModelRendererTurbo(this, 825, 57, textureX, textureY); // Import
        gunModel[439] = new ModelRendererTurbo(this, 841, 57, textureX, textureY); // Import
        gunModel[440] = new ModelRendererTurbo(this, 865, 57, textureX, textureY); // Import
        gunModel[441] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Import
        gunModel[442] = new ModelRendererTurbo(this, 905, 57, textureX, textureY); // Import
        gunModel[443] = new ModelRendererTurbo(this, 945, 57, textureX, textureY); // Import
        gunModel[444] = new ModelRendererTurbo(this, 985, 57, textureX, textureY); // Import
        gunModel[445] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import
        gunModel[446] = new ModelRendererTurbo(this, 1009, 177, textureX, textureY); // Import
        gunModel[447] = new ModelRendererTurbo(this, 1009, 57, textureX, textureY); // Import
        gunModel[448] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Import
        gunModel[449] = new ModelRendererTurbo(this, 121, 321, textureX, textureY); // Import
        gunModel[450] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Import
        gunModel[451] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Import
        gunModel[452] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Import
        gunModel[453] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Import
        gunModel[454] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Import
        gunModel[455] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Import
        gunModel[456] = new ModelRendererTurbo(this, 721, 65, textureX, textureY); // Import
        gunModel[457] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Import
        gunModel[458] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Import
        gunModel[459] = new ModelRendererTurbo(this, 569, 57, textureX, textureY); // Import
        gunModel[460] = new ModelRendererTurbo(this, 737, 57, textureX, textureY); // Import
        gunModel[461] = new ModelRendererTurbo(this, 921, 57, textureX, textureY); // Import
        gunModel[462] = new ModelRendererTurbo(this, 185, 289, textureX, textureY); // Import
        gunModel[463] = new ModelRendererTurbo(this, 513, 305, textureX, textureY); // Import
        gunModel[464] = new ModelRendererTurbo(this, 321, 313, textureX, textureY); // Import
        gunModel[465] = new ModelRendererTurbo(this, 241, 321, textureX, textureY); // Import
        gunModel[466] = new ModelRendererTurbo(this, 553, 313, textureX, textureY); // Import
        gunModel[467] = new ModelRendererTurbo(this, 361, 321, textureX, textureY); // Import
        gunModel[468] = new ModelRendererTurbo(this, 841, 313, textureX, textureY); // Import
        gunModel[469] = new ModelRendererTurbo(this, 289, 321, textureX, textureY); // Import
        gunModel[470] = new ModelRendererTurbo(this, 433, 321, textureX, textureY); // Import
        gunModel[471] = new ModelRendererTurbo(this, 473, 321, textureX, textureY); // Import
        gunModel[472] = new ModelRendererTurbo(this, 713, 321, textureX, textureY); // Import
        gunModel[473] = new ModelRendererTurbo(this, 601, 345, textureX, textureY); // Import
        gunModel[474] = new ModelRendererTurbo(this, 713, 289, textureX, textureY); // Import
        gunModel[475] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Import
        gunModel[476] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Import
        gunModel[477] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Import
        gunModel[478] = new ModelRendererTurbo(this, 769, 337, textureX, textureY); // Import
        gunModel[479] = new ModelRendererTurbo(this, 513, 329, textureX, textureY); // Import
        gunModel[480] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Import
        gunModel[481] = new ModelRendererTurbo(this, 313, 337, textureX, textureY); // Import
        gunModel[482] = new ModelRendererTurbo(this, 993, 337, textureX, textureY); // Import
        gunModel[483] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Import
        gunModel[484] = new ModelRendererTurbo(this, 233, 345, textureX, textureY); // Import
        gunModel[485] = new ModelRendererTurbo(this, 265, 345, textureX, textureY); // Import
        gunModel[486] = new ModelRendererTurbo(this, 433, 345, textureX, textureY); // Import
        gunModel[487] = new ModelRendererTurbo(this, 281, 345, textureX, textureY); // Import
        gunModel[488] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Import
        gunModel[489] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Import
        gunModel[490] = new ModelRendererTurbo(this, 601, 329, textureX, textureY); // Import
        gunModel[491] = new ModelRendererTurbo(this, 921, 161, textureX, textureY); // Import
        gunModel[492] = new ModelRendererTurbo(this, 545, 193, textureX, textureY); // Import
        gunModel[493] = new ModelRendererTurbo(this, 273, 193, textureX, textureY); // Import
        gunModel[494] = new ModelRendererTurbo(this, 969, 105, textureX, textureY); // Import
        gunModel[495] = new ModelRendererTurbo(this, 937, 369, textureX, textureY); // Import
        gunModel[496] = new ModelRendererTurbo(this, 1, 393, textureX, textureY); // Import
        gunModel[497] = new ModelRendererTurbo(this, 81, 393, textureX, textureY); // Import
        gunModel[498] = new ModelRendererTurbo(this, 881, 385, textureX, textureY); // Import
        gunModel[499] = new ModelRendererTurbo(this, 161, 393, textureX, textureY); // Import

        gunModel[0].addShapeBox(0F, 0F, 0F, 88, 19, 12, 0F, 8.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[0].setRotationPoint(18F, -70F, -4F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 50, 4, 16, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[1].setRotationPoint(18F, -74F, -8F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 88, 3, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[2].setRotationPoint(18F, -77F, -6F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 88, 2, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[3].setRotationPoint(18F, -51F, -8F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 16, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[4].setRotationPoint(10F, -44F, -8F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 13, 4, 16, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[5].setRotationPoint(-1F, -41F, -8F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 5, 3, 16, 0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[6].setRotationPoint(10F, -37F, -8F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import
        gunModel[7].setRotationPoint(89.5F, -54F, 8F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[8].setRotationPoint(89.5F, -58F, 8F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[9].setRotationPoint(89.5F, -56F, 8F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 17, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[10].setRotationPoint(44.5F, -56F, -8.5F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 17, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[11].setRotationPoint(44.5F, -57F, -8.5F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 17, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[12].setRotationPoint(44.5F, -55F, -8.5F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 17, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[13].setRotationPoint(22.5F, -56F, -8.5F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 17, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[14].setRotationPoint(22.5F, -57F, -8.5F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 17, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[15].setRotationPoint(22.5F, -55F, -8.5F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 156, 7, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[16].setRotationPoint(108F, -69F, -8F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 151, 2, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[17].setRotationPoint(108F, -71F, -9F);

        gunModel[18].addShapeBox(0F, 0F, 0F, 92, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[18].setRotationPoint(167F, -77F, 7F);

        gunModel[19].addShapeBox(0F, 0F, 0F, 92, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[19].setRotationPoint(167F, -75F, -9F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F); // Import
        gunModel[20].setRotationPoint(155F, -80F, 7F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 12, 4, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[21].setRotationPoint(155F, -78F, -9F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 47, 2, 2, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[22].setRotationPoint(108F, -80F, -9F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 47, 4, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[23].setRotationPoint(108F, -78F, -9F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 2, 3, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[24].setRotationPoint(145.5F, -74F, -9F);

        gunModel[25].addShapeBox(0F, 0F, 0F, 2, 3, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[25].setRotationPoint(127.5F, -74F, -9F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[26].setRotationPoint(107.5F, -74F, -9F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 2, 3, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[27].setRotationPoint(163.5F, -74F, -9F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 2, 3, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[28].setRotationPoint(181.5F, -74F, -9F);

        gunModel[29].addShapeBox(0F, 0F, 0F, 2, 3, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[29].setRotationPoint(199.5F, -74F, -9F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 2, 3, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[30].setRotationPoint(217.5F, -74F, -9F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 2, 3, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[31].setRotationPoint(235.5F, -74F, -9F);

        gunModel[32].addShapeBox(0F, 0F, 0F, 5, 3, 18, 0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[32].setRotationPoint(253.5F, -74F, -9F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[33].setRotationPoint(111.5F, -74F, -9F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[34].setRotationPoint(111.5F, -72F, -9F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[35].setRotationPoint(126.5F, -74F, -9F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[36].setRotationPoint(126.5F, -72F, -9F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[37].setRotationPoint(129.5F, -74F, -9F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[38].setRotationPoint(129.5F, -72F, -9F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[39].setRotationPoint(144.5F, -74F, -9F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[40].setRotationPoint(144.5F, -72F, -9F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[41].setRotationPoint(147.5F, -74F, -9F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[42].setRotationPoint(147.5F, -72F, -9F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[43].setRotationPoint(162.5F, -74F, -9F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[44].setRotationPoint(162.5F, -72F, -9F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[45].setRotationPoint(165.5F, -74F, -9F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[46].setRotationPoint(165.5F, -72F, -9F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[47].setRotationPoint(180.5F, -74F, -9F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[48].setRotationPoint(180.5F, -72F, -9F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[49].setRotationPoint(183.5F, -74F, -9F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[50].setRotationPoint(183.5F, -72F, -9F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[51].setRotationPoint(198.5F, -74F, -9F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[52].setRotationPoint(198.5F, -72F, -9F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[53].setRotationPoint(201.5F, -74F, -9F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[54].setRotationPoint(201.5F, -72F, -9F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[55].setRotationPoint(216.5F, -74F, -9F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[56].setRotationPoint(216.5F, -72F, -9F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[57].setRotationPoint(219.5F, -74F, -9F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[58].setRotationPoint(219.5F, -72F, -9F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[59].setRotationPoint(234.5F, -74F, -9F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[60].setRotationPoint(234.5F, -72F, -9F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[61].setRotationPoint(237.5F, -74F, -9F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[62].setRotationPoint(237.5F, -72F, -9F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[63].setRotationPoint(252.5F, -74F, -9F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[64].setRotationPoint(252.5F, -72F, -9F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 2, 26, 18, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F); // Import
        gunModel[65].setRotationPoint(106F, -78F, -9F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0F); // Import
        gunModel[66].setRotationPoint(106F, -80F, -9F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 154, 2, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[67].setRotationPoint(108F, -62F, -9F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 147, 3, 9, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[68].setRotationPoint(111F, -73F, -4.5F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 147, 3, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[69].setRotationPoint(111F, -70F, -4.5F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 147, 3, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F); // Import
        gunModel[70].setRotationPoint(111F, -67F, -4.5F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 77, 3, 9, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[71].setRotationPoint(258F, -73F, -4.5F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 77, 3, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[72].setRotationPoint(258F, -70F, -4.5F);

        gunModel[73].addShapeBox(0F, 0F, 0F, 77, 3, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F); // Import
        gunModel[73].setRotationPoint(258F, -67F, -4.5F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 7, 4, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[74].setRotationPoint(343F, -70.5F, -6F);

        gunModel[75].addShapeBox(0F, 0F, 0F, 7, 4, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[75].setRotationPoint(343F, -74.5F, -6F);

        gunModel[76].addShapeBox(0F, 0F, 0F, 7, 4, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[76].setRotationPoint(343F, -66.5F, -6F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        gunModel[77].setRotationPoint(335F, -70F, -5F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        gunModel[78].setRotationPoint(335F, -73.5F, -5F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        gunModel[79].setRotationPoint(335F, -70F, -1.5F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        gunModel[80].setRotationPoint(335F, -70F, 2F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        gunModel[81].setRotationPoint(335F, -73.5F, 2F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        gunModel[82].setRotationPoint(335F, -73.5F, -1.5F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        gunModel[83].setRotationPoint(335F, -66.5F, -5F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F); // Import
        gunModel[84].setRotationPoint(335F, -66.5F, 2F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        gunModel[85].setRotationPoint(335F, -66.5F, -1.5F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 20, 2, 2, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        gunModel[86].setRotationPoint(312F, -73.5F, -1F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        gunModel[87].setRotationPoint(312F, -73.5F, 1.5F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        gunModel[88].setRotationPoint(312F, -73.5F, -2.5F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 12, 5, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[89].setRotationPoint(108F, -60F, -9F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 144, 2, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[90].setRotationPoint(120F, -57F, -9F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 2, 3, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[91].setRotationPoint(136F, -60F, -9F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[92].setRotationPoint(120F, -60F, -9F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[93].setRotationPoint(135F, -60F, -9F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[94].setRotationPoint(135F, -58F, -9F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[95].setRotationPoint(120F, -58F, -9F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 2, 3, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[96].setRotationPoint(154F, -60F, -9F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[97].setRotationPoint(138F, -60F, -9F);

        gunModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[98].setRotationPoint(153F, -60F, -9F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[99].setRotationPoint(153F, -58F, -9F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[100].setRotationPoint(138F, -58F, -9F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[101].setRotationPoint(156F, -60F, -9F);

        gunModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[102].setRotationPoint(156F, -58F, -9F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 2, 3, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[103].setRotationPoint(226F, -60F, -9F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[104].setRotationPoint(225F, -60F, -9F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[105].setRotationPoint(225F, -58F, -9F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 2, 3, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[106].setRotationPoint(244F, -60F, -9F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[107].setRotationPoint(228F, -60F, -9F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[108].setRotationPoint(243F, -60F, -9F);

        gunModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[109].setRotationPoint(243F, -58F, -9F);

        gunModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[110].setRotationPoint(228F, -58F, -9F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 2, 5, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[111].setRotationPoint(262F, -62F, -9F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[112].setRotationPoint(246F, -60F, -9F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[113].setRotationPoint(261F, -60F, -9F);

        gunModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[114].setRotationPoint(261F, -58F, -9F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[115].setRotationPoint(246F, -58F, -9F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 5, 5, 18, 0F, 0.0F, 1.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[116].setRotationPoint(259F, -74F, -9F);

        gunModel[117].addShapeBox(0F, 0F, 0F, 5, 8, 18, 0F, 0.0F, 0.0F, -2.0F, 0.0F, -6.0F, -2.0F, 0.0F, -6.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F); // Import
        gunModel[117].setRotationPoint(259F, -77F, -9F);

        gunModel[118].addShapeBox(0F, 0F, 0F, 151, 9, 10, 0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[118].setRotationPoint(111F, -61F, -5F);

        gunModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[119].setRotationPoint(108F, -69F, -9F);

        gunModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[120].setRotationPoint(108F, -63F, -9F);

        gunModel[121].addShapeBox(0F, 0F, 0F, 155, 1, 1, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[121].setRotationPoint(109F, -63F, -9F);

        gunModel[122].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[122].setRotationPoint(108F, -68F, -9F);

        gunModel[123].addShapeBox(0F, 0F, 0F, 155, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[123].setRotationPoint(109F, -63F, 8F);

        gunModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[124].setRotationPoint(108F, -63F, 8F);

        gunModel[125].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[125].setRotationPoint(108F, -68F, 8F);

        gunModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[126].setRotationPoint(108F, -69F, 8F);

        gunModel[127].addShapeBox(0F, 0F, 0F, 155, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[127].setRotationPoint(109F, -69F, 8F);

        gunModel[128].addShapeBox(0F, 0F, 0F, 155, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[128].setRotationPoint(109F, -69F, -9F);

        gunModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[129].setRotationPoint(111F, -55F, -9F);

        gunModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[130].setRotationPoint(126F, -55F, -9F);

        gunModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[131].setRotationPoint(126F, -53F, -9F);

        gunModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[132].setRotationPoint(111F, -53F, -9F);

        gunModel[133].addShapeBox(0F, 0F, 0F, 3, 3, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[133].setRotationPoint(108F, -55F, -9F);

        gunModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[134].setRotationPoint(129F, -55F, -9F);

        gunModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[135].setRotationPoint(144F, -55F, -9F);

        gunModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[136].setRotationPoint(144F, -53F, -9F);

        gunModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[137].setRotationPoint(129F, -53F, -9F);

        gunModel[138].addShapeBox(0F, 0F, 0F, 2, 3, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[138].setRotationPoint(127F, -55F, -9F);

        gunModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[139].setRotationPoint(147F, -55F, -9F);

        gunModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[140].setRotationPoint(147F, -53F, -9F);

        gunModel[141].addShapeBox(0F, 0F, 0F, 2, 3, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[141].setRotationPoint(145F, -55F, -9F);

        gunModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[142].setRotationPoint(216F, -55F, -9F);

        gunModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[143].setRotationPoint(216F, -53F, -9F);

        gunModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[144].setRotationPoint(219F, -55F, -9F);

        gunModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[145].setRotationPoint(234F, -55F, -9F);

        gunModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[146].setRotationPoint(234F, -53F, -9F);

        gunModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[147].setRotationPoint(219F, -53F, -9F);

        gunModel[148].addShapeBox(0F, 0F, 0F, 2, 3, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[148].setRotationPoint(217F, -55F, -9F);

        gunModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[149].setRotationPoint(237F, -55F, -9F);

        gunModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[150].setRotationPoint(252F, -55F, -9F);

        gunModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[151].setRotationPoint(252F, -53F, -9F);

        gunModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[152].setRotationPoint(237F, -53F, -9F);

        gunModel[153].addShapeBox(0F, 0F, 0F, 2, 3, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[153].setRotationPoint(235F, -55F, -9F);

        gunModel[154].addShapeBox(0F, 0F, 0F, 11, 3, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[154].setRotationPoint(253F, -55F, -9F);

        gunModel[155].addShapeBox(0F, 0F, 0F, 156, 1, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F); // Import
        gunModel[155].setRotationPoint(108F, -52F, -9F);

        gunModel[156].addShapeBox(0F, 0F, 0F, 2, 1, 18, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F); // Import
        gunModel[156].setRotationPoint(106F, -52F, -9F);

        gunModel[157].addShapeBox(0F, 0F, 0F, 12, 2, 17, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        gunModel[157].setRotationPoint(108F, -50.5F, -8.5F);

        gunModel[158].addShapeBox(0F, 0F, 0F, 12, 2, 14, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F); // Import
        gunModel[158].setRotationPoint(108F, -48.5F, -7F);

        gunModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[159].setRotationPoint(120F, -48.5F, -6F);

        gunModel[160].addShapeBox(0F, 0F, 0F, 16, 1, 10, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[160].setRotationPoint(120F, -47.5F, -5F);

        gunModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[161].setRotationPoint(135F, -48.5F, -6F);

        gunModel[162].addShapeBox(0F, 0F, 0F, 2, 2, 17, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        gunModel[162].setRotationPoint(136F, -50.5F, -8.5F);

        gunModel[163].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F); // Import
        gunModel[163].setRotationPoint(136F, -48.5F, -7F);

        gunModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[164].setRotationPoint(138F, -48.5F, -6F);

        gunModel[165].addShapeBox(0F, 0F, 0F, 16, 1, 10, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[165].setRotationPoint(138F, -47.5F, -5F);

        gunModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[166].setRotationPoint(153F, -48.5F, -6F);

        gunModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F); // Import
        gunModel[167].setRotationPoint(120F, -50.5F, -7F);

        gunModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F); // Import
        gunModel[168].setRotationPoint(135F, -50.5F, -7F);

        gunModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F); // Import
        gunModel[169].setRotationPoint(138F, -50.5F, -7F);

        gunModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F); // Import
        gunModel[170].setRotationPoint(153F, -50.5F, -7F);

        gunModel[171].addShapeBox(0F, 0F, 0F, 2, 2, 17, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        gunModel[171].setRotationPoint(154F, -50.5F, -8.5F);

        gunModel[172].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F); // Import
        gunModel[172].setRotationPoint(154F, -48.5F, -7F);

        gunModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[173].setRotationPoint(156F, -48.5F, -6F);

        gunModel[174].addShapeBox(0F, 0F, 0F, 16, 1, 10, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[174].setRotationPoint(156F, -47.5F, -5F);

        gunModel[175].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F); // Import
        gunModel[175].setRotationPoint(172F, -48.5F, -7F);

        gunModel[176].addShapeBox(0F, 0F, 0F, 16, 1, 10, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[176].setRotationPoint(174F, -47.5F, -5F);

        gunModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F); // Import
        gunModel[177].setRotationPoint(156F, -50.5F, -7F);

        gunModel[178].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F); // Import
        gunModel[178].setRotationPoint(190F, -48.5F, -7F);

        gunModel[179].addShapeBox(0F, 0F, 0F, 16, 1, 10, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[179].setRotationPoint(192F, -47.5F, -5F);

        gunModel[180].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F); // Import
        gunModel[180].setRotationPoint(208F, -48.5F, -7F);

        gunModel[181].addShapeBox(0F, 0F, 0F, 16, 1, 10, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[181].setRotationPoint(210F, -47.5F, -5F);

        gunModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[182].setRotationPoint(225F, -48.5F, -6F);

        gunModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F); // Import
        gunModel[183].setRotationPoint(225F, -50.5F, -7F);

        gunModel[184].addShapeBox(0F, 0F, 0F, 2, 2, 17, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        gunModel[184].setRotationPoint(226F, -50.5F, -8.5F);

        gunModel[185].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F); // Import
        gunModel[185].setRotationPoint(226F, -48.5F, -7F);

        gunModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[186].setRotationPoint(228F, -48.5F, -6F);

        gunModel[187].addShapeBox(0F, 0F, 0F, 16, 1, 10, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[187].setRotationPoint(228F, -47.5F, -5F);

        gunModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[188].setRotationPoint(243F, -48.5F, -6F);

        gunModel[189].addShapeBox(0F, 0F, 0F, 2, 2, 17, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        gunModel[189].setRotationPoint(244F, -50.5F, -8.5F);

        gunModel[190].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F); // Import
        gunModel[190].setRotationPoint(244F, -48.5F, -7F);

        gunModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[191].setRotationPoint(246F, -48.5F, -6F);

        gunModel[192].addShapeBox(0F, 0F, 0F, 16, 1, 10, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[192].setRotationPoint(246F, -47.5F, -5F);

        gunModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[193].setRotationPoint(261F, -48.5F, -6F);

        gunModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F); // Import
        gunModel[194].setRotationPoint(228F, -50.5F, -7F);

        gunModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F); // Import
        gunModel[195].setRotationPoint(243F, -50.5F, -7F);

        gunModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F); // Import
        gunModel[196].setRotationPoint(246F, -50.5F, -7F);

        gunModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F); // Import
        gunModel[197].setRotationPoint(261F, -50.5F, -7F);

        gunModel[198].addShapeBox(0F, 0F, 0F, 2, 2, 17, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        gunModel[198].setRotationPoint(262F, -50.5F, -8.5F);

        gunModel[199].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F); // Import
        gunModel[199].setRotationPoint(262F, -48.5F, -7F);

        gunModel[200].addShapeBox(0F, 0F, 0F, 95, 3, 9, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[200].setRotationPoint(258F, -59F, -4.5F);

        gunModel[201].addShapeBox(0F, 0F, 0F, 95, 3, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[201].setRotationPoint(258F, -56F, -4.5F);

        gunModel[202].addShapeBox(0F, 0F, 0F, 95, 3, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F); // Import
        gunModel[202].setRotationPoint(258F, -53F, -4.5F);

        gunModel[203].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        gunModel[203].setRotationPoint(264F, -56F, 2F);

        gunModel[204].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        gunModel[204].setRotationPoint(264F, -59.5F, 2F);

        gunModel[205].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F); // Import
        gunModel[205].setRotationPoint(264F, -52.5F, 2F);

        gunModel[206].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        gunModel[206].setRotationPoint(264F, -56F, -5F);

        gunModel[207].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        gunModel[207].setRotationPoint(264F, -59.5F, -5F);

        gunModel[208].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        gunModel[208].setRotationPoint(264F, -56F, -1.5F);

        gunModel[209].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        gunModel[209].setRotationPoint(264F, -59.5F, -1.5F);

        gunModel[210].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        gunModel[210].setRotationPoint(264F, -52.5F, -5F);

        gunModel[211].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        gunModel[211].setRotationPoint(264F, -52.5F, -1.5F);

        gunModel[212].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[212].setRotationPoint(275F, -56.5F, -6F);

        gunModel[213].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[213].setRotationPoint(275F, -60.5F, -6F);

        gunModel[214].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[214].setRotationPoint(275F, -52.5F, -6F);

        gunModel[215].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[215].setRotationPoint(283F, -56.5F, -6F);

        gunModel[216].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[216].setRotationPoint(283F, -60.5F, -6F);

        gunModel[217].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[217].setRotationPoint(283F, -52.5F, -6F);

        gunModel[218].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[218].setRotationPoint(283F, -49.5F, -3F);

        gunModel[219].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[219].setRotationPoint(283F, -49.5F, 2F);

        gunModel[220].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[220].setRotationPoint(283F, -47.5F, 2F);

        gunModel[221].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[221].setRotationPoint(283F, -47.5F, -3F);

        gunModel[222].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[222].setRotationPoint(283F, -48.5F, 1F);

        gunModel[223].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[223].setRotationPoint(283F, -48.5F, -2F);

        gunModel[224].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[224].setRotationPoint(283F, -46F, -2F);

        gunModel[225].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[225].setRotationPoint(264F, -56.5F, -6F);

        gunModel[226].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[226].setRotationPoint(264F, -60.5F, -6F);

        gunModel[227].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F); // Import
        gunModel[227].setRotationPoint(264F, -52.5F, -6F);

        gunModel[228].addShapeBox(0F, 0F, 0F, 24, 8, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[228].setRotationPoint(238F, -69F, 8F);

        gunModel[229].addShapeBox(0F, 0F, 0F, 24, 8, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[229].setRotationPoint(238F, -69F, -10F);

        gunModel[230].addShapeBox(0F, 0F, 0F, 92, 2, 2, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[230].setRotationPoint(167F, -77F, -9F);

        gunModel[231].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F, 0.0F, 0.0F, -2.0F, 0.0F, -3.0F, -2.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F); // Import
        gunModel[231].setRotationPoint(155F, -80F, -9F);

        gunModel[232].addShapeBox(0F, 0F, 0F, 47, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[232].setRotationPoint(108F, -80F, 7F);

        gunModel[233].addShapeBox(0F, 0F, 0F, 31, 2, 14, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[233].setRotationPoint(108F, -80F, -7F);

        gunModel[234].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[234].setRotationPoint(139F, -80F, -2.5F);

        gunModel[235].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[235].setRotationPoint(139F, -80F, -7F);

        gunModel[236].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[236].setRotationPoint(139F, -80F, 6F);

        gunModel[237].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[237].setRotationPoint(139F, -80F, 2F);

        gunModel[238].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[238].setRotationPoint(139F, -80F, 3F);

        gunModel[239].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[239].setRotationPoint(139F, -80F, -6F);

        gunModel[240].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[240].setRotationPoint(155F, -80F, -3F);

        gunModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[241].setRotationPoint(154F, -80F, -1.5F);

        gunModel[242].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[242].setRotationPoint(139F, -80F, 0.5F);

        gunModel[243].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[243].setRotationPoint(139F, -80F, -1.5F);

        gunModel[244].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[244].setRotationPoint(154F, -80F, 0.5F);

        gunModel[245].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[245].setRotationPoint(155F, -80F, 6F);

        gunModel[246].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[246].setRotationPoint(155F, -80F, -7F);

        gunModel[247].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[247].setRotationPoint(146F, -80F, -4F);

        gunModel[248].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[248].setRotationPoint(146F, -80F, -6F);

        gunModel[249].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[249].setRotationPoint(146F, -80F, 5F);

        gunModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[250].setRotationPoint(146F, -80F, 3F);

        gunModel[251].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F, 0.0F, 0.25F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        gunModel[251].setRotationPoint(162F, -78F, 2F);

        gunModel[252].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, -0.25F, 0.5F); // Import
        gunModel[252].setRotationPoint(162F, -78F, -7F);

        gunModel[253].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[253].setRotationPoint(161F, -79F, 5F);

        gunModel[254].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[254].setRotationPoint(161F, -79F, 3F);

        gunModel[255].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[255].setRotationPoint(161F, -79F, -4F);

        gunModel[256].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[256].setRotationPoint(161F, -79F, -6F);

        gunModel[257].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[257].setRotationPoint(162F, -78F, -1.5F);

        gunModel[258].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[258].setRotationPoint(162F, -78F, 0.5F);

        gunModel[259].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[259].setRotationPoint(167F, -77F, -7F);

        gunModel[260].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[260].setRotationPoint(167F, -77F, 1.5F);

        gunModel[261].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[261].setRotationPoint(169F, -77F, 1.5F);

        gunModel[262].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[262].setRotationPoint(169F, -77F, -3F);

        gunModel[263].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[263].setRotationPoint(169F, -77F, 6F);

        gunModel[264].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[264].setRotationPoint(169F, -77F, -7F);

        gunModel[265].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[265].setRotationPoint(178F, -77F, -1.5F);

        gunModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[266].setRotationPoint(177F, -77F, -1.5F);

        gunModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[267].setRotationPoint(177F, -77F, 0.5F);

        gunModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[268].setRotationPoint(184F, -77F, -6F);

        gunModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[269].setRotationPoint(184F, -77F, -4F);

        gunModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[270].setRotationPoint(184F, -77F, 3F);

        gunModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[271].setRotationPoint(184F, -77F, 5F);

        gunModel[272].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[272].setRotationPoint(185F, -77F, 2F);

        gunModel[273].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[273].setRotationPoint(185F, -77F, -6.5F);

        gunModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[274].setRotationPoint(169F, -77F, 5F);

        gunModel[275].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[275].setRotationPoint(169F, -77F, 3F);

        gunModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[276].setRotationPoint(169F, -77F, -4F);

        gunModel[277].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[277].setRotationPoint(169F, -77F, -6F);

        gunModel[278].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[278].setRotationPoint(192F, -77F, 1.5F);

        gunModel[279].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[279].setRotationPoint(192F, -77F, -3F);

        gunModel[280].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[280].setRotationPoint(192F, -77F, 6F);

        gunModel[281].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[281].setRotationPoint(192F, -77F, -7F);

        gunModel[282].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[282].setRotationPoint(207F, -77F, -6F);

        gunModel[283].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[283].setRotationPoint(207F, -77F, -4F);

        gunModel[284].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[284].setRotationPoint(207F, -77F, 3F);

        gunModel[285].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[285].setRotationPoint(207F, -77F, 5F);

        gunModel[286].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[286].setRotationPoint(192F, -77F, 5F);

        gunModel[287].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[287].setRotationPoint(192F, -77F, 3F);

        gunModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[288].setRotationPoint(192F, -77F, -4F);

        gunModel[289].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[289].setRotationPoint(192F, -77F, -6F);

        gunModel[290].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[290].setRotationPoint(200F, -77F, -1.5F);

        gunModel[291].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[291].setRotationPoint(200F, -77F, 0.5F);

        gunModel[292].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[292].setRotationPoint(185F, -77F, 0.5F);

        gunModel[293].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[293].setRotationPoint(185F, -77F, -1.5F);

        gunModel[294].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[294].setRotationPoint(201F, -77F, -1.5F);

        gunModel[295].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[295].setRotationPoint(208F, -77F, 2F);

        gunModel[296].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[296].setRotationPoint(208F, -77F, -6.5F);

        gunModel[297].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[297].setRotationPoint(215F, -77F, 1.5F);

        gunModel[298].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[298].setRotationPoint(215F, -77F, -3F);

        gunModel[299].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[299].setRotationPoint(215F, -77F, 6F);

        gunModel[300].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[300].setRotationPoint(215F, -77F, -7F);

        gunModel[301].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[301].setRotationPoint(230F, -77F, -6F);

        gunModel[302].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[302].setRotationPoint(230F, -77F, -4F);

        gunModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[303].setRotationPoint(230F, -77F, 3F);

        gunModel[304].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[304].setRotationPoint(230F, -77F, 5F);

        gunModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[305].setRotationPoint(215F, -77F, 5F);

        gunModel[306].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[306].setRotationPoint(215F, -77F, 3F);

        gunModel[307].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[307].setRotationPoint(215F, -77F, -4F);

        gunModel[308].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[308].setRotationPoint(215F, -77F, -6F);

        gunModel[309].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[309].setRotationPoint(223F, -77F, -1.5F);

        gunModel[310].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[310].setRotationPoint(223F, -77F, 0.5F);

        gunModel[311].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[311].setRotationPoint(208F, -77F, 0.5F);

        gunModel[312].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[312].setRotationPoint(208F, -77F, -1.5F);

        gunModel[313].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[313].setRotationPoint(224F, -77F, -1.5F);

        gunModel[314].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[314].setRotationPoint(231F, -77F, 2F);

        gunModel[315].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[315].setRotationPoint(231F, -77F, -6.5F);

        gunModel[316].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[316].setRotationPoint(238F, -77F, 1.5F);

        gunModel[317].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[317].setRotationPoint(238F, -77F, -3F);

        gunModel[318].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[318].setRotationPoint(238F, -77F, 6F);

        gunModel[319].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[319].setRotationPoint(238F, -77F, -7F);

        gunModel[320].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[320].setRotationPoint(253F, -77F, -6F);

        gunModel[321].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[321].setRotationPoint(253F, -77F, -4F);

        gunModel[322].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[322].setRotationPoint(253F, -77F, 3F);

        gunModel[323].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[323].setRotationPoint(253F, -77F, 5F);

        gunModel[324].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[324].setRotationPoint(238F, -77F, 5F);

        gunModel[325].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[325].setRotationPoint(238F, -77F, 3F);

        gunModel[326].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[326].setRotationPoint(238F, -77F, -4F);

        gunModel[327].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[327].setRotationPoint(238F, -77F, -6F);

        gunModel[328].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[328].setRotationPoint(246F, -77F, -1.5F);

        gunModel[329].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[329].setRotationPoint(246F, -77F, 0.5F);

        gunModel[330].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[330].setRotationPoint(231F, -77F, 0.5F);

        gunModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[331].setRotationPoint(231F, -77F, -1.5F);

        gunModel[332].addShapeBox(0F, 0F, 0F, 5, 2, 14, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[332].setRotationPoint(254F, -77F, -7F);

        gunModel[333].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[333].setRotationPoint(247F, -77F, -1.5F);

        gunModel[334].addShapeBox(0F, 0F, 0F, 2, 6, 16, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[334].setRotationPoint(-3F, -41F, -8F);

        gunModel[335].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F, 4.0F, 0.0F, -2.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F); // Import
        gunModel[335].setRotationPoint(-2F, -45F, -8F);

        gunModel[336].addShapeBox(0F, 0F, 0F, 2, 3, 16, 0F, 4.0F, 0.0F, -2.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[336].setRotationPoint(-6F, -48F, -8F);

        gunModel[337].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F, 4.0F, 0.0F, -2.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[337].setRotationPoint(-10F, -50F, -8F);

        gunModel[338].addShapeBox(0F, 0F, 0F, 2, 3, 16, 0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[338].setRotationPoint(-14F, -53F, -8F);

        gunModel[339].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -2.0F); // Import
        gunModel[339].setRotationPoint(-3F, -35F, -8F);

        gunModel[340].addShapeBox(0F, 0F, 0F, 11, 2, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[340].setRotationPoint(-1F, -37F, -8F);

        gunModel[341].addShapeBox(0F, 0F, 0F, 2, 8, 16, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 5.0F, 0.0F, -2.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.0F, -2.0F); // Import
        gunModel[341].setRotationPoint(-5F, -31F, -8F);

        gunModel[342].addShapeBox(0F, 0F, 0F, 2, 8, 16, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 5.0F, 0.0F, -2.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.0F, -2.0F); // Import
        gunModel[342].setRotationPoint(-10F, -23F, -8F);

        gunModel[343].addShapeBox(0F, 0F, 0F, 2, 7, 16, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 4.0F, 0.0F, -2.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, -2.0F); // Import
        gunModel[343].setRotationPoint(-15F, -15F, -8F);

        gunModel[344].addShapeBox(0F, 0F, 0F, 2, 7, 16, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[344].setRotationPoint(-19F, -8F, -8F);

        gunModel[345].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F); // Import
        gunModel[345].setRotationPoint(-19F, -1F, -8F);

        gunModel[346].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F); // Import
        gunModel[346].setRotationPoint(-17F, 3F, -8F);

        gunModel[347].addShapeBox(0F, 0F, 0F, 21, 2, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import
        gunModel[347].setRotationPoint(-15F, 3F, -8F);

        gunModel[348].addShapeBox(0F, 0F, 0F, 19, 4, 16, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import
        gunModel[348].setRotationPoint(-17F, -1F, -8F);

        gunModel[349].addShapeBox(0F, 0F, 0F, 20, 7, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[349].setRotationPoint(-17F, -8F, -8F);

        gunModel[350].addShapeBox(0F, 0F, 0F, 11, 1, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); // Import
        gunModel[350].setRotationPoint(-1F, -35F, -8F);

        gunModel[351].addShapeBox(0F, 0F, 0F, 11, 4, 16, 0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[351].setRotationPoint(-1F, -45F, -8F);

        gunModel[352].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -3.0F, 1.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[352].setRotationPoint(6F, 3F, -8F);

        gunModel[353].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, -3.0F, 2.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[353].setRotationPoint(6F, -1F, -8F);

        gunModel[354].addShapeBox(0F, 0F, 0F, 4, 7, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[354].setRotationPoint(3F, -8F, -8F);

        gunModel[355].addShapeBox(0F, 0F, 0F, 4, 26, 16, 0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -4.0F, 1.0F, 0.0F, -4.0F, -1.0F, 0.0F, 0.0F, 12.0F, 0.0F, 0.0F, -12.0F, 0.0F, -3.0F, -12.0F, 0.0F, -3.0F, 12.0F, 0.0F, 0.0F); // Import
        gunModel[355].setRotationPoint(15F, -34F, -8F);

        gunModel[356].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -4.0F, 1.0F, 0.0F, -4.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[356].setRotationPoint(16F, -35F, -8F);

        gunModel[357].addShapeBox(0F, 0F, 0F, 6, 2, 16, 0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[357].setRotationPoint(15F, -37F, -8F);

        gunModel[358].addShapeBox(0F, 0F, 0F, 8, 4, 16, 0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -4.0F, -2.0F, 0.0F, -4.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[358].setRotationPoint(13F, -41F, -8F);

        gunModel[359].addShapeBox(0F, 0F, 0F, 7, 3, 16, 0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, -4.0F, -1.0F, 0.0F, -4.0F, 2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[359].setRotationPoint(12F, -44F, -8F);

        gunModel[360].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[360].setRotationPoint(106F, -50.5F, -8F);

        gunModel[361].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -2.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, -2.0F, 0.0F, -2.5F); // Import
        gunModel[361].setRotationPoint(106F, -48.5F, -7F);

        gunModel[362].addShapeBox(0F, 0F, 0F, 7, 5, 16, 0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[362].setRotationPoint(11F, -49F, -8F);

        gunModel[363].addShapeBox(0F, 0F, 0F, 7, 2, 16, 0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[363].setRotationPoint(11F, -51F, -8F);

        gunModel[364].addShapeBox(0F, 0F, 0F, 14, 3, 16, 0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[364].setRotationPoint(-4F, -48F, -8F);

        gunModel[365].addShapeBox(0F, 0F, 0F, 18, 2, 16, 0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[365].setRotationPoint(-8F, -50F, -8F);

        gunModel[366].addShapeBox(0F, 0F, 0F, 22, 1, 16, 0F, 0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[366].setRotationPoint(-12F, -51F, -8F);

        gunModel[367].addShapeBox(0F, 0F, 0F, 21, 2, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F); // Import
        gunModel[367].setRotationPoint(-13F, -53F, -8F);

        gunModel[368].addShapeBox(0F, 0F, 0F, 7, 4, 16, 0F, 2.25F, -2.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 2.25F, -2.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F); // Import
        gunModel[368].setRotationPoint(11F, -74F, -8F);

        gunModel[369].addShapeBox(0F, 0F, 0F, 9, 3, 12, 0F, 1.0F, -2.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 1.0F, -2.0F, -4.0F, 0.25F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 2.0F, 2.0F); // Import
        gunModel[369].setRotationPoint(9F, -77F, -6F);

        gunModel[370].addShapeBox(0F, 0F, 0F, 10, 19, 16, 0F, 0.0F, 0.0F, 0.0F, -8.25F, 0.0F, 0.0F, -8.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[370].setRotationPoint(8F, -70F, -8F);

        gunModel[371].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[371].setRotationPoint(8F, -72F, -8F);

        gunModel[372].addShapeBox(0F, 0F, 0F, 2, 3, 16, 0F, 0.0F, 0.0F, -6.0F, -1.0F, 0.0F, -6.0F, -1.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[372].setRotationPoint(7F, -75F, -8F);

        gunModel[373].addShapeBox(0F, 0F, 0F, 2, 8, 20, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[373].setRotationPoint(-15F, -61F, -10F);

        gunModel[374].addShapeBox(0F, 0F, 0F, 21, 10, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[374].setRotationPoint(-13F, -63F, -8F);

        gunModel[375].addShapeBox(0F, 0F, 0F, 2, 3, 16, 0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[375].setRotationPoint(-15F, -66F, -8F);

        gunModel[376].addShapeBox(0F, 0F, 0F, 2, 3, 16, 0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[376].setRotationPoint(-13F, -69F, -8F);

        gunModel[377].addShapeBox(0F, 0F, 0F, 2, 3, 18, 0F, -6.0F, 0.0F, -2.0F, 6.0F, 0.0F, -2.0F, 6.0F, 0.0F, -2.0F, -6.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[377].setRotationPoint(-9F, -72F, -9F);

        gunModel[378].addShapeBox(0F, 0F, 0F, 8, 4, 18, 0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[378].setRotationPoint(-1F, -75F, -9F);

        gunModel[379].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F, 0.0F, -2.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[379].setRotationPoint(-3F, -74F, -9F);

        gunModel[380].addShapeBox(0F, 0F, 0F, 21, 3, 16, 0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[380].setRotationPoint(-13F, -66F, -8F);

        gunModel[381].addShapeBox(0F, 0F, 0F, 19, 3, 16, 0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[381].setRotationPoint(-11F, -69F, -8F);

        gunModel[382].addShapeBox(0F, 0F, 0F, 60, 35, 2, 0F, 0.0F, -19.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -21.0F, 0.0F, 0.0F, -21.0F, 0.0F, 0.0F, -2.0F, 0.0F); // Import
        gunModel[382].setRotationPoint(-58F, -73F, -9F);

        gunModel[383].addShapeBox(0F, 0F, 0F, 54, 2, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[383].setRotationPoint(-112F, -54F, -9F);

        gunModel[384].addShapeBox(0F, 0F, 0F, 60, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[384].setRotationPoint(-118F, -42F, -9F);

        gunModel[385].addShapeBox(0F, 0F, 0F, 59, 10, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[385].setRotationPoint(-117.5F, -52F, -9F);

        gunModel[386].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[386].setRotationPoint(255F, -78.5F, -1F);

        gunModel[387].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[387].setRotationPoint(21F, -41F, -3.5F);

        gunModel[388].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[388].setRotationPoint(18F, -44F, -3.5F);

        gunModel[389].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F, 1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); // Import
        gunModel[389].setRotationPoint(19F, -47F, -3.5F);

        gunModel[390].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F, 1.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[390].setRotationPoint(18F, -49F, -3.5F);

        gunModel[391].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[391].setRotationPoint(21F, -37F, -3.5F);

        gunModel[392].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F, 1.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[392].setRotationPoint(24F, -49F, -2F);

        gunModel[393].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[393].setRotationPoint(24F, -44F, -2F);

        gunModel[394].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[394].setRotationPoint(24.5F, -42F, -2F);

        gunModel[395].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[395].setRotationPoint(24.5F, -39F, -2F);

        gunModel[396].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[396].setRotationPoint(25F, -37F, -2F);

        gunModel[397].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[397].setRotationPoint(24F, -37F, -3.5F);

        gunModel[398].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[398].setRotationPoint(30F, -33F, -3.5F);

        gunModel[399].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[399].setRotationPoint(32F, -32F, -3.5F);

        gunModel[400].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F); // Import
        gunModel[400].setRotationPoint(38F, -33F, -3.5F);

        gunModel[401].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[401].setRotationPoint(39F, -32.5F, -3.5F);

        gunModel[402].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[402].setRotationPoint(42F, -35.5F, -3.5F);

        gunModel[403].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[403].setRotationPoint(44F, -38.5F, -3.5F);

        gunModel[404].addShapeBox(0F, 0F, 0F, 5, 11, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[404].setRotationPoint(49F, -49.5F, -3.5F);

        gunModel[405].addShapeBox(0F, 0F, 0F, 5, 9, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F); // Import
        gunModel[405].setRotationPoint(54F, -49.5F, -3.5F);

        gunModel[406].addShapeBox(0F, 0F, 0F, 2, 7, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F); // Import
        gunModel[406].setRotationPoint(59F, -49.5F, -3.5F);

        gunModel[407].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[407].setRotationPoint(46F, -49.5F, -3.5F);

        gunModel[408].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[408].setRotationPoint(43F, -42.5F, -3.5F);

        gunModel[409].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F); // Import
        gunModel[409].setRotationPoint(61F, -49.5F, -3.5F);

        gunModel[410].addShapeBox(0F, 0F, 0F, 5, 6, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[410].setRotationPoint(41F, -48.5F, 3F);

        gunModel[411].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import
        gunModel[411].setRotationPoint(39F, -48.5F, 3F);

        gunModel[412].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[412].setRotationPoint(40F, -43.5F, 3F);

        gunModel[413].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[413].setRotationPoint(40F, -42.5F, 3F);

        gunModel[414].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[414].setRotationPoint(40F, -40.5F, 3F);

        gunModel[415].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[415].setRotationPoint(39F, -49.5F, 3F);

        gunModel[416].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[416].setRotationPoint(46F, -48.5F, 3F);

        gunModel[417].addShapeBox(0F, 0F, 0F, 4, 14, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[417].setRotationPoint(2F, -73F, -9F);

        gunModel[418].addShapeBox(0F, 0F, 0F, 4, 14, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[418].setRotationPoint(6F, -74F, -9F);

        gunModel[419].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[419].setRotationPoint(10F, -70F, -9F);

        gunModel[420].addShapeBox(0F, 0F, 0F, 60, 35, 2, 0F, 0.0F, -19.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -21.0F, 0.0F, 0.0F, -21.0F, 0.0F, 0.0F, -2.0F, 0.0F); // Import
        gunModel[420].setRotationPoint(-58F, -73F, 7F);

        gunModel[421].addShapeBox(0F, 0F, 0F, 54, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[421].setRotationPoint(-112F, -54F, 7F);

        gunModel[422].addShapeBox(0F, 0F, 0F, 60, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[422].setRotationPoint(-118F, -42F, 7F);

        gunModel[423].addShapeBox(0F, 0F, 0F, 7, 10, 2, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[423].setRotationPoint(-65F, -52F, 7F);

        gunModel[424].addShapeBox(0F, 0F, 0F, 9, 10, 2, 0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[424].setRotationPoint(-118F, -52F, 7F);

        gunModel[425].addShapeBox(0F, 0F, 0F, 4, 8, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[425].setRotationPoint(-76.5F, -50F, 7F);

        gunModel[426].addShapeBox(0F, 0F, 0F, 4, 8, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[426].setRotationPoint(-88.5F, -50F, 7F);

        gunModel[427].addShapeBox(0F, 0F, 0F, 4, 8, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[427].setRotationPoint(-100.5F, -50F, 7F);

        gunModel[428].addShapeBox(0F, 0F, 0F, 44, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[428].setRotationPoint(-108.5F, -52F, 7F);

        gunModel[429].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[429].setRotationPoint(-84.5F, -50F, 7F);

        gunModel[430].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[430].setRotationPoint(-84.5F, -44F, 7F);

        gunModel[431].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import
        gunModel[431].setRotationPoint(-78.5F, -50F, 7F);

        gunModel[432].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[432].setRotationPoint(-78.5F, -44F, 7F);

        gunModel[433].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[433].setRotationPoint(-96.5F, -50F, 7F);

        gunModel[434].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[434].setRotationPoint(-96.5F, -44F, 7F);

        gunModel[435].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import
        gunModel[435].setRotationPoint(-90.5F, -50F, 7F);

        gunModel[436].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[436].setRotationPoint(-90.5F, -44F, 7F);

        gunModel[437].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[437].setRotationPoint(-108.5F, -50F, 7F);

        gunModel[438].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[438].setRotationPoint(-108.5F, -44F, 7F);

        gunModel[439].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import
        gunModel[439].setRotationPoint(-102.5F, -50F, 7F);

        gunModel[440].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[440].setRotationPoint(-102.5F, -44F, 7F);

        gunModel[441].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[441].setRotationPoint(-72.5F, -50F, 7F);

        gunModel[442].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[442].setRotationPoint(-72.5F, -44F, 7F);

        gunModel[443].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import
        gunModel[443].setRotationPoint(-66.5F, -50F, 7F);

        gunModel[444].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[444].setRotationPoint(-66.5F, -44F, 7F);

        gunModel[445].addShapeBox(0F, 0F, 0F, 4, 14, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[445].setRotationPoint(2F, -73F, 7F);

        gunModel[446].addShapeBox(0F, 0F, 0F, 4, 14, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[446].setRotationPoint(6F, -74F, 7F);

        gunModel[447].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[447].setRotationPoint(10F, -70F, 7F);

        gunModel[448].addShapeBox(0F, 0F, 0F, 58, 23, 1, 0F, 0.0F, -19.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -22.0F, 0.0F, 0.0F, -22.0F, 0.0F, 0.0F, -2.0F, 0.0F); // Import
        gunModel[448].setRotationPoint(-56F, -71F, 9.5F);

        gunModel[449].addShapeBox(0F, 0F, 0F, 58, 23, 1, 0F, 0.0F, -19.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -21.0F, 0.0F, 0.0F, -21.0F, 0.0F, 0.0F, -2.0F, 0.0F); // Import
        gunModel[449].setRotationPoint(-56F, -63F, 9.5F);

        gunModel[450].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F); // Import
        gunModel[450].setRotationPoint(-58F, -44F, 9.5F);

        gunModel[451].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F); // Import
        gunModel[451].setRotationPoint(-58F, -52F, 9.5F);

        gunModel[452].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F); // Import
        gunModel[452].setRotationPoint(-59F, -50F, 9.5F);

        gunModel[453].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[453].setRotationPoint(6F, -64F, 9.5F);

        gunModel[454].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[454].setRotationPoint(6F, -72F, 9.5F);

        gunModel[455].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[455].setRotationPoint(2F, -72F, 9.5F);

        gunModel[456].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[456].setRotationPoint(2F, -63F, 9.5F);

        gunModel[457].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[457].setRotationPoint(9F, -70.5F, 9.5F);

        gunModel[458].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -1.5F, 0.0F); // Import
        gunModel[458].setRotationPoint(8F, -68.5F, 9.5F);

        gunModel[459].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[459].setRotationPoint(-58F, -48F, 9.5F);

        gunModel[460].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[460].setRotationPoint(-58F, -47F, 9.5F);

        gunModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[461].setRotationPoint(8F, -66.5F, 9.5F);

        gunModel[462].addShapeBox(0F, 0F, 0F, 6, 2, 21, 0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[462].setRotationPoint(0F, -69.5F, -10.5F);

        gunModel[463].addShapeBox(0F, 0F, 0F, 6, 2, 21, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[463].setRotationPoint(0F, -67.55F, -10.5F);

        gunModel[464].addShapeBox(0F, 0F, 0F, 6, 2, 21, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F); // Import
        gunModel[464].setRotationPoint(0F, -65.6F, -10.5F);

        gunModel[465].addShapeBox(0F, 0F, 0F, 12, 2, 20, 0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[465].setRotationPoint(-131F, -52F, -10F);

        gunModel[466].addShapeBox(0F, 0F, 0F, 2, 42, 20, 0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[466].setRotationPoint(-119F, -50F, -10F);

        gunModel[467].addShapeBox(0F, 0F, 0F, 12, 38, 20, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[467].setRotationPoint(-131F, -50F, -10F);

        gunModel[468].addShapeBox(0F, 0F, 0F, 13, 17, 2, 0F, 0.0F, -3.0F, 0.0F, 0.0F, 1.1F, 0.0F, -6.0F, -0.9F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.15F, 0.0F, -6.0F, -4.15F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[468].setRotationPoint(-58F, -57F, -7F);

        gunModel[469].addShapeBox(0F, 0F, 0F, 13, 17, 2, 0F, 0.0F, -3.0F, 0.0F, -6.0F, -0.9F, 0.0F, 0.0F, 1.1F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, -4.15F, 0.0F, 0.0F, -4.15F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[469].setRotationPoint(-58F, -57F, 5F);

        gunModel[470].addShapeBox(0F, 0F, 0F, 13, 17, 5, 0F, 0.0F, -3.0F, 0.0F, -13.0F, -2.9F, 0.0F, -6.0F, -0.9F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -12.0F, -4.15F, 0.0F, -6.0F, -4.15F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[470].setRotationPoint(-58F, -57F, 0F);

        gunModel[471].addShapeBox(0F, 0F, 0F, 13, 17, 5, 0F, 0.0F, -3.0F, 0.0F, -6.0F, -0.9F, 0.0F, -13.0F, -2.9F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, -4.15F, 0.0F, -12.0F, -4.15F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[471].setRotationPoint(-58F, -57F, -5F);

        gunModel[472].addShapeBox(0F, 0F, 0F, 28, 19, 4, 0F, 8.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[472].setRotationPoint(18F, -70F, -8F);

        gunModel[473].addShapeBox(0F, 0F, 0F, 60, 11, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[473].setRotationPoint(46F, -62F, -8F);

        gunModel[474].addShapeBox(0F, 0F, 0F, 20, 3, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[474].setRotationPoint(46F, -70F, -8F);

        gunModel[475].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[475].setRotationPoint(46F, -64F, -8F);

        gunModel[476].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[476].setRotationPoint(46F, -67F, -8F);

        gunModel[477].addShapeBox(0F, 0F, 0F, 6, 8, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[477].setRotationPoint(100F, -70F, -8F);

        gunModel[478].addShapeBox(0F, 0F, 0F, 38, 4, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[478].setRotationPoint(68F, -74F, -4F);

        gunModel[479].addShapeBox(0F, 0F, 0F, 7, 4, 12, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[479].setRotationPoint(99F, -74F, -8F);

        gunModel[480].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import
        gunModel[480].setRotationPoint(98F, -70F, -8F);

        gunModel[481].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[481].setRotationPoint(68F, -74F, -8F);

        gunModel[482].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F); // Import
        gunModel[482].setRotationPoint(71F, -74F, -8F);

        gunModel[483].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[483].setRotationPoint(66F, -70F, -8F);

        gunModel[484].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F); // Import
        gunModel[484].setRotationPoint(97F, -74F, -8F);

        gunModel[485].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F); // Import
        gunModel[485].setRotationPoint(94F, -74F, -8F);

        gunModel[486].addShapeBox(0F, 0F, 0F, 20, 4, 12, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F); // Import
        gunModel[486].setRotationPoint(74F, -74F, -8F);

        gunModel[487].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[487].setRotationPoint(-15F, -63F, -9F);

        gunModel[488].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[488].setRotationPoint(7F, -75F, -7F);

        gunModel[489].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[489].setRotationPoint(7F, -75F, 2F);

        gunModel[490].addShapeBox(0F, 0F, 0F, 34, 4, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[490].setRotationPoint(70F, -79F, -3F);

        gunModel[491].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[491].setRotationPoint(324F, -76.5F, -1F);

        gunModel[492].addShapeBox(0F, 0F, 0F, 8, 7, 2, 0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[492].setRotationPoint(324F, -83.5F, -1F);

        gunModel[493].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[493].setRotationPoint(324F, -85.5F, -1F);

        gunModel[494].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[494].setRotationPoint(324F, -74.5F, -1F);

        gunModel[495].addShapeBox(0F, 0F, 0F, 12, 4, 20, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4F, 0.0F, 0F); // Import
        gunModel[495].setRotationPoint(-131F, -12F, -10F);

        gunModel[496].addShapeBox(0F, 0F, 0F, 20, 7, 16, 0F, -4F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, -4F, 0.0F, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[496].setRotationPoint(-17F, -15F, -8F);

        gunModel[497].addShapeBox(0F, 0F, 0F, 20, 8, 16, 0F, -5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, -5F, 0.0F, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[497].setRotationPoint(-13F, -23F, -8F);

        gunModel[498].addShapeBox(0F, 0F, 0F, 19, 8, 16, 0F, -5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, -5F, 0.0F, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[498].setRotationPoint(-8F, -31F, -8F);

        gunModel[499].addShapeBox(0F, 0F, 0F, 19, 3, 16, 0F, -5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, -5F, 0.0F, 0F, -3.5F, 0.0F, 0.0F, 2F, 0.0F, 0.0F, 2F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F); // Import
        gunModel[499].setRotationPoint(-6.5F, -34F, -8F);
    }

    private void initgunModel_2() {
        gunModel[500] = new ModelRendererTurbo(this, 217, 393, textureX, textureY); // Import
        gunModel[501] = new ModelRendererTurbo(this, 937, 161, textureX, textureY); // Import
        gunModel[502] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Import
        gunModel[503] = new ModelRendererTurbo(this, 593, 217, textureX, textureY); // Import
        gunModel[504] = new ModelRendererTurbo(this, 145, 257, textureX, textureY); // Import
        gunModel[505] = new ModelRendererTurbo(this, 857, 257, textureX, textureY); // Import
        gunModel[506] = new ModelRendererTurbo(this, 233, 265, textureX, textureY); // Import
        gunModel[507] = new ModelRendererTurbo(this, 417, 265, textureX, textureY); // Import
        gunModel[508] = new ModelRendererTurbo(this, 521, 265, textureX, textureY); // Import
        gunModel[509] = new ModelRendererTurbo(this, 569, 265, textureX, textureY); // Import

        gunModel[500].addShapeBox(0F, 0F, 0F, 34, 1, 6, 0F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[500].setRotationPoint(70F, -80F, -3F);

        gunModel[501].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[501].setRotationPoint(70F, -81F, -3F);

        gunModel[502].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[502].setRotationPoint(74F, -81F, -3F);

        gunModel[503].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[503].setRotationPoint(78F, -81F, -3F);

        gunModel[504].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[504].setRotationPoint(82F, -81F, -3F);

        gunModel[505].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[505].setRotationPoint(86F, -81F, -3F);

        gunModel[506].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[506].setRotationPoint(90F, -81F, -3F);

        gunModel[507].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[507].setRotationPoint(94F, -81F, -3F);

        gunModel[508].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[508].setRotationPoint(98F, -81F, -3F);

        gunModel[509].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import
        gunModel[509].setRotationPoint(102F, -81F, -3F);
    }

    private void initdefaultScopeModel_1() {
        defaultScopeModel[0] = new ModelRendererTurbo(this, 881, 209, textureX, textureY); // Import
        defaultScopeModel[1] = new ModelRendererTurbo(this, 313, 169, textureX, textureY); // Import
        defaultScopeModel[2] = new ModelRendererTurbo(this, 585, 65, textureX, textureY); // Import
        defaultScopeModel[3] = new ModelRendererTurbo(this, 625, 65, textureX, textureY); // Import
        defaultScopeModel[4] = new ModelRendererTurbo(this, 665, 65, textureX, textureY); // Import
        defaultScopeModel[5] = new ModelRendererTurbo(this, 705, 65, textureX, textureY); // Import
        defaultScopeModel[6] = new ModelRendererTurbo(this, 761, 65, textureX, textureY); // Import
        defaultScopeModel[7] = new ModelRendererTurbo(this, 785, 65, textureX, textureY); // Import
        defaultScopeModel[8] = new ModelRendererTurbo(this, 801, 65, textureX, textureY); // Import
        defaultScopeModel[9] = new ModelRendererTurbo(this, 825, 65, textureX, textureY); // Import
        defaultScopeModel[10] = new ModelRendererTurbo(this, 841, 65, textureX, textureY); // Import
        defaultScopeModel[11] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Import
        defaultScopeModel[12] = new ModelRendererTurbo(this, 881, 65, textureX, textureY); // Import
        defaultScopeModel[13] = new ModelRendererTurbo(this, 865, 65, textureX, textureY); // Import
        defaultScopeModel[14] = new ModelRendererTurbo(this, 905, 65, textureX, textureY); // Import
        defaultScopeModel[15] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Import
        defaultScopeModel[16] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Import
        defaultScopeModel[17] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Import

        defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[0].setRotationPoint(110F, -81F, -3F);

        defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[1].setRotationPoint(110F, -82.5F, -3F);

        defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[2].setRotationPoint(110F, -86.5F, -3F);

        defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[3].setRotationPoint(113F, -84.5F, -3F);

        defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -1.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[4].setRotationPoint(110F, -88.5F, -3F);

        defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[5].setRotationPoint(110F, -86.5F, 2F);

        defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[6].setRotationPoint(113F, -84.5F, 2F);

        defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[7].setRotationPoint(110F, -88.5F, 2F);

        defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F); // Import
        defaultScopeModel[8].setRotationPoint(111F, -88.5F, -2F);

        defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        defaultScopeModel[9].setRotationPoint(110F, -87.5F, -2F);

        defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[10].setRotationPoint(110F, -87.5F, 1F);

        defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[11].setRotationPoint(110F, -83.5F, -2F);

        defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -1.25F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, -1.25F, -0.5F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        defaultScopeModel[12].setRotationPoint(111F, -89.5F, -2F);

        defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[13].setRotationPoint(110F, -85.25F, -2F);

        defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[14].setRotationPoint(110F, -85.25F, 1F);

        defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        defaultScopeModel[15].setRotationPoint(110F, -84F, 0F);

        defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F); // Import
        defaultScopeModel[16].setRotationPoint(110F, -84F, -2F);

        defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[17].setRotationPoint(120F, -81F, -3F);
    }

    private void initammoModel_1() {
        ammoModel[0] = new ModelRendererTurbo(this, 865, 345, textureX, textureY); // Import
        ammoModel[1] = new ModelRendererTurbo(this, 289, 393, textureX, textureY); // Import
        ammoModel[2] = new ModelRendererTurbo(this, 385, 393, textureX, textureY); // Import

        ammoModel[0].addShapeBox(0F, 0F, 0F, 36, 3, 9, 0F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        ammoModel[0].setRotationPoint(68F, -68F, -4F);

        ammoModel[1].addShapeBox(0F, 0F, 0F, 36, 3, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        ammoModel[1].setRotationPoint(68F, -65F, -4F);

        ammoModel[2].addShapeBox(0F, 0F, 0F, 36, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import
        ammoModel[2].setRotationPoint(68F, -62F, -4F);
    }

    private void initpumpModel_1() {
        pumpModel[0] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Import
        pumpModel[1] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Import
        pumpModel[2] = new ModelRendererTurbo(this, 601, 361, textureX, textureY); // Import
        pumpModel[3] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Import
        pumpModel[4] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Import
        pumpModel[5] = new ModelRendererTurbo(this, 1017, 241, textureX, textureY); // Import
        pumpModel[6] = new ModelRendererTurbo(this, 1009, 265, textureX, textureY); // Import
        pumpModel[7] = new ModelRendererTurbo(this, 1017, 265, textureX, textureY); // Import
        pumpModel[8] = new ModelRendererTurbo(this, 521, 289, textureX, textureY); // Import
        pumpModel[9] = new ModelRendererTurbo(this, 1001, 289, textureX, textureY); // Import
        pumpModel[10] = new ModelRendererTurbo(this, 1009, 289, textureX, textureY); // Import
        pumpModel[11] = new ModelRendererTurbo(this, 1017, 289, textureX, textureY); // Import
        pumpModel[12] = new ModelRendererTurbo(this, 1001, 313, textureX, textureY); // Import
        pumpModel[13] = new ModelRendererTurbo(this, 1009, 313, textureX, textureY); // Import
        pumpModel[14] = new ModelRendererTurbo(this, 1017, 313, textureX, textureY); // Import
        pumpModel[15] = new ModelRendererTurbo(this, 345, 337, textureX, textureY); // Import
        pumpModel[16] = new ModelRendererTurbo(this, 353, 337, textureX, textureY); // Import
        pumpModel[17] = new ModelRendererTurbo(this, 505, 345, textureX, textureY); // Import
        pumpModel[18] = new ModelRendererTurbo(this, 873, 289, textureX, textureY); // Import
        pumpModel[19] = new ModelRendererTurbo(this, 393, 217, textureX, textureY); // Import
        pumpModel[20] = new ModelRendererTurbo(this, 713, 297, textureX, textureY); // Import
        pumpModel[21] = new ModelRendererTurbo(this, 737, 345, textureX, textureY); // Import
        pumpModel[22] = new ModelRendererTurbo(this, 745, 345, textureX, textureY); // Import
        pumpModel[23] = new ModelRendererTurbo(this, 753, 345, textureX, textureY); // Import
        pumpModel[24] = new ModelRendererTurbo(this, 761, 345, textureX, textureY); // Import
        pumpModel[25] = new ModelRendererTurbo(this, 961, 345, textureX, textureY); // Import
        pumpModel[26] = new ModelRendererTurbo(this, 969, 345, textureX, textureY); // Import
        pumpModel[27] = new ModelRendererTurbo(this, 977, 345, textureX, textureY); // Import
        pumpModel[28] = new ModelRendererTurbo(this, 985, 345, textureX, textureY); // Import
        pumpModel[29] = new ModelRendererTurbo(this, 217, 353, textureX, textureY); // Import
        pumpModel[30] = new ModelRendererTurbo(this, 225, 353, textureX, textureY); // Import
        pumpModel[31] = new ModelRendererTurbo(this, 513, 353, textureX, textureY); // Import
        pumpModel[32] = new ModelRendererTurbo(this, 521, 353, textureX, textureY); // Import
        pumpModel[33] = new ModelRendererTurbo(this, 529, 353, textureX, textureY); // Import
        pumpModel[34] = new ModelRendererTurbo(this, 537, 353, textureX, textureY); // Import
        pumpModel[35] = new ModelRendererTurbo(this, 329, 361, textureX, textureY); // Import
        pumpModel[36] = new ModelRendererTurbo(this, 345, 361, textureX, textureY); // Import
        pumpModel[37] = new ModelRendererTurbo(this, 681, 361, textureX, textureY); // Import
        pumpModel[38] = new ModelRendererTurbo(this, 697, 361, textureX, textureY); // Import
        pumpModel[39] = new ModelRendererTurbo(this, 713, 361, textureX, textureY); // Import
        pumpModel[40] = new ModelRendererTurbo(this, 769, 361, textureX, textureY); // Import
        pumpModel[41] = new ModelRendererTurbo(this, 785, 361, textureX, textureY); // Import
        pumpModel[42] = new ModelRendererTurbo(this, 801, 361, textureX, textureY); // Import
        pumpModel[43] = new ModelRendererTurbo(this, 817, 361, textureX, textureY); // Import
        pumpModel[44] = new ModelRendererTurbo(this, 833, 361, textureX, textureY); // Import
        pumpModel[45] = new ModelRendererTurbo(this, 849, 361, textureX, textureY); // Import
        pumpModel[46] = new ModelRendererTurbo(this, 865, 361, textureX, textureY); // Import
        pumpModel[47] = new ModelRendererTurbo(this, 881, 361, textureX, textureY); // Import
        pumpModel[48] = new ModelRendererTurbo(this, 897, 361, textureX, textureY); // Import
        pumpModel[49] = new ModelRendererTurbo(this, 569, 233, textureX, textureY); // Import
        pumpModel[50] = new ModelRendererTurbo(this, 961, 233, textureX, textureY); // Import
        pumpModel[51] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Import
        pumpModel[52] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Import
        pumpModel[53] = new ModelRendererTurbo(this, 945, 289, textureX, textureY); // Import
        pumpModel[54] = new ModelRendererTurbo(this, 913, 361, textureX, textureY); // Import
        pumpModel[55] = new ModelRendererTurbo(this, 929, 361, textureX, textureY); // Import
        pumpModel[56] = new ModelRendererTurbo(this, 945, 361, textureX, textureY); // Import
        pumpModel[57] = new ModelRendererTurbo(this, 993, 361, textureX, textureY); // Import
        pumpModel[58] = new ModelRendererTurbo(this, 1009, 361, textureX, textureY); // Import
        pumpModel[59] = new ModelRendererTurbo(this, 81, 369, textureX, textureY); // Import
        pumpModel[60] = new ModelRendererTurbo(this, 97, 369, textureX, textureY); // Import
        pumpModel[61] = new ModelRendererTurbo(this, 113, 369, textureX, textureY); // Import
        pumpModel[62] = new ModelRendererTurbo(this, 129, 369, textureX, textureY); // Import
        pumpModel[63] = new ModelRendererTurbo(this, 145, 369, textureX, textureY); // Import
        pumpModel[64] = new ModelRendererTurbo(this, 161, 369, textureX, textureY); // Import
        pumpModel[65] = new ModelRendererTurbo(this, 177, 369, textureX, textureY); // Import
        pumpModel[66] = new ModelRendererTurbo(this, 193, 369, textureX, textureY); // Import
        pumpModel[67] = new ModelRendererTurbo(this, 233, 369, textureX, textureY); // Import
        pumpModel[68] = new ModelRendererTurbo(this, 361, 241, textureX, textureY); // Import
        pumpModel[69] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Import
        pumpModel[70] = new ModelRendererTurbo(this, 417, 241, textureX, textureY); // Import
        pumpModel[71] = new ModelRendererTurbo(this, 457, 241, textureX, textureY); // Import
        pumpModel[72] = new ModelRendererTurbo(this, 225, 297, textureX, textureY); // Import
        pumpModel[73] = new ModelRendererTurbo(this, 497, 241, textureX, textureY); // Import
        pumpModel[74] = new ModelRendererTurbo(this, 785, 321, textureX, textureY); // Import
        pumpModel[75] = new ModelRendererTurbo(this, 249, 369, textureX, textureY); // Import
        pumpModel[76] = new ModelRendererTurbo(this, 433, 369, textureX, textureY); // Import
        pumpModel[77] = new ModelRendererTurbo(this, 785, 329, textureX, textureY); // Import
        pumpModel[78] = new ModelRendererTurbo(this, 593, 241, textureX, textureY); // Import
        pumpModel[79] = new ModelRendererTurbo(this, 537, 241, textureX, textureY); // Import
        pumpModel[80] = new ModelRendererTurbo(this, 289, 369, textureX, textureY); // Import
        pumpModel[81] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Import
        pumpModel[82] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Import
        pumpModel[83] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Import
        pumpModel[84] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Import
        pumpModel[85] = new ModelRendererTurbo(this, 577, 217, textureX, textureY); // Import
        pumpModel[86] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Import
        pumpModel[87] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Import
        pumpModel[88] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Import
        pumpModel[89] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Import
        pumpModel[90] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Import
        pumpModel[91] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Import
        pumpModel[92] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Import
        pumpModel[93] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Import
        pumpModel[94] = new ModelRendererTurbo(this, 529, 81, textureX, textureY); // Import
        pumpModel[95] = new ModelRendererTurbo(this, 553, 81, textureX, textureY); // Import
        pumpModel[96] = new ModelRendererTurbo(this, 633, 241, textureX, textureY); // Import
        pumpModel[97] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Import
        pumpModel[98] = new ModelRendererTurbo(this, 553, 89, textureX, textureY); // Import
        pumpModel[99] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Import
        pumpModel[100] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Import
        pumpModel[101] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Import
        pumpModel[102] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Import
        pumpModel[103] = new ModelRendererTurbo(this, 913, 137, textureX, textureY); // Import
        pumpModel[104] = new ModelRendererTurbo(this, 937, 137, textureX, textureY); // Import
        pumpModel[105] = new ModelRendererTurbo(this, 673, 241, textureX, textureY); // Import
        pumpModel[106] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import
        pumpModel[107] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Import
        pumpModel[108] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Import
        pumpModel[109] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Import
        pumpModel[110] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Import
        pumpModel[111] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Import
        pumpModel[112] = new ModelRendererTurbo(this, 945, 73, textureX, textureY); // Import
        pumpModel[113] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Import
        pumpModel[114] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Import
        pumpModel[115] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Import
        pumpModel[116] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Import
        pumpModel[117] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Import
        pumpModel[118] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Import
        pumpModel[119] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Import
        pumpModel[120] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Import
        pumpModel[121] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Import
        pumpModel[122] = new ModelRendererTurbo(this, 529, 145, textureX, textureY); // Import
        pumpModel[123] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Import
        pumpModel[124] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Import
        pumpModel[125] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Import
        pumpModel[126] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Import
        pumpModel[127] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Import
        pumpModel[128] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Import
        pumpModel[129] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Import
        pumpModel[130] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Import
        pumpModel[131] = new ModelRendererTurbo(this, 769, 65, textureX, textureY); // Import
        pumpModel[132] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Import
        pumpModel[133] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Import
        pumpModel[134] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Import
        pumpModel[135] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Import
        pumpModel[136] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Import
        pumpModel[137] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Import
        pumpModel[138] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Import
        pumpModel[139] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Import
        pumpModel[140] = new ModelRendererTurbo(this, 753, 241, textureX, textureY); // Import
        pumpModel[141] = new ModelRendererTurbo(this, 593, 81, textureX, textureY); // Import
        pumpModel[142] = new ModelRendererTurbo(this, 577, 81, textureX, textureY); // Import
        pumpModel[143] = new ModelRendererTurbo(this, 625, 81, textureX, textureY); // Import
        pumpModel[144] = new ModelRendererTurbo(this, 993, 121, textureX, textureY); // Import
        pumpModel[145] = new ModelRendererTurbo(this, 553, 153, textureX, textureY); // Import
        pumpModel[146] = new ModelRendererTurbo(this, 641, 81, textureX, textureY); // Import
        pumpModel[147] = new ModelRendererTurbo(this, 873, 129, textureX, textureY); // Import
        pumpModel[148] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Import
        pumpModel[149] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Import
        pumpModel[150] = new ModelRendererTurbo(this, 913, 89, textureX, textureY); // Import
        pumpModel[151] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Import
        pumpModel[152] = new ModelRendererTurbo(this, 65, 249, textureX, textureY); // Import
        pumpModel[153] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Import
        pumpModel[154] = new ModelRendererTurbo(this, 1017, 97, textureX, textureY); // Import
        pumpModel[155] = new ModelRendererTurbo(this, 105, 249, textureX, textureY); // Import
        pumpModel[156] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Import
        pumpModel[157] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Import
        pumpModel[158] = new ModelRendererTurbo(this, 641, 105, textureX, textureY); // Import
        pumpModel[159] = new ModelRendererTurbo(this, 929, 241, textureX, textureY); // Import
        pumpModel[160] = new ModelRendererTurbo(this, 961, 153, textureX, textureY); // Import
        pumpModel[161] = new ModelRendererTurbo(this, 433, 377, textureX, textureY); // Import
        pumpModel[162] = new ModelRendererTurbo(this, 145, 249, textureX, textureY); // Import
        pumpModel[163] = new ModelRendererTurbo(this, 729, 369, textureX, textureY); // Import
        pumpModel[164] = new ModelRendererTurbo(this, 505, 377, textureX, textureY); // Import
        pumpModel[165] = new ModelRendererTurbo(this, 361, 249, textureX, textureY); // Import
        pumpModel[166] = new ModelRendererTurbo(this, 193, 249, textureX, textureY); // Import
        pumpModel[167] = new ModelRendererTurbo(this, 289, 377, textureX, textureY); // Import
        pumpModel[168] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Import
        pumpModel[169] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); // Import
        pumpModel[170] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Import
        pumpModel[171] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Import
        pumpModel[172] = new ModelRendererTurbo(this, 497, 169, textureX, textureY); // Import
        pumpModel[173] = new ModelRendererTurbo(this, 529, 169, textureX, textureY); // Import
        pumpModel[174] = new ModelRendererTurbo(this, 937, 177, textureX, textureY); // Import
        pumpModel[175] = new ModelRendererTurbo(this, 961, 177, textureX, textureY); // Import
        pumpModel[176] = new ModelRendererTurbo(this, 417, 249, textureX, textureY); // Import
        pumpModel[177] = new ModelRendererTurbo(this, 1017, 105, textureX, textureY); // Import
        pumpModel[178] = new ModelRendererTurbo(this, 561, 113, textureX, textureY); // Import
        pumpModel[179] = new ModelRendererTurbo(this, 617, 113, textureX, textureY); // Import
        pumpModel[180] = new ModelRendererTurbo(this, 921, 113, textureX, textureY); // Import
        pumpModel[181] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import
        pumpModel[182] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Import
        pumpModel[183] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Import
        pumpModel[184] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Import
        pumpModel[185] = new ModelRendererTurbo(this, 281, 265, textureX, textureY); // Import
        pumpModel[186] = new ModelRendererTurbo(this, 561, 377, textureX, textureY); // Import
        pumpModel[187] = new ModelRendererTurbo(this, 617, 377, textureX, textureY); // Import
        pumpModel[188] = new ModelRendererTurbo(this, 985, 177, textureX, textureY); // Import
        pumpModel[189] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Import
        pumpModel[190] = new ModelRendererTurbo(this, 897, 129, textureX, textureY); // Import
        pumpModel[191] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Import
        pumpModel[192] = new ModelRendererTurbo(this, 321, 185, textureX, textureY); // Import
        pumpModel[193] = new ModelRendererTurbo(this, 449, 185, textureX, textureY); // Import
        pumpModel[194] = new ModelRendererTurbo(this, 721, 185, textureX, textureY); // Import
        pumpModel[195] = new ModelRendererTurbo(this, 761, 185, textureX, textureY); // Import
        pumpModel[196] = new ModelRendererTurbo(this, 897, 185, textureX, textureY); // Import
        pumpModel[197] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Import
        pumpModel[198] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Import
        pumpModel[199] = new ModelRendererTurbo(this, 161, 193, textureX, textureY); // Import
        pumpModel[200] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Import
        pumpModel[201] = new ModelRendererTurbo(this, 385, 193, textureX, textureY); // Import
        pumpModel[202] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Import
        pumpModel[203] = new ModelRendererTurbo(this, 473, 193, textureX, textureY); // Import
        pumpModel[204] = new ModelRendererTurbo(this, 497, 193, textureX, textureY); // Import
        pumpModel[205] = new ModelRendererTurbo(this, 521, 193, textureX, textureY); // Import
        pumpModel[206] = new ModelRendererTurbo(this, 577, 193, textureX, textureY); // Import
        pumpModel[207] = new ModelRendererTurbo(this, 601, 193, textureX, textureY); // Import
        pumpModel[208] = new ModelRendererTurbo(this, 785, 193, textureX, textureY); // Import
        pumpModel[209] = new ModelRendererTurbo(this, 809, 193, textureX, textureY); // Import
        pumpModel[210] = new ModelRendererTurbo(this, 945, 201, textureX, textureY); // Import
        pumpModel[211] = new ModelRendererTurbo(this, 945, 209, textureX, textureY); // Import
        pumpModel[212] = new ModelRendererTurbo(this, 457, 249, textureX, textureY); // Import
        pumpModel[213] = new ModelRendererTurbo(this, 569, 241, textureX, textureY); // Import
        pumpModel[214] = new ModelRendererTurbo(this, 769, 241, textureX, textureY); // Import
        pumpModel[215] = new ModelRendererTurbo(this, 561, 121, textureX, textureY); // Import
        pumpModel[216] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Import
        pumpModel[217] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Import
        pumpModel[218] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Import
        pumpModel[219] = new ModelRendererTurbo(this, 961, 137, textureX, textureY); // Import
        pumpModel[220] = new ModelRendererTurbo(this, 937, 121, textureX, textureY); // Import
        pumpModel[221] = new ModelRendererTurbo(this, 825, 241, textureX, textureY); // Import
        pumpModel[222] = new ModelRendererTurbo(this, 1017, 121, textureX, textureY); // Import
        pumpModel[223] = new ModelRendererTurbo(this, 633, 249, textureX, textureY); // Import
        pumpModel[224] = new ModelRendererTurbo(this, 321, 265, textureX, textureY); // Import
        pumpModel[225] = new ModelRendererTurbo(this, 369, 265, textureX, textureY); // Import
        pumpModel[226] = new ModelRendererTurbo(this, 961, 9, textureX, textureY); // Import
        pumpModel[227] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Import
        pumpModel[228] = new ModelRendererTurbo(this, 1017, 129, textureX, textureY); // Import
        pumpModel[229] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Import
        pumpModel[230] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Import
        pumpModel[231] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Import
        pumpModel[232] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Import
        pumpModel[233] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Import
        pumpModel[234] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Import
        pumpModel[235] = new ModelRendererTurbo(this, 593, 249, textureX, textureY); // Import
        pumpModel[236] = new ModelRendererTurbo(this, 1001, 241, textureX, textureY); // Import
        pumpModel[237] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Import
        pumpModel[238] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Import
        pumpModel[239] = new ModelRendererTurbo(this, 617, 105, textureX, textureY); // Import
        pumpModel[240] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Import
        pumpModel[241] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Import
        pumpModel[242] = new ModelRendererTurbo(this, 873, 137, textureX, textureY); // Import
        pumpModel[243] = new ModelRendererTurbo(this, 961, 129, textureX, textureY); // Import
        pumpModel[244] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Import
        pumpModel[245] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Import
        pumpModel[246] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Import
        pumpModel[247] = new ModelRendererTurbo(this, 457, 145, textureX, textureY); // Import
        pumpModel[248] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Import
        pumpModel[249] = new ModelRendererTurbo(this, 513, 145, textureX, textureY); // Import
        pumpModel[250] = new ModelRendererTurbo(this, 553, 145, textureX, textureY); // Import
        pumpModel[251] = new ModelRendererTurbo(this, 729, 377, textureX, textureY); // Import
        pumpModel[252] = new ModelRendererTurbo(this, 673, 249, textureX, textureY); // Import
        pumpModel[253] = new ModelRendererTurbo(this, 249, 385, textureX, textureY); // Import
        pumpModel[254] = new ModelRendererTurbo(this, 305, 385, textureX, textureY); // Import
        pumpModel[255] = new ModelRendererTurbo(this, 353, 385, textureX, textureY); // Import
        pumpModel[256] = new ModelRendererTurbo(this, 705, 265, textureX, textureY); // Import
        pumpModel[257] = new ModelRendererTurbo(this, 465, 385, textureX, textureY); // Import
        pumpModel[258] = new ModelRendererTurbo(this, 513, 385, textureX, textureY); // Import
        pumpModel[259] = new ModelRendererTurbo(this, 561, 385, textureX, textureY); // Import
        pumpModel[260] = new ModelRendererTurbo(this, 657, 385, textureX, textureY); // Import
        pumpModel[261] = new ModelRendererTurbo(this, 449, 193, textureX, textureY); // Import
        pumpModel[262] = new ModelRendererTurbo(this, 737, 385, textureX, textureY); // Import
        pumpModel[263] = new ModelRendererTurbo(this, 817, 385, textureX, textureY); // Import
        pumpModel[264] = new ModelRendererTurbo(this, 857, 209, textureX, textureY); // Import
        pumpModel[265] = new ModelRendererTurbo(this, 889, 241, textureX, textureY); // Import
        pumpModel[266] = new ModelRendererTurbo(this, 897, 137, textureX, textureY); // Import
        pumpModel[267] = new ModelRendererTurbo(this, 993, 145, textureX, textureY); // Import
        pumpModel[268] = new ModelRendererTurbo(this, 897, 153, textureX, textureY); // Import
        pumpModel[269] = new ModelRendererTurbo(this, 1009, 145, textureX, textureY); // Import
        pumpModel[270] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Import

        pumpModel[0].addShapeBox(0F, 0F, 0F, 105, 1, 1, 0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[0].setRotationPoint(157F, -70F, -10F);

        pumpModel[1].addShapeBox(0F, 0F, 0F, 105, 1, 1, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[1].setRotationPoint(157F, -70F, 9F);

        pumpModel[2].addShapeBox(0F, 0F, 0F, 35, 10, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[2].setRotationPoint(238F, -61F, -11F);

        pumpModel[3].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[3].setRotationPoint(270F, -64F, -11F);

        pumpModel[4].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[4].setRotationPoint(170.5F, -69F, 9F);

        pumpModel[5].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[5].setRotationPoint(176F, -69F, 9F);

        pumpModel[6].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[6].setRotationPoint(181.5F, -69F, 9F);

        pumpModel[7].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[7].setRotationPoint(187F, -69F, 9F);

        pumpModel[8].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[8].setRotationPoint(192.5F, -69F, 9F);

        pumpModel[9].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[9].setRotationPoint(198F, -69F, 9F);

        pumpModel[10].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[10].setRotationPoint(203.5F, -69F, 9F);

        pumpModel[11].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[11].setRotationPoint(209F, -69F, 9F);

        pumpModel[12].addShapeBox(0F, 0F, 0F, 2, 20, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[12].setRotationPoint(214.5F, -69F, 9F);

        pumpModel[13].addShapeBox(0F, 0F, 0F, 2, 22, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[13].setRotationPoint(220F, -69F, 9F);

        pumpModel[14].addShapeBox(0F, 0F, 0F, 2, 22, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[14].setRotationPoint(225.5F, -69F, 9F);

        pumpModel[15].addShapeBox(0F, 0F, 0F, 2, 22, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[15].setRotationPoint(231F, -69F, 9F);

        pumpModel[16].addShapeBox(0F, 0F, 0F, 2, 22, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[16].setRotationPoint(236.5F, -69F, 9F);

        pumpModel[17].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[17].setRotationPoint(165F, -69F, 9F);

        pumpModel[18].addShapeBox(0F, 0F, 0F, 24, 8, 1, 0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[18].setRotationPoint(238F, -69F, -11F);

        pumpModel[19].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F, 0.0F, 2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[19].setRotationPoint(262F, -67F, -10F);

        pumpModel[20].addShapeBox(0F, 0F, 0F, 30, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[20].setRotationPoint(238F, -51F, 9F);

        pumpModel[21].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[21].setRotationPoint(170.5F, -69F, -10F);

        pumpModel[22].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[22].setRotationPoint(176F, -69F, -10F);

        pumpModel[23].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[23].setRotationPoint(181.5F, -69F, -10F);

        pumpModel[24].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[24].setRotationPoint(187F, -69F, -10F);

        pumpModel[25].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[25].setRotationPoint(192.5F, -69F, -10F);

        pumpModel[26].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[26].setRotationPoint(198F, -69F, -10F);

        pumpModel[27].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[27].setRotationPoint(203.5F, -69F, -10F);

        pumpModel[28].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[28].setRotationPoint(209F, -69F, -10F);

        pumpModel[29].addShapeBox(0F, 0F, 0F, 2, 20, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[29].setRotationPoint(214.5F, -69F, -10F);

        pumpModel[30].addShapeBox(0F, 0F, 0F, 2, 22, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[30].setRotationPoint(220F, -69F, -10F);

        pumpModel[31].addShapeBox(0F, 0F, 0F, 2, 22, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[31].setRotationPoint(225.5F, -69F, -10F);

        pumpModel[32].addShapeBox(0F, 0F, 0F, 2, 22, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[32].setRotationPoint(231F, -69F, -10F);

        pumpModel[33].addShapeBox(0F, 0F, 0F, 2, 22, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[33].setRotationPoint(236.5F, -69F, -10F);

        pumpModel[34].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[34].setRotationPoint(165F, -69F, -10F);

        pumpModel[35].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[35].setRotationPoint(161F, -69F, -11F);

        pumpModel[36].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[36].setRotationPoint(166.5F, -69F, -11F);

        pumpModel[37].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[37].setRotationPoint(172F, -69F, -11F);

        pumpModel[38].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[38].setRotationPoint(177.5F, -69F, -11F);

        pumpModel[39].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[39].setRotationPoint(183F, -69F, -11F);

        pumpModel[40].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[40].setRotationPoint(188.5F, -69F, -11F);

        pumpModel[41].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[41].setRotationPoint(194F, -69F, -11F);

        pumpModel[42].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[42].setRotationPoint(199.5F, -69F, -11F);

        pumpModel[43].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[43].setRotationPoint(205F, -69F, -11F);

        pumpModel[44].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[44].setRotationPoint(210.5F, -69F, -11F);

        pumpModel[45].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[45].setRotationPoint(216F, -69F, -11F);

        pumpModel[46].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[46].setRotationPoint(221.5F, -69F, -11F);

        pumpModel[47].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[47].setRotationPoint(227F, -69F, -11F);

        pumpModel[48].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[48].setRotationPoint(232.5F, -69F, -11F);

        pumpModel[49].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F, 0.0F, 0.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[49].setRotationPoint(262F, -67F, -11F);

        pumpModel[50].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[50].setRotationPoint(262F, -67F, 9F);

        pumpModel[51].addShapeBox(0F, 0F, 0F, 35, 10, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[51].setRotationPoint(238F, -61F, 9F);

        pumpModel[52].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[52].setRotationPoint(270F, -64F, 9F);

        pumpModel[53].addShapeBox(0F, 0F, 0F, 24, 8, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[53].setRotationPoint(238F, -69F, 10F);

        pumpModel[54].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[54].setRotationPoint(161F, -69F, 10F);

        pumpModel[55].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[55].setRotationPoint(166.5F, -69F, 10F);

        pumpModel[56].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[56].setRotationPoint(172F, -69F, 10F);

        pumpModel[57].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[57].setRotationPoint(177.5F, -69F, 10F);

        pumpModel[58].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[58].setRotationPoint(183F, -69F, 10F);

        pumpModel[59].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[59].setRotationPoint(188.5F, -69F, 10F);

        pumpModel[60].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[60].setRotationPoint(194F, -69F, 10F);

        pumpModel[61].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[61].setRotationPoint(199.5F, -69F, 10F);

        pumpModel[62].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[62].setRotationPoint(205F, -69F, 10F);

        pumpModel[63].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[63].setRotationPoint(210.5F, -69F, 10F);

        pumpModel[64].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[64].setRotationPoint(216F, -69F, 10F);

        pumpModel[65].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[65].setRotationPoint(221.5F, -69F, 10F);

        pumpModel[66].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[66].setRotationPoint(227F, -69F, 10F);

        pumpModel[67].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[67].setRotationPoint(232.5F, -69F, 10F);

        pumpModel[68].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F, 0.0F, 2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[68].setRotationPoint(262F, -67F, 10F);

        pumpModel[69].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[69].setRotationPoint(268F, -51F, -11F);

        pumpModel[70].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, 2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        pumpModel[70].setRotationPoint(268F, -49F, 9.5F);

        pumpModel[71].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        pumpModel[71].setRotationPoint(268F, -47F, 8.5F);

        pumpModel[72].addShapeBox(0F, 0F, 0F, 17, 3, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, -2.0F, 0.0F, -4.5F, -2.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F); // Import
        pumpModel[72].setRotationPoint(260F, -44F, -8.5F);

        pumpModel[73].addShapeBox(0F, 0F, 0F, 12, 6, 2, 0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, -3.0F, -4.5F, 0.0F, -3.0F, 5.0F, 0.0F, 0.0F, 5.0F); // Import
        pumpModel[73].setRotationPoint(248F, -44F, -8.5F);

        pumpModel[74].addShapeBox(0F, 0F, 0F, 22, 5, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F); // Import
        pumpModel[74].setRotationPoint(226F, -43F, -8.5F);

        pumpModel[75].addShapeBox(0F, 0F, 0F, 17, 6, 2, 0F, 0.0F, 1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -4.0F, -4.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 5.0F, 0.0F, -4.0F, 5.0F); // Import
        pumpModel[75].setRotationPoint(209F, -44F, -8.5F);

        pumpModel[76].addShapeBox(0F, 0F, 0F, 30, 2, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        pumpModel[76].setRotationPoint(238F, -49F, 9.5F);

        pumpModel[77].addShapeBox(0F, 0F, 0F, 22, 4, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F); // Import
        pumpModel[77].setRotationPoint(226F, -47F, -10.5F);

        pumpModel[78].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, -1.0F, 2.0F, 0.0F, 0.0F, 2.0F); // Import
        pumpModel[78].setRotationPoint(248F, -47F, -10.5F);

        pumpModel[79].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F); // Import
        pumpModel[79].setRotationPoint(260F, -47F, -10.5F);

        pumpModel[80].addShapeBox(0F, 0F, 0F, 17, 4, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, -2.0F, 2.0F); // Import
        pumpModel[80].setRotationPoint(209F, -47F, -10.5F);

        pumpModel[81].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        pumpModel[81].setRotationPoint(232.5F, -48F, 9.5F);

        pumpModel[82].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        pumpModel[82].setRotationPoint(227F, -48F, 9.5F);

        pumpModel[83].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        pumpModel[83].setRotationPoint(221.5F, -48F, 9.5F);

        pumpModel[84].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        pumpModel[84].setRotationPoint(216F, -48F, 9.5F);

        pumpModel[85].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        pumpModel[85].setRotationPoint(209F, -48F, 9.5F);

        pumpModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[86].setRotationPoint(214.5F, -49F, 9.5F);

        pumpModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[87].setRotationPoint(209F, -49F, 9.5F);

        pumpModel[88].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        pumpModel[88].setRotationPoint(205F, -48F, 9.5F);

        pumpModel[89].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        pumpModel[89].setRotationPoint(199.5F, -48F, 9.5F);

        pumpModel[90].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        pumpModel[90].setRotationPoint(194F, -48F, 9.5F);

        pumpModel[91].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        pumpModel[91].setRotationPoint(188.5F, -48F, 9.5F);

        pumpModel[92].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        pumpModel[92].setRotationPoint(183F, -48F, 9.5F);

        pumpModel[93].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        pumpModel[93].setRotationPoint(177.5F, -48F, 9.5F);

        pumpModel[94].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        pumpModel[94].setRotationPoint(172F, -48F, 9.5F);

        pumpModel[95].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        pumpModel[95].setRotationPoint(166.5F, -48F, 9.5F);

        pumpModel[96].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.35F); // Import
        pumpModel[96].setRotationPoint(157F, -48F, 9.5F);

        pumpModel[97].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F); // Import
        pumpModel[97].setRotationPoint(205F, -47F, -10.5F);

        pumpModel[98].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F); // Import
        pumpModel[98].setRotationPoint(199.5F, -47F, -10.5F);

        pumpModel[99].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F); // Import
        pumpModel[99].setRotationPoint(194F, -47F, -10.5F);

        pumpModel[100].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F); // Import
        pumpModel[100].setRotationPoint(188.5F, -47F, -10.5F);

        pumpModel[101].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F); // Import
        pumpModel[101].setRotationPoint(183F, -47F, -10.5F);

        pumpModel[102].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F); // Import
        pumpModel[102].setRotationPoint(177.5F, -47F, -10.5F);

        pumpModel[103].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F); // Import
        pumpModel[103].setRotationPoint(172F, -47F, -10.5F);

        pumpModel[104].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F); // Import
        pumpModel[104].setRotationPoint(166.5F, -47F, -10.5F);

        pumpModel[105].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F); // Import
        pumpModel[105].setRotationPoint(157F, -47F, -10.5F);

        pumpModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        pumpModel[106].setRotationPoint(203.5F, -48F, 9F);

        pumpModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        pumpModel[107].setRotationPoint(198F, -48F, 9F);

        pumpModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        pumpModel[108].setRotationPoint(192.5F, -48F, 9F);

        pumpModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        pumpModel[109].setRotationPoint(187F, -48F, 9F);

        pumpModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        pumpModel[110].setRotationPoint(181.5F, -48F, 9F);

        pumpModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        pumpModel[111].setRotationPoint(176F, -48F, 9F);

        pumpModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        pumpModel[112].setRotationPoint(170.5F, -48F, 9F);

        pumpModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        pumpModel[113].setRotationPoint(165F, -48F, 9F);

        pumpModel[114].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F); // Import
        pumpModel[114].setRotationPoint(205F, -45F, -8.5F);

        pumpModel[115].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F); // Import
        pumpModel[115].setRotationPoint(199.5F, -45F, 6.5F);

        pumpModel[116].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F); // Import
        pumpModel[116].setRotationPoint(194F, -45F, 6.5F);

        pumpModel[117].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F); // Import
        pumpModel[117].setRotationPoint(188.5F, -45F, 6.5F);

        pumpModel[118].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F); // Import
        pumpModel[118].setRotationPoint(183F, -45F, 6.5F);

        pumpModel[119].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F); // Import
        pumpModel[119].setRotationPoint(177.5F, -45F, 6.5F);

        pumpModel[120].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F); // Import
        pumpModel[120].setRotationPoint(172F, -45F, 6.5F);

        pumpModel[121].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F); // Import
        pumpModel[121].setRotationPoint(166.5F, -45F, 6.5F);

        pumpModel[122].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F); // Import
        pumpModel[122].setRotationPoint(159F, -45F, 6.5F);

        pumpModel[123].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F); // Import
        pumpModel[123].setRotationPoint(203.5F, -47F, -9.5F);

        pumpModel[124].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F); // Import
        pumpModel[124].setRotationPoint(198F, -47F, -9.5F);

        pumpModel[125].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F); // Import
        pumpModel[125].setRotationPoint(192.5F, -47F, -9.5F);

        pumpModel[126].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F); // Import
        pumpModel[126].setRotationPoint(187F, -47F, -9.5F);

        pumpModel[127].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F); // Import
        pumpModel[127].setRotationPoint(181.5F, -47F, -9.5F);

        pumpModel[128].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F); // Import
        pumpModel[128].setRotationPoint(176F, -47F, -9.5F);

        pumpModel[129].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F); // Import
        pumpModel[129].setRotationPoint(170.5F, -47F, -9.5F);

        pumpModel[130].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F); // Import
        pumpModel[130].setRotationPoint(165F, -47F, -9.5F);

        pumpModel[131].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -5.0F, 0.5F, 0.0F, -5.0F); // Import
        pumpModel[131].setRotationPoint(204F, -45F, 6.5F);

        pumpModel[132].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -5.0F, 0.5F, 0.0F, -5.0F); // Import
        pumpModel[132].setRotationPoint(198.5F, -45F, 6.5F);

        pumpModel[133].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -5.0F, 0.5F, 0.0F, -5.0F); // Import
        pumpModel[133].setRotationPoint(193F, -45F, 6.5F);

        pumpModel[134].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -5.0F, 0.5F, 0.0F, -5.0F); // Import
        pumpModel[134].setRotationPoint(187.5F, -45F, 6.5F);

        pumpModel[135].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -5.0F, 0.5F, 0.0F, -5.0F); // Import
        pumpModel[135].setRotationPoint(182F, -45F, 6.5F);

        pumpModel[136].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -5.0F, 0.5F, 0.0F, -5.0F); // Import
        pumpModel[136].setRotationPoint(176.5F, -45F, 6.5F);

        pumpModel[137].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -5.0F, 0.5F, 0.0F, -5.0F); // Import
        pumpModel[137].setRotationPoint(171F, -45F, 6.5F);

        pumpModel[138].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -5.0F, 0.5F, 0.0F, -5.0F); // Import
        pumpModel[138].setRotationPoint(165.5F, -45F, 6.5F);

        pumpModel[139].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[139].setRotationPoint(157F, -69F, 9F);

        pumpModel[140].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[140].setRotationPoint(157F, -69F, 10F);

        pumpModel[141].addShapeBox(0F, 0F, 0F, 3, 7, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[141].setRotationPoint(154F, -62F, -11F);

        pumpModel[142].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.75F); // Import
        pumpModel[142].setRotationPoint(153F, -62F, 9F);

        pumpModel[143].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[143].setRotationPoint(159F, -53F, 9F);

        pumpModel[144].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[144].setRotationPoint(157F, -55F, 10F);

        pumpModel[145].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.6F, 0.0F, -4.0F, 0.5F, 0.0F, 4.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -4.5F, 0.0F, 4.0F, -4.5F); // Import
        pumpModel[145].setRotationPoint(154F, -45F, 6.5F);

        pumpModel[146].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -4.5F, 0.0F, -1.0F, -4.5F); // Import
        pumpModel[146].setRotationPoint(153F, -41F, 6.5F);

        pumpModel[147].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 3.25F); // Import
        pumpModel[147].setRotationPoint(154F, -55F, 9F);

        pumpModel[148].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.5F); // Import
        pumpModel[148].setRotationPoint(153F, -55F, 9F);

        pumpModel[149].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[149].setRotationPoint(154F, -51F, -11F);

        pumpModel[150].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.5F); // Import
        pumpModel[150].setRotationPoint(153F, -51F, 9F);

        pumpModel[151].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 6.5F, 0.0F, 0.0F, 6.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.25F); // Import
        pumpModel[151].setRotationPoint(153F, -48F, 9F);

        pumpModel[152].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[152].setRotationPoint(153F, -45F, 3F);

        pumpModel[153].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 2.0F); // Import
        pumpModel[153].setRotationPoint(154F, -48F, 9F);

        pumpModel[154].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0.0F, 0.0F, 3.0F, 0.25F, 0.0F, 1.95F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[154].setRotationPoint(154F, -45F, -10F);

        pumpModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[155].setRotationPoint(153F, -42F, 0F);

        pumpModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 1.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -1.0F, 0.25F, 0.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[156].setRotationPoint(154F, -42F, -9F);

        pumpModel[157].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.0F, 0.0F, 2.95F, 0.75F, 0.0F, 1.5F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.75F, -1.4F, 0.65F, 0.75F, -1.4F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[157].setRotationPoint(155.25F, -45F, -9F);

        pumpModel[158].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.65F, -2.0F, -0.4F, 0.65F, -2.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F); // Import
        pumpModel[158].setRotationPoint(157F, -45F, -9F);

        pumpModel[159].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F); // Import
        pumpModel[159].setRotationPoint(268F, -47F, -10.5F);

        pumpModel[160].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[160].setRotationPoint(268F, -51F, 9F);

        pumpModel[161].addShapeBox(0F, 0F, 0F, 30, 2, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[161].setRotationPoint(238F, -51F, -11F);

        pumpModel[162].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        pumpModel[162].setRotationPoint(268F, -49F, -11.5F);

        pumpModel[163].addShapeBox(0F, 0F, 0F, 17, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 5.0F, -2.0F, 0.0F, 5.0F, -2.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F); // Import
        pumpModel[163].setRotationPoint(260F, -44F, 6.5F);

        pumpModel[164].addShapeBox(0F, 0F, 0F, 22, 4, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        pumpModel[164].setRotationPoint(226F, -47F, 8.5F);

        pumpModel[165].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        pumpModel[165].setRotationPoint(248F, -47F, 8.5F);

        pumpModel[166].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        pumpModel[166].setRotationPoint(260F, -47F, 8.5F);

        pumpModel[167].addShapeBox(0F, 0F, 0F, 17, 4, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, -2.0F, -1.5F); // Import
        pumpModel[167].setRotationPoint(209F, -47F, 8.5F);

        pumpModel[168].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        pumpModel[168].setRotationPoint(205F, -47F, 8.5F);

        pumpModel[169].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        pumpModel[169].setRotationPoint(199.5F, -47F, 8.5F);

        pumpModel[170].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        pumpModel[170].setRotationPoint(194F, -47F, 8.5F);

        pumpModel[171].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        pumpModel[171].setRotationPoint(188.5F, -47F, 8.5F);

        pumpModel[172].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        pumpModel[172].setRotationPoint(183F, -47F, 8.5F);

        pumpModel[173].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        pumpModel[173].setRotationPoint(177.5F, -47F, 8.5F);

        pumpModel[174].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        pumpModel[174].setRotationPoint(172F, -47F, 8.5F);

        pumpModel[175].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        pumpModel[175].setRotationPoint(166.5F, -47F, 8.5F);

        pumpModel[176].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[176].setRotationPoint(157F, -47F, 8.5F);

        pumpModel[177].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        pumpModel[177].setRotationPoint(203.5F, -47F, 8.5F);

        pumpModel[178].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        pumpModel[178].setRotationPoint(198F, -47F, 8.5F);

        pumpModel[179].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        pumpModel[179].setRotationPoint(192.5F, -47F, 8.5F);

        pumpModel[180].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        pumpModel[180].setRotationPoint(187F, -47F, 8.5F);

        pumpModel[181].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        pumpModel[181].setRotationPoint(181.5F, -47F, 8.5F);

        pumpModel[182].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        pumpModel[182].setRotationPoint(176F, -47F, 8.5F);

        pumpModel[183].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        pumpModel[183].setRotationPoint(170.5F, -47F, 8.5F);

        pumpModel[184].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        pumpModel[184].setRotationPoint(165F, -47F, 8.5F);

        pumpModel[185].addShapeBox(0F, 0F, 0F, 12, 6, 2, 0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 5.0F, 0.0F, -3.0F, 5.0F, 0.0F, -3.0F, -4.5F, 0.0F, 0.0F, -1.5F); // Import
        pumpModel[185].setRotationPoint(248F, -44F, 6.5F);

        pumpModel[186].addShapeBox(0F, 0F, 0F, 22, 5, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        pumpModel[186].setRotationPoint(226F, -43F, 6.5F);

        pumpModel[187].addShapeBox(0F, 0F, 0F, 17, 6, 2, 0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, -4.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -1.5F, 0.0F, -4.0F, -4.5F); // Import
        pumpModel[187].setRotationPoint(209F, -44F, 6.5F);

        pumpModel[188].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F); // Import
        pumpModel[188].setRotationPoint(205F, -45F, 6.5F);

        pumpModel[189].addShapeBox(0F, 0F, 0F, 30, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        pumpModel[189].setRotationPoint(238F, -49F, -11.5F);

        pumpModel[190].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[190].setRotationPoint(214.5F, -49F, -11.5F);

        pumpModel[191].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[191].setRotationPoint(209F, -49F, -11.5F);

        pumpModel[192].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        pumpModel[192].setRotationPoint(232.5F, -48F, -11.5F);

        pumpModel[193].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        pumpModel[193].setRotationPoint(227F, -48F, -11.5F);

        pumpModel[194].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        pumpModel[194].setRotationPoint(221.5F, -48F, -11.5F);

        pumpModel[195].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F); // Import
        pumpModel[195].setRotationPoint(214F, -48F, -11.5F);

        pumpModel[196].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        pumpModel[196].setRotationPoint(210.5F, -48F, -11.5F);

        pumpModel[197].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        pumpModel[197].setRotationPoint(205F, -48F, -11.5F);

        pumpModel[198].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        pumpModel[198].setRotationPoint(199.5F, -48F, -11.5F);

        pumpModel[199].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        pumpModel[199].setRotationPoint(194F, -48F, -11.5F);

        pumpModel[200].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        pumpModel[200].setRotationPoint(188.5F, -48F, -11.5F);

        pumpModel[201].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        pumpModel[201].setRotationPoint(183F, -48F, -11.5F);

        pumpModel[202].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        pumpModel[202].setRotationPoint(177.5F, -48F, -11.5F);

        pumpModel[203].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        pumpModel[203].setRotationPoint(172F, -48F, -11.5F);

        pumpModel[204].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        pumpModel[204].setRotationPoint(166.5F, -48F, -11.5F);

        pumpModel[205].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F); // Import
        pumpModel[205].setRotationPoint(199.5F, -45F, -8.5F);

        pumpModel[206].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F); // Import
        pumpModel[206].setRotationPoint(194F, -45F, -8.5F);

        pumpModel[207].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F); // Import
        pumpModel[207].setRotationPoint(188.5F, -45F, -8.5F);

        pumpModel[208].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F); // Import
        pumpModel[208].setRotationPoint(183F, -45F, -8.5F);

        pumpModel[209].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F); // Import
        pumpModel[209].setRotationPoint(177.5F, -45F, -8.5F);

        pumpModel[210].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F); // Import
        pumpModel[210].setRotationPoint(172F, -45F, -8.5F);

        pumpModel[211].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F); // Import
        pumpModel[211].setRotationPoint(166.5F, -45F, -8.5F);

        pumpModel[212].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F); // Import
        pumpModel[212].setRotationPoint(159F, -45F, -8.5F);

        pumpModel[213].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0.0F, -4.0F, 0.5F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 0.0F, 4.0F, 5.0F); // Import
        pumpModel[213].setRotationPoint(154F, -45F, -8.5F);

        pumpModel[214].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[214].setRotationPoint(157F, -55F, -11.5F);

        pumpModel[215].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F); // Import
        pumpModel[215].setRotationPoint(153F, -51F, -11F);

        pumpModel[216].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 3.25F); // Import
        pumpModel[216].setRotationPoint(154F, -51F, 9F);

        pumpModel[217].addShapeBox(0F, 0F, 0F, 3, 7, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F); // Import
        pumpModel[217].setRotationPoint(154F, -62F, 9F);

        pumpModel[218].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[218].setRotationPoint(154F, -55F, -11F);

        pumpModel[219].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[219].setRotationPoint(153F, -55F, -13F);

        pumpModel[220].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[220].setRotationPoint(153F, -62F, -11F);

        pumpModel[221].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[221].setRotationPoint(154F, -48F, -11F);

        pumpModel[222].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 6.5F, 0.0F, 0.0F, 6.5F); // Import
        pumpModel[222].setRotationPoint(153F, -48F, -11F);

        pumpModel[223].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[223].setRotationPoint(153F, -45F, -10F);

        pumpModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        pumpModel[224].setRotationPoint(153F, -46F, -4F);

        pumpModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[225].setRotationPoint(153F, -42F, -9F);

        pumpModel[226].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, -1.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 0.0F, -1.0F, 5.0F); // Import
        pumpModel[226].setRotationPoint(153F, -41F, -8.5F);

        pumpModel[227].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[227].setRotationPoint(203.5F, -48F, -10F);

        pumpModel[228].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[228].setRotationPoint(198F, -48F, -10F);

        pumpModel[229].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[229].setRotationPoint(192.5F, -48F, -10F);

        pumpModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[230].setRotationPoint(187F, -48F, -10F);

        pumpModel[231].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[231].setRotationPoint(181.5F, -48F, -10F);

        pumpModel[232].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[232].setRotationPoint(176F, -48F, -10F);

        pumpModel[233].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[233].setRotationPoint(170.5F, -48F, -10F);

        pumpModel[234].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        pumpModel[234].setRotationPoint(165F, -48F, -10F);

        pumpModel[235].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        pumpModel[235].setRotationPoint(157F, -48F, -11.5F);

        pumpModel[236].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[236].setRotationPoint(157F, -69F, -11F);

        pumpModel[237].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[237].setRotationPoint(157F, -69F, -10F);

        pumpModel[238].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 1.95F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F); // Import
        pumpModel[238].setRotationPoint(154F, -45F, 8F);

        pumpModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.25F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[239].setRotationPoint(154F, -42F, 8F);

        pumpModel[240].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 1.5F, 0.0F, 0.0F, 2.95F, 0.0F, 0.0F, 0.0F, 0.75F, -1.4F, 0.0F, 0.75F, -1.4F, 0.65F, 0.0F, 0.0F, 0.25F); // Import
        pumpModel[240].setRotationPoint(155.25F, -45F, 8F);

        pumpModel[241].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.1F, 0.0F, 0.0F, 1.5F, 0.0F, -0.4F, 0.0F, -2.0F, -0.4F, 0.0F, -2.0F, -0.4F, 0.65F, 0.0F, -0.4F, 0.65F); // Import
        pumpModel[241].setRotationPoint(157F, -45F, 8F);

        pumpModel[242].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F); // Import
        pumpModel[242].setRotationPoint(208.5F, -48F, -11.5F);

        pumpModel[243].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.5F, 0.0F, 5.0F); // Import
        pumpModel[243].setRotationPoint(204F, -45F, -7.5F);

        pumpModel[244].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.5F, 0.0F, 5.0F); // Import
        pumpModel[244].setRotationPoint(198.5F, -45F, -7.5F);

        pumpModel[245].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.5F, 0.0F, 5.0F); // Import
        pumpModel[245].setRotationPoint(193F, -45F, -7.5F);

        pumpModel[246].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.5F, 0.0F, 5.0F); // Import
        pumpModel[246].setRotationPoint(187.5F, -45F, -7.5F);

        pumpModel[247].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.5F, 0.0F, 5.0F); // Import
        pumpModel[247].setRotationPoint(182F, -45F, -7.5F);

        pumpModel[248].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.5F, 0.0F, 5.0F); // Import
        pumpModel[248].setRotationPoint(176.5F, -45F, -7.5F);

        pumpModel[249].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.5F, 0.0F, 5.0F); // Import
        pumpModel[249].setRotationPoint(171F, -45F, -7.5F);

        pumpModel[250].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.5F, 0.0F, 5.0F); // Import
        pumpModel[250].setRotationPoint(165.5F, -45F, -7.5F);

        pumpModel[251].addShapeBox(0F, 0F, 0F, 17, 3, 2, 0F, 0.0F, 0.0F, 10.5F, 0.0F, 0.0F, 10.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 5.5F, -2.0F, 0.0F, 5.5F, -2.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F); // Import
        pumpModel[251].setRotationPoint(260F, -44F, 4F);

        pumpModel[252].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F, 0.0F, -3.0F, 3.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, -3.0F, 3.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F); // Import
        pumpModel[252].setRotationPoint(248F, -44F, -1.5F);

        pumpModel[253].addShapeBox(0F, 0F, 0F, 22, 3, 3, 0F, 0.0F, -3.0F, 3.0F, 0.0F, -3.0F, 3.0F, 0.0F, -3.0F, 3.0F, 0.0F, -3.0F, 3.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F); // Import
        pumpModel[253].setRotationPoint(226F, -44F, -1.5F);

        pumpModel[254].addShapeBox(0F, 0F, 0F, 17, 3, 3, 0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 3.0F, 0.0F, -4.0F, 3.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[254].setRotationPoint(209F, -45F, -1.5F);

        pumpModel[255].addShapeBox(0F, 0F, 0F, 50, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[255].setRotationPoint(159F, -43F, -1.5F);

        pumpModel[256].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[256].setRotationPoint(154F, -45F, -1.5F);

        pumpModel[257].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F, 0.0F, 0.0F, -2.67F, 0.0F, 0.0F, -2.67F, 0.0F, 0.0F, -0.33F, 0.0F, 0.0F, -0.33F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        pumpModel[257].setRotationPoint(260F, -45F, 4.5F);

        pumpModel[258].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F, 0.0F, 0.0F, -0.33F, 0.0F, 0.0F, -0.33F, 0.0F, 0.0F, -2.67F, 0.0F, 0.0F, -2.67F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[258].setRotationPoint(260F, -45F, -7.5F);

        pumpModel[259].addShapeBox(0F, 0F, 0F, 18, 5, 3, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[259].setRotationPoint(46F, -67F, -7F);

        pumpModel[260].addShapeBox(0F, 0F, 0F, 34, 8, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[260].setRotationPoint(66F, -70F, -7F);

        pumpModel[261].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[261].setRotationPoint(64F, -67F, -7F);

        pumpModel[262].addShapeBox(0F, 0F, 0F, 33, 4, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[262].setRotationPoint(67F, -69.5F, -7.5F);

        pumpModel[263].addShapeBox(0F, 0F, 0F, 34, 3, 3, 0F, -7.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[263].setRotationPoint(66F, -73F, -7F);

        pumpModel[264].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[264].setRotationPoint(66F, -69.5F, -7.5F);

        pumpModel[265].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, -0.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F); // Import
        pumpModel[265].setRotationPoint(91F, -64.75F, -9F);

        pumpModel[266].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        pumpModel[266].setRotationPoint(91.25F, -64.75F, -10F);

        pumpModel[267].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0.5F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        pumpModel[267].setRotationPoint(91.25F, -65.25F, -11F);

        pumpModel[268].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 0.5F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F); // Import
        pumpModel[268].setRotationPoint(91.25F, -65.5F, -14F);

        pumpModel[269].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F); // Import
        pumpModel[269].setRotationPoint(91.25F, -65.25F, -15F);

        pumpModel[270].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.5F, -1.25F, -0.5F, 0.5F, -1.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        pumpModel[270].setRotationPoint(91.25F, -64.5F, -16F);
    }
}