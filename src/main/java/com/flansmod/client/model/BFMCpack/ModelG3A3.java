//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: g3
// Model Creator: 
// Created on: 21.05.2024 - 13:32:07
// Last changed on: 21.05.2024 - 13:32:07

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelG3A3 extends ModelGun //Same as Filename
{
    int textureX = 1024;
    int textureY = 1024;

    public ModelG3A3() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[552];
        defaultBarrelModel = new ModelRendererTurbo[23];
        ammoModel = new ModelRendererTurbo[44];
        slideModel = new ModelRendererTurbo[6];
        attachmentScopeModel = new ModelRendererTurbo[25];
        attachmentGripModel = new ModelRendererTurbo[6];

        initgunModel_1();
        initgunModel_2();
        initdefaultBarrelModel_1();
        initammoModel_1();
        initslideModel_1();
        initattachmentScopeModel_1();
        initattachmentGripModel_1();

        barrelAttachPoint = new Vector3f(177F / 16F, 45F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(132F / 16F, 45F / 16F, -7F / 16F);
        scopeAttachPoint = new Vector3f(23F / 16F, 59.5F / 16F, 0F / 16F);
        gripAttachPoint = new Vector3f(105 / 16F, 34F / 16F, 0F / 16F);

        gunSlideDistance = 1.5F;
        animationType = EnumAnimationType.CUSTOM;
        rotateGunHorizontal = 15F;
        tiltGun = 30F;
        translateGun = new Vector3f(0.0F, -0.0625F, -0.1875F);
        translateClip = new Vector3f(0.0F, -0.625F, 0.0F);

        hasFlash = true;
        hasArms = true;

        leftArmPos = new Vector3f(1.7F, 0.5F, -8F);
        leftArmRot = new Vector3f(-80F, -55F, 0.0F);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
        enableNewArm = true;

        rightArmPos = new Vector3f(0.25F, -0.54F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);

        leftArmReloadPos = new Vector3f(-0.15F, -0.55F, 0.05F);
        leftArmReloadRot = new Vector3f(80F, 50F, 0.0F);
        rightArmReloadPos = new Vector3f(0.25F, -0.54F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85F);

        rightHandAmmo = false;
        leftHandAmmo = false;

        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);

        thirdPersonOffset = new Vector3f(-0.1F, -0.04F, 0.0F);

        casingAttachPoint = new Vector3f(1.0F, 1.6F, 0.0F);
        casingAnimDistance = new Vector3f(0.0F, 3F, 7.75F);
        casingAnimSpread = new Vector3f(3F, 5F, 3F);
        casingAnimTime = 6;
        casingRotateVector = new Vector3f(0.1F, 0.0F, 0.1F);
        caseScale = 0.2F;
        casingDelay = 0;

        flashScale = 5F;
        muzzleFlashPoint = new Vector3f(
                barrelAttachPoint.x / flashScale,
                barrelAttachPoint.y / flashScale,
                barrelAttachPoint.z / flashScale
        );

        translateAll(0, -1, 0);

        flipAll();
        zoomOffsetY = -0.051F;
        zoomOffset = 0.215F;
        gunOffset = -0.86F;
        gunOffsetX = -3;
    }

    private void initgunModel_1() {
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import
        gunModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import
        gunModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import
        gunModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import
        gunModel[4] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import
        gunModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import
        gunModel[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import
        gunModel[7] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import
        gunModel[8] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import
        gunModel[9] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import
        gunModel[10] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import
        gunModel[11] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import
        gunModel[12] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import
        gunModel[13] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import
        gunModel[14] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import
        gunModel[15] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import
        gunModel[16] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import
        gunModel[17] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import
        gunModel[18] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Import
        gunModel[19] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Import
        gunModel[20] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Import
        gunModel[21] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import
        gunModel[22] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import
        gunModel[23] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import
        gunModel[24] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Import
        gunModel[25] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import
        gunModel[26] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Import
        gunModel[27] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Import
        gunModel[28] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import
        gunModel[29] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Import
        gunModel[30] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Import
        gunModel[31] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Import
        gunModel[32] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Import
        gunModel[33] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Import
        gunModel[34] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Import
        gunModel[35] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import
        gunModel[36] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import
        gunModel[37] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import
        gunModel[38] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import
        gunModel[39] = new ModelRendererTurbo(this, 913, 9, textureX, textureY); // Import
        gunModel[40] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Import
        gunModel[41] = new ModelRendererTurbo(this, 1001, 9, textureX, textureY); // Import
        gunModel[42] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Import
        gunModel[43] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import
        gunModel[44] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import
        gunModel[45] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import
        gunModel[46] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import
        gunModel[47] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import
        gunModel[48] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import
        gunModel[49] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import
        gunModel[50] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import
        gunModel[51] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import
        gunModel[52] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import
        gunModel[53] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import
        gunModel[54] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Import
        gunModel[55] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import
        gunModel[56] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import
        gunModel[57] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import
        gunModel[58] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Import
        gunModel[59] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Import
        gunModel[60] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Import
        gunModel[61] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import
        gunModel[62] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Import
        gunModel[63] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Import
        gunModel[64] = new ModelRendererTurbo(this, 641, 9, textureX, textureY); // Import
        gunModel[65] = new ModelRendererTurbo(this, 665, 9, textureX, textureY); // Import
        gunModel[66] = new ModelRendererTurbo(this, 689, 9, textureX, textureY); // Import
        gunModel[67] = new ModelRendererTurbo(this, 849, 9, textureX, textureY); // Import
        gunModel[68] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Import
        gunModel[69] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Import
        gunModel[70] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Import
        gunModel[71] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Import
        gunModel[72] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Import
        gunModel[73] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Import
        gunModel[74] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Import
        gunModel[75] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Import
        gunModel[76] = new ModelRendererTurbo(this, 513, 17, textureX, textureY); // Import
        gunModel[77] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Import
        gunModel[78] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Import
        gunModel[79] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Import
        gunModel[80] = new ModelRendererTurbo(this, 737, 17, textureX, textureY); // Import
        gunModel[81] = new ModelRendererTurbo(this, 761, 17, textureX, textureY); // Import
        gunModel[82] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import
        gunModel[83] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Import
        gunModel[84] = new ModelRendererTurbo(this, 865, 17, textureX, textureY); // Import
        gunModel[85] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Import
        gunModel[86] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Import
        gunModel[87] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Import
        gunModel[88] = new ModelRendererTurbo(this, 593, 33, textureX, textureY); // Import
        gunModel[89] = new ModelRendererTurbo(this, 737, 33, textureX, textureY); // Import
        gunModel[90] = new ModelRendererTurbo(this, 897, 25, textureX, textureY); // Import
        gunModel[91] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import
        gunModel[92] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Import
        gunModel[93] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Import
        gunModel[94] = new ModelRendererTurbo(this, 625, 41, textureX, textureY); // Import
        gunModel[95] = new ModelRendererTurbo(this, 689, 41, textureX, textureY); // Import
        gunModel[96] = new ModelRendererTurbo(this, 857, 41, textureX, textureY); // Import
        gunModel[97] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import
        gunModel[98] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Import
        gunModel[99] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Import
        gunModel[100] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import
        gunModel[101] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import
        gunModel[102] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import
        gunModel[103] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import
        gunModel[104] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Import
        gunModel[105] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import
        gunModel[106] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Import
        gunModel[107] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Import
        gunModel[108] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Import
        gunModel[109] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Import
        gunModel[110] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import
        gunModel[111] = new ModelRendererTurbo(this, 585, 57, textureX, textureY); // Import
        gunModel[112] = new ModelRendererTurbo(this, 689, 57, textureX, textureY); // Import
        gunModel[113] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Import
        gunModel[114] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Import
        gunModel[115] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import
        gunModel[116] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import
        gunModel[117] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import
        gunModel[118] = new ModelRendererTurbo(this, 793, 57, textureX, textureY); // Import
        gunModel[119] = new ModelRendererTurbo(this, 649, 25, textureX, textureY); // Import
        gunModel[120] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import
        gunModel[121] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Import
        gunModel[122] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Import
        gunModel[123] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Import
        gunModel[124] = new ModelRendererTurbo(this, 833, 25, textureX, textureY); // Import
        gunModel[125] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Import
        gunModel[126] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import
        gunModel[127] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Import
        gunModel[128] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Import
        gunModel[129] = new ModelRendererTurbo(this, 49, 321, textureX, textureY); // Import
        gunModel[130] = new ModelRendererTurbo(this, 97, 321, textureX, textureY); // Import
        gunModel[131] = new ModelRendererTurbo(this, 145, 321, textureX, textureY); // Import
        gunModel[132] = new ModelRendererTurbo(this, 193, 321, textureX, textureY); // Import
        gunModel[133] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Import
        gunModel[134] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Import
        gunModel[135] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Import
        gunModel[136] = new ModelRendererTurbo(this, 841, 41, textureX, textureY); // Import
        gunModel[137] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Import
        gunModel[138] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Import
        gunModel[139] = new ModelRendererTurbo(this, 897, 17, textureX, textureY); // Import
        gunModel[140] = new ModelRendererTurbo(this, 833, 17, textureX, textureY); // Import
        gunModel[141] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Import
        gunModel[142] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import
        gunModel[143] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Import
        gunModel[144] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Import
        gunModel[145] = new ModelRendererTurbo(this, 721, 25, textureX, textureY); // Import
        gunModel[146] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Import
        gunModel[147] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Import
        gunModel[148] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Import
        gunModel[149] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Import
        gunModel[150] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Import
        gunModel[151] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Import
        gunModel[152] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import
        gunModel[153] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Import
        gunModel[154] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Import
        gunModel[155] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import
        gunModel[156] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Import
        gunModel[157] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import
        gunModel[158] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Import
        gunModel[159] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Import
        gunModel[160] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Import
        gunModel[161] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Import
        gunModel[162] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Import
        gunModel[163] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Import
        gunModel[164] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Import
        gunModel[165] = new ModelRendererTurbo(this, 793, 17, textureX, textureY); // Import
        gunModel[166] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Import
        gunModel[167] = new ModelRendererTurbo(this, 881, 33, textureX, textureY); // Import
        gunModel[168] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Import
        gunModel[169] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Import
        gunModel[170] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import
        gunModel[171] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Import
        gunModel[172] = new ModelRendererTurbo(this, 681, 41, textureX, textureY); // Import
        gunModel[173] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Import
        gunModel[174] = new ModelRendererTurbo(this, 601, 49, textureX, textureY); // Import
        gunModel[175] = new ModelRendererTurbo(this, 857, 41, textureX, textureY); // Import
        gunModel[176] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Import
        gunModel[177] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Import
        gunModel[178] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Import
        gunModel[179] = new ModelRendererTurbo(this, 577, 65, textureX, textureY); // Import
        gunModel[180] = new ModelRendererTurbo(this, 633, 65, textureX, textureY); // Import
        gunModel[181] = new ModelRendererTurbo(this, 657, 65, textureX, textureY); // Import
        gunModel[182] = new ModelRendererTurbo(this, 681, 65, textureX, textureY); // Import
        gunModel[183] = new ModelRendererTurbo(this, 721, 65, textureX, textureY); // Import
        gunModel[184] = new ModelRendererTurbo(this, 801, 65, textureX, textureY); // Import
        gunModel[185] = new ModelRendererTurbo(this, 913, 65, textureX, textureY); // Import
        gunModel[186] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import
        gunModel[187] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Import
        gunModel[188] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Import
        gunModel[189] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Import
        gunModel[190] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Import
        gunModel[191] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Import
        gunModel[192] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Import
        gunModel[193] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Import
        gunModel[194] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Import
        gunModel[195] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Import
        gunModel[196] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Import
        gunModel[197] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Import
        gunModel[198] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Import
        gunModel[199] = new ModelRendererTurbo(this, 513, 81, textureX, textureY); // Import
        gunModel[200] = new ModelRendererTurbo(this, 537, 81, textureX, textureY); // Import
        gunModel[201] = new ModelRendererTurbo(this, 633, 81, textureX, textureY); // Import
        gunModel[202] = new ModelRendererTurbo(this, 657, 81, textureX, textureY); // Import
        gunModel[203] = new ModelRendererTurbo(this, 801, 81, textureX, textureY); // Import
        gunModel[204] = new ModelRendererTurbo(this, 825, 81, textureX, textureY); // Import
        gunModel[205] = new ModelRendererTurbo(this, 849, 81, textureX, textureY); // Import
        gunModel[206] = new ModelRendererTurbo(this, 873, 81, textureX, textureY); // Import
        gunModel[207] = new ModelRendererTurbo(this, 897, 81, textureX, textureY); // Import
        gunModel[208] = new ModelRendererTurbo(this, 921, 81, textureX, textureY); // Import
        gunModel[209] = new ModelRendererTurbo(this, 961, 81, textureX, textureY); // Import
        gunModel[210] = new ModelRendererTurbo(this, 993, 81, textureX, textureY); // Import
        gunModel[211] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import
        gunModel[212] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Import
        gunModel[213] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Import
        gunModel[214] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Import
        gunModel[215] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Import
        gunModel[216] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Import
        gunModel[217] = new ModelRendererTurbo(this, 673, 89, textureX, textureY); // Import
        gunModel[218] = new ModelRendererTurbo(this, 705, 89, textureX, textureY); // Import
        gunModel[219] = new ModelRendererTurbo(this, 785, 89, textureX, textureY); // Import
        gunModel[220] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Import
        gunModel[221] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Import
        gunModel[222] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Import
        gunModel[223] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import
        gunModel[224] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Import
        gunModel[225] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Import
        gunModel[226] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Import
        gunModel[227] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Import
        gunModel[228] = new ModelRendererTurbo(this, 553, 89, textureX, textureY); // Import
        gunModel[229] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Import
        gunModel[230] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Import
        gunModel[231] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Import
        gunModel[232] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Import
        gunModel[233] = new ModelRendererTurbo(this, 617, 65, textureX, textureY); // Import
        gunModel[234] = new ModelRendererTurbo(this, 785, 65, textureX, textureY); // Import
        gunModel[235] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Import
        gunModel[236] = new ModelRendererTurbo(this, 569, 65, textureX, textureY); // Import
        gunModel[237] = new ModelRendererTurbo(this, 649, 65, textureX, textureY); // Import
        gunModel[238] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Import
        gunModel[239] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Import
        gunModel[240] = new ModelRendererTurbo(this, 553, 81, textureX, textureY); // Import
        gunModel[241] = new ModelRendererTurbo(this, 673, 65, textureX, textureY); // Import
        gunModel[242] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Import
        gunModel[243] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Import
        gunModel[244] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Import
        gunModel[245] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Import
        gunModel[246] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Import
        gunModel[247] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Import
        gunModel[248] = new ModelRendererTurbo(this, 625, 97, textureX, textureY); // Import
        gunModel[249] = new ModelRendererTurbo(this, 529, 97, textureX, textureY); // Import
        gunModel[250] = new ModelRendererTurbo(this, 713, 65, textureX, textureY); // Import
        gunModel[251] = new ModelRendererTurbo(this, 641, 97, textureX, textureY); // Import
        gunModel[252] = new ModelRendererTurbo(this, 721, 97, textureX, textureY); // Import
        gunModel[253] = new ModelRendererTurbo(this, 761, 97, textureX, textureY); // Import
        gunModel[254] = new ModelRendererTurbo(this, 801, 97, textureX, textureY); // Import
        gunModel[255] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Import
        gunModel[256] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Import
        gunModel[257] = new ModelRendererTurbo(this, 849, 97, textureX, textureY); // Import
        gunModel[258] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Import
        gunModel[259] = new ModelRendererTurbo(this, 561, 105, textureX, textureY); // Import
        gunModel[260] = new ModelRendererTurbo(this, 881, 97, textureX, textureY); // Import
        gunModel[261] = new ModelRendererTurbo(this, 905, 65, textureX, textureY); // Import
        gunModel[262] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Import
        gunModel[263] = new ModelRendererTurbo(this, 745, 97, textureX, textureY); // Import
        gunModel[264] = new ModelRendererTurbo(this, 953, 97, textureX, textureY); // Import
        gunModel[265] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Import
        gunModel[266] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Import
        gunModel[267] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Import
        gunModel[268] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Import
        gunModel[269] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Import
        gunModel[270] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Import
        gunModel[271] = new ModelRendererTurbo(this, 529, 81, textureX, textureY); // Import
        gunModel[272] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Import
        gunModel[273] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Import
        gunModel[274] = new ModelRendererTurbo(this, 649, 81, textureX, textureY); // Import
        gunModel[275] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Import
        gunModel[276] = new ModelRendererTurbo(this, 841, 81, textureX, textureY); // Import
        gunModel[277] = new ModelRendererTurbo(this, 865, 81, textureX, textureY); // Import
        gunModel[278] = new ModelRendererTurbo(this, 889, 81, textureX, textureY); // Import
        gunModel[279] = new ModelRendererTurbo(this, 697, 89, textureX, textureY); // Import
        gunModel[280] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Import
        gunModel[281] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import
        gunModel[282] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Import
        gunModel[283] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import
        gunModel[284] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import
        gunModel[285] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import
        gunModel[286] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Import
        gunModel[287] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Import
        gunModel[288] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import
        gunModel[289] = new ModelRendererTurbo(this, 913, 81, textureX, textureY); // Import
        gunModel[290] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Import
        gunModel[291] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import
        gunModel[292] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Import
        gunModel[293] = new ModelRendererTurbo(this, 721, 9, textureX, textureY); // Import
        gunModel[294] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Import
        gunModel[295] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import
        gunModel[296] = new ModelRendererTurbo(this, 905, 97, textureX, textureY); // Import
        gunModel[297] = new ModelRendererTurbo(this, 969, 97, textureX, textureY); // Import
        gunModel[298] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Import
        gunModel[299] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Import
        gunModel[300] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Import
        gunModel[301] = new ModelRendererTurbo(this, 721, 17, textureX, textureY); // Import
        gunModel[302] = new ModelRendererTurbo(this, 897, 17, textureX, textureY); // Import
        gunModel[303] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Import
        gunModel[304] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import
        gunModel[305] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Import
        gunModel[306] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Import
        gunModel[307] = new ModelRendererTurbo(this, 953, 81, textureX, textureY); // Import
        gunModel[308] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Import
        gunModel[309] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Import
        gunModel[310] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Import
        gunModel[311] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import
        gunModel[312] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Import
        gunModel[313] = new ModelRendererTurbo(this, 633, 81, textureX, textureY); // Import
        gunModel[314] = new ModelRendererTurbo(this, 673, 81, textureX, textureY); // Import
        gunModel[315] = new ModelRendererTurbo(this, 993, 81, textureX, textureY); // Import
        gunModel[316] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import
        gunModel[317] = new ModelRendererTurbo(this, 985, 97, textureX, textureY); // Import
        gunModel[318] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Import
        gunModel[319] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Import
        gunModel[320] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Import
        gunModel[321] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Import
        gunModel[322] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import
        gunModel[323] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Import
        gunModel[324] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Import
        gunModel[325] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Import
        gunModel[326] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Import
        gunModel[327] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Import
        gunModel[328] = new ModelRendererTurbo(this, 1009, 97, textureX, textureY); // Import
        gunModel[329] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Import
        gunModel[330] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Import
        gunModel[331] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Import
        gunModel[332] = new ModelRendererTurbo(this, 681, 105, textureX, textureY); // Import
        gunModel[333] = new ModelRendererTurbo(this, 881, 105, textureX, textureY); // Import
        gunModel[334] = new ModelRendererTurbo(this, 937, 105, textureX, textureY); // Import
        gunModel[335] = new ModelRendererTurbo(this, 745, 105, textureX, textureY); // Import
        gunModel[336] = new ModelRendererTurbo(this, 993, 105, textureX, textureY); // Import
        gunModel[337] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Import
        gunModel[338] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Import
        gunModel[339] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Import
        gunModel[340] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Import
        gunModel[341] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Import
        gunModel[342] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Import
        gunModel[343] = new ModelRendererTurbo(this, 665, 105, textureX, textureY); // Import
        gunModel[344] = new ModelRendererTurbo(this, 761, 105, textureX, textureY); // Import
        gunModel[345] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import
        gunModel[346] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Import
        gunModel[347] = new ModelRendererTurbo(this, 953, 105, textureX, textureY); // Import
        gunModel[348] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Import
        gunModel[349] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Import
        gunModel[350] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Import
        gunModel[351] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import
        gunModel[352] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Import
        gunModel[353] = new ModelRendererTurbo(this, 593, 49, textureX, textureY); // Import
        gunModel[354] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Import
        gunModel[355] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Import
        gunModel[356] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Import
        gunModel[357] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Import
        gunModel[358] = new ModelRendererTurbo(this, 769, 113, textureX, textureY); // Import
        gunModel[359] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Import
        gunModel[360] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Import
        gunModel[361] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Import
        gunModel[362] = new ModelRendererTurbo(this, 537, 121, textureX, textureY); // Import
        gunModel[363] = new ModelRendererTurbo(this, 641, 121, textureX, textureY); // Import
        gunModel[364] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Import
        gunModel[365] = new ModelRendererTurbo(this, 865, 113, textureX, textureY); // Import
        gunModel[366] = new ModelRendererTurbo(this, 937, 113, textureX, textureY); // Import
        gunModel[367] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import
        gunModel[368] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Import
        gunModel[369] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Import
        gunModel[370] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Import
        gunModel[371] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Import
        gunModel[372] = new ModelRendererTurbo(this, 1009, 113, textureX, textureY); // Import
        gunModel[373] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Import
        gunModel[374] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Import
        gunModel[375] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Import
        gunModel[376] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Import
        gunModel[377] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Import
        gunModel[378] = new ModelRendererTurbo(this, 841, 41, textureX, textureY); // Import
        gunModel[379] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Import
        gunModel[380] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import
        gunModel[381] = new ModelRendererTurbo(this, 617, 49, textureX, textureY); // Import
        gunModel[382] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Import
        gunModel[383] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Import
        gunModel[384] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Import
        gunModel[385] = new ModelRendererTurbo(this, 905, 65, textureX, textureY); // Import
        gunModel[386] = new ModelRendererTurbo(this, 1017, 65, textureX, textureY); // Import
        gunModel[387] = new ModelRendererTurbo(this, 1009, 105, textureX, textureY); // Import
        gunModel[388] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Import
        gunModel[389] = new ModelRendererTurbo(this, 849, 97, textureX, textureY); // Import
        gunModel[390] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import
        gunModel[391] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Import
        gunModel[392] = new ModelRendererTurbo(this, 745, 121, textureX, textureY); // Import
        gunModel[393] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Import
        gunModel[394] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Import
        gunModel[395] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Import
        gunModel[396] = new ModelRendererTurbo(this, 609, 129, textureX, textureY); // Import
        gunModel[397] = new ModelRendererTurbo(this, 593, 113, textureX, textureY); // Import
        gunModel[398] = new ModelRendererTurbo(this, 705, 129, textureX, textureY); // Import
        gunModel[399] = new ModelRendererTurbo(this, 705, 113, textureX, textureY); // Import
        gunModel[400] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Import
        gunModel[401] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Import
        gunModel[402] = new ModelRendererTurbo(this, 833, 121, textureX, textureY); // Import
        gunModel[403] = new ModelRendererTurbo(this, 825, 129, textureX, textureY); // Import
        gunModel[404] = new ModelRendererTurbo(this, 625, 113, textureX, textureY); // Import
        gunModel[405] = new ModelRendererTurbo(this, 881, 121, textureX, textureY); // Import
        gunModel[406] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Import
        gunModel[407] = new ModelRendererTurbo(this, 801, 81, textureX, textureY); // Import
        gunModel[408] = new ModelRendererTurbo(this, 937, 129, textureX, textureY); // Import
        gunModel[409] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Import
        gunModel[410] = new ModelRendererTurbo(this, 825, 105, textureX, textureY); // Import
        gunModel[411] = new ModelRendererTurbo(this, 993, 129, textureX, textureY); // Import
        gunModel[412] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Import
        gunModel[413] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Import
        gunModel[414] = new ModelRendererTurbo(this, 961, 113, textureX, textureY); // Import
        gunModel[415] = new ModelRendererTurbo(this, 897, 121, textureX, textureY); // Import
        gunModel[416] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Import
        gunModel[417] = new ModelRendererTurbo(this, 521, 137, textureX, textureY); // Import
        gunModel[418] = new ModelRendererTurbo(this, 545, 137, textureX, textureY); // Import
        gunModel[419] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Import
        gunModel[420] = new ModelRendererTurbo(this, 993, 121, textureX, textureY); // Import
        gunModel[421] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Import
        gunModel[422] = new ModelRendererTurbo(this, 569, 137, textureX, textureY); // Import
        gunModel[423] = new ModelRendererTurbo(this, 681, 105, textureX, textureY); // Import
        gunModel[424] = new ModelRendererTurbo(this, 1017, 81, textureX, textureY); // Import
        gunModel[425] = new ModelRendererTurbo(this, 585, 137, textureX, textureY); // Import
        gunModel[426] = new ModelRendererTurbo(this, 745, 105, textureX, textureY); // Import
        gunModel[427] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Import
        gunModel[428] = new ModelRendererTurbo(this, 601, 137, textureX, textureY); // Import
        gunModel[429] = new ModelRendererTurbo(this, 617, 137, textureX, textureY); // Import
        gunModel[430] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Import
        gunModel[431] = new ModelRendererTurbo(this, 961, 129, textureX, textureY); // Import
        gunModel[432] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Import
        gunModel[433] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Import
        gunModel[434] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Import
        gunModel[435] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Import
        gunModel[436] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Import
        gunModel[437] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Import
        gunModel[438] = new ModelRendererTurbo(this, 529, 81, textureX, textureY); // Import
        gunModel[439] = new ModelRendererTurbo(this, 649, 81, textureX, textureY); // Import
        gunModel[440] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Import
        gunModel[441] = new ModelRendererTurbo(this, 841, 81, textureX, textureY); // Import
        gunModel[442] = new ModelRendererTurbo(this, 865, 81, textureX, textureY); // Import
        gunModel[443] = new ModelRendererTurbo(this, 889, 81, textureX, textureY); // Import
        gunModel[444] = new ModelRendererTurbo(this, 913, 81, textureX, textureY); // Import
        gunModel[445] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Import
        gunModel[446] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Import
        gunModel[447] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Import
        gunModel[448] = new ModelRendererTurbo(this, 569, 89, textureX, textureY); // Import
        gunModel[449] = new ModelRendererTurbo(this, 529, 9, textureX, textureY); // Import
        gunModel[450] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Import
        gunModel[451] = new ModelRendererTurbo(this, 625, 137, textureX, textureY); // Import
        gunModel[452] = new ModelRendererTurbo(this, 689, 137, textureX, textureY); // Import
        gunModel[453] = new ModelRendererTurbo(this, 713, 137, textureX, textureY); // Import
        gunModel[454] = new ModelRendererTurbo(this, 721, 137, textureX, textureY); // Import
        gunModel[455] = new ModelRendererTurbo(this, 777, 137, textureX, textureY); // Import
        gunModel[456] = new ModelRendererTurbo(this, 825, 137, textureX, textureY); // Import
        gunModel[457] = new ModelRendererTurbo(this, 857, 137, textureX, textureY); // Import
        gunModel[458] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Import
        gunModel[459] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Import
        gunModel[460] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Import
        gunModel[461] = new ModelRendererTurbo(this, 873, 137, textureX, textureY); // Import
        gunModel[462] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Import
        gunModel[463] = new ModelRendererTurbo(this, 953, 137, textureX, textureY); // Import
        gunModel[464] = new ModelRendererTurbo(this, 553, 145, textureX, textureY); // Import
        gunModel[465] = new ModelRendererTurbo(this, 697, 145, textureX, textureY); // Import
        gunModel[466] = new ModelRendererTurbo(this, 929, 137, textureX, textureY); // Import
        gunModel[467] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Import
        gunModel[468] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Import
        gunModel[469] = new ModelRendererTurbo(this, 713, 153, textureX, textureY); // Import
        gunModel[470] = new ModelRendererTurbo(this, 609, 153, textureX, textureY); // Import
        gunModel[471] = new ModelRendererTurbo(this, 633, 153, textureX, textureY); // Import
        gunModel[472] = new ModelRendererTurbo(this, 945, 113, textureX, textureY); // Import
        gunModel[473] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Import
        gunModel[474] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Import
        gunModel[475] = new ModelRendererTurbo(this, 521, 169, textureX, textureY); // Import
        gunModel[476] = new ModelRendererTurbo(this, 545, 169, textureX, textureY); // Import
        gunModel[477] = new ModelRendererTurbo(this, 569, 169, textureX, textureY); // Import
        gunModel[478] = new ModelRendererTurbo(this, 593, 169, textureX, textureY); // Import
        gunModel[479] = new ModelRendererTurbo(this, 697, 169, textureX, textureY); // Import
        gunModel[480] = new ModelRendererTurbo(this, 1001, 169, textureX, textureY); // Import
        gunModel[481] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Import
        gunModel[482] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Import
        gunModel[483] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Import
        gunModel[484] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // Import
        gunModel[485] = new ModelRendererTurbo(this, 121, 177, textureX, textureY); // Import
        gunModel[486] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Import
        gunModel[487] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Import
        gunModel[488] = new ModelRendererTurbo(this, 697, 105, textureX, textureY); // Import
        gunModel[489] = new ModelRendererTurbo(this, 897, 105, textureX, textureY); // Import
        gunModel[490] = new ModelRendererTurbo(this, 993, 105, textureX, textureY); // Import
        gunModel[491] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Import
        gunModel[492] = new ModelRendererTurbo(this, 737, 113, textureX, textureY); // Import
        gunModel[493] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Import
        gunModel[494] = new ModelRendererTurbo(this, 513, 169, textureX, textureY); // Import
        gunModel[495] = new ModelRendererTurbo(this, 937, 113, textureX, textureY); // Import
        gunModel[496] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import
        gunModel[497] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Import
        gunModel[498] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Import
        gunModel[499] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Import

        gunModel[0].addShapeBox(9F, -8F, -4F, 13, 12, 8, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F); // Import
        gunModel[0].setRotationPoint(-1F, -31F, 0F);

        gunModel[1].addShapeBox(9F, -8F, -4F, 8, 6, 8, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F); // Import
        gunModel[1].setRotationPoint(-21F, -31F, 0F);

        gunModel[2].addShapeBox(9F, -8F, -4F, 7, 1, 8, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -3.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -3.0F, 0.0F, 0.25F); // Import
        gunModel[2].setRotationPoint(-20F, -25.5F, 0F);

        gunModel[3].addShapeBox(9F, -8F, -4F, 4, 2, 8, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F); // Import
        gunModel[3].setRotationPoint(-17F, -24.5F, 0F);

        gunModel[4].addShapeBox(9F, -8F, -4F, 2, 4, 8, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.75F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, -1.75F, -0.75F, 0.25F); // Import
        gunModel[4].setRotationPoint(-15F, -22.5F, 0F);

        gunModel[5].addShapeBox(9F, -8F, -4F, 9, 3, 7, 0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); // Import
        gunModel[5].setRotationPoint(-13F, -19F, 0.5F);

        gunModel[6].addShapeBox(9F, -8F, -4F, 7, 3, 7, 0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F); // Import
        gunModel[6].setRotationPoint(-13.5F, -16F, 0.5F);

        gunModel[7].addShapeBox(9F, -8F, -4F, 6, 2, 7, 0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F); // Import
        gunModel[7].setRotationPoint(-14.5F, -13F, 0.5F);

        gunModel[8].addShapeBox(9F, -8F, -4F, 4, 1, 7, 0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F); // Import
        gunModel[8].setRotationPoint(-14.5F, -11F, 0.5F);

        gunModel[9].addShapeBox(9F, -8F, -4F, 2, 3, 7, 0F, -2.5F, 0.0F, 0.0F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, -2.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F); // Import
        gunModel[9].setRotationPoint(-6F, -19F, 0.5F);

        gunModel[10].addShapeBox(9F, -8F, -4F, 2, 3, 7, 0F, -2.25F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, -2.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F); // Import
        gunModel[10].setRotationPoint(-8F, -16F, 0.5F);

        gunModel[11].addShapeBox(9F, -8F, -4F, 2, 2, 7, 0F, -2.25F, 0.0F, 0.0F, 1.5F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[11].setRotationPoint(-10F, -13F, 0.5F);

        gunModel[12].addShapeBox(9F, -8F, -4F, 3, 1, 7, 0F, -2.0F, 0.0F, 0.0F, 1.5F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[12].setRotationPoint(-12F, -11F, 0.5F);

        gunModel[13].addShapeBox(9F, -8F, -4F, 3, 16, 7, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, -6.0F, 0.0F, -0.5F, -6.0F, 0.0F, -0.5F, 7.0F, 0.0F, 0.0F); // Import
        gunModel[13].setRotationPoint(-12F, -10F, 0.5F);

        gunModel[14].addShapeBox(9F, -8F, -4F, 1, 16, 6, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, -6.0F, 0.0F, -2.0F, -6.0F, 0.0F, -2.0F, 7.0F, 0.0F, 0.0F); // Import
        gunModel[14].setRotationPoint(-8F, -10F, 1F);

        gunModel[15].addShapeBox(9F, -8F, -4F, 2, 1, 6, 0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[15].setRotationPoint(-9F, -11F, 1F);

        gunModel[16].addShapeBox(9F, -8F, -4F, 2, 2, 6, 0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[16].setRotationPoint(-8F, -13F, 1F);

        gunModel[17].addShapeBox(9F, -8F, -4F, 3, 3, 6, 0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[17].setRotationPoint(-7F, -16F, 1F);

        gunModel[18].addShapeBox(9F, -8F, -4F, 3, 3, 6, 0F, -1.75F, 0.0F, 0.0F, 0.75F, 0.0F, -2.0F, 0.75F, 0.0F, -2.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[18].setRotationPoint(-5F, -19F, 1F);

        gunModel[19].addShapeBox(9F, -8F, -4F, 25, 1, 8, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F); // Import
        gunModel[19].setRotationPoint(-13F, -19.25F, 0F);

        gunModel[20].addShapeBox(9F, -8F, -4F, 1, 1, 8, 0F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -1.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -1.0F, -0.75F, -0.5F); // Import
        gunModel[20].setRotationPoint(-14F, -19.25F, 0F);

        gunModel[21].addShapeBox(9F, -8F, -4F, 1, 3, 7, 0F, -1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, -0.5F); // Import
        gunModel[21].setRotationPoint(-15.5F, -16F, 0.5F);

        gunModel[22].addShapeBox(9F, -8F, -4F, 1, 3, 7, 0F, -1.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[22].setRotationPoint(-14.5F, -19F, 0.5F);

        gunModel[23].addShapeBox(9F, -8F, -4F, 1, 2, 7, 0F, -0.25F, 0.0F, -0.5F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F); // Import
        gunModel[23].setRotationPoint(-16.5F, -13F, 0.5F);

        gunModel[24].addShapeBox(9F, -8F, -4F, 1, 1, 7, 0F, 1.0F, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 1.75F, 0.0F, -0.5F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.75F, 0.0F, -0.5F); // Import
        gunModel[24].setRotationPoint(-16.5F, -11F, 0.5F);

        gunModel[25].addShapeBox(9F, -8F, -4F, 1, 10, 7, 0F, 1.75F, 0.0F, -0.5F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.75F, 0.0F, -0.5F, 8.5F, 0.0F, -0.5F, -5.5F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, 8.5F, 0.0F, -0.5F); // Import
        gunModel[25].setRotationPoint(-16.5F, -10F, 0.5F);

        gunModel[26].addShapeBox(9F, -8F, -4F, 1, 10, 6, 0F, 1.75F, 0.0F, -2.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.75F, 0.0F, -2.0F, 8.5F, 0.0F, -2.0F, -7.5F, 0.0F, 0.0F, -7.5F, 0.0F, 0.0F, 8.5F, 0.0F, -2.0F); // Import
        gunModel[26].setRotationPoint(-18.5F, -10F, 1F);

        gunModel[27].addShapeBox(9F, -8F, -4F, 1, 2, 6, 0F, -0.25F, 0.0F, -2.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F); // Import
        gunModel[27].setRotationPoint(-18.5F, -13F, 1F);

        gunModel[28].addShapeBox(9F, -8F, -4F, 1, 1, 6, 0F, 1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 1.75F, 0.0F, -2.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.75F, 0.0F, -2.0F); // Import
        gunModel[28].setRotationPoint(-18.5F, -11F, 1F);

        gunModel[29].addShapeBox(9F, -8F, -4F, 1, 3, 6, 0F, -1.0F, 0.0F, -2.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, 0.75F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, -2.0F); // Import
        gunModel[29].setRotationPoint(-17.5F, -16F, 1F);

        gunModel[30].addShapeBox(9F, -8F, -4F, 1, 3, 6, 0F, -1.0F, 0.0F, -2.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[30].setRotationPoint(-16.5F, -19F, 1F);

        gunModel[31].addShapeBox(9F, -8F, -4F, 1, 10, 7, 0F, 1.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 8.5F, 0.0F, 0.0F, -4.85F, 0.0F, 0.0F, -4.85F, 0.0F, 0.0F, 8.5F, 0.0F, 0.0F); // Import
        gunModel[31].setRotationPoint(-12.5F, -10F, 0.5F);

        gunModel[32].addShapeBox(9F, -8F, -4F, 2, 2, 6, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, -2.0F); // Import
        gunModel[32].setRotationPoint(-27F, 0F, 1F);

        gunModel[33].addShapeBox(9F, -8F, -4F, 4, 3, 7, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -0.75F, -0.5F); // Import
        gunModel[33].setRotationPoint(-25F, 0F, 0.5F);

        gunModel[34].addShapeBox(9F, -8F, -4F, 5, 3, 7, 0F, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.75F, 0.0F, -3.0F, 3.0F, 0.0F, -3.0F, 3.0F, 0.0F, 0.0F, 1.75F, 0.0F); // Import
        gunModel[34].setRotationPoint(-21F, 0F, 0.5F);

        gunModel[35].addShapeBox(9F, -8F, -4F, 4, 1, 6, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.5F); // Import
        gunModel[35].setRotationPoint(-19F, 6F, 1F);

        gunModel[36].addShapeBox(9F, -8F, -4F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[36].setRotationPoint(-15F, 6F, 1F);

        gunModel[37].addShapeBox(9F, -8F, -4F, 3, 1, 6, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.75F, -2.0F, -1.0F, 0.75F, -2.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[37].setRotationPoint(-15F, 7F, 1F);

        gunModel[38].addShapeBox(9F, -8F, -4F, 3, 1, 6, 0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, -2.0F, -1.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[38].setRotationPoint(-15F, 6F, 1F);

        gunModel[39].addShapeBox(9F, -8F, -4F, 33, 1, 8, 0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F); // Import
        gunModel[39].setRotationPoint(-21F, -31.75F, 0F);

        gunModel[40].addShapeBox(9F, -8F, -4F, 1, 1, 7, 0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.75F, -0.25F, -0.75F, 0.75F, -0.25F, -0.75F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F); // Import
        gunModel[40].setRotationPoint(-14F, -20F, 0.5F);

        gunModel[41].addShapeBox(9F, -8F, -4F, 1, 1, 7, 0F, 0.5F, -0.75F, -2.25F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.5F, -0.75F, -2.25F, 0.5F, 0.0F, -2.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -2.5F); // Import
        gunModel[41].setRotationPoint(-15F, -20F, 0.5F);

        gunModel[42].addShapeBox(9F, -8F, -4F, 1, 4, 7, 0F, -0.5F, -0.75F, 0.0F, -0.25F, -0.75F, 0.75F, -0.25F, -0.75F, 0.75F, -0.5F, -0.75F, 0.0F, -2.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.75F, 1.5F, 0.0F, 0.75F, -2.0F, 0.0F, 0.0F); // Import
        gunModel[42].setRotationPoint(-15.75F, -23.25F, 0.5F);

        gunModel[43].addShapeBox(9F, -8F, -4F, 2, 2, 3, 0F, -1.75F, -0.5F, 0.25F, 0.8F, -0.5F, 2.0F, 0.8F, -0.5F, 2.0F, -1.75F, -0.5F, 0.25F, -1.75F, 0.0F, -0.25F, 1.5F, 0.0F, 2.0F, 1.5F, 0.0F, 2.0F, -1.75F, 0.0F, -0.25F); // Import
        gunModel[43].setRotationPoint(-17.25F, -21.25F, 2.5F);

        gunModel[44].addShapeBox(9F, -8F, -4F, 2, 2, 3, 0F, -1.0F, -0.25F, 0.25F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, 2.0F, -1.0F, -0.25F, 0.25F, -1.75F, 0.0F, 0.25F, 0.8F, 0.0F, 2.0F, 0.8F, 0.0F, 2.0F, -1.75F, 0.0F, 0.25F); // Import
        gunModel[44].setRotationPoint(-17.25F, -22.75F, 2.5F);

        gunModel[45].addShapeBox(9F, -8F, -4F, 1, 2, 7, 0F, -0.5F, -0.75F, 0.0F, -0.25F, -0.75F, 0.75F, -0.25F, -0.75F, 0.75F, -0.5F, -0.75F, 0.0F, -2.5F, 0.75F, 0.0F, 1.75F, 0.75F, 0.75F, 1.75F, 0.75F, 0.75F, -2.5F, 0.75F, 0.0F); // Import
        gunModel[45].setRotationPoint(-17.75F, -25.25F, 0.5F);

        gunModel[46].addShapeBox(9F, -8F, -4F, 2, 2, 3, 0F, -0.5F, -0.25F, 0.25F, -1.0F, -0.25F, 2.0F, -1.0F, -0.25F, 2.0F, -0.5F, -0.25F, 0.25F, -2.0F, 0.25F, 0.25F, 1.0F, 0.25F, 2.0F, 1.0F, 0.25F, 2.0F, -2.0F, 0.25F, 0.25F); // Import
        gunModel[46].setRotationPoint(-18.25F, -24.75F, 2.5F);

        gunModel[47].addShapeBox(9F, -8F, -4F, 1, 1, 7, 0F, 0.5F, -0.75F, 0.75F, -1.25F, -0.75F, 0.75F, -1.25F, -0.75F, 0.75F, 0.5F, -0.75F, 0.75F, -2.5F, 0.75F, 0.0F, 1.75F, 0.75F, 0.75F, 1.75F, 0.75F, 0.75F, -2.5F, 0.75F, 0.0F); // Import
        gunModel[47].setRotationPoint(-19.75F, -26.25F, 0.5F);

        gunModel[48].addShapeBox(9F, -8F, -4F, 2, 2, 3, 0F, -0.25F, -1.25F, 0.5F, -1.0F, -1.25F, 2.75F, -1.0F, -1.25F, 2.75F, -0.25F, -1.25F, 0.5F, -3.5F, 0.25F, 0.25F, 2.0F, 0.25F, 2.0F, 2.0F, 0.25F, 2.0F, -3.5F, 0.25F, 0.25F); // Import
        gunModel[48].setRotationPoint(-21.25F, -26.75F, 2.5F);

        gunModel[49].addShapeBox(9F, -8F, -4F, 2, 2, 4, 0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[49].setRotationPoint(-5F, -12F, 2F);

        gunModel[50].addShapeBox(9F, -8F, -4F, 3, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[50].setRotationPoint(-3F, -11.25F, 2F);

        gunModel[51].addShapeBox(9F, -8F, -4F, 8, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[51].setRotationPoint(0F, -9.5F, 2F);

        gunModel[52].addShapeBox(9F, -8F, -4F, 2, 1, 4, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[52].setRotationPoint(8F, -9.5F, 2F);

        gunModel[53].addShapeBox(9F, -8F, -4F, 1, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[53].setRotationPoint(9.5F, -10.5F, 2F);

        gunModel[54].addShapeBox(9F, -8F, -4F, 1, 4, 4, 0F, -1.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[54].setRotationPoint(10.5F, -16F, 2F);

        gunModel[55].addShapeBox(9F, -8F, -4F, 1, 1, 4, 0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[55].setRotationPoint(10.5F, -12F, 2F);

        gunModel[56].addShapeBox(9F, -8F, -4F, 1, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F); // Import
        gunModel[56].setRotationPoint(11.5F, -17F, 2F);

        gunModel[57].addShapeBox(9F, -8F, -4F, 1, 1, 4, 0F, 0.5F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[57].setRotationPoint(11.5F, -18F, 2F);

        gunModel[58].addShapeBox(9F, -8F, -4F, 1, 3, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.75F, -0.5F, 0.0F); // Import
        gunModel[58].setRotationPoint(-6F, -13F, 2F);

        gunModel[59].addShapeBox(9F, -8F, -4F, 1, 12, 8, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.25F); // Import
        gunModel[59].setRotationPoint(12F, -31F, 0F);

        gunModel[60].addShapeBox(9F, -8F, -4F, 2, 12, 8, 0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F); // Import
        gunModel[60].setRotationPoint(13F, -31F, 0F);

        gunModel[61].addShapeBox(9F, -8F, -4F, 2, 3, 8, 0F, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[61].setRotationPoint(14.5F, -31F, 0F);

        gunModel[62].addShapeBox(9F, -8F, -4F, 2, 1, 9, 0F, 0.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[62].setRotationPoint(14.5F, -24F, -0.5F);

        gunModel[63].addShapeBox(9F, -8F, -4F, 2, 1, 9, 0F, 0.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[63].setRotationPoint(14.5F, -24.5F, -0.5F);

        gunModel[64].addShapeBox(9F, -8F, -4F, 2, 1, 9, 0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        gunModel[64].setRotationPoint(14.5F, -27.5F, -0.5F);

        gunModel[65].addShapeBox(9F, -8F, -4F, 2, 1, 9, 0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[65].setRotationPoint(14.5F, -28F, -0.5F);

        gunModel[66].addShapeBox(9F, -8F, -4F, 2, 4, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        gunModel[66].setRotationPoint(14.5F, -23F, -0.5F);

        gunModel[67].addShapeBox(9F, -8F, -4F, 1, 4, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        gunModel[67].setRotationPoint(16.5F, -23F, -0.5F);

        gunModel[68].addShapeBox(9F, -8F, -4F, 1, 4, 9, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        gunModel[68].setRotationPoint(17.5F, -23F, -0.5F);

        gunModel[69].addShapeBox(9F, -8F, -4F, 1, 4, 9, 0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F, -1.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, -0.75F, 0.0F); // Import
        gunModel[69].setRotationPoint(18.5F, -23F, -0.5F);

        gunModel[70].addShapeBox(9F, -8F, -4F, 1, 1, 8, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.5F); // Import
        gunModel[70].setRotationPoint(12F, -19.25F, 0F);

        gunModel[71].addShapeBox(9F, -8F, -4F, 3, 1, 8, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F); // Import
        gunModel[71].setRotationPoint(13F, -19.25F, 0F);

        gunModel[72].addShapeBox(9F, -8F, -4F, 1, 1, 8, 0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F); // Import
        gunModel[72].setRotationPoint(16F, -19.25F, 0F);

        gunModel[73].addShapeBox(9F, -8F, -4F, 3, 1, 8, 0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F); // Import
        gunModel[73].setRotationPoint(13F, -31.75F, 0F);

        gunModel[74].addShapeBox(9F, -8F, -4F, 1, 1, 8, 0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.25F); // Import
        gunModel[74].setRotationPoint(12F, -31.75F, 0F);

        gunModel[75].addShapeBox(9F, -8F, -4F, 4, 7, 7, 0F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 1.25F, 0.0F, -0.25F, 1.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[75].setRotationPoint(14.5F, -27F, 0.5F);

        gunModel[76].addShapeBox(9F, -8F, -4F, 38, 5, 8, 0F, 0.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 1.75F, 0.0F, -0.25F, 1.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[76].setRotationPoint(-21.5F, -32F, 0F);

        gunModel[77].addShapeBox(9F, -8F, -4F, 25, 2, 10, 0F, 1.1F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.1F, 0.0F, -0.25F, 0.6F, 0.5F, -0.25F, 1.0F, 0.5F, -0.25F, 1.0F, 0.5F, -0.25F, 0.6F, 0.5F, -0.25F); // Import
        gunModel[77].setRotationPoint(18.5F, -31F, -1F);

        gunModel[78].addShapeBox(9F, -8F, -4F, 7, 2, 10, 0F, 0.6F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.6F, -0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F); // Import
        gunModel[78].setRotationPoint(18.5F, -29F, -1F);

        gunModel[79].addShapeBox(9F, -8F, -4F, 2, 1, 7, 0F, 0.0F, 0.0F, -0.25F, 1.25F, 0.0F, -0.25F, 1.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 1.5F, 0.0F, -0.25F, 1.5F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F); // Import
        gunModel[79].setRotationPoint(16.5F, -20F, 0.5F);

        gunModel[80].addShapeBox(9F, -8F, -4F, 2, 3, 9, 0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F); // Import
        gunModel[80].setRotationPoint(24.25F, -27F, 0F);

        gunModel[81].addShapeBox(9F, -8F, -4F, 8, 4, 10, 0F, 0.25F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, -0.5F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F); // Import
        gunModel[81].setRotationPoint(18.5F, -27.5F, -1.5F);

        gunModel[82].addShapeBox(9F, -8F, -4F, 3, 1, 4, 0F, 0.5F, 0.0F, 0.5F, 2.25F, 0.0F, 0.5F, 2.25F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[82].setRotationPoint(10.5F, -19F, 2F);

        gunModel[83].addShapeBox(9F, -8F, -4F, 2, 4, 10, 0F, 0.0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F); // Import
        gunModel[83].setRotationPoint(19F, -24F, -1F);

        gunModel[84].addShapeBox(9F, -8F, -4F, 8, 5, 10, 0F, 0.0F, -0.5F, -0.25F, 1.0F, -0.5F, -0.25F, 1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 1.0F, 0.5F, -0.25F, 1.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F); // Import
        gunModel[84].setRotationPoint(25.75F, -29F, -1F);

        gunModel[85].addShapeBox(9F, -8F, -4F, 2, 1, 10, 0F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F); // Import
        gunModel[85].setRotationPoint(19F, -20F, -1F);

        gunModel[86].addShapeBox(9F, -8F, -4F, 74, 3, 7, 0F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[86].setRotationPoint(-22F, -35F, 0.5F);

        gunModel[87].addShapeBox(9F, -8F, -4F, 69, 1, 1, 0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[87].setRotationPoint(-17F, -33F, -0.75F);

        gunModel[88].addShapeBox(9F, -8F, -4F, 69, 1, 1, 0F, 0.0F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[88].setRotationPoint(-17F, -34.5F, -0.75F);

        gunModel[89].addShapeBox(9F, -8F, -4F, 69, 1, 1, 0F, 0.0F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.5F, 0.5F, -1.0F, 0.5F, 0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[89].setRotationPoint(-17F, -34.75F, -0.75F);

        gunModel[90].addShapeBox(9F, -8F, -4F, 51, 3, 8, 0F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[90].setRotationPoint(-19F, -38F, 0F);

        gunModel[91].addShapeBox(9F, -8F, -4F, 74, 1, 1, 0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[91].setRotationPoint(-22F, -33F, 7.75F);

        gunModel[92].addShapeBox(9F, -8F, -4F, 74, 1, 1, 0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[92].setRotationPoint(-22F, -34.5F, 7.75F);

        gunModel[93].addShapeBox(9F, -8F, -4F, 71, 1, 1, 0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F); // Import
        gunModel[93].setRotationPoint(-19F, -34.75F, 7.75F);

        gunModel[94].addShapeBox(9F, -8F, -4F, 20, 3, 10, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[94].setRotationPoint(32.5F, -38F, -1F);

        gunModel[95].addShapeBox(9F, -8F, -4F, 70, 1, 10, 0F, 0.0F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.5F, 0.5F, -1.0F, 0.5F, 0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[95].setRotationPoint(-18F, -38F, -0.75F);

        gunModel[96].addShapeBox(9F, -8F, -4F, 71, 1, 10, 0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F); // Import
        gunModel[96].setRotationPoint(-19F, -39.5F, -1.25F);

        gunModel[97].addShapeBox(9F, -8F, -4F, 63, 1, 6, 0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[97].setRotationPoint(-19F, -40.5F, 2.25F);

        gunModel[98].addShapeBox(9F, -8F, -4F, 65, 1, 5, 0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F); // Import
        gunModel[98].setRotationPoint(-21F, -41.5F, 2.25F);

        gunModel[99].addShapeBox(9F, -8F, -4F, 75, 1, 2, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F); // Import
        gunModel[99].setRotationPoint(-21F, -44.75F, 3.65F);

        gunModel[100].addShapeBox(9F, -8F, -4F, 1, 2, 3, 0F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[100].setRotationPoint(1F, -15.5F, 2.5F);

        gunModel[101].addShapeBox(9F, -8F, -4F, 1, 2, 3, 0F, -0.25F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[101].setRotationPoint(1F, -17.5F, 2.5F);

        gunModel[102].addShapeBox(9F, -8F, -4F, 1, 1, 3, 0F, 0.25F, 0.5F, -0.25F, 1.5F, 0.5F, -0.25F, 1.5F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F); // Import
        gunModel[102].setRotationPoint(2F, -18.5F, 2.5F);

        gunModel[103].addShapeBox(9F, -8F, -4F, 1, 2, 3, 0F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F); // Import
        gunModel[103].setRotationPoint(1F, -13.5F, 2.5F);

        gunModel[104].addShapeBox(9F, -8F, -4F, 1, 2, 3, 0F, 0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -1.25F, -0.25F, -0.25F, 1.25F, -0.75F, -0.25F, 1.25F, -0.75F, -0.25F, -1.25F, -0.25F, -0.25F); // Import
        gunModel[104].setRotationPoint(2F, -11.5F, 2.5F);

        gunModel[105].addShapeBox(9F, -8F, -4F, 129, 1, 2, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[105].setRotationPoint(-21F, -43F, 3.65F);

        gunModel[106].addShapeBox(9F, -8F, -4F, 73, 2, 3, 0F, 0.0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F); // Import
        gunModel[106].setRotationPoint(-21F, -43F, 3.5F);

        gunModel[107].addShapeBox(9F, -8F, -4F, 75, 1, 4, 0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F); // Import
        gunModel[107].setRotationPoint(-21F, -46.25F, 1.65F);

        gunModel[108].addShapeBox(9F, -8F, -4F, 75, 1, 3, 0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[108].setRotationPoint(-21F, -47.25F, 2.15F);

        gunModel[109].addShapeBox(9F, -8F, -4F, 6, 1, 4, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F); // Import
        gunModel[109].setRotationPoint(102F, -44.75F, 1.65F);

        gunModel[110].addShapeBox(9F, -8F, -4F, 49, 1, 3, 0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[110].setRotationPoint(59F, -47.25F, 2.15F);

        gunModel[111].addShapeBox(9F, -8F, -4F, 49, 1, 4, 0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F); // Import
        gunModel[111].setRotationPoint(59F, -46.25F, 1.65F);

        gunModel[112].addShapeBox(9F, -8F, -4F, 48, 1, 2, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F); // Import
        gunModel[112].setRotationPoint(54F, -44.75F, 1.65F);

        gunModel[113].addShapeBox(9F, -8F, -4F, 5, 1, 2, 0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F); // Import
        gunModel[113].setRotationPoint(54F, -46.25F, 1.65F);

        gunModel[114].addShapeBox(9F, -8F, -4F, 5, 1, 1, 0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        gunModel[114].setRotationPoint(54F, -47.25F, 2.15F);

        gunModel[115].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[115].setRotationPoint(58F, -47.25F, 4.15F);

        gunModel[116].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[116].setRotationPoint(54F, -47.25F, 4.15F);

        gunModel[117].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, -1.0F, -0.5F, -0.15F, 0.0F, -0.5F, -0.15F, 0.0F, -0.5F, -0.35F, -0.5F, -0.5F, -0.1F, -1.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.35F, -0.5F, 0.0F, -0.1F); // Import
        gunModel[117].setRotationPoint(58F, -47.25F, 4F);

        gunModel[118].addShapeBox(9F, -8F, -4F, 51, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F); // Import
        gunModel[118].setRotationPoint(54F, -44.75F, 4.15F);

        gunModel[119].addShapeBox(9F, -8F, -4F, 22, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F); // Import
        gunModel[119].setRotationPoint(54F, -46.25F, 4.15F);

        gunModel[120].addShapeBox(9F, -8F, -4F, 7, 1, 4, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        gunModel[120].setRotationPoint(108F, -44.65F, 2F);

        gunModel[121].addShapeBox(9F, -8F, -4F, 7, 1, 4, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F); // Import
        gunModel[121].setRotationPoint(108F, -43.15F, 2F);

        gunModel[122].addShapeBox(9F, -8F, -4F, 7, 1, 2, 0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F); // Import
        gunModel[122].setRotationPoint(108F, -42.15F, 3F);

        gunModel[123].addShapeBox(9F, -8F, -4F, 7, 1, 4, 0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        gunModel[123].setRotationPoint(108F, -46.15F, 2F);

        gunModel[124].addShapeBox(9F, -8F, -4F, 7, 1, 2, 0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F); // Import
        gunModel[124].setRotationPoint(108F, -47.15F, 3F);

        gunModel[125].addShapeBox(9F, -8F, -4F, 19, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F); // Import
        gunModel[125].setRotationPoint(117F, -44.75F, 2.13F);

        gunModel[126].addShapeBox(9F, -8F, -4F, 2, 1, 4, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.1F, -0.13F, 0.0F, 0.1F, -0.13F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.15F, -0.13F, 0.0F, 0.15F, -0.13F, 0.0F, 0.25F, 0.25F); // Import
        gunModel[126].setRotationPoint(115F, -44.65F, 2F);

        gunModel[127].addShapeBox(9F, -8F, -4F, 2, 1, 4, 0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.65F, -0.63F, 0.0F, -0.65F, -0.63F, 0.0F, -0.25F, -0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.4F, -0.13F, 0.0F, 0.4F, -0.13F, 0.0F, 0.25F, 0.25F); // Import
        gunModel[127].setRotationPoint(115F, -46.15F, 2F);

        gunModel[128].addShapeBox(9F, -8F, -4F, 2, 1, 2, 0F, 0.0F, -0.75F, -0.25F, 0.0F, -1.15F, -0.37F, 0.0F, -1.15F, -0.37F, 0.0F, -0.75F, -0.25F, 0.0F, 0.25F, 0.5F, 0.0F, 0.65F, 0.37F, 0.0F, 0.65F, 0.37F, 0.0F, 0.25F, 0.5F); // Import
        gunModel[128].setRotationPoint(115F, -47.15F, 3F);

        gunModel[129].addShapeBox(9F, -8F, -4F, 19, 1, 3, 0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F); // Import
        gunModel[129].setRotationPoint(117F, -46F, 2.13F);

        gunModel[130].addShapeBox(9F, -8F, -4F, 19, 1, 3, 0F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[130].setRotationPoint(117F, -46.5F, 2.13F);

        gunModel[131].addShapeBox(9F, -8F, -4F, 19, 1, 3, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F); // Import
        gunModel[131].setRotationPoint(117F, -43.25F, 2.13F);

        gunModel[132].addShapeBox(9F, -8F, -4F, 19, 1, 3, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F); // Import
        gunModel[132].setRotationPoint(117F, -42.75F, 2.13F);

        gunModel[133].addShapeBox(9F, -8F, -4F, 2, 1, 4, 0F, 0.0F, 0.3F, 0.25F, 0.0F, 0.4F, -0.13F, 0.0F, 0.4F, -0.13F, 0.0F, 0.3F, 0.25F, 0.0F, -0.3F, -0.5F, 0.0F, -0.65F, -0.63F, 0.0F, -0.65F, -0.63F, 0.0F, -0.3F, -0.5F); // Import
        gunModel[133].setRotationPoint(115F, -43.1F, 2F);

        gunModel[134].addShapeBox(9F, -8F, -4F, 2, 1, 2, 0F, 0.0F, 0.3F, 0.45F, 0.0F, 0.65F, 0.37F, 0.0F, 0.65F, 0.37F, 0.0F, 0.3F, 0.45F, 0.0F, -0.8F, -0.25F, 0.0F, -1.15F, -0.37F, 0.0F, -1.15F, -0.37F, 0.0F, -0.8F, -0.25F); // Import
        gunModel[134].setRotationPoint(115F, -42.1F, 3F);

        gunModel[135].addShapeBox(9F, -8F, -4F, 1, 6, 8, 0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, -0.5F, -0.5F, -0.25F); // Import
        gunModel[135].setRotationPoint(-22F, -31F, 0F);

        gunModel[136].addShapeBox(9F, -8F, -4F, 1, 1, 8, 0F, -1.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -1.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, -0.5F, -0.25F, -0.25F); // Import
        gunModel[136].setRotationPoint(-22F, -31.75F, 0F);

        gunModel[137].addShapeBox(9F, -8F, -4F, 4, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[137].setRotationPoint(135F, -37F, 1F);

        gunModel[138].addShapeBox(9F, -8F, -4F, 4, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[138].setRotationPoint(135F, -35F, 1F);

        gunModel[139].addShapeBox(9F, -8F, -4F, 4, 1, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        gunModel[139].setRotationPoint(135F, -34F, 1.5F);

        gunModel[140].addShapeBox(9F, -8F, -4F, 4, 1, 6, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[140].setRotationPoint(135F, -38F, 1F);

        gunModel[141].addShapeBox(9F, -8F, -4F, 4, 1, 5, 0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[141].setRotationPoint(135F, -39F, 1.5F);

        gunModel[142].addShapeBox(9F, -8F, -4F, 4, 2, 3, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[142].setRotationPoint(135F, -41F, 2.5F);

        gunModel[143].addShapeBox(9F, -8F, -4F, 4, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[143].setRotationPoint(135F, -44.5F, 1F);

        gunModel[144].addShapeBox(9F, -8F, -4F, 4, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[144].setRotationPoint(135F, -42.5F, 1F);

        gunModel[145].addShapeBox(9F, -8F, -4F, 4, 1, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        gunModel[145].setRotationPoint(135F, -41.5F, 1.5F);

        gunModel[146].addShapeBox(9F, -8F, -4F, 4, 1, 6, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[146].setRotationPoint(135F, -45.5F, 1F);

        gunModel[147].addShapeBox(9F, -8F, -4F, 4, 1, 5, 0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[147].setRotationPoint(135F, -46.5F, 1.5F);

        gunModel[148].addShapeBox(9F, -8F, -4F, 4, 1, 1, 0F, 0.0F, -0.65F, -1.0F, 0.0F, -0.65F, -1.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[148].setRotationPoint(135F, -41.5F, 4.5F);

        gunModel[149].addShapeBox(9F, -8F, -4F, 4, 1, 1, 0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, -1.0F, 0.0F, -0.65F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[149].setRotationPoint(135F, -41.5F, 2.5F);

        gunModel[150].addShapeBox(9F, -8F, -4F, 4, 1, 1, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, -1.0F, 0.0F, -0.65F, -1.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F); // Import
        gunModel[150].setRotationPoint(135F, -39F, 4.5F);

        gunModel[151].addShapeBox(9F, -8F, -4F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, -1.0F, 0.0F, -0.65F, -1.0F); // Import
        gunModel[151].setRotationPoint(135F, -39F, 2.5F);

        gunModel[152].addShapeBox(9F, -8F, -4F, 4, 2, 3, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[152].setRotationPoint(135F, -48.5F, 2.5F);

        gunModel[153].addShapeBox(9F, -8F, -4F, 4, 1, 1, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, -1.0F, 0.0F, -0.65F, -1.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F); // Import
        gunModel[153].setRotationPoint(135F, -46.5F, 4.5F);

        gunModel[154].addShapeBox(9F, -8F, -4F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, -1.0F, 0.0F, -0.65F, -1.0F); // Import
        gunModel[154].setRotationPoint(135F, -46.5F, 2.5F);

        gunModel[155].addShapeBox(9F, -8F, -4F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[155].setRotationPoint(135F, -51F, 1F);

        gunModel[156].addShapeBox(9F, -8F, -4F, 4, 1, 2, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[156].setRotationPoint(135F, -50F, 5F);

        gunModel[157].addShapeBox(9F, -8F, -4F, 4, 1, 3, 0F, 0.0F, 0.0F, -0.5F, -0.45F, 0.0F, -0.5F, -0.45F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.0F, -0.15F, 0.0F, -2.0F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[157].setRotationPoint(135F, -53F, 3.5F);

        gunModel[158].addShapeBox(9F, -8F, -4F, 4, 1, 1, 0F, 0.0F, -0.65F, -1.0F, 0.0F, -0.65F, -1.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[158].setRotationPoint(135F, -49F, 4.5F);

        gunModel[159].addShapeBox(9F, -8F, -4F, 4, 1, 1, 0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, -1.0F, 0.0F, -0.65F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[159].setRotationPoint(135F, -49F, 2.5F);

        gunModel[160].addShapeBox(9F, -8F, -4F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[160].setRotationPoint(135F, -50F, 1F);

        gunModel[161].addShapeBox(9F, -8F, -4F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[161].setRotationPoint(135F, -51F, 6F);

        gunModel[162].addShapeBox(9F, -8F, -4F, 4, 1, 2, 0F, 0.0F, 0.0F, -0.5F, -0.15F, 0.0F, -0.5F, -0.15F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[162].setRotationPoint(135F, -52F, 5F);

        gunModel[163].addShapeBox(9F, -8F, -4F, 4, 1, 2, 0F, 0.0F, 0.0F, -0.5F, -0.15F, 0.0F, -0.5F, -0.15F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[163].setRotationPoint(135F, -52F, 1F);

        gunModel[164].addShapeBox(9F, -8F, -4F, 4, 1, 3, 0F, 0.0F, 0.0F, -1.5F, -0.45F, 0.0F, -1.5F, -0.45F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[164].setRotationPoint(135F, -53F, 1.5F);

        gunModel[165].addShapeBox(9F, -8F, -4F, 4, 1, 3, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        gunModel[165].setRotationPoint(135F, -49F, 3.5F);

        gunModel[166].addShapeBox(9F, -8F, -4F, 4, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[166].setRotationPoint(135F, -49F, 1.5F);

        gunModel[167].addShapeBox(9F, -8F, -4F, 4, 1, 3, 0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        gunModel[167].setRotationPoint(135F, -49F, 2.5F);

        gunModel[168].addShapeBox(9F, -8F, -4F, 4, 1, 3, 0F, 0.0F, 0.0F, -1.5F, -0.45F, 0.0F, -1.5F, -0.45F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, -0.75F, -0.3F, -0.5F, -0.75F, -0.3F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F); // Import
        gunModel[168].setRotationPoint(135F, -53F, 2.5F);

        gunModel[169].addShapeBox(9F, -8F, -4F, 1, 1, 3, 0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[169].setRotationPoint(136.5F, -49F, 2.5F);

        gunModel[170].addShapeBox(9F, -8F, -4F, 1, 1, 2, 0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F); // Import
        gunModel[170].setRotationPoint(136.5F, -49.5F, 3F);

        gunModel[171].addShapeBox(9F, -8F, -4F, 1, 2, 2, 0F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F); // Import
        gunModel[171].setRotationPoint(136.5F, -51.5F, 3F);

        gunModel[172].addShapeBox(9F, -8F, -4F, 3, 4, 1, 0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[172].setRotationPoint(131.5F, -45F, 2F);

        gunModel[173].addShapeBox(9F, -8F, -4F, 3, 1, 4, 0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F); // Import
        gunModel[173].setRotationPoint(131.5F, -46F, 2F);

        gunModel[174].addShapeBox(9F, -8F, -4F, 3, 1, 4, 0F, 0.0F, -0.75F, -1.25F, 0.0F, -0.75F, -1.25F, 0.0F, -0.75F, -1.25F, 0.0F, -0.75F, -1.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F); // Import
        gunModel[174].setRotationPoint(131.5F, -47F, 2F);

        gunModel[175].addShapeBox(9F, -8F, -4F, 3, 4, 1, 0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[175].setRotationPoint(131.5F, -45F, 5F);

        gunModel[176].addShapeBox(9F, -8F, -4F, 11, 5, 9, 0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F); // Import
        gunModel[176].setRotationPoint(-32F, -31F, -0.5F);

        gunModel[177].addShapeBox(9F, -8F, -4F, 11, 1, 9, 0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[177].setRotationPoint(-32F, -26.5F, -0.5F);

        gunModel[178].addShapeBox(9F, -8F, -4F, 45, 2, 9, 0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F); // Import
        gunModel[178].setRotationPoint(-90F, -35F, -0.5F);

        gunModel[179].addShapeBox(9F, -8F, -4F, 15, 24, 9, 0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, -5.5F, 0.25F, -0.5F, -5.5F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[179].setRotationPoint(-90F, -33.5F, -0.5F);

        gunModel[180].addShapeBox(9F, -8F, -4F, 2, 5, 9, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -2.0F, 0.25F); // Import
        gunModel[180].setRotationPoint(-34F, -31F, -0.5F);

        gunModel[181].addShapeBox(9F, -8F, -4F, 2, 3, 9, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F); // Import
        gunModel[181].setRotationPoint(-36F, -31F, -0.5F);

        gunModel[182].addShapeBox(9F, -8F, -4F, 9, 7, 9, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, 0.5F, 0.25F); // Import
        gunModel[182].setRotationPoint(-75.5F, -22.5F, -0.5F);

        gunModel[183].addShapeBox(9F, -8F, -4F, 27, 15, 9, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -10.5F, 0.25F, 0.0F, -10.5F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[183].setRotationPoint(-66.5F, -33.5F, -0.5F);

        gunModel[184].addShapeBox(9F, -8F, -4F, 45, 2, 9, 0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[184].setRotationPoint(-90F, -37F, -0.5F);

        gunModel[185].addShapeBox(9F, -8F, -4F, 45, 1, 9, 0F, 0.0F, 0.0F, -2.25F, -0.5F, 0.0F, -2.25F, -0.5F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[185].setRotationPoint(-90F, -38F, -0.5F);

        gunModel[186].addShapeBox(9F, -8F, -4F, 2, 2, 9, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[186].setRotationPoint(-38F, -31F, -0.5F);

        gunModel[187].addShapeBox(9F, -8F, -4F, 2, 2, 9, 0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F); // Import
        gunModel[187].setRotationPoint(-40F, -31F, -0.5F);

        gunModel[188].addShapeBox(9F, -8F, -4F, 27, 2, 9, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 10.5F, 0.25F, 0.0F, 10.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -10.5F, -0.25F, 0.0F, -10.5F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[188].setRotationPoint(-66.5F, -18.5F, -0.5F);

        gunModel[189].addShapeBox(9F, -8F, -4F, 27, 2, 8, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 10.5F, 0.25F, 0.0F, 10.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, -10.5F, -0.75F, 0.0F, -10.5F, -0.75F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[189].setRotationPoint(-66.5F, -16.5F, 0F);

        gunModel[190].addShapeBox(9F, -8F, -4F, 27, 1, 6, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 10.5F, 0.25F, 0.0F, 10.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, -10.5F, -1.25F, 0.0F, -10.5F, -1.25F, 0.0F, 0.0F, -1.25F); // Import
        gunModel[190].setRotationPoint(-66.5F, -14.5F, 1F);

        gunModel[191].addShapeBox(9F, -8F, -4F, 9, 2, 9, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 3.5F, 0.25F, 0.0F, 3.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -3.5F, -0.25F, 0.0F, -3.5F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[191].setRotationPoint(-75.5F, -15F, -0.5F);

        gunModel[192].addShapeBox(9F, -8F, -4F, 9, 2, 8, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 3.5F, 0.25F, 0.0F, 3.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, -3.5F, -0.75F, 0.0F, -3.5F, -0.75F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[192].setRotationPoint(-75.5F, -13F, 0F);

        gunModel[193].addShapeBox(9F, -8F, -4F, 9, 1, 6, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 3.5F, 0.25F, 0.0F, 3.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, -3.5F, -1.25F, 0.0F, -3.5F, -1.25F, 0.0F, 0.0F, -1.25F); // Import
        gunModel[193].setRotationPoint(-75.5F, -11F, 1F);

        gunModel[194].addShapeBox(9F, -8F, -4F, 14, 2, 9, 0F, 0.0F, -0.5F, 0.25F, 0.5F, 5.0F, 0.25F, 0.5F, 5.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, -0.25F, 0.5F, -5.0F, -0.25F, 0.5F, -5.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[194].setRotationPoint(-90F, -10F, -0.5F);

        gunModel[195].addShapeBox(9F, -8F, -4F, 14, 2, 8, 0F, 0.0F, 0.0F, 0.25F, 0.5F, 5.0F, 0.25F, 0.5F, 5.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.5F, -5.0F, -0.75F, 0.5F, -5.0F, -0.75F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[195].setRotationPoint(-90F, -8F, 0F);

        gunModel[196].addShapeBox(9F, -8F, -4F, 14, 1, 6, 0F, 0.0F, 0.0F, 0.25F, 0.5F, 5.0F, 0.25F, 0.5F, 5.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.25F, 0.5F, -5.0F, -1.25F, 0.5F, -5.0F, -1.25F, 0.0F, 0.0F, -1.25F); // Import
        gunModel[196].setRotationPoint(-90F, -6F, 1F);

        gunModel[197].addShapeBox(9F, -8F, -4F, 2, 1, 9, 0F, 0.0F, 1.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 1.5F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F); // Import
        gunModel[197].setRotationPoint(-34F, -26.5F, -0.5F);

        gunModel[198].addShapeBox(9F, -8F, -4F, 2, 1, 9, 0F, 0.0F, 0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.75F, -0.25F); // Import
        gunModel[198].setRotationPoint(-36F, -28F, -0.5F);

        gunModel[199].addShapeBox(9F, -8F, -4F, 2, 1, 8, 0F, 0.0F, 1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, -0.25F); // Import
        gunModel[199].setRotationPoint(-34F, -25.5F, 0F);

        gunModel[200].addShapeBox(9F, -8F, -4F, 2, 1, 9, 0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[200].setRotationPoint(-38F, -28.5F, -0.5F);

        gunModel[201].addShapeBox(9F, -8F, -4F, 2, 1, 9, 0F, -0.5F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.5F, -0.25F); // Import
        gunModel[201].setRotationPoint(-40F, -28.5F, -0.5F);

        gunModel[202].addShapeBox(9F, -8F, -4F, 2, 1, 8, 0F, 0.0F, 0.75F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.5F, -0.25F); // Import
        gunModel[202].setRotationPoint(-38F, -26.5F, 0F);

        gunModel[203].addShapeBox(9F, -8F, -4F, 2, 1, 8, 0F, 0.0F, 1.25F, 0.25F, 0.0F, 0.5F, 0.4F, 0.0F, 0.5F, 0.4F, 0.0F, 1.25F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, -0.25F); // Import
        gunModel[203].setRotationPoint(-36F, -26.5F, 0F);

        gunModel[204].addShapeBox(9F, -8F, -4F, 2, 1, 8, 0F, -0.5F, 1.0F, 0.25F, 0.0F, 1.5F, 0.25F, 0.0F, 1.5F, 0.25F, -0.5F, 1.0F, 0.25F, -0.5F, 0.0F, -0.75F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, -0.5F, 0.0F, -0.75F); // Import
        gunModel[204].setRotationPoint(-40F, -26F, 0F);

        gunModel[205].addShapeBox(9F, -8F, -4F, 2, 1, 8, 0F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, -0.25F, 0.0F, -0.75F, -1.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -1.25F); // Import
        gunModel[205].setRotationPoint(-36F, -25.75F, 0F);

        gunModel[206].addShapeBox(9F, -8F, -4F, 2, 1, 8, 0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, -0.75F, -1.25F, 0.0F, -0.75F, -1.25F, 0.0F, 0.0F, -1.75F); // Import
        gunModel[206].setRotationPoint(-38F, -25.75F, 0F);

        gunModel[207].addShapeBox(9F, -8F, -4F, 2, 1, 8, 0F, -0.5F, 0.25F, -0.75F, 0.0F, 1.25F, -0.25F, 0.0F, 1.25F, -0.25F, -0.5F, 0.25F, -0.75F, -0.5F, -0.25F, -2.25F, 0.0F, -1.0F, -1.75F, 0.0F, -1.0F, -1.75F, -0.5F, -0.25F, -2.25F); // Import
        gunModel[207].setRotationPoint(-40F, -24.75F, 0F);

        gunModel[208].addShapeBox(9F, -8F, -4F, 9, 11, 8, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[208].setRotationPoint(-75.5F, -33.5F, -0.5F);

        gunModel[209].addShapeBox(9F, -8F, -4F, 4, 2, 9, 0F, 0.0F, 0.0F, 0.25F, -0.5F, 1.0F, 0.25F, -0.5F, 1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F); // Import
        gunModel[209].setRotationPoint(-45.5F, -35F, -0.5F);

        gunModel[210].addShapeBox(9F, -8F, -4F, 4, 2, 9, 0F, 0.0F, 0.0F, -0.75F, -0.5F, 1.0F, -0.75F, -0.5F, 1.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.5F, -1.0F, 0.25F, -0.5F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[210].setRotationPoint(-45.5F, -37F, -0.5F);

        gunModel[211].addShapeBox(9F, -8F, -4F, 3, 3, 9, 0F, 0.0F, 0.0F, 0.25F, -0.5F, 1.5F, 0.25F, -0.5F, 1.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F); // Import
        gunModel[211].setRotationPoint(-42F, -36F, -0.5F);

        gunModel[212].addShapeBox(9F, -8F, -4F, 3, 2, 9, 0F, 0.0F, 0.0F, -0.75F, -0.5F, 1.5F, -0.75F, -0.5F, 1.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.5F, -1.5F, 0.25F, -0.5F, -1.5F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[212].setRotationPoint(-42F, -38F, -0.5F);

        gunModel[213].addShapeBox(9F, -8F, -4F, 4, 1, 9, 0F, 0.0F, 0.0F, -2.25F, -0.5F, 1.0F, -2.25F, -0.5F, 1.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -0.75F, -0.5F, -1.0F, -0.75F, -0.5F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[213].setRotationPoint(-45.5F, -38F, -0.5F);

        gunModel[214].addShapeBox(9F, -8F, -4F, 3, 1, 9, 0F, -0.5F, -0.25F, -2.25F, 0.0F, 1.25F, -2.25F, 0.0F, 1.25F, -2.25F, -0.5F, -0.25F, -2.25F, -0.5F, 0.25F, -0.75F, 0.0F, -1.25F, -0.75F, 0.0F, -1.25F, -0.75F, -0.5F, 0.25F, -0.75F); // Import
        gunModel[214].setRotationPoint(-42.5F, -39.25F, -0.5F);

        gunModel[215].addShapeBox(9F, -8F, -4F, 3, 7, 9, 0F, 0.0F, 0.5F, 0.25F, 0.0F, 2.5F, 0.25F, 0.0F, 2.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F); // Import
        gunModel[215].setRotationPoint(-39.5F, -37F, -0.5F);

        gunModel[216].addShapeBox(9F, -8F, -4F, 6, 2, 9, 0F, 0.0F, 0.0F, -0.75F, 0.0F, 4.0F, -0.75F, 0.0F, 4.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, -4.0F, 0.25F, 0.0F, -4.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[216].setRotationPoint(-39.5F, -39.5F, -0.5F);

        gunModel[217].addShapeBox(9F, -8F, -4F, 6, 1, 9, 0F, 0.0F, -0.25F, -2.25F, 0.0F, 3.75F, -2.25F, 0.0F, 3.75F, -2.25F, 0.0F, -0.25F, -2.25F, 0.0F, 0.25F, -0.75F, 0.0F, -3.75F, -0.75F, 0.0F, -3.75F, -0.75F, 0.0F, 0.25F, -0.75F); // Import
        gunModel[217].setRotationPoint(-39.5F, -40.75F, -0.5F);

        gunModel[218].addShapeBox(9F, -8F, -4F, 3, 9, 9, 0F, 0.0F, 0.5F, 0.25F, 0.0F, 2.5F, 0.25F, 0.0F, 2.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F); // Import
        gunModel[218].setRotationPoint(-36.5F, -39F, -0.5F);

        gunModel[219].addShapeBox(9F, -8F, -4F, 3, 11, 9, 0F, 0.0F, 0.5F, 0.25F, 0.0F, 2.0F, 0.25F, 0.0F, 2.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F); // Import
        gunModel[219].setRotationPoint(-33.5F, -41F, -0.5F);

        gunModel[220].addShapeBox(9F, -8F, -4F, 3, 2, 9, 0F, 0.0F, 0.0F, -0.75F, 0.0F, 1.5F, -0.75F, 0.0F, 1.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[220].setRotationPoint(-33.5F, -43.5F, -0.5F);

        gunModel[221].addShapeBox(9F, -8F, -4F, 3, 1, 9, 0F, 0.0F, -0.25F, -2.25F, 0.0F, 1.25F, -2.25F, 0.0F, 1.25F, -2.25F, 0.0F, -0.25F, -2.25F, 0.0F, 0.25F, -0.75F, 0.0F, -1.25F, -0.75F, 0.0F, -1.25F, -0.75F, 0.0F, 0.25F, -0.75F); // Import
        gunModel[221].setRotationPoint(-33.5F, -44.75F, -0.5F);

        gunModel[222].addShapeBox(9F, -8F, -4F, 3, 13, 9, 0F, 0.0F, 0.5F, 0.25F, 0.5F, 2.0F, 0.25F, 0.5F, 2.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.5F, -1.5F, 0.25F, 0.5F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F); // Import
        gunModel[222].setRotationPoint(-30.5F, -42.5F, -0.5F);

        gunModel[223].addShapeBox(9F, -8F, -4F, 3, 2, 9, 0F, 0.0F, 0.0F, -0.75F, 0.5F, 1.5F, -0.75F, 0.5F, 1.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.5F, -1.5F, 0.25F, 0.5F, -1.5F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[223].setRotationPoint(-30.5F, -45F, -0.5F);

        gunModel[224].addShapeBox(9F, -8F, -4F, 3, 1, 9, 0F, 0.0F, -0.25F, -2.25F, 0.5F, 1.25F, -2.25F, 0.5F, 1.25F, -2.25F, 0.0F, -0.25F, -2.25F, 0.0F, 0.25F, -0.75F, 0.5F, -1.25F, -0.75F, 0.5F, -1.25F, -0.75F, 0.0F, 0.25F, -0.75F); // Import
        gunModel[224].setRotationPoint(-30.5F, -46.25F, -0.5F);

        gunModel[225].addShapeBox(9F, -8F, -4F, 6, 13, 9, 0F, -0.5F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F); // Import
        gunModel[225].setRotationPoint(-27.5F, -44F, -0.5F);

        gunModel[226].addShapeBox(9F, -8F, -4F, 5, 2, 9, 0F, 0.0F, 0.5F, -0.75F, 0.5F, 0.5F, -0.75F, 0.5F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F); // Import
        gunModel[226].setRotationPoint(-27F, -46F, -0.5F);

        gunModel[227].addShapeBox(9F, -8F, -4F, 5, 1, 9, 0F, 0.0F, 0.25F, -2.25F, 0.5F, 0.25F, -2.25F, 0.5F, 0.25F, -2.25F, 0.0F, 0.25F, -2.25F, 0.0F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F); // Import
        gunModel[227].setRotationPoint(-27F, -47.25F, -0.5F);

        gunModel[228].addShapeBox(9F, -8F, -4F, 1, 2, 9, 0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.25F); // Import
        gunModel[228].setRotationPoint(-21.5F, -46F, -0.5F);

        gunModel[229].addShapeBox(9F, -8F, -4F, 1, 1, 9, 0F, 0.0F, 0.25F, -2.25F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -2.75F, 0.0F, 0.25F, -2.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -0.75F); // Import
        gunModel[229].setRotationPoint(-21.5F, -47.25F, -0.5F);

        gunModel[230].addShapeBox(9F, -8F, -4F, 1, 3, 9, 0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[230].setRotationPoint(-21.5F, -44F, -0.5F);

        gunModel[231].addShapeBox(9F, -8F, -4F, 10, 4, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[231].setRotationPoint(-29.5F, -38.5F, -2.75F);

        gunModel[232].addShapeBox(9F, -8F, -4F, 10, 1, 2, 0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[232].setRotationPoint(-29.5F, -39.5F, -2.75F);

        gunModel[233].addShapeBox(9F, -8F, -4F, 10, 1, 2, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[233].setRotationPoint(-29.5F, -40.5F, -2.75F);

        gunModel[234].addShapeBox(9F, -8F, -4F, 7, 1, 2, 0F, -1.25F, 0.0F, -2.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[234].setRotationPoint(-36.5F, -39.5F, -2.75F);

        gunModel[235].addShapeBox(9F, -8F, -4F, 7, 4, 2, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[235].setRotationPoint(-36.5F, -38.5F, -2.75F);

        gunModel[236].addShapeBox(9F, -8F, -4F, 6, 1, 2, 0F, -6.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F); // Import
        gunModel[236].setRotationPoint(-35.5F, -40.5F, -2.75F);

        gunModel[237].addShapeBox(9F, -8F, -4F, 6, 1, 2, 0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -6.0F, 0.0F, -2.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -2.0F); // Import
        gunModel[237].setRotationPoint(-35.5F, -40.5F, 8.75F);

        gunModel[238].addShapeBox(9F, -8F, -4F, 10, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[238].setRotationPoint(-29.5F, -34.5F, -2.75F);

        gunModel[239].addShapeBox(9F, -8F, -4F, 10, 1, 2, 0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[239].setRotationPoint(-29.5F, -33.5F, -2.75F);

        gunModel[240].addShapeBox(9F, -8F, -4F, 7, 1, 2, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, -2.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F); // Import
        gunModel[240].setRotationPoint(-36.5F, -34.5F, -2.75F);

        gunModel[241].addShapeBox(9F, -8F, -4F, 6, 1, 2, 0F, -0.25F, 0.0F, -2.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -6.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F); // Import
        gunModel[241].setRotationPoint(-35.5F, -33.5F, -2.75F);

        gunModel[242].addShapeBox(9F, -8F, -4F, 10, 4, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[242].setRotationPoint(-29.5F, -38.5F, 8.75F);

        gunModel[243].addShapeBox(9F, -8F, -4F, 7, 4, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[243].setRotationPoint(-36.5F, -38.5F, 8.75F);

        gunModel[244].addShapeBox(9F, -8F, -4F, 10, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[244].setRotationPoint(-29.5F, -39.5F, 8.75F);

        gunModel[245].addShapeBox(9F, -8F, -4F, 10, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[245].setRotationPoint(-29.5F, -40.5F, 8.75F);

        gunModel[246].addShapeBox(9F, -8F, -4F, 7, 1, 2, 0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -1.25F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[246].setRotationPoint(-36.5F, -39.5F, 8.75F);

        gunModel[247].addShapeBox(9F, -8F, -4F, 10, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[247].setRotationPoint(-29.5F, -34.5F, 8.75F);

        gunModel[248].addShapeBox(9F, -8F, -4F, 10, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[248].setRotationPoint(-29.5F, -33.5F, 8.75F);

        gunModel[249].addShapeBox(9F, -8F, -4F, 7, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -1.25F, 0.0F, -2.0F); // Import
        gunModel[249].setRotationPoint(-36.5F, -34.5F, 8.75F);

        gunModel[250].addShapeBox(9F, -8F, -4F, 6, 1, 2, 0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -2.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -6.0F, 0.0F, -2.0F); // Import
        gunModel[250].setRotationPoint(-35.5F, -33.5F, 8.75F);

        gunModel[251].addShapeBox(9F, -8F, -4F, 2, 4, 14, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[251].setRotationPoint(-19.5F, -38.5F, -2.75F);

        gunModel[252].addShapeBox(9F, -8F, -4F, 2, 1, 14, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.25F); // Import
        gunModel[252].setRotationPoint(-19.5F, -34.5F, -2.75F);

        gunModel[253].addShapeBox(9F, -8F, -4F, 2, 1, 13, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.5F, 0.0F, -0.75F, -1.25F, 0.0F, -0.75F, -1.75F, 0.0F, 0.0F, -2.0F); // Import
        gunModel[253].setRotationPoint(-19.5F, -33.5F, -2.25F);

        gunModel[254].addShapeBox(9F, -8F, -4F, 2, 1, 14, 0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[254].setRotationPoint(-19.5F, -39.5F, -2.75F);

        gunModel[255].addShapeBox(9F, -8F, -4F, 2, 1, 12, 0F, 0.0F, 0.0F, -1.0F, -1.25F, 0.0F, -1.5F, -1.25F, 0.0F, -2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[255].setRotationPoint(-19.5F, -40.5F, -1.75F);

        gunModel[256].addShapeBox(9F, -8F, -4F, 1, 1, 9, 0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.25F, 0.0F, -1.0F, 0.25F, 1.0F, -1.0F, 0.25F, 1.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F); // Import
        gunModel[256].setRotationPoint(-21.5F, -40.5F, -0.5F);

        gunModel[257].addShapeBox(9F, -8F, -4F, 9, 2, 8, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F); // Import
        gunModel[257].setRotationPoint(-75.5F, -33.5F, 0.5F);

        gunModel[258].addShapeBox(9F, -8F, -4F, 69, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F); // Import
        gunModel[258].setRotationPoint(-18F, -45.25F, 6.65F);

        gunModel[259].addShapeBox(9F, -8F, -4F, 40, 2, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[259].setRotationPoint(-18F, -45.25F, 1.15F);

        gunModel[260].addShapeBox(9F, -8F, -4F, 10, 1, 6, 0F, 0.0F, -0.25F, 0.9F, 0.0F, -0.25F, 0.9F, 0.0F, -0.25F, -0.4F, 0.0F, -0.25F, -0.4F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[260].setRotationPoint(-18F, -46F, 1.65F);

        gunModel[261].addShapeBox(9F, -8F, -4F, 1, 1, 6, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[261].setRotationPoint(-18F, -46.75F, 1F);

        gunModel[262].addShapeBox(9F, -8F, -4F, 1, 1, 6, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[262].setRotationPoint(-9F, -46.75F, 1F);

        gunModel[263].addShapeBox(9F, -8F, -4F, 6, 1, 6, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[263].setRotationPoint(-15F, -46.75F, 1F);

        gunModel[264].addShapeBox(9F, -8F, -4F, 6, 1, 6, 0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F); // Import
        gunModel[264].setRotationPoint(-15F, -47F, 1F);

        gunModel[265].addShapeBox(9F, -8F, -4F, 1, 1, 6, 0F, 0.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F); // Import
        gunModel[265].setRotationPoint(-15F, -46.5F, 1F);

        gunModel[266].addShapeBox(9F, -8F, -4F, 1, 1, 6, 0F, 0.0F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F); // Import
        gunModel[266].setRotationPoint(-15F, -46.75F, 1F);

        gunModel[267].addShapeBox(9F, -8F, -4F, 1, 1, 6, 0F, -1.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F, -0.75F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F); // Import
        gunModel[267].setRotationPoint(-10F, -46.5F, 1F);

        gunModel[268].addShapeBox(9F, -8F, -4F, 1, 1, 6, 0F, -0.75F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -1.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F); // Import
        gunModel[268].setRotationPoint(-10F, -46.75F, 1F);

        gunModel[269].addShapeBox(9F, -8F, -4F, 1, 3, 5, 0F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F); // Import
        gunModel[269].setRotationPoint(-18F, -49.25F, 1.5F);

        gunModel[270].addShapeBox(9F, -8F, -4F, 2, 3, 5, 0F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F); // Import
        gunModel[270].setRotationPoint(-15.5F, -49.25F, 1.5F);

        gunModel[271].addShapeBox(9F, -8F, -4F, 2, 1, 5, 0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F); // Import
        gunModel[271].setRotationPoint(-17F, -49.25F, 1.5F);

        gunModel[272].addShapeBox(9F, -8F, -4F, 1, 1, 5, 0F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, -1.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, -0.75F, -1.0F, 0.25F); // Import
        gunModel[272].setRotationPoint(-16.5F, -48.75F, 1.5F);

        gunModel[273].addShapeBox(9F, -8F, -4F, 1, 1, 5, 0F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, -0.75F, -1.0F, 0.25F, -0.75F, -1.0F, 0.25F, 0.0F, -0.75F, 0.25F); // Import
        gunModel[273].setRotationPoint(-17F, -48.75F, 1.5F);

        gunModel[274].addShapeBox(9F, -8F, -4F, 2, 2, 5, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[274].setRotationPoint(-17F, -48.75F, 1.5F);

        gunModel[275].addShapeBox(9F, -8F, -4F, 1, 1, 6, 0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F); // Import
        gunModel[275].setRotationPoint(-16F, -46.75F, 1F);

        gunModel[276].addShapeBox(9F, -8F, -4F, 1, 1, 6, 0F, 0.0F, 0.0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[276].setRotationPoint(-17F, -46.75F, 1F);

        gunModel[277].addShapeBox(9F, -8F, -4F, 1, 1, 6, 0F, -0.5F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F); // Import
        gunModel[277].setRotationPoint(-16.5F, -46.75F, 1F);

        gunModel[278].addShapeBox(9F, -8F, -4F, 1, 1, 6, 0F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[278].setRotationPoint(-16.5F, -46.75F, 1F);

        gunModel[279].addShapeBox(9F, -8F, -4F, 3, 3, 5, 0F, 0.0F, -0.75F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F); // Import
        gunModel[279].setRotationPoint(-13.5F, -49.25F, 1.5F);

        gunModel[280].addShapeBox(9F, -8F, -4F, 2, 3, 5, 0F, 0.0F, -1.75F, 0.25F, 0.0F, -2.5F, 0.25F, 0.0F, -2.5F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F); // Import
        gunModel[280].setRotationPoint(-10.5F, -49.25F, 1.5F);

        gunModel[281].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F); // Import
        gunModel[281].setRotationPoint(-18F, -49.75F, 1.5F);

        gunModel[282].addShapeBox(9F, -8F, -4F, 1, 2, 5, 0F, -0.5F, -1.5F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -0.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F); // Import
        gunModel[282].setRotationPoint(-18.5F, -48.25F, 1.5F);

        gunModel[283].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[283].setRotationPoint(-17F, -50.75F, 1.5F);

        gunModel[284].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[284].setRotationPoint(-17F, -50.75F, 5.5F);

        gunModel[285].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[285].setRotationPoint(-16F, -50.75F, 1.5F);

        gunModel[286].addShapeBox(9F, -8F, -4F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F); // Import
        gunModel[286].setRotationPoint(-17F, -49.75F, 1.5F);

        gunModel[287].addShapeBox(9F, -8F, -4F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F); // Import
        gunModel[287].setRotationPoint(-17F, -49.75F, 6F);

        gunModel[288].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[288].setRotationPoint(-16F, -50.75F, 6F);

        gunModel[289].addShapeBox(9F, -8F, -4F, 1, 1, 6, 0F, -0.5F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F); // Import
        gunModel[289].setRotationPoint(-9F, -47.25F, 1F);

        gunModel[290].addShapeBox(9F, -8F, -4F, 2, 1, 1, 0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, -0.8F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.4F, 0.25F, -1.0F, -0.8F, 0.25F); // Import
        gunModel[290].setRotationPoint(-16F, -49.25F, 1F);

        gunModel[291].addShapeBox(9F, -8F, -4F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F); // Import
        gunModel[291].setRotationPoint(-15F, -50.75F, 1.5F);

        gunModel[292].addShapeBox(9F, -8F, -4F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.25F); // Import
        gunModel[292].setRotationPoint(-15F, -50.75F, 6F);

        gunModel[293].addShapeBox(9F, -8F, -4F, 2, 1, 1, 0F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.25F, -1.0F, -0.8F, 0.25F, 0.0F, -0.4F, 0.25F, 0.0F, -0.4F, -0.25F, -1.0F, -0.8F, -0.25F); // Import
        gunModel[293].setRotationPoint(-16F, -49.25F, 6F);

        gunModel[294].addShapeBox(9F, -8F, -4F, 2, 1, 1, 0F, -1.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, -1.0F, 0.25F, 0.0F, -0.8F, 0.25F, 0.0F, -0.8F, -0.25F, -1.5F, -1.0F, -0.25F); // Import
        gunModel[294].setRotationPoint(-17F, -49.25F, 6F);

        gunModel[295].addShapeBox(9F, -8F, -4F, 2, 1, 1, 0F, -1.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, -1.0F, 0.25F, 0.0F, -0.8F, 0.25F, 0.0F, -0.8F, -0.25F, -1.5F, -1.0F, -0.25F); // Import
        gunModel[295].setRotationPoint(-17F, -49.25F, 1.5F);

        gunModel[296].addShapeBox(9F, -8F, -4F, 3, 25, 9, 0F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F); // Import
        gunModel[296].setRotationPoint(-93F, -35F, -0.5F);

        gunModel[297].addShapeBox(9F, -8F, -4F, 1, 25, 9, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -0.25F); // Import
        gunModel[297].setRotationPoint(-94F, -35F, -0.5F);

        gunModel[298].addShapeBox(9F, -8F, -4F, 1, 3, 1, 0F, 0.0F, -0.75F, 0.25F, 0.0F, -1.1F, 0.25F, 0.0F, -1.1F, -1.0F, 0.0F, -0.75F, -1.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.25F); // Import
        gunModel[298].setRotationPoint(-13.5F, -49.25F, 7F);

        gunModel[299].addShapeBox(9F, -8F, -4F, 1, 3, 1, 0F, 0.0F, -1.1F, 0.25F, 0.0F, -1.4F, 0.25F, 0.0F, -1.4F, -1.0F, 0.0F, -1.1F, -1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); // Import
        gunModel[299].setRotationPoint(-12.5F, -49.25F, 7F);

        gunModel[300].addShapeBox(9F, -8F, -4F, 1, 3, 1, 0F, 0.0F, -1.4F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -1.75F, -1.25F, 0.0F, -1.4F, -1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, -1.0F); // Import
        gunModel[300].setRotationPoint(-11.5F, -49.25F, 7F);

        gunModel[301].addShapeBox(9F, -8F, -4F, 1, 3, 1, 0F, 0.0F, -0.75F, -1.25F, 0.0F, -1.1F, -1.0F, 0.0F, -1.1F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F); // Import
        gunModel[301].setRotationPoint(-13.5F, -49.25F, 0F);

        gunModel[302].addShapeBox(9F, -8F, -4F, 1, 3, 1, 0F, 0.0F, -1.1F, -1.0F, 0.0F, -1.4F, -1.0F, 0.0F, -1.4F, 0.25F, 0.0F, -1.1F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F); // Import
        gunModel[302].setRotationPoint(-12.5F, -49.25F, 0F);

        gunModel[303].addShapeBox(9F, -8F, -4F, 1, 3, 1, 0F, 0.0F, -1.4F, -1.0F, 0.0F, -1.75F, -1.25F, 0.0F, -1.75F, 0.25F, 0.0F, -1.4F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F); // Import
        gunModel[303].setRotationPoint(-11.5F, -49.25F, 0F);

        gunModel[304].addShapeBox(9F, -8F, -4F, 4, 1, 1, 0F, 0.25F, 2.25F, 0.25F, 0.25F, 2.25F, 0.25F, 0.25F, 2.25F, 0.25F, 0.25F, 2.25F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F); // Import
        gunModel[304].setRotationPoint(-16.45F, -53.25F, 3.5F);
        gunModel[304].rotateAngleZ = -0.43633232F;

        gunModel[305].addShapeBox(9F, -8F, -4F, 4, 3, 1, 0F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F); // Import
        gunModel[305].setRotationPoint(-15.5F, -55.25F, 2F);
        gunModel[305].rotateAngleZ = -0.43633232F;

        gunModel[306].addShapeBox(9F, -8F, -4F, 4, 3, 1, 0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F); // Import
        gunModel[306].setRotationPoint(-15.5F, -55.25F, 5F);
        gunModel[306].rotateAngleZ = -0.43633232F;

        gunModel[307].addShapeBox(9F, -8F, -4F, 4, 3, 1, 0F, -1.0F, 1.0F, 0.5F, -1.0F, 1.0F, 0.5F, 0.5F, 1.0F, 0.25F, 0.5F, 1.0F, 0.25F, -1.0F, -3.0F, 0.5F, -1.0F, -3.0F, 0.5F, 0.5F, -3.0F, 0.25F, 0.5F, -3.0F, 0.25F); // Import
        gunModel[307].setRotationPoint(-15.5F, -55.25F, 2F);
        gunModel[307].rotateAngleZ = -0.43633232F;

        gunModel[308].addShapeBox(9F, -8F, -4F, 4, 3, 1, 0F, 0.5F, 1.0F, 0.25F, 0.5F, 1.0F, 0.25F, -1.0F, 1.0F, 0.5F, -1.0F, 1.0F, 0.5F, 0.5F, -3.0F, 0.25F, 0.5F, -3.0F, 0.25F, -1.0F, -3.0F, 0.5F, -1.0F, -3.0F, 0.5F); // Import
        gunModel[308].setRotationPoint(-15.5F, -55.25F, 5F);
        gunModel[308].rotateAngleZ = -0.43633232F;

        gunModel[309].addShapeBox(9F, -8F, -4F, 2, 1, 2, 0F, -1.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, -0.5F, -1.0F, -0.75F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F); // Import
        gunModel[309].setRotationPoint(-12.35F, -54.9F, 3.25F);
        gunModel[309].rotateAngleZ = -0.43633232F;

        gunModel[310].addShapeBox(9F, -8F, -4F, 2, 1, 2, 0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, -0.5F, -1.0F, -0.75F, -0.5F); // Import
        gunModel[310].setRotationPoint(-12.35F, -54.9F, 3.25F);
        gunModel[310].rotateAngleZ = -0.43633232F;

        gunModel[311].addShapeBox(9F, -8F, -4F, 2, 1, 2, 0F, -1.0F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -1.0F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F); // Import
        gunModel[311].setRotationPoint(-12.35F, -54.9F, 3.25F);
        gunModel[311].rotateAngleZ = -0.43633232F;

        gunModel[312].addShapeBox(9F, -8F, -4F, 2, 1, 2, 0F, -1.0F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -1.0F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F); // Import
        gunModel[312].setRotationPoint(-12.35F, -54.9F, 2.25F);
        gunModel[312].rotateAngleZ = -0.43633232F;

        gunModel[313].addShapeBox(9F, -8F, -4F, 2, 1, 2, 0F, -1.0F, -0.6F, -1.0F, -0.5F, -0.6F, -1.0F, -0.5F, -0.75F, -0.85F, -1.0F, -0.75F, -0.85F, -1.0F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -0.85F, -1.0F, -0.25F, -0.85F); // Import
        gunModel[313].setRotationPoint(-12.35F, -54.9F, 2.75F);
        gunModel[313].rotateAngleZ = -0.43633232F;

        gunModel[314].addShapeBox(9F, -8F, -4F, 2, 1, 2, 0F, -1.0F, -0.75F, -0.85F, -0.5F, -0.75F, -0.85F, -0.5F, -0.6F, -1.0F, -1.0F, -0.6F, -1.0F, -1.0F, -0.25F, -0.85F, -0.5F, -0.25F, -0.85F, -0.5F, -0.25F, -1.0F, -1.0F, -0.25F, -1.0F); // Import
        gunModel[314].setRotationPoint(-12.35F, -54.9F, 3.25F);
        gunModel[314].rotateAngleZ = -0.43633232F;

        gunModel[315].addShapeBox(9F, -8F, -4F, 2, 1, 2, 0F, -1.0F, -0.25F, -0.85F, -0.5F, -0.25F, -0.85F, -0.5F, -0.25F, -1.0F, -1.0F, -0.25F, -1.0F, -1.0F, -0.75F, -0.85F, -0.5F, -0.75F, -0.85F, -0.5F, -0.6F, -1.0F, -1.0F, -0.6F, -1.0F); // Import
        gunModel[315].setRotationPoint(-12.35F, -54.9F, 3.25F);
        gunModel[315].rotateAngleZ = -0.43633232F;

        gunModel[316].addShapeBox(9F, -8F, -4F, 2, 1, 2, 0F, -1.0F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -0.85F, -1.0F, -0.25F, -0.85F, -1.0F, -0.6F, -1.0F, -0.5F, -0.6F, -1.0F, -0.5F, -0.75F, -0.85F, -1.0F, -0.75F, -0.85F); // Import
        gunModel[316].setRotationPoint(-12.35F, -54.9F, 2.75F);
        gunModel[316].rotateAngleZ = -0.43633232F;

        gunModel[317].addShapeBox(9F, -8F, -4F, 11, 1, 2, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[317].setRotationPoint(-6F, -47.5F, 3.15F);

        gunModel[318].addShapeBox(9F, -8F, -4F, 39, 1, 2, 0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[318].setRotationPoint(12.5F, -47.5F, 3.15F);

        gunModel[319].addShapeBox(9F, -8F, -4F, 5, 1, 2, 0F, 0.0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import
        gunModel[319].setRotationPoint(6F, -47.5F, 3.15F);

        gunModel[320].addShapeBox(9F, -8F, -4F, 1, 1, 2, 0F, -0.25F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F); // Import
        gunModel[320].setRotationPoint(10.5F, -48F, 3.15F);

        gunModel[321].addShapeBox(9F, -8F, -4F, 1, 1, 2, 0F, -0.5F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[321].setRotationPoint(6F, -48F, 3.15F);

        gunModel[322].addShapeBox(9F, -8F, -4F, 3, 2, 9, 0F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[322].setRotationPoint(-93F, -37F, -0.5F);

        gunModel[323].addShapeBox(9F, -8F, -4F, 3, 1, 9, 0F, 0.0F, 0.0F, -2.25F, -0.25F, 0.0F, -2.25F, -0.25F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[323].setRotationPoint(-93F, -38F, -0.5F);

        gunModel[324].addShapeBox(9F, -8F, -4F, 1, 2, 9, 0F, -0.25F, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[324].setRotationPoint(-94F, -37F, -0.5F);

        gunModel[325].addShapeBox(9F, -8F, -4F, 1, 1, 9, 0F, -0.5F, 0.0F, -2.25F, -0.25F, 0.0F, -2.25F, -0.25F, 0.0F, -2.25F, -0.5F, 0.0F, -2.25F, 0.0F, 0.0F, -1.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F); // Import
        gunModel[325].setRotationPoint(-93.75F, -38F, -0.5F);

        gunModel[326].addShapeBox(9F, -8F, -4F, 4, 1, 2, 0F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F); // Import
        gunModel[326].setRotationPoint(26.5F, -47.75F, 3.15F);

        gunModel[327].addShapeBox(9F, -10F, -4F, 1, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[327].setRotationPoint(51F, -43.15F, 1F);

        gunModel[328].addShapeBox(9F, -10F, -4F, 1, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[328].setRotationPoint(51F, -41.15F, 1F);

        gunModel[329].addShapeBox(9F, -10F, -4F, 1, 1, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import
        gunModel[329].setRotationPoint(51F, -40.15F, 1.5F);

        gunModel[330].addShapeBox(9F, -10F, -4F, 1, 1, 6, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[330].setRotationPoint(51F, -44.15F, 1F);

        gunModel[331].addShapeBox(9F, -10F, -4F, 1, 1, 5, 0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[331].setRotationPoint(51F, -45.15F, 1.5F);

        gunModel[332].addShapeBox(9F, -8F, -4F, 3, 1, 9, 0F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F); // Import
        gunModel[332].setRotationPoint(-93F, -9.5F, -0.5F);

        gunModel[333].addShapeBox(9F, -8F, -4F, 3, 2, 8, 0F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F); // Import
        gunModel[333].setRotationPoint(-93F, -8.25F, 0F);

        gunModel[334].addShapeBox(9F, -8F, -4F, 3, 1, 6, 0F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, -1.25F, -0.25F, 0.25F, -1.25F, -0.25F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F); // Import
        gunModel[334].setRotationPoint(-93F, -6.25F, 1F);

        gunModel[335].addShapeBox(9F, -8F, -4F, 1, 1, 9, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.75F); // Import
        gunModel[335].setRotationPoint(-94F, -9.5F, -0.5F);

        gunModel[336].addShapeBox(9F, -8F, -4F, 1, 2, 8, 0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, -0.25F, 0.25F, -1.25F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, -0.25F, 0.25F, -1.25F); // Import
        gunModel[336].setRotationPoint(-94F, -8.25F, 0F);

        gunModel[337].addShapeBox(9F, -8F, -4F, 1, 1, 6, 0F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.75F, 0.25F, -1.75F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, -0.75F, 0.25F, -1.75F); // Import
        gunModel[337].setRotationPoint(-94F, -6.25F, 1F);

        gunModel[338].addShapeBox(9F, -8F, -4F, 3, 25, 7, 0F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F); // Import
        gunModel[338].setRotationPoint(-92F, -35F, 0.5F);

        gunModel[339].addShapeBox(9F, -8F, -4F, 3, 2, 7, 0F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[339].setRotationPoint(-92F, -37F, 0.5F);

        gunModel[340].addShapeBox(9F, -8F, -4F, 3, 1, 7, 0F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F); // Import
        gunModel[340].setRotationPoint(-92F, -9.5F, 0.5F);

        gunModel[341].addShapeBox(9F, -8F, -4F, 3, 2, 6, 0F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F); // Import
        gunModel[341].setRotationPoint(-92F, -8.25F, 1F);

        gunModel[342].addShapeBox(9F, -8F, -4F, 3, 1, 7, 0F, 0.0F, -0.1F, -2.25F, -0.25F, -0.1F, -2.25F, -0.25F, -0.1F, -2.25F, 0.0F, -0.1F, -2.25F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[342].setRotationPoint(-92F, -38F, 0.5F);

        gunModel[343].addShapeBox(9F, -8F, -4F, 3, 1, 4, 0F, -0.5F, -0.25F, 0.25F, -1.0F, -0.25F, 0.25F, -1.0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, 0.15F, -1.25F, -1.0F, 0.15F, -1.25F, -1.0F, 0.15F, -1.25F, -0.5F, 0.15F, -1.25F); // Import
        gunModel[343].setRotationPoint(-92F, -6.25F, 2F);

        gunModel[344].addShapeBox(9F, -8F, -4F, 5, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F); // Import
        gunModel[344].setRotationPoint(6F, -45.25F, 6.9F);

        gunModel[345].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F); // Import
        gunModel[345].setRotationPoint(-18F, -49.75F, 6F);

        gunModel[346].addShapeBox(9F, -8F, -4F, 1, 1, 4, 0F, -0.75F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F); // Import
        gunModel[346].setRotationPoint(-18F, -49.75F, 2.5F);

        gunModel[347].addShapeBox(9F, -8F, -4F, 5, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F); // Import
        gunModel[347].setRotationPoint(26.5F, -45.25F, 6.9F);

        gunModel[348].addShapeBox(9F, -8F, -4F, 24, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[348].setRotationPoint(-18F, -44.25F, 6.65F);

        gunModel[349].addShapeBox(9F, -8F, -4F, 15, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[349].setRotationPoint(11F, -44.25F, 6.65F);

        gunModel[350].addShapeBox(9F, -8F, -4F, 19, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[350].setRotationPoint(31.5F, -44.25F, 6.65F);

        gunModel[351].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[351].setRotationPoint(6F, -44.25F, 6.65F);

        gunModel[352].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[352].setRotationPoint(10F, -44.25F, 6.65F);

        gunModel[353].addShapeBox(9F, -8F, -4F, 3, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[353].setRotationPoint(7F, -44.25F, 6.65F);

        gunModel[354].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[354].setRotationPoint(26.5F, -44.25F, 6.65F);

        gunModel[355].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[355].setRotationPoint(30.5F, -44.25F, 6.65F);

        gunModel[356].addShapeBox(9F, -8F, -4F, 3, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[356].setRotationPoint(27.5F, -44.25F, 6.65F);

        gunModel[357].addShapeBox(9F, -8F, -4F, 49, 1, 1, 0F, -0.05F, -0.25F, -0.65F, -0.05F, -0.25F, -0.65F, -0.05F, -0.25F, -0.2F, -0.05F, -0.25F, -0.2F, -0.05F, -0.5F, -0.35F, -0.05F, -0.5F, -0.35F, -0.05F, -0.5F, -0.25F, -0.05F, -0.5F, -0.25F); // Import
        gunModel[357].setRotationPoint(59F, -46.85F, 2.1F);

        gunModel[358].addShapeBox(9F, -8F, -4F, 49, 1, 1, 0F, -0.05F, -0.25F, -0.2F, -0.05F, -0.25F, -0.2F, -0.05F, -0.25F, -0.65F, -0.05F, -0.25F, -0.65F, -0.05F, -0.5F, -0.25F, -0.05F, -0.5F, -0.25F, -0.05F, -0.5F, -0.35F, -0.05F, -0.5F, -0.35F); // Import
        gunModel[358].setRotationPoint(59F, -46.85F, 4.9F);

        gunModel[359].addShapeBox(9F, -8F, -4F, 49, 1, 1, 0F, -0.05F, -0.5F, -0.25F, -0.05F, -0.5F, -0.25F, -0.05F, -0.5F, -0.35F, -0.05F, -0.5F, -0.35F, -0.05F, -0.25F, -0.2F, -0.05F, -0.25F, -0.2F, -0.05F, -0.25F, -0.65F, -0.05F, -0.25F, -0.65F); // Import
        gunModel[359].setRotationPoint(59F, -43.35F, 5.9F);

        gunModel[360].addShapeBox(9F, -8F, -4F, 49, 1, 1, 0F, -0.05F, -0.5F, -0.35F, -0.05F, -0.5F, -0.35F, -0.05F, -0.5F, -0.25F, -0.05F, -0.5F, -0.25F, -0.05F, -0.25F, -0.65F, -0.05F, -0.25F, -0.65F, -0.05F, -0.25F, -0.2F, -0.05F, -0.25F, -0.2F); // Import
        gunModel[360].setRotationPoint(59F, -43.35F, 1.1F);

        gunModel[361].addShapeBox(9F, -8F, -4F, 49, 1, 1, 0F, -0.05F, -0.25F, -0.2F, -0.05F, -0.25F, -0.2F, -0.05F, -0.25F, -0.65F, -0.05F, -0.25F, -0.65F, -0.05F, -0.5F, -0.25F, -0.05F, -0.5F, -0.25F, -0.05F, -0.5F, -0.35F, -0.05F, -0.5F, -0.35F); // Import
        gunModel[361].setRotationPoint(59F, -45.85F, 5.9F);

        gunModel[362].addShapeBox(9F, -8F, -4F, 49, 1, 1, 0F, -0.05F, -0.25F, -0.65F, -0.05F, -0.25F, -0.65F, -0.05F, -0.25F, -0.2F, -0.05F, -0.25F, -0.2F, -0.05F, -0.5F, -0.35F, -0.05F, -0.5F, -0.35F, -0.05F, -0.5F, -0.25F, -0.05F, -0.5F, -0.25F); // Import
        gunModel[362].setRotationPoint(59F, -45.85F, 1.1F);

        gunModel[363].addShapeBox(9F, -8F, -4F, 49, 1, 1, 0F, -0.05F, -0.5F, -0.65F, -0.05F, -0.5F, -0.65F, -0.05F, -0.5F, -0.2F, -0.05F, -0.5F, -0.2F, -0.05F, -0.25F, -0.65F, -0.05F, -0.25F, -0.65F, -0.05F, -0.25F, -0.2F, -0.05F, -0.25F, -0.2F); // Import
        gunModel[363].setRotationPoint(59F, -44.75F, 0.6F);

        gunModel[364].addShapeBox(9F, -8F, -4F, 1, 1, 9, 0F, 0.0F, -1.0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[364].setRotationPoint(23.75F, -24.5F, 0F);

        gunModel[365].addShapeBox(9F, -8F, -4F, 1, 1, 9, 0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, -1.0F, -0.25F); // Import
        gunModel[365].setRotationPoint(23.75F, -27F, 0F);

        gunModel[366].addShapeBox(9F, -8F, -4F, 1, 2, 7, 0F, 0.0F, 0.5F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F); // Import
        gunModel[366].setRotationPoint(23.5F, -26.25F, 2F);

        gunModel[367].addShapeBox(9F, -8F, -4F, 3, 1, 7, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F); // Import
        gunModel[367].setRotationPoint(20F, -26.75F, 2F);

        gunModel[368].addShapeBox(9F, -8F, -4F, 3, 1, 7, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F); // Import
        gunModel[368].setRotationPoint(20F, -24.25F, 2F);

        gunModel[369].addShapeBox(9F, -8F, -4F, 4, 2, 6, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[369].setRotationPoint(19.5F, -26.25F, 3F);

        gunModel[370].addShapeBox(9F, -8F, -4F, 1, 3, 7, 0F, 0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F); // Import
        gunModel[370].setRotationPoint(18.5F, -26.75F, 2F);

        gunModel[371].addShapeBox(9F, -8F, -4F, 2, 3, 6, 0F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[371].setRotationPoint(16.5F, -26.75F, 3F);

        gunModel[372].addShapeBox(9F, -8F, -4F, 1, 3, 6, 0F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F); // Import
        gunModel[372].setRotationPoint(15.5F, -26.75F, 3F);

        gunModel[373].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[373].setRotationPoint(16.5F, -25.75F, 8F);

        gunModel[374].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Import
        gunModel[374].setRotationPoint(16.5F, -24.75F, 8F);

        gunModel[375].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[375].setRotationPoint(16.5F, -26.75F, 8F);

        gunModel[376].addShapeBox(9F, -8F, -4F, 3, 4, 1, 0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[376].setRotationPoint(60.75F, -38F, 9F);

        gunModel[377].addShapeBox(9F, -8F, -4F, 1, 4, 1, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[377].setRotationPoint(63.75F, -38F, 9F);

        gunModel[378].addShapeBox(9F, -8F, -4F, 1, 4, 1, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F); // Import
        gunModel[378].setRotationPoint(63.75F, -38F, 10F);

        gunModel[379].addShapeBox(9F, -8F, -4F, 1, 4, 1, 0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F); // Import
        gunModel[379].setRotationPoint(62.75F, -38F, 10.5F);

        gunModel[380].addShapeBox(9F, -8F, -4F, 1, 4, 1, 0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F); // Import
        gunModel[380].setRotationPoint(60.75F, -38F, 10.5F);

        gunModel[381].addShapeBox(9F, -8F, -4F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[381].setRotationPoint(61.75F, -38F, 10.5F);

        gunModel[382].addShapeBox(9F, -8F, -4F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[382].setRotationPoint(61.75F, -35F, 10.5F);

        gunModel[383].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F); // Import
        gunModel[383].setRotationPoint(62.75F, -37F, 10.5F);

        gunModel[384].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F); // Import
        gunModel[384].setRotationPoint(62.75F, -36F, 10.5F);

        gunModel[385].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F); // Import
        gunModel[385].setRotationPoint(61.75F, -37F, 10.5F);

        gunModel[386].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[386].setRotationPoint(61.75F, -36F, 10.5F);

        gunModel[387].addShapeBox(9F, -8F, -4F, 6, 5, 1, 0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.5F, -1.37F, 0.0F, 0.5F, -1.37F, 0.0F, 0.0F, 1.0F, 0.0F); // Import
        gunModel[387].setRotationPoint(21F, -29F, 0F);

        gunModel[388].addShapeBox(9F, -8F, -4F, 6, 1, 1, 0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[388].setRotationPoint(21F, -30F, -0.5F);

        gunModel[389].addShapeBox(9F, -8F, -4F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        gunModel[389].setRotationPoint(15F, -25F, 0F);

        gunModel[390].addShapeBox(9F, -8F, -4F, 3, 1, 1, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[390].setRotationPoint(15F, -27F, 0F);

        gunModel[391].addShapeBox(9F, -8F, -4F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[391].setRotationPoint(15F, -26F, 0F);

        gunModel[392].addShapeBox(9F, -8F, -4F, 43, 1, 2, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F); // Import
        gunModel[392].setRotationPoint(-21F, -44.75F, 1.65F);

        gunModel[393].addShapeBox(9F, -8F, -4F, 43, 1, 2, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[393].setRotationPoint(-21F, -43F, 1.65F);

        gunModel[394].addShapeBox(9F, -8F, -4F, 34, 1, 2, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F); // Import
        gunModel[394].setRotationPoint(-21F, -42F, 2.15F);

        gunModel[395].addShapeBox(9F, -8F, -4F, 134, 1, 2, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F); // Import
        gunModel[395].setRotationPoint(-26F, -42F, 3.15F);

        gunModel[396].addShapeBox(9F, -8F, -4F, 43, 2, 3, 0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F); // Import
        gunModel[396].setRotationPoint(-21F, -43F, 1.5F);

        gunModel[397].addShapeBox(9F, -8F, -4F, 13, 1, 2, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F); // Import
        gunModel[397].setRotationPoint(41F, -44.75F, 1.65F);

        gunModel[398].addShapeBox(9F, -8F, -4F, 54, 1, 2, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[398].setRotationPoint(54F, -43F, 1.65F);

        gunModel[399].addShapeBox(9F, -8F, -4F, 12, 2, 3, 0F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F); // Import
        gunModel[399].setRotationPoint(41F, -43F, 1.5F);

        gunModel[400].addShapeBox(9F, -8F, -4F, 41, 1, 6, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[400].setRotationPoint(-19F, -40.5F, -0.25F);

        gunModel[401].addShapeBox(9F, -8F, -4F, 43, 1, 5, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[401].setRotationPoint(-21F, -41.5F, 0.75F);

        gunModel[402].addShapeBox(9F, -8F, -4F, 11, 1, 4, 0F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[402].setRotationPoint(41F, -40.5F, -0.25F);

        gunModel[403].addShapeBox(9F, -8F, -4F, 11, 1, 3, 0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[403].setRotationPoint(41F, -41.5F, 0.75F);

        gunModel[404].addShapeBox(9F, -8F, -4F, 1, 1, 6, 0F, 0.0F, -0.5F, 0.15F, -1.0F, -0.5F, 0.15F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[404].setRotationPoint(22F, -40.5F, -0.25F);

        gunModel[405].addShapeBox(9F, -8F, -4F, 1, 1, 6, 0F, -1.0F, -0.5F, 0.15F, 0.0F, -0.5F, 0.15F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F); // Import
        gunModel[405].setRotationPoint(40F, -40.5F, -0.25F);

        gunModel[406].addShapeBox(9F, -8F, -4F, 1, 1, 2, 0F, 0.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F, -1.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F); // Import
        gunModel[406].setRotationPoint(22F, -44.25F, 1.65F);

        gunModel[407].addShapeBox(9F, -8F, -4F, 1, 1, 2, 0F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 1.0F, -0.5F, 0.25F, 1.0F, -1.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 1.0F, -1.0F, -0.5F, 1.0F); // Import
        gunModel[407].setRotationPoint(40F, -44.25F, 1.65F);

        gunModel[408].addShapeBox(9F, -8F, -4F, 8, 2, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[408].setRotationPoint(42F, -45.25F, 1.15F);

        gunModel[409].addShapeBox(9F, -8F, -4F, 5, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F); // Import
        gunModel[409].setRotationPoint(16F, -45F, 0.9F);

        gunModel[410].addShapeBox(9F, -8F, -4F, 4, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F); // Import
        gunModel[410].setRotationPoint(43.5F, -45F, 0.9F);

        gunModel[411].addShapeBox(9F, -8F, -4F, 7, 1, 1, 0F, 0.0F, -0.25F, -0.1F, 0.0F, -0.25F, -0.1F, 0.0F, -0.25F, -0.65F, 0.0F, -0.25F, -0.65F, 0.0F, 0.5F, 1.35F, 0.0F, 0.5F, 1.35F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F); // Import
        gunModel[411].setRotationPoint(14F, -41.75F, 0.9F);

        gunModel[412].addShapeBox(9F, -8F, -4F, 6, 12, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[412].setRotationPoint(-66.5F, -33.5F, 8.25F);

        gunModel[413].addShapeBox(9F, -8F, -4F, 6, 12, 1, 0F, 0.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F); // Import
        gunModel[413].setRotationPoint(-81.5F, -33.5F, 8.25F);

        gunModel[414].addShapeBox(9F, -8F, -4F, 2, 8, 1, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[414].setRotationPoint(-68.5F, -31.5F, 7.5F);

        gunModel[415].addShapeBox(9F, -8F, -4F, 2, 8, 1, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[415].setRotationPoint(-75.5F, -31.5F, 7.5F);

        gunModel[416].addShapeBox(9F, -8F, -4F, 9, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F); // Import
        gunModel[416].setRotationPoint(-75.5F, -33.5F, 9.25F);

        gunModel[417].addShapeBox(9F, -8F, -4F, 9, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F); // Import
        gunModel[417].setRotationPoint(-75.5F, -23.5F, 9.25F);

        gunModel[418].addShapeBox(9F, -8F, -4F, 9, 2, 2, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F); // Import
        gunModel[418].setRotationPoint(-75.5F, -23.5F, 6.5F);

        gunModel[419].addShapeBox(9F, -8F, -4F, 6, 1, 1, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[419].setRotationPoint(-66.5F, -22.5F, 9.25F);

        gunModel[420].addShapeBox(9F, -8F, -4F, 6, 1, 1, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[420].setRotationPoint(-66.5F, -33.5F, 9.25F);

        gunModel[421].addShapeBox(9F, -8F, -4F, 1, 2, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        gunModel[421].setRotationPoint(-61.5F, -28.5F, 9.25F);

        gunModel[422].addShapeBox(9F, -8F, -4F, 5, 1, 1, 0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 0.5F, 0.0F, 0.0F); // Import
        gunModel[422].setRotationPoint(-75F, -33F, 9.25F);

        gunModel[423].addShapeBox(9F, -8F, -4F, 3, 1, 1, 0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 2.0F); // Import
        gunModel[423].setRotationPoint(-69.5F, -33F, 9.25F);

        gunModel[424].addShapeBox(9F, -8F, -4F, 2, 1, 1, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[424].setRotationPoint(-71F, -33F, 11.25F);

        gunModel[425].addShapeBox(9F, -8F, -4F, 5, 1, 1, 0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 2.0F, 0.5F, 0.0F, 0.0F); // Import
        gunModel[425].setRotationPoint(-75F, -23F, 9.25F);

        gunModel[426].addShapeBox(9F, -8F, -4F, 3, 1, 1, 0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 2.0F); // Import
        gunModel[426].setRotationPoint(-69.5F, -23F, 9.25F);

        gunModel[427].addShapeBox(9F, -8F, -4F, 2, 1, 1, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import
        gunModel[427].setRotationPoint(-71F, -23F, 11.25F);

        gunModel[428].addShapeBox(9F, -8F, -4F, 6, 1, 1, 0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -5.0F, 0.0F); // Import
        gunModel[428].setRotationPoint(-81.5F, -22.5F, 9.25F);

        gunModel[429].addShapeBox(9F, -8F, -4F, 6, 1, 1, 0F, 0.0F, -5.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 5.0F, 0.0F); // Import
        gunModel[429].setRotationPoint(-81.5F, -33.5F, 9.25F);

        gunModel[430].addShapeBox(9F, -8F, -4F, 1, 2, 1, 0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[430].setRotationPoint(-81.5F, -28.5F, 9.25F);

        gunModel[431].addShapeBox(9F, -8F, -4F, 1, 9, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[431].setRotationPoint(-69.75F, -32F, 10.5F);

        gunModel[432].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[432].setRotationPoint(-62.5F, -28F, 9.25F);

        gunModel[433].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[433].setRotationPoint(-65.5F, -27F, 9.25F);

        gunModel[434].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[434].setRotationPoint(-64.5F, -29F, 9.25F);

        gunModel[435].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[435].setRotationPoint(-64.5F, -27F, 9.25F);

        gunModel[436].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[436].setRotationPoint(-65.5F, -29F, 9.25F);

        gunModel[437].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[437].setRotationPoint(-63.5F, -27F, 9.25F);

        gunModel[438].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[438].setRotationPoint(-63.5F, -29F, 9.25F);

        gunModel[439].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[439].setRotationPoint(-80.5F, -28F, 9.25F);

        gunModel[440].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        gunModel[440].setRotationPoint(-79.5F, -27F, 9.25F);

        gunModel[441].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[441].setRotationPoint(-78.5F, -29F, 9.25F);

        gunModel[442].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[442].setRotationPoint(-78.5F, -27F, 9.25F);

        gunModel[443].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import
        gunModel[443].setRotationPoint(-79.5F, -29F, 9.25F);

        gunModel[444].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[444].setRotationPoint(-77.5F, -27F, 9.25F);

        gunModel[445].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[445].setRotationPoint(-77.5F, -29F, 9.25F);

        gunModel[446].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[446].setRotationPoint(-76.5F, -28F, 9.25F);

        gunModel[447].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[447].setRotationPoint(-66.25F, -28F, 9.25F);

        gunModel[448].addShapeBox(9F, -8F, -4F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F); // Import
        gunModel[448].setRotationPoint(94F, -44.75F, 5.5F);

        gunModel[449].addShapeBox(9F, -8F, -4F, 2, 2, 3, 0F, -1.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F); // Import
        gunModel[449].setRotationPoint(15.5F, -19F, 2.5F);

        gunModel[450].addShapeBox(9F, -8F, -4F, 2, 3, 4, 0F, -1.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[450].setRotationPoint(14.5F, -17F, 2F);

        gunModel[451].addShapeBox(9F, -8F, -4F, 25, 2, 10, 0F, 1.4F, -0.5F, -0.5F, 1.0F, -0.5F, -0.5F, 1.0F, -0.5F, -0.5F, 1.4F, -0.5F, -0.5F, 1.1F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.1F, 0.0F, -0.25F); // Import
        gunModel[451].setRotationPoint(18.5F, -33F, -1F);

        gunModel[452].addShapeBox(9F, -8F, -4F, 1, 2, 7, 0F, 0.0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F); // Import
        gunModel[452].setRotationPoint(23F, -26.25F, 2F);

        gunModel[453].addShapeBox(9F, -8F, -4F, 1, 2, 7, 0F, 0.0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F); // Import
        gunModel[453].setRotationPoint(19.5F, -26.25F, 2F);

        gunModel[454].addShapeBox(9F, -8F, -4F, 15, 5, 10, 0F, -0.25F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, -4.0F, -0.25F, -0.75F, -4.0F, -0.25F, -0.25F, 0.0F, -0.25F); // Import
        gunModel[454].setRotationPoint(20.5F, -24F, -1F);

        gunModel[455].addShapeBox(9F, -8F, -4F, 11, 3, 10, 0F, -0.25F, -0.25F, -0.25F, -1.0F, -0.25F, -0.25F, -1.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.0F, -2.75F, -0.25F, -1.0F, -2.75F, -0.25F, -0.25F, -0.25F, -0.25F); // Import
        gunModel[455].setRotationPoint(34.5F, -25.75F, -1F);

        gunModel[456].addShapeBox(9F, -8F, -4F, 10, 3, 10, 0F, 0.0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F); // Import
        gunModel[456].setRotationPoint(34.75F, -29F, -1F);

        gunModel[457].addShapeBox(9F, -8F, -4F, 13, 1, 2, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[457].setRotationPoint(41F, -43F, 1.65F);

        gunModel[458].addShapeBox(9F, -8F, -4F, 134, 1, 2, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); // Import
        gunModel[458].setRotationPoint(-26F, -42F, 3.15F);

        gunModel[459].addShapeBox(9F, -8F, -4F, 90, 8, 14, 0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F); // Import
        gunModel[459].setRotationPoint(44.5F, -40F, -3F);

        gunModel[460].addShapeBox(9F, -8F, -4F, 90, 1, 11, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[460].setRotationPoint(44.5F, -41.5F, -1.5F);

        gunModel[461].addShapeBox(9F, -8F, -4F, 20, 1, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F, -0.55F, 0.0F, 0.25F, 0.0F); // Import
        gunModel[461].setRotationPoint(44.5F, -32F, -3.5F);

        gunModel[462].addShapeBox(9F, -8F, -4F, 64, 4, 11, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, -3.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[462].setRotationPoint(64.5F, -30F, -1.5F);

        gunModel[463].addShapeBox(9F, -8F, -4F, 20, 2, 14, 0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, -0.25F, -0.25F, 0.0F, 0.25F, -1.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.25F, -1.5F); // Import
        gunModel[463].setRotationPoint(44.5F, -28F, -3F);

        gunModel[464].addShapeBox(9F, -8F, -4F, 20, 3, 15, 0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F, -0.55F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.0F, -1.3F, 0.0F, 0.0F, -1.3F, 0.0F, 0.25F, -0.75F); // Import
        gunModel[464].setRotationPoint(44.5F, -31F, -3.5F);

        gunModel[465].addShapeBox(9F, -8F, -4F, 1, 8, 12, 0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[465].setRotationPoint(134.5F, -40F, -2F);

        gunModel[466].addShapeBox(9F, -8F, -4F, 6, 1, 9, 0F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, -1.65F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, -1.65F); // Import
        gunModel[466].setRotationPoint(128.5F, -30F, -0.5F);

        gunModel[467].addShapeBox(9F, -8F, -4F, 1, 2, 11, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.75F); // Import
        gunModel[467].setRotationPoint(134.5F, -32F, -1.5F);

        gunModel[468].addShapeBox(9F, -8F, -4F, 1, 1, 9, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.5F, -1.75F, 0.0F, -0.5F, -1.75F, 0.0F, -0.25F, -0.75F); // Import
        gunModel[468].setRotationPoint(134.5F, -30F, -0.5F);

        gunModel[469].addShapeBox(9F, -8F, -4F, 70, 1, 15, 0F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -0.8F); // Import
        gunModel[469].setRotationPoint(64.5F, -31F, -3.5F);

        gunModel[470].addShapeBox(9F, -8F, -4F, 1, 1, 15, 0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -1.05F, -1.0F, 0.0F, -1.05F, -1.0F, 0.0F, -1.05F, 0.0F, 0.0F, -1.05F); // Import
        gunModel[470].setRotationPoint(64.5F, -30F, -3.5F);

        gunModel[471].addShapeBox(9F, -8F, -4F, 2, 1, 9, 0F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, -2.0F, -0.5F, -0.7F, 0.0F, -0.5F, -0.7F, 0.0F, -0.5F, -0.7F, -2.0F, -0.5F, -0.7F); // Import
        gunModel[471].setRotationPoint(126.5F, -30F, -0.5F);

        gunModel[472].addShapeBox(9F, -8F, -4F, 1, 1, 10, 0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[472].setRotationPoint(134.5F, -41.5F, -1F);

        gunModel[473].addShapeBox(9F, -8F, -4F, 70, 1, 15, 0F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -0.55F); // Import
        gunModel[473].setRotationPoint(64.5F, -32F, -3.5F);

        gunModel[474].addShapeBox(9F, -8F, -4F, 5, 6, 8, 0F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F); // Import
        gunModel[474].setRotationPoint(-13F, -31F, 0F);

        gunModel[475].addShapeBox(9F, -8F, -4F, 2, 3, 8, 0F, 0.0F, 3.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 3.25F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[475].setRotationPoint(-13F, -22.25F, 0F);

        gunModel[476].addShapeBox(9F, -8F, -4F, 2, 1, 8, 0F, 0.0F, 0.5F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        gunModel[476].setRotationPoint(-10F, -20.25F, 0F);

        gunModel[477].addShapeBox(9F, -8F, -4F, 2, 2, 8, 0F, -0.5F, 1.25F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -0.5F, 1.25F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F); // Import
        gunModel[477].setRotationPoint(-12F, -21.25F, 0F);

        gunModel[478].addShapeBox(9F, -8F, -4F, 2, 5, 8, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, -1.0F, 0.25F); // Import
        gunModel[478].setRotationPoint(-10F, -25F, 0F);

        gunModel[479].addShapeBox(9F, -8F, -4F, 2, 3, 8, 0F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, -0.75F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, -0.5F, -0.75F, 0.25F); // Import
        gunModel[479].setRotationPoint(-12F, -25F, 0F);

        gunModel[480].addShapeBox(9F, -8F, -4F, 2, 1, 8, 0F, -0.75F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, -0.75F, -1.25F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F, 1.25F, 0.25F, -0.75F, -1.25F, 0.25F); // Import
        gunModel[480].setRotationPoint(-13.5F, -25F, 0F);

        gunModel[481].addShapeBox(9F, -8F, -4F, 1, 6, 8, 0F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, 0.0F, -0.75F, 0.25F); // Import
        gunModel[481].setRotationPoint(-13F, -31F, 0F);

        gunModel[482].addShapeBox(9F, -8F, -4F, 7, 12, 8, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F); // Import
        gunModel[482].setRotationPoint(-8F, -31F, 0F);

        gunModel[483].addShapeBox(9F, -8F, -4F, 12, 12, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F); // Import
        gunModel[483].setRotationPoint(-13F, -31F, 0.5F);

        gunModel[484].addShapeBox(9F, -8F, -4F, 7, 1, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F); // Import
        gunModel[484].setRotationPoint(-20F, -26.25F, 0.5F);

        gunModel[485].addShapeBox(9F, -8F, -4F, 19, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F); // Import
        gunModel[485].setRotationPoint(22F, -45.25F, 1.4F);

        gunModel[486].addShapeBox(9F, -8F, -4F, 2, 1, 1, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F); // Import
        gunModel[486].setRotationPoint(94F, -44.75F, 8.5F);

        gunModel[487].addShapeBox(9F, -8F, -4F, 3, 1, 2, 0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F); // Import
        gunModel[487].setRotationPoint(96F, -44.75F, 7.5F);

        gunModel[488].addShapeBox(9F, -8F, -4F, 1, 1, 2, 0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, -0.5F, 0.25F, -0.5F); // Import
        gunModel[488].setRotationPoint(99F, -44.75F, 7.5F);

        gunModel[489].addShapeBox(9F, -8F, -4F, 1, 1, 2, 0F, -0.5F, 0.75F, 0.0F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, -0.25F, -0.5F, 0.75F, -0.5F, -0.5F, 0.75F, 0.0F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, -0.25F, -0.5F, 0.75F, -0.5F); // Import
        gunModel[489].setRotationPoint(99.5F, -44.75F, 7.5F);

        gunModel[490].addShapeBox(9F, -8F, -4F, 2, 1, 1, 0F, -0.5F, 0.75F, 0.25F, -0.5F, 0.75F, 0.25F, -0.5F, 0.75F, -0.75F, -0.5F, 0.75F, -0.75F, -0.5F, 0.75F, 0.25F, -0.5F, 0.75F, 0.25F, -0.5F, 0.75F, -0.75F, -0.5F, 0.75F, -0.75F); // Import
        gunModel[490].setRotationPoint(101F, -44.75F, 7.5F);

        gunModel[491].addShapeBox(9F, -8F, -4F, 2, 1, 1, 0F, -0.5F, 0.75F, -0.25F, -0.5F, 0.75F, -0.25F, -0.5F, 0.75F, -0.25F, -0.5F, 0.75F, -0.25F, -0.5F, 0.75F, -0.25F, -0.5F, 0.75F, -0.25F, -0.5F, 0.75F, -0.25F, -0.5F, 0.75F, -0.25F); // Import
        gunModel[491].setRotationPoint(101F, -44.75F, 8.5F);

        gunModel[492].addShapeBox(9F, -8F, -4F, 1, 1, 2, 0F, -0.5F, 0.75F, 0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.75F, -0.5F, 0.75F, -0.25F, -0.5F, 0.75F, 0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.75F, -0.5F, 0.75F, -0.25F); // Import
        gunModel[492].setRotationPoint(103F, -44.75F, 7.5F);

        gunModel[493].addShapeBox(9F, -8F, -4F, 2, 1, 3, 0F, -0.5F, 0.75F, 0.25F, -0.5F, 0.75F, 0.25F, -0.5F, 0.75F, -1.25F, -0.5F, 0.75F, -1.25F, -0.5F, 0.75F, 0.25F, -0.5F, 0.75F, 0.25F, -0.5F, 0.75F, -1.25F, -0.5F, 0.75F, -1.25F); // Import
        gunModel[493].setRotationPoint(100F, -44.75F, 7.5F);

        gunModel[494].addShapeBox(9F, -8F, -4F, 3, 1, 3, 0F, -1.0F, 0.75F, 0.25F, -1.0F, 0.75F, 0.25F, -1.0F, 0.75F, -1.25F, -1.0F, 0.75F, -1.25F, -1.0F, 0.75F, 0.25F, -1.0F, 0.75F, 0.25F, -1.0F, 0.75F, -1.25F, -1.0F, 0.75F, -1.25F); // Import
        gunModel[494].setRotationPoint(101.5F, -44.75F, 7.5F);

        gunModel[495].addShapeBox(9F, -8F, -4F, 2, 1, 1, 0F, -0.5F, 0.75F, -1.0F, -1.5F, 0.75F, -1.0F, -1.25F, 0.75F, 0.25F, -0.5F, 0.75F, 0.25F, -0.5F, 0.75F, -1.0F, -1.5F, 0.75F, -1.0F, -1.25F, 0.75F, 0.25F, -0.5F, 0.75F, 0.25F); // Import
        gunModel[495].setRotationPoint(101F, -44.75F, 7.5F);

        gunModel[496].addShapeBox(9F, -8F, -4F, 2, 1, 1, 0F, -0.5F, 0.75F, 0.25F, -1.25F, 0.75F, 0.25F, -1.5F, 0.75F, -1.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, 0.25F, -1.25F, 0.75F, 0.25F, -1.5F, 0.75F, -1.0F, -0.5F, 0.75F, -1.0F); // Import
        gunModel[496].setRotationPoint(101F, -44.75F, 8F);

        gunModel[497].addShapeBox(9F, -8F, -4F, 2, 1, 1, 0F, -1.5F, 0.75F, -1.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, 0.25F, -1.25F, 0.75F, 0.25F, -1.5F, 0.75F, -1.0F, -0.5F, 0.75F, -1.0F, -0.5F, 0.75F, 0.25F, -1.25F, 0.75F, 0.25F); // Import
        gunModel[497].setRotationPoint(101F, -44.75F, 7.5F);

        gunModel[498].addShapeBox(9F, -8F, -4F, 2, 1, 1, 0F, -1.25F, 0.75F, 0.25F, -0.5F, 0.75F, 0.25F, -0.5F, 0.75F, -1.0F, -1.5F, 0.75F, -1.0F, -1.25F, 0.75F, 0.25F, -0.5F, 0.75F, 0.25F, -0.5F, 0.75F, -1.0F, -1.5F, 0.75F, -1.0F); // Import
        gunModel[498].setRotationPoint(101F, -44.75F, 8F);

        gunModel[499].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.0F, 0.25F, -0.25F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.25F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F); // Import
        gunModel[499].setRotationPoint(96F, -44.75F, 7F);
    }

    private void initgunModel_2() {
        gunModel[500] = new ModelRendererTurbo(this, 929, 137, textureX, textureY); // Import
        gunModel[501] = new ModelRendererTurbo(this, 633, 169, textureX, textureY); // Import
        gunModel[502] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Import
        gunModel[503] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Import
        gunModel[504] = new ModelRendererTurbo(this, 633, 153, textureX, textureY); // Import
        gunModel[505] = new ModelRendererTurbo(this, 537, 169, textureX, textureY); // Import
        gunModel[506] = new ModelRendererTurbo(this, 953, 137, textureX, textureY); // Import
        gunModel[507] = new ModelRendererTurbo(this, 457, 145, textureX, textureY); // Import
        gunModel[508] = new ModelRendererTurbo(this, 545, 145, textureX, textureY); // Import
        gunModel[509] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Import
        gunModel[510] = new ModelRendererTurbo(this, 649, 153, textureX, textureY); // Import
        gunModel[511] = new ModelRendererTurbo(this, 697, 153, textureX, textureY); // Import
        gunModel[512] = new ModelRendererTurbo(this, 1017, 161, textureX, textureY); // Import
        gunModel[513] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Import
        gunModel[514] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Import
        gunModel[515] = new ModelRendererTurbo(this, 409, 161, textureX, textureY); // Import
        gunModel[516] = new ModelRendererTurbo(this, 721, 177, textureX, textureY); // Import
        gunModel[517] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Import
        gunModel[518] = new ModelRendererTurbo(this, 417, 177, textureX, textureY); // Import
        gunModel[519] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Import
        gunModel[520] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Import
        gunModel[521] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Import
        gunModel[522] = new ModelRendererTurbo(this, 961, 145, textureX, textureY); // Import
        gunModel[523] = new ModelRendererTurbo(this, 561, 169, textureX, textureY); // Import
        gunModel[524] = new ModelRendererTurbo(this, 585, 169, textureX, textureY); // Import
        gunModel[525] = new ModelRendererTurbo(this, 17, 177, textureX, textureY); // Import
        gunModel[526] = new ModelRendererTurbo(this, 561, 153, textureX, textureY); // Import
        gunModel[527] = new ModelRendererTurbo(this, 617, 153, textureX, textureY); // Import
        gunModel[528] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Import
        gunModel[529] = new ModelRendererTurbo(this, 889, 161, textureX, textureY); // Import
        gunModel[530] = new ModelRendererTurbo(this, 649, 169, textureX, textureY); // Import
        gunModel[531] = new ModelRendererTurbo(this, 697, 169, textureX, textureY); // Import
        gunModel[532] = new ModelRendererTurbo(this, 1001, 169, textureX, textureY); // Import
        gunModel[533] = new ModelRendererTurbo(this, 1017, 169, textureX, textureY); // Import
        gunModel[534] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Import
        gunModel[535] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Import
        gunModel[536] = new ModelRendererTurbo(this, 489, 321, textureX, textureY); // Import
        gunModel[537] = new ModelRendererTurbo(this, 553, 321, textureX, textureY); // Import
        gunModel[538] = new ModelRendererTurbo(this, 225, 273, textureX, textureY); // Import
        gunModel[539] = new ModelRendererTurbo(this, 617, 321, textureX, textureY); // Import
        gunModel[540] = new ModelRendererTurbo(this, 1, 346, textureX, textureY); // Box 27
        gunModel[541] = new ModelRendererTurbo(this, 33, 346, textureX, textureY); // Box 27
        gunModel[542] = new ModelRendererTurbo(this, 41, 346, textureX, textureY); // Box 27
        gunModel[543] = new ModelRendererTurbo(this, 49, 346, textureX, textureY); // Box 27
        gunModel[544] = new ModelRendererTurbo(this, 57, 346, textureX, textureY); // Box 27
        gunModel[545] = new ModelRendererTurbo(this, 65, 346, textureX, textureY); // Box 27
        gunModel[546] = new ModelRendererTurbo(this, 105, 346, textureX, textureY); // Box 27
        gunModel[547] = new ModelRendererTurbo(this, 137, 346, textureX, textureY); // Box 27
        gunModel[548] = new ModelRendererTurbo(this, 145, 346, textureX, textureY); // Box 27
        gunModel[549] = new ModelRendererTurbo(this, 153, 346, textureX, textureY); // Box 27
        gunModel[550] = new ModelRendererTurbo(this, 161, 346, textureX, textureY); // Box 27
        gunModel[551] = new ModelRendererTurbo(this, 169, 346, textureX, textureY); // Box 27

        gunModel[500].addShapeBox(9F, -8F, -4F, 2, 1, 2, 0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F); // Import
        gunModel[500].setRotationPoint(94F, -44.75F, 6.5F);

        gunModel[501].addShapeBox(9F, -8F, -4F, 1, 3, 10, 0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[501].setRotationPoint(-1F, -27F, -1F);

        gunModel[502].addShapeBox(9F, -8F, -4F, 1, 3, 10, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[502].setRotationPoint(0F, -27F, -1F);

        gunModel[503].addShapeBox(9F, -8F, -4F, 1, 2, 10, 0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[503].setRotationPoint(1F, -26.5F, -1F);

        gunModel[504].addShapeBox(9F, -8F, -4F, 2, 3, 2, 0F, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[504].setRotationPoint(-3F, -27F, 7.5F);

        gunModel[505].addShapeBox(9F, -8F, -4F, 2, 2, 2, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F); // Import
        gunModel[505].setRotationPoint(-5F, -27F, 7.5F);

        gunModel[506].addShapeBox(9F, -8F, -4F, 1, 2, 2, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.25F); // Import
        gunModel[506].setRotationPoint(-6F, -27F, 7.5F);

        gunModel[507].addShapeBox(9F, -8F, -4F, 1, 2, 2, 0F, 0.0F, -1.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.25F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -1.0F); // Import
        gunModel[507].setRotationPoint(-7F, -27F, 7.5F);

        gunModel[508].addShapeBox(9F, -8F, -4F, 2, 2, 1, 0F, -1.25F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F); // Import
        gunModel[508].setRotationPoint(-2F, -23F, 7.5F);

        gunModel[509].addShapeBox(9F, -8F, -4F, 1, 2, 1, 0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[509].setRotationPoint(0F, -23F, 7.5F);

        gunModel[510].addShapeBox(9F, -8F, -4F, 2, 2, 1, 0F, -1.25F, -0.25F, 0.0F, 0.75F, -1.25F, 0.0F, 0.75F, -1.25F, 0.0F, -1.25F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, -0.5F, 0.0F); // Import
        gunModel[510].setRotationPoint(-4F, -24F, 7.5F);

        gunModel[511].addShapeBox(9F, -8F, -4F, 2, 2, 1, 0F, -2.5F, -0.25F, 0.0F, 1.25F, -1.25F, 0.0F, 1.25F, -1.25F, 0.0F, -2.5F, -0.25F, 0.0F, -1.25F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, -0.5F, 0.0F); // Import
        gunModel[511].setRotationPoint(-6F, -25F, 7.5F);

        gunModel[512].addShapeBox(9F, -8F, -4F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 1.5F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.25F, 1.5F, 0.0F); // Import
        gunModel[512].setRotationPoint(-5F, -27F, 7.5F);

        gunModel[513].addShapeBox(9F, -8F, -4F, 2, 1, 1, 0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[513].setRotationPoint(-5F, -28F, 7.5F);

        gunModel[514].addShapeBox(9F, -8F, -4F, 2, 1, 1, 0F, -1.25F, 0.5F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F); // Import
        gunModel[514].setRotationPoint(-4F, -29F, 7.5F);

        gunModel[515].addShapeBox(9F, -8F, -4F, 2, 1, 1, 0F, -1.25F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F); // Import
        gunModel[515].setRotationPoint(-3.25F, -29.75F, 7.5F);

        gunModel[516].addShapeBox(9F, -8F, -4F, 21, 1, 4, 0F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 1.0F, -0.5F, -0.25F); // Import
        gunModel[516].setRotationPoint(22F, -30.75F, 5.25F);

        gunModel[517].addShapeBox(9F, -8F, -4F, 1, 3, 4, 0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[517].setRotationPoint(42.5F, -30.25F, 5.25F);

        gunModel[518].addShapeBox(9F, -8F, -4F, 1, 6, 4, 0F, -17.5F, 0.0F, -0.25F, 17.5F, 0.0F, -0.25F, 17.5F, 0.0F, -0.25F, -17.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[518].setRotationPoint(24.5F, -27.25F, 5.25F);

        gunModel[519].addShapeBox(9F, -8F, -4F, 1, 1, 4, 0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, -1.0F, -0.25F); // Import
        gunModel[519].setRotationPoint(42F, -30.25F, 5.25F);

        gunModel[520].addShapeBox(9F, -8F, -4F, 1, 1, 4, 0F, 0.0F, -1.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[520].setRotationPoint(42F, -28.25F, 5.25F);

        gunModel[521].addShapeBox(9F, -8F, -4F, 1, 3, 1, 0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F); // Import
        gunModel[521].setRotationPoint(21F, -30.25F, 8.25F);

        gunModel[522].addShapeBox(9F, -8F, -4F, 1, 2, 1, 0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F); // Import
        gunModel[522].setRotationPoint(21F, -23.5F, 8.25F);

        gunModel[523].addShapeBox(9F, -8F, -4F, 5, 1, 1, 0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        gunModel[523].setRotationPoint(21F, -21.75F, 8.25F);

        gunModel[524].addShapeBox(9F, -8F, -4F, 2, 3, 2, 0F, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F); // Import
        gunModel[524].setRotationPoint(-3F, -27F, -1.5F);

        gunModel[525].addShapeBox(9F, -8F, -4F, 2, 2, 2, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F); // Import
        gunModel[525].setRotationPoint(-5F, -27F, -1.5F);

        gunModel[526].addShapeBox(9F, -8F, -4F, 1, 2, 2, 0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F); // Import
        gunModel[526].setRotationPoint(-6F, -27F, -1.5F);

        gunModel[527].addShapeBox(9F, -8F, -4F, 1, 2, 2, 0F, 0.0F, -1.0F, -1.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        gunModel[527].setRotationPoint(-7F, -27F, -1.5F);

        gunModel[528].addShapeBox(9F, -8F, -4F, 2, 2, 1, 0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F); // Import
        gunModel[528].setRotationPoint(-2F, -23F, -0.5F);

        gunModel[529].addShapeBox(9F, -8F, -4F, 1, 2, 1, 0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[529].setRotationPoint(0F, -23F, -0.5F);

        gunModel[530].addShapeBox(9F, -8F, -4F, 2, 2, 1, 0F, -1.25F, -0.25F, 0.0F, 0.75F, -1.25F, 0.0F, 0.75F, -1.25F, 0.0F, -1.25F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, -0.5F, 0.0F); // Import
        gunModel[530].setRotationPoint(-4F, -24F, -0.5F);

        gunModel[531].addShapeBox(9F, -8F, -4F, 2, 2, 1, 0F, -2.5F, -0.25F, 0.0F, 1.25F, -1.25F, 0.0F, 1.25F, -1.25F, 0.0F, -2.5F, -0.25F, 0.0F, -1.25F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, -0.5F, 0.0F); // Import
        gunModel[531].setRotationPoint(-6F, -25F, -0.5F);

        gunModel[532].addShapeBox(9F, -8F, -4F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 1.5F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.25F, 1.5F, 0.0F); // Import
        gunModel[532].setRotationPoint(-5F, -27F, -0.5F);

        gunModel[533].addShapeBox(9F, -8F, -4F, 2, 1, 1, 0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        gunModel[533].setRotationPoint(-5F, -28F, -0.5F);

        gunModel[534].addShapeBox(9F, -8F, -4F, 2, 1, 1, 0F, -1.25F, 0.5F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -1.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F); // Import
        gunModel[534].setRotationPoint(-4F, -29F, -0.5F);

        gunModel[535].addShapeBox(9F, -8F, -4F, 2, 1, 1, 0F, -1.25F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F); // Import
        gunModel[535].setRotationPoint(-3.25F, -29.75F, -0.5F);

        gunModel[536].addShapeBox(0F, 0F, 0F, 30, 4, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, -1F, 0.0F); // Import
        gunModel[536].setRotationPoint(146.93F, -46F, 1F);

        gunModel[537].addShapeBox(0F, 0F, 0F, 30, 4, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[537].setRotationPoint(146.93F, -46F, -2F);

        gunModel[538].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[538].setRotationPoint(80.93F, -53F, -1F);

        gunModel[539].addShapeBox(0F, 0F, 0F, 30, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        gunModel[539].setRotationPoint(146.93F, -46F, -1F);

        gunModel[540].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
        gunModel[540].setRotationPoint(125F, -47F, 6F);

        gunModel[541].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 27
        gunModel[541].setRotationPoint(125F, -47F, 7F);

        gunModel[542].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 27
        gunModel[542].setRotationPoint(129F, -47F, 7F);

        gunModel[543].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 27
        gunModel[543].setRotationPoint(133F, -47F, 7F);

        gunModel[544].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 27
        gunModel[544].setRotationPoint(137F, -47F, 7F);

        gunModel[545].addShapeBox(0F, 0F, 0F, 14, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
        gunModel[545].setRotationPoint(125F, -46F, 4F);

        gunModel[546].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 27
        gunModel[546].setRotationPoint(125F, -47F, -7F);

        gunModel[547].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
        gunModel[547].setRotationPoint(125F, -47F, -8F);

        gunModel[548].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
        gunModel[548].setRotationPoint(129F, -47F, -8F);

        gunModel[549].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
        gunModel[549].setRotationPoint(133F, -47F, -8F);

        gunModel[550].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
        gunModel[550].setRotationPoint(137F, -47F, -8F);

        gunModel[551].addShapeBox(0F, 0F, 0F, 14, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
        gunModel[551].setRotationPoint(125F, -46F, -6F);
    }

    private void initdefaultBarrelModel_1() {
        defaultBarrelModel[0] = new ModelRendererTurbo(this, 233, 321, textureX, textureY); // Import
        defaultBarrelModel[1] = new ModelRendererTurbo(this, 249, 321, textureX, textureY); // Import
        defaultBarrelModel[2] = new ModelRendererTurbo(this, 265, 321, textureX, textureY); // Import
        defaultBarrelModel[3] = new ModelRendererTurbo(this, 281, 321, textureX, textureY); // Import
        defaultBarrelModel[4] = new ModelRendererTurbo(this, 289, 321, textureX, textureY); // Import
        defaultBarrelModel[5] = new ModelRendererTurbo(this, 297, 321, textureX, textureY); // Import
        defaultBarrelModel[6] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import
        defaultBarrelModel[7] = new ModelRendererTurbo(this, 345, 321, textureX, textureY); // Import
        defaultBarrelModel[8] = new ModelRendererTurbo(this, 353, 321, textureX, textureY); // Import
        defaultBarrelModel[9] = new ModelRendererTurbo(this, 377, 321, textureX, textureY); // Import
        defaultBarrelModel[10] = new ModelRendererTurbo(this, 385, 321, textureX, textureY); // Import
        defaultBarrelModel[11] = new ModelRendererTurbo(this, 249, 321, textureX, textureY); // Import
        defaultBarrelModel[12] = new ModelRendererTurbo(this, 265, 321, textureX, textureY); // Import
        defaultBarrelModel[13] = new ModelRendererTurbo(this, 409, 321, textureX, textureY); // Import
        defaultBarrelModel[14] = new ModelRendererTurbo(this, 417, 321, textureX, textureY); // Import
        defaultBarrelModel[15] = new ModelRendererTurbo(this, 425, 321, textureX, textureY); // Import
        defaultBarrelModel[16] = new ModelRendererTurbo(this, 433, 321, textureX, textureY); // Import
        defaultBarrelModel[17] = new ModelRendererTurbo(this, 441, 321, textureX, textureY); // Import
        defaultBarrelModel[18] = new ModelRendererTurbo(this, 449, 321, textureX, textureY); // Import
        defaultBarrelModel[19] = new ModelRendererTurbo(this, 457, 321, textureX, textureY); // Import
        defaultBarrelModel[20] = new ModelRendererTurbo(this, 465, 321, textureX, textureY); // Import
        defaultBarrelModel[21] = new ModelRendererTurbo(this, 473, 321, textureX, textureY); // Import
        defaultBarrelModel[22] = new ModelRendererTurbo(this, 481, 321, textureX, textureY); // Import

        defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import
        defaultBarrelModel[0].setRotationPoint(176.93F, -45F, -3F);

        defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F); // Import
        defaultBarrelModel[1].setRotationPoint(176.93F, -43F, -3F);

        defaultBarrelModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import
        defaultBarrelModel[2].setRotationPoint(176.93F, -47F, -3F);

        defaultBarrelModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        defaultBarrelModel[3].setRotationPoint(177.93F, -45F, 2F);

        defaultBarrelModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        defaultBarrelModel[4].setRotationPoint(177.93F, -45F, -3F);

        defaultBarrelModel[5].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        defaultBarrelModel[5].setRotationPoint(177.93F, -47F, -1F);

        defaultBarrelModel[6].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        defaultBarrelModel[6].setRotationPoint(177.93F, -42F, -1F);

        defaultBarrelModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        defaultBarrelModel[7].setRotationPoint(177.93F, -47F, 2F);

        defaultBarrelModel[8].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F); // Import
        defaultBarrelModel[8].setRotationPoint(177.93F, -43F, 2F);

        defaultBarrelModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        defaultBarrelModel[9].setRotationPoint(177.93F, -47F, -3F);

        defaultBarrelModel[10].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F); // Import
        defaultBarrelModel[10].setRotationPoint(177.93F, -43F, -3F);

        defaultBarrelModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        defaultBarrelModel[11].setRotationPoint(180.93F, -45F, 2F);

        defaultBarrelModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        defaultBarrelModel[12].setRotationPoint(180.93F, -45F, -3F);

        defaultBarrelModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        defaultBarrelModel[13].setRotationPoint(180.93F, -47F, 2F);

        defaultBarrelModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        defaultBarrelModel[14].setRotationPoint(180.93F, -47F, -3F);

        defaultBarrelModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        defaultBarrelModel[15].setRotationPoint(184.93F, -45F, 2F);

        defaultBarrelModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        defaultBarrelModel[16].setRotationPoint(184.93F, -45F, -3F);

        defaultBarrelModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        defaultBarrelModel[17].setRotationPoint(184.93F, -47F, 2F);

        defaultBarrelModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        defaultBarrelModel[18].setRotationPoint(184.93F, -47F, -3F);

        defaultBarrelModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        defaultBarrelModel[19].setRotationPoint(182.93F, -45F, 2F);

        defaultBarrelModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        defaultBarrelModel[20].setRotationPoint(182.93F, -45F, -3F);

        defaultBarrelModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        defaultBarrelModel[21].setRotationPoint(182.93F, -47F, 2F);

        defaultBarrelModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
        defaultBarrelModel[22].setRotationPoint(182.93F, -47F, -3F);
    }

    private void initammoModel_1() {
        ammoModel[0] = new ModelRendererTurbo(this, 889, 161, textureX, textureY); // Import
        ammoModel[1] = new ModelRendererTurbo(this, 657, 153, textureX, textureY); // Import
        ammoModel[2] = new ModelRendererTurbo(this, 673, 153, textureX, textureY); // Import
        ammoModel[3] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Import
        ammoModel[4] = new ModelRendererTurbo(this, 817, 137, textureX, textureY); // Import
        ammoModel[5] = new ModelRendererTurbo(this, 697, 89, textureX, textureY); // Import
        ammoModel[6] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Import
        ammoModel[7] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Import
        ammoModel[8] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Import
        ammoModel[9] = new ModelRendererTurbo(this, 953, 161, textureX, textureY); // Import
        ammoModel[10] = new ModelRendererTurbo(this, 969, 161, textureX, textureY); // Import
        ammoModel[11] = new ModelRendererTurbo(this, 553, 145, textureX, textureY); // Import
        ammoModel[12] = new ModelRendererTurbo(this, 609, 145, textureX, textureY); // Import
        ammoModel[13] = new ModelRendererTurbo(this, 665, 97, textureX, textureY); // Import
        ammoModel[14] = new ModelRendererTurbo(this, 745, 97, textureX, textureY); // Import
        ammoModel[15] = new ModelRendererTurbo(this, 769, 97, textureX, textureY); // Import
        ammoModel[16] = new ModelRendererTurbo(this, 881, 97, textureX, textureY); // Import
        ammoModel[17] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Import
        ammoModel[18] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Import
        ammoModel[19] = new ModelRendererTurbo(this, 705, 137, textureX, textureY); // Import
        ammoModel[20] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Import
        ammoModel[21] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Import
        ammoModel[22] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Import
        ammoModel[23] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Import
        ammoModel[24] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Import
        ammoModel[25] = new ModelRendererTurbo(this, 513, 145, textureX, textureY); // Import
        ammoModel[26] = new ModelRendererTurbo(this, 529, 145, textureX, textureY); // Import
        ammoModel[27] = new ModelRendererTurbo(this, 873, 145, textureX, textureY); // Import
        ammoModel[28] = new ModelRendererTurbo(this, 1009, 145, textureX, textureY); // Import
        ammoModel[29] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Import
        ammoModel[30] = new ModelRendererTurbo(this, 713, 153, textureX, textureY); // Import
        ammoModel[31] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import
        ammoModel[32] = new ModelRendererTurbo(this, 393, 161, textureX, textureY); // Import
        ammoModel[33] = new ModelRendererTurbo(this, 873, 161, textureX, textureY); // Import
        ammoModel[34] = new ModelRendererTurbo(this, 1001, 161, textureX, textureY); // Import
        ammoModel[35] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Import
        ammoModel[36] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Import
        ammoModel[37] = new ModelRendererTurbo(this, 617, 177, textureX, textureY); // Import
        ammoModel[38] = new ModelRendererTurbo(this, 689, 137, textureX, textureY); // Import
        ammoModel[39] = new ModelRendererTurbo(this, 945, 153, textureX, textureY); // Import
        ammoModel[40] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Import
        ammoModel[41] = new ModelRendererTurbo(this, 649, 105, textureX, textureY); // Import
        ammoModel[42] = new ModelRendererTurbo(this, 937, 105, textureX, textureY); // Import
        ammoModel[43] = new ModelRendererTurbo(this, 625, 113, textureX, textureY); // Import

        ammoModel[0].addShapeBox(9F, -8F, -4F, 22, 36, 6, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -3.0F, 2.0F, 0.25F, 3.0F, -1.0F, 0.25F, 3.0F, -1.0F, 0.25F, -3.0F, 2.0F, 0.25F); // Import
        ammoModel[0].setRotationPoint(20.5F, -26F, 1F);

        ammoModel[1].addShapeBox(9F, -8F, -4F, 6, 36, 1, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -3.0F, -0.2F, -0.25F, 3.0F, -1.0F, -0.25F, 3.0F, -1.0F, -0.5F, -3.0F, -0.2F, -0.5F); // Import
        ammoModel[1].setRotationPoint(36.5F, -26F, 7F);

        ammoModel[2].addShapeBox(9F, -8F, -4F, 7, 38, 1, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -3.0F, -0.75F, -0.25F, 3.0F, -1.75F, -0.25F, 3.0F, -1.75F, -0.5F, -3.0F, -0.75F, -0.5F); // Import
        ammoModel[2].setRotationPoint(26.5F, -26F, 7F);

        ammoModel[3].addShapeBox(9F, -8F, -4F, 3, 3, 1, 0F, -2.8F, 0.0F, 0.0F, 2.85F, 0.0F, 0.0F, 2.85F, 0.0F, -0.5F, -2.8F, 0.0F, -0.5F, -3.0F, -0.75F, 0.0F, 3.0F, -1.2F, 0.0F, 3.0F, -1.2F, -0.5F, -3.0F, -0.75F, -0.5F); // Import
        ammoModel[3].setRotationPoint(33.5F, 8F, 7F);

        ammoModel[4].addShapeBox(9F, -8F, -4F, 3, 8, 1, 0F, -2.4F, 0.0F, 0.0F, 2.4F, 0.0F, 0.0F, 2.4F, 0.0F, -0.5F, -2.4F, 0.0F, -0.5F, -3.05F, 0.0F, 0.0F, 3.05F, 0.0F, 0.0F, 3.05F, 0.0F, -0.5F, -3.05F, 0.0F, -0.5F); // Import
        ammoModel[4].setRotationPoint(31.1F, -26F, 7F);

        ammoModel[5].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, -0.95F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.5F, -0.95F, 0.0F, -0.5F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F); // Import
        ammoModel[5].setRotationPoint(38.35F, 7F, 7F);

        ammoModel[6].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        ammoModel[6].setRotationPoint(36.35F, 7F, 7F);

        ammoModel[7].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.5F, 0.05F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F); // Import
        ammoModel[7].setRotationPoint(36.25F, -18F, 7F);

        ammoModel[8].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        ammoModel[8].setRotationPoint(34.25F, -18F, 7F);

        ammoModel[9].addShapeBox(9F, -8F, -4F, 6, 36, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -3.0F, -0.2F, 0.0F, 3.0F, -1.0F, 0.0F, 3.0F, -1.0F, -0.75F, -3.0F, -0.2F, -0.75F); // Import
        ammoModel[9].setRotationPoint(36.5F, -26F, 0.5F);

        ammoModel[10].addShapeBox(9F, -8F, -4F, 13, 38, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -3.0F, 0.0F, 0.0F, 3.0F, -1.75F, 0.0F, 3.0F, -1.75F, -0.75F, -3.0F, 0.0F, -0.75F); // Import
        ammoModel[10].setRotationPoint(20.5F, -26F, 0.5F);

        ammoModel[11].addShapeBox(9F, -8F, -4F, 3, 8, 1, 0F, -2.4F, 0.0F, 0.0F, 2.4F, 0.0F, 0.0F, 2.4F, 0.0F, -0.5F, -2.4F, 0.0F, -0.5F, -3.0F, -0.75F, 0.0F, 3.0F, -1.2F, 0.0F, 3.0F, -1.2F, -0.5F, -3.0F, -0.75F, -0.5F); // Import
        ammoModel[11].setRotationPoint(33.5F, 3F, 0.5F);

        ammoModel[12].addShapeBox(9F, -8F, -4F, 3, 8, 1, 0F, -2.4F, 0.0F, 0.0F, 2.4F, 0.0F, 0.0F, 2.4F, 0.0F, -0.5F, -2.4F, 0.0F, -0.5F, -3.05F, 0.0F, 0.0F, 3.05F, 0.0F, 0.0F, 3.05F, 0.0F, -0.5F, -3.05F, 0.0F, -0.5F); // Import
        ammoModel[12].setRotationPoint(31.1F, -26F, 0.5F);

        ammoModel[13].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, -0.95F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.5F, -0.95F, 0.0F, -0.5F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F); // Import
        ammoModel[13].setRotationPoint(37.9F, 2F, 0.5F);

        ammoModel[14].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        ammoModel[14].setRotationPoint(35.9F, 2F, 0.5F);

        ammoModel[15].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.5F, 0.05F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F); // Import
        ammoModel[15].setRotationPoint(36.25F, -18F, 0.5F);

        ammoModel[16].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        ammoModel[16].setRotationPoint(34.25F, -18F, 0.5F);

        ammoModel[17].addShapeBox(9F, -8F, -4F, 22, 1, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.25F, 0.0F, -3.75F, 0.25F, 0.0F, -3.75F, 0.25F, 0.0F, -0.75F, 0.25F); // Import
        ammoModel[17].setRotationPoint(23.5F, 12F, 0.5F);

        ammoModel[18].addShapeBox(9F, -8F, -4F, 22, 1, 7, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 3.0F, 0.25F, 0.0F, 3.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -3.75F, 0.25F, 0.0F, -3.75F, 0.25F, 0.0F, -0.75F, 0.25F); // Import
        ammoModel[18].setRotationPoint(23.5F, 12.25F, 0.5F);

        ammoModel[19].addShapeBox(9F, -8F, -4F, 5, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, -0.5F, 0.0F, -0.25F, -0.5F); // Import
        ammoModel[19].setRotationPoint(23F, -18F, 7.5F);

        ammoModel[20].addShapeBox(9F, -8F, -4F, 5, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, -0.5F, 0.0F, -0.25F, -0.5F); // Import
        ammoModel[20].setRotationPoint(23F, -18.5F, 7.5F);

        ammoModel[21].addShapeBox(9F, -8F, -4F, 5, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, -1.0F, 0.0F, -0.25F, -1.0F); // Import
        ammoModel[21].setRotationPoint(23F, -17.5F, 7.5F);

        ammoModel[22].addShapeBox(9F, -8F, -4F, 5, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, -0.5F, 0.0F, -0.25F, -0.5F); // Import
        ammoModel[22].setRotationPoint(29.5F, -19.75F, 7.5F);

        ammoModel[23].addShapeBox(9F, -8F, -4F, 5, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, -0.5F, 0.0F, -0.25F, -0.5F); // Import
        ammoModel[23].setRotationPoint(29.5F, -20.25F, 7.5F);

        ammoModel[24].addShapeBox(9F, -8F, -4F, 5, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, -1.0F, 0.0F, -0.25F, -1.0F); // Import
        ammoModel[24].setRotationPoint(29.5F, -19.25F, 7.5F);

        ammoModel[25].addShapeBox(9F, -8F, -4F, 5, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, -0.5F, 0.0F, -0.25F, -0.5F); // Import
        ammoModel[25].setRotationPoint(36F, -21.5F, 7.5F);

        ammoModel[26].addShapeBox(9F, -8F, -4F, 5, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, -0.5F, 0.0F, -0.25F, -0.5F); // Import
        ammoModel[26].setRotationPoint(36F, -22F, 7.5F);

        ammoModel[27].addShapeBox(9F, -8F, -4F, 5, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, -1.0F, 0.0F, -0.25F, -1.0F); // Import
        ammoModel[27].setRotationPoint(36F, -21F, 7.5F);

        ammoModel[28].addShapeBox(9F, -8F, -4F, 5, 1, 1, 0F, 0.0F, -0.25F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        ammoModel[28].setRotationPoint(23F, -18F, -0.5F);

        ammoModel[29].addShapeBox(9F, -8F, -4F, 5, 1, 1, 0F, 0.0F, -0.25F, -1.0F, 0.0F, 1.25F, -1.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        ammoModel[29].setRotationPoint(23F, -18.5F, -0.5F);

        ammoModel[30].addShapeBox(9F, -8F, -4F, 5, 1, 1, 0F, 0.0F, -0.25F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -1.75F, -1.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        ammoModel[30].setRotationPoint(23F, -17.5F, -0.5F);

        ammoModel[31].addShapeBox(9F, -8F, -4F, 5, 1, 1, 0F, 0.0F, -0.25F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        ammoModel[31].setRotationPoint(29.5F, -19.75F, -0.5F);

        ammoModel[32].addShapeBox(9F, -8F, -4F, 5, 1, 1, 0F, 0.0F, -0.25F, -1.0F, 0.0F, 1.25F, -1.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        ammoModel[32].setRotationPoint(29.5F, -20.25F, -0.5F);

        ammoModel[33].addShapeBox(9F, -8F, -4F, 5, 1, 1, 0F, 0.0F, -0.25F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -1.75F, -1.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        ammoModel[33].setRotationPoint(29.5F, -19.25F, -0.5F);

        ammoModel[34].addShapeBox(9F, -8F, -4F, 5, 1, 1, 0F, 0.0F, -0.25F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        ammoModel[34].setRotationPoint(36F, -21.5F, -0.5F);

        ammoModel[35].addShapeBox(9F, -8F, -4F, 5, 1, 1, 0F, 0.0F, -0.25F, -1.0F, 0.0F, 1.25F, -1.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        ammoModel[35].setRotationPoint(36F, -22F, -0.5F);

        ammoModel[36].addShapeBox(9F, -8F, -4F, 5, 1, 1, 0F, 0.0F, -0.25F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -1.75F, -1.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F); // Import
        ammoModel[36].setRotationPoint(36F, -21F, -0.5F);

        ammoModel[37].addShapeBox(9F, -8F, -4F, 4, 39, 1, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -3.0F, -0.75F, -0.25F, 3.0F, -1.25F, -0.25F, 3.0F, -1.25F, -0.5F, -3.0F, -0.75F, -0.5F); // Import
        ammoModel[37].setRotationPoint(20.5F, -26F, 7F);

        ammoModel[38].addShapeBox(9F, -8F, -4F, 2, 3, 1, 0F, -2.8F, 0.0F, 0.0F, 2.8F, 0.0F, 0.0F, 2.8F, 0.0F, -0.5F, -2.8F, 0.0F, -0.5F, -3.0F, -0.5F, 0.0F, 3.0F, -0.7F, 0.0F, 3.0F, -0.7F, -0.5F, -3.0F, -0.5F, -0.5F); // Import
        ammoModel[38].setRotationPoint(24.5F, 9F, 7F);

        ammoModel[39].addShapeBox(9F, -8F, -4F, 2, 9, 1, 0F, -2.8F, 0.0F, 0.0F, 2.8F, 0.0F, 0.0F, 2.8F, 0.0F, -0.5F, -2.8F, 0.0F, -0.5F, -3.4F, -0.5F, 0.0F, 3.4F, -0.7F, 0.0F, 3.4F, -0.7F, -0.5F, -3.4F, -0.5F, -0.5F); // Import
        ammoModel[39].setRotationPoint(21.75F, -26F, 7F);

        ammoModel[40].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.55F, -0.5F, 0.0F, 0.05F, -0.5F, 0.0F, 0.05F, -0.5F, -0.5F, -0.55F, -0.5F, -0.5F); // Import
        ammoModel[40].setRotationPoint(28.3F, 8.5F, 7F);

        ammoModel[41].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.05F, 0.0F, 0.0F, -1.05F, 0.0F, 0.0F, -1.05F, 0.0F, -0.5F, 0.05F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F); // Import
        ammoModel[41].setRotationPoint(27.3F, 8.5F, 7F);

        ammoModel[42].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, -0.55F, 0.0F, 0.0F, -0.05F, 0.05F, 0.0F, -0.05F, 0.05F, -0.5F, -0.55F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F); // Import
        ammoModel[42].setRotationPoint(26.2F, -17.65F, 7F);

        ammoModel[43].addShapeBox(9F, -8F, -4F, 1, 1, 1, 0F, 0.1F, 0.0F, 0.0F, -0.6F, 0.05F, 0.0F, -0.6F, 0.05F, -0.5F, 0.1F, 0.0F, -0.5F, 0.05F, -0.5F, 0.0F, -1.05F, -0.5F, 0.0F, -1.05F, -0.5F, -0.5F, 0.05F, -0.5F, -0.5F); // Import
        ammoModel[43].setRotationPoint(25.25F, -17.5F, 7F);
    }

    private void initslideModel_1() {
        slideModel[0] = new ModelRendererTurbo(this, 849, 129, textureX, textureY); // Import
        slideModel[1] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import
        slideModel[2] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Import
        slideModel[3] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Import
        slideModel[4] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Import
        slideModel[5] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Import

        slideModel[0].addShapeBox(9F, -8F, -4F, 19, 1, 5, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        slideModel[0].setRotationPoint(22F, -40.5F, 0F);

        slideModel[1].addShapeBox(9F, -8F, -4F, 19, 1, 4, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        slideModel[1].setRotationPoint(22F, -41.5F, 1F);

        slideModel[2].addShapeBox(9F, -8F, -4F, 19, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        slideModel[2].setRotationPoint(22F, -42.5F, 2F);

        slideModel[3].addShapeBox(9F, -8F, -4F, 19, 1, 3, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        slideModel[3].setRotationPoint(22F, -43.5F, 2F);

        slideModel[4].addShapeBox(9F, -8F, -4F, 19, 1, 3, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        slideModel[4].setRotationPoint(22F, -44.5F, 2F);

        slideModel[5].addShapeBox(9F, -8F, -4F, 19, 1, 3, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        slideModel[5].setRotationPoint(22F, -45.5F, 2F);
    }

    private void initattachmentScopeModel_1() {
        attachmentScopeModel[0] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Box 46
        attachmentScopeModel[1] = new ModelRendererTurbo(this, 33, 377, textureX, textureY); // Box 46
        attachmentScopeModel[2] = new ModelRendererTurbo(this, 57, 377, textureX, textureY); // Box 46
        attachmentScopeModel[3] = new ModelRendererTurbo(this, 81, 377, textureX, textureY); // Box 46
        attachmentScopeModel[4] = new ModelRendererTurbo(this, 97, 377, textureX, textureY); // Box 46
        attachmentScopeModel[5] = new ModelRendererTurbo(this, 193, 377, textureX, textureY); // Box 46
        attachmentScopeModel[6] = new ModelRendererTurbo(this, 217, 377, textureX, textureY); // Box 46
        attachmentScopeModel[7] = new ModelRendererTurbo(this, 233, 377, textureX, textureY); // Box 46
        attachmentScopeModel[8] = new ModelRendererTurbo(this, 265, 377, textureX, textureY); // Box 46
        attachmentScopeModel[9] = new ModelRendererTurbo(this, 289, 377, textureX, textureY); // Box 46
        attachmentScopeModel[10] = new ModelRendererTurbo(this, 313, 377, textureX, textureY); // Box 46
        attachmentScopeModel[11] = new ModelRendererTurbo(this, 337, 377, textureX, textureY); // Box 46
        attachmentScopeModel[12] = new ModelRendererTurbo(this, 361, 377, textureX, textureY); // Box 46
        attachmentScopeModel[13] = new ModelRendererTurbo(this, 377, 377, textureX, textureY); // Box 46
        attachmentScopeModel[14] = new ModelRendererTurbo(this, 25, 377, textureX, textureY); // Box 46
        attachmentScopeModel[15] = new ModelRendererTurbo(this, 257, 377, textureX, textureY); // Box 46
        attachmentScopeModel[16] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 46
        attachmentScopeModel[17] = new ModelRendererTurbo(this, 489, 377, textureX, textureY); // Box 46
        attachmentScopeModel[18] = new ModelRendererTurbo(this, 505, 377, textureX, textureY); // Box 46
        attachmentScopeModel[19] = new ModelRendererTurbo(this, 521, 377, textureX, textureY); // Box 46
        attachmentScopeModel[20] = new ModelRendererTurbo(this, 537, 377, textureX, textureY); // Box 46
        attachmentScopeModel[21] = new ModelRendererTurbo(this, 553, 377, textureX, textureY); // Box 46
        attachmentScopeModel[22] = new ModelRendererTurbo(this, 569, 377, textureX, textureY); // Box 46
        attachmentScopeModel[23] = new ModelRendererTurbo(this, 585, 377, textureX, textureY); // Box 46
        attachmentScopeModel[24] = new ModelRendererTurbo(this, 601, 377, textureX, textureY); // Box 46

        attachmentScopeModel[0].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
        attachmentScopeModel[0].setRotationPoint(6F, -53.5F, -4F);

        attachmentScopeModel[1].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 46
        attachmentScopeModel[1].setRotationPoint(6F, -51.5F, -4F);

        attachmentScopeModel[2].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
        attachmentScopeModel[2].setRotationPoint(6F, -54.5F, -4F);

        attachmentScopeModel[3].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
        attachmentScopeModel[3].setRotationPoint(6F, -54.5F, 3F);

        attachmentScopeModel[4].addShapeBox(0F, 0F, 0F, 42, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
        attachmentScopeModel[4].setRotationPoint(4F, -57.5F, -2F);

        attachmentScopeModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
        attachmentScopeModel[5].setRotationPoint(6F, -55.5F, 3F);

        attachmentScopeModel[6].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
        attachmentScopeModel[6].setRotationPoint(6F, -55.5F, -4F);

        attachmentScopeModel[7].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
        attachmentScopeModel[7].setRotationPoint(22F, -53.5F, -4F);

        attachmentScopeModel[8].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 46
        attachmentScopeModel[8].setRotationPoint(22F, -51.5F, -4F);

        attachmentScopeModel[9].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
        attachmentScopeModel[9].setRotationPoint(22F, -54.5F, -4F);

        attachmentScopeModel[10].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
        attachmentScopeModel[10].setRotationPoint(22F, -54.5F, 3F);

        attachmentScopeModel[11].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
        attachmentScopeModel[11].setRotationPoint(22F, -55.5F, 3F);

        attachmentScopeModel[12].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
        attachmentScopeModel[12].setRotationPoint(22F, -55.5F, -4F);

        attachmentScopeModel[13].addShapeBox(0F, 0F, 0F, 42, 1, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
        attachmentScopeModel[13].setRotationPoint(4F, -58.5F, -2F);

        attachmentScopeModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 46
        attachmentScopeModel[14].setRotationPoint(4F, -59.5F, -2F);

        attachmentScopeModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 46
        attachmentScopeModel[15].setRotationPoint(8F, -59.5F, -2F);

        attachmentScopeModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 46
        attachmentScopeModel[16].setRotationPoint(12F, -59.5F, -2F);

        attachmentScopeModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 46
        attachmentScopeModel[17].setRotationPoint(16F, -59.5F, -2F);

        attachmentScopeModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 46
        attachmentScopeModel[18].setRotationPoint(20F, -59.5F, -2F);

        attachmentScopeModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 46
        attachmentScopeModel[19].setRotationPoint(24F, -59.5F, -2F);

        attachmentScopeModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 46
        attachmentScopeModel[20].setRotationPoint(28F, -59.5F, -2F);

        attachmentScopeModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 46
        attachmentScopeModel[21].setRotationPoint(32F, -59.5F, -2F);

        attachmentScopeModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 46
        attachmentScopeModel[22].setRotationPoint(36F, -59.5F, -2F);

        attachmentScopeModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 46
        attachmentScopeModel[23].setRotationPoint(40F, -59.5F, -2F);

        attachmentScopeModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 46
        attachmentScopeModel[24].setRotationPoint(44F, -59.5F, -2F);
    }

    private void initattachmentGripModel_1() {
        attachmentGripModel[0] = new ModelRendererTurbo(this, 209, 346, textureX, textureY); // Box 39
        attachmentGripModel[1] = new ModelRendererTurbo(this, 297, 346, textureX, textureY); // Box 39
        attachmentGripModel[2] = new ModelRendererTurbo(this, 377, 346, textureX, textureY); // Box 39
        attachmentGripModel[3] = new ModelRendererTurbo(this, 409, 346, textureX, textureY); // Box 39
        attachmentGripModel[4] = new ModelRendererTurbo(this, 441, 346, textureX, textureY); // Box 39
        attachmentGripModel[5] = new ModelRendererTurbo(this, 473, 346, textureX, textureY); // Box 39

        attachmentGripModel[0].addShapeBox(0F, 0F, 0F, 35, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
        attachmentGripModel[0].setRotationPoint(85F, -34F, -3F);

        attachmentGripModel[1].addShapeBox(0F, 0F, 0F, 35, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
        attachmentGripModel[1].setRotationPoint(85F, -37F, -2F);

        attachmentGripModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 39
        attachmentGripModel[2].setRotationPoint(85F, -33F, -3F);

        attachmentGripModel[3].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 39
        attachmentGripModel[3].setRotationPoint(94F, -33F, -3F);

        attachmentGripModel[4].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 39
        attachmentGripModel[4].setRotationPoint(103F, -33F, -3F);

        attachmentGripModel[5].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 39

        attachmentGripModel[5].setRotationPoint(112F, -33F, -3F);
    }
}